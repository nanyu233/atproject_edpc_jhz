<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?909">
  <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
  <title>健康教育项目管理</title>
</head>

<body class="easyui-layout querycompctluser" scroll="no">
  <script>
    var currentNodeItem, editParentId;
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          init();
      }
    });
    function init() {
      var url = "${baseurl}healthedu/loadHealthEducateTree.do?itemNam=" + $('#itemNam').val();
      zt = new ZTREE("treeList", url, false); //id 连接 是否有复选框
      zt.ztreeload({
        method: "post"
      }, {
          onDblClick: ajaxGetSonNodes,
          onExpand: checkNodeSelect,
          onClick: zTreeOnClick,
          onLoadSuccess: onLoadSuccessFun
        }); //属性设定,事件绑定
    }

    var rootNode;
    function onLoadSuccessFun(node, data) {
      if (!rootNode) {
        rootNode = $('#treeList').tree("getRoot");
        if (rootNode) {
          var node = rootNode;
          $('#treeList li div.tree-node')[0].classList = ['tree-node tree-node-selected'];
          var _url = '${baseurl}healthedu/edithealtheduItem.do?itemno=' + node.id + '&type=parentClick';
          $('#editIframe').attr('src', _url);
        }
      } else {
        if (currentNodeItem) {
          // var isLeafFlag = $('#treeList').tree('isLeaf', currentNodeItem.target), _currentId;
          // if (isLeafFlag) {
          //   // _currentId = editParentId;
          //   // var _parentNode = $('#treeList').find("div[node-id=" + _currentId + "]");
          //   // _parentNode[0].classList = ['tree-node tree-node-selected'];
          //   // _parentNode.children("span.tree-hit").removeClass("tree-collapsed tree-collapsed-hover").addClass("tree-expanded");
          //   // _parentNode.next().css({ 'display': 'block' });
          //   // zt.ajaxGetNodes('${baseurl}healthedu/loadHealthEducateTree.do', { itemno: _currentId }, ajaxCallback);
          //   // $('#treeList').find("div[node-id=" + currentNodeItem.id + "]")[0].classList = ['tree-node tree-node-selected'];
          // } else {
          //   _currentId = currentNodeItem.id;
          //   var _parentNode = $('#treeList').find("div[node-id=" + _currentId + "]");
          //   _parentNode[0].classList = ['tree-node tree-node-selected'];
          //   _parentNode.children("span.tree-hit").removeClass("tree-collapsed tree-collapsed-hover").addClass("tree-expanded");
          //   _parentNode.next().css({ 'display': 'block' });
          //   zt.ajaxGetNodes('${baseurl}healthedu/loadHealthEducateTree.do', { itemno: _currentId }, ajaxCallback);
          // }
        }
      }
    }

    //三角形方式展开 ——子节点获取 onExpand
    function checkNodeSelect() {
      var itemNo = null;
      if ($('#treeList .tree-node').hasClass('tree-node-hover')) {
        itemNo = $('#treeList .tree-node-hover').attr('node-id');
      }
      var test = $('#treeList').tree('find', itemNo);
      var children = zt.getChildren(test);
      //判断是否有自增子节点
      if (children.length == 1 && children[0].id == "000000") {
        ajaxGetMsg(itemNo);
      }
    }

    //树点击事件
    function onclickfn(node) {
      if (node.attributes && node.attributes.url) {
      } else {
        zt.onclickfn(node);
      }
    }

    function zTreeOnClick() {
      var currentNode = zt.getSelected();
      currentNodeItem = currentNode;
      var _url = '${baseurl}healthedu/edithealtheduItem.do?itemno=' + currentNode.id + '&type=parentClick';
      $('#editIframe').attr('src', _url);
    }

    function expand() {
      zt.expand();
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

    //加载子节点 onDblClick
    function ajaxGetSonNodes() {
      var nodes = zt.getSelected();
      ajaxGetMsg(nodes.id)
    }

    function ajaxGetMsg(id) {
      var url = "${baseurl}healthedu/loadHealthEducateTree.do";
      var data = { itemno: id };
      zt.ajaxGetNodes(url, data, ajaxCallback);
    }
    //插入子节点回调
    function ajaxCallback(data) {
      var list = data[0].children;
      //获取父节点(不能用getselected)
      var parent = $('#treeList').tree('find', data[0].id);
      var newNodes = new Array();
      //双击事件判断
      var children = zt.getChildren(parent);
      if (children.length == 1 && children[0].id == "000000") {
        if (list) {
          $.each(list, function (i, n) {
            newNodes.push(list[i]);
          });
          zt.append(newNodes, parent);
        }
        var children2 = zt.getChildren(parent);
        //删除tree自增的子节点
        zt.removeChildNode(children2[0]);
        var sel = zt.getSelected();
        if (sel != null && parent.id == sel.id) {
          zt.onclickfn(parent);
        }
      } else {
        var nodes = zt.getSelected();
        zt.onclickfn(nodes);
      }
    }

    function add() {
      var node = zt.getSelected();
      if (GridUtils.checkChecked(node)) {
        publicFun.httpServer({ url: '${baseurl}healthedu/getTreeNodeLevel.do' }, { itemno: node.id }, function (data) {
          if (data >= 3) {
            publicFun.alert('该节点已是最大节点，无法再新增子节点！');
          } else {
            currentNodeItem = node;
            var _url = '${baseurl}healthedu/addhealtheduItem.do?parentno=' + node.id + '&parentname=' + node.text + '&type=parentClick';
            $('#editIframe').attr('src', _url);
            // createmodalwindow("新增健康教育项目", 580, 430, '${baseurl}healthedu/addhealtheduItem.do?parentno=' + node.id + '&parentname=' + node.text);
          }
        })
      }
    }

    function edit() {
      var node = zt.getSelected();
      if (GridUtils.checkChecked(node)) {
        currentNodeItem = node;
        var _url = '${baseurl}healthedu/edithealtheduItem.do?itemno=' + node.id + '&type=parentClick';
        $('#editIframe').attr('src', _url);
        // createmodalwindow("修改健康教育项目", 580, 430, '${baseurl}healthedu/edithealtheduItem.do?itemno=' + node.id);
      }
    }

    function removeCurrent() { ///删除节点操作
      var node = zt.getSelected();
      if (node.id == '00100') {
        publicFun.alert('根节点不允许删除');
        return;
      }
      if (GridUtils.checkChecked(node)) {
        deleteItem(node.id);
      }
    }
    //删除 统一用form
    function deleteItem(itemno) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_itemno").val(itemno);
        jquerySubByFId('healthedudeleteform', compctldel_callback, null, "json");
      });
    }
    //删除的回调函数
    function compctldel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        zt.remove(zt.getSelected());
        var node = rootNode;
        $('#treeList li div.tree-node')[0].classList = ['tree-node tree-node-selected'];
        var _url = '${baseurl}healthedu/edithealtheduItem.do?itemno=' + node.id + '&type=parentClick';
        $('#editIframe').attr('src', _url);
      }
    }
    $(function () {
      init();
    });
  </script>
  <div class="compctluser" id="west" title="健康教育管理" split="true" region="west" hide="true">
    <div class="tree-head tree-fix-title">
      <div class="tree-btn">
        <img src="../lib/easyui1.3/themes/icons/edit_add.png" class="tree-icons" />
        <a href="#" class="tree-a" onclick="add()">新增</a>
      </div>
      <div class="tree-btn">
        <img src="../lib/easyui1.3/themes/icons/pencil.png" class="tree-icons" />
        <a href="#" class="tree-a" onclick="edit()">修改</a>
      </div>
      <div class="tree-btn">
        <img src="../lib/easyui1.3/themes/icons/cancel.png" class="tree-icons" />
        <a href="#" class="tree-a" onclick="removeCurrent()">删除</a>
      </div>
      <div class="topQueryDiv">
        <input type="text" id="itemNam" />
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="init()"></a>
      </div>
    </div>
    <div id="nav" class="easyui-accordion marginTitleGap" data-options="border:false">
      <ul id="treeList"></ul>
    </div>
    <form id="healthedudeleteform" action="${baseurl}healthedu/deletehealtheduItem.do" method="post">
      <input type="hidden" id="delete_itemno" name="itemno" />
    </form>
  </div>
  <div class="easyui-panel" id="mainPanle" region="center" data-options="border:false">
    <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="99%" id="editIframe" scrolling="no"
      src=""></iframe>
  </div>
  <!-- <script>
    //导出机构
    function compctlexport() {
      _confirm('确定导出吗？', null, function () {
        var rootnode = $('#test').treegrid("getRoot");
        $("#itemno").val(rootnode.itemno);
        jquerySubByFId('healtheduqueryForm', compctlExport_callback, null, "json");
      });
    }
    //导出的回调函数
    function compctlExport_callback(data) {
      message_alert(data);
    }
    //机构名查询
    function queryitem() {
      init();
    }
  </script>
  <form id="healthedudeleteform" action="${baseurl}healthedu/deletehealtheduItem.do" method="post">
    <input type="hidden" id="delete_itemno" name="itemno" />
  </form> -->
</body>

</html>