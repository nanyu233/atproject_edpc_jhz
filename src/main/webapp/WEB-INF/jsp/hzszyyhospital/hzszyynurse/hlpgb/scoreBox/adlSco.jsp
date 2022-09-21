<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>ADL评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _typeSource = '${typeSource}',
    _baseUrl = "${baseurl}";
    var _xtpgSeq = parent.$('#adlSeq').val();
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/adlVm.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="nursingSco adlNusring">
  <div class="scoreQuery" ms-controller="adlScore">
    <p class="headtitle">ADL评分</p>
    <form id="ADLForm" action="${baseurl}hlpgb/submitAdlScore.do" method="post">
      <input class="hidden" type="text" name="hspAdlInfCustom.emgSeq" id="adlEmg">
      <input class="hidden" type="text" name="hspAdlInfCustom.xtpgSeq" id="xtEmg">
      <div class="panelGde">
        <div class="AdlContent panelContent">
          <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/scorePages/adlSco.jsp"></jsp:include>
          <div class="scoreDiv">
            <span>备注：<input type="text" name="hspAdlInfCustom.adlMemo" class="remarkInput" ms-duplex-string="aboutAdl.adlMemo" maxlength="120"></span><br/>
            <span class="leftGapBtn">
              <span class="boldFontOther">分值：<i>{{aboutAdl.adlSco}}</i></span>
              <input type="hidden" name="hspAdlInfCustom.adlSco" ms-duplex-string="aboutAdl.adlSco">
              <div class="rightBtn">
                <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存并导入</a>
                <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
              </div>
            </span> 
          </div>
        </div>
      </div>
    </form>
  </div>
</body>
<script type="text/javascript">
  function saveAndImport() {
    if (vm.aboutAdl.adlSco == '' || vm.aboutAdl.adlSco == null) {
      publicFun.alert("请输入ADL评分");
      return false
    }
    if(_typeSource == 'hljld'){
      // if(parent._count == 0 && parent._count != ''){
      //   $('#xtEmg').val('')
      // }
      $('#ADLForm').attr('action', '${baseurl}zjszyyhljld/subAdlScore.do')
    }
    if(_typeSource == 'jzcs'){
      $('#ADLForm').attr('action', '${baseurl}hlpgb/submitAdlScoreCS.do')
    }
    jquerySubByFId('ADLForm', insert_callback, null, "json");
  }

  //保存回调
  function insert_callback(data) {
    if(_typeSource == 'hljld'){
      parent.sub.aboutSco.adlSeq = data.resultInfo.message;
    }else{
      parent.$('#adlSeq').val(data.resultInfo.message);
    }
    // $.messager.alert('提示信息', '保存成功', 'success');
    parent.sub.aboutSco.adlSco = vm.aboutAdl.adlSco
    parent.closemodalwindow()
  }

  $(function () {
    if (parent._ownPageWay === 'noSave') {
      $('#submitbtn').hide()
    }
    $('#xtEmg').val(_xtpgSeq);
    $('#adlEmg').val(parent.$('#hplgEmg').val());
    getMsgList();
  })
</script>
</html>