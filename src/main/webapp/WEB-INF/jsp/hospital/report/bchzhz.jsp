<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}styles/common/querylist.css" />
<title>班次患者汇总报表</title>
</head>

<body class="bchzhz">
    <script type="text/javascript">
     $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
            return false;
            }
        });
     	//刷新
        function reload() {
        	$('#bchzhz').datagrid("reload");
        }
        //加载datagrid
        $(function() {
        	setTime("day","yyyy/MM/dd");
        	chooseDate();
        	getDrid();
        	enterdown();
        });
        
        function enterdown() {
        	//enter按键默认触发查询
            $("#startdate").keyup(function(event) {
                 if (event.keyCode == 13) {
                     bchzhzquery();
                 } 
             });
		}
        //获取表格
        function getDrid() {
        	var toolbar_v;
            publicFun.ajaxVal("${moduleid}", toolbar_v, callBack);
            var height = 0.96 * ($("#tabs", parent.document).height() - 28 - 24);
            $("#bchzhz").height(height);
            
            function callBack(toolbar_v) {
               var queryParams = getParams();
               console.log(queryParams);
               $('#bchzhz').datagrid({
               nowrap: true,
               striped: true,
               singleSelect: true,
               url: "${baseurl}report/querybchzhz_result.do",
               idField: 'comcname',
               loadMsg: '',
               toolbar: toolbar_v,
               columns: getColumns(queryParams.querytype),
               pagination: false,
               rownumbers: true,
               queryParams: queryParams,
            });
           }
	}
        //火狐表格的列
        function getColumns(queryType) {
        	var columns_v;
			switch (queryType) {
			default:
				//datagrid列定义
		        columns = [
		            {field: 'jiaobc',title: '班次',width: getWidth(0.12)}
		        ];
				break;
			}
			//console.log(columns);
			columns = columns.concat([
	            {field: 'jbcs',width: getWidth(0.06),title: '交班次数'}, 
	            {field: 'jbzrcs',title: '交班总人次数',width: getWidth(0.06)},
				{field: 'pthzzrcs',width: getWidth(0.08),title: '普通患者总人次数'},
		        {field: 'wzhzzrcs',title: '危重患者总人次数',width: getWidth(0.08)},
				{field: 'xrqcount',title: '新入抢总人次数',width: getWidth(0.07)}, 
	            {field: 'cgcount',title: '出观人次数',width: getWidth(0.06)},
	            {field: 'cgzycount',title: '住院人次数',width: getWidth(0.06)}, 
	            {field: 'cghjcount',title: '回家人次数',width: getWidth(0.06)}, 
	            {field: 'cgswcount',title: '死亡人次数',width: getWidth(0.06)}, 
	            {field: 'cgzdlycount',title: '自动离院人次数',width: getWidth(0.07)},
	            {field: 'zyuancount',title: '转院人次数',width: getWidth(0.06)}
			]);
			var columns_v = [columns];
			console.log(columns_v);
			return columns_v;
		}

        function chooseDate() {
			$("#chooseType").change(function() {
				var queryType = $("#chooseType").val();
				if(queryType == 'range'){
					$(".Wdate").css({"display":"none"});
					$("#startdate_"+queryType).css({"display":"block"});
					$("#enddate").css({"display":"block"});
				}else{
					$(".Wdate").css({"display":"none"});
					$("#startdate_"+queryType).css({"display":"block"});
				}
				var format = $("#startdate_"+queryType).attr("format");
				setTime(queryType,format);
			});
		}
        
        function cmdexport() {
        	 _confirm('您确认导出吗？', null, function() {
                var enddate = $("#enddate").val();
       		 	var ajaxOption = new AjaxOption();
     	        ajaxOption.requestType = 'POST';
     	        ajaxOption.requestDataType = "pame";
     	        ajaxOption.requestData =  getParams();
     	        ajaxOption.requestUrl = '${baseurl}report/bchzhzSubmit.do';
     	        ajaxOption.asyncFlg = true;
     	        ajaxOption.returnDataType = 'json';
     	        _ajaxPostRequest(ajaxOption, null, qjsbbExport_callback);
        	});
        }
        //导出的回调函数
        function qjsbbExport_callback(data) {
            message_alert(data);
        }
		//列宽度
        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
        }
		//根据插叙类型设置初始时间
        function setTime(type,format) {
        	var today = publicFun.timeFormat(new Date(), format);
            $("#startdate_"+type).val(today);
            $("#enddate").val(today);
        };
        //查询方法
        function bchzhzquery() {
            getDrid();
        }
        //获取传给后端的参数
        function getParams() {
        	var queryType = $("#chooseType").val();
        	var jjbtype = $("#jjbtype").val();
         	var startdate = $("#startdate_"+queryType).val();
         	 if (startdate == null || startdate == "") {
                  $.messager.alert('提示信息', "查询时间不能为空", 'warning');
                  return false;
              }
         	var enddate = $("#enddate").val();
         	 var queryParams = {
                     "startdate": startdate,
                     "enddate":enddate,
                     "querytype":queryType,
                     "hspJjbglInfCustom.jjbtype":jjbtype
                 };
         	 return queryParams;
		}

        //指定列求和
        function compute(colName, data) {
            var rows = data.rows;
            var total = 0;
            for (var i = 0; i < rows.length; i++) {
                total += parseFloat(rows[i][colName]);
            }
            return total;
        }
    </script>
    <form id="bchzhzform" name="bchzhzform" action="${baseurl}report/qjsbbSubmit.do" method="post">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <div class="form clr">
        	<p class="form-text">查询方式：</p>
        	<select id="chooseType">
        		<option value="day" selected="selected">天</option>
        		<option value="month">月</option>
        		<option value="year">年</option>
        		<option value="range">范围</option>
        	</select>
            <p class="form-text">查询日期：</p>
            <input type="text" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_day" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
            <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startdate_month" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM',minDate:'2017/08/01'})">
            <input type="text" style="display: none;" format="yyyy" class="input-date Wdate" id="startdate_year" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy',minDate:'2017/08/01'})">
            <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
            <input type="text" style="display: none;"  class="input-date Wdate" id="enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
            <p class="form-text">交接班类型：</p>
        	<select id="jjbtype" onchange="bchzhzquery()">
        		<option value="H" selected="selected">护士</option>
        		<option value="Y">医生</option>
        	</select>
            <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="bchzhzquery()">查询</a>
            <div class="c"></div>
        </div>
        <div class="queryTabs">
            <table id="bchzhz"></table>
        </div>
    </form>
</body>

</html>
