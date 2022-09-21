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
    <title>GRACE评分</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="css/hems/global.css">
    <link rel="stylesheet" type="text/css" href="css/common/querylist.css"/>
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

        .detail {
            position: absolute;
            top: 0;
            bottom: 0;
            width: 60%;
            left: 50%;
            transform: translateX(-50%);
            border: 1px solid #CCCCCC;
            line-height: 35px;
        }

        .options {
            border-bottom: 1px solid #CCCCCC;
        }

        .options .title {
            display: inline-block;
            vertical-align: middle;
            width: 20%;
            color: #0d478f;
            text-align: center;

        }

        .options .block {
            display: inline-block;
            vertical-align: middle;
            width: 78%;
            list-style: none;
            padding: 0;
            margin: 0;
        }

        .options .block .item {
            display: inline-block;
            margin: 10px;
            padding: 0 5px;
            color: #aaaaaa;
        }

        .block .item .icon {
            width: 20px;
            height: 20px;
            vertical-align: middle;
        }

        .block .item .content {
            vertical-align: middle;
        }

        table {
            border-collapse: collapse;
            text-align: center;
            margin-top: 30px;
            line-height: 35px
        }

        .red {
            color: red;
            font-weight: bold;
        }

        .active {
            color: #0d478f;
            font-weight: bold;
        }
    </style>
</head>
<body ms-controller="grace">
<div class="detail">
    <div class="options">
        <div class="title">危险因素</div>
        <div class="block">
            <div class="item" ms-repeat="arr_wxys">
                <img src="${baseUrl}images/edpc/icon-check.png" class="icon" ms-if="el.checked" alt="">
                <span class="content" ms-class="active:el.checked">{{el.value}}</span>
            </div>
        </div>
    </div>
    <div class="options">
        <div class="title">极高危条件</div>
        <div class="block">
            <div class="item" ms-repeat="arr_jgwtj">
                <img src="${baseUrl}images/edpc/icon-check.png" class="icon" ms-if="el.checked" alt="">
                <span class="content" ms-class="active:el.checked">{{el.info}}</span>
            </div>
        </div>
    </div>
    <table border="1" width="100%">
        <tr>
            <td></td>
            <td>年龄</td>
            <td>心率</td>
            <td>收缩压</td>
            <td>肌酐</td>
            <td>Killip分级</td>
            <td>危险因素</td>
            <td>总分</td>
        </tr>
        <tr style="font-weight: bold">
            <td></td>
            <td>{{info.cstAge || '/'}}</td>
            <td>{{info.hrtRte || '/'}}</td>
            <td>{{info.sbpupNbr || '/'}}</td>
            <td>{{info.jgdb || '/'}}</td>
            <td>{{info.killip || '/'}}</td>
            <td>/</td>
            <td>/</td>
        </tr>
        <tr style="font-weight: bold">
            <td>得分</td>
            <td>{{info.ageScore || 0}}分</td>
            <td>{{info.hrtScore || 0}}分</td>
            <td>{{info.sbpScore || 0}}分</td>
            <td>{{info.creScore || 0}}分</td>
            <td>{{info.killipScore || 0}}分</td>
            <td>{{info.dangerScore || 0}}分</td>
            <td>{{info.total || 0}}分</td>
        </tr>

    </table>

    <table border="1" width="100%">
        <tr>
            <td style="color: #0d478f">Grace评分</td>
            <td>极高危条件</td>
            <td> >140</td>
            <td>109-140</td>
            <td> <109</td>
        </tr>
        <tr>
            <td style="color: #0d478f">危险级别</td>
            <td ms-class="red:info.jgwtjRes.length">极高危</td>
            <td ms-class="red:!info.jgwtjRes.length && info.total>140">高危</td>
            <td ms-class="red:!info.jgwtjRes.length && info.total>=109 && info.total<=140">中危</td>
            <td ms-class="red:!info.jgwtjRes.length && info.total<109">低危</td>
        </tr>
    </table>
</div>
</body>
<script>
    var vm = avalon.define({
        $id: 'grace',
        info: {
            wxysRes: [],
            jgwtjRes: [],
        },
        arr_wxys: [{
            infocode: '1',
            value: '入院时心脏骤停',
            score: 39,
            checked:false
        }, {
            infocode: '2',
            value: '心电图ST段改变',
            score: 28,
            checked:false
        }, {
            infocode: '3',
            value: '心肌坏死标志物升高',
            score: 14,
            checked:false
        }], //危险因素
        arr_jgwtj: []
    });

    //计算Grace各项评分
    function computeGraceItem(info) {
        try {
            if (info.cstAge) {
                let ageScore = 0;
                let age = info.cstAge;

                if (age < 30) {
                } else if (age <= 39) {
                    ageScore = 8;
                } else if (age <= 49) {
                    ageScore = 25;
                } else if (age <= 59) {
                    ageScore = 41;
                } else if (age <= 69) {
                    ageScore = 58;
                } else if (age <= 79) {
                    ageScore = 75;
                } else if (age <= 89) {
                    ageScore = 91;
                } else {
                    ageScore = 100;
                }

                info.ageScore = ageScore;
            }
            if (info.hrtRte) {
                let hrtScore = 0;
                let hrt = info.hrtRte;

                if (hrt < 50) {
                    hrtScore = 0;
                } else if (hrt <= 69) {
                    hrtScore = 3;
                } else if (hrt <= 89) {
                    hrtScore = 9;
                } else if (hrt <= 109) {
                    hrtScore = 15;
                } else if (hrt <= 149) {
                    hrtScore = 24;
                } else if (hrt <= 199) {
                    hrtScore = 38;
                } else {
                    hrtScore = 46;
                }

                info.hrtScore = hrtScore;
            }
            if (info.sbpupNbr) {
                let sbpScore = 0;
                let sbp = info.sbpupNbr;

                if (sbp < 80) {
                    sbpScore = 58;
                } else if (sbp <= 99) {
                    sbpScore = 53;
                } else if (sbp <= 119) {
                    sbpScore = 43;
                } else if (sbp <= 139) {
                    sbpScore = 34;
                } else if (sbp <= 159) {
                    sbpScore = 24;
                } else if (sbp <= 199) {
                    sbpScore = 10;
                } else {
                    sbpScore = 0;
                }

                info.sbpScore = sbpScore;
            }
            if (info.jgdb) {
                let creScore = 0;
                let cre = parseFloat((info.jgdb / 88.4).toFixed(2));

                if (cre >= 0 && cre <= 0.39) {
                    creScore = 1;
                } else if (cre <= 0.79) {
                    creScore = 4;
                } else if (cre <= 1.19) {
                    creScore = 7;
                } else if (cre <= 1.59) {
                    creScore = 10;
                } else if (cre <= 1.99) {
                    creScore = 13;
                } else if (cre <= 3.99) {
                    creScore = 21;
                } else {
                    creScore = 28;
                }

                info.creScore = creScore;
            }
            let killip = info.killip;
            if (killip) {
                if (killip == 0) info.killipScore = 0;
                else if (killip == 1) info.killipScore = 20;
                else if (killip == 2) info.killipScore = 39;
                else if (killip == 3) info.killipScore = 59;
            }

            //危险因素得分计算
            let _reasonArr = vm.arr_wxys;
            let temp = 0;
            let wxysRes = [];
            _reasonArr.forEach(function (el) {
                if (info.wxys && info.wxys.indexOf(el.infocode) >= 0) {
                    temp += el.score;
                    el.checked = true;
                    wxysRes.push(el.value)
                } else {
                    el.checked = false;
                }
            });
            vm.arr_wxys = _reasonArr;
            info.wxysRes = wxysRes;
            info.dangerScore = temp;

            var jgwtjRes = [];
            var _jgwtjArr = vm.arr_jgwtj;
            _jgwtjArr.forEach(function (el) {
                if (info.gracejgwtj && info.gracejgwtj.indexOf(el.infocode) >= 0) {
                    el.checked = true;
                    jgwtjRes.push(el.info);
                } else {
                    el.checked = false;
                }
            });
            vm.arr_jgwtj = _jgwtjArr;
            info.jgwtjRes = jgwtjRes;

        } catch (e) {
            console.log("566667888888", e)
        }
        return info;
    }

    $(function () {

        var jgwtj = publicFun.getDict('XT_JGWTJ_COD');
        jgwtj.forEach(function (el) {
            el.checked = false;
        });
        vm.arr_jgwtj = jgwtj;

        $.ajax({
            url: 'cpc/getHspGraceInf.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': '${emgSeq}',
                graceType: '0'
            }),
            success: function (res) {
                if (res.resultInfo.sysdata.hspGraceInf) {
                    vm.info = computeGraceItem(res.resultInfo.sysdata.hspGraceInf);
                }
            },
            error: function (err) {
                //console.log(err)
            }
        });
    })
</script>
</html>