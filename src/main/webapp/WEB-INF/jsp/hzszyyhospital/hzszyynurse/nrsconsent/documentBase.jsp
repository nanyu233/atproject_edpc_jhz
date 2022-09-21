<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>交接单父页面</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/tys/tys.css?v=${versionDay}">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="xtpg">
  <input type="hidden" value="${formToken}" id="formToken">
  <div id="mainView" class="mainView">
      <c:choose>
        <c:when test="${hspNrsConsentInfCustom.seqno ==null || hspNrsConsentInfCustom.seqno==''}">
          <jsp:include page="${hspNrsConsentInfCustom.conturl}"></jsp:include>
        </c:when>
        <c:otherwise>
          ${hspNrsConsentInfCustom.texthtml}
        </c:otherwise>
      </c:choose>

      <c:choose>
        <c:when test="${hspNczrslchcbInfCustom.seqno ==null || hspNczrslchcbInfCustom.seqno==''}">
          <jsp:include page="${hspNczrslchcbInfCustom.conturl}"></jsp:include>
        </c:when>
        <c:otherwise>
          ${hspNczrslchcbInfCustom.texthtml}
        </c:otherwise>
      </c:choose>
  </div>
</body>
<script type="text/javascript">
  var comdata = parent.comdata;
  var _baseUrl = comdata.baseUrl;

  $(function () {
    window.onresize = setLayout;
    setLayout();
    if(comdata.params.tempno != '2029'){
      diffTempNo()
    }
  });

  function diffTempNo() {
    var tempNo = comdata.params.tempno;
    if (tempNo == "2001" && tempNo == "") {
      setChildBrost();
    }
    if (tempNo == "2010" || tempNo == "2011" || tempNo == "2018") {
      if ('${hspemginfCustom.cstSexCod}' == '男') {
        $('#male').attr('checked', true);
      } else if ('${hspemginfCustom.cstSexCod}' == '女') {
        $('#female').attr('checked', true);
      }
    }
  }

  function singlecheck(a, thisname, showarea) {
    $(a).click(function () {
      if ($(a).attr('checked')) {
        $(thisname).removeAttr('checked');
        $(a).attr('checked', 'checked');
      }
      if (showarea != '') {
        if ($(a).val() == 'yes') {
          $(showarea).css('display', 'inline-block');
        } else {
          $(showarea).css('display', 'none');
        }
      }
    });
  }

  function parentcheck(a, parentname, childname) {
    $(a).click(function () {
      if ($(a).attr('checked')) {
        if ($(a).val() == 'no') {
          $(childname).removeAttr('checked');
        }
        $(parentname).removeAttr('checked');
        $(a).attr('checked', 'checked');
      }
    });
  }

  function childcheck(a, childname, parentvala, parentvalb) {
    $(a).click(function () {
      $(parentvala).removeAttr('checked');
      $(childname).removeAttr('checked');
      $(parentvalb).attr('checked', 'checked');
      $(a).attr('checked', 'checked');
    });
  }
  var List = ['isInHos','choose','reasonDeth','isLate','leftven','ECMO','ERI','xscx','IABP','functionCheck','qnView','fencha','CTO','xueshuan','narrowLevel','narrow50','pathology','startPCI','rsAgain','doRS','checkRS','zhuanyun','NYHA','KillIp','callXNK','zhenshi','yishi','arriveWay','isrs','wherers','rsmedicine','rslevel','rsagain','doubleblood','transway','yibao','sensitive', 'oral', 'injection', 'highrisk', 'report', 'skin', 'oralmucosa', 'inform', 'eat', 'output', 'known', 'medicalrecord'];
  $.each(List, function (idx, value) {
    $('input[name=' + value + ']').each(function () {
      singlecheck(this, 'input[name=' + value + ']', '');
    });
  })

  function Tocheck(it, node, checkNum) {
    if (checkNum == 'true') {
      exchangetonum(it);
    }
    if ($(it).val() != '') {
      $("input[name=" + node + "]").attr("checked", false);
      $('.' + node + 'Last').attr("checked", true);
    }
  }

  $('input[name="infusion"]').each(function () {
    parentcheck(this, 'input[name="infusion"]', 'input[name="infusiontype"]');
  });

  $('input[name="infusiontype"]').each(function () {
    childcheck(this, 'input[name="infusiontype"]', '#infusionno', '#infusionyes');
  });

  $('input[name="drain"]').each(function () {
    parentcheck(this, 'input[name="drain"]', 'input[name="draintype"]');
  });

  $('input[name="draintype"]').each(function () {
    childcheck(this, 'input[name="draintype"]', '#drainno', '#drainyes');
  });

  $('input[name="score"]').each(function () {
    singlecheck(this, 'input[name="score"]', '#scorearea');
  });

  $('input[name="radiography"]').each(function () {
    singlecheck(this, 'input[name="radiography"]', '#radiographyarea');
  });

  var specialList = ['skinVal'];
  $.each(specialList, function (idx, val) {
    var _input = val + 'Input';
    $('input[name=' + val + ']').each(function () {
      singlecheck(this, 'input[name=' + val + ']', '', _input);
    });
  })

  // 这功能本来是走之前获取页面诊断，现在诊断都是手输入的，目前暂时留着怕到时候有空。--- yhl
  function setChildBrost() {
    var length = $("#bz_id").children("label").length;
    var hzzdCod = [],
      hzzdCodname = [];
    for (var i = 0; i < length; i++) {
      hzzdCod.push($(".hzzdCod-id").eq(i).val());
      hzzdCodname.push($(".hzzdCod-name").eq(i).text())
    }
    $("#jbzdSeq").val(hzzdCod.join(","))
    $("#jbzdDes").val(hzzdCodname.join(";"))
  }

  function selectDep() {
    createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do?selectType=a');
  }

  function selectAcceptDep() {
    createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do?selectType=b');
  }
  //转化成有小数的数字
  function exchangetonumpoint(it, max) {
    var val = it.value;
    if (max != '') {
      if (val > 100) {
        var length = val.length;
        val = val.substring(0, length - 1);
      }
    }
    val = val.replace(/[^\d.]/g, "").replace(/^\./g, "").replace(/\.{2,}/g, "").replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
    var testStr = val,
      testStrList = testStr.split(".");
    if (testStrList.length > 1) {
      if (testStrList[1].length > 2) {
        val = parseFloat(testStr).toFixed(parseInt(2)).toString();
      }
    }
    it.value = val;
  }

  function judgeUnitShow(it) {
    var val = it.value;
    if (isNaN(val)) {
      $(it).next().css('display', 'none');
    } else {
      $(it).next().css('display', 'inline-block');
    }
  }

  document.onkeydown = function (evt) {
    publicFun.keyDownRecall(evt, function () {
      var flg = true;
      if ($("#userSign").is(":focus")) {
        searchUser();
        flg = false;
      }
      if ($('#username').is(':focus')) {
        searchUserName();
        flg = false;
      }
      if ($("#doubleuserSign").is(":focus")) {
        searchUserDb();
        flg = false;
      }
      if ($('#doubleusername').is(':focus')) {
        searchUserNameDb();
        flg = false;
      }
      if ($('#crtusrname').is(':focus')) {
        searchUserCrt();
        flg = false;
      }
      return flg;
    })
  }

  function searchUserCrt() {
    if (event.keyCode == 13) {
      publicFun.SearchList("crtusrname", "crtuserList")
    }
  }

  function searchUser() {
    if (event.keyCode == 13) {
      publicFun.SearchList("userSign", "userList")
    }
  }

  function searchUserName() {
    if (event.keyCode == 13) {
      publicFun.SearchList("username", "userNameList")
    }
  }

  function searchUserDb() {
    if (event.keyCode == 13) {
      publicFun.SearchList("doubleuserSign", "doubleuserList")
    }
  }

  function searchUserNameDb() {
    if (event.keyCode == 13) {
      publicFun.SearchList("doubleusername", "doubleuserNameList")
    }
  }

  function setLayout() {
    var windowWidth = $(parent.window).width(),
      windowHeight = $(parent.parent.window).height();
    $("#mainView").width(windowWidth - 230);
    $("#mainView").height(windowHeight - 33);
  }
</script>

</html>