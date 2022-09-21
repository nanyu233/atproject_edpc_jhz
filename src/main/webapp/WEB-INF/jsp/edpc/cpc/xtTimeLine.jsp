<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <base href="<%=basePath%>">

    <title>急性胸痛患者诊疗时间轴</title>
    <script type="text/javascript" src="${baseurl}lib/moment.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/My97DatePicker/WdatePicker.js"></script>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/subpageJs/huzhospital/xthzdj.avalon.js?6" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/public.js"></script>
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/My97DatePicker/skin/WdatePicker.css"/>
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/default/easyui.css"/>
    <style>
        .info {
            border: 1px solid #ddd;
            margin-bottom: 10px;
        }

        .info h4 {
            margin: 10px 0;
            padding: 0 0 10px 10px;
            border-bottom: 1px solid #ddd;
        }

        .one {
            background-color: #FBD4B4;
        }

        .wrapper div {
            display: inline-block;
            /* border: 1px solid black; */
            margin: 10px 0 10px 10px;
        }

        .info input[type="text"] {
            border: none;
            border-bottom: 1px solid black;
            background-color: transparent;
            text-align: center;
            font-size: 15px;
        }

        .longInput {
            width: 132px !important;
        }

        .shortInput {
            width: 50px !important;
        }

        .Wdate {
            width: 178px;
        }

        .shortTimeInput {
            width: 75px !important;
        }

        .btns {
            border: 1px solid #ddd;
            text-align: center;
        }

        .btns a {
            display: inline-block;
            width: 120px;
            text-align: center;
            height: 35px;
            line-height: 35px;
            margin: 10px;
            border-radius: 5px;
            border: 1px solid #adcde2;
            background-color: #D2F0FF;
            cursor: pointer;
        }

        .hidden {
            display: none;
        }
    </style>

</head>

<body ms-controller="xthzdj">
	<img alt="" src="images/xt/timeLine.png">

</body>

</html>