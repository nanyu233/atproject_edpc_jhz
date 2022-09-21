<div id="s3011">
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
						<label id="id_6_1" class="labtitle">患者经临床和影像学检查，诊断：</label>
						<input type="text" class="inputE input_txt jbzdDes"/>
						<label id="id_6_2" class="labtitle">目前需要进行 </label>
						</br>
						<input type="checkbox" class="checkStyle" id="checkbox_13"/>
						<label id="id_24" class="doctorType" for="checkbox_13">常规支气管镜</label>
						<input type="checkbox" class="checkStyle" id="checkbox_14"/>
						<label id="id_24" class="doctorType" for="checkbox_14">无痛支气管镜检查</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7" >但在行支气管镜检查时可能出现以下并发症和意外情况，但不仅仅限于：</label><br/>
						<label id="id_8">1、麻醉反应及药物过敏，严重者导致休克、心跳呼吸骤停</label>
						<label id="id_8">2、喉头水肿、喉痉挛、诱发哮喘发作、气管及支气管痉挛导致低氧血症、窒息；</label>
						<label id="id_8">3、术中及术后出血，严重出血会引起窒息导致死亡；</label>
						<label id="id_8">4、周围组织或脏器损伤、气胸；</label>
						<label id="id_8">5、心脑血管意外，包括心律失常、心跳骤停、中风；</label>
						<label id="id_8">6、返流或误吸导致死亡；</label>
						<label id="id_8">7、术后可能出现原发感染灶扩散，并发新的感染及发热等；</label>
						<label id="id_8">8、检查失败或检查结果阴性；  </label>
						<label id="id_8">9、其他难以预料的并发症与意外，如牙齿脱落等。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_9" style="font-weight: bold;">针对以上情况将采取的防范措施</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_10">根据现代医疗规范，密切观察病情，采取及时、有效、科学的防范措施，力争将风险降低至最低程度，最大程度地保护患者安全，使检查过程顺利。如术中有变化将及时与家属联系，积极组织实施抢救和处置，请患者和家属配合，并理解</label>
							<br/>
							<label id="id_10" style="font-weight: bold;">医疗替代方案：</label>
							<input type="checkbox" class="checkStyle" id="checkbox_99"/>
							<label id="id_24" class="doctorType" for="checkbox_99">EBUS-TBNA</label>
							<input type="checkbox" class="checkStyle" id="checkbox_98"/>
							<label id="id_24" class="doctorType" for="checkbox_98">肺穿刺</label>
							<input type="checkbox" class="checkStyle" id="checkbox_15"/>
							<label id="id_26" class="doctorType" for="checkbox_15">其它</label>
							<input id="valueadd3" type="text" class="input_txt inputA"/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label style="font-weight: bold;" id="id_11">您的签字表示：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13">
						1、您已阅读并理解、同意前面所述的内容；
						</label><br/>
						<label id="id_13_1">
						2、您授权并同意医生为您进行支气管镜检查，并同意在检查过程中医生可以根据我的病情对预定的诊疗方式做出调整，并未得到百分之百成功的承诺。
						</label><br/>
						<label id="id_13_2">
						3、我授权内镜医生在诊断过程取下的相关组织进行必要的医学处理和科学研究，包括病理学检查、细胞学检查和医疗废物处理等；表明您同意学习者在检查过程中进行观摩；也同意拍摄不注明您身份的照片（有可能将其发表）作为医疗和教学之用
						</label><br/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_30">操作医生：</label>
						<input id="value_14" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="3"  align="right">
						<label id="id_31">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_30">患者签字：</label>
						<input id="value_14" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="3"  align="right">
						<label id="id_31">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>(</label>
						<input type="checkbox" class="checkStyle" id="checkbox_33">
						<label id="id_80" class="doctorType" for="checkbox_33">患者本人</label>
						<input type="checkbox" class="checkStyle" id="checkbox_34">
						<label id="id_81" class="doctorType" for="checkbox_34">配偶</label>
						<input type="checkbox" class="checkStyle" id="checkbox_35">
						<label id="id_82" class="doctorType" for="checkbox_35">子女</label>
						<input type="checkbox" class="checkStyle" id="checkbox_36">
						<label id="id_83" class="doctorType" for="checkbox_36">父母</label>
						<input type="checkbox" class="checkStyle" id="checkbox_38">
						<label id="id_85" class="doctorType" for="checkbox_38">其他</label>
						<input id="valueadd3" type="text" class="input_txt"/>
						<label>)</label>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('气管镜检查知情同意书')
	})
</script>
</div>