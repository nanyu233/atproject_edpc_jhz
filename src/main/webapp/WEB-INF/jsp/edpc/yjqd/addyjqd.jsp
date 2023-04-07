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

        textarea {
            display: block;
            color:#3c3c3c;
            font-weight:500;
            font-size: 18px;
            border-radius: 0;
            line-height: 22px;
            background-color: #fbfbfb;
            border: 3px solid rgba(0,0,0,0);
        }

        textarea:focus{
            background: #fff;
            box-shadow: none;
            border: 2px solid #3276c0;
            outline: none;
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

        /* Base for label styling */
        [type="checkbox"]:not(:checked),
        [type="checkbox"]:checked {
            position: absolute;
            left: 0;
            opacity: 0.01;
        }
        [type="checkbox"]:not(:checked) + label,
        [type="checkbox"]:checked + label {
            position: relative;
            padding-left: 1.6em;
            font-size: 1.05em;
            line-height: 1.7;
            cursor: pointer;
        }

        /* checkbox aspect */
        [type="checkbox"]:not(:checked) + label:before,
        [type="checkbox"]:checked + label:before {
            content: '';
            position: absolute;
            left: 0;
            top: 0;
            width: 1.4em;
            height: 1.4em;
            border: 1px solid #aaa;
            background: #FFF;
            border-radius: .2em;
            -webkit-transition: all .275s;
            transition: all .275s;
        }

        /* checked mark aspect */
        [type="checkbox"]:not(:checked) + label:after,
        [type="checkbox"]:checked + label:after {
            content: '√';
            position: absolute;
            top: .525em;
            left: .18em;
            font-size: 1.375em;
            color: #3276c0;
            line-height: 0;
            -webkit-transition: all .2s;
            transition: all .2s;
        }

        /* checked mark aspect changes */
        [type="checkbox"]:not(:checked) + label:after {
            opacity: 0;
            -webkit-transform: scale(0) rotate(45deg);
            transform: scale(0) rotate(45deg);
        }

        [type="checkbox"]:checked + label:after {
            opacity: 1;
            -webkit-transform: scale(1) rotate(0);
            transform: scale(1) rotate(0);
        }

        /* Disabled checkbox */
        [type="checkbox"]:disabled:not(:checked) + label:before,
        [type="checkbox"]:disabled:checked + label:before {
            box-shadow: none;
            border-color: #bbb;
            background-color: #e9e9e9;
        }

        [type="checkbox"]:disabled:checked + label:after {
            color: #777;
        }

        [type="checkbox"]:disabled + label {
            color: #aaa;
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
        .w-550 {
            width: 550px;
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
        .gap-10{
            gap: 10px;
        }
        .sr-only {
            position: absolute;
            width: 1px;
            height: 1px;
            padding: 0;
            margin: -1px;
            overflow: hidden;
            clip: rect(0, 0, 0, 0);
            white-space: nowrap;
            border-width: 0;
        }
    </style>
</head>
<body>
<form id="addyjqd" class="w-full h-full">
    <div class="off-screen">
        <label for="regSeq">患者编号</label>
        <input id="regSeq" name="regSeq" />
    </div>
    <table class="w-550">
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
                <td><textarea id="noticeContent" name="noticeContent" class="textarea-base" style="width: 480px; height: 200px;"></textarea></td>
            </tr>
            <tr>
                <th>通知方式：</th>
                <td>
                    <ul id="notice-type" class="flex flex-row gap-10">
                        <li v-for="type in NOTICE_TYPE" v-bind:key="type.infocode">
                            <input
                                    type="checkbox"
                                    name="noticeType[]"
                                    :id="type.infocode"
                                    v-bind:value="type.infocode"
                                    v-model="value"
                                    class="off-screen"
                            />
                            <label :for="type.infocode">{{ type.info }}</label>
                        </li>
                    </ul>
                </td>
            </tr>
            <tr>
                <th>通知对象：</th>
                <td>
                    <div class="flex" style="width: fit-content; height: 350px; overflow: hidden; border: 1px solid gray;">
                        <div class="flex-none h-full" style="width: 239px; overflow: auto; border-right: 1px solid gray">
                            <ul id="group-tree"></ul>
                        </div>
                        <div class="flex-none h-full" style="width: 239px; overflow: auto;">
                            <h3 style="font-size: larger; font-weight: bold; padding: 5px 10px; border-bottom: 1px solid gray; position: sticky; top: 0; left: 0; z-index: 100; backdrop-filter: blur(3px);">
                                已选择
                            </h3>
                            <div id="group-selected-preview">
                                <div><input type="text" name="userList" class="sr-only" v-bind:value="nodes.length"></div>
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
    <div class="footbar w-550" style="padding: 20px;">
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

    var noticeTypeVm = new Vue({
        el: "#notice-type",
        data: function () {
            return {
                NOTICE_TYPE: NOTICE_TYPE,
                value: []
            }
        },
        methods: {
            handleCheck(e) {
                console.log(e)
            }
        }
    })

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

    // $('#notice-type').append(NOTICE_TYPE.map(function (item) {
    //     var $li = $("<li></li>")
    //     return '<li><input type="checkbox" name="noticeType[]" value="' + item.infocode + '" /><label>' + item.info + '</label></li>'
    // }))

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
        },
        errorPlacement: function (error, element) {
            if ($(element).attr("name") === "noticeType[]") {
                $(element).parents('#notice-type').append(error)
            }else {
                $(element).parent().append(error)
            }
        },
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
                        noticeType: noticeTypeVm.value.join(',')
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
