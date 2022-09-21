<div id="s1017">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">使用自费药物（检查）知情同意书</label></div>
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
					<td  colspan="5">
						<label id="id_6">费用类别：</label>
						<input type="checkbox" class="checkStyle1" id="checkbox_1"><label id="id_7" class="doctorType" for="checkbox_1" style="color: blue;">医保</label>
						&nbsp;
    					<input type="checkbox" class="checkStyle1" id="checkbox_2"><label id="id_8" class="doctorType" for="checkbox_2" style="color: blue;">其他商业保险</label>
    					&nbsp;
    					<input type="checkbox" class="checkStyle1" id="checkbox_3"><label id="id_9" class="doctorType" for="checkbox_3" style="color: blue;">自费</label>
    					&nbsp;
    					<input type="checkbox" class="checkStyle1" id="checkbox_4"><label id="id_10" class="doctorType" for="checkbox_4" style="color: blue;">其他</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_11">诊断：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 300px;"/>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_12">拟手术时间：</label>
						<input id="value_7" class="Wdate spcWdate" type="text" style="width: 165px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_13">自费药品名称：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 300px;"/>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_14">自费检查名称：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 300px;"/>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_15">生产厂家及供应商：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 300px;"/>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_16">药品产地：</label>
						1、<input type="checkbox" class="checkStyle1" id="checkbox_5"><label id="id_17" class="doctorType" for="checkbox_5" style="color: blue;">进口</label>
						&nbsp;
    					2、<input type="checkbox" class="checkStyle1" id="checkbox_6"><label id="id_18" class="doctorType" for="checkbox_6" style="color: blue;">国产</label>
    					&nbsp;
    					3、<input type="checkbox" class="checkStyle1" id="checkbox_7"><label id="id_19" class="doctorType" for="checkbox_7" style="color: blue;">合资</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_20">材质：</label>
						1、<input type="checkbox" class="checkStyle1" id="checkbox_8"><label id="id_21" class="doctorType" for="checkbox_8" style="color: blue;">钛合金</label>
						&nbsp;
    					2、<input type="checkbox" class="checkStyle1" id="checkbox_9"><label id="id_22" class="doctorType" for="checkbox_9" style="color: blue;">不锈钢</label>
    					&nbsp;
    					3、<input type="checkbox" class="checkStyle1" id="checkbox_10"><label id="id_23" class="doctorType" for="checkbox_10" style="color: blue;">其他</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_24">价格（估价）：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_25">元</label>
					</td>
				</tr>
				
				<tr>
					<td  colspan="5">
						<div style="text-indent: 2em">
						<label id="id_26">
						自愿选择以上进口产品，按规定购置进口产品的费用不属报销范围，须由患方自行负担，特此公告。
						</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="3">
						<label id="id_27">患方意见：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 200px;"/>
					</td>
					<td  align="right" colspan="2">
						<label id="id_28">签字：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_29">日期：</label>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_30">与患者关系：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 200px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_31">主管医生签字：</label>
						<input id="value_16" type="text" class="input_txt" style="width: 200px;"/>
					</td>
					<td align="right" colspan="2">
						<label id="id_32">日期：</label>
						<input id="value_17" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_33">科主任签字：</label>
						<input id="value_18" type="text" class="input_txt" style="width: 200px;"/>
					</td>
					<td align="right" colspan="2">
						<label id="id_34">日期：</label>
						<input id="value_19" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_35">材料标签：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_20" rows="6" cols="120"></textarea>
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
	  	if(value8==null||value8==""){
	  		value8 = "____________";
	  	}
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "____________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "____________";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
	  		value11 = "____________";
	  	}
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value19 = document.getElementById("value_19").value;
	  	var value20 = document.getElementById("value_20").value;
	  	if(value20==null||value20==""){
	  		value20 = "____________";
	  	}
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	var checkbox_3 = document.getElementById("checkbox_3").checked;
	  	var checkbox_4 = document.getElementById("checkbox_4").checked;
	  	var checkbox_5 = document.getElementById("checkbox_5").checked;
	  	var checkbox_6 = document.getElementById("checkbox_6").checked;
	  	var checkbox_7 = document.getElementById("checkbox_7").checked;
	  	var checkbox_8 = document.getElementById("checkbox_8").checked;
	  	var checkbox_9 = document.getElementById("checkbox_9").checked;
	  	var checkbox_10 = document.getElementById("checkbox_10").checked;
	  	//费用类别
	  	var lab_fylb = "";
	  	if(checkbox_1){
	  		lab_fylb += "<strong>"+lab7+"</strong>,";
	  	}
	  	if(checkbox_2){
	  		lab_fylb += "<strong>"+lab8+"</strong>,";
	  	}
	  	if(checkbox_3){
	  		lab_fylb += "<strong>"+lab9+"</strong>,";
	  	}
	  	if(checkbox_4){
	  		lab_fylb += "<strong>"+lab10+"</strong>,";
	  	}
	  	lab_fylb=replceLastDH(lab_fylb);
	  	
	  	//药品产地
	  	var lab_ypcd = "";
	  	if(checkbox_5){
	  		lab_ypcd += "<strong>"+lab17+"</strong>,";
	  	}
	  	if(checkbox_6){
	  		lab_ypcd += "<strong>"+lab18+"</strong>,";
	  	}
	  	if(checkbox_7){
	  		lab_ypcd += "<strong>"+lab19+"</strong>,";
	  	}
	  	lab_ypcd=replceLastDH(lab_ypcd);
	  	
	  	//材质
	  	var lab_cz = "";
	  	if(checkbox_8){
	  		lab_cz += "<strong>"+lab21+"</strong>,";
	  	}
	  	if(checkbox_9){
	  		lab_cz += "<strong>"+lab22+"</strong>,";
	  	}
	  	if(checkbox_10){
	  		lab_cz += "<strong>"+lab23+"</strong>,";
	  	}
	  	lab_cz=replceLastDH(lab_cz);
	  	
	  	if(value7!=null&&value7!=""){
	  		var str = value7.split(" ");
	  		var date = str[0].split("/");
	  		var time = str[1].split(":");
	  		value7 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value7 = "____________";
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
	  	if(value15==null||value15==""){
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
		if(value18==null||value18==""){
			value18 = "___________";
	  	}
		if(value19!=null&&value19!=""){
	  		var date = value19.split("/");
	  		value19 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value19 = "___________";
	  	}
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+lab_fylb+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"<strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+"<strong>"+value7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"<strong>"+value8+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"<strong>"+value9+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+"<strong>"+value10+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+lab_ypcd+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+lab_cz+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab24+"<strong>"+value11+"</strong>"+lab25+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab26+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td >"+lab27+value12+"</td><td align='right'>"+lab28+value13+"</td></tr>";
		text += "<tr align='right' height='27'><td colspan='2'>"+lab29+value14+"</td></tr>";
		text += "<tr height='27'><td colspan='2'>"+lab30+value15+"</td></tr>";
		text += "<tr height='27'><td >"+lab31+value16+"</td><td align='right'>"+lab32+value17+"</td></tr>";
		text += "<tr height='27'><td >"+lab33+value18+"</td><td align='right'>"+lab34+value19+"</td></tr>";
		text += "</table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab35+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value20+"</strong></div>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}	
	
	 //参数获取
	function getparam(){
		$('#s1017 :input').each(function () {
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
	    var texthtml=document.getElementById("s1017").innerHTML;
		texthtml="<div id='s1017'>"+texthtml+"</div>";
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