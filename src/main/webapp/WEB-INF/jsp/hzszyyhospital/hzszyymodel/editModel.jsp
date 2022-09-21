<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>修改处置</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="adddevice">
    <form class="form" id="modelform" action="${baseurl}zyymodel/editmodel.do" method="post">
        <table>
            <colgroup>
                <col width="23%" />
                <col />
            </colgroup>
            <tbody>
                <tr>
                    <th><i class="red">*</i> 所属模块：</th>
                    <td>
                        <select id="modelSeq" name="modelSeq" class="li-input-s">
			                 <option value="CZDRSEQ3">处置导入</option>
			            </select>
                    </td>
                </tr>
                <tr>
                    <th style="width:10%"><i class="red">*</i> 大类：</th>
                    <td>
                    	<select id="majorCls" name="majorCls">
                    		<c:forEach items="${czdrlist}" var="value">
                                <c:if test="${value.infocode == hspModelcontInfCustom.majorCls }">
                                    <option value="${value.infocode}" selected="selected">${value.info}</option>
                                </c:if>
                                <c:if test="${value.infocode != hspModelcontInfCustom.majorCls }">
                                    <option value="${value.infocode}">${value.info}</option>
                                </c:if>
                            </c:forEach>
                    	</select>
                        <input type="hidden" id="modelcontSeq" name="modelcontSeq" value="${hspModelcontInfCustom.modelcontSeq }"/>
                    </td>
                </tr>
                <tr>
                    <th> 内容：</th>
                    <td style="height:220px">
                        <textarea style="width:400px;height:220px" id="clsCont" name="clsCont" maxlength="1000">${hspModelcontInfCustom.clsCont }</textarea>
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
                jquerySubByFId('modelform', editModel_callback, null, "json");
            }
        }

        function validateForm() {
            return $("#modelform").validate({
                rules: {
                    "modelSeq": "required",
                    "majorCls": "required",
                    "subCls": "required"
                },
                messages: {
                    "modelSeq": "请输入所属模板！",
                    "majorCls": "请输入大类！",
                    "subCls": "请输入子类！"
                }
            }).form();
        }
        //新增的回调函数
        function editModel_callback(data) {
            message_alert(data);
            if (data.resultInfo.type == '1') {
            	setTimeout("parent.closemodalwindow()", 1000)
                parent.reload();
            }
        }
    </script>
</body>

</html>
