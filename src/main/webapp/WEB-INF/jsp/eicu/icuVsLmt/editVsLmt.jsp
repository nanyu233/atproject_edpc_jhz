<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>预警阈值修改</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
    <style>
        #total-container {
            margin-bottom: 40px;
            overflow: hidden;
        }

        .icu-card {
            margin: 6px;
            overflow: hidden;
        }

        .icu-card-body {
            padding-top: 10px;
            box-sizing: border-box;
            overflow-y: auto;
            overflow-x: hidden;
        }

        .icu-card-body table {
            table-layout: fixed;
            width: 97%;
        }

        .icu-card-body table col {
            width: 50px;
        }

        .icu-card-body table col.title {
            width: 80px;
            font-weight: bold;
        }

        .icu-card-body table tr th {
            font-weight: bold
        }

        .icu-card-body table tr th,
        .icu-card-body table tr td {
            padding: 5px;
            border: 1px solid #ddd;
            text-align: center;
        }

        .icu-card-body table tbody tr:hover {
            background-color: #eaf2ff
        }

        .icu-card-body table tr td input.form-text {
            padding-left: 5px;
            padding-right: 5px;
            width: 50px;
            transition: all 0.3s linear;
            border: 1px solid #ddd;
            text-align: center;
            box-sizing: border-box;
            line-height: 1;
        }

        .icu-card-body table tr td input.form-text.warn-input {
            border: 1px solid rgb(243, 83, 83);
        }

        .ctrl-btn-group {
            /* width: 50px; */
            justify-content: center;
        }

        /* span.btn {
            padding: 0 5px;
            cursor: pointer;
            font-size: 13px;
        }

        span.btn:hover {
            text-decoration: underline;
        } */
    </style>
</head>

<body class="editvslmt" ms-controller="vsLmtMng">
    <div id="total-container">
        <div class="icu-card">
            <div class="icu-card-body">
                <table>
                    <colgroup>
                        <col class="title">
                        <col>
                        <col>
                        <col>
                        <col>
                        <col>
                    </colgroup>
                    <thead>
                        <tr>
                            <th rowspan="2">预警项目</th>
                            <th rowspan="2">单位</th>
                            <th rowspan="2">参考值</th>
                            <th colspan="2">阈值</th>
                            <th rowspan="2">操作</th>
                        </tr>
                        <tr>
                            <th>下限</th>
                            <th>上限</th>
                        </tr>
                    </thead>
                    <tbody ms-if="vsLmtInfoList.length !== 0">
                        <tr ms-repeat-vslmtinfo="vsLmtInfoList">
                            <td>
                                {{vslmtinfo.vsName}}
                            </td>
                            <td>
                                <span class="unit">{{vslmtinfo.vsUnit}}</span>
                            </td>
                            <td>
                                {{vslmtinfo.lmtDefStr}}
                            </td>
                            <td>
                                <input ms-class-1="form-text lmt-num"
                                    ms-class-2="{{(vslmtinfo.lowLmt === '' && vslmtinfo.uppLmt !== '') ? 'warn-input' : ''}}"
                                    ms-attr-name="{{vslmtinfo.vsCode + 'lowLmt'}}" ms-duplex="vslmtinfo.lowLmt"
                                    ms-blur="onlyNum(vslmtinfo, 'lowLmt')" autocomplete="off">
                            </td>
                            <td>
                                <input ms-class-1="form-text lmt-num"
                                    ms-class-2="{{(vslmtinfo.uppLmt === '' && vslmtinfo.lowLmt !== '') ? 'warn-input' : ''}}"
                                    ms-attr-name="{{vslmtinfo.vsCode + 'uppLmt'}}" ms-duplex="vslmtinfo.uppLmt"
                                    ms-blur="onlyNum(vslmtinfo, 'uppLmt')" autocomplete="off">
                            </td>
                            <td>
                                <div class="ctrl-btn-group icu-btn-group">
                                    <span class="del-btn hover-icon-box danger-box" ms-click="clearLmt(vslmtinfo)">
                                        <i class="my-icon nav-icon iconfont icon-delete"></i>
                                    </span>
                                </div>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div id="saveBar">
            <div class="btnContainer" style="position: relative;display:inline-block;">
                <input type="button" class="commonbtn" value="保存" onclick="saveAll()">
                <input type="button" class="commonbtn" value="保存并关闭" onclick="saveAll('close')">
                <input type="button" class="commonbtn" value="关闭" onclick="parent.closemodalwindow()">
            </div>
        </div>
    </div>

    <script type="text/javascript">
        /**
         * 公共变量
         */
        var _pageType = 'editVsLmt';
        var ptBasicInfo = eicuUtil.ptBasicInfo;
        var _liveNo = ptBasicInfo.liveNo;

        var vm = avalon.define({
            $id: "vsLmtMng",
            vsLmtInfoList: [],
            clearLmt: function (vsLmtInfo) {
                if (vsLmtInfo.lmtSeq != null) {
                    _confirm('确认删除当前 ' + vsLmtInfo.vsName + ' 的预警阈值？', null, function () {
                        delVsLmtBySeq(vsLmtInfo);
                    })
                } else {
                    vsLmtInfo.lowLmt = '';
                    vsLmtInfo.uppLmt = '';
                }
            },
            onlyNum: function (obj, attr) {
                var thisVal = obj[attr];
                thisVal = parseFloat(thisVal.replace(/[^0-9.]/ig, ''))
                if (isNaN(thisVal)) {
                    obj[attr] = '';
                } else {
                    obj[attr] = thisVal;
                }
            }
        })

        function delVsLmtBySeq(vsLmtInfo) {
            publicFun.httpRequest(_baseUrl + 'icuvslmt/delVsLitSubmit.do', {
                "lmtSeq": vsLmtInfo.lmtSeq
            }, function (res) {
                parent.ajax_alert(res);
                if (res.resultInfo.success) {
                    // 如果成功，删除当前seq
                    vsLmtInfo.hasInit = '0';
                    vsLmtInfo.lmtSeq = '';
                    vsLmtInfo.lowLmt = '';
                    vsLmtInfo.uppLmt = '';
                }
            })
        }

        /**
         * 保存
         */
        function saveAll(closeFlag) {
            var requestUrl = _baseUrl + 'icuvslmt/editVsLmtSubmit.do';
            var requestParam = {};
            var vsLmtList = [];
            var lmtSeqList = [];
            var thisVsLmtInfo;
            var lmtFailFlag = '';
            $.each(vm.vsLmtInfoList, function (idx, vsLmtInfo) {
                var thisLowLmt = vsLmtInfo.lowLmt;
                var thisUppLmt = vsLmtInfo.uppLmt;
                var thisVsCode = vsLmtInfo.vsCode;
                thisVsLmtInfo = {};
                if (thisLowLmt !== '' && thisUppLmt !== '') {
                    if (parseFloat(thisLowLmt) > parseFloat(thisUppLmt)) {
                        alert_warn(vsLmtInfo.vsName + ' 下限不能大于上限');
                        lmtFailFlag = 'lmtCompareFalse'
                    }
                    $.each(vsLmtInfo, function (k, v) {
                        if (vsLmtInfo.hasOwnProperty(k)) {
                            thisVsLmtInfo[k] = v;
                        }
                    })
                    vsLmtList.push(thisVsLmtInfo)
                } else if (thisLowLmt === '' && thisUppLmt === '') {
                    if (vsLmtInfo.hasInit === '1') {
                        //有原始值，则插入删除数组
                        lmtSeqList.push(vsLmtInfo.lmtSeq)
                    }
                } else if ((thisLowLmt === '' && thisUppLmt !== '') || (thisLowLmt !== '' && thisUppLmt ===
                        '')) {
                    alert_warn(vsLmtInfo.vsName + '上下限不完整，请补充阈值')
                    lmtFailFlag = idx + ''
                }
                return !lmtFailFlag
            })
            if (lmtFailFlag) {
                return;
            }
            //参数赋值
            requestParam.liveNo = _liveNo;
            requestParam.vsLmtList = vsLmtList;
            requestParam.lmtSeqList = lmtSeqList;
            publicFun.httpRequest(requestUrl, requestParam, {
                requestType: 'json'
            }, function (res) {
                if (res.resultInfo.success) {
                    if (parent.modalReturnFun) {
                        parent.modalReturnFun(_pageType);
                    }
                    if (closeFlag) {
                        parent.closemodalwindow();
                    } else {
                        getCurVsLmtList();
                    }
                }
            })
        }
        /**
         * 获取当前预警值
         */
        function getCurVsLmtList() {
            var reqUrl = _baseUrl + 'icuvslmt/getVsLmtList.do';
            var reqParam = {
                'liveNo': _liveNo
            };
            publicFun.httpRequest(reqUrl, reqParam, {
                requestType: 'json'
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error('请求出错，请联系管理员')
                    return;
                }
                var vsLmtInfoList = res.resultInfo.sysdata.lmtList;
                vsLmtInfoList.forEach(function (ele) {
                    ele.lmtDefStr = ele.defUpp ? (ele.defLow + '-' + ele.defUpp) : '';
                    if (ele.lowLmt === null) {
                        ele.lowLmt = '';
                    }
                    if (ele.uppLmt === null) {
                        ele.uppLmt = '';
                    }
                    if (ele.lowLmt !== '' && ele.uppLmt !== '') {
                        ele.hasInit = '1'
                    }
                })
                vm.vsLmtInfoList = vsLmtInfoList;
            })
        }
        /**
         * 布局设置
         */
        function setLayout() {
            var WIN_H = $(window).height();
            var saveBarH = 38;
            var $cardBody = $('#total-container .icu-card-body');
            $cardBody.height(WIN_H - saveBarH - 40);
            $('#total-container .icu-card-body table').width($cardBody.width() * 0.98)
        }
        $(function () {
            setLayout();
            getCurVsLmtList();
        })
    </script>
</body>

</html>