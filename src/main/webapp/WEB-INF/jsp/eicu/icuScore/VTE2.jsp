<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>VTE静脉血栓栓塞症风险评估单-内科</title>
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
	<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
	<%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
	<style>
		html {
			overflow-x: hidden;
			overflow-y: auto;
		}

		.headtitle {
			font-size: 14px;
			font-weight: bold;
			text-align: center;
		}

		input[type="checkbox"] {
			cursor: pointer;
			display: inline-block;
			float: none;
			vertical-align: middle;
		}

		input {
			display: inline-block;
			border: 1px solid #ddd;
			border-radius: 6px;
			padding-left: 3px;
			height: 24px;
			line-height: 24px;
		}

		/*global card*/
		.section-part {
			margin-bottom: 5px;
		}

		.section-part:last-child {
			margin-bottom: 0;
		}

		.section-part .icu-card-body {
			padding-bottom: 5px;
		}

		.section-part .section-part-title {
			padding: 5px;
			font-size: 13px;
			border-bottom: 1px solid #ddd;
			background-color: #f5f7f6;
		}

		.section-part-title.total {
			font-weight: bold;
		}

		/*end*/
		.panelGde table tr input {
			text-indent: 0;
		}

		.scoreQuery .headtitle {
			float: none;
			margin: 10px 0px 0px 0px;
		}

		.panel {
			width: 85%;
			margin: 10px auto 0px auto;
		}

		.blockTitle {
			font-weight: bold;
			font-size: 16px;
			height: 32px;
			line-height: 32px;
			background-color: #85aaca;
			/* border-top:1px solid black; */
		}

		.secondTitle {
			font-size: 14px;
			height: 32px;
			line-height: 32px;
			background-color: #bad0e3;
			/* border:1px solid black; */
		}

		table {
			table-layout: fixed;
			width: 100%;
		}

		[name='VTE_THIRD_A2_4_info'],
		[name='VTE_THIRD_A3_5_info'],
		[name='PADUA_SCO'] {
			visibility: hidden;
		}

		/* 签名栏样式 */
		.panelCenter {
			text-align: center;
			background-color: #85aaca;
			font-size: 12px;
			height: 32px;
			line-height: 32px;
		}

		.footPan {
			margin: 10px auto;
		}

		#mod-info-box {
			background-color: #85aaca;
			position: relative;
			padding: 5px;
			text-align: center;
			/* border-top: 1px solid #ccc; */
		}

		#mod-info-box label {
			display: inline-block;
			height: 24px;
			vertical-align: middle;
		}

		#mod-info-box span {
			display: inline-block;
			height: 24px;
			line-height: 24px;
			vertical-align: middle;
		}

		#mod-info-box input {
			display: inline-block;
			height: 24px;
			line-height: 24px;
			vertical-align: middle;
			box-sizing: border-box;
		}

		#mod-user-label {
			padding-left: 10px;
			width: 141px;
			text-align: left;
		}

		#gradeUser {
			width: 80px;
		}

		#mod-info-box .signPic {
			max-width: 12mm;
			max-height: 6mm
		}

		#mod-info-box .signPic~span {
			display: none;
			max-width: 100%;
		}

		/*icu-table*/
		.icu-table {
			margin: 5px auto 0;
			table-layout: fixed;
			width: 99%;
		}

		.icu-table thead td {
			background-color: #eee;
		}

		.icu-table td {
			padding: 3px;
			border: 1px solid #ddd;
		}
	</style>
</head>

<body class="scoreQuery" ms-controller="vte2Gde">
	<p class="headtitle"></p>
	<div class="panelGde">
		<form id="vte2form" method="post">
			<div class="BradenContent panelContent">
				<div class="panel icu-card">
					<div class="icu-card-title">
						{{PADUA.itemName}}
					</div>
					<div class="icu-card-body">
						<div ms-repeat-item="PADUA.itemList" class="section-part icu-card">
							<div class="section-part-title" ms-class-1="{{item.itemList ? '' : 'total'}}">
								{{item.itemName}}
								<label ms-if="item.itemField === 'PADUA_SCO'">
									{{paduaSco}}
									<input type="text" ms-attr-value="paduaSco" ms-attr-name="{{item.itemField}}">
								</label>
							</div>
							<div class="icu-card-body" ms-if="item.itemList && item.itemField !== 'PADUA_C'">
								<table ms-repeat-info="item.itemList">
									<tr>
										<td>
											<label ms-click="PADUAclick($event, info.itemField)">
												<input type="checkbox" ms-attr-value="info.score"
													ms-attr-name="{{info.itemField}}">
												{{info.itemName}}
											</label>
										</td>
									</tr>
								</table>
							</div>
							<div class="icu-card-body" ms-if="item.itemList && item.itemField === 'PADUA_C'">
								<table>
									<colgroup>
										<col width="23%" />
										<col width="23%" />
										<col width="28%" />
										<col width="26%" />
									</colgroup>
									<tr ms-repeat-paduac="item.itemList">
										<td ms-repeat-info="paduac.itemList" ms-attr-colspan="info.cols">
											<label ms-click="PADUAclick($event, info.itemField)">
												<input type="checkbox" ms-attr-value="info.score"
													ms-attr-name="{{info.itemField}}">
												{{info.itemName}}
											</label>
										</td>
									</tr>
								</table>
							</div>
						</div>
						<div class="section-part icu-card">
							<div class="section-part-title">
								Padua评分结果评价
							</div>
							<div class="icu-card-body">
								<table class="icu-table">
									<colgroup>
										<col width="33%" />
										<col width="33%" />
										<col width="34%" />
									</colgroup>
									<thead>
										<tr>
											<td>VTE风险度</td>
											<td>Padua评分</td>
											<td>不采取预防措施VTE发生率</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>低度危险</td>
											<td>&lt;4分</td>
											<td>0.3%</td>
										</tr>
										<tr>
											<td>高度危险</td>
											<td>&ge;4分</td>
											<td>11%</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>

				<!-- <div class="panel footPan">

				</div> -->

				<div class="panel icu-card">
					<div class="icu-card-title">
						{{VTE_SECOND.itemName}}
					</div>
					<div class="icu-card-body">
						<div ms-repeat-item="VTE_SECOND.itemList" class="section-part icu-card">
							<div class="section-part-title">
								{{item.itemName}}
							</div>
							<div class="icu-card-body">
								<table>
									<colgroup>
										<col width="12%" />
										<col width="22%" />
										<col width="22%" />
										<col width="22%" />
										<col width="22%" />
									</colgroup>
									<tr ms-repeat-secondc="item.itemList">
										<td ms-repeat-info="secondc.itemList" ms-attr-rowspan="info.rows"
											ms-attr-colspan="info.cols">
											<label>
												<input type="checkbox" ms-attr-value="info.score"
													ms-attr-name="{{info.itemField}}"
													ms-visible="info.itemFlag == '9'?true:false">
												{{info.itemName}}
											</label>
										</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>

				<div class="panel icu-card">
					<div class="icu-card-title">
						{{VTE_THIRD.itemName}}
					</div>
					<div class="icu-card-body">
						<div class="section-part icu-card">
							<div class="icu-card-body">
								<table class="icu-table">
									<colgroup>
										<col width="25%" />
										<col width="25%" />
										<col width="25%" />
										<col width="25%" />
									</colgroup>
									<thead>
										<tr>
											<td>危险因素总分</td>
											<td>DVT发生风险</td>
											<td>风险等级</td>
											<td>预防措施</td>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>&lt;4分</td>
											<td>&lt;0.3%</td>
											<td>低危</td>
											<td>基础活动、尽早活动</td>
										</tr>
										<tr>
											<td>&ge;4分</td>
											<td>11%</td>
											<td>高危</td>
											<td>药物预防或物理治疗</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
						<div ms-repeat-item="VTE_THIRD.itemList" class="section-part icu-card">
							<div class="section-part-title">
								{{item.itemName}}
							</div>
							<div class="icu-card-body">
								<table>
									<colgroup>
										<col width="25%" />
										<col width="25%" />
										<col width="25%" />
										<col width="25%" />
									</colgroup>
									<tr ms-repeat-third="item.itemList">
										<td ms-repeat-info="third.itemList" ms-attr-rowspan="info.rows"
											ms-attr-colspan="info.cols">
											<span ms-if="info != null">
												<label>
													<input type="checkbox" ms-click="thirdClick($event, info.itemField)"
														ms-attr-value="info.score" ms-attr-name="{{info.itemField}}"
														ms-visible="info.itemFlag === '9'">
													{{info.itemName}}
													<label
														ms-if="info.itemField === 'VTE_THIRD_A2_4' || info.itemField === 'VTE_THIRD_A3_5'">
														<input type="text" ms-attr-name="{{info.itemField}}_info"
															value="">
													</label>
												</label>
											</span>
										</td>
									</tr>
								</table>
							</div>
						</div>
					</div>
				</div>

				<div class="panel footPan panelCenter">
					<div class="signBorderBox">
						<label id="mod-info-box">
							<span>评分时间：</span>
							<input class="Wdate" type="text" id="gradeTimeStr"
								onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})"
								autocomplete="off">
						</label>
						<label id="mod-user-label">
							<span>评分人：</span>
							<input class="userInput" type="text" id="gradeUser" autocomplete="off">
						</label>
					</div>
				</div>
				<!-- 
				<div id="selfSave">
					<input type="button" class="commonbtn" value="保存" onclick="saveCom()">
					<input type="button" class="commonbtn" value="保存并关闭" onclick="saveCom('close')">
					<input type="button" class="commonbtn" value="关闭" onclick="parent.closemodalwindow()">
					<input type="button" class="commonbtn" id="selfDelBtn" value="删除" onclick="parent.delCom()">
				</div>
				 -->
			</div>
		</form>
	</div>
	<script type="text/javascript">
		//全局变量
		var _userid = "${activeUser.usrno}";
		var ptBasicInfo = eicuUtil.ptBasicInfo;
		var _liveNo = ptBasicInfo.liveNo;
		var _gradeSeq = "${gradeSeq}";
		var _gradeType = "${gradeType}";
	</script>
	<script src="${baseurl}js/subpageJs/eicu/scoreCommon.js" type="text/javascript" charset="UTF-8"></script>
	<script type="text/javascript">
		var parentBasicPage = parent.$('#panel-grid-table').length !== 0 ? true : false;
		var vm = avalon.define({
			$id: "vte2Gde",
			defList: [],
			PADUA: {},
			VTE_SECOND: {},
			VTE_THIRD: {},
			paduaSco: 0,

			lastTime: "",
			lastUser: "",
			VTE_THIRD_A2_4_flag: '0',
			VTE_THIRD_A3_5_flag: '1',

			PADUAclick: function (e, itemField) {
				var paduaSco = 0;
				vm.PADUA.itemList.forEach(function (elt, i, array) {
					if (elt.itemFlag !== 'T') {
						if (elt.itemField === 'PADUA_C') {
							elt.itemList.forEach(function (ele) {
								ele.itemList.forEach(function (e) {
									if ($("input[name='" + e.itemField + "']:checked")
										.length == "1") {
										paduaSco += parseInt(e.scoreValue);
									}
								})
							})
						} else {
							elt.itemList.forEach(function (ele) {
								if ($("input[name='" + ele.itemField + "']:checked").length ==
									"1") {
									paduaSco += parseInt(ele.scoreValue);
								}
							})
						}
					}
				})
				vm.paduaSco = paduaSco;
			},

			thirdClick: function (e, itemField) {
				if ($("input[name='" + itemField + "']:checked").length == "1") {
					$("input[name='" + itemField + "_info']").css("visibility", "visible");
				} else {
					$("input[name='" + itemField + "_info']").val("");
					$("input[name='" + itemField + "_info']").css("visibility", "hidden");
				}
			},

		})

		function getAllInfo() {
			publicFun.httpRequest(_baseUrl + "icuscore/findGradeInfoByParam.do", {
				"gradeSeq": _gradeSeq,
				"gradeType": _gradeType,
				"liveNo": _liveNo,
				date: new Date().toTimeString()
			}, function (res) {
				var _res = res.resultInfo.sysdata.itemlist;
				var totalInfo = res.resultInfo.sysdata.totalInfo;
				if (!_res) {
					return;
				}
				_res.forEach(function (ele, idx, arr) {
					var field = ele.itemField;
					var value = ele.itemValue || '';
					if (ele.itemFlag !== "T") {
						$("input[name='" + field + "']").prop("checked", "true");
						if (field === 'VTE_THIRD_A2_4' || field === 'VTE_THIRD_A3_5') {
							$("input[name='" + field + "_info']").css("visibility", "visible");
							$("input[name='" + field + "_info']").val(value);
						}
					} else {
						vm.paduaSco = value;
					}
				})
				if (totalInfo) {
					$("#gradeTimeStr").val(publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm"));
					$("#gradeUser").val(totalInfo.gradeUser);
					eicuUtil.queryDoct($("#gradeUser"));
				} else {
					getParentModInfo();
				}
			})

		}

		//保存
		function saveCom() {
			if (vm.paduaSco === '' || vm.paduaSco === null) {
				alert_warn("VTE评分为空");
				return false
			}
			var gradeUser = $("#gradeUser").data("userid") || "";
			var gradeTimeStr = $("#gradeTimeStr").val();
			if (!gradeTimeStr) {
				alert_warn("评分时间不能为空");
			} else if (!gradeUser) {
				alert_warn("评分人不能为空");
			} else {
				// _confirm('您确认提交吗？', null, function () {
				//	jquerySubByFId('modsForm', insertuser_callback, null, "json");
				var obj = $('#vte2form').serializeJson();
				var itemList = [];
				for (var key in obj) {
					var pushObj = {};
					if (key === 'VTE_THIRD_A2_4_info' || key === 'VTE_THIRD_A3_5_info') {
						continue
					} else {
						if (key.indexOf("PADUA") != -1) {
							pushObj["gradeType"] = "PADUA";
						} else if (key.indexOf("VTE_SECOND") != -1) {
							pushObj["gradeType"] = "VTE_SECOND";
						} else if (key.indexOf('VTE_THIRD') != -1) {
							pushObj["gradeType"] = "VTE_THIRD";
						} else {
							continue
						}
						if (key === 'VTE_THIRD_A2_4' || key === 'VTE_THIRD_A3_5') {
							pushObj["itemField"] = key;
							pushObj["itemValue"] = obj[key + "_info"];
						} else {
							pushObj["itemField"] = key;
							if (key === 'PADUA_SCO') {
								pushObj["itemValue"] = obj[key];
							} else {
								pushObj["itemValue"] = $("input[name=" + key + "]:checked").length;
							}
						}
						itemList.push(pushObj);
					}
				}

				publicFun.httpRequest(_baseUrl + "icuscore/editGradeSco.do", {
					"icuGradeTotalCustom": {
						"liveNo": _liveNo,
						"gradeSeq": _gradeSeq,
						"gradeType": _gradeType,
						"gradeTimeStr": $("#gradeTimeStr").val(),
						"gradeUser": $("#gradeUser").data("userid") || "",
						"gradeSco": vm.paduaSco,
						"gradeDetl": scoreTitle + ': ' + vm.paduaSco + '分'
					},
					"itemList": itemList
				}, {
					requestType: "json"
				}, function (res) {
					if (!res.resultInfo.success) {
						alert_warn(res.resultInfo.message);
						return;
					}
					if (parentBasicPage) {
						insertuser_callback(res)
					} else {
						if (!_gradeSeq) {
							_gradeSeq = res.resultInfo.sysdata.gradeSeq;
						}
						parent.modalReturnFun(vm.vte2Sco, res.resultInfo.sysdata.gradeSeq, closeFlag)
					}
				})

			}
		}

		//保存回调
		function insertuser_callback(data) {
			window.parent.$('#panel-grid-table').datagrid('reload');
			window.parent.ajax_alert(data);
		}


		function getDictInfo() {
			var reqUrl = '${baseurl}icuscore/getGradeItemDef.do';
			var reqParam = {
				gradeType: _gradeType
			};
			return publicFun.httpRequest(reqUrl, reqParam, function (res) {
				if (!res.resultInfo.success) {
					alert_error('请求出错，请联系管理员');
				}
				var defList = res.resultInfo.sysdata.itemDef;

				var curLegth;
				var nextLength;
				var count;
				defList.forEach(function (element) {
					let itemField = element.itemField;
					defList.forEach(function (ele) {
						if (ele.itemRoot == itemField) {
							if (!element.itemList) {
								element.itemList = [];
							}
							element.itemList.push(ele);
						}
					});
				})
				defList = defList.filter(function (ele) {
					return ele.itemRoot === 'ROOT'
				}); //这一步是过滤，按树展开，将多余的数组剔除；
				vm.defList = defList;
				var paduaList = [];
				defList.forEach(function (element) {
					if (element.itemField === 'PADUA') {
						if (element.itemList) {
							var itemList = element.itemList;
							itemList.forEach(function (elt, i, array) {
								if (elt.itemField === 'PADUA_C') {
									var list = elt.itemList;
									elt.itemList = [];
									var size = Math.ceil(list.length / 4);
									for (var i = 0; i < size; i++) {
										if (list.length < 4) {
											list[list.length - 1].cols = 4 - list.length + 1;
										}
										elt.itemList.push({
											"itemList": list.splice(0, 4)
										})
									}
								}
							})
						}
					} else if (element.itemField === 'VTE_SECOND') {
						if (element.itemList) {
							var itemList = element.itemList;
							itemList.forEach(function (elt, i, array) {
								var rowNumb = 5;

								if (elt.itemField === "VTE_SECOND_A" || elt.itemField ===
									"VTE_SECOND_F") {
									rowNumb = 4;
								} else if (elt.itemField === "VTE_SECOND_B") {
									rowNumb = 5;
								} else if (elt.itemField === "VTE_SECOND_C" || elt.itemField ===
									"VTE_SECOND_D" ||
									elt.itemField === "VTE_SECOND_E") {
									rowNumb = 1;
								}
								var list = elt.itemList;
								elt.itemList = [];
								//取出第一个
								if (elt.itemField !== "VTE_SECOND_B") {
									var first = list.shift();
								}
								if (elt.itemField === 'VTE_SECOND_F') {
									//重组list
									var totsize = 0;
									list.forEach(function (ele, i, array) {
										ele.cols = 4;
										totsize++;
										elt.itemList.push({
											"itemList": [ele]
										})
										if (ele.itemList) {
											var size = Math.ceil(ele.itemList.length /
												rowNumb);
											totsize += size;
											for (var i = 0; i < size; i++) {
												if (ele.itemList.length < rowNumb) {
													ele.itemList[ele.itemList.length - 1]
														.cols = rowNumb - ele.itemList
														.length + 1;
												}
												elt.itemList.push({
													"itemList": ele.itemList.splice(0,
														rowNumb)
												})
											}
										}
									})

									//设置第一个cols rows
									first.rows = totsize;
									//把第一个放入第一个list
									elt.itemList[0].itemList.splice(0, 0, first);
								} else {
									//剩下list分组
									var size = Math.ceil(list.length / rowNumb);
									if (rowNumb == 1) {
										list.forEach(function (e) {
											e.cols = 4;
											elt.itemList.push({
												"itemList": [e]
											})
										})
									} else {
										for (var i = 0; i < size; i++) {
											if (list.length < rowNumb) {
												list[list.length - 1].cols = rowNumb - list.length +
													1;
											}
											elt.itemList.push({
												"itemList": list.splice(0, rowNumb)
											})
										}
									}

									if (elt.itemField !== "VTE_SECOND_B") {
										//设置第一个cols rows
										first.rows = size;
										//把第一个放入第一个list
										elt.itemList[0].itemList.splice(0, 0, first);
									}
								}
							})
						}
					} else if (element.itemField === 'VTE_THIRD') {
						if (element.itemList) {
							var itemList = element.itemList;
							itemList.forEach(function (elt, i, array) {
								var rowNumb = 3;

								var list = elt.itemList;
								elt.itemList = [];
								var rows = 0;
								var cols = 4;
								list.forEach(function (ele, ind) {
									if (ele.itemFlag === '2') {
										//获取前面一个设置cols
										if (elt.itemList.length != 0 && cols != 0) {
											elt.itemList[elt.itemList.length - 1].itemList[elt
												.itemList[elt.itemList.length - 1]
												.itemList.length - 1].cols = cols + 1;
										}
										elt.itemList.push({
											"itemList": [ele]
										});
										cols = 4;
										cols--;
									} else {
										if (cols == 0) {
											elt.itemList.push({
												"itemList": [{}]
											});
											cols = 3;
										}
										if (ind == list.length - 1) {
											ele.cols = cols + 1;
										}
										elt.itemList[elt.itemList.length - 1].itemList.push(
											ele);
										cols--;
									}
								})

							})
						}
					}
					vm[element.itemField] = element;
				});
			})
		}

		function setLayout() {
			var WIN_W = $(window).width();
			var WIN_H = $(window).height();
			var modInfo_H = $('#mod-info-box').outerHeight();
			var saveBar_H = $('#saveBar').outerHeight();
			$('#sco-container').outerHeight(WIN_H - saveBar_H - modInfo_H);
		}


		function checkedOnlyOne() {
			$(document).ready(function () { //JS生成的checkbox要加上这句
				vm.feelArr.forEach(function (el, idx, arr) {
					$('#vte2form').find('input[type=checkbox][name="' + el.typeCode + '"]').on('click',
						function () {
							$('#vte2form').find('input[type=checkbox][name="' + el.typeCode + '"]').not(
								this).prop("checked", false);
						});
				})

			});

		}

		function hideSignSpan() {
			if (!_gradeSeq) {
				$("#signSpan").hide();
			}
		}


		function print() {
			refreshData();

			LODOP = getLodop();
			LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
			LODOP.SET_PRINT_PAGESIZE(0, 0, 0, "A4");

			LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
			var strBodyStyle =
				"<style>table {border-collapse:collapse;width:100%} table,td { border:1px solid black;border-collapse:collapse;}table,th { border:1px solid black;border-collapse:collapse;}</style>";
			LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", strBodyStyle + document.getElementById("vte2form").innerHTML);

			LODOP.SET_PRINT_MODE("FULL_WIDTH_FOR_OVERFLOW", true);
			LODOP.SET_PRINT_MODE("FULL_HEIGHT_FOR_OVERFLOW", true);
			LODOP.NewPageA();
			LODOP.SET_PRINT_STYLE("FontSize", 10);
			//LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
			LODOP.PREVIEW();
			// LODOP.PRINTB();
			return true;

		}



		function refreshData() { //让innerHTML获取的内容包含input和select(option)的最新值
			var allInputObject = document.body.getElementsByTagName("input");
			for (i = 0; i < allInputObject.length; i++) {
				if (allInputObject[i].type == "checkbox") {
					if (allInputObject[i].checked)
						allInputObject[i].setAttribute("checked", "checked");
					else
						allInputObject[i].removeAttribute("checked");
				} else if (allInputObject[i].type == "radio") {
					if (allInputObject[i].checked)
						allInputObject[i].setAttribute("checked", "checked");
					else
						allInputObject[i].removeAttribute("checked");
				} else allInputObject[i].setAttribute("value", allInputObject[i].value);
			};
			for (i = 0; i < document.getElementsByTagName("select").length; i++) {
				var sl = document.getElementsByTagName("select")[i];
				for (j = 0; j < sl.options.length; j++) {
					if (sl.options[j].selected)
						sl.options[j].setAttribute("selected", "selected");
					else sl.options[j] = new Option(sl.options[j].text, sl.options[j].value);
				};
			};
		};

		$(function () {
			//setLayout();
			getDictInfo().done(function () {
				$("input[name='PADUA_SCO']").css("visibility", "hidden");
				$("input[name='VTE_THIRD_A2_4_info']").css("visibility", "hidden");
				$("input[name='VTE_THIRD_A3_5_info']").css("visibility", "hidden");
				getAllInfo();
			});
			eicuUtil.bindUserInput();
		})
	</script>
</body>