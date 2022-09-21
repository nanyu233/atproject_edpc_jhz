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
        #edit-box-container {
            padding: 0 10px;
        }

        #edit-box {
            margin: 10px auto;
            height: 300px;
        }

        #edit-box .icu-card-container {
            padding-left: 10px;
        }

        #edit-box .icu-card-container .edit-item {
            position: relative;
            margin-bottom: 5px;
        }

        #edit-box .icu-card-container .edit-item label {
            vertical-align: top;
        }

        #edit-box .icu-card-container .edit-item label.searchInputLabel {
            vertical-align: middle;
        }

        .searchInput {
            padding-left: 5px;
        }

        .temp-info-label {
            position: relative;
        }

        #temp-info {
            margin-right: 30px;
            float: right;
            padding: 5px 155px 5px 5px;
            width: 460px;
            height: 165px;
            border: 1px solid #ddd;
            box-sizing: border-box;
            word-break: break-all;
        }

        #fast-info {
            margin-right: 30px;
            position: absolute;
            top: 0;
            right: 0;
            padding: 1px 5px;
            display: inline-block;
            width: 155px;
            height: 165px;
            box-sizing: border-box;
            border: 1px solid #ddd;
            border-left: 1px solid #ccc;
            overflow-x: hidden;
            overflow-y: auto;
        }

        #fast-info .fast-item {
            display: inline-block;
            margin: 6px 3px;
            padding: 1px 5px;
            border-radius: 4px;
            border: 1px solid rgba(0, 0, 0, 0.23);
            color: rgba(0, 0, 0, 0.87);
            transition: all 0.3s linear;
            cursor: pointer;
        }

        #fast-info .fast-item:hover {
            background-color: rgba(0, 0, 0, 0.08);
        }

        .text-max-hint {
            position: absolute;
            left: -5px;
            top: 20px;
            display: inline-block;
            width: 100%;
            text-align: center;
            color: red;
            font-size: 10px;
        }

        /* 签名图片样式 */
        .signPic {
            max-width: 20px;
            max-height: 15px;
        }
    </style>
</head>

<body>
    <div id="edit-box-container" ms-controller="editModl">
        <div id="edit-box" class="signBorderBox searchInputBorderBox">
            <div class="icu-card">
                <h3 class="icu-card-title">病情模板维护</h3>
                <div class="icu-card-container">
                    <div class="edit-item">
                        <label for="temp-type" class="required searchInputLabel">模板类型：</label>
                        <span>
                            <input name="temp-type" id="temp-type" class="searchInput" data-dictkey="tempType"
                                ms-duplex="data.tempType" autocomplete="off">
                        </span>
                    </div>
                    <div class="edit-item">
                        <label class="temp-info-label" for="temp-info">
                            <span class="required"></span>
                            模板内容：
                            <span class="text-max-hint">最多500字</span>
                        </label>
                        <span class='clr'>
                            <textarea name="temp-info" id="temp-info" cols="30" rows="10" ms-duplex="data.tempInfo"
                                ms-blur="tempInfoBlur($event)" autocomplete="off" maxlength="500"></textarea>
                            <div id="fast-info">
                                <div>
                                    <span class="fast-item" ms-repeat="charList"
                                        ms-click="fastAdd(el)">{{el.info}}</span>
                                </div>
                                <div>
                                    <span class="fast-item" ms-repeat="unitList"
                                        ms-click="fastAdd(el)">{{el.info}}</span>
                                </div>
                            </div>
                        </span>
                    </div>
                </div>
            </div>
        </div>
        <div id="saveBar">
            <div class="btnContainer" style="position: relative;display:inline-block;">
                <input type="button" class="commonbtn" value="保存" onclick="saveAll()">
                <input type="button" class="commonbtn" value="保存并关闭" onclick="saveAll('close')">
                <input type="button" class="commonbtn" value="关闭" onclick="parent.closemodalwindow()">
                <!-- <input type="button" class="commonbtn" value="保存" onclick="saveAll()"> -->
                <!-- <span class="hint savehint">修改相关信息后，请点击保存按钮！</span> -->
            </div>
        </div>
    </div>
    <script type="text/javascript">
        var _baseUrl = '${baseurl}';
        var pEditFlag = parent.getEditFlag();
        var tempInfoBlurIdx; //失焦时索引值
        var hisMap = {};
        var vm = avalon.define({
            $id: 'editModl',
            data: {
                tempSeq: '',
                tempType: '',
                tempInfo: ''
            },
            typeDicList: [],
            unitList: [],
            charList: [],
            tempInfoBlur: function (e) {
                tempInfoBlurIdx = e.target.selectionStart;
            },
            fastAdd: function (fastItemInfo) {
                var thisVal = vm.data.tempInfo;
                var addStr = fastItemInfo.info;
                var $target = $('#temp-info');
                var focusIdx = tempInfoBlurIdx + addStr.length;
                if (!tempInfoBlurIdx) {
                    tempInfoBlurIdx = 0;
                }
                thisVal = thisVal.substring(0, tempInfoBlurIdx) + addStr + thisVal.substring(
                    tempInfoBlurIdx);
                vm.data.tempInfo = thisVal;
                $target.focus();
                $target.get(0).selectionStart = focusIdx;
                $target.get(0).selectionEnd = focusIdx;
            }
        })
        /**
         * 获取字典
         */
        function getTempDic() {
            var requestUrl = _baseUrl + 'icutemp/getTempDic.do';
            return publicFun.httpRequest(requestUrl, "", function (res) {
                if (res.resultInfo.success) {
                    try {
                        hisMap['tempType'] = res.resultInfo.sysdata.tempType.map(function (ele) {
                            return ele.tempType;
                        });
                        vm.tempTypeList = hisMap['tempType'];
                        vm.charList = res.resultInfo.sysdata.charList;
                        vm.unitList = res.resultInfo.sysdata.unitList;
                    } catch (e) {
                        conosle.warn('tempTypeList错误');
                    }
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
         * 保存
         */
        function saveAll(closeFlag) {
            var requestUrl = _baseUrl + 'icutemp/editNcTempSubmit.do';
            var requestParam = {};
            $.each(vm.data, function (k) {
                if (vm.data.hasOwnProperty(k)) {
                    requestParam[k] = this;
                }
            })
            if (!requestParam.tempType) {
                alert_warn('请填写类型');
                return;
            }
            if (!requestParam.tempInfo) {
                alert_warn('请填写模板内容');
                return;
            }
            publicFun.httpRequest(requestUrl, requestParam, {
                requestType: 'json'
            }, function (res) {
                parent.ajax_alert(res);
                if (res.resultInfo.success) {
                    parent.reload();
                    if (closeFlag) {
                        parent.closemodalwindow();
                    } else if (!vm.data.tempSeq) {
                        vm.data.tempSeq = res.resultInfo.sysdata.tempSeq;
                    }
                }
            })
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
            if (pEditFlag === 'edit') {
                var pRowData = parent.getRowData();
                vm.data.tempSeq = pRowData.tempSeq;
                vm.data.tempType = pRowData.tempType;
                vm.data.tempInfo = pRowData.tempInfo;
            }
            eicuUtil.bindSearchInput(hisMap, 'down');
            // setTime();
            getTempDic(); //获取模板信息
        });
    </script>
</body>

</html>