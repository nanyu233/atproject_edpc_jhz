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
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <title>护士站-医嘱核对</title>
  <script>
    var _baseUrl = '${baseurl}',
      _username = '${sessionScope.activeUser.usrname}',
      _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body class="queryjzjl queryyzxx">
  <form>
    <div class="form clr">
      <p class="form-text">下单：</p>
      <input class="input-min-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="queryTab()" />
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="queryTab()" />
      <p class="form-text">&nbsp;状态：</p>
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="0" checked="checked" onchange="queryTab()" /> 待核对&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="1" onchange="queryTab()" /> 已核对&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="" onchange="queryTab()" /> 全部&nbsp;
        </p>
      </label>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTab()">查询</a>
    </div>
    <div class="m-l2 queryTabs">
      <table id="recordList"></table>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyqjs/transManager/listPrint/printDocAdcCheck.jsp"></jsp:include>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/editTab.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript">
    var _printTable = []; // 打印列表的数据
    function reload() {
      $('#recordList').datagrid('reload')
    }

    function getToolBar() {
      var _zxdzt = $('input:radio[name="checkStatus"]:checked').val();
      if (_zxdzt !== '1' && _zxdzt !== 1) {
        return [
          {
            //工具栏
            id: 'add',
            text: '核对',
            iconCls: 'icon-ok',
            handler: function () {
              _confirm('您确定核对选中数据吗？', null, function () {
                var _checkList = []
                var editRows = $('#recordList').datagrid('getEditingRowIndexs'),
                  allRows = $('#recordList').datagrid('getRows');
                for (var i = 0; i < editRows.length; i++) {
                  _checkList.push(allRows[editRows[i]])
                }
                if (_checkList && _checkList.length > 0) {
                  for (var i = 0; i < allRows.length; i++) {
                    $('#recordList').datagrid('endEdit', i);
                  }
                  publicFun.httpServer({ url: '${baseurl}cfxx/docAdcSubmit.do', requestDataType: 'json' },
                    { 'cfxxList': _checkList, 'mpi': currentBasicMsg.mpi, 'startdate': $('#emg_startDate').val(), 'enddate': $('#emg_endDate').val(), 'vstCad': currentBasicMsg.vstCad }, function (res) {
                      if (res.resultInfo.type == 1) {
                        alert_success('核对成功')
                        setTimeout(function () {
                          $(".messager-body").window('close');
                          queryTab();
                          $('#recordList').datagrid('clearChecked');
                        }, 800)
                      }
                      if (res.resultInfo.type == 0) {
                        alert_error(res.resultInfo.message);
                        return;
                      }
                    }
                  )
                } else {
                  publicFun.alert('请选择正确数据')
                }
              })
            }
          },
          {
            //工具栏
            id: 'print',
            text: '打印',
            iconCls: 'icon-print',
            handler: function () {
              printCurrentTab()
            }
          }
        ]
      } else {
        return [
          {
            //工具栏
            id: 'print',
            text: '打印',
            iconCls: 'icon-print',
            handler: function () {
              printCurrentTab()
            },
          }
        ]
      }
    }

    function getDataGrid() {
      var height = 0.975 * ($('#tabs', parent.parent.parent.document).height() - 28 - 29) - 57;
      $('#recordList').height(height)
      $('#recordList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: false,
        url: '${baseurl}cfxx/getCfxxDataAndProc.do',
        idField: 'daSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}first.do'
            })
          } else if (data.resultInfo && data.resultInfo.messageCode == '900') {
            publicFun.alert(data.resultInfo.message)
          }
          return data
        },
        queryParams: generateParam(),
        loadMsg: '',
        columns: getCol(),
        pagination: false,
        rownumbers: true,
        // pageList: [20, 30, 50],
        toolbar: getToolBar(),
        // 鼠标单击某一行是开启该行的编辑状态
        onCheck: function (rowIndex, rowData) {
          if (rowData.yzzt === '0' || rowData.yzzt === 0) {
            editRow(rowIndex, 'operateEdit')
          }
          $('.allBuddy').hide()
        },
        onUncheck: function (rowIndex, rowData) {
          $('#recordList').datagrid('cancelEdit', rowIndex)
        },
        onCheckAll: function () {
          var allRows = $('#recordList').datagrid('getRows')
          for (var i = 0; i < allRows.length; i++) {
            if (allRows[i].yzzt === '0' || allRows[i].yzzt === 0) {
              // $('#recordList').datagrid(i, 'operateEdit')
              editRow(i, 'operateEdit')
            }
          }
          $('.allBuddy').hide()
        },
        onUncheckAll: function () {
          var allRows = $('#recordList').datagrid('getRows')
          for (var i = 0; i < allRows.length; i++) {
            $('#recordList').datagrid('cancelEdit', i)
          }
          getDataGrid()
        },
        onLoadSuccess: function (data) {
          var dataRows = data.rows;
          _printTable = JSON.parse(JSON.stringify(dataRows));
          for (var i = 0; i < _printTable.length; i++) {
            var _row = _printTable[i];
            if (_row.yzzt !== '0' && _row.yzzt !== 0) {
              _row.yzzt = '已核对'
            } else {
              _row.yzzt = '待核对'
            }
            if (_row.startTime) {
              _row.startTime = publicFun.timeFormat(_row.startTime, 'yyyy/MM/dd hh:mm')
            }
            if (_row.enterTime) {
              _row.enterTime = publicFun.timeFormat(_row.enterTime, 'yyyy/MM/dd hh:mm')
            }
            _row.num = splitNumInfo(_row);
            _row.drugSpec = splitToDropLine(_row.drugSpec);
            _row.daInfo = splitYzInfo(_row);
          }
          if (dataRows.length > 0) {
            for (var i = 0; i < dataRows.length; i++) {
              if (dataRows[i].yzzt !== '0' && dataRows[i].yzzt !== 0) {
                $("#recordList").parent().find("div .datagrid-cell-check").children("input[type=\"checkbox\"]").eq(i).attr("style", "display:none;");
              }
            }
          }
          var _yzzt = $('input:radio[name="checkStatus"]:checked').val();
          if (_yzzt !== '0' && _yzzt !== 0) {
            $("#recordList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
          }
        }
      })
    }

    function splitToDropLine(value) {
      if (value) {
        return value.replace(/\|br/g, '<br/>');
      }
      return value;
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
      if (row.daType === '药疗') {
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
            checkbox: true,
            field: 'ck'
          },
          {
            field: 'yzzt',
            title: '状态',
            sortable: true,
            width: getWidth(0.04),
            formatter: function (value, row, index) {
              if (value !== '0' && value !== 0) {
                return '已核对'
              } else {
                return '<span style=\"color: red !important;\">待核对</span> '
              }
            }
          },
          {
            field: 'startTime',
            title: '开始时间',
            sortable: true,
            width: getWidth(0.1),
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
            width: getWidth(0.27),
            formatter: function (value, row) {
              return splitYzInfo(row);
            }
          },
          {
            field: 'drugSpec',
            title: '规格',
            sortable: true,
            width: getWidth(0.05),
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
              return splitNumInfo(row);
            }
          },
          {
            field: 'enterTime',
            title: '开立时间',
            sortable: true,
            width: getWidth(0.1),
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
            width: getWidth(0.06)
          },
          {
            field: 'hddat',
            title: '核对时间',
            sortable: true,
            width: getWidth(0.12),
            editor: { type: 'nurseDateEdit' }
          },
          {
            field: 'hdhsxm',
            title: '核对护士',
            sortable: true,
            width: getWidth(0.09),
            editor: { type: 'checkNameEdit' }
          },
          {
            field: 'hdhs',
            title: '核对护士工号',
            sortable: true,
            width: getWidth(0.04),
            editor: { type: 'userNumEdit' },
            hidden: true
          }
        ],
      ]
      return columns_v
    }

    function editRow(rowIndex, editType) {
      var editRows = $('#recordList').datagrid('getEditingRowIndexs')
      $('#recordList').datagrid('beginEdit', rowIndex)
      var ed = $('#recordList').datagrid('getEditors', rowIndex)
      for (var i = 0, len = ed.length; i < len; i++) {
        (function (i) {
          if (ed[i].type == 'checkNameEdit') {
            $(ed[i].target)
              .unbind('click')
              .bind('click', function () {
                checkName = jQuery.extend(ed[i], { rowIndex: rowIndex })
                checkCod = jQuery.extend(ed[i + 1], { rowIndex: rowIndex });
                $('.checkNurList').hide()
              })
          }
          if (ed[i].type == 'operateEdit') {
            $('.save', ed[i].target)
              .unbind('click')
              .bind('click', function () {
                // saveAll(rowIndex)
              })
          }
        })(i)
      }
    }

    function generateParam() {
      var param = {
        'hspCfxxInfoCustom.mpi': currentBasicMsg.mpi,
        'startdate': $('#emg_startDate').val(),
        'enddate': $('#emg_endDate').val(),
        'hspCfxxInfoCustom.yzzt': $('input:radio[name="checkStatus"]:checked').val() // (0:待核对，1:已核对，全部不传值)
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

    //查询方法
    function queryTab() {
      getDataGrid()
    }

    var currentBasicMsg = {};
    function getCurrentBasicMsg() {
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