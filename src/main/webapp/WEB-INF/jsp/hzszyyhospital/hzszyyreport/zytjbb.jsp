<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>转院汇总报表</title>
</head>

<body class="qjsrbb">
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          return false;
      }
    });

    function reload() {
      queryResult();
    }

    function getTabData() {
      var toolbar_v;
      var height = 0.96 * ($("#tabs", parent.document).height() - 28 - 24);
      $("#tabList").height(height);
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      var objParam = {
        'startdate': $("#startDate").val(),
        'enddate': $("#endDate").val()
      }
      function callBack(toolbar_v) {
        $('#tabList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}report/queryzytj_result.do',
          idField: 'sqlDes',
          loadMsg: '',
          toolbar: toolbar_v,
          columns: [
            [{
              field: 'sqlDes',
              width: getWidth(0.23),
              title: '所转医院'
            }, {
              field: 'zhuanycounts',
              title: '转院人数',
              width: getWidth(0.2),
              formatter: function (value, row, index) {
                return value + "人";
              }
            }]
          ],
          pagination: false,
          rownumbers: true,
          queryParams: objParam
        });
      }
    }
    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    $(function () {
      setTime();
      getTabData();
      $(".Wdate").keyup(function (event) {
        if (event.keyCode == 13) {
          queryResult();
        }
      });
    });

    function cmdexport() {
      var startTime = $('#startDate').val();
      var endTime = $('#endDate').val();
      if (publicFun.searchTime(startTime, endTime) === false) {
        return false;
      }
      _confirm('确定导出吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}report/zytjSubmit.do' }, { 'startdate': startTime, 'enddate': endTime }, function (res) {
          $.messager.alert('提示信息', res.resultInfo.message, 'success');
        })
      })
    }

    function cmdzyhzmx() {
      if (publicFun.searchTime($('#startDate').val(), $('#endDate').val()) === false) {
        return false;
      }
      parent.opentabwindow("转院患者明细", '${baseurl}zyyreport/queryzhuan.do?startdate=' + $('#startDate').val() + '&enddate=' + $('#endDate').val() + '&pageName=zyhzmx' + '&querytype=range_month', '2');
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM');
      $("#startDate").val(_today);
      $("#endDate").val(_today);
    };

    //查询方法
    function queryResult() {
      if (publicFun.searchTime($('#startDate').val(), $('#endDate').val()) === false) {
        return false;
      }
      getTabData();
    }

  </script>
  <form id="zytjbbform" name="zytjbbform" action="${baseurl}report/zytjSubmit.do" method="post">
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <input type="text" class="input-date Wdate" id="startDate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})">
            至
            <input type="text" class="input-date Wdate" id="endDate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})" />
            <span class="f-left">&nbsp;查询时间：</span>
          </li>
          <li class="m-l5">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <div class="queryTabs">
      <table id="tabList"></table>
    </div>
  </form>
</body>

</html>