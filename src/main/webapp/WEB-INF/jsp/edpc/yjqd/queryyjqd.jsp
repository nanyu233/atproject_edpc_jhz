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
</head>
<body>

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
                checkbox: true,
                hidden: false
            },
            {
                field: 'regSeq',
                title: '患者序号',
                width: 150
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
                field: 'noticeType',
                title: '通知方式',
                width: 50,
                formatter: function (value){
                    return NOTICE_TYPE_MAP[value]
                }
            },
            {
                field: 'crtUser',
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
            },
            {
                field: 'noticeContent',
                title: '通知内容',
                width: 100
            },
            {
                field: 'cstNam',
                title: '患者姓名',
                width: 100
            },
            {
                field: 'yjqdUser',
                title: '通知对象',
                width: 100
            },
            {
                field: 'crtUserName',
                title: '创建用户姓名',
                width: 100
            }
        ]
    ]

    $(tableSelector).datagrid({
        url: "${baseurl}yjqd/queryyjqd_result.do",
        queryParams: {
            page: 1,
            rows: 15,
            "hspYjqdInfCustom.cstNam": "grpSeq",
            "hspYjqdInfCustom.startDate": "usrno",
            "hspYjqdInfCustom.endDate": "usrname"
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

    function commonLoadFilter(value) {
        if (!value.total || value.total == 0) {
            value.rows = [{ __handle: false }]
        }
        return value
    }

    function formatDateTime(value) {
        return publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss')
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
