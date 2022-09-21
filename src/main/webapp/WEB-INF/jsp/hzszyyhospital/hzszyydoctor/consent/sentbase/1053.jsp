<div id="s1053">
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
					    <label id="id_6"  style="font-weight: bold;">疾病介绍和治疗建议：</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_7">医生已告知我患有</label>
						<input id="value_7" type="text" class="input_txt jbzdDes" style="width: 300px;"/>		
						<label id="id_8">，需要在进行血浆置换治疗。</label>
					</div>
					<div style="text-indent: 2em">
					    <label id="id_10">血浆置换是指将全血分离成血浆和细胞成分，然后遗弃患者血浆，用健康人血浆或血浆代用品予以替代。其目的在于从中清除某些疾病的相关致病因子，从而达到治疗目的。这些因子包括自身免疫性疾病的抗体（IgM、IgG等）、沉积于组织的免疫复合物、异型抗原和异常增多的副蛋白，有时还包括一些同蛋白结合的毒素。此外，血浆置换治疗还可能减少了非特异性的炎症介质，并可改善一些疾病的网状内皮系统功能。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_11">目前在神经系统疾病、自身免疫性疾病、肾脏疾病、血液病和肿瘤性疾病、肝脏病、一些代谢性疾病等许多领域中，均可以应用血浆置换作为一线治疗和辅助治疗。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_12">治疗潜在风险和对策：</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_13">医生告知我进行血浆置换有如下可能发生的一些风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人的情况可能有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_14"> 1.我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_15"> 2.我理解该治疗可能发生的风险：</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_16">1)	因输入血浆可能导致感染血源传播性疾病。 </label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_17">2)	治疗过程中因抗凝导致出血或加重原有出血倾向，出现脑出血、消化道出血、穿刺或手术部位出血等。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_18">3)	该项治疗可能影响心血管系统稳定性，导致血压下降，心律失常，加重原有心脏病。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_19">4)	可能会并发感染或原有感染播散。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_20">5)	出现对透析器的过敏反应。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_21">6)	电解质紊乱。 </label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_22">7)	治疗过程中可能出现管路及滤器凝血，造成失血。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_23">8)	肿瘤扩散。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_24">9)	治疗过程中因患者无法耐受而必须中断治疗。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_25"> 3.我理解如果我患有高血压、心脏病、糖尿病、肝功能不全、出凝血功能障碍、肿瘤性疾病及感染等疾病时，以上这些风险可能会加大，或者在治疗过程中或治疗后出现相关的病情加重或心脑血管意外，甚至死亡。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_26">4.我理解治疗中如果我的体位不当或不遵医嘱，可能影响治疗效果。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_27">特殊风险或主要高危因素：</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_28">我理解根据我个人的病情，我可能出现以下特殊并发症或风险：</label><br/>
						<textarea id="value_28" style="width: 800px;height: 120px"></textarea>
					</div>
					<div style="text-indent: 0em">
						<label id="id_29">一旦发生上述风险和意外，医生会采取积极应对措施。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_30">● 我的医生已经告知我将要进行的治疗方式及治疗过程中可能发生的并发症和风险、可能存在的其它处理</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_31">方法并且解答了我关于此次治疗的相关问题。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_32">● 我同意在治疗过程中医生可以根据我的病情对预定的治疗方案做出调整。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_33">● 我理解我的该项治疗有时需要家属帮助下进行。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_34">● 我并未得到治疗百分之百成功的许诺。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_35">● 我授权医师对治疗切除的病变器官、组织或标本进行处置，包括病理学检查、细胞学检查和医疗废物处理等</label><br/>
					</div>
						
					</td>
				</tr>
				
				<tr>
					<td colspan="5" align="left">
						<label id="id_36"> 患者签名：</label>
						<input id="value_36" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_37"> 签名日期：</label>
						<input id="value_37" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_38">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label><br/>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5" align="left">
						<label id="id_39"> 患者授权亲属签名：</label>
						<input id="value_39" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_40"> 与患者关系：</label>
						<input id="value_40" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_41"> 签名日期：</label>
						<input id="value_41" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_42">医生概述：我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label><br/>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="left">
						<label id="id_43">医生签名：</label>
						<input id="value_43" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label id="id_44">签名日期：</label>
						<input id="value_44" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
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
	  	var value7 = document.getElementById("value_7").value;
	  	var value28 = document.getElementById("value_28").value;
	  	var value36 = document.getElementById("value_36").value;
	  	var value39 = document.getElementById("value_39").value;
	  	var value37 = document.getElementById("value_37").value;
	  	var value40 = document.getElementById("value_40").value;
	  	var value41 = document.getElementById("value_41").value;
	  	var value43 = document.getElementById("value_43").value;
	  	var value44 = document.getElementById("value_44").value;
	  	if(value7==null||value7==""){
	  		value7 = "_________";
	  	}
	  	if(value28==null||value28==""){
	  		value28 = "<br/><br/><br/>";
	  	}
	  	if(value36==null||value36==""){
	  		value36 = "_________";
	  	}
	  	if(value39==null||value39==""){
	  		value39 = "_________";
	  	}
	  	if(value37!=null&&value37!=""){
	  		var date = value37.split("/");
	  		value37 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value37 = "____年___月___日";
	  	}
	  	if(value40==null||value40==""){
	  		value40 = "_________";
	  	}
	  	if(value43==null||value43==""){
	  		value43 = "_________";
	  	}
	  	if(value41!=null&&value41!=""){
	  		var date = value41.split("/");
	  		value41 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value41 = "____年___月___日";
	  	}
	  	if(value44!=null&&value44!=""){
	  		var date = value44.split("/");
	  		value44 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value44 = "____年___月___日";
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
		text +=	"<div style=\"text-indent: 2em\">"+lab7+value7+lab8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab21+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab22+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab23+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab24+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab26+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab28+"<br/>"+value28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab30+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab31+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab32+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab33+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab34+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab35+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab36+value36+" "+lab37+value37+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 2em\">"+lab38+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab39+value39+" "+lab40+value40+" "+lab41 + value41 +"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab42+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab43+value43+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab44+value44+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1053 :input').each(function () {
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
	    var texthtml=document.getElementById("s1053").innerHTML;
		texthtml="<div id='s1053'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('血浆置换知情同意书')
	})
</script>
</div>