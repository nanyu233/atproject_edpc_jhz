<div id="ws2025" class="wsnew">
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
        <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
            <div class="tys">
                <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
                <p class="functiontitle pf-left" id="id_title2">手术患者交接记录单</p>
                <div class="basicDiv">
                    <label class="firstlab">姓名：${hspemginfCustom.cstNam}</label>
                    <label>病区：${hspemginfCustom.emgFkCod}</label>
                    <label>床号：${hspemginfCustom.emgBed}</label>
                    <label>性别：${hspemginfCustom.cstSexCod}</label>
                    <label class="lastlab">年龄：${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</label>
                </div>
                <div class="mainInputBox">
                    <ul class="ulwrapper">
                        <li class="halfli">
                            <span class="smalltitle twotitle">时间</span>
                            <input class="Wdate spcWdate" id="time1" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly/>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle threetitle">住院号</span>
                            <input class="text" id="qxZyh" type="text" name="hspemginfCustom.qxZyh"/>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twotitle">隔离</span>
                            <label class="checklabel">
                                <input type="checkbox" name="insulate" >接触隔离
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="insulate" >其他隔离
                            </label>
                        </li>
						<li>
                            <span class="smalltitle twotitle">诊断</span>
                            <input type="text" class="tstotalinput" value="${hspemginfCustom.jbzdDes}"/>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourtitle">手术名称</span>
                            <input type="text" class="longinput" maxlength="200">
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twotitle">日期</span>
                            <input class="Wdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly="readonly" unselectable="on">
                        </li>
                        <li>
                            <p class="subtitle">核对项目</p>
                        </li>
                        <li>
                            <p class="subtitle">术前病区/手术室</p>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle">术前病区时间</span>
                            <input class="Wdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly="readonly" unselectable="on">
                        </li>
                        <li class="halfli">
                            <span class="smalltitle">手术室时间</span>
                            <input class="Wdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly="readonly" unselectable="on">
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoThreeSize">患者身份</span>
                            <label class="checklabel">
                                <input type="checkbox" name="identity" >
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourSize">过敏史</span>
                            <label class="checklabel">
                                <input type="checkbox" name="allergy" >无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="allergy" >不详
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="allergy" >有
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoSize">备血</span>
                            <label class="checklabel">
                                <input type="checkbox" name="forblood" >无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="forblood" >有
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twofivetitle">备皮</span>
                            <label class="checklabel">
                                <input type="checkbox" name="preserveskin" >确认
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="preserveskin" >需要
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoThreeSize">手术用药</span>
                            带入
                            <label class="checklabel">
                                <input type="checkbox" name="opmedicine" >无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="opmedicine" >有
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fifvtitle">皮肤完整性</span>
                            <label class="checklabel">
                                <input type="checkbox" name="skinwz" >不完整
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skinwz" >完整
                            </label>
                        </li>
                        <li>
                            <span class="smalltitle twoSize">管道</span>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >胃管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >气管插管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >气管切开套管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >静脉置管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >导尿管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >引流管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >造瘘管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="pipeline" >其他导管
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoSize">禁食</span>
                            <label class="checklabel">
                                <input type="checkbox" name="cannoteat" >不需要
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="cannoteat" >确认
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourfivetitle">排空膀胱</span>
                            <label class="checklabel">
                                <input type="checkbox">确认
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoSize">病历</span>
                            <label class="checklabel">
                                <input type="checkbox" >确认
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle srtitle">知情同意书手术安全核查表</span>
                            <label class="checklabel">
                                <input type="checkbox">有
                            </label>
                        </li>
                        <li>
                            <span class="smalltitle">手术部位标记</span>
                            <label class="checklabel">
                                <input type="checkbox" name="opmark" >不需要
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="opmark">正确
                            </label>
                        </li>
                        <li>
                            <span class="smalltitle twoThreeSize">携带物品</span>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >影像资料
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >腹带
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >胃管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >负压瓶
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >水封瓶
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >营养瓶
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >负压球
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >VSD
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >其他
                            </label>
                        </li>
                        <li>
                            <p class="subtitle">生命体征、意识(术前病区)</p>
                        </li>
                        <li>
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
                            <label class="marginSpan">SO2：
                                <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')"> %</label>
                            <label>意识：
                                <select>
                                    <option value="0"></option>
                                    <option value="1">清醒状态</option>
                                    <option value="2">嗜睡状态</option>
                                    <option value="3">意识模糊</option>
                                    <option value="4">昏睡状态</option>
                                    <option value="5">昏迷</option>
                                    <option value="6">醉酒</option>
                                    <option value="7">痴呆</option>
                                    <option value="8">镇静状态</option>
                                    <option value="9">谵妄</option>
                                </select>
                            </label>
                        </li>
                         <li>
                            <p class="subtitle">生命体征、意识(手术室)</p>
                        </li>
                        <li>
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
                                <label class="marginSpan">SO2：
                                <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')"> %</label>
                            <label>意识：
                                <select>
                                    <option value="0"></option>
                                    <option value="1">清醒状态</option>
                                    <option value="2">嗜睡状态</option>
                                    <option value="3">意识模糊</option>
                                    <option value="4">昏睡状态</option>
                                    <option value="5">昏迷</option>
                                    <option value="6">醉酒</option>
                                    <option value="7">痴呆</option>
                                    <option value="8">镇静状态</option>
                                    <option value="9">谵妄</option>
                                </select>
                            </label>
                        </li>
                        <li>
                            <span class="spanbox relative">
                                <span>交护士签名</span>
                                <input type="text" maxlength="10">
                            </span>
                            <span class="relative">
                                <span>接护士签名</span>
                                <input type="text" maxlength="10">
                            </span>
                        </li>
                    </ul>
                    <ul class="ulwrapper">
                        <li>
                            <p class="subtitle">手术室/（术后病区）</p>
                        </li>
                        <li>
                            <span class="smalltitle spcSize">时间</span>
                            <input class="Wdate smallWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly="readonly" unselectable="on">
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoThreeSize">患者身份</span>
                            <label class="checklabel">
                                <input type="checkbox" name="identity" >
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourSize">过敏史</span>
                            <label class="checklabel">
                                <input type="checkbox" name="allergy2" >否认
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="allergy2" >不详
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="allergy2" class="allergy2Last">有
                            </label>
                            <input type="text" class="spcInput" maxlength="200" onkeyup="Tocheck(this,'allergy2')">
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoSize">备血</span>
                            <label class="checklabel">
                                <input type="checkbox" name="forblood2" >无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="forblood2" >有
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twofivetitle">备皮</span>
                            <label class="checklabel">
                                <input type="checkbox" name="preserveskin2" >确认
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="preserveskin2" >需要
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoThreeSize">手术用药</span>
                            带回
                            <label class="checklabel">
                                <input type="checkbox" name="opmedicine2" >无
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="opmedicine2" class="opmedicine2Last">有
                            </label>
                            <input type="text" class="spcInput" maxlength="200" onkeyup="Tocheck(this,'opmedicine2')">
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fifvtitle">皮肤完整性</span>
                            <label class="checklabel">
                                <input type="checkbox" name="skinwz2" >不完整
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="skinwz2" >完整
                            </label>
                        </li>
                        <li class="specli">
                            <span class="smalltitle twoSize">管道</span>
                            <div class="divwrapper">
                                <div class="middleDiv" id="medicineDiv">
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >胃管
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >气管插管
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >气管切开套管
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >静脉置管
                                        <input type="text" class="smallInput"/>根
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >导尿管
                                    </label>
                                </div>
                                <div>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >引流管
                                        <input type="text" class="smallInput"/>根
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >造瘘管
                                    </label>
                                    <label class="checklabel">
                                        <input type="checkbox" name="pipeline" >其他导管
                                        <input type="text" class="smallInput"/>根
                                    </label>
                                </div>
                            </div>        
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoSize">禁食</span>
                            <label class="checklabel">
                                <input type="checkbox" name="cannoteat" >不需要
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="cannoteat" >确认
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle fourfivetitle">排空膀胱</span>
                            <label class="checklabel">
                                <input type="checkbox">确认
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle twoSize">病历</span>
                            <label class="checklabel">
                                <input type="checkbox" >确认
                            </label>
                        </li>
                        <li class="halfli">
                            <span class="smalltitle srtitle">知情同意书手术安全核查表</span>
                            <label class="checklabel">
                                <input type="checkbox">有
                            </label>
                        </li>
                        <li>
                            <span class="smalltitle twoThreeSize">携带物品</span>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >影像资料
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >腹带
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >胃管
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >负压瓶
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >水封瓶
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >营养瓶
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >负压球
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >VSD
                            </label>
                            <label class="checklabel">
                                <input type="checkbox" name="takething" >其他
                            </label>
                        </li>
                        <li>
                            <p class="subtitle">生命体征、意识</p>
                        </li>
                        <li>
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
                            <label class="marginSpan">SO2：
                                <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')"> %</label>
                            <label>意识：
                                <select>
                                    <option value="0"></option>
                                    <option value="1">清醒状态</option>
                                    <option value="2">嗜睡状态</option>
                                    <option value="3">意识模糊</option>
                                    <option value="4">昏睡状态</option>
                                    <option value="5">昏迷</option>
                                    <option value="6">醉酒</option>
                                    <option value="7">痴呆</option>
                                    <option value="8">镇静状态</option>
                                    <option value="9">谵妄</option>
                                </select>
                            </label>
                        </li>
                        <li>
                            <span class="spanbox relative">
                                <span>交护士签名</span>
                                <input type="text" maxlength="10">
                            </span>
                            <span class="relative">
                                <span>接护士签名</span>
                                <input type="text" maxlength="10">
                            </span>
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
                    $('#detailname').html('手术患者交接记录单');
                    if (!$('#time1').val()) {
                	    $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
                	}
                });
            </script>
        