<div id="s1051">
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
					<div style="text-indent: 2em">
					    <label id="id_6">患者由于下述原因，需要进行镇痛镇静治疗来消除或减轻疼痛不适，配合治疗，降低氧耗，改善患者预后。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_7">1、自身疾病严重，存在疼痛、不适；</label>
					</div>
					<div style="text-indent: 2em">
					    <label id="id_10"> 2、术后切口疼痛不适；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_11"> 3、有创操作所致疼痛不适；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_12"> 4、环境影响；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_13"> 5、情绪焦虑，存在躁动、恐惧；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_14"> 6、其它：</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_15">镇痛镇静治疗可能出现下述不良反应：1.呼吸抑制；2.血流动力学影响； 3.引起幻觉、躁动甚至谵妄等精神症状；4.胃肠道反应；5.血糖、血脂等代谢异常；6.丙泊酚输注综合征；7.肾功能损伤；8.其他风险如凝血功能紊乱、免疫力下降等。</label><br/><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_16">镇痛镇静治疗过程中医护人员将密切监测患者呼吸、循环、神经肌肉、胃肠道功能、肾功能、凝血功能等，一旦出现上述不良反应，立即予以处理，但仍可能出现不可逆的严重后果。 </label><br/><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_17">家属（监护人）意见：我已详细了解上述内容，表示理解，经慎重考虑，对于镇痛镇静治疗签署意见：同意 / 不同意</label><br/>
					</div>
						
					</td>
				</tr>
				
				<tr>
					<td colspan="3" align="left">
						<label id="id_31"> 家属（监护人）签名：</label>
						<input id="value_31" type="text" class="input_txt" style="width: 120px;"/>		
					</td>
					<td colspan="2" align="right">
						<label id="id_32"> 医生签名：</label>
						<input id="value_32" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
				</tr>
				<tr>
					<td colspan="3" align="left">
						<label id="id_33">关系：</label>
						<input id="value_33" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="2" align="right">
						<label id="id_34">签署时间：</label>
						<input id="value_34" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				<tr>
					<td colspan="5" align="left">
						<div style="text-indent: 0em">
					    	<label id="id_35"> 签署时间:</label>
							<input id="value_35" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
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
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab31 = document.getElementById("id_31").innerText;
		var lab32 = document.getElementById("id_32").innerText;
		var lab33 = document.getElementById("id_33").innerText;
		var lab34 = document.getElementById("id_34").innerText;
		var lab35 = document.getElementById("id_35").innerText;
		var dzqm = document.getElementById("dzqm").innerHTML;
		
		
		
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
	  	var value31 = document.getElementById("value_31").value;
	  	var value32 = document.getElementById("value_32").value;
	  	var value33 = document.getElementById("value_33").value;
	  	var value34 = document.getElementById("value_34").value;
	  	var value35 = document.getElementById("value_35").value;
	  	if(value31==null||value31==""){
	  		value31 = "_________";
	  	}
	  	if(value32==null||value32==""){
	  		value32 = "_________";
	  	}
	  	if(value34!=null&&value34!=""){
	  		var dates=value34.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value34 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value34 = "____年___月___日___时___分";
	  	}
	  	if(value33=null||value33==""){
	  		value33 = "_________";
	  	}
	  	if(value35!=null&&value35!=""){
	  		var dates=value35.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value35 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value35 = "____年___月___日___时___分";
	  	}
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 2em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab31+value31+"</td><td align='right'>"+lab32+value32+"&nbsp&nbsp"+dzqm+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab33+value33+"</td><td align='right'>"+lab34+value34+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab35+value35+"</div>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1051 :input').each(function () {
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
	    var texthtml=document.getElementById("s1051").innerHTML;
		texthtml="<div id='s1051'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('镇痛镇静谈话记录')
	})
</script>
</div>