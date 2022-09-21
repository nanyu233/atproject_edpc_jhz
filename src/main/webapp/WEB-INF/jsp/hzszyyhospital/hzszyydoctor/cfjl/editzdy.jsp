<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>查房记录-修改</title>
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/at-form.css" />
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/jjbjlEditAdd.css">
<style>
    textarea{padding: 5px};
</style>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<script>
    var _btnType = 'updateZdy',
      _emgSeq = '${hspemginfCustom.emgSeq}';
</script>
</head>

<body class="titlebody">
    <h1 class="title"><input type="text" id="cfysname" class="cfysname cfysname2"/></h1>
<form class="at-form" id="checkingRecordForm" action="${baseurl}zyylqbl/editcfjl.do" method="post" style="border-bottom: none;">
    <input type="hidden" id="checkNam" value="${hspCfjlInfCustom.checkNam}" name="hspCfjlInfCustom.checkNam"/>
    <input type="hidden" name="hspCfjlInfCustom.cfjlType" value="9"/>
    <div class="basicDiv">
        <label class="bascilab">姓名：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstNam}" readonly></label>
        <label class="bascilab">性别：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstSexCod}" readonly></label>
        <label class="bascilab cstAgelab">年龄：<input class="basicInput" unselectable='on' id="age" type="text" readonly></label>
        <label class="bascilab">科别：<input class="basicInput longbasicInput" unselectable='on' type="text" value="急诊科门诊" readonly></label>
        <label class="bascilab">病历号：<input class="basicInput" type="text" unselectable='on' value="${hspemginfCustom.mpi}" readonly></label>
        <label class="bascilab">留观号：<input class="basicInput" type="text" unselectable='on' value="${hspemginfCustom.observationCode}" name="hspemginfCustom.observationCode" readonly></label>
    </div>
    <input class="hidden" type="text" name="hspCfjlInfCustom.cfjlSeq" value="${hspCfjlInfCustom.cfjlSeq}">
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
            <textarea id="cfjlContent" name="hspCfjlInfCustom.cfjlContent" class="longTextArea">${hspCfjlInfCustom.cfjlContent}</textarea>
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
function initAge () {
    if('${hspemginfCustom.cstAge}'){
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
    }else {
        $('#age').val('')
    }
}

/**
     * @ 签名
     */
    function getSign() {
    	var cfjlSeq = "${hspCfjlInfCustom.cfjlSeq}";
    	var emgSeq = "${hspCfjlInfCustom.emgSeq}";
    	if (cfjlSeq != null && cfjlSeq != '') {
	    	publicFun.httpServer(
	     		{ url:'${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": emgSeq,"relevanceId": cfjlSeq,"documentTable": 'HSP_CFJL_INF',"templateId":'hash_039',
		      	"request172":'可编辑抬头记录',"documentType":'9',"tag":'可编辑'}, 
		      	function (res) {
		      		if(res.resultInfo.type == 1){
			      		findDzqmImg();
		      		}
		      		message_alert(res);
                    setTimeout("$('.messager-body').window('close')", 1000);
	      	})
	     }else{
	     	publicFun.alert("请先保存数据。");
	     }
    }
    
    function findDzqmImg() {
    	var cfjlSeq = "${hspCfjlInfCustom.cfjlSeq}";
    	if (cfjlSeq != null && cfjlSeq != '') {
    		publicFun.httpServer(
	      	{ url:'${baseurl}zyylqbl/findDzqmImg.do' }, 
	      	{ "relevanceId": cfjlSeq,"documentTable": 'HSP_CFJL_INF',"documentType":'9'}, 
	      	function (res) {
	      		if(res.resultInfo.type != 1){
		      		message_alert(res);
		      		return false;
	      		}
	      		$("#dzqm").html('');
	      		var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
	      		for(var i=0; i <imgList.length; i++){
	      			var img = $("<img />")
	      			$("#dzqm").append(img.attr({"src":"data:image/jpeg;base64,"+res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg,"width":88}));
	      		}
	      	})
    	}
    }
    
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
            parent.selectType();
        }, 800)
    }, null, 'json');
}
function initMsg() {
    var checkname = $('#checkNam').val();
    $("#cfysname").focus();
    $("#cfysname").val(checkname);
    var cfjlDat = publicFun.timeFormat(new Date('${hspCfjlInfCustom.cfjlDatString}'), 'yyyy/MM/dd hh:mm:ss');
    $('.Wdate').val(cfjlDat);
    //判断是否有权限进行保存
    var _createNbr = '${hspCfjlInfCustom.cfjlNum}';//医师号
    parent.checkRole(_createNbr);
    $('#docName').val('${hspCfjlInfCustom.cfjlNam}');
    $('#docNameNum').val(_createNbr);
}
$(function() {
    initAge();
    initMsg();
    findDzqmImg();
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