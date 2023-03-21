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

        .table-container {
            flex: 1;
        }
    </style>
</head>
<body>
    <div class="table-container">
        <table id="group-info">

        </table>
    </div>

    <div class="table-container">
        <table id="group-user">

        </table>
    </div>

    <script type="application/javascript">
        var allDict = publicFun.getItem("allDict")
        var initBtnUrl = '${baseurl}btnload.do?moduleid=${moduleid}'
        var statusMap = { "0": "无效", "1": "有效" }
        var grpTypeMap = listToMap(allDict.GRP_TYPE, 'infocode', 'info')

        var groupOperation;
        var groupSelector = '#group-info'
        var userSelector = '#group-user'
        var dInitUserTable = publicFun.debounce(initUserTable, 300)

        var groupColumns = [
            [
                {
                    field: 'grpSeq',
                    title: 'id',
                    hidden: true
                },
                {
                    field: 'grpName',
                    title: '群组名称',
                    width: 100
                },
                {
                    field: 'grpType',
                    title: '群组类型',
                    width: 100,
                    formatter: function (value){
                        return grpTypeMap[value]
                    }
                },
                {
                    field: 'isenable',
                    title: '状态',
                    width: 50,
                    formatter: function (value){
                        return statusMap[value]
                    }
                },
                {
                    field: 'crtUserName',
                    title: '创建用户',
                    width: 100
                },
                {
                    field: 'crtTime',
                    title: '创建时间',
                    sortable: true,
                    width: 150,
                    formatter: function (value){
                        return formatDateTimeHasSec(value)
                    }
                },
                {
                    field: 'modUserName',
                    title: '修改用户',
                    width: 100
                },
                {
                    field: 'modTime',
                    title: '修改时间',
                    width: 150,
                    sortable: true,
                    formatter: function (value){
                        return formatDateTimeHasSec(value)
                    }
                },
                {
                    field: 'showorder',
                    title: '排序',
                    width: 50,
                    sortable: true
                },
                {
                    field: 'remark',
                    title: '备注',
                    width: 200
                },
            ]
        ]

        function initGroupTable(toolbar) {
            $(groupSelector).datagrid({
                url: "group/querygroup_result.do",
                queryParams: {
                    page: 1,
                    rows: 15
                },
                columns: groupColumns,
                toolbar: toolbar,
                idField: "grpSeq",
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
                onLoadSuccess: function (res) {
                    var selectedRow = $(this).datagrid('getSelected')
                    if (selectedRow && selectedRow.grpSeq) {
                        var selectedIndex = $(this).datagrid('getRowIndex', selectedRow.grpSeq)
                        $(this).datagrid("selectRow", selectedIndex)
                    } else {
                        $(this).datagrid("selectRow", 0)
                    }
                },
                onRowContextMenu: function (e,index,row) {
                    e.preventDefault()
                },
                onSelect: function (index,row) {
                    dInitUserTable()
                }
            })
        }

        function cmdaddgroup() {
            console.log("handleAddGroup")
            groupOperation = 'addgroup'
            openGroupEditWindow("群组添加")
        }

        function cmdeditgroup() {
            var info = $(groupSelector).datagrid('getSelected')
            if (!info) {
                $.messager.alert('提示信息', "未选中群组", 'warning')
                return
            }
            groupOperation = 'editgroup'
            console.log('handleEditGroup', info)
            openGroupEditWindow("群组修改", info.grpSeq)
        }

        function cmddelgroup() {
            var info = $(groupSelector).datagrid('getSelected')
            if (!info) {
                $.messager.alert('提示信息', "未选中群组", 'warning')
                return
            }
            groupOperation = 'delgroup'
            deleteGroupBySeq(info.grpSeq, info.grpName)
        }

        function cmdgroupdetail() {
            var info = $(groupSelector).datagrid('getSelected')
            if (!info) {
                $.messager.alert('提示信息', "未选中群组", 'warning')
                return
            }
            groupOperation = 'groupdetail'
            openGroupEditWindow("群组详情", info.grpSeq)
        }

        function cmdadduser() {
            var info = $(groupSelector).datagrid('getSelected')
            if (!info) {
                $.messager.alert('提示信息', "未选中群组", 'warning')
                return
            }
            openAddUserWindow("群组用户管理", info.grpSeq)
        }

        function cmdrefresh() {
            $(groupSelector).datagrid('reload')
            $(userSelector).datagrid('reload')
        }

        function deleteGroupBySeq(grpSeq, grpName) {
            if (!grpSeq) return;
            $.messager.confirm('警告', "是否确认删除 " + grpName + "？", function (confirmed) {
                if (confirmed) {
                    $.ajax({
                        type: 'POST',
                        url: '${baseurl}group/delgroupsubmit.do',
                        data: {
                            "hspGrpInfCustom.grpSeq": grpSeq
                        },
                        success: function (res) {
                            if (res.resultInfo.type == '1') {
                                cmdrefresh()
                            } else {
                                $.messager.alert('提示信息', "删除失败", 'warning')
                            }
                        }
                    })
                }
            })
        }

        ////////////////////////////////////////////////// Group User //////////////////////////////////////////////////

        var userColumns = [
            [
                {
                    field: 'userid',
                    title: 'id',
                    hidden: true
                },
                {
                    field: 'usrno',
                    title: '用户账号',
                    width: 150,
                    sortable: true
                },
                {
                    field: 'usrname',
                    title: '用户名称',
                    width: 100,
                    sortable: true
                },
                {
                    field: 'userstate',
                    title: '状态',
                    width: 50,
                    sortable: true,
                    formatter: function (value){
                        return statusMap[value]
                    }
                },
                {
                    field: 'movephone',
                    title: '移动电话',
                    width: 100,
                    sortable: true
                },
                {
                    field: '__handle',
                    title: '操作',
                    width: 50,
                    formatter: function (value, row, index) {
                        if (value === false) return '';
                        return "<span class='url-link'><a href=javascript:void(0)>删除</a></span>"
                    }
                }
            ]
        ]

        function initUserTable() {
            var options = $(groupSelector).data('datagrid')
            // 判断group table是否初始化，第一次进页面initUserTable会报错，
            // 下面初始化部分initUserTable()已经删除了，不过这个逻辑先加上
            var info = options ? $(groupSelector).datagrid('getSelected') : null;

            var datagridOptions = {
                columns: userColumns,
                toolbar: [
                    {
                        text: '刷新',
                        iconCls: 'icon-reload',
                        handler: function () {
                            $(userSelector).datagrid('reload')
                        }
                    }
                ],
                idField: "userid",
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
                onClickRow: function (index, row) {
                    datagridUnselectAbility(this, index, row)
                },
                onClickCell: function (index, field, value) {
                    if (field === '__handle' && value !== false) {
                        var groupInfo = $(groupSelector).datagrid('getSelected')
                        var rows = $(this).datagrid('getRows')
                        var user = rows[index]
                        deleteUser(groupInfo.grpSeq, user)
                    }
                }
            }

            if (info && info.grpSeq) {
                datagridOptions.url = "${baseurl}group/queryuserbygroup_result.do"
                datagridOptions.queryParams = {
                    page: 1,
                    rows: 15,
                    "hspGrpInfCustom.grpSeq": info.grpSeq
                }
            } else {
                datagridOptions.data = {
                    total: 0
                }
            }

            $(userSelector).datagrid(datagridOptions)
            $(userSelector).data('groupInfo', info || null)
        }

        function deleteUser(grpSeq, user) {
            if (!grpSeq) return;
            if (!isObject(user)) return;

            $.messager.confirm('警告', "是否确认删除用户：" + user.usrname + "？", function (confirmed) {
                if (confirmed) {
                    $.ajax({
                        type: "POST",
                        url: "${baseurl}group/delusersubmit.do",
                        contentType: 'application/json;charset=UTF-8',
                        dataType: "json",
                        data: JSON.stringify({
                            hspGrpInfCustom: {
                                grpSeq: grpSeq
                            },
                            userList: [user]
                        }),
                        success: function (res) {
                            if (res.resultInfo.type == '1') {
                                $(userSelector).datagrid('reload')
                            } else {
                                $.messager.alert('提示信息', "删除失败", 'warning')
                            }
                        }
                    })
                }
            })
        }

        ///////////////////////////////////////////////////// Utils ////////////////////////////////////////////////////

        function isObject(value) {
            return Object.prototype.toString.call(value) === '[object Object]'
        }

        function isArray(value) {
            return Object.prototype.toString.call(value) === '[object Array]'
        }

        function formatDateTimeHasSec(value) {
            return publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss')
        }

        /**
         * datagrid 单选可取消 在`onClickRow`事件中使用
         *
         * @param context DataGrid Context (JQuery | Selector)
         * @param index
         * @param row
         *
         * @example
         * $('#table1').datagrid({
         *     // ...
         *     singleSelect: true,
         *     idField: 'usrno',
         *     onClickRow: function (index, row) {
         *         datagridUnselectAbility(this, row)
         *     }
         * })
         */
        function datagridUnselectAbility (context, index, row) {
            if (!context) throw new Error('context 不能为空')
            var options = $(context).datagrid('options')
            var idField = options.idField || 'id'
            var selectedRow = $(context).data("__selectedRow") // 获取选中的行尽量不要使用这个
            // fix: selectedRow[idField] 和 row[idField] 必须存在
            // idField 设置的userno 实际上是 usrno, 判断条件`selectedRow[idField] === row[idField]`始终是相等的 会取消当前应该选中的
            if (selectedRow && selectedRow[idField] == null) {
                console.warn('请检查datagrid idField是否设置正确')
            }
            if (
                selectedRow &&
                selectedRow[idField] &&
                row[idField] &&
                (selectedRow[idField] === row[idField])) {
                $(context).datagrid('unselectRow', index);
                $(context).data("__selectedRow", null)
            } else {
                $(context).data("__selectedRow", row)
            }
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

        function openGroupEditWindow(title, grpSeq) {
            title = title || ''
            grpSeq = grpSeq || ''
            createmodalwindow(title, 600, 300, '${baseurl}group/editgroup.do?grpSeq=' + grpSeq);
        }

        function openAddUserWindow(title, grpSeq) {
            title = title || ''
            if (!grpSeq) {
                $.messager.alert('提示信息', "未选中群组", 'warning')
                return
            }
            createmodalwindow(title, 600, 600, '${baseurl}group/adduser.do?grpSeq=' + grpSeq);
        }

        function commonLoadFilter(value) {
            if (!value.total || value.total == 0) {
                value.rows = [{ __handle: false }]
            }
            return value
        }

        //////////////////////////////////////////////////// Initial ///////////////////////////////////////////////////

        publicFun.ajaxVal('${moduleid}', null, initGroupTable);
        // GroupTable 会默认选中第一行 在`onSelect`事件中初始化 UserTable
    </script>
</body>
</html>
