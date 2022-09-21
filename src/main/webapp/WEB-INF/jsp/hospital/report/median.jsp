<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>抢救室滞留时间中位数</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
</head>

<body class="median">
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryResult()
      }
    });

    function reload() {
      queryResult();
    }

    function drawChart(data) {
      var height = ($("#tabs", parent.document).height()) * 0.75 - 67;
      $("#container").height(height);
      var chart = Highcharts.chart('container', {
        chart: { //图标配置
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        title: { //大标题
          text: ''
        },
        xAxis: {
          type: 'datetime',
          dateTimeLabelFormats: {
            day: '%y-%b-%e'
          }
        },
        yAxis: { //Y轴设置
          min: 0,
          title: {
            text: '中位数'
          }
        },
        credits: { //版权信息
          enabled: false
        },
        tooltip: { //数据提示框
          pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b><br/>',
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
        series: [{ //数据列
          type: 'line',
          name: '中位数',
          color: '#1981E4',
        }]
      });
      var series = data.series;
      if ($.isArray(series)) {
        for (var i = 0; i < series.length; i++) {
          $.each(series[i], function (key, n) {
            if (key == "data") {
              chart.series[i].setData(n);
            }
            if (key == "name" && n) {
              chart.series[i].name = n;
            }
          });
        }
      }
      chart.legend.update();
      chart.xAxis[0].setCategories(data.xcategories);
    }

    $(function () {
      setTime();
      queryResult();
      $(window).resize(function () {
        queryResult();
      });
    });

    function queryPie() {
      var start = $("#startDate").val();
      var end = $("#endDate").val();
      var data = { "startdate": start, "enddate": end };
      publicFun.httpServer({url: '${baseurl}report/getMedian.do'}, data, function (data) { drawChart(data)})
    }

    //导出回调
    function medianExprot_callback(data) {
      //在这里提示信息中有文件下载链接
      message_alert(data);
    }

    function loadTable() {
      var height = ($("#tabs", parent.document).height()) * 0.75;
      $("#medianList").height(height);
      var start = $("#startDate").val();
      var end = $("#endDate").val();
      $('#medianList').datagrid({
        title: "抢救室滞留时间中位数",
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}report/querymedian_result.do",
        idField: 'mdate',
        queryParams: {
          startdate: start,
          enddate: end,
        },
        loadMsg: '',
        columns: [
          [{
            field: 'mdate',
            title: '年月',
            width: getWidth(0.5)
          }, {
            field: 'median',
            title: '中位数（时）',
            width: getWidth(0.5)
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
              jquerySubByFId('medianform', medianExprot_callback, null, "json");
            });
          }
        }],
        onLoadSuccess: function (data) {
          $('#medianList').datagrid('appendRow', {
            mdate: '<b>平均值（时）:</b>',
            median: avg("median", data)
          });
        },
      });
    }

    //中位数列平均值
    function avg(colName, data) {
      var rows = data.rows;
      var avg = 0;
      var total = 0;
      for (var i = 0; i < rows.length; i++) {
        total += parseFloat(rows[i][colName]);
      }
      avg = total / rows.length;
      avg = avg.toFixed(2);
      return avg;
    }

    function setTime() {
      var year = publicFun.timeFormat(new Date(), "yyyy");
      _startdate = year + "/" + "01";
      _enddate = year + "/" + "12";
      $("#startDate").val(_startdate);
      $("#endDate").val(_enddate);
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
        return false
      }
      queryPie();
      loadTable();
    }
  </script>
  <form id="medianform" action="${baseurl}report/exportMedianSubmit.do" method="post">
    <!-- html的静态布局 -->
    <!-- 查询条件 -->
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <input type="text" class="input-base short-right Wdate" id="startDate" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})">
            至
            <input type="text" class="input-base short-right Wdate" id="endDate" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})" />
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
      <p class="chart_title">抢救室滞留时间中位数(小时)</p>
      <div id="container" class="chart_div"></div>
    </div>
    <!-- 查询列表 -->
    <div class="list_table" id="list_table">
      <table id="medianList"></table>
    </div>
  </div>
</body>

</html>