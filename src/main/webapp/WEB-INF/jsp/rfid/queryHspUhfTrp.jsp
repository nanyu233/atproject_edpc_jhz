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
  <title>UHF应答器管理</title>
</head>

<body class="queryHspUhfTrp">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryHspUhfTrp();
      }
    });

    function reload() {
      $('#hspUhfTrpList').datagrid('reload');
    }

    function cmdedit() {
      var row = $('#hspUhfTrpList').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        createmodalwindow("修改UHF应答器信息", 580, 530, '${baseurl}rfid/editHspUhfTrp.do?trpSeq=' + row.trpSeq);
      }
    }

    function cmdadd() {
      createmodalwindow("新增UHF应答器", 580, 530, '${baseurl}rfid/addHspUhfTrp.do');
    }

    function cmddel() {
      var row = $('#hspUhfTrpList').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        _confirm('确定删除该数据吗？', null, function () {
          $("#delete_trpSeq").val(row.trpSeq);
          jquerySubByFId('hspUhfTrpDeleteForm', hspUhfTrpDel_callback, null, "json");
        });
      }
    }

    // 生成列表
    function getDataGird() {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

      function callBack(toolbar_v) {
        $('#hspUhfTrpList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}rfid/queryHspUhfTrpResult.do',
          idField: 'trpSeq',
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [15, 30, 50],
          toolbar: toolbar_v
        });
      }
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
      $("#hspUhfTrpList").height(height);
      //datagrid列定义
      var columns_v = [
        [
          {
            align: 'left',
            field: 'trpSeq',
            title: '标签序号 '
          }, {
            align: 'left',
            field: 'trpId',
            title: '标签编号 '
          }, {
            align: 'left',
            field: 'trpNam',
            title: '标签名称'
          }, {
            align: 'left',
            field: 'trpTyp',
            title: '标签类型',
            formatter: function (value, row, index) {
              if (value == 1) {
                return "胸痛";
              } else if (value == 2) {
                return "卒中";
              } else {
                return "创伤";
              }
            }
          }, {
            align: 'left',
            field: 'trpCls',
            title: '标签分类',
            formatter: function (value, row, index) {
              if (value == 1) {
                return "抗人体硅胶无源手环";
              } else {
                return "纸质抗菌腕带";
              }
            }
          }, {
            align: 'left',
            field: 'typPic',
            title: '类型图片'
          }, {
            align: 'left',
            field: 'trpSta',
            title: '设备状态',
            formatter: function (value, row, index) {
              if (value == 1) {
                return "使用";
              } else {
                return "未使用";
              }
            }
          }, {
            align: 'left',
            field: 'bidFlg',
            title: '是否绑定',
            formatter: function (value, row, index) {
              if (value == 1) {
                return "已绑定";
              } else {
                return "未绑定";
              }
            }
          }, {
            align: 'left',
            field: 'bidMan',
            title: '绑定用户'
          }, {
            align: 'left',
            field: 'bidPat',
            title: '绑定患者'
          }, {
            align: 'left',
            field: 'patNam',
            title: '患者名称'
          }, {
            align: 'left',
            field: 'unbMan',
            title: '解绑用户'
          }, {
            align: 'left',
            field: 'bidTim',
            title: '绑定时间',
            formatter: function (value, row, index) {
              if(null==value){
                return '';
              }else{
                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
              }
            }
          }, {
            align: 'left',
            field: 'unbTim',
            title: '解绑时间',
            formatter: function (value, row, index) {
              if(null==value){
                return '';
              }else{
                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
              }
            }
          }, {
            align: 'left',
            field: 'crtUsrNam',
            title: '创建用户名称'
          }, {
            align: 'left',
            field: 'crtTim',
            title: '创建时间',
            formatter: function (value, row, index) {
              if(null==value){
                return '';
              }else{
                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
              }
            }
          }, {
            align: 'left',
            field: 'modUsrNam',
            title: '修改用户名称'
          }, {
            align: 'left',
            field: 'modTim',
            title: '修改时间',
            formatter: function (value, row, index) {
              if(null==value){
                return '';
              }else{
                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
              }
            }
          }
        ]
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
    function queryHspUhfTrp() {
      var formdata = $("#hspUhfTrpQueryForm").serializeJson();
      $('#hspUhfTrpList').datagrid('load', formdata);
    }

    //删除 统一用form
    function deleteHspUhfTrp(trpSeq) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_trpSeq").val(trpSeq);
        jquerySubByFId('hspUhfTrpDeleteForm', hspUhfTrpDel_callback, null, "json");
      });
    }
    //删除的回调函数
    function hspUhfTrpDel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        queryHspUhfTrp();
      }
    }

    //修改UHF应答器信息
    function editHspUhfTrp(trpSeq) {
      //打开修改窗口
      createmodalwindow("修改UHF应答器信息", 515, 280, '${baseurl}rfid/editHspUhfTrp.do?trpSeq=' + trpSeq);
    }
  </script>
  <!-- html的静态布局 -->
  <form id="hspUhfTrpQueryForm">
    <!-- 查询条件 -->
    <div class="form clr">
      <p class="form-text">设备名称：</p>
      <input id="hspUhfTrp_trpNam" type="text" name="hspUhfTrpCustom.trpNam" />
      <input class="hidden" type="hidden" id="parentid" name="parentid" value="${parentid }" />
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryHspUhfTrp()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="list queryTabs">
      <table id="hspUhfTrpList"></table>
    </div>
  </form>
  <form id="hspUhfTrpDeleteForm" action="${baseurl}rfid/deleteHspUhfTrp.do" method="post">
    <input type="hidden" id="delete_trpSeq" name="trpSeq" />
  </form>
</body>

</html>