<div id="s3010">
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
						<label id="id_6_1" class="labtitle">目前诊断：</label>
						<input type="text" class="inputE input_txt jbzdDes"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7" >1. 因</label>
						<input id="value_7" type="text" class="input_txt inputA"/>
						<label id="id_8">，拟施行内镜诊疗：</label>
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>胃镜
						</label>&nbsp;&nbsp;
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>麻醉胃镜
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_9">胃镜下介入治疗：<input id="value_7" type="text" class="input_txt inputA"/>，请您认真了解以下内容并做出是否接受诊疗的决定。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">2.医生会给您解释：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13">
						2.1胃镜诊疗的目的：明确诊断、评估病情、或治疗疾病。
						</label><br/>
						<label id="id_13_1">
						2.2在实施过程中/后可能出现伴随的不适、并发症和风险，但不仅仅限于：
						</label>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>麻醉意外、麻醉药物过敏、造影剂过敏、水中毒、毒副反应所致的意外情况；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>咽喉部损伤、下颌关节脱臼、食道贲门粘膜撕裂； 
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>消化道出血、消化道溃疡、穿孔、消化道狭窄、食管气管瘘、胃结肠瘘；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>胸痛、腹胀、腹痛、低血糖；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>反流性窒息、吸入性肺炎、异位栓塞、继发感染、腹腔感染出血；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>心、脑、呼吸意外的可能；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>因疾病或个体差异，相同的诊疗手段有可能出现不同的结果，少数诊疗可能无法完成或疗效不佳；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>术中因疾病变化更改方案可能；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>术中/后可能需要开腹手术；
							</label>
						</div>
						<div style="text-indent: 2em">
							<label class="doctorType">
								<input id="tr_1_2" type="checkbox"/>其他：<input id="value_7" type="text" class="input_txt inputC"/>
							</label>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label id="id_11">2.3如果您患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或有吸烟史，以上这些风险可能会加大，或者在诊疗中/后出现相关的病情加重或心脑血管意外，甚至死亡。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">2.4针对上述情况将采取的防范措施：根据现代医疗规范，采取及时、有效、科学的防范措施，最大限度地保护患者安全。如术中有变化将及时与家属联系，积极组织抢救和处置，请您和家属配合。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">2.5可供选择的其他诊疗方法：</label>
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>钡餐造影
						</label>&nbsp;&nbsp;
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>CT等放射影像学检查
						</label>
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>其他内镜检查方法
						</label>
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>外科手术
						</label>
						<label class="doctorType">
							<input id="tr_1_2" type="checkbox"/>其他<input id="value_14" type="text" class="input_txt inputA"/>
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">3.检查前请您告知医生您所患的基础疾病、药物过敏史及特殊服药情况，如：阿司匹林、氯吡格雷、华法林等。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_11">您以下的签字表示：您已阅读并理解、同意前面所述的内容；您授权并同意医生为您施行消化内镜诊疗，并同意在诊疗中医生可以根据病情对预定的诊疗方式做出调整，且未得到诊疗百分之百成功的许诺；您授权内镜医生对在诊疗中取下的相关组织进行必要的医学处理，包括病理学、细胞学检查和医疗废物处理等。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_30">操作医生签字：</label>
						<input id="value_14" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="4"  align="right">
						<label id="id_31">日期：</label>
						<input id="value_15" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_21">患方签字：</label>
						<input id="value_8" type="text" class="input_txt inputA"/>
						<label id="id_22">与患者关系：</label>
						<input id="value_9" type="text" class="input_txt inputA"/>
						<label id="id_23">日期：</label>
						<input id="value_10" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('胃镜诊疗知情同意书')
	})
</script>
</div>