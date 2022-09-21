<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
	<%--<link rel="stylesheet" type="text/css" href="${baseurl}styles/common/querylist.css" />--%>
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
	<script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
	<%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
	<!-- <script src="${baseurl}lib/highcharts5.0.7/code/stock.js" type="text/javascript"></script> -->
	<title>体液查询</title>
	<style>
		.jzjltab {
			display: inline-block;
			vertical-align: middle;
			box-sizing: border-box;
			width: 62%;
		}

		#iQueryCondition,
		#oQueryCondition {
			display: none
		}

		#pieChartContainer {
			display: inline-block;
			vertical-align: middle;
			box-sizing: border-box;
			width: 37%;
		}

		/* 签名图片样式 */
		.signPic {
			max-width: 20px;
			max-height: 15px;
		}
	</style>
</head>

<body class="queryjzjl">
	<form id="hzxxform" action="${baseurl}hemsemg/delemgSubmit.do" method="post">
		<!-- html的静态布局 -->
		<!-- 查询条件 -->
		<div class="form clr">
			<p class="form-text">时间点范围：</p>
			<input class="input-date Wdate" id="emg_startDate" type="text" name="startDate"
				onclick="WdatePicker({dateFmt:'yyyy/MM/dd',maxDate:'%y/%M/%d'})">
			<p class="form-text">-</p>
			<input class="input-date Wdate" id="emg_endDate" type="text" name="endDate"
				onclick="WdatePicker({dateFmt:'yyyy/MM/dd',maxDate:'%y/%M/%d'})">
			<p class="form-text">出入量类型：</p>
			<label class="icu-check-box">
				<input type="radio" class="queryIoType" name="ioType" value="" checked>
				<span class="icu-check-label-name">全部</span>
			</label>
			<label class="icu-check-box">
				<input type="radio" class="queryIoType" name="ioType" value="I">
				<span class="icu-check-label-name">入量</span>
			</label>
			<label class="icu-check-box">
				<input type="radio" class="queryIoType" name="ioType" value="O">
				<span class="icu-check-label-name">出量</span>
			</label>
			<select id="iQueryCondition" name="ioCode">
				<option value="">请选择入量类型</option>
				<c:forEach items="${ioCodeList}" var="i">
					<c:if test="${i.ioType=='I'}">
						<option value="${i.ioCode}">${i.ioName}</option>
					</c:if>
				</c:forEach>
			</select>
			<select id="oQueryCondition" name="ioCode">
				<option value="">请选择出量类型</option>
				<c:forEach items="${ioCodeList}" var="i">
					<c:if test="${i.ioType=='O'}">
						<option value="${i.ioCode}">${i.ioName}</option>
					</c:if>
				</c:forEach>
			</select>
			<a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="jzhzxxquery()">查询</a>
		</div>
	</form>
	<div class="jzjltab queryTabs">
		<table id="hzxxlist"></table>
	</div>
	<div id="pieChartContainer">
		<div id="pieChart">无数据</div>
	</div>
	<script type="text/javascript">
		var ptBasicInfo = eicuUtil.ptBasicInfo;
		var _liveNo = ptBasicInfo.liveNo;
		var _pipeShow = "";
		var $initInOption, $initOutOption;
		var $initInPipeOpt, $initOutPipeOpt;
		var inPipeOptStr, outPipeOptStr;
		var dlg; //增删改弹窗
		var rowData = ""; //保存当前选中行数据
		var editFlag; //增加弹窗还是修改弹窗
		console.log("拿到liveNo了:  " + _liveNo);

		//enter按键默认触发查询
		// 		$(document).keydown(function (event) {
		// 			switch (event.keyCode) {
		// 				case 13:
		// 					jzhzxxquery();
		// 			}
		// 		});

		function reload() {
			$('#hzxxlist').datagrid('reload');
		}
		//传递rowData
		function getRowData() {
			return rowData || {};
		}
		//加载datagrid
		function initData() {
			// 根据预置参数确定是否显示pipeinfo
			var columns_v = [
				[{
						field: "ioDateStr",
						title: "时间点",
						width: 110,
						sortable: true
					}, {
						field: "inCode",
						title: "入量类型"
					}, {
						field: "inInfo",
						title: "入量名称"
						/*,
						formatter: function (value) {
							if (value) {
								value = value.replace(/\|/g, "<br>");
							}
							return value;
						}*/
					}, {
						field: "inNumb",
						title: "入量<span class='unit'>ml</span>",
						// 					width: getWidth(0.04)
					}, {
						field: "inMemo",
						title: "入量备注"
					}, {
						field: "outCode",
						title: "出量类型"
					}, {
						field: "outNumb",
						title: "出量<span class='unit'>ml</span>",
						// 					width: getWidth(0.04)
					}, {
						field: "ioColo",
						title: "颜色性状",
						formatter: function (value, row, idx) {
							return (value || "") + (row.ioNatu || "");
						}
					}, {
						field: "outMemo",
						title: "出量备注"
					},
					/* , {
						field: "balance",
						title: "平衡ml",
						width: getWidth(0.045),
						formatter: function (value, row, index) {
							return row.rstRank === row.rstCnt ? row.balance : "";
						}
					}, {
						field: "addUp",
						title: "累计<span class='unit'>ml</span>",
						width: getWidth(0.04),
						formatter: function (value, row, index) {
							return row.rstRank === row.rstCnt ? row.addUp : "";
						}
					}, */
					{
						field: 'nursSign',
						title: '护士签名',
						align: "center",
						formatter: function (value, row, index) {
							if (value) {
								var thisStr = "";
								var thisSignInfoArr = value.split("|");
								var thisSignName = thisSignInfoArr[0]
								var thisSignImg = thisSignInfoArr[1];
								thisStr += "<img src=\"" + _baseUrl + "images/eicu/signPic/" + thisSignImg +
									"\" title=\"" + thisSignName +
									"\" class=\"signPic\" onerror=\"signPicError()\" style=\"max-width: 12mm;max-height: 6mm\">";
								thisStr += "<span style=\"display:none;max-width:100%;\">" + thisSignName +
									"</span>";
								return thisStr;
							}
							return "";
						}
					}, {
						field: "modUser",
						title: "操作人"
					}, {
						field: "modTimeStr",
						title: "操作时间",
						width: 110
					}
				]
			];
			if (_pipeShow === "1") {
				columns_v[0].splice(-3, 0, {
					field: "pipeName",
					title: "管路信息",
					// 					width: getWidth(0.05)
				})
			}
			var startDate = $("#emg_startDate").val();
			var endDate = $("#emg_endDate").val();
			var toolbar_v = [{
					handler: "addVs",
					iconCls: "icon-add",
					id: "b9a7bebe8da749c699c2f86855b0ce7c",
					text: "新增"
				},
				{
					handler: "editVs",
					iconCls: "icon-edit",
					id: "b9a7bebe8da749c699c2f86855b0ce7c",
					text: "修改"
				},
				{
					handler: "deleteVs",
					iconCls: "icon-cut",
					id: "b9a7bebe8da749c699c2f86855b0ce7c",
					text: "删除"
				}
			];
			$('#hzxxlist').datagrid({
				nowrap: true,
				// nowrap: false,
				// striped: true,
				singleSelect: true,
				url: '${baseurl}icuVitlIo/queryIoDaInfo.do',
				idField: 'ioSeq',
				loadFilter: function (data) {
					if (data.resultInfo && data.resultInfo.messageCode == '0') {
						alert_error('系统出错,请联系管理员')
						return;
					}
					return data;
				},
				loadMsg: '',
				columns: columns_v,
				queryParams: {
					"liveNo": _liveNo,
					"startDate": startDate,
					"endDate": endDate
				},
				showFooter: true,
				pagination: true,
				pageNumber: 1,
				rownumbers: true,
				pageList: [50, 100, 200],
				toolbar: toolbar_v,
				rowStyler: function (idx, row) {
					if (row.dataSrc === "DA") {
						return "background-color: #eee";
					}
				},
				// onLoadSuccess: function () {
				// 	// pieChartInit();
				// },
				onClickRow: function (idx, row) {
					if (rowData && row.ioSeq === rowData.ioSeq) {
						$('#hzxxlist').datagrid("unselectRow", idx);
						rowData = "";
					} else {
						$('#hzxxlist').datagrid("selectRow", idx);
						rowData = row;
					}
				}
			});
		}

		function pieChartInit() {
			var startDate = $("#emg_startDate").val();
			var endDate = $("#emg_endDate").val();
			console.log("查图标");
			console.log(startDate);
			console.log(endDate);
			var ajaxOption = new AjaxOption();
			ajaxOption.requestData = "liveNo=" + _liveNo + "&startDate=" + startDate + "&endDate=" + endDate;
			ajaxOption.requestType = 'POST';
			ajaxOption.requestDataType = "pame";
			ajaxOption.requestUrl = "${baseurl}icuVitlIo/getIoTotalPie.do";
			ajaxOption.asyncFlg = true;
			ajaxOption.returnDataType = 'json';
			_ajaxPostRequest(ajaxOption, null, function (res) {
				if (!res.resultInfo.success) {
					alert_error(res.resultInfo.message);
					return;
				}
				var pieList = res.resultInfo.sysdata.pieList;
				var colors = ["#7cb5ec", "#434348"]
				if (pieList) {
					var seriesData = [];
					var drillDownData = [];
					pieList.forEach(function (ele, idx) {
						// {name: '入量',y: 61.41}
						seriesData.push({
							name: ele.name,
							y: ele.numb,
							color: colors[idx]
						});
						ele.list.forEach(function (listEl, listIdx) {
							brightness = 0.2 - (listIdx / ele.list.length) / 5;
							drillDownData.push({
								name: listEl.name,
								y: listEl.numb,
								color: Highcharts.Color(colors[idx]).brighten(brightness)
									.get()
							})
						})
					});
					Highcharts.chart('pieChart', {
						chart: {
							// plotBackgroundColor: null,
							// plotBorderWidth: null,
							// plotShadow: false,
							type: 'pie'
						},
						credits: {
							enabled: false
						},
						title: {
							text: '出入量统计'
						},
						// tooltip: {
						// 	pointFormat: '{point.name}:<b>{point.y}</b>'
						// },
						plotOptions: {
							pie: {
								// allowPointSelect: true,
								shadow: false,
								center: ['50%', '50%'],
								cursor: 'pointer',
								// dataLabels: {
								// 	enabled: true,
								// 	format: '<b>{point.name}</b>: {point.y} ml'
								// }
							}
						},
						series: [{
							name: '数值',
							size: "60%",
							colorByPoint: true,
							data: seriesData,
							dataLabels: {
								format: '<b>{point.name}</b>: {point.y} ml',
								color: '#ffffff',
								distance: -30
							}
						}, {
							id: "type",
							name: '数值',
							size: "80%",
							innerSize: "60%",
							data: drillDownData,
							dataLabels: {
								enabled: true,
								format: '<b>{point.name}</b>: <br>    {point.y} ml',
								color: '#000',
								distance: 10
							}
						}]
					});
				}
			});
		}
		//增加体征记录
		function addVs() {
			editFlag = "add";
			var modalTitle;
			var modalWidth = 600;
			var modalHeight = 410;
			var modalUrl = _baseUrl + "icudoctadvi/toExecEdit.do";
			modalTitle = "出入量新增";
			createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, "no");
		}
		//修改体征记录
		function editVs() {
			editFlag = "edit";
			var modalTitle;
			var modalWidth = 600;
			var modalHeight = 410;
			var modalUrl = _baseUrl + "icudoctadvi/toExecEdit.do";
			// if (flag === "add") {
			// 	modalTitle = "出入量新增";
			// } else {
			if (!rowData) {
				alert_warn("未选中记录");
				return;
			} else if (rowData.dataSrc === "DA") {
				alert_warn("未选中有效记录");
				return;
			}
			rowData.inSeq = rowData.ioSeq; //不增加inSeq或者outSeq字段，execEdit页面会认为是新增
			modalTitle = "出入量修改";
			// }
			createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, "no");
		}
		//删除体征记录
		function deleteVs() {
			var row = $('#hzxxlist').datagrid('getSelected');
			if (!row) {
				alert_warn("未选中记录");
				return;
			}
			if (row.dataSrc === "DA") {
				alert_warn("未选中记录"); //模拟未选中
				return;
			}
			_confirm("确认删除此条数据？", null, function () {
				var ajaxOption = new AjaxOption();
				ajaxOption.requestData = "ioSeq=" + row.ioSeq;
				ajaxOption.requestType = 'POST';
				ajaxOption.requestDataType = "pame";
				ajaxOption.requestUrl = "${baseurl}icuVitlIo/delIoInfo.do";
				ajaxOption.asyncFlg = true;
				ajaxOption.returnDataType = 'json';
				_ajaxPostRequest(ajaxOption, null, function (res) {
					console.log("提交成功");
					console.log(res);
					ajax_alert(res);;
					if (res.resultInfo.success) {
						rowData = null;
						$('#hzxxlist').datagrid('clearSelections');
						$('#hzxxlist').datagrid('reload');
						pieChartInit();
					}
				});
			})
		}

		/*
		 **获取当前管路状态信息以及管路内容
		 */
		function getPipeInfo() {
			var ajaxOption = new AjaxOption();
			ajaxOption.requestData = "liveNo=" + _liveNo + "&flag=ioDaInfo";
			ajaxOption.requestType = 'POST';
			ajaxOption.requestDataType = "pame";
			ajaxOption.requestUrl = "${baseurl}icupipe/getPipeInfo.do";
			ajaxOption.asyncFlg = false; //同步获取信息，打开弹窗前先行获取信息
			ajaxOption.returnDataType = 'json';
			_ajaxPostRequest(ajaxOption, null, function (res) {
				console.log("拿到编码了");
				console.log(res);
				if (!res.resultInfo.success) {
					alert_error("请求出错，请联系管理员！");
					return;
				}
				try {
					var sysdata = res.resultInfo.sysdata;
					_pipeShow = sysdata.optkey.optvalue;
					var pipeOptArr = sysdata.pipeList || [];
					//赋值管道下拉列表
					inPipeOptStr = "<option value=''>请选择</option>";
					outPipeOptStr = "<option value=''>请选择</option>";
					pipeOptArr.forEach(function (ele, idx, arr) {
						if (ele.pipeFlag === "I") {
							inPipeOptStr += "<option value='" + ele.pipeSeq + "'>" + ele.pipeName +
								"</option>";
						} else if (ele.pipeFlag === "O") {
							outPipeOptStr += "<option value='" + ele.pipeSeq + "'>" + ele.pipeName +
								"</option>";
						}
					})
				} catch (e) {
					alert_error("请求出错，请联系管理员！");
				}
			})
		}
		//预设时间
		function setTime() {
			var dayMilSec = 24 * 60 * 60 * 1000;
			var todayStamp = new Date().getTime();
			// var tomorrowStamp = todayStamp + dayMilSec;
			var todayStr = publicFun.timeFormat(todayStamp, "yyyy/MM/dd")
			$("#emg_startDate").val(todayStr);
			// $("#emg_endDate").val(publicFun.timeFormat(tomorrowStamp, "yyyy/MM/dd"));
			$("#emg_endDate").val(todayStr);
		};
		//获取宽度
		function getWidth(proportion) {
			var width = $("body").width();
			return Math.round(proportion * width);
		}

		//查询方法
		function jzhzxxquery() {
			var formdata = $("#hzxxform").serializeJson();
			formdata.liveNo = _liveNo;
			$('#hzxxlist').datagrid('load', formdata);
			pieChartInit();
		}
		/**
		 * 图片加载错误事件
		 */
		function signPicError() {
			var _this = event.target;
			console.error("么的图片啊");
			$(_this)
				.hide()
				.next()
				.show();
		}
		$(function () {
			var height = $(window).height() - 30 - 10;
			$("#hzxxlist").height(height);
			getPipeInfo();
			setTime();
			initData();
			pieChartInit();
			$(".queryIoType").click(function () {
				var thisVal = $(this).val();
				if (thisVal === "I") {
					$("#iQueryCondition").show().prop("disabled", false).val("");
					$("#oQueryCondition").hide().prop("disabled", true);
				} else if (thisVal === "O") {
					$("#iQueryCondition").hide().prop("disabled", true);
					$("#oQueryCondition").show().prop("disabled", false).val("");
				} else {
					$("#iQueryCondition").hide().prop("disabled", true);
					$("#oQueryCondition").hide().prop("disabled", true);
				}
			})
		});
	</script>
</body>

</html>