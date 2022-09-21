<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css"
	href="${baseurl}css/common/querylist.css?v=${versionDay}" />
<link rel="stylesheet" type="text/css"
	href="${baseurl}css/hems/global.css?v=${versionDay}" />
<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"
	charset="UTF-8"></script>
<title>病历知识库管理</title>
</head>

<body class="queryhspjbzd">
	<script type="text/javascript">
		$(document).keydown(function(event) {
			switch (event.keyCode) {
			case 13:
				queryhspcbyx();
			}
		});
		function reload() {
			$('#hspcbyxlist').datagrid('reload');
		}
	
		function generateParam() {
			var param = {
				'hspFavoritesInfCustom.sctype' : $('#sctype').val(),
				'hspFavoritesInfCustom.title' : $('#title').val(),
				'hspFavoritesInfCustom.isTemplateFlag' : vm.patientMsg.isBlzskType
			};
			return param;
		}
	
		//加载datagrid
		function getDataGrid() {
			var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
			$("#hspcbyxlist").height(height);
	
			var toolbar_v;
			publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
	
			//datagrid列定义
			var columns_v = [
				[ {
					field : 'seqno',
					hidden : true,
				}, {
					field : 'sctypeName',
					title : '模板类型',
					width : getWidth(0.1),
				}, {
					field : 'title',
					title : '模板名称',
					width : getWidth(0.1),
				}, {
					field : 'content',
					title : '模板内容',
					width : getWidth(0.35),
				}, {
					field : 'crtusrName',
					title : '创建人',
					width : getWidth(0.1),
				}, {
					field : 'comcName',
					title : '所属科室',
					width : getWidth(0.1),
				}, {
					field : 'showorder',
					title : '排序',
					width : getWidth(0.1),
				}, {
					field : 'crtDateStr',
					title : '创建时间',
					width : getWidth(0.1),
				}
				]
			];
			function callBack(toolbar_v) {
				$('#hspcbyxlist').datagrid({
					nowrap : true,
					striped : true,
					singleSelect : true,
					url : '${baseurl}favorite/findHspFavoritesInfListFy.do',
					idField : 'seqno',
					loadMsg : '',
					queryParams : generateParam(),
					columns : columns_v,
					pagination : true,
					rownumbers : true,
					pageList : [ 20, 30, 50 ],
					toolbar : toolbar_v
				});
			}
		}
		;
	
		function getWidth(proportion) {
			var width = $("body").width();
			return Math.round(proportion * width);
		}
	
		//查询方法
		function queryhspcbyx() {
			var formdata = $("#hspjbzdqueryForm").serializeJson();
			$('#hspcbyxlist').datagrid('load', formdata);
		}
	
		//新增
		function cmdaddzsk() {
			createmodalwindow("病历知识库管理", 450, 320, '${baseurl}favorite/toAdd.do', 'no');
		}
	
		//删除 统一用form
		function cmdremove() {
			var node = $('#hspcbyxlist').datagrid('getSelected');
			if (GridUtils.checkChecked(node)) {
				if (node.ksdm != "*") {
					publicFun.alert("自定义数据不允许删除");
				} else {
					deletehspblzsk(node.seqno);
				}
			}
		}
		//删除的回调函数
		function hspblzskdel_callback(data) {
			message_alert(data);
			var type = data.resultInfo.type;
			if (type == 1) {
				$('#hspcbyxlist').datagrid('clearSelections');
				getDataGrid();
			}
		}
	
		//删除 统一用form
		function deletehspblzsk(seqno) {
			_confirm('确定删除该数据吗？', null, function() {
				$("#delete_seqno").val(seqno);
				jquerySubByFId('hspblzskdeleteform', hspblzskdel_callback, null, "json");
			});
		}
	
		//修改
		function cmdeditzsk() {
			//打开修改窗口
			var node = $('#hspcbyxlist').datagrid('getSelected');
			if (GridUtils.checkChecked(node)) {
				if (node.ksdm != "*") {
					publicFun.alert("自定义数据不允许修改");
				} else {
					var url = '${baseurl}favorite/toUpdate.do?seqno=' + node.seqno;
					createmodalwindow("修改病历知识库", 450, 320, url, 'no');
				}
			}
		}
	
		var vm = avalon.define({
			$id : 'blzsk',
			patientMsg : {
				isBlzskType : '0'
			},
			getList : {
				isBlzskTypeList : [ {
					infocode : '0',
					info : '通用模板',
					checked : true
				}, {
					infocode : '1',
					info : '自定义',
					checked : false
				} ]
			},
	
			radioclick : function(name, idx) {
				vm.patientMsg[name] = publicFun.radioClicks(vm.getList[name + 'List'], vm.patientMsg[name], idx)
				getDataGrid();
			}
		})
	
		$(function() {
			getDataGrid();
		})
	</script>
	<!-- html的静态布局 -->
	<form id="hspjbzdqueryForm" ms-controller="blzsk">
		<!-- 查询条件 -->
		<div class="form clr">
			<p class="form-text">模板类型：</p>
			<select id='sctype' name="hspFavoritesInfCustom.sctype"
				class="departments">
				<option value="">请选择</option>
				<c:forEach items="${scTypeList}" var="value">
					<option value="${value.infocode}">${value.info}</option>
				</c:forEach>
			</select>
			<p class="form-text">模板名称：</p>
			<input class="input-base total-right" type="text" id='title'
				name="hspFavoritesInfCustom.title"> <label
				ms-repeat="getList.isBlzskTypeList"
				ms-attr-for="isBlzskType{{el.infocode}}">
				<p class="form-text">
					<input ms-attr-id="isBlzskType{{el.infocode}}" type="checkbox"
						ms-attr-checked="el.checked"
						ms-click="radioclick('isBlzskType',$index)"> {{el.info}}
				</p>
			</label>
			</p>
			</label> <a href="javascript:;" class="easyui-linkbutton"
				iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
		</div>
		<!-- 查询列表 -->
		<div class="list queryTabs">
			<table id="hspcbyxlist"></table>
		</div>
	</form>
	<form id="hspblzskdeleteform"
		action="${baseurl}favorite/delFavoritessubmit.do" method="post">
		<input type="hidden" id="delete_seqno"
			name="hspFavoritesInfCustom.seqno" />
	</form>
</body>

</html>
