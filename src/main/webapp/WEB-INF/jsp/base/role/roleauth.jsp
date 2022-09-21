<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/roleauth.css">
  <title>新增角色</title>
</head>

<body>
  <li class="li-auth">
    <div class="auth">
    </div>
    <div class="auth-center">
      <button class="role-button">&nbsp;&gt;&nbsp;</button>
      <button class="role-button">&nbsp;&lt;&nbsp;</button>
      <button class="role-button">&gt;&gt;</button>
      <button class="role-button">&lt;&lt;</button>
    </div>
    <div class="auth">
    </div>
  </li>
  <center class="li-bottom">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="">确定</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
  </center>
</body>

</html>