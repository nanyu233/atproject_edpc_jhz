<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Braden评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _typeSource = '${typeSource}',
    _baseUrl = "${baseurl}";
    var _xtpgSeq = parent.$('#bradenSeq').val();
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/bradenVm.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="nursingSco">
  <div ms-controller="BradenGde" class="scoreQuery">
    <p class="headtitle">Braden评分</p>
    <form id="BradenForm" action="${baseurl}hlpgb/submitBradenScore.do" method="post">
      <input class="hidden" type="text" name="hspBradenInfCustom.emgSeq" id="brdEmg">
      <input class="hidden" type="text" name="hspBradenInfCustom.xtpgSeq" id="xtEmg">
      <div class="panelGde">
        <div class="BradenContent panelContent">
          <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/scorePages/bradenSco.jsp"></jsp:include>
          <div class="scoreDiv">
            <span>备注：<input type="text" name="hspBradenInfCustom.memo" class="remarkInput" ms-duplex-string="aboutbraden.memo" maxlength="120"></span><br/>
            <span class="boldFont">分值：<i>{{aboutbraden.bradenSco}}</i></span><br/>
            <input type="hidden" name="hspBradenInfCustom.bradenSco" ms-duplex-string="aboutbraden.bradenSco">
            <div class="common_btnGrp">
              <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存并导入</a>
              <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </div>
        </div>
      </div>
    </form>
  </div>
</body>
<script type="text/javascript">
  function saveAndImport() {
    if (vm.aboutbraden.bradenSco == '' || vm.aboutbraden.bradenSco == null) {
      publicFun.alert("请输入braden评分");
      return false
    }
    if(_typeSource == 'jzcs'){
      $('#BradenForm').attr('action', '${baseurl}hlpgb/submitBradenScoreCS.do')
    }
    if(_typeSource == 'hljld'){
      // if(parent._count == 0 && parent._count != ''){
      //   $('#xtEmg').val('')
      // }
      $('#BradenForm').attr('action', '${baseurl}zjszyyhljld/subBradenScore.do')
    }
    jquerySubByFId('BradenForm', insert_callback, null, "json");
  }

  //保存回调
  function insert_callback(data) {
    if(_typeSource == 'hljld'){
      parent.sub.aboutSco.bradenSeq = data.resultInfo.message;
    }else{
      parent.$('#bradenSeq').val(data.resultInfo.message);
    }
    // $.messager.alert('提示信息', '保存成功', 'success');
    parent.sub.aboutSco.bradenSco = vm.aboutbraden.bradenSco
    parent.closemodalwindow()
  }

  $(function () {
    if (parent._ownPageWay === 'noSave') {
      $('#submitbtn').hide()
    }
    $('#xtEmg').val(_xtpgSeq);
    $('#brdEmg').val(parent.$('#hplgEmg').val());
    getMsgList();
  })
</script>
</html>