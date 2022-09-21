<div id="s1048">
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
						<label id="id_6">1.这是一份有关冠状动脉造影/冠脉介入治疗的告知书。目的是告诉您有关医生建议您进行的冠状动脉造影/冠脉介入治疗相关事宜。
						请您仔细阅读，提出与本次冠状动脉造影/冠脉介入治疗有关的任何疑问，决定是否同意进行冠状动脉造影/冠脉介入治疗。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7">2.由于已知或未知的原因，冠状动脉造影/冠脉介入治疗有可能：不能达到预期结果；出现并发症、损伤甚至死亡等。
						因此，您有权知道冠状动脉造影/冠脉介入治疗的性质和目的、存在的风险、预期的效果或对人体的影响。在没有给予您知情并获得您签署的书面同意前，
						医生不能对您施行冠状动脉造影/冠脉介入治疗。在冠状动脉造影/冠脉介入治疗实施前的任何时间，您都有权接受或拒绝本次检查、治疗。</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_8">3 您的主诊医生是：</label>
						<input id="value_6" type="text" class="input_txt" style="width: 120px;"/>
						<label id="id_9">， 您的经管医生是：</label>
						<input id="value_7" type="text" class="input_txt" style="width: 120px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_10" class="labtitle">目前的诊断：</label>
						<textarea id="value_8" style="width: 800px;height: 80px" class="jbzdDes"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_11_1">
						您拟施行的检查： 冠状动脉造影和/或冠脉介入治疗
						</label><br/>
						<label id="id_11_2">
						4.医生会给您解释：
						</label><br/>
						<label id="id_11_3">
						4.1 冠状动脉造影/冠脉介入治疗的性质、目的、预期的效果：
						</label><br/>
						<label id="id_11_4">
						手术简介：
						</label><br/>
						<label id="id_11_5">
						冠状动脉造影是将特制的、有一定韧度且不透X线的导管，经周围动脉送至冠状动脉开口，推注造影剂，使心脏血管显影。
						介入治疗是在冠状动脉造影基础上，对需要干预的血管进行球囊扩张、支架置入，以缓解严重狭窄或完全闭塞病变，改善心绞痛症状或预后。
						</label><br/>
						<label id="id_11_6">
						4.2 告诉任何可能伴随的不适、并发症或风险：
						</label><br/>
						<label id="id_11_7">
						冠状动脉造影/冠脉介入治疗可能出现下列情况：
						</label><br/>
						<label id="id_11_8">
						a.麻醉意外，包括呼吸抑制、过敏反应等，甚至休克
						</label><br/>
						<label id="id_11_9">
						b.麻醉及造影剂并发症：造影剂过敏者轻度皮疹、恶心，严重者可致过敏性休克，危及生命；造影剂引起肾损害（造影剂肾病甚至肾功能衰竭需要长期血透治疗）
						</label><br/>
						<label id="id_11_10">
						c.感染（包括局部及全身）
						</label><br/>
						<label id="id_11_11">
						d.冠脉痉挛、穿孔、夹层、血栓、气栓引起的急性心肌缺血或心肌梗死甚至猝死
						</label><br/>
						<label id="id_11_12">
						e.术中、术后可能出现穿刺部位出血及血肿形成，主动脉夹层、动静脉瘘、假性动脉瘤、腹膜后血肿，大出血需输血治疗，必要时需外科手术等
						</label><br/>
						<label id="id_11_13">
						f.急性心衰、休克
						</label><br/>
						<label id="id_11_14">
						g.急性、亚急性、晚期、极晚期支架内血栓形成；支架扩张不全、支架贴壁不良，支架断裂，血管再狭窄及心绞痛复发等；冠脉扩张术或支架植入中及植入后出现支架脱落或栓塞、断裂
						</label><br/>
						<label id="id_11_15">
						h.心脏血管穿孔、血管破裂夹层及心包填塞，需心包穿刺或急诊外科手术
						</label><br/>
						<label id="id_11_16">
						i.严重心律失常（有室速、室颤、心室停博、III度房室传导阻滞），需要安装临时或永久性起搏器及紧急电除颤等治疗
						</label><br/>
						<label id="id_11_17">
						j.导管/导丝等介入器械断裂、打结、栓塞；介入器械的断裂需外科取出
						</label><br/>
						<label id="id_11_18">
						k.导管推送过程中可引起相关动脉痉挛损伤、闭塞甚至无脉症；导管推送过程中动脉粥样硬化斑块引起全身动脉栓塞（包括脑栓塞、蓝趾综合征以及肠系膜动脉栓塞等）
						</label><br/>
						<label id="id_11_19">
						l.术中损伤神经、邻近器官及相应的血管；术中造成血胸，气胸，血气胸
						</label><br/>
						<label id="id_11_20">
						m.下肢静脉血栓形成、肺栓塞
						</label><br/>
						<label id="id_11_21">
						n.手术中，手术后出现冠脉慢血流，无血流，急性心肌缺血，甚至心肌梗死
						</label><br/>
						<label id="id_11_22">
						o.手术中，手术后出现严重的心功能不全，呼吸功能不全，需气管插管抢救
						</label><br/>
						<label id="id_11_23">
						p.手术中因心动过缓需植入临时起搏器治疗，或心肌缺血，低血压需主动脉内球囊反搏（IABP治疗），IABP可能出现主动脉夹层、败血症、脏器缺血、脑血管意外等
						</label><br/>
						<label id="id_11_24">
						q.动脉鞘拔除过程中出现大出血，迷走反应致低血压、心律失常等严重反应
						</label><br/>
						<label id="id_11_25">
						r.桡动脉径路介入操作并发症：桡动脉闭塞、周围神经损伤、骨筋膜室综合症、气胸、血胸、脑栓塞等，桡动脉内膜撕裂
						</label><br/>
						<label id="id_11_26">
						s.手术后封堵器伤口渗血、血肿、封堵部位残余瘘、假性动脉瘤或动静脉瘘；
						</label><br/>
						<label id="id_11_27">
						t.因病情需要紧急外科手术，或急诊外科搭桥治疗
						</label><br/>
						<label id="id_11_28">
						u.抗凝/抗栓药物引起严重的内脏出血，包括脑出血，消化道出血，眼底出血等；调脂药物引起的肝功能损害，甚至出现横纹肌溶解
						</label><br/>
						<label id="id_11_29">
						v.X射线对人的身体可能产生损伤
						</label><br/>
						<label id="id_11_30">
						w.手术未成功或手术未达预期效果，病人情况不适宜继续手术，手术需要终止
						</label><br/>
						<label id="id_11_31">
						x.除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提请患者及家属特别注意的其他事项，如：
						<input id="value_9" type="text" class="input_txt" style="width: 120px;"/>
						</label><br/>
						<label id="id_11_32">
						4.3 针对上述情况将采取的防范措施：
						</label><br/>
						<label id="id_11_33">
						基于冠状动脉造影/冠脉介入治疗过程中可能出现的各种并发症，我们将根据现代医疗规范，采取及时、有效、科学的防范措施，最大限度地保护病人安全，使诊疗过程顺利完成。
						</label><br/>
						<label id="id_11_34">
						4.4 可供选择的其它检查/手术方法： 冠状动脉旁路移植术或单纯药物治疗
						</label><br/>
						<label id="id_11_35">
						优缺点：CABG适合于左主干或糖尿病伴多支病变患者,其远期再血管化较低,但存在手术创伤大,恢复时间较长等缺点，但是避免了PCI治疗的心脏风险；单纯药物治疗是冠心病的基础治疗方法，主要适用于病情稳定的无症状患者，适用于病情稳定、或经济条件较差的患者以及患者一般情况较差，年龄大，存在多器官如肝、肾功能严重病变，不能耐受PCI或CABG的患者。
						</label><br/>
						<label id="id_11_36">
						4.5 您选择的检查/治疗方法：
						<input id="value_10" type="text" class="input_txt" style="width: 200px;"/>
						</label><br/>
						<label id="id_11_37">
						5.如需植入内置物，您选择的类型：
						<input id="value_11" type="text" class="input_txt" style="width: 200px;"/>
						</label><br/>
						<label id="id_11_38">
						6.为了确保您对上述内容的准确理解，在您仔细阅读该知情同意书及作出决定前，医生将会给您解释上述内容。如果您还有其它疑问，希望您及时告诉医生。
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_12_1" class="labtitle">
						您以下的签名表示：
						</label><br/>
						<label id="id_12_2">
						① 您已阅读并理解、同意前面所述的内容；
						</label><br/>
						<label id="id_12_3">
						② 您的医生对以上提出的情况向您作了充分的解释；
						</label><br/>
						<label id="id_12_4">
						③ 您已经得到了冠状动脉造影/冠脉介入治疗的相关信息；
						</label><br/>
						<label id="id_12_5">
						④ 您授权并同意医生为您施行上述检查/操作。
						</label><br/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_13" class="labtitle">患方声明：以上情况经管医师已向本人详细说明，本人对以上内容已充分理解和知情，签字为证：</label>
					</td>
				</tr>
				<tr>
					<td colspan="3">
						<label id="id_14">患方（授权人）签字：</label>
						<input id="value_12" type="text" class="input_txt" style="width: 120px;"/>
					</td>
					<td colspan="5"  align="right">
						<label id="id_15">与患者关系：</label>
						<input id="value_13" type="text" class="input_txt" style="width: 120px;"/>
					</td>			
				</tr>
				<tr align="right">
					<td colspan="5">
						<label id="id_16">签字日期：</label>
						<input id="value_14" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr>
					<td colspan="4">
						<label id="id_17">医师签名：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 120px;"/>
						<span class="spanRelative" id="dzqm"></span>
					</td>
					<td colspan="4"  align="right">
						<label id="id_18">签字日期：</label>
						<input id="value_16" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
		var lab11_1 = document.getElementById("id_11_1").innerText;
		var lab11_2 = document.getElementById("id_11_2").innerText;
		var lab11_3 = document.getElementById("id_11_3").innerText;
		var lab11_4 = document.getElementById("id_11_4").innerText;
		var lab11_5 = document.getElementById("id_11_5").innerText;
		var lab11_6 = document.getElementById("id_11_6").innerText;
		var lab11_7 = document.getElementById("id_11_7").innerText;
		var lab11_8 = document.getElementById("id_11_8").innerText;
		var lab11_9 = document.getElementById("id_11_9").innerText;
		var lab11_10 = document.getElementById("id_11_10").innerText;
		var lab11_11 = document.getElementById("id_11_11").innerText;
		var lab11_12 = document.getElementById("id_11_12").innerText;
		var lab11_13 = document.getElementById("id_11_13").innerText;
		var lab11_14 = document.getElementById("id_11_14").innerText;
		var lab11_15 = document.getElementById("id_11_15").innerText;
		var lab11_16 = document.getElementById("id_11_16").innerText;
		var lab11_17 = document.getElementById("id_11_17").innerText;
		var lab11_18 = document.getElementById("id_11_18").innerText;
		var lab11_19 = document.getElementById("id_11_19").innerText;
		var lab11_20 = document.getElementById("id_11_20").innerText;
		var lab11_21 = document.getElementById("id_11_21").innerText;
		var lab11_22 = document.getElementById("id_11_22").innerText;
		var lab11_23 = document.getElementById("id_11_23").innerText;
		var lab11_24 = document.getElementById("id_11_24").innerText;
		var lab11_25 = document.getElementById("id_11_25").innerText;
		var lab11_26 = document.getElementById("id_11_26").innerText;
		var lab11_27 = document.getElementById("id_11_27").innerText;
		var lab11_28 = document.getElementById("id_11_28").innerText;
		var lab11_29 = document.getElementById("id_11_29").innerText;
		var lab11_30 = document.getElementById("id_11_30").innerText;
		var lab11_31 = document.getElementById("id_11_31").innerText;
		var lab11_32 = document.getElementById("id_11_32").innerText;
		var lab11_33 = document.getElementById("id_11_33").innerText;
		var lab11_34 = document.getElementById("id_11_34").innerText;
		var lab11_35 = document.getElementById("id_11_35").innerText;
		var lab11_36 = document.getElementById("id_11_36").innerText;
		var lab11_37 = document.getElementById("id_11_37").innerText;
		var lab11_38 = document.getElementById("id_11_38").innerText;
		var lab12_1 = document.getElementById("id_12_1").innerText;
		var lab12_2 = document.getElementById("id_12_2").innerText;
		var lab12_3 = document.getElementById("id_12_3").innerText;
		var lab12_4 = document.getElementById("id_12_4").innerText;
		var lab12_5 = document.getElementById("id_12_5").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
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
	  	var value9 = document.getElementById("value_9").value;
	  	if(value9==null||value9==""){
	  		value9 = "____________";
	  	}
	  	var value10 = document.getElementById("value_10").value;
	  	if(value10==null||value10==""){
	  		value10 = "___________";
	  	}
	  	var value11 = document.getElementById("value_11").value;
	  	if(value11==null||value11==""){
	  		value11 = "___________";
	  	}	  	
	  	var value12 = document.getElementById("value_12").value;
	  	if(value12==null||value12==""){
	  		value12 = "___________";
	  	}
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13==null||value13==""){
	  		value13 = "___________";
	  	}
	  	var value14 = document.getElementById("value_14").value;
		if(value14!=null&&value14!=""&&value14!="精确到分"){
			 var dates=value14.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value14 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value14 = "___________";
		}
		var value15 = document.getElementById("value_15").value;
	  	if(value15==null||value15==""){
	  		value15 = "___________";
	  	}
	  	var value16 = document.getElementById("value_16").value;
		if(value16!=null&&value16!=""&&value16!="精确到分"){
			 var dates=value16.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value16 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
		}else{
			 value16 = "___________";
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
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"<strong>"+value6+"</strong>"+lab9+"<strong>"+value7+"</strong>"+"</div>";
		text +="<div style=\"text-indent: 0em\"><strong>"+lab10+"</strong><strong>"+value8+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_1+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_6+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_11+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_15+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_17+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_21+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_22+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_23+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_24+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_25+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_26+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_27+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_29+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_30+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_31+"<strong>"+value9+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_32+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_33+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_34+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_35+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_36+"<strong>"+value10+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_37+"<strong>"+value11+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11_38+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab12_1+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_2+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_3+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_4+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12_5+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab13+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab14+value12+"</td><td align='right'>"+lab15+value13+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab16+value14+"</td></tr></table>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='27'><td>"+lab17+value15+"&nbsp&nbsp"+dzqm+"</td><td align='right'>"+lab18+value16+"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1048 :input').each(function () {
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
	    var texthtml=document.getElementById("s1048").innerHTML;
		texthtml="<div id='s1048'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('冠状动脉造影、冠脉介入治疗知情同意书')
	})
</script>
</div>