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
				</table>

				<table border="1" id="table">
					<tr>
						<th width="30%" ><label id="id_1">患者姓名:</label><input type="text" class="cstNam input_txt" style="width: 100px;" /></th>
						<th width="15%" ><label id="id_2">性别:</label><input type="text" class="cstSexCod input_txt" style="width: 40px;" /></th>
						<th width="15%" ><label id="id_3">年龄:</label><input type="text" class="age input_txt" style="width: 40px;" /></th>
						<th width="20%" colspan="2">医保性质:<input type="text" class="input_txt" style="width: 100px;" /></th>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>联系电话</label>
							</div>
						</td>
						<td colspan="4">
							<div style="text-align: center;">
								<input placeholder="[联系电话]" type="text" style="width: 97%;">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>家庭住址</label>
							</div>
						</td>
						<td colspan="4">
							<div style="text-align: center;">
								<input placeholder="[家庭住址]" type="text" style="width: 97%;">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>社会保障号（身份证号）</label>
							</div>
						</td>
						<td colspan="4">
							<div style="text-align: center;">
								<input placeholder="[身份证号]" type="text" style="width: 97%;">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>超量配药原因</label>
							</div>
						</td>
						<td colspan="4">
							<div style="text-align: center;">
								<input value="新型冠状病毒疫情期间超量配药" type="text" style="width: 97%;">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>疾病诊断（本栏由处方医生填写）</label>
							</div>
						</td>
						<td colspan="4">
							<div style="text-align: center;">
								<input class="jbzdDes" type="text" style="width: 97%;">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>申请医生姓名</label>
							</div>
						</td>
						<td colspan="2">
							<div style="text-align: center;">
								<input placeholder="[申请医生]" type="text" style="width: 94%;">
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center">
								<label>工号</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center">
								<input placeholder="[申请医生工号]" type="text" style="width: 88%;">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>超量开药的用药时段<br/>（本栏由处方医生填写）</label>
							</div>
						</td>
						<td colspan="4">
							<div>
								上次用药余量<input class="input_txt" type="text" style="width: 15%;">天
							</div>
							<div>
								本次用药时段：<input class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
								至<input class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="1">
							<div style="text-align: center">
								<label>超量开药医嘱<br/>（本栏由处方医生填写）</label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>药品名称</label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>规格</label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>服用剂量</label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>数量</label>
							</div>
						</td>
					</tr>
					<tr>
						<td rowspan="10">
							<div style="text-align: center">
								<label>&nbsp;</label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>1、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>2、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>3、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>4、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>5、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>6、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>7、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>8、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>9、<input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label>10、<input class="input_txt" type="text" style="width: 74%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
						<td colspan="1" style="width: 16%">
							<div style="text-align: center">
								<label><input class="input_txt" type="text" style="width: 80%;"></label>
							</div>
						</td>
					</tr>
					<tr height="40px">
						<td colspan="1" >
							<div style="text-align: center">
								<label>医保办<br/>审核意见</label>
							</div>
						</td>
						<td colspan="4" >
							<div style="text-indent: 2em">
								<textarea id="areaVal" class="fullAreaA printHide"></textarea>
								<span id="spanVal" class="pageHide"></span>
							</div>
							<div align="right" style="margin-top: 10px">
								<label><input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">（章）</label>
							</div>
						</td>
						
					</tr>
				</table>
			</div>
		</div>
	</div>
	
<script type="text/javascript">
$(function(){
	$('#signBtn').hide();
	$('#id_title2').html('新型冠状病毒疫情期间超量配药备案申请表')
})
</script>
</div>