<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
  <div class="panelGde">
    <div class="panelBlock adlBlock">
      <div class="tabtop floatLeft">
        <span class="title">消化系统评估</span>
        <span class="scoSpn" ms-visible="systemtMsg.xhxtFlg==1 && systemtMsg.xtpgXhFlg != 1">已完成</span>
        <span class="isFinish" ms-visible="(systemtMsg.xhxtFlg===0||systemtMsg.xhxtFlg==='0') && systemtMsg.xtpgXhFlg != 1">未完成</span>
        <span class="scoSpn" ms-visible="systemtMsg.xtpgXhFlg == 1">无明显异常</span>   
      </div>
      <span ms-click="toggleBox('DigestAssessFlag','DigestAssessMsg','systemtMsg')" class="edit">
        <img src="../images/hzszyyhems/nurse/edit.png">
        <span>{{systemtMsg.DigestAssessMsg}}</span>
      </span>
    </div>
    <div class="panelContent digestContent" ms-visible="systemtMsg.DigestAssessFlag===1||systemtMsg.DigestAssessFlag==='1'">
      <div class="wrapperShadow">
        <ul>
            <li>
                <label class="titlelab">是否异常：</label>
                <label ms-repeat="systemList.xtpgXhFlgList" ms-attr-for="xtpgXhFlg{{el.infocode}}" class="labWrp">
                <input ms-attr-id="xtpgXhFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgXhFlg',$index)" />
                <span class="content_span">{{el.info}}</span>
                </label>
                <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgXhFlg" ms-duplex-string="systemtMsg.xtpgXhFlg">
            </li>
        </ul>
        <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgXhFlg == 2">
          <li>
            <label class="titlelab">饮食：</label>
            <label ms-repeat="systemList.xhxtpgYsCodList" ms-attr-for="xhxtpgYsCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgYsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgYsCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgYsCod" ms-duplex-string="systemtMsg.xhxtpgYsCod">
          </li>
          <li>
            <label class="titlelab">食欲：</label>
            <label ms-repeat="systemList.xhxtpgSyCodList" ms-attr-for="xhxtpgSyCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgSyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgSyCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgSyCod" ms-duplex-string="systemtMsg.xhxtpgSyCod">
          </li>
          <li>
            <label class="titlelab">恶心：</label>
            <label for="xhxtpgExFlgF" class="labWrp colorSix">
              <input id="xhxtpgExFlgF" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgExFlg ==='0'||systemtMsg.xhxtpgExFlg ===0" ms-click="toggleHspFzjcCustom('xhxtpgExFlg','0','systemtMsg')">
              无
            </label>
            <label for="xhxtpgExFlg" class="labWrp colorSix">
              <input id="xhxtpgExFlg" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgExFlg==1" ms-click="toggleHspFzjcCustom('xhxtpgExFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgExFlg" ms-duplex-string="systemtMsg.xhxtpgExFlg">
            </label>
          </li>
          <li>
            <label class="titlelab">呕吐：</label>
            <label for="xhxtpgOtFlgF" class="labWrp colorSix">
              <input id="xhxtpgOtFlgF" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgOtFlg ==='0'||systemtMsg.xhxtpgOtFlg ===0" ms-click="toggleHspFzjcCustom('xhxtpgOtFlg','0','systemtMsg')">
              无
            </label>
            <label for="xhxtpgOtFlg" class="labWrp colorSix">
              <input id="xhxtpgOtFlg" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgOtFlg==1" ms-click="toggleHspFzjcCustom('xhxtpgOtFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgOtFlg" ms-duplex-string="systemtMsg.xhxtpgOtFlg">
            </label>
            <span class="content_span labWrp">
              呕吐颜色 <input type="text" name="hspXhxtpgInfCustom.xhxtpgOtYs" ms-duplex-string="systemtMsg.xhxtpgOtYs"
                class="inputLth" maxlength="10">
            </span>
            <span class="content_span labWrp">
              量 <input type="text" name="hspXhxtpgInfCustom.xhxtpgOtL" ms-duplex-string="systemtMsg.xhxtpgOtL" class="inputLth"
                ms-keyup="onlyNum('xhxtpgOtL',2,9999.99)"> ml
            </span>
          </li>
          <li>
            <label class="titlelab">腹部膨隆：</label>
            <label ms-repeat="systemList.xhxtpgFbpzList" ms-attr-for="xhxtpgFbpz{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgFbpz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgFbpz',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgFbpz" ms-duplex-string="systemtMsg.xhxtpgFbpz">
          </li>
          <li>
            <label class="titlelab">腹部触感：</label>
            <label ms-repeat="systemList.xhxtpgFbcgList" ms-attr-for="xhxtpgFbcg{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgFbcg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgFbcg',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgFbcg" ms-duplex-string="systemtMsg.xhxtpgFbcg">
          </li>
          <li>
            <label class="titlelab">腹胀：</label>
            <label ms-repeat="systemList.xhxtpgFzCodList" ms-attr-for="xhxtpgFzCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgFzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgFzCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgFzCod" ms-duplex-string="systemtMsg.xhxtpgFzCod">
          </li>
          <li>
            <label class="titlelab">腹部压痛：</label>
            <label ms-repeat="systemList.xhxtpgFbytCodList" ms-attr-for="xhxtpgFbytCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgFbytCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('xhxtpgFbytCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgFbytCod" ms-duplex-string="xtpghideMsg.xhxtpgFbytCod">
          </li>
          <li>
            <label class="titlelab">腹部反跳痛：</label>
            <label for="xhxtpgFbfttFlgF" class="labWrp colorSix">
              <input id="xhxtpgFbfttFlgF" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgFbfttFlg ==='0'||systemtMsg.xhxtpgFbfttFlg ===0" ms-click="toggleHspFzjcCustom('xhxtpgFbfttFlg','0','systemtMsg')">
              无
            </label>
            <label for="xhxtpgFbfttFlg" class="labWrp colorSix">
              <input id="xhxtpgFbfttFlg" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgFbfttFlg==1" ms-click="toggleHspFzjcCustom('xhxtpgFbfttFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgFbfttFlg" ms-duplex-string="systemtMsg.xhxtpgFbfttFlg">
            </label>
          </li>
          <li>
            <label class="titlelab">肠鸣音：</label>
            <label ms-repeat="systemList.xhxtpgCmyCodList" ms-attr-for="xhxtpgCmyCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgCmyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgCmyCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgCmyCod" ms-duplex-string="systemtMsg.xhxtpgCmyCod">
          </li>
          <li>
            <label class="titlelab">排便：</label>
            <label ms-repeat="systemList.xhxtpgPbCodList" ms-attr-for="xhxtpgPbCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xhxtpgPbCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xhxtpgPbCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgPbCod" ms-duplex-string="systemtMsg.xhxtpgPbCod">
          </li>
          <li>
            <label class="titlelab">腹腔冲洗：</label>
            <label for="xhxtpgFqcxFlgF" class="labWrp colorSix">
              <input id="xhxtpgFqcxFlgF" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgFqcxFlg ==='0'||systemtMsg.xhxtpgFqcxFlg ===0" ms-click="toggleHspFzjcCustom('xhxtpgFqcxFlg','0','systemtMsg')">
              无
            </label>
            <label for="xhxtpgFqcxFlg" class="labWrp colorSix">
              <input id="xhxtpgFqcxFlg" type="checkbox" ms-attr-checked="systemtMsg.xhxtpgFqcxFlg==1" ms-click="toggleHspFzjcCustom('xhxtpgFqcxFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspXhxtpgInfCustom.xhxtpgFqcxFlg" ms-duplex-string="systemtMsg.xhxtpgFqcxFlg">
            </label>
          </li>
          <li>
            <label class="titlelab">腹围：</label>
            <input type="text" ms-duplex-string="systemtMsg.xhxtpgFw" class="inputLth" name="hspXhxtpgInfCustom.xhxtpgFw"
              ms-keyup="onlyNum('xhxtpgFw',2,9999.99)" ms-change="onlyNum('xhxtpgFw',2,9999.99)" ms-input="onlyNum('xhxtpgFw',2,9999.99)"> CM
            <label class="titlelab">TPN滴速：</label>
            <input type="text" ms-duplex-string="systemtMsg.xhxtpgTpnds" class="inputLth" name="hspXhxtpgInfCustom.xhxtpgTpnds"
              ms-keyup="onlyNum('xhxtpgTpnds',2,9999.99)" ms-change="onlyNum('xhxtpgTpnds',2,9999.99)" ms-input="onlyNum('xhxtpgTpnds',2,9999.99)"> ml/H
            <label class="titlelab">PPN滴速：</label>
            <input type="text" ms-duplex-string="systemtMsg.xhxtpgPpnds" class="inputLth" name="hspXhxtpgInfCustom.xhxtpgPpnds"
              ms-keyup="onlyNum('xhxtpgPpnds',2,9999.99)"  ms-change="onlyNum('xhxtpgPpnds',2,9999.99)"  ms-input="onlyNum('xhxtpgPpnds',2,9999.99)"> ml/H
          </li>
          <li>
            <label class="titlelab">备注：</label>
            <input class="remarkInput" type="text" name="hspXhxtpgInfCustom.xhxtpgMemo" ms-duplex-string="systemtMsg.xhxtpgMemo"
              maxlength="120">
          </li>
        </ul>
      </div>
    </div>
  </div>
</body>