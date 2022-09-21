<div id="ws2005">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div>
		<!-- <p class="hospitaltitle">${hospitalPlatformNameGap}</p> -->
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<p class="functype">诊疗操作知情同意书</p>
		<div>
			<ul class="maintext">
				<li>
					<label>
						这是一份关于 
						<font class="pointtext">脑血管造影术</font>
						的知情同意书，医生会用通俗易懂的方式告知该诊疗相关事宜。
					</label>
				</li>
				<li class="firstli">
					<label class="sectiontitle">1. 目前诊断(Current Diagnosis) </label>
				</li>
				<li>
				<label>[ 自发性蛛网膜下腔出血：颅内动脉瘤？ ]</label>
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
					<label>
						[术中的可能意外和风险：1.造影仅为检查手段，无任何治疗作用：若血管痉挛或其他原因导致导管手术失败，但仍
						需承担相应费用。2.造影剂过敏或损伤，导致休克、视力障碍、静脉炎、多脏器功能衰竭等。3.术前、术中动脉瘤破裂可能，
						血管穿孔或血管壁撕裂，造成脑出血或发生休克、死亡。4.血管痉挛、动脉夹层、血管内斑块脱落、空气栓塞，导致脑缺血、
						脑栓塞或脑梗死，致瘫痪、失语、昏迷、癫痫、死亡等。5.导管、导丝操作致心律失常、心跳骤停或导管折断、导丝扭结，
						可能需手术取出或终身带管，同时需终生服用抗凝药物。6.术中遇到其他难以预料的情况（包括心肌梗塞等），造成生命危
						险。
						<br/>
						术后可能发生的并发症和意外：1.术后穿刺部分血肿、假性动脉瘤或动静脉瘘形成，穿刺侧下肢血管痉挛、狭窄、血栓形成
						导致下肢缺血，可能需要进一步处理或手术治疗。2.感染，伤口周围皮肤过敏、破损。3.术前无法预见的危及生命的情况。
						4.手术并发症的治疗与检查等费用由患者负担。5.造影结果假阴性。]
					</label>
				</li>
				<li class="firstli">
					<label class="sectiontitle">4. 防范措施(Preventive Measures) </label>
				</li>
				<li>
					<span>1) 严格按照诊疗操作规范执行；</span><br>
					<span>2) 加强监测，仔细操作，及时处理。</span><br>
					<span class="twoGrid">3) 其他：</span><textarea id="areavalue" class="pretextarea qtmargin showym"></textarea><span id="spanvalue" class="prespan qtmargin showdy"></span><br>
				</li>
				<li class="firstli">
					<label class="sectiontitle">5. 可替代的方案(Alternative Programs)</label>
				</li>
				<li>
					<label class="checklabel">
						<input type="checkbox" name="alprograms">有[ CTA/MRA但准确性不足 ]
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
						<span><input type="text"/></span>
					</span>
					<label class="sectiontitle">签名时间：</label>
					<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</li>
				<li>
					<label class="sectiontitle">
						医师已经告知该诊疗操作的必要性和相关事项，我已充分理解并选择[脑血管造影术]治疗。
					</label>
				</li>
				<li class="inputli">
					<span>
						<label class="sectiontitle">患者或代理人签名：</label>
						<span><input type="text"/></span>
					</span>
					<span>
						<label class="sectiontitle">签字时间：</label>
						<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</span>
				</li>
				<li class="firstli">
					<table class="hdtable">
						<tr>
							<td colspan="2" class="tabletitle titletr">诊疗操作安全核对表</td>
						</tr>
						<tr>
							<td class="td-left">
								<label class="checklabel">
									<input type="checkbox">同意书填写完整正确
								</label>
							</td>
							<td>医生签名：<input type="text"/></td>
						</tr>
						<tr>
							<td class="td-left">
								<label class="checklabel">
									<input type="checkbox">患者身份正确
								</label>
							</td>
							<td>护士签名：<input type="text"/></td>
						</tr>
						<tr>
							<td class="td-left">
								<label class="checklabel">
									<input type="checkbox">检查/治疗项目正确
								</label>
							</td>
							<td>麻醉医师（如有）签名：<input type="text"/></td>
						</tr>
						<tr>
							<td class="td-left">
								<label class="checklabel">
									<input type="checkbox">处置部位正确
								</label>
							</td>
							<td>核对时间：
								<input class="Wdate spcWdate" type="text" style="width: 130px;" readonly="readonly" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
							</td>
						</tr>
						<tr>
							<td class="td-left">
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
	</div>