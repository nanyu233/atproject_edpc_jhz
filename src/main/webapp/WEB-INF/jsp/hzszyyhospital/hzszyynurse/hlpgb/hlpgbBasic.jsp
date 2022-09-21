<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>
<body>
  <p class="hlpgbTitle">入院护理评估单</p>
  <ul class="content-ul bordered">
    <li class="sixtyli">
      <div class="scoDiv">
        <label class="labtitle">姓名：</label>
        <span class="span-undo">{{basicInfo.cstNam}}</span>
      </div>
      <div class="scoDiv">
        <label class="scoTitle">性别：</label>
        <span class="span-undo">{{basicInfo.cstSexCod}}</span>
      </div>
      <div class="scoDiv">
        <label class="scoTitle">年龄：</label>
        <span class="span-undo">{{basicInfo.cstAgeAll}}</span>
      </div>
      <div class="scoDiv">
        <label class="scoTitle">床号：</label>
        <span class="span-undo" id="_bedNum"></span>
      </div>
    </li>
    <li class="thirtyli">
      <div class="scoDiv">
        <label class="scoTitle">单位/地址：</label>
        <input type="text" class="spc-inputC" ms-duplex-string="hlpgbpatientMsg.workAddress" name="hspHlpgbCustom.workAddress"/>
      </div>
    </li>
    <li class="longSpcLi fullli">
      <div class="scoDiv">
        <label class="labtitle">电话：</label>
        <span class="span-undo">{{basicInfo.pheNbr}}</span>
      </div>
      <div class="scoDiv">
        <label class="scoTitle">病历号：</label>
        <span class="span-undo">{{basicInfo.mpi}}</span>
      </div>
      <div class="scoDiv">
        <label class="scoTitle">就诊日期：</label>
        <input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.seeDocDat"
        ms-duplex-string="hlpgbpatientMsg.seeDocDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </div>
      <div class="scoDiv">
        <label class="scoTitle"> 欠款：</label>
        <label ms-repeat="hlpgbmsgList.qkCodList" ms-attr-for="qkCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="qkCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('qkCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.qkCod" ms-duplex-string="hlpgbpatientMsg.qkCod">
      </div>
    </li>
    <li class="fullli">
      <div class="scoDiv">
        <label class="scoTitle">通知医生时间：</label>
        <input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.informDocDat"
        ms-duplex-string="hlpgbpatientMsg.informDocDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </div>
      <div class="scoDiv">
        <label class="scoTitle">到诊时间：</label>
        <input class="Wdate spcWdate" type="text" name="hspHlpgbCustom.docDat"
        ms-duplex-string="hlpgbpatientMsg.docDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </div>
      <div class="scoDiv">
        <label class="scoTitle">首诊科室：</label>
        <span class="span-undo">{{basicInfo.emgFkCod}}</span>
      </div>
      <div class="scoDiv">
        <label class="scoTitle">首诊医生：</label>
        <span class="relative">
          <input type="text" name="hspHlpgbCustom.sqlDctNbr" ms-duplex-string="hlpgbpatientMsg.sqlDctNbr">
          <!-- <div class="userList" id="userNameList"> -->
              <!-- id="username" -->
        </span>
      </div>
    </li>
    <li class="fullli">
      <label class="labtitle">
        发病地点：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.hlAddrList" ms-attr-for="hlAddr{{el.infocode}}" class="checklabel">
          <input ms-attr-id="hlAddr{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('hlAddr',$index)">
          {{el.info}}
          <input class="extraWth" type="text" ms-if="el.infocode == 3 && hlpgbpatientMsg.hlAddr == '3'" name="hspHlpgbCustom.hlAddrOther" ms-duplex-string="hlpgbpatientMsg.hlAddrOther">
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.hlAddr" ms-duplex-string="hlpgbpatientMsg.hlAddr">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        到院方式：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.arvChlCodList" ms-attr-for="arvChlCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="arvChlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('arvChlCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.arvChlCod" ms-duplex-string="hlpgbpatientMsg.arvChlCod">
        <span ms-if="hlpgbpatientMsg.arvChlCod == '5'">
          驾驶员姓名：
          <span class="relative">
            <input type="text" name="hspHlpgbCustom.abnDriver" ms-duplex-string="hlpgbpatientMsg.abnDriver"
              id="driverName" ms-keyup="cleanAbnSco()" autocomplete="off" maxlength="20">
            <ul class="userList topList" ms-visible="isShowAbnDriverList">
              <li ms-repeat="hlpgbmsgList.abnDriverList" ms-click="chooseAbnDriver(el.abnDriver)">
                {{el.abnDriver}}
              </li>
            </ul>
          </span>
          &nbsp;&nbsp;医生签名：
          <span class="relative">
            <input type="text" id="usernameB" name="hspHlpgbCustom.abnDoctor" autocomplete="off" ms-duplex-string="hlpgbpatientMsg.abnDoctor">
            <div class="userList" id="userNameBList"></div>
          </span>
        </span>
        <input class="extraWth" type="text" ms-if="hlpgbpatientMsg.arvChlCod == '9'" name="hspHlpgbCustom.abnScoNme" ms-duplex-string="hlpgbpatientMsg.abnScoNme"> 
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        陪送人员：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.cmpPsnCodList" ms-attr-for="cmpPsnCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="cmpPsnCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.cmpPsnCod"
          ms-change="arrToStr('cmpPsnCod')"> {{el.info}}
          <input type="text" ms-if="el.infocode == 8 && hlpgbhideMsg.cmpPsnCod.indexOf('8')!=-1" ms-duplex-string="hlpgbpatientMsg.psryqt" name="hspHlpgbCustom.psryqt">
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.cmpPsnCod" ms-duplex-string="hlpgbhideMsg.cmpPsnCod">
    </li>
    <li class="fullli">
      <label class="labtitle">
        院前处置：
      </label>
      <input type="text" class="maxLongInputGD" ms-duplex-string="hlpgbpatientMsg.preHospitalTreatment" name="hspHlpgbCustom.preHospitalTreatment">
    </li>
    <li class="fullli">
      <label class="labtitle">主诉症状：</label>
      <input type="text" name="hspHlpgbCustom.preDgnCod" ms-duplex-string="hlpgbpatientMsg.preDgnCod" class="maxLongInputGD">
      <!-- <div class="floatLeft m-l5" id="knowledgeDiv">
        <a class="commonbtn knowledgeBoxBtn" href="javascript:;" ms-click="openKnowledge()">知识库</a>
        <span class="middleLabel m-l5" id="measure"></span>
      </div> -->
    </li>
    <li class="fullli">
      <label class="labtitle">
        <a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod()">[查看]</a>
        诊断：
      </label>
      <div class="input readonly mainDes" id="show_text">{{hlpgbpatientMsg.jbzdDes}}</div>
      <input type="hidden" ms-duplex-string="hlpgbpatientMsg.jbzdDes">
    </li>
    <li class="fullli">
      <label class="labtitle">生命体征：</label>
      <a class="my-linkbutton btna importLink" data-options="toggle:true,plain:true" onclick="addSmtz()">[导入二次预检体征]</a>
    </li>
    <li class="fullli">
      <label class="labtitle"></label>
      <div class="scoDiv">
        <label class="scoTitle scoTitleB">体温：</label>
        <select id="tempretureSel" ms-duplex-string="hlpgbpatientMsg.tmpNbrFlg" name="hspHlpgbCustom.tmpNbrFlg" class="SignselB">
          <option value="1">耳温</option>
          <option value="2">不升</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.tmpNbrFlg == 2 || hlpgbpatientMsg.tmpNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.tmpNbr" name="hspHlpgbCustom.tmpNbr">℃
      </div>
      <div class="scoDiv">
        <label class="scoTitle">脉搏：</label>
        <select ms-duplex-string="hlpgbpatientMsg.pulseFlg" name="hspHlpgbCustom.pulseFlg" class="SignselB">
          <option value="1"></option>
          <option value="2">测不出</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.pulseFlg == 2 || hlpgbpatientMsg.pulseFlg ==3" ms-duplex-string="hlpgbpatientMsg.pulse" name="hspHlpgbCustom.pulse">次/分
      </div>
      <div class="scoDiv">
        <label class="scoTitle">呼吸：</label>
        <select id="breathSel" ms-duplex-string="hlpgbpatientMsg.breNbrFlg" name="hspHlpgbCustom.breNbrFlg" class="Signsel">
          <option value="1"></option>
          <option value="2">机械通气</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.breNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.breNbr" name="hspHlpgbCustom.breNbr">次/分
      </div>
      <div class="scoDiv">
        <label class="scoTitle">血压：</label>
        <select ms-duplex-string="hlpgbpatientMsg.sbpNbrFlg" id="SdpSel" name="hspHlpgbCustom.sbpNbrFlg" class="Signsel">
          <option value="1"></option>
          <option value="2">测不出</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.sbpNbrFlg == 2 || hlpgbpatientMsg.sbpNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.sbpUpNbr" name="hspHlpgbCustom.sbpUpNbr">/
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.sbpNbrFlg == 2 || hlpgbpatientMsg.sbpNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.sbpDownNbr" name="hspHlpgbCustom.sbpDownNbr">mmHg
      </div>
    </li>
    <li class="fullli">
      <label class="labtitle"></label>
      <div class="scoDiv">
        <label class="scoTitle scoTitleB">血氧：</label>
        <select id="xySel" ms-duplex-string="hlpgbpatientMsg.xyFlg" name="hspHlpgbCustom.xyFlg" class="SignselB">
          <option value="1"></option>
          <option value="2">测不出</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.xyFlg == 2 || hlpgbpatientMsg.xyFlg ==3" ms-duplex-string="hlpgbpatientMsg.oxyNbr" name="hspHlpgbCustom.oxyNbr">%
      </div>
      <div class="scoDiv">
        <label class="scoTitle">心率：</label>
        <select ms-duplex-string="hlpgbpatientMsg.hrtRteFlg" name="hspHlpgbCustom.hrtRteFlg" class="SignselB">
          <option value="1"></option>
          <option value="2">测不出</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.hrtRteFlg == 2 || hlpgbpatientMsg.hrtRteFlg ==3" ms-duplex-string="hlpgbpatientMsg.hrtRte" name="hspHlpgbCustom.hrtRte">次/分
      </div>
      <div class="scoDiv">
        <label class="scoTitle">血糖：</label>
        <select class="Signsel" ms-duplex-string="hlpgbpatientMsg.glsCod" name="hspHlpgbCustom.glsCod">
          <option value=""></option>
          <option ms-repeat="hlpgbmsgList.glsCodList" ms-attr-value="el.infocode">{{el.info}}</option>
        </select>
        <select id="xtSel" ms-duplex-string="hlpgbpatientMsg.pbgNbrFlg" name="hspHlpgbCustom.pbgNbrFlg" class="Signsel">
          <option value="1"></option>
          <option value="2">LO</option>
          <option value="3">HI</option>
          <option value="4">拒测</option>
        </select>
        <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.pbgNbrFlg == 2 || hlpgbpatientMsg.pbgNbrFlg ==3 || hlpgbpatientMsg.pbgNbrFlg ==4" ms-duplex-string="hlpgbpatientMsg.pbgNbr" name="hspHlpgbCustom.pbgNbr">mmol/L
      </div>
    </li>
    <li class="fullli">
      <label class="labtitle">病种：</label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.hlbzCodList" ms-attr-for="hlbzCod{{el.infocode}}" class="checklabel">
          <input type="checkbox" ms-attr-id="hlbzCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.hlbzCod"
          ms-change="arrToStr('hlbzCod')"> {{el.info}}
          <input ms-if="el.infocode == 9 && hlpgbhideMsg.hlbzCod.indexOf('9') != -1" maxlength="50" type="text" class="extraInput" name="hspHlpgbCustom.hlbzOther" ms-duplex-string="hlpgbpatientMsg.hlbzOther"/>
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.hlbzCod" ms-duplex-string="hlpgbhideMsg.hlbzCod">
      </span>
    </li>
  </ul>
    
  <!-- <div class="sub-top">
    <span class="spanLeft">
      <span class="spanTitle2">末梢血糖：</span>
      <select id="xtSel" class="Signsel" name="hspHlpgbCustom.pbgNbrFlg" onchange="checkXt()">
        <option value="1" selected="selected"></option>
        <option value="2">LO</option>
        <option value="3">HI</option>
      </select>
      <input id="xuet" type="text" maxlength="4" name="hspHlpgbCustom.pbgNbr" ms-duplex-string="hlpgbpatientMsg.pbgNbr"
        class="Signinput" ms-keyup="hlpgbonlyNum('pbgNbr',2, 100)" ms-input="hlpgbonlyNum('pbgNbr',2, 100)" 
        ms-change="hlpgbonlyNum('pbgNbr',2, 100)"> mmol/L
    </span>
  </div> -->
  <ul class="content-ul bordered">
    <p class="subtitle titleTop">
      <span class="spanTitle spanSpc">初步评估</span>
    </p>
    <li class="fullli">
      <label class="labtitle">
        气道：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.qdCodList" ms-attr-for="qdCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="qdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('qdCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.qdCod" ms-duplex-string="hlpgbpatientMsg.qdCod">
        其它：<input class="extraInput" type="text" name="hspHlpgbCustom.qdOther" ms-duplex-string="hlpgbpatientMsg.qdOther" maxlength="50">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        呼吸：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.hxCodList" ms-attr-for="hxCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="hxCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('hxCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.hxCod" ms-duplex-string="hlpgbpatientMsg.hxCod">
        其它：<input type="text" class="extraInput" name="hspHlpgbCustom.hxOther" ms-duplex-string="hlpgbpatientMsg.hxOther" maxlength="50">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        循环：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.xhCodList" ms-attr-for="xhCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="xhCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('xhCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.xhCod" ms-duplex-string="hlpgbpatientMsg.xhCod">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        出血：
      </label>
      <span class="span-wrapper">
        <label class="checklabel" ms-repeat="hlpgbmsgList.cxCodList" ms-attr-for="cxCod{{el.infocode}}">
          <input type="checkbox" ms-attr-id="cxCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.cxCod"
            ms-change="arrToStr('cxCod')"> {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.cxCod" ms-duplex-string="hlpgbhideMsg.cxCod">
        其它部位：<input type="text" class="extraInput" name="hspHlpgbCustom.cxQtbw" ms-duplex-string="hlpgbpatientMsg.cxQtbw" maxlength="50">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        神经系统：
      </label>
      <span class="span-wrapper">
        <span class="twogrp fitstpart">
          <label ms-repeat="hlpgbmsgList.nsCodList" ms-attr-for="nsCod{{el.infocode}}">
            <input ms-attr-id="nsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsCod',$index)">{{el.info}}
          </label>
          <input class="hidden" type="text" name="hspHlpgbCustom.nsCod" ms-duplex-string="hlpgbpatientMsg.nsCod">
        </span>
        <span class="twogrp secondpart">
          <label ms-repeat="hlpgbmsgList.nsDaqtList" ms-attr-for="nsDaqt{{el.infocode}}">
            <input ms-attr-id="nsDaqt{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsDaqt',$index)">{{el.info}}
          </label>
          <input class="hidden" type="text" name="hspHlpgbCustom.nsDaqt" ms-duplex-string="hlpgbpatientMsg.nsDaqt">
        </span>
        <span class="twogrp thirdpart">
          <label ms-repeat="hlpgbmsgList.nsTtcjList" ms-attr-for="nsTtcj{{el.infocode}}">
            <input ms-attr-id="nsTtcj{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsTtcj',$index)">{{el.info}}
          </label>
          <input class="hidden" type="text" name="hspHlpgbCustom.nsTtcj" ms-duplex-string="hlpgbpatientMsg.nsTtcj">
        </span>
        <span class="twogrp fourthpart">
          <label ms-repeat="hlpgbmsgList.nsThztList" ms-attr-for="nsThzt{{el.infocode}}">
            <input ms-attr-id="nsThzt{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsThzt',$index)">{{el.info}}
          </label>
          <input class="hidden" type="text" name="hspHlpgbCustom.nsThzt" ms-duplex-string="hlpgbpatientMsg.nsThzt">
        </span>
        <span class="twogrp fifthpart">
          <span ms-class="active:hlpgbpatientMsg.nsThzt===0||hlpgbpatientMsg.nsThzt==='0'" class="spanNS NSfirst">
            部位平面：<input type="text" class="extraInput" maxlength="10" ms-duplex-string="hlpgbpatientMsg.nsThztDes">
          </span>
          <span ms-class="active:hlpgbpatientMsg.nsThzt===1||hlpgbpatientMsg.nsThzt==='1'" class="spanNS">
            <label ms-repeat="hlpgbmsgList.nsptzyList" ms-attr-for="nsptzy{{el.infocode}}">
              <input ms-attr-id="nsptzy{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsptzy',$index)">{{el.info}}
            </label>
            <input class="hidden" type="text" ms-duplex-string="hlpgbpatientMsg.nsptzy">
          </span>
          <input class="hidden" type="text" name="hspHlpgbCustom.nsThztDes" ms-duplex-string="hlpgbpatientMsg.nsThztDes">
        </span>
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        瞳孔左：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.tkLeftCodList" ms-attr-for="tkLeftCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="tkLeftCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('tkLeftCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.tkLeftCod" ms-duplex-string="hlpgbpatientMsg.tkLeftCod">
        <input type="text" maxlength="4" name="hspHlpgbCustom.tkLeft" ms-duplex-string="hlpgbpatientMsg.tkLeft" 
          ms-keyup="hlpgbonlyNum('tkLeft',2)" ms-input="hlpgbonlyNum('tkLeft',2)" ms-change="hlpgbonlyNum('tkLeft',2)" class="tkwidth">mm
        其他：<input type="text" class="extraInput" name="hspHlpgbCustom.tkLeftOther" ms-duplex-string="hlpgbpatientMsg.tkLeftOther" class="tkwidth">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        瞳孔右：
      </label>
      <span class="span-wrapper">
        <label ms-repeat="hlpgbmsgList.tkRightCodList" ms-attr-for="tkRightCod{{el.infocode}}" class="checklabel">
          <input ms-attr-id="tkRightCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('tkRightCod',$index)">
          {{el.info}}
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.tkRightCod" ms-duplex-string="hlpgbpatientMsg.tkRightCod">
        <input type="text" maxlength="4" name="hspHlpgbCustom.tkRight" ms-duplex-string="hlpgbpatientMsg.tkRight"
          ms-keyup="hlpgbonlyNum('tkRight',2)" ms-input="hlpgbonlyNum('tkRight',2)" ms-change="hlpgbonlyNum('tkRight',2)" class="tkwidth">mm
        其他：<input type="text" class="extraInput" name="hspHlpgbCustom.tkRightOther" ms-duplex-string="hlpgbpatientMsg.tkRightOther" class="tkwidth">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        神志：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.szCodList" ms-attr-for="szCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="szCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.szCod"
          ms-change="arrToStr('szCod')"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.szCod" ms-duplex-string="hlpgbhideMsg.szCod">
      其他：<input type="text" class="extraInput" maxlength="200" name="hspHlpgbCustom.szOther" ms-duplex-string="hlpgbpatientMsg.szOther">
    </li>
    <li class="fullli">
      <label class="labtitle">
        皮肤：
      </label>
      <span class="span-wrapper">
        <label class="checklabel" ms-repeat="hlpgbmsgList.pfCodList" ms-attr-for="pfCod{{el.infocode}}">
          <input type="checkbox" ms-attr-id="pfCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.pfCod"
            ms-change="arrToStr('pfCod')"> {{el.info}}
          <input ms-visible="isShowStressText && el.infocode == 9" type="text" maxlength="100" ms-duplex-string="hlpgbpatientMsg.ylxssDes">
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.pfCod" ms-duplex-string="hlpgbhideMsg.pfCod">
        <label for="pfFw" class="checklabel">
          <input id="pfFw" type="checkbox" ms-attr-checked="hlpgbpatientMsg.pfFw==1" ms-click="toggleHspFzjcCustom('pfFw')">范围
          <input class="hidden" type="text" name="hspHlpgbCustom.pfFw" ms-duplex-string="hlpgbpatientMsg.pfFw">
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.ylxssDes" ms-duplex-string="hlpgbpatientMsg.ylxssDes">
        <input class="extraInput" type="text" maxlength="200" name="hspHlpgbCustom.pfFwDes" ms-duplex-string="hlpgbpatientMsg.pfFwDes">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        胃肠道：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.wcdCodList" ms-attr-for="wcdCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="wcdCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.wcdCod"
          ms-change="arrToStr('wcdCod')"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.wcdCod" ms-duplex-string="hlpgbhideMsg.wcdCod">
      其他：<input type="text" class="extraInput" maxlength="200" name="hspHlpgbCustom.wcdOther" ms-duplex-string="hlpgbpatientMsg.wcdOther">
    </li>
    <li class="fullli">
      <label class="labtitle twolab">
        腹部：
      </label>
      <span class="span-wrapper">
        <label class="checklabel" ms-repeat="hlpgbmsgList.fbCodList" ms-attr-for="fbCod{{el.infocode}}">
          <input type="checkbox" ms-attr-id="fbCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.fbCod"
            ms-change="arrToStr('fbCod')"> {{el.info}}
        </label>
        <input type="text" ms-duplex-string="hlpgbhideMsg.fbCod" name="hspHlpgbCustom.fbCod" class="hidden"/>
        <label for="fbFc" class="checklabel">
          <input id="fbFc" type="checkbox" ms-attr-checked="hlpgbpatientMsg.fbFc==1" ms-click="toggleHspFzjcCustom('fbFc')">
          腹穿
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.fbFc" ms-duplex-string="hlpgbpatientMsg.fbFc">
        <span class="extraspan">
          <input type="text" name="hspHlpgbCustom.fbFcDes" ms-duplex-string="hlpgbpatientMsg.fbFcDes">
        </span>
        其它：
        <input type="text" class="extraInput" name="hspHlpgbCustom.fbOther" ms-duplex-string="hlpgbpatientMsg.fbOther" maxlength="50">
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        四肢活动：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.szydCodList" ms-attr-for="szydCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="szydCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.szydCod"
          ms-change="arrToStr('szydCod')"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.szydCod" ms-duplex-string="hlpgbhideMsg.szydCod">
      其他：<input type="text" maxlength="200" class="extraInput" name="hspHlpgbCustom.szydOther" ms-duplex-string="hlpgbpatientMsg.szydOther">
    </li>
    <li class="fullli">
      <label class="labtitle">
        疼痛：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.ttCodList" ms-attr-for="ttCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="ttCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.ttCod"
          ms-change="arrToStr('ttCod')"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.ttCod" ms-duplex-string="hlpgbhideMsg.ttCod">
      部位：<input type="text" maxlength="200" class="extraInput" name="hspHlpgbCustom.ttBw" ms-duplex-string="hlpgbpatientMsg.ttBw">
    </li>
    <li class="fullli">
      <label class="labtitle">
        疾病史：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.jbsCodList" ms-attr-for="jbsCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="jbsCod{{el.infocode}}" ms-attr-checked="el.checked"
          ms-click="hlpgbradioclick('jbsCod',$index)"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.jbsCod" ms-duplex-string="hlpgbpatientMsg.jbsCod">
      <label class="f-left">内容：</label><input type="text" class="spc-inputB f-left" maxlength="200" name="hspHlpgbCustom.jbsDes" ms-duplex-string="hlpgbpatientMsg.jbsDes">
      <div class="floatLeft m-l5" id="knowledgeDiv">
        <a class="commonbtn jbsBoxBtn importLink" href="javascript:;" ms-click="openJbsDes()">查询</a>
        <span class="middleLabel m-l5" id="measure"></span>
      </div>
    </li>
    <li class="fullli">
      <label class="labtitle">
        手术史：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.sssCodList" ms-attr-for="sssCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="sssCod{{el.infocode}}" ms-attr-checked="el.checked"
          ms-click="hlpgbradioclick('sssCod',$index)"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.sssCod" ms-duplex-string="hlpgbpatientMsg.sssCod">
      <label class="f-left">内容：</label><input type="text" class="spc-inputB f-left" maxlength="200" name="hspHlpgbCustom.sssDes" ms-duplex-string="hlpgbpatientMsg.sssDes">
    </li>
    <li class="fullli">
      <label class="labtitle">
        过敏史：
      </label>
      <label class="checklabel" ms-repeat="hlpgbmsgList.gmsCodList" ms-attr-for="gmsCod{{el.infocode}}">
        <input type="checkbox" ms-attr-id="gmsCod{{el.infocode}}" ms-attr-checked="el.checked"
          ms-click="hlpgbradioclick('gmsCod',$index)"> {{el.info}}
      </label>
      <input class="hidden" type="text" name="hspHlpgbCustom.gmsCod" ms-duplex-string="hlpgbpatientMsg.gmsCod">
      <span ms-visible="hlpgbpatientMsg.gmsCod == 2">
        类型：
        <label ms-repeat="hlpgbmsgList.gmsTypeList">
          <input ms-attr-id="gmsType{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.gmsType" />
          {{el.info}}
          <input ms-if="isShowGmsType &&el.infocode == 6" maxlength="50" type="text" name="hspHlpgbCustom.gmsDes" ms-duplex-string="hlpgbpatientMsg.gmsDes"/>
        </label>
        <input class="hidden" type="text" name="hspHlpgbCustom.gmsType" ms-duplex-string="hlpgbhideMsg.gmsType" />
      </span>
    </li>
    <li class="fullli" id="scoWrapper">
      <input type="text" class="hidden" ms-duplex-string="aboutSco.bradenSeq" id="bradenSeq">
      <input type="text" class="hidden" ms-duplex-string="aboutSco.fallriskSeq" id="fallriskSeq">
      <input type="text" class="hidden" ms-duplex-string="aboutSco.adlSeq" id="adlSeq">
      <input type="text" class="hidden" ms-duplex-string="hlpgbpatientMsg.emgSeq" id="hplgEmg">
      <!-- <input type="text" class="hidden" ms-duplex-string="aboutSco.falldSeq" id="falldSeq"> -->
      <input type="text" class="hidden" ms-duplex-string="aboutSco.zyfxpfSeq" id="zyfxpfSeq">
      <input type="text" class="hidden" ms-duplex-string="aboutSco.gcsSeq" id="gcsSeq">
      <input type="text" class="hidden" ms-duplex-string="aboutSco.ddfxpgbSeq" id="ddfxpgbSeq">
      <div class="scoDiv">
        <label class="scoTitle">Braden评分:</label>
        <input type="text" readonly ms-click="openBrdSco()" ms-duplex-string="aboutSco.bradenSco" class="readInput">分
      </div>
      <!-- <div class="scoDiv">
        <label class="scoTitle">坠床跌倒评分:</label>
        <label ms-visible="aboutSco.falldSeq != ''"><input type="text" readonly ms-click="openFallSco()" ms-duplex-string="aboutSco.zcddexpfSco" class="readInput">分</label>
        <label ms-visible="aboutSco.falldSeq == ''"><input type="text" readonly ms-click="openFallSco()" ms-duplex-string="aboutSco.fallriskSco" class="readInput">分</label>
      </div> -->
      <div class="scoDiv">
        <label class="scoTitle">ADL评分:</label>
        <input type="text" readonly ms-click="openAdlSco()" ms-duplex-string="aboutSco.adlSco" class="readInput">分
      </div>
      <div class="scoDiv">
        <label class="scoTitle">疼痛评分:</label>
        <input type="text" class="hidden" ms-duplex-string="aboutSco.nrsSeq" id="nrsSeq">
        <input type="text" readonly ms-click="openNRSSco()" ms-duplex-string="aboutSco.nrsSco" class="readInput">分
        <input type="text" class="hidden" ms-duplex-string="aboutSco.ttpfNr" class="noClickInput">
        <input type="text" class="hidden" ms-duplex-string="aboutSco.ttpfTypeCod" class="noClickInput">
      </div>
      <div class="scoDiv">
        <label class="scoTitle">转运风险评分:</label>
        <input type="text" readonly ms-duplex-string="aboutSco.zyfxpfSco" ms-click="openZyfxSco()" class="readInput">分
      </div>
      <div class="scoDiv">
        <label class="scoTitle">GCS评分:</label>
        <input type="text" readonly ms-duplex-string="aboutSco.gcsSco" ms-click="openGCSSco()" class="readInput">分
      </div>
      <div class="scoDiv">
        <label class="scoTitle">Morse评分:</label>
        <input type="text" readonly ms-duplex-string="aboutSco.morseSco" ms-click="openMorse()" class="readInput">分
      </div>
    </li>
    <li class="fullli">
      <label class="labtitle">
        处理步骤：
      </label>
      <span class="span-wrapper">
        <label class="checklabel" ms-repeat="hlpgbmsgList.clbzCodList" ms-attr-for="clbzCod{{el.infocode}}" 
        ms-class="clOtherLable:(el.infocode == 13 && hlpgbpatientMsg.clbzCod.$model.indexOf('1') != -1) ||( el.infocode == 15 && hlpgbpatientMsg.clbzCod.$model.indexOf('1') == -1)">
          <input type="checkbox" ms-attr-id="clbzCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.clbzCod" ms-change="arrToStr('clbzCod')"> {{el.info}}
          <input ms-if="el.infocode == 16 && hlpgbhideMsg.clbzCod.indexOf('16') != -1" type="text" class="extraInput" name="hspHlpgbCustom.clbzOther" ms-duplex-string="hlpgbpatientMsg.clbzOther">
          <span ms-if="el.info == '吸氧' && hlpgbpatientMsg.clbzCod.$model.indexOf('1') != -1">
            <input type="text" name="hspHlpgbCustom.xyDes" ms-duplex-string="hlpgbpatientMsg.xyDes">升/分
          </span>
        </label>
        <input type="text" ms-duplex-string="hlpgbhideMsg.clbzCod" name="hspHlpgbCustom.clbzCod" class="hidden"/>
      </span>
    </li>
    <li class="fullli">
      <label class="labtitle">
        备注：
      </label>
      <input type="text" name="hspHlpgbCustom.memo" ms-duplex-string="hlpgbpatientMsg.memo" class="maxLongInputGD" maxlength="100">
    </li>
  </ul>
</body>
</html>