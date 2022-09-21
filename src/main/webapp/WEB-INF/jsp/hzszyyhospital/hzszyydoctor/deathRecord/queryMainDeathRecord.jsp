<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>死亡记录</title>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script>
    var _emgSeq = '${hspemginfCustom.emgSeq}';
  </script>
</head>

<body>
  <form id="addform" action="${baseurl}deathRecord/addOrEditFirstSubmit.do" method="post">
    <input type="hidden" name="formToken" value="${formToken}" />
    <div>
      <div class="all-title2">
        死亡记录
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
          <input type="hidden" name="hspDeathRecordCustom.emgSeqDr" value="${hspemginfCustom.emgSeq}" />
          <input id="deathRecordSeq" type="hidden" name="hspDeathRecordCustom.deathRecordSeq" value="${hspDeathRecordCustom.deathRecordSeq}" />
        </li>
        <li>
          <span class="ptitle m-l5">入观时间：</span>
          <input id="comeTimeStr" class="inputlong Wdate spcWdate" type="text" name="hspDeathRecordCustom.comeTime"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          <span class="ptitle nearight">死亡时间：</span>
          <input id="deathTime" class="inputlong Wdate spcWdate" type="text" name="hspDeathRecordCustom.deathTime"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">入观情况<a class="my-linkbutton btna atitle importBtnLink" data-options="toggle:true,plain:true"
                onclick="showTem()">[导入]</a></span>
          </p>
          <p>
            <div class="temdiv" id="temdiv"></div>
          </p>
        </li>
        <li>
          <textarea class="progressarea" id="xtpghznr" name="hspDeathRecordCustom.comeSituation">${hspDeathRecordCustom.comeSituation}</textarea>
        </li>
        <li class="infoli no-height-lis">
          <span class="ptitle span-left">
            <a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod(2, '1')">[查看]</a>
            入观诊断
          </span>
          <div class="progressinput2 areareadonly" id="show_text2">${hspemginfCustom.jbzdDes}</div>
        </li>
        <li>
          <p class="subtitle">
            <span class="span-left">诊疗经过</span>
            <!-- <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="inputtreatment()">[导入]</a> -->
          </p>
        </li>
        </li>
        <li>
          <textarea class="progressarea" id="treatmentProcess" name="hspDeathRecordCustom.treatmentProcess">${hspDeathRecordCustom.treatmentProcess}</textarea>
        </li>
        <p class="subtitle">
          <span class="span-left">死亡原因</span>
        </p>
        </li>
        <li>
          <textarea class="progressarea" id="causeDeath" name="hspDeathRecordCustom.causeDeath">${hspDeathRecordCustom.causeDeath}</textarea>
        </li>
        <li class="infoli no-height-lis">
          <span class="ptitle span-left"><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod(5, '4')">[查看]</a>死亡诊断</span>
          <div class="progressinput2 areareadonly" id="show_text5">${hspemginfCustom.deathDiagnosis}</div>
        </li>
        <li class="rightli">
          <span>医师签名</span>
          <span class="spanRelative">
            <!-- onkeydown="getSignList(event)" -->
            <input type="text" class="baseinput" id="docName" maxlength="10" name="hspDeathRecordCustom.createNam" readonly>
            <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspDeathRecordCustom.createDoc">
            <div class="userList" id="userNameList"></div>
          </span>
          <span id="dzqm">
          </span>
          &emsp;&emsp;日期
          <input id="coursedate" class="inputlong Wdate spcWdate" type="text" name="hspDeathRecordCustom.courseDate"
            onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        </li>
        <textarea id="xbs2value" class="hidden">${hspLqblInfCustom.fzjcDes}</textarea>
        <textarea id="xbsvalue" class="hidden">${hspLqblInfCustom.nowHis}</textarea>
        <textarea id="zdjgvalue" class="hidden">${hspDeathRecordCustom.treatmentPlan}</textarea>
        <textarea id="lqxxvalue" class="hidden">${hspLqblInfCustom.lqblCont}</textarea>
        <textarea id="tgjcvalue" class="hidden">${hspLqblInfCustom.tgjcMergeStr}</textarea>
        <textarea id="zsvalue" class="hidden">${hspLqblInfCustom.lqblDes}</textarea>
      </ul>
    </div>
  </form>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/deathRecord/printDeathRecord.jsp"></jsp:include>
  <script language="javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js"></script>
  <script type="text/javascript">
    function getSignList(e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
      }
    }
    $("body").click(function () {
      $(".userList").hide();
    });
    function addPreDgnCod(num, type) {
      // num 子页面 id 索引值 
      var _title = '',canEdit = '';
      if (num == 5) {
        if (parent.isOpenBox == false) {
          canEdit = '';
        } else {
          canEdit = 'canEdit';
        }
      }
      var _list = [{ cod: 2, name: '入院诊断' }, { cod: 5, name: '死亡诊断' }];
      $.each(_list, function (idx, val) {
        if (val.cod == num) {
          _title = val.name
        }
      })
      createmodalwindow(_title, 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${hspemginfCustom.emgSeq}' + '&trnumber=' + num + '&jbzdType=' + type + '&canEditZd=' + canEdit, 'no');
    }

    function insertuser_callback(data) {
      message_alert(data);
      setTimeout(function () {
        $('#save', window.parent.document).attr('disabled', false);
        parent.showlist();
      }, 800)
    }
    
    /**
     * @ 签名
     */
    function getSign() {
    	var deathRecordSeq = $("#deathRecordSeq").val();
        if (deathRecordSeq != null && deathRecordSeq != '') {
        	publicFun.httpServer(
		      	{ url: '${baseurl}zyylqbl/getSign.do' }, 
		      	{ "emgSeq": _emgSeq,"relevanceId": deathRecordSeq,"documentTable": 'HSP_DEATH_RECORD',"templateId":'hash_050'
		      	,"request172":'死亡记录'}, 
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
      var deathRecordSeq = $("#deathRecordSeq").val();
      if (deathRecordSeq != null && deathRecordSeq != '') {
	      publicFun.httpServer(
	      	{ url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
	      	{ "relevanceId": deathRecordSeq,"documentTable": 'HSP_DEATH_RECORD'}, 
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

    function saveForm(printFlg) {
      publicFun.cleanSignMsg('docName');
      if (printFlg === 'print') {
        jquerySubByFId('addform', function () {
          $('#save', window.parent.document).attr('disabled', false);
          parent.showlist(printFlg);
        }, null, "json");
      } else {
        jquerySubByFId('addform', insertuser_callback, null, "json");
      }
    }


    function delDeathForm() {
      _confirm('确定删除该数据吗？', null, function () {
        var deathRecordSeq = $("#deathRecordSeq").val();
        if (deathRecordSeq != null && deathRecordSeq != '') {
          $.ajax({
            url: "${baseurl}deathRecord/delDeathRecord.do",
            type: "post",
            data: {
              "deathRecordSeq": deathRecordSeq
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
    function inputtreatment() {
      var treatmentProcess = document.getElementById("treatmentProcess").value;
      var zdjgvalue = $("#zdjgvalue").html();
      if (zdjgvalue != '') {
        document.getElementById("treatmentProcess").value += zdjgvalue + '；';
      } else {
        publicFun.alert('当前无导入数据，请确认是否已完成"首次病程录"');
      }
    }

    function initMsg() {
      if ('${hspDeathRecordCustom.deathRecordSeq}') {
        var _createNbr = '${hspDeathRecordCustom.createDoc}';//医师号
        parent.checkRole(_createNbr);
        $('#docName').val('${hspDeathRecordCustom.createNam}');
        $('#docNameNum').val(_createNbr);
        $('#coursedate').val('${hspDeathRecordCustom.courseDateStr}');
        $('#comeTimeStr').val('${hspDeathRecordCustom.comeTimeStr}');
        $('#deathTime').val('${hspDeathRecordCustom.deathTimeStr}');
      } else {
        $('#docName').val('${sessionScope.activeUser.usrname}');
        $('#docNameNum').val('${sessionScope.activeUser.usrno}');
        var newTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
        $('#coursedate').val(newTime);
        $('#comeTimeStr').val('${hspemginfCustom.emgDatStr}');
        parent.checkRole('${sessionScope.activeUser.usrno}');
      }
    }
    $(function () {
      initAge();
      initMsg();
      findDzqmImg();
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