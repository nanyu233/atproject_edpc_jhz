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
							<div style="text-indent: 0em">
								<label id="id_6_1">尊敬的患者、患者家属或患者的法定监护人、授权委托人：</label>
							</div>
							<div style="text-indent: 2em">
								<label id="id_6_1">根据有关规定，下列药品/材料不属于或者部分不属于公费医疗、大病统筹和社会基本医疗保险报销范围，此种药品/材料的费用须由患者个人承担。患者可以选择是否使用此种自费药品/材料。</label>
							</div>
						</td>
					</tr>
				</table>
				<table border="1" id="table">
					<tr>
						<th width="15%" id="tr_1_1">序号</th>
						<th width="70%" id="tr_2_1">自费药品/医用耗材</th>
						<th width="25%px" id="tr_3_1">价格</th>
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>1</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG"/></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA"/></label>
							</div>
						</td>
						
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>2</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG"/></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA" /></label>
							</div>
						</td>
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>3</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG" /></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA"/></label>
							</div>
						</td>
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>4</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG"/></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA"/></label>
							</div>
						</td>
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>5</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG" /></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA" /></label>
							</div>
						</td>
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>6</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG"/></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA"/></label>
							</div>
						</td>
					</tr>
					<tr>
						<td height="30px" rowspan="1">
							<div style="text-align: center;">
								<label>7</label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputG"/></label>
							</div>
						</td>
						<td rowspan="1">
							<div style="text-align: center;">
								<label><input type="text" class="input_txt inputA"/></label>
							</div>
						</td>
					</tr>
				</table>
				
				<table class="tbody">
					<tr>
						<td colspan="5">
							<div style="text-indent: 0em">
								<label id="id_9">患者知情选择</label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="5">
							<div style="text-indent: 2em">
								<label id="id_30">我</label>
								<input id="value_14" type="text" class="input_txt inputA"/>
								<label>（同意或不同意）使用，并个人承担此种药品/材料的费用，如不同意使用，我自行承担发生的一切后果。</label>
							</div>
						</td>
					</tr>
					<tr>
						<td colspan="5">
							<label id="id_30">患者授权亲属签名:</label>&nbsp;&nbsp;&nbsp;
							<input id="value_14" type="text" class="input_txt inputA"/>
							<label id="id_30">与患者关系:</label>&nbsp;&nbsp;&nbsp;
							<input id="value_14" type="text" class="input_txt inputA"/>
							<label id="id_30">联系电话:</label>
							<input id="value_14" type="text" class="input_txt inputA"/>
						</td>
					</tr>
					<tr>
						<td colspan="5">
							<label id="id_31">签名日期：</label>
							<input id="value_15" class="Wdate spcWdate inputA" type="text"onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						</td>
					</tr>
					<tr>
						<td colspan="5">
							<label id="id_30">医生签名:</label>&nbsp;&nbsp;&nbsp;
							<input id="value_14" type="text" class="input_txt inputA"/>
							<span class="spanRelative" id="dzqm"></span>
							<label id="id_31">签名日期：</label>
							<input id="value_15" class="Wdate spcWdate inputA" type="text"onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		$(function(){
			$('#id_title2').html('使用自费药品和医用耗材告知同意书')
		})
	</script>
</div>