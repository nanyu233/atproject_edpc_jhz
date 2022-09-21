<div id="s1014">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">留置胃管谈话记录</label></div>
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
						<div><label id="id_6">患者因病情需要，需留置胃管，在留置胃管过程中及其后可能存在以下风险：</label></div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_7" >
						1．  误入气道，引起窒息甚至死亡；
						</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_8">
						2．  消化道损伤，出血甚至穿孔；
						</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_9">
						3．  反射性心跳呼吸骤停甚至死亡；
						</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_10">
						4．  需长期留置；
						</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_11">
						5．  返流，误吸，肺部感染；
						</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_12">
						6．  其它未能预见的意外及并发症。
						</label>
						</div>
						<br/>
						<div style="text-indent: 2em">
						<label id="id_13">
						以上情况严重时可危及生命，医务人员将严格按照操作规范进行操作，并做好相应的防范和抢救措施，力争将风险降低到最低限度，出现意外及时处理，但风险客观存在不可能完全避免。以上事项已详细告知家属，家属对可能不良后果表示充分理解，签字如下：
						</label>
						</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_14">患方代表签字：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
						<input id="value_7" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_15">与患者关系：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 232px;"/>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_16">谈话医生：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
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
	  	var value10 = document.getElementById("value_10").value;
	  	
	  	if(value6==null||value6==""){
	  		value6 = "___________";
	  	}
	  	if(value7!=null&&value7!=""){
	  		var date = value7.split("/");
	  		value7 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
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
	  	
	  	var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
	  	text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab8+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab9+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div><br/>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab14+value6+" 日期："+value7+"</td></tr>";
		text += "<tr height='27'><td><br/></td></tr>";
		text += "<tr align='right' height='27'><td>"+lab15+value8+"</td></tr>";
		text += "<tr height='27'><td><br/></td></tr>";
		text += "<tr align='right' height='27'><td>"+lab16+value9+" 日期："+value10+"</td></tr>";
		text += "</table></div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1014 :input').each(function () {
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
	    var texthtml=document.getElementById("s1014").innerHTML;
		texthtml="<div id='s1014'>"+texthtml+"</div>";
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