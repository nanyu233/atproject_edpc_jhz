<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>急诊各级患者比例</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
</head>

<body class="hcsebdPie">
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/modules/drilldown.js" type="text/javascript"></script>
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

    function queryResult() {
      var param = generateParam();
      var rtnFlag = publicFun.searchTime($("#emg_start").val(), $("#emg_end").val());
      if (rtnFlag === false) {
        return false;
      }
      publicFun.httpServer({url: '${baseurl}report/gethcsebd.do'}, param,function (data) {
        var height = 0.75 * ($("#tabs", parent.document).height()) - 67;
        $('#container').height(height);
        showPie(data);
      })
      loadTable(param);
    }
    
    function generateParam () {
      return { "startdate": $("#emg_start").val(), "enddate": $("#emg_end").val(), "querytype": $('#selType').val() }
    }

    function showPie(data) {
      var brandsData = [], drilldownSeries = [];
      var ageGroup = data.ageGroup;
      for (var i = 0; i < data.length; i++) {
        brandsData.push({
          name: data[i].name,
          y: data[i].count,
          drilldown: data[i].ageGroup ? data[i].name : null
        });
      }
      for (var i = 0; i < data.length; i++) {
        var d = [];
        if (data[i].ageGroup) {
          $.each(data[i].ageGroup, function (j, value) {
            d.push([data[i].ageGroup[j].name, data[i].ageGroup[j].count])
          });
          drilldownSeries.push({
            name: data[i].name,
            id: data[i].name,
            data: d
          });
        }
      }
      // 创建图例
      $('#container').highcharts({
        chart: {
          type: 'pie',
          backgroundColor: '#e4efff'
        },
        colors: [
          'red', //第一个颜色，
          '#f90', //第二个颜色
          'yellow', //第三个颜色
          'green', //第四个颜色
          'green'
        ],
        legend: {
          align: 'right',
          floating: true,
          layout: "horizontal", //默认horizontal
          itemStyle: {
            'fontSize': '12px'
          }
        },
        title: {
          text: ''
        },
        credits: {
          enabled: false
        },
        plotOptions: {
          pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              format: '{point.name}: {point.percentage:.2f}%'
            },
            showInLegend: true
          }
        },
        tooltip: {
          headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
          pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b> {point.percentage:.2f}%   {point.y}人</b> <br/>'
        },
        series: [{
          type: 'pie',
          name: '急诊分级',
          colorByPoint: true,
          data: brandsData
        }],
        drilldown: {
          series: drilldownSeries
        }
      });
    }

    function hceptexport() {
      jquerySubByFId('hceptform', hceptExport_callback, null, "json");
    }
    //导出的回调函数
    function hceptExport_callback(data) {
      message_alert(data);
    }
    /*
     * 此处要求特殊，不改
     */
    function setTime() {
      var currentTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var monthFirstDay = publicFun.timeFormat(new Date(), 'yyyy/MM') + '/01';
      $("#emg_start").val(monthFirstDay);
      $("#emg_end").val(currentTime);
    };

    //查询方法
    function loadTable(paramObj) {
      var height = ($("#tabs", parent.document).height()) * 0.75;
      $("#tabList").height(height);
      $('#tabList').datagrid({
        title: "急诊各级患者比例",
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}report/gethcsebd_result.do",
        idField: '1',
        loadMsg: '',
        columns: [
          [{
            field: 'name',
            title: '急诊分级',
            width: getWidth(0.5)
          }, {
            field: 'count',
            title: '人数',
            width: getWidth(0.5)
          }]
        ],
        pagination: false,
        rownumbers: true,
        queryParams: paramObj,
        pageList: [15, 30, 50],
        toolbar: [{ //工具栏
          id: 'btnadd',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              hceptexport();
            });
          },
        }],
        onLoadSuccess: function (data) {
          $('#tabList').datagrid('appendRow', {
            name: '<b>合计（人）:</b>',
            count: compute("count", data)
          });
        },
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

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }
    //初始化
    $(function () {
      setTime();
      queryResult();
      $(window).resize(function () {
        $('#tabList').datagrid('reload');
      });
    });
  </script>
  <form id="hceptform" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post">
    <!-- 查询条件 -->
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <select id="selType" name="querytype">
              <option value="">全部</option>
              <option value="1" selected="selected">不含儿科</option>
            </select>
            <span class="f-left">&nbsp;查询条件：</span>
          </li>
          <li>
            <input type="text" class="input-date Wdate" id="emg_start" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})">
            至
            <input type="text" class="input-date Wdate" id="emg_end" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})" />
            <span class="f-left">&nbsp;查询时间：</span></li>
          <li class="m-l5"><a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a></li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <!-- 查询列表 -->
    <div class="chart_grp chartbox">
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title">急诊各级患者比例</p>
        <div id="container" class="chart_div"></div>
      </div>
      <!-- 查询列表 -->
      <div class="list_table" id="list_table">
        <table id="tabList" class="jzgjbl"></table>
      </div>
    </div>
  </form>
</body>
</html>