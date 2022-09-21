<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>退出页面</title>
</head>

<body>
    <div class="messager-body panel-body panel-body-noborder window-body" title="" style="width: 266px; height: auto;">
        <div class="messager-icon messager-question"></div>
        <div>您确定要退出本系统吗?</div>
        <div style="clear:both;"></div>
        <div class="center grp_btn">
            <a href="#" class="easyui-linkbutton" id="submitbtn" onclick="dropOut()">确定</a>
            <a href="#" class="easyui-linkbutton" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
<script type="text/javascript">
    function dropOut() {
        window.sessionStorage.setItem('ownIp', '');
        publicFun.removeItem('allDict');
        publicFun.removeItem('dangerBoxList');
        top.location = '${baseurl}logout.do';
    }
</script>
</body>

</html>
