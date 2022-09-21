<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>Tash创伤指数评分</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery1.css?aaa=5555">
    <script>
        var _baseUrl;
        _baseUrl = "${baseurl}";
        var tiSeq = parent.$('#tiSeq').val();
        var emgSeq = parent._emgSeq
    </script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script src="${baseurl}js/subpageJs/hzszyyhospital/score/tashVm.js" type="text/javascript" charset="UTF-8"></script>
    <style type="text/css">
        .nursingSco .scoreQuery .boldFont1 {
            font-weight: bold;
            bottom: 15px;
            font-size: 16px;
        }
    </style>
</head>
<body class="nursingSco">
<div ms-controller="TashGde" class="scoreQuery">
    <p class="headtitle">Tash创伤指数评分</p>
    <form id="TashForm" action="${baseurl}scorequery/addTashScore.do" method="post">
        <input class="hidden" type="text" ms-duplex-string="hspTashInfCustom.emgSeq" name="hspTashInfCustom.emgSeq" id="emgSeq">
        <input class="hidden" type="text" ms-duplex-string="hspTashInfCustom.tiSeq" name="hspTashInfCustom.tashSeq" id="tiSeq">
        <div class="panelGde">
            <div class="BradenContent panelContent">
                <table class="paneltab">
                    <tr class="oddtr">
                        <th>血红蛋白水平(mg/dL)</th>
                        <td ms-repeat="systemList.tiParCodList">
                            <label ms-attr-for=" tiParCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan" style="width: 80%">
                            <input ms-attr-id=" tiParCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiParCod',$index,'aboutTi')">
                            {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.xhdbCod" ms-duplex-string="aboutTi.tiParCod">
                    </tr>

                    <tr class="eventr">
                        <th>碱剩余(mmol/L)</th>
                        <td ms-repeat="systemList.tiTrmCodList">
                            <label ms-attr-for="tiTrmCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan" style="width: 80%">
                            <input ms-attr-id="tiTrmCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiTrmCod',$index,'aboutTi') ;" >
                               {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.jsyCod" ms-duplex-string="aboutTi.tiTrmCod">
                    </tr>
                    <tr class="eventr">
                        <th>收缩压(mmHg)</th>
                        <td ms-repeat="systemList.tiPulCodList">
                            <label ms-attr-for="tiPulCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan" style="width: 80%">
                            <input ms-attr-id="tiPulCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiPulCod',$index,'aboutTi')" ms-if="el.dictsort != null">
                             {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.ssyCod" ms-duplex-string="aboutTi.tiPulCod">
                    </tr>

                    <tr class="oddtr">
                        <th>心率（次/分）</th>
                        <td ms-repeat="systemList.tiCscCodList">
                            <label ms-attr-for="tiCscCod{{el.infocode}}" class="labtab">
                           <span class="inputSpan">
                             <input ms-attr-id="tiCscCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                    ms-click="Objradioclick('tiCscCod',$index,'aboutTi')">
                             {{el.info}}
                           </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.xlCod" ms-duplex-string="aboutTi.tiCscCod">
                    </tr>
                    <tr class="eventr">
                        <th>腹腔游离液(创伤重点评估超声检查)</th>
                        <td ms-repeat="systemList.tiBreCodList">
                            <label ms-attr-for="tiBreCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan">
                              <input ms-attr-id="tiBreCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                     ms-click=" Objradioclick('tiBreCod',$index,'aboutTi')">
                             {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.isFqyly" ms-duplex-string="aboutTi.tiBreCod">
                    </tr>
                    <tr class="oddtr">
                        <th>临床不稳定的骨盆骨折</th>
                        <td ms-repeat="systemList.tiWcxCodList">
                            <label ms-attr-for="tiWcxCod{{el.infocode}}" class="labtab">
                           <span class="inputSpan">
                            <input ms-attr-id="tiWcxCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiWcxCod',$index,'aboutTi')">
                           {{el.info}}
                            </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.isGpgz" ms-duplex-string="aboutTi.tiWcxCod">
                    </tr>
                    <tr class="eventr">
                        <th>临床股骨骨折开放/脱位</th>
                        <td ms-repeat="systemList.tiWaxCodList">
                            <label ms-attr-for="tiWaxCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan">
                              <input ms-attr-id="tiWaxCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                     ms-click=" Objradioclick('tiWaxCod',$index,'aboutTi')">
                             {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.isGggz" ms-duplex-string="aboutTi.tiWaxCod">
                    </tr>
                    <tr class="oddtr">
                        <th>性别</th>
                        <td ms-repeat="systemList.tiSexCodList">
                            <label ms-attr-for="tiSexCod{{el.infocode}}" class="labtab">
                           <span class="inputSpan">
                            <input ms-attr-id="tiSexCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiSexCod',$index,'aboutTi')">
                           {{el.info}}
                            </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTashInfCustom.isSex" ms-duplex-string="aboutTi.tiSexCod">
                    </tr>
                </table>
                <div class="scoreDiv">
                    <span  class="boldFont">总分：{{aboutTi.tiSco}}</span><br/>
                    <input type="hidden" name="hspTashInfCustom.tashSco" ms-duplex-string="aboutTi.tiSco">
                    <span  class="boldFont1">需要输血概率：{{aboutTi.tashPr}}</span><br/>
                    <input type="hidden" name="hspTashInfCustom.tashPr" ms-duplex-string="aboutTi.tashPr">
                    <div class="common_btnGrp">
                        <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存并导入</a>
                        <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                    </div>
                </div>
            </div>
        </div>
    </form>
</div>
</body>
<script type="text/javascript">

    function saveAndImport() {
        if (vm.aboutTi.tiSco == '' || vm.aboutTi.tiSco == null) {
            publicFun.alert("请输入Tash评分");
            return false
        }
        jquerySubByFId('TashForm', insert_callback, {date: new Date().toTimeString()}, "json");
    }

    //保存回调
    function insert_callback(data) {
        parent.sub.getTashSco()
        parent.closemodalwindow()
    }

    $(function () {
        $('#emgSeq').val(emgSeq);
        $('#tiSeq').val(emgSeq);

    })

</script>
</html>
