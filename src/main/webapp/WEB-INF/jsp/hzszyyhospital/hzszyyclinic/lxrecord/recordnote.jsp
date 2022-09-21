<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>留抢病历</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/doctorendnote.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${emgSeq}';
    var _btnType = '2', requestSource = '${requestSource}'; // requestSource 请求来源(HIS_NO_PATIENT: HIS请求病历且未查到患者数据)
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="recordnote doctornote" ms-controller="recordnote">
  <div class="mainbody">
    <p class="subheadtitle">急诊门诊病历</p>
    <form id="recordnoteForm" action="${baseurl}hzszyyjzmz/submitMzbl.do" method="post">
      <input type="hidden" name="requestSource" value="${requestSource}" />
      <input type="hidden" name="formToken" value="${formToken}" />
      <input id="lqblSeq" type="text" name="hspLqblInfCustom.lqblSeq" class="hidden" ms-duplex-string="recordMsg.lqblSeq">
      <input type="text" name="hspLqblInfCustom.bltype" value="1" class="hidden">
      <input type="text" name="hspLqblInfCustom.emgSeq" class="hidden" value="${emgSeq}">
      <input type="text" name="hspemginfCustom.emgSeq" class="hidden" value="${emgSeq}">
      <input type="text" name="hspemginfCustom.mpi" class="hidden" ms-duplex-string="baseMsg.mpi">
      <input type="text" name="hspemginfCustom.cstNam" class="hidden" ms-duplex-string="baseMsg.cstNam">
      <input type="text" name="hspemginfCustom.jzxh" class="hidden" ms-duplex-string="baseMsg.jzxh">
      <div class="divwrapper">
        <div class="basicDiv">
          <label class="bascilab">姓名：<input class="basicInput" type="text" ms-duplex-string="baseMsg.cstNam" readonly
              unselectable='on'></label>
          <label class="bascilab">性别：<input class="basicInput" type="text" ms-duplex-string="baseMsg.cstSexCod"
              readonly unselectable='on'></label>
          <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" ms-duplex-string="baseMsg.age"
              readonly unselectable='on'></label>
          <label class="bascilab">科别：<input class="basicInput longbasicInput" type="text" ms-duplex-string="baseMsg.emgFkCod"
              readonly unselectable='on'></label>
          <label class="bascilab">病历号：<input class="basicInput" type="text" ms-duplex-string="baseMsg.mpi" readonly
              unselectable='on'></label>
        </div>
        <a class="my-linkbutton btna importBtnLink" data-options="toggle:true,plain:true" ms-click="importLqMsg()">[导入历史病历]</a>
        <a class="my-linkbutton btna importBtnLink" data-options="toggle:true,plain:true" ms-click="importTempMsg()">[导入我的模板]</a>
        <ul class="ulwrapper">
          <!-- <li>
            <span class="smalltitle">联系地址：</span>
            <input type="text" name="hspLqblInfCustom.cstAdr" ms-duplex-string="recordMsg.cstAdr" class="longinput">
          </li> -->
          <li>
            <span class="smalltitle">主诉：</span>
            <input class="longinput" type="text" name="hspLqblInfCustom.lqblDes" ms-duplex-string="recordMsg.lqblDes"
              maxlength="90" id="lqblDesText" ondblclick="showMsg('lqblDesText', '551')">
          </li>
          <li class="varylongli">
            <span class="smalltitle">现病史：</span>
            <textarea class="smaTexta nowHisTx" name="hspLqblInfCustom.nowHis" maxlength="1000" id="currentNowHis"
              ondblclick="showMsg('currentNowHis', '555')" ms-duplex-string="recordMsg.nowHis"></textarea>
          </li>
          <!-- 这边的既往史只显示既往史、个人史、家族史[就是显示文字修改，字段用其他的] -->
          <li>
            <span class="smalltitle">既往史：</span>
            <input type="text" class="longinput" ms-duplex-string="recordMsg.medHis" name="hspLqblInfCustom.medHis"
              maxlength="90" id="medHisCodText" ondblclick="showMsg('medHisCodText', '554')">
          </li>
          <li>
            <span class="smalltitle">个人史：</span>
            <input class="longinput" type="text" ms-duplex-string="recordMsg.obstHis" name="hspLqblInfCustom.obstHis"
              id="obstHisText" ondblclick="showMsg('obstHisText', '590')">
          </li>
          <li>
            <span class="smalltitle">家族史：</span>
            <input type="text" class="longinput" ms-duplex-string="recordMsg.famlHis" name="hspLqblInfCustom.famlHis"
              maxlength="90" id="famlHisText" ondblclick="showMsg('famlHisText', '562')">
          </li>
          <li>
            <p>
              <span class="spanTitle">体格检查</span>
            </p>
          </li>
          <li class="certainli">
            <label>
              <span class="smalltitle">血压：</span>
              <select class="Signsel" name="hspLqblInfCustom.tgjcXyFlg" ms-duplex-string="recordMsg.tgjcXyFlg"
                ms-change="cleanSignValue('tgjcXyFlg', 'tgjcXyUp', 'tgjcXyDown')">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" ms-attr-disabled="recordMsg.tgjcXyFlg==2 || recordMsg.tgjcXyFlg==3" maxlength="4" name="hspLqblInfCustom.tgjcXyUp"
                ms-duplex-string="recordMsg.tgjcXyUp" placeholder="舒张压" class="small_input" ms-keyup="onlyNum('tgjcXyUp')">
              &nbsp;/&nbsp;
              <input type="text" ms-attr-disabled="recordMsg.tgjcXyFlg==2 || recordMsg.tgjcXyFlg==3" maxlength="4" name="hspLqblInfCustom.tgjcXyDown"
                ms-duplex-string="recordMsg.tgjcXyDown" placeholder="收缩压" class="small_input" ms-keyup="onlyNum('tgjcXyDown')">mmHg
              &emsp;
            </label>
          </li>
          <li class="smallli">
            <label>
              <span class="smalltitle">体温：</span>
              <select name="hspLqblInfCustom.tgjcTwFlg" ms-duplex-string="recordMsg.tgjcTwFlg" class="Signsel"
                ms-change="cleanSignValue('tgjcTwFlg', 'tgjcTw')">
                <option value="1">耳温</option>
                <option value="2">不升</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" ms-attr-disabled="recordMsg.tgjcTwFlg==2 || recordMsg.tgjcTwFlg==3" maxlength="4" name="hspLqblInfCustom.tgjcTw"
                ms-duplex-string="recordMsg.tgjcTw" class="small_input" ms-keyup="onlyNum('tgjcTw',1,100)">℃
              &emsp;
            </label>
          </li>
          <li class="threeli">
            <label>
              <span class="longtitle">床边指氧饱和度：</span>
              <select name="hspLqblInfCustom.tgjcCbzyFlg" ms-duplex-string="recordMsg.tgjcCbzyFlg" class="Signsel"
                ms-change="cleanSignValue('tgjcCbzyFlg', 'tgjcCbzy')">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hspLqblInfCustom.tgjcCbzy" ms-duplex-string="recordMsg.tgjcCbzy"
                class="small_input" ms-keyup="onlyNum('tgjcCbzy')" ms-attr-disabled="recordMsg.tgjcCbzyFlg==2 || recordMsg.tgjcCbzyFlg==3">%
            </label>
          </li>
          <li class="certainli">
            <label>
              <span class="smalltitle">呼吸：</span>
              <select name="hspLqblInfCustom.tgjcHxFlg" class="Signsel" ms-duplex-string="recordMsg.tgjcHxFlg"
                ms-change="cleanSignValue('tgjcHxFlg', 'tgjcHx')">
                <option value="1"></option>
                <option value="2">机械通气</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hspLqblInfCustom.tgjcHx" ms-duplex-string="recordMsg.tgjcHx" class="small_input"
                ms-keyup="onlyNum('tgjcHx')" ms-attr-disabled="recordMsg.tgjcHxFlg==3">次/分
              &emsp;
            </label>
          </li>
          <li class="certainli">
            <span class="smalltitle">血糖：</span>
            <select name="hspLqblInfCustom.tgjcXtType" ms-duplex-string="recordMsg.tgjcXtType">
              <option value=""></option>
              <option ms-repeat="recordList.tgjcXtTypeList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
            <select class="Signsel" name="hspLqblInfCustom.tgjcXtFlg" ms-duplex-string="recordMsg.tgjcXtFlg" ms-change="cleanSignValue('tgjcXtFlg', 'tgjcXt')">
              <option value="1"></option>
              <option value="2">LO</option>
              <option value="3">HI</option>
              <option value="4">拒测</option>
            </select>
            <input type="text" maxlength="5" ms-attr-disabled="recordMsg.tgjcXtFlg==2 || recordMsg.tgjcXtFlg==3 || recordMsg.tgjcXtFlg==4"
              name="hspLqblInfCustom.tgjcXt" ms-duplex-string="recordMsg.tgjcXt" class="small_input" ms-keyup="onlyNum('tgjcXt',2,100)"
              autocomplete="off">mmol/L</span>
          </li>
          <li class="certainli">
            <label>
              <span class="smalltitle">心率：</span>
              <select name="hspLqblInfCustom.tgjcMbFlg" ms-duplex-string="recordMsg.tgjcMbFlg" ms-change="cleanSignValue('tgjcMbFlg', 'tgjcMb')">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hspLqblInfCustom.tgjcMb" ms-duplex-string="recordMsg.tgjcMb" class="small_input"
                ms-keyup="onlyNum('tgjcMb')" ms-attr-disabled="recordMsg.tgjcMbFlg == 2 || recordMsg.tgjcMbFlg == 3">次/分
              &emsp;
            </label>
          </li>
          <li class="certainli">
            <label>
              <span class="smalltitle">脉搏：</span>
              <select name="hspLqblInfCustom.tgjcPulseFlg" ms-duplex-string="recordMsg.tgjcPulseFlg" ms-change="cleanSignValue('tgjcPulseFlg', 'tgjcPulse')">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hspLqblInfCustom.tgjcPulse" ms-duplex-string="recordMsg.tgjcPulse"
                class="small_input" ms-keyup="onlyNum('tgjcPulse')" ms-attr-disabled="recordMsg.tgjcPulseFlg == 2 || recordMsg.tgjcPulseFlg == 3">次/分
              &emsp;
            </label>
          </li>
          <li class="speclongli">
            <span class="smalltitle">查体内容：</span>
            <textarea name="hspLqblInfCustom.ctnrDes" ms-duplex-string="recordMsg.ctnrDes" maxlength="500" id="ctnrDesText"
              ondblclick="showMsg('ctnrDesText', '550')"></textarea>
          </li>
          <li class="varylongli">
            <span class="smalltitle">评估评分：</span>
            <div class="score-panel" ms-click="NRSbox()">
              <p class="score num-score">{{recordMsg.nrsSco}}</p>
              <p>疼痛评分</p>
              <input class="hidden" id="emg_nrsSco" type="text" name="hspNrsInfCustom.nrsSco" ms-duplex-string="recordMsg.nrsSco">
              <input class="hidden" id="emg_ttpfNr" type="text" name="hspNrsInfCustom.ttpfNr" ms-duplex-string="recordMsg.ttpfNr">
              <input class="hidden" id="emg_ttpfTypeCod" type="text" name="hspNrsInfCustom.ttpfTypeCod"
                ms-duplex-string="recordMsg.ttpfTypeCod">
              <input class="hidden" type="text" name="hspNrsInfCustom.emgSeq" ms-duplex-string="baseMsg.emgSeq">
              <input class="hidden" type="text" name="hspNrsInfCustom.xtpgSeq" ms-duplex-string="recordMsg.xtpgSeq">
            </div>
            <div class="score-panel m-l10" ms-click="riskBox()">
              <p class="score">
                <span ms-visible="recordMsg.fallAssCod !== '#' && recordMsg.fallAssCod !== ''&& recordMsg.fallAssCod != null">高危</span>
                <span ms-visible="recordMsg.fallAssCod === '#'">非高危</span>
              </p>
              <p>跌倒评估</p>
              <input type="text" id="emg_falAssCod" ms-duplex-string="recordMsg.fallAssCod" name="hspFallAssInfCustom.fallAssCod"
                class="hidden">
              <input type="text" class="hidden" ms-duplex-string="recordMsg.fallassSeq" name="hspFallAssInfCustom.fallassSeq">
              <input type="text" class="hidden" ms-duplex-string="baseMsg.emgSeq" name="hspFallAssInfCustom.emgSeq">
            </div>
          </li>
          <li>
            <span class="longtitle m-l10">专项评估(营养、功能、心理、跌倒)：</span>
            <label ms-repeat="recordList.specialAssessList" ms-attr-for="specialAssess{{el.infocode}}">
              <input ms-attr-id="specialAssess{{el.infocode}}" type="checkbox" ms-duplex="recordMsg.specialAssess" ms-attr-value="el.infocode"
              ms-change="ckChange('specialAssess',$index)"> {{el.info}}
            </label>
            <input type="text" class="hidden" ms-duplex-string="hideStr.specialAssess" name="hspLqblInfCustom.specialAssess">
            <input type="text" ms-visible="recordMsg.specialAssess.indexOf('1') != -1" ms-duplex-string="recordMsg.specialSuggest" 
            name="hspLqblInfCustom.specialSuggest" maxlength="200" class="middle-input" id="specialSuggestText" 
            ondblclick="showMsg('specialSuggestText', '591')">
          </li>
          <li class="varylongli">
            <span class="smalltitle">辅助检查：</span>
            <textarea name="hspLqblInfCustom.fzjcDes" ms-duplex-string="recordMsg.fzjcDes" maxlength="500" id="fzjcDesText"
              ondblclick="showMsg('fzjcDesText', '552')"></textarea>
          </li>
          <li>
            <table id="diagnosistab">
              <tr>
                <td>
                  <span class="longtitle"><span><a class="my-linkbutton btna" data-options="toggle:true,plain:true"
                        onclick="addPreDgnCod(13, '1')">[查看]</a></span>初步诊断：</span>
                  <div class="input readonly sepcialWthLong" id="show_text1">{{baseMsg.mzCbzd}}</div>
                </td>
              </tr>
            </table>
          </li>
          <li class="varylongli">
            <span class="smalltitle">
              治疗意见：
              <a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="refreshTreatmentOptions()">[刷新]</a>
            </span>
            <div class="suggest-div">
              <div class="left-div-msg">
                <p ms-repeat="recordMsg.adviceList" ms-class="docMsg{{$index}}"></p>
              </div>
              <div class="right-div-msg">
                <p class="checkMsg"></p>
              </div>
            </div>
            <textarea class="left-span-input" maxlength="500" name="hspLqblInfCustom.zlyj" ms-duplex-string="recordMsg.zlyj" 
            id="zlyjText" ondblclick="showMsg('zlyjText', '610')" autocomplete="off">{{recordMsg.zlyj}}</textarea>
          </li>
          <li class="varylongli">
            <span class="smalltitle">健康教育：</span>
            <textarea class="big-area" name="hspLqblInfCustom.healthEducation" ms-duplex-string="recordMsg.healthEducation" maxlength="500"
            id="healthEducationText" ondblclick="showMsg('healthEducationText', '592')"></textarea>
          </li>
          <li class="varylongli">
            <span class="smalltitle">注意事项：</span>
            <textarea class="big-area" name="hspLqblInfCustom.zysx" ms-duplex-string="recordMsg.zysx" maxlength="500" id="zysxText"
            ondblclick="showMsg('zysxText', '593')"></textarea>
          </li>
          <li class="varylongli textareaLi" id="textareaLi">
            <textarea class="bigDataDiv" id="bigDataDiv" name="hspLqblInfCustom.lqblCont" ms-duplex-string="recordMsg.lqblCont" /></textarea>
          </li>
          <li class="rightli">
            <span>医师签名</span>
            <span class="spanRelative">
              <input type="text" id="username" maxlength="10" name="hspLqblInfCustom.cratNam" ms-duplex-string="recordMsg.cratNam" readonly>
              <input type="text" class="hidden" id="usernameNum" maxlength="10" name="hspLqblInfCustom.cratNbr"
                ms-duplex-string="recordMsg.cratNbr">
              <div class="userList" id="userNameList"></div>
            </span>
            <span id="dzqm"></span>
            <label class="labbox rxbox">时间</label>
            <input class="Wdate spcWdate" name="hspLqblInfCustom.oprtDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              ms-duplex-string="recordMsg.oprtDat">
          </li>
        </ul>
      </div>
    </form>
  </div>
  <div class="btnPos">
    <a id="sign" href="javascript:;" class="commonbtn leftBtn" onclick="getSign()">签名</a>
    <a id="save" href="javascript:;" class="commonbtn leftBtn" onclick="saveRecordnote()">保存</a>
    <a id="delete" href="javascript:;" class="commonbtn leftBtn" onclick="deleteCurrentNote()">删除</a>
    <a id="print" href="javascript:;" class="commonbtn" onclick="printnote()">打印</a>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyclinic/lxrecord/printclinicnote.jsp"></jsp:include>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js"></script>
  <script type="text/javascript" charset="utf-8">
    var setIframeDivHeight = false;
    function showMsg(name, seo) {
      parent.createmodalwindow('电子病历知识库', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?idName=' + name + '&tempSeo=' + seo + '&emgSeq=${emgSeq}', 'no');
    }

    function selectDep() {
      createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do');
    }
    var jsbrjz = {
      'falAssCodList': publicFun.getDict('FAL_ASS_COD')
    };
    var recordvm = avalon.define({
      $id: 'recordnote',
      recordList: {
        mnsSitCodList: publicFun.getDict('MNS_SIT_COD'), //女性月经史
        cstDspCodList: publicFun.getDict('CST_DSP_COD'),
        tgjcXtTypeList: publicFun.getDict('XT_COD'),
        specialAssessList: [{info: '无特殊', infocode: '0'}, {info: '建议', infocode: '1'}]
      },
      baseMsg: {
        emgSeq: _emgSeq,
        cstNam: '',
        age: '',
        cstSexCod: '',
        emgFkCod: '急诊科门诊',
        cstAdr: '',
        pheNbr: '',//联系电话
        vstCad: '',
        nowHis: '',
        mzZzzd: '',
        mzCbzd: '',
        mpi: '',
        jzxh: ''
      },
      recordMsg: {
        lqblSeq: '',//id
        lqblDes: '',//主述
        pastHisCod: '',//既往史
        gmsDes: '',//过敏史内容
        gmsFlg: 0,//过敏史
        medHisCod: 0,//既往史
        medHis: '',//既往史内容
        drugHisCod: 0,//有无用药史(0:无 1:有)
        drugHis: '',//用药史
        oprtHisCod: 0,//有无手术史(0:无 1:有)
        oprtHis: '',//手术史
        tramHisCod: 0,//有无外伤史(0:无 1:有)
        tramHis: '',//外伤史
        crbHisCod: 0,//有无疫区、禽类、传染病接触史
        crbHis: '',//疫区、禽类、传染病接触史
        obstHis: '',//个人史
        // mcyjDat: '',//末次月经
        famlHis: '',//家族史
        // rsztCod: '',//是否妊娠状态(0:否 1:是)
        tgjcXyFlg: '1',//血压扩充
        tgjcXyUp: '',//血压上
        tgjcXyDown: '',//血压下
        tgjcTwFlg: '1',//体温扩充
        tgjcTw: '',//体温
        tgjcMbFlg: '1',//脉搏扩充
        tgjcMb: '',//心率
        tgjcPulseFlg: '1',
        tgjcPulse: '', // 脉搏
        tgjcHxFlg: '1',//呼吸扩充
        tgjcHx: '',//呼吸
        tgjcCbzyFlg: '1',//床边指氧饱和度扩充
        tgjcCbzy: '',//床边指氧饱和度
        ctnrDes: '',//查体内容
        fzjcDes: '',//辅助检查
        // sqlDat: '', // 转归时间
        // cstDspCod: '',//病人去向
        // lqblBrqx: '',//病人去向2
        cratNam: '',//医生name
        cratNbr: '',//医生number
        // menopsAge: '',//绝经年龄
        lqblCont: '',//留抢大字段
        // mnsSitCod: '',//女性月经史
        caseHis: '',//怀孕周数
        tgjcXtFlg: '1',//血糖扩充
        tgjcXt: '',//血糖 
        oprtDat: '', //时间
        zlyj: '', // 治疗意见
        zysx: '', // 注意事项
        // sqlStaCod: '', //病人去向2
        // sqlDes: '',
        // sqlDepCod: '',
        // sqlDepName: '',
        adviceList: [],
        jyJcList: [],
        tgjcXtType: '', // 血糖类型
        healthEducation: '', // 健康教育
        nrsSco: '', // 疼痛评分
        ttpfNr: '', // 疼痛类型
        xtpgSeq: '',
        ttpfTypeCod: '',
        fallAssCod: '', // 跌倒评分
        fallassSeq: '',
        specialAssess: ['0'], // 专项评估
        specialSuggest: '', // 建议
        cstAdr: '', //联系地址
        nowHis: '' //现病史
      },
      hideStr: {
        specialAssess: '0'
      },
      NRSbox: function () {
        createmodalwindow('疼痛评分', 700, 490, _baseUrl + 'scorequery/toNrsGde.do?typeSource=saveByParent')
      },
      riskBox: function () {
        createmodalwindow('跌倒评估', 800, 450, _baseUrl + 'hzszyyemg/queryRisk.do')
      },
      radioclick: function (name, idx) {
        recordvm.recordMsg[name] = publicFun.radioClicks(recordvm.recordList[name + 'List'], recordvm.recordMsg[name], idx)
      },
      toggleCustom: function (name) {
        recordvm.recordMsg[name] = recordvm.recordMsg[name] == 0 ? 1 : 0;
      },
      onlyNum: function (attr, step, max) { //限定只能输入数字
        recordvm.recordMsg[attr] = publicFun.onlyNumber(recordvm.recordMsg[attr], step, max);
      },
      // 导入历史病例
      importLqMsg: function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/getJzlqblAjax.do' }, { 'mpi': parent.parent.vm.patientMsg.mpi }, function (res) {
          if (res.resultInfo.type == 1) {
            if (res.resultInfo.sysdata.jzlqblList.length == 0) {
              publicFun.alert('当前没有可导的历史病历')
            } else {
              createmodalwindow('导入历史病历', 850, 490, _baseUrl + 'zyylqbl/medicalmport.do?typeSource=mz')
            }
          }
        })
        // publicFun.httpServer({ url: _baseUrl + 'hzszyyjzmz/findLqblByEmgSeq.do' }, { 'emgSeq': _emgSeq }, function (data) {
        //   if (data.type == 1) { // 成功
        //     var _data = data.sysdata.hspLqblInfCustom;
        //     if (!_data) {
        //       publicFun.alert('当前无今日留抢病历数据');
        //       return false
        //     } else {
        //       for (var key in recordvm.recordMsg) {
        //         var saveCodMsg = ['lqblSeq', 'cstAdr', 'nowHis'];
        //         if ($.inArray(key, saveCodMsg) == -1) {
        //           recordvm.recordMsg[key] = ''
        //         }
        //       }
        //       setMsgVal(_data, 'lq');
        //     }
        //   } else {
        //     alert_error(data.message)
        //   }
        // })
      },
      // 导入我的模板
      importTempMsg: function () {
        publicFun.httpServer({ url: '${baseurl}favorite/findDictList.do', isNoLoad: true }, {}, function (res) {
          if (res && res.rows && res.rows.length > 0) {
            createmodalwindow('我的模板', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?isImportTemp=importTempMz&emgSeq=' + _emgSeq, 'no');
          } else {
            publicFun.alert('当前没有可导的模板')
          }
        })
      },
      // 清空生命体征 据测 测不出等后的相关输入数值
      cleanSignValue: function (cod, inputField, inputFieldB) {
        var _fieldList = ['tgjcTw', 'tgjcXt', 'tgjcMb', 'tgjcPulse', 'tgjcXyUp', 'tgjcCbzy'];
        for (var i = 0; i < _fieldList.length; i++) {
          if (_fieldList[i] == inputField) {
            if (recordvm.recordMsg[cod] != 1) {
              recordvm.recordMsg[inputField] = ''
              if (inputFieldB) {
                recordvm.recordMsg[inputFieldB] = ''
              }
            }
          }
        }
        if (inputField == 'tgjcHx') {
          if (recordvm.recordMsg[cod] == 3) {
            recordvm.recordMsg[inputField] = ''
          }
        }
      },
      ckChange: function (obj,idx) {
        recordvm.recordMsg[obj] = [];
        recordvm.recordMsg[obj].push(String(idx));
        var currentArr = recordvm.recordMsg[obj].$model;
        if (recordvm.recordMsg[obj].length > 0) {
          recordvm.hideStr[obj] = currentArr.join(',')
        } else {
          recordvm.hideStr[obj] = ''
        }
        if (currentArr.indexOf('1') == -1) {
          recordvm.recordMsg.specialSuggest = ''
        }
      }
    })

    function getMsgList (printFlg, _lqblSeq) {
      var _recordMsg = recordvm.recordMsg;
       var _url = 'hzszyyjzmz/findMzbl.do';
      //HIS查询病历所需参数
      var _cstNam = '${cstNam}', _mpi = '${mpi}', _jzxh = '${jzxh}';
      publicFun.httpServer({ url: _baseUrl + _url }, { 'emgSeq': _emgSeq, 'requestSource': requestSource, 'cstNam': _cstNam, 'mpi': _mpi, 'jzxh': _jzxh, 'lqblSeq': _lqblSeq }, function (data) {
        if (data.resultInfo.type == 1) {
          var objInfo = data.resultInfo.sysdata, _emgInfo = objInfo.hspemginfCustom;
          // var objInfo = data, _emgInfo = objInfo.hspemginfCustom;
          var baseInfo = ['cstNam', 'cstSexCod', 'pheNbr', 'mzZzzd', 'mzCbzd', 'vstCad', 'mpi', 'emgSeq', 'jzxh'];
          baseInfo.forEach(function (item, idx) {
            recordvm.baseMsg[item] = _emgInfo[item]
          })
          if (_emgInfo.cstAge) {
            recordvm.baseMsg.age = _emgInfo.cstAge + _emgInfo.cstAgeCod
          }
          // 疼痛评分赋值
          if (objInfo.hspNrsInfCustom) {
            var _nrsList = ['nrsSco', 'ttpfNr', 'ttpfTypeCod', 'xtpgSeq'];
            for (var i = 0; i < _nrsList.length; i++) {
              recordvm.recordMsg[_nrsList[i]] = objInfo.hspNrsInfCustom[_nrsList[i]];
            }
          } else {
            recordvm.recordMsg.nrsSco = null;
          }
          // 跌倒评估赋值
          if (objInfo.hspFallassInfCustom) {
            recordvm.recordMsg.fallAssCod = objInfo.hspFallassInfCustom.fallAssCod;
            recordvm.recordMsg.fallassSeq = objInfo.hspFallassInfCustom.fallassSeq;
          }
          if (objInfo.hspLqblInfCustom.lqblSeq != null) {
            setMsgVal(objInfo.hspLqblInfCustom);
          } else {
            // 新增的生命体征取预检
            var _signList = ['tgjcXyUp', 'tgjcXyDown', 'tgjcTw', 'tgjcCbzy', 'tgjcHx', 'tgjcXt', 'tgjcXtFlg', 'tgjcXtType', 'tgjcPulse', 'tgjcMb', 'tgjcCbzyFlg', 'tgjcPulseFlg', 'tgjcMbFlg'];
            _signList.forEach(function (item, idx) {
              recordvm.recordMsg[item] = objInfo.hspLqblInfCustom[item]
            })
            if ('HIS_NO_PATIENT' == requestSource) {
              var _selMsgList = ['tgjcXyFlg', 'tgjcTwFlg', 'tgjcMbFlg', 'tgjcPulseFlg', 'tgjcHxFlg', 'tgjcCbzyFlg', 'tgjcXtFlg'];
              _selMsgList.forEach(function (item, idx) {
                recordvm.recordMsg[item] = '1'
              })
            }
            _recordMsg.cratNam = '${sessionScope.activeUser.usrname}';
            _recordMsg.cratNbr = '${sessionScope.activeUser.usrno}';
            _recordMsg.oprtDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
            if (objInfo.hspLqblInfCustom.adviceList != null && objInfo.hspLqblInfCustom.adviceList !== '') {
              recordvm.recordMsg.adviceList = objInfo.hspLqblInfCustom.adviceList;
              dealAdviceList(objInfo.hspLqblInfCustom.adviceList);
            }
             if (objInfo.hspLqblInfCustom.jyJcList != null && objInfo.hspLqblInfCustom.jyJcList !== '') {
              recordvm.recordMsg.jyJcList = objInfo.hspLqblInfCustom.jyJcList
              dealJyJcList(objInfo.hspLqblInfCustom.jyJcList)
            }
            
            // _recordMsg.lqblDes = _emgInfo.preDgnCod; // 1、 主诉不要默认取预检
            // if (_emgInfo.mnsSitCod != null) {
            //   $.each(recordvm.recordList.mnsSitCodList, function (_index, _val) {
            //     if (_emgInfo.mnsSitCod == _val.infocode) {
            //       _recordMsg.mnsSitCod = _val.info
            //     }
            //   })
            // }
          }
          if (printFlg) {
            printnote();
          }
          findDzqmImg();
          checkRole(recordvm.recordMsg.cratNbr);
        }
      })
    }

    function dealAdviceList(list) {
      if (list.length < 1) {
        return
      }
      var keySplitList = ['highRisk', 'orderStatus', 'daInfo', 'daDoseUnit', 'num', 'yfdw', 'daWayStr', 'daFreq'];
      for (var k = 0; k < list.length; k++) {
        var objItemList = {
          highRiskList: [],
          orderStatusList: [],
          daInfoList: [],
          daDoseUnitList: [],
          numList: [],
          yfdwList: [],
          daWayStrList: [],
          daFreqList: []
        };
        for (var i = 0; i < keySplitList.length; i++) {
          var _item = keySplitList[i];
          if (list[k][_item]) {
            objItemList[_item + 'List'] = list[k][_item].split('|br');
          }
        }
        var rtnStr = '', _allLength = objItemList.daInfoList.length, onlyInfoStr = '';
        for (var i = 0; i < _allLength; i++) {
          for (var j = 0; j < keySplitList.length; j++) {
            if (!objItemList[keySplitList[j] + 'List'][i]) {
              objItemList[keySplitList[j] + 'List'][i] = ''
            }
          }
          var onlyInfo = objItemList.daInfoList[i] + ' ' + objItemList.daFreqList[i] + '、';
          var _numInfo = objItemList.numList[i] + objItemList.yfdwList[i];
          if (_numInfo) {
            _numInfo = '(共' +  _numInfo + ')'
          }
          var _totalMsg = ''
          if(i==_allLength-1){
             _totalMsg += objItemList.daInfoList[i] + ' ' + objItemList.daDoseUnitList[i] + ' ' + objItemList.daWayStrList[i] + ' ' + objItemList.daFreqList[i] + ' '  +  _numInfo + '、'
          }else{
             _totalMsg += objItemList.daInfoList[i] + ' ' + objItemList.daDoseUnitList[i] +  _numInfo + '、'
          }
          var _ZfStr = '<span style=\"color: red; font-weight: bold;\">[作废]</span>  ', _highRiskStr = '<span style=\"color: red;font-weight:bold;\">(危)</span>  ';
          if (objItemList.highRiskList[i] == '高危') {
            if (objItemList.orderStatusList[i] == '作废') {
              rtnStr += _ZfStr + _highRiskStr + _totalMsg
              onlyInfoStr += _ZfStr + _highRiskStr + onlyInfo
            } else {
              rtnStr += _highRiskStr + _totalMsg
              onlyInfoStr += _highRiskStr + onlyInfo
            }
          } else {
            if (objItemList.orderStatusList[i] == '作废') {
              rtnStr += _ZfStr + _totalMsg
              onlyInfoStr += _ZfStr + onlyInfo
            } else {
              rtnStr += _totalMsg
              onlyInfoStr += onlyInfo
            }
          }
        }
        // 显示药疗和嘱托
        if (list[k].daType != '药疗') {
          if (list[k].daType == '嘱托') {
            onlyInfoStr = onlyInfoStr.substring(0, onlyInfoStr.length - 1) + '；';
            $('.docMsg' + k).html('&nbsp;&nbsp;' + onlyInfoStr)
            list[k].adviceStr = onlyInfoStr;
          }
        } else {
          rtnStr = rtnStr.substring(0, rtnStr.length - 1) + '；';
          $('.docMsg' + k).html('&nbsp;&nbsp;' + rtnStr)
          list[k].adviceStr = rtnStr
        }
      }
    }

    function dealJyJcList(list) {
     if (list.length < 1) {
        return
      }
      var rtnMsg = '';
      for(var k = 0; k < list.length; k++){
         rtnMsg += '&nbsp;&nbsp' + list[k].daInfo + '<br/>'
      }
      $('.checkMsg').html(rtnMsg)
    }

    function setMsgVal(res, type) {
      for (var key in res) {
        if (recordvm.recordMsg.hasOwnProperty(key)) {
          var _value = res[key];
          if (_value != '' && _value != null) {
            if (type === 'lq') {
              if (key !== 'lqblSeq' && key !== 'cstAdr' && key !== 'nowHis') {
                if (key !== 'specialAssess') {
                  recordvm.recordMsg[key] = _value;
                }
              }
            } else {
              if (key !== 'specialAssess') {
                recordvm.recordMsg[key] = _value;
              } else {
                recordvm.recordMsg[key] = _value.split(',');
                recordvm.hideStr[key] = _value;
              }
            }
            if (key === 'oprtDat') {
              recordvm.recordMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'adviceList') {
              recordvm.recordMsg[key] = JSON.parse(JSON.stringify(_value))
              dealAdviceList(_value)
            }
            if (key === 'jyJcList') {
              recordvm.recordMsg[key] = JSON.parse(JSON.stringify(_value))
              dealJyJcList(_value)
            }
          }
        }
      }
      //judgeIsShowSaveBtn();
    }

    // 刷新治疗意见
    function refreshTreatmentOptions () {
      var _cstNam = '', _mpi = '', _jzxh = '', _url = 'hzszyyjzmz/refreshTreatmentOptions.do';
      _mpi = '${mpi}';
      _jzxh = '${jzxh}';
      publicFun.httpServer({ url: _baseUrl + _url }, { 'mpi': _mpi, 'jzxh': _jzxh}, function (data) {
        var obj = '';
        if (data.resultInfo.type == 1) {
          obj = data.resultInfo.sysdata.hspLqblInfCustom;
          if (obj.jyJcList != null && obj.jyJcList !== '') {
            recordvm.recordMsg.jyJcList = JSON.parse(JSON.stringify(obj.jyJcList))
            dealJyJcList(obj.jyJcList)
          }
          if (obj.adviceList != null && obj.adviceList !== '') {
            recordvm.recordMsg.adviceList = JSON.parse(JSON.stringify(obj.adviceList))
            dealAdviceList(obj.adviceList)
          }
        }
      })
    }
    // var isOpenBox = false;
    //新增初步诊断
    function addPreDgnCod(type, num) {
      if (parent.pageFlg) {
        return;
      }
      createmodalwindow('初步诊断', 800, 460, _baseUrl + 'zyyqjs/querylrNew.do?emgSeq=' + _emgSeq + '&&jbzdType=' + type + '&&trnumber=' + num, 'no');
      // createmodalwindow(_title, 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${emgSeq}&&jbzdType=' + type + '&&trnumber=' + num, 'no');
    }
    /**
     * @ 保存
     */
    function saveRecordnote(printFlg) {
      publicFun.cleanSignMsg('username');
      if (printFlg === 'print') {
        saveMsgRecord(printFlg)
      } else {
        saveMsgRecord();
      }
    }

    /**
       * @ 签名
       */
    function getSign() {
      var lqblSeq = recordvm.recordMsg.lqblSeq;
      if (lqblSeq != null && lqblSeq != '') {
        publicFun.httpServer(
          { url: _baseUrl + 'zyylqbl/getSign.do' },
          { "emgSeq": _emgSeq, "relevanceId": lqblSeq, "documentTable": 'HSP_LQBL_INF', "templateId": 'hash_002', "request172": '门诊病历' },
          function (res) {
            if (res.resultInfo.type == 1) {
              findDzqmImg();
            }
            message_alert(res);
            setTimeout("$('.messager-body').window('close')", 1000);
          })
      } else {
        publicFun.alert("请先保存数据。");
      }
    }

    function findDzqmImg() {
      var lqblSeq = recordvm.recordMsg.lqblSeq;
      if (lqblSeq != null && lqblSeq != '') {
        publicFun.httpServer(
          { url: _baseUrl + 'zyylqbl/findDzqmImg.do' },
          { "relevanceId": lqblSeq, "documentTable": 'HSP_LQBL_INF' },
          function (res) {
            if (res.resultInfo.type != 1) {
              message_alert(res);
              return false;
            }
            $("#dzqm").html('');
            var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
            for (var i = 0; i < imgList.length; i++) {
              var img = $("<img />")
              $("#dzqm").append(img.attr({ "src": "data:image/jpeg;base64," + res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg, "width": 88 }));
            }
          })
      }
    }

    function saveMsgRecord(printFlg) {
      jquerySubByFId('recordnoteForm', insertuser_callback, printFlg, "json");
    }
    
    function reloadSourceEmg (_emgSeq) {
      var openTabUrl = _baseUrl + 'zyyxtpg/toLeftWrap.do?cstNam=${cstNam}&pageSrc=qjsCaseMz&requestSource=' + requestSource + '&mpi=${mpi}&emgSeq=' + _emgSeq + '&jzxh=${jzxh}' + '&th=' + new Date().getTime();
      parent.parent.parent.$("#tabs").tabs('getSelected')[0].firstChild.src = openTabUrl;
      //var subtitle = parent.parent.parent.$("#tabs").tabs('getSelected').title;
       // 0 是刷新局部； 1 是刷新页面； 3 是混合[已去掉]
      // 遇到同名 tab 时刷新当前 tab
      /*parent.$('#tabs').tabs('close', subtitle);
      window.top.$('#tabs').tabs('add', {
         title: subtitle,
         content: window.top.createFrame(openTabUrl, '0'),
         closable: true,
         iconCls: 'icon '
       }); */
    }

    function insertuser_callback(data, printFlg) {
      if (printFlg === 'print') {
        if (data.resultInfo.type == '1') {
          if ('HIS_NO_PATIENT' == requestSource) {
            recordvm.baseMsg.emgSeq = data.resultInfo.sysdata.emgSeq;
            _emgSeq = data.resultInfo.sysdata.emgSeq;
            //通过历史病历主键获取数据打印
            getMsgList(printFlg,recordvm.recordMsg.lqblSeq)
            setTimeout(function () {
              reloadSourceEmg(_emgSeq);
            }, 1000);
          } else {
            // if (parent.parent.getHisRecord) {
            //   parent.parent.getHisRecord()
            // }
            //通过历史病历主键获取数据打印
            getMsgList(printFlg,recordvm.recordMsg.lqblSeq)
          }
          parent.parent.getDiseaseRecord();
        }
      } else {
        message_alert(data);
        if (data.resultInfo.type == '1') {
          if ('HIS_NO_PATIENT' == requestSource) {
            recordvm.baseMsg.emgSeq = data.resultInfo.sysdata.emgSeq;
            _emgSeq = data.resultInfo.sysdata.emgSeq;
            reloadSourceEmg(_emgSeq);
          } else {
            setTimeout(function () {
              // if (parent.parent.getHisRecord) {
              //   parent.parent.getHisRecord()
              // }
              window.location.reload();
            }, 800)
          }
          parent.parent.getDiseaseRecord();
        }
      }
    }

    $("body").click(function () {
      $("#userNameList").hide();
    });

    window.onload = function () {
      findDzqmImg();
    }
    
    // 删除门诊病历
    function deleteCurrentNote () {
      _confirm('确定删除吗？', null, function () {
        publicFun.httpServer({url: _baseUrl + 'hzszyyjzmz/delMzbl.do'}, { lqblSeq: recordvm.recordMsg.lqblSeq}, function (res) {
          message_alert(res);
          if (res.resultInfo.type == 1) {
            var _noMsgList = ['gmsFlg', 'medHisCod', 'drugHisCod', 'oprtHisCod', 'tramHisCod', 'crbHisCod'],
                _selMsgList = ['tgjcXyFlg', 'tgjcTwFlg', 'tgjcMbFlg', 'tgjcPulseFlg', 'tgjcHxFlg', 'tgjcCbzyFlg', 'tgjcXtFlg'];
            getMsgList();
            for (var key in recordvm.recordMsg) {
              if (_noMsgList.indexOf(key) != -1) {
                recordvm.recordMsg[key] = 0
              } else if (_selMsgList.indexOf(key) != -1) {
                recordvm.recordMsg[key] = '1'
              } else {
                if (key === 'adviceList') {
                  recordvm.recordMsg[key] = [];
                } else if (key === 'specialAssess') {
                  recordvm.recordMsg[key] = ['0'];
                  recordvm.hideStr[key] = '0';
                } else {
                  recordvm.recordMsg[key] = ''
                }
              }
            }
            $("#dzqm").html('');
          }
          if (parent.parent.getDiseaseRecord) {
            parent.parent.getDiseaseRecord()
          }
        })
      });
    }

    // 判断历史病历最近一条数据的预检号+创建人是否同当前这笔一致；
    function fullCurrentNote () {

    }

    // 设置按钮显示隐藏
    function setBtnDis (list, showDis) {
      list.forEach(function (item) {
        $('#' + item).css({'display': showDis})
      })
    }

    // 是否显示保存按钮
    function judgeIsShowSaveBtn() {
      var _userNum = '${sessionScope.activeUser.usrno}';
      if (recordvm.recordMsg.cratNbr != _userNum && _userNum != 'admin') {
        setBtnDis(['save', 'delete'], 'none');
        $('.importBtnLink').hide();
        $('#recordnoteForm input, #recordnoteForm textarea, #recordnoteForm select').attr('disabled', true);
        // $('#print').attr('onclick', "getMsgList('print',"+recordvm.recordMsg.lqblSeq+")")
        $('#print').attr('onclick', "printnote()");
        setIframeDivHeight = true;
      } else {
        setBtnDis(['save', 'delete'], 'inline-block');
        $('.importBtnLink').show();
        // $('#print').attr('onclick', "saveRecordnote('print')")
        $('#print').attr('onclick', "printnote()");
        setIframeDivHeight = false;
      }
    }
    
    //获取历史病历
    var _his_lqblSeq = '';
    function judgeIsGetHisList () {
      publicFun.httpServer({url: '${baseurl}hzszyyemg/getJzlqblAjax.do', isNoLoad: true, isAsync: false}, { mpi: parent.parent.vm.patientMsg.mpi }, function (res) {
        if (res.resultInfo && res.resultInfo.messageCode === 906) { // 请求成功
          var allList = res.resultInfo.sysdata.jzlqblList;
          if (allList.length > 0) {
            _his_lqblSeq = allList[0].lqblSeq;
          }
          getMsgList('',_his_lqblSeq)
        } else {
          getMsgList()
        }
      }, function () {
        getMsgList()
      })
    } 

    $(function () {
      //默认隐藏所有按钮
      setBtnDis(['save', 'delete', 'sign', 'print'], 'none');
      if (parent._lqblSeq_his) {
        getMsgList('', parent._lqblSeq_his)
      } else {
        getMsgList();
        // 去除获取历史病历
        // judgeIsGetHisList();
      }
      $('.mainbody').height($('#main', parent.document).height() - 45);
      // 所有的文本框都设置不填充
      $('input:not([autocomplete]),textarea:not([autocomplete]),select:not([autocomplete])').attr('autocomplete', 'off');
    })

    document.onkeydown = function (evt) {
      switch (evt.keyCode) {
        case 18: // Alt
          event.preventDefault();
        case 116: // F5
          event.preventDefault();
        case 122: // F11
          event.preventDefault();
      }
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        // if ($("#username").is(":focus")) {
        //   publicFun.SearchList('username', 'userNameList');
        //   flg = false;
        // }
        return flg;
      })
    };

     //初始化 判断登陆用户角色是否有权限对该医师进行操作
     function checkRole(_cratNbr) {
       $.ajax({
         url: "${baseurl}zyylqbl/checkRoleAjax.do?",
         type: "post",
         data: {
           "cratNbr": _cratNbr
         },
         success: function (data) {
           if (parent.pageFlg) {
             setBtnDis(['save', 'delete', 'sign'], 'none');
           } else {
             //如果是 admin 和doctorSelf 则有所有权限
             if (data.resultInfo.message == "admin" || data.resultInfo.message == "doctorSelf") {
              setBtnDis(['save', 'delete', 'sign', 'print'], 'inline-block');
              $('.importBtnLink').show();
              // $('#print').attr('onclick', "saveRecordnote('print')")
              $('#print').attr('onclick', "printnote()");
              setIframeDivHeight = false;
             } else {
               $('.importBtnLink').hide();
              $('#recordnoteForm input, #recordnoteForm textarea, #recordnoteForm select').attr('disabled', true);
              // $('#print').attr('onclick', "getMsgList('print',"+recordvm.recordMsg.lqblSeq+")")
              $('#print').attr('onclick', "printnote()");
              setIframeDivHeight = true;
              //如果是日常医生 但不是创建人则有签名权限
               if(data.resultInfo.message == "doctor"){
                 setBtnDis(['sign', 'print'], 'inline-block');
               } else if(data.resultInfo.message == "nurse"){
                 setBtnDis(['print'], 'inline-block');
               }
             }
           }
         }
       })
     }
  </script>
</body>

</html>