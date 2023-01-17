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
    <title>卒中中心</title>
    <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/locale/easyui-lang-zh_CN.js"></script>
    <style>
        .filePart {
            position: absolute;
            left: 8px;
            top: 255px;
        }

        .filePart .title {
            color: #3876ba;
            font-weight: bold;
            font-size: 18px;
        }

        .filePart .title:hover {
            cursor: pointer;
        }

        #window {
            min-width: 200px;
            min-height: 100px;
            display: none;
            padding: 5px;
            position: absolute;
            top: 0;
            left: 0;
            background: rgba(0, 0, 0, 0.5);
        }

        #window .item {
            white-space: nowrap;
        }

        #window .checkList {
            margin: 10px 0;
        }

        #window .checkList:first-child {
            margin-top: 0;
        }

        #window .name {
            display: inline-block;
            color: #fff;
            text-align: right;
            vertical-align: top;
            margin-right: 5px;
        }

        #window .val {
            display: inline-block;
            color: #FFCC00;
            vertical-align: top;
        }

        #pp .pagination-page-list {
            width: 45px;
        }
    </style>
</head>

<body>
<div ms-controller="fishPool">
    <div class="flow">
        <div id="infoBar" class="infoBar" style="min-width:1100px">
            <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="toReportHelper()">卒中上报助手</div>
            <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="showTable()">知情同意书</div>
            <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="printCzhcb()">卒中核查表</div>
            <div><span>姓名：</span><span>{{currPatientInfo.cstNam}}</span></div>
            <div><span>性别：</span><span>{{currPatientInfo.cstSexCod}}</span></div>
            <div><span>就诊卡号：</span><span>{{currPatientInfo.vstCad}}</span></div>
            <div><span>初步诊断：</span><span>{{currPatientInfo.preDgnCod}}</span></div>
            <%--            <div class="printBtn" onclick="redirectToprint()">打印诊疗表</div>--%>
            <div class="rightBtn" ms-visible="!showPatientList" ms-click="listTrigger('1')"><span class="iconfont icon-show listTrigger"></span><span>病人列表</span></div>
        </div>
        <div class="arterial">
            <div class="countDown" style="display: none" ms-if="patientList.length">
                <div class="title"><i onclick="trigger()" class="iconfont icon-tongzhi" style="font-size: 18px"></i> 倒计时提醒
                </div>
                <div class="btnWrapper">
                    <span onclick="getXhyData()">血化验完成</span>
                    <span onclick="gettlCTData()">头颅CT完成</span>
                    <span onclick="gettlxdtData()">心电图完成</span>
                </div>
                <div class="item">
                    <div class="child name">首次医疗接触时间:</div>
                    <div class="child">
                        <div>{{currPatientInfo.emgDatStr}}</div>
                    </div>
                </div>
                <div class="item">
                    <div class="child name">拟诊断时间:</div>
                    <div class="child">
                        <div ms-visible="currPatientInfo.NZDSJ">{{currPatientInfo.NZDSJ}}</div>
                        <div ms-visible="!currPatientInfo.NZDSJ">
                            <div id="NZDSJ" class="bar"></div>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="child name">影像学检查时间:</div>
                    <div class="child">
                        <div ms-visible="currPatientInfo.YXXJCSJ">{{currPatientInfo.YXXJCSJ}}</div>
                        <div ms-visible="!currPatientInfo.YXXJCSJ">
                            <div id="YXXJCSJ" class="bar"></div>
                        </div>
                    </div>
                </div>
                <div class="item">
                    <div class="child name">血化验时间:</div>
                    <div class="child">
                        <div ms-visible="currPatientInfo.XHYSJ">{{currPatientInfo.XHYSJ}}</div>
                        <div ms-visible="!currPatientInfo.XHYSJ" id="XHYSJ" class="bar"></div>
                    </div>
                </div>
                <div class="item">
                    <div class="child name">影像学诊断时间:</div>
                    <div class="child">
                        <div ms-visible="currPatientInfo.ZDSJ">{{currPatientInfo.ZDSJ}}</div>
                        <div ms-visible="!currPatientInfo.ZDSJ" id="ZDSJ" class="bar"></div>
                    </div>
                </div>
                <div class="item">
                    <div class="child name">静脉溶栓时间:</div>
                    <div class="child">
                        <div ms-visible="currPatientInfo.RSZLKSSJ">{{currPatientInfo.RSZLKSSJ}}</div>
                        <div ms-visible="!currPatientInfo.RSZLKSSJ" id="RSZLKSSJ" class="bar"></div>
                    </div>
                </div>
            </div>
        </div>

        <div id="paperDiv">
            <div id="window" onclick="clearWindow()"></div>
        </div>
    </div>
    <div class="list" ms-visible="showPatientList">
        <div class="searchBar">
            <i class="iconfont icon-hide listTrigger" ms-click="listTrigger('0')"></i>
            <input type="text" ms-on-input="onInput" ms-on-keypress="onKeyPress" class="searchInput" placeHolder="输入姓名搜索" />
            <label class="toggleBtn">
                <input type="checkbox" ms-click="showHisToggle"/><span ms-class="activeBtn:showHis">历史</span>
            </label>
        </div>
        <ul ms-if="patientList.length">
            <li ms-repeat-el="patientList" ms-click="clickPatient(el)" ms-class="selected:el.regSeq===currPatientInfo.regSeq">
                <div class="bedNo" ms-if="el.bedNum">
                    <span class="num">{{el.bedNum}}</span><span class="bed">床</span>
                </div>
                <div class="return" ms-if="!el.bedNum">已转归</div>

                <div class="info_item">
                                    <span style="vertical-align: middle">
                        <span class="name">{{el.cstNam}}</span><span> | </span>
                                    <span ms-visible="el.cstSexCod==0" class="male">男</span>
                                    <span ms-visible="el.cstSexCod==1" class="female">女</span>
                                    <span> | </span><span>{{el.cstAge}}岁</span>
                                    </span>
                    <i ms-if="el.hasUpdated" class="iconfont icon-new-msg" style="color: red;font-size: 30px;vertical-align: bottom"></i>
                </div>
                <div class="info_item">
                    <span class="title">预检时间:</span>
                    <span>{{el.emgDatStr}}</span>
                </div>
                <div class="info_item">
                    <span class="iconfont icon-iconxyang" style="color: #44b548"></span>
                    <span>{{el.xueyang}}%</span><%--{{el.oxyNbr}}--%>
                    <span class="iconfont icon-heartrate" style="color:red"></span>
                    <span>{{el.xinl}}次/分</span><%--{{el.hrtRte}}--%>
                    <span class="iconfont icon-hamnatodynamometer" style="color: #f90"></span>
                    <span>{{el.xuey}}</span><%--{{el.sbpUpNbr}}/{{el.sbpDownNbr}}--%>
                </div>
            </li>
            <div id="pp" style="background:#efefef;border:1px solid #ccc;position: fixed;bottom: 0;"></div>
        </ul>
        <div ms-if="!patientList.length" class="no-patient">暂无相关病人数据</div>
    </div>
    <%--知情同意书弹窗--%>
    <div id="fileBox" style="padding:10px">
        <table id="dg"></table>
    </div>
</div>
<jsp:include page="/WEB-INF/jsp/edpc/cz/czhcb.jsp"></jsp:include>
<script type="text/javascript">
    // 20200109019565
    var locate = window.location;
    var weburl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketHz.do";
    var ws;
    // 存放所有的流程组件，包括任务，分支
    var flowChart = {};
    // 存放流程线
    var flowChartLine = {};
    // 当前的矩形节点
    var currentflowChartRect = [];
    // 定义流程节点ID
    var flowStep = ['xdt', 'tlCT', 'xhy', 'yqhz', 'sjwkhz', 'rspg', 'jmrs', 'lnCTA', 'qszqtys', 'dmqs', 'zg', 'rszqtys'];
    var show = false;
    // 定义质控时间
    var countdownTime = {
        NZDSJ: 10,
        XHYSJ: 25,
        YXXJCSJ: 10,
        ZDSJ: 30,
        RSZLKSSJ: 60
    };
    // 这片鱼塘已经被我承包了！
    var fishPool = avalon.define({
        $id: 'fishPool',
        patientList: [], //右侧卒中病人列表
        showPatientList: true,
        tempCode: '10000002',  //编辑器模板编号10000002是卒中
        currPatientInfo: {
            emgDatStr: '',
            NZDSJ: '',
            XHYSJ: '', // 血化验时间
            YXXJCSJ: '', // 头颅CT时间
            ZDSJ: '', // CT确诊时间
            RSZLKSSJ: '', // 静脉溶栓时间
            cstNam: '',
            cstSexCod: '',
            vstCad: '',
            preDgnCod: '',
            emgSeq: '',
            regSeq: ''
        },
        showHis: false, //是否包含历史
        searchKey: '', //搜索框输入内容
        pageInfo: {
            total: 0,
            pageNumber: 1, //当前页
            pageSize: 5 //当前页数量
        },
        // "包含历史"的按钮点击事件
        showHisToggle: function() {
            fishPool.showHis = !fishPool.showHis;
            getPatientList();
        },
        //搜索框输入事件
        onInput: function(e) {
            fishPool.searchKey = this.value;
        },
        //搜索框回车事件
        onKeyPress: function(e) {
            if (e.keyCode == 13) {
                getPatientList();
            }
        },
        listTrigger: function(flg) {
            if (flg == '1') {
                fishPool.showPatientList = true;
                $('.flow').css('width', '80%');
            }
            if (flg == '0') {
                fishPool.showPatientList = false;
                $('.flow').css('width', '100%');
            }
        }
    });

    // 创建画布
    var paper = Raphael("paperDiv", 1100, 1500);
    // 本模块矩形定宽,在bpmn图中,矩形代表任务，菱形代表分支
    var taskWidth = 100;
    // 本模块矩形定高
    var taskHeight = 80;
    // 本模块矩形圆角
    var taskR = 10;
    // 箭头集合
    var arrowSet = paper.set();
    // 矩形集合
    var taskSet = paper.set();

    var baseX = 180;
    var baseY = 225;

    function toReportHelper() {
        var url = 'cz/toCzReportHelper.do?emgSeq=' + fishPool.currPatientInfo.emgSeq;
        window.top.addTab('卒中上报-' + fishPool.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }

    function initWebSocket() {
        ws = new WebSocket(weburl);
        ws.onopen = function(e) {
            console.log("czHome websocket connected!");
        };
        ws.onmessage = function(evt) {
            if (evt) {
                var info = JSON.parse(evt.data).sysdata;
                if (info.emgSeq == fishPool.currPatientInfo.emgSeq) {
                    // 处理webSocket 数据
                    handlerWebSocketMessage(info);
                }
            }
        };
        ws.onclose = function(evt) {
            console.log("Connection close ...");
        }
    }

    function handlerWebSocketMessage(info) {
        console.log("000000000000", info, info.greenNodeId.indexOf('_'));
        // 时间类型的赋值
        // if(info.messageCode == 'xhy'){
        //     fishPool.currPatientInfo.XHYSJ = publicFun.timeFormat(info.time, 'yyyy-MM-dd hh:mm:ss');
        // }else if(info.messageCode == 'nzdSj'){
        //     fishPool.currPatientInfo.NZDSJ = publicFun.timeFormat(info.time, 'yyyy-MM-dd hh:mm:ss');
        // }else if(info.messageCode == 'tlCT'){
        //     fishPool.currPatientInfo.YXXJCSJ = publicFun.timeFormat(info.time, 'yyyy-MM-dd hh:mm:ss');
        // }else if(info.messageCode == 'ctzdSj'){
        //     fishPool.currPatientInfo.ZDSJ = publicFun.timeFormat(info.time, 'yyyy-MM-dd hh:mm:ss');
        // }else if(info.messageCode == 'rsZlKsSj'){
        //     fishPool.currPatientInfo.RSZLKSSJ = publicFun.timeFormat(info.time, 'yyyy-MM-dd hh:mm:ss');
        // }
        //包含_的是线段id，否则是节点id
        if (info.greenNodeId.indexOf('_') > -1) {
            //根据推送的节点id 点亮节点
            currentflowChartRect.push(info.greenNodeId);
            setGreenLine(info.greenNodeId);
        } else {
            setGreenNode(info.greenNodeId);
        }

        //节点 头颅CT有无可疑出血表现 点亮后，子任务框到该节点之间的线段变绿
        if (info.greenNodeId == 'tlctywkycxbx') {
            setGreenLine('jzs_cxb');
            //头颅ct无出血表现、是否进行溶栓之间连线变绿
            if (info.message == 0) {
                setGreenLine('cxb_jxr');
            } else {
                //头颅ct有出血表现、神经外科会诊之间连线变绿
                setGreenLine('jzs_cxb');
                //神经外科会诊节点变绿
                setGreenNode('sjwkhz');
                //神经外科会诊、转归之间连线变绿
                setGreenLine('sjw_zhu');
            }
        }
        // 是否同意溶栓
        if (info.greenNodeId == 'sfjxrs') {
            //同意进行溶栓、签署溶栓知情同意书之间连线变绿
            if (info.message == 1) {
                setGreenLine('jxr_qst');
            } else {
                //不同意进行溶栓、未溶栓原因之间连线变绿
                setGreenLine('tyr_wrs');

            }
        }
        // 未溶栓原因、转归之间连线变绿
        if (info.greenNodeId == 'wrsyy') {
            setGreenLine('tyr_zhu');
        }
        //签署溶栓知情同意书-血压是否达标之间连线变绿
        if (info.greenNodeId == 'qstys') {
            setGreenLine('qst_xys')
        }
        //血压是否达标
        if (info.greenNodeId == 'xysfdb') {
            //血压不达标
            if (info.message == 0) {
                //血压不达标、降压药物之间连线变绿
                setGreenLine('xys_jyy');
                //降压药物节点变绿
                setGreenNode('jyyw');
                //降压药物、静脉溶栓之间连线变绿
                setGreenLine('jyy_jmr')
            } else {
                //血压达标、静脉溶栓之间连线
                setGreenLine('xys_jmr');
            }
        }
        //静脉溶栓、转归之间连线变绿
        if (info.greenNodeId == 'jmrs') {
            setGreenLine('jmr_zhu')
        }

        //是否可疑大动脉阻塞
        if (info.greenNodeId == 'sfkyddmzs') {
            //是否可疑大动脉阻塞 点亮后，子任务框到该节点之间的线段变绿
            setGreenLine('jzs_dmz');
            //非可疑大动脉阻塞、动脉取栓、转归连线变绿
            if (info.message == 0) {
                setGreenLine('dmz_zhu');
                setGreenLine('qus_zhu');
            } else {
                //可疑大动脉阻塞、通知介入科会诊连线变绿
                setGreenLine('dmz_tzj')
            }
        }
        // 通知介入科会诊
        if (info.greenNodeId == 'tzjrkhz') {
            //通知介入科会诊、颅脑CTA结果连线变绿
            setGreenLine('tzj_lnc')
        }
        // 颅脑CTA结果
        if (info.greenNodeId == 'lnctajg') {
            //颅脑CTA结果阴性
            if (info.message == 0) {
                //颅脑CTA结果、动脉取栓、转归连线变绿
                setGreenLine('lnc_zhu');
            } else {
                //颅脑CTA结果阳性
                //颅脑CTA结果、是否同意取栓连线变绿
                setGreenLine('lnc_tyq')
            }
        }
        //是否同意取栓
        if (info.greenNodeId == 'sftyqs') {
            //不同意取栓
            if (info.message == 0) {
                // 是否同意取栓、动脉取栓、转归连线变绿
                setGreenLine('tyq_zhu');
                setGreenLine('qus_zhu');
            } else {
                //同意取栓
                // 是否同意取栓、签署取栓知情同意书连线变绿
                setGreenLine('tyq_qsq')
            }
        }
        //签署取栓知情同意书、麻醉连线变绿
        if (info.greenNodeId == 'qsqstys') {
            setGreenLine('qsq_maz')
        }
        //麻醉、动脉取栓、转归连线变绿
        if (info.greenNodeId == 'mazui') {
            setGreenLine('maz_qus');
            setGreenLine('qus_zhu')
        }
    }
    //控制节点变绿色
    function setGreenNode(nodeId) {
        if (flowChart[nodeId]) {
            flowChart[nodeId].attr({
                'fill': '44b548'
            });
        } else {
            console.log("！！！找不到id为" + nodeId + '的节点');
        }
    }
    //控制线段变绿色
    function setGreenLine(lineId) {
        if (flowChartLine[lineId]) {
            flowChartLine[lineId].attr({
                'stroke-width': '2px',
                'stroke': '44b548'
            });
        } else {
            console.log("！！！找不到id为" + lineId + '的线段');
        }

    }
    /**
     * 获取所有卒中病人
     **/
    function getPatientList() {
        publicFun.httpServ('post', 'cz/getCzPatientInfoList.do', {
            cstNam: fishPool.searchKey,
            bhls: fishPool.showHis,
            page: fishPool.pageInfo.pageNumber,
            rows: fishPool.pageInfo.pageSize
        }, function(res) {
            var list = res.rows;
            fishPool.pageInfo.total = res.total
            if (list && list.length) {
                for (var i = 0; i < list.length; i++) {
                    list[i].emgDatStr = publicFun.timeFormat(list[i].emgDat, 'yyyy-MM-dd hh:mm'); //格式化预检时间
                    list[i].hasUpdated = false; //设置信息更新的标志
                }
                fishPool.patientList = list;
                clickPatient(list[0]);
                setPagination()
            } else {
                fishPool.patientList = [];
                //停止倒计时
                clearInterval(cd1);
                resetFlowChart();
                fishPool.currPatientInfo = {
                    emgDatStr: '',
                    NZDSJ: '',
                    XHYSJ: '', // 血化验时间
                    YXXJCSJ: '', // 头颅CT时间
                    ZDSJ: '', // CT确诊时间
                    RSZLKSSJ: '', // 静脉溶栓时间
                    cstNam: '',
                    cstSexCod: '',
                    vstCad: '',
                    preDgnCod: '',
                    emgSeq: '',
                    regSeq: ''
                }
            }

        });
    }

    function getPatientListBycreated() {
        publicFun.httpServ('post', 'cz/getCzPatientInfoList.do', {
            cstNam: '${cstNam}',
            bhls: true,
            page: 1,
            rows: 100
        }, function(res) {
            var list = res.rows;
            fishPool.pageInfo.total = res.total
            if (list && list.length) {
                for (var i = 0; i < list.length; i++) {
                    list[i].emgDatStr = publicFun.timeFormat(list[i].emgDat, 'yyyy-MM-dd hh:mm'); //格式化预检时间
                    list[i].hasUpdated = false; //设置信息更新的标志
                }
                fishPool.patientList = list;
                clickPatient(list[0]);
                setPagination()
            } else {
                fishPool.patientList = [];
                //停止倒计时
                clearInterval(cd1);
                resetFlowChart();
                fishPool.currPatientInfo = {
                    emgDatStr: '',
                    NZDSJ: '',
                    XHYSJ: '', // 血化验时间
                    YXXJCSJ: '', // 头颅CT时间
                    ZDSJ: '', // CT确诊时间
                    RSZLKSSJ: '', // 静脉溶栓时间
                    cstNam: '',
                    cstSexCod: '',
                    vstCad: '',
                    preDgnCod: '',
                    emgSeq: '',
                    regSeq: ''
                }
            }

        });
    }
    function getPrintCzhcb(emgSeq) {

    }

    /**
     *根据病人的emgSeq获取该病人倒计时、流程节点的数据
     **/
    function clickPatient(patient) {
        fishPool.currPatientInfo.regSeq = patient.regSeq;
        fishPool.currPatientInfo.emgSeq = patient.emgSeq;
        fishPool.currPatientInfo.emgDatStr = patient.emgDatStr;
        fishPool.currPatientInfo.cstNam = patient.cstNam;
        fishPool.currPatientInfo.vstCad = patient.vstCad;
        fishPool.currPatientInfo.cstSexCod = patient.cstSexCod == '0' ? '男' : '女';
        fishPool.currPatientInfo.preDgnCod = patient.preDgnCod;
        $.ajax({
            url: 'cz/getCzInfoByEmgSeq.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': fishPool.currPatientInfo.emgSeq
            }),
            success: function(res) {
                var sysdate = res.resultInfo.sysdata;
                // 获取节点集合
                var flowChartArray = sysdate.flowChartList;

                show = false;
                resetFlowChart();
                clearWindow(); //清除页面弹窗
                /**
                 返回的节点要分别处理，矩形和线条要添加的样式不一样，矩形需要填充为绿色，线条要染色为绿色。
                 */
                for (var i in flowChartArray) {
                    var flowchart = flowChartArray[i];
                    currentflowChartRect.push(flowchart.nodeId);
                    if (flowchart.nodeType == '3') {
                        // 如果节点是直线
                        if (flowChartLine[flowchart.nodeId]) {
                            flowChartLine[flowchart.nodeId].attr({
                                'stroke-width': '2px',
                                'stroke': '44b548'
                            });
                        }
                    } else {
                        // 如果节点是矩形，菱形
                        if (flowChart[flowchart.nodeId]) {
                            flowChart[flowchart.nodeId].attr({
                                'fill': '44b548'
                            });
                        }
                    }
                    // if(flowchart.nodeId =='xdt'){
                    // 	show = true;
                    // }
                }

                var hspCzzlInfArray = res.resultInfo.sysdata.hspCzzlInfList;
                console.log(hspCzzlInfArray);
                //停止倒计时
                clearInterval(cd1);

                for (var a in countdownTime) {
                    $('#' + a + ' div').css('background-color', '');
                }

                fishPool.currPatientInfo.NZDSJ = '';
                fishPool.currPatientInfo.XHYSJ = '';
                fishPool.currPatientInfo.YXXJCSJ = '';
                fishPool.currPatientInfo.ZDSJ = '';
                fishPool.currPatientInfo.RSZLKSSJ = '';

                for (var b in hspCzzlInfArray) {
                    if (fishPool.currPatientInfo.hasOwnProperty(hspCzzlInfArray[b].proCode)) {
                        fishPool.currPatientInfo[hspCzzlInfArray[b].proCode] = hspCzzlInfArray[b].proVal;
                    }
                }
                //重新启用倒计时
                cd1 = setInterval(countdown, 1000);

            },
            error: function(err) {
                //console.log(err)
            }
        });
    }

    function resetFlowChart() {
        // 重置流程图
        for (var i in flowChart) {
            flowChart[i].attr({
                'fill': 'white'
            });
            //预检分诊、急诊科默认绿色
            if (i == 'yjfz' || i == 'jizk') {
                flowChart[i].attr({
                    'fill': '44b548'
                });
            }
        }
        // 重置线条
        for (var i in flowChartLine) {
            flowChartLine[i].attr({
                'stroke-width': '2',
                'stroke': 'black',
                //'stroke-dasharray':'-'
            });
            //预检分诊-急诊科、急诊科-子节点矩形连线默认绿色
            if (i == 'yjf_jzk' || i == 'jzk_jzs') {
                flowChartLine[i].attr({
                    'stroke-width': '2px',
                    'stroke': '44b548'
                });
            }
        }
    }

    // 定时执行方法体
    function countdown() {

        // 质控比较的开始时间
        var emgDat = new Date(fishPool.currPatientInfo.emgDatStr);

        var currentTime = new Date();

        // 实现质控全部结束时，结束定时的机制，这里用flag来实现
        var clearIntervalScore = 0;

        for (var a in countdownTime) {

            // 如果相关字段值为空，则开启倒计时
            if (fishPool.currPatientInfo[a] == '') {
                // 获取剩余时间的毫秒数
                var leftTime = parseInt((emgDat.getTime() + countdownTime[a] * 60 * 1000 - currentTime.getTime()) / 1000);
                // 如果毫秒数大于等于0
                if (leftTime >= 0) {

                    // 剩余分钟数
                    var sec_left = parseInt(leftTime / 60);
                    // 剩余秒数
                    var min_left = leftTime % 60;

                    $('#' + a).progressbar({
                        value: leftTime / (countdownTime[a] * 60) * 100,
                        text: sec_left + '分' + min_left + '秒' + '/' + countdownTime[a] + '分'
                    });
                } else {
                    // 毫秒数小于0，代表超时

                    // 超时的分钟数
                    var sec_after = parseInt(Math.abs(leftTime) / 60);
                    // 超时的秒数

                    var text = '';
                    if (sec_after >= 100) {
                        text = '超时100分';
                    } else {
                        var min_after = Math.abs(leftTime) % 60;
                        text = '超时 ' + sec_after + '分' + min_after + '秒'
                    }
                    $('#' + a).progressbar({
                        value: 0,
                        text: text
                    });
                    $('#' + a + ' div').css('background-color', 'red');
                }
            } else {
                clearIntervalScore += 1;
            }
        }

        if (clearIntervalScore == 5) {
            clearInterval(cd1);
        }
    }

    var cd1 = setInterval(countdown, 1000);


    function getXhyData() {
        $.ajax({
            url: 'testWebSocket/noticeCZxhyComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': fishPool.currPatientInfo.emgSeq
            }),
            success: function(res) {

            },
            error: function(err) {
                //console.log(err)
            }
        });
    }

    function gettlCTData() {
        $.ajax({
            url: 'testWebSocket/noticeCZtlCTComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': fishPool.currPatientInfo.emgSeq
            }),
            success: function(res) {

            },
            error: function(err) {
                //console.log(err)
            }
        });
    }

    function gettlxdtData() {
        $.ajax({
            url: 'testWebSocket/noticeCZecgComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': fishPool.currPatientInfo.emgSeq
            }),
            success: function(res) {


            },
            error: function(err) {
                //console.log(err)
            }
        });
    }

    function drawFlow() {

        var yjfzNode = createTask(baseX + 405, baseY - 220, '预检分诊', 'yjfz');
        var jzkNode = createTask(baseX + 405, baseY - 100, '急诊科', 'jizk');
        drawArrowLine(yjfzNode[2], jzkNode[0], '', '', 'yjf_jzk'); //预检分诊-急诊科连线

        // 创建包含子任务大矩形
        var nodeGroup = createExpandedSubProcess(baseX + 130, baseY + 30, 650, 140, 10);
        drawArrowLine(jzkNode[2], nodeGroup[0], '', '', 'jzk_jzs'); //急诊科-子任务矩形连线
        createTask(baseX + 180, baseY + 60, '通知卒中医生\n会诊', 'tzczyshz');
        createTask(baseX + 330, baseY + 60, '心电图', 'xindt');
        createTask(baseX + 480, baseY + 60, '血化验', 'xuehy');
        createTask(baseX + 630, baseY + 60, '医学影像检查\n(CT/CTA)', 'yxyxjc');

        //头颅CT有无可疑出血表现-分支
        var tlctywkycxbxNode = createBranch(baseX + 140, baseY + 300, 'tlctywkycxbx', '头颅CT有无\n可疑出血表现');
        var sjwkhzNode = createTask(baseX - 20, baseY + 410, '神经外科\n会诊', 'sjwkhz');
        // var sfyrsjjzNode = createBranch(baseX + 300, baseY + 420, 'sfyrsjjz','是否有\n溶栓禁忌症');
        //子任务矩形-头颅CT有无可疑出血表现连线
        var path3 = 'm' + nodeGroup[2].x + ' ' + nodeGroup[2].y + ' ' + 'V' + (nodeGroup[2].y + tlctywkycxbxNode[0].y) / 2 +
            'H' + tlctywkycxbxNode[0].x + 'V' + tlctywkycxbxNode[0].y;
        var jzs_cxb = paper.path(path3);
        arrowSet.push(jzs_cxb);
        flowChartLine['jzs_cxb'] = jzs_cxb;
        //头颅CT有无可疑出血表现-神经外科会诊连线
        var path4 = 'm' + tlctywkycxbxNode[3].x + ' ' + tlctywkycxbxNode[3].y + ' ' + 'H' + sjwkhzNode[0].x + 'V' + sjwkhzNode[0].y;
        var cxb_sjw = paper.path(path4);
        arrowSet.push(cxb_sjw);
        flowChartLine['cxb_sjw'] = cxb_sjw;
        paper.text(tlctywkycxbxNode[3].x - 40, tlctywkycxbxNode[3].y - 10, '有');


        var sfjxrsNode = createBranch(baseX + 300, baseY + 550, 'sfjxrs', '是否进行溶栓');
        // drawArrowLine(sfyrsjjzNode[2], sfjxrsNode[0], '否', 'V', 'rsj_tyr');//是否有溶栓禁忌症-是否同意溶栓连线
        //头颅CT有无可疑出血表现-是否进行溶栓连线
        var path5 = 'm' + tlctywkycxbxNode[1].x + ' ' + tlctywkycxbxNode[1].y + ' ' + 'H' + sfjxrsNode[0].x + 'V' + sfjxrsNode[0].y;
        var cxb_jxr = paper.path(path5);
        arrowSet.push(cxb_jxr);
        flowChartLine['cxb_jxr'] = cxb_jxr;
        paper.text(tlctywkycxbxNode[1].x + 40, tlctywkycxbxNode[1].y - 10, '无');

        var wrsyyNode = createTask(baseX + 470, baseY + 670, '未溶栓原因', 'wrsyy');
        //是否进行溶栓-未溶栓原因 连线
        var path6 = 'm' + sfjxrsNode[1].x + ' ' + sfjxrsNode[1].y + ' ' + 'H' + (sfjxrsNode[1].x + 100) + ' ' + 'V' + wrsyyNode[0].y + 'H' + wrsyyNode[0].x;
        var tyr_wrs = paper.path(path6);
        arrowSet.push(tyr_wrs);
        flowChartLine['tyr_wrs'] = tyr_wrs;
        paper.text(sfjxrsNode[1].x + 40, sfjxrsNode[1].y - 10, '不同意');

        var qstysNode = createTask(baseX + 300, baseY + 670, '签署溶栓\n知情同意书', 'qstys');
        drawArrowLine(sfjxrsNode[2], qstysNode[0], '同意', 'V', 'jxr_qst'); //是否同意溶栓-签署溶栓知情同意书连线

        var xysfdbNode = createBranch(baseX + 300, baseY + 810, 'xysfdb', '血压是否达标');
        drawArrowLine(qstysNode[2], xysfdbNode[0], '', '', 'qst_xys'); //签署溶栓知情同意书-血压是否达标连线

        var jmrsNode = createTask(baseX + 300, baseY + 930, '静脉溶栓', 'jmrs');
        drawArrowLine(xysfdbNode[2], jmrsNode[0], '是', 'V', 'xys_jmr'); //血压是否达标-静脉溶栓连线

        var jyywNode = createTask(baseX + 140, baseY + 795, '降压药物', 'jyyw');
        drawArrowLine(xysfdbNode[3], jyywNode[1], '否', 'H', 'xys_jyy'); //血压是否达标-降压药物连线
        //降压药物-静脉溶栓
        var path11 = 'm' + jyywNode[2].x + ' ' + jyywNode[2].y + ' ' + 'V' + jmrsNode[3].y + 'H' + jmrsNode[3].x;
        var jyy_jmr = paper.path(path11);
        arrowSet.push(jyy_jmr);
        flowChartLine['jyy_jmr'] = jyy_jmr;
        paper.text(jmrsNode[3].x - 50, jmrsNode[3].y - 10, '血压达标');

        var zhuangNode = createTask(baseX + 300, baseY + 1070, '转归', 'zhuang');
        drawArrowLine(jmrsNode[2], zhuangNode[0], '', '', 'jmr_zhu'); //静脉溶栓-转归连线

        //未溶栓原因-转归连线
        var path14 = 'm' + wrsyyNode[2].x + ' ' + wrsyyNode[2].y + ' ' + 'V' + zhuangNode[1].y + 'H' + zhuangNode[1].x;
        var tyr_zhu = paper.path(path14);
        arrowSet.push(tyr_zhu);
        flowChartLine['tyr_zhu'] = tyr_zhu;
        paper.text(sfjxrsNode[1].x + 40, sfjxrsNode[1].y - 10, '不同意');




        var kyDdmZsNode = createBranch(baseX + 650, baseY + 300, 'sfkyddmzs', '是否可疑\n大动脉阻塞');
        //子任务矩形-是否可疑大动脉阻塞连线
        var path15 = 'm' + nodeGroup[2].x + ' ' + nodeGroup[2].y + ' ' + 'V' + (nodeGroup[2].y + kyDdmZsNode[0].y) / 2 +
            'H' + kyDdmZsNode[0].x + 'V' + kyDdmZsNode[0].y;
        var jzs_dmz = paper.path(path15);
        arrowSet.push(jzs_dmz);
        flowChartLine['jzs_dmz'] = jzs_dmz;

        var tzjrkhzNode = createTask(baseX + 650, baseY + 380, '通知介入科\n会诊', 'tzjrkhz');
        drawArrowLine(kyDdmZsNode[2], tzjrkhzNode[0], '是', 'V', 'dmz_tzj'); //是否可疑大动脉阻塞-通知介入科会诊连线

        var lnctajgNode = createBranch(baseX + 650, baseY + 520, 'lnctajg', '颅脑CTA结果');
        drawArrowLine(tzjrkhzNode[2], lnctajgNode[0], '', '', 'tzj_lnc'); //通知介入科会诊-颅脑CTA结果连线

        var sftyqsNode = createBranch(baseX + 650, baseY + 650, 'sftyqs', '是否同意取栓');
        drawArrowLine(lnctajgNode[2], sftyqsNode[0], '阳性', 'V', 'lnc_tyq'); //颅脑CTA结果-是否同意取栓连线

        var qsqstysNode = createTask(baseX + 650, baseY + 765, '签署取栓\n知情同意书', 'qsqstys');
        drawArrowLine(sftyqsNode[2], qsqstysNode[0], '是', 'V', 'tyq_qsq'); //是否同意取栓-签署取栓知情同意书连线

        var mazuiNode = createTask(baseX + 650, baseY + 870, '麻醉', 'mazui');
        drawArrowLine(qsqstysNode[2], mazuiNode[0], '', '', 'qsq_maz'); //签署取栓知情同意书-麻醉连线

        var qushuanNode = createTask(baseX + 650, baseY + 980, '动脉取栓', 'qushuan');
        drawArrowLine(mazuiNode[2], qushuanNode[0], '', '', 'maz_qus'); //麻醉-动脉取栓连线


        //未溶栓原因-转归连线
        var path27 = 'm' + qushuanNode[2].x + ' ' + qushuanNode[2].y + ' ' + 'V' + zhuangNode[1].y + 'H' + zhuangNode[1].x;
        var qus_zhu = paper.path(path27);
        arrowSet.push(qus_zhu);
        flowChartLine['qus_zhu'] = qus_zhu;

        // var zhuanguiNode = createTask(baseX + 650, baseY + 1110, '', 'zhuangui');
        // drawArrowLine(qushuanNode[2], zhuangNode[1], '', '', 'qus_zhu'); //动脉取栓-转归连线
        // 是否可疑大动脉阻塞 - 转归连线
        var path23 = 'm';
        path23 += kyDdmZsNode[1].x + ' ' + kyDdmZsNode[1].y + ' ';
        path23 += 'H';
        path23 += kyDdmZsNode[1].x + 50 + ' ';
        path23 += 'V';
        path23 += qushuanNode[1].y + 90 + '';
        path23 += 'H';
        path23 += qushuanNode[1].x + -350 + '';
        var dmz_zhu = paper.path(path23);
        arrowSet.push(dmz_zhu);
        flowChartLine['dmz_zhu'] = dmz_zhu;
        paper.text(kyDdmZsNode[1].x + 25, kyDdmZsNode[1].y - 10, '否');
        //颅脑CTA结果-转归连线
        var path24 = 'm';
        path24 += lnctajgNode[1].x + ' ' + lnctajgNode[1].y + ' ';
        path24 += 'H';
        path24 += lnctajgNode[1].x + 50 + ' ';
        path24 += 'V';
        path24 += qushuanNode[1].y + 90 + '';
        path24 += 'H';
        path24 += qushuanNode[1].x + -350 + '';
        var lnc_zhu = paper.path(path24);
        arrowSet.push(lnc_zhu);
        flowChartLine['lnc_zhu'] = lnc_zhu;
        paper.text(lnctajgNode[1].x + 25, lnctajgNode[1].y - 10, '阴性');
        //是否同意取栓-转归连线
        var path25 = 'm';
        path25 += sftyqsNode[1].x + ' ' + sftyqsNode[1].y + ' ';
        path25 += 'H';
        path25 += sftyqsNode[1].x + 50 + ' ';
        path25 += 'V';
        path25 += qushuanNode[1].y + 90 + ' ';
        path25 += 'H';
        path25 += qushuanNode[1].x + -350 + '';
        var tyq_zhu = paper.path(path25);
        arrowSet.push(tyq_zhu);
        flowChartLine['tyq_zhu'] = tyq_zhu;
        paper.text(sftyqsNode[1].x + 25, sftyqsNode[1].y - 10, '否');

        //神经外科会诊-转归连线
        var path26 = 'm';
        path26 += sjwkhzNode[2].x + ' ' + sjwkhzNode[2].y + ' ';
        path26 += 'V';
        path26 += zhuangNode[3].y + ' ';
        path26 += 'H';
        path26 += zhuangNode[3].x + ' ';
        var sjw_zhu = paper.path(path26);
        arrowSet.push(sjw_zhu);
        flowChartLine['sjw_zhu'] = sjw_zhu;

        //动脉取栓 - 转归连线
        // var path27 = 'm';
        // path27 += qushuanNode[2].x + ' ' + qushaunNode[2].y + ' ';
        // path27 += 'V';
        // path27 += zhaungNode[1].y + '';
        // path27 += 'H';
        // path27 += zhaungNode[1].x + '';
        // var qus_zhu = paper.path(path27);
        // arrowSet.push(qus_zhu);
        // flowChartLine['qus_zhu'] = qus_zhu;

        arrowSet.attr({
            'arrow-end': 'block-wide-long',
            'stroke-width': '2'
            //'stroke-dasharray':'-'
        });


        // 矩形统一添加属性和时间，注意如果不填充，很多事件不会触发。
        taskSet.attr({
            'fill': 'white' // 44b548
            //'fill-opacity':0
        });

    }

    function drawArrowLine(startNode, endNode, content, vh, id) {
        var pathStr = 'm' + startNode.x + ' ' + startNode.y + ' L' + endNode.x + ' ' + endNode.y;
        var line = paper.path(pathStr);
        arrowSet.push(line);
        flowChartLine[id] = line;
        if (content) {
            if (vh === 'V') {
                paper.text(startNode.x + 20, (startNode.y + endNode.y) / 2, content);
            } else if (vh === 'H') {
                paper.text((startNode.x + endNode.x) / 2, startNode.y - 10, content);
            }
        }
    }

    /**
     *
     * @param x
     * @param y
     * @param content   矩形框中的文本
     * @returns {Array} 矩形的上右下左四条边中点的坐标数组
     */
    function createTask(x, y, content, id) {
        // 3层组成，第一层矩形框，填充背景颜色;第二层文字居中;第三层点击事件触发层，设为透明度0;
        var task = paper.rect(x, y, taskWidth, taskHeight, taskR);

        var contentX = x + taskWidth / 2;
        var contentY = y + taskHeight / 2;
        var text = paper.text(contentX, contentY, content).attr({
            'font-size': 14
        });

        taskSet.push(task);

        flowChart[id] = task;

        var p3 = paper.rect(x - 10, y - 10, taskWidth + 20, taskHeight + 20, taskR);
        p3.attr({
            'fill': 'white',
            'fill-opacity': 0,
            'stroke-opacity': 0,
            'cursor': 'pointer'
        }).dblclick(function(evt) {
            if (id == 'xdt') {
                showEcg();
                return;
            }
        }).click(function(evt) {
            getNodeRefInfo(id, this);
        }).hover(function() {
            this.attr({
                'stroke': '#FF8888',
                'stroke-dasharray': '- ',
                'stroke-opacity': 100
            });
        }, function() {
            this.attr({
                'stroke-opacity': 0
            });
        });

        var nodeArray = [];
        nodeArray.push({
            'x': contentX,
            'y': y
        });
        nodeArray.push({
            'x': x + taskWidth,
            'y': contentY
        });
        nodeArray.push({
            'x': contentX,
            'y': y + taskHeight
        });
        nodeArray.push({
            'x': x,
            'y': contentY
        });

        return nodeArray;
    }

    function createExpandedSubProcess(x, y, w, h, r) {
        paper.rect(x, y, w, h, r).attr({
            "stroke": "black",
            "stroke-width": 3,
            "stroke-opocity": 0,
            "fill": "none"
        });
        var nodeArray = [];
        nodeArray.push({
            'x': x + w / 2,
            'y': y
        });
        nodeArray.push({
            'x': x + w,
            'y': y + w / 2
        });
        nodeArray.push({
            'x': x + w / 2,
            'y': y + h
        });
        nodeArray.push({
            'x': x,
            'y': y + w / 2
        });
        return nodeArray;
    }


    function createBranch(x, y, nodeId, content) {
        // paper.rect(x+25,y,50,50,0);
        x = x + 25;
        var path = paper.path('m' + (25 + x) + ' ' + (y - 10) + ' l70 35 l-70 35 l-70 -35 z');
        flowChart[nodeId] = (path);
        path.attr({
            'fill': 'white',
            'stroke-width': '1px'
        }).click(function(e) {
            //清除页面上的信息窗
            clearWindow();
        });
        if (content) {
            // 像素和字体转化
            // var length = content.length;
            // 文本都是居中展示的，所以偏移量为content的一般字数所占的像素值，下文写死了为75，实际应该为font-size*length/2
            paper.text(x + 25, y + 25, content).attr({
                'font-size': 14
            });
        }
        var nodeArray = [];
        nodeArray.push({
            'x': x + 25,
            'y': y - 10
        });
        nodeArray.push({
            'x': x + 95,
            'y': y + 25
        });
        nodeArray.push({
            'x': x + 25,
            'y': y + 60
        });
        nodeArray.push({
            'x': x - 45,
            'y': y + 25
        });
        return nodeArray;
    }

    function selectCodeToTxt(prop, value, proListName) {
        var txt = '';
        var dict = publicFun.getDict(proListName);
        if (dict) {
            for (var j = 0; j < dict.length; j++) {
                if (dict[j].infocode == value) {
                    txt = dict[j].info;
                }
            }
        }
        return txt;
    }
    var checkboxArr = [{
        proCode: "JIWS",
        sessionKey: 'PAST_HIS'
    }, {
        proCode: "PSFYY",
        sessionKey: 'PSFYY'
    }, {
        proCode: "GUOMS",
        sessionKey: 'ALG_TYP_COD'
    }, {
        proCode: "WRSYY",
        sessionKey: 'CZ_WRSYY_COD'
    }, {
        proCode: "CSJC",
        sessionKey: 'CZ_CSJC_COD'
    }, {
        proCode: "BRJJSJJ",
        sessionKey: 'CZ_BRJJSJJ_COD'
    }, {
        proCode: "CZRSJDHXDJJ",
        sessionKey: 'CZ_CZRSJDHXDJJ_COD'
    }];

    function checkboxCodeToTxt(prop, value) {
        var txt = '';
        var dicArr = [];
        var valueArr = value.split(',');
        for (var i = 0; i < checkboxArr.length; i++) {
            if (checkboxArr[i].proCode == prop) {
                dicArr = publicFun.getDict(checkboxArr[i].sessionKey);
                break;
            }
        }
        dicArr.forEach(el => {
            if (valueArr.indexOf(el.infocode) > -1) {
                txt += el.info + ',';
            }
        });
        return txt ? txt.slice(0, -1) : value;
    }

    function dealhspJcrwList(hspJcrwList) {
        console.log("###############", hspJcrwList);
        hspJcrwList.forEach(el => {
            el.shrq = moment(el.shrq).format('YYYY-MM-DD HH:mm:ss'); //格式化报告时间
            var _html = "<div class='checkList'>" +
                "<div><span class='name'>检查项目:</span><span class='val'>" + el.ylmc + "</span></div>" +
                "<div><span class='name'>报告医生:</span><span class='val'>" + el.bgysxm + "</span></div>" +
                "<div><span class='name'>检查结果:</span><span class='val' style='width: 80%'>" + el.jcjg + "</span></div>" +
                "<div><span class='name'>报告时间:</span><span class='val'>" + el.shrq + "</span></div>" +
                "</div>";
            $('#window').append(_html);
        });
    }
    //统一处理弹窗内要显示的数据的格式
    function constructTxt(resList) {
        //var txt = '';
        var maxNameLen = 1;
        if (resList) {
            resList.forEach(el => {
                var type = el.proType,
                    value = el.proVal,
                    name = el.proName,
                    prop = el.proCode,
                    proUnit = el.proUnit || '',
                    proListName = el.proList;
                if (value) {
                    if (type == 'time2') {
                        value = moment(value, 'YYYY-MM-DD HH:mm:ss').format('HH:mm');
                    }
                    if (type == 'time5') {
                        value = moment(value, 'YYYY-MM-DD HH:mm:ss').format('YYYY-MM-DD HH:mm');
                    }
                    if (type == "select") {
                        value = selectCodeToTxt(prop, value, proListName);
                    }
                    if (type == "checkbox") {
                        value = checkboxCodeToTxt(prop, value);
                    }
                    if (type == "radio") {
                        var dict = publicFun.getDict(proListName);

                        dict.forEach(el => {
                            if (el.infocode == value) {
                                value = el.info;
                            }
                        });

                    }
                } else {
                    value = '';
                }
                if (name.length > maxNameLen) {
                    maxNameLen = name.length;

                }
                // txt += name + ':' + value + '\n';
                $('#window').append("<div class='item'><div class='name'>" + name + ":" + "</div><div class='val'>" + value + " " + proUnit + "</div></div>");
                if (prop == 'RSZLKSSJ' && value != null) {

                    var date1 = new Date(el.proVal);
                    var date2 = new Date(fishPool.currPatientInfo.emgDatStr);

                    var dnt = Math.round((date1 - date2) / 1000 / 60);
                    $('#window').append("<div class='item'><div class='name'>" + 'DNT时间' + ":" + "</div><div class='val'>" + dnt + "分钟 " + proUnit + "</div></div>");
                }
            });
            $('#window .item .name').css({
                'width': maxNameLen + 'em'
            });
        }
        //return txt;
    }

    var hasWindow = false;
    //var infoWindow = {},windowTxt = {},mask = {};
    function getNodeRefInfo(nodeId, parent) {
        if (currentflowChartRect.indexOf(nodeId) < 0) {
            return;
        }
        //如果当前页面已有信息窗，先清除
        clearWindow();
        $.ajax({
            url: 'cz/getNodeInfoByEmgSeq.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'nodeId': nodeId,
                'emgSeq': fishPool.currPatientInfo.emgSeq
            }),
            success: function(res) {
                var resList = res.resultInfo.sysdata.list || [];
                if (resList.length) {
                    console.log("55555555555", resList);
                    constructTxt(resList);
                    var _top = parent.attrs.y + 100;
                    var _left = parent.attrs.x + 60;
                    $('#window').css({
                        'display': 'block',
                        'top': _top + 'px',
                        'left': _left + 'px'
                    });
                    hasWindow = true;
                }
            },
            error: function(err) {}
        });
    }
    //清除页面展示的信息窗
    function clearWindow() {
        if (hasWindow) {
            hasWindow = false;
            $('#window').empty();
            $('#window').css({
                'display': 'none'
            });
        }
    }

    function reload() {
        console.log('卒中刷新局部');
    }

    //点击ECG心电图节点跳转到心电图页
    function showEcg() {
        console.log("******展示心电图******");

        if (show) {
            window.top.addTab('心电图', '${baseurl}cpc/toEcgPage.do?emgSeq=' + fishPool.currPatientInfo.emgSeq, 'icon icon-emergency-record');
        } else {
            $.messager.alert('提示信息', '心电图未完成！', 'warning');
        }
    }

    //判断是否为编辑器模板
    function tempIsFromTiny(tempno) {
        if(tempno.indexOf('TEMP') === 0) {
            return true;
        } else {
            return false;
        }
    }

    //展示知情同意书
    function showTable() {
        $('#fileBox').window({
            width: 500,
            height: 380,
            modal: true,
            title: '知情同意书'
        });
        $('#dg').datagrid({
            striped: true,
            url: '${baseurl}zyyconsent/queryHspConsentTemp_result.do',
            // pagination: true,
            rownumbers: true,
            // pageList: [20, 30, 50],
            queryParams: {
                'hspConsentTempCustom.tempname':'',
                'tempCode': fishPool.tempCode
            },
            columns: [
                [{
                    field: 'tempSeq',
                    title: '模板号',
                    width: 150,
                    styler: function(value, row, index) {
                        return 'font-weight:bold';
                    }
                }, {
                    field: 'tempName',
                    title: '名称',
                    width: 310
                }, ]
            ],
            onDblClickRow: function(rowIndex, rowData) {
                // console.log("++++++++++++");
                // console.log(rowData);
                <%--var url = '${baseurl}zyyconsent/ConsentInfByTempno.do?tempno=' + rowData.code + '&tempname=' + rowData.name + '&refseqno=' + fishPool.currPatientInfo.emgSeq;--%>
                <%--window.top.addTab(rowData.name, url, 'icon icon-emergency-record');--%>

                if(tempIsFromTiny(rowData.tempSeq)){
                    var url = '${baseurl}zyyconsent/toXtPageEdit.do?tempno=' +  rowData.tempSeq + '&tempname=' + rowData.tempName
                        + '&refseqno=' + fishPool.currPatientInfo.regSeq + '&cstNam=' + fishPool.currPatientInfo.cstNam + '&tempCode=' + fishPool.tempCode;
                    url = encodeURI(url);
                    // alert(url);
                }
                else{
                    var url = '${baseurl}zyyconsent/ConsentInfByTempno.do?tempno='+rowData.tempSeq+'&tempname='+rowData.tempName+'&refseqno='+fishPool.currPatientInfo.regSeq;
                }
                window.top.addTab(rowData.tempName, url, 'icon icon-emergency-record');
            }
        });
    }

    function printCzhcb() {

        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        //LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.ADD_PRINT_HTM('2mm', 0, "100%", "100%", document.getElementById("printCzhcb").innerHTML);
        LODOP.SET_PRINT_MODE("PRINT_DUPLEX", 2);
        LODOP.SET_PRINT_MODE("PRINT_DEFAULTSOURCE", 1); //1 - 纸盒 4 - 手动 7 - 自动 0 - 不控制
        // LODOP.SET_PRINT_MODE("DOUBLE_SIDED_PRINT", true);
        LODOP.PREVIEW();
    }
    //分页
    function setPagination() {
        $('#pp').pagination({
            total:fishPool.pageInfo.total,
            pageSize:fishPool.pageInfo.pageSize,
            loading: true,
            pageNumber: fishPool.pageInfo.pageNumber,
            pageList: [5,10,15],
            onSelectPage:function(pageNumber, pageSize){
                $(this).pagination('loading');
                fishPool.pageInfo.pageNumber = pageNumber
                fishPool.pageInfo.pageSize = pageSize
                getPatientList()
                $(this).pagination('loaded');
            },
        });
        $('#pp').pagination('loaded');
    }
    $(function() {

        initWebSocket();
        drawFlow();
        if ('${emgSeq}') {
            fishPool.showPatientList = false;
            $('.flow').css('width','100%');
            setTimeout(() => {
                $('.rightBtn').hide()
            })
            getPatientListBycreated()
        }else {
            getPatientList();

        }
    });
</script>
</body>

</html>
