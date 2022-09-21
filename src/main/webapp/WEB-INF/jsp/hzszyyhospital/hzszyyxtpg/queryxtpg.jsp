<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>新增系统评估</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/queryxtpg.css?aaa=5555">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/winScore.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/nrs/nrs.css?v=${versionDay}">
    <script type="text/javascript">
    var _baseUrl = "${baseurl}",
        _emgSeq = '${hspemginfCustom.emgSeq}',
        _emgBedNew = '${hspemginfCustom.bedNum}',
        _cstAgeNew = '${hspemginfCustom.cstAge}',
        _crtNameNew = '${crtName}',
        _ageUnit = '${hspemginfCustom.cstAgeCod}',
        _cstNam = '${hspemginfCustom.cstNam}';
    </script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/public.js?5" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/subpageJs/hzszyyhospital/xtpgVm.js?5" type="text/javascript"></script>
    <script src="${baseurl}js/subpageJs/hzszyyhospital/queryxtpg.avalon.js?5" type="text/javascript"></script>
    <script src="${baseurl}js/subpageJs/hzszyyhospital/xtpgfallVm.js" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/subpageJs/hzszyyhospital/xtpgfallChild.js" type="text/javascript" charset="UTF-8"></script>
    <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/nrs/slide.js?v=${versionDay}"></script>
</head>

<body class="queryxtpg" ms-controller="queryxtpg">
    <form id="userform" action="${baseurl}zyyxtpg/addxtpgsubmit.do" method="post">
        <input class="hidden" type="text" name="hspemginfCustom.emgSeq" value="${hspemginfCustom.emgSeq}">
        <div class="topPart">
            <p class="headtitle">每日系统评估</p>
            <p class="basicDiv">
                <label class="bascilab">姓名：<input class="basicInput" type="text" value="${hspemginfCustom.cstNam}" readonly unselectable='on'></label>
                <label class="bascilab">性别：<input class="basicInput" type="text" value="${hspemginfCustom.cstSexCod}" readonly unselectable='on'></label>
                <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" id="ageInput" readonly unselectable='on'></label>
                <label class="bascilab">科别：<input class="basicInput longbasicInput" type="text" value="${hspemginfCustom.emgAreCod}" readonly unselectable='on'></label>
                <label class="bascilab">病床号：<input class="basicInput" type="text" value="${hspemginfCustom.bedNum}" readonly unselectable='on'></label>
            </p>    
        </div>
        <div class="subGrade">
            <div class="tiptitle">
                <img src="../images/hzszyyhems/systemAssess/scoreicon.png">
                <span class="subtip">各项评分</span>
                <div class="floatRight">
                	<div class="floatLeft signp">
                        <span class="labWrp"> 创建日期：</span>
                        <input class="Wdate input-sdate labWrp" type="text" name="hspXtpgInfCustom.crtDat" ms-duplex-string="systemtMsg.crtDat"  onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
                    </div>
                    <div class="floatLeft signp">
                        <span class="labWrp"> 护士：</span>
                        <input type="text" maxlength="10" id="userSign" name="hspXtpgInfCustom.xtpgHs" ms-duplex-string="systemtMsg.xtpgHs" class="inputLth labWrp"  onkeyup="searchUser()">
                        <div class="userList Listpos" id="userList">
                        </div>
                    </div>
                    <div class="floatLeft">
                        <span class="labWrp"> 上级护士：</span>
                        <span class="relative">
                            <input type="text" maxlength="10" id="username" ms-duplex-string="systemtMsg.xtpgSjhs" name="hspXtpgInfCustom.xtpgSjhs"
                                onkeyup="searchUserName()" class="inputLth">
                            <div class="userList" id="userNameList"></div>
                        </span>
                    </div>
                </div>
            </div>
            <!-- <div class="display-input">
                <label>舌象：</label>
                <select ms-duplex-string="systemtMsg.xtpgSx">
                    <option value="">请选择</option>
                    <option ms-repeat="systemList.xtpgSxList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
                <input type="text" class="hidden" name="hspXtpgInfCustom.xtpgSx" ms-duplex-string="systemtMsg.xtpgSx">
            </div>
            <div class="display-input">
                <label>舌苔：</label>
                <select ms-duplex-string="systemtMsg.xtpgSt">
                    <option value="">请选择</option>
                    <option ms-repeat="systemList.xtpgStList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
                <input type="text" class="hidden" name="hspXtpgInfCustom.xtpgSt" ms-duplex-string="systemtMsg.xtpgSt">
            </div>
            <div class="display-input">
                <label>脉象：</label>
                <select ms-duplex-string="systemtMsg.xtpgMx">
                    <option value="">请选择</option>
                    <option ms-repeat="systemList.xtpgMxList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
                <input type="text" class="hidden" name="hspXtpgInfCustom.xtpgMx" ms-duplex-string="systemtMsg.xtpgMx">
            </div>
            <div class="display-input">
                <label>病脉：</label>
                <select ms-duplex-string="systemtMsg.xtpgBm">
                    <option value="">请选择</option>
                    <option ms-repeat="systemList.xtpgBmList" ms-attr-value="el.infocode">{{el.info}}</option>
                </select>
                <input type="text" class="hidden" name="hspXtpgInfCustom.xtpgBm" ms-duplex-string="systemtMsg.xtpgBm">
            </div> -->
        </div>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/BradenGde.jsp"></jsp:include> 
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/ADLGde.jsp"></jsp:include> 
        <!-- <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/FalloutbedGde.jsp"></jsp:include> -->
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/FalloutChild.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/NrsGde.jsp"></jsp:include>
        <!-- <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/NrsAssess.jsp"></jsp:include> -->
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/MorseGde.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/NeuralAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/BreathAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/XinxgAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/DigestAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/MxszAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/SkinAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/psychosocialAssess.jsp"></jsp:include>
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyxtpg/DuctAssess.jsp"></jsp:include>
        <div class="subGrade">
            <p class="tiptitle">
                <span>安全措施</span>
                <img src="../images/hzszyyhems/systemAssess/assessicon.png">
            </p>
            <p class="display-p">
              <label>安全措施：</label>
              <label ms-repeat="systemList.xtpgAqcsCodList" ms-attr-for="xtpgAqcsCod{{el.infocode}}" class="largeRight">
                  <input ms-attr-id="xtpgAqcsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('xtpgAqcsCod',$index)" />
                  <span> {{el.info}}</span>
              </label>
              <input class="hidden" type="text" name="hspXtpgInfCustom.xtpgAqcsCod" ms-duplex-string="xtpghideMsg.xtpgAqcsCod">
            </p>
        </div>
        <textarea class="bigDataDiv" id="bigDataDiv" name="hspXtpgInfCustom.xtpgJlhz" ms-duplex-string="systemtMsg.xtpgJlhz"/>
        </textarea>
        <div class="buttonGrp">
            <a class="easyui-linkbutton" iconcls="icon-ok" id="save" onclick="postSystemMsg('a')">保存</a>
            <!-- <a class="easyui-linkbutton" iconcls="icon-ok" id="save" onclick="postSystemMsg('b')">保存并生成护理记录单</a> -->
            <!-- <a class="easyui-linkbutton" iconcls="icon-ok" onclick="connectFieldbig()">生成汇总记录</a> -->
        </div>
    </form>
    <script type="text/javascript" charset="utf-8">
        function searchUser() {
          if (event.keyCode == 13) {
              publicFun.SearchList("userSign","userList")
          }
        }

        function searchUserName() {
          if (event.keyCode == 13) {
              publicFun.SearchList("username","userNameList")
          }
        }
        $("body").click(function() {
            $("#userList").hide();
            $("#userNameList").hide();
        });

    </script>
</body>
