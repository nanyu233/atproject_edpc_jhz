<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>护士站-超时列表</title>
</head>

<body class="queryjzjl">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <script type="text/javascript">
    var _baseUrl;
    _baseUrl = "${baseurl}";
    _checkList = []; // 已选中的超时列表

    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          jzjlquery();
      }
    });

    function reload() {
      $('#jzjllist').datagrid('reload');
    }

    //加载datagrid
    $(function () {
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#jzjllist").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'checkbox',
          checkbox: true,
          width: getWidth(0.05)
        }, {
          field: 'emgJjd',
          title: '',
          width: getWidth(0.02),
          formatter: function (value, row, index) {
            return " ";
          },
          styler: function (value, row, index) {
            if (value == "I级") {
              return 'background:url(../images/hems/nurse/oneC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
            } else if (value == "II级") {
              return 'background:url(../images/hems/nurse/twoC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
            } else if (value == "III级") {
              return 'background:url(../images/hems/nurse/threeC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
            } else if (value == "IVa级" || value == "IVb级") {
              return 'background:url(../images/hems/nurse/fourC.png);background-repeat: no-repeat;background-position: 6px;    background-size: 12px 12px;color:transparent;';
            }
          }
        }, {
          field: 'emgDat',
          title: '收治日期',
          sortable: true,
          width: getWidth(0.1),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
          }
        }, {
          field: 'mpi',
          title: '病历号',
          sortable: true,
          width: getWidth(0.08)
        }, {
          field: 'cstNam',
          title: '病人姓名',
          sortable: true,
          width: getWidth(0.06)
        }, {
          field: 'cstSexCod',
          title: '性别',
          sortable: true,
          width: getWidth(0.03)
        }, {
          field: 'cstAge',
          title: '年龄',
          sortable: true,
          width: getWidth(0.03),
          formatter: function (value, row, index) {
            if (value != null && value != "") {
              return value + "" + row.cstAgeCod
            } else {
              return value;
            }
          }
        }, {
          field: 'preDgnCod',
          title: '主诉症状',
          sortable: true,
          width: getWidth(0.23)
        },/*  {
          field: 'date',
          title: '上次就诊时间',
          width: getWidth(0.1)
        }, */ {
          field: 'emgDepCod',
          title: '急诊分级',
          sortable: true,
          width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (value == "I级") {
              return "<div class=\"levelAbg\">I级</div>";
            } else if (value == "II级") {
              return "<div class=\"levelBbg\">II级</div>";
            } else if (value == "III级") {
              return "<div class=\"levelCbg\">III级</div>";
            } else if (value == "IVa级") {
              return "<div class=\"levelDbg\">IVa级</div>";
            } else if (value == "IVb级") {
              return "<div class=\"levelDbg\">IVb级</div>";
            }
          }
        }, {
          field: 'cstDspCod',
          title: '首诊状态',
          sortable: true,
          width: getWidth(0.05)
        }, {
          field: 'emgFkCod',
          title: '分科',
          width: getWidth(0.05),
          sortable: true
        }, {
          field: 'ghbz',
          title: '退挂号',
          width: getWidth(0.05),
          sortable: true,
          formatter: function (value, row, index) {
            if (value == 2) {
              return '<span style="color: red;">已退号</span>'
            } else {
              return ''
            }
          }
        }, {
          field: 'arvChlCod',
          title: '送入方式',
          sortable: true,
          width: getWidth(0.05)

        }, {
          field: 'grnChl',
          title: '绿色通道',
          sortable: true,
          width: getWidth(0.04)
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          sortable: true,
          width: getWidth(0.06)
        }]
      ];

      var today = $("#emg_startdate").val();
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      function callBack(toolbar_v) {
        $('#jzjllist').datagrid({
          nowrap: true,
          striped: true,
          url: '${baseurl}his/queryOutime.do',
          idField: 'emgSeq',
          pagination: true,
          rownumbers: true,
          pageList: [50, 70, 90],
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          loadMsg: '',
          columns: columns_v,
          rownumbers: true,
          queryParams: {
            queryFlag: '1',
          },
          toolbar: toolbar_v,
          onDblClickRow: function (rowIndex, rowData) {
            parent.opentabwindow(rowData.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + rowData.emgSeq + "&th=" + new Date().getTime());
          }
        });
      }
    });

    //清除
    function cmdclean() {
      _checkList = $('#jzjllist').datagrid('getChecked');
      if (_checkList && _checkList.length > 0) {
        createmodalwindow('清除超时患者', 650, 300, "${baseurl}his/forwardCleanHz.do?th=" + new Date().getTime());
      } else {
        publicFun.alert('请选择正确数据');
      }
    }

    //患者详情
    function cmdqueryhzxq() {
      var row = $('#jzjllist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hemsemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
      }
    }

    //修改/转归
    function cmdeditjzzyy() {
      var row = $('#jzjllist').datagrid('getSelections');
      if (GridUtils.checkChecked(row)) {
        row = row[0];
        parent.opentabwindow(row.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + row.emgSeq + "&th=" + new Date().getTime());
      }
    }

    function cmdcheckMsg() {
      var row = $('#jzjllist').datagrid('getSelections');
      if (!GridUtils.checkChecked(row)) {
        return
      }
      checkedObj = row[0];
      if (checkedObj.emgSeq === '') {
        return
      }
      parent.opentabwindow(row[0].cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do.do?emgSeq=" + row[0].emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
    }

    // 二次分诊
    function cmdTriageAgain () {
      var checkList = $('#jzjllist').datagrid('getChecked');
      var rowData = $('#jzjllist').datagrid('getSelected');
      if(checkList.length > 1){
        $.messager.alert('提示信息', '请选择单条数据', 'warning');
      }else{
        if (GridUtils.checkChecked(rowData)) {
          parent.opentabwindow(rowData.cstNam + '-二次分诊', "${baseurl}hzszyyemg/ecyj.do?emgSeq=" + rowData.emgSeq);
        }
      }
    }


    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function jzjlquery() {
      var formdata = $("#jzjlform").serializeJson();
      // if (formdata["hspemginfCustom.cstNam"] == "" && formdata["hspemginfCustom.vstCad"] == "") {
      //   formdata.queryFlag = '1';
      // }
      if (formdata["hspemginfCustom.cstNam"] == "" && formdata["hspemginfCustom.mpi"] == "") {
        formdata.queryFlag = '1';
      }
      $('#jzjllist').datagrid('load', formdata);
    }

  </script>
  <form id="jzjlform" action="${baseurl}hemsemg/delemgSubmit.do" method="post">
    <input type="hidden" id="deletezyy_id" name="emgSeq" />
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <div class="form clr">
      <p class="form-text">姓名：</p>
      <input id="emg_cstNam" type="text" name="hspemginfCustom.cstNam" class="input-wth">
      <!-- <p class="form-text">就诊卡：</p>
      <input id="emg_vstCad" type="text" name="hspemginfCustom.vstCad" class="input-wth"> -->
      <p class="form-text">病历号：</p>
      <input id="emg_mpi" type="text" name="hspemginfCustom.mpi" class="input-wth"> 
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="jzjlquery()">查询</a>
    </div>
    <div class="jzjltab queryTabs">
      <table id="jzjllist"></table>
    </div>

  </form>

</body>

</html>