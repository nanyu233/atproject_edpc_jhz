<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>会诊登记汇总表</title>
  <script type="text/javascript">
  	var pageName = '${pageName}';
  </script>
</head>

<body class="queryhzdjhz">
  <script type="text/javascript">
    var flag = null;
    //datagrid列定义
    var columns_v = [
      [{
        field: 'CONSULTATION_RECORDS_SEQ',
        title: 'CONSULTATION_RECORDS_SEQ',
        width: getWidth(0.2),
        hidden: 'true',
      }, {
        field: 'invitationDateStr',
        sortable: true,
        title: '会诊日期',
        width: getWidth(.07),
        formatter: function (value, row, index) {
          return value ? value.substring(0, 10).replace(/\//g, '-') : '';
        }
      }, {
        field: 'cstNam',
        sortable: true,
        width: getWidth(0.05),
        title: '病人姓名'
      }, {
        field: 'mpi',
        sortable: true,
        width: getWidth(0.05),
        title: '病历号'
      }, {
        field: 'cstSexCod',
        sortable: true,
        width: getWidth(0.03),
        title: '性别'
      }, {
        field: 'invitationDate',
        title: '邀请时间',
        width: getWidth(.1),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
        }
      }, {
        field: 'consultationDateStr',
        width: getWidth(.1),
        title: '签到时间',
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
        }
      }, {
        field: 'replyCreateDate',
        width: getWidth(.1),
        title: '会诊时间',
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
        }
      }, {
        field: 'invitationDep',
        sortable: true,
        width: getWidth(.08),
        title: '会诊科室'
      }, {
        field: 'replyDocName',
        width: getWidth(.07),
        title: '会诊医生'
      }, {
        field: 'consultationOpinion',
        width: getWidth(.33),
        title: '会诊意见'
      }, {
        field: 'applyDocName',
        width: getWidth(.08),
        title: '申请人'
      }]
    ];

    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          getAllTab();
      }
    });

    $(function () {
  	  init();
      getAllTab();
    })

	function init() {
      publicFun.httpServer({url: '${baseurl}zyyxtpg/findEmgInfByEmgSeq.do', isNoLoad: true}, { emgSeq: '${emgSeqCr}', date: new Date().toTimeString()}, function (res) {
        var _emgObjInfo = res.resultInfo.sysdata.hspemginfCustom;
        if (_emgObjInfo.sqlStaCod == 6) {
          var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
          $("#startdate_range").val(_today);
          $("#startdate").val(_today);
          $("#enddate").val(_today);
        } else {
          $("#startdate_range").val(publicFun.timeFormat(new Date(_emgObjInfo.emgDat), 'yyyy/MM/dd'));
          $("#startdate").val(publicFun.timeFormat(new Date(_emgObjInfo.emgDat), 'yyyy/MM/dd'));
          $("#enddate").val(publicFun.timeFormat(new Date(_emgObjInfo.sqlDatNew), 'yyyy/MM/dd'));
        }
        getTabList();
      }, function (res) {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
        $("#startdate_range").val(_today);
        $("#startdate").val(_today);
        $("#enddate").val(_today);
        getTabList();
      })
    }

    function reload() {
      $('#hzqk').datagrid('reload');
    }
    //加载datagrid
    function getDataGrid() {
      var height = 0.975 * ($("#tabs", parent.parent.parent.document).height() - 28 - 29) - 27 - 29;
      $("#hzqk").height(height);
		$.each(toolbar_v, function (idx, val) {
          if (val.id == "edit") {
            flag = 0;
          }
        });
        $('#hzqk').datagrid({
          nowrap: false,
          striped: true,
          singleSelect: true,
          url: '${baseurl}qjs/queryhzdjhz_result.do',
          idField: 'CONSULTATION_RECORDS_SEQ',
          loadMsg: '',
          columns: columns_v,
          toolbar: toolbar_v(),
          pagination: true,
          loadFilter: function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = "${baseurl}/first.do";
              });
            }
            return data;
          },
          rownumbers: true,
          queryParams: getParams(),
          pageList: [20, 30, 50]
        });
      
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    
     function getAllTab() {
      publicFun.httpServer({url: '${baseurl}zyyxtpg/findEmgInfByEmgSeq.do', isNoLoad: true}, { emgSeq: '${emgSeqCr}', date: new Date().toTimeString()}, function (res) {
        var _emgObjInfo = res.resultInfo.sysdata.hspemginfCustom;
        console.log(_emgObjInfo)
        
        getDataGrid();
      }, function (res) {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
        $("#startdate_range").val(_today);
        $("#startdate").val(_today);
        $("#enddate").val(_today);
        getDataGrid();
      })
    } 
    
    //获取传给后端的参数
    function getParams() {
      var replyDocName = $('#replyDocName').val(),
        emgSeqCr = '${emgSeqCr}',
        invitationDepStr = $('#invitationDepStr').val();
      var _qdFlg = '';
      if ($('#lqCount').attr('checked')) {
        _qdFlg = '0';
      }
      if ($('#notLqCount').attr('checked')) {
        _qdFlg = '1';
      }
	  var startdate = $('#startdate_range').val();
	  var enddate = $('#enddate').val();
      console.log("传参的start---"+$("#startdate_range").val());
      console.log("传参的end---"+$("#enddate").val());
     
     
      var queryParams = {
        'recordFlag': 'hzdj',
        'querytype': 'range',
        'startdate': startdate,
        'enddate': enddate,
        'hspConsultationRecordsCustom.emgSeqCr':emgSeqCr,
        'pageName':pageName,
        'hspConsultationRecordsCustom.replyDocName': replyDocName,
        'hspConsultationRecordsCustom.invitationDepStr': invitationDepStr,
        'hspConsultationRecordsCustom.qdFlg':_qdFlg
      };
      return queryParams;
    }
    
    
    
	//工具栏
	function toolbar_v(){
		var toolbar_v;
		if(pageName=='hzmxlb'){
			toolbar_v = [{
      			id: '',
      			text: '导出',
     			iconCls: 'icon-redo',
      			handler: function () {
        			cmdrecordExport();
      			}
    		}];
		}else{
			toolbar_v = [{
      			id: '',
      			text: '会诊签到',
      			iconCls: 'icon-edit',	
      			handler: function () {
        			cmdHzqd();
      			}
    		}
    		];
		}
		return toolbar_v;
	}

    function cmdHzqd() {
      var node = $('#hzqk').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        createmodalwindow(node.cstNam + '-会诊签到', 1030, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + node.emgSeqCr + '&conRecordsSeq=' + node.consultationRecordsSeq + '&hzType=qd');
      }
    }

	 function setSingleCheck(idName, className) {
      if ($('#' + idName)[0].checked) {
        $('.' + className).attr('checked', false);
        $('#' + idName).attr('checked', true);
      }
    }
	
    
  </script>
  <form id="hzdjhzform" action="${baseurl}qjs/exporthzdj_result.do" method="post">
    <input type="hidden" name="recordFlag" value="hzdj" />
    <div class="form clr">
      
      <p class="form-text">会诊日期：</p>
      <input type="hidden" id="startdate" name="startdate">
      <input type="text" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range" name="startdate_range" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <div id="rangeDiv">
        <p class="form-text">-</p>
        <input type="text" class="input-date Wdate" id="enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      </div>
      <p class="form-text">会诊医生：</p>
      <input type="text" id="replyDocName" name="hspConsultationRecordsCustom.replyDocName" />
      <p class="form-text">会诊科室：</p>
      <input type="text" id="invitationDepStr" name="hspConsultationRecordsCustom.invitationDepStr" />
      <p class="form-text">
        &nbsp;&nbsp;
        <input class="qjsBedType" id="lqCount" type="checkbox" value="0" onclick="setSingleCheck('lqCount', 'qjsBedType')" onchange="getDataGrid()">
        <label for="lqCount">待签到</label>
      </p>
      <p class="form-text">
        &nbsp;&nbsp;
        <input class="qjsBedType" id="notLqCount" type="checkbox" value="1" onclick="setSingleCheck('notLqCount', 'qjsBedType')"
          onchange="getDataGrid()">
        <label for="notLqCount">已签到</label>
      </p>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getAllTab()">查询</a>
    </div>
  </form>
  <div class="m-l2 queryTabs">
    <table id="hzqk"></table>
  </div>
</body>

</html>