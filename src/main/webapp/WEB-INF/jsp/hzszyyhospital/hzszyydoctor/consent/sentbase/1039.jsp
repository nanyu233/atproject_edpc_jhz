<div id="s1039">
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
						<label id="id_6">一、手术中可能出现的以外和危险性</label><br/>
						<label id="id_7">1、术中呼吸心跳骤停，导致死亡或植物生存；2、难以控制的大出血、休克，死亡；3、 术中急性脑肿胀，远隔部位出血，脑膨出，脑疝，致呼吸心跳骤停，死亡；4、不可避免的临 近脑组织、血管和神经的损伤，以及其他相关器官的损伤；5、病情变化导致手术进程中断， 需术中检查CT等，或更改手术方案；6、因颅压高需去骨瓣减压；7、使用人工脑膜、颅骨修补 或固定材料；除上述情况外，本次手术还可能发生下列情况：</label><br/>
						
						<textarea id="value_7" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_8">针对以上可能发生和危险性，采取的防范和处理错措施</label>
						<textarea id="value_8" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_9">二、手术中可能出现的意外和并发症</label><br/>
						<label id="id_10">1、术后昏迷不醒、植物生存、甚至死亡可能；2、术后颅内出血或并发严重脑血肿、脑积 水、脑肿胀危及生命，或者需要再次手术清除血肿及减压；3、术后脑血管痉挛、脑梗死、脑 缺血、死亡；4、术后偏瘫、偏身感觉障碍、失语、失读、失认、失写等神经功能障碍；5、术 后视力障碍、听力障碍、嗅觉功能障碍、眼球活动障碍、复视、面瘫、吞咽困难发音困难等颅 神经功能障碍6、术后癫痫、精神异常、共济失调、大小便功能障碍、性功能障碍等；7、术后 高热、电解质紊乱、尿崩等下丘脑反应；8、术后气道阻塞，呼吸、心跳骤停；9、并发上消化 道出血、急性肺水肿、心肝肾功能障碍甚至多脏器功能衰竭（包括DIC）；10、术后感染（颅 内、切口、肺部、泌尿系等），甚至全身感染、败血症等无法控制致死亡；11、术后长期卧床 致静脉血栓形成、褥疮，呼吸道、肺部感染致自主呼吸困难，必要时需器官切开、机械通气， 或需要转至重症监护病房；12、术后硬膜下积液、脑积水、脑脊液漏、皮下积液、切口裂开、 颅骨缺损等；13、术前临床症状不能改善甚至恶化；14、诱发原有或潜在疾病恶化；15、术后 病理报告与术中快速病理检查结果或术前诊断不符；16、病变残留或复发需再次手术；除上述 情况外，本次手术还可能导致下列意外和并发症：</label><br/>
						<textarea id="value_10" style="width: 800px;height: 120px"></textarea><br/>
						<label id="id_11">针对以上可能发生的意外和危险性，采取的防范和处理措施：</label>
						<textarea id="value_11" style="width: 800px;height: 120px"></textarea><br/>
					</div>
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_12">上述问题主管医生已经作了充分解释。经慎重考虑，我对上述可能出现的手术风险表示充分理解，并签字选择手术治疗。</label><br/>
						</div>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_13">患者或家属签字：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 120px;"/>		
						<label id="id_14">签名日期：</label>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">				
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_15">与患者关系：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr align="left">
					<td colspan="5">
						<label id="id_16">主刀医师签字：</label>
						<input id="value_16" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_17">经治医师：</label>
						<input id="value_17" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_18">签名日期：</label>
						<input id="value_18" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value18 = document.getElementById("value_18").value;
	  	if(value7==null||value7==""){
	  		value7 = "<br/><br/>";
	  	}
	  	if(value8==null||value8==""){
	  		value8 = "<br/><br/>";
	  	}
	  	if(value10==null||value10==""){
	  		value10 = "<br/><br/>";
	  	}
	  	if(value11==null||value11==""){
	  		value11 = "<br/><br/>";
	  	}
	  	if(value13==null||value13==""){
	  		value13 = "_________";
	  	}
	  	if(value15==null||value15==""){
	  		value15 = "_________";
	  	}
	  	if(value16==null||value16==""){
	  		value16 = "_________";
	  	}
	  	if(value17==null||value17==""){
	  		value17 = "_________";
	  	}
	  	if(value14!=null&&value14!=""){
	  		var dates=value14.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value14 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value14 = "____年___月___日___时___分";
	  	}
	  	if(value18!=null&&value18!=""){
	  		var dates=value18.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value18 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value18 = "____年___月___日___时___分";
	  	}
	  	
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"<br/>"+value7+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"<br/>"+value8+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"<br/>"+value10+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"<br/>"+value11+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab13+value13+" "+lab14+value14+"</td></tr></table>";
		"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab15+value15+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='left' height='27'><td>"+lab16+value16+" "+lab17+value17+" "+lab18+value18+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	} 
	 //参数获取
	function getparam(){
		$('#s1039 :input').each(function () {
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
	    var texthtml=document.getElementById("s1039").innerHTML;
		texthtml="<div id='s1039'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('手术知情同意书3')
	})
</script>
</div>