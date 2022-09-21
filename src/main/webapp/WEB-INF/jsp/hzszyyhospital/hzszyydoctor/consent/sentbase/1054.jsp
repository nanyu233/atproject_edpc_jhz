<div id="s1054">
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
					<div style="text-indent: 0em">
					    <label id="id_6"  style="font-weight: bold;">目前诊断：</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_7" style="font-weight: bold;">治疗建议：</label>
						<label id="id_8">医生已告知我根据目前病情，需要在</label>
						<input id="value_8" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_9">麻醉下进行</label>
						<input id="value_9" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_60">手术。</label>
					</div>
					<div style="text-indent: 2em">
					    <label id="id_10">胸腔穿刺置管术（闭式引流术）是为了穿刺抽取胸腔积液，引流胸腔积液、积气减压，缓解症状，减轻和预防胸膜粘连、增厚；减轻肺不张；术后症状缓解的情况取决于胸腔积液或气胸是否再次出现，对胸腔穿刺所得胸腔积液进行病理细胞学检验，诊断率只有40~70%。对于一些肿瘤原因引起的胸腔积液术后很可能再次出现。气胸行胸腔穿刺后很可能会因为肺持续漏气而症状不能缓解。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_11" style="font-weight: bold;">治疗潜在风险和对策</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_12">1. 我理解任何手术麻醉都存在风险。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_13">2. 我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_14">3. 我理解此手术可能发生的风险和医生的对策：</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_15"> 1)麻醉药过敏，药物毒性反应及其他麻醉意外；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_16">2)术中、术后出血、渗液、渗血，气胸、血气胸、皮下气肿，严重时危及生命； </label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_17">3)损伤肺脏、局部神经或其他组织、器官；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_18">4)局部感染或败血症：局部穿刺点发生红、肿、热、痛，或全身感染如发热、寒战等；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_19">5)穿刺部位局部血肿，皮下气肿，穿刺处局部或胸膜腔感染，必要时需要置管引流；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_20">6)心血管症状：穿刺期间可发生高血压、脑血管意外、心律失常、心包填塞、心跳呼吸骤停等；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_21">7)胸膜反应：心悸、胸部压迫感、头晕、出汗、低血压休克； </label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_22">8)肺水肿；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_23">9)术后胸腔积液或气胸再次出现，必要时需要置管引流；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_24">10)穿刺失败；</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_25">4. 我理解如果我患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至死亡。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_26">5. 我理解术后如果我的体位不当或不遵医嘱，可能影响手术效果。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_27">除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提前请患者及家属特别注意的其他事项，如</label>
						<input id="value_27" type="text" class="input_txt" style="width: 250px;"/>		
					</div>
					<div style="text-indent: 2em">
						<label id="id_28"> 一旦发生上述风险和意外，医生会采取积极应对措施。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_29">我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_30" style="font-weight: bold;">医疗替代方案</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_31">如不行胸腔闭式引流术（穿刺置管术），还可以选择的治疗方案有：手术探查治疗，保守治疗，但根据目前病情，首选治疗方案为胸腔闭式引流术（穿刺置管术）。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_32" style="font-weight: bold;">患者知情选择</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_33">1.我的医生已经告知我将要进行的诊治方式、此次诊治及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次诊治的相关问题。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_34">2.我同意在诊治中医生可以根据我的病情预定的诊治方式做出调整。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_35">3.我理解我的诊治可能需要多位医生共同进行。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_36">4.我并未得到诊治百分之百成功的许诺。</label><br/>
					</div>
						
					</td>
				</tr>
				
				<tr>
					<td colspan="1" align="left">
						<label id="id_37"> 患者签名：</label>
						<input id="value_37" type="text" class="input_txt" style="width: 100px;"/>		
					</td>
					<td colspan="2" align="left">
						<label id="id_38"> 与患者关系：</label>
						<input id="value_38" type="text" class="input_txt" style="width: 100px;"/>		
					</td>
					<td colspan="2" align="right">
						<label id="id_39"> 签名日期：</label>
						<input id="value_39" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_40">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label><br/>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="1" align="left">
						<label id="id_41"> 患者签名：</label>
						<input id="value_41" type="text" class="input_txt" style="width: 100px;"/>		
					</td>
					<td colspan="2" align="left">
						<label id="id_42"> 与患者关系：</label>
						<input id="value_42" type="text" class="input_txt" style="width: 100px;"/>		
					</td>
					<td colspan="2" align="right">
						<label id="id_43"> 签名日期：</label>
						<input id="value_43" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_44" style="font-weight: bold;">医生陈述</label><br/>
						</div>
						<div style="text-indent: 0em">
							<label id="id_45">我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label><br/>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="left">
						<label id="id_46">医生签名：</label>
						<input id="value_46" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label id="id_47">签名日期：</label>
						<input id="value_47" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
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
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
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
		var lab30 = document.getElementById("id_30").innerText;
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
		var lab60 = document.getElementById("id_60").innerText;
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
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value27 = document.getElementById("value_27").value;
	  	var value39 = document.getElementById("value_39").value;
	  	var value37 = document.getElementById("value_37").value;
	  	var value38 = document.getElementById("value_38").value;
	  	var value41 = document.getElementById("value_41").value;
	  	var value42 = document.getElementById("value_42").value;
	  	var value43 = document.getElementById("value_43").value;
	  	var value46 = document.getElementById("value_46").value;
	  	var value47 = document.getElementById("value_47").value;
	  	if(value8==null||value8==""){
	  		value8 = "_________";
	  	}
	  	if(value9==null||value9==""){
	  		value9 = "_________";
	  	}
	  	if(value27==null||value27==""){
	  		value27 = "_____________________________";
	  	}
	  	if(value38==null||value38==""){
	  		value38 = "_________";
	  	}
	  	if(value37==null||value37==""){
	  		value37 = "_________";
	  	}
	  	if(value41==null||value41==""){
	  		value41 = "_________";
	  	}
	  	if(value42==null||value42==""){
	  		value42 = "_________";
	  	}
	  	if(value39!=null&&value39!=""){
	  		var date = value39.split("/");
	  		value39 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value39 = "____年___月___日";
	  	}
	  	if(value43!=null&&value43!=""){
	  		var date = value43.split("/");
	  		value43 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value43 = "____年___月___日";
	  	}
	  	if(value47!=null&&value47!=""){
	  		var date = value47.split("/");
	  		value47 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value47 = "____年___月___日";
	  	}
	  	if(value46==null||value46==""){
	  		value46 = "_________";
	  	}
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong>"+lab8+value8+lab9+value9+lab60+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab11+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab21+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab23+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab24+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab26+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab27+value27+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab30+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab31+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab32+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab33+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab34+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab35+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab36+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab37+value37+" "+lab38+value38+"</td><td align='right'>"+lab39+value39+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab40+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab41+value41+" "+lab42+value42+"</td><td align='right'>"+lab43+value43+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab44+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab45+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab46+value46+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab47+value47+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1054 :input').each(function () {
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
	    var texthtml=document.getElementById("s1054").innerHTML;
		texthtml="<div id='s1054'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('胸腔穿刺置管（闭环引流）术知情同意书')
	})
</script>
</div>