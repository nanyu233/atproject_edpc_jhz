<div id="s1018">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">输血治疗同意书</label></div>
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
					<td colspan="2">
						<label id="id_6">输血目的：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 180px;"/>
					</td>
					<td colspan="2">
						<label id="id_7">输血史：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 200px;" value="不详"  onFocus="onFocusShow(this.id,'不详')" onblur="onBlurShow(this.id,'不详')"/>
					</td>
					<td>
						<label id="id_8">孕怀孕次数次：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<label id="id_9">输血成分：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 180px;"/>
					</td>
					<td colspan="3">
						<label id="id_10">临床诊断：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 390px;"/>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td  colspan="5">
						<label id="id_11">输血治疗包括输全血、成分血，是临床治疗的重要措施之一，是临床抢救急危重患者生命行之有效的手段</label>
						<br/>
						<div style="text-indent: 2em">
							<label id="id_12">但是输血存在一定的风险，可能发生输血反应及感染经血传播病。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_13">
							虽然我院使用的血液，均已按照卫生部有关规定进行检测，但由于当前科技水平的限制，输血仍有某些不能预测或者不能防止的输血反应和输血传染病。输血时可能发生的主要状况如下。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						1、<input type="checkbox" class="checkStyle1" id="checkbox_1">
						<label id="id_14" class="doctorType" for="checkbox_1" style="color: blue;">过敏反应</label>
					</td>
					<td colspan="3">
						2、<input type="checkbox" class="checkStyle1" id="checkbox_2">
						<label id="id_15" class="doctorType" for="checkbox_2" style="color: blue;">发热反应</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						3、<input type="checkbox" class="checkStyle1" id="checkbox_3">
						<label id="id_16" class="doctorType" for="checkbox_3" style="color: blue;">感染肝炎（乙肝、丙肝等）</label>
					</td>
					<td colspan="3">
						4、<input type="checkbox" class="checkStyle1" id="checkbox_4">
						<label id="id_17" class="doctorType" for="checkbox_4" style="color: blue;">感染艾滋病、梅毒</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						5、<input type="checkbox" class="checkStyle1" id="checkbox_5">
						<label id="id_18" class="doctorType" for="checkbox_5" style="color: blue;">感染疟疾</label>
					</td>
					<td colspan="3">
						6、<input type="checkbox" class="checkStyle1" id="checkbox_6">
						<label id="id_19" class="doctorType" for="checkbox_6" style="color: blue;">巨细胞病毒或EB病毒感染</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						7、<input type="checkbox" class="checkStyle1" id="checkbox_7">
						<label id="id_20" class="doctorType" for="checkbox_7" style="color: blue;">引起的其他疾病</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td  colspan="5">
						<div style="text-indent: 2em">
						<label id="id_21">根据病情变化，可能需要多次或反复输血</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_22" class="labtitle">在您及家属或监护人了解了上述可能发生的情况后，如同意输血治疗，请在下面签字。</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="5" align="right">
						<label id="id_23">受血者（家属/监护人）签字：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label id="id_24">医师签字：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 100px;"/>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_25">备注：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_15" rows="6" cols="120"></textarea>
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
	  		value6 = "_______";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "_______";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "_______";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "_______";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "_______";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	if(value15==null||value15==""){
	  		value15 = "_______";
	  	}
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	var checkbox_3 = document.getElementById("checkbox_3").checked;
	  	var checkbox_4 = document.getElementById("checkbox_4").checked;
	  	var checkbox_5 = document.getElementById("checkbox_5").checked;
	  	var checkbox_6 = document.getElementById("checkbox_6").checked;
	  	var checkbox_7 = document.getElementById("checkbox_7").checked;
	
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
	  	if(checkbox_6){
	  		lab_str += "<strong>"+lab19+"</strong>,";
	  	}
	  	if(checkbox_7){
	  		lab_str += "<strong>"+lab20+"</strong>,";
	  	}
	  	lab_str=replceLastDH(lab_str);
	
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
	
	  	var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0'>";
		text += "<tr height='27'><td>"+lab6+"<strong>"+value6+"</strong></td><td>"+lab7+"<strong>"+value7+"</strong></td><td>"+lab8+"<strong>"+value8+"</strong></td></tr/>";
		text += "<tr height='27'><td>"+lab9+"<strong>"+value9+"</strong></td><td>"+lab10+"<strong>"+value10+"</strong></td></tr/>";
		text += "</table><br/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab_str+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab21+"</div>";
		text +=	"<div style=\"text-indent: 2em\"><strong>"+lab22+"</strong></div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab23+value11+" 日期："+value12+"</td></tr>";
		text += "<tr align='right' height='27'><td>"+lab24+value13+" 日期："+value14+"</td></tr>";
		text += "</table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value15+"</strong></div>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	
	 //参数获取
	function getparam(){
		$('#s1018 :input').each(function () {
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
	    var texthtml=document.getElementById("s1018").innerHTML;
		texthtml="<div id='s1018'>"+texthtml+"</div>";
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
        	   $("#value_10").val(data.resultInfo.sysdata.hspemginfCustom.jbzdDes);
           }
       })
	}
</script>
</div>