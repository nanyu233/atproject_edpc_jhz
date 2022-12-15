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
    <link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/loginhzszyy.css">

    <script src="https://g.alicdn.com/dingding/dingtalk-jsapi/3.0.12/dingtalk.open.js"></script>
    <script src="https://g.alicdn.com/dingding/dinglogin/0.0.5/ddLogin.js"></script>

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

<%--<button type="button" class="btn btn-primary" id="JumpToLogin">跳转登录</button>--%>
</body>
<script type="text/javascript">
    var pathName = window.location.pathname.substring(1);
    var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
    var BaseUrl = window.location.protocol + '//' + window.location.host + '/' + webName + '/';
    var url = BaseUrl + "loginDingSns.do";

    var currentBaseUrl = '${baseurl}'
    var _config = <%= activetech.base.util.DingTalkUtil.getConfig(request) %>;
    console.log(_config)
    // 免登不需要鉴权
    // dd.config({
    //     agentId : _config.agentId,
    //     corpId : _config.corpId,
    //     timeStamp : _config.timeStamp,
    //     nonceStr : _config.nonceStr,
    //     signature : _config.signature,
    //     type:0, //0表示H5微应用的jsapi。
    //     jsApiList : []//需要鉴权的jsapi方法在此传入，不需要鉴权的方法不传。
    // });

    // https://oapi.dingtalk.com/connect/qrconnect?appid=appid&response_type=code&scope=snsapi_login&state=LoginDing&redirect_uri=http://localhost:5000/Home/DingLogin

    dd.runtime.permission.requestAuthCode({
        corpId: _config.corpId,
        onSuccess: function(result) {
            publicFun.httpServer({url: currentBaseUrl + 'loginDing.do?hospitalCategory=1', crossMsg: 'cross'}, {
                authCode: result.code
            }, function (data) {
                if (data.resultInfo.type === '1' || data.resultInfo.type === 1) {
                    var reqUrl = currentBaseUrl + 'icuscore/queryIcuBasicDef.do';
                    publicFun.httpServer({url: reqUrl}, {}, function (res) {
                        if (res.resultInfo.success) {
                            var dictData = res.resultInfo.sysdata;
                            publicFun.setItem('icuDic', dictData);
                        }
                    });
                    publicFun.httpServer({
                        url: currentBaseUrl + 'dict/allDictInfo.do',
                        isNoLoad: true,
                        crossMsg: 'cross'
                    }, {}, function (res) {
                        try {
                            publicFun.setItem("allDict", res);
                        } catch (e) {
                        }
                        toFirst();
                    })
                }  else {
                    showCheckMsg(data.resultInfo.message);
                }
            })

        },
        onFail : function(err) {
        }
    })

    function toFirst() { // 回到首页
        var _location = currentBaseUrl + 'first.do?d=' + new Date().getTime();
        if (parent.parent.parent) {
            //让最外层页面执行跳转
            parent.parent.parent.location = _location;
        } else if (parent.parent) {
            parent.parent.location = _location;
        } else if (parent) {
            parent.location = _location;
        } else {
            window.location = _location;
        }
    }

    function showCheckMsg (msg) { // 登录出错显示的信息
        this.$refs.checkIcon.style.display = 'inline-block';
        this.$refs.checkIcon.className = 'add-error check-icon';
        this.$refs.checkss.style.display = 'inline-block';
        this.$refs.checkss.innerText = msg;
    }

    var obj = DDLogin({
        id: "login_container",//这里需要你在自己的页面定义一个HTML标签并设置id，例如<div id="login_container"></div>或<span id="login_container"></span>
        goto: encodeURIComponent('https://oapi.dingtalk.com/connect/oauth2/sns_authorize?appid=dingdgiew8i5xy4jdlgs&response_type=code&scope=snsapi_login&state=STATE&redirect_uri=' + url), //请参考注释里的方式
        style: "border:none;background-color:#FFFFFF;",
        width: "300",
        height: "300"
    });

    var handleMessage = function (event) {
        var origin = event.origin;
        console.log("origin", event.origin);
        if (origin == "https://login.dingtalk.com") { //判断是否来自ddLogin扫码事件。
            var loginTmpCode = event.data; //拿到loginTmpCode后就可以在这里构造跳转链接进行跳转了
            console.log("loginTmpCode", loginTmpCode);
            window.location.href =
                "https://oapi.dingtalk.com/connect/oauth2/sns_authorize?appid=dingdgiew8i5xy4jdlgs&response_type=code&scope=snsapi_login&state=STATE&redirect_uri=REDIRECT_URI&loginTmpCode=" +
                loginTmpCode;
        }
    };
    if (typeof window.addEventListener != 'undefined') {
        window.addEventListener('message', handleMessage, false);
    } else if (typeof window.attachEvent != 'undefined') {
        window.attachEvent('onmessage', handleMessage);
    }
    $("#JumpToLogin").click(function(){
        window.location.href =
            "https://oapi.dingtalk.com/connect/qrconnect?appid=dingdgiew8i5xy4jdlgs&&response_type=code&scope=snsapi_login&state=LoginDing&redirect_uri="+url;
    });
</script>
</html>