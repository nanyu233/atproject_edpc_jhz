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
  <title>物资维护</title>
</head>

<body class="querydevice">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          querydevice();
      }
    });

    function reload() {
      $('#ksjhlist').datagrid('reload');
    }

    //加载datagrid
    $(function () {
      setTime();
      var today = $("#startdate").val();
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
      var height = 0.975 * ($("#tabs", parent.document).height() - 36 - 16);
      $("#ksjhlist").height(height);
      //datagrid列定义
      var columns_v = [
        [{
          field: 'id',
          title: 'id ',
          width: getWidth(0.2),
          hidden: 'true',
        }, {
          field: 'oprtTyp',
          title: '操作类型',
          sortable: true,
          width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (value == "0") {
              return "借出";
            } else if (value == "1") {
              return "借入";
            } else {
              return "";
            }
          }
        }, {
          field: 'objt',
          title: '物品名称',
          sortable: true,
          width: getWidth(0.08),
        }, {
          field: 'lendDpm',
          title: '借出科室',
          sortable: true,
          width: getWidth(0.09),
        }, {
          field: 'lnedUsr',
          title: '借出人员',
          sortable: true,
          width: getWidth(0.07),
        }, {
          field: 'lendDatStr',
          title: '借出时间',
          sortable: true,
          width: getWidth(0.11),
        }, {
          field: 'borrowDpm',
          title: '所借科室',
          sortable: true,
          width: getWidth(0.09),
        }, {
          field: 'borrowUsr',
          title: '所借人员',
          sortable: true,
          width: getWidth(0.07),
        }, {
          field: 'borrowUsrTel',
          title: '所借人员手机',
          sortable: true,
          width: getWidth(0.08),
        }, {
          field: 'deposit',
          title: '押金',
          sortable: true,
          width: getWidth(0.05),
          formatter: function (value, row, index) {
            if (value == null) {
              return;
            } else
              return value + "元";
          }
        }, {
          field: 'returnStatus',
          title: '归还状态',
          sortable: true,
          width: getWidth(0.06),
          formatter: function (value, row, index) {
            if (value == "0") {
              return "未归还";
            } else if (value == "1") {
              return "已归还";
            } else {
              return "";
            }
          }
        }, {
          field: 'oprtUsrNam',
          title: '操作人',
          sortable: true,
          width: getWidth(0.08),
        }, {
          field: 'oprtDatStr',
          title: '操作时间',
          sortable: true,
          width: getWidth(0.12),
        }]
      ];

      function callBack(toolbar_v) {
        $('#ksjhlist').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}ksjh/queryksjh_result.do?today=' + today,
          idField: 'id',
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [15, 30, 50],
          toolbar: toolbar_v,
          onDblClickRow: function (rowIndex, rowData) {
            cmdedit();
          }
        });
      }
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function querydevice() {
      var startdate = $("#startdate").val();
      var enddate = $("#enddate").val();
      if (startdate > enddate) {
        publicFun.alert('结束时间需大于开始时间');
        return false;
      }
      var formdata = $("#ksjhForm").serializeJson();
      $('#ksjhlist').datagrid('load', formdata);
    }

    //新增
    function cmdadd() {
      createmodalwindow("新增物资维护", 515, 400, '${baseurl}ksjh/addksjh.do', 'no');
    }

    //删除 统一用form
    function cmdremove() {
      var node = $('#ksjhlist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        deletedevice(node.id);
      }
    }
    //删除的回调函数
    function devicedel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        $('#ksjhlist').datagrid('clearSelections');
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
      var node = $('#ksjhlist').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        var url = '${baseurl}ksjh/editksjh.do?id=' + node.id;
        createmodalwindow("修改物资维护", 515, 420, url, 'no');
      }
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
      $("#startdate").val(_today);
      $("#enddate").val(_today);
    }
  </script>
  <!-- html的静态布局 -->
  <form id="ksjhForm">
    <div class="form clr">
      <p class="form-text">借出时间：</p>
      <input class="Wdate" id="startdate" type="text" name="dstKsjhCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="Wdate" id="enddate" type="text" name="dstKsjhCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">操作类型：</p>
      <label>
        <p class="form-text">
          <input id="checkTyp1" type="radio" name="dstKsjhCustom.oprtTyp" value="" checked="checked"> 全部
        </p>
      </label>
      <label>
        <p class="form-text">
          <input id="checkTyp2" type="radio" name="dstKsjhCustom.oprtTyp" value="0" /> 借出 </p>
      </label>
      <label>
        <p class="form-text">
          <input id="checkTyp3" type="radio" name="dstKsjhCustom.oprtTyp" value="1" /> 借入</p>
      </label>
      <p class="form-text"> &nbsp;&nbsp;归还状态：</p>
      <label>
        <p class="form-text">
          <input id="checkStatus1" type="radio" name="dstKsjhCustom.returnStatus" value="" checked="checked">
          全部</p>
      </label>
      <label>
        <p class="form-text">
          <input id="checkStatus2" type="radio" name="dstKsjhCustom.returnStatus" value="0" /> 未归还 </p>
      </label>
      <label>
        <p class="form-text">
          <input id="checkStatus3" type="radio" name="dstKsjhCustom.returnStatus" value="1" /> 已归还</p>
      </label>
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="querydevice()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="list queryTabs">
      <table id="ksjhlist"></table>
    </div>
  </form>
  <form id="devicedeleteform" action="${baseurl}ksjh/deleteksjh.do" method="post">
    <input type="hidden" id="delete_id" name="id" />
  </form>
</body>

</html>