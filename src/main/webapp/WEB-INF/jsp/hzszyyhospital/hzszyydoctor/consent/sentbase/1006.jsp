<div id="s1006">
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
						<label id="id_30" class="labtitle">目前诊断：</label>
						<textarea id="value_6" style="width: 800px;height: 100px" class="jbzdDes"></textarea>	
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6" class="labtitle">治疗建议：</label>
						<label id="id_7">医生已告知我根据目前病情，需要在</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_8">麻醉下进行</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_9">术。</label>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_10">
								腹水指过多的游离液体在腹腔内积聚。腹水可由肝脏病、心脏病、肾脏病、结核病、恶性肿瘤等疾病引起。各种原因导致的肝硬化及原发性肝癌是引起腹水的主要疾病。腹水形成时常有腹胀、腹部膨隆、双下肢水肿、尿量减少等表现。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_11">腹腔穿刺术的目的是：腹腔穿刺术的目的是：明确腹腔积液的性质，协助诊断；适量的抽出腹水，以减轻病人腹腔内的压力，缓解腹胀、胸闷、气急，呼吸困难等症状，减少静脉回流阻力，改善血液循环；向腹膜腔内注入药物。
							医生告知我如下腹腔穿刺术可能发生的风险，有些不常见的风险可能没有在此列出，医生告诉我可与我的医生讨论有关我手术的具体内容，如果我有特殊的问题可与我的医生讨论。</label>					
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_15" class="labtitle">治疗潜在风险和对策</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_16_1">
						1. 我理解任何操作麻醉都存在风险，包括局麻药过敏、药物毒性反应；
						</label><br/>
						<label id="id_16_2">
						2. 我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。
						</label><br/>
						<label id="id_16_3">
						3. 我理解此手术可能发生的风险和医生的对策：
						</label><br/>
						<label id="id_16_4">
						1)局部感染或败血症：局部穿刺点发生红、肿、热、痛，或全身感染如发热、寒战等；
						</label><br/>
						<label id="id_16_5">
						2)穿刺部位局部血肿；
						</label><br/>
						<label id="id_16_6">
						3)心血管症状：穿刺期间可发生高血压、脑血管意外、心律失常、心包填塞、心跳呼吸骤停等；
						</label><br/>
						<label id="id_16_7">
						4)穿刺及留置管失败；
						</label><br/>
						<label id="id_16_8">
						5)术中、术后出血、渗液、渗血，损伤周围神经、动脉、静脉，致出血、血肿形成，可能需要行二次手术；
						</label><br/>
						<label id="id_16_9">
						6)留置管折叠、折断、遗留、堵塞、滑脱等；
						</label><br/>
						<label id="id_16_10">
						7)穿刺损伤肠管，穿透肠管致感染性腹膜炎；
						</label><br/>
						<label id="id_16_11">
						8)穿刺损伤腹腔其他脏器，如膀胱、肝脏等；
						</label><br/>
						<label id="id_16_12">
						9)腹腔留置管处窦道形成、腹膜粘连；
						</label><br/>
						<label id="id_16_13">
						10)穿刺放液后可致血压下降或休克。
						</label><br/>
						<label id="id_16_14">
						11)术后胃肠道出血，应激性溃疡，严重者死亡；
						</label><br/>
						<label id="id_16_15">
						12)术中大出血，导致失血性休克，严重者死亡；
						</label><br/>
						<label id="id_16_16">
						13)如果卧床时间较长可能导致肺部感染，泌尿系统感染，褥疮，深静脉血栓及肺栓塞、脑栓塞等；
						</label><br/>
						<label id="id_16_17">
						14)其它目前无法预计的风险和并发症。
						</label>
						<div style="text-indent: 2em">
							<label id="id_16_18">
							我理解如果我患有高血压、心脏病、糖尿病、肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至死亡。
							</label>
						</div>
						<label id="id_16_19">4.除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提前请患者及家属特别注意的其他事项，如</label>
						<input id="value_9" type="text" class="input_txt" style="width: 200px;"/>
						<div style="text-indent: 2em">
							<label id="id_16_20">
							一旦发生上述风险和意外，医生会采取积极应对措施。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_16_21">
							我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。
							</label>
						</div>
					</td>
				</tr>	
				<tr>
					<td colspan="5">
						<label id="id_17" class="labtitle">医疗替代方案</label><br/>
						<label id="id_18">如不行腹腔穿刺术，还可以选择的治疗方案有：保守利尿治疗，诊断性治疗等，但根据目前病情，首选治疗方案为腹腔穿刺术。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_19_1" class="labtitle">
						患者知情选择
						</label><br/>
						<label id="id_19_2">
						1.我的医生已经告知我将要进行的诊治方式、此次诊治及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次诊治的相关问题。
						</label><br/>
						<label id="id_19_3">
						2.我同意在诊治中医生可以根据我的病情预定的诊治方式做出调整。
						</label><br/>
						<label id="id_19_4">
						3.我理解我的诊治可能需要多位医生共同进行。
						</label><br/>
						<label id="id_19_5">
						4.我并未得到诊治百分之百成功的许诺。
						</label>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_23">患者签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_24">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_25">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_26" class="labtitle">医生陈述</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_27">
						我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。
						</label>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_28">医生签名：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
						<label id="id_29">签名日期：</label>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab7 = document.getElementById("id_7").innerText;
		var lab8 = document.getElementById("id_8").innerText;
		var lab9 = document.getElementById("id_9").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16_1 = document.getElementById("id_16_1").innerText;
		var lab16_2 = document.getElementById("id_16_2").innerText;
		var lab16_3 = document.getElementById("id_16_3").innerText;
		var lab16_4 = document.getElementById("id_16_4").innerText;
		var lab16_5 = document.getElementById("id_16_5").innerText;
		var lab16_6 = document.getElementById("id_16_6").innerText;
		var lab16_7 = document.getElementById("id_16_7").innerText;
		var lab16_8 = document.getElementById("id_16_8").innerText;
		var lab16_9 = document.getElementById("id_16_9").innerText;
		var lab16_10 = document.getElementById("id_16_10").innerText;
		var lab16_11 = document.getElementById("id_16_11").innerText;
		var lab16_12 = document.getElementById("id_16_12").innerText;
		var lab16_13 = document.getElementById("id_16_13").innerText;
		var lab16_14 = document.getElementById("id_16_14").innerText;
		var lab16_15 = document.getElementById("id_16_15").innerText;
		var lab16_16 = document.getElementById("id_16_16").innerText;
		var lab16_17 = document.getElementById("id_16_17").innerText;
		var lab16_18 = document.getElementById("id_16_18").innerText;
		var lab16_19 = document.getElementById("id_16_19").innerText;
		var lab16_20 = document.getElementById("id_16_20").innerText;
		var lab16_21 = document.getElementById("id_16_21").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19_1 = document.getElementById("id_19_1").innerText;
		var lab19_2 = document.getElementById("id_19_2").innerText;
		var lab19_3 = document.getElementById("id_19_3").innerText;
		var lab19_4 = document.getElementById("id_19_4").innerText;
		var lab19_5 = document.getElementById("id_19_5").innerText;
		var lab23 = document.getElementById("id_23").innerText;
		var lab24 = document.getElementById("id_24").innerText;
		var lab25 = document.getElementById("id_25").innerText;
		var lab26 = document.getElementById("id_26").innerText;
		var lab27 = document.getElementById("id_27").innerText;
		var lab28 = document.getElementById("id_28").innerText;
		var lab29 = document.getElementById("id_29").innerText;
		var lab30 = document.getElementById("id_30").innerText;
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
	  		value7 = "____________";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "____________";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "____________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "___________";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
	  		value11 = "___________";
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
		if(value14!=null&&value14!=""){
	  		var date = value14.split("/");
	  		value14 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value14 = "___________";
	  	}
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
		text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +="<div style=\"text-indent: 0em\"><strong>"+lab30+"</strong><strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong>"+lab7+"<strong>"+value7+"</strong>"+lab8+"<strong>"+value8+"</strong>"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";	
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab15+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_11+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_15+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_17+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16_18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_19+"<strong>"+value9+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16_20+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16_21+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab17+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab19_1+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_5+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab23+value10+" "+lab24+value11+" "+lab25+value12+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab26+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab28+value13+"&nbsp&nbsp"+dzqm+" "+lab29+value14+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1006 :input').each(function () {
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
	    var texthtml=document.getElementById("s1006").innerHTML;
		texthtml="<div id='s1006'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('腹腔穿刺术知情同意书')
	})
</script>
</div>