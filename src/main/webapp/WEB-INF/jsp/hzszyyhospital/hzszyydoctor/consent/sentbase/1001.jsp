<div id="s1001">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">72小时内诊疗知情告知同意谈话</label></div>
	<div class="messages m_t10">
		<div>
			<table  class="tbody">
				<tr>
					<td style="width: 19%">
						<label id="id_1">姓名:</label>
						<input id="value_1" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td style="width: 18%">
						<label id="id_2">性别:</label>
						<input id="value_2" type="text" class="input_txt" style="width: 90px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_3">科别:</label>
						<input id="value_3" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">床号:</label>
						<input id="value_4" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">留观号:</label>
						<input id="value_5" type="text" class="input_txt" style="width: 96px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6" class="labtitle">入院后主要病情：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_6" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7" class="labtitle">重要体格检查结果：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_7" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8" class="labtitle">辅助检查结果：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_8" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_9" class="labtitle">目前诊断：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_9" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10" class="labtitle">已采取的医疗措施：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_10" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11" class="labtitle">进一步诊疗措施：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_11" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_12" class="labtitle">可能出现的并发症和风险：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_12" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13" class="labtitle">特殊检查及特殊治疗可能引起的并发症及风险：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_13" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_14" class="labtitle">预后：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_14" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_15" class="labtitle">患者（或被委托人）应注意的事项：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_15" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_16">患者（或被委托人）签名：</label>
						<input id="value_16" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_17">签字时间：</label>
						<input id="value_17" class="Wdate spcWdate" type="text" style="width: 185px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_18">医师签名：</label>
						<input id="value_18" type="text" class="input_txt" style="width: 185px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_19">谈话时间：</label>
						<input id="value_19" class="Wdate spcWdate" type="text" style="width: 185px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
		var lab13= document.getElementById("id_13").innerText;
		var lab14= document.getElementById("id_14").innerText;
		var lab15= document.getElementById("id_15").innerText;
		var lab16= document.getElementById("id_16").innerText;
		var lab17= document.getElementById("id_17").innerText;
		var lab18= document.getElementById("id_18").innerText;
		var lab19= document.getElementById("id_19").innerText;
		
		var value1 = document.getElementById("value_1").value;	
		if(value1==null||value1==""){
	  		value1 = "_______";
	  	}
	  	var value2 = document.getElementById("value_2").value;
	  	if(value2==null||value2==""){
	  		value2 = "_____";
	  	}
	  	var value3 = document.getElementById("value_3").value;
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = document.getElementById("value_4").value;
	  	if(value4==null||value4==""){
	  		value4 = "_____";
	  	}
	  	var value5 = document.getElementById("value_5").value;
	  	if(value5==null||value5==""){
	  		value5 = "_______";
	  	}
	  	var value6 = document.getElementById("value_6").value;	
	  	if(value6==null||value6==""){
	  		value6 = "____________";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "____________";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "____________";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "____________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "____________";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
	  		value11 = "____________";
	  	}
	  	var value12 = document.getElementById("value_12").value;
	  	if(value12==null||value12==""){
	  		value12 = "____________";
	  	}
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13==null||value13==""){
	  		value13 = "____________";
	  	}
	  	var value14 = document.getElementById("value_14").value;
	  	if(value14==null||value14==""){
	  		value14 = "____________";
	  	}
	  	var value15 = document.getElementById("value_15").value;
	  	if(value15==null||value15==""){
	  		value15 = "____________";
	  	}
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value19 = document.getElementById("value_19").value;
	  	
	  	//签名
	  	if(value16==null||value16==""){
	  		value16 = "___________";
	  	}
	  	if(value18==null||value18==""){
	  		value18 = "___________";
	  	}
	  	
	  	//日期变格式
	  	if(value17!=null&&value17!=""){
	  		var str = value17.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value17 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value17 = "___________";
	  	}
	  	if(value19!=null&&value19!=""){
	  		var str = value19.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value19 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value19 = "___________";
	  	}
	  
	  	var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value6+"</div>";	
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value7+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab8+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value8+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab9+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value9+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab10+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value10+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab11+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value12+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab13+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value13+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab14+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value14+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab15+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+value15+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab16+value16+"</td></tr>";
		text += "<tr align='right' height='27'><td>"+lab17+value17+"</td></tr>";
		text += "<tr><td><br/></td></tr>";
		text += "<tr align='right' height='27'><td>"+lab18+value18+"</td></tr>";
		text += "<tr align='right' height='27'><td>"+lab19+value19+"</td></tr>";
		text += "</table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1001 :input').each(function () {
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
	    var texthtml=document.getElementById("s1001").innerHTML;
		texthtml="<div id='s1001'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	 
	function init1(){
		var refseqno=$("#refseqno").val();
		$.ajax({
	   	     url: "${baseurl}zyyconsent/findHspemginfCustombyAjax.do?",
	   	     type: "post",
           data: {
           	"emgSeq":refseqno
           },
           success:function(data){
        	   $("#value_1").val(data.resultInfo.sysdata.hspemginfCustom.cstNam);
        	   $("#value_2").val(data.resultInfo.sysdata.hspemginfCustom.cstSexCod);
        	   $("#value_3").val(data.resultInfo.sysdata.hspemginfCustom.emgFkCod);
        	   $("#value_4").val(data.resultInfo.sysdata.hspemginfCustom.emgBed);
        	   $("#value_5").val(data.resultInfo.sysdata.hspemginfCustom.observationCode);
        	   $("#value_9").val(data.resultInfo.sysdata.hspemginfCustom.jbzdDes);
           }
       })
	}
</script>
</div>