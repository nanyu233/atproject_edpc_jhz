<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>RTS评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>
<body class="queryrts">
    <div class="rts_container rts" id="queryRts" v-cloak>
        <div class="mark_msg clr">
            <p class="box_title">RTS评分</p>
            <div class="mark_msg_detail">
                <ul>
                    <li>
                        <span>GCS:</span>
                        <span class="item_color" v-if="aboutRTS.gcsTotSco">{{aboutRTS.gcsTotSco}} 分</span>
                    </li>
                    <li>
                        <span>收缩压:</span>
                        <span class="item_color" v-if="aboutRTS.sbpUpNbr">{{aboutRTS.sbpUpNbr}} mmHg</span>
                    </li>
                    <li>
                        <span>呼吸:</span>
                        <span class="item_color" v-if="aboutRTS.breNbr">{{aboutRTS.breNbr}} 次/分</span>
                    </li>
                </ul>
            </div>
        </div>
        <table class="mark_rule rts">
            <tr class="mark_score">
                <th>分值</th>
                <td>4</td>
                <td>3</td>
                <td>2</td>
                <td>1</td>
                <td>0</td>
            </tr>
            <tr>
                <th>GCS</th>
                <td :class="{active:isInRange(aboutRTS.gcsTotSco, 13, 15)}">13-15</td>
                <td :class="{active:isInRange(aboutRTS.gcsTotSco, 9, 12)}">9-12</td>
                <td :class="{active:isInRange(aboutRTS.gcsTotSco, 6, 8)}">6-8</td>
                <td :class="{active:isInRange(aboutRTS.gcsTotSco, 4, 5)}">4-5</td>
                <td :class="{active:isInRange(aboutRTS.gcsTotSco, '', 3)}">3</td>
            </tr>
            <tr>
                <th>收缩压</th>
                <td :class="{active:isInRange(aboutRTS.sbpUpNbr, 89, '')}">>89</td>
                <td :class="{active:isInRange(aboutRTS.sbpUpNbr, 76, 89)}">76-89</td>
                <td :class="{active:isInRange(aboutRTS.sbpUpNbr, 50, 75)}">50-75</td>
                <td :class="{active:isInRange(aboutRTS.sbpUpNbr, 1, 49)}">1-49</td>
                <td :class="{active:isInRange(aboutRTS.sbpUpNbr, '', 0)}">0</td>
            </tr>
            <tr>
                <th>呼吸</th>
                <td :class="{active:isInRange(aboutRTS.breNbr, 10, 29)}">10-29</td>
                <td :class="{active:isInRange(aboutRTS.breNbr, 29, '')}">>29</td>
                <td :class="{active:isInRange(aboutRTS.breNbr, 6, 9)}">6-9</td>
                <td :class="{active:isInRange(aboutRTS.breNbr, 1, 5)}">1-5</td>
                <td :class="{active:isInRange(aboutRTS.breNbr, '', 0)}">0</td>
            </tr>
        </table>
        <div style="color: #2a00ff;" class="hidden">
            说明：
        </div>
        <div class="score_div" style="float: left;">
            <span>分值：</span><i>{{aboutRTS.rtsTotSco}}</i>
        </div>
        <div class="grp_btn">
            <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>    
</body>
<script type="text/javascript">
    var vm = new Vue({
        el: "#queryRts",
        data: {
            aboutRTS: {
                rtsTotSco: parent.$("#emg_rtsTotSco").val() || '无', //rts评分
                gcsTotSco: parent.$("#emg_gcsTotSco").val() || '', //gcs
                sbpUpNbr: parent.$("#emg_sbpUpNbr").val() || '', //收缩压(高压)
                breNbr: parent.$("#emg_breNbr").val() || '', //呼吸
            }
        },
        methods: {
            isInRange: function(val, min, max){
                if(isNaN(parseInt(val))){
                    return false
                }
                if(min && !max){
                    return val >= min
                }
                if(!min && max){
                    return val <= max
                }
                if(min && max){
                    return (val >= min) && (val <= max)
                }
            }
        }
    });
</script>
</html>