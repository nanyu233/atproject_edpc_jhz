<div id="s1015">
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
						<label id="id_6_1" class="labtitle">目前诊断：</label>
						<textarea class="jbzdDes" style="width: 800px;height: 80px"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6" class="labtitle">治疗建议：</label>
						<label id="id_7" >医生已告知患者有</label>
						<input id="value_7" type="text" class="input_txt" style="width: 200px;"/>
						<label id="id_8">，需要进行气管插管和机械通气。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_9">机械通气的目的：改善呼吸功能，维持生命体征，为解除诱发加重因素争取时间。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_10">医生告知患者气管插管和机械通气可能发生的一些风险，有些不常见的风险可能没有在此列出，具体的操作根据不同病人的情况有所不同，医生已告知患者及家属可与患者的医生讨论有关患者操作的具体内容，如果有特殊的问题可与患者的医生讨论。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label style="font-weight: bold;" id="id_11">治疗潜在风险和对策</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13">
						1.我理解任何麻醉都存在风险。
						</label><br/>
						<label id="id_13_1">
						2.我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。
						</label><br/>
						<label id="id_13_2">
						3.我理解此操作可能发生的风险和医生的对策：
						</label><br/>
						<label id="id_13_3" class="labtitle">
						气管插管：
						</label><br/>
						<label id="id_13_4">
						1）刺激迷走神经引起呼吸心跳骤停；
						</label><br/>
						<label id="id_13_5">
						2）口腔局部损伤和牙齿脱落；
						</label><br/>
						<label id="id_13_6">
						3）咽部感染、喉头水肿及声带损伤；
						</label><br/>
						<label id="id_13_7">
						4）气管软骨脱位；
						</label><br/>
						<label id="id_13_8">
						5）误吸、肺部感染和肺不张；
						</label><br/>
						<label id="id_13_9">
						6）粘液栓、痰栓等引起急性气道阻塞；
						</label><br/>
						<label id="id_13_10">
						7）误入食道；
						</label><br/>
						<label id="id_13_11">
						8）插管失败；
						</label>
						<br/>
						<label id="id_14" class="labtitle">机械通气</label>
						<br/>
						<label id="id_15">
						1）呼吸机诱发的肺损伤，相关性肺部感染；
						</label><br/>
						<label id="id_15_1">
						2）患者不能脱离呼吸机，呼吸机依赖；
						</label><br/>
						<label id="id_15_2">
						3）血流动力学不稳定，血压下降，心律失常，心功能衰竭等循环功能障碍；
						</label><br/>
						<label id="id_15_3">
						4）患者与呼吸机不同步，致呼吸困难，呼吸功能衰竭继续加重；
						</label><br/>
						<label id="id_15_4">
						5）病人需要约束治疗；
						</label><br/>
						<label id="id_15_5">
						6）皮下气肿、纵膈气肿和气胸等；氧中毒；
						</label><br/>
						<label id="id_15_6">
						7）气管食管瘘；
						</label><br/>
						<label id="id_15_7">
						4.我理解如果患者患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至死亡。
						</label><br/>
						<label id="id_15_8">
						5.如果患者的体位不当或不遵医嘱，可能影响操作效果。
						</label>
						<br/>
						<label id="id_18">一旦发生上述风险和意外，医生会采取积极应对措施。</label>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_17">我理解任何治疗都存在风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同病人及疾病状态有所不同，医生告诉我可与我的医生讨论有关我治疗的具体内容，如果我有特殊的问题可与我的医生讨论。</label>
						</div>
						<label id="id_16" class="labtitle">医疗替代方案</label>
						<br/>
						<label id="id_16_1">如不行气管插管，还可以选择的治疗方案有：无创呼吸机辅助呼吸等，但根据目前病情，首选治疗方案为气管插管。</label>
						<br/>
						<label id="id_19" class="labtitle">患者知情选择</label>
						<br/>
						<label id="id_20">
						1.我的医生已经告知我将要进行的诊治方式、此次诊治及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次诊治的相关问题。
						</label><br/>
						<label id="id_20_1">
						2.我同意在诊治中医生可以根据我的病情预定的诊治方式做出调整。
						</label><br/>
						<label id="id_20_2">
						3.我理解我的诊治可能需要多位医生共同进行。
						</label><br/>
						<label id="id_20_3">
						4.我并未得到诊治百分之百成功的许诺。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_21">患者签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_22">与患者关系：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_23">签名日期：</label>
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_24">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_25">患者签名：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_26">与患者关系：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_27">签名日期：</label>
						<input id="value_13" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_28" class="labtitle">医生陈述:</label>
						<br/>
						<label id="id_29" >
						我已经告知患者将要进行的诊治方式、此次治疗及诊治后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次诊治的相关问题。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_30">医生签名：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="4"  align="right">
						<label id="id_31">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab13 = document.getElementById("id_13").innerText;
		var lab13_1 = document.getElementById("id_13_1").innerText;
		var lab13_2 = document.getElementById("id_13_2").innerText;
		var lab13_3 = document.getElementById("id_13_3").innerText;
		var lab13_4 = document.getElementById("id_13_4").innerText;
		var lab13_5 = document.getElementById("id_13_5").innerText;
		var lab13_6 = document.getElementById("id_13_6").innerText;
		var lab13_7 = document.getElementById("id_13_7").innerText;
		var lab13_8 = document.getElementById("id_13_8").innerText;
		var lab13_9 = document.getElementById("id_13_9").innerText;
		var lab13_10 = document.getElementById("id_13_10").innerText;
		var lab13_11 = document.getElementById("id_13_11").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab15_1 = document.getElementById("id_15_1").innerText;
		var lab15_2 = document.getElementById("id_15_2").innerText;
		var lab15_3 = document.getElementById("id_15_3").innerText;
		var lab15_4 = document.getElementById("id_15_4").innerText;
		var lab15_5 = document.getElementById("id_15_5").innerText;
		var lab15_6 = document.getElementById("id_15_6").innerText;
		var lab15_7 = document.getElementById("id_15_7").innerText;
		var lab15_8 = document.getElementById("id_15_8").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab16_1 = document.getElementById("id_16_1").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19 = document.getElementById("id_19").innerText;
		var lab20 = document.getElementById("id_20").innerText;
		var lab20_1 = document.getElementById("id_20_1").innerText;
		var lab20_2 = document.getElementById("id_20_2").innerText;
		var lab20_3 = document.getElementById("id_20_3").innerText;
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
	  	var value6 = $('.jbzdDes').val();;
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "_______";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "___________";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10!=null&&value10!=""){
	  		var date = value10.split("/");
	  		value10 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value10 = "___________";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
			value11 = "___________";
	  	}
	  	var value12 = document.getElementById("value_12").value;
	  	if(value12==null||value12==""){
			value12 = "___________";
	  	}
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13!=null&&value13!=""){
	  		var date = value13.split("/");
	  		value13 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
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
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6_1+"</strong><strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong>"+lab7+"<strong>"+value7+"</strong>"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab11+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab13_3+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab14+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"</div>";	
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab16+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab19+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20_3+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab21+value8+" "+lab22+value9+" "+lab23+value10+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab24+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab25+value11+" "+lab26+value12+" "+lab27+value13+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab28+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab30+value14+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab31+value15+"</td></tr></table>";
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
	$(function(){
		$('#id_title2').html('气管插管和器械通气知情同意书')
	})
</script>
</div>