<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>整体维护</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css?1">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script src="${baseurl}lib/avalon2.3.1/dist/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
</head>
<style>
    #editBoxContainer form {
        padding: 5px 0;
        box-sizing: border-box;
    }

    #editBoxContainer form a {
        margin-left: 5px;
    }

    #timeLabel {
        padding-left: 10px;
    }

    #vsDateStr {
        width: 130px;
    }

    .labelTitle {
        display: inline-block;
        /* color: #666; */
        font-size: 13px;
        font-weight: bold;
        height: 22px;
        line-height: 24px;
        vertical-align: middle;
    }

    .checkTitle {
        color: #666;
    }

    #editBox {
        overflow-y: auto;
    }

    .valueUp,
    .valueDown {
        position: relative;

    }

    .valueUp::after {
        content: "↑";
        color: #dc3545;
        position: absolute;
        /* right: 10px; */
        left: 180px;
        /* left: 60%; */
        top: 4px;
    }

    .valueDown::after {
        content: "↓";
        color: #28a745;
        position: absolute;
        /* right: 10px; */
        left: 180px;
        /* left: 60%; */
        top: 4px;
    }

    #editBox div.divPart {
        margin: 10px;
    }

    #editBox div.divPart h3 {
        font-size: 14px;
        position: relative;
    }

    /* #editBox div.divPart .dataControlBtnGroup {
        position: absolute;
        right: 10px;
        top: 5px;
    } */

    #editBox div.divPart .dataControlBtn {
        /* margin-left: 10px; */
        /* cursor: pointer;
        color: blue; */
    }

    /* #editBox div.divPart .dataControlBtn:hover {
        text-decoration: underline;
    } */

    #editBox div.divPart .inputContainer,
    #editBox div.divPart .inputUsrContainer,
    #editBox div.divPart .selContainer {
        position: relative;
        margin: 5px 0 5px 10px;
        display: inline-block;
        width: 23%;
        vertical-align: middle;
        height: 30px;
    }

    #editBox div.divPart .textareaContainer {
        position: relative;
        margin: 5px 0 5px 10px;
        display: inline-block;
        width: 98%;
        vertical-align: middle;
        height: auto;
    }

    #editBox div.divPart .textareaContainer .labelText {
        display: inline-block;
        /* width: 20%; */
        width: 130px;
        box-sizing: border-box;
        padding-right: 5px;
        text-align: right;
    }

    #editBox div.divPart .inputContainer .labelText,
    #editBox div.divPart .inputUsrContainer .labelText,
    #editBox div.divPart .selContainer .labelText {
        display: inline-block;
        width: 130px;
        box-sizing: border-box;
        padding-right: 5px;
        text-align: right;
    }

    #editBox div.divPart .checkContainer {
        margin: 5px 0 5px 10px;
        /* padding: 8px; */
        padding-left: 5px;
        padding-bottom: 2px;
        display: inline-block;
        box-sizing: border-box;
        width: 190px;
        border: 1px solid #333;
        border-radius: 6px;
    }

    #editBox div.divPart .checkContainer label.check-label {
        padding: 0 3px;
        cursor: pointer;
    }

    /* 新增护理项删除按钮 */
    #editBox div.divPart .checkContainer.addCheckContainer {
        position: relative;
    }

    #editBox div.divPart .checkContainer .belowDelBtn {
        position: absolute;
        right: 0px;
        top: 0;
    }

    #editBox div.divPart .textareaContainer .textarea-label {
        position: relative;
    }

    #editBox div.divPart .textareaContainer .textarea-label .taHint {
        position: absolute;
        /*与textarea高度相仿*/
        left: 0;
        top: 20px;
        display: inline-block;
        width: 100%;
        text-align: center;
        color: red;
    }

    #editBox div.divPart .textareaContainer textarea {
        margin-right: 5px;
        /* width: 78%; */
        /* width: 1055px; */
        height: 100px;
        resize: none;
        vertical-align: top;
    }

    #editBox div.divPart .inputUsrContainer input[type="text"],
    #editBox div.divPart .inputContainer input[type="text"] {
        box-sizing: border-box;
        vertical-align: middle;
        margin-right: 5px;
        /* width: 60px; */
        width: 25%;
        height: 24px;
    }

    #editBox div.divPart .inputContainer input[type="text"].input2 {
        width: 11%;
        margin-right: 1px;
    }

    #editBox div.divPart .inputUsrContainer .signImgBox {
        display: none;
        height: 24px;
        overflow-y: hidden;
        vertical-align: middle;
    }

    #editBox div.divPart .inputUsrContainer .signImgBox>* {
        vertical-align: middle;
        height: 24px;
        line-height: 24px;
    }

    #editBox div.divPart .inputUsrContainer .signPic {
        margin-right: 5px;
        box-sizing: border-box;
        height: 24px;
    }

    #editBox div.divPart .selContainer select {
        height: 25px;
        margin-right: 5px;
        /* width: 60px; */
        width: 50%;
    }

    #editBox div.divPart .inputContainer span.unit,
    #editBox div.divPart .inputUsrContainer span.userInputHint {
        font-size: 10px;
        color: #666;
        vertical-align: middle;
    }

    /*自定义护理项目样式*/
    .custDCitemOuter {
        display: none;
        margin: 5px 0;
        padding-bottom: 5px;
        border-bottom: 1px solid #333;
    }

    #editBox div.divPart .custDCitemOuter .checkContainer {
        position: relative;
        height: 40px;
        /* line-height: 30px; */
        border: 1px dashed #666;
    }

    #editBox div.divPart .checkContainer.addCheckContainer {
        border: 1px dashed #666;
    }

    #editBox div.divPart .custDCitemOuter .checkContainer .delNewItem {
        position: absolute;
        right: 0px;
        bottom: 0;
        z-index: 10;
        /* position: absolute;
        right: 2px;
        top: 2px; */
    }

    .custDCitemOuter .checkContainer>label {
        display: flex;
        align-items: center;
        padding: 8px 0;
        height: 24px;
        vertical-align: middle;
    }

    .custDCitemOuter .checkContainer .custom-text-span,
    .custDCitemOuter .checkContainer input {
        width: 63px;
        height: 24px;
        overflow: hidden;
        box-sizing: border-box;
        line-height: 24px;
    }

    .custDCitemOuter .checkContainer input {
        display: none;
    }

    .custDCitemOuter .checkContainer .custom-text-span {
        display: flex;
        align-items: center;
        width: 80px;
    }

    .custDCitemOuter .checkContainer:hover {
        color: black !important;
        border: 1px solid black !important;
    }

    .custDCitemOuter .addItemBtn {
        position: absolute;
        right: 0px;
        top: 0;
    }

    #addNewDCitem:hover .commonbtn {
        box-shadow: 5px 5px 5px rgb(200, 237, 254);
    }

    #addNewDCitemBox {
        margin-bottom: 5px;
        padding-left: 10px;
    }

    /* #addNewDCitemBox .commonbtn {
        margin-bottom: 5px;
        margin-left: 10px;
        width: 107px;
    } */

    .btnContainer>input[type='button'] {
        margin-right: 5px;
    }

    #fast-info {
        margin-right: 28px;
        position: absolute;
        top: 0;
        right: 0;
        padding: 1px 5px;
        display: inline-block;
        width: 155px;
        height: 100px;
        box-sizing: border-box;
        border-left: 1px solid #ccc;
        overflow-x: hidden;
        overflow-y: auto;
    }

    #fast-info .fast-item {
        display: inline-block;
        margin: 6px 3px;
        padding: 1px 5px;
        border-radius: 4px;
        border: 1px solid rgba(0, 0, 0, 0.23);
        color: rgba(0, 0, 0, 0.87);
        transition: all 0.3s linear;
        cursor: pointer;
    }

    #fast-info .fast-item:hover {
        background-color: rgba(0, 0, 0, 0.08);
    }

    #editBox div.divPart .textareaContainer textarea.NC_MEMO {
        padding-right: 155px;
        box-sizing: border-box;
    }

    @media (max-width: 1200px) {
        #editBox div.divPart .checkContainer {
            width: 165px;
        }

        #editBox div.divPart .textareaContainer textarea {
            width: 910px;
        }

        #editBox div.divPart .selContainer select {
            width: 46%;
        }

        #editBox div.divPart .inputUsrContainer span.userInputHint {
            position: absolute;
            top: 3px;
            left: 200px;
            display: inline-block;
            width: 80px;
        }
    }

    @media (max-width: 1000px) {

        /*弹出框样式*/
        #editBox div.divPart .inputContainer .labelText,
        #editBox div.divPart .inputUsrContainer .labelText,
        #editBox div.divPart .selContainer .labelText {
            width: 95px;
            overflow: hidden;
        }

        #editBox div.divPart .inputUsrContainer input[type="text"],
        #editBox div.divPart .inputContainer input[type="text"] {
            width: 28%;
            margin-right: 0;
        }

        #editBox div.divPart .inputContainer input[type="text"].input2 {
            width: 14%;
            margin-right: 1px;
        }

        #editBox div.divPart .selContainer select {
            width: 40%;
        }

        #editBox div.divPart .checkContainer {
            width: 157px;
        }

        #editBox div.divPart .textareaContainer textarea {
            width: 691px;
        }
    }
</style>

<body>
    <div id="editBoxContainer">
        <form class="border-b-normal">
            <label for="vsDateStr" id="timeLabel">时间点：</label>
            <input id="vsDateStr" class="input-date Wdate" type="text"
                onclick="WdatePicker({dateFmt: 'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m', onpicked:function(){getAllList()}})">
            <!-- <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-search" onclick="getAllList()">查询</a>
            <span class="hint">变更时间点后，请点击查询按钮</span> -->
        </form>
        <div id="editBox" class="signBorderBox searchInputBorderBox">
            <!-- <div class="VSDiv">
            <h3>生命体征信息<span class="curDate"></span></h3>
            <div class="checkOuter"></div>
            <div class="inputOuter">
                <div class="inputContainer">
                    <label>
                        inputName:
                        <input type="text" name="xxx" class="classsxxxx">
                    </label>
                    <span class="unit"></span>
                </div>
                <div class="selContainer">
                    <label>
                        seleName:
                        <select name="xxx" class="classxxx">
                            <option value=""></option>
                        </select>
                    </label>
                </div>
                <div class="textareaContainer">
                    <label>
                        inputName:
                        <input type="text" name="xxx" class="classsxxxx">
                    </label>
                </div>
                div class="inputUsrContainer">
                    <label>
                        inputName:
                        <input type="text" name="xxx" class="classsxxxx">
                    </label>
                    <span class="unit"></span>
                </div>
            </div>
        </div> -->
        </div>
        <!-- <div id="doctSearchBox"><p>SSSS</p></div> -->
        <div id="saveBar">
            <div class="btnContainer" style="position: relative;display:inline-block;">
                <input type="button" class="commonbtn" value="保存" onclick="saveAll()">
                <input type="button" class="commonbtn" value="保存并关闭" onclick="saveAll('close')">
                <input type="button" class="commonbtn" value="关闭" onclick="closeAll()">
                <!-- <span class="hint savehint">修改相关信息后，请点击保存按钮！</span> -->
            </div>
        </div>
    </div>
    <script type="text/javascript">
        var _baseUrl = '${baseurl}'
    </script>
    <script type="text/javascript">
        /**
         *全局变量
         */
        var parentExChgInfo = parent.icuOpenModal && icuOpenModal.getExChgInfo(); // 父元素传递信息
        var ptBasicInfo = eicuUtil.ptBasicInfo;
        var _liveNo = ptBasicInfo.liveNo || '${liveNo}';
        var _vsDateStr = "${vsDateStr}";
        var _paramVsType = [];
        var _devDaInfo;
        var mpFlag = '0'; // 是否执行进度维护
        // var _linkSeq = "";
        var linkSeqMap = {}; //各类linkSeq映射
        var _planTimeStr = "";
        var $editBox = $("#editBox");
        var queryDateStr;
        var ncMemoStrIdx; //模板病情失焦时索引
        var tzLimitObj = {};
        var tzLimitArray = []; //获取体征上下限及其列表
        var custDcItemDict = {
            keyList: [] //保证字典模板渲染顺序与后台所给字典顺序一致
        }; //自定义护理项字典
        var hisMap = {}; //本地字典表数据
        var initCodeArr = [{
            "typeCode": "VS",
            "listKey": "VS", //getAllList请求数组名称
            "titleName": "生命体征信息"
        }, {
            "typeCode": "RM",
            "listKey": "RM",
            "titleName": "呼吸机信息"
        }, {
            "typeCode": "DC",
            "listKey": "DC",
            "titleName": "日常护理信息"
        }, {
            "typeCode": "BG",
            "listKey": "BG",
            "titleName": "血气信息"
        }, {
            "typeCode": "NC",
            "listKey": "NC",
            "titleName": "病情信息"
        }, {
            "typeCode": "IP",
            "listKey": "IP",
            "titleName": "输液泵信息"
        }, {
            "typeCode": "SP",
            "listKey": "SP",
            "titleName": "注射泵信息"
        }]; //编码数据组(动态配置)
        var codeArr = initCodeArr; //根据父元素决定codeArr
        if (parentExChgInfo && parentExChgInfo.modalFlag === '1') {
            _vsDateStr = parentExChgInfo.vsDateStr;
            _paramVsType = parentExChgInfo.vsType;
            // 如果有devDaInfo的话存储
            _devDaInfo = parentExChgInfo.devDaInfo;
            if (parentExChgInfo.devModl) {
                // 有微泵型号，则是执行进度相关
                mpFlag = '1';
            }
            codeArr = []; //置空编码表
            initCodeArr.forEach(function (codeEl) {
                if (_paramVsType.indexOf(codeEl.typeCode) !== -1) {
                    codeArr.push(codeEl);
                }
            })
        } else if (parent.$clickedRow) {
            _vsDateStr = parent.$clickedRow.data("vsDateStr");
            _paramVsType = parent.$clickedRow.data("vsType");
            codeArr = []; //置空编码表
            initCodeArr.forEach(function (codeEl) {
                if (_paramVsType.indexOf(codeEl.typeCode) !== -1) {
                    codeArr.push(codeEl);
                }
            })
        } else {
            codeArr = codeArr.filter(function (codeInfo) {
                return codeInfo.typeCode !== 'IP' && codeInfo.typeCode !== 'SP';
            })
        }
        var codeDivObj = {}; //储存编码选择数组VS:{total:ele,checkDiv:ele,inputDiv:ele,selDiv:ele}
        var lastRadioObj = {}; //上次修改的radioBox VS:[{$radioArr}
        function reload() {
            // return;
        }

        /**
         *根据时间点查询dcInfo
         */
        function getAllInfo() {
            queryDateStr = $("#vsDateStr").val();
            $(".curDate").text("(" + queryDateStr + ")");
            var reqParams = {
                "liveNo": _liveNo,
                "paramDate": queryDateStr
            };
            if (_paramVsType.length !== 0) {
                reqParams.typeCode = _paramVsType;
            }
            if (reqParams.typeCode && (reqParams.typeCode.indexOf('IP') !== -1 || reqParams.typeCode.indexOf('SP') !== -
                    1)) {
                // IP或者SP增加参数
                reqParams.linkSeq = _devDaInfo.devSeq + '_' + _devDaInfo.devCom;
            }
            publicFun.httpRequest("${baseurl}icuVitlIo/queryListByTime.do", reqParams, {
                requestType: "json"
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error("请求出错，请联系管理员");
                    return;
                }
                for (var k in codeDivObj) {
                    if (codeDivObj.hasOwnProperty(k)) {
                        var thisDiv = codeDivObj[k];
                        //-----修改父元素外边框颜色事件-----
                        thisDiv["total"]
                            .off("click")
                            .on("click", "input[type='radio']", function () {
                                var thisVal = $(this).val();
                                checkColorBind($(this), thisVal);
                            })
                        //-----体征数据和血气绑定上下限监听-----
                        if (k === "VS" || k === "BG") {
                            thisDiv["inputDiv"]
                                .off("input")
                                .on("input", "input[type='text']", function () {
                                    var code = $(this).attr("name");
                                    var value = $(this).val();
                                    limitCal($(this), code, value);
                                })
                        }
                        //-----呼吸机频率、每分钟通气量单独绑定监听
                        if (k === 'RM') {
                            thisDiv["inputDiv"]
                                .off("input")
                                .on("input",
                                    "input[type='text'].RM_RATE, input[type='text'].RM_TVE,input[type='text'].RM_MVE",
                                    function () {
                                        var code = $(this).attr("name");
                                        var value = $(this).val();
                                        limitCal($(this), code, value);
                                        if (!$(this).hasClass('RM_MVE')) {
                                            calMve();

                                        }
                                    })
                            // thisDiv["inputDiv"]
                            //     .off("input")
                            //     .on("input", "input[type='text'].RM_MVE", function () {
                            //         var code = $(this).attr("name");
                            //         var value = $(this).val();
                            //         limitCal($(this), code, value);
                            //     })
                        }
                        if (k === 'IP') {
                            // 输液泵根据速率和输液量实时计算剩余时间
                            thisDiv["inputDiv"].find('input.IP_RATE')
                                .off('blur')
                                .on('blur', function () {
                                    // 监听输液量
                                    var remainDose = $('input.IP_VTBI').val();
                                    var rateVal = $(this).val();
                                    rateVal = parseFloat(rateVal) || '';
                                    $(this).val(rateVal);
                                    rateVal = rateVal / 60; // 分钟数速率
                                    if (rateVal && remainDose) {
                                        calRemainTime(remainDose, rateVal);
                                    }
                                })
                            thisDiv["inputDiv"].find('input.IP_VTBI')
                                .off('blur')
                                .on('blur', function () {
                                    // 监听输液量
                                    var rateVal = $('input.IP_RATE').val();
                                    rateVal = rateVal / 60; // 分钟数速率
                                    var remainDose = $(this).val();
                                    remainDose = parseFloat(remainDose) || '';
                                    $(this).val(remainDose);
                                    if (rateVal && remainDose) {
                                        calRemainTime(remainDose, rateVal);
                                    }
                                })

                        }
                        //-----清空单选项-----
                        if (lastRadioObj[k] && lastRadioObj[k][0]) {
                            lastRadioObj[k].forEach(function ($ele) {
                                $ele.eq(0).parents(".checkContainer").css("border-color", "#666");
                                $ele.data("vsSeq", "")
                                    .prop("checked", false)
                                    .each(function () {
                                        var thisVal = $(this).val();
                                        if (thisVal === "9") {
                                            $(this).prop("checked", true);
                                        }
                                    });
                            })
                        }
                        lastRadioObj[k] = [];
                        var infoKey; //根据当前k值，确定取哪一条数据(动态配置)
                        switch (k) {
                            case "DC":
                                infoKey = "DC";
                                break;
                            case "VS":
                                infoKey = "VS";
                                break;
                            case "RM":
                                infoKey = "RM";
                                break;
                            case "BG":
                                infoKey = "BG";
                                break;
                            case "NC":
                                infoKey = "NC";
                                break;
                            case "IP":
                                infoKey = "IP";
                                break;
                            case "SP":
                                infoKey = "SP";
                                break;
                        }
                        var list = res.resultInfo.sysdata[infoKey];
                        var linkSeq;
                        //-----赋值-----
                        if (list) {
                            // 有对应数据
                            list.forEach(function (ele, idx, arr) {
                                //储存对应的linkSeq
                                linkSeq = ele.linkSeq;
                                if (linkSeq !== null) {
                                    if (ele.vsSeq) {
                                        linkSeqMap[ele.vsSeq] = linkSeq
                                    } else {
                                        linkSeqMap[ele.vsCode] = linkSeq
                                    }
                                }
                                //如果有特殊rsltMode，则此处也需修改
                                if (ele.rsltMode === "input_user") {
                                    var $thisInput = thisDiv["inputUsrDiv"].find("." + ele.vsCode);
                                    $thisInput.val(ele.vsRsltStr).data("vsSeq", ele.vsSeq);
                                    //如果是input_usr，绑定userid
                                    $thisInput.data("userid", ele.vsRslt);
                                    var thisText = ele.vsRsltStr;
                                    var thisId = ele.vsRslt;
                                    var signImg = ele.signimg;
                                    var pInfo = {
                                        text: thisText,
                                        id: thisId,
                                        signImg: signImg
                                    }
                                    eicuUtil.signElClick($thisInput, pInfo);
                                } else if (ele.rsltMode === "textarea") {
                                    //如果是textarea类型的
                                    var $thisInput = thisDiv["textareaDiv"].find("." + ele.vsCode);
                                    $thisInput.val(ele.vsRsltStr).data("vsSeq", ele.vsSeq);
                                } else if (ele.rsltMode === "checkbox") {
                                    //如果是checkbox类型的
                                    var $radioList = thisDiv["checkDiv"].find("input[type=radio]." + ele
                                        .vsCode);
                                    if ($radioList.length === 0) {
                                        //如果没有找到对应项，可能为自定义护理项
                                        //储存相关数据
                                        custDcItemDict[ele.vsCode]["vsRslt"] = ele.vsRslt;
                                        custDcItemDict[ele.vsCode]["vsSeq"] = ele.vsSeq;
                                        chooseDCitem(ele.vsCode); //选择对应的自定义护理项加入列表
                                        $(".custDCitemOuter").find(ele.vsCode); //如果是已修改元素，对元素内绑定vsSeq
                                        $radioList = thisDiv["checkDiv"].find("." + ele.vsCode);
                                    }
                                    lastRadioObj[k].push($radioList);
                                    //修改父元素外边框颜色
                                    checkColorBind($radioList.eq(0), ele.vsRslt)
                                    $radioList
                                        .data("vsSeq", ele.vsSeq)
                                        .prop("checked", false)
                                        .each(function (radioIdx) {
                                            var thisVal = $(this).val();
                                            if (thisVal === ele.vsRslt) {
                                                $(this).prop("checked", true);
                                            }
                                        });
                                } else if (ele.rsltMode === "select") {
                                    // 如果是select类型的
                                    thisDiv["selDiv"].find("." + ele.vsCode).val(ele.vsRslt).data(
                                        "vsSeq", ele.vsSeq);
                                } else if (ele.rsltMode === 'input2') {
                                    // 小时分钟分别赋值
                                    var $thisInputList = thisDiv["inputDiv"].find("." + ele.vsCode);
                                    var vsRsltArr = ele.vsRslt.split('|');
                                    $thisInputList.each(function (idx) {
                                        $(this).val(vsRsltArr[idx] || '').data('vsSeq', ele
                                            .vsSeq);
                                    })
                                } else {
                                    //if (ele.rsltMode === "input" || ele.rsltMode === "search") 
                                    var $thisInput = thisDiv["inputDiv"].find("." + ele.vsCode);
                                    $thisInput.val(ele.vsRsltStr).data("vsSeq", ele.vsSeq);
                                    //计算是否需要根据上下限
                                    if (k === "VS" || k === "BG" || k === 'RM') {
                                        limitCal($thisInput, ele.vsCode, ele.vsRslt);
                                    }
                                }
                            });
                        }
                    }
                }
            })
        }

        /**
         *获取vsCodeList，dcCodeList
         */
        function getAllList() {
            //如果没有vsType，则不传递相关参数
            var requestParam = {};
            if (_paramVsType.length !== 0) {
                requestParam["typeCode"] = _paramVsType;
            }
            publicFun.httpRequest("${baseurl}icuVitlIo/getVsDefCode.do", requestParam, {
                requestType: "json"
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error("请求出错，请联系管理员");
                    return;
                }
                //字典表数据
                hisMap = res.resultInfo.sysdata || {};
                var charList = hisMap['charList']; //病情模板可选项
                var unitList = hisMap['unitList'];
                var codeListArr = []; //编码列表数据
                codeArr.forEach(function (typeEl) {
                    var codeList = res.resultInfo.sysdata[typeEl.listKey];
                    if (codeList) {
                        codeListArr.push(codeList);
                    }
                })
                if (codeListArr.length !== codeArr.length) {
                    alert_error("数据出错，请联系管理员");
                    return;
                }
                custDcItemDict = {
                    keyList: []
                }; //清空自定义护理项字典表
                $editBox.empty(); //清空当前内容
                codeListArr.forEach(function (codeListEl, listIdx) {
                    var inputStr = "",
                        inputUsrStr = "",
                        textareaStr = "",
                        checkStr = "";
                    codeListEl.forEach(function (ele, idx, arr) {
                        if (ele.vsType === 'IP' || ele.vsType === 'SP') {
                            linkSeqMap[ele.vsCode] = _devDaInfo.devSeq + '_' + _devDaInfo
                            .devCom;
                        }
                        //添加flag后循环增加div
                        if (ele.rsltMode === "input_user") {
                            var str = "";
                            str += "<div class=\"inputUsrContainer\">";
                            str += "<label>";
                            str += "<span class=\"labelTitle labelText\">" + ele.vsName +
                                ": </span>";
                            str +=
                                "<input type=\"text\" placeholder=\"回车查询\" autocomplete=\"off\" name=\"" +
                                ele.vsCode + "\" class=\"" + ele.vsCode +
                                "  userInput\" data-vstype=\"" + ele.vsType + "\">";
                            str +=
                                "<div class=\"signImgBox\"><img src=\"javascript:;\" title=\"\" class=\"signPic\"></div>";
                            str += "</label>";
                            str += "</div>";
                            // <div class="signImgBox">
                            // 	<img src="" title="" class="signPic">
                            // 	<a href="#">编辑</a>
                            // </div>
                            inputUsrStr += str;
                            if (ele.colNumb > 1) {
                                var loopNumb = ele.colNumb - 1;
                                for (var i = 0; i < loopNumb; i++) {
                                    inputUsrStr += "<div class=\"inputUsrContainer\"></div>"
                                }
                            }
                        } else if (ele.rsltMode === "search") {
                            var str = "";
                            str +=
                                "<div class=\"inputContainer\"><label><span class=\"labelTitle labelText\">" +
                                ele.vsName +
                                ": </span><input type=\"text\" placeholder=\"回车查询\" autocomplete=\"off\" name=\"" +
                                ele.vsCode + "\" class=\"" + ele.vsCode +
                                "  searchInput\" data-vstype=\"" + ele.vsType +
                                "\"></label><span class=\"unit\">" + (ele.vsUnit || "") +
                                "</span></div>"; //inputContent
                            inputStr += str;
                            if (ele.colNumb > 1) {
                                var loopNumb = ele.colNumb - 1;
                                for (var i = 0; i < loopNumb; i++) {
                                    inputStr += "<div class=\"inputContainer\"></div>"
                                }
                            }
                        } else if (ele.rsltMode === "select") {
                            var str = "";
                            str +=
                                "<div class=\"selContainer\"><label><span class=\"labelTitle labelText\">" +
                                ele.vsName + ": </span><select name=\"" + ele.vsCode +
                                "\" class=\"" + ele.vsCode + "\">"; //inputContent
                            var listName = ele.rsltCode;
                            if (mpFlag === '1' && (listName === 'BRAND' || listName ===
                                    'OCCL_LVL')) {
                                // 注射泵输液泵类型增加品牌作为选择
                                listName += '_' + parentExChgInfo.devModl;
                            }
                            console.log('当前的列表是：' + listName);
                            var optList = res.resultInfo.sysdata[listName];
                            str += "<option value=\"\">请选择</option>"
                            if (optList) {
                                optList.forEach(function (optEle, optIdx, optArr) {
                                    str += "<option value=\"" + optEle.infocode +
                                        "\">" + optEle.info + "</option>";
                                });
                            }
                            str += "</select></label></div>";
                            inputStr += str;
                            if (ele.colNumb > 1) {
                                var loopNumb = ele.colNumb - 1;
                                for (var i = 0; i < loopNumb; i++) {
                                    inputStr += "<div class=\"inputContainer\"></div>"
                                }
                            }
                        } else if (ele.rsltMode === "textarea") {
                            var str = "";
                            var classStr = "labelTitle labelText textarea-label";
                            str +=
                                "<div class=\"textareaContainer\"><label><span class=\"" +
                                classStr + "\">" +
                                ele.vsName +
                                ": </span><textarea maxlength=\"500\" autocomplete=\"off\" name=\"" +
                                ele.vsCode + "\" class=\"" + ele.vsCode +
                                "\"></textarea></label>";
                            //如果是病情，增加单位选项
                            if (ele.vsCode === 'NC_MEMO') {
                                str +=
                                    "<div id=\"fast-info\"><div>";
                                charList.forEach(function (el) {
                                    str +=
                                        "<span class=\"fast-item\" onclick=\"addToNcMemo('" +
                                        el.info + "')\">";
                                    str += el.info;
                                    str += "</span>";
                                })
                                unitList.forEach(function (el) {
                                    str +=
                                        "<span class=\"fast-item\" onclick=\"addToNcMemo('" +
                                        el.info + "')\">";
                                    str += el.info;
                                    str += "</span>";
                                })
                                str += "</div></div>";
                            }
                            str += "</div>"; //textAreaContent
                            textareaStr += str;
                        } else if (ele.rsltMode === "checkbox") {
                            if (ele.vsType === "DC" && ele.udefFlag === "1") {
                                //如果是DC的自定义护理项，暂不渲染，生成自定义护理项字典表
                                custDcItemDict.keyList.push(ele.vsCode);
                                custDcItemDict[ele.vsCode] = ele;
                            } else {
                                checkStr +=
                                    "<div class=\"checkContainer\">";
                                //title
                                checkStr +=
                                    "<p><span class=\"labelTitle checkTitle\">" + ele.vsName +
                                    "</span></p>";
                                checkStr +=
                                    "<label class=\"check-label\"><input type=\"radio\" name=\"" +
                                    ele.vsCode +
                                    "\" class=\"" + ele.vsCode +
                                    "\" value=\"9\" checked>无</label>";
                                checkStr +=
                                    "<label class=\"check-label\"><input type=\"radio\" name=\"" +
                                    ele.vsCode +
                                    "\" class=\"" + ele.vsCode + "\" value=\"0\">待做</label>";
                                checkStr +=
                                    "<label class=\"check-label\"><input type=\"radio\" name=\"" +
                                    ele.vsCode +
                                    "\" class=\"" + ele.vsCode + "\" value=\"1\">已做</label>";
                                checkStr += "</div>";
                            }
                        } else if (ele.rsltMode === 'input2') {
                            // 小时分钟增加双input
                            var str = "";
                            var classStr = ele.vsCode;
                            classStr += ' ' + 'input2';
                            if (ele.vsType === 'VS' || ele.vsType === 'RM' || ele.vsType ===
                                'IP' || ele.vsType === 'SP') {
                                //呼吸机和生命体征增加回车进入下一个
                                classStr += " enterNext";
                            }
                            str += '<div class="inputContainer">'
                            str += '<label>'
                            str += '<span class="labelTitle labelText">';
                            str += ele.vsName + ':';
                            str += '</span>';
                            str += '<input type="text" autocomplete="off" name="' + ele.vsCode +
                                '" class="' + classStr + '">';
                            str += '<span class="unit input2">'
                            if (ele.vsCode === 'RM_IOE') {
                                str += '：';
                            } else if (ele.vsCode === 'REMAIN') {
                                str += '时';
                            }
                            str += '</span>';
                            str += '<input type="text" autocomplete="off" name="' + ele.vsCode +
                                '" class="' + classStr + '">';
                            str += '<span class="unit input2">'
                            if (ele.vsCode === 'RM_IOE') {
                                str += '';
                            } else if (ele.vsCode === 'REMAIN') {
                                str += '分';
                            }
                            str += '</span>';
                            str == '</label>';
                            str += '</div>' // inputContainer
                            inputStr += str;
                            if (ele.colNumb > 1) {
                                var loopNumb = ele.colNumb - 1;
                                for (var i = 0; i < loopNumb; i++) {
                                    inputStr += "<div class=\"inputContainer\"></div>"
                                }
                            }
                        } else {
                            var str = "";
                            var classStr = ele.vsCode;
                            if (ele.vsType === 'VS' || ele.vsType === 'RM' || ele.vsType ===
                                'IP' || ele.vsType === 'SP') {
                                //呼吸机和生命体征增加回车进入下一个
                                classStr += " enterNext";
                            }
                            str +=
                                "<div class=\"inputContainer\"><label><span class=\"labelTitle labelText\">" +
                                ele.vsName +
                                ": </span><input type=\"text\" autocomplete=\"off\" name=\"" +
                                ele.vsCode + "\" class=\"" + classStr +
                                "\"></label><span class=\"unit\">" + (ele.vsUnit || "") +
                                "</span></div>"; //inputContent
                            inputStr += str;
                            if (ele.colNumb > 1) {
                                var loopNumb = ele.colNumb - 1;
                                for (var i = 0; i < loopNumb; i++) {
                                    inputStr += "<div class=\"inputContainer\"></div>"
                                }
                            }
                        }
                    })
                    // append
                    var thisCode = codeArr[listIdx]["typeCode"];
                    var appendStr = "<div class=\"" + thisCode + "Div divPart icu-card\">";

                    var h3Title = codeArr[listIdx]["titleName"];
                    if (codeArr[listIdx]["typeCode"] === "VS") {
                        //如果是呼吸机信息，增加清除按钮和获取上次数据按钮
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary getLastDataBtn\">快速填充</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\"\">清空</span></span></h3>"
                    } else if (codeArr[listIdx]["typeCode"] === "RM") {
                        //如果是呼吸机信息，增加清除按钮和获取上次数据按钮
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary getLastDataBtn\">快速填充</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\"\">清空</span></span></h3>"
                    } else if (codeArr[listIdx]["typeCode"] === "DC") {
                        //如果是日常护理信息，增加清除按钮和一键已做按钮
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary showDCitem\">展开自定义护理项</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary finishDCbtn\">一键已做</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\"\">清空</span></span></h3>"
                    } else if (codeArr[listIdx]["typeCode"] === "NC") {
                        //病情加入模板
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary modlBtn\">模板管理</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\"\">清空</span></span></h3>"
                    } else if (codeArr[listIdx]["typeCode"] === "IP") {
                        // 输液泵增加清除信息和快速填充
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary getLastDataBtn\">快速填充</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\"\">清空</span></span></h3>"
                    } else if (codeArr[listIdx]["typeCode"] === "SP") { // 注射泵增加清除信息和快速填充
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary getLastDataBtn\">快速填充</span><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\"\">清空</span></span></h3>"
                    } else {
                        appendStr += "<h3 class=\"icu-card-title\" data-typecode=\"" + codeArr[listIdx]
                            .typeCode + "\">" + "<span class=\"card-title-content\">" + h3Title +
                            "<span class=\"curDate\">" + queryDateStr +
                            "</span></span><span class=\"dataControlBtnGroup icu-btn-group\"><span class=\"dataControlBtn icu-btn inline-btn small-btn btn-outline-primary clearDataBtn\">清空</span></span></h3>"
                    }
                    // appendStr += "<h3 class=\"icu-card-title\">" + h3Title + "<span class=\"curDate\">" + queryDateStr + "</span></h3>"
                    //手动渲染自定义护理模板
                    if (codeArr[listIdx]["typeCode"] === "DC") {
                        var custDcItemStr = "<div class=\"custDCitemOuter\">";
                        // if (custDcItemDict.keyList.length !== 0) {
                        custDcItemStr +=
                            "<div id=\"addNewDCitemBox\" class=\"icu-btn-group\"><span class=\"icu-btn btn-outline-primary\" id=\"addNewDCitem\" onclick=\"addNewDCitem()\">新增自定义护理项</span></div>"
                        // }
                        $.each(custDcItemDict.keyList, function () {
                            var dictInfo = custDcItemDict[this];
                            custDcItemStr += getThisCustDcItemStr(dictInfo).totalStr;
                        })
                        custDcItemStr += "</div>"
                        appendStr += "<div class=\"checkOuter\">" + custDcItemStr + checkStr + "</div>";
                    } else {
                        appendStr += "<div class=\"checkOuter\">" + checkStr + "</div>";
                    }
                    //插入网页
                    // appendStr += "<div class=\"checkOuter\">" + custDcItemStr + checkStr + "</div>";
                    appendStr += "<div class=\"inputOuter\">" + inputStr + "</div>";
                    appendStr += "<div class=\"textareaOuter\">" + textareaStr + "</div>";
                    appendStr += "<div class=\"inputUsrOuter\">" + inputUsrStr + "</div>";
                    appendStr += "</div>"
                    $editBox.append(appendStr);
                    codeDivObj[thisCode] = {};
                    codeDivObj[thisCode]["total"] = $editBox.find("." + thisCode + "Div"); //存入总Div数组项
                    codeDivObj[thisCode]["checkDiv"] = codeDivObj[thisCode]["total"].find(
                        ".checkContainer"); //对应存入check
                    codeDivObj[thisCode]["inputDiv"] = codeDivObj[thisCode]["total"].find(
                        ".inputContainer"); //对应存入input
                    codeDivObj[thisCode]["textareaDiv"] = codeDivObj[thisCode]["total"].find(
                        ".textareaContainer"); //对应存入textarea
                    codeDivObj[thisCode]["selDiv"] = codeDivObj[thisCode]["total"].find(
                        ".selContainer"); //对应存入sel
                    codeDivObj[thisCode]["inputUsrDiv"] = codeDivObj[thisCode]["total"].find(
                        ".inputUsrContainer"); //对应存入inputuser
                })

                //绑定本地查询框
                eicuUtil.bindSearchInput(hisMap);
                // //绑定医生拼音查询事件
                eicuUtil.bindUserInput();
                //绑定血压输入时，如果没有选择血压类型，默认无创血压
                $(".SBP").on("blur", function () {
                    var thisVal = $(this).val();
                    var $bpType = $(".BP_TYPE");
                    if (thisVal && !$bpType.val()) {
                        $bpType.val("BP_TYPE01");
                    }
                });
                $(".DBP").on("blur", function () {
                    var thisVal = $(this).val();
                    var $bpType = $(".BP_TYPE");
                    if (thisVal && !$bpType.val()) {
                        $bpType.val("BP_TYPE01");
                    }
                });
                //绑定清除按钮方法
                $(".clearDataBtn").off("click").on("click", function () {
                    var vsType = $(this).parents("h3").attr("data-typecode");
                    clearData(vsType)
                })
                //绑定快速填充按钮方法
                $(".getLastDataBtn").off("click").on("click", function () {
                    var vsType = $(this).parents("h3").attr("data-typecode");
                    getLastData(vsType);
                })
                //绑定一键已做按钮方法
                $(".finishDCbtn").off("click").on("click", function () {
                    finishDC();
                });
                //绑定增加护理项
                $(".showDCitem").off("click").on("click", function () {
                    showDCitem();
                })
                $(".modlBtn").off('click').on('click', function () {
                    toModlPage();
                })
                //增加textarea提示框
                var taHintStr = '<span class="taHint unit">最多500字</span>'
                $(".textarea-label").append(taHintStr);
                //增加病情模板失焦事件，方便插入
                var $ncMemo = $("textarea.NC_MEMO");
                $ncMemo.off('blur').on('blur', function () {
                    ncMemoStrIdx = event.target.selectionStart;
                })
                var ncWidth = $ncMemo.parents('.textareaContainer').width() - $ncMemo.prev().width() - $(
                    '#fast-info').width() - parseInt($('#fast-info').css('margin-right')) - 15;
                $ncMemo.width(ncWidth)
                //绑定回车聚焦下一项目
                $(".enterNext").on("keyup", function () {
                    var keyCode = event.keyCode;
                    var $thisEl = $(event.target);
                    var $inputContainer = $thisEl.parents(".inputContainer");
                    var $inputOuter = $inputContainer.parent();
                    var thisIdx = $inputContainer.index();
                    var $tempEl = $thisEl;
                    if (keyCode === 13) {
                        //如果是回车键，寻找下一个
                        var $nextInput;
                        while (!$nextInput && $tempEl.length !== 0) {
                            // 有下一个输入框
                            $tempEl = $tempEl.next();
                            if ($tempEl.get(0) && $tempEl.get(0).nodeName === 'INPUT' && $tempEl.get(0)
                                .type === 'text') {
                                // 当前元素的下一个输入框
                                $nextInput = $tempEl;
                            }
                        }
                        while ((!$nextInput || $nextInput.length === 0) && thisIdx <= $inputOuter
                            .children().length) {
                            //寻找下一个有typetxt的input
                            $nextInput = $inputOuter.children()
                                .eq(++thisIdx)
                                .find("input[type='text']").eq(0);
                        }
                        if (thisIdx > $inputOuter.children().length) {
                            $nextInput = $inputOuter.parent().find(
                                    ".inputUsrOuter input[type='text'].userInput")
                                .eq(0);
                        }
                        $nextInput.focus();
                        // 如果该输入框已经有值，全选以修改
                        if ($nextInput.val()) {
                            $nextInput.select();
                        }
                    }
                })
                //获取全部数据
                getAllInfo();
            })
        }

        /**
         *保存所有数据
         */
        function saveAll(closeFlag) {
            var icuList = [];
            var delSeqArr = [];
            var humArr = [];
            var bpArr = []; //血压判断
            var loopFlag = true; //codeDivObj，thisDiv thisContainer三重循环控制
            var hasValueCodeArr = [];
            $.each(codeDivObj, function (k) {
                var thisDiv = codeDivObj[k];
                $.each(thisDiv, function (container) {
                    if (container === "total") {
                        return loopFlag;
                    } else {
                        var thisContainer = thisDiv[container];
                        if (container === "selDiv") {
                            thisContainer.each(function () {
                                var $thisEl = $(this).find("select");
                                if ($thisEl.length !== 0) {
                                    var dataSeq = $thisEl.data("vsSeq");
                                    var thisVal = $thisEl.find("option:selected").val();
                                    var thisCode = $thisEl.attr("name");
                                    if (thisVal) {
                                        if (hasValueCodeArr.indexOf(k) === -1) {
                                            hasValueCodeArr.push(k);
                                        }
                                        icuList.push({
                                            "vsSeq": dataSeq || "",
                                            "linkSeq": linkSeqMap[dataSeq] ||
                                                linkSeqMap[thisCode] || '',
                                            "vsType": k,
                                            "vsCode": thisCode,
                                            "vsRslt": thisVal
                                        });
                                    } else if (dataSeq) {
                                        delSeqArr.push(dataSeq);
                                    }
                                }
                            })
                        } else if (container === "textareaDiv") {
                            thisContainer.each(function () {
                                var $thisEl = $(this).find("textarea");
                                var dataSeq = $thisEl.data("vsSeq");
                                var thisCode = $thisEl.attr("name");
                                var thisVal;
                                if ($thisEl.length !== 0) {
                                    if ($thisEl.hasClass("userInput")) { //单独保存签名数据
                                        thisVal = $thisEl.data("userid");
                                    } else {
                                        thisVal = $thisEl.val();
                                    }
                                    if (thisVal) {
                                        if (hasValueCodeArr.indexOf(k) === -1) {
                                            hasValueCodeArr.push(k);
                                        }
                                        icuList.push({
                                            "vsSeq": dataSeq || "",
                                            "linkSeq": linkSeqMap[dataSeq] ||
                                                linkSeqMap[thisCode] || '',
                                            "vsType": k,
                                            "vsCode": thisCode,
                                            "vsRslt": thisVal
                                        });
                                    } else if (dataSeq) {
                                        delSeqArr.push(dataSeq);
                                    }
                                }
                            })
                        } else if (container === "checkDiv") {
                            thisContainer.each(function () {
                                var $checkedRadio = $(this).find("input:checked");
                                if ($checkedRadio.length !== 0) {
                                    var dataSeq = $checkedRadio.data("vsSeq");
                                    if ($checkedRadio.hasClass("custDCflag")) {
                                        //如果是自定义添加的护理项
                                        //检查是否已填写护理项名称
                                        var addVsName = $(this).find(".labelTitle").text();
                                        var vsCode = $checkedRadio.attr("name");
                                        dataSeq = custDcItemDict[vsCode]["vsSeq"];
                                        var thisVal = $checkedRadio.val();
                                        if (thisVal !== "9" && hasValueCodeArr
                                            .indexOf(k) === -1) {
                                            //如果状态不是未做，则需要签名判断
                                            hasValueCodeArr.push(k);
                                        } else if (thisVal === "9" && dataSeq) {
                                            //如果是未做且有dataSeq，则插入删除列表
                                            delSeqArr.push(dataSeq);
                                        }
                                        if (vsCode.indexOf("fakeCode") !== -1) {
                                            //如果是伪造的vsCode则为空
                                            vsCode = "";
                                        }
                                        icuList.push({
                                            "vsSeq": dataSeq,
                                            "linkSeq": linkSeqMap[dataSeq] ||
                                                linkSeqMap[vsCode] || '',
                                            "vsType": k,
                                            "vsCode": vsCode, //如果name没有fakeCode则不是伪造
                                            "vsRslt": $checkedRadio.val(),
                                            "vsName": addVsName
                                        });
                                    } else {
                                        if ($checkedRadio.val() === "9") {
                                            //如果是无
                                            if (dataSeq) {
                                                delSeqArr.push(dataSeq);
                                            }
                                        } else {
                                            if (hasValueCodeArr.indexOf(k) === -1) {
                                                hasValueCodeArr.push(k);
                                            }
                                            icuList.push({
                                                "vsSeq": dataSeq || "",
                                                "linkSeq": linkSeqMap[dataSeq] ||
                                                    linkSeqMap[vsCode] || '',
                                                "vsType": k,
                                                "vsCode": $checkedRadio.attr("name"),
                                                "vsRslt": $checkedRadio.val()
                                            });
                                        }
                                    }
                                }
                            })
                        } else {
                            // if (container === "inputDiv" || container === "inputUsrDiv") {
                            thisContainer.each(function () {
                                var $thisEl = $(this).find("input");
                                var dataSeq = $thisEl.data("vsSeq");
                                var thisCode = $thisEl.attr("name");
                                var thisVal;
                                var thisVal2;
                                if ($thisEl.length === 2) {
                                    // 双input合并
                                    thisVal = $thisEl.eq(0).val();
                                    thisVal2 = $thisEl.eq(1).val();
                                    if ((thisVal && !thisVal2) || (!thisVal && thisVal2)) {
                                        // 有单个值没有填
                                        if (thisCode === 'RM_IOE') {
                                            alert_warn('吸呼比有未填项！');
                                        } else if (thisCode === 'REMAIN') {
                                            alert_warn('剩余时间小时/分钟有未填项！');
                                        }
                                        loopFlag = false;
                                        return loopFlag;
                                    }
                                    if (thisVal && thisVal2) {
                                        if (hasValueCodeArr.indexOf(k) === -1) {
                                            hasValueCodeArr.push(k);
                                        }
                                        thisVal = thisVal + '|' + thisVal2;
                                        icuList.push({
                                            "vsSeq": dataSeq || "",
                                            "linkSeq": linkSeqMap[dataSeq] ||
                                                linkSeqMap[thisCode] || '',
                                            "vsType": k,
                                            "vsCode": thisCode,
                                            "vsRslt": thisVal
                                        });
                                    } else if (dataSeq) {
                                        delSeqArr.push(dataSeq);
                                    }
                                } else if ($thisEl.length !== 0) {
                                    if ($thisEl.hasClass("userInput")) { //单独保存签名数据
                                        thisVal = $thisEl.data("userid");
                                    } else {
                                        thisVal = $thisEl.val();
                                    }
                                    if (thisVal) {
                                        if (!$thisEl.hasClass("userInput")) {
                                            //如果不是签名项且有值
                                            if (hasValueCodeArr.indexOf(k) === -1) {
                                                hasValueCodeArr.push(k);
                                            }
                                        }
                                        if (thisCode === "SBP" || thisCode === "DBP") {
                                            bpArr.push(thisCode);
                                        }
                                        icuList.push({
                                            "vsSeq": dataSeq || "",
                                            "linkSeq": linkSeqMap[dataSeq] ||
                                                linkSeqMap[thisCode] || '',
                                            "vsType": k,
                                            "vsCode": thisCode,
                                            "vsRslt": thisVal
                                        });
                                    } else if (dataSeq) {
                                        delSeqArr.push(dataSeq);
                                    }
                                }
                            })
                        }
                    }
                    return loopFlag;
                })
                return loopFlag;
            })
            if (!loopFlag) {
                return;
            }
            //-----检查自定义护理项
            $(".custDCitemOuter .checkContainer").each(function () {
                var vsCode = $(this).parent()[0].className;
                var dataSeq = custDcItemDict[vsCode]["vsSeq"] || "";
                var vsName = custDcItemDict[vsCode]["vsName"];
                if (!vsName) {
                    alert_warn("请填写日常护理信息中自定义护理项名称");
                    if (!$(".custDCitemOuter").hasClass("active")) {
                        //如果列表未展开，展开列表
                        $(".custDCitemOuter").parents(".divPart").find(".dataControlBtnGroup .showDCitem")
                            .click();
                    }
                    loopFlag = false;
                    return loopFlag; //break
                }
                if (dataSeq) {
                    //如果在上方列表且有dataSeq，则插入删除列表
                    delSeqArr.push(dataSeq);
                }
                if (vsCode.indexOf("fakeCode") !== -1) {
                    //如果是伪造的vsCode则传递为空
                    vsCode = "";
                }
                icuList.push({
                    "vsSeq": "", //即便有vsSeq，只修改字典信息，也不需要传递
                    "linkSeq": "",
                    "vsType": "DC",
                    "vsCode": vsCode, //如果name没有fakeCode则不是伪造
                    "vsRslt": "9",
                    "vsName": vsName
                });
            })
            //-----血压类型、收缩压、舒张压必须保持一致-----
            if (bpArr.length !== 0 && bpArr.length !== 2) {
                alert_warn("收缩压/舒张压有未填项！");
                return;
            }
            if (bpArr.length === 0 && $(".BP_TYPE").val()) {
                alert_warn("收缩压/舒张压有未填项！");
                return;
            }
            if (bpArr.length === 2 && !$(".BP_TYPE").val()) {
                alert_warn("血压类型未选择！");
                return;
            }
            var signSuccess = true;
            //如果没有签名则终止并提示
            $.each(codeArr, function (idx) {
                var codeEl = this;
                var vsType = codeEl.typeCode;
                var $thisTypeUsrDiv = codeDivObj[vsType]["inputUsrDiv"];
                if (hasValueCodeArr.indexOf(vsType) !== -1) {
                    //该项目有值，提醒无签名
                    $thisTypeUsrDiv.each(function () {
                        if ($(this).find("input.NURS_SIGN").length !== 0 && !$(this).find(
                                "input.NURS_SIGN").val()) {
                            signSuccess = false;
                            alert_warn("请填写" + codeEl.titleName + "的护士签名");
                            return signSuccess;
                        }
                    })
                } else {
                    //该项目无值，提醒有签名
                    $thisTypeUsrDiv.each(function () {
                        if ($(this).find("input.NURS_SIGN").length !== 0 && $(this).find(
                                "input.NURS_SIGN").val()) {
                            signSuccess = false;
                            alert_warn(codeEl.titleName + "无内容，请取消签名");
                            return signSuccess;
                        }
                    })
                }
                // var thisTypeList = icuList.filter(function (icuListEl) {
                //     return icuListEl.vsType === vsType;
                // });
                // var $thisTypeUsrDiv = codeDivObj[vsType]["inputUsrDiv"];
                // if (thisTypeList.length !== 0 && $thisTypeUsrDiv.length !== 0) {
                //     // 如果已有此类型的提交修改数据且有签名inputContainer
                //     $thisTypeUsrDiv.each(function () {
                //         if ($(this).find("input.NURS_SIGN").length !== 0 && !$(this).find("input.NURS_SIGN").val()) {
                //             signSuccess = false;
                //            alert_warn("请填写" + codeEl.titleName + "的护士签名");
                //             return signSuccess;
                //         }
                //     })
                // }
                return signSuccess;
            })

            if (!signSuccess) {
                return;
            }
            if (!loopFlag) {
                return;
            }
            var requestParam = {
                "liveNo": _liveNo,
                "paramDate": queryDateStr,
                "icuVsInfoList": icuList,
                "delSeqArr": delSeqArr
            };
            console.log("循环提交数据完毕");
            console.log(requestParam);
            // return;
            publicFun.httpRequest("${baseurl}icuVitlIo/vsZtwhSubmit.do", requestParam, {
                requestType: "json"
            }, function (res) {
                ajax_alert(res)
                if (res.resultInfo.success) {
                    if (parentExChgInfo) {
                        // 公共方法跳转
                        parent.modalReturnFun();
                        if (closeFlag) {
                            // 关闭
                            parent.ajax_alert(res);
                            closeAll();
                        } else {
                            // 刷新本页数据
                            getAllList();
                        }
                    } else if (parent.$clickedRow) {
                        //如果从护理单进入，保存后刷新父级页面
                        parent.initData();
                        if (closeFlag) {
                            parent.ajax_alert(res);
                            closeAll();
                        } else {
                            getAllList();
                        }
                    } else {
                        if (closeFlag) {
                            closeAll('delay');
                        } else {
                            getAllList();
                        }
                    }
                }
            })
        }
        /**
         *关闭当前页
         */
        function closeAll(delayFlag) {
            if (parent.$selectedEl) {
                var $parentSelectedEl = parent.$selectedEl;
                $parentSelectedEl.removeClass('bg-selected');
                //如果父元素是整体护理，置空选中元素
                parent.$selectedEl = null;
            }
            if (parent.$clickedRow) {
                //置空clickedRow状态
                var $parentClickedRow = parent.$clickedRow
                $parentClickedRow
                    .removeClass("active")
                    .css("background-color", "#fff")
                    .unbind('mouseenter', 'mouseleave')
                    .hover(function () {
                        $parentClickedRow.css("background-color", "rgb(234, 242, 255)");
                    }, function () {
                        $parentClickedRow.css("background-color", "#fff");
                    });
                parent.$clickedRow = null;
                parent.closemodalwindow();
                return;
            }
            if (parentExChgInfo) {
                parent.closemodalwindow();
            } else {
                var thisTabTitle = window.top.$('#tabs').tabs('getSelected').title;
                if (delayFlag) {
                    setTimeout(function () {
                        window.top.$('#tabs').tabs('close', thisTabTitle);
                    }, 1000)
                } else {
                    window.top.$('#tabs').tabs('close', thisTabTitle);
                }
            }
        }
        /**
         * checkbox颜色处理
         */
        function checkColorBind($radioTarget, value) {
            //修改父元素外边框颜色
            var borderColor = "#666";
            if (value === "0") {
                borderColor = "orange"
            }
            if (value === "1") {
                borderColor = "blue"
            }
            $radioTarget.parents(".checkContainer").css("border-color", borderColor);
            $radioTarget.parents(".checkContainer").find("p .labelTitle").css("color", borderColor);
        }
        /**
         * SP根据速率计算剩余时间
         */
        function calRemainTime(remainDose, rateVal) {
            var remainTime_mill_sec = remainDose / rateVal * 60 * 1000; // 毫秒剩余时间
            var timeStr = parent.transDifferTime(remainTime_mill_sec);
            var timeStrList = timeStr.split('h');
            var hourStr = timeStrList[0];
            var minuteStr = timeStrList[1].replace('m', '');
            $('input.REMAIN').eq(0).val(hourStr);
            $('input.REMAIN').eq(1).val(minuteStr);
        }
        //获取有上下限的数组及其限制值
        function getLimitInfo() {
            var getLimitXHR = publicFun.httpRequest('${baseurl}icuvslmt/findVsLmtList.do', "liveNo=" + _liveNo,
                function (res) {
                    //根据返回值设定上下限code数组和内容
                    try {
                        if (res.resultInfo && res.resultInfo.sysdata) {
                            var limitList = res.resultInfo.sysdata.vsLmtList;
                            if (limitList) {
                                tzLimitObj.hasLimit = true;
                                limitList.forEach(function (ele, idx, arr) {
                                    tzLimitArray.push(ele.vsCode);
                                    tzLimitObj[ele.vsCode] = {};
                                    tzLimitObj[ele.vsCode]["lowLmt"] = ele.lowLmt;
                                    tzLimitObj[ele.vsCode]["uppLmt"] = ele.uppLmt;
                                })
                            }
                            //    else {
                            //        alert_warn("该患者尚未设置相关的上下限信息")
                            //    }
                        }
                    } catch (e) {
                        console.error(e);
                    }
                })
            return getLimitXHR;
        }

        /**
         *计算上下限
         */
        function limitCal($inputEl, code, value) {
            var $box = $inputEl.parent();
            var redFlag = "noFlag";
            if (tzLimitArray.indexOf(code) !== -1) {
                if (parseFloat(value) < tzLimitObj[code]["lowLmt"]) {
                    // redFlag = "valueDown";
                    redFlag = "text-success";
                }
                if (parseFloat(value) > tzLimitObj[code]["uppLmt"]) {
                    // redFlag = "valueUp";
                    redFlag = "text-danger";
                }

            }
            $box.removeClass("text-danger").removeClass("text-success");
            $inputEl.removeClass("text-danger").removeClass("text-success");
            if (redFlag !== "noFlag") {
                $box.addClass(redFlag)
                $inputEl.addClass(redFlag)
            }
        }
        /**
         * 获取前一次数据
         */
        function getLastData(vsType) {
            var reqUrl = _baseUrl + "icuVitlIo/getLastVsInfo.do";
            var reqParams = {
                liveNo: _liveNo,
                vsType: vsType
            };
            if (vsType === 'IP' || vsType === 'SP') {
                reqParams.linkSeq = _devDaInfo.devSeq + '_' + _devDaInfo.devCom;
                reqParams.startDate = _devDaInfo.begTimeStr;
                reqParams.endDate = _devDaInfo.endTimeStr;
            }
            publicFun.httpRequest(reqUrl, reqParams, {
                requestType: "json"
            }, function (res) {
                if (res.resultInfo.success) {
                    var lastList = res.resultInfo.sysdata.lastList;
                    var $thisDiv = $("." + vsType + "Div");
                    lastList.forEach(function (lastItem) {
                        var vsCode = lastItem.vsCode;
                        var vsRslt = lastItem.vsRslt;
                        var vsRsltArr;
                        var $thisFormEl = $thisDiv.find("." + vsCode);
                        // 如果不止一项，进行切割
                        if ($thisFormEl.length !== 1) {
                            vsRsltArr = vsRslt.split('|');
                            $thisFormEl.each(function (idx) {
                                $(this).val(vsRsltArr[idx]);
                            })
                        } else {
                            $thisFormEl.val(vsRslt);
                        }
                        if (vsCode === "NURS_SIGN" || vsCode === "DOCT_SIGN") {
                            //如果有医生签名和护士签名，重新查询
                            eicuUtil.queryDoct($thisFormEl);
                        }
                    })
                } else {
                    alert_error("请求出错，请联系管理员");
                }
            })
        }
        /**
         *新增护理项
         */
        function showDCitem() {
            var $custDCitemOuter = $(".DCDiv .checkOuter .custDCitemOuter");
            //打开选择框
            if ($custDCitemOuter.hasClass("active")) {
                //如果是显示状态，则隐藏
                $custDCitemOuter.hide().removeClass("active");
                $(event.target).text("展开自定义护理项");
            } else {
                $custDCitemOuter.show().addClass("active");
                $(event.target).text("收起自定义护理项");
            }
        }
        /**
         * 选择护理项
         */
        function chooseDCitem(vsCode) {
            var $thisCustItem = $(".DCDiv .checkOuter .custDCitemOuter div." + vsCode);
            $thisCustItem.find(".checkContainer").remove();
            addDCitem(vsCode);
        }
        /**
         * 补充渲染护理项
         */
        function addDCitem(vsCode) {
            var $checkContainerList = $(".DCDiv .checkOuter>.checkContainer"); //查找outer下的直接checkContainer为下方列表集合
            var curBoxIdx = custDcItemDict.keyList.indexOf(vsCode);
            //默认新增数据
            var vsName, vsSeq;
            var radioClass = "custDCflag";
            var dictInfo = custDcItemDict[vsCode];
            //如果有则获取custDcItemDict字典表中数据
            vsName = dictInfo["vsName"];
            vsSeq = dictInfo["vsSeq"];
            radioClass += " " + vsCode;
            var addStr = "";
            //title
            addStr += "<div class=\"checkContainer addCheckContainer addCheckContainer" + curBoxIdx + "\">";
            //如果是新增项目，增加可删除按钮
            // if (!vsCode) {
            addStr += "<span><span class=\"belowDelBtn  hover-icon-box danger-box\" onclick=\"delCustDcItem(\'" +
                curBoxIdx + "\')\">"
            addStr += "<i class=\"my-icon nav-icon iconfont icon-delete\"></i>"; //删除图标
            addStr += "</span><span>";
            // }
            //可修改标题
            // <input type=\"text\" class=\"addVsName\" placeholder=\"自定义护理项\" value=\"" +vsName + "\">
            addStr +=
                "<p><span class=\"labelTitle checkTitle\">" + vsName + "</span></p>";
            //待做选项
            addStr += "<label><input type=\"radio\" name=\"" + vsCode +
                "\" class=\"" + radioClass + "\" value=\"9\" checked>无</label>";
            addStr += "<label><input type=\"radio\" name=\"" + vsCode +
                "\" class=\"" + radioClass + "\" value=\"0\">待做</label>";
            addStr += "<label><input type=\"radio\" name=\"" + vsCode +
                "\" class=\"" + radioClass + "\" value=\"1\">已做</label>";
            addStr += "</div>";
            $(".DCDiv .checkOuter").append(addStr);
            //新增时直接将状态变为已做
            $(".DCDiv .checkOuter> .addCheckContainer" + curBoxIdx).find("input[type=radio]").each(function () {
                if (vsSeq) {
                    //如果有vsSeq，则为原始数据，动态生成时添加vsSeq
                    $(this).data("vsSeq", vsSeq);
                }
                if ($(this).val() === "1") {
                    checkColorBind($(this), "1");
                    $(this).prop("checked", true);
                } else {
                    $(this).prop("checked", false);
                }
            });
            //更新codeDivObj
            codeDivObj["DC"]["checkDiv"] = codeDivObj["DC"]["total"].find(".checkContainer"); //对应存入check
        }
        /**
         *删除新增DC自定义护理项
         */
        function delCustDcItem(curBoxIdx) {

            var $curContainer = $(".addCheckContainer" + curBoxIdx);
            var vsCode = $curContainer.find("input[type=radio]").eq(0).attr("name");
            var dictInfo = custDcItemDict[vsCode];
            var thisCustItemStr = getThisCustDcItemStr(dictInfo).checkContainerStr;
            $(".DCDiv .checkOuter .custDCitemOuter ." + vsCode).append(thisCustItemStr); //补充回上方显示
            // if (vsCode.indexOf("fakeCode") !== -1) {
            //     //如果是动态新增项，改变边框样式
            //     $("." + vsCode + " .checkContainer").css("border", "1px dotted #999");
            // }
            $curContainer.remove(); //删除当前项
            codeDivObj["DC"]["checkDiv"] = codeDivObj["DC"]["total"].find(".checkContainer"); //删除相关映射
        }
        /**
         * 增加新的自定义护理项目
         */
        function addNewDCitem() {
            var curListLength = custDcItemDict.keyList.length;
            var fakeCode = "fakeCode" + curListLength;
            var custDictInfo = {
                cgFlag: "0",
                rsltMode: "checkbox",
                udefFlag: "1",
                vsType: "DC",
                vsCode: fakeCode,
                vsName: "自定义" + (curListLength + 1)
            };
            custDcItemDict.keyList.push(fakeCode);
            custDcItemDict[fakeCode] = custDictInfo;
            var thisCustItemStr = getThisCustDcItemStr(custDictInfo).totalStr;
            $(".DCDiv .checkOuter .custDCitemOuter").append(thisCustItemStr);
            $("." + fakeCode + " .checkContainer").find(".custom-text-span .icon-edit").click(); //解锁
            // $("." + fakeCode + " .checkContainer").css("border", "1px dotted #999");
        }
        /**
         * 删除字典项目
         */
        function delItemFromDict(vsCode) {
            var $thisContainer = $(".DCDiv .checkOuter .custDCitemOuter ." + vsCode + " .checkContainer");
            //确认则删除
            $(".DCDiv .checkOuter .custDCitemOuter ." + vsCode).remove();
            custDcItemDict.keyList = custDcItemDict.keyList.filter(function (ele) {
                return ele !== vsCode;
            })
            delete custDcItemDict[vsCode];
        }
        /**
         * 生成默认字典表
         */
        function getThisCustDcItemStr(dictInfo) {
            var vsCode = dictInfo.vsCode
            var vsNameInput = "<label>护理项："
            vsNameInput += "<input type=\"text\" name=\"" + vsCode + "\" class=\"vsName custItem " + vsCode +
                "\" value=\"" + dictInfo.vsName + "\" placeholder=\"自定义项目\" oninput=\"chgCustDict(\'" + dictInfo
                .vsCode + "\')\" onblur='toggleEdit(\"" + vsCode + "\")'>";
            vsNameInput += "<span class='custom-text-span " + vsCode + "-text-span'>" + dictInfo.vsName +
                "<span class=\"hover-icon-box primary-box\" onclick='toggleEdit(\"" + vsCode +
                "\")'><i class=\"my-icon nav-icon iconfont icon-edit\"></i></span>" + "</span>";
            vsNameInput += "</label>";
            var controlStr = "";
            controlStr += "<span class=\"addItemBtn hover-icon-box primary-box\" onclick=\"chooseDCitem(\'" + vsCode +
                "\')\">";
            controlStr += "<i class=\"my-icon nav-icon iconfont icon-add1\"></i>"; //新增图标
            controlStr += "</span>";
            // controlStr += "<span class=\"lockItemBtn\">";
            // controlStr += "<i class=\"my-icon nav-icon iconfont icon-edit\"></i>"; //锁图标
            // controlStr += "</span>";
            var delNewItemStr =
                "<span class=\"icu-btn-group\"><span class=\"delNewItem  hover-icon-box danger-box\" onclick=\"delItemFromDict(\'" +
                vsCode +
                "\')\">";
            delNewItemStr += "<i class=\"my-icon nav-icon iconfont icon-delete\"></i>";
            delNewItemStr += "</span></span>";
            var checkContainerStr = "<div class=\"checkContainer\" >" + vsNameInput + controlStr +
                (dictInfo.vsCode.indexOf("fakeCode") !== -1 ? delNewItemStr : "") + "</div>";
            var totalStr = "<div class=\"" + vsCode +
                "\" style=\"display: inline-block\">";
            totalStr += checkContainerStr;
            totalStr += "</div>";
            return {
                totalStr: totalStr,
                checkContainerStr: checkContainerStr
            };
        }
        /**
         *护理项修改事件
         */
        function chgCustDict(vsCode) {
            var thisVal = event.target.value;
            custDcItemDict[vsCode]["vsName"] = thisVal;
        }
        /**
         * 护理项解锁修改事件
         */
        function toggleEdit(vsCode) {
            var $thisCustItemInput = $(".DCDiv .checkOuter .custDCitemOuter div." + vsCode + " input." + vsCode)
            // var $thisEl = $(".DCDiv .checkOuter .custDCitemOuter div." + vsCode + " .lockItemBtn i");
            var $thisTextSpan = $(".DCDiv .checkOuter .custDCitemOuter div." + vsCode + " ." + vsCode + "-text-span");
            // var $thisCustItemInput = $(".DCDiv .checkOuter .custDCitemOuter input." + vsCode);
            if ($thisCustItemInput.hasClass('focused')) {
                $thisTextSpan.show();
                $thisCustItemInput.removeClass("focused").hide();
            } else {
                $thisTextSpan.hide();
                $thisCustItemInput.addClass("focused").show().focus();
            }
            // if ($thisEl.hasClass("icon-edit")) {
            //     $thisEl.removeClass("icon-edit").addClass("icon-unlock");
            //     $thisCustItemInput.prop("disabled", false);
            // } else {
            //     $thisEl.removeClass("icon-unlock").addClass("icon-edit");
            //     $thisCustItemInput.prop("disabled", true);
            // }
        }
        /**
         * 一键一键已做
         */
        function finishDC() {
            var $checkContainerList = $(".DCDiv .checkOuter>.checkContainer");
            $.each($checkContainerList, function () {
                var $checkedInput = $(this).find("input:checked");
                if ($checkedInput.val() === "0") {
                    //如果是待做
                    $checkedInput.prop("checked", false);
                    $(this).find("input").each(function () {
                        if ($(this).val() === "1") {
                            // 勾选已做
                            $(this).prop("checked", true);
                            checkColorBind($(this), "1");
                            return false;
                        }
                    })
                }
            })
        }
        /**
         * 跳转模板管理
         */
        function toModlPage() {
            //如果是护理单跳转，首页跳转
            if (parent._careSheetType) {
                window.top.addTab("病情模板管理", "icutemp/toNcTempPage.do?" + "&th=" + new Date()
                    .getTime(), '', '0');
                // window.top.opentabwindow("病情模板管理", "icutemp/toNcTempPage.do?" + "&th=" + new Date()
                //     .getTime());
            } else {
                window.top.addTab("病情模板管理", "${baseurl}icutemp/toNcTempPage.do?" + "&th=" + new Date()
                    .getTime(), '', '0');

                // window.top.opentabwindow("病情模板管理", "${baseurl}icutemp/toNcTempPage.do?" + "&th=" + new Date()
                // .getTime());
            }
        }
        /**
         *快速选择单位等
         */
        function addToNcMemo(info) {
            var $target = $('textarea.NC_MEMO');
            var thisVal = $target.val();
            var focusIdx = ncMemoStrIdx + info.length;
            if (!ncMemoStrIdx) {
                ncMemoStrIdx = 0;
            }
            $target.val(thisVal.substring(0, ncMemoStrIdx) + info + thisVal.substring(ncMemoStrIdx));
            $target.focus();
            $target.get(0).selectionStart = focusIdx;
            $target.get(0).selectionEnd = focusIdx;
        }
        /**
         * 删除本单元格数据
         */
        function clearData(vsType) {
            //清除当前数据
            var $thisDiv = $("." + vsType + "Div");
            var $thisRadioInput = $thisDiv.find(":radio");
            var $thisCheckInput = $thisDiv.find("input[type=\"checkbox\"]");
            var $otherInput = $thisDiv.find(":input").not($thisRadioInput).not(
                $thisCheckInput).not(".custItem"); //:input选择所有input和select和textarea，去除radio和checkbox
            $thisRadioInput.each(function () {
                if ($(this).val() === "9") {
                    $(this).prop("checked", true);
                    //修改颜色
                    checkColorBind($(this), $(this).val());
                } else $(this).prop("checked", false);
            })
            $otherInput.each(function () {
                if ($(this).data("userid")) {
                    //如果有userid，连同userid一起清空
                    $(this).data("userid", "");
                    $(this).parent().find(".signImgBox").hide();
                    $(this).show();
                }
                $(this).val("");
                //如果VS类，清空箭头
                if (vsType === "VS" || vsType === "BG") {
                    $(this).parents(".inputContainer").removeClass("valueUp").removeClass("valueDown");
                }
            })
        }
        /**
         * 计算每分钟通气量
         */
        function calMve() {
            var $rateEl = $('input[type="text"].RM_RATE');
            var $tveEl = $('input[type="text"].RM_TVE');
            var $mveEl = $('input[type="text"].RM_MVE');
            var rateVal = parseFloat($rateEl.val());
            var tveVal = parseFloat($tveEl.val());
            var mveVal;
            if (isNaN(rateVal) || isNaN(tveVal)) {
                $mveEl.val('')
                $mveEl.parent().removeClass("text-danger").removeClass("text-success");
                $mveEl.removeClass("text-danger").removeClass("text-success");
                return;
            } else {
                $rateEl.val(rateVal);
                $tveEl.val(tveVal);
                mveVal = (rateVal * tveVal / 1000).toFixed(2);
                $mveEl.val(mveVal);
                var code = $mveEl.attr("name");
                limitCal($mveEl, code, mveVal);
            }
        }
        /**
         *初始化数据
         */
        $(function () {
            $("#editBox").height($(window).height() - $("form").height() - $("#saveBar").height() - 28);
            $("#vsDateStr").val(_vsDateStr || publicFun.timeFormat(new Date().getTime(),
                "yyyy/MM/dd hh:00")); //置为当前时间或者选中时间
            queryDateStr = $("#vsDateStr").val();
            // $("#vsDateStr").off("blur").on("blur", function () {
            //     getAllList();
            // })
            getLimitInfo().done(getAllList);
        })
    </script>
</body>

</html>