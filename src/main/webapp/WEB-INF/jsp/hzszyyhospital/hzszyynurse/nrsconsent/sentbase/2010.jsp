<div id="s2010">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div>
		<!-- <p class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<p class="functype">急性胸痛患者时间管理表</p>
		<div>
			<table class="managetable maintext2">
				<tr>
					<td class="titletd">
						<span class="titlespan">院前部分</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>患者姓名</label>
								<input type="text" class="intextinputlong" value="${hspemginfCustom.cstNam}"/>
							</li>
							<li class="lithree">
								<label>性别</label>
								<label class="checklabel">
									<input type="checkbox" name="cstsex" id="male">男
								</label>
								<label class="checklabel">
									<input type="checkbox" name="cstsex" id="female">女
								</label>
								<label>年龄</label>
								<input type="text" class="intextinput" value="${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}"/>
							</li>
							<li class="lithree">
								<label>身份证号码</label>
								<input type="text" class="intextinputlong2"/>
							</li>
							<li class="lithree">
								<label>联系电话</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>门诊ID</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>住院ID</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>首次医疗接触时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithirdtwo">
								<label>首次医疗接触地点</label>
								<input type="text" class="intextinputlong">
							</li>
							<li class="lithree">
								<label>呼叫120时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithirdtwo">
								<label>到达现场时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>心电图时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>心电图上传时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>心电图诊断</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lione">
								<span>去向：
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>急诊
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>导管室
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>CCU
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>其他
										<input type="text" class="intextinput"/>
									</label>
								</span>
								<span class="bolderfont">
									<label>接诊医生</label>
									<input type="text" class="intextinputlong"/>
								</span>
								<span class="bolderfont">
									<label>处置共计</label>
									<input type="text" class="intextinput"/>
									<label>分钟</label>
								</span>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="titletd">
						<span class="titlespan">急诊部分</span>
						<span>(院内首次医疗接触)</span>
					</td class="maintd">
					<td>
						<ul class="tableul">
							<li class="lione">
								<span>来院方式：
									<label class="checklabel">
										<input type="checkbox" name="lyfs"/>120
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lyfs"/>转院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lyfs"/>自行来院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lyfs"/>其他
										<input type="text" class="intextinput"/>
									</label>
								</span>
							</li>
							<li class="lione">
								<span>首先到达本院：
									<label class="checklabel">
										<input type="checkbox" name="sxddby"/>急诊
									</label>
									<label class="checklabel">
										<input type="checkbox" name="sxddby"/>门诊
									</label>
									<label class="checklabel">
										<input type="checkbox" name="sxddby"/>导管室
									</label>
									<label class="checklabel">
										<input type="checkbox" name="sxddby"/>院内发病
									</label>
								</span>
							</li>
							<li class="lifour">
								<label>接诊护士</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lifour">
								<label>接诊时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lifour">
								<label>发病时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lifour">
								<label>发病地点</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lione">
								<span class="bolderfont">
									(转院病人)
								</span>
								<label>转出基层医院时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
								<label>到达我院大门时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
								<label>挂号时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lione">
								<span class="f-left">病情估计：</span>
								<span class="chbox">
									<label class="checklabel">
										<input type="checkbox"/>持续性胸闷/胸痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>间断性胸闷/胸痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>胸痛症状已缓解
									</label><br/>
									<label class="checklabel">
										<input type="checkbox"/>腹痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>呼吸困难
									</label>
									<label class="checklabel">
										<input type="checkbox"/>休克
									</label>
									<label class="checklabel">
										<input type="checkbox"/>心衰
									</label>
									<label class="checklabel">
										<input type="checkbox"/>恶性心律失常
									</label>
									<label class="checklabel">
										<input type="checkbox"/>心肺复苏
									</label>
									<label class="checklabel">
										<input type="checkbox"/>合并出血
									</label>
								</span>
							</li>
							<li class="lione">
								<span class="f-left">生命体征：</span>
								<span class="chbox">
									<label>意识</label>
									<input type="text" class="intextinput"/>
									<label>呼吸</label>
									<input type="text" class="intextinput" onkeyup="exchangetonum(this)"/>次/分
									<label>脉搏</label>
									<input type="text" class="intextinput" onkeyup="exchangetonum(this)"/>次/分
									<label>心率</label>
									<input type="text" class="intextinput" onkeyup="exchangetonum(this)"/>次/分
									<label>SpO2</label>
									<input type="text" class="intextinput" onkeyup="exchangetonum(this)"/>%<br/>
									<label>血压</label>
									<input type="text" class="intextinput" onkeyup="exchangetonum(this)"/>/<input type="text" class="intextinput" onkeyup="exchangetonum(this)"/>mmHg
									<label>Killip分级</label>
									<input type="text" class="intextinput"/>
								</span>
							</li>
							<li class="lithree">
								<label>采血时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>心肌酶出结果时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>cTNI</label>
								<input type="text" class="intextinput"/>
								<label>肌酐</label>
								<input type="text" class="intextinput"/>
							</li>
							<li class="lithree">
								<label>院内首份心电图时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>ECG诊断时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>ECG诊断（专科）</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lione">
								<label>呼叫</label>
								<input type="text" class="intextinput"/>
								<label>科会诊时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
								<label>会诊医师</label>
								<input type="text" class="intextinput"/>
								<label>到达时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
								<label>确诊时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lione">
								<span class="f-left">胸痛病因诊断：</span>
								<span class="chbox">
									<label class="checklabel">
										<input type="checkbox"/>STEMI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>NSTEMI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>UA
									</label>
									<label class="checklabel">
										<input type="checkbox"/>主动脉夹层
									</label><br/>
									<label class="checklabel">
										<input type="checkbox"/>非心源性心痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>肺栓塞
									</label>
									<label class="checklabel">
										<input type="checkbox"/>气胸
									</label>
									<label class="checklabel">
										<input type="checkbox"/>其他
										<input type="text" class="intextinputlong"/>
									</label>
								</span>
							</li>
							<li class="litwo">
								<label class="checklabel">
									<input type="checkbox"/>阿司匹林片
								</label>
								<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>mmHg
								给药时间
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label class="checklabel">
									<input type="checkbox"/>氯吡格雷片
								</label>
								<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>mmHg
								给药时间
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label class="checklabel">
									<input type="checkbox"/>阿托伐他汀片
								</label>
								<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>mmHg
								给药时间
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label class="checklabel">
									<input type="checkbox"/>硝酸甘油含服
								</label>
								给药时间
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>其他给药时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithirdtwo">
								<label>药物名称及剂量</label>
								<input type="text" class="intextmorelong"/>
							</li>
							<li class="litwo">
								<label>决定启动导管室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label>开始知情同意时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label>签定知情同意时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label>决定住院时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lione">
								<label>离开急诊时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
								
								<span>去向：
									<label class="checklabel">
										<input type="checkbox" name="lkjzqx"/>导管室
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lkjzqx"/>CCU
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lkjzqx"/>ICU
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lkjzqx"/>呼吸科
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lkjzqx"/>心外科
									</label>
									<label class="checklabel">
										<input type="checkbox" name="lkjzqx"/>其他
										<input type="text" class="intextinput"/>
									</label>
								</span>
							</li>
							<li class="assign">
								<label>接诊医生</label>
								<input type="text" class="intextinputlong"/>
								<label>处置共计</label>
								<input type="text" class="intextinput"/>分钟
								<label>延误分析</label>
								<input type="text" class="intextinputlong"/>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="titletd">
						<span class="titlespan">心内科部分</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>首诊时间</label>
								<input class="Wdate spcWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<span>
									24小时强化他汀治疗
									<label class="checklabel">
										<input type="checkbox" name="qhtt"/>是
									</label>
									<label class="checklabel">
										<input type="checkbox" name="qhtt"/>否
									</label>
								</span>
							</li>
							<li class="lithree">
								<span>
									β受体阻滞剂使用
									<label class="checklabel">
										<input type="checkbox" name="zzjsy"/>是
									</label>
									<label class="checklabel">
										<input type="checkbox" name="zzjsy"/>否
									</label>
								</span>
							</li>
							<li class="lione">
								<span class="f-left">再灌注措施：</span>
								<span class="chbox">
									<label class="checklabel">
										<input type="checkbox"/>急诊 PCI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>溶栓
									</label>
									<label class="checklabel">
										<input type="checkbox"/>补救 PCI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>急诊仅造影
									</label><br/>
									<label class="checklabel">
										<input type="checkbox"/>择期 PCI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>择期仅造影
									</label>
									<label class="checklabel">
										<input type="checkbox"/>无再灌注 
									</label>
									<label class="checklabel">
										<input type="checkbox"/>其他
										<input type="text" class="intextinputlong"/>
									</label>
								</span>
							</li>
							<li class="lithree">
								<label>决定介入时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>启动导管室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>开始知情同意时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>签署知情同意时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>导管室激活时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>介入人员</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="litwo">
								<label>患者到达导管室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label>穿刺开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label>穿刺成功时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="litwo">
								<label>造影开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>造影结束时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>球囊扩张时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lithree">
								<label>手术结束时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
							</li>
							<li class="lione">
								<span>罪犯血管血流：
									术前 TIMI<input type="text" class="intextinput"/>级
									术后 TIMI<input type="text" class="intextinput"/>级
								</span>
							</li>
							<li class="lione">
								<span class="f-left">患者去向：</span>
								<span class="chbox">
									<label class="checklabel">
										<input type="checkbox" name="hzqx"/>CCU
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzqx"/>普通病房
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzqx"/>死亡
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzqx"/>签字出院
									</label>
								</span>
							</li>
							<li class="assign">
								<label>接诊医生</label>
								<input type="text" class="intextinputlong"/>
								<label>处置共计</label>
								<input type="text" class="intextinput"/>分钟
								<label>延误分析</label>
								<input type="text" class="intextinputlong"/>
							</li>
						</ul>
					</td>
				</tr>
			</table>
			<ul  class="maintext2">
				<li class="litwo">
					<span>
						<label class="bolderfont">D2B时间</label>
						<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>						
					</span>
				</li>
				<li class="litwo">
					<span>
						<label class="bolderfont">延误原因分析</label>
						<input type="text" class="intextmorelong"/>	
					</span>
				</li>
				<li class="lione">
					<span class="bolderfont f-left">患者及家属：</span>
					<span class="chbox">
						<label class="checklabel">
							<input type="checkbox"/>症状不明显
						</label>
						<label class="checklabel">
							<input type="checkbox"/>延误诊断
						</label>
						<label class="checklabel">
							<input type="checkbox"/>家属未到场
						</label>
						<label class="checklabel">
							<input type="checkbox"/>知情同意时间过长
						</label>
					</span>
				</li>
				<li class="litwo">
					<span class="bolderfont f-left">急诊：</span>
					<span class="chbox">
						<label class="checklabel">
							<input type="checkbox"/>急诊科处理时间长
						</label>
						<label class="checklabel">
							<input type="checkbox"/>医生决策延误
						</label>
					</span>
				</li>
				<li class="litwo">
					<span class="bolderfont f-left">其他：</span>
					<span class="chbox">
						<label class="checklabel">
							<input type="checkbox"/>超过再灌注时间窗
						</label>
						<label class="checklabel">
							<input type="checkbox"/>病情不稳定
						</label>
						<label class="checklabel">
							<input type="checkbox"/>经费问题
						</label>
					</span>
				</li>
				<li class="lione">
					<span class="bolderfont f-left">心内：</span>
					<span class="chbox">
						<label class="checklabel">
							<input type="checkbox"/>心内科会诊时间长
						</label>
						<label class="checklabel">
							<input type="checkbox"/>手术期间出现并发症
						</label>
						<label class="checklabel">
							<input type="checkbox"/>导管室人员未到位
						</label>
						<label class="checklabel">
							<input type="checkbox"/>医生决策延误
						</label>
					</span>
				</li>
				<li class="lione">
					<span class="bolderfont f-left">流程：</span>
					<span class="chbox">
						<label class="checklabel">
							<input type="checkbox"/>排队挂号、缴费、办住院时间长
						</label>
						<label class="checklabel">
							<input type="checkbox"/>药物缺乏
						</label>
						<label class="checklabel">
							<input type="checkbox"/>未实施绕行急诊方案
						</label>
						<label class="checklabel">
							<input type="checkbox"/>绕行急诊科但未直接入导管室
						</label><br/>
						<label class="checklabel">
							<input type="checkbox"/>导管室占台
						</label>
						<label class="checklabel">
							<input type="checkbox"/>缺少担架员转运时间长
						</label>
					</span>
				</li>
			</ul>
			<p class="titleinp">NSTE-ACS 危险分层勾选表</p>
			<table class="managetable childtable">
				<tr>
					<th class="chtitletd">NSTE-ACS 极高危因素</th>
					<td class="chmaintd">初评</td>
					<td class="chmaintd">再评</td>
					<td class="chmaintd">再评</td>
					<th class="chqxtd">去向</th>
				</tr>
				<tr>
					<td class="chtitletd">血流动力学不稳定或心源性休克</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chqxtd" rowspan="6">
						<label class="checklabel">
							<input type="checkbox" name="jgqx"/>导管室
						</label><br/>
						<label class="checklabel">
							<input type="checkbox" name="jgqx"/>离院
						</label><br/>
						<label class="checklabel">
							<input type="checkbox" name="jgqx"/>CCU
						</label>
					</td>
				</tr>
				<tr>
					<td class="chtitletd">再发性或药物治疗难以缓解的持续性胸痛</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">危及生命的心律失常或心跳骤停</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">心肌梗死的机械性并发症</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">急性心衰</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">ST-T 动态改变，特别是间歇性 ST 段抬高</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
			</table>
			<table class="managetable childtable">
				<tr>
					<th class="chtitletd">NSTE-ACS 高危因素</th>
					<td class="chmaintd">初评</td>
					<td class="chmaintd">再评</td>
					<td class="chmaintd">再评</td>
					<th class="chqxtd">去向</th>
				</tr>
				<tr>
					<td class="chtitletd">肌钙蛋白水平升高或降低与心梗一致</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chqxtd" rowspan="11">
						<label class="checklabel">
							<input type="checkbox" name="wqx"/>CCU
						</label><br/>
						<label class="checklabel">
							<input type="checkbox" name="wqx"/>急诊留观
						</label><br/>
						<label class="checklabel">
							<input type="checkbox" name="wqx"/>导管室
						</label><br/>
						<label class="checklabel">
							<input type="checkbox" name="wqx"/>普通病房
						</label><br/>
						<label class="checklabel">
							<input type="checkbox" name="wqx"/>离院
						</label>
					</td>
				</tr>
				<tr>
					<td class="chtitletd">动态 ST 或 T 波改变</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">GRACE 评分>140</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<th class="chtitletd">NSTE-ACS 中危因素</th>
					<td colspan="3"></td>
				</tr>
				<tr>
					<td class="chtitletd">糖尿病</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">肾功能不全</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">LVEF<40%或充血性心力衰竭</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">梗死后早期心绞痛</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">近期 PCI 史</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">既往 CABG 史</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
				<tr>
					<td class="chtitletd">GRACE 评分109-140</td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
					<td class="chmaintd"><input type="checkbox"/></td>
				</tr>
			</table>
			<p class="pintable">
				患者要求离院，已告知可能发生急性心梗、恶性心律失常、心衰、脑血管意外、心衰、猝死等情况，
				<br/>后果自负，签字为证
				<input type="text" class="intextinputlong">时间
				<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
			</p>
			<table class="managetable childtable">
				<tr>
					<th class="chtitletd2">NSTE-ACS 低危患者</th>
					<th class="chmaintd2">去向</th>
				</tr>
				<tr>
					<td class="chtitletd2">无上述风险因素且无再发症状</td>
					<td class="chmaintd2">
						<label class="checklabel">
							<input type="checkbox" name="dwqx"/>门诊
						</label>
						<label class="checklabel">
							<input type="checkbox" name="dwqx"/>住院
						</label>
						<label class="checklabel">
							<input type="checkbox" name="dwqx"/>离院
						</label>
					</td>
				</tr>
				<tr>
					<td class="chtitletd2">已作冠心病疾病宣教</td>
					<td class="chmaintd2">
						<label>患者签名</label>
						<input type="text" class="intextinputlong"><br/>
						<label>时间</label>
						<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"/>
					</td>
				</tr>
			</table>
			<table class="managetable maintext2">
				<tr>
					<td class="titletd">
						<span class="titlespan">转归</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lione">
								<span>出院诊断：
									<label class="checklabel">
										<input type="checkbox"/>STEMI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>NSTEMI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>UA
									</label>
									<label class="checklabel">
										<input type="checkbox"/>主动脉夹层
									</label>
									<label class="checklabel">
										<input type="checkbox"/>肺动脉栓塞
									</label>
									<label class="checklabel">
										<input type="checkbox"/>非心源性胸痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>其他
										<input type="text" class="intextinput"/>
									</label>
								</span>
							</li>
							<li class="lione">
								<span>患者转归：
									<label class="checklabel">
										<input type="checkbox" name="hzzg"/>出院
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs"/>治愈
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs"/>好转
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs"/>其他原因离院
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs"/>脑死亡离院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzzg"/>转送其他医院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzzg"/>死亡
									</label>
								</span>
							</li>
							<li class="assign">
								<label>医生</label>
								<input type="text" class="intextinputlong"/>
								<label>时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
			</table>
			<p class="titleinp">附：GRACE 危险评分系统</p>
			<table class="managetable gracetable">
				<tr>
					<td class="gracetd">Killp 分级</td>
					<td class="dftd">得分</td>
					<td class="gracetd">收缩压（mmHg）</td>
					<td class="dftd">得分</td>
					<td class="gracetd">心率（bpm）</td>
					<td class="dftd">得分</td>
					<td class="gracetd">年龄（岁）</td>
					<td class="dftd">得分</td>
					<td class="gracetd2">CK（umol/l）</td>
					<td class="dftd">得分</td>
					<td class="gracetd2">危险因素</td>
					<td class="dftd">得分</td>
				</tr>
				<tr>
					<td>I</td>
					<td>0</td>
					<td><80</td>
					<td>58</td>
					<td><50</td>
					<td>0</td>
					<td><30</td>
					<td>0</td>
					<td>0-34.5</td>
					<td>1</td>
					<td>院前心跳骤停</td>
					<td>39</td>
				</tr>
				<tr>
					<td>II</td>
					<td>20</td>
					<td>80-99</td>
					<td>53</td>
					<td>50-69</td>
					<td>3</td>
					<td>30-39</td>
					<td>8</td>
					<td>35.4-69.8</td>
					<td>4</td>
					<td>ST段下移</td>
					<td>28</td>
				</tr>
				<tr>
					<td>III</td>
					<td>39</td>
					<td>100-119</td>
					<td>43</td>
					<td>70-89</td>
					<td>9</td>
					<td>40-49</td>
					<td>25</td>
					<td>70.7-105.2</td>
					<td>7</td>
					<td>心肌酶升高</td>
					<td>14</td>
				</tr>
				<tr>
					<td>IV</td>
					<td>59</td>
					<td>120-139</td>
					<td>34</td>
					<td>90-109</td>
					<td>15</td>
					<td>50-59</td>
					<td>41</td>
					<td>106.1-140.6</td>
					<td>10</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>140-159</td>
					<td>24</td>
					<td>110-149</td>
					<td>24</td>
					<td>60-69</td>
					<td>58</td>
					<td>141.4-175.9</td>
					<td>13</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>160-199</td>
					<td>10</td>
					<td>150-199</td>
					<td>38</td>
					<td>70-79</td>
					<td>75</td>
					<td>176.8-352.7</td>
					<td>21</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td>>200</td>
					<td>0</td>
					<td>>200</td>
					<td>46</td>
					<td>>80</td>
					<td>91</td>
					<td>≥353.60</td>
					<td>28</td>
					<td></td>
					<td></td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
					<td>≥90</td>
					<td>100</td>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
			</table>
			<table class="managetable maintext2">
				<tr>
					<td class="titletd">
						<span class="titlespan">检查及检查部分</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label class="bolderfont">检验技师姓名</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>血标本送检时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>血标本送达时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>检验开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithirdtwo">
								<label>检验结束时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label class="bolderfont">CT室技师姓名</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>通知CT室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>患者到达CT室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>CTA检查开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>CTA报告时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>患者离开CT室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label class="bolderfont">B超室技师姓名</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>通知B超室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>患者到达B超室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>B超检查开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>B超报告时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>患者离开B超室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label class="bolderfont">放射科技师姓名</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>通知放射科时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>患者到达放射科时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>胸片检查开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>胸片出报告时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>患者离开放射科时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
			</table>
			<table class="managetable maintext2">
				<tr>
					<td class="titletd">
						<span class="titlespan">心外科</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label class="bolderfont">接诊医师</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>接诊护士</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>接诊时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="litwo">
								<label>决定手术时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="litwo">
								<label>开始知情同意谈话时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="litwo">
								<label>签署手术同意书时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="litwo">
								<label>外科手术开始时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="litwo">
								<label>手术人员到达手术室时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="litwo">
								<label>手术结束时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
			</table>
			<table class="managetable maintext2">
				<tr>
					<td class="titletd">
						<span class="titlespan">转归</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lione">
								<span>出院诊断：
									<label class="checklabel">
										<input type="checkbox"/>STEMI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>NSTEMI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>UA
									</label>
									<label class="checklabel">
										<input type="checkbox"/>主动脉夹层
									</label>
									<label class="checklabel">
										<input type="checkbox"/>肺动脉栓塞
									</label>
									<label class="checklabel">
										<input type="checkbox"/>非心源性胸痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>其他
										<input type="text" class="intextinput"/>
									</label>
								</span>
							</li>
							<li class="lione">
								<span>患者转归：
									<label class="checklabel">
										<input type="checkbox" name="hzzg2"/>出院
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs2"/>治愈
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs2"/>好转
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs2"/>其他原因离院
									</label>
									<label class="checklabel">
										<input type="radio" name="cyfs2"/>脑死亡离院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzzg2"/>转送其他医院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="hzzg2"/>死亡
									</label>
								</span>
							</li>
							<li class="assign">
								<label>医生</label>
								<input type="text" class="intextinputlong"/>
								<label>时间</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	function exchangetonum(it){
		it.value=it.value.replace(/[^\d]/g,'');
	}

	function singlecheck(a,thisname){
		$(a).click(function(){
			if($(a).attr('checked')){
				$(thisname).removeAttr('checked');
				$(a).attr('checked','checked');
			}
		});
	}

	$('input[name="cstsex"]').each(function(){
		singlecheck(this,'input[name="cstsex"]');
	});

	$('input[name="yqqx"]').each(function(){
		singlecheck(this,'input[name="yqqx"]');
	});

	$('input[name="lyfs"]').each(function(){
		singlecheck(this,'input[name="lyfs"]');
	});

	$('input[name="sxddby"]').each(function(){
		singlecheck(this,'input[name="sxddby"]');
	});

	$('input[name="lkjzqx"]').each(function(){
		singlecheck(this,'input[name="lkjzqx"]');
	});

	$('input[name="qhtt"]').each(function(){
		singlecheck(this,'input[name="qhtt"]');
	});

	$('input[name="zzjsy"]').each(function(){
		singlecheck(this,'input[name="zzjsy"]');
	});

	$('input[name="hzqx"]').each(function(){
		singlecheck(this,'input[name="hzqx"]');
	});

	$('input[name="jgqx"]').each(function(){
		singlecheck(this,'input[name="jgqx"]');
	});

	$('input[name="wqx"]').each(function(){
		singlecheck(this,'input[name="wqx"]');
	});

	$('input[name="dwqx"]').each(function(){
		singlecheck(this,'input[name="dwqx"]');
	});

	$('input[name="hzzg"]').each(function(){
		singlecheck(this,'input[name="hzzg"]');
	});

	$('input[name="hzzg2"]').each(function(){
		singlecheck(this,'input[name="hzzg2"]');
	});
	
</script>