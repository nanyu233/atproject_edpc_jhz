<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>检验信息弹出框</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="examinebody">
  <script type="text/javascript">
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var fieldArry = [],
      dadTitleList = [],
      isCurrentSelect = [];
    var fieldString = '',
      isSelectAll = '';

    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          jzjlquery()
      }
    });

    function reload() {
      $('#mainexaminelist').datagrid('reload');
      $('#examinelist').datagrid('reload');
    }

    function isRangeColor(row) {
      var _currentResult = '';
      if (row.result) {
        _currentResult = row.result.replace(/[^\d|.]/g, '');
      }
      if (row.lowerLimit && row.upperLimit) {
        if (parseFloat(_currentResult) > parseFloat(row.upperLimit)) {
          return "color:red;";
        } else if (parseFloat(_currentResult) < parseFloat(row.lowerLimit)) {
          return "color:#7cd89b";
        } else {
          return "";
        }
      } else {
        return "";
      }
    }
    
    /**
     * * 定义datagrid的内容field
     **/
    var columnse_v = [
      [{
        field: 'rownums',
        title: 'id',
        hidden: true
      }, {
        field: 'patientId',
        title: '预检号',
        width: getWidth(0.10),
        hidden: true
      }, {
        field: 'resultDateTime',
        title: '报告时间',
        width: getWidth(0.20),
        sortable: true,
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
        },
        hidden: true
      }, {
        field: 'examinaim',
        title: '样本类型',
        sortable: true,
        width: getWidth(0.15),
        hidden: true
      }, {
        field: 'reportItemName',
        title: '试验名称',
        sortable: true,
        width: getWidth(0.30),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'result',
        title: '分析结果',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'lowerLimit',
        title: '参考范围低限',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'upperLimit',
        title: '参考范围高限',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'units',
        title: '单位',
        sortable: true,
        width: getWidth(0.15),
        styler: function (value, row, index) {
          return isRangeColor(row);
        }
      }, {
        field: 'sign',
        title: '乘号',
        sortable: true,
        width: getWidth(0.10),
        hidden: true
      }, {
        field: 'sampleno',
        title: '样例号',
        sortable: true,
        width: getWidth(0.10),
        hidden: true
      }]
    ];

    //加载datagrid
    function abntable() {
      var height = 0.83 * ($(window).height());
      var width = 0.3 * ($(window).width());
      $("#mainexaminelist").height(height);
      $("#mainexaminelist").width(width);
      //datagrid列定义
      var columns_v = [
        [{
          checkbox: true
        }, {
          field: 'mainid',
          title: 'id',
          formatter: function (value, row, index) {
            return index + 1;
          },
          hidden: true
        }, {
          field: 'patientId',
          title: '预检号',
          width: getWidth(0.10),
          hidden: true
        }, {
          field: 'resultDateTime',
          title: '报告时间',
          width: getWidth(0.21),
          sortable: true,
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
          }
        }, {
          field: 'examinaim',
          title: '样本类型',
          sortable: true,
          width: getWidth(0.21),
          formatter: function (value, row, index) {
      		if(row.jylx){
      			value = '<font color="red">（'+row.jylxmc+'）</font>' + value;
      		}
            return value;
          },
        }, {
          field: 'sampleno',
          title: '样例号',
          sortable: true,
          width: getWidth(0.10),
          hidden: true
        }]
      ]

      setTime();
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      $('#mainexaminelist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: false,
        selectOnCheck: true,
        checkOnselect: true,
        url: '${baseurl}his/queryexamine_result.do',
        queryParams: {
          "vHemsJyjgCustom.patientId": '${MPI}',
          "vHemsJyjgCustom.startdate": startdate,
          "vHemsJyjgCustom.enddate": today
        },
        idField: 'mainid',
        columns: columns_v,
        onSelect: function (rowIndex, rowData) {
          var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
          getChildtbData(rowData.patientId,rowData.sampleno,resultDateTime)
          
          var _string =  resultDateTime +rowData.examinaim+'；';
          var currentData = $.inArray(_string, fieldArry);
          //首先判断当前要拼接的字符串在拼接数组中存不存在，不存在就push
          if (currentData == -1) {
            fieldArry.push(_string);
          }
          fieldString = fieldArry.join("");
          $('#subfieldText').val(fieldString);
        },
        onUnselect: function(_rowIndex, _rowData) {
          var _time = publicFun.timeFormat(_rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss")
          var _string =  _time +_rowData.examinaim+'；';
          var currentData = $.inArray(_string, fieldArry);
          if(currentData != -1){
            fieldArry.splice(currentData, 1);
          }
          fieldString = fieldArry.join("");
          $('#subfieldText').val(fieldString);
        },
        onSelectAll: function (rows) {
          fieldArry = [];
          for (var i = 0; i < rows.length; i++) {
            fieldArry.push(publicFun.timeFormat(rows[i].resultDateTime, "yyyy/MM/dd hh:mm:ss")+rows[i].examinaim+'；');
          }
          fieldString = fieldArry.join("");
          $('#subfieldText').val(fieldString);
        },
        onUnselectAll: function(){
          fieldArry = [];
          fieldString = '';
          $('#subfieldText').val('');
        }
      });
    };

    function getChildtbData(patientId,sampleno,resultDateTime){
      $('#examinelist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}his/queryexamineinfoqfy_result.do',
        queryParams: {
          "vHemsJyjgCustom.patientId": patientId,
          "vHemsJyjgCustom.sampleno": sampleno,
          "vHemsJyjgCustom.resultDateTime": resultDateTime
        },
        idField: 'rownums',
        columns: columnse_v,
        rownumbers: true
      });
    }
    function init() {
      abntable();
      var height = 0.67 * ($(window).height());
      var width = 0.68 * ($(window).width());
      $("#subfieldText").height(0.15 * ($(window).height()));
      $("#subfieldText").width(0.68 * ($(window).width()));
      $("#examinelist").height(height);
      $("#examinelist").width(width);
      $('#examinelist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: false,
        selectOnCheck: true,
        checkOnselect: true,
        idField: 'rownums',
        loadMsg: '',
        columns: columnse_v,
        title: "检验信息",
        rownumbers: true,
        onLoadSuccess: function () {
          //$("#examinelist").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
        }
      });
    }
    function getWidth(proportion) {
      var width = $("body").width() * 0.62;
      return Math.round(proportion * width);
    }
    //查询方法
    function queryexamine() {
      var formdata = $("#examineForm").serializeJson();
      $('#mainexaminelist').datagrid('load', formdata);
    }
    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
      var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
      if (_enddate == null || _enddate == '') {
        _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      }
      $("#emg_startdate").val(_startdate);
      $("#emg_enddate").val(_enddate);
    };
    /**
     * 导入
     **/
    function importField() {
      var fieldVal = $("#subfieldText").val();
      var xtpghz = parent.$("#xtpghznr").val();
      var valName = '${valName}';
      var xtpghzB = parent.$("#" + valName).val()
      if (fieldVal != '' && valName) {
        var totalVal = xtpghzB + fieldVal;
        parent.$("#" + valName).val(totalVal);
        parent.closemodalwindow();
      } else if (fieldVal != '') {
        var totalVal = xtpghz + fieldVal;
        parent.$("#xtpghznr").val(totalVal);
        parent.closemodalwindow();
      } else {
        publicFun.alert('当前无导入数据，请确认是否已完成"检验信息"');
      }
    }
    $(function () {
      init();
    });
  </script>
  <form id="examineForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <input type="hidden" id="patientId" name="vHemsJyjgCustom.patientId" value="${MPI}" />
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJyjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJyjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryexamine()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="mainDiv">
    <table id="mainexaminelist"></table>
  </div>
  <div class="subDiv">
    <table id="examinelist"></table>
  </div>
  <textarea id="subfieldText" readonly unselectable='on'></textarea>
  <div class="center grp_btn">
    <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="importField()">导入并返回</a>
    <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
  </div>
</body>

</html>