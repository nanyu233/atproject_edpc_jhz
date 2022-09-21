<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>就诊时间分布统计图</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
</head>

<body class="brbzxgtjt">
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          return false;
      }
    });
    var chart;

    function reload() {
      checkDatAndInit();
    }

    $(function () {
      init();
      $(window).resize(function () {
        $('#tabList').datagrid('reload');
      });
    });

    function setLayOut() {
      var height = 0.75 * ($("#tabs", parent.document).height());
      $("#tabList").height(height);
      var heightChart = height - 67;
      $("#container").height(heightChart);
    }

    function init() {
      setDateTypeShow();
      setTime();
      setLayOut();
      checkDatAndInit();
    }

    function Person(name, data, stack) {
      this.name = name;
      this.data = data;
      this.stack = stack;
    }

    function loadChart(chartDate, chartsType) {
      var seriesArr = [], categoriesArr = [], nameArr = [];
      var seriesOne, seriesData = null;
      for (var i = 0; i < chartDate.length; i++) {
        categoriesArr.push(chartDate[i].queryType);
        if ($.inArray(chartDate[i].querydate, nameArr) < 0) {
          if (seriesData != null) {
            seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
            seriesArr.push(seriesOne);
          }
          nameArr.push(chartDate[i].querydate);
          seriesData = [];
        }
        seriesData.push(chartDate[i].counts);
      }
      seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
      seriesArr.push(seriesOne);
      $('#container').highcharts({
        chart: {
          type: chartsType,
          backgroundColor: '#e4efff'
        },
        title: {
          text: ''
        },
        xAxis: {
          categories: categoriesArr
        },
        yAxis: {
          min: 0,
          allowDecimals: false,
          title: {
            text: '人数'
          }
        },
        legend: {
          itemStyle: {
            'fontSize': '12px'
          }
        },
        tooltip: {
          fheaderFormat: '<span style="font-size:10px">{point.key}</span><table>',
          pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.0f} 人</b></td></tr>',
          footerFormat: '</table>',
          shared: true,
          useHTML: true
        },
        plotOptions: {
          column: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
              style: {
                textShadow: '0 0 3px black'
              }
            },
            showInLegend: true
          }
        },
        credits: {
          enabled: false
        },
        series: seriesArr
      });
    }

    function getData(start, queryType, timeType,emgDepCod) {
      var objParam = {
        'querytype': queryType,
        'startdate': start,
        'timetype': timeType,
        'hspemginfCustom.emgDepCod': emgDepCod,
      }
      $('#tabList').datagrid({
        title: '就诊时间分布统计',
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}report/queryvisdat_result.do",
        queryParams: objParam,
        loadMsg: false,
        columns: [
          [{
            field: 'querydate',
            title: '日期',
            width: getWidth(0.28)
          }, {
            field: 'queryType',
            title: '时间点',
            width: getWidth(0.25)
          }, {
            field: 'counts',
            title: '就诊人数',
            width: getWidth(0.28)
          }]
        ],
        toolbar: [{
          id: '',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              publicFun.httpServer({ url: '${baseurl}report/exportvisdat_result.do' }, objParam, function (res) {
                $.messager.alert('提示信息', res.resultInfo.message, 'success');
              })
            });
          }
        }],
        onLoadSuccess: function (data) {
          loadChart(data.rows, 'column');
          $('#tabList').datagrid('appendRow', {
            queryType: '<b>合计（人）:</b>',
            counts: compute("counts", data)
          });
        }
      });
    }
    //指定列求和
    function compute(colName, data) {
      var rows = data.rows;
      var total = 0;
      for (var i = 0; i < rows.length; i++) {
        total += parseFloat(rows[i][colName]);
      }
      return total;
    }

    function setTime() {
      var currentDay = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var currentMonth = publicFun.timeFormat(new Date(), 'yyyy/MM');
      $('startDay').val(currentDay);
      $('#startMonth').val(currentMonth);
      $("#timetype").val("1");
      $("#querytype").val("day");
    };

    function checkDatAndInit() {
      var start;
      var queryType = $("#querytype").val();
      var timeType = $("#timetype").val();
      var emgDepCod = $('#emgDepCod').val();
      if (queryType == 'day') {
        start = $("#startDay").val();
      } else {
        start = $("#startMonth").val();
      }
      if (!start) {
        publicFun.alert('时间不能为空');
        return false;
      }
      getData(start, queryType, timeType,emgDepCod);
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

    function setDateTypeShow() {
      var queryType = $('#querytype').val();
      if (queryType == 'month') {
        var todayMonth = publicFun.timeFormat(new Date(), "yyyy/MM");
        $("#startMonth").val(todayMonth);
        $('#queryMonth').show();
        $('#queryDay').hide();
      } else {
        var todayDay = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
        $("#startDay").val(todayDay);
        $('#queryMonth').hide();
        $('#queryDay').show();
      }
    }
  </script>
  <form>
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <p class="floatLeft">&nbsp;查询方式：</p>
            <select id="querytype" name="querytype" onchange="setDateTypeShow()">
              <option value="month">按月</option>
              <option value="day" selected="selected">按天</option>
            </select>
            <select id="timetype" name="timetype">
              <option value="0">1小时制</option>
              <option value="1" selected="selected">2小时制</option>
            </select>
          </li>
          <li>
           	<p class="floatLeft">分级：</p>
		    <select id="emgDepCod" name="emgDepCod" onchange="checkDatAndInit()">
		      <option value="">全部</option>
		      <option value="0">I级</option>
		      <option value="1">II级</option>
		      <option value="2">III级</option>
		      <option value="3">IVa级</option>
		      <option value="4">IVb级</option>
		    </select>
    	 </li>
          <li id="queryDay">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-date Wdate" id="startDay" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
          </li>
          <li id="queryMonth">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="startMonth" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
          </li>
          <li class="m-l5">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="checkDatAndInit()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <div class="chart_grp chartbox">
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title">就诊时间分布统计</p>
        <div id="container" class="chart_div"></div>
      </div>
      <!-- 查询列表 -->
      <div class="list_table nonumlist_table" id="list_table">
        <table id="tabList"></table>
      </div>
    </div>
  </form>
</body>

</html>