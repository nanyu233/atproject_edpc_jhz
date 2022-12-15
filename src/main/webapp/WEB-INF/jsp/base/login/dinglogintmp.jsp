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
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
</head>

<body class="login-bg">
系统登陆中，请稍后...
<script>
    var currentBaseUrl = '${baseurl}';
    function init() {
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
                // console.error('无法存储数据')
            }
            toFirst();
        })
    }

    function showCheckMsg(msg) { // 登录出错显示的信息
        this.$refs.checkIcon.style.display = 'inline-block';
        this.$refs.checkIcon.className = 'add-error check-icon';
        this.$refs.checkss.style.display = 'inline-block';
        this.$refs.checkss.innerText = msg;
    }

    function toFirst(){ // 回到首页
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

    $(function () {
        init();
    })

</script>
</body>

</html>