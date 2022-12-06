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
    </style>
</head>

<body ms-controller="timeset" id="container">
<!-- html的静态布局 -->
<div class="timeset">
    <table id="nodeList"></table>
</div>
</body>
<script type="text/javascript">
    var height = $('.timeset').height()
    var vm = avalon.define({
        $id: 'timeset',
    });
    function getWidth(proportion) {
        var width = $(".timeset").width();
        return Math.round(proportion * width);
    }
    function getColumns() {
        var columns_v = [
            [{

            },{
                field: 'datDat',
                title: '数据日期',
                width: getWidth(0.2)
            },{
                field: 'objNam',
                title: '质控中文名称',
                width: getWidth(0.68)
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
        queryParams['hspTimDiffCustom.disTyp'] = vm.disTyp;
        queryParams['hspTimDiffCustom.objTyp'] = vm.objTyp;
        $("#nodeList").datagrid('reload');
    }
    function getnodeList(){
        h3 = height;
        $("#nodeList").height(h3);
        $('.datagrid-wrap').height(h3)
        $('#nodeList').datagrid({
            url: '${baseurl}cpc/queryTimeLineHis.do',
            queryParams: {
                "hspTimDiffHisCustom.disTyp":parent.vm.disTyp,
                "hspTimDiffHisCustom.objTyp":parent.vm.objTyp,
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