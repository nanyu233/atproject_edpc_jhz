<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
    <title>儿童坠床跌倒评分</title>
</head>

<body>
  <div class="panelGde" ms-if=" aboutFallDangerC.ageFlg == '1' && aboutzcdd.zcddFlg != '1'">
      <div class="FalloutbedBlock panelBlock">
          <div class="tabtop floatLeft">
            <span class="title">儿童跌倒风险量表</span>
            <span class="isFinish" ms-visible="aboutFallDangerC.fallRiskFlg===0||aboutFallDangerC.fallRiskFlg==='0'">未评分</span>
            <span class="scoSpn" ms-visible="aboutFallDangerC.fallRiskFlg!=0||aboutFallDangerC.fallRiskFlg==''">{{aboutFallDangerC.riskSco}}分</span>  
          </div>
          <span ms-click="toggleBox('zcddFlag','zcddMsg','aboutzcdd')"  class="edit">
            <img src="../images/hzszyyhems/nurse/edit.png">
            <span>{{aboutzcdd.zcddMsg}}</span>
          </span>        
      </div>
      <div class="winScore panelContent" ms-visible="aboutzcdd.zcddFlag===1||aboutzcdd.zcddFlag==='1'">
          <div class="scoreQuery">
            <input type="text" class="hidden" ms-duplex-string="aboutFallDangerC.duoxSco" name="hspFallriskInfCustom.duoxSco"/>
            <input type="text" class="hidden" ms-duplex-string="aboutFallDangerC.danxSco" name="hspFallriskInfCustom.danxSco"/>  
            <div class="DangerContent panelContent">
                <ul class="tableUl paneltab">
                  <li class="fourLi">
                    <span class="titleSpan titleCol">年龄</span>
                    <label ms-repeat="systemListC.riskAgeyCodList" ms-attr-for="riskAgeyCod{{el.infocode}}" class="labtab evenLab">
                        <span class="thirdSpan">{{el.infocode}}</span>
                        <span class="fourthSpan">{{el.info}}</span>
                        <span class="thirdSpan">
                            <input ms-attr-id="riskAgeyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskAgeyCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskAgeyCod" name="hspFallriskInfCustom.riskAgeCod">
                  </li>
                  <li class="twoLi">
                    <span class="titleSpan">性别</span>
                    <label ms-repeat="systemListC.riskSexCodList" ms-attr-for="riskSexCod{{el.infocode}}" class="labtab">
                        <span class="thirdSpan">{{el.infocode}}</span>
                        <span class="fourthSpan">{{el.info}}</span>
                        <span class="thirdSpan">
                            <input ms-attr-id="riskSexCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskSexCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskSexCod" name="hspFallriskInfCustom.riskSexCod">
                  </li>
                  <li class="fiveLi">
                    <span class="titleSpan titleCol">诊断</span>
                    <label ms-repeat="systemListC.riskDiagnoseCodList" ms-attr-for="riskDiagnoseCod{{el.infocode}}" class="labtab evenLab" ms-class-2="twoLabtab:$index==1">
                        <span class="thirdSpan" ms-class="twoLab:$index==1">{{el.infocode}}</span>
                        <span class="fourthSpan" ms-class="twoLab:$index==1">{{el.info}}</span>
                        <span class="thirdSpan" ms-class="twoLab:$index==1">
                            <input ms-attr-id="riskDiagnoseCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskDiagnoseCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskDiagnoseCod" name="hspFallriskInfCustom.riskDiagnoseCod">
                  </li>
                  <li>
                    <span class="titleSpan">认知障碍</span>
                    <label ms-repeat="systemListC.riskYcognizeCodList" ms-attr-for="riskYcognizeCod{{el.infocode}}" class="labtab">
                        <span class="thirdSpan">{{el.infocode}}</span>
                        <span class="fourthSpan">{{el.info}}</span>
                        <span class="thirdSpan">
                            <input ms-attr-id="riskYcognizeCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskYcognizeCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskYcognizeCod" name="hspFallriskInfCustom.riskCognizeCod">
                  </li>
                  <li class="sixLi">
                    <span class="titleSpan titleCol">环境因素</span>
                    <label ms-repeat="systemListC.riskHjysCodList" ms-attr-for="riskHjysCod{{el.infocode}}" class="labtab evenLab" ms-class-2="threeLabtab:$index==0">
                        <span class="thirdSpan" ms-class="threeLab:$index==0">{{el.infocode}}</span>
                        <span class="fourthSpan" ms-class="threeLab:$index==0">{{el.info}}</span>
                        <span class="thirdSpan" ms-class="threeLab:$index==0">
                            <input ms-attr-id="riskHjysCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskHjysCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskHjysCod" name="hspFallriskInfCustom.riskHjysCod">
                  </li>
                  <li>
                    <span class="titleSpan">镇静/麻醉后</span>
                    <label ms-repeat="systemListC.riskZjmzhCodList" ms-attr-for="riskZjmzhCod{{el.infocode}}" class="labtab">
                        <span class="thirdSpan">{{el.infocode}}</span>
                        <span class="fourthSpan">{{el.info}}</span>
                        <span class="thirdSpan">
                            <input ms-attr-id="riskZjmzhCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskZjmzhCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskZjmzhCod" name="hspFallriskInfCustom.riskZjmzhCod">
                  </li>
                  <li class="fourLi">
                    <span class="titleSpan titleCol">药物使用</span>
                    <label ms-repeat="systemListC.riskDruguseCodList" ms-attr-for="riskDruguseCod{{el.infocode}}" class="labtab evenLab" ms-class-2="twoLabtab:$index==0">
                        <span class="thirdSpan" ms-class="twoLab:$index==0">{{el.infocode}}</span>
                        <span class="fourthSpan" ms-class="twoLab:$index==0">{{el.info}}</span>
                        <span class="thirdSpan" ms-class="twoLab:$index==0">
                            <input ms-attr-id="riskDruguseCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"  ms-click="ObjradioclickC('riskDruguseCod',$index,'aboutFallDangerC')" >
                        </span>
                    </label>
                    <input class="hidden" type="text" ms-duplex-string="aboutFallDangerC.riskDruguseCod" name="hspFallriskInfCustom.riskDruguseCod">
                  </li>
                </ul>
                <div class="scoreDiv">
                    <span class="boldFont">总分：{{aboutFallDangerC.riskSco}} </span><span ms-visible="aboutFallDangerC.riskSco != null " class="scoreLevel"></span></span> <br/>
                    <input type="hidden" name="hspFallriskInfCustom.riskSco" ms-duplex-string="aboutFallDangerC.riskSco" name="hspFallriskInfCustom.riskSco">
                </div>
              </div>
          </div>
      </div>
    </div>
</body>