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
                <span class="title">ADL评分</span>
                <span class="isFinish" ms-visible="aboutAdl.aldFlg===0||aboutAdl.aldFlg==='0'">未评分</span>
                <span class="scoSpn" ms-visible="aboutAdl.aldFlg!=0||aboutAdl.aldFlg==''">{{aboutAdl.adlSco}}分</span>
            </div>
            <span ms-click="toggleBox('adlFlag','adlMsg','aboutAdl')" class="edit">
        <img src="../images/hzszyyhems/nurse/edit.png">
        <span>{{aboutAdl.adlMsg}}</span>
            </span>
        </div>
        <div class="AdlContent panelContent" ms-visible="aboutAdl.adlFlag===1||aboutAdl.adlFlag==='1'">
            <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/scorePages/adlSco.jsp"></jsp:include>
            <div class="scoreDiv">
                <span>总分：{{aboutAdl.adlSco}}</span>
                <br/>
                <input type="hidden" name="hspAdlInfCustom.adlSco" ms-duplex-string="aboutAdl.adlSco">
                <span>备注：<input type="text" name="hspAdlInfCustom.adlMemo" class="remarkInput" ms-duplex-string="aboutAdl.adlMemo" maxlength="120"></span>
            </div>
        </div>
    </div>
</body>