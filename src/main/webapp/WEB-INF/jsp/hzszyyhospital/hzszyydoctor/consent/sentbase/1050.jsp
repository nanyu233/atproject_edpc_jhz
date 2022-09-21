<div id="s1050">
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
						<label id="id_6" class="labtitle">疾病介绍和治疗建议：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7">医生已告知我患有</label>
						<input id="value_6" type="text" class="input_txt jbzdDes" style="width: 300px;"/>
						<label id="id_8">，需要进行连续性肾脏替代治疗。</label>
						<div style="text-indent: 2em">
							<label id="id_9">连续性肾脏替代治疗（continuous renal replacement therapy, CRRT）是通过连续、缓慢清除水分和溶质以替代受损肾脏功能的一种血液净化疗法。目前该治疗手段已在急慢性肾衰竭的重症患者和各种临床上常见危重病例的救治过程中广泛应用。应用连续性肾脏替代治疗的目的在于：</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10_1">（1）清除毒素，纠正水、电解质及酸碱平衡紊乱；</label><br/>
						<label id="id_10_2">（2）为进一步的治疗创造条件。</label><br/>
						<div style="text-indent: 2em">
							<label id="id_10_3">与普通血液净化疗法相比，连续性肾脏替代治疗的突出优点体现如下：</label>
						</div>
						<label id="id_10_4">（1）稳定性好：对全身血流动力学影响小，可清除大量液体而保持最小的血流动力学变化；</label><br/>
						<label id="id_10_5">（2）连续性：一日24小时中能连续恒定地维持、调节水、电解质酸碱平衡，模拟生理肾的滤过，为临床进行高能营养治疗提供可能性；</label><br/>
						<label id="id_10_6">（3）弥散和对流可同时进行，尿毒症的中、小分子量毒素同时得到清除，而血渗透压变化小；</label><br/>
						<label id="id_10_7">（4）方便：可在危重患者床边进行。</label><br/>
						<label id="id_10_8">目前在连续性肾脏替代治疗过程中，我们多采用CVVH（连续性静脉-静脉血液滤过）或CVVHDF（连续性静脉-静脉血液透析滤过）的方式，即采用中心静脉留置双腔导管作为血管通路进行治疗，其优点在于对血流动力学影响更小，而且方便操作。</label><br/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">治疗潜在风险和对策：</label>
						<div style="text-indent: 2em">
							<label id="id_12">医生告知我如下连续性肾脏替代治疗可能发生的一些风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人的情况有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_13">1.我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_14">2.我理解此治疗手段可能出现的风险和医生：</label>
						</div>
						<div style="margin-left: 2em">
							<label id="id_15_1">1)治疗过程中因抗凝导致出血或加重原有出血倾向，发生脑出血、消化道出血、穿刺或手术部位出血等；</label><br/>
							<label id="id_15_2">2)该项治疗可能影响心血管系统稳定性，导致血压下降，心律失常，加重原有心脏病；</label><br/>
							<label id="id_15_3">3)可能会并发感染或原有感染播散；</label><br/>
							<label id="id_15_4">4)我可能会出现对透析器的过敏反应；</label><br/>
							<label id="id_15_5">5)个别患者会出现肌肉痉挛，头痛，严重者癫痫发作；</label><br/>
							<label id="id_15_6">6)治疗过程中可能出现管路及滤器凝血，造成失血；</label><br/>
							<label id="id_15_7">7)可能导致肿瘤播散；</label><br/>
							<label id="id_15_8">8)治疗过程中可能因患者无法耐受而必须中断治疗；</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">	
						<div style="margin-left: 2em">
							<label id="id_16">3.我理解如果我患有高血压、心脏病、糖尿病、肝功能不全、血液系统疾病、出凝血功能障碍、肿瘤性疾病及感染等疾病时，以上这些风险可能会加大，或者在治疗中或治疗后出现相关的病情加重或心脑血管意外，甚至死亡。</label><br/>
							<label id="id_17">特殊风险或主要高危因素：</label><br/>
							<label id="id_18">我理解根据我个人的病情，我可能出现未包括在上述所交待并发症以外的风险：</label>
							<textarea id="value_7" style="width: 800px;height: 80px"></textarea>
							<label id="id_19">一旦发生上述风险和意外，医生会采取积极应对措施。</label>
						</div>			
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_20_1">
						患者知情选择：
						</label>
						<div style="margin-left: 2em">
							<label id="id_20_2">
							● 我的医生已经告知我将要进行的治疗方式及治疗过程中可能发生的并发症和风险、可能存在的其它处理方法并且解答了我关于此次治疗的相关问题。
							</label><br/>
							<label id="id_20_3">
							● 我同意在治疗过程中医生可以根据我的病情对预定的治疗方案做出调整。
							</label><br/>
							<label id="id_20_4">
							● 我理解我的该项治疗有时需要家属帮助下进行。
							</label><br/>
							<label id="id_20_5">
							● 我并未得到治疗百分之百成功的许诺。
							</label><br/>
							<label id="id_20_6">
							● 我授权医师对治疗切除的病变器官、组织或标本进行处置，包括病理学检查、细胞学检查和医疗废物处理等
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_21">患者签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_22">签名日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_23">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_24">患者授权亲属签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_25">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_26">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_27">医生陈述：我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_28">医师签名：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
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
		var lab10_1 = document.getElementById("id_10_1").innerText;
		var lab10_2 = document.getElementById("id_10_2").innerText;
		var lab10_3 = document.getElementById("id_10_3").innerText;
		var lab10_4 = document.getElementById("id_10_4").innerText;
		var lab10_5 = document.getElementById("id_10_5").innerText;
		var lab10_6 = document.getElementById("id_10_6").innerText;
		var lab10_7 = document.getElementById("id_10_7").innerText;
		var lab10_8 = document.getElementById("id_10_8").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15_1 = document.getElementById("id_15_1").innerText;
		var lab15_2 = document.getElementById("id_15_2").innerText;
		var lab15_3 = document.getElementById("id_15_3").innerText;
		var lab15_4 = document.getElementById("id_15_4").innerText;
		var lab15_5 = document.getElementById("id_15_5").innerText;
		var lab15_6 = document.getElementById("id_15_6").innerText;
		var lab15_7 = document.getElementById("id_15_7").innerText;
		var lab15_8 = document.getElementById("id_15_8").innerText;	
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19 = document.getElementById("id_19").innerText;
		var lab20_1 = document.getElementById("id_20_1").innerText;
		var lab20_2 = document.getElementById("id_20_2").innerText;
		var lab20_3 = document.getElementById("id_20_3").innerText;
		var lab20_4 = document.getElementById("id_20_4").innerText;
		var lab20_5 = document.getElementById("id_20_5").innerText;
		var lab20_6 = document.getElementById("id_20_6").innerText;
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
	  	if(value6==null||value6==""){
	  		value6 = "____________";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "_______";
	  	}
	  	var value9 = document.getElementById("value_9").value;
		if(value9!=null&&value9!=""){
	  		var date = value9.split("/");
	  		value9 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value9 = "___________";
	  	}
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
	  		value13 = "_______";
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
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong></div>";
		text += "<div style=\"text-indent: 0em\">"+lab7+"<strong>"+value6+"</strong>"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_2+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"margin-left: 2em\">"+lab15_1+"<br/>"+lab15_2+"<br/>"+lab15_3+"<br/>"+lab15_4+"<br/>"+lab15_5+"<br/>"+lab15_6+"<br/>"+lab15_7+"<br/>"+lab15_8+"</div>";
		text +=	"<div style=\"margin-left: 2em\">"+lab16+"<br/>"+lab17+"<br/>"+lab18+"<strong>"+value7+"</strong><br/>"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20_1+"</div>";
		text +=	"<div style=\"margin-left: 2em\">"+lab20_2+"<br/>"+lab20_3+"<br/>"+lab20_4+"<br/>"+lab20_5+"<br/>"+lab20_6+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab21+value8+" "+lab22+value9+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab23+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab24+value10+" "+lab25+value11+" "+lab26+value12+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab28+value13+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab29+value14+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1050 :input').each(function () {
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
	    var texthtml=document.getElementById("s1050").innerHTML;
		texthtml="<div id='s1050'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('连续性肾脏替代治疗知情同意书')
	})
</script>
</div>