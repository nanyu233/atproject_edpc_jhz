<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>手术操作病程</title>
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
    <p class="subTitle">手术操作病程</p>
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
    <div ms-controller="operationTable">
      <div ms-repeat="list" class="contentDiv">
        <p class="boldText">手术、操作病程记录</p>
        <p class="contentText">{{el.operBcjl}}</p>
        <p class="boldText">病程记录名称：{{el.operNam}}</p>
        <p class="rightText">手术操作医生：{{el.operYs}}</p>
        <p class="rightText">日期：{{el.operDat}}</p>
      </div>
    </div>
  </div>
  <script type="text/javascript">
    var vm = avalon.define({
      $id: 'operationTable',
      list: []
    });
    function loadQuery(emgSeq) {
      publicFun.httpServer({ url: '${baseurl}zyylqbl/findOperateListByEmgSeq.do' }, {
        'hspOperateInfCustom.emgSeq': emgSeq,
        'page': '1',
        'rows': 10000
      }, function (data) {
        var res = data.rows;
        for (var i = 0 ; i < res.length; i++) {
          if (res[i].operDat) {
            res[i].operDat = publicFun.timeFormat(new Date(res[i].operDat), 'yyyy/MM/dd hh:mm:ss')
          }
        }
        vm.list = res;
      })
      var height = $('.mainDiv', parent.document).height() - 120;
      $('#operationTable').css({ 'max-height': height + 'px' });
    }

    $(function () {
      var emgSeq = parent.$('#emgSeq').val();
      loadQuery(emgSeq);
    })
  </script>
</body>

</html>