<div id="s2038">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
	<p class="functype" id="id_title2"></p>
	<div>
		<ul class="maintext bigfontmain">
			<li class="firstli">
				<label class="mainreport">
					<p style="text-indent:4em;">尊敬的<input type="text" class="intextinput3"/>先生/女士：根据您住院期间的疾病程度、用药情况及身体状况等, 我们依据《住院患者坠床/跌倒风险评估表》进行了评估，患者属于坠床/跌倒高风险人群，特给予告知。(打钩者为您需要做到的)</p>
					<p style="text-indent:2em;">我们也将采取相关的措施，并希望得到您的配合。让我们共同努力，尽量防止坠床/跌倒事件发生。希望您或您的家人注意:</p>
					<p style="text-indent:2em;">(1)穿合适的裤子，并穿防滑鞋;湿性拖地后避免不必要的走动。</p>
					<p style="text-indent:2em;">(2)睡觉时请将床栏拉起，离床活动时应有人陪护。</p>
					<p style="text-indent:2em;">(3)请您将呼叫器、眼镜、杂志等放在随手易取之处，学会床边呼叫器的使用，需要时请及时呼叫，取得他人帮助。</p>
					<p style="text-indent:2em;">(4)改变体位应遵守“三部曲”:即平躺30秒，坐起30秒，站立30秒，再行走。避免突然改变体位，尤其是夜间。</p>
					<p style="text-indent:2em;">(5)如您头晕、或服用镇静安眠药物，下床前先坐于床缘，再由照顾者扶下床。如您在行走时出现头晕、双眼发黑、下肢无力、步态不稳和不能移动时，立即原地坐(蹲)下或靠墙，呼叫他人帮助。</p>
					<p style="text-indent:2em;">(6)请使用适当的助行器如拐杖等，并保证您的轮椅处于安全状态。</p>
					<p style="text-indent:2em;">(7)请您尽量将私人常用物品放置在固定位置，保持走道通畅。</p>
					<p style="text-indent:2em;">(8)因病情需要，患者有需要使用约束带或约束衣的可能，请您配合。</p>
					<br/>
					<p style="text-indent:2em;">我已阅读并理解以上事项&nbsp;&nbsp;<input type="checkbox"  class="checkStyle" id="checkbox_13"><label class="doctorType" for="checkbox_13">愿意</label> &nbsp;&nbsp;&nbsp;&nbsp;<input type="checkbox"  class="checkStyle" id="checkbox_14"><label class="doctorType" for="checkbox_14">不愿意</label>&nbsp;&nbsp;遵守</p>
				</label>
				<div>
					<span style="float: right;">护士签名:<input type="text" class="intextinputlong"/></span><br/><br/>
				</div>
				<div>
					<span style="float: right;">患者或家属签名:<input type="text" class="intextinputlong"/></span><br/><br/>
				</div>
				<div>
					<p style="float: right;">日期:<input class="Wdate spcWdate" type="text" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></p>
				</div>
			</li>
		</ul>
	</div>
</div>
<script type="text/javascript">
	$('.docuTitleBaisc').html('预防病原坠床/跌倒告知书');
	$('#basicTitleMsg').css("display","block");		
</script>
</div>