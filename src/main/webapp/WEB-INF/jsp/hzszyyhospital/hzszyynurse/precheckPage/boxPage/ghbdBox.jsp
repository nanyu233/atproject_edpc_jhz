<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>挂号绑定绑定管理</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="queryjzjl" style="overflow: hidden;">
  <div class="form clr">
    <p class="form-text">日期：</p>
    <input class="input-date Wdate" id="startDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <p class="form-text">-</p>
    <input class="input-date Wdate" id="endDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd',isShowClear:false,readOnly:true})">
    <p class="form-text">患者姓名：</p>
    <input id="brxm" type="text" class="input-wth">
    <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getDataGrid()">查询</a>
  </div>
  <div class="jzjltab queryTabs">
    <table id="tabList"></table>
  </div>
  <script>
  $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          getDataGrid();
      }
    });
    
    function getDataGrid() {
   		var jzxhOld = "${jzxhOld}";
   		if(jzxhOld){
   			$('#brxm').val("${cstNam}");
   		}
      var _height = 0.975 * $(document).height() - 26;
      $("#tabList").height(_height);
      $('#tabList').datagrid({
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: '${baseurl}his/findRczGhxx.do',
        idField: 'rczId',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}first.do";
            });
          }
          return data;
        },
        queryParams: {
          'startdate': $('#startDate').val(),
          'enddate': $('#endDate').val(),
          'hspemginfCustom.mpi': "${mpi}",
          'hspemginfCustom.jzxhOld': jzxhOld,
          'brxm':$('#brxm').val(),
        },
        loadMsg: '',
        columns: [[{
          field: 'rczId',
          title: '编号 ',
          hidden: true,
        }, {
          field: 'mpi',
          title: '病历号 ',
          width: getWidth(0.07),
        }, {
          field: 'brxm',
          title: '病人姓名',
          width: getWidth(0.07)
        }, {
          field: 'ghsjStr',
          title: '挂号时间',
          width: getWidth(0.13)
        }, {
          field: 'jzxh',
          title: '就诊次数',
          width: getWidth(0.07)
        }, {
          field: 'sex',
          title: '性别',
          width: getWidth(0.03),
          formatter: function (value, row, index) {
            if (value =='1') {
              return '男';
            }else if(value =='2'){
            	return '女';
            }
          }
        }, {
          field: 'ghks',
          title: '挂号科室',
          width: getWidth(0.08)
        },{
          field: 'lxfs',
          title: '联系方式',
          width: getWidth(0.12)
        },  {
          field: 'sfzh',
          title: '身份证号',
          width: getWidth(0.20)
        }, {
          field: 'csrqStr',
          title: '出生日期',
          width: getWidth(0.11),
        }, {
          field: 'opt1',
          title: '操作',
          width: getWidth(0.08),
          styler: function (value, row, index) {
            return "text-align: center;";
          },
          formatter: function (value, row, index) {
            return "<a href=javascript:cmdPrecheck('" + row.rczId + "')>关联</a>"
          }
        }]],
        pagination: true,
        rownumbers: true,
        pageList: [10, 20, 30],
        toolbar: [],
        onDblClickRow: function (rowIndex, rowData) {
          cmdPrecheck();
        },
      });
    }
    
    function cmdPrecheck() {
      var rows = $('#tabList').datagrid('getSelected');
      if (GridUtils.checkChecked(rows)) {
	    var vm = parent.vm;
        // 向父页面基本信息赋值
        vm.patientMsg.mpi = rows.mpi;
        if(vm.patientMsg.cstNam != rows.brxm){
         _confirmMsg = '<font color="red">关联患者与预检患者姓名不一致'+vm.patientMsg.registerTimeStr+'，</font>确定关联吗？';
        	 _confirm(_confirmMsg, null, function () {
        	 	    vm.patientMsg.cstNam = rows.brxm;
			        vm.patientMsg.cstSexCod = rows.sex == '1' ? '0' : '1';
			        vm.patientMsg.bthDat = rows.csrqStr;
			      //  vm.patientMsg.cstAge = rows.nl;
			        vm.patientMsg.pheNbr = rows.lxfs;
			        vm.patientMsg.idNbr = rows.sfzh;
			        vm.patientMsg.jzxh = rows.jzxh;
			        vm.patientMsg.adtA01 = rows.adtA01;
			        vm.patientMsg.rczId = rows.rczId;
			        vm.patientMsg.registerTimeStr = rows.ghsjStr;
			        parent.closemodalwindow();
        	 });
        }else{
         			vm.patientMsg.cstNam = rows.brxm;
			        vm.patientMsg.cstSexCod = rows.sex == '1' ? '0' : '1';
			        vm.patientMsg.bthDat = rows.csrqStr;
			      //  vm.patientMsg.cstAge = rows.nl;
			        vm.patientMsg.pheNbr = rows.lxfs;
			        vm.patientMsg.idNbr = rows.sfzh;
			        vm.patientMsg.jzxh = rows.jzxh;
			        vm.patientMsg.adtA01 = rows.adtA01;
			        vm.patientMsg.rczId = rows.rczId;
			        vm.patientMsg.registerTimeStr = rows.ghsjStr;
			        parent.closemodalwindow();
        }
       
      }
    }

    function getWidth(proportion) {
      var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串
      var width = '';
      if (userAgent.indexOf("Chrome") > -1) {
        width = $(document).width();
      } else {
        width = $(document).width() - 50;
      }
      return Math.round(proportion * width);
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
      var _preWeek = new Date().getTime() - 24 * 60 * 60 * 1000;
      $("#startDate").val(publicFun.timeFormat(new Date(_preWeek), 'yyyy/MM/dd'));
      $("#endDate").val(_today);
    }

    $(document).resize(function () {
      var height = 0.975 * $(document).height() - 26;
      $("#tabList").height(height);
    })

    var isOpen = 1, _seqCurrent = '', currentRow = null;
    $(function () {
      // if (!parent.$('#qtsjSeq').val()) {
      //   setTime();
      // } else {
      //   _seqCurrent = parent.$('#qtsjSeq').val();
      // }
      setTime();
      getDataGrid();
    })
  </script>
</body>

</html>