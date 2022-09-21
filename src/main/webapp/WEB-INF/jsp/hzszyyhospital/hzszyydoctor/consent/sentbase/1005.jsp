<div id="s1005">
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
						<label id="id_6" class="labtitle">单位：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 250px;"/>
						<br/>
						<label id="id_7" class="labtitle">诊断：</label>
						<textarea class="jbzdDes" style="width: 800px;height: 120px"></textarea>
						<br/>			
						<label id="id_8" class="labtitle">病重通知：</label><br/>
						<textarea id="value_8" style="width: 800px;height: 120px"></textarea>
						<br/>
						<label id="id_9" class="labtitle">病区：</label>
						<input id="value_9" type="text" class="input_txt" style="width: 250px;"/>
					</div>
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_10">医生签字：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
				</tr>
				<tr align="right">	
					<td colspan="5">
						<label id="id_11">日期：</label>
						<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
	  	if(value6==null||value6==""){
	  		value6 = "____________";
	  	}
	  	var value7 = $('.jbzdDes').val();
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "____________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "____________";
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
	  
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
		text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong><strong>"+value6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"<br/><strong>"+value7+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"<br/><strong>"+value8+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab9+"</strong><strong>"+value9+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab10+value10+"&nbsp&nbsp"+dzqm+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab11+value11+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1005 :input').each(function () {
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
	    var texthtml=document.getElementById("s1005").innerHTML;
		texthtml="<div id='s1005'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}

	$(function(){
		$('#id_title2').html('病重通知单')
	})
</script>
</div>