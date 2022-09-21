<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>死亡记录</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/base/cssReseat.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/base/common.css?5" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <script type="text/javascript" src="${baseurl}js/public.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="diseaseHtml">
  <div class="print-body">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">死亡记录</p>
    <ul class="print-ul">
      <li class="bordered">
        <span class="basic-span">
          <label>姓名：</label>
          <span>${hspemginfCustom.cstNam}</span>
        </span>&emsp;
        <span class="basic-span">
          <label>性别：</label>
          <span>${hspemginfCustom.cstSexCod}</span>
        </span>&emsp;
        <span class="basic-span">
          <label>年龄：</label>
          <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
        </span>&emsp;
        <span class="basic-span">
          <label>科别：</label>
          <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
        </span>&emsp;
        <span class="basic-span">
          <label>病历号：</label>
          <span id="_mpi">${hspemginfCustom.mpi}</span>
        </span>&emsp;
        <span class="basic-span">
          <label>留观号：</label>
          <span id="_lgh">${hspemginfCustom.observationCode}</span>
        </span>
      </li>
      <li class="printHalfLi">
        <label class="lab-span">入院时间：</label>
        <span id="_comeTimeStr"></span>
      </li>
      <li class="printHalfLi">
        <label class="lab-span">死亡时间：</label>
        <span id="_deathTime"></span>
      </li>
      <li class="printFullLi">
        <label style="font-weight:bold">入院情况：</label>
      </li>
      <li class="printFullLi">
        <pre id="_comeSituation">${hspDeathRecordCustom.comeSituation}</pre>
      </li>
      <li class="printFullLi">
        <label style="font-weight:bold">诊疗经过：</label>
      </li>
      <li class="printFullLi">
        <pre id="_treatmentProcess">${hspDeathRecordCustom.treatmentProcess}</pre>
      </li>
      <li class="printFullLi">
        <label style="font-weight:bold">死亡原因：</label>
      </li>
      <li class="printFullLi">
        <pre id="_causeDeath">${hspDeathRecordCustom.causeDeath}</pre>
      </li>
      <li class="printFullLi">
        <label style="font-weight:bold">死亡诊断：</label>
        <span id="_diagnosisDeath">${hspemginfCustom.deathDiagnosis}</span>
      </li>
      <li class="floatRightLi">
        <label>医师签名：</label>
        <span id="_createDoc"></span>
      </li>
      <li class="floatRightLi">
        <label class="lab-span">日期：</label>
        <span id="_courseDate"></span>
      </li>
    </ul>
  </div>
  <script type="text/javascript">
    function setPrintVal() {
      if ($('#_age').html() == '岁') {
        $('#_age').html('');
      }
      if ('${hspDeathRecordCustom.deathRecordSeq}') {
        $('#_courseDate').html('${hspDeathRecordCustom.courseDateStr}');
        $('#_createDoc').html('${hspDeathRecordCustom.createNam}');
        $('#_comeTimeStr').html('${hspDeathRecordCustom.comeTimeStr}');
        $('#_deathTime').html('${hspDeathRecordCustom.deathTimeStr}');
      } else {
        $('#_courseDate').html(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#_createDoc').html('${sessionScope.activeUser.usrname}');
        $('#_comeTimeStr').html('');
        $('#_deathTime').html('');
      }
    }

    $(function () {
      setPrintVal();
    })
  </script>
</body>

</html>