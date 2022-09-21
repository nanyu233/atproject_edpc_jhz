<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>接收病人-抢救室</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/jsbrqjs.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hlpgb.css?v=${versionDay}">
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <script type="text/javascript" src="${baseurl}js/public.js?v=${versionDay}"></script>
  <script src="${baseurl}js/subpageJs/precheck/dkAndJhy.js?v=${versionDay}" type="text/javascript"></script>
  <script type="text/javascript">
    var _baseUrl = "${baseurl}",
      _emgSeq = "${emgSeq}",
      _cstNam = '${cstNam}',
      _islgbed = '${islgbed}', // 0 不显示留观床位  1 显示留观床位
      _isOpenKnowledge = '1', // 是否打开知识库 1-打开 0-关闭
      typeForm = 'qjs'; // 区别是哪个登记页面[误删]
    var _ecyjFlag = '${ecyjFlag}',
        _oldEmgSeq = '${firstemgseq}'
  </script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/locale/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/custom.jquery.form.js"></script>
  <script type="text/javascript" src="${baseurl}lib/custom.box.main.js"></script>
  <script type="text/javascript" src="${baseurl}lib/jquery.ajax.custom.extend.js"></script>
  <script type="text/javascript" src="${baseurl}lib/My97DatePicker/WdatePicker.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/hlpgb.avalon.js?v=${versionDay}" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/precheck/commonPrecheck.js?v=${versionDay}" type="text/javascript"></script>
  <script src="${baseurl}js/subpageJs/precheck/qjsPrecheck.js?v=${versionDay}" type="text/javascript"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="jsbrqjs">
  <form ms-controller="jsbrqjs" id="userform" action="${baseurl}hzszyyemg/addzyyemgsubmit_qjs.do" method="post" style="font-size: 12px;display: block;">
    <!-- 预检号 -->
    <input class="hidden" id="emg_emgSeq" type="text" name="hspemginfCustom.emgSeq" placeholder="预检号" readonly="readonly"
      value="${emgSeq}">
    <input class="hidden" type="text" name="hspemginfCustom.firstemgseq" readonly="readonly" value="${firstemgseq}">
    <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
    <OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width="0" height="0" align="center" hspace="0"
      vspace="0" style="position: absolute;top: -500px"></OBJECT>
    <div class="container-fluid clr head">
      <div class="medical-msg-container clr">
        <img class="floatLeft avatar" src="${baseurl}images/hems/jsbrqjs/head_portrait.png" alt="">
        <div class="medical-msg floatLeft">
          <div class="display-table">
            <div class="display-table-cell form-text text-right required-fields four-r-text">
              <i class="red">*</i> 就诊卡：
            </div>
            <div class="display-table-cell clr">
              <input class="medical-card" type="text" id="emg_vstCad" name="hspemginfCustom.vstCad" placeholder="就诊卡"
                ms-duplex-string="patientMsg.vstCad" maxlength="20">
              <a class="read-medical-card" href="javascript:;" onclick="getVisitingMsg()">读卡</a>
              <a class="form-text underLineText" href="javascript:;" ms-click="getOpenGhlb()">已挂号</a>
              <input name="hspemginfCustom.nation" ms-duplex-string="patientMsg.nation" class="hidden" type="text"/>
              <input name="hspemginfCustom.gzdw" ms-duplex-string="patientMsg.gzdw" class="hidden" type="text"/>
              <input name="hspemginfCustom.emgJob" ms-duplex-string="patientMsg.emgJob" class="hidden" type="text"/>
              <input name="hspemginfCustom.maritalStatus" ms-duplex-string="patientMsg.maritalStatus" class="hidden" type="text"/>
            </div>
          </div>
          <div class="display-table">
            <div class="display-table-cell form-text text-right required-fields four-r-text">
              <i class="red">*</i> 预检时间：
            </div>
            <div class="display-table-cell">
              <input class="medical-time Wdate" id="emg_emgDat" type="text" class="Wdate" name="hspemginfCustom.emgDat"
                ms-duplex-string="patientMsg.emgDat" onclick="WdatePicker({minDate:endMinDate(),maxDate:endMaxDate(),dateFmt:'yyyy/MM/dd HH:mm:ss'})"
                readonly>
            </div>
          </div>
          <label class="grnChl-container" for="isGreenChannel">
            <input type="checkbox" ms-attr-checked="patientMsg.grnChl==1" ms-click="judgeFlag('grnChl')">
            <a class="grnChl-btn" href="javascript:;" ms-class="active:patientMsg.grnChl==1" ms-click="judgeFlag('grnChl')">绿色通道</a>
            <input class="hidden" type="text" name="hspemginfCustom.grnChl" ms-attr-value="patientMsg.grnChl">
            <input type="checkbox" ms-attr-checked="patientMsg.swChl==1" ms-click="judgeFlag('swChl')">
            <a class="swChl-btn" href="javascript:;" ms-class="active:patientMsg.swChl==1" ms-click="judgeFlag('swChl')">三无人员</a>
            <input class="hidden" id="swChl" type="text" name="hspemginfCustom.swChl" ms-attr-value="patientMsg.swChl">
            <input type="checkbox" ms-attr-checked="patientMsg.qtsjFlg==1" ms-click="bindGroupEvent('check')"
              ms-attr-disabled="patientMsg.qtsjFlg==0">
            <a class="spChl-btn" href="javascript:;" ms-click="bindGroupEvent()">群体事件</a>
            <input class="hidden" type="text" id="qtsjFlg" name="hspemginfCustom.qtsjFlg" ms-attr-value="patientMsg.qtsjFlg">
            <input class="hidden" type="text" id="qtsjSeq" name="hspemginfCustom.qtsjSeq" ms-attr-value="patientMsg.qtsjSeq">
            <input type="text" id="massStartTime" class="hidden" />
            <input type="text" id="massEndTime" class="hidden" />
          </label>
        </div>
      </div>
      <div class="basic-msg-container">
        <div class="display-table basic-msg">
          <div class="display-table-cell form-text two-text">
            姓名：
          </div>
          <div class="display-table-cell">
            <input class="name" id="emg_cstNam" type="text" name="hspemginfCustom.cstNam" placeholder="姓名" ms-focus="cleanName()"
              ms-duplex-string="patientMsg.cstNam" maxlength="25">
            <input class="name" id="" type="hidden" name="hspemginfCustom.idNbr" ms-duplex-string="patientMsg.idNbr">
          </div>
          <div class="display-table-cell form-text two-text">
            性别：
          </div>
          <div class="display-table-cell">
            <select class="sex" id="emg_cstSexCod" class="width-auto" name="hspemginfCustom.cstSexCod" ms-duplex-string="patientMsg.cstSexCod">
              <option value="">请选择</option>
              <option ms-repeat="getMsg.cstSexCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </div>
          <div class="display-table-cell form-text four-text">
            出生日期：
          </div>
          <div class="display-table-cell">
            <input class="birthday Wdate" type="text" name="hspemginfCustom.bthDat" ms-duplex-string="patientMsg.bthDat"
              onclick="WdatePicker({maxDate:'%y/%M/%d',dateFmt:'yyyy/MM/dd'})">
          </div>
        </div>
        <div class="display-table basic-msg">
          <div class="display-table-cell form-text two-text">
            年龄：
          </div>
          <div class="display-table-cell clr">
            <input class="age" id="emg_cstAge" type="text" name="hspemginfCustom.cstAge" placeholder="年龄" ms-duplex-string="patientMsg.cstAge" maxlength="4"
             ms-keyup="onlyNum('patientMsg','cstAge')"  ms-change="onlyNum('patientMsg','cstAge')"  ms-input="onlyNum('patientMsg','cstAge')">&ensp;
            <select class="age-type" id="emg_cstAgeCod" name="hspemginfCustom.cstAgeCod" ms-duplex-string="patientMsg.cstAgeCod"
              ms-change="calcPatType()">
              <option ms-repeat="getMsg.cstAgeCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </div>
          <div class="display-table-cell form-text four-text">
            联系------方式 ：
          </div>
          <div class="display-table-cell">
            <input class="phone-number" type="text" name="hspemginfCustom.pheNbr" placeholder="联系方式" ms-duplex-string="patientMsg.pheNbr" maxlength="30" style="width: 164px;"
            ms-keyup="onlyNum('patientMsg','pheNbr')" ms-input="onlyNum('patientMsg','pheNbr')" ms-change="onlyNum('patientMsg','pheNbr')">
          </div>
        </div>
        <div class="display-table basic-msg">
          <div class="display-table-cell form-text four-text">
            联系地址：
          </div>
          <div class="display-table-cell">
            <input class="address" type="text" name="hspemginfCustom.cstAdr" placeholder="地址" ms-duplex-string="patientMsg.cstAdr" maxlength="100">
          </div>
          <div class="arrive-hosptial-msg">
            <div class="display-table-cell clr type-div">
              <div class="type-btn" ms-repeat="getMsg.patientTypList">
                <a class="score-description score-small" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('patientTyp', $index)">{{el.info}}</a>
              </div>
              <input class="hidden" type="text" name="hspemginfCustom.patientTyp" ms-duplex-string="patientMsg.patientTyp" id="patientType" />
            </div>
          </div>
        </div>
      </div>
      <div class="score-msg-container clr">
        <div class="level-msg floatLeft">
          <p class="level">
            <i ms-visible="patientMsg.emgDepCod === '' "></i>
            <i ms-visible="patientMsg.emgDepCod === '0' ">Ⅰ</i>
            <i ms-visible="patientMsg.emgDepCod === '1' ">Ⅱ</i>
            <i ms-visible="patientMsg.emgDepCod === '2' ">Ⅲ</i>
            <i ms-visible="patientMsg.emgDepCod === '3' ">Ⅳa</i>
            <i ms-visible="patientMsg.emgDepCod === '4' ">Ⅳb</i>
          </p>
          <p class="level-description" ms-class="level{{patientMsg.emgDepCod}}">分级</p>
          <input type="text" class="hidden" name="hspemginfCustom.emgDepCod" ms-duplex-string="patientMsg.emgDepCod" />
        </div>
        <div class="score-msg floatLeft" ms-visible="patientMsg.patientTyp !== '2'">
          <p class="score">
            {{patientMsg.mewsTotSco}}
          </p>
          <input class="hidden" id="emg_mewsTotSco" type="text" name="hspemginfCustom.mewsTotSco" ms-duplex-string="patientMsg.mewsTotSco">
          <a class="score-description" href="javascript:;" ms-click="MEWSbox()">MEWS</a>
        </div>
        <div class="score-msg floatLeft" ms-visible="patientMsg.patientTyp !== '2'" ms-duplex-string="patientMsg.remsTotSco">
          <p class="score">
            {{patientMsg.remsTotSco}}
          </p>
          <input class="hidden" id="emg_remsTotSco" type="text"  ms-duplex-string="patientMsg.remsTotSco">
          <input class="hidden" id="emg_remsDeath" type="text"  ms-duplex-string="patientMsg.remsDeath">
          <a class="score-description" href="javascript:;" ms-click="REMSbox()">REMS</a>
        </div>
        <input class="hidden" id="emg_nrsSco" type="text" placeholder="只读" readonly="true" name="hspNrsInfCustom.nrsSco"
          ms-duplex-string="patientMsg.nrsSco">
        <!-- <div class="score-msg floatLeft" ms-visible="patientMsg.patientTyp !== '2'">
          <p class="score">
            {{patientMsg.nrsSco}}
          </p>
          <a class="score-description" href="javascript:;" ms-click="NRSbox()">NRS</a>
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtbw" id="emg_nrsTtbw">
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtbwQt" id="emg_nrsTtbwQt">
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtxz" id="emg_nrsTtxz">
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtxzQt" id="emg_nrsTtxzQt">
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtsj" id="emg_nrsTtsj">
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtkz" id="emg_nrsTtkz">
          <input type="text" class="hidden" name="hspNrsInfCustom.nrsMemo" id="emg_nrsMemo">
        </div> -->
        <div class="score-msg floatLeft" ms-visible="patientMsg.patientTyp !== '2'">
          <p class="score">
            {{patientMsg.gcsTotSco}}
          </p>
          <input class="hidden" type="text" id="emg_eyeRctCod" name="hspemginfCustom.eyeRctCod" ms-duplex-string="aboutGCS.eyeRctCod">
          <input class="hidden" type="text" id="emg_lanRctCod" name="hspemginfCustom.lanRctCod" ms-duplex-string="aboutGCS.lanRctCod">
          <input class="hidden" type="text" id="emg_actRctCod" name="hspemginfCustom.actRctCod" ms-duplex-string="aboutGCS.actRctCod">
          <input class="hidden" type="text" id="emg_gcsTotSco" type="text" name="hspemginfCustom.gcsTotSco"
            ms-duplex-string="patientMsg.gcsTotSco">
          <a class="score-description" href="javascript:;" ms-click="GCSbox()">GCS</a>
        </div>
        <div class="score-msg floatLeft" ms-visible="patientMsg.patientTyp !== '2'">
          <p class="score">
            {{patientMsg.cramsTotSco}}
          </p>
          <input class="hidden" type="text" id="emg_sptLvlCod" name="hspemginfCustom.sptLvlCod" ms-duplex-string="aboutCRAMS.sptLvlCod">
          <input class="hidden" type="text" id="emg_lanLvlCod" name="hspemginfCustom.lanLvlCod" ms-duplex-string="aboutCRAMS.lanLvlCod">
          <input class="hidden" type="text" id="emg_cirLvlCod" name="hspemginfCustom.cirLvlCod" ms-duplex-string="aboutCRAMS.cirLvlCod">
          <input class="hidden" type="text" id="emg_breLvlCod" name="hspemginfCustom.breLvlCod" ms-duplex-string="aboutCRAMS.breLvlCod">
          <input class="hidden" type="text" id="emg_bdyLvlCod" name="hspemginfCustom.bdyLvlCod" ms-duplex-string="aboutCRAMS.bdyLvlCod">
          <input class="hidden" type="text" id="emg_cramsTotSco" type="text" name="hspemginfCustom.cramsTotSco"
            ms-duplex-string="patientMsg.cramsTotSco">
          <a class="score-description" href="javascript:;" ms-click="CRAMSbox()">CRAMS</a>
        </div>
      </div>
    </div>
    <div class="container-fluid clr">
      <div class="patient-msg-container">
        <!-- <div class="display-table arrive-hosptial-msg">
          <div class="arrive-person-container">
            <div class="display-table-cell form-text text-right six-text">
              卡类别：
            </div>
            <div class="display-table-cell clr">
              <label class="arrive-type" ms-repeat="getMsg.cardTypeList" ms-attr-for="cardType{{el.infocode}}">
                <input ms-attr-id="cardType{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="_radioCheck('cardType', $index)" />
                {{el.info}}
              </label>
              <input class="hidden" type="text" name="hspemginfCustom.cardType" ms-duplex-string="patientMsg.cardType" />
            </div>
          </div>
        </div> -->
      </div>
      <div class="patient-msg-container" ms-visible="patientMsg.grnChl==1 || patientMsg.qtsjFlg==1">
        <div class="display-table arrive-hosptial-msg">
          <div class="arrive-type-container" ms-visible="patientMsg.grnChl==1">
            <div class="display-table-cell form-text text-right six-text">
              绿色通道原因：
            </div>
            <div class="display-table-cell clr">
              <select name="hspemginfCustom.grnChlRsn" ms-attr-disabled="patientMsg.grnChl==0" ms-duplex-string="patientMsg.grnChlRsn">
                <option value="#">请选择</option>
                <option ms-repeat="getMsg.grnChlRsnList" ms-attr-value="el.infocode">{{el.info}}</option>
              </select>
            </div>
          </div>
          <div class="arrive-person-container">
            <div class="display-table-cell form-text text-right six-text" id="massTitle">
            </div>
            <div class="display-table-cell middleAlign clr" id="massText">
            </div>
          </div>
        </div>
      </div>
      <div class="patient-msg-container">
        <div class="display-table arrive-hosptial-msg">
          <div class="arrive-type-container">
            <div class="display-table-cell form-text text-right required-fields six-text">
              <i class="red">*</i> 到院方式：
            </div>
            <div class="display-table-cell clr">
              <label class="arrive-type" ms-repeat="getMsg.arvChlCodList">
                <input type="radio" name="hspemginfCustom.arvChlCod" ms-attr-value="el.infocode" ms-duplex-string="patientMsg.arvChlCod">
                {{el.info}}
              </label>
            </div>
          </div>
          <div class="arrive-person-container">
            <div class="display-table-cell form-text text-right required-fields four-r-text">
              <i class="red">*</i> 陪送人员：
            </div>
            <div class="display-table-cell clr">
              <label class="arrive-person" ms-repeat="getMsg.cmpPsnCodList" ms-attr-for="cmpPsnCod{{el.infocode}}">
                <input ms-attr-id="cmpPsnCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="patientMsg.cmpPsnCod"
                  ms-change="changeToStr('cmpPsnCod')" />
                {{el.info}}
              </label>
              <input class="hidden" type="text" name="hspemginfCustom.cmpPsnCod" ms-duplex="hideMsg.cmpPsnCod" />
            </div>
          </div>
        </div>
        <div class="display-table about-mews-container">
          <div class="display-table-cell leftPartTab">
            <div class="display-table-cell form-text text-right six-text" ms-class="RedwarningTw:patientInfFlg.tmpNbrFlag==1">
              <a class="read-blood-pressure" href="javascript:;" onclick="setEmgSeq()">采集</a>体温：
            </div>
            <div class="display-table-cell">
              <input class="temperature" id="emg_tmpNbr" type="text" placeholder="℃" name="hspemginfCustom.tmpNbr"
                ms-keyup="onlyNum('aboutMews','tmpNbr',1,100)" ms-change="onlyNum('aboutMews','tmpNbr',1,100)" ms-input="onlyNum('aboutMews','tmpNbr',1,100)"
                ms-duplex-string="aboutMews.tmpNbr">
            </div>
            <div class="display-table-cell form-text text-right two-gap-text" ms-class="RedwarningXl:patientInfFlg.hrtRteFlag==1">
              心率：
            </div>
            <div class="display-table-cell">
              <input class="heart-rate" id="emg_hrtRte" type="text" placeholder="次/分" maxlength="4" name="hspemginfCustom.hrtRte"
                ms-duplex-string="aboutMews.hrtRte" ms-keyup="onlyNum('aboutMews','hrtRte')" ms-change="onlyNum('aboutMews','hrtRte')"
                ms-input="onlyNum('aboutMews','hrtRte')">
            </div>
            <div class="display-table-cell form-text text-right two-gap-text" ms-class="RedwarningHx:patientInfFlg.breNbrFlag==1">
              呼吸：
            </div>
            <div class="display-table-cell">
              <input class="breathe" id="emg_breNbr" type="text" placeholder="次/分" maxlength="4" name="hspemginfCustom.breNbr"
                ms-duplex-string="aboutMews.breNbr" ms-keyup="onlyNum('aboutMews','breNbr')" ms-change="onlyNum('aboutMews','breNbr')"
                ms-input="onlyNum('aboutMews','breNbr')">
            </div>
          </div>
          <div class="display-table-cell form-text text-right four-r-text" ms-class="RedwarningSsy:patientInfFlg.sbpUpNbrFlag==1">
            血压：
          </div>
          <div class="display-table-cell type-div">
            <input class="blood-pressure" id="emg_sbpUpNbr" type="text" placeholder="收缩压" maxlength="4" name="hspemginfCustom.sbpUpNbr"
              ms-duplex-string="aboutMews.sbpUpNbr" ms-keyup="onlyNum('aboutMews','sbpUpNbr')" ms-change="onlyNum('aboutMews','sbpUpNbr')"
              ms-input="onlyNum('aboutMews','sbpUpNbr')">
            <i>-</i>
            <input class="blood-pressure" id="emg_sbpDownNbr" type="text" placeholder="舒张压" maxlength="4" name="hspemginfCustom.sbpDownNbr"
              ms-duplex-string="aboutMews.sbpDownNbr" ms-keyup="onlyNum('aboutMews','sbpDownNbr')" ms-change="onlyNum('aboutMews','sbpDownNbr')"
              ms-input="onlyNum('aboutMews','sbpDownNbr')">
          </div>
          <div class="display-table-cell form-text text-right five-text" ms-class="RedwarningXy:patientInfFlg.oxyNbrFlag==1">
            血氧饱和度：
          </div>
          <div class="display-table-cell">
            <input class="temperature" id="emg_oxyNbr" type="text" placeholder="%" maxlength="4" name="hspemginfCustom.oxyNbr"
              ms-duplex-string="patientMsg.oxyNbr" maxlength="4" ms-keyup="onlyNum('patientMsg','oxyNbr')" ms-change="onlyNum('patientMsg','oxyNbr')"
              ms-input="onlyNum('patientMsg','oxyNbr')">
          </div>
        </div>
        <div class="display-table about-mews-container" ms-visible="aboutMews.tmpNbr >= 38.5">
          <div class="display-table-cell form-text text-right min-line-height six-text">
            发热选项：
          </div>
          <div class="display-table-cell">
            <label class="irritability min-line-height" ms-repeat="getMsg.frCodList" ms-attr-for="frCod{{el.infocode}}">
              <input ms-attr-id="frCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="patientMsg.frCod"
                ms-change="arrToStr('frCod')" /> {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspemginfCustom.frCod" ms-duplex-string="hideMsg.frCod" />
          </div>
        </div>
        <div class="display-table" ms-visible="aboutMews.tmpNbr >= 38.5">
          <div class="display-table-cell form-text text-right six-text" ms-class="required-fields: aboutMews.tmpNbr >= 38.5">
            <i class="red" ms-visible="aboutMews.tmpNbr >= 38.5">*</i> 发热日期：
          </div>
          <div class="display-table-cell min-line-height">
            <input class="Wdate" id="frDat" type="text" name="hspemginfCustom.frDat" ms-duplex-string="patientMsg.frDat"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly>
          </div>
          <div class="display-table-cell form-text text-right s-four-text">
            疫区名称：
          </div>
          <div class="display-table-cell min-line-height">
            <input type="text" name="hspemginfCustom.infectedareaNam" ms-duplex-string="patientMsg.infectedareaNam" maxlength="20" />
          </div>
          <div class="display-table-cell form-text text-right four-text">
            职业：
          </div>
          <div class="display-table-cell min-line-height">
            <input type="text" ms-duplex-string="patientMsg.emgJob" maxlength="20" />
          </div>
          <div class="display-table-cell form-text text-right four-text">
            国籍：
          </div>
          <div class="display-table-cell min-line-height">
            <input type="text" name="hspemginfCustom.nationality" ms-duplex-string="patientMsg.nationality" maxlength="20" />
          </div>
        </div>
        <div class="display-table min-line-height">
          <div class="display-table-cell form-text text-right min-line-height six-text" style="color:red">
            异常项：
          </div>
          <div class="display-table-cell">
            <label class="exception min-line-height" ms-repeat="getMsg.refusedSurveyList" ms-attr-for="refusedSurvey{{el.infocode}}">
              <input name="p_refusedSurveyName" ms-attr-id="refusedSurvey{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode"
                ms-duplex="patientMsg.refusedSurvey" ms-change="changeToStr('refusedSurvey')" /> {{el.info}}
            </label>
            <input class="hidden" type="text" name="hspemginfCustom.refusedSurvey" ms-duplex-string="hideMsg.refusedSurvey" />
          </div>
        </div>
        <div class="display-table arrive-hosptial-msg">
          <div class="arrive-type-container">
            <div class="display-table-cell form-text text-right six-text">
              清醒程度：
            </div>
            <div class="display-table-cell middleAlign clr">
              <label ms-repeat="getMsg.senRctCodList" ms-attr-for="senRctCod{{el.infocode}}" class="arrive-type">
                <input ms-attr-id="senRctCod{{el.infocode}}" type="radio" ms-attr-value="el.infocode" name="hspemginfCustom.senRctCod"
                  ms-duplex-string="aboutMews.senRctCod" />
                {{el.info}}
              </label>
            </div>
          </div>
          <div class="arrive-person-container">
            <div class="display-table-cell form-text text-right four-r-text">
              意识状态：
            </div>
            <div class="display-table-cell middleAlign clr">
              <label ms-repeat="getMsg.senStuCodList" ms-attr-for="senStuCod{{el.infocode}}">
                <input ms-attr-id="senStuCod{{el.infocode}}" type="radio" ms-attr-value="el.infocode" name="hspemginfCustom.senStuCod"
                  ms-duplex-string="patientMsg.senStuCod"/>
                {{el.info}}
              </label>
            </div>
          </div>
        </div>
        <div class="display-table" ms-visible="patientMsg.patientTyp === '3'">
          <div class="display-table-cell form-text text-right six-text">
            阴道出血：
          </div>
          <div class="display-table-cell">
            <select class="patient-gone" name="hspemginfCustom.pregnantYdcxCod" ms-duplex-string="patientMsg.pregnantYdcxCod">
              <option value="">请选择</option>
              <option ms-repeat="getMsg.pregnantYdcxCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </div>
          <div class="display-table-cell form-text text-right s-four-text">
            宫缩频率：
          </div>
          <div class="display-table-cell">
            <select class="departments" name="hspemginfCustom.pregnantGsplCod" ms-duplex-string="patientMsg.pregnantGsplCod">
              <option value="">请选择</option>
              <option ms-repeat="getMsg.pregnantGsplCodList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
          </div>
        </div>
        <div class="display-table arrive-hosptial-msg">
          <div class="arrive-type-container">
            <div class="display-table-cell form-text text-right six-text">
              病种评估：
            </div>
            <div class="display-table-cell">
              <div class="trauma-container">
                <input class="hidden" id="cspgFlg" type="text" name="hspemginfCustom.cspgFlg" ms-duplex-string="patientMsg.cspgFlg">
                <input class="hidden" type="text" id="emg_cspgCod" name="hspemginfCustom.cspgCod" ms-duplex-string="patientMsg.cspgCod">
                <a class="score-description score-small" href="javascript:;" ms-click="cspgBox()" ms-class="active: patientMsg.cspgCod">创伤</a>
              </div>
              <div class="chest-pain-container">
                <input class="hidden" id="xtFlg" type="text" name="hspemginfCustom.xtFlg" ms-duplex-string="patientMsg.xtFlg">
                <input class="hidden" id="emg_xtCod" type="text" name="hspemginfCustom.xtCod" ms-duplex-string="patientMsg.xtCod">
                <input class="hidden" id="emg_xtSubCod" type="text" name="hspemginfCustom.xtSubCod" ms-duplex-string="patientMsg.xtSubCod">
                <a class="score-description score-small" href="javascript:;" ms-click="xtzbpgBox()" ms-class="active: patientMsg.xtCod">胸痛</a>
              </div>
              <div class="chest-distress-container">
                <input class="hidden" type="text" id="emg_mtCod" name="hspFastInfCustom.mtCod" ms-duplex-string="patientMsg.mtCod">
                <input class="hidden" type="text" id="emg_szthCod" name="hspFastInfCustom.szthCod" ms-duplex-string="patientMsg.szthCod">
                <input class="hidden" type="text" id="emg_wlCod" name="hspFastInfCustom.wlCod" ms-duplex-string="patientMsg.wlCod">
                <input class="hidden" id="czFlag" type="text" name="hspFastInfCustom.czFlag" ms-duplex-string="patientMsg.czFlag">
                <a class="score-description score-small" href="javascript:;" ms-click="czFaceBox()" ms-class="active: patientMsg.czFlag==1">卒中</a>
              </div>
              <div class="breathe-hard-container">
                <input class="hidden" id="hxknFlg" type="text" name="hspemginfCustom.hxknFlg" ms-duplex-string="patientMsg.hxknFlg">
                <input class="hidden" id="emg_hxknCod" type="text" name="hspemginfCustom.hxknCod" ms-duplex-string="patientMsg.hxknCod">
                <input class="hidden" id="emg_hxknSubCod" type="text" name="hspemginfCustom.hxknSubCod" ms-duplex-string="patientMsg.hxknSubCod">
                <a class="score-description score-des" href="javascript:;" ms-click="hxknzbBox()" ms-class="active: patientMsg.hxknCod">呼吸困难</a>
              </div>
              <div class="chest-distress-container">
                <label for="xfztFlg">
                  <input class="hidden" type="text" name="hspemginfCustom.xfztFlg" ms-duplex-string="patientMsg.xfztFlg">
                  <a class="score-description score-des" href="javascript:;" ms-click="judgeFlag('xfztFlg')" ms-class="active: patientMsg.xfztFlg==1">心肺骤停</a>
                </label>
              </div>
            </div>
          </div>
          <div class="arrive-person-container">
            <div class="display-table-cell form-text text-right four-r-text">
              评分评估：
            </div>
            <div class="display-table-cell min-line-height">
              <p class="middleGrap">
                <a class="score-description necessarySco" href="javascript:;" ms-click="specialBox()">特殊病人</a>
                <span id="specialContent"></span>
                <span ms-visible="patientMsg.specialOther === '#'">否</span>
                <input type="text" id="emg_specialOther" ms-duplex-string="patientMsg.specialOther" name="hspemginfCustom.specialOther"
                  class="hidden">
              </p>
              <p class="middleGrap m-l10">
                <a class="score-description necessarySco" href="javascript:;" ms-click="riskBox()">跌倒评估</a>
                <span ms-visible="patientMsg.falAssCod !== '#' && patientMsg.falAssCod !== ''">高危</span>
                <span ms-visible="patientMsg.falAssCod === '#'">非高危</span>
                <input type="text" id="emg_falAssCod" ms-duplex-string="patientMsg.falAssCod" name="hspFallAssInfCustom.fallAssCod"
                  class="hidden">
              </p>
              <p class="middleGrap m-l10" ms-visible="patientMsg.patientTyp === '2'">
                <a class="score-description pewsSco" href="javascript:;" ms-click="pewsBox()">PEWS</a>
                <span ms-visible="aboutPEWS.pewsSco !==''">{{aboutPEWS.pewsSco}}分</span>
                <span ms-visible="aboutPEWS.pewsSco ===''">未评分</span>
                <input class="hidden" type="text" name="hspPewsckInfCustom.actionCod" id="actionCod" ms-duplex-string="aboutPEWS.actionCod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.xxgSkinCod" id="xxgSkinCod" ms-duplex-string="aboutPEWS.xxgSkinCod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.xxgCrtCod" id="xxgCrtCod" ms-duplex-string="aboutPEWS.xxgCrtCod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.xxgXlCod" id="xxgXlCod" ms-duplex-string="aboutPEWS.xxgXlCod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.hxPlCod" id="hxPlCod" ms-duplex-string="aboutPEWS.hxPlCod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.hxXhCod" id="hxXhCod" ms-duplex-string="aboutPEWS.hxXhCod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.hxFio2Cod" id="hxFio2Cod" ms-duplex-string="aboutPEWS.hxFio2Cod">
                <input class="hidden" type="text" name="hspPewsckInfCustom.pewsSco" id="pewsSco" ms-duplex-string="aboutPEWS.pewsSco">
              </p>
            </div>
          </div>
        </div>
        <div class="display-table">
          <div class="display-table-cell form-text text-right required-fields six-text">
            <i class="red">*</i> 主诉症状：
          </div>
          <div class="display-table-cell" id="searchWrapper">
            <input class="first-impression" type="text" name="hspemginfCustom.preDgnCod" id="cbyxParams" onkeyup="pdkeycode(window.event)"
              autocomplete="off" ms-duplex-string="patientMsg.preDgnCod" maxlength="100">
            <div id="allBuddy" class="cbyxSearchList">
              <table cellspacing="0" cellpadding="0" border="0" width="100%" id="buddyListTable">
                <tbody>
                  <tr ms-repeat="cbyxSearchList" class="repeatTr" ms-click="chooseCbyx($index)">
                    <td>{{el.cbyx}}</td>
                  </tr>
                </tbody>
              </table>
            </div>
          </div>
          <div class="display-table-cell" id="knowledgeDiv">
            <a class="score-description score-des m-l10" href="javascript:;" ms-click="openKnowledge()">知识库</a>
            <span class="middleLabel m-l5" id="measure"></span>
          </div>
          <input type="text" class="hidden" id="checkLevel" />
        </div>
        <div class="display-table">
          <div class="display-table-cell form-text text-right required-fields six-text">
            <i class="red">*</i> 病人去向：
          </div>
          <div class="display-table-cell clr middleAlign">
            <label class="patient-gone" ms-repeat="getMsg.cstDspCodList" ms-visible="isVisibleCstDspCod(el.infocode)">
              <input type="radio" name="hspemginfCustom.cstDspCod" ms-attr-value="el.infocode" ms-duplex-string="patientMsg.cstDspCod">
              {{el.info}}
            </label>
          </div>
          <div class="display-table-cell form-text text-right required-fields two-gap-text">
            <i class="red">*</i> 分科：
          </div>
          <div class="display-table-cell">
            <select class="departments" ms-duplex-string="patientMsg.emgFkCod" ms-change="changeEmgFkCod()">
              <option value="">请选择</option>
              <option ms-repeat="getMsg.jzkscompctlList" ms-attr-value="el.comno">{{el.comcname}}</option>
            </select>
            <input class="hidden e_emgFkName" id="emg_emgFkName" type="text" name="hspemginfCustom.emgFkName"
              ms-duplex-string="patientMsg.emgFkName" />
            <input class="hidden" id="emg_emgFkCod" type="text" name="hspemginfCustom.emgFkCod" ms-duplex-string="patientMsg.emgFkCod" />
          </div>
          <input type="text" class="hidden" name="hspemginfCustom.emgBed" id="emgBed">
          <input type="text" class="hidden" name="hspemginfCustom.bedLgs" id="bedLgs">
          <div class="display-table-cell clr middleAlign">
            <div class="display-table-cell form-text text-right four-text">
              分诊医生：
            </div>
            <div class="display-table-cell">
              <div class="display-table-cell aboutAbnSco relative">
                <input class="from-other-hospital" type="text" name="hspemginfCustom.sqlDctNbr" ms-duplex-string="patientMsg.sqlDctNbr"
                  autocomplete="off" id="showSqlName" ms-keyup="cleanSqlText()" maxlength="5"/>
                <ul class="abnScoList" ms-visible="isShowDocList">
                  <li ms-repeat="getMsg.fzDocList" ms-click="chooseSqlDoc(el.usrname)">
                    {{el.usrname}}
                  </li>
                </ul>
              </div>
            </div>
          </div>
          <div ms-visible="isShowBed()">
            <div class="display-table-cell form-text text-right two-gap-text">
              床位：
            </div>
            <div class="display-table-cell">
              <select class="departments bedInfo" ms-duplex-string="patientMsg.bedid" name="hspemginfCustom.bedid" id="bedId">
              </select>
            </div>
          </div>
        </div>
        <div class="display-table" ms-visible="patientMsg.patientTyp !== '2'">
          <div class="display-table-cell form-text text-right required-fields six-text" style="line-height:63px;">
            <i class="red">*</i> NRS评分：
          </div>
          <div class="display-table-cell">
            <a ms-repeat="['00','01','02','03','04','05','06','07','08','09','10']" class="face" ms-class-1="face-{{el}}"
              ms-class-2="active:$index==patientMsg.nrsSco" href="javascript:;" ms-click="chooseAche($index)"></a>
          </div>
        </div>
        <div ms-visible="patientMsg.cstSexCod === '1'" class="display-table min-line-height">
          <div class="display-table-cell form-text text-right min-line-height six-text" ms-class="required-fields: patientMsg.patientTyp !== '2'">
            <i class="red" ms-visible="patientMsg.patientTyp !== '2'">*</i> 女性月经史：
          </div>
          <div class="display-table-cell">
            <label class="menstruation min-line-height" ms-repeat="getMsg.mnsSitCodList">
              <input ms-attr-id="mnsSitCod{{el.infocode}}" type="radio" ms-attr-value="el.infocode"
                ms-duplex-string="patientMsg.mnsSitCod" />{{el.info}}
            </label>
            <input type="text" class="hidden" name="hspemginfCustom.mnsSitCod" ms-duplex-string="patientMsg.mnsSitCod">
            <i ms-visible=" patientMsg.mnsSitCod== '1' ">第 <input type="text" name="hspemginfCustom.caseHis" class="iptbox"
              ms-duplex-string="patientMsg.caseHis" ms-keyup="onlyNum('patientMsg','caseHis',1,100)" ms-change="onlyNum('patientMsg','caseHis',1,100)" 
              ms-input="onlyNum('patientMsg','caseHis',1,100)" > 周</i>
          </div>
        </div>
        <div class="middleLabel">
          <div class="display-table-cell form-text text-right required-fields middleLabel six-text">
            <i class="red">*</i> 过敏史：
          </div>
          <div class="display-table-cell">
            <label class="irritability middleLabel" ms-repeat="getMsg.algHonList">
              <input ms-attr-id="algHon{{el.infocode}}" type="radio" name="hspemginfCustom.algHon" ms-attr-value="el.infocode"
                ms-duplex-string="patientMsg.algHon" />{{el.info}}
            </label>
            <label class="irritability middleLabel" ms-repeat="getMsg.algTypCodList">
              <input ms-attr-id="algTypCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex-string="patientMsg.algTypCod" />
              {{el.info}}
              <input ms-if="isShowAlgTypDes && el.infocode == 6" maxlength="50" type="text" name="hspemginfCustom.algTypDes"
                ms-duplex-string="patientMsg.algTypDes" />
            </label>
            <input class="hidden" type="text" name="hspemginfCustom.algTypCod" ms-duplex-string="hideMsg.algTypCod" />
          </div>
        </div>
        <div class="middleLabel">
          <div class="display-table-cell form-text text-right middleLabel six-text">
            既往史：
          </div>
          <div class="display-table-cell">
            <label class="medical-history middleLabel" ms-repeat="getMsg.pastHisCodList">
              <input ms-attr-id="pastHisCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode"
                ms-duplex="patientMsg.pastHisCod" ms-change="changeToStr('pastHisCod')"/> {{el.info}}
              <input ms-if="isShowPastHis && el.infocode == 450" maxlength="50" type="text" name="hspemginfCustom.pastHis"
                ms-duplex-string="patientMsg.pastHis" class="middle-input-wth" />
            </label>
            <input class="hidden" type="text" name="hspemginfCustom.pastHisCod" ms-duplex-string="hideMsg.pastHisCod" />
          </div>
        </div>
        <div class="display-table">
          <div class="display-table-cell form-text text-right six-text">
            其他医院送入：
          </div>
          <div class="display-table-cell aboutAbnSco" style="position: relative;">
            <input class="from-other-hospital" type="text" name="hspemginfCustom.abnScoNme" ms-duplex-string="patientMsg.abnScoNme"
              id="showName" ms-keyup="cleanAbnSco()" autocomplete="off" maxlength="50">
            <input class="hidden" type="text" name="hspemginfCustom.abnSco" ms-duplex-string="patientMsg.abnSco">
            <ul class="abnScoList" ms-visible="isShowAbnScoList">
              <li ms-repeat="getMsg.hspScoCustomList" ms-click="chooseAbnSco(el.id,el.scoName)">
                {{el.scoName}}
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="display-table-cell table-panel-level">
        <div class="panel min-panel">
          <div class="panel-heading bg-cyan">
            <i class="red">*</i> 修订分级
            <span class="levelShow">
              <i ms-visible="patientMsg.chkLvlCod === '' "></i>
              <i ms-visible="patientMsg.chkLvlCod === '0' " class="levelAbg">自动分级 Ⅰ级</i>
              <i ms-visible="patientMsg.chkLvlCod === '1' " class="levelBbg">自动分级 Ⅱ级</i>
              <i ms-visible="patientMsg.chkLvlCod === '2' " class="levelCbg">自动分级 Ⅲ级</i>
              <i ms-visible="patientMsg.chkLvlCod === '3' " class="levelDbg">自动分级 Ⅳa级</i>
              <i ms-visible="patientMsg.chkLvlCod === '4' " class="levelDbg">自动分级 Ⅳb级</i>
            </span>
          </div>
          <div class="panel-body">
            <label class="level-yujian" ms-repeat="getMsg.chkLvlCodList">
              <input ms-attr-id="modLvlCod{{el.infocode}}" type="radio" ms-attr-value="el.infocode" ms-duplex-string="patientMsg.modLvlCod" />
              {{el.info}}
            </label>
            <div>
              <label style="font-size: 14px;line-height: 1.5;">
                说明：
                <input id="emg_modLvlDes" type="text" name="hspemginfCustom.modLvlDes" ms-duplex-string="patientMsg.modLvlDes"
                  class="normal-wth" maxlength="100">
              </label>
            </div>
            <input class="hidden" id="loopModLvlCod" type="text" name="hspemginfCustom.modLvlCod" ms-duplex-string="patientMsg.modLvlCod">
            <input class="hidden" id="chkLvlCod" type="text" name="hspemginfCustom.chkLvlCod" ms-duplex-string="patientMsg.chkLvlCod">
          </div>
        </div>
        <div class="panel min-panel">
          <div class="panel-heading bg-cyan">
            <i class="red">*</i> 急诊分区
          </div>
          <div class="panel-body">
            <label class="jizhenfenqu" ms-repeat="getMsg.emgAreCodList">
              <input ms-attr-id="emgAreCod{{el.infocode}}" type="radio" ms-attr-value="el.infocode" ms-duplex-string="patientMsg.emgAreCod" />{{el.info}}
            </label>
            <input class="hidden" type="text" name="hspemginfCustom.emgAreCod" ms-duplex-string="patientMsg.emgAreCod">
          </div>
        </div>
      </div>
    </div>
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/hlpgb/hlpgb.jsp"></jsp:include>
    <div class="container-fluid" style="text-align: center;">
      <a class="easyui-linkbutton" iconcls="icon-ok" id="save" onclick="postPatientMsg()">保存</a>
      <a class="easyui-linkbutton" iconcls="icon-ok" onclick="postPatientMsg('p')">保存并打印</a>
      <a class="easyui-linkbutton" iconcls="icon-print" onclick="printXXT()">打印</a>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/precheck/printFz.jsp"></jsp:include>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/directionKeycode.js"></script>
  <script type="text/javascript">
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        if ($("#userSign").is(":focus")) {
          searchUser();
          flg = false;
        }
        if ($('#username').is(':focus')) {
          searchUserName();
          flg = false;
        }
        return flg;
      })
    };
    //预览信息条--做演示用
    function printXXT() {
      printFz()
    };

    var editFlag = '0';
    function toggleedit() {
      if (editFlag === '0') {
        editFlag = '1';
        $(".edit-div").find('span').html("关闭");
        $(".queryhlpgb").css("display", "inline-block");
      } else {
        editFlag = '0';
        $(".edit-div").find('span').html("编辑");
        $(".queryhlpgb").css("display", "none");
      }
    }

    function postPatientMsg(print) {
      var emgBedInfo = $('#bedId').val();
      if (vm.patientMsg.cstDspCod == 11) { // 留观
        $('#bedLgs').val(emgBedInfo);
        $('#emgBed').val('');
      } else if (vm.patientMsg.cstDspCod == 6) { // 留抢
        $('#emgBed').val(emgBedInfo);
        $('#bedLgs').val('');
      } else {
        $('#emgBed').val('');
        $('#bedLgs').val('');
      }
      var allPostMsg = jsbrFun.getAllPostMsg();
      switch (commonFun.getPatientType()) {
        case '0':
          if (jsbrFun.checkNull(jsbrAlertMsg.child, allPostMsg) === false) {
            return
          }
          break;
        case '2':
          if (jsbrFun.checkNull(jsbrAlertMsg.adultWoman, allPostMsg) === false) {
            return
          }
          break;
        default:
          if (jsbrFun.checkNull(jsbrAlertMsg.adultMan, allPostMsg) === false) {
            return
          }
          break;
      }
      if (allPostMsg.algHon == 2 && allPostMsg.algTypCod === '') {
        publicFun.alert("请选择相应的过敏内容");
        return false
      }
      if (allPostMsg.abnSco != "" && allPostMsg.abnScoName == "") {
        publicFun.alert("出车范围无效");
        return false
      }
      if ((sub.hlpgbpatientMsg.qtObj1Rs != '' || sub.hlpgbpatientMsg.qtObj1Dat != '') && sub.hlpgbpatientMsg.qtObj1Nam == '') {
        publicFun.alert("请输入皮试项目");
        return false
      }
      if ((sub.hlpgbpatientMsg.qtObj2Rs != '' || sub.hlpgbpatientMsg.qtObj2Dat != '') && sub.hlpgbpatientMsg.qtObj2Nam == '') {
        publicFun.alert("请输入皮试项目");
        return false
      }
      var ConnectStringRecord = connectContent();
      if (ConnectStringRecord != '') {
        var finalFieldRecord = ConnectStringRecord.substring(0, ConnectStringRecord.length - 1);//截取开始到长度减-1的字符串，去掉逗号
        finalFieldRecord += ';';
        $('#bigDataHlpgDiv').val(finalFieldRecord);
        $("#bigDataHlpgDiv").show();
      } else {
        $('#bigDataHlpgDiv').val('');
        $("#bigDataHlpgDiv").hide();
      }
      _confirm('确定提交吗？', null, function () {
        if (vm.patientMsg.patientTyp == '2') {
          vm.patientMsg.pregnantGsplCod = '';
          vm.patientMsg.pregnantYdcxCod = '';
          vm.patientMsg.cramsTotSco = '';
          vm.patientMsg.nrsSco = null;
          for (var k in vm.aboutCRAMS) {
            vm.aboutCRAMS[k] = ''
          }
        }
        if (vm.patientMsg.patientTyp == '3') {
          for (var k in vm.aboutPEWS) {
            vm.aboutPEWS[k] = ''
          }
        }
        if(_ecyjFlag == '1'){
            $('#userform').attr('action','${baseurl}hzszyyemg/ecyjsubmit.do')
        }
        jquerySubByFId('userform', insertuser_callback, print, "json");
      })
    }

    function insertuser_callback(data, print) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}/first.do";
        });
      } else {
        message_alert(data);
        if (data.resultInfo.type == '1') {
          if (print == "p") {
            printXXT()
          }
          var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
          setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 1000);
          // setTimeout("parent.closemodalwindow()", 1000);
          // setTimeout('refreshjz()', 1000)
        }
      }
    }

    function refreshjz() {
      var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
      var currTab = parent.$("#tabs").tabs("getTab", menuName);
      parent.$("#tabs").tabs("update", {
        tab: currTab,
        options: {
          content: parent.createFrame("${baseurl}hzszyyemg/queryjsbrqjs.do", 0)
        }
      })
    }

    function getSocketCard() {
      var _url = _baseUrl + "card/readCard.do";
      $.ajax({
        async: false,
        url: _url,
        type: "post",
        success: function (res) {
          alert("#消息码#：" + res.code + "#消息#: " + res.msg + "#数据#:" + res.data)
        }
      })
    }
    $('body').click(function () {
      vm.isShowAbnScoList = false;
      vm.isShowDocList = false;
    });
    $('#showName').click(function (e) {
      // vm.getAbnSco($('#showName').val());
      e.stopPropagation();
      vm.isShowAbnScoList = true;
    });
    $('#showSqlName').click(function (e) {
      e.stopPropagation();
      vm.isShowDocList = true;
    });
  </script>
</body>

</html>