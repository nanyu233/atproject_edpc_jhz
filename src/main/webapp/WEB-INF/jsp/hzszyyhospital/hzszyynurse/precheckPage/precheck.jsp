<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <title>接收病人-急诊-新</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/at-font/style.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/precheckNew.css?v=${versionDay}">
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <script type="text/javascript" src="${baseurl}js/public.js?v=${versionDay}"></script>
  <script src="${baseurl}js/subpageJs/precheck/dkAndJhy.js?v=${versionDay}" type="text/javascript"></script>
  <script type="text/javascript">
    var _baseUrl = "${baseurl}",
		_islgbed = '${islgbed}', // 0 不显示留观床位  1 显示留观床位
      _isOpenKnowledge = '0', // 是否打开知识库 1-打开 0-关闭
      typeForm = 'precheck',// 区别是哪个登记页面[误删]
      editFlag = '${editFlag}',
      _emgSeq = '${emgSeq}',
			_jdFlag = '0',   // 建档按钮 0 不显示 1 显示
			_tghFlag= '0',   // 退挂号按钮 0 不显示 1 显示
			_qfghFlag = '0', // 保存并挂号按钮 0 不显示 1 显示
			_ltklFlag = '0';// 绿通接口按钮 0 不显示 1 显示
      if (editFlag == '1') {
        typeForm = 'edit'
      }
			_HSPLP = '${HSPLP}'
    var isJumpToSdzx = '0',
        isJumpToYq = '0', // 是否开启院前
        _isOpenYqFlg = isJumpToYq,
        _isOpenJjyqFlg = '1',
        _taskNo = '${taskNo}'; // 从院前管理模块跳过来---未预检数据获取
		var regSeq;
  </script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/locale/easyui-lang-zh_CN.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/custom.jquery.form.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/custom.box.main.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/jquery.ajax.custom.extend.js?v=${versionDay}"></script>
  <script type="text/javascript" src="${baseurl}lib/My97DatePicker/WdatePicker.js?v=${versionDay}"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="jsbrqjs">
	<div class="left-tab">
    <div>
      <p>
        <span class="w2">日期</span>：<input class="Wdate small-dat-input" id="startDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" > - <input class="Wdate small-dat-input" id="endDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" >
        <!-- <label for="alreadyPrecheck" onclick="getLeftData()">
          <input type="checkbox" id="alreadyPrecheck" name="querytype" value="1"> 已挂号未预检
        </label> -->
      </p>
      <p>
        病人检索：<input id="nameXm" type="text" placeholder="就诊号或姓名"> 
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="getLeftData()">查询</a>
      </p>
      <!-- <p>
        查询条件：<label for="ghInput" onclick="setAfterCheckDisable()">
          <input class="preCheck" type="checkbox" id="ghInput"> 未关联挂号
        </label>
        <label for="tempStorageInput" onclick="setAfterCheckDisable()">
          <input class="preCheck" type="checkbox" id="tempStorageInput"> 暂存
        </label>
        <label class="preExamineLab" for="preExaminePatientInput" onclick="setPreCheckDisable()">
          <input type="checkbox" id="preExaminePatientInput"> 待预检院前患者
        </label>
      </p> -->
    </div>
    <table id="registeredList"></table>
  </div>
  <form ms-controller="jsbrqjs" id="userform" class="content-form" >
    <!-- 预检号 -->
    <input class="hidden" id="emg_emgSeq" type="text">
    <ul class="content-page">
      <li>
        <p class="part-title">
          <span>基本信息</span>
          <span class="gray-span black">登记时间</span>
          <input class="Wdate input-wth-B black" id="emg_emgDat" type="text" ms-duplex-string="patientMsg.regTim" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          <!-- <input class="Wdate input-wth-B black" type="text" ms-duplex-string="patientMsg.regTim" ms-if="isEditPage == 1" readonly> -->
          <!-- <span class="gray-span black">病历号</span>
          <input class="input-wth-C black" type="text" id="emg_mpi" ms-duplex-string="patientMsg.mpi" ms-attr-readonly="isEditPage == '1'"> -->
          <!-- <label ms-if="isEditPage == '1'">
            <span class="gray-span black">就诊次数</span>
            <input class="input-wth-sm bigBlueFt" type="text" id="emg_jzxh" ms-duplex-string="patientMsg.jzxh" readonly>
          </label> -->
          <span class="gray-span black">就诊卡</span>
          <input class="input-wth-A bigBlueFt" type="text" id="emg_vstCad" ms-duplex-string="patientMsg.vstCad" ms-attr-readonly="isEditPage == '1'">
					<span class="gray-span black">身份证号</span>
          <input class="" type="text" id="emg_idNbr" ms-duplex-string="patientMsg.idNbr" ms-attr-readonly="isEditPage == '1'">
          <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg('A')">实体社保卡</a>
          <!-- <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg('B')">电子社保卡</a> -->
          <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg('C')">身份证</a>
          <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg('B')">医保凭证</a>
          <!-- <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg('B')">电子健康卡/码</a> -->
          <a class="commonbtn read-text" href="javascript:;" onclick="getVisitingMsg('D')">就诊卡</a>
          <a class="commonbtn read-text " href="javascript:;" onclick="postJdInfo()"  id="jdBtn" ms-visible="jdFlag == 1">建档</a>
        </p>
      </li>
      <li class="twoSeven-li">
        <div class="oneFour-part big-font-div">
          <span class="left-ask"></span>
          <label class="thin-color w2">姓名</label>
          <input class="full-input-wth black" id="emg_cstNam" type="text" ms-duplex-string="patientMsg.cstNam" maxlength="25" ms-attr-readonly="isEditPage == '1'"/>
        </div>
        <div class="oneFour-part oneOne-part">
          <span class="left-ask"></span>
          <label class="thin-color w2">性别</label>
          <select class="full-input-wth black-select" id="emg_cstSexCod" class="width-auto" ms-duplex-string="patientMsg.cstSexCod" ms-attr-disabled="isEditPage == '1'">
            <option value=""></option>
            <option ms-repeat="getMsg.cstSexCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="oneFour-part oneSix-part">
          <span class="left-ask"></span>
          <label class="thin-color">出生日期</label>
          <input class="full-input-wth Wdate" type="text" ms-duplex-string="patientMsg.bthDat" ms-if="isEditPage == '1'" readonly>
          <input class="full-input-wth Wdate" type="text" onclick="WdatePicker({maxDate:'%y/%M/%d',dateFmt:'yyyy/MM/dd'})" ms-duplex-string="patientMsg.bthDat" ms-if="isEditPage != '1'">
        </div>
        <div class="oneFour-part">
          <span class="left-ask"></span>
          <label class="thin-color">入院年龄</label>
          <input class="small-input xs-samll-input" id="emg_cstAge" type="text" ms-duplex-string="patientMsg.cstAge" maxlength="4" ms-keyup="onlyNum('patientMsg','cstAge')"
            ms-change="onlyNum('patientMsg','cstAge')" ms-input="onlyNum('patientMsg','cstAge')" ms-visible="isEditPage != '1'">
          <select id="emg_cstAgeCod" class="xs-select" ms-duplex-string="patientMsg.cstAgeCod" ms-change="calcPatType()" ms-visible="isEditPage != '1'">
            <option ms-repeat="getMsg.cstAgeCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
          <input class="full-input-wth Wdate" type="text" ms-duplex-string="patientMsg.showAge" readonly ms-visible="isEditPage == '1'">
        </div>
        <div class="oneFour-part oneSeven-part">
          <span class="left-ask"></span>
          <label class="thin-color">联系方式</label>
          <input class="full-input-wth" type="text" ms-duplex-string="patientMsg.pheNbr" maxlength="30" ms-keyup="onlyNum('patientMsg','pheNbr')" 
          ms-change="onlyNum('patientMsg','pheNbr')" ms-input="onlyNum('patientMsg','pheNbr')" ms-attr-readonly="isEditPage == '1'">
        </div>
        <div class="twoEight-part">
          <span class="left-ask"></span>
          <label class="thin-color">联系地址</label>
          <input class="full-input-wth" type="text" ms-duplex-string="patientMsg.cstAdr" maxlength="100" ms-attr-readonly="isEditPage == '1'">
        </div>
      </li>
      <li ms-visible="patientMsg.patientTyp == '3' || patientMsg.patientTyp == '4'">
        <span class="left-ask"></span>
        <a class="cursor-type link-aText" onclick="readVisitHis()">[读取就诊历史]</a>
        <span class="left-ask"></span>
        <label>孕周(周)</label>
        <input class="basic-sm-input bigBlueFt" type="text" ms-duplex-string="patientMsg.yz" readonly>
        <!-- <span class="left-ask"></span>
        <label>孕</label>
        <input class="basic-sm-input bigBlueFt" type="text" ms-duplex-string="patientMsg.hysl" ms-attr-disabled="patientMsg.patientTyp != '3' && patientMsg.patientTyp != '4'" >
        <label class="m-l10">产</label>
        <input class="basic-sm-input bigBlueFt" type="text" ms-duplex-string="patientMsg.scsl" ms-attr-disabled="patientMsg.patientTyp != '3' && patientMsg.patientTyp != '4'" >
        <label class="m-l10">宫口</label>
        <input class="basic-sm-input bigBlueFt" type="text" ms-duplex-string="patientMsg.gkMsg" readonly> -->
        <label class="m-l10"><span class="left-ask">*</span>末次月经</label>
        <input class="middle-dat-ipt Wdate bigBlueFt" type="text" ms-duplex-string="patientMsg.mcyj" onclick="WdatePicker({maxDate:'%y/%M/%d',dateFmt:'yyyy/MM/dd'})"
        ms-attr-disabled="patientMsg.patientTyp != '3' && patientMsg.patientTyp != '4'" ms-blur="calcYz()">
        <!-- <span ms-visible="isEditPage == '1'" class="already-check-flg">已预检</span> -->
      </li>
      <div class="bg-div"></div>
      <li>
        <p class="part-title">
          <span class="floatLeft m-r5">分诊信息、体征及处理</span>
          <!-- <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('patientTyp', '1')" ms-class="active: patientMsg.patientTyp == 1">成人</a> -->
          <!-- <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('patientTyp', '2')" ms-class="active: patientMsg.patientTyp == 2">儿科</a> -->
          <!-- <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('patientTyp', '3')" ms-class="active:patientMsg.patientTyp == 3" >产科</a>
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('patientTyp', '4')" ms-class="active: patientMsg.patientTyp == 4">妇科</a>
          <input type="text" class="hidden" ms-duplex-string="patientMsg.patientTyp" id="patientType" /> -->

          <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active:patientMsg.grnChl==1" ms-class-2="level-btn3: patientMsg.grnChl==1"
            ms-click="judgeFlag('grnChl')">绿色通道</a>
          <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active:patientMsg.swChl==1" ms-click="judgeFlag('swChl')">三无人员</a>
					
          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('xtFlg')" ms-class="active: patientMsg.patTyp == 1 ">胸痛</a>

          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('czFlag')" ms-class="active: patientMsg.patTyp==2">卒中</a>

          <a class="check-btn right-gap-btn" href="javascript:;" ms-click="judgeFlag('cspgFlg')" ms-class="active: patientMsg.patTyp == 3">创伤</a>

          <label ms-repeat="getMsg.wzbzList">
            <a class="check-btn right-gap-btn" href="javascript:;" ms-class="active: el.checked" ms-click="_checkClicks('wzbz', $index)">{{el.info}}</a>
          </label>
        </p>
      </li>
      <li ms-visible="patientMsg.grnChl==1">
        <span class="left-ask"></span>
        <label class="title-wth">绿通原因</label>
        <span class="spanRelative total-input-wth">
          <input class="total-full-wth bigBlueFt" type="text" ms-duplex-string="patientMsg.grnChlRsn" autocomplete="off" 
            ms-keyup="cleanUlInputText('grnChlRsn')" ms-click="showUlInputMsg('grnChlRsn')"/>
          <ul class="userList topList greenList" ms-visible="grnChlRsnShowFlg">
            <li ms-repeat="getMsg.grnChlRsnList" ms-click="chooseLiText(el.info, 'grnChlRsn')">
              {{el.info}}
            </li>
          </ul>
        </span>
      </li>
      <li class="twoSeven-li">
        <div class="twoFive-part">
          <span class="left-ask"></span>
          <label class="title-wth">到院方式</label>
          <select class="full-input-wth" ms-duplex-string="patientMsg.arvChlCod">
            <option value=""></option>
            <option ms-repeat="getMsg.arvChlCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="twoFive-part">
          <span class="left-ask"></span>
          <label class="title-wth">陪送人员</label>
          <span class="relative full-input-wth">
            <input class="cursor-type param-input total-full-wth bigBlueFt" type="text" id="cmpPsnCodParam" ms-click="getUlChildList('cmpPsnCod')"
              autocomplete="off" maxlength="100" readonly>
            <div class="scroll-list-div cmpPsnCod-list-div">
              <div class="scroll-div">
                <ul>
                  <li ms-repeat="getMsg.cmpPsnCodList" onclick="cancelPop()">
                    <label ms-attr-for="search-labB{{$index}}" class="tab-lab" ms-change="changArrToStr('cmpPsnCod')">
                      <input type="checkbox" ms-attr-id="search-labB{{$index}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.cmpPsnCod" > &nbsp;&nbsp;{{el.info}}
                    </label>
                  </li>
                </ul>
              </div>
              <div class="scroll-bottom-div" onclick="cancelPop()" ms-visible="patientMsg.cmpPsnCod.indexOf('8') != -1">
                <div class="scroll-other-div">
                  其他：<input type="text" id="psryqtQt" maxlength="10" ms-duplex-string="patientMsg.psryqt">
                </div>
              </div>
            </div>
          </span>
        </div>
      </li>
      <!-- <li>
        <span class="left-ask">*</span>
        <label class="title-wth">主诉症状</label>
        <span class="search-wrap" id="searchWrapper">
          <input class="full-input-wth total-full-wth bigBlueFt relative" type="text" id="cbyxParams" onkeyup="pdkeycode(window.event)"
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
        </span>
        <span class="m-l5" id="knowledgeDiv">
          <a class="commonbtn knowledgeBoxBtn" href="javascript:;" ms-click="openKnowledge()">知识库</a>
          <span class="middleLabel m-l5" id="measure"></span>
          <input type="text" class="hidden" id="checkLevel" />
        </span>
      </li> -->
      <li>
        <div class="three-part" ms-visible="patientMsg.patientTyp == '3' || patientMsg.patientTyp == '4'">
          <span class="left-ask"></span>
          <label class="title-wth">自觉症状</label>
          <span class="relative full-input-wth">
            <input class="cursor-type param-input total-full-wth bigBlueFt" type="text" id="zjzzCodParam" ms-click="getUlChildList('zjzzCod')"
              autocomplete="off" maxlength="100" readonly>
            <div class="scroll-list-div zjzzCod-list-div">
              <div class="scroll-div">
                <ul>
                  <li onclick="cancelPop()">
                    <label for="search-labD" class="tab-lab" ms-change="changArrToStr('zjzzFlg')">
                      <input type="checkbox" id="search-labD" ms-attr-value="0" ms-duplex="patientMsg.zjzzFlg"> &nbsp;&nbsp;无
                    </label>
                  </li>
                  <li ms-repeat="getMsg.zjzzCodList" onclick="cancelPop()">
                    <label ms-attr-for="search-labC{{$index}}" class="tab-lab search-labC" ms-change="changArrToStr('zjzzCod')">
                      <input type="checkbox" ms-attr-id="search-labC{{$index}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.zjzzCod"> &nbsp;&nbsp;{{el.info}}
                    </label>
                  </li>
                </ul>
              </div>
              <div class="scroll-bottom-div" onclick="cancelPop()">
                <div class="scroll-other-div">
                  其他：<input type="text" id="zjzzQt" maxlength="10" ms-duplex-string="patientMsg.zjzzQt">
                </div>
              </div>
            </div>
          </span>
        </div>
        <div ms-class="seven-part: patientMsg.patientTyp == '3' || patientMsg.patientTyp == '4'">
          <span class="left-ask"><span ms-visible="(patientMsg.patientTyp == '3' || patientMsg.patientTyp == '4') && !hideMsg.ksfz">*</span></span>
          <label class="title-wth">危急征象</label>
          <span class="relative full-input-wth">
            <input class="cursor-type param-input total-full-wth bigBlueFt" type="text" id="jwgfxCodParam" ms-click="getUlChildList('jwgfxCod')"
              autocomplete="off" maxlength="100" readonly>
            <div class="scroll-list-div jwgfxCod-list-div">
              <div class="scroll-div">
                <ul>
                  <li ms-repeat="getMsg.dangerousCodList" onclick="cancelPop()">
                    <label ms-attr-for="search-lab{{$index}}" class="tab-lab danger-lab" ms-change="changArrToStr('jwgfxCod', $index)">
                      <input type="checkbox" ms-attr-id="search-lab{{$index}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.jwgfxCod"> &nbsp;&nbsp;{{el.info}}
                      <span class="hidden">分级：{{el.remark}}--code:{{el.infocode}}</span>
                    </label>
                  </li>
                </ul>
              </div>
            </div>
          </span>
        </div>
      </li>
      <li>
        <div class="two-part">
          <span class="left-ask">
            <!-- <span ms-visible="noMassRequire()">*</span> -->
          </span>
          <label class="w2" ms-class="redWarn:patientInfFlg.tmpNbrFlag==1">体温</label>
          <input id="emg_tmpNbr" type="text" class="small-input bigBlueFt" ms-duplex-string="aboutMews.tiw"
            ms-keyup="onlyNum('aboutMews','tiw',1,100)" ms-input="onlyNum('aboutMews','tiw',1,100)" ms-change="onlyNum('aboutMews','tiw',1,100)">
          <span class="gray-ft">℃</span>
        </div>
        <div class="two-part">
          <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="w2" ms-class="redWarn:patientInfFlg.breNbrFlag==1">呼吸</label>
          <input id="emg_breNbr" type="text" class="small-input bigBlueFt" maxlength="4" 
            ms-duplex-string="aboutMews.huxipl" ms-keyup="onlyNum('aboutMews','huxipl')" ms-input="onlyNum('aboutMews','huxipl')"
            ms-change="onlyNum('aboutMews','huxipl')">
          <span class="gray-ft">次/分</span>
        </div>
        <div class="two-part">
          <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="w2" ms-class="redWarn:patientInfFlg.hrtRteFlag==1">脉搏</label>
          <input id="emg_hrtRte" type="text" class="small-input bigBlueFt" maxlength="4" 
            ms-duplex-string="aboutMews.mb" ms-keyup="onlyNum('aboutMews','mb')" ms-input="onlyNum('aboutMews','mb')"
            ms-change="onlyNum('aboutMews','mb')">
          <span class="gray-ft">次/分</span>
        </div>
        <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="w2" ms-class="redWarn:patientInfFlg.sbpUpNbrFlag==1">血压</label>
          <input id="emg_sbpUpNbr" type="text" class="small-input bigBlueFt" maxlength="4" ms-duplex-string="aboutMews.sbpUpNbr" 
            ms-keyup="onlyNum('aboutMews','sbpUpNbr')" ms-change="onlyNum('aboutMews','sbpUpNbr')"
            ms-input="onlyNum('aboutMews','sbpUpNbr')">/
          <input id="emg_sbpDownNbr" type="text" class="small-input bigBlueFt" maxlength="4" ms-duplex-string="aboutMews.sbpDownNbr" 
            ms-keyup="onlyNum('aboutMews','sbpDownNbr')" ms-change="onlyNum('aboutMews','sbpDownNbr')"
            ms-input="onlyNum('aboutMews','sbpDownNbr')">
          <span class="gray-ft">mmHg</span>
          <!-- <a onclick="setEmgSeq()" class="cursor-type link-aText">[导入体征]</a> -->
        </div>
      </li>
      <li>
        <div class="two-part">
          <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="w2" ms-class="redWarn:patientInfFlg.oxyNbrFlag==1">血氧</label>
          <input id="emg_oxyNbr" type="text" class="small-input bigBlueFt" maxlength="4"
          ms-duplex-string="patientMsg.xueyang" ms-keyup="onlyNum('patientMsg','xueyang')" ms-input="onlyNum('patientMsg','xueyang')"
          ms-change="onlyNum('patientMsg','xueyang')">
          <span class="gray-ft">%</span>
        </div>
        <!-- <div class="two-part">
          <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span>
          <label class="title-wth">疼痛评分</label>
          <input type="text" class="small-input bigBlueFt xs-input" ms-duplex-string="patientMsg.nrsSco" maxlength="2" ms-keyup="onlyNum('patientMsg','nrsSco', 0, 10.9)" ms-input="onlyNum('patientMsg','nrsSco', 0, 10.9)"
          ms-change="onlyNum('patientMsg','nrsSco', 0, 10.9)">
          <span ms-click="NRSbox()" class="cursor-type">[选择评分]</span>
          <input class="hidden" id="emg_nrsSco" type="text" ms-duplex-string="patientMsg.nrsSco">
          <input class="hidden" id="emg_ttpfNr" type="text" ms-duplex-string="patientMsg.ttpfNr">
          <input class="hidden" id="emg_ttpfTypeCod" type="text" ms-duplex-string="patientMsg.ttpfTypeCod">
        </div>  -->
        <div class="two-part">
          <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="w2">意识</label>
          <select class="small-input" ms-duplex-string="patientMsg.senStuCod" ms-change="setSenStu()" >
            <option value=""></option>
            <option ms-repeat="getMsg.senStuCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="two-part">
          <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="title-wth">AVPU</label>
          <select class="small-input" ms-duplex-string="aboutMews.senRctCod" ms-change="setSctStu()" >
            <option value=""></option>
            <option ms-repeat="getMsg.senRctCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="two-part">
          <!-- <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span> -->
          <label class="title-wth">跌倒评估</label>
          <input type="text" class="small-input cursor-type bigBlueFt" ms-duplex-string="patientMsg.fallAssEssText" ms-click="riskBox()" readonly>
          <input type="text" id="emg_falAssCod" ms-duplex-string="patientMsg.fallAssCod" class="hidden">
        </div>
      </li> 
      <li ms-visible="patientMsg.fallAssCod !== '#' && patientMsg.fallAssCod !== '' && patientMsg.fallAssCod !== null">
        <span class="left-ask"></span>
        <label>防跌措施</label>
        <span class="relative full-input-wth">
          <input class="cursor-type param-input total-full-wth bigBlueFt" type="text" id="fdcsCodParam" ms-click="getUlChildList('fdcsCod')"
            autocomplete="off" maxlength="100" readonly>
          <div class="scroll-list-div fdcsCod-list-div">
            <div class="scroll-div">
              <ul>
                <li ms-repeat="getMsg.fdcsCodList" onclick="cancelPop()">
                  <label ms-attr-for="search-labF{{$index}}" class="tab-lab" ms-change="changArrToStr('fdcsCod')">
                    <input type="checkbox" ms-attr-id="search-labF{{$index}}" ms-duplex="patientMsg.fdcsCod" ms-attr-value="el.infocode"> &nbsp;&nbsp;{{el.info}}
                  </label>
                </li>
              </ul>
            </div>
        </span>
      </li>
      <li>
        <div class="two-part" ms-visible="(patientMsg.patientTyp === '3' || patientMsg.patientTyp === '4')">
          <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span>
          <label class="title-wth">阴道出血</label>
          <select class="mid-input" ms-duplex-string="patientMsg.pregnantYdcxCod" id="pregnantYdcxCod">
            <option value=""></option>
            <option ms-repeat="getMsg.pregnantYdcxCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="two-part" ms-visible="(patientMsg.patientTyp === '3')">
          <span class="left-ask"><span ms-visible="noMassRequire()">*</span></span>
          <label class="title-wth">宫缩频率</label>
          <select class="mid-input" ms-duplex-string="patientMsg.pregnantGsplCod" id="pregnantGsplCod">
            <option value=""></option>
            <option ms-repeat="getMsg.pregnantGsplCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
        </div>
        <div class="two-part max-two-part" ms-visible="(patientMsg.patientTyp == '1' || patientMsg.patientTyp == '2') && patientMsg.cstSexCod == '1'">
          <span class="left-ask"></span>
          <label class="title-wth">月经史</label>
          <select class="mid-input min-select-input" ms-duplex-string="patientMsg.mnsSitCod">
            <option value=""></option>
            <option ms-repeat="getMsg.mnsSitCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
          <i ms-visible="patientMsg.mnsSitCod== '1'">第 <input type="text" class="sm-box"
              ms-duplex-string="patientMsg.caseHis" ms-keyup="onlyNum('patientMsg','caseHis',1,100)" ms-input="onlyNum('patientMsg','caseHis',1,100)"
              ms-change="onlyNum('patientMsg','caseHis',1,100)"> 周</i>
        </div>
        <div class="two-part" ms-visible="patientMsg.patientTyp !== '2'">
          <span class="left-ask"></span>
          <label class="title-wth">MEWS</label>
          <input type="text" class="small-input cursor-type bigBlueFt" id="emg_mewsTotSco" ms-duplex-string="patientMsg.mewsTotSco" ms-click="MEWSbox()" readonly>
        </div>
        <div class="two-part" ms-visible="patientMsg.patientTyp !== '2'">
          <span class="left-ask"></span>
          <label class="title-wth">GCS</label>
          <input type="text" class="small-input cursor-type bigBlueFt" ms-duplex-string="patientMsg.gcsTotSco" ms-click="GCSbox()" readonly>
          <input class="hidden" type="text" id="emg_eyeRctCod" ms-duplex-string="patientMsg.eyeRctCod">
          <input class="hidden" type="text" id="emg_lanRctCod" ms-duplex-string="patientMsg.lanRctCod">
          <input class="hidden" type="text" id="emg_actRctCod" ms-duplex-string="patientMsg.actRctCod">
          <input class="hidden" type="text" id="emg_gcsTotSco" type="text" ms-duplex-string="patientMsg.gcsTotSco">
        </div>
        <!-- <div class="two-part" ms-visible="patientMsg.patientTyp !== '3' && patientMsg.patientTyp !== '4'">
          <span class="left-ask"></span>
          <label class="title-wth">CRAMS</label>
          <input type="text" class="small-input cursor-type bigBlueFt" ms-duplex-string="patientMsg.cramsTotSco" ms-click="CRAMSbox()" readonly>
          <input class="hidden" type="text" id="emg_sptLvlCod" ms-duplex-string="aboutCRAMS.sptLvlCod">
          <input class="hidden" type="text" id="emg_lanLvlCod" ms-duplex-string="aboutCRAMS.lanLvlCod">
          <input class="hidden" type="text" id="emg_cirLvlCod" ms-duplex-string="aboutCRAMS.cirLvlCod">
          <input class="hidden" type="text" id="emg_breLvlCod" ms-duplex-string="aboutCRAMS.breLvlCod">
          <input class="hidden" type="text" id="emg_bdyLvlCod" ms-duplex-string="aboutCRAMS.bdyLvlCod">
          <input class="hidden" type="text" id="emg_cramsTotSco" type="text" ms-duplex-string="patientMsg.cramsTotSco">
        </div> -->
        <div class="two-part" ms-visible="patientMsg.patientTyp === '2'">
          <span class="left-ask"></span>
          <label class="title-wth">CRT</label>
          <input type="text" class="small-input cursor-type bigBlueFt" ms-duplex-string="patientMsg.crt" ms-keyup="onlyNum('patientMsg','crt')" ms-input="onlyNum('patientMsg','crt')" 
          ms-change="onlyNum('patientMsg','crt')" maxlength="4">
          <span class="gray-ft">秒</span>
        </div>
        <div class="two-part" ms-visible="patientMsg.patientTyp === '2'">
          <span class="left-ask"></span>
          <label class="title-wth">PEWS</label>
          <input type="text" class="small-input cursor-type bigBlueFt" ms-duplex-string="aboutPEWS.pewsSco" ms-click="pewsBox()" readonly>
        </div>
      </li>
      <li ms-visible="patientMsg.xtFlg == 1 || patientMsg.czFlag == 1 || patientMsg.cspgFlg == 1">
        <div class="two-part" ms-visible="patientMsg.patTyp == 1" ms-class-1="auto-div-width: (isJumpToSdzx == '1' || isJumpToSdzx == '2')">
          <span class="left-ask"></span>
          <label class="title-wth w2">胸痛</label>
          <span ms-click="chestBox()" class="line-span cursor-type bigBlueFt">
						<input class="hidden" id="emg_xtCod" type="text" name="hspemginfCustom.xtCod" ms-duplex-string="patientMsg.xtCod">
            <input class="hidden" id="emg_xtSubCod" type="text" name="hspemginfCustom.xtSubCod" ms-duplex-string="patientMsg.xtSubCod">
            <span ms-visible="(patientMsg.xtFlg == 1) && (!patientMsg.xtCod && !patientMsg.xtSubCod)">待评估</span>
            <span ms-visible="patientMsg.xtCod || patientMsg.xtSubCod">是</span>
            &nbsp
          </span>
          <input class="hidden" id="emg_xtCod" type="text" ms-duplex-string="patientMsg.xtCod">
          <input class="hidden" id="emg_xtSubCod" type="text" ms-duplex-string="patientMsg.xtSubCod">
          <a class="check-btn xtlcflg" ms-click="setCurrentCk('xtlcflg')" ms-class-1="active: (patientMsg.xtlcflg == 1 && isJumpToSdzx == '2')" ms-visible="isJumpToSdzx == '1' || isJumpToSdzx == '2'">进入胸痛流程</a>
        </div>
        <div class="two-part" ms-visible="patientMsg.patTyp == 2" ms-class-1="auto-div-width: (isJumpToSdzx == '1' || isJumpToSdzx == '2')">
          <span class="left-ask"></span>
          <label class="title-wth">卒中</label>
          <span ms-click="czFaceBox()" class="line-span cursor-type bigBlueFt">
						<input class="hidden" type="text" id="emg_mtCod" name="hspFastInfCustom.mtCod" ms-duplex-string="patientMsg.mtCod">
            <input class="hidden" type="text" id="emg_szthCod" name="hspFastInfCustom.szthCod" ms-duplex-string="patientMsg.szthCod">
            <input class="hidden" type="text" id="emg_wlCod" name="hspFastInfCustom.wlCod" ms-duplex-string="patientMsg.wlCod">

            <span ms-visible="(patientMsg.czFlag == 1) && (!patientMsg.mtCod && !patientMsg.szthCod && !patientMsg.wlCod)">待评估</span>
            <span ms-visible="(patientMsg.mtCod || patientMsg.szthCod || patientMsg.wlCod) && (patientMsg.czFlag == 1)">是</span>
            &nbsp
          </span>
          <a class="check-btn czlcflg" ms-click="setCurrentCk('czlcflg')" ms-class-1="active: (patientMsg.czlcflg == 1 && isJumpToSdzx == '2')" ms-visible="isJumpToSdzx == '1' || isJumpToSdzx == '2'">进入卒中流程</a>
          <input type="text" class="hidden" ms-duplex-string="patientMsg.czlcflg" />
        </div>
        <div class="two-part" ms-visible="patientMsg.patTyp == 3" ms-class-1="leftPartGap: ((patientMsg.xtFlg == 1 && patientMsg.czFlag == 1) && (isJumpToSdzx == '1' || isJumpToSdzx == '2'))">
          <span class="left-ask"></span>
          <label class="title-wth">RTS</label>
          <span ms-click="RTSbox()" class="line-span cursor-type bigBlueFt"> {{patientMsg.rtsTotSco}}&nbsp</span>
          <input type="text" class="hidden" id="emg_rtsTotSco" ms-duplex-string="patientMsg.rtsTotSco" >
        </div>
        <div class="two-part" ms-visible="patientMsg.patTyp == 3" ms-class-1="auto-div-width: isJumpToSdzx == '1'">
          <span class="left-ask"></span>
          <label class="title-wth">创伤</label>
          <span ms-click="cspgBox()" class="line-span cursor-type bigBlueFt">
            <span ms-visible="(patientMsg.cspgFlg == 1) && (!patientMsg.cspgCod)">待评估</span>
            <span ms-visible="(patientMsg.cspgCod) && (patientMsg.cspgFlg == 1)">是</span>
            &nbsp
          </span>
          <input class="hidden" type="text" id="emg_cspgCod" ms-duplex-string="patientMsg.cspgCod">
          <a class="check-btn cslcflg" ms-click="setCurrentCk('cslcflg')" ms-class-1="active: patientMsg.cslcflg == 1" ms-visible="isJumpToSdzx == '1'">进入创伤流程</a>
        </div>
      </li>  
      <li class="twoSeven-li">
        <div class="two-part auto-div-width">
          <span class="left-ask"></span>
          <label class="title-wth">120送入</label>
          <select class="mid-input" ms-duplex-string="patientMsg.sendInCod" ms-change="cleanDriverInput()">
            <option value=""></option>
            <option ms-repeat="getMsg.sendInCodList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
          <a class="check-btn patIdflg" ms-click="openPreHosBox()" ms-class-1="active: patientMsg.patid" ms-visible="([0, '0', '1'].indexOf(patientMsg.sendInCod) != -1) && isJumpToYq == '1'">院前患者绑定</a>
        </div>
        <div class="two-part max-two-part" ms-visible="patientMsg.sendInCod === 0 || patientMsg.sendInCod === '0' || patientMsg.sendInCod == '1'">
          <span class="left-ask"></span>
          <span class="spanRelative">
            驾驶员
        	  <span class="spanRelative">
              <input type="text" class="small-input drive-name bigBlueFt" ms-duplex-string="patientMsg.abnDriver" id="driverName" 
              ms-keyup="cleanAbnSco()" autocomplete="off" maxlength="20">
              <ul class="userList topList" ms-visible="isShowAbnDriverList">
                <li ms-repeat="getMsg.abnDriverList" ms-click="chooseAbnDriver(el.info)">
                  {{el.info}}
                </li>
              </ul>
            </span>
            &nbsp;&nbsp;医生
            <span class="spanRelative">
              <input type="text" class="small-input drive-name bigBlueFt" id="doctorName" maxlength="10" ms-keyup="cleanAbnSco()"
              autocomplete="off" ms-duplex-string="patientMsg.abnDoctor">
              <ul class="userList topList" ms-visible="isShowAbnDoctorList">
                <li ms-repeat="getMsg.abnDoctorList" ms-click="chooseAbnDoctor(el.info)">
                  {{el.info}}
                </li>
              </ul>
            </span>
          </span>
        </div>
        <div class="f-left">
          <span class="left-ask"></span>
          <label class="title-wth">是否规范</label>
          <select class="auto-input-wth" ms-duplex-string="patientMsg.gfFlg" ms-change="isCleanText()">
            <option value=""></option>
            <option ms-repeat="getMsg.gfFlgList" ms-attr-value="el.infocode">{{el.info}}</option>
          </select>
          <label class="title-wth-bk" ms-visible="patientMsg.gfFlg === '0' || patientMsg.gfFlg === 0">原因</label>
          <input type="text" ms-duplex-string="patientMsg.gfbz" autocomplete="off" ms-keyup="setStandardCk()"
            class="auto-input-wth bigBlueFt" ms-visible="patientMsg.gfFlg === '0' || patientMsg.gfFlg === 0">
          <span class="left-ask"></span>
          <label class="title-wth">转入医院</label>
          <input type="text" ms-duplex-string="patientMsg.abnScoNme" autocomplete="off" class="auto-input-wth bigBlueFt"
          maxlength="30">
          
          <a ms-visible="isOpenJjyqFlg == 1 && isEditPage == '1' && ([0, '0', '1'].indexOf(patientMsg.sendInCod) != -1)" 
            class="cursor-type link-aText" onclick="toYqMsg()">[查看院前信息]</a>
          <a ms-visible="isOpenJjyqFlg == 1 && isEditPage == '1' && ([0, '0', '1'].indexOf(patientMsg.sendInCod) != -1)"
            class="cursor-type link-aText" onclick="toYqJjd()">[院前交接单]</a>
        </div>
      </li>
      <div class="bg-div"></div>     
    </ul>
    <div class="save-btn-div">
      <a onclick="postPatientMsg()" class="bottom-btn save-btn"  ms-class-1="gray-btn: !isCanSave">保存</a>
      <a onclick="postPatientMsg('','register')" class="bottom-btn save-btn" ms-attr-disabled="!isCanSave" ms-class-1="gray-btn: !isCanSave" ms-if="isEditPage == '0'" ms-visible="qfghFlag == 1">保存并挂号</a>
      <a onclick="printFz()" class="bottom-btn" ms-visible="isEditPage == '1'">打印</a>
      <a onclick="addNewPat()" class="bottom-btn">新建</a>
      <a onclick="tempStorage()" class="bottom-btn">暂存</a>
      <a onclick="deleteCurrentMsg()" class="bottom-btn" ms-class-1="gray-btn: isEditPage != '1'">删除</a>
      <!-- <a ms-click="openJzbd()" class="bottom-btn" ms-class-1="gray-btn: isEditPage != '1'">就诊关联</a> -->
      <a class="bottom-btn"  ms-if="isEditPage == '1'" ms-click="openGhbd()">挂号绑定</a>
      <a class="bottom-btn"  ms-if="patientMsg.ghid != ''" onclick="cancelGh()" ms-visible="tghFlag == 1">退挂号</a>
      <a onclick="outComeInfo()" class="bottom-btn" ms-class-1="gray-btn: isEditPage != '1'">转归登记</a>
      <!-- 若选中已预检患者，打开预检页面-》修改时 若dstappoption院前开关打开时， 则底部才显示“查看院前患者明细”、“院前交接单”按钮 -->
      <!-- <a class="bottom-btn" ms-visible="isOpenYqFlg == 1 && isEditPage == '1' && patientMsg.sendInCod == 1" onclick="toYqMsg()">查看院前信息</a>
      <a class="bottom-btn" ms-visible="isOpenYqFlg == 1 && isEditPage == '1' && patientMsg.sendInCod == 1" onclick="toYqJjd()">院前交接单</a> -->
      <!-- 留抢留观才显示 护理记录 -->
      <a onclick="toHandOverPage()" class="bottom-btn" ms-visible="saveCstDspCod == '6' || saveCstDspCod == '11'">护理记录</a>
      <span class="relative floatRight" onmouseover="setMenuDisplay('show')" onmouseout="setMenuDisplay('hide')">
        <ul class="btn-ul" ms-class-1="big-btn-ul: isEditPage == '1'">
          <li ms-click="bindGroupEvent()">群体事件</li>
          <li ms-click="openFrdj()">发热登记</li>
          <li ms-if="isEditPage == '1'" ms-click="openJzbd()">就诊关联</li>
          <li ms-if="isEditPage == '1'" ms-click="openVitalSign()">生命体征补录</li>
          <!-- 修改才显示 -->
          <!-- <li ms-if="isEditPage == '1' && (patientMsg.jzxh == '' || patientMsg.jzxhOld =='')" ms-click="openGhbd()">挂号绑定</li> -->
          <li onclick="zginfo()" ms-if="isEditPage == '1'">转归记录</li>
        </ul>
        <a class="bottom-btn btn-right">更多操作</a>
      </span>
    </div>
    <div class="right-bound-btn" ms-visible="isEditPage == '1'">
      <a onclick="toDocAdviceTab()">医嘱</a>
    </div>
    <div class="right-bound-btn top-gap2" ms-visible="isEditPage == '1'">
      <a onclick="toExamineTab()">检验</a>
    </div>
    <div class="right-bound-btn top-gap3" ms-visible="isEditPage == '1'">
      <a onclick="toCheckTab()">检查</a>
    </div>
    <div class="right-bound-btn top-gap4" ms-visible="isEditPage == '1'">
      <a onclick="openTimeline()">时间轴</a>
    </div>
    <div class="content-page hidden">
      <input type="text" class="hidden" id="qtsjSeq" ms-duplex-string="patientMsg.qtsjSeq">
      <div class="page-btn">
        <input class="hidden" type="text" id="qtsjFlg" ms-attr-value="patientMsg.qtsjFlg">
        <input type="text" id="massStartTime" class="hidden" />
        <input type="text" id="massEndTime" class="hidden" />
        <span id="massTitle"></span>
        <span id="massText"></span>
      </div>
      <div class="half-div">
        <div class="total-item m-t5">
          <div class="score-panel m-l10" ms-click="REMSbox()" ms-visible="patientMsg.patientTyp !== '2'">
            <p class="score num-score">{{patientMsg.remsTotSco}}</p>
            <p>REMS</p>
            <input class="hidden" id="emg_remsTotSco" type="text" ms-duplex-string="patientMsg.remsTotSco">
            <input class="hidden" id="emg_remsDeath" type="text" ms-duplex-string="patientMsg.remsDeath">
          </div>
        </div>
      </div>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyynurse/precheck/printFz.jsp"></jsp:include>
	<!-- 左边列表 -->
  <script src="${baseurl}js/subpageJs/precheck/leftTab.js?v=${versionDay}" type="text/javascript"></script>
  <!-- 分级相关公用方法、公用参数 -->
  <script src="${baseurl}js/subpageJs/precheck/commonFun.js?v=${versionDay}" type="text/javascript"></script>
  <!-- vm对象和方法 -->
  <script src="${baseurl}js/subpageJs/precheck/commonPrecheck.js?v=${versionDay}" type="text/javascript"></script>
  <!-- 预检值内容对比处理 -->
  <script src="${baseurl}js/subpageJs/precheck/fieldChange.js?v=${versionDay}" type="text/javascript"></script>
  <!-- 预检值处理 -->
  <script src="${baseurl}js/subpageJs/precheck/precheck.js?v=${versionDay}" type="text/javascript"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/directionKeycode.js"></script>
  <script type="text/javascript">
    var cmdprint = true; // 为了时间轴的显示
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        if ($(".param-input").is(":focus")) {
          flg = false;
        }
        if ($("#username").is(":focus")) {
          searchUserName(evt);
          flg = false;
        }
        if ($('#nameXm').is(':focus')) {
          getLeftData();
          flg = false;
        }
        if ($(".drive-name").is(":focus")) {
          flg = false;
        }
        return flg;
      })
    };

    function searchUserName(event) {
      if (event.keyCode == 13) {
        publicFun.SearchList("username", "userNameList")
      }
    }

		// register 保存并挂号时需传入的参数
    function postPatientMsg(print,register) {
			if(vm.patientMsg.xtFlg==='0'&& vm.patientMsg.czFlag ==='0' &&vm.patientMsg.cspgFlg==='0'){
				publicFun.alert('胸痛、卒中、创伤必选')
				return
			}
      console.log('保存');
			// if (!vm.isCanSave) {
      //   return;
      // }
      // vm.isCanSave = false;
      postCurrentMsg(print,register);
    }
    
    function beforeSaveDealData () {
      setScrollListHide(); // 为了防止其他输入框的值bug
      var emgBedInfo = $('#bedId').val();
      if (vm.patientMsg.cstDspCod == 11) { // 留观
        vm.patientMsg.bedLgs = emgBedInfo
        vm.patientMsg.emgBed = ''
      } else if (vm.patientMsg.cstDspCod == 6) { // 留抢
        vm.patientMsg.bedLgs = ''
        vm.patientMsg.emgBed = emgBedInfo
      } else {
        vm.patientMsg.bedLgs = ''
        vm.patientMsg.emgBed = ''
      }
    }

    // 保存公用的方法 
    function postCurrentMsg(print,register) {
      beforeSaveDealData()
      var allPostMsg = jsbrFun.getAllPostMsg();
      if (vm.isEditPage == '1' && vm.patientMsg.qtsjFlg === '1' || vm.patientMsg.qtsjFlg === 1) { // 修改群体事件 -- alert
        if (jsbrFun.checkNull(jsbrAlertMsg.mass, allPostMsg) === false) {
          return
        }
        if (vm.patientMsg.patientTyp === '' || vm.patientMsg.patientTyp == null) {
          vm.patientMsg.patientTyp = '1' // 群体事件没有 患者类型时 默认成人
        }
      } else {
        if (vm.patientMsg.patientTyp === '' || vm.patientMsg.patientTyp == null) {
          publicFun.alert('患者类型必填！')
          vm.isCanSave = true;
          return;
        }
        if (vm.hideMsg.ksfz || vm.hideMsg.yjbzCod.indexOf('2') != -1 || vm.hideMsg.yjbzCod.indexOf('3') != -1 || vm.patientMsg.patientTyp == '2') {
          if (jsbrFun.checkNull(jsbrAlertMsg.ksfz, allPostMsg) === false) {
            return
          }
        } else if (vm.patientMsg.patientTyp == '1') {
          if (jsbrFun.checkNull(jsbrAlertMsg.normalFz, allPostMsg) === false) {
            return
          }
        } else if (vm.patientMsg.patientTyp == '3') {
          if (jsbrFun.checkNull(jsbrAlertMsg.normalFz3, allPostMsg) === false) {
            return
          }
        } else if (vm.patientMsg.patientTyp == '4') {
          if (jsbrFun.checkNull(jsbrAlertMsg.normalFz4, allPostMsg) === false) {
            return
          }
        }
      }
      if (vm.patientMsg.modLvlCod === '' || vm.patientMsg.modLvlCod == null) {
        var _chkLvlCod = vm.patientMsg.chkLvlCod;
        vm.patientMsg.modLvlCod = _chkLvlCod;
        vm.patientMsg.emgAreCod = commonFun.countEmgAreCod(_chkLvlCod);
        vm.patientMsg.emgDepCod = _chkLvlCod;
        for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
          vm.getMsg['modLvlCodList'][i].checked = false;
          if (vm.patientMsg.chkLvlCod == vm.getMsg['modLvlCodList'][i]['infocode']) {
            vm.getMsg['modLvlCodList'][i].checked = true;
          }
        }
      } else {
        // 目前先隐藏 兰姐说等有客户提出后再说
        // if (vm.patientMsg.modLvlCod > vm.patientMsg.chkLvlCod) {
        //   vm.patientMsg.modLvlCod = '';
        //   for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
        //     vm.getMsg['modLvlCodList'][i].checked = false;
        //   }
        //   publicFun.alert('修订分级需大于或者等于自动分级')
        //   vm.isCanSave = true;
        //   return false;
        // }
      }
      if (vm.patientMsg.regTim == '') {
        vm.patientMsg.regTim = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
      }
      // 预检的保存时候做个判断 预检校验，判断当前患者（就诊卡号+姓名）24小时内是否有当前选择科室的预检数据
      var postMsg = JSON.parse(JSON.stringify(vm.patientMsg));
      vm.patientMsg.hzyjzt = '';
      if (vm.isEditPage != '1') {
        _confirm('是否需要打印分诊单', function () {
          addPostMsgIsNeedPrint(postMsg,'',register)
        }, function () {
          addPostMsgIsNeedPrint(postMsg, 'p',register)
        })
      } else {
        var _confirmMsg = '';
        if (vm.patientMsg.ghid === '' || vm.patientMsg.ghid == null) {
          _confirmMsg = '<font color="red">病人未绑定挂号信息，</font>确定提交吗？';
        } else if (vm.patientMsg.registerTimeStr !== '' && vm.patientMsg.registerTimeStr != null) {
          // 如果挂号时间有值，并且预检时间晚于挂号时间则提示，预检时间晚于￼挂号时间
          if (new Date(vm.patientMsg.registerTimeStr).getTime() < new Date(vm.patientMsg.regTim).getTime()) {
            _confirmMsg = '<font color="red">病人预检时间晚于挂号时间'+vm.patientMsg.registerTimeStr+'，</font>确定提交吗？';
          } else {
            _confirmMsg = '';
          }
        } else {
          _confirmMsg = '';
        }
        if (_confirmMsg) {
          _confirm(_confirmMsg, function () {
            vm.isCanSave = true; // 重置保存
          }, function () {
            postFinallyMsg(print,register);
          })
        } else {
          postFinallyMsg(print,register);
        }
      }
    }
    // 新增页面保存 是否要保存并打印
    function addPostMsgIsNeedPrint (postMsg, print,register) {
			postFinallyMsg(print,register);
      // publicFun.httpServer({url: _baseUrl + 'hzszyyemg/emgCheck.do'}, {
      //   'hspemginfCustom.regTim': postMsg.regTim,
      //   'hspemginfCustom.vstCad': postMsg.vstCad,
      //   'hspemginfCustom.cstNam': postMsg.cstNam,
      //   'hspemginfCustom.emgFkCod': postMsg.emgFkCod,
      //   'hspemginfCustom.emgFkName':postMsg.emgFkName,
      //   'hspemginfCustom.cstDspCod': postMsg.cstDspCod
      // }, function (data) {
      //   var _res = data.resultInfo;
      //   if (_res.type == 2) {
      //     _confirm(_res.message, function () {
      //       vm.isCanSave = true; // 重置保存
      //     }, function () {
      //       postFinallyMsg(print,register);
      //     })
      //   } else {
      //     postFinallyMsg(print,register);
      //   }
      // })
    }

    function postFinallyMsg (print,register) {
      var postParam = JSON.parse(JSON.stringify(vm.patientMsg));
      // var rtsSaveObj = saveRtsMsg();
      // for(var i = 0; i < rtsSaveObj.length; i++){
      //   rtsSaveObj[i].saveType = '0'
      // }
      // postParam.hspPfglInfCustomList = JSON.stringify(rtsSaveObj)
      for (var key in postParam) {
        if (vm.hideMsg.hasOwnProperty(key)) {
          postParam[key] = vm.hideMsg[key]
        }
      }
      for (var key in vm.aboutMews) {
        postParam[key] = vm.aboutMews[key]
      }
      postParam.emgSeq = _emgSeq
      postParam.modUsrNbr = '${sessionScope.activeUser.usrno}';
      postParam.modUsrNam = '${sessionScope.activeUser.usrname}';
			postParam.regTim = new Date(postParam.regTim).getTime();
			postParam.bthDat = new Date(postParam.bthDat).getTime();
			if(!postParam.sbpDownNbr && ! postParam.sbpUpNbr){
				postParam.xuey=''
			}else{
				postParam.xuey = postParam.sbpUpNbr + '/' +  postParam.sbpDownNbr
			}
      compareSufFieldInfo = JSON.parse(JSON.stringify(dealCompareMsg(compareSufFieldInfo)))
      if (vm.isEditPage == '1') { // 修改界面
        var compareMsgList = [];
        var totalCompareList = generateFieldInfo();
        for (var key in compareSufFieldInfo) {
          if (compareSufFieldInfo[key] !== comparePreFieldInfo[key]) {
            totalCompareList.forEach(function (val) {
              val.changeContent.forEach(function (sub) {
                if (sub.field === key) {
                  compareMsgList.push({
                    vstCad: postParam.vstCad,
                    emgSeq: _emgSeq,
                    bdxm: sub.info,
                    bdyxx: comparePreFieldInfo[key],
                    bdxxx: compareSufFieldInfo[key],
                    bdmk: '预检信息',
                    bdsm: val.explainInfo,
                    cstNam: postParam.cstNam
                  })
                }
              })
            })
          }
        }
        // console.log(compareMsgList, 'compareMsgList')
      }
      publicFun.httpServer({url: _baseUrl + 'jzbr/adddbzlbassubmit_sdzx.do', requestDataType: 'json'}, {
        'hspDbzlBasCustom': postParam,
        // 'hspNrsInfCustom': {
        //   nrsSco: postParam.nrsSco,
        //   ttpfNr: postParam.ttpfNr,
        //   ttpfTypeCod: postParam.ttpfTypeCod
        // },
        // 'hspFallAssInfCustom': {
        //   'fallAssCod': postParam.fallAssCod
        // },
        // 'hspPewsckInfCustom': vm.aboutPEWS,
        // 'hspFastInfCustom': {
        //   czFlag: postParam.czFlag,
        //   mtCod: postParam.mtCod,
        //   szthCod: postParam.szthCod,
        //   wlCod: postParam.wlCod
        // },
        // 'hspsqlinfCustom': { sqlSeq: postParam.sqlSeq }
      }, function (res) {
        comparePreFieldInfo = JSON.parse(JSON.stringify(compareSufFieldInfo )); // 保存成功留在当前页面时 对象替换
        compareSufFieldInfo = generateFieldObj() // 初始化对比对象
        insertuser_callback(res, print,register)
        reloadLeftTab(); // 预检页面保存后，左边患者列表需要默认刷新一下
        if (vm.isEditPage == '1') {
          publicFun.httpServer({url: _baseUrl + 'hzszyyemg/inforModify.do', requestDataType: 'json'}, {
          'execList': compareMsgList
          }, function () {})
        }
      })
    }
    
    function insertuser_callback(data, print,register) {
      if (data.resultInfo && data.resultInfo.messageCode == '109') {
        message_alert(data, function () {
          window.location.href = "${baseurl}first.do";
        });
      } else {
        if (!print) { // 不是打印时 弹出弹窗
          message_alert(data);
        }
        if (data.resultInfo.type == '1') {
          if (print == "p") {
            printFz()
          }
					// 绿通对接
					if(vm.patientMsg.grnChl=='1' && vm.ltklFlag=='1'){
						greenDocking()
					}
					// 如果register不为空 则表示需要进行挂号
					if(register){
						registerGh()
					}
					
          _emgSeq = data.resultInfo.sysdata.emgSeq;
          $('#emg_emgSeq').val(_emgSeq);
          // editFun.getPatientMsg();
          setTimeout(function () {
            $('.messager-body').window('close')
            if (!'${emgSeq}' || vm.isEditPage != '1') { // 修改预检页面保存完了不调用新增
              addNewPat(); 
            } else {
              vm.isEditPage = '1'; // 修改状态
              typeForm = 'edit';
            }
            vm.isCanSave = true;
          }, 1000);
          // setTimeout("parent.closemodalwindow()", 1000);
          // setTimeout("refreshjz()", 1000)
        } else {
          vm.isCanSave = true;
        }
      }
    }

    // 暂存功能 页面判断必填项同“快速分诊”一致。 入库暂存标志=1，走新增患者交易
    function tempStorage () {
      vm.patientMsg.hzyjzt = '1';
      beforeSaveDealData()
      var allPostMsg = jsbrFun.getAllPostMsg();
      if (vm.patientMsg.patientTyp === '' || vm.patientMsg.patientTyp == null) {
        publicFun.alert('患者类型必填！')
        vm.isCanSave = true;
        return;
      }
      if (jsbrFun.checkNull(jsbrAlertMsg.ksfz, allPostMsg) === false) {
        return
      }
      if (vm.patientMsg.modLvlCod === '' || vm.patientMsg.modLvlCod == null) {
        var _chkLvlCod = vm.patientMsg.chkLvlCod;
        vm.patientMsg.modLvlCod = _chkLvlCod;
        vm.patientMsg.emgAreCod = commonFun.countEmgAreCod(_chkLvlCod);
        vm.patientMsg.emgDepCod = _chkLvlCod;
        for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
          vm.getMsg['modLvlCodList'][i].checked = false;
          if (vm.patientMsg.chkLvlCod == vm.getMsg['modLvlCodList'][i]['infocode']) {
            vm.getMsg['modLvlCodList'][i].checked = true;
          }
        }
      }
      var postMsg = JSON.parse(JSON.stringify(vm.patientMsg));
      addPostMsgIsNeedPrint(postMsg)
    }

    // 刷新 - 每次加载的时候 reload left tab
    function reload () {
      reloadLeftTab()
      getLeftData();
    }

    function refreshjz() {
      var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
      var currTab = parent.$("#tabs").tabs("getTab", menuName);
      // console.log('currTab',currTab)
      parent.$("#tabs").tabs("update", {
        tab: currTab,
        options: {
          content: parent.createFrame("${baseurl}hzszyyemg/queryjsbrjz.do", 0)
        }
      })
    }
    
    function setScrollListHide () {
      autoDoFun();
      $('.scroll-list-div').hide();
      $('.param-input').css({ 'box-shadow': 'none' })
      var flgList = ['isShowAbnScoList', 'isShowDocList', 'isShowAbnDriverList', 'isShowAbnDoctorList', 'grnChlRsnShowFlg'];
      for (var i = 0; i < flgList.length; i++) {
        vm[flgList[i]] = false;
      }
      $(".userList").hide();
    }

    $('.content-form').click(function (event) {
      setScrollListHide()
    });
    $('#driverName').click(function (e) {
      cancelPop();
      vm.isShowAbnDriverList = true;
    });
    $('#doctorName').click(function (e) {
      cancelPop();
      vm.isShowAbnDoctorList = true;
    });

    function autoDoFun () {
      vm.setOtherText('zjzzCod', 'zjzzQt')
      vm.setOtherText('yjbzCod', 'remarkQt')
      vm.setOtherText('cmpPsnCod', 'psryqtQt')
      vm.grnChlRsnShowFlg = false;
    }

    // 转归登记
    function outComeInfo() {
      if (vm.isEditPage != '1') {
        return;
      }
      var openModalWindowName = vm.patientMsg.cstNam + '-转归登记',
        openModalWindowUrl = '${baseurl}zyyqjs/querylqxxdjzyy.do?emgSeq=' + _emgSeq;
      createmodalwindow(openModalWindowName, 950, 500, openModalWindowUrl);
    }

    var patientDetail;
    function toYqMsg() {
      if (vm.isEditPage != '1') {
        return;
      }
      publicFun.httpServer({ url: '${baseurl}yqjjMk/findBrxxBytaskNo.do'}, {
        emgSeq: _emgSeq
      }, function(res) {
        var _data = res.resultInfo.sysdata.yqjjBrxxCustom
        if (_data) {
          _data.birth = publicFun.timeFormat(_data.birth, "yyyy-MM-dd")
          patientDetail = _data;
          var checkedObj = vm.patientMsg;
          createmodalwindow(checkedObj.cstNam + '-患者详情', 850, 360, '${baseurl}yqjjMk/toYqhzxx.do?emgSeq=' + _emgSeq);
        }else {
          publicFun.alert('未查到患者院前信息！');
        }
      })
    }

    // 院前交接单
    function toYqJjd() {
      if (vm.isEditPage != '1') {
        return;
      }
      var checkedObj = vm.patientMsg;
      var openTabUrl = '${baseurl}zyyqjs/toYqjjd.do?taskNo=' + _taskNo + '&emgSeq=' + _emgSeq;
      var openTabName = checkedObj.cstNam + '-院前交接单';
      parent.opentabwindow(openTabName, openTabUrl, '0');
    }

    // 交接单
    function toHandOverPage () {
      if (vm.isEditPage != '1') {
        return;
      }
      var checkedObj = vm.patientMsg;
      // handOver
      var openTabUrl = '${baseurl}zyyxtpg/toLeftWrap.do?emgSeq=' + _emgSeq + '&cstNam=' + checkedObj.cstNam + '&zgcount=' + checkedObj.zgcount + '&pageSrc=queryQjs&pageFlg=' + '&th=' + new Date().getTime();
      var openTabName = checkedObj.cstNam + '-护理记录';
      parent.opentabwindow(openTabName, openTabUrl, '0');
    }
    
    // 点击 更多操作 - 显示list
    function setMenuDisplay (disType) {
      if (disType === 'show') {
        $('.btn-right').removeClass('hover');
        $('.btn-ul').show();
      } else {
        $('.btn-ul').hide();
      }
    }

     // 转归记录
    function zginfo() {
      if (vm.isEditPage != '1') {
        return;
      }
      createmodalwindow($('#emg_cstNam').val() + "—转归记录", 870, 500, '${baseurl}hzszyyemg/queryzginfo.do', 'no');
    }

    function toDocAdviceTab () {
      var openTabName = vm.patientMsg.cstNam + '-医嘱信息',
        openTabUrl = '${baseurl}zyyqjs/qjsyzxx.do?emgSeq=' + _emgSeq + '&th=' + new Date().getTime();
      parent.opentabwindow(openTabName, openTabUrl);
    }

    function toCheckTab () {
      var openTabName = vm.patientMsg.cstNam + '-检查报告',
        openTabUrl = '${baseurl}zyyqjs/qjsjcbg.do?emgSeq=' + _emgSeq + '&th=' + new Date().getTime();
      parent.opentabwindow(openTabName, openTabUrl);
    }

    function toExamineTab () {
      var openTabName = vm.patientMsg.cstNam + '-检验信息',
        openTabUrl = '${baseurl}zyyqjs/toqjscaseexaminenew.do?emgSeq=' + _emgSeq + '&th=' + new Date().getTime();
      parent.opentabwindow(openTabName, openTabUrl);
    }

    var cmdprint = true; // 为了时间轴显示
    function openTimeline () {
      var openModalWindowUrl = '${baseurl}hzszyyemg/timershaft.do?emgSeq=' + _emgSeq;
      createmodalwindow(vm.patientMsg.cstNam + "-" + '时间轴', 800, 340, openModalWindowUrl);
    }

    // 删除
    function deleteCurrentMsg () {
      if (vm.isEditPage != '1') {
        return;
      }
      _confirm('确定删除该数据吗？', null, function () {
        publicFun.httpServer({ url: '${baseurl}hzszyyemg/delzyyemgSubmit.do' }, { 'emgSeq': _emgSeq }, function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          } else {
            message_alert(data);
            setTimeout(function () {
              addNewPat()
            }, 1000);
          }
        })
      });
    }
  
    // 新增
    function addNewPat () {
      cancelPop(); // 防止新增点击按钮 进而走进autoDoFun 导致分级有值
      // 以下新增 - msg
      getAjaxInfoList() // 床位列表刷新
      cleanAndSetMsg()
      reloadLeftTab()
      vm.patientMsg.regTim = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
      vm.patientMsg.patientTyp = '1';
      vm.patientMsg.chkLvlCod = '';
      vm.isEditPage = "0"
      typeForm = "precheck"
      // setRightPanelWth(); // 右边尺寸调整
      patientBf = JSON.parse(JSON.stringify(vm.patientMsg))
      aboutMewsBf = JSON.parse(JSON.stringify(vm.aboutMews))
      // $('#registeredList').datagrid('clearSelections');

      // refreshjz()
    }

		function cleanAndSetMsg() {
  // 先清空页面上的数据再进行赋值
  for (var k in vm.patientMsg) {
    if (typeof vm.patientMsg[k] == "object") {
      vm.patientMsg[k] = []
    } else {
      vm.patientMsg[k] = ""
    }
  }
  for (var k in vm.hideMsg) {
    vm.hideMsg[k] = ""
  }
  for (var k in vm.aboutMews) {
    vm.aboutMews[k] = ""
  }
  for (var k in vm.aboutPEWS) {
    vm.aboutPEWS[k] = ""
  }
  _emgSeq = '';
  $('#emg_emgSeq').val('');
  for (var i = 0; i < vm.getMsg.modLvlCodList.length; i++) {
    vm.getMsg.modLvlCodList[i].checked = false
  }
  for (var i = 0; i < vm.getMsg.wzbzList.length; i++) {
    vm.getMsg.wzbzList[i].checked = false
  }
  $('.tab-lab input[type="checkbox"]').attr("checked", false)
  var _idList = ["zjzzQt", "ksfzParam", "cmpPsnCodParam", "zjzzCodParam", 'yjbzCodParam', 'fdcsCodParam','remarkQt']
  for (var i = 0; i < _idList.length; i++) {
    $("#" + _idList[i]).val("")
  }
  vm.patientMsg.zjzzQt = ""
  var _zeroList = ["grnChl", "swChl", "cstAgeCod", "czFlag", "qtsjFlg", "glsCod", "ttpfTypeCod", "xtlcflg", "czlcflg"]
  for (var i = 0; i < _zeroList.length; i++) {
    vm.patientMsg[_zeroList[i]] = "0"
  }
  vm.saveCstDspCod = '';
  vm.patientMsg.cstDspCod = "";
  vm.patientMsg.isGetAjaxFlg = false;
  vm.isCanSave = true;
  $('.scroll-list-div').hide();
  $('.param-input').css({ 'box-shadow': 'none' })
  var flgList = ['isShowAbnScoList', 'isShowDocList', 'isShowAbnDriverList', 'isShowAbnDoctorList', 'grnChlRsnShowFlg'];
  for (var i = 0; i < flgList.length; i++) {
    vm[flgList[i]] = false;
  }
  $(".userList").hide();
}

		// 建档
		function postJdInfo(){
			if(vm.patientMsg.cstNam===''){
				publicFun.alert("姓名不能为空")
				return
			}
			if(vm.patientMsg.cstSexCod===''){
				publicFun.alert("性别不能为空")
				return
			}
			if(vm.patientMsg.idNbr === '' && vm.patientMsg.vstCad === ''){
				publicFun.alert("身份证或就诊卡不能为空")
				return
			}
			var requesUrl = _baseUrl + 'his/brxxjd.do'
      var requestData = {}
      var jdInfoArr = ['vstCad','cstSexCod','idNbr','cstNam','bthDat','cstAge','pheNbr','cstAdr']
      for(var i = 0;i<jdInfoArr.length;i++){
        if(jdInfoArr[i] === 'bthDat'){
          requestData['bthDat'] = publicFun.timeFormat(vm.patientMsg.bthDat,'yyyy-MM-dd')
        }else{
          requestData[jdInfoArr[i]] = vm.patientMsg[jdInfoArr[i]]
        }
      }
      // querytype 卡类型 先写死为1 类型为身份证
      requestData.querytype = '1'
      if(requestData.querytype == '1'&& vm.patientMsg.idNbr==''){
        publicFun.alert('身份证号不能为空')
        return
      }
      if(requestData.querytype == '0'|| requestData.querytype == '2'||requestData.querytype == '3'){
        if(vm.patientMsg.vstCad==''){
          publicFun.alert('就诊号不能为空')
        return
        }
      }
			_confirm('确认对该患者进行建档操作吗', null, function () {							
					publicFun.httpServer({
							url: requesUrl,
							requestDataType: 'json'
						}, 
						{hspemginfCustom:requestData}
						, function (data) {
							message_alert(data);
							if (data.resultInfo.type == '1') {		
								var res = data.resultInfo.sysdata.vHemsEmpi
								var vHeArr = ['zyh','xb','sfzh','xm','csny','nl','lxdh','jtzz']
								for(var i=0;i<jdInfoArr.length;i++){
									for(var j=0;j<vHeArr.length;j++){
										if(i===j){
											if(jdInfoArr[i]==='bthDat'){
												vm.patientMsg['bthDat'] = publicFun.timeFormat(res['csny'],'yyyy/MM/dd')
											}else{
												vm.patientMsg[jdInfoArr[i]] = res[vHeArr[j]]
											}
										}
									}
								}
								setJdBtn()
							}
						})
        });
						
		}

		// 挂号
		function registerGh() {
				var requesUrl = _baseUrl+'his/brxxgh.do'
				publicFun.httpServer({
					url: requesUrl,
					requestDataType: 'json'
				}, 	{hspemginfCustom:{
					querytype:'1' 
				}},function(data){
					// 挂号失败展示错误信息 成功不显示
					if(data.resultInfo.type == '0'){
						message_alert(data)
					}
				})
		}

		// 退号
		function cancelGh (){
			_confirm('确认对该患者做退挂号操作吗', null, function () {
					var requesUrl = _baseUrl+'his/brxxtgh.do'
					publicFun.httpServer({
						url: requesUrl,
						requestDataType: 'json'
					}, 	{hspemginfCustom:{
						querytype:'0'
					}},function(data){
							message_alert(data)		
					})
      });		
		}

		// 禁用建档按钮
		function setJdBtn(){
			$('#jdBtn').css("opacity", "0.4"); //设置成灰色不可点击
			$('#jdBtn').css("pointer-events","none"); //设置鼠标事件不可用
		}
    
    // 设置院前btn
    function setYqBtn () {
      if (_isOpenYqFlg == '1') {
        $('.preExamineLab').show()
      }
    }

		// 绿通对接
		function greenDocking(){
			var requesUrl = _baseUrl+'his/brxxlvtong.do?'
				publicFun.httpServer({
					url: requesUrl,
					requestDataType: 'json'
				}, 	{hspemginfCustom:{
					querytype:"1"
				}},function(data){
					// 如果绿通对接失败展示错误信息 成功不显示
					if(data.resultInfo.type == '0'){
						message_alert(data)
					}
				})
		}

    function hasRouteToShowBottomBtn () {
      // 1、只有护士、护士长、admin、护士操作组长才能有底部操作按钮，其他权限隐藏按钮 [这个接口中护士、护士长、护士操作组长都是返回nurse(咨询人：顾浩浩)]
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do', isNoLoad: true, isAsync: false }, { "cratNbr": "" }, function (data) {
        var rtnRole = data.resultInfo.message;
        if (rtnRole == "nurse" || rtnRole == "admin") {
          $('.save-btn-div').css({'display': 'block'})
        }
      })
    }

		// $(function () {
		// 	setJdBtn()
    //   setYqBtn()
    //   hasRouteToShowBottomBtn()
    //   if (_taskNo) {
    //     fillPreHosMsg(_taskNo)
    //   }
		// })
  </script>
</body>

</html>