<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <base href="${baseurl}" >
    <title>修改随访组</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">
</head>
<style>
	.form table th {
		width: 30%;
	}
	.form a.easyui-linkbutton {
		display: inline-block;
		float: none;
	}
</style>
<body class="addcompctl">
    <form class="form" id="expertgroupform" action="expertGroup/updateExpertGroupSubmit.do" method="post">
        <table>
            <colgroup>
                <col width="100" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 随访组名称:</th>
                    <td>
                    	<input type="hidden" id="grpSeq" name="grpSeq"/>
                        <input type="text" id="grpNam" name="grpNam" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td center">
                            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" id="submitbtn" onclick="editExpertGroup()">修改</a>
                            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="lib/validate/jquery.validate.js"></script>
    <script type="text/javascript">
		$(function () {
			var node = parent.getNode();
			$("#grpSeq").val(node.grpSeq);
			$("#grpNam").val(node.grpNam);
		})
        function validateForm() {
            return $("#expertgroupform").validate({
                rules: {
                    "grpNam": "required"
                },
                messages: {
                    "grpNam": "请输入新增随访组名称"
                }
            }).form();
        }
        //用户机构
        function editExpertGroup() {
            if (validateForm()) {
                jquerySubByFId("expertgroupform", editexpertgroup_callback, null, "json");
            }
        }
        //新增的回调函数
        function editexpertgroup_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == "1") {
               parent.init();
               parent.closemodalwindow();
            }
        }
    </script>
</body>

</html>
