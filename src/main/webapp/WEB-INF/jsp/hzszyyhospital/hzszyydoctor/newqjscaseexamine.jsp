<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>检验信息</title>
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?v=${versionDay}">
</head>

<body class="examinebody tabsBody">
	<script type="text/javascript">
		var _baseUrl;
		_baseUrl = "${baseurl}";

		function setLayout() {
			var windowsWidth = parent.$('#mainIfream').width(),
				windowsHeight = parent.$('#mainIfream').height();
			$('#mainExamineList').width(450).height(windowsHeight - 50);
			$('#examineList').width(windowsWidth - 330).height(windowsHeight - 50);
		}
		//enter按键默认触发查询
		$(document).keydown(function (event) {
			switch (event.keyCode) {
				case 13:
					jzjlquery()
			}
		});

		function reload() {
			$('#mainExamineList').datagrid('reload');
			$('#examineList').datagrid('reload');
		}

		function isRangeColor(row) {
			var _currentResult = '';
			if (row.result) {
				_currentResult = row.result.replace(/[^\d|.]/g, '');
			}
			if (row.lowerLimit && row.upperLimit) {
				if (parseFloat(_currentResult) > parseFloat(row.upperLimit)) {
					return "color:red;";
				} else if (parseFloat(_currentResult) < parseFloat(row.lowerLimit)) {
					return "color:#7cd89b";
				} else {
					return "";
				}
			} else {
				return "";
			}
		}
    /**
    * * 定义datagrid的内容field
    **/
		var columnse_v = [
			[{
				field: 'rownums',
				title: 'id',
				hidden: true
			}, {
				field: 'patientId',
				title: '预检号',
				width: getWidth(0.10),
				hidden: true
			}, {
				field: 'resultDateTime',
				title: '报告时间',
				width: getWidth(0.15),
				sortable: true,
				formatter: function (value, row, index) {
					return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
				},
				hidden: true
			}, {
				field: 'examinaim',
				title: '样本类型',
				sortable: true,
				width: getWidth(0.23),
				hidden: true
			}, {
				field: 'reportItemName',
				title: '试验名称',
				sortable: true,
				width: getWidth(0.30)
			}, {
				field: 'result',
				title: '分析结果',
				sortable: true,
				width: getWidth(0.1),
				styler: function (value, row, index) {
					return isRangeColor(row);
				}
			}, {
				field: 'lowerLimit',
				title: '参考范围低限',
				sortable: true,
				width: getWidth(0.15),
				styler: function (value, row, index) {
					return isRangeColor(row);
				}
			}, {
				field: 'upperLimit',
				title: '参考范围高限',
				sortable: true,
				width: getWidth(0.15),
				styler: function (value, row, index) {
					return isRangeColor(row);
				}
			},{
				field: 'units',
				title: '单位',
				sortable: true,
				width: getWidth(0.1),
				styler: function (value, row, index) {
					return isRangeColor(row);
				}
			}, {
				field: 'sampleno',
				title: '样例号',
				sortable: true,
				width: getWidth(0.10),
				hidden: true
			}]
		];
		//加载datagrid
		function initTable() {
			//datagrid列定义
			var columns_v = [
				[{
					field: 'patientId',
					title: '预检号',
					width: getWidth(0.10),
					hidden: true
				}, {
					field: 'resultDateTime',
					title: '报告时间',
					width: 125,
					sortable: true,
					formatter: function (value, row, index) {
						return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm:ss") : ""
					}
				}, {
					field: 'examinaim',
					title: '样本类型',
					sortable: true
				}]
			]
			setTime();
			var today = $("#emg_enddate").val();
			var startdate = $("#emg_startdate").val();
			$('#mainExamineList').datagrid({
				nowrap: true,
				striped: true,
				singleSelect: true,
				url: '${baseurl}his/queryexamine_result.do',
				queryParams: {
					"vHemsJyjgCustom.patientId": '${vstCad}',
					"vHemsJyjgCustom.startdate": startdate,
					"vHemsJyjgCustom.enddate": today
				},
				idField: 'patientId',
				columns: columns_v,
				rownumbers: true,
				onClickRow: function (rowIndex, rowData) {
					var resultDateTime = publicFun.timeFormat(rowData.resultDateTime, "yyyy/MM/dd hh:mm:ss");
					$('#examineList').datagrid({
						nowrap: true,
						striped: true,
						singleSelect: true,
						url: '${baseurl}his/queryexamineinfo_result.do',
						queryParams: {
							"vHemsJyjgCustom.patientId": rowData.patientId,
							"vHemsJyjgCustom.sampleno": rowData.sampleno,
							"vHemsJyjgCustom.patientId": '${vstCad}',
							"vHemsJyjgCustom.resultDateTime": resultDateTime
						},
						idField: 'rownums',
						columns: columnse_v,
						pagination: true,
						rownumbers: true,
						pageList: [50, 70, 90]
					});
				}
			});
		};

		function init() {
			initTable();
			$('#examineList').datagrid({
				nowrap: false,
				striped: true,
				singleSelect: true,
				idField: 'rownums',
				loadMsg: '',
				columns: columnse_v,
				rownumbers: true
			});
			var _thisWidth = $('body').width();
			$('.subDiv .panel-header,.subDiv .datagrid-wrap.panel-body,.subDiv .easyui-panel.panel-body,.subDiv .datagrid-header').css('width', '' + _thisWidth - 475 + '');
		}

		function getWidth(proportion) {
			var width = $("body").width() * 0.62;
			return Math.round(proportion * width);
		}
		//查询方法
		function queryexamine() {
			var formdata = $("#examineForm").serializeJson();
			$('#mainExamineList').datagrid('load', formdata);
		}

		function setTime() {
			var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
			var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
			if (_enddate == null || _enddate == '') {
				_enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
			}
			$("#emg_startdate").val(_startdate);
			$("#emg_enddate").val(_enddate);
		};
		$(function () {
			setLayout();
			init();
			$(window).resize(function () {
				init();
			});
		});
	</script>
	<form id="examineForm">
		<!-- html的静态布局 -->
		<!-- 查询条件 -->
		<input type="hidden" id="patientId" name="vHemsJyjgCustom.patientId" value="${MPI}" />
		<input type="hidden" id="zyh" name="vHemsJyjgCustom.zyh" value="${MPI}" />
		<input type="hidden" id="laborder" name="vHemsJyjgCustom.laborder" value="${laborder}" />
		<div class="form clr" style="margin:1px">
			<p class="form-text">日期：</p>
			<input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJyjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
			<p class="form-text">-</p>
			<input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJyjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryexamine()">查询</a>
		</div>
		<!-- 查询列表 -->
	</form>
	<div class="mainDiv printTableShow">
		<table id="mainExamineList"></table>
	</div>
	<div class="subDiv printTableShow">
		<table id="examineList"></table>
	</div>
</body>

</html>