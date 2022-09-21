<div id="s1004">
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
				<tr height="27">
					<td colspan="5">
					<div style="text-indent: 0em">
						<label id="id_6" >尊敬的患者家属或患者的法定监护人、授权委托人：</label>
					</div>
					<div style="text-indent: 2em">
						<label id="id_7" >患者目前诊断为：</label>
						<input id="value_7" class="input_txt jbzdDes" style="width: 300px;">
					</div>
					<div style="text-indent: 2em">
						<label id="id_8" >虽经医护人员积极救治，但目前病情危重，且有可能进一步恶化，随时会出现一种或多种严重并发症：肺性脑病，严重心律失常、心功能衰竭、心肌梗死、高血压危象；上消化道出血导致出血性休克、脑出血、脑梗塞、脑疝；感染中毒性休克、过敏性休克、心源性休克；弥漫性血管内凝血（DIC）；多器官功能衰竭；糖尿病酮症、酸中毒、低血糖性昏迷、高渗性昏迷等。</label>
					</div>
					<div style="text-indent: 0em">
						<label id="id_9" >其他：</label>
						<input id="value_9" class="input_txt" style="width: 200px;">
					</div>
					<div style="text-indent: 2em">
						<label id="id_10" >上述情况一旦发生会严重威胁患者生命，医护人员将会全力抢救。如您有其他问题和要求，请在接到本通知后主动找医生了解咨询。请您留下准确的联系方式，以便医护人员随时与您沟通。</label>
					</div>
					<div style="text-indent: 2em">
						<label id="id_11" >此外，限于目前医学科学技术条件，尽管我院医护人员已经尽全力救治患者，仍存在因疾病原因患者不幸死亡的可能。请予以理解。</label>
					</div>
					<div style="text-indent: 0em">
						<label id="id_12" style="font-weight: bold;" >患者家属或患者的法定监护人、授权委托人意见：</label>
					</div>
					<div style="text-indent: 2em">
						<label id="id_13" >关于患者目前的病情危重、可能出现的风险和后果以及医护人员对于患者病情危重时进行的救治措施，医护人员已经向我详细告知。我了解了患者病情危重，并且</label>
						<input id="value_13" class="input_txt" style="width: 100px;">
						<label id="id_14" >（“同意”或“不同意”）医护人员进行（同意划√，可多选）：</label>
					</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_15"/>
						<label id="id_15" class="doctorType" for="checkbox_15" style="color: blue;">气管切开</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_16"/>
						<label id="id_16" class="doctorType" for="checkbox_16" style="color: blue;">呼吸机辅助呼吸</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_17"/>
						<label id="id_17" class="doctorType" for="checkbox_17" style="color: blue;">电除颤 </label>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_18"/>
						<label id="id_18" class="doctorType" for="checkbox_18" style="color: blue;">心脏按压</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_19"/>
						<label id="id_19" class="doctorType" for="checkbox_19" style="color: blue;">临时起搏器</label>
					</td>
					<td colspan="2">
						<input type="checkbox" class="checkStyle" id="checkbox_20"/>
						<label id="id_20" class="doctorType" for="checkbox_20" style="color: blue;">其他有创救治措施</label>
					</td>
				</tr>
				
				<tr >
					<td colspan="2">
						<label id="id_21">医生签名：</label>
						<input id="value_21" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="4">
						<label id="id_22">签名日期：
							<input id="value_22" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						</label>
					</td>			
				</tr>
				<tr >
					<td colspan="2">
						<label id="id_23">患者授权亲属签名：</label>
						<input id="value_23" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="2">
						<label id="id_24">与患者关系：</label>
						<input id="value_24" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="2">
						<label id="id_25">联系电话：</label>
						<input id="value_25" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr >
					<td colspan="4">
						<label id="id_26">签名日期：
							<input id="value_26" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						</label>
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
		var dzqm = document.getElementById("dzqm").innerHTML;
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		
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
	  	
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "____________";
	  	}
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13==null||value13==""){
	  		value13 = "____________";
	  	}
	  	var value21 = document.getElementById("value_21").value;
	  	if(value21==null||value21==""){
	  		value21 = "____________";
	  	}
	  	var value23 = document.getElementById("value_23").value;
	  	if(value23==null||value23==""){
	  		value23 = "____________";
	  	}
	  	var value24 = document.getElementById("value_24").value;
	  	if(value24==null||value24==""){
	  		value24 = "____________";
	  	}
	  	var value25 = document.getElementById("value_25").value;
	  	if(value25==null||value25==""){
	  		value25 = "____________";
	  	}
	  	var value22 = document.getElementById("value_22").value;
		if(value22!=null&&value22!=""){
			 var date = dates[0].split("/");
			 value22 = date[0]+"年"+date[1]+"月"+date[2]+"日";
		}else{
			 value22 = "____年___月___日";
		}
	  	var value26 = document.getElementById("value_26").value;
		if(value26!=null&&value26!=""){
			 var date = dates[0].split("/");
			 value26 = date[0]+"年"+date[1]+"月"+date[2]+"日";
		}else{
			 value26 = "____年___月___日";
		}
	  	
	  	var checkbox_15= document.getElementById("checkbox_15").checked;
		var checkbox_16= document.getElementById("checkbox_16").checked;
		var checkbox_17= document.getElementById("checkbox_17").checked;
		var checkbox_18= document.getElementById("checkbox_18").checked;
		var checkbox_19= document.getElementById("checkbox_19").checked;
		var checkbox_20= document.getElementById("checkbox_20").checked;
	  	
	  	if(checkbox_15){
			checkbox_15 = 'checked';
		}	
	  	if(checkbox_16){
			checkbox_16 = 'checked';
		}	
	  	if(checkbox_17){
			checkbox_17 = 'checked';
		}	
	  	if(checkbox_18){
			checkbox_18 = 'checked';
		}	
	  	if(checkbox_19){
			checkbox_19 = 'checked';
		}	
	  	if(checkbox_20){
			checkbox_20 = 'checked';
		}	
	  	
	  	
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
			text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+value7+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+value9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+value13+lab14+"</div>";
		text +=	"<input type='checkbox' "+checkbox_15+">"+lab15+"<input type='checkbox' "+checkbox_16+">"+lab16+"<input type='checkbox' "+checkbox_17+">"+lab17+"<br/>";
		text +=	"<input type='checkbox' "+checkbox_18+">"+lab18+"<input type='checkbox' "+checkbox_19+">"+lab19+"<input type='checkbox' "+checkbox_20+">"+lab20+"<br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab21+value21+"&nbsp&nbsp"+dzqm+"</td><td align='right' height='27'>"+lab22+value22+"</td></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab23+value23+"&nbsp;&nbsp;&nbsp;"+lab24+value24+"&nbsp;&nbsp;&nbsp;"+lab25+value25+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab26+value26+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1004 :input').each(function () {
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
	    var texthtml=document.getElementById("s1004").innerHTML;
		texthtml="<div id='s1004'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}

	$(function(){
		$('#id_title2').html('病危通知书')
	})
</script>
</div>