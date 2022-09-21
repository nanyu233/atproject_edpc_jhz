<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- 引用jquery easy ui的js库及css -->
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/nav.js" type="text/javascript"></script>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <title>预检信息</title>
</head>

<body class="querydevice">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryRegister();
      }
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function reload() {
      $('#registeredList').datagrid('reload');
    }

    function generateCols() {
      var columns_v = [
        [{
          field: 'emgDat',
          title: '预检时间',
          width: getWidth(0.14),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : ''
          }
        }, {
          field: 'cstNam',
          title: '病人姓名 ',
          width: getWidth(0.08)
        }, {
          field: 'preDgnCod',
          title: '主诉症状',
          width: getWidth(0.16)
        }, {
          field: 'cstDspCod',
          title: '首诊状态',
          width: getWidth(0.12)
        }, {
          field: 'emgFkName',
          title: '分科',
          width: getWidth(0.08)
        }, {
          field: 'cstDspCodNameNew',
          title: '转归去向',
          width: getWidth(0.14),
          formatter: function (value, row, index) {
            //如果hsp_sql_inf只关联了1条
            if (row.firstsqlseq ==row.sqlSeq) {
              return "";
            } else if (row.cstDspCodNew == '2') { //如果是住院就展示科室，否则就展示转归状态
              return row.cstDepCodNew;
            } else if (row.cstDspCodNew == '13') { //如果是住院就展示科室，否则就展示转归状态
              return row.sqlDes;
            } else {
              return value;
            }
          }
        }, {
          field: 'sqlDat',
          title: '转归时间',
          width: getWidth(0.14),
          formatter: function (value, row, index) {
            //如果hsp_sql_inf只关联了1条
            if (row.firstsqlseq ==row.sqlSeq) {
              return "";
            } else {
              return value;
            }
          }
        }, {
          field: 'opt1',
          title: '操作',
          width: getWidth(0.08),
          styler: function (value, row, index) {
            return "text-align: center;";
          },
          formatter: function (value, row, index) {
            return "<a href=javascript:cmdPrecheck('" + row.zyh + "')>修改</a>"
          }
        }]
      ];
      return columns_v;
    }
    function getDataGrid() {
      /* 公司测试环境用，生产环境需要注释 */
      //     	mzrq = '2019-04-11';
      /* 公司测试环境用，生产环境需要注释 */
      var height = 0.94 * ($("body").height());
      $("#registeredList").height(height);
      $('#registeredList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        queryParams: {
          "hspemginfCustom.vstCad":'${vstCad}'
        },
        url: '${baseurl}hzszyyemg/findEmgInfForWeek_result.do',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: generateCols(),
        pagination: true,
        rownumbers: true,
        pageList: [15, 30, 50],
        toolbar: [],
        onDblClickRow: function (rowIndex, rowData) {
          cmdPrecheck()
        },
        rowStyler: function (index, row) {
          // 此处可以添加条件
          if (row.status == '0') {
            return 'color:red;';
          }
        }
      });
    }

    $(function () {
      getDataGrid();
      setTime();
    })

    //查询方法
    function queryRegister() {
      var formdata = $("#registerQueryForm").serializeJson();
      $('#registeredList').datagrid('load', formdata);
      $('#registeredList').datagrid('clearSelections');
    }

    //删除 统一用form
    function confirm() {
      var node = $('#registeredList').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        var vm = parent.vm;
        vm.patientMsg.vstCad = node.jzkh;
        vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        var zyh = vm.patientMsg.vstCad,
          zlkh = '';
        if (zyh === '') {
          zlkh = parent.XCXGetCardSB();
          if (zlkh === '') {
            return false
          }
        }
        parent.RegularlyGetHZXX(0, zyh, zlkh, "1");
        parent.closemodalwindow();
      }
    }

    function cmdPrecheck() {
      var rows = $('#registeredList').datagrid('getSelected');
      var _openBoxUrl = '${baseurl}hzszyyemg/xgjz.do?emgSeq=';
      parent.parent.opentabwindow(rows.cstNam + '-修改', _openBoxUrl + rows.emgSeq + '&th=' + new Date().getTime());
    }

	function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var oneweekdate = new Date()-6*24*3600*1000;
      var weekdate = publicFun.timeFormat(new Date(oneweekdate),'yyyy/MM/dd');
      $("#emg_startDate").val(weekdate);
      $("#emg_endDate").val(_today);
    };
  </script>
  <!-- html的静态布局 -->
  <form id="registerQueryForm">
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="small-date Wdate" id="emg_startDate" type="text" name="startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false})">
      <p class="form-text">-</p>
      <input class="small-date Wdate" id="emg_endDate" type="text" name="enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false})">
      <input class="hidden" name="hspemginfCustom.vstCad" type="text" value="${vstCad}">
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryRegister()">查询</a>
      <a href="javascript:;" class="easyui-linkbutton hidden" onclick="cmdPrecheck()">确定</a>
    </div>
  </form>
  <!-- 查询列表 -->
  <div class="list queryTabs">
    <table id="registeredList" style="height: 440px;"></table>
  </div>
</body>

</html>