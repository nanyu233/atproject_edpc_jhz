<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>医嘱信息</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="examinebody">
  <script type="text/javascript">
    function setLayout() {
      var windowsWidth = parent.$('#mainIfream').width(),
        windowsHeigt = parent.$('#mainIfream').height();
      $('#jcbglist').height(windowsHeigt - 87);
    }
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryjcbg();
      }
    });

    function reload() {
      $('#jcbglist').datagrid('reload');
    }

    function splitToDropLine(value) {
      if (value) {
        return value.replace(/\|br/g, '<br/>');
      }
      return value;
    }

    function init() {
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 16);
      $("#jcbglist").height(height - 5);
      $('#jcbglist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        rownumbers: true,
        title: "",
        url: '${baseurl}his/querycfxx_result.do',
        queryParams: {
          // "hspDocadviceInfCustom.vstCad": '${vstCad}',
          "startdate": startdate,
          "enddate": today,
          "hspCfxxInfoCustom.mpi": '${mpi}'
        },
        idField: 'docadviceSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: [
          [{
            field: 'enterTime',
            title: '开立时间',
            align: 'center',
            width: getWidth(0.1),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm") : ""
            }
          },
          {
            field: 'daType',
            title: '类型',
            sortable: true,
            width: getWidth(0.04)
          },
          {
            field: 'daInfo',
            title: '医嘱内容',
            sortable: true,
            width: getWidth(0.35),
            formatter: function (value, row) {
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
          },
          {
            field: 'drugSpec',
            title: '规格',
            sortable: true,
            width: getWidth(0.08),
            formatter: function (value, row) {
              return splitToDropLine(value)
            }
          },
          {
            field: 'num',
            title: '总数量',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row) {
              // return splitToDropLine(value)
              var valueList = [], unitList = [], rtnStr = '';
              if (value) {
                valueList = value.split('|br');
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
          },
          {
            field: 'startTime',
            title: '开始时间',
            sortable: true,
            width: getWidth(0.12),
            hidden: true,
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
            width: getWidth(0.1),
            hidden: true
          },
          {
            field: 'hdhsxm',
            title: '核对护士',
            sortable: true,
            width: getWidth(0.06)
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
            hidden: true
          }]
        ],
        //pagination: true,
        //rownumbers: true,
        pageList: [15, 30, 50],
        onDblClickRow: function (rowIndex, rowData) {
          if (rowData['docadviceSeq'] == null) {
            $.messager.alert('提示信息', '该信息不允许修改', 'warning');
            return;
          }
          var openModalWindowName = '修改医嘱',
            openModalWindowUrl = '${baseurl}zyylqbl/toupdateyzxx.do?docadviceSeq=' + rowData['docadviceSeq'];
          createmodalwindow(openModalWindowName, 520, 300, openModalWindowUrl);
        }
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryjcbg() {
      var start = $('#emg_startdate').val();
      var end = $('#emg_enddate').val();
      if (publicFun.searchTime(start, end) === false) {
        return false;
      }
      var formdata = $("#jcbgForm").serializeJson();
      $('#jcbglist').datagrid('load', formdata);
    }

    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd hh:mm");
      var enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd hh:mm");
      if (enddate == null || enddate == '') {
        enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm");
      }
      $("#emg_startdate").val(_startdate);
      $("#emg_enddate").val(enddate);
    };

    /***
    **   新增医嘱信息
    ***/
    function addNewAdvice() {
      var openModalWindowName = '新增医嘱',
        openModalWindowUrl = '${baseurl}zyylqbl/toaddyzxx.do?vstCad=${vstCad}';
      createmodalwindow(openModalWindowName, 720, 500, openModalWindowUrl);
    }

    /***
    **   删除医嘱信息
    ***/
    function deletetab() {
      var checkedRows = $('#jcbglist').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        if (checkedRows['docadviceSeq'] == null) {
          $.messager.alert('提示信息', '该信息不允许删除', 'warning');
          return;
        }
        _confirm('确定删除该数据吗？', null, function () {
          $("#delete_id").val(checkedRows['docadviceSeq']);
          jquerySubByFId('deleteform', del_callback, null, "json");
        });
      }
    }

    //删除的回调函数
    function del_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        init();
      }
    }

    //修改
    function edittab() {
      var checkedRows = $('#jcbglist').datagrid('getSelected');
      if (checkedRows == null) {
        $.messager.alert('提示信息', '请选择一条数据', 'warning');
      } else {
        if (checkedRows['docadviceSeq'] == null) {
          $.messager.alert('提示信息', '该信息不允许修改', 'warning');
          return;
        }
        var openModalWindowName = '修改医嘱',
          openModalWindowUrl = '${baseurl}zyylqbl/toupdateyzxx.do?docadviceSeq=' + checkedRows['docadviceSeq'];
        createmodalwindow(openModalWindowName, 520, 300, openModalWindowUrl);
      }
    }
    $(function () {
      setLayout();
      setTime();
      $(window).resize(function () {
        init();
      });
      init();
    });
  </script>
  <form id="jcbgForm">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <%--<input type="hidden" id="kh" name="hspDocadviceInfCustom.vstCad" value="${vstCad}" />
    <input type="hidden" id="emgSeq" name="hspDocadviceInfCustom.emgSeq" value="${emgSeq}" />--%>
    <input type="hidden" id="mpi" name="hspCfxxInfoCustom.mpi" value="${mpi}"/>
    <div class="form clr">
      <p class="form-text" style="font-size:14px">日期：</p>
      <input class="input-min-date Wdate" id="emg_startdate" type="text" name="startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
      <p class="form-text">-</p>
      <input class="input-min-date Wdate" id="emg_enddate" type="text" name="enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryjcbg()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="list_table list_div" id="check_table">
    <table id="jcbglist"></table>
  </div>
  <form id="deleteform" action="${baseurl}zyylqbl/deleteyzxx.do" method="post">
    <input type="hidden" id="delete_id" name="hspDocadviceInfCustom.docadviceSeq" />
  </form>
  </script>
</body>

</html>