<div id="s1019">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">特殊检查、创伤性诊治知情同意书</label></div>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
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
						<label id="id_6">病员及家属：</label>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_7" >
						因疾病诊断治疗的需要，您或您的家人需要做进一步的诊疗，操作过程中可能会有一些不适或并发症，但我们会严格按照操作常规做好充分的准备，尽可能避免并发症的发生。谢谢您的配合！
						</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8">诊断：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 550px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_9">检查、诊治名称：</label>
						<input id="value_7" type="text" class="input_txt" style="width:490px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10">可能并发症及风险：</label>
						<textarea id="value_8" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">不做该项诊疗的可能风险：</label>
						<textarea id="value_9" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_12">可替代诊疗方案：</label>
						<textarea id="value_10" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="2">
						<label id="id_13">患方签字：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_14">患方意见：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 200px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_15">日期：</label>
						<input id="value_13" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="2">
						<label id="id_16">医师签字：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3"  align="right">
						<label id="id_17">日期：</label>
						<input id="value_15" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	
		if(value11==null||value11==""){
			value11 = "___________";
	  	}
		if(value12==null||value12==""){
			value12 = "___________";
	  	}
		if(value13!=null&&value13!=""){
	  		var date = value13.split("/");
	  		value13 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value13 = "___________";
	  	}
		if(value14==null||value14==""){
			value14 = "___________";
	  	}
		if(value15!=null&&value15!=""){
	  		var date = value15.split("/");
	  		value15 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value15 = "___________";
	  	}
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"<strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"<strong>"+value7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value8+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value9+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value10+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab13+value11+"</td><td align='right'>"+lab14+value12+"</td></tr>";
		text += "<tr height='27'><td colspan='2' align='right'>"+lab15+value13+"</td></tr>";
		text += "<tr height='27'><td>"+lab16+value14+"</td><td align='right'>"+lab17+value15+"</td></tr>";
		text +=	"</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1019 :input').each(function () {
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
	    var texthtml=document.getElementById("s1019").innerHTML;
		texthtml="<div id='s1019'>"+texthtml+"</div>";
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
        	   $("#value_6").val(data.resultInfo.sysdata.hspemginfCustom.jbzdDes);
           }
       })
	}
</script>
</div>
