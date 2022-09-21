<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引用jquery easy ui的js库及css -->
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js?v=${versionDay}"></script>
    <title>模块管理</title>
</head>

<body class="easyui-layout querymoduleoperate" scroll="no">
    <script type="text/javascript">
        //父页面的enter按键默认功能取消
	    $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                return false;
            }
        });
	    var zt;
	    var rootnode;
	    $(function() {
	    	$(".moduleoperate").parent().css({"margin-left":"2px","margin-top":"2px"});
	        init();
	    });

	    function init() {
	        //var url="${baseurl}tree_data.json?v="+new Date().getTime();
	        var url = "${baseurl}module/loadModuleTreeElement.do";
	        zt = new ZTREE("ul_id_1", url, false); //id 连接 是否有复选框
	        zt.ztreeload({
	            method: "get"
	        }, {
	            onClick: onclickfn,
	            onBeforeExpand: onBeforeExpandfn,
	            onLoadSuccess: onLoadSuccessfn
	        }); //属性设定,事件绑定
	    }

	    function onLoadSuccessfn(node, data) { //数据加载完成绑定事件
	        //collapseAll();//折叠所有按钮
	        if (!rootnode) {
	            rootnode = $('#ul_id_1').tree("getRoot");
	            if (rootnode) {
	                var node = rootnode;
	                var text = node.text;
	                if (node.attributes && node.attributes.url) {
	                    var url = "${baseurl}" + node.attributes.url + "?moduleid=" + node.id;
	                    reloadPanel(url, text);
	                }
	            }
	            zt.expandAll();
	        }
	    }

	    function onBeforeExpandfn(node) { //展开数据前绑定事件
	        var ChildernNodes = zt.getChildren(node);
	        if (ChildernNodes.length <= 0) { //存在子节点
	            var url = "${baseurl}module/loadModuleTreeElement.do"; //请求连接
	            var data = {
	                nodeid: node.id
	            }; //请求数据
	            zt.ajaxGetNodes(url, data, function(json) {
	                if ($.isArray(json)) //返回数组类型的数据
	                    zt.append(json, node); //追加数据
	                else
	                    zt.append([], node); //追加数据	
	            }); //向一个节点添加子节点
	            return true;
	        }
	    }
	    //树点击事件
	    function onclickfn(node) { //单机一个节点绑定事件
	        var url = "${baseurl}" + node.attributes.url + "?moduleid=" + node.id;
	        var text = node.text;
	        if (node.attributes && node.attributes.url) {
	            reloadPanel(url, text);
	        } else {
	            zt.onclickfn(node); //默认点击是展开或关闭一个节点
	        }

	    }


	    function reload() {
	        zt.reload();
	    }
	    //重新加载Panel
	    function reloadPanel(url, text) {
	        $('#Panle').panel('open').panel('refresh', url);
	    }

	    function collapseAll() {
	        zt.collapseAll();
	    }

	    function expandAll() {
	        zt.expandAll();
	    }
    </script>
    <div class="panelmodule moduleoperate" id="west" title="系统功能操作列表" split="true" region="west" hide="true">
        <div class="tree-head">
            <div class="tree-btn">
                <img src="../images/common/reload.png" class="tree-icons" />
                <a href="#" class="tree-a" onclick="reload()">刷新</a>
            </div>
            <div class="tree-btn">
                <img src="../images/common/arrow_out.png" class="tree-icons" />
                <a href="#" class="tree-a" onclick="expandAll()">展开</a>
            </div>
            <div class="tree-btn">
                <img src="../images/common/arrow_in.png" class="tree-icons" />
                <a href="#" class="tree-a" onclick="collapseAll()">折叠</a>
            </div>
        </div>
        <div id="nav" class="easyui-accordion" border="false">
            <ul id="ul_id_1"></ul>
        </div>
    </div>
    <div class="easyui-panel" id="mainPanle" region="center" data-options="border:false">
        <div class="easyui-panel" id="Panle" title="" data-options="closed: true,border:false">
        </div>
    </div>
</body>

</html>
