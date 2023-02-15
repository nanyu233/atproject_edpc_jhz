<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>死亡率统计页面</title>
    <base href="<%=basePath%>">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" href="css/common/highcharts.css" type="text/css" />
    <link rel="stylesheet" href="css/hems/global.css" type="text/css" />
</head>

<body class="death">
    <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
    <script src="${baseurl}lib/highcharts5.0.7/code/modules/exporting.js" type="text/javascript"></script>
    <script type="text/javascript">
       //enter按键默认触发查询
       $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                jzblquery()
            }
        });
       
        var chart;

        function reload() {
            jzblquery();
        }
        $(function() {
            var height = 0.75 * ($("#tabs", parent.document).height());
            var height2 = (height*3)/10;
            var height3 = height-height2;
            $("#deathlist").height(height2-9);
            $("#emg_deathlist").height(height3-10);
            var heightchart = height - 67;
            $("#container").height(heightchart);
            Highcharts.setOptions({
                lang: {
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
                    type: 'pie',
                    backgroundColor: '#e4efff'
                },
                legend: {
                    align: 'right',
                    floating: true,
                    layout: "horizontal", //默认horizontal
                    /*y: 12,*/
                    itemStyle: {
                        'fontSize': '12px'
                    }
                },
                title: { //大标题
                    text: ''
                },
                credits: { //版权信息
                    enabled: false
                },
                exporting: {
                    enabled: false,
                    type: 'image/png',
                    url: '${baseurl}report/exportChart.do',
                    width: 1200, //导出报表的宽度  
                    filename: '死亡率统计',
                    buttons: {
                        contextButton: {
                            // 自定义导出菜单项目及顺序
                            menuItems: [
                                dafaultMenuItem[0], {
                                    separator: true
                                },
                                dafaultMenuItem[3],
                                dafaultMenuItem[5],
                                dafaultMenuItem[2]
                            ]
                        }
                    }
                },
                tooltip: { //数据提示框
                    pointFormat: '{series.name}<b>{point.percentage:.2f}%</b>'
                },
                plotOptions: { //数据列配置
                    pie: {
                        allowPointSelect: true,
                        cursor: 'pointer',
                        dataLabels: {
                            enabled: true,
                            format: '<b>{point.name}</b>: {point.percentage:.2f} %',
                            style: {
                                color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
                            }
                        },
                        showInLegend: true
                    }
                },

                series: [{ //数据列
                    name: '百分比',
                    color: '#444'
                }]
            });
            setTime();
            _2();
        });

        function _2() {
            var start = $("#emg_startdate").val();
            var end = $("#emg_enddate").val();
            var url = "${baseurl}edpcReport/queryCsswlMedian_result.do";
            var data = {"startdate":start,"enddate":end};
            $.ajax({
                url: url,
                dataType: "json",
                async: false,
                data: data,
                success: success_fn
            });
        }

        function success_fn(data) {
       		console.log(data);
        	
        	console.log($('#emg_deathlist'));
        	
        	var deathCount = data.list;
            var data_2 = [];

            for (var i = 0; i < deathCount.length; i++) {
                var obj = {};
                obj.name = deathCount[i].name;
                obj.y = deathCount[i].count;
                data_2.push(obj);
            }

            chart.series[0].setData(data_2);
            chart.legend.update();
	        }
        //datagrid列定义
        var columns_v = [
            [{
                field: 'deathRate',
                title: '死亡率 ',
                width: getWidth(0.25),
                formatter : function(value, row, index) {
                	if(value > 100){
                		return "0%";
                	}else{
                		return value + "%";
                	}
				}
            }, {
                field: 'surRate',
                title: '存活率',
                width: getWidth(0.25),
                formatter : function(value, row, index) {
                	if(value < 100){
                		return "0%";
                	}else{
                		return value + "%";
                	}
				}
            }, {
                field: 'deathNum',
                title: '死亡人数',
                width: getWidth(0.25)
            }, {
                field: 'allNum',
                title: '患者总数',
                width: getWidth(0.25)
            }]
        ];
        
        //定义 datagird工具(死亡率统计导出)
        var toolbar_v = [{ //工具栏
            id: 'btnadd',
            text: '导出',
            iconCls: 'icon-redo',
            handler: function() {
                _confirm('您确认导出吗？', null, function() {
                    jquerySubByFId('deathform', deathExprot_callback, null, "json");
                });
            }
        }];
        
        //加载datagrid
        $(function() {
            setTime();
            loadtable();
            $(window).resize(function() {
                $('#deathlist').datagrid('reload');
                setTime();
                _2();
            });
        });
        
        function loadtable() {
        	var start = $("#emg_startdate").val();
            var end = $("#emg_enddate").val();
            $('#deathlist').datagrid({
                title: '死亡率统计',
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: "${baseurl}edpcReport/querydeath_result.do",
                queryParams: {
                    startdate: start,
                    enddate: end,
                },
                idField: 'date',
                loadMsg: '',
                columns: columns_v,
            });
        }

        function setTime() {
        	var _today = publicFun.timeFormat(new Date(), "yyyy/MM");
            $("#emg_startdate").val(_today);
            $("#emg_enddate").val(_today);
        };

        function getWidth(proportion) {
            var width = $("body").width() * 0.29 - 4;
            return Math.round(proportion * width);
        }
        //查询方法
        function jzblquery() {
            var start = $("#emg_startdate").val();
            var end = $("#emg_enddate").val();
            if (start == null || start == "") {
                $.messager.alert('提示信息', "开始时间不能为空", 'warning');
                return false;
            }
            if (end == null || end == "") {
                $.messager.alert('提示信息', "结束时间不能为空", 'warning');
                return false;
            }
            if (end < start ) {
                $.messager.alert('提示信息', "结束时间需大于开始时间", 'warning');
                return false;
            }
            _2();
            loadtable();
        }
        //导出回调
        function deathExprot_callback(data) {
            //在这里提示信息中有文件下载链接
            message_alert(data);
        }
    </script>
    <form id="deathform" action="${baseurl}report/exportCsswlMedianSubmit.do" method="post">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <div class="m-b5">
            <div class="m-t10 div_h">
                <ul class="querylist-ul form_hc">
                    <li>
                         <span>&nbsp;查询时间：</span>
                        <input type="text" class="input-base short-right Wdate" id="emg_startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM'})" /> 至
                        <input type="text" class="input-base short-right Wdate" id="emg_enddate"  name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM'})" />
                    </li>
                    <li class="queryuser-btn m-l5">
                        <a class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="jzblquery()">查询</a>
                    </li>
                </ul>
                <div class="c"></div>
            </div>
        </div>
    </form>
    <div class="chart_grp chartbox">
        <div class="form_cat border-radius box-shadow">
            <p class="chart_title">死亡率统计</p>
            <!-- <hr class="hr"/> -->
            <div id="container" class="chart_div"></div>
        </div>
        <!-- 查询列表 -->
        <div class="list_table deathlist_div nonumlist_table" id="list_table">
            <table id="deathlist"></table>
        </div>
    </div>
    
    
</body>

</html>
