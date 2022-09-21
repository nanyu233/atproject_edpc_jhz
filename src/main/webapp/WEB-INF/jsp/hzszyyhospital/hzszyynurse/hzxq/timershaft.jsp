<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/hzxq.css?5555">
  <script type="text/javascript" src="${baseurl}js/fishBone/fishBone.js"></script>
  <script type="text/javascript" src="${baseurl}js/fishBone/jquery.SuperSlide.2.1.1.js"></script>
  <title>时间轴</title>
</head>

<body>
  <div class="timershaft clr">
    <div class="fishBone">
    </div>
  </div>
  <script type="text/javascript">
    $(function () {
      setTimeShaftHeight();
      getPatientMsg();
    });
    function setTimeShaftHeight() {
      var iframeHeight = window.parent.iframeHeight;
      $('.timershaft').height(iframeHeight - 142)
      if (!parent.cmdprint) {
        $('.timershaft').css({'margin-top': '50px'})
      }
    }

    function getPatientMsg() {
      publicFun.httpServer({ url: '${baseurl}hzszyyemg/getSjzData.do' }, { emgSeq: '${emgSeq}' }, function (data) {
        var _list = data.resultInfo.sysdata.tHemsSjzList;
        for (var i = 0; i < _list.length; i++) {
          if (_list[i].sjzDate) {
            _list[i].sjzDate = publicFun.timeFormat(new Date(_list[i].sjzDate), 'yyyy/MM/dd hh:mm')
          }
        }
        $(".fishBone").fishBone(_list);
      })
    }
  </script>
</body>

</html>