<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>预检完善</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body style="overflow: hidden;">
  <div class="form clr">
    <p class="form-text">日期：</p>
    <input class="input-date Wdate" id="startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <p class="form-text">-</p>
    <input class="input-date Wdate" id="endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
  </div>
  <div class="jzjltab queryTabs m-l5">
    <table id="tabList"></table>
  </div>
  
  <div class="right-grp">
    <a class="easyui-linkbutton m-r5" iconCls="icon-cancel" onclick="closeAndRefresh()">关闭</a>
  </div>
  <script>
    function closeAndRefresh(){
      parent.getYjwsNum();
      parent.closemodalwindow();
    }

    function getDataGrid() {
      var _height = 0.975 * $(document).height() - 65;
      $("#tabList").height(_height);
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}hzszyyemg/toBeImproved_result.do',
        idField: 'rczId',
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
          'querytype':'improved'
        },
        loadMsg: '',
        columns: [[{
          field: 'emgSeq',
          title: '预检号 ',
          hidden: true,
        }, {
          field: 'emgDat',
          title: '预检时间 ',
          width: getWidth(0.14),
          formatter: function (value, row, index) {
            return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm:ss')
          }
        }, {
          field: 'cstNam',
          title: '姓名',
          width: getWidth(0.08)
        }, {
          field: 'cstSexCod',
          title: '性别',
          width: getWidth(0.04)
        }, {
          field: 'preDgnCod',
          title: '主诉',
          width: getWidth(0.3)
        },{
          field: 'emgDepCod',
          title: '分级',
          width: getWidth(0.06)
        },  {
          field: 'cstDspCod',
          title: '首诊状态',
          width: getWidth(0.08)
        }, {
          field: 'emgFkCod',
          title: '分科',
          width: getWidth(0.1),
        }, {
          field: 'preUsrNam',
          title: '分诊护士',
          width: getWidth(0.08),
        }, {
          field: 'opt1',
          title: '操作',
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return "<a href=javascript:cmdPrecheck()>挂号绑定</a>"
          }
        }]],
        rownumbers: true,
        toolbar: [],
        onDblClickRow: function (rowIndex, rowData) {
          cmdPrecheck();
        },
      });
    }
    
    function cmdPrecheck() {
      var rows = $('#tabList').datagrid('getSelected');
      if (GridUtils.checkChecked(rows)) {
      	parent.parent.opentabwindow(rows.cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + rows.emgSeq + "&th=" + new Date().getTime());
      	parent.closemodalwindow();
      }
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
      var _preWeek = new Date().getTime() - 24 * 60 * 60 * 1000;
      $("#startDate").val(publicFun.timeFormat(new Date(_preWeek), 'yyyy/MM/dd'));
      $("#endDate").val(_today);
    }

    $(document).resize(function () {
      var height = 0.975 * $(document).height() - 26;
      $("#tabList").height(height);
    })

    var isOpen = 1, _seqCurrent = '', currentRow = null;
    $(function () {
      // if (!parent.$('#qtsjSeq').val()) {
      //   setTime();
      // } else {
      //   _seqCurrent = parent.$('#qtsjSeq').val();
      // }
      setTime();
      getDataGrid();
    })
  </script>
</body>

</html>