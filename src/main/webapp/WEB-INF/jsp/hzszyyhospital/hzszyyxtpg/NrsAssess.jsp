<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
    <div class="panelGde">
        <div class="NrsBlock panelBlock">
            <div class="tabtop floatLeft">
              <span class="title">疼痛评估</span>
              <span class="scoSpn" ms-visible="systemtMsg.nrsFlg==1">已完成</span>
              <span class="isFinish" ms-visible="systemtMsg.nrsFlg===0||systemtMsg.nrsFlg==='0'">未完成</span>    
            </div>
            <span ms-click="toggleBox('nrsAssessFlag','nrsAssessMsg','systemtMsg')" class="edit">
                <img src="../images/hzszyyhems/nurse/edit.png">
                <span>{{systemtMsg.nrsAssessMsg}}</span>
            </span>        
        </div>
        <div class="NrsContent panelContent" ms-visible="systemtMsg.nrsAssessFlag===1||systemtMsg.nrsAssessFlag==='1'">
            <div class="nrsWrapper">
               <div class="content_div">
                   <p class="nrstitle">疼痛部位：</p>
                   <div class="nrsinputDiv">
                       <label ms-repeat="systemList.nrsTtbwList" ms-attr-for="nrsTtbw{{el.infocode}}" class="labWrp">
                           <input ms-attr-id="nrsTtbw{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('nrsTtbw',$index)" />
                           <span class="content_span"> {{el.info}}</span>
                       </label>
                       <input class="hidden" type="text" name="hspNrsInfCustom.nrsTtbw" ms-duplex-string="xtpghideMsg.nrsTtbw">
                       <span class="content_span"> 其他：</span><input type="text" maxlength="40" ms-duplex-string="systemtMsg.nrsTtbwQt" class="qtinput" name="hspNrsInfCustom.nrsTtbwQt">
                   </div>
               </div>
               <div class="content_div">
                   <p class="nrstitle">疼痛性质：</p>
                   <div  class="nrsinputDiv">
                       <label ms-repeat="systemList.nrsTtxzList" ms-attr-for="nrsTtxz{{el.infocode}}" class="labWrp">
                           <input ms-attr-id="nrsTtxz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('nrsTtxz',$index)" />
                           <span class="content_span"> {{el.info}}</span>
                       </label>
                       <input class="hidden" type="text" name="hspNrsInfCustom.nrsTtxz" ms-duplex-string="xtpghideMsg.nrsTtxz">
                       <span class="content_span"> 其他：</span><input type="text" maxlength="40" ms-duplex-string="systemtMsg.nrsTtxzQt" class="qtinput" name="hspNrsInfCustom.nrsTtxzQt">
                   </div>
               </div>
               <div class="content_div">
                   <p class="nrstitle">疼痛时间：</p>
                   <div  class="nrsinputDiv">
                       <label ms-repeat="systemList.nrsTtsjList" ms-attr-for="nrsTtsj{{el.infocode}}" class="labWrp">
                           <input ms-attr-id="nrsTtsj{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioclick('nrsTtsj',$index)" />
                           <span class="content_span"> {{el.info}}</span>
                       </label>
                       <input class="hidden" type="text" name="hspNrsInfCustom.nrsTtsj" ms-duplex-string="systemtMsg.nrsTtsj">
                   </div>
               </div> 
               <div class="content_div">
                   <p class="nrstitle">疼痛控制：</p>
                   <div  class="nrsinputDiv">
                       <label ms-repeat="systemList.nrsTtkzList" ms-attr-for="nrsTtkz{{el.infocode}}" class="labWrp">
                           <input ms-attr-id="nrsTtkz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('nrsTtkz',$index)" />
                           <span class="content_span"> {{el.info}}</span>
                       </label>
                       <input class="hidden" type="text" name="hspNrsInfCustom.nrsTtkz" ms-duplex-string="xtpghideMsg.nrsTtkz">
                   </div>
               </div>
               <div class="content_div">
                   <label class="nrstitle">备注：</label>
                   <input type="text" maxlength="120" ms-duplex-string="systemtMsg.nrsMemo" name="hspNrsInfCustom.nrsMemo" class="remarkinput" style="width:80%;">
               </div>
            </div>
        </div>
    </div>
</body>
