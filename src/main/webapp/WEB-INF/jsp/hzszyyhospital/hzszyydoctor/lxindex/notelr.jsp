<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <meta charset="UTF-8">
    <title>初步诊断</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/cbyx.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script>
        _trnumber = '${trnumber}';
    </script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="querylr" ms-controller="cbyx">
    <p class="bz">输入“疾病代码”,按回车或“搜索”按钮查询，可对疾病进行前后文字编辑，点击“确定”后合成最终诊断信息。</p>
    <div class="form clr fmdiv">
        <p class="form-text">检索条件：</p>
        <div class="floatLeft relative">
            <input id="cbyxParams" type="text" ms-duplex-string="searchParams.pysm" placeholder="请输入疾病代码" autocomplete="off" >
            <div class="cbyxSearchList" id="allBuddy" onscroll="judgeMsg()">
                <!-- <ul>
                    <li ms-repeat="cbyxSearchList" ms-click="chooseCbyx($index)">
                        <a>{{el.jbbc}}</a>
                    </li>
                </ul> -->
                <table cellspacing="0" cellpadding="0" border="0" width="100%" id="buddyListTable">
                    <tbody>
                        <tr ms-repeat="cbyxSearchList" class="repeatTr" ms-click="chooseCbyx($index)"> 
                            <td>{{el.jbbc}}</td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" ms-click="getCbyxList()">搜索</a>
    </div>
    <div>
        <table class="table table-bordered table-striped">
            <colgroup>
                <col width="8%">
                <col width="20%">
                <col width="42%">
                <col width="20%">
                <col width="8%">
            </colgroup>
            <thead>
                <tr class="tr_bg">
                    <td>序号</td>
                    <td>诊断前缀</td>
                    <td>疾病名称</td>
                    <td>诊断后缀</td>
                    <td>操作</td>
                </tr>
            </thead>
            <tbody>
                <tr ms-repeat="cbyxList">
                    <td>{{$index+1}}</td>
                    <td>
                        <input type="text" class="hidden" ms-attr-id="'flag' + $index" ms-duplex-string="el.lmt_flg">
                        <input type="text" ms-attr-id="'prefixVal' + $index" ms-duplex-string="el.lmt_pre" maxlength="20" />
                    </td>
                    <td class="leftgroup">{{el.jbbc}}</td>
                    <td><input type="text" ms-attr-id="'suffixVal' + $index" ms-duplex-string="el.lmt_suf" maxlength="20"/></td>
                    <td><a href="javascript:;" ms-click="deleteCbyx($index)">删除</a></td>
                </tr>
                <tr ms-if="cbyxRemark !== ''">
                    <td>手工录入</td>
                    <td colspan="4">
                        <textarea class="div-textarea" maxlength="150" ms-duplex-string="cbyxRemark" ms-attr-disabled="cbyxRemark !== ''"></textarea>
                    </td>
                </tr>
            </tbody>
        </table>
        <div class="btn_Group">
            <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-ok" ms-click="insertCbyx()">确定</a>
            <a class="easyui-linkbutton" href="javascript:;" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</body>
<script type="text/javascript">
$("body").click(function () {
    $(".cbyxSearchList").hide();
});
var rth = _trnumber;
var canSearchFlag = true;
var currentLine=-1, offsetTr = 0;

var vm = avalon.define({
    $id: "cbyx",
    searchParams: {
        pysm: ""
    },
    cbyxSearchList: [],
    cbyxList: [],
    cbyxRemark: parent.$("#jbzdComm"+rth+"").val(),
    getCbyxList: function() {
        if (vm.searchParams.pysm == "") {
            vm.cbyxSearchList = [];
            $(".cbyxSearchList").hide();
            // publicFun.alert("检索条件不能为空!");
            return false
        }
        $.ajax({
            url: "${baseurl}qjs/queryJbzdInfbyPysm.do",
            type: "post",
            data: {
                "hspHzjbzdCustom.pysm": vm.searchParams.pysm.toUpperCase(),
                "_t": new Date()
            }
        }).done(function(res) {
        	if(res.resultInfo && res.resultInfo.messageCode =='109'){
        		message_alert(res,function (){
        			window.location.href="${baseurl}/first.do";
        		});
      			return false;
        	}
            // console.log(res)
            if (!res.length) {
                // publicFun.alert("未检索到相关数据!");
                $(".cbyxSearchList").show();
                //重置搜索条件
                // vm.searchParams.pysm = "";
                vm.cbyxSearchList = [{id: '', jbbc: '', pysm: '', lmtSex: null, lmtLx: null}];
            } else {
                vm.cbyxSearchList = res;
                $(".cbyxSearchList").show();
            }
        });
    },
    chooseCbyx: function(idx) {
        var _currentCbyx = vm.cbyxSearchList[idx];
        _currentCbyx.lmt_flg = '2';
        if (_currentCbyx.jbbc == '') {
            return false;
        }
        var _index = -1;
        for (var i = 0; i < vm.cbyxList.length; i++) {
            if (vm.cbyxList[i].jbbc == _currentCbyx.jbbc) {
                _index = i
            }
        }
        if (_index === -1) {
            if (vm.cbyxList.length === 1 && (vm.cbyxList[0].id === '&nbsp;' || vm.cbyxList[0].id.length == 32)) {
                if (vm.cbyxList[0].lmt_pre !== '' || vm.cbyxList[0].lmt_suf !== '') {
                    vm.cbyxList[0].jbbc = _currentCbyx.jbbc
                    vm.cbyxList[0].id = _currentCbyx.id
                    vm.cbyxList[0].lmt_flg = _currentCbyx.lmt_flg
                } else {
                    vm.cbyxList.splice(0 ,1)
                    vm.cbyxList.push(_currentCbyx)
                }
            } else {
                vm.cbyxList.push(_currentCbyx)
            }
        } else {
            publicFun.alert("该条数据已经存在！")
        }
        //重置搜索条件
        vm.searchParams.pysm = "";
        //重置待选列表
        vm.cbyxSearchList = [];
        $(".cbyxSearchList").hide();
    },
    deleteCbyx: function(idx) {
        vm.cbyxList.splice(idx, 1);
    },
    insertCbyx: function() {
        var obj = {
            jbzdSeq: '',
            jbzdDes: '',
            jbzdComm: '',
            diagnosePre: '',
            jbzdBetFixStr: '',
            diagnoseSuf: '',
            sourceFlg: ''
        };
        var jbzdSeqList = [],
            jbzdBetFixStrList = [],
            diagnosePreList = [],
            diagnosePreList = [],
            diagnoseSufList = [],
            sourceFlgList = [];
        try {
            $.each($.parseJSON($.stringify(vm.cbyxList)), function(idx, val) {
                jbzdSeqList.push(val.id);
                diagnosePreList.push($('#prefixVal' + idx).val().trim())
                diagnoseSufList.push($('#suffixVal' + idx).val().trim())
                sourceFlgList.push($('#flag' + idx).val())
                jbzdBetFixStrList.push(val.jbbc);
            });
        } catch (e) {
            $.each(vm.cbyxList, function(idx, val) {
                jbzdSeqList.push(val.id);
                diagnosePreList.push($('#prefixVal' + idx).val().trim())
                diagnoseSufList.push($('#suffixVal' + idx).val().trim())
                sourceFlgList.push($('#flag' + idx).val())
                jbzdBetFixStrList.push(val.jbbc);
            });
        }
        var list = "";
        var _nameFieldList = [{ val: 'jbzdSeqList', cod: '' }, {val: 'ryzdZyList', cod: '1'}, { val: 'ryzdXyList', cod: '2' }, { val: 'cyzdZyList', cod: '3' }, { val: 'cyzdXyList', cod: '4' }, { val: 'deathZdList', cod: '5' }]
        if (jbzdSeqList.length === 1 && jbzdSeqList[0] === '&nbsp;') {
            jbzdSeqList.splice(0, 1);
        } 
        if (jbzdSeqList.length === 0) {
            if (diagnosePreList[0] || diagnoseSufList[0]) {
                publicFun.alert('请输入疾病名称');
                return
            }
        }
        $.each(_nameFieldList, function (idx, value) {
            if (rth == value.cod) {
                for (var i = 0; i < jbzdSeqList.length; i++) {
                    if (jbzdSeqList[i].length === 32) {
                        list += "<input type='checkbox' name='" + value.val + "' value='' checked>";
                    } else {
                        list += "<input type='checkbox' name='" + value.val + "' value='" + jbzdSeqList[i] + "' checked>";
                    }
                }
            }
        })
        obj.jbzdSeq = jbzdSeqList.join(",");
        obj.jbzdBetFixStr = jbzdBetFixStrList.join(";");
        obj.diagnosePre = diagnosePreList.join('$')
        obj.diagnoseSuf = diagnoseSufList.join('$')
        obj.sourceFlg = sourceFlgList.join(';');
        obj.jbzdComm = vm.cbyxRemark.trim();
        var show_text_des = '';
        $.each(jbzdBetFixStrList, function(idx, val) {
            show_text_des += diagnosePreList[idx] + val + diagnoseSufList[idx] + ';'
        })
        show_text_des = show_text_des.substring(0, show_text_des.length - 1)
        var show_text = '';
        if (obj.jbzdComm === '') {
            show_text = show_text_des;
        } else if (obj.jbzdComm !== '') {
            show_text = show_text_des + ';' + obj.jbzdComm;
        }
        if (show_text_des === '') {
            show_text = obj.jbzdComm;
        }
        for (var key in obj) {
            if (key === 'jbzdDes') {
                parent.$('#jbzdDes' + rth + '').attr({ "value": show_text });
            } else {
                parent.$("#" + key + rth + '').attr({ "value": obj[key] });
            }
        }
        parent.$("#bz_id"+rth+"").html(list);
        parent.$("#show_text"+rth+"").text(show_text);
        parent.$("#show_t"+rth+"").text(show_text);
        try {
            var parentTitle;
            parentTitle = parent.$(".title").text();
            if (parentTitle != "会诊登记") {
                if (sessionStorage.getItem("isValidateFormForLqxxdj") === "true") {
                    if (parent.validateForm) {
                        parent.validateForm();
                    }
                }
            }
        } catch (e) {
            console.log(e);
        }
        parent.closemodalwindow();
    }
});

var timeoutId = 0;
vm.searchParams.$watch('pysm', function (newVal, oldVal) {
    if (newVal !== '') {
        clearTimeout(timeoutId);
        timeoutId = setTimeout(function () {
            vm.getCbyxList();
        }, 500);
    }
})
function changeItem(it){
    if(!it) return false;
    $('.cbyxSearchList tr:hover').removeClass('buddyListHighLight');
    changeBackground(it);
    if(currentLine<0) currentLine = it.rows.length-1;
    if(currentLine >= it.rows.length) currentLine = 0;
    it.rows[currentLine].className = "buddyListHighLight";
    if(document.getElementById('allBuddy')){
        document.getElementById('allBuddy').scrollTop = it.rows[currentLine].offsetTop-offsetTr;
    }
}
function changeBackground(items){
    for(var i=0; i<items.rows.length; i++){
        if(i%2==0){
            items.rows[i].className = "buddyListOdd";
        }else{
            items.rows[i].className = "buddyListEven";
        }
    }
}

function addUser(it){
    var _currentidx = it.rows[currentLine].rowIndex;
    vm.chooseCbyx(_currentidx);
}

function mouseMove(ev) {
    var _tab = document.getElementById('buddyListTable');
    if(document.all){
        _tab = document.getElementById('buddyListTable').children[0];
    }
    changeBackground(_tab);
    $('.cbyxSearchList tr:hover').removeClass('buddyListEven').removeClass('buddyListOdd').addClass('buddyListHighLight');
    for(var i=0; i<_tab.rows.length; i++){
        if(_tab.rows[i].className == "buddyListHighLight") {
            currentLine = i;
        }
    }
}
document.onmousemove = mouseMove;
$(function() {
    $("#cbyxParams").keyup(function(event) {
        var tab = document.getElementById('buddyListTable');
        if(document.all){
            tab = document.getElementById('buddyListTable').children[0];
        }
        canSearchFlag = true
        var _event = window.event||event;
        if(_event.keyCode==38) { //Up 
            offsetTr = 0;
            currentLine--;
            changeItem(tab);
        } else if(_event.keyCode==40) { //Down
            offsetTr = 150;
            currentLine++;
            changeItem(tab);
        } else if(_event.keyCode==13 && currentLine >-1 && tab.rows.length > 0){
            addUser(tab);
            canSearchFlag = false;
        } else if (_event.keyCode == 13 && canSearchFlag == true) {
            currentLine = -1;
            offsetTr = 0;
            vm.getCbyxList();
        }
    });
    setCbyxList();
});

function setCbyxList() {
    var jbzdSeq = parent.$("#jbzdSeq"+rth+"").val() || "", //id
        jbzdBetFixStr = parent.$("#jbzdBetFixStr" + rth +"").val() || "", //name
        diagnosePre = parent.$("#diagnosePre" + rth + "").val() || "",
        diagnoseSuf = parent.$("#diagnoseSuf" + rth + "").val() || "",
        sourceFlg = parent.$('#sourceFlg' + rth + '').val() || '';
    if (jbzdSeq === '') {
        jbzdSeq = '&nbsp;'
    }
    if (jbzdSeq !== '') {
        var jbzdSeqList = jbzdSeq.split(","), //id
            jbzdBetFixStrList = jbzdBetFixStr.split(";"), //name
            diagnosePreList = diagnosePre.split("$"),
            diagnoseSufList = diagnoseSuf.split("$"),
            sourceFlgList = sourceFlg.split(";");
        var cbyxList = [];
        for (var i = 0; i < jbzdSeqList.length; i++) {
            cbyxList.push({
                id: jbzdSeqList[i],
                jbbc: jbzdBetFixStrList[i],
                lmt_pre: diagnosePreList[i],
                lmt_suf: diagnoseSufList[i],
                lmt_flg: sourceFlgList[i]
            });
        }
        vm.cbyxList = cbyxList;
    }
}

function judgeMsg () {
    // var t = document.getElementById('allBuddy').scrollTop;
    // var page_height = 180;
    // console.log(document.getElementById('allBuddy').scrollTop, 't')
}
</script>

</html>