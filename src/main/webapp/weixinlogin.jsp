<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>${hospitalPlatformNameLogin}</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <meta http-equiv="Content-Security-Policy" content="upgrade-insecure-requests">
    <link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/loginhzszyy.css">

    <script src="//res.wx.qq.com/open/js/jweixin-1.2.0.js"></script>
    <script src="https://wwcdn.weixin.qq.com/node/wework/wwopen/js/wwLogin-1.2.7.js"></script>

    <style type="text/css">
        .login-box {
            height: 311px;
        }
        .login-boximage {
            margin-top: -235px;
        }
    </style>
</head>

<body class="login-bg">

<div class="login-box">
    <div class="login-boximage">
        <div class="login-title">${hospitalPlatformNameLogin}</div>
        <div class="login-txt">
            <div id="login_container"></div>
        </div>
    </div>
</div>

<button type="button" class="btn btn-primary" id="JumpToLogin">跳转登录</button>
</body>
<script type="text/javascript">
    var pathName = window.location.pathname.substring(1);
    var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
    var BaseUrl = window.location.protocol + '//' + window.location.host + '/' + webName + '/';
    // var url = BaseUrl + "loginWinxinSns.do";
    var url = "http://aid-wx.b2byw.com/tttweb/" + "loginWinxinSns.do";

    var currentBaseUrl = '${baseurl}'

    var wwLogin = new WwLogin({
        "id": "login_container",
        "appid": "ww05b2761ec1558dab",
        "agentid": "1000002",
        "redirect_uri": url,
        "state": "abcdefghij",
        "href": "data:text/css;base64,LmltcG93ZXJCb3ggLnFyY29kZSB7d2lkdGg6IDIwMHB4O30KLmltcG93ZXJCb3ggLnRpdGxlIHtkaXNwbGF5OiBub25lO30KLmltcG93ZXJCb3ggLmluZm8ge3dpZHRoOiAyMDBweDt9Ci5zdGF0dXNfaWNvbiB7ZGlzcGxheTogbm9uZX0KLmltcG93ZXJCb3ggLnN0YXR1cyB7dGV4dC1hbGlnbjogY2VudGVyO30=",
        "lang": "zh",
    });

    $("#JumpToLogin").click(function() {
        window.location.href = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=ww05b2761ec1558dab" +
            "&response_type=code&scope=snsapi_base&state=abcdefghij&agentid=1000002#wechat_redirect" +
            "&redirect_uri=" + url;
    })

</script>
</html>