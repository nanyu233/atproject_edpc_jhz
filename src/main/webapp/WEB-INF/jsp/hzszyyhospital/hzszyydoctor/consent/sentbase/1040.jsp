<div id="s1040">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicZqty.jsp"></jsp:include>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr>
					<td style="width: 25%">
						<label id="id_1">患者姓名:</label>
						<input type="text" class="input_txt cstNam" style="width: 100px;"/>
					</td>
					<td style="width: 15%">
						<label id="id_2">性别:</label>
						<input type="text" class="input_txt cstSexCod" style="width: 40px;"/>
					</td>
					<td style="width: 16%">
						<label id="id_3">年龄:</label>
						<input type="text" class="input_txt age" style="width: 40px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">科室:</label>
						<input type="text" class="input_txt emgFkCod" style="width: 100px;"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">病历号:</label>
						<input type="text" class="input_txt mpi" style="width: 96px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
					<div style="text-indent: 0em">
						<label id="id_6" style="font-weight: bold;">其他</label>
						<label id="id_7">尊敬的患者及家属：</label><br/>
					</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_8">依照《中华人民共和国侵权责任法》（中华人民共和国主席令 第二十一号）第五十五条规定“医务人员在诊疗活动中应当向患者说明病情和医疗措施。需要实施手术、特殊检查、特殊治疗的，医务人员应当及时向患者说明医疗风险、替代医疗方案等情况，并取得其书面同意”。卫生部《病历书写基本规范》第十条规定“对需取得患者书面同意方可进行的医疗活动，应当由患者本人签署知情同意书。患者不具备完全民事行为能力时，应当由其法定代理人签字；患者因病无法签字时，应当由其授权的人员签字；为抢救患者，在法定代理人或被授权人无法及时签字的情况下，可由医疗机构负责人或者授权的负责人签字。”为切实保障患者的知情同意权和实施保护性医疗措施，敬请你们根据自己的实际情况，慎重考虑，选择确定作为患者病情、医疗措施、医疗风险及替代医疗方案等的被告知者，并签署各项医疗活动同意书。 </label><br/>
						</div>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_9">医院名称:</label>
						<input id="value_9" type="text" class="input_txt" style="width: 120px;"/>		
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_10" style="text-decoration: line-through;width: 1020px"></label>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_11">上述告知内容本人已充分了解，经慎重考虑，我确定：</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_12">由本人作为病情、医疗措施、医疗风险及替代医疗方案等的被告知者，并签署各项医疗活动同意书。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_13">授权</label>
							<input id="value_13" type="text" class="input_txt" style="width: 120px;"/>		
							<label id="id_14">作为病情、医疗措施、医疗风险及替代医疗方案等的被告知者，并全权代表本人签署各项医疗活动同意书，被授	权人的签字视同本人的签字。</label>
						</div>
					</td>
				</tr>
				
				<tr align="right">
					<td colspan="5">
						<label id="id_15">患者签名：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_16">签字日期：</label>
						<input id="value_16" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>		
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_17">本人接受患者的授权，同意代理行使该患者在医院医疗期间的知情同意权和选择权，并签署各项医疗活动同意书。</label>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_18">被授权人签名：</label>
							<input id="value_18" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_19">联系电话：</label>
							<input id="value_19" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_20">与患者关系</label>
							<input id="value_20" type="text" class="input_txt" style="width: 120px;"/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_21">身份证号码：</label>
							<input id="value_21" type="text" class="input_txt" style="width: 200px;"/>
							<input id="value_22" style="float: right;" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							<label id="id_22" style="float: right;">签字时间：</label>
						</div>
					</td>		
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_23">现确认增加以下被授权人，至签字时间起，被授权人均可独立代理行使本人本次治疗期间的权利。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_24">患者签名：</label>
							<input id="value_24" type="text" class="input_txt" style="width: 120px;"/>
							<input id="value_25" style="float: right;" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							<label id="id_25" style="float: right;">签字时间：</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_26">被授权人签名：</label>
							<input id="value_26" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_27">联系电话：</label>
							<input id="value_27" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_28">与患者关系：</label>
							<input id="value_28" type="text" class="input_txt" style="width: 120px;"/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_29">身份证号码：</label>
							<input id="value_29" type="text" class="input_txt" style="width: 200px;"/>
							<input id="value_30" style="float: right;" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							<label id="id_30" style="float: right;">签字时间：</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_43">患者签名：</label>
							<input id="value_43" type="text" class="input_txt" style="width: 120px;"/>
							<input id="value_44" style="float: right;" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							<label id="id_44" style="float: right;">签字时间：</label><br/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_31">被授权人签名：</label>
							<input id="value_31" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_32">联系电话：</label>
							<input id="value_32" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_33">与患者关系：</label>
							<input id="value_33" type="text" class="input_txt" style="width: 120px;"/>
						</div>
						<div style="text-indent: 2em">
							<label id="id_34">身份证号码：</label>
							<input id="value_34" type="text" class="input_txt" style="width: 200px;"/>
							<input id="value_35" style="float: right;" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							<label id="id_35" style="float: right;">签字时间：</label>
						</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_42" style="text-decoration: underline;width: 1020px"></label>
						</div>
					</td>		
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 0em">
							<label id="id_36">未成年人、无完全民事行为能力的成年患者，由其法定代理人代为行使上述权利。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_37">代理人签名：</label>
							<input id="value_37" type="text" class="input_txt" style="width: 120px;"/>
							<input id="value_38" type="text" class="input_txt" style="width: 200px;float: right;"/>
							<label id="id_38" style="float: right;">身份证号码：</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_39">与患者关系：</label>
							<input id="value_39" type="text" class="input_txt" style="width: 120px;"/>
							<label id="id_40">联系电话：</label>
							<input id="value_40" type="text" class="input_txt" style="width: 120px;"/>
							<input id="value_41" style="float: right;" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
							<label id="id_41" style="float: right;">签字时间：</label>
						</div>
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
		var lab30 = document.getElementById("id_30").innerText;
		var lab31 = document.getElementById("id_31").innerText;
		var lab32 = document.getElementById("id_32").innerText;
		var lab33 = document.getElementById("id_33").innerText;
		var lab34 = document.getElementById("id_34").innerText;
		var lab35 = document.getElementById("id_35").innerText;
		var lab36 = document.getElementById("id_36").innerText;
		var lab37 = document.getElementById("id_37").innerText;
		var lab38 = document.getElementById("id_38").innerText;
		var lab39 = document.getElementById("id_39").innerText;
		var lab40 = document.getElementById("id_40").innerText;
		var lab41 = document.getElementById("id_41").innerText;
		var lab43 = document.getElementById("id_43").innerText;
		var lab44 = document.getElementById("id_44").innerText;
	
		var value1 = $('.cstNam').val();	
		if(value1==null||value1==""){
	  		value1 = "_______";
	  	}
	  	var value2 = $('.cstSexCod').val();
	  	if(value2==null||value2==""){
	  		value2 = "_____";
	  	}
	  	var value3 = $('.age').val();
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = $('.emgFkCod').val();
	  	if(value4==null||value4==""){
	  		value4 = "_____";
	  	}
	  	var value5 = $('.mpi').val();
	  	if(value5==null||value5==""){
	  		value5 = "_______";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13==null||value13==""){
	  		value13 = "___________";
	  	}
	  	var value15 = document.getElementById("value_15").value;
	  	if(value15==null||value15==""){
	  		value15 = "___________";
	  	}
	  	var value16 = document.getElementById("value_16").value;
	  	if(value16!=null&&value16!=""&&value16!="精确到分"){
			 var dates=value16.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value16 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value16 = "____年____月____日____时____分";
		}
	  	var value18 = document.getElementById("value_18").value;
	  	if(value18==null||value18==""){
	  		value18 = "___________";
	  	}
	  	var value19 = document.getElementById("value_19").value;
	  	if(value19==null||value19==""){
	  		value19 = "___________";
	  	}
	  	var value20 = document.getElementById("value_20").value;
	  	if(value20==null||value20==""){
	  		value20 = "___________";
	  	}
	  	var value21 = document.getElementById("value_21").value;
	  	if(value21==null||value21==""){
	  		value21 = "___________";
	  	}
	  	var value22 = document.getElementById("value_22").value;
	  	if(value22!=null&&value22!=""){
	  		var date = value22.split("/");
	  		value22 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value22 = "____年____月____日";
	  	}
	  	var value24 = document.getElementById("value_24").value;
	  	if(value24==null||value24==""){
	  		value24 = "___________";
	  	}
	  	var value25 = document.getElementById("value_25").value;
	  	if(value25!=null&&value25!=""){
	  		var date = value25.split("/");
	  		value25 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value25 = "____年____月____日";
	  	}
	  	var value26 = document.getElementById("value_26").value;
	  	if(value26==null||value26==""){
	  		value26 = "___________";
	  	}
	  	var value27 = document.getElementById("value_27").value;
	  	if(value27==null||value27==""){
	  		value27 = "___________";
	  	}
	  	var value28 = document.getElementById("value_28").value;
	  	if(value28==null||value28==""){
	  		value28 = "___________";
	  	}
	  	var value29 = document.getElementById("value_29").value;
	  	if(value29==null||value29==""){
	  		value29 = "___________";
	  	}
	  	var value30 = document.getElementById("value_30").value;
	  	if(value30!=null&&value30!=""){
	  		var date = value30.split("/");
	  		value30 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value30 = "____年____月____日";
	  	}
	  	var value31 = document.getElementById("value_31").value;
	  	if(value31==null||value31==""){
	  		value31 = "___________";
	  	}
	  	var value32 = document.getElementById("value_32").value;
	  	if(value32==null||value32==""){
	  		value32 = "___________";
	  	}
	  	var value33 = document.getElementById("value_33").value;
	  	if(value33==null||value33==""){
	  		value33 = "___________";
	  	}
	  	var value34 = document.getElementById("value_34").value;
	  	if(value34==null||value34==""){
	  		value34 = "___________";
	  	}
	  	var value35 = document.getElementById("value_35").value;
	  	if(value35!=null&&value35!=""){
	  		var date = value35.split("/");
	  		value35 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value35 = "____年____月____日";
	  	}
	  	var value37 = document.getElementById("value_37").value;
	  	if(value37==null||value37==""){
	  		value37 = "___________";
	  	}
	  	var value38 = document.getElementById("value_38").value;
	  	if(value38==null||value38==""){
	  		value38 = "___________";
	  	}
	  	var value39 = document.getElementById("value_39").value;
	  	if(value39==null||value39==""){
	  		value39 = "___________";
	  	}
	  	var value40 = document.getElementById("value_40").value;
	  	if(value40==null||value40==""){
	  		value40 = "___________";
	  	}
	  	var value41 = document.getElementById("value_41").value;
	  	if(value41!=null&&value41!=""){
	  		var date = value41.split("/");
	  		value41 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value41 = "____年____月____日";
	  	}
	  	var value43 = document.getElementById("value_43").value;
	  	if(value43==null||value43==""){
	  		value43 = "___________";
	  	}
	  	var value44 = document.getElementById("value_44").value;
	  	if(value44!=null&&value44!=""){
	  		var date = value44.split("/");
	  		value44 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value44 = "____年____月____日";
	  	}
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab6+"</strong>"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab8+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab9+value9+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+value13+lab14+"</div>";
		text += "<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab15+value15+lab16+value16+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab18+value18+lab19+value19+lab20+value20+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab21+value21+"<lable style=\"float:right;\">"+lab22+"</label>"+"<lable style=\"float:right;\">"+value22+"</label>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab23+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab24+value24+"<lable style=\"float:right;\">"+lab25+"</label>"+"<lable style=\"float:right;\">"+value25+"</label>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab26+value26+lab27+value27+lab28+value28+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab29+value29+"<lable style=\"float:right;\">"+lab30+"</label>"+"<lable style=\"float:right;\">"+value30+"</label>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab43+value43+"<lable style=\"float:right;\">"+lab44+"</label>"+"<lable style=\"float:right;\">"+value44+"</label>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab31+value31+lab32+value32+lab33+value33+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab34+value34+"<lable style=\"float:right;\">"+lab35+"</label>"+"<lable style=\"float:right;\">"+value35+"</label>"+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab36+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab37+value37+"<lable style=\"float:right;\">"+lab38+"</label>"+"<lable style=\"float:right;\">"+value38+"</label>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab39+value39+lab40+value40+"<lable style=\"float:right;\">"+lab41+"</label>"+"<lable style=\"float:right;\">"+value41+"</label>"+"</div>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1040 :input').each(function () {
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
	    var texthtml=document.getElementById("s1040").innerHTML;
		texthtml="<div id='s1040'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('授权书')
	})
</script>
</div>