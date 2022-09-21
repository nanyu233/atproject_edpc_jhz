<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增角色</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
</head>

<body>
    <form class="form" id="favoritesform" action="${baseurl}zyylqbl/addFavoritessubmit.do" method="post">
        <table>
            <colgroup>
                <col width="18%" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 标题：</th>
                    <td>
                        <input type="text" id="title" name="title" maxlength="50" style="width: 473px;"/>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 内容：</th>
                    <td>
                        <textarea style="width: 98%;border:1px solid #d2d9dc;height:220px;text-align:left;padding-left: 5px;" id="content" name="content" maxlength="1000"></textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertfavorites()">确定</a>
                            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <script type="text/javascript">
        //新增
        function insertfavorites() {
            if (validateForm()) {
                jquerySubByFId('favoritesform', insertfavorites_callback, null, "json");
            }
        }

        function validateForm() {
            return $("#favoritesform").validate({
                rules: {
                    "title": "required",
                    "content": "required"
                },
                messages: {
                    "title": "请输入标题",
                    "content": "请输入内容"
                }
            }).form();
        }
        //新增的回调函数
        function insertfavorites_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == '1') {
                setTimeout("parent.closemodalwindow()", 1000);
            }
        }
    </script>
</body>

</html>
