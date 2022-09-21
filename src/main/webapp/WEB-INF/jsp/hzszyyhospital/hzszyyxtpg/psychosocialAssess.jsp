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
              <span class="title">心理社会评估</span>  
              <span class="scoSpn" ms-visible="systemtMsg.xlshpgFlg==1 && systemtMsg.xtpgXlFlg != '1'">已完成</span>
              <span class="isFinish" ms-visible="(systemtMsg.xlshpgFlg===0||systemtMsg.xlshpgFlg==='0') && systemtMsg.xtpgXlFlg != '1'">未完成</span> 
              <span class="scoSpn" ms-visible="systemtMsg.xtpgXlFlg == 1">无明显异常</span>   
            </div>
            <span ms-click="toggleBox('psychosocialAssessFlag','psychosocialAssessMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.psychosocialAssessMsg}}</span>
            </span>        
        </div>
        <div class="panelContent" ms-visible="systemtMsg.psychosocialAssessFlag===1||systemtMsg.psychosocialAssessFlag==='1'">
            <div class="wrapperShadow">
                <ul>
                    <li>
                        <label class="titlelab">是否异常：</label>
                        <label ms-repeat="systemList.xtpgXlFlgList" ms-attr-for="xtpgXlFlg{{el.infocode}}" class="labWrp">
                        <input ms-attr-id="xtpgXlFlg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('xtpgXlFlg',$index)" />
                        <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgXlFlg" ms-duplex-string="systemtMsg.xtpgXlFlg">
                    </li>
                </ul>
                <ul class="hiddenPanel" ms-visible="systemtMsg.xtpgXlFlg == 2">
                    <li>
                        <label class="titlelab">精神状态：</label>
                        <label ms-repeat="systemList.xlshpgJsztCodList" ms-attr-for="xlshpgJsztCod{{el.infocode}}" class="labWrp">
                            <input ms-attr-id="xlshpgJsztCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('xlshpgJsztCod',$index)" />
                            <span class="content_span">{{el.info}}</span>
                        </label>
                        <input class="hidden" type="text" name="hspXlshpgInfCustom.xlshpgJsztCod" ms-duplex-string="xtpghideMsg.xlshpgJsztCod">
                        <span class="content_span"> 其他：</span>
                        <input type="text" name="hspXlshpgInfCustom.xlshpgJsztQt" ms-duplex-string="systemtMsg.xlshpgJsztQt" class="inputLth" maxlength="40">
                    </li>
                </ul>
            </div>
        </div>
    </div>
</body>
