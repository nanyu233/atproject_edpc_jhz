<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <title>修改密码</title>
</head>

<body>
<form id="pwdform" action="${baseurl}user/saveapwd.do" method="post" class="form">
    <input type="hidden" name="dstuserCustom.usrno" value="${usrno}"/>
    <table>
        </tbody>
        <tr>
            <th>用户名：</th>
            <td>
                <input type="text" class="input-base li-input-s" id="user_usrname" name="dstuserCustom.usrname"
                       value="${usrname}" readonly="readonly"/>
            </td>
        </tr>
        <tr>
            <th><i class="red">*</i> 旧密码：</th>
            <td>
                <input type="password" class="input-base li-input-s" id="user_usrpass" name="dstuserCustom.usrpass"/>
            </td>
        </tr>
        <tr>
            <th><i class="red">*</i> 新密码：</th>
            <td>
                <input type="password" class="input-base li-input-s" id="user_updatepwd1"
                       name="dstuserCustom.updatepwd1" onkeyup="valExp()"/>
                <span class="info" style="color:red;line-height: 13px;font-size: 12px"></span>
            </td>
        </tr>
        <tr>
            <th><i class="red">*</i> 新密码确认：</th>
            <td>
                <input type="password" class="input-base li-input-s" id="user_updatepwd2"
                       name="dstuserCustom.updatepwd2"/>
            </td>
        </tr>
        <tr>
            <td colspan="2" class="last_td">
                <div class="center grp_btn">
                    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="updatepwd()">确定</a>
                    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn"
                       onclick="parent.closemodalwindow()">关闭</a>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <div>
        <i class="red">*</i>
        <span class="info2"></span>
    </div>
</form>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
<script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
<script type="text/javascript" src="${baseurl}lib/crypto-js/rollups/md5.js"></script>
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
                    equalTo: "两次密码输入不一致"
                }
            }
        }).form();
    }

    //修改密码
    function updatepwd() {
        if (validateForm()) {
            if (valExp()) {
                // jquerySubByFId('pwdform', updatepwd_callback, null, "json");
                $.ajax({
                    url: '${baseurl}user/saveapwd.do',
                    type: 'post',
                    data: {
                        'dstuserCustom.usrno': '${usrno}',
                        'usrpass1': CryptoJS.MD5($('#user_usrpass').val()).toString(),
                        'updatepwd11':CryptoJS.MD5($('#user_updatepwd1').val()).toString(),
                    },
                    dataType: 'json',
                    success: function (res) {
                        updatepwd_callback(res)
                    }
                })
            }
        }
    }

    //修改密码的回调函数
    function updatepwd_callback(data) {
        message_alert(data);
        if (data.resultInfo.type == '1') {
            setTimeout("parent.closemodalwindow()", 1000);
        }
    }

    //获取密码匹配规则
    var reg, attributes, placeholder;

    function passwordRule() {
        $.ajax({
            url: '${baseurl}getPasswordRule.do',
            type: 'post',
            contentType: 'application/json;charset=utf-8',
            data: {},
            dataType: 'json',
            success: function (res) {
                var passwordRule = res.resultInfo.sysdata.passwordRule;
                var ruleList = passwordRule.rule || [];
                for (var el of ruleList) {
                    if (el.rank == passwordRule.currentRank) {
                        placeholder = el.describe;
                        reg = el.regExp;
                        attributes = el.attributes;
                    }
                }
                // $('#user_updatepwd1').attr('placeholder',placeholder);
                $('.info2').text(placeholder)
            }
        })
    }

    function valExp() {
        if (attributes) {
            var valReg = new RegExp(reg, attributes);
        } else {
            var valReg = new RegExp(reg);
        }
        var val = $('#user_updatepwd1').val();
        if (!valReg.test(val)) {
            $('.info').html('');
            $('.info').append(placeholder);
        } else {
            $('.info').html('');
            return true;
        }
        return false;
    }

    $(function () {
        passwordRule();
    })
</script>
</body>

</html>
