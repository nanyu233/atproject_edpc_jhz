<div id="s3002">
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
						<label id="id_6">尊敬的患者家属或患者的法定监护人、授权委托人：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_6">患者目前诊断为</label>
							<input id="value_6" type="text" class="input_txt inputE jbzdDes"/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_7">虽经医护人员积极救治，但目前病情危重，且有可能进一步恶化，随时会出现一种或多种严重并发症：肺性脑病，严重心律失常、心功能衰竭、心肌梗死、高血压危象；上消化道出血导致出血性休克、脑出血、脑梗塞、脑疝；感染中毒性休克、过敏性休克、心源性休克；弥漫性血管内凝血（DIC）；多器官功能衰竭；糖尿病酮症、酸中毒、低血糖性昏迷、高渗性昏迷等。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8">其他</label>
						<input id="value_7" type="text" class="input_txt inputE"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_9">上述情况一旦发生会严重威胁患者生命，医护人员将会全力抢救。如您有其他问题和要求，请在接到本通知后主动找医生了解咨询。请您留下准确的联系方式，以便医护人员随时与您沟通。</label>							
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_10">此外，限于目前医学科学技术条件，尽管我院医护人员已经尽全力救治患者，仍存在因疾病原因患者不幸死亡的可能。请予以理解。</label>							
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11" class="labtitle">患者家属或患者的法定监护人、授权委托人意见：</label>
					</td>					
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_12">关于患者目前的病情危重、可能出现的风险和后果以及医护人员对于患者病情危重时进行的救治措施，医护人员已经向我详细告知。我了解了患者病情危重，并且</label>							
							<input id="value_8" type="text" class="input_txt inputA"/>
							<label id="id_13">（“同意”或“不同意”）医护人员进行（同意划√，可多选）：</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_1"/>
						<label id="id_14" class="doctorType" for="checkbox_1">气管切开</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_2"/>
						<label id="id_15" class="doctorType" for="checkbox_2">呼吸机辅助呼吸 </label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_3"/>
						<label id="id_16" class="doctorType" for="checkbox_3">电除颤</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_4"/>
						<label id="id_17" class="doctorType" for="checkbox_4">心脏按压</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_5"/>
						<label id="id_18" class="doctorType" for="checkbox_5">临时起搏器 </label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_6"/>
						<label id="id_19" class="doctorType" for="checkbox_6">其他有创救治措施</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_20">医生签名：</label>
						<input id="value_9" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
						<label id="id_21">签名日期：</label>
						<input id="value_10" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
					</td>	
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_22">患者授权亲属签名：</label>
						<input id="value_11" type="text" class="input_txt inputA"/>
						<label id="id_23">与患者关系：</label>
						<input id="value_12" type="text" class="input_txt inputA"/>
						<label id="id_24">联系电话：</label>
						<input id="value_13" type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_25">签名日期：</label>
						<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('病危病重通知书')
	})
</script>
</div>