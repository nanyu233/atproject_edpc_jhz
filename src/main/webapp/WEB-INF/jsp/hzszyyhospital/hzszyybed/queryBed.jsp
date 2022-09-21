<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <!-- 引用jquery easy ui的js库及css -->
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <title>床位管理</title>
</head>

<body class="querydevice">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          querybed();
      }
    });
    function reload() {
      $('#bedlist').datagrid('reload');
    }

    //加载datagrid
    $(function () {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 16);
      $("#bedlist").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'bedid',
          title: 'id ',
          width: getWidth(0.14),
          hidden: true
        }, {
          field: 'bedPlcNam',
          title: '位置 ',
          width: getWidth(0.14)
        }, {
          field: 'bedNum',
          title: '床号',
          width: getWidth(0.14)
        }, {
          field: 'emgNam',
          title: '当前使用患者',
          width: getWidth(0.2)
        }, {
          field: 'showorder',
          title: '排序',
          width: getWidth(0.2)
        }, {
          field: 'emgSeq',
          title: '',
          width: 0,
          hidden: true
        }]
      ];

      function callBack(toolbar_v) {
        $('#bedlist').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}bedinf/querybed_result.do',
          idField: 'bedid',
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [20, 30, 50],
          toolbar: toolbar_v,
          onDblClickRow: function (rowIndex, rowData) {
            cmddeploybed();
          }
        });
      }
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function querybed() {
      var formdata = $("#bedqueryForm").serializeJson();
      $('#bedlist').datagrid('load', formdata);
      $('#bedlist').datagrid('clearSelections');
    }

    //新增
    function cmdaddbed() {
      createmodalwindow("新增床位", 470, 230, '${baseurl}bedinf/toinsert.do', 'no');
    }

    //删除 统一用form
    function cmddelbed() {
      var node = $('#bedlist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        deletebed(node.bedid);
      }
    }
    //删除的回调函数
    function beddel_callback(data) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}/first.do";
        });
      } else {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          $('#bedlist').datagrid('clearSelections');
          querybed();
        }
      }
    }

    function cmdeditjzzyy() {
      var row = $('#bedlist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        if (row.emgSeq == null) {
          publicFun.alert("当前床位无使用患者!");
        } else {
          parent.opentabwindow(row.emgNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + row.emgSeq + "&th=" + new Date().getTime());
        }
      }
    }


    function cmddeploybed() {
      var row = $('#bedlist').datagrid('getSelected');
      if (GridUtils.checkChecked(row)) {
        if (row.emgSeq == null) {
          publicFun.alert("当前床位无使用患者!");
        } else {
          var openModalWindowUrl = "${baseurl}bedinf/todeploy.do?hspBedInfCustom.bedid=" + row.bedid + "&emgNam=" + row.emgNam + "&emgSeq=" + row.emgSeq;
          createmodalwindow("调配床位", 470, 230, openModalWindowUrl);
        }
      }
    }


    //删除 统一用form
    function deletebed(id) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_id").val(id);
        jquerySubByFId('beddeleteform', beddel_callback, null, "json");
      });
    }


    //修改角色信息
    function cmdeditbed() {
      //打开修改窗口
      var node = $('#bedlist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        var url = '${baseurl}bedinf/toupdate.do?hspBedInfCustom.bedid=' + node.bedid;
        createmodalwindow("修改床位", 470, 230, url, 'no');
      }
    }
  </script>
  <!-- html的静态布局 -->
  <form id="bedqueryForm">
    <div class="form clr">
      <p class="form-text">位置：</p>
      <select id="bedPlace" name="hspBedInfCustom.bedPlace" class="li-input-s">
        <option value="">全部</option>
        <c:forEach items="${stateList}" var="value">
          <option value="${value.infocode}">${value.info}</option>
        </c:forEach>
      </select>
      <p class="form-text">床位状态：</p>
      <select id="Remark" name="hspBedInfCustom.bedRemark" class="li-input-s">
        <option value="">请选择</option>
        <option value="0">空余</option>
        <option value="1">已用</option>
      </select>
      <p class="form-text">床号：</p>
      <input id="bednum" name="hspBedInfCustom.bedNum" type="text" />
      <input type="text" class="hidden">
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="querybed()">查询</a>
    </div>
  </form>
  <!-- 查询列表 -->
  <div class="list queryTabs">
    <table id="bedlist"></table>
  </div>
  <form id="beddeleteform" action="${baseurl}bedinf/deletebed.do" method="post">
    <input type="hidden" id="delete_id" name="hspBedInfCustom.bedid" />
  </form>
</body>

</html>