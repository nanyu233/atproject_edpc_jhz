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
    <title>管路类型维护</title>
    <style>
        #edit-box {
            padding: 10px 10px 0;
            box-sizing: border-box;
            overflow-x: hidden;
            overflow-y: auto;
            transition: all 0.3s ease-out;
        }

        #ctrl-bar {
            position: fixed;
            width: 80px;
            right: 0px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .ctrl-btn {
            margin-bottom: 10px;
            /* padding: 5px 10px; */
            /* width: 70px; */
            box-sizing: border-box;
            border-radius: 6px;
            transition: all 0.3s linear;
            cursor: pointer;
            text-align: center;
        }

        .icu-card {
            margin: 0 10px 10px 0;
            display: inline-block;
            /* overflow: hidden; */
            /* width: 250px; */
            height: auto;
            vertical-align: top;
            transition: all 0.3s linear;
        }

        .icu-card-body {
            padding-top: 10px;
            display: flex;
            flex-wrap: wrap;
            align-items: center;
        }

        .icu-card-body table {
            table-layout: fixed;
        }

        .icu-card-body table col {
            min-width: 70px;
            text-align: center;
        }

        .icu-card-body table td {
            /* height: 33px; */
            padding: 10px 3px;
            box-sizing: border-box;
            text-align: center;
            border: 1px solid #ddd;
        }

        .icu-card-body table .table-header td {
            font-size: 14px;
            background-color: #fafafa;
            color: #333;
        }

        /* .icu-card-body table .table-header .time-td {
            position: relative;
        }

        .icu-card-body table .table-header .time-td .hover-icon-box {
            position: absolute;
            left: 0;
            top: 0;
        } */

        table td>span {
            display: inline-block;
        }

        .icu-card-body table tr.del-tr td {
            background-color: #e8e8e8 !important;
            color: #666;
        }

        .icu-card-body table tr.ctrl-tr td span.icu-btn {
            margin-bottom: 0;
            margin-top: 10px;
        }

        .icu-card-body table td .icu-btn-group {
            justify-content: center;
        }

        /* .icu-card-body table col {
            width: 120px;
        } */
        .icu-card-body table tr col,
        .icu-card-body table tr td {
            width: 120px;
        }

        .icu-card-body table tr td input[type="text"],
        .icu-card-body table tr td.mini-size select,
        .icu-card-body table tr td.mini-size textarea {
            width: 110px;
        }

        .icu-card-body table col.mini-size,
        .icu-card-body table tr td.mini-size {
            width: 40px;
        }

        .icu-card-body table tr td.mini-size input[type="text"],
        .icu-card-body table tr td.mini-size select,
        .icu-card-body table tr td.mini-size textarea {
            width: 30px;
        }

        .icu-card-body table col.small-size,
        .icu-card-body table tr td.small-size {
            /* normal一半 */
            width: 63px;
        }

        .icu-card-body table tr td.small-size input[type="text"],
        .icu-card-body table tr td.small-size select,
        .icu-card-body table tr td.small-size textarea {
            width: 53px;
        }

        .icu-card-body table col.medium-size,
        .icu-card-body table tr td.medium-size {
            width: 80px;
        }

        .icu-card-body table tr td.medium-size input[type="text"],
        .icu-card-body table tr td.medium-size select,
        .icu-card-body table tr td.medium-size textarea {
            width: 70px;
        }

        .icu-card-body table col.normal-size,
        .icu-card-body table tr td.normal-size {
            width: 126px;
        }

        .icu-card-body table tr td.normal-size input[type="text"],
        .icu-card-body table tr td.normal-size select,
        .icu-card-body table tr td.normal-size textarea {
            width: 116px;
        }

        .icu-card-body table col.large-size,
        .icu-card-body table tr td.large-size {
            width: 410px;
        }

        .icu-card-body table tr td.large-size input[type="text"],
        .icu-card-body table tr td.large-size select,
        .icu-card-body table tr td.large-size textarea {
            width: 400px;
        }

        .icu-card-body table tr td.large-size.memo-td textarea {
            word-break: break-all;
        }

        .icu-card-body table tr td.large-size.memo-td {
            text-align: left;
        }

        /*备注信息*/
        .memo-td {
            position: relative;
        }

        .fast-info {
            position: absolute;
            /*与tdpadding保持一致*/
            top: 10px;
            right: 3px;
            border-radius: 0 6px 6px 0;
            border-left: 1px solid #ddd;
        }

        .fast-info>.icu-btn-group {
            flex-wrap: wrap;
        }

        .fast-info>.icu-btn-group .fast-item {
            margin-top: 10px;
        }

        /* 签名图片样式 */
        .signImgBox {
            display: none;
        }

        .signPic {
            max-width: 60px;
            max-height: 24px;
        }
    </style>
</head>

<body>
    <div id="edit-box-container" ms-controller="dcHourDtl">
        <div id="edit-box" class="signBorderBox searchInputBorderBox">
            <div class="icu-card">
                <!-- <div id="ctrl-bar">
                    <span class="ctrl-btn icu-btn btn-outline-primary" ms-click="addNewIo()">新增</span>
                    <span class="ctrl-btn icu-btn btn-outline-primary" ms-click="scrollPage('top')">回到顶部</span>
                    <span class="ctrl-btn icu-btn btn-outline-primary" ms-click="scrollPage()">前往底部</span>
                </div> -->
                <div class="icu-card-body">
                    <table>
                        <tbody>
                            <tr class="table-header">
                                <td class="normal-size">
                                    <span class="required">时间点</span>
                                </td>
                                <td class="large-size">
                                    <span class="required">病情记录及护理措施</span>
                                </td>
                                <td class="small-size">
                                    <span class="required">护士签名</span>
                                </td>
                                <td class="small-size">操作</td>
                            </tr>
                            <tr ms-repeat-ncinfo="ncList" ms-class-1="{{ncinfo.delTrClass}}"
                                data-repeat-rendered="afterRepeat">
                                <td class="normal-size">
                                    <span ms-if="ncinfo.newFlag !== '1'">{{ncinfo.vsDateStr}}</span>
                                    <input ms-if="ncinfo.newFlag === '1'" type="text"
                                        ms-class-1="{{ncinfo.editFlag === '1' ? 'Wdate':''}}"
                                        ms-duplex="ncinfo.vsDateStr"
                                        ms-attr-disabled="{{ncinfo.newFlag === '1' && ncinfo.editFlag !== '1'}}"
                                        ms-click="timePicker()">
                                </td>
                                <!-- 备注 -->
                                <td class="memo-td large-size">
                                    <span ms-visible="ncinfo.editFlag !== '1'"
                                        ms-attr-title="{{ncinfo.vsRslt}}">{{ncinfo.vsRslt || ''}}</span>
                                    <textarea ms-attr-id="{{'nc-memo' + $index}}" ms-visible="ncinfo.editFlag==='1'"
                                        ms-duplex="ncinfo.vsRslt" ms-attr-disabled="{{ncinfo.editFlag !== '1'}}"
                                        ms-css-padding-right="unitLength" ms-css-height="fastInfoH"
                                        ms-blur="areaBlur($index, $event)" autocomplete="off"></textarea>
                                    <div class="fast-info" ms-css-height="fastInfoH" ms-css-width="unitLength"
                                        ms-visible="ncinfo.editFlag === '1'">
                                        <div class="icu-btn-group">
                                            <span class="fast-item icu-btn inline-btn small-btn btn-outline-secondary"
                                                ms-repeat="charList"
                                                ms-click="fastAdd(el.info, $outer.$index)">{{el.info}}</span>
                                        </div>
                                        <div class="icu-btn-group">
                                            <span class="fast-item icu-btn inline-btn small-btn btn-outline-secondary"
                                                ms-repeat="unitList"
                                                ms-click="fastAdd(el.info,$outer.$index)">{{el.info}}</span>
                                        </div>
                                    </div>
                                </td>
                                <!-- 签名 -->
                                <td class="small-size">
                                    <label>
                                        <input type="text" class="small-size userInput nursSign"
                                            ms-class-1="{{'nursSign'+$index}}"
                                            ms-attr-disabled="{{ncinfo.editFlag !== '1'}}" autocomplete="off">
                                        <div class="signImgBox small-size">
                                            <img src="javascript:;" class="signPic">
                                        </div>
                                    </label>
                                </td>
                                <td class="small-size">
                                    <span class="icu-btn-group">
                                        <span ms-visible="ncinfo.newFlag === '1' || ncinfo.delFlag !== '1'"
                                            class="hover-icon-box primary-box" ms-click="toggleEdit(ncinfo)">
                                            <i ms-visible="ncinfo.editFlag !== '1'"
                                                class="my-icon nav-icon iconfont icon-edit"></i>
                                            <i ms-visible="ncinfo.editFlag === '1'"
                                                class="my-icon nav-icon iconfont icon-lock"></i>
                                            <!-- <i class="my-icon nav-icon iconfont icon-edit"></i> -->
                                        </span>
                                        &nbsp;&nbsp;
                                        <span ms-visible="ncinfo.delFlag !== '1'" class="hover-icon-box danger-box"
                                            ms-click="toggleDel(ncinfo, $index)">
                                            <i class="my-icon nav-icon iconfont icon-delete"></i>
                                        </span>
                                        <span ms-visible="ncinfo.delFlag === '1'"
                                            class="icu-btn inline-btn small-btn btn-outline-danger"
                                            ms-click="toggleDel(ncinfo)">
                                            撤销
                                        </span>
                                    </span>
                                </td>
                            </tr>
                            <tr class="ctrl-tr">
                                <td ms-attr-colspan="{{showPipe === '1' ? '9' : '8'}}" style="border: none">
                                    <span class="icu-btn-group">
                                        <span class="ctrl-btn icu-btn btn-outline-primary"
                                            ms-click="addNewIo()">新增</span>
                                    </span>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <div id="saveBar">
            <div class="btnContainer" style="position: relative;display:inline-block;">
                <input type="button" class="commonbtn" value="保存" onclick="saveAll()">
                <input type="button" class="commonbtn" value="保存并关闭" onclick="saveAll('close')">
                <input type="button" class="commonbtn" value="关闭" onclick="closeAll()">
            </div>
        </div>
    </div>
    <script type="text/javascript">
        var _pageType = 'hourlyNcDet';
        var ptBasicInfo = parent.ptBasicInfo;
        var _liveNo = ptBasicInfo.liveNo;
        var $selectedEl = parent.$selectedEl;
        var curVsDateStr = $selectedEl.data('vsDateStr');
        // 初始出入量数据
        var dcDataKeyInfo = [
            {
                key: 'vsSeq',
                info: '唯一键',
            }, {
                key: 'vsDateStr',
                info: '时间点',
                required: true
            }, {
                key: 'vsType',
                info: '体征数据类型',
                required: true
            }, {
                key: 'vsCode',
                info: '体征数据类型',
                required: true
            }, {
                key: 'vsRslt',
                info: '病情记录及护理措施',
                required: true
            }, {
                key: 'linkSeq',
                info: '伪造序号'
            }, {
                key: 'nursSign',
                info: '护士签名',
                required: true
            }, {
                key: 'seqNo',
                info: '护士签名vsSeq'
            }
        ]
    </script>
    <script type="text/javascript">
        var hisMap; // 回车查询字典
        var vm = avalon.define({
            $id: 'dcHourDtl',
            ncList: [],
            charList: [],
            unitList: [],
            // clientBoxH: '',
            showPipe: '0',
            unitLength: 170, // 快速单位大小
            fastInfoH: 160, // textarea高度
            curFocusInfo: {
                areaIdx: '', // 当前序号
                focusIdx: '' // 当前焦点位置
            },
            afterRepeat: function () {
                var $nursSignInput;
                //绑定本地查询框
                eicuUtil.bindSearchInput(hisMap);
                //绑定医生签名
                eicuUtil.bindUserInput();
                //首次渲染完成开始查询签名
                vm.ncList.forEach(function (vsInfo, vsIdx) {
                    $nursSignInput = $('.nursSign' + vsIdx);
                    $nursSignInput.val(vsInfo.nursSign);
                    eicuUtil.queryDoct($nursSignInput);
                })
            },
            timePicker: function (event) {
                if (event) {
                    event.stopPropagation();
                }
                WdatePicker({ dateFmt: 'yyyy/MM/dd HH:mm', maxDate: '%y/%M/%d %H:%m' })
            },
            toggleEdit: function (vsInfo) {
                console.log(vsInfo);
                vsInfo.editFlag = vsInfo.editFlag === '0' ? '1' : '0';
            },
            toggleDel: function (vsInfo, vsIdx) {
                if (vsInfo.newFlag === '1') {
                    // 新增对象直接删除
                    vm.ncList.splice(vsIdx, 1);
                } else if (vsInfo.delFlag === '1') {
                    vsInfo.delFlag = '0';
                    vsInfo.delTrClass = '';
                } else {
                    vsInfo.delFlag = '1';
                    vsInfo.delTrClass = 'del-tr'
                    vsInfo.editFlag = '0';
                }
            },
            areaBlur: function (areaIdx, e) {
                if (e) {
                    e.stopPropagation();
                }
                vm.curFocusInfo.areaIdx = areaIdx;
                vm.curFocusInfo.focusIdx = e.target.selectionStart;
            },
            fastAdd: function (addStr, areaIdx) {
                var $target = $('#nc-memo' + areaIdx);
                var initStr = vm.ncList[areaIdx].vsRslt;
                var subStr1 = '';
                var subStr2 = '';
                var afterStr = ''
                var focusIdx;
                var pStr = '';
                if (vm.curFocusInfo.areaIdx === areaIdx) {
                    // 如果聚焦框为当前行，寻找焦点位置，插入
                    focusIdx = vm.curFocusInfo.focusIdx;
                    subStr1 = initStr.substring(0, focusIdx);
                    subStr2 = initStr.substring(focusIdx);
                    afterStr = subStr1 + addStr + subStr2;
                } else {
                    // 重新赋值聚焦框信息为当前行，新增到当前行最后
                    afterStr = initStr + addStr;
                    focusIdx = afterStr.length - 1;
                    vm.curFocusInfo.areaIdx = areaIdx;
                }
                vm.ncList[areaIdx].vsRslt = afterStr;
                $target.focus();
                $target.get(0).selectionStart = focusIdx + addStr.length;
                $target.get(0).selectionEnd = focusIdx + addStr.length;
            },
            addNewIo: function () {
                var newVsInfo = {};
                dcDataKeyInfo.forEach(function (keyInfo, idx) {
                    if (keyInfo.key === 'vsType') {
                        newVsInfo[keyInfo.key] = 'NC';
                    } else if (keyInfo.key === 'vsCode') {
                        newVsInfo[keyInfo.key] = 'NC_MEMO';
                    } else {
                        newVsInfo[keyInfo.key] = '';
                    }
                })
                newVsInfo.newFlag = '1';
                newVsInfo.editFlag = '1';
                newVsInfo.delFlag = '0';
                newVsInfo.delTrClass = '';
                vm.ncList.push(newVsInfo);
            },
            onlyNum: function (outerObj, attr) {
                // 数字判断 
                publicFun.vmOnlyNum(outerObj, attr);
            }
        })
        /**
         * 获取回车查询字典
        */
        function getSearchDictInfo() {
            var reqUrl = _baseUrl + 'icuVitlIo/getIoInfoDict.do';
            publicFun.httpRequest(reqUrl, {
                liveNo: _liveNo
            }, {
                asyncFlag: false
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error('数据获取失败，请联系管理员');
                    return
                }
                var ioNameList = res.resultInfo.sysdata.ioNameList || [];
                var coloList = res.resultInfo.sysdata.coloList || [];
                var natuList = res.resultInfo.sysdata.natuList || [];
                hisMap = {};
                hisMap.inInfo = [];
                hisMap.ioNatu = [];
                hisMap.ioColo = [];
                ioNameList.forEach(function (ele) {
                    hisMap.inInfo.push({
                        vsRslt: ele.ioName
                    })
                });
                coloList.forEach(function (ele) {
                    hisMap.ioColo.push({
                        vsRslt: ele.ioColo
                    })
                });
                natuList.forEach(function (ele) {
                    hisMap.ioNatu.push({
                        vsRslt: ele.ioNatu
                    })
                });
            })
        }
        /**
         * 获取数据
         */
        function getHourlyIoInfo() {
            publicFun.httpRequest(_baseUrl + "icuVitlIo/queryHourlyInfo.do", {
                liveNo: eicuUtil.ptBasicInfo.liveNo,
                paramDate: curVsDateStr,
                vsType: 'NC'
            }, {
                requestType: 'json',
                asyncFlag: false
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error('请求出错，请联系管理员');
                    return;
                }
                var sysdata = res.resultInfo.sysdata;
                var ncList = sysdata.ncList || [];
                var imgInfo;
                // 数据处理
                ncList.forEach(function (vsInfo) {
                    // null置为空串
                    $.each(vsInfo, function (k, v) {
                        if (vsInfo.hasOwnProperty(k) && v === null) {
                            vsInfo[k] = '';
                        }
                    })
                    // 暂时性前端处理数据
                    vsInfo.vsType = 'NC';
                    // 插入公共变量
                    vsInfo.editFlag = '0';
                    vsInfo.delFlag = '0';
                    vsInfo.delTrClass = '';
                    // 签名图片名称
                    imgInfo = vsInfo.signimg.split('|');
                    vsInfo.imgSrc = _baseUrl + imgInfo[1] || '';
                })
                vm.ncList.clear();
                vm.ncList = ncList;
                vm.charList = sysdata.charList || [];
                vm.unitList = sysdata.unitList || [];
                // setTimeout(function () {
                //     var $modalCard = $('.icu-card').eq(0);
                //     var basicCardH = $modalCard.outerHeight();
                //     var rowLength = Math.ceil(ioList.length / 2);
                //     var rowMargin = parseInt($modalCard.css('margin-bottom'));
                //     vm.clientBoxH = (basicCardH + rowMargin) * rowLength;
                // }, 0)
            })
        }
        /**
         * 初始化数据
        */
        function initData() {
            // getSearchDictInfo(); // 获取回车查询字典
            getHourlyIoInfo(); // 获取数据
        }
        /**
         * 保存
         */
        function saveAll(closeFlag) {
            var reqUrl = _baseUrl + 'icuVitlIo/saveHourlyInfo.do';
            var reqParam = {};
            var paramObj = {};
            var icuVsInfoList = [];
            var delSeqArr = [];
            var timeValiObj = {};
            var validateFlag = true;

            var reqVsInfo;
            var curKey;
            var curVal;
            var curVsText;
            var curDateStr;
            var nursSignInfo;
            $.each(vm.ncList, function (vsIdx, vsInfo) {
                if (vsInfo.delFlag === '1' && vsInfo.vsSeq) {
                    // 如果被删除且有对应的seq
                    delSeqArr.push(vsInfo.vsSeq);
                    delSeqArr.push(vsInfo.seqNo);
                    return true;
                }
                // if (vsInfo.newFlag === '1') {
                // 如果是新增
                curIoText = '第' + (vsIdx + 1) + '条数据';
                // }
                // curIoText = vsInfo.ioDateStr + ' ' + vsInfo.codeName;
                curDateStr = vsInfo.vsDateStr
                reqVsInfo = {};
                $.each(dcDataKeyInfo, function (idx, keyInfo) {
                    curKey = keyInfo.key;
                    curVal = vsInfo[curKey];
                    if (curVal === null) {
                        curVal = '';
                    }
                    if (curKey === 'nursSign') {
                        curVal = $('.nursSign' + vsIdx).data('userid') || '';
                    }
                    //如果是当前相关变量
                    if (keyInfo.required && curVal === '') {
                        // 必填项没有值
                        alert_warn('请填写 ' + curIoText + ' 的 ' + keyInfo.info);
                        validateFlag = false;
                        return validateFlag;
                    }
                    reqVsInfo[curKey] = curVal;
                })
                icuVsInfoList.push(reqVsInfo);
                if (validateFlag) {
                    // 当前数据验证通过
                    // 验证同一时间点只能出现一次
                    if (timeValiObj[curDateStr] === '1') {
                        alert_warn(curDateStr + '有多条数据');
                        validateFlag = false;
                        return validateFlag;
                    } else {
                        timeValiObj[curDateStr] = '1'
                    }
                    // 插入签名
                    nursSignInfo = {};
                    dcDataKeyInfo.forEach(function (keyInfo, idx) {
                        curKey = keyInfo.key;
                        if (curKey === 'vsCode') {
                            nursSignInfo[curKey] = 'NURS_SIGN';
                        } else if (curKey === 'vsRslt') {
                            nursSignInfo[curKey] = reqVsInfo.nursSign;
                        } else if (curKey === 'vsSeq') {
                            nursSignInfo[curKey] = reqVsInfo['seqNo'] || '';
                        } else {
                            nursSignInfo[curKey] = reqVsInfo[curKey];
                        }
                    })
                    icuVsInfoList.push(nursSignInfo);
                }
                return validateFlag;
            })
            if (!validateFlag) {
                return;
            }
            // 请求参数赋值
            reqParam.liveNo = _liveNo;
            reqParam.vsType = 'NC';
            reqParam.icuVsInfoList = icuVsInfoList;
            reqParam.delSeqArr = delSeqArr;
            // console.log('请求前');
            // console.log(reqParam);
            // return;
            publicFun.httpRequest(reqUrl, reqParam, {
                requestType: 'json'
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error('请求出错，请联系管理员');
                    return;
                }
                if (parent) {
                    parent.alert_success(res.resultInfo.message);
                    parent.modalReturnFun && parent.modalReturnFun(_pageType);
                } else {
                    alert_success(res.resultInfo.message);
                }
                if (closeFlag) {
                    closeAll();
                } else {
                    initData();
                }
            })
        }
        /**
         * 关闭弹窗
        */
        function closeAll() {
            parent.closemodalwindow();
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
        /**
         * 布局设置
        */
        function setLayout() {
            var winH = $(document).height();
            var saveBarH = $('#saveBar').height();
            var containerH = winH - saveBarH;
            $('#edit-box').outerHeight(containerH - 20);
        }
        $(function () {
            setLayout();
            initData();
        });
    </script>
</body>

</html>