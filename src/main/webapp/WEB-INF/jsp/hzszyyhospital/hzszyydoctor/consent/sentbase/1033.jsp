<div id="s1015">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">急性缺血性卒中rt-PA 静脉溶栓治疗知情同意书</label></div>
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
					<div style="text-indent: 2em">
						<label id="id_6" >根据您（患者姓名</label>
						<input id="value_6" type="text" class="input_txt" style="width: 150px;"/>
						<label id="id_7">）的临床症状、体征及CT检查表现，考虑您的脑部发生了严重的病变，医学上称为脑梗塞或是缺血性脑卒中。
						这种病变，是因您脑部的血流被血栓阻断所造成，有可能产生永久性的伤害。如果有方法可以快速溶解血栓，就有可能减少因血栓阻塞所引起的脑部损害程度。
						rt-PA，中文名叫重组组织型纤溶酶原激活剂，能够溶解血栓，目前被认为是对缺血性脑卒中最有效的药物治疗方式。
						患缺血性脑卒中的病人只有不到三分之一的机会可恢复到正常的功能。您若使用这种血栓溶解剂将会增加约15%获得良好预后的机会。
						虽然rt-PA是目前所能建议的最好治疗方式，但是它也有一定风险性：100个使用这种血栓溶解剂的病人，约有6个病人，可能引起症状性脑出血的风险，
						严重者也可能导致死亡（不用这种血栓溶解剂的病人症状性脑出血的几率约为0.6％）。但是，研究显示此种药物可以降低缺血性脑卒中患者的死亡率。
						rt-PA还有可能引起过敏反应。我们没有办法保证不会发生严重的颅内或是身体其他部位的出血，但在治疗后，我们将密切注意一切变化，
						并尽一切可能来防止治疗药物产生的副作用。医生已经向我解释了rt-PA治疗急性卒中的风险和益处，并且回答了我提出的所有问题。
						我同意接受rt-PA静脉溶栓治疗。</label>
					</div>
					</td>
				</tr>
				
				<tr align="left">
					<td colspan="5">
						<label id="id_8">患者签字：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_9">签名日期：</label>
						<input id="value_8" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10">亲属/法定代表（如果需要）：我同意上述患者接受静脉rt-PA溶栓治疗。</label>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_11">亲属/法定代表姓名签字：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 120px;"/>						
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_12">亲属/法定代表与患者关系：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_13">签名日期：</label>
						<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_14">我已经对上述姓名的患者解释了rt-PA治疗急性卒中的风险和益处。</label>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_15">医生签字：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_16">签名日期：</label>
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
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	if(value7==null||value7==""){
	  		value7 = "___________";
	  	}
	  	if(value8!=null&&value8!=""){
	  		var date = value8.split("/");
	  		value8 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value8 = "___________";
	  	}
	  	if(value9==null||value9==""){
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
		text +=	"<div style=\"text-indent: 2em\">"+lab6+"<strong>"+value6+"</strong>"+lab7+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab8+value7+" "+lab9+value8+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+value9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+value10+"</div>";
		"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab13+value11+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab15+value12+" "+lab16+value13+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1015 :input').each(function () {
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
	    var texthtml=document.getElementById("s1015").innerHTML;
		texthtml="<div id='s1015'>"+texthtml+"</div>";
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
        	   $("#value_6").val(data.resultInfo.sysdata.hspemginfCustom.cstNam);
           }
       })
	}
</script>
</div>