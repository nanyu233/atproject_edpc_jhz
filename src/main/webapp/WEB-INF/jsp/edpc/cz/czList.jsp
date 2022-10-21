    <%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
    <%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
        <% String path=request.getContextPath(); String basePath=request.getScheme() + "://" + request.getServerName()
			+ ":" + request.getServerPort() + path + "/" ; %>

            <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
            <html>
            <head>
                <base href="<%=basePath%>">
                <title>卒中患者列表</title>
                <link rel="stylesheet" type="text/css" href="css/edpc/flow.css">
                <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
                <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
                <link rel="stylesheet" type="text/css" href="css/hems/global.css">
                <link rel="stylesheet" type="text/css" href="css/common/querylist.css" />
                <script type="text/javascript" src="lib/moment.min.js"></script>
                <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
                <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
                <script type="text/javascript" src="lib/raphael-min.js"></script>
                <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
                <script type="text/javascript" src="js/public.js"></script>
                <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
                <script>
                    var _emgSeq='';
                </script>
                <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
                <style>

                    .form {
                        border: 1px solid #eeeeee;
                        width: 100%;
                        position: relative;
                    }

                    .form input,
                    .form select {
                        width: 120px;
                        height: 34px;
                        padding: 3px 3px;
                        font-size: 14px;
                        line-height: 1.428571429;
                        color: #555;
                        vertical-align: middle;
                        background-color: #fff;
                        background-image: none;
                        border: 1px solid #ccc;
                        border-radius: 4px;
                    }

                    .form .search-btn {
                        cursor: pointer;
                        width: 140px;
                        border-radius: 5px;
                        color: #fff;
                        background-color: #428bca;
                        border-color: #357ebd;
                        height: 32px;

                    }

                    .form span {
                        margin-right: 60px;
                    }
                    .active {
                        background: #428bca !important;
                        color: #ffffff !important;
                    }

                    table .btn {
                        display: inline-block;
                        padding: 2px 10px;
                        /*border: 1px solid black;*/
                        border-radius: 5px;
                        margin: 3px;
                        color: #ffffff;
                    }

                    table .detail {
                        background: #428bca;
                    }
                    table .Timeline{
                        background: #428bca;
                        /* background:darkseagreen; */
                    }
                    table .del {
                        background: red;
                    }
                    .pagination-page-list{
                        width:45px;
                    }
                    .datagrid-wrap{
                        position:relative;
                    }
                    .datagrid-pager{
                        position:absolute;
                        bottom:0;
                        width:100%;
                    }
                </style>

            </head>
            <body ms-controller="czlist" id="container">
                <div class="form">
                    <div style="padding: 10px">
                        <span>
                            姓名： <input type="text" placeholder="请输入姓名" ms-duplex-string="searchParam.cstNam">
                        </span>
                        <span>
                            预检时间：
                           <input type="input" ms-duplex-string="searchParam.startdate" value="${startdate }" class="input-date Wdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" />-
                           <input type="text" ms-duplex-string="searchParam.enddate" value="${enddate }" class="input-date Wdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" />
                        </span>
                        <span>
                            诊断：
                           <select name="zd" ms-duplex="searchParam.zd">
							 <option value="">全部</option>
							 <option ms-repeat="searchParam.czCbzdCodList" ms-attr-value="el.infocode">{{el.info}}
							 </option>
						   </select>
                        </span>
                        <span>
                            诊断医生：
                            <input type="text" placeholder="请输入姓名" ms-duplex-string="searchParam.zdys">
                        </span>
                        <input type="button" class="search-btn" onclick="search()" value="查询">

                    </div>
                </div>
                <table id="cztable"></table>
                <jsp:include page="/WEB-INF/jsp/edpc/cz/czhcb.jsp"></jsp:include>
            </body>

            <script type="text/javascript">
                var height = $('#container').height();
                var czCbzdCodList = [];
                //设置表格的列宽
                //pct --- 百分比（取小于1的小数）
                function setWidth(pct) {
                    var pWidth = $('.form').width();
                    if (pct < 1 && pct >= 0) {
                        return pWidth * pct;
                    } else {
                        return undefined;
                    }
                }
                var vm = avalon.define({
                    $id: 'czlist',
                    searchParam: {
                        czCbzdCodList: [],
                        startdate: '',
                        enddate: '',
                        cstNam: '',
                        zdys: '',
                        zd: ''
                    }
                });

                function search() {
                    var queryParams = $('#cztable').datagrid('options').queryParams;
                    queryParams['cstNam'] = vm.searchParam.cstNam;
                    queryParams['zd'] = vm.searchParam.zd;
                    queryParams['zdys'] = vm.searchParam.zdys;
                    queryParams['startDate'] = vm.searchParam.startdate;
                    queryParams['endDate'] = vm.searchParam.enddate;
                    $("#cztable").datagrid('reload');
                    console.log( vm.searchParam.cstNam,vm.searchParam.zd, vm.searchParam.zdys, queryParams['startdate'],queryParams['enddate'])
                }

                function toCzTimeline(emgSeq, cstNam, wayTyp) {
                    var url = 'cz/toCzTimeline.do?emgSeq=' + emgSeq + '&wayTyp=' + wayTyp;
                    if (cstNam == 'null') {
                        cstNam = "";
                    }
                    window.top.addTab(cstNam + "-" + '卒中急救时间轴', url, 'icon icon-emergency-record');
                }
                function printCzhcb(emgSeq, cstNam, wayTyp) {
                    getCzhcbInfo(emgSeq)

                }

                function toDetail(emgSeq, cstNam) {
                    var url = 'cz/toCzxqPage.do?emgSeq=' + emgSeq + '&wayTyp=0';
                    if (cstNam == 'null') {
                        cstNam = "";
                    }
                    window.top.addTab(cstNam + "-" + '卒中患者详情', url, 'icon icon-emergency-record');
                }

                $(function() {
                    var h3 = height - 56;
                    $("#cztable").height(h3);
                    $('.datagrid-wrap').height(h3)
                    vm.searchParam.czCbzdCodList = publicFun.getItem("allDict").CZ_CBZD_COD;
                    czCbzdCodList = publicFun.getItem("allDict").CZ_CBZD_COD;
                    vm.searchParam.startdate = "${startdate}";
                    vm.searchParam.enddate = "${enddate}";
                    $('#cztable').datagrid({
                        url: '${baseurl}cz/getCzPatientList.do',
                        queryParams: {
                            'cstNam': vm.searchParam.cstNam,
                            'zd': vm.searchParam.zd,
                            'zdys': vm.searchParam.zdys,
                            'startDate': vm.searchParam.startdate,
                            'endDate': vm.searchParam.enddate
                        },
                        striped: true,
                        singleSelect: true,
                        pagination: true,
                        rownumbers: true,
                        pageList: [20, 30, 50],
                        columns: [
                            [{
                                field : 'smtSeq',
                                title : '填报编号',
                                width : setWidth(0.1)
                            }, {
                                field : 'wayTyp',
                                title : '患者类型',
                                width : setWidth(0.05),
                                formatter : function(value, row, index) {
                                    if (value == 0) {
                                        return '分诊';
                                    } else if (value == 1) {
                                        return '绕行';
                                    } else if (value == 2) {
                                        return '院内发病';
                                    }
                                }
                            }, {
                                field: 'cstNam',
                                title: '姓名',
                                width: setWidth(0.08)
                            }, {
                                field: 'cstSexCod',
                                title: '性别',
                                width: setWidth(0.05),
                                formatter: function(value, row, index) {
                                    if (value == 0) {
                                        return '男'
                                    } else if (value == 1) {
                                        return '女'
                                    }
                                }
                            }, {
                                field: 'cstAge',
                                title: '年龄',
                                width: setWidth(0.05),
                                formatter: function(value, row, index) {
                                    return value == null ? '-' : value + '岁';
                                }
                            }, {
                                field: 'fbsj',
                                title: '发病时间',
                                width: setWidth(0.1),
                                formatter: function(value, row, index) {
                                    if (value != null)
                                        return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
                                    return null;
                                }
                            }, {
                                field: 'cbzd',
                                title: '诊断',
                                width: setWidth(0.1),
                                formatter: function(value, row, index) {
                                    return publicFun.codingEscape(czCbzdCodList, value);
                                }
                            }, {
                                field : 'smtSta',
                                title : '状态',
                                width : setWidth(0.05),
                                formatter : function(value, row, index) {
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
                            },{
                                field: 'crtTim',
                                title: '建档时间',
                                width: setWidth(0.1),
                                formatter: function(value, row, index) {
                                    if (value != null)
                                        return publicFun.timeFormat(new Date(value), 'yyyy/MM/dd hh:mm');
                                    return null;
                                }
                            },{
                                field : 'zdys',
                                title : '诊断医生',
                                width : setWidth(0.08),
                            },{
                                field: 'dd',
                                title: '操作',
                                width: setWidth(0.24),
                                formatter: function(value, row, index) {
                                    var _html = '<span class="btn detail" onclick="toDetail(\'' + row.emgSeq + '\',\'' + row.cstNam + '\')">查看</span>' +
                                        '<span class="btn Timeline" onclick="toCzTimeline(\'' + row.emgSeq + '\',\'' + row.cstNam + '\')">时间轴</span>'+'<span class="btn Timeline" onclick="printCzhcb(\'' + row.emgSeq + '\',\'' + row.cstNam + '\')">核查表</span>';
                                    return _html;
                                }
                            }]
                        ]
                    });
                    search()
                });
            </script>

            </html>