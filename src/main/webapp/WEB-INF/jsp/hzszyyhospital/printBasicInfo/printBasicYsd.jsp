<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
  <style type="text/css">
      .logoDivZJ{
        display:block;
        float:left;
        width:15%;
        margin-left:5%
      }
      .logoDivZJ img{
        vertical-align:middle;
        text-align: center;
        width:15mm;
        float: right;
        margin-top:1mm
      }
      .titleDivJZ{
        float:left;
        margin:0;
        width:65%;
        text-align:center;
        margin-top:1mm
      }
      .title,.title1{
        font-size:0.55cm
      }
      .title{
        font-weight: bolder
      }
  </style>
  <div class="logoDivZJ">
    <img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">
  </div>
  <div id="titleDivJZ" class="titleDivJZ">
    <div class="title"><label id="id_title1">${nurseDocumentName}</label></div>
    <div class="title1"><label id="id_title2"></label></div>
  </div>
</body>
</html>