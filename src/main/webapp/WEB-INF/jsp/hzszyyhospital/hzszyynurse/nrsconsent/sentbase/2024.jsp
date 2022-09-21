<div id="ws2024" class="wsnew">
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <div class="tys">
            <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
            <!-- <div class="pf-left"> -->
                <p class="functiontitle pf-left" id="id_title2">导管病人交接记录单</p>
            <!-- </div> -->
            <div class="basicDiv">
                <label>时间：<input class="Wdate spcWdate" id="time1" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'></label>
                <label>姓名：${hspemginfCustom.cstNam}</label>
                <label>科室：${hspemginfCustom.emgFkCod}</label>
                <label>性别：${hspemginfCustom.cstSexCod}</label>
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
                        <p class="smalltitle">病房</p>
                    </li>
                    <li>
                        <span class="smalltitle twotitle">诊断</span>
                        <input type="text" class="tstotalinput" value="${hspemginfCustom.jbzdDes}"/>
                    </li>
                    <li>
                        <span class="smalltitle fourtitle">术前准备</span>
                        <label class="checklabel">
                            <input type="checkbox" name="beforeop" >备皮
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="beforeop" >碘过敏
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="beforeop" >术前禁食
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="beforeop" >术前排便
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="beforeop" >青霉素皮试
                        </label>
                    </li>
                    <li class="hspecli">
                        <span class="smalltitle fourtitle">术前用药</span>
                        <div class="divwrapper wrapperwidth">
                            <div class="middleDiv" id="medicineDiv">
                                <label class="checklabel">
                                    <input type="checkbox" name="opmedicine" >无
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox" name="opmedicine" class="opmedicineLast">有
                                </label>
                                <span class="grapspan">( 名称及剂量 )</span>
                                口服：<input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'opmedicine')">
                            </div>
                            <div>
                                静脉：<input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'opmedicine')">
                            </div>
                            <div>
                                带入导管室药物( 名称及剂量 )：<input type="text" class="opmedicineinput" maxlength="200" onkeyup="Tocheck(this,'opmedicine')">
                            </div>
                        </div>
                    </li>
                    <li>
                        <span class="smalltitle sixSize">足背动脉搏动</span>
                        <label class="checklabel">
                            <input type="checkbox" name="dorsumfoot" >正常
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="dorsumfoot" >减弱
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="dorsumfoot" >消失
                        </label>
                    </li>
                    <li>
                        <span class="smalltitle sevenSize">带入导管室物品</span>
                        <label class="checklabel">
                            <input type="checkbox" name="whichtake" >病历
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="whichtake" >输液泵
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="whichtake" >注射泵
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="whichtake" >临时起搏器
                        </label>
                        <span>其他</span>
                        <input type="text" class="spcInput" maxlength="200">
                    </li>
                    <li>
                        <span class="smalltitle sixSize">入导管室方式</span>
                        <label class="checklabel">
                            <input type="checkbox" name="comeinway" >步行
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="comeinway" >轮椅
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="comeinway" >平车
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="comeinway" >病床
                        </label>
                    </li>
                    <li>
                        <span class="smalltitle sixSize">入导管室情况</span>
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
                    </li>
                    <li>
                        <span class="smalltitle fourSize">特殊交班</span>
                        <input type="text" class="tstotalinput" maxlength="200">
                    </li>
                    <li>
                        <span class="spanbox relative">
                            <span>病房护士签名</span>
                            <input type="text" maxlength="10">
                        </span>
                        <span class="spanbox relative">
                            <span>导管室护士签名</span>
                            <input type="text" maxlength="10">
                        </span>
                        <label class="labbox">交班时间</label>
                        <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly unselectable='on'>
                    </li>
                </ul>
                <hr class="hrul"/>
                <ul class="ulwrapper ulwith">
                    <li>
                        <p class="smalltitle">导管室</p>
                    </li>
                    <li class="halfli showhalfli">
                        <span class="smalltitle">手术名称：</span>
                        <input type="text" class="longinput" maxlength="200">
                    </li>
                    <li class="halfli showhalfli">
                        <span class="smalltitle">麻醉方式</span>
                        <input type="text" class="longinput" maxlength="200">
                    </li>
                    <li class="showfullli">
                        <span class="smalltitle">支架植入部位起搏器工作模式</span>
                        <input type="text" class="totalinput" maxlength="200">
                    </li>
                    <li class="showfullli">
                        <span class="smalltitle">术中情况：</span>
                            <label class="checklabel">
                                <input type="checkbox" name="inop" >正常
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="inop" class="inopLast">特殊情况
                            </label>
                            <input type="text" class="longinput" maxlength="200" onkeyup="Tocheck(this,'inop')">
                    </li>
                    <li class="specli showfullli">
                        <span class="smalltitle">用药情况：</span>
                        <div class="divwrapper">
                            <div class="middleDiv" id="medicineDiv">
                                <label class="checklabel">
                                    <input type="checkbox" name="jmsy" class="jmsyLast">静脉输液
                                </label>
                                （名称及剂量）
                                <input type="text" class="longinput" maxlength="200" onkeyup="Tocheck(this,'jmsy')">
                            </div>
                            <div class="middleDiv" id="medicineDiv">
                                <label class="checklabel">
                                    <input type="checkbox" name="xzp" class="xzpLast">血、血制品
                                </label>
                                （名称及剂量）
                                <input type="text" class="longinput" maxlength="200" onkeyup="Tocheck(this,'xzp')">
                            </div>
                        </div>
                    </li>
                    <li class="showfullli">
                        <span class="smalltitle">输液通道：</span>
                        <label class="checklabel">
                            <input type="checkbox">通畅
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">不畅
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">肿胀
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">渗出
                        </label>
                        其他
                        <input type="text" class="longinput" maxlength="200">
                    </li>
                    <li class="specli showfullli">
                        <span class="smalltitle">伤口情况：</span>
                        <div class="divwrapper">
                            <div class="middleDiv" id="medicineDiv">
                                <label class="checklabel">
                                    <input type="checkbox">弹力绷带包扎
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">沙袋加压
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">使用血管闭合器
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">保留动脉鞘管
                                </label>
                            </div>
                            <div class="middleDiv" id="medicineDiv">
                                伤口敷料：
                                <label class="checklabel">
                                    <input type="checkbox">干燥无渗血
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">渗血
                                </label>
                                周围皮肤：
                                <label class="checklabel">
                                    <input type="checkbox">正常
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">血肿
                                </label>
                                <label class="checklabel">
                                    <input type="checkbox">瘀斑
                                </label>
                            </div>
                        </div> 
                    </li>
                    <li class="showfullli">
                        <span class="smalltitle">足动脉搏动：</span>
                        <label class="checklabel">
                            <input type="checkbox">正常
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">减弱
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">消失
                        </label>
                    </li>
                    <li>
                        <span class="smalltitle">导管室带回物品：</span>
                        <label class="checklabel">
                            <input type="checkbox">病历
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">输液泵
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">注射泵
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">临时起搏器
                        </label>
                        <label class="checklabel">
                            <input type="checkbox">其他
                        </label>
                    </li>
                    <li class="rightli">
                        <span class="spanbox relative">
                            <span>导管室护士签名</span>
                            <input type="text" maxlength="10">
                        </span>
                        <span class="spanbox relative">
                            <span>病房护士签名</span>
                            <input type="text" maxlength="10">
                        </span>
                    </li>
                    <li class="rightli">
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

            // var ageval = '${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}';
            // if('${hspemginfCustom.cstAge}' != '' ) {
            //     $('#ageInput').val(ageval);
            // }

            $(function(){
                $('#detailname').html('导管病人交接记录单');
                if (!$('#time1').val()) {
            	    $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
            	}
            });
        </script>
    