<div id="s1052">
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
						<label id="id_7">治疗建议：医生已告知我根据目前病情，需要在</label>
						<input id="value_7" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_8">麻醉下进行</label>
						<input id="value_8" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_9">手术（检查）。</label>
					</div>
					<div style="text-indent: 2em">
					    <label id="id_10">心包积液是一种较常见的临床表现，大部分心包积液由于量少而不出现临床征象。少数病人则由于大量积液而以心包积液成为突出的临床表现。当心包积液持续数月以上时便构成慢性心包积液。导致慢性心包积液的病因有多种，大多与可累及心包的疾病有关。心包积液分析对心包疾病的诊断与治疗有重要的指导意义。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_11">心包积液可有多种原因造成：（一）感染性；（二）全身性疾病；（三）肿瘤；（四）药物诱发；（五）外伤；（六）病因不明；（七）自家免疫性心包炎等。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_12">心包穿刺的目的在于：抽出积液，缓解症状；对积液进行各种理化检查，明确病因，指导进一步治疗。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_13">治疗潜在风险和对策</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_14">1.穿刺相关并发症：穿刺伤口局部血肿、大出血、血管破裂，心包填塞，假性动脉瘤，动静脉瘘等，严重者可有出血性休克，生命危险；甚至需手术治疗。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_15">2.造影剂所致过敏反应及毒性反应：术中所用药物可能造成皮肤过敏、呼吸困难、过敏性休克、溶血反应等；重者可能有生命危险。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_16">3.导丝、导管打结、折断不能取出或器械原因造成的意外情况，可能手术治疗。 </label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_17">4.由于导管刺激可能产生严重心律失常，室速、室颤，危及生命，需要电除颤等抢救措施。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_18">5.解剖结构异常及其他原因造成的手术不成功，可能需中转手术或再次手术治疗。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_19">6.围手术期各种感染；X线相关损害。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_20">7.其他意外情况。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_21">8.除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提前请患者及家属特别注意的其他事项，如   </label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_22">一旦发生上述风险和意外，医生会采取积极应对措施。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_23">我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_24">医疗替代方案</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_25">如不行心包穿刺术，还可以选择的治疗方案有：开胸心包穿刺术，强心利尿治疗等，但根据目前病情，首选治疗方案为心包穿刺术。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_26">患者知情选择</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_27">1.我的医生已经告知我将要进行的诊治方式、此次诊治及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次诊治的相关问题。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_28">2.我同意在诊治中医生可以根据我的病情预定的诊治方式做出调整。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_29">3.我理解我的诊治可能需要多位医生共同进行。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_30">4.我并未得到诊治百分之百成功的许诺。</label><br/>
					</div>
						
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="left">
						<label id="id_31"> 患者签名：</label>
						<input id="value_31" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_32"> 与患者关系：</label>
						<input id="value_32" type="text" class="input_txt" style="width: 120px;"/>		
					</td>
					<td colspan="2" align="right">
						<label id="id_33"> 签名日期：</label>
						<input id="value_33" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_34">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label><br/>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="left">
						<label id="id_35"> 患者签名：</label>
						<input id="value_35" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_36"> 与患者关系：</label>
						<input id="value_36" type="text" class="input_txt" style="width: 120px;"/>		
					</td>
					<td colspan="2" align="right">
						<label id="id_37"> 签名日期：</label>
						<input id="value_37" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_38">医生陈述</label><br/>
						</div>
						<div style="text-indent: 0em">
							<label id="id_39">我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label><br/>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="left">					    
						<label id="id_40">医师签名：</label>
						<input id="value_40" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label id="id_41">签名日期：</label>
						<input id="value_41" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
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
	  	var value8 = document.getElementById("value_8").value;
	  	var value31 = document.getElementById("value_31").value;
	  	var value32 = document.getElementById("value_32").value;
	  	var value33 = document.getElementById("value_33").value;
	  	var value36 = document.getElementById("value_36").value;
	  	var value35 = document.getElementById("value_35").value;
	  	var value37 = document.getElementById("value_37").value;
	  	var value40 = document.getElementById("value_40").value;
	  	var value41 = document.getElementById("value_41").value;
	  	if(value7==null||value7==""){
	  		value7 = "_________";
	  	}
	  	if(value8==null||value8==""){
	  		value8 = "_________";
	  	}
	  	if(value31==null||value31==""){
	  		value31 = "_________";
	  	}
	  	if(value32==null||value32==""){
	  		value32 = "_________";
	  	}
	  	if(value33!=null&&value33!=""){
	  		var dates=value33.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value33 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value33 = "____年___月___日___时___分";
	  	}
	  	if(value35==null||value35==""){
	  		value35 = "_________";
	  	}
	  	if(value36==null||value36==""){
	  		value36 = "_________";
	  	}
	  	if(value37!=null&&value37!=""){
	  		var dates=value37.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value37 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value37 = "____年___月___日___时___分";
	  	}
	  	if(value40==null||value40==""){
	  		value40 = "_________";
	  	}
	  	if(value41!=null&&value41!=""){
	  		var dates=value41.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value41 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value41 = "____年___月___日___时___分";
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
		text +=	"<div style=\"text-indent: 0em\">"+lab7+value7+lab8+value8+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab21+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab22+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab23+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab24+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab26+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab30+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab31+value31+" "+lab32+value32+"</td><td align='right'>"+lab33+value33+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab34+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab35+value35+" "+lab36+value36+"</td><td align='right'>"+lab37+value37+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab38+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab39+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab40+value40+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab41+value41+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1052 :input').each(function () {
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
	    var texthtml=document.getElementById("s1052").innerHTML;
		texthtml="<div id='s1052'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('心包穿刺知情同意书')
	})
</script>
</div>