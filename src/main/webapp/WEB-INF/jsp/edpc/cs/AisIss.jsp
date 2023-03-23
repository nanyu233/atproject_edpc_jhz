<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%--<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'csSbList.jsp' starting page</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
</head>
<style>
    .page {
        background: #ffffff;
        width: 100%;
        height: 100%;
        display: flex;
        flex-direction: column;
    }

    .head {
        flex: none;
        display: flex;
        justify-content: space-around;
        align-items: center;
        border-bottom: 1px solid #cccccc;
        height: 45px;
    }

    .head .bdPart {
        text-align: center;
        width: 15%;
        position: relative;
    }

    .head .bdPart .checkIcon {
        position: absolute;
        top: -8px;
        right: -15px;
        font-size: 14px;
    }

    .head .activePart {
        font-weight: bold;
        color:#22a8aa;
    }

    .main {
        height: 0;
        flex: 1;
        display: flex;
        justify-content: space-between;
    }

    .main .left {
        display: flex;
        flex-direction: column;
        width: 22%;
        height: 100%;
        background: #F7F7F7;
        border-right: 2px solid #ccc;
    }

    .main .left .partItem {
        flex: 1;
        position: relative;
        width: 100%;
        height: 0;
        text-align: center;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .main .left .partItem:not(:last-child) {
        border-bottom: 1px solid #cccccc;
    }

    .main .left .partItem view {
        width: 90%;
    }

    .main .left .partItem .subCheckIcon {
        position: absolute;
        bottom: -5px;
        right: 0;
        font-weight: bold;
    }

    .main .left .activeItem {
        background: #ffffff;
        color: #22a8aa;
    }

    .main .right {
        width: 78%;
        height: 100%;
        overflow-y: scroll;
    }

    .main .right .title {
        padding-left: 15px;
    }

    .main .right .opt {
        border-bottom: 1px solid #ccc;
        padding: 15px;
        height: 12%;
    }

    .main .right .opt .desc {
        color: #666666;
    }

    .main .right .opt .sel {
        display: flex;
        align-items: center;
        justify-content: space-between;
        padding-right: 15px;
        margin-top: 10px;
        font-size: 18px;
    }

    .main .right .opt .sel .score {
        color: #22a8aa;
    }

    .main .right .opt .sel .selBtn {
        font-size: 20px;
        font-weight: bold;
    }

    .foot {
        flex: none;
        height: 45px;
        width: 100%;
        bottom: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        border-top: 1px solid #cccccc;
        background: #F7F7F7;
    }

    .foot .finishBtn {
        width: 330px;
        text-align: center;
        height: 30px;
        line-height: 30px;
        background: #22a8aa;
        color: #ffffff;
        border-radius: 27px;
    }
    .activebck{
        background: #ccc;
    }
    i{
        font-size: 18px;
    }


</style>
<body>
<div id="ais">
    <div class="page">
        <div class="head">
            <div v-for="(item,index) in body" @click="partChange(item.prtItem)"
                 :class="' bdPart '+(currPrt.prtItem == item.prtItem ? 'activePart':'')" :key="item.prtItem">
                {{item.prtName}}
                <i  v-if="item.hasChecked">*</i>
            </div>
        </div>
        <div class="main">
            <div class="left">
                <div v-for="(itm,index) in currPrt.prtList" @click="optChange(itm.subItem)"
                     :class="'partItem '+(currOpt.subItem == itm.subItem ? 'activeItem':'')" :key="itm.subItem">
                    <div>{{itm.subName}}</div>
                    <i  v-if="itm.hasChecked">*</i>
                </div>
            </div>
            <div class="right">
                <div class="title">选项</div>
                <div v-for="(ite,index) in currOpt.subList" @click="selctOption(ite.optCode,index)" class="opt"
                     :key="ite.optCode" :class="' bck '+(ite.checked ? 'activebck':'')">
                    <div class="desc">{{ite.optName}}</div>
                    <div class="sel">
                        <div class="score">{{ite.optScoe}}分</div>
                        <div v-if="!ite.checked" class="iconfont icon-unselect selBtn"></div>
                        <div v-else class="iconfont icon-selected selBtn"></div>
                    </div>
                </div>
            </div>
        </div>
        <div class="foot">
            <div class="finishBtn" @click="finish">完成</div>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
<script>
    var _emgSeq = "${emgSeq}";
    var vm = new Vue({
        el: '#ais',
        data: {
            body: [],
            resArr: [],// 选中的评分项数组
            currPrt: {
                prtItem: "H"
            },
            currOpt: {},
        },
        methods: {
            getList() {
                var that=this
                $.ajax({
                    url: '${baseurl}cs/getHspCsfDef.do',
                    type: 'post',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify({
                        emgSeq: _emgSeq,
                    }),
                    success: function (res) {
                        that.body = res.resultInfo.sysdata.body
                        that.body.forEach(item => {
                            item.hasChecked = false
                            item.prtList.forEach(items => {
                                items.hasChecked = false
                                items.subList.forEach(item2 => {
                                    if (item2.checked) {
                                        items.hasChecked = true
                                        item.hasChecked = true
                                    }
                                })
                            })
                        })
                        that.resArr = res.resultInfo.sysdata.hadChecked;
                        that.partChange("A")
                    }
                });
            },
            finish:function(){
                var that=this
                $.ajax({
                    url: '${baseurl}cs/addHspCspfDtl.do',
                    type: 'post',
                    dataType: 'json',
                    contentType: 'application/json;charset=UTF-8',
                    data: JSON.stringify({
                        emgSeq: _emgSeq,
                        list: that.resArr
                    }),
                    success: function (res) {
                        if (res.resultInfo.success) {
                            $.messager.alert('消息提示', '数据保存成功!', 'info');
                        } else {
                            $.messager.alert('消息提示', '数据保存失败!', 'error');
                        }
                            parent.closemodalwindow()
                            parent.sub.getISSSco()

                    }
                });
            },
            partChange: function (id) {
                var that=this
                let partItem = id;
                let _body = that.body;
                for (let i = 0; i < _body.length; i++) {
                    const el = _body[i];
                    if (el.prtItem == partItem) {
                        that.currPrt = el
                        that.currOpt = el.prtList[0]
                        break;
                    }
                }
            },
            optChange: function (id) {
                var that=this
                let subItem = id;
                let _prtList = that.currPrt.prtList;
                for (let i = 0; i < _prtList.length; i++) {
                    const el = _prtList[i];
                    if (el.subItem == subItem) {
                        that.currOpt = el
                        break;
                    }
                }
            },
            selctOption: function (id, idx) {
                var that=this
                let optCode = id;
                let optArr = that.currOpt.subList;
                let currPrtItem = that.currPrt.prtItem;
                let currSubItem = that.currOpt.subItem;


                for (let i = 0; i < optArr.length; i++) {
                    if (i == idx) {
                        optArr[i].checked = !optArr[i].checked
                    } else {
                        optArr[i].checked = false
                    }

                }
                // optArr[idx].checked=!optArr[idx].checked
                if (optArr[idx].optCode == optCode) {
                    if (optArr[idx].checked == true) {
                        that.addResArr(optArr[idx].optCode, optArr[idx].optScoe);
                    } else {
                        that.reduceResArr(currPrtItem, currSubItem, optArr[idx].optCode);

                    }
                }
                that.dealIconBySel();
            },
            /**
             * 点击评分项时，处理左侧菜单栏和顶部菜单栏中菜单块右上角图标的展示与隐藏
             */
            dealIconBySel: function () {
                var that=this
                let _body = that.body;
                let _currPart = that.currPrt;
                let _currOpt = that.currOpt;

                const _subList = _currOpt.subList;
                let checkedOpts = 0;
                for (let i = 0; i < _subList.length; i++) {
                    const el = _subList[i];
                    if (el.checked) checkedOpts++;
                }
                checkedOpts > 0 ? _currOpt.hasChecked = true : _currOpt.hasChecked = false;

                const _prtList = _currPart.prtList;
                let checkedPrts = 0;
                for (let i = 0; i < _prtList.length; i++) {
                    const el = _prtList[i];
                    if (el.hasChecked) checkedPrts++;
                }
                checkedPrts > 0 ? _currPart.hasChecked = true : _currPart.hasChecked = false;
                that.body = _body, //渲染顶部菜单项的true或false
                    that.currPrt = _currPart //渲染左侧菜单项的true或false

            },
            /**
             * 从选中的评分项数组中删除旧数据
             */
            reduceResArr: function (partItem, subItem, code) {
                var that=this
                let resArr = that.resArr;
                for (let i = 0; i < resArr.length; i++) {
                    const el = resArr[i];
                    if (el.optCode == code && el.prtItem == partItem && el.subItem == subItem) {
                        resArr.splice(i, 1);
                        break;
                    }
                }
                that.resArr = resArr;
            },
            /**
             * 向选中的评分项数组中添加新数据
             */
            addResArr: function (code, score) {
                var that=this
                let _prtItem = that.currPrt.prtItem;
                let _subItem = that.currOpt.subItem;
                if (that.resArr.length) {
                    for (var i = 0; i < that.resArr.length; i++) {
                        if (that.resArr[i].prtItem == _prtItem && that.resArr[i].subItem == _subItem) {
                            that.resArr.splice(i, 1)
                        }
                    }
                }
                let _resArr = that.resArr;
                _resArr.push({prtItem: _prtItem, subItem: _subItem, optCode: code, optScoe: score});
                that.resArr = _resArr;

            },
        },
        created() {
            this.getList()
        }
    })
</script>
</html>
