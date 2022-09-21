 <%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>手术操作统计报表</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
</head>

<body class="median">
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryResult()
      }
    });

    function reload() {
      queryResult();
    }

    function setLayPut() {
      var height = ($("#tabs", parent.document).height()) * 0.75;
      $("#container").height(height - 67);
      $("#tabList").height(height);
    }

    $(function () {
      defaultCheck();
      setTime('year', 'yyyy');
      setLayPut();
      queryResult();
      $(window).resize(function () {
        $('#tabList').datagrid('reload');
      });
    });

    function loadChart(chartData, chartsType) {
      var categoriesArr = [], seriesArr = [], _title = '人数';
      var _xTitle = getParams().startdate;
      if (chartData.length > 0) {
        _xTitle = chartData[0].queryDate
      }
      var seriesData = {
        data: [],
        name: _xTitle
      };
      for (var i = 0; i < chartData.length; i++) {
        categoriesArr.push(chartData[i].operNam);
        seriesData.data.push(chartData[i].operateCount - 0);
      }
      seriesArr.push(seriesData);
      $('#container').highcharts({
        chart: {
          type: chartsType,
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        legend: {
          itemStyle: {
            'fontSize': '12px'
          }
        },
        title: { //大标题
          text: ''
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
        credits: { //版权信息
          enabled: false
        },
        tooltip: { //数据提示框
          fheaderFormat: '<table>',
          pointFormat: '<tr><td><span style="color:{series.color};padding:0">人数</span>: </td>' +
            '<td style="padding:0"><b>{point.y:.0f} 个</b></td></tr>',
          footerFormat: '</table>',
          shared: true,
          useHTML: true
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
        series: seriesArr
      });
    }

    function loadTable(start, end) {
      var _param = getParams();
      if (_param == false) {
        return false;
      }
      publicFun.httpServer({ url: '${baseurl}zyyreport/operation_result.do' }, _param, function (data) {
        var _list = data.msg.list;
        var _totalData = {
          rows: _list
        };
        $('#tabList').datagrid({
          title: "手术操作统计列表",
          nowrap: true,
          striped: true,
          singleSelect: true,
          idField: '1',
          data: _totalData,
          loadMsg: '',
          columns: [
            [{
              field: 'queryDate',
              title: '时间 ',
              width: getWidth(0.3)
            }, {
              field: 'operNam',
              title: '手术名称',
              width: getWidth(0.3),
              formatter: function (value, row, index) {
            	if(value==null){
            		return "未选择手术"
            	}
            	return value;
          	  },
            }, {
              field: 'operateCount',
              title: '手术人数',
              width: getWidth(0.28)
            }]
          ],
          pagination: false,
          rownumbers: true,
          toolbar: [{
            id: 'btnadd',
            text: '导出',
            iconCls: 'icon-redo',
            handler: function () {
              _confirm('确定导出吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}zyyreport/exportOperationSubmit.do' }, _param, function (res) {
                  message_alert(res);
                })
              });
            }
          },{
	        id: '',
	        text: '患者明细列表',
	        iconCls: 'icon-add',
	        handler: function () {
	            patientDetail()
	        }
      }]
        });
        loadChart(_list, 'column');
      })
    }
    
    
    function generateParam() {
      var startTime;
      var dateType = $('#chooseType').val();
      if (dateType === 'day') {
        startTime = $('#startDate_day').val();
      } else if (dateType === 'year') {
        startTime = $('#startDate_year').val();
      } else {
        startTime = $('#startDate_month').val();
      }
      var rtnObj = {};
      rtnObj = { 'querytype': dateType, 'startdate': startTime, 'enddate': startTime }
      return rtnObj
    }
    
	/**
	 * 患者明细
	 */
     function patientDetail() {
      var node = $('#tabList').datagrid('getSelected');
      var allMsgParam = generateParam();
      var querytype = $("#chooseType").val();
        var startdate, enddate, halfdate = "firstHalf";
        startdate = allMsgParam.startdate;
        enddate = allMsgParam.enddate;
        var pageName = "fzz";
        if (!startdate) {
          publicFun.alert('开始时间不能为空');
          return false;
        }
        parent.opentabwindow("患者明细",
          '${baseurl}zyyreport/ssczhzlb.do?startdate=' + startdate + '&enddate=' + enddate + '&querytype=' + querytype +'&pageName='+pageName);
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
      $('#chooseType').val(type);
    };
	
	function defaultCheck(){
		$("#operNam").attr('checked', 'checked');
	}

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

    //获取传给后端的参数
    function getParams() {
      var queryType = $("#chooseType").val();
      var startDate = $("#startDate_" + queryType).val();
      var queryDate = $("#startDate_" + queryType).val();
      if (!startDate) {
        publicFun.alert('查询时间不能为空');
        return false;
      }
      var queryParams = {
        "startdate": startDate,
        "querytype": queryType,
        "queryDate": queryDate
      };
      return queryParams;
    }

    //查询方法
    function queryResult() {
      loadTable();
    }
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
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startDate_range" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="chart_grp chartbox">
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">手术操作统计</p>
      <div id="container" class="chart_div"></div>
    </div>
    <!-- 查询列表 -->
    <div class="list_table" id="list_table">
      <table id="tabList"></table>
    </div>
  </div>
</body>

</html> 
