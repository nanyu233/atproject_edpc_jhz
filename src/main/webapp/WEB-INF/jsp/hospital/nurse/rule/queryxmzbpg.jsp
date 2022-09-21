<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>胸闷</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="queryxmzbpg" ms-controller="queryxmzbpg">
    <div class="queryxmzbpg_container">
        <p class="box_title">胸闷评估内容</p>
        <div class="msg_div">
            <p class="subtitle_p">危急征像/高风险指标</p>
            <ul class="msg_ul">
                <li class="content_li" ms-repeat="getMsg.xtxmzbList" ms-class="active:el.checked" ms-click="radioclick($index,el.infocode)">{{el.info}}</li>
            </ul>
            <p class="subtitle_p" ms-if="getMsg.showul">指标内涵</p>
            <ul class="zbnh">
                <li ms-repeat="getMsg.zbnhList" ms-class="active:el.checked" ms-click="checkClick($index)" class="zbnh_li">{{el.info}}</li>
            </ul>
        </div>
        <div class="grp_btn">
            <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" ms-click="fillxmzbpg()">确定</a>
            <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</body>
<script type="text/javascript">
    var e_xmCod, e_xmSubCod;
    e_xmCod = parent.$("#emg_xmCod").val();
    e_xmSubCod = parent.$("#emg_xmSubCod").val();
    e_xmSubCod = e_xmSubCod.split(",");

    var jsbrFun = {
        //获取下拉列表
        avalonGetMsg: function(url, getObj) {

            var _res = parent.jsbrjz;
            $.each(_res, function(key, val) {
                if (key == 'xtxmzbList') {
                    $.each(val, function(idx, valu) {
                        valu['checked'] = false
                    })
                }
            });

            var _res = parent.jsbrjz;
            for (var i in _res) {
                if (vm[getObj].hasOwnProperty(i)) {
                    vm[getObj][i] = _res[i]
                }
            }

            var getMsgList = vm.getMsg['xtxmzbList'];
            var parentValue = e_xmCod;
            $.each(getMsgList, function(index, value) {
                if (value['infocode'] == parentValue) {
                    value['checked'] = true;
                }
            });
        },
        getSonMsg: function(infocode) {
            $.ajax({
                data: { "dstdictinfoCustom.typecode": "XTXMZB_SUB", "dstdictinfoCustom.remark": infocode },
                async: false,
                url: "querydictSub.do",
                type: "get",
                success: function(res) {
                    var _res = res;
                    $.each(_res, function(idx, valu) {
                        valu['checked'] = false;
                    });
                    vm.getMsg.zbnhList = _res;

                    var getMsgList = vm.getMsg['zbnhList'];
                    var parentValue = e_xmSubCod;
                    $.each(getMsgList, function(index, value) {
                        for (var i = 0; i < parentValue.length; i++) {
                            if (value['infocode'] == parentValue[i]) {
                                value['checked'] = true;
                                vm.hspemginfCustom.xmSubCod.push(value['infocode'])
                            }
                        }
                    });
                }
            });
        }
    }
    var vm = avalon.define({
        $id: "queryxmzbpg",
        getMsg: {
            xtxmzbList: [], //胸闷
            zbnhList: [],
            algHonList: [{
                infocode: 0,
                info: "无"
            }, {
                infocode: 1,
                info: "不详"
            }, {
                infocode: 2,
                info: "有"
            }],
            showul: false
        },
        hspemginfCustom: {
            xmCod: e_xmCod || '',
            xmSubCod: []
        },
        radioclick: function(idx, infocode) {
            var list = vm.getMsg['xtxmzbList'];
            var currentChecked = list[idx]['checked'];
            $.each(list, function(index, value) {
                value['checked'] = false;
            });
            list[idx]['checked'] = !currentChecked;
            if (list[idx]['checked'] == true) {
                jsbrFun.getSonMsg(infocode);
                vm.hspemginfCustom.xmCod = vm.getMsg['xtxmzbList'][idx]['infocode'];
                $.each(vm.getMsg.zbnhList, function(index, value) {
                    value['checked'] = false;
                });
                vm.hspemginfCustom.xmSubCod = [];
                if(vm.getMsg.zbnhList.length>0){
                    vm.getMsg.showul = true;
                }
                else {
                    vm.getMsg.showul = false;
                }
            } else {
                vm.hspemginfCustom.xmCod = '';
                vm.getMsg.zbnhList = [];
                vm.hspemginfCustom.xmSubCod = [];
                vm.getMsg.showul = false;
            }
        },
        checkClick: function(idx) {
            var list = vm.getMsg['zbnhList'];
            var currentData = $.inArray((list[idx]['infocode']), vm.hspemginfCustom.xmSubCod);
            if (list[idx]['checked'] == false) {
                list[idx]['checked'] = true;
                if (currentData == -1) {
                    vm.hspemginfCustom.xmSubCod.push(list[idx]['infocode'])
                }
            } else {
                list[idx]['checked'] = false;
                if (currentData != -1) {
                    vm.hspemginfCustom.xmSubCod.splice(currentData, 1)
                }
            }
        },
        fillxmzbpg: function() {
            parent.$("#emg_xmCod").val(vm.hspemginfCustom.xmCod);
            parent.$("#emg_xmSubCod").val(vm.hspemginfCustom.xmSubCod);
            parent.closemodalwindow();
        }
    });

    $(function() {
        var _url, _getObj;
        _url = "findEmgList_jzt.do";
        _getObj = "getMsg";
        jsbrFun.avalonGetMsg(_url, _getObj);

        if (e_xmCod != '') {
            jsbrFun.getSonMsg(e_xmCod);
              if(vm.getMsg.zbnhList.length>0){
                    vm.getMsg.showul = true;
                }
                else{
                    vm.getMsg.showul = false;
                }
        }
    })
</script>

</html>