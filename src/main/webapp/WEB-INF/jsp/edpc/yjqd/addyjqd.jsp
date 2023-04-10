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
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            flex: none;
            display: flex;
            justify-content: end;
            gap: 10px;
            padding: 5px;
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

        .icon-user {
            transform: scale(0.8);
            margin-right: -4px;
        }

        .user-list__item {
            display: flex;
            justify-content: space-between;
            padding: 2px 5px;
        }

        .user-list__item:hover {
            background: #eaf2ff;
        }

        .remove-btn {
            -webkit-transition: max-width 0.2s linear 0.2s, text-indent 0.2s linear 0.2s, color 0.2s linear 0.2s;
            -moz-transition: max-width 0.2s linear 0.2s, text-indent 0.2s linear 0.2s, color 0.2s linear 0.2s;
            -o-transition: max-width 0.2s linear 0.2s, text-indent 0.2s linear 0.2s, color 0.2s linear 0.2s;
            transition: max-width 0.2s linear 0.2s, text-indent 0.2s linear 0.2s, color 0.2s linear 0.2s;
            background-color: #f00;
            border-radius: 16px;
            color: rgba(255,255,255,0.1);
            display: inline-block;
            font-size: 14px;
            font-weight: normal;
            line-height: 16px;
            overflow: hidden;
            padding-right: 17px;
            position: relative;
            text-decoration: none;
            max-width: 0;
            white-space: nowrap;

            text-align: right;
        }
        .button_icon {
            -webkit-transition: -webkit-transform 0.4s ease-out;
            -moz-transition: transform 0.4s ease-out;
            -o-transition: -o-transform 0.4s ease-out;
            transition: transform 0.4s ease-out;
            border-radius: 16px;
            color: rgba(255,255,255, 1);
            font-size: 1.3em;
            height: 100%;
            position: absolute;
            right: 0;
            text-align: center;
            text-indent: 0;
            top: 0;
            width: 16px;
        }

        .remove-btn:hover .button_icon {
            -webkit-transition: -webkit-transform 0.4s ease-out;
            -moz-transition: transform 0.4s ease-out;
            -o-transition: -o-transform 0.4s ease-out;
            transition: transform 0.4s ease-out;
        }
        .remove-btn:active {
            top: 1px;
        }

        .button_type__remove,
        .button_type__remove .button_icon {
            background-color: rgba(242,80,39,.65);
        }

        .button_type__remove:hover,
        .button_type__remove .button_icon:hover {
            background-color: rgba(242,80,39,.5);
        }
        .button_type__remove .button_icon:before {
            content: '–';
        }


        .row {
            display: inline-flex;
        }

        .row .label {
            width: 60px;
            text-align: right;
        }
    </style>
</head>
<body>
<form id="addyjqd" class="w-full h-full">
    <div class="off-screen">
        <label for="regSeq">患者编号</label>
        <input id="regSeq" name="regSeq" v-bind:value="regSeq" />
    </div>
    <div style="display: flex; padding: 5px">
        <span class="row">
            <span class="label">姓名：</span>
            <span>{{ cstNam }}</span>
        </span>
        <span class="row">
            <span class="label">性别：</span>
            <span>{{ cstSexCod_MAP[cstSexCod] }}</span>
        </span>
        <span class="row">
            <span class="label">年龄：</span>
            <span>{{ cstAge }}</span>
        </span>
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
                    <input id="yjqdTimeStr" name="yjqdTimeStr" v-model="yjqdTimeStr" type="text" class="input-base Wdate" style="width: 150px;"
                           @focus="datePicker($event)" />
                </td>
            </tr>
            <tr>
                <th>通知内容：</th>
                <td><textarea id="noticeContent" name="noticeContent" v-model="noticeContent" class="textarea-base" style="width: 480px; height: 180px;"></textarea></td>
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
                                    v-model="noticeTypeList"
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
                            <div>
                                <div><input type="text" name="userList" class="sr-only" v-bind:value="nodes.length"></div>
                                <ul class="user-list">
                                    <li class="user-list__item" v-for="node in nodes" v-bind:key="node.usrno">
                                        <span>{{ node.usrname }}</span>
                                        <a href="javascript:void(0)" class="remove-btn button_type__remove" @click="removeNode(node)">
                                            <span class="button_icon"></span>
                                        </a>
                                    <li>
                                </ul>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
        </tbody>
    </table>
    <div class="footbar">
        <a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href=javascript:handleSubmit()>确定</a>
        <a id="cancelbtn" class="easyui-linkbutton" iconCls="icon-cancel" href=javascript:handleCancel()>取消</a>
    </div>
</form>

<script>
    var regSeq = '${regSeq}'
    var cstNam = '${cstNam}'
    var patTyp = '${patTyp}'
    var cstSexCod = '${cstSexCod}'
    var cstAge = ('${cstAge}' == 'null' || '${cstAge}' == null) ? '-' : '${cstAge}'

    var formSelector = "#addyjqd"
    var allDict = publicFun.getItem("allDict")
    var NOTICE_TYPE = allDict.NOTICE_TYPE || []
    var PATTYPE_MAP = listToMap(allDict.PATTYPE, 'infocode', 'info')
    var cstSexCod_MAP = { "0": "男", "1": "女"}

    var dUpdatePreview = publicFun.debounce(updatePreview)
    var dValidateForm = publicFun.debounce(function () {
        if (formValidator) {
            formValidator.form()
        }
    })

    var vm = new Vue({
        el: formSelector,
        data: function () {
            return {
                regSeq: regSeq,
                cstNam: cstNam,
                cstSexCod_MAP: cstSexCod_MAP,
                cstSexCod: cstSexCod,
                cstAge: cstAge,
                yjqdTimeStr: publicFun.timeFormat(new Date(), "yyyy-MM-dd hh:mm:ss"),
                NOTICE_TYPE: NOTICE_TYPE,
                noticeTypeList: $.map(NOTICE_TYPE, function (n) { return n.infocode }), // 默认全选
                noticeContent: "现急诊科接收到 "+ PATTYPE_MAP[patTyp] +" 患者（姓名：${cstNam}），请速来急诊科救治。",
                nodes: []
            }
        },
        watch: {
            nodes() {
                this.$nextTick(dValidateForm)
            }
        },
        methods: {
            datePicker: function (e) {
                var self = this
                WdatePicker({
                    dateFmt:'yyyy/MM/dd HH:mm:ss',
                    onpicked: function () {
                        self[e.target.name] = e.target.value
                    },
                    oncleared: function () {
                        self[e.target.name] = null
                    }
                })
            },
            removeNode(node) {
                var nodeTarget = $("#group-tree").find('.tree-node[node-id="'+ node.usrno +'"]')
                $("#group-tree").tree("uncheck", nodeTarget)
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

        vm.nodes = uniqueArray.map(function (node) {
            return {
                usrno: node.id,
                usrname: node.text
            }
        })
    }

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
            "regSeq": "患者编号未知",
            "yjqdTimeStr": "请输入启动时间",
            "noticeContent": "请输入通知内容",
            "noticeType[]": "请选择通知方式",
            "userList": "请选择至少选择一位通知对象"
        },
        errorPlacement: function (error, element) {
            if ($(element).attr("name") === "regSeq") {
                $('table').before(error)
            } else if ($(element).attr("name") === "noticeType[]") {
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
                        noticeType: vm.noticeTypeList.join(',')
                    },
                    userList: vm.nodes
                }),
                success: function (data) {
                    message_alert(data)
                    setTimeout("parent.closemodalwindow()", 1000);
                }
            })
        }
    }

    function handleCancel() {
        parent.closemodalwindow()
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
