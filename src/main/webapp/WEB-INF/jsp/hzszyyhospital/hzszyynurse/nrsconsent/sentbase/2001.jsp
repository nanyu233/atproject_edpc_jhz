<div id="ws2001" class="wsnew">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <div class="tys">
        <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
        <p class="functiontitle">院内病人交接记录单</p>
        <div class="basicDiv">
            <label class="firstlab">时间：<input class="Wdate spcWdate" id="time1" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly></label>
            <label>姓名：<span>${hspemginfCustom.cstNam}</span></label>
            <label>性别：<span>${hspemginfCustom.cstSexCod}</span></label>
            <label>年龄：<span>${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span></label>
            <label class="lastlab">住院号：<input class="text" id="qxZyh" type="text"/></label>
        </div>
        <div class="mainInputBox">
            <ul class="ulwrapper">
                <li>
                    <span class="smalltitle twotitle">诊断</span>
                    <input type="text" id="show_text" value="${hspemginfCustom.jbzdDes}"></input>
                </li>
                <li>
                    <span class="smalltitle twotitle">神志</span>
                    <label class="checklabel">
                        <input type="checkbox" name="sensitive" >清醒
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="sensitive" >嗜睡
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="sensitive" >谵妄
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="sensitive" >昏迷
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="sensitive" >浅昏迷
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="sensitive" >深昏迷
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
                <li>
                    <span class="smalltitle fourtitle">生命体征</span>
                    <label>T：
                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonumpoint(this,100)"> ℃ </label>
                    <label class="marginSpan">P：
                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> 次/分</label>
                    <label class="marginSpan">R：
                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> 次/分</label>
                    <label class="marginSpan">BP：
                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> / 
                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)">
                            mmHg</label>
                    <label class="marginSpan">SaO2：
                        <input type="text" class="smallInput" maxlength="4" onkeyup="exchangetonum(this)"> %</label>
                </li>
                <li class="printfullli">
                    <span class="smalltitle twotitle">输液</span>
                    <label class="checklabel">
                        <input type="checkbox" value="no" id="infusionno" name="infusion">无
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" value="yes" id="infusionyes" name="infusion">有
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
                        其它：<input type="text" class="qtmedicne" maxlength="50">
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
                    <span class="smalltitle threetitle">引流管</span>
                    <label class="checklabel">
                        <input type="checkbox" value="no" id="drainno" name="drain">无
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" value="yes" id="drainyes" name="drain">有
                    </label>
                    <span>类型 </span>
                    <input type="text" class="spcInput" maxlength="200">
                    <span id="tcSpan" class="marginSpan">
                        <span>是否畅通：</span>
                        <label class="checklabel">
                            <input type="checkbox" name="draintype">无
                        </label>
                        <label class="checklabel">
                            <input type="checkbox" name="draintype">有
                        </label>
                    </span>
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
                </li>
                <li class="printfullli">
                    <span class="smalltitle twotitle">压疮</span>
                    <label class="checklabel">
                        <input type="checkbox" name="score" value="no">无
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="score" value="yes">有
                    </label>
                    <span class="marginRight" style="display:none" id="scorearea">
                        (部位/范围：
                        <input type="text" class="wbInput" maxlength="200">cm)
                    </span>
                </li>
                <li class="printfullli">
                    <span class="smalltitle fourtitle">口腔黏膜</span>
                    <label class="checklabel">
                        <input type="checkbox" name="oralmucosa">正常
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="oralmucosa">破损
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="oralmucosa">溃疡
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="oralmucosa">霉菌
                    </label>
                </li>
                <li class="printfullli">
                    <span class="smalltitle twotitle">饮食</span>
                    <label class="checklabel">
                        <input type="checkbox" name="eat">自带
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="eat">订治疗饮食
                    </label>
                    <span class="marginRight">
                        营养科转科：
                        (<label class="checklabel">
                            <input type="checkbox" name="inform">已通知
                        </label>
                        <label class="checklabel">
                            <input type="checkbox"name="inform">未通知
                        </label>)
                    </span>
                </li>
                <li class="printfullli">
                    <span class="smalltitle threetitle">大小便</span>
                    <label class="checklabel">
                        <input type="checkbox" name="output">正常
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="output">失禁
                    </label>
                </li>
                <li class="printfullli">
                    <span class="smalltitle tentitle">肿瘤患者是否知晓病情</span>
                    <label class="checklabel">
                        <input type="checkbox" name="known">是
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="known">否
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
                <li class="printfullli">
                    <span class="smalltitle fourtitle">患者带入</span>
                    <span class="fifemargin">门诊病历：</span>
                    <label class="checklabel">
                        <input type="checkbox" name="medicalrecord">无
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="medicalrecord">有
                    </label>
                    <span class="fifemargin">摄片：</span>
                    <label class="checklabel">
                        <input type="checkbox" name="radiography" value="no">无
                    </label>
                    <label class="checklabel">
                        <input type="checkbox" name="radiography" value="yes">有
                    </label>
                    <span class="marginRight" id="radiographyarea" style="display:none">
                        (
                        <input type="text" class="smallInput" maxlength="2" onkeyup="exchangetonum(this)">张)
                    </span>
                </li>
                <li>
                    <span>
                        <span>交班病房</span>
                        <input type="text" readonly="readonly" id="emg_emgFkNamea" unselectable='on' onclick="selectDep()">
                    </span>
                    <span class="spanbox relative">
                        <span>交班护士</span>
                        <input type="text" id="userSign" maxlength="10">
                        <div class="userList Listpos" id="userList">
                        </div>
                    </span>
                </li>
                <li>
                    <span>
                        <span>接班病房</span>
                        <input type="text" readonly="readonly" id="emg_emgFkNameb" unselectable='on' onclick="selectAcceptDep()">
                    </span>
                    <span class="relative">
                        <span>接班护士</span>
                        <input type="text" id="username" maxlength="10">
                        <div class="userList" id="userNameList">
                        </div>
                    </span>
                </li>
                <li>
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

        $(function(){
        	if (!$('#time1').val()) {
        	    $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
        	}
        })
    </script>
