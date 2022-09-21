<div id="s1012">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">静脉血栓栓塞症的溶栓治疗同意书</label></div>
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
						疾病介绍和治疗建议：
						</label><br/>
						<label id="id_6_1">
						静脉血栓栓塞症是包括深静脉血栓形成和肺血栓栓塞症在内的一组血栓栓塞性疾病，是遗传、环境及行为等多种危险因素共同作用的全身性疾病，是住院患者常见并发症和重要的死亡原因之一。静脉血栓栓塞症除了可引起死亡的严重后果，也可以导致存活患者持续存在严重慢性并发症：静脉瓣功能不全和慢性肺动脉高压，严重影响患者的身体健康和生活质量。
						</label><br/>
						<label id="id_6_2"> 
						根据患者目前的病情，需要进行静脉血栓栓塞症的溶栓治疗。
						</label><br/>
						<label id="id_6_3">
						治疗中需要注意的问题及潜在风险和对策：
						</label>
						<div style="text-indent: 2em">
						<label id="id_7" >
						由于静脉血栓栓塞症的发生是十分复杂的病理、生理过程，并且因患者个体的特殊体质等因素，患者可能在溶栓治疗过程中或者治疗后发生一些并发症或其他风险，造成患者身体不同程度的损害，严重者可能导致患者死亡。
						</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_8" >
						医生告知我如下治疗中需要注意的问题及可能发生的风险，有些不常见的风险可能没有在此列出，具体的治疗方案根据不同患者的情况有所不同。如果我有特殊的问题可与我的医生详细讨论。同时医生也说明此方法并非是百分之百的有效治疗手段。
						</label>
						</div>
						<label id="id_9">
						1.	不同部位出血：如注射或穿刺部位局部血肿；出血性脑血意外；有出血倾向的器官损伤；出血风险的增加等；
						</label><br/>
						<label id="id_9_1">
						2.	过敏反应发生：如引发支气管痉挛、皮疹和发热；
						</label><br/>
						<label id="id_9_2">
						3.	血细胞比容及血红蛋白降低；
						</label><br/>
						<label id="id_9_3">
						4.	偶见心律失常；
						</label><br/>
						<label id="id_9_4">
						5.	罕见血压下降；
						</label><br/>
						<label id="id_9_5">
						6.	治疗无效；
						</label><br/>
						<label id="id_9_6">
						7.	其他不可预料或无法防范的不良后果。
						</label><br/>
						<label id="id_9_7">
						一旦发生上述风险和意外，医生会采取积极应对措施。
						</label><br/>
						<label id="id_9_8">
						患者知情选择:
						</label><br/>
						<label id="id_9_9">
						1.	我的医生已经告知我的病情、将要采取静脉血栓栓塞症的溶栓治疗措施、治疗中需要注意的事项、该治疗及可能发生的并发症和风险、可能存在的其他治疗方法并且解答了我关于治疗的相关问题。
						</label><br/>
						<label id="id_9_10">
						2.	我明白治疗中在不可预见的情况下，可能需要其它附加操作或变更诊疗方案，我授权医师在遇到有紧急情况时，为保障患者的生命安全实施必要的救治措施。
						</label><br/>
						<label id="id_9_11">
						3.	我已详细阅读以上内容，对医师详细告知的各种风险表示完全理解，经慎重考虑，我同意进行静脉血栓栓塞症的溶栓治疗。
						</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_10">患者签名：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_10_1">签名日期：</label>
						<input id="value_7" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11">
						如果患者无法或不宜签署该知情同意书，请其授权的代理人或亲属在此签名：
						</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_12">患者授权的代理人或亲属签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_13">与患者的关系：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_14">签名日期：</label>
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
						&nbsp;
						<label id="id_15">联系电话：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_16">医生陈述:</label>
						<div style="text-indent: 2em">
						<label id="id_17" >
						我已经告知患者病情、静脉血栓栓塞症的溶栓治疗及治疗后可能发生的并发症和风险、可能存在的其他治疗方法并且解答了患者关于该治疗的相关问题。
						</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_18">医生签名：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_19">签名日期：</label>
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
		var lab10_1 = document.getElementById("id_10_1").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19 = document.getElementById("id_19").innerText;
	
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
	  	if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	if(value10!=null&&value10!=""){
	  		var date = value10.split("/");
	  		value10 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value10 = "___________";
	  	}
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
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab6_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_3+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab8+"</div>";
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
		text +=	"<div style=\"text-indent: 0em\">"+lab9_11+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab10+value6+" "+lab10_1+value7+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab12+value8+" "+lab13+value9+"</td></tr>";
		text += "<tr align='right' height='27'><td>"+lab14+value10+" "+lab15+value11+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab18+value12+" "+lab19+value13+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1012 :input').each(function () {
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
	    var texthtml=document.getElementById("s1012").innerHTML;
		texthtml="<div id='s1012'>"+texthtml+"</div>";
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