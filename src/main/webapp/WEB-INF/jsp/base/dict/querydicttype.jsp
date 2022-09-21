<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引用jquery easy ui的js库及css -->
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
	<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}"/>
    <title>数据字典列表</title>
</head>

<body class="easyui-layout querydicttype" scroll="no">
    <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
    <script type="text/javascript">
	    //加载datagrid
	    $(function() {
	        $('#dicttypelist').height($("#west").height() * 0.98);
	        $('#dicttypelist').datagrid({
	            nowrap: true,
	            striped: false,
	            singleSelect: true,
	            url: '${baseurl}dict/querydicttype_result.do',
	            idField: 'typecode',
	            loadMsg: '',
	            border: false,
	            columns: columns_v,
	            pagination: false,
	            rownumbers: false,
	            onLoadSuccess: function(data) {
	                initPanel();
	            }
	        });
	    });

	    //datagrid列定义
	    var columns_v = [
	        [{
	            field: 'typecode',
	            hidden: true,
	        }, {
	            field: 'typename', //对应json中的key
	            width: 190,

	            title: '基础类别列表',
	            formatter: function(value, row, index) {
	                return "<span class='url-titlelink'><a href=javascript:onclicktype('" + row.typecode + "','" + row.typename + "')>" + row.typename + "</a></span>";
	            }

	        }]
	    ];

	    function onclicktype(typecode, typename) {
	        var url = '${baseurl}dict/querydict.do?typecode=' + typecode + '&moduleid=${moduleid}';
	        var text = typename;
	        reloadPanel(url, text);
	    }

	    //初始化panel
	    function initPanel() {
	        var rows = $('#dicttypelist').datagrid('getRows');
	        var url1 = '${baseurl}dict/querydict.do?typecode=' + rows[0].typecode + '&moduleid=${moduleid}';
	        $('#Panle').panel('open').panel({
	            href: url1,
	            cache: false,
	            border: false,
	            fit: true,
	            noheader: true
	        });

	    }

	    //重新加载Panel
	    function reloadPanel(url, text) {
	        $('#Panle').panel({
	            fit: true,
	            title: text,
	            cache: false,
	            href: url,
	            border: false,
	            noheader: true
	        });
	    }
    </script>
    <div class="list" id="west" title="" split="true" region="west" hide="true">
        <div>
            <table id="dicttypelist"></table>
        </div>
    </div>
    <div class="easyui-panel paneldict" id="mainPanle" region="center">
        <div class="easyui-panel" id="Panle" title="" data-options="closed: true,border:false">
        </div>
    </div>
</body>

</html>
