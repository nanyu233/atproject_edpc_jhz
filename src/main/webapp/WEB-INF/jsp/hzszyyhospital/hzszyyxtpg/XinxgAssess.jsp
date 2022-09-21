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
              <span class="title">心血管系统评估</span>  
              <span class="scoSpn" ms-visible="systemtMsg.xxgxtFlg==1 && systemtMsg.xtpgXxgFlg != 1">已完成</span>
              <span class="isFinish" ms-visible="(systemtMsg.xxgxtFlg===0||systemtMsg.xxgxtFlg==='0') && systemtMsg.xtpgXxgFlg != 1">未完成</span>   
              <span class="scoSpn" ms-visible="systemtMsg.xtpgXxgFlg == 1">无明显异常</span>   
            </div>
            <span ms-click="toggleBox('XinxgAssessFlag','XinxgAssessMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.XinxgAssessMsg}}</span>
            </span>        
        </div>
        <div class="panelContent XinxgContent" ms-visible="systemtMsg.XinxgAssessFlag===1||systemtMsg.XinxgAssessFlag==='1'">
            <div class="wrapperShadow">
                <ul>
                    <li>
                        <label class="titlelab">是否异常：</label>
                        <label ms-repeat="systemList.xtpgXxgFlgList" ms-attr-for="xtpgXxgFlg{{el.infocode}}" class="labWrp">
                        <input ms-attr-id="xtpgXxgFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgXxgFlg',$index)" />
                        <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgXxgFlg" ms-duplex-string="systemtMsg.xtpgXxgFlg">
                    </li>
                </ul>
                <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgXxgFlg == 2">
                    <li>
                        <label class="titlelab">心电监护：</label>
                        <label for="xxgxtpgXdjhFlgF" class="labWrp colorSix">
                            <input id="xxgxtpgXdjhFlgF" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXdjhFlg==='0'||systemtMsg.xxgxtpgXdjhFlg ===0" ms-click="toggleHspFzjcCustom('xxgxtpgXdjhFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="xxgxtpgXdjhFlg" class="labWrp colorSix">
                            <input id="xxgxtpgXdjhFlg" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXdjhFlg == 1" ms-click="toggleHspFzjcCustom('xxgxtpgXdjhFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspXxgxtpgInfCustom.xxgxtpgXdjhFlg" ms-duplex-string="systemtMsg.xxgxtpgXdjhFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">心率：</label>
                        <input type="text" name="hspXxgxtpgInfCustom.xxgxtpgXlCs" ms-duplex-string="systemtMsg.xxgxtpgXlCs" class="inputLth" ms-keyup="onlyNum('xxgxtpgXlCs')" maxlength="4"> 次/分
                    </li>
                    <li>
                        <label class="titlelab">心律：</label>
                        <label ms-repeat="systemList.xxgxtpgXlZtCodList" ms-attr-for="xxgxtpgXlZtCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="xxgxtpgXlZtCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xxgxtpgXlZtCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXxgxtpgInfCustom.xxgxtpgXlZtCod" ms-duplex-string="systemtMsg.xxgxtpgXlZtCod">
                    </li>
                    <li>
                        <label class="titlelab">胸闷：</label>
                        <label for="xxgxtpgXmFlgF" class="labWrp colorSix">
                            <input id="xxgxtpgXmFlgF" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXmFlg==='0'||systemtMsg.xxgxtpgXmFlg ===0" ms-click="toggleHspFzjcCustom('xxgxtpgXmFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="xxgxtpgXmFlg" class="labWrp colorSix">
                            <input id="xxgxtpgXmFlg" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXmFlg==1" ms-click="toggleHspFzjcCustom('xxgxtpgXmFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspXxgxtpgInfCustom.xxgxtpgXmFlg" ms-duplex-string="systemtMsg.xxgxtpgXmFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">胸痛：</label>
                        <label for="xxgxtpgXtFlgF" class="labWrp colorSix">
                            <input id="xxgxtpgXtFlgF" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXtFlg==='0'||systemtMsg.xxgxtpgXtFlg ===0" ms-click="toggleHspFzjcCustom('xxgxtpgXtFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="xxgxtpgXtFlg" class="labWrp colorSix">
                            <input id="xxgxtpgXtFlg" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXtFlg==1" ms-click="toggleHspFzjcCustom('xxgxtpgXtFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspXxgxtpgInfCustom.xxgxtpgXtFlg" ms-duplex-string="systemtMsg.xxgxtpgXtFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">心悸：</label>
                        <label for="xxgxtpgXjFlgF" class="labWrp colorSix">
                            <input id="xxgxtpgXjFlgF" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXjFlg==='0'||systemtMsg.xxgxtpgXjFlg ===0" ms-click="toggleHspFzjcCustom('xxgxtpgXjFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="xxgxtpgXjFlg" class="labWrp colorSix">
                            <input id="xxgxtpgXjFlg" type="checkbox" ms-attr-checked="systemtMsg.xxgxtpgXjFlg==1" ms-click="toggleHspFzjcCustom('xxgxtpgXjFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspXxgxtpgInfCustom.xxgxtpgXjFlg" ms-duplex-string="systemtMsg.xxgxtpgXjFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">左足背动脉搏动：</label>
                        <label ms-repeat="systemList.zzXxgxtpgBdmbdCodList" ms-attr-for="zzXxgxtpgBdmbdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="zzXxgxtpgBdmbdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('zzXxgxtpgBdmbdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXxgxtpgInfCustom.zzXxgxtpgBdmbdCod" ms-duplex-string="systemtMsg.zzXxgxtpgBdmbdCod">
                    </li>
                    <li>
                        <label class="titlelab">右足背动脉搏动：</label>
                        <label ms-repeat="systemList.yzXxgxtpgBdmbdCodList" ms-attr-for="yzXxgxtpgBdmbdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="yzXxgxtpgBdmbdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('yzXxgxtpgBdmbdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXxgxtpgInfCustom.yzXxgxtpgBdmbdCod" ms-duplex-string="systemtMsg.yzXxgxtpgBdmbdCod">
                    </li>
                    <li>
                        <label class="titlelab">左桡动脉搏动：</label>
                        <label ms-repeat="systemList.zrXxgxtpgBdmbdCodList" ms-attr-for="zrXxgxtpgBdmbdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="zrXxgxtpgBdmbdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('zrXxgxtpgBdmbdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXxgxtpgInfCustom.zrXxgxtpgBdmbdCod" ms-duplex-string="systemtMsg.zrXxgxtpgBdmbdCod">
                    </li>
                    <li>
                        <label class="titlelab">右桡动脉搏动：</label>
                        <label ms-repeat="systemList.yrXxgxtpgBdmbdCodList" ms-attr-for="yrXxgxtpgBdmbdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="yrXxgxtpgBdmbdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('yrXxgxtpgBdmbdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXxgxtpgInfCustom.yrXxgxtpgBdmbdCod" ms-duplex-string="systemtMsg.yrXxgxtpgBdmbdCod">
                    </li>
                    <li class="showMsgLi">
                        <div class="showDiv" id="showDiv">
                            <p class="showMsg">
                                “Allen试验：目的：检查手部的血液供应，桡动脉和尺动脉之间的吻合情况。方法步骤：1.术者用双手同时按压桡动脉和尺动脉；2.嘱患者反复用力握拳和张开手指5-7次至手掌变白；3.松开对尺动脉的压迫，继续保持压迫桡动脉，观察手掌颜色变化。若手掌颜色5s之内迅速变红或恢复正常，即Allen试验阴性，表明尺动脉和桡动脉间存在良好的侧支循环；相反，若5s手掌颜色仍为苍白，Allen试验阳性，这表明手掌侧支循环”
                            </p>
                            <img src="../images/hzszyyhems/systemAssess/triangle.png">
                        </div>
                        <label class="titlelab hovershow">毛细血管充盈：</label>
                        <label ms-repeat="systemList.xxgxtpgMxxgcyList" ms-attr-for="xxgxtpgMxxgcy{{el.infocode}}" class="labWrp" ms-hover="showtip()">
                            <input ms-attr-id="xxgxtpgMxxgcy{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xxgxtpgMxxgcy',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXxgxtpgInfCustom.xxgxtpgMxxgcy" ms-duplex-string="systemtMsg.xxgxtpgMxxgcy">
                    </li>
                    <li>
                        <label class="titlelab">备注：</label>
                        <input class="remarkInput" type="text" name="hspXxgxtpgInfCustom.xxgxtpgMemo" ms-duplex-string="systemtMsg.xxgxtpgMemo" maxlength="120">
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
