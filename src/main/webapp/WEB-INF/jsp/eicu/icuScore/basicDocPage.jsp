<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>新昌县中医院患者使用保护性约束告知书</title>
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<%-- <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/evl_common.css"> --%>
	<link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
	<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
	<%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
	<style type="text/css">
		html {
			overflow-y: auto;
		}

		body {
			max-width: 1024px;
			margin: 0 auto;
		}
	</style>
	<style type="text/css" id="style1">
		img {
			vertical-align: middle;
		}

		.tys {
			width: 80%;
			margin: 0 auto;
		}

		.pardiv {
			width: 80%;
			margin: auto;
		}

		.basicDiv,
		.maintext {
			font-size: 14px;
		}

		.paddR30 {
			padding-right: 30px;
		}

		.paddR20 {
			padding-right: 20px;
		}

		.wd50 {
			display: inline-block;
			width: 50%
		}

		.wd70 {
			width: 70%;
		}

		.wd35 {
			display: inline-block;
			width: 35%;
		}

		.wd30 {
			display: inline-block;
			width: 30%;
		}

		/* PNB */
		.putline {
			border: none !important;
			border-bottom: 1px solid #ddd !important;
		}

		p {
			margin-right: 45px;
		}

		/* BNB */
		.lineThr {
			display: inline-block;
			width: 30%;
		}

		#title {
			text-align: center;
			font-size: 18px;
			font-weight: bolder;
			padding: 10px;
		}

		.basicDiv label span {
			border-bottom: 1px solid black;

		}

		table tr td {
			border: 1px solid black;
			text-align: left;
			padding: 5px;
			font-size: 12px;
			line-height: 27px;
		}

		table {
			margin-bottom: 20px;
			width: 95%;
		}

		.tabletitle {
			text-align: center;
		}

		.titletr {
			border-bottom: 1px solid #000
		}

		.indenttwo {
			text-indent: 2em;
		}

		.prtTr {
			display: none;
		}

		.prtTr>td {
			width: 50%;
		}

		.intextinputlong {
			border: none !important;
			border-bottom: 1px solid #ddd !important;
			width: 130px;
		}

		.trunright {
			height: 30px;
			float: left;
			width: 35%;
			margin-left: 65% !important;
			text-align: left;
			line-height: 1.5;
		}

		.lthreefont {
			padding-left: 42px
		}

		.lonefont {
			padding-left: 14px
		}

		.sectiontitle {
			font-size: 13px;
			font-weight: bolder;
		}

		.indentthree {
			text-indent: 3em;
		}

		.indentfour {
			text-indent: 4em;
		}

		.qtmargin {
			margin-left: 20px;
		}

		.prespan {
			display: none;
			width: 180mm;
			border: none;
			text-indent: .5em;
			font-size: .38cm;
			resize: none;
		}

		.pretextarea {
			display: block;
			width: 91%;
			height: 86px;
			border: #ddd 1px solid;
			font-size: 12px;
			resize: none;
		}

		.intextinputall {
			border: none !important;
			border-bottom: 1px solid #ddd !important;
			width: 680px;
		}

		.qtmargin {
			margin-left: 20px;
		}

		.pointtext {
			text-decoration: underline;
			font-size: 14px;
			font-weight: bolder;
			text-align: center;
			width: 150px;
		}

		.checklabel {
			margin-right: 10px;
			color: #2a00ff;
		}

		.td-bottom {
			border-bottom: 1px solid #fff;
			width: 50%;
		}

		.inputli {
			height: 30px;
		}

		li {
			padding: 2px 0px;
		}

		/*new*/
		.child-main-view {
			display: none;
		}
	</style>
</head>

<body>
	<div class="xtpg">
		<div id="tys" class="tys">
			<div id="title">
				<p class="functype"></p>
			</div>
			<div id="mainView" class="mainView">
				<div id="empty-temp" class="child-main-view">
					<jsp:include page="/WEB-INF/jsp/eicu/icuScore/template/${gradeType}.jsp"></jsp:include>
				</div>
				<div id="db-html" class="child-main-view">

				</div>
				<%--<c:choose>
					<c:when test="${gradeSeq == null || gradeSeq == '' }">
						<jsp:include page="/WEB-INF/jsp/eicu/icuhlpg/template/${gradeType}.jsp"></jsp:include>
					</c:when>
					<c:otherwise>
						${icuGradeTotal.htmlText}
					</c:otherwise>
				</c:choose>--%>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		//全局变量
		var _userid = '${activeUser.usrno}';
		var _gradeType = '${gradeType}';
		var _gradeSeq = '${gradeSeq}';
		var _gradeParam;
		var ptBasicInfo = eicuUtil.ptBasicInfo; //基础信息
		var _liveNo = ptBasicInfo.liveNo;
		var _pageTitle;
		var _gradeTimeStr;
		var sameTypeDocList = parent.vm.docTypeList;
		var menuInfoObj = eicuUtil.getMenuInfo();
		if(sameTypeDocList.length > 0){
			$.each(sameTypeDocList, function (idx, el) {
				if (el.parvalue1 === _gradeType) {
					_pageTitle = el.parmemo;
					_gradeParam = el.parvalue2;
					return false;
				}
			})
		} else {
			$.each(menuInfoObj, function (k, v) {
				if (v.menuType === _gradeType) {
					var urlArr = v.menuUrl.split("?");
					if(urlArr.length > 1){
						_gradeParam = urlArr[1];
					}
					_pageTitle = v.menuName;
					return false;
				}
			})
		}
		
	</script>
	<script type="text/javascript">
		function reload() {

		}

		function setLayout() {

		}
		/**
		 * 初始化
		 */
		function init() {
			// set title
			$('.functype').html(_pageTitle)
			if (_gradeSeq) {
				// $('#empty-temp').hide();
				$('#empty-temp').empty();
				$('#db-html').show();
				getDbHtml();
			} else {
				$('#empty-temp').show();
				$('#db-html').hide();
				$.each(ptBasicInfo, function (k, v) {
					// 赋值已有患者数据
					var thisNode = $('#' + k).get(0);
					var thisNodeName;
					if (thisNode) {
						thisNodeName = thisNode.nodeName;
						if (thisNodeName === 'INPUT' || thisNodeName === 'TEXTAREA' || thisNodeName === 'SELECT') {
							thisNode.value = v;
						} else {
							thisNode.insertAdjacentHTML('beforeBegin', v);
						}
					}
				})
				$('#charge-nurse').val(_userid);
				//if('PNB' === _gradeType || 'INICU' ===_gradeType){
				$('#head-nurse').val('1293');
				//}
				fireQueryUser();
			}
		}
		/**
		 * request data
		 */
		function getDbHtml() {
			var reqUrl = _baseUrl + 'icuscore/findGradeInfoByParam.do';
			var reqParams = {
				'liveNo': _liveNo,
				'gradeSeq': _gradeSeq,
				'gradeType': _gradeType,
				'flag': 'doc'
			};
			publicFun.httpRequest(reqUrl, reqParams, function (res) {
				if (!res.resultInfo.success) {
					alert_error('请求失败，请联系管理员');
					return;
				}
				var sysdata = res.resultInfo.sysdata;
				var totalInfo = sysdata.totalInfo;
				_gradeTimeStr = publicFun.timeFormat(totalInfo.gradeTime, 'yyyy/MM/dd hh:mm');
				$('#db-html').html(totalInfo.htmlText);
				setTimeout(function () {
					// replace input value with img attr user-id after html over
					var curUserId;
					$('.userInput').each(function () {
						curUserId = $(this).parent().find('.signPic').attr('data-userid');
						$(this).val(curUserId);
					})
				}, 0)
				fireQueryUser();
			})
		}
		/**
		 * save html str
		 */
		function saveCom(printFlag) {
			var $mainBox;
			var texthtml;
			console.log(_gradeTimeStr)
			if (_gradeSeq) {
				$mainBox = $('#db-html');
			} else {
				$mainBox = $('#empty-temp');
			}
			setParam($mainBox.find("select,input,textarea"));
			texthtml = $mainBox.html();
			var reqUrl = _baseUrl + 'icuscore/editGradeSco.do';
			var reqParams = {
				icuGradeTotalCustom: {
					liveNo: _liveNo,
					gradeSeq: _gradeSeq,
					gradeTimeStr:_gradeTimeStr,
					gradeType: _gradeType,
					gradeDetl: _pageTitle,
					htmlText: texthtml
				}
			};

			if (_gradeParam) {
				var itemList = [];
				_gradeParam.split("|").forEach(function (elt, i, array) {
					var itemVal = '';
					$('[name="' + elt + '"]').each(function () {
						var type = $(this).attr("type")
						if ("checkbox" === type) {
							if ($(this).is(':checked')) {
								itemVal += $(this).val();
							}
						} else {
							itemVal += $(this).val();
						}
					});
					itemList.push({
						itemField: elt,
						itemValue: itemVal
					})
				})
				reqParams['itemList'] = itemList;
			}

			publicFun.httpRequest(reqUrl, reqParams, {
				requestType: "json"
			}, function (res) {
				parent.ajax_alert(res);
				if (res.resultInfo.success) {
					var gradeSeq = res.resultInfo.sysdata.gradeSeq;
					parent.initPanelGrid('old', gradeSeq);
					if(printFlag === 'print'){
						printCom()
					}
				}
			})
		}
		/**
		 * html content set attribute
		 */
		function setParam($div) {
			$div.each(function () {
				switch (this.type) {
					case 'text':
						this.setAttribute('value', this.value);
						break;
					case 'checkbox':
					case 'radio':
						if (this.checked) this.setAttribute('checked', 'checked');
						else this.removeAttribute('checked');
						break;
					case 'select-one':
						var val = $(this).find("option:selected").val();
						$(this).find('option[value="' + val + '"]').attr('selected', 'selected');
					case 'select-multiple':
						$(this).find('option').each(function () {
							if (this.selected) this.setAttribute('selected', 'selected');
							else this.removeAttribute('selected');
						});
						break;
					case 'textarea':
						this.innerHTML = this.value;
						break;
				}
			});
			return true;
		}
		/**
		 * print
		 */
		function printCom() {
			var nn = $('textarea').size();
			var style = $('#style1')[0].innerHTML;
			var version = navigator.userAgent;
			if (nn > 0) {
				var valqt = $('#areavalue').val();
				$('#spanvalue').html(valqt);
			}
			//			 try {
			var $printDiv = $("#tys");
			var $div = $printDiv.find("select,input,textarea");

			setParam($div);
			LODOP = getLodop();
			//  strStyleCSS += "<link rel='stylesheet' type='text/css' href='${baseurl}styles/hzszyyhems/hljl.css'>" ;
			LODOP.PRINT_INITA(0, 0, '210mm', '297mm', '打印控件功能演示_Lodop功能_超文本内容缩放打印');
			LODOP.SET_PRINT_PAGESIZE(0, '210mm', '297mm', '');
			LODOP.SET_PRINT_MODE('NOCLEAR_AFTER_PRINT', true);
			LODOP.ADD_PRINT_HTM(1078, 344, '100%', '100%', '');
			LODOP.SET_PRINT_STYLEA(0, 'ItemType', 1);

			if (version.indexOf("Windows NT 5") != -1) {
				//var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}styles/hzszyyhems/tys/tysprintxp.css'>";
				var strStyleCSS = "<style>" + style +
					".maintext{ font-size:.38cm; }.basicDiv{margin-left: 1.1cm}textarea{overflow:hidden}" + "</style>";
				LODOP.ADD_PRINT_HTM(3, 0, '90%', '94%', strStyleCSS + $printDiv.html());
			} else {
				var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}styles/eicu/eprint_common.css'>";
				/* var strStyleCSS = "<style>"+style+".maintext{ font-size:.38cm; }.basicDiv{margin-left: 1.1cm}textarea{overflow:hidden}"+
					"table{border-collapse:collapse;}.firstli{margin-top:2mm;width:190mm;}"+
					".showTr{display:none}.prtTr{display:table-row}"+"</style>"; */
				LODOP.ADD_PRINT_HTM(3, 0, '100%', '96.5%', strStyleCSS + $printDiv.html());
			}
			LODOP.NewPageA();
			LODOP.PREVIEW();

			//LODOP.PRINT();
			//             } catch (e) {
			//                 $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
			//             }
		}
		/**
		 * manually fire event
		 */
		function fireQueryUser() {
			setTimeout(function () {
				$('.userInput').each(function () {
					$(this).show().next().hide();
					eicuUtil.queryDoct($(this));
				})
				eicuUtil.bindUserInput('down');
			}, 0)
		}
		$(function () {
			window.onresize = setLayout;
			setLayout();
			init();
		})
	</script>
</body>