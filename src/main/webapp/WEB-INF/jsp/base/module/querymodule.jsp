<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <!-- 引用jquery easy ui的js库及css -->
  <title>模块管理</title>
</head>

<body>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          querymodule();
      }
    });
    //定义 datagird工具
    var toolbar_v = [{ //工具栏
      id: 'btnadd',
      text: '新增模块',
      iconCls: 'icon-add',
      handler: function () {
        //参数：窗口的title、宽、高、url地址
        createmodalwindow("新增模块", 515, 310, '${baseurl}module/addmodule.do?parentid=' + "${parentid}");
      }
    }];
    //加载datagrid
    $(function () {
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
      $("#modulelist").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'modulename',
          title: '模块名称',
          width: getWidth(0.12)
        }, {
          field: 'parentname',
          title: '所属上级模块',
          width: getWidth(0.15),
          formatter: function (value, row, index) {
            if ("${parentid}" == 0) {
              return '无';
            } else {
              return value;
            }
          }
        }, {
          field: 'url',
          title: 'URL',
          width: getWidth(0.16)
        }, {
          field: 'icon',
          title: '图标',
          width: getWidth(0.1)

        }, {
          field: 'showorder',
          title: '显示顺序',
          width: getWidth(0.05)

        }, {
          field: 'isused',
          title: '使用状态',
          width: getWidth(0.06),
        }, {
          field: 'reloadType',
          title: '刷新类型',
          width: getWidth(0.08),
        }, {
          field: 'oper',
          //对应json中的key
          title: '操作',
          width: getWidth(0.08),
          formatter: function (value, row, index) {
            return "<span class='url-link'><a href=javascript:editmodule('" + row.moduleid + "')>修改</a></span> | <span class='url-link'><a href=javascript:deletemodule('" + row.moduleid + "')>删除</a></span>";
          }
        }]
      ];

      $('#modulelist').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}module/querymodule_result.do',
        queryParams: {
          "dstmoduleCustom.parentid": "${parentid}"
        },
        idField: 'moduleid',
        loadMsg: '',
        columns: columns_v,
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50],
        toolbar: toolbar_v
      });
      $("#module_modulename").keyup(function (event) {
        if (event.keyCode == 13) {
          querymodule();
        }
      })
    });
    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }
    //查询方法
    function querymodule() {
      var formdata = $("#modulequeryForm").serializeJson();
      $('#modulelist').datagrid('load', formdata);
    }
    //删除 统一用form
    function deletemodule(moduleid) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_moduleid").val(moduleid);
        jquerySubByFId('moduledeleteform', moduledel_callback, null, "json");
      });
    }
    //删除的回调函数
    function moduledel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        querymodule();
      }
    }
    //修改角色信息
    function editmodule(moduleid) {
      //打开修改窗口
      createmodalwindow("修改模块信息", 515, 310, '${baseurl}module/editmodule.do?moduleid=' + moduleid);
    }
  </script>
  <!-- html的静态布局 -->
  <form id="modulequeryForm">
    <div class="form clr">
      <p class="form-text">模块名称：</p>
      <input id="module_modulename" type="text" name="dstmoduleCustom.modulename" />
      <input class="hidden" type="hidden" id="parentid" name="dstmoduleCustom.parentid" value="${parentid }" />
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="querymodule()">查询</a>
    </div>
  </form>
  <!-- 查询列表 -->
  <div class="module queryTabs">
    <table id="modulelist"></table>
  </div>
  <form id="moduledeleteform" action="${baseurl}module/deletemodule.do" method="post">
    <input type="hidden" id="delete_moduleid" name="moduleid" />
  </form>
</body>

</html>