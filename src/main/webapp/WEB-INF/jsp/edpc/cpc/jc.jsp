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
    <title>检查报告</title>
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
        body {
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
        .report {
            width: 60%;
            position: absolute;
            left: 50%;
            bottom: 0;
            top: 0;
            transform: translateX(-50%);
            border: 1px solid #CCCCCC;
            line-height: 30px;
        }

        .wrapper {
            border-bottom: 1px solid #CCCCCC;
            padding: 10px;
        }
        .wrapper:last-child{
            border: none;
        }

        .item > div {
            display: inline-block;
        }

        .item .title {
            color: #3876ba;
        }
        .btn{
            background: #3876ba;
            color: #FFFFFF;
            width: 70px;
            text-align: center;
            height: 35px;
            line-height: 35px;
            position: absolute;
            right: 0;
            border-radius: 5px;
        }
        .btn:hover{
            cursor: pointer;
        }
    </style>
</head>
<body ms-controller="jc">
<div class="no-data" ms-if="!list.length">
    <div class="hint">
        <img src="${baseUrl}images/edpc/no-data.png" alt="">
        <div>暂无数据</div>
    </div>
</div>
<div class="report" ms-if="list.length">
    <div class="wrapper" ms-repeat="list">
        <div class="item" style="position: relative">
            <div class="title">检查项目：</div>
            <div>{{el.ylmc}}</div>
            <div class="btn" ms-click="toggle(el)">
                <span ms-if="!el.show">展开</span>
                <span ms-if="el.show">收起</span>
            </div>
        </div>
        <div ms-if="el.show">
            <div class="item">
                <div class="title">检查描述：</div>
                <div>{{el.see}}</div>
            </div>
            <div class="item">
                <div class="title">检查结论：</div>
                <div>{{el.jcjg}}</div>
            </div>
            <div class="item">
                <div class="title">报告时间：</div>
                <div>{{el.shrq}}</div>
            </div>
            <div class="item">
                <div class="title">报告医生：</div>
                <div>{{el.jcysxm}}</div>
            </div>
            <div class="item">
                <div class="title">审核医生：</div>
                <div>{{el.examineDocName}}</div>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    var vm = avalon.define({
        $id: 'jc',
        list: [],
        toggle:function (el) {
            var _list = vm.list;
            for (var i=0; i<_list.length; i++){
                if(el.applicationNo == _list[i].applicationNo){
                    el.show = !el.show;
                    break;
                }
            }
            vm.list = _list;
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
                var _list = res.resultInfo.sysdata.jcjgList || [];
                if (_list && _list.length) {
                    _list.forEach(function (el) {
                        el.shrq = moment(el.shrq).format('YYYY-MM-DD HH:mm:ss');
                        el.show = false;
                    });
                    vm.list = _list;
                    console.log(vm.list);
                    // vm.currItem = _list[0];
                }

            },
            error: function (err) {
                //console.log(err)
            }
        });
    })
</script>
</html>