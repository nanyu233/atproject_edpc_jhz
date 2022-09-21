<div id="s1029">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">患者知情选择书兼授权书</label></div>
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
						<label id="id_5">住院号:</label>
						<input id="value_5" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_6">尊敬的患者及家属：</label>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_7">
							依照《中华人民共和国侵权责任法》（中华人民共和国主席令 第二十一号）第五十五条规定“医务人员在诊疗活动中应当向患者说明病情和医疗措施。
							需要实施手术、特殊检查、特殊治疗的，医务人员应当及时向患者说明医疗风险、替代医疗方案等情况，并取得其书面同意”。卫生部《病历书写基本规范》
							第十条规定“对需取得患者书面同意方可进行的医疗活动，应当由患者本人签署知情同意书，患者不具备民事行为能力时，应当由其法定代理人签字；患者
							因病无法签字时，应当由其授权的人员签字；为抢救患者，在法定代理人或授权人无法及时签字的情况下，可由医疗机构负责人或者授权的负责人签字。”为
							切实保障患者的知情同意权和实施保护性医疗措施，敬请你们根据自己的实际情况，慎重考虑，选择确定作为患者病情、医疗措施、医疗风险及替代医疗方案
							等的被告知者，并签署各项医疗活动同意书。
							</label>
						</div>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_8">${hospitalPlatformNameGap}</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_9">上述告知内容本人已充分了解，经慎重考虑，我确定：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<input type="checkbox" class="checkStyle1" id="checkbox_1"><label id="id_10" class="doctorType" for="checkbox_1">
								由本人作为病情、医疗措施、医疗风险及替代医疗方案等的被告知者，并签署各项医疗活动同意书。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<input type="checkbox" class="checkStyle1" id="checkbox_2"><label id="id_11" class="doctorType" for="checkbox_2">授权</label>
								<input type="text" id="value_6" class="input_txt" style="width: 100px;"/>
								<label id="id_12" class="doctorType" for="checkbox_2">作为病情、医疗措施、医疗风险及替代医疗方案等的告知者，并全权代表本人签署各项医疗活动同意书，被授权人的签字视同本人的签字。</label>
							</label>
						</div>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_13">患者签名：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_14">签名时间：</label>
						<input id="value_8" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_15">本人接受患者</label>
							<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
							<label id="id_16">的授权。同意代理行使该患者在医院医疗期间的知情同意权和选择权，并签署各项医疗活动同意书。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_17">被授权人签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_18">身份证号码：</label>
						<input id="value_11" type="text" class="input_txt"/>
						<label id="id_19">与患者关系：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_20">联系电话：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_21">签字时间：</label>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_22">现确认增加以下被授权人，至签字时间起，被授权人均可独立代理行使本人本次治疗期间的权利。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_23">患者签名：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_24">签名时间：</label>
						<input id="value_16" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_25">被授权人签名：</label>
						<input id="value_17" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_26">身份证号码：</label>
						<input id="value_18" type="text" class="input_txt"/>
						<label id="id_27">与患者关系：</label>
						<input id="value_19" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_28">联系电话：</label>
						<input id="value_20" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_29">签字时间：</label>
						<input id="value_21" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  	var value8 = document.getElementById("value_8").value;	
	  	if(value8 !=null&&value8!=""){
	  		var str = value8.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value8 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value8 = "___________";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value19 = document.getElementById("value_19").value;
	  	var value20 = document.getElementById("value_20").value;
	  	var value21 = document.getElementById("value_21").value;
	  	//8 14 16 21
	  	if(value10==null||value10==""){
			value10 = "___________";
	  	}
	  	if(value9==null||value9==""){
			value9 = "___________";
	  	}
			if(value11==null||value11==""){
				value11 = "___________";
	  	}
	  	if(value14!=null&&value14!=""){
	  		var str = value14.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value14 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value14 = "___________";
	  	}
	  	if(value12==null||value12==""){
			value12 = "___________";
	  	}
	  	if(value13==null||value13==""){
			value13 = "___________";
	  	}
	  	if(value17==null||value17==""){
				value17 = "___________";
	  	}
			if(value18==null||value18==""){
				value18 = "___________";
	  	}
			if(value19==null||value19==""){
				value19 = "___________";
	  	}
			if(value20==null||value20==""){
				value20 = "___________";
	  	}
	  	if(value15==null||value15==""){
			value15 = "___________";
	  	}
		if(value16!=null&&value16!=""){
	  		var str = value16.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value16 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value16 = "___________";
	  	}
			if(value21!=null&&value21!=""){
	  		var str = value21.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value21 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value21 = "___________";
	  	}
			var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;

			var checktext = '';

			if(checkbox_1){
				checktext= lab10
			}else{
				checktext= lab11+value6+lab12
			}


		
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div><br/>";
		text +=	"<div align='right' height='27'>"+lab8+"</div>";
		text += "<div style=\"text-indent: 0em\">"+lab9+"</div>";
		text += "<div style=\"text-indent: 2em\">"+checktext+"</div>";
		text +=	"<div align='right' height='27'>"+lab13+value7+" "+lab14+value8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+value9+lab16+"</div><br/>";
		text += "<div style=\"text-indent: 0em\">"+lab17+value10+" "+lab18+value11+" "+lab19+value12+"</div>";
		text += "<div style=\"text-indent: 0em\">"+lab20+value13+" "+lab21+value14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab22+"</div><br/>";
		text += "<div style=\"text-indent: 0em\">"+lab23+value15+" "+lab24+value16+"</div>";
		text += "<div style=\"text-indent: 0em\">"+lab25+value17+" "+lab26+value18+" "+lab27+value19+"</div>";
		text += "<div style=\"text-indent: 0em\">"+lab28+value20+" "+lab29+value21+"</div>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1029 :input').each(function () {
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
	    var texthtml=document.getElementById("s1029").innerHTML;
		texthtml="<div id='s1029'>"+texthtml+"</div>";
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