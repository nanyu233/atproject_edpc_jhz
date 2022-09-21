<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/jqueryvalidator/formValidator-4.1.3.js"></script>
  <script type="text/javascript" src="${baseurl}lib/jqueryvalidator/formValidatorRegex.js"></script>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <title>基础信息配置表管理</title>
</head>

<body class="queryappoption">
  <script type="text/javascript">
    //提交
    function upload() {
      if ($.formValidator.pageIsValid()) {
        _confirm('确定提交吗？', null, function () {
          jquerySubByFId('appoptionqueryForm', upload_callback, null, "json");
        });
      }
    }
    //修改的回调函数
    function upload_callback(data) {
      message_alert(data);
    }
    $(document).ready(function () {
      //form校验器初始化
      $.formValidator.initConfig({
        formID: "appoptionqueryForm",
        errorfocus: true,
        submitonce: true,
        onError: function (msg, obj, errorlist) {
          //alert(msg);  
        }
      });
      var size = "${appoptionSize}";
      for (var i = 0; i < size; i++) {
        $("#" + i + "appoption_optvalue").formValidator({
          onFocus: "请输入配置项值",
          onCorrect: "&nbsp;"
        }).regexValidator({
          regExp: "notempty",
          dataType: "enum",
          onError: "配置项值不能为空"
        }).defaultPassed();
      }

    });
  </script>
  <!-- html的静态布局 -->
  <form id="appoptionqueryForm" action="${baseurl}appoption/editappoptionsubmit.do" method="post">
    <table class="form-groupin appoptiontab" width="80%">
      <!-- 每列所占的比例 -->
      <colgroup>
        <col width="30%">
        <col width="70%">
      </colgroup>
      <tbody>
        <tr class="tr_bg">
          <td class="head">配置项名称</td>
          <td class="head">配置项值</td>
        </tr>
        <c:forEach items="${appoptionlist}" var="value" varStatus="status">
          <tr>
            <td class="changecol">
              <span class="li-input-l textl p-l5">${value.optname}</span>
            </td>
            <td class="changecol">
              <input type="text" class="li-input-l input-base m-l5" id="${status.index}appoption_optvalue" name="dstappoptionCustoms[${status.index}].optvalue"
                value="${value.optvalue}" maxlength="200" />
              <div class="checkform">
                <div id="${status.index}appoption_optvalueTip"></div>
              </div>
              <input type="hidden" id="${status.index}appoption_optkey" name="dstappoptionCustoms[${status.index}].optkey"
                value="${value.optkey}" />
            </td>
          </tr>
        </c:forEach>
        <tr>
          <td class="tail" colspan="7">
            <a class="easyui-linkbutton" iconCls="icon-ok" href="#" onclick="upload()">提&nbsp;交</a>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
</body>

</html>