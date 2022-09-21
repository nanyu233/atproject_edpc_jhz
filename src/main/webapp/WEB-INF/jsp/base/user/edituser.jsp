<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <title>新增用户</title>
</head>

<body>
  <form class="form" id="userform" action="${baseurl}user/editusersubmit.do" method="post">
    <input type="hidden" id="user_userid" name="userid" value="${dstuserCustom.userid}" />
    <table>
      <colgroup>
        <col width="14%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i>用户号:</th>
          <td>
            <input type="text" id="user_usrno" name="dstuserCustom.usrno" value="${dstuserCustom.usrno}" maxlength="32" />
          </td>
          <th><i class="red">*</i>用户名称:</th>
          <td>
            <input type="text" id="user_usrname" name="dstuserCustom.usrname" value="${dstuserCustom.usrname}"
              maxlength="32" />
          </td>
        </tr>
        <tr>
          <th>移动电话:</th>
          <td>
            <input type="text" id="user_movephone" name="dstuserCustom.movephone" value="${dstuserCustom.movephone}"
              maxlength="11" />
          </td>
          <th>电话:</th>
          <td>
            <input type="text" id="user_phone" name="dstuserCustom.phone" value="${dstuserCustom.phone}" maxlength="20" />
          </td>
        </tr>
        <tr>
          <th>地址:</th>
          <td colspan="3">
            <input type="text" class="li-input-l2" id="user_addr" name="dstuserCustom.addr" value="${dstuserCustom.addr}"
              maxlength="50" />
          </td>
        </tr>
        <tr>
          <th>电子邮箱:</th>
          <td colspan="3">
            <input type="text" id="user_email" name="dstuserCustom.email" value="${dstuserCustom.email}" maxlength="50" />
          </td>
        </tr>
        <tr>
          <th>用户分组:</th>
          <td>
            <select id="user_groupid" name="dstuserCustom.groupid">
              <c:forEach items="${groupList}" var="value">
                <option value="${value.infocode}">${value.info}</option>
              </c:forEach>
            </select>
          </td>
          <th>用户状态:</th>
          <td>
            <select id="user_userstate" name="dstuserCustom.userstate">
              <option value="1">有效</option>
              <option value="0">无效</option>
            </select>
          </td>
        </tr>
        <tr>
          <th>所属单位:</th>
          <td colspan="3">
            <input type="text" class="li-input-l2" id="sysname" name="sysname" value="${sysname}" readonly="readonly" />
            <input type="hidden" id="user_sysid" name="dstuserCustom.sysid" value="${dstuserCustom.sysid}" readonly="readonly" />
          </td>
        </tr>
        <tr>
          <td colspan="4" class="last_td">
            <div class="center grp_btn">
              <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editUser()">确定</a>
              <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    $(document).ready(function () {
      //加载用户状态
      var userstate = "${dstuserCustom.userstate}";
      $("#user_userstate").val(userstate);
      //加载用户分组
      var user_groupid = "${dstuserCustom.groupid}";
      $("#user_groupid").val(user_groupid);
    });

    function validateForm() {
      return $("#userform").validate({
        rules: {
          "dstuserCustom.usrno": "required",
          "dstuserCustom.usrname": "required",
          "dstuserCustom.email": {
            isEmail: true
          }
        },
        messages: {
          "dstuserCustom.usrno": "请输入用户号",
          "dstuserCustom.usrname": "请输入用户名称",
          "dstuserCustom.email": {
            isEmail: "邮箱格式错误"
          }
        }
      }).form();
    }

    $.validator.methods.isEmail = function (value, element, param) {
      if (value === "") {
        return true
      } else {
        return (/^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/.test(value));
      }
    };


    //用户修改
    function editUser() {
      if (validateForm()) {
        jquerySubByFId('userform', edituser_callback, null, "json");
      }

    }
    //修改的回调函数
    function edituser_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryuser();
      }
    }
  </script>
</body>

</html>