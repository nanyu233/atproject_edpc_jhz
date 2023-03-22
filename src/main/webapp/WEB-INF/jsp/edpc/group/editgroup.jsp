<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${baseurl}" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>修改群组</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/common/tableStyle.css" />
    <script type="text/javascript" src="lib/validate/jquery.validate.js"></script>
    <style type="text/css">
        *,
        *::before,
        *::after {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        a * {
            box-sizing: initial;
        }

        a.disabled {
            pointer-events: none;
            color: #c1bcbc;
        }

        .datagrid-mask-msg {
            height: auto;
        }

        html, body, #groupEditForm {
            width: 100vw;
            height: 100vh;
        }

        #groupEditForm {
            padding: 10px;
            display: flex;
            flex-direction: column;
        }

        #groupEditForm table {
            flex: 1;
        }

        #groupEditForm table tr {
            vertical-align: top;
        }

        #groupEditForm table tr th {
            text-align: end;
        }

        .footbar {
            width: 100%;
            flex: none;
            display: flex;
            justify-content: end;
            gap: 10px;
        }

        .textarea-base {
            border: 1px solid #d2d9dc;
            text-indent: 2px;
            text-align: left;
            resize: none;
        }

        .input-base {
            line-height: 24px;
            height: 24px;
        }

        .off-screen {
            position: absolute;
            left: -9999px;
        }

        .all-unset {
            all: unset;
        }

        .cmn-toggle {
            position: absolute;
            margin-left: -9999px;
            visibility: hidden;
        }
        .cmn-toggle + label {
            display: block;
            position: relative;
            cursor: pointer;
            outline: none;
            user-select: none;
        }
        input.cmn-toggle-round + label {
            padding: 2px;
            width: 50px;
            height: 25px;
            background-color: #dddddd;
            border-radius: 50px;
        }
        input.cmn-toggle-round + label:before,
        input.cmn-toggle-round + label:after {
            display: block;
            position: absolute;
            top: 1px;
            left: 1px;
            bottom: 1px;
            content: "";
        }
        input.cmn-toggle-round + label:before {
            right: 1px;
            background-color: #f1f1f1;
            border-radius: 60px;
            transition: background 0.4s;
        }
        input.cmn-toggle-round + label:after {
            width: 25px;
            background-color: #fff;
            border-radius: 100%;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
            transition: margin 0.4s;
        }
        input.cmn-toggle-round:checked + label:before {
            background-color: #8ce196;
        }
        input.cmn-toggle-round:checked + label:after {
            margin-left: 23px;
        }
    </style>
</head>
<body>
    <form id="groupEditForm" action="${baseurl}group/editgroup.do" method="post">
        <label for="grpSeq" class="off-screen">群组ID：</label>
        <input id="grpSeq" class="off-screen" name="hspGrpInfCustom.grpSeq" />
        <table class="form-groupin appoptiontab" width="80%">
            <!-- 每列所占的比例 -->
            <colgroup>
                <col width="30%">
                <col width="70%">
            </colgroup>
            <tbody>
                <tr>
                    <th><label for="grpName">群组名称：</label></th>
                    <td><input id="grpName" name="hspGrpInfCustom.grpName" class="input-base" /></td>
                </tr>
                <tr>
                    <th><label for="grpType">群组类型：</label></th>
                    <td>
                        <select id="grpType" name="hspGrpInfCustom.grpType">
                        </select>
                    </td>
                </tr>
                <tr>
                    <th><label for="isenable">状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态：</label></th>
                    <td>
                        <%--<input class="off-screen" name="hspGrpInfCustom.isenable" value="0">--%>
                        <input id="isenable" name="hspGrpInfCustom.isenable" type="checkbox" value="1" checked class="cmn-toggle cmn-toggle-round"  >
                        <label for="isenable"></label>
                    </td>
                </tr>
                <tr>
                    <th><label for="showorder">排&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;序：</label></th>
                    <td><input id="showorder" name="hspGrpInfCustom.showorder" type="number" class="input-base" /></td>
                </tr>
                <tr>
                    <th><label for="remark">备&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;注：</label></th>
                    <td><textarea id="remark" name="hspGrpInfCustom.remark" cols="50" rows="5" class="textarea-base"></textarea></td>
                </tr>
            </tbody>
        </table>

        <div class="footbar">
            <a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href=javascript:handleSubmit()>确定</a>
            <a id="cancelbtn" class="easyui-linkbutton" iconCls="icon-cancel" href=javascript:handleCancel()>取消</a>
        </div>
    </form>

    <script type="application/javascript">
        var grpSeq = '${grpSeq}'
        var groupOperation = parent.groupOperation
        var submitOperation = /(addgroup|editgroup)/
        var formId = 'groupEditForm'
        var formSelector = '#' + formId
        var allDict = publicFun.getItem("allDict")
        var statusMap = { "0": "无效", "1": "有效" }
        var grpTypeMap = listToMap(allDict.GRP_TYPE, 'infocode', 'info')

        // 初始化 select options
        $('#grpType').append(function () {
            var options = []
            $.each(grpTypeMap, function (infocode, info) {
                var $option = $('<option></option>')
                $option.attr("value", infocode)
                $option.html(info)
                if (infocode == '00') {
                    $option.attr('selected', 'selected')
                }
                options.push($option)
            })
            return options
        })

        // groupOperation是由父页面穿过来
        // 只有当执行的是 addgroup editgroup 操作时会保存到后
        // 其他操作 如 groupdetail 只是展示
        if (submitOperation.test(groupOperation)) {
            $(formSelector).attr("action", "${baseurl}group/" + groupOperation + "submit.do")
        } else {
            $(".footbar").hide()
        }

        $.validator.methods.grpType = function (value) {
            return !!grpTypeMap[value]
        };

        var validateOptions = {
            rules: {
                "hspGrpInfCustom.grpSeq": "required",
                "hspGrpInfCustom.grpName": {
                    required: true,
                    normalizer: function(value) {
                        return $.trim(value)
                    }
                },
                "hspGrpInfCustom.grpType": "required",
                "hspGrpInfCustom.showorder": {
                    required: true,
                    digits: true
                },
                "hspGrpInfCustom.remark": {
                    required: false,
                    normalizer: function(value) {
                        return $.trim(value)
                    }
                }
            },
            messages: {
                "hspGrpInfCustom.grpName": "请输入群组名称",
                "hspGrpInfCustom.grpType": "请选择群组类型",
                "hspGrpInfCustom.showorder": "排序请输入数字"
            }
        }

        // 除了添加群组，其他编辑或者查询`grpSeq`都会存在
        // 存在的情况下初始化表单
        if (grpSeq) {
            $("#submitbtn").addClass("disabled")
            $.ajax({
                url: '${baseurl}group/findgroupbyseq.do',
                type: 'POST',
                async: true,
                dataType: 'json',
                data: {
                    "hspGrpInfCustom.grpSeq": grpSeq
                },
                success: function(res) {
                    var resultInfo = res.resultInfo || {}
                    if (resultInfo.type == '1') {
                        $("#submitbtn").removeClass("disabled")
                        var sysdata = resultInfo.sysdata || {}
                        var groupInfo = sysdata.hspGrpInf || {}

                        $.each(groupInfo, function (key, value) {
                            var $formItem = $("#"+key)
                            if($formItem.length > 0) {
                                if ($formItem.is('input[type=checkbox]')) {
                                    var name = $formItem.attr("name")
                                    $("[name='"+name+"']").each(function() {
                                        value = value || '1'
                                        if ($(this).val() == value) {
                                            $(this).prop("checked", "checked")
                                        } else {
                                            $(this).prop("checked", null)
                                        }
                                    })
                                } else {
                                    $formItem.val(value)
                                }
                            }
                        })
                    }
                }
            })
        }
        else {
            delete validateOptions.rules["hspGrpInfCustom.grpSeq"]
            delete validateOptions.messages["hspGrpInfCustom.grpSeq"]
            $("#grpSeq").remove()
            $("label[for=grpSeq]").remove()
        }

        var formValidator = $(formSelector).validate(validateOptions)

        function handleSubmit() {
            var $form = $(formSelector);
            var actionUrl = $form.attr('action');
            var data = $form.serialize()

            // hspGrpInfCustom.isenable 不传会报错
            // checkbox hspGrpInfCustom.isenable 未选中 FormData 是不会包含它的
            if (!/hspGrpInfCustom.isenable/.test(data)) {
                data += '&hspGrpInfCustom.isenable=0'
            }

            if (formValidator.form()) {
                $.ajax({
                    type: "POST",
                    url: actionUrl,
                    data: data,
                    dataType: 'json',
                    success: function (data) {
                        message_alert(data);
                        if (data.resultInfo.type == '1') {
                            close()
                        }
                    }
                });
            }
        }

        function close() {
            //延迟1秒执行关闭方法
            setTimeout("parent.closemodalwindow()", 1000);
            parent.cmdrefresh();
        }

        function handleCancel() {
            close()
        }

        function listToMap(list, keyField, valueField) {
            list = list || []
            if (!(list instanceof Array) || keyField == null) {
                return {}
            }
            var map = {}
            for (var i = 0; i < list.length; i++) {
                var item = list[i]
                if (Object.hasOwnProperty.call(item, keyField)) {
                    var key = item[keyField]
                    var value = item[valueField]
                    if (key != null) {
                        map[key] = value
                    }
                }
            }
            return map
        }
    </script>
</body>
</html>
