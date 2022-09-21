<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>月急诊人数图</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
</head>

<body class="yjzfbt">
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
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="queryResult()">查询</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-redo" onclick="exportResult()">导出</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="clr">
    <div class="form_chart border-radius box-shadow">
      <p class="border-radius">月急诊人数</p>
      <div class="chart1" id="container1"></div>
    </div>
    <div class="form_chart border-radius box-shadow">
      <p class="border-radius">月急诊抢救人数</p>
      <div class="chart1" id="container2"></div>
    </div>
    <div class="form_chart chart_pos border-radius box-shadow">
      <p class="border-radius">月急诊死亡人数</p>
      <div class="chart1" id="container3"></div>
    </div>
    <div class="form_chart chart_pos border-radius box-shadow">
      <p class="border-radius">月急诊住院人数</p>
      <div class="chart1" id="container4"></div>
    </div>
  </div>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryResult()
      }
    });

    function queryResult() {
      var startDate = $("#startDate").val();
      var endDate = $("#endDate").val();
      if (publicFun.searchTime(startDate, endDate) === false) {
        return false
      }
      var data = { 'starttime': startDate, 'endtime': endDate };
      var height = 0.6 * (parent.$('.content-div').height() - 222);
      publicFun.httpServer({ url: '${baseurl}report/yjzrs.do' }, data, function (res) {
        $("#container1").height(height);
        generateChart('container1', res);
      })
      publicFun.httpServer({ url: '${baseurl}report/yjzqjrs.do' }, data, function (res) {
        $("#container2").height(height);
        generateChart('container2', res);
      })
      publicFun.httpServer({ url: '${baseurl}report/yjzswrs.do' }, data, function (res) {
        $("#container3").height(height);
        generateChart('container3', res);
      })
      publicFun.httpServer({ url: '${baseurl}report/yjzzyrs.do' }, data, function (res) {
        $("#container4").height(height);
        generateChart('container4', res);
      })
    }
    function generateChart(container, res) {
      var chart = Highcharts.chart(container, {
        chart: { //图标配置
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        title: { //大标题
          text: ''
        },
        tooltip: { //数据提示框
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
        yAxis: { //Y轴设置
          allowDecimals: false,
          title: {
            text: '人数',
          }
        },
        credits: { //版权信息
          enabled: false
        },
        legend: {
          enabled: false
        },
        plotOptions: { //数据列配置
        },
        series: [{ //数据列
          type: 'line',
          name: '人数',
          color: '#1981E4',
        }]
      })
      var series = res.series;
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
      chart.xAxis[0].setCategories(res.xcategories);
      return chart;
    }

    function exportResult() {
      _confirm('确定导出吗？', null, function () {
        var baseParam = { url: '${baseurl}report/yjzfbtExport.do' };
        publicFun.httpServer(baseParam, { 'starttime': $('#startDate').val(), 'endtime': $('#endDate').val() }, function (res) {
          $.messager.alert('提示信息', res.resultInfo.message, 'success');
        })
      });
    }

    function setTime() {
      var _today, _date, _dataYY, _dataMM, _beforeDateMM;
      _date = new Date();
      _dataYY = _date.getFullYear();
      _dataMM = _date.getMonth() + 1;
      if (_dataMM >= 0 && _dataMM < 3) {
        _beforeDateMM = _date.getMonth() + 12 - 1;
      } else {
        _beforeDateMM = _date.getMonth() - 1;
      }
      _dataMM = _dataMM >= 10 ? _dataMM.toString() : '0' + _dataMM;
      _beforeDateMM = _beforeDateMM >= 10 ? _beforeDateMM.toString() : '0' + _beforeDateMM;
      _today = _dataYY + '/' + _dataMM;
      if (_dataMM >= 0 && _dataMM < 3) {
        _beforeDay = _dataYY - 1 + '/' + _beforeDateMM;
      } else {
        _beforeDay = _dataYY + '/' + _beforeDateMM;
      }
      $("#startDate").val(_beforeDay);
      $("#endDate").val(_today);
    };

    $(function () {
      setTime();
      queryResult();
    })
  </script>
</body>

</html>