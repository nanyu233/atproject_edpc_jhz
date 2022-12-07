<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>历史记录</title>
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
            width: 100%;
            height: 100%;
        }
        .row{
            display: flex;
            padding: 5px 0;
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
    </style>
</head>

<body ms-controller="timeset" id="container">
<!-- html的静态布局 -->
<div class="timeset">
    <div class="row">
        <select id="entity" ms-duplex="disTyp">
            <option value="">请选择病种</option>
            <option value="1">胸痛</option>
            <option value="2">卒中</option>
            <option value="3">创伤</option>
        </select>
        <select id="standard" ms-duplex="objTyp">
            <option value="">请选择基准类型</option>
<%--            <option value="1">国标</option>--%>
<%--            <option value="2">院标</option>--%>
            <option value="3">月平均</option>
            <option value="4">月中位</option>
            <option value="5">年均</option>
            <option value="6">年中位</option>
<%--            <option value="9">全部</option>--%>
        </select>
        <select  ms-duplex="objEnm">
            <option value="">请选择</option>
            <option ms-repeat="objenmList" ms-attr-value="el.infocode">{{el.info}}</option>
        </select>
        <div class="search-btn search" onclick="search()">查询</div>
    </div>
    <table id="nodeList"></table>
</div>
</body>
<script type="text/javascript">
    var height = $('.timeset').height()
    var msgList={
        objenmList:[{info:'EKG1',infocode:'EKG1'},{info:'EKG2',infocode:'EKG2'},{info:'INSRPT',infocode:'INSRPT'},{info:'CATHLAB',infocode:'CATHLAB'},{info:'DUAL',infocode:'DUAL'},{info:'CTRPT',infocode:'CTRPT'},{info:'D2N',infocode:'D2N'},{info:'D2B',infocode:'D2B'},]
    }
    var vm = avalon.define({
        $id: 'timeset',
        disTyp:'1',
        objTyp:'3',
        objEnm:'',
        objenmList:msgList.objenmList
    });
    function getWidth(proportion) {
        var width = $(".timeset").width();
        return Math.round(proportion * width);
    }
    function getColumns() {
        var columns_v = [
            [{
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
            },{
                field: 'datDat',
                title: '数据日期',
                width: getWidth(0.1)
            },{
                field: 'objNam',
                title: '质控中文名称',
                width: getWidth(0.2)
            },{
                field: 'objDes',
                title: '质控描述',
                width: getWidth(0.5)
            },{
                field: 'timDif',
                title: '质控时间（秒）',
                width: getWidth(0.1)
            },]
        ];
        return columns_v;
    }
    function search() {
        var queryParams = $('#nodeList').datagrid('options').queryParams;
        queryParams['hspTimDiffHisCustom.disTyp'] = vm.disTyp;
        queryParams['hspTimDiffHisCustom.objTyp'] = vm.objTyp;
        queryParams['hspTimDiffHisCustom.objEnm'] = vm.objEnm;
        $("#nodeList").datagrid('reload');
    }
    function getnodeList(){
        h3 = height-40;
        $("#nodeList").height(h3);
        $('.datagrid-wrap').height(h3)
        $('#nodeList').datagrid({
            url: '${baseurl}cpc/queryTimeLineHis.do',
            queryParams: {
                "hspTimDiffHisCustom.disTyp":vm.disTyp,
                "hspTimDiffHisCustom.objTyp":vm.objTyp,
                "hspTimDiffHisCustom.objEnm":vm.objEnm,
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