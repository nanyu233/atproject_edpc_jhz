<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>预警阈值修改</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/icu/icu_common.css">
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="editvslmt" ms-controller="vsLmtMng">
    <div id="total-container" class="form">
        <div class="icu-card">
            <div class="icu-card-body">
                <table>
                    <colgroup>
                        <col class="title">
                        <col>
                        <col>
                        <col>
                    </colgroup>
                    <thead>
                        <tr>
                            <th rowspan="2">预警项目</th>
                            <th rowspan="2">单位</th>
                            <th colspan="2">阈值</th>
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
                                <input class="form-text"
                                    ms-class-1="warn-input:((vslmtinfo.vsLowLmt === '' || vslmtinfo.vsLowLmt == null) && (vslmtinfo.vsUppLmt !== '' && vslmtinfo.vsUppLmt != null))"
                                    ms-duplex="vslmtinfo.vsLowLmt"
                                    ms-blur="onlyNum(vslmtinfo, 'vsLowLmt')" autocomplete="off">
                            </td>
                            <td>
                                <input class="form-text"
                                    ms-class-1="warn-input:((vslmtinfo.vsUppLmt === '' || vslmtinfo.vsUppLmt == null) && (vslmtinfo.vsLowLmt !== '' && vslmtinfo.vsLowLmt != null))"
                                    ms-duplex="vslmtinfo.vsUppLmt"
                                    ms-blur="onlyNum(vslmtinfo, 'vsUppLmt')" autocomplete="off">
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
        <div class="center">
            <div class="saveBtn">
                  <input type="button" class="commonbtn" value="保存" onclick="saveAll('close')">
                  <input type="button" class="commonbtn m-l10" value="关闭" onclick="parent.closemodalwindow()">
            </div>
        </div>
    </div>

    <script type="text/javascript">
        /**
         * 公共变量
        */
		var _baseUrl = '${baseurl}';

		 var vm = avalon.define({
            $id: "vsLmtMng",
            vsLmtInfoList: [],
            onlyNum: function (obj, attr) {
                obj[attr] = publicFun.onlyNumber(obj[attr], 1)
            }
        })

        /**
         * 保存
         */
        function saveAll(closeFlag) {
            var requestParam = {};
            var vsDefList = [], lmtSeqList = [];
            var thisVsLmtInfo;
            var lmtFailFlag = '';
            $.each(vm.vsLmtInfoList, function (idx, vsLmtInfo) {
                var thisvsLowLmt = vsLmtInfo.vsLowLmt;
                var thisvsUppLmt = vsLmtInfo.vsUppLmt;
                thisVsLmtInfo = {};
                if (thisvsLowLmt !== '' && thisvsUppLmt !== '') {
                    if (parseFloat(thisvsLowLmt) > parseFloat(thisvsUppLmt)) {
                        alert_warn(vsLmtInfo.vsName + ' 下限不能大于上限');
                        lmtFailFlag = 'lmtCompareFalse'
                    }
                    
                } else if ((thisvsLowLmt === '' && thisvsUppLmt !== '') || (thisvsLowLmt !== '' && thisvsUppLmt === '')) {
                    alert_warn(vsLmtInfo.vsName + '上下限不完整，请补充阈值')
                    lmtFailFlag = idx + ''
                }
                $.each(vsLmtInfo, function (k, v) {
                        if (vsLmtInfo.hasOwnProperty(k)) {
                            thisVsLmtInfo[k] = v;
                        }
                    })
                    vsDefList.push(thisVsLmtInfo)
                return !lmtFailFlag
            })
            if (lmtFailFlag) {
                return;
            }
            //参数赋值
            requestParam.vsDefList = vsDefList;
            publicFun.httpServer({url:'${baseurl}icuVsDef/editVsDefSubmit.do',requestDataType: 'json'}, requestParam, function (res) {
           		if (res.resultInfo.success) {
                    publicFun.getAllNormalRange();  
                    parent.closemodalwindow();
                }
        	})
        }
        /**
         * 获取当前预警值
        */
        function getCurvsDefList() {	
       		 publicFun.httpServer({url:'${baseurl}icuVsDef/getIcuVsDefList.do'}, {}, function (res) {
           		var vsLmtInfoList = res.resultInfo.sysdata.list;
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
            getCurvsDefList();
        })
    </script>
</body>

</html>