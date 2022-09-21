<div id="s1015">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">取栓知情同意书</label></div>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr>
					<td style="width: 19%">
						<label id="id_1">姓名:</label>
						<input id="value_1" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td style="width: 18%">
						<label id="id_2">性别:</label>
						<input id="value_2" type="text" class="input_txt" style="width: 90px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_3">科别:</label>
						<input id="value_3" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">床号:</label>
						<input id="value_4" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">留观号:</label>
						<input id="value_5" type="text" class="input_txt" style="width: 96px;"/>
					</td>
				</tr>
				<tr>
				   
					<td colspan="5">
					 <div style="text-indent: 2em">
						<label id="id_6" >这是一份关于</label>
						<input id="value_6" type="text" class="input_txt" style="width: 200px;"/>
						<label id="id_15">的知情同意书，医生会用通俗易懂的方式告知该治疗相关事宜。</label>
					 </div>
					</td>
					
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7" class="labtitle">1. 目前诊断（Current Diagnosis）：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 150px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8" class="labtitle">2. 诊断操作目的（Purposes）：</label>
						<input type="checkbox" checked="checked" class="checkStyle1" id="checkbox_1"><label id="id_73" class="doctorType" for="checkbox_1" style="color: blue;">明确病因，完善诊断；</label>
						&nbsp;
						<input type="checkbox" checked="checked" class="checkStyle1" id="checkbox_2"><label id="id_74" class="doctorType" for="checkbox_2" style="color: blue;">明确治疗方案，判断预后；</label>
						&nbsp;
						<input type="checkbox" checked="checked" class="checkStyle1" id="checkbox_3"><label id="id_75" class="doctorType" for="checkbox_3" style="color: blue;">对症治疗，缓解病情；</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_4"><label id="id_76" class="doctorType" for="checkbox_4" style="color: blue;">其他</label>
					</td>
					
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_9" class="labtitle">3. 主要意外、风险及并发症（Major Accidents,Risk Factors and  Compliactions）：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
					<div style="text-indent: 2em">
						<label id="id_10">
						术中的可能意外和风险：1.造影为检查手段，若确认大动脉血栓，需要进行颅内动脉取栓术；若血管痉挛或其他原因导致导管手术失败，但仍需承担相应费用。
						2.造影剂过敏或损伤，导致休克、视力障碍、静脉炎、多脏器功能衰竭等。
						3.术前、术中动脉瘤破裂可能，血管穿孔或血管壁撕裂，造成脑出血或发生休克、死亡。
						4.血管痉挛，动脉夹层、血管内斑块脱落、空气栓塞，导致脑缺血、脑栓或者脑梗死，致瘫痪、失语、昏迷、癫痫、死亡等。
						5.脑出血，脑梗症状不改善，脑疝，肺梗死，甚至生命危险，死亡。
						6.导管、导丝操作致心律失常、心跳骤停或导管折断、导丝扭结，可能需手术取出或终身带管，同时需终生服用抗凝药物。
						7.术中遇到其他难以预料的情况（包括心肌梗等），造成生命危险。
						</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_11">
						术后可能发生的并发症和意外：
						1.术后穿刺部位血肿，假性动脉瘤或动静脉瘤形成，穿刺测下肢血管痉挛、现摘、血栓形成导致下肢缺血，可能需要进一步处理货手术治疗
						2.感染，伤口周围皮肤过敏、破损3.术前无法预见的危及生命的情况。
						4.手术并发症的治疗与检查等费用由患者负担。5.造影结果阴性
						</label><br/>
					</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_12" class="labtitle">4. 防范措施（Precaution）：</label>
						<br/>
						<label id="id_13">
						1）严格按照诊疗操作规范执行；
						</label><br/>
						<label id="id_13_1">
					    2）加强监测，仔细操作，及时处理；
						</label><br/>
						<label id="id_13_2">
						3）其他:<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						</label><br/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_14" class="labtitle">可替代的方案（Alternatives）：</label>
					    <input type="radio" name="Alternatives" class="checkStyle1" id="checkbox_5" 
					        onclick="document.getElementById('value_22').style.display='';">
					    <label id="id_77" class="doctorType" for="checkbox_5" style="color: blue;">有；</label>
					    <input id="value_22" type="text" class="input_txt" style="width: 150px;display:none;"/>
						&nbsp;
						&nbsp;
						<input type="radio" name="Alternatives" class="checkStyle1" id="checkbox_6" 
						    onclick="document.getElementById('value_22').style.display='none';">
						<label id="id_78" class="doctorType" for="checkbox_6" style="color: blue;">不确定；</label>
						&nbsp;
						&nbsp;
						<input type="radio" name="Alternatives" class="checkStyle1" id="checkbox_7" 
						    onclick="document.getElementById('value_22').style.display='none';">
						<label id="id_79" class="doctorType" for="checkbox_7" style="color: blue;">无；</label>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_29">医护人员签名：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_30">签名日期：</label>
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_23">医师已经告知该诊疗操作的必要性和相关事项，我已充分理解并选择</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_24">治疗。</label>
					</td>
				</tr>
				
				
				<tr align="left">
					<td colspan="5">
						<label id="id_21">患者签名或代理人：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_22">签名日期：</label>
						<input id="value_13" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
			<tr>
			<table cellpadding='0' cellspacing='0' style="width: 100%; border:1px solid black;margin-top:8px;padding:0px;list-style:none;">
			  <tr><td colspan=3 style=" text-align:center;" ><a id="id_31">手术安全核查表（手术室外）</a></td></tr>
			  <tr><td style="width: 40%;border-top:1px solid black;">
			          <li><a id="id_32">[</a></a><input id="value_14" type="text" class="input_txt" style="width: 10px;"/> <a id="id_37">]同意填写完整正确</a></li>
			          <li><a id="id_33">[</a></a><input id="value_15" type="text" class="input_txt" style="width: 10px;"/> <a id="id_38">]患者身份正确</a></li>
			          <li><a id="id_34">[</a></a><input id="value_16" type="text" class="input_txt" style="width: 10px;"/> <a id="id_39">]手术方式正确</a></li>
			          <li><a id="id_35">[</a></a><input id="value_17" type="text" class="input_txt" style="width: 10px;"/> <a id="id_40">]手术部位正确  </a></li>
			          <li><a id="id_36">[</a></a><input id="value_18" type="text" class="input_txt" style="width: 10px;"/> <a id="id_41">]设备/仪器正常</a></li>
			      </td>
			      <td style="width: 15%;border-top:1px solid black;">
			          <li><a id="id_42">①是②否 </a></li>
			          <li><a id="id_43">①是②否 </a></li>
			          <li><a id="id_44">①是②否 </a></li>
			          <li><a id="id_45">①是②否 </a></li>
			          <li><a id="id_46">①是②否</a></li>
			      </td>
			  
			      <td style="width: 45%;border-top:1px solid black;border-left:1px solid black;">
			          <li><a id="id_47">手术医生： </a><input id="value_19" type="text" class="input_txt" style="width: 100px;"/></li>
			          <li><a id="id_48">护士:</a> <input id="value_20" type="text" class="input_txt" style="width: 100px;"/></li>
			          <li><a id="id_49">麻醉医师（如有）:</a><input id="value_21" type="text" class="input_txt" style="width: 100px;"/></li>
			          <li><a>&nbsp;</a></li>
			          <li><a>&nbsp;</a></li>
			      </td> 
			      </tr>
			</table>
			</tr>	
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	function getText(){
		var lab_t1 = document.getElementById("id_title1").innerText;
		var lab_t2 = document.getElementById("id_title2").innerText;
		var lab1 = document.getElementById("id_1").innerText;
		var lab2 = document.getElementById("id_2").innerText;
		var lab3 = document.getElementById("id_3").innerText;
		var lab4 = document.getElementById("id_4").innerText;
		var lab5 = document.getElementById("id_5").innerText;
		var lab6 = document.getElementById("id_6").innerText;
		var lab7 = document.getElementById("id_7").innerText;
		var lab8 = document.getElementById("id_8").innerText;
		var lab9 = document.getElementById("id_9").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab13_1 = document.getElementById("id_13_1").innerText;
		var lab13_2 = document.getElementById("id_13_2").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab21 = document.getElementById("id_21").innerText;
		var lab22 = document.getElementById("id_22").innerText;
		var lab23 = document.getElementById("id_23").innerText;
		var lab24 = document.getElementById("id_24").innerText;
		var lab29 = document.getElementById("id_29").innerText;
		var lab30 = document.getElementById("id_30").innerText;
		var lab73 = document.getElementById("id_73").innerText;
		var lab74 = document.getElementById("id_74").innerText;
		var lab75 = document.getElementById("id_75").innerText;
		var lab76 = document.getElementById("id_76").innerText;
		var lab77 = document.getElementById("id_77").innerText;
		var lab78 = document.getElementById("id_78").innerText;
		var lab79 = document.getElementById("id_79").innerText;
		
		var lab31 = document.getElementById("id_31").innerText;
		var lab32 = document.getElementById("id_32").innerText;
		var lab33 = document.getElementById("id_33").innerText;
		var lab34 = document.getElementById("id_34").innerText;
		var lab35 = document.getElementById("id_35").innerText;
		var lab36 = document.getElementById("id_36").innerText;
		var lab37 = document.getElementById("id_37").innerText;
		var lab38 = document.getElementById("id_38").innerText;
		var lab39 = document.getElementById("id_39").innerText;
		var lab40 = document.getElementById("id_40").innerText;
		var lab41 = document.getElementById("id_41").innerText;
		var lab42 = document.getElementById("id_42").innerText;
		var lab43 = document.getElementById("id_43").innerText;
		var lab44 = document.getElementById("id_44").innerText;
		var lab45 = document.getElementById("id_45").innerText;
		var lab46 = document.getElementById("id_46").innerText;
		var lab47 = document.getElementById("id_47").innerText;
		var lab48 = document.getElementById("id_48").innerText;
		var lab49 = document.getElementById("id_49").innerText;
		
		
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	var checkbox_3 = document.getElementById("checkbox_3").checked;
	  	var checkbox_4 = document.getElementById("checkbox_4").checked;
	  	var checkbox_5 = document.getElementById("checkbox_5").checked;
	  	var checkbox_6 = document.getElementById("checkbox_6").checked;
	  	var checkbox_7 = document.getElementById("checkbox_7").checked;

	
		var value1 = document.getElementById("value_1").value;	
		if(value1==null||value1==""){
	  		value1 = "_______";
	  	}
	  	var value2 = document.getElementById("value_2").value;
	  	if(value2==null||value2==""){
	  		value2 = "_____";
	  	}
	  	var value3 = document.getElementById("value_3").value;
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = document.getElementById("value_4").value;
	  	if(value4==null||value4==""){
	  		value4 = "_____";
	  	}
	  	var value5 = document.getElementById("value_5").value;
	  	if(value5==null||value5==""){
	  		value5 = "_______";
	  	}
	  	var value6 = document.getElementById("value_6").value;
	  	if(value6==null||value6==""){
	  		value6 = "____________";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "____________";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value19 = document.getElementById("value_19").value;
	  	var value20 = document.getElementById("value_20").value;
	  	var value21 = document.getElementById("value_21").value;
	  	var value22 = document.getElementById("value_22").value;
	  	if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	if(value10!=null&&value10!=""){
	  		var date = value10.split("/");
	  		value10 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value10 = "___________";
	  	}
	  	if(value12==null||value12==""){
	  		value12 = "___________";
	  	}
	  	if(value13!=null&&value13!=""){
	  		var date = value13.split("/");
	  		value13 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value13 = "___________";
	  	}
	  	if(value14==null||value14==""){
	  		value14 = "__";
	  	}
	  	if(value15==null||value15==""){
	  		value15 = "__";
	  	}
	  	if(value16==null||value16==""){
	  		value16 = "__";
	  	}
	  	if(value17==null||value17==""){
	  		value17 = "__";
	  	}
	  	if(value18==null||value18==""){
	  		value18 = "__";
	  	}
	  	if(value19==null||value19==""){
	  		value19 = "___________";
	  	}
	  	if(value20==null||value20==""){
	  		value20 = "___________";
	  	}
	  	if(value21==null||value21==""){
	  		value21 = "___________";
	  	}
	  	
	  	var lab_str = "";
	  	if(checkbox_1){
	  		lab_str += "<strong>"+lab73+"</strong>";
	  	}
	  	if(checkbox_2){
	  		lab_str += "<strong>"+lab74+"</strong>";
	  	}
	  	if(checkbox_3){
	  		lab_str += "<strong>"+lab75+"</strong>";
	  	}
	  	if(checkbox_4){
	  		lab_str += "<strong>"+lab76+"</strong>";
	  	}
	  	function Trims(str)
	  	{
	  	    return str.replace(/(^\s*)|(\s*$)/g, "");
	  	}
	  	 
	  	var v22 = Trims(document.getElementById("value_22").value);
	  	var lab_str1 = "";
	  	if(checkbox_5){
		  	lab_str1 = "<strong>"+lab77+"</strong>";
		  	if(v22!=""&&v22!=null){
		  		lab_str1 = "<strong>"+value22+"</strong>；";
		  	}
	  	}
	  	if(checkbox_6){
	  		value22 = "___________";
	  		lab_str1 = "<strong>"+lab78+"</strong>";
	  	}
	  	if(checkbox_7){
	  		value22 = "___________";
	  		lab_str1 = "<strong>"+lab79+"</strong>";
	  	}
	  	lab_str=replceLastDH(lab_str);
		lab_str1=replceLastDH(lab_str1);
	  	
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"<strong>"+value6+"</strong>"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+value7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab8+"</strong>"+lab_str+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab9+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_2+"<strong>"+value8+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab14+"</strong>"+lab_str1+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab29+value9+" "+lab30+value10+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab23+"<strong>"+value11+"</strong>"+lab24+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab21+value12+" "+lab22+value13+"</td></tr></table>";
		text +=	"<table cellpadding='0' cellspacing='0' style=\"width: 100%; border:1px solid black;margin-top:8px;padding:0px;list-style:none;\"><tr><td colspan=3 style=\" text-align:center;\">"+lab31+"</td></tr>";
		text +=	"<tr><td style=\"width: 40%;border-top:1px solid black;\"><li>"+lab32+value14+lab37+"</li>";
		text +=	"<li>"+lab33+value15+lab38+"</li>";
		text +=	"<li>"+lab34+value16+lab39+"</li>";
		text +=	"<li>"+lab35+value17+lab40+"</li>";
		text +=	"<li>"+lab36+value18+lab41+"</li></td>";
		text +=	"<td style=\"width: 15%;border-top:1px solid black;\">";
		text +=	"<li>"+lab42+"</li>";
		text +=	"<li>"+lab43+"</li>";
		text +=	"<li>"+lab44+"</li>";
		text +=	"<li>"+lab45+"</li>";
		text +=	"<li>"+lab46+"</li></td>";
		text +=	"<td style=\"width: 45%;border-top:1px solid black;border-left:1px solid black;\">";
		text +=	"<li>"+lab47+value19+"</li>";
		text +=	"<li>"+lab48+value20+"</li>";
		text +=	"<li>"+lab49+value21+"</li>";
		text +=	"<li>&nbsp</li>";
		text +=	"<li>&nbsp</li></td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1015 :input').each(function () {
	        ///////////获取容器innerHTML要想包含输入的值，需要设置过value属性。其他对象重置selected、checked属性
	        switch (this.type) {
	            case 'text': this.setAttribute('value', this.value); break;
	            case 'checkbox':
	            case 'radio':
	                if(this.checked)this.setAttribute('checked', 'checked');
	                else this.removeAttribute('checked');
	                break;
	            case 'select-one':
	            case 'select-multiple':
	                $(this).find('option').each(function () {
	                    if(this.selected)this.setAttribute('selected', 'selected');
	                    else this.removeAttribute('selected');
	                });
	                break;
	            case 'textarea': this.innerHTML = this.value; break;
	        }
	    });
	    var texthtml=document.getElementById("s1015").innerHTML;
		texthtml="<div id='s1015'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	
	function init1(){
		var refseqno=$("#refseqno").val();
		$.ajax({
	   	     url: "${baseurl}zyyconsent/findHspemginfCustombyAjax.do?",
	   	     type: "post",
           data: {
           	"emgSeq":refseqno
           },
           success:function(data){
        	   $("#value_1").val(data.resultInfo.sysdata.hspemginfCustom.cstNam);
        	   $("#value_2").val(data.resultInfo.sysdata.hspemginfCustom.cstSexCod);
        	   $("#value_3").val(data.resultInfo.sysdata.hspemginfCustom.emgFkCod);
        	   $("#value_4").val(data.resultInfo.sysdata.hspemginfCustom.emgBed);
        	   $("#value_5").val(data.resultInfo.sysdata.hspemginfCustom.observationCode);
        	   $("#value_6").val("全脑血管造影(备颅内动脉取栓术)");
        	   $("#value_7").val("脑梗死");
           }
       })
	}
</script>
</div>