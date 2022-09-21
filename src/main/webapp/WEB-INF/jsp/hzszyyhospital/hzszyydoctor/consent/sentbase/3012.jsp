<div id="s3012">
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
							<div style="text-indent: 2em">
								<label id="id_6_1">狂犬病是由狂犬病病毒引起的急性传染病，当人被感染狂犬病病毒的动物咬伤、抓伤及舔舐伤口或粘膜后，其唾液所含病毒经伤口或粘膜进入人体，一旦引起发病，病死率达100%。</label>
							</div>
							<div style="text-indent: 2em">
								<label id="id_6_1">暴露于可疑动物后，立即正确地处理伤口，根据需要注射狂犬病人免疫球蛋白和严格按照要求全程接种狂犬病疫苗，则能大大减少发病的风险。狂犬病人免疫球蛋白能特异地中和狂犬病病毒，可立即起效。狂犬病疫苗接种后可刺激机体产生抗狂犬病病毒的保护性抗体。为安全有效地使用狂犬病疫苗和狂犬病人免疫球蛋白，在您使用之前我们将有关信息告知于您，您可以根据自己的具体情况决定是否使用。</label>
							</div>
						</td>
					</tr>
				</table>
				<table border="1" id="table">
					<tr>
						<th width="300px" id="tr_1_1">接触方式<br />(在相应括号内划勾)</th>
						<th width="100px" id="tr_2_1">暴露分级</th>
						<th width="220px" id="tr_3_1">处置建议<br />(在相应括号内划勾)</th>
						<th width="180px" id="tr_4_1">患者/监护人意见<br />(在相应括号内划勾)</th>
					</tr>
					<tr>
						<td rowspan="1">
							<div>
								<label>符合以下情况者：</label>
							</div>
							<div>
								<label id="id_17" class="doctorType" for="checkbox_6">1.接触或喂养动物</label>
								<input type="checkbox" class="checkStyle" id="checkbox_6" />
							</div>
							<div>
								<label id="id_18" class="doctorType" for="checkbox_7">2.完好的皮肤被舔</label>
								<input type="checkbox" class="checkStyle" id="checkbox_7" />
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label>I级</label>
							</div>
						</td>
						<td rowspan="3">
							<div style="margin-bottom: 40px">
								<label id="id_24" class="doctorType" for="checkbox_13">不需处置</label>
								<input type="checkbox" class="checkStyle" id="checkbox_13" />
							</div>
							<div style="margin-bottom: 40px">
								<label id="id_24" class="doctorType" for="checkbox_14">处理伤口</label>
								<input type="checkbox" class="checkStyle" id="checkbox_14" />
							</div>
							<div style="margin-bottom: 40px">
								<label id="id_24" class="doctorType" for="checkbox_15">接种狂犬病疫苗</label>
								<input type="checkbox" class="checkStyle" id="checkbox_15" />
							</div>
							<div>
								<label id="id_24" class="doctorType" for="checkbox_16">注射狂犬病人免疫球蛋白</label>
								<input type="checkbox" class="checkStyle" id="checkbox_16" />
							</div>
						</td>
						<td rowspan="3">
							<div style="margin-bottom: 40px">
								<label id="id_24" class="doctorType" for="checkbox_17">同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_17" name="check1" />
								<label id="id_24" class="doctorType" for="checkbox_18">不同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_18" name="check1" />
							</div>
							<div style="margin-bottom: 40px">
								<label id="id_24" class="doctorType" for="checkbox_19">同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_19" />
								<label id="id_24" class="doctorType" for="checkbox_20">不同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_20" />
							</div>
							<div style="margin-bottom: 40px">
								<label id="id_24" class="doctorType" for="checkbox_21">同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_21" />
								<label id="id_24" class="doctorType" for="checkbox_22">不同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_22" />
							</div>
							<div>
								<label id="id_24" class="doctorType" for="checkbox_23">同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_23" />
								<label id="id_24" class="doctorType" for="checkbox_24">不同意</label>
								<input type="checkbox" class="checkStyle" id="checkbox_24" />
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div>
								<label>符合以下情况者：</label>
							</div>
							<div>
								<label id="id_19" class="doctorType" for="checkbox_8">1.裸露的皮肤被轻咬</label>
								<input type="checkbox" class="checkStyle" id="checkbox_8" />
							</div>
							<div>
								<label id="id_20" class="doctorType" for="checkbox_9">2.无出血的轻微抓伤或擦伤</label>
								<input type="checkbox" class="checkStyle" id="checkbox_9" />
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label>II级</label>
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div>
								<label>符合以下情况者：</label>
							</div>
							<div>
								<label id="id_21" class="doctorType" for="checkbox_10">1.单处或多处贯穿性皮肤咬伤或抓伤</label>
								<input type="checkbox" class="checkStyle" id="checkbox_10" />
							</div>
							<div>
								<label id="id_22" class="doctorType" for="checkbox_11">2.破损皮肤被舔</label>
								<input type="checkbox" class="checkStyle" id="checkbox_11" />
							</div>
							<div>
								<label id="id_23" class="doctorType" for="checkbox_12">3.开放性伤口或粘膜被污染</label>
								<input type="checkbox" class="checkStyle" id="checkbox_12" />
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label>III级级</label>
							</div>
						</td>
					</tr>
				</table>

				<table class="tbody">
					<tr>
						<td colspan="5">
							<div style="text-indent: 2em">
								<label id="id_9" style="font-weight: bold;">备注：</label>
							</div>
							<div style="text-indent: 2em">
								<label id="id_10" style="font-weight: bold;">【不良反应】</label>
								<label id="id_10">狂犬病疫苗和狂犬病人免疫球蛋白注射后个别人可产生不同程度的不良反应。如：注射部位疼痛、红肿、硬结和淋巴结肿大等局部反应，以及发热、头疼、全身肌肉酸痛、荨麻疹和过敏性休克等全身反应。不良反应症状轻者多数不需特别处理，症状较重者，需及时就医。</label>
							</div>
							<div style="text-indent: 2em">
								<label id="id_10" style="font-weight: bold;">【注意事项】</label>
								<label>接种狂犬病疫苗期间应避免过量饮酒、剧烈运动等强刺激活动，以及避免使用免疫抑制剂类药物。注射狂犬病人免疫球蛋白后三个月内不能接种麻疹等活病毒疫苗。狂犬病疫苗和狂犬病人免疫球蛋白注射后请留观30分钟。</label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="5">
							<div style="text-align: center;">
								<label style="font-weight: bold;">狂犬病疫苗接种卡</label>
								<label>（请按照规定的时间接种疫苗）</label>
							</div>
							<div>
								<label style="font-weight: bold;">接种程序</label>
								<label>(勾选)：</label>
								<input type="checkbox" class="checkStyle" id="checkbox_25" />
								<label id="id_23" class="doctorType" for="checkbox_25">2-1-1</label>&nbsp;&nbsp;&nbsp;
								<input type="checkbox" class="checkStyle" id="checkbox_26" />
								<label id="id_23" class="doctorType" for="checkbox_26">5针法</label>&nbsp;&nbsp;&nbsp;
								<input type="checkbox" class="checkStyle" id="checkbox_27" />
								<label id="id_23" class="doctorType" for="checkbox_27">加强</label>&nbsp;&nbsp;&nbsp;
								<input type="checkbox" class="checkStyle" id="checkbox_28" />
								<label id="id_23" class="doctorType" for="checkbox_28">暴露前免疫</label>&nbsp;&nbsp;&nbsp;
							</div>
						</td>
					</tr>
				</table>

				<table border="1" id="table">
					<tr>
						<th width="15%" id="tr_1_1">针次</th>
						<th width="15%" id="tr_2_1">一</th>
						<th width="15%" id="tr_3_1">二</th>
						<th width="15%" id="tr_4_1">三</th>
						<th width="15%" id="tr_5_1">四</th>
						<th width="15%" id="tr_6_1">五</th>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>程序接种日期</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>实际接种</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>疫苗名称</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>生产企业</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>疫苗批号</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>接种人员签名</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<input id="value_14" class="inputA" type="text">
							</div>
						</td>
					</tr>
				</table>

				<table class="tbody">
					<tr>
						<td colspan="5">
							<div style="text-indent: 0em">
								<label id="id_9" style="font-weight: bold;">◆ 以上内容已经详细告知，意见为患者（或监护人）真实意愿。</label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<label id="id_30">患者（或监护人）签字：</label>
							<input id="value_14" type="text" class="input_txt inputA" />
						</td>
						<td colspan="4" align="right">
							<label id="id_31">联系电话：</label>
							<input id="value_15" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<label id="id_30">医师签字：</label>
							<input id="value_14" type="text" class="input_txt inputA" />
							<span class="spanRelative" id="dzqm"></span>
						</td>
					</tr>
					<tr>
						<td colspan="4">
							<label id="id_30">接种单位：浙江医院三墩院区</label>
						</td>
						<td colspan="4" align="right">
							<label id="id_31">日期：</label>
							<input id="value_15" class="Wdate spcWdate inputA" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						</td>
					</tr>

				</table>
				<table border="1" id="table" style="text-align: center;">
					<tr style="text-align: center;">
						<th width="80%" id="tr_1_1" style="text-align: center;">本知情同意书一式两份(患者和接种单位各持1份)，请妥善保管2年，就诊时请携带。</th>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#id_title2').html('犬伤门诊知情同意书')
		})
	</script>
</div>