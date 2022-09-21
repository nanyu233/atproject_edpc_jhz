<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<html>

<head>
  <base href="<%=basePath%>">
  <title>index</title>
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="content-type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/index.css?5">
  <script src="${baseurl}lib/highcharts8.0.0/highcharts.js"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/modules/exporting.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/modules/drilldown.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts8.0.0/highcharts-more.js"></script>
</head>

<body class="indexBody">
  <div class="left_part">
	  <div class="left_top">
		  <div class="titleLine">
			  <div class="left">
				  <p class="number day_left"></p>
				  <p class="textBox">新增病例</p>
			  </div>
			  <div class="right">
				  <p class="number week_left"></p>
				  <p class="textBox">本周新增</p>
			  </div>
		  </div>
		  <div class="titleLine">
			  <div class="left">
				  <p class="number month_left"></p>
				  <p class="textBox">本月新增</p>
			  </div>
			  <div class="right">
				  <p class="number year_left"></p>
				  <p class="textBox">本年累计</p>
			  </div>
		  </div>
	  </div>
	  <div class="left_center">
	    <form id="hceptform" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post" class="blform">
	      <p><img src="images/hems/index/pie.png" class="titleimg" />诊断统计</p>
	      <div id="container_pie_zdtj" class="blimg"></div>
	    </form>
	  </div>
	  <div class="left_bottom">
	    <form id="hceptform" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post" class="blform">
	      <p><img src="images/hems/index/pie.png" class="titleimg" />转归情况</p>
	      <div id="container_pie_zgqk" class="blimg"></div>
	    </form>
	  </div>
  </div>
  <div class="center_part">
	<div class="center_top">
		<img src="images/common/bigScreen/left.png" style="width:80%;height:100%;float:left;">
		<div class="title">卒中中心数据总览</div>
		<img src="images/common/bigScreen/right.png" style="width:80%;height:100%;float:right;">
	</div>
    <div class="center_center">
      <div class="btmdiv" id="zjzyrsdiv">
        <p><img src="images/hems/index/column.png" class="titleimg" />患者趋势图</p>
        <div id="container_cols" class="blimg"></div>
      </div>
    </div>
	<div class="center_bottom">
	  <form name="jzhzqsform" action="${baseurl}report/exportjhz.do" method="post" class="btmdiv">
	    <p><img src="images/hems/index/column.png" class="titleimg" />关键质控趋势图</p>
	    <div id="container" class="blimg"></div>
	  </form>
	</div>
  </div>
  <div class="right_part">
	  <div class="right_top">
		  <div class="titleLine">
			  <div class="left">
				  <p class="number HZZS_right"></p>
				  <p class="textBox">患者总数</p>
			  </div>
			  <div class="right">
				  <p class="number RSZS_right"></p>
				  <p class="textBox">溶栓总数</p>
			  </div>
		  </div>
		  <div class="titleLine">
			  <div class="left">
				  <p class="number JRZS_right"></p>
				  <p class="textBox">介入总数</p>
			  </div>
			  <div class="right">
				  <p class="number ZYZS_right"></p>
				  <p class="textBox">住院总数</p>
			  </div>
		  </div>
	  </div>
	  <div class="right_center">
	    <form id="hceptform" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post" class="blform">
	      <p><img src="images/hems/index/pie.png" class="titleimg" />来院方式</p>
	      <div id="container_pie_lyfs" class="blimg"></div>
	    </form>
	  </div>
	  <div class="right_bottom">
	    <form id="hceptform" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post" class="blform">
	      <p><img src="images/hems/index/pie.png" class="titleimg" />网络医院</p>
	      <div id="container_pie_wlyy" class="blimg"></div>
	    </form>
	  </div>
    </div>
  </div>
  <script type="text/javascript">
	
    var chart;
	var startDate;
	var endDate;
	var startDate2;
	var endDate2;
	
	function setTime() {
		var nowDate = new Date();
	    endDate = publicFun.timeFormat(nowDate, "yyyy-MM-dd");
	    startDate = publicFun.timeFormat(new Date().setMonth(nowDate.getMonth() - 6), "yyyy-MM-dd");
		endDate2 = publicFun.timeFormat(nowDate, "yyyy-MM");
		startDate2 = publicFun.timeFormat(new Date().setMonth(nowDate.getMonth() - 6), "yyyy-MM");
	}
	function Element(name, type, yAxis, data, zIndex) {
		this.name = name;
		this.type = type;
		this.yAxis = yAxis;
		this.data = data;
		this.zIndex= zIndex;
	}
    function initChart() {
		$.ajax({
		    url: 'edpcReport/getCzhzqst.do',
			type: 'post',
			data:{
			    startDate: startDate2,
			    endDate:endDate2
			},
		    success: function(res) {
				var data = res.rows || [];
				getLineChart(data, "timeline");
		    }
		});
    }
    // 获取急诊患者趋势图图表
    function getLineChart(rows, chartstype) {
	    var series = [], // series
			categories = []; // categories
		var xtByzdCodArr = [];
		$.each(rows, function(ind, val) {
			if(categories.indexOf(val.yarmon) === -1) {
				categories.push(val.yarmon);
			}
			if(xtByzdCodArr.indexOf(val.info) === -1) {
				xtByzdCodArr.push(val.info);
			}
		});
		var total = 0;
		var totalData = [];
		$.each(rows, function(ind, val) {
			var count = ind + 1;
			total += val.total;
			if(count % xtByzdCodArr.length === 0) {
				totalData.push(total)
				total = 0;
			}
		});
		series.push(new Element('当月总人数', 'line', 1, totalData, 2));
	// 			console.log('series', series)
		$.each(xtByzdCodArr, function(index, value) {
			var data = [];
			$.each(rows, function(ind, val) {
				if(val.info === value) {
					data.push(val.total)
				}
			});
			series.push(new Element(value, 'column', 0, data, 1))
		});
      Highcharts.setOptions({
        lang: {
          months: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
          shortMonths: ['01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'],
          weekdays: ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六']
        }
      });
      chart = Highcharts.chart('container_cols', {
        chart: { //图标配置
          zoomType: 'xy',
          backgroundColor: ''
        },
        title: { //大标题
          text: ''
        },
        tooltip: { //数据提示框
          // pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b><br/>',
          // shared: true
		  shared: false
        },
        xAxis: [{
        	categories: categories,
        	crosshair: true,
			labels: {
			  style: {
			    fontSize: '13px',
			    fontFamily: 'Verdana, sans-serif',
			    "color": '#fff',
				"textOutline":"none"
			  }
			}
        }],
        yAxis: [{ // Primary yAxis
        	allowDecimals: false,
        	title: {
        		text: '例数 (人)',
        		style: {
        			"color": '#fff',
					"textOutline":"none"
        		}
        	},
        	labels: {
        		format: '{value}',
        		style: {
        			"color": '#fff',
					"textOutline":"none"
        		}
        	}
        }, { // Secondary yAxis
        	gridLineWidth: 0,
        	allowDecimals: false,
        	title: {
        		text: '总人数',
        		style: {
        			"color": '#fff',
					"textOutline":"none"
        		}
        	},
        	labels: {
        		format: '{value}',
        		style: {
        			"color": '#fff',
					"textOutline":"none"
        		}
        	},
        	opposite: true
        }],
        credits: { //版权信息
          enabled: false
        },
        exporting: { //导出按钮
          enabled: false
        },
        legend: {
		  layout: 'horizontal',
		  align: 'center',
		  verticalAlign: 'bottom',
		  symbolWidth: 10,
		  itemDistance: 5,
		  itemStyle: {
		    'fontSize': '10px',
		    'color': '#fff',
			"textOutline":"none"
		  },
		  x: 0,
		  y: 10
        },
        plotOptions: { //数据列配置
			line: {
				allowPointSelect: true,
				cursor: 'pointer',
				dataLabels: {
					enabled: true
				},
				showInLegend: true
			}
        },
        series: series
      });
    }
  
	// 关键质控趋势图
	function trendData(){
		$.ajax({
		    url: 'edpcReport/getCzgjzkqst.do',
			type: 'post',
			data:{
			    startDate:startDate2,
			    endDate:endDate2
			},
		    success: function(res) {
				var data = res.resultInfo.sysdata.jsonArray || [];
				trendChart(data, "timeline");
		    }
		});
	}
    function trendChart(rows, chartstype) {
	  var categories = []; // categories
	  var dntdata = [],
	      jcjgdata = [],
		  jycxdata = [],
		  zddata = [];
	  for(var i=0;i<rows.length;i++){
		  var el = rows[i];
		  if(categories.indexOf(el.yearmon) === -1) {
		  	categories.push(el.yearmon);
		  }
		  console.log(categories)
		  for(var key in el){
			  if(key == 'dnt') {
			  	dntdata.push(el[key]);
			  }else if(key == 'jcjg'){
				jcjgdata.push(el[key]);
			  }else if(key == 'jycx'){
				jycxdata.push(el[key]);  
			  }else if(key == 'zd'){
				zddata.push(el[key]);  
			  }
		  }
	  }
      var chart2 = Highcharts.chart('container', {
		chart: { //图标配置
		  zoomType: 'xy',
		  // backgroundColor: '#fff'
		  backgroundColor: ''
		},
        title: { //大标题
          text: ''
        },
        xAxis: [{
			crosshair: true,
			categories: categories,
			labels: {
			  style: {
			    fontSize: '13px',
			    fontFamily: 'Verdana, sans-serif',
			    color: '#fff'
			  }
			}
        }],
        yAxis: { //Y轴设置
		    allowDecimals: false,
			title: {
				text: '',
				style: {
					"color": '#fff',
					"textOutline":"none"
				}
			},
			labels: {
			  format: '{value}',
			  style: {
			    "fontSize": '13px',
			    "fontFamily": 'Verdana, sans-serif',
			    "color": '#fff',
				"textOutline":"none"
			  }
			}
        },
        credits: { //版权信息
          enabled: false
        },
        exporting: { //导出按钮
          enabled: false
        },
		legend: {
		  layout: 'horizontal',
		  align: 'center',
		  verticalAlign: 'bottom',
		  symbolWidth: 10,
		  itemDistance: 5,
		  itemStyle: {
		    'fontSize': '10px',
		    'color': '#fff',
			"textOutline":"none"
		  },
		  x: 0,
		  y: 10
		},
		plotOptions: {
		  line: {
		  	allowPointSelect: true,
		  	cursor: 'pointer',
		  	dataLabels: {
		  		enabled: true
		  	},
		  	showInLegend: true
		  }
		},
        series:[{ //数据列
		    name:'DNT时间',
			type: 'line',
			data:dntdata
		},{ //数据列
		    name:'检查时间',
			type: 'line',
			data:jcjgdata
		},{ //数据列
			name:'抽血时间',
			type: 'line',
			data:jycxdata
		},{ //数据列
			name:'诊断时间',
			type: 'line',
			data:zddata
		}]
      });
    }
    
	function SeriesData(name,y) {
    	this.name = name;
    	this.y = y;
    }
    function Series(name, data) {
    	this.name = name;
    	this.data = data;
    } 
	// 诊断统计表格 
	function getData(){
		$.ajax({
		    url: 'edpcReport/getZdtjCz.do',
			type: 'post',
			data:{
				startDate: startDate,
				endDate:endDate
			},
		    success: function(res) {
				var rows = res.rows || [];
				var series = []; // series
				var seriesData = [];
				$.each(rows, function(ind, val) {
					seriesData.push(new SeriesData(val.info, val.patNumb))
				});
				series.push(new Series('诊断统计', seriesData))
				loadChart('#container_pie_zdtj',series);
		    }
		  });
	}   
    // 创建图例 转归情况
	function Outcome(){
		$.ajax({
		    url: 'edpcReport/getZgqkCz.do',
			type: 'post',
			data:{
				startDate: startDate,
				endDate:endDate
			},
		    success: function(res) {
				var rows = res.rows || [];
				var series = []; // series
				var seriesData = [];
				$.each(rows, function(ind, val) {
					seriesData.push(new SeriesData(val.info, val.patNumb))
				});
				series.push(new Series('转归情况', seriesData))
				loadChart('#container_pie_zgqk',series);
		    }
		});
	} 

	//来院方式
	function ArriveHospital(){
		$.ajax({
		    url: 'edpcReport/getLyfstCz.do',
			type: 'post',
			data:{
				startDate: startDate,
				endDate:endDate
			},
		    success: function(res) {
				var rows = res.rows || [];
				var series = []; // series
				var seriesData = [];
				$.each(rows, function(ind, val) {
					seriesData.push(new SeriesData(val.info, val.patNumb))
				});
				series.push(new Series('来院方式', seriesData))
				loadChart('#container_pie_lyfs',series);
		    }
		});
	} 
	//网络医院
	function wlyyHospital(){
		$.ajax({
		    url: 'home/getWlyyData.do',
			type: 'post',
			dataType: 'json',
			contentType: 'application/json;charset=UTF-8',
		    success: function(res) {
				WLYYChart(res.resultInfo.sysdata.wlyy, "pie");
		    }
		});
	}
	function WLYYChart(rows, chartstype){
		var series = []; // series
		var seriesData = [];
		$.each(rows, function(ind, val) {
			seriesData.push(new SeriesData(val.info, val.total))
		});
		series.push(new Series('网络医院', seriesData))
		$('#container_pie_wlyy').highcharts({
		     chart: {
		       type: 'pie',
			   backgroundColor: ''
		     },
		     colors: [
				'red',
		       'green',
		       '#ccc',
		 	  '#f15c80'
		     ],
		 	plotArea: {
		 	    shadow: null,
		 	    borderWidth: null,
		 	    backgroundColor: null
		 	},
		     legend: {
		 		symbolWidth: 10,
		 		padding: 0,
		 		margin: 2,
		 		itemDistance: 5,
		 		itemStyle: {
		 		    fontWeight: '400',
		 		    fontSize: '8px',
					color:'#fff'
		 		},
		 		x: 0,
		 		y: 0
		     },
		     title: {
		       text: ''
		     },
		     exporting: { //导出按钮
		       enabled: false
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
		           format: '<span style="color:{point.color};background:none">{point.name}: {point.y}例 ({point.percentage:.2f}%)</span>',
		 		  style: {
		 		      "fontSize": "9px",
					  "textOutline":"none"
		 		  },
		 		  // distance: 3
		         },
		         showInLegend: true,
		 		size: 120,
		 		startAngle: 100
		       }
		     },
		     tooltip: {
		       headerFormat: '<span>{series.name}</span>',
		       pointFormat: '<span style="color:{point.color};background:none">{point.name}</span>: <b> {point.percentage:.2f}%</b>'
		     },
		     series:series
		   });
	}
    
	function loadChart(idName,series) {
    	  $(idName).highcharts({
    	      chart: {
    	        type: 'pie',
    			backgroundColor: ''
    	      },
    	      colors: [
    	        'red', //第一个颜色，
    	        '#f90', //第二个颜色
    	        'yellow', //第三个颜色
    	        'green', //第四个颜色
    	        'blue',
    	        '#ccc',
    	  	  '#f15c80'
    	      ],
    	  	plotArea: {
    	  	    shadow: null,
    	  	    borderWidth: null,
    	  	    backgroundColor: null
    	  	},
    	      legend: {
    	  		symbolWidth: 10,
    	  		padding: 0,
    	  		margin: 2,
    	  		itemDistance: 5,
    	  		itemStyle: {
    	  		    fontWeight: '400',
    	  		    fontSize: '8px',
    				color:'#fff'
    	  		},
    	  		x: 0,
    	  		y: 0
    	      },
    	      title: {
    	        text: ''
    	      },
    	      exporting: { //导出按钮
    	        enabled: false
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
    	            format: '<span style="color:{point.color};background:none">{point.name}: {point.y}例 ({point.percentage:.2f}%)</span>',
    	  		  style: {
    	  		      "fontSize": "9px",
    				  "textOutline":"none"
    	  		  },
    	  		  // distance: 3
    	          },
    	          showInLegend: true,
    	  		size: 120,
    	  		startAngle: 100
    	        }
    	      },
    	      tooltip: {
    	        headerFormat: '<span>{series.name}</span>',
    	        pointFormat: '<span style="color:{point.color};background:none">{point.name}: {point.y}例 ({point.percentage:.2f}%)</span>'
    	      },
    	      series:series
    	});
      }
    
   function init(){
	   setTime();
	   initChart();
	   trendData();
	   getData();
	   ArriveHospital();
	   // wlyyHospital();
	   Outcome();
   }
   
	$(function () {
	  init();
	  $.ajax({
	      url:'edpcReport/getCzFirstPageInfo.do',
	      type:'post',
	      dataType:'json',
	      contentType: 'application/json;charset=UTF-8',
	      success:function (res) {
			var data = res.resultInfo.sysdata;
			$('.day_left').html(data.num_xzbl);
			$('.month_left').html(data.num_byxz);
			$('.week_left').html(data.num_bzxz);
			$('.year_left').html(data.num_bnlj);
			$('.HZZS_right').html(data.num_hzzs)
			$('.RSZS_right').html(data.num_rszs)
			$('.JRZS_right').html(data.num_jrzs)
			$('.ZYZS_right').html(data.num_zyzs)
		}
	  })
    });
  </script>
</body>

</html>