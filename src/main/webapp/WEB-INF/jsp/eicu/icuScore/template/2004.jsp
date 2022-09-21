<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<div>
		<ul class="maintext">
			<li>
				<p>
					这是一份关于 
					<font class="pointtext">脑血管造影术+支架辅助动脉瘤栓塞术</font>
					的知情同意书，医生会用通俗易懂的方式告知该诊疗相关事宜。
				</p>
			</li>
			<li class="firstli">
				<label class="sectiontitle">1. 目前诊断(Current Diagnosis)</label>
			</li>
			<li>
			<label>[ 颅内动脉瘤 ]</label>
			</li>
			<li class="firstli">
			<label class="sectiontitle">2. 诊疗操作目的(Purposes)</label>
			</li>
			<li>
				<label class="checklabel">
					<input type="checkbox">明确病因，完善诊断；
				</label>
				<label class="checklabel">
					<input type="checkbox">确定治疗方案，判定预后；
				</label>
				<label class="checklabel">
					<input type="checkbox">对症治疗，缓解病情；
				</label>
				<label class="checklabel">
					<input type="checkbox">其他
				</label>
			</li>
			<li class="firstli">
				<label class="sectiontitle">3. 主要意外、风险及并发症(Major Accidents, Risk Factors and Complications)</label>
			</li>
			<li>
				<p>
					[术中的可能意外和风险：1.造影剂过敏或损伤，导致休克、视力障碍、静脉炎、多脏器功能衰竭以及脱发等；2.血管破裂，造成脑出血，致瘫痪、失语、昏迷、癫痫、死亡等。3.操作部分及相关部分血管痉挛、动脉夹层、斑块脱落、空气栓塞，导致相关部位功能缺失，甚至瘫痪、失语、昏迷、死亡等。4.使用肝素等抗凝药物，造成凝血机制障碍，出血可能。介入材料在血管内可能诱发血栓，造成脑及其他脏器的梗塞。5.导管折断、导丝扭结，可能需手术取出或终身带管，同时需终生服用抗凝药物。6.根据动脉瘤形状、位置等决定具体手术方案，如为宽颈，或梭形动脉瘤，必须采用支架或球囊辅助栓塞术，支架可能无法到位，支架移位或塌陷，血管闭塞可能，造成神经功能缺失，出现生命危险。7.弹簧圈突入载瘤动脉，造成血管闭塞，发生相应脑缺血症状，导致脑梗死可能。出现意外情况改为手术可能。8.血管扭曲或严重痉挛等导致微导管、球囊或支架无法到位，手术失败。9.可能合并多发脑动脉瘤可能，由此手术风险加大，费用增加。
					<br>
					术后可能风险：1.动脉瘤栓塞不全、瘤颈残留，术后可能复发，需要定期随访，必要时再次治疗。2.蛛网膜下腔出血造成病情危重，术后昏迷不醒死亡可能。3.穿刺部位血肿、假性动脉瘤或动静脉瘘行程，穿刺侧下肢血管痉挛、狭窄、血栓形成导致下肢缺血，可能需要进一步处理或手术治疗。4.手术不成功仍需承担所需费用，出现意外积极抢救所产生的的费用由患者承担。5.有手术中死亡可能，有术后症状加重可能。]
				</p>
			</li>
			<li class="firstli">
				<label class="sectiontitle">4. 防范措施(Preventive Measures)</label>
			</li>
			<li>
				<span>1) 严格按照诊疗操作规范执行；</span><br>
				<span>2) 加强监测，仔细操作，及时处理。</span><br>
				<span class="twoGrid">3) 其他：</span> <textarea id="areavalue" class="pretextarea qtmargin showym"></textarea><span id="spanvalue" class="prespan qtmargin showdy"></span><br>
			</li>
			<li class="firstli">
				<label class="sectiontitle">5. 可替代的方案(Alternative Programs)</label>
			</li>
			<li>
				<label class="checklabel">
					<input type="checkbox" name="alprograms">有[ CTA/MRA 以及开颅手术治疗 ]
				</label>
				<label class="checklabel">
					<input type="checkbox" name="alprograms">不确定
				</label>
				<label class="checklabel">
					<input type="checkbox" name="alprograms">无
				</label>
			</li>
			<li class="inputli">
				<span>
					<label class="sectiontitle">谈话医师签名：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label class="sectiontitle">签名时间：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
			</li>
			<li class="firstli">
				<p class="sectiontitle">
					医师已经告知该诊疗操作的必要性和相关事项，我已充分理解并选择[脑血管造影术+动脉瘤介入栓塞术]治疗。
				</p>
			</li>
			<li class="inputli">
				<span>
					<label class="sectiontitle">患者或代理人签名：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label class="sectiontitle">签字时间：</label>
					<input class="Wdate spcWdate" readonly="readonly" style="width: 130px;" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</span>
			</li>
			<li class="firstli">
				<table>
					<tr>
						<td colspan="2" class="tabletitle titletr">诊疗操作安全核对表</td>
					</tr>
					<tr>
						<td class="td-bottom">
							<label class="checklabel">
								<input type="checkbox">同意书填写完整正确
							</label>
						</td>
						<td class="td-bottom">医生签名：<input type="text" class="intextinputlong"/></td>
					</tr>
					<tr>
						<td class="td-bottom">
							<label class="checklabel">
								<input type="checkbox">患者身份正确
							</label>
						</td>
						<td class="td-bottom">护士签名：<input type="text" class="intextinputlong"/></td>
					</tr>
					<tr>
						<td class="td-bottom">
							<label class="checklabel">
								<input type="checkbox">检查/治疗项目正确
							</label>
						</td>
						<td class="td-bottom">麻醉医师（如有）签名：<input type="text" class="intextinputlong"/></td>
					</tr>
					<tr>
						<td class="td-bottom">
							<label class="checklabel">
								<input type="checkbox">处置部位正确
							</label>
						</td>
						<td class="td-bottom">核对时间：
							<input class="Wdate spcWdate" readonly="readonly" type="text"onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</td>
					</tr>
					<tr>
						<td>
							<label class="checklabel">
								<input type="checkbox">设备/仪器正常 ( 操作仪器<input type="text" class="intextinputlong"/> )
							</label>
						</td>
						<td></td>
					</tr>
				</table>
			</li>
		</ul>
	</div>
</div>
<script type="text/javascript">
	function singlecheck(a,thisname){
		$(a).click(function(){
			if($(a).attr('checked')){
				$(thisname).removeAttr('checked');
				$(a).attr('checked','checked');
			}
		});
	}

	$('input[name="alprograms"]').each(function(){
		singlecheck(this,'input[name="alprograms"]');
	});
</script>
