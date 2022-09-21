<div id="s3008">
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
						<label>因MRI增强扫描需要使用磁共振对比剂（钆对比剂），有关钆剂相关内容告知如下：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8">一、使用钆对比剂可能出现的不适和不同程度的过敏和不良反应：</label><br/>
						<div style="text-indent: 2em">
							<label id="id_8">1.轻度不良反应：咳嗽、喷嚏、一过性胸闷、结膜炎、鼻炎、恶心、全身发热、荨麻疹、瘙痒、血管神经性水肿等。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_12">2.重度不良反应：喉头水肿、反射性心动过速、惊厥、震颤、抽搐、意识丧失、休克等。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_13">3.迟发性不良反应：肾功能不全的患者注射钆对比剂后可能会引起四肢皮肤的增厚和硬化，最后可造成关节固定和痉挛，极个别甚至可能会引起致死性肾源性系统性纤维化。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>二、注射部位可能出现钆对比剂漏出，个别患者可能引起皮下对比剂积存，造成皮下组织肿胀、疼痛、麻木感、甚至溃烂、坏死等；极个别患者可能发生非感染性静脉炎。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>三、使用高压注射器时，存在注射针头脱落、局部血管破裂的潜在危险。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>四、注射部位及全身可能出现其他不能预测的不良反应。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label class="labtitle">我已详细阅读并理解以上告知内容，本人（或受检者）既往无使用钆对比剂不良反应史，无肾功能不全。经慎重考虑，同意使用钆对比剂。</label>
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
		$('#id_title2').html('钆对比剂使用知情同意书')
	})
</script>
</div>