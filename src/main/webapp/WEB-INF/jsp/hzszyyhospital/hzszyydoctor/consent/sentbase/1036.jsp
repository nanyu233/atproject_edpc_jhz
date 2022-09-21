<div id="s1036">
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
						<label id="id_6" style="font-weight: bolder;">申请重大疑难手术审批的原因：</label><input id="value_6" type="text" class="input_txt" style="width: 250px;"/>
						<br/>
						<label id="id_7" style="font-weight: bolder;">术中、术后重大疑难问题的处理与防范措施：</label><br/>
						<textarea id="value_7" style="width: 800px;height: 120px"></textarea><br/>
					</div>
					</td>
				</tr>
				
				<tr align="right">
					<td colspan="5">
						<label id="id_8">主刀医师签字：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_9">签名日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10">患者或家属意见（与患者关系 <input id="value_101" type="text" class="input_txt" style="width: 120px;"/>		）</label><br/><textarea id="value_10" style="width: 800px;height: 120px"></textarea><br/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_11">签名：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 120px;"/>		
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_12">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13" style="font-weight: bolder;">科室意见：</label><br/><textarea id="value_13" style="width: 800px;height: 120px"></textarea><br/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_14">科主任：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_15">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label id="id_16" style="font-weight: bolder;">医院意见：</label><br/><textarea id="value_16" style="width: 800px;height: 120px"></textarea><br/>
					</td>
				</tr>
				
				<tr align="right">
					<td colspan="5">
						<label id="id_17">签名：</label>
						<input id="value_17" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_18">签名日期：</label>
						<input id="value_18" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  		value6 = "_________________________________";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value101 = document.getElementById("value_101").value;
	  	if(value7==null||value7==""){
	  		value7 = "<br/><br/><br/>";
	  	}
	  	
	  	if(value8==null||value8==""){
	  		value8 = "___________";
	  	}
	  	if(value101==null||value101==""){
	  		value101 = "___________";
	  	}
	  	
	  	if(value9!=null&&value9!=""){
	  		var dates=value9.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value9 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value9 = "_______年___月___日___时___分";
	  	}
	  	
	  	if(value10==null||value10==""){
	  		value10 = "<br/><br/><br/>";
	  	}
	  	
	  	if(value11==null||value11==""){
	  		value11 = "___________";
	  	}
	  	
	  	if(value12!=null&&value12!=""){
	  		var dates=value12.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value12 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value12 = "_______年___月___日___时___分";
	  	}
	  	
	  	if(value13==null||value13==""){
	  		value13 = "<br/><br/><br/>";
	  	}
	  	
	  	if(value14==null||value14==""){
	  		value14 = "___________";
	  	}
	  	
	  	if(value15!=null&&value15!=""){
	  		var dates=value15.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value15 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value15 = "_______年___月___日___时___分";
	  	}
	  	
	  	if(value16==null||value16==""){
	  		value16 = "<br/><br/><br/>";
	  	}
	  	
	  	if(value17==null||value17==""){
	  		value17 = "___________";
	  	}
	  	
	  	if(value18!=null&&value18!=""){
	  		var dates=value18.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value18 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value18 = "_______年___月___日___时___分";
	  	}
	  	
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong>"+value6+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong>"+value7+"</div><br/>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>"+ lab8 + value8 +"&nbsp&nbsp"+dzqm+ "</td></tr></table>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab9 + value9 + "</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+value101+value10+"</div><br/>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab11 + value11 + "</td></tr></table>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab12 + value12 + "</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab13+"</strong>"+value13+"</div><br/>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab14 + value14 + "</td></tr></table>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab15 + value15 + "</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab16+"</strong>"+value16+"</div><br/>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab17 + value17 + "</td></tr></table>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td align='right'>" + lab18 + value18 + "</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1036 :input').each(function () {
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
	    var texthtml=document.getElementById("s1036").innerHTML;
		texthtml="<div id='s1036'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('审批报告')
	})
</script>
</div>