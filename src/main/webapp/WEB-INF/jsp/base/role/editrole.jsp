<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>修改角色</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="editrole">
  <form class="form" id="roleform" action="${baseurl}role/editrolesubmit.do" method="post">
    <input class="hidden" id="edit_roleid" name="roleid" value="${dstroleCustom.roleid}" />
    <table>
      <colgroup>
        <col width="18%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 角色码：</th>
          <td>
            <input type="text" id="role_roleid" name="dstroleCustom.roleid" maxlength="32" value="${dstroleCustom.roleid}"
              readonly="readonly" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 角色名称：</th>
          <td>
            <input type="text" id="role_rolename" name="dstroleCustom.rolename" maxlength="32" value="${dstroleCustom.rolename}" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 首页url：</th>
          <td>
            <input type="text" id="role_url" name="dstroleCustom.indexurl" maxlength="64" value="${dstroleCustom.indexurl}"/>
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 首页名称：</th>
          <td>
            <input type="text" id="role_urlName" name="dstroleCustom.indexname" maxlength="64" value="${dstroleCustom.indexname}"/>
          </td>
        </tr>
        <tr>
          <th>角色描述：</th>
          <td>
            <textarea class="div-textarea divarea" id="role_roledes" name="dstroleCustom.roledes" maxlength="100">${dstroleCustom.roledes }  
            </textarea>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editrole()">确定</a>
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
    //修改
    function editrole() {
      if (validateForm()) {
        jquerySubByFId('roleform', editrole_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#roleform").validate({
        rules: {
          "dstroleCustom.roleid": "required",
          "dstroleCustom.rolename": "required",
          "dstroleCustom.indexurl": "required",
          "dstroleCustom.indexname": "required"
        },
        messages: {
          "dstroleCustom.roleid": "请输入角色码",
          "dstroleCustom.rolename": "请输入角色名称",
          "dstroleCustom.indexurl": "请输入首页url",
          "dstroleCustom.indexname": "请输入首页名称"
        }
      }).form();
    }
    //修改的回调函数
    function editrole_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        //延迟1秒执行关闭方法
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryrole();
      }
    }
  </script>
</body>

</html>