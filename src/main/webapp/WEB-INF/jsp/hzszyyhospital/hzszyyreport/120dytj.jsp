<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<title>120到院统计图</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
	<link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="brbzxgtjt">
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
	<script type="text/javascript">
		$(document).keydown(function (event) {
			switch (event.keyCode) {
				case 13:
					return false;
			}
		});

		function reload() {
			var querytype = $('#querytype').val();
			queryAll();
		}

		function setLayOut() {
			var height = 0.9 * ($("#tabs", parent.document).height() - 150);
			$("#tabList").height(height);
			var chartHeight = height - 67;
			$("#container").height(chartHeight);
		}

		$(function () {
			var querytype = $('#querytype').val();
			setLayOut();
			setTime();
			queryAll();
			//enter按键默认触发查询
			$("#timeDate").keyup(function (event) {
				if (event.keyCode == 13) {
					queryAll();
				}
			});
			$(window).resize(function () {
				$('#tabList').datagrid('reload');
			});

		});

		//查询
		function queryAll() {
			var queryParam = generateParam();
			if (!queryParam.startdate) {
				$.messager.alert('提示信息', "开始时间不能为空", 'warning');
				return false;
			}
			if (!queryParam.enddate) {
				$.messager.alert('提示信息', "结束时间不能为空", 'warning');
				return false;
			}
			queryTable(queryParam);
			queryChart(queryParam);
		}


		//图表数据展示
		function Person(name, data, stack) {
			this.name = name;
			this.data = data;
			this.stack = stack;
		}
		//加载图表
		function loadChart(chartData, chartType) {
		 	var seriesArr;
            var seriesOne;
            var categoriesArr = new Array();
            var nameArr = new Array();
            var seriesData = null;
            seriesArr = new Array();
			for (var i = 0; i < chartData.length; i++) {
				categoriesArr.push(chartData[i].dytjName);
				if ($.inArray(chartData[i].querydate, nameArr) < 0) {
					if (seriesData != null) {
						seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
						seriesArr.push(seriesOne);
					}
					nameArr.push(chartData[i].querydate);
					seriesData = [];
				}
				seriesData.push(chartData[i].srcount);
			}

			seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
			seriesArr.push(seriesOne);
			$('#container').highcharts({
				chart: {
					type: chartType,
					backgroundColor: '#e4efff'
				},
				title: {
					text: ''
				},
				xAxis: {
					categories: categoriesArr,
				},
				yAxis: {
					min: 0,
					allowDecimals: false,
					title: {
						text: '人数',
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
						'<td style="padding:0"><b>{point.y:.0f} 个</b></td></tr>',
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

		//图表数据展示查询方法
		function queryChart(queryParam) {
			$.ajax({
				url: '${baseurl}zyyreport/getDytjList.do',
				dataType: "json",
				async: false,
				data: queryParam,
				success: function (res) {
					loadChart(res.rows, 'column');
				}
			});
		}

		//定义 datagird工具
		var toolbar_v = [{
			id: '',
			text: '导出',
			iconCls: 'icon-redo',
			handler: function () {
				_confirm('确定导出吗？', null, function () {
					jquerySubByFId('dytjform', brbzExport_callback, null, "json");
				});
			}
		}, {
			id : 'hzlb',
			text : '患者列表',
			iconCls : 'icon-add',
			handler : function() {
				var pageName = '120dytj';
				var tjfsType = $('#querytype').val();
				parent.opentabwindow('120到院统计列表', "${baseurl}zyyreport/dytjhzmx.do?startdate=" + $("#startTime").val() + 
				'&enddate=' + $("#endTime").val() + "&querytype=range" + '&pageName=' + pageName + '&tjfsType=' + tjfsType , '2');
			}
		}];

		//用户导出回调
		function brbzExport_callback(data) {
			//在这里提示信息中有文件下载链接
			message_alert(data);
		}

		//右侧表格数据查询方法
		function queryTable(params) {
			var typename;
			var querytype = $('#querytype').val();
			if (querytype == 'jsy') {
				typename = '驾驶员';
			} else if (querytype == 'ys') {
				typename = '120医生';
			}
			$('#tabList').datagrid({
				title: '120到院统计',
				nowrap: true,
				striped: true,
				singleSelect: true,
				url: "${baseurl}zyyreport/getDytjList.do",
				queryParams: params,
				loadMsg: false,
				columns: [
					[{
						field: 'querydate',
						title: '时间',
						width: getWidth(0.4)
					},{
						field: 'dytjName',
						title: typename,
						width: getWidth(0.2)
					}, {
						field: 'srcount',
						title: '送入人数',
						width: getWidth(0.2)
					}, {
						field: 'zycount',
						title: '住院人数',
						width: getWidth(0.2)
					}]
				],
				toolbar: toolbar_v,
				onLoadSuccess: function (data) { },
			});
		}

		function setTime() {			
			var date = new Date();
			var firstDay = new Date(date.getFullYear(), date.getMonth(), 1);
			var lastDay = new Date(date.getFullYear(), date.getMonth() + 1, 0);
			var startTime = publicFun.timeFormat(firstDay, 'yyyy/MM/dd');
			var endTime = publicFun.timeFormat(lastDay, 'yyyy/MM/dd');
			$("#startTime").val(startTime);
			$("#endTime").val(endTime);
		}

		function getWidth(proportion) {
			var width = $("body").width() * 0.29 - 4;
			return Math.round(proportion * width);
		}

		//获取查询方式和时间
		function generateParam() {
			var startDate = $("#startTime").val();
			var endDate = $("#endTime").val();
			var querytype = $('#querytype').val();
			var rtnObj = {
				'querytype': querytype,
				'startdate': startDate,
				'enddate': endDate
			};
			return rtnObj
		}

		//查询方式
		function setqueryType() {
			queryAll();
		}
	</script>
	<form id="dytjform" name="dytjform" action="${baseurl}zyyreport/exportDytjSubmit.do" method="post">
		<div class="m-b5">
			<div class="m-t10 div_h">
				<ul class="querylist-ul form_hc">
					<li><select id="querytype" name="querytype" onchange="setqueryType()">
							<option value="jsy" selected="selected">驾驶员</option>
							<option value="ys">120医生</option>
						</select> <span class="f-left">&nbsp;统计方式：</span></li>
					<li><input type="text" class="input-date Wdate" id="startTime" name="startdate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})">
						至 <input type="text" class="input-date Wdate" id="endTime" name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM/dd'})" />
						<span class="f-left">&nbsp;查询时间：</span></li>
					<li class="m-l5"><a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryAll()">查询</a></li>
				</ul>
				<div class="c"></div>
			</div>
		</div>
		<div class="chart_grp chartbox">
			<div class="form_cat border-radius box-shadow">
				<p class="chart_title">120到院统计</p>
				<div id="container" class="chart_div"></div>
			</div>
			<!-- 查询列表 -->
			<div class="list_table nonumlist_table" id="list_table">
				<table id="tabList"></table>
			</div>
		</div>
	</form>
</body>

</html>