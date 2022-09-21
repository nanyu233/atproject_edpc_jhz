<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>CRAMS评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="querycrams">
    <div class="crams_container" id="queryCrams" v-cloak>
        <p class="box_title no_border">CRAMS评分</p>
        <p class="inspect_p">检测项目</p><span class="inspect_span">评分</span>
        <div class="act_div">
            <p class="act_p">循环</p>
            <div class="msg_div">
                <label v-for="(el, index) in getMsg.cirLvlCodList" :for="'aboutCRAMSA' + el.infocode" class="act_label">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutCRAMSA' + el.infocode" type="checkbox" v-model="hideMsg.cirLvlCod" :value="el.infocode" @change="radioClick('cirLvlCod',index)"/>
                </label>
            </div>
        </div>
        </span>
        <div class="act_div">
            <p class="act_p">呼吸</p>
            <div class="msg_div">
                <label v-for="(el, index) in getMsg.breLvlCodList" :for="'aboutCRAMSB' + el.infocode" class="act_label">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutCRAMSB' + el.infocode" type="checkbox" v-model="hideMsg.breLvlCod" :value="el.infocode" @change="radioClick('breLvlCod',index)"/>
                </label>
            </div>
        </div>
        <div class="act_div">
            <p class="act_p">胸腹部</p>
            <div class="msg_div">
                <label v-for="(el, index) in getMsg.bdyLvlCodList" :for="'aboutCRAMSC' + el.infocode" class="act_label">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutCRAMSC' + el.infocode" type="checkbox" v-model="hideMsg.bdyLvlCod" :value="el.infocode" @change="radioClick('bdyLvlCod',index)"/>
                </label>
            </div>
        </div>
        <div class="act_div">
            <p class="act_p">运动</p>
            <div class="msg_div">
                <label v-for="(el, index) in getMsg.sptLvlCodList" :for="'aboutCRAMSD' + el.infocode" class="act_label">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutCRAMSD' + el.infocode" type="checkbox" v-model="hideMsg.sptLvlCod" :value="el.infocode" @change="radioClick('sptLvlCod',index)"/>
                </label>
            </div>
        </div>
        <div class="act_div">
            <p class="act_p">语言</p>
            <div class="msg_div">
                <label v-for="(el, index) in getMsg.lanLvlCodList" :for="'aboutCRAMSE' + el.infocode" class="act_label">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutCRAMSE' + el.infocode" type="checkbox" v-model="hideMsg.lanLvlCod" :value="el.infocode" @change="radioClick('lanLvlCod',index)"/>
                </label>
            </div>
        </div>
        <div class="score_div score_pos" id="emg_gcsTotSco"><span>总分：</span><i>{{getTotalScore}}</i></div>
        <div class="grp_btn">
            <a class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillCrams()">确定</a>
            <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</body>
<script type="text/javascript">
    var e_cramsTotSco = parent.$("#emg_cramsTotSco").val();
    var cramsMsg={
            e_sptLvlCod : parent.$("#emg_sptLvlCod").val(),
            e_lanLvlCod : parent.$("#emg_lanLvlCod").val(),
            e_cirLvlCod : parent.$("#emg_cirLvlCod").val(),
            e_breLvlCod : parent.$("#emg_breLvlCod").val(),
            e_bdyLvlCod : parent.$("#emg_bdyLvlCod").val()
        }
    var msgList = ['sptLvlCod', 'lanLvlCod', 'cirLvlCod', 'breLvlCod', 'bdyLvlCod'];
    msgList.map(function (item, index) {
        if (cramsMsg['e_' + item] !== '') {
            cramsMsg['e_' + item] = cramsMsg['e_' + item].split(',')
        } else {
            cramsMsg['e_' + item] = [];
        }
    })

    var vm = new Vue({
        el: "#queryCrams",
        data: {
            getMsg: {
                sptLvlCodList: [], //运动
                lanLvlCodList: [], //语言
                cirLvlCodList: [], //循环
                breLvlCodList: [], //呼吸
                bdyLvlCodList: [] //胸腹部
            },
            totalSco: {
                cramsTotSco: e_cramsTotSco || '', //CRAMS评分
            },
            aboutCRAMS: {
                sptLvlCod: parent.$("#emg_sptLvlCod").val() || null, //运动
                lanLvlCod: parent.$("#emg_lanLvlCod").val() || null, //语言
                cirLvlCod: parent.$("#emg_cirLvlCod").val() || null, //循环
                breLvlCod: parent.$("#emg_breLvlCod").val() || null, //呼吸
                bdyLvlCod: parent.$("#emg_bdyLvlCod").val() || null //胸腹部
            },
            hideMsg: {
                sptLvlCod: cramsMsg.e_sptLvlCod || [], //运动
                lanLvlCod: cramsMsg.e_lanLvlCod || [], //语言
                cirLvlCod: cramsMsg.e_cirLvlCod || [], //循环
                breLvlCod: cramsMsg.e_breLvlCod || [], //呼吸
                bdyLvlCod: cramsMsg.e_bdyLvlCod || [] //胸腹部
            }
        },
        mounted: function () {
            this.$nextTick(function () {
                this.getParentList();
            })
        },
        computed: {
            getTotalScore: function () {
                var totalCramsSco;
                var sptLvlCod, lanLvlCod, cirLvlCod, breLvlCod, bdyLvlCod;
                sptLvlCod = parseInt(this.aboutCRAMS.sptLvlCod);
                lanLvlCod = parseInt(this.aboutCRAMS.lanLvlCod);
                cirLvlCod = parseInt(this.aboutCRAMS.cirLvlCod);
                breLvlCod = parseInt(this.aboutCRAMS.breLvlCod);
                bdyLvlCod = parseInt(this.aboutCRAMS.bdyLvlCod);
                if (sptLvlCod >= 0 && lanLvlCod >= 0 && cirLvlCod >= 0 && breLvlCod >= 0 && bdyLvlCod >= 0) {
                    totalCramsSco = sptLvlCod + lanLvlCod + cirLvlCod + breLvlCod + bdyLvlCod;
                } else {
                    totalCramsSco = '';
                }
                this.$set(this.totalSco, 'cramsTotSco', totalCramsSco)
                return totalCramsSco
            }
        },
        methods: {
            getParentList: function () {
                var _res = parent.jsbrjz;
                for (var i in _res) {
                    if (this['getMsg'].hasOwnProperty(i)) {
                        this['getMsg'][i] = _res[i]
                    }
                }
            },
            radioClick: function (name, idx) {
                if (this.hideMsg[name].length > 0) {
                    var hideMsg = this.getMsg[name + 'List'][idx]['infocode'] - 0;
                    this.hideMsg[name] = [hideMsg];
                    this.aboutCRAMS[name] = this.hideMsg[name].join(',')
                } else {
                    this.hideMsg[name] = [];
                    this.aboutCRAMS[name] = ''
                }
            },
            fillCrams: function () {
                var _canSave = true;
                if (vm.totalSco.cramsTotSco === '' || vm.totalSco.cramsTotSco == null) {
                    var _codList = ['sptLvlCod', 'lanLvlCod', 'cirLvlCod', 'breLvlCod', 'bdyLvlCod'];
                    _codList.forEach(function (item, idx) {
                        if (vm.aboutCRAMS[item] !== '' && vm.aboutCRAMS[item] != null) {
                            _canSave = false;
                        }
                    })
                }
                if (!_canSave) {
                    publicFun.alert('每项勾完才能完成评分！');
                    return;
                }
                parent.$("#emg_cramsTotSco").val(vm.totalSco.cramsTotSco);
                parent.$("#emg_sptLvlCod").val(vm.aboutCRAMS.sptLvlCod);
                parent.$("#emg_lanLvlCod").val(vm.aboutCRAMS.lanLvlCod);
                parent.$("#emg_cirLvlCod").val(vm.aboutCRAMS.cirLvlCod);
                parent.$("#emg_breLvlCod").val(vm.aboutCRAMS.breLvlCod);
                parent.$("#emg_bdyLvlCod").val(vm.aboutCRAMS.bdyLvlCod);
                parent.closemodalwindow();
            }
        }
    });
</script>

</html>
