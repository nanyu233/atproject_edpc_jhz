<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>急诊科住院人数</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css?090" type="text/css" />
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
</head>

<body class="zjzyrs">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          reload()
      }
    });

    function setLayOut() {
      var height = 0.9 * ($("#tabs", parent.document).height() - 150);
      $("#tabList").height(height);
      var heightChart = height - 67;
      $("#container").height(heightChart);
    }

    //datagrid列定义
    function getColumns() {
      var columns_v = [
        [{
          field: 'queryDate',
          title: '时间',
          width: getWidth(0.25)
        }, {
          field: 'sqlDepCod',
          title: '急诊科室',
          width: getWidth(0.33)
        }, {
          field: 'zycounts',
          title: '住院数',
          width: getWidth(0.2)
        }, {
          field: 'wzcounts',
          title: '危重数',
          width: getWidth(0.2)
        }]
      ];
      return columns_v;
    }
    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

    function getDetail (objParam) {
      publicFun.httpServer({ url: '${baseurl}report/jzkgzl_result.do' }, objParam, function (res) {
        var msg = res.msg, _str = '';
        $('#detail').html('');
        var queryType = objParam.querytype;
        if (queryType === 'year' || queryType === 'month' || queryType === 'day') {
          _str += '<p>急诊人数:<i class=\"point\">' + msg.highChartsReportCustom.emgCount + '</i>人</p>';
          _str += '<p>死亡人数:<i class=\"point\">' + msg.highChartsReportCustom.deathCount + '</i>人</p>';
          _str += '<p>总危重病人数:<i class=\"point\">' + msg.highChartsReportCustom.lqCount + '</i>人</p>';
          _str += '<p>120到院人数:<i class=\"point\">' + msg.highChartsReportCustom.cgcount + '</i>人</p>';
          _str += '<p>总住院人数:<i class=\"point\">' + msg.highChartsReportCustom.zyCount + '</i>人</p>';
          _str += '<p>高危患者收住院比率:<i class=\"point\">' + (msg.highChartsReportCustom.zyCount/msg.highChartsReportCustom.emgCount*100).toFixed(2) + '</i>%</p>';
        } else {
       	  _str = '';
          _str += '<div class=\"halfTitle\"><p class=\"titleBold\"><i class=\"point\">' + objParam.startdate + '</i>年上半年:</p>';
          _str += '<p>急诊人数:<i class=\"point\">' + msg.highChartsReportCustomS.emgCount + '</i>人</p>';
          _str += '<p>死亡人数:<i class=\"point\">' + msg.highChartsReportCustomS.deathCount + '</i>人</p>';
          _str += '<p>总危重病人数:<i class=\"point\">' + msg.highChartsReportCustomS.lqCount + '</i>人</p>';
          _str += '<p>120到院人数:<i class=\"point\">' + msg.highChartsReportCustomS.cgcount + '</i>人</p>';
          _str += '<p>总住院人数:<i class=\"point\">' + msg.highChartsReportCustomS.zyCount + '</i>人</p>';
          _str += '<p>高危患者收住院比率:<i class=\"point\">' + (msg.highChartsReportCustomS.zyCount/msg.highChartsReportCustomS.emgCount*100).toFixed(2) + '</i>%</p>';
          _str += '</div><div class=\"halfTitle\"><p class="titleBold"><i class=\"point\">' + objParam.startdate + '</i>年下半年:</p>';
          _str += '<p>急诊人数:<i class=\"point\">' + msg.highChartsReportCustomX.emgCount + '</i>人</p>';
          _str += '<p>死亡人数:<i class=\"point\">' + msg.highChartsReportCustomX.deathCount + '</i>人</p>';
          _str += '<p>总危重病人数:<i class=\"point\">' + msg.highChartsReportCustomX.lqCount + '</i>人</p>';
          _str += '<p>120到院人数:<i class=\"point\">' + msg.highChartsReportCustomX.cgcount + '</i>人</p>';
          _str += '<p>总住院人数:<i class=\"point\">' + msg.highChartsReportCustomX.zyCount + '</i>人</p>';
          _str += '<p>高危患者收住院比率:<i class=\"point\">' + (msg.highChartsReportCustomX.zyCount/msg.highChartsReportCustomX.emgCount*100).toFixed(2) + '</i>%</p></div>	';
        }
        $('#detail').html(_str);
      })
    }

    function getData(objParam) {
      $('#tabList').datagrid({
        title: '急诊住院人数统计报表',
        url: "${baseurl}report/zjzyrsjz_result.do",
        nowrap: true,
        striped: true,
        singleSelect: true,
        toolbar: [{
          id: 'export',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              btnExport('export')
            });
          }
        }, {
          id: 'exportPat',
          text: '危重患者明细',
          iconCls: 'icon-add',
          handler: function () {
          	jzhzmx()
          }
        }],
        onLoadSuccess: function (data) {
          getDetail(objParam);
          loadChart(data.rows, 'column');
        },
        idField: 'date',
        queryParams: objParam,
        loadMsg: '',
        columns: getColumns()
      });
    }
	
	/**
	 * 导出
	 */
    function btnExport(exportType) {
      if (exportType == 'export') {
        publicFun.httpServer({ url: '${baseurl}report/zjzyrsjzSubmit.do' }, generateParam(), function (res) {
          $.messager.alert('提示信息', res.resultInfo.message, 'success');
        })
      }
    }
    
    /**
     * 患者明细
     */
    function jzhzmx(){
    	var allMsgParam = generateParam();
        var startdate, enddate, halfdate = "firstHalf";
        startdate = allMsgParam.startdate;
        enddate = allMsgParam.enddate;
        var pageName = 'jzhzmx';
        if (!startdate) {
          publicFun.alert('开始时间不能为空');
          return false;
        }
        parent.opentabwindow("患者明细",
          '${baseurl}report/findjzhzmx.do?startdate=' + startdate + '&enddate=' + enddate + '&querytype=' + allMsgParam.querytype + '&halfdate=' + halfdate +'&pageName='+pageName, '2');
    }

    function setTime() {
      $('#year_date').val(publicFun.timeFormat(new Date(), 'yyyy'));
      $('#day_date').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd'));
      $('#mon_date').val(publicFun.timeFormat(new Date(), 'yyyy/MM'));
    }

    function Person(name, data, stack) {
      this.name = name;
      this.data = data;
      this.stack = stack;
    }

    function loadChart(chartData, chartType) {
      var seriesOne, seriesData = null
      var categoriesArr = [], nameArr = [], seriesArr = [];
      for (var i = 0; i < chartData.length; i++) {
        if ($.inArray(chartData[i].sqlDepCod, categoriesArr) < 0) {
          categoriesArr.push(chartData[i].sqlDepCod);
        }
        if ($.inArray(chartData[i].queryDate, nameArr) < 0) {
          if (seriesData != null) {
            seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
            seriesArr.push(seriesOne);
          }
          nameArr.push(chartData[i].queryDate);
          seriesData = [];
        }
        seriesData.push(chartData[i].zycounts);
      }
      seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
      seriesArr.push(seriesOne);
      $('#container').highcharts({
        chart: {
          type: chartType,
          backgroundColor: '#e4efff'
        },
        title: {
          text: ''
        },
        xAxis: {
          categories: categoriesArr,
        },
        yAxis: {
          min: 0,
          allowDecimals: false,
          title: {
            text: '人数',
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
            '<td style="padding:0"><b>{point.y:.0f} 个</b></td></tr>',
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

    function generateParam() {
      var startTime;
      var dateType = $('#querytype').val();
      if (dateType === 'day') {
        startTime = $('#day_date').val();
      } else if (dateType === 'halfyear' || dateType === 'year') {
        startTime = $('#year_date').val();
      } else {
        startTime = $('#mon_date').val();
      }
      var rtnObj = {};
      if (dateType === 'halfyear') {
        rtnObj = { 'querytype': dateType, 'startdate': startTime, 'enddate': startTime - 0 + 1, 'halfdate': startTime }
      } else {
        rtnObj = { 'querytype': dateType, 'startdate': startTime, 'enddate': startTime }
      }
      return rtnObj
    }

    //查询方法
    function queryResult() {
      var queryParam = generateParam();
      if (!queryParam.startdate) {
        publicFun.alert('开始时间不能为空');
        return false;
      }
      getData(queryParam);
    }
    function setDateTypeShow() {
      var queryType = $('#querytype').val();
      if (queryType === 'day') {
        $('.queryCondition').hide();
        $('#queryDay').show();
      } else if (queryType === 'halfyear' || queryType === 'year') {
        $('.queryCondition').hide();
        $('#queryYear').show();
      } else {
        $('.queryCondition').hide();
        $('#queryMonth').show();
      }
      setTime();
    }
    function init() {
      setDateTypeShow();
      setLayOut();
      setTime();
      queryResult();
    }
    function reload() {
      queryResult();
    }

    $(function () {
      init();
      $(window).resize(function () {
        $('#tabList').datagrid('reload');
      });
    })
  </script>
  <form>
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <select id="querytype" name="querytype" onchange="setDateTypeShow()">
              <option value="year" selected="selected">按年</option>
              <option value="halfyear">按半年</option>
              <option value="month">按月</option>
              <option value="day">按日</option>
            </select>
            <span class="f-left">&nbsp;查询方式：</span>
          </li>
          <li id="queryYear" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="year_date" onfocus="WdatePicker({dateFmt:'yyyy'})">
          </li>
          <li id="queryMonth" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="mon_date" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
          </li>
          <li id="queryDay" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-date Wdate" id="day_date" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
          </li>
          <li class="m-l5">
            <a href="#" id="search" onclick="reload()" class="easyui-linkbutton" iconCls="icon-search">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="chart_grp chartbox">
    <div class="textDiv border-radius box-shadow">
      <div class="tabDetail" id="detail"></div>
    </div>
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">急诊科室住院人数统计报表</p>
      <div id="container" class="chart_div"></div>
    </div>
    <div class="list_table nonumlist_table" id="list_table">
      <table id="tabList"></table>
    </div>
  </div>
</body>

</html>