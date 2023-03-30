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

        .short-right {
            margin-left: 4px;
            width: 80px;
            border: 1px solid #d2d9dc;
            line-height: 19px;
            height: 19px;
            text-align: left;
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
        .gap-5 {
            gap: 5px
        }
        .gap-10 {
            gap: 10px
        }
    </style>
</head>
<body>

<form class="flex gap-10">
    <div class="flex gap-5">
        <label for="startdate">启动时间：</label>
        <input type="text" class="input-base short-right Wdate" id="startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly />
        <input type="text" class="input-base short-right Wdate" id="enddate"  name="enddate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly />
    </div>
    <div class="flex gap-5">
        <label for="cstNam">患者姓名：</label>
        <input id="cstNam" name="cstNam" type="text" class="input-base short-right" />
    </div>

    <button onclick="search()" class="search-btn">查询</button>
</form>

<table id="yjqd"></table>

<script type="application/javascript">
    var tableSelector = "#yjqd"
    var allDict = publicFun.getItem("allDict")
    var NOTICE_TYPE = allDict.NOTICE_TYPE || []
    var NOTICE_TYPE_MAP = listToMap(NOTICE_TYPE, 'infocode', 'info')

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
                    return value ? formatDate(value) : ""
                }
            },
            {
                field: 'noticeContent',
                title: '通知内容',
                width: 100
            },
            {
                field: 'noticeType',
                title: '通知方式',
                width: 50,
                formatter: function (value){
                    return NOTICE_TYPE_MAP[value]
                }
            },
            {
                field: 'yjqdUser',
                title: '通知对象',
                width: 100
            },
            {
                field: 'crtUserName',
                title: '创建用户',
                width: 100
            },
            {
                field: 'crtTime',
                title: '创建时间',
                width: 100,
                formatter: function (value){
                    return value ? formatDateTime(value) : ""
                }
            }
        ]
    ]

    $(tableSelector).datagrid({
        url: "${baseurl}yjqd/queryyjqd_result.do",
        queryParams: {
            page: 1,
            rows: 15,
            "hspYjqdInfCustom.cstNam": "",
            "hspYjqdInfCustom.startDate": "",
            "hspYjqdInfCustom.endDate": ""
        },
        columns: columns,
        checkOnSelect: true,
        selectOnCheck: true,
        idField: "yjqdSeq",
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
        }
    })

    function search() {
        $(tableSelector).datagrid("reload", {
            page: 1,
            rows: 15,
            "hspYjqdInfCustom.cstNam": $("#cstNam").val(),
            "hspYjqdInfCustom.startDate": $("#startdate").val(),
            "hspYjqdInfCustom.endDate": $("#enddate").val()
        })
    }

    function commonLoadFilter(value) {
        if (!value.total || value.total == 0) {
            value.rows = [{ __handle: false }]
        }
        return value
    }

    function formatDateTime(value) {
        return publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss')
    }

    function formatDate(value) {
        return publicFun.timeFormat(value, 'yyyy-MM-dd')
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
