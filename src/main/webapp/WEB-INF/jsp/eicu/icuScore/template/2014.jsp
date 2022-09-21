<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
		<div class="basicDiv">
			<label class="firstlab wd30">患者姓名：<span id="bedNo"></span></label>
	        <label class="wd35">床号：<span id="custName"></span></label>
	        <label class="lastlab wd30">住院号：<span id="liveNo"></span></label>
		</div>
		<ul class="maintext">
			<li>
				<p class="sectiontitle">疾病介绍和治疗建议</p>
				<p class="indenttwo">医生已告知患者有<input type="text" class="intextinputlong"/>，需要进行气管插管和机械通气。机械通气的目的：改善呼吸功能，维持生命体征，为解除诱发加重因素争取时间。</p>
				<p class="sectiontitle">手术潜在风险和对策</p>
				<p class="indenttwo">医生告知患者气管插管和机械通气可能发生的一些风险，有些不常见的风险可能没有在此列出， 具体的操作根据不同病人的情况有所不同，医生已告知患者及家属可与患者的医生讨论有关患者操 作的具体内容，如果有特殊的问题可与患者的医生讨论。</p>
				<p class="indenttwo">1．我理解任何麻醉都存在风险。</p>
				<p class="indenttwo">2．我理解任何所用药物都可能产生副作用，包括轻度的恶心、皮疹等症状到严重的过敏性休克，甚至危及生命。</p>
				<p class="indenttwo">3．我理解此操作可能发生的风险和医生的对策。</p>
				<p class="sectiontitle indentthree">气管插管：</p>
				
				<p class="indentfour">1）刺激迷走神经引起呼吸心跳骤停；</p>
				<p class="indentfour">2）口腔局部损伤和牙齿脱落；</p>
				<p class="indentfour">3）咽部感染、喉头水肿及声带损伤；</p>
				<p class="indentfour">4）气管软骨脱位；</p>
				<p class="indentfour">5）误吸、肺部感染和肺不张；</p>
				<p class="indentfour">6）粘液栓、痰栓等引起急性气道阻塞；</p>
				<p class="indentfour">7）误入食道；</p>
				<p class="indentfour">8）插管失败；</p>
				<p class="sectiontitle indentthree">机械通气：</p>
				<p class="indentfour">1）呼吸机诱发的肺损伤，相关性肺部感染；</p>
				<p class="indentfour">2）患者不能脱离呼吸机，呼吸机依赖；</p>
				<p class="indentfour">3）血流动力学不稳定，血压下降，心律失常，心功能衰竭等循环功能障碍；</p>
				<p class="indentfour">4）患者与呼吸机不同步，致呼吸困难，呼吸功能衰竭继续加重；</p>
				<p class="indentfour">5）病人需要约束治疗；</p>
				<p class="indentfour">6）皮下气肿、纵膈气肿和气胸等；氧中毒；</p>
				<p class="indentfour">7）气管食管瘘；</p>
				<p class="indenttwo">
					4．我理解如果患者患有高血压、心脏病、糖尿病、肝肾功能不全、静脉血栓等疾病或者有吸烟史，以上这些风险可能会加大，或者在术中或术后出现相关的病情加重或心脑血管意外，甚至死亡。					
				</p>
				<p class="indenttwo">
					5．如果患者的体位不当或不遵医嘱，可能影响操作效果。								
				</p>
			</li>
			<li>
				<p class="sectiontitle">特殊风险或主要高危因素</p>
				<p class="indenttwo">
					我理解根据我个人的病情，可能出现以下特殊的并发症或风险：
					<textarea id="areavalue" class="pretextarea qtmargin"></textarea>
					<span id="spanvalue" class="prespan qtmargin">
				</p>
				<p class="indenttwo">
					一旦发生上述风险和意外，医生会采取积极应对措施。
				</p>
			</li>
			<li>
				<p class="sectiontitle">患者知情选择</p>
				<p class="indenttwo">1．我的医生已经告知我将要进行的操作方式、此次操作及操作后可能发生的并发症和风险、可能存在的其它治疗方法并且解答了我关于此次操作的相关问题。</p>
				<p class="indenttwo">2．我同意在操作中医生可以根据我的病情对预定的操作方式做出调整。</p>
				<p class="indenttwo">3．我理解我的操作需要多位医生共同进行。</p>
				<p class="indenttwo">4．我并未得到操作百分之百成功的许诺。</p>
				<p class="indenttwo">5．我授权医师对操作切除的病变器官、组织或标本进行处置，包括病理学检查、细胞学检查和医疗废物处理等。</p>
			</li>
			
			<li class="firstli">
				<label>您以下的签名表示：</label>
				<p class="indenttwo">
					1．您已阅读并理解、同意前面所述的内容；
				</p>
				<p class="indenttwo">
					2．您的医生对以上提出的情况向您作了充分的解释
				</p>
				<p class="indenttwo">
					3．您已经得到了有关麻醉的相关信息
				</p>
				<p class="indenttwo">
					4．您授权并要求医生为您施行上述麻醉操作。
				</p>
			</li>
			
			<li class="inputli">
				<span>
					<label>患者签名：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<label>签名日期：</label>
				<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
			</li>
			<li class="inputli">
				<p>
					如果患者无法签署知情同意书，请其授权的亲属在此签名：
				</p>
			</li>
			<li class="inputli">
				<span>
					<label>患者授权亲属签名:</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label>与患者关系:</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label>签字时间：</label>
					<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</span>
			</li>
		</ul>
	</div>

