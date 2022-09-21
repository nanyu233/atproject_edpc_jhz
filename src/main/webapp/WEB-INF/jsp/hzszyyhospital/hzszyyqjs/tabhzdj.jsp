<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>会诊登记</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <script>
    var _hzType = '${hzType}'; // [reply / edit / add]
    var _usrNo = '${sessionScope.activeUser.usrno}';
    var roleList = '${sessionScope.activeUser.dstroleList}';
  </script>
</head>

<body class="tabhzdj">
  <form class="form" id="hzdjform" action="${baseurl}consultation/addOrEditSubmit.do" method="post" autocomplete="off">
    <table>
      <tbody>
        <tr>
          <th>病历号:</th>
          <td id="mpi"></td>
          <th class="txright">姓名:</th>
          <td id="cstNam"></td>
        </tr>
        <tr>
          <th>性别:</th>
          <td id="cstSexCod"></td>
          <th class="txright">年龄:</th>
          <td id="cstAge"></td>
        </tr>
        <tr>
          <th>家庭住址:</th>
          <td colspan="3" id="cstAdr"></td>
        </tr>
        <tr>
          <th>主诉症状:</th>
          <td colspan="3" id="preDgnCod"></td>
          <input type="text" class="hidden" name="observationCode" id="observationCode">
          <input type="text" class="hidden" name="hspConsultationRecordsCustom.consultationRecordsSeq" id="consultationRecordsSeq">
          <input type="text" class="hidden" name="hspConsultationRecordsCustom.replySrc" id="replySrc" value="1">
          <input type="text" class="hidden" name="hspConsultationRecordsCustom.emgSeqCr" id="emgSeq">
          <input type="text" class="hidden" name="recordFlag" id="recordFlag" />
          <input type="text" class="hidden" name="hspConsultationRecordsCustom.qdhsDate" id="qdhsDate" />
          <input type="text" class="hidden" name="hspConsultationRecordsCustom.qdhsName" id="qdhsName" />
        </tr>
        <tr class="norReply">
          <th><i class="red">*</i> <strong>邀请会诊科室:</strong></th>
          <td>
            <input id="emg_emgFkNamea" class="invitationDep" type="text" name="hspConsultationRecordsCustom.invitationDep" onclick="selectDep('a')"
              readonly />
            <input class="hidden invitationDepCod" id="emg_emgFkCoda" type="text" name="hspConsultationRecordsCustom.invitationDepCod">
          </td>
          <th class="txright">邀请会诊医生:</th>
          <td class="relative">
            <input type="text" class="invitationDocNme" id="doctorParam" name="hspConsultationRecordsCustom.invitationDocNme" placeholder="邀请会诊医生">
            <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="doctorParamSearch">查询</a>
            <input class="hidden" id="invitationDocCod" type="text" name="hspConsultationRecordsCustom.invitationDocCod">
            <div class="doctorList" id="doctorList">
            </div>
            <label class="error errortip" id="doctip"></label>
          </td>
        </tr>
        <tr class="norReply">
          <th><i class="red">*</i> <strong>邀请时间:</strong></th>
          <td>
            <input id="invitationDate" type="text" class="input-sdate Wdate" name="hspConsultationRecordsCustom.invitationDate"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" >
          </td>
          <th class="txright">签到时间:</th>
          <td>
            <input id="consultationDate" class="input-sdate Wdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
            <input id="consultationDate_h" type="text" class="hidden" name="hspConsultationRecordsCustom.consultationDate">
          </td>
        </tr>
        <tr class="norReply">
          <th><i class="red">*</i> <strong>会诊时间:</strong></th>
          <td>
            <input id="replyCreateDate" type="text" class="input-sdate Wdate" name="hspConsultationRecordsCustom.replyCreateDate"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </td>
          <th class="txright">申请人:</th>
          <td>
            <div>
	            <input type="text" class="applyDocName" id="applyDocUser" maxlength="10" name="hspConsultationRecordsCustom.applyDocName">
	            <input type="text" class="hidden" id="applyDocUserNum" maxlength="10" name="hspConsultationRecordsCustom.applyDoc">
          	</div>
          </td>
        </tr>
        <tr>
          <th>会诊意见:</th>
          <td colspan="3">
            <textarea class="div-textarea justRead" name="hspConsultationRecordsCustom.consultationOpinion" id="consultationOpinion"></textarea>
          </td>
        </tr>
        <tr>
          <th>会诊科室:</th>
          <td>
            <input type="text" class="justRead replyDepStr" name="hspConsultationRecordsCustom.replyDepStr" id="emg_emgFkNameb" onclick="selectDep('b')" readonly>
            <input class="hidden replyDep" id="emg_emgFkCodb" type="text" name="hspConsultationRecordsCustom.replyDep">
          </td>
          <th class="txright">会诊医生:</th>
          <td>
            <input type="text" class="justRead" name="hspConsultationRecordsCustom.replyDocName" id="replyDocName" readonly>
          </td>
        </tr>
        <tr>
          <td colspan="4" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitBtn" onclick="insert()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    function selectDep (type) {
      $("#doctip").hide();
      createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do?selectType=' + type);
    }

    $("#doctorParam").focus(function () {
      $("#doctip").hide();
    });

    $("#doctorParamSearch").click(function () {
      var doctorParam = getDomID('doctorParam').value;
      var cstDepCod = getDomID('emg_emgFkCoda').value;
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
    })
    $("#doctorParam").keyup(function (event) {
      if (event.keyCode == 13) {
        $("#doctorParamSearch").click()
      }
    })

    function validateForm() {
      sessionStorage.setItem("isValidateFormForHzdj", "true");
      return $("#hzdjform").validate({
        rules: {
          "hspConsultationRecordsCustom.emgFkName": {
            required: true
          },
          "hspConsultationRecordsCustom.invitationDate": {
            required: true
          }
        },
        messages: {
          "hspConsultationRecordsCustom.emgFkName": {
            required: "邀请会诊科室必填"
          },
          "hspConsultationRecordsCustom.invitationDate": {
            required: "邀请时间必填"
          }
        }
      }).form();
    }

    $.validator.methods.compareTime = function (value, element, param) {
      var informTime = new Date($("#invitationDate").val());
      var qdTime = new Date($("#consultationDate").val()),
        arriveTime = new Date(value);
      return arriveTime > informTime
    };

    $("body").click(function () {
      $("#doctorList").hide();
    });

    function chooseDoctor(id, name) {
      $("#doctorParam").val(name);
      $("#invitationDocCod").val(id);
      $("#doctorList").html("");
      $("#doctorList").hide();
      $("#doctip").hide();
      if (sessionStorage.getItem("isValidateFormForHzdj") == "true") {
        validateForm()
      }
    }

    function insert() {
      $('#consultationDate_h').val($('#consultationDate').val());
      if (validateForm()) {
        if (_hzType === 'reply') {
          $('#consultationDate').append('<input type="text" id="newConsultationDate"/>');
          getDomID('newConsultationDate').value = getDomID('consultationDate').value;
          $('#replyCreateDate').append('<input type="text" id="newReplyCreateDate"/>');
          getDomID('newReplyCreateDate').value = getDomID('replyCreateDate').value;
        }
        jquerySubByFId('hzdjform', insert_callback, null, "json");
      }
    }
    //新增的回调函数
    function insert_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == 1) {
        setTimeout(function () {
          parent.closemodalwindow();
        }, 1000)
      }
      if (parent.getConsultation) {
        parent.getConsultation(getDomID('emgSeq').value);
      } else {
        parent.getDataGrid()
      }
    }

    function judgeTypeAssess() {
      // [reply / edit / add / qd]
      if (_hzType === 'add' || _hzType === 'edit' || _hzType === 'qd') {
        getDomID('recordFlag').value = 'apply';
        $('.justRead').attr('disabled', true);
        $('.justRead').attr('readonly', true);
        var username = '${username}';
        if (_hzType === 'add') {
          // getDomID('submitBtn').innerHTML = '新增';
          getDomID('doctorParam').value = '';
          getDomID('invitationDate').value = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss");
          getDomID('applyDocUser').value = username;
          getDomID('applyDocUserNum').value = '${sessionScope.activeUser.usrno}';
        } else if (_hzType === 'edit') {
          // getDomID('submitBtn').innerHTML = '修改';
          getDomID('emg_emgFkNameb').value = '';
          getDomID('emg_emgFkCodb').value = '';
          
        } else if(_hzType === 'qd'){
          getDomID('recordFlag').value = 'qd';
          var qdtime = getDomID('consultationDate').value;
          if(qdtime == '' ||  qdtime == null){
	          getDomID('consultationDate').value = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss");
	          getDomID('qdhsDate').value = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss");
	          getDomID('qdhsName').value = username;
          }
        }
      } else {
        // reply 
        $('.norReply').find('input').attr('disabled', true);
        $('.norReply').find('input').attr('readonly', true);
        $('#doctorParamSearch').hide();
        getDomID('recordFlag').value = 'reply';
        getDomID('replyDocName').value = '${sessionScope.activeUser.usrname}';
        // getDomID('submitBtn').innerHTML = '回复';
      }
    }

	 function checkRoles(){
      if("admin" === _usrNo){
      
      } else{
        var roles = eval('('+roleList+')');
        if(roles.indexOf(1901) > -1){
          return true;
        } else{
            $('.norReply #consultationDate').attr('disabled', true);
            $('.norReply #consultationDate').attr('readonly', true);
        }
      }
    }
    
    function getDomID(id) {
      return document.getElementById(id);
    }
    
    function getAjaxVal() {
      publicFun.httpServer({ url: '${baseurl}consultation/findhzdj.do' }, 
      { 'hspConsultationRecordsCustom.emgSeqCr': '${emgSeq}', 'hspConsultationRecordsCustom.consultationRecordsSeq': '${conRecordsSeq}' }, function (res) {
        var _emgObj = res.sysdata.hspEmgInf, _recordObj = res.sysdata.hspConsultationRecords;
        for (var key in _emgObj) {
          if (_emgObj[key] !== '' && _emgObj[key] != null) {
            if (key === 'cstAge') {
              if (getDomID(key)) {
                getDomID(key).innerHTML = _emgObj[key] + _emgObj.cstAgeCod;
              }
            } else {
              if (getDomID(key)) {
                getDomID(key).innerHTML = _emgObj[key];
                getDomID(key).value = _emgObj[key];
              }
            }
          }
        }
        if (_recordObj) {
          for (var key in _recordObj) {
            if (_recordObj[key] !== '' && _recordObj[key] != null) {
              if (key === 'consultationDate' || key === 'invitationDate' || key === 'replyCreateDate') {
                _recordObj[key] = publicFun.timeFormat(_recordObj[key], 'yyyy/MM/dd hh:mm:ss')
              }
              var _classKeyList = ['invitationDep', 'invitationDocNme', 'replyDep', 'replyDepStr','applyDocName'];
              if (_classKeyList.indexOf(key) > -1) {
                document.getElementsByClassName(key)[0].value = _recordObj[key];
              } else {
                if (getDomID(key)) {
                  getDomID(key).value = _recordObj[key];
                }
              }
            }
          }
        }
      })
    }

    $(function () {
      sessionStorage.setItem("isValidateFormForHzdj", "false");
      judgeTypeAssess();
      getAjaxVal();
      checkRoles();
    })
  </script>
</body>

</html>