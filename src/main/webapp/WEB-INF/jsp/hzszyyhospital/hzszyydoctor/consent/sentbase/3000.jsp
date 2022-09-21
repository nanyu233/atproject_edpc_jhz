<div id="s3000">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicZqty.jsp"></jsp:include>
	<div class="messages m_t10">
		<div>
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
					<div>
						<label>一、根据《浙江省医疗服务价格手册》暂行说明，第六项第三条规定，医疗机构在使用可吸收缝线、“除外内容”中列明的特殊缝线、置入性材料以及单价在200元以上的材料时，应事先征得患者或家属同意。</label>
						<br/>
						<label>二、根据《浙江省基本医疗保险医疗服务项目目录》（2005年版）规定项目分为“甲类”和“乙类”，“甲类”项目按基本医疗保险规定支付，“乙类”先由参保人员个人自理一定比例后，再按本医疗保险规定支付。部分高价医用材料，先由个人自理一定比例后，按基本医疗保险规定支付并实行限额支付。因此，参保病人在我院诊治提供丙类诊疗服务项目时应事先征得患者或家属同意。</label>
						<br/>
						<label>三、患者[</label>
						<input type="text" class="input_txt inputA cstNam"/>
						<label id="id_8_1">]在浙江医院</label>
						<input id="value_7" type="text" class="input_txt inputB emgFkCod"/>
						<label id="id_8_2">科室治疗期间需使用200元以上材料或丙类诊疗项目，现告知如下：</label>
					</div>
					</td>
				</tr>
			</table>
			<table border="1" id="table" class="tbody">
				<tr>
					<th width="25%" id="tr_1_1" >200元以上材料或丙类诊疗项</th>
					<th width="13%" id="tr_2_1">规格</th>
					<th width="13%" id="tr_3_1">单位</th>
					<th width="13%" id="tr_4_1">数量</th>
					<th width="13%" id="tr_5_1">单价</th>
					<th width="20%" id="tr_6_1">备注</th>
				</tr>
				<tr>
					<td>
						<input id="tr_1_2" type="text" class="input_table inputC"/>
					</td>
					<td>
						<input id="tr_2_2" type="text" class="input_table inputA"/>
					</td>
					<td>
						<input id="tr_3_2" type="text" class="input_table inputB"/>
					</td>
					<td>
						<input id="tr_4_2" type="text" class="input_table inputA"/>
					</td>
					<td>
						<input id="tr_5_2" type="text" class="input_table inputA"/>
					</td>
					<td>
						<input id="tr_6_2" type="text" class="input_table inputF"/>
					</td>
				</tr>
			</table>
			<div class="printHide tbody operate-img">
            	<img src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" onclick="add()" />
                <img src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="del()" />
            </div>
            <table class="tbody">
				<tr>
					<td colspan="5">
						<label id="id_9">病人（家属）同意签名：</label>
						<input id="value_8" type="text" class="input_txt inputA"/>						
					</td>
					<td colspan="5" align="right">
						<label id="id_10">日期：</label>
						<input id="value_9" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
				<tr>
					<td colspan="5">					    
						<label id="id_11">医师签名：</label>
						<input id="value_10" type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
						<label id="id_12">日期：</label>
						<input id="value_11" class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	function del(){
		var t1=document.getElementById("table");
		var rows=t1.rows.length;
		if(rows<=2){
			alert("表格无法删除最后一行");
			return false;
		}
		document.getElementById("table").deleteRow(table.rows.length-1);	
	}
	function add(){
	    var t1=document.getElementById("table");
	    var rows=t1.rows.length+1;
	    var tr=t1.insertRow();
	    tr.id="teble_"+rows;
	    var td1=tr.insertCell();
		var td2=tr.insertCell();
		var td3=tr.insertCell();
		var td4=tr.insertCell();
		var td5=tr.insertCell();
		var td6=tr.insertCell();
		td1.innerHTML='<input id="'+"tr"+'_1_'+rows+'" type="text"  class="input_table inputC"/>';  
		td2.innerHTML='<input id="'+"tr"+'_2_'+rows+'" type="text"  class="input_table inputA"/>';
		td3.innerHTML='<input id="'+"tr"+'_3_'+rows+'" type="text"  class="input_table inputB"/>';  
		td4.innerHTML='<input id="'+"tr"+'_4_'+rows+'" type="text"  class="input_table inputA"/>';
		td5.innerHTML='<input id="'+"tr"+'_5_'+rows+'" type="text"  class="input_table inputA"/>';
		td6.innerHTML='<input id="'+"tr"+'_6_'+rows+'" type="text"  class="input_table inputF"/>';  
	}
	
	$(function(){
		$('#id_title2').html('200元以上材料或丙类诊疗项目使用知情同意书')
	})
</script>
</div>