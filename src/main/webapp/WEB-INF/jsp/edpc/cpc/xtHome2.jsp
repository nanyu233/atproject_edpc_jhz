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
    <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/raphael-min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script type="text/javascript" src="js/public.js"></script>
    <!-- 
    	<script type="text/javascript" src="js/raphaelGraphics.js"></script>
     -->
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <style>
        #paperDiv{
            width: 1190px;
            height: 840px;
        }
        .countDown{
            z-index: 999;
        }
        #window{
            display: none;
            position: absolute;
            top:0;
            left:0;
            max-width: 400px;
            max-height: 300px;
            min-width: 200px;
            min-height: 100px;
            background: rgba(0,0,0,0.5);
            overflow: scroll;
        }
        #window .item{
            white-space:nowrap;
            padding: 5px 5px 5px 0;
        }
        #window .item .name{
            display: inline-block;
            color: #fff;
            text-align: right;
            margin-right: 5px;
        }
        #window .item .val{
            display: inline-block;
            color: #FFCC00;
        }
        #window .item .unit{
            color: #ffffff;
            display: inline-block;
        }
        #pp .pagination-page-list {
            width: 45px;
        }
    </style>
</head>
<body ms-controller="flowChart" class="flowChart">

<div class="flow">
    <div id="infoBar" class="infoBar">
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="redirectToprint()">打印诊疗表</div>
<!--         <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="redirectTosf()">随访表</div> -->
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="redirectTosfgl()">随访记录</div>
<!--         <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="redirectTosfgladd()">随访add表</div> -->
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="toReport()">上报助手</div>
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="toCpcTimeline()">时间轴</div>
        <div ms-visible="currPatientInfo.emgSeq" class="printBtn" onclick="showTable()">知情同意书</div>
        <div><span>姓名：</span><span>{{currPatientInfo.cstNam}}</span></div>
        <div><span>预检时间：</span><span>{{currPatientInfo.emgDatStr}}</span></div>
        <div><span>病例号：</span><span>{{currPatientInfo.mpi}}</span></div>
        <div><span>病情评估：</span><span>{{currPatientInfo.bqpg}}</span></div>
        <div class="rightBtn" ms-visible="!showPatientList" ms-click="listTrigger('1')"><span class="iconfont icon-show listTrigger"></span><span>病人列表</span></div>
    </div>
    <div class="countDown" ms-if="patientList.length">
        <div class="title"><i onclick="trigger()" class="iconfont icon-tongzhi" style="font-size: 18px"></i> 倒计时提醒</div>
        
        <!-- 
	        <div class="btnWrapper" ms-visible="showBtn">
	            <span onclick="getXhyData()">检验完成</span>
	            <span onclick="getEcgFinish()">心电图完成</span>
	        </div>
         -->
         
        <div class="item">
            <div class="child name">实验室检查时间:</div>
            <div class="child time" ms-visible="currPatientInfo.jgdbbgsj">
                <div>{{currPatientInfo.jgdbbgsj}}</div>
            </div>
            <!-- 
            <div class="child" ms-class="redFont:nodeTime['CTNIBGSJ'].timeout" ms-visible="nodeTime['CTNIBGSJ'].time">
                ({{nodeTime['CTNIBGSJ'].timeCost}}/{{nodeTime['CTNIBGSJ'].total}}分)
            </div>
             -->
            <div class="child" ms-visible="!currPatientInfo.jgdbbgsj">
                <div id="jgdbbgsj" class="bar"></div>
            </div>
        </div>
        
        <div class="item">
            <div class="child name">首份心电图时间:</div>
            <div class="child time" ms-visible ="currPatientInfo.ynsfxdtsj">
                <div>{{currPatientInfo.ynsfxdtsj}}</div>
            </div>
            <!-- 
            <div class="child" ms-class="redFont:nodeTime['XDTSJ'].timeout" >
                ({{nodeTime['XDTSJ'].timeCost}}/{{nodeTime['XDTSJ'].total}}分)
            </div>
             -->
            <div class="child" ms-visible ="!currPatientInfo.ynsfxdtsj">
                <div id="ynsfxdtsj" class="bar"></div>
            </div>
        </div>
        
        
        <div class="item" >
            <div class="child name">心电图诊断时间:</div>
            <div class="child time" ms-visible="currPatientInfo.ynsfxdtqzsj">
                <div>{{currPatientInfo.ynsfxdtqzsj}}</div>
            </div>
            <!--
            <div class="child" ms-class="redFont:nodeTime['XDTQZSJ'].timeout" ms-visible="nodeTime['XDTQZSJ'].time">
                ({{nodeTime['XDTQZSJ'].timeCost}}/{{nodeTime['XDTQZSJ'].total}}分)
            </div>
              -->
            <div class="child" ms-visible="!currPatientInfo.ynsfxdtqzsj && currPatientInfo.ynsfxdtsj">
                <div id="ynsfxdtqzsj" class="bar"></div>
            </div>
            <div class="child" ms-visible="!currPatientInfo.ynsfxdtsj">
                <div>未启用</div>
            </div>
        </div>
        
        
        <div class="item" >
            <div class="child name">抗血小板治疗时间:</div>
            
            <div class="child time" ms-visible="currPatientInfo.kxxbywgysj">
                <div>{{currPatientInfo.kxxbywgysj}}</div>
            </div>
            <!-- 
            <div class="child" ms-class="redFont:nodeTime['KXXBYWGYSJ'].timeout" ms-visible="nodeTime['KXXBYWGYSJ'].time">
                ({{nodeTime['KXXBYWGYSJ'].timeCost}}/{{nodeTime['KXXBYWGYSJ'].total}}分)
            </div>
             -->
            <div class="child" ms-visible="!currPatientInfo.kxxbywgysj">
                <div id="kxxbywgysj" class="bar"></div>
            </div>
        </div>
        
        
        <div class="item" >
            <div class="child name">导管室启动时间:</div>
            <div class="child time" ms-visible="currPatientInfo.qddgssj">
                <div>{{currPatientInfo.qddgssj}}</div>
            </div>
            <div class="child" ms-visible="!currPatientInfo.qddgssj">
                <div>未启动</div>
            </div>
        </div>
        
        
        <div class="item" >
            <div class="child name">导管室激活时间:</div>
            <div class="child time" ms-visible="currPatientInfo.dgsjhsj">
                <div>{{currPatientInfo.dgsjhsj}}</div>
            </div>
            <div class="child" ms-visible="!currPatientInfo.dgsjhsj && currPatientInfo.qddgssj">
                <div id="dgsjhsj" class="bar"></div>
            </div>
            <div class="child" ms-visible="!currPatientInfo.qddgssj">
                <div>未启用</div>
            </div>
        </div>
        
        
        <div class="item" >
            <div class="child name">导丝通过时间:</div>
            <div class="child time" ms-visible="currPatientInfo.dstgsj">
                <div>{{currPatientInfo.dstgsj}}</div>
            </div>
            <!-- 
            <div class="child" ms-class="redFont:nodeTime['QNKZSJ'].timeout" ms-visible="nodeTime['QNKZSJ'].time">
                ({{nodeTime['QNKZSJ'].timeCost}}/{{nodeTime['QNKZSJ'].total}}分)
            </div>
             -->
            <div class="child" ms-if="!currPatientInfo.dstgsj">
                <div id="dstgsj" class="bar"></div>
            </div>
        </div>
        
        
    </div>
    <div id="paperDiv">
        <div id="window" onclick="clearWindow()"></div>
    </div>
    <div id="dd" style="width:400px;height: 300px">
        <div class="row">
            <div class="col">心电图名称</div>
            <div class="col">完成时间</div>
            <div class="col">诊断时间</div>
        </div>
        <div class="row" ms-repeat-el="ecgList">
            <div class="col">{{el.fileName}}</div>
            <div class="col">{{el.fileDate}}</div>
            <div class="col">{{el.fileDiaDate}}</div>
        </div>
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
                    <span class="name">{{el.cstNam || '姓名无'}}</span><span> | </span>
                    <span ms-visible="!el.cstSexCod">性别无</span>
                    <span ms-visible="el.cstSexCod==0" class="male">男</span>
                    <span ms-visible="el.cstSexCod==1" class="female">女</span><span> | </span>
                    <span ms-if="el.cstAge">{{el.cstAge}}{{el.cstAgeCodInf || '岁'}}</span>
                    <span ms-if="!el.cstAge">年龄无</span>
                </span>
                <i ms-if="el.hasUpdated" class="iconfont icon-new-msg"
                   style="color: red;font-size: 30px;vertical-align: bottom"></i>
            </div>
            <div class="info_item">
                <span class="title">预检时间:</span>
                <span>{{el.emgDatStr || '暂无'}}</span>
            </div>
            <div class="info_item">
                <span class="title">Killip分级:</span>
                <span ms-visible="!el.killip">暂无</span>
                <span ms-visible="el.killip == 0" class="killip_1">Ⅰ级</span>
                <span ms-visible="el.killip == 1" class="killip_2">Ⅱ级</span>
                <span ms-visible="el.killip == 2" class="killip_3">Ⅲ级</span>
                <span ms-visible="el.killip == 3" class="killip_4">Ⅳ级</span>
            </div>
            <div class="info_item">
<%--                血氧取消显示--%>
<%--                <span class="iconfont icon-iconxyang" style="color: #44b548"></span>--%>
<%--                <span>{{el.oxyNbr || '--'}}%</span>--%>
                <span class="iconfont icon-heartrate" style="color:red"></span>
                <span>{{el.xinl || '--'}}次/分</span>
                <span class="iconfont icon-hamnatodynamometer" style="color: #f90"></span>
                <span>{{el.xuey || '--/--'}}</span>
            </div>
        </li>
        <div id="pp" style="background:#efefef;border:1px solid #ccc;position: fixed;bottom: 0;"></div>
    </ul>
    <div class="no-patient" ms-if="!patientList.length">暂无相关病人数据</div>
</div>
<%--知情同意书弹窗--%>
<div id="fileBox" style="padding:10px">
    <table id="dg"></table>
</div>
<script type="text/javascript">
    var hisSelPat = {};//历史选中的病人
    var locate = window.location;
    var weburl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketXt.do";
    var ws;

    var cd1;
    var paper = Raphael("paperDiv", 1700, 2000),
        taskWidth = 100,
        // 本模块矩形定高
        taskHeight = 80,
        taskR = 10;
    // 箭头集合
    var arrowSet = paper.set();
    var mainSet = paper.set();//存放"主干"部分的节点和画线
    var nonAcsSet = paper.set();//存放非ACS部分的节点和画线
    var acsSet = paper.set();//存放ACS部分的节点和画线

    // 存放流程线
    var flowChartLine = {};
    // 存放所有的流程组件，包括任务，分支
    var flowChart = {};
    
    // 当前的矩形节点
    var nodeArrayFromGateWay1; //存放初步诊断节点
    var nodeArrayByTask1;//存放非ACS节点
    var nodeArrayByTask2;//存放ACS节点
    var hasWindow = false;//页面上是否有信息窗

    var baseX = 0;
    var baseY = 40;
    
    var finishedNodeAttr = {
    	'fill': '44b548'
    },
    unfinishedNodeAttr ={
    	'fill': 'white'
    }

    var isFinishEcg = false;

    var vm = avalon.define({
        $id: 'flowChart',
        showHis:false,//是否包含历史
        showPatientList:true,
        searchKey:null,//搜索框输入内容
        patientList: [],//右侧胸痛病人列表
        patientGreenNodes: [],//单个病人已完成的流程节点
        ecgList:[],//心电图列表
        currPatientInfo: {
            regSeq:'',
        	emgSeq:'',
        	mpi:'',
        	cstNam:'',
        	emgDat:'',
        	emgDatStr:'',
        	// xtCod:'',
        	xtSubCod:'',
        	bqpg:'',
        	scyljcsj:'', // 首次医疗接触时间
        	ynsfxdtsj:'',  // 首份心电图时间
        	ynsfxdtqzsj:'',  // 心电图确诊时间
        	jgdbbgsj:'', // 血化验时间（肌钙蛋白报告时间）
        	kxxbywgysj:'',
        	/*
        	{
        		kxxbywgysj:'',
        		asplsj:'', // 阿司匹林时间
        		lbglsj:'', // 氯吡格雷时间
        		tgrlsj:''  // 替格瑞洛时间
        	},
        	*/
        	qddgssj:'',   // 导管室启动时间
        	dgsjhsj:'',   // 导管室激活时间
        	dstgsj:''     // 导丝通过时间
        	
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
        pageInfo: {
            total: 0,
            pageNumber: 1, //当前页
            pageSize: 5 //当前页数量
        },//分页参数
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
            console.log(patient)
            //hisSelPat保存当前选中的病人，目的是切回本tab页时展示之前正在浏览的病人数据
            hisSelPat = patient;
        	// 每次点击都要先重置流程图
        	resetFlowChart();
            clearWindow();
            vm.currPatientInfo.regSeq = patient.regSeq;
            vm.currPatientInfo.emgSeq = patient.emgSeq;
        	vm.currPatientInfo.cstNam = patient.cstNam;
        	vm.currPatientInfo.emgDat = patient.regTim;
        	vm.currPatientInfo.emgDatStr = patient.emgDatStr;
        	// vm.currPatientInfo.scyljcsj = patient.emgDatStr;
        	// vm.currPatientInfo.xtCod = patient.xtCod;
        	// vm.currPatientInfo.xtSubCod = patient.xtSubCod;
        	vm.currPatientInfo.wayTyp = patient.wayTyp;
        	
        	vm.currPatientInfo.bqpg = publicFun.codingEscape(publicFun.getDict('XT_BQPG_COD'),patient.bqpg)     ;
        	
        	vm.currPatientInfo.mpi = patient.mpi;
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
                url: 'cpc/getCpcPatientRouteInfoByEmgSeq.do',
                type: 'post',
                dataType: 'json',
                contentType: 'application/json;charset=UTF-8',
                data: JSON.stringify({
                    'emgSeq': _emgSeq
                }),
                success: function (res) {
                	// 1.处理绿色节点
                	// 2.处理倒计时
                	
                    // 获取节点集合
                    var list = res.resultInfo.sysdata.list;
                	
                    list.forEach(function(item,index){
                    	if(!flowChart.hasOwnProperty(item.nodeId)){
                    		console.log('后台传递的节点：'+item.nodeId+'在流程图中没有定义，请检查');
                    		
                    	}else{
                    		flowChart[item.nodeId].status = item.status;
                    		flowChart[item.nodeId].task.attr(item.status==='1'?finishedNodeAttr:unfinishedNodeAttr);
                    	}
                    	
                    });
                    

                    //获取该病人的节点倒计时信息
                    var countInfoList = res.resultInfo.sysdata.hspXtzlInfList;
                    // console.log('countInfoList',countInfoList);
                    
                    // 先关闭定时器
                    clearInterval(cd1);
                    
                    for(var a in countdownTime1){
                    	$('#' + a + ' div').css('background-color', '');
                    }
                    
                    $('#ynsfxdtqzsj'  + ' div').css('background-color', '');
                    $('#dgsjhsj'  + ' div').css('background-color', '');
                    
                    
                    vm.currPatientInfo.ynsfxdtsj = '';
                    vm.currPatientInfo.ynsfxdtqzsj = '';
                    vm.currPatientInfo.jgdbbgsj = '';
                    vm.currPatientInfo.kxxbywgysj = '';
                    vm.currPatientInfo.qddgssj = '';
                    vm.currPatientInfo.dgsjhsj = '';
                    vm.currPatientInfo.dstgsj = '';
                    
                    
		        	countInfoList.forEach(function(item,index){
		        		if(item.proCode ==='SCYLJCSJ'){
		        			// vm.currPatientInfo.scyljcsj = item.proVal;
		        		}else if(item.proCode ==='YNSFXDTSJ'){
		        			vm.currPatientInfo.ynsfxdtsj = item.proVal;
		        		}else if(item.proCode ==='YNSFXDTQZSJ'){
		        			vm.currPatientInfo.ynsfxdtqzsj = item.proVal;
		        		}else if(item.proCode ==='JGDBBGSJ'){
		        			vm.currPatientInfo.jgdbbgsj = item.proVal;
		        		}else if(item.proCode ==='KXXBYWGYSJ'){
		        			vm.currPatientInfo.kxxbywgysj = item.proVal;
		        		}else if(item.proCode ==='QDDGSSJ'){
		        			vm.currPatientInfo.qddgssj = item.proVal;
		        		}else if(item.proCode ==='DGSJHSJ'){
		        			vm.currPatientInfo.dgsjhsj = item.proVal;
		        		}else if(item.proCode ==='DSTGSJ'){
		        			vm.currPatientInfo.dstgsj = item.proVal;
		        		}
		        	});
		        	// 重启定时器
		        	cd1 = setInterval(countDown, 1000);
                }
            });
        },

        // 根据后台获取到的流程图质控节点的时间处理倒计时
        dealNodeTime: function (countInfoList) {
            //获取倒计时节点的具体时间，赋值给Avalon的nodeTime对象
            /*
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
            */
        }
    });

    /**
     * 获取右侧胸痛病人列表；
     * searchKey ----搜索关键字
     * showHis ----是否 包含历史
     **/
    function getPatients(){
        publicFun.httpServ('post', 'cpc/getCpcPatientListInfo.do', {
            cstNam: vm.searchKey,
            bhls: vm.showHis,
            patTyp : "1",// 1胸痛 2 卒中 3 创伤
            page: vm.pageInfo.pageNumber,
            rows: vm.pageInfo.pageSize
        }, function (res) {
            var list = res.rows;
            vm.pageInfo.total = res.total
            if (list && list.length) {
                for (var i = 0; i < list.length; i++) {
                    list[i].emgDatStr = publicFun.timeFormat(list[i].regTim, 'yyyy/MM/dd hh:mm');//格式化预检时间
                    list[i].hasUpdated = false; //设置信息更新的标志
                }
                vm.patientList = list;

                //获取hisSelPat中保存的选中用户点击选择的胸痛病人
                if(Object.keys(hisSelPat).length){
                    //若hisSelPat中有历史选中的病人，左侧流程图立即渲染历史选中病人的数据
                    vm.clickPatient(sessionPatient);
                }else {
                    //左侧流程图立即渲染右侧列表的第一个病人的数据
                    vm.clickPatient(list[0]);
                }
                setPagination()
            }else {
                vm.patientList = [];
                vm.patientGreenNodes = [];
                vm.currPatientInfo ={
                    regSeq:'',
               		emgSeq:'',
                   	mpi:'',
                   	cstNam:'',
                   	emgDat:'',
                   	emgDatStr:'',
                   	// xtCod:'',
                   	bqpg:'',
                   	scyljcsj:'', // 首次医疗接触时间
                   	ynsfxdtsj:'',  // 首份心电图时间
                   	ynsfxdtqzsj:'',  // 心电图确诊时间
                   	jgdbbgsj:'', // 血化验时间（肌钙蛋白报告时间）
                   	kxxbywgysj:'',
                   	qddgssj:'',   // 导管室启动时间
                   	dgsjhsj:'',   // 导管室激活时间
                   	dstgsj:''     // 导丝通过时间
                };
                
            }
        });
    }
    // 初始化流程图节点
    function resetFlowChart(){
        // 重置流程图
        
        for(var i in flowChart){
        	flowChart[i].status = '0';
        	flowChart[i].task.attr(unfinishedNodeAttr);
        }
    }
    
    // 定义质控时间
    var countdownTime1 = {
        ynsfxdtsj: 10,   // 首份心电图时间质控
        jgdbbgsj: 20,     // 血化验时间质控
        kxxbywgysj: 30,  // 抗凝药给药时间质控
        dstgsj: 90     // 导丝通过时间质控
    };
	
    var countdownTime2 = {
        ynsfxdtqzsj: 10  // 心电图诊断时间
    };
    
    var countdownTime3 = {
        dgsjhsj: 30  // 导管室激活质控 
    };

    function countDown(){
    	
    	// 质控比较的开始时间
        var emgDat = new Date(vm.currPatientInfo.emgDat);
    	
    	// 获取当前时间
    	var currentTime = new Date();
    	
    	for(var a in countdownTime1){
    		
    		if(vm.currPatientInfo[a] == ''){
    			
    			// 获取剩余时间的毫秒数
                var leftTime = parseInt((emgDat.getTime() + countdownTime1[a] * 60 * 1000 - currentTime.getTime()) / 1000);
    			
             	// 如果毫秒数大于等于0
                if (leftTime >= 0) {

                    // 剩余分钟数
                    var sec_left = parseInt(leftTime / 60);
                    // 剩余秒数
                    var min_left = leftTime % 60;

                    $('#' + a).progressbar({
                        value: leftTime / (countdownTime1[a] * 60) * 100,
                        text: sec_left + '分' + min_left + '秒' + '/' + countdownTime1[a] + '分'
                    });
                } else {
                    // 毫秒数小于0，代表超时

                    // 超时的分钟数
                    var sec_after = parseInt(Math.abs(leftTime) / 60);
                    // 超时的秒数
                    
                    var text = '';
					
					var min_after = Math.abs(leftTime) % 60;
					text = '超时 ' + sec_after + '分' + min_after + '秒'
					
                    $('#' + a).progressbar({
                        value: 0,
                        text: text
                    });
                    $('#' + a + ' div').css('background-color', 'red');
                }
    		
    		}
    		
    	}
    	
    	// 首份心电图时间倒计时
    	// 如果有首份心电图时间，没有心电图确诊时间，则启用倒计时
    	if(vm.currPatientInfo.ynsfxdtsj !='' && vm.currPatientInfo.ynsfxdtqzsj == ''){
    		
    		// 获取剩余时间的毫秒数
            var leftTime = parseInt((new Date(vm.currPatientInfo.ynsfxdtsj).getTime() + 10 * 60 * 1000 - currentTime.getTime()) / 1000);
         	
    		// 如果毫秒数大于等于0
            if (leftTime >= 0) {

                // 剩余分钟数
                var sec_left = parseInt(leftTime / 60);
                // 剩余秒数
                var min_left = leftTime % 60;

                $('#ynsfxdtqzsj').progressbar({
                    value: leftTime / (10 * 60) * 100,
                    text: sec_left + '分' + min_left + '秒' + '/' + 10 + '分'
                });
            } else {
                // 毫秒数小于0，代表超时

                // 超时的分钟数
                var sec_after = parseInt(Math.abs(leftTime) / 60);
                // 超时的秒数
                
                var text = '';
				
				var min_after = Math.abs(leftTime) % 60;
				text = '超时 ' + sec_after + '分' + min_after + '秒'
				
                $('#ynsfxdtqzsj').progressbar({
                    value: 0,
                    text: text
                });
                $('#ynsfxdtqzsj' + ' div').css('background-color', 'red');
            }
    	}else{
    		
    	}
    	
    	// 导管室启动倒计时
    	// 如果导管室启动有时间，导管室激活没时间，则启动倒计时
    	if(vm.currPatientInfo.qddgssj !='' && vm.currPatientInfo.dgsjhsj == ''){
    		// 获取剩余时间的毫秒数
            var leftTime = parseInt((new Date(vm.currPatientInfo.qddgssj).getTime() + 30 * 60 * 1000 - currentTime.getTime()) / 1000);
		
         	// 如果毫秒数大于等于0
            if (leftTime >= 0) {

                // 剩余分钟数
                var sec_left = parseInt(leftTime / 60);
                // 剩余秒数
                var min_left = leftTime % 60;

                $('#dgsjhsj').progressbar({
                    value: leftTime / (30 * 60) * 100,
                    text: sec_left + '分' + min_left + '秒' + '/' + 30 + '分'
                });
            } else {
                // 毫秒数小于0，代表超时

                // 超时的分钟数
                var sec_after = parseInt(Math.abs(leftTime) / 60);
                // 超时的秒数
                
                var text = '';
				
				var min_after = Math.abs(leftTime) % 60;
				text = '超时 ' + sec_after + '分' + min_after + '秒'
				
                $('#dgsjhsj').progressbar({
                    value: 0,
                    text: text
                });
                $('#dgsjhsj' + ' div').css('background-color', 'red');
            }
    		
    	}else{
    		
    	}
    }
    
    //跳转到胸痛登记页面
    function redirectToprint() {
        var url = 'cpc/toXtzlPrintPage.do?emgSeq=' + vm.currPatientInfo.emgSeq + '&regSeq=' + vm.currPatientInfo.regSeq
        +'&cstNam='+vm.currPatientInfo.cstNam +'&tempNo=TEMP10000001';
        window.top.addTab('胸痛登记表-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
  //跳转到胸痛随访页面
    function redirectTosf() {
        var url = 'followup/tofuvadd.do?emgSeq=' + vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp;
        window.top.addTab('胸痛随访表-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
  //跳转到胸痛随访管理页面
    function redirectTosfgl() {
        var url = 'followup/queryfuv.do?emgSeq=' + vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp;
        window.top.addTab('胸痛随访管理-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
  //跳转到胸痛随访增加
    function redirectTosfgladd() {
        var url = 'followup/addfuv.do?emgSeq=' + vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp;
        window.top.addTab('胸痛随访管理add-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
    //跳转到胸痛上报页面
    function toReport() {
        var url = 'cpc/toXtxqPage.do?emgSeq=' + vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp + '&regSeq=' + vm.currPatientInfo.regSeq;
        window.top.addTab('胸痛上报-' + vm.currPatientInfo.cstNam, url, 'icon icon-emergency-record');
    }
    // 胸痛急救时间轴
    function toCpcTimeline() {
    	var patInfo = vm.currPatientInfo;
        var cstNam = patInfo.cstNam;
        var openTabNam = '胸痛急救时间轴';
        openTabNam = cstNam ? openTabNam + '-' + cstNam : openTabNam;
        var openTabUrl = '${baseurl}cpc/toCpcTimeline.do?emgSeq=' + patInfo.emgSeq + "&wayTyp=" + patInfo.wayTyp +'&regSeq='+ patInfo.regSeq;
        parent.opentabwindow(openTabNam, openTabUrl, '1');
    }

    //点击ECG心电图节点跳转到心电图页
    function showEcg() {
    	 window.top.addTab('心电图', '${baseurl}cpc/toEcgPage.do?emgSeq='+ vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp, 'icon icon-emergency-record');
    }

    function showSysjc(){
        window.top.addTab('检查报告', '${baseurl}cpc/toJcPage.do?emgSeq='+ vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp,
            'icon icon-emergency-record');
    }
    function showSysjy(){
        window.top.addTab('检验结果', '${baseurl}cpc/toJyPage.do?emgSeq='+ vm.currPatientInfo.emgSeq + '&wayTyp=' + vm.currPatientInfo.wayTyp,
            'icon icon-emergency-record');
    }
    
	function showGracepg(){
        window.top.addTab('GRACE评分详情', '${baseurl}cpc/toGracePage.do?emgSeq='+ vm.currPatientInfo.emgSeq,
            'icon icon-emergency-record');
    }
	
	function showCsyw(){
        window.top.addTab(vm.currPatientInfo.cstNam+'-初始药物', '${baseurl}cpc/toCsywPage.do?emgSeq='+ vm.currPatientInfo.emgSeq,
            'icon icon-emergency-record','2');
    }
	
    /**
     * 画流程图节点和线
     */
    function drawFlow() {
    	
		var esp = createExpandedSubProcess(baseX + 530, baseY + 20, 400, 140, 10);
		
        createTask(baseX + 560, baseY + 50, '急诊预查','jzyc',true);
        
        createTask(baseX + 680, baseY + 50, '心电图','xdt',true);
        
        createTask(baseX + 800, baseY + 50, '实验室检查','sysjc',true);
        
        var cbzd = createBranch(baseX + 680, baseY + 200,'初步诊断','cbzd',true);
        
        drawArrowLine(esp[2],cbzd[0]);
        
        // STEMI
        var stemi = createTask(baseX + 800, baseY + 320, 'STEMI','stemi',false);
        
        // 心功能分级
        var xgnfj = createTask(baseX + 920, baseY + 420, '心功能分级','xgnfj',true);
        
     	// 初始药物
        var csyw = createTask(baseX + 920, baseY + 520, '初始药物','csyw',true);
        
        drawArrowLine(xgnfj[2],csyw[0]);
        
     	// 有无再灌注措施
        var ywzgz = createBranch(baseX + 800, baseY + 835,'有无再灌注措施','ywzgzcs',false);
     	
        // drawArrowLine(csyw[2],ywzgz[0]);
     	
        // 无再灌注措施原因
        var wzgzcsyy = createTask(baseX + 920, baseY + 820, '无再灌注\n措施原因','wzgzcsyy',true);
     	
        drawArrowLine(ywzgz[1],wzgzcsyy[3]);
        
        // 再灌注措施
        var zgzcs = createBranch(baseX + 800, baseY + 935,'再灌注措施','zgzcs',false);
        
        drawArrowLine(ywzgz[2],zgzcs[0]);
        
        // CABG
        var cabg1 = createTask(baseX + 800, baseY + 1020, 'CABG','cabg',false);
        
        // 择期介入
        var zqjr = createTask(baseX + 560, baseY + 1020, '择期介入','zqjr',false);
        
        // 溶栓
        var rs = createTask(baseX + 680, baseY + 1020, '溶栓','rs',false);
        
        drawArrowLine(zgzcs[2],cabg1[0]);
        
     	// 直接PCI
        var zjpci = createTask(baseX + 920, baseY + 1020, '直接PCI','zjpci',false);
     
        // 溶栓后续
        var rshx = createBranch(baseX + 680, baseY + 1135,'溶栓后续','rshx',false);
        
        drawArrowLine(rs[2],rshx[0]);
        // 无
        // var wu = createTask(baseX + 680, baseY + 1120, '无','wu',false);
     	
        // drawArrowLine(rshx[3],wu[1]);
        // 溶栓后介入
        var rshjr = createTask(baseX + 800, baseY + 1120, '溶栓后介入','rshjr',false);
        
       
        
        drawArrowLine(rshx[1],rshjr[3]);
        
        // 补救PCI
        var bjpci = createTask(baseX + 680, baseY + 1220, '补救PCI','bjpci',false);
        
        drawArrowLine(rshx[2],bjpci[0]);
        
        // 执行PCI
        var zxpci = createTask(baseX + 920, baseY + 1120, '导管室','zxpci',true);
        
        drawArrowLine(rshjr[1],zxpci[3]);
        
        drawArrowLine(zjpci[2],zxpci[0]);
        
    	// NSTEMI/UA
    	var nstemi = createTask(baseX + 1040, baseY + 320, 'NSTEMI/UA','nstemi',false);
       
    	// GRACE评估
        var gracepg = createTask(baseX + 1040, baseY + 620, 'GRACE评估','gracepg',true);
        
        // 再次危险分层
        // var zcwxfc = createBranch(baseX + 1040, baseY + 735,'再次危险分层','zcwxfc',false);
        
        // drawArrowLine(gracepg[2],zcwxfc[0]);
        
        // 转为STEMI
        // var zwstemi = createTask(baseX + 920, baseY + 720, '转为STEMI','zwstemi',false);
        
        // drawArrowLine(zwstemi[3],{x:ywzgz[0].x,y:zwstemi[3].y});
        
        // drawArrowLine(zcwxfc[3],zwstemi[1]);
        
        // 未做，极高危，高危，中危，低危
        // var jgw = createTask(baseX + 1160, baseY + 720, '极高危，高危，\n中危，低危，\n未做','jgw',false);
        
        // drawArrowLine(zcwxfc[1],jgw[3]);
        
        // 处理策略
        var clcl = createBranch(baseX + 1160, baseY + 835,'处理策略','clcl',false);
        
        // drawArrowLine(jgw[2],clcl[0]);
        
        // 保守治疗
        var bszl = createTask(baseX + 1040, baseY + 820,'保守治疗','bszl',false);
        
        drawArrowLine(clcl[3],bszl[1]);
        
        // 侵入性策略
        // var qrxcl = createTask(baseX + 1280, baseY + 820,'侵入性策略','qrxcl',false);
        
        // drawArrowLine(clcl[1],qrxcl[3]);
        
        // 侵入性策略
        var jtqrxcl = createBranch(baseX + 1280, baseY + 935,'侵入性策略','qrxcl',false);
        
        //drawArrowLine(qrxcl[2],jtqrxcl[0]);
        
        // 2H紧急介入治疗
        var jjjrzl = createTask(baseX + 1040, baseY + 1020,'2H紧急介入治疗','jjjrzl',false);
        
        // 24H内介入治疗
        var jr24 = createTask(baseX + 1160, baseY + 1020,'24H内介入治疗','jr24',true);
        
        // 72H内介入治疗
        var jr72 = createTask(baseX + 1280, baseY + 1020,'72H内介入治疗','jr72',false);
        drawArrowLine(jtqrxcl[2],jr72[0]);
        
     	// 择期介入治疗
        var zqjrzl = createTask(baseX + 1400, baseY + 1020,'择期介入治疗','zqjrzl',false);
     	
     	// CABG
        var cabg = createTask(baseX + 1520, baseY + 1020,'CABG','cabgqr',false);
		
        //非ACS部分
        var nonAcsNodeArrayBySubProcess = createExpandedSubProcess(baseX+50, baseY + 290, 640, 540, 10,'nonAcs');
        // 非ACS部分第一列节点
		
        var nodeArrayByTask3 = createTask(baseX + 80, baseY + 320, '主动脉夹层', 'zdmjc',false);
        var nodeArrayByTask3_4 = createTask(baseX + 80, baseY + 420, '影像学检查', 'yxxjc',true);
        var nodeArrayByTask3_5 = createTask(baseX + 80, baseY + 520, '心外科会诊', 'xwkhz',true);
        var nodeArrayByTask3_6 = createTask(baseX + 80, baseY + 620, '夹层类型', 'jclx',true);
        var nodeArrayByTask3_7 = createTask(baseX + 80, baseY + 720, '治疗策略', 'zlcl',true);
        
        drawArrowLine(nodeArrayByTask3[2],nodeArrayByTask3_4[0]);
        drawArrowLine(nodeArrayByTask3_4[2],nodeArrayByTask3_5[0]);
        drawArrowLine(nodeArrayByTask3_5[2],nodeArrayByTask3_6[0]);
        drawArrowLine(nodeArrayByTask3_6[2],nodeArrayByTask3_7[0]);
        
        // 非ACS部分第二列节点
        var nodeArrayByTask4 = createTask(baseX + 200, baseY + 320, '肺动脉栓塞', 'fdmss',false);
        var nodeArrayByTask4_3 = createTask(baseX + 200, baseY + 420, '影像学检查', 'yxxjc',true);
        var nodeArrayByTask4_4 = createTask(baseX + 200, baseY + 520, '治疗信息', 'zlxx',true);
        var nodeArrayByTask4_5 = createTask(baseX + 200, baseY + 620, '院内溶栓治疗', 'ynrszl',true);
        drawArrowLine(nodeArrayByTask4[2],nodeArrayByTask4_3[0]);
        drawArrowLine(nodeArrayByTask4_3[2],nodeArrayByTask4_4[0]);
        drawArrowLine(nodeArrayByTask4_4[2],nodeArrayByTask4_5[0]);
        
        
        // 非ACS部分第三列节点
        var nodeArrayByTask5 = createTask(baseX + 320, baseY + 320, '非ACS心\n源性胸痛', 'facsxyxxt',false);
        var nodeArrayByTask5_1 = createTask(baseX + 320, baseY + 420, '非ACS心\n源性胸痛类型', 'facsxyxxtlx',true);
       
        drawArrowLine(nodeArrayByTask5[2],nodeArrayByTask5_1[0]);
        
        // 非ACS部分第四列节点
        var nodeArrayByTask6 = createTask(baseX +440, baseY + 320, '其它\n非心源性胸痛', 'qtfxyxxt',false);
        var nodeArrayByTask6_1 = createTask(baseX + 440, baseY + 420, '其他非心\n源性胸痛类型', 'qtfxyxxtlx',true);
        var nodeArrayByTask6_2 = createTask(baseX + 440, baseY + 520, '处理措施', 'clcs',true);
        var nodeArrayByTask6_3 = createTask(baseX + 440, baseY + 620, '患者情况备注', 'hzqkbz',true);
        drawArrowLine(nodeArrayByTask6[2],nodeArrayByTask6_1[0]);
        drawArrowLine(nodeArrayByTask6_1[2],nodeArrayByTask6_2[0]);
        drawArrowLine(nodeArrayByTask6_2[2],nodeArrayByTask6_3[0]);
        
        // 非ACS部分第五列节点
        var nodeArrayByTask7 = createTask(baseX +560, baseY + 320, '待查', 'dc',false);
        
       

        
        
        var pathStr0 = 'm';
        pathStr0 += jtqrxcl[3].x + ' ' + jtqrxcl[3].y + ' ';
        pathStr0 += 'H';
        pathStr0 +=  jjjrzl[0].x + ' ';
        pathStr0 += 'V';
        pathStr0 +=  jjjrzl[0].y + ' ';
        var line0 = paper.path(pathStr0);
        arrowSet.push(line0);
        // flowChartLine['line26'] = line26;
     	
     	var pathStr1 = 'm';
     	pathStr1 += jtqrxcl[3].x + ' ' + jtqrxcl[3].y + ' ';
     	pathStr1 += 'H';
     	pathStr1 +=  jr24[0].x + ' ';
     	pathStr1 += 'V';
     	pathStr1 +=  jr24[0].y + ' ';
        var line1 = paper.path(pathStr1);
        arrowSet.push(line1);
        
        var pathStr2 = 'm';
        pathStr2 += jtqrxcl[1].x + ' ' + jtqrxcl[1].y + ' ';
        pathStr2 += 'H';
        pathStr2 +=  zqjrzl[0].x + ' ';
        pathStr2 += 'V';
        pathStr2 +=  zqjrzl[0].y + ' ';
        var line2 = paper.path(pathStr2);
        arrowSet.push(line2);
        
        var pathStr3 = 'm';
        pathStr3 += jtqrxcl[1].x + ' ' + jtqrxcl[1].y + ' ';
        pathStr3 += 'H';
        pathStr3 +=  cabg[0].x + ' ';
        pathStr3 += 'V';
        pathStr3 +=  cabg[0].y + ' ';
        var line3 = paper.path(pathStr3);
        arrowSet.push(line3);
        
        var pathStr4 = 'm';
        pathStr4 += zgzcs[3].x + ' ' + zgzcs[3].y + ' ';
        pathStr4 += 'H';
        pathStr4 +=  rs[0].x + ' ';
        pathStr4 += 'V';
        pathStr4 +=  rs[0].y + ' ';
        var line4 = paper.path(pathStr4);
        arrowSet.push(line4);
     	
        var pathStr5 = 'm';
        pathStr5 += zgzcs[3].x + ' ' + zgzcs[3].y + ' ';
        pathStr5 += 'H';
        pathStr5 +=  zqjr[0].x + ' ';
        pathStr5 += 'V';
        pathStr5 +=  zqjr[0].y + ' ';
        var line5 = paper.path(pathStr5);
        arrowSet.push(line5);
     	
        
        var pathStr6 = 'm';
        pathStr6 += zgzcs[1].x + ' ' + zgzcs[1].y + ' ';
        pathStr6 += 'H';
        pathStr6 +=  zjpci[0].x + ' ';
        pathStr6 += 'V';
        pathStr6 +=  zjpci[0].y + ' ';
        var line6 = paper.path(pathStr6);
        arrowSet.push(line6);
        
        
        var pathStr7 = 'm';
        pathStr7 += jjjrzl[2].x + ' ' + jjjrzl[2].y + ' ';
        pathStr7 += 'V';
        pathStr7 +=  zxpci[1].y + ' ';
        pathStr7 += 'H';
        pathStr7 +=  zxpci[1].x + ' ';
        var line7 = paper.path(pathStr7);
        arrowSet.push(line7);
        
        var pathStr8 = 'm';
        pathStr8 += cbzd[3].x + ' ' + cbzd[3].y + ' ';
        pathStr8 += 'H';
        pathStr8 +=  nodeArrayByTask3[0].x + ' ';
        pathStr8 += 'V';
        pathStr8 +=  nodeArrayByTask3[0].y + ' ';
        var line8 = paper.path(pathStr8);
        arrowSet.push(line8);
        
        var pathStr9 = 'm';
        pathStr9 += cbzd[3].x + ' ' + cbzd[3].y + ' ';
        pathStr9 += 'H';
        pathStr9 +=  nodeArrayByTask4[0].x + ' ';
        pathStr9 += 'V';
        pathStr9 +=  nodeArrayByTask4[0].y + ' ';
        var line9 = paper.path(pathStr9);
        arrowSet.push(line9);
        
        var pathStr10 = 'm';
        pathStr10 += cbzd[3].x + ' ' + cbzd[3].y + ' ';
        pathStr10 += 'H';
        pathStr10 +=  nodeArrayByTask5[0].x + ' ';
        pathStr10 += 'V';
        pathStr10 +=  nodeArrayByTask5[0].y + ' ';
        var line10 = paper.path(pathStr10);
        arrowSet.push(line10);
        
        
        var pathStr11 = 'm';
        pathStr11 += cbzd[3].x + ' ' + cbzd[3].y + ' ';
        pathStr11 += 'H';
        pathStr11 +=  nodeArrayByTask6[0].x + ' ';
        pathStr11 += 'V';
        pathStr11 +=  nodeArrayByTask6[0].y + ' ';
        var line11 = paper.path(pathStr11);
        arrowSet.push(line11);
        
        var pathStr12 = 'm';
        pathStr12 += cbzd[3].x + ' ' + cbzd[3].y + ' ';
        pathStr12 += 'H';
        pathStr12 +=  nodeArrayByTask7[0].x + ' ';
        pathStr12 += 'V';
        pathStr12 +=  nodeArrayByTask7[0].y + ' ';
        var line12 = paper.path(pathStr12);
        arrowSet.push(line12);
        
        var pathStr13 = 'm';
        pathStr13 += cbzd[1].x + ' ' + cbzd[1].y + ' ';
        pathStr13 += 'H';
        pathStr13 +=  stemi[0].x + ' ';
        pathStr13 += 'V';
        pathStr13 +=  stemi[0].y + ' ';
        var line13 = paper.path(pathStr13);
        arrowSet.push(line13);
        
        var pathStr14 = 'm';
        pathStr14 += cbzd[1].x + ' ' + cbzd[1].y + ' ';
        pathStr14 += 'H';
        pathStr14 +=  nstemi[0].x + ' ';
        pathStr14 += 'V';
        pathStr14 +=  nstemi[0].y + ' ';
        var line14 = paper.path(pathStr14);
        arrowSet.push(line14);
        
        var pathStr15 = 'm';
        pathStr15 += stemi[2].x + ' ' + stemi[2].y + ' ';
        pathStr15 += 'V';
        pathStr15 +=  xgnfj[3].y + ' ';
        pathStr15 += 'H';
        pathStr15 +=  xgnfj[3].x + ' ';
        var line15 = paper.path(pathStr15);
        arrowSet.push(line15);
        
    	var pathStr16 = 'm';
    	pathStr16 += nstemi[2].x + ' ' + nstemi[2].y + ' ';
    	pathStr16 += 'V';
    	pathStr16 +=  xgnfj[1].y + ' ';
    	pathStr16 += 'H';
    	pathStr16 +=  xgnfj[1].x + ' ';
        var line16 = paper.path(pathStr16);
        arrowSet.push(line16);
        
        var pathStr17 = 'm';
        pathStr17 += csyw[3].x + ' ' + csyw[3].y + ' ';
        pathStr17 += 'H';
        pathStr17 +=  stemi[0].x + ' ';
        pathStr17 += 'V';
        pathStr17 +=  ywzgz[0].y + ' ';
        var line17 = paper.path(pathStr17);
        arrowSet.push(line17);
        
        var pathStr18 = 'm';
        pathStr18 += csyw[1].x + ' ' + csyw[1].y + ' ';
        pathStr18 += 'H';
        pathStr18 +=  nstemi[0].x + ' ';
        pathStr18 += 'V';
        pathStr18 +=  gracepg[0].y + ' ';
        var line18 = paper.path(pathStr18);
        arrowSet.push(line18);
        
        var pathStr19 = 'm';
        pathStr19 += nodeArrayByTask5_1[2].x + ' ' + nodeArrayByTask5_1[2].y + ' ';
        pathStr19 += 'V';
        pathStr19 +=  nodeArrayByTask6_2[3].y + ' ';
        pathStr19 += 'H';
        pathStr19 +=  nodeArrayByTask6_2[3].x + ' ';
        var line19 = paper.path(pathStr19);
        arrowSet.push(line19);

        var pathStr20 = 'm';
        pathStr20 += nodeArrayByTask7[2].x + ' ' + nodeArrayByTask7[2].y + ' ';
        pathStr20 += 'V';
        pathStr20 +=  nodeArrayByTask6_2[1].y + ' ';
        pathStr20 += 'H';
        pathStr20 +=  nodeArrayByTask6_2[1].x + ' ';
        var line20 = paper.path(pathStr20);
        arrowSet.push(line20);
        
        var pathStr21 = 'm';
        pathStr21 += clcl[1].x + ' ' + clcl[1].y + ' ';
        pathStr21 += 'H';
        pathStr21 += jtqrxcl[0].x + ' ';
        pathStr21 += 'V';
        pathStr21 += jtqrxcl[0].y + ' ';
        var line21 = paper.path(pathStr21);
        arrowSet.push(line21);
        
        var pathStr22 = 'm';
        pathStr22 += bjpci[1].x + ' ' + bjpci[1].y + ' ';
        pathStr22 += 'H';
        pathStr22 += zxpci[2].x + ' ';
        pathStr22 += 'V';
        pathStr22 += zxpci[2].y + ' ';
        var line22 = paper.path(pathStr22);
        arrowSet.push(line22);
        
        var pathStr23 = 'm';
        pathStr23 += gracepg[1].x + ' ' + gracepg[1].y + ' ';
        pathStr23 += 'H';
        pathStr23 += clcl[0].x + ' ';
        pathStr23 += 'V';
        pathStr23 += clcl[0].y + ' ';
        var line23 = paper.path(pathStr23);
        arrowSet.push(line23);
        
        
        
        arrowSet.attr({
            'arrow-end': 'block-wide-long',
            'stroke-width': '2'
            //'stroke-dasharray':'-'
        });
        
        console.log('flowChart',flowChart);
    }

    function checkboxCodeToTxt(prop,value,proListName) {
        var txt = '';
        var dicArr = publicFun.getDict(proListName) || [];
        var valueArr = value.split(',');
		for(var i=0;i<dicArr.length;i++){
			var el = dicArr[i];
			if (valueArr.indexOf(el.infocode) > -1){
			    txt += el.info + ',';
			}
		}
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
    	
        var maxNameLen = 0;
        
        if (resList){
        	for(var i=0;i<resList.length;i++){
				    var el = resList[i];
					value = el.proVal,
					type = el.proType,
                    name = el.proName.replace(/\s*/g,'') || '',//去除文字描述字符串中的空格
                    prop = el.proCode,
                    proUnit = el.proUnit||'',
                    proListName = el.proList || '';
                if(value){
                    if (type == 'datetime2'){
                        value = moment(value,'YYYY-MM-DD HH:mm:ss').format('HH:mm');
                    }else if (type == 'datetime'){
                        value = moment(value,'YYYY-MM-DD HH:mm:ss').format('YYYY-MM-DD HH:mm');
                    }else if (type === "select"){
                        value = selectCodeToTxt(prop,value,proListName);
                    }else if (type == "checkbox" || type == "popup"){
                        value = checkboxCodeToTxt(prop,value,proListName);
                    }else if (type == "radio"){
                        value = value == 0 ? '否' : '是';
                    }
                    if(prop ==='YISHENG'){
                    	$.ajax({
                            url: 'user/getUserByUsrno.do',
                            type: 'post',
                            dataType: 'json',
                            async: false,
                            contentType: 'application/json;charset=UTF-8',
                            data: JSON.stringify({
                                'usrno': value
                            }),
                            success: function (res) {
                            	
								value = res.resultInfo.sysdata.dstuser.usrname;
                            },
                            error: function (err) {
                                //console.log(err)
                            }
                        });
                    }
                }else{
                    value='';
                }
                if(name.length > maxNameLen){
                    maxNameLen = name.length + 1;

                }
                console.log(value);
                $('#window').append("<div class='item'><div class='name'>"+ name + ":" +"</div><div class='val'>"+ value + "</div><div class='unit'>" + proUnit +"</div></div>");
            };
            $('#window .item .name').css({
                'width': maxNameLen + 'em'
            });
        }
    }
    //清除页面展示的信息窗
    function clearWindow(){
        if(hasWindow){
            hasWindow = false;
            $('#window').empty();
            $('#window').css({
                'display':'none',
            });
        }
    }
    function getNodeRefInfo(parent,package) {
    	
    	var nodeId = package.nodeId;
        
        //  如果当前页面已有信息窗，先清除
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
            	// 渲染节点的数据  to do
                var resList = res.resultInfo.sysdata.list;
            	console.log('parent',parent);
                //流程图右侧几个节点对应的小窗，需要将位置调到节点左上方,否则位置在右下方
                var _top = parent.attrs.y + 100;
                var _left = parent.attrs.x + 10;
                /*
                if(nodeId != 2 && nodeId != 3 && nodeId != 4){
                    if(vm.hasAcsNode && !vm.hasNonAcsNode){
                        _left = _left - 270;
                        _top = _top + 70;
                    }
                }
                */

                if(resList && resList.length){
                    $('#window').css({
                        'display':'block',
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
	function createTask(x, y, content, nodeId, canClick) {	
		// 本模块矩形圆角
		// var taskR = r ? r : taskR;
		// 3层组成，第一层矩形框，填充背景颜色;第二层文字居中;第三层点击事件触发层，设为透明度0;
		
		if(!messageDefine.hasOwnProperty(nodeId)){
			return;
		}
		
		var task = paper.rect(x, y, taskWidth, taskHeight, taskR);
		
		var package = {
			task:task,
			nodeId:nodeId,
			status: '0'
			/*,
			set status(newVal){
				status = newVal;
				task.attr(newVal==='1'?finishedNodeAttr:unfinishedNodeAttr);
			},
			get status(){
				return status;
			}
			*/
		}
		package.status = '0';

		var contentX = x + taskWidth / 2;
		var contentY = y + taskHeight / 2;
		var text = paper.text(contentX, contentY, content).attr({
			'font-size' : 14,
		});

		flowChart[nodeId] = package;
		var p3 = paper.rect(x - 10, y - 10, taskWidth + 20, taskHeight + 20, taskR);
		if(canClick){
			
			p3.attr({
				'fill' : 'white',
				'fill-opacity' : 0,
				'stroke-opacity' : 0,
				'cursor' : 'pointer'
			}).dblclick(function(evt) {
                // 心电图 检验 影像学检查 gracep评分 初始药物 导管室
                if (nodeId == 'xdt') {
                    showEcg();
                }else if(nodeId =="sysjc"){
                    // 实验室检查
                    showSysjy();
                }else if(nodeId =="yxxjc"){
                    // 影像学检查
                    showSysjc();
                }else if(nodeId =="gracepg"){
                    // GRACE评估
                    showGracepg();
                }else if(nodeId =="csyw"){
                    // 初始药物
                    showCsyw();
                    // getNodeRefInfo(this,package);
                }
			}).click(function(evt) {
				if(nodeId =="zxpci"){
					// 导管室的信息
					// showPCI();
					getNodeRefInfo(this,package);
				}else{
					getNodeRefInfo(this,package);
				}
			}).hover(function() {
				this.attr({
					'stroke' : '#FF8888',
					'stroke-dasharray' : '- ',
					'stroke-opacity' : 100
				});
			}, function() {
				this.attr({
					'stroke-opacity' : 0
				});
			});
		}else{
			p3.attr({
				'fill' : 'white',
				'fill-opacity' : 0,
				'stroke-opacity' : 0,
				'cursor' : 'text'
			}).hover(function() {
				this.attr({
					'stroke' : '#FF8888',
					'stroke-dasharray' : '- ',
					'stroke-opacity' : 100
				});
			}, function() {
				this.attr({
					'stroke-opacity' : 0
				});
			});
		}
		var nodeArray = [];
		nodeArray.push({
			'x' : contentX,
			'y' : y
		});
		nodeArray.push({
			'x' : x + taskWidth,
			'y' : contentY
		});
		nodeArray.push({
			'x' : contentX,
			'y' : y + taskHeight
		});
		nodeArray.push({
			'x' : x,
			'y' : contentY
		});

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
	function createExpandedSubProcess(x, y, w, h, r, branchType) {
		var rect = paper.rect(x, y, w, h, r).attr({
			"stroke" : "black",
			"stroke-width" : 1,
			"stroke-opocity" : 0,
			"fill" : "none"
		});
		if (branchType == 'main') {
			mainSet.push(rect);
		}else if (branchType == 'nonAcs') {
			nonAcsSet.push(rect);
		}else if (branchType == 'acs') {
			acsSet.push(rect);
		}
		var nodeArray = [];
		nodeArray.push({
			'x' : x + w / 2,
			'y' : y
		});
		nodeArray.push({
			'x' : x + w,
			'y' : y + w / 2
		});
		nodeArray.push({
			'x' : x + w / 2,
			'y' : y + h
		});
		nodeArray.push({
			'x' : x,
			'y' : y + w / 2
		});
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
	function createBranch(x, y, content, nodeId, canClick) {
		// paper.rect(x+25,y,50,50,0);
		
		// 验证节点id是否填错
		if(!messageDefine.hasOwnProperty(nodeId)){
			console.log(nodeId+' 没有定义!');
			return;
		}
		
		
		x = x + 25;
		var text;
		var path = paper.path('m' + (25 + x) + ' ' + y + ' l50 25 l-50 25 l-50 -25 z');
		
		
		
		var package = {
			task: path,
			nodeId:nodeId,
			status: '0'
			/*,
			set status(newVal){
				status = newVal;
				path.attr(newVal==='1'?finishedNodeAttr:unfinishedNodeAttr);
			},
			get status(){
				console.log('get val:',status);
				return status; 
			}
			*/
		}
		package.status = '0';
		flowChart[nodeId] = package;
		
		if (content) {
			// 像素和字体转化
			// var length = content.length;
			// 文本都是居中展示的，所以偏移量为content的一般字数所占的像素值，下文写死了为75，实际应该为font-size*length/2
			text = paper.text(x + 25, y + 25, content).attr({
				'font-size' : 12
			});
		}
		var pathStr = 'm' + (25 + x) + ' ' + (y-10) + ' l70 35 l-70 35 l-70 -35 z';
		var p4 = paper.path(pathStr);
		
		if(canClick){
			p4.attr({
				'fill' : 'white',
				'fill-opacity' : 0,
				'stroke-opacity' : 0,
				'cursor' : 'pointer',
				'x': x+25,
	            'y': y-10
			}).click(function(evt) {
				getNodeRefInfo(this,package);
			}).hover(function() {
				this.attr({
					'stroke' : '#FF8888',
					'stroke-dasharray' : '- ',
					'stroke-opacity' : 100
				});
			}, function() {
				this.attr({
					'stroke-opacity' : 0
				});
			});
		}else{
			p4.attr({
				'fill' : 'white',
				'fill-opacity' : 0,
				'stroke-opacity' : 0,
				'cursor' : 'text',
				'x': x+25,
	            'y': y-10
			}).hover(function() {
				this.attr({
					'stroke' : '#FF8888',
					'stroke-dasharray' : '- ',
					'stroke-opacity' : 100
				});
			}, function() {
				this.attr({
					'stroke-opacity' : 0
				});
			});
			
		}
		
		
		
		var nodeArray = [];
		nodeArray.push({
			'x' : x + 25,
			'y' : y
		});
		nodeArray.push({
			'x' : x + 75,
			'y' : y + 25
		});
		nodeArray.push({
			'x' : x + 25,
			'y' : y + 50
		});
		nodeArray.push({
			'x' : x - 25,
			'y' : y + 25
		});
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
	function drawArrowLine(startNode, endNode, content, vh, id, branchType) {
		var text;
		var pathStr = 'm' + startNode.x + ' ' + startNode.y + ' L' + endNode.x + ' ' + endNode.y;
		var line = paper.path(pathStr);
		arrowSet.push(line);
		flowChartLine[id] = line;
		if (content) {
			if (vh === 'V') {
				text = paper.text(startNode.x + 20, (startNode.y + endNode.y) / 2, content);
			} else if (vh === 'H') {
				text = paper.text((startNode.x + endNode.x) / 2, startNode.y - 10, content);
			}
		}
		if (branchType == 'main') {
			mainSet.push(line);
			mainSet.push(text);
		}else if (branchType == 'nonAcs') {
			nonAcsSet.push(line);
			nonAcsSet.push(text);
		}else if (branchType == 'acs') {
			acsSet.push(line);
			acsSet.push(text);
		}
	}
	var messageDefine = {};
	
	function validateNodeId(){
		$.ajax({
		    url: 'cpc/getHspFlowChartDef.do',
		    type: 'post',
		    dataType: 'json',
		    contentType: 'application/json;charset=UTF-8',
		    data: JSON.stringify({
		        'flowType': 'xt'
		    }),
		    success: function (res) {
		    	var list = res.resultInfo.sysdata.list;
				for(var i=0;i<list.length;i++){
					var el = list[i];
					messageDefine[el.nodeId] = el.nodeName;
				}
		        drawFlow();
		        
		    },
		    error: function (err) {
		        //console.log(err)
		    }
		});
		
	}
	
	//建立websocket连接，监听数据更新
	function websocketConnect() {
		
    	ws = new WebSocket(weburl);
    	
        ws.onmessage = function (evt) {
        	webSocketMessageHandler(evt);
        };
    }
	
	var cbzdNodeIds = ['stemi','nstemi','zdmjc','fdmss','facsxyxxt','qtfxyxxt','dc'];
	
	var zgzcsNodeIds = ['zjpci','rs','zqjr','cabg'];
	
	var qrxclNodeIds = ['jjjrzl','jr24','jr72','zqjrzl','cabgqr'];
	
	var clclNodeIds = ['bszl','qrxcl'];
	
	var zcwxfcNodeIds = ['zwstemi','jgw'];
	
	var ywzgzcsNodeIds = ['wzgzcsyy','zgzcs'];
	
	var rshxNodeIds = ['bjpci','rshjr'];
	
	/**
	 * @param {Object} evt
	 * evt.emgSeq       推送的病人
	 * evt.greenNodeId  节点
	 * evt.status       状态
	 * evt.targetPage   目标页面  胸痛 卒中
	 * evt.messageCode  消息编号
	 * evt.message      消息
	 * evt.memo         备注
	 */
	function webSocketMessageHandler(evt){

	
        var info = JSON.parse(evt.data);
    	
        var msg = info.sysdata;
        
        // 判断是否为当前展示的胸痛病人相关的信息更新,若不是当前病人则进行提示
        if (msg.emgSeq == vm.currPatientInfo.emgSeq) {
        	var nodeId = msg.greenNodeId;
        	// 通过msg.greenNodeId 传递要变绿的节点信息;
        	console.log('nodeId',nodeId);
        	
            if (nodeId) {
            	
            	if(flowChart.hasOwnProperty(nodeId)){
            		flowChart[nodeId].status = '1';
                	flowChart[nodeId].task.attr(finishedNodeAttr);
            	}else{
            		console.log(nodeId+'节点未定义，请检查后台推送数据');
            		return;
            	}
            	
            	
            	// 处理初步诊断切换
            	
            	if(cbzdNodeIds.indexOf(nodeId) >=0){
            		cbzdNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}else if(zgzcsNodeIds.indexOf(nodeId)>=0){
            		// 处理再灌注措施
            		zgzcsNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}else if(qrxclNodeIds.indexOf(nodeId)>=0){
            		// 处理侵入性策略
            		qrxclNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}else if(clclNodeIds.indexOf(nodeId)>=0){
            		// 处理 处理策略
            		clclNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}else if(ywzgzcsNodeIds.indexOf(nodeId)>=0){
            		// 有无再灌注措施
            		ywzgzcsNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}else if(zcwxfcNodeIds.indexOf(nodeId)>=0){
            		// 再次危险分层
            		zcwxfcNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}else if(rshxNodeIds.indexOf(nodeId)>=0){
            		// 再次危险分层
            		rshxNodeIds.forEach(function(item,index){
            			if(nodeId!=item){
            				flowChart[item].status = '0';
            				flowChart[item].task.attr(unfinishedNodeAttr);
            			}
            		});
            	}
            	
            }
            
            var messageCode = msg.messageCode;
            console.log('messageCode',messageCode);
            if(messageCode){
            	if(messageCode=='QDDGSSJ'){
            		vm.currPatientInfo.qddgssj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}else if(messageCode=='DGSJHSJ'){
            		vm.currPatientInfo.dgsjhsj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}else if(messageCode=='YNSFXDTSJ'){
            		vm.currPatientInfo.ynsfxdtsj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}else if(messageCode=='YNSFXDTQZSJ'){
            		vm.currPatientInfo.ynsfxdtqzsj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}else if(messageCode=='KXXBYWGYSJ'){
            		vm.currPatientInfo.kxxbywgysj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}else if(messageCode=='DSTGSJ'){
            		vm.currPatientInfo.dstgsj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}else if(messageCode=='JGDBBGSJ'){
            		vm.currPatientInfo.jgdbbgsj = publicFun.timeFormat(msg.time, 'yyyy-MM-dd hh:mm:ss');
            	}
            }

        } else {
            $.each(vm.patientList, function (key, patient) {
                if (patient.emgSeq === msg.emgSeq) {
                    patient.hasUpdated = true;
                }
            });
        }
	}

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
            width:500,
            height:380,
            modal:true,
            title:'知情同意书'
        });
        $('#dg').datagrid({
                striped: true,
                data:[
                    // {code:'1030',name:'知情选择'},
                    // {code:'1029',name:'患者授权书'},
                    // {code:'1004',name:'病危(重)通知书'},
                    // {code:'1020',name:'心导管诊疗知情同意书'},
                    // {code:'1012',name:'静脉溶栓治疗同意书'},
                    // {code:'1015',name:'气管插管和器械通气知情同意书'},
                    // {code:'1024',name:'造影剂使用知情同意书'},
                    // {code:'1040',name:'临时起搏器植入术谈话'},
                    // {code:'1034',name:'血管内介入治疗知情同意书'},
                    // {code:'1013',name:'拒绝或放弃医学治疗告知书'},
                    // {code:'1027',name:'自动出院或转院告知书'},
                    // {code:'TEMP10000000', name:'测试用'}

                    {code:'TEMP10000009',name:'知情选择'},
                    {code:'TEMP10000010',name:'患者授权书'},
                    {code:'TEMP10000013',name:'病危(重)通知书'},
                    {code:'TEMP10000002',name:'心导管诊疗知情同意书'},
                    {code:'TEMP10000011',name:'静脉溶栓治疗同意书'},
                    {code:'TEMP10000003',name:'气管插管和器械通气知情同意书'},
                    {code:'TEMP10000004',name:'造影剂使用知情同意书'},
                    {code:'TEMP10000006',name:'临时起搏器植入术谈话'},
                    {code:'TEMP10000012',name:'血管内介入治疗知情同意书'},
                    {code:'TEMP10000014',name:'拒绝或放弃医学治疗告知书'},
                    {code:'TEMP10000005',name:'自动出院或转院告知书'},
                    {code:'TEMP10000000',name:'测试用'},
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
                    {field:'code',title:'模板号',width:150,styler:function (value,row,index) {
                            return 'font-weight:bold';
                        }},
                    {field:'name',title:'名称',width:350},
                ]],
                onDblClickRow: function (rowIndex,rowData) {
                    // console.log("++++++++++++");
                    // console.log(rowData);

                    if(tempIsFromTiny(rowData.code)){
                        var url = '${baseurl}zyyconsent/toXtPageEdit.do?tempno=' +  rowData.code + '&tempname=' + rowData.name
                            + '&refseqno=' + vm.currPatientInfo.emgSeq + '&cstNam=' + vm.currPatientInfo.cstNam;
                        url = encodeURI(url);
                        // alert(url);
                    }
                    else{
                        var url = '${baseurl}zyyconsent/ConsentInfByTempno.do?tempno='+rowData.code+'&tempname='+rowData.name+'&refseqno='+vm.currPatientInfo.emgSeq;
                    }
                    window.top.addTab(rowData.name, url, 'icon icon-emergency-record');
                }
            });
    }

    //显示测试按钮
    function trigger(){
        vm.showBtn = !vm.showBtn;
    }
    //*************测试按钮**************
    /*
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

            }
        });
    }
    
    
    function getXhyData() {
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
    */
    //分页
    function setPagination() {
        $('#pp').pagination({
            total:vm.pageInfo.total,
            pageSize:vm.pageInfo.pageSize,
            loading: true,
            pageNumber: vm.pageInfo.pageNumber,
            pageList: [5,10,15],
            onSelectPage:function(pageNumber, pageSize){
                $(this).pagination('loading');
                vm.pageInfo.pageNumber = pageNumber
                vm.pageInfo.pageSize = pageSize
                getPatients()
                $(this).pagination('loaded');
            },
        });
        $('#pp').pagination('loaded');
    }

    $(function () {
        getPatients();
        websocketConnect();
        validateNodeId();
    });
    function reload() {
        // console.log('刷新局部');
        getPatients();
    }
</script>
</body>
</html>