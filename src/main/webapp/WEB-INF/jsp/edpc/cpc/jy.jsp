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
    <title>检验结果</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <style>
        body{
            overflow: scroll;
            position: relative;
        }
        .no-data{
            width: 100%;
        }
        .no-data .hint{
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            padding: 20px 0;
            text-align: center;
            line-height: 35px;
            color:#888888;
        }
        .no-data .hint img{
            width: 100px;
            height: 65px;
        }
        .data{
            position: absolute;
            top: 0;
            right: 50px;
            width: 50%;
            margin-left: 20px;
        }
        .data .detail{
            width: 100%;
            line-height: 30px;
        }
        .data .detail .title td{
            border-top: 1px solid #CCCCCC;
            border-bottom: 1px solid #CCCCCC;
        }
        .data .detail tr td{
            width: 10%;
            text-align: center;
        }
        .data .detail tr .col_l{
            width:35%;
        }
        .list{
            position: absolute;
            left: 0;
            top: 0;
            width: 40%;
            min-width: 400px;
            border:1px solid #CCCCCC;
            text-align: center;
            line-height:35px
        }
        .list tr:hover{
            cursor: pointer;
        }
        .active{
            background: #95B8E7;
            color: #FFFFFF;
        }
    </style>
</head>
<body ms-controller="jy">
<div class="no-data" ms-if="!list.length">
    <div class="hint">
        <img src="${baseUrl}images/edpc/no-data.png" alt="">
        <div>暂无数据</div>
    </div>
</div>
<table ms-if="list.length" class="list" border="1" style="border-collapse: collapse">
    <thead>
    <tr>
        <th>检验项目</th><th>检验时间</th>
    </tr>
    </thead>
    <tr ms-repeat="list" ms-click="chooseItem(el)" ms-class="active:el.sampleno==currItem.sampleno">
        <td>{{el.examinaim}}</td>
        <td>{{el.resultDateTime}}</td>
    </tr>
</table>
<div ms-if="list.length" class="data">
    <table class="detail" style="border-collapse: collapse">
        <tr class="title">
            <td class="col_l">检验项目</td>
            <td>结果</td>
            <td></td>
            <td class="col_l">参考值</td>
            <td>单位</td>
        </tr>
        <tr ms-repeat="currItem.data">
            <td class="col_l">{{el.reportItemName}}</td>
            <td>{{el.result}}</td>
            <td>{{el.errorFlag}}</td>
            <td class="col_l">{{el.lowerLimit}}-{{el.upperLimit}}</td>
            <td>{{el.units}}</td>
        </tr>
    </table>
</div>
</body>
<script>
    var vm = avalon.define({
        $id: 'jy',
        list: [],
        currItem:{},
        chooseItem: function(item){
            vm.currItem = {};
            vm.currItem = item;
        }
    });

    $(function () {
        $.ajax({
            url: 'cpc/getJyjcInfo.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': '${emgSeq}',
                'wayTyp': '${wayTyp}',
            }),
            success: function (res) {
                var _list = res.resultInfo.sysdata.jyjgList || [];
                if(_list && _list.length){
                    _list.forEach(function (el) {
                        el.resultDateTime = moment(el.resultDateTime).format('YYYY-MM-DD HH:mm:ss')
                    });
                    vm.list = _list;
                    vm.currItem = _list[0];
                }

            },
            error: function (err) {
                //console.log(err)
            }
        });
    })
</script>
</html>