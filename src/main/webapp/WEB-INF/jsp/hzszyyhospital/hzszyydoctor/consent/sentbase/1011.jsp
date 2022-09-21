<div id="s1011">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">接受血液净化术前谈话</label></div>
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
						<label id="id_6">
						患者目前已有明确的血液净化指征，需要血液净化维持生命，或因疾病需血压净化治疗。因此要求病人家属对以下内容表示理解，以便做出决定：
						</label><br/>
						<label id="id_6_1">
						1、血液净化有一定的风险，随时可能出现意外甚至死亡，有相对禁忌征（见附后）者，风险更大。但在医学可能的情况下，义务人员将会积极抢救，避免出现各种意外。
						</label><br/> 
						<label id="id_6_2">
						2、血液净化前，要建立血管通路。在穿刺过程中可能发生气胸、动脉刺伤、局部血肿、导管栓塞、折断、心脏内栓子、动脉栓塞、锁骨下、颈V内空气栓塞或血栓形成、并发感染及败血症。
						</label><br/>
						<label id="id_6_3">
						3、血液净化过程中，可能发生并发症，如：低血压、高血压、出血、失衡综合征、首次综合征、严重者出现心衰、猝死、脑溢血、休克等则预后差。
						</label><br/>
						<label id="id_6_4">
						4、血液净化过程中还可能感染经血途传播的疾病，如肝炎、艾滋病、梅毒等，我科消毒极为严密，传播疾病的可能性极小，但由于多种原因，不能完全排除感染。
						</label><br/>
						<label id="id_6_5">
						5、其他还可能发生过敏及热源反应等，此类反应一般很少发生严重后果，但在某些特殊情况下，可能发生其他较为严重的问题。
						</label><br/>
						<label id="id_6_6">
						附：血液透析疗法相对禁忌征
						</label><br/>
						<label id="id_6_7">
						1、休克或收缩压低于80mmHg者
						</label><br/>
						<label id="id_6_8">
 						2、大手术后3天内或者严重出血倾向者
 						</label><br/>
 						<label id="id_6_9">
 						3、严重贫血（Hb<50g/L）
 						</label><br/>
 						<label id="id_6_10">
 						4、严重心律失常、心脏功能不全或冠心病
 						</label><br/>
 						<label id="id_6_11">
 						5、严重高血压，收缩压>220mmHg，舒张压>130mmHg或脑血管疾病者
 						</label><br/>
 						<label id="id_6_12">
						6、严重感染，如败血症
						</label><br/>
						<label id="id_6_13">
 						7、极度衰竭，临危患者
 						</label><br/>
 						<label id="id_6_14">
 						8、晚期癌症
 						</label><br/>
 						<label id="id_6_15">
 						9、老年患者（70岁以上，体弱、心功能不全）
 						</label><br/>
 						<label id="id_6_16">
 						10、精神病及不合作者或家属不同意透析者
 						</label><br/>
 						<label id="id_6_17">
 						总之我院将尽力提高血液净化的安全性及妥善处理由此引起的反应，但仍需与您说明上述情况，并获得您的同意。如有任何疑问，请您与护士、医生讨论。
						</label><br/><br/>
						<label id="id_7" class="labtitle">
						我已全面了解血液净化过程中的危险性及并发症，要求血液净化治疗。
						</label>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="3">
						<label id="id_8">病人签名或病人家属签名：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
						<input id="value_8" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
					<td colspan="2" align="right">
						<label id="id_9">经管医生签名：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab6_1 = document.getElementById("id_6_1").innerText;
		var lab6_2 = document.getElementById("id_6_2").innerText;
		var lab6_3 = document.getElementById("id_6_3").innerText;
		var lab6_4 = document.getElementById("id_6_4").innerText;
		var lab6_5 = document.getElementById("id_6_5").innerText;
		var lab6_6 = document.getElementById("id_6_6").innerText;
		var lab6_7 = document.getElementById("id_6_7").innerText;
		var lab6_8 = document.getElementById("id_6_8").innerText;
		var lab6_9 = document.getElementById("id_6_9").innerText;
		var lab6_10 = document.getElementById("id_6_10").innerText;
		var lab6_11 = document.getElementById("id_6_11").innerText;
		var lab6_12 = document.getElementById("id_6_12").innerText;
		var lab6_13 = document.getElementById("id_6_13").innerText;
		var lab6_14 = document.getElementById("id_6_14").innerText;
		var lab6_15 = document.getElementById("id_6_15").innerText;
		var lab6_16 = document.getElementById("id_6_16").innerText;
		var lab6_17 = document.getElementById("id_6_17").innerText;
		var lab7 = document.getElementById("id_7").innerText;
		var lab8 = document.getElementById("id_8").innerText;
		var lab9 = document.getElementById("id_9").innerText;
	
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
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	
	  	if(value6==null||value6==""){
	  		value6 = "___________";
	  	}
	  	if(value7==null||value7==""){
	  		value7 = "___________";
	  	}
	  	if(value8!=null&&value8!=""){
	  		var date = value8.split("/");
	  		value8 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value8 = "___________";
	  	}
	  	if(value9!=null&&value9!=""){
	  		var date = value9.split("/");
	  		value9 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value9 = "___________";
	  	}
	  	
	  	var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_11+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_15+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab6_17+"</div><br/>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab7+"</strong></div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab8+value6+"</td><td align='right'>"+lab9+value7+"</td></tr>";
		text += "<tr  height='27'><td>日期："+value8+"</td><td align='right'>日期："+value9+"</td></tr>";
		text += "</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1011 :input').each(function () {
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
	    var texthtml=document.getElementById("s1011").innerHTML;
		texthtml="<div id='s1011'>"+texthtml+"</div>";
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