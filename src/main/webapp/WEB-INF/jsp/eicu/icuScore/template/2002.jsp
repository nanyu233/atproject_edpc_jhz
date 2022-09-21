<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<div>
		<ul class="maintext">
			<li>
				<p>
					这是一份关于 
					<font class="pointtext">颈动脉狭窄球囊成形+支架植入术</font>
					的知情同意书，医生会用通俗易懂的方式告知该诊疗相关事宜。
				</p>
			</li>
			<li class="firstli">
				<label class="sectiontitle">1. 目前诊断(Current Diagnosis) </label>
			</li>
			<li>
			<label>[ 颈动脉狭窄 ]</label>
			</li>
			<li class="firstli">
			<label class="sectiontitle">2. 诊疗操作目的(Purposes) </label>
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
				<label class="sectiontitle">3. 主要意外、风险及并发症(Major Accidents, Risk Factors and Complications) </label>
			</li>
			<li>
				<p>
					[术中的可能意外和风险：1.造影剂过敏或损伤，导致休克、视力障碍、静脉炎、多脏器功能衰竭以及脱发等；2.造成脑出血，致瘫痪、失语、昏迷、癫痫、死亡等；3.操作部位及相关部位血管痉挛、动脉夹层、斑块脱落、空气栓塞，导致相关部位功能缺失，甚至瘫痪、失语、昏迷、死亡等；4.使用肝素等抗凝药物，造成凝血机制障碍，出血可能。介入材料在血管内可以诱发血栓，造成脑及其他脏器的梗塞；5.导管折断、导丝扭结，可能需手术取出或终身带管，同时需终生服用抗凝药物；6.支架脱落、打开不全，局部血栓形成、血栓脱落导致脑梗塞，导致严重残疾甚至死亡；7.血管撕裂损伤，造成局部出血，导致休克、梗塞、甚至危及生命；8.血管扭曲或严重痉挛等导致微导管、支架无法到位，手术失败。<br>
					术后可能风险：1.术后支架移位、再狭窄，需再次手术可能；2.穿刺部位血肿、假性动脉瘤或动静脉瘘形成，穿刺侧下肢血管痉挛、狭窄、血栓形成导致下肢缺血，可能需要进一步处理或手术治疗；3.手术不成功仍需承担所需费用，出现意外积极抢救所产生费用由患者承担；4.术后需长期双联（一年）抗血小板治疗，发生颅内外出血风险增加，严重时有导致病人死亡等可能。]
				</p>
			</li>
			<li class="firstli">
				<label class="sectiontitle">4. 防范措施(Preventive Measures) </label>
			</li>
			<li>
				<span>1) 严格按照诊疗操作规范执行；</span><br>
				<span>2) 加强监测，仔细操作，及时处理。</span><br>
				<span class="twoGrid">3) 其他：</span>
					<textarea id="areavalue" class="pretextarea qtmargin showym">
					</textarea><span id="spanvalue" class="prespan qtmargin showdy"></span><br>
			</li>
			<li class="firstli">
				<label class="sectiontitle">5. 可替代的方案(Alternative Programs)</label>
			</li>
			<li>
				<label class="checklabel">
					<input type="checkbox" name="alprograms">有[ 保守治疗 ]
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
					<label class="sectiontitle">操作人员：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label class="sectiontitle">谈话医师签名：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
			</li>
			<li class="inputli">
				<label class="sectiontitle">签名时间：</label>
				<input class="Wdate spcWdate" type="text" style="width: 130px;" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
			</li>
			<li class="firstli">
				<p class="sectiontitle">
					我的医师已经告知我将要进行的治疗方式必要性、步骤、成功率、治疗及治疗后可能发生的风险和并发症、不实施该医疗措施的风险，操作中或操作后可能发生疼痛，及产生疼痛后的治疗措施，我经慎重考虑，已充分理解本知情同意书的各项内容，愿意承担由于疾病本身或现有医疗技术所限而致的医疗意外和并发症，并选择本治疗(而非替代方案中的治疗方案)。
				</p>
			</li>
			<li class="inputli">
				<span>
					<label class="sectiontitle">患者签名：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label class="sectiontitle">签字时间：</label>
					<input class="Wdate spcWdate" readonly="readonly" style="width: 130px;" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</span>
			</li>
			<li class="inputli">
				<label class="sectiontitle">如果患者无法签署知情同意书，请其授权的代理人在此签名。</label>
			</li>
			<li class="inputli">
				<span>
					<label class="sectiontitle">被授权人/代理人签名： </label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label class="sectiontitle">与患者的关系：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
			</li>
			<li class="inputli">
				<label class="sectiontitle">签字时间：</label>
				<input class="Wdate spcWdate" readonly="readonly" style="width: 130px;" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
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
