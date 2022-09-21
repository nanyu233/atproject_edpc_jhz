<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>机构管理</title>
</head>

<body class="compctl">
  <script type="text/javascript" src="${baseurl}lib/activetech.ztreegrid.js"></script>
  <script>
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          return false;
      }
    });
    var tg;
    var updateNode;
    var addNode;

    function cmdshow() {
      tg.expandAll();
    }

    function cmdfold() {
      tg.collapseAll();
    }

    function cmdadd() {
      add();
    }

    function cmdedit() {
      edit();
    }

    function cmdremove() {
      remove();
    }

    function cmdexport() {
      compctlexport();
    }

    //加载
    $(function () {
      init();
      // 当输入框获取光标后enter按键就默认触发查询事件
      $("#querycomcname").keyup(function (event) {
        if (event.keyCode == 13) {
          querycompctl();
        }
      })
    });

    function init() {
      var toolbar_v;
      var comcname = $("#querycomcname").val();
      var isJzks = $("#compctl_isJzks").val();
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

      function callBack(toolbar_v) {
        var propObj = {
          iconCls: 'icon-ok',
          rownumbers: true,
          animate: true,
          collapsible: true,
          fitColumns: true,
          showFooter: true,
          queryParams: {
            "dstcompctlCustom.comcname": comcname,
            "dstcompctlCustom.isJzks": isJzks
          },
          columns: [
            [{
              field: 'comno',
              width: getWidth(0.2),
              editor: 'text',
              title: '机构号'
            }, {
              field: 'comcname',
              width: getWidth(0.2),
              align: 'left',
              editor: 'text',
              title: '机构名'
            }, {
              field: 'phone',
              width: getWidth(0.1),
              align: 'left',
              editor: 'text',
              title: '联系电话'
            }, {
              field: 'vchar1',
              width: getWidth(0.1),
              align: 'left',
              editor: 'text',
              title: '拼音首码'
            }, {
              field: 'addr',
              width: getWidth(0.2),
              align: 'left',
              editor: 'text',
              title: '地址'
            }, {
              field: 'isJzks',
              width: getWidth(0.1),
              align: 'left',
              editor: 'text',
              title: '是否急诊科室'
            }, {
              field: 'isenable',
              width: getWidth(0.1),
              align: 'left',
              editor: 'text',
              title: '状态',
            }]
          ],
          toolbar: toolbar_v
        }; //添加属性
        var eventObj = {}; //添加事件
        var url = "${baseurl}compctl/loadCompctlTreeGrid.do";
        tg = new ZTREEGRID('test', url, 'comno', 'comno'); //目标id 远程连接 数据标识 树表格的唯一标识 
        tg.ztreegridload(propObj, eventObj); //加载数据
      }
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
      $("#test").height(height);


    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function remove() { ///删除节点操作
      var node = tg.getSelected();
      if (GridUtils.checkChecked(node)) {
        var s = tg.getChildren(node);
        if (s.length > 0) {
          publicFun.alert('该机构有子节点不允许删除');
          return false;
        } else {
          deletecompctl(node.comno);
        }
      }
    }

    function add() {
      var node = tg.getSelected();
      if (GridUtils.checkChecked(node)) {
        createmodalwindow("新增机构信息", 580, 420, '${baseurl}compctl/addcompctl.do?comman=' + node.comno);
      }
    }

    function edit() {
      var node = tg.getSelected();
      if (GridUtils.checkChecked(node)) {
        createmodalwindow("修改机构信息", 580, 420, '${baseurl}compctl/editcompctl.do?comno=' + node.comno);
      }
    }
    //删除 统一用form
    function deletecompctl(comno) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_comno").val(comno);
        jquerySubByFId('compctldeleteform', compctldel_callback, null, "json");
      });
    }
    //删除的回调函数
    function compctldel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        tg.remove(tg.getSelected());
      }
    }
    //导出机构
    function compctlexport() {
      _confirm('确定导出吗？', null, function () {
        var rootnode = $('#test').treegrid("getRoot");
        $("#comno").val(rootnode.comno);
        jquerySubByFId('compctlqueryForm', compctlExport_callback, null, "json");
      });
    }
    //导出的回调函数
    function compctlExport_callback(data) {
      message_alert(data);
    }
    //机构名查询
    function querycompctl() {
      //var formdata = $("#compctlqueryForm").serializeJson();
      init();
    }
  </script>
  <!-- html的静态布局 -->
  <form id="compctlqueryForm" name="compctlqueryForm" action="${baseurl}compctl/exportcompctlSubmit.do" method="post">
    <input type="hidden" id="comno" name="comno" />
    <div class="form clr">
      <p class="form-text">查询条件：</p>
      <input class="input-base total-right" type="text" id="querycomcname" name="dstcompctlCustom.comcname">
      <p class="form-text">是否急诊科室：</p>
      <select id="compctl_isJzks" name="dstcompctlCustom.isJzks">
        <option value="">请选择</option>
        <option value="1">是</option>
        <option value="0">否</option>
      </select>
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="querycompctl()">查询</a>
    </div>
    <div class="list queryTabs">
      <table id="test"></table>
    </div>
  </form>
  <form id="compctldeleteform" action="${baseurl}compctl/deletecompctl.do" method="post">
    <input type="hidden" id="delete_comno" name="comno" />
  </form>
</body>

</html>