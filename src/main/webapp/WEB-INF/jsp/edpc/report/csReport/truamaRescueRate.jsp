<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
<title>严重创伤患者抢救成功率</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" href="${baseurl}styles/common/highcharts.css"
	type="text/css" />
<link rel="stylesheet" href="${baseurl}styles/hems/global.css"
	type="text/css" />
</head>

<body class="gkhzjztjt">
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/modules/drilldown.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/modules/exporting.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>

	<script type="text/javascript">
		//enter按键默认触发查询
		$(document).keydown(function(event) {
			switch (event.keyCode) {
			case 13:
				btnsearch()
				return false;
			}
		});
       
        $(function() {
            init();
    		$(window).resize(function() {
    			btnsearch()
    		});
        });

		function setTime() {
			var nowDate = new Date();
		    var endDate = publicFun.timeFormat(nowDate, "yyyy/MM");
		    var startDate = publicFun.timeFormat(new Date().setMonth(nowDate.getMonth() - 6), "yyyy/MM");
		    $("#startDate").val(startDate);
		    $("#endDate").val(endDate);
		}

		function init() {
		    var height = 0.75 * ($("#tabs", parent.document).height());
		    $("#tablelist").height(height);
		    var heightchart = height - 67;
		    $("#container").height(heightchart);
		    setTime()
		    getData();
		}

		//获取传给后端的参数
		function getQueryParams() {
			var queryParams = $("#reportForm").serializeJson();;
// 			console.log(queryParams)
			return queryParams;
		}
		// toolbar工具定义
        function getToolbar() {
            var toolbar_v = [{
                id: '',
                text: '导出',
                iconCls: 'icon-redo',
                handler: function() {
                    _confirm('您确认导出吗？', null, function() {
                        btnexport()
                    });
                }
            }];
            return toolbar_v
        }
        // 报表datagrid列定义
        // yarmon, stemi, nstemi, ua, zdmjc, fss,  nacs, other, total
        function getColumns() {
            var columns_v = [
                [{
                    field: 'yarmon',
                    title: '月份',
                    width: getWidth(0.30)
                }, {
                    field: 'patNumb',
                    title: '抢救成功人数',
                    width: getWidth(0.20)
                }, {
                    field: 'total',
                    title: '总人数',
                    width: getWidth(0.20)
                }, {
                    field: 'rate',
                    title: '抢救成功率',
                    width: getWidth(0.20),
                    formatter: function(value, row, index) {
                    	if(row.total === 0) {
                    		return "-";
                    	}
                    	return value;
                    }
                }]
            ];
            return columns_v;
        }
		
		// 获取图表及表格数据
		function getData() {
			$('#tablelist').datagrid({
				title: '严重创伤患者（ISS ≥ 16）抢救成功率',
				nowrap: true,
				striped: true,
				singleSelect: true,
				rownumbers: true,
				toolbar: getToolbar(),
				url: '${baseurl}edpcReport/queryTruamaRescueRate_result.do',
				onLoadSuccess: function(data) {
// 					console.log('data', data)
					loadChart(data.rows, 'line')
					$('#tablelist').datagrid('appendRow', {
						yarmon : '<b>' + data.rows[0].yarmon + ' - ' + data.rows[data.rows.length - 1].yarmon + '</b>',
						patNumb : compute("patNumb", data),
						total : compute("total", data),
						rate : calcRate("patNumb", "total", data),
					});
				},
				idField: 'info',
				queryParams: getQueryParams(),
				loadMsg: 'loading...',
				columns: getColumns()
			});
		}
		
		function calcRate(divisorCol, dividendCol, data) {
			var rows = data.rows;
			var patNumbSum = 0,
				totalSum = 0;
			for (var i = 0; i < rows.length; i++) {
				patNumbSum += parseFloat(rows[i][divisorCol]);
				totalSum += parseFloat(rows[i][dividendCol]);
			}
			if(totalSum === 0) {
				return "-";
			} else {
				return (patNumbSum / totalSum * 100).toFixed(2) + "%";
			}
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
		
		// 导出
		function btnexport() {
			jquerySubByFId('reportForm', exportCallback, null, "json");
		}
		
		// 导出回调
		function exportCallback(data) {
			// 在这里提示信息中有文件下载链接
			message_alert(data);
		}
		
		function Element(name, type, yAxis, data, zIndex) {
			this.name = name;
			this.type = type;
			this.yAxis = yAxis;
			this.data = data;
			this.zIndex= zIndex;
		}
		
		// 加载highcharts图表数据
		function loadChart(rows, chartstype) {
// 			console.log('rows', rows)
			var seriesArr = [], // seriesArr
				categoriesArr = []; // categoriesArr
			var totalDataArr = [],
				tnumbDataArr = [],
				rateDataArr = [];
			$.each(rows, function(ind, val) {
				// categories
				categoriesArr.push(val.yarmon);
				// 总人数
				totalDataArr.push(val.total);
				// 抢救成功人数
				tnumbDataArr.push(val.patNumb);
				var rate = 0;
				if(val.rate !== "-") {
					rate = parseFloat(val.rate.replace(/%/g, ""));
				}
				rateDataArr.push(rate)
			});
			seriesArr.push(new Element('总人数', 'column', 0, totalDataArr, 1));
			seriesArr.push(new Element('抢救成功人数', 'column', 0, tnumbDataArr, 1));
			seriesArr.push(new Element('抢救成功率', 'line', 1, rateDataArr, 0));
// 			console.log('seriesArr', seriesArr)
			$('#container').highcharts({
				chart: {
					backgroundColor: '#e4efff',
					zoomType: 'xy'
				},
// 				colors: ['#2f7ed8', '#0d233a', '#8bbc21', '#910000', '#1aadce', '#492970', '#f28f43', '#77a1e5', '#c42525', '#a6c96a'],
				title: {
					text: ''
				},
				subtitle: {
					text: ''
				},
				plotOptions: {
					line: {
						allowPointSelect: true,
						cursor: 'pointer',
						dataLabels: {
							enabled: true,
							format: '{y}%'
						},
						showInLegend: true
					},
					column: {
						dataLabels: {
							enabled: false
						}
					}
				},
				xAxis: [{
					categories: categoriesArr
				}],
				yAxis: [{ // Primary yAxis
					allowDecimals: false,
					title: {
						text: '例数 (人)',
						style: {
							color: '#696969'
						}
					},
					labels: {
						format: '{value}',
						style: {
							color: '#696969'
						}
					}
				}, { // Secondary yAxis
					gridLineWidth: 0,
					allowDecimals: true,
					max: 100,
					min: 0,
					tickInterval: 12.5,
					title: {
						text: '抢救成功率（%）',
						style: {
							color: '#696969'
						}
					},
					labels: {
						format: '{value}',
						style: {
							color: '#696969'
						}
					},
					opposite: true
				}],
				tooltip: {
					shared: false
				},
				legend: {
					layout: 'horizontal',
					align: 'center',
					verticalAlign: 'bottom',
					// floating 图例容器是否可以浮动，当设置为浮动（true）时，图例将不占用绘图区空间，并可以层叠在图形上方。 默认是：false.
					floating: false,
					backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#e4efff'
				},
				exporting: {
					enabled: false
				},
				credits: {
					enabled: false
				},
				series: seriesArr
			});
		}

		function getWidth(proportion) {
			var width = $("body").width() * 0.29 - 4;
			return Math.round(proportion * width);
		}
		
		// 查询方法
		function btnsearch() {
			getData();
		}

		// 页面刷新调用方法
        function reload() {
        	btnsearch();
        }
		
    </script>
	<form id="reportForm" action="${baseurl}edpcReport/exportTruamaRescueRateSubmit.do" method="post">
		<!-- html的静态布局 -->
		<!-- 查询条件 -->
		<div class="m-b5">
			<div class="m-t10 div_h">
				<ul class="querylist-ul form_hc">
					<li>
						<span class="f-left">&nbsp;查询时间：</span>
						<input type="text" class="input-base short-right Wdate" id="startDate" name="startDate" 
							onfocus="WdatePicker({dateFmt:'yyyy/MM',readOnly:true,maxDate:'#F{$dp.$D(\'endDate\')}'})" /> 至 
						<input type="text" class="input-base short-right Wdate" id="endDate" name="endDate" 
							onfocus="WdatePicker({dateFmt:'yyyy/MM',readOnly:true,minDate:'#F{$dp.$D(\'startDate\')}',maxDate:'%y/%M/%d'})" />
					</li>
					<li class="queryuser-btn m-l5">
						<a href="#" id="search" onclick="btnsearch()" class="easyui-linkbutton" iconCls="icon-search" id="btn">查询</a>
					</li>
				</ul>
				<div class="c"></div>
			</div>
		</div>
	</form>
	<div class="chart_grp chartbox" id="chartbox">
		<div class="form_cat border-radius box-shadow">
			<p class="chart_title">严重创伤患者（ISS ≥ 16）抢救成功率</p>
			<!-- <hr class="hr"/> -->
			<div id="container" class="chart_div"></div>
		</div>
		<!-- 查询列表 -->
		<div class="list_table" id="list_table">
			<table id="tablelist"></table>
		</div>
	</div>
</body>
<script type="text/javascript">

   
</script>
</html>