<div id="s1026">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">支气管镜检查与治疗知情同意书</label></div>
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
						<label id="id_6">1、检查（操作）目的：</label>
						<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_1"><label id="id_7" class="doctorType" for="checkbox_1" style="color: blue;">明确诊断（支气管灌洗、刷检、活检、TBLB、TBNA等）</label>
    					</div>
    					<div style="text-indent: 2em">
    					<input type="checkbox"  class="checkStyle" id="checkbox_2"><label id="id_8" class="doctorType" for="checkbox_2" style="color: blue;">介入治疗（球囊扩张、电凝、冷冻、支架置入术等）</label>
    					</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_9">2、操作过程中可能出现的主要并发症和意外情况：</label>
						<div style="text-indent: 2em">
						<label id="id_10">
						1)麻醉意外
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_11">
						2)反射性呼吸、心跳骤停
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_12">
						3)上呼吸道损伤（疼痛、出血、感染等）
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_13">
						4)气道内大出血、窒息、感染
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_14">
						5)心律失常、血压波动、脑血管意外、休克
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_14">
						6)气胸、纵隔气肿、皮下气肿
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_15">
						7)恶心、呕吐、误吸
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_16">
						8)检查失败
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_17">
						9)其它：
						</label>
						<br/>
						<textarea id="value_textarea" rows="6" cols="120" ></textarea>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_18">3、可以替代的检查或治疗方式：</label>
						<textarea id="value_6" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
						<label id="id_19">替代方案的风险：</label>
						</div>
						<textarea id="value_7" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_20" class="labtitle">
						4、患方意见：经医生告知，我已了解上述情况并表示理解。因病情需要，我要求医师施行支气管镜检查（或治疗），并承担相应风险。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
						<label id="id_21">
						上述谈话记录，如与事实无误请患者（受托人）阅后签名。本谈话记录经医患双方签名后生效。
						</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="5"  align="right">
						<label id="id_22">患者本人签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_23">签名日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5"  align="right">
						<label id="id_24">受托人签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_25">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_26">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5"  align="right">
						<label id="id_27">谈话医师签名：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_28">签名日期：</label>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	
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
		if(value11==null||value11==""){
			value11 = "___________";
	  	}
		if(value12!=null&&value12!=""){
	  		var date = value12.split("/");
	  		value12 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value12 = "___________";
	  	}
	
		if(value13==null||value13==""){
			value13 = "___________";
	  	}
		if(value14!=null&&value14!=""){
	  		var date = value14.split("/");
	  		value14 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value14 = "___________";
	  	}
		var value_textarea=document.getElementById("value_textarea").value;
		if(value_textarea!=null&&value_textarea!=""){
			lab17=Trim(lab17)+value_textarea;
		}else{
			lab17=Trim(lab17)+"____________";
		}
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		if(checkbox_1){
			text +=	"<div style=\"text-indent: 2em\"><strong>"+lab7+"</strong></div>";
		}
		if(checkbox_2){
			text +=	"<div style=\"text-indent: 2em\"><strong>"+lab8+"</strong></div>";
		}
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab20+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab21+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr  align='right' height='27'><td>"+lab22+value8+" "+lab23+" "+value9+"</td></tr>";
		text +=	"<tr align='right' height='27'><td>"+lab24+value10+" "+lab25+value11+" "+lab26+value12+"</td></tr>";
		text +=	"<tr align='right' height='27'><td>"+lab27+value13+" "+lab28+value14+"</td></tr>";
		text +=	"</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1026 :input').each(function () {
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
	    var texthtml=document.getElementById("s1026").innerHTML;
		texthtml="<div id='s1026'>"+texthtml+"</div>";
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