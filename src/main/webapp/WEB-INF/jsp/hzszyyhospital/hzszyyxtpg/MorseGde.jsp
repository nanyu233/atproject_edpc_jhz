<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
  <title>Morse跌倒风险评估表</title>
</head>

<body class="winScore">
  <div class="panelGde">
  <div class="FalloutbedBlock panelBlock">
      <div class="tabtop floatLeft">
        <span class="title">Morse跌倒风险评估表</span>
        <span class="isFinish" ms-visible="aboutmorse.morseFlg===0||aboutmorse.morseFlg==='0'">未评分</span>
        <span class="scoSpn" ms-visible="aboutmorse.morseFlg!=0||aboutmorse.morseFlg==''">{{aboutmorse.zf}}分</span>  
      </div>
      <span ms-click="toggleBox('morseFlag','morseMsg','aboutmorse')"  class="edit">
        <img src="../images/hzszyyhems/nurse/edit.png">
        <span>{{aboutmorse.morseMsg}}</span>
      </span>        
  </div>
  <div class="scoreQuery" ms-visible="aboutmorse.morseFlag===1||aboutmorse.morseFlag==='1'">
      <input class="hidden" type="text" name="hspDdfxpgbInfCustom.ddfxpgbSeq" id="ddfxpgbSeq" value="${ddfxpgbSeq}">
      <div class="DangerContent panelContent">
        <ul class="tableUl paneltab">
          <li class="twoLi">
            <span class="titleSpan titleCol">近3月有无跌倒</span>
            <label ms-repeat="systemList.jsgyywddCodList" ms-attr-for="jsgyywddCod{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="jsgyywddCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('jsgyywddCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.jsgyywddCod" name="hspDdfxpgbInfCustom.jsgyywddCod">
          </li>
          <li class="twoLi">
            <span class="titleSpan">多于一个疾病诊断</span>
            <label ms-repeat="systemList.dyygjbpdCodList" ms-attr-for="dyygjbpdCod{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="dyygjbpdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('dyygjbpdCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.dyygjbpdCod" name="hspDdfxpgbInfCustom.dyygjbpdCod">
          </li>
          <li>
            <span class="titleSpan titleCol">行走辅助</span>
            <label ms-repeat="systemList.xzfzCodList" ms-attr-for="xzfzCod{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="xzfzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('xzfzCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.xzfzCod" name="hspDdfxpgbInfCustom.xzfzCod">
          </li>
          <li class="twoLi">
            <span class="titleSpan">静脉治疗/使用跌倒高风险药</span>
            <label ms-repeat="systemList.jmzlsyddgfxyCodList" ms-attr-for="jmzlsyddgfxyCod{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="jmzlsyddgfxyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('jmzlsyddgfxyCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.jmzlsyddgfxyCod" name="hspDdfxpgbInfCustom.jmzlsyddgfxyCod">
          </li>
          <li>
            <span class="titleSpan titleCol">步态</span>
            <label ms-repeat="systemList.btCodList" ms-attr-for="btCod{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="btCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('btCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.btCod" name="hspDdfxpgbInfCustom.btCod">
          </li>
          <li class="twoLi">
            <span class="titleSpan">认知能力</span>
            <label ms-repeat="systemList.rznlCodList" ms-attr-for="rznlCod{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="rznlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('rznlCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.rznlCod" name="hspDdfxpgbInfCustom.rznlCod">
          </li>
          
        </ul>
        <div class="scoreCheckDiv">
          <span class="boldFont">标准护理措施：</span><br />
          <span  ms-repeat="systemList.hlcsCodList">
            <label ms-attr-for="hlcsCod{{el.infocode}}" class="lab-title">
              <input ms-attr-id="hlcsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('hlcsCod',$index, 'aboutmorse')">{{el.info}}
            </label><br/>
          </span>
          <input type="hidden" ms-duplex-string="xtpghideMsg.hlcsCod" name="hspDdfxpgbInfCustom.hlcsCod"/>
        </div>
        <div class="scoreDiv">
          <span>
            <span class="boldFont">评估结果：{{aboutmorse.zf}} </span><br />
            <span class="boldFont">{{aboutmorse.MorseQk}}</span><br />
            <input type="hidden" name="hspDdfxpgbInfCustom.zf" ms-duplex-string="aboutmorse.zf">
            <span>评定标准：总分＜25分为低风险患者；25-44分为中风险患者；≥45分为高风险患者</span><br>
            <span>评分说明：</span><br />
            <span>1、近3月有无跌倒：本次入院或最近3个月是否有跌倒坠床病史，有25分，无0分。</span><br />
            <span>2、多于一个疾病诊断：患者病案中有两项或更多医学诊断（非同一系统）则评分为15分，只有一项评分为0分。</span><br />
            <span>3、行走辅助：患者行走不需要任何物品辅助，步态自然，或患者卧床休息不能起床活动，则评分为 0 分；患者行走使用拐杖/手杖/助步器则评分为 15 分；患者扶住墙或其他物品行走评分为30分。</span><br />
            <span>4、静脉治疗/使用跌倒高风险药：患者正在进行静脉内治疗或者使用跌倒高风险药治疗（麻醉药、抗组胺药、抗高血压药、镇静催眠药、抗帕金森药、抗癫痫药、抗痉挛药、缓泻药、利尿药、降糖药、骨骼肌松弛药、抗抑郁抗焦虑药、抗精神病药、眼药水）则评分为 25 分，没有静脉治疗、未使用跌倒高风险药则评分为 0 分。备注：跌倒高风险药详见浙江医院《易跌倒药品目录》。</span><br />
            <span>5、步态：正常步态或卧床休息，则评分为 0 分；患者年龄超过 65 岁或存在体位性低血压或步态乏力（小步态或患者不抬腿或拖着脚走），则评分为 10 分；有肢体偏瘫、肢体缺失、或有肢体术后功能尚未完全恢复、帕金森疾病起步困难或特殊步态，包括全盲，或者患者勉强站立，站立后低头，眼睛看地板，下肢颤抖，难以移步，则评分为 20 分。</span><br />
            <span>6、认知能力：患者神志清醒，遵医行为好，明白自己容易跌倒，知道跌倒的危害，有自我保护意识，则评分为0分；患者存在跌倒危险，但过于自信，高估自己的行走能力，认为自己走路完全没问题，或反复跌倒而未引起重视，以及认知障碍，记忆力、判断力下降，没有自我保护意识，则评分为15分。</span>
          </span>
        </div>
      </div>
  </div>
  </div>
</body>