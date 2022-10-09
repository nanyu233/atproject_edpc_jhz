<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="">
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width,initial-scale=1"/>
    <title>cases</title>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css"/>
    <script type="text/javascript" src="${baseurl}ateditor/config.js"></script>
    <script type="text/javascript" src="${baseurl}ateditor/ateditor.js"></script>
    <script type="text/javascript" src="${baseurl}js/public.js?v=${versionDay}"></script>
    <style>
        iframe {
            border: none;
        }

        .commonbtn {
            font: 12px sans-serif;
            line-height: 28px;
        }

        iframe#editor {
            width: 100%;
            height: 100%;
        }

        /* 保存按钮样式 */
        #saveBar {
            position: absolute;
            bottom: 0;
            left: 0;
            width: 100%;
            height: 44px;
            padding: 8px 0;
            background-color: #fff;
            box-sizing: border-box;
            text-align: center;
            border-top: 1px solid #ccc;
        }
    </style>
</head>
<body>
<!-- 编辑器窗口 -->
<iframe id="editor" scrolling="no"></iframe>
<%-- 底部保存按钮 --%>
<div id="saveBar">
    <div class="btnContainer" style="position: relative;display:inline-block;">
        <input type="button" class="commonbtn" value="打印" onclick="atEditor.dispatch('print')">
    </div>
</div>
<script type="text/javascript">
    var _activeUserId = "${sessionScope.activeUser.usrno}" || "";
    var _activeUserName = "${sessionScope.activeUser.usrname}" || "";
    var _tempno = "${tempNo}" || "";
    var _caseno = "${caseno}" || "";
    var _patientId = "${emgSeq}";
    var _patientName = "${cstNam}";
    var _systemId = atEditorConfig.systemId;
    var _patient = _patientName.replace(/\./g, '');
    var _wayTyp = "${wayTyp}";
    var _editData = null;
    var _baseUrl = "${baseurl}"
    var atEditor = defineEditorFrame({
        id: "editor",
        page: "cases",
        systemId: _systemId,
        userId: _activeUserId,
        userName: _activeUserName,
        patientId: _patientId,
        patientName: _patient,
        debug: false,
    });

    atEditor.dispatch({
        type: "overwriteSettings",
        payload: {
            showEditorToolbar: false, // default false
            showCaseHistoryList: false, // default false
            showCaseTemplateTree: false, // default false
        },
    });

    // atEditor.on("saveCase", function(event) {
    //     var data = event.data;
    //     var success = data && event.data.status !== "error";
    //     if (!success) return console.error("parent: saveCase received error", data);
    //
    //     // 模板没有保存之前_caseno是空的, 即使保存过的返回的caseSeq也是一样的
    //     // _texthtml = data.contentHtml
    //     // _caseno = data.caseSeq
    // });
    function setLayout() {
        var body = $("body");
        var editor = $("#editor");
        var menuW = parent.$(".rightPanel")
            ? parent.$(".rightPanel").eq(0).width()
            : 0;
        var toolH = $("#saveBar").eq(0).outerHeight();
        editor.css("width", body.width() - menuW);
        editor.css("height", body.height() - toolH);
    }

    function init() {
        if (_caseno) {
            atEditor.dispatch("insertCase", _caseno);
        } else if (_tempno) {
            atEditor.dispatch("insertCaseTemplate", _tempno)
            atEditor.dispatch("SetInitData", _editData);
        }
    }

    function initEditData() {
        publicFun.httpRequest(_baseUrl + "cpc/getHspXtzlInfByEmgSeqToEdit.do", {
            emgSeq: _patientId,
            wayTyp: _wayTyp
        }, {
            requestType: "json",
            asyncFlag: true
        }, function (res) {
            if (!res.resultInfo.success) {
                alert_error("请求出错，请联系管理员");
                return;
            }
            _editData = res.resultInfo.sysdata;
            init()
        })
    }

    function initEdit() {
        if (!_caseno) {
            initEditData();
        } else {
            init();
        }
    }

    $(function () {
        setLayout()
        initEdit()
    })
</script>
</body>
</html>
