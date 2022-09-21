<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>药疗医嘱</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="examinebody checkinfo">
  <script type="text/javascript">
    var isCurrentSelect = [];
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryTabList();
      }
    });

    function reload() {
      $('#checkList').datagrid('reload');
    }

    function splitYzInfo(row, type) {
      var objItemList = {
        highRiskList: [],
        orderStatusList: [],
        daInfoList: [],
        daDoseUnitList: [],
        numList: [],
        yfdwList: [],
        daWayStrList: [],
        daFreqList: []
      };
      var keySplitList = ['highRisk','orderStatus', 'daInfo', 'daDoseUnit', 'num', 'yfdw', 'daWayStr', 'daFreq'];
      for (var i = 0; i < keySplitList.length; i++) {
        var _item = keySplitList[i];
        if (row[_item]) {
          objItemList[_item + 'List'] = row[_item].split('|br');
        }
      }
      var rtnStr = '', _allLength = objItemList.daInfoList.length, otherRtnStr = '';
      for (var i = 0; i < _allLength; i++) {
        for (var j = 0; j < keySplitList.length; j++) {
          if (!objItemList[keySplitList[j] + 'List'][i]) {
            objItemList[keySplitList[j] + 'List'][i] = ''
          }
        }
        var _endSymbol = '';
        if (type) {
          _endSymbol = '、';
          var _ZfStr = '[作废]  ', _highRiskStr = '(危)  ';
        } else {
          _endSymbol = '<br/>';
          var _ZfStr = '<span style=\"color: red !important; font-weight: bold;\">[作废]</span>  ', _highRiskStr = '<span style=\"color: red !important;font-weight:bold;\">(危)</span>  ';
        }
        var otherRtnMsg = objItemList.daInfoList[i] + ' ' + objItemList.daFreqList[i] + _endSymbol;
        var _totalMsg = objItemList.daInfoList[i] + ' ' + objItemList.daDoseUnitList[i] + ' ' + objItemList.numList[i] + objItemList.yfdwList[i] + ' ' + objItemList.daWayStrList[i] + objItemList.daFreqList[i] + _endSymbol;
        if (objItemList.highRiskList[i] == '高危') {
          if (objItemList.orderStatusList[i] == '作废') {
            rtnStr += _ZfStr + _highRiskStr + _totalMsg;
            otherRtnStr += _ZfStr + _highRiskStr + otherRtnMsg;
          } else {
            rtnStr += _highRiskStr + _totalMsg
            otherRtnStr += _highRiskStr + otherRtnMsg;
          }
        } else {
          if (objItemList.orderStatusList[i] == '作废') {
            rtnStr += _ZfStr + _totalMsg
            otherRtnStr += _ZfStr + otherRtnMsg;
          } else {
            rtnStr += _totalMsg
            otherRtnStr += otherRtnMsg;
          }
        }
      }
      if (type) {
        if (row.daType === '药疗') {
          rtnStr = rtnStr.substring(0, rtnStr.length - 1) + '；';
          return rtnStr
        } else if (row.daType == '嘱托') {
          otherRtnStr = otherRtnStr.substring(0, otherRtnStr.length - 1) + '；';
          // return '<span style="color: rgb(42, 0, 255)">' + otherRtnStr + '<span>';
          return otherRtnStr;
        } else {
          otherRtnStr = otherRtnStr.substring(0, otherRtnStr.length - 1) + '；';
          return otherRtnStr;
        }
      } else {
        if (row.daType === '药疗') {
          return rtnStr
        } else if (row.daType == '嘱托') {
          return '<span style="color: rgb(42, 0, 255)">' + otherRtnStr + '<span>';
        } else {
          return otherRtnStr;
        }
      }
    }

    function splitNumInfo(row) {
      var valueList = [], unitList = [], rtnStr = '';
      if (row.num) {
        valueList = row.num.split('|br');
      }
      if (row.yfdw) {
        unitList = row.yfdw.split('|br');
      }
      for (var i = 0; i < valueList.length; i++) {
        if (!valueList[i]) {
          valueList[i] = ''
        }
        if (!unitList[i]) {
          unitList[i] = ''
        }
        rtnStr += valueList[i] + unitList[i] + '<br/>'
      }
      return rtnStr
    }

    function splitToDropLine(value) {
      if (value) {
        return value.replace(/\|br/g, '<br/>');
      }
      return value;
    }

    function initColumns() {
      //datagrid列定义
      var columns_v = [
        [{
          checkbox: true
        }, {
          field: 'daInfo',
          title: '医嘱内容 ',
          width: getWidth(0.42),
          formatter: function (value, row, index) {
            return splitYzInfo(row);
          }
        }, {
          field: 'drugSpec',
          title: '规格',
          width: getWidth(0.26),
          formatter: function (value, row) {
            return splitToDropLine(value)
          }
        }, {
          field: 'num',
          title: '总数量',
          width: getWidth(0.08),
          formatter: function (value, row) {
            return splitNumInfo(row);
          }
        }, {
          field: 'enterTime',
          title: '开立时间',
          width: getWidth(0.12),
          formatter: function (value, row) {
            return value
              ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
              : ''
          }
        }, {
          field: 'startDoct',
          title: '开立医生',
          width: getWidth(0.06)
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
        singleSelect: false,
        selectOnCheck: true,
        checkOnselect: true,
        url: '${baseurl}zjszyyhljld/cfxxInfoResult.do',
        queryParams: {
          'hspCfxxInfoCustom.mpi': currentBasicMsg.mpi,
          'startdate': $('#emg_startDate').val(),
          'enddate': $('#emg_endDate').val(),
          'queryType': 'nursing' //（nursing：药疗）
        },
        idField: 'daSeq',
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
        onLoadSuccess: function (res) {
          $("#checkList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
        },
        onSelect: function (_rowIndex, _rowData) {
          var _dataInfo = splitYzInfo(_rowData, 'html');
          if ($.inArray(_dataInfo, isCurrentSelect) < 0) {
            isCurrentSelect.push(_dataInfo)
          }
          $('#subfieldText').val(isCurrentSelect.join(''));
        },
        onUnselect: function (_rowIndex, _rowData) {
          var _dataInfo = splitYzInfo(_rowData, 'html');
          var _currentIdx = $.inArray(_dataInfo, isCurrentSelect);
          if (_currentIdx > -1) {
            isCurrentSelect.splice(_currentIdx, 1)
          }
          $('#subfieldText').val(isCurrentSelect.join(''));
        }
      });
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryTabList() {
      var start = $('#emg_startDate').val();
      var end = $('#emg_endDate').val();
      var _rtnFlg = publicFun.searchTime(start, end);
      if (_rtnFlg === false) {
        return;
      }
      getDataGrid();
    }

    function setTime(basicMsg) {
      if (basicMsg.emgDatStr) {
        $('#emg_startDate').val(basicMsg.emgDatStr)
      }
      if (basicMsg.sqlDat) {
        $('#emg_endDate').val(basicMsg.sqlDat)
      } else {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm')
        $('#emg_endDate').val(_today)
      }
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
        publicFun.alert('当前无导入数据，请确认是否已完成"药疗医嘱"');
      }
    }

    var currentBasicMsg = {};
    function getCurrentBasicMsg() {
      publicFun.httpServer({ url: '${baseurl}cfxx/getEmgInfData.do' }, { emgSeq: '${emgSeq}' }, function (res) {
        if (res.type == '1') {
          currentBasicMsg = res.sysdata.hspemginfCustom;
          setTime(currentBasicMsg);
          getDataGrid()
        }
      })
    }

    $(function () {
      getCurrentBasicMsg();
    });
  </script>
  <form id="jcbgForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-min-date input-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
      <p class="form-text">-</p>
      <input class="input-min-date input-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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