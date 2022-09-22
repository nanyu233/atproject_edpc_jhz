<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <base href="${baseurl}" >
    <title>新增专家组成员</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">
</head>
<style>
	.form table th {
		width: 110px !important;
	}
	.form table td {
		width: 170px;
	}
	.form a.easyui-linkbutton {
		display: inline-block;
		float: none;
	}
</style>
<body class="addcompctl">
    <form class="form" id="editExpertForm" action="expertGroup/updateExpertGroupMemberSubmit.do" method="post">
        <table>
            <colgroup>
                <col width="100" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 专家组序号:</th>
                    <td>
                        <input type="text" id="grpSeq" name="grpSeq" readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 专家组名称:</th>
                    <td>
                        <input type="text" id="grpNam" name="grpNam" readonly="true"/>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 专家名称:</th>
                    <td class="docName">
                    	<input type="hidden" id="eptNo" name="eptNo"/>	
                        <input type="text" id="usrname" name="usrname" autocomplete="off" readonly/>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i> 专家类型:</th>
                    <td>
                        <select id="eptTyp" name="eptTyp" class="li-input-s">
                        	<option value="0">请选择</option>
                        	<option value="1">组长</option>
                        	<option value="2">副组长</option>
                        	<option value="9">成员</option>
                        </select>
                    </td>
                </tr>
                 <tr>
                    <th>是否院前急救联系人:</th>
                    <td>
                    	<label><input type="radio" name="wxpFlg" value="0" checked/>否</label>
                    	<label><input type="radio" name="wxpFlg" value="1"/>是</label>
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td center" style="padding-top: 10px">
                        <a href="javascript:void(0);" class="easyui-linkbutton" iconCls="icon-edit" id="submitbtn" onclick="editGroupMemeber()">修改</a>
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
        	for (var key in node) {
        		if (node.hasOwnProperty(key)) {
        			if (key === 'eptTyp') {
        				$("#eptTyp option").each(function () {
        	        		if ($(this).val() === node.eptTyp) {
        	        			$(this).attr('selected', true);
        	        		}
        	        	});
        				continue;
        			}
        			if (key === 'wxpFlg') {
        				$('[name="wxpFlg"]').each(function () {
        					if ($(this).val() === node.wxpFlg) {
        						$(this).attr("checked", true);
        					}
        				})
        				continue;
        			}
        			$("#" + key).val(node[key]);
        		}
        	}
//         	$("#grpSeq").val(node.grpSeq);
//         	$("#grpNam").val(node.grpNam);
//         	$("#eptNo").val(node.eptNo);
//         	$("#usename").val(node.usrname);
//         	$("#eptTyp option").each(function () {
//         		if ($(this).val() === node.eptTyp) {
//         			$(this).attr('selected', true);
//         		}
//         	});
        })

        function validateForm() {
            return $("#editExpertForm").validate({
                rules: {
                    "grpSeq": "required",
                    "grpNam": "required",
                    "usrname": "required"
                },
                messages: {
                    "grpSeq": "请确认专家组序号",
                    "grpNam": "请确认专家组名称",
                    "usrname": "请填写专家名称"
                }
            }).form();
        }
        //用户机构
        function editGroupMemeber() {
            if (validateForm()) {
                jquerySubByFId("editExpertForm", editGroupMemeber_callback, null, "json");
            }
        }
        //新增的回调函数
        function editGroupMemeber_callback(data) {
            message_alert(data);
            parent.init();
            parent.closemodalwindow();
        }
        
    </script>
</body>

</html>
