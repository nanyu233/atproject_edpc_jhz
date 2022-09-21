<div id="s1020">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<div class="title"><label id="id_title1">${hospitalPlatformNameGap}</label></div>
	<div class="title1"><label id="id_title2">心导管诊疗知情同意书</label></div>
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
						<label id="id_6" class="labtitle">疾病介绍和治疗建议</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_7">医生已告知我患有</label>
						<input id="value_6" type="text" class="input_txt" style="width: 200px;"/>
						<label id="id_8">，需要在</label>
						<input id="value_7" type="text" class="input_txt" style="width: 200px;"/>
						<label id="id_9">下进行</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<table  style="margin: auto;" align="left">
							<tr>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_1">
									<label id="id_10" class="doctorType" for="checkbox_1" style="color: blue;">冠状动脉造影</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_2">
									<label id="id_11" class="doctorType" for="checkbox_2" style="color: blue;">左心造影（左室、左房）</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_3">
									<label id="id_12" class="doctorType" for="checkbox_3" style="color: blue;">血管内超声</label>
								</td>
							</tr>
							<tr>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_4">
									<label id="id_13" class="doctorType" for="checkbox_4" style="color: blue;">冠状动脉介入性治疗（PCI）</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_5">
									<label id="id_14" class="doctorType" for="checkbox_5" style="color: blue;">右心造影（右房、右室）</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_6">
									<label id="id_15" class="doctorType" for="checkbox_6" style="color: blue;">冠状动脉内斑块旋磨术</label>
								</td>
							</tr>
							<tr>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_7">
									<label id="id_16" class="doctorType" for="checkbox_7" style="color: blue;">瓣膜成形术</label>
								</td>
								<td colspan="2">
									<input type="checkbox" class="checkStyle1" id="checkbox_8">
									<label id="id_17" class="doctorType" for="checkbox_8" style="color: blue;">周围血管介入性治疗术</label>
								</td>
							</tr>
							<tr>
								<td colspan="3">
									<input type="checkbox" class="checkStyle1" id="checkbox_9">
									<label id="id_18" class="doctorType" for="checkbox_9" style="color: blue;">周围血管造影（升主动脉、腹主动脉、支气管动脉、颈动脉、肺静脉、腔静脉、肾动脉）</label>
								</td>
							</tr>
							<tr>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_10">
									<label id="id_19" class="doctorType" for="checkbox_10" style="color: blue;">临时性起搏器安装术</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_11">
									<label id="id_20" class="doctorType" for="checkbox_11" style="color: blue;">先心病介入性治疗</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_12">
									<label id="id_21" class="doctorType" for="checkbox_12" style="color: blue;">主动脉球囊反搏</label>
								</td>
							</tr>
							<tr>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_13">
									<label id="id_22" class="doctorType" for="checkbox_13" style="color: blue;">右心导管检查</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_14">
									<label id="id_23" class="doctorType" for="checkbox_14" style="color: blue;">肾动脉介入治疗</label>
								</td>
								<td>
									<input type="checkbox" class="checkStyle1" id="checkbox_15">
									<label id="id_24" class="doctorType" for="checkbox_15" style="color: blue;">颈动脉介入治疗</label>
								</td>
							</tr>
							<tr>
								<td colspan="3">
									<input type="checkbox" class="checkStyle1" id="checkbox_16">
									<label id="id_25" class="doctorType" for="checkbox_16" style="color: blue;">其他（含直流电复律、除颤）</label>
								</td>
							</tr>
						</table>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_26">:手术。</label>
					</td>
				</tr>
				<tr>
					<td  colspan="5">
						<div style="text-indent: 2em">
							<label id="id_27">
							冠状动脉造影是将特制的、有一定韧度且不透X线的导管，经周围动脉送至冠状动脉开口，推注造影剂，使心脏血管显影。介入治疗是在冠状动脉造影基础上，对需要干预的血管进行球囊扩张、支架置入，以缓解严重狭窄或完全闭塞病变，改善心绞痛症状或预后。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_28">
							其他心导管检查，包括左、右心导管检查术,可以通过导管到达指定部位，测定心血管各部分的压力及血氧含量，计算心排血量、分流量及血流阻力，分析压力曲线的波形和数值，了解解剖结构变化，以帮助诊断和鉴别诊断，为治疗提供依据，并判断治疗效果。
							</label>
						</div>
						<div><label id="id_29" class="labtitle">手术潜在风险和对策：</label></div>
						<div style="text-indent: 2em">
							<label id="id_30">
							医生告知我如下心导管手术可能发生的风险，有些不常见的风险可能没有在此列出，具体的手术术式根据不同病人的情况有所不同，医生告诉我可与我的医生讨论有关我手术的具体内容，如果我有特殊的问题可与我的医生讨论。
							</label>
						</div>
						<label id="id_31">
						1.我理解任何手术麻醉都存在风险。
						</label><br/>
						<label id="id_32">
						2.我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。
						</label><br/>
						<label id="id_33">
						3.我理解此手术可能发生的风险及医生的对策：
						</label><br/>
						<label id="id_34">
						1）麻醉及造影剂并发症：造影剂过敏者轻度皮疹、恶心，严重者可致过敏性休克，危及生命；造影剂 引起肾损害（造影剂肾病甚至肾功能衰竭需要长期血透治疗）；
						</label><br/>
						<label id="id_35">
						2）感染（包括局部及全身）；
						</label><br/>
						<label id="id_36">
						3）冠脉痉挛、穿孔、夹层、血栓、气栓引起的急性心肌缺血或心肌梗死甚至猝死；
						</label><br/>
						<label id="id_37">
						4）术中、术后可能出血及血肿形成，主动脉夹层、动静脉瘘、假性动脉瘤、腹膜后血肿，大出血需输血治疗，必要时需外科手术等；
						</label><br/>
						<label id="id_38">
						5）急性心衰、休克；
						</label><br/>
						<label id="id_39">
						6）急性、亚急性、晚期支架内血栓；血栓支架晚期贴壁不良，支架断裂，靶血管再狭窄等；
						</label><br/>
						<label id="id_40">
						7）心肌穿孔、血管穿孔、血管破裂及心包填塞；
						</label><br/>
						<label id="id_41">
						8）严重心律失常（有室速、室颤、心室停博、III度房室传导阻滞、需要安装永久性起搏器及紧急电除颤等）；
						</label><br/>
						<label id="id_42">
						9）导管断裂、打结；介入器械的断裂需外科取出；
						</label><br/>
						<label id="id_43">
						10）导管推送过程中可引起相关动脉痉挛损伤、闭塞甚至无脉症（经肱动脉、桡动脉通路）；导管推送过程中动脉粥样硬化斑块引起全身动脉栓塞（包括脑栓塞、蓝趾综合征以及肠系膜动脉栓塞等）；
						</label><br/>
						<label id="id_44">
						11）术中损伤神经、邻近器官及相应的血管；
						</label><br/>
						<label id="id_45">
						12）下肢静脉血栓、肺栓塞；
						</label><br/>
						<label id="id_46">
						13）桡动脉径路介入操作并发症：桡动脉闭塞、周围神经损伤、骨筋膜室综合症、气胸、血胸、脑栓塞等；
						</label><br/>
						<label id="id_47">
						14）手术后封堵器伤口渗血、血肿、封堵部位残余瘘、假性动脉瘤或动静脉瘘；
						</label><br/>
						<label id="id_48">
						15）因病情需要行主动脉球囊反搏治疗；
						</label><br/>
						<label id="id_49">
						16）手术失败，效果不好；
						</label><br/>
						<label id="id_50">
						17）因病情需要紧急外科手术，或急诊外科搭桥治疗；
						</label><br/>
						<label id="id_51">
						18）有些患者，术中及术后发生全身及心脑血管意外，可能危及生命，甚至导致死亡；
						</label><br/>
						<label id="id_52">
						20）抗栓药物引起严重的内脏出血，包括脑出血，消化道出血等；
						</label><br/>
						<label id="id_53">
						21）其他(如X线机械或相关仪器故障、特殊介入器械引起的并发症)；
						</label><br/>
						<label id="id_54">
						22） 除上述情况外，本医疗措施尚有可能发生的其他并发症或者需要提请患者及家属特别注意的其他事项，如:
						</label><br/>
						<label id="id_55">
						4.我理解如果我患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至死亡。
						</label><br/>
						<label id="id_56">
						5.我理解术后如果我的体位不当或不遵医嘱，可能影响手术效果。
						</label><br/>
						<label id="id_57" class="labtitle">
						特殊风险或主要高危因素
						</label><br/>
						<label id="id_58">
						我理解根据我个人的病情，我可能出现未包括在上述所交待并发症以外的风险：
						</label><br/>
						<textarea id="value_7_1" rows="6" cols="120"></textarea>
						<br/>
						<label id="id_59">
						一旦发生上述风险和意外，医生会采取积极应对措施。
						</label><br/>
						<label id="id_60" class="labtitle">
						患者知情选择
						</label><br/>
						<div style="text-indent: 2em">
							<label id="id_61">
							●我的医生已经告知我将要进行的手术方式、此次手术及术后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次手术的相关问题。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_62">
							●我同意在手术中医生可以根据我的病情对预定的手术方式做出调整。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_63">
							●我理解我的手术需要多位医生共同进行。
							</label>
						</div>
						<div style="text-indent: 2em">
							<label id="id_64">
							●我并未得到手术百分之百成功的许诺。
							</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label id="id_65">患者签名：</label>
						<input id="value_8" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_66">签名日期：</label>
						<input id="value_9" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_67">如果患者无法签署知情同意书，请其授权的亲属在此签名</label>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label id="id_68">患者授权亲属签名：</label>
						<input id="value_10" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_69">与患者关系：</label>
						<input id="value_11" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_70">签名日期：</label>
						<input id="value_12" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_71">冠脉造影结果：</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<textarea id="value_13" rows="6" cols="120"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_72">患者家属选择：</label>
						<input type="checkbox" class="checkStyle1" id="checkbox_17"><label id="id_73" class="doctorType" for="checkbox_17" style="color: blue;">药物保守治疗</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_18"><label id="id_74" class="doctorType" for="checkbox_18" style="color: blue;">冠脉内介入治疗</label>
						&nbsp;
						<input type="checkbox" class="checkStyle1" id="checkbox_19"><label id="id_75" class="doctorType" for="checkbox_19" style="color: blue;">外科搭桥</label>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label id="id_76">大致费用区间：</label>
						<input id="value_14" type="text" class="input_txt" style="width: 200px;"/>
					</td>
				</tr>
				<tr>
					<td colspan="5" align="right">
						<label id="id_77">医师签名：</label>
						<input id="value_15" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_78">主任签名：</label>
						<input id="value_16" type="text" class="input_txt" style="width: 100px;"/>
						<label id="id_79">医务科：</label>
						<input id="value_17" type="text" class="input_txt" style="width: 100px;"/>
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
		var lab26 = document.getElementById("id_26").innerText;
		var lab27 = document.getElementById("id_27").innerText;
		var lab28 = document.getElementById("id_28").innerText;
		var lab29 = document.getElementById("id_29").innerText;
		var lab30 = document.getElementById("id_30").innerText;
		var lab31 = document.getElementById("id_31").innerText;
		var lab32 = document.getElementById("id_32").innerText;
		var lab33 = document.getElementById("id_33").innerText;
		var lab34 = document.getElementById("id_34").innerText;
		var lab35 = document.getElementById("id_35").innerText;
		var lab36 = document.getElementById("id_36").innerText;
		var lab37 = document.getElementById("id_37").innerText;
		var lab38 = document.getElementById("id_38").innerText;
		var lab39 = document.getElementById("id_39").innerText;
		var lab40 = document.getElementById("id_40").innerText;
		var lab41 = document.getElementById("id_41").innerText;
		var lab42 = document.getElementById("id_42").innerText;
		var lab43 = document.getElementById("id_43").innerText;
		var lab44 = document.getElementById("id_44").innerText;
		var lab45 = document.getElementById("id_45").innerText;
		var lab46 = document.getElementById("id_46").innerText;
		var lab47 = document.getElementById("id_47").innerText;
		var lab48 = document.getElementById("id_48").innerText;
		var lab49 = document.getElementById("id_49").innerText;
		var lab50 = document.getElementById("id_50").innerText;
		var lab51 = document.getElementById("id_51").innerText;
		var lab52 = document.getElementById("id_52").innerText;
		var lab53 = document.getElementById("id_53").innerText;
		var lab54 = document.getElementById("id_54").innerText;
		var lab55 = document.getElementById("id_55").innerText;
		var lab56 = document.getElementById("id_56").innerText;
		var lab57 = document.getElementById("id_57").innerText;
		var lab58 = document.getElementById("id_58").innerText;
		var lab59 = document.getElementById("id_59").innerText;
		var lab60 = document.getElementById("id_60").innerText;
		var lab61 = document.getElementById("id_61").innerText;
		var lab62 = document.getElementById("id_62").innerText;
		var lab63 = document.getElementById("id_63").innerText;
		var lab64 = document.getElementById("id_64").innerText;
		var lab65 = document.getElementById("id_65").innerText;
		var lab66 = document.getElementById("id_66").innerText;
		var lab67 = document.getElementById("id_67").innerText;
		var lab68 = document.getElementById("id_68").innerText;
		var lab69 = document.getElementById("id_69").innerText;
		var lab70 = document.getElementById("id_70").innerText;
		var lab71 = document.getElementById("id_71").innerText;
		var lab72 = document.getElementById("id_72").innerText;
		var lab73 = document.getElementById("id_73").innerText;
		var lab74 = document.getElementById("id_74").innerText;
		var lab75 = document.getElementById("id_75").innerText;
		var lab76 = document.getElementById("id_76").innerText;
		var lab77 = document.getElementById("id_77").innerText;
		var lab78 = document.getElementById("id_78").innerText;
		var lab79 = document.getElementById("id_79").innerText;
	
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
	  		value6 = "_______";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	if(value7==null||value7==""){
	  		value7 = "_______";
	  	}
	  	var value7_1 = document.getElementById("value_7_1").value;
	  	if(value7_1==null||value7_1==""){
	  		value7_1 = "_______";
	  	}
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	if(value13==null||value13==""){
	  		value13 = "_______";
	  	}
	  	var value14 = document.getElementById("value_14").value;
	  	if(value14==null||value14==""){
	  		value14 = "_______";
	  	}
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var checkbox_1 = document.getElementById("checkbox_1").checked;
	  	var checkbox_2 = document.getElementById("checkbox_2").checked;
	  	var checkbox_3 = document.getElementById("checkbox_3").checked;
	  	var checkbox_4 = document.getElementById("checkbox_4").checked;
	  	var checkbox_5 = document.getElementById("checkbox_5").checked;
	  	var checkbox_6 = document.getElementById("checkbox_6").checked;
	  	var checkbox_7 = document.getElementById("checkbox_7").checked;
	  	var checkbox_8 = document.getElementById("checkbox_8").checked;
	  	var checkbox_9 = document.getElementById("checkbox_9").checked;
	  	var checkbox_10 = document.getElementById("checkbox_10").checked;
	  	var checkbox_11 = document.getElementById("checkbox_11").checked;
	  	var checkbox_12 = document.getElementById("checkbox_12").checked;
	  	var checkbox_13 = document.getElementById("checkbox_13").checked;
	  	var checkbox_14 = document.getElementById("checkbox_14").checked;
	  	var checkbox_15 = document.getElementById("checkbox_15").checked;
	  	var checkbox_16 = document.getElementById("checkbox_16").checked;
	  	var checkbox_17 = document.getElementById("checkbox_17").checked;
	  	var checkbox_18 = document.getElementById("checkbox_18").checked;
	  	var checkbox_19 = document.getElementById("checkbox_19").checked;
	
	  	var lab_str = "";
	  	if(checkbox_1){
	  		lab_str += "<strong>"+lab10+"</strong>,";
	  	}
	  	if(checkbox_2){
	  		lab_str += "<strong>"+lab11+"</strong>,";
	  	}
	  	if(checkbox_3){
	  		lab_str += "<strong>"+lab12+"</strong>,";
	  	}
	  	if(checkbox_4){
	  		lab_str += "<strong>"+lab13+"</strong>,";
	  	}
	  	if(checkbox_5){
	  		lab_str += "<strong>"+lab14+"</strong>,";
	  	}
	  	if(checkbox_6){
	  		lab_str += "<strong>"+lab15+"</strong>,";
	  	}
	  	if(checkbox_7){
	  		lab_str += "<strong>"+lab16+"</strong>,";
	  	}
	  	if(checkbox_8){
	  		lab_str += "<strong>"+lab17+"</strong>,";
	  	}
	  	if(checkbox_9){
	  		lab_str += "<strong>"+lab18+"</strong>,";
	  	}
	  	if(checkbox_10){
	  		lab_str += "<strong>"+lab19+"</strong>,";
	  	}
	  	if(checkbox_11){
	  		lab_str += "<strong>"+lab20+"</strong>,";
	  	}
	  	if(checkbox_12){
	  		lab_str += "<strong>"+lab21+"</strong>,";
	  	}
	  	if(checkbox_13){
	  		lab_str += "<strong>"+lab22+"</strong>,";
	  	}
	  	if(checkbox_14){
	  		lab_str += "<strong>"+lab23+"</strong>,";
	  	}
	  	if(checkbox_15){
	  		lab_str += "<strong>"+lab24+"</strong>,";
	  	}
	  	if(checkbox_16){
	  		lab_str += "<strong>"+lab25+"</strong>,";
	  	}
	  	lab_str=replceLastDH(lab_str);
		
	  	//患者家属选择
	  	var lab_xz = "";
	  	if(checkbox_17){
	  		lab_xz += "<strong>"+lab73+"</strong>,";
	  	}
	  	if(checkbox_18){
	  		lab_xz += "<strong>"+lab74+"</strong>,";
	  	}
	  	if(checkbox_19){
	  		lab_xz += "<strong>"+lab75+"</strong>,";
	  	}
	  	lab_xz=replceLastDH(lab_xz);
	  	
	  	if(value8==null||value8==""){
	  		value8 = "___________";
	  	}
	  	if(value9!=null&&value9!=""){
	  		var date = value9.split("/");
	  		value9 = date[0]+"年"+date[1]+"月"+date[2]+"日";
	  	}else{
	  		value9 = "___________";
	  	}
	  	if(value10==null||value10==""){
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
	  	
		if(value15==null||value15==""){
	  		value15 = "___________";
	  	}
		if(value16==null||value16==""){
	  		value16 = "___________";
	  	}
		if(value17==null||value17==""){
	  		value17 = "___________";
	  	}
	
		var text = "<p style=\"margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;\">"+lab_t1+"</p>";
		text += "<p style=\"margin:2mm 0 0 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;\">"+lab_t2+"</p>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+"<strong>"+value6+"</strong>"+lab8+"<strong>"+value7+"</strong>"+lab9+lab_str+lab26+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab27+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab30+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab31+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab32+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab33+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab34+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab35+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab36+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab37+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab38+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab39+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab40+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab41+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab42+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab43+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab44+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab45+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab46+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab47+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab48+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab49+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab50+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab51+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab52+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab53+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab54+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab55+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab56+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab57+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab58+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value7_1+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab59+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab60+"</strong></div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab61+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab62+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab63+"</div>";
		text +=	"<div style=\"text-indent: 2em\">"+lab64+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab65+value8+" "+lab66+value9+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab67+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab68+value10+" "+lab69+value11+" "+lab70+value12+"</td></tr></table>";
		text +=	"<div style=\"text-indent: 0em\">"+lab71+"</div>";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+value13+"</strong></div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab72+lab_xz+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab76+"<strong>"+value14+"</strong></div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr align='right' height='27'><td>"+lab77+value15+" "+lab78+value16+" "+lab79+value17+"</td></tr></table>";
		text += "</div>";
		$("#content").val(text);
		return true;
	}	
	
	 //参数获取
	function getparam(){
		$('#s1020 :input').each(function () {
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
	    var texthtml=document.getElementById("s1020").innerHTML;
		texthtml="<div id='s1020'>"+texthtml+"</div>";
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