<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>预警阀值新增</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
</head>
<style type="text/css">
    .inupt {
        width: 150px;
    }

    .easyui-combobox {
        width: 160px;
    }

    input.combo-text.validatebox-text {
        border: 1px solid #cfd7e6;
        margin: 0 0 0 0;
        font-size: 14px;
        height: 18px !important;
        line-height: 0px !important;
    }
</style>

<body class="addvslmt">
    <form class="form" id="vslmtform" action="${baseurl}icuvslmt/addVsLmtSubmit.do" method="post">
        <table>
            <tbody>
                <tr>
                    <th><i class="red">*</i>预警阀值名称：</th>
                    <td>
                        <select id="vslmt_vsCode" name="icuVsLmtCustom.vsCode" panelHeight="150">
                            <c:forEach items="${vscodeList}" var="value">
                                <option value="${value.infoCode}">${value.vsInfo}</option>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i>预警上限：</th>
                    <td>
                        <input type="text" id="vslmt_uppLmt" name="icuVsLmtCustom.uppLmt" />
                    </td>
                </tr>
                <tr>
                    <th><i class="red">*</i>预警下限：</th>
                    <td>
                        <input type="text" id="vslmt_lowLmt" name="icuVsLmtCustom.lowLmt" />
                    </td>
                </tr>
                <tr>
                    <td colspan="2" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-add" id="submitbtn"
                                onclick="insertvslmt()">新增</a>
                            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn"
                                onclick="parent.closemodalwindow()">关闭</a>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
        <input type="hidden" id="vslmt_liveNo" name="icuVsLmtCustom.liveNo" value="${liveNo}" />
        <input type="hidden" id="vslmt_crtTime" name="icuVsLmtCustom.crtTime" />
    </form>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <script type="text/javascript">
        //银行新增
        function insertvslmt() {
            if (validateForm()) {
                var uppLmt = Number($("#vslmt_uppLmt").val());
                var lowLmt = Number($("#vslmt_lowLmt").val());
                if (uppLmt * 1 < lowLmt * 1) {
                    alert("预警上限不能小于预警下限!");
                } else {
                    jquerySubByFId('vslmtform', insertvslmt_callback, null, "json");
                }
            }
        }

        function validateForm() {
            return $("#vslmtform").validate({
                rules: {
                    "icuVsLmtCustom.uppLmt": "required",
                    "icuVsLmtCustom.lowLmt": "required",
                },
                messages: {
                    "icuVsLmtCustom.uppLmt": "请输入预警上限",
                    "icuVsLmtCustom.lowLmt": "请输入预警下限",
                }
            }).form();
        }
        //新增的回调函数
        function insertvslmt_callback(data) {
            ajax_alert(data);
            if (data.resultInfo.type == '1') {
                setTimeout("parent.closemodalwindow()", 1000);
                parent.querygcxgl();
            }
        }

        $(function () {
            setTime();
        });

        function setTime() {
            var crtTime = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss");
            $("#vslmt_crtTime").val(crtTime);
        };
    </script>
</body>

</html>