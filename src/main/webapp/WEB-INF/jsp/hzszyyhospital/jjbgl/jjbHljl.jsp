<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?10" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?039">
  <title>病情护理记录父页面</title>
  <script type="text/javascript" charset="utf-8">
    var comdata = { cstNam: '${cstNam}', emgSeq: '${emgSeq}'};
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body>
  <script type="text/javascript">
  var _JJBheight =  $("#tabs", parent.document).height() - 34 - 18;
    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      var contentDiv = '<iframe id ="rightFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;" onload="this.height= $(window).height()"></iframe>';
      $('#receitpDiv').html(contentDiv);
    }

    $(function(){
      createFrame('${baseurl}hzszyyjjd/toxtpgBqhljld.do');
    })
  </script>
  <form>
    <div class="receitpDiv" id="receitpDiv">
      <!-- <div class="receitpContent">
      </div> -->
    </div>
  </form>
</body>
</html>