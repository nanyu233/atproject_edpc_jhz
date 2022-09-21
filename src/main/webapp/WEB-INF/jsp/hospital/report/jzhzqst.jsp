<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
  <title>急诊患者趋势图</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
</head>

<body>
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
    $(function () {
      setTime();
      setLayOut();
      queryResult();
      $(window).resize(function () {
        setLayOut();
        queryResult();
      });
    });

    function setLayOut() {
      var height = 0.75 * ($("#tabs", parent.document).height());
      $("#tabList").height(height);
      var chartHeight = height - 67;
      $("#container").height(chartHeight);
    }

    function loadChart() {
      var chart = Highcharts.chart('container', {
        chart: {
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        title: {
          text: ''
        },
        tooltip: {
          pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b><br/>',
          shared: true
        },
        xAxis: {
          type: 'datetime',
          dateTimeLabelFormats: {
            day: '%m-%d',
            week: '%m-%d',
            month: '%Y-%m',
            year: '%Y'
          }
        },
        yAxis: {
          allowDecimals: false,
          title: {
            text: '人数'
          }
        },
        credits: {
          enabled: false
        },
        legend: {
          enabled: false
        },
        plotOptions: {},
        series: [{
          type: 'line',
          name: '人数',
          color: '#1981E4'
        }]
      });
      publicFun.httpServer({ url: '${baseurl}report/getjzhzqst.do' }, { 'starttime': $("#start_date").val(), 'endtime': $("#end_date").val() }, function (res) {
        var series = res.series;
        if (series) {
          if ($.isArray(series)) {
            var seriesLength = series.length;
            if (seriesLength) {
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
            } else {
              chart.series[0].setData('');
              chart.series[0].name = '';
            }
          }
        }
        chart.legend.update();
        chart.xAxis[0].setCategories(res.xcategories);
      })
    }

    function setTime() {
      var today = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      var preMonthDay = publicFun.getPreMonth(today, '/');
      $("#start_date").val(preMonthDay);
      $("#end_date").val(today);
    };

    function loadTab() {
      $('#tabList').datagrid({
        title: "急诊患者趋势",
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}report/getjzhzqstb.do",
        loadMsg: '',
        queryParams: {
          starttime: $("#start_date").val(),
          endtime: $("#end_date").val()
        },
        columns: [
          [{
            field: 'name',
            title: '日期 ',
            width: getWidth(0.5)
          }, {
            field: 'count',
            title: '人数',
            width: getWidth(0.5)
          }]
        ],
        pagination: true,
        rownumbers: true,
        pageList: [15, 30, 50],
        toolbar: [{
          id: '',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              jquerySubByFId('jzhzqsform', userExprot_callback, null, "json");
            });
          }
        }]
      });
    }

    //用户导出回调
    function userExprot_callback(data) {
      //在这里提示信息中有文件下载链接
      message_alert(data);
    }

    //查询方法
    function queryResult() {
      var rtnFlag = publicFun.searchTime($("#start_date").val(), $("#end_date").val());
      if (rtnFlag === false) {
        return rtnFlag
      }
      loadChart();
      loadTab();
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

  </script>
  <!-- html的静态布局 -->
  <form id="jzhzqsform" name="jzhzqsform" action="${baseurl}report/exportjhz.do" method="post">
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <input type="text" class="input-date Wdate" id="start_date" name="starttime" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})">
            至
            <input type="text" class="input-date Wdate" id="end_date" name="endtime" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})" />
            <span class="f-left">&nbsp;查询时间：</span>
          </li>
          <li class="m-l5">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <div class="chart_grp chartbox">
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title">急诊患者趋势</p>
        <div id="container" class="chart_div"></div>
      </div>
      <!-- 查询列表 -->
      <div class="list_table" id="list_table">
        <table id="tabList"></table>
      </div>
    </div>
  </form>
</body>

</html>