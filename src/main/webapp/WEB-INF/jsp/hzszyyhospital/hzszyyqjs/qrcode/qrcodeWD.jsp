<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>二维码打印</title>
</head>

<body>
  <script type="text/javascript" src="${baseurl}lib/qrcode/qrcode.js"></script>
  <input id="vstCadWD_2d" type="text" value="2222222222222" style="width:80%; display: none;" /><br />
  <div id="qrcodeWDWrapper" style="display: none;">
    <div id="qrcodeWD" style="padding:0;margin:0;width:14mm">
    </div>
  </div>
  <script>
    //腕带打印二维码生成
    var qrcodeWD = new QRCode(document.getElementById("qrcodeWD"), {
      width: 50,
      height: 50
    });

    function makeCodeWD() {
      var elText = $('#vstCadWD_2d');
      var qrcodeVal = null;
      if (!elText.val()) {
        //alert("Input a text");
        elText.focus();
        return;
      } else {
        if (elText.val() == 1) {
          var emgInf = { "vstCad": "卡号" };
          qrcodeVal = JSON.stringify(emgInf);
        } else {
          qrcodeVal = elText.val();
        }
      }
      qrcodeWD.makeCode(qrcodeVal);
    }

    makeCodeWD();
  </script>
</body>

</html>