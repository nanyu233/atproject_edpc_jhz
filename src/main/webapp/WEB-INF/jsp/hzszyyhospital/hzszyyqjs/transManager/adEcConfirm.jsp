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
  <title>护士站-医嘱执行确认</title>
  <script>
    var _baseUrl = '${baseurl}',
      _username = '${sessionScope.activeUser.usrname}',
      _userNum = '${sessionScope.activeUser.usrno}';
  </script>
</head>

<body class="queryjzjl queryyzxx">
  <form>
    <div class="form clr">
      <p class="form-text">执行单日期：</p>
      <input class="input-min-date Wdate" id="emg_startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getDataGrid()" />
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,readOnly:true})"
        onchange="getDataGrid()" />
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="0" onchange="getDataGrid('clearCheck')" /> 待配药&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="1" checked="checked" onchange="getDataGrid('clearCheck')" />
          未执行&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="2" onchange="getDataGrid('clearCheck')" /> 已执行&nbsp;
        </p>
      </label>
      <label>
        <p class="form-text cursor-type">
          <input name="checkStatus" type="radio" value="" onchange="getDataGrid('clearCheck')" /> 全部&nbsp;
        </p>
      </label>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
    </div>
    <div class="m-l2 queryTabs">
      <table id="recordList"></table>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyqjs/transManager/listPrint/printAdEcConfirm.jsp"></jsp:include>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/editTab.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript">
   var _printTable = []; // 打印列表的数据
    
    function reload() {
      $('#recordList').datagrid('reload')
    }

    function toolBar() {
      var _zxdzt = $('input:radio[name="checkStatus"]:checked').val();
      if (_zxdzt === '0' || _zxdzt === 0) { // 待配药状态
        return [
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
      } else {
        return [
          {
            //工具栏
            id: 'add',
            text: '批量保存',
            iconCls: 'icon-ok',
            handler: function () {
              saveAll()
            },
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
      }
    }

    function getDataGrid(type) {
      var height = 0.975 * ($('#tabs', parent.parent.parent.document).height() - 28 - 29) - 57;
      $('#recordList').height(height)
      $('#recordList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: false,
        url: '${baseurl}cfxx/getAdviceExecList.do',
        idField: 'execSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = '${baseurl}first.do'
            })
          } else if(data.resultInfo && data.resultInfo.messageCode == '900'){
          	publicFun.alert(data.resultInfo.message)
          }
          for (var i = 0; i < data.rows.length; i++) {
            if (data.rows[i].execTime) {
              data.rows[i].execTime = publicFun.timeFormat(data.rows[i].execTime, 'yyyy/MM/dd hh:mm')
            }
          }
          return data
        },
        queryParams: generateParam(),
        loadMsg: '',
        columns: getCol(),
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        toolbar: toolBar(),
        // 鼠标单击某一行是开启该行的编辑状态
        onCheck: function (rowIndex, rowData) {
          if (rowData.zxdzt != '0') { // 除去待配药的都能改
            editRow(rowIndex, 'operateEdit', rowData.zxdzt)
          }
          $('.allBuddy').hide()
        },
        onUncheck: function (rowIndex, rowData) {
          $('#recordList').datagrid('cancelEdit', rowIndex)
        },
        onCheckAll: function () {
          var allRows = $('#recordList').datagrid('getRows');
          for (var i = 0; i < allRows.length; i++) {
            if (allRows[i].zxdzt != '0') {
              editRow(i, 'operateEdit', allRows[i].zxdzt)
              // $('#recordList').datagrid(i, 'operateEdit')
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
        loadFilter: function (data) {
          var dataRows = data.rows;
          if (dataRows.length > 0) {
            for (var i = 0; i < dataRows.length; i++) {
              if (dataRows[i].dispenseDate) {
                dataRows[i].dispenseDate = publicFun.timeFormat(dataRows[i].dispenseDate, 'yyyy/MM/dd hh:mm')
              }
            }
          }
          return data;
        },
        onLoadSuccess: function (data) {
          if (type === 'clearCheck') {
            $('#recordList').datagrid('clearSelections');
          }
          var dataRows = data.rows;
          if (dataRows.length > 0) {
            for (var i = 0; i < dataRows.length; i++) {
              if (dataRows[i].zxdzt === '0' ||  dataRows[i].zxdzt === 0) {
                $("#recordList").parent().find("div .datagrid-cell-check").children("input[type=\"checkbox\"]").eq(i).attr("style", "display:none;");
              }
            }
          }
          var _zxdzt = $('input:radio[name="checkStatus"]:checked').val();
          if (_zxdzt === '0' || _zxdzt === 0) {
            $("#recordList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
          }
        }
      })
    }
    
    function splitYzInfo (row) {
      var objItemList = {
        highRiskList: [],
        daInfoList: []
      };
      var keySplitList = ['highRisk', 'daInfo'];
      for (var i = 0; i < keySplitList.length; i++) {
        var _item = keySplitList[i];
        if (row[_item]) {
          objItemList[_item + 'List'] = row[_item].split('|br');
        }
      }
      var rtnStr = '', _allLength = objItemList.daInfoList.length;
      for (var i = 0; i < _allLength; i++) {
        for (var j = 0; j < keySplitList.length; j++) {
          if (!objItemList[keySplitList[j] + 'List'][i]) {
            objItemList[keySplitList[j] + 'List'][i] = ''
          }
        }
        var _totalMsg = objItemList.daInfoList[i] + '<br/>'
        if (objItemList.highRiskList[i] == '高危') {
          rtnStr += '<span style=\"color: red;font-weight:bold;\">(危)</span>  ' + _totalMsg
        } else {
          rtnStr += _totalMsg
        }
      }
      return rtnStr
    }
    
    function splitDaDose (row) {
      var valueList = [], unitList = [], rtnStr = '';
      if (row.daDose) {
        valueList = row.daDose.split('|br');
      }
      if (row.daUnit) {
        unitList = row.daUnit.split('|br');
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
    
    function printZt (value) {
      if (value === '0' || value === 0) {
        return '未打印'
      } else if (value === '1' || value === 1) {
        return '已打印'
      } else if (value === '2' || value === 2) {
        return '不打印'
      } else if (value === '') {
        return '全部'
      } else {
        return ''
      }
    }

    function getCol() {
      var columns_v = [
        [
          {
            checkbox: true,
            field: 'ck'
          },
          {
            field: 'isprint',
            title: '打印状态',
            width: getWidth(0.04),
            formatter: function (value, row, index) {
              return printZt(value)
            }
          },
          {
            field: 'zxdzt',
            title: '执行单状态',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row, index) {
              var _zxList = publicFun.getDict('EXEC_STATUS');
              for (var i = 0; i < _zxList.length; i++) {
                if (_zxList[i].infocode === value) {
                  return _zxList[i].info
                }
              }
            }
          },
          {
            field: 'zxddat',
            title: '开单时间',
            sortable: true,
            width: getWidth(0.09),
            formatter: function (value, row, index) {
              return value
                ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
                : ''
            }
          },
          {
            field: 'daInfo',
            title: '医嘱内容',
            sortable: true,
            width: getWidth(0.13),
            formatter: function (value, row) {
              return splitYzInfo(row)
            }
          },
          {
            field: 'daDose',
            title: '剂量',
            sortable: true,
            width: getWidth(0.04),
            formatter: function (value, row) {
              return splitDaDose(row)
            }
          },
          {
            field: 'daFreq',
            title: '频次',
            sortable: true,
            width: getWidth(0.05)
          },
          // {
          //   field: 'num',
          //   title: '数量',
          //   width: getWidth(0.03),
          //   formatter: function (value, row) {
          //     var valueList = [], unitList = [], rtnStr = '';
          //     if (value) {
          //       valueList = value.split('|br');
          //     }
          //     if (row.yfdw) {
          //       unitList = row.yfdw.split('|br');
          //     }
          //     for (var i = 0; i < valueList.length; i++) {
          //       rtnStr += valueList[i] + unitList[i] + '<br/>'
          //     }
          //     return rtnStr
          //   }
          // },
          {
            field: 'daWay',
            title: '给药方式',
            sortable: true,
            width: getWidth(0.04)
          },
          // {
          //   field: 'planTime',
          //   title: '计划执行时间',
          //   sortable: true,
          //   width: getWidth(0.1),
          //   formatter: function (value, row, index) {
          //     return value
          //       ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
          //       : ''
          //   }
          // },
          {
            field: 'dispenseDate',
            title: '配药时间',
            sortable: true,
            width: getWidth(0.09),
            editor: { type: 'nurseDatePyEdit'}
            // formatter: function (value, row, index) {
            //   return value
            //     ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm')
            //     : ''
            // }
          },
          {
            field: 'dispenseUserxm',
            title: '配药护士',
            sortable: true,
            width: getWidth(0.05)
          },
          {
            field: 'dispenseUserxmSecond',
            title: '配药核对',
            sortable: true,
            width: getWidth(0.05)
          },
          {
            field: 'execTime',
            title: '执行时间',
            sortable: true,
            width: getWidth(0.09),
            editor: { type: 'nurseDateEdit' }
          },
          {
            field: 'execUserxm',
            title: '执行护士',
            sortable: true,
            width: getWidth(0.05),
            editor: { type: 'checkNameEdit' }
          },
          {
            field: 'execUser',
            title: '执行护士工号',
            hidden: true,
            sortable: true,
            editor: { type: 'userNumEdit' }
          },
          {
            field: 'execUserxmSecond',
            title: '执行核对',
            sortable: true,
            width: getWidth(0.05),
            editor: { type: 'userNameEdit' }
          },
          {
            field: 'execUserSecond',
            title: '执行核对工号',
            sortable: true,
            width: getWidth(0.05),
            hidden: true,
            editor: { type: 'checkUserEdit' }
          },
          {
            field: 'remark',
            title: '备注',
            sortable: true,
            width: getWidth(0.04),
            editor: { type: 'checkUserEdit' }
          },
          {
            field: 'operate',
            title: '<font style="color:red">操作</font>',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.07),
            editor: { type: 'operateEdit' },
            formatter: function (value, row, index) {
              if (row.zxdzt === '0' || row.zxdzt === 0) { // 1: 待执行  5: 已结束输液 [原先] => 现在除了待配药都能改
                return ''
              } else {
                return "<span class='url-link'><a href=javascript:editRow('" + index + "','" + '' + "','" + row.zxdzt + "')>编辑</a></span> | <span class='url-link'><a href=javascript:;>保存</a></span>";
              }
            }
          }
        ],
      ];
      return columns_v;
    }

    function editRow(rowIndex, editType, zxdzt) {
      var editRows = $('#recordList').datagrid('getEditingRowIndexs');
      $('#recordList').datagrid('beginEdit', rowIndex);
      var ed = $('#recordList').datagrid('getEditors', rowIndex);
      if (zxdzt != '1') { // 不是待执行
        $('#recordList').datagrid('getEditor',{index: rowIndex, field:'dispenseDate'}).target.attr('disabled', true);
      }
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
          if (ed[i].type == 'userNameEdit') {
            $(ed[i].target)
              .unbind('click')
              .bind('click', function () {
                usrName = jQuery.extend(ed[i], { rowIndex: rowIndex })
                userCod = jQuery.extend(ed[i + 1], { rowIndex: rowIndex });
                $('.nurList').hide()
              })
          }
          if (ed[i].type == 'operateEdit') {
            $(".save", ed[i].target).unbind("click").bind("click", function () {
              saveAll(rowIndex)
            });
            if (editType == 'add') {
              $(".cancel", ed[i].target).html("取消").unbind("click").bind("click", function () {
                $("#recordList").datagrid('unselectRow', rowIndex);
                getDataGrid();
              });
            } else {
              $(".cancel", ed[i].target).unbind("click").bind("click", function () {
                $("#recordList").datagrid('unselectRow', rowIndex);
                getDataGrid();
              });
            }
          }
        })(i);
      }
    }
    //批量保存
    function saveAll(rowIndex) {
      var selectRow = $('#recordList').datagrid('getChecked');
      if (selectRow == null) {
        publicFun.alert('请选择数据');
        return
      }
      var postList = [];
      if (rowIndex !== '' && rowIndex != 'undefined' && rowIndex != null) {
        $('#recordList').datagrid('endEdit', rowIndex);
        var allRows = $("#recordList").datagrid("getRows");
        postList.push((allRows)[rowIndex]);
        saveData(postList, rowIndex)
      } else {
        var _allSelLth = 0;
        for (var i = 0; i < selectRow.length; i++) {
          if (selectRow[i].zxdzt === '0' || selectRow[i].zxdzt === 0) { // 1: 待执行  5: 已结束输液 [原先] => 现在除了待配药都能改
            _allSelLth++;
          }
        }
        if (_allSelLth == selectRow.length) {
          publicFun.alert('请选择正确的数据');
          return
        }
        _confirm('确定保存吗？', null, function () {
          var editRows = $('#recordList').datagrid('getEditingRowIndexs');
          var allRows = $("#recordList").datagrid("getRows");
          for (var i = 0; i < editRows.length; i++) {
            postList.push((allRows)[editRows[i]]);
          }
          for (var i = 0; i < allRows.length; i++) {
            $('#recordList').datagrid('endEdit', i);
          }
          saveData(postList);
          setTimeout(function () {
            $(".messager-body").window('close');
          }, 1000);
        });
      }
    }
    
    //共用保存方法
    function saveData(postList, rowIndex) {
      var paramsDate = [];
      for (var k in postList) {
        paramsDate[k] = postList[k]
      }
      for (var i = 0; i < paramsDate.length; i++) {
        if (paramsDate[i].dispenseDate) {
          paramsDate[i].dispenseDate = new Date(paramsDate[i].dispenseDate).getTime();
        }
      }
      var _riskFillFlg = true;
      for (var i = 0; i < postList.length; i++) {
        if (postList[i].zxdzt == 1) { // 待执行
          var _riskList = postList[i].highRisk.split('|br');
          for (var j = 0; j < _riskList.length; j++) {
            if (_riskList[j] == '高危') {
              if (postList[i].execUserxmSecond == null || postList[i].execUserxmSecond == '') {
                _riskFillFlg = false
              }
            }
          }
        }
      }
      if (!_riskFillFlg) {
        publicFun.alert('高危药品执行核对必填')
        return false;
      }
      publicFun.httpServer({ url: _baseUrl + 'cfxx/adviceExec.do', requestDataType: 'json' }, { 'execList': paramsDate }, function (res) {
        message_alert(res);
        if (res.resultInfo.type === 1) {
          setTimeout(function () {
            $(".messager-body").window('close');
            if (rowIndex != '' && rowIndex != 'undefined' && rowIndex != null) {
              $("#recordList").datagrid('unselectRow', rowIndex);
            } else {
              $('#recordList').datagrid('clearSelections');
            }
            getDataGrid();
          }, 500)
        }
      })
    }

    function generateParam() {
      var _zxdzt = $('input:radio[name="checkStatus"]:checked').val();
      var param = {
        'startdate': $('#emg_startDate').val(),
        'enddate': $('#emg_endDate').val(),
        'hspCfxxExecCustom.mpi': currentBasicMsg.mpi,
        'hspCfxxExecCustom.zxdzt': _zxdzt != '2' ? _zxdzt : '',
        'type': _zxdzt == '2' ? 'execRecord' : ''
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