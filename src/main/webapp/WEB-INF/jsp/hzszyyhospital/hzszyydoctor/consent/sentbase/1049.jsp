<div id="s1049">
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
						<label id="id_6" class="labtitle">目前诊断：</label>
						<textarea id="value_6" style="width: 800px;height: 120px" class="jbzdDes"></textarea>
					</td>
				</tr>				
				<tr>
					<td colspan="5">
						<label id="id_7_1">
						一、医师告知事项
						</label><br/>
						<label id="id_99">
						非医嘱离院或转院可能对患者健康甚至生命安全造成的危险及不良后果包括但不限于：
						</label><br/>
						<label id="id_7_2">
						1、对患者的生命安全构成严重危害，有可能促进患者死亡；
						</label><br/>
						<label id="id_7_3">
						2、将使患者原有疾病的治疗中断，病情有可能会出现反复甚至有可能加重或进行性加重，将会使以后的治疗变得更加困难，甚至无法治愈或丧失最佳治疗时机；
						</label><br/>
						<label id="id_7_4">
						3、有可能会导致患者出现各种感染或原有感染加重、伤口延迟愈合、疼痛等各种症状加重或时间的延长；
						</label><br/>
						<label id="id_7_5">
						4、有可能会导致患者某个或多个器官功能减退、部分或全部丧失，导致出现功能障碍、诱发其他疾病、出血、休克等；
						</label><br/>
						<label id="id_7_6">
						5、将有可能会使原来的各项治疗花费变成浪费；
						</label><br/>
						<label id="id_7_7">
						6、其他： 
						<textarea id="value_7" style="width: 800px;height: 80px"></textarea>
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_8">医师签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
						<label id="id_9">签字日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>			
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10">二、患者声明</label>
						<div style="text-indent: 2em">
							<label id="id_11">患方将拒绝浙江医院的医疗服务，并在违背医务人员意见的情况下离开该医院。医务人员已将上述风险及有可能发生的其他风险向患方作了详细的告知，但我方仍坚持患者离开该医院。</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_12">患方自愿承担自动出院或转院所带来的风险和后果。患方自动出院或转院产生的不良后果与该医院及医务人员无关。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_13">患方签名（患者或家属）：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_14">签字日期：</label>
						<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>		
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_15">与患者关系：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_16">注：签名人须为年满１８周岁且具有完全民事行为能力。</label>
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
		var lab7_1 = document.getElementById("id_7_1").innerText;
		var lab7_2 = document.getElementById("id_7_2").innerText;
		var lab7_3 = document.getElementById("id_7_3").innerText;
		var lab7_4 = document.getElementById("id_7_4").innerText;
		var lab7_5 = document.getElementById("id_7_5").innerText;
		var lab7_6 = document.getElementById("id_7_6").innerText;
		var lab7_7 = document.getElementById("id_7_7").innerText;		
		var lab8 = document.getElementById("id_8").innerText;
		var lab9 = document.getElementById("id_9").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab99 = document.getElementById("id_99").innerText;
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
	  	var value6 = document.getElementById("value_6").value;
		var value7 = document.getElementById("value_7").value;
		var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "_______";
	  	}
	  	var value9 = document.getElementById("value_9").value;
		if(value9!=null&&value9!=""&&value9!="精确到分"){
			 var dates=value9.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value9 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value9 = "___________";
		}
		var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "_______";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11!=null&&value11!=""&&value11!="精确到分"){
			 var dates=value11.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value11 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value11 = "___________";
		}
		var value12 = document.getElementById("value_12").value;
	  	if(value12==null||value12==""){
	  		value12 = "_______";
	  	}
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +="<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong><strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab99+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7_7+"<strong>"+value7+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab8+value8+"&nbsp&nbsp"+dzqm+" "+lab9+value9+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab11+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab12+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab13+value10+" "+lab14+value11+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab15+value12+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"</div>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1049 :input').each(function () {
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
	    var texthtml=document.getElementById("s1049").innerHTML;
		texthtml="<div id='s1049'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('患者非医嘱离院知情告知书')
	})
</script>
</div>