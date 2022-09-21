<div id="s1024">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">造影剂使用知情同意书</label></div>
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
						<label id="id_6">
						1 这是一份有关碘造影剂使用的知情同意书。目的是告诉您碘造影剂使用相关事宜。请仔细阅读，提出与本次碘造影剂使用有关的任何疑问，决定是否使用碘造影剂，以保护自己的利益。
						</label><br/>
						<label id="id_6_1">
						2 作为检查的一部分，我们将需要给您注射碘/钆造影剂。这是一种无色透明的液体，进入体内后将从肾脏排出。它能使相应的组织、器官显影，从而提供重要的诊断信息。造影检查后请尽量多饮水，以加快造影 剂排出。
						</label><br/>
						<label id="id_6_2">
						3 您在注碘造影剂后口腔内可能会出现金属味；全身可能会有一种发热感，这种发热 感可能会从脸部及头部开始，然后波及身体其它部位；您也可能会有一过性恶心。通常这些感觉持续的时间会非常短。
						</label><br/>
						<label id="id_6_3">
						4 偶尔，使用造影剂时或过后有可能会出现一些轻微的过敏症状，如瘙痒、打喷嚏、荨麻疹、眼部水肿或气喘。当这些症状严重时我们会及时进行处理。
						</label><br/>
						<label id="id_6_4">
						5 出现严重过敏反应的概率虽然很少见，但不能排除。如果出现此类严重过敏反应（过敏性休克），我们会竭尽全力进行处理，但统计资料表明每50,000注射造影剂的人当中有1例可能会出现此类严重过敏反应。我们会采取一切目前我们能做到的措施，尽最大努力为您提供一个安全的检查环境。请告诉我们患者过去在做肾脏造影、血管造影、CT或其它检查时是否出现过造影剂过敏现象。如有任何与本次造影剂使用有关的问题请及时告诉我们。
						</label>
						<br/>
						<label id="id_7" class="labtitle">
						本人已阅读、理解并同意以上内容，同意承担使用造影剂所带来的风险，同时，我也理解虽然医院对可能出现的各种情况做了各种防范措施，但这并不能保证不出现上述各种并发症。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_8">患者本人签名：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_9">日期：</label>
						<input id="value_7" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_10">谈话医生：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_11">日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_12" class="labtitle">
							 本人已阅读、理解并同意以上内容，理解虽然医院对可能出现的各种情况做了各种防范措施，但这并不能保证不出现上述各种并发症。我代表患者同意接受造影剂检查，并已反复确认该决定未违背患者的真实意愿。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_13">患方代表签字：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_14">日期：</label>
						<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_15">(</label>
						<input type="radio" class="radioStyle" name="radio1" id="checkbox_1" value="配偶"><label class="doctorType" for="checkbox_1" style="color: blue;">配偶</label>
						&nbsp;
    					<input type="radio" class="radioStyle" name="radio1" id="checkbox_2" value="子女"><label class="doctorType" for="checkbox_2" style="color: blue;">子女</label>
    					&nbsp;
    					<input type="radio" class="radioStyle" name="radio1" id="checkbox_3" value="父母"><label class="doctorType" for="checkbox_3" style="color: blue;">父母</label>
    					&nbsp;
    					<input type="radio" class="radioStyle" name="radio1" id="checkbox_4" value="其他近亲属同事"><label class="doctorType" for="checkbox_4" style="color: blue;">其他近亲属同事</label>
    					&nbsp;
    					<input type="radio" class="radioStyle" name="radio1" id="checkbox_5" value="朋友"><label class="doctorType" for="checkbox_5" style="color: blue;">朋友</label>
    					&nbsp;
    					<input type="radio" class="radioStyle" name="radio1" id="checkbox_6" value="其他"><label class="doctorType" for="checkbox_6" style="color: blue;">其他</label>
    					<label id="id_16">)</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_17">谈话医生：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_18">日期：</label>
						<input id="value_13" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab6_2 = document.getElementById("id_6_2").innerText;
		var lab6_3 = document.getElementById("id_6_3").innerText;
		var lab6_4 = document.getElementById("id_6_4").innerText;
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
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	
	  	var radio1 = "___________";
	  	var radio = document.getElementsByName("radio1");  
		for (var i=0; i<radio.length; i++) {  
			if (radio[i].checked) {  
				radio1 = radio[i].value;
			}  
		}
		
	  	if(value6==null||value6==""){
	  		value6 = "___________";
	  	}
	  	if(value7!=null&&value7!=""){
	  		var date = value7.split("/");
	  		value7 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value7 = "___________";
	  	}
	  	if(value8==null||value8==""){
			value8 = "___________";
	  	}
		if(value9!=null&&value9!=""){
	  		var date = value9.split("/");
	  		value9 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value9 = "___________";
	  	}
		if(value10==null||value10==""){
			value10 = "___________";
	  	}
		if(value11!=null&&value11!=""){
	  		var date = value11.split("/");
	  		value11 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
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
		
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr><td>"+lab8+value6+"</td><td align='right'>"+lab9+value7+"</td></tr>";
		text +=	"<tr><td>"+lab10+value8+"</td><td align='right'>"+lab11+value9+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 2em\"><strong>"+lab12+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab13+value10+"</td><td align='right'>"+lab14+value11+"</td></tr>";
		text +=	"<tr height='27'><td colspan='2'>"+lab15+radio1+lab16+"</td></tr>";
		text +=	"<tr height='27'><td>"+lab17+value12+"</td><td align='right'>"+lab18+value13+"</td></tr>";
		text +=	"</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1024 :input').each(function () {
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
	    var texthtml=document.getElementById("s1024").innerHTML;
		texthtml="<div id='s1024'>"+texthtml+"</div>";
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
           }
       })
	}
</script>
</div>