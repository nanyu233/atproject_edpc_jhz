<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>留抢病历体温单</title>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

  </head>
  <div class="mainbody" style="overflow-y: auto;text-align: center;">
  	<img id="img" />
  </div>
  <body>
    <script>
    function getImg(){
        $.ajax({
            url:'${baseurl}zyylqbl/lqbltpctbyte.do?emgSeq=${emgSeq}',
            type:'POST',
            async: false,
            dataType:'json',
            success: function(res) {
              if(res.resultInfo.sysdata.str == '无数据') {
                $('#img').hide();
              }else{
                $('#img').show();
                $("#img").attr({"src":"data:image/jpeg;base64,"+res.resultInfo.sysdata.str});
              }
            }
        })
    }
    $(function(){
      var height = $('#main', parent.document).height();
      $('.mainbody').height(height);
    	getImg();
    })
    </script>
  </body>
</html>
