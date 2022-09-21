<div id="s2011">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div ms-controller="timeRecord">
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<p class="functype" id="id_title2">急性胸痛患者诊疗时间记录表</p>
		<div>
			<table class="managetable maintext2 borderTable">
				<tr>
					<td colspan="6">
						<p class="titleTxt">基本信息:</p>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>姓名：</label>
						<input type="text" class="intextinputlong" value="${hspemginfCustom.cstNam}" />
					</td>
					<td colspan="2">
						<label>年龄：</label>
						<input type="text" class="intextinput" id="cstAge" />
					</td>
					<td colspan="2">
						<label>性别：</label>
						<label class="checklabel">
							<input type="checkbox" name="sensitive" id="male"> 男
						</label>
						<label class="checklabel">
							<input type="checkbox" name="sensitive" id="female"> 女
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>住院ID:</label>
						<input type="text" class="intextinputlong" />
					</td>
					<td colspan="2">
						<label>门诊ID:</label>
						<input type="text" class="intextinputlong" />
					</td>
					<td colspan="2">
						<label>发病地址:</label>
						<input type="text" class="intextinputlong" />
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>发病时间:</label>
						<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>身份证号码:</label>
						<input type="text" class="intextinputlong longInputText" />
					</td>
					<td colspan="3">
						<label>联系电话:</label>
						<input type="text" class="intextinputlong" onkeyup="exchangeToNum(this, true)"/>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>呼救：</label>
						<label class="checklabel">
							<input type="checkbox"> 有
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">病情评估:</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label class="checklabel" ms-repeat="list.conditionAssessList">
							<span ms-if="$index === 5"><br/></span>
							<input type="checkbox" /> {{el}}
						</label>
						<label class="checklabel">
							<input type="checkbox" class="otherCheck" onchange="isChecked('otherCheck')"/> 其他
							<input type="text" class="intextinputlong otherCheckInput" onkeyup="isText('otherCheck')" />
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">来院方式:</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label class="checklabel">
							<input type="checkbox" class="emgBus" name="goAway" onchange="isChecked('emgBus')" /> 120救护车
						</label>
						(
							<label>医护人员：</label>
							<input type="text" class="intextinputlong emgBusInput" onkeyup="isText('emgBus')"/>;
							<label>到达现场时间：</label>
							<input class="Wdate clockdate emgBusInput" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})" onkeyup="isText('emgBus')">;
							<label>院前首份心电图时间：</label>
							<input class="Wdate clockdate emgBusInput" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})" onkeyup="isText('emgBus')">
						)
						<br/>
						<label class="checklabel">
							<input type="checkbox" name="goAway" /> 外院转运
						</label>
						<label class="checklabel">
							<input type="checkbox" name="goAway" /> 自行来院
						</label>
						<label class="checklabel">
							<input type="checkbox" name="goAway" /> 院内发病
						</label>
						<label class="checklabel">
							<input type="checkbox" name="goAway" class="otherHos" onchange="isChecked('otherHos')" /> 直接转运他院：
							<input type="text" class="intextinputlong otherHosInput" onkeyup="isText('otherHos')" />
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div class="focusDiv">
							<label>到达本院大门时间：</label>
							<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'MM/dd HH:mm'})">
						</div>
					</td>
					<td colspan="2">
						<div class="focusDiv">
							<label>院内接诊(分诊)时间：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>患者绕行CCU：</label>
						<label class="checklabel">
							<input type="checkbox" name="oral"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="oral"> 否
						</label>
					</td>
					<td colspan="3">
						<label>患者绕行急诊：</label>
						<label class="checklabel">
							<input type="checkbox" name="injection"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="injection"> 否
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">首次医疗接触:</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label class="checklabel" ms-repeat="list.medicalContactList">
							<input type="checkbox" /> {{el}}
						</label>
						<label class="checklabel">
							<input type="checkbox" class="otherDepart" onchange="isChecked('otherDepart')" /> 本院其他科室：
							<input type="text" class="intextinputlong otherDepartInput" onkeyup="isText('otherDepart')" />
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>医护人员:</label>
						<input type="text" class="intextinputlong" />
					</td>
					<td colspan="4">
						<div class="focusDiv">
							<label>首次医疗接触时间：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<div class="focusDiv">
							<label>院内首份心电图时间：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
						</div>
					</td>
					<td colspan="3">
						<div class="focusDiv">
							<label>心电图确诊时间：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							<label>签名:</label>
							<input type="text" class="intextinputlong" />
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>远程心电传输</label>
						<label class="checklabel">
							<input type="checkbox" name="highrisk"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="highrisk"> 否
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">生命体征:</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>意识</label>
						<input type="text" class="intextinput inputText" />
						<label>呼吸</label>
						<input type="text" class="intextinputshort" onkeyup="exchangeToNum(this)" maxlength="4"/>次/分
						<label>心率</label>
						<input type="text" class="intextinputshort" onkeyup="exchangeToNum(this)" maxlength="4"/>次/分
						<label>脉搏</label>
						<input type="text" class="intextinputshort" onkeyup="exchangeToNum(this)" maxlength="4"/>次/分
						<label>血压</label>
						<input type="text" class="intextinput" onkeyup="exchangeToNum(this)" maxlength="4"/> / <input type="text" class="intextinput" onkeyup="exchangeToNum(this)" maxlength="4"/>mmHg
						<label>Killip分级</label>
						<input type="text" class="intextinput" />级
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">辅助检查:</p>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div class="focusDiv">
							<label>cTnI/TnT抽血时间：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
						</div>
					</td>
					<td colspan="4">	
						<div class="focusDiv">
							<label>cTnI/TnT报告时间：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							<label>cTnI/TnT数值：</label>
							<input type="text" class="intextinput" onkeyup="exchangeToNum(this)"/>
							<label>(单位)</label>
							<input type="text" class="intextinput"/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>血清肌酐：</label>
						<input type="text" class="intextinputlong" onkeyup="exchangeToNum(this)"/>umol/L
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">初步诊断</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label class="checklabel" ms-repeat="list.diagnoseList">
							<input type="checkbox" /> {{el}}
						</label>
						<br/>
						<label class="checklabel" >
							<input type="checkbox" /> 其他非心源性胸痛
							(
							<label class="checklabel smallSize" ms-repeat="list.subDiagnoseList">
								<input type="checkbox" /> {{el}}
							</label>
							)
							<label class="checklabel smallSize">
								<input type="checkbox" /> 放弃诊疗、原因未明
							</label>
						</label>
						<label class="checklabel">
							<input type="checkbox" class="otherCheckB" onchange="isChecked('otherCheckB')" /> <span class="smallSize">其他：</span>
							<input type="text" class="intextinputlong otherCheckBInput" onkeyup="isText('otherCheckB')" />
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">诊疗:</p>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div class="focusDiv">
							<label>处理措施：</label>
							<input type="text" class="intextinputlong" />
							(<label class="checklabel" ms-repeat="list.measureList">
								<input type="checkbox" /> {{el}}
							</label> 等)
						</div>
					</td>
					<td colspan="2">
						<div class="focusDiv">
							<label>时间：</label>
							<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'MM/dd HH:mm'})">
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>患者去向：</label>
						<label class="checklabel" ms-repeat="list.goAwayList">
							<input type="checkbox" /> {{el}}
						</label>
						<label class="checklabel">
							<input type="checkbox" class="goAwayOther" onchange="isChecked('goAwayOther')" /> 其他：
							<input type="text" class="intextinputlong goAwayOtherInput" onkeyup="isText('goAwayOther')" />
						</label>
					</td>
					<td>
						<label>医生：</label>
						<input type="text" class="intextinputlong" />
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<div class="focusDiv">
							<label>离开急诊时间：</label>
							<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'MM/dd HH:mm'})">	
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div class="focusDiv">
							<label>心内科会诊(包括远程会诊)：</label>
							<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
						</div>
					</td>
					<td colspan="2">
						<div class="focusDiv">
							<label>医生：</label>
							<input type="text" class="intextinputlong" />
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>一包药给药时间：</label>
						<input class="Wdate spcWdate dateInput" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'MM/dd HH:mm'})">;
						<label>阿司匹林(ASA)</label>
						<input type="text" class="intextinput" onkeyup="exchangeToNum(this)"/>mg;
						<label>氯吡格雷</label>
						<input type="text" class="intextinput" onkeyup="exchangeToNum(this)"/>mg/
						<label>替格瑞洛</label>
						<input type="text" class="intextinput" onkeyup="exchangeToNum(this)"/>mg;
						<label>立普妥</label>
						<input type="text" class="intextinput" onkeyup="exchangeToNum(this)"/>mg
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>抗凝时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="4">
						<label>抗凝药物：</label>
						<input type="text" class="intextinputlong" />;
						<label>剂量：</label>
						<input type="text" class="intextinputlong" onkeyup="exchangeToNum(this)"/>IV
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>溶栓核查：</label>
						<label class="checklabel">
							<input type="checkbox" name="report"> 适合
						</label>
						<label class="checklabel">
							<input type="checkbox" name="report"> 不适合
						</label>
					</td>
					<td colspan="2">
						<label>24小时强化他汀：</label>
						<label class="checklabel">
							<input type="checkbox" name="skin"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="skin"> 否
						</label>
					</td>
					<td colspan="2">
						<label>B受体阻滞剂：</label>
						<label class="checklabel">
							<input type="checkbox" name="inform"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="inform"> 否
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>再灌注措施：</label>
						<label class="checklabel" ms-repeat="list.measuresList">
							<input type="checkbox" /> {{el}}
						</label>
						<label class="checklabel">
							<input type="checkbox" class="measureOther" onchange="isChecked('measureOther')" /> 其他：
							<input type="text" class="intextinputlong measureOtherInput" onkeyup="isText('measureOther')" />
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">急诊(紧急)PCI:</p>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>决定医生：</label>
						<input type="text" class="intextinputlong" />
					</td>
					<td colspan="3">
						<label>介入人员：</label>
						<input type="text" class="intextinputlong" />
					</td>
				</tr>
				<tr ms-repeat="list.emergencyTitleList">
					<td colspan="3">
						<label>{{el.titleA}}</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="3">
						<label>{{el.titleB}}</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>D2B时间：</label>
						<input type="text" class="intextinputlong" onkeyup="exchangeToNum(this)"/>分
					</td>
					<td colspan="3">
						<label>是否延误：</label>
						<label class="checklabel">
							<input type="checkbox" name="eat"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="eat"> 否
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxtSmall">延误原因:</p>
						<input type="text" class="intextinputall">
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">出院诊断:</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label class="checklabel" ms-repeat="list.hosDiagnoseList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>确诊时间</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="3">
						<label>院内出现心力衰竭：</label>
						<label class="checklabel">
							<input type="checkbox" name="output"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="output"> 否
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>住院天数：</label>
						<input type="text" class="intextinputlong" onkeyup="exchangeToNum(this)" />天;
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>总费用：</label>
						<input type="text" class="intextinputlong" onkeyup="exchangeToNum(this)"/>元;
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">患者转归：</p>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label class="checklabel" ms-repeat="list.goHosList">
							<input type="checkbox" ms-attr-value="$index" ms-duplex="msg.goHos" ms-change="setRadio('goHos', $index)"> {{el}}
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>出院时间：</label>
						<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
					<td colspan="4">
						<label>治疗结果：</label>
						<label class="checklabel" ms-repeat="list.treatList">
							<input type="checkbox" name="medicalrecord" ms-attr-value="$index" ms-duplex="msg.treat" ms-change="setRadio('treat', $index)"> {{el}}
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>出院带药：</label>
						<label class="checklabel" ms-repeat="list.takeMedicineList">
							<input type="checkbox"> {{el}}
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<p class="titleTxt">非急性冠脉综合症的其他急性胸痛：</p>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>D-二聚体结果时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="2">
						<label>BNP 快速检测结果时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="2">
						<label>心脏B超检查时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label>胸部X线检查时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="2">
						<label>腹部B超检查时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="2">
						<label>通知CT室准备CTA时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>胸腹主动脉或肺动脉CTA完成时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
					<td colspan="3">
						<label>主动脉或肺动脉CTA诊断时间：</label>
						<input class="Wdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>非急性冠脉综合症患者转归：</label>
						<label class="checklabel">
							<input type="checkbox" class="departOther" onchange="isChecked('departOther')"> 收治住院
						</label>
						<input type="text" class="intextinputlong departOtherInput" onkeyup="isText('departOther')"/> 科室;
						<label class="checklabel">
							<input type="checkbox"> 急诊室观察;
						</label>
						<label class="checklabel">
							<input type="checkbox"> 签字出院;
						</label>
						医师：<input type="text" class="intextinputlong" />
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
  var vm = avalon.define({
		$id: 'timeRecord',
		list: {
			conditionAssessList: ['持续性胸闷/胸痛', '间断性胸闷/胸痛', '胸痛症状已缓解', '腹痛', '呼吸困难', '休克', '心衰', '恶性心律失常', '心肺复苏', '合并出血'],
			medicalContactList: ['其他医疗机构', '120救护车', '本院急诊科', '本院心内科门诊', '本院心内科病房'],
			diagnoseList: ['诊断中', 'STEMI', 'NSTEMI', 'UA', '主动脉夹层', '肺栓塞', '非ACS心源性心痛'],
			subDiagnoseList: ['呼吸','消化', '神经', '精神', '肌肉骨骼', '皮肤'],
			measureList: ['改善循环', '护胃', '止痛', '抗感染', '随诊'],
			goAwayList: ['CCU', '导管室', 'ICU', '呼吸科', '心外科', '离院'],
			measuresList: ['急诊 PCI', '溶栓', '补救 PCI', '急诊仅造影', '择期 PCI', '择期仅造影', 'CABG', '无再灌注'],
			emergencyTitleList: [{titleA: '决定介入手术时间：', titleB: '启动导管室时间：'}, { titleA: '开始知情同意：', titleB: '签署知情同意书：' }, { titleA: '导管室激活时间：', titleB: '患者到达导管室时间：' },
			{ titleA: '开始穿刺时间：', titleB: '穿刺成功时间：' }, { titleA: '造影开始时间：', titleB: '造影结束时间：' }, { titleA: '造影开始时间：', titleB: '造影结束时间：' }, { titleA: '导管通过时间：', titleB: '手术结束时间：' }],
			hosDiagnoseList: ['STEMI', 'NSTEMI', 'UA', '主动脉夹层', '肺栓塞', '非ACS心源性心痛', '其他非心源性胸痛'],
			goHosList: ['出院', '转送其他医院', '转送其他科室', '死亡'],
			treatList: ['治愈', '好转', '脑死亡离院', '其他原因离院'],
			takeMedicineList: ['DAPT;', 'ACEI/ARB;', '他汀;', 'β阻滞剂']
		},
		msg: {
			treat: [],
			goHos: []
		},
		setRadio: function (obj, idx) {
			idx = idx.toString();
			if (vm.msg[obj].length > 1) {
				vm.msg[obj] = [idx]
			}
		}
	})
	function isChecked (ckClass) {
		var inputClass =  ckClass + 'Input';
		if (!$('.' + ckClass).attr('checked')) {
			$('.' + inputClass).val('')
		}
	}

	function isText (ckClass) {
		var inputClass = ckClass + 'Input';
		if ($('.' + inputClass).val()) {
			$('.' + ckClass).attr('checked', 'true')
		}
	}
	function exchangeToNum (it, intNumFlag) {
		if (intNumFlag) {
			it.value = it.value.replace(/[^0-9]/g, '');
		} else {
			it.value = it.value.replace(/[^0-9.]/g, '');
		}
	}
	$(function(){
		if('${hspemginfCustom.cstAge}' != ''){
			$('#cstAge').val("${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}");
		}
	})
</script>