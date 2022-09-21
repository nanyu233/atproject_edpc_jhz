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
      _cratNbr = '${_cratNbr}',
      _emgSeq = '${hspemginfCustom.emgSeq}',
      _sqlStaCod = '${hspemginfCustom.sqlStaCod}',
      _cstAgeNew = '${hspemginfCustom.cstAge}',
      _cstAgeCodNew = '${hspemginfCustom.cstAgeCod}',
      _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}',
      _sexVal = '${hspemginfCustom.cstSexCod}',
      _btnType = 'qjsRecordNote';
    var _periodList = [{ info: '经期', infocode: '0' }, { info: '非经期', infocode: '22' }, { info: '妊娠', infocode: '1' }, { info: '已绝经', infocode: '2' }];
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="recordnote doctornote" ms-controller="recordnote">
  <div class="mainbody">
    <p class="subheadtitle">首次病历记录</p>
    <form id="recordnoteForm" action="${baseurl}zyylqbl/submitlqbl.do" method="post">
      <input type="hidden" name="formToken" value="${formToken}" />
      <input id="lqblSeq" type="text" name="hspLqblInfCustom.lqblSeq" class="hidden" ms-duplex-string="recordMsg.lqblSeq">
      <input type="text" name="hspLqblInfCustom.bltype" value="0" class="hidden">
      <input type="text" name="hspLqblInfCustom.emgSeq" class="hidden" value="${hspemginfCustom.emgSeq}">
      <div class="divwrapper">
        <div class="basicDiv">
          <label class="bascilab m-lten">姓名：<input class="basicInput" type="text" value="${hspemginfCustom.cstNam}" readonly
              unselectable='on'></label>
          <label class="bascilab">性别：<input class="basicInput" type="text" value="${hspemginfCustom.cstSexCod}"
              readonly unselectable='on'></label>
          <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" id="ageInput" readonly
              unselectable='on'></label>
          <label class="bascilab">科别：<input class="basicInput longbasicInput" type="text" value="急诊科门诊"
              readonly unselectable='on'></label>
          <label class="bascilab">病历号：<input class="basicInput" type="text" value="${hspemginfCustom.mpi}" readonly
              unselectable='on'></label>
          <!-- <label class="bascilab">留观号：<input class="basicInput" type="text" value="${hspemginfCustom.observationCode}"
              name="hspemginfCustom.observationCode" readonly unselectable='on'></label> -->
        </div>
        <a class="my-linkbutton btna importBtnLink" data-options="toggle:true,plain:true" ms-click="importMzMsg()">[导入历史病历]</a>
        <a class="my-linkbutton btna importBtnLink" data-options="toggle:true,plain:true" ms-click="importTempMsg()">[导入我的模板]</a>
        <ul class="ulwrapper">
          <!-- <li class="halfli">
            <span class="smalltitle">联系地址：</span>
            <input type="text" name="hspLqblInfCustom.cstAdr" ms-duplex-string="recordMsg.cstAdr" class="inputWth">
          </li>
          <li class="halfli">
            <span class="smalltitle">入观时间：</span>
            <input id="_ryrqDatInput" class="Wdate spcWdate" type="text" name="hspLqblInfCustom.lqblDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              ms-duplex-string="recordMsg.lqblDat">
          </li> -->
          <li>
            <span class="smalltitle">主诉：</span>
            <input class="longinput" type="text" name="hspLqblInfCustom.lqblDes" ms-duplex-string="recordMsg.lqblDes"
              maxlength="90" id="lqblDesText" ondblclick="showMsg('lqblDesText', '551')">
          </li>
          <li class="varylongli">
            <span class="smalltitle">现病史：</span>
            <textarea class="smaTexta nowHisTx" name="hspLqblInfCustom.nowHis" maxlength="1000" id="currentNowHis" ondblclick="showMsg('currentNowHis', '555')" ms-duplex-string="recordMsg.nowHis">
            </textarea>
          </li>
          <!-- 这边的既往史只显示既往史、个人史、家族史[就是显示文字修改，字段用其他的] -->
          <li>
            <span class="smalltitle">既往史：</span>
            <input type="text" class="longinput" ms-duplex-string="recordMsg.medHis" name="hspLqblInfCustom.medHis" 
            maxlength="90" id="medHisCodText" ondblclick="showMsg('medHisCodText', '554')">
          </li>
          <li>
            <span class="smalltitle">个人史：</span>
            <input class="longinput" type="text" ms-duplex-string="recordMsg.obstHis" name="hspLqblInfCustom.obstHis" id="obstHisText"
            ondblclick="showMsg('obstHisText', '590')">
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
              <select id="SdpSel" class="Signsel" name="hspLqblInfCustom.tgjcXyFlg" ms-duplex-string="recordMsg.tgjcXyFlg"
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
              <select id="tempretureSel" name="hspLqblInfCustom.tgjcTwFlg" ms-duplex-string="recordMsg.tgjcTwFlg" class="Signsel"
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
              <select id="tgjcCbzySel" name="hspLqblInfCustom.tgjcCbzyFlg" ms-duplex-string="recordMsg.tgjcCbzyFlg" class="Signsel" 
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
              <select id="tgjcHxSel" name="hspLqblInfCustom.tgjcHxFlg" class="Signsel" ms-duplex-string="recordMsg.tgjcHxFlg"
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
            <select name="hspLqblInfCustom.tgjcXtType" ms-duplex-string="recordMsg.tgjcXtType" id="tgjcXtType">
              <option value=""></option>
              <option ms-repeat="recordList.tgjcXtTypeList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
            <select class="Signsel" name="hspLqblInfCustom.tgjcXtFlg" ms-duplex-string="recordMsg.tgjcXtFlg" id="tgjcXtFlg"
              ms-change="cleanSignValue('tgjcXtFlg', 'tgjcXt')">
              <option value="1"></option>
              <option value="2">LO</option>
              <option value="3">HI</option>
              <option value="4">拒测</option>
            </select>
            <input type="text" maxlength="5" ms-attr-disabled="recordMsg.tgjcXtFlg==2 || recordMsg.tgjcXtFlg==3" name="hspLqblInfCustom.tgjcXt"
              ms-duplex-string="recordMsg.tgjcXt" class="small_input" ms-keyup="onlyNum('tgjcXt',2,100)">mmol/L</span>
          </li>
          <li class="certainli">
            <label>
              <span class="smalltitle">心率：</span>
              <select id="tgjcMbSel" name="hspLqblInfCustom.tgjcMbFlg" ms-duplex-string="recordMsg.tgjcMbFlg"
                ms-change="cleanSignValue('tgjcMbFlg', 'tgjcMb')">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hspLqblInfCustom.tgjcMb" ms-duplex-string="recordMsg.tgjcMb" class="small_input"
                ms-keyup="onlyNum('tgjcMb')" ms-attr-disabled="recordMsg.tgjcMbFlg == 2 || recordMsg.tgjcMbFlg == 3" >次/分
              &emsp;
            </label>
          </li>
          <li class="certainli">
            <label>
              <span class="smalltitle">脉搏：</span>
              <select id="tgjcPulseSel" name="hspLqblInfCustom.tgjcPulseFlg" ms-duplex-string="recordMsg.tgjcPulseFlg"
                ms-change="cleanSignValue('tgjcPulseFlg', 'tgjcPulse')">
                <option value="1"></option>
                <option value="2">测不出</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" name="hspLqblInfCustom.tgjcPulse" ms-duplex-string="recordMsg.tgjcPulse"
                class="small_input" ms-keyup="onlyNum('tgjcPulse')" 
                ms-attr-disabled="recordMsg.tgjcPulseFlg == 2 || recordMsg.tgjcPulseFlg == 3" >次/分
              &emsp;
            </label>
          </li>
          <li class="speclongli">
            <span class="smalltitle">查体内容：</span>
            <textarea name="hspLqblInfCustom.ctnrDes" ms-duplex-string="recordMsg.ctnrDes" maxlength="500" id="ctnrDesText" ondblclick="showMsg('ctnrDesText', '550')"></textarea>
          </li>
          <li class="varylongli">
            <span class="smalltitle">
              辅助检查：
            </span>
            <textarea name="hspLqblInfCustom.fzjcDes" ms-duplex-string="recordMsg.fzjcDes" maxlength="500" id="fzjcDesText" ondblclick="showMsg('fzjcDesText', '552')"></textarea>
          </li>
          <li>
            <table id="diagnosistab">
              <tr>
                <td>
                  <span class="longtitle"><span><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod(2, '1')">[查看]</a></span>初步诊断：</span>
                  <div class="input readonly sepcialWthLong" id="show_text2">${hspemginfCustom.jbzdDes}</div>
                </td>
              </tr>
            </table>
          </li>
          <li class="varylongli">
            <div class="temdiv temdivRecord" id="subTemDiv"></div>
            <span class="smalltitle">
              诊疗计划：
              <a class="my-linkbutton btna atitle importBtnLink" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
            </span>
            <textarea name="hspLqblInfCustom.treatmentPlan" id="treatmentPlanText" ms-duplex-string="recordMsg.treatmentPlan" maxlength="500"></textarea>
          </li>
          <li class="hidden">
            <span class="smalltitle">病人去向：</span>
            <input type="text" name="hspLqblInfCustom.cstDspCod" value="${hspemginfCustom.sqlStaCod}" readonly
              unselectable='on'>
            <input type="text" class="department" name="hspLqblInfCustom.sqlDepCod" value="${hspemginfCustom.sqlDepCod}"
              readonly unselectable='on'>
            <input type="text" class="transfer" name="hspLqblInfCustom.sqlDes" value="${hspemginfCustom.sqlDes}"
              readonly unselectable='on'>
          </li>
          <!-- ms-visible="recordMsg.lqblCont!=''" -->
          <li class="varylongli textareaLi" id="textareaLi">
            <textarea class="bigDataDiv" id="bigDataDiv" name="hspLqblInfCustom.lqblCont" ms-duplex-string="recordMsg.lqblCont" /></textarea>
          </li>
          <li class="rightli">          	
            <span>医师签名</span>
            <span class="spanRelative">
              <input type="text" id="username" maxlength="10" name="hspLqblInfCustom.cratNam" ms-duplex-string="recordMsg.cratNam" readonly>
              <input type="text" class="hidden" id="usernameNum" maxlength="10" name="hspLqblInfCustom.cratNbr" ms-duplex-string="recordMsg.cratNbr">
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
    <a href="javascript:;" id="sign" class="commonbtn leftBtn" onclick="getSign()">签名</a>
    <a id="save" href="javascript:;" class="commonbtn leftBtn" onclick="saveRecordnote()">保存</a>
    <a href="javascript:;" id="printBtn" class="commonbtn" onclick="saveRecordnote('print')">打印</a>
    <!-- <a href="javascript:;" class="commonbtn" onclick="connectField()">生成汇总字段</a> -->
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/lxrecord/printrecordnote.jsp"></jsp:include>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js"></script>
  <script type="text/javascript" charset="utf-8">
    function showMsg (name, seo) {
      parent.createmodalwindow('电子病历知识库', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?idName=' + name + '&tempSeo=' + seo + '&emgSeq=${hspemginfCustom.emgSeq}', 'no');
    }
    if (_sqlStaCod == '住院') {
      $('.department').show();
    } else {
      $('.department').hide();
    }

    if (_sqlStaCod == '转院') {
      $('.transfer').show();
    } else {
      $('.transfer').hide();
    }

    var newAgeval = _cstAgeNew + _cstAgeCodNew;
    if (!_cstAgeNew) {
      $('#ageInput').val('')
    } else {
      $('#ageInput').val(newAgeval)
    }

    var recordvm = avalon.define({
      $id: 'recordnote',
      recordList: {
        rsztCodList: [{ checked: false, infocode: '0', info: '否' }, { checked: false, infocode: '1', info: '是' }],
        mnsSitCodList: _periodList, //女性月经史
        tgjcXtTypeList: publicFun.getDict('XT_COD')
      },
      recordMsg: {
        lqblSeq: '',//id
        lqblDes: '',//主述
        lqblDat: '', //入观日期
        cstAdr: '', // 联系地址
        nowHis: '', // 现病史
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
        mcyjDat: '',//末次月经
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
        cstDspCod: '',//病人去向
        cratNam: '',//医生name
        cratNbr: '',//医生number
        menopsAge: '',//绝经年龄
        lqblCont: '',//留抢大字段
        mnsSitCod: '',//女性月经史
        caseHis: '',//怀孕周数
        sexVal: '${hspemginfCustom.cstSexCod}',//性别
        tgjcXtFlg: '1',//血糖扩充
        tgjcXt: '',//血糖 
        tgjcXtType: '', // 血糖类型
        oprtDat: '', //时间
        treatmentPlan:'',//诊疗计划
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
      // 导入历史病历
      importMzMsg: function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/getJzlqblAjax.do' }, { 'mpi': parent.parent.vm.patientMsg.mpi }, function (res) {
          if (res.resultInfo.type == 1) {
            if (res.resultInfo.sysdata.jzlqblList.length == 0) {
              publicFun.alert('当前没有可导的历史病历')
            } else {
              createmodalwindow('导入历史病历', 850, 490, _baseUrl + 'zyylqbl/medicalmport.do?typeSource=qjs')
            }
          }
        })

        // publicFun.httpServer({ url: _baseUrl + 'zyylqbl/findMzblByEmgSeq.do' }, { 'emgSeq': _emgSeq}, function (data) {
        //   if (data.type == 1) { // 成功
        //     var _data = data.sysdata.hspLqblInfCustom;
        //     if (!_data) {
        //       publicFun.alert('当前无今日门急诊病历');
        //       return false
        //     } else {
        //       for (var key in recordvm.recordMsg) {
        //         var saveCodMsg = ['lqblSeq', 'cstAdr', 'nowHis', 'sqlStaCod', 'sqlDat', 'sqlDes', 'sqlDepName', 'sqlDepCod'];
        //         if ($.inArray(key, saveCodMsg) == -1) {
        //           recordvm.recordMsg [key] = ''
        //         }
        //       } 
        //       setVal(_data, 'Mz');
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
            createmodalwindow('我的模板', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?isImportTemp=importTempQjs&emgSeq=${hspemginfCustom.emgSeq}', 'no');
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
      }
    })

    function getMsgList() {
      publicFun.httpServer({url: _baseUrl + 'zyylqbl/findLqbl.do', isNoLoad: true, isAsync: false}, {emgSeq: _emgSeq}, function (res) {
        setVal(res);
      })
    }

    function setVal(res, type) {
      for (var key in res) {
        if (recordvm.recordMsg.hasOwnProperty(key)) {
          var _value = res[key];
          if (_value != '' && _value != null) {
            if (type === 'Mz') {
              if (key !== 'lqblSeq' && key !== 'cstAdr' && key !== 'nowHis') {
                recordvm.recordMsg[key] = _value;
              }
            } else {
              recordvm.recordMsg[key] = _value;
            }
            recordvm.recordMsg[key] = _value;
            if (key === 'lqblDat' || key === 'oprtDat') {
              recordvm.recordMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
            }
            // if (key === 'mcyjDat') {
            //   recordvm.recordMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd')
            // }
            // if (key === 'rsztCod') {
            //   $.each(recordvm.recordList[key + 'List'], function (idx, val) {
            //     if (val['infocode'] == _value) {
            //       val['checked'] = true
            //     }
            //   })
            // }
          }
          if (!res.lqblSeq) {
            if (key === 'oprtDat') {
              recordvm.recordMsg[key] = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
            }
            recordvm.recordMsg.cratNam = _name;
            recordvm.recordMsg.cratNbr = _number;
            // 新增的生命体征取预检
            var _signList = ['tgjcXyUp', 'tgjcXyDown', 'tgjcTw', 'tgjcCbzy', 'tgjcHx', 'tgjcXt', 'tgjcXtFlg', 'tgjcXtType', 'tgjcPulse', 'tgjcMb', 'tgjcCbzyFlg', 'tgjcPulseFlg', 'tgjcMbFlg'];
            _signList.forEach(function (item, idx) {
              recordvm.recordMsg[item] = res[item]
            })
          }
        }
      }
      checkRole(recordvm.recordMsg.cratNbr);
    }

    var isOpenBox = false;
    //新增初步诊断
    function addPreDgnCod(num, type) {
      var _title = '';
      var _list = [{ cod: 2, name: '初步诊断' }];
      $.each(_list, function (idx, val) {
        if (val.cod == num) {
          _title = val.name
        }
      })
      createmodalwindow(_title, 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${hspemginfCustom.emgSeq}&&jbzdType=' + type + '&&trnumber=' + num, 'no');
    }
    /**
     * @ 保存
     */
    function saveRecordnote(printFlg) {
      publicFun.cleanSignMsg('username');
      if (printFlg === 'print') {
        if (isOpenBox) {
          saveMsgRecord(printFlg)
        } else {
          printnote();
          return false;
        }
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
		      	{ "emgSeq": _emgSeq,"relevanceId": lqblSeq,"documentTable": 'HSP_LQBL_INF',"templateId":'hash_003',"request172":'留抢病历'}, 
		      	function (res) {
		      		if(res.resultInfo.type == 1){
			      		findDzqmImg();
		      		}
		      		message_alert(res);
              setTimeout("$('.messager-body').window('close')", 1000);
	      	})
	     }else{
	     	publicFun.alert("请先保存数据。");
	     }
    }
    
    function findDzqmImg() {
    	var lqblSeq = recordvm.recordMsg.lqblSeq;
    	if (lqblSeq != null && lqblSeq != '') {
    		publicFun.httpServer(
	      	{ url: _baseUrl + 'zyylqbl/findDzqmImg.do' }, 
	      	{ "relevanceId": lqblSeq,"documentTable": 'HSP_LQBL_INF'}, 
	      	function (res) {
	      		if(res.resultInfo.type != 1){
		      		message_alert(res);
		      		return false;
	      		}
	      		$("#dzqm").html('');
	      		var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
	      		for(var i=0; i <imgList.length; i++){
	      			var img = $("<img />")
	      			$("#dzqm").append(img.attr({"src":"data:image/jpeg;base64,"+res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg,"width":88}));
	      		}
	      	})
    	}
    }

    function saveMsgRecord (printFlg) {
      connectField();
      // if ($('#_ryrqDatInput').val() == null || $('#_ryrqDatInput').val() == "") {
      //   publicFun.alert("入观时间不能为空");
      //   return false;
      // }
      jquerySubByFId('recordnoteForm', insertuser_callback, printFlg, "json");
    }

    function insertuser_callback(data, printFlg) {
      window.sessionStorage.setItem('recordSave', printFlg);
      if (printFlg === 'print') {
        window.location.reload();
      } else {
        message_alert(data);
        setTimeout(function () {
          if (parent.parent.getHisRecord) {
            parent.parent.getHisRecord()
          }
          window.location.reload();
        }, 800)
      }
    }

    window.onload = function () {
      var _print = window.sessionStorage.getItem('recordSave');
      if (_print === 'print') {
        window.sessionStorage.removeItem('recordSave');
        setTimeout(function () {
          printnote();
        }, 800);
      }
      findDzqmImg();
    }
    /**
     * @ 删除
     */
    // function delRecordnote() {
    //   _confirm('确定删除该数据吗？', null, function () {
    //     var lqblSeq = $("#lqblSeq").val();
    //     if (lqblSeq != null && lqblSeq != '') {
    //       $.ajax({
    //         url: "${baseurl}zyylqbl/deletelqbl.do",
    //         type: "post",
    //         data: {
    //           "lqblSeq": lqblSeq
    //         },
    //         success: function (data) {
    //           message_alert(data);
    //           setTimeout(function () {
    //             window.location.reload();
    //           }, 800)
    //         }
    //       })
    //     }
    //   });
    // }

    /**
     * @ 拼接一个大字段
     */
    function connectContent() {
      var StringContent = '';
      // if (recordvm.recordMsg.lqblDat != '') {
      //   StringContent += '入观日期：' + recordvm.recordMsg.lqblDat + '，';
      // }
      if (recordvm.recordMsg.lqblDes.replace(/ /img, '') != '') {
        StringContent += '主诉：' + recordvm.recordMsg.lqblDes + '，';
      }
      if ($('.nowHisTx').val() != '') {
        StringContent += '现病史：' + $('.nowHisTx').val() + '，';
      }
      if (recordvm.recordMsg.medHis.replace(/ /img, '') != '') {
        StringContent += '既往史：' + recordvm.recordMsg.medHis + '，';
      }
      if (recordvm.recordMsg.obstHis.replace(/ /img, '') != '') {
        StringContent += '个人史：' + recordvm.recordMsg.obstHis + '，';
      }
      if (recordvm.recordMsg.famlHis.replace(/ /img, '') != '') {
        StringContent += '家族史：' + recordvm.recordMsg.famlHis + '，';
      }
      var sel = $('#SdpSel').val(),
          selVal = $('#SdpSel option:selected').text();
      if (sel == '2' || sel == '3') {
        StringContent += '血压：' + selVal + '，';
      }
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcXyUp) == false && publicFun.checkItemNull(recordvm.recordMsg.tgjcXyDown) == true) {
        StringContent += '血压：收缩压' + recordvm.recordMsg.tgjcXyUp + '，';
      }
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcXyDown) == false && publicFun.checkItemNull(recordvm.recordMsg.tgjcXyUp) == true) {
        StringContent += '血压：舒张压' + recordvm.recordMsg.tgjcXyDown + '，';
      }
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcXyUp) == false && publicFun.checkItemNull(recordvm.recordMsg.tgjcXyDown) == false) {
        StringContent += '血压：' + recordvm.recordMsg.tgjcXyUp + '/' + recordvm.recordMsg.tgjcXyDown + 'mmHg，';
      }
      var tempVal = $('#tempretureSel option:selected').text();
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcTw) == false) {
        StringContent += '体温：' + tempVal + recordvm.recordMsg.tgjcTw + '℃，';
      } else {
        if (tempVal) {
          StringContent += '体温：' + tempVal + '，';
        }
      }
      var tgjcCbzyVal = $('#tgjcCbzySel option:selected').text();
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcCbzy) == false) {
        StringContent += '床边指氧饱和度：' + tgjcCbzyVal + recordvm.recordMsg.tgjcCbzy + '%，';
      } else {
        if (tgjcCbzyVal) {
          StringContent += '床边指氧饱和度：' + tgjcCbzyVal + '，';
        }
      }

      var brhVal = $('#tgjcHxSel option:selected').text();
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcHx) == false) {
        StringContent += '呼吸：' + brhVal + recordvm.recordMsg.tgjcHx + '次/分，';
      } else {
        if (brhVal) {
          StringContent += '呼吸：' + brhVal + '，';
        }
      }

      var xtSel = recordvm.recordMsg.tgjcXtFlg;
      var xtTypeCod = $('#tgjcXtType option:selected').text(), xtType = $('#tgjcXtFlg option:selected').text();
      if (xtTypeCod != '') {
        xtTypeCod = '(' + xtTypeCod + ')';
      }
      if (xtSel == '2' || xtSel == '3') {
        StringContent += '血糖：' + xtType + xtTypeCod + '，';
      } else {
        var _xtText = recordvm.recordMsg.tgjcXt + 'mmol/L';
        if (_xtText == 'mmol/L') {
          _xtText = ''
        }
        if (_xtText != '' || publicFun.checkItemNull(xtTypeCod) == false) {
          StringContent += '血糖：' + _xtText +  xtTypeCod  + '，';
        }
      }
      var tgjcMbVal = $('#tgjcMbSel option:selected').text();
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcMb) == false) {
        StringContent += '心率：' + tgjcMbVal + recordvm.recordMsg.tgjcMb + '次/分，';
      } else {
        if (tgjcMbVal) {
          StringContent += '心率：' + tgjcMbVal + '，';
        }
      }
      var tgjcPulseVal = $('#tgjcPulseSel option:selected').text();
      if (publicFun.checkItemNull(recordvm.recordMsg.tgjcPulse) == false) {
        StringContent += '脉搏：' + tgjcPulseVal + recordvm.recordMsg.tgjcPulse + '次/分，';
      } else {
        if (tgjcPulseVal) {
          StringContent += '脉搏：' + tgjcPulseVal + '，';
        }
      }
      if (recordvm.recordMsg.ctnrDes.replace(/ /img, '') != '') {
        StringContent += '查体内容：' + recordvm.recordMsg.ctnrDes + '，';
      }
      if (recordvm.recordMsg.fzjcDes.replace(/ /img, '') != '') {
        StringContent += '辅助检查：' + recordvm.recordMsg.fzjcDes + '，';
      }
      if ($('#show_text2').html() != '') {
        StringContent += '初步诊断：' + $('#show_text2').html() + '，';
      }
      return StringContent;

    }
    /**
     * 生成留抢信息字段
    */
    function connectField() {
      // saveRecordnote();
      var ConnectString = connectContent();
      if (ConnectString != '') {
        // $("#textareaLi").show();
        var finalField = ConnectString.substring(0, ConnectString.length - 1);//截取开始到长度减-1的字符串，去掉逗号
        finalField += ';';
        $('#bigDataDiv').val(finalField);
      } else if (ConnectString == '') {
        ConnectString = '';
        publicFun.alert("请先填写留抢病历！");
        $('#bigDataDiv').val(ConnectString);
      }
    }
    $("body").click(function () {
      $("#userNameList").hide();
    });

    $(function () {
      var height = $('#main', parent.document).height() - 45;
      $('.mainbody').height(height);
      getMsgList();
      initDocImportHtml('subTemDiv', 'treatmentPlanText');
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
      ////////////wenti
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do', isNoLoad: true }, { "cratNbr": _cratNbr }, function (data) {
        if (parent.pageFlg) { // 归档病历或无操作权限 => 隐藏操作按钮
          $('#save').hide()
          $('#sign').hide()
          $('#printBtn').attr("onClick","printnote()")
          isOpenBox = false;
        } else {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "nurse") {
            $("#save").hide();
            $('#sign').hide()
            isOpenBox = false;
          }else if(data.resultInfo.message == "doctor"){
            $("#save").hide();
            isOpenBox = false;
          }else{
            isOpenBox = true;
          }
        }
        //日志、归档病历、留抢病历 游客无权限
        if(data.resultInfo.message == "tourist"){
            $("#save").hide();
            $('#sign').hide();
            $('#printBtn').hide();
            isOpenBox = false;
          }
        if (isOpenBox == false) {
          setPageDisable();
        }
      })
    }

    function setPageDisable () {
      $('#recordnoteForm input, #recordnoteForm textarea, #recordnoteForm select').attr('disabled', true);
      $('.importBtnLink').hide();
    }
  </script>
</body>

</html>