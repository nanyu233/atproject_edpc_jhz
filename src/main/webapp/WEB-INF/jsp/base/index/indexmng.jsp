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
	    <form id="diacrisis" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post" class="blform">
	      <p><img src="images/hems/index/pie.png" class="titleimg" />诊断统计</p>
	      <div id="container_pie_zdtj" class="blimg"></div>
	    </form>
	  </div>
	  <div class="left_bottom">
	    <form id="patOutcome" name="hceptform" action="${baseurl}report/exporthspemgSubmit.do" method="post" class="blform">
	      <p><img src="images/hems/index/pie.png" class="titleimg" />转归情况</p>
	      <div id="container_pie_zgqk" class="blimg"></div>
	    </form>
	  </div>
  </div>
  <div class="center_part">
	<div class="center_top">
		<img src="images/common/bigScreen/left.png" style="width:80%;height:100%;float:left;">
		<div class="title">胸痛中心数据总览</div>
		<img src="images/common/bigScreen/right.png" style="width:80%;height:100%;float:right;">
	</div>
    <div class="center_center">
      <div class="btmdiv" id="zjzyrsdiv">
        <p><img src="images/hems/index/column.png" class="titleimg" />胸痛患者趋势图</p>
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
				  <p class="number YNHZ_right"></p>
				  <p class="textBox">院内患者</p>
			  </div>
			  <div class="right">
				  <p class="number JZHZ_right"></p>
				  <p class="textBox">急诊患者</p>
			  </div>
		  </div>
		  <div class="titleLine">
			  <div class="left">
				  <p class="number RXHZ_right"></p>
				  <p class="textBox">绕行患者</p>
			  </div>
			  <div class="right">
				  <p class="number ZXLY_right"></p>
				  <p class="textBox">自行来院</p>
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
	
	function setTime() {
		var nowDate = new Date();
	    endDate = publicFun.timeFormat(nowDate, "yyyy/MM");
	    startDate = publicFun.timeFormat(new Date().setMonth(nowDate.getMonth() - 6), "yyyy/MM");
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
		    url: 'edpcReport/querycpctrend_result.do',
			type: 'post',
			data:{
			    startDate: startDate,
			    endDate:endDate
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
		    url: 'home/getGjzktjData.do',
			type: 'post',
			dataType: 'json',
			contentType: 'application/json;charset=UTF-8',
		    success: function(res) {
				var data = res.resultInfo.sysdata.list || [];
				trendChart(data, "timeline");
		    }
		});
	}
    function trendChart(rows, chartstype) {
	  var categories = []; // categories
	  var poctdata = [],
	      kxxbdata = [],
		  xdtqzdata = [],
		  dstgdata = [],
		  dgsjhdata = [];
	  for(var i=0;i<rows.length;i++){
		  var el = rows[i];
		  if(categories.indexOf(el.yearmon) === -1) {
		  	categories.push(el.yearmon);
		  }
		  for(var key in el){
			  if(key == 'poct') {
			  	poctdata.push(el[key]);
			  }else if(key == 'kxxb'){
				kxxbdata.push(el[key]);
			  }else if(key == 'xdtqz'){
				xdtqzdata.push(el[key]);  
			  }else if(key == 'dstg'){
				dstgdata.push(el[key]);  
			  }else if(key == 'dgsjh'){
				dgsjhdata.push(el[key]);  
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
		    name:'血化验报告',
			type: 'line',
			data:poctdata
		},{ //数据列
		    name:'血小板给药',
			type: 'line',
			data:kxxbdata
		},{ //数据列
			name:'心电图确诊',
			type: 'line',
			data:xdtqzdata
		},{ //数据列
			name:'导丝通过',
			type: 'line',
			data:dstgdata
		},{ //数据列
			name:'导管室激活',
			type: 'line',
			data:dgsjhdata
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
		    url: 'edpcReport/querycpcpie_result.do',
			type: 'post',
			dataType: 'json',
			contentType: 'application/json;charset=UTF-8',
		    success: function(res) {
				loadChart(res.rows, "pie");
		    }
		  });
	}
	function loadChart(rows, chartstype) {
		  var series = []; // series
		  var seriesData = [];
		  $.each(rows, function(ind, val) {
			seriesData.push(new SeriesData(val.info, val.total))
		  });
  		  series.push(new Series('诊断统计', seriesData))
		  $('#container_pie_zdtj').highcharts({
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
       
    // 创建图例 转归情况
	function Outcome(){
		$.ajax({
		    url: 'home/getZgqktjData.do',
			type: 'post',
			dataType: 'json',
			contentType: 'application/json;charset=UTF-8',
		    success: function(res) {
				ZGQKChart(res.resultInfo.sysdata.zgqk, "pie");
		    }
		});
	} 
	function ZGQKChart(rows, chartstype){
		var series = []; // series
		var seriesData = [];
		$.each(rows, function(ind, val) {
			seriesData.push(new SeriesData(val.info, val.total))
		});
		series.push(new Series('转归情况', seriesData))
		$('#container_pie_zgqk').highcharts({
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
		      pointFormat: '<span style="color:{point.color};background:none">{point.name}</span>: <b> {point.percentage:.2f}%</b>'
		    },
		    series:series
	   });
	}
	//来院方式
	function ArriveHospital(){
		$.ajax({
		    url: 'home/getLyfstjData.do',
			type: 'post',
			dataType: 'json',
			contentType: 'application/json;charset=UTF-8',
		    success: function(res) {
				LYFSChart(res.resultInfo.sysdata.lyfs, "pie");
		    }
		});
	}
	function LYFSChart(rows, chartstype){
		var series = []; // series
		var seriesData = [];
		$.each(rows, function(ind, val) {
			seriesData.push(new SeriesData(val.info, val.total))
		});
		series.push(new Series('来院方式', seriesData))
		$('#container_pie_lyfs').highcharts({
		     chart: {
		       type: 'pie',
			   backgroundColor: ''
		     },
		     colors: [
			   'red', //第一个颜色，
		       'green',
		       '#f90', 
		 	  '#f15c80',
			   'blue'
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
   
   function init(){
	   setTime();
	   initChart();
	   trendData();
	   getData();
	   ArriveHospital();
	   wlyyHospital();
	   Outcome();
   }
   
	$(function () {
	  init();
	  $.ajax({
	      url:'home/getBlsltjData.do',
	      type:'post',
	      dataType:'json',
	      contentType: 'application/json;charset=UTF-8',
	      success:function (res) {
			var hztj = res.resultInfo.sysdata.hztj;
			$('.day_left').html(hztj.thisDay);
			$('.month_left').html(hztj.thisMonth);
			$('.week_left').html(hztj.thisWeek);
			$('.year_left').html(hztj.thisYear);
			var hzfl = res.resultInfo.sysdata.hzfl;
			for(var i=0;i<hzfl.length;i++){
				var el = hzfl[i];
				if(el.wayTyp == '0'){
					$('.JZHZ_right').html(el.total)
				}else if(el.wayTyp == '1'){
					$('.RXHZ_right').html(el.total)
				}else if(el.wayTyp == '2'){
					$('.YNHZ_right').html(el.total)
				}else{
					$('.ZXLY_right').html(el.total)
				}
			}
	  	}
	  })
    });
  </script>
</body>

</html>