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
            border: 1px solid #eeeeee;
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
            right: 10px;
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
<div ms-controller="list" style="width:100%;height:50%;">
    <div class="form">
        <div class="row form-item">
            <label>计划时间</label>
            <input class="input-date Wdate" id="_startdate" type="text" ms-duplex-string="condition.startDate"
                   onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <lable style="width:3px;">-</lable>
            <input class="input-date Wdate" id="_enddate" type="text" ms-duplex-string="condition.endDate"
                   onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
            <input type="text" placeholder="请输入姓名" ms-duplex-string="condition.cstNam"/>
            <input type="text" placeholder="请输入联系电话" ms-duplex-string="condition.lnkNbr"/>
            <div class="search-btn" onclick="queryfuv()" style="margin-right:450px;">查询</div>
        </div>
        <div class="row">
            <div class="search-btn" onclick="cmdadd()" style="margin-right:300px;">患者添加</div>
        </div>
        <div class="row">
            <div class="search-btn" onclick="cmdaddpln()" style="margin-right:150px;">创建计划</div>
        </div>
        <div class="row">
            <div class="search-btn" onclick="cmdpat()">患者详情</div>
        </div>
    </div>
    <table id="dg"></table>
</div>
<div style="width:100%;height:50%;">
    <div style="float:left;width:50%;">
        <%@ include file="/WEB-INF/jsp/edpc/followup/queryfuvpln.jsp" %>
    </div>
    <div style="float:left;width:49%;margin-left:10px;">
        <%@ include file="/WEB-INF/jsp/edpc/followup/queryfuvinf.jsp" %>
    </div>
</div>

</body>
<script>
    var height = $('#container').height() * 0.5;

    var cstSexCodArray = publicFun.getDict("CST_SEX_COD") || [];

    var zyArray = publicFun.getDict("ZY") || [];


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

    function queryfuv() {
        var queryParams = $('#dg').datagrid('options').queryParams;
        queryParams['czfFlg'] = vm.condition.czfFlg;
        queryParams['csfFlg'] = vm.condition.csfFlg;
        queryParams['xtfFlg'] = vm.condition.xtfFlg;
        queryParams['startDate'] = vm.condition.startDate;
        queryParams['endDate'] = vm.condition.endDate;
        queryParams['hspFuvPatCustom.patNam'] = vm.condition.cstNam;
        queryParams['hspFuvPatCustom.lnkNbr'] = vm.condition.lnkNbr;
        $("#dg").datagrid('reload');
    }

    //新增
    function cmdadd() {
        createmodalwindow("新增患者", 750, 500, '${baseurl}followup/addfuvXt.do', 'no');
    }

    //新增创建计划
    function cmdaddpln() {
        var checkData = $('#dg').datagrid('getSelected');
        if (checkData) {
            //是否存在未完成计划判断
            publicFun.httpServ('post', '${baseurl}followup/checkUnFinishPln.do',
                {'hspFuvPlnCustom.patId': checkData.patId},
                function (res) {
                    if (res.resultInfo.message == '0') {
                        createmodalwindow("创建计划-" + checkData.patNam, 550, 350, '${baseurl}followup/addfuvpln.do?hspFuvPatCustom.patId=' + checkData.patId, 'no');
                    } else {
                        publicFun.alert('请先完成或删除先前未完成计划');
                    }
                },
                function (err) {
                }, 10000);
        } else {
            publicFun.alert('未选中记录');
        }
    }

    //跳转患者详情
    function cmdpat() {
        var checkData = $('#dg').datagrid('getSelected');
        if (checkData) {
            createmodalwindow("患者详情-" + checkData.patNam, 550, 300, '${baseurl}followup/tofuvpat.do?hspFuvPatCustom.patId=' + checkData.patId, 'no');
        } else {
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

    function toDetail(emgSeq, cstNam, wayTyp) {
        var url = 'cpc/toXtxqPage.do?emgSeq=' + emgSeq + '&wayTyp=' + wayTyp;
        if (cstNam == 'null') {
            cstNam = "";
        }
        window.top.addTab(cstNam + "-" + '胸痛上报', url, 'icon icon-emergency-record');
    }

    $(function () {
        if (vm.advSearch == false) {
            h3 = height - 56;
            $("#dg").height(h3);
            $('.datagrid-wrap').height(h3)
        }
        $('#dg').datagrid({
            url: 'followup/queryfuv_resultXt.do',
            queryParams: {
                'czfFlg': vm.condition.czfFlg,
                'csfFlg': vm.condition.csfFlg,
                'xtfFlg': vm.condition.xtfFlg,
                'startDate': vm.condition.startDate,
                'endDate': vm.condition.endDate,
                'hspFuvPatCustom.patNam': vm.condition.cstNam,
                'hspFuvPatCustom.lnkNbr': vm.condition.lnkNbr
            },
            striped: true,
            singleSelect: true,
            pagination: true,
            rownumbers: true,
            onSelect: function (rowIndex, rowData) {
                $('#fuvplndg').datagrid({
                    url: 'followup/queryfuvpln_result.do',
                    queryParams: {
                        'startDate': vm.condition.startDate,
                        'endDate': vm.condition.endDate,
                        'hspFuvPlnCustom.patId': rowData.patId
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
            },
            pageList: [8, 15, 25],
            columns: [[
                {
                    field: 'patId',
                    title: '患者id',
                    width: setWidth(0.08)
                },
                {
                    field: 'patNam',
                    title: '患者姓名',
                    width: setWidth(0.08)
                },
                {
                    field: 'bthDat',
                    title: '年龄',
                    width: setWidth(0.04),
                    formatter: function (value, row, index) {
                        if (value) {
                            var bthDat = publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
                            return (publicFun.calculateAge(bthDat).Age + publicFun.calculateAge(bthDat).typeStr);
                        } else {
                            return '';
                        }
                    }
                },
                {
                    field: 'cstSexCod',
                    title: '性别',
                    width: setWidth(0.04),
                    formatter: function (value, row, index) {
                        return publicFun.codingEscape(cstSexCodArray, value);
                    }
                },
                {
                    field: 'patNatCodStr',
                    title: '民族',
                    width: setWidth(0.04)
                },
                {
                    field: 'lnkNbr',
                    title: '联系电话',
                    width: setWidth(0.08),
                },
                {
                    field: 'marStaCodStr',
                    title: '婚姻状况',
                    width: setWidth(0.06)
                },
                {
                    field: 'patJobStr',
                    title: '职业',
                    width: setWidth(0.06),
                    // formatter: function (value, row, index) {
                    //     return publicFun.codingEscape(zyArray, value);
                    // }
                },
                {
                    field: 'patTel',
                    title: '电话',
                    width: setWidth(0.08),
                },
                {
                    field: 'patAdr',
                    title: '地址',
                    width: setWidth(0.1),
                },
                {
                    field: 'lstFuvTim',
                    title: '上次随访时间',
                    width: setWidth(0.08),
                    formatter: function (value, row, index) {
                        if (value)
                            return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
                        else
                            return '';
                    }
                },
                {
                    field: 'plnFuvTim',
                    title: '计划随访时间',
                    width: setWidth(0.08),
                    formatter: function (value, row, index) {
                        if (value)
                            return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd');
                        else
                            return '';
                    }
                },
                {
                    field: 'fuvStaStr',
                    title: '随访状态',
                    width: setWidth(0.1),
                    formatter: function (value, row, index) {
                        if (value)
                            return value;
                        else
                            return '无随访';
                    }
                },
                {
                    field: 'lftNum',
                    title: '剩余期数',
                    width: setWidth(0.1),
                    formatter: function (value, row, index) {
                        if (value > 0)
                            return value + '期';
                        else
                            return '无';
                    }
                }
            ]]
        });
    })
</script>
</html>