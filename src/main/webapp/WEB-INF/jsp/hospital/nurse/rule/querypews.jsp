<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>pews评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <style type="text/css">
        .querycrams .crams_container .act_div {
            height: inherit;
        }

        .querycrams .crams_container .act_p {
            height: 80px;
        }
    </style>
</head>

<body class="queryFlass querycrams" ms-controller="queryFlass">
    <div class="flass-container crams_container">
        <p class="box_title no_border">pews评分</p>
        <p class="inspect_p">检测项目</p><span class="inspect_span">评分</span>
        <div class="act_div">
            <p class="act_p">反应</p>
            <div class="msg_div">
                <label class="act_label" ms-repeat="getMsg.pewsfyList" ms-attr-for="fyCod{{el.infocode}}">
                    <span class="score_span">{{el.infocode}}</span>
                    <span class="content_span">{{el.info}}</span>
                    <input ms-attr-id="fyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('pewsfyList','fyCod',$index)" />
                </label>
            </div>
        </div>
        <div class="act_div">
            <p class="act_p">循环</p>
            <div class="msg_div">
                <label class="act_label" ms-repeat="getMsg.pewsxhList" ms-attr-for="xhCod{{el.infocode}}">
                    <span class="score_span">{{el.infocode}}</span>
                    <span class="content_span">{{el.info}}</span>
                    <input ms-attr-id="xhCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('pewsxhList','xhCod',$index)" />
                </label>
            </div>
        </div>
        <div class="act_div">
            <p class="act_p">呼吸</p>
            <div class="msg_div">
                <label class="act_label" ms-repeat="getMsg.pewshxList" ms-attr-for="hxCod{{el.infocode}}">
                    <span class="score_span">{{el.infocode}}</span>
                    <span class="content_span">{{el.info}}</span>
                    <input ms-attr-id="hxCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('pewshxList','hxCod',$index)" />
                </label>
            </div>
        </div>
        <div class="score_div score_pos" id="emg_gcsTotSco"><span>总分：</span><i>{{patientMsg.pewsTotSco}}</i></div>
        <div class="grp_btn">
            <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" ms-click="fillcrams()">确定</a>
            <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</body>
<script type="text/javascript">
    var pewsTotSco = parent.$("#pewsTotSco").val();
    var aboutPews = {
        fyCod: parent.$("#fyCod").val(),
        xhCod: parent.$("#xhCod").val(),
        hxCod: parent.$("#hxCod").val()
    };
    var vm = avalon.define({
        $id: "queryFlass",
        getMsg: {
            pewsfyList: [],
            pewsxhList: [],
            pewshxList: []
        },
        patientMsg: {
            pewsTotSco: pewsTotSco //Flass评分
        },
        aboutPews: {
            fyCod: aboutPews.fyCod,
            xhCod: aboutPews.xhCod,
            hxCod: aboutPews.hxCod
        },
        radioclick: function(nameList, name, idx) {
            $.each(vm.getMsg[nameList], function(indx, val) {
                if (idx === indx) {
                    val['checked'] = !val['checked'];
                    if (val['checked'] === true) {
                        vm.aboutPews[name] = val['infocode']
                    } else {
                        vm.aboutPews[name] = ''
                    }
                } else {
                    val['checked'] = false;
                }
            });
        },
        fillcrams: function() {
            parent.$("#pewsTotSco").val(vm.patientMsg.pewsTotSco);
            parent.$("#fyCod").val(vm.aboutPews.fyCod);
            parent.$("#xhCod").val(vm.aboutPews.xhCod);
            parent.$("#hxCod").val(vm.aboutPews.hxCod);
            parent.closemodalwindow();
        }
    });
    /**
     * @获取getMsg所需要的数据
     */
    vm.aboutPews.$watch('$all', function(name, newVal, oldVal) {
        var countAboutPews = {
            fyCod: vm.aboutPews.fyCod,
            xhCod: vm.aboutPews.xhCod,
            hxCod: vm.aboutPews.hxCod
        };
        if (isNull(countAboutPews) === false) {
            vm.patientMsg.pewsTotSco = parseInt(countAboutPews['fyCod']) + parseInt(countAboutPews['xhCod']) + parseInt(countAboutPews['hxCod']);
        } else {
            vm.patientMsg.pewsTotSco = '';
        }
    });
    /**
     * @获取getMsg所需要的数据
     */
    function processingGetMsg() {
        var res = parent.jsbrjz;
        $.each(res, function(key, val) {
            if (vm.getMsg.hasOwnProperty(key)) {
                var valList = val;
                var minKey = key.replace(/pews/img, '').replace(/List/img, '') + 'Cod';
                $.each(val, function(idx, valu) {
                    valu['checked'] = false;
                });
                if (aboutPews[minKey] != '') {
                    $.each(val, function(idx, valu) {
                        if (valu['infocode'] === aboutPews[minKey]) {
                            valu['checked'] = true
                        }
                    });
                }
                vm.getMsg[key] = valList
            }
        });
    }
    /**
     * @遍历对象，判断是否为空
     * @return IF '' return true
     * @return ELSE return false
     */
    function isNull(obj) {
        var isNull = false;
        $.each(obj, function(idx, val) {
            if (val === '' || val === null) {
                isNull = true
            }
        });
        return isNull
    }
    $(function() {
        processingGetMsg()
    })
</script>

</html>