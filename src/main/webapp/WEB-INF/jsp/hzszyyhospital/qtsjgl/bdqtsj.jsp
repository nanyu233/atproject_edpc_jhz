<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>群体事件绑定管理</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="queryjzjl" style="overflow: hidden;">
  <div class="form clr">
    <p class="form-text">日期：</p>
    <input class="input-date Wdate" id="startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <p class="form-text">-</p>
    <input class="input-date Wdate" id="endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
  </div>
  <div class="jzjltab queryTabs">
    <table id="tabList"></table>
  </div>
  <script>
    function getDataGrid() {
      var _height = 0.975 * $(document).height() - 26;
      $("#tabList").height(_height);
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}qtsjgl/queryqtsjgl_result.do',
        idField: 'qtsjSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        queryParams: {
          'startdate': $('#startDate').val(),
          'enddate': $('#endDate').val(),
          'hspQtsjglCustom.qtsjSeq': _seqCurrent
        },
        loadMsg: '',
        columns: [[{
          field: 'qtsjSeq',
          title: '编号 ',
          hidden: true,
        }, {
          field: 'qtsjDat',
          title: '发生时间 ',
          width: getWidth(0.11),
          formatter: function (value, row, index) {
            if (value) {
              return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd')
            }
          }
        }, {
          field: 'qtsjNam',
          title: '事件名称',
          width: getWidth(0.1)
        }, {
          field: 'qtsjType',
          title: '类型',
          width: getWidth(0.1)
        }, {
          field: 'adrr',
          title: '地点',
          width: getWidth(0.12)
        }, {
          field: 'jyjg',
          title: '简要经过',
          width: getWidth(0.26)
        }, {
          field: 'djdat',
          title: '记录时间',
          width: getWidth(0.11),
          formatter: function (value, row, index) {
            if (value) {
              return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd')
            }
          }
        }, {
          field: 'djrnam',
          title: '记录员',
          width: getWidth(0.08)
        }, {
          field: 'operation',
          title: '操作',
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            if (_seqCurrent) {
              return "<a href=javascript:cancelText() >取绑</a>";
            } else {
              return "<a href=javascript:assignText() >绑定</a>";
            }
          }
        }]],
        pagination: true,
        rownumbers: true,
        pageList: [10, 20, 30],
        toolbar: [],
        onLoadSuccess: function (res) {
          if (isOpen == 1) {
            onCheckVal(res.rows);
          }
          isOpen = 0;
        },
        onDblClickRow: function (rowIndex, rowData) {
          currentRow = rowData;
          assignText()
        },
        onClickRow: function (rowIndex, rowData) {
          currentRow = rowData;
        }
      });
    }

    function assignText () {
      var checkItem = currentRow;
      var _str = '';
      if (checkItem) {
        _str = checkItem.qtsjSeq
      } else {
        _str = ''
      }
      parent.$('#qtsjSeq').val(_str);
      parent.$('#massStartTime').val($('#startDate').val());
      parent.$('#massEndTime').val($('#endDate').val());
      if (_str) {
        parent.$('#qtsjFlg').val('1');
        parent.vm.patientMsg.qtsjFlg = '1';
        parent.$('.spChl-btn').addClass('active');
        parent.$('#massTitle').html('群体事件：');
        parent.$('#massText').html(checkItem.qtsjNam);
      } else {
        parent.$('#qtsjFlg').val('0');
        parent.vm.patientMsg.qtsjFlg = '0';
        parent.$('.spChl-btn').removeClass('active');
        parent.$('#massText').html('');
        parent.$('#massTitle').html('');
      }
      parent.closemodalwindow();
    }
    
    function cancelText () {
      $("#tabList").datagrid('clearSelections');
      setTime();
      _seqCurrent = '';
      parent.$('#qtsjSeq').val('');
      $('#tabList').datagrid('load', {
        'startdate': $('#startDate').val(),
        'enddate': $('#endDate').val()
      });
      parent.$('#qtsjFlg').val('0');
      parent.vm.patientMsg.qtsjFlg = '0';
      parent.$('.spChl-btn').removeClass('active');
      parent.$('#massText').html('');
      parent.$('#massTitle').html('');
    }

    function getWidth(proportion) {
      var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
      var width = '';
      if (userAgent.indexOf("Chrome") > -1) {
        width = $(document).width();
      } else {
        width = $(document).width() - 50;
      }
      return Math.round(proportion * width);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var _preWeek = new Date().getTime() - 24 * 7 * 60 * 60 * 1000;
      $("#startDate").val(publicFun.timeFormat(new Date(_preWeek), 'yyyy/MM/dd'));
      $("#endDate").val(_today);
    }

    $(document).resize(function () {
      var height = 0.975 * $(document).height() - 26;
      $("#tabList").height(height);
    })

    function onCheckVal (_allList) {
      setTimeout(function () {
        if (_seqCurrent) {
          for (var i = 0; i < _allList.length; i++) {
            if (_allList[i].qtsjSeq === _seqCurrent) {
              $("#tabList").datagrid('checkRow', i);
            }
          }
        }
      }, 100);
    }

    var isOpen = 1, _seqCurrent = '', currentRow = null;
    $(function () {
      if (!parent.$('#qtsjSeq').val()) {
        setTime();
      } else {
        _seqCurrent = parent.$('#qtsjSeq').val();
      }
      getDataGrid();
    })
  </script>
</body>

</html>