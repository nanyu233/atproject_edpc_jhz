<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>会诊记录新增</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _emgSeq = "${hspemginfCustom.emgSeq}";
  </script>
</head>

<body>
  <form id="addform" action="${baseurl}consultation/addOrEditSubmit.do" method="post">
    <div>
      <div class="all-title2">
        会诊申请单
      </div>
      <ul class="middleul" id="applyul">
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
        </li>
        <li class="selectli">
          <div class="inlinediv">
            <span class="ptitle">邀请会诊科室：</span>
            <input type="text" value="${hspConsultationRecordsCustom.invitationDep}" name="hspConsultationRecordsCustom.invitationDep"
              class="inviteDepName inputlong" placeholder="拼音简写查询或输入内容" onkeydown="openQuery(event)" />
            <a href="javascript:;" class="easyui-linkbutton btnemp queryStr" iconCls="icon-search" onclick="addinvitationDepStr()">查询</a>
            <!-- <input type="hidden" name="hspConsultationRecordsCustom.invitationDep" value="${hspConsultationRecordsCustom.invitationDep}"/> -->
          </div>

          <div class="inlinediv">
            &emsp;<span class="ptitle">医生：</span>
            <input type="text" id="doctorParam" name="hspConsultationRecordsCustom.invitationDocNme" value="${hspConsultationRecordsCustom.invitationDocNme}">
            <input type="hidden" id="doctorid" name="hspConsultationRecordsCustom.invitationDocCod" value="${hspConsultationRecordsCustom.invitationDocCod}"/> 
            <a href="javascript:;" class="easyui-linkbutton btnemp" iconCls="icon-search" id="doctorParamSearch" onclick="addinvitationDoc()">查询</a>
            <div class="doctorList" id="doctorList"></div>
            <!-- <label class="error errortip" id="doctip"></label>  -->
          </div>

        </li>
        <li>
          <span class="ptitle">邀请会诊时间：</span>
          <input id="invitationDate" class="inputlong Wdate spcWdate" type="text" name="hspConsultationRecordsCustom.invitationDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">病情摘要<a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true"
                onclick="showTem()">[导入]</a></span>
          </p>
          <p>
            <div class="temdiv" id="temdiv"></div>
          </p>
        </li>
        <li>
          <textarea class="progressarea" id="xtpghznr" name="hspConsultationRecordsCustom.illnessState">${hspConsultationRecordsCustom.illnessState}</textarea>
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">会诊要求、目的</span>
          </p>
        </li>
        <li>
          <textarea class="progressarea" id="objective" name="hspConsultationRecordsCustom.objective">${hspConsultationRecordsCustom.objective}</textarea>
        </li>
        <li class="rightli3">
          	申请科室
          <input class="baseinput" id="applyDepStr" readonly="readonly" value="急诊科门诊" />
          &emsp;&emsp;申请人
          <!-- <input class="baseinput" id="applyDocUser" readonly="readonly" value="${hspConsultationRecordsCustom.applyDocName}" /> -->
          <div class="spanRelative">
            <!-- onkeydown="getSignList(event, 'applyDocUser')" -->
            <input type="text" class="baseinput" id="applyDocUser" maxlength="10" name="hspConsultationRecordsCustom.applyDocName" readonly>
            <input type="text" class="hidden" id="applyDocUserNum" maxlength="10" name="hspConsultationRecordsCustom.applyDoc">
            <div class="userList" id="applyDocUserList"></div>
          </div>
          <span id="dzqmsq"></span>
        </li>
      </ul>

      <hr class="hr0" />

      <ul class="middleul" id="replyul">
      	<li style="margin-bottom: 10px;margin-top: 10px">
      		<span class="ptitle titleemp">签到时间：</span>
          <input id="consultationDate" class="inputlong Wdate spcWdate" type="text" name="hspConsultationRecordsCustom.consultationDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          <input id="consultationDate2" class="inputlong Wdate spcWdate" type="hidden" name="hspConsultationRecordsCustom.consultationDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      	</li>
        <li>
          <span class="ptitle">答复：</span>
          <input class="answerinput" id="replyContent" maxlength="50" value="${hspConsultationRecordsCustom.replyContent}"
            name="hspConsultationRecordsCustom.replyContent" />
          &emsp;&emsp;&emsp;
          <span class="ptitle titleemp">会诊时间：</span>
          <input id="replyCreateDate" class="inputlong Wdate spcWdate" type="text" name="hspConsultationRecordsCustom.replyCreateDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          <input id="replyCreateDate2" class="inputlong Wdate spcWdate" type="hidden" name="hspConsultationRecordsCustom.replyCreateDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>

        <li>
          <p class="subtitle">
            <span class="span-left">会诊意见</span>
          </p>
          <input class="hidden" type="text" value="0" name="hspConsultationRecordsCustom.replySrc"/>
        </li>
        <li>
          <textarea class="progressarea" id="consultationOpinion" name="hspConsultationRecordsCustom.consultationOpinion"
          ondblclick="showMsg('consultationOpinion', '')">${hspConsultationRecordsCustom.consultationOpinion}</textarea>
        </li>
        <li class="rightli3">        
          	会诊科室
          <input class="baseinput" name="replyDepStr" readonly="readonly" value="${hspConsultationRecordsCustom.replyDepStr}"
            onclick="replyinvitationDepStr()" />
          <input type="hidden" name="hspConsultationRecordsCustom.replyDep" value="${hspConsultationRecordsCustom.replyDep}" />
          &emsp;&emsp;会诊医生
          <div class="spanRelative">
            <input type="text" class="baseinput" id="replyDocUser" maxlength="10" name="hspConsultationRecordsCustom.replyDocName" onkeydown="getSignList(event, 'replyDocUser')">
            <input type="text" class="hidden" id="replyDocUserNum" maxlength="10" name="hspConsultationRecordsCustom.replyDoc">
            <div class="userList" id="replyDocUserList"></div>
          </div>
          <span id="dzqmhf"></span>
        </li>
        <textarea id="xbs2value" class="hidden">${hspLqblInfCustom.fzjcDes}</textarea>
        <textarea id="xbsvalue" class="hidden">${hspLqblInfCustom.nowHis}</textarea>
        <textarea id="lqxxvalue" class="hidden">${hspLqblInfCustom.lqblCont}</textarea>
        <textarea id="tgjcvalue" class="hidden">${hspLqblInfCustom.tgjcMergeStr}</textarea>
        <textarea id="zsvalue" class="hidden">${hspLqblInfCustom.lqblDes}</textarea>
        <input type="hidden" name="hspConsultationRecordsCustom.emgSeqCr" value="${hspemginfCustom.emgSeq}" />
        <input type="hidden" name="recordFlag" value="${recordFlag}" />
        <input type="hidden" id="consultationRecordsSeq" name="hspConsultationRecordsCustom.consultationRecordsSeq" value="${hspConsultationRecordsCustom.consultationRecordsSeq}" />
      </ul>
    </div>

  </form>
  <script language="javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js"></script>
  <script type="text/javascript">
    function getSignList(e, name) {
      if (e.keyCode == 13) {
        publicFun.SearchList(name, name + 'List');
      }
    }
    $("body").click(function () {
      $(".userList").hide();
    });

    function openQuery(e) {
      var evt = window.event || e;
      if (evt.keyCode == 13) {
        addinvitationDepStr()
      }
    }
    function addinvitationDepStr() {
      createmodalwindow("邀请会诊科室", 600, 385, '${baseurl}qjs/querydep.do?inviteFlg=updateConsultation&inviteValue=' + $('.inviteDepName').val(), 'no');
    }

    function replyinvitationDepStr() {
      createmodalwindow("邀请会诊科室", 600, 385, '${baseurl}qjs/querydep.do', 'no');
    }

    function showMsg (name, seo) {
      parent.createmodalwindow('电子病历知识库', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?idName=' + name + '&tempSeo=' + seo + '&emgSeq=${hspemginfCustom.emgSeq}&typeFrm=checkFrm&isCheckSource=checkBox', 'no');
    }

    function insertuser_callback(data, type) {
      message_alert(data);
      if (type === 'continue') { // 保存并继续
        var _cleanList = ['emg_emgFkName', 'doctorParam', 'invitationDate'];
        for (var i = 0; i < _cleanList.length; i++) {
          $('#' + _cleanList[i]).val('')
        }
        $('#applyDocUser').val('${sessionScope.activeUser.usrname}');
        $('#applyDocUserNum').val('${sessionScope.activeUser.usrno}')
      } else {
        // setTimeout(function () {
        //    parent.showList();
        // }, 800)
        $('#consultationRecordsSeq').val(data.resultInfo.sysdata.onlySeq);
      }
      setTimeout(function(){
        $(".messager-body").window('close');    
      },1000);
    }

    function addinvitationDoc() {
      var doctorParam = $("#doctorParam").val();
      var cstDepCod = $("#emg_emgFkCod").val();
      if (doctorParam != "") {
        cstDepCod = "";
      }
      $.ajax({
        url: "${baseurl}user/queryDoc.do",
        type: "post",
        data: {
          queryLike: doctorParam,
          cstDepCod: cstDepCod
        }
      }).done(function (res) {
        var doctorListDom = "";
        if (res.length) {
          $("#doctorList").show();
          $.each(res, function (idx, val) {
            doctorListDom += "<li class=\"doctor\" onclick=\"chooseDoctor('" + val.usrno + "','" + val.usrname + "')\">" + val.usrname + "</li>";
          });
          doctorListDom = "<ul>" + doctorListDom + "</ul>";
        } else {
          $("#doctorList").hide();
          $("#doctip").show();
          $("#doctip").text("无数据")
        }
        $("#doctorParam").val("");
        $("#doctorList").html(doctorListDom);
      })
    }

    function stopPropagation(e) {
      if (e.stopPropagation)
        e.stopPropagation();
      else
        e.cancelBubble = true;
    }

    $(document).bind('click', function () {
      $('#doctorList').css('display', 'none');
    });

    $('#doctorList').bind('click', function (e) {
      stopPropagation(e);
    });

    function chooseDoctor(id, name) {
      $("#doctorParam").val(name);
      $("#doctorid").val(id);
      $("#doctorList").html("");
      $("#doctorList").hide();
      $("#doctip").hide();
      if (sessionStorage.getItem("isValidateFormForHzdj") == "true") {
        validateForm()
      }
    }
    
    /**
     * @ 签名
     */
    function getSignsq() {
    	var consultationRecordsSeq = $('#consultationRecordsSeq').val();
        if (consultationRecordsSeq != null && consultationRecordsSeq != '') {
        	publicFun.httpServer(
		      	{ url: '${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": _emgSeq,"relevanceId": consultationRecordsSeq,"documentTable": 'HSP_CONSULTATION_RECORDS',"templateId":'hash_045'
		      	,"request172":'会诊记录','documentType':'1'}, 
		      	function (res) {
		      		if(res.resultInfo.type == 1){
			      		findDzqmImgsq();
	      			}
	      		message_alert(res);
            setTimeout("$('.messager-body').window('close')", 1000);
	      	})
        }else{
        	publicFun.alert("请先保存数据。");
        }
    }
    
    function findDzqmImgsq() {
      var consultationRecordsSeq = $('#consultationRecordsSeq').val();
      if (consultationRecordsSeq != null && consultationRecordsSeq != '') {
      	 publicFun.httpServer(
      	{ url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
      	{ "relevanceId": consultationRecordsSeq,"documentTable": 'HSP_CONSULTATION_RECORDS','documentType':'1'}, 
      	function (res) {
      		if(res.resultInfo.type != 1){
	      		message_alert(res);
	      		return false;
      		}
      		$("#dzqmsq").html('');
      		var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
      		for(var i=0; i <imgList.length; i++){
      			var img = $("<img />")
      			$("#dzqmsq").append(img.attr({"src":"data:image/jpeg;base64,"+res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg,"width":88}));
      		}
      	})
      }
    }
    
    /**
     * @ 签名
     */
    function getSignhf() {
    	var consultationRecordsSeq = $('#consultationRecordsSeq').val();
        if (consultationRecordsSeq != null && consultationRecordsSeq != '') {
        	publicFun.httpServer(
		      	{ url: '${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": _emgSeq,"relevanceId": consultationRecordsSeq,"documentTable": 'HSP_CONSULTATION_RECORDS',"templateId":'hash_045'
		      	,"request172":'会诊记录','documentType':'2'}, 
		      	function (res) {
		      		if(res.resultInfo.type == 1){
			      		findDzqmImghf();
	      			}
	      		message_alert(res);
            setTimeout("$('.messager-body').window('close')", 1000);
	      	})
        }else{
        	publicFun.alert("请先保存数据。");
        }
    }
    
    function findDzqmImghf() {
      var consultationRecordsSeq = $('#consultationRecordsSeq').val();
      if (consultationRecordsSeq != null && consultationRecordsSeq != '') {
      	 publicFun.httpServer(
      	{ url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
      	{ "relevanceId": consultationRecordsSeq,"documentTable": 'HSP_CONSULTATION_RECORDS','documentType':'2'}, 
      	function (res) {
      		if(res.resultInfo.type != 1){
	      		message_alert(res);
	      		return false;
      		}
      		$("#dzqmhf").html('');
      		var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
      		for(var i=0; i <imgList.length; i++){
      			var img = $("<img />")
      			$("#dzqmhf").append(img.attr({"src":"data:image/jpeg;base64,"+res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg,"width":88}));
      		}
      	})
      }
    }

    function saveForm (type) {
      publicFun.cleanSignMsg('applyDocUser');
      publicFun.cleanSignMsg('replyDocUser');
      var emg = $('#emg_emgFkName').val();
      var inDate = $('#invitationDate').val();
      var conDate = $('#consultationDate').val();
      var reply = $('#replyCreateDate').val();
      var conOp = $('#replyContent').val();
      var recordFlag = '${recordFlag}';
      if (recordFlag == 'apply') {
        if (emg == null || emg == "") {
          alert_error('邀请会诊科室必填!');
        } else if (inDate == null || inDate == "") {
          alert_error('邀请会诊时间必填!');
        } else if (publicFun.strTrim($('#applyDocUser').val()) === '') {
          alert_error('申请人必填!');
        } else {
          jquerySubByFId('addform', insertuser_callback, type, "json");
        }
      } else {
        if (reply == null || reply == "") {
          alert_error('会诊时间必填!');
        } else if (conOp == null || conOp == "") {
          alert_error('答复必填!');
        } else if (publicFun.strTrim($('#replyDocUser').val()) === '') {
          alert_error('会诊医生必填!');
        } else {
          jquerySubByFId('addform', insertuser_callback, type, "json");
        }
      }
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

    $("#doctorParam").keyup(function (event) {
      if (event.keyCode == 13) {
        $("#doctorParamSearch").click()
      }
    })
    function setIsDisable(list, flg) {
      for (var i = 0; i < list.length; i++) {
        document.getElementById(list[i]).disabled = flg;
      }
    }
    
    function initMsg () {
      var newtime = '${hspConsultationRecordsCustom.invitationDateStr}';
      if (newtime != '' && newtime != null) {
        $('#invitationDate').val(newtime);
      }
      var qdtime = '${hspConsultationRecordsCustom.consultationDateStr}';
      if (qdtime != '' && qdtime != null) {
        $('#consultationDate').val(qdtime);
        $('#consultationDate2').val(qdtime);
      }
      var hztime = '${hspConsultationRecordsCustom.replyCreateDateStr}';
      if (hztime != '' && hztime != null) {
        $('#replyCreateDate').val(hztime);
        $('#replyCreateDate2').val(hztime);
      }
      if ('${hspConsultationRecordsCustom.invitationDocNme}' === '' && '${hspConsultationRecordsCustom.consultationRecordsSeq}' === '') {
        document.getElementById('doctorParam').value = ''
      }
      var recordFlag = '${recordFlag}';
      if (recordFlag == "apply") {
        $("input[name='hspConsultationRecordsCustom.invitationDep']").attr('id', 'emg_emgFkName');
        $("input[name='replyDepStr']").attr('id', 'displayDepStr');
        $("input[name='hspConsultationRecordsCustom.replyDep']").attr('id', 'displayDep');
        setIsDisable(['emg_emgFkName', 'invitationDate', 'objective', 'xtpghznr', 'applyDocUser', 'doctorParam'], false);
        setIsDisable(['displayDepStr', 'displayDep', 'replyContent','replyCreateDate', 'consultationOpinion', 'replyDocUser', 'consultationDate'], true);
        $('#consultationDate').attr('readonly',true);
        $('#replyCreateDate').attr('readonly',true);
        $("#doctorParamSearch").attr('onclick', 'addinvitationDoc()');
        // var applyDepStr = $('#applyDepStr').val();
        // if (applyDepStr == '' || applyDepStr == null) {
        //   // $('#applyDepStr').val('${sessionScope.activeUser.sysmc}');
        //   // 会诊申请单，申请科室默认放急诊科门诊
        //   $('#applyDepStr').val('急诊科门诊');
        // } else {
        //   $('#applyDepStr').val(applyDepStr);
        // }
        //判断是否有权限进行保存
        var _cratNbr = '${hspConsultationRecordsCustom.applyDoc}';//申请医生号
        parent.checkRole(_cratNbr);
      } else {
        $('.queryStr').hide()
        $("input[name='hspConsultationRecordsCustom.invitationDep']").attr('id', 'displayDep');
        $("input[name='replyDepStr']").attr('id', 'emg_emgFkName');
        $("input[name='hspConsultationRecordsCustom.replyDep']").attr('id', 'emg_emgFkCod');
        setIsDisable(['emg_emgFkName', 'replyDocUser', 'replyContent' ,'replyCreateDate', 'consultationOpinion'], false);
        setIsDisable(['displayDep', 'invitationDate', 'objective', 'xtpghznr', 'applyDocUser', 'doctorParam', 'consultationDate'], true);
        $('#invitationDate').attr('readonly',true);
        $("#doctorParamSearch").removeAttr('onclick');
        var replyDepStr = '${hspConsultationRecordsCustom.replyDepStr}';
        if (replyDepStr == '' || replyDepStr == null) {
          $("input[name='replyDepStr']").val('${sessionScope.activeUser.sysmc}');
        } else {
          $("input[name='replyDepStr']").val(replyDepStr);
        }
        $("input[name='replyDepStr']").addClass('whiteInput');
        $('#replyDocUser').val('${sessionScope.activeUser.usrname}');
        $('#replyDocUserNum').val('${sessionScope.activeUser.usrno}')
        var replyDep = '${hspConsultationRecordsCustom.replyDep}';
        if (replyDep == '' || replyDep == null) {
          $("input[name='hspConsultationRecordsCustom.replyDep']").val('${sessionScope.activeUser.sysid}');
        } else {
          $("input[name='hspConsultationRecordsCustom.replyDep']").val(replyDep);
        }
      }
      if ('${hspConsultationRecordsCustom.consultationRecordsSeq}') {
        if ('${hspConsultationRecordsCustom.applyDocName}') {
          $('#applyDocUser').val('${hspConsultationRecordsCustom.applyDocName}');
          $('#applyDocUserNum').val('${hspConsultationRecordsCustom.applyDoc}');
        }
        if ('${hspConsultationRecordsCustom.replyDocName}') {
          $('#replyDocUser').val('${hspConsultationRecordsCustom.replyDocName}');
          $('#replyDocUserNum').val('${hspConsultationRecordsCustom.replyDoc}');
        }
      } else {
        $('#applyDocUser').val('${sessionScope.activeUser.usrname}');
        $('#applyDocUserNum').val('${sessionScope.activeUser.usrno}')
        // $('#replyDocUser').val('${sessionScope.activeUser.usrname}');
        // $('#replyDocUserNum').val('${sessionScope.activeUser.usrno}')
      }
      if (parent._resultId == 'nurse' || parent._resultId == 'tourist' || parent.parent.pageFlg) {
        if (parent._resultId == 'nurse' ) {
          var roleList = '${sessionScope.activeUser.dstroleList}';
          if (roleList.indexOf('1004') != -1){
            $('#applyul input, #applyul textarea, #applyul select').attr('disabled', true);
            $('.atitle').hide()
          } else{
            $('form input, form textarea, form select').attr('disabled', true);
            $('.atitle').hide()
          }
        } else {
          $('form input, form textarea, form select').attr('disabled', true);
          $('.atitle').hide()
        }
      }
    }/////////////////////////////

    $(function () {
      // $("#doctip").hide();
      initAge();
      initMsg();
      findDzqmImgsq();
      findDzqmImghf();
      // 所有的文本框都设置不填充
      $('input:not([autocomplete]),textarea:not([autocomplete]),select:not([autocomplete])').attr('autocomplete', 'off'); 
    })
  </script>
</body>

</html>