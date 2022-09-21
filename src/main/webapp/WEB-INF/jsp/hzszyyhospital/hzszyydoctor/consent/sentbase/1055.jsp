<div id="s1055">
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
						<label id="id_6" style="font-weight: bold;">输血及血液制品目的：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 250px;"/>	<br/>
						<label id="id_7" style="font-weight: bold;">输血史：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 150px;"/>
						<label id="id_8">&nbsp;&nbsp;&nbsp;&nbsp;孕：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 150px;"/>
						<label id="id_9">&nbsp;&nbsp;&nbsp;&nbsp;产：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 150px;"/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_10">输血成分：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 150px;"/>
						<label id="id_11">临床诊断：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 250px;"/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_12" style="font-weight: bold;">输血方式：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 250px;"/>
					</div>
					<div style="text-indent: 0em">
						<label id="id_13" style="font-weight: bold;">血液制品种类：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 250px;"/>
					</div>
					</td>
				</tr>
				
				
				<tr>
					<td colspan="5" align="left">
						<div style="text-indent: 0em">
							<label id="id_14" style="font-weight: bold;">输血前检查：</label>
						</div>
						<div style="text-indent: 0em">
							<label id="id_15">ALT：</label>
							<input id="value_15" type="text" class="input_txt" style="width: 80px;"/>
							<label id="id_16">u/L</label>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_17">HBsAg：</label>
							<input id="value_17" type="text" class="input_txt" style="width: 150px;"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_18">Anti-HBs：</label>
							<input id="value_18" type="text" class="input_txt" style="width: 150px;"/>
						</div>
						<div style="text-indent: 0em">
							<label id="id_19">HBeAg：</label>
							<input id="value_19" type="text" class="input_txt" style="width: 80px;"/>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_20">Anti-HBc：</label>
							<input id="value_20" type="text" class="input_txt" style="width: 150px;"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_21">Anti-HCV：</label>
							<input id="value_21" type="text" class="input_txt" style="width: 150px;"/>
						</div>
						<div style="text-indent: 0em">
							<label id="id_22">Anti-HIV1/2：</label>
							<input id="value_22" type="text" class="input_txt" style="width: 80px;"/>
							&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_23">梅毒：</label>
							<input id="value_23" type="text" class="input_txt" style="width: 150px;"/>&nbsp;&nbsp;&nbsp;&nbsp;
							<label id="id_24">Anti-HBe：</label>
							<input id="value_24" type="text" class="input_txt" style="width: 150px;"/>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_25">
								输血及血液制品治疗包括输全血、成分血，血液制品是临床治疗的重要措施之一，是临床抢救急、危重患者生命行之有效的手段，但输血及血液制品存在一定风险，可能发生输血反应及感染经血传播疾病。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_26">
								虽然我院使用的血液及血液制品均已按卫生部有关规定进行检测，但由于当前科技水平的限制，输血及血液制品仍有某些不能预测或不能防止的输血反应和输血传染病。输血及血液制品时可能发生的主要情况如下：
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<ul>
							<li>
								<label class="checklabel" id="ch1">
									<input type="checkbox" id="ch11">1.过敏反应
								</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="checklabel" id="ch2">
									<input type="checkbox" id="ch12">2.感染肝炎（乙肝、丙肝等）
								</label>
							</li>
							<li>
								<label class="checklabel" id="ch3">
									<input type="checkbox" id="ch13">3.发热反应
								</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="checklabel" id="ch4">
									<input type="checkbox" id="ch14">4.感染艾滋病、梅毒
								</label>
							</li>
							<li>
								<label class="checklabel" id="ch5">
									<input type="checkbox" id="ch15">5.感染疟疾
								</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<label class="checklabel" id="ch6">
									<input type="checkbox" id="ch16">6.巨细胞病毒或EB病毒感染
								</label>
							</li>
							<li>
								<label class="checklabel" id="ch7">
									<input type="checkbox" id="ch17">7.输血引起的其他疾病
								</label>
							</li>
						</ul>
						<div style="text-indent: 2em">
							<label id="id_27">
								在您或被授权人了解上述可能发生的情况后，如果同意输血治疗，请在下面签字。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div>
							<label>受血者（或被授权人）签字:</label>
							<input id="value_24" type="text" class="input_txt" style="width: 150px;"/>
						</div>
					</td>
					<td align="right" colspan="1">
						<div>
							<label>日期：<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div>
							<label>被授权人与患者关系：</label>
							<input id="value_24" type="text" class="input_txt" style="width: 150px;"/>
						</div>
					</td>
					<td align="right" colspan="1">
						<div>
							<label>日期：<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<div>
							<label>医师签字：</label>
							<input id="value_24" type="text" class="input_txt" style="width: 150px;"/>
							<span class="spanRelative" id="dzqm"></span>
						</div>
					</td>
					<td align="right" colspan="1">
						<div>
							<label>日期：<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div>
							<label>备注： </label><input id="value_24" type="text" class="input_txt" style="width: 150px;"/>
						</div>
						<div>
							<label>[备注:]因病情需要可能会反复输注   </label>
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
	  	var value6 = document.getElementById("value_6").value;
	  	if(value6==null||value6==""){
	  		value6 = "_____________________";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value19 = document.getElementById("value_19").value;
	  	var value20 = document.getElementById("value_20").value;
	  	var value21 = document.getElementById("value_21").value;
	  	var value22 = document.getElementById("value_22").value;
	  	var value23 = document.getElementById("value_23").value;
	  	var value24 = document.getElementById("value_24").value;
	  	if(value7==null||value7==""){
	  		value7 = "__________________";
	  	}
	  	if(value8==null||value8==""){
	  		value8 = "__________________";
	  	}
	  	if(value9==null||value9==""){
	  		value9 = "__________________";
	  	}
	  	if(value10==null||value10==""){
	  		value10 = "__________________";
	  	}
	  	if(value11==null||value11==""){
	  		value11 = "__________________";
	  	}
	  	if(value12==null||value12==""){
	  		value12 = "__________________";
	  	}
	  	if(value13==null||value13==""){
	  		value13 = "__________________";
	  	}
	  	if(value15==null||value15==""){
	  		value15 = "__________________";
	  	}
	  	if(value17==null||value17==""){
	  		value17 = "__________________";
	  	}
	  	if(value18==null||value18==""){
	  		value18 = "__________________";
	  	}
	  	if(value19==null||value19==""){
	  		value19 = "________________";
	  	}
	  	if(value20==null||value20==""){
	  		value20 = "________________";
	  	}
	  	if(value21==null||value21==""){
	  		value21 = "________________";
	  	}
	  	if(value22==null||value22==""){
	  		value22 = "_______________";
	  	}
	  	if(value23==null||value23==""){
	  		value23 = "________________";
	  	}
	  	if(value24==null||value24==""){
	  		value24 = "________________";
	  	}
	  	
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong>"+value6+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong>"+value7+" "+lab8+value8+" "+lab9+value9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+value10+" "+lab11 +value11+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12+"</strong>"+value12+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab13+"</strong>"+value13+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab14+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+value15+lab16+" "+lab17+value17+" "+lab18+value18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+value19+" "+lab20+value20+" "+lab21+value21+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+value22+" "+lab23+value23+" "+lab24+value24+"</div>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1055 :input').each(function () {
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
	    var texthtml=document.getElementById("s1055").innerHTML;
		texthtml="<div id='s1055'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('输血及血液制品治疗同意书')
	})
</script>
</div>