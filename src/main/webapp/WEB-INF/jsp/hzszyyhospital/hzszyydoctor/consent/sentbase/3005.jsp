<div id="s3005">
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
						<label id="id_6">临床诊断：</label>
						<input id="value_6" type="text" class="inputE input_txt jbzdDes"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>拟超说明书用药药品名称及使用方法</label>
						<input type="text" class="inputE input_txt"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>拟超说明书用药类型：</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_1"/>
						<label class="doctorType" for="checkbox_1">给药剂量</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_2"/>
						<label class="doctorType" for="checkbox_2">改变适应人群</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_3"/>
						<label class="doctorType" for="checkbox_3">改变适应症</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_4"/>
						<label class="doctorType" for="checkbox_4">改变给药途径</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<input type="checkbox" class="checkStyle" id="checkbox_5"/>
						<label class="doctorType" for="checkbox_5">其他：</label>
						<input type="text" class="input_txt inputC"/>
					</td>
				</tr>	
				<tr>
					<td colspan="5">
						<label>为实现患者健康利益最大化，现针对患者病情，建议“超说明书用药”。为此，特告知如下事项：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>1．根据您的病情，目前临床药品常规使用并不理想。在充分考虑药品不良反应、禁忌症、注意事项等，按照有利患者健康、知情同意等原则，我们认为，超说明书使用该药品是您目前的最佳诊治方案。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>2．本超说明书用药不是用于临床试验或科研目的。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>3．您有权要求医师用通俗的语言对本知情同意书所载内容进行讲解，在医师讲解后，您有权向其提问并得到客观、科学的回答。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>4. 超说明书使用该药品可能发生如下不良反应，包括且不限于：</label>
						<input type="text" class="input_txt inputC"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>5. 如发生意外情况或上述不良反应，医务人员将按规范积极救治，请患者及家属放心。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>6. 风险防范措施：</label>
						<input type="text" class="input_txt inputC"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label>本人声明：医生已将上述内容明确告知，我已经充分理解上述情况，同意接受被告知药品的超说明书用法，并接受此种治疗可能发生的医疗风险。</label>
						</div>
					</td>		
				</tr>
				<tr>
					<td colspan="3">
						<label>医生签名：</label>
						<input type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
						<label>被告知者与患者关系：</label>
						<input type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label>被告知者签名（手印）：</label>
						<input type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label>签字时间：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
					<td colspan="5" align="right">
						<label>签字时间：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('超说明书用药知情同意书')
	})
</script>
</div>