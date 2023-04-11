<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <base href="${baseurl}" >
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>一键启动</title>
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
           padding: 8px;
        }

        .container {
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            border: 1px solid #eeeeee;
            border-radius: 5px;
            padding: 5px;
        }

        .table {
            flex: 1;
        }

        .form-container {
            display: flex;
            gap: 2px 20px;
            padding: 5px 0;
            align-items: center;
            flex-flow: row wrap;
        }

        .form-control {
            flex: none;
        }

        .form-control input,
        .form-control select {
            height: 24px;
            padding: 3px 3px;
            font-size: 12px;
            line-height: 24px;
            color: #555;
            vertical-align: middle;
            background-color: #fff;
            background-image: none;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .search-btn {
            cursor: pointer;
            width: 80px;
            font-size: 12px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 24px;
            text-align: center;
            line-height: 1.5;
            vertical-align: middle;
        }
    </style>
</head>
<body>

<div class="container">
    <form class="form-container">
        <div class="form-control clr">
            <label for="startdate">启动时间：</label>
            <input type="text" class="input-base" id="startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly />
            --
            <input type="text" class="input-base" id="enddate"  name="enddate" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly />
        </div>
        <div class="form-control clr">
            <label for="cstNam">患者姓名：</label>
            <input id="cstNam" name="cstNam" type="text" class="input-base" />
        </div>

        <div class="form-control clr">
            <button onclick="search()" type="button" class="search-btn">查询</button>
        </div>
    </form>

    <div class="table">
        <table id="yjqd"></table>
    </div>
</div>

<script type="application/javascript">
    var tableSelector = "#yjqd"
    var allDict = publicFun.getItem("allDict")
    var NOTICE_TYPE = allDict.NOTICE_TYPE || []
    var NOTICE_TYPE_MAP = listToMap(NOTICE_TYPE, 'infocode', 'info')

    var DAY_TIMESTAMP = 24 * 60 * 60 * 1000
    var YESTERDAY = formatDate(new Date().getTime() - DAY_TIMESTAMP)
    var TODAY = formatDate(new Date().getTime())

    var dInitTable = publicFun.debounce(initTable, 100)

    $("#startdate").val(YESTERDAY)
    $("#enddate").val(TODAY)

    var columns = [
        [
            {
                field: 'yjqdSeq',
                title: 'id',
                hidden: true
            },
            {
                field: 'cstNam',
                title: '患者姓名',
                width: 100
            },
            {
                field: 'yjqdTime',
                title: '启动时间',
                width: 140,
                formatter: function (value){
                    return value ? formatDateTime(value) : ""
                }
            },
            {
                field: 'noticeContent',
                title: '通知内容',
                width: 400
            },
            {
                field: 'noticeType',
                title: '通知方式',
                width: 100,
                formatter: function (value){
                    var noticeTypeList = (value || '').split(',').map(function (value) {
                        return NOTICE_TYPE_MAP[value]
                    })
                    return noticeTypeList.join('，')
                }
            },
            {
                field: 'yjqdUser',
                title: '通知对象',
                width: 400
            },
            {
                field: 'crtUserName',
                title: '创建用户',
                width: 100
            },
            {
                field: 'crtTime',
                title: '创建时间',
                width: 140,
                formatter: function (value){
                    return value ? formatDateTime(value) : ""
                }
            }
        ]
    ]

    function initTable() {
        $(tableSelector).datagrid({
            url: "${baseurl}yjqd/queryyjqd_result.do",
            queryParams: {
                "hspYjqdInfCustom.cstNam": $("#cstNam").val(),
                "hspYjqdInfCustom.startDate": $("#startdate").val(),
                "hspYjqdInfCustom.endDate": $("#enddate").val()
            },
            columns: columns,
            singleSelect: true,
            checkOnSelect: true,
            selectOnCheck: true,
            idField: "yjqdSeq",
            height: 'auto',
            striped: true,
            fit: true,
            nowrap: false,
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
            }
        })
    }

    function search() {
        $(tableSelector).datagrid("load", {
            "hspYjqdInfCustom.cstNam": $("#cstNam").val(),
            "hspYjqdInfCustom.startDate": $("#startdate").val(),
            "hspYjqdInfCustom.endDate": $("#enddate").val()
        })
    }

    function reload() {
        $(tableSelector).datagrid('reload', {
            "hspYjqdInfCustom.cstNam": $("#cstNam").val(),
            "hspYjqdInfCustom.startDate": $("#startdate").val(),
            "hspYjqdInfCustom.endDate": $("#enddate").val()
        })
    }

    function commonLoadFilter(value) {
        if (!value.rows || !value.total || value.total == 0) {
            value.total = 0
            value.rows = []
        }
        return value
    }

    function formatDateTime(value) {
        return publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss')
    }

    function formatDate(value) {
        return publicFun.timeFormat(value, 'yyyy/MM/dd')
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
     *         datagridUnselectAbility(this, index, row)
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

    initTable()

    $(window).resize(function() {
        dInitTable()
    })
</script>
</body>
</html>
