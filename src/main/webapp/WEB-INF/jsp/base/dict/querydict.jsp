<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <!-- 引用jquery easy ui的js库及css -->
    <title>数据字典</title>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}" />
</head>

<body>
    <script type="text/javascript">
  //定义datagrid工具
	function cmdadd() {
		createmodalwindow("新增数据字典", 515, 340, '${baseurl}dict/adddict.do?typecode=' + "${typecode}");
	}

	function cmdok() {
		var indexs = []; //定义一个数组准备存放删除记录的序号
		//通过jquery easyui的datagrid的getSelections函数，得到当前所选中的行（对象数组）
		var rows = $('#dictlist').datagrid('getSelections');
		for(var i = 0; i < rows.length; i++) {
			//通过jquery easyui的datagrid的getRowIndex方法得到行的序号
			var index = $('#dictlist').datagrid('getRowIndex', rows[i]);
			//将选中行的序号放入indexs数组
			indexs.push(index);
		}
		if(rows.length > 0) {
			$("#indexs").val(indexs.join(','));
			$("#isenable").val("1");
			_confirm('确定提交吗？', null, function() {
				jquerySubByFId('dictqueryForm', upload_callback, null, "json");
			});
		} else {
			alert_warn("请勾选所要设置的对象");
		}
	}

	function cmdno() {
		var indexs = []; //定义一个数组准备存放删除记录的序号
		//通过jquery easyui的datagrid的getSelections函数，得到当前所选中的行（对象数组）
		var rows = $('#dictlist').datagrid('getSelections');
		for(var i = 0; i < rows.length; i++) {
			//通过jquery easyui的datagrid的getRowIndex方法得到行的序号
			var index = $('#dictlist').datagrid('getRowIndex', rows[i]);
			//将选中行的序号放入indexs数组
			indexs.push(index);
		}
		if(rows.length > 0) {
			$("#indexs").val(indexs.join(','));
			$("#isenable").val("0");
			_confirm('确定提交吗？', null, function() {
				jquerySubByFId('dictqueryForm', upload_callback, null, "json");
			});
		} else {
			alert_warn("请勾选所要设置的对象");
		}
	}

	//设置可用的回调函数
    function upload_callback(data) {
        message_alert(data);
        querydict();
    }
	
	function cmdedit() {
		var node = $('#dictlist').datagrid("getSelected");
		if(GridUtils.checkChecked(node)) {
			createmodalwindow("修改数据字典", 515, 340, '${baseurl}dict/editdict.do?id=' + node.id);
		}
	}

	function cmdcut() {
		var node = $('#dictlist').datagrid("getSelected");
		if(GridUtils.checkChecked(node)) {
			_confirm('确定删除该数据吗？', null, function() {
				$("#delete_id").val(node.id);
				jquerySubByFId('dictdeleteform', dictdel_callback, null, "json");
			});
		}
	}

        //删除 统一用form
        function deletedict(id) {
            _confirm('确定删除该数据吗？', null, function() {
                $("#delete_id").val(id);
                jquerySubByFId('dictdeleteform', dictdel_callback, null, "json");
            });
        }
        //删除的回调函数       
        function dictdel_callback(data) {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
            	$('#dictlist').datagrid('clearSelections');
                querydict();
            }
        }

        //查询方法
        function querydict() {
            var formdata = $("#dictqueryForm").serializeJson();
            $('#dictlist').datagrid('reload');
        }

        function getWidth(proportion) {
            var width = $("#dictdeleteform").parent("#Panle").width();
            return Math.round(proportion * width);
        }
      //加载datagrid
		$(function() {
			var toolbar_v;
			publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
			function callBack(toolbar_v) {
				$('#dictlist').datagrid({
					nowrap: true,
					striped: true,
					url: '${baseurl}dict/querydict_result.do',
					queryParams: {
						"dstdictinfoCustom.typecode": "${typecode}"
					},
					idField: 'id',
					loadMsg: '',
					columns: columns_v,
					singleSelect: false,
					selectOnCheck: true,
					checkOnselect: true,
					pagination: true,
					rownumbers: true,
					pageList: [15, 30, 50],
					toolbar: toolbar_v
				});
			}
			var height = 0.975 * ($("#tabs", parent.document).height() - 19);
			$("#dictlist").height(height);
			//datagrid定义
			var columns_v = [
				[{
					checkbox: true
				}, {
					field: 'id',
					hidden: true, //改列隐藏
					formatter: function(value, row, index) {
						return '<input type="hidden" name="dstdictinfoCustoms[' + index + '].id" value="' + value + '"/>';
					}
				}, {
					field: 'typename',
					title: '类别',
					width: getWidth(0.3)
				}, {
					field: 'info',
					title: '名称/值',
					width: getWidth(0.24)
				}, {
					field: 'dictsort',
					title: '显示顺序',
					width: getWidth(0.2)
				}, {
					field: 'isenable',
					title: '状态',
					width: getWidth(0.2)
				}, ]
			];

		});
    </script>
    <!-- html的静态布局 -->
    <form id="dictqueryForm" action="${baseurl}dict/plszsubmit.do" method="post">
        <!-- 查询列表 -->
        <div class="dictdiv queryTabs">
            <table id="dictlist"></table>
        </div>
        <input type="hidden" name="typecode" value="${typecode}" />
        <input type="hidden" name="indexs" id="indexs">
        <input type="hidden" name="isenable" id="isenable">
    </form>
    <form id="dictdeleteform" action="${baseurl}dict/deletedict.do" method="post">
        <input type="hidden" id="delete_id" name="id" />
    </form>
</body>

</html>
