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
            height: 33px;
            padding: 3px;
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
            width: 130px;
        }

        .icu-card-body table tr td.large-size input[type="text"],
        .icu-card-body table tr td.large-size select,
        .icu-card-body table tr td.large-size textarea {
            width: 120px;
        }

        textarea {
            height: 50px;
        }

        .iomemo-display {
            overflow: hidden;
            white-space: nowrap;
            text-overflow: ellipsis;
        }

        /* .icu-card-body table td:first-of-type td:first-of-type {
            border-top-left-radius: 6px;
        }

        .icu-card-body table tr:first-of-type td:last-of-type {
            border-top-right-radius: 6px;
        }

        .icu-card-body table tr:last-of-type td:first-of-type {
            border-bottom-left-radius: 6px;
        }

        .icu-card-body table tr:last-of-type td:last-of-type {
            border-bottom-right-radius: 6px;
        } */

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
    <div id="edit-box-container" ms-controller="ioHourDtl">
        <div id="edit-box" class="signBorderBox searchInputBorderBox">
            <!-- <div id="ctrl-bar">
                <span class="ctrl-btn icu-btn btn-outline-primary" ms-click="addNewIo()">新增</span>
                <span class="ctrl-btn icu-btn btn-outline-primary" ms-click="scrollPage('top')">回到顶部</span>
                <span class="ctrl-btn icu-btn btn-outline-primary" ms-click="scrollPage()">前往底部</span>
            </div> -->
            <div class="icu-card">
                <div class="icu-card-body">
                    <table>
                        <tbody>
                            <tr class="table-header" ms-if="initIoType === 'I'">
                                <td class="normal-size">
                                    <span class="required">时间点</span>
                                </td>
                                <td class="normal-size">
                                    <span class="required">入量类型</span>
                                </td>
                                <td class="normal-size" ms-if="showPipe === '1'">管路信息</td>
                                <td class="normal-size" colspan="2">
                                    <span class="required">入量名称</span>
                                </td>
                                <td class="small-size">
                                    <span class="required">数值</span>
                                    <span class="unit">ml</span>
                                </td>
                                <td class="large-size">入量备注</td>
                                <td class="small-size"><span class="required">护士签名</span></td>
                                <td class="small-size">操作</td>
                            </tr>
                            <tr class="table-header" ms-if="initIoType === 'O'">
                                <td class="normal-size">
                                    <span class="required">时间点</span>
                                </td>
                                <td class="normal-size">
                                    <span class="required">出量类型</span>
                                </td>
                                <td class="normal-size" ms-if="showPipe === '1'">管路信息</td>
                                <td class="small-size">颜色</td>
                                <td class="small-size">性状</td>
                                <td class="small-size">
                                    <span class="required">数值</span>
                                    <span class="unit">ml</span>
                                </td>
                                <td class="large-size">出量备注</td>
                                <td class="small-size"><span class="required">护士签名</span></td>
                                <td class="small-size">操作</td>
                            </tr>
                            <tr ms-repeat-ioinfo="ioList" ms-class-1="{{ioinfo.delTrClass}}"
                                data-repeat-rendered="afterRepeat">
                                <td class="normal-size">
                                    <span ms-if="ioinfo.newFlag !== '1'">{{ioinfo.ioDateStr}}</span>
                                    <input ms-if="ioinfo.newFlag === '1'" type="text"
                                        ms-class-1="{{ioinfo.editFlag === '1' ? 'Wdate':''}}"
                                        ms-duplex="ioinfo.ioDateStr" ms-attr-disabled="{{ioinfo.editFlag !== '1'}}"
                                        ms-click="timePicker()">
                                </td>
                                <td class="normal-size">
                                    <select ms-duplex="ioinfo.ioCode"
                                        ms-attr-disabled="{{!(ioinfo.newFlag === '1' && ioinfo.editFlag === '1')}}">
                                        <option value="">请选择</option>
                                        <option ms-repeat-codeinfo="ioCodeList" ms-attr-value="{{codeinfo.ioCode}}">
                                            {{codeinfo.ioName}}
                                        </option>
                                    </select>
                                </td>
                                <!-- 管路信息 -->
                                <td class="normal-size" ms-if="showPipe === '1'">
                                    <select ms-duplex="ioinfo.pipeSeq" ms-attr-disabled="{{ioinfo.editFlag !== '1'}}">
                                        <option value="">请选择</option>
                                        <option ms-repeat-pipeinfo="ioinfo.newFlag === '1' ? filterPipeList : pipeList"
                                            ms-attr-value="pipeinfo.pipeSeq">
                                            {{pipeinfo.pipeName}}</option>
                                    </select>
                                </td>
                                <!-- 入量名称 -->
                                <td colspan="2" ms-if="initIoType === 'I'">
                                    <label>
                                        <input type="text" class="searchInput" ms-duplex="ioinfo.ioName"
                                            ms-attr-disabled="{{ioinfo.editFlag !== '1'}}" data-dictkey="inInfo"
                                            autocomplete="off">
                                    </label>
                                </td>
                                <!-- 出量颜色 -->
                                <td class="small-size" ms-if="initIoType === 'O'">
                                    <label>
                                        <input type="text" class="searchInput" ms-duplex="ioinfo.ioColo"
                                            ms-attr-disabled="{{ioinfo.editFlag !== '1'}}" data-dictkey="ioColo"
                                            autocomplete="off">
                                    </label>
                                </td>
                                <!-- 出量性状 -->
                                <td class="small-size " ms-if="initIoType === 'O'">
                                    <label>
                                        <input type="text" class="searchInput" ms-duplex="ioinfo.ioNatu"
                                            ms-attr-disabled="{{ioinfo.editFlag !== '1'}}" data-dictkey="ioNatu"
                                            autocomplete="off">
                                    </label>
                                </td>
                                <!-- 数值 -->
                                <td class="small-size">
                                    <input type="text" ms-duplex="ioinfo.ioNumb"
                                        ms-attr-disabled="{{ioinfo.editFlag !== '1'}}"
                                        ms-blur="onlyNum(ioinfo, 'ioNumb')" autocomplete="off">
                                </td>
                                <!-- 备注 -->
                                <td class="large-size">
                                    <span class="iomemo-display" ms-visible="ioinfo.editFlag !== '1'"
                                        ms-attr-title="{{ioinfo.ioMemo}}">{{ioinfo.ioMemo || ''}}</span>
                                    <textarea ms-visible=" ioinfo.editFlag==='1'" ms-duplex=" ioinfo.ioMemo"
                                        ms-attr-disabled="{{ioinfo.editFlag !== '1'}}" autocomplete="off"></textarea>
                                </td>
                                <!-- 签名 -->
                                <td class="small-size">
                                    <label>
                                        <input type="text" class="small-size userInput nursSign"
                                            ms-class-1="{{'nursSign'+$index}}"
                                            ms-attr-disabled="{{ioinfo.editFlag !== '1'}}" autocomplete="off">
                                        <div class="signImgBox small-size">
                                            <img src="javascript:;" class="signPic">
                                        </div>
                                    </label>
                                </td>
                                <td class="small-size">
                                    <span class="icu-btn-group">
                                        <span ms-visible="ioinfo.newFlag === '1' || ioinfo.delFlag !== '1'"
                                            class="hover-icon-box primary-box" ms-click="toggleEdit(ioinfo)">
                                            <i ms-visible="ioinfo.editFlag !== '1'"
                                                class="my-icon nav-icon iconfont icon-edit"></i>
                                            <i ms-visible="ioinfo.editFlag === '1'"
                                                class="my-icon nav-icon iconfont icon-lock"></i>
                                            <!-- <i class="my-icon nav-icon iconfont icon-edit"></i> -->
                                        </span>
                                        &nbsp;&nbsp;
                                        <span ms-visible="ioinfo.delFlag !== '1'" class="hover-icon-box danger-box"
                                            ms-click="toggleDel(ioinfo, $index)">
                                            <i class="my-icon nav-icon iconfont icon-delete"></i>
                                        </span>
                                        <span ms-visible="ioinfo.delFlag === '1'"
                                            class="icu-btn inline-btn small-btn btn-outline-danger"
                                            ms-click="toggleDel(ioinfo)">
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
        var _pageType = 'hourlyIoDet';
        var ptBasicInfo = parent.ptBasicInfo;
        var _liveNo = ptBasicInfo.liveNo;
        var $selectedEl = parent.$selectedEl;
        var curVsDateStr = $selectedEl.data('vsDateStr');
        var initIoType = $selectedEl.data('ioType');
        //出入量类型字典
        var ioDictInfo = {
            'I': {
                info: '入量',
                infocode: 'I'
            },
            'O': {
                info: '出量',
                infocode: 'O'
            }
        }
        // 初始出入量数据
        var ioDataKeyInfo = [
            {
                key: 'ioSeq',
                info: '唯一键',
                keyType: '#'
            }, {
                key: 'ioDateStr',
                info: '时间点',
                keyType: '#',
                required: true
            }, {
                key: 'ioType',
                info: '出/入量标志',
                keyType: '#',
                required: true
            }, {
                key: 'ioCode',
                info: '出入量类型',
                keyType: '#',
                required: true
            }, {
                key: 'ioName',
                info: '入量名称',
                keyType: 'I',
                required: true
            }, {
                key: 'ioNumb',
                info: '数值',
                keyType: '#',
                required: true
            }, {
                key: 'ioMemo',
                info: '备注',
                keyType: '#',
            }, {
                key: 'ioColo',
                info: '颜色',
                keyType: 'O',
            }, {
                key: 'ioNatu',
                info: '性状',
                keyType: 'O',
            }, {
                key: 'daSeq',
                info: '医嘱绑定序号',
                keyType: '#'
            }, {
                key: 'pipeSeq',
                info: '管路信息',
                keyType: '#',
            },
            {
                key: 'nursSign',
                info: '护士签名',
                keyType: '#',
                required: true
            }
        ]
    </script>
    <script type="text/javascript">
        var hisMap; // 回车查询字典
        var vm = avalon.define({
            $id: 'ioHourDtl',
            initIoType: initIoType,
            ioList: [],
            ioCodeList: [],
            pipeList: [],
            filterPipeList: [], // 过滤拔管管路
            // pipeInfo: {},
            // clientBoxH: '',
            showPipe: '0',
            afterRepeat: function () {
                var $nursSignInput;
                //绑定本地查询框
                eicuUtil.bindSearchInput(hisMap);
                //绑定医生签名
                eicuUtil.bindUserInput();
                //首次渲染完成开始查询签名
                vm.ioList.forEach(function (ioInfo, ioIdx) {
                    if (ioInfo.nursSign) {
                        $nursSignInput = $('.nursSign' + ioIdx);
                        $nursSignInput.val(ioInfo.nursSign);
                        eicuUtil.queryDoct($nursSignInput);
                    }
                })
            },
            timePicker: function (event) {
                if (event) {
                    event.stopPropagation();
                }
                WdatePicker({ dateFmt: 'yyyy/MM/dd HH:mm', maxDate: '%y/%M/%d %H:%m' })
            },
            toggleEdit: function (ioInfo) {
                ioInfo.editFlag = ioInfo.editFlag === '0' ? '1' : '0';
            },
            toggleDel: function (ioInfo, ioIdx) {
                if (ioInfo.newFlag === '1') {
                    // 新增对象直接删除
                    vm.ioList.splice(ioIdx, 1);
                } else if (ioInfo.delFlag === '1') {
                    ioInfo.delFlag = '0';
                    ioInfo.delTrClass = '';
                } else {
                    ioInfo.delFlag = '1';
                    ioInfo.delTrClass = 'del-tr'
                    ioInfo.editFlag = '0';
                }
            },
            // scrollPage: function (type) {
            //     var scrollValue = type === 'top' ? 0 : vm.clientBoxH;
            //     $('#edit-box').animate({
            //         scrollTop: scrollValue
            //     }, 300);
            //     // $('#edit-box').scrollTop(scrollValue);
            // },
            addNewIo: function () {
                var newIoInfo = {};
                ioDataKeyInfo.forEach(function (keyInfo, idx) {
                    if (keyInfo.key === 'ioType') {
                        newIoInfo[keyInfo.key] = initIoType;
                    } else {
                        newIoInfo[keyInfo.key] = '';
                    }
                })
                newIoInfo.newFlag = '1';
                newIoInfo.editFlag = '1';
                newIoInfo.delFlag = '0';
                newIoInfo.delTrClass = '';
                vm.ioList.push(newIoInfo);
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
                ioType: initIoType
            }, {
                requestType: 'json',
                asyncFlag: false
            }, function (res) {
                if (!res.resultInfo.success) {
                    alert_error('请求出错，请联系管理员');
                    return;
                }
                var sysdata = res.resultInfo.sysdata;
                var ioList = sysdata.ioList;
                var ioImgInfo;
                // 字典相关处理
                var copyPipeInfo = {};
                var totalPipeList = sysdata.pipeList || [];
                var filterPipeList = []
                totalPipeList.forEach(function (pipeInfo, pipeIdx) {
                    if (pipeInfo.pipeStat !== '30') {
                        copyPipeInfo = {};
                        $.each(pipeInfo, function (k, v) {
                            copyPipeInfo[k] = v;
                        })
                        filterPipeList.push(copyPipeInfo);

                    }
                })
                vm.showPipe = sysdata.optkey.optvalue;
                vm.pipeList = totalPipeList;
                vm.filterPipeList = filterPipeList;
                vm.ioCodeList = sysdata.ioCodeList
                // 数据处理
                ioList.forEach(function (ioInfo) {
                    // null置为空串
                    $.each(ioInfo, function (k, v) {
                        if (ioInfo.hasOwnProperty(k) && v === null) {
                            ioInfo[k] = '';
                        }
                    })
                    // 插入公共变量
                    ioInfo.editFlag = '0';
                    ioInfo.delFlag = '0';
                    ioInfo.delTrClass = '';
                    // 签名类型翻译
                    ioInfo.ioTypeStr = ioDictInfo[ioInfo.ioType].info;
                    // 签名图片名称
                    ioImgInfo = ioInfo.signImg.split('|');
                    ioInfo.imgSrc = _baseUrl + ioImgInfo[1] || '';
                })
                vm.ioList.clear();
                vm.ioList = ioList;
                // vm.pipeList = pipeList;
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
            getSearchDictInfo(); // 获取回车查询字典
            getHourlyIoInfo(); // 获取数据
        }
        /**
         * 保存
         */
        function saveAll(closeFlag) {
            var reqUrl = _baseUrl + 'icuVitlIo/saveHourlyInfo.do';
            var reqParam = {};
            var paramObj = {};
            var icuIoInfoList = [];
            var delSeqArr = [];
            var validateFlag = true;

            var reqIoInfo;
            var curKeyType;
            var curKey;
            var curVal;
            var curIoText;
            $.each(vm.ioList, function (ioIdx, ioInfo) {
                if (ioInfo.delFlag === '1' && ioInfo.ioSeq) {
                    // 如果被删除且有对应的seq
                    delSeqArr.push(ioInfo.ioSeq);
                    return true;
                }
                // if (ioInfo.newFlag === '1') {
                // 如果是新增
                curIoText = '第' + (ioIdx + 1) + '条数据';
                // }
                // curIoText = ioInfo.ioDateStr + ' ' + ioInfo.codeName;
                reqIoInfo = {};
                $.each(ioDataKeyInfo, function (idx, keyInfo) {
                    curKeyType = keyInfo.keyType;
                    curKey = keyInfo.key;
                    curVal = ioInfo[curKey];
                    if (curVal === null) {
                        curVal = '';
                    }
                    if (curKey === 'nursSign') {
                        curVal = $('.nursSign' + ioIdx).data('userid') || '';
                    }
                    if (curKeyType === '#' || curKeyType === initIoType) {
                        //如果是当前相关变量
                        if (keyInfo.required && curVal === '') {
                            // 必填项没有值
                            alert_warn('请填写 ' + curIoText + ' 的 ' + keyInfo.info);
                            validateFlag = false;
                            return validateFlag;
                        }
                    }
                    reqIoInfo[curKey] = curVal;
                })
                icuIoInfoList.push(reqIoInfo);
                return validateFlag;
            })
            if (!validateFlag) {
                return;
            }
            // 请求参数赋值
            reqParam.liveNo = _liveNo;
            reqParam.ioType = initIoType;
            reqParam.icuIoInfoList = icuIoInfoList;
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