<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>输血记录</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="examinebody checkinfo">
  <script type="text/javascript">
    var fieldArry = []; //定义一个数组准备存放记录的序号;
    var fieldString = '',
      indexs = '';
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryTabList();
      }
    });
    var _Tmpi = '',
        _cstNam = '';

    function reload() {
      $('#checkList').datagrid('reload');
    }

    function initColumns() {
      //datagrid列定义
      var columns_v = [
        [{
          checkbox: true
        }, {
          field: 'collator',
          title: '病人姓名 ',
          width: getWidth(0.08),
          formatter: function (value, row) {
            return _cstNam
          }
        }, {
          field: 'outpatientid',
          title: '病人ID ',
          width: getWidth(0.12)
        }, {
          field: 'writetime',
          title: '记录时间',
          width: getWidth(0.15),
          formatter: function (value, row) {
            return publicFun.timeFormat(value,"yyyy/MM/dd hh:mm:ss")
          }
        }, {
          field: 'stepname',
          title: '输血状态',
          width: getWidth(0.15)
        }, {
          field: 'nursrecord',
          title: '输血记录',
          width: getWidth(0.3)
        }, {
          field: 'bloodbagid',
          title: '血袋号',
          width: getWidth(0.1)
        }, {
          field: 'inspectionid',
          title: '交叉配血单号',
          width: getWidth(0.12)
        }, {
          field: 'temperature',
          title: '体温',
          width: getWidth(0.05)
        }, {
          field: 'xy1',
          title: '收缩压',
          width: getWidth(0.05)
        }, {
          field: 'xy2',
          title: '舒张压',
          width: getWidth(0.05)
        }, {
          field: 'heartrate',
          title: '心率',
          width: getWidth(0.05)
        }, {
          field: 'breathe',
          title: '呼吸',
          width: getWidth(0.05)
        }, {
          field: 'spo',
          title: '血氧饱和度',
          width: getWidth(0.08)
        }, {
          field: 'drippingspeed',
          title: '滴速',
          width: getWidth(0.05)
        }]
      ];
      return columns_v
    }


    function getDataGrid() {
      var totalList = [];
      var height = 0.65 * ($(window).height());
      $("#subfieldText").height(0.12 * ($(window).height()));
      $("#checkList").height(height);
      $('#checkList').datagrid({
        nowrap: false,
        striped: true,
        toolbar: '',
        singleSelect: false,
        selectOnCheck: true,
        checkOnselect: true,
        rownumbers: true,
        url: '${baseurl}zjszyyhljld/queryPdatransfusionrecord_result.do',
        queryParams: {
          'pdatransfusionrecordCustom.outpatientid': _Tmpi,
          'pdatransfusionrecordCustom.startdate': $('#emg_startDate').val(),
          'pdatransfusionrecordCustom.enddate': $('#emg_endDate').val()
        },
        idField: 'xh',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: initColumns(),
        pageList: [15, 30, 50],
        onCheck: function (rowIndex, rowData) {
          if (rowData.nursrecord == null || rowData.nursrecord == undefined) {
            rowData.nursrecord = '';
          }
          var _string = rowData.nursrecord;
          var currentData = $.inArray(_string, fieldArry);
          if (currentData == -1) {
            fieldArry.push(_string);
            fieldString += _string;
          }
          $('#subfieldText').val(fieldString);
        },
        onUncheck: function (rowIndex, rowData) {
          if (rowData.nursrecord == null || rowData.nursrecord == undefined) {
            rowData.nursrecord = '';
          }
          var _string = rowData.nursrecord;
          var currentData = $.inArray(_string, fieldArry);
          if (currentData != -1) {
            fieldArry.splice(currentData, 1);
          }
          fieldString = fieldString.split(_string).join("");
          $('#subfieldText').val(fieldString);
        }
        ,
        onCheckAll: function (rows) {
          var currentData = "",
            _allstring = "";
          for (var i = 0; i < rows.length; i++) {
            if (rows[i].nursrecord == null || rows[i].nursrecord == undefined) {
              rows[i].nursrecord = '';
            }
            _allstring = rows[i].nursrecord;
            currentData = $.inArray(_allstring, fieldArry)
            if (currentData == -1) {
              fieldArry.push(_allstring);
              fieldString += _allstring;
            }
          };
          $('#subfieldText').val(fieldString);
        },
        onUncheckAll: function (rows) {
          var currentData = "",
            _allstring = "";
          for (var i = 0; i < rows.length; i++) {
            if (rows[i].nursrecord == null || rows[i].nursrecord == undefined) {
              rows[i].nursrecord = '';
            }
            _allstring = rows[i].nursrecord;
            currentData = $.inArray(_allstring, fieldArry)
            if (currentData != -1) {
              fieldArry.splice(currentData, 1);
            }
          }
          fieldString = fieldArry.join("");
          $('#subfieldText').val(fieldString);
        }
      });
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryTabList() {
      getDataGrid();
    }

    function setTime() {
      publicFun.httpServer({ url: '${baseurl}cfxx/getEmgInfData.do' }, { emgSeq: '${emgSeq}' }, function (res) {
        if (res.type == '1') {
          var _startDate = publicFun.timeFormat(res.sysdata.hspemginfCustom.emgDat, "yyyy/MM/dd hh:mm:ss");
          $('#emg_startDate').val(_startDate);
          if('${zgsjDat}' != ''){
            var _endDate = '${zgsjDat}';
          }else{
            var _endDate = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss");
          }
          $('#emg_endDate').val(_endDate);
          _Tmpi = res.sysdata.hspemginfCustom.mpi;
          _cstNam = res.sysdata.hspemginfCustom.cstNam;
          getDataGrid()
        }
      })
    }
    /**
    * 导入
    **/
    function importField() {
      var fieldVal = $("#subfieldText").val();
      var xtpghz = parent.$("#xtpghznr").val();
      var valName = '${valName}';
      var xtpghzB = parent.$("#" + valName).val();
      if (fieldVal != '' && valName) {
        var totalVal = xtpghzB + fieldVal;
        parent.$("#" + valName).val(totalVal);
        parent.closemodalwindow();
      } else if (fieldVal != '') {
        var totalVal = xtpghz + fieldVal;
        parent.$("#xtpghznr").val(totalVal);
        parent.closemodalwindow();
      } else {
        publicFun.alert('当前无导入数据，请确认是否存在输血记录');
      }
    }

    $(function () {
      setTime();
    });
  </script>
  <form id="jcbgForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-sdate input-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      <p class="form-text">-</p>
      <input class="input-sdate input-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      <a class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTabList()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="list_table list_div" id="list_table">
    <table id="checkList"></table>
  </div>
  <textarea id="subfieldText" readonly unselectable='on'></textarea>
  <div class="center grp_btn">
    <a class="easyui-linkbutton" iconCls="icon-ok" onclick="importField()">导入并返回</a>
    <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
  </div>
</body>

</html>