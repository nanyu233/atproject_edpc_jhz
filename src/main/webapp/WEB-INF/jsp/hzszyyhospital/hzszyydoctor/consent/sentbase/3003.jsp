<div id="s3003">
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
						<label id="id_6" class="labtitle">诊断:</label>
						<input id="value_6" type="text" class="inputE input_txt jbzdDes"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7">1. 因</label>
						<input id="value_7" type="text" class="input_txt inputA"/>
						<label id="id_8">，拟施行内镜诊疗：</label>
						<input type="checkbox" class="checkStyle" id="checkbox_1"/>
						<label id="id_9" class="doctorType" for="checkbox_1">肠镜</label>
						<input type="checkbox" class="checkStyle" id="checkbox_2"/>
						<label id="id_10" class="doctorType" for="checkbox_2">麻醉肠镜</label>
						<input type="checkbox" class="checkStyle" id="checkbox_3"/>
						<label id="id_11" class="doctorType" for="checkbox_3">肠镜下治疗</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_12">。建议您认真了解以下相关内容并做出是否接受诊疗的决定。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13_1">2.医生会给您解释：</label><br/>
						<div class="childPoint">
							<label id="id_13_2">2.1肠镜诊疗的目的：明确诊断、评估病情、或治疗疾病。</label><br/>
							<label id="id_13_3">2.2可能出现下列伴随的不适、并发症和风险，但不仅仅限于：</label><br/>
							<div class="childPointB">
								<input type="checkbox" class="checkStyle" id="checkbox_4"/>
								<label id="id_13_4" class="doctorType" for="checkbox_4">肠道准备过程中发生恶心呕吐、水电解质紊乱；</label>
								<input type="checkbox" class="checkStyle" id="checkbox_5"/>
								<label id="id_13_5" class="doctorType" for="checkbox_5">麻醉意外、麻醉药物过敏、造影剂过敏、水中毒、毒副反应所致的意外；</label>
								<input type="checkbox" class="checkStyle" id="checkbox_6"/>
								<label id="id_13_6" class="doctorType" for="checkbox_6">消化道出血、消化道溃疡、穿孔、消化道狭窄、胃结肠瘘、原有肠梗阻加重；</label>
								<input type="checkbox" class="checkStyle" id="checkbox_7"/>
								<label id="id_13_7" class="doctorType" for="checkbox_7">胸痛、腹胀、腹痛、低血糖、虚脱；反流性窒息、吸入性肺炎、异位栓塞、继发感染、腹腔感染出血； </label>
								<input type="checkbox" class="checkStyle" id="checkbox_8"/>
								<label id="id_13_8" class="doctorType" for="checkbox_8">诱发或加重肛周疾病，如肛瘘、肛裂等；心、脑、呼吸意外的可能；</label>	
								<input type="checkbox" class="checkStyle" id="checkbox_9"/>
								<label id="id_13_9" class="doctorType" for="checkbox_9">因疾病或个体差异，相同的诊疗手段有可能出现不同的结果，少数诊疗可能无法完成或疗效不佳；</label>	
								<input type="checkbox" class="checkStyle" id="checkbox_10"/>
								<label id="id_13_10" class="doctorType" for="checkbox_10">术中因疾病变化更改手术方案可能；术中及术后可能需要开腹手术；</label>	
								<input type="checkbox" class="checkStyle" id="checkbox_11"/>
								<label id="id_13_11" class="doctorType" for="checkbox_11">其他：</label>	
								<input id="id_13_12" type="text" class="input_txt inputA"/>
							</div>
							<label id="id_13_13">2.3如果您患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在诊疗中/后出现相关病情加重或心脑血管意外，甚至死亡。</label><br/>
							<label id="id_13_14">2.4针对上述情况将采取的防范措施：根据现代医疗规范，采取及时、有效、科学的防范措施，最大限度地保护患者安全。如术中有变化将及时与家属联系，积极抢救和处置，请配合。</label><br/>
							<label id="id_13_15">2.5可供选择的其他诊疗方法：</label>
							<input type="checkbox" class="checkStyle" id="checkbox_12"/>
							<label id="id_13_16" class="doctorType" for="checkbox_12">结肠气钡双重造影</label>
							<input type="checkbox" class="checkStyle" id="checkbox_13"/>
							<label id="id_13_17" class="doctorType" for="checkbox_13">CT等放射影像学检查</label>
							<input type="checkbox" class="checkStyle" id="checkbox_14"/>
							<label id="id_13_18" class="doctorType" for="checkbox_14">其他内镜诊疗方法</label>
							<input type="checkbox" class="checkStyle" id="checkbox_15"/>
							<label id="id_13_19" class="doctorType" for="checkbox_15">外科手术</label>
							<input type="checkbox" class="checkStyle" id="checkbox_16"/>
							<label id="id_13_20" class="doctorType" for="checkbox_16">其他</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_14">3.检查前请您告知医生您所患的基础疾病、药物过敏史及特殊服药情况，如阿司匹林、氯吡格雷、华法林等。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_15">您以下的签字表示：您已阅读并理解、同意前面所述的内容；您授权并同意医生为您施行肠镜诊疗，并同意在诊疗中医生可以根据病情对预定的诊疗方式做出调整，并未得到诊疗百分之百成功的许诺。您授权内镜医生对在诊疗中取下的相关组织进行必要的医学处理，包括病理学、细胞学检查和医疗废物处理等。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_16">操作医生签字：</label>
						<input id="value_9" type="text" class="input_txt inputA"/>		
						<span class="spanRelative" id="dzqm"></span>				
						<label id="id_17">日期：</label>
						<input id="value_10" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
				<tr>
					<td colspan="5">					    
						<label id="id_11">患方签字：</label>
						<input id="value_10" type="text" class="input_txt inputA"/>				    
						<label id="id_12">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt inputA"/>
						<label id="id_13">日期：</label>
						<input id="value_12" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function(){
		$('#id_title2').html('肠镜诊疗知情同意书')
	})
</script>
</div>