<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
    <%--<link rel="stylesheet" type="text/css" href="${baseurl}styles/common/querylist.css" />--%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"></script>
    <script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
    <title>模板查询</title>
    <style>
        html {
            overflow: hidden;
        }

        #modlContainer {
            display: inline-block;
            vertical-align: middle;
            box-sizing: border-box;
            padding-left: 2px;
            /* width: 62%; */
        }

        .form {
            margin-bottom: 0;
        }

        /* 查询条件 */
        /* #modalForm {
            height：
        } */
        /* #qTempType {
            width: 66px;
        } */

        /* 复制按钮 */
        .copyBtn {
            cursor: pointer;
            color: blue;
        }

        .copyBtn:hover {
            text-decoration: underline;
        }

        /* 签名图片样式 */
        .signPic {
            max-width: 20px;
            max-height: 15px;
        }
    </style>
</head>

<body ms-controller="tempListPage">
    <form id="modalForm">
        <div class="form clr">
            <!-- <p class="form-text">日期：</p>
            <input class="input-date Wdate" id="emg_startDate" type="text" name="startDate" autocomplete="off"
                onclick="WdatePicker({dateFmt:'yyyy/MM/dd',maxDate:'%y/%M/%d'})"> -->
            <p class="form-text">模板类型：</p>
            <select name="tempType" id="qTempType" ms-duplex="qTempType">
                <option value="">全部</option>
                <option ms-repeat="tempTypeList">{{el}}</option>
            </select>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="modlQuery()">查询</a>
        </div>
    </form>
    <div id="modlContainer">
        <table id="modlList"></table>
    </div>
    <script type="text/javascript">
        var _baseUrl = '${baseurl}';
        var WIN_W = $(window).width();
        var WIN_H = $(window).height();

        var rowData = ''; //保存当前选中行数据
        var editFlag; //增加弹窗还是修改弹窗

        var vm = avalon.define({
            $id: 'tempListPage',
            tempTypeList: [],
            qTempType: ''
        })

        function reload() {
            //             if ($(window).find('iframe').length === 0) {
            //                 //没有iframe相关弹窗则进行刷新
            $('#modlList').datagrid('reload');
            //             }
        }
        /**
         * editflag传递
         */
        function getEditFlag() {
            return editFlag;
        }
        /**
         * rowData传递
         */
        function getRowData() {
            return rowData || {};
        }
        /**
         * 初始化dataGrid
         */
        function initData() {
            var columns_v = [
                [{
                    field: 'tempType',
                    title: '模板类型',
                    width: 110,
                    sortable: true,
                    align: 'center'
                }, {
                    field: 'tempInfo',
                    title: '<div style="text-align: center">模板内容</div>',
                    width: getWidth(0.7)
                }, {
                    field: 'controlField',
                    title: '操作',
                    width: 100,
                    align: 'center',
                    formatter: function (value, row, idx) {
                        return '<span class="copyBtn" onclick="copyTemp(' + idx + ')">' +
                            '复制模板内容' +
                            '</span>';
                    }
                }
                    // {
                    //     field: 'nursSign',
                    //     title: '护士签名',
                    //     align: 'center',
                    //     formatter: function (value, row, index) {
                    //         if (value) {
                    //             var thisStr = '';
                    //             var thisSignInfoArr = value.split('|');
                    //             var thisSignName = thisSignInfoArr[0]
                    //             var thisSignImg = thisSignInfoArr[1];
                    //             thisStr += '<img ' +
                    //                 'src="' + _baseUrl + 'images/eicu/signPic/"' + thisSignImg +
                    //                 '" title="' + thisSignName +
                    //                 '" class="signPic" onerror="signPicError()" style="max-width: 12mm;max-height: 6mm">';
                    //             thisStr += '<span style="display:none;max-width:100%;">' + thisSignName +
                    //                 '</span>';
                    //             return thisStr;
                    //         }
                    //         return '';
                    //     }
                    // }
                ]
            ];
            // var startDate = $('#paramDateStr').val();
            // var endDate = $('#emg_endDate').val();
            var toolbar_v = [{
                handler: 'addModl',
                iconCls: 'icon-add',
                id: 'b9a7bebe8da749c699c2f86855b0ce7a',
                text: '新增'
            },
            {
                handler: 'editModl',
                iconCls: 'icon-edit',
                id: 'b9a7bebe8da749c699c2f86855b0ce7b',
                text: '修改'
            },
            {
                handler: 'delModl',
                iconCls: 'icon-cut',
                id: 'b9a7bebe8da749c699c2f86855b0ce7c',
                text: '删除'
            }
            ];
            $('#modlList').datagrid({
                nowrap: false,
                // striped: true,
                singleSelect: true,
                url: _baseUrl + 'icutemp/queryNcTempList.do',
                idField: 'tempSeq',
                loadFilter: function (data) {
                    if (data.resultInfo && data.resultInfo.messageCode == '0') {
                        alert_error('系统出错,请联系管理员')
                        return;
                    }
                    return data;
                },
                loadMsg: '',
                columns: columns_v,
                // queryParams: {
                //     "liveNo": _liveNo,
                //     "startDate": startDate,
                //     "endDate": endDate
                // },
                striped: true,
                queryParams: '',
                showFooter: true,
                pagination: true,
                pageNumber: 1,
                rownumbers: true,
                pageList: [50, 100, 200],
                toolbar: toolbar_v,
                rowStyler: function (idx, row) {
                    if (row.dataSrc === 'DA') {
                        return 'background-color: #eee';
                    }
                },
                // onLoadSuccess: function () {

                // },
                onClickRow: function (idx, row) {
                    if (rowData && row.tempSeq === rowData.tempSeq) {
                        $('#modlList').datagrid('unselectRow', idx);
                        rowData = '';
                    } else {
                        $('#modlList').datagrid('selectRow', idx);
                        rowData = row;
                    }
                }
            });
        }

        /**
         * 增加体征记录
         */
        function addModl() {
            editFlag = 'add';
            var modalTitle;
            var modalWidth = 600;
            var modalHeight = 350;
            var modalUrl = _baseUrl + 'icutemp/toEditTempPage.do';
            modalTitle = '模板新增';
            createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
        }
        /**
         * 修改体征记录
         */
        function editModl() {
            var selectedRowData = $('#modlList').datagrid('getSelected');
            if (selectedRowData) {
                rowData = selectedRowData;
            }
            editFlag = 'edit';
            var modalTitle;
            var modalWidth = 600;
            var modalHeight = 350;
            var modalUrl = _baseUrl + 'icutemp/toEditTempPage.do';
            if (!rowData) {
                alert_warn('未选中记录');
                return;
            }
            rowData.inSeq = rowData.ioSeq; //不增加inSeq或者outSeq字段，execEdit页面会认为是新增
            modalTitle = '模板修改';
            createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
        }
        /**
         * 删除模板
         */
        function delModl() {
            var selectedRowData = $('#modlList').datagrid('getSelected');
            if (!selectedRowData) {
                alert_warn('未选中记录');
                return;
            }
            _confirm('确认删除此条数据？', null, function () {
                var requestUrl = _baseUrl + 'icutemp/delNcTempInfo.do';
                publicFun.httpRequest(requestUrl, {
                    tempSeq: selectedRowData.tempSeq
                }, function (res) {
                    ajax_alert(res);
                    if (res.resultInfo.success) {
                        reload();
                    }
                })
            })
        }
        /**
         * 复制文本
         */
        function copyTemp(idx) {
            event.stopPropagation();
            var tempData = $('#modlList').datagrid('getData')['rows'][idx];
            var tempInfoDiv = $('#modlList').parents('.panel.datagrid').find('td[field=\'tempInfo\']')
                .eq(idx + 1)
                .children()
                .get(0);
            var selection = window.getSelection();
            var range = document.createRange();
            range.selectNodeContents(tempInfoDiv);
            selection.removeAllRanges();
            selection.addRange(range);
            try {
                var copy = document.execCommand('copy');
                if (copy) {
                    alert_success('复制成功');
                } else {
                    alert_warn('复制失败，请手动复制')
                }
                selection.removeAllRanges();
            } catch (e) {
                console.warn(e);
            }
            // if (window.clipboardData) {
            //     console.log(window.clipboardData);
            //     window.clipboardData.setData('text', tempData.tempInfo);
            // } else {

            //     console.log(event);
            // }
        }
        /**
         * 获取字典
         */
        function getTempDic() {
            var requestUrl = _baseUrl + 'icutemp/getTempDic.do';
            return publicFun.httpRequest(requestUrl, "", function (res) {
                var tempTypeList;
                if (res.resultInfo.success) {
                    try {
                        tempTypeList = res.resultInfo.sysdata.tempType.map(function (ele) {
                            return ele.tempType;
                        });
                    } catch (e) {
                        tempTypeList = [];
                    }
                    vm.tempTypeList = tempTypeList;
                }
            })
        }
        // //预设时间
        // function setTime() {
        //     var dayMilSec = 24 * 60 * 60 * 1000;
        //     var todayStamp = new Date().getTime();
        //     // var tomorrowStamp = todayStamp + dayMilSec;
        //     var todayStr = publicFun.timeFormat(todayStamp, 'yyyy/MM/dd')
        //     $('#paramDateStr').val(todayStr);
        //     // $('#emg_endDate').val(publicFun.timeFormat(tomorrowStamp, 'yyyy/MM/dd'));
        //     $('#emg_endDate').val(todayStr);
        // };

        /**
         * 宽度计算
         */
        function getWidth(proportion) {
            return Math.round(proportion * WIN_W);
        }
        /**
         * 条件查询
         */
        function modlQuery() {
            var formdata = {
                tempType: vm.qTempType
            }
            $('#modlList').datagrid('load', formdata);
        }
        /**
         * 图片加载错误事件
         */
        function signPicError() {
            var _this = event.target;
            $(_this)
                .hide()
                .next()
                .show();
        }
        $(function () {
            $('#modlList').width(WIN_W - 5).css('margin-left', '5px');
            $('#modlList').height(WIN_H - $('#modalForm').outerHeight() - 2);
            // setTime();
            getTempDic(); //获取模板信息
            initData(); //数据初始化
        });
    </script>
</body>

</html>