<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>非计划重返抢救室率</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
</head>

<body class="median">
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryResult()
      }
    });

    function reload() {
      queryResult();
    }

    function setLayPut () {
      var height = ($("#tabs", parent.document).height()) * 0.75;
      $("#container").height(height - 67);
      $("#tabList").height(height);
    }

    $(function () {
      setTime();
      setLayPut();
      queryResult();
      $(window).resize(function () {
        $('#tabList').datagrid('reload');
      });
    });

    function loadChart(chartDate, chartsType) {
      var series = [], categories = [];
      var serie = { data: [], name: '非计划重返抢救室率' };
      for (var i = 0; chartDate && i < chartDate.length; i++) {
        serie.data[i] = chartDate[i].median - 0;
        categories[i] = chartDate[i].mdate;
      }
      series.push(serie);
      $('#container').highcharts({
        chart: {
          type: chartsType,
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        title: {
          text: ''
        },
        xAxis: {
          type: 'datetime',
          dateTimeLabelFormats: {
            day: '%y-%b-%e'
          },
          categories: categories,
        },
        yAxis: { //Y轴设置
          min: 0,
          title: {
            text: '非计划重返抢救室率'
          }
        },
        tooltip: { //数据提示框
          pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}%</b><br/>',
          shared: true
        },
        legend: {
          enabled: false
        },
        plotOptions: { //数据列配置
          column: {
            stacking: 'normal' //    percent百分比
          }
        },
        credits: {
          enabled: false
        },
        series: series,
      });
    }

    function loadTable(start, end) {
      var objParam = {
        'startdate': start,
        'enddate': end
      }
      $('#tabList').datagrid({
        title: "非计划重返抢救室率",
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}zyyreport/queryReturnQjs_result.do",
        idField: '1',
        queryParams: objParam,
        loadMsg: '',
        columns: [
          [{
            field: 'mdate',
            title: '年月',
            width: getWidth(0.5)
          }, {
            field: 'median',
            title: '非计划重返抢救室率',
            width: getWidth(0.5),
            formatter: function (value, row, index) {
              if (value) {
                return value + '%';
              }
              return "0%";
            },
          }]
        ],
        pagination: false,
        rownumbers: true,
        toolbar: [{
          id: 'btnadd',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              publicFun.httpServer({ url: '${baseurl}zyyreport/exportReturnQjsSubmit.do' }, objParam, function (res) {
                $.messager.alert('提示信息', res.resultInfo.message, 'success');
              })
            });
          }
        }],
        onLoadSuccess: function (data) {
          loadChart(data.rows, 'spline');
        },
      });
    }
    function setTime() {
      var currentYear = publicFun.timeFormat(new Date(), 'yyyy');
      var _startDate = currentYear + '/01';
      var _endDate = currentYear + '/12';
      $("#startDate").val(_startDate);
      $("#endDate").val(_endDate);
    };

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }
    //查询方法
    function queryResult() {
      var start = $("#startDate").val();
      var end = $("#endDate").val();
      if (publicFun.searchTime(start, end) === false) {
        return false;
      }
      loadTable(start, end);
    }
  </script>
  <form>
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <input type="text" class="input-base short-right Wdate" id="startDate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})">
            至
            <input type="text" class="input-base short-right Wdate" id="endDate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})" />
            <span class="f-left">&nbsp;查询时间：</span>
          </li>
          <li class="m-l5">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="chart_grp chartbox">
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">非计划重返抢救室率</p>
      <div id="container" class="chart_div"></div>
    </div>
    <!-- 查询列表 -->
    <div class="list_table" id="list_table">
      <table id="tabList"></table>
    </div>
  </div>
</body>

</html>