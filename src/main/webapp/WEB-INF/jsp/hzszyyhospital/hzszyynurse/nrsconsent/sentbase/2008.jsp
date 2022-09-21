<div id="s2008">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div>
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<div>
			<ul class="maintext bigfontmain">
				<li class="firstli">
					<label class="mainreport">
						<p style="text-indent:2em;">尊敬的患者/家属：您好！</p>
						<p>根据您（您的家人）住院期间的疾病程度、用药情况身体状况等，我们根据《住院患者风险评估表》进行了评估，患者属于跌倒高风险人群，特给予告知，我们也将采取相关的措施，并希望得到您的配合。让我们共同努力，尽量防止跌倒事件发生。希望患者注意：</p>
						<div style="text-indent:2em;">				
							<p>1.合适的裤子，并穿防滑鞋。</p>
							<p>2.湿性拖地后避免不必要的走动。</p>
							<p>3.睡觉时请将床栏拉起，离床活动时应有人陪护。</p>
							<p>4.请您将信号灯、眼镜、杂志等放在随手易取之处，学会床边呼叫器的使用。</p>
							<p>5.如您头晕、或服用镇静安眠药物，在床前先坐于床缘，再由照顾者扶下床。</p>
							<p>6.如您在行走时出现头晕、双眼发黑、下肢无力、步态不稳和不能行走时，立即原地坐（蹲）下或靠墙床，呼叫他人帮助。</p>
							<p>7.改变体位应遵守“三部曲”：及平躺30秒，坐起30秒，站立30秒，再行走。避免突然改变体位，尤其是夜间。</p>
							<p>8.请您尽量将私人常用物品放置在固定位置，保持走道通畅。</p>
						</div>
						
					</label>
				</li>
				<br/>
				<li style="float: right;">
					<label class="lthreefont">签字日期：</label>
					<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</li>
				<li>
					<label class="lthreefont">谈话人：</label>
					<span><input type="text" class="intextinputlong3"/></span>
				</li>
				</br>
				<li style="float: right;">
					<label>与患者关系：</label>
					<span><input type="text" class="intextinputlong3"/></span>
				<li>
					<label>患者/家属签名：</label>
					<span><input type="text" class="intextinputlong3"/></span>
				</li>
				</br>
				<li style="float: right;">
					<label class="lthreefont">签字日期：</label>
					<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</li>
			</ul>
		</div>
	</div>
	<script type="text/javascript">		
		$('.docuTitleBaisc').html('预防病员坠床/跌倒告知书');
		$('#basicTitleMsg').css("display","block");	
	</script>
	</div>