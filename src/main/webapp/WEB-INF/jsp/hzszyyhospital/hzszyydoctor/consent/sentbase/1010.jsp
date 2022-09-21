<div id="s1010">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicZqty.jsp"></jsp:include>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr>
					<td style="width: 25%">
						<label id="id_1">患者姓名:</label>
						<input type="text" class="input_txt cstNam" style="width: 100px;"/>
					</td>
					<td style="width: 15%">
						<label id="id_2">性别:</label>
						<input type="text" class="input_txt cstSexCod" style="width: 40px;"/>
					</td>
					<td style="width: 16%">
						<label id="id_3">年龄:</label>
						<input type="text" class="input_txt age" style="width: 40px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">科室:</label>
						<input type="text" class="input_txt emgFkCod" style="width: 100px;"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">病历号:</label>
						<input type="text" class="input_txt mpi" style="width: 96px;"/>
					</td>
				</tr>	
				<tr>
					<td colspan="5">
						<label id="id_6" class="labtitle">目前诊断：</label>
						<textarea id="value_6" style="width: 800px;height: 80px" class="jbzdDes"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6_1" class="labtitle">治疗建议：</label>
						<label id="id_7">医生已告知我根据治疗需要在</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_8">麻醉下进行</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_9">术。</label>
						<div style="text-indent: 2em">
							<label id="id_10">深静脉置管术是通过颈内静脉、股静脉或锁骨下静脉穿刺、在深静脉腔内留置双腔导管的技术，根据临床治疗的需要，可分为临时性及长期性中心静脉置管两种方式。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_11">可为方便化疗或造血干细胞移植期间的治疗，需要为患者进行深静脉置管。减少频繁穿刺外周静脉的次数，减轻病人痛苦；避免化疗药物外渗引起的并发症；深静脉导管实施化疗和干细胞输注安全有效，保护外周静脉。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_12_1" class="labtitle">
						治疗潜在风险和对策：
						</label><br/>
						<label id="id_12_2">
						1. 我理解任何麻醉都存在风险。
						</label><br/>
						<label id="id_12_3">
						2. 我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。
						</label><br/>
						<label id="id_12_4">
						3. 我理解此操作可能发生的风险和医生的对策：
						</label><br/>
						<div style="margin-left: 2em">
							<label id="id_12_5">
							1)局部感染或败血症：局部穿刺点发生红、肿、热、痛，或全身感染如发热、寒战等；
							</label><br/>
							<label id="id_12_6">
							2)血管损伤：发生出血、假动脉瘤、静脉狭窄、动静脉瘘。局部血肿可压迫气道、胸腔、心脏、气管，引起吞咽异物感，心悸、阵发性刺激性干咳、发热甚至窒息死亡等，必要时需外科手术治疗；
							</label><br/>
							<label id="id_12_7">
							3)穿刺部位局部血肿，皮下气肿；
							</label><br/>
							<label id="id_12_8">
							4)心血管症状：穿刺或拔除导管过程中可发生高血压、脑血管意外、心律失常、心包填塞、心跳呼吸骤停等；
							</label><br/>
							<label id="id_12_9">
							5)周围组织、神经损伤：生意嘶哑、穿刺侧颈部、胸部、上肢部疼痛和乏力、麻木、活动障碍、霍纳氏综合症（穿刺侧瞳孔缩小，脸裂缩小，上眼睑轻度下垂，眼球后陷，同侧面部皮肤血管扩张并无汗）等；
							</label><br/>
							<label id="id_12_10">
							6)空气栓塞：可影响呼吸，导致心血管衰竭、神经系统后遗症、肺栓塞，甚至死亡等；
							</label><br/>
							<label id="id_12_11">
							7)血栓形成：可造成血管栓塞、静脉炎、导管堵塞等；
							</label><br/>
							<label id="id_12_12">
							8)穿刺中或穿刺后可进入胸腔、纵隔、心包、心脏、淋巴管、腋静脉、颈内静脉颅内部分等，出现气胸、血胸、胸腔积液、纵隔积液、心包积液、心脏穿孔、淋巴漏等；
							</label><br/>
							<label id="id_12_13">
							9)穿刺及置管失败；
							</label><br/>
							<label id="id_12_14">
							10)渗液、渗血，出血量大时可出现休克甚至危及生命；
							</label><br/>
							<label id="id_12_15">
							11)导管折叠、折断、遗留、堵塞、滑脱等；
							</label>		
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="margin-left: 2em">
							<label id="id_13">上述并发症发生后有可能需要拔除导管后再次置管，也可以导致本人身体器官严重障碍，甚至留下终身残疾，严重的还可能危及生命。</label><br/>
							<label id="id_14">除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提请患者及家属特别注意的其他事项，如：</label>
							<textarea id="value_9" style="width: 800px;height: 80px"></textarea>
						</div>
						<div style="text-indent: 2em">
							<label id="id_15">我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_16" class="labtitle">医疗替代方案：</label><br/>
						<label id="id_17">如不行深静脉置管术，还可以选择的治疗方案有：PICC术，输液港等，但根据目前病情，首选治疗方案为深静脉置管术。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_18_1" class="labtitle">患者知情选择：</label><br/>
						<label id="id_18_2">1.我的医生已经告知我将要进行的诊治方式、此次诊治及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次诊治的相关问题。</label><br/>
						<label id="id_18_3">2.我同意在诊治中医生可以根据我的病情预定的诊治方式做出调整。</label><br/>
						<label id="id_18_4">3.我理解我的诊治可能需要多位医生共同进行。</label><br/>
						<label id="id_18_5">4.我并未得到诊治百分之百成功的许诺。</label>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_19">患者签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_20">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_21">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_22">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_23">患者签名：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_24">与患者关系：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_25">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_26" class="labtitle">医生陈述：</label><br/>
						<label id="id_27">我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_28">医生签名：</label>
						<input id="value_16" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
						<label id="id_29">签名日期：</label>
						<input id="value_17" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
					</td>
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
		var lab6_1 = document.getElementById("id_6_1").innerText;
		var lab7 = document.getElementById("id_7").innerText;
		var lab8 = document.getElementById("id_8").innerText;
		var lab9 = document.getElementById("id_9").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12_1 = document.getElementById("id_12_1").innerText;
		var lab12_2 = document.getElementById("id_12_2").innerText;
		var lab12_3 = document.getElementById("id_12_3").innerText;
		var lab12_4 = document.getElementById("id_12_4").innerText;
		var lab12_5 = document.getElementById("id_12_5").innerText;
		var lab12_6 = document.getElementById("id_12_6").innerText;
		var lab12_7 = document.getElementById("id_12_7").innerText;
		var lab12_8 = document.getElementById("id_12_8").innerText;
		var lab12_9 = document.getElementById("id_12_9").innerText;
		var lab12_10 = document.getElementById("id_12_10").innerText;
		var lab12_11 = document.getElementById("id_12_11").innerText;
		var lab12_12 = document.getElementById("id_12_12").innerText;
		var lab12_13 = document.getElementById("id_12_13").innerText;
		var lab12_14 = document.getElementById("id_12_14").innerText;
		var lab12_15 = document.getElementById("id_12_15").innerText;		
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18_1 = document.getElementById("id_18_1").innerText;
		var lab18_2 = document.getElementById("id_18_2").innerText;
		var lab18_3 = document.getElementById("id_18_3").innerText;
		var lab18_4 = document.getElementById("id_18_4").innerText;
		var lab18_5 = document.getElementById("id_18_5").innerText;
		var lab19 = document.getElementById("id_19").innerText;
		var lab20 = document.getElementById("id_20").innerText;
		var lab21 = document.getElementById("id_21").innerText;
		var lab22 = document.getElementById("id_22").innerText;
		var lab23 = document.getElementById("id_23").innerText;
		var lab24 = document.getElementById("id_24").innerText;
		var lab25 = document.getElementById("id_25").innerText;
		var lab26 = document.getElementById("id_26").innerText;
		var lab27 = document.getElementById("id_27").innerText;
		var lab28 = document.getElementById("id_28").innerText;
		var lab29 = document.getElementById("id_29").innerText;
		var dzqm = document.getElementById("dzqm").innerHTML;
	
		var value1 = $('.cstNam').val();	
		if(value1==null||value1==""){
	  		value1 = "_______";
	  	}
	  	var value2 = $('.cstSexCod').val();
	  	if(value2==null||value2==""){
	  		value2 = "_____";
	  	}
	  	var value3 = $('.age').val();
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = $('.emgFkCod').val();
	  	if(value4==null||value4==""){
	  		value4 = "_____";
	  	}
	  	var value5 = $('.mpi').val();
	  	if(value5==null||value5==""){
	  		value5 = "_______";
	  	}
	  	var value6 = document.getElementById("value_6").value;
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "_______";
	  	}
		var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "_______";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "_______";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
	  		value11 = "_______";
	  	}
	  	var value12 = document.getElementById("value_12").value;
	  	if(value12!=null&&value12!=""){
	  		var date = value12.split("/");
	  		value12 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value12 = "___________";
	  	}
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13==null||value13==""){
			value13 = "___________";
	  	}
	  	var value14 = document.getElementById("value_14").value;
	  	if(value14==null||value14==""){
			value14 = "___________";
	  	}
	  	var value15 = document.getElementById("value_15").value;
		if(value15!=null&&value15!=""){
	  		var date = value15.split("/");
	  		value15 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value15 = "___________";
	  	}
	  	var value16 = document.getElementById("value_16").value;
	  	if(value16==null||value16==""){
			value16 = "___________";
	  	}
	  	var value17 = document.getElementById("value_17").value;
		if(value17!=null&&value17!=""){
	  		var date = value17.split("/");
	  		value17 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value17 = "___________";
	  	}
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong><strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6_1+"</strong>"+lab7+"<strong>"+value7+"</strong>"+lab8+"<strong>"+value8+"</strong>"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12_1+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_4+"</div>";
		text +=	"<div style=\"margin-left: 2em\">"+lab12_5+"<br/>"+lab12_6+"<br/>"+lab12_7+"<br/>"+lab12_8+"<br/>"+lab12_9+"<br/>"+lab12_10+"<br/>"+lab12_11+"<br/>"+lab12_12+"<br/>"+lab12_13+"<br/>"+lab12_14+"<br/>"+lab12_15+"</div>";
		text +=	"<div style=\"margin-left: 2em\">"+lab13+"<br/>"+lab14+"<strong>"+value9+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab16+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab18_1+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18_5+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab19+value10+" "+lab20+value11+" "+lab21+value12+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab23+value13+" "+lab24+value14+" "+lab25+value15+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab26+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab28+value16+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab29+value17+"</td></tr></table>";
		
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1010 :input').each(function () {
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
	    var texthtml=document.getElementById("s1010").innerHTML;
		texthtml="<div id='s1010'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('深静脉置管术知情同意书')
	})
</script>
</div>