<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css?090" type="text/css" />
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <title>急诊医患比/护患比</title>
</head>

<body class="newDocRatio">
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          return false;
      }
    });

    //刷新
    function enterDown() {
      $('.Wdate').keyup(function (event) {
        if (event.keyCode == 13) {
          queryResult();
        }
      });
    }
    //获取表格
    function loadChartData() {
      var _param = getParams();
      if (_param == false) {
        return;
      }
      publicFun.httpServer({ url: '${baseurl}zyyreport/queryDocNurseRatio_result.do' }, _param, function (data) {
        var _totalMsg = data.resultInfo.sysdata.hspemginfCustom;
        loadChart(_totalMsg, 'column', 'doc');
        loadChart(_totalMsg, 'column', 'nurse');
      })
    }

    function loadChart(chartData, chartsType, showTitle) {
      var _title = '', _idContainer = '', countName = '', showText = '', nameShow = '';
      var categoriesArr = [];
      if (showTitle === 'doc') {
        _title = '医患比';
        _idContainer = 'containerDoc';
        countName = 'yscounts';
        showText = '急诊医患比 <span style="color: #1c69b5">' + chartData.yhb + '</span>';
        nameShow = '医生';
      } else {
        _title = '护患比';
        _idContainer = 'containerNurse';
        countName = 'hscounts';
        showText = '急诊护患比 <span style="color: #1c69b5">' + chartData.hhb + '</span>';
        nameShow = '护士';
      }
      categoriesArr = [nameShow, '患者'];
      var seriesArr = [];
      var seriesData = { data: [
        chartData[countName] - 0,
        chartData.hzcounts - 0
      ], name: _title };
      seriesArr.push(seriesData)
      $('#' + _idContainer).highcharts({
        chart: {
          type: chartsType,
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        title: {
          text: showText
        },
        xAxis: {
          type: 'datetime',
          dateTimeLabelFormats: {
            day: '%y-%b-%e'
          },
          categories: categoriesArr
        },
        yAxis: { //Y轴设置
          min: 0,
          title: {
            text: _title
          }
        },
        tooltip: { //数据提示框
          pointFormat: '<span style="color:{series.color}">人数</span>: <b>{point.y}</b><br/>',
          shared: true
        },
        legend: {
          enabled: false
        },
        plotOptions: { //数据列配置
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

    function setDateTypeShow() {
      var queryType = $("#chooseType").val();
      $(".Wdate").hide();
      $("#startDate_" + queryType).show();
      var format = $("#startDate_" + queryType).attr("format");
      setTime(queryType, format)
    }

    //根据插叙类型设置初始时间
    function setTime(type, format) {
      var today = publicFun.timeFormat(new Date(), format);
      $('#startDate_' + type).val(today);
    };

    //查询方法
    function queryResult() {
      loadChartData();
    }

    function setLayOut() {
      var height = ($("#tabs", parent.document).height()) * 0.75;
      $("#containerDoc").height(height - 67);
      $("#containerNurse").height(height - 67);
    }
    //获取传给后端的参数
    function getParams() {
      var queryType = $("#chooseType").val();
      var startDate = $("#startDate_" + queryType).val();
      if (!startDate) {
        publicFun.alert('查询时间不能为空');
        return false;
      }
      var queryParams = {
        "startdate": startDate,
        "querytype": queryType
      };
      return queryParams;
    }
    $(function () {
      setLayOut();
      setTime('year', 'yyyy');
      loadChartData();
      enterDown();
    });

  </script>
  <form>
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <span class="form-text">&nbsp;查询方式：</span>
          <select id="chooseType" onchange="setDateTypeShow()">
            <option value="year" selected="selected">年</option>
            <option value="month">月</option>
            <option value="day">天</option>
            <!-- <option value="range">范围</option> -->
          </select>
          <span class="form-text">&nbsp;查询日期：</span>
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startDate_day" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startDate_month"
            onfocus="WdatePicker({dateFmt:'yyyy/MM',minDate:'2017/08/01'})">
          <input type="text" format="yyyy" class="input-date Wdate" id="startDate_year" onfocus="WdatePicker({dateFmt:'yyyy',minDate:'2017/08/01'})">
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startDate_range"
            onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <div class="chart_grp chartbox">
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title">急诊科医患比</p>
        <div id="containerDoc" class="chart_div"></div>
      </div>
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title">急诊科护患比</p>
        <div id="containerNurse" class="chart_div"></div>
      </div>
    </div>
  </form>
</body>

</html>