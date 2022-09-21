<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>留观病历首页</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${hspemginfCustom.emgSeq}',
      _cstAgeNew = '${hspemginfCustom.cstAge}',
      _cstAgeCodNew = '${hspemginfCustom.cstAgeCod}',
      _admtDat = '${hspObsvtfstInfCustom.admtDatStr}',
      _dscgDat = '${hspObsvtfstInfCustom.dscgDatStr}',
      _opDat = '${hspObsvtfstInfCustom.oprtDatStr}',
      _cratNam = '${hspObsvtfstInfCustom.cratNam}',
      _cratNbr = '${hspObsvtfstInfCustom.cratNbr}',
      _unit = '${hspObsvtfstInfCustom.obsvtType}';
  </script>
</head>

<body class="printHtml">
  <div class="mainbody">
    <div class="print-body">
      <p class="title">${hospitalPlatformNameGap}</p>
      <p class="subTitle">留观首页</p>
      <ul class="print-ul">
        <li class="printHalfLi">
          <label class="title-label">姓名：</label>
          <span>${hspemginfCustom.cstNam}</span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">性别：</label>
          <span>${hspemginfCustom.cstSexCod}</span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">年龄：</label>
          <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
        </li>
        <li class="printHalfLi">
          <span class="title-labe">留观号</span>
          <span>${hspemginfCustom.observationCode}</span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">身份证号：</label>
          <span id="_idNbr">${hspemginfCustom.idNbr}</span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">电话：</label>
          <span id="_pheNbr">${hspemginfCustom.pheNbr}</span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">入观日期：</label>
          <span id="admtDatspn"></span>
        </li>
        <li class="printHalfLi">
          <label class="title-label">出观日期：</label>
          <span id="dscgDatspn"></span>
        </li>
        <li class="printFullLi">
          <label class="title-label">初步诊断：</label>
          <span id="_jbzdDes">${hspemginfCustom.jbzdDes}</span>
        </li>
        <li class="printFullLi">
          <label class="title-label">出观诊断：</label>
          <span id="_cyzdXy">${hspemginfCustom.cyzdXy}</span>
        </li>
        <li class="printFullLi">
          <label class="title-label">转归：</label>
          <span id="_obsvtZg"></span>
        </li>
        <li class="printFullLi">
          <label class="title-label">留观时长：</label>
          <span id="_lgsc"><span id="_obsvtLenSpan">${hspObsvtfstInfCustom.obsvtLen}</span> <span id="unit"></span></span>
        </li>
        <li class="longFloatRightLi">
          <label>医师签名：</label>
          <span id="docName"></span>
          <label>日期：</label>
          <span id="operateDate"></span>
        </li>
      </ul>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    function getTimeWrap() {
      var _timewrap = getTime();
      if (_admtDat == '' || _dscgDat == '') {
        $('#_obsvtLenSpan').text('');
      } else {
        $('#_obsvtLenSpan').text(_timewrap);
      }
    }

    function getTime() {
      var admtime = new Date(_admtDat),
        dsctime = new Date(_dscgDat),
        admtimes = admtime.getTime(),
        dsctimes = dsctime.getTime(),
        total = (dsctimes - admtimes) / 1000;
      var timewrap = parseInt(total / (24 * 60 * 60));
      var afterDay = total - timewrap * 24 * 60 * 60;//取得算出天数后剩余的秒数
      if ((afterDay < 86400) && (afterDay > 0)) {
        timewrap = timewrap + 1;
      }
      if ((total < 86400) && (total > 0)) {
        timewrap = (total / (60 * 60));
        if (timewrap > 0 && timewrap < 1) {
          timewrap = 1;
        } else {
          timewrap = parseInt(timewrap);
        }
        $('#unit').html('时');
      } else {
        $('#unit').html('天');
      }
      return timewrap;
    }
    $(function () {
      var height = $('#main', parent.document).height();
      $('.mainbody').height(height);
      // if (_admtDat != '' && _dscgDat != '' && $('#_obsvtLenSpan').text() == '') {
      //   getTimeWrap();
      // }
      setPrintData();
    })
    function setPrintData() {
      if (_unit == '0') {
        $('#unit').html('时');
      }
      if (_unit == '1') {
        $('#unit').html('天');
      }
      if ($('#_age').html() == '岁') {
        $('#_age').html("");
      }
      if ($('#_idNbr').html() === '1' || $('#_idNbr').html() === '') {
        $('#_idNbr').html('无')
      }
      var _zgValList = [{ cod: '1', val: '出院' }, { cod: '2', val: '住院' }, { cod: '0', val: '出观' }, { cod: '4', val: '自动离院' }, { cod: '8', val: '回家' }, { cod: '9', val: '转门诊' }, { cod: '11', val: '转留观室' }, { cod: '12', val: '非医嘱离院' }, { cod: '3', val: '死亡' }, { cod: '14', val: '来院已死亡' }, { cod: '13', val: '转院' }];
      $.each(_zgValList, function (idx, value) {
        if (value.cod == '${hspObsvtfstInfCustom.obsvtZg}') {
          $('#_obsvtZg').html(value.val)
        }
      })
      $('#admtDatspn').html(_admtDat);
      if (_dscgDat == '') {
        $('#dscgDatspn').html("");
      } else {
        $('#dscgDatspn').html(_dscgDat);
      }
      if ($('#_lgsc').html() == '天' || $('#_lgsc').html() == '时') {
        $('#_lgsc').html("");
      }
      var _name = '${sessionScope.activeUser.usrname}';
      if (_cratNam != '') {
        $('#docName').html(_cratNam)
      } else {
        $('#docName').html(_name)
      }
      if (_opDat != '') {
        $('#operateDate').html(_opDat);
      } else {
        $('#operateDate').html(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
      }
    }
  </script>
</body>

</html>