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

        html, body {
            width: 100%;
            height: 100%;
        }

        body {
            display: flex;
            flex-direction: column;
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
        .gap-30 {
            gap: 30px
        }
    </style>
</head>
<body class="flex flex-col">
    <div class="flex-1 flex flex-col">
        <div id="userInfoForm" class="flex-none flex gap-30">
            <div>
                <label>
                    用户账号：
                    <input id="usrno" name="usrno" />
                </label>
            </div>
            <div>
                <label>
                    用户名称：
                    <input id="usrname" name="usrname" />
                </label>
            </div>
            <div>
                <button onclick="queryUserResult()">查询</button>
            </div>
        </div>
        <table id="user-info">

        </table>
    </div>

    <div class="flex-1 flex flex-col">
        <table id="user-preview">

        </table>
    </div>


    <script type="text/javascript">
        var grpSeq = '${grpSeq}'
        var allDict = publicFun.getItem("allDict")
        var statusMap = { "0": "无效", "1": "有效" }
        var grpTypeMap = listToMap(allDict.GRP_TYPE, 'infocode', 'info')

        var userInfoSelector = '#user-info'
        var userPreviewSelector = '#user-preview'

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
                    // formatter: function (value){
                    //     return statusMap[value]
                    // }
                },
                {
                    field: 'movephone',
                    title: '移动电话',
                    width: 100
                },
                {
                    field: '__handle',
                    title: '操作',
                    width: 50,
                    formatter: function (value, row, index) {
                        if (value === false) return '';
                        if (value === '0') return "<span class='url-link'><a href=javascript:deleteUsers('" + JSON.stringify(row) + "')>删除</a></span>"
                        return "<span class='url-link'><a href=javascript:addUsers('" + JSON.stringify(row) + "')>添加</a></span>"
                    }
                }
            ]
        ]

        function addUsers(users) {
            users = typeof users === 'string' ? JSON.parse(users) : users;
            if (!isObject(users) || !isArray(users)) return;

            var userList
            if (isArray(users)) {
                userList = users
            } else {
                userList = [users]
            }

            $.ajax({
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
            users = typeof users === 'string' ? JSON.parse(users) : users;
            if (!isObject(users) || !isArray(users)) return;

            var userList
            if (isArray(users)) {
                userList = users
            } else {
                userList = [users]
            }

            $.ajax({
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

        /**
         *
         * @param [usrno]
         * @param [usrname]
         */
        function initUserInfoTable(usrno, usrname) {
            $(userInfoSelector).datagrid({
                url: "${baseurl}user/queryuser_result.do.do",
                queryParams: {
                    page: 1,
                    rows: 15,
                    "dstuserCustom.usrno": usrno,
                    "dstuserCustom.usrname": usrname
                },
                columns: userInfoColumns,
                checkOnSelect: true,
                selectOnCheck: true,
                idField: "userno",
                height: 'auto',
                fit: true ,
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
                onCheck: function (index, row) {

                }
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
            $(userPreviewSelector).datagrid({
                url: "${baseurl}group/queryuserbygroup_result.do",
                queryParams: {
                    page: 1,
                    rows: 15,
                    "hspGrpInfCustom.grpSeq": grpSeq
                },
                columns: userPreviewColumns,
                idField: "userno",
                singleSelect: true,
                height: 'auto',
                fit: true ,
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
                onLoadSuccess: function (res) {
                    if (res && res.rows && res.rows.length > 0) {
                        $.each(res.rows, function (_, user) {
                            $(userInfoSelector).datagrid('selectRecord', user.userid)
                        })
                    }
                }
            })
        }

        function handleReloadUser() {
            $(userPreviewSelector).datagrid('reload')
        }

        ///////////////////////////////////////////////////// Utils ////////////////////////////////////////////////////

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
            if (!value.total || value.total == 0) {
                value.rows = [{ __handle: false }]
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
