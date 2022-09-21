<div id="nzz2029">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <div class="tys receTp" ms-controller="nczRecord">
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
        <div class="wrapperDiv">
            <input type="hidden" ms-duplex-string="sysdata.seqno">
            <br/>
            <div style="text-indent: 2em">
            	<label style="font-weight: bold;font-size: 125%">创伤患者符合以下情况者，请启动科室创伤流程并完成下表</label>
            </div>
            <br/>
            <div style="text-indent: 0em;font-size: 100%">
            	<label>1.	气道阻塞或窒息；</label>
            </div>
            <div style="text-indent: 0em;font-size: 100%">
            	<label>2.	呼吸障碍或突发意识丧失；</label>
            </div>
            <div style="text-indent: 0em;font-size: 100%">
            	<label>3.	心搏骤停或有休克征象或急性大出血；</label>
            </div>
            <div style="text-indent: 0em;font-size: 100%">
            	<label>4.	脉搏≤40次/min或≥180次/min；收缩压＜70mmHg或≥220mmHg；呼吸频率≤8次/min或≥36次/min；SpO2＜90%；体温＞41℃或＜32℃；GCS评分＜8分；、</label>
            </div>
            <div style="text-indent: 0em;font-size: 100%">
            	<label>5.	急诊主管医师、护士判断的其他情况。</label>
            </div>
            <br/>
            <table class="managetable recpTable">
                <tr>
                    <th rowspan="2" colspan="2">到达急诊科时间</th>
                    <td rowspan="2" style="text-align:center;" colspan="2">
                        <label>日期:</label>
                        <input class="Wdate spcWdate datedate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                    </td>
                    <td style="text-align:center;" colspan="1">
                        <label>离开急诊科时间</label>
                    </td>
                    <td style="text-align:center;" colspan="2">
                        <label>日期:</label>
                        <input class="Wdate spcWdate datedate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td style="text-align:center;" colspan="1">
                        <label>中止时间</label>
                    </td>
                    <td style="text-align:center;" colspan="2">
                        <label>日期:</label>
                        <input class="Wdate spcWdate datedate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td colspan="7" style="text-align:center;">
                        <label>T:</label>
                        <input type="text" class="intextinput" />℃;&nbsp;&nbsp;
                        <label>BP:</label>
                        <input type="text" class="intextinput" />/ <input type="text" class="intextinput" />mmHg;&nbsp;&nbsp;
                        <label>HR:</label>
                        <input type="text" class="intextinput" />次/min;&nbsp;&nbsp;
                        <label>RR:</label>
                        <input type="text" class="intextinput" />次/min;&nbsp;&nbsp;
                        <label>SpO2:</label>
                        <input type="text" class="intextinput" />%
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>GCS评分:</label>
                        <input type="text" class="intextinput" />分
                    </td>
                    <td colspan="2">
                        <label ms-repeat="systemList.eyeRctCodList" ms-attr-for="aboutGCSA{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="aboutGCSA{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('eyeRctCod',$index)">{{el.infocode}}&nbsp;{{el.info}}
                            <br>
                        </label>
                    </td>
                    <td colspan="2">
                        <label ms-repeat="systemList.lanRctCodList" ms-attr-for="aboutGCSB{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="aboutGCSB{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('lanRctCodList',$index)">{{el.infocode}}&nbsp;{{el.info}}
                            <br>
                        </label>
                    </td>
                    <td colspan="1">
                        <label ms-repeat="systemList.actRctCodList" ms-attr-for="aboutGCSC{{el.infocode}}" class="checklabel">
                            <input ms-attr-id="aboutGCSC{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('actRctCodList',$index)">{{el.infocode}}&nbsp;{{el.info}}
                            <br>
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>绿色通道（实名制）</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="chanlCod">是
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="chanlCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <th rowspan="3">MDT</th>
                    <td style="text-align:center;">
                        <label>科室</label>
                    </td>
                    <td style="text-align:center;">
                        <input type="text" class="intextinput2" />
                    </td>
                    <td style="text-align:center;">
                        <input type="text" class="intextinput2" />
                    </td>
                    <td style="text-align:center;">
                        <input type="text" class="intextinput2" />
                    </td>
                    <td style="text-align:center;">
                        <input type="text" class="intextinput2" />
                    </td>
                    <td style="text-align:center;">
                        <input type="text" class="intextinput2" />
                    </td>
                </tr>
                <tr>
                    <td style="text-align:center;">
                        <label>呼叫</label>
                    </td>
                    <td style="text-align:center;width:115px">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td style="text-align:center;">
                        <label>到达</label>
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                    <td style="text-align:center;">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>二唤呼叫</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="hlsjCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="hlsjCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>过床硬板</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="gcybCod">是
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="gcybCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>颈托</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="jtCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="jtCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>评估气道（气管插管）</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="pgqdCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="pgqdCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>评估循环</label>
                        <select id="xtSel" class="Signsel">
                            <option value="1" selected="selected">止血带</option>
                            <option value="2">压迫止血</option>
                        </select>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="pgxhCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="pgxhCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>评估循环</label>
                        <select id="xtSel" class="Signsel">
                            <option value="1" selected="selected">静脉通道18号留置针</option>
                            <option value="2">复方氯化钠500ml开通路</option>
                        </select>
                    </td>
                    <td colspan="5">
                        <label class="checklabel">
                            获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                        </label>
                        <label class="checklabel">
                            类型：
                            <input type="checkbox" name="pgxhlxCod">浅静脉
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="pgxhlxCod">深静脉
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="pgxhlxCod">骨髓腔
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" rowspan="2" colspan="2" style="text-align:center;">
                        <label>血检</label>
                        <select id="xtSel" class="Signsel">
                            <option value="1" selected="selected">血常规</option>
                            <option value="2">生化</option>
                            <option value="3">凝血</option>
                            <option value="4">感染四项</option>
                            <option value="5">血型</option>
                            <option value="6">交叉配血</option>
                            <option value="7">血气分析</option>
                        </select>
                    </td>
                    <td colspan="5">
                        <label class="checklabel">
            	采集时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                        </label>
                    </td>
               </tr>
               <tr>
                    <td colspan="5">
                        <label class="checklabel">
            	获得指标时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                        </label>
                    </td>
               </tr>
               <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>抗生素皮试（头孢曲松针）</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="psCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="psCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>止血药物（注射用尖吻蝮蛇血凝酶）</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="zxywCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="zxywCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>止痛药物（地佐辛注射液）</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="ztywCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="ztywCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>破伤风免疫（破伤风人免疫球蛋白针）</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="psfCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="psfCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>暴露（全面评估） </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="blCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="blCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>肢体支具固定 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="ztzjCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="ztzjCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>eFAST B超 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="eFASTCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="eFASTCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>床旁超声 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="cpcsCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="cpcsCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>床边胸片/骨盆片 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="cbxpCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="cbxpCod">否
                        </label>
                    </td>
                </tr>
           <!--  </table>
            <div style='page-break-after: always;'></div>
            <table class="managetable recpTable"> -->
                <tr>
                    <td class="indentTd" rowspan="4" colspan="2" style="text-align:center;">
                        <label>CT、胸片/骨盆片 </label>
                    </td>
                    <td colspan="1" style="text-align:center;">
                        <label>
							联系时间                      
                        </label>
                    </td>
                    <td colspan="4">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td colspan="1" style="text-align:center;">
                        <label>
							完成时间              
                        </label>
                    </td>
                    <td colspan="4">
                        <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td colspan="1" style="text-align:center;">
                        <label>
							检查部位                         
                        </label>
                    </td>
                    <td colspan="4">
                        <label class="checklabel">
                            <input type="checkbox">头颅
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">颌面部
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">颈部（含颈椎）
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">胸部
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">腹部
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">骨盆
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">脊柱（胸腰椎）
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">四肢
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">血管
                        </label>
                    </td>
                </tr>
                <tr>
                    <td colspan="1" style="text-align:center;">
                        <label>
							检查类型                       
                        </label>
                    </td>
                    <td colspan="4">
                        <label class="checklabel">
                            <input type="checkbox">平扫
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">增强造影
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>胸带 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="xdCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="xdCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>腹带 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="fdCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="fdCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>腰带 </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="ydCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="ydCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>骨盆带（挤压试验阳性即用） </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="gpdCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="gpdCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>心电图 ECG</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="xdtCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="xdtCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>导尿(男/女)(非必做)</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="dnCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="dnCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>加温</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="jwCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                        <br>
                        <label class="checklabel">
                            <input type="checkbox" name="jwCod">否
                        </label>
                    </td>
                    <td colspan="3">
                        <label>复温后T检测时间点：开始复温，复温后0.5h，1h，离开急诊时</label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>禁食禁饮</label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="jsjyCod">是
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="jsjyCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" rowspan="3" colspan="1" style="text-align:center;">
                        <label>血库</label>
                    </td>
                    <td colspan="1" style="text-align:center;">
                       	备血申请
                    </td>
                    <td colspan="2">
                        <label class="checklabel">
                            <input type="checkbox" name="bxsqCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="3">
                        <label class="checklabel">
                            <input type="checkbox" name="bxsqCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td colspan="1" style="text-align:center;">
						提血
                    </td>
                    <td colspan="2"></td>
                    <td colspan="3">
                   		 时间：
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td colspan="1" style="text-align:center;">
                   		提血浆
                    </td>
                    <td colspan="2"></td>
                    <td colspan="3">
                    	时间：
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>急诊室去向</label>
                    </td>
                    <td colspan="5">
                    	<label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">手术室
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">DSA
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">ICU
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">专科病房
                        </label>                      
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">转院
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">回家
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">死亡
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="jzsqxCod">其他
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" rowspan="2" colspan="2" style="text-align:center;">
                        <label>住院单</label>
                    </td>
                    <td colspan="1" style="text-align:center;">
						开立
                    </td>
                    <td colspan="2">
                        <label class="checklabel" style="text-align:center;">
                            <input type="checkbox" name="klCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel" style="text-align:center;">
                            <input type="checkbox" name="klCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td colspan="1" style="text-align:center;">
						完成
                    </td>
                    <td colspan="2">
                        <label class="checklabel" style="text-align:center;">
                            <input type="checkbox" name="wcCod">是
                            (获得时间
                            <input class="Wdate noClickWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">)
                        </label>
                    </td>
                    <td colspan="2">
                        <label class="checklabel" style="text-align:center;">
                            <input type="checkbox" name="wcCod">否
                        </label>
                    </td>
                </tr>
                <tr>
                    <td class="indentTd" colspan="2" style="text-align:center;">
                        <label>质控分析</label>
                    </td>
                    <td colspan="5">
                    	<label style="text-align: left" >(例如：MDT意见、中止原因、延时原因等)</label>
                    	<textarea maxlength="500" style="width:98%;height:100px;overflow: hidden;"></textarea>
                    </td>
                </tr>
            </table>
            <div class="extraDiv" style="margin-top: 10px">
	        	填表人：<input type="text" ms-duplex-string="sysdata.crtusrname" id="crtusrname" class="intextinputlong" >
	        	<label>日期：</label>
				<input class="Wdate spcWdate datedate" type="text" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
	        <div class="crtList" id="crtuserList"></div>
	      </div>
        </div>
    </div>
</div>
<script type="text/javascript">
var vm = avalon.define({
    $id: 'nczRecord',
    systemList: {
        eyeRctCodList: publicFun.getDict('EYE_RCT_COD'),
        lanRctCodList: publicFun.getDict('LAN_RCT_COD'),
        actRctCodList: publicFun.getDict('ACT_RCT_COD'),
        qrsjqszzbxList: [{ infocode: '1', info: '肢体', checked: false }, { infocode: '2', info: '言语', checked: false }, { infocode: '3', info: '意识', checked: false }],
        qrfbsjCodList: [{ infocode: '1', info: '≤3小时', checked: false }, { infocode: '2', info: '>3小时', checked: false }],
    },
    sysdata: {
        ryDat: '',
        fhqjsDat: '',
        rsywkssyDat: '',

        qdrslcDat: '',
        yzjhlDat: '',
        tzwqzygDat: '',
        sjnkrsxzddDat: '',
        wqddDat: '',
        wcffDat: '',
        wcsysxbbcjhsjDat: '',
        sctajcDat: '',
        xdtDat: '',
        sjnkrstyqzqrDat: '',
        rsywjssyDat: '',
        fctlctDat: '',
        szryDat: '',
        ryzwclnctafhjzzys: '',
        ryzrsywkssyzys: '',
        crtusrname: "${sessionScope.activeUser.usrname}",

        qrsjqszzbx: '',
        qrfbsjCod: '',
        qrfbsjQt: '',

        eyeRctCod: '', //眨眼反应
        lanRctCod: '', //语言反应
        actRctCod: '' //肢体运动
    },
    hideMsg: {
        qrsjqszzbx: []
    },
    setRadio: function(obj, idx) {
        vm.sysdata[obj] = publicFun.radioClicks(vm.systemList[obj + 'List'], vm.sysdata[obj], idx)
    }
})

function checkAb() {
    var lose = '';
    var arr = ['qrsjqszzbx', 'qrfbsjCod', 'ryzwclnctafhjzzys', 'ryzrsywkssyzys', 'crtusrname'];
    $.each(arr, function(idx, val) {
        if ($('#' + val).val() == '') {
            lose = val;
            return false
        }
    })
    return lose;
}

function saveWsCom() {
    var wsdata = {
        hspNczrslchcbInfCustom: {
            refseqno: comdata.emgSeq,
            seqno: comdata.params.seqno,
            ryDat: '',
            fhqjsDat: '',
            rsywkssyDat: '',
            qdrslcDat: '',
            yzjhlDat: '',
            tzwqzygDat: '',
            sjnkrsxzddDat: '',
            wqddDat: '',
            wcffDat: '',
            wcsysxbbcjhsjDat: '',
            sctajcDat: '',
            xdtDat: '',
            sjnkrstyqzqrDat: '',
            rsywjssyDat: '',
            fctlctDat: '',
            szryDat: '',
            ryzwclnctafhjzzys: '',
            ryzrsywkssyzys: '',
            crtusrname: '',
            qrsjqszzbx: '',
            qrfbsjCod: '',
            qrfbsjQt: ''
        }
    }
    var ids = '';
    $("input[name='qrsjqszzbxCheck']:checked").each(function(i) {
        ids += vm.systemList.qrsjqszzbxList[i].infocode + ',';
    })
    wsdata.hspNczrslchcbInfCustom['qrsjqszzbx'] = ids.substring(0, ids.length - 1);
    $('#qrsjqszzbx').val(ids)
    var idx = '';
    $("input[name='qrfbsjCodCheck']:checked").each(function(i) {
        idx = vm.systemList.qrfbsjCodList[i].infocode;
        wsdata.hspNczrslchcbInfCustom['qrfbsjCod'] = idx
    })
    $('#qrfbsjCod').val(idx)
    if (checkAb() == '') {
        $.each(vm.sysdata, function(key, val) {
            if (wsdata.hspNczrslchcbInfCustom.hasOwnProperty(key)) {
                wsdata.hspNczrslchcbInfCustom[key] = $('#' + key).val()
            }
        })

        return wsdata;
    } else {
        publicFun.alert("脑卒中溶栓流程核查表未填完整！");
        wsdata = '未完成';
        return wsdata;
    }
}

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

function pickerChange(item, it) {
    if ($('#ryDat').val() != '') {
        var timeB = $('#ryDat').val();
        var timeA = item;
        if (it.id == 'fhqjsDat') {
            $('#ryzwclnctafhjzzys').val(getTimeArea(timeA, timeB))
        } else {
            $('#ryzrsywkssyzys').val(getTimeArea(timeA, timeB))
        }
    }
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

function singlecheck(a, thisname) {
    $(a).click(function() {
        if ($(a).attr('checked')) {
            $(thisname).removeAttr('checked');
            $(a).attr('checked', 'checked');
        }
    });
}

$('input[name="chanlCod"]').each(function() {
    singlecheck(this, 'input[name="chanlCod"]');
});

$('input[name="hlsjCod"]').each(function() {
    singlecheck(this, 'input[name="hlsjCod"]');
});

$('input[name="qrfbsjCodCheck"]').each(function() {
    singlecheck(this, 'input[name="qrfbsjCodCheck"]');
});

$('input[name="gcybCod"]').each(function() {
    singlecheck(this, 'input[name="gcybCod"]');
});

$('input[name="jtCod"]').each(function() {
    singlecheck(this, 'input[name="jtCod"]');
});

$('input[name="pgqdCod"]').each(function() {
    singlecheck(this, 'input[name="pgqdCod"]');
});

$('input[name="pgxhCod"]').each(function() {
    singlecheck(this, 'input[name="pgxhCod"]');
});

$('input[name="pgxhlxCod"]').each(function() {
    singlecheck(this, 'input[name="pgxhlxCod"]');
});

$('input[name="psCod"]').each(function() {
    singlecheck(this, 'input[name="psCod"]');
});

$('input[name="zxywCod"]').each(function() {
    singlecheck(this, 'input[name="zxywCod"]');
});

$('input[name="ztywCod"]').each(function() {
    singlecheck(this, 'input[name="ztywCod"]');
});

$('input[name="psfCod"]').each(function() {
    singlecheck(this, 'input[name="psfCod"]');
});

$('input[name="blCod"]').each(function() {
    singlecheck(this, 'input[name="blCod"]');
});

$('input[name="ztzjCod"]').each(function() {
    singlecheck(this, 'input[name="ztzjCod"]');
});

$('input[name="eFASTCod"]').each(function() {
    singlecheck(this, 'input[name="eFASTCod"]');
});

$('input[name="cpcsCod"]').each(function() {
    singlecheck(this, 'input[name="cpcsCod"]');
});

$('input[name="cbxpCod"]').each(function() {
    singlecheck(this, 'input[name="cbxpCod"]');
});

$('input[name="xdCod"]').each(function() {
    singlecheck(this, 'input[name="xdCod"]');
});

$('input[name="fdCod"]').each(function() {
    singlecheck(this, 'input[name="fdCod"]');
});

$('input[name="ydCod"]').each(function() {
    singlecheck(this, 'input[name="ydCod"]');
});

$('input[name="gpdCod"]').each(function() {
    singlecheck(this, 'input[name="gpdCod"]');
});

$('input[name="xdtCod"]').each(function() {
    singlecheck(this, 'input[name="xdtCod"]');
});

$('input[name="dnCod"]').each(function() {
    singlecheck(this, 'input[name="dnCod"]');
});

$('input[name="jwCod"]').each(function() {
    singlecheck(this, 'input[name="jwCod"]');
});

$('input[name="jsjyCod"]').each(function() {
    singlecheck(this, 'input[name="jsjyCod"]');
});

$('input[name="bxsqCod"]').each(function() {
    singlecheck(this, 'input[name="bxsqCod"]');
});

$('input[name="jzsqxCod"]').each(function() {
    singlecheck(this, 'input[name="jzsqxCod"]');
});

$('input[name="klCod"]').each(function() {
    singlecheck(this, 'input[name="klCod"]');
});

$('input[name="wcCod"]').each(function() {
    singlecheck(this, 'input[name="wcCod"]');
});

$(function() {
    $('.docuTitleBaisc').html('浙江医院急诊创伤诊疗流程核查表<br>Multiple injury checklist');
    $('#basicTitleMsg').css("display","block");	
})
</script>