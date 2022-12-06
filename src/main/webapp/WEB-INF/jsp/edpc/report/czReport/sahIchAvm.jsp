<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<title>颅内出血(ICH)、蛛网膜下腔出血(SAH)、动静脉畸形(AVM) 患者入院时病情严重程度评估率</title>
	<base href="<%=basePath%>" target="_self">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" href="css/common/highcharts.css" type="text/css" />
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script type="text/javascript" src="lib/highcharts5.0.7/code/highcharts.js"></script>
	<script type="text/javascript" src="lib/highcharts5.0.7/code/modules/exporting.js"></script>
	<!-- 
	<script src="lib/easyui1.3/plugins/datagrid-transposedview.js" type="text/javascript"></script>
	 -->
	<style type="text/css">
		.dashboard {
			width: 100%;
			margin: 0 auto;
		}
		.dashboard iframe {
			width: 99%;
			height: 105%;
			margin-top: -150px;
		}
		#querymqform {
			position: relative;
			margin-top: -10px;
		}
	</style>

</head>

<body>
<form id="querymqform">
	<!-- html的静态布局 -->
	<!-- 查询条件 -->
	<div class="m-b5">
		<div class="m-t10 div_h">
			<ul class="querylist-ul form_hc">
				<li>
					<input type="text" class="input-base short-right Wdate"
						   id="emg_startdate" name="startDate"
						   onfocus="new WdatePicker({dateFmt:'yyyy/MM'})"> 至
					<input type="text" class="input-base short-right Wdate"
						   id="emg_enddate" name="endDate"
						   onfocus="new WdatePicker({dateFmt:'yyyy/MM'})" />
					<span class="f-left">&nbsp;查询时间：</span>
				</li>
				<li class="queryuser-btn m-l5">
					<a class="easyui-linkbutton" iconCls="icon-search" id="btn"
					   onclick="medianquery()">查询</a>
				</li>
			</ul>
		</div>
	</div>
</form>
<div class="dashboard" id="iframe-div">
	<iframe id="ciframe"></iframe>
</div>


<script type="text/javascript">
	//enter按键默认触发查询
	$(document).keydown(function(event) {
		switch (event.keyCode) {
			case 13:
				medianquery()
		}
	});

	//入口函数
	$(function() {
		setTime();
	});

	//初始化查询寻条件
	function setTime() {
		var _startdate;
		var _enddate;
		var _data;
		var _dataYY, _dataMM, _dataDD;
		_data = new Date();
		_dataYY = _data.getFullYear();
		_dataMM = _data.getMonth() + 1;
		_dataMM = _dataMM >= 10 ? _dataMM.toString() : "0" + _dataMM;
		_dataDD = _data.getDate();
		_dataDD = _dataDD >= 10 ? _dataDD.toString() : "0" + _dataDD;
		_startdate = _dataYY + "/" + "01";
		_enddate = _dataYY + "/" + "12";
		$("#emg_startdate").val(_startdate);
		$("#emg_enddate").val(_enddate);
		medianquery();
	};

	//查询方法
	function medianquery() {
		var start = $("#emg_startdate").val();
		var end = $("#emg_enddate").val();

		var _ifrmSrc = 'http://192.168.3.26:8080/superset/dashboard/4/?native_filters_key=GNksxcUT30qh4ZRi5n2WZTMQRGHgPHhdc0v5aEVU4287EFHG8i20sOcnHn7ajV-2';
		_ifrmSrc += ('&startdate=' + start);
		_ifrmSrc += ('&enddate=' + end)
		$('#ciframe').attr("src", _ifrmSrc);
	}

</script>
</body>

</html>