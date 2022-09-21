<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
<title>修改密码</title>
</head>

<body>
</script>
<form id="pwdform" action="${baseurl}user/saveapwd.do" method="post" class="form">
<input type="hidden" name="dstuserCustom.usrno" value="${activeUser.usrno}" />
<table>
    </tbody>
    <tr>
        <th>用户名：</th>
        <td>
            <input type="text" class="input-base li-input-s" id="user_usrname" name="dstuserCustom.usrname" value="${activeUser.usrname}" readonly="readonly" />
        </td>
    </tr>
    <tr>
        <th><i class="red">*</i> 旧密码：</th>
        <td>
            <input type="password" class="input-base li-input-s" id="user_usrpass" name="dstuserCustom.usrpass" />
        </td>
    </tr>
    <tr>
        <th><i class="red">*</i> 新密码：</th>
        <td>
            <input type="password" class="input-base li-input-s" id="user_updatepwd1" name="dstuserCustom.updatepwd1" />
        </td>
    </tr>
    <tr>
        <th><i class="red">*</i> 新密码确认：</th>
        <td>
            <input type="password" class="input-base li-input-s" id="user_updatepwd2" name="dstuserCustom.updatepwd2" />
        </td>
    </tr>
    <tr>
        <td colspan="2" class="last_td">
            <div class="center grp_btn">
                <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="updatepwd()">确定</a>
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
    function validateForm() {
        return $("#pwdform").validate({
            rules: {
                "dstuserCustom.usrpass": "required",
                "dstuserCustom.updatepwd1": "required",
                "dstuserCustom.updatepwd2": {
                    equalTo: "#user_updatepwd1"
                }
            },
            messages: {
                "dstuserCustom.usrpass": "请输入旧密码",
                "dstuserCustom.updatepwd1": "请输入新密码",
                "dstuserCustom.updatepwd2": {
                    equalTo:"两次密码输入不一致"
                }
            }
        }).form();
    }
//修改密码
function updatepwd() {
    if (validateForm()) {
        jquerySubByFId('pwdform', updatepwd_callback, null, "json");
    }
}
//修改密码的回调函数
function updatepwd_callback(data) {
    message_alert(data);
    if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
    }
} 
</script>
</body>

</html>
