<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增床位</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="adddevice">
  <form class="form" id="bedform" action="${baseurl}bedinf/insertbed.do" method="post">
    <table>
      <colgroup>
        <col width="23%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 位置：</th>
          <td>
            <select id="bedPlace" name="hspBedInfCustom.bedPlace" class="li-input-s">
              <c:forEach items="${stateList}" var="value">
                <option value="${value.infocode}">${value.info}</option>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 床号：</th>
          <td>
            <input type="text" id="bedNum" name="hspBedInfCustom.bedNum" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 排序：</th>
          <td>
            <input type="text" id="showorder" name="hspBedInfCustom.showorder" maxlength="32" oninput="value=value.replace(/[^\d]/g,'')" />
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertBed()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    //设备配置新增
    function insertBed() {
      if (validateForm()) {
        jquerySubByFId('bedform', insertbed_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#bedform").validate({
        rules: {
          "hspBedInfCustom.bedNum": "required",
          "hspBedInfCustom.showorder": "required"
        },
        messages: {
          "hspBedInfCustom.bedNum": "请输入床号！",
          "hspBedInfCustom.showorder": "请输入排序！"
        }
      }).form();
    }
    //新增的回调函数
    function insertbed_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.querybed();
      }
    }
  </script>
</body>

</html>