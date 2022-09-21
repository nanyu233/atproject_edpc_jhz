<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>小儿坠床跌倒评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/winScore.css?aaa=5555">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555"><script>
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var _xtpgSeq = parent.$('#fallriskSeq').val();
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/fallOutChild.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="winScore">
  <div class="scoreQuery" ms-controller="fallDangerChild">
    <p class="headtitle">儿童跌倒风险量表</p>
    <form id="falloutForm" action="${baseurl}hlpgb/submitFallRisk.do" method="post">
      <input class="hidden" type="text" name="hspFallriskInfCustom.emgSeq" id="fallEmg">
      <input class="hidden" type="text" name="hspFallriskInfCustom.fallriskSeq" id="xtEmg">
      <input class="hidden" type="text" name="hspFallriskInfCustom.riskSpare1" value="1">
      <input type="text" class="hidden" ms-duplex-string="aboutFallDanger.duoxSco" name="hspFallriskInfCustom.duoxSco"/>
      <input type="text" class="hidden" ms-duplex-string="aboutFallDanger.danxSco" name="hspFallriskInfCustom.danxSco"/>
      <div class="DangerContent panelContent">
        <ul class="tableUl paneltab">
          <li class="fourLi">
            <span class="titleSpan titleCol">年龄</span>
            <label ms-repeat="systemList.riskAgeyCodList" ms-attr-for="riskAgeyCod{{el.infocode}}" class="labtab evenLab">
                <span class="thirdSpan">{{el.infocode}}</span>
                <span class="fourthSpan">{{el.info}}</span>
                <span class="thirdSpan">
                    <input ms-attr-id="riskAgeyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskAgeyCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskAgeyCod" name="hspFallriskInfCustom.riskAgeCod">
          </li>
          <li class="twoLi">
            <span class="titleSpan">性别</span>
            <label ms-repeat="systemList.riskSexCodList" ms-attr-for="riskSexCod{{el.infocode}}" class="labtab">
                <span class="thirdSpan">{{el.infocode}}</span>
                <span class="fourthSpan">{{el.info}}</span>
                <span class="thirdSpan">
                    <input ms-attr-id="riskSexCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskSexCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskSexCod" name="hspFallriskInfCustom.riskSexCod">
          </li>
          <li class="fiveLi">
            <span class="titleSpan titleCol">诊断</span>
            <label ms-repeat="systemList.riskDiagnoseCodList" ms-attr-for="riskDiagnoseCod{{el.infocode}}" class="labtab evenLab" ms-class-2="twoLabtab:$index==1">
                <span class="thirdSpan" ms-class="twoLab:$index==1">{{el.infocode}}</span>
                <span class="fourthSpan" ms-class="twoLab:$index==1">{{el.info}}</span>
                <span class="thirdSpan" ms-class="twoLab:$index==1">
                    <input ms-attr-id="riskDiagnoseCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskDiagnoseCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskDiagnoseCod" name="hspFallriskInfCustom.riskDiagnoseCod">
          </li>
          <li>
            <span class="titleSpan">认知障碍</span>
            <label ms-repeat="systemList.riskYcognizeCodList" ms-attr-for="riskYcognizeCod{{el.infocode}}" class="labtab">
                <span class="thirdSpan">{{el.infocode}}</span>
                <span class="fourthSpan">{{el.info}}</span>
                <span class="thirdSpan">
                    <input ms-attr-id="riskYcognizeCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskYcognizeCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskYcognizeCod" name="hspFallriskInfCustom.riskCognizeCod">
          </li>
          <li class="sixLi">
            <span class="titleSpan titleCol">环境因素</span>
            <label ms-repeat="systemList.riskHjysCodList" ms-attr-for="riskHjysCod{{el.infocode}}" class="labtab evenLab" ms-class-2="threeLabtab:$index==0">
                <span class="thirdSpan" ms-class="threeLab:$index==0">{{el.infocode}}</span>
                <span class="fourthSpan" ms-class="threeLab:$index==0">{{el.info}}</span>
                <span class="thirdSpan" ms-class="threeLab:$index==0">
                    <input ms-attr-id="riskHjysCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskHjysCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskHjysCod" name="hspFallriskInfCustom.riskHjysCod">
          </li>
          <li>
            <span class="titleSpan">镇静/麻醉后</span>
            <label ms-repeat="systemList.riskZjmzhCodList" ms-attr-for="riskZjmzhCod{{el.infocode}}" class="labtab">
                <span class="thirdSpan">{{el.infocode}}</span>
                <span class="fourthSpan">{{el.info}}</span>
                <span class="thirdSpan">
                    <input ms-attr-id="riskZjmzhCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskZjmzhCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskZjmzhCod" name="hspFallriskInfCustom.riskZjmzhCod">
          </li>
          <li class="fourLi">
            <span class="titleSpan titleCol">药物使用</span>
            <label ms-repeat="systemList.riskDruguseCodList" ms-attr-for="riskDruguseCod{{el.infocode}}" class="labtab evenLab" ms-class-2="twoLabtab:$index==0">
                <span class="thirdSpan" ms-class="twoLab:$index==0">{{el.infocode}}</span>
                <span class="fourthSpan" ms-class="twoLab:$index==0">{{el.info}}</span>
                <span class="thirdSpan" ms-class="twoLab:$index==0">
                    <input ms-attr-id="riskDruguseCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskDruguseCod',$index,'aboutFallDanger')" >
                </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskDruguseCod" name="hspFallriskInfCustom.riskDruguseCod">
          </li>
        </ul>
        <div class="scoreDiv">
            <span class="boldFont">总分：<i>{{aboutFallDanger.riskSco}}</i> </span><span ms-visible="aboutFallDanger.riskSco != null " class="scoreLevel"></span></span> <br/>
            <input type="hidden" name="hspFallriskInfCustom.riskSco" ms-duplex-string="aboutFallDanger.riskSco" name="hspFallriskInfCustom.riskSco">
        </div>
        <div class="common_btn">
          <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存</a>
          <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
      </div>
    </form>
  </div>

  <script>
    function saveAndImport() {
      if(vm.aboutFallDanger.riskSco == '' || vm.aboutFallDanger.riskSco == null) {
        publicFun.alert("请输入坠床跌倒评分");
        return false
      }
      jquerySubByFId('falloutForm', insert_callback, null, "json");
    }

     //保存回调
    function insert_callback(data) {
      parent.$('#fallriskSeq').val(data.resultInfo.message);
      /// $.messager.alert('提示信息', '保存成功', 'success');
      parent.sub.aboutSco.fallriskSco = vm.aboutFallDanger.riskSco;
      parent.closemodalwindow()
    }

    $(function () {
      if (parent._ownPageWay === 'noSave') {
        $('#submitbtn').hide()
      }
      $('#xtEmg').val(_xtpgSeq);
      $('#fallEmg').val(parent.$('#hplgEmg').val());
      getMsgList();
  })
  </script>
</body>
</html>