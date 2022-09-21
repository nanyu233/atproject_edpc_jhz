<%@ page language="java" import="java.util.*" pageEncoding="UTF8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
    <title>卒中急救时间轴</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css"/>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/highcharts.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/modules/exporting.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/modules/oldie.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/modules/timeline.js"></script>
    <style type="text/css">
        .form_cat{
            min-width: 1440px;
            max-width: 100%;
            overflow: scroll;
        }

        tr td{
            text-align:center;
        }
        .odd{
            vertical-align:bottom;
        }
        .even{
            text-align:left;
        }
        .orange{
            color: orange;
        }
        .time{
            text-align:center;
            height:11px;
            line-height:11px;
        }
        .cost{
            text-align:center;
            height:13px;
            line-height:13px;
        }
        .line{
            text-align:center;
            height:0.6em;
            line-height:0.6em;
        }
        .desc{
            margin: 40px 0 20px 20px;
            line-height: 30px;
        }
        .desc .title{
            font-weight: bold;
        }
        .basic-info {
            height: 60px;
            line-height: 60px;
            max-width: 100%;
        }
        .basic-info .item{
            margin: 0 15px;
        }
        .basic-info .item .name{
            color: #0d478f;
            font-weight: bold;
        }
        .basic-info .item .value{
            font-weight: bold;
        }
    </style>
</head>

<body ms-controller="timeLine">
<!-- html的静态布局 -->
<form id="timelineform" name="timelineform" action="${baseurl}report/exportjhz.do" method="post">
    <input type="text" class="hidden" id="emgSeq" name="emgSeq" value="${emgSeq }"/>
    <div class="chart_grp chartbox">
        <div class="form_cat border-radius box-shadow">
            <div class="basic-info">
                <span class="item">姓名：<span class="name">{{info.cstNam}}</span></span>
                <span class="item">年龄：<span class="value">{{info.cstAge}}岁</span></span>
                <span class="item">性别：<span class="value">{{info.cstSexCod}}</span></span>
                <span class="item">住院号：<span class="value"></span></span>
                <span class="item">门诊号：<span class="value"></span></span>
                <span class="item">呼救时间：<span class="value"></span></span>
                <span class="item">诊断：<span class="value"></span></span>
            </div>
            <table style='text-align:left;margin: 20px;' border='0' cellspacing='0' cellpadding='0'>
                <tr>
                    <td style='text-align: center;' rowspan='4'>时间节点：</td>
                    <td ms-repeat="pointArr" ms-class="odd:($index+1)%2 !=0" ms-class-1="orange:el.keyTime==2" ms-attr-rowspan="($index+1)%2 !=0 ?'4':''">
                        {{el.proName}}
                    </td>
                </tr>
                <tr>
                    <td class="time" ms-repeat="pointArr" ms-class="orange:el.keyTime==2"
                        ms-visible="($index+1)%2==0">↑</td>
                </tr>
                <tr>
                    <td class="time" ms-repeat="pointArr" ms-class="orange:el.keyTime==2"
                        ms-visible="($index+1)%2==0">︱</td>
                </tr>
                <tr>
                    <td class="time" ms-repeat="pointArr" ms-class="orange:el.keyTime==2"
                        ms-visible="($index+1)%2==0">︱</td>
                </tr>
                <tr>
                    <td class="time">&nbsp;</td>
                    <td class="time" ms-repeat="pointArr" ms-class="orange:el.keyTime==2">
                        <span ms-if="($index+1)%2!=0">↑</span>
                        <span ms-if="($index+1)%2==0">︱</span>
                    </td>
                    <td class="time"></td>
                </tr>
                <tr>
                    <td class="line"></td>
                    <td class="line" ms-repeat="pointArr">
                        <span ms-class="orange:el.keyTime==2">︱</span>
                    </td>
                    <td class="line"></td>
                </tr>
                <tr>
                    <td style='width: 70px; height: 1px; text-align: center; color: rgb(51, 0, 255); line-height: 1px; '>
                        <img width='100%' height='1' style='min-width: 70px;' src='${baseurl}images/edpc/line1.gif'>
                    </td>
                    <td ms-repeat="pointArr" style='text-align:center;width:50px;height:1px;line-height:1px;color:#3300FF;'>
                    <img src='${baseurl}images/edpc/line1.gif' width='100%' height='1' style='min-width:55px;'/>
                    </td>
                    <td style='text-align:left;width:50px;height:1px;line-height:1px;color:#3300FF;'><img
                            src='${baseurl}images/edpc/line1.gif' width="100%" height='1' style='min-width:55px;'/></td>
                </tr>
                <tr>
                    <td class="line">&nbsp;</td>
                    <td ms-repeat="pointArr" class="line">
                        <span ms-class="orange:el.keyTime==2">︱</span>
                    </td>
                    <td class="line"></td>
                </tr>
                <tr>
                    <td class="time">&nbsp;</td>
                    <td class="time" ms-repeat="pointArr" ms-class="orange:el.keyTime==2">
                        <span ms-if="($index+1)%2 != 0">↓</span>
                        <span ms-if="($index+1)%2 == 0">︱</span>
                    </td>
                    <td class="time"></td>
                </tr>
                <tr>
                    <td class="time">发生时间：</td>
                    <td ms-repeat="pointArr" class="time" ms-class="orange:el.keyTime==2">
                        <span ms-if="($index+1)%2 !=0">{{el.timeStr}}</span>
                        <span ms-if="($index+1)%2 ==0">↓</span>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td class="time">&nbsp;</td>
                    <td class="time" ms-repeat="pointArr" ms-class="orange:el.keyTime==2">
                        <span ms-if="($index+1)%2 !=0"></span>
                        <span ms-if="($index+1)%2 ==0">{{el.timeStr}}</span>
                    </td>
                    <td class="time"></td>
                </tr>
                <tr>
                    <td style='height: 11px; text-align: center; color: red; line-height: 11px; '><img width='70px' height='1' src='${baseurl}images/edpc/line2.gif'></td>
                    <td ms-repeat="pointArr" style='height:11px;line-height:11px;'>
                        <img src='${baseurl}images/edpc/line2.gif' width='55px' height='1'/>
                    </td>
                    <td style='height:11px;line-height:11px;'><img src='${baseurl}images/edpc/line2.gif' width='55px'  height='1'/></td>
                </tr>
                <tr>
                    <td class="cost">实际时长：</td>
                    <td class="cost" ms-repeat="pointArr" ms-class="orange:el.keyTime==2">{{el.cost}}</td>
                    <td class="cost"></td>
                </tr>
            </table>
            <div class="desc">
                <p class="title">说明：</p>
                <p><span class="title">时间节点：</span>意思是实际救治过程中的具体事件的时间定义描述；</p>
                <p><span class="title">发生时间：</span>表示对应时间节点的时间，默认只显示小时和分钟，如10:15表示十点十五分，如果跨天，则增加天，如29 20:00，表示29号的二十点；</p>
                <p><span class="title">实际时长：</span>表示的当前这个时间节点发生的时间距离上一个时间节点之间的时长，上一个时间是相对的，不确定是哪个时间，就是时间轴上显示的前一个时间节点；</p>
                <p><span class="title">字体橘色：</span>表示是关键时间节点，可能是需要考核的关键点；</p>
            </div>
<%--            <div style="display: none" id="container" class="chart_div" style="min-height: 450px;"></div>--%>
        </div>
    </div>
</form>
</body>
<script type="text/javascript">
    var vm = avalon.define({
        $id: 'timeLine',
        pointArr: [],
        info:{}
    });
    Date.prototype.format = function (fmt) {
        var o = {
            "M+": this.getMonth() + 1,                 //月份
            "d+": this.getDate(),                    //日
            "h+": this.getHours(),                   //小时
            "m+": this.getMinutes(),                 //分
            "s+": this.getSeconds(),                 //秒
            "q+": Math.floor((this.getMonth() + 3) / 3), //季度
            "S": this.getMilliseconds()             //毫秒
        };

        if (/(y+)/.test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
        }

        for (var k in o) {
            if (new RegExp("(" + k + ")").test(fmt)) {
                fmt = fmt.replace(
                    RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
            }
        }

        return fmt;
    }
    //enter按键默认触发查询
    $(document).keydown(function (event) {
        switch (event.keyCode) {
            case 13:
                loadTimeline()
        }
    });
    var chart;

    function reload() {
        loadTimeline();
    }

    function Element(name, label, color, description) {
        this.name = name;
        this.label = label;
        this.color = color;
        this.description = description;
    }

    // initialize highcharts
    function loadchart(chartdata, charttype) {
//         console.log('chartdata', chartdata)
        var seriesArr = [],
            seriesData = [],
            dataElem = {};

        for (var i = 0; i < chartdata.length; i++) {
            var hexColor = "#668EAE";
            if (chartdata[i].keyTime === '1') {
                hexColor = "#FFA500";
            }
            // proName	时间节点名称
            var proName = chartdata[i].proName || "";
            proName = proName.replace(/(.{6}(?!$))/g, "$1<br/>");
            // proVal	时间节点值	yyyy-MM-dd hh:mm:ss
            var proVal = chartdata[i].proVal || "";
            var date = new Date(proVal);
            // 相邻时间节点相差的分钟数，后一节点减前一节点
            var minutes = 0;
            if (i === 0) {
                proVal = date.format("dd hh:mm")
            } else {
                var prevDate = new Date(chartdata[i - 1].proVal);
                if (date.format("yyyy-MM-dd") !== prevDate.format("yyyy-MM-dd")) {
                    proVal = date.format("dd hh:mm")
                } else {
                    proVal = date.format("hh:mm")
                }
                // console.log('datediff', date - prevDate)
                // 计算当前时间节点和上一时间节点相差的分钟数
                minutes = (new Date(date.format("yyyy-MM-dd hh:mm")) - new Date(prevDate.format("yyyy-MM-dd hh:mm"))) / 1000 / 60
//         		console.log('minutes', minutes)
            }
            proVal = proVal + "<br/>" + "耗时：" + minutes;

            dataElem = new Element(proName, proVal, hexColor)
            seriesData.push(dataElem)
        }

        seriesArr.push({data: seriesData});
//         console.log('seriesArr', seriesArr)

        var height = 0.75 * ($("#tabs", parent.document).height());
        var chartheight = height - 67;
        $("#container").height(chartheight);

        Highcharts.setOptions({
            lang: {
                months: ['一月', '二月', '三月', '四月', '五月', '六月', '七月', '八月', '九月', '十月', '十一月', '十二月'],
                shortMonths: ['01', '02', '03', '04', '05', '06', '07', '08', '09', '10', '11', '12'],
                weekdays: ['星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六']
            }
        });
        Highcharts.setOptions({
            lang: {
                contextButtonTitle: "图表导出菜单",
                downloadJPEG: "下载 JPEG 图片",
                downloadPDF: "下载 PDF 文件",
                downloadPNG: "下载 PNG 文件",
                downloadSVG: "下载 TIF文件",
                printChart: "打印图表"
            }
        });
        // 副标题
        var subtitle = '说明：' + '<br/>' +
            '时间节点：意思是实际救治过程中的具体事件的时间定义描述；' + '<br/>' +
            '发生时间：表示对应时间节点的时间，默认只显示小时和分钟，如10:15表示十点十五分，如果跨天，则增加天，如29 20:00，表示29号的二十点；' + '<br/>' +
            '实际时长：表示的当前这个时间节点发生的时间距离上一个时间节点之间的时长，上一个时间是相对的，不确定是哪个时间，就是时间轴上显示的前一个时间节点；' + '<br/>' +
            '字体橘色：表示是关键时间节点，可能是需要考核的关键点；';

        // 默认的导出菜单选项，是一个数据
        var dafaultMenuItem = Highcharts.getOptions().exporting.buttons.contextButton.menuItems;
        chart = Highcharts.chart('container', {
            chart: {
                type: charttype || 'timeline',
                zoomType: 'xy',
                backgroundColor: '#e4efff'
            },
            xAxis: {
//         		type: 'datetime',
                visible: false
            },
            yAxis: {
                visible: false
            },
            title: {
                text: '卒中急救时间轴'
            },
            subtitle: {
                text: subtitle,
                align: 'left',
                verticalAlign: 'bottom'
            },
            credits: {
                enabled: false
            },
            tooltip: {
                enabled: false
            },
            colors: [
                '#3e3e3e'
            ],
            series: seriesArr
        });
    }


    function calcCost(chartdata) {
        for (var i = 0; i < chartdata.length; i++) {
            // proName	时间节点名称
            var proName = chartdata[i].proName || "";
            proName = proName.replace(/(.{6}(?!$))/g, "$1<br/>");
            // proVal	时间节点值	yyyy-MM-dd hh:mm:ss
            var proVal = chartdata[i].proVal || "";
            var date = new Date(proVal);
            // 相邻时间节点相差的分钟数，后一节点减前一节点
            var minutes = 0;
            if (i === 0) {
                proVal = date.format("dd hh:mm");
            } else {
                var prevDate = new Date(chartdata[i - 1].proVal);
                if (date.format("yyyy-MM-dd") !== prevDate.format("yyyy-MM-dd")) {
                    proVal = date.format("dd hh:mm")
                } else {
                    proVal = date.format("hh:mm")
                }
                // console.log('datediff', date - prevDate)
                // 计算当前时间节点和上一时间节点相差的分钟数
                minutes = (new Date(date.format("yyyy-MM-dd hh:mm")) - new Date(prevDate.format("yyyy-MM-dd hh:mm"))) / 1000 / 60
//         		console.log('minutes', minutes)
            }
            chartdata[i].timeStr = proVal;
            chartdata[i].cost = minutes;
        }
    }
    //查询方法
    function loadTimeline() {
        var url = "${baseurl}cz/queryCzTimeline.do";
        var params = {
            emgSeq: "${emgSeq}"
        };
//    		console.log("query cpc timeline data url: ", url);
//    		console.log("request param: ", params);
        publicFun.httpServ("post", url, params, function (res) {
//         	console.log("res", res);
            var data = res.resultInfo.sysdata.czTimeline || [];
// 			(function(data){
// 				if(data && data.length){
// 					for(var m in data){
// 						if(data[m].proCode == 'CBZDSJ'){
// 							for(var n in data){
// 								if(data[n].proCode == 'JZZDSJ'){
// 									data.splice(n,1)
// 									return false
// 								}
// 							}
// 						}
// 					}
// 				}
// 			})(data)
            calcCost(data);
            vm.pointArr = data;
            // 加载图表
            // loadchart(data, "timeline");
        }, function (err) {
            console.log("err", err)
        }, 5000);
    }
    function getBasicInfo() {
        $.ajax({
            url: '${baseurl}cz/getCzInfo.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                emgSeq: "${emgSeq}"
            }),
            success: function (res) {
                if(res.resultInfo.sysdata.hspemgInfCustom){
                    vm.info = res.resultInfo.sysdata.hspemgInfCustom;
                }
            }
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
    $(function () {
        getBasicInfo();
        loadTimeline();
    });
</script>
</html>