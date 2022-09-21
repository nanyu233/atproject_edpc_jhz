<div id="ws2026" class="wsnew">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
            <div class="tys">
                <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
                <p class="functiontitle pf-left" id="id_title2">血液透析病人院内交接记录单</p>
                <div class="basicDiv bdfour">
                    <label>时间：<input class="Wdate spcWdate" id="time1" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'></label>
                    <label>姓名：${hspemginfCustom.cstNam}</label>
                    <label>性别：${hspemginfCustom.cstSexCod}</label>
                    <label>科室：${hspemginfCustom.emgFkCod}</label>
                    <label>年龄：${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</label>
                    <label>住院号：<input class="text" id="qxZyh" type="text" name="hspemginfCustom.qxZyh"/></label>
                </div>
                <div class="mainInputBox">
                    <ul class="ulwrapper">
                        <!-- <li>
                            <span class="smalltitle twotitle">时间</span>
                            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly/>
                        </li> -->
                        <li>
                            <span class="smalltitle twotitle">诊断</span>
                            <input type="text" class="tstotalinput" value="${hspemginfCustom.jbzdDes}"/>
                        </li>
                        <li>
                            <p class="subtitle">病房</p>
                        </li>
                        <li>
                            <span class="smalltitle twotitle">神志</span>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >清醒
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >痴呆
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >烦躁
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >模糊
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >嗜睡
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >昏睡
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >浅昏迷
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >深昏迷
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive" >谵妄
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twotitle">瞳孔</span>
                            <span>
                                左
                                <input type="text" class="smallInput" maxlength="4" onkeyup="judgeUnitShow(this)"> <span class="lengthUnit">mm</span>
                                <span class="marginSpan">右</span> 
                                <input type="text" class="smallInput" maxlength="4" onkeyup="judgeUnitShow(this)"> <span class="lengthUnit">mm</span>
                            </span>
                        </li>
                        <li class="halfli">
                            <span>对光反射</span>
                            <label class="checklabel">
                                <input type="checkbox" name="tolight" >灵敏
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="tolight" >迟钝
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="tolight" >无反应
                            </label>
                        </li>
                        <li class="specli">
                            <span class="smalltitle fourtitle">生命体征</span>
                            <div class="divwrapper">
                                <div class="middleDiv" id="medicineDiv">
                                    <label>T：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'1')"> ℃ </label>
                                    <label class="marginSpan">P：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> 次/分</label>
                                    <label class="marginSpan">R：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> 次/分</label>
                                    <label class="marginSpan">BP：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> / 
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)">
                                            mmHg</label>
                                </div>
                                <div>
                                    <label>SaO2：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'1')"> %</label>
                                </div>
                            </div>
                        </li>
                        <li class="printfullli">
                            <span class="smalltitle twotitle">皮肤</span>
                            <label class="checklabel">
                                <input type="checkbox" name="skin">正常
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skin">湿疹
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skin">破损
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skin" class="skinLast">压疮
                            </label>
                            <span class="marginRight">
                                (部位/范围：
                                <input type="text" class="wbInput" maxlength="200" onkeyup="Tocheck(this,'skin',true)">cm)
                            </span>
                        </li>
                        <li>
                            <span class="smalltitle threetitle">引流管</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" name="drain">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" class="drainLast" name="drain">有
                            </label>
                            <span class="marginRight">
                                (部位/范围：
                                <input type="text" class="wbInput" maxlength="200" onkeyup="Tocheck(this,'drain',true)">cm)
                            </span>
                        </li>
                        <li>
                            <span class="smalltitle fourtitle">出血情况</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" name="cxqk">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" class="cxqkLast" name="cxqk">有
                            </label>
                            <span class="marginRight">
                                (部位/范围：
                                <input type="text" class="wbInput" maxlength="200" onkeyup="Tocheck(this,'cxqk',true)">cm)
                            </span>
                        </li>
                        <li class="printfullli">
                            <span class="smalltitle twotitle">输液</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" name="infusion">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" class="infusionLast" name="infusion">有
                            </label>
                            <span class="syqtSpan">
                                其它：<input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'infusion')">
                            </span>
                        </li>
                        <li class="specli">
                            <span class="smalltitle">带入血透室药物</span>
                            <div class="divwrapper">
                                <div class="middleDiv" id="medicineDiv">
                                    口服药：
                                    <label class="checklabel">
                                        <input type="checkbox" name="oral">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="oral" class="oralLast">有
                                    </label>
                                    <span class="grapspan">（药名）</span>
                                    <input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'oral')">
                                </div>
                                <div>
                                    针剂药：
                                    <label class="checklabel">
                                        <input type="checkbox" name="injection">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="injection" class="injectionLast">有
                                    </label>
                                    <span class="grapspan">（药名）</span>
                                    <input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'injection')">
                                </div>
                            </div>
                        </li>
                        <li>
                            <span class="smalltitle">带入血透室物品</span>
                            <label class="checklabel">
                                <input type="checkbox" name="whichtake" >病历
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="whichtake" >输液泵
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="whichtake" >注射泵
                            </label>
                            <span>其他</span>
                            <input type="text" class="wbInput" maxlength="200">
                        </li>
                        <li>
                            <span class="smalltitle fourSize">特殊交班</span>
                            <input class="tstotalinput" type="text" maxlength="200">
                        </li>
                        <li>
                            <span class="spanbox relative">
                                <span>病房护士签名</span>
                                <input type="text" maxlength="10"/>
                            </span>
                            <span class="spanbox relative">
                                <span>血透护士签名</span>
                                <input type="text" maxlength="10"/>
                            </span>
                            <label class="labbox">交接班时间</label>
                            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
                        </li>
                    </ul>
                    <ul class="ulwrapper ulwith">
                        <li>
                            <p class="subtitle">血透室</p>
                        </li>
                        <li>
                            <span class="smalltitle twotitle">神志</span>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive2" >清醒
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive2" >嗜睡
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive2" >谵妄
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive2" >昏迷
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive2" >浅昏迷
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="sensitive2" >深昏迷
                            </label>
                        </li>
                       <li class="halfli">
                            <span class="smalltitle twotitle">瞳孔</span>
                            <span>
                                左
                                <input type="text" class="smallInput" maxlength="4" onkeyup="judgeUnitShow(this)"> <span class="lengthUnit">mm</span>
                                <span class="marginSpan">右</span> 
                                <input type="text" class="smallInput" maxlength="4" onkeyup="judgeUnitShow(this)"> <span class="lengthUnit">mm</span>
                            </span>
                        </li>
                        <li class="halfli">
                            <span>对光反射</span>
                            <label class="checklabel">
                                <input type="checkbox" name="tolight2" >灵敏
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="tolight2" >迟钝
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="tolight2" >无反应
                            </label>
                        </li>
                        <li class="specli">
                            <span class="smalltitle fourtitle">生命体征</span>
                            <div class="divwrapper">
                                <div class="middleDiv" id="medicineDiv">
                                    <label>T：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')"> ℃ </label>
                                    <label class="marginSpan">P：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> 次/分</label>
                                    <label class="marginSpan">R：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> 次/分</label>
                                    <label class="marginSpan">BP：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> / 
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)">
                                            mmHg</label>
                                </div>
                                <div>   
                                    <label>SaO2：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')"> %</label>
                                </div>
                            </div>
                        </li>
                        <li class="printfullli">
                            <span class="smalltitle twotitle">皮肤</span>
                            <label class="checklabel">
                                <input type="checkbox" name="skin2">正常
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skin2">湿疹
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skin2">破损
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skin2" class="skin2Last">压疮
                            </label>
                            <span class="marginRight">
                                (部位/范围：
                                <input type="text" class="wbInput" maxlength="200" onkeyup="Tocheck(this,'skin2',true)">cm)
                            </span>
                        </li>
                        <li>
                            <span class="smalltitle threetitle">引流管</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" name="drain2">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" class="drain2Last" name="drain2">有
                            </label>
                            <span class="marginRight">
                                (部位/范围：
                                <input type="text" class="wbInput" maxlength="200" onkeyup="Tocheck(this,'drain2',true)">cm)
                            </span>
                        </li>
                        <li class="printfullli">
                            <span class="smalltitle twotitle">输液</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" id="infusionno" name="infusion2">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" id="infusionyes" name="infusion2">有
                            </label>
                            （
                            <label class="checklabel">
                                <input type="checkbox" name="infusiontype">通畅
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="infusiontype">不畅
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="infusiontype">肿胀
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="infusiontype">渗出
                            </label>
                            ）
                            <span class="syqtSpan">
                                其它：<input type="text" class="wbInput" maxlength="200">
                            </span>
                        </li>
                        <li class="specli">
                            <span class="smalltitle">带回病房药物</span>
                            <div class="divwrapper">
                                <div class="middleDiv" id="medicineDiv">
                                    口服药：
                                    <label class="checklabel">
                                        <input type="checkbox" name="oral2">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="oral2" class="oral2Last">有
                                    </label>
                                    <span class="grapspan">（药名）</span>
                                    <input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'oral2')">
                                </div>
                                <div>
                                    针剂药：
                                    <label class="checklabel">
                                        <input type="checkbox" name="injection2">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="injection2" class="injection2Last">有
                                    </label>
                                    <span class="grapspan">（药名）</span>
                                    <input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'injection2')">
                                </div>
                            </div>
                        </li>
                        <li>
                            <span class="smalltitle">带回病房物品</span>
                            <label class="checklabel">
                                <input type="checkbox">病历
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">输液泵
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">注射泵
                            </label>
                            <span>其他</span>
                            <input type="text" class="wbInput" maxlength="200">
                        </li>
                        <li>
                            <span class="smalltitle fourSize">特殊交班</span>
                            <input class="tstotalinput" type="text" maxlength="200">
                        </li>
                        <li class="rightli">
                            <span class="spanbox relative">
                                <span>病房护士签名</span>
                                <input type="text" maxlength="10"/>
                            </span>
                            <span class="spanbox relative">
                                <span>血透护士签名</span>
                                <input type="text" maxlength="10"/>
                            </span>
                            <label class="labbox">交接班时间</label>
                            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
                        </li>
                    </ul>
                </div>
            </div>
            </div>
            <script type="text/javascript">
                function exchangetonum(it){
                    it.value=it.value.replace(/[^\d]/g,'');
                }

                var ageval = '${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}';
                if('${hspemginfCustom.cstAge}' != '' ) {
                    $('#ageInput').val(ageval);
                }

                $(function(){
                    $('#detailname').html('血液透析病人院内交接记录单');
                    if (!$('#time1').val()) {
                	    $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
                	}
                });
            </script>
        