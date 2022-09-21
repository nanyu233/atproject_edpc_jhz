<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>评分总览</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
    <style>
        html {
            overflow: hidden;
        }

        body {
            overflow: hidden;
            background-color: rgb(249, 249, 249);
        }

        .medium-basic-card {
            width: 200px;
            height: 150px;
            overflow: hidden;
        }

        .medium-basic-card-title {
            height: 30px;
            line-height: 30px;
            font-size: 14px;
        }

        .medium-basic-card-body .total-sco-box {
            height: 50px;
            line-height: 50px;
            font-size: 16px;
            font-weight: bold;
            color: #333;
        }

        .medium-basic-card-body .mod-info {
            /* text-align: left; */
            font-size: 12px;
            color: #666;
        }
    </style>
</head>

<body ms-controller="scoreOverview">
    <div id="score-container">
        <div ms-repeat-scoinfo="totalList" class="medium-basic-card " ms-click="toScoPage(scoinfo)">
            <div class="medium-basic-card-title">
                {{scoinfo.scoName}}
            </div>
            <div class="medium-basic-card-body">
                <div class="total-sco-box">
                    <span class="total-sco">
                        <span class="info-label total-sco-label">总分：</span>
                        <span>{{scoinfo.itemValue}}</span>
                    </span>
                </div>
                <div class="mod-info">
                    <div class="mod-time">
                        <span class="info-label mod-time=label">评分时间：</span>
                        <span>{{scoinfo.modDateStr}}</span>
                    </div>
                    <div span class="mod-user">
                        <span class="info-label mod-user=label">评分人：</span>
                        <span>{{scoinfo.userid}}</span>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript">
        //全局变量
        var _baseUrl = "${baseurl}";
        var ptBasicInfo = eicuUtil.ptBasicInfo;
        var _liveNo = "${liveNo}";
        var _custNo = ptBasicInfo.custNo;
        var _custName = ptBasicInfo.custName;
        var _userid = "${activeUser.usrno}";
        var _modDateStr = publicFun.timeFormat(new Date().getTime(), "yyyy/MM/dd hh:mm");
        var scoreWin;
    </script>
    <script type="text/javascript">
        var editText = $('#gradeEditBtn').val();
        var addText = $('#gradeAddBtn').val();
        var vm = avalon.define({
            $id: 'scoreOverview',
            totalList: [], //总分内容
            toScoPage: function (scoInfo) {
                //跳转对应评分基本模式
                var thisMenuInfo;
                var pagetype = '106000';
                var pageval = ''; //跳转pageval
                //设置跳转信息使跳转页面刷新
                eicuUtil.setLastPageType('totalPage');
                eicuUtil.openIcuCustTab(pagetype, pageval)
            }
        })
        var typeList = [{
            type: 'GCS',
            info: '格拉斯哥昏迷评分'
        }, {
            type: 'RASS',
            info: '躁动镇静评分'
        }, {
            type: 'NRS',
            info: '疼痛数字评分'
        }, {
            type: 'CPOT',
            info: '重症疼痛观察工具'
        }, {
            type: 'ICDSC',
            info: '谵妄筛查检测表'
        }, {
            type: 'BRADEN',
            info: '压疮评分'
        }, {
            type: 'FALL',
            info: '坠床跌倒危险因素评分'
        }, {
            type: 'ADL',
            info: '日常生活活动能力评分'
        }, {
            type: 'EN',
            info: '肠内营养耐受评分'
        }];
        var totalList;

        /**
         *获取信息
         */
        function getAllInfo() {
            totalList = [];
            typeList.forEach(function (typeInfo) {
                getLatestScore(typeInfo);
            })
        }

        /**
         *分别获取单项最新信息
         */
        function getLatestScore(typeInfo) {
            publicFun.httpRequest(_baseUrl + "icuscore/findGradeInfoByParam.do", {
                "gradeSeq": '',
                "gradeType": typeInfo.type,
                "liveNo": _liveNo
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error('请求出错，请联系管理员');
                }
                var totalScoreField = typeInfo.type + '_SCO';
                var itemList = res.resultInfo.sysdata.itemlist;
                var itemInfo;
                for (var i = 0; i < itemList.length; i++) {
                    itemInfo = itemList[i];
                    if (itemInfo.itemField === totalScoreField) {
                        itemInfo.type = typeInfo.type;
                        itemInfo.scoName = typeInfo.info;
                        itemInfo.userid = _userid;
                        itemInfo.modDateStr = _modDateStr;
                        totalList.push(itemInfo);
                        break;
                    }
                }
                if (totalList.length === typeList.length) {
                    vm.totalList = totalList;
                }
            })
        }
        /**
         *布局页面
         */
        function setLayout() {
            var windowW = $(window).width() - 5; //获取宽度出错
            var windowH = $(window).height();
            // var marginLeft = 3;
            var ctrlPanelW = $('#ctrl-panel').width();
            var mainViewH = windowH - 5;
            var mainViewW = windowW - ctrlPanelW - 3;
            $('#ctrl-panel').height(mainViewH);
            $("#main-view").width(mainViewW).height(mainViewH);
        }
        $(function () {
            // test
            getAllInfo();
        })
    </script>
</body>