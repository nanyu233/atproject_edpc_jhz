<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
    <div class="panelGde">
        <div class="bradenBlock panelBlock">
            <div class="tabtop floatLeft">
              <span class="title">Braden评分</span>
              <span class="isFinish" ms-visible="aboutbraden.bradenFlg===0||aboutbraden.bradenFlg==='0'">未评分</span>
              <span class="scoSpn"  ms-visible="aboutbraden.bradenFlg!=0||aboutbraden.bradenFlg==''">{{aboutbraden.bradenSco}}分</span>  
            </div>
            <span class="edit">
                <span ms-click="toggleBox('bradenFlag','bradenMsg','aboutbraden')">
                    <img src="../images/hzszyyhems/nurse/edit.png">
                    <span>{{aboutbraden.bradenMsg}}</span>
                </span>
            </span>        
        </div>
        <div class="BradenContent panelContent" ms-visible="aboutbraden.bradenFlag===1||aboutbraden.bradenFlag==='1'">
            <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/scorePages/bradenSco.jsp"></jsp:include>
            <div class="scoreDiv">
                <span>总分：{{aboutbraden.bradenSco}}</span><br/>
                <input type="hidden" name="hspBradenInfCustom.bradenSco" ms-duplex-string="aboutbraden.bradenSco">
                <span>备注：<input type="text" name="hspBradenInfCustom.memo" class="remarkInput" ms-duplex-string="aboutbraden.memo" maxlength="120"></span>
            </div>
        </div>
    </div>
</body>
