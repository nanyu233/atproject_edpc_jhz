<div id="s2008">
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<div>
			<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
			<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
			<p class="functype" id="id_title2">急性缺血性卒中 rt-PA 静脉溶栓治疗知情同意书 </p>
			<div>
				<ul class="maintext">
					<li class="firstli" style="text-indent:2em;">
						<label class="mainreport">
							<span>
								根据您（患者姓名<input type="text" class="intextinputlong" value="${hspemginfCustom.cstNam}"/>）的临床症状、体征及 CT 检查表现，
								考虑您的脑部发生了严重的病变，医学上称为脑梗塞或是缺血性脑卒中。这种病
								变，是因您脑部的血流被血栓阻断所造成，有可能产生永久性的伤害。如果有方
								法可以快速溶解血栓，就有可能减少因血栓阻塞所引起的脑部损害程度。rt-PA，
								中文名叫重组组织型纤溶酶原激活剂，能够溶解血栓，目前被认为是对缺血性脑
								卒中最有效的药物治疗方式。患缺血性脑卒中的病人只有不到三分之一的机会可
								恢复到正常的功能。您若使用这种血栓溶解剂将会增加约 15%获得良好预后的机
								会。虽然 rt-PA 是目前所能建议的最好治疗方式，但是它也有一定风险性：100
								个使用这种血栓溶解剂的病人，约有 6 个病人，可能引起症状性脑出血的风险，
								严重者也可能导致死亡（不用这种血栓溶解剂的病人症状性脑出血的几率约为
								0.6％）。但是，研究显示此种药物可以降低缺血性脑卒中患者的死亡率。rt-PA
								还有可能引起过敏反应。我们没有办法保证不会发生严重的颅内或是身体其他部
								位的出血，但在治疗后，我们将密切注意一切变化，并尽一切可能来防止治疗药
								物产生的副作用。医生已经向我解释了 rt-PA 治疗急性卒中的风险和益处，并且
								回答了我提出的所有问题。我同意接受 rt-PA 静脉溶栓治疗。
							</span>
						</label>

					</li>
					<li class="firstli">
						<span>
							<label>患者签字：</label>
							<input type="text" class="intextinputlong"/>
						</span>
						<span>
							<label>签名日期：</label>
							<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</span>
					</li>
					<li class="firstli">
						<label>亲属/法定代表（如果需要）：我同意上述患者接受静脉 rt-PA 溶栓治疗。</label>
					</li>
					<li class="inputli">
						<label>亲属/法定代表姓名签字： </label>
						<span><input type="text" class="intextinputlong"/></span>
					</li>
					<li class="inputli">
						<label>亲属/法定代表与患者的关系：</label>
						<span><input type="text" class="intextinputlong"/></span>
					</li>
					<li class="inputli">
						<label>签名日期：</label>
						<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</li>
					<li class="firstli">
						<label>我已经对上述姓名的患者解释了 rt-PA 治疗急性卒中的风险和益处。</label>
					</li>
					<li class="firstli">
						<span>
							<label>医生签字：</label>
							<input type="text" class="intextinputlong"/>
						</span>
						<span>
							<label>签名日期：</label>
							<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</span>
					</li>
				</ul>
			</div>
		</div>
		<script type="text/javascript">
		
		</script>
		</div>