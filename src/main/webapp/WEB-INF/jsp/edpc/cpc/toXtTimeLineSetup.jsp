<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>时间轴基准设置</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css"/>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/highcharts.js" type="text/javascript"></script>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <style type="text/css">
        .timeset {
            width: 95%;
            height: 99%;
            margin: 0 auto;
            border: 1px solid #000;
        }

        .timeset .title {
            width: 100%;
            height: 60px;
            line-height: 60px;
            text-align: center;
            background: #87ceeb;
            font-size: 24px;
            font-weight: 600;
            border-bottom: 1px solid #000;
        }
        .row{
            display: flex;
            padding: 20px 0 5px 0;
            border-bottom: 1px solid #000;
        }

        .row .search-btn {
            width: 80px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 32px;
            text-align: center;
            line-height: 32px;
            margin: 0 10px;
        }

        .row select{
            width: 120px;
            height: 32px !important;
            line-height: 32px !important;
        }
        .attention{
            font-size: 22px;
            font-weight: 600;
            height: 32px;
            line-height: 32px;
        }
        .attention span{
            color: red;
        }
        .datagrid-btable tr{
            height: 32px;
            line-height: 32px;
        }
        .panel{
            padding-top: 5px;
        }
    </style>
</head>

<body ms-controller="timeset" id="container">
<!-- html的静态布局 -->
<div class="timeset">
    <div class="title">基准节点质控设置</div>
    <div class="form">
        <div class="row">
            <select id="entity" ms-duplex="disTyp">
                <option value="">请选择病种</option>
                <option value="1">胸痛</option>
                <option value="2">卒中</option>
                <option value="3">创伤</option>
            </select>
            <select id="standard" ms-duplex="objTyp">
                <option value="">请选择基准类型</option>
                <option value="1">国标</option>
                <option value="2">院标</option>
                <option value="3">月平均</option>
                <option value="4">月中位</option>
                <option value="5">年均</option>
                <option value="6">年中位</option>
                <option value="9">全部</option>
            </select>
            <div class="search-btn search" onclick="search()">查询</div>
            <div class="search-btn" onclick="updata()">修改</div>
            <div class="search-btn" onclick="histclick()">历史记录</div>
            <div class="attention">注意：历史记录只对<span>月平均、</span><span>月中位、</span><span>年平均、</span><span>年中位、</span><span>全年</span>进行历史数据保留</div>
        </div>
        <table id="nodeList"></table>
    </div>
</div>
</body>
<script type="text/javascript">
    var height = $('.timeset').height()
    var vm = avalon.define({
        $id: 'timeset',
        disTyp:'1',
        objTyp:'1',
        objOdr:'',
        objNam:'',
        timDif:'',
    });
    function getWidth(proportion) {
        var width = $(".timeset").width();
        return Math.round(proportion * width);
    }
    function getColumns() {
        var columns_v = [
            [{

            },{
                field: 'disTyp',
                title: '病种',
                width: getWidth(0.04),
                formatter:function (value, row, index){
                    var obj={1:'胸痛',2:'卒中',3:'创伤'}
                    return obj[value]
                }
            }, {
                field: 'objTyp',
                title: '基准类型',
                width: getWidth(0.05),
                formatter:function (value, row, index){
                    var obj={1:'国标',2:'院标',3:'月平均',4:'月中位',5:'年均',6:'年中位',9:'全部'}
                    return obj[value]
                }
            }, {
                field: 'objEnm',
                title: '质控英文缩写',
                width: getWidth(0.05)
            }, {
                field: 'objNam',
                title: '质控中文名称',
                width: getWidth(0.09),
               formatter:function (value,row,index){
                   var _html = '<input type="text" id="objNam" onblur=updateval(event,"objNam") autocomplete="off" style="width: 98%;margin: 0 auto" value=' +value +'>'
                       return _html
               }
            }, {
                field: 'objDes',
                title: '质控描述',
                width: getWidth(0.21)
            }, {
                field: 'objOdr',
                title: '排序位',
                width: getWidth(0.03),
                formatter:function (value,row,index){
                    var _html = '<input type="text" id="objOdr" onblur=updateval(event,"objOdr") autocomplete="off"  style="width: 95%;margin: 0 auto;text-align: center" value=' +value +'>'
                    return _html
                }
            }, {
                field: 'timBegCod',
                title: '节点起始编码',
                width: getWidth(0.06)
            }, {
                field: 'timBegNam',
                title: '节点起始名称',
                width: getWidth(0.07)
            }, {
                field: 'timEndCod',
                title: '节点起始编码',
                width: getWidth(0.06)
            }, {
                field: 'timEndNam',
                title: '节点起始名称',
                width: getWidth(0.07)
            }, {
                field: 'timDif',
                title: '质控时间（秒）',
                width: getWidth(0.05),
                formatter:function (value,row,index){
                    var _html = '<input type="text" id="timDif" autocomplete="off" onblur=updateval(event,"timDif")  style="width: 95%;margin: 0 auto" value=' +value +'>'
                    return _html
                }
            }, {
                field: 'objMem',
                title: '备注',
                width: getWidth(0.05)
            }, {
                field: 'chgTim',
                title: '修改时间',
                width: getWidth(0.1),
                formatter:function (value,row,index){
                    return publicFun.timeFormat(value,'yyyy-MM-dd hh:mm')
                }
            }, {
                field: 'chgUsrNam',
                title: '修改人',
                width: getWidth(0.05)
            }]
        ];
        return columns_v;
    }
    function search() {
        var queryParams = $('#nodeList').datagrid('options').queryParams;
        queryParams['hspTimDiffCustom.disTyp'] = vm.disTyp;
        queryParams['hspTimDiffCustom.objTyp'] = vm.objTyp;
        $("#nodeList").datagrid('reload');
    }
    function updateval(e,val){
        vm[val]=e.target.value
    }
    function updata(){
        var checkedRows = $('#nodeList').datagrid('getSelected')
        if(checkedRows==null){
            publicFun.alert('请选择一条记录')
        }else{
            publicFun.httpRequest(
                '${baseurl}cpc/updateTimeLineCriterion.do',
                {
                    "hspTimDiffCustom":{
                        'objNam': vm.objNam || checkedRows.objNam,
                        'objOdr': vm.objOdr || checkedRows.objOdr,
                        'timDif': vm.timDif || checkedRows.timDif,
                        'disTyp': checkedRows.disTyp,
                        'objTyp': checkedRows.objTyp,
                        'objEnm': checkedRows.objEnm,
                    }
                },
                {
                    'ajaxType': 'post',
                    'requestType': 'json'
                },
                function (res) {
                    if (res.resultInfo.success){
                        $.messager.alert('消息提示','修改成功','success')
                        search();
                    }
                }
            )
        }
    }
    function histclick(){
        createmodalwindow("历史记录", 900, 500, '${baseurl}cpc/toQCHistory.do', 'no');
    }
    function getnodeList(){
        h3 = height-135;
        $("#nodeList").height(h3);
        $('.datagrid-wrap').height(h3)
        $('#nodeList').datagrid({
            url: '${baseurl}cpc/queryTimeLineCriterion.do',
            queryParams: {
                "hspTimDiffCustom.disTyp":vm.disTyp,
                "hspTimDiffCustom.objTyp":vm.objTyp,
            },
            striped: false,
            singleSelect: true,
            pagination: true,
            rownumbers: false,
            columns: getColumns()
        })
    }
    $(function () {
        getnodeList()
    });
</script>
</html>