<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>交接班记录-新增</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/at-form.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/jjbjlEditAdd.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="titlebody">
  <h1 class="title" id="titlename"></h1>
  <form class="at-form" id="handoverSheetForm" action="${baseurl}zyylqbl/insertjjbjl.do" method="post" style="border-bottom: none;">
    <input class="hidden" type="text" name="hspJjbjlInfCustom.emgSeq" value="${emgSeq}">
    <div class="basicDiv">
      <label class="bascilab">姓名：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstNam}"
          readonly></label>
      <label class="bascilab">性别：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstSexCod}"
          readonly></label>
      <label class="bascilab cstAgelab">年龄：<input class="basicInput" unselectable='on' id="age" type="text" readonly></label>
      <label class="bascilab">科别：<input class="basicInput longbasicInput" unselectable='on' type="text" value="${hspemginfCustom.emgFkCod}"
          readonly></label>
      <label class="bascilab">病历号：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.mpi}"
          readonly></label>
      <label class="bascilab">留观号：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.observationCode}"
          name="hspemginfCustom.observationCode" readonly></label>
    </div>
    <div class="at-form-item clr">
      <label class="at-form-item__label">交接时间</label>
      <div class="at-form-item__content">
        <input class="Wdate" type="text" name="hspJjbjlInfCustom.jjbjlDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
          style="width: 145px;">
      </div>
    </div>
    <div class="at-form-item clr" style="display:none">
      <label class="at-form-item__label">类&emsp;&emsp;别</label>
      <div class="at-form-item__content">
        <label class="doctorType" for="doctorType0">
          <input id="doctorType0" type="radio" name="hspJjbjlInfCustom.jjbjlType" value="0"> 交班
        </label>
        <label class="doctorType" for="doctorType1">
          <input id="doctorType1" type="radio" name="hspJjbjlInfCustom.jjbjlType" value="1"> 接班
        </label>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="at-form-item__label">记录内容</label>
      <div class="at-form-item__content">
        <textarea id="jjbjlContent" name="hspJjbjlInfCustom.jjbjlContent" class="longTextArea"></textarea>
      </div>
    </div>
    <div class="recorder clr">
      <div class="recorder__content">
        <span class="spanRelative">
          <input type="text" id="docName" maxlength="10" name="hspJjbjlInfCustom.jjbjlNam" onkeydown="getSignList(event)" readonly>
          <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspJjbjlInfCustom.jjbjlNum">
          <div class="userList" id="userNameList"></div>
        </span>
      </div>
      <label class="recorder__label">记&ensp;录&ensp;人</label>
    </div>
  </form>
  <script type="text/javascript">
    function getSignList(e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
      }
    }
    $("body").click(function () {
      $(".userList").hide();
    });
    function saveForm() {
      publicFun.cleanSignMsg('docName');
      var jjbjlDat = $('.Wdate').val();
      if (jjbjlDat == '') {
        publicFun.alert('请输入时间');
        return false;
      }
      jquerySubByFId('handoverSheetForm', function (res) {
        message_alert(res);
        setTimeout(function () {
          parent.selectType();
        }, 800)
      }, null, 'json');
    }
    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#age').val('')
      }
    }
    function initMsg() {
      var doctype = '${flag}';
      $("#doctorType" + doctype).attr("checked", "checked");
      if (doctype == '0') {
        $('#titlename').text('交班记录');
      } else if (doctype == '1') {
        $('#titlename').text('接班记录');
      }
      var _now = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      $('.Wdate').val(_now);
      $('#docName').val('${sessionScope.activeUser.usrname}');
      $('#docNameNum').val('${sessionScope.activeUser.usrno}');
    }
    $(function () {
      initAge();
      initMsg()
    })
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });
  </script>
</body>

</html>