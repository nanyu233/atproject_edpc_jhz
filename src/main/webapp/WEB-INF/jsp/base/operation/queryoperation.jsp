<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}"/>
<title>操作管理</title>


</head>
<body>
	<script type="text/javascript">
	//datagrid定义
	var columns_v = [ [
	{
		field : 'operatename',
		title : '操作名称',
		width : 150
	},{
		field : 'url',
		title : '操作方法',
		width : 280
	},{
		field : 'icon',
		title : '图标',
		width : 130
	},{
		field : 'opertype',
		title : '类型',
		width: getWidth(0.05)
	},{
		field : 'modulename',
		title : '所属上级模块',
		width : 120
	},{
		field : 'oper',//对应json中的key
		title : '操作',
		width : 120,
		formatter : function(value, row, index) {
			return "<span class='url-link'><a href=javascript:editoperation('"+row.operateid+"')>修改</a></span> | <span class='url-link'><a href=javascript:deleteoperation('"+row.operateid+"')>删除</a></span>";
		}
	}
	]];
	
	//定义datagrid工具
	var toolbar_v = [ {
		id : 'btnadd',
		text : '新增操作',
		iconCls : 'icon-add',
		handler : function() {
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("新增操作", 515, 300, '${baseurl}operation/addoperation.do?moduleid='+"${moduleid}");
		}
	}];
	
	//加载datagrid
	$(function() {
		var height = 0.975 * ($("#tabs", parent.document).height()-17);
	    $('#operationlist').height(height);

		$('#operationlist').datagrid({
			nowrap : true,
			striped : true,
			singleSelect : true,
			url : '${baseurl}operation/queryoperation_result.do',
			queryParams:{
				"dstoperationCustom.moduleid":"${moduleid}"
			},
			idField : 'operateid',
			loadMsg : '',
			columns : columns_v,
			pagination : true,
			rownumbers : true,
			pageList:[15,30,50],
			toolbar : toolbar_v
		});
	});
	
	//查询方法
	function queryoperation() {
		$('#operationlist').datagrid('reload');
	}
	
	//删除 统一用form
	function deleteoperation(operateid) {
		_confirm('确定删除该数据吗？',null,function(){
			$("#delete_operateid").val(operateid);
			jquerySubByFId('operationdeleteform',operationdel_callback,null,"json");
		});
	}
	//删除的回调函数
	function operationdel_callback(data){
		message_alert(data);
		var type = data.resultInfo.type;
		if(type==1){
			queryoperation();
		}
	}
	
	//修改角色信息
	function editoperation(operateid) {
		//打开修改窗口
		createmodalwindow("修改操作信息", 515, 300, '${baseurl}operation/editoperation.do?operateid='+operateid);
	}
</script>

	<!-- html的静态布局 -->
	<form id="operationqueryForm">
		<div class="operationtab queryTabs">
			<table id="operationlist"></table>
		</div>
		<input type="hidden" name="moduleid" value="${moduleid }"/>
	</form>
	<form id="operationdeleteform" action="${baseurl}operation/deleteoperation.do" method="post">
		<input type="hidden" id="delete_operateid" name="operateid" />
	</form>

</body>
</html>
