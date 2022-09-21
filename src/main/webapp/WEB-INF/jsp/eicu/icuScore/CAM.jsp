<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<style type="text/css">
		.panelGde table .eventr {
			text-align: center;
		}

		.panelGde table .eventr th {
			text-align: left;
			padding-left: 20px;
			padding-right: 20px;
		}

		.panelGde table .oddtr {
			text-align: center;
		}

		.panelGde table .oddtr th {
			text-align: left;
			padding-left: 20px;
			padding-right: 20px;
		}

		.scoreQuery .headtitle {
			float: none !important;
		}
	</style>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>CAM-ICU谵妄评估量表</title>
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/popbox.css?5">
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/hzszyyhems/scoreQuery.css?aaa=5555">
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/hzszyyhems/popbox.css?5">
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="scoreQuery" ms-controller="camGde">
	<p class="headtitle"></p>
	<div class="panelGde">
		<form id="camForm" action="${baseurl}icuscore/addCamScore.do" method="post">
			<div class="BradenContent panelContent">
				<table class="paneltab">
					<tr class="firsttr">
						<th style="width:20%">临床特征</th>
						<td style="width:70%">评价指标</td>
						<td>评分(阳性)</td>
					</tr>
					<tr class="eventr">
						<th>特征1、精神状态突然改变或起伏不定</th>
						<th>病人是否出现精神状态的突然改变？过去24小时是否有反常行为。<br />如：时有时无或者时而加重时而减轻？ 过去24小时镇静评分（SAS或MAAS）或昏迷评分（GCS）是否有波动？
						</th>
						<td>
							<input type="checkbox" name="CAM_A_1" value="1" ms-click="radioClick()" />
						</td>
					</tr>
					<tr class="oddtr">
						<th>特征2、 注意力散漫</th>
						<th>病人是否有注意力集中困难？<br />
							病人是否有保持或转移注意力的能力下降？<br />
							病人注意力筛查（ASE）得分多少？（如：ASE的视觉测试是对10个画面的回忆准确
							度；ASE的听觉测试病人对一连串随机字母读音中出现“A”时点头或捏手示意。）</th>
						<td>
							<input type="checkbox" name="CAM_B_1" value="1" disabled="disabled"
								ms-click="radioClick()" />
						</td>
					</tr>
					<tr class="eventr">
						<th>特征3、 意识水平改变</th>
						<th>当前RASS水平(不为0，打勾)</th>
						<td>
							<input type="checkbox" name="CAM_C_1" value="1" disabled="disabled"
								ms-click="radioClick()" />
						</td>
					</tr>
					<tr class="oddtr">
						<th>特征4、 思维无序</th>
						<th>
							若病人已经脱机拔管，需要判断其是否存在思维无序或不连贯。常表现为对话散漫离题、思维逻辑不清或主题变化无常。<br />
							若病人在带呼吸机状态下，检查其能否正确回答以下问题<br /> 1. 石头会浮在水面上吗？<br /> 2. 海里有鱼吗？<br />
							3. 一磅比两磅重吗？<br /> 4. 你能用锤子砸烂一颗钉子吗？<br />
							在整个评估过程中，病人能否跟得上回答问题和执行指令？<br /> 1. 你是否有一些不太清楚的想法？<br /> 2.
							举这几个手指头（检查者在病人面前举两个手指 头）。<br /> 3. 现在换只手做同样的动作（检查者不用再重复动 作）
							</b></th>
						<td>
							<input type="checkbox" name="CAM_D_1" value="1" disabled="disabled"
								ms-click="radioClick()" />
						</td>
					</tr>
					<tr class="firsttr">
						<th rowspan="2"><b>总体评分</b></th>
						<td><label class="labtab">若病人有特征1和特征2，或者特征3，或者特征4，就可诊断为谵妄</label></td>
						<td rowspan="2">
							<b>{{CAM_SCO}}</b><!-- {{panduan}} -->
						</td>
					</tr>
					<tr class="firsttr">
						<td>
							<!-- <span id="signSpan">评分时间：{{lastTime}}&nbsp;&nbsp;&nbsp;&nbsp;评分用户：{{lastUser}}</span> -->
							<div id="modInfo" class="signBorderBox">
								<label>
									<span>评分时间：</span>
									<input class="Wdate" type="text" id="modTimeStr"
										onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})"
										autocomplete="off">
								</label>
								<label>
									<span>评分人：</span>
									<input class="userInput" type="text" id="modUser" autocomplete="off">
								</label>
							</div>
						</td>
					</tr>
					<input type="hidden" name="CAM_SCO" ms-duplex-string="CAM_SCO">
				</table>
				<div id="selfSave">
					<input type="button" class="commonbtn" value="保存" onclick="saveCom()">
					<input type="button" class="commonbtn" value="保存并关闭" onclick="saveCom('close')">
					<input type="button" class="commonbtn" value="关闭" onclick="parent.closemodalwindow()">
					<input type="button" class="commonbtn" id="selfDelBtn" value="删除" onclick="parent.delCom()">
				</div>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		//全局变量
		var _baseUrl = "${baseurl}",
			_liveNo = "${liveNo}",
			_userid = "${activeUser.usrno}",
			_gradeSeq = "${gradeSeq}",
			_gradeType = "${gradeType}";
	</script>
	<script src="${baseurl}js/subpageJs/eicu/scoreCommon.js" type="text/javascript" charset="UTF-8"></script>
	<script type="text/javascript">
		var _baseUrl = "${baseurl}",
			_liveNo = '${liveNo}',
			_gradeSeq = '${gradeSeq}',
			_gradeType = '${gradeType}';
		var parentBasicPage = parent.$('#tabDiv').length !== 0 ? true : false;

		var vm = avalon.define({
			$id: "camGde",
			lastTime: "",
			lastUser: "",
			CAM_SCO: '无谵妄', //cam评分
			//	panduan: "无谵妄",//
			radioClick: function () {

				if ($("input[name='CAM_A_1']:checked").length == "1") {
					//	vm.CAM_SCO = "无谵妄"
					//vm.panduan = "";
					$("input[name='CAM_B_1']").removeAttr("disabled");

					if ($("input[name='CAM_B_1']:checked").length == "1") {
						vm.CAM_SCO = "无谵妄";
						//	vm.panduan = "无谵妄";
						$("input[name='CAM_C_1']").removeAttr("disabled");
						$("input[name='CAM_D_1']").removeAttr("disabled");
						if ($("input[name='CAM_C_1']:checked").length == "1") {
							$("input[name='CAM_C_1']").removeAttr("disabled");
							$("input[name='CAM_D_1']").attr("disabled", true);
							vm.CAM_SCO = "谵妄";
							//	vm.panduan = "谵妄";
						} else {
							vm.CAM_SCO = "无谵妄";
							//	vm.panduan = "无谵妄";
						}
						if ($("input[name='CAM_D_1']:checked").length == "1") {
							$("input[name='CAM_D_1']").removeAttr("disabled");
							$("input[name='CAM_C_1']").attr("disabled", true);
							vm.CAM_SCO = "谵妄";
							//	vm.panduan = "谵妄";
						}

					} else {
						$("input[name='CAM_C_1']").attr("disabled", true);
						$("input[name='CAM_D_1']").attr("disabled", true);
						$("input[name='CAM_C_1']").attr("checked", false);
						$("input[name='CAM_D_1']").attr("checked", false);
						vm.CAM_SCO = "无谵妄";
						//	vm.panduan = "无谵妄";
					}

				} else {
					$("input[name='CAM_B_1']").attr("disabled", true);
					$("input[name='CAM_C_1']").attr("disabled", true);
					$("input[name='CAM_D_1']").attr("disabled", true);
					$("input[name='CAM_B_1']").attr("checked", false);
					$("input[name='CAM_C_1']").attr("checked", false);
					$("input[name='CAM_D_1']").attr("checked", false);
					vm.CAM_SCO = "无谵妄";
					//vm.panduan = "无谵妄";
				}
				/* if($("input[name='CAM_A_1']:checked").length == "1"){
					$("input[name='CAM_C_1']").removeAttr("disabled");
					 $("input[name='CAM_C_1']").removeAttr("disabled");
				} */
			}
		});

		function getCamMsg() {
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
				for (var i = 0; i < _res.length; i++) {
					var field = _res[i].itemField;
					var value = publicFun.camelCase(_res[i].itemValue)
					$("input[name='" + field + "'][value='" + value + "']").prop("checked", true);
				}

				if ($("input[name='CAM_A_1']:checked").length == "1" &&
					$("input[name='CAM_B_1']:checked").length == "1" &&
					$("input[name='CAM_C_1']:checked").length == "1") {
					$("input[name='CAM_A_1']").removeAttr("disabled");
					$("input[name='CAM_B_1']").removeAttr("disabled");
					$("input[name='CAM_C_1']").removeAttr("disabled");
					vm.CAM_SCO = "谵妄";
					//	vm.panduan = "谵妄";
				} else if ($("input[name='CAM_A_1']:checked").length == "1" &&
					$("input[name='CAM_B_1']:checked").length == "1" &&
					$("input[name='CAM_D_1']:checked").length == "1") {

					$("input[name='CAM_A_1']").removeAttr("disabled");
					$("input[name='CAM_B_1']").removeAttr("disabled");
					$("input[name='CAM_D_1']").removeAttr("disabled");
					vm.CAM_SCO = "谵妄";
					//	vm.panduan = "谵妄";

				} else if ($("input[name='CAM_A_1']:checked").length == "0") {
					//$("input[name='CAM_B_1']").removeAttr("disabled");
					/* 	if ($("input[name='CAM_B_1']:checked").length == "1") {
							$("input[name='CAM_C_1']").removeAttr("disabled");
							$("input[name='CAM_D_1']").removeAttr("disabled");
						} */
					vm.CAM_SCO = "无谵妄";
					//	vm.panduan = "无谵妄";
				} else {
					$("input[name='CAM_B_1']").removeAttr("disabled");
					if ($("input[name='CAM_B_1']:checked").length == "1") {
						$("input[name='CAM_C_1']").removeAttr("disabled");
						$("input[name='CAM_D_1']").removeAttr("disabled");
					}
					vm.CAM_SCO = "无谵妄";
					//	vm.panduan = "无谵妄";
				}

				if (totalInfo) {
					// vm.lastUser = totalInfo.gradeUserStr;
					// vm.lastTime = publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm")
					$("#modTimeStr").val(publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm"));
					$("#modUser").val(totalInfo.gradeUser);
					eicuUtil.queryDoct($("#modUser"));
				} else {
					getParentModInfo();
				}

			})

		}


		//保存
		function saveCom(closeFlag) {
			if (vm.CAM_SCO === '' || vm.CAM_SCO === null) {
				alert_warn("CAM评分为空");
				return false
			}
			/* if ($("input[name='CAM_A_1']:checked").length == "1" && $("input[name='CAM_B_1']:checked").length == "1"
			&&($("input[name='CAM_C_1']:checked").length == "0" && $("input[name='CAM_D_1']:checked").length == "0")) {
				alert_warn("请继续评估特征3或者特征4");
				return false
			} */
			var gradeUser = $("#modUser").data("userid") || "";
			var gradeTimeStr = $("#modTimeStr").val();
			if (!gradeTimeStr) {
				alert_warn("评分时间不能为空");
			} else if (!gradeUser) {
				alert_warn("评分人不能为空");
			} else {
				// _confirm('您确认提交吗？', null, function () {
				//	jquerySubByFId('modsForm', insertuser_callback, null, "json");
				var obj = $('#camForm').serializeJson();
				var itemList = [];
				for (var key in obj) {
					var pushObj = {};
					pushObj["itemField"] = key;
					pushObj["itemValue"] = obj[key];
					itemList.push(pushObj);
				}
				publicFun.httpRequest(_baseUrl + "icuscore/editGradeSco.do", {
					"icuGradeTotalCustom":{
						"liveNo": _liveNo,
						"gradeSeq": _gradeSeq,
						"gradeType": _gradeType,
						"gradeTimeStr": $("#modTimeStr").val(),
						"gradeUser": $("#modUser").data("userid") || "",
						"gradeSco": vm.CAM_SCO,
						"gradeDetl": scoreTitle + ': ' + vm.CAM_SCO
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
						parent.modalReturnFun(vm.CAM_SCO, res.resultInfo.sysdata.gradeSeq, closeFlag);
					}
				})
				// })
			}
		}

		//保存回调
		function insertuser_callback(data) {
			window.parent.$('#tabDiv').datagrid('reload');
			window.parent.ajax_alert(data);
		}

		function checkedOnlyOne() {
			// $(document).ready(function () {  //JS生成的checkbox要加上这句

			$('#camForm').find('input[type=checkbox][name="CAM_C_1"]').bind('click', function () {
				$('#camForm').find('input[type=checkbox][name="CAM_D_1"]').not(this).attr("checked", false);
			});

			$('#camForm').find('input[type=checkbox][name="CAM_D_1"]').bind('click', function () {
				$('#camForm').find('input[type=checkbox][name="CAM_C_1"]').not(this).attr("checked", false);
			});
			// });
		}

		function hideSignSpan() {
			if (!_gradeSeq) {
				$("#signSpan").hide();
			}
		}

		$(function () {
			checkedOnlyOne();
			hideSignSpan();
			if (parentBasicPage) { //如果父元素有dataGrid相关，则隐藏页面保存按钮
				$("#selfSave").hide();
			}
			if (!_gradeSeq) {
				$("#selfDelBtn").hide();
			}
			getCamMsg();
		})
	</script>
</body>