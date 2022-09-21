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
  <title>门药/门球时间报表</title>
  <script>
  var currentTab = parent.$('#tabs').tabs('getSelected').panel('options').title;
  var _mainText, _subText, _filedType;
  if (currentTab === '门药时间报表') {
    _mainText = '平均门药时间';
    _subText = '门药时间达标率';
    _filedType = 'mysj';
  } else {
    _mainText = '平均门球时间';
    _subText = '门球时间达标率';
    _filedType = 'mqsj';
  }
  </script>
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
      $('.left_title').html(_mainText);
      $('.right_title').html(_subText);
      var _param = getParams();
      if (_param == false) {
        return;
      }
      publicFun.httpServer({ url: '${baseurl}zyyreport/averageDrug_result.do' }, _param, function (data) {
        var res = data.msg;
        loadChart(res.columnList, 'column', res.countList[0].avgtime);
        if (res.pieList.length > 0) {
          loadChart(res.pieList, 'pie');
        } else {
          var _pieList = [{ complianceCount: 0, noComplianceCount: 0}]
          loadChart(_pieList, 'pie');
        }
      })
    }

    function loadChart(chartData, chartsType, text) {
      var _title = '人数', _idContainer = '', _averageText = '';
      var categoriesArr = [], seriesArr = [];
      if (chartsType === 'column') {
        _idContainer = 'containerLine';
        var seriesData = {
          data: [],
          name: _title
        };
        for (var i = 0; i < chartData.length; i++) {
          categoriesArr.push(chartData[i].inter);
          seriesData.data.push(chartData[i].zgcount - 0);
        }
        seriesArr.push(seriesData);
        if (text !== '' && text != null) {
          _averageText = _mainText + text + '分'
        } else {
          _averageText = _mainText
        }
      } else {
        _idContainer = 'containerPie';
        var seriesData = {
          data: [{
            'name': '达标率',
            'y': chartData[0].complianceCount - 0
          }, {
            'name': '非达标率',
            'y': chartData[0].noComplianceCount - 0
          }], name: '人数'
        };
        seriesArr.push(seriesData);
      }
      $('#' + _idContainer).highcharts({
        chart: {
          type: chartsType,
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        title: {
          text: _averageText
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
          allowDecimals: false,
          title: {
            text: _title
          }
        },
        tooltip: { //数据提示框
          fheaderFormat: '<table>',
          pointFormat: '<tr><td><span style="color:{series.color};padding:0">{series.name}</span>: </td>' +
            '<td style="padding:0"><b>{point.y:.0f} 人</b></td></tr>',
          footerFormat: '</table>',
          shared: true,
          useHTML: true
        },
        legend: {
          itemStyle: {
            'fontSize': '12px'
          }
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
          },
          pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              format: '<b>{point.name}</b>: {point.percentage:.2f} %',
              style: {
                color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
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
      $("#containerLine").height(height - 67);
      $("#containerPie").height(height - 67);
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
        "querytype": queryType,
        "filedType": _filedType
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
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startDate_day"
            onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
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
        <p class="chart_title left_title"></p>
        <div id="containerLine" class="chart_div"></div>
      </div>
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title right_title"></p>
        <div id="containerPie" class="chart_div"></div>
      </div>
    </div>
  </form>
</body>

</html>