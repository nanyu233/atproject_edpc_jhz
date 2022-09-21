<div id="s3004">
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
						<label>超声造影检查介绍</label>				
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label>超声造影通过外周静脉快速注入小剂量的声学造影剂，在特定成像模式下观察人体脏器内病变的微循环特征，提供病灶的血流增强信息以便判定病灶的性质，是一项无放射性损伤的影像检查手段。由于已知或未知的原因，超声造影检查有可能出现以下情况：不能达到预期结果；出现并发症、损伤甚至死亡等。因此，您有权知道超声造影检查的性质和目的、存在的风险，预期的效果或对人体的影响。</label>	
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>超声造影检查潜在风险和对策</label>				
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label>医生告知我超声造影检查期间可发生的一些风险，有些不常见的风险可能没有在此列出，具体的情况根据不同患者的情况有所不同，医生告诉我可与我的医生讨论有关我超声造影检查的具体内容，如果我有特殊的问题可与我的医生讨论。</label>	
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label>1、我理解超声造影检查存在风险。</label>
						</div>
						<div style="text-indent: 2em">
							<label>2、我理解不同患者具有个体差异，存在以下风险：</label>
						</div>	
						<div style="text-indent: 2em">
							<label>1） 超声造影剂，安全性高，一般不会发生药物反应，但极少数患者由于特异体质或各种事先不能预知的原因，可能发生过敏等不良反应，极少数严重者会危及生命，现代医疗手段尚难预知。不同程度的过敏反应具体表现有：</label>
						</div>
						<div style="margin-left: 2em">
							<label>①轻度反应：荨麻疹、头痛头晕、恶心呕吐等；</label><br/>
							<label>②中度反应：口舌发麻、结膜充血、胸闷气急、发音嘶哑等；</label><br/>
							<label>③重度反应：呼吸困难、血压骤降、意识丧失、休克、呼吸心跳骤停等。</label>
						</div>
						<div style="text-indent: 2em">						
							<label>2）除上述情况外，在检查过程中有可能发生其他不能预料的意外情况，特别是对于重症患者、继往有心脑血管疾病的患者。</label>
						</div>
						<div style="text-indent: 2em">	
							<label>3、我理解既往有超声造影剂过敏史，应提前告知医生并禁止使用增强检查。</label>
						</div>
						<div style="text-indent: 2em">
							<label>4、我理解过敏反应多在注药后20分钟内出现，应在检查结束30分钟后再离开医院，如出现上述造影剂风险应及时告知医生。若离院后出现不适，应速在就近医院诊治。</label>
						</div>
						<div style="text-indent: 2em">
							<label>5、我理解如果出现超声造影检查的不良反应，医生将积极给予相应处置，患者家属应予以理解和配合。</label>
						</div>
						<div style="text-indent: 2em">
							<label>6、我理解有严重的心脏病/心功能不全/肝肾功能不全/糖尿病/哮喘/甲状腺功能亢进等疾病、高龄、过敏体质、过度紧张焦虑的患者为超声造影检查的高危人群，应在检查前充分告知医师并慎重评估，应有家属或临床医生陪护，尤其是在夜班急诊情况下。</label>
						</div>
						<div style="text-indent: 2em">
							<label>7、我理解由于疾病的复杂性及影像检查的限度，超声造影检查后仍有不能作出明确诊断的可能性。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>特殊风险或其它高危因素</label>	<br/>
						<div style="text-indent: 2em">
							<label>我理解根据我个人的病情，我可能出现以下特殊并发症或风险：</label>
							<textarea id="areaVal" class="fullArea printHide"></textarea>
							<span id="spanVal" class="pageHide"></span>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>医生陈述</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>医生签名：</label>
						<input type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
						<label>签名日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>患者知情选择：</label>
						<div style="text-indent: 2em">
							<label>
							●我的医生已经告知我将要进行的超声造影检查在使用造影剂过程中可能遇到的风险、意外及事先不可预知的情况，并且解答了我关于增强检查的相关问题。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label>
							●我同意在检查期间医生可以根据我的具体情况对于检查实施方案做出调整，一旦发生风险及意外情况，本人授权医护人员按照医学常规予以处置。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label>
							●我理解我的检查方案的实施需要多位医生和技术人员共同进行。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label>
							●我理解在检查完成后应补交超声造影相关费用。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label>
							●我并未得到超声造影检查百分之百明确诊断所患疾病的许诺。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>患者签名：</label>
						<input type="text" class="input_txt inputA"/>
					</td>
					<td colspan="2" align="right">
						<label>签名日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>如果患者无法签署知情同意书，请其授权的亲属在此签名：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>患者授权亲属签名：</label>
						<input type="text" class="input_tx inputAt"/>
						<label>与患者关系：</label>
						<input type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>签名日期：</label>
						<input class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function(){
		$('#id_title2').html('超声造影检查知情同意书')
	})
</script>
</div>