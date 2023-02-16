<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>CAM-ICU谵妄评估量表</title>
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
	<link
		rel="stylesheet"
		type="text/css"
		href="${baseurl}styles/eicu/eicu_common.css"
	/>
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
	<%@ include
		file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp" %>
	<script
		src="${baseurl}lib/avalon1.4.8/avalon.js"
		type="text/javascript"
		charset="UTF-8"
	></script>
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
	<style type="text/css">
		.page-title {
			padding: 5px;
			font-size: 14px;
			font-weight: bold;
			text-align: center
		}

		.colorInfo {
			background: #a8e0f5;
		}

		.paneltab {
			width: 95%;
			margin: auto;
		}

		.paneltab tr td {
			border: 1px solid #0c80d7;
			text-align: center;
		}

		.paneltab tr td.title-text {
			font-size: 14px;
			font-weight: bold;
			text-align: left;
		}

		.paneltab tr td.content-td {
			text-align: left;
		}

		.bold-font {
			font-weight: bold;
		}

		.underline-text {
			text-decoration: underline;
		}

		ol {
			padding-left: 20px;
		}

		ol > li {
			list-style-type: decimal;
		}
	</style>
</head>

<body class="scoreQuery" ms-controller="camGde">
<p class="headtitle page-title"></p>
<div class="total-container">
	<form id="camForm" action="${baseurl}icuscore/addCamScore.do" method="post">
		<div class="BradenContent panelContent">
			<table class="paneltab">
				<colgroup>
					<col>
					<col style="width:130px">
					<col style="width:150px">
				</colgroup>
				<tr class="colorInfo">
					<td class="title-text">
						特征1、意识状态急性改变或波动
					</td>
					<td class="title-text" style="text-align: center">阳性标准</td>
					<td>如阳性在这里打√</td>
				</tr>
				<tr>
					<td class="content-td">
						<p>患者的意识状态是否与其基线状况不同？</p>
						<p>或</p>
						<p>在过去的24小时内，患者的意识状态是否有任何波动？表现为镇静量表（如RASS）、GCS或既往谵妄评估得分的波动</p>
					</td>
					<td>
						<p>任何问题答案为“是”</p>
						<p class="align-center">→</p>
					</td>
					<td>
						<input type="checkbox" id="CAM_A_1" name="CAM_A_1" value="1"
							   ms-attr-checked="itemCheckedInfo['CAM_A_1']"
							   ms-click="radioClick()"/>
					</td>
				</tr>
				<tr class="colorInfo">
					<td colspan="3" class="title-text">特征2、注意力障碍</td>
				</tr>
				<tr>
					<td class="content-td">
						<p><span class="underline-text bold-font">数字法检查注意力</span>（用图片法代替请参照培训手册）</p>
						<p>
							<span class="underline-text">指导语</span>：
							跟患者说，“我要给您读10个数字，任何时候当您听到数据‘8’，就捏一下我的手表示。”然后正常的语调朗读下列数字，
							每个间隔3秒。
						</p>
						<p class="align-center">6&nbsp;8&nbsp;5&nbsp;9&nbsp;8&nbsp;3&nbsp;8&nbsp;8&nbsp;4&nbsp;7</p>
						<p class="bold-font">当读到数字“8”患者没有握手或读到其他数字时患者做出握手动作均计为错误。</p>
					</td>
					<td>
						<p>错误数>2</p>
						<p>
							→
						</p>
					</td>
					<td>
						<input type="checkbox" id="CAM_B_1" name="CAM_B_1" value="1"
							   ms-attr-checked="itemCheckedInfo['CAM_B_1']"
							   ms-click="radioClick()"/>
					</td>
				</tr>
				<tr>
					<td colspan="3" class="colorInfo title-text">
						特征3、意识水平改变
					</td>
				</tr>
				<tr>
					<td class="content-td">
						<div style="display: flex;align-items:center;">
							<span>如果RASS的实际得分不是清醒且平静（0分）为阳性</span>
							<span class="icu-btn-group" style="justify-content:flex-end">
									<span ms-visible="rassInfo.gradeSeq" class="icu-badge" ms-click="toRassPage()">
										<span class="badge-label" ms-class-1="{{rassInfo.riskColor || ''}}">
											{{rassInfo.gradeType}}
										</span>
										<span ms-visible="rassInfo.gradeSco" class="badge-content">
											{{rassInfo.gradeSco}}
                      <span class="unit"> 分</span>
										</span>
                    <span ms-visible="!rassInfo.gradeSco" class="badge-content">
                      暂无评分
                    </span>
									</span>
								</span>
						</div>
					</td>
					<td>
						<p>
							RASS不为“0”
						</p>
						<p class="align-center">→</p>
					</td>
					<td>
						<input type="checkbox" id="CAM_C_1" name="CAM_C_1" value="1"
							   ms-attr-checked="itemCheckedInfo['CAM_C_1']"
							   ms-click="radioClick()"/>
					</td>
				</tr>
				<tr>
					<td colspan="3" class="colorInfo title-text">特征4、思维混乱</td>
				</tr>
				<tr>
					<td class="content-td">
						<p>
								<span class="underline-text bold-font">
									是非题
								</span>
							（需更换另一套问题请参照培训手册）
						</p>
						<ol>
							<li>石头是否能浮在水面上？</li>
							<li>海里是否有鱼？</li>
							<li>1斤是否比2斤重？</li>
							<li>您是否能用榔头钉钉子？</li>
						</ol>
						<p class="bold-font">
							当患者回答错误时记录错误的个数
						</p>
						<p class="underline-text bold-font">
							执行指令
						</p>
						<p style="padding-left: 5px;box-sizing: border-box">
							跟患者说：“伸出这几根手指”（检查者在患者前面伸出2根手指），然后说：“现在用另一只手伸出同样多的手指”（这次检查者不做示范）
						</p>
						<p style="padding-left: 5px;box-sizing: border-box">
							*如果患者只有一只手能动，第二个指令改为要求患者“再增加一个手指”
						</p>
						<p class="bold-font">
							如果患者不能成功执行全部指令，记录1个错误。
						</p>
					</td>
					<td>
						<p>
							错误总数>1
						</p>
						<p>→</p>
					</td>
					<td>
						<input type="checkbox" id="CAM_D_1" name="CAM_D_1" value="1"
							   ms-attr-checked="itemCheckedInfo['CAM_D_1']"
							   ms-click="radioClick()"/>
					</td>
				</tr>
				<tr class="firsttr">
					<td class="colorInfo bold-font" rowspan="2">
						<p>
							CAM-ICU总体评估
						</p>
						<p>
							特征 1
							<span class="underline-text">加</span>
							2
							<span class="underline-text">和</span>
							特征3
							<span class="underline-text">或</span>
							4 阳性 = CAM-ICU 阳性</p>
					</td>
					<td>
						<p ms-class-1="{{CAM_SCO==='谵妄' ? 'bold-font' : ''}}">
							符合标准→
						</p>
					</td>
					<td>
						<%--							<b>{{CAM_SCO}}</b>--%>
						<p>
							<input type="checkbox" disabled id="cam-flag-1" name="cam-flag" ms-attr-checked="{{CAM_SCO==='谵妄'}}">
						</p>
						<p ms-class-1="{{CAM_SCO==='谵妄' ? 'bold-font' : ''}}">
							<label for="cam-flag-1">CAM-ICU阳性(谵妄存在)</label>
						</p>
					</td>
				</tr>
				<tr>
					<td>
						<p  ms-class-1="{{CAM_SCO!=='谵妄' ? 'bold-font' : ''}}">
							不符合标准→
						</p>
					</td>
					<td>
						<%--							<b>{{CAM_SCO}}</b>--%>
						<p>
							<input type="checkbox" disabled id="cam-flag-2" name="cam-flag" ms-attr-checked="{{CAM_SCO!=='谵妄'}}">
						</p>
						<p ms-class-1="{{CAM_SCO!=='谵妄' ? 'bold-font' : ''}}">
							<label for="cam-flag-2">CAM-ICU阴性(无谵妄)</label>
						</p>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<div id="modInfo" class="signBorderBox">
							<label>
								<span>评分时间：</span>
								<input class="Wdate" type="text" id="modTimeStr"
									   onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})"
									   autocomplete="off">
							</label>
							<label>
								<span>评分人：</span>
								<input style="width: 70px" class="userInput" type="text" id="modUser" autocomplete="off" ms-duplex-string="user.userNum">
							</label>
						</div>
					</td>
				</tr>
				<input type="hidden" name="CAM_SCO" ms-duplex-string="CAM_SCO">
			</table>
			<div ms-if="modalFlag" id="selfSave">
				<input type="button" class="commonbtn" value="保存" onclick="saveCom()">
				<input type="button" class="commonbtn" value="保存并关闭" onclick="saveCom('close')">
				<input type="button" class="commonbtn" value="关闭" onclick="parent.closemodalwindow()">
				<input type="button" class="commonbtn" id="selfDelBtn" value="删除" onclick="parent.delCom()">
			</div>
		</div>
	</form>
</div>
<script type="text/javascript">
	var _baseUrl = '${baseurl}';
	var DEFAULT_USER_ID = '${activeUser.usrno}';
	var DEFAULT_USER_NAME = '${activeUser.usrname}';
	_modalFlag = false
	//全局变量
	var _baseUrl = "${baseurl}",
		_userid = "${activeUser.usrno}",
		_gradeSeq = "${gradeSeq}",
		_gradeType = "${gradeType}";
	var ptBasicInfo = eicuUtil.ptBasicInfo;
	var _liveNo = '${liveNo}';
	var _initFlag = true; // 初始化标志
</script>
<script src="${baseurl}js/subpageJs/eicu/scoreCommon.js" type="text/javascript" charset="UTF-8"></script>
<script type="text/javascript">
	// modalFlag 在commonjs内
	var menuInfoObj;
	var menuInfoMap; // menuType - info map
	var vm = avalon.define({
		$id: "camGde",
		modalFlag: _modalFlag,
		lastTime: "",
		lastUser: "",
		rassInfo: {}, // rass评分
		itemCheckedInfo: {
			'CAM_A_1': false,
			'CAM_B_1': false,
			'CAM_C_1': false,
			'CAM_D_1': false,
		},
		user: {
			userId: _userid,
			userNum: DEFAULT_USER_NAME
		},
		CAM_SCO: '无谵妄', //cam评分
		//	panduan: "无谵妄",//
		// 跳转Rass评分页
		toRassPage: function () {
			var thisMenuInfo = menuInfoMap.RASS;
			icuTabUtil.openTab(thisMenuInfo, ptBasicInfo, {
				pageType: 'CAM',
				pageData: {
					liveNo: ptBasicInfo.liveNo,
					displayMode: 'basic' // 默认普通模式
				}
			});
		},
		// 单选
		radioClick: function (e) {
			var el = e ? e.target : {};
			var id = el.id || '';
			var itemCheckedInfo = vm.itemCheckedInfo;
			// set this check info
			if (id) {
				// 根据gradeSco设置后计算时可直接调用
				itemCheckedInfo[id] = itemCheckedInfo[id] ? false : true;
			}
			// cal CAM
			if (itemCheckedInfo['CAM_A_1'] &&
				itemCheckedInfo['CAM_B_1'] &&
				(itemCheckedInfo['CAM_C_1'] || itemCheckedInfo['CAM_D_1'])) {
				// 123 || 124
				vm.CAM_SCO = '谵妄';
			} else {
				vm.CAM_SCO = '无谵妄';
			}
		}
	});
	/**
	 * 获取全部数据
	 */
	function getAllInfo() {
		publicFun.httpRequest(_baseUrl + "icuscore/findGradeInfoByParam.do", {
			"gradeSeq": _gradeSeq,
			"gradeType": _gradeType,
			"liveNo": _liveNo,
			date: new Date().toTimeString()
		}, function (res) {
			if (!res.resultInfo.success) {
				return;
			}
			var sysdata = res.resultInfo.sysdata;
			var itemList = sysdata.itemlist || [];
			var totalInfo = sysdata.totalInfo || {};
			var rassInfo = sysdata.rassInfo;
			if (_initFlag) {
				// 初始化
				// reset checkFlag
				$.each(vm.itemCheckedInfo, function (k) {
					vm.itemCheckedInfo[k] = false;
				})
				itemList.forEach(function (itemEl, itemIdx) {
					var itemField = itemEl.itemField;
					var itemValue = itemEl.itemValue;
					if (itemField === 'CAM_SCO') {
						vm.CAM_SCO = itemValue;
					} else {
						vm.itemCheckedInfo[itemField] = true;
					}
				})
				if (totalInfo && totalInfo.length > 0) {
					// vm.lastUser = totalInfo.gradeUserStr;
					// vm.lastTime = publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm")
					$("#modTimeStr").val(publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm"));
					// $("#modUser").val(totalInfo.gradeUser);
					vm.user.userId = totalInfo.gradeUser
					// eicuUtil.queryDoct($("#modUser"));
				} else {
					getParentModInfo();
				}
			}
			if(rassInfo) {
				if (rassInfo.gradeSco !== null && rassInfo.gradeSco !== '0') {
					// 存在且不是零分，强制勾选RASS项
					vm.itemCheckedInfo['CAM_C_1'] = true;
					vm.radioClick();
				}
				vm.rassInfo = rassInfo;

			}

			_initFlag = false;
		})

	}

	function getParentModInfo() {
		var thisDateStr = publicFun.timeFormat(new Date().getTime(), 'yyyy/MM/dd hh:mm');
		$('#modTimeStr').val(thisDateStr);
		// $('#gradeUser').val(_userid);
		vm.user.userId = _userid
		// eicuUtil.queryDoct($('#gradeUser'));
	}
	//保存
	function saveCom(closeFlag) {
		if (vm.CAM_SCO === '' || vm.CAM_SCO === null) {
			alert_warn("CAM评分为空");
			return false
		}
		var gradeUser = vm.user.userId || '';
		var gradeTimeStr = $("#modTimeStr").val();
		if (!gradeTimeStr) {
			alert_warn("评分时间不能为空");
		} else if (!gradeUser) {
			alert_warn("评分人不能为空");
		} else {
			publicFun.ajaxLoading('保存中')
			// _confirm('您确认提交吗？', null, function () {
			//	jquerySubByFId('modsForm', insertuser_callback, null, "json");
			var obj = getFormJson("#camForm")
			function getFormJson(form) {
				var o = {};
				var a = $(form).serializeArray();
				$.each(a, function () {
					if (o[this.name] !== undefined) {
						if (!o[this.name].push) {
							o[this.name] = [o[this.name]];
						}
						o[this.name].push(this.value || '');
					} else {
						o[this.name] = this.value || '';
					}
				});
				return o;
			}

			var itemList = [];
			for (var key in obj) {
				var pushObj = {};
				pushObj["itemField"] = key;
				pushObj["itemValue"] = obj[key];
				itemList.push(pushObj);
			}
			publicFun.httpRequest(_baseUrl + "icuscore/editGradeSco.do", {
				"icuGradeTotalCustom": {
					"liveNo": _liveNo,
					"gradeSeq": _gradeSeq,
					"gradeType": _gradeType,
					"gradeTimeStr": $("#modTimeStr").val(),
					"gradeUser": vm.user.userId || '',
					"gradeSco": vm.CAM_SCO,
					"gradeDetl": scoreTitle + ': ' + vm.CAM_SCO
				},
				"itemList": itemList
			}, {
				requestType: "json"
			}, function (res) {
				publicFun.ajaxLoadEnd()
				if (!res.resultInfo.success) {
					publicFun.alert(res.resultInfo.message);
					return;
				}
				// 保存后重置初始化
				_initFlag = true;
				if (_modalFlag) {
					parent.modalReturnFun(vm.CAM_SCO, res.resultInfo.sysdata.gradeSeq, closeFlag);
				} else {
					if (!_gradeSeq) {
						_gradeSeq = res.resultInfo.sysdata.gradeSeq;
					}
					// insertuser_callback(res);

					publicFun.successalert('保存成功')
					parent.$('#panel-grid-table').datagrid('reload');
				}
			})
			// })
		}
	}
	/**
	 *获取菜单映射
	 */
	function getMenuInfo() {
		var thisItemInfo;
		var icuMenu = JSON.parse(sessionStorage.getItem('icuMenu'));
		menuInfoObj = icuMenu['menuInfoObj'];
		menuInfoMap = {};
		for (var k in menuInfoObj) {
			if (menuInfoObj.hasOwnProperty(k)) {
				thisItemInfo = menuInfoObj[k];
				thisItemInfo['pageval'] = k;
				menuInfoMap[thisItemInfo.menuType] = thisItemInfo;
			}
		}
	}

	$(function () {
		if (!_gradeSeq) {
			$("#selfDelBtn").hide();
		}
		getAllInfo();
	})
</script>
</body>
