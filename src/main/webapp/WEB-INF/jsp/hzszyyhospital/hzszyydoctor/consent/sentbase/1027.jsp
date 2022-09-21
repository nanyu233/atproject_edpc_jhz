<div id="s1027">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">自动出院或转院告知书</label></div>
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
						<label id="id_6">尊敬的患者、患者家属或患者的法定监护人、授权委托人：</label>
						<div style="text-indent: 2em">
						<label id="id_7">
						根据患者目前的疾病状况，医生认为患者应当继续留住我院接受治疗，但是患者现要求自动出院或转院，特此向患者、患者家属或患者的法定监护人、授权委托人告知患者出院或转院可能出现的风险及不良后果：
						</label>
    					</div>
    					<div style="text-indent: 2em">
						<label id="id_8">
						1、自动出院或者转院，在我院原有的治疗中断，有可能导致病情反复甚至加重，从而为以后的诊断和治疗增加困难，甚至使原有疾病无法治愈或者使患者丧失最佳治疗时机，也有可能促进或者导致患者死亡；
						</label>
    					</div>
    					<div style="text-indent: 2em">
						<label id="id_9">
						2、自动出院或者转院，在我院原有的治疗中断，有可能出现各种感染或使原有的感染加重、伤口延迟愈合、疼痛等各种症状加重或症状持续时间延长，增加患者的痛苦，甚至可能导致不良后果；
						</label>
    					</div>
    					<div style="text-indent: 2em">
						<label id="id_10">
						3、自动出院或者转院，在我院原有的治疗中断，患者有可能会出现某一个或者多个器官功能减退、部分功能甚或全部功能的丧失，有可能诱发患者出现出血、休克、其他疾病和症状，甚至产生不良后果；
						</label>
    					</div>
    					<div style="text-indent: 2em">
						<label id="id_11">
						4、自动出院或者转院有可能导致部分检查或治疗重复进行，有可能导致诊治费用增加；
						</label>
    					</div>
    					<div style="text-indent: 2em">
						<label id="id_12">
						5、自动出院或者转院有可能增加患者其他不可预料的风险及不良后果。
						</label>
    					</div>
    					<label id="id_13">患者、患者家属或患者的法定监护人、授权委托人意见：</label>
    					<br/>
    					<div style="text-indent: 2em">
						<label id="id_14">
						我（或是患者的监护人）已年满18周岁且具有完全民事行为能力，我拒绝医院的医疗诊治服务，并在违背医护人员意见的情况下离开该医院。医护人员已经向我解释了医疗诊治对我的疾病的重要性和必要性，并且已将自动出院或者转院可能出现的风险及后果向我作了详细的告知。我仍然坚持离开该医院。
						</label>
    					</div>
    					<div style="text-indent: 2em">
						<label id="id_15">
						我自愿承担自动出院或转院所带来的风险和不良后果。我自动出院或转院产生的不良后果与医院及医护人员无关。
						</label>
    					</div>
					</td>
				</tr>
				<tr><td><br/></td></tr>
				<tr>
					<td colspan="5"  align="right">
						<label id="id_16">患者签名：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_17">日期：</label>
						<input id="value_7" class="Wdate spcWdate" type="text" style="width: 165px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
						<label id="id_18">如果患者无法签署知情同意书，请其授权的亲属在此签名：</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5"  align="right">
						<label id="id_19">患者授权亲属签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_20">与患者关系：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_21">日期：</label>
						<input id="value_10" class="Wdate spcWdate" type="text" style="width: 165px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_22" class="labtitle">医护人员陈述：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
						<label id="id_23">
						我已经将患者继续留住我院接受治疗的重要性和必要性以及自动出院或者转院所带来的风险及后果向患者、患者家属或患者的法定监护人、授权委托人告知，并且解答了关于自动出院或者转院的相关问题。
						</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5"  align="right">
						<label id="id_24">医护人员签名：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_25">日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 165px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	
	  	if(value6==null||value6==""){
			value6 = "___________";
	  	}
		if(value7!=null&&value7!=""){
			var str = value7.split(" ");
	  		var date = str[0].split("/");
	  		var time= str[1].split(":");
	  		value7 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
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
			var str = value10.split(" ");
	  		var date = str[0].split("/");
	  		var time= str[1].split(":");
	  		value10 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value10 = "___________";
	  	}
	
		if(value11==null||value11==""){
			value11 = "___________";
	  	}
		if(value12!=null&&value12!=""){
			var str = value12.split(" ");
	  		var date = str[0].split("/");
	  		var time= str[1].split(":");
	  		value12 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value12 = "___________";
	  	}
		
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab8+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab9+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab13+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab14+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab15+"</div><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab16+value6+" "+lab17+value7+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 2em\">"+lab18+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab19+value8+" "+lab20+value9+" "+lab21+value10+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab22+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab23+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab24+value11+" "+lab25+value12+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1027 :input').each(function () {
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
	    var texthtml=document.getElementById("s1027").innerHTML;
		texthtml="<div id='s1027'>"+texthtml+"</div>";
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