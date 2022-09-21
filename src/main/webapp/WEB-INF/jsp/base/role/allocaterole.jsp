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
    <title>权限管理</title>
</head>

<body class="allocaterole">
    <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
    <script type="text/javascript">
	    var zt;
	    $(function() {
	        init();
	    });

	    function init() {
	        var url = "${baseurl}module/loadAuthModuleTree.do?roleid=${roleid}";
	        zt = new ZTREE("tt2", url, true); //id 连接 是否有复选框
	        zt.ztreeload({
	            method: "get"
	        }, {
	            onClick: onclickfn
	        }); //属性设定,事件绑定
	        //设置mods高度
	        // var height = $("document").height()-$("#operation").height()-$("#buttonDiv").height();
	        $("#mods").height(275);
	    }

	    function icon_ok_id_Clickfn(id) {
	        var nodes = zt.getChecked();
	        var ids = [];
	        for (var i = 0; i < nodes.length; i++) {
	            ids.push(nodes[i].id);
	        }
	        ids.join(",");
	        $("#ids").val(ids);
	        _confirm('选中' + nodes.length + '条数据，确认提交吗？', null, function() {
	            jquerySubByFId('ids_form', add_callback, null, "json");
	        });

	    }

	    function add_callback(data) {
	        message_alert(data);
	        if (data.resultInfo.type == '1') {
	            setTimeout("parent.closemodalwindow()", 1000);
	            parent.queryrole();
	        }
	    }
	    //树点击事件
	    function onclickfn(node) {
	        var url = "${baseurl}" + node.attributes.url;
	        var text = node.text;
	        if (node.attributes && node.attributes.url) {
	            reloadPanel(url, text);
	        } else {
	            zt.onclickfn(node);
	        }
	    }
	    //重新加载Panel
	    function reloadPanel(url, text) {
	        $('#Panle').panel({
	            fit: true,
	            title: text,
	            cache: false,
	            href: url,
	            border: false
	        });
	    }

	    function collapseAll() {
	        zt.collapseAll();
	    }

	    function expandAll() {
	        zt.expandAll();
	    }

	    function CheckedAll() {
	        zt.CheckedAll();
	    }

	    function unCheckedAll() {
	        zt.unCheckedAll();
	    }
    </script>
    <form id="ids_form" action="${baseurl}module/roleauth.do">
        <input type="hidden" name="ids" id="ids">
        <input type="hidden" name="roleid" id="roleid" value="${roleid }">
    </form>
    <div id="operation" class="tree-head">
        <div class="tree-btn2">
            <img src="../images/common/reload.png" class="tree-icons" />
            <a href="#" class="tree-a" onclick="reload()">刷新</a>
        </div>
        <div class="tree-btn2">
            <img src="../images/common/arrow_out.png" class="tree-icons" />
            <a href="#" class="tree-a" onclick="expandAll()">展开</a>
        </div>
        <div class="tree-btn2">
            <img src="../images/common/arrow_in.png" class="tree-icons" />
            <a href="#" class="tree-a" onclick="collapseAll()">折叠</a>
        </div>
        <div class="tree-btn2">
            <img src="../images/common/tick.png" class="tree-icons" />
            <a href="#" class="tree-a" onclick="CheckedAll()">全选</a>
        </div>
        <div class="tree-btn2">
            <img src="../images/common/accept.png" class="tree-icons" />
            <a href="#" class="tree-a" onclick="unCheckedAll()">全不选</a>
        </div>
    </div>
    <div id="mods" class="form-body m-t10 fmdiv">
        <ul id="tt2"></ul>
    </div>
    <div id="buttonDiv" class="btn_grp">
        <center class="tree-bottom">
            <a class="easyui-linkbutton" href="#" iconCls="icon-ok" id="icon_ok_id" onClick="icon_ok_id_Clickfn('icon_ok_id');">确定</a>
            <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </center>
    </div>
</body>

</html>
