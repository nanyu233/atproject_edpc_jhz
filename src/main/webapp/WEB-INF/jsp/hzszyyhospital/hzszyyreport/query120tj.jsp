<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>120到院统计报表</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" href="${baseurl}styles/common/highcharts.css" type="text/css" />
    <link rel="stylesheet" href="${baseurl}styles/hems/global.css" type="text/css" />
</head>

<body class="keszrs">
    <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
    <script src="${baseurl}lib/highcharts5.0.7/code/modules/exporting.js" type="text/javascript"></script>
    <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
    <script type="text/javascript">
      //enter按键默认触发查询
       $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                reload();
            }
        });
       
        var reloadinit;
        $(function() {
            var querytype = "year";

            init();

            $(window).resize(function() {
                $('#nbyabnlist').datagrid('reload');
            });
            reloadinit = function() {
                btnsearch();
            };

            function init() {
                var height = 0.75 * ($("#tabs", parent.document).height());
                $("#nbyabnlist").height(height);
                var heightchart = height - 67;
                $("#container").height(heightchart);

                settime();
                btnsearch();
                seltype();
            }

            function btnexport() {
                if (querytype == "year") {
                    $("#day_startdate").removeAttr("name");
                    $("#day_enddate").removeAttr("name");
                    $("#mon_startdate").removeAttr("name");
                    $("#mon_enddate").removeAttr("name");
                    $("#half_date").removeAttr("name");
                    $("#year_startdate").attr("name", "startdate");
                    $("#year_enddate").attr("name", "enddate");
                } else if (querytype == "halfyear") {
                    $("#day_startdate").removeAttr("name");
                    $("#day_enddate").removeAttr("name");
                    $("#mon_startdate").removeAttr("name");
                    $("#mon_enddate").removeAttr("name");
                    var halfdate = $("#half_date").attr("name", "halfdate").val();
                    $("#year_startdate").attr("name", "startdate").val(halfdate);
                    $("#year_enddate").attr("name", "enddate").val(halfdate - 0 + 1);
                } else if (querytype == "month") {
                    $("#day_startdate").removeAttr("name");
                    $("#day_enddate").removeAttr("name");
                    $("#year_startdate").removeAttr("name");
                    $("#year_enddate").removeAttr("name");
                    $("#half_date").removeAttr("name");
                    $("#mon_startdate").attr("name", "startdate");
                    $("#mon_enddate").attr("name", "enddate");
                    $("#mon_enddate").val($("#mon_startdate").val());
                } else if (querytype == "day") {
                    $("#mon_startdate").removeAttr("name");
                    $("#mon_enddate").removeAttr("name");
                    $("#year_startdate").removeAttr("name");
                    $("#year_enddate").removeAttr("name");
                    $("#day_startdate").removeAttr("name");
                    $("#day_enddate").removeAttr("name");
                    $("#half_date").removeAttr("name");
                    $("#day_startdate").attr("name", "startdate");
                }
                jquerySubByFId('query120tjform', nbyabnExprot_callback, null, "json");
            }

            function nbyabnExprot_callback(data) {
                //在这里提示信息中有文件下载链接
                message_alert(data);
            }

            function settime() {
                var todayYear = publicFun.timeFormat(new Date(), "yyyy");
                $("#year_startdate").val(todayYear);
                $("#year_enddate").val(todayYear);
            }

            //datagrid列定义
            function colcus() {
                var columns_v = [
                    [{
                        field: 'querydate',
                        title: '查询时间',
                        width: getWidth(0.33)
                    }, {
                        field: 'savMngCodStr',
                        title: '处置方式',
                        width: getWidth(0.33)
                    }, {
                        field: 'counts',
                        title: '人数',
                        width: getWidth(0.33)
                    }]
                ];
                return columns_v;
            }

            function toolcus() {
                //定义 datagird工具
                var toolbar_v = [{
                    id: '',
                    text: '导出',
                    iconCls: 'icon-redo',
                    handler: function() {
                        _confirm('您确认导出吗？', null, function() {
                            btnexport();
                        });
                    }
                }];
                return toolbar_v;
            }

            function getData(starttime, endtime, halfdate, querytype) {
                $('#nbyabnlist').datagrid({
                    title: '120到院统计报表',
                    nowrap: true,
                    striped: true,
                    singleSelect: true,
                    toolbar: toolcus(),
                    url: "${baseurl}zyyreport/query120tj_result.do",
                    onLoadSuccess: function(data) {
                    	loadchart(data.rows, "column");
                    },
                    idField: 'date',
                    queryParams: {
                        startdate: starttime,
                        enddate: endtime,
                        halfdate: halfdate,
                        "querytype": querytype
                    },
                    loadMsg: '',
                    columns: colcus()
                });
            }

            function checkquerytype() {
                var text;
                var startdate;
                var querytype = $('#seltype').val();
                if (querytype == 'year') {
                    startdate = $('#year_startdate').val();
                } else if (querytype == 'month') {
                    startdate = $('#mon_startdate').val();
                } else if (querytype == 'day') {
                    startdate = $('#day_startdate').val();
                }
                text = startdate;
                return text;
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
            /*
            function getRows(querydate,data){
                var row = 0;
                var rows = data.rows;
                for (var i = 0; i < rows.length; i++) {
                    if(rows[i][querydate].indexOf('上半年')<0){
                        row=i;
                        return row;
                    }
                }
            }*/
            //指定半年列求和
            function computefirsthalfyear(querydate, colName, data) {
                var rows = data.rows;
                var total = 0;
                for (var i = 0; i < rows.length; i++) {
                    if (rows[i][querydate].indexOf('上半年') > 0) {
                        total += parseFloat(rows[i][colName]);
                    } else {
                        break;
                    }
                }
                return total;
            }

            function computesecondhalfyear(querydate, colName, data) {
                var rows = data.rows;
                var total = 0;
                for (var i = 0; i < rows.length; i++) {
                    if (rows[i][querydate].indexOf('下半年') > 0) {
                        total += parseFloat(rows[i][colName]);
                    }
                }
                return total;
            }


            function seltype() {
                $('#queryyear').css({
                    "display": "block"
                });
                $('#queryhalfyear').css({
                    "display": "none"
                });
                $('#querymonth').css({
                    "display": "none"
                });
                $('#queryday').css({
                    "display": "none"
                });
                $('#seltype').change(function() {
                    querytype = $('#seltype').val();
                    if (querytype == "year") {
                        settime();
                        $('#queryyear').css({
                            "display": "block"
                        });
                        $('#queryhalfyear').css({
                            "display": "none"
                        });
                        $('#querymonth').css({
                            "display": "none"
                        });
                        $('#queryday').css({
                            "display": "none"
                        });
                    } else if (querytype == "halfyear") {
                        var todayYear = publicFun.timeFormat(new Date(), "yyyy");
                        $("#half_date").val(todayYear);
                        //             $("#half_date").val(todayYear);
                        $('#queryyear').css({
                            "display": "none"
                        });
                        $('#queryhalfyear').css({
                            "display": "block"
                        });
                        $('#querymonth').css({
                            "display": "none"
                        });
                        $('#queryday').css({
                            "display": "none"
                        });
                    } else if (querytype == "month") {
                        var todayMonth = publicFun.timeFormat(new Date(), "yyyy/MM");
                        $("#mon_startdate").val(todayMonth);
                        $("#mon_enddate").val(todayMonth);
                        $('#queryyear').css({
                            "display": "none"
                        });
                        $('#queryhalfyear').css({
                            "display": "none"
                        });
                        $('#querymonth').css({
                            "display": "block"
                        });
                        $('#queryday').css({
                            "display": "none"
                        });
                    } else if (querytype == "day") {
                        var todayDay = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
                        $("#day_startdate").val(todayDay);
                        $("#day_enddate").val(todayDay);
                        $('#queryyear').css({
                            "display": "none"
                        });
                        $('#queryhalfyear').css({
                            "display": "none"
                        });
                        $('#querymonth').css({
                            "display": "none"
                        });
                        $('#queryday').css({
                            "display": "block"
                        });
                    }
                });
            };

            function Person(name, data, stack) {
                this.name = name;
                this.data = data;
                this.stack = stack;
            }

            function loadchart(chartdate, chartstype) {
                /*console.log(chartdate);*/
                // console.log(chartdate);
                var seriesArr;
                var seriesOne;
                var categoriesArr = new Array();
                var nameArr = new Array();
                var seriesData = null;
                seriesArr = new Array();
                for (var i = 0; i < chartdate.length; i++) {
                    categoriesArr.push(chartdate[i].savMngCodStr);
                    // if (nameArr.indexOf(chartdate[i].querydate) < 0) {
                    if ($.inArray(chartdate[i].querydate, nameArr)<0) {
                        if (seriesData != null) {
                            seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
                            seriesArr.push(seriesOne);
                        }
                        nameArr.push(chartdate[i].querydate);
                        seriesData = new Array();
                    }
                    seriesData.push(chartdate[i].counts);
                }
                if (chartdate.length == 0) {
                    querytype = $('#seltype').val();
                    if (querytype == "year") {
                        start = $("#year_startdate").val();
                    } else if (querytype == "halfyear") {
                        start = $('#half_date').val();
                    } else if (querytype == "month") {
                        start = $("#mon_startdate").val();
                    } else if (querytype == "day") {
                        start = $("#day_startdate").val();
                    }
                    nameArr.push(start);
                }
                seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
                seriesArr.push(seriesOne);

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

                $('#container').highcharts({
                    chart: {
                        type: chartstype,
                        backgroundColor: '#e4efff'
                    },
                    title: {
                        text: ''
                    },
                    xAxis: {
                        categories: categoriesArr
                    },
                    yAxis: {
                        /*min: 0,*/
                        allowDecimals: false,
                        title: {
                            text: '人数'
                        }
                    },
                    legend: {
                        itemStyle: {
                            'fontSize': '12px'
                        }
                    },
                    exporting: {
                        enabled: false,
                        type: 'image/png',
                        url: '${baseurl}zyyreport/exportChart.do',
                        width: 1200, //导出报表的宽度  
                        filename: '120到院统计报表',
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
                    tooltip: {
                        fheaderFormat: '<span style="font-size:10px">{point.key}</span><table>',
                        pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                            '<td style="padding:0"><b>{point.y:.0f} 个</b></td></tr>',
                        footerFormat: '</table>',
                        shared: true,
                        useHTML: true
                    },
                    plotOptions: {
                        column: {
                            allowPointSelect: true,
                            cursor: 'pointer',
                            dataLabels: {
                                enabled: true,
                                color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
                                style: {
                                    textShadow: '0 0 3px black'
                                }
                            },
                            showInLegend: true
                        }
                    },
                    credits: {
                        enabled: false
                    },
                    series: seriesArr
                });
            }

            //查询方法
            function btnsearch() {
                /* settime();
                var today = $("#year_startdate").val();
                var halfdate = $("#half_date").val();
                getData(today, today - 0 + 1, halfdate, querytype);
                $("#search").click(function() { */
                var start;
                var end;
                var halfdate;
                if (querytype == "year") {
                    start = $("#year_startdate").val();
                    end = start - 0 + 1;
                } else if (querytype == "halfyear") {
                    halfdate = $('#half_date').val();
                    start = halfdate;
                    end = halfdate - 0 + 1;
                } else if (querytype == "month") {
                    start = $("#mon_startdate").val();
                    end = $("#mon_startdate").val();
                } else if (querytype == "day") {
                    start = $("#day_startdate").val();
                    end = start;
                }
                if (start == null || start == "") {
                    $.messager.alert('提示信息', "开始时间不能为空", 'warning');
                    return false;
                }
                if (end == null || end == "") {
                    $.messager.alert('提示信息', "结束时间不能为空", 'warning');
                    return false;
                }
                getData(start, end, halfdate, querytype);
                /* }); */
            }

            function getWidth(proportion) {
                var width = $("body").width() * 0.29 - 4;
                return Math.round(proportion * width);
            }

            //导出回调
            function nbyabnExprot_callback(data) {
                //在这里提示信息中有文件下载链接
                message_alert(data);
            }
        });

        function reload() {
            reloadinit();
        }
    </script>
    <form id="query120tjform" action="${baseurl}zyyreport/query120tjExport.do" method="post">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <div class="m-b5">
            <div class="m-t10 div_h">
                <ul class="querylist-ul form_hc">
                    <li>
                        <p class="floatLeft">&nbsp;查询方式：</p>
                        <select id="seltype" name="querytype">
                            <option value="year" selected="selected">按年</option>
                            <option value="halfyear">按半年</option>
                            <option value="month">按月</option>
                            <option value="day">按天</option>
                        </select>
                    </li>
                    <li id="queryhalfyear">
                        <p class="floatLeft">&nbsp;查询时间：</p>
                        <input type="text" class="input-base short-right Wdate" id="half_date" name="halfdate" onfocus="WdatePicker({dateFmt:'yyyy'})">
                    </li>
                    <li id="queryyear">
                        <p class="floatLeft">&nbsp;查询时间：</p>
                        <input type="text" class="input-base short-right Wdate" id="year_startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy'})">
                        <input type="hidden" class="input-base short-right Wdate" id="year_enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy'})" />
                    </li>
                    <li id="querymonth">
                        <p class="floatLeft">&nbsp;查询时间：</p>
                        <input type="text" class="input-base short-right Wdate" id="mon_startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
                        <input type="hidden" class="input-base short-right Wdate" id="mon_enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM'})" />
                    </li>
                    <li id="queryday">
                        <p class="floatLeft">&nbsp;查询时间：</p>
                        <input type="text" class="input-date Wdate" id="day_startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
                        <input type="hidden" class="input-date Wdate" id="day_enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})" />
                    </li>
                    <li class="queryuser-btn m-l5">
                        <a href="#" id="search" onclick="reload()" class="easyui-linkbutton" iconCls="icon-search">查询</a>
                    </li>
                </ul>
                <div class="c"></div>
            </div>
        </div>
    </form>
    <div class="chart_grp chartbox">
        <div class="form_cat border-radius box-shadow">
            <p class="chart_title">120到院统计报表</p>
            <div id="container" class="chart_div"></div>
        </div>
        <!-- 查询列表 -->
        <div class="list_table rownumbers" id="list_table">
            <table id="nbyabnlist"></table>
        </div>
    </div>
</body>

</html>