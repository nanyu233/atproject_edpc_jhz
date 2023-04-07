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
            <input type="text" class="input-base" id="startdate" name="startdate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly />
            --
            <input type="text" class="input-base" id="enddate"  name="enddate" onfocus="WdatePicker({dateFmt:'yyyy-MM-dd'})" readonly />
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
                width: 300
            },
            {
                field: 'noticeType',
                title: '通知方式',
                width: 100,
                formatter: function (value){
                    return NOTICE_TYPE_MAP[value]
                }
            },
            {
                field: 'yjqdUser',
                title: '通知对象',
                width: 300
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

    $(tableSelector).datagrid({
        url: "${baseurl}yjqd/queryyjqd_result.do",
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
        var cstNam = $("#cstNam").val()
        var startDate = $("#startdate").val()
        var endDate = $("#enddate").val()
        $(tableSelector).datagrid("load", {
            "hspYjqdInfCustom.cstNam": cstNam,
            "hspYjqdInfCustom.startDate": startDate,
            "hspYjqdInfCustom.endDate": endDate
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
