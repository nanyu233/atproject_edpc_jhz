<div id="s1028">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">伤口清创协议书</label></div>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr>
					<td  colspan="5">
						<label id="id_1">患者姓名:</label>
						<input id="value_1" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_2">性别:</label>
						<input id="value_2" type="text" class="input_txt" style="width: 90px;"/>
						<label id="id_3">年龄:</label>
						<input id="value_3" type="text" class="input_txt" style="width: 100px;"/>
						<br/>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_4">患者经我科医生检查诊断为:</label>
						<input id="value_4" type="text" class="input_txt" style="width: 180px;"/>
						<label id="id_5">依据病情拟施行:</label>
						<input type="checkbox" class="checkStyle" id="checkbox_1"><label id="id_6" class="doctorType" for="checkbox_1" style="color: blue;">扩创</label>
						&nbsp;
    					<input type="checkbox" class="checkStyle" id="checkbox_2"><label id="id_7" class="doctorType" for="checkbox_2" style="color: blue;">引流术</label>
    					&nbsp;
    					<input type="checkbox" class="checkStyle" id="checkbox_3"><label id="id_8" class="doctorType" for="checkbox_3" style="color: blue;">清创缝合</label>
    					&nbsp;
    					<input type="checkbox" class="checkStyle" id="checkbox_4"><label id="id_9" class="doctorType" for="checkbox_4" style="color: blue;">拔甲术（部分，完全）</label>
    					&nbsp;
    					<input type="checkbox" class="checkStyle" id="checkbox_5"><label id="id_10" class="doctorType" for="checkbox_5" style="color: blue;">脓肿切开引流术</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_11" class="labtitle">手术目的：清除坏死组织，促进伤口愈合；</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_12" class="labtitle">术中、术后可能出现以下情况：</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_13">
						1、麻醉意外，严重时危及生命；
						</label><br/>
						<label id="id_13_1">
						2、清创时血管神经损伤；清创后加重感染、出血，甚至长期不能愈合；
						</label><br/>
						<label id="id_13_2">
						3、伤口感染，延迟愈合或畸形愈合，局部血肿形成，疤痕；必要时需要再次手术清创引流；
						</label><br/>
						<label id="id_13_3">
						4、因治疗需要，伤口加大加深；
						</label><br/>
						<label id="id_13_4">
						5、伤口污染较重，存在金属，玻璃等异物难以取尽；
						</label><br/>
						<label id="id_13_5">
						6、患者患有糖尿病，结核病，红斑狼疮，HIV感染等慢性病，导致伤口感染，皮肤软组织坏死，慢性骨髓炎，迁延不愈或慢性窦道形成等，严重时出现脓毒症等危及生命；
						</label><br/>
						<label id="id_13_6">
						7、难以预料的其他情况。
						</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<label id="id_14" class="labtitle">同意书签署人：</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<div style="text-indent: 2em">
						<label id="id_15">
						本人已详细阅读以上内容，已经完全明白了有关手术、治疗、预后及可能引起的危险及并发症。经慎重考虑后接受手术，并愿意承担术中、术后可能出现的并发症、手术风险、预后及费用。	
						</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_16">患者签名：</label>
						<input id="value_5" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_17">医生签名：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_18">法定代理人签名：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_19">（注明与患者关系）</label>
						<label id="id_20">签字时间：</label>
						<input id="value_8" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
		var lab13_1 = document.getElementById("id_13_1").innerText;
		var lab13_2 = document.getElementById("id_13_2").innerText;
		var lab13_3 = document.getElementById("id_13_3").innerText;
		var lab13_4 = document.getElementById("id_13_4").innerText;
		var lab13_5 = document.getElementById("id_13_5").innerText;
		var lab13_6 = document.getElementById("id_13_6").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19 = document.getElementById("id_19").innerText;
		var lab20 = document.getElementById("id_20").innerText;
	
		var value1 = document.getElementById("value_1").value;	
		if(value1==null||value1==""){
	  		value1 = "____________";
	  	}
	  	var value2 = document.getElementById("value_2").value;
	  	if(value2==null||value2==""){
	  		value2 = "____________";
	  	}
	  	var value3 = document.getElementById("value_3").value;
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = document.getElementById("value_4").value;
	  	if(value4==null||value4==""){
	  		value4 = "____________";
	  	}
	  	var value5 = document.getElementById("value_5").value;
	  	var value6 = document.getElementById("value_6").value;	
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	var checkbox_3 = document.getElementById("checkbox_3").checked;
	  	var checkbox_4 = document.getElementById("checkbox_4").checked;
	  	var checkbox_5 = document.getElementById("checkbox_5").checked;
	  	//依据病情拟施行
	  	var lab_str = "";
	  	if(checkbox_1){
	  		lab_str +=	"<strong>"+lab6+"</strong>,";
		}
		if(checkbox_2){
			lab_str +=	"<strong>"+lab7+"</strong>,";
		}
		if(checkbox_3){
			lab_str +=	"<strong>"+lab8+"</strong>,";
		}
		if(checkbox_4){
			lab_str +=	"<strong>"+lab9+"</strong>,";
		}
		if(checkbox_5){
			lab_str +=	"<strong>"+lab10+"</strong>,";
		}
		lab_str=replceLastDH(lab_str);
	  	
	  	if(value5==null||value5==""){
			value5 = "___________";
	  	}
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
		
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%' cellpadding='0' cellspacing='0' height='27'><tr><td width='30%' height='27'>"+lab1+value1+"</td>";
		text += "<td width='20%' height='27'>"+lab2+value2+"</td><td width='50%' height='27'>"+lab3+value3+"</td></table>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab4+"<strong>"+value4+"</strong>  "+lab5+lab_str+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab11+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab14+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab16+value5+" "+lab17+value6+"</td></tr>";
		text += "<tr height='27'><td><br/></td></tr>";
		text += "<tr align='right' height='27'><td>"+lab18+value7+lab19+" "+lab20+value8+"</td></tr>";
		text +=	"</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1028 :input').each(function () {
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
	    var texthtml=document.getElementById("s1028").innerHTML;
		texthtml="<div id='s1028'>"+texthtml+"</div>";
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
        	   $("#value_3").val(data.resultInfo.sysdata.hspemginfCustom.cstAge);
        	   $("#value_4").val(data.resultInfo.sysdata.hspemginfCustom.jbzdDes);
           }
       })
	}
</script>
</div>