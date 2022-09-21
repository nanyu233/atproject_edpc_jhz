<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
    <title>抢救室滞留时间</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
    <link rel="stylesheet" href="${baseurl}css/hems/global.css?090" type="text/css" />
</head>

<body>
    <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
    <script type="text/javascript">
    //enter按键默认触发查询
   $(document).keydown(function(event) {
        switch (event.keyCode) {
        case 13:
        qjszlquery()
        }
    });
    
    function reload() {
        qjszlquery();
    }
    $(function() {
        setTime("day","yyyy/MM/dd");
        chooseDate();
        var height = 0.75 * ($("#tabs", parent.document).height() - 60);
        $("#qjszlList").height(height + 75);
        getDrid()
        var chartheight = height -67;
        $("#container").height(chartheight);
    });
    //datagrid列定义
    var columns_v = [
        [{
            field: 'emgSeq',
            title: '编号 ',
            hidden:true
        },{
            field: 'emgDatStr',
            title: '收治时间 ',
            width: getWidth(0.25)
        },{
            field: 'cstNam',
            title: '姓名 ',
            width: getWidth(0.15)
        }, {
            field: 'mpi',
            title: '病历号',
            width: getWidth(0.2)
        },{
            field: 'sqlDatStr',
            title: '转归时间 ',
            width: getWidth(0.25)
        },{
            field: 'cstSexCod',
            title: '性别',
            width: getWidth(0.1)
        }]
    ];

    //定义 datagird工具
    var toolbar_v = [{
        id: '',
        text: '导出',
        iconCls: 'icon-redo',
        handler: function() {
            _confirm('确定导出吗？', null, function() {
            	var getMsgUrl = '${baseurl}report/exportQjszlhzSubmit.do';
            	publicFun.httpServer({url: getMsgUrl}, $("#qjszlList").datagrid("options").queryParams, userExprot_callback);
            });
        }
    }];

    //根据插叙类型设置初始时间
    function setTime(type,format) {
        var today = publicFun.timeFormat(new Date(), format);
        $("#startdate_"+type).val(today);
        $("#enddate").val(today);
    };

    function qjszlquery() {
        getDrid();
    }

    function showPie(zllrateStr,fzllrateStr,zlrs,fzlrs){
        var zllrate = parseFloat(zllrateStr),
            fzllrate = parseFloat(fzllrateStr);
        var arr = [{name: '滞留率',y: zllrate,z: zlrs},{name:'非滞留率',y:fzllrate,z: fzlrs}];
        $('#container').highcharts({
            chart: {
                type: 'pie',
                backgroundColor: '#e4efff'
            },
            legend:{
                align: 'right',
                floating: true,
                layout: "horizontal", //默认horizontal
                itemStyle: {
                    'fontSize': '12px'
                }
            },
            title:{
                text:''
            },
            plotOptions: {
                pie: {
                    allowPointSelect: true,
                    cursor: 'pointer',
                    dataLabels: {
                        enabled: true,
                        format: '{point.name}: {point.percentage:.2f}%'
                    },
                    showInLegend: true
                }
            },
            credits: {
                enabled: false
            },
            tooltip: {
                headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
                pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b> {point.percentage:.2f}%   {point.z}人</b> <br/>'
            },
            series: [{
                type: 'pie',
                name:'抢救室滞留率',
                colorByPoint: true,
                data: arr
            }]
        })
    }

    function getData(start,end,querytype,timetype){
        publicFun.httpServer({ url: '${baseurl}report/queryqjszll_result.do' }, {
            'querytype': querytype,
            'timetype': timetype,
            'startdate': start,
            'enddate': end
        }, function(res) {
            $('#msg').html('');
            var pjzlhours = res.resultInfo.sysdata.pjzlhours;
            var zllrate = res.resultInfo.sysdata.hspemginfCustom.zllrate,
                zlrs = res.resultInfo.sysdata.hspemginfCustom.zlrs;
            var fzllrate = res.resultInfo.sysdata.hspemginfCustom.fzllrate,
                fzlrs =  res.resultInfo.sysdata.hspemginfCustom.fzlrs;
            $('#msg').html('<p>抢救室平均滞留时间<i class=\"point\">&nbsp;'+pjzlhours+'&nbsp;</i>时</p>');
            showPie(zllrate,fzllrate,zlrs,fzlrs);
        })
    }

    function getDrid(){
        var querytype = $("#chooseType").val();
        var start = $("#startdate_"+querytype).val();
        if(querytype == 'range'){
            var end = $("#enddate").val();
        }else{
            var end = start;
        }
        
        if(querytype != 'range' && start == ''){
            $.messager.alert('提示信息', "查询时间不能为空", 'warning');
            return false
        }
        if(querytype == 'range' && (end == ''|| start == '')){
            $.messager.alert('提示信息', "查询时间不能为空", 'warning');
            return false
        }

        var timetype = $("input[name='timetype']:checked").val();
        var timeStr;
        if(timetype != undefined){
            timeStr = "大于"+timetype+"时"
        }else{
            timeStr = ''
        }
        $('#qjszlList').datagrid({
            title: timeStr+"滞留患者",
            nowrap: true,
            striped: true,
            singleSelect: true,
            url: "${baseurl}report/queryqjszlhz_result.do",
            loadMsg: '',
            queryParams: {
                'querytype': querytype,
                'timetype': timetype,
            	'startdate': start,
            	'enddate': end
            },
            columns: columns_v,
            pagination: true,
            rownumbers: false,
            pageList: [15, 30, 50],
            toolbar: toolbar_v
        });
        $(window).resize(function() {
            $('#qjszlList').datagrid('reload');
        });
        
        getData(start, end, querytype, timetype);
    }

    function chooseDate() {
        $("#chooseType").change(function() {
            var queryType = $("#chooseType").val();
            if(queryType == 'range'){
                $(".Wdate").css({"display":"none"});
                $("#startdate_"+queryType).css({"display":"inline-block"});
                $("#enddate").css({"display":"inline-block"});
            }else{
                $(".Wdate").css({"display":"none"});
                $("#startdate_"+queryType).css({"display":"inline-block"});
            }
            var format = $("#startdate_"+queryType).attr("format");
            setTime(queryType,format);
        });
    }

    function getWidth(proportion) {
        var width = $("body").width() * 0.29 - 4;
        return Math.round(proportion * width);
    }

    //用户导出回调
    function userExprot_callback(data) {
        //在这里提示信息中有文件下载链接
        message_alert(data);
    }

    function iftrue(a){
        if($(a).attr('checked')){
            $("input[name='timetype']").removeAttr('checked');
            $(a).attr('checked','checked');
        }
    }
    </script>
    <!-- html的静态布局 -->
    <form id="qjszlform" name="qjszlform" action="${baseurl}report/exportjhz.do" method="post">
        <div class="m-b5">
            <div class="m-t10 div_h">
                <ul class="querylist-ul form_hc">
                    <li>
                        <select id="chooseType">
                            <option value="day" selected="selected">天</option>
                            <option value="month">月</option>
                            <option value="year">年</option>
                            <option value="range">范围</option>
                        </select>
                        <span class="f-left">&emsp;查询方式：</span>
                    </li>
                    <li>
                        <input type="text" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_day" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
                        <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startdate_month" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM',minDate:'2017/08/01'})">
                        <input type="text" style="display: none;" format="yyyy" class="input-date Wdate" id="startdate_year" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy',minDate:'2017/08/01'})">
                        <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startdate_range" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
                        <input type="text" style="display: none;"  class="input-date Wdate" id="enddate" name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
                        <span class="f-left">&emsp;查询日期：</span>
                    </li>
                    <li>
                        <label><input type="checkbox" value="24" name="timetype" onclick="iftrue(this)" checked="checked"/>大于24小时</label>
                        <label><input type="checkbox" value="48" name="timetype" onclick="iftrue(this)"/>大于48小时</label>
                        <label><input type="checkbox" value="72" name="timetype" onclick="iftrue(this)"/>大于72小时</label>
                        <span class="f-left">&emsp;查询类型：</span>
                    </li>
                    <li class="queryuser-btn m-l5">
                        <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="qjszlquery()">查询</a>
                    </li>
                </ul>
                <div class="c"></div>
            </div>
        </div>
    </form>
    <div class="chart_grp chartbox qjszlsj">
        <div class="textDiv border-radius box-shadow" id="textDiv">
            <div class="msg" id="msg"></div>
        </div>
        <div class="form_cat border-radius box-shadow">
            <p class="chart_title">抢救室滞留时间</p>
            <div id="container" class="chart_div"></div>
        </div>
        <!-- 查询列表 -->
        <div class="list_table list_div tab_lv nonumlist_table" id="list_table">
            <table id="qjszlList"></table>
        </div>
    </div>
</body>

</html>