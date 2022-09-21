<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
	<title>卒中患者抵达急诊接受NHISS评分的比例</title> 
	<base href="<%=basePath%>" target="_self">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" href="styles/common/highcharts.css" type="text/css" />
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script src="lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
	<script src="lib/highcharts5.0.7/code/modules/exporting.js" type="text/javascript"></script> 
	<!-- 
	<script src="lib/easyui1.3/plugins/datagrid-transposedview.js" type="text/javascript"></script>
	 -->
</head>

<body class="Overtime">
	<form id="querymqform" action="report/exportMqAvgSubmit.do"
		method="post">
		<!-- html的静态布局 -->
		<!-- 查询条件 -->
		<div class="m-b5">
			<div class="m-t10 div_h">
				<ul class="querylist-ul form_hc">
					<li><input type="text" class="input-base short-right Wdate"
						id="emg_startdate" name="startdate"
						onfocus="new WdatePicker({dateFmt:'yyyy/MM'})"> 至 <input
						type="text" class="input-base short-right Wdate" id="emg_enddate"
						name="enddate" onfocus="new WdatePicker({dateFmt:'yyyy/MM'})" />
						<span class="f-left">&nbsp;查询时间：</span></li>
					<li class="queryuser-btn m-l5">
						<a class="easyui-linkbutton" iconCls="icon-search" id="btn"
							onclick="medianquery()">查询</a>
					</li>
				</ul>
				<div class="c"></div>
			</div>
		</div>
	</form>
	<div class="chart_grp chartbox">
		<div class="form_cat border-radius box-shadow">
			<p class="chart_title">卒中患者抵达急诊接受NHISS评分的比例</p>
			<div id="container" class="chart_div"></div>
		</div>
		<!-- 查询列表 -->
		<div class="list_table" id="list_table">
			<table id="dtoblist"></table>
		</div>
	</div>
	
	<script type="text/javascript">
       //enter按键默认触发查询
       $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                medianquery()
            }
        });

        var chart;
        
        function reload(){
            medianquery();
        }
        
        // 初始化图表
        function initChart(){
        	Highcharts.setOptions({
                lang: {
                    months: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                    shortMonths: ['01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'],
                    weekdays: ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'],
                    contextButtonTitle: "图表导出菜单",
                    downloadJPEG: "下载 JPEG 图片",
                    downloadPDF: "下载 PDF 文件",
                    downloadPNG: "下载 PNG 文件",
                    downloadSVG: "下载 TIF文件",
                    printChart: "打印图表"
                }
            });
            
            // 默认的导出菜单选项，是一个数据
            var dafaultMenuItem = Highcharts.getOptions().exporting.buttons.contextButton.menuItems;
            chart = Highcharts.chart('container', {
                chart: { //图标配置
                    zoomType: 'x',
                    backgroundColor: '#e4efff'
                },
                title: { //大标题
                    text: ''
                },
                xAxis: {
                    type: 'datetime',
                    dateTimeLabelFormats: {
                        day: '%y-%b-%e'
                    }
                },
                yAxis: { //Y轴设置
                    min: 0,
                    title: {
                        text: '比例（%）'
                    }
                },
                credits: { //版权信息
                    enabled: false
                },
                exporting: {
                    enabled: false,
                    type: 'image/png',
                    url: 'report/exportChart.do',
                    width: 1200, //导出报表的宽度  
                    filename: 'D-to-B时间报表',
                    buttons: {
                        contextButton: {
                            // 自定义导出菜单项目及顺序
                            menuItems: [
                                dafaultMenuItem[0], {
                                    separator: true
                                },
                                dafaultMenuItem[3],
                                dafaultMenuItem[5],
                                dafaultMenuItem[2],
                            ]
                        }
                    }
                },
                tooltip: { //数据提示框
                    pointFormat: '<span style="color:{series.color}">{series.name}</span>: <b>{point.y}</b><br/>',
                    shared: true
                },
                legend: {
                    enabled: true
                },
                plotOptions: { //数据列配置
                    column: {
                        stacking: 'normal' // percent百分比
                    },
                    line: {
                    	dataLabels: {
                    		enabled: true
                    	},
                    	enableMouseTracking: false
                    }
                },
                series: [{ //数据列
                    type: 'line',
                    name: '比例',
                    color: '#1981E4',
                }]
            });
        }
        
        //加载chart和datagrid
        $(function() {
            var height = $("#tabs", parent.document).height() * 0.75;
            $("#dtoblist").height(height);
            var chartheight = $("#tabs", parent.document).height() * 0.75 - 67;
            $("#container").height(chartheight);
			
            // 初始化搜索框的值
            setTime();
            // 初始化图表的配置
            initChart();
            // 初始化表格，并用数据渲染
            datagridshow();
            
            $(window).resize(function() {
                $('#dtoblist').datagrid('reload');
            });
        });
        
        //datagrid列定义
        var columns_v = [[
            {
                field: 'yarmon',
                title: '年月',
                width: getWidth(0.2)
            }, {
                field: 'tnumb',
                title: '符合要求数',
                width: getWidth(0.2)
            }, {
                field: 'total',
                title: '总数',
                width: getWidth(0.2)
            }, {
                field: 'rate',
                title: '比例(%)',
                width: getWidth(0.2),
                align: 'right',
                formatter : function(value, row, index) {
					return publicFun.getPercent(row.tnumb,row.total);
				}

            }
        ]];
        //定义datagrid工具
        var toolbar_v = [{
            id: 'btnadd',
            text: '导出',
            iconCls: 'icon-redo',
            handler: function() {
                _confirm('您确认导出吗？', null, function() {
                    jquerySubByFId('querymqform', medianExprot_callback, null, "json");
                });
            }
        }];
        //导出回调
        function medianExprot_callback(data) {
            //在这里提示信息中有文件下载链接
            message_alert(data);
        }

        function datagridshow(){
            var start = $("#emg_startdate").val();
            var end = $("#emg_enddate").val();
            $('#dtoblist').datagrid({
                title: "卒中患者抵达急诊接受NHISS评分的比例",
                nowrap: true,
                //view: transposedview,
                striped: true,
                singleSelect: true,
                url: "edpcReport/czNIHSSRate_result.do",
                //idField: '1',
                loadMsg: '',
                queryParams: {
                    startDate: start,
                    endDate: end
                },
                columns: columns_v,
                pagination: false,
                rownumbers: true,	
                toolbar: toolbar_v,
                onLoadSuccess: function(data) {
                	var xcategories = [];
                	var seriesData = [];
                	//var standardData = [];
                	var dataArray = data.rows;
               	 	if ($.isArray(dataArray)) {
                        for (var i = 0; i < dataArray.length; i++) {
                        	xcategories.push(dataArray[i].yarmon);
                        	seriesData.push(publicFun.getPercent(dataArray[i].tnumb,dataArray[i].total));
                        	//standardData.push(30);
                        }
                    }
                	chart.series[0].setData(seriesData);
                	//chart.series[1].setData(standardData);
                	chart.xAxis[0].setCategories(xcategories);
                }
            });
        }
        
        function avg(colName, data) {
            var rows = data.rows;
            var avg = 0;
            var total = 0;
            for (var i = 0; i < rows.length; i++) {
                total += parseFloat(rows[i][colName]);
            }
            avg = total / rows.length;
            avg = avg.toFixed(1);
            return avg;
        }

        function setTime() {
            //var _today;
            var _startdate;
            var _enddate;
            var _data;
            var _dataYY, _dataMM, _dataDD;
            _data = new Date();
            _dataYY = _data.getFullYear();
            _dataMM = _data.getMonth() + 1;
            _dataMM = _dataMM >= 10 ? _dataMM.toString() : "0" + _dataMM;
            
            //_today = _dataYY + "/" + _dataMM;
            _startdate = _dataYY-1 + "/" + _dataMM;
            _enddate = _dataYY + "/" + _dataMM;
            $("#emg_startdate").val(_startdate);
            $("#emg_enddate").val(_enddate);
        };

        function getWidth(proportion) {
            var width = $("body").width() * 0.29 - 4;
            return Math.round(proportion * width);
		}
		//查询方法
		function medianquery() {
			var start = $("#emg_startdate").val();
			var end = $("#emg_enddate").val();
			if (publicFun.searchTime(start, end)) {
				$('#dtoblist').datagrid('load', {
					"startDate" : start,
					"endDate" : end,
					"reportTypeFlag" : 'DGSJH'
				});
			}
		}
	</script>
</body>

</html>