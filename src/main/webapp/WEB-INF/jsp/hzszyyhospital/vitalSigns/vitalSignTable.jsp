<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>生命体征趋势图</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
</head>

<body class="vitalSign">
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-more.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
  <script type="text/javascript">
    var comdata = parent.comdata;

    function drawChart(data) {
      var chart = Highcharts.chart('container', {
        chart: {
          zoomType: 'xy'
        },
        credits: {
          enabled: false
        },
        title: {
          text: ''
        },
        subtitle: {},
        xAxis: {
          categories:data.dateList
        },
        yAxis: [{ // Tertiary yAxis
          gridLineWidth: 0,
          title: {
            text: '血压',
            style: {
              color: Highcharts.getOptions().colors[0]
            }
          },
          labels: {
            format: '{value} mmHg',
            style: {
              color: Highcharts.getOptions().colors[0]
            }
          },
          opposite: true
        },{ // Primary yAxis
          labels: {
            format: '{value}°C',
            style: {
              color: Highcharts.getOptions().colors[1]
            }
          },
          title: {
            text: '体温',
            style: {
              color: Highcharts.getOptions().colors[1]
            }
          }
        }, { // Secondary yAxis
          gridLineWidth: 0,
          title: {
            text: '心率',
            style: {
              color: Highcharts.getOptions().colors[5]
            }
          },
          labels: {
            format: '{value} 次/分',
            style: {
              color: Highcharts.getOptions().colors[5]
            }
          }
        }, { // Tertiary yAxis
          gridLineWidth: 0,
          title: {
            text: '呼吸',
            style: {
              color: Highcharts.getOptions().colors[3]
            }
          },
          labels: {
            format: '{value} 次/分',
            style: {
              color: Highcharts.getOptions().colors[3]
            }
          }
        }, { // Tertiary yAxis
          gridLineWidth: 0,
          title: {
            text: '血氧饱和',
            style: {
              color: Highcharts.getOptions().colors[4]
            }
          },
          labels: {
            format: '{value} %',
            style: {
              color: Highcharts.getOptions().colors[4]
            }
          },
          opposite: true
        }, { // Tertiary yAxis
          gridLineWidth: 0,
          title: {
            text: '血糖',
            style: {
              color: Highcharts.getOptions().colors[7]
            }
          },
          labels: {
            format: '{value} mmol/L',
            style: {
              color: Highcharts.getOptions().colors[7]
            }
          },
          opposite: true
        }],

        tooltip: {
          shared: true
        },
        // legend: {
        //   layout: 'vertical',
        //   align: 'left',
        //   x: 80,
        //   verticalAlign: 'top',
        //   y: 55,
        //   floating: true,
        //   backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF'
        // },
        series: [{
          name: '血压',
          type: 'columnrange',
          data: data.sbpNbrList,
          tooltip: {
            valueSuffix: ' mmHg'
          },
          dataLabels: {
            enabled: true,
            color: Highcharts.getOptions().colors[0]
          }
        }, {
          name: '体温',
          type: 'spline',
          yAxis: 1,
          data: data.tmpNbrList,
          connectNulls: true,
          tooltip: {
            valueSuffix: ' °C'
          },
          dataLabels: {
            enabled: true,
            color: Highcharts.getOptions().colors[1]
          }
        }, {
          name: '心率',
          type: 'spline',
          yAxis: 2,
          data: data.hrtRteList,
          connectNulls: true,
          // marker: {
          //   enabled: false
          // },
          // dashStyle: 'shortdot',
          tooltip: {
            valueSuffix: ' 次/分'
          },
          color: Highcharts.getOptions().colors[5],
          dataLabels: {
            enabled: true,
            color: Highcharts.getOptions().colors[5]
          }
        }, {
          name: '呼吸',
          type: 'spline',
          yAxis: 3,
          data: data.breNbrList,
          connectNulls: true,
          tooltip: {
            valueSuffix: ' 次/分'
          },
          color: Highcharts.getOptions().colors[3],
          visible: false,
          dataLabels: {
            enabled: true,
            color: Highcharts.getOptions().colors[3]
          }
        }, {
          name: '血氧饱和',
          type: 'spline',
          yAxis: 4,
          data: data.xyList,
          connectNulls: true,
          tooltip: {
            valueSuffix: ' %'
          },
          color: Highcharts.getOptions().colors[4],
          visible: false,
          dataLabels: {
            enabled: true,
            color: Highcharts.getOptions().colors[4]
          }
        }, {
          name: '血糖',
          type: 'spline',
          connectNulls: true,
          yAxis: 5,
          data: data.xtList,
          tooltip: {
            valueSuffix: '  mmol/L'
          },
          color: Highcharts.getOptions().colors[7],
          visible: false,
          dataLabels: {
            enabled: true,
            color: Highcharts.getOptions().colors[7]
          }
        }]
      })
    }
    function dealData(arr){
      var smtzData = {tmpNbrList : [],xyList : [],breNbrList : [],sbpNbrList : [],hrtRteList : [],xtList : [],dateList:[]};
      var msgList = ['tmpNbr','hrtRte','breNbr','xt','xy'];
      $.each(arr,function(idx,val){
        $.each(msgList,function(_idx,_val){
          if(val[_val] != null){
            smtzData[_val+'List'].push(val[_val])
          }else{
            smtzData[_val+'List'].push('')
          }
        })
        if(val['sbpUpNbr'] != null && val['sbpDownNbr'] != null){
          smtzData['sbpNbrList'].push([val['sbpUpNbr'],val['sbpDownNbr']])
        }else{
          smtzData['sbpNbrList'].push(['',''])
        }
        smtzData['dateList'].push(val['crtDateStr'])
      })
      drawChart(smtzData);
    }

    function queryResult() {
      var start = $("#startDate").val();
      var end = $("#endDate").val();
      var param = { "startdate": start, "enddate": end,'hsphljldinfCustom.emgSeq':comdata.emgSeq};
      publicFun.httpServer({url: '${baseurl}zyytrend/queryVitalSigns_result.do'}, param, function (data) { 
        dealData(data.rows);
      })
    }
    function setLayOut() {
      var height = ($("#tabs", parent.parent.parent.document).height()) * 0.75;
      $("#container").height(height - 67);
    }
    $(function () {
      setLayOut()
      queryResult();
      $(window).resize(function () {
        queryResult();
      });
    });

  </script>
<style type="text/css">
  .radioLi{
    line-height: 26px;
    margin-left:5px
  }
  </style>
<form id="medianform" action="${baseurl}report/exportMedianSubmit.do" method="post">
  <!-- html的静态布局 -->
  <!-- 查询条件 -->
  <div class="m-b5">
    <div class="m-t10 div_h">
      <ul class="querylist-ul form_hc">
        <li class="radioLi">
          <input type="text" class="input-date Wdate" id="startDate" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})">
          至
          <input type="text" class="input-date Wdate" id="endDate" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})" />
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
  <div class="no_background form_wholepage">
    <p class="chart_title">患者体征趋势图</p>
    <div id="container" class="chart_div"></div>
  </div>
</div>

</body>
</html>