<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- 引用jquery easy ui的js库及css -->
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}" />
  <title>角色管理</title>
</head>

<body class="queryrole">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryrole();
      }
    });

    function reload() {
      $('#rolelist').datagrid('reload');
    }

    function cmdedit() {
      var row = $('#rolelist').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        createmodalwindow("修改角色信息", 535, 340, '${baseurl}role/editrole.do?roleid=' + row.roleid);
      }
    }

    function cmdadd() {
      createmodalwindow("新增角色", 535, 340, '${baseurl}role/addrole.do');
    }

    function cmddel() {
      var row = $('#rolelist').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        _confirm('确定删除该数据吗？', null, function () {
          $("#delete_roleid").val(row.roleid);
          jquerySubByFId('roledeleteform', roledel_callback, null, "json");
        });
      }
    }

    function cmdallocate() {
      var node = $('#rolelist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        var url = '${baseurl}role/allocaterole.do?roleid=' + node.roleid;
        createmodalwindow("分配权限", 350, 410, url);
      }

    }
    // 生成列表
    function getDataGird() {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

      function callBack(toolbar_v) {
        $('#rolelist').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}role/queryrole_result.do',
          idField: 'roleid',
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [15, 30, 50],
          toolbar: toolbar_v
        });
      }
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
      $("#rolelist").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'roleid',
          title: '角色码 ',
          width: getWidth(0.18)
        }, {
          field: 'rolename',
          title: '角色名称 ',
          width: getWidth(0.15)
        }, {
          field: 'indexurl',
          title: '首页url',
          width: getWidth(0.14)
        }, {
          field: 'indexname',
          title: '首页名称',
          width: getWidth(0.12)
        }, {
          field: 'roledes',
          title: '角色描述',
          width: getWidth(0.25)
        }, {
          field: 'qxcount',
          title: '是否分配权限',
          width: getWidth(0.12),
          formatter: function (value, row, index) {
            if (value > 0) {
              return "是";
            } else {
              return "否";
            }
          }
        }]
      ];
    }
    //加载datagrid
    $(function () {
      getDataGird();
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryrole() {
      var formdata = $("#rolequeryForm").serializeJson();
      $('#rolelist').datagrid('load', formdata);
    }

    //删除 统一用form
    function deleterole(roleid) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_roleid").val(roleid);
        jquerySubByFId('roledeleteform', roledel_callback, null, "json");
      });
    }
    //删除的回调函数
    function roledel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        queryrole();
      }
    }

    //修改角色信息
    function editrole(roleid) {
      //打开修改窗口
      createmodalwindow("修改角色信息", 515, 280, '${baseurl}role/editrole.do?roleid=' + roleid);
    }
  </script>
  <!-- html的静态布局 -->
  <form id="rolequeryForm">
    <!-- 查询条件 -->
    <div class="form clr">
      <p class="form-text">角色名称：</p>
      <input id="role_rolename" type="text" name="dstroleCustom.rolename" />
      <input class="hidden" type="hidden" id="parentid" name="parentid" value="${parentid }" />
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryrole()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="list queryTabs">
      <table id="rolelist"></table>
    </div>
  </form>
  <form id="roledeleteform" action="${baseurl}role/deleterole.do" method="post">
    <input type="hidden" id="delete_roleid" name="roleid" />
  </form>
</body>

</html>