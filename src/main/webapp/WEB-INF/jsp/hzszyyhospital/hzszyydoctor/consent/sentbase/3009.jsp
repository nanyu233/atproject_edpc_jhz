<div id="s3009">
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
						<label class="labtitle">诊断:</label>
						<input type="text" class="inputE input_txt jbzdDes"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>1. 因</label>
						<input type="text" class="input_txt inputC"/>
						<label>，拟施行内镜诊疗： 胶囊内镜检查。建议您认真了解以下相关内容并做出是否接受诊疗的决定。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>2.医生会给您解释：</label>
						<div class="childPoint">
							<label>2.1胶囊内镜检查的目的：明确诊断、评估病情、或治疗疾病。胶囊内镜检查是一种无痛，无创的检查方法，对小肠异常与疾病有较高诊断价值。该检查方法诊断的阳性率为60-70%。</label><br/>
							<label>2.2胶囊内镜诊疗有一定的创伤性和危险性，在实施过程中/后可能出现下列伴随的不适、并发症和风险，但不仅仅限于：</label><br/>
							<div class="childPointB">
								<label>①.吞咽胶囊时咽喉部不适，偶见误入气道甚至引起气道梗阻需抢救。</label><br/>
								<label>②.因胃肠道动力差、消化道憩室、解剖变异、胃肠改道手术(如胃大部切除术毕II式)、各种原因引起的消化道狭窄等及其他不可预知的情况，造成胶囊停留时间过长或胶囊滞留，不能完整检查小肠，甚至造成急性肠梗阻者需急诊手术取出胶囊。</label><br/>
								<label>③.吞咽异常的患者，或胶囊在食管、胃腔停留时间过长，需经胃镜将胶囊送入十二指肠。个别内镜下无法送入者，只能取出胶囊。</label><br/>
								<label>④.从服用胶囊内镜到排出前，避免接近任何强力电磁源区域，如核磁共振检查（MRI）、无线电发射台，胶囊未排出前，禁忌行磁共振检查。</label><br/>
								<label>⑤.具有心脏起搏器或其他体内电子植入器者，检查前需与医师沟通。</label><br/>
								<label>⑥.胶囊为一次性，不能回收，每次排便时检查是否有胶囊排出，一般检查后1-3天内排出，具体因人而异（便秘），如有腹痛不适及时就诊。偶有胶囊长时间滞留不能排出者，必要时经内镜或手术取出胶囊。</label><br/>
								<label>⑦.胶囊内镜为自费项目。</label><br/>
								<label>因疾病或个体差异，相同的诊疗手段有可能出现不同的结果，少数诊疗可能无法完成或疗效不佳；术中因疾病变化更改手术方案可能；术中及术后可能需要开腹手术；</label><br/>
								<label>您患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或有吸烟史，以上这些风险可能会加大，或者在诊疗中/后出现相关的病情加重或心脑血管意外，甚至死亡。</label>
							</div>	
							<label>2.3针对上述情况将采取的防范措施</label><br/>
							<label>根据现代医疗规范，密切观察病情，采取及时、有效、科学的防范措施，力争将风险降低到最低限度，最大限度地保护患者安全，使诊疗过程顺利完成。如出现消化道出血、穿孔，则需内镜下处理或转外科开腹手术，如术中有变化将及时与家属联系，积极组织实施抢救和处置，请患者和家属配合，并理解。</label><br/>
							<label>2.4可供选择的其他诊疗方法：腹部CT，腹部MRI，消化道造影，小肠镜等。</label><br/>
							<label>2.5注意事项：对于行走不便或高龄的患者，未成年患者，要求家属陪同。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>3.检查前请您告知医生您所患的基础疾病、药物过敏史及特殊服药情况，如：阿司匹林、氯吡格雷、华法林等。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>您以下的签字表示：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>您已阅读并理解、同意前面所述的内容； </label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>您授权并同意医生为您施行消化内镜诊疗，并同意在诊疗中医生可以根据病情对预定的诊疗方式做出调整，且未得到诊疗百分之百成功的许诺；</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>您授权内镜医生对在诊疗中取下的相关组织进行必要的医学处理和科学研究，包括病理学检查、细胞学检查和医疗废物处理等。表明您同意学习者在检查过程中进行观摩，也同意拍摄不注明您身份的照片（有可能将其发表）作为医疗和教学之用。</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>操作医生签字：</label>
						<input type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label>日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>患方签字：</label>
						<input type="text" class="input_txt inputA"/>
					</td>
					<td colspan="2" align="right">
						<label>日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>(</label>
						<input type="checkbox" class="checkStyle" id="checkbox_1"/>
						<label class="doctorType" for="checkbox_1">患者本人</label>&nbsp;
						<input type="checkbox" class="checkStyle" id="checkbox_2"/>
						<label class="doctorType" for="checkbox_2">配偶</label>&nbsp;
						<input type="checkbox" class="checkStyle" id="checkbox_3"/>
						<label class="doctorType" for="checkbox_3">子女</label>&nbsp;
						<input type="checkbox" class="checkStyle" id="checkbox_4"/>
						<label class="doctorType" for="checkbox_4">其他</label>						
						<input type="text" class="input_txt inputA"/>
						<label>)</label>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('胶囊内镜检查知情同意书')
	})
</script>
</div>