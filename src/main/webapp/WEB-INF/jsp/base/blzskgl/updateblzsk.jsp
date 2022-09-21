<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>修改病历知识库</title>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css"
	href="${baseurl}css/common/tableStyle.css">
</head>

<body>
	<form class="form" id="hspblzskform"
		action="${baseurl}favorite/editFavoritesSubmit.do" method="post">
		<input type="hidden" name="hspFavoritesInfCustom.seqno" value="${hspFavoritesInf.seqno}" />
		<table>
			<colgroup>
				<col width="23%" />
				<col />
			</colgroup>
			<tbody>
				<tr>
					<th><i class="red">*</i> 模板名称：</th>
					<td><input class="input-base total-right" type="text"
						name="hspFavoritesInfCustom.title" maxlength="50"
						value="${hspFavoritesInf.title}" /></td>
				</tr>
				<tr>
					<th>模板类型：</th>
					<td>
						<div class="display-table-cell">
							<select name="hspFavoritesInfCustom.sctype" class="departments">
								<option value="">请选择</option>
								<c:forEach items="${scTypeList}" var="value">
									<option value="${value.infocode}"
										<c:if test="${value.infocode eq hspFavoritesInf.sctype }">
						                    selected="selected"
						                </c:if>>
										${value.info}</option>
								</c:forEach>
							</select>
						</div>
					</td>
				</tr>
				<tr>
					<th>模板内容：</th>
					<td><textarea style="width: 230px; height: 120px"
							name="hspFavoritesInfCustom.content" maxlength="280">${hspFavoritesInf.content}</textarea>
					</td>
				</tr>
				<tr>
					<th>排序：</th>
					<td><input class="input-base total-right" type="text"
						onkeyup="this.value=this.value.replace(/[^\d]/g,'') "
						onafterpaste="this.value=this.value.replace(/[^\d]/g,'')"
						　　　　　　 name="hspFavoritesInfCustom.showorder"
						value="${hspFavoritesInf.showorder}" />
				</tr>
				<tr>
					<td colspan="2" class="last_td">
						<div class="center grp_btn">
							<a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn"
								onclick="updateHspblzsk()">确定</a> <a class="easyui-linkbutton"
								iconCls="icon-cancel" id="closebtn"
								onclick="parent.closemodalwindow()">关闭</a>
						</div>
					</td>
				</tr>
			</tbody>
		</table>
	</form>
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script type="text/javascript"
		src="${baseurl}lib/validate/jquery.validate.js"></script>
	<script type="text/javascript">
		//主诉症状保存
		function updateHspblzsk() {
			if (validateForm()) {
				jquerySubByFId('hspblzskform', updatehspblzsk_callback, null, "json");
			}
		}
	
		function validateForm() {
			return $("#hspblzskform").validate({
				rules : {
					"hspFavoritesInfCustom.title" : "required"
				},
				messages : {
					"hspFavoritesInfCustom.title" : "请输入模板名称"
				}
			}).form();
		}
		//新增的回调函数
		function updatehspblzsk_callback(data) {
			message_alert(data);
			if (data.resultInfo.type == '1') {
				setTimeout("parent.closemodalwindow()", 1000);
				parent.getDataGrid();
			}
		}
	</script>
</body>

</html>