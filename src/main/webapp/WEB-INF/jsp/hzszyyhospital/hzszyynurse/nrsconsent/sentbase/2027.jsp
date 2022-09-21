<div id="ws2027">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
            <div class="tys receTp">
                <!-- <p class="hospitalname">${hospitalPlatformNameGap}</p>  -->
                <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
                <p class="functiontitle">危重患者外出转运单</p>
                <div class="basicDiv zdDiv">
                    <label class="firstlab">时间：<input class="Wdate spcWdate" id="time1" type="text" name="hspHzzyjjInfCustom.hzzyjjDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" ms-duplex-string="receitpMsg.hzzyjjDat" readonly unselectable='on'><slabel>
                    <label>科室：${hspemginfCustom.emgFkCod}</label>
                    <label>床号：${hspemginfCustom.emgBed}</label>
                    <label>姓名：${hspemginfCustom.cstNam}</label>
                    <label class="lastlab">住院号：<input class="text" id="qxZyh" type="text"/></label><br/>
                </div>
                <div class="zdDiv basicDiv">
                    <!-- <span class="leftspan firstlab">诊断：</span> -->
                    <span class="smalltitle firstlab" style="margin-top: 1mm;">诊断</span>
                    <input type="text" id="show_text" value="${hspemginfCustom.jbzdDes}"></input>
                </div>
                <div class="cleanAll"></div>
<!--                 <p class="functiontitle">危重患者外出转运单</p> -->
                <div class="wrapperDiv">
                    <table class="managetable recpTable">
                        <colgroup>
                            <col width="5%">
                            <col width="10%">
                            <col width="10%">
                            <col width="15%">
                            <col width="10%">
                            <col width="10%">
                            <col width="5%">
                            <col width="10%">
                            <col width="10%">
                            <col width="15%">
                        </colgroup>
                        <tr>
                            <td class="tleTd bolderfont" colspan="9">
                                <label>准备项目</label>
                            </td>
                            <td class="tleTd bolderfont">
                                <label>转运前确定</label>
                            </td>
                        </tr>
                        <tr>
                            <td rowspan="15" class="tleTd bolderfont">
                                <span class="titlespan">转<br/>运<br/>前<br/>准<br/>备</span>
                            </td>
                            <td class="indentTd" colspan="8">
                                <label>通知检查科室，打印检查单，出发前通知电梯</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8"> 
                                <div class="marginVal">
                                    <label>气管导管</label>
                                    <!-- <label class="checklabel">
                                        <input type="checkbox" name="skinVal" class="skinValLast" value="sublastOne">Oral
                                        <input type="text" class="smallInput tableInput" maxlength="4" onkeyup="Toradiocheck(this,'skinVal')" name="skinValInputsub"> cm
                                    </label> -->
                                    <label class="checklabel">
                                        <input type="checkbox" name="skinVal" class="skinValLast" value="lastOne">ETT
                                        <input type="text" class="smallInput tableInput" maxlength="4" onkeyup="Toradiocheck(this,'skinVal')" name="skinValInput"> cm
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="skinVal">TT
                                    </label>
                                </div>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>储氧面罩，呼吸皮囊，性能检查</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>小钢瓶氧气充足<span class="bolderfont">（建议氧气浓度<=40%,钢瓶压力>3MPa;氧浓度>40%,钢瓶压力>5MPa）</span>性能检查</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>转送用呼吸机功能正常（带呼吸延长管，防因呼吸管路太短而气管插管滑落）</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>监护仪功能正常</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>管路通畅（IV、导尿管、胸腔引流管、各类引流管等）安置妥当</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>出发前脑室引流管等夹管，妥善固定</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>微泵电量充足</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>静脉输液量足够(含IV，TPN，血制品等)</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>必要时准备：外出抢救箱、吸引器</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>药物注射有标签且速度正常：</label>
                                <br/>
                                <div class="divwrapper">
                                    <div class="middleDiv" id="medicineDiv">
                                        微泵 1: <span>药物 <input type="text" class="wbInput tableInput" maxlength="150"></span>
                                        <span class="extralab"> 总量 <input type="text" class="smallInput tableInput" maxlength="4" onkeyup="exchangetonum(this)"> ml</span>
                                        <span class="extralab"> 走速 <input type="text" class="smallInput tableInput" maxlength="6">ml/h</span>
                                    </div>
                                    <div>
                                        微泵 2: <span>药物 <input type="text" class="wbInput tableInput" maxlength="150"></span>
                                        <span class="extralab"> 总量 <input type="text" class="smallInput tableInput" maxlength="4" onkeyup="exchangetonum(this)"> ml</span>
                                        <span class="extralab"> 走速 <input type="text" class="smallInput tableInput" maxlength="6"> ml/h</span> 
                                    </div>
                                </div>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>床栏功能正常并拉上，床单牢度足够</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>   
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>陪同人员：</label>
                                <label class="checklabel">
                                    <input type="checkbox">医生
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">护士
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">病人家属
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">工友
                                </label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>   
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>双人检查核对：</label>
                                <span class="spanbox relative">
                                    <span>转运者签名</span>
                                    <input type="text" class="tableInput" id="userSign" maxlength="10">
                                    <div class="userList Listpos" id="userList">
                                    </div>
                                </span>
                                <span class="relative">
                                    <span>核查者签名</span>
                                    <input type="text" class="tableInput" id="username" maxlength="10">
                                    <div class="userList" id="userNameList">
                                    </div>
                                </span>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox" >完成
                                </label>
                            </td>   
                        </tr>
                        <tr>
                            <td rowspan="4" class="tleTd bolderfont">
                                <span class="titlespan">途<br/>中<br/>记<br/>录</span>
                            </td>
                            <td class="indentTd"><label>时间</label></td>
                            <td class="indentTd"><label>HR 次/分</label></td>
                            <td class="indentTd"><label>BP mmHg</label></td>
                            <td class="indentTd"><label>R 次/分</label></td>
                            <td class="indentTd"><label>SpO2 %</label></td>
                            <td colspan="4" class="indentTd"><label>病情与观察</label></td>
                        </tr>
                        <tr>
                            <td class="indentTd">
                                <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
                            </td>
                            <td class="indentTd">
                                <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td class="indentTd">
                                <input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">/<input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td class="indentTd">
                                <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td class="indentTd">
                                <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td colspan="4" class="indentTd">
                                <input type="text" class="bqgcintext tableInput" maxlength="50">
                            </td>   
                        </tr>
                        <tr>
                            <td class="indentTd">
                                <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
                            </td>
                            <td class="indentTd">
                                <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td class="indentTd">
                                <input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">/<input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td class="indentTd">
                                <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td class="indentTd">
                                <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
                            </td>
                            <td colspan="4" class="indentTd">
                                <input type="text" class="bqgcintext tableInput" maxlength="50">
                            </td>   
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="10">
                                <ul class="ulwrapper">
                                    <li>转运过程中发生的问题(请于转运完成填写)：</li>
                                    <li>
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="radioCheck(this,'radioNo','subradio')" value="no" class="radioNo" name="radioNo">无
                                        </label>
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="radioCheck(this,'radioNo','subradio')" value="yes" class="radioNo radioNoLast">有,请继续勾选以下项目，并提出通报
                                        </label> 
                                    </li>
                                    <li>
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">呼吸停止
                                        </label> 
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">心跳停止
                                        </label> 
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">跌倒
                                        </label> 
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">气管插滑脱
                                        </label> 
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">其他管路滑落
                                        </label> 
                                        <label class="checklabel">
                                            <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio subradioLast" value="lastOne">其他
                                        </label>
                                    </li>
                                </ul>
                            </td>
                        </tr>
                        <tr>
                            <td class="tleTd bolderfont" colspan="9">
                                <label>转运后患者和物品的安置、归位</label>
                            </td>
                            <td class="tleTd bolderfont">
                                <label>转运后确认</label>
                            </td>
                        </tr>
                        <tr>
                            <td rowspan="6"  class="tleTd bolderfont">
                                <span class="titlespan">转<br/>运<br/>后<br/>安<br/>置<br/>项<br/>目</span>
                            </td>
                            <td class="indentTd" colspan="8">
                                <label>1、患者安置妥当，查看呼吸机、监护仪、微泵等运行正常；</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox">完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>2、管道通畅（IV、导尿管、胸腔闭式引流管、各类引流管等）安置妥当，通畅；</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox">完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>3、脑室引流管等，妥善固定，重新开放；</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox">完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>4、转运监护仪导线整理、归位并充电；</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox">完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="8">
                                <label>5、转运呼吸机：归位、充电、管道消毒，及时安装管路备用；<span class="bolderfont">小钢瓶氧气压力检查<=3MPa时，取下减压表，做好“空”标志，并通知工人送到供氧中心，同时将新氧气钢瓶连接呼吸机，并试机备用。</label>
                            </td>
                            <td class="indentTd">
                                <label class="checklabel">
                                    <input type="checkbox">完成
                                </label>
                            </td>
                        </tr>
                        <tr>
                            <td class="indentTd" colspan="9">
                                <span class="spanbox relative">
                                    转运护士签名
                                    <input type="text" class="tableInput" id="doubleuserSign" maxlength="10">
                                    <div class="userList Listpos" id="doubleuserList">   
                                    </div>
                                </span>
                                <span class="relative">
                                    核查护士签名
                                    <input type="text" class="tableInput" id="doubleusername" maxlength="10">
                                    <div class="userList" id="doubleuserNameList">
                                    </div>
                                </span>
                                <span>日期/时间
                                    <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
                                </span>
                            </td>
                        </tr>
                    </table>
                    <div class="extraDiv">
                        备注：完成患者转运后，此表由科室存档保存2年备案。
                    </div>
                </div>
            </div>
         </div>
        <script type="text/javascript">    
        function exchangetonum(it){
            it.value=it.value.replace(/[^\d]/g,'');
        }
        function Toradiocheck (it,node) {
            exchangetonum(it);
            if($(it).val() !='' ){
                $("input[name="+node+"]").attr("checked",false);
                if($(it).parent().find('.' + node + 'Last').val() != 'lastOne') {
                    $("input[name="+node+'Input'+"]").val('');
                }
                if($(it).parent().find('.' + node + 'Last').val() != 'sublastOne') {
                    $("input[name="+node+'Inputsub'+"]").val('');
                }
                $(it).parent().find('.' + node + 'Last').attr("checked",true);
            }
        }
        function radioCheck(current,items,subitems) {
                if($(current).attr('checked')){
                    $('.' + items).attr("checked",false);
                    $(current).attr('checked',true);
                    if($(current).val() == 'no') {
                        $('.' + subitems).attr("checked",false);
                        $("input[name="+items+'Input'+"]").val('');
                        $("input[name="+subitems+'Input'+"]").val('');
                    }
                }else{
                    if($(current).val() == 'yes') {
                        $('.' + subitems).attr("checked",false);
                        $("input[name="+items+'Input'+"]").val('');
                        $("input[name="+subitems+'Input'+"]").val('');
                    }
                }
           }
    
        function subCheck(current,items,isCheck,thisItems) {
            if($(current).attr('checked')){
                $('.' + items)[0].checked = false;
                $('.' + items)[1].checked = true;
                if(isCheck == 'true') {
                    $('.' + thisItems).attr("checked",false);
                    if($(current).val() != 'lastOne') {
                        $("input[name="+items+'Input'+"]").val('');
                    }
                }
                $(current).attr('checked',true);
            }else{
                if($(current).val() == 'lastOne') {
                    $("input[name="+items+'Input'+"]").val('');
                }
            }
        }

        $(function(){
        	if (!$('#time1').val()) {
        	    $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
        	}
        })
        </script>
        