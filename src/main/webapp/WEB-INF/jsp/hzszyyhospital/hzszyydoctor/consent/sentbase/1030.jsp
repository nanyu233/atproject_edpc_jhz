<div id="s1030">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">知情选择书</label></div>
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
						<input id="value_5" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6">尊敬的患者及家属：</label>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_7">
							依照国务院令第351号的规定：“在医疗活动中，医疗机构及其医务人员应当将患者的病情、医疗措施、医疗风险等如实告知患者，及时解答其咨询；但是，应当避免对患者产生不利后果”；卫生部《病历书写基本规范（试行）》第十条规定：“对按照有关规定需取得患者书面同意方可进行的医疗活动（如特殊检查、特殊治疗、手术、实验性临床医疗等），应当由患者本人签署同意书，患者不具备完全民事行为能力时，应当由其法定代理人签字；患者因病无法签字时，应当由其近亲属签字，没有近亲属的，由其关系人签字；为抢救患者，在法定代理人或近亲属、关系人无法及时签字的情况下，可收医疗机构负责人或者被授权负责人签字”。为切实履行患者的知情同意权和实施保护性医疗措施，敬请你们根据自己的实际情况，慎重考虑，选择确定作为患者病情、医疗措施、医疗风险等到的被告知者，并签署各项医疗活动同意书。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_8">
							在下列知情选择书中只能选择一种方式并签字注明。
							</label>
						</div>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_9">${hospitalPlatformName}</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="5">
						<label id="id_10">知情选择书</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_11">
							上述告知书内容本人已充分了解，经慎重考虑，我选择本人作为在该院医疗期间的病情、医疗措施、医疗风险等的被告知者，并签署各项医疗活动同意书。
							</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_12">患者签名：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_13">签名日期：</label>
						<input id="value_7" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_14">
							上述告知书内容本人已充分了解，为有利于本人的疾病诊治和康复，我选择以授权方式行使本人在医疗期间的知情同意权和选择权。
							</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_15">患者签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_16">签名日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	
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
		
	  	var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab9+"</td></tr></table><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab12+value6+" "+lab13+value7+"</td></tr></table><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab15+value8+" "+lab16+value9+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1030 :input').each(function () {
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
	    var texthtml=document.getElementById("s1030").innerHTML;
		texthtml="<div id='s1030'>"+texthtml+"</div>";
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