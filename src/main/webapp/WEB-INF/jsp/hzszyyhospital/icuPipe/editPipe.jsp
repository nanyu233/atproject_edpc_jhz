<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"></script>
    <title>模板查询</title>
    <style>

        /*历史表格显示*/

        #hisContainer {
            position: fixed;
            bottom: 44px;
            left: 0;
            padding: 10px 5px;
            width: 100%;
            height: 0;
            box-sizing: border-box;
            border-radius: 10px;
            overflow: hidden;
            background-color: #fafafa;
            box-shadow: 0px -5px 5px #ddd;
            transition: all 0.3s linear;
            opacity: 0;
        }
        select#in-type{
        	width: 335px;
        }
    </style>
</head>

<body ms-controller="editPipe" class="editPipe">
    <div class="form">
        <table class="editTable">
            <tbody>
                <tr ms-if="editFlag === 'add' || editFlag === 'edit'">
                    <th><i class="red">*</i>管路类型：</th>
                    <td>
                        <select name="pipe-type" id="pipe-type" ms-attr-disabled="data.pipeSeq" ms-duplex="data.pipeType">
                            <option ms-repeat="infocodeList" ms-attr-value="{{el.infocode}}">
                                {{el.info}}
                            </option>
                        </select>
                    </td>
                    <th ms-if="editFlag === 'edit'">管路状态：</th>
                    <td ms-if="editFlag === 'edit'">
                        <span style="vertical-align: middle">{{data.pipeStatStr}}</span>
                    </td>
                </tr>
                <tr ms-if="editFlag === 'add' || editFlag === 'edit'">
                    <th><i class="red">*</i>管路名称：</th>
                    <td>
                        <input type="text" name="pipe-name" id="pipe-name" ms-data-dictkey="data.pipeType + 'pipeName'" ms-duplex="data.pipeName"
                        autocomplete="off">
                    </td>
                    <th><i class="red">*</i>身体部位：</th>
                    <td>
                        <input type="text" name="body-part" id="body-part"
                        ms-data-dictkey="data.pipeType + 'bodyPart'" ms-duplex="data.bodyPart"
                        autocomplete="off">
                    </td>
                </tr>
                <tr ms-if="editFlag === 'add' || editFlag === 'edit'">
                    <th><i class="red">*</i>置管类型：</th>
                    <td colspan="3">
                        <span>
                            <label><input name="in-type" type="radio" value="1" ms-duplex-string="data.inType" />正常置管</label>
                            <label><input name="in-type" type="radio" value="2" ms-duplex-string="data.inType" />非计划拔管后再置管</label>
                        </span>
                    </td>
                </tr>
                <tr ms-if="editFlag === 'add' || editFlag === 'edit'">
                    <th><i class="red">*</i>置管时间：</th>
                    <td>
                        <input type="text" name="in-time-str" id="in-time-str"
                        ms-duplex="data.inTime" ms-click="timePickerM()" readonly autocomplete="off">  
                    </td>
                    <th>置管天数：</th>
                    <td>
                        <input type="text" name="in-pipe-days" id="in-pipe-days" ms-duplex="data.inPipeDays"
                            ms-keyup="onlyNum('inPipeDays')" autocomplete="off" placeholder="请输入数字">
                        <span class="unit">天</span>
                    </td>
                </tr>
                <tr ms-if="editFlag !== 'out'">
                    <th>管路型号：</th>
                    <td>
                        <input type="text" name="pipe-modl" id="pipe-modl"
                        ms-data-dictkey="data.pipeType + 'pipeModl'" ms-duplex="data.pipeModl"
                        autocomplete="off">
                    </td>
                    <th>有效天数：</th>
                    <td>
                        <input type="text" name="vld-day" id="vld-day" ms-duplex="data.vldDay"
                        ms-blur="onlyNum('vldDay')" autocomplete="off" placeholder="请输入数字">
                        天
                    </td>
                </tr>
                <tr ms-if="editFlag !== 'out'">
                    <th>管路长度：</th>
                    <td>
                        <input type="text" name="pipe-leng" id="pipe-leng" ms-duplex="data.pipeLeng"
                        ms-blur="onlyNum('pipeLeng')" autocomplete="off" placeholder="请输入数字">
                        cm
                    </td>
                    <th>内置长度：</th>
                    <td>
                        <input type="text" name="pipe-dpth" id="pipe-dpth" ms-duplex="data.pipeDpth"
                        ms-blur="onlyNum('pipeDpth')" autocomplete="off" placeholder="请输入数字">
                        cm
                    </td>
                </tr>
                <tr ms-if="editFlag === 'add' || editFlag === 'edit'">
                    <th>置管备注：</th>
                    <td colspan="3">
                        <input type="text" name="in-memo"  class="pipeMemo" id="in-memo" ms-duplex="data.inMemo" autocomplete="off">
                    </td>
                </tr>
                <tr ms-if="editFlag === 'chg' ||(editFlag === 'edit' && data.pipeStat !== '10')">
                    <th>
                        <label for="chg-time-str"><i ms-if="editFlag === 'chg'" class="red">*</i>换管时间：</label>  
                    </th>
                    <td>
                        <input type="text" name="chg-time-str" id="chg-time-str" class="Wdate"
                        ms-duplex="data.chgTimeStr" ms-click="timePickerM()" autocomplete="off"> 
                    </td>
                    <th>换管天数：</th>
                    <td>
                        <input type="text" name="chg-pipe-days" id="chg-pipe-days" ms-duplex="data.chgPipeDays"
                        ms-blur="onlyNum('chgPipeDays')" autocomplete="off" placeholder="请输入数字">
                        天
                    </td>
                </tr>
                <tr ms-if="editFlag === 'chg' || (editFlag === 'edit' && data.pipeStat !== '10')">
                    <th>换管备注：</th>
                    <td colspan="3">
                        <input type="text" name="chg-memo"  class="pipeMemo" id="chg-memo" ms-duplex="data.chgMemo"
                        autocomplete="off">
                    </td>
                </tr>
                <tr ms-if="editFlag === 'out' || (editFlag === 'edit' && data.pipeStat === '30')">
                    <th><i class="red">*</i>拔管类型：</th>
                    <td colspan="3">
                        <span>
                            <label>
                                <input type="checkbox" name="out-type" value="1" ms-duplex="data.outType"
                                    autocomplete="off" ms-click="singleCheck(data, 'outType', $event)">
                                <span class="label-title">计划拔管</span>
                            </label>
                            <label>
                                <input type="checkbox" name="out-type" value="2" ms-duplex="data.outType"
                                    autocomplete="off" ms-click="singleCheck(data, 'outType', $event)">
                                <span class="label-title">非计划拔管</span>
                            </label>
                        </span>
                    </td>
                </tr>
                <tr ms-if="editFlag === 'out' || (editFlag === 'edit' && data.pipeStat === '30')">
                    <th>
                        <label for="out-time-str"><i ms-if="editFlag === 'out'" class="red">*</i>拔管时间：</label>
                    </th>
                    <td colspan="3">
                        <input type="text" name="out-time-str" id="out-time-str" class="Wdate"
                        ms-duplex="data.outTimeStr" ms-click="timePickerM()" autocomplete="off">
                    </td>
                </tr>
                <tr ms-if="editFlag === 'out' || (editFlag === 'edit' && data.pipeStat === '30')">
                    <th>拔管备注：</th>
                    <td colspan="3">
                        <input type="text" class="pipeMemo" name="out-memo" id="out-memo" ms-duplex="data.outMemo"
                        autocomplete="off">
                    </td>
                </tr>
                
                <tr>
                    <td colspan="4" class="last_td">
                    <div class="center grp_btn">
                        <a class="easyui-linkbutton noIcon" ms-if="editFlag === 'edit'" onclick="showHis()">显示历史</a>
                        <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="saveAll('close')">保存</a>
                        <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                    </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <div id="hisContainer" ms-if="editFlag === 'chg' || editFlag === 'edit'" ms-class="hisActive === '1' ? 'active' : ''">
        <table id="pipeHis"></table>
    </div>
    <script type="text/javascript">
        var TODAYDATESTAMP = new Date().getTime();
        var DAYLENGTH = 24 * 60 * 60 * 1000;
        var HIS_H = 350;

        var _baseUrl = '${baseurl}';
        var _emgSeq = parent._emgSeq;
        var editFlag = parent.getEditFlag();
        var pRowData = {};
        var initHisFlag = false;
        var hisMap = {}; //查询Map

        var watchFlag = '0'; //监听变化flag
        var vm = avalon.define({
            $id: 'editPipe',
            infocodeList: [], //管路类型列表
            editFlag: editFlag,
            hisActive: true,
            data: {
                pipeSeq: '',
                pipeName: '',
                pipeType: '', //管路类型
                bodyPart: '', //身体部位
                inType: '',	//置管类型
                inTime: '', //置管时间
                inMemo:'',
                inPipeDays: '', //置管天数
                pipeModl: '', //管路型号
                vldDay: '', //有效天数
                pipeLeng: '', //管路长度
                pipeDpth: '', //内置长度
                pipeStat: '', //管路状态
                pipeStatStr: '',
                // skinSitu: '', //皮肤状况
                chgTimeStr: '', //换管时间
                chgPipeDays: '', //换管天数
                chgMemo: '', //换管备注
                outTimeStr: '', //拔管时间
                outMemo: '', //拔管备注
                outType: [] //拔管类型，默认计划拔管
            },
            singleCheck: function (obj, attr, e) {
                var thisVal = e.target.value;
                var curVal = obj[attr][0];
                if ((attr === 'outType' && curVal === thisVal) || curVal !== thisVal) {
                    obj[attr] = [thisVal]
                } else {
                    obj[attr].clear()
                }
            },
            timePickerM: function (e) {
                e.stopPropagation();
                var option = {
                    dateFmt: 'yyyy/MM/dd HH:mm',
                    maxDate: '%y/%M/%d %H:%m'
                };
                var targetId = e.target.id;
                if (targetId === 'in-time-str' || targetId === 'chg-time-str') {
                    option.onpicked = function () {
                        var thisTimeStamp = new Date(e.target.value.substring(0, 10).replace(/\//g,
                            "-")).getTime();
                        var type = targetId.replace('-time-str', '');
                        var pipeDays = Math.ceil((TODAYDATESTAMP - thisTimeStamp) / DAYLENGTH) ||
                            ""; //如果是0天，置空
                        vm.data[type + 'PipeDays'] = pipeDays;
                    }
                }
                WdatePicker(option);
            },
            
            // onlyNum: function (attr, step, max) { //限定只能输入数字
            //     vm.data[attr] = publicFun.onlyNumber(recordvm.recordMsg[attr], step, max);
            // },
            onlyNum: function (attr) {
                var resetVal = parseFloat(vm["data"][attr]);
                var type = '';
                if (isNaN(resetVal)) {
                    resetVal = "";
                }
                vm["data"][attr] = resetVal;
                if (resetVal !== '') {
                    if (attr === 'inPipeDays' || attr === 'chgPipeDays') {
                        type = attr.replace('PipeDays', '');
                        var timeStamp = TODAYDATESTAMP - (resetVal - 1) * DAYLENGTH;
                        var timeStr = publicFun.timeFormat(timeStamp, "yyyy/MM/dd hh:mm");
                        vm.data[type + 'TimeStr'] = timeStr;
                    }
                }
            }
        })

        function getTimeStamp(dateStr) {
            return new Date(dateStr.replace(/\//ig, "-").replace(" ", "T")).getTime();
        }
        /**
         * 获取管路类型等字典
         */
        function getPipeDicList() {
            var reqUrl = '${baseurl}icuPipe/getPipeDictList.do';
            var reqParam = {'emgSeq': _emgSeq ,'editPageFlag':1};
            publicFun.httpServer({url:reqUrl}, reqParam,function (res) {
              if (!res.resultInfo.success) {
                $.messager.alert('提示信息','请求出错，请联系管理员','warning');
                  return;
              }
              var infocodeList = parent._pipeDefList;
              hisMap = {};
              if (infocodeList && infocodeList.length > 0) {
                  hisMap.bodyPart = [];
                  hisMap.pipeModl = [];
                  hisMap.pipeName = [];
                  console.log(hisMap)
                  vm.infocodeList = infocodeList;
                  if (editFlag === 'add') {
                      vm.data.pipeType = infocodeList[0].infocode;
                      vm.data.inType = '1';
                  }
              } else {
                $.messager.alert('提示信息','无管路列表信息','warning');
              }
          })
        }
        /**
         * 数据初始化
         */
        function initData() {
            var rowDataVal;
            var pipeStatStr = '';
            $.each(vm.data, function (k) {
                if (vm.data.hasOwnProperty(k)) {
                    rowDataVal = pRowData[k];
                    if (k === 'pipeStatStr') {
                        switch (pRowData.pipeStat) {
                            case "10":
                                pipeStatStr = "已置管";
                                break;
                            case "20":
                                pipeStatStr = "已换管";
                                break;
                            case "30":
                                pipeStatStr = "已拔管";
                                break;
                        }
                        vm.data[k] = pipeStatStr;
                    } else if (k === 'outType') {
                        if (editFlag === 'out') {
                            vm.data[k] = [rowDataVal || '1'] //默认拔管类型为计划拔管
                        } else {
                            vm.data[k] = [rowDataVal || ''] //默认拔管类型为计划拔管
                        }
                    } else if(k === 'inType'){
                    	vm.data[k] = [rowDataVal || '1']
                    }else {
                        vm.data[k] = rowDataVal === null ? '' : rowDataVal;
                    }
                }
            })
        }
        /**
         * 显示历史
        */
        function showHis() {
            var activeCssObj = {
                height: HIS_H,
                'opacity': 1
            }
            var normalCssObj = {
                height: 0,
                'opacity': 0
            }
            var $hisContainer = $('#hisContainer');
            if ($hisContainer.hasClass('active')) {
                event.target.innerText = '显示历史'
                $hisContainer.css(normalCssObj).removeClass('active')
            } else {
                event.target.innerText = '隐藏历史'
                $hisContainer.css(activeCssObj).addClass('active')
                setTimeout(function () {
                    if (initHisFlag) {
                        $('#pipeHis').datagrid('reload')
                    } else {
                        initHis(vm.data.pipeSeq);
                    }
                }, 400)
            }
        }
        /**
         * 管路历史
         */
        function initHis(pipeSeq) {
            var hisRowData;
            var requestUrl = '${baseurl}icuPipe/findPipeInfoHis.do';
            var requestData = {
                'pipeSeq': pipeSeq
            };
            publicFun.httpServer({url:requestUrl,isAsync:false}, requestData, function (res) {
                if (res.resultInfo && res.resultInfo.messageCode == '0') {
                    $.messager.alert('提示信息','请求出错,请联系管理员','error')
                    return;
                }
                hisRowData = res.rows;
            })
            if (hisRowData) {
                var columns_v = [
                    [{
                        field: 'pipeName',
                        title: '管路名称',
                        width: 60,
                        align: 'center'
                    }, {
                        field: 'bodyPart',
                        title: '身体部位',
                        width: 60,
                        align: 'center'
                    }, {
                        field: 'pipeStat',
                        title: '管路状态',
                        width: 60,
                        align: 'center',
                        formatter: function (value, row, idx) {
                            var reVal = '';
                            switch (value) {
                                case '10':
                                    reVal = '已置管';
                                    break;
                                // case '11': reVal = '重新置管'; break;
                                case '20':
                                    reVal = '已换管';
                                    break;
                                // case '21': reVal = '二次换管'; break;
                                // case '22': reVal = '三次换管'; break;
                                case '30':
                                    reVal = '已拔管';
                                    break;
                            }
                            return reVal;
                        }
                    }, {
                        field: 'vldDay',
                        title: '有效天数',
                        width: 60,
                        align: 'center'
                    }, {
                        field: 'pipeModl',
                        title: '管路型号',
                        width: 60,
                        align: 'center'
                    },
                    // {
                    //     field: 'skinSitu',
                    //     title: '皮肤状况',
                    //     width: 150,
                    // }, 
                    {
                        field: 'inTime',
                        title: '置管时间',
                        width: 110,
                        align: 'center'
                    }, {
                        field: 'inMemo',
                        title: '置管备注',
                        width: 150,
                    }, {
                        field: 'chgTimeStr',
                        title: '换管时间',
                        width: 110,
                        align: 'center'
                    }, {
                        field: 'chgMemo',
                        title: '换管备注',
                        width: 150,
                    }, {
                        field: 'outTimeStr',
                        title: '拔管时间',
                        width: 110,
                        align: 'center'
                    }, {
                        field: 'outType',
                        title: '拔管类型',
                        width: 110,
                        align: 'center',
                        formatter: function (value, row, idx) {
                            if (value) {
                                if (value === '1') {
                                    return '计划拔管'
                                } else {
                                    return '非计划拔管'
                                }
                            } else {
                                return '';
                            }
                        },
                        styler: function (value, row, idx) {
                            if (value !== '1') {
                                return 'color: red'
                            }
                        }
                    }, {
                        field: 'outMemo',
                        title: '拔管备注',
                        width: 150,
                    }, {
                        field: 'pipeLeng',
                        title: '管路长度<span class="unit">cm</span>',
                        width: 80,
                        align: 'center'
                    }, {
                        field: 'pipeDpth',
                        title: '内置长度<span class="unit">cm</span>',
                        width: 80,
                        align: 'center'
                    }, {
                        field: 'modTimeStr',
                        title: '操作时间',
                        width: 120,
                        align: 'center'
                    }, {
                        field: 'modUserStr',
                        title: '操作人',
                        width: 80,
                        align: 'center'
                    }]
                ]
                $('#pipeHis').datagrid({
                    nowrap: false,
                    rownumbers: true,
                    striped: true,
                    singleSelect: true,
                    idField: 'modTime',
                    columns: columns_v,
                    data: hisRowData,
                    showFooter: true,
                    loadMsg: '',
                    onLoadSuccess: function () {
                        initHisFlag = true;
                    }
                });
            }
        }

        /**
         * 保存
         */
        function saveAll(closeFlag) {
            var requestUrl = '';
            var requestParam = {};
            var icuPipeInfoCustom = {'emgSeq': _emgSeq,};
            var inTime = vm.data.inTime;
            var inTimeStamp = getTimeStamp(inTime);
            var chgTimeStr = vm.data.chgTimeStr;
            var chgTimeStamp = chgTimeStr ? getTimeStamp(chgTimeStr) : pRowData.chgTime;
            var outTimeStr = vm.data.outTimeStr;
            var outTimeStamp = outTimeStr ? getTimeStamp(outTimeStr) : pRowData.outTime;
            if (editFlag === 'chg' || editFlag === 'out') {
                requestUrl = '${baseurl}icuPipe/editPipeSubmit.do';
            } else {
                //新增和修改根据pipeSeq改
                requestUrl = '${baseurl}icuPipe/mergePipeSubmit.do';
            }
            if (vm.data.pipeType === "") {
                $.messager.alert('提示信息',"管路类型不能为空",'warning')
                return;
            }
            if (vm.data.pipeName === "") {
                $.messager.alert('提示信息',"管路名称不能为空",'warning')
                return;
            }
            if (vm.data.inTime === "") {
                $.messager.alert('提示信息',"置管时间不能为空",'warning');
                return;
            }
            //             if (vm.data.vldDay === "") {
            //                 alert_warn("有效天数不能为空");
            //                 return;
            //             }
            if (vm.data.bodyPart === "") {
                $.messager.alert('提示信息',"身体部位不能为空",'warning');
                return;
            }
            if (editFlag === "chg") {
                if (chgTimeStr === "") {
                    $.messager.alert('提示信息',"换管时间不能为空",'warning');
                    return;
                }
                if (pRowData.chgTime && chgTimeStamp <= pRowData.chgTime) {
                    $.messager.alert('提示信息',"本次换管不能早于上次换管时间",'warning');
                    return;
                }
            } else if (editFlag === "out") {
                if (!outTimeStr) {
                    $.messager.alert('提示信息',"拔管时间不能为空",'warning');
                    return;
                }
            }
            if (editFlag !== 'add') {
                //如果不是新增类型，进行时间比较
                if (inTimeStamp === null) {
                    $.messager.alert('提示信息',"数据出错，请联系管理员",'error');
                    return;
                }
                if (chgTimeStamp && chgTimeStamp <= inTimeStamp) {
                    $.messager.alert('提示信息',"换管时间不能早于置管时间",'warning');
                    return;
                }
                if (chgTimeStamp && outTimeStamp && chgTimeStamp >= outTimeStamp) {
                    $.messager.alert('提示信息',"拔管时间不能早于换管时间",'warning');
                    return;
                }
                if (outTimeStamp && outTimeStamp <= inTimeStamp) {
                    $.messager.alert('提示信息',"拔管时间不能早于置管时间",'warning');
                    return;
                }
                if (outTimeStamp && chgTimeStamp && outTimeStamp <= chgTimeStamp) {
                    $.messager.alert('提示信息',"拔管时间不能早于换管时间",'warning');
                    return;
                };
            }
            $.each(vm.data, function (k, v) {
                if (vm.data.hasOwnProperty(k)) {
                    if (k === 'outType' ||k === 'inType') {
                        icuPipeInfoCustom[k] = v[0];
                    }else {
                        icuPipeInfoCustom[k] = v;
                    }
                }
            })
            if(editFlag == 'edit'){
                icuPipeInfoCustom['chgTime'] = vm.data.chgTimeStr;
                icuPipeInfoCustom['outTime'] = vm.data.outTimeStr;
            }
            requestParam.icuPipeInfoCustom = icuPipeInfoCustom;
            publicFun.httpServer({url:requestUrl,requestDataType:'json'}, requestParam, function (res) {
                message_alert(res);
                if (res.resultInfo.success) {
                    parent.$('#icuPipe').datagrid('reload');
                    if (closeFlag) {
                        parent.$.messager.alert('提示信息',res.resultInfo.message,'success');
                        parent.closemodalwindow();
                    } else {
                        if (editFlag === 'edit') {
                            // initHis(vm.data.pipeSeq);
                            // $('#pipeHis').datagrid('reload');
                        } else if (editFlag === 'add' && !vm.data.pipeSeq) {
                            vm.data.pipeSeq = res.resultInfo.sysdata.pipeSeq;
                        }
                    }
                }
            })
        }
        //获取时间
        function setTime() {
            var todayStamp = new Date().getTime();
            var todayStr = publicFun.timeFormat(todayStamp, 'yyyy/MM/dd HH:mm')
            return {
                todayStr: todayStr
            };
        };
        /**
         * 设置高度
         */
        function setGridLayout() {
            var WINDOW_H = $(window).height();
            var EDITBOX_H = $('#edit-box').height() + parseInt($('#edit-box').css('margin-bottom')) || 0;
            var SAVEBAR_H = 44;
            var WINDOW_W = $(window).width();
            $('#pipeHis').height(HIS_H - 20).width(WINDOW_W * 0.98)
        }
  

        $(function () {
            if (editFlag !== 'add') {
                pRowData = parent.$('#icuPipe').datagrid('getSelected');
                initData();
                if (editFlag === 'edit') {
                    // setTimeout(function () {
                    setGridLayout(); initHis(vm.data.pipeSeq);
                    //     // initHis(pRowData.pipeSeq);
                    // }, 100)
                }
            }
            getPipeDicList()//获取模板信息
        });
    </script>
</body>

</html>