<div id="s1009">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">接受深静脉透析导管置管术谈话签字</label></div>
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
						<label id="id_7">您因病情需要行深静脉透析导管置管术，在术中及术后有可能发生下列并发症和意外情况:</label>
						<div style="text-indent: 2em">
						<label id="id_8" >1. 麻醉意外，严重时可危及生命。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_9" >2. 心血管意外可能，严重时可危及生命。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_10" >3. 插管时可能损伤动静脉、神经及其他脏器，引起大出血、血肿、血气胸，甚至死亡，必要时须手术处理，颈从、臂丛神经损伤可造成上肢感觉活动障碍。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_11" >4. 透析导管可能发生导管相关感染，甚至出现败血症，必要时须拔管；为早期发现及时处理，须定期进行相关检查。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_12" >5. 导管放置后，可并发静脉血栓形成、导管内凝血，血管内栓子脱落可能造成血管栓塞，严重者脑血管栓塞可导致死亡。导管栓塞导致吸出不畅，必要时需更换导管或其它部位重新留置导管。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_13" >6. 长期放置可能引起中心血管狭窄，甚至血管闭塞。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_14" >7. 由于患者当时病情限制，只能留置颈内静脉临时导管，颈内静脉临时导管（1个月左右）、股静 脉临时导管（1周左右）需更换为其它长期的血管通路。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_15" >8. 由于医学的复杂性，可能发生其他无法预料或者不能防范的并发症等。医方将尽职尽力，努力防范。</label>
						</div>
						<div style="text-indent: 2em">
						<label id="id_16" >上述情况，医生已讲明，经慎重考虑，在此，我代表患者及家属对可能的深静脉透析导管置管术中及术后有可能的风险和医疗工作的复杂性和特殊性表示充分理解，愿意承担由于疾病本身或现有的医疗技术所限而致医疗意外及并发症，并全权负责签字要求手术治疗，配合术后的随访。</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_17">患方签字：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_18">与患者关系：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_19">联系电话：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						日期：
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_20">医师签名：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						日期：
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	
	  	if(value7==null||value7==""){
	  		value7 = "___________";
	  	}
	  	if(value8==null||value8==""){
	  		value8 = "___________";
	  	}
	  	if(value9==null||value9==""){
	  		value9 = "___________";
	  	}
	  	if(value10!=null&&value10!=""){
	  		var date = value10.split("/");
	  		value10 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value10 = "___________";
	  	}
		if(value11==null||value11==""){
			value11 = "___________";
	  	}
		if(value12!=null&&value12!=""){
	  		var date = value12.split("/");
	  		value12 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value12 = "___________";
	  	}
	  	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"<strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab16+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab17+value7+" "+lab18+value8+" "+lab19+value9+"</td></tr>";
		text += "<tr align='right' height='27'><td>日期："+value10+"</td></tr>";
		text += "<tr align='right' height='27'><td>"+lab20+value11+" 日期："+value12+"</td></tr>";
		text += "</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1009 :input').each(function () {
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
	    var texthtml=document.getElementById("s1009").innerHTML;
		texthtml="<div id='s1009'>"+texthtml+"</div>";
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