<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>胸痛患者列表</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">
    <link rel="stylesheet" type="text/css" href="css/common/querylist.css"/>
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <style>

        .form {
            width: 100%;
            position: relative;
        }

        .form .row {
            margin: 10px 0;
            /*border: 1px solid red;*/
        }

        .form .row .form-item {
            /* width: 24%; */
            display: inline-block;
            vertical-align: middle;
        }

        .form-item label {
            display: inline-block;
            width: 60px;
            text-align: right;
            margin-left: 10px;
            font-size: 14px;
        }

        .form-item input,
        .form-item select {
            /* width: calc(100% - 270px); */
            width: 110px;
            height: 34px;
            padding: 3px 3px;
            font-size: 14px;
            line-height: 1.428571429;
            color: #555;
            vertical-align: middle;
            background-color: #fff;
            background-image: none;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .form-item .btn-group {
            margin-left: 100px;
        }

        .form-item .btn-group .btn {
            padding: 6px 12px;
            border-radius: 4px;
            background: #eeeeee;
            color: #888888;
            cursor: pointer;
            float: right;
            margin: 0 5px;
            font-size: 14px;
        }

        .row .search-btn {
            position: absolute;
            top: 10px;
            /*right: 10px;*/
            left: 10px;
            width: 140px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 32px;
            text-align: center;
            line-height: 32px;
            cursor: pointer;
        }

        .active {
            background: #428bca !important;
            color: #ffffff !important;
        }

        table .btn {
            display: inline-block;
            padding: 2px 10px;
            /*border: 1px solid black;*/
            border-radius: 5px;
            margin: 3px;
            color: #ffffff;
        }

        table .detail {
            background: #428bca;
        }

        table .Timeline {
            background: #428bca;
            /* background:darkseagreen; */
        }

        table .del {
            background: red;
        }

        .pagination-page-list {
            width: 45px;
        }

        .datagrid-wrap {
            position: relative;
        }

        .datagrid-pager {
            position: absolute;
            bottom: 0;
            width: 100%;
        }
    </style>
</head>
<body id="container">
<div ms-controller="list" style="width:100%;height:5%;">
    <div class="form">
        <div class="row">
            <div class="search-btn" onclick="cmdaddpln()" style="margin-right:150px;left: 10px">创建计划</div>
        </div>
    </div>
</div>
<div style="width:100%;height:50%;">
    <div style="float:left;width:50%;">
        <div class="form">
            <div class="row" style="min-height:30px;">
                <div class="search-btn" onclick="delFuvPln()">计划删除</div>
            </div>
            <div class="row">
                <div class="search-btn" onclick="tofuvpln()" style="margin-left:150px;">计划详情</div>
            </div>
            <div class="row">
                <div class="search-btn" onclick="redirectTosfgladd()" style="margin-left:300px;">随访登记</div>
            </div>
        </div>
        <table id="fuvplndg"></table>
    </div>
    <div style="float:left;width:49%;margin-left:10px;">
        <div class="form">
            <div class="row" style="min-height:30px;">
                <div class="search-btn" onclick="toFuvInf()" >随访详情</div>
            </div>
            <div class="row">
                <div class="search-btn" onclick="editFuvInf()" style="margin-left:150px;">随访修改</div>
            </div>
        </div>
        <table id=fuvinfdg></table>
    </div>
</div>

</body>
<script>
    var height = $('#container').height() * 0.88;

    var cstSexCodArray = publicFun.getDict("CST_SEX_COD") || [];

    var zyArray = publicFun.getDict("ZY") || [];
    var plnFuvTypArr = publicFun.getDict('PLN_FUV_TYP');

    var xtMzCodArr = publicFun.getDict('XT_MZ_COD');
    var fuvplnArr = publicFun.getDict('PLN_STA');
    var fuvwayCodArr = publicFun.getDict('XT_FUV_WAY_COD');//随访方式
    var vm = avalon.define({
        $id: 'list',
        advSearch: false,//高级查询
        condition: {
            czfFlg: "",//卒中标识
            csfFlg: '',//创伤标识
            xtfFlg: '',//胸痛标识
            startDate: '',//开始时间
            endDate: '',//结束时间
            lnkNbr: '',//联系电话
        },
        hspFuvPlb: {
            lstFuvTim: '',//上次随访时间
            plnFuvTim: '',//计划随访时间
            plnSta: '',//随访状态
        }
    });

    //新增创建计划
    function cmdaddpln() {
            //是否存在未完成计划判断
            publicFun.httpServ('post', '${baseurl}followup/checkUnFinishPln.do',
                {'hspFuvPlnCustom.patId': "${regSeq}"},
                function (res) {
                    if (res.resultInfo.message == '0') {
                        createmodalwindow("创建计划-" + '${cstNam}', 550, 350, '${baseurl}followup/addfuvpln.do?hspFuvPatCustom.patId=' + "${regSeq}", 'no');
                    } else {
                        publicFun.alert('请先完成或删除先前未完成计划');
                    }
                },
                function (err) {
                }, 10000);}

    //设置表格的列宽
    //pct --- 百分比（取小于1的小数）
    function setWidth(pct) {
        var pWidth = $('.form').width();
        if (pct < 1 && pct >= 0) {
            return pWidth * pct;
        } else {
            return undefined;
        }
    }
    $(function () {
        $('#fuvplndg').datagrid({
            url: 'followup/queryfuvpln_result.do',
            queryParams: {
                'startDate': vm.condition.startDate,
                'endDate': vm.condition.endDate,
                'hspFuvPlnCustom.patId': '${regSeq}'
            },
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [8, 15, 25],
            columns: columns_pln,
            onSelect: function (rowIndex, rowData) {
                $('#fuvinfdg').datagrid({
                    url: 'followup/queryfuvinf_result.do',
                    queryParams: {
                        //'startDate': vm.condition.startDate,
                        //'endDate': vm.condition.endDate,
                        'hspFuvInfCustom.plnSeq': rowData.plnSeq
                    },
                    striped: true,
                    singleSelect: true,
                    pagination: true,
                    rownumbers: true,
                    pageList: [8, 15, 25],
                    columns: column_fuvinf
                });
            }
        });
    })
    $(function () {
        $("#fuvplndg").height(height);
        $('.datagrid-wrap').height(height)
        $('#fuvplndg').datagrid({
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [8, 15, 25],
            columns: columns_pln
        });
        $("#fuvinfdg").height(height);
        $('.datagrid-wrap').height(height)
        $('#fuvinfdg').datagrid({
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            pageList: [8, 15, 253],
            columns: column_fuvinf
        });
    })


    //跳转计划详情
    function tofuvpln() {
        var checkData = $('#fuvplndg').datagrid('getSelected');
        if (checkData) {
            createmodalwindow("计划详情", 550, 200, '${baseurl}followup/tofuvpln.do?hspFuvPlnCustom.plnSeq='+checkData.plnSeq, 'no');
        }else{
            publicFun.alert('未选中记录');
        }
    }

    //跳转随访登记
    function redirectTosfgladd() {
        var checkData = $('#fuvplndg').datagrid('getSelected');
        if (checkData) {
            //判断前驱是否完成
            publicFun.httpServ('post', '${baseurl}followup/checkUnFinishPln.do',
                {'endDate' :publicFun.timeFormat(new Date(checkData.plnFuvTim), 'yyyy/MM/dd'),
                    'hspFuvPlnCustom.patId' :checkData.patId
                },
                function(res) {
                    if(res.resultInfo.message=='0'){
                        var url = 'followup/tofuvadd.do?plnSeq='+checkData.plnSeq+'&patId='+checkData.patId+'&fuvSeq='+checkData.fuvSeq;
                        window.top.addTab('随访登记-' + checkData.patNam+'-'+checkData.plnSeq, url, 'icon icon-emergency-record');
                    }else{
                        publicFun.alert('请先完成或删除先前未完成计划');
                    }
                },
                function(err){},10000);
        }else{
            publicFun.alert('未选中记录');
        }
    }

    function delFuvPln() {
        var checkData = $('#fuvplndg').datagrid('getSelected');
        if (checkData) {
            //是否完成计划判断
            _confirm('是否删除该条数据？', null, function() {
                publicFun.httpServ('post', '${baseurl}followup/deleteplnSeq.do', {'plnSeq': checkData.plnSeq,date: new Date().toTimeString()},function(res) {
                    message_alert(res);
                    $("#dg").datagrid('reload');
                    $("#fuvplndg").datagrid('reload');
                    $("#fuvinfdg").datagrid('reload');
                },function(err){},10000);
            });
        }else{
            publicFun.alert('未选中记录');
        }

    }

    var columns_pln =  [
        [{
            field : 'plnSeq',
            title : '计划编号',
            width : setWidth(0.05)
        },
            {
                field : 'patNam',
                title : '姓名',
                width : setWidth(0.08)
            },
            {
                field : 'plnFuvTyp',
                title : '病种',
                width : setWidth(0.05),
                formatter : function(value, row, index) {
                    if(value)
                        return publicFun.codingEscape(plnFuvTypArr,value);
                    else
                        return '-';
                }
            },
            {
                field : 'plnFuvTim',
                title : '计划日期',
                width : setWidth(0.08),
                formatter : function(value, row, index) {
                    if(value)
                        return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
                }
            },
            {
                field : 'plnStaStr',
                title : '状态',
                width : setWidth(0.08)
            },
            {
                field : 'fuvTim',
                title : '随访日期',
                width : setWidth(0.08),
                formatter : function(value, row, index) {
                    if(value)
                        return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
                }
            },
            {
                field : 'crtUsrNme',
                title : '制定者',
                width : setWidth(0.065),
            },
        ]
    ];

    //详情
    function toFuvInf() {
        var checkData = $('#fuvinfdg').datagrid('getSelected');
        if (checkData) {
            var url = 'followup/tofuvadd.do?plnSeq='+checkData.plnSeq+'&patId='+checkData.patId+'&fuvSeq='+checkData.fuvSeq+'&showSaveButton=0';
            window.top.addTab('随访详情-' + checkData.patNam+'-'+checkData.plnSeq, url, 'icon icon-emergency-record');
        }else{
            publicFun.alert('未选中记录');
        }
    }

    //修改
    function editFuvInf(){
        var checkData = $('#fuvinfdg').datagrid('getSelected');
        if (checkData) {
            var url = 'followup/tofuvadd.do?plnSeq='+checkData.plnSeq+'&patId='+checkData.patId+'&fuvSeq='+checkData.fuvSeq;
            window.top.addTab('随访修改-' + checkData.patNam+'-'+checkData.plnSeq, url, 'icon icon-emergency-record');
        }else{
            publicFun.alert('未选中记录');
        }
    }


    //设置表格的列宽
    //pct --- 百分比（取小于1的小数）
    function setWidth(pct) {
        var pWidth = $('.form').width();
        if (pct < 1 && pct >= 0) {
            return pWidth * pct;
        } else {
            return undefined;
        }
    }

    var column_fuvinf = [
        [{
            field : 'fuvSeq',
            title : '随访编号',
            width : setWidth(0.05)
        },
            {
                field : 'patNam',
                title : '姓名',
                width : setWidth(0.05)
            },
            {
                field : 'patnnnnn',
                title : '病种',
                width : setWidth(0.05)
            },
            {
                field : 'fuvWayCod',
                title : '随访方式',
                width : setWidth(0.05),
                formatter : function(value, row, index) {
                    if(value)
                        return publicFun.codingEscape(fuvwayCodArr,value);
                    else
                        return '';
                }
            },
            {
                field : 'fuvTim',
                title : '随访日期',
                width : setWidth(0.08),
                formatter : function(value, row, index) {
                    if(value)
                        return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd ');
                }
            },
            {
                field : 'plnSta',
                title : '状态',
                width : setWidth(0.05),
                formatter : function(value, row, index) {
                    return publicFun.codingEscape(fuvplnArr,value);
                }
            },
            {
                field : 'docNam',
                title : '随访医生',
                width : setWidth(0.05),
            },
            {
                field : 'fuvGrpNam',
                title : '随访组',
                width : setWidth(0.08),
            },
        ]];

</script>
</html>