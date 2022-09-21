<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>接收病人-抢救室</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/at-font/style.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/precheck.css?v=${versionDay}">
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
      _oldEmgSeq = '${firstemgseq}';
  </script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/locale/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/custom.jquery.form.js"></script>
  <script type="text/javascript" src="${baseurl}lib/custom.box.main.js"></script>
  <script type="text/javascript" src="${baseurl}lib/jquery.ajax.custom.extend.js"></script>
  <script type="text/javascript" src="${baseurl}lib/My97DatePicker/WdatePicker.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/precheckPage/commonPrecheck.js?v=${versionDay}" type="text/javascript"></script>
  <script src="${baseurl}js/subpageJs/precheckPage/qjsPrecheck.js?v=${versionDay}" type="text/javascript"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="jsbrqjs">
  <form ms-controller="jsbrqjs" id="userform" action="${baseurl}hzszyyemg/addzyyemgsubmit_qjs.do" method="post" class="content-form">
    <input type="hidden" name="formToken" value="${formToken}" />
    <!-- 预检号 -->
    <input class="hidden" id="emg_emgSeq" type="text" name="hspemginfCustom.emgSeq" placeholder="预检号" readonly="readonly"
      value="${emgSeq}">
    <input class="hidden" type="text" name="hspemginfCustom.firstemgseq" readonly="readonly" value="${firstemgseq}">
    <div class="page-btn">
      <a class="font-btn right-gap-btn" href="javascript:;"><i class="at-fa-record"></i>建档</a>
      <a class="font-btn right-gap-btn" href="javascript:;" ms-click="getOpenGhlb()"><i class="at-fa-register_hos"></i>已挂号</a>
      <a class="font-btn right-gap-btn" href="javascript:;" ms-click="bindGroupEvent()"><i class="at-fa-mass"></i>群体事件</a>
      <input class="hidden" type="text" id="qtsjFlg" name="hspemginfCustom.qtsjFlg" ms-attr-value="patientMsg.qtsjFlg">
      <input class="hidden" type="text" id="qtsjSeq" name="hspemginfCustom.qtsjSeq" ms-attr-value="patientMsg.qtsjSeq">
      <input type="text" id="massStartTime" class="hidden" />
      <input type="text" id="massEndTime" class="hidden" />
      <span id="massTitle"></span>
      <span id="massText"></span>
      <!-- <a class="commonbtn" href="javascript:;" ms-click="getOpenGhlb()">预检列表</a> -->
    </div>
    <div class="content-page">
      <div class="half-div">
        <p class="part-title">
          <span>基本信息</span>
          <span class="gray-span">预检时间</span>
          <input class="Wdate no-line-input" id="emg_emgDat" type="text" class="Wdate" name="hspemginfCustom.emgDat"
            ms-duplex-string="patientMsg.emgDat" onclick="WdatePicker({minDate:endMinDate(),maxDate:endMaxDate(),dateFmt:'yyyy/MM/dd HH:mm:ss'})"
            readonly>
        </p>
        <div class="basic-item">
          <div class="left-img">
            <img class="floatLeft avatar" src="${baseurl}images/hems/jsbrqjs/head_portrait.png">
          </div>
          <div class="right-msg">
            <div class="floatLeft">
              <span class="form-text four-text required-fields">就诊卡<i class="red">*</i></span>
              <input class="floatLeft" type="text" id="emg_vstCad" name="hspemginfCustom.vstCad" ms-duplex-string="patientMsg.vstCad"
                maxlength="20">
              <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg()">读卡</a>
              <input name="hspemginfCustom.nation" ms-duplex-string="patientMsg.nation" class="hidden" type="text" />
              <input name="hspemginfCustom.gzdw" ms-duplex-string="patientMsg.gzdw" class="hidden" type="text" />
              <input name="hspemginfCustom.emgJob" ms-duplex-string="patientMsg.emgJob" class="hidden" type="text" />
              <input name="hspemginfCustom.maritalStatus" ms-duplex-string="patientMsg.maritalStatus" class="hidden" type="text" />
              <input type="text" class="hidden" ms-duplex-string="patientMsg.patientTyp" name="hspemginfCustom.patientTyp" id="patientType"/>
            </div>
            <div class="floatLeft">
              <div class="floatLeft id-item">
                <span class="form-text four-text required-fields">姓名<i class="red">*</i></span>
                <input class="left-text" id="emg_cstNam" type="text" name="hspemginfCustom.cstNam" ms-focus="cleanName()"
                  ms-duplex-string="patientMsg.cstNam" maxlength="25" />
              </div>
              <div class="floatLeft m-l5">
                <span class="form-text two-text">性别</span>
                <select class="sex-type" id="emg_cstSexCod" class="width-auto" name="hspemginfCustom.cstSexCod"
                  ms-duplex-string="patientMsg.cstSexCod">
                  <option value=""></option>
                  <option ms-repeat="getMsg.cstSexCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
              </div>
            </div>
            <div class="floatLeft">
              <div class="floatLeft">
                <span class="form-text four-text">出生日期</span>
                <input class="input-date Wdate" type="text" name="hspemginfCustom.bthDat" ms-duplex-string="patientMsg.bthDat"
                  onclick="WdatePicker({maxDate:'%y/%M/%d',dateFmt:'yyyy/MM/dd'})">
              </div>
              <div class="floatLeft m-l5">
                <span class="form-text two-text">年龄</span>
                <input class="age" id="emg_cstAge" type="text" name="hspemginfCustom.cstAge" ms-duplex-string="patientMsg.cstAge"
                  maxlength="4" ms-keyup="onlyNum('patientMsg','cstAge')" ms-change="onlyNum('patientMsg','cstAge')"
                  ms-input="onlyNum('patientMsg','cstAge')">&ensp;
                <select class="age-type" id="emg_cstAgeCod" name="hspemginfCustom.cstAgeCod" ms-duplex-string="patientMsg.cstAgeCod"
                  ms-change="calcPatType()">
                  <option ms-repeat="getMsg.cstAgeCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
              </div>
            </div> 
          </div>
          <div class="left-line-part">
            <div class="left-line-div">
              <span class="form-text four-text">身份证号</span>
              <input class="left-text" type="text" name="hspemginfCustom.idNbr" ms-duplex-string="patientMsg.idNbr"
                maxlength="20">
            </div>
            <div class="left-line-div">
              <span class="form-text four-text">联系方式</span>
              <input type="text" name="hspemginfCustom.pheNbr" ms-duplex-string="patientMsg.pheNbr" maxlength="30"
                ms-keyup="onlyNum('patientMsg','pheNbr')" ms-change="onlyNum('patientMsg','pheNbr')" ms-input="onlyNum('patientMsg','pheNbr')">
            </div>
            <div class="left-line-div">
              <span class="form-text four-text">联系地址</span>
              <input type="text" name="hspemginfCustom.cstAdr" ms-duplex-string="patientMsg.cstAdr" maxlength="100">
            </div>
          </div>
        </div>
        <div class="total-item normal-line bottom-line">
          <a class="check-btn right-gap-btn left-line-gap" href="javascript:;" ms-class="active:patientMsg.grnChl==1"
            ms-class-2="level-btn3: patientMsg.grnChl==1" ms-click="judgeFlag('grnChl')">绿色通道</a>
          <input class="hidden" type="text" name="hspemginfCustom.grnChl" ms-attr-value="patientMsg.grnChl">
          <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active:patientMsg.swChl==1" ms-click="judgeFlag('swChl')">三无人员</a>
          <input class="hidden" id="swChl" type="text" name="hspemginfCustom.swChl" ms-attr-value="patientMsg.swChl">

          <input class="hidden" id="cspgFlg" type="text" name="hspemginfCustom.cspgFlg" ms-duplex-string="patientMsg.cspgFlg">
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('cspgFlg')" ms-class="active: patientMsg.cspgFlg == 1">创伤</a>

          <input class="hidden" id="xtFlg" type="text" name="hspemginfCustom.xtFlg" ms-duplex-string="patientMsg.xtFlg">
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('xtFlg')" ms-class="active: patientMsg.xtFlg == 1">胸痛</a>
          
          <input class="hidden" id="czFlag" type="text" name="hspFastInfCustom.czFlag" ms-duplex-string="patientMsg.czFlag">
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('czFlag')" ms-class="active: patientMsg.czFlag==1">卒中</a>
          
          <input class="hidden" id="hxknFlg" type="text" name="hspemginfCustom.hxknFlg" ms-duplex-string="patientMsg.hxknFlg">
          <input class="hidden" id="emg_hxknCod" type="text" name="hspemginfCustom.hxknCod" ms-duplex-string="patientMsg.hxknCod">
          <input class="hidden" id="emg_hxknSubCod" type="text" name="hspemginfCustom.hxknSubCod" ms-duplex-string="patientMsg.hxknSubCod">
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('hxknFlg')" ms-class="active: patientMsg.hxknFlg == 1">呼吸困难</a>

          <input class="hidden" type="text" name="hspemginfCustom.xfztFlg" ms-duplex-string="patientMsg.xfztFlg">
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('xfztFlg')" ms-class="active: patientMsg.xfztFlg==1">心肺骤停</a>

          <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active:patientMsg.pregnant==1" ms-click="judgeFlag('pregnant')">孕产妇</a>
          <input class="hidden" id="pregnant" type="text" ms-attr-value="patientMsg.pregnant">
        </div>
        <div class="total-item" ms-visible="patientMsg.grnChl==1">
          <span class="form-text four-text">绿通原因</span>
          <select class="total-input-wth" name="hspemginfCustom.grnChlRsn" ms-attr-disabled="patientMsg.grnChl==0"
            ms-duplex-string="patientMsg.grnChlRsn">
            <option value="#">请选择</option>
            <option ms-repeat="getMsg.grnChlRsnList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="total-item">
          <span class="form-text four-text" ms-class="required-fields: patientMsg.patientTyp != '2'">
            到院方式<i class="red" ms-visible="patientMsg.patientTyp != '2'">*</i>
          </span>
          <label ms-repeat="getMsg.arvChlCodList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('arvChlCod', $index)">{{el.info}}</a>
          </label>
          <span class="spanRelative" ms-visible="patientMsg.arvChlCod == 9">
            <input type="text" name="hspemginfCustom.abnScoNme" ms-duplex-string="patientMsg.abnScoNme" id="showName" ms-keyup="cleanAbnSco()"
              autocomplete="off" maxlength="50">
            <ul class="userList topList" ms-visible="isShowAbnScoList">
              <li ms-repeat="getMsg.otherHospitalNameList" ms-click="chooseAbnSco(el.id, el.scoName)">
                {{el.scoName}}
              </li>
            </ul>
          </span>
          <input type="text" class="hidden" name="hspemginfCustom.arvChlCod" ms-duplex-string="patientMsg.arvChlCod" />
        </div>
        <div class="total-item">
          <span class="form-text four-text required-fields">
            陪送人员<i class="red">*</i>
          </span>
          <label ms-repeat="getMsg.cmpPsnCodList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_checkClicks('cmpPsnCod', $index)">{{el.info}}</a>
          </label>
          <input class="hidden" type="text" name="hspemginfCustom.cmpPsnCod" ms-duplex="hideMsg.cmpPsnCod" />
        </div>
        <div class="total-item">
          <span class="form-text four-text" ms-class="required-fields: patientMsg.patientTyp !== '2'">
            过敏史<i class="red" ms-visible="patientMsg.patientTyp !== '2'">*</i>
          </span>
          <label class="right-px middleLabel" ms-repeat="getMsg.algHonList">
            <input ms-attr-id="algHon{{el.infocode}}" type="radio" name="hspemginfCustom.algHon" ms-attr-value="el.infocode"
              ms-duplex-string="patientMsg.algHon" /> {{el.info}}
          </label>
        </div>
        <div class="total-item m-b5" ms-visible="patientMsg.algHon == 2">
          <span class="form-text four-text"></span>
          <label class="right-px middleLabel" ms-repeat="getMsg.algTypCodList">
            <input ms-attr-id="algTypCod{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex-string="patientMsg.algTypCod" />
            {{el.info}}
            <input ms-if="isShowAlgTypDes && el.infocode == 6" maxlength="50" type="text" name="hspemginfCustom.algTypDes"
              ms-duplex-string="patientMsg.algTypDes" class="normal-wth" />
          </label>
          <input class="hidden" type="text" name="hspemginfCustom.algTypCod" ms-duplex-string="hideMsg.algTypCod" />
        </div>
        <div class="total-item">
          <span class="form-text four-text">
            既往史
          </span>
          <label ms-repeat="getMsg.pastHisCodList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_checkClicks('pastHisCod', $index)">{{el.info}}</a>
            <input ms-if="isShowPastHis && el.infocode == 450" maxlength="50" type="text" name="hspemginfCustom.pastHis"
              ms-duplex-string="patientMsg.pastHis" />
          </label>
          <input class="hidden" type="text" name="hspemginfCustom.pastHisCod" ms-duplex-string="hideMsg.pastHisCod" />
        </div>
        <div class="total-item" ms-visible="patientMsg.cstSexCod === '1'">
          <span class="form-text four-text" ms-class="required-fields: patientMsg.patientTyp !== '2'">
            月经史<i class="red" ms-visible="patientMsg.patientTyp !== '2'">*</i>
          </span>
          <label ms-repeat="getMsg.mnsSitCodList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('mnsSitCod', $index)">{{el.info}}</a>
          </label>
          <input type="text" class="hidden" name="hspemginfCustom.mnsSitCod" ms-duplex-string="patientMsg.mnsSitCod" />
          <i ms-visible=" patientMsg.mnsSitCod== '1' ">第 <input type="text" name="hspemginfCustom.caseHis" class="sm-box"
              ms-duplex-string="patientMsg.caseHis" ms-keyup="onlyNum('patientMsg','caseHis',1,100)" ms-input="onlyNum('patientMsg','caseHis',1,100)"
              ms-change="onlyNum('patientMsg','caseHis',1,100)"> 周</i>
        </div>
        <div class="half-item" ms-visible="patientMsg.patientTyp === '3'">
          <span class="form-text four-text">阴道出血</span>
          <select class="bed-pos" name="hspemginfCustom.pregnantYdcxCod" ms-duplex-string="patientMsg.pregnantYdcxCod">
            <option value="">请选择</option>
            <option ms-repeat="getMsg.pregnantYdcxCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="half-item" ms-visible="patientMsg.patientTyp === '3'">
          <span class="form-text four-text">宫缩频率</span>
          <select class="bed-pos" name="hspemginfCustom.pregnantGsplCod" ms-duplex-string="patientMsg.pregnantGsplCod">
            <option value="">请选择</option>
            <option ms-repeat="getMsg.pregnantGsplCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <p class="part-title">
          <span>生命体征</span>
          <a class="font-btn m-l10" href="javascript:;" onclick="setEmgSeq()"><i class="at-fa-relevancy"></i>采集数据</a>
        </p>
        <div class="total-item up-down-px">
          <label ms-repeat="getMsg.refusedSurveyList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('refusedSurvey', $index)">{{el.info}}</a>
          </label>
          <input type="text" class="hidden" name="hspemginfCustom.refusedSurvey" ms-duplex-string="patientMsg.refusedSurvey" />
        </div>
        <div class="total-item">
          <div class="sign-div">
            <p ms-class="RedwarningTw:patientInfFlg.tmpNbrFlag==1">体温</p>
            <div>
              <input id="emg_tmpNbr" type="text" class="underline-input" name="hspemginfCustom.tmpNbr" ms-duplex-string="aboutMews.tmpNbr"
                ms-keyup="onlyNum('aboutMews','tmpNbr',1,100)" ms-input="onlyNum('aboutMews','tmpNbr',1,100)" ms-change="onlyNum('aboutMews','tmpNbr',1,100)">℃
            </div>
          </div>
          <div class="sign-div">
            <p ms-class="RedwarningXl:patientInfFlg.hrtRteFlag==1">心率</p>
            <div>
              <input id="emg_hrtRte" type="text" class="underline-input" maxlength="4" name="hspemginfCustom.hrtRte"
                ms-duplex-string="aboutMews.hrtRte" ms-keyup="onlyNum('aboutMews','hrtRte')" ms-input="onlyNum('aboutMews','hrtRte')"
                ms-change="onlyNum('aboutMews','hrtRte')">次/分
            </div>
          </div>
          <div class="sign-div">
            <p ms-class="RedwarningHx:patientInfFlg.breNbrFlag==1">呼吸</p>
            <div>
              <input id="emg_breNbr" type="text" class="underline-input" maxlength="4" name="hspemginfCustom.breNbr"
                ms-duplex-string="aboutMews.breNbr" ms-keyup="onlyNum('aboutMews','breNbr')" ms-input="onlyNum('aboutMews','breNbr')"
                ms-change="onlyNum('aboutMews','breNbr')">次/分
            </div>
          </div>
          <div class="sign-div long-div">
            <p ms-class="RedwarningSsy:patientInfFlg.sbpUpNbrFlag==1">血压</p>
            <div>
              <input id="emg_sbpUpNbr" type="text" class="underline-input" maxlength="4" name="hspemginfCustom.sbpUpNbr"
                ms-duplex-string="aboutMews.sbpUpNbr" ms-keyup="onlyNum('aboutMews','sbpUpNbr')" ms-change="onlyNum('aboutMews','sbpUpNbr')"
                ms-input="onlyNum('aboutMews','sbpUpNbr')">/
              <input id="emg_sbpDownNbr" type="text" class="underline-input" maxlength="4" name="hspemginfCustom.sbpDownNbr"
                ms-duplex-string="aboutMews.sbpDownNbr" ms-keyup="onlyNum('aboutMews','sbpDownNbr')" ms-change="onlyNum('aboutMews','sbpDownNbr')"
                ms-input="onlyNum('aboutMews','sbpDownNbr')">mmHg
            </div>
          </div>
          <div class="sign-div">
            <p ms-class="RedwarningXy:patientInfFlg.oxyNbrFlag==1">血氧</p>
            <div>
              <input id="emg_oxyNbr" type="text" class="underline-input" maxlength="4" name="hspemginfCustom.oxyNbr"
                ms-duplex-string="patientMsg.oxyNbr" maxlength="4" ms-keyup="onlyNum('patientMsg','oxyNbr')" ms-input="onlyNum('patientMsg','oxyNbr')"
                ms-change="onlyNum('patientMsg','oxyNbr')">%
            </div>
          </div>
        </div>
        <div class="total-item m-b5">
          <span class="form-text four-text" ms-visible="aboutMews.tmpNbr >= 38.5">发热选项</span>
          <label ms-repeat="getMsg.frCodList" ms-visible="aboutMews.tmpNbr >= 38.5">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_checkClicks('frCod', $index)">{{el.info}}</a>
          </label>
          <input class="hidden" type="text" name="hspemginfCustom.frCod" ms-duplex-string="hideMsg.frCod" />
        </div>
        <div class="total-item" ms-visible="aboutMews.tmpNbr >= 38.5">
          <span class="form-text four-text required-fields">发热日期<i class="red">*</i></span>
          <input class="Wdate left-gap" id="frDat" type="text" name="hspemginfCustom.frDat" ms-duplex-string="patientMsg.frDat"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly />
          <span class="form-text four-text center">疫区名称</span>
          <input class="left-gap small-input-wth" type="text" name="hspemginfCustom.infectedareaNam" ms-duplex-string="patientMsg.infectedareaNam"
            maxlength="20" />
          <span class="form-text two-text center">职业</span>
          <input class="left-gap small-input-wth" type="text" ms-duplex-string="patientMsg.emgJob" maxlength="20" />
          <span class="form-text two-text center">国籍</span>
          <input class="left-gap small-input-wth" type="text" name="hspemginfCustom.nationality" ms-duplex-string="patientMsg.nationality"
            maxlength="20" />
        </div>
        <div class="total-item">
          <span class="form-text four-text">清醒程度</span>
          <label ms-repeat="getMsg.senRctCodList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('senRctCod', $index)">{{el.info}}</a>
          </label>
          <input type="text" class="hidden" name="hspemginfCustom.senRctCod" ms-duplex-string="aboutMews.senRctCod" />
        </div>
      </div>
      <div class="half-div">
        <p class="part-title">
          <span>病人评分</span>
        </p>
        <div class="total-item m-t5">
          <div class="score-panel" ms-click="NRSbox()">
            <!-- <p class="score num-score">{{patientMsg.nrsSco}}</p> -->
            <p class="score num-score">
              {{patientMsg.nrsSco}}
              <span ms-visible="patientMsg.patientTyp != '2'">
                <span ms-visible="patientMsg.nrsSco =='' || patientMsg.nrsSco == null" class="score">未评分</span>
              </span>
            </p>
            <p>疼痛评分</p>
            <input class="hidden" id="emg_nrsSco" type="text" name="hspNrsInfCustom.nrsSco" ms-duplex-string="patientMsg.nrsSco">
            <input class="hidden" id="emg_ttpfNr" type="text" name="hspNrsInfCustom.ttpfNr" ms-duplex-string="patientMsg.ttpfNr">
            <input class="hidden" id="emg_ttpfTypeCod" type="text" name="hspNrsInfCustom.ttpfTypeCod" ms-duplex-string="patientMsg.ttpfTypeCod">

            <!-- <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtbw" id="emg_nrsTtbw">
            <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtbwQt" id="emg_nrsTtbwQt">
            <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtxz" id="emg_nrsTtxz">
            <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtxzQt" id="emg_nrsTtxzQt">
            <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtsj" id="emg_nrsTtsj">
            <input type="text" class="hidden" name="hspNrsInfCustom.nrsTtkz" id="emg_nrsTtkz">
            <input type="text" class="hidden" name="hspNrsInfCustom.nrsMemo" id="emg_nrsMemo"> -->
          </div>
          <div class="score-panel m-l10" ms-click="MEWSbox()" ms-visible="patientMsg.patientTyp !== '2'">
            <p class="score num-score">{{patientMsg.mewsTotSco}}</p>
            <p>MEWS</p>
            <input class="hidden" id="emg_mewsTotSco" type="text" name="hspemginfCustom.mewsTotSco" ms-duplex-string="patientMsg.mewsTotSco">
          </div>
          <div class="score-panel m-l10" ms-click="REMSbox()" ms-visible="patientMsg.patientTyp !== '2'">
            <p class="score num-score">{{patientMsg.remsTotSco}}</p>
            <p>REMS</p>
            <input class="hidden" id="emg_remsTotSco" type="text" ms-duplex-string="patientMsg.remsTotSco">
            <input class="hidden" id="emg_remsDeath" type="text" ms-duplex-string="patientMsg.remsDeath">
          </div>
          <div class="score-panel m-l10" ms-click="CRAMSbox()" ms-visible="patientMsg.patientTyp !== '2'">
            <p class="score num-score">{{patientMsg.cramsTotSco}}</p>
            <p>CRAMS</p>
            <input class="hidden" type="text" id="emg_sptLvlCod" name="hspemginfCustom.sptLvlCod" ms-duplex-string="aboutCRAMS.sptLvlCod">
            <input class="hidden" type="text" id="emg_lanLvlCod" name="hspemginfCustom.lanLvlCod" ms-duplex-string="aboutCRAMS.lanLvlCod">
            <input class="hidden" type="text" id="emg_cirLvlCod" name="hspemginfCustom.cirLvlCod" ms-duplex-string="aboutCRAMS.cirLvlCod">
            <input class="hidden" type="text" id="emg_breLvlCod" name="hspemginfCustom.breLvlCod" ms-duplex-string="aboutCRAMS.breLvlCod">
            <input class="hidden" type="text" id="emg_bdyLvlCod" name="hspemginfCustom.bdyLvlCod" ms-duplex-string="aboutCRAMS.bdyLvlCod">
            <input class="hidden" type="text" id="emg_cramsTotSco" type="text" name="hspemginfCustom.cramsTotSco"
              ms-duplex-string="patientMsg.cramsTotSco">
          </div>
          <div class="score-panel m-l10" ms-click="GCSbox()" ms-visible="patientMsg.patientTyp !== '2'">
            <p class="score num-score">{{patientMsg.gcsTotSco}}</p>
            <p>GCS</p>
            <input class="hidden" type="text" id="emg_eyeRctCod" name="hspemginfCustom.eyeRctCod" ms-duplex-string="aboutGCS.eyeRctCod">
            <input class="hidden" type="text" id="emg_lanRctCod" name="hspemginfCustom.lanRctCod" ms-duplex-string="aboutGCS.lanRctCod">
            <input class="hidden" type="text" id="emg_actRctCod" name="hspemginfCustom.actRctCod" ms-duplex-string="aboutGCS.actRctCod">
            <input class="hidden" type="text" id="emg_gcsTotSco" type="text" name="hspemginfCustom.gcsTotSco"
              ms-duplex-string="patientMsg.gcsTotSco">
          </div>
          <div class="score-panel m-l10" ms-click="pewsBox()" ms-visible="patientMsg.patientTyp === '2'">
            <p class="score">
              <span ms-visible="aboutPEWS.pewsSco !==''" class="num-score">{{aboutPEWS.pewsSco}}</span>
              <span ms-visible="aboutPEWS.pewsSco ===''"></span>
            </p>
            <p>PEWS</p>
            <input class="hidden" type="text" name="hspPewsckInfCustom.actionCod" id="actionCod" ms-duplex-string="aboutPEWS.actionCod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.xxgSkinCod" id="xxgSkinCod" ms-duplex-string="aboutPEWS.xxgSkinCod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.xxgCrtCod" id="xxgCrtCod" ms-duplex-string="aboutPEWS.xxgCrtCod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.xxgXlCod" id="xxgXlCod" ms-duplex-string="aboutPEWS.xxgXlCod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.hxPlCod" id="hxPlCod" ms-duplex-string="aboutPEWS.hxPlCod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.hxXhCod" id="hxXhCod" ms-duplex-string="aboutPEWS.hxXhCod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.hxFio2Cod" id="hxFio2Cod" ms-duplex-string="aboutPEWS.hxFio2Cod">
            <input class="hidden" type="text" name="hspPewsckInfCustom.pewsSco" id="pewsSco" ms-duplex-string="aboutPEWS.pewsSco">
          </div>
        </div>
        <p class="part-title">
          <span>病人评估</span>
        </p>
        <div class="total-item m-t5">
          <div class="total-item">
            <div class="score-panel" ms-click="riskBox()">
              <p class="score">
                <span ms-visible="patientMsg.falAssCod !== '#' && patientMsg.falAssCod !== ''">高危</span>
                <span ms-visible="patientMsg.falAssCod === '#'">非高危</span>
              </p>
              <p>跌倒评估</p>
              <input type="text" id="emg_falAssCod" ms-duplex-string="patientMsg.falAssCod" name="hspFallAssInfCustom.fallAssCod"
                class="hidden">
            </div>
            <div class="score-panel m-l10" ms-click="specialBox()">
              <p class="score">
                <!-- <span id="specialContent"></span> -->
                <input type="text" id="emg_specialOther" ms-duplex-string="patientMsg.specialOther" name="hspemginfCustom.specialOther"
                  class="hidden">
                <span ms-visible="patientMsg.specialOther !== '#' && patientMsg.specialOther !== ''">是</span>
                <span ms-visible="patientMsg.specialOther === '#'">否</span>
              </p>
              <p>特殊人群</p>
            </div>
            <div class="score-panel m-l10" ms-click="cspgBox()">
              <p class="score">
                <input class="hidden" type="text" id="emg_cspgCod" name="hspemginfCustom.cspgCod" ms-duplex-string="patientMsg.cspgCod">
                <span ms-visible="(patientMsg.cspgFlg == 1) && (!patientMsg.cspgCod)">待评估</span>
                <span ms-visible="patientMsg.cspgCod">是</span>
              </p>
              <p>创伤</p>
            </div>
            <div class="score-panel m-l10" ms-click="xtzbpgBox()">
              <p class="score">
                <input class="hidden" id="emg_xtCod" type="text" name="hspemginfCustom.xtCod" ms-duplex-string="patientMsg.xtCod">
                <input class="hidden" id="emg_xtSubCod" type="text" name="hspemginfCustom.xtSubCod" ms-duplex-string="patientMsg.xtSubCod">
                <span ms-visible="(patientMsg.xtFlg == 1) && (!patientMsg.xtCod)">待评估</span>
                <span ms-visible="patientMsg.xtCod">是</span>
              </p>
              <p>胸痛</p>
            </div>
            <div class="score-panel m-l10" ms-click="czFaceBox()">
              <p class="score">
                <input class="hidden" type="text" id="emg_mtCod" name="hspFastInfCustom.mtCod" ms-duplex-string="patientMsg.mtCod">
                <input class="hidden" type="text" id="emg_szthCod" name="hspFastInfCustom.szthCod" ms-duplex-string="patientMsg.szthCod">
                <input class="hidden" type="text" id="emg_wlCod" name="hspFastInfCustom.wlCod" ms-duplex-string="patientMsg.wlCod">
                <span ms-visible="(patientMsg.czFlag == 1) && (!patientMsg.mtCod && !patientMsg.szthCod && !patientMsg.wlCod)">待评估</span>
                <span ms-visible="patientMsg.mtCod || patientMsg.szthCod || patientMsg.wlCod">是</span>
              </p>
              <p>卒中</p>
            </div>
          </div>
          <p class="part-title">
            <span>分诊信息</span>
          </p>
          <div class="total-item up-down-px">
            <span class="form-text four-text required-fields">主诉症状<i class="red">*</i></span>
            <div id="searchWrapper" class="search-wrap">
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
            <div class="floatLeft m-l5" id="knowledgeDiv">
              <a class="commonbtn knowledgeBoxBtn" href="javascript:;" ms-click="openKnowledge()">知识库</a>
              <span class="middleLabel m-l5" id="measure"></span>
            </div>
            <input type="text" class="hidden" id="checkLevel" />
          </div>
          <div class="floatLeft">
            <span class="form-text four-text required-fields">病人去向<i class="red">*</i></span>
            <label ms-repeat="getMsg.cstDspCodList" ms-visible="isVisibleCstDspCod(el.infocode)">
              <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('cstDspCod', $index)">{{el.info}}</a>
            </label>
            <input type="text" class="hidden" name="hspemginfCustom.cstDspCod" ms-duplex-string="patientMsg.cstDspCod" />
          </div>
          <div class="floatLeft m-l10">
            <span ms-visible="isShowBed()" class="form-text two-text">床位</span>
            <select ms-visible="isShowBed()" ms-duplex-string="patientMsg.bedid" name="hspemginfCustom.bedid" id="bedId">
            </select>
            <input type="text" class="hidden" name="hspemginfCustom.emgBed" id="emgBed">
            <input type="text" class="hidden" name="hspemginfCustom.bedLgs" id="bedLgs">
          </div>
          <div class="floatLeft m-l10">
            <span class="form-text four-text" ms-visible="isShowBed()">分诊医生</span>
            <span class="spanRelative" ms-visible="isShowBed()">
              <input type="text" name="hspemginfCustom.sqlDctNbr" ms-duplex-string="patientMsg.sqlDctNbr" autocomplete="off"
                id="showSqlName" ms-keyup="cleanSqlText()" maxlength="5" />
              <ul class="userList topList" ms-visible="isShowDocList">
                <li ms-repeat="getMsg.fzDocList" ms-click="chooseSqlDoc(el.usrname)">
                  {{el.usrname}}
                </li>
              </ul>
            </span>
          </div>
          <div class="total-item">
            <span class="form-text four-text required-fields">就诊科室<i class="red">*</i></span>
            <div class="eight-div">
              <label ms-repeat="getMsg.jzkscompctlList">
                <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_radioCheck('emgFkCod', $index)">{{el.comcname}}</a>
              </label>
            </div>
            <input type="text" class="hidden" id="emg_emgFkCod" name="hspemginfCustom.emgFkCod" ms-duplex-string="patientMsg.emgFkCod" />
            <input type="text" class="hidden e_emgFkName" id="emg_emgFkName" name="hspemginfCustom.emgFkName"
              ms-duplex-string="patientMsg.emgFkName" />
          </div>
          <div class="half-item">
            <span class="form-text four-text">自动分级</span>
            <i ms-visible="patientMsg.chkLvlCod === '' "></i>
            <i ms-visible="patientMsg.chkLvlCod === '0' " class="check-btn level-btn0 active">Ⅰ级</i>
            <i ms-visible="patientMsg.chkLvlCod === '1' " class="check-btn level-btn1 active">Ⅱ级</i>
            <i ms-visible="patientMsg.chkLvlCod === '2' " class="check-btn level-btn2 active">Ⅲ级</i>
            <i ms-visible="patientMsg.chkLvlCod === '3' " class="check-btn level-btn3 active">Ⅳa级</i>
            <i ms-visible="patientMsg.chkLvlCod === '4' " class="check-btn level-btn4 active">Ⅳb级</i>
          </div>
          <div class="half-item">
            <!-- <span class="form-text four-text" ms-visible="patientMsg.emgAreCod != ''">急诊分区</span>-->
          </div>
          <div class="total-item m-b5">
            <span class="form-text four-text big-text">修订分级</span>
            <label ms-repeat="getMsg.modLvlCodList">
              <a class="check-btn big-check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-class-2="level-btn{{$index}}"
                ms-click="_radioCheck('modLvlCod', $index)">{{el.info}}</a>
            </label>
            <label ms-repeat="getMsg.emgAreCodList">
              <a class="level-span" href="javascript:;" ms-visible="patientMsg.emgAreCod == el.infocode" ms-class="level-area{{patientMsg.emgAreCod}}">{{el.info}}</a>
            </label>
            <input class="hidden" type="text" name="hspemginfCustom.emgAreCod" ms-duplex-string="patientMsg.emgAreCod">
            <input class="hidden" id="loopModLvlCod" type="text" name="hspemginfCustom.modLvlCod" ms-duplex-string="patientMsg.modLvlCod">
            <input class="hidden" id="chkLvlCod" type="text" name="hspemginfCustom.chkLvlCod" ms-duplex-string="patientMsg.chkLvlCod">
          </div>
          <!-- <div class="final-level" ms-visible="patientMsg.emgDepCod != ''">
            <p class="level">
              <i ms-visible="patientMsg.emgDepCod === '' "></i>
              <i ms-visible="patientMsg.emgDepCod === '0' ">Ⅰ</i>
              <i ms-visible="patientMsg.emgDepCod === '1' ">Ⅱ</i>
              <i ms-visible="patientMsg.emgDepCod === '2' ">Ⅲ</i>
              <i ms-visible="patientMsg.emgDepCod === '3' ">Ⅳa</i>
              <i ms-visible="patientMsg.emgDepCod === '4' ">Ⅳb</i>
            </p>
            <p class="center" ms-class="level{{patientMsg.emgDepCod}}">分级</p>
          </div> -->
          <input type="text" class="hidden" name="hspemginfCustom.emgDepCod" ms-duplex-string="patientMsg.emgDepCod" />
          <!-- 修订分级和自动分级不一样，显示修订理由 -->
          <div class="total-item" ms-visible="(patientMsg.modLvlCod != patientMsg.chkLvlCod) && (patientMsg.modLvlCod != '' && patientMsg.modLvlCod != null)">
            <span class="form-text four-text">修订理由</span>
            <input id="emg_modLvlDes" type="text" name="hspemginfCustom.modLvlDes" ms-duplex-string="patientMsg.modLvlDes"
              class="middle-input-wth" maxlength="100">
          </div>
        </div>
      </div>
      <div class="save-btn-div">
        <a class="easyui-linkbutton" iconcls="icon-ok" id="save" onclick="postPatientMsg()">保存</a>
        <a class="easyui-linkbutton" iconcls="icon-ok" onclick="postPatientMsg('p')">保存并打印</a>
        <a class="easyui-linkbutton" iconcls="icon-print" onclick="printXXT()">打印</a>
      </div>
      <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
      <OBJECT id="smkOcx" classid="clsid:E691A607-D1D2-48A7-A0EC-09511883A445" width="0" height="0" align="center"
        hspace="0" vspace="0"></OBJECT>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/precheck/printFz.jsp"></jsp:include>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/directionKeycode.js"></script>
  <script type="text/javascript">
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        return flg;
      })
    };
    //预览信息条--做演示用
    function printXXT() {
      printFz()
    };

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
      _confirm('确定提交吗？', null, function () {
        if (vm.patientMsg.patientTyp == '2') {
          vm.patientMsg.pregnantGsplCod = '';
          vm.patientMsg.pregnantYdcxCod = '';
          vm.patientMsg.cramsTotSco = '';
          for (var k in vm.aboutCRAMS) {
            vm.aboutCRAMS[k] = ''
          }
        }
        if (vm.patientMsg.patientTyp == '3') {
          for (var k in vm.aboutPEWS) {
            vm.aboutPEWS[k] = ''
          }
        }
        if (_ecyjFlag == '1') {
          $('#userform').attr('action', '${baseurl}hzszyyemg/ecyjsubmit.do')
        }
        jquerySubByFId('userform', insertuser_callback, print, "json");
      })
    }

    function insertuser_callback(data, print) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}first.do";
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