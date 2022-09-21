<div id="s3001">
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
						<label id="id_6">如有下列情况，禁止MR检查：</label>
					</td>
				</tr>				
				<tr>
					<td colspan="5">
						<input type="checkbox" class="checkStyle" id="checkbox_1"/>
						<label id="id_7" class="doctorType" for="checkbox_1">安装心脏起搏器患者；</label>
						<input type="checkbox" class="checkStyle" id="checkbox_2"/>
						<label id="id_8" class="doctorType" for="checkbox_2">人工心脏瓣膜植入患者；</label>
						<input type="checkbox" class="checkStyle" id="checkbox_3"/>
						<label id="id_9" class="doctorType" for="checkbox_3">动脉瘤放置支架；</label>
						<input type="checkbox" class="checkStyle" id="checkbox_4"/>
						<label id="id_10" class="doctorType" for="checkbox_4">眼内金属异物；</label>
						<input type="checkbox" class="checkStyle" id="checkbox_5"/>
						<label id="id_11" class="doctorType" for="checkbox_5">幽闭恐怖症患者；</label>
						<input type="checkbox" class="checkStyle" id="checkbox_6"/>
						<label id="id_12" class="doctorType" for="checkbox_6">怀孕3个月以内的妇女；</label>
						<input type="checkbox" class="checkStyle" id="checkbox_7"/>
						<label id="id_13" class="doctorType" for="checkbox_7">严重心功能不全，无法平卧者； </label>
						<input type="checkbox" class="checkStyle" id="checkbox_8"/>
						<label id="id_14" class="doctorType" for="checkbox_8">需要心电监护或生命体征不稳定者；</label>						
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_15" class="labtitle">浙江医院MR检查安全询问表</label>						
					</td>					
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_16">磁共振检查环境是一个强大的磁场，可能使体内和体外的金属物体发热、移位、电子器械失效、甚至产生电流，上述现场可能导致检查过程中患者受到伤害；目前尚不明确磁场对胚胎的影像。为了患者的安全，在检查前请务必确认是否存在下列情况：</label>						
						</div>
					</td>					
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_17" class="labtitle">如有下列物体，请务必告知申请医生，决定是否MRI检查：</label>
					</td>					
				</tr>
			</table>
			<table border="1" style="width: 100%; border:1px solid black;">
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_9"/>
						<label id="id_18" class="doctorType" for="checkbox_9">金属异物(弹片等)</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_10"/>
						<label id="id_19" class="doctorType" for="checkbox_10">助听器</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_11"/>
						<label id="id_20" class="doctorType" for="checkbox_11">金属节育环</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_12"/>
						<label id="id_21" class="doctorType" for="checkbox_12">可脱卸假牙</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_13"/>
						<label id="id_22" class="doctorType" for="checkbox_13">血管或动脉夹</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_14"/>
						<label id="id_23" class="doctorType" for="checkbox_14">金属支架</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_15"/>
						<label id="id_24" class="doctorType" for="checkbox_15">电子耳蜗</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_16"/>
						<label id="id_25" class="doctorType" for="checkbox_16">人工关节</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_17"/>
						<label id="id_26" class="doctorType" for="checkbox_17">金属气管套餐</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_18"/>
						<label id="id_27" class="doctorType" for="checkbox_18">胰岛素泵</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_19"/>
						<label id="id_28" class="doctorType" for="checkbox_19">化疗泵</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_20"/>
						<label id="id_29" class="doctorType" for="checkbox_20">放射性粒子</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_21"/>
						<label id="id_30" class="doctorType" for="checkbox_21">含金属引流管</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_22"/>
						<label id="id_31" class="doctorType" for="checkbox_22">胶囊内镜</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_23"/>
						<label id="id_32" class="doctorType" for="checkbox_23">外科金属钉</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_24"/>
						<label id="id_33" class="doctorType" for="checkbox_24">金属缝线</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_25"/>
						<label id="id_34" class="doctorType" for="checkbox_25">深部脑刺激装置</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_26"/>
						<label id="id_35" class="doctorType" for="checkbox_26">金属内固定</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_27"/>
						<label id="id_36" class="doctorType" for="checkbox_27">下腔静脉滤器</label>
					</td>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_28"/>
						<label id="id_37" class="doctorType" for="checkbox_28">人工肛门</label>
					</td>
				</tr>
				<tr>
					<td>
						<input type="checkbox" class="checkStyle" id="checkbox_29"/>
						<label id="id_38" class="doctorType" for="checkbox_29">其他含金属的物体</label>
					</td>
					<td></td><td></td><td></td>
				</tr>				
			</table>
			 <table class="tbody">
			 	<tr>
				 	<td colspan="5">
						<label id="id_39" class="labtitle">我声明已经阅读并理解以上内容，认真填写了上述《安全询问表》</label>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="left">
						<label id="id_40">受检者姓名：</label>
						<input id="value_6" type="text" class="input_txt inputD"/>		
						<label id="id_41">签署人：</label>
						<input id="value_7" type="text" class="input_txt inputD"/>
						<label id="id_42">与患者关系：</label>
						<input id="value_8" type="text" class="input_txt inputD"/>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="left">
						<label id="id_43">谈话医生：</label>
						<input id="value_9" type="text" class="input_txt inputD"/>		
						<span class="spanRelative" id="dzqm"></span>
						<label id="id_44">日期：</label>
						<input id="value_10" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH'})">				
					</td>
				</tr>
			 </table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('MR检查禁忌症')
	})
</script>
</div>