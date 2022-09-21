<div id="s1041">
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
					    <label id="id_6" style="font-weight: bold;">目前诊断：</label><br/>
						<label id="id_7">因</label><input id="value_7" type="text" class="input_txt jbzdDes" style="width: 300px;"/>
						<label id="id_8">需要进行</label><input id="value_8" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_9">检查或治疗。</label><br/>
						<label id="id_10">●术中心跳呼吸骤停，导致死亡或无法挽回的脑死亡；</label><br/>
						<label id="id_11">●难以控制的大出血；</label><br/>
						<label id="id_12">●不可避免的邻近器官、血管、神经损伤；</label><br/>
						<label id="id_13">●病情变化导致检查和治疗中断；</label><br/>
						<label id="id_14">●除上述情况外，本次检查和治疗还可能发生下列情况：</label><br/>
						
						<textarea id="value_14" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_15">防范和处理措施：  </label><br/>
						<textarea id="value_15" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_16">二、检查和治疗后可能出现的意外和并发症：</label><br/>
						<label id="id_17">●术后出血、局部或全身感染、脏器功能衰竭（包括DIC）；</label><br/>
						<label id="id_18">●术后气道阻塞，呼吸、心跳骤停；</label><br/>
						<label id="id_19">●诱发原有疾病恶化；</label><br/>
						<label id="id_20">●需急诊手术；</label><br/>
						<label id="id_21">●除上述情况外，本次检查和治疗还可能导致下列并发症：</label><br/>
						<textarea id="value_21" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_22">防范和处理措施：  </label><br/>
						<textarea id="value_22" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_23">医疗替代方案：</label><input id="value_23" type="text" class="input_txt" style="width: 240px;"/><br/>
					</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_24">上述情况医生已讲明。经慎重考虑，我对上述可能出现的该项风险表示充分理解，并签字同意该项检查和治疗。</label><br/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="3" align="left">
						<label id="id_25">患者或家属签字：</label>
						<input id="value_25" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_26">与患者关系：</label>
						<input id="value_26" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="2" align="right">
						<label id="id_27">签名日期：</label>
						<input id="value_27" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				<tr>
					<td colspan="3"  align="left">
						<label id="id_28">操作医师签字：</label>					
						<input id="value_28" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label id="id_29">签名日期：</label>
						<input id="value_29" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value21 = document.getElementById("value_21").value;
	  	var value22 = document.getElementById("value_22").value;
	  	var value23 = document.getElementById("value_23").value;
	  	var value25 = document.getElementById("value_25").value;
	  	var value26 = document.getElementById("value_26").value;
	  	var value27 = document.getElementById("value_27").value;
	  	var value28 = document.getElementById("value_28").value;
	  	var value29 = document.getElementById("value_29").value;
	  	if(value7==null||value7==""){
	  		value7 = "__________________";
	  	}
	  	if(value8==null||value8==""){
	  		value8 = "__________________";
	  	}
	  	if(value14==null||value14==""){
	  		value14 = "<br/><br/><br/>";
	  	}
	  	if(value15==null||value15==""){
	  		value15 = "<br/><br/><br/>";
	  	}
	  	if(value21==null||value21==""){
	  		value21 = "<br/><br/><br/>";
	  	}
	  	if(value22==null||value22==""){
	  		value22 = "<br/><br/><br/>";
	  	}
	  	if(value23==null||value23==""){
	  		value23 = "__________________________________";
	  	}
	  	if(value25==null||value25==""){
	  		value25 = "___________";
	  	}
	  	if(value26==null||value26==""){
	  		value26 = "___________";
	  	}
	  	if(value27!=null&&value27!=""){
	  		var dates=value27.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value27 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value27 = "____年___月___日___时___分";
	  	}
	  	if(value28==null||value28==""){
	  		value28 = "___________";
	  	}
	  	if(value29!=null&&value29!=""){
	  		var dates=value29.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value29 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value29 = "____年___月___日___时___分";
	  	}
	  	
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab6+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+value7+lab8+value8+lab9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"<br/>"+value14+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+"<br/>"+value15+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab21+"<br/>"+value21+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+"<br/>"+value22+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab23+value23+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab24+"</div>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab25+value25+lab26+value26+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab27+value27+"</td></tr></table>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab28+value28+"&nbsp&nbsp"+dzqm+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab29+value29+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1041 :input').each(function () {
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
	    var texthtml=document.getElementById("s1041").innerHTML;
		texthtml="<div id='s1041'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('特殊检查、特殊治疗同意书')
	})
</script>
</div>