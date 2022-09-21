<div id="s1037">
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
						<label id="id_6">手术（包括介入性诊疗）前诊断：</label><br/>
						<textarea id="value_6" style="width: 800px;height: 120px" class="jbzdDes"></textarea><br/>
						<label id="id_7">手术指征：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 250px;"/>	<br/>
						<label id="id_8">手术方案：</label><br/>
						<textarea id="value_8" style="width: 800px;height: 120px"></textarea><br/>
					</div>
					</td>
				</tr>
				
				
				<tr>
					<td colspan="5">
						<label id="id_9">医疗替代方案：</label><br/>
						<textarea id="value_9" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_10">1 医学是一门科学，还有许多为被认识的领域。另外，患者的个体差异很大，疾病的变化也各不 相同，相同的诊治手段有可能出现不同的结果，因此，任何手术都具有较高的风险。有些风险 是医护人员和现代医学知识无法预见、防范和避免的医疗意外；有些是能够预见但却不能完全 避免和防范的并发症。而且任何手术和方案都不能保证其结果和疗效。作为患者及所有家属有 权知道手术的性质和目的，以及手术的高风险性，也有权同意或拒绝任何拟定的手术方案。
根据患者及家属的委托和同意，我们已制定了上述的手术方案，并将对患者施行手术。我 作为患者的主刀（操作）医生保证将以良好的医德医术为患者施行手术（操作），严格遵守医 疗操作规范，密切观察病情变化，出现问题及时处理、抢救，力争将风险降低到最低限度。由 于紧急或事先没有预料的情况发生，将及时与家属取得联系。
</label><br/><br/>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_11">主刀医师签字：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_12">谈话医师：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_13">签名日期：</label>
						<input id="value_13" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_14">患者或家属签字：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_15">与患者关系：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_16">签名日期：</label>
						<input id="value_16" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  		value6 = "<br/><br/><br/>";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	if(value7==null||value7==""){
	  		value7 = "_____________________________";
	  	}
	  	if(value8==null||value8==""){
	  		value8 = "<br/><br/><br/>";
	  	}
	  	if(value9==null||value9==""){
	  		value9 = "_____________________________";
	  	}
	  	if(value11==null||value11==""){
	  		value11 = "_________";
	  	}
	  	if(value12==null||value12==""){
	  		value12 = "_________";
	  	}
	  	if(value13!=null&&value13!=""){
	  		var dates=value13.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value13 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value13 = "____年___月___日___时___分";
	  	}
	  	if(value14==null||value14==""){
	  		value14 = "_________";
	  	}
	  	if(value15==null||value15==""){
	  		value15 = "_______";
	  	}
	  	if(value16!=null&&value16!=""){
	  		var dates=value16.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value16 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value16 = "____年___月___日___时___分";
	  	}
	  	
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+value6+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+value7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+value8+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+value9+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"<br/></div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab11+value11+" "+lab12+value12+" "+lab13+value13+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab14+value14+" "+lab15+value15+" "+lab16+value16+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1037 :input').each(function () {
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
	    var texthtml=document.getElementById("s1037").innerHTML;
		texthtml="<div id='s1037'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('手术知情同意书1')
	})
</script>
</div>