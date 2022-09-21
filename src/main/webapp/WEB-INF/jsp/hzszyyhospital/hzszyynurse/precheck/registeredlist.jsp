<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
  <title>已挂号列表</title>
</head>

<body class="querydevice">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryRegister();
      }
    });

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    function reload() {
      $('#registeredList').datagrid('reload');
    }

    function generateCols() {
      var columns_v = [
        [{
          field: 'zyh',
          title: '门诊号',
          width: getWidth(0.12)
        }, {
          field: 'xm',
          title: '姓名 ',
          width: getWidth(0.12)
        }, {
          field: 'xb',
          title: '性别',
          width: getWidth(0.06)
        }, {
          field: 'csny',
          title: '出生年月',
          width: getWidth(0.12)
        }, {
          field: 'nl',
          title: '年龄',
          width: getWidth(0.06)
        }, {
          field: 'mzrq',
          title: '挂号日期',
          width: getWidth(0.2)
        }, {
          field: 'zlkh',
          title: '就诊卡号',
          width: getWidth(0.18)
        }, {
          field: 'opt1',
          title: '操作',
          width: getWidth(0.08),
          styler: function (value, row, index) {
            return "text-align: center;";
          },
          formatter: function (value, row, index) {
            return "<a href=javascript:cmdPrecheck('" + row.zyh + "')>分诊</a>"
          }
        }]
      ];
      return columns_v;
    }
    function getDataGrid() {
      /* 公司测试环境用，生产环境需要注释 */
      //     	mzrq = '2019-04-11';
      /* 公司测试环境用，生产环境需要注释 */
      var height = 0.94 * ($("body").height());
      $("#registeredList").height(height);
      var today = publicFun.timeFormat(new Date(), 'yyyy-MM-dd')
      $("#mzrq").val(today);
      $('#registeredList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        queryParams: {
          "vHemsGhlbCustom.xm": $('#xm').val(),
          "vHemsGhlbCustom.mzrq": $('#mzrq').val()
        },
        url: '${baseurl}his/queryregisteredlist.do',
        idField: 'zyh',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: generateCols(),
        pagination: true,
        rownumbers: true,
        pageList: [15, 30, 50],
        toolbar: [],
        onDblClickRow: function (rowIndex, rowData) {
          cmdPrecheck()
        },
        rowStyler: function (index, row) {
          // 此处可以添加条件
          if (row.status == '0') {
            return 'color:red;';
          }
        }
      });
    }

    $(function () {
      getDataGrid();
    })

    //查询方法
    function queryRegister() {
      var formdata = $("#registerQueryForm").serializeJson();
      $('#registeredList').datagrid('load', formdata);
      $('#registeredList').datagrid('clearSelections');
    }

    //删除 统一用form
    function confirm() {
      var node = $('#registeredList').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        var vm = parent.vm;
        vm.patientMsg.vstCad = node.jzkh;
        vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        var zyh = vm.patientMsg.vstCad,
          zlkh = '';
        if (zyh === '') {
          zlkh = parent.XCXGetCardSB();
          if (zlkh === '') {
            return false
          }
        }
        parent.RegularlyGetHZXX(0, zyh, zlkh, "1");
        parent.closemodalwindow();
      }
    }

    function cmdPrecheck() {
      var rows = $('#registeredList').datagrid('getSelected');
      if (GridUtils.checkChecked(rows)) {
        var vm = parent.vm;
        // 向父页面基本信息赋值
        vm.patientMsg.mzrq = publicFun.timeFormat(rows.mzrq, 'yyyy/MM/dd hh:mm:ss');
        vm.patientMsg.vstCad = rows.zlkh;
        vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        vm.patientMsg.cstNam = rows.xm;
        vm.patientMsg.cstSexCod = rows.xb == '男' ? '0' : '1';
        vm.patientMsg.bthDat = publicFun.timeFormat(rows.csny, 'yyyy/MM/dd');
        vm.patientMsg.cstAge = rows.nl;
        vm.patientMsg.pheNbr = rows.dwdh;
        vm.patientMsg.cstAdr = rows.jtdz;
        parent.closemodalwindow();
      }
    }

  </script>
  <!-- html的静态布局 -->
  <form id="registerQueryForm">
    <div class="form clr">
      <p class="form-text">姓名：</p>
      <input id="xm" name="vHemsGhlbCustom.xm" type="text" />
      <input class="hidden" id="mzrq" name="vHemsGhlbCustom.mzrq" type="text" />
      <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryRegister()">查询</a>
      <a href="javascript:;" class="easyui-linkbutton hidden" onclick="cmdPrecheck()">确定</a>
    </div>
  </form>
  <!-- 查询列表 -->
  <div class="list queryTabs">
    <table id="registeredList" style="height: 440px;"></table>
  </div>
</body>

</html>