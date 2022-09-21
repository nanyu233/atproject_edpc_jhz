<div id="s2013">
		<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
		<div>
			<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
			<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
			<p class="functype" id="id_title2">气管插管知情同意书</p>
			<div>
				<ul class="maintext">
					<li class="firstli">
						<label>诊断：</label>
						<input type="text" class="intextinputall" value="${hspemginfCustom.jbzdDes}"/>
					</li>
					<li class="firstli">
						<p>1．您的主诊医生是：<input type="text" class="intextinputlong"/>，气管插管将由<input type="text" class="intextinputlong"/>医生执行。</p>
						<p>2．这是一份有关气管插管的告知书。目的是告诉您有关气管插管操作及相关事宜。请您仔细阅读，提出与本次气管插管有关的任何疑问，决定是否同意气管插管。</p>
						<p>3．鉴于患者目前自主呼吸不能维持，循环功能非常不稳定，需要进行紧急气管插管，给予人工通气。由于已知或未知的原因，任何操作都有可能：不能达到预期结果；出现并发症、损伤甚至死亡。您有权知道气
						管插管的性质和目的、存在的风险、预期的效果或对人体的影响。在气管插管前的任何时间，您都有权接受或拒绝本次气管插管。</p>
					
						<p>4．医生会用通俗易懂的语言给您解释：</p>
						<p class="indenttwo">4.1 气管插管的性质、目的：为了维持病人的呼吸，挽救病人的生命。</p>
						<p class="indenttwo">4.2 预期的效果或对您的影响：改善病人的通气状况。</p>
						<p class="indenttwo">
							4.3 告诉任何可能伴随的不适、并发症或风险：由于气管插管本身是一项有创操作，为了使紧急气管插管更加容易，通常需要注射镇静药、肌松药和/或镇痛药等。因此，可能出现一下情况：
						</p>
						<p class="indentthree">1）药物引起的不良反应：</p>
						<p class="indentfour">
							a 镇静、镇痛药：如咪唑安定、芬太尼可引起血压下降，对严重心肺功能不全的抢救病人，有可能发生循环骤停，甚至死亡。
						</p>
						<p class="indentfour">
							b 肌松药：可引起组织胺释放，血压下降。
						</p>
						<p class="indentthree">
							其它：<input type="text" class="intextinputall"/></span>
						</p>
						<p class="indentthree">
							2）插管操作引起：牙齿损伤或脱落或其它口腔部位损伤、鼻出血、唇出血、呕吐、误吸喉痉挛、喉水肿、声带损伤出现咽痛声嘶、支气管痉挛、恶心心律失常等。
						</p>
						<p class="indenttwo">
							4.4 针对上述情况将采取防范措施：作为一个负责任的医师，我们将以良好的医德医风为患者实施这个方案，严格遵守医疗操作规范，密切观察病情变化，出现问题及时处理，力争将风险降低到最低限度。
						</p>
						
						<p>5．为了确保您对上述内容的准确理解，请您仔细阅读该知情同意书。如果您还有任何其它疑问，希望您及时告诉医生。</p>
					</li>
					<li class="firstli">
						<label>您以下的签名表示：</label>
						<label  class="mainreport">
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
						</label>
					</li>
					<li class="firstli">
						<span>
							<label>谈话医生：</label>
							<span><input type="text" class="intextinputlong"/></span>
						</span> 
						<span>
							<label>谈话时间：</label>
							<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</span>
					</li>
					<li class="firstli">
						<span>
							<label>患者意见：</label>
							<span><input type="text" class="intextinputlong"/></span>
						</span> 
						<span>
							<label>患者签名：</label>
							<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
						</span>
					</li>
					<li class="trunright">
						<label>时间：</label>
						<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</li>
				</ul>
			</div>
		</div>
		<script type="text/javascript">
		
		</script>
		</div>