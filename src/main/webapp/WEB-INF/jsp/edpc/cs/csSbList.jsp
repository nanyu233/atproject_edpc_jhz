<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%--<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>--%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'csSbList.jsp' starting page</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script type="text/javascript" src="js/edpc/crfplane/crfplane.js"></script>
    <style>
        .form {
            border: 1px solid #eeeeee;
            width: 99%;

        }

        .form .form_item {
            display: flex;
            justify-content: flex-start;
        }

        .form_item .row {
            margin: 5px 0 5px 0;
        }

        .row label {
            display: inline-block;
            /* width: 90px; */
            text-align: right;
            margin-left: 10px;
            font-size: 12px;
        }

        .row input,
        .row select {
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

        .row .search-btn {
						cursor: pointer;
						width: 80px;
            font-size: 12px;
            border-radius: 5px;
            color: #fff;
            background-color: #428bca;
            border-color: #357ebd;
            height: 24px;
            text-align: center;
            line-height: 24px;
						vertical-align: middle;
						margin-left: 10%;
        }

        table .btn {
            display: inline-block;
            height: 18px;
            padding: 2px 10px;
            /*border: 1px solid black;*/
            border-radius: 5px;
            margin: 3px;
            color: #ffffff;
            cursor: pointer;
        }

        table .detail {
            background: #428bca;
        }

        table .Timeline {
            background: #428bca;
            /* background:darkseagreen; */
        }

        table .del {
            background: red;
        }

        .pagination-page-list {
            width: 45px;
        }

        .datagrid-wrap {
            position: relative;
        }

        .datagrid-pager {
            /* position: fixed; */
            /* position: absolute; */
            height: auto;
            /* bottom: 0; */
            width: 100%;
        }

        .datagrid-body {
            overflow: auto;
        }
    </style>
</head>

<body>
<div id="form" class="form">
    <div class="form_item">
        <div class="row">
            <label>登记时间：</label>
            <input type="input" style="width: 30%;" class="input-date Wdate" ref="startdate"
                   onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" v-model="queryParams.startdate"/>-
            <input type="input" style="width: 30%;" class="input-date Wdate" ref="enddate"
                   onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" v-model="queryParams.enddate"/>
        </div>
        <div class="row">
            <select @change="optionChange" style="width: 35%">
                <option>姓名</option>
                <option>就诊卡号</option>
            </select>
            <input type="text" style="width: 60%" placeholder="请输入姓名" v-if="mainValue === 0"
                   v-model="queryParams.cstNam">
            <input type="text" style="width: 60%" placeholder="请输入就诊卡号" v-else v-model="queryParams.vstCad">
        </div>
        <div class="row">
					<div class="search-btn" @click="search()">查询</div>
            <!-- <input type="button" class="search-btn" @click="search" value="查询" style="cursor: pointer"> -->
        </div>
    </div>
    <table id="dg"></table>
</div>

</body>
<script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
<script type="text/javascript">
    var vm = new Vue({
        el: '#form',
        data: {
            mainValue: 0,
            queryParams: {
                cstNam: '',
                vstCad: '',
                startdate: publicFun.timeFormat(new Date(), 'yyyy/MM/dd'),
                enddate: publicFun.timeFormat(new Date(), 'yyyy/MM/dd')
            }
        },
        mounted() {
            var height = 0.945 * ($("#tabs", parent.document).height() - 34 - 18);
            $("#dg").height(height);
            var czCbzdCodList = publicFun.getItem("allDict").CZ_CBZD_COD;
            $('#dg').datagrid({
                url: 'cs/getCsPatientList.do',
                queryParams: this.queryParams,
                striped: true,
                singleSelect: true,
                pagination: true,
                rownumbers: true,
                pageList: [20, 30, 50],
                columns: [[
                    {
                        field: 'cstNam',
                        title: '姓名',
                        width: this.setWidth(0.05)
                    },
                    {
                        field: 'cstSexCod',
                        title: '性别',
                        width: this.setWidth(0.02),
                        formatter: function (value, row, index) {
                            if (value == 0) {
                                return '男'
                            } else if (value == 1) {
                                return '女'
                            }
                        }
                    },
                    {
                        field: 'cstAge',
                        title: '年龄',
                        width: this.setWidth(0.03),
                        formatter: function (value, row, index) {
                            return value == null ? '-' : value + '岁';
                        }
                    },
                    {
                        field: 'regTim',
                        title: '登记时间',
                        width: this.setWidth(0.07),
                        formatter: function (value, row, index) {
                            return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm:ss');
                        }
                    },
                    {
                        field: 'fbsj',
                        title: '发病时间',
                        width: this.setWidth(0.1),
                        formatter: function (value, row, index) {
                            if (value) {
                                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm:ss');
                            }
                        }
                    },
                    {
                        field: 'jbzdDes',
                        title: '诊断',
                        width: this.setWidth(0.07),
                        formatter: function (value, row, index) {
                            return publicFun.codingEscape(czCbzdCodList, value);
                        }
                    }, {
                        field: 'rcdSta',
                        title: '审核状态',
                        width: this.setWidth(0.04),
                        formatter: function (value, row, index) {
                            if (value == 1) {
                                return '记录中'
                            } else if (value == 2) {
                                return '审核中'
                            } else if (value == 3) {
                                return '被驳回'
                            } else if (value == 4) {
                                return '已审核'
                            }
                        }
                    }, {
                        field: 'chkTim',
                        title: '审核时间',
                        width: this.setWidth(0.07),
                        formatter: function (value, row, index) {
                            if (value) {
                                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
                            }
                            return "";
                        }
                    }, {
                        field: 'chkNam',
                        title: '审核人',
                        width: this.setWidth(0.04)
                    }, {
                        field: 'chkMsg',
                        title: '审核意见',
                        width: this.setWidth(0.04)
                    }, {
                        field: 'smtSta',
                        title: '上报状态',
                        width: this.setWidth(0.038),
                        formatter: function (value, row, index) {
                            if (value == 1) {
                                return '未上报'
                            } else if (value == 2) {
                                return '上报中'
                            } else if (value == 3) {
                                return '上报失败'
                            } else if (value == 4) {
                                return '上报驳回'
                            } else if (value == 5) {
                                return '上报完成'
                            }
                        }
                    }, {
                        field: 'smtTim',
                        title: '上报时间',
                        width: this.setWidth(0.07),
                        formatter: function (value, row, index) {
                            if (value) {
                                return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
                            }
                            return "";
                        }
                    }, {
                        field: 'smtSeq',
                        title: '填报编号',
                        width: this.setWidth(0.05)
                    }, {
                        field: 'smtMsg',
                        title: '上报信息',
                        width: this.setWidth(0.06)
                    }, {
                        field: 'dd',
                        title: '操作',
                        width: this.setWidth(0.2),
                        formatter: function (value, row, index) {
                            var _html = '<span class="btn detail" onclick="toDetail(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">查看</span>' +
                                '<span class="btn Timeline" onclick="toCpcTimeline(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">时间轴</span>' +
                                '<span class="btn Timeline" onclick="toAisiss(\'' + row.emgSeq + '\',\'' + row.cstNam + '\',\'' + row.wayTyp + '\',\'' + row.regSeq + '\')">AIS/ISS</span>';

                            if ("1" == row.rcdSta || "3" == row.rcdSta) {
                                _html += '<span class="btn detail" onclick="reviewApply(\'' + row.regSeq + '\',\'' + row.rcdSta + '\')">申请审核</span>'
                            } else if ("2" == row.rcdSta) {
                               /* _html += '<span class="btn detail" onclick="skipChkPage(\'' + row.regSeq + '\')">审核</span>'*/
                                _html += '<span class="btn detail" onclick="chkConfirm(\'' + row.regSeq + '\')">审核</span>'
                            }
                            if ("4" == row.rcdSta) {
                                _html += '<span class="btn detail" onclick="chkRowBak(\'' + row.regSeq + '\',\'' + row.smtSta + '\')">解锁</span>'
                                _html += '<span class="btn detail" onclick="smtPort(\'' + row.regSeq + '\',\'' + row.smtSta + '\',\'' + row.patTyp + '\')">上报</span>'
                            }
                            return _html
                        }
                    }
                ]]
            });
        },
        methods: {
            search() {
                this.queryParams.startdate = this.$refs.startdate.value
                this.queryParams.enddate = this.$refs.enddate.value
                $('#dg').datagrid('load', this.queryParams)
            },
            optionChange(e) {
                this.queryParams.cstNam = ''
                this.queryParams.vstCad = ''
                for (var i of e.target) {
                    if (i.selected === true) {
                        if (i.innerText == '姓名') {
                            this.mainValue = 0
                        } else {
                            this.mainValue = 1
                        }

                    }
                }
            },
            setWidth(pct) {
							var pWidth = $('body').width();
							return Math.round(pct * pWidth);
            }
        }
    })

    function toDetail(emgSeq, cstNam, wayTyp, regSeq) {
        var url = 'cs/toCsSbDtlPage.do?emgSeq=' + emgSeq + '&regSeq=' + regSeq;
        window.top.addTab(cstNam + "-" + '创伤患者详情', url, 'icon icon-emergency-record');
    }

    function toCpcTimeline(emgSeq, cstNam, wayTyp, regSeq) {
        var url = 'cs/toCsTimeline.do?emgSeq=' + emgSeq  + '&regSeq=' + regSeq;
        window.top.addTab(cstNam + "-" + '创伤急救时间轴', url, 'icon icon-emergency-record');
    }

    function toAisiss(emgSeq, cstNam, wayTyp, regSeq) {
        createmodalwindow(cstNam + "AIS/ISS", 950, 685, '${baseurl}cs/toAisIss.do?emgSeq=' + emgSeq + '&regSeq=' + regSeq);
    }


</script>
</html>