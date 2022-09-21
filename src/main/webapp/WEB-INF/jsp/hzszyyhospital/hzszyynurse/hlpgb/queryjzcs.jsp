<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hlpgb.css?6">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?98">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>急诊创伤入院评估表</title>
  <script type="text/javascript" charset="utf-8">
    var comdata = parent.comdata;
    var _baseUrl = comdata.baseUrl || '${baseurl}',
        _emgSeq = comdata.emgSeq || '${emgSeq}',
      _cstNam = '${sessionScope.activeUser.usrname}',
      typeForm = 'hlpgb';
  </script>

  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/jzcs.avalon.js?5" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body class="xtpg">
  <div ms-controller="queryjzcs" class="queryhlpgb">
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/hlpgb/printjzcs.jsp"></jsp:include>
    <form id="jzcsform" name="jzcsform" action="${baseurl}hlpgb/updateJzcsrypgb.do" method="post">
      <input class="hidden" type="text" id="emg_emgSeq" ms-duplex-string="hlpgbpatientMsg.emgSeq" name="hspJzcspgInfCustom.emgSeq">
      <p class="hlpgbTitle">急诊创伤入院评估表</p>
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
            <input type="text" class="spc-inputC" ms-duplex-string="hlpgbpatientMsg.workAddress" name="hspJzcspgInfCustom.workAddress"/>
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
            <input class="Wdate spcWdate" type="text" name="hspJzcspgInfCustom.seeDocDat"
            ms-duplex-string="hlpgbpatientMsg.seeDocDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </div>
          <div class="scoDiv">
            <label class="scoTitle"> 欠款：</label>
            <label ms-repeat="hlpgbmsgList.qkCodList" ms-attr-for="qkCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="qkCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('qkCod',$index)">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.qkCod" ms-duplex-string="hlpgbpatientMsg.qkCod">
          </div>
        </li>
        <li class="fullli">
          <div class="scoDiv">
            <label class="scoTitle">通知医生时间：</label>
            <input class="Wdate spcWdate" type="text" name="hspJzcspgInfCustom.informDocDat"
            ms-duplex-string="hlpgbpatientMsg.informDocDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </div>
          <div class="scoDiv">
            <label class="scoTitle">到诊时间：</label>
            <input class="Wdate spcWdate" type="text" name="hspJzcspgInfCustom.docDat"
            ms-duplex-string="hlpgbpatientMsg.docDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </div>
          <div class="scoDiv">
            <label class="scoTitle">首诊科室：</label>
            <span class="span-undo">{{basicInfo.emgFkCod}}</span>
          </div>
          <div class="scoDiv">
            <label class="scoTitle">首诊医生：</label>
            <span class="relative">
              <input type="text" maxlength="10" name="hspJzcspgInfCustom.sqlDctNbr" ms-duplex-string="hlpgbpatientMsg.sqlDctNbr">
              <!-- <div class="userList" id="userNameList"> -->
                  <!-- id="username"  -->
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
              <input class="extraWth" type="text" ms-if="el.infocode == 3 && hlpgbpatientMsg.hlAddr == '3'" name="hspJzcspgInfCustom.hlAddrOther" ms-duplex-string="hlpgbpatientMsg.hlAddrOther">
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.hlAddr" ms-duplex-string="hlpgbpatientMsg.hlAddr">
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
            <input class="hidden" type="text" name="hspJzcspgInfCustom.arvChlCod" ms-duplex-string="hlpgbpatientMsg.arvChlCod">
            <span ms-if="hlpgbpatientMsg.arvChlCod == '5'">
              驾驶员姓名：
              <span class="relative">
                <input type="text" name="hspJzcspgInfCustom.abnDriver" ms-duplex-string="hlpgbpatientMsg.abnDriver"
                  id="driverName" ms-keyup="cleanAbnSco()" autocomplete="off" maxlength="20">
                <ul class="userList topList" ms-visible="isShowAbnDriverList">
                  <li ms-repeat="hlpgbmsgList.abnDriverList" ms-click="chooseAbnDriver(el.abnDriver)">
                    {{el.abnDriver}}
                  </li>
                </ul>
              </span>
              &nbsp;&nbsp;医生签名：
              <span class="relative">
                <input type="text" id="usernameB" maxlength="10" name="hspJzcspgInfCustom.abnDoctor" autocomplete="off" ms-duplex-string="hlpgbpatientMsg.abnDoctor">
                <div class="userList" id="userNameBList"></div>
              </span>
            </span>
            <input class="extraWth" type="text" ms-if="hlpgbpatientMsg.arvChlCod == '9'" name="hspJzcspgInfCustom.abnScoNme" ms-duplex-string="hlpgbpatientMsg.abnScoNme"> 
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle">
            陪送人员：
          </label>
          <label class="checklabel" ms-repeat="hlpgbmsgList.cmpPsnCodList" ms-attr-for="cmpPsnCod{{el.infocode}}">
            <input type="checkbox" ms-attr-id="cmpPsnCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.cmpPsnCod"
              ms-change="arrToStr('cmpPsnCod')"> {{el.info}}
            <input type="text" ms-if="el.infocode == 8 && hlpgbhideMsg.cmpPsnCod.indexOf('8')!=-1" ms-duplex-string="hlpgbpatientMsg.psryqt" name="hspJzcspgInfCustom.psryqt">
          </label>
          <input class="hidden" type="text" name="hspJzcspgInfCustom.cmpPsnCod" ms-duplex-string="hlpgbhideMsg.cmpPsnCod">
        </li>
        <li class="fullli">
          <label class="labtitle">
            院前处置：
          </label>
          <input type="text" class="maxLongInputGD" ms-duplex-string="hlpgbpatientMsg.preHospitalTreatment" name="hspJzcspgInfCustom.preHospitalTreatment">
        </li>
        <li class="fullli">
          <label class="labtitle">主诉症状：</label>
          <input type="text" name="hspJzcspgInfCustom.preDgnCod" ms-duplex-string="hlpgbpatientMsg.preDgnCod" class="maxLongInputGD">
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
          <a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addSmtz()">[导入二次预检体征]</a>
        
        </li>
        <li class="fullli">
          <label class="labtitle"></label>
          <div class="scoDiv">
            <label class="scoTitle scoTitleB">体温：</label>
            <select id="tempretureSel" ms-duplex-string="hlpgbpatientMsg.tmpNbrFlg" name="hspJzcspgInfCustom.tmpNbrFlg" class="SignselB">
              <option value="1">耳温</option>
              <option value="2">不升</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.tmpNbrFlg == 2 || hlpgbpatientMsg.tmpNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.tmpNbr" name="hspJzcspgInfCustom.tmpNbr">℃
          </div>
          <div class="scoDiv">
            <label class="scoTitle">脉搏：</label>
            <select ms-duplex-string="hlpgbpatientMsg.pulseFlg" name="hspJzcspgInfCustom.pulseFlg" class="SignselB">
              <option value="1"></option>
              <option value="2">测不出</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.pulseFlg == 2 || hlpgbpatientMsg.pulseFlg ==3" ms-duplex-string="hlpgbpatientMsg.pulse" name="hspJzcspgInfCustom.pulse">次/分
          </div>
          <div class="scoDiv">
            <label class="scoTitle">呼吸：</label>
            <select id="breathSel" ms-duplex-string="hlpgbpatientMsg.breNbrFlg" name="hspJzcspgInfCustom.breNbrFlg" class="Signsel">
              <option value="1"></option>
              <option value="2">机械通气</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.breNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.breNbr" name="hspJzcspgInfCustom.breNbr">次/分
          </div>
          <div class="scoDiv">
            <label class="scoTitle">血压：</label>
            <select ms-duplex-string="hlpgbpatientMsg.sbpNbrFlg" id="SdpSel" name="hspJzcspgInfCustom.sbpNbrFlg" class="Signsel">
              <option value="1"></option>
              <option value="2">测不出</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.sbpNbrFlg == 2 || hlpgbpatientMsg.sbpNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.sbpUpNbr" name="hspJzcspgInfCustom.sbpUpNbr">/
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.sbpNbrFlg == 2 || hlpgbpatientMsg.sbpNbrFlg ==3" ms-duplex-string="hlpgbpatientMsg.sbpDownNbr" name="hspJzcspgInfCustom.sbpDownNbr">mmHg
          </div>
        </li>
        <li class="fullli">
          <label class="labtitle"></label>
          <div class="scoDiv">
            <label class="scoTitle scoTitleB">血氧：</label>
            <select id="xySel" ms-duplex-string="hlpgbpatientMsg.xyFlg" name="hspJzcspgInfCustom.xyFlg" class="SignselB">
              <option value="1"></option>
              <option value="2">测不出</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.xyFlg == 2 || hlpgbpatientMsg.xyFlg ==3" ms-duplex-string="hlpgbpatientMsg.oxyNbr" name="hspJzcspgInfCustom.oxyNbr">%
          </div>
          <div class="scoDiv">
            <label class="scoTitle">心率：</label>
            <select ms-duplex-string="hlpgbpatientMsg.hrtRteFlg" name="hspJzcspgInfCustom.hrtRteFlg" class="SignselB">
              <option value="1"></option>
              <option value="2">测不出</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.hrtRteFlg == 2 || hlpgbpatientMsg.hrtRteFlg ==3" ms-duplex-string="hlpgbpatientMsg.hrtRte" name="hspJzcspgInfCustom.hrtRte">次/分
          </div>
          <div class="scoDiv">
            <label class="scoTitle">血糖：</label>
            <select ms-duplex-string="hlpgbpatientMsg.glsCod" class="Signsel" name="hspJzcspgInfCustom.glsCod">
              <option value=""></option>
              <option ms-repeat="hlpgbmsgList.glsCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
            <select id="xtSel" ms-duplex-string="hlpgbpatientMsg.pbgNbrFlg" name="hspJzcspgInfCustom.pbgNbrFlg" class="Signsel">
              <option value="1"></option>
              <option value="2">LO</option>
              <option value="3">HI</option>
              <option value="4">拒测</option>
            </select>
            <input type="text" class="tkwidth" ms-attr-disabled="hlpgbpatientMsg.pbgNbrFlg == 2 || hlpgbpatientMsg.pbgNbrFlg ==3 || hlpgbpatientMsg.pbgNbrFlg ==4" ms-duplex-string="hlpgbpatientMsg.pbgNbr" name="hspJzcspgInfCustom.pbgNbr">mmol/L
          </div>
        </li>
        <li class="fullli">
          <label class="labtitle">病种：</label>
          <span class="span-wrapper">
            <label ms-repeat="hlpgbmsgList.hlbzCodList" ms-attr-for="hlbzCod{{el.infocode}}" class="checklabel">
              <input type="checkbox" ms-attr-id="hlbzCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.hlbzCod"
              ms-change="arrToStr('hlbzCod')"> {{el.info}}
              <input ms-if="el.infocode == 9 && hlpgbhideMsg.hlbzCod.indexOf('9') != -1" maxlength="50" type="text" class="extraInput" name="hspJzcspgInfCustom.hlbzOther" ms-duplex-string="hlpgbpatientMsg.hlbzOther"/>
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.hlbzCod" ms-duplex-string="hlpgbhideMsg.hlbzCod">
          </span>
        </li>
      </ul>
      <div class="sub-top">
        <span class="spanLeft">
          <span class="spanTitle3">初步评估</span>
        </span>
      </div>
      <ul class="content-ul bordered">
        <li class="fullli">
          <label class="labtitle">
            气道：
          </label>
          <span class="span-wrapper">
            <label ms-repeat="hlpgbmsgList.qdCodList" ms-attr-for="qdCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="qdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('qdCod',$index)">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.qdCod" ms-duplex-string="hlpgbpatientMsg.qdCod">
            其它：<input type="text" class="extraInput" name="hspJzcspgInfCustom.qdOther" ms-duplex-string="hlpgbpatientMsg.qdOther">
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
            <input class="hidden" type="text" name="hspJzcspgInfCustom.hxCod" ms-duplex-string="hlpgbpatientMsg.hxCod">
            其它：<input type="text" class="extraInput" name="hspJzcspgInfCustom.hxOther" ms-duplex-string="hlpgbpatientMsg.hxOther">
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
            <input class="hidden" type="text" name="hspJzcspgInfCustom.xhCod" ms-duplex-string="hlpgbpatientMsg.xhCod">
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
            <input class="hidden" type="text" name="hspJzcspgInfCustom.cxCod" ms-duplex-string="hlpgbhideMsg.cxCod">
            其它部位：<input type="text" class="extraInput" name="hspJzcspgInfCustom.cxQtbw" ms-duplex-string="hlpgbpatientMsg.cxQtbw">
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
              <input class="hidden" type="text" name="hspJzcspgInfCustom.nsCod" ms-duplex-string="hlpgbpatientMsg.nsCod">
            </span>
            <span class="twogrp secondpart">
              <label ms-repeat="hlpgbmsgList.nsDaqtList" ms-attr-for="nsDaqt{{el.infocode}}">
                <input ms-attr-id="nsDaqt{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsDaqt',$index)">{{el.info}}
              </label>
              <input class="hidden" type="text" name="hspJzcspgInfCustom.nsDaqt" ms-duplex-string="hlpgbpatientMsg.nsDaqt">
            </span>
            <span class="twogrp thirdpart">
              <label ms-repeat="hlpgbmsgList.nsTtcjList" ms-attr-for="nsTtcj{{el.infocode}}">
                <input ms-attr-id="nsTtcj{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsTtcj',$index)">{{el.info}}
              </label>
              <input class="hidden" type="text" name="hspJzcspgInfCustom.nsTtcj" ms-duplex-string="hlpgbpatientMsg.nsTtcj">
            </span>
            <span class="twogrp fourthpart">
              <label ms-repeat="hlpgbmsgList.nsThztList" ms-attr-for="nsThzt{{el.infocode}}">
                <input ms-attr-id="nsThzt{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsThzt',$index)">{{el.info}}
              </label>
              <input class="hidden" type="text" name="hspJzcspgInfCustom.nsThzt" ms-duplex-string="hlpgbpatientMsg.nsThzt">
            </span>
            <span class="twogrp fifthpart">
              <span ms-class="active:hlpgbpatientMsg.nsThzt===0||hlpgbpatientMsg.nsThzt==='0'" class="spanNS NSfirst">
                部位平面：<input type="text" ms-duplex-string="hlpgbpatientMsg.nsThztDes" style="width: 80px;">
              </span>
              <span ms-class="active:hlpgbpatientMsg.nsThzt===1||hlpgbpatientMsg.nsThzt==='1'" class="spanNS">
                <label ms-repeat="hlpgbmsgList.nsptzyList" ms-attr-for="nsptzy{{el.infocode}}">
                  <input ms-attr-id="nsptzy{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('nsptzy',$index)">{{el.info}}
                </label>
                <input class="hidden" type="text" ms-duplex-string="hlpgbpatientMsg.nsptzy">
              </span>
              <input class="hidden" type="text" name="hspJzcspgInfCustom.nsThztDes" ms-duplex-string="hlpgbpatientMsg.nsThztDes">
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
            <input class="hidden" type="text" name="hspJzcspgInfCustom.tkLeftCod" ms-duplex-string="hlpgbpatientMsg.tkLeftCod">
            <input type="text" maxlength="4" name="hspJzcspgInfCustom.tkLeft" ms-duplex-string="hlpgbpatientMsg.tkLeft" 
              ms-keyup="hlpgbonlyNum('tkLeft',2)" ms-input="hlpgbonlyNum('tkLeft',2)" ms-change="hlpgbonlyNum('tkLeft',2)" class="tkwidth">mm
            其他：<input type="text" name="hspJzcspgInfCustom.tkLeftOther" class="extraInput" ms-duplex-string="hlpgbpatientMsg.tkLeftOther" class="tkwidth">
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
            <input class="hidden" type="text" name="hspJzcspgInfCustom.tkRightCod" ms-duplex-string="hlpgbpatientMsg.tkRightCod">
            <input type="text" maxlength="4" name="hspJzcspgInfCustom.tkRight" ms-duplex-string="hlpgbpatientMsg.tkRight"
              ms-keyup="hlpgbonlyNum('tkRight',2)" ms-input="hlpgbonlyNum('tkRight',2)" ms-change="hlpgbonlyNum('tkRight',2)" class="tkwidth">mm
            其他：<input type="text" name="hspJzcspgInfCustom.tkRightOther" class="extraInput" ms-duplex-string="hlpgbpatientMsg.tkRightOther" class="tkwidth">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle">
            头部：
          </label>
          <span class="span-wrapper">
            <label class="checklabel" ms-repeat="hlpgbmsgList.tbCodList" ms-attr-for="tbCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="tbCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.tbCod"
                ms-change="arrToStr('tbCod')"> {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.tbCod" ms-duplex-string="hlpgbhideMsg.tbCod">
            其他：<input type="text" class="extraInput" name="hspJzcspgInfCustom.tbOther" ms-duplex-string="hlpgbpatientMsg.tbOther">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle">
            颈部：
          </label>
          <span class="span-wrapper">
            <label class="checklabel" ms-repeat="hlpgbmsgList.jbCodList" ms-attr-for="jbCod{{el.infocode}}">
              <input type="checkbox" ms-attr-id="jbCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.jbCod"
                ms-change="arrToStr('jbCod')"> {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.jbCod" ms-duplex-string="hlpgbhideMsg.jbCod">
          </span>
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
                <input class="extraInput" type="text" ms-if="el.infocode == 10 && hlpgbhideMsg.pfCod.indexOf('10') != -1" maxlength="200" name="hspJzcspgInfCustom.pfFw" ms-duplex-string="hlpgbpatientMsg.pfFw">
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.ylxssDes" ms-duplex-string="hlpgbpatientMsg.ylxssDes">
            <input class="hidden" type="text" name="hspJzcspgInfCustom.pfCod" ms-duplex-string="hlpgbhideMsg.pfCod">
          </span>
        </li>
        <li class="fullli doubLi">
          <label class="labtitle doubLab">
            胸部：
          </label>
          <span class="span-wrapper">
            <div ms-repeat="hlpgbmsgList.xbCodList">
              <label class="checklabel" ms-attr-for="xbCod{{el.infocode}}">
                <input type="checkbox" ms-attr-id="xbCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.xbCod"
                  ms-change="arrToStr('xbCod')"> {{el.info}}
                <input type="text" class="input-min-date" name="hspJzcspgInfCustom.xbJyDes" ms-if="el.infocode == 11 && hlpgbhideMsg.xbCod.indexOf('11') != -1" ms-duplex-string="hlpgbpatientMsg.xbJyDes">
                <input type="text" class="input-min-date" name="hspJzcspgInfCustom.xbXcDes" ms-if="el.infocode == 12 && hlpgbhideMsg.xbCod.indexOf('12') != -1" ms-duplex-string="hlpgbpatientMsg.xbXcDes">
                <input type="text" class="input-min-date" name="hspJzcspgInfCustom.xbLeftDes" ms-if="el.infocode == 13 && hlpgbhideMsg.xbCod.indexOf('13') != -1" ms-duplex-string="hlpgbpatientMsg.xbLeftDes">
                <input type="text" class="input-min-date" name="hspJzcspgInfCustom.xbRightDes" ms-if="el.infocode == 14 && hlpgbhideMsg.xbCod.indexOf('14') != -1" ms-duplex-string="hlpgbpatientMsg.xbRightDes">
              </label>
              <br ms-if="el.infocode == 10"/>
            </div>
            
            <input class="hidden" type="text" name="hspJzcspgInfCustom.xbCod" ms-duplex-string="hlpgbhideMsg.xbCod">
          </span>
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
            <input type="text" ms-duplex-string="hlpgbhideMsg.fbCod" name="hspJzcspgInfCustom.fbCod" class="hidden"/>
            <label for="fbFc" class="checklabel">
              <input id="fbFc" type="checkbox" ms-attr-checked="hlpgbpatientMsg.fbFc==1" ms-click="toggleHspFzjcCustom('fbFc')">
              腹穿
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.fbFc" ms-duplex-string="hlpgbpatientMsg.fbFc">
            <span class="extraspan">
              <input type="text" class="extraInput" name="hspJzcspgInfCustom.fbFcDes" ms-duplex-string="hlpgbpatientMsg.fbFcDes">
            </span>
            其它：
            <input type="text" class="extraInput" name="hspJzcspgInfCustom.fbOther" ms-duplex-string="hlpgbpatientMsg.fbOther">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle">
            脊柱：
          </label>
          <span class="span-wrapper">
            <label ms-repeat="hlpgbmsgList.jzCodList" ms-attr-for="jzCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="jzCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode"  ms-duplex="hlpgbpatientMsg.jzCod"
              ms-change="arrToStr('jzCod')">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.jzCod" ms-duplex-string="hlpgbhideMsg.jzCod">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle">
            骨盆：
          </label>
          <span class="span-wrapper">
            <label ms-repeat="hlpgbmsgList.gpCodList" ms-attr-for="gpCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="gpCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode"  ms-duplex="hlpgbpatientMsg.gpCod"
              ms-change="arrToStr('gpCod')">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.gpCod" ms-duplex-string="hlpgbhideMsg.gpCod">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle">
            股骨：
          </label>
          <span class="span-wrapper">
            <label ms-repeat="hlpgbmsgList.ggCodList" ms-attr-for="ggCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="ggCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.ggCod"
              ms-change="arrToStr('ggCod')">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.ggCod" ms-duplex-string="hlpgbhideMsg.ggCod">
          </span>
        </li>
        <li class="fullli" id="scoWrapper">
          <input type="text" class="hidden" ms-duplex-string="aboutSco.bradenSeq" name="hspJzcspgInfCustom.bradenSeq" id="bradenSeq">
          <input type="text" class="hidden" ms-duplex-string="aboutSco.adlSeq" name="hspJzcspgInfCustom.adlSeq" id="adlSeq">
          <input type="text" class="hidden" ms-duplex-string="aboutSco.zyfxpfSeq" name="hspJzcspgInfCustom.zyfxpfSeq" id="zyfxpfSeq">
          <input type="text" class="hidden" ms-duplex-string="hlpgbpatientMsg.emgSeq" id="hplgEmg">
          <input type="text" class="hidden" ms-duplex-string="aboutSco.gcsSeq" name="hspJzcspgInfCustom.gcsSeq" id="gcsSeq">
          <input type="text" class="hidden" ms-duplex-string="aboutSco.ddfxpgbSeq" name="hspJzcspgInfCustom.ddfxpgbSeq" id="ddfxpgbSeq">
          <div class="scoDiv">
            <label class="scoTitle">Braden评分:</label>
            <input type="text" readonly ms-click="openBrdSco()" ms-duplex-string="aboutSco.bradenSco" class="readInput">分
          </div>
          <div class="scoDiv">
            <label class="scoTitle">ADL评分:</label>
            <input type="text" readonly ms-click="openAdlSco()" ms-duplex-string="aboutSco.adlSco" class="readInput">分
          </div>
          <div class="scoDiv">
            <label class="scoTitle">疼痛评分:</label>
            <input type="text" class="hidden" ms-duplex-string="aboutSco.nrsSeq" name="hspJzcspgInfCustom.nrsSeq" id="nrsSeq">
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
          <label class="labtitle twolab">
            处理步骤：
          </label>
          <span class="span-wrapper">
            <label ms-repeat="hlpgbmsgList.clbzCodList" ms-attr-for="clbzCod{{el.infocode}}" class="checklabel"
            ms-class="clOtherLable:(el.infocode == 10 && hlpgbpatientMsg.clbzCod.$model.indexOf('0') != -1 && hlpgbhideMsg.clbzCod.indexOf('10') != -1)">
              <input ms-attr-id="clbzCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="hlpgbpatientMsg.clbzCod"
              ms-change="arrToStr('clbzCod')">
              {{el.info}}
              <span ms-if="el.info == '吸氧' && hlpgbpatientMsg.clbzCod.$model.indexOf('0') != -1">
                <input type="text" name="hspJzcspgInfCustom.xyDes" ms-duplex-string="hlpgbpatientMsg.xyDes">升/分
              </span>
              <input ms-if="el.infocode == 10 && hlpgbhideMsg.clbzCod.indexOf('10') != -1" type="text" class="extraInput" name="hspJzcspgInfCustom.clbzOther" ms-duplex-string="hlpgbpatientMsg.clbzOther">
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.clbzCod" ms-duplex-string="hlpgbhideMsg.clbzCod">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle lablineheight">
            静脉输液：
          </label>
          <span class="f-left">
            PV：<input type="text" class="extraInput" name="hspJzcspgInfCustom.jmsyPv" ms-duplex-string="hlpgbpatientMsg.jmsyPv">
            CV：<input type="text" class="extraInput" name="hspJzcspgInfCustom.jmsyCv" ms-duplex-string="hlpgbpatientMsg.jmsyCv">&emsp;
          </span>
          <label class="labtitle lablineheight">
            胸腔引流管：
          </label>
          <span class="f-left">
            <label ms-repeat="hlpgbmsgList.xqylgCodList" ms-attr-for="xqylgCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="xqylgCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="hlpgbradioclick('xqylgCod',$index)">
              {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspJzcspgInfCustom.xqylgCod" ms-duplex-string="hlpgbpatientMsg.xqylgCod">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle lablineheight">
            加压包扎：
          </label>
          <span class="f-left">
            部位：
            <input type="text" name="hspJzcspgInfCustom.jybzBw" class="extraInput" ms-duplex-string="hlpgbpatientMsg.jybzBw">
          </span>
          <label class="labtitle lablineheight">
            夹板固定：
          </label>
          <span class="f-left">
            部位：
            <input type="text" name="hspJzcspgInfCustom.jbgdBw" class="extraInput" ms-duplex-string="hlpgbpatientMsg.jbgdBw">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle lablineheight">
            牵引部位：
          </label>
          <span class="f-left">
            部位：
            <input type="text" class="extraInput" name="hspJzcspgInfCustom.qyBw" ms-duplex-string="hlpgbpatientMsg.qyBw">
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle lablineheight">
            血型时间：
          </label>
          <span class="f-left">
            <input class="spcWdate Wdate" type="text" name="hspJzcspgInfCustom.xxDat" readonly ms-duplex-string="hlpgbpatientMsg.xxDat"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </span>
          <label class="labtitle lablineheight">
            配血时间：
          </label>
          <input class="spcWdate Wdate" type="text" name="hspJzcspgInfCustom.pxDat" readonly ms-duplex-string="hlpgbpatientMsg.pxDat"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>
        <li class="fullli">
          <label class="labtitle lablineheight">
            输血时间：
          </label>
          <input class="spcWdate Wdate" type="text" name="hspJzcspgInfCustom.sxDat" readonly ms-duplex-string="hlpgbpatientMsg.sxDat"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>
        </ul>
      <ul class="content-ul">
        <p class="subtitle">
          <span class="spanTitle spanSpc">其它</span>
        </p>
        <li class="longSpcLi fullli">
          <label class="labtitle lablineheight">
            紧急联系：
          </label>
          <span class="span-wrapper">
            <span class="spanwth spanwthB">
              <label>联系人1：</label><input type="text" maxlength="10" name="hspJzcspgInfCustom.jjlxNam" ms-duplex-string="hlpgbpatientMsg.jjlxNam">
            </span>
            <span class="spanwth">
              <label>电话：</label><input type="text" maxlength="11" name="hspJzcspgInfCustom.jjlxTel" ms-duplex-string="hlpgbpatientMsg.jjlxTel"
                ms-keyup="hlpgbonlyNum('jjlxTel')" ms-input="hlpgbonlyNum('jjlxTel')" ms-change="hlpgbonlyNum('jjlxTel')">
            </span>
    
            <span class="spanwth">
              <label>联系人2：</label><input type="text" maxlength="10" name="hspJzcspgInfCustom.jjlxNam2" ms-duplex-string="hlpgbpatientMsg.jjlxNam2">
            </span>
            <span class="spanwth">
              <label>电话：</label><input type="text" maxlength="11" name="hspJzcspgInfCustom.jjlxTel2" ms-duplex-string="hlpgbpatientMsg.jjlxTel2"
                ms-keyup="hlpgbonlyNum('jjlxTel2')" ms-input="hlpgbonlyNum('jjlxTel2')" ms-change="hlpgbonlyNum('jjlxTel2')">
            </span>
          </span>
        </li>
        <li class="fullli">
          <label class="labtitle lablineheight">
            去向：
          </label>
          <input type="text" class="hidden" name="hspemginfCustom.firstsqlseq" ms-duplex-string="hlpgbpatientMsg.firstsqlseq">
          <input id="sqlSeqStr" class="hidden" type="text" name="hspsqlinfCustom.sqlSeq" ms-duplex-string="hlpgbpatientMsg.sqlSeq">
          <label class="form-text" ms-if="hlpgbpatientMsg.sqlSeq != hlpgbpatientMsg.firstsqlseq">
            <span class="span-zgInfo" id="sql_sqlDatTim">{{hlpgbpatientMsg.sqlDat}}</span>
            <span class="span-zgInfo" id="sqlStaStr">{{hlpgbpatientMsg.sqlStaStr}}</span>
            <span class="span-zgInfo" id="emg_emgFkName" ms-if="hlpgbpatientMsg.sqlStaCod == '2'">{{hlpgbpatientMsg.sqlDepName}}</span>
            <span class="span-zgInfo" id="emg_sqlDes" ms-if="hlpgbpatientMsg.sqlStaCod == '13'">{{hlpgbpatientMsg.sqlDes}}</span>
            <span class="span-zgInfo" id="emg_bedNam" ms-if="hlpgbpatientMsg.sqlStaCod == '6' || hlpgbpatientMsg.sqlStaCod == '11'">{{hlpgbpatientMsg.bedNam}}</span>
          </label>
          <label class="form-text" ms-if="hlpgbpatientMsg.sqlSeq == hlpgbpatientMsg.firstsqlseq">
            <span class="span-zgInfo">无</span>
          </label>
          <a class="commonbtn" href="javascript:;" onclick="outComeInfo()">转归登记</a>
          <a class="underLineText form-text" href="javascript:;" onclick="zginfo()">转归记录</a>
        </li>
      </ul>
      <textarea class="bigDataHlpgDiv" id="bigDataHlpgDiv" ms-duplex-string="hlpgbpatientMsg.hzDes" name="hspJzcspgInfCustom.hzDes"
      style="display: block;" /></textarea>
      <div class="sub-top">
        <span class="spanRight">
          <span class="spanTitle">记录时间：</span>
          <input class="Wdate spcWdate" type="text" name="hspJzcspgInfCustom.assessmentDat"
          ms-duplex-string="hlpgbpatientMsg.assessmentDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss', isShowClear:false, readOnly:true})">
          <span class="spanTitle">记录者签名：</span>
          <span class="relative">
            <input type="text" id="userSign" maxlength="10" name="hspJzcspgInfCustom.cbpgNam" ms-keydown="searchUser(event, 'recordName')" ms-duplex-string="hlpgbpatientMsg.cbpgNam">
            <div class="userList" id="userList">
            </div>
          </span>
        </span>
      </div>
      
      </span>
    </form>
    <div class="center">
      <!-- <a href="javascript:;" class="commonbtn btnLeft" onclick="connectField()">生成汇总记录</a> -->
      <a class="easyui-linkbutton" iconcls="icon-reload" onclick="reload()">刷新</a>
      <a class="easyui-linkbutton" iconcls="icon-ok" onclick="postPatientMsg()">保存</a>
      <a class="easyui-linkbutton" iconcls="icon-print" onclick="saveprint()">打印</a>
    </div>
  </div>


  <script type="text/javascript" charset="utf-8">
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        if ($('#username').is(':focus')) {
          searchUserName();
          return
        }
        if ($('#usernameB').is(':focus')) {
          searchUserNameB();
          return
        }
        if ($("#driverName").is(":focus")) {
         var flg = false;
         return flg;
        }
      })
    };

    $('#driverName').click(function (e) {
      e.stopPropagation();
      sub.isShowAbnDriverList = true;
    });

    $("body").click(function () {
      sub.isShowAbnScoList = false;
      sub.isShowDocList = false;
      sub.isShowAbnDriverList = false;
      $("#userList").hide();
      $("#userNameList").hide();
      $("#userNameBList").hide();
    });

    function searchUser(e, name) {
      if (event.keyCode == 13) {
        publicFun.SearchList("userSign", "userList")
      }
    }

    function searchUserName() {
      if (event.keyCode == 13) {
        publicFun.SearchList("username", "userNameList")
      }
    }

    function searchUserNameB() {
      if (event.keyCode == 13) {
        publicFun.SearchList("usernameB", "userNameBList")
      }
    }

    //保存护理评估表
    function postPatientMsg() {
      connectField()
      if(sub.aboutSco.nrsSeq == _emgSeq){
        sub.aboutSco.nrsSeq = ''
      }
      if(sub.aboutSco.gcsSeq == _emgSeq){
        sub.aboutSco.gcsSeq = ''
      }
      $("input[name='hspJzcspgInfCustom.emgSeq']").val(comdata.emgSeq);
      jquerySubByFId('jzcsform', jzcsinsertuser_callback, null, "json");
    }

    function jzcs_pinsertuser_callback(){
      s_print()
    }

    //护理评估表打印
    function saveprint() {
      connectField()
      if(sub.aboutSco.nrsSeq == _emgSeq){
        sub.aboutSco.nrsSeq = ''
      }
      if(sub.aboutSco.gcsSeq == _emgSeq){
        sub.aboutSco.gcsSeq = ''
      }
      $("input[name='hspJzcspgInfCustom.emgSeq']").val(comdata.emgSeq);
      jquerySubByFId('jzcsform', jzcs_pinsertuser_callback, null, "json");
    }
  </script>
</body>

</html>