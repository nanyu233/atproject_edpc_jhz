<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>会诊记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body>
  <input type="hidden" value="${emgSeqCr}" id="emgSeqCr" />
  <div>
    <div class="maindiv2">
    </div>
    <div class="hrrr" id="cutline"></div>
    <!-- <div class="cutoff"></div> -->
    <div class="btndiv">
      <input type="button" class="commonbtn m-l10" value="显示列表" id="showList" onclick="showList()" />
      <input type="button" class="commonbtn m-l10" value="新增" id="add" onclick="addData()" />
      <input type="button" class="commonbtn m-l10" value="修改" id="edit" onclick="editData()" />
      <input type="button" class="commonbtn m-l10" value="申请签名" id="signApply" onclick="getSignsq()" />
      <input type="button" class="commonbtn m-l10" value="回复签名" id="signReply" onclick="getSignhf()" />
      <input type="button" class="commonbtn m-l10" value="保存并继续" id="saveAndCtn" onclick="saveForm('continue')" />
      <input type="button" class="commonbtn m-l10" value="保存" id="save" onclick="saveForm('save')" />
      <input type="button" class="commonbtn m-l10" value="删除" id="delete" onclick="delForm()" />
      <input type="button" class="commonbtn m-l10" value="会诊回复" id="reply" onclick="replyData()" />
      <input type="button" class="commonbtn m-l10" value="打印" id="print" onclick="printForm()" />
    </div>
  </div>
  <script type="text/javascript">
    var _resultId = '';
    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      var thisheight = $(window).height() - 55;
      var content = '<iframe id ="myFrame" height="' + thisheight + '" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;"></iframe>';
      return content;
    }

    function toAddIframe(_url) {
      var contentDiv = createFrame(_url);
      $('.maindiv2').append(contentDiv);
      if (parent.pageFlg) {
        hideOtherBtn()
        var myFrame = document.getElementById('myFrame')
        if (myFrame.attachEvent) {
          myFrame.attachEvent("onload", function () { // IE  
            hideOtherBtn()
          })
        } else {
          myFrame.onload = function () { // 非IE  
            hideOtherBtn()
          }
        }
      }
    }
    function hideBtn(list) {
      $.each(list, function (idx, val) {
        $('#' + val).hide()
      })
    }
    function showBtn(_list) {
      $.each(_list, function (idx, val) {
        $('#' + val).show()
      })
    }

    function hideOtherBtn() {
      var btnList = ['save', 'delete', 'add', 'saveAndCtn', 'signApply', 'signReply', 'reply'];
      $.each(btnList, function (idx, val) {
        $('#' + val).hide()
      })
    }
    function addData() {
      $('.maindiv2').html('');
      $('#cutline').css('visibility', 'visible');
      $('.commonbtn').show()
      hideBtn(['add', 'reply', 'edit', 'delete', 'print'])
      var _url = "${baseurl}consultation/toAddOrEdit.do?recordFlag=apply&hspConsultationRecordsCustom.emgSeqCr=${emgSeqCr}";
      toAddIframe(_url)
    }

    /**
     * @ 签名
     */
    function getSignsq() {
      document.getElementById("myFrame").contentWindow.getSignsq();
    }

    /**
     * @ 签名
     */
    function getSignhf() {
      document.getElementById("myFrame").contentWindow.getSignhf();
    }

    function saveForm(type) {
      document.getElementById("myFrame").contentWindow.saveForm(type);
    }

    function editData() {
      $('#cutline').css('visibility', 'visible')
      if(_resultId == 'doctor'){
        $('.commonbtn').show();
        hideBtn(['add', 'reply', 'edit', 'delete', 'print','save','saveAndCtn'])
      }else if(_resultId == 'nurse' || _resultId == 'tourist'){
        $('.commonbtn').hide();
        showBtn('showList')
      }else{
        $('.commonbtn').show();
        hideBtn(['add', 'reply', 'edit', 'delete', 'print'])
      }
      document.getElementById("myFrame").contentWindow.editForm();
    }

    function showList() {
      $('#cutline').css('visibility', 'hidden');
      $('.maindiv2').html('');
      var _url = "${baseurl}consultation/queryMainConsultation.do?emgSeqCr=${emgSeqCr}";
      // showBtn(['save', 'add', 'reply', 'edit', 'delete', 'print'])
      checkRole2();
      var emgSeqCr = $('#emgSeqCr').val();
      toAddIframe(_url)
    }

    function replyData() {
      $('#cutline').css('visibility', 'visible');
      hideBtn(['add', 'reply', 'edit', 'delete', 'saveAndCtn'])
      document.getElementById("myFrame").contentWindow.replyForm();
    }

    function editConsult(consultationRecordsSeq) {
      $('.maindiv2').html('');
      if(_resultId == 'doctor'){
        $('.commonbtn').show();
        hideBtn(['add', 'reply', 'edit', 'delete', 'print','save','saveAndCtn'])
      }else if(_resultId == 'nurse' || _resultId == 'tourist'){
        $('.commonbtn').hide();
        $('#showList').show();
      }else{
        $('.commonbtn').show();
        hideBtn(['add', 'reply', 'edit', 'delete', 'print', 'saveAndCtn'])
      }
      var _url = "${baseurl}consultation/toAddOrEdit.do?recordFlag=apply&hspConsultationRecordsCustom.emgSeqCr=${emgSeqCr}&hspConsultationRecordsCustom.consultationRecordsSeq=" + consultationRecordsSeq;
      toAddIframe(_url)
      // checkRole2();
    }

    function replyConsult(consultationRecordsSeq) {
      $('.maindiv2').html('');
      $('.commonbtn').show()
      hideBtn(['add', 'reply', 'edit', 'delete', 'print', 'saveAndCtn'])
      var _url = "${baseurl}consultation/toAddOrEdit.do?recordFlag=reply&hspConsultationRecordsCustom.emgSeqCr=${emgSeqCr}&hspConsultationRecordsCustom.consultationRecordsSeq=" + consultationRecordsSeq;
      toAddIframe(_url)
      // checkRole2();
    }

    function delForm() {
      document.getElementById("myFrame").contentWindow.delConsult();
    }

    function printForm() {
      document.getElementById("myFrame").contentWindow.printall();
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

    $(function () {
      showList()
    })

    //初始化 判断登陆用户角色是否有权限对该医师进行操作
    function checkRole(_cratNbr) {
      $.ajax({
        url: "${baseurl}zyylqbl/checkRoleAjax.do?",
        type: "post",
        data: {
          "cratNbr": _cratNbr
        },
        success: function (data) {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (parent.pageFlg) { // 归档病历或护士
            $("#save").hide();
          } else {
            if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin") {
              $("#save").show();
            }
          }
        }
      })
    }

    //初始化 判断登陆用户角色是否有护士的角色
    function checkRole2() {
      //判断是否有权限
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do', isNoLoad: true}, { "cratNbr": '' }, function (data) {
        //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
        if (parent.pageFlg) {
          hideBtn(['add', 'save', 'delete', 'reply', 'signApply', 'signReply', 'saveAndCtn', 'edit'])
          showBtn(['showList', 'print'])
        } else {
          if (data.resultInfo.message == "doctorSelf" || data.resultInfo.message == "admin" || data.resultInfo.message == "doctor") {
            $('.commonbtn').hide()
            showBtn(['showList', 'add', 'delete', 'reply', 'print', 'edit'])
          }else if(data.resultInfo.message == "nurse"){
            $('.commonbtn').hide()
            var roleList = '${sessionScope.activeUser.dstroleList}';
            if(roleList.indexOf('1004') != -1){
              showBtn(['showList', 'print','reply'])
            }else{
              showBtn(['showList', 'print'])
            }
          }
          _resultId = data.resultInfo.message;
        }
        //日志、归档病历、留抢病历 游客无权限
        if(data.resultInfo.message == "tourist"){
            $('.commonbtn').hide()
        }
      })
    }
  </script>
</body>

</html>