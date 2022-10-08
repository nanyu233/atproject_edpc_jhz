<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <title>cases</title>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css" />
    <script type="text/javascript" src="${baseurl}ateditor/config.js"></script>
    <script type="text/javascript" src="${baseurl}ateditor/ateditor.js"></script>
    <script type="text/javascript" src="${baseurl}js/public.js?v=${versionDay}"></script>
    <style>
        iframe {
            border: none;
        }

        .commonbtn  {
            font: 12px sans-serif;
            line-height: 28px;
        }

        .hidden  {
            display: none;
        }

        iframe#editor {
            width: 100%;
            height: 100%;
        }
    </style>
</head>

<body>
<!-- 编辑器窗口 -->
<iframe id="editor" scrolling="no"></iframe>

<div class="tools-container">
    <p class="at-tools clr">
        <a class="commonbtn" href="javascript:void(0);" onclick="atEditor.dispatch('print')">打印</a>
        <a class="commonbtn" href="javascript:void(0);" onclick="atEditor.dispatch('saveCase')">保存</a>
        <a class="commonbtn" href="javascript:void(0);" onclick="handoverSheetLb()">显示列表</a>
        <a class="commonbtn" href="javascript:void(0);" onclick="sign()">签名</a>
    </p>
</div>

<form id="CaForm" class="hidden">
    <select id="UserList" name="UserList"></select>
    <input id="needId" type="text" />
    <input id="UserImage" type="image" />
</form>

<script type="text/javascript" src="${baseurl}lib/bjcaUkey/XTXSAB.js" charset="UTF-8"></script>
<script type="text/javascript">
    var _activeUserId = "${sessionScope.activeUser.usrno}" || "";
    var _activeUserName = "${sessionScope.activeUser.usrname}" || "";
    var _tempno = "${tempno}" || "";
    var _tempname = "${tempname}" || "";
    var _refseqno = "${refseqno}" || "";
    var _qmHash = "${qmHash}" === "null" || "${qmHash}" === "" || "${qmHash}" == null ? "" : "${qmHash}";
    var _qmTag = "${qmTag}" || "";
    var _caseno = "${caseno}" || "";

    var patientId = _refseqno;
    var patientName = "${cstNam}";
    var systemId = atEditorConfig.systemId || "emis";
    var showEditorToolbar = systemId === "emis" ? false : true
    var needSign = !!_qmHash;
    var autoSign = false;
    var _texthtml;
    var patient = patientName.replace(/\./g,'');

    function handoverSheetLb() {
        window.location = "${baseurl}zyyconsent/queryConsentInf.do?refseqno=${refseqno}";
    }

    var atEditor = defineEditorFrame({
        id: "editor",
        page: "cases",
        // clientBaseUrl: "http://192.168.3.25:20200",
        systemId: systemId,
        userId: _activeUserId,
        userName: _activeUserName,
        patientId: patientId,
        patientName: patient,
        debug: false,
    });

    atEditor.dispatch({
        type: "overwriteSettings",
        payload: {
            // paperList: [{ name: "A4", code: "A4" }],
            // printerList: [{ name: "文书打印", code: "doctPagePrinter" }],
            showEditorToolbar: showEditorToolbar, // default false
            showCaseHistoryList: false, // default false
            showCaseTemplateTree: false, // default false
        },
    });

    atEditor.on("saveCase", function(event) {
        var data = event.data;
        var success = data && event.data.status !== "error";
        if (!success) return console.error("parent: saveCase received error", data);

        // 模板没有保存之前_caseno是空的, 即使保存过的返回的caseSeq也是一样的
        // _texthtml = data.contentHtml
        // _caseno = data.caseSeq
    });



    function setLayout() {
        var menuW = parent.$(".rightPanel")
            ? parent.$(".rightPanel").eq(0).width()
            : 0;
        var toolH = $(".tools-container").eq(0).outerHeight();
        $("#editor").css("width", $("body").width() - menuW);
        $("#editor").css("height", $("body").height() - toolH);
    }

    function init(){
        if (_caseno){
            atEditor.dispatch("insertCase", _caseno);
        }else if(_tempno) {
            atEditor.dispatch("insertCaseTemplate", _tempno)
        }
    }

    setLayout()
    init()
</script>
</body>
</html>
