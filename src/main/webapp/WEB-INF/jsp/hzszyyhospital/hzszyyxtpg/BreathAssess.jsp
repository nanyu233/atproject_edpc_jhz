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
        <span class="title">呼吸系统评估</span>
        <span class="scoSpn" ms-visible="systemtMsg.hxxtFlg==1 && systemtMsg.xtpgHxFlg != '1'">已完成</span>
        <span class="isFinish" ms-visible="(systemtMsg.hxxtFlg===0 ||systemtMsg.hxxtFlg==='0') && systemtMsg.xtpgHxFlg != '1'">未完成</span>
        <span class="scoSpn" ms-visible="systemtMsg.xtpgHxFlg == 1">无明显异常</span>   
      </div>
      <span ms-click="toggleBox('BreathAssessFlag','BreathAssessMsg','systemtMsg')" class="edit">
        <img src="../images/hzszyyhems/nurse/edit.png">
        <span>{{systemtMsg.BreathAssessMsg}}</span>
      </span>
    </div>
    <div class="panelContent BreathContent" ms-visible="systemtMsg.BreathAssessFlag===1||systemtMsg.BreathAssessFlag==='1'">
      <div class="wrapperShadow">
        <ul>
          <li>
            <label class="titlelab">是否异常：</label>
            <label ms-repeat="systemList.xtpgHxFlgList" ms-attr-for="xtpgHxFlg{{el.infocode}}" class="labWrp">
              <input ms-attr-id="xtpgHxFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgHxFlg',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgHxFlg" ms-duplex-string="systemtMsg.xtpgHxFlg">
          </li>
        </ul>
        <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgHxFlg == 2">
          <li>
            <label class="titlelab">咳嗽：</label>
            <label ms-repeat="systemList.hxxtpgKsCodList" ms-attr-for="hxxtpgKsCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="hxxtpgKsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('hxxtpgKsCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.hxxtpgKsCod" ms-duplex-string="systemtMsg.hxxtpgKsCod">
            <span class="content_span"> 其他：</span><input type="text" maxlength="40" ms-duplex-string="systemtMsg.hxxtpgKsQt"
              class="inputLth" name="hspHxxtpgInfCustom.hxxtpgKsQt">
          </li>
          <li>
            <label class="titlelab">痰液性状：</label>
            <label ms-repeat="systemList.hxxtpgTxxzCodList" ms-attr-for="hxxtpgTxxzCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="hxxtpgTxxzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('hxxtpgTxxzCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.hxxtpgTxxzCod" ms-duplex-string="systemtMsg.hxxtpgTxxzCod">
            <span class="content_span"> 其他：</span><input type="text" maxlength="40" ms-duplex-string="systemtMsg.hxxtpgTxxzQt"
              class="inputLth" name="hspHxxtpgInfCustom.hxxtpgTxxzQt">
          </li>
          <li>
            <label class="titlelab">痰量：</label>
            <label ms-repeat="systemList.hxxtpgTlCodList" ms-attr-for="hxxtpgTlCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="hxxtpgTlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('hxxtpgTlCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.hxxtpgTlCod" ms-duplex-string="systemtMsg.hxxtpgTlCod">
          </li>
          <li>
            <label class="titlelab">给氧方式：</label>
            <label ms-repeat="systemList.hxxtpgGyfsCodList" ms-attr-for="hxxtpgGyfsCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="hxxtpgGyfsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('hxxtpgGyfsCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.hxxtpgGyfsCod" ms-duplex-string="systemtMsg.hxxtpgGyfsCod">
          </li>
          <li>
            <label class="titlelab">给氧流量：</label>
            <span class="content_span labWrp"><input type="text" name="hspHxxtpgInfCustom.hxxtpgGyll" ms-duplex-string="systemtMsg.hxxtpgGyll"
                class="inputLth" maxlength="4" ms-keyup="onlyNum('hxxtpgGyll')" ms-change="onlyNum('hxxtpgGyll')" ms-input="onlyNum('hxxtpgGyll')"> L/分</span>
            <span class="content_span labWrp">氧浓度：<input type="text" name="hspHxxtpgInfCustom.hxxtpgYnd"
                ms-duplex-string="systemtMsg.hxxtpgYnd" class="inputLth" maxlength="4" 
                ms-keyup="onlyNum('hxxtpgYnd')" ms-change="onlyNum('hxxtpgYnd')" ms-input="onlyNum('hxxtpgYnd')">
              %</span>
            <span class="content_span labWrp">氧饱和度：<input type="text" name="hspHxxtpgInfCustom.hxxtpgYbhd"
                ms-duplex-string="systemtMsg.hxxtpgYbhd" class="inputLth" maxlength="4"
                ms-keyup="onlyNum('hxxtpgYbhd')"  ms-change="onlyNum('hxxtpgYbhd')"  ms-input="onlyNum('hxxtpgYbhd')">
              %</span>
          </li>
          <li>
            <label class="titlelab">呼吸急促：</label>
            <label ms-repeat="systemList.hxxtpgHxjcList" ms-attr-for="hxxtpgHxjc{{el.infocode}}" class="labWrp">
              <input ms-attr-id="hxxtpgHxjc{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('hxxtpgHxjc',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.hxxtpgHxjc" ms-duplex-string="systemtMsg.hxxtpgHxjc">
          </li>
          <li>
            <label class="titlelab">呼吸音：</label>
            <span class="content_span labWrp">左</span>
            <label ms-repeat="systemList.leftHxxtpgHxyCodList" ms-attr-for="leftHxxtpgHxyCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="leftHxxtpgHxyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('leftHxxtpgHxyCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.leftHxxtpgHxyCod" ms-duplex-string="xtpghideMsg.leftHxxtpgHxyCod">
            <br />
            <span class="rightspan">右</span>
            <label ms-repeat="systemList.rightHxxtpgHxyCodList" ms-attr-for="rightHxxtpgHxyCod{{el.infocode}}" class="labWrp">
              <input ms-attr-id="rightHxxtpgHxyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                ms-click="checkClick('rightHxxtpgHxyCod',$index)" />
              <span class="content_span">{{el.info}}</span>
            </label>
            <input class="hidden" type="text" name="hspHxxtpgInfCustom.rightHxxtpgHxyCod" ms-duplex-string="xtpghideMsg.rightHxxtpgHxyCod">
          </li>
          <li>
            <label class="titlelab">气管切开：</label>
            <label for="qgqkFlgF" class="labWrp colorSix">
              <input id="qgqkFlgF" type="checkbox" ms-attr-checked="systemtMsg.qgqkFlg==='0'||systemtMsg.qgqkFlg ===0" ms-click="toggleHspFzjcCustom('qgqkFlg','0','systemtMsg')">
              无
            </label>
            <label for="qgqkFlg" class="labWrp colorSix">
              <input id="qgqkFlg" type="checkbox" ms-attr-checked="systemtMsg.qgqkFlg==1" ms-click="toggleHspFzjcCustom('qgqkFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.qgqkFlg" ms-duplex-string="systemtMsg.qgqkFlg">
            </label>
            <label class="colorSix labWrp">气切套管型号<input type="text" name="hspHxxtpgInfCustom.qgqkQqtgxh"
                ms-duplex-string="systemtMsg.qgqkQqtgxh" class="inputLth"> 号</label>
            <label for="qgqkQgcgFlg" class="labWrp colorSix">
              <input id="qgqkQgcgFlg" type="checkbox" ms-attr-checked="systemtMsg.qgqkQgcgFlg==1" ms-click="toggleHspFzjcCustom('qgqkQgcgFlg',1,'systemtMsg')">
              气管插管畅
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.qgqkQgcgFlg" ms-duplex-string="systemtMsg.qgqkQgcgFlg">
            </label>
            <label class="colorSix">系带固定松紧<input type="text" name="hspHxxtpgInfCustom.qgqkXdgdsj" ms-duplex-string="systemtMsg.qgqkXdgdsj"
                class="inputLth" ms-keyup="onlyNum('qgqkXdgdsj',2,20)" ms-change="onlyNum('qgqkXdgdsj',2,20)" ms-input="onlyNum('qgqkXdgdsj',2,20)">横指</label><br />
            <label class="rightspan">气囊压力<input type="text" name="hspHxxtpgInfCustom.qgqkQnyl" ms-duplex-string="systemtMsg.qgqkQnyl"
                class="inputLth" ms-keyup="onlyNum('qgqkQnyl')" ms-change="onlyNum('qgqkQnyl')" ms-input="onlyNum('qgqkQnyl')">cmH2O</label>
            <label for="qgqkQgqkchyFlg" class="labWrp colorSix">
              <input id="qgqkQgqkchyFlg" type="checkbox" ms-attr-checked="systemtMsg.qgqkQgqkchyFlg==1" ms-click="toggleHspFzjcCustom('qgqkQgqkchyFlg',1,'systemtMsg')">
              气管切开处换药
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.qgqkQgqkchyFlg" ms-duplex-string="systemtMsg.qgqkQgqkchyFlg">
            </label><br />
            <span class="spcRemark">备注：<input class="remarkInput" type="text" name="hspHxxtpgInfCustom.qgqkQgqkbz"
                ms-duplex-string="systemtMsg.qgqkQgqkbz" maxlength="120"></span>
          </li>
          <li>
            <label class="titlelab">气管插管：</label>
            <label for="qgcgFlgF" class="labWrp colorSix">
              <input id="qgcgFlgF" type="checkbox" ms-attr-checked="systemtMsg.qgcgFlg ==='0'||systemtMsg.qgcgFlg ===0" ms-click="toggleHspFzjcCustom('qgcgFlg','0','systemtMsg')">
              无
            </label>
            <label for="qgcgFlg" class="labWrp colorSix">
              <input id="qgcgFlg" type="checkbox" ms-attr-checked="systemtMsg.qgcgFlg==1" ms-click="toggleHspFzjcCustom('qgcgFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.qgcgFlg" ms-duplex-string="systemtMsg.qgcgFlg">
            </label>
            <label class="colorSix labWrp">气管导管型号<input type="text" name="hspHxxtpgInfCustom.qgcgQgdgxh"
                ms-duplex-string="systemtMsg.qgcgQgdgxh" class="inputLth"> 号</label>
            <label for="qgcgQgcg" class="labWrp colorSix">
              <input id="qgcgQgcg" type="checkbox" ms-attr-checked="systemtMsg.qgcgQgcg==1" ms-click="toggleHspFzjcCustom('qgcgQgcg',1,'systemtMsg')">
              气管插管畅
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.qgcgQgcg" ms-duplex-string="systemtMsg.qgcgQgcg">
            </label>
            <label for="qgcgGdt" class="labWrp colorSix">
              <input id="qgcgGdt" type="checkbox" ms-attr-checked="systemtMsg.qgcgGdt==1" ms-click="toggleHspFzjcCustom('qgcgGdt',1,'systemtMsg')">
              固定妥
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.qgcgGdt" ms-duplex-string="systemtMsg.qgcgGdt">
            </label>
            <label class="colorSix">距门齿<input type="text" name="hspHxxtpgInfCustom.qgcgJmc" ms-duplex-string="systemtMsg.qgcgJmc"
                class="inputLth" ms-keyup="onlyNum('qgcgJmc',2,99.99)" ms-input="onlyNum('qgcgJmc',2,99.99)" ms-change="onlyNum('qgcgJmc',2,99.99)"> cm</label>
          </li>
          <li>
            <label class="titlelab">呼吸功能训练：</label>
            <label for="hxgnxlFlgF" class="labWrp colorSix">
              <input id="hxgnxlFlgF" type="checkbox" ms-attr-checked="systemtMsg.hxgnxlFlg === '0'||systemtMsg.hxgnxlFlg ===0" ms-click="toggleHspFzjcCustom('hxgnxlFlg','0','systemtMsg')">
              无
            </label>
            <label for="hxgnxlFlg" class="labWrp colorSix">
              <input id="hxgnxlFlg" type="checkbox" ms-attr-checked="systemtMsg.hxgnxlFlg==1" ms-click="toggleHspFzjcCustom('hxgnxlFlg',1,'systemtMsg')">
              有
              <input class="hidden" type="text" name="hspHxxtpgInfCustom.hxgnxlFlg" ms-duplex-string="systemtMsg.hxgnxlFlg">
            </label><br />
            <span class="rightspan spnBlk">备注：<input class="remarkInput" type="text" name="hspHxxtpgInfCustom.hxxtpgMemo"
                ms-duplex-string="systemtMsg.hxxtpgMemo" maxlength="120"></span>
          </li>
        </ul>
      </div>
    </div>
  </div>
</body>