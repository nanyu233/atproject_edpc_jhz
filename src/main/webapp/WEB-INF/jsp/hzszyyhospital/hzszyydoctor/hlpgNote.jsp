<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="cache-control" content="no-cache">
  <title>入院护理评估单</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hlpgb.css?6">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/docHlpgNote.css?6">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript">
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var _emgSeq = '${emgSeq}';
    var _cstNam = '${cstNam}';
    var _ownPageWay = 'noSave';
    // var comdata = { cstNam: '${cstNam}', emgSeq: '${emgSeq}', baseUrl: '${baseurl}', username: '${sessionScope.activeUser.usrname}' };
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/hlpgb.avalon.js?5" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body class="hlNote">
  <div class="mainBody">
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/xtpg/xtpgRypgd.jsp"></jsp:include>
  </div>
  <div class="btnPos">
    <a href="javascript:;" class="commonbtn" id="print" onclick="print()">打印</a>
  </div>
  <script type="text/javascript">
    //初始化 判断登陆用户角色是否有权限
    function checkRole() {
      //判断是否有权限
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, {"cratNbr": ''}, function (data) {
        checkstatus = data.resultInfo.message;
        if (data.resultInfo.message == "tourist") {
          $('#print').hide();
        }
      });
    }

    $(function () {
      var height = $('#main', parent.document).height() - 45;
      $('.mainBody').height(height);
      checkRole();
    })
  </script>
</body>
</html>
