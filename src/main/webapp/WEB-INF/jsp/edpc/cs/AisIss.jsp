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
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/insdep/iconfont/iconfont.css" />
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
        height: 7%;
    }

    .head .bdPart {
        text-align: center;
        width: 15%;
        height: 100%;
        line-height: 35px;
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
        color:#ffffff;
        background: #22a8aa;
    }
    .head .left {
        width: 15%;
        font-size: 12px;
        font-weight: 600;
    }
    .head .right {
        width: 85%;
        height: 100%;
        display: flex;
        justify-content: space-around;
        align-items: center;
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
    .isssco i, .aissco i {
        display: inline-block;
        height: 80%;
        width: 5px;
        background: #22a8aa;
        border-radius: 5px;
        margin: 0 5px;
    }

    .main .left .activeItem {
        background: #22a8aa;
        color: #ffffff;
    }

    .main .right {
        width: 78%;
        height: 100%;
    }
    .isssco, .aissco {
        height: 50%;
        display: flex;
        align-items: center;
    }

    .isssco span, .aissco span {
        width: 85px;
        text-align: left;
    }

    .numsco {
        font-weight: 600;
        color: #22a8aa;
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
        font-size:40px;
        font-weight: bold;
        color: #22a8aa;
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
            <div class="left">
                <div class="isssco">
                    <i></i>
                    <span>ISS总分:</span>
                    <span class="numsco">{{isssco}}</span>
                </div>
                <div class="aissco">
                    <i></i>
                    <span>AIS最大值:</span>
                    <span class="numsco">{{aissco}}</span>
                </div>
            </div>
            <div class="right">
                <div v-for="(item,index) in body" @click="partChange(item.prtItem)"
                     :class="' bdPart '+(currPrt.prtItem == item.prtItem ? 'activePart':'')" :key="item.prtItem">
                    {{item.prtName}}
                    <i v-if="item.hasChecked">*({{item.maxoptScoe}}分)</i>
                </div>
            </div>
        </div>
        <div class="main">
            <div class="left">
                <div v-for="(itm,index) in currPrt.prtList" @click="optChange(itm.subItem)"
                     :class="'partItem '+(currOpt.subItem == itm.subItem ? 'activeItem':'')" :key="itm.subItem">
                    <div>{{itm.subName}}</div>
                    <i v-if="itm.hasChecked">*({{itm.optScoe}}分)</i>
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
            aissco: 0,
            isssco: 0,
            scolist: [],
            subItem: '01',
            prtItem: 'A'
        },
        watch: {
            resArr: {
                handler: function(newV, oldV) {
                    var newArr = JSON.parse(JSON.stringify(newV))
                    if (newV.length > 1) {
                        this.aissco = Math.max(...newV.map(item => {
                            return item.optScoe
                        }))
                    } else if (newV.length === 1) {
                        this.aissco = newV[0].optScoe
                    }else {
                        this.aissco = 0
                    }
                    var obj = {}
                    var sortArr = newArr.sort((a, b) => {
                        return b.optScoe - a.optScoe
                    }).reduce(function(item, next) {
                        obj[next.prtItem] ? '' : obj[next.prtItem] = true && item.push(next);
                        return item;
                    }, [])
                    this.isssco = 0
                    sortArr.forEach((item, index) => {
                        if (index < 3) {
                            this.isssco += Math.pow(item.optScoe, 2)
                        }
                    })
                },
                deep: true
            }
        },
        methods: {
            getList() {
                var that = this
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

                        that.body.forEach(function(item) {
                            item.hasChecked = false
                            item.prtList.forEach(function(items)  {
                                items.hasChecked = false
                                items.subList.forEach(function(item2) {
                                    if (item2.checked) {
                                        items.hasChecked = true
                                        items.optScoe = item2.optScoe
                                        item.hasChecked = true
                                        item.maxoptScoe = that.getMaxSco(item.prtList)

                                    }
                                })
                            })
                        })
                        if(res.resultInfo.sysdata){
                            if(res.resultInfo.sysdata.hadChecked){
                                that.resArr = res.resultInfo.sysdata.hadChecked;
                            }
                            // if(res.resultInfo.sysdata.hspCspfRes){
                            //     that.isssco=res.resultInfo.sysdata.hspCspfRes.issScoe
                            // }
                            // if(res.resultInfo.sysdata.hspCspfRes){
                            //     that.aissco=res.resultInfo.sysdata.hspCspfRes.aisScoe
                            // }
                        }
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
                            $.messager.alert('消息提示', '数据保存成功!', 'success');
                        } else {
                            $.messager.alert('消息提示', '数据保存失败!', 'error');
                        }
                        parent.closemodalwindow()
                        if (parent.sub) {
                            parent.sub.getISSSco()
                        }

                    }
                });
            },
            partChange: function (id) {
                var that = this
                var partItem = id;
                this.prtItem = id
                if (this.prtItem === 'H') {
                    this.subItem = '03'
                }else {
                    this.subItem = '01'
                }

                var _body = that.body;
                for (var i = 0; i < _body.length; i++) {
                    var el = _body[i];
                    if (el.prtItem == partItem) {
                        that.currPrt = el
                        that.currOpt = el.prtList[0]
                        break;
                    }
                }
            },
            optChange: function (id) {
                var that = this
                var subItem = id;
                this.subItem = id
                var _prtList = that.currPrt.prtList;
                for (var i = 0; i < _prtList.length; i++) {
                    var el = _prtList[i];
                    if (el.subItem == subItem) {
                        that.currOpt = el
                        break;
                    }
                }
            },
            selctOption: function (id, idx) {
                var optCode = id;
                var optArr = this.currOpt.subList;
                var currPrtItem = this.currPrt.prtItem;
                var currSubItem = this.currOpt.subItem;
                for (var i = 0; i < optArr.length; i++) {
                    if (i == idx) {
                        optArr[i].checked = !optArr[i].checked
                    } else {
                        optArr[i].checked = false
                    }

                }
                // optArr[idx].checked=!optArr[idx].checked
                if (optArr[idx].optCode == optCode) {
                    if (optArr[idx].checked == true) {
                        this.addResArr(optArr[idx].optCode, optArr[idx].optScoe);
                    } else {
                        this.reduceResArr(currPrtItem, currSubItem, optArr[idx].optCode);

                    }
                }
                this.dealIconBySel();
            },
            /**
             * @param {array} arr
             */
            getMaxSco: function (arr) {
               var arrList = arr.filter(item => {
                   return item.hasChecked === true
               }).sort((a, b) => {
                    return b.optScoe - a.optScoe
                })
                if (arrList.length > 0) {
                    return arrList[0].optScoe
                }else {
                    return 0
                }

            },
            /**
             * 点击评分项时，处理左侧菜单栏和顶部菜单栏中菜单块右上角图标的展示与隐藏
             */
            dealIconBySel: function () {
                var that = this
                var _body = that.body;
                var _currPart = that.currPrt;
                var _currOpt = that.currOpt;
                var _subList = _currOpt.subList;
                var _prtList = _currPart.prtList;
                var checkedOpts = 0;

                for (var i = 0; i < _subList.length; i++) {
                    var el = _subList[i];
                    if (el.checked) checkedOpts++;
                }
                checkedOpts > 0 ? _currOpt.hasChecked = true : _currOpt.hasChecked = false;


                var checkedPrts = 0;

                var optScoeList = _subList.filter(item => {
                    return item.checked === true
                })
                optScoeList.length > 0 ? optScoe = optScoeList[0].optScoe : optScoe = 0

                for (var i = 0; i < _prtList.length; i++) {
                    var el = _prtList[i];
                    if (el.subItem === this.subItem) {
                        el['optScoe'] = optScoe
                    }
                    if (el.hasChecked) checkedPrts++;
                }
                checkedPrts > 0 ? _currPart.hasChecked = true : _currPart.hasChecked = false;

                _body.forEach(function (item) {
                    if (item.prtItem === that.prtItem) {
                        item['maxoptScoe'] = that.getMaxSco(_prtList)
                    }
                })

                that.body = _body, //渲染顶部菜单项的true或false
                    that.currPrt = _currPart //渲染左侧菜单项的true或false
                console.log(this.body)

            },
            /**
             * 从选中的评分项数组中删除旧数据
             */
            reduceResArr: function (partItem, subItem, code) {
                var that = this
                var resArr = that.resArr;
                for (var i = 0; i < resArr.length; i++) {
                    var el = resArr[i];
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
                var _prtItem = this.currPrt.prtItem;
                var _subItem = this.currOpt.subItem;

                if (this.resArr.length) {
                    for (var i = 0; i < this.resArr.length; i++) {
                        if (this.resArr[i].prtItem == _prtItem && this.resArr[i].subItem == _subItem) {
                            this.resArr.splice(i, 1)
                        }
                    }
                }
                var _resArr = this.resArr;

                _resArr.push({
                    prtItem: _prtItem,
                    subItem: _subItem,
                    optCode: code,
                    optScoe: score
                });
                this.resArr = _resArr;

            },
        },
        created() {
            this.getList()
        }
    })
</script>
</html>
