<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改医嘱导入</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="adddevice">
    <form class="form" id="docform" action="${baseurl}zyydoc/editdoc.do" method="post">
        <table>
            <tbody>
            	<input type="hidden" id="modelSeq" name="hspModelInfCustom.modelSeq" value="${hspModelInfCustom.modelSeq}" maxlength="280"/>
                    <th > 模板名：</th>
                    <td >
                        <input style="width:180px;height:30px" id="modelNam" name="hspModelInfCustom.modelNam" value="${hspModelInfCustom.modelNam}" maxlength="280"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editdoc()">确定</a>
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
        function editdoc() {
            if (validateForm()) {
                jquerySubByFId('docform', insertmodel_callback, null, "json");
            }
        }

        function validateForm() {
            return $("#docform").validate({
                rules: {
                    "hspModelInfCustom.modelNam": "required"
                },
                messages: {
                    "hspModelInfCustom.modelNam": "请输入医嘱模板名！"
                }
            }).form();
        }
        //新增的回调函数
        function insertmodel_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == '1') {
            	setTimeout("parent.closemodalwindow()", 1000)
                parent.window.location.reload();
            }
        }
    </script>
</body>

</html>
