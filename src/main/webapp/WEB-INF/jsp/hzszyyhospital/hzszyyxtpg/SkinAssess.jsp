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
              <span class="title">骨骼、肌、皮肤系统</span>
              <span class="scoSpn" ms-visible="systemtMsg.GgjpfxtFlg==1 && systemtMsg.xtpgGgFlg != '1'">已完成</span>
              <span class="isFinish" ms-visible="(systemtMsg.GgjpfxtFlg===0||systemtMsg.GgjpfxtFlg==='0') && systemtMsg.xtpgGgFlg != '1'">未完成</span>   
              <span class="scoSpn" ms-visible="systemtMsg.xtpgGgFlg == 1">无明显异常</span>   
            </div>
            <span ms-click="toggleBox('skinAssessFlag','skinAssessMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.skinAssessMsg}}</span>
            </span>        
        </div>
        <div class="panelContent skinContent" ms-visible="systemtMsg.skinAssessFlag===1||systemtMsg.skinAssessFlag==='1'">
            <div class="wrapperShadow">
                <ul>
                    <li>
                        <label class="titlelab">是否异常：</label>
                        <label ms-repeat="systemList.xtpgGgFlgList" ms-attr-for="xtpgGgFlg{{el.infocode}}" class="labWrp">
                        <input ms-attr-id="xtpgGgFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgGgFlg',$index)" />
                        <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgGgFlg" ms-duplex-string="systemtMsg.xtpgGgFlg">
                    </li>
                </ul>
                <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgGgFlg == 2">
                    <li>
                        <label class="titlelab">皮肤颜色：</label>
                        <div class="skinlineDiv">
                            <label ms-repeat="systemList.ggjpfxtPfysCodList" ms-attr-for="ggjpfxtPfysCod{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="ggjpfxtPfysCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('ggjpfxtPfysCod',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtPfysCod" ms-duplex-string="xtpghideMsg.ggjpfxtPfysCod">
                        </div>
                    </li>
                    <li>
                        <label class="titlelab">皮肤温度：</label>
                        <label ms-repeat="systemList.ggjpfxtPfwdCodList" ms-attr-for="ggjpfxtPfwdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtPfwdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtPfwdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtPfwdCod" ms-duplex-string="systemtMsg.ggjpfxtPfwdCod">
                        <span class="content_span"> 其他：</span>
                        <input type="text" name="hspGgjpfxtInfCustom.ggjpfxtPfwdQt" ms-duplex-string="systemtMsg.ggjpfxtPfwdQt" class="inputLth" maxlength="40">
                    </li>
                    <li>
                        <label class="titlelab">水肿范围：</label>
                        <div class="skinlineDiv">
                            <label ms-repeat="systemList.ggjpfxtSzfwCodList" ms-attr-for="ggjpfxtSzfwCod{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="ggjpfxtSzfwCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('ggjpfxtSzfwCod',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtSzfwCod" ms-duplex-string="xtpghideMsg.ggjpfxtSzfwCod">
                            <span class="content_span"> 其他：</span>
                            <input type="text" name="hspGgjpfxtInfCustom.ggjpfxtSzfwQt" ms-duplex-string="systemtMsg.ggjpfxtSzfwQt" class="inputLth" maxlength="40">
                        </div>
                    </li>
                    <li>
                        <label class="titlelab">水肿性质：</label>
                        <label ms-repeat="systemList.ggjpfxtSzxzCodList" ms-attr-for="ggjpfxtSzxzCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtSzxzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtSzxzCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtSzxzCod" ms-duplex-string="systemtMsg.ggjpfxtSzxzCod">
                    </li>
                    <li id="showlimsg">
                        <div class="showDiv" id="showDivSkin1">
                            <p class="showMsg">踝以下</p>
                            <img src="../images/hzszyyhems/systemAssess/minitriangle.png">
                        </div>
                        <div class="showDivB" id="showDivSkin2">
                            <p class="showMsg">膝以下</p>
                            <img src="../images/hzszyyhems/systemAssess/minitriangle.png">
                        </div>
                        <div class="showDivC" id="showDivSkin3">
                            <p class="showMsg">股以下</p>
                            <img src="../images/hzszyyhems/systemAssess/minitriangle.png">
                        </div>
                        <div class="showDivD" id="showDivSkin4">
                            <p class="showMsg">全身浮肿</p>
                            <img src="../images/hzszyyhems/systemAssess/minitriangle.png">
                        </div>
                        <label class="titlelab">水肿程度：</label>
                        <label ms-repeat="systemList.ggjpfxtSzcdCodList" ms-attr-for="ggjpfxtSzcdCod{{el.infocode}}" class="labWrp" ms-mouseover ="showhide(el.infocode)">
                            <input ms-attr-id="ggjpfxtSzcdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtSzcdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtSzcdCod" ms-duplex-string="systemtMsg.ggjpfxtSzcdCod">
                    </li>
                    <li>
                        <label class="titlelab">扁桃体：</label>
                        <label ms-repeat="systemList.ggjpfxtBttCodList" ms-attr-for="ggjpfxtBttCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtBttCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtBttCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtBttCod" ms-duplex-string="systemtMsg.ggjpfxtBttCod">
                    </li>
                    <li>
                        <label class="titlelab">口腔粘膜：</label>
                        <label ms-repeat="systemList.ggjpfxtKqnmCodList" ms-attr-for="ggjpfxtKqnmCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtKqnmCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtKqnmCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtKqnmCod" ms-duplex-string="systemtMsg.ggjpfxtKqnmCod">
                    </li>
                    <li>
                        <label class="titlelab">造口粘膜：</label>
                        <label ms-repeat="systemList.ggjpfxtZknmCodList" ms-attr-for="ggjpfxtZknmCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtZknmCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtZknmCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtZknmCod" ms-duplex-string="systemtMsg.ggjpfxtZknmCod">
                    </li>
                    <li>
                        <label class="titlelab">疤痕：</label>
                        <label for="ggjpfxtBhFlgF" class="labWrp colorSix">
                            <input id="ggjpfxtBhFlgF" type="checkbox" ms-attr-checked="systemtMsg.ggjpfxtBhFlg==='0'||systemtMsg.ggjpfxtBhFlg ===0" ms-click="toggleHspFzjcCustom('ggjpfxtBhFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="ggjpfxtBhFlg" class="labWrp colorSix">
                            <input id="ggjpfxtBhFlg" type="checkbox" ms-attr-checked="systemtMsg.ggjpfxtBhFlg==1" ms-click="toggleHspFzjcCustom('ggjpfxtBhFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtBhFlg" ms-duplex-string="systemtMsg.ggjpfxtBhFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">伤口部位：</label>
                        <div class="skinlineDiv">
                            <label ms-repeat="systemList.ggjpfxtSkbwCodList" ms-attr-for="ggjpfxtSkbwCod{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="ggjpfxtSkbwCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('ggjpfxtSkbwCod',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtSkbwCod" ms-duplex-string="xtpghideMsg.ggjpfxtSkbwCod"><br/>
                            <span class="content_span marginbottom"> 其他：</span>
                            <input type="text" name="hspGgjpfxtInfCustom.ggjpfxtSkbwQt" ms-duplex-string="systemtMsg.ggjpfxtSkbwQt" class="inputLth" maxlength="40">
                        </div>
                    </li>
                    <li>
                        <label class="titlelab">伤口：</label>
                        <label ms-repeat="systemList.ggjpfxtSkCodList" ms-attr-for="ggjpfxtSkCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtSkCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtSkCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtSkCod" ms-duplex-string="systemtMsg.ggjpfxtSkCod">
                    </li>
                    <li>
                        <label class="titlelab">压疮：</label>
                        <input type="text" name="hspGgjpfxtInfCustom.ggjpfxtYc" ms-duplex-string="systemtMsg.ggjpfxtYc" class="inputLth" maxlength="40">
                    </li>
                    <li>
                        <label class="titlelab">假肢：</label>
                        <label for="ggjpfxtJzFlgF" class="labWrp colorSix">
                            <input id="ggjpfxtJzFlgF" type="checkbox" ms-attr-checked="systemtMsg.ggjpfxtJzFlg==='0'||systemtMsg.ggjpfxtJzFlg ===0" ms-click="toggleHspFzjcCustom('ggjpfxtJzFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="ggjpfxtJzFlg" class="labWrp colorSix">
                            <input id="ggjpfxtJzFlg" type="checkbox" ms-attr-checked="systemtMsg.ggjpfxtJzFlg==1" ms-click="toggleHspFzjcCustom('ggjpfxtJzFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtJzFlg" ms-duplex-string="systemtMsg.ggjpfxtJzFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">固定：</label>
                        <label ms-repeat="systemList.ggjpfxtGdCodList" ms-attr-for="ggjpfxtGdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtGdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtGdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtGdCod" ms-duplex-string="systemtMsg.ggjpfxtGdCod">
                        <span class="content_span"> 其他：</span>
                        <input type="text" name="hspGgjpfxtInfCustom.ggjpfxtGdQt" ms-duplex-string="systemtMsg.ggjpfxtGdQt" class="inputLth" maxlength="40">
                    </li>
                    <li>
                        <label class="titlelab">活动方式：</label>
                        <label ms-repeat="systemList.ggjpfxtHdfsCodList" ms-attr-for="ggjpfxtHdfsCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtHdfsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtHdfsCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtHdfsCod" ms-duplex-string="systemtMsg.ggjpfxtHdfsCod">
                        <span class="content_span"> 其他：</span>
                        <input type="text" name="hspGgjpfxtInfCustom.ggjpfxtHdfsQt" ms-duplex-string="systemtMsg.ggjpfxtHdfsQt" class="inputLth" maxlength="40">
                    </li>
                    <li>
                        <label class="titlelab">口腔炎：</label>
                        <label ms-repeat="systemList.ggjpfxtKqyCodList" ms-attr-for="ggjpfxtKqyCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="ggjpfxtKqyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('ggjpfxtKqyCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspGgjpfxtInfCustom.ggjpfxtKqyCod" ms-duplex-string="systemtMsg.ggjpfxtKqyCod">
                    </li>
                    <li>
                        <label class="titlelab">备注：</label>
                        <input class="remarkInput" type="text" name="hspGgjpfxtInfCustom.ggjpfxtMemo" ms-duplex-string="systemtMsg.ggjpfxtMemo" maxlength="120">
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
