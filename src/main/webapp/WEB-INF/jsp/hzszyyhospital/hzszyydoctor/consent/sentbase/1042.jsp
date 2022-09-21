<div id="s1042">
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
					    <label id="id_6" style="font-weight: bold;">疾病介绍和治疗建议：</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_7">患者目前初步诊断</label><input id="value_7" type="text" class="input_txt jbzdDes" style="width: 300px;"/>
						<label id="id_8">，因病情需要，需要进行洗胃操作治疗。</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_26">询问病人是否有胃溃疡、消化道出血、严重心脏病、近期食管胃部手术病史。(</label>
						<input type="checkbox" class="checkStyle1" id="checkbox_1">
						<label id="id_27" class="doctorType" for="checkbox_1" style="color: blue;">有</label>
						<input type="checkbox" class="checkStyle1" id="checkbox_2">
						<label id="id_28" class="doctorType" for="checkbox_2" style="color: blue;">无</label>
						<label id="id_29">)</label>
					</div>
					<div style="text-indent: 0em">
					    <label id="id_9" style="font-weight: bold;">告知患者及家属在操作过程中可能潜在风险和对策：</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_10">医生告知患者在洗胃操作治疗过程，可能存在的风险及意外如下： </label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_11" style="text-indent: 2em">1.插管失败、胃内容物堵管；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_12" style="text-indent: 2em">2.喉头痉挛和水肿；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_13" style="text-indent: 2em">3.局部损伤、出血、牙齿损伤或脱落；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_14" style="text-indent: 2em">4.心跳呼吸骤停；农药或药物中毒随时出现死亡；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_15" style="text-indent: 2em">5.消化道出血、或胃肠穿孔；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_16" style="text-indent: 2em">6.胃内容物反流、误吸及窒息；</label><br/>
					</div>
					<div style="text-indent: 2em">
						<label id="id_17" style="text-indent: 2em">7.其他无法预料或不能防范的不良后果：</label><br/>
						<textarea id="value_17" style="width: 800px;height: 120px"></textarea><br/>
					</div>
						
					<div style="text-indent: 2em">
						<label id="id_18" style="font-weight: bold;">治疗操作过程中将有医护人员陪同，配备相应的抢救药品、物品，密切观察病情变化，及时处理，必要时可以中断检查或者立即抢救，但仍不能完全避免上述不良后果的发生。 </label><br/>
					</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_19">上述情况医生已经讲明，经过慎重考虑，我对上述可能出现的风险表示充分理解，同意该检查或治疗。</label><br/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="3"  align="left">
						<label id="id_20">谈话医生签字：</label>
						<input id="value_21" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="2" align="right">
						<label id="id_22">签名日期：</label>
						<input id="value_22" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="3" align="left">
						<label id="id_23">患者或家属签字：</label>
						<input id="value_23" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_24">关系：</label>
						<input id="value_24" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="2" align="right">
						<label id="id_25">签名日期：</label>
						<input id="value_25" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
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
		var lab22 = document.getElementById("id_22").innerText;
		var lab23 = document.getElementById("id_23").innerText;
		var lab24 = document.getElementById("id_24").innerText;
		var lab25 = document.getElementById("id_25").innerText;
		var lab26 = document.getElementById("id_26").innerText;
		var lab27 = document.getElementById("id_27").innerText;
		var lab28 = document.getElementById("id_28").innerText;
		var lab29 = document.getElementById("id_29").innerText;
		var checkbox1 = document.getElementById("checkbox_1").innerText;
		var checkbox2 = document.getElementById("checkbox_2").innerText;
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
	  	
	  	var checkbox1= document.getElementById("checkbox_1").checked;
		var checkbox2= document.getElementById("checkbox_2").checked;
	  	
	  	if(checkbox2){
			checkbox2 = 'checked';
		}	
	  	if(checkbox1){
			checkbox1 = 'checked';
		}	
	  	
	  	
	  	var value7 = document.getElementById("value_7").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value21 = document.getElementById("value_21").value;
	  	var value22 = document.getElementById("value_22").value;
	  	var value23 = document.getElementById("value_23").value;
	  	var value24 = document.getElementById("value_24").value;
	  	var value25 = document.getElementById("value_25").value;
	  	if(value7==null||value7==""){
	  		value7 = "___________";
	  	}
	  	if(value17 ==null||value17==""){
	  		value17 = "<br/><br/><br/>";
	  	}
	  	if(value21==null||value21==""){
	  		value21 = "___________";
	  	}
	  	if(value23==null||value23==""){
	  		value23 = "___________";
	  	}
	  	if(value24==null||value24==""){
	  		value24 = "___________";
	  	}
	  	if(value22!=null&&value22!=""){
	  		var dates=value22.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value22 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value22 = "____年___月___日___时___分";
	  	}
	  	if(value25!=null&&value25!=""){
	  		var dates=value25.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value25 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value25 = "____年___月___日___时___分";
	  	}
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+"<strong>"+lab6+"</strong>"+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+value7+lab8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab26+"<input type='checkbox' "+checkbox1+">"+lab27+"<input type='checkbox' "+checkbox2+">"+lab28+lab29+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab9+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab17+"<br/>"+value17+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\"><strong>"+lab18+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab19+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab20+value21+"&nbsp&nbsp"+dzqm+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab22+value22+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab23+value23+"  "+lab24+value24+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab25+value25+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1042 :input').each(function () {
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
	    var texthtml=document.getElementById("s1042").innerHTML;
		texthtml="<div id='s1042'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('洗胃操作知情同意书')
	})
</script>
</div>