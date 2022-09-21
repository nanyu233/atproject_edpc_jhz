<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>心电图</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <link rel="stylesheet" href="css/viewer.min.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>

    <script type="text/javascript" src="${baseurl}js/viewer.js"></script>
    <script type="text/javascript" src="${baseurl}js/jquery.viewer.js"></script>

    <script type="text/javascript" src="${baseurl}lib/moment.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>

    <style>
        body {
            position: relative;
        }
        .no-data{
            width: 100%;
        }
        .no-data .hint{
            padding: 20px 0;
            text-align: center;
            line-height: 35px;
            color:#888888;
        }
        .no-data .hint img{
            width: 100px;
            height: 65px;
        }
        .box {
            position: absolute;
            left: 50%;
            top: 0;
            bottom: 0;
            transform: translateX(-50%);
            width: 60%;
            border: 1px solid #CCCCCC;
        }

        .box .title {
            background: #3876ba;
            color: #FFFFFF;
            font-weight: bold;
            padding: 10px;
            border-bottom: 1px solid #CCCCCC;
        }

        .top table {
            text-align: center;
            border-collapse: collapse;
            width: 90%;
            margin: 10px 5%;
        }

        .top table .btn {
            border: 1px solid #3876ba;
            color: #3876ba;
            margin: 10px 0;
            padding: 5px 0;
            border-radius: 5px;
            width: 80px;
            display: inline-block;
        }

        .top table .btn:hover {
            cursor: pointer;
            background: #3876ba;
            color: #FFFFFF;
        }

        .bottom {
            border-top: 1px solid #CCCCCC;
            position: relative;
        }
        .bottom .pic{
            position: absolute;
            left: 50%;
            transform: translateX(-50%);
            width: 300px;
            height: 400px;
            margin-top: 20px;
        }
        .pic img{
            width: 100%;
            height: 100%;
        }
    </style>
</head>
<body>
<div class="box" ms-controller="ecg">
    <div class="top">
        <div class="title">心电图（系统获取）</div>
        <table ms-if="ecgList.length" border="1">
            <tr>
                <th>心电图名称</th>
                <th>完成时间</th>
                <th>诊断时间</th>
                <th></th>
            </tr>
            <tr ms-repeat="ecgList">
                <td>{{el.fileName}}</td>
                <td>{{el.fileDate}}</td>
                <td>{{el.fileDiaDate}}</td>
                <td>
                    <div class="btn" ms-click="viewEcg(el.filePath)">点击查看</div>
                </td>
            </tr>
        </table>
        <div class="no-data" ms-if="!ecgList.length">
            <div class="hint">
                <img src="${baseUrl}images/edpc/no-data.png" alt="">
                <div>暂无数据</div>
            </div>
        </div>
    </div>
    <div class="bottom">
        <div class="title">心电图（拍照上传）</div>
        <div ms-if="ecgImg" class="images" id="imgBox2">
        </div>
        <div class="no-data" ms-if="!ecgList.length">
            <div class="hint">
                <img src="${baseUrl}images/edpc/no-data.png" alt="">
                <div>暂无数据</div>
            </div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript">
    var vm = avalon.define({
        $id: 'ecg',
        ecgList: [],
        ecgImg: '',
        viewEcg: function (url) {
            window.open(url);
        }
    });

    $(function () {
        //获取心电图列表
        /*
        $.ajax({
            url: 'cpc/getECGInfo.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                emgSeq: '${emgSeq}',
                wayTyp: '${wayTyp}'
            }),
            success: function (res) {
            	
                var _list = res.resultInfo.sysdata.ecgList || [];
                if (_list.length) {
                    _list.forEach(function (el) {
                        el.fileDate = moment(el.fileDate).format('YYYY-MM-DD HH:mm');
                        el.fileDiaDate = moment(el.fileDiaDate).format('YYYY-MM-DD HH:mm')
                    });
                }
                
                var hspEcgInf = res.resultInfo.sysdata.hspEcgInf;
                if(hspEcgInf){
                	 el.fileDate = moment(hspEcgInf.fileDate).format('YYYY-MM-DD HH:mm');
                     el.fileDiaDate = moment(hspEcgInf.fileDiaDate).format('YYYY-MM-DD HH:mm')
                }
                vm.ecgList = _list;
            },
            error: function (err) {
                //console.log(err)
            }
        });
        */
        //获取拍照上传的心电图
        $.ajax({
            url: 'cpc/getManualEcgInf.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                emgSeq: '${emgSeq}'
            }),
            success: function (res) {
                vm.ecgImg = 'http://192.168.12.135:8500/export/ecg/' + res.resultInfo.sysdata.ecg.fileName;
                var _imgHtml =  '<div class="pic">' +
                    '<img src=' + vm.ecgImg + ' data-original='+ vm.ecgImg +' alt="">'
                    +'</div>';
                $('#imgBox2').append(_imgHtml).viewer({url: 'data-original'});

            },
            error: function (err) {
                //console.log(err)
            }
        });
    })
</script>
</html>