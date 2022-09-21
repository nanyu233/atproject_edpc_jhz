<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
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
        width: getWidth(.07),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
        }
      }, {
        field: 'consultationDateStr',
        width: getWidth(.07),
        title: '签到时间',
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(new Date(value), 'yyyy-MM-dd hh:mm') : ''
        }
      }, {
        field: 'replyCreateDate',
        width: getWidth(.07),
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
          hzdjhzquery();
      }
    });

    $(function () {
      setTime("day", "yyyy/MM/dd");
      chooseDate();
      getDataGrid();
    })

    function reload() {
      $('#hzqk').datagrid('reload');
    }
    //加载datagrid
    function getDataGrid() {
      var height = 0.975 * ($("#tabs", parent.document).height() - 28 - 24);
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

    function chooseDate() {
      $("#chooseType").change(function () {
        var queryType = $("#chooseType").val();
        if (queryType == 'range') {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + queryType).css({ "display": "block" });
          $("#enddate").css({ "display": "block" });
          $("#rangeDiv").css({ "display": "block" });
        } else {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + queryType).css({ "display": "block" });
          $("#rangeDiv").css({ "display": "none" });
        }
        var format = $("#startdate_" + queryType).attr("format");
        pageName = '';
        setTime(queryType, format);
      });
    }

    //获取传给后端的参数
    function getParams() {
      var queryType = $("#chooseType").val(),
        replyDocName = $('#replyDocName').val(),
        invitationDepStr = $('#invitationDepStr').val();
      var _qdFlg = '';
      var startdate = $("#startdate_" + queryType).val();
      if (startdate == null || startdate == "") {
        publicFun.alert('查询时间不能为空');
        return false;
      }
      if ($('#lqCount').attr('checked')) {
        _qdFlg = '0';
      }
      if ($('#notLqCount').attr('checked')) {
        _qdFlg = '1';
      }
      var enddate = $("#enddate").val();
      var queryParams = {
        'recordFlag': 'hzdj',
        'querytype': queryType,
        'startdate': startdate,
        'enddate': enddate,
        'pageName':pageName,
        'hspConsultationRecordsCustom.replyDocName': replyDocName,
        'hspConsultationRecordsCustom.invitationDepStr': invitationDepStr,
        'hspConsultationRecordsCustom.qdFlg':_qdFlg
      };
      return queryParams;
    }

    //据插叙类型设置初始时间
    function setTime(type, format) {
	  var today = publicFun.timeFormat(new Date(), format);
	  if(pageName=='hzmxlb'){
	  	setTimeForhztj();
	  }else{
	  	$("#startdate_" + type).val(today);
      	$("#enddate").val(today);
	  }
    }
    
    //急诊科会诊院内统计 时间初始化
    function setTimeForhztj(){
    	var queryType ='${queryType}'
	  	if(queryType=='day'){
			type = 'day';
			format = 'yyyy/MM/dd';
	  	}else if(queryType == 'month'){
	  		type = 'month';
			format = 'yyyy/MM';
	  	}else {
	  		type = 'range';
	  		format = 'yyyy';
	  	}
	  	
	  	$("#chooseType").val(type);
	  	if (type == 'range') {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + type).css({ "display": "block" });
          $("#enddate").css({ "display": "block" });
          $("#rangeDiv").css({ "display": "block" });
        } else {
          $(".Wdate").css({ "display": "none" });
          $("#startdate_" + type).css({ "display": "block" });
          $("#rangeDiv").css({ "display": "none" });
        }
        if(queryType== 'year' || queryType =='halfyear'){
       		today = publicFun.timeFormat('${startdate}', format);
       		today += "/01/01";
       		var enddate = publicFun.timeFormat('${startdate}', format);
       		enddate += "/12/31" 
        	$("#startdate_" + type).val(today);
      		$("#enddate").val(enddate);
        }else{
        	today = publicFun.timeFormat('${startdate}', format);
	  		$("#startdate_" + type).val(today);
      		$("#enddate").val(today);
        }
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
      			text: '导出',
     			iconCls: 'icon-redo',
      			handler: function () {
        			cmdrecordExport();
      			}
    		},{
      			id: '',
      			text: '会诊答复',
      			iconCls: 'icon-add',	
      			handler: function () {
        			cmdReply();
      			}
    		},{
      			id: '',
      			text: '修改',
      			iconCls: 'icon-edit',
      			handler: function () {
        			cmdEdit();
      		}
    		},{
      			id: '',
      			text: '删除',
      			iconCls: 'icon-cancel',
      			handler: function () {
        			cmdDelete();
      			}
      		},{
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

    //查询方法
    function hzdjhzquery() {
      getDataGrid();
    }

    function cmdrecordExport() {
      $('input[name=lookType][id=card]').remove('checked');
      var queryType = $("#chooseType").val();
      var startdate = $("#startdate_" + queryType).val();
      $("#startdate").val(startdate);
      var enddate = $("#enddate").val();
      $("#startdate").val(startdate);
      var _rtnFlg = publicFun.searchTime(startdate, enddate);
      if (_rtnFlg == false) {
        return false;
      }
      jquerySubByFId('hzdjhzform', exportHZDJ_callback, null, "json");
    }

    function exportHZDJ_callback(data) {
      message_alert(data);
    }

    function cmdReply() {
      var node = $('#hzqk').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        createmodalwindow(node.cstNam + '-会诊答复', 1030, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + node.emgSeqCr + '&conRecordsSeq=' + node.consultationRecordsSeq + '&hzType=reply');
      }
    }

    function cmdEdit() {
      var node = $('#hzqk').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        createmodalwindow(node.cstNam + '-会诊登记修改', 1030, 500, '${baseurl}consultation/tabhzdj.do?emgSeq=' + node.emgSeqCr + '&conRecordsSeq=' + node.consultationRecordsSeq + '&hzType=edit');
      }
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
	
    function cmdDelete() {
      var node = $('#hzqk').datagrid('getSelected');
      if (GridUtils.checkChecked(node)) {
        _confirm('确定删除该数据吗？', null, function () {
          publicFun.httpServer({ url: '${baseurl}consultation/delConsultation.do' }, { 'consultationRecordsSeq': node.consultationRecordsSeq }, function (data) {
            if (data.resultInfo && data.resultInfo.messageCode == '109') {
              message_alert(data, function () {
                window.location.href = '${baseurl}/first.do';
              });
              return false;
            }
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
              parent.closemodalwindow();
              $('#hzqk').datagrid('reload');
            }
          })
        });
      }
    }
  </script>
  <form id="hzdjhzform" action="${baseurl}qjs/exporthzdj_result.do" method="post">
    <input type="hidden" name="recordFlag" value="hzdj" />
    <div class="form clr">
      <p class="form-text">查询方式：</p>
      <select id="chooseType" name="querytype">
        <option value="day" selected="selected">天</option>
        <option value="month">月</option>
        <option value="range">范围</option>
      </select>
      <p class="form-text">会诊日期：</p>
      <input type="hidden" id="startdate" name="startdate">
      <input type="text" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_day" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startdate_month" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
      <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range"
        onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <div id="rangeDiv" style="display: none;">
        <p class="form-text">-</p>
        <input type="text" style="display: none;" class="input-date Wdate" id="enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="hzdjhzquery()">查询</a>
    </div>
  </form>
  <div class="m-l2 queryTabs">
    <table id="hzqk"></table>
  </div>
</body>

</html>