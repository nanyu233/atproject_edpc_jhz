<div id="s1055">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicZqty.jsp"></jsp:include>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr class="basicMsgTr">
					<td style="width: 25%">
						<label id="id_1">患者姓名:</label>
						<input id="value_1" type="text" class="input_txt cstNam"/>
					</td>
					<td style="width: 15%">
						<label id="id_2">性别:</label>
						<input id="value_2" type="text" class="input_txt cstSexCod"/>
					</td>
					<td style="width: 16%">
						<label id="id_3">年龄:</label>
						<input id="value_3" type="text" class="input_txt age"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">科室:</label>
						<input id="value_4" type="text" class="input_txt emgFkCod"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">病历号:</label>
						<input id="value_5" type="text" class="input_txt mpi"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
					<div style="text-indent: 0em">
						<label id="id_6" style="font-weight: bold;">输血及血液制品目的：</label>
						<input id="value_6" type="text" class="input_txt inputE"/>	<br/>
						<label id="id_7" style="font-weight: bold;">输血史：</label>
						<input id="value_7" type="text" class="input_txt inputB"/>
						<label id="id_8">&nbsp;&nbsp;&nbsp;&nbsp;孕：</label>
						<input id="value_8" type="text" class="input_txt inputB"/>
						<label id="id_9">&nbsp;&nbsp;&nbsp;&nbsp;产：</label>
						<input id="value_9" type="text" class="input_txt inputB"/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_10">输血成分：</label>
						<input id="value_10" type="text" class="input_txt inputB"/>
						<label id="id_11">临床诊断：</label>
						<input id="value_11" type="text" class="input_txt inputE jbzdDes"/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_12" style="font-weight: bold;">输血方式：</label>
						<input id="value_12" type="text" class="input_txt inputE"/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_13" style="font-weight: bold;">血液制品种类：</label>
						<input id="value_13" type="text" class="input_txt inputE"/>
					</div>
					</td>
				</tr>
				
				
				<tr>
					<td colspan="5" align="left">
						<div style="text-indent: 0em">
							<label id="id_14" style="font-weight: bold;">输血前检查：</label>
						</div>
						<div style="text-indent: 0em">
							<label id="id_15">ALT：</label>
							<input id="value_15" type="text" class="input_txt inputA"/>
							<label id="id_16">u/L</label>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_17">HBsAg：</label>
							<input id="value_17" type="text" class="input_txt inputB"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_18">Anti-HBs：</label>
							<input id="value_18" type="text" class="input_txt inputB"/>
						</div>
						<div style="text-indent: 0em">
							<label id="id_19">HBeAg：</label>
							<input id="value_19" type="text" class="input_txt inputA"/>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_20">Anti-HBc：</label>
							<input id="value_20" type="text" class="input_txt inputB"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_21">Anti-HCV：</label>
							<input id="value_21" type="text" class="input_txt inputB"/>
						</div>
						<div style="text-indent: 0em">
							<label id="id_22">Anti-HIV1/2：</label>
							<input id="value_22" type="text" class="input_txt inputA"/>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_23">梅毒：</label>
							<input id="value_23" type="text" class="input_txt inputB"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_24">Anti-HBe：</label>
							<input id="value_24" type="text" class="input_txt inputB"/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_25">
								输血及血液制品治疗包括输全血、成分血，血液制品是临床治疗的重要措施之一，是临床抢救急、危重患者生命行之有效的手段，但输血及血液制品存在一定风险，可能发生输血反应及感染经血传播疾病。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_26">
								虽然我院使用的血液及血液制品均已按卫生部有关规定进行检测，但由于当前科技水平的限制，输血及血液制品仍有某些不能预测或不能防止的输血反应和输血传染病。输血及血液制品时可能发生的主要情况如下：
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<ul>
							<li>
								<label class="checklabel" id="ch1">
									<input type="checkbox" id="ch11">1.过敏反应
								</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="checklabel" id="ch2">
									<input type="checkbox" id="ch12">2.感染肝炎（乙肝、丙肝等）
								</label>
							</li>
							<li>
								<label class="checklabel" id="ch3">
									<input type="checkbox" id="ch13">3.发热反应
								</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="checklabel" id="ch4">
									<input type="checkbox" id="ch14">4.感染艾滋病、梅毒
								</label>
							</li>
							<li>
								<label class="checklabel" id="ch5">
									<input type="checkbox" id="ch15">5.感染疟疾
								</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="checklabel" id="ch6">
									<input type="checkbox" id="ch16">6.巨细胞病毒或EB病毒感染
								</label>
							</li>
							<li>
								<label class="checklabel" id="ch7">
									<input type="checkbox" id="ch17">7.输血引起的其他疾病
								</label>
							</li>
						</ul>
						<div style="text-indent: 2em">
							<label id="id_27">
								在您或被授权人了解上述可能发生的情况后，如果同意输血治疗，请在下面签字。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div>
							<label>受血者（或被授权人）签字:</label>
							<input id="value_24" type="text" class="input_txt inputB"/>
						</div>
					</td>
					<td align="right" colspan="1">
						<div>
							<label>日期：<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div>
							<label>被授权人与患者关系：</label>
							<input id="value_24" type="text" class="input_txt inputB"/>
						</div>
					</td>
					<td align="right" colspan="1">
						<div>
							<label>日期：<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div>
							<label>医师签字：</label>
							<input id="value_24" type="text" class="input_txt inputB"/>
							<span class="spanRelative" id="dzqm"></span>
						</div>
					</td>
					<td align="right" colspan="1">
						<div>
							<label>日期：<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div>
							<label>备注： </label><input id="value_24" type="text" class="input_txt inputB"/>
						</div>
						<div>
							<label>[备注:]因病情需要可能会反复输注   </label>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('输血、血液制品治疗知情同意书')
	})
</script>
</div>