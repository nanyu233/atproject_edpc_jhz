<div id="s3006">
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
						<label>本人承诺：</label><br/>
						<label>1. 否认发病前14天吉林市、北京市东城区、西城区、海淀区、朝阳区、丰台区、石景山区、大兴区、房山区以及境外，或其他有病例报告社区的旅行史或居住史;</label><br/>
						<label>2. 否认发病前14天内与新型冠状病毒感染者(核酸检测阳性者)有接触史;</label><br/>
						<label>3. 否认发病前14天内曾接触过来自吉林市、北京市东城区、西城区、海淀区、朝阳区、丰台区、石景山区、大兴区、房山区以及周边地区,或其他重点地区，或来自有病例报告社区的发热或有呼吸道症状的患者;</label><br/>
						<label>4. 否认聚集性发病(2周内在小范围如家庭、办公室、学校班级等场所,出现2例及以上发热和/或呼吸道症状的病例)</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>患者姓名：</label>
						<input id="value_6" type="text" class="cstNam input_txt"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>性别:</label>
						<input id="value_7" type="text" class="cstSexCod input_txt"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>年龄:</label>
						<input id="value_8" type="text" class="age input_txt"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>电话:</label>
						<input type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>现住址:</label>
						<input type="text" class="input_txt inputC"/>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label>承诺人：</label>
						<input type="text" class="input_txt inputA"/>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label>日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>

<script type="text/javascript">
	$(function(){
		$('#signBtn').hide();
		$('#id_title2').html('承诺书')
	})
	</script>
</div>