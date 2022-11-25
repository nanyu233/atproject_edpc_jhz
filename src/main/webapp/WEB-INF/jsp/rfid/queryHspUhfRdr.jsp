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
  <title>UHF读写器管理</title>
</head>

<body class="queryHspUhfRdr">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryHspUhfRdr();
      }
    });

    function reload() {
      $('#hspUhfRdrList').datagrid('reload');
    }

    function cmdedit() {
      var row = $('#hspUhfRdrList').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        createmodalwindow("修改UHF读写器信息", 580, 730, '${baseurl}rfid/editHspUhfRdr.do?rdrSeq=' + row.rdrSeq);
      }
    }

    function cmdadd() {
      createmodalwindow("新增UHF读写器", 580, 730, '${baseurl}rfid/addHspUhfRdr.do');
    }

    function cmddel() {
      var row = $('#hspUhfRdrList').datagrid("getSelected");
      if (GridUtils.checkChecked(row)) {
        _confirm('确定删除该数据吗？', null, function () {
          $("#delete_rdrSeq").val(row.rdrSeq);
          jquerySubByFId('hspUhfRdrDeleteForm', hspUhfRdrDel_callback, null, "json");
        });
      }
    }


    // 生成列表
    function getDataGird() {
      var toolbar_v;
      publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

      function callBack(toolbar_v) {
        $('#hspUhfRdrList').datagrid({
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: '${baseurl}rfid/queryHspUhfRdrResult.do',
          idField: 'rdrSeq',
          loadMsg: '',
          columns: columns_v,
          pagination: true,
          rownumbers: true,
          pageList: [15, 30, 50],
          toolbar: toolbar_v
        });
      }
      var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
      $("#hspUhfRdrList").height(height);
      //datagrid列定义
      var columns_v = [
        [
          {
            align: 'left',
            field: 'rdrSeq',
            title: '设备序号 '
          }, {
            align: 'left',
            field: 'rdrId',
            title: '设备编号 '
          }, {
            align: 'left',
            field: 'rdrNam',
            title: '设备名称'
          }, {
            align: 'left',
            field: 'rdrTyp',
            title: '设备类型',
            formatter: function (value, row, index) {
              if (value == 0) {
                return "";
              } else if (value == 1) {
                return "读写一体机";
              } else {
                return "读写器";
              }
            }
          }, {
            align: 'left',
            field: 'mtrTyp',
            title: '监测点类型',
            formatter: function (value, row, index) {
               if (value != null && value.length === 3) {//slice*/
                 return (value.slice(0,1)==="1"?"胸痛":"")
                        + (value.slice(1,2)==="1"?"卒中":"")
                        + (value.slice(2,3)==="1"?"创伤":"")

               } else {
                 return "";
               }
            }
          }, {
            align: 'left',
            field: 'mtrCod',
            title: '监测点参考码'
          }, {
            align: 'left',
            field: 'rdrLoc',
            title: '设备位置'
          }, {
            align: 'center',
            field: 'rdrSta',
            title: '设备是否使用',
            formatter: function (value, row, index) {
              if(value=='1'){
                return '<input type="checkbox" disabled="disabled" checked="checked">'
              }else{
                return '<input type="checkbox" disabled="disabled">'
              }
             /* if (value == 1) {
                return "使用";
              } else {
                return "未使用";
              }*/
            }
          }, {
            align: 'left',
            field: 'rdrPar',
            title: '设备参数'
          }, {
            align: 'left',
            field: 'rdrDepNam',
            title: '使用科室'
          }, {
            align: 'left',
            field: 'buyDat',
            title: '购置日期',
            formatter : function(value, row, index) {
              if(null==value){
              }else{
                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
              }
            }
          }, {
            align: 'left',
            field: 'fixDat',
            title: '安装日期',
            formatter: function (value, row, index) {
              if(null==value){
                return '';
              }else{
                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
              }
            }
          }, {
            align: 'left',
            field: 'fixMan',
            title: '安装人员'
          }, {
            align: 'left',
            field: 'mntCom',
            title: '运维公司'
          }, {
            align: 'left',
            field: 'mntMan',
            title: '运维人员'
          }, {
            align: 'left',
            field: 'mntTel',
            title: '运维电话'
          }, {
            align: 'center',
            field: 'tcpFlg',
            title: '是否有线网',
            formatter: function (value, row, index) {
              if(value=='1'){
                return '<input type="checkbox" disabled="disabled" checked="checked">'
              }else{
                return '<input type="checkbox" disabled="disabled">'
              }
             /* if (value == 1) {
                return "是";
              } else {
                return "否";
              }*/
            }
          }, {
            align: 'center',
            field: 'wifFlg',
            title: '是否无线网',
            formatter: function (value, row, index) {
              if(value=='1'){
                return '<input type="checkbox" disabled="disabled" checked="checked">'
              }else{
                return '<input type="checkbox" disabled="disabled">'
              }
             /* if (value == 1) {
                return "是";
              } else {
                return "否";
              }*/
            }
          }, {
            align: 'left',
            field: 'rdrIp',
            title: 'ip地址'
          }, {
            align: 'left',
            field: 'rdrPort',
            title: 'ip端口'
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
    function queryHspUhfRdr() {
      var formdata = $("#hspUhfRdrQueryForm").serializeJson();
      $('#hspUhfRdrList').datagrid('load', formdata);
    }

    //删除 统一用form
    function deleteHspUhfRdr(rdrSeq) {
      _confirm('确定删除该数据吗？', null, function () {
        $("#delete_rdrSeq").val(rdrSeq);
        jquerySubByFId('hspUhfRdrDeleteForm', hspUhfRdrDel_callback, null, "json");
      });
    }
    //删除的回调函数
    function hspUhfRdrDel_callback(data) {
      message_alert(data);
      var type = data.resultInfo.type;
      if (type == 1) {
        queryHspUhfRdr();
      }
    }

    //修改RFID信息
    function editHspUhfRdr(rdrSeq) {
      //打开修改窗口
      createmodalwindow("修改UHF读写器信息", 515, 280, '${baseurl}rfid/editHspUhfRdr.do?rdrSeq=' + rdrSeq);
    }
  </script>
  <!-- html的静态布局 -->
  <form id="hspUhfRdrQueryForm">
    <!-- 查询条件 -->
    <div class="form clr">
      <p class="form-text">设备名称：</p>
      <input id="hspUhfRdr_rdrNam" type="text" name="hspUhfRdrCustom.rdrNam" />
      <input class="hidden" type="hidden" id="parentid" name="parentid" value="${parentid }" />
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryHspUhfRdr()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="list queryTabs">
      <table id="hspUhfRdrList"></table>
    </div>
  </form>
  <form id="hspUhfRdrDeleteForm" action="${baseurl}rfid/deleteHspUhfRdr.do" method="post">
    <input type="hidden" id="delete_rdrSeq" name="rdrSeq" />
  </form>
</body>

</html>