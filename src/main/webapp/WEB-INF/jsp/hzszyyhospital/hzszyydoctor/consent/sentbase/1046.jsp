<div id="s1046">
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
					<div>
						<label id="id_6" class="labtitle">目前诊断：</label>
						<textarea id="value_6" style="width: 800px;height: 120px" class="jbzdDes"></textarea>
						<br/>
						<label id="id_7" class="labtitle">拟行治疗方案：</label>			
					</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8">根据目前病情需要，医生拟予应用糖皮质激素治疗。皮质激素具有明显的抗炎、抗过敏和免疫抑制等作用，
							但治疗同时，尤其是大剂量或疗程>5天激素治疗，可能会出现如下不良反应：</label><br/>
						<label id="id_9">（1）掩盖感染、潜在感染发作、机会性感染、可能抑制皮试反应等</label><br/>
						<label id="id_10">（2）类固醇溃疡、以至难以控制的消化道出血、消化道穿孔等</label><br/>
						<label id="id_11">（3）糖耐量减低，血糖升高，甚至诱发糖尿病等</label><br/>
						<label id="id_12">（4）药源性血压升高；某些敏感患者的充血性心力衰竭等</label><br/>
						<label id="id_13">（5）骨质疏松、病理性骨折、骨骼无菌性坏死等</label><br/>
						<label id="id_14">（6）诱发精神病、诱发癫痫、颅内压升高、假性脑肿瘤等</label><br/>
						<label id="id_15">（7）白内障、青光眼、眼压升高、角膜溃疡甚至穿孔</label><br/>
						<label id="id_16">（8）电解质紊乱，如低钙、低钾等</label><br/>
						<label id="id_17">（9）向心性肥胖、导致柯兴氏综合征、皮肤痤疮、伤口愈合不良等</label><br/>
						<label id="id_18">（10）其他一切不可预知的意外发生</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label class="labtitle" id="id_19">防范和处理措施：</label>
						<label id="id_20">医务人员本着“救死扶伤”的精神，将严格遵守诊疗常规及规范，对上述可能发生的情况将尽力予以救治。
						患者或被授权人已详细阅读以上内容，经医生解释后已经完全理解，并经慎重考虑决定同意予以大剂量或疗程>5天激素治疗，并承担相应风险。</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_21">患者（患者或者被授权人）签名：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>						
					</td>
					<td colspan="5" align="right">
						<label id="id_22">签字日期：</label>
						<input id="value_8" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_23">医生签字：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
						<label id="id_24">签字日期：</label>
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">	
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
		if(value8!=null&&value8!=""){
	  		var date = value8.split("/");
	  		value8 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
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
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"<br/>"+lab9+"<br/>"+lab10+"<br/>"+lab11+"<br/>"+lab12+"<br/>"+lab13+"<br/>"+lab14+"<br/>"+lab15+"<br/>"+lab16+"<br/>"+lab17+"<br/>"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab19+"</strong>"+lab20+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab21+value7+"</td><td align='right'>"+lab22+value8+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab23+value9+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab24+value10+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	
	 //参数获取
	function getparam(){
		$('#s1046 :input').each(function () {
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
	    var texthtml=document.getElementById("s1046").innerHTML;
		texthtml="<div id='s1046'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('大剂量或疗程大于5天激素治疗知情同意书')
	})
</script>
</div>