<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>急诊科患者就诊统计图</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
</head>

<body class="gkhzjztjt">
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          reload()
      }
    });
    function setLayOut() {
      var height = 0.75 * ($("#tabs", parent.document).height());
      $("#tabList").height(height);
      var heightChart = height - 67;
      $("#container").height(heightChart);
    }
    $(function () {
      setTime();
      setLayOut();
      queryResult();
      setDateTypeShow();
      $(window).resize(function () {
        setLayOut();
      });
    })

    function generateParam() {
      var startTime;
      var dateType = $('#querytype').val();
      if (dateType === 'day') {
        startTime = $('#day_date').val();
      } else if (dateType === 'month') {
        startTime = $('#mon_date').val();
      }
      var rtnObj = {};
      if (dateType === 'halfyear') {
        rtnObj = { 'querytype': dateType, 'startdate': $('#half_date').val(), 'enddate': $('#half_date').val() - 0 + 1, 'halfdate': $('#half_date').val() }
      } else  if (dateType === 'year') {
        rtnObj = { 'querytype': dateType, 'startdate': $('#year_date').val(), 'enddate': $('#year_date').val() }
      } else {
        rtnObj = { 'querytype': dateType, 'startdate': startTime, 'enddate': startTime}
      }
      return rtnObj
    }

    function setTime() {
      var currentYear = publicFun.timeFormat(new Date(), 'yyyy');
      $('#year_date').val(currentYear);
      $('#half_date').val(currentYear);
      $('#year_endDate').val(currentYear);
      $('#day_date').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd'));
      $('#mon_date').val(publicFun.timeFormat(new Date(), 'yyyy/MM'));
    }

    //datagrid列定义
    function colcus() {
      var columns_v = [
        [{
          field: 'querydate',
          title: '查询时间',
          width: getWidth(0.25)
        }, {
          field: 'emgFkName',
          title: '科室名',
          width: getWidth(0.25)
        }, {
          field: 'hzcount',
          title: '患者人数',
          width: getWidth(0.45)
        }]
      ];
      return columns_v;
    }

    function getData(objParam) {
      $('#tabList').datagrid({
        title: '急诊科患者就诊统计图',
        nowrap: true,
        striped: true,
        singleSelect: true,
        toolbar: [{
          id: '',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              publicFun.httpServer({ url: '${baseurl}report/gkhzjztjtSubmit.do' }, objParam, function (res) {
                $.messager.alert('提示信息', res.resultInfo.message, 'success');
              })
            });
          }
        }],
        url: "${baseurl}report/querygkhzjztjt_result.do",
        onLoadSuccess: function (data) {
          loadChart(data.rows, "column");
          var querytype = objParam.querytype;
          if (querytype == 'halfyear') {
            $('#tabList').datagrid('insertRow', {
              index: data.rows.length / 2,
              row: {
                querydate: objParam.startdate + '上半年',
                emgFkName: '<b>合计（人）:</b>',
                hzcount: computeHalfYear('querydate', 'hzcount', data, '上半年')
              }
            });
            $('#tabList').datagrid('appendRow', {
              querydate: objParam.startdate + '下半年',
              emgFkName: '<b>合计（人）:</b>',
              hzcount: computeHalfYear('querydate', 'hzcount', data, '下半年')
            });
          } else {
            var yearName = '';
            if (querytype == 'year') {
              yearName = objParam.startdate + '-' + objParam.enddate
            } else {
              yearName = objParam.startdate
            }
            $('#tabList').datagrid('appendRow', {
              querydate: yearName,
              emgFkName: '<b>合计（人）:</b>',
              hzcount: compute("hzcount", data)
            });
          }
        },
        idField: 'date',
        queryParams: objParam,
        loadMsg: '',
        columns: colcus()
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
    //指定半年列求和
    function computeHalfYear(querydate, colName, data, nameType) {
      var rows = data.rows;
      var total = 0;
      for (var i = 0; i < rows.length; i++) {
        if (rows[i][querydate].indexOf(nameType) > 0) {
          total += parseFloat(rows[i][colName]);
        }
      }
      return total;
    }

    function setDateTypeShow() {
      var queryType = $('#querytype').val();
      if (queryType === 'day') {
        $('.queryCondition').hide();
        $('#queryDay').show();
      } else if (queryType === 'halfyear') {
        $('.queryCondition').hide();
        $('#queryHalf').show();
      } else if (queryType === 'year') { 
        $('.queryCondition').hide();
        $('#queryYear').show();
      } else {
        $('.queryCondition').hide();
        $('#queryMonth').show();
      }
      setTime();
    }

    function Person(name, data, stack) {
      this.name = name;
      this.data = data;
      this.stack = stack;
    }

    function loadChart(chartdate, chartstype) {
      var seriesOne;
      var seriesArr = [], categoriesArr = [], nameArr = [];
      var seriesData = null;
      for (var i = 0; i < chartdate.length; i++) {
        categoriesArr.push(chartdate[i].emgFkName);
        if ($.inArray(chartdate[i].querydate, nameArr) < 0) {
          if (seriesData != null) {
            seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
            seriesArr.push(seriesOne);
          }
          nameArr.push(chartdate[i].querydate);
          seriesData = new Array();
        }
        seriesData.push(chartdate[i].hzcount);
      }
      if (chartdate.length == 0) {
        var start = generateParam().startdate;
        nameArr.push(start);
      }
      seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
      seriesArr.push(seriesOne);

      $('#container').highcharts({
        chart: {
          type: chartstype,
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
            '<td style="padding:0"><b>{point.y:.0f} 次</b></td></tr>',
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

    //查询方法
    function queryResult() {
      var queryParam = generateParam();
      if (!queryParam.startdate) {
        publicFun.alert('开始时间不能为空');
        return false;
      }
      getData(queryParam);
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

    function reload() {
      setLayOut();
      queryResult();
    }

  </script>
  <form>
    <!-- 查询条件 -->
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <p class="floatLeft">&nbsp;查询方式：</p>
            <select id="querytype" name="querytype" onchange="setDateTypeShow()">
              <option value="year" selected="selected">按年</option>
              <option value="halfyear">按半年</option>
              <option value="month">按月</option>
              <option value="day">按天</option>
            </select>
          </li>
          <li id="queryYear" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="year_date" onfocus="WdatePicker({dateFmt:'yyyy'})">
            <!-- <input type="text" class="input-base short-right Wdate" id="year_endDate" onfocus="WdatePicker({dateFmt:'yyyy'})" /> -->
          </li>
          <li id="queryHalf" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="half_date" onfocus="WdatePicker({dateFmt:'yyyy'})">
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
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">急诊科患者就诊统计图</p>
      <div id="container" class="chart_div"></div>
    </div>
    <!-- 查询列表 -->
    <div class="list_table nonumlist_table" id="list_table">
      <table id="tabList"></table>
    </div>
  </div>
</body>

</html>