<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>ADL评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var _xtpgSeq = '${xtpgSeq}',
      _emgBedNew = '${hspemginfCustom.emgBed}';
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/adlVm.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="scoreQuery" ms-controller="adlScore">
  <p class="headtitle">ADL评分</p>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/basicTopInfo.jsp"></jsp:include>
  <div class="panelGde">
    <form id="ADLForm" action="${baseurl}scorequery/addAdlScore.do" method="post">
      <input class="hidden" type="text" ms-duplex-string="sysMsg.createDate" name="hspAdlInfCustom.cratDat"/>
      <input class="hidden" type="text" value="${emgSeq}" name="hspAdlInfCustom.emgSeq">
      <input class="hidden" type="text" value="${xtpgSeq}" name="hspAdlInfCustom.xtpgSeq">
      <div class="AdlContent panelContent">
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/scorePages/adlSco.jsp"></jsp:include>
        <div class="scoreDiv">
          <span class="boldFont">总分：<i>{{aboutAdl.adlSco}}</i></span>
          <br />
          <input type="hidden" name="hspAdlInfCustom.adlSco" ms-duplex-string="aboutAdl.adlSco">
          <span>备注：<input type="text" name="hspAdlInfCustom.adlMemo" class="remarkInput" ms-duplex-string="aboutAdl.adlMemo"
              maxlength="120"></span>
        </div>
      </div>
    </form>
  </div>
  <script type="text/javascript">
    //保存
    function saveCom() {
      if (vm.aboutAdl.adlSco == '' || vm.aboutAdl.adlSco == null) {
        publicFun.alert("请输入ADL评分");
        return false
      }
      jquerySubByFId('ADLForm', insertuser_callback, null, "json");
    }

    //保存回调
    function insertuser_callback(data) {
      window.parent.$('#tabDiv').datagrid('reload');
      window.parent.message_alert(data);
      setTimeout(function () {
        window.location.reload();
      }, 800)
    }

    $(function () {
      getParentBasicVal();
      getMsgList();
    })
  </script>
</body>

</html>