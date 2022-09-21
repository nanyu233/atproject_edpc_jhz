<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>抢救记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/at-form.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/jjbjlEditAdd.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _btnType = 'updateQjjl',
      _emgSeq = '${hspemginfCustom.emgSeq}';
  </script>
</head>

<body class="titlebody saveRecord">
  <h1 class="title">抢救记录</h1>
  <form class="at-form" id="saveRecordForm" action="${baseurl}zyylqbl/editqjjl.do" method="post" style="border-bottom: none;">
    <input class="hidden" type="text" name="hspQjjlInfCustom.qjjlSeq" value="${hspQjjlInfCustom.qjjlSeq}">
    <div class="basicDiv">
      <label class="bascilab">姓名：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstNam}"
          readonly></label>
      <label class="bascilab">性别：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.cstSexCod}"
          readonly></label>
      <label class="bascilab cstAgelab">年龄：<input class="basicInput" unselectable='on' id="age" type="text" readonly></label>
      <label class="bascilab">科别：<input class="basicInput longbasicInput" unselectable='on' type="text" value="急诊科门诊"
          readonly></label>
      <label class="bascilab">病历号：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.mpi}"
          readonly></label>
      <label class="bascilab">留观号：<input class="basicInput" unselectable='on' type="text" value="${hspemginfCustom.observationCode}"
          name="hspemginfCustom.observationCode" readonly></label>
    </div>
    <div class="at-form-item clr">
      <label class="at-form-item__label">抢救时间</label>
      <div class="at-form-item__content">
        <input class="Wdate" id="qjjlDat" type="text" name="hspQjjlInfCustom.qjjlDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
          style="width: 145px;">
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="at-form-item__label">抢救人员</label>
      <div class="at-form-item__content">
        <input id="qjjlJlnam" type="text" name="hspQjjlInfCustom.qjjlJlnam" value="${hspQjjlInfCustom.qjjlJlnam}"
          maxlength="50" style="width: 100%;box-sizing: border-box;">
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="at-form-item__label">类&emsp;&emsp;别</label>
      <div class="at-form-item__content">
        <label class="qjjlIsSucc" for="qjjlIsSucc0">
          <input id="qjjlIsSucc0" type="radio" name="hspQjjlInfCustom.qjjlIsSucc" value="0" <c:if test="${hspQjjlInfCustom.qjjlIsSucc eq '0'}">checked="checked"</c:if>>
          成功
        </label>
        <label class="qjjlIsSucc" for="qjjlIsSucc1">
          <input id="qjjlIsSucc1" type="radio" name="hspQjjlInfCustom.qjjlIsSucc" value="1" <c:if test="${hspQjjlInfCustom.qjjlIsSucc eq '1'}">checked="checked"</c:if>>
          失败
        </label>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="at-form-item__label">
        记录内容
        <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
      </label>
      <div class="tem-div left-tem-div" id="subTemDiv"></div>
      <div class="at-form-item__content">
        <textarea id="qjjlContent" name="hspQjjlInfCustom.qjjlContent" class="longTextArea">${hspQjjlInfCustom.qjjlContent}</textarea>
      </div>
    </div>
    <div class="recorder clr">
      <div class="recorder__content">
        <input class="Wdate" id="qjjlJldat" type="text" name="hspQjjlInfCustom.qjjlJldat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
          style="width: 145px;">
      </div>
      <label class="recorder__label">记录时间</label>     
      <div class="recorder__content">
        <span class="spanRelative">
          <!-- onkeydown="getSignList(event)" -->
          <input type="text" id="docName" maxlength="10" name="hspQjjlInfCustom.qjjlNam" readonly>
          <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspQjjlInfCustom.qjjlNum">
          <div class="userList" id="userNameList"></div>
        </span>
        <span id="dzqm"></span>
      </div>
      <label class="recorder__label">记&ensp;录&ensp;人</label>
      
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
    function saveForm() {
      publicFun.cleanSignMsg('docName');
      var qjjlDat = $('.Wdate').val();
      if (qjjlDat == '') {
        publicFun.alert('请输入时间');
        return false;
      }
      jquerySubByFId('saveRecordForm', function (res) {
        message_alert(res);
        setTimeout(function () {
          parent.selectType();
        }, 800)
      }, null, 'json');
    }
    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#age').val('')
      }
    }
    function initMsg() {
      if ('${hspQjjlInfCustom.qjjlDatString}') {
        $('#qjjlDat').val('${hspQjjlInfCustom.qjjlDatString}');
      }
       if ('${hspQjjlInfCustom.qjjlJldatString}') {
        $('#qjjlJldat').val('${hspQjjlInfCustom.qjjlJldatString}');
      }
      initAge();
      //判断是否有权限进行保存
      var _createNbr = '${hspQjjlInfCustom.qjjlNum}';//医师号
      parent.checkRole(_createNbr);
      $('#docName').val('${hspQjjlInfCustom.qjjlNam}');
      $('#docNameNum').val(_createNbr);
    }
    /**
     * @ 签名
     */
    function getSign() {
    	var qjjlSeq = "${hspQjjlInfCustom.qjjlSeq}";
        if (qjjlSeq != null && qjjlSeq != '') {
        	publicFun.httpServer(
		      	{ url: '${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": _emgSeq,"relevanceId": qjjlSeq,"documentTable": 'HSP_QJJL_INF',"templateId":'hash_044'
		      	,"request172":'抢救记录'}, 
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
      var qjjlSeq = "${hspQjjlInfCustom.qjjlSeq}";
      if (qjjlSeq != null && qjjlSeq != '') {
      	 publicFun.httpServer(
      	{ url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
      	{ "relevanceId": qjjlSeq,"documentTable": 'HSP_QJJL_INF'}, 
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
    $(function () {
      initMsg();
      findDzqmImg();
      initDocImportHtml('subTemDiv', 'qjjlContent')
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