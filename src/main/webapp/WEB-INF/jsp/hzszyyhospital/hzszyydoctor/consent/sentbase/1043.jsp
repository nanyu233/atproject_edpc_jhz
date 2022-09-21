<div id="s1043">
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
					    <label id="id_6_1" class="labtitle">目前诊断：</label>
						<textarea id="value_6" style="width: 800px;height: 80px" class="jbzdDes"></textarea>
					</div>
					<div style="text-indent: 0em">
						<label id="id_7" style="font-weight: bold;">治疗建议：</label>
						<label id="id_8">根据目前病情需要进行长期大量激素治疗。拟用药物。</label><br/>
						<label id="id_9">静脉或口服使用激素，是目前控制病情的治疗方法，医生告知我使用激素可能发生的一些风险。</label><br/>
					</div>
					<div style="text-indent: 0em">
					    <label id="id_10" style="font-weight: bold;">治疗潜在风险和对策</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_11">1)出现感染的机率和风险可能增加，如：结核、病毒、细菌、霉菌感染。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_12">2)可能出现血糖、血脂异常，如继发糖耐量异常或继发糖尿病。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_13">3)可能出现继发性高血压、水钠潴留、充血性心力衰竭。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_14">4)可能出现肢体脂肪重新分布、向心性肥胖等。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_15">5)可能出现反酸、烧心，严重者可能出现消化道溃疡、消化道出血。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_16">6)可能出现骨质疏松、股骨头坏死等。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_17">7)可能出现继发性精神改变（兴奋、烦躁、失眠、抑郁、淡漠、幻觉、妄想等）。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_18">8)可能有较小的机率出现青光眼、视乳头水肿或白内障加重等眼部情况。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_19">9)可能有较小的机率出现过敏反应、激素耐药、治疗效果不理想。</label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_20">10)如果患者年龄较大，患有高血压、心脏病、糖尿病、肝肾功能不全、精神神经系统疾病或既往有结核、肝炎等慢性感染性疾病，以上这些风险可能会加大，或者在治疗中或治疗后出现相关的病情加重或心脑血管意外，甚至死亡。  </label><br/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_21">我理解治疗中或治疗后不遵医嘱，可能影响治疗效果。 </label><br/>
					</div>
						
					<div style="text-indent: 2em">
						<label id="id_22">除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提前请患者及家属特别注意的其他事项，如 </label><br/>
						<!-- <textarea id="value_22" style="width: 800px;height: 120px"></textarea> -->
					</div>
					<div style="text-indent: 2em">
						<label id="id_23">我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，一旦发生上述风险和意外，医生会采取积极应对措施。医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。 </label><br/>
					</div>
					<div style="text-indent: 0em">
					    <label id="id_24" style="font-weight: bold;">医疗替代方案</label><br/>
					</div>
					<div style="text-indent: 2em">
					    <label id="id_25" >如不行大剂量激素治疗，还可以选择的治疗方案有：其他短期激素治疗，使用免疫抑制剂，使用抗生素等，但根据目前病情，首选治疗方案为长期大量激素治疗。</label><br/>
					</div>
					<div style="text-indent: 0em">
					    <label id="id_26" style="font-weight: bold;">患者知情选择</label><br/>
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
						<label id="id_31">患者签名：</label>
						<input id="value_31" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_32">与患者关系：</label>
						<input id="value_32" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="2" align="right">
						<label id="id_33">签名日期：</label>
						<input id="value_33" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">				
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
					    	<label id="id_34" style="font-weight: bold;">医生陈述</label><br/>
					    	<label id="id_35">我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。</label><br/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="3"  align="left">
						<label id="id_36">医生签名：</label>
						<input id="value_36" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label id="id_37">签名日期：</label>
						<input id="value_37" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab6 = document.getElementById("id_6_1").innerText;
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
	  	var value31 = document.getElementById("value_31").value;
	  	var value32 = document.getElementById("value_32").value;
	  	var value33 = document.getElementById("value_33").value;
	  	var value36 = document.getElementById("value_36").value;
	  	var value37 = document.getElementById("value_37").value;
	  	/* var value22 = document.getElementById("value_22").value; */
	  	/* if(value22==null||value22==""){
	  		value22 = "<br/><br/><br/>";
	  	} */
	  	if(value31==null||value31==""){
	  		value31 = "_________";
	  	}
	  	if(value32==null||value32==""){
	  		value32 = "_________";
	  	}
	  	if(value33!=null&&value33!=""){
	  		var dates=value33.split(" ");
			 var date = dates[0].split("/");
			 value33 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value33 = "____年___月___日";
	  	}
	  	if(value36==null||value36==""){
	  		value36 = "_________";
	  	}
	  	if(value37!=null&&value37!=""){
	  		var dates=value37.split(" ");
			 var date = dates[0].split("/");
			 value37 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value37 = "____年___月___日";
	  	}
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab6+value6+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab7+"</strong>"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab10+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div>";
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
		text +=	"<div style=\"text-indent: 2em\">"+lab22+"<br/>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab23+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab24+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab26+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab30+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab31+value31+" "+lab32+value32+"</td><td align='right'>"+lab33+value33+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab34+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab35+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab36+value36+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab37+value37+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1043 :input').each(function () {
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
	    var texthtml=document.getElementById("s1043").innerHTML;
		texthtml="<div id='s1043'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('长期大量激素治疗知情同意书')
	})
</script>
</div>