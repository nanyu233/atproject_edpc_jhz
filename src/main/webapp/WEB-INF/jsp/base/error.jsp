<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
    <title>失败提示信息</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <%-- <link rel="stylesheet" href="${baseurl}css/body.css" type="text/css" /> --%>
    <link rel="stylesheet" href="${baseurl}css/hems/global.css?v=${versionDay}" type="text/css" />
</head>

<body class="errorpage">
    <table class="submit_hint">
        <tr>
            <td>
                <div id="tabBtnContainer" width="100%">
                    <ul id="tabBtnUi">
                        <li>
                            <a href="#"></a>失败提示信息
                        </li>
                    </ul>
                </div>
            </td>
        </tr>
        <tr>
            <td class="errortd" align='center' valign="middle">
                <img alt="" src="${baseurl}images/common/info.png" align="middle" height="30" width="30" />
                <span class="errorspan">${exceptionResultInfo.message}</span>
            </td>
        </tr>
    </table>
    <table width='100%'>
        <tr>
            <td align="center">
                <input type="button" align="middle" class="button" value="确定" onclick="history.go(-1);" />
            </td>
        </tr>
    </table>
</body>

</html>
