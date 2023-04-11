<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${baseurl}" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>添加用户</title>
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

        html, body {
            width: 100%;
            height: 100%;
        }

        body {
            display: flex;
            flex-direction: column;
        }

        .footbar {
            width: 100%;
            flex: none;
            display: flex;
            justify-content: end;
            gap: 10px;
        }

        .input-base {
            width: 90px;
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

        .flex {
            display: flex;
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
        .items-start {
            align-items: start;
        }
        .gap-5 {
            gap: 5px
        }
        .gap-10 {
            gap: 10px
        }
        .py-5 {
            padding: 5px 0;
        }
        .pb-5 {
            padding-bottom: 5px;
        }
        .mb-5 {
            margin-bottom: 5px;
        }
        .border-b {
            border-bottom: 1px solid black;
        }
    </style>
</head>
<body class="flex flex-col gap-5 py-5">
    <div class="flex-1 flex flex-col">
        <div id="userInfoForm" class="flex-none flex gap-10 pb-5 mb-5 border-b">
            <div>
                <label>
                    用户账号：
                    <input id="usrno" name="usrno" class="input-base" />
                </label>
            </div>
            <div>
                <label>
                    用户名称：
                    <input id="usrname" name="usrname" class="input-base" />
                </label>
            </div>
            <div>
                <button onclick="queryUserResult()" class="search-btn">查询</button>
                <%--<a id="search" href=javascript:queryUserResult() class="easyui-linkbutton" iconCls="icon-search" id="btn">查询</a>--%>
            </div>
        </div>
        <table id="user-info">

        </table>
    </div>

    <div class="flex-1 flex flex-col">
        <div class="flex-none pb-5 mb-5 border-b">群组用户预览列表</div>
        <table id="user-preview">

        </table>
    </div>

    <div class="footbar">
        <a id="submitbtn" class="easyui-linkbutton" iconCls="icon-ok" href=javascript:submit()>确定</a>
        <a id="cancelbtn" class="easyui-linkbutton" iconCls="icon-cancel"  href=javascript:close()>取消</a>
    </div>


    <script type="text/javascript">
        var grpSeq = '${grpSeq}'
        var allDict = publicFun.getItem("allDict")
        var statusMap = { "0": "无效", "1": "有效" }
        var grpTypeMap = listToMap(allDict.GRP_TYPE, 'infocode', 'info')

        var userInfoSelector = '#user-info'
        var userPreviewSelector = '#user-preview'
        var dInitUserPreviewTable = publicFun.debounce(initUserPreviewTable, 500)
        // key: pageNumber, value: user list
        var initialGroupUserMap = {};
        var userInfoColumns = [
            [
                {
                    field: 'userid',
                    title: 'id',
                    checkbox: true,
                    hidden: false
                },
                {
                    field: 'usrno',
                    title: '用户账号',
                    width: 150
                },
                {
                    field: 'usrname',
                    title: '用户名称',
                    width: 100
                },
                {
                    field: 'userstate',
                    title: '状态',
                    width: 50,
                    formatter: function (value){
                        return statusMap[value]
                    }
                },
                {
                    field: 'movephone',
                    title: '移动电话',
                    width: 100
                }
            ]
        ]

        /**
         *
         * @param [usrno]
         * @param [usrname]
         */
        function initUserInfoTable(usrno, usrname) {
            $(userInfoSelector).datagrid({
                url: "${baseurl}group/queryuser_result.do",
                queryParams: {
                    page: 1,
                    rows: 15,
                    "hspGrpInfCustom.grpSeq": grpSeq,
                    "dstuserCustom.usrno": usrno,
                    "dstuserCustom.usrname": usrname
                },
                columns: userInfoColumns,
                checkOnSelect: true,
                selectOnCheck: true,
                idField: "userid",
                height: 'auto',
                striped: true,
                fit: true,
                nowrap: true,
                pagination: true,
                pageNumber: 1,
                pageSize: 15,
                pageList: [15, 30, 45],
                loadFilter: function (value) {
                    return commonLoadFilter(value)
                },
                onRowContextMenu: function (e,index,row) {
                    e.preventDefault()
                },
                onLoadSuccess: function (data) {
                    var options = $(this).datagrid("options") || {}
                    var pageNumber = options.pageNumber || 1
                    var users = data && data.rows || [];
                    var groupUsers = $.grep(users, function (user) {
                        return user.grpSeq
                    })

                    if (!initialGroupUserMap[pageNumber]) {
                        initialGroupUserMap[pageNumber] = Object.freeze(groupUsers)
                    }

                    for (var i = 0; i < groupUsers.length; i++) {
                        var user = groupUsers[i];
                        $(this).datagrid('selectRecord', user.userid)
                    }
                },
                onCheck: function (index,user) {
                    dInitUserPreviewTable()
                },
                onUncheck: function (index,user) {
                    dInitUserPreviewTable()
                },
                onCheckAll: function (index,user) {
                    dInitUserPreviewTable()
                },
                onUncheckAll: function (index,user) {
                    dInitUserPreviewTable()
                },
            })
        }

        function queryUserResult() {
            var usrno = $("#usrno").val()
            var usrname = $("#usrname").val()
            $(userInfoSelector).datagrid("load",{
                page: 1,
                rows: 15,
                "dstuserCustom.usrno": usrno,
                "dstuserCustom.usrname": usrname
            })
        }

        ///////////////////////////////////////////////// User Preview /////////////////////////////////////////////////

        var userPreviewColumns = [
            [
                {
                    field: 'usrno',
                    title: '用户账号',
                    width: 150
                },
                {
                    field: 'usrname',
                    title: '用户名称',
                    width: 100
                },
                {
                    field: 'userstate',
                    title: '状态',
                    width: 50,
                    formatter: function (value){
                        return statusMap[value]
                    }
                },
                {
                    field: 'movephone',
                    title: '移动电话',
                    width: 100
                }
            ]
        ]

        function initUserPreviewTable() {
            $("#submitbtn").addClass("disabled")
            var options = $(userInfoSelector).data('datagrid')
            var rows = options && $(userInfoSelector).datagrid('getSelections') || [];
            var data = { total: 0, rows: [] }
            if (rows.length > 0) {
                data.rows = rows
                data.total = rows.length
            }

            $(userPreviewSelector).datagrid({
                data: data,
                columns: userPreviewColumns,
                idField: "userid",
                singleSelect: true,
                height: 'auto',
                striped: true,
                fit: true,
                nowrap: true,
                pagination: true,
                pageNumber: 1,
                pageSize: 15,
                pageList: [15, 30, 45],
                loadFilter: function (value) {
                    return commonLoadFilter(value)
                },
                onRowContextMenu: function (e,index,row) {
                    e.preventDefault()
                },
                onLoadSuccess: function () {
                    $("#submitbtn").removeClass("disabled")
                }
            })
        }

        function handleReloadUser() {
            $(userPreviewSelector).datagrid('reload')
        }

        function close() {
            //延迟1秒执行关闭方法
            setTimeout("parent.closemodalwindow()", 1000);
            parent.cmdrefresh();
        }


        function submit() {
            $.messager.confirm("警告", "是否确认更新？", function () {
                var willDeleteUsers = []
                var willAddUsers = []
                var allUsersData = $(userPreviewSelector).datagrid('getData') || {}
                var selectedUsers = allUsersData.rows || []

                var initialGroupUsers = computedInitialGroupUsers(initialGroupUserMap)
                // 计算将要删除得用户
                $.each(initialGroupUsers, function (_, user) {
                    const isDelete = selectedUsers.every(function (selectedUser) {
                        return selectedUser.userid !== user.userid
                    })

                    if (isDelete) {
                        willDeleteUsers.push(user)
                    }
                })

                // $.each(selectedUsers, function (_, user) {
                //     const canAdd = initialGroupUsers.every(function (initialGroupUser) {
                //         return initialGroupUser.userid !== user.userid
                //     })
                //
                //     if (canAdd) {
                //         willAddUsers.push(user)
                //     }
                // })

                Promise.all([
                    addUsers(selectedUsers),
                    willDeleteUsers.length > 0 && deleteUsers(willDeleteUsers)
                ]).then(function (ress){
                    var addRes = ress[0]
                    var deleteRes = ress[1]
                    var addSuccess = addRes ? addRes.resultInfo.type == '1' : true
                    var deleteSuccess = deleteRes ? deleteRes.resultInfo.type == '1' : true

                    if (addSuccess && deleteSuccess) {
                        $.messager.alert('成功提示', "群组用户更新成功", 'success')
                        close()
                    } else {
                        $.messager.alert('失敗信息', "群组用户更新失敗", 'error')
                    }

                }).catch(function (){
                    $.messager.alert('失敗信息', "群组用户更新失敗", 'error')
                })
            })
        }

        ///////////////////////////////////////////////////// Utils ////////////////////////////////////////////////////

        function computedInitialGroupUsers(initialGroupUserMap) {
            var __userList = []
            $.each(initialGroupUserMap, function (key, userList) {
                __userList = __userList.concat(userList)
            })
            return __userList
        }

        function addUsers(users) {
            if (!isObject(users) && !isArray(users)) return;

            var userList
            if (isArray(users)) {
                userList = users
            } else {
                userList = [users]
            }

            return $.ajax({
                type: "POST",
                url: "${baseurl}group/addusersubmit.do",
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                data: JSON.stringify({
                    hspGrpInfCustom: {
                        grpSeq: grpSeq
                    },
                    userList: userList
                })
            })
        }

        function deleteUsers(users) {
            if (!isObject(users) && !isArray(users)) return;

            var userList
            if (isArray(users)) {
                userList = users
            } else {
                userList = [users]
            }

            return $.ajax({
                type: "POST",
                url: "${baseurl}group/delusersubmit.do",
                contentType: 'application/json;charset=UTF-8',
                dataType: "json",
                data: JSON.stringify({
                    hspGrpInfCustom: {
                        grpSeq: grpSeq
                    },
                    userList: userList
                }),
            })
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

        function commonLoadFilter(value) {
            if (!value.rows || !value.total || value.total == 0) {
                value.total = 0
                value.rows = []
            }
            return value
        }

        function isObject(value) {
            return Object.prototype.toString.call(value) === '[object Object]'
        }

        function isArray(value) {
            return Object.prototype.toString.call(value) === '[object Array]'
        }

        //////////////////////////////////////////////////// Initial ///////////////////////////////////////////////////

        initUserInfoTable()
        initUserPreviewTable()
    </script>
</body>
</html>
