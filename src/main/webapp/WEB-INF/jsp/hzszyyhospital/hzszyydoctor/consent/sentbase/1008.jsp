<div id="s1008">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">胸腔闭式引流同意书</label></div>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr>
					<td  colspan="5">
						<label id="id_1">姓名:</label>
						<input id="value_1" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_2">性别:</label>
						<input id="value_2" type="text" class="input_txt" style="width: 90px;"/>
						<label id="id_3">年龄:</label>
						<input id="value_3" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_4">住址:</label>
						<input id="value_4" type="text" class="input_txt" style="width: 180px;"/>
						<label id="id_5">经检查诊断为:</label>
						<input id="value_5" type="text" class="input_txt" style="width: 110px;"/>
						<label id="id_6">现拟行:</label>
						<label id="id_7" class="labtitle">&nbsp;胸膜腔闭式引流&nbsp;</label>
						<label id="id_8">手术治疗。但由于手术有一定风险性，现作如下说明：</label>
						<br/>
						<label id="id_9">
						1、麻醉意外。
						</label><br/>
						<label id="id_9_1">
						2、术中、术后出现心肺功能不全、心律失常、低心排、心跳骤停、呼吸骤停等。
						</label><br/>
						<label id="id_9_2">
						3、术中出血危及生命、术后出血需再次剖胸探查可能。
						</label><br/>
						<label id="id_9_3">
						4、术中胸膜反应、纵隔摆动，心跳骤停，危及生命可能。
						</label><br/>
						<label id="id_9_4">
						5、术后出现肺功能不全、呼吸衰竭,严重时需行气管切开,使用呼吸机辅助呼吸。
						</label><br/>
						<label id="id_9_5">
						6、术后可能发生皮下气肿、切口渗血、切口感染、切口不愈合或延迟愈合、切口疼痛。术后切口瘢痕愈合影响美容。术后胸管因胸水或持续性漏气而延缓拔管及出院时间。
						</label><br/>
						<label id="id_9_6">
						7、术后并发胸膜炎、复张性肺水肿、肺扩张不全、肺不张、肺炎、肺部感染甚至呼吸衰竭，胸腔感染、脓胸等，严重时患者可并发败血症危及生命。
						</label><br/>
						<label id="id_9_7">
						8、术中肋间血管、神经损伤；心脏、肺、大血管损伤、膈肌、肝脾损伤等。
						</label><br/>
						<label id="id_9_8">
						9、术后迟发性出血、气胸不愈合、张力性气胸、肺塌陷等，需再次手术、剖胸手术可能。
						</label><br/>
						<label id="id_9_9">
						10、术后根据胸液引流情况，有剖胸手术可能。
						</label><br/>
						<label id="id_9_10">
						11、其他目前医学难以解释及不可预防的并发症。
						</label><br/>
						<label id="id_9_11">
						以上各条医生已明确告知患者及家属，其已明确表示知情后同意手术，并表示愿意承担手术风险，立字为证。医务人员本着救死扶伤的精神，将尽最大努力救治患者。
						</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_10">医师签字：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						日期：
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 165px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH'})">
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_11">病人或家属签字：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 167px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_12">病人：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_13">家属或其他关系人：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_14">与病人关系：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						日期：
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 165px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab9_1 = document.getElementById("id_9_1").innerText;
		var lab9_2 = document.getElementById("id_9_2").innerText;
		var lab9_3 = document.getElementById("id_9_3").innerText;
		var lab9_4 = document.getElementById("id_9_4").innerText;
		var lab9_5 = document.getElementById("id_9_5").innerText;
		var lab9_6 = document.getElementById("id_9_6").innerText;
		var lab9_7 = document.getElementById("id_9_7").innerText;
		var lab9_8 = document.getElementById("id_9_8").innerText;
		var lab9_9 = document.getElementById("id_9_9").innerText;
		var lab9_10 = document.getElementById("id_9_10").innerText;
		var lab9_11 = document.getElementById("id_9_11").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
	
		var value1 = document.getElementById("value_1").value;
		if(value1==null||value1==""){
	  		value1 = "____________";
	  	}
	  	var value2 = document.getElementById("value_2").value;
	  	if(value2==null||value2==""){
	  		value2 = "____________";
	  	}
	  	var value3 = document.getElementById("value_3").value;
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = document.getElementById("value_4").value;
	  	if(value4==null||value4==""){
	  		value4 = "____________";
	  	}
	  	var value5 = document.getElementById("value_5").value;
	  	if(value5==null||value5==""){
	  		value5 = "____________";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	
	  	if(value8==null||value8==""){
	  		value8 = "___________";
	  	}
	  	if(value9!=null&&value9!=""){
	  		var str = value9.split(" ");
	  		var date = str[0].split("/");
	  		value9 = date[0]+"年"+date[1]+"月"+date[2]+"日"+str[1]+"时";
	  	}else{
	  		value9 = "___________";
	  	}
	  	
		if(value10==null||value10==""){
			value10 = "___________";
	  	}
		if(value11==null||value11==""){
			value11 = "___________";
	  	}
		if(value12==null||value12==""){
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
		
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<div style=\"line-height: 1.5\">";
	  	text += "<div style=\"text-indent: 0em\">"+lab1+"<strong>"+value1+"</strong> "+lab2+"<strong>"+value2+"</strong> "+lab3+"<strong>"+value3+"</strong> "+lab4+"<strong>"+value4+"</strong> "+lab5+"<strong>"+value5+"</strong> "+lab6+"<strong>"+lab7+"</strong>"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9_11+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab10+value8+"</td></tr>";
		text +=	"<tr align='right' height='27'><td>日期："+value9+"</td></tr>";
		text +=	"<tr align='right' height='27'><td>"+lab11+value10+"</td></tr>";
		text +=	"<tr align='right' height='27'><td>"+lab12+value11+" "+lab13+value12+" "+lab14+value13+"</td></tr>";
		text +=	"<tr align='right' height='27'><td>日期："+value14+"</td></tr>";
		text +=	"</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1008 :input').each(function () {
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
	    var texthtml=document.getElementById("s1008").innerHTML;
		texthtml="<div id='s1008'>"+texthtml+"</div>";
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
        	   $("#value_3").val(data.resultInfo.sysdata.hspemginfCustom.cstAge);
        	   $("#value_4").val(data.resultInfo.sysdata.hspemginfCustom.cstAdr);
        	   $("#value_5").val(data.resultInfo.sysdata.hspemginfCustom.jbzdDes);
           }
       })
	}
</script>
</div>
