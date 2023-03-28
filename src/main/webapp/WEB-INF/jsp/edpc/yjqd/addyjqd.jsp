<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${baseurl}" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>群组管理</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
    <script type="text/javascript" src="lib/validate/jquery.validate.js"></script>
    <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
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

        .datagrid-mask-msg {
            height: auto;
        }

        ul, li {
            list-style: none;
        }

        html, body {
            width: 100%;
            height: 100%;
        }

        .textarea-base {
            border: 1px solid #d2d9dc;
            text-indent: 2px;
            text-align: left;
            resize: none;
        }

        .search-btn {
            width: 50px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 20px;
            text-align: center;
        }

        table tr {
            vertical-align: top;
            display: block;
            padding: 5px;
        }

        table tr th {
            text-align: end;
        }

        .list-move, /* apply transition to moving elements */
        .list-enter-active,
        .list-leave-active {
            transition: all 0.5s ease;
        }

        .list-enter-from,
        .list-leave-to {
            opacity: 0;
            transform: translateX(30px);
        }

        /* ensure leaving items are taken out of layout flow so that moving
           animations can be calculated correctly. */
        .list-leave-active {
            position: absolute;
        }

        .footbar {
            width: 100%;
            flex: none;
            display: flex;
            justify-content: end;
            gap: 10px;
        }

        .off-screen {
            position: absolute;
            left: -9999px;
        }
        .hidden {
            display: none;
        }
        .h-full {
            height: 100%;
        }
        .w-full {
            width: 100%;
        }
        .w-500 {
            width: 500px;
        }
        .flex {
            display: flex;
        }
        .flex-row {
            flex-direction: row;
        }
        .flex-col {
            flex-direction: column;
        }
        .flex-1 {
            flex: 1;
        }
        .flex-none {
            flex: none;
        }
    </style>
</head>
<body>
<form id="addyjqd" class="w-full h-full">
    <div class="off-screen">
        <label for="regSeq">患者编号</label>
        <input id="regSeq" name="regSeq" />
    </div>
    <table class="w-500">
        <colgroup>
            <col style="width: 60px;">
            <col>
        </colgroup>
        <tbody>
            <tr>
                <th>启动时间：</th>
                <td>
                    <input id="yjqdTimeStr" name="yjqdTimeStr" type="text" class="input-base Wdate" style="width: 150px;"
                           onfocus="new WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" />
                </td>
            </tr>
            <tr>
                <th>通知内容：</th>
                <td><textarea id="noticeContent" name="noticeContent" cols="50" rows="5" class="textarea-base"></textarea></td>
            </tr>
            <tr>
                <th>通知方式：</th>
                <td>
                    <div id="notice-type"></div>
                </td>
            </tr>
            <tr>
                <th>通知对象：</th>
                <td>
                    <div class="flex" style="width: fit-content; height: 350px; overflow: hidden; border: 1px solid gray;">
                        <div class="flex-none h-full" style="width: 200px; overflow: auto; border-right: 1px solid gray">
                            <ul id="group-tree"></ul>
                        </div>
                        <div class="flex-none h-full" style="width: 200px; overflow: auto;">
                            <h3 style="font-size: larger; font-weight: bold; padding: 5px 10px; border-bottom: 1px solid gray; position: sticky; top: 0; left: 0; z-index: 100; backdrop-filter: blur(3px);">
                                已选择
                            </h3>
                            <div id="group-selected-preview">
                                <input type="text" name="userList" v-bind:value="nodes.length" class="hidden">
                                <ul>
                                    <li v-for="node in nodes" v-bind:key="node.usrno+node.usrname">
                                        {{ node.usrname }}
                                    <li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
        </tbody>
    </table>
    <div class="footbar w-500" style="padding: 20px;">
        <a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href=javascript:handleSubmit()>确定</a>
        <a id="cancelbtn" class="easyui-linkbutton" iconCls="icon-cancel" href=javascript:handleCancel()>取消</a>
    </div>
</form>

<script>
    var regSeq = '${regSeq}'
    $("#regSeq").val(regSeq)
    $("#yjqdTimeStr").val(publicFun.timeFormat(new Date(), "yyyy-MM-dd hh:mm:ss"))
    var allDict = publicFun.getItem("allDict")
    var NOTICE_TYPE = allDict.NOTICE_TYPE || []
    var dUpdatePreview = publicFun.debounce(updatePreview, 300)
    var formSelector = "#addyjqd"

    var previewVm = new Vue({
        el: "#group-selected-preview",
        data: function () {
            return {
                nodes: []
            }
        }
    })

    function updatePreview(nodes) {
        nodes = nodes || []
        var leafNodes = nodes.filter(function (node) {
            var isRoot = node.attributes && node.attributes.root === true
            return !isRoot
        })

        var uniqueArray = leafNodes.filter(function (node, index, self) {
            return index === self.findIndex((snode) => (
                snode.id === node.id && snode.text === node.text
            ))
        });

        previewVm.nodes = uniqueArray.map(function (node) {
            return {
                usrno: node.id,
                usrname: node.text
            }
        })
    }

    $('#notice-type').append(NOTICE_TYPE.map(function (item) {
        return '<label><input type="checkbox" name="noticeType[]" value="' + item.infocode + '" />' + item.info + '</label>'
    }))

    var zt = new ZTREE("group-tree", '${baseurl}yjqd/querygroupusertree_result.do', true);

    zt.ztreeload({
        method: "post",
        loadFilter: function (data) {
            return computeGroupTree(data)
        }
    }, {
        onCheck: function (node) {
            dUpdatePreview(zt.getChecked())
        }
    })

    function computeGroupTree(tree) {
        tree = tree || []
        return tree.map(function (node) {
            if (!node.attributes) {
                node.attributes = {}
            }
            node.attributes.root = true;
            return node
        })
    }

    var formValidator = $(formSelector).validate({
        rules: {
            "regSeq": "required",
            "yjqdTimeStr": "required",
            "noticeContent": "required",
            "noticeType[]": "required",
            "userList": {
                required: true,
                min: 1
            }
        },
        messages: {
            "reqSeq": "患者编号未知",
            "yjqdTimeStr": "请输入启动时间",
            "noticeContent": "请输入通知内容",
            "noticeType[]": "请选择通知方式",
            "userList": "请选择至少选择一位通知对象"
        }
    })

    function handleSubmit() {
        if (formValidator.form()) {
            $.ajax({
                type: "POST",
                url: "yjqd/addyjqdsubmit.do",
                contentType: 'application/json;charset=UTF-8',
                dataType: 'json',
                data: JSON.stringify({
                    hspYjqdInfCustom: {
                        regSeq: regSeq,
                        yjqdTimeStr: publicFun.timeFormat($('#yjqdTimeStr').val() || new Date(), "yyyy-MM-dd hh:mm:ss"),
                        noticeContent: $('#noticeContent').val(),
                        noticeType: $.map($('input[name="noticeType[]"]:checked'), function (elem) {
                            return $(elem).val()
                        }).join(',')
                    },
                    userList: previewVm.nodes
                }),
                success: function (data) {
                    message_alert(data)
                }
            })
        }
    }
</script>
</body>
</html>
