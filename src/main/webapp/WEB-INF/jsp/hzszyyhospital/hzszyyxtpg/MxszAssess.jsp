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
              <span class="title">泌尿生殖系统评估 </span>  
              <span class="scoSpn" ms-visible="systemtMsg.mnszxtFlg==1 && systemtMsg.xtpgMnFlg != '1'">已完成</span>
              <span class="isFinish" ms-visible="(systemtMsg.mnszxtFlg===0||systemtMsg.mnszxtFlg==='0')&& systemtMsg.xtpgMnFlg != '1'">未完成</span>   
              <span class="scoSpn" ms-visible="systemtMsg.xtpgMnFlg == 1">无明显异常</span>   
            </div>
            <span ms-click="toggleBox('mxszAssessFlag','mxszAssessMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.mxszAssessMsg}}</span>
            </span>        
        </div>
        <div class="panelContent MxszContent" ms-visible="systemtMsg.mxszAssessFlag===1||systemtMsg.mxszAssessFlag==='1'">
            <div class="wrapperShadow">
                <ul>
                    <li>
                        <label class="titlelab">是否异常：</label>
                        <label ms-repeat="systemList.xtpgMnFlgList" ms-attr-for="xtpgMnFlg{{el.infocode}}" class="labWrp">
                        <input ms-attr-id="xtpgMnFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgMnFlg',$index)" />
                        <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgMnFlg" ms-duplex-string="systemtMsg.xtpgMnFlg">
                    </li>
                </ul>
                <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgMnFlg == 2">
                    <li>
                        <label class="titlelab">排尿：</label>
                        <div class="newlineDiv">
                            <label ms-repeat="systemList.mnszxtpgPnCodList" ms-attr-for="mnszxtpgPnCod{{el.infocode}}" class="labWrp">
                                <input ms-attr-id="mnszxtpgPnCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('mnszxtpgPnCod',$index)" />
                                <span class="content_span">{{el.info}}</span>
                            </label>
                            <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgPnCod" ms-duplex-string="xtpghideMsg.mnszxtpgPnCod">
                        </div>
                    </li>
                    <li>
                        <label class="titlelab">尿液性质：</label>
                        <label ms-repeat="systemList.mnszxtpgNyxzCodList" ms-attr-for="mnszxtpgNyxzCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="mnszxtpgNyxzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('mnszxtpgNyxzCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgNyxzCod" ms-duplex-string="systemtMsg.mnszxtpgNyxzCod">
                    </li>
                    <li>
                        <label class="titlelab">膀胱冲洗：</label>
                        <label for="mnszxtpgPgcxFlgF" class="labWrp colorSix">
                            <input id="mnszxtpgPgcxFlgF" type="checkbox" ms-attr-checked="systemtMsg.mnszxtpgPgcxFlg==='0'||systemtMsg.mnszxtpgPgcxFlg ===0" ms-click="toggleHspFzjcCustom('mnszxtpgPgcxFlg','0','systemtMsg')">
                            无
                        </label>
                        <label for="mnszxtpgPgcxFlg" class="labWrp colorSix">
                            <input id="mnszxtpgPgcxFlg" type="checkbox" ms-attr-checked="systemtMsg.mnszxtpgPgcxFlg==1" ms-click="toggleHspFzjcCustom('mnszxtpgPgcxFlg',1,'systemtMsg')"> 有
                            <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgPgcxFlg" ms-duplex-string="systemtMsg.mnszxtpgPgcxFlg">
                        </label>
                    </li>
                    <li>
                        <label class="titlelab">透析：</label>
                        <label ms-repeat="systemList.mnszxtpgTxCodList" ms-attr-for="mnszxtpgTxCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="mnszxtpgTxCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('mnszxtpgTxCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgTxCod" ms-duplex-string="systemtMsg.mnszxtpgTxCod">
                    </li>
                    <li>
                        <label class="titlelab">动静脉瘘：</label>
                        <label ms-repeat="systemList.mnszxtpgDjmwCodList" ms-attr-for="mnszxtpgDjmwCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="mnszxtpgDjmwCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('mnszxtpgDjmwCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgDjmwCod" ms-duplex-string="xtpghideMsg.mnszxtpgDjmwCod">
                    </li>
                    <li>
                        <label class="titlelab">妊娠状态：</label>
                        <label ms-repeat="systemList.mnszxtpgRsztCodList" ms-attr-for="mnszxtpgRsztCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="mnszxtpgRsztCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('mnszxtpgRsztCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgRsztCod" ms-duplex-string="xtpghideMsg.mnszxtpgRsztCod">
                    </li>
                    <li>
                        <label class="titlelab">月经：</label>
                        <label ms-repeat="systemList.mnszxtpgYjCodList" ms-attr-for="mnszxtpgYjCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="mnszxtpgYjCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('mnszxtpgYjCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgYjCod" ms-duplex-string="xtpghideMsg.mnszxtpgYjCod">
                    </li>
                    <li>
                        <label class="titlelab">白带：</label>
                        <label ms-repeat="systemList.mnszxtpgBdCodList" ms-attr-for="mnszxtpgBdCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="mnszxtpgBdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('mnszxtpgBdCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <span class="content_span"> 其他：</span>
                        <input type="text" name="hspMnszxtpgInfCustom.mnszxtpgBdQt" ms-duplex-string="systemtMsg.mnszxtpgBdQt" class="inputLth" maxlength="40">
                        <input class="hidden" type="text" name="hspMnszxtpgInfCustom.mnszxtpgBdCod" ms-duplex-string="xtpghideMsg.mnszxtpgBdCod">
                    </li>
                    <li>
                        <label class="titlelab">备注：</label>
                        <input class="remarkInput" type="text" name="hspMnszxtpgInfCustom.mnszxtpgMeno" ms-duplex-string="systemtMsg.mnszxtpgMeno" maxlength="120">
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
