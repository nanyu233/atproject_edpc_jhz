<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="">

<head>
  <meta charset="utf-8">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="description" content="">
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <title>structtext</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
  <script language="javascript" src="${baseurl}ateditor/config.js"></script>
  <script language="javascript" src="${baseurl}ateditor/ateditor.js"></script>
</head>

<body>
<iframe id="editorDefine" width="100%" height="100%" frameborder="0"></iframe>
<script>
  var _activeNum = '${sessionScope.activeUser.usrno}';
  var _activeName = '${sessionScope.activeUser.usrname}';

  defineEditorFrame({
    id: "editorDefine",
    page: "structtext",
    userId: _activeNum,
    userName: _activeName
  })

  function setLayout() {
    var winH = $(window).height();
    $('#editorDefine').height(winH);
  }

  setLayout()
</script>
</body>

</html>