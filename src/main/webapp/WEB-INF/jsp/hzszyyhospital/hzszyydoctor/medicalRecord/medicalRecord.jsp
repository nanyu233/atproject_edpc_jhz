<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>病案首页</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/medicalRecord.css?v=${versionDay}">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${emgSeq}';
    var _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}';
  </script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/medicalRecord.avalon.js?v=${versionDay}" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript" src="${baseurl}lib/jsBarcode/jsBarcode.all.js?v=${versionDay}"></script> 
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body ms-controller="medicalRecord" class="medicalRecord">
  <div class="mainbody">
    <p class="subheadtitle">病案首页</p>
    <form id="recordFrom" action="${baseurl}zyylqbl/addMedicalRecord.do" method="post">
      <input class="hidden" type="text" id="emgSeq" name="hspemginfCustom.emgSeq" value="${emgSeq}">
      <input class="hidden" type="text" name="hspBasyCustom.emgSeq" value="${emgSeq}">
      <input class="hidden" type="text" id="basySeq" name="hspBasyCustom.basySeq" ms-duplex-string="patientMsg.basySeq">
      <input class="hidden" type="text" id="vstCad" name="vstCad" ms-duplex-string="patientMsg.vstCad">
      <input class="hidden" type="text" id="mpi" name="mpi" ms-duplex-string="patientMsg.mpi">
      <div class="patient-msg-add">
        <table class="table">
          <colgroup>
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
          </colgroup>
          <tbody>
            <tr>
              <th>医疗机构：</th>
              <td>
                <input type="text" class="form-control" name="hspBasyCustom.yljg" ms-duplex-string="patientMsg.yljg"
                  readonly>
                <!-- {{patientMsg.yljg}} -->
              </td>
              <th colspan="2">(组织机构代码：</th>
              <td colspan="2">
                <!-- {{patientMsg.zzjgCod}}） -->
                <input type="text" style="width: 60%" name="hspBasyCustom.zzjgCod" ms-duplex-string="patientMsg.zzjgCod"
                  readonly>
                )
              </td>
            </tr>
            <tr rowspan="2">
              <th colspan="10" class="specialTh">
                医疗付费方式：
                <label ms-repeat="msgList.ylffTypeList" ms-attr-for="ylffType{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="ylffType{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.ylffType"
                    ms-change="changeToStr('ylffType', $index)" ms-class="specialLeft: el.infocode == 9"> {{el.info}}
                  <span ms-if="el.infocode == 8"><br /></span>
                </label>
                <input ms-if="patientMsg.isShowPayOtherWay" maxlength="50" type="text" name="hspBasyCustom.ylffOther"
                  ms-duplex-string="patientMsg.ylffOther" class="extraInput" />
                <input class="hidden" type="text" name="hspBasyCustom.ylffType" ms-duplex-string="hideMsg.ylffType" />
              </th>
            </tr>
            <tr>
              <th>第：</th>
              <td colspan="2">
                <input type="text" ms-duplex-string="patientMsg.lqNum" name="hspBasyCustom.lqNum" readonly />
                <span class="boldFont">次留抢<span>
              </td>
              <th colspan="6">病历号：</th>
              <td>
                <input type="text" ms-duplex-string="patientMsg.mpi" readonly>
              </td>
            </tr>
            <tr>
              <th>姓名：</th>
              <td>
                <input type="text" ms-duplex-string="patientMsg.cstNam" readonly>
              </td>
              <th>性别：</th>
              <td>
                <label ms-repeat="msgList.cstSexCodList" ms-attr-for="cstSexCod{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="cstSexCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.cstSexCod"
                    ms-change="changeToStr('cstSexCod', $index)"> {{el.info}}
                </label>
                <input type="text" ms-duplex-string="hideMsg.cstSexCod" name="hspemginfCustom.cstSexCod" class="hidden">
              </td>
              <th>出生日期：</th>
              <td>
                <input class="Wdate" type="text" name="hspemginfCustom.bthDat" ms-duplex-string="patientMsg.bthDat"
                  onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
              </td>
              <th>年龄：</th>
              <td>
                <input id="emg_cstAge" type="text" name="hspemginfCustom.cstAge" placeholder="年龄" ms-keyup="onlyNum('cstAge')"
                  ms-input="onlyNum('cstAge')" ms-change="onlyNum('cstAge')" ms-duplex-string="patientMsg.cstAge"
                  maxlength="10" class="smallInputWth">&ensp;
                <select id="cstAgeCod" name="hspemginfCustom.cstAgeCod" ms-duplex-string="patientMsg.cstAgeCod" class="smallSelWth">
                  <option ms-repeat="msgList.cstAgeCodList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
              </td>
              <th>国籍：</th>
              <td>
                <input type="text" name="hspemginfCustom.nationality" ms-duplex-string="patientMsg.nationality"
                  maxlength="10">
              </td>
            </tr>
            <tr>
              <th>民族：</th>
              <td>
                <input type="text" name="hspemginfCustom.nation" ms-duplex-string="patientMsg.nation" maxlength="20">
              </td>
              <th>职业：</th>
              <td>
                <select id="emgJob" name="hspemginfCustom.emgJob" ms-duplex-string="patientMsg.emgJob">
                  <option value="">请选择</option>
                  <option ms-repeat="msgList.zyList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
              </td>
              <th>工作单位：</th>
              <td colspan="3">
                <input class="form-control" type="text" name="hspemginfCustom.gzdw" ms-duplex-string="patientMsg.gzdw"
                  maxlength="50">
              </td>
              <th>婚姻：</th>
              <td>
                <select id="maritalStatus" name="hspemginfCustom.maritalStatus" ms-duplex-string="patientMsg.maritalStatus">
                  <option value="">请选择</option>
                  <option ms-repeat="msgList.maritalStatusList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
              </td>
            </tr>
            <tr>
              <th>身份证号：</th>
              <td colspan="3">
                <input class="form-control" type="text" name="hspemginfCustom.idNbr" ms-duplex-string="patientMsg.idNbr"
                  maxlength="20">
              </td>
              <th>现住址：</th>
              <td colspan="3">
                <input class="form-control" type="text" name="hspemginfCustom.cstAdr" ms-duplex-string="patientMsg.cstAdr"
                  maxlength="50">
              </td>
              <th>电话：</th>
              <td>
                <input type="text" name="hspemginfCustom.pheNbr" ms-duplex-string="patientMsg.pheNbr" maxlength="20">
              </td>
            </tr>
            <tr>
              <th>关系人名：</th>
              <td>
                <input type="text" name="hspBasyCustom.gxrNam" ms-duplex-string="patientMsg.gxrNam" maxlength="50">
              </td>
              <th>关系：</th>
              <td>
                <input type="text" name="hspBasyCustom.gx" ms-duplex-string="patientMsg.gx" maxlength="50">
              </td>
              <th>现住地：</th>
              <td colspan="3">
                <input class="form-control" type="text" name="hspBasyCustom.gxrAddres" ms-duplex-string="patientMsg.gxrAddres"
                  maxlength="50">
              </td>
              <th>电话：</th>
              <td>
                <input type="text" name="hspBasyCustom.gxrTel" ms-duplex-string="patientMsg.gxrTel" maxlength="20">
              </td>
            </tr>
            <tr>
              <th>预检时间：</th>
              <td>
                <input class="Wdate form-control min-wth" type="text" name="hspemginfCustom.emgDat" ms-duplex-string="patientMsg.emgDat"
                  readonly>
              </td>
              <th>预检分级：</th>
              <td>
                <input type="text" name="hspemginfCustom.chkLvlCod" ms-duplex-string="patientMsg.chkLvlCod" readonly>
              </td>
              <th>接诊时间：</th>
              <td>
                <input class="Wdate form-control  min-wth" type="text" name="hspemginfCustom.docDat" ms-duplex-string="patientMsg.docDat"
                  onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
              </td>
              <th colspan="3">首诊科室：</th>
              <td colspan="2">
                <input type="text" name="hspemginfCustom.emgFkName" ms-duplex-string="patientMsg.emgFkName" readonly>
              </td>
            </tr>
            <tr>
              <th>入院途径：</th>
              <td colspan="9">
                <label ms-repeat="msgList.arvChlCodList" ms-attr-for="arvChlCod{{el.infocode}}" class="checklabel">
                  <input type="checkbox" ms-attr-id="arvChlCod{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.arvChlCod"
                    ms-change="changeToStr('arvChlCod', $index)">
                  {{el.info}}
                </label>
                <input class="hidden" type="text" name="hspBasyCustom.arvChlCod" ms-duplex-string="hideMsg.arvChlCod">
                <span ms-if="hideMsg.arvChlCod == '5'">
                  驾驶员姓名：
                  <span class="relative">
                    <input type="text" name="hspBasyCustom.abnDriver" ms-duplex-string="patientMsg.abnDriver" id="driverName"
                      ms-keyup="cleanAbnSco()" autocomplete="off" maxlength="20">
                    <ul class="userList topList" ms-visible="isShowAbnDriverList">
                      <li ms-repeat="msgList.abnDriverList" ms-click="chooseAbnDriver(el.info)">
                        {{el.info}}
                      </li>
                    </ul>
                  </span>
                  &nbsp;&nbsp;医生签名：
                  <span class="relative">
                    <input type="text" id="usernameDoc" maxlength="10" name="hspBasyCustom.abnDoctor" autocomplete="off"
                      ms-duplex-string="patientMsg.abnDoctor">
                    <div class="userList" id="usernameDocList"></div>
                  </span>
                </span>
                <input type="text" ms-if="hideMsg.arvChlCod == '9'" name="hspBasyCustom.abnScoNme" ms-duplex-string="patientMsg.abnScoNme">
                <!-- <input type="text" name="hspBasyCustom.arvCHlStr" ms-duplex-string="patientMsg.arvCHlStr" readonly> -->
              </td>
            </tr>
            <tr>
              <th>留抢时间：</th>
              <td>
                <input class="Wdate form-control min-wth" type="text" name="hspBasyCustom.lqDat" ms-duplex-string="patientMsg.lqDat"
                  onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" onchange="timeCompute()" autocomplete="off">
              </td>
              <th>留抢科别：</th>
              <td>
                <select id="lqkb" class="departments" ms-duplex-string="patientMsg.lqkb" name="hspBasyCustom.lqkb"
                  ms-change="setCodVal()">
                  <option value="">请选择</option>
                  <option ms-repeat="msgList.jzkscompctlList" ms-attr-value="el.comno">{{el.comcname}}</option>
                </select>
                <input type="text" name="hspemginfCustom.emgFkCod" ms-duplex-string="patientMsg.emgFkCod" class="hidden">
              </td>
              <th>实际留抢：</th>
              <td>
                <input type="text" class="smallInputWth" name="hspBasyCustom.lqsc" ms-duplex-string="patientMsg.lqsc"
                  ms-keyup="onlyNum('lqsc')" ms-input="onlyNum('lqsc')" ms-change="onlyNum('lqsc')">
                <span class="unit">天</span>
                <input type="text" class="hidden" name="hspBasyCustom.lqscType" ms-duplex-string="patientMsg.lqscType">
              </td>
            </tr>
            <tr>
              <th>离抢时间：</th>
              <td>
                <input class="Wdate form-control" type="text" name="hspBasyCustom.sqlDat" ms-duplex-string="patientMsg.sqlDat"
                  onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" onchange="timeCompute()" autocomplete="off">
              </td>
              <th>离抢方式：</th>
              <td>
                <select id="sqlType" class="departments" ms-duplex-string="patientMsg.sqlType" name="hspBasyCustom.sqlType"
                  ms-change="reversionChange()">
                  <option value="">请选择</option>
                  <option ms-repeat="msgList.cstDspList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
              </td>
              <th ms-visible="patientMsg.sqlType == 2">科室：</th>
              <td ms-visible="patientMsg.sqlType == 2">
                <input type="text" id="emg_emgFkName" readonly="readonly" ms-duplex-string="patientMsg.sqlDepName" name="hspBasyCustom.sqlDepName"
                  onfocus="selectDep()" />
                <input class="hidden" id="emg_sqlDepCod" type="text" ms-duplex-string="patientMsg.sqlDepCod" name="hspBasyCustom.sqlDepCod">
                <input type="text" class="hidden" ms-duplex-string="patientMsg.sqlSeq" name="hspBasyCustom.sqlSeq">
              </td>
              <th ms-visible="patientMsg.sqlType == 13">所转医院：</th>
              <td ms-visible="patientMsg.sqlType == 13">
                <input type="text" ms-duplex-string="patientMsg.sqlDes" maxlength="20" name="hspBasyCustom.sqlDes" />
              </td>
              <th colspan="2">接收医疗机构名称：</th>
              <td colspan="2">
                <input class="form-control" type="text" name="hspBasyCustom.jsyljgNam" ms-duplex-string="patientMsg.jsyljgNam"
                  autocomplete="off">
              </td>
            </tr>
            <tr>
              <th>转运途径：</th>
              <td colspan="9">
                <label ms-repeat="msgList.zytjList" ms-attr-for="zytj{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="zytj{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.zytj"
                    ms-change="changeToStr('zytj', $index)"> {{el.info}}
                </label>
                <input type="text" name="hspBasyCustom.zytj" ms-duplex-string="hideMsg.zytj" class="hidden" />
                <input ms-if="patientMsg.isShowTransWay" type="text" name="hspBasyCustom.zytjOther" ms-duplex-string="patientMsg.zytjOther"
                  maxlength="16">
              </td>
            </tr>
            <tr>
              <th>
                离抢诊断：<br />
                <a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod('4', '4')">[查看]</a>
              </th>
              <td colspan="9">
                <table class="innerTable">
                  <thead>
                    <tr>
                      <th>诊断类型</th>
                      <th>离抢诊断</th>
                      <th>疾病编码</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr ms-repeat="msgList.leaveDiagnoseList">
                      <td>{{el.jbzdStatus}}</td>
                      <td>{{el.jbzdComm}}</td>
                      <td>{{el.icd}}</td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>
            <tr>
              <th>
                手术操作：<br />
                <a class="my-linkbutton btna importBtnLink" data-options="toggle:true,plain:true" onclick="enterOperateMsg()">[录入]</a>
              </th>
              <td colspan="9">
                <div class="tableScroll">
                  <table class="tableHeader">
                    <tbody>
                      <tr>
                        <th class="firstTd">手术操作名称</th>
                        <th class="secondTd">手术操作日期</th>
                        <th class="thirdTd">手术操作医生</th>
                        <th class="fourTd">操作</th>
                        <th></th>
                      </tr>
                    </tbody>
                  </table>
                  <div class="scrollBox">
                    <table class="tableBody">
                      <tbody>
                        <tr ms-repeat="msgList.operateList" ms-click="addTrBg($index)">
                          <td class="firstTd">{{el.operNam}}</td>
                          <td class="secondTd">{{el.operDat}}</td>
                          <td class="thirdTd">{{el.operYs}}</td>
                          <td class="center fourTd">
                            <span ms-if="el.operSeq">
                              <a class="colorA" ms-click="editOperate(el.operSeq)">修改</a>
                              <a class="colorA">|</a>
                              <a class="colorA" ms-click="delOperate(el.operSeq)">删除</a>
                            </span>
                          </td>
                          <td></td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
                <!-- <table class="innerTable">
                  <thead>
                    <tr>
                      <th>手术操作名称</th>
                      <th>手术操作日期</th>
                      <th>手术操作医生</th>
                      <th>操作</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr ms-repeat="msgList.operateList">
                      <td>{{el.operNam}}</td>
                      <td>{{el.operDat}}</td>
                      <td>{{el.operYs}}</td>
                      <td class="center">
                        <a class="colorA" ms-click="editOperate(el.operSeq)">修改</a>
                        <a class="colorA">|</a>
                        <a class="colorA" ms-click="delOperate(el.operSeq)">删除</a>
                      </td>
                    </tr>
                  </tbody>
                </table> -->
              </td>
            </tr>
            <tr>
              <th>病种：</th>
              <td colspan="9">
                <label class="checklabel" ms-repeat="msgList.bzList" ms-attr-for="bz{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="bz{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.bzCod"
                    ms-change="arrToStr('bzCod')"> {{el.info}} &nbsp;&nbsp;&nbsp;
                </label>
                <input type="text" name="hspBasyCustom.bzCod" ms-duplex-string="hideMsg.bzCod" class="hidden" />
              </td>
            </tr>
            <tr>
              <th>操作步骤：</th>
              <td colspan="9">
                <label class="check-label" ms-repeat="msgList.czjsList" ms-attr-for="czjs{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="czjs{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.czjsCod"
                    ms-change="arrToStr('czjsCod', $index)"> {{el.info}} &nbsp;&nbsp;&nbsp;
                  <span class="spanRelative" ms-visible="patientMsg.czjsCod.indexOf(el.infocode) != -1">
                    <input type="text" ms-attr-id="operateId{{$index}}" maxlength="10" ms-blur="queryName($index)">
                    <input type="text" ms-attr-id="operateId{{$index}}Num" class="hidden">
                    <div class="userList" ms-attr-id="operateIdList{{$index}}"></div>
                  </span>
                </label>
                <input type="text" name="hspBasyCustom.basyCzjsList" ms-duplex-string="patientMsg.basyCzjsList" class="hidden" />
                <input type="text" name="hspBasyCustom.czjsCod" ms-duplex-string="hideMsg.czjsCod" class="hidden" />
              </td>
            </tr>
            <tr>
              <th>药物过敏：</th>
              <td colspan="9">
                <label ms-repeat="msgList.ywgmList" ms-attr-for="ywgm{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="ywgm{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.ywgm"
                    ms-change="changeToStr('ywgm', $index)"> {{el.info}} &nbsp;&nbsp;&nbsp;
                </label>
                <input type="text" name="hspBasyCustom.ywgm" ms-duplex-string="hideMsg.ywgm" class="hidden" />
                <input class="long-control" ms-if="patientMsg.isShowGmFlag" maxlength="50" type="text" name="hspBasyCustom.ywgmOther"
                  ms-duplex-string="patientMsg.ywgmOther" />
              </td>
            </tr>
            <tr>
              <th>血型：</th>
              <td colspan="3">
                <label ms-repeat="msgList.bloodTypeList" ms-attr-for="bloodType{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="bloodType{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.bloodType"
                    ms-change="changeToStr('bloodType', $index)"> {{el.info}} &nbsp;&nbsp;&nbsp;
                </label>
                <input type="text" name="hspBasyCustom.bloodType" ms-duplex-string="hideMsg.bloodType" class="hidden" />
              </td>
              <th>Rh：</th>
              <td colspan="5">
                <label ms-repeat="msgList.rhList" ms-attr-for="rh{{el.infocode}}">
                  <input type="checkbox" ms-attr-id="rh{{el.infocode}}" ms-attr-value="el.infocode" ms-duplex="patientMsg.rh"
                    ms-change="changeToStr('rh', $index)"> {{el.info}} &nbsp;&nbsp;&nbsp;
                </label>
                <input type="text" name="hspBasyCustom.rh" ms-duplex-string="hideMsg.rh" class="hidden" />
              </td>
            </tr>
            <tr>        
              <th>主管医师：</th>
              <td>
                <span class="spanRelative">
                  <input type="text" class="signInput" id="username" maxlength="10" ms-duplex-string="patientMsg.zgysNam" name="hspBasyCustom.zgysNam">
                  <input type="text" id="usernameNum" ms-duplex-string="patientMsg.zgysCod" name="hspBasyCustom.zgysCod"
                    class="hidden">
                  <div class="userList" id="userNameList"></div>
                </span>
              </td>
              <td colspan="2">
                <span id="dzqm">
                </span>
              </td>
              <th>经管医师：</th>
              <td colspan="3">
                <span class="spanRelative">
                  <input type="text" class="signInput" id="userSign" maxlength="10" ms-duplex-string="patientMsg.jgysNam" name="hspBasyCustom.jgysNam">
                  <input type="text" id="userSignNum" ms-duplex-string="patientMsg.jgysCod" name="hspBasyCustom.jgysCod"
                    class="hidden">
                  <div class="userList" id="userList"></div>
                </span>
              </td>
              <th>责任护士：</th>
              <td>
                <span class="spanRelative">
                  <input type="text" class="signInput" id="userNur" maxlength="10" ms-duplex-string="patientMsg.zrhsNam" name="hspBasyCustom.zrhsNam">
                  <input type="text" id="userNurNum" ms-duplex-string="patientMsg.zrhsCod" name="hspBasyCustom.zrhsCod"
                    class="hidden">
                  <div class="userList" id="userNurList"></div>
                </span>
              </td>
            </tr>
            <tr>
              <th colspan="3">留抢费用（元）：总费用：
                <input type="text" class="lqfyInput" name="hspBasyCustom.lqfy" ms-duplex-string="patientMsg.lqfy" ms-keyup="onlyNum('lqfy',4)" maxlength="50">
              </th>
              <td colspan="7">
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </form>
  </div>
  <div class="btnPos">
    <a href="javascript:;" id="sign" class="commonbtn leftBtn" onclick="getSign()">签名</a>
    <a id="save" href="javascript:;" class="commonbtn leftBtn" onclick="postPatientMsg()">保存</a>
    <a id="print" href="javascript:;" class="commonbtn leftBtn" onclick="postPatientMsg('print')">打印</a>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/medicalRecord/printMedicalRecord.jsp"></jsp:include>
  <script type="text/javascript">
    $(function () {
      var height = $('#main', parent.document).height() - 45;
      $('.mainbody').height(height);
    })

    //初始化 判断登陆用户或登录用户角色是否有权限进行操作
    function checkRole() {
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do', isNoLoad: true }, { "cratNbr": vm.patientMsg.creCod }, function (data) {
        if (parent.pageFlg ) { // 归档病历或者无操作权限
          $('#save').hide()
          $('#sign').hide()
          $('#print').attr("onclick","print()");
          isOpenBox = false;
        } else {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "nurse") {
            $("#save").hide();
            $('#sign').hide()
            isOpenBox = false;
          }else{
            isOpenBox = true;
          }
        }
        //日志、归档病历、留抢病历 游客无权限
        if(data.resultInfo.message == "tourist"){
            $("#save").hide();
            $('#sign').hide();
            $('#print').hide();
            isOpenBox = false;
          }
        if (isOpenBox == false) {
          setPageDisable();
        }
      })
    }
    
    function setPageDisable () {
      $('#recordFrom input, #recordFrom textarea, #recordFrom select').attr('disabled', true);
      $('.importBtnLink').hide();
    }

    function selectDep() {
      createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do');
    }

    function getTime() {
      var _lgTime = new Date(vm.patientMsg.lqDat),
        _leaveTime = new Date(vm.patientMsg.sqlDat),
        _lgTimes = _lgTime.getTime(),
        _leaveTimes = _leaveTime.getTime(),
        total = (_leaveTimes - _lgTimes) / 1000;
      var timeWrapUp = Math.ceil(total / (24 * 60 * 60)); // 向上取整
      var timeWrap = parseInt(total / (24 * 60 * 60)); // 获取整的天数
      if ((total < 86400) && (total > 0)) {
        timeWrap = (total / (60 * 60));
        if (timeWrap > 0 && timeWrap < 1) {
          timeWrap = 1;
        } else {
          timeWrap = Math.ceil(timeWrap);
        }
        vm.patientMsg.lqscType = '0';
        $('.unit').html('时');
      } else {
        timeWrap = timeWrapUp;
        $('.unit').html('天');
        vm.patientMsg.lqscType = '1';
      }
      return timeWrap;
    }
    function timeCompute() {
      var timeWrap = getTime();
      if (publicFun.checkItemNull(vm.patientMsg.lqDat)) {
        publicFun.alert("留抢时间不能为空");
        return false;
      }
      if (timeWrap < 0 || timeWrap == -0) {
        publicFun.alert('离抢时间需大于留抢时间');
        vm.patientMsg.sqlDat = '';
        vm.patientMsg.lqsc = '';
        return false;
      }
      if (publicFun.checkItemNull(vm.patientMsg.lqDat) || publicFun.checkItemNull(vm.patientMsg.sqlDat)) {
        vm.patientMsg.lqsc = '';
      } else {
        vm.patientMsg.lqsc = timeWrap;
      }
    }

    /**
    * @ 签名
    */
    function getSign() {
      var basySeq = vm.patientMsg.basySeq;
      if (basySeq != null && basySeq != '') {
        publicFun.httpServer(
          { url: _baseUrl + 'zyylqbl/getSign.do' },
          {
            "emgSeq": _emgSeq, "relevanceId": basySeq, "documentTable": 'HSP_BASY_INF', "templateId": 'hash_003'
            , "request172": '病案首页', "tag": '病案首页'
          },
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
      var basySeq = $("#basySeq").val();
      if (basySeq != null && basySeq != '') {
        publicFun.httpServer(
          { url: _baseUrl + 'zyylqbl/findDzqmImg.do' },
          { "relevanceId": vm.patientMsg.basySeq, "documentTable": 'HSP_BASY_INF' },
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

    $("body").click(function () {
      vm.isShowAbnDriverList = false;
      $(".userList").hide();
    });

    $('#driverName').click(function (e) {
      e.stopPropagation();
      vm.isShowAbnDriverList = true;
    });

    document.onkeydown = function (evt) {
      switch (evt.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        var _lsLth = vm.msgList.czjsList;
        for (var i = 0; i < _lsLth.length; i++) {
          if ($("#operateId" + i).is(":focus")) {
            publicFun.SearchList('operateId' + i, 'operateIdList' + i);
            flg = false;
          }
        }
        var _nameList = [{id: 'username', listId: 'userNameList'}, {id: 'usernameDoc', listId: 'usernameDocList'}, {id: 'userSign', listId: 'userList'}, {id: 'userNur', listId: 'userNurList'}];
        for (var i = 0; i < _nameList.length; i++) {
          if ($("#" + _nameList[i].id).is(":focus")) {
            publicFun.SearchList(_nameList[i].id, _nameList[i].listId);
            flg = false;
          }
        }
        if ($('#driverName').is(":focus")) {
          flg = false;
        }
        return flg;
      })
    };
  </script>
</body>

</html>