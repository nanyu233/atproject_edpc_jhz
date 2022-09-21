<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <!-- 引用jquery easy ui的js库及css -->
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
  <title>机构用户管理</title>
</head>

<body class="easyui-layout" scroll="no">
  <script type="text/javascript">
    //父页面的enter按键默认功能取消
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          return false;
      }
    });

    var zt;
    var rootnode;
    $(function () {
      $(".outdiv").parent().css({ "margin-left": "2px", "margin-top": "2px" });
      init();
    });
    function init() {
      var url = "${baseurl}compctl/loadCompctlUserTreeElement.do?id=0";//分步加载
      zt = new ZTREE("ul_id_1", url, false);//id 连接 是否有复选框
      zt.ztreeload({ method: "get" }, { onClick: onclickfn, onBeforeExpand: onBeforeExpandfn, onLoadSuccess: onLoadSuccessfn });//属性设定,事件绑定
    }
    function onLoadSuccessfn(node, data) {//数据加载完成绑定事件
      //collapseAll();//折叠所有按钮

      if (!rootnode) {
        rootnode = $('#ul_id_1').tree("getRoot");
        if (rootnode) {
          var node = rootnode;
          var text = node.text;
          if (node.attributes && node.attributes.url) {
            var url = "${baseurl}user/outCallList.do?sysid=" + node.id + "&moduleid=${moduleid}";
            reloadPanel(url, text);
          }
        }

      }

    }
    function onBeforeExpandfn(node) {//展开数据前绑定事件
      var ChildernNodes = zt.getChildren(node);
      if (ChildernNodes.length <= 0) {//存在子节点
        var url = "${baseurl}compctl/loadCompctlUserTreeElement.do";//请求连接
        var data = { id: node.id };//请求数据
        zt.ajaxGetNodes(url, data, function (json) {
          // console.log('json=============='+JSON.stringify(json))
          if ($.isArray(json))//返回数组类型的数据
            zt.append(json, node);//追加数据
          else
            zt.append([], node);//追加数据	
        });//向一个节点添加子节点
        return true;
      }
    }
    //树点击事件
    function onclickfn(node) {//单机一个节点绑定事件
      var text = node.text;
      if (node.attributes && node.attributes.url) {
        var url = "${baseurl}user/outCallList.do?sysid=" + node.id + "&moduleid=${moduleid}";
        reloadPanel(url, text);
      } else {
        zt.onclickfn(node);//默认点击是展开或关闭一个节点
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
  <div class="outdiv" style="width: 200px;" id="west" title="出诊管理" split="true" region="west" hide="true">
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