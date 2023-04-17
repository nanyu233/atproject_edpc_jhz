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
    <script type="text/javascript">
        document.onkeydown = function (evt) {
            publicFun.keyDownRecall(evt, function () {
                var flg = true;
                if ($("#password").is(":focus")) {
                    vm.loginSubmit();
                    flg = false;
                }
                return flg;
            })
        };
    </script>

    <script src="https://g.alicdn.com/dingding/h5-dingtalk-login/0.21.0/ddlogin.js"></script>
    <style>
        /* STEP2：指定这个包裹容器元素的CSS样式，尤其注意宽高的设置 */
        .self-defined-classname {
            margin-left: 20px;
        }
        .hidden {
            display: none;
        }
        input[type=radio] {
            vertical-align: middle;
        }
    </style>

</head>

<body class="login-bg">
<form id="loginWrap">
    <div class="login-box">
        <div class="login-boximage">
            <div class="login-title">${hospitalPlatformNameLogin}</div>
            <div class="login-txt">
<%--                <div class="log-tip">--%>
<%--                  <a :class="{active: loginType == 1}" @click="setLoginTyp('1')">账号登陆</a>--%>
<%--                  <a :class="{active: loginType == 2}" @click="setLoginTyp('2')">钉钉扫码登陆</a>--%>
<%--                </div>--%>
                <label>
                    <div class="log-text">院&emsp;区</div>
                    <label for="sd" class="small-label">
                        <input type="radio" name="hospitalCategory" value="1" id="sd"
                               v-model = "msg.hospitalCategory"> 本院
                    </label>
                    <label for="ly" class="small-label hidden">
                        <input  type="radio" name="hospitalCategory" value="2" id="ly"
                                v-model = "msg.hospitalCategory"> 灵隐
                    </label>
                </label>
                <div class="log-div" v-show="loginType == 1">
                    <label>
                        <div class="log-text">用户名</div>
                        <input type="text" class="txt uname userinput" v-model="msg.userId" autocomplete="off"/>
                    </label>
                    <label>
                        <div class="log-text">密&emsp;码</div>
                        <input type="password" class="txt pwd pwdinput" v-model="msg.password" id="password"
                            autocomplete="off"/>
                    </label>
                    <div class="log-check lochck">
                        <span class="check-icon" ref="checkIcon"></span>
                        <span class="checkss" ref="checkss"></span>
                    </div>
                    <div class="login-btn">
                        <div class="lgright" align="right">
                            <input name="登录" type="button" class="ok-btn lg_btn" value="登录" @click="loginSubmit()">
                        </div>
                        <div class="lgleft" align="left">
                            <input type="button" class="set-btn m-l10 reset-btn" value="重置" @click="clearInput()">
                        </div>
                    </div>
                </div>
                <div class="log-div" v-show="loginType == 2">
                    <div id="self_defined_element" class="self-defined-classname"></div>
                </div>
            </div>
        </div>
    </div>


</form>
<script>
    var currentBaseUrl = '${baseurl}';
    var appKey = "";
    var vm = new Vue({
        el: '#loginWrap',
        data: {
            msg: {
                userId: '',
                password: '',
                hospitalCategory: '1'
            },
            loginType: '1' ,// 1是 账号 2 是钉钉
        },
        watch: {
            'msg.hospitalCategory'(newVal, oldVal) {
                if(this.loginType==2){
                    this.generateQr(newVal);
                }
            }
        },
        methods: {
            loginSubmit: function () {
                if (this.msg.userId === '' || this.msg.password === '') {
                    this.showCheckMsg('用户名与密码不能为空！');
                    return;
                }
                var hospitalCategory = this.msg.hospitalCategory;
                // if (!hospitalCategory) {
                //     this.showCheckMsg('请选择院区!');
                //     return;
                // }
                this.doLogin(hospitalCategory);
            },
            doLogin: function (hospitalCategory) {
                var baseParam = {
                    url: currentBaseUrl + 'loginsubmit.do?hospitalCategory=' + hospitalCategory,
                    crossMsg: 'cross'
                };
                var param = {
                    userid: this.msg.userId,
                    pwd: this.msg.password
                }
                publicFun.httpServer(baseParam, param , function (data) {
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
                                // console.error('无法存储数据')
                            }
                            vm.toFirst();
                        })

                    }else if (data.resultInfo.messageCode === 115) {
                        let usrno = data.resultInfo.sysdata.dstuser.usrno
                        let usrname = data.resultInfo.sysdata.dstuser.usrno
                        vm.showCheckMsg(data.resultInfo.message);
                        setTimeout(() => {
                            createmodalwindow("修改密码", 510, 240, '${baseurl}user/updatepwd.do?usrno=' + usrno + '&usrname=' + usrname);
                        }, 1000)
                    }  else {
                        vm.showCheckMsg(data.resultInfo.message);
                    }
                })
            },
            setLoginTyp: function (val) {
                this.loginType = val;
                if(val == 2){
                    // 获取到登录院区
                    var hospitalCategory = this.msg.hospitalCategory;
                    // if (!hospitalCategory) {
                    //     this.showCheckMsg('请选择院区!');
                    //     return;
                    // }
                    vm.generateQr(hospitalCategory);
                }
            },
            generateQr: function (state){
                window.DTFrameLogin(
                    {
                        id: 'self_defined_element',
                        width: 250,
                        height: 250,
                    },
                    {
                        redirect_uri: encodeURIComponent('http://123.157.217.203:8700/edpc/auth.do'),
                        client_id: appKey,
                        scope: 'openid',
                        response_type: 'code',
                        state: state,
                        prompt: 'consent',
                    },
                    (loginResult) => {
                        const {redirectUrl, authCode, state} = loginResult;
                        // 这里可以直接进行重定向
                        window.location.href = redirectUrl;
                        // 也可以在不跳转页面的情况下，使用code进行授权
                        console.log(authCode);
                    },
                    (errorMsg) => {
                        // 这里一般需要展示登录失败的具体原因
                        alert(`Login Error: ${errorMsg}`);
                    },
                );
            },
            clearInput: function () { // 清空输入框
                this.msg.userId = '';
                this.msg.password = '';
            },
            showCheckMsg: function (msg) { // 登录出错显示的信息
                this.$refs.checkIcon.style.display = 'inline-block';
                this.$refs.checkIcon.className = 'add-error check-icon';
                this.$refs.checkss.style.display = 'inline-block';
                this.$refs.checkss.innerText = msg;
            },
            toFirst: function () { // 回到首页
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
        }
    })
</script>

<script>

    function getAppKey(){
        publicFun.httpRequest("getAppKey.do", null, function (res) {
            if (!res.resultInfo.success) {
                alert_error('请求失败，请联系管理员');
                return;
            }
            appKey = res.resultInfo.sysdata.appKey;
        })
    }


    $(function (){
        getAppKey();
    })

</script>
</body>

</html>
