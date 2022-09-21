<div id="s2038">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
	<p class="functype" id="id_title2"></p>
	<div>
		<ul class="maintext bigfontmain">
			<li class="firstli3">
				<label class="mainreport">
					<p style="text-indent:2em;">尊敬的患者、患者家属或患者的法定监护人、授权委托人:</p>
					<p style="text-indent:2em;">患者因胸痛不适症状在我院就诊，按照医生的专业判断，应进行心脏标志物及心电图等检查，部分情况下我们还需要在2-6小时后再次复查，以协助明确胸部不适的病因。</p>
					<p style="text-indent:2em;">现因患者原因，未能完成诊疗流程里的标准评估而要求终止诊疗并离院，故我们我们不能对您病情进行全面、客观的评价。我们建议您出院后一定遵守 以下注意事项:</p>
					<p style="text-indent:2em;">1、遵守医嘱进行药物治疗(详见门诊病历记录和药物清单)，并坚持服药，疗程和药物调整请由医师决定。</p>
					<p style="text-indent:2em;">2、离院后如果症状无再发，可以在当地或社区医院随访。72 小时内须回本院心血管内科门诊复诊一次，听从医生建议进行必要的血液指标或心电图及其他复查。</p>
					<p style="text-indent:2em;">3、离院后如果出现症状反复加重，甚至持续不能缓解，呼吸困难、恶心呕吐、出汗或其他危急症状，务必保持冷静，并呼叫120送到医院就诊。</p>
					<p style="text-indent:2em;">4、注意避免过度劳累、情绪激动、饱餐、刺激性饮食，这些皆有加重心血管病病情的可能。</p>
					<p style="text-indent:2em;">5、坚持健康的生活方式，包括饮食调节、戒烟、适当运动、控制体重、控制血脂异常、高血压、糖尿病等。</p>
					<p style="text-indent:2em;">我们建议您听从医护人员的建议，完成医学的评估，以便您的疾病状况能得到及时妥善的处置。</p>
					<br/>
					<p style="text-indent:2em;">患者、患者家属或患者的法定监护人、授权委托人意见:</p>
					<p style="text-indent:2em;">医护人员已将自动离院可能出现的风险及相关事项向我作了详细的告知。我自愿承担自动离院所带来的风险和不良后果。我自动离院产生的不良后果与医院及医护人员无关。</p>
					<br/>
					<p style="text-indent:2em;">患者/家属签字:<input type="text" class="intextinputlong"/></p>
					<p style="text-indent:2em;">告知医生签字:<input type="text" class="intextinputlong"/></p>
					<p style="float: right;">签署知情同意书日期时间:<input class="Wdate spcWdate" type="text" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></p>
				</label>
			</li>
		</ul>
	</div>
</div>
<script type="text/javascript">
	$('.docuTitleBaisc').html('急诊胸痛留观患者提前终止观察及治疗离院知情同意书');
	$('#basicTitleMsg').css("display","block");		
</script>
</div>