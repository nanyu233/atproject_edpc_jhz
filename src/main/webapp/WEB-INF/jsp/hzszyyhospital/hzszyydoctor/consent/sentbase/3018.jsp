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
						<label class="labtitle">疾病介绍和治疗建议</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label >医生已告知我患有</label>
						<input type="text" class="input_txt inputB"/>
						<label >，需要在</label>
						<input type="text" class="input_txt inputA"/>
						<label >麻醉下进行</label>
						<input type="text" class="input_txt inputD"/>
						<label >操作或手术。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label>手术潜在风险和对策：</label>
						</div>
						<div style="text-indent: 2em">
							<label>医生告知我手术可能发生的风险有：</label><input type="text" class="input_txt inputC" />
						</div>
						<div style="text-indent: 2em">
							<label>术后可能存在的并发症有：</label><input type="text" class="input_txt inputC" />
						</div>
						<div style="text-indent: 2em">
							<label> 我理解如果我患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至危及生命。</label>
						</div>
						<div style="text-indent: 2em">
							<label>我理解术后如果我的体位不当或不遵医嘱，可能影响手术效果。</label>
						</div>
						<div style="text-indent: 0em">
							<label>患者知情选择</label>
						</div>
						<div style="text-indent: 2em">
							<label>1.我的医生已经告知我将要进行的操作方式、此次操作及操作后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次操作的相关问题。</label>
						</div>
						<div style="text-indent: 2em">
							<label>2.我同意在操作中医生可以根据我的病情对预定的操作方式做出调整。</label>
						</div>
						<div style="text-indent: 2em">
							<label>3.我理解我的操作可能存在未进入医保需要自行承担的费用，如</label><input type="text" class="input_txt inputC" />
						</div>
						<div style="text-indent: 2em">
							<label>4.我并未得到操作百分之百成功的许诺。</label>
						</div>
						<div style="text-indent: 2em">
							<label>5.我授权医师对操作切除的病变器官、组织或标本进行处置，包括病理学检查、细胞学检查和医疗废物处理等。</label>
						</div>
					</td>
				</tr>
				
				
				<tr>
					<td colspan="3">
						<label>医生签名：</label>
						<input type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2"  align="right">
						<label>签名日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label >患者授权亲属签名:</label>
						<input  type="text" class="input_txt inputA"/>
						<label >与患者关系：</label>
						<input  type="text" class="input_txt inputA"/>
						<label >联系电话：</label>
						<input  type="text" class="input_txt inputB"/>
					</td>
				</tr>
				<tr>
					<td colspan="5" >
						<label>签名日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('有创操作知情同意书')
	})
</script>
</div>