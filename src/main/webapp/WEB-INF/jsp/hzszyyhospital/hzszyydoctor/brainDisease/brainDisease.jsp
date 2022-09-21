<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>脑梗溶栓病程记录内容</title>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/doctorendnote.css?v=${versionDay}">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
    	_cratNbr = '${_cratNbr}';
      _emgSeq = '${hspemginfCustom.emgSeq}',
      _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}';
</script>
<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="brainDisease doctornote" ms-controller="brainDisease">
    <div class="mainbody">
        <p class="subheadtitle">脑梗溶栓病程记录</p>
        <form id="brainDiseaseForm" action="${baseurl}cerebralation/submitCerebralCourse.do" method="post">
        	<input type="hidden" name="formToken" value="${formToken}" />  
            <input id="cerebralCourseSeq" type="text" name="hspCerebralCourseCustom.cerebralCourseSeq" class="hidden" value="${hspCerebralCourseCustom.cerebralCourseSeq}">
            <input type="text" name="hspCerebralCourseCustom.emgSeqDc" class="hidden" value="${hspemginfCustom.emgSeq}">
            <div class="divwrapper">
                <div class="basicDiv">
                  <label class="bascilab">姓名：<input class="basicInput" type="text" value="${hspemginfCustom.cstNam}" readonly unselectable='on'></label>
                  <label class="bascilab">性别：<input class="basicInput" type="text" value="${hspemginfCustom.cstSexCod}" readonly unselectable='on'></label>
                  <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" id="ageInput" readonly unselectable='on'></label>
                  <label class="bascilab">科别：<input class="basicInput longbasicInput" type="text" value="急诊科门诊" readonly unselectable='on'></label>
                  <label class="bascilab">病历号：<input class="basicInput" type="text" value="${hspemginfCustom.mpi}" readonly unselectable='on'></label>
                  <label class="bascilab">留观号：<input class="basicInput" type="text" value="${hspemginfCustom.observationCode}" name="hspemginfCustom.observationCode" readonly unselectable='on'></label>
                </div>
                <ul class="ulwrapper">
                	<li class="minli">
                    <span class="brainTitle">体重：</span>
                    <input class="meddleInput" type="text" name="hspCerebralCourseCustom.weight" ms-duplex-string="msgInfo.weight"  ms-keyup="onlyNum('weight','2',999.99)" ms-change="onlyNum('weight','2',999.99)" ms-input="onlyNum('weight','2',999.99)"> Kg
                  </li>
                  <li class="threeli">
                    <span class="brainTitle">溶栓时间：</span>
                    <input class="Wdate spcWdate" type="text" name="hspCerebralCourseCustom.cerebralDate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" ms-duplex-string="msgInfo.cerebralDate" >
                  </li>
                  <li class="middleli">
                    <span class="brainTitle">爱通立剂量：</span>
                    <input class="meddleInput" type="text" maxlength="5" name="hspCerebralCourseCustom.erectDose" ms-keyup="onlyNum('erectDose',2)" ms-input="onlyNum('erectDose',2)" ms-change="onlyNum('erectDose',2)" ms-duplex-string="msgInfo.erectDose"> mg
                  </li>
                  <li class="minli">
                    <span class="brainTitle">DNT：</span>
                    <input class="meddleInput" type="text" maxlength="4" name="hspCerebralCourseCustom.cerebralDnt" ms-keyup="onlyNum('cerebralDnt')" ms-duplex-string="msgInfo.cerebralDnt"> 分
                  </li>
                </ul>
                <p class="centerWz">溶栓适应症</P>
                <table class="tabWrapper">
                  <colgroup>
                    <col width="3%"/>
                    <col width="87%" />
                    <col width="10%"/>                  
                  </colgroup>
                  <tr ms-repeat="msgList.cerebralIndList">
                    <th> {{el.infocode}}</th>
                    <td> 
                      <label class="labTab">
                        {{el.info}}
                      </label>
                    </td>
                    <td>
                      <label class="inputLab" ms-attr-for="cerebralInd{{el.infocode}}" >
                        <input ms-attr-id="cerebralInd{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="checkClick('cerebralInd',$index)">
                      </label>
                    </td>
                    <input class="hidden" type="text" name="hspCerebralCourseCustom.cerebralInd" ms-duplex-string="hideMsg.cerebralInd">
                  </tr>
                </table>
                <p class="centerWz">溶栓禁忌症</P>
                <table class="tabWrapper">
                  <colgroup>
                    <col width="3%"/>
                    <col width="87%" />
                    <col width="10%"/>                  
                  </colgroup>
                  <tr ms-repeat="msgList.cerebralContList">
                    <th> {{el.infocode}}</th>
                    <td> 
                      <label class="labTab">
                        {{el.info}}
                      </label>
                    </td>
                    <td>
                      <label class="inputLab" ms-attr-for="cerebralCont{{el.infocode}}" >
                        <input ms-attr-id="cerebralCont{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="checkClick('cerebralCont',$index)">
                      </label>
                    </td>
                    <input class="hidden" type="text" name="hspCerebralCourseCustom.cerebralCont" ms-duplex-string="hideMsg.cerebralCont">
                  </tr>
                </table>
                <ul class="ulwrapper">
                  <li class="rightli">
                    <span>评估医生签名</span>
                    <span class="spanRelative">
                      <input type="text" id="docName" maxlength="10" name="hspCerebralCourseCustom.createNam" ms-duplex-string="msgInfo.createNam" readonly>
                      <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspCerebralCourseCustom.assessDoc" ms-duplex-string="msgInfo.assessDoc">
                      <div class="userList" id="userNameList"></div>
                    </span>
                    <label class="labbox rxbox">日期</label>
                    <input class="Wdate spcWdate" name="hspCerebralCourseCustom.assessDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"  ms-duplex-string="msgInfo.assessDate">
                  </li>
                </ul>
                <p class="centerWz">美国国立卫生院神经功能缺损评分（NIHSS评分）</P>
                <table class="tabWrapper">
                  <colgroup>
                    <col width="15%"/>
                    <col width="45%" />
                    <col width="8%"/>   
                    <col width="8%"/>                  
                    <col width="8%"/>                  
                    <col width="8%"/>                  
                    <col width="8%"/> 
                  </colgroup>
                  <thead>
                    <tr class="bgTr">
                      <th>项目</th>
                      <th>评分标准</th>
                      <th ms-repeat="msgList.nihssTimeTypeList">{{el.info}}</th>
                    </tr>
                  </thead>
                  <tbody id="tabBody">
                    <tr ms-repeat="msgList.nihssProjectTypeList">
                      <td> <label class="labTab">{{el.info}}</label></td>
                      <td> <label class="labTab">{{el.remark}}</label></td>
                      <td>
                        <select onchange="getScore()" ms-class="sel0{{el.infocode}}"  ms-if="el.scoreNum > 0">
                          <option value=""></option>
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3" ms-if="(el.scoreNum ==3 || el.scoreNum == 9)">3</option>
                          <option value="4" ms-if="el.scoreNum == 9 ">4</option>
                          <option value="10" ms-if="el.scoreNum == 9 ">9</option>
                          <option value="10" ms-if="el.scoreNum == 10 ">9</option>
                        </select>
                        <span ms-if="el.scoreNum == 0" class="totalScore0" ms-class="sel0{{el.infocode}}"></span>
                      </td>
                      <td>
                        <select onchange="getScore()" ms-class="sel15{{el.infocode}}"  ms-if="el.scoreNum > 0">
                          <option value=""></option>
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3" ms-if="(el.scoreNum ==3 || el.scoreNum == 9)">3</option>
                          <option value="4" ms-if="el.scoreNum == 9 ">4</option>
                          <option value="10" ms-if="el.scoreNum == 9 ">9</option>
                          <option value="10" ms-if="el.scoreNum == 10 ">9</option>
                        </select>
                        <span ms-if="el.scoreNum == 0" class="totalScore15" ms-class="sel15{{el.infocode}}"></span>
                      </td>
                      <td>
                        <select onchange="getScore()" ms-class="sel30{{el.infocode}}"  ms-if="el.scoreNum > 0">
                          <option value=""></option>
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3" ms-if="(el.scoreNum ==3 || el.scoreNum == 9)">3</option>
                          <option value="4" ms-if="el.scoreNum == 9 ">4</option>
                          <option value="10" ms-if="el.scoreNum == 9 ">9</option>
                          <option value="10" ms-if="el.scoreNum == 10 ">9</option>
                        </select>
                        <span ms-if="el.scoreNum == 0" class="totalScore30" ms-class="sel30{{el.infocode}}"></span>
                      </td>
                      <td>
                        <select onchange="getScore()" ms-class="sel45{{el.infocode}}"  ms-if="el.scoreNum > 0">
                          <option value=""></option>
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3" ms-if="(el.scoreNum ==3 || el.scoreNum == 9)">3</option>
                          <option value="4" ms-if="el.scoreNum == 9 ">4</option>
                          <option value="10" ms-if="el.scoreNum == 9 ">9</option>
                          <option value="10" ms-if="el.scoreNum == 10 ">9</option>
                        </select>
                        <span ms-if="el.scoreNum == 0" class="totalScore45" ms-class="sel45{{el.infocode}}"></span>
                      </td>
                      <td>
                        <select onchange="getScore()" ms-class="sel60{{el.infocode}}"  ms-if="el.scoreNum > 0">
                          <option value=""></option>
                          <option value="0">0</option>
                          <option value="1">1</option>
                          <option value="2">2</option>
                          <option value="3" ms-if="(el.scoreNum ==3 || el.scoreNum == 9)">3</option>
                          <option value="4" ms-if="el.scoreNum == 9 ">4</option>
                          <option value="10" ms-if="el.scoreNum == 9 ">9</option>
                          <option value="10" ms-if="el.scoreNum == 10 ">9</option>
                        </select>
                        <span ms-if="el.scoreNum == 0" class="totalScore60" ms-class="sel60{{el.infocode}}"></span>
                      </td>
                    </tr>
                  </tbody>                            
                </table>
                <input type="text" class="hidden" ms-duplex-string="nihssMsg.nihssContent" name="hspNihssInfCustom.nihssContent">
                <ul class="ulwrapper">
                  <li class="rightli">
                    <span>评估医生签名</span>
                    <span class="spanRelative">
                      <input type="text" id="docAssignName" maxlength="10" name="hspNihssInfCustom.createNam" ms-duplex-string="nihssMsg.createNam" readonly>
                      <input type="text" class="hidden" id="docAssignNameNum" maxlength="10" name="hspNihssInfCustom.assessDoc" ms-duplex-string="nihssMsg.assessDoc">
                      <div class="userList" id="docList"></div>
                    </span>
                    <label class="labbox rxbox">日期</label>
                    <input class="Wdate spcWdate" name="hspNihssInfCustom.assessDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"  ms-duplex-string="nihssMsg.assessDate">
                  </li>
                </ul>
                <p class="centerWz">溶栓生命体征及神经功能缺损评估单（1）</P>
                <table class="tabWrapper" id="vitalTab">
                  <colgroup>
                    <col width="16%"/>
                    <col width="16%" />
                    <col width="16%"/> 
                    <col width="20%"/> 
                    <col width="10%"/> 
                    <col width="10%"/> 
                    <col width="12%" />
                  </colgroup>
                  <thead>
                    <tr class="bgTr">
                      <th></th>
                      <th>时间</th>
                      <th>心率（次/分）</th>
                      <th>血压(mmHg)</th>
                      <th>氧饱和度（℅）</th>
                      <th>NIHSS评分</th>
                      <th>医生签名</th>
                    </tr>
                  </thead>
                  <tbody>
                      <tr ms-repeat="msgList.sheetTimeTypeList">
                        <td>
                          <label class="labTab">{{el.info}}</label>
                          <span ms-class="timeType{{el.infocode}}" class="hidden">{{el.infocode}}</span>
                        </td>
                        <td><input class="spcWdate" type="text" ms-class="cerebralDates{{el.infocode}}" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"></td>
                        <td><input class="meddleInput" type="text" ms-class="heartRate{{el.infocode}}" maxlength="4" onkeyup="onlyNum(this)" oninput="onlyNum(this)" onchange="onlyNum(this)"></td>
                        <td class="smTdInput"><input type="text" ms-class="pressureUp{{el.infocode}}" maxlength="4" onkeyup="onlyNum(this)" oninput="onlyNum(this)" onchange="onlyNum(this)">/<input type="text" ms-class="pressureDown{{el.infocode}}" maxlength="4" onkeyup="onlyNum(this)" onchange="onlyNum(this)" oninput="onlyNum(this)"></td>
                        <td><input class="meddleInput" type="text" ms-class="oxyNbr{{el.infocode}}" maxlength="4" onkeyup="onlyNum(this)" oninput="onlyNum(this)" onchange="onlyNum(this)"></td>
                        <td><input class="meddleInput" type="text" ms-class="nihssScore{{el.infocode}}" maxlength="3" onkeyup="onlyNum(this)" oninput="onlyNum(this)" onchange="onlyNum(this)"></td>
                        <td>
                          <span class="spanRelative">
                            <input class="meddleInput" type="text" ms-class="userSign{{el.infocode}}" maxlength="10">
                            <div class="userList" ms-class="userList{{el.infocode}}">
                            </div>
                            <input type="text" ms-class="userDoc{{el.infocode}}" class="hidden">
                          </span>
                        </td>
                      </tr>
                  </tbody>
                </table>
                <ul class="ulwrapper" style="display:none">
                  <li class="rightli">
                    <span class="relative">
                      <span>评估医生签名</span>
                        <input type="text" id="curAssignName" maxlength="10" name="sheetAssessDocNam" ms-duplex-string="sheetMsg.sheetAssessDocNam" readonly>
                        <input type="text" class="hidden" id="curAssignNameNum" maxlength="10" name="sheetAssessDoc" ms-duplex-string="sheetMsg.sheetAssessDoc">
                        <div class="userList" id="curList"></div>
                    </span>
                    <label class="labbox rxbox">日期</label>
                    <input class="Wdate spcWdate" name="sheetAssessDate" type="text" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
                      ms-duplex-string="sheetMsg.sheetAssessDate">
                  </li>
                </ul>
                <input type="text" name="jsonList" ms-duplex-string="sheetMsg.sheetList" class="hidden">
            </div>
        </form>
    </div>
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/brainDisease/printbrainDisease.jsp"></jsp:include>
    <script type="text/javascript" charset="utf-8">
    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        var _lsLtn = vm.msgList.sheetTimeTypeList.length;
        for (var i = 0; i < _lsLtn; i++) {
          if ($(".userSign" + i).is(":focus")) {
            searchUser("userSign" + i, "userList" + i);
            flg = false; 
          }
        }
        // if ($('#docName').is(':focus')) {
        //   publicFun.SearchList('docName', 'userNameList')
        //   flg = false;
        // }
        // if ($('#docAssignName').is(':focus')) {
        //   publicFun.SearchList('docAssignName', 'docList')
        //   flg = false;
        // }
        // if ($('#curAssignName').is(':focus')) {
        //   publicFun.SearchList('curAssignName', 'curList')
        //   flg = false;
        // }
        return flg;
      })
    };

    $("body").click(function () {
      $(".userList").hide();
    });

    function onlyNum (current, step, max) {
      var currentVal = current.value;
      current.value = publicFun.onlyNumber(currentVal, step, max);
    }
    
    function searchUser (userSign, userList) {
      publicFun.SearchList(userSign, userList, "isClass")
    }
    // 获取最后一张表的数据
    function getTableContent(){
      var List = vm.msgList.sheetTimeTypeList;
      var data = [];
      $.each(List, function(idx, val) {
        data.push({
          timeType: $('.timeType' + idx).html(),
          cerebralDateStr: $('.cerebralDates' + idx).val(),
          heartRate: $('.heartRate' + idx).val(),
          pressureUp: $('.pressureUp' + idx).val(),
          pressureDown: $('.pressureDown' + idx).val(),
          oxyNbr: $('.oxyNbr' + idx).val(),
          nihssScore: $('.nihssScore' + idx).val(),
          relationDocnam: $('.userSign' + idx).val(),
          relationDoc: $('.userDoc' + idx).val()
        })
      })
      data = JSON.stringify(data)
      vm.sheetMsg.sheetList = data;
    }
    
    // 获取nihss具体评分
    function getNihssContent () {
      var TypeList = vm.msgList.nihssProjectTypeList;
      var _listScore = [];
      $.each(TypeList, function(idx, val) {
        if (idx != 15) {
          _listScore.push({
            infocode: 'Type' + val['infocode'],
            detail: {time0: $('.sel0'+ idx).val(), time15: $('.sel15'+ idx).val() , time30: $('.sel30'+ idx).val(), time45: $('.sel45'+ idx).val(), time60: $('.sel60'+ idx).val()}
          })
        } else {
          _listScore.push({
            infocode: 'Type' + val['infocode'],
            detail: {time0: $('.sel0'+ idx).html(), time15: $('.sel15'+ idx).html() , time30: $('.sel30'+ idx).html(), time45: $('.sel45'+ idx).html(), time60: $('.sel60'+ idx).html()}
          })
        }
      })
      _listScore = JSON.stringify(_listScore)
      vm.nihssMsg.nihssContent = _listScore
    }
    
    // 进行总分计算
    function getScore () {
      var TypeList = vm.msgList.nihssProjectTypeList;
      var totalA = null , totalB = null, totalC = null, totalD = null, totalE = null;
      $.each(TypeList, function(idx, val) {
        if (idx != 15) {
          if($('.sel0'+ idx).val() != '') {
            totalA += ($('.sel0'+ idx).val() - 0);
            if ($('.sel0' + idx).val() == '10') {
              totalA = totalA - 10
            }
          }
          if($('.sel15'+ idx).val() != '') {
            totalB += ($('.sel15'+ idx).val() - 0);
            if ($('.sel15' + idx).val() == '10') {
              totalB = totalB - 10
            }
          }
          if($('.sel30'+ idx).val() != '') {
            totalC += ($('.sel30'+ idx).val() - 0);
            if ($('.sel30' + idx).val() == '10') {
              totalC = totalC - 10
            }
          }
          if($('.sel45'+ idx).val() != '') {
            totalD += ($('.sel45'+ idx).val() - 0);
            if ($('.sel45' + idx).val() == '10') {
              totalD = totalD - 10
            }
          }
          if($('.sel60'+ idx).val() != '') {
            totalE += ($('.sel60'+ idx).val() - 0);
            if ($('.sel60' + idx).val() == '10') {
              totalE = totalE - 10
            }
          }
        } 
      })
      if (totalA != null ) {
        $('.totalScore0').html(totalA);
        $('.nihssScore0').val(totalA)
      }
      if (totalB != null ) {
        $('.totalScore15').html(totalB);
        $('.nihssScore1').val(totalB)
      }
      if (totalC != null ) {
        $('.totalScore30').html(totalC);
        $('.nihssScore2').val(totalC)
      }
      if (totalD != null ) {
        $('.totalScore45').html(totalD);
        $('.nihssScore3').val(totalD)
      }
      if (totalE != null ) {
        $('.totalScore60').html(totalE);
        $('.nihssScore4').val(totalE)
      }
    }

    function initAge () {
      if('${hspemginfCustom.cstAge}'){
          $('#ageInput').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      }else {
          $('#ageInput').val('')
      }
    }
    var vm = avalon.define({
        $id: 'brainDisease',
        msgList: {
          cerebralIndList: [],
          cerebralContList: [],
          nihssTimeTypeList: [],
          nihssProjectTypeList: [],
          sheetTimeTypeList: []
        },
        msgInfo: {
          cerebralCourseSeq: '', // id
          weight: '', // 体重
          cerebralDate: '' , // 溶栓时间
          erectDose: '' , // 爱通立剂量
          cerebralDnt: '', // dnt
          cerebralInd: [] , // 溶栓适应症
          cerebralCont: [] , // 溶栓禁忌症
          assessDoc: '', // 评估医生签名
          createNam: '',
          assessDate: '' //日期
        },
        hideMsg: {
          cerebralInd: '', // 溶栓适应症
          cerebralCont: '' , // 溶栓禁忌症
        },
        nihssMsg: {
          nihssContent: '', // NIHSS评分拼接内容
          assessDoc: '',// 评估医生签名
          createNam: '',
          assessDate: '' //日期
        },
        sheetMsg: {
          timeType: '', //溶栓时间类型
          cerebralDate: '', // 时间
          heartRate: '' ,// 心率（次/分）
          pressureUp: '', // 血压(mmHg)
          pressureDown: '',
          oxyNbr: '', // 氧饱和度（℅）
          nihssScore: '',// NIHSS评分    前缀hspCerebralSheetCustom
          sheetAssessDoc: '',// 评估医生签名
          sheetAssessDocNam: '',
          sheetAssessDate: '', //日期
          sheetList: '' // 大字段
        },
        /**
         * @ 多选
         */
        checkClick: function(objName, idx) {
          vm.hideMsg[objName] = publicFun.checkClickJson (vm.msgList[objName + 'List'],  vm.msgInfo[objName], idx , vm.hideMsg[objName])
        },
        onlyNum: function (obj, step, max) {
          vm.msgInfo[obj] = publicFun.onlyNumber(vm.msgInfo[obj], step, max)
        }
    })

    function getMsgList() {
      $.ajax({
        url: _baseUrl + 'cerebralation/findCerebralCourse.do',
        data: {
          emgSeq: _emgSeq
        },
        success:function(res){
          setVal(res);
          parent.checkRole(vm.msgInfo.assessDoc);
        }
      })
    }
    
    function setVal(res) {
      if (!'${hspCerebralCourseCustom.cerebralCourseSeq}') {
        var _currentDay = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        vm.msgInfo.assessDoc = _number;
        vm.msgInfo.createNam = _name;
        vm.nihssMsg.assessDoc = _number;
        vm.nihssMsg.createNam = _name;
        vm.sheetMsg.sheetAssessDoc = _number;
        vm.sheetMsg.sheetAssessDocNam = _name;
        vm.msgInfo.assessDate = _currentDay;
        vm.nihssMsg.assessDate = _currentDay;
        vm.sheetMsg.assessDate = _currentDay;
      }
      for (var key in res['hspCerebralCourseCustom']) {
        if(vm.msgInfo.hasOwnProperty(key)) {
          var _value = res['hspCerebralCourseCustom'][key] || '';
          if(_value != '' &&  _value != null) {
            if (key !== 'cerebralInd' && key !== 'cerebralCont') {
              vm.msgInfo[key] = _value;
            }
            if(key === 'cerebralDate' || key === 'assessDate'){
              vm.msgInfo[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'cerebralInd' || key === 'cerebralCont') {
              vm.hideMsg[key] = _value;
              _value = JSON.parse(_value)
              $.each(_value, function(idx, val) {
                if(val['isCheck'] == '1') {
                  vm.msgInfo[key].push(val['infocode'])
                }
              })
              var _json = vm.msgInfo[key].$model;
              $.each(vm.msgList[key + "List"], function(idx, val) {
                vm.msgList[key + "List"][idx].checked = publicFun.inArrayDoubleCheck(vm.msgList[key + "List"][idx]["infocode"], _json) >= 0 ? true : false
              })
            }
          }
        }
      }
      for (var key in res['hspNihssInfCustom']) {
        if (vm.nihssMsg.hasOwnProperty(key)) {
          var _value = res['hspNihssInfCustom'][key] || '';
          if(_value != '' &&  _value != null) {
            vm.nihssMsg[key] = _value;
            if(key === 'cerebralDate' || key === 'assessDate'){
              vm.nihssMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'nihssContent') {
              var _json = JSON.parse(_value);
              var _list = vm.msgList;
              $.each(_json, function(idx, val) {
                $.each(val, function(index, value) {
                  if (idx != '15') {
                    $('.sel0' + idx).val(value['time0'])
                    $('.sel15' + idx).val(value['time15'])
                    $('.sel30' + idx).val(value['time30'])
                    $('.sel45' + idx).val(value['time45'])
                    $('.sel60' + idx).val(value['time60'])
                  } else {
                    $('.sel0' + idx).html(value['time0'])
                    $('.sel15' + idx).html(value['time15'])
                    $('.sel30' + idx).html(value['time30'])
                    $('.sel45' + idx).html(value['time45'])
                    $('.sel60' + idx).html(value['time60'])
                  }
                })
              })
            }
          }
        } 
      }
      for (var key in res['hspCerebralSheetCustom']) {
        if (vm.sheetMsg.hasOwnProperty(key)) {
          var _value = res['hspCerebralSheetCustom'][key] || '';
          if(_value != '' &&  _value != null) {
            vm.sheetMsg[key] = _value;
          }
        } 
      }
      if (res['sheetAssessDoc']) {
         vm.sheetMsg['sheetAssessDoc'] = res['sheetAssessDoc']
      }
      if (res['sheetAssessDate']) {
        res['sheetAssessDate'] = publicFun.timeFormat(new Date(res['sheetAssessDate']), 'yyyy/MM/dd hh:mm:ss')
        vm.sheetMsg['sheetAssessDate'] = res['sheetAssessDate']
      }
      if (res['sheetAssessDocNam']) {
        vm.sheetMsg['sheetAssessDocNam'] = res['sheetAssessDocNam']
      }
      if (res['sheetList']) {
        var _json = res['sheetList'];
        var _length = _json.length;
        // if (_length == 0) {
        //   $('.userSign0').val(_name);
        //   $('.userDoc0').val(_number);
        // }
        $.each(_json, function(idx, val) {
          if (val['cerebralDate'] !=='' && val['cerebralDate'] !== null) {
            val['cerebralDate'] = publicFun.timeFormat(new Date(val['cerebralDate']), 'yyyy/MM/dd hh:mm:ss')
          } else {
            val['cerebralDate'] = ''
          }
          $('.cerebralDates' + val['timeType']).val(val['cerebralDate']);
          $('.heartRate' + val['timeType']).val(val['heartRate']);
          $('.pressureUp' + val['timeType']).val(val['pressureUp']);
          $('.pressureDown' + val['timeType']).val(val['pressureDown']);
          $('.oxyNbr' + val['timeType']).val(val['oxyNbr']);
          $('.nihssScore' + val['timeType']).val(val['nihssScore']);
          $('.userSign' + val['timeType']).val(val['relationDocnam']);
          $('.userDoc' + val['timeType']).val(val['relationDoc']);
          // if((idx+1) == _length) {
          //   if (_length <= 24) {
          //     $('.userSign' + _length).val(val['relationDocnam']);
          //     $('.userDoc' + _length).val(val['relationDoc']);
          //   }
          // }
        })
      }
    }

    /**
     * @ 保存
     */
    function saveForm(print) {
      publicFun.cleanSignMsg('docName');
      publicFun.cleanSignMsg('docAssignName');
      var _lsLtn = vm.msgList.sheetTimeTypeList.length;
      for (var i = 0; i < _lsLtn; i++) {
        if (publicFun.strTrim($(".userSign" + i).val()) === '') {
          $('.userDoc' + i).val('')
        }
      }
      if ($('.sel00').val() == '' && $('.sel150').val() == '' && $('.sel300').val() == '' && $('.sel450').val() == '' && $('.sel600').val() == '' ) {
        publicFun.alert('1a意识水平（必须选择一个反应）！')
        return false
      }
      getNihssContent();
      getTableContent();
      if (print == "p") {
        jquerySubByFId('brainDiseaseForm', insertuserPrint_callback, null, "json");
      } else {
        jquerySubByFId('brainDiseaseForm', insertuser_callback, null, "json");
      }
    }
  
    function insertuser_callback(data) {
      message_alert(data);
      setTimeout(function() {
        window.location.reload();
      }, 800)
    }
    
    function insertuserPrint_callback (data) {
       setTimeout(function() {
        // window.location.reload();
        printForm();
       }, 800)
    }
    $(function(){
      initAge();
      getDataList();
    })
    $(document).keydown(function(event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });
  
  function getDataList () {
    if(_cratNbr == ''){
      parent.checkRole(_number,'brain')
    }else{
      parent.checkRole(_cratNbr,'brain')
    }
    $.ajax({
      url: '${baseurl}cerebralation/findCerebralList.do',
      type: 'post',
      success: function (data) {
        var lists = data.resultInfo.sysdata;
        $.each(lists,function(key, val) {
          if (vm.msgList.hasOwnProperty(key)) {
            $.each(val, function(idx, value) {
              value['checked'] = false
            })
            if (key == 'nihssProjectTypeList') {
              $.each(val, function(idx,value) {
                if (idx == '1' || idx == '2' || idx == '3' || idx == '11' || idx == '14') {
                  value['scoreNum'] = 2
                } else if (idx == '9' || idx == '8' || idx == '7' || idx == '6') {
                  value['scoreNum'] = 9
                } else if( idx == '10' || idx == '13') {
                  value['scoreNum'] = 10
                } else if (idx == '15'){
                  value['scoreNum'] = 0
                } else {
                  value['scoreNum'] = 3
                }
              })            
            }
            vm.msgList[key] = val
          }
        })
        getMsgList()
      }
    })
  }
  </script>
</body>

</html>