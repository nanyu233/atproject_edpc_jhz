<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改模板内容</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="adddevice">
    <form class="form" id="docform" action="${baseurl}zyydoc/editdoccontent.do" method="post">
        <table>
            <tbody>
                <tr >
                	<input type="hidden" id="modelcontSeq" name="hspModelcontInfCustom.modelcontSeq" value="${hspModelcontInfCustom.modelcontSeq}" />
                    <th > 模板内容：</th>
                    <td >
                        <textarea style="width:350px;height:150px" id="clsCont" name="hspModelcontInfCustom.clsCont"   maxlength="280">${hspModelcontInfCustom.clsCont}</textarea>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editModel()">确定</a>
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
        function editModel() {
            if (validateForm()) {
                jquerySubByFId('docform', insertmodel_callback, null, "json");
            }
        }

        function validateForm() {
            return $("#docform").validate({
                rules: {
                    "hspModelcontInfCustom.clsCont": "required"
                },
                messages: {
                    "hspModelcontInfCustom.clsCont": "请输入内容！"
                }
            }).form();
        }
        //新增的回调函数
        function insertmodel_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == '1') {
            	setTimeout("parent.closemodalwindow()", 1000)
                parent.$('#templateContentList').datagrid('reload');
            }
        }
    </script>
</body>

</html>
