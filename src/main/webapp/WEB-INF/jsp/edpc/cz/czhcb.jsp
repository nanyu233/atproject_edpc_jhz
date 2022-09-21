<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>胸痛患者登记——打印页</title>
    <script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body>
<div ms-controller="printCzhcb" id="printCzhcb"
     style="display:none;width:210mm;height:297mm;font-family: '微软雅黑';margin:0 auto;">
    <!--     	<div class="logoDivZJ"> -->
    <!-- 			<img style="width:15mm" src="../images/hems/print/printLogo.jpg"> -->
    <!-- 		</div> -->
    <div class="titleDivJZ">
        <div id="docuTitle" class="docuTitleBaisc">浙江医院三墩院区急诊科脑卒中溶栓流程核查表</div>
    </div>
    <div>
        <table border="1" cellpadding="4" style="border-collapse: collapse;margin-bottom: 1px;">
            <tr>
                <th>确认时间</th>
                <td colspan="1" style="text-align:center">姓名：{{printMsg.cstNam}}</td>
                <td colspan="1" style="text-align:center">性别：{{printMsg.cstSexCod}}</td>
                <td colspan="1" style="text-align:center">年龄：{{printMsg.cstAge}}</td>
                <td colspan="2" style="text-align:center">日期：{{printMsg.emgDat2}}</td>
                <th>备注</th>
            </tr>
            <tr>
                <td rowspan="2">
                    {{printMsg.emgDat}}
                </td>
                <td colspan="5">
                    <label><i class="red">*</i>入院，确认神经缺损症状表现:</label>
                    <label ms-repeat="systemList.qrsjqszzbxList" ms-attr-for="qrsjqszzbx{{el.infocode}}"
                           class="checklabel">
                        <input ms-attr-id="qrsjqszzbx{{el.infocode}}" name="qrsjqszzbxCheck" type="checkbox"
                               ms-attr-checked="el.checked">{{el.info}}
                    </label>
                    <input type="hidden" ms-duplex-string="sysdata.qrsjqszzbx" id="qrsjqszzbx">
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label><i class="red">*</i>确认发病时间:</label>
                    <label ms-repeat="systemList.qrfbsjCodList" ms-attr-for="qrfbsjCod{{el.infocode}}"
                           class="checklabel">
                        <input ms-attr-id="qrfbsjCod{{el.infocode}}" name="qrfbsjCodCheck" type="checkbox"
                               ms-attr-checked="el.checked" ms-click="setRadio('qrfbsjCod',$index)">{{el.info}}
                    </label>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{{printMsg.illTim}}小时
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td rowspan="7">
                    {{printMsg.emgDat}}
                </td>
                <td colspan="5">
                    <label>启动溶栓流程:</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox" checked="checked">将溶栓流程核查表交于抢救室责任护士
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" checked="checked">通知外勤转运工人（电话：7065）
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" checked="checked">通知神经内科（电话：15381019710，短号：363039）
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label>医嘱及护理:</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox" value="1" ms-attr-checked="1">监护，吸氧
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox">血常规+CRP
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">血生化+cTNI
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">凝血功能+D2
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">术前四项
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">！ 快速血糖
                    </label>
                    <input type="text" class="intextinput">mmol/L
                    <!-- <label class="checklabel">
                      <input type="checkbox">在病人左上肢用20号红色留置针建立静脉通路，采血结束后10ml生理盐水快速冲管封管
                    </label> -->
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label class="checklabel">
                        <input id="ctaFlg" type="checkbox">头颅CTA，
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">同时将头颅CTA导引单交给外勤送放射科
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox">责任护士打印病人基本信息标贴及加急标识红圆圈，
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">在病人左上肢用20号红色留置针建立静脉通路，采血结束后10ml生理盐水快速冲管封管
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">完成实验室血标本采集后送检
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>

            <tr>
                <td></td>
                <td colspan="5">
                    <label>完成各项告知:</label>
                    <label class="checklabel">
                        <input id="djtysFlg" ms-duplex="printMsg.djtysFlg" type="checkbox">碘剂同意书（CTA检查前必须完成）
                    </label>
                    <label class="checklabel">
                        <input id="sqsFlg"  ms-duplex="printMsg.sqsFlg" type="checkbox">授权书
                    </label>
                    <label class="checklabel">
                        <input id="bwbzgzsFlg"  ms-duplex="printMsg.bwbzgzsFlg" type="checkbox">病危病重告知书
                    </label>
                    <label class="checklabel">
                        <input if="wzbrzytzsFlg"  ms-duplex="printMsg.wzbrzytzsFlg" type="checkbox">危重病人转运通知书
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
                    <input class="Wdate dayWdate" ms-duplex-string="printMsg." id="sjnkrsxzddDat" type="text"
                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'sjnkrsxzddDat')" readonly unselectable='on'>
                </td>
                <td colspan="5">
                    <label>神经内科溶栓小组到达时间</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
<%--                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.WQDDSJ" id="WQDDSJ" type="text"--%>
<%--                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'wqddDat')" readonly unselectable='on'>--%>
                    {{printMsg.WQDDSJ}}
                </td>
                <td colspan="5">
                    <label>外勤到达时间</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
<%--                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.wcffDat" id="wcffDat" type="text"--%>
<%--                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'wcffDat')" readonly unselectable='on'>--%>
                    {{printMsg.wcffDat}}
                </td>
                <td colspan="5">
                    <label>完成付费时间</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td rowspan="3">
                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.sctajcDat" id="sctajcDat" type="text"
                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'sctajcDat')" readonly unselectable='on'>
                </td>
                <td colspan="5">
                    <label>送CTA检查:</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label>检查前确认:</label>
                    <label class="checklabel">
                        <input type="checkbox">生命体征稳定
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" ms-duplex="printMsg.">检查单
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" ms-attr-value="1" ms-duplex="printMsg.djtysFlg">碘剂同意单
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">发票
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label>选择性携带:</label>
                    <label class="checklabel">
                        <input type="checkbox">氧气
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">转运宝
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">冲管盐水
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">吸引器
                    </label>
                    <label class="checklabel">
                        <input type="checkbox">除颤仪
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
                    <input class="Wdate dayWdate" type="text" ms-duplex-string="printMsg.fhqjsDat" id="fhqjsDat"
                           onclick="setTimeFormatLimit('fhqjsDat', this)" readonly unselectable='on'
                           ms-duplex-string="printMsg.fhqjsDat">
                </td>
                <td colspan="5">
                    <label>返回抢救室时间</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
<%--                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.XDTSJ" id="xdtDat" type="text"--%>
<%--                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'XDTSJ')" readonly unselectable='on'>--%>
                    {{printMsg.XDTSJ}}
                </td>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox" ms-attr-value="1" ms-duplex="printMsg.xdtFlg">心电图
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
<%--                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.QSZQTYSJ01" id="QSZQTYSJ01" type="text"--%>
<%--                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'sjnkrstyqzqrDat')" readonly unselectable='on'>--%>
                    {{printMsg.QSZQTYSJ01}}
                </td>
                <td colspan="5">
                    <label>神经内科溶栓同意签字确认</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td rowspan="2"></td>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox">完成药物处方开具：爱通立，护胃，补液，改善微循环
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label>NS 50ml+爱通立针50mg,药物计算公式：体重（Kg)* 0.09ml静推（1分钟），体重（Kg)*0.81ml泵入（1小时）。（供参考）</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
<%--                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.rsywkssyDat" type="text" id="rsywkssyDat"--%>
<%--                           onclick="setTimeFormatLimit('rsywkssyDat', this)" readonly unselectable='on'--%>
<%--                           ms-duplex-string="printMsg.rsywkssyDat">--%>
                    {{printMsg.RSZLKSSJ}}
                </td>
                <td colspan="5">
                    <label>溶栓药物开始使用时间</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
<%--                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.rsywjssyDat" type="text" id="rsywjssyDat"--%>
<%--                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'rsywjssyDat')" readonly unselectable='on'>--%>
    {{printMsg.RSZLJSSJ}}
                </td>
                <td colspan="5">
                    <label>溶栓药物结束使用时间</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.fctlctDat" type="text" id="fctlctDat"
                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'fctlctDat')" readonly unselectable='on'>
                </td>
                <td colspan="5">
                    <label>复查头颅CT</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td rowspan="3"></td>
                <td colspan="5">
                    <label class="checklabel">
                        <input type="checkbox">开具住院单，协助办理住院
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label>协助家属付费/绿色通道计费</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <label>准备转运:</label>
                    <label class="checklabel">
                        <input type="checkbox">生命体征稳定
                    </label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
            <tr>
                <td>
                    <input class="Wdate dayWdate" ms-duplex-string="printMsg.szryDat" type="text" id="szryDat"
                           onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'szryDat')" readonly unselectable='on'>
                </td>
                <td colspan="5">
                    <label>收住入院</label>
                </td>
                <td>
                    <input type="text" class="intextinputlong">
                </td>
            </tr>
        </table>
        <div class="extraDiv">
            <i class="red">*</i>入院至完成颅脑CTA返回急诊总用时：<input ms-duplex-string="printMsg.ryzwclnctafhjzzys"
                                                         id="ryzwclnctafhjzzys" type="text" id="ctaTime"
                                                         class="intextinput">分钟<br/>
            <i class="red">*</i>入院至溶栓药物开始使用总用时：<input type="text" ms-duplex-string="printMsg.ryzrsywkssyzys"
                                                      id="ryzrsywkssyzys" id="rsTime" class="intextinput">分钟
        </div>
        <div class="extraDiv">
            <p style="float: right;"><i class="red">*</i>填表人员：<input type="text" ms-duplex-string="printMsg.crtusrname"
                                                                     id="crtusrname" class="intextinputlong"></p>
            <div class="crtList" id="crtuserList"></div>
        </div>
    </div>
</div>
</body>

<script type="text/javascript">
    var vm1 = avalon.define({
        $id: 'printCzhcb',
        systemList: {
            qrsjqszzbxList: [{infocode: '1', info: '肢体', checked: false}, {
                infocode: '2',
                info: '言语',
                checked: false
            }, {infocode: '3', info: '意识', checked: false}],
            qrfbsjCodList: [{infocode: '1', info: '≤3小时', checked: false}, {
                infocode: '2',
                info: '>3小时',
                checked: false
            }],
        },
        printMsg: {
            cstNam: '',
            cstSexCod: '',
            cstAge: '',
            emgDat: '',
            emgDat2: '',
            illTim: '',
            clbzFlg: '',
            xcgCrpFlg: '',
            xshCtniFlg: '',
            nxgnD2Flg: '',
            sqsxFlg: '',
            POCTksxtFlg: '',
            tlCTAFlg: '',
            djtysFlg: '',
            sqsFlg: '',
            bwbzgzsFlg: '',
            wzbrzytzsFlg: '',
            rsDdsj: '',
            WQDDSJ: '',
            WCFFSJ: '',
            SJSJ: '',
            FHQJSSJ: '',
            xdtFlg: '',
            XDTSJ: '',
            QSZQTYSJ01: '',
            cfkjFlg: '',
            RSZLKSSJ: '',
            RSHFCCTSJ: ''
        },
        hideMsg: {
            qrsjqszzbx: []
        },
        setRadio: function (obj, idx) {
// 			vm.sysdazprintCzhcbta[obj] = publicFun.radioClicks(vm.systemList[obj + 'List'],vm.sysdata[obj],idx)
        }
    })


    function getTimeArea(timeA, timeB) {
        var arr1 = timeB.split(" ");
        var sdate1 = arr1[0].split('/');
        var arr2 = timeA.split(" ");
        var sdate2 = arr2[0].split('/');
        var min1 = parseInt(timeB.slice(-2));
        var min2 = parseInt(timeA.slice(-2));
        var hour1 = parseInt(timeB.slice(11, 13));
        var hour2 = parseInt(timeA.slice(11, 13));
        var date1 = new Date(sdate1[0], sdate1[1] - 1, sdate1[2], hour1, min1);
        var date2 = new Date(sdate2[0], sdate2[1] - 1, sdate2[2], hour2, min2);
        var n = (date2.getTime() - date1.getTime()) / 60000;
        return n
    }


    function pickerChangeB(item) {
        if ($('#fhqjsDat').val() != '') {
            var timeB = item;
            var timeA = $('#fhqjsDat').val();
            $('#ryzwclnctafhjzzys').val(getTimeArea(timeA, timeB))
        }
        if ($('#rsywkssyDat').val() != '') {
            var timeB = item;
            var timeA = $('#rsywkssyDat').val();
            $('#ryzrsywkssyzys').val(getTimeArea(timeA, timeB))
        }
    }

    function getCzhcbInfo(emgSeq) {
        $.ajax({
            url: 'cz/getCzhcbInfoByEmgSeq.do',
            type: 'post',
            dataType: 'json',
            contentType: 'application/json;charset=UTF-8',
            data: JSON.stringify({
                'emgSeq': emgSeq
            }),
            success: function (res) {
                var resultMsg = res.resultInfo.sysdata.hspemginfCustom;
                var resultList = res.resultInfo.sysdata.list;
                vm1.printMsg.bwbzgzsFlg=res.resultInfo.sysdata.bwbzgzsFlg;
                vm1.printMsg.clbzFlg=res.resultInfo.sysdata.clbzFlg;
                vm1.printMsg.djtysFlg=res.resultInfo.sysdata.djtysFlg;
                vm1.printMsg.sqsFlg=res.resultInfo.sysdata.sqsFlg;
                vm1.printMsg.wzbrzytzsFlg=res.resultInfo.sysdata.wzbrzytzsFlg;
                for (var key in resultMsg) {
                    if (vm1.printMsg.hasOwnProperty(key)) {
                        vm1.printMsg[key] = resultMsg[key]
                        vm1.printMsg.emgDat= publicFun.timeFormat(vm1.printMsg.emgDat, 'yyyy/MM/dd hh:mm')
                    }
                }
                for(var i=0;i<resultList.length;i++){
                    vm1.printMsg[resultList[i].proCode]= publicFun.timeFormat(resultList[i].crtTime, 'yyyy/MM/dd hh:mm')

                }
                var _ckList = ['clbzFlg','xcgCrpFlg','xshCtniFlg','nxgnD2Flg','sqsxFlg','POCTksxtFlg','tlCTAFlg','djtysFlg','sqsFlg','bwbzgzsFlg','wzbrzytzsFlg','xdtFlg','cfkjFlg'];
                for (var i = 0; i < _ckList.length; i++) {
                    var _codVal = vm1.printMsg[_ckList[i]];
                    $('.' + _ckList[i]).attr('checked', false);
                    for (var j = 0; j < _codVal.length; j++) {
                        if( _codVal[j]==='1'){
                            $('#' + _ckList[i]).attr('checked', true);
                        }else{
                            $('#' + _ckList[i]).attr('checked', false);
                        }

                    }
                }
                console.log(vm1.printMsg)
            },
            error: function (err) {
            }
        });
    }


    $(function () {
        $('.logoDivZJ').css({'display': 'block', 'float': 'left', 'width': '15%', 'margin-left': '10%'});
        $('.logoDivZJ img').css({
            'vertical-align': 'middle',
            'text-align': 'center',
            'width': '15mm',
            'float': 'right',
            'margin-top': '2mm'
        });
        $('.titleDivJZ').css({
            'float': 'left',
            'margin': '0',
            'text-align': 'center',
            'width': '100%',
            'margin-top': '1mm'
        });
        $('.titleDivJZ .hosnameBasic').css({'padding': '1mm 0 0 0', 'font-size': '.55cm', 'line-height': '1.3'});
        $('.titleDivJZ .docuTitleBaisc').css({
            'padding': '1mm 0 1mm 0',
            'font-size': '.55cm',
            'line-height': '1.3',
            'font-weight': 'bolder'
        });
        $('.titleDivJZ #WSID .docuTitleBaisc2').css({
            'padding': '1mm 0 1mm 0',
            'font-size': '.5cm',
            'line-height': '1.3',
            'font-weight': 'bolder'
        });
        $('input').css({'border': 'none'});
        console.log(vm1.printMsg, 111111)

    })
</script>
</html>