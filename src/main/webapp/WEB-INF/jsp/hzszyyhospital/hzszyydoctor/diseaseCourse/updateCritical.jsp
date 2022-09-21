<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>急危值病程新增</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _btnType = 'updateCritical',
        _emgSeq = '${hspemginfCustom.emgSeq}';
  </script>
</head>

<body>
  <form id="criticaladdform" action="${baseurl}diseaseCourse/addOrEditSubmit.do" method="post">
    <div>
      <div class="all-title">
        危急值病程记录
      </div>
      <ul class="middleul">
        <li class="infoli">
          姓名：
          <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.cstNam}" />&emsp;
          性别：
          <input class="titleinputSpc" unselectable='on' readonly="readonly" value="${hspemginfCustom.cstSexCod}" />&emsp;
          年龄：
          <input class="titleinputSpc" unselectable='on' readonly="readonly" id="age" />&emsp;
          科别：
          <input class="titleinput_kb" unselectable='on' readonly="readonly" value="急诊科门诊" />&emsp;
          病历号：
          <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.mpi}" />&emsp;
          <!-- 留观号：
          <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.observationCode}"
            name="observationCode" />&emsp; -->
          <input type="hidden" name="hspDiseaseCourseCustom.emgSeqDc" value="${hspemginfCustom.emgSeq}" />
          <input type="hidden" name="hspDiseaseCourseCustom.courseType" value="4" />
          <input type="hidden" id="diseaseCourseSeq" name="hspDiseaseCourseCustom.diseaseCourseSeq" value="${hspDiseaseCourseCustom.diseaseCourseSeq}" />
        </li>

        <li>
          <p class="subtitle">
            <span class="span-left">
              危急值及报告时间
              <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('temDiv')">[导入]</a>
            </span>
          </p>
          <div class="temdiv" id="temDiv"></div>
        </li>
        <li>
          <textarea class="progressarea" id="reportingTime" name="hspDiseaseCourseCustom.reportingTime"></textarea>
        </li>
        <!-- <li>
          <p class="subtitle">
            <span class="span-left">危急值数据临床意义</span>
          </p>
        </li>
        <li>
          <textarea class="progressarea" id="criticalSignificance" name="hspDiseaseCourseCustom.criticalSignificance"></textarea>
        </li> -->
        <li>
          <p class="subtitle">
            <span class="span-left">
              处理措施
              <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
            </span>
          </p>
          <div class="temdiv" id="subTemDiv"></div>
        </li>
        <li>
          <textarea class="progressarea" id="treatmentMeasures" name="hspDiseaseCourseCustom.treatmentMeasures"></textarea>
        </li>
        <li class="rightli">
          <span>记&ensp;录&ensp;人</span>
          <span class="spanRelative">
            <!-- onkeydown="getSignList(event)" -->
            <input type="text" class="baseinput" id="docName" maxlength="10" name="hspDiseaseCourseCustom.createNam" readonly>
            <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspDiseaseCourseCustom.createDoc">
            <div class="userList" id="userNameList"></div>
          </span>
          <span id="dzqm">
          </span>
          &emsp;&emsp;日期
          <input id="coursedate" class="inputlong Wdate spcWdate" type="text" name="hspDiseaseCourseCustom.courseDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>
      </ul>
    </div>
    <textarea id="reporting" class="hidden">${hspDiseaseCourseCustom.reportingTime}</textarea>
    <!-- <textarea id="critical" class="hidden">${hspDiseaseCourseCustom.criticalSignificance}</textarea> -->
    <textarea id="treatment" class="hidden">${hspDiseaseCourseCustom.treatmentMeasures}</textarea>
  </form>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js" type="text/javascript"></script>
  <script type="text/javascript">
    function insertuser_callback(data) {
      message_alert(data);
      // setTimeout(function () {
      //   parent.selectType();
      // }, 800)
      $('#diseaseCourseSeq').val(data.resultInfo.sysdata.onlySeq);
      setTimeout(function(){
        $(".messager-body").window('close');    
      },1000);
    }

	/**
     * @ 签名
     */
    function getSign() {
    	var diseaseCourseSeq = $('#diseaseCourseSeq').val();
    	var emgSeq = "${hspemginfCustom.emgSeq}";
        if (diseaseCourseSeq != null && diseaseCourseSeq != '') {
        	publicFun.httpServer(
		      	{ url: '${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": emgSeq,"relevanceId": diseaseCourseSeq,"documentTable": 'HSP_DISEASE_COURSE',"documentType":'4'
		      	,"request172":'危急值病程记录',"tag":'危急值病程',"templateId":'hash_038'}, 
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
    	var diseaseCourseSeq = $('#diseaseCourseSeq').val();
    	if (diseaseCourseSeq != null && diseaseCourseSeq != '') {
	      publicFun.httpServer(
	      	{ url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
	      	{ "relevanceId": diseaseCourseSeq,"documentTable": 'HSP_DISEASE_COURSE',"documentType":'4'}, 
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
      jquerySubByFId('criticaladdform', insertuser_callback, null, "json");
    }

    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#age').val('')
      }
    }

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

    function getSignList(e) {
      var event = e || window.event;
      if (event.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
      }
    }
    $("body").click(function () {
      $(".userList").hide();
    });
    function initMsg() {
      initAge();
      if ('${hspDiseaseCourseCustom.diseaseCourseSeq}') {
        var _createNbr = '${hspDiseaseCourseCustom.createDoc}';//医师号
        parent.checkRole(_createNbr);
        $('#docName').val('${hspDiseaseCourseCustom.createNam}');
        $('#docNameNum').val(_createNbr);
        $('#coursedate').val('${hspDiseaseCourseCustom.courseDateStr}');
        var reportingTime = $("#reporting").html();
        $('#reportingTime').val(reportingTime);
        // var criticalSignificance = $("#critical").html();
        // $('#criticalSignificance').val(criticalSignificance);
        var treatmentMeasures = $("#treatment").html();
        $('#treatmentMeasures').val(treatmentMeasures);
      } else {
        $('#docName').val('${activeUser.usrname}');
        $('#docNameNum').val('${activeUser.usrno}');
        var newTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#coursedate').val(newTime);
      }
    }
    $(function () {
      initMsg();
      findDzqmImg();
      initDocImportHtml('temDiv', 'reportingTime')
      initDocImportHtml('subTemDiv', 'treatmentMeasures')
    })
  </script>
</body>

</html>