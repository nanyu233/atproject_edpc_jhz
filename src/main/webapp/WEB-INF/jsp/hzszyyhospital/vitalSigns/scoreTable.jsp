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
  <script type="text/javascript">
    var comdata = parent.comdata;
    $(document).ready(function() { 
      $('input[type=radio][name="scoreType"]').change(function () {
        queryResult()
      });
    }) 

    function drawChart(dateList,scoList) {
      //crtdate
      var scoreType = $("input[name='scoreType']:checked").val();
      $('#chartTitle').html(titleList[scoreType]);
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
          categories:dateList
        },
        yAxis: {
          allowDecimals: false,
          title: {
            text: '分'
          }
        },
        credits: {
          enabled: false
        },
        legend: {
          enabled: false
        },
        plotOptions: {
          line: {
            dataLabels: {
              // 开启数据标签
              enabled: true          
            },
            // 关闭鼠标跟踪，对应的提示框、点击事件会失效
            enableMouseTracking: false
          }
        },
        series: [{
          data:scoList,
          type: 'line',
          name: '分值',
          color: '#1981E4'
        }]
      })
    }
   
    function dealData(data){
      var dateList = [],
          scoList = [];
      var scoreType = $("input[name='scoreType']:checked").val();
      var _sconame = scoName[scoreType];
      $.each(data,function(idx,val){
        if(val['cratDat'] != null){
          dateList.unshift(publicFun.timeFormat(val['cratDat'], 'yyyy/MM/dd hh:mm:ss'))
        }else if(val['crttime'] != null){
          dateList.unshift(publicFun.timeFormat(val['crttime'], 'yyyy/MM/dd hh:mm:ss'))
        }else if(val['cretDat'] != null){
          dateList.unshift(publicFun.timeFormat(val['cretDat'], 'yyyy/MM/dd hh:mm:ss'))
        }else if(val['nrsDat'] != null){
          dateList.unshift(publicFun.timeFormat(val['nrsDat'], 'yyyy/MM/dd hh:mm:ss'))
        }
        scoList.unshift(parseInt(val[_sconame]));
      })
      drawChart(dateList,scoList)
    }

    var paramList = ['hspBradenInfCustom.emgSeq','hspAdlInfCustom.emgSeq','',
                   'hspNrsInfCustom.emgSeq','HspGcsInfCustom.gcsSeq','hspZyfxpfInfCustom.emgSeq','hspDdfxpgbInfCustom.emgSeq'];
    var titleList = ['Braden评分趋势图','ADL评分趋势图','','疼痛评分趋势图','GCS评分趋势图','转运风险评分趋势图','Morse评分趋势图']; 
    var scoName =  ['bradenSco','adlSco','','nrsSco','totSco','zyfxpfSco','zf']

    function queryResult() {
      var start = $("#startDate").val();
      var end = $("#endDate").val();
      var scoreType = $("input[name='scoreType']:checked").val();
      var param = { "startdate": start,'scoreType':scoreType, "enddate": end};
      
      var cstAgecodes = parent.parent.vm.patientMsg.cstAgeCod,
          cstAges = parent.parent.vm.patientMsg.cstAge;
      if ((cstAgecodes != '岁' && cstAgecodes != '') || (cstAgecodes == '岁' && cstAges < 14) && scoreType == '2') {
        param = { "startdate": start, "enddate": end,'scoreType':scoreType,'hspDdfxpgbInfCustom.fallRiskFlg': 1};
      } else if(scoreType == '6'){
        param = { "startdate": start, "enddate": end,'scoreType':scoreType};
      }

      $.each(paramList,function(idx,val){
        if(idx == scoreType){
          param[val] = comdata.emgSeq
        }
      })
      publicFun.httpServer({url: '${baseurl}zyytrend/queryScoringTrend_result.do'}, param, function (data) { 
        dealData(data.rows)
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
    })
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
          <input type="text" class="input-base Wdate" id="startDate" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          至
          <input type="text" class="input-base Wdate" id="endDate" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" />
          <span class="f-left">&nbsp;查询时间：</span>
        </li>
        <li class="radioLi">
          <label><input type="radio" id="scoreType0" name="scoreType" value="0" checked="checked"/> Braden评分</label>
          <label><input type="radio" id="scoreType1" name="scoreType" value="1"/> ADL评分</label>
          <label><input type="radio" id="scoreType2" name="scoreType" value="6"/> Morse评分</label>
          <label><input type="radio" id="scoreType3" name="scoreType" value="3"/> 疼痛评分</label>
          <label><input type="radio" id="scoreType4" name="scoreType" value="4"/> GCS评分</label>
          <label><input type="radio" id="scoreType5" name="scoreType" value="5"/> 转运风险评分</label>
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
    <p id="chartTitle" class="chart_title">Braden评分趋势图</p>
    <div id="container" class="chart_div"></div>
  </div>
</div>
</body>
</html>