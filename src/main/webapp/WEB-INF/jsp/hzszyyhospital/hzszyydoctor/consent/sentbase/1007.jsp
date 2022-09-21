<div id="s1007">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">骨髓穿刺（活检）术知情同意书</label></div>
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
					<td colspan="5"><label id="id_6" class="labtitle">疾病介绍和治疗建议</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7">医生已告知我需要在</label>
						<input id="value_6" type="text" class="input_txt" style="width: 200px;"/>
						<label id="id_8">麻醉下进行</label>
						<input id="value_7" type="text" class="input_txt" style="width: 200px;"/>
						<label id="id_9">术。</label><br/>
						<input type="checkbox" class="checkStyle1" id="value_8"><label id="id_10" class="doctorType" for="value_8" style="color: blue;">穿刺取骨髓，协助确定诊断及检测病情变化；</label><br/>
    					<input type="checkbox" class="checkStyle1" id="value_9"><label id="id_11" class="doctorType" for="value_9" style="color: blue;">骨髓组织性病理检查，协助确定诊断及检测病情变化；</label><br/>
    					<input type="checkbox" class="checkStyle1" id="value_10"><label id="id_12" class="doctorType" for="value_10" style="color: blue;">其他</label>
    					<input id="valueadd1" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_13" class="labtitle">手术潜在风险和对策</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_14">
						医生告知我骨髓穿刺/活检可发生的一些风险，有些不常见的风险可能没有在此列出，具体的医疗方案术式根据不同病人的情况有所不同，医生告诉我可与我的医生讨论有关我医疗方案的具体内容，如果我有特殊的问题可与我的医生讨论。
						</label><br/>
						<label id="id_14_1">
						1.我理解任何麻醉都存在风险。
						</label><br/>
						<label id="id_14_2">
						2.我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。
						</label><br/>
						<label id="id_14_3">
						3.我理解此医疗方案存在以下并发症风险和局限性：
						</label><br/>
						<label id="id_14_4">
						局部感染或败血症:局部穿刺点发生红、肿、热、痛，或全身感染如发热、寒战等；
						</label><br/>
						<label id="id_14_5">
						局麻醉过敏，药物毒性反应；
						</label><br/>
						<label id="id_14_6">
						穿刺部位局部血肿；
						</label><br/>
						<label id="id_14_7">
						心血管症状：穿刺期间可发生高血压、脑血管意外、心律失常、心包填塞、心跳呼吸骤停等；
						</label><br/>
						<label id="id_14_8">
						由于疾病原因或病人自身因素导致的穿刺失败，可能需要再次穿刺；
						</label><br/>
						<label id="id_14_9">
						术中、术后出血、渗液、渗血，损伤周围神经、动脉、静脉，致出血、血肿形成；
						</label><br/>
						<label id="id_14_10">
						穿刺针折断；
						</label><br/>
						<label id="id_14_11">
						除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提请患者及家属特别注意的其他事项，如：
						</label><br/>
						<textarea id="value_textarea" rows="6" cols="120" ></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_15" class="labtitle">特殊风险或主要高危因素</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_16">我理解根据我个人的病情，我可能出现未包括在上述所交待并发症以外的风险：</label><br/>
						<textarea id="value_7_1" rows="6" cols="120"></textarea>
						<br/>
						<label id="id_17">一旦发生上述风险和意外，医生会采取积极应对措施。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_18" class="labtitle">患者知情选择</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_19">
						我的医生已经告知我将要进行的操作方式、此次操作及操作后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次操作的相关问题。
						</label><br/>
						<label id="id_19_1">
						我同意在操作中医生可以根据我的病情对预定的操作方式做出调整。
						</label><br/>
						<label id="id_19_2">
						我理解我的操作需要多位医生共同进行。
						</label><br/>
						<label id="id_19_3">
						我并未得到操作百分之百成功的许诺。
						</label><br/>
						<label id="id_19_4">
						我授权医师对操作切除的病变器官、组织或标本进行处置，包括病理学检查、细胞学检查和医疗废物处理等。
						</label>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_20">患者签名：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_21">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_22">如果患者无法签署知情同意书，请其授权的亲属在此签名</label><br/></td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_23">患者授权亲属签名：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_24">与患者关系：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_25">签名日期：</label>
						<input id="value_15" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5"><label id="id_26" class="labtitle">医护人员陈述</label></td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_27">
						我已经告知患者将要进行的手术方式、此次手术及术后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了患者关于此次手术的相关问题。
						</label>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_28">医护人员签名：</label>
						<input id="value_16" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_29">签名日期：</label>
						<input id="value_17" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab14_1 = document.getElementById("id_14_1").innerText;
		var lab14_2 = document.getElementById("id_14_2").innerText;
		var lab14_3 = document.getElementById("id_14_3").innerText;
		var lab14_4 = document.getElementById("id_14_4").innerText;
		var lab14_5 = document.getElementById("id_14_5").innerText;
		var lab14_6 = document.getElementById("id_14_6").innerText;
		var lab14_7 = document.getElementById("id_14_7").innerText;
		var lab14_8 = document.getElementById("id_14_8").innerText;
		var lab14_9 = document.getElementById("id_14_9").innerText;
		var lab14_10 = document.getElementById("id_14_10").innerText;
		var lab14_11 = document.getElementById("id_14_11").innerText;
		
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19 = document.getElementById("id_19").innerText;
		var lab19_1 = document.getElementById("id_19_1").innerText;
		var lab19_2 = document.getElementById("id_19_2").innerText;
		var lab19_3 = document.getElementById("id_19_3").innerText;
		var lab19_4 = document.getElementById("id_19_4").innerText;
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
	  	var value7_1 = document.getElementById("value_7_1").value;
	  	if(value7_1==null||value7_1==""){
	  		value7_1 = "____________";
	  	}
	  	var value8 = document.getElementById("value_8").checked;
	  	var value9 = document.getElementById("value_9").checked;
	  	var value10 = document.getElementById("value_10").checked;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var valueadd1=document.getElementById("valueadd1").value;
	  	var value_textarea=document.getElementById("value_textarea").value;
	  	if(value_textarea!=null&&value_textarea!=""){
	  		lab14_11 =Trim(lab14_11)+value_textarea;
	  	}else{
	  		lab14_11 =Trim(lab14_11)+"____________";
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
		if(value14==null||value14==""){
			value14 = "___________";
	  	}
		if(value15!=null&&value15!=""){
	  		var date = value15.split("/");
	  		value15 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value15 = "___________";
	  	}
		
		if(value16==null||value16==""){
			value16 = "___________";
	  	}
		if(value17!=null&&value17!=""){
	  		var date = value17.split("/");
	  		value17 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value17 = "___________";
	  	}
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"<strong>"+value6+"</strong>"+lab8+"<strong>"+value7+"</strong>"+lab9+"</div>";
		if(value8){
			text +=	"<div style=\"text-indent: 0em\"><strong>"+lab10+"</strong></div>";
		}
		if(value9){
			text +=	"<div style=\"text-indent: 0em\"><strong>"+lab11+"</strong></div>";
		}
		if(value10){
			if(valueadd1!=null&&valueadd1!=null){
				lab12= valueadd1+";";
			}
			text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12+"</strong></div>";
		}
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab13+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14_11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab15+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value7_1+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab18+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19_4+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab20+value11+" "+lab21+value12+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab23+value13+" "+lab24+value14+" "+lab25+value15+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab26+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab28+value16+" "+lab29+value17+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1007 :input').each(function () {
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
	    var texthtml=document.getElementById("s1007").innerHTML;
		texthtml="<div id='s1007'>"+texthtml+"</div>";
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