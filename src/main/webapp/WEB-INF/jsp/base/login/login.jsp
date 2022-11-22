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
</head>

<body class="login-bg">
<form id="loginWrap">
    <div class="login-box">
        <div class="login-boximage">
            <div class="login-title">${hospitalPlatformNameLogin}</div>
            <div class="login-txt">
                <label>
                    <div class="log-text">院&emsp;区</div>
                    <label for="ly" class="small-label">
                        <input type="radio" name="hospitalArea" value="1" id="ly"> 三墩
                    </label>
                    <label for="yq" class="small-label">
                        <!-- disabled 目前先变灰不能选--灵隐还没开放 -->
                        <input  type="radio" name="hospitalArea" value="2" id="yq"> 灵隐
                    </label>
                </label>
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
        </div>
    </div>
</form>
<script>
    var currentBaseUrl = '';
    var vm = new Vue({
        el: '#loginWrap',
        data: {
            msg: {
                userId: '',
                password: ''
            }
        },
        methods: {
            loginSubmit: function () {
                if (this.msg.userId === '' || this.msg.password === '') {
                    this.showCheckMsg('用户名与密码不能为空！');
                } else {
                    this.setMsg()
                }
            },
            setMsg: function () { // 提交数据
                var areaVal = $('input[name="hospitalArea"]:checked').val(), loginUrl = '';
                if (areaVal !== '1' && areaVal !== '2') {
                    // publicFun.alert('请选择院区!');
                    vm.showCheckMsg('请选择院区!');
                    return false;
                }
                if (areaVal === '2') {
                    //灵隐
                    // currentBaseUrl = 'http://192.168.12.218:8080/atproject/'
                    currentBaseUrl = '${baseurl}'
                } else {
                    //三墩
                    currentBaseUrl = '${baseurl}'
                }
                publicFun.httpServer({url: currentBaseUrl + 'loginsubmit.do?hospitalCategory=' + areaVal, crossMsg: 'cross'}, {
                    userid: this.msg.userId,
                    pwd: this.msg.password
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
</body>

</html>