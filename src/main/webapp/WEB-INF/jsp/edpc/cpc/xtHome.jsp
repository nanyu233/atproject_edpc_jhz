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
    <title>胸痛流程2.0</title>
    <link rel="stylesheet" type="text/css" href="styles/hzszyyhems/flow.css">
    <link rel="stylesheet" type="text/css" href="styles/common/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <style>
        #paperDiv{
            width: 1190px;
            height: 840px;
        }
        .fileBox{
            position: absolute;
            top: 270px;
            left: 8px;
            z-index:999;
        }
        .countDown{
            z-index: 999;
        }
        #window{
            position: absolute;
            top:0;
            left:0;
        }
        #window .item{
            background: rgba(0,0,0,0.5);
            white-space:nowrap;
        }
        #window .item .name{
            display: inline-block;
            color: #fff;
            text-align: right;
        }
        #window .item .val{
            display: inline-block;
            color: #FFCC00;
        }
        #window .item .unit{
            color: #ffffff;
            display: inline-block;
        }
    </style>
</head>
<body ms-controller="flowChart" class="flowChart">
<div class="flow">
    <div id="infoBar" class="infoBar">
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="redirectToprint()">打印诊疗表</div>
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="toReport()">胸痛上报助手</div>
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="toCpcTimeline()">时间轴</div>
        <div><span>姓名：</span><span>{{currPatientInfo.cstNam}}</span></div>
        <div><span>预检时间：</span><span>{{currPatientInfo.emgDatStr}}</span></div>
        <div><span>分诊号：</span><span>{{currPatientInfo.emgSeq}}</span></div>
        <div><span>初步诊断：</span><span>{{currPatientInfo.preDgnCod}}</span></div>
        <div class="rightBtn" ms-visible="!showPatientList" ms-click="listTrigger('1')"><span class="iconfont icon-show listTrigger"></span><span>病人列表</span></div>
    </div>
    <div class="countDown" ms-if="patientList.length">
        <div class="title"><i onclick="trigger()" class="iconfont icon-tongzhi" style="font-size: 18px"></i> 倒计时提醒</div>
        <div class="btnWrapper" ms-visible="showBtn">
            <span onclick="getXhyData()">血化验完成</span>
            <span onclick="getEcgFinish()">心电图完成</span>
        </div>
        <div class="item">
            <div class="child name">首份ECG时间:</div>
            <div class="child time" ms-visible="nodeTime['XDTSJ'].time">
                <div>{{nodeTime['XDTSJ'].time}}</div>
            </div>
            <div class="child" ms-class="redFont:nodeTime['XDTSJ'].timeout" ms-visible="nodeTime['XDTSJ'].time">
                ({{nodeTime['XDTSJ'].timeCost}}/{{nodeTime['XDTSJ'].total}}分)
            </div>
            <div class="child" ms-if="!nodeTime['XDTSJ'].time">
                <div id="ecg" class="bar"></div>
            </div>
        </div>
        <div class="item">
            <div class="child name">CVN时间:</div>
            <div class="child time" ms-visible="nodeTime['CTNIBGSJ'].time">
                <div>{{nodeTime['CTNIBGSJ'].time}}</div>
            </div>
            <div class="child" ms-class="redFont:nodeTime['CTNIBGSJ'].timeout" ms-visible="nodeTime['CTNIBGSJ'].time">
                ({{nodeTime['CTNIBGSJ'].timeCost}}/{{nodeTime['CTNIBGSJ'].total}}分)
            </div>
            <div class="child" ms-if="!nodeTime['CTNIBGSJ'].time">
                <div id="cvn" class="bar"></div>
            </div>
        </div>
        <div class="item" ms-visible="nodeTime['XDTSJ'].time">
            <div class="child name">ECG确诊时间:</div>
            <div class="child time" ms-visible="nodeTime['XDTQZSJ'].time">
                <div>{{nodeTime['XDTQZSJ'].time}}</div>
            </div>
            <div class="child" ms-class="redFont:nodeTime['XDTQZSJ'].timeout" ms-visible="nodeTime['XDTQZSJ'].time">
                ({{nodeTime['XDTQZSJ'].timeCost}}/{{nodeTime['XDTQZSJ'].total}}分)
            </div>
            <div class="child" ms-if="!nodeTime['XDTQZSJ'].time">
                <div id="ecgEnd" class="bar"></div>
            </div>
        </div>
        <div class="item" ms-visible="patientGreenNodes.indexOf('6')>-1">
            <div class="child name">
                抗血小板治疗时间:
            </div>
            <div class="child time" ms-visible="nodeTime['KXXBYWGYSJ'].time">
                <div>{{nodeTime['KXXBYWGYSJ'].time}}</div>
            </div>
            <div class="child" ms-class="redFont:nodeTime['KXXBYWGYSJ'].timeout" ms-visible="nodeTime['KXXBYWGYSJ'].time">
                ({{nodeTime['KXXBYWGYSJ'].timeCost}}/{{nodeTime['KXXBYWGYSJ'].total}}分)
            </div>
            <div class="child" ms-if="!nodeTime['KXXBYWGYSJ'].time">
                <div id="xxb" class="bar"></div>
            </div>
        </div>
        <div class="item" ms-visible="nodeTime['QDDGS'].time">
            <div class="child name">导管室激活时间:</div>
            <div class="child time" ms-visible="nodeTime['DGSJH'].time">
                <div>{{nodeTime['DGSJH'].time}}</div>
            </div>
            <div class="child" ms-class="redFont:nodeTime['DGSJH'].timeout" ms-visible="nodeTime['DGSJH'].time">
                ({{nodeTime['DGSJH'].timeCost}}/{{nodeTime['DGSJH'].total}}分)
            </div>
            <div class="child" ms-if="!nodeTime['DGSJH'].time">
                <div id="dgs" class="bar"></div>
            </div>
        </div>
        <div class="item" ms-visible="nodeTime['DGSJH'].time">
            <div class="child name">球囊扩张时间:</div>
            <div class="child time" ms-visible="nodeTime['QNKZSJ'].time">
                <div>{{nodeTime['QNKZSJ'].time}}</div>
            </div>
            <div class="child" ms-class="redFont:nodeTime['QNKZSJ'].timeout" ms-visible="nodeTime['QNKZSJ'].time">
                ({{nodeTime['QNKZSJ'].timeCost}}/{{nodeTime['QNKZSJ'].total}}分)
            </div>
            <div class="child" ms-if="!nodeTime['QNKZSJ'].time">
                <div id="d2b" class="bar"></div>
            </div>
        </div>
    </div>

    <div class="fileBox" ms-visible="showFiles">
        <div>知情同意书</div>
        <table id="dg" style="width: 240px"></table>
    </div>

    <div id="paperDiv">
        <div id="window" onclick="clearWindow()"></div>
    </div>
</div>
<div class="list" ms-visible="showPatientList">
    <div class="searchBar">
        <i class="iconfont icon-hide listTrigger" ms-click="listTrigger('0')"></i>
        <input type="text" ms-on-input="onInput" ms-on-keypress="onKeyPress" class="searchInput" placeHolder="输入姓名搜索"/>
        <label class="toggleBtn">
            <input type="checkbox" ms-click="showHisToggle"/><span ms-class="activeBtn:showHis">历史</span>
        </label>
    </div>
    <ul ms-if="patientList.length">
        <li ms-repeat-el="patientList" ms-click="clickPatient(el)"
            ms-class="selected:el.emgSeq===currPatientInfo.emgSeq">
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
                <i ms-if="el.hasUpdated" class="iconfont icon-new-msg"
                   style="color: red;font-size: 30px;vertical-align: bottom"></i>
            </div>
            <div class="info_item">
                <span class="title">预检时间:</span>
                <span>{{el.emgDatStr}}</span>
            </div>
            <div class="info_item">
                <span class="title">Killip分级:</span>
                <span ms-visible="el.killip == 0" class="killip_1">Ⅰ级</span>
                <span ms-visible="el.killip == 1" class="killip_2">Ⅱ级</span>
                <span ms-visible="el.killip == 2" class="killip_3">Ⅲ级</span>
                <span ms-visible="el.killip == 3" class="killip_4">Ⅳ级</span>
            </div>
            <div class="info_item">
                <span class="iconfont icon-iconxyang" style="color: #44b548"></span>
                <span>{{el.oxyNbr}}%</span>
                <span class="iconfont icon-heartrate" style="color:red"></span>
                <span>{{el.hrtRte}}次/分</span>
                <span class="iconfont icon-hamnatodynamometer" style="color: #f90"></span>
                <span>{{el.sbpUpNbr}}/{{el.sbpDownNbr}}</span>
            </div>
        </li>
    </ul>
    <div class="no-patient" ms-if="!patientList.length">暂无相关病人数据</div>
</div>
<script type="text/javascript">
    var locate = window.location;
    var weburl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketXt.do";
    var ws;
    var ecgTimer = null, 
	    cvnTimer = null, 
	    ecgEndTimer = null, 
	    xxbTimer = null, 
	    dgsTimer = null, 
	    d2bTimer = null;

    var paper = Raphael("paperDiv", 1190, 1930),
        taskWidth = 80,
        // 本模块矩形定高
        taskHeight = 45,
        taskR = 6;
    // 箭头集合
    var arrowSet = paper.set();
    var mainSet = paper.set();//存放"主干"部分的节点和画线
    var nonAcsSet = paper.set();//存放非ACS部分的节点和画线
    var acsSet = paper.set();//存放ACS部分的节点和画线

    // 存放流程线
    var flowChartLine = {};
    // 存放所有的流程组件，包括任务，分支
    var flowChart = {};
    // 存放流程线
    var flowChartLine = {};
    // 当前的矩形节点
    var nodeArrayFromGateWay1; //存放初步诊断节点
    var nodeArrayByTask1;//存放非ACS节点
    var nodeArrayByTask2;//存放ACS节点
    var hasWindow = false;//页面上是否有信息窗

    var baseX = 4;
    var baseY = 35;
    
    var finishedNodeAttr = {
    	'fill': '44b548'
    },
    unfinishedNodeAttr ={
    	'fill': '44b548'
    }

    var isFinishEcg = false;

    var vm = avalon.define({
        $id: 'flowChart',
        showHis:false,//是否包含历史
        showPatientList:true,
        searchKey:null,//搜索框输入内容
        patientList: [],//右侧胸痛病人列表
        patientGreenNodes: [],//单个病人已完成的流程节点
        currPatientInfo: {}, //当前胸痛病人信息
        windowInfo:{},
        //后台获取的倒计时节点的时间，属性值为空或具体时间
        // nodeTime: {'XDTSJ':'', 'CTNIBGSJ':'', 'XDTQZSJ':'', 'KXXBYWGYSJ':'', 'QDDGS':'','DGSJH':'', 'QNKZSJ':''},
        nodeTime: {
            //首份ECG
            'XDTSJ':{
                time:'',//用于展示的时间 时分格式
                realTime:'',//真实时间 年月日时分格式
                timeCost:'',//质控用时
                timeout:false,//是否超时
                total:'10'//质控标准
            },
            //CVN
            'CTNIBGSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'20'
            },
            //ECG确诊
            'XDTQZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'10'
            },
            //血小板治疗
            'KXXBYWGYSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //导管室启动
            'QDDGS':{
                time:'',
                realTime:'',
            },
            //导管室激活
            'DGSJH':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //球囊扩张
            'QNKZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'90'
            }
        },
        grace: {
            ageScore: 0,
            hrtScore: 0,
            sbpScore: 0,
            creScore: 0,
            killipScore: 0,
            dangerScore: 0,
            totalScore: 0,
            grade:'低危'
        },
        showBtn: false,
        showFiles: false,
        hasAcsNode: false,//ACS节点是否变绿
        hasNonAcsNode:false,//非ACS节点是否变绿
        // "包含历史"的按钮点击事件
        showHisToggle:function(){
            vm.showHis = !vm.showHis;
            getPatients();
        },
        //搜索框输入事件
        onInput:function(e){
            vm.searchKey = this.value;
        },
        //搜索框回车事件
        onKeyPress:function(e){
            if(e.keyCode == 13){
                getPatients();
            }
        },
        // 点击右侧列表中的病人信息，根据emgSeq获取该病人已进行过的流程节点；
        // 根据获取到的节点判断需单独显示非ACS分支还是单独显示ACS分支；
        clickPatient: function (patient) {
            //获取当前病人的信息
            vm.currPatientInfo = patient;
            patient.hasUpdated = false;
            resetFlowChart();
            // 设置左侧流程图以及流程图上方的信息栏数据
            vm.setNodesAndInfo(patient.emgSeq);
        },
        listTrigger:function (flg) {
            if(flg == '1'){
                vm.showPatientList = true;
                $('.flow').css('width','80%');
            }
            if(flg == '0'){
                vm.showPatientList = false;
                $('.flow').css('width','100%');
            }
        },
        // 根据emgSeq获取并设置每个病人的左侧流程图以及流程图上方的信息栏数据
        setNodesAndInfo: function (_emgSeq) {
            $.ajax({
                url: '${baseurl}cpc/getCpcPatientRouteInfoByEmgSeq.do',
                type: 'post',
                dataType: 'json',
                contentType: 'application/json;charset=UTF-8',
                data: JSON.stringify({
                    'emgSeq': _emgSeq
                }),
                success: function (res) {
                    // 获取节点集合
                    var list = res.resultInfo.sysdata.list;

                    vm.patientGreenNodes = [];
                    vm.patientGreenNodes.push("2");//病情评估节点一进页面即可变绿
                    for (var i=0; i<list.length; i++){
                        if(list[i].nodeId == '3'){ 
                        	// 心电图节点status=2或3时都可变绿
                            vm.patientGreenNodes.push(list[i].nodeId);
                        }else{
                            list[i].status == 2 && vm.patientGreenNodes.push(list[i].nodeId);
                        }
                    }

                    // 根据现有节点，显示流程图分支
                    vm.dealFlowNodes();

                    //获取该病人的节点倒计时信息
                    var countInfoList = res.resultInfo.sysdata.hspXtzlInfList;
                    clearOldNodeTime();
                    $.each(countInfoList, function (key, obj) {
                        vm.nodeTime[obj.proCode].realTime = publicFun.timeFormat(obj.proVal, 'yyyy/MM/dd hh:mm');
                        vm.nodeTime[obj.proCode].time = publicFun.timeFormat(obj.proVal, 'yyyy/MM/dd hh:mm').slice(-5);
                    });
                    vm.dealNodeTime(countInfoList);
                },
                error: function (err) {
                    //console.log(err)
                }
            });
        },
        // 根据已有的节点，判断单独显示非ACS分支或者ACS分支
        dealFlowNodes: function () {
            vm.hasNonAcsNode = false;//重新初始化非ACS节点标志
            vm.hasAcsNode = false;//重新初始化ACS节点标志
            if(vm.patientGreenNodes.indexOf('6') > -1) vm.hasAcsNode = true;
            if(vm.patientGreenNodes.indexOf('21') > -1) vm.hasNonAcsNode = true;
            if(vm.patientGreenNodes.indexOf('3') > -1) isFinishEcg = true;//判断心电图是否完成
            for (var node in flowChart){
                if (vm.patientGreenNodes.indexOf(node) > -1){
                	
                    flowChart[node].attr(finishedNodeAttr);
                }
            }
            if(vm.hasAcsNode && !vm.hasNonAcsNode){
                showAcs();
            } else if(!vm.hasAcsNode && vm.hasNonAcsNode){
                showNonAcs();
            }else{
                showAll();
            }
        },
        //根据后台获取到的流程图质控节点的时间处理倒计时
        dealNodeTime: function (countInfoList) {
            //获取倒计时节点的具体时间，赋值给Avalon的nodeTime对象
            if (countInfoList.length) {
                $.each(countInfoList,function (key,obj) {
                    var resObj = {timeCost: '', timeout: false};
                    if (obj.proCode == 'XDTSJ' || obj.proCode == 'CTNIBGSJ' || obj.proCode == 'KXXBYWGYSJ' || obj.proCode == 'QNKZSJ') {
                        resObj = calcTimeCost(vm.currPatientInfo.emgDatStr, obj.proVal, vm.nodeTime[obj.proCode].total);
                    }
                    if (obj.proCode == 'XDTQZSJ') {
                        resObj = calcTimeCost(vm.nodeTime['XDTSJ'].realTime, obj.proVal, vm.nodeTime[obj.proCode].total);
                    }
                    if (obj.proCode == 'DGSJH') {
                        resObj = calcTimeCost(vm.nodeTime['QDDGS'].realTime, obj.proVal, vm.nodeTime[obj.proCode].total);
                    }
                    vm.nodeTime[obj.proCode].timeCost = resObj.timeCost;
                    vm.nodeTime[obj.proCode].timeout = resObj.timeout;
                })
            }

            //清除所有定时器，防止切换不同病人时，与上个病人的倒计时定时器冲突
            var timers = [ecgTimer, cvnTimer, ecgEndTimer, xxbTimer, dgsTimer, d2bTimer];
            $.each(timers, function (key, val) {
                clearInterval(val);
            });

            //开始倒计时，点击列表的️某个病人需要即刻展示其首份心电图、血化验的完成时间或倒计时
            //XDTSJ---首份ECG时间
            if (!vm.nodeTime['XDTSJ'].time) {
                setProgressbar('ecg', vm.currPatientInfo.emgDat, 10);
                ecgTimer = setInterval(countDown('ecg', vm.currPatientInfo.emgDat, 10), 1000);
            }
            //CTNIBGSJ---CVN时间
            if (!vm.nodeTime['CTNIBGSJ'].time) {
                setProgressbar('cvn', vm.currPatientInfo.emgDat, 20);
                cvnTimer = setInterval(countDown('cvn', vm.currPatientInfo.emgDat, 20), 1000);
            }
            //若首份心电图完成，心电图确诊时间倒计时开始
            if (vm.nodeTime['XDTSJ'].time) {
                var start = new Date(vm.nodeTime['XDTSJ'].realTime).getTime();
                setProgressbar('ecgEnd', start, 10);
                ecgEndTimer = setInterval(countDown('ecgEnd', start, 10), 1000);
            }
            //若ACS节点变绿，抗血小板药物给药时间倒计时开始
            if (vm.patientGreenNodes.indexOf('6') > -1) {
                setProgressbar('xxb', vm.currPatientInfo.emgDat, 30);
                xxbTimer = setInterval(countDown('xxb', vm.currPatientInfo.emgDat, 30), 1000);
            }
            //导管室启动时间有值、激活时间为空时，导管室激活倒计时开始
            if(vm.nodeTime['QDDGS'].time && !vm.nodeTime['DGSJH'].time){
                setProgressbar('dgs', new Date(vm.nodeTime['QDDGS'].realTime).getTime(), 30);
                dgsTimer = setInterval(countDown('dgs', new Date(vm.nodeTime['QDDGS'].realTime).getTime(), 30), 1000);
            }

            //知情同意书节点变绿，D-B时间倒计时开始
            if (vm.patientGreenNodes.indexOf('14') > -1) {
                setProgressbar('d2b', vm.currPatientInfo.emgDat, 90);
                d2bTimer = setInterval(countDown('d2b', vm.currPatientInfo.emgDat, 90), 1000);
            }
        }
    });
    
    vm.$watch('patientGreenNodes', function (newVal, oldVal, name) {
    	console.log('oldVal',oldVal);
    	console.log('newVal',newVal);
    })
    function showAll(){
        clearWindow();//清除页面信息窗（如果有遗留信息窗)
        nonAcsSet.attr({'transform':'T0 0'});//非ACS移至原位
        acsSet.attr({'transform':'T0 0'});//ACS移至原位
        flowChartLine['newLine'] && flowChartLine['newLine'].attr({'stroke':'white'});
        flowChartLine['line03'].attr({'stroke':'black'});
        flowChartLine['line04'].attr({'stroke':'black'});
        vm.showFiles = false;
    }
    function showNonAcs() {
        clearWindow();//清除页面信息窗（如果有遗留信息窗）
        nonAcsSet.attr({'transform':'T260 70'});//非ACS移至主干正下方
        acsSet.attr({'transform':'T1000 0'});//ACS隐藏
        flowChartLine['line03'].attr({'stroke':'white'});
        flowChartLine['line04'].attr({'stroke':'white'});

        var newLine = 'm';
        newLine += nodeArrayFromGateWay1[2].x + ' ' + nodeArrayFromGateWay1[2].y + ' ';
        newLine += 'V';
        newLine += nodeArrayFromGateWay1[2].y + 25;
        var lineObj = paper.path(newLine).attr({
            'title':'newLine'
        });
        flowChartLine['newLine'] = lineObj;
        vm.showFiles = false;
    }
    function showAcs() {
        clearWindow();//清除页面信息窗（如果有遗留信息窗）
        nonAcsSet.attr({'transform':'T-1000 0'});//隐藏非ACS
        acsSet.attr({'transform':'T-270 70'});//ACS移至主干正下方

        flowChartLine['line03'].attr({'stroke':'white'});
        flowChartLine['line04'].attr({'stroke':'white'});
        var newLine = 'm';
        newLine += nodeArrayFromGateWay1[2].x + ' ' + nodeArrayFromGateWay1[2].y + ' ';
        newLine += 'V';
        newLine += nodeArrayFromGateWay1[2].y + 25;
        var lineObj = paper.path(newLine).attr({
            'title':'newLine'
        });
        flowChartLine['newLine'] = lineObj;
        vm.showFiles = true;
        showTable();
    }
    /**
     * 获取右侧胸痛病人列表；
     * searchKey ----搜索关键字
     * showHis ----是否 包含历史
     **/
    function getPatients(){
        publicFun.httpServ('post', '${baseurl}cpc/getCpcPatientListInfo.do', {
            cstNam: vm.searchKey,
            bhls: vm.showHis
        }, function (res) {
            resetFlowChart();
            var list = res.resultInfo.sysdata.list;
            if (list && list.length) {
                for (var i = 0; i < list.length; i++) {
                    list[i].emgDatStr = publicFun.timeFormat(list[i].emgDat, 'yyyy/MM/dd hh:mm');//格式化预检时间
                    list[i].hasUpdated = false;//设置信息更新的标志
                }
                vm.patientList = list;
                //左侧流程图立即渲染右侧列表的第一个病人的数据
                vm.currPatientInfo = list[0];
                vm.setNodesAndInfo(list[0].emgSeq);
            }else {
                vm.patientList = [];
                vm.patientGreenNodes = [];
                vm.currPatientInfo ={};
                clearOldNodeTime();
                showAll();
            }
        });
    }
    //初始化流程图节点
    function resetFlowChart(){
        // 重置流程图
        for(var i in flowChart){
            flowChart[i].attr({
                'fill': 'white'
            });
        }
        flowChart[1].attr(finishedNodeAttr);
    }
    //初始化质控点时间
    function clearOldNodeTime() {
        //清空nodeTime旧数据；
        vm.nodeTime =  {
            //首份ECG
            'XDTSJ':{
                time:'',//用于展示的时间 时分格式
                realTime:'',//真实时间 年月日时分格式
                timeCost:'',//质控用时
                timeout:false,//是否超时
                total:'10'//质控标准
            },
            //CVN
            'CTNIBGSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'20'
            },
            //ECG确诊
            'XDTQZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'10'
            },
            //血小板治疗
            'KXXBYWGYSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //导管室启动
            'QDDGS':{
                time:'',
                realTime:'',
            },
            //导管室激活
            'DGSJH':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'30'
            },
            //球囊扩张
            'QNKZSJ':{
                time:'',
                realTime:'',
                timeCost:'',
                timeout:false,
                total:'90'
            }
        };
    }
    /**
     *计算质控点用时
     * 返回''时''分格式的用时和是否超时
     * start---质控开始时间
     * end---质控结束时间
     * std--质控标准（规定完成用时，如：10分钟）
     **/
    function calcTimeCost(start,end,std){
        var _start = new Date(start).getTime(),
            _end = new Date(end).getTime(),
            std_ms = std * 60 * 1000;
        var diff_ms = _end - _start,
            diff_min = parseInt(diff_ms / 1000 / 60),
            diff_s = parseInt((diff_ms % 60000) / 1000);
        return {
            timeCost: diff_min + '分' + diff_s + '秒',
            timeout: diff_ms > std_ms ? true : false
        };
    }
    /* *
    * 获得以毫秒为单位的当前时间
    * */
    function getCurrTime() {
        //获取精确到分的当前时间字符串
        var nowStr = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        return new Date(nowStr).getTime();//当前时间转毫秒
    }
    /* *
    * 每次点击患者列表的病人时，设置进度条上的剩余时间
    * barName---不同节点倒计时进度条的id
    * startTime---倒计时参照的基准时间（要求时间戳格式）
    * total---倒计时总时间（要求以min为单位）
    * */
    function setProgressbar(barName, startTime, total) {
        //获取当前时间
        var now_ms = getCurrTime();

        var total_ms = total * 60 * 1000;//倒计时时间（分转毫秒）
        var endTime_ms = startTime + total_ms;//倒计时截止时间（毫秒）

        var currVal_ms = endTime_ms - now_ms;//计算差值（毫秒）
        var currVal_min = parseInt(currVal_ms / 1000 / 60);//毫秒转分

        var currVal_s = parseInt((currVal_ms % 60000) / 1000);

        if (currVal_ms < 0) {
            $('#' + barName).progressbar({
                value: 0,
                text: '0分0秒/' + total + '分'
            });
        } else {
            $('#' + barName).progressbar({
                value: currVal_ms / total_ms * 100,
                text: currVal_min + '分' + currVal_s + '秒' + '/' + total + '分'
            });
        }
    }
    /* *
     * 计算节点倒计时剩余时间的函数，setInterval的第一个参数。
     * barName---不同节点倒计时进度条的id
     * startTime---倒计时参照的基准时间（要求时间戳格式）
     * total---倒计时总时间（要求以min为单位）
     * */
    function countDown(barName, startTime, total) {
        return function () {
            var timers = [
                {
                    type:'ecg',
                    timer:ecgTimer
                },
                {
                    type:'cvn',
                    timer:cvnTimer
                },
                {
                    type:'ecgEnd',
                    timer:ecgEndTimer
                },
                {
                    type:'xxb',
                    timer:xxbTimer
                },
                {
                    type:'dgs',
                    timer:dgsTimer
                },
                {
                    type:'d2b',
                    timer:d2bTimer
                }
            ];
            //获取当前时间
            var now_ms = getCurrTime();

            var total_ms = total * 60 * 1000;//倒计时时间（分转毫秒）
            var endTime_ms = startTime + total_ms;//倒计时截止时间（毫秒）

            var currVal_ms = endTime_ms - now_ms;//计算差值（毫秒）
            var currVal_min = parseInt(currVal_ms / 1000 / 60);//毫秒转分

            var currVal_s = parseInt((currVal_ms % 60000) / 1000);

            if (currVal_ms < 0) {
                if(barName){
                    $.each(timers,function (idx,obj) {
                        if (obj.type === barName){
                            clearInterval(obj.timer);
                        }
                    });
                }
                $('#' + barName).progressbar({
                    value: 0,
                    text: '0分0秒/' + total + '分'
                });
            } else {
                $('#' + barName).progressbar({
                    value: currVal_ms / total_ms * 100,
                    text: currVal_min + '分' + currVal_s + '秒' + '/' + total + '分'
                });
            }
        }
    }
    //跳转到胸痛登记页面
    function redirectToprint() {
        var url = 'cpc/toXtzlPrintPage.do?emgSeq=' + vm.currPatientInfo.emgSeq;
        window.top.addTab('胸痛登记表-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
    //跳转到胸痛上报页面
    function toReport() {
        var url = 'cpc/toXtxqPage.do?emgSeq=' + vm.currPatientInfo.emgSeq;
        window.top.addTab('胸痛上报-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
    // 胸痛急救时间轴
    function toCpcTimeline() {
    	var patInfo = vm.currPatientInfo;
//     	console.log(patInfo);
    	var cstNam = patInfo.cstNam;
        var openTabNam = '胸痛急救时间轴';
        openTabNam = cstNam ? openTabNam + '-' + cstNam : openTabNam;
        var openTabUrl = '${baseurl}cpc/toCpcTimeline.do?emgSeq=' + patInfo.emgSeq;
        parent.opentabwindow(openTabNam, openTabUrl, '1');
    }

    //点击ECG心电图节点跳转到心电图页
    function showEcg() {
        if (isFinishEcg){
            window.top.addTab('心电图', '${baseurl}cpc/toEcgPage.do?emgSeq='+ vm.currPatientInfo.emgSeq, 'icon icon-emergency-record');
        }else {
            $.messager.alert('提示信息',  '心电图未完成！', 'warning');
        }
    }

    
    
    var animate2 = Raphael.animation({
    	10:{
    		"fill":'green'
    	},
    	
    	70:{
    		"fill":'white'
    	}
    },2000);
    
    
    /**
            *   流程图-画节点
     * @param x  x轴位置
     * @param y  y轴位置
     * @param content 节点显示文本
     * @param id
     * @param r  节点圆角
     * @param branchType  main-主干 nonAcs-非ACS分支 acs-Acs分支
     * @returns {Array} 矩形的上右下左四条边中点的坐标数组
     */
    function createTask(x, y, content, id, branchType) {
        // 本模块矩形圆角
        // var taskR = r ? r : taskR;
        // 3层组成，第一层矩形框，填充背景颜色;第二层文字居中;第三层点击事件触发层，设为透明度0;
        var task = paper.rect(x, y, taskWidth, taskHeight, taskR);

        var contentX = x + taskWidth / 2;
        var contentY = y + taskHeight / 2;
        var text = paper.text(contentX, contentY, content).attr({
            'font-size': 14,
        });

        flowChart[id] = task;

        
        var p3 = paper.rect(x - 10, y - 10, taskWidth + 20, taskHeight + 20, taskR);
        p3.attr({
            'fill': 'white',
            'fill-opacity': 0,
            'stroke-opacity': 0,
            'cursor': 'pointer'
        }).dblclick(function (evt) {
            if(id==3){
                showEcg();
                return;
            }
        }).click(function (evt) {
            getNodeRefInfo(id, this);
        }).hover(function () {
            this.attr({
                'stroke': '#FF8888',
                'stroke-dasharray': '- ',
                'stroke-opacity': 100
            });
        }, function () {
            this.attr({
                'stroke-opacity': 0
            });
        });
        
        //主干节点放入对应结合
        if(branchType == 'main'){
            mainSet.push(task);
            mainSet.push(text);
            mainSet.push(p3);
        }
        //非ACS节点放入对应集合
        else if(branchType == 'nonAcs'){
            nonAcsSet.push(task);
            nonAcsSet.push(text);
            nonAcsSet.push(p3);
        }
        //ACS节点放入对应集合
        else if(branchType == 'acs'){
            acsSet.push(task);
            acsSet.push(text);
            acsSet.push(p3);
        }
        var nodeArray = [];
        nodeArray.push({'x': contentX, 'y': y});
        nodeArray.push({'x': x + taskWidth, 'y': contentY});
        nodeArray.push({'x': contentX, 'y': y + taskHeight});
        nodeArray.push({'x': x, 'y': contentY});

        return nodeArray;
    }

    /**
     * 流程图-画包裹子节点的外层节点
     * @param x  x轴位置
     * @param y  y轴位置
     * @param w 宽
     * @param h 高
     * @param r 圆角
     * @param branchType  main-主干 nonAcs-非ACS分支 acs-Acs分支
     * @returns {Array} 矩形的上右下左四条边中点的坐标数组
     */
    function createExpandedSubProcess(x, y, w, h, r,branchType) {
        var rect = paper.rect(x, y, w, h, r).attr({
            "stroke": "black",
            "stroke-width": 1,
            "stroke-opocity": 0,
            "fill": "none"
        });
        if (branchType == 'main'){
            mainSet.push(rect);
        }
        if (branchType == 'nonAcs'){
            nonAcsSet.push(rect);
        }
        if (branchType == 'acs'){
            acsSet.push(rect);
        }
        var nodeArray = [];
        nodeArray.push({'x': x + w / 2, 'y': y});
        nodeArray.push({'x': x + w, 'y': y + w / 2});
        nodeArray.push({'x': x + w / 2, 'y': y + h});
        nodeArray.push({'x': x, 'y': y + w / 2});
        return nodeArray;
    }

    /**
     * 流程图-画判断框
     * @param x 判断框x轴位置
     * @param y 判断框y轴位置
     * @param nodeId  判断框id
     * @param content 判断框文本内容
     * @param branchType  main-主干 nonAcs-非ACS分支 acs-Acs分支
     * @returns {Array} 判断框上右下左四条边中点的坐标数组
     */
    function createBranch(x, y, nodeId, content,branchType) {
        // paper.rect(x+25,y,50,50,0);
        x = x + 25;
        var text;
        var path = paper.path('m' + (25 + x) + ' ' + y + ' l50 25 l-50 25 l-50 -25 z');
        flowChart[nodeId] = (path);
        path.attr({
            'fill': 'white',
            'stroke-width': '1px',
            'title': nodeId
        }).click(function (e) {
            //清除页面上的信息窗
            clearWindow();
        });
        if (content) {
            // 像素和字体转化
            // var length = content.length;
            // 文本都是居中展示的，所以偏移量为content的一般字数所占的像素值，下文写死了为75，实际应该为font-size*length/2
            text = paper.text(x + 25, y + 25, content).attr({
                'font-size':12
            });
        }
        if (branchType == 'main'){
            mainSet.push(path);
            mainSet.push(text);
        }
        if (branchType == 'nonAcs'){
            nonAcsSet.push(path);
            nonAcsSet.push(text);
        }
        if (branchType == 'acs'){
            acsSet.push(path);
            acsSet.push(text);
        }
        var nodeArray = [];
        nodeArray.push({'x': x + 25, 'y': y});
        nodeArray.push({'x': x + 75, 'y': y + 25});
        nodeArray.push({'x': x + 25, 'y': y + 50});
        nodeArray.push({'x': x-25, 'y': y + 25});
        return nodeArray;
    }

    /**
     * 流程图-画线
     * @param startNode 开始节点
     * @param endNode 结束节点
     * @param content 显示的文本
     * @param vh  方向：纵向(V)或横向(H)
     * @param id
     * @param branchType  main-主干 nonAcs-非ACS分支 acs-Acs分支
     */
    function drawArrowLine(startNode, endNode, content, vh, id,branchType) {
        var text;
        var pathStr = 'm' + startNode.x + ' ' + startNode.y + ' L' + endNode.x + ' ' + endNode.y;
        var line = paper.path(pathStr);
        arrowSet.push(line);
        flowChartLine[id] = line;
        if (content) {
            if (vh === 'V') {
                text =  paper.text(startNode.x + 20, (startNode.y + endNode.y) / 2, content);
            } else if (vh === 'H') {
                text = paper.text((startNode.x + endNode.x) / 2, startNode.y - 10, content);
            }
        }
        if (branchType == 'main'){
            mainSet.push(line);
            mainSet.push(text);
        }
        if (branchType == 'nonAcs'){
            nonAcsSet.push(line);
            nonAcsSet.push(text);
        }
        if (branchType == 'acs'){
            acsSet.push(line);
            acsSet.push(text);
        }
    }

   
    function createModule_DC(){
    	
    	
    }
    
    /**
            * 画流程图节点和线
     */
    function drawFlow() {
    	
    	
    	paper.path('M10 900L10 1900');
    	
    	createBranch(30, 1000, '','初步诊断');
    	
    	createTask(150, 1000, 'STEMI');
    	
    	createTask(250, 1000, 'NSTEMI/UA');
    	
    	createTask(350, 1000, '主动脉夹层');
    	
    	createTask(450, 1000, '肺动脉栓塞');
    	
    	createTask(550, 1000, '非ACS\n心源性胸痛');
    	
    	createTask(650, 1000, '其它非\n心源性胸痛');
    	
    	createTask(750, 1000, '待查');
    	
    	
    	
    	
    	
    	
    	
    	/*
    	var start = paper.circle(baseX + 622.5,baseY, 10);
   	 	var nodeArrayBySubProcess = createExpandedSubProcess(baseX + 422.5, baseY + 60, 400, 90, 10,'main');
        createTask(baseX + 442.5, baseY + 85, '急诊预查','2','main');
        createTask(baseX + 582.5, baseY + 85, '心电图', '3','main');
        createTask(baseX + 722.5, baseY + 85, '实验室检查', '4','main');
        
        var nodeArrayFromGateWay1 = createBranch(baseX + 572.5, baseY + 200,'5','初步诊断','main');
        
        var nodeArrayByTask1 = createTask(baseX + 282.5, baseY + 305, 'STEMI', '22','');
        
        var nodeArrayByTask2 = createTask(baseX + 382.5, baseY + 305, 'NSTEMI/UA', '22','');
        
        var nodeArrayByTask3 = createTask(baseX + 482.5, baseY + 305, '主动脉夹层', '22','');
        
        var nodeArrayByTask4 = createTask(baseX + 582.5, baseY + 305, '肺动脉栓塞', '22','');
        
        var nodeArrayByTask5 = createTask(baseX + 682.5, baseY + 305, '非ACS\n心源性胸痛', '22','');
        
        var nodeArrayByTask6 = createTask(baseX + 782.5, baseY + 305, '其他\n非心源性胸痛', '22','');
        
        var nodeArrayByTask7 = createTask(baseX + 882.5, baseY + 305, '待查', '22','');
        
        
        createTask(baseX + 282.5, baseY + 375, '心功能分级', '22','');
        
        createTask(baseX + 282.5, baseY + 445, '初始药物', '22','');
        
        createTask(baseX + 282.5, baseY + 445, '初始药物', '22','');
        
    	return;
    	*/
    	
        var nodeArrayByTask0 = createTask(baseX + 582.5,baseY-30,'胸痛模块', '1',10,'main');
        // 创建包含子任务大矩形
        var nodeArrayBySubProcess = createExpandedSubProcess(baseX + 422.5, baseY + 60, 400, 90, 10,'main');
        createTask(baseX + 442.5, baseY + 85, '病情评估','2',0,'main');
        createTask(baseX + 582.5, baseY + 85, '心电图', '3',0,'main');
        createTask(baseX + 722.5, baseY + 85, '血化验', '4',0,'main');
        
        nodeArrayByTask1 = createTask(baseX + 325, baseY + 205, '非ACS', '21',0,'nonAcs');
       
        nodeArrayFromGateWay1 = createBranch(baseX + 572.5, baseY + 200,'5','初步诊断','main');
        nodeArrayByTask2 = createTask(baseX + 852.5, baseY + 205, 'ACS', '6',0,'acs');

        drawArrowLine(nodeArrayByTask0[2], nodeArrayBySubProcess[0], '', '', 'line01','main');//胸痛模块---病情评估、心电图、血化验
        drawArrowLine(nodeArrayBySubProcess[2], nodeArrayFromGateWay1[0], '', '', 'line02','main');//病情评估、心电图、血化验---初步诊断
        drawArrowLine(nodeArrayFromGateWay1[3], nodeArrayByTask1[1], '', '', 'line03');//初步诊断---非ACS
        drawArrowLine(nodeArrayFromGateWay1[1], nodeArrayByTask2[3], '', '', 'line04');//初步诊断---ACS

        
        
        /*
        console.log('acs',flowChart['6']);
        console.log('nonAcs',flowChart['21']);
        
        // 声明动画样式
        let ani = Raphael.animation({
        	"0%":{
        		'fill':'green'
        	},
        	"14.2%":{
        		'fill':'white'
        	}
        },7000);
        
        console.log(ani);
        
        flowChart['6'].animate(ani.repeat("Infinity"));
		*/
		
		
		// 创建主动脉夹层子模块
		
		
        //非ACS部分
        var nonAcsNodeArrayBySubProcess = createExpandedSubProcess(baseX, baseY + 300, 730, 400, 10,'nonAcs');
        // 非ACS部分第一列节点
        var nodeArrayByTask3 = createTask(baseX + 55, baseY + 320, '主动脉夹层', '22',0,'nonAcs');
        // var smallNodeArrayBySubProcess1 = createExpandedSubProcess(baseX + 5, baseY + 370, 260, 60, 10,'nonAcs');
        // createTask(baseX + 10, baseY + 380, '主动脉CTA', 'zdmcta',0,'nonAcs');
        // createTask(baseX + 95, baseY + 380, '心脏超声', 'xzcs',0,'nonAcs');
        // createTask(baseX + 180, baseY + 380, 'MIR检查', 'mirjc',0,'nonAcs');
        var nodeArrayByTask3_4 = createTask(baseX + 55, baseY + 400, '影像学检查', 'hz1',0,'nonAcs');
        var nodeArrayByTask3_5 = createTask(baseX + 55, baseY + 480, '心外科会诊', 'qz1',0,'nonAcs');
        var nodeArrayByTask3_6 = createTask(baseX + 55, baseY + 560, '夹层类型', 'zg1',0,'nonAcs');
        var nodeArrayByTask3_7 = createTask(baseX + 55, baseY + 640, '治疗策略', 'zg1',0,'nonAcs');
        
        
        // 非ACS部分第二列节点
        var nodeArrayByTask4 = createTask(baseX + 190, baseY + 320, '肺动脉栓塞', '23',0,'nonAcs');
        //var smallNodeArrayBySubProcess2 = createExpandedSubProcess(baseX + 275, baseY + 370, 175, 60, 10,'nonAcs');
        //createTask(baseX + 280, baseY + 380, '肺动脉CTA', 'zdmcta',0,'nonAcs');
        //createTask(baseX + 365, baseY + 380, '心脏超声\n筛查', 'xzcssc',0,'nonAcs');
        var nodeArrayByTask4_3 = createTask(baseX + 190, baseY + 400, '影像学检查', 'xnkhz',0,'nonAcs');
        var nodeArrayByTask4_4 = createTask(baseX + 190, baseY + 480, '治疗信息', 'qz2',0,'nonAcs');
        var nodeArrayByTask4_5 = createTask(baseX + 190, baseY + 560, '院内溶栓治疗', 'kny',0,'nonAcs');
        
        
        
        // 非ACS部分第三列节点
        var nodeArrayByTask5 = createTask(baseX + 325, baseY + 320, '非ACS心\n源性胸痛', '24',0,'nonAcs');
        var nodeArrayByTask5_1 = createTask(baseX + 325, baseY + 400, '非ACS心\n源性胸痛类型', 'xbxxjc',0,'nonAcs');
        var nodeArrayByTask5_2 = createTask(baseX + 325, baseY + 480, '处理措施', 'xxwkhz1',0,'nonAcs');
        var nodeArrayByTask5_3 = createTask(baseX + 325, baseY + 560, '患者情况备注', 'qz3',0,'nonAcs');
       
        // 非ACS部分第四列节点
        var nodeArrayByTask6 = createTask(baseX +460, baseY + 320, '其它\n非心源性胸痛', '25',0,'nonAcs');
        var nodeArrayByTask6_1 = createTask(baseX + 460, baseY + 400, '其他非心\n源性胸痛类型', 'csxdt',0,'nonAcs');
        var nodeArrayByTask6_2 = createTask(baseX + 460, baseY + 480, '处理措施', 'xxwkhz2',0,'nonAcs');
        var nodeArrayByTask6_3 = createTask(baseX + 460, baseY + 560, '患者情况备注', 'qz4',0,'nonAcs');
        
        
        // 非ACS部分第五列节点
        var nodeArrayByTask7 = createTask(baseX +595, baseY + 320, '待查', '26',0,'nonAcs');
        var nodeArrayByTask7_1 = createTask(baseX + 595, baseY + 400, '处理措施', 'xtzxgc',0,'nonAcs');
       

        drawArrowLine(nodeArrayByTask1[2],nonAcsNodeArrayBySubProcess[0],'','','line05','nonAcs');//非ACS---左半边分支
        // drawArrowLine(nodeArrayByTask3[2],smallNodeArrayBySubProcess1[0],'','','line06','nonAcs');
        // drawArrowLine(nodeArrayByTask4[2],smallNodeArrayBySubProcess2[0],'','','line07','nonAcs');
        drawArrowLine(nodeArrayByTask5[2],nodeArrayByTask5_1[0],'','','line08','nonAcs');//气胸---胸部X线检查
        drawArrowLine(nodeArrayByTask6[2],nodeArrayByTask6_1[0],'','','line09','nonAcs');//心包填塞---超声心动图
        drawArrowLine(nodeArrayByTask7[2],nodeArrayByTask7_1[0],'','','line10','nonAcs');//其他---胸痛中心观察
        // drawArrowLine(smallNodeArrayBySubProcess1[2],nodeArrayByTask3_4[0],'','','line11','nonAcs');//主动脉cta---会诊
        // drawArrowLine(smallNodeArrayBySubProcess2[2],nodeArrayByTask4_3[0],'','','line12','nonAcs');//肺动脉---心内科会诊
        drawArrowLine(nodeArrayByTask5_1[2],nodeArrayByTask5_2[0],'','','line13','nonAcs');//胸部x线---心胸外科会诊
        drawArrowLine(nodeArrayByTask6_1[2],nodeArrayByTask6_2[0],'','','line14','nonAcs');//超声心动图---心胸外科会诊
        // drawArrowLine(nodeArrayByTask7_1[2],nodeArrayByTask7_2[0],'','','line15','nonAcs');//胸痛中心观察---会诊
        drawArrowLine(nodeArrayByTask3[2],nodeArrayByTask3_4[0],'','','line16','nonAcs');//会诊---确诊
        drawArrowLine(nodeArrayByTask3_4[2],nodeArrayByTask3_5[0],'','','line16','nonAcs');//会诊---确诊
        
        drawArrowLine(nodeArrayByTask4[2],nodeArrayByTask4_3[0],'','','line17','nonAcs');//心内科会诊---确诊
        
        drawArrowLine(nodeArrayByTask4_3[2],nodeArrayByTask4_4[0],'','','line17','nonAcs');//心内科会诊---确诊
        drawArrowLine(nodeArrayByTask5_2[2],nodeArrayByTask5_3[0],'','','line18','nonAcs');//心胸外科会诊---确诊
        drawArrowLine(nodeArrayByTask6_2[2],nodeArrayByTask6_3[0],'','','line19','nonAcs');//心胸外科会诊---确诊
        // drawArrowLine(nodeArrayByTask7_2[2],nodeArrayByTask7_3[0],'','','line20','nonAcs');//会诊---确诊
        drawArrowLine(nodeArrayByTask3_5[2],nodeArrayByTask3_6[0],'','','line21','nonAcs');//确诊---转归
        drawArrowLine(nodeArrayByTask3_6[2],nodeArrayByTask3_7[0],'','','line21','nonAcs');//确诊---转归
        drawArrowLine(nodeArrayByTask4_4[2],nodeArrayByTask4_5[0],'','','line22','nonAcs');//确诊---抗凝药
        // drawArrowLine(nodeArrayByTask5_3[2],nodeArrayByTask5_4[0],'','','line23','nonAcs');//确诊---转归
        // drawArrowLine(nodeArrayByTask6_3[2],nodeArrayByTask6_4[0],'','','line24','nonAcs');//确诊---转归
        // drawArrowLine(nodeArrayByTask7_3[2],nodeArrayByTask7_4[0],'','','line25','nonAcs');//确诊---转归
        // drawArrowLine(nodeArrayByTask4_5[2],nodeArrayByTask4_6[0],'','','line26','nonAcs');//抗凝药--转归
        // drawArrowLine(nodeArrayByTask5_4[2],finishTask[0],'','','line27','nonAcs');//转归3---结束
        // drawArrowLine(nodeArrayByTask4_6[1],finishTask[3],'','','line28','nonAcs');//转归2---结束
        //画转归1到结束的折线
        
        /*
        var pathStr1 = 'm';
        pathStr1 += nodeArrayByTask3_6[2].x + ' ' + nodeArrayByTask3_6[2].y + ' ';
        pathStr1 += 'V';
        pathStr1 += nodeArrayByTask4_6[3].y + 40 + ' ';
        pathStr1 += 'H';
        pathStr1 += finishTask[2].x + ' ';
        pathStr1 += 'V';
        pathStr1 += finishTask[2].y;
        var line29 = paper.path(pathStr1).attr({
            'title':'line29'
        });
        nonAcsSet.push(line29);
        arrowSet.push(line29);
        flowChartLine['line29'] = line29;
        //画转归2到结束的折线
        var pathStr2 = 'm';
        pathStr2 += nodeArrayByTask6_4[2].x + ' ' + nodeArrayByTask6_4[2].y + ' ';
        pathStr2 += 'V';
        pathStr2 += finishTask[1].y + ' ';
        pathStr2 += 'H';
        pathStr2 += finishTask[1].x;
        var line30 = paper.path(pathStr2).attr({
            'title':'line30'
        });
        nonAcsSet.push(line30);
        arrowSet.push(line30);
        flowChartLine['line30'] = line30;
        //画转归3到结束的折线
        var pathStr3 = 'm';
        pathStr3 += nodeArrayByTask7_4[2].x + ' ' + nodeArrayByTask7_4[2].y + ' ';
        pathStr3 += 'V';
        pathStr3 += finishTask[1].y + ' ';
        pathStr3 += 'H';
        pathStr3 += finishTask[1].x;
        var line31 = paper.path(pathStr3).attr({
            'title':'line31'
        });
        nonAcsSet.push(line31);
        arrowSet.push(line31);
        flowChartLine['line31'] = line31;
        */
        
        
        //ACS部分
        var nodeArrayByTask8 = createTask(baseX + 730, baseY + 380, 'UA', '11',0,'acs');
        //ACS第一列节点
        var nodeArrayByTask9 = createTask(baseX + 853, baseY + 305, '药物', '7',0,'acs');
        var nodeArrayFromGateWay2 = createBranch(baseX + 843, baseY + 375,'8','会诊','acs');
        var nodeArrayByTask9_1 = createTask(baseX + 853, baseY + 450, 'NSTEMI', '9',0,'acs');
        var nodeArrayFromGateWay3 = createBranch(baseX + 843, baseY + 510,'12','PCI指征\n高危?','acs');
        var nodeArrayByTask9_2 = createTask(baseX + 853, baseY + 580, '药物\n(抗凝药)', '18',0,'acs');
        //ACS第二列节点
        var nodeArrayByTask10 = createTask(baseX + 982, baseY + 380, 'STEMI', '10',0,'acs');
        var nodeArrayFromGateWay4 = createBranch(baseX + 972, baseY + 508,'13','治疗选择','acs');
        var nodeArrayByTask10_1 = createTask(baseX + 982, baseY + 580, '溶栓知情\n同意书', '16',0,'acs');
        var nodeArrayByTask10_2 = createTask(baseX + 982, baseY + 640, '溶栓', '17',0,'acs');
        var nodeArrayByTask10_3 = createTask(baseX + 982, baseY + 700, '转归', '19',0,'acs');
        var finishAcs = createTask(baseX + 982, baseY + 760, '结束', '20',10,'acs');
        //ACS第三列节点
        var nodeArrayByTask11 = createTask(baseX + 1102, baseY + 513, 'PCI知情\n同意书', '14',0,'acs');
        var nodeArrayByTask11_1 = createTask(baseX + 1102, baseY + 580, '导管室', '15',0,'acs');

        drawArrowLine(nodeArrayByTask2[2],nodeArrayByTask9[0],'','','lineA1','acs');//acs---药物
        drawArrowLine(nodeArrayByTask9[2],nodeArrayFromGateWay2[0],'','','lineA2','acs');//药物---会诊
        drawArrowLine(nodeArrayByTask8[1],nodeArrayFromGateWay2[3],'','','lineA3','acs');//UA---会诊
        drawArrowLine(nodeArrayFromGateWay2[1], nodeArrayByTask10[3] ,'','','lineA4','acs');//会诊---STEMI
        drawArrowLine(nodeArrayFromGateWay2[2], nodeArrayByTask9_1[0] ,'','','lineA5','acs');//会诊---NSTEMI
        drawArrowLine(nodeArrayByTask9_1[2],nodeArrayFromGateWay3[0],'','','lineA6','acs');//NSTEMI---pci指征高危
        drawArrowLine(nodeArrayFromGateWay3[1],nodeArrayByTask10[2],'否','V','lineA7','acs');//pci---stemi
        drawArrowLine(nodeArrayFromGateWay3[2],nodeArrayByTask9_2[0],'是','V','lineA8','acs');//pci---抗凝药
        drawArrowLine(nodeArrayByTask10[2],nodeArrayFromGateWay4[0],'','','lineA9','acs');//STEMI---治疗选择
        drawArrowLine(nodeArrayFromGateWay4[2],nodeArrayByTask10_1[0],'','','lineA10','acs');//治疗选择---溶栓知情同意书
        drawArrowLine(nodeArrayByTask10_1[2],nodeArrayByTask10_2[0],'','','lineA11','acs');//溶栓知情同意书---溶栓
        drawArrowLine(nodeArrayByTask10_2[2],nodeArrayByTask10_3[0],'','','lineA12','acs');//溶栓---转归
        drawArrowLine(nodeArrayByTask10_3[2],finishAcs[0],'','','lineA13','acs');//转归---结束
        drawArrowLine(nodeArrayFromGateWay4[1],nodeArrayByTask11[3],'','','lineA14','acs');//治疗选择---pci知情同意书
        drawArrowLine(nodeArrayByTask11[2],nodeArrayByTask11_1[0],'','','lineA15','acs');//pci知情同意---导管室
        //画UA到pci指征的折线
        var pathStr_1 = 'm';
        pathStr_1 += nodeArrayByTask8[2].x + ' ' + nodeArrayByTask8[2].y + ' ';
        pathStr_1 += 'V';
        pathStr_1 += nodeArrayFromGateWay3[2].y + ' ';
        pathStr_1 += 'H';
        pathStr_1 += nodeArrayFromGateWay3[2].x;
        var lineA16 = paper.path(pathStr_1).attr({
            'title':'lineA16'
        });
        acsSet.push(lineA16);
        arrowSet.push(lineA16);
        flowChartLine['lineA16'] = lineA16;
        //画抗凝药到结束的折线
        var pathStr_2 = 'm';
        pathStr_2 += nodeArrayByTask9_2[2].x + ' ' + nodeArrayByTask9_2[2].y + ' ';
        pathStr_2 += 'V';
        pathStr_2 += nodeArrayByTask10_3[3].y + ' ';
        pathStr_2 += 'H';
        pathStr_2 += nodeArrayByTask10_3[3].x;
        var lineA17 = paper.path(pathStr_2).attr({
            'title':'lineA17'
        });
        acsSet.push(lineA17);
        arrowSet.push(lineA17);
        flowChartLine['lineA17'] = lineA17;
        //画导管室到结束的折线
        var pathStr_3 = 'm';
        pathStr_3 += nodeArrayByTask11_1[2].x + ' ' + nodeArrayByTask11_1[2].y + ' ';
        pathStr_3 += 'V';
        pathStr_3 += nodeArrayByTask10_3[1].y + ' ';
        pathStr_3 += 'H';
        pathStr_3 += nodeArrayByTask10_3[1].x;
        var lineA18 = paper.path(pathStr_3).attr({
            'title':'lineA18'
        });
        acsSet.push(lineA18);
        arrowSet.push(lineA18);
        flowChartLine['lineA18'] = lineA18;
    }

    function checkboxCodeToTxt(prop,value,proListName) {
        var txt = '';
        var dicArr = publicFun.getDict(proListName) || [];
        var valueArr = value.split(',');
        dicArr.forEach(el => {
            if (valueArr.indexOf(el.infocode) > -1){
                txt += el.info + ',';
            }
        });
        return txt ? txt.slice(0,-1) : value;
    }
    function selectCodeToTxt(prop,value,proListName) {
        var txt = '';
        var dict = publicFun.getDict(proListName);
        if(dict){
            for (var j=0; j<dict.length; j++){
                if(dict[j].infocode == value){
                    txt = dict[j].info;
                }
            }
        }
        return txt;
    }
    function constructTxt(resList) {
        //var txt = '';
        var maxNameLen = 0;
        
        if (resList){
        	
            resList.forEach(el => {
                var type = el.proType,
                    value = el.proVal,
                    name = el.proName || '',
                    prop = el.proCode,
                    proUnit = el.proUnit||'',
                    proListName = el.proList || '';
                if(value){
                    if (type == 'time2'){
                        value = moment(value,'YYYY-MM-DD HH:mm:ss').format('HH:mm');
                    }
                    if (type == 'time5'){
                        value = moment(value,'YYYY-MM-DD HH:mm:ss').format('YYYY-MM-DD HH:mm');
                    }
                    if (type === "select"){
                        value = selectCodeToTxt(prop,value,proListName);
                    }
                    if (type == "checkbox" || type == "popup"){
                        value = checkboxCodeToTxt(prop,value,proListName);
                    }
                    if (type == "radio"){
                        value = value == 0 ? '是' : '否';
                    }
                }else{
                    value='';
                }
                if(name.length > maxNameLen){
                    maxNameLen = name.length;

                }
                console.log(value);
                // txt += name + ':' + value + '\n';
                $('#window').append("<div class='item'><div class='name'>"+ name + ":" +"</div><div class='val'>"+ value + "</div><div class='unit'>" + proUnit +"</div></div>");
            });
            $('#window .item .name').css({
                'width': maxNameLen + 'em'
            });
        }
        //return txt;
    }
    //清除页面展示的信息窗
    function clearWindow(){
        if(hasWindow){
            hasWindow = false;
            $('#window').empty();
        }
    }
    function getNodeRefInfo(nodeId,parent) {
        if(vm.patientGreenNodes.indexOf(nodeId)<0){
            return;
        }
        //如果当前页面已有信息窗，先清除
        clearWindow();
        $.ajax({
            url: 'cpc/getNodeInfoByEmgSeq.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'nodeId': nodeId,
                'emgSeq': vm.currPatientInfo.emgSeq
            }),
            success: function (res) {
                var resList = res.resultInfo.sysdata.list;

                //流程图右侧几个节点对应的小窗，需要将位置调到节点左上方,否则位置在右下方
                var _top = parent.attrs.y + 100;
                var _left = parent.attrs.x + 10;
                if(nodeId != 2 && nodeId != 3 && nodeId != 4){
                    if(vm.hasAcsNode && !vm.hasNonAcsNode){
                        _left = _left - 270;
                        _top = _top + 70;
                    }
                }

                if(resList.length){
                    $('#window').css({
                        'top': _top + 'px',
                        'left': _left  + 'px'
                    });

                    constructTxt(resList);
                    hasWindow = true;
                }
            },
            error: function (err) {
            }
        });
    }

    function shine(nodeId){
    	if(flowChart.hasOwnProperty(nodeId)){
    		flowChart[nodeId].attr(finishedNodeAttr);
    	}else{
    		console.log(nodeId+'没有被注册');
    	}
    }
    //建立websocket连接，监听数据更新
    function websocketConnect() {
    	ws = new WebSocket(weburl);
        ws.onopen = function (evt) {
            //ws.send("Hello WebSockets!");
        };

        ws.onmessage = function (evt) {
            var info = JSON.parse(evt.data);
            var msg = info.sysdata;
            //判断是否为当前展示的胸痛病人相关的信息更新,若不是当前病人则进行提示
            if (msg.emgSeq == vm.currPatientInfo.emgSeq) {
                if (msg.greenNodeId) {
                	
                    shine(msg.greenNodeId);
                    if (msg.greenNodeId == 3) {
                        isFinishEcg = true;
                        //若首份心电图完成，心电图确诊时间倒计时开始
                        if (msg.status == 3) {
                            flowChart[3].attr({
                                'fill':'9BDBA8'
                            });
                            //心电图完成的展示时间、真实时间、用时和是否超时的赋值
                            vm.nodeTime['XDTSJ'].time = publicFun.timeFormat(new Date(msg.ecgTime), 'yyyy/MM/dd hh:mm').slice(-5);
                            vm.nodeTime['XDTSJ'].realTime = publicFun.timeFormat(new Date(msg.ecgTime), 'yyyy/MM/dd hh:mm');
                            var ecgObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['XDTSJ'].realTime,vm.nodeTime['XDTSJ'].total);
                            vm.nodeTime['XDTSJ'].timeCost = ecgObj.timeCost;
                            vm.nodeTime['XDTSJ'].timeout = ecgObj.timeout;

                            //心电图完成倒计时停止
                            clearInterval(ecgTimer);
                            //心电图确诊倒计时开始
                            setProgressbar('ecgEnd', msg.ecgTime, 10);
                            ecgEndTimer = setInterval(countDown('ecgEnd', msg.ecgTime, 10), 1000);

                        }
                        if (msg.status == 2) {
                        	shine(msg.greenNodeId);
                            //心电图确诊的展示时间、真实时间、用时和是否超时的赋值
                            vm.nodeTime['XDTQZSJ'].time = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                            vm.nodeTime['XDTQZSJ'].realTime = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                            var ecgEndObj =  calcTimeCost(vm.nodeTime['XDTSJ'].realTime,vm.nodeTime['XDTQZSJ'].realTime,vm.nodeTime['XDTQZSJ'].total);
                            vm.nodeTime['XDTQZSJ'].timeCost = ecgEndObj.timeCost;
                            vm.nodeTime['XDTQZSJ'].timeout = ecgEndObj.timeout;

                            //ecg确诊倒计时停止
                            clearInterval(ecgEndTimer);
                        }
                    }

                    if (msg.greenNodeId == 4) {
                        //血化验的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['CTNIBGSJ'].time = publicFun.timeFormat(new Date(msg.checkTime), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['CTNIBGSJ'].realTime = publicFun.timeFormat(new Date(msg.checkTime), 'yyyy/MM/dd hh:mm');
                        var cvnObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['CTNIBGSJ'].realTime,vm.nodeTime['CTNIBGSJ'].total);
                        vm.nodeTime['CTNIBGSJ'].timeCost = cvnObj.timeCost;
                        vm.nodeTime['CTNIBGSJ'].timeout = cvnObj.timeout;

                        //cvn倒计时停止
                        clearInterval(cvnTimer);
                    }
                    //初步诊断结果为ACS
                    if (msg.greenNodeId == 6) {
                        showAcs();
                        //抗血小板药物给药时间倒计时开始
                        setProgressbar('xxb',vm.currPatientInfo.emgDat,30);
                        xxbTimer = setInterval(countDown('xxb',vm.currPatientInfo.emgDat,30),1000);
                    }
                    if(msg.greenNodeId == 7){
                        //血小板药物治疗的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['KXXBYWGYSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['KXXBYWGYSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                        var xxbObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['KXXBYWGYSJ'].realTime,vm.nodeTime['KXXBYWGYSJ'].total);
                        vm.nodeTime['KXXBYWGYSJ'].timeCost = xxbObj.timeCost;
                        vm.nodeTime['KXXBYWGYSJ'].timeout = xxbObj.timeout;

                        //血小板倒计时停止
                        clearInterval(xxbTimer);
                    }
                    //初步诊断结果为非ACS
                    if (msg.greenNodeId == 21) {
                        showNonAcs();
                    }
                    //QDDGS导管室启动时间
                    if(msg.greenNodeId == 'QDDGS'){
                        //导管室启动的展示时间、真实时间的赋值
                        vm.nodeTime['QDDGS'].time = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['QDDGS'].realTime = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');

                        setProgressbar('dgs',new Date(msg.time).getTime(),30);
                        dgsTimer = setInterval(countDown('dgs',new Date(msg.time).getTime(),30),1000);
                    }
                    //DGSJH导管室激活时间
                    if (msg.greenNodeId == 'DGSJH'){
                        //导管室激活的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['DGSJH'].time = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['DGSJH'].realTime = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                        var dgsObj = calcTimeCost(vm.nodeTime['QDDGS'].realTime,vm.nodeTime['DGSJH'].realTime,vm.nodeTime['DGSJH'].total);
                        vm.nodeTime['DGSJH'].timeCost = dgsObj.timeCost;
                        vm.nodeTime['DGSJH'].timeout = dgsObj.timeout;

                        clearInterval(dgsTimer);
                    }
                    //d-b时间开始倒计时
                    if(msg.greenNodeId == 14){
                        setProgressbar('d2b',vm.currPatientInfo.emgDat,90);
                        d2bTimer = setInterval(countDown('d2b',vm.currPatientInfo.emgDat,90),1000);
                    }

                    if(msg.greenNodeId == 'QNKZSJ'){
                        //球囊扩张(dTob)的展示时间、真实时间、用时和是否超时的赋值
                        vm.nodeTime['QNKZSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm').slice(-5);
                        vm.nodeTime['QNKZSJ'] = publicFun.timeFormat(new Date(msg.time), 'yyyy/MM/dd hh:mm');
                        var d2bObj = calcTimeCost(vm.currPatientInfo.emgDat,vm.nodeTime['QNKZSJ'].realTime,vm.nodeTime['QNKZSJ'].total);
                        vm.nodeTime['QNKZSJ'].timeCost = d2bObj.timeCost;
                        vm.nodeTime['QNKZSJ'].timeout = d2bObj.timeout;

                        clearInterval(d2bTimer);
                    }

                }
                //将正在进行(或要进行)的流程节点加入到当前病人的节点集合
                /*
                if (msg.redNodeId) {
                    flowChart[msg.nodeId].attr({
                        'fill':'red'
                    })
                }
                */

            } else {
                $.each(vm.patientList, function (key, patient) {
                    if (patient.emgSeq === msg.emgSeq) {
                        patient.hasUpdated = true;
                    }
                });
            }
        };
        //
        // ws.onclose = function(evt) {
        //     console.log("Connection closed.");
        // };
    }

    //展示知情同意书
    function showTable() {
        // vm.showFiles = !vm.showFiles;
        if (vm.showFiles){
            $('#dg').datagrid({
                // url:'',
                striped: true,
                data:[
                    {code:'1030',name:'知情选择'},
                    {code:'1029',name:'患者授权书'},
                    {code:'1004',name:'病危(重)通知书'},
                    {code:'1020',name:'心导管诊疗知情同意书'},
                    {code:'1012',name:'静脉溶栓治疗同意书'},
                    {code:'1015',name:'气管插管和器械通气知情同意书'},
                    {code:'1024',name:'造影剂使用知情同意书'},
                    {code:'1040',name:'临时起搏器植入术谈话'},
                    {code:'1034',name:'血管内介入治疗知情同意书'},
                    {code:'1013',name:'拒绝或放弃医学治疗告知书'},
                    {code:'1027',name:'自动出院或转院告知书'},
                ],
                columns:[[
                    {field:'code',title:'模板号',styler:function (value,row,index) {
                            return 'font-weight:bold';
                        }},
                    {field:'name',title:'名称',width:210},
                ]],
                onDblClickRow: function (rowIndex,rowData) {
                    // console.log("++++++++++++");
                    // console.log(rowData);
                    var url = '${baseurl}zyyconsent/ConsentInfByTempno.do?tempno='+rowData.code+'&tempname='+rowData.name+'&refseqno='+vm.currPatientInfo.emgSeq;
                    window.top.addTab(rowData.name, url, 'icon icon-emergency-record');
                }
            });
        }

    }

    //显示测试按钮
    function trigger(){
        vm.showBtn = !vm.showBtn;
    }
    //*************测试按钮**************
    function getEcgFinish() {
        console.log("************心电图完成");
        console.log(vm.currPatientInfo.emgSeq);

        $.ajax({
            url: '${baseurl}testWebSocket/noticeEcgComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': vm.currPatientInfo.emgSeq
            }),
            success: function (res) {

            },
            error: function (err) {
                //console.log(err)
            }
        });
    }

    function getXhyData() {
        console.log("************血化验数据");
        $.ajax({
            url: '${baseurl}testWebSocket/noticeCheckComplete.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': vm.currPatientInfo.emgSeq
            }),
            success: function (res) {

            },
            error: function (err) {
                //console.log(err)
            }
        });
    }

    $(function () {
        drawFlow();
        //getPatients();
        websocketConnect();
    });
    function reload() {
        console.log('刷新局部');
        //getPatients();
    }
</script>
</body>
</html>