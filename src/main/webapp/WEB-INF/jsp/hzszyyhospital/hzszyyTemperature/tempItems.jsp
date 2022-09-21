<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>生命体征一览表</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/vitalSigns.css?090">
    <script>
        var _thisSeq = "${temperatureChartSeq}";
    </script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body ms-controller="tempItems" class="tempItems">
    <form id="tempItemsform" action="${baseurl}zyytpct/submitzyytpct.do" method="post">
    <input type="text" name="hspTpctInfCustom.emgSeq" value="${emgSeq}" class="hidden">
    <input type="text" name="hspTpctInfCustom.temperatureChartSeq" ms-duplex-string="getMsg.temperatureChartSeq" class="hidden">
    <div class="itemsWrapper">
        <label> 
            <label class="normal-labtitle">
            录入时间：
            </label>
            <select id="OrderTime" ms-duplex-string="getMsg.OnTime" ms-attr-disabled="getMsg.tpctDateflg=='1' " onchange="getAjaxVal('typea')"> 
                <!-- <option ms-repeat="getMsgList.timeList" ms-attr-value="el.info">{{el.info}}</option> -->
                <option value="02">02</option>
                <option value="06">06</option>
                <option value="10">10</option>
                <option value="14">14</option>
                <option value="18">18</option>
                <option value="22">22</option>
            </select>
            <label ms-attr-for="1" class="checklabel">
                <input type="text" class="hidden" name="hspTpctInfCustom.tpctDateflg" ms-duplex-string="getMsg.tpctDateflg">
                <input ms-attr-id="1" type="checkbox" ms-attr-checked="getMsg.tpctDateflg=='1' " ms-click="toggleCustom('tpctDateflg')"> 其他
            </label>
            <input ms-attr-disabled="getMsg.tpctDateflg=='0' " id="otherTime" class="Wdate input-date" type="text" onclick="WdatePicker({dateFmt:'HH:mm'})" onchange="getAjaxVal('typec')">
            <input type="text" class="hidden" ms-duplex-string="getMsg.enteringDatString" name="hspTpctInfCustom.enteringDatString">
        </label>
        <ul class="content-ul">
            <li>
                <p class="subtitle">
                    <span class="span-left">生命体征</span>
                </p>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    体温(℃)：
                </label>
                <span class="span-wrapper">                             
                    <select class="Signsel" ms-duplex-string="getMsg.tpctTwCod" name="hspTpctInfCustom.tpctTwCod">
                        <option ms-repeat="getMsgList.TempretureList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctTw" ms-duplex-string="getMsg.tpctTwU">
                    <input ms-attr-disabled="getMsg.tpctTwCod == '请假'|| getMsg.tpctTwCod == '外出'|| getMsg.tpctTwCod == '不升'" type="text" ms-duplex-string="getMsg.tpctTw" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctTw',1,100)">
                </span>
                <span>降温后：
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctJwh" ms-duplex-string="getMsg.tpctJwhU">
                    <input ms-attr-disabled="getMsg.tpctTwCod == '请假'|| getMsg.tpctTwCod == '外出'|| getMsg.tpctTwCod == '不升'" type="text" ms-duplex-string="getMsg.tpctJwh" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctJwh',1,100)">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    脉搏(次/分)：
                </label>
                <span class="span-wrapper">
                	<select class="Signsel"  ms-duplex-string="getMsg.tpctMbCod" name="hspTpctInfCustom.tpctMbCod">
                        <option ms-repeat="getMsgList.maiboList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctMb"  ms-duplex-string="getMsg.tpctMbU">
                    <input type="text"  ms-duplex-string="getMsg.tpctMb"  maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctMb')">
                </span>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    呼吸(次/分)：
                </label>
                <span class="span-wrapper">                             
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctHxCod" name="hspTpctInfCustom.tpctHxCod">
                        <option ms-repeat="getMsgList.huxiList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctHx"  ms-duplex-string="getMsg.tpctHxU">
                    <input type="text" ms-duplex-string="getMsg.tpctHx" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctHx')">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    心率(次/分)：
                </label>
                <span class="span-wrapper">                               
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctXlCod" name="hspTpctInfCustom.tpctXlCod">
                        <option ms-repeat="getMsgList.maiboList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctXl"  ms-duplex-string="getMsg.tpctXlU">                           
                    <input type="text" ms-duplex-string="getMsg.tpctXl" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctXl')">
                </span>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    血压(mmHg)：
                </label>
                <span class="span-wrapper">                             
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctXyCod" name="hspTpctInfCustom.tpctXyCod">
                        <option ms-repeat="getMsgList.xueyaList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctXyDown"  ms-duplex-string="getMsg.tpctXyDownU">
                    <input ms-attr-disabled="getMsg.tpctXyCod=='测不出' " type="text" name="hspTpctInfCustom.tpctXyUp" ms-duplex-string="getMsg.tpctXyUp"  maxlength="4" placeholder="舒张压" class="Signinput" ms-keyup="onlyNum('tpctXyUp')"> / <input ms-attr-disabled="getMsg.tpctXyCod=='测不出' " type="text" ms-duplex-string="getMsg.tpctXyDown"  maxlength="4" placeholder="收缩压" class="Signinput" ms-keyup="onlyNum('tpctXyDown')">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    疼痛评分(分)：
                </label>
                <span class="span-wrapper"> 
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctTtpf"  ms-duplex-string="getMsg.tpctTtpfU">                            
                    <input type="text" ms-duplex-string="getMsg.tpctTtpf"  maxlength="2" class="Signinput" ms-keyup="onlyNum('tpctTtpf',0,11)">
                   <!--  降痛后 <input type="text" ms-duplex-string="getMsg.tpctJth" maxlength="2" class="Signinput" ms-keyup="onlyNum('tpctJth',0,11)">
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctJth"  ms-duplex-string="getMsg.tpctJthU">    -->
                </span>
            </li>
            <li>
                <p class="subtitle">
                    <span class="span-left">出入量</span>
                </p>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    大便(次)：
                </label>
                <span class="span-wrapper">                             
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctDbCod" name="hspTpctInfCustom.tpctDbCod">
                        <option ms-repeat="getMsgList.dabianList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctDbPt" ms-duplex-string="getMsg.tpctDbPtU">
                    <input type="text" ms-attr-disabled="getMsg.tpctDbCod=='失禁' || getMsg.tpctDbCod=='人工肛门' " ms-duplex-string="getMsg.tpctDbPt" class="Signinput" ms-keyup="onlyNum('tpctDbPt')">
                    <span ms-visible="getMsg.tpctDbCod == '灌肠' ">/<input type="text" ms-duplex-string="getMsg.tpctDbGc" class="Signinput" ms-keyup="onlyNum('tpctDbGc')">E</span>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctDbGc"  ms-duplex-string="getMsg.tpctDbGcU">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    尿量(ml)：
                </label>
                <span class="span-wrapper"> 
                    <select  ms-duplex-string="getMsg.tpctNlFlg" name="hspTpctInfCustom.tpctNlFlg">
                        <option ms-repeat="getMsgList.nlTimeList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                   <!-- <select class="Signsel"  ms-duplex-string="getMsg.tpctNlCod" name="hspTpctInfCustom.tpctNlCod">
                          <option ms-repeat="getMsgList.urinateList" ms-attr-value="el.info">{{el.info}}</option>
                     </select> -->
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctNl"  ms-duplex-string="getMsg.tpctNlU">                          
                    <input type="text" ms-attr-disabled="getMsg.tpctNlCod=='失禁' || getMsg.tpctNlCod=='留置尿管' " ms-duplex-string="getMsg.tpctNl" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctNl')">
                </span>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    入量(ml)：
                </label>
                <select  ms-duplex-string="getMsg.tpctRlFlg" name="hspTpctInfCustom.tpctRlFlg">
                    <option ms-repeat="getMsgList.nlTimeList" ms-attr-value="el.info">{{el.info}}</option>
                </select>
                <span class="span-wrapper"> 
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctRl"  ms-duplex-string="getMsg.tpctRlU">                              
                    <input type="text" ms-duplex-string="getMsg.tpctRl" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctRl')">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    出量(ml)：
                </label>
                <select  ms-duplex-string="getMsg.tpctClFlg" name="hspTpctInfCustom.tpctClFlg">
                    <option ms-repeat="getMsgList.nlTimeList" ms-attr-value="el.info">{{el.info}}</option>
                </select>
                <span class="span-wrapper"> 
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctCl"  ms-duplex-string="getMsg.tpctClU">                              
                    <input type="text" ms-duplex-string="getMsg.tpctCl" maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctCl')">
                </span>
            </li>
            <li>
                <p class="subtitle">
                    <span class="span-left">其他</span>
                </p>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    体重(kg)：
                </label>
                <span class="span-wrapper">                             
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctTzCod" name="hspTpctInfCustom.tpctTzCod">
                        <option ms-repeat="getMsgList.tizhongList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctTz"  ms-duplex-string="getMsg.tpctTzU"> 
                    <input ms-attr-disabled="getMsg.tpctTzCod=='卧床'|| getMsg.tpctTzCod=='平车'|| getMsg.tpctTzCod=='轮椅'" type="text" ms-duplex-string="getMsg.tpctTz"  maxlength="4" class="Signinput" ms-keyup="onlyNum('tpctTz', 1, 600)">
                </span>
            </li>
             <li class="basicli fourPartli">
                <label class="normal-labtitle">
             SPO2(%)：
                </label>
                <span class="span-wrapper">                             
                    <input type="text" ms-duplex-string="getMsg.tpctGmyw" name="hspTpctInfCustom.tpctGmyw">
                </span>
            </li> 
            <li class="basicli">
                <label class="normal-labtitle xtCod-labtitle">
                    血糖(mmol/L)：
                </label>
                <span class="span-wrapper">  
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctXtCod" name="hspTpctInfCustom.tpctXtCod">
                      <option value="" selected="selected"></option>
                      <option value="0">随机血糖</option>
                      <option value="1">空腹血糖</option>
                      <option value="2">餐前血糖</option>
                      <option value="3">餐后2h血糖</option>
                      <option value="4">睡前血糖</option>
                    </select>
                    <select ms-duplex-string="getMsg.tpctXtFlg" name="hspTpctInfCustom.tpctXtFlg" class="Signinput">
                      <option value="1" selected="selected"></option>
                      <option value="2">LO</option>
                      <option value="3">HI</option>
                      <option value="4">拒测</option>
                    </select>
                    <input type="text" ms-duplex-string="getMsg.tpctXt" name="hspTpctInfCustom.tpctXt" ms-attr-disabled="getMsg.tpctXtFlg==2 || getMsg.tpctXtFlg==3 || getMsg.tpctXtFlg==4" 
                    maxlength="5" class="Signinput" ms-keyup="onlyNum('tpctXt',1,99.9)">
                </span>
            </li>
            
            <li>
                <p class="subtitle">
                    <span class="span-left">自定义</span>
                </p>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    <select class="rightsel"  ms-duplex-string="getMsg.tpctZdyType1" name="hspTpctInfCustom.tpctZdyType1">
                        <option ms-repeat="getMsgList.custom1List" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </label>
                <span class="span-wrapper">    
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctZdyValue1" ms-duplex-string="getMsg.tpctZdyValue1U">                          
                    <input type="text"  ms-duplex-string="getMsg.tpctZdyValue1" ms-keyup="onlyNum('tpctZdyValue1')">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    <select class="rightsel"  ms-duplex-string="getMsg.tpctZdyType2" name="hspTpctInfCustom.tpctZdyType2">
                        <option ms-repeat="getMsgList.custom2List" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </label>
                <span class="span-wrapper">   
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctZdyValue2" ms-duplex-string="getMsg.tpctZdyValue2U">                           
                    <input type="text"  ms-duplex-string="getMsg.tpctZdyValue2" ms-keyup="onlyNum('tpctZdyValue2')">
                </span>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    <select class="rightsel"  ms-duplex-string="getMsg.tpctZdyType3" name="hspTpctInfCustom.tpctZdyType3">
                        <option ms-repeat="getMsgList.custom3List" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </label>
                <span class="span-wrapper">    
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctZdyValue3" ms-duplex-string="getMsg.tpctZdyValue3U">                         
                    <input type="text"  ms-duplex-string="getMsg.tpctZdyValue3" ms-keyup="onlyNum('tpctZdyValue3')">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    <select class="rightsel"  ms-duplex-string="getMsg.tpctZdyType4" name="hspTpctInfCustom.tpctZdyType4">
                        <option ms-repeat="getMsgList.custom4List" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </label>
                <span class="span-wrapper">    
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctZdyValue4"  ms-duplex-string="getMsg.tpctZdyValue4U">                          
                    <input type="text"  ms-duplex-string="getMsg.tpctZdyValue4" ms-keyup="onlyNum('tpctZdyValue4')">
                </span>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    <select class="rightsel"  ms-duplex-string="getMsg.tpctZdyType5" name="hspTpctInfCustom.tpctZdyType5">
                        <option ms-repeat="getMsgList.custom5List" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </label>
                <span class="span-wrapper"> 
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctZdyValue5" ms-duplex-string="getMsg.tpctZdyValue5U">                             
                    <input type="text"  ms-duplex-string="getMsg.tpctZdyValue5" ms-keyup="onlyNum('getMsg','tpctZdyValue5')">
                </span>
            </li>
            <li class="basicli fourPartli">
                <label class="normal-labtitle">
                    <select class="rightsel"  ms-duplex-string="getMsg.tpctZdyType6" name="hspTpctInfCustom.tpctZdyType6">
                        <option ms-repeat="getMsgList.custom6List" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </label>
                <span class="span-wrapper">    
                    <input type="text" class="hidden" name="hspTpctInfCustom.tpctZdyValue6"  ms-duplex-string="getMsg.tpctZdyValue6U">                          
                    <input type="text"  ms-duplex-string="getMsg.tpctZdyValue6" ms-keyup="onlyNum('tpctZdyValue6')">
                </span>
            </li>
            <li>
                <p class="subtitle">
                    <span class="span-left">病人事件</span>
                </p>
            </li>
            <li class="basicli sixPartli">
                <label class="normal-labtitle">
                    事件名称：
                </label>
                <span class="span-wrapper">                             
                    <select class="Signsel"  ms-duplex-string="getMsg.tpctSjmcCod" name="hspTpctInfCustom.tpctSjmcCod">
                        <option ms-repeat="getMsgList.tpctSjmcCodList" ms-attr-value="el.info">{{el.info}}</option>
                    </select>
                </span>
            </li>
            <li class="hidden"><span name="hspTpctInfCustom.zdytzString" ms-duplex-string="getMsg.zdytzString"></span></li>
        </ul>
        <div class="common_btnGrp">
            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="saveMsg()">确定</a>
            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.parent.closemodalwindow()">关闭</a>
        </div>
    </div>
    </form>
    <script type="text/javascript">
        var timesList = [{infocode: '1', info: '02' }, { infocode: '2', info: '06' }, { infocode: '3', info: '10' }, { infocode: '4', info: '14' }, { infocode: '5', info: '18' }, { infocode: '6', info: '22' }],
            tempretureList =  [{infocode: '1', info: '耳温' }, { infocode: '2', info: '腋温' }, { infocode: '3', info: '口温' }, { infocode: '4', info: '肛温' }, { infocode: '5', info: '请假' }, { infocode: '6', info: '外出' }, { infocode: '7', info: '不升' }],
            shitList =  [{infocode: '', info: '' },{infocode: '1', info: '灌肠' }, { infocode: '5', info: '失禁' }, { infocode: '6', info: '人工肛门' }],
            customList = [{infocode: '', info: '' },{infocode: '1', info: '腹腔引流(ml)', unit:'ml' }, { infocode: '2', info: '胃肠减压(ml)',unit:'ml'  }, { infocode: '3', info: '胃管引流(ml)', unit:'ml' }, { infocode: '4', info: '胸腔引流(ml)', unit:'ml' }, { infocode: '5', info: '血压3(mmhg)', unit:'mmhg' },{ infocode: '5', info: '血压4(mmhg)', unit:'mmhg' }],
            eventsList = [{infocode: '', info: '' },{infocode: '1', info: '入抢' }, { infocode: '2', info: '转入' }, { infocode: '3', info: '手术' }, { infocode: '4', info: '分娩' }, { infocode: '5', info: '出院' }, { infocode: '6', info: '死亡' }, { infocode: '7', info: '转科' } ,  { infocode: '11', info: '转院' }],
            _nlTimeList = [{infocode: '', info: '' },{infocode: '1h', info: '1h' },{infocode: '2h', info: '2h' },{infocode: '3h', info: '3h' },{infocode: '4h', info: '4h' },{infocode: '5h', info: '5h' },{infocode: '6h', info: '6h' },
                            {infocode: '7h', info: '7h' },{infocode: '7', info: '8h' },{infocode: '8', info: '9h' },{infocode: '10h', info: '10h' },{infocode: '11h', info: '11h' },{infocode: '12h', info: '12h' },
                            {infocode: '13h', info: '13h' },{infocode: '14h', info: '14h' },{infocode: '15h', info: '15h' },{infocode: '16h', info: '16h' },{infocode: '17h', info: '17h' },{infocode: '18h', info: '18h' },
                            {infocode: '19h', info: '19h' },{infocode: '20h', info: '20h' },{infocode: '21h', info: '21h' },{infocode: '22h', info: '22h' },{infocode: '23h', info: '23h' },{infocode: '24h', info: '24h' },]
        
        var _xtCodList = publicFun.getDict('XT_COD');
        var vm = avalon.define({
            $id:"tempItems",
            getMsg: {
                temperatureChartSeq:'',//id
                OnTime:'',//时间
                enteringDatString:'',//录入时间
                tpctDateflg: '0',//是否选择了其他时间
                tpctTwCod: '耳温',
                tpctTw:'',//温度
                tpctTwU:'',//有单位的温度
                tpctJwh:'',//降温
                tpctJwhU:'',//有单位的降温
                tpctMbCod:'',
                tpctMb:'',//脉搏
                tpctMbU:'',//有单位的脉搏
                tpctHxCod: '',
                tpctHx:'',//呼吸
                tpctHxU:'',//有单位的呼吸
                tpctXlCod:'',
                tpctXl:'',//心率
                tpctXlU:'',
                tpctXyUp: '', //上压
                tpctXyDown:'',//下压
                tpctXyDownU:'',//有单位的下压
                tpctXyCod:'',
                tpctTtpf:'',//疼痛评分
                tpctTtpfU:'',
                tpctJth:'',//降痛后的评分
                tpctJthU:'',
                tpctDbCod:'',
                tpctDbPt:'',//普通
                tpctDbPtU:'',//有单位的普通
                tpctDbGc:'',//灌肠
                tpctDbGcU:'',//有单位的灌肠
                tpctNlCod:'',//尿量
                tpctNl:'',
                tpctNlU:'',
                tpctNlFlg:'',
                tpctRl:'',//入量
                tpctRlU:'',
                tpctCl:'',//出量
                tpctClU:'',
                tpctTz:'',//体重
                tpctTzU:'',
                tpctTzCod:'',
                tpctSg:'',//身高
                tpctSgU:'',
                tpctGmyw:'',//过敏药物
                tpctZdyType1:'',//自定义1
                tpctZdyValue1:'',//自定义1
                tpctZdyValue1U:'',
                tpctZdyType2:'',//自定义2
                tpctZdyValue2:'',//自定义2
                tpctZdyValue2U:'',
                tpctZdyType3:'',//自定义3
                tpctZdyValue3:'',//自定义3
                tpctZdyValue3U:'',
                tpctZdyType4:'',//自定义4
                tpctZdyValue4:'',//自定义4
                tpctZdyValue4U:'',
                tpctZdyType5:'',//自定义5
                tpctZdyValue5:'',//自定义5
                tpctZdyValue5U:'',
                tpctZdyType6:'',//自定义6
                tpctZdyValue6:'',//自定义6
                tpctZdyValue6U:'',
                tpctSjmcCod:'', //事件名称
                tpctXtCod:'',//血糖相关tpctXtCod
                tpctXtFlg:'',
                tpctXt:'',
                tpctRlFlg:'',// 入量  
                tpctClFlg:'',// 出量
            },
            getMsgList: {
                timeList: timesList,
                TempretureList: tempretureList,
                maiboList: [{ infocode: '', info: '' },{ infocode: '1', info: '短绌' }],
                huxiList: [{ infocode: '', info: '' },{ infocode: '1', info: '机械通气' }],
                xueyaList: [{ infocode: '', info: '' },{ infocode: '1', info: '测不出' }],
                dabianList: shitList,
                tizhongList: [{ infocode: '', info: '' },{ infocode: '1', info: '卧床' },{ infocode: '2', info: '平车' },{ infocode: '3', info: '轮椅' }],
                custom1List: customList,
                custom2List: customList,
                custom3List: customList,
                custom4List: customList,
                custom5List: customList,
                custom6List: customList,
                tpctSjmcCodList: eventsList,
                urinateList: [{ infocode: '', info: '' },{ infocode: '1', info: '失禁' },{ infocode: '2', info: '留置尿管' }],
                xtCodList: _xtCodList,
                nlTimeList: _nlTimeList
            },
            toggleCustom: function(name) {
                vm.getMsg[name] = vm.getMsg[name] == '1' ? '0' : '1';
            },
            /**
             * @@onlyNum 限制只能输入数字
             * @param  {string}     objName                 url
             */
             onlyNum: function(attr, step, max) { //限定只能输入数字
                if (max && vm.getMsg[attr] > max) {
                    var length = vm.getMsg[attr].length;
                    vm.getMsg[attr] = vm.getMsg[attr].substring(0, length - 1);
                }
                if (step) {
                    vm.getMsg[attr] = vm.getMsg[attr].replace(/[^\d.]/g, "").replace(/^\./g, "").replace(/\.{2,}/g, "").replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
                    var testStr = vm.getMsg[attr],
                        testStrList = testStr.split(".");
                    if (testStrList.length > 1) {
                        if (testStrList[1].length > step) {
                            vm.getMsg[attr] = parseFloat(testStr).toFixed(parseInt(step)).toString();
                        }
                    }
                } else {
                    vm.getMsg[attr] = vm.getMsg[attr].replace(/[\D]/g, "");
                }
            }
        });

        /**
         * @监听
         */
        vm.getMsg.$watch('tpctDateflg', function(newVal, oldVal) {
            if(newVal == 0) {
                $('#otherTime').val('');
            }
            if(newVal == 1) {
                vm.getMsg.OnTime = '';
            }
        });
        vm.getMsg.$watch('tpctXtFlg', function (newVal, oldVal) {
            if (newVal == 2 || newVal == 3) {
                vm.getMsg.tpctXt = '';
            }
        });
        vm.getMsg.$watch('tpctTwCod', function(newVal, oldVal) {
            if(newVal == '不升' || newVal == '请假' || newVal == '外出'  ) {
                vm.getMsg.tpctTw = '';
                vm.getMsg.tpctJwh = ''
            }
        });
        vm.getMsg.$watch('tpctDbCod', function(newVal, oldVal) {
            if(newVal != '灌肠') {
                if(newVal == '失禁' || newVal == '人工肛门'){
                    vm.getMsg.tpctDbPt = '';
                }
                vm.getMsg.tpctDbGc = '';
            }
        });
        vm.getMsg.$watch('tpctNlCod', function(newVal, oldVal) {
            if(newVal == '留置尿管' || newVal == '失禁') {
                vm.getMsg.tpctNl = '';
            }
        });
        vm.getMsg.$watch('tpctTzCod', function(newVal, oldVal) {
            if(newVal == '卧床') {
                vm.getMsg.tpctTz = '';
            }
        });
        vm.getMsg.$watch('tpctXyCod', function(newVal, oldVal) {
            if(newVal == '测不出') {
                vm.getMsg.tpctXyUp = '';
                vm.getMsg.tpctXyDown = '';
            }
        });

        function dateToGMT(strDate){
            var dateStr = strDate.split(" ");  
            var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
            var date = new Date(Date.parse(strGMT));
            return date;
        }
        
        /**
         * 获取Ajax
         **/
        function getAjaxVal(type) {
            if(type != 'typed'){
                GetTotalTime();
            }
            if(type == 'typea' || type == 'typec' || type == 'typed' || type == 'typef') {
                var dataParm = {
                    "hspTpctInfCustom.emgSeq": '${emgSeq}',
                    "hspTpctInfCustom.enteringDatString": vm.getMsg.enteringDatString
                }
            }else if(type == 'typeb'){
                var dataParm = {
                    "hspTpctInfCustom.temperatureChartSeq": _thisSeq
                }
            }
            $.ajax({
                url: '${baseurl}zyytpct/findzyytpct.do?',
                type: 'POST',
                async: true,
                data:dataParm,
                dataType: 'json',
                success: function(res) {
                    var _isHasVal = 0 ;
                    if(type == 'typec'){
                        res['tpctDateflg'] = '1';
                    }
                    for (var key in res) {
                        if(res['tpctTwCod'] == '' || res['tpctTwCod'] == null) {
                            res['tpctTwCod'] = '耳温'
                        }
                        // if(key!='enteringDatString' && key != 'tpctDateflg' && key != 'tpctTwCod'){
                        //     if(res[key] != null && res[key] != '') {
                        //         _isHasVal += 1;
                        //     }
                        // }
                        if (vm.getMsg.hasOwnProperty(key)) {
                        	if (key === 'tpctDateflg') {
                        		if (res[key] !== '' && res[key] != null) {
                        			vm.getMsg[key] = res[key]|| '';
                        		}
                        	} else {
                                vm.getMsg[key] = res[key]|| '';
                        	}
                        }
                        if(key === 'tpctDateflg') {
                            if(res[key] === '0') {
                                vm.getMsg.OnTime = res['enteringDatString'].substring(11,13);
                            } else if(res[key] === '1'){
                                $('#otherTime').val(res['enteringDatString'].substring(11,16))
                            }
                        }
                    }
                    if(res.enteringDat != null){
                        var _enteringDat = publicFun.timeFormat(res.enteringDat, 'yyyy/MM/dd hh:mm:ss');
                        var _entertingTime = _enteringDat.substring(11,13);
                        var _timeZD = _enteringDat.substring(14,16);
                        if(_timeZD == '00' &&( _entertingTime == '02' || _entertingTime == '06' || _entertingTime == '10' || _entertingTime == '14'||  _entertingTime == '18' || _entertingTime == '22')){
                            vm.getMsg.tpctDateflg = '0';
                            vm.getMsg.OnTime = _entertingTime
                        }else{
                            vm.getMsg.tpctDateflg = '1';
                            $('#otherTime').val(_enteringDat.substring(11,16))
                        }
                    }
                    // if(type == 'typea' || type == 'typec'){
                    //     if(GetTotalString() != '' && GetTotalString() != 'undefined'){
                    //         if( _isHasVal == 0) {
                    //             for (var key in res) {
                    //                 if(vm.getMsg[key] == '' || vm.getMsg[key] == null) {
                    //                     if (vm.getMsg.hasOwnProperty(key)) {
                    //                         vm.getMsg[key] = res[key]|| '';
                    //                     }
                    //                 }
                    //             }
                    //         }
                    //     }else{
                    //         for (var key in res) {
                    //             if (vm.getMsg.hasOwnProperty(key)) {
                    //                 vm.getMsg[key] = res[key]|| '';
                    //             }
                    //         }
                    //     }
                    // }else if(type == 'typeb'){
                    //     for (var key in res) {
                    //         if (vm.getMsg.hasOwnProperty(key)) {
                    //             vm.getMsg[key] = res[key]|| '';
                    //         }
                    //     }
                    // }
                }
            })
        }
        
        /**
         * 拼接时间
         **/
        function GetTotalTime() {
            var _date = $('#mainWrapper',parent.document).find('#queryDate').val(); //日期
            if($('#otherTime').val() != '' && vm.getMsg.tpctDateflg == '1'){
                vm.getMsg.enteringDatString =  _date + ' ' + $('#otherTime').val()+':00';
            }
            if($('#OrderTime').val() != '' && (vm.getMsg.tpctDateflg == '0')){
                vm.getMsg.enteringDatString = _date + ' ' +  $('#OrderTime').val() + ':00:00'; 
            }
        }

        /**
         * 验证有无填写
         **/
        function Validate(itemA,itemB,msg) {
            if(itemA != '' && (itemB =='' || itemB == null)) {
                publicFun.alert(msg);
                return false
            }
        }
        function isValidAll() {
            if(vm.getMsg.tpctDateflg == 1 && $('#otherTime').val() == '') {
                publicFun.alert("请输入其他录入时间");
                return false
            }
            if(vm.getMsg.OnTime == '' && $('#otherTime').val() == '') {
                publicFun.alert("请输入录入时间");
                return false
            }
            if(vm.getMsg.tpctXyUp != '' && vm.getMsg.tpctXyDown == '') {
                publicFun.alert("请输入收缩压");
                return false
            }
            if(vm.getMsg.tpctXyUp == '' && vm.getMsg.tpctXyDown != '') {
                publicFun.alert("请输入舒张压");
                return false
            }
            if(Validate(vm.getMsg.tpctZdyValue1,vm.getMsg.tpctZdyType1,'请选择第一个自定义选项') == false) {
                return false
            }
            if(Validate(vm.getMsg.tpctZdyType1,vm.getMsg.tpctZdyValue1,'请输入第一个自定义框的值') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyValue2,vm.getMsg.tpctZdyType2,'请选择第二个自定义选项') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyType2,vm.getMsg.tpctZdyValue2,'请输入第二个自定义框的值') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyValue3,vm.getMsg.tpctZdyType3,'请选择第三个自定义选项') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyType3,vm.getMsg.tpctZdyValue3,'请输入第三个自定义框的值') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyValue4,vm.getMsg.tpctZdyType4,'请选择第四个自定义选项') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyType4,vm.getMsg.tpctZdyValue4,'请输入第四个自定义框的值') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyValue5,vm.getMsg.tpctZdyType5,'请选择第五个自定义选项') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyType5,vm.getMsg.tpctZdyValue5,'请输入第五个自定义框的值') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyValue6,vm.getMsg.tpctZdyType6,'请选择第六个自定义选项') == false){
                return false
            }
            if(Validate(vm.getMsg.tpctZdyType6,vm.getMsg.tpctZdyValue6,'请输入第六个自定义框的值') == false){
                return false
            }
        }
        /**
         * 添加单位
         **/
        function addUnit(item,unit){
            if(item != '') {
                item = item + unit;
            }
            return item;
        }

        /**
         * 拼接填写页面的值 -- 以此来判断有无填写
         **/
        function GetTotalString() {
            var string = '';
            if(vm.getMsg.tpctTwCod != '请假' && vm.getMsg.tpctTwCod != '外出' && vm.getMsg.tpctTwCod != '不升' ){
                string += vm.getMsg.tpctTw;
                string += vm.getMsg.tpctJwh;
            }else{
                if(vm.getMsg.tpctTwCod != '耳温') {
                    string += '1';
                }
            }
      
            if(vm.getMsg.tpctNlCod !='留置尿管' && vm.getMsg.tpctNlCod !='失禁'){
                string += vm.getMsg.tpctNl;
            }else if(vm.getMsg.tpctNlCod =='留置尿管' || vm.getMsg.tpctNlCod =='失禁'){
                string += '1';
            }

            if(vm.getMsg.tpctDbCod !='灌肠'){
                if(vm.getMsg.tpctDbCod == '失禁' || vm.getMsg.tpctDbCod == '人工肛门'){
                    string += '1';
                }else{
                    string += vm.getMsg.tpctDbPt;
                }
            }else if(vm.getMsg.tpctDbCod =='灌肠'){
                string += vm.getMsg.tpctDbGc;
                string += vm.getMsg.tpctDbPt;
            }

            var _list = ['tpctMb','tpctHxCod','tpctHx','tpctXl','tpctTtpf','tpctJth','tpctRl','tpctCl','tpctSg','tpctGmyw','tpctZdyType1','tpctZdyType2','tpctZdyType3','tpctZdyType4','tpctZdyType5','tpctZdyType6','tpctSjmcCod'];
            $.each(_list,function(idx,val){
                string += vm.getMsg[val];
            })
            if(vm.getMsg.tpctXyCod != '测不出') {
                string += vm.getMsg.tpctXyUp;
                string += vm.getMsg.tpctXyDown;
            }else{
                string += '1';  
            }
            if(vm.getMsg.tpctTzCod !='卧床') {
                string += vm.getMsg.tpctTz;
            }else{
                string += '1';  
            }
            return string;
        }
        
        /**
         * 保存
         **/
        function saveMsg() {
            if(isValidAll() == false){
                return
            }
            GetTotalTime();
            if(GetTotalString() == '' || GetTotalString() == 'undefined'){
                publicFun.alert('请填写信息之后再保存');
                return
            }
            vm.getMsg.tpctTwU = addUnit(vm.getMsg.tpctTw,'℃');
            vm.getMsg.tpctJwhU = addUnit(vm.getMsg.tpctJwh,'℃');
            vm.getMsg.tpctMbU = addUnit(vm.getMsg.tpctMb,'次/分');
            vm.getMsg.tpctHxU = addUnit(vm.getMsg.tpctHx,'次/分');
            vm.getMsg.tpctXlU = addUnit(vm.getMsg.tpctXl,'次/分');
            vm.getMsg.tpctXyDownU = addUnit(vm.getMsg.tpctXyDown,'mmHg');
            vm.getMsg.tpctDbPtU = addUnit(vm.getMsg.tpctDbPt,'次');
            vm.getMsg.tpctDbGcU = addUnit(vm.getMsg.tpctDbGc,'次');
            vm.getMsg.tpctNlU = addUnit(vm.getMsg.tpctNl,'ml');
            vm.getMsg.tpctRlU = addUnit(vm.getMsg.tpctRl,'ml');
            vm.getMsg.tpctClU = addUnit(vm.getMsg.tpctCl,'ml');
            vm.getMsg.tpctTzU = addUnit(vm.getMsg.tpctTz,'kg');
            vm.getMsg.tpctSgU = addUnit(vm.getMsg.tpctSg,'cm');
            vm.getMsg.tpctJthU = addUnit(vm.getMsg.tpctJth,'分');
            vm.getMsg.tpctTtpfU = addUnit(vm.getMsg.tpctTtpf,'分');
            var ListA = vm.getMsgList.custom1List,
                unitA = '';
            $.each(ListA, function(idx, val) {
                if (val['info'] == vm.getMsg.tpctZdyType1) {
                    unitA = ListA[idx].unit 
                }
            })
            vm.getMsg.tpctZdyValue1U = addUnit(vm.getMsg.tpctZdyValue1,unitA);
            var ListB = vm.getMsgList.custom2List,
                unitB = '';
            $.each(ListB, function(idx, val) {
                if (val['info'] == vm.getMsg.tpctZdyType2) {
                    unitB = ListB[idx].unit 
                }
            })
            vm.getMsg.tpctZdyValue2U = addUnit(vm.getMsg.tpctZdyValue2,unitB);
            var ListC = vm.getMsgList.custom3List,
                unitC = '';
            $.each(ListC, function(idx, val) {
                if (val['info'] == vm.getMsg.tpctZdyType3) {
                    unitC = ListC[idx].unit 
                }
            })
            vm.getMsg.tpctZdyValue3U = addUnit(vm.getMsg.tpctZdyValue3,unitC);
            var ListD = vm.getMsgList.custom4List,
                unitD = '';
            $.each(ListD, function(idx, val) {
                if (val['info'] == vm.getMsg.tpctZdyType4) {
                    unitD = ListD[idx].unit 
                }
            })
            vm.getMsg.tpctZdyValue4U = addUnit(vm.getMsg.tpctZdyValue4,unitD);
            var ListE = vm.getMsgList.custom5List,
                unitE = '';
            $.each(ListE, function(idx, val) {
                if (val['info'] == vm.getMsg.tpctZdyType5) {
                    unitE = ListE[idx].unit 
                }
            })
            vm.getMsg.tpctZdyValue5U = addUnit(vm.getMsg.tpctZdyValue5,unitE);
            var ListF = vm.getMsgList.custom6List,
                unitF = '';
            $.each(ListE, function(idx, val) {
                if (val['info'] == vm.getMsg.tpctZdyType6) {
                    unitF = ListF[idx].unit 
                }
            })
            vm.getMsg.tpctZdyValue6U = addUnit(vm.getMsg.tpctZdyValue6,unitF);
            jquerySubByFId('tempItemsform', insert_callback, null, "json");
        }
        function insert_callback(data){
            if(data.resultInfo && data.resultInfo.messageCode =='109'){
        		message_alert(data,function (){
        			window.location.href="${baseurl}first.do";
        		});
        	}else{
                message_alert(data);
                var type = data.resultInfo.type;
                if (type == 1) {
                    setTimeout(function () {
                        $(".messager-body").window('close');
                    }, 1000);
                    //$('#mainWrapper',parent.document).find('#showItemsTab').context.location.reload();
                    parent.$('#showItemsTab').datagrid('reload');
                    //setTimeout("document.location.reload()", 1000);
                    getAjaxVal('typef');
                    parent.parent.$('#dataTab').datagrid('reload');
                    if($('#rightWrapper',parent.parent.document).find('#IsIEVal').val() != -1){
                        parent.parent.SetJSONData();
                    }
                }
        	}   
        }    
        
        function getNextElement(field) {
            var form = field.form;
            for (var e = 0; e < form.elements.length; e++) {
                if (field == form.elements[e]) break
            }
            return form.elements[++e % form.elements.length]
        }
        document.onkeydown = function(evt) {
            var isie = (document.all) ? true : false;
            var key;
            var srcobj;
            // if the agent is an IE browser, it's easy to do this.
            if (isie) {
                key = event.keyCode;
                srcobj = event.srcElement;
            } else {
                key = evt.which;
                srcobj = evt.target;
            }
            if (key == 13 && srcobj.type != 'button' && srcobj.type != 'submit' && srcobj.type != 'reset' && srcobj.type != 'textarea' && srcobj.type != '') {
                if (isie) {
                    event.keyCode = 9;
                } else {
                    var el = getNextElement(evt.target);
                    if (el.className != 'hidden' && (el.type != 'checkbox' || el.type != 'radio')) {} else {
                        while (el.className == 'hidden' || el.type == 'checkbox' || el.type == 'radio') {
                            el = getNextElement(el);
                        }
                    }
                    if (!el) {
                        return false;
                    } else {
                        el.focus();
                    }
                }
            }
        };

        $(function(){
            var currentDate = $('#mainWrapper',parent.document).find('#queryDate').val(); //日期;
            var currentTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
            var _clockTimeStr = currentTime.substring(11,13);
            var _clockTimeNum = _clockTimeStr - 0;
            vm.getMsg.tpctDateflg = '0';
            if(_clockTimeNum >2 && _clockTimeNum < 6) {
                vm.getMsg.OnTime = '02';
            }else if(_clockTimeNum > 6 && _clockTimeNum < 10) {
                vm.getMsg.OnTime = '06';
            }else if(_clockTimeNum > 10 && _clockTimeNum < 14) {
                vm.getMsg.OnTime = '10';
            }else if(_clockTimeNum > 14 && _clockTimeNum < 18) {
                vm.getMsg.OnTime = '14';
            }else if(_clockTimeNum > 18 && _clockTimeNum < 22) {
                vm.getMsg.OnTime = '18';
            }else if(_clockTimeNum > 22 && _clockTimeNum < 24) {
                vm.getMsg.OnTime = '22';
            }else if(_clockTimeNum > 0 && _clockTimeNum < 2) {
                vm.getMsg.OnTime = '02';
            }else{
                vm.getMsg.OnTime = _clockTimeStr;
            }
            vm.getMsg.enteringDatString = currentDate + ' ' + vm.getMsg.OnTime + ':00:00'; 
            if(_thisSeq !=''){
                getAjaxVal('typeb') 
            }else{
                getAjaxVal('typed');
            }
        })
    </script>
</body>

</html>