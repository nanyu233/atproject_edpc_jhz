<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>日常病程</title>
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
    <p class="subTitle">日常病程记录</p>
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
    <div id="dailyTable" ms-controller="dailyTable">
      <div ms-repeat="list" class="contentDiv">
        <p>{{el.courseDateStr}} <span class="printText">日常病程记录</span></p>
        <p class="contentText">{{el.record}}</p>
        <p class="rightText">记录医师：{{el.createNam}}</p>
      </div>
    </div>
  </div>
  <script type="text/javascript">
    var vm = avalon.define({
      $id: 'dailyTable',
      list: []
    });
    function loadQuery(emgSeq) {
      publicFun.httpServer({ url: '${baseurl}zyylqblqrb/queryDiseaseCourse_result.do' }, {
        'hspDiseaseCourseCustom.courseType': '2',
        'hspDiseaseCourseCustom.emgSeqDc': emgSeq
      }, function (data) {
        var res = data.rows;
        for (var i = 0; i < res.length; i++) {
          if (res[i].courseDateStr) {
            res[i].courseDateStr = publicFun.timeFormat(res[i].courseDateStr, 'yyyy年MM月dd日 hh时mm分')
          }
        }
        vm.list = res;
      })
      var height = $('.mainDiv', parent.document).height() - 120;
      $('#dailyTable').css({ 'max-height': height + 'px' });
    }

    $(function () {
      var emgSeq = parent.$('#emgSeq').val();
      loadQuery(emgSeq);
    })
  </script>
</body>

</html>