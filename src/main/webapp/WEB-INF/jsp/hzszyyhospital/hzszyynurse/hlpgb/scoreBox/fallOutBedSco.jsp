<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>坠床跌倒评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/winScore.css?aaa=5555">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555"><script>
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var _xtpgSeq = parent.$('#fallriskSeq').val();
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/fallOutBedVm.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="winScore">
  <div class="scoreQuery" ms-controller="fallDanger">
    <p class="headtitle">坠床跌倒评分</p>
    <form id="falloutForm" action="${baseurl}hlpgb/submitFallRisk.do" method="post">
      <input class="hidden" type="text" name="hspFallriskInfCustom.emgSeq" id="fallEmg">
      <input class="hidden" type="text" name="hspFallriskInfCustom.fallriskSeq" id="xtEmg">
      <input class="hidden" type="text" name="hspFallriskInfCustom.riskSpare1" value="2">
      <input type="text" class="hidden" ms-duplex-string="aboutFallDanger.duoxSco" name="hspFallriskInfCustom.duoxSco"/>
      <input type="text" class="hidden" ms-duplex-string="aboutFallDanger.danxSco" name="hspFallriskInfCustom.danxSco"/>
      <div class="panelGde">
        <div class="DangerContent panelContent">
          <div class="partA">
              <p class="title boldFont">第一部分：可以根据患者的情况直接进行跌倒危险的评定</p>
              <div ms-repeat="systemList.riskClassCodList">
                  <label ms-attr-for="riskClassCod{{el.infoid}}" class="colorlab">
                      <input ms-attr-id="riskClassCod{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked" ms-click="otherCheckClick('riskClassCod',$index,'aboutFallDanger')" />
                      <span> {{el.info}}</span>（<span> {{el.infocode}}</span>分）
                  </label>
              </div>
              <input class="hidden" type="text" name="hspFallriskInfCustom.riskClassCod" ms-duplex-string="fallhideMsg.riskClassCod">
              <p class="title boldFont">第二部分：患者的状况不符合第一部分的任何项目，则进入第二部分的评分，并计算跌倒危险得分</p>
          </div>
          <ul class="tableUl paneltab">
              <li>
                  <span class="titleSpan titleCol">年龄（单选）</span>
                  <label ms-repeat="systemList.riskAgeoCodList" ms-attr-for="riskAgeoCod{{el.infocode}}" class="labtab evenLab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskAgeoCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskAgeoCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskAgeoCod" name="hspFallriskInfCustom.riskAgeCod">
              </li>
              <li class="specialLi">
                  <span class="titleSpan">跌倒史</span>
                  <label ms-repeat="systemList.riskHisCodList" ms-attr-for="riskHisCod{{el.infocode}}" class="labtab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskHisCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskHisCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskHisCod" name="hspFallriskInfCustom.riskHisCod">
              </li>
              <li>
                  <span class="titleSpan titleCol">排泄，大便和小便（单选）</span>
                  <label ms-repeat="systemList.riskExcreteCodList" ms-attr-for="riskExcreteCod{{el.infoid}}" class="labtab evenLab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskExcreteCod{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskExcreteCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskExcreteCod" name="hspFallriskInfCustom.riskExcreteCod">
              </li>
              <li>
                <div class="showDiv" id="showDiv">
                    <p class="showMsg">
                        {{fallhideMsg.hiddenMsg}}
                    </p>
                    <img src="../images/hzszyyhems/systemAssess/triangle.png">
                </div> 
                <div class="showDivTwo" id="showDivTwo">
                    <p class="showMsgTwo">
                        {{fallhideMsg.hiddenMsg}}
                    </p>
                    <img src="../images/hzszyyhems/systemAssess/triangle.png">
                </div> 
                <div class="showDivFour" id="showDivFour">
                    <p class="showMsgFour">
                        {{fallhideMsg.hiddenMsg}}
                    </p>
                    <img src="../images/hzszyyhems/systemAssess/triangle.png">
                </div> 
                <div class="showDivFive" id="showDivFive">
                    <p class="showMsgFive">
                        {{fallhideMsg.hiddenMsg}}
                    </p>
                    <img src="../images/hzszyyhems/systemAssess/triangle.png">
                </div> 
                <span class="titleSpan spcLine">使用高跌倒风险的药物：包括止<span>痛泵/麻醉剂，</span><span class="showKdx">抗癫痫药，</span><span class="showKy">抗压药，</span><span class="showLn">利尿剂，</span><span class="showCm">催眠药，</span><span class="showXy">泻药，</span><span class="showZdj">镇定剂</span><span class="showJs">和精神药物</span>（单选）</span>
                  <label ms-repeat="systemList.riskDrugCodList" ms-attr-for="riskDrugCod{{el.infocode}}" class="labtab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskDrugCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskDrugCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskDrugCod" name="hspFallriskInfCustom.riskDrugCod">
              </li>
              <li>
                  <span class="titleSpan spcLine titleCol">患者护理装置：是指任何与患者相连的装置，例如：静脉输液，胸腔引流管，留置导尿管（单选）</span>
                  <label ms-repeat="systemList.riskMacCodList" ms-attr-for="riskMacCod{{el.infocode}}" class="labtab evenLab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskMacCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="Objradioclick('riskMacCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskMacCod" name="hspFallriskInfCustom.riskMacCod">
              </li>
              <li>
                  <span class="titleSpan">活动能力（多选）</span>
                  <label ms-repeat="systemList.riskActionCodList" ms-attr-for="riskActionCod{{el.infoid}}" class="labtab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskActionCod{{el.infoid}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="otherCheckClick('riskActionCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="fallhideMsg.riskActionCod" name="hspFallriskInfCustom.riskActionCod">
              </li>
              <li class="fourLi">
                  <span class="titleSpan titleCol">认知（多选）</span>
                  <label ms-repeat="systemList.riskOcognizeCodList" ms-attr-for="riskOcognizeCod{{el.infocode}}" class="labtab evenLab">
                      <span class="thirdSpan">{{el.infocode}}</span>
                      <span class="fourthSpan">{{el.info}}</span>
                      <span class="thirdSpan">
                          <input ms-attr-id="riskOcognizeCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="otherCheckClick('riskOcognizeCod',$index,'aboutFallDanger')" >
                      </span>
                  </label>
                  <input class="hidden" type="text" ms-duplex-string="fallhideMsg.riskOcognizeCod" name="hspFallriskInfCustom.riskCognizeCod">
              </li>

              <li class="specialLi">
                    <span class="titleSpan">其他</span>
                    <label ms-repeat="systemList.riskOtherCodList" ms-attr-for="riskOtherCod{{el.infocode}}" class="labtab">
                        <span class="thirdSpan">{{el.infocode}}</span>
                        <span class="fourthSpan">{{el.info}}</span>
                        <span class="thirdSpan">
                            <input ms-attr-id="riskOtherCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="clearAll()" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDanger.riskOtherCod" name="hspFallriskInfCustom.riskOtherCod">
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
      </div>
    </form>
  </div>
</body>
<script type="text/javascript">
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
    // $.messager.alert('提示信息', '保存成功', 'success');
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

    
    $(".showKdx").hover(function () {
        $('#showDiv').show();
        vm.fallhideMsg.hiddenMsg="丙戊殴钠（德巴金）、卡马西平（得理多）、左乙拉西坦（开浦兰）、托吡酯(妥泰)、拉莫三嗪(利必通)、奧卡西平(曲来)"
    }, function () {
        $('#showDiv').hide();
    });

    var showList = ['showKdx','showCm','showXy','showZdj'];

    $.each(showList, function(idx,value) {
        $('.'+value).hover(function(){
            if(value == 'showKdx'){
                vm.fallhideMsg.hiddenMsg="丙戊殴钠（德巴金）、卡马西平（得理多）、左乙拉西坦（开浦兰）、托吡酯(妥泰)、拉莫三嗪(利必通)、奧卡西平(曲来)"
            }else if(value == 'showCm'){
                vm.fallhideMsg.hiddenMsg="地西泮（安定）、阿普唑仑（佳乐定）、艾司唑仓（舒乐安定）、丙泊酚、咪达唑仑（力月西、多美康）、苯巴比妥、唑吡坦（思诺思）"
            }else if(value == 'showXy'){
                vm.fallhideMsg.hiddenMsg="复方聚乙二醇电解质散（恒康正清、舒泰清）、酸钠盐口服溶液（今辰清）、分欧（果导）"
            }else if(value == 'showZdj'){
                vm.fallhideMsg.hiddenMsg="地西泮（安定）、阿普唑仑（佳乐定）、艾司唑仓（舒乐安定）、丙泊酚、咪达唑仑（力月西、多美康）、苯巴比妥、唑吡坦（思诺思）"
            }
            $('#showDiv').show();
        }, function () {
            $('#showDiv').hide();
        });
    })

    $('.showKy').hover(function(){
        vm.fallhideMsg.hiddenMsg="心痛定、开博通、合心爽、哌唑嗪、可乐定、硝苯地平、尼莫地平、倍他乐克、艾司洛尔（爱络）、硝酸酯类（硝酸甘油）、亚宁定、硝普钠"
        $('#showDivFour').show();
    }, function () {
        $('#showDivFour').hide();
    });

    $('.showLn').hover(function(){
        vm.fallhideMsg.hiddenMsg="托拉塞米（丽泉、伊迈格、泽通、特苏敏），呋塞米（速尿）"
        $('#showDivTwo').show();
    }, function () {
        $('#showDivTwo').hide();
    });

    $('.showJs').hover(function(){
        vm.fallhideMsg.hiddenMsg="舒必利、硫必利、氟哌啶醇、氟哌利多(氟哌啶)、氯丙嗪、奋乃静、 氯普噻吨(泰尔登）、利培酮（维思通）、帕利哌酮（悦复隆）、氯氮平、奥氮平(再普乐、欧兰宁、奥兰之）、喹硫平（思瑞康）"
        $('#showDivFive').show();
    }, function () {
        $('#showDivFive').hide();
    });

  })
</script>
</html>