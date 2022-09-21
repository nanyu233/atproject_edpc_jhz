<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>会诊记录</title>
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
    <p class="subTitle">会诊记录单</p>
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
    </ul>
    <div id="consultationTable" ms-controller="consultationTable">
      <div ms-repeat="list" class="contentDiv">
        <p class="threeText">邀请会诊科室：{{el.invitationDep}}</p>
        <p class="threeText">医生：{{el.invitationDocNme}}</p>
        <p class="threeText">邀请会诊时间：{{el.invitationDateStr}}</p>
        <p class="boldText">病情摘要：</p>
        <pre>{{el.illnessState}}</pre>
        <p class="boldText">会诊要求、目的：</p>
        <pre>{{el.objective}}</pre>
        <p class="rightText">申请科室：{{el.applyDepStr}}</p>
        <p class="rightText">申请人：{{el.applyDocName}}</p>
        <hr class="cutLine">
        <p class="sixText">答复：{{el.replyContent}}</p>
        <p class="threeText">会诊时间：{{el.consultationDateStr}}</p>
        <p class="boldText floatLeft">会诊意见：</p>
        <pre>{{el.consultationOpinion}}</pre>
        <p class="rightText">会诊科室：{{el.replyDepStr}}</p>
        <p class="rightText">会诊医生：{{el.replyDocName}}</p>
      </div>
    </div>
  </div>
  <script type="text/javascript">
    var vm = avalon.define({
      $id: 'consultationTable',
      list: []
    });
    function loadQuery(emgSeqCr) {
      publicFun.httpServer({url: '${baseurl}zyylqblqrb/queryConsultation_result.do'}, {
        'hspConsultationRecordsCustom.emgSeqCr': emgSeqCr
      }, function (data) {
        var res = data.rows;
        vm.list = res;
      })
      var height = $('.mainDiv', parent.document).height() - 120;
      $('#consultationTable').css({ 'max-height': height + 'px' });
    }

    $(function () {
      var emgSeqCr = '${emgSeqCr}';
      if (!emgSeqCr) {
        emgSeqCr = '${hspemginfCustom.emgSeq}';
      };
      loadQuery(emgSeqCr);
    })
  </script>
</body>
</html>