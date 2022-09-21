<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>抢救室小结</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${hspemginfCustom.emgSeq}',
      _cstAgeNew = '${hspemginfCustom.cstAge}',
      _cstAgeCodNew = '${hspemginfCustom.cstAgeCod}',
      _ryrqDat = '${hspCgxjInfCustom.ryrqDatStr}',
      _cyrqDat = '${hspCgxjInfCustom.cyrqDatStr}',
      _oprtDat = '${hspCgxjInfCustom.oprtDatStr}',
      _cratNbr = '${hspCgxjInfCustom.cratNbr}',
      _cratNam = '${hspCgxjInfCustom.cratNam}',
      _unit = '${hspCgxjInfCustom.cgxjDatTyp}';
  </script>
</head>

<body class="diseaseHtml">
  <div class="print-body" id="mainBody">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">抢救室小结</p>
    <ul class="print-ul">
      <li class="bordered">
        <span class="basic-span">
          <label class="title-label">姓名：</label>
          <span>${hspemginfCustom.cstNam}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">性别：</label>
          <span>${hspemginfCustom.cstSexCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">年龄：</label>
          <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">科别：</label>
          <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">病历号：</label>
          <span id="_mpi">${hspemginfCustom.mpi}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">留观号：</label>
          <span id="_lgh">${hspemginfCustom.observationCode}</span>
        </span>
      </li>
      <li class="printHalfLi">
        <label class="lab-span">入观日期：</label>
        <span id="_ryrq">${hspCgxjInfCustom.ryrqDatStr}</span>
      </li>
      <li class="printHalfLi">
        <label class="lab-span">出观日期：</label>
        <span id="_cyrq">${hspCgxjInfCustom.cyrqDatStr}</span>
      </li>
      <li class="printFullLi">
        <label>初步诊断：</label>
        <span id="_ryzdxy">${hspemginfCustom.jbzdDes}</span>
      </li>
      <li class="printFullLi">
        <label>出观诊断：</label>
        <span id="_cyzdxy">${hspemginfCustom.cyzdXy}</span>
      </li>
      <li class="printFullLi">
        <label>留观时长：</label>
        <span id="_lgsc">${hspCgxjInfCustom.lgscLen}<span class="unit"></span></span>
      </li>
      <li class="printFullLi">
        <label>入观情况：</label>
        <pre id="_ryqk">${hspCgxjInfCustom.ryqkDes}</pre>
      </li>
      <li class="printFullLi">
        <label>诊疗经过：</label>
        <pre id="_zljg">${hspCgxjInfCustom.zljgDes}</pre>
      </li>
      <li class="printFullLi">
        <label>出观情况：</label>
        <pre id="_cyqk">${hspCgxjInfCustom.cyqkDes}</pre>
      </li>
      <li class="printFullLi">
        <label>出观医嘱：</label>
        <pre id="_cyyz">${hspCgxjInfCustom.cyyzDes}</pre>
      </li>
      <li class="floatRightLi">
        <label>医师签名：</label>
        <span id="username"></span>
      </li>
      <li class="floatRightLi">
        <label>日期：</label>
        <span id="_oprtDatInput"></span>
      </li>
    </ul>
  </div>
  <script type="text/javascript" charset="utf-8">
    function getTimeWrap() {
      var _admtime = new Date(_ryrqDat),
        _dsctime = new Date(_cyrqDat),
        _admtimes = _admtime.getTime(),
        _dsctimes = _dsctime.getTime(),
        _total = (_dsctimes - _admtimes) / 1000;
      var _timewrap = parseInt(_total / (24 * 60 * 60));
      var _afterDay = _total - _timewrap * 24 * 60 * 60;//取得算出天数后剩余的秒数
      if ((_afterDay < 86400) && (_afterDay > 0)) {
        _timewrap = _timewrap + 1;
      }
      if ((_total < 86400) && (_total > 0)) {
        timewrap = (_total / (60 * 60));
        if (timewrap > 0 && timewrap < 1) {
          timewrap = 1;
        } else {
          timewrap = parseInt(timewrap);
        }
        $('.unit').html('时');
      } else {
        $('.unit').html('天');
      }
      if (_ryrqDat == '' || _cyrqDat == '') {
        $('#_lgscLenInput').val('');
      } else {
        $('#_lgscLenInput').val(_timewrap);
      }
    }
    function setPrintVal() {
      if ($('#_age').html() == '岁') {
        $('#_age').html('');
      }
      var _oprtDatVal;
      if (_oprtDat != '') {
        _oprtDatVal = _oprtDat;
      } else {
        _oprtDatVal = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      }
      $('#_oprtDatInput').html(_oprtDatVal);
      if (_cratNam != '') {
        $('#username').html(_cratNam)
      } else {
        $('#username').html(_name)
      }
      if (_unit == '0') {
        $('.unit').html('时');
      }
      if (_unit == '1') {
        $('.unit').html('天');
      }
    }
    $(function () {
      var height = $('#main', parent.document).height();
      $('.mainBody').height(height);
      // if (_ryrqDat != '' && _cyrqDat != '' && $('#_lgscLenInput').val() == '') {
      //   getTimeWrap();
      // }
      setPrintVal();
    })

  </script>
</body>

</html>