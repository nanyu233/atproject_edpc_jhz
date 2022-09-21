<div id="s1025">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">镇静操作知情同意书</label></div>
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
						<label id="id_6">诊断：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 700px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7">要求：</label><br/>
						<label id="id_8">
						1 该知情同意书必须由具有${hospitalPlatformName}镇静权限的医生执行。
						</label><br/>
						<label id="id_9">
						2 每一项必须填写完整。
						</label><br/>
						<label id="id_10">
						3 该知情同意书必须在术前或操作前完成并置于病人病历中。
						</label><br/>
						<label id="id_11">内容：</label><br/>
						<label id="id_12">
						1 拟施手术或操作名称（根据情况标明左右侧）：
						</label><br/>
						<textarea id="value_7" rows="6" cols="120"></textarea>
						<br/>
						<label id="id_13">
						2 麻醉或镇静方案
						</label><br/>
						<input type="checkbox" class="checkStyle1" id="checkbox_1">
						<label id="id_14" class="doctorType" for="checkbox_1" style="color: blue;">丙泊酚</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_2">
						<label id="id_15" class="doctorType" for="checkbox_2" style="color: blue;">芬太尼</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_3">
						<label id="id_16" class="doctorType" for="checkbox_3" style="color: blue;">咪唑安定</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_4">
						<label id="id_17" class="doctorType" for="checkbox_4" style="color: blue;">阿托品</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_5">
						<label id="id_18" class="doctorType" for="checkbox_5" style="color: blue;">其他</label>
						<br/>
						<label id="id_19">
						3 该手术或操作及镇静的风险、利弊及常见并发症已告知病人和/或家属，具体如下：
						</label><br/>
						<label id="id_20">
						3.1 呼吸抑制，呼吸暂停
						</label><br/>
						<label id="id_21">
						3.2 低血压，心率失常，心脏骤停
						</label><br/>
						<label id="id_22">
						3.3 昏迷
						</label><br/>
						<label id="id_23">
						3.4 药物过敏
						</label><br/>
						<label id="id_24">
						3.5 其它不可预知的镇静意外。
						</label><br/>
						<label id="id_25">
						4 其他可供选择的治疗方案已告知病人和/或家属，他们对此表示充分理解。这些方法包括：
						</label><br/>
						<label id="id_26">
						4.1 普通胃肠镜检查；
						</label><br/>
						<label id="id_27">
						4.2 X线及其他影像学检查；
						</label><br/>
						<label id="id_28">
						4.3 其他。
						</label><br/>
						<label id="id_29">
						在镇静效果不理想或其他紧急情况下，操作医生有权从病人利益出发临时更改镇静方案。但病人或家属有权事先申明拒绝接受临时更改镇静方案，申明人签字：
						</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_30">与病人关系：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<br/>
						<label id="id_31">
						6 以下签字表示承认：
						</label>
						<label id="id_32">
						6.1 医生已向您做了充分解释，包括所选方案的优点、缺点、危险性及可能的其他方案和优缺点、危险性；
						</label>
						<label id="id_33">
						6.2 您的有关该手术或操作及镇静方面的疑问得到了适当的回答；
						</label>
						<label id="id_34">
						6.3 您对上述内容表示充分理解，并要求接受镇静操作。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_35">签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_36">日期：</label>
						<input id="value_11" class="Wdate spcWdate" type="text" style="width: 185px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_37">(</label>
						<input type="radio" name="radio1" class="radioStyle" id="radio_1" value="患者本人"><label style="color: blue;">患者本人</label>
						&nbsp;
    					<input type="radio" name="radio1" class="radioStyle" id="radio_2" value="配偶"><label style="color: blue;">配偶</label>
    					&nbsp;
    					<input type="radio" name="radio1" class="radioStyle" id="radio_3" value="子女"><label style="color: blue;">子女</label>
    					&nbsp;
    					<input type="radio" name="radio1" class="radioStyle" id="radio_4" value="父母"><label style="color: blue;">父母</label>
    					&nbsp;
    					<input type="radio" name="radio1" class="radioStyle" id="radio_5" value="其他近亲属同事"><label style="color: blue;">其他近亲属同事</label>
    					&nbsp;
    					<input type="radio" name="radio1" class="radioStyle" id="radio_6" value="朋友"><label style="color: blue;">朋友</label>
    					&nbsp;
    					<input type="radio" name="radio1" class="radioStyle" id="radio_7" value="其他"><label style="color: blue;">其他</label>
    					<label id="id_38">)</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_39">谈话医生：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 100px;"/>
					</td>
					<td colspan="3" align="right">
						<label id="id_40">日期：</label>
						<input id="value_13" class="Wdate spcWdate" type="text" style="width: 185px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	var checkbox_3 = document.getElementById("checkbox_3").checked;
	  	var checkbox_4 = document.getElementById("checkbox_4").checked;
	  	var checkbox_5 = document.getElementById("checkbox_5").checked;
	
	  	var lab_str = "";
	  	if(checkbox_1){
	  		lab_str += "<strong>"+lab14+"</strong>,";
	  	}
	  	if(checkbox_2){
	  		lab_str += "<strong>"+lab15+"</strong>,";
	  	}
	  	if(checkbox_3){
	  		lab_str += "<strong>"+lab16+"</strong>,";
	  	}
	  	if(checkbox_4){
	  		lab_str += "<strong>"+lab17+"</strong>,";
	  	}
	  	if(checkbox_5){
	  		lab_str += "<strong>"+lab18+"</strong>,";
	  	}
	  	lab_str=replceLastDH(lab_str);
	  	
	  	var radio1 = "___________";
	  	var radio = document.getElementsByName("radio1");  
		for (var i=0; i<radio.length; i++) {  
			if (radio[i].checked) {  
				radio1 = radio[i].value;
			}  
		}
		
		if(value8==null||value8==""){
	  		value8 = "___________";
	  	}
		if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	
	  	if(value10==null||value10==""){
	  		value10 = "___________";
	  	}
	  	if(value11!=null&&value11!=""){
	  		var str = value11.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value11 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value11 = "___________";
	  	}
	  	
		if(value12==null||value12==""){
	  		value12 = "___________";
	  	}
		if(value13!=null&&value13!=""){
	  		var str = value13.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value13 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value13 = "___________";
	  	}
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"<strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab_str+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab21+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab23+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab24+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab26+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"<strong>"+value8+"</strong> "+lab30+"<strong>"+value9+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab31+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab32+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab33+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab34+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab35+value10+"</td><td align='right'>"+lab36+value11+"</td></tr>";
		text +=	"<tr height='27'><td colspan='2'>"+lab37+radio1+lab38+"</td></tr>";
		text +=	"<tr height='27'><td>"+lab39+value12+"</td><td align='right'>"+lab40+value13+"</td></tr>";
		text +=	"</table></div>";
		$("#content").val(text);
		return true;
	}

	 //参数获取
	function getparam(){
		$('#s1025 :input').each(function () {
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
	    var texthtml=document.getElementById("s1025").innerHTML;
		texthtml="<div id='s1025'>"+texthtml+"</div>";
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