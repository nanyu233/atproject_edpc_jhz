<div id="s1056">
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
					<td colspan="2">
						<div>
							<label>麻醉方式：<input type="text" class="input_txt" style="width: 180px;"></label>
						</div>
					</td>
					<td colspan="3">
						<div>
							<label>手术方式：<input type="text" class="input_txt" style="width: 180px;"></label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div>
							<label>术者：<input type="text" class="input_txt" style="width: 180px;"></label>
						</div>
					</td>
					<td colspan="3">
						<div>
							<label>手术日期：<input type="text" class="input_txt" style="width: 180px;"></label>
						</div>
					</td>
				</tr>
				
			<table border="1" cellspacing="" cellpadding="" id="table" class="tbody">
				<tr>
					<th width="33%" id="tr_1_1" style="font-weight: bold;">麻醉实施前</th>
					<th width="33%" id="tr_1_1" style="font-weight: bold;">手术开始前</th>
					<th width="34%" id="tr_1_1" style="font-weight: bold;">患者离开手术室前</th>
				</tr>
				<tr>
					<td height="27px">
						<input type="text" class="cstNam input_txt" style="width:60px"/>
						<input type="text" class="mpi input_txt"/>
						<input type="text" class="cstSexCod input_txt" style="width:15px"/>
						<input type="text" class="age input_txt"/>
					</td>
					<td height="27px">
						<input type="text" class="cstNam input_txt" style="width:60px"/>
						<input type="text" class="mpi input_txt"/>
						<input type="text" class="cstSexCod input_txt" style="width:15px"/>
						<input type="text" class="age input_txt"/>
					</td>
					<td height="27px">
						<input type="text" class="cstNam input_txt" style="width:60px"/>
						<input type="text" class="mpi input_txt"/>
						<input type="text" class="cstSexCod input_txt" style="width:15px"/>
						<input type="text" class="age input_txt"/>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 28%;float: left;">
							&nbsp;
						</label>
						<label style="width: 40%;float: left;">
							&nbsp;
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>				
					</td>
					<td>
						<label style="width: 28%;float: left;">
							&nbsp;
						</label>
						<label style="width: 40%;float: left;">
							&nbsp;
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td>
							<label style="width: 28%;float: left;">
								&nbsp;
							</label>
							<label style="width: 40%;float: left;">
								&nbsp;
							</label>
							<label style="width: 15%;float: left;" class="doctorType">
								<input id="tr_1_2" type="checkbox"/>是
							</label>
							<label style="width: 15%;float: left;" class="doctorType">
								<input id="tr_1_2" type="checkbox"/>否
							</label>	
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							手术方式确认：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>				
					</td>
					<td>
						<label style="width: 68%;float: left;">
							手术方式确认：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td>
						<label style="width: 68%;float: left;">
							实际手术方式确认：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							手术部位与标识正确：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td>
						<label style="width: 68%;float: left;">
							手术部位与标识正确：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td>
						<label style="width: 68%;float: left;">
							手术用药、输血的核查：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							手术知情同意：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td>
						<label style="width: 68%;float: left;">
							手术、麻醉风险预警：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td>
						<label style="width: 98%;float: left;">
							术中失血量：<input type="text" class="input_txt" style="width: 100px">ml
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							麻醉知情同意：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td rowspan="5">
						<label style="width: 98%;float: left;">
							手术医师陈述：
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>预计手术时间
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>预计失血量
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>手术关注点
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>其他<input id="tr_1_2" type="text" class="input_txt inputA"/>
						</label>
					</td>
					<td>
						<label style="width: 68%;float: left;">
							手术用物清点正确：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							麻醉方式确认：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					
					<td>
						<label style="width: 68%;float: left;">
							手术标本无误：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							麻醉设备安全检查完成：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					
					<td>
						<label style="width: 68%;float: left;">
							皮肤是否完整：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							皮肤是否完整：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td rowspan="8">
						<label style="width: 98%;float: left;">
							各种管道：
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>中心静脉通路
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>动脉通路
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>气管插管
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>伤口引流
						</label>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>胃管
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>尿管
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>腰大池引流管
						</label>
						
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							术野皮肤准备正确：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							静脉通道建立完成：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					<td rowspan="3">
						<label style="width: 98%;float: left;">
							麻醉医师陈述：
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>麻醉关注点
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>其他<input id="tr_1_2" type="text" class="input_txt inputA"/>
						</label>
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							患者是否有过敏史：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					
					
				</tr>
				<tr>
					<td height="27px" rowspan="2">
						<label style="width: 68%;float: left;">
							抗菌药物皮试结果：
						</label><br/>
						<label style="width: 98%;float: left;">
							<input id="tr_1_2" type="text" class="input_txt"/>
						</label>
					</td>
					
					
				</tr>
				<tr>
					<td rowspan="5">
						<label style="width: 98%;float: left;">
							手术护士陈述：
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>物品灭菌合格
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>仪器设备
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>术前术中特殊用药情况
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>其他<input id="tr_1_2" type="text" class="input_txt inputA"/>
						</label>
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							术前备血：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>有
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>无
						</label>	
					</td>
					
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							假体：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>有
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>无
						</label>	
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							体内植入物： 
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>有
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>无
						</label>	
					</td>
					
					<td>
						<label style="width: 98%;float: left;">
							其他<input id="tr_1_2" type="text" class="input_txt inputC"/>
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px" rowspan="2">
						<label style="width: 98%;float: left;">
							术中所需内植入物是否已配备：
						</label><br/>
						<label style="width: 33%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>有
						</label>
						<label style="width: 33%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>无
						</label>
						<label style="width: 33%;float: left;"  class="doctorType">
							<input id="tr_1_2" type="checkbox"/>不适用
						</label>
					</td>
					
					<td rowspan="5">
						<label style="width: 38%;float: left;">
							患者去向：
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>恢复室
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>病房
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>ICU病房
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>急诊
						</label><br/>
						<label style="width: 38%;float: left;">
							&nbsp;
						</label>
						<label style="width: 58%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>离院
						</label>
					</td>
				</tr>
				<tr>
					<td>
						<label style="width: 68%;float: left;">
							预防性抗生素使用：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 68%;float: left;">
							相关影像学资料：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>有
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>无
						</label>	
					</td>
					<td>
						<label style="width: 68%;float: left;">
							是否需要相关影像资料：
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>是
						</label>
						<label style="width: 15%;float: left;" class="doctorType">
							<input id="tr_1_2" type="checkbox"/>否
						</label>	
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 98%;float: left;">
							&nbsp;
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							&nbsp;
						</label>
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 98%;float: left;">
							&nbsp;
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							&nbsp;
						</label>
					</td>
					
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 98%;float: left;">
							其他<input id="tr_1_2" type="text" class="input_txt inputC"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							其他<input id="tr_1_2" type="text" class="input_txt inputC"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							其他<input id="tr_1_2" type="text" class="input_txt inputC"/>
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 98%;float: left;">
							手术医师签名：<input id="tr_1_2" type="text" class="input_txt inputD"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							手术医师签名：<input id="tr_1_2" type="text" class="input_txt inputD"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							手术医师签名：<input id="tr_1_2" type="text" class="input_txt inputD"/>
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 98%;float: left;">
							麻醉医师签名：<input id="tr_1_2" type="text" class="input_txt inputD"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							麻醉医师签名：<input id="tr_1_2" type="text" class="input_txt inputD"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							麻醉医师签名：<input id="tr_1_2" type="text" class="input_txt inputD"/>
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label style="width: 98%;float: left;">
							手术室护士签名：<input id="tr_1_2" type="text" class="input_txt inputA"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							手术室护士签名：<input id="tr_1_2" type="text" class="input_txt inputA"/>
						</label>
					</td>
					<td>
						<label style="width: 98%;float: left;">
							手术室护士签名：<input id="tr_1_2" type="text" class="input_txt inputA"/>
						</label>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<label id="id_12">时间：</label>
						<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
					<td>
						<label id="id_12">时间：</label>
						<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
					<td>
						<label id="id_12">时间：</label>
						<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function(){
		$('#signBtn').hide();
		$('#id_title2').html('手术安全核查表')
	})
	</script>
</div>