<div id="s3007">
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
						<label id="id_7" class="labtitle">使用碘对比剂目的：</label>
						<label id="id_7_1">增加病变组织与正常组织的密度差别，从而提高病变的显示率和诊断准确性。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8" class="labtitle">有关碘对比剂注意事项：</label><br/>				
						<label id="id_9">1.请告知医生以往有无：碘对比剂过敏史、甲状腺功能亢进、严重肾功能不全、哮喘病史等。</label><br/>
						<label id="id_10">2.使用碘对比剂可能出现不同程度的不良反应：</label>
						<div style="text-indent: 2em">
							<label id="id_11">（1）轻度不良反应：咳嗽、喷嚏、一过性胸闷、结膜炎、鼻炎、恶心、呕吐、全身发热、荨麻疹、瘙痒、血管神经性水肿等。</label><br/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_12">（2）重度不良反应：喉头水肿、反射性心动过速、惊厥、震颤、抽搐、意识丧失、休克等，甚至死亡或其他不可预测的不良反应。</label><br/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_13">（3）迟发性不良的反应：注射碘对比剂1小时至1周内有能出现各种迟发性不良反应，如恶心、呕吐、头痛、骨骼肌肉疼痛、发热等。</label><br/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_14">（4）注射部位可能出现碘对比剂漏出，造成皮下组织肿胀、疼痛、麻木感，甚至溃烂、坏死等。</label><br/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_15">（5）如使用高压注射器，存在注射针头脱落、局部血管破裂的潜在危险。</label><br/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_16">（6）肾功能不全、心力衰竭、低蛋白血症、贫血、高龄（年龄>70岁）、低钾血症、使用肾毒性药物等情况下容易发生对比剂肾病。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_17" class="labtitle">针对不良反应，我们采取的防范及处理措施：</label>
						<div style="text-indent: 2em">
							<label id="id_18">严格把握碘对比剂使用适应症；备好必要的急救药品、物品；检查完30分钟内患者不得擅自离开检查点，出现不良反应给予对症治疗；如出现气道痉挛、喉头水肿或休克等严重不良反应，立刻急救并通知临床医师积极抢救。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_19">本人已阅读、理解并同意以上内容，同意使用碘对比剂并承担使用带来的风险。同时，我也理解虽然医院对可能出现的各种情况做了各种防范措施，但仍可能出现上述不良反应。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_22">受检者姓名：</label>
						<input id="value_9" type="text" class="input_txt inputA"/>
						<label id="id_23">签署人：</label>
						<input id="value_10" type="text" class="input_txt inputA"/>
						<label id="id_24">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_20">谈话医生：</label>
						<input id="value_7" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
						<label id="id_21">日期：</label>
						<input id="value_8" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH'})">	
					</td>	
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('碘对比剂使用知情同意书')
	})
</script>
</div>