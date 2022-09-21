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
<title>抢救室日报表</title>
</head>

<body class="qjsrbb">
    <script type="text/javascript">
     $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
            return false;
            }
        });
     	//刷新
        function reload() {
        	$('#qjsrbb').datagrid("reload");
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
                     qjsrbbquery();
                 } 
             });
		}
        //获取表格
        function getDrid() {
        	var toolbar_v;
            publicFun.ajaxVal("${moduleid}", toolbar_v, callBack);
            var height = 0.96 * ($("#tabs", parent.document).height() - 28 - 24);
            $("#qjsrbb").height(height);
            
            function callBack(toolbar_v) {
               var queryParams = getParams();
               console.log(queryParams);
               $('#qjsrbb').datagrid({
               nowrap: true,
               striped: true,
               singleSelect: true,
               url: "${baseurl}report/queryqjsrbb_result.do",
               idField: 'comcname',
               loadMsg: '',
               toolbar: toolbar_v,
               columns: getColumns(queryParams.querytype),
               pagination: false,
               rownumbers: true,
               onLoadSuccess: function(data) {
                   $('#qjsrbb').datagrid('appendRow', {
                       comcname: '<b>合计（人）:</b>',
                       zrlgcount: compute("zrlgcount", data),
                       xylgcount: compute("xylgcount", data),
                       jrrgcount: compute("jrrgcount", data),
                       jrcgcount: compute("jrcgcount", data),
                       cgzycount: compute("cgzycount", data),
                       cgswcount: compute("cgswcount", data),
                       cgzdlycount: compute("cgzdlycount", data),
                       zlgscount: compute("zlgscount", data),
                       zyuancount:compute("zyuancount", data),
                       sscount:compute("sscount", data),
					   jzbfcount:compute("jzbfcount", data),
				   	   szcount:compute("szcount", data),
				       zdejcount:compute("zdejcount", data),
				       fyzlycount:compute("fyzlycount", data),
                   });
               },
               queryParams: queryParams,
            });
           }
	}
        //火狐表格的列
        function getColumns(queryType) {
        	var columns_v;
			switch (queryType) {
			case "day":
				//datagrid列定义
		        columns = [
		            {field: 'comcname',title: '科室',width: getWidth(0.05)},
		             {field: 'zrlgcount',width: getWidth(0.06),title: '昨日留抢数'}, 
		             {field: 'xylgcount',title: '现有留抢数',width: getWidth(0.06)}, 
		             {field: 'jrrgcount',width: getWidth(0.06),title: '今日入抢数'},
		             {field: 'jrcgcount',title: '今日总出抢数',width: getWidth(0.06)},
		        ];
				break;
			default:
				columns = [
		            {field: 'comcname',title: '科室',width: getWidth(0.05)},
		             {field: 'jrrgcount',width: getWidth(0.06),title: '总入抢数'},
		             {field: 'jrcgcount',title: '总出抢数',width: getWidth(0.06)},
		        ];
				break;
			}
			columns = columns.concat([
	            {field: 'cgzycount',title: '住院数',width: getWidth(0.06)},
	            {field: 'cgswcount',title: '死亡数',width: getWidth(0.06)}, 
	            {field: 'cgzdlycount',title: '离院数',width: getWidth(0.06)},
	            {field: 'zlgscount',title: '转留观室',width: getWidth(0.06)}, 
	            {field: 'zyuancount',title: '转院',width: getWidth(0.06)},
				{field: 'sscount',title: '手术',width: getWidth(0.06)},
				{field: 'jzbfcount',title: '急诊病房',width: getWidth(0.06)},
				{field: 'szcount',title: '随诊数',width: getWidth(0.06)},
				{field: 'zdejcount',title: '转诊到二级及基础医疗机构',width: getWidth(0.08)},
				{field: 'fyzlycount',title: '非医嘱离院',width: getWidth(0.06)},
			]);
			var columns_v = [columns];
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
        	 _confirm('确定导出吗？', null, function() {
                var enddate = $("#enddate").val();
       		 	var ajaxOption = new AjaxOption();
     	        ajaxOption.requestType = 'POST';
     	        ajaxOption.requestDataType = "pame";
     	        ajaxOption.requestData =  getParams();
     	        ajaxOption.requestUrl = '${baseurl}report/qjsbbSubmit.do';
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
        //住院明细按钮方法
        function cmdzhuyhz(){
        	var queryType = $("#chooseType").val();
        	startdate = $("#startdate_"+queryType).val();
        	if (startdate == null || startdate == "") {
                $.messager.alert('提示信息', "查询时间不能为空", 'warning');
                return false;
            }
        	createmodalwindow("住院患者明细", 890, 500, '${baseurl}report/queryZyhz.do', 'no');
        }
        //现有留观患者明细
         function cmdxylghzmx(){
        	var queryType = $("#chooseType").val();
        	startdate = $("#startdate_day").val();
        	var myDate = new Date(); 
        	var date =myDate.getFullYear() + '/' + ((myDate.getMonth() + 1)< 10? '0' +(myDate.getMonth() + 1) : (myDate.getMonth() + 1)) + '/' + myDate.getDate();
        	
        	if(startdate == null || startdate == ""||queryType=="month"||queryType=="range"){
        		$.messager.alert('提示信息', "只能查询当天的留观患者明细！", 'warning');
                return false;
        	}else if(startdate !=date){
        		$.messager.alert('提示信息', "只能查询当天的留观患者明细！", 'warning');
                return false;
        	}
        	parent.opentabwindow( '现有留观患者明细', "${baseurl}report/queryXylghzmx.do");
        } 
		//根据插叙类型设置初始时间
        function setTime(type,format) {
        	var today = publicFun.timeFormat(new Date(), format);
            $("#startdate_"+type).val(today);
            $("#enddate").val(today);
        };
        //查询方法
        function qjsrbbquery() {
            getDrid();
        }
        //获取传给后端的参数
        function getParams() {
        	var queryType = $("#chooseType").val();
         	var startdate = $("#startdate_"+queryType).val();
         	 if (startdate == null || startdate == "") {
                  $.messager.alert('提示信息', "查询时间不能为空", 'warning');
                  return false;
              }
         	var enddate = $("#enddate").val();
         	 var queryParams = {
                     "startdate": startdate,
                     "enddate":enddate,
                     "querytype":queryType
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
    <form id="qjsrbbform" name="qjsrbbform" action="${baseurl}report/qjsbbSubmit.do" method="post">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <div class="form clr">
        	<p class="form-text">查询方式：</p>
        	<select id="chooseType">
        		<option value="day" selected="selected">天</option>
        		<option value="month">月</option>
        		<option value="range">范围</option>
        	</select>
            <p class="form-text">查询日期：</p>
            <input type="text" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_day" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
            <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startdate_month" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM',minDate:'2017/08/01'})">
            <input type="text" style="display: none;" format="yyyy" class="input-date Wdate" id="startdate_year" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy',minDate:'2017/08/01'})">
            <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
            <input type="text" style="display: none;"  class="input-date Wdate" id="enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
            <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="qjsrbbquery()">查询</a>
            <div class="c"></div>
        </div>
        <div class="queryTabs">
            <table id="qjsrbb"></table>
        </div>
    </form>
</body>

</html>
