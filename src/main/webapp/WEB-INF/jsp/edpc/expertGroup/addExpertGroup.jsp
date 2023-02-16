<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <base href="${baseurl}" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增随访组</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">
</head>
<style>
	.form table {
		margin-top: 10px;
	}
	.form table th {
		width: 110px;
	}
	.form table td {
		width: 150px;
	}
	.form a.easyui-linkbutton {
		display: inline-block;
		float: none;
	}
</style>
<body class="addcompctl">
    <form class="form" id="expertgroupform" action="expertGroup/addExpertGroupSubmit.do" method="post">
        <table>
            <colgroup>
                <col width="100" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 随访组名称:</th>
                    <td>
                        <input type="text" id="grpNam" name="grpNam" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td center" style="padding-top: 10px">
                            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-add" id="submitbtn" onclick="addExpertGroup()">新增</a>
                            <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="lib/validate/jquery.validate.js"></script>
    <script type="text/javascript">

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
        function addExpertGroup() {
            if (validateForm()) {
                jquerySubByFId("expertgroupform", addexpertgroup_callback, null, "json");
            }
        }
        //新增的回调函数
        function addexpertgroup_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == "1") {
               parent.init();
               parent.closemodalwindow();
            }
        }
    </script>
</body>

</html>
