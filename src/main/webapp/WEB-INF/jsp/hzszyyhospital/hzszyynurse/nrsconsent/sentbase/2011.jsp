<div id="s2011">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div>
		<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<p class="functype" id="id_title2">急性胸痛患者诊疗时间记录表</p>
		<div>
			<table class="managetable maintext2">
				<tr>
					<td class="titletd" rowspan="3">
						<span class="titlespan">基本信息</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="lifour">
								<label>患者姓名：</label>
								<input type="text" class="intextinput" value="${hspemginfCustom.cstNam}"/>
							</li>
							<li class="lifour">
								<label>性别：</label>
								<label class="checklabel">
									<input type="checkbox" name="cstsex" id="male">男
								</label>
								<label class="checklabel">
									<input type="checkbox" name="cstsex" id="female">女
								</label>
							</li>
							<li class="lifour">
								<label>年龄：</label>
								<input type="text" class="intextinput" id="cstage"/>
							</li>
							<li class="lifour">
								<label>电话：</label>
								<input type="text" class="intextinputlong"/>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithirdtwo">
								<span>到达方式：
									<label class="checklabel">
										<input type="checkbox" name="ddfs"/>120救护车
									</label>
									<label class="checklabel">
										<input type="checkbox" name="ddfs"/>外院转运
									</label>
									<label class="checklabel">
										<input type="checkbox" name="ddfs"/>自行来院
									</label>
									<label class="checklabel">
										<input type="checkbox" name="ddfs"/>院内发病
									</label>
								</span>
							</li>
							<li class="lithree">
								<label>住院号：</label>
								<input type="text" class="intextinput" value="${hspHlpgb.qxZyh}"/>
							</li>
						</ul>
					</td>
				</tr>
				<tr>	
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>患者发病时间：</label>
								<input class="Wdate spcWdate thindate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</li>
							<li class="lithree">
								<label>发病地址：</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>身份证号：</label>
								<input type="text" class="intextinputlong"/>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lione">
								<label>到达我院/就诊时间：</label>
								<input class="Wdate spcWdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
								(24小时制，以急诊大厅的钟表时间为准)
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="titletd" rowspan="8">
						<span class="titlespan">急诊科(首次医疗接触)</span>
					</td>
					<td class="maintd">
						<ul class="tableul">
							<li class="litwo">
								<label>护士分诊时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
							<li class="litwo">
								<label>首份心电图时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithirdtwo">
								<label>心电图确诊时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
								<label style="margin-left:5px">签名：</label>
								<input type="text" class="intextinputlong"/>
							</li>
							<li class="lithree">
								<label>抗血小板药物给药时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lione">
								<span class="f-left">抗血小板药物剂量：</span>
								<label>阿司匹林(ASA)</label>
								<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>mg，
								<label>氯吡格雷</label>
								<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>mg，
								<label>立普妥</label>
								<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>mg
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
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
									</label>
									<label class="checklabel">
										<input type="checkbox"/>腹痛
									</label>
									<label class="checklabel">
										<input type="checkbox"/>呼吸困难
									</label><br/>
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
									<label class="checklabel">
										<input type="checkbox"/>其他
										<input type="text" class="intextinputlong"/>
									</label>
								</span>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lione">
								<span class="f-left">生命体征：</span>
								<span class="chbox">
									<label>意识</label>
									<input type="text" class="intextinput"/>
									<label>脉搏</label>
									<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>次/分
									<label>心率</label>
									<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>次/分
									<label>呼吸</label>
									<input type="text" class="intextinputshort" onkeyup="exchangetonum(this)"/>次/分
									<label>血压</label>
									<input type="text" class="intextinput"/>mmHg
									<label>Killip分级</label>
									<input type="text" class="intextinput"/>
								</span>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>cTnI/TnT抽血时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
							<li class="lithree">
								<label>cTnI/TnT报告时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
							<li class="lithree">
								<label>cTnI/TnT数值：</label>
								<input type="text" class="intextinputshort"/>
								<label>(单位)</label>
								<input type="text" class="intextinput"/>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="litwo">
								<label>血清肌酐：</label>
								<input type="text" class="intextinput"/>umol/L
							</li>
							<li class="litwo">
								<label>患者送出急诊室时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lione">
								<span>去向：
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>导管室
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>CCU
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>ICU
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>呼吸科
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>心外科
									</label>
									<label class="checklabel">
										<input type="checkbox" name="yqqx"/>其他
										<input type="text" class="intextinput"/>
									</label>
								</span>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
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
									</label>
									<label class="checklabel">
										<input type="checkbox"/>非心源性心痛
									</label><br/>
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
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lithree">
								<label>心内科会诊：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">
							</li>
							<li class="lithirdtwo">
								<label>急诊PCI开始知情同意：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">，
								<label>签署知情同意书：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">，
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lione">
								<label>启动导管室：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">(通知导管室)，
								<label>医生：</label>
								<input type="text" class="intextinput"/>，
								<label>激活时间(导管室可以手术时间)：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">(30分钟内)
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="titletd" rowspan="7">
						<span class="titlespan">导管室</span>
					</td>
					<td class="maintd">
						<p class="tableinp">急性冠脉综合征（包括急性ST段抬高型心肌梗塞）</p>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lione">
								<span class="f-left">再灌注措施：</span>
								<span class="chbox">
									<label class="checklabel">
										<input type="checkbox"/>急诊PCI
									</label>
									<label class="checklabel">
										<input type="checkbox"/>溶栓
									</label>
									<label class="checklabel">
										<input type="checkbox"/>补救PCI 
									</label>
									<label class="checklabel">
										<input type="checkbox"/>急诊仅造影
									</label><br/>
									<label class="checklabel">
										<input type="checkbox"/>择期PCI
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
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>患者进入导管室时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>开始穿刺时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>成功时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>血管路径：</label>
								<label class="checklabel">
									<input type="checkbox"/>桡动脉
								</label>
								<label class="checklabel">
									<input type="checkbox"/>股动脉
								</label>
							</li>
							<li class="lithree">
								<label>冠脉造影开始时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>完成时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="lithree">
								<label>球囊扩张时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithirdtwo">
								<label>血栓抽吸：</label>
								<label class="checklabel">
									<input type="checkbox"/>是
								</label>
								<label class="checklabel">
									<input type="checkbox"/>否
								</label>
								<label>罪犯血管：</label>
								<label class="checklabel">
									<input type="checkbox"/>LM
								</label>
								<label class="checklabel">
									<input type="checkbox"/>LAD
								</label>
								<label class="checklabel">
									<input type="checkbox"/>LCX
								</label>
								<label class="checklabel">
									<input type="checkbox"/>RCA
								</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="litwo">
								<label>血小板GP IIb/IIIa抑制剂：</label>
								<label class="checklabel">
									<input type="checkbox"/>是
								</label>
								<label class="checklabel">
									<input type="checkbox"/>否
								</label>
								<input type="text" class="intextinputshort"/>ml
							</li>
							<li class="litwo">
								<label>PCI手术完成时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">			
								<label>IABP植入：</label>
								<label class="checklabel">
									<input type="checkbox"/>是
								</label>
								<label class="checklabel">
									<input type="checkbox"/>否
								</label>	
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd">
						<ul class="tableul">
							<li class="litwo">
								<label>手术前罪犯血管血流：TIMI</label>
								<input type="text" class="intextinputshort"/>级，
								<label>手术后：TIMI</label>
								<input type="text" class="intextinputshort"/>级
							</li>
							<li class="litwo">
								<label>介入医生：</label>
								<input type="text" class="intextinputlong"/>	
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lithirdtwo">
								<label>急性冠脉综合征患者转归：</label>
								<label class="checklabel">
									<input type="checkbox"/>CCU
								</label>
								<label class="checklabel">
									<input type="checkbox"/>普通病房
								</label>
								<label class="checklabel">
									<input type="checkbox"/>死亡
								</label>
								<label class="checklabel">
									<input type="checkbox"/>签字出院
								</label>
							</li>
							<li class="lithree">
								<label>院内出现心衰：</label>
								<label class="checklabel">
									<input type="checkbox"/>是
								</label>
								<label class="checklabel">
									<input type="checkbox"/>否
								</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lione">
								<label>首次抗凝给药：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">，
								<label>药物名称：</label>
								<input type="text" class="intextinputlong"/><br/>
								<label>24小时强化阿托伐他汀治疗：</label>
								<label class="checklabel">
									<input type="checkbox"/>是
								</label>
								<label class="checklabel">
									<input type="checkbox"/>否
								</label>，
								<label>住院天数：</label>
								<input type="text" class="intextinputshort"/>		
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lione">
								<label>费用：</label>
								<input type="text" class="intextinputshort"/>；
								<label>出院时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'MM-dd HH:mm'})">；
								
								<label>出院带药：</label>
								<label class="checklabel">
									<input type="checkbox"/>DAPT
								</label>
								<label class="checklabel">
									<input type="checkbox"/>ACEI/ARB
								</label>
								<label class="checklabel">
									<input type="checkbox"/>他汀
								</label>
								<label class="checklabel">
									<input type="checkbox"/>β阻滞剂
								</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lione">
								<label>转院或转科：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'MM-dd HH:mm'})">，
								<label>接诊科室：</label>
								<input type="text" class="intextinputlong"/>，
								<label>接诊医院名称：</label>
								<input type="text" class="intextinputlong"/>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<p class="tableinp">非急性冠脉综合征的其他急性胸痛</p>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lithree">
								<label>D-二聚体结果时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>BNP快速检测结果时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>心脏B超检查时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lithree">
								<label>D-胸部X线检查时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>腹部B超检查时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="lithree">
								<label>通知CT室准备CTA时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="litwo">
								<label>胸腹主动脉或肺动脉CTA完成时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
							<li class="litwo">
								<label>主动脉或肺动脉CTA诊断时间：</label>
								<input class="Wdate spcWdate clockdate" type="text" readonly="readonly" onclick="WdatePicker({dateFmt:'HH:mm'})">								
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td class="maintd" colspan="2">
						<ul class="tableul">
							<li class="lione">
								<label>非急性冠脉综合征患者转归：</label>
								<br/>
								<label class="checklabel">
									<input type="checkbox"/>非急性冠脉综合征患者转归：
									<input type="text" class="intextinputlong"/>科室；
								</label>
								<label class="checklabel">
									<input type="checkbox"/>急诊室观察；
								</label>
								<label class="checklabel">
									<input type="checkbox"/>签字出院；
								</label>
								<label>医师：</label>
								<input type="text" class="intextinputlong"/>
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

	$('input[name="ddfs"]').each(function(){
		singlecheck(this,'input[name="ddfs"]');
	});
	
	$('input[name="zg"]').each(function(){
		singlecheck(this,'input[name="zg"]');
	});
	$('input[name="cstsex2"]').each(function(){
		singlecheck(this,'input[name="cstsex2"]');
	});

	$('input[name="ddfs2"]').each(function(){
		singlecheck(this,'input[name="ddfs2"]');
	});
	
	$('input[name="zg2"]').each(function(){
		singlecheck(this,'input[name="zg2"]');
	});

	$(function(){
		if('${hspemginfCustom.cstAge}' != ''){
			$('#cstage').val("${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}");
		}
	})
</script>