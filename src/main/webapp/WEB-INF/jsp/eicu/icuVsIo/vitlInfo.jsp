<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp" %>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/hems/global.css">
    <%--<link rel="stylesheet" type="text/css" href="${baseurl}styles/common/querylist.css">--%>
    <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
    <script src="${baseurl}js/subpageJs/eicu/eicuUtil.js" type="text/javascript"></script>
    <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
    <title>体征查询</title>
    <style>
        #hzxxform {
            visibility: hidden;
        }
    </style>
</head>

<body class="queryjzjl">
    <div class="jzjltab queryTabs outerContainer">
        <form id="hzxxform" action="${baseurl}hemsemg/delemgSubmit.do" method="post">
            <!-- html的静态布局 -->
            <!-- 查询条件 -->
            <div class="form clr">
                <p class="form-text">时间点范围：</p>
                <input class="input-date Wdate" id="emg_startDate" type="text" name="startDate"
                    onclick="WdatePicker({dateFmt:'yyyy/MM/dd',maxDate:'%y-%M-%d'})">
                <p class="form-text">-</p>
                <input class="input-date Wdate" id="emg_endDate" type="text" name="endDate"
                    onclick="WdatePicker({dateFmt:'yyyy/MM/dd',maxDate:'%y-%M-%d'})">
                <p class="form-text" id="query-type-label">项目类型：</p>
                <label class="icu-check-box" id="fixedLabel">
                    <input type="radio" class="queryVsType" name="vsType" value="" checked>
                    <span class="icu-check-label-name">全部</span>
                </label>
                <label class="icu-check-box" id="fixedLabel">
                    <input id="abnormal-flag" type="checkbox" name="abnormal-flag" value="1">
                    <span class="icu-check-label-name">异常体征</span>
                </label>
                <!-- <span class="form-text" id="dynaLabel">
                    <label class="form-text"><input type="radio" class="queryVsType" name="vsType" value="VS">生命体征</label>
                </span> -->
                <!-- <select class="patient-gone" name="VSCodeList" style="display: none"></select> -->
                <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="jzhzxxquery()">查询</a>
            </div>
        </form>
        <table id="hzxxlist"></table>
    </div>

    <script type="text/javascript">
        var abnormalFlag = '';
        var _baseUrl = "${baseurl}";
        var ptBasicInfo = eicuUtil.ptBasicInfo;
        var _custName = ptBasicInfo.custName;
        var _liveNo = ptBasicInfo.liveNo;
        var dlg; //增删改弹窗
        var icuCheckedData = ""; //保存当前选中行数据
        var editFlag; //增加弹窗还是修改弹窗
        // var tzLimitObj = {};
        // var tzLimitArray = []; //获取体征上下限及其列表
        var codeArr = [{
            "typeCode": "VS",
            "listKey": "VS", //getAllList请求数组名称
            "titleName": "生命体征"
        }, {
            "typeCode": "RM",
            "listKey": "RM",
            "titleName": "呼吸机"
        }, {
            "typeCode": "DC",
            "listKey": "DC",
            "titleName": "日常护理"
        }, {
            "typeCode": "BG",
            "listKey": "BG",
            "titleName": "血气信息"
        }, {
            "typeCode": "NC",
            "listKey": "NC",
            "titleName": "病情记录"
        }]; //编码数据组

        //enter按键默认触发查询
        $(document).keydown(function (event) {
            switch (event.keyCode) {
                case 13:
                    jzhzxxquery();
            }
        });

        function reload() {
            $('#hzxxlist').datagrid('reload');
        }

        //加载datagrid
        function initData() {
            var columns_v = [
                [{
                    field: 'vsDateStr',
                    title: '时间点',
                    width: 120,
                    sortable: true
                }, {
                    field: 'typeInfo',
                    title: '项目类型',
                    width: 150
                }, {
                    field: 'threshold',
                    title: '预警阈值',
                    width: 80,
                    // formatter: function (value, row, idx) {
                    //     var returnVal = '';
                    //     var thisLimitInfo;
                    //     if (value) {
                    //         thisLimitInfo = tzLimitObj[value];
                    //         if (thisLimitInfo) {
                    //             returnVal += thisLimitInfo.lowLmt + '-' + thisLimitInfo.uppLmt;
                    //         }
                    //     }
                    //     return returnVal;
                    // }
                }, {
                    field: 'vsRsltStr',
                    title: '项目结果',
                    width: 300,
                    formatter: function (value, row, idx) {
                        var returnVal = value || "";
                        if (returnVal) {
                            // var redFlag = "noFlag";
                            // if (tzLimitArray.indexOf(row.vsCode) !== -1) {
                            //     //有上下限对比上下限
                            //     if (parseFloat(returnVal) < tzLimitObj[row.vsCode]["lowLmt"]) {
                            //         redFlag = "down";
                            //     }
                            //     if (parseFloat(returnVal) > tzLimitObj[row.vsCode]["uppLmt"]) {
                            //         redFlag = "up";
                            //     }
                            // }
                            var arrowStyle = 'position: absolute;left: 40px;font-size:16px';
                            if (row.lmtFlag === 'h') {
                                returnVal = '<span class="text-danger">' + value + '</span>'
                                returnVal += "<span class='text-danger' style='" + arrowStyle + "'>↑</span>"
                            } else if (row.lmtFlag === 'l') {
                                returnVal = '<span class="text-success">' + value + '</span>'
                                returnVal += "<span class='text-success' style='" + arrowStyle +
                                    "'>↓</span>"
                            }
                            if (row.vsUnit) {
                                //有单位显示单位
                                returnVal +=
                                    "<span style=\"float: right;padding-right: 10px;\" class=\"unit\">  " +
                                    row.vsUnit + "</span>";
                            }
                            // if (redFlag !== "noFlag") {
                            //     //有箭头标志显示箭头
                            //     if (redFlag === "up") {
                            //         returnVal +=
                            //             "<span class='text-danger' style='margin-right:5px;float:right'>↑</span>"
                            //     } else if (redFlag === "down") {
                            //         returnVal +=
                            //             "<span class='text-success' style='margin-right:5px;float:right'>↓</span>"
                            //     }
                            // }
                            if (row.rsltMode === "checkbox") {
                                // 如果是checkbox类型重新判断值
                                switch (value) {
                                    case "0":
                                        returnVal = "◯";
                                        break;
                                    case "1":
                                        returnVal = "√";
                                        break;
                                }

                            }
                        }
                        return returnVal;
                    },
                    styler: function () {
                        return 'position: relative';
                    }
                }, {
                    field: 'vsSrc',
                    title: '采集类型',
                    width: 60
                }, {
                    field: 'modUser',
                    title: '操作人',
                    width: 70
                }, {
                    field: 'modTimeStr',
                    title: '操作时间',
                    width: 120
                }]
            ];
            var startDate = $("#emg_startDate").val();
            var endDate = $("#emg_endDate").val();
            var toolbar_v = [
                // {
                // 	handler: "addVs",
                // 	iconCls: "icon-add",
                // 	text: "新增"
                // },
                // {
                // 	handler: "editVs",
                // 	iconCls: "icon-edit",
                // 	text: "修改"
                // },
                {
                    handler: "editDc",
                    iconCls: "icon-edit",
                    text: "整体维护"
                },
                {
                    handler: "deleteDc",
                    iconCls: "icon-cancel",
                    text: "整体删除"
                },
                // 				{
                // 					handler: "deleteVs",
                // 					iconCls: "icon-cut",
                // 					text: "删除"
                // 				},
                {
                    handler: "observationMng",
                    iconCls: "icon-emergency-record",
                    text: "预警阈值管理"
                }
            ];
            $('#hzxxlist').datagrid({
                nowrap: false,
                // striped: true,
                singleSelect: true,
                url: '${baseurl}icuVitlIo/queryVitlInfo.do',
                idField: 'vsSeq',
                loadFilter: function (data) {
                    if (data.resultInfo && data.resultInfo.messageCode == '0') {
                        alert_error('系统出错,请联系管理员')
                        return;
                    }
                    return data;
                },
                loadMsg: '',
                columns: columns_v,
                queryParams: {
                    "liveNo": _liveNo,
                    "startDate": startDate,
                    "endDate": endDate,
                    "abnormalFlag": abnormalFlag
                },
                pagination: true,
                pageNumber: 1,
                rownumbers: true,
                pageList: [50, 100, 200],
                toolbar: toolbar_v,
                onClickRow: function (idx, rowData) {
                    if (icuCheckedData && icuCheckedData.vsSeq === rowData.vsSeq) {
                        $('#hzxxlist').datagrid("unselectRow", idx);
                        icuCheckedData = "";
                    } else {
                        $('#hzxxlist').datagrid("selectRow", idx);
                        icuCheckedData = rowData;
                    }
                }
            });
        }

        /*
         **整体维护
         */
        function editDc() {
            var data = $("#hzxxlist").datagrid("getSelected"),
                vsDateStr = data ? data.vsDateStr : "";
            window.top.addTab(_custName + "-整体维护", "${baseurl}icuVitlIo/toVsZtwh.do?liveNo=" + _liveNo +
                "&vsDateStr=" + vsDateStr, '', '0');
            // window.top.opentabwindow(_custName + "-ICU整体维护", "${baseurl}icuVitlIo/toVsZtwh.do?liveNo=" + _liveNo +
            //     "&vsDateStr=" + vsDateStr, '0');
        }

        /*
         **整体删除
         */
        function deleteDc() {
            var data = $("#hzxxlist").datagrid("getSelected");
            if (!data) {
                alert_warn("未选中记录");
                return;
            }
            var paramDateStr = data.vsDateStr;
            _confirm("确认删除在 " + paramDateStr + " 的所有数据？", null, function () {
                var ajaxOption = new AjaxOption();
                ajaxOption.requestData = {
                    "liveNo": _liveNo,
                    "paramDate": paramDateStr
                };
                ajaxOption.requestType = 'POST';
                ajaxOption.requestDataType = "json";
                ajaxOption.requestUrl = "${baseurl}icuVitlIo/delVsInfoByParam.do";
                ajaxOption.asyncFlg = true;
                ajaxOption.returnDataType = 'json';
                _ajaxPostRequest(ajaxOption, null, function (res) {
                    ajax_alert(res);
                    if (res.resultInfo.success) {
                        $("#hzxxlist").datagrid("clearSelections")
                        $("#hzxxlist").datagrid("reload");
                    }
                });
            })
        }

        /*
         **删除体征记录
         */
        function deleteVs() {
            var row = $('#hzxxlist').datagrid('getSelected');
            if (!row) {
                alert_warn("未选中记录");
                return;
            }
            _confirm("确认删除此条数据？", null, function () {
                var ajaxOption = new AjaxOption();
                ajaxOption.requestData = {
                    "vsSeq": row.vsSeq
                };
                ajaxOption.requestType = 'POST';
                ajaxOption.requestDataType = "json";
                ajaxOption.requestUrl = "${baseurl}icuVitlIo/delVitlSignSubmit.do";
                ajaxOption.asyncFlg = true;
                ajaxOption.returnDataType = 'json';
                _ajaxPostRequest(ajaxOption, null, function (res) {
                    ajax_alert(res);
                    if (res.resultInfo.success) {
                        $('#hzxxlist').datagrid('reload');
                    }
                });
            })
        }

        /*
         **预警阈值管理
         */
        function observationMng() {
            var modalTitle = event.target.innerText
            var modalWidth = '500'
            var modalHeight = '390'
            var modalUrl = _baseUrl + 'icuvslmt/editVsLmt.do';
            createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
            // window.top.addTab(_custName + " - " + "预警阈值管理", "${baseurl}icuvslmt/queryVsLmt.do?liveNo=" + _liveNo);
        }
        /**
         *弹窗关闭回调
         */
        function modalReturnFun(modalType) {
            initData();
        }
        //预设时间
        function setTime() {
            var dayMilSec = 24 * 60 * 60 * 1000;
            var todayStamp = new Date().getTime();
            var todayStr = publicFun.timeFormat(todayStamp, "yyyy/MM/dd")
            $("#emg_startDate").val(todayStr);
            $("#emg_endDate").val(todayStr);
        };

        //获取宽度
        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
        }

        /**
         * 表单查询
         */
        function jzhzxxquery() {
            var formdata = $("#hzxxform").serializeJson();
            formdata.liveNo = _liveNo
            var vsType = formdata.vsType;
            if (vsType !== "") {
                // var vsCode = formdata[vsType + "CodeList"];
                formdata.vsCode = formdata[vsType + "CodeList"];
            } else {
                formdata.vsCode = "";
            }
            formdata.abnormalFlag = $('[name="abnormal-flag"]:checked').val() || ''
            $('#hzxxlist').datagrid('load', formdata);
        }

        //获取vsCode，dcCodeList
        function getAllList() {
            var ajaxOption = new AjaxOption();
            ajaxOption.requestData = {
                "onlyDef": "0"
            };
            ajaxOption.requestType = 'POST';
            ajaxOption.requestDataType = "json";
            ajaxOption.requestUrl = "${baseurl}icuVitlIo/getVsDefCode.do";
            ajaxOption.asyncFlg = true;
            ajaxOption.returnDataType = 'json';
            _ajaxPostRequest(ajaxOption, null, function (res) {
                codeArr.forEach(function (ele, idx, arr) {
                    var codeList = res.resultInfo.sysdata[ele.listKey];
                    var optStr = "<option value=''>请选择" + ele.titleName + "项目</option>";
                    codeList.forEach(function (insideEl, insideIdx) {
                        if (insideEl.vsCode !== 'NURS_SIGN') {
                            optStr += "<option value='" + insideEl.vsCode + "'>" + insideEl
                                .vsName + "</option>";
                        }
                    })
                    $("select[name='" + ele.typeCode + "CodeList']").empty().append(optStr);
                })
            });
        }

        // //获取有上下限的数组及其限制值
        // function getLimitInfo() {
        //     var ajaxOption = new AjaxOption();
        //     ajaxOption.requestData = "liveNo=" + _liveNo;
        //     ajaxOption.requestType = 'POST';
        //     ajaxOption.requestDataType = "pame";
        //     ajaxOption.requestUrl = '${baseurl}icuvslmt/findVsLmtList.do';
        //     ajaxOption.asyncFlg = false;
        //     ajaxOption.returnDataType = 'json';
        //     _ajaxPostRequest(ajaxOption, null, function (res) {
        //         //根据返回值设定上下限code数组和内容
        //         try {
        //             if (res.resultInfo && res.resultInfo.sysdata) {
        //                 var limitList = res.resultInfo.sysdata.vsLmtList;
        //                 if (limitList) {
        //                     tzLimitObj.hasLimit = true;
        //                     limitList.forEach(function (ele, idx, arr) {
        //                         tzLimitArray.push(ele.vsCode);
        //                         tzLimitObj[ele.vsCode] = {};
        //                         tzLimitObj[ele.vsCode]["lowLmt"] = ele.lowLmt;
        //                         tzLimitObj[ele.vsCode]["uppLmt"] = ele.uppLmt;
        //                     })
        //                 }
        //                 //    else {
        //                 //        alert_warn("该患者尚未设置相关的上下限信息")
        //                 //    }
        //             }
        //         } catch (e) {
        //             console.error(e);
        //         }
        //     });
        // }

        function dynaLabelInit() {
            var labelStr = "",
                selectStr = "";
            codeArr.forEach(function (ele, idx, arr) {
                labelStr += '<label class="icu-check-box">';
                labelStr += '<input type="radio" name="vsType" class="queryVsType" value="' + ele.typeCode +
                    '">';
                labelStr += '<span class="icu-check-label-name">';
                labelStr += ele.titleName;
                labelStr += '</span>';
                labelStr += '</label>';
                selectStr += "<select class=\"patient-gone\" name=\"" + ele.typeCode +
                    "CodeList\" style=\"display: none\"></select>"
            })
            $("#fixedLabel").after(selectStr).after(labelStr);
            // $("#dynaLabel").append(labelStr).after(selectStr);
            //单击切换条件事件
            $(".queryVsType").click(function () {
                var thisVal = $(this).val();
                codeArr.forEach(function (ele, idx, arr) {
                    if (thisVal !== ele.typeCode) {
                        $("select[name='" + ele.typeCode + "CodeList']").hide();
                    } else {
                        if (thisVal !== "NC") {
                            $("select[name='" + ele.typeCode + "CodeList']").show();
                        }
                    }
                })
            })
            $("#hzxxform").css("visibility", "visible");
        }
        $(function () {
            var height = $(window).height() - 30 - 10;
            $("#hzxxlist").height(height).width($(".outerContainer").width());
            dynaLabelInit()
            $("#hzxxform").css("visibility", "visible");
            getAllList();
            setTime();
            // getLimitInfo();
            initData();
        });
    </script>
</body>

</html>