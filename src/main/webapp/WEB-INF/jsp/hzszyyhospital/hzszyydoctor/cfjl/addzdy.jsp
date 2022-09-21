<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>查房记录-新增</title>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/at-form.css?v=${versionDay}" />
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/jjbjlEditAdd.css?v=${versionDay}">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<script>
    var _btnType = 'updateZdy',
      _emgSeq = '${hspemginfCustom.emgSeq}';
</script>
</head>

<body class="titlebody">
<h1 class="title"><input type="text" id="cfysname" class="cfysname cfysname2"/></h1>
<form class="at-form" id="checkingRecordForm" action="${baseurl}zyylqbl/insertzdy.do" method="post" style="border-bottom: none;">
    <input type="hidden" id="checkNam" name="hspCfjlInfCustom.checkNam"/>
    <input type="hidden" name="hspCfjlInfCustom.cfjlType" value="9"/>
    <div class="basicDiv">
        <label class="bascilab">姓名：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstNam}" readonly></label>
        <label class="bascilab">性别：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstSexCod}" readonly></label>
        <label class="bascilab cstAgelab">年龄：<input class="basicInput" unselectable='on' id="age" type="text" readonly></label>
        <label class="bascilab">科别：<input class="basicInput longbasicInput" unselectable='on' type="text" value="急诊科门诊" readonly></label>
        <label class="bascilab">病历号：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.mpi}" readonly></label>
        <label class="bascilab">留观号：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.observationCode}" name="hspemginfCustom.observationCode" readonly></label>
    </div>
    <input class="hidden" type="text" name="hspCfjlInfCustom.emgSeq" value="${emgSeq}">
    <div class="at-form-item clr">
        <label class="at-form-item__label">时&emsp;&emsp;间</label>
        <div class="at-form-item__content">
            <input class="Wdate" type="text" name="hspCfjlInfCustom.cfjlDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" style="width: 145px;">
        </div>
    </div>
    <div class="at-form-item clr">
        <label class="at-form-item__label">
            记录内容
            <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
        </label>
        <div class="tem-div" id="subTemDiv"></div>
        <div class="at-form-item__content">
            <textarea id="cfjlContent" name="hspCfjlInfCustom.cfjlContent" class="longTextArea"></textarea>
        </div>
    </div>
    <div class="recorder clr">
        <div class="recorder__content">
            <span class="m-l2">记&ensp;录&ensp;人</span>
            <span class="spanRelative">
                <!-- onkeydown="getSignList(event)" -->
                <input type="text" id="docName" maxlength="10" name="hspCfjlInfCustom.cfjlNam" readonly>
                <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspCfjlInfCustom.cfjlNum">
                <div class="userList" id="userNameList"></div>
            </span>
            <span id="dzqm"></span>
        </div>
    </div>
</form>
<script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js" type="text/javascript"></script>
<script type="text/javascript">
function getSignList(e) {
    if (e.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
    }
}
$("body").click(function () {
    $(".userList").hide();
});
function getSign() {
    publicFun.alert("请先保存数据。");
}
/**
*保存
*/
function saveForm() {
    publicFun.cleanSignMsg('docName');
    var checkname = $('#cfysname').val();
    $('#checkNam').val(checkname);
    var cfjlDat = $('.Wdate').val();
    if (cfjlDat == '') {
        publicFun.alert('请输入时间');
        return false;
    }
    jquerySubByFId('checkingRecordForm', function(res) {
        message_alert(res);
        setTimeout(function() {
            var url = '${baseurl}zyylqbl/toupdatezdy.do?cfjlSeq=' + res.resultInfo.sysdata.onlySeq + '&emgSeq=' + _emgSeq;
            parent.editCourse(url);
        }, 800)
    }, null, 'json');
}
function initAge () {
    if('${hspemginfCustom.cstAge}'){
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
    }else {
        $('#age').val('')
    }
}
function initMsg () {
    $("#cfysname").focus();
    $("#cfysname").val('可编辑抬头记录');
    var _now = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
    $('.Wdate').val(_now);
    $('#docName').val('${sessionScope.activeUser.usrname}');
    $('#docNameNum').val('${sessionScope.activeUser.usrno}');
}
$(function() {
    initAge();
    initMsg()
    initDocImportHtml('subTemDiv', 'cfjlContent')
})
$(document).keydown(function (event) {
    switch (event.keyCode) {
        case 18:
            event.preventDefault();
        case 116:
            event.preventDefault();
        case 122:
            event.preventDefault();
    }
});
</script>
</body>

</html>