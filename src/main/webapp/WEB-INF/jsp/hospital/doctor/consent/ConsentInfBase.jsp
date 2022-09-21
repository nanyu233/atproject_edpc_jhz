<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 String conturl = (String)request.getAttribute("conturl");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>知情同意书模本</title>
	<base href="<%=basePath%>">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css" />
	<link rel="stylesheet" type="text/css" href="${baseurl}css/cnrmyyhems/print/showText.css?090">
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
	<script type="text/javascript" src="${baseurl}/js/subpageJs/hzszyyhospital/consent.js"></script>
	<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body>
	<form class="at-form at-form--inline">
		<input type="hidden" id="refseqno" value="${refseqno}" />
		<input type="hidden" id="tempno" value="${tempno}" />
		<input type="hidden" id="tempname" value="${tempname}" />
		<input type="hidden" id="seqno" value="${seqno}" />
		<input type="hidden" id="content" />
		<input type="hidden" id="textHtml" />
	</form>
	<div id="showHtml" class="table-container">
		${texthtml}
	</div>
	<div class="tools-container">
		<p class="at-tools clr" id="atTools">
			<a class="commonbtn" href="javascript:;" onclick="handoverSheetLb()">显示列表</a>
		</p>
	</div>
	<script type="text/javascript">
		/**
		 * 显示列表
		 */
		function handoverSheetLb() {
			window.location = '${baseurl}zyylqblqrb/queryConsentInf.do?refseqno=${refseqno}';
		}
		$(function () {
			var height = parent.$('#main').height() - 67;
			$('.table-container').height(height);
			init();
		})
	</script>
</body>

</html>