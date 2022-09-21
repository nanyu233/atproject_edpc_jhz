<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <title>设备配置</title>
</head>

<body class="querydevice">
  <script type="text/javascript">
    function reload() {
      $('#devicelist').datagrid('reload');
    }

    //加载datagrid
    $(function () {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 16);
      $("#devicelist").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'id',
          title: 'id ',
          width: getWidth(0.2),
          hidden: 'true',
        }, {
          field: 'devtypcodName',
          title: '设备类型 ',
          width: getWidth(0.14),
        }, {
          field: 'devno',
          title: '设备唯一号 ',
          width: getWidth(0.10),
        }, {
          field: 'ipaddr',
          title: '绑定客户端IP',
          width: getWidth(0.10),
        }, {
          field: 'crtDatStr',
          title: '创建日期',
          width: getWidth(0.14),
        }, {
          field: 'crtUsrName',
          title: '创建人',
          width: getWidth(0.12),
        }, {
          field: 'updDatStr',
          title: '修改日期',
          width: getWidth(0.14),
        }, {
          field: 'updUsrName',
          title: '修改人',
          width: getWidth(0.12),
        }]
      ];

      function callBack(toolbar_v) {
        $('#devicelist').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}device/querydevice_result.do',
          idField: 'id',
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [15, 30, 50],
          toolbar: toolbar_v
        });
      }
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function querydevice() {
      var formdata = $("#devicequeryForm").serializeJson();
      $('#devicelist').datagrid('load', formdata);
    }

    //新增
    function cmdadd() {
      createmodalwindow("新增设备配置", 515, 300, '${baseurl}device/toinsert.do', 'no');
    }

    //删除 统一用form
    function cmddel() {
      var node = $('#devicelist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        deletedevice(node.id);
      }
    }
    //删除的回调函数
    function devicedel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        $('#devicelist').datagrid('clearSelections');
        querydevice();
      }
    }

    //删除 统一用form
    function deletedevice(id) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_id").val(id);
        jquerySubByFId('devicedeleteform', devicedel_callback, null, "json");
      });
    }


    //修改角色信息
    function cmdedit() {
      //打开修改窗口
      var node = $('#devicelist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        var url = '${baseurl}device/toupdate.do?hspDevSysCustom.id=' + node.id;
        createmodalwindow("修改设备配置", 515, 300, url, 'no');
      }
    }
  </script>
  <!-- html的静态布局 -->
  <form id="devicequeryForm">
    <div class="form clr">
      <p class="form-text">设备类型：</p>
      <select id="emg_cstDspCod" name="hspDevSysCustom.devtypCod" class="li-input-s" onchange="querydevice()">
        <option value="">请选择</option>
        <c:forEach items="${stateList}" var="value">
          <option value="${value.infocode}">${value.info}</option>
        </c:forEach>
      </select>
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="querydevice()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="queryTabs m-l2">
      <table id="devicelist"></table>
    </div>
  </form>
  <form id="devicedeleteform" action="${baseurl}device/deletehds.do" method="post">
    <input type="hidden" id="delete_id" name="id" />
  </form>
</body>

</html>