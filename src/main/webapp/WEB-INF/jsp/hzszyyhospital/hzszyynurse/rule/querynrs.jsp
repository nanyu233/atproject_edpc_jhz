<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>NRS评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="querynrs">
    <div class="nrs_container" id="queryNrs" v-cloak>
        <p class="box_title box_p_bottom">NRS评分</p>
        <!-- <a v-for="(el, index) in ['00','01','02','03','04','05','06','07','08','09','10']" :class="['face', 'face-' + el, {active: index == painQk.nrsSco}]" href="javascript:;" @click="chooseAche(el)"></a> -->
        <div class="content_div con_pos">
            <label class="nrstitle nrsSpc">NRS评分：</label>
            <div class="nrsDiv">
                <a v-for="(el, index) in ['00','01','02','03','04','05','06','07','08','09','10']" class="face" :class="['face', 'face-' + el, {active: index == painQk.nrsSco}]" href="javascript:;" @click="chooseAche(index)"></a>
            </div>
        </div>
        <!-- <div class="content_div con_pos">
            <label class="nrstitle">疼痛部位：</label>
            <div class="nrsDiv">
                <label v-for="el in getMsg.nrsTtbwList" :for="'nrsTtbw' + el.infocode">
                    <input :id="'nrsTtbw' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.nrsTtbw" @change="checkClick('nrsTtbw')" />
                    <span class="content_span">{{el.info}}</span>
                </label>
                其他：<input type="text" maxlength="20" v-model="painQk.nrsTtbwQt" class="qtinput">
            </div>
        </div>
        <div class="content_div">
            <label class="nrstitle">疼痛性质：</label>
            <div class="nrsDiv">
                <label v-for="el in getMsg.nrsTtxzList" :for="'nrsTtxz' + el.infocode">
                    <input :id="'nrsTtxz' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.nrsTtxz" @change="checkClick('nrsTtxz')" />
                    <span class="content_span">{{el.info}}</span>
                </label>
                其他：<input type="text" maxlength="20" v-model="painQk.nrsTtxzQt" class="qtinput">
            </div>
        </div>
        <div class="content_div">
            <label class="nrstitle">疼痛时间：</label>
            <div class="nrsDiv">
                <label v-for="(el, index) in getMsg.nrsTtsjList" :for="'nrsTtsj' + el.infocode">
                    <input :id="'nrsTtsj' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.nrsTtsj" @change="radioClick(index,'nrsTtsj')" />
                    <span class="content_span">{{el.info}}</span>
                </label>
            </div>
        </div>
        <div class="content_div">
            <label class="nrstitle">疼痛控制：</label>
            <div class="nrsDiv">
                <label v-for="el in getMsg.nrsTtkzList" :for="'nrsTtkz' + el.infocode">
                    <input :id="'nrsTtkz' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.nrsTtkz" @change="checkClick('nrsTtkz')" />
                    <span class="content_span">{{el.info}}</span>
                </label>
            </div>
        </div>
        <div class="content_div">
            <label class="nrstitle">备注：</label>
            <input type="text" maxlength="20" v-model="painQk.nrsMemo" class="remarkinput">
        </div>
        -->
        <div class="score_div" id="emg_paiLvlCod"><span>分值：</span><i>{{painQk.nrsSco}}</i></div>
        <div class="grp_btn">
            <a id="submitBtn" class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillMsg()">确定</a>
            <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</body>
<script type="text/javascript">
    var e_nrsTtbwQt = parent.$("#emg_nrsTtbwQt").val();
    var e_nrsTtxzQt = parent.$("#emg_nrsTtxzQt").val();
    var e_nrsSco = parent.$("#emg_nrsSco").val();
    var e_nrsMemo = parent.$("#emg_nrsMemo").val();
    var nrsMsg = {
        e_nrsTtbw: parent.$("#emg_nrsTtbw").val(),
        e_nrsTtxz: parent.$("#emg_nrsTtxz").val(),
        e_nrsTtsj: parent.$("#emg_nrsTtsj").val(),
        e_nrsTtkz: parent.$("#emg_nrsTtkz").val()
    }
    var msgCodList = ['nrsTtbw', 'nrsTtxz', 'nrsTtsj', 'nrsTtkz'];
    msgCodList.map(function (ele) {
        if (nrsMsg['e_' + ele]) {
            nrsMsg['e_' + ele] = nrsMsg['e_' + ele].split(',');
        } else {
            nrsMsg['e_' + ele] = []
        }
    })
    var vm = new Vue({
        el: "#queryNrs",
        data: function () {
            return {
                getMsg: {
                    nrsTtbwList: [], //疼痛部位
                    nrsTtxzList: [], //疼痛性质
                    nrsTtsjList: [], //疼痛时间
                    nrsTtkzList: []  //疼痛控制
                },
                painQk: {
                    nrsTtbw: parent.$("#emg_nrsTtbw").val() || '', //疼痛部位[]
                    nrsTtbwQt: '' || e_nrsTtbwQt,//疼痛部位其他
                    nrsTtxz: parent.$("#emg_nrsTtxz").val() || '',//疼痛性质[]
                    nrsTtxzQt: '' || e_nrsTtxzQt,//疼痛性质其他 
                    nrsTtsj: parent.$("#emg_nrsTtsj").val() || '', //疼痛时间 
                    nrsTtkz: parent.$("#emg_nrsTtkz").val() || '', //疼痛控制
                    nrsSco: e_nrsSco || null, //NRS评分
                    nrsMemo: '' || e_nrsMemo//备注
                },
                hideMsg: {
                  nrsTtbw: nrsMsg.e_nrsTtbw || [], //疼痛部位[]  
                  nrsTtxz: nrsMsg.e_nrsTtxz || [],//疼痛性质[]
                  nrsTtsj: nrsMsg.e_nrsTtsj || [], //疼痛时间 
                  nrsTtkz: nrsMsg.e_nrsTtkz || [] //疼痛控制
                }
            }
        },
        mounted: function () {
            this.$nextTick(function () {
                this.getMsgList();
                if (parent.setIframeDivHeight) {
                    $('#submitBtn').hide()
                } else {
                    $('#submitBtn').show()
                }
            })
        },
        methods: {
            getMsgList: function () {
                var _res = parent.jsbrjz;
                for (var i in _res) {
                    if (vm.getMsg.hasOwnProperty(i)) {
                        vm.getMsg[i] = _res[i]
                    }
                }
            },
            chooseAche: function (idx) {
                if (idx == vm.painQk.nrsSco) {
                    vm.painQk.nrsSco = null;
                } else {
                    vm.painQk.nrsSco = parseInt(idx)
                }
                vm.fillMsg();
            },
            checkClick: function (objName) {
                vm.painQk[objName] = vm.hideMsg[objName].join(',')
            },
            radioClick: function (idx, name) {
                var listCod = vm.getMsg[name + 'List'][idx]['infocode'];
                vm.hideMsg[name] = vm.hideMsg[name].length > 0 ? [listCod] : [];
                this.checkClick(name);
            },
            fillMsg: function () {
                var codList = ['nrsTtbw', 'nrsTtbwQt', 'nrsTtxz', 'nrsTtxzQt', 'nrsTtsj', 'nrsTtkz', 'nrsMemo'];
                codList.map(function (ele) {
                    parent.$('#emg_' + ele).val(vm.painQk[ele]);
                })
                parent.$("#emg_nrsSco").val(vm.painQk.nrsSco);
                parent.closemodalwindow();
            }  
        }
    });
</script>

</html>