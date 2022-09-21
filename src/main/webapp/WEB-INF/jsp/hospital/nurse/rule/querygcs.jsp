<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>GCS评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="querygcs">
    <div class="gcs_container" id="queryGcs"  v-cloak>
        <p class="box_title no_border">GCS评分</p>
        <p class="inspect_p">检测项目</p><span class="inspect_span">评分</span>
        <div class="act_div">
            <p class="act_p">睁眼反应</p>
            <div class="msg_div">
                <label class="act_label" v-for="(el, index) in getMsg.eyeRctCodList" :for="'aboutGCSA' + el.infocode">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutGCSA' + el.infocode" type="checkbox" v-model="hideGCS.eyeRctCod" :value="el.infocode" @change="radioClick('eyeRctCod', index)" />
                </label>
            </div>
        </div>
        </span>
        <div class="act_div act_div2">
            <p class="act_p">语言反应</p>
            <div class="msg_div">
                <label class="act_label" v-for="(el, index) in getMsg.lanRctCodList" :for="'aboutGCSB'+ el.infocode">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutGCSB'+ el.infocode" type="checkbox" v-model="hideGCS.lanRctCod"  :value="el.infocode" @change="radioClick('lanRctCod', index)" />
                </label>
            </div>
        </div>
        <div class="act_div act_div3">
            <p class="act_p">肢体运动</p>
            <div class="msg_div">
                <label class="act_label" v-for="(el, index) in getMsg.actRctCodList" :for="'aboutGCSC' + el.infocode">
                    <span class="score_span">{{el.infocode}}</span><span class="content_span">{{el.info}}</span>
                    <input :id="'aboutGCSC' + el.infocode" type="checkbox" v-model="hideGCS.actRctCod"  :value="el.infocode" @change="radioClick('actRctCod', index)" />
                </label>
            </div>
        </div>
        <div class="score_div score_pos" id="emg_gcsTotSco"><span>总分：</span><i>{{getGcsTotalScore}}</i></div>
        <div class="grp_btn">
            <a class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillGcs()">确定</a>
            <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</body>
<script type="text/javascript">
    var gcsMsg = {
        e_eyeRctCod: parent.$("#emg_eyeRctCod").val(),
        e_lanRctCod: parent.$("#emg_lanRctCod").val(),
        e_actRctCod: parent.$("#emg_actRctCod").val()
    }
    var msgList = ['eyeRctCod', 'lanRctCod', 'actRctCod'];
    msgList.map(function (item, index) {
        if (gcsMsg['e_' + item] !== '') {
            gcsMsg['e_' + item] = gcsMsg['e_' + item].split(',')
        } else {
            gcsMsg['e_' + item] = [];
        }
    })
    var vm = new Vue({
        el: "#queryGcs",
        data: {
            getMsg: {
                eyeRctCodList: [], //眨眼反应
                lanRctCodList: [], //语言反应
                actRctCodList: [] //肢体运动
            },
            totalSco: {
                gcsTotSco: parent.$("#emg_gcsTotSco").val() || ''//GCS评分
            },
            aboutGCS: {
                eyeRctCod: parent.$("#emg_eyeRctCod").val() || '', //眨眼反应
                lanRctCod: parent.$("#emg_lanRctCod").val() || '', //语言反应
                actRctCod: parent.$("#emg_actRctCod").val() || '' //肢体运动
            },
            hideGCS: {
                eyeRctCod: gcsMsg.e_eyeRctCod,
                lanRctCod: gcsMsg.e_lanRctCod,
                actRctCod: gcsMsg.e_actRctCod
            }
        },
        mounted: function () {
            this.$nextTick(function () {
                this.getParentList();
            })
        },
        computed: {
             getGcsTotalScore: function () {
                var totalGcsSco;
                var actRctCod = parseInt(this.aboutGCS.actRctCod);
                var lanRctCod = parseInt(this.aboutGCS.lanRctCod);
                var eyeRctCod = parseInt(this.aboutGCS.eyeRctCod);
                if (actRctCod >= 0 && lanRctCod >= 0 && eyeRctCod >= 0) {
                    totalGcsSco = actRctCod + lanRctCod + eyeRctCod
                }
                this.$set(this.totalSco, 'gcsTotSco', totalGcsSco)
                return totalGcsSco
            }
        },
        methods: {
            radioClick: function (name, idx) {
                if (this.hideGCS[name].length > 0) {
                    var hideMsg = this.getMsg[name + 'List'][idx]['infocode'] - 0;
                    this.hideGCS[name] = [hideMsg];
                    this.aboutGCS[name] = this.hideGCS[name].join(',')
                } else {
                    this.hideGCS[name] = [];
                    this.aboutGCS[name] = ''
                }
            },
            getParentList: function () {
                var _res = parent.jsbrjz;
                for (var i in _res) {
                    if (this['getMsg'].hasOwnProperty(i)) {
                        this['getMsg'][i] = _res[i]
                    }
                }
            },
            fillGcs: function () {
                var _canSave = true;
                if (vm.totalSco.gcsTotSco === '' || vm.totalSco.gcsTotSco == null) {
                    var _codList = ['actRctCod', 'lanRctCod', 'eyeRctCod'];
                    _codList.forEach(function (item, idx) {
                        if (vm.aboutGCS[item] !== '' &&  vm.aboutGCS[item] != null) {
                            _canSave = false;
                        }
                    })
                }
                if (!_canSave) {
                    publicFun.alert('每项勾完才能完成评分！');
                    return;
                }
                parent.$("#emg_gcsTotSco").val(vm.totalSco.gcsTotSco);
                parent.$("#emg_eyeRctCod").val(vm.aboutGCS.eyeRctCod);
                parent.$("#emg_lanRctCod").val(vm.aboutGCS.lanRctCod);
                parent.$("#emg_actRctCod").val(vm.aboutGCS.actRctCod);
                parent.closemodalwindow();
            }
        }
    });
</script>

</html>