<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>TI创伤指数评分</title>
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
    <script src="${baseurl}js/subpageJs/hzszyyhospital/score/tiVm.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="nursingSco">
<div ms-controller="TiGde" class="scoreQuery">
    <p class="headtitle">TI创伤指数评分</p>
    <form id="TiForm" action="${baseurl}scorequery/addTiScore.do" method="post">
        <input class="hidden" type="text" ms-duplex-string="hspTiCustom.emgSeq" name="hspTiInfCustom.emgSeq" id="emgSeq">
        <input class="hidden" type="text" ms-duplex-string="hspTiCustom.tiSeq" name="hspTiInfCustom.tiSeq" id="tiSeq">
        <div class="panelGde">
            <div class="BradenContent panelContent">
                <table class="paneltab">
                    <tr class="oddtr">
                        <th>计分</th>
                        <td align="center">0</td>
                        <td align="center">1</td>
                        <td align="center">3</td>
                        <td align="center">4</td>
                        <td align="center">6</td>
                    </tr>
                    <tr class="oddtr">
                        <th>损伤部位</th>
                        <td ms-repeat="systemList.tiPartCodList">
                            <label ms-attr-for=" tiPartCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan" style="width: 80%">
                            <input ms-attr-id=" tiPartCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiPartCod',$index,'aboutTi')">
                            {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTiInfCustom.tiPartCod" ms-duplex-string="aboutTi.tiPartCod">
                    </tr>

                    <tr class="eventr">
                        <th>损伤类型</th>
                        <td ms-repeat="systemList.tiTrmCodList">
                            <label ms-attr-for="tiTrmCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan" style="width: 80%">
                            <input ms-attr-id="tiTrmCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiTrmCod',$index,'aboutTi') ;" >
                               {{el.info}}
                          </span>
                            </label>
                        </td>
<%--                        <td style="width:120px" ms-visible="aboutTi.tiTrmCod === '0'">--%>
<%--                            <input style="width:110px;margin:0" type="text" name="hspTiInfCustom.tiTrmOther" ms-duplex-string="aboutTi.tiTrmOther">--%>
<%--                        </td>--%>
                        <input class="hidden" type="text" name="hspTiInfCustom.tiTrmCod" ms-duplex-string="aboutTi.tiTrmCod">

                    </tr>

<%--                    <tr class="oddtr">--%>
<%--                        <th>循环情况</th>--%>
<%--                        <td ms-repeat="systemList.tiPulCodList">--%>
<%--                            <label ms-attr-for="tiSbuCod{{el.infocode}}" class="labtab">--%>
<%--                          <span class="inputSpan">--%>
<%--                             <input ms-attr-id="tiSbuCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"--%>
<%--                                    ms-click="Objradioclick('tiSbuCod',$index,'aboutTi')" ms-if="el.dictsort != null">--%>
<%--                               {{el.info}}--%>
<%--                          </span>--%>
<%--                            </label>--%>
<%--                        </td>--%>
<%--                        <input class="hidden" type="text" name="hspTiInfCustom.tiSbuCod" ms-duplex-string="aboutTi.tiSbuCod">--%>
<%--                    </tr>--%>

                    <tr class="eventr">
                        <th>循环情况</th>
                        <td ms-repeat="systemList.tiPulCodList">
                            <label ms-attr-for="tiPulCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan" style="width: 80%">
                            <input ms-attr-id="tiPulCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiPulCod',$index,'aboutTi')" ms-if="el.dictsort != null">
                             {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTiInfCustom.tiPulCod" ms-duplex-string="aboutTi.tiPulCod">
                    </tr>

                    <tr class="oddtr">
                        <th>意识/中枢情况</th>
                        <td ms-repeat="systemList.tiCscCodList">
                             <label ms-attr-for="tiCscCod{{el.infocode}}" class="labtab">
                           <span class="inputSpan">
                             <input ms-attr-id="tiCscCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                    ms-click="Objradioclick('tiCscCod',$index,'aboutTi')">
                             {{el.info}}
                           </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTiInfCustom.tiCscCod" ms-duplex-string="aboutTi.tiCscCod">
                    </tr>
                    <tr class="eventr">
                        <th>呼吸情况</th>
                        <td ms-repeat="systemList.tiBreCodList">
                            <label ms-attr-for="tiBreCod{{el.infocode}}" class="labtab">
                          <span class="inputSpan">
                              <input ms-attr-id="tiBreCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                     ms-click=" Objradioclick('tiBreCod',$index,'aboutTi')">
                             {{el.info}}
                          </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTiInfCustom.tiBreCod" ms-duplex-string="aboutTi.tiBreCod">
                    </tr>
                    <tr class="oddtr">
                        <th>体表出血</th>
                        <td ms-repeat="systemList.tiWcxCodList">
                            <label ms-attr-for="tiWcxCod{{el.infocode}}" class="labtab">
                           <span class="inputSpan">
                            <input ms-attr-id="tiWcxCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked"
                                   ms-click="Objradioclick('tiWcxCod',$index,'aboutTi')">
                           {{el.info}}
                            </span>
                            </label>
                        </td>
                        <input class="hidden" type="text" name="hspTiInfCustom.tiWcxCod" ms-duplex-string="aboutTi.tiWcxCod">
                    </tr>
                </table>
                <div class="scoreDiv">
                    <span  class="boldFont">分值：{{aboutTi.tiSco}}</span><br/>
                    <input type="hidden" name="hspTiInfCustom.tiSco" ms-duplex-string="aboutTi.tiSco">
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
            publicFun.alert("请输入TI评分");
            return false
        }
        jquerySubByFId('TiForm', insert_callback, {date: new Date().toTimeString()}, "json");
    }

    //保存回调
    function insert_callback(data) {
        parent.sub.getTiSco()
        parent.closemodalwindow()
    }

    $(function () {
        $('#emgSeq').val(emgSeq);
        $('#tiSeq').val(emgSeq);

    })

</script>
</html>
