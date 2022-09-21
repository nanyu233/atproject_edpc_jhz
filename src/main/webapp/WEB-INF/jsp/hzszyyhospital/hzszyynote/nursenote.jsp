<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>病情护理记录单</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/nursenote.css?v=${versionDay}">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${emgSeq}',
      _count = '${counts}',
      _gcsSco = '${gcsSco}',
      _nrsSco = '${nrsSco}',
      _gcsSeq = '${gcsSeq}',
      _nrsSeq = '${nrsSeq}',
      _adlSco = '${adlSco}',
      _adlSeq = '${adlSeq}',
      _bradenSeq = '${bradenSeq}',
      _bradenSco = '${bradenSco}',
      _zyfxpfSeq = '${zyfxpfSeq}',
      _zyfxpfSco = '${zyfxpfSco}',
      _morseSeq = '${morseSeq}',
      _morseSco = '${morseSco}',
      _xtpg = '', _hzDes = '', _symSitDes = '',
      _cstNam = parent.$("#tabs .tabs-selected .tabs-title").text().split('-')[0];
  </script>
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body>
  <div class="nursenote" id="nurseNoteMsg" v-cloak>
    <form id="noteForm" action="${baseurl}zjszyyhljld/edithljldsubmit.do" method="post">
      <input type="hidden" id="bqhiSeq" name="hsphljldinfCustom.bqhiSeq" value="">
      <input class="hidden" type="text" id="emgSeq" name="hsphljldinfCustom.emgSeq" value="${emgSeq}">
      <input class="hidden" type="text" id="hs_usrno" value="${hsUsrno}">
      <p class="formTitle">病情护理记录单</p>
      <div class="content-wrapper">
        <!-- <div class="subtitle">
            <span class="m-l10">上级护士签名：</span>
            <span class="relative">
              <input type="text" id="username" maxlength="10" name="hsphljldinfCustom.sjhsUsrname" autocomplete="off">
              <div class="userList" id="userNameList"></div>
            </span>
        </div>
        <div class="cutoff"></div> -->
        <ul class="content-ul">
          <li>
            <p class="subtitle">
              <span class="span-left">生命体征</span>
              <!-- &nbsp;&nbsp;<a class="my-linkbutton" onclick="getVitalSign()">[采集体征]</a>  -->
              &nbsp;&nbsp;<a class="my-linkbutton" @click="importRecord('0')">[导入入院护理评估体征]</a> 
              &nbsp;&nbsp;<a class="my-linkbutton" @click="importRecord('1')">[导入创伤入院护理评估体征]</a> 
              &nbsp;&nbsp;<a class="my-linkbutton" @click="importAllSign()">[导入二次预检体征]</a>
              &nbsp;&nbsp;<a class="my-linkbutton" onclick="exportTemp()">[导出到体温单]</a> 
              <!-- &nbsp;&nbsp;<a class="my-linkbutton" onclick="loadTemp()">[从体温单导入]</a> -->
            </p>
          </li>
          <li class="basicli">
            <label class="normal-labtitle">
              体温：
            </label>
            <span class="span-wrapper">
              <select name="hsphljldinfCustom.tmpNbrFlg" class="Signsel" id="tempretureSel" @change="cleanVal('tmpNbrFlg', 'tmpNbr')"
                v-model="notePatientMsg.tmpNbrFlg">
                <option value="1">耳温</option>
                <option value="2">不升</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hsphljldinfCustom.tmpNbr" id="tmpNbr" :disabled="notePatientMsg.tmpNbrFlg == '2'||notePatientMsg.tmpNbrFlg == '3'"
                v-model="notePatientMsg.tmpNbr" placeholder="℃" class="Signinput" 
                @keyup="onlyNum('notePatientMsg','tmpNbr',1,100)"
                @change="onlyNum('notePatientMsg','tmpNbr',1,100)"
                @input="onlyNum('notePatientMsg','tmpNbr',1,100)"
                >
              &emsp;
              心率：
              <select class="Signsel" name="hsphljldinfCustom.hrtRteFlg" id="hrtRteSel" @change="cleanVal('hrtRteFlg', 'hrtRte')"
                v-model="notePatientMsg.hrtRteFlg">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hsphljldinfCustom.hrtRte" id="hrtRte" v-model="notePatientMsg.hrtRte"
                :disabled="notePatientMsg.hrtRteFlg == '2'||notePatientMsg.hrtRteFlg == '3'" 
                placeholder="次/分" class="xtInput" 
                @keyup="onlyNum('notePatientMsg','hrtRte')"
                @change="onlyNum('notePatientMsg','hrtRte')"
                @input="onlyNum('notePatientMsg','hrtRte')"
                >
              &emsp;
              呼吸：
              <select id="breathSel" name="hsphljldinfCustom.breNbrFlg" class="Signsel" v-model="notePatientMsg.breNbrFlg"
                @change="cleanVal('breNbrFlg', 'breNbr')">
                <option value="1"></option>
                <option value="2">机械通气</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hsphljldinfCustom.breNbr" id="breNbr" v-model="notePatientMsg.breNbr"
                :disabled="notePatientMsg.breNbrFlg == '3'" placeholder="次/分" class="Signinput" 
                @keyup="onlyNum('notePatientMsg','breNbr')"
                @input="onlyNum('notePatientMsg','breNbr')"
                @change="onlyNum('notePatientMsg','breNbr')"
                >
              &emsp;
              血压：
              <select class="Signsel" name="hsphljldinfCustom.sbpNbrFlg" id="SdpSel" @change="cleanVal('sbpNbrFlg', 'sbpUpNbr','sbpDownNbr')"
                v-model="notePatientMsg.sbpNbrFlg">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hsphljldinfCustom.sbpUpNbr" id="sbpUpNbr" :disabled="notePatientMsg.sbpNbrFlg == '2'||notePatientMsg.sbpNbrFlg == '3'"
                v-model="notePatientMsg.sbpUpNbr" placeholder="收缩压" class="Signinput" @keyup="onlyNum('notePatientMsg','sbpUpNbr')">
              &nbsp;-&nbsp;
              <input type="text" maxlength="4" name="hsphljldinfCustom.sbpDownNbr" id="sbpDownNbr" :disabled="notePatientMsg.sbpNbrFlg == '2'||notePatientMsg.sbpNbrFlg == '3'"
                v-model="notePatientMsg.sbpDownNbr" placeholder="舒张压" class="Signinput" 
                @keyup="onlyNum('notePatientMsg','sbpDownNbr')"
                @input="onlyNum('notePatientMsg','sbpDownNbr')"
                @change="onlyNum('notePatientMsg','sbpDownNbr')"
                >
              &emsp;
            </span>
          </li>
          <li class="basicli">
            <label class="normal-labtitle">
              血氧：
            </label>
            <span class="span-wrapper">
              <select class="Signsel" name="hsphljldinfCustom.xyFlg" id="xySel" @change="cleanVal('xyFlg', 'xy')"
                v-model="notePatientMsg.xyFlg">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hsphljldinfCustom.xy" v-model="notePatientMsg.xy" :disabled="notePatientMsg.xyFlg == '2'||notePatientMsg.xyFlg == '3'"
                placeholder="%" class="Signinput" 
                @keyup="onlyNum('notePatientMsg','xy')" 
                @input="onlyNum('notePatientMsg','xy')" 
                @change="onlyNum('notePatientMsg','xy')">
              &emsp;
              意识：
              <select name="hsphljldinfCustom.senRctCod" v-model="notePatientMsg.senRctCod" class="Signsel">
                <option value=""></option>
                <option v-for="item in getMsg.senRctCodList" :value="item.infocode">{{item.info}}</option>
              </select>
              &emsp;
              血糖：
              <select class="Signsel" v-model="notePatientMsg.xtCod" name="hsphljldinfCustom.xtCod" id="xtCod">
                <option value=""></option>
                <option v-for="item in getMsg.xtCodList" :value="item.infocode">{{item.info}}</option>
              </select>
              <select class="Signsel" name="hsphljldinfCustom.xtFlg" id="xtSel" @change="cleanVal('xtFlg', 'xt')"
                v-model="notePatientMsg.xtFlg">
                <option value="1"></option>
                <option value="2">LO</option>
                <option value="3">HI</option>
                <option value="4">拒测</option>
              </select>
              <input type="text" maxlength="4" :disabled="notePatientMsg.xtFlg == '3'|| notePatientMsg.xtFlg == '2'||notePatientMsg.xtFlg == '4'"
                name="hsphljldinfCustom.xt" v-model="notePatientMsg.xt" placeholder="mmol/L" class="Signinput xtInput" 
                @keyup="onlyNum('notePatientMsg','xt',2,100)" 
                @input="onlyNum('notePatientMsg','xt',2,100)" 
                @change="onlyNum('notePatientMsg','xt',2,100)">
              &emsp;
              脉搏：
              <select class="Signsel" name="hsphljldinfCustom.pulseFlg" id="pulseSel" @change="cleanVal('pulseFlg', 'pulse')"
                v-model="notePatientMsg.pulseFlg">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hsphljldinfCustom.pulse" v-model="notePatientMsg.pulse" placeholder="次/分" class="xtInput" 
                :disabled="notePatientMsg.pulseFlg == '2'||notePatientMsg.pulseFlg == '3'"
                @keyup="onlyNum('notePatientMsg','pulse')" 
                @input="onlyNum('notePatientMsg','pulse')" 
                @change="onlyNum('notePatientMsg','pulse')">
              &emsp;
              CVP：
              <input type="text" maxlength="4" name="hsphljldinfCustom.cvp" v-model="notePatientMsg.cvp" placeholder="mmHg" class="Signinput" 
                @keyup="onlyNum('notePatientMsg','cvp')" 
                @input="onlyNum('notePatientMsg','cvp')" 
                @change="onlyNum('notePatientMsg','cvp')">
            </span>
          </li>
          <li class="basicli">
            <label class="normal-labtitle">
              瞳孔左：
            </label>
            <span class="span-wrapper">
              <label v-for="item in getMsg.tkLeftCodList" :for="'tkLeftCod' + item.infocode" class="checklabel">
                <input :id="'tkLeftCod' + item.infocode" type="checkbox" :value="item.infocode" v-model="notePatientMsg.tkLeftCod" 
                @change="singleClick('tkLeftCod', item.infocode)">
                {{item.info}}
              </label>
              <input class="hidden" type="text" name="hsphljldinfCustom.tkLeftCod" v-model="notePatientMsg.tkLeftCod">
              <input type="text" maxlength="4" name="hsphljldinfCustom.tkLeft" v-model="notePatientMsg.tkLeft" autocomplete="off"
                @keyup="onlyNum('notePatientMsg', 'tkLeft',2)" @input="onlyNum('notePatientMsg', 'tkLeft',2)" @change="onlyNum('notePatientMsg', 'tkLeft',2)" class="Signinput">mm
              &emsp;其他：<input type="text" name="hsphljldinfCustom.tkLeftOther" v-model="notePatientMsg.tkLeftOther" class="Signinput" autocomplete="off">
            </span>
          </li>
          <li class="basicli">
            <label class="normal-labtitle">
              瞳孔右：
            </label>
            <span class="span-wrapper">
              <label v-for="item in getMsg.tkRightCodList" :for="'tkRightCod' + item.infocode" class="checklabel">
                <input :id="'tkRightCod' + item.infocode" type="checkbox" :value="item.infocode" v-model="notePatientMsg.tkRightCod" 
                @change="singleClick('tkRightCod', item.infocode)" > {{item.info}}
              </label>
              <input class="hidden" type="text" name="hsphljldinfCustom.tkRightCod" v-model="notePatientMsg.tkRightCod">
              <input type="text" maxlength="4" name="hsphljldinfCustom.tkRight" v-model="notePatientMsg.tkRight" autocomplete="off"
                @keyup="onlyNum('notePatientMsg', 'tkRight',2)" @input="onlyNum('notePatientMsg', 'tkRight', 2)" @change="onlyNum('notePatientMsg', 'tkRight',2)" class="Signinput">mm
              &emsp;其他：<input type="text" name="hsphljldinfCustom.tkRightOther" v-model="notePatientMsg.tkRightOther" class="Signinput" autocomplete="off">
            </span>
          </li>
        </ul>
        <ul class="content-ul mt-5">
          <li>
            <p class="subtitle">
              <span class="span-left">其他</span>
              <!-- &nbsp;&nbsp;<a class="my-linkbutton" @click="importRecordScore()">[导入入院护理评估评分]</a>  -->
            </p>
          </li>
          <li class="fullli" id="scoWrapper">
            <input type="text" class="hidden" v-model="aboutSco.bradenSeq" name="hsphljldinfCustom.bradenSeq" id="bradenSeq">
            <input type="text" class="hidden" v-model="aboutSco.adlSeq" name="hsphljldinfCustom.adlSeq" id="adlSeq">
            <input type="text" class="hidden" v-model="notePatientMsg.emgSeq" id="hplgEmg">
            <input type="text" class="hidden" v-model="aboutSco.zyfxpfSeq" name="hsphljldinfCustom.zyfxpfSeq" id="zyfxpfSeq">
            <input type="text" class="hidden" v-model="aboutSco.gcsSeq" name="hsphljldinfCustom.gcsSeq" id="gcsSeq">
            <input type="text" class="hidden" v-model="aboutSco.ddfxpgbSeq" name="hsphljldinfCustom.ddfxpgbSeq" id="ddfxpgbSeq">
            <div class="scoDiv">
              <label class="labtitle">Braden评分：</label>
              <input type="text" readonly @click="openBrdSco()" v-model="aboutSco.bradenSco" class="readInput m-l5">分
            </div>
            <div class="scoDiv">
              <label>ADL评分:</label>
              <input type="text" readonly @click="openAdlSco()" v-model="aboutSco.adlSco" class="readInput">分
            </div>
            <div class="scoDiv">
              <label>疼痛评分:</label>
              <input type="text" class="hidden" v-model="aboutSco.nrsSeq" name="hsphljldinfCustom.nrsSeq" id="nrsSeq">
              <input type="text" readonly @click="openNRSSco()" v-model="aboutSco.nrsSco" class="readInput">分
              <input type="text" class="hidden" v-model="aboutSco.ttpfNr" class="noClickInput">
              <input type="text" class="hidden" v-model="aboutSco.ttpfTypeCod" class="noClickInput">
            </div>
            <div class="scoDiv">
              <label>转运风险评分:</label>
              <input type="text" readonly v-model="aboutSco.zyfxpfSco" @click="openZyfxSco()" class="readInput">分
            </div>
            <div class="scoDiv">
              <label>GCS评分:</label>
              <input type="text" readonly v-model="aboutSco.gcsSco" @click="openGCSSco()" class="readInput">分
            </div>
            <div class="scoDiv">
              <label>Morse评分:</label>
              <input type="text" readonly v-model="aboutSco.morseSco" @click="openMorse()" class="readInput">分
            </div>
          </li>
          <li class="fullli">
            <label class="labtitle ckLabel">
              基础护理：
            </label>
            <span class="span-wrapper m-l5">
              <label v-for="item in getMsg.jchlbaseList" class="checklabel" :for="'jchlll' + item.infocode">
                <input :id="'jchlll' + item.infocode" type="checkbox" :value="item.infocode" name="jchlll" v-model="notePatientMsg.jchl"
                  class="checkname">{{item.info}}
                  <input type="text"  class="Wdate" id="rssj" name="hsphljldinfCustom.rssj" v-model="notePatientMsg.rssj"  onchange="sub.notePatientMsg.rssj = $('#rssj').val()"
                  onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" v-if=" notePatientMsg.jchlStr.indexOf('121') != -1 && item.infocode == '121'"/>
                  <input type="text" maxlength="100" name="hsphljldinfCustom.jchlQt" class="Signinput m-l5" 
                  v-if=" notePatientMsg.jchlStr.indexOf('530') != -1 && item.infocode == '530'">
              </label>
              <input type="text" class="hidden" name="hsphljldinfCustom.jchl" v-model="notePatientMsg.jchlStr">
            </span>
          </li>
          <li class="fullli">
            <label class="labtitle">
              入量项：
            </label>
            <table class="rlcltb">
              <tr v-for="(item, index) in getMsg.amountList" :key="index + 'rlTr'">
                <td>
                  <select class="Signsel" v-model="hide[item.typeA]" :id="'rlSelect' + index" @change="cleanOtherText(hide[item.typeA], index, 'rlOther')">
                    <option value="">请选择</option>
                    <option v-for="item in getMsg.rlbaseList" :value="item.infocode">{{item.info}}</option>
                  </select>
                  <input type="text" v-model="hide[item.typeD]" v-show="hide[item.typeA] == 999" class="smallInput">
                </td>
                <td>
                  名称：<input type="text" v-model="hide[item.typeC]" class="Signinput" maxlength="50">
                </td>
                <td>
                  量(ml)：<input type="text" maxlength="7" @click="showBlood($event,hide[item.typeA],item.typeB)" v-model="hide[item.typeB]" @keyup="onlyNum('hide', item.typeB, 2, 9999.99)"
                    placeholder="ml" class="Signinput">
                    <ul class="userList sxList" v-show="isShowBloodList">
                      <li @click="chooseTranBlood(100,item.typeB)">100</li>
                      <li @click="chooseTranBlood(200,item.typeB)">200</li>
                      <li @click="chooseTranBlood(300,item.typeB)">300</li>
                    </ul>
                </td>
              </tr>
            </table>
            <input type="text" class="hidden" name="hsphljldinfCustom.rl" v-model="hide.rlContent" id="rlContent">
            <label>
              <img src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" @click="addNewLine('amountList')" />
              <img src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" @click="deleteLine('amountList')" />
            </label>
          </li>
          <li class="fullli">
            <label class="labtitle">
              出量项：
            </label>
            <table class="rlcltb">
              <tr v-for="(item, index) in getMsg.amountListB" :key="index + 'clTr'">
                <td>
                  <select class="Signsel" v-model="hide[item.typeA]" :id="'clSelect' + index" @change="cleanOtherText(hide[item.typeA], index, 'clOther')">
                    <option value="">请选择</option>
                    <option v-for="item in getMsg.clbaseList" :value="item.infocode">{{item.info}}</option>
                  </select>
                  <input type="text" v-model="hide[item.typeD]" v-show="hide[item.typeA] == 999" class="smallInput">
                </td>
                <td>
                  性质：<input type="text" v-model="hide[item.typeC]" class="Signinput" maxlength="50">
                </td>
                <td>
                  量(ml)：<input type="text" maxlength="7" v-model="hide[item.typeB]" @keyup="onlyNum('hide', item.typeB, 2, 9999.99)"
                    placeholder="ml" class="Signinput">&emsp;
                </td>
              </tr>
            </table>
            <input type="text" class="hidden" name="hsphljldinfCustom.cl" v-model="hide.clContent" id="clContent">
            <label>
              <img src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" @click="addNewLine('amountListB')" />
              <img src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" @click="deleteLine('amountListB')" />
            </label>
          </li>
          <li class="fullli">
            <div class="tempBtn">
              <label>导入：</label>
              <div class="importlab"></div>
              <img class="closeImg" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="closeTemp()" />
            </div>
          </li>
          <li class="fullli">
            <label class="labtitle">
              病情观察、护理措施和效果：
              <a class="my-linkbutton" onclick="showTem()" href="javascript:;">[导入]</a>
            </label>
            <span class="span-wrapper">
              <textarea name="hsphljldinfCustom.bqgc" class="notearea" id="xtpghznr"></textarea>
            </span>
          </li>
          <li class="basicli right-li">
            <span class="floatLeft">
              创建时间：<input class="Wdate" type="text" name="hsphljldinfCustom.crtDat" v-model="notePatientMsg.crtDat" id="crtDat"
                onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss', isShowClear:false, readOnly:true})" onchange="sub.notePatientMsg.crtDat = $('#crtDat').val()">
            </span>
            <span class="floatRight margin-gap">
              <span class="floatLeft">
                <span>护士签名：</span>
                <span class="relative">
                  <input type="text" id="userSign" maxlength="10" name="hsphljldinfCustom.hsUsrname" value="${crtName}"
                    readonly="readonly">
                  <div class="userList Listpos" id="userList"></div>
                </span>
              </span>
            </span>
          </li>
        </ul>
        <div class="clr"></div>
        <div class="center">
          <a class="easyui-linkbutton" iconcls="icon-ok" onclick="submitBqhljld()">保存</a>
        </div>
      </div>
    </form>
  </div>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/nurseNote/mixin.vue.js"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/nurseNote/nursenote.vue.js"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/nurseNote/importMsg.js"></script>
  <script>
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        if ($("#userSign").is(":focus")) {
          searchUser();
          flg = false;
        }
        if ($("#username").is(":focus")) {
          searchUserName();
          flg = false;
        }
        return flg;
      })
    };
    $("body").click(function () {
      sub.isShowBloodList = false
      $("#userList").hide();
      $("#userNameList").hide();
    });

    function searchUser() {
      if (event.keyCode == 13) {
        publicFun.SearchList("userSign", "userList")
      }
    }

    function searchUserName() {
      if (event.keyCode == 13) {
        publicFun.SearchList("username", "userNameList")
      }
    }

    function submitBqhljld() {
      sub.notePatientMsg.bqgc = $('#xtpghznr').val();
      if ($("#userSign").val() == "") {
        $.messager.alert('提示信息', "护士签名不可为空！", 'warning');
      }else if ($("#rssj").val() == "" && sub.notePatientMsg.jchlStr.indexOf('121') != -1) {
        $.messager.alert('提示信息', "溶栓时间必填！", 'warning');
      } else {
        if (sub.makeSureAmountVal('amountList')) {
          if (sub.makeSureAmountVal('amountListB')) {
            jquerySubByFId('noteForm', insertuser_callback, null, "json");
          }
        }
      }
    }

    function insertuser_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
        setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 1000);
      }
    }

    //导入护理记录
    function loadTemp() {
      var crtDat = $("input[name='hsphljldinfCustom.crtDat']").val();
      publicFun.httpServer({ url: '${baseurl}zyytpct/leadtcpt.do', isAsync: true }, {
        "hspTpctInfCustom.emgSeq": _emgSeq,
        "ctrDate": crtDat
      }, function (res) {
        var hspTpctInfCustom = res.resultInfo.sysdata.hspTpctInfCustom;
        if (res.resultInfo && res.resultInfo.messageCode == '906') {
          if (hspTpctInfCustom != null) {
            sub.notePatientMsg.tmpNbr = hspTpctInfCustom.tpctTw;
            sub.notePatientMsg.hrtRte = hspTpctInfCustom.tpctXl;
            sub.notePatientMsg.breNbr = hspTpctInfCustom.tpctHx;
            sub.notePatientMsg.sbpUpNbr = hspTpctInfCustom.tpctXyUp;
            sub.notePatientMsg.sbpDownNbr = hspTpctInfCustom.tpctXyDown;
            alert_success("导入护理记录单成功,以更新覆盖！时间为:" + publicFun.timeFormat(hspTpctInfCustom.enteringDat, 'MM/dd hh:mm:ss'))
          } else {
            alert_warn('未找到相关数据')
          }
        }
      }, function () {
        alert_error('导入失败！')
      })
    }

    $(function () {
      showTem(); // 默认显示导入项
    })
  </script>
</body>

</html>