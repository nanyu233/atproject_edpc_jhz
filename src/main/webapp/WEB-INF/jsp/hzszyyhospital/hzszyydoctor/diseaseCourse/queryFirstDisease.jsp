<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>首次病程</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    var _emgSeq = '${hspemginfCustom.emgSeq}',
        _btnType = 'queryFirstDisease';
  </script>
</head>

<body>
  <form id="firstform" action="${baseurl}diseaseCourse/addOrEditFirstSubmit.do" method="post">
    <div>
      <div class="all-title">
        首次病程记录
      </div>
      <ul class="middleul">
        <li class="infoli">
          姓名：
          <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.cstNam}" />&emsp;
          性别：
          <input class="titleinputSpc" readonly="readonly" unselectable='on' value="${hspemginfCustom.cstSexCod}" />&emsp;
          年龄：
          <input class="titleinputSpc" readonly="readonly" unselectable='on' id="age" />&emsp;
          科别：
          <input class="titleinput_kb" readonly="readonly" unselectable='on' value="急诊科门诊" />&emsp;
          病历号：
          <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.mpi}" />&emsp;
          <!-- 留观号：
          <input class="titleinput" readonly="readonly" unselectable='on' value="${hspemginfCustom.observationCode}"
            name="observationCode" maxlength="10" />&emsp; -->
          <input type="hidden" name="hspDiseaseCourseCustom.emgSeqDc" value="${hspemginfCustom.emgSeq}" />
          <input type="hidden" name="hspDiseaseCourseCustom.courseType" value="1" />
          <input id="diseaseCourseSeq" type="hidden" name="hspDiseaseCourseCustom.diseaseCourseSeq" value="${hspDiseaseCourseCustom.diseaseCourseSeq}" />
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">一、病例特点<a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true"
                onclick="showTem()">[导入]</a></span>
          </p>
          <p>
            <div class="temdiv" id="temdiv"></div>
          </p>
        </li>
        <li>
          <textarea class="diseasePointarea" id="xtpghznr" name="hspDiseaseCourseCustom.diseasePoint">${hspDiseaseCourseCustom.diseasePoint}</textarea>
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">二、初步诊断<span class="ptitle"><a class="my-linkbutton" data-options="toggle:true,plain:true" onclick="addPreDgnCod(2, '1')">[查看]</a></span></span>
          </p>
        </li>
        <li class="infoli2 no-height-li">
          <div class="areareadonly progressinput" id="show_text2">${hspemginfCustom.jbzdDes}</div>
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">
              三、诊疗计划
              <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
            </span>
          </p>
          <div class="temdiv" id="subTemDiv"></div>
        </li>
        <li>
          <textarea class="progressarea" name="hspDiseaseCourseCustom.treatmentPlan" id="treatmentPlanText" ondblclick="showMsg('treatmentPlanText', '564')">${hspDiseaseCourseCustom.treatmentPlan}</textarea>
        </li>
        <li class="rightli">
          <span>医师签名</span>
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
        <textarea id="xbs2value" class="hidden">${hspLqblInfCustom.fzjcDes}</textarea>
        <textarea id="xbsvalue" class="hidden">${hspLqblInfCustom.nowHis}</textarea>
        <textarea id="lqxxvalue" class="hidden">${hspLqblInfCustom.lqblCont}</textarea>
        <textarea id="tgjcvalue" class="hidden">${hspLqblInfCustom.tgjcMergeStr}</textarea>
        <textarea id="zsvalue" class="hidden">${hspLqblInfCustom.lqblDes}</textarea>
      </ul>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/diseaseCourse/printDiseaseCourse.jsp"></jsp:include>
  <script language="javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js"></script>
  <script type="text/javascript">
    function showMsg(name, seo) {
      parent.parent.createmodalwindow('电子病历知识库', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?idName=' + name + '&tempSeo=' + seo + '&typeFrm=myFrame' + '&emgSeq=${hspemginfCustom.emgSeq}', 'no');
    }
    function getSignList (e) {
      var event = e || window.event;
      if (event.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
      }
    }

    $("body").click(function () {
      $("#userNameList").hide();
    });
    
    function addPreDgnCod(num, type) {
      var _title = '';
      var _list = [{ cod: 2, name: '初步诊断' }];
      $.each(_list, function (idx, val) {
        if (val.cod == num) {
          _title = val.name
        }
      })
      createmodalwindow(_title, 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${hspemginfCustom.emgSeq}&&jbzdType=' + type + '&&trnumber=' + num, 'no');
    }

    function insertuser_callback(data) {
      message_alert(data);
      setTimeout(function () {
        window.location.reload();
      }, 800)
    }

	/**
     * @ 签名
     */
    function getSign() {
    	var diseaseCourseSeq = $("#diseaseCourseSeq").val();
        if (diseaseCourseSeq != null && diseaseCourseSeq != '') {
        	publicFun.httpServer(
		      	{ url: '${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": _emgSeq,"relevanceId": diseaseCourseSeq,"documentTable": 'HSP_DISEASE_COURSE',"documentType":'1',"templateId":'hash_037'
		      	,"request172":'首次病程记录'}, 
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
    	var diseaseCourseSeq = $("#diseaseCourseSeq").val();
	    if (diseaseCourseSeq != null && diseaseCourseSeq != '') {
	      publicFun.httpServer(
	      	{ url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
	      	{ "relevanceId": diseaseCourseSeq,"documentTable": 'HSP_DISEASE_COURSE',"documentType":'1'}, 
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
      jquerySubByFId('firstform', insertuser_callback, null, "json");
    }

    /**
     * @ 删除
     */
    function delMsg() {
      _confirm('确定删除该数据吗？', null, function () {
        var diseaseCourseSeq = $("#diseaseCourseSeq").val();
        if (diseaseCourseSeq != null && diseaseCourseSeq != '') {
          $.ajax({
            url: "${baseurl}diseaseCourse/deleteFirstForm.do",
            type: "post",
            data: {
              "diseaseCourseSeq": diseaseCourseSeq
            },
            success: function (data) {
              message_alert(data);
              setTimeout(function () {
                window.location.reload();
              }, 800)
            }
          })
        }
      });
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

    function initMsg () {
      if ('${hspDiseaseCourseCustom.diseaseCourseSeq}') {
        var _createNbr = '${hspDiseaseCourseCustom.createDoc}';//医师号
        parent.checkRole(_createNbr,'first');
        $('#docName').val('${hspDiseaseCourseCustom.createNam}');
        $('#docNameNum').val(_createNbr);
        $('#coursedate').val('${hspDiseaseCourseCustom.courseDateStr}');
      } else {
        $('#docName').val('${activeUser.usrname}');
        $('#docNameNum').val('${activeUser.usrno}');
        var newTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#coursedate').val(newTime);
        parent.checkRole('${activeUser.usrno}','first');
      }
    }

    $(function () {
      initAge();
      initMsg();
      findDzqmImg();
      initDocImportHtml('subTemDiv', 'treatmentPlanText')
      initBtnHtml();
    })
  </script>
</body>

</html>