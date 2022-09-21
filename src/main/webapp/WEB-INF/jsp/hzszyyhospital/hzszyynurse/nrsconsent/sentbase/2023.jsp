<div id="ws2023" class="wsnew">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
            <div class="tys">
                <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
                <p class="functiontitle pf-left" id="id_title2">急诊病人交接记录单</p>
                <div class="basicDiv">
                    <label class="firstlab">时间：<input class="Wdate spcWdate" id="time1" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'></label>
                    <label>姓名：${hspemginfCustom.cstNam}</label>
                    <label>性别：${hspemginfCustom.cstSexCod}</label>
                    <label class="lastlab">住院号：<input class="text" id="qxZyh" type="text" name="hspemginfCustom.qxZyh" /></label>
                </div>
                <div class="mainInputBox">
                    <ul class="ulwrapper">
                        <li>
                            <span class="smalltitle twotitle">诊断</span>
                            <input type="text" class="tstotalinput" value="${hspemginfCustom.jbzdDes}"/>
                        </li>
                        <li>
                            <span class="smalltitle twotitle">神志</span>
                             
                            <label class="checklabel">
                                <input type="checkbox">清醒
                            </label>
                            
                            <label class="checklabel">
                                <input type="checkbox">痴呆
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">烦躁
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">模糊
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">嗜睡
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">昏睡
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">浅昏迷
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">深昏迷
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">谵妄
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
                                <div class="middleDiv" >
                                    <label>T：
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this)"> ℃ </label>
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
                                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this)"> %</label>
                                </div>
                            </div>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourtitle">已做检查</span>
                            <label class="checklabel">
                                <input type="checkbox">ECG
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">CT
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">B超
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">X线
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">胸片
                            </label>
                        </li>
                        <li class="halfli">
                            <span>摄片及报告</span>
                            <label class="checklabel">
                                <input type="checkbox" name="photoreport">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="photoreport">有
                            </label>
                            </label>
                        </li>
                        <li class="hspecli">
                            <span class="smalltitle fourtitle">已做化验</span>
                            <div class="divwrapper">
                                <div>
                                    <label class="checklabel">
                                        <input type="checkbox">血常规
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">血生化
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">血心肌酶
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">血型
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">血交叉
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">血气分析
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">尿常规
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">大便OB
                                    </label>
                                </div>
                                <div class="middleDiv">
                                    <span class="syqtSpan">
                                        其它：<input type="text" class="opmedicineinput" maxlength="200">
                                    </span>
                                </div>
                                <div>
                                    结果报告：
                                    <label class="checklabel">
                                        <input type="checkbox" name="reportresult">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="reportresult">有
                                    </label>
                                    <input type="text" class="smallInput" maxlength="3" onkeyup="exchangetonum(this)">张
                                </div>
                            </div>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle">已做过敏试验(药名)</span>
                            <input type="text" class="mediumInput2" maxlength="200">
                        </li>
                        <li class="halfli">
                            结果
                            <label class="checklabel">
                                <input type="checkbox" name="gmexainm">阴性
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="gmexainm">阳性
                            </label>
                        </li>
                        <li class="printfullli">
                            <span class="smalltitle fourtitle">已做处置</span>
                            <label class="checklabel">
                                <input type="checkbox">给氧
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">输液
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">洗胃
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">导尿
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">胸腔式引流
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">吸痰
                            </label>
                            <span class="syqtSpan">
                                其它：<input type="text" class="mediumInput2" maxlength="200">
                            </span>
                        </li>
                        <li class="printfullli">
                            <span class="smalltitle twotitle">输液</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" id="infusionno" name="infusion">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" id="infusionyes" name="infusion">有
                            </label>
                            <span class="syqtSpan">
                                其它：<input type="text" class="opmedicineinput" maxlength="200">
                            </span>
                        </li>
                        <li class="specli">
                            <span class="smalltitle">带入药品</span>
                            <div class="divwrapper">
                                <div class="middleDiv" id="medicineDiv">
                                    口服药：
                                    <label class="checklabel">
                                        <input type="checkbox" name="oral">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="oral">有
                                    </label>
                                    <span class="grapspan">（药名）</span>
                                    <input type="text" class="opmedicineinput" maxlength="200">
                                </div>
                                <div>
                                    针剂药：
                                    <label class="checklabel">
                                        <input type="checkbox" name="injection">无
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="injection">有
                                    </label>
                                    <span class="grapspan">（药名）</span>
                                    <input type="text" class="opmedicineinput" maxlength="200">
                                </div>
                            </div>
                        </li>
                        <li>
                            <span class="smalltitle fourtitle">气管插管</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" id="drainno" name="drain">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" id="drainyes" name="drain">有
                            </label>
                            <span>型号 </span>
                            <input type="text" class="spcInput" maxlength="200">
                            <span id="tcSpan" class="marginSpan">
                                <span>插入深度：</span>
                                <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')"> cm
                            </span>
                        </li>
                        <li>
                            <span class="smalltitle threetitle">引流管</span>
                            <label class="checklabel">
                                <input type="checkbox" value="no" name="medicalrecord">无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" value="yes" name="medicalrecord">有
                            </label>
                            <span>类型 </span>
                            <input type="text" class="spcInput" maxlength="200">
                            <span id="tcSpan" class="marginSpan">
                                <span>是否畅通：</span>
                                <label class="checklabel">
                                    <input type="checkbox" name="known">无
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox" name="known">有
                                </label>
                            </span>
                        </li>
                        <li class="specli">
                            <span class="smalltitle twotitle">皮肤</span>
                            <div class="divwrapper">
                                <div class="middleDiv">
                                    <label class="checklabel">
                                        <input type="checkbox">正常
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">湿疹
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox">破损
                                    </label>
                                    <span class="marginRight">
                                        高危因素：
                                        <label class="checklabel">
                                            <input type="checkbox" name="highrisk">无
                                        </label>
                                        <label class="checklabel">
                                            <input type="checkbox" name="highrisk">有
                                        </label>
                                    </span>
                                    <span class="marginRight">
                                        是否报告：
                                        <label class="checklabel">
                                            <input type="checkbox" name="report">是
                                        </label>
                                        <label class="checklabel">
                                            <input type="checkbox" name="report">否
                                        </label>
                                    </span>
                                </div>
                                <div>
                                    <label class="checklabel">
                                        <input type="checkbox">压疮
                                    </label>
                                    部位/范围<input type="text" class="opmedicineinput" maxlength="200">cm
                                </div>
                            </div>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourtitle">口腔黏膜</span>
                            <label class="checklabel">
                                <input type="checkbox">正常
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">破损
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">溃疡
                            </label>
                            <label class="checklabel">
                                <input type="checkbox">霉菌
                            </label>
                        </li>
                        
                        <li class="halfli">
                            <span>大小便</span>
                            <label class="checklabel">
                                <input type="checkbox" name="output">正常
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="output">失禁
                            </label>
                        </li>
                        <li>
                            <span class="smalltitle tentitle">已预约尚未检查的项目</span>
                            <input class="zxtotalinput" type="text" maxlength="200">
                        </li>
                        <li>
                            <span class="smalltitle seventitle">未完成检查项目</span>
                            <input class="zxtotalinput" type="text" maxlength="200">
                        </li>
                        <li>
                            <span class="smalltitle sixtitle">特别注意事项</span>
                            <input class="zxtotalinput" type="text" maxlength="200">
                        </li>
                        <li>
                                <span class="smalltitle">注：各种治疗、处理、进出量详见重病护理记录单</span>
                        </li>
                        <li>
                            <span class="spanbox relative">
                                <span>交班护士</span>
                                <input type="text" maxlength="10">
                            </span>
                            <span>
                                <span>接班病房</span>
                                <input type="text" maxlength="10">
                            </span>
                        </li>
                        <li>
                            <span class="relative">
                                <span>接班护士</span>
                                <input type="text" maxlength="10">
                            </span>
                            <label class="labbox">交班时间</label>
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
                    $('#detailname').html('急诊病人交接记录单');
                	if (!$('#time1').val()) {
                	    $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
                	}
                });
            </script>
        