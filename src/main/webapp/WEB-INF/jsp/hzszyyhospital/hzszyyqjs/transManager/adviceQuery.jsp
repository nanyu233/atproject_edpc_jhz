<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <title>护士站-医嘱查询</title>
  <script>
    var _baseUrl = '${baseurl}';
  </script>
</head>

<body class="queryjzjl queryyzxx">
  <form>
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-min-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getDataGrid()" />
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getDataGrid()" />
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
    </div>
    <div class="m-l2 queryTabs">
      <table id="recordList"></table>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyqjs/transManager/listPrint/printAdviceQuery.jsp"></jsp:include>
  <script type="text/javascript">
    function reload() {
      $('#recordList').datagrid('reload')
    }

    function splitToDropLine(value) {
      if (value) {
        return value.replace(/\|br/g, '<br/>');
      }
      return value;
    }

    function getDataGrid() {
      var height = 0.975 * ($('#tabs', parent.parent.parent.document).height() - 28 - 29) - 57;
      $('#recordList').height(height)
      $('#recordList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        url: '${baseurl}cfxx/adviceQueryList.do',
        idField: 'daSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}first.do'
            })
          } else if(data.resultInfo && data.resultInfo.messageCode == '900'){
          	  publicFun.alert(data.resultInfo.message)
          }
          return data
        },
        queryParams: generateParam(),
        loadMsg: '',
        columns: getCol(),
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        toolbar: [
          {
            //工具栏
            id: 'print',
            text: '打印',
            iconCls: 'icon-print',
            handler: function () {
              printCurrentTab()
            },
          },
        ]
      })
    }
    
    function splitYzInfo (row) {
      var objItemList = {
        highRiskList: [],
        orderStatusList: [],
        daInfoList: [], 
        daDoseList: [], 
        daUnitList: [],
        daWayStrList: [], 
        daFreqList: []
      };
      var keySplitList = ['highRisk', 'orderStatus', 'daInfo', 'daDose', 'daUnit', 'daWayStr', 'daFreq'];
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
        var _totalMsg = objItemList.daInfoList[i] + ' ' + objItemList.daDoseList[i] + objItemList.daUnitList[i] + ' ' + objItemList.daWayStrList[i] + ' ' + objItemList.daFreqList[i] + '<br/>';
        var otherRtnMsg = objItemList.daInfoList[i] + ' ' + objItemList.daFreqList[i] + '<br/>';
        var _ZfStr = '<span style=\"color: red !important; font-weight: bold;\">[作废]</span>  ', _highRiskStr = '<span style=\"color: red !important;font-weight:bold;\">(危)</span>  ';
        if (objItemList.highRiskList[i] == '高危') {
          if (objItemList.orderStatusList[i] == '作废') {
            rtnStr += _ZfStr + _highRiskStr + _totalMsg
            otherRtnStr += _ZfStr + _highRiskStr + otherRtnMsg
          } else {
            rtnStr += _highRiskStr + _totalMsg
            otherRtnStr += _highRiskStr + otherRtnMsg
          }
        } else {
          if (objItemList.orderStatusList[i] == '作废') {
            rtnStr += _ZfStr + _totalMsg
            otherRtnStr += _ZfStr + otherRtnMsg
          } else {
            rtnStr += _totalMsg
            otherRtnStr += otherRtnMsg
          }
        }
      }
      if(row.daType === '药疗') {
        return rtnStr
      } else if (row.daType == '嘱托') {
        return '<span style="color: rgb(42, 0, 255)">' + otherRtnStr + '<span>';
      } else {
        return otherRtnStr;
      }
    }
    
    function splitNumInfo (row) {
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

    function getCol() {
      var columns_v = [
        [
          {
            field: 'startTime',
            title: '开始时间',
            sortable: true,
            width: getWidth(0.08),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'daType',
            title: '类型',
            sortable: true,
            width: getWidth(0.03)
          },
          {
            field: 'daInfo',
            title: '医嘱内容',
            sortable: true,
            width: getWidth(0.17),
            formatter: function (value, row) {
              return splitYzInfo(row);
            }
          },
          {
            field: 'drugSpec',
            title: '规格',
            sortable: true,
            width: getWidth(0.06),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'num',
            title: '总数量',
            sortable: true,
            width: getWidth(0.04),
            formatter: function (value, row) {
              return splitNumInfo(row)
            }
          },
          {
            field: 'enterTime',
            title: '开立时间',
            sortable: true,
            width: getWidth(0.08),
            formatter: function (value, row) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'startDoct',
            title: '开立医生',
            sortable: true,
            width: getWidth(0.05)
          },
          {
            field: 'hddat',
            title: '核对时间',
            sortable: true,
            width: getWidth(0.1)
          },
          {
            field: 'hdhsxm',
            title: '核对护士',
            sortable: true,
            width: getWidth(0.06)
          },
          {
            field: 'dispenseUserxmSecond',
            title: '配药核对',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'execTime',
            title: '执行时间',
            sortable: true,
            width: getWidth(0.1),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'execUserXm',
            title: '执行护士',
            sortable: true,
            width: getWidth(0.06),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'execUserxmSecond',
            title: '执行核对',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          }
        ]
      ]
      return columns_v
    }

    function generateParam() {
      var param = {
        'startdate': $('#emg_startDate').val(),
        'enddate': $('#emg_endDate').val(),
        'hspCfxxInfoCustom.mpi': currentBasicMsg.mpi
      }
      return param
    }

    function getWidth(proportion) {
      var width = $('body').width()
      return Math.round(proportion * width)
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

    var currentBasicMsg = {};
    function getCurrentBasicMsg () {
      publicFun.httpServer({ url: '${baseurl}cfxx/getEmgInfData.do' }, { emgSeq: parent._emgSeq }, function (res) {
        if (res.type == '1') {
          currentBasicMsg = res.sysdata.hspemginfCustom;
          setTime(currentBasicMsg);
          getDataGrid()
        }
      })
    }
    //加载datagrid
    $(function () {
      getCurrentBasicMsg()
    })
  </script>
</body>

</html>