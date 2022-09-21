<div id="s1044">
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
					<div>
						<label id="id_6">一、根据《浙江省医疗服务价格手册》暂行说明，第六项第三条规定，医疗机构在使用可吸收缝线、“除外内容”中列明的特殊缝线、
						置入性材料以及单价在200元以上的材料时，应事先征得患者或家属同意。</label>
						<br/>
						<label id="id_7">二、根据《浙江省基本医疗保险医疗服务项目目录》（2005年版）规定项目分为“甲类”和“乙类”，“甲类”项目按基本医疗保险规定支付，
						“乙类”先由参保人员个人自理一定比例后，再按本医疗保险规定支付。部分高价医用材料，先由个人自理一定比例后，按基本医疗保险规定支付并实行限额支付。
						因此，参保病人在我院诊治提供丙类诊疗服务项目时应事先征得患者或家属同意。</label>
						<br/>
						<label id="id_8">三、患者[</label>
						<input id="value_6" type="text" class="input_txt cstNam" style="width: 100px;"/>
						<label id="id_8_1">]在浙江医院</label>
						<input id="value_7" type="text" class="input_txt emgFkCod" style="width: 150px;"/>
						<label id="id_8_2">科室治疗期间需使用200元以上材料或丙类诊疗项目，现告知如下：</label>
					</div>
					</td>
				</tr>
			</table>
			<table border="1" id="table">
				<tr>
					<th width="200px" id="tr_1_1" >200元以上材料或丙类诊疗项</th>
					<th width="100px" id="tr_2_1">规格</th>
					<th width="100px" id="tr_3_1">单位</th>
					<th width="100px" id="tr_4_1">数量</th>
					<th width="100px" id="tr_5_1">单价</th>
					<th width="150px" id="tr_6_1">备注</th>
				</tr>
				<tr>
					<td height="30px">
						<input id="tr_1_2" type="text" class="input_table" style="width: 200px;"/>
					</td>
					<td>
						<input id="tr_2_2" type="text" class="input_table" style="width: 100px;"/>
					</td>
					<td>
						<input id="tr_3_2" type="text" class="input_table" style="width: 100px;"/>
					</td>
					<td>
						<input id="tr_4_2" type="text" class="input_table" style="width: 100px;"/>
					</td>
					<td>
						<input id="tr_5_2" type="text" class="input_table" style="width: 100px;"/>
					</td>
					<td>
						<input id="tr_6_2" type="text" class="input_table" style="width: 150px;"/>
					</td>
				</tr>
			</table>
			<label>
            	<img src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" onclick="add()" />
                <img src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="del()" />
            </label>
            <table class="tbody">
				<tr>
					<td colspan="5">
						<label id="id_9">病人（家属）同意签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>						
					</td>
					<td colspan="5" align="right">
						<label id="id_10">日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
					</td>
				</tr>
				<tr>
					<td colspan="5">					    
						<label id="id_11">医师签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="5" align="right">
						<label id="id_12">日期：</label>
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
		var lab8_1 = document.getElementById("id_8_1").innerText;
		var lab8_2 = document.getElementById("id_8_2").innerText;
		var lab9 = document.getElementById("id_9").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
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
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "____________";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	if(value8==null||value8==""){
	  		value8 = "____________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "____________";
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
		var value11 = document.getElementById("value_11").value;
		if(value11!=null&&value11!=""&&value11!="精确到分"){
			 var dates=value11.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value11 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value11 = "___________";
		}
	  	
	  	//拼接表格
		var lab_bg="";
	    var t1=document.getElementById("table");
	    var i=t1.rows.length;
	    var tr_1=document.getElementById("tr_1_1").innerText;
	    var tr_2=document.getElementById("tr_2_1").innerText;
	    var tr_3=document.getElementById("tr_3_1").innerText;
	    var tr_4=document.getElementById("tr_4_1").innerText;
	    var tr_5=document.getElementById("tr_5_1").innerText;
	    var tr_6=document.getElementById("tr_6_1").innerText;
	    lab_bg +="<table border='1' width='100%' cellpadding='0' cellspacing='0' height='27'><tr><td width='30%' height='27'>"+tr_1+"</td><td>"+tr_2+"</td><td>"+tr_3+"</td><td>"+tr_4+"</td><td>"+tr_5+"</td><td>"+tr_6+"</td></tr>";
	    for(i=2;i<t1.rows.length+1;i++){
	       var tr_1=document.getElementById("tr_1_"+i).value;
	       var tr_2=document.getElementById("tr_2_"+i).value;
	       var tr_3=document.getElementById("tr_3_"+i).value;
	       var tr_4=document.getElementById("tr_4_"+i).value;
	       var tr_5=document.getElementById("tr_5_"+i).value;
	       var tr_6=document.getElementById("tr_6_"+i).value;
	       lab_bg +="<tr><td width='30%' height='27'>"+tr_1+"</td><td>"+tr_2+"</td><td>"+tr_3+"</td><td>"+tr_4+"</td><td>"+tr_5+"</td><td>"+tr_6+"</td></tr>";
	    }
		lab_bg +="</table>";
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"<strong>"+value6+"</strong>"+lab8_1+"<strong>"+value7+"</strong>"+lab8_2+"</div>";
		text +=lab_bg;
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab9+value8+"</td><td align='right'>"+lab10+value9+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab11+value10+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab12+value11+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	function del(){
		var t1=document.getElementById("table");
		var rows=t1.rows.length;
		if(rows<=2){
			alert("表格无法删除最后一行");
			return false;
		}
		document.getElementById("table").deleteRow(table.rows.length-1);	
	}
	function add(){
	    var t1=document.getElementById("table");
	    var rows=t1.rows.length+1;
	    var tr=t1.insertRow();
	    tr.id="teble_"+rows;
	    var td1=tr.insertCell();
		var td2=tr.insertCell();
		var td3=tr.insertCell();
		var td4=tr.insertCell();
		var td5=tr.insertCell();
		var td6=tr.insertCell();
		td1.innerHTML='<input id="'+"tr"+'_1_'+rows+'" type="text"  class="input_table" style="width: 200px;" />';  
		td2.innerHTML='<input id="'+"tr"+'_2_'+rows+'" type="text"  class="input_table" style="width: 100px;" />';
		td3.innerHTML='<input id="'+"tr"+'_3_'+rows+'" type="text"  class="input_table" style="width: 100px;" />';  
		td4.innerHTML='<input id="'+"tr"+'_4_'+rows+'" type="text"  class="input_table" style="width: 100px;" />';
		td5.innerHTML='<input id="'+"tr"+'_5_'+rows+'" type="text"  class="input_table" style="width: 100px;" />';
		td6.innerHTML='<input id="'+"tr"+'_6_'+rows+'" type="text"  class="input_table" style="width: 150px;" />';  
	}
	
	 //参数获取
	function getparam(){
		$('#s1044 :input').each(function () {
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
	    var texthtml=document.getElementById("s1044").innerHTML;
		texthtml="<div id='s1044'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('200元以上材料或丙类诊疗项目使用知情同意书')
	})
</script>
</div>