<div id="s1047">
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
						<label id="id_6" class="labtitle">入院诊断：</label>
						<textarea id="value_6" style="width: 800px;height: 120px" class="jbzdDes"></textarea>
						<br/>
						<label id="id_7" class="labtitle">一．使用碘对比剂目的：</label><br/>
						<div style="text-indent: 2em">
							<label id="id_7_1">增加病变组织与正常组织的密度差别，从而提高病变的显示率和诊断准确性。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8">二．使用碘对比剂注意事项：</label>	
						<div style="margin-left: 2em">
							<label id="id_9">1.请告知医生以往有无：碘对比剂过敏史、甲状腺功能亢进、严重肾功能不全、哮喘病史等。</label><br/>
							<label id="id_10">2.使用碘对比剂可能出现不同程度的不良反应：</label><br/>
							<label id="id_11">（1）轻度不良反应：咳嗽、喷嚏、一过性胸闷、结膜炎、鼻炎、恶心、呕吐、全身发热、荨麻疹、瘙痒、血管神经性水肿等。</label><br/>
							<label id="id_12">（2）重度不良反应：喉头水肿、反射性心动过速、惊厥、震颤、抽搐、意识丧失、休克等，甚至死亡或其他不可预测的不良反应。</label><br/>
							<label id="id_13">（3）迟发性不良的反应：注射碘对比剂1小时至1周内有能出现各种迟发性不良反应，如恶心、呕吐、头痛、骨骼肌肉疼痛、发热等。</label><br/>
							<label id="id_14">（4）注射部位可能出现碘对比剂漏出，造成皮下组织肿胀、疼痛、麻木感，甚至溃烂、坏死等。</label><br/>
							<label id="id_15">（5）如使用高压注射器，存在注射针头脱落、局部血管破裂的潜在危险。</label><br/>
							<label id="id_16">（6）肾功能不全、心力衰竭、低蛋白血症、贫血、高龄（年龄>70岁）、低钾血症、使用肾毒性药物等情况下容易发生对比剂肾病。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_17">三．针对不良反应，我们采取的防范及处理措施：</label>
						<div style="text-indent: 2em">
							<label id="id_18">严格把握碘对比剂使用适应症；备好必要的急救药品、物品；检查完30分钟内患者不得擅自离开检查点，出现不良反应给予对症治疗；如出现气道痉挛、喉头水肿或休克等严重不良反应，立刻急救并通知临床医师积极抢救。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_19" class="labtitle">本人已阅读、理解并同意以上内容，同意使用碘对比剂并承担使用带来的风险。  同时， 我也理解虽然医院对可能出现的各种情况做了各种防范措施， 但仍可能出现上述不良反应。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_20">谈话医师：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
						<label id="id_21">签名时间：</label>
						<input id="value_8" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>	
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_22">受检人姓名：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_23">签字人：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_24">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
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
		var lab7_1 = document.getElementById("id_7_1").innerText;
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
	  		value7 = "___________";
	  	}
	  	var value8 = document.getElementById("value_8").value;
		if(value8!=null&&value8!=""&&value8!="精确到分"){
			 var dates=value8.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value8 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value8 = "___________";
		}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "___________";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
	  		value11 = "___________";
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
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"</div>";
		text +=	"<div style=\"margin-left: 2em\">"+lab9+"<br/>"+lab10+"<br/>"+lab11+"<br/>"+lab12+"<br/>"+lab13+"<br/>"+lab14+"<br/>"+lab15+"<br/>"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 2em\"><strong>"+lab19+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab20+value7+"&nbsp&nbsp"+dzqm+" "+lab21+value8+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab22+value9+" "+lab23+value10+" "+lab24+value11+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	
	 //参数获取
	function getparam(){
		$('#s1047 :input').each(function () {
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
	    var texthtml=document.getElementById("s1047").innerHTML;
		texthtml="<div id='s1047'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('碘对比剂使用知情同意书')
	})
</script>
</div>