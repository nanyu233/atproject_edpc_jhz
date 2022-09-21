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
						<label class="labtitle">诊断：</label>
						<input type="text" class="inputE input_txt jbzdDes"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6" class="labtitle">治疗建议：</label>
						<label id="id_7" >医生已告知患者有</label>
						<input id="value_7" type="text" class="input_txt inputC"/>
						<label id="id_8">，需要进行气管插管和机械通气。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_9">机械通气的目的：改善呼吸功能，维持生命体征，为解除诱发加重因素争取时间。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_10">医生告知患者气管插管和机械通气可能发生的一些风险，有些不常见的风险可能没有在此列出，具体的操作根据不同病人的情况有所不同，医生已告知患者及家属可与患者的医生讨论有关患者操作的具体内容，如果有特殊的问题可与患者的医生讨论。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label style="font-weight: bold;" id="id_11">治疗潜在风险和对策</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13">
						1.我理解任何麻醉都存在风险。
						</label><br/>
						<label id="id_13_1">
						2.我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。
						</label><br/>
						<label id="id_13_2">
						3.我理解此操作可能发生的风险和医生的对策：
						</label><br/>
						<label id="id_13_3" class="labtitle">
						气管插管：
						</label><br/>
						<label id="id_13_4">
						1）刺激迷走神经引起呼吸心跳骤停；
						</label><br/>
						<label id="id_13_5">
						2）口腔局部损伤和牙齿脱落；
						</label><br/>
						<label id="id_13_6">
						3）咽部感染、喉头水肿及声带损伤；
						</label><br/>
						<label id="id_13_7">
						4）气管软骨脱位；
						</label><br/>
						<label id="id_13_8">
						5）误吸、肺部感染和肺不张；
						</label><br/>
						<label id="id_13_9">
						6）粘液栓、痰栓等引起急性气道阻塞；
						</label><br/>
						<label id="id_13_10">
						7）误入食道；
						</label><br/>
						<label id="id_13_11">
						8）插管失败；
						</label>
						<br/>
						<label id="id_14" class="labtitle">机械通气</label>
						<br/>
						<label id="id_15">
						1）呼吸机诱发的肺损伤，相关性肺部感染；
						</label><br/>
						<label id="id_15_1">
						2）患者不能脱离呼吸机，呼吸机依赖；
						</label><br/>
						<label id="id_15_2">
						3）血流动力学不稳定，血压下降，心律失常，心功能衰竭等循环功能障碍；
						</label><br/>
						<label id="id_15_3">
						4）患者与呼吸机不同步，致呼吸困难，呼吸功能衰竭继续加重；
						</label><br/>
						<label id="id_15_4">
						5）病人需要约束治疗；
						</label><br/>
						<label id="id_15_5">
						6）皮下气肿、纵膈气肿和气胸等；氧中毒；
						</label><br/>
						<label id="id_15_6">
						7）气管食管瘘；
						</label><br/>
						<label id="id_15_7">
						4.我理解如果患者患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至死亡。
						</label><br/>
						<label id="id_15_8">
						5.如果患者的体位不当或不遵医嘱，可能影响操作效果。
						</label>
						<br/>
						<label id="id_18">一旦发生上述风险和意外，医生会采取积极应对措施。</label>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_17">我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label>
						</div>
						<label id="id_16" class="labtitle">医疗替代方案</label>
						<br/>
						<label id="id_16_1">如不行气管插管，还可以选择的治疗方案有：无创呼吸机辅助呼吸等，但根据目前病情，首选治疗方案为气管插管。</label>
						<br/>
						<label id="id_19" class="labtitle">患者知情选择</label>
						<br/>
						<label id="id_20">
						1.我的医生已经告知我将要进行的诊治方式、此次诊治及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次诊治的相关问题。
						</label><br/>
						<label id="id_20_1">
						2.我同意在诊治中医生可以根据我的病情预定的诊治方式做出调整。
						</label><br/>
						<label id="id_20_2">
						3.我理解我的诊治可能需要多位医生共同进行。
						</label><br/>
						<label id="id_20_3">
						4.我并未得到诊治百分之百成功的许诺。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_21">患者签名：</label>
						<input id="value_8" type="text" class="input_txt inputA"/>
						<label id="id_22">与患者关系：</label>
						<input id="value_9" type="text" class="input_txt inputA"/>
						<label id="id_23">签名日期：</label>
						<input id="value_10" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_24">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_25">患者签名：</label>
						<input id="value_11" type="text" class="input_txt inputA"/>
						<label id="id_26">与患者关系：</label>
						<input id="value_12" type="text" class="input_txt inputA"/>
						<label id="id_27">签名日期：</label>
						<input id="value_13" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_28" class="labtitle">医生陈述:</label>
						<br/>
						<label id="id_29" >
						我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_30">医生签名：</label>
						<input id="value_14" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2"  align="right">
						<label id="id_31">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('气管插管和机械通气知情同意书')
	})
</script>
</div>