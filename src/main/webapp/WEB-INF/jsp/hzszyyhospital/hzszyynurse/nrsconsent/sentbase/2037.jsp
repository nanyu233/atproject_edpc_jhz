<div id="s2007">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
	<div>
		<ul class="maintext bigfontmain">
			<li class="firstli2">
				<label class="mainreport">
					<p style="text-indent:2em;">尊敬的患者/家属：您好！</p>
					<p style="text-indent:2em;">病人出于下列原因：</p>
				</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_1"><label class="doctorType" for="checkbox_1" >预防坠床、撞伤、抓伤</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_2"><label class="doctorType" for="checkbox_2" >预防意外拔管</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_3"><label class="doctorType" for="checkbox_3" >认知障碍</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_4"><label class="doctorType" for="checkbox_4" >行为紊乱（自我伤害）</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_5"><label class="doctorType" for="checkbox_5" >协助治疗</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_6"><label class="doctorType" for="checkbox_6" >其他</label>
    				</div>
    			</label>
    			<label>
    				<p style="text-indent:2em;">需要进行身体/肢体保护性约束，约束可能会导致下列并发症：</p>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_7"><label class="doctorType" for="checkbox_7" >皮肤损伤：如擦伤、红肿、起泡、破溃、感染等。</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_8"><label class="doctorType" for="checkbox_8" >血液供应受限、肢体坏死。</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_9"><label class="doctorType" for="checkbox_9" >关节脱位、骨折等。</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_10"><label class="doctorType" for="checkbox_10" >神经损伤</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_11"><label class="doctorType" for="checkbox_11" >使用全身约束时可能影响呼吸，甚至窒息等。</label>
    				</div>
    			</label>
    			<label>
					<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_12"><label class="doctorType" for="checkbox_12" >其他不可预防的意外情况。</label>
    				</div>
    			</label>
    			<label>
					<p style="text-indent:2em;">如果发生上述并发症，医护人员将会立刻解除约束，并立即处理。</p>
					<p style="text-indent:2em;">我已阅读上述资料，再医护人员讲解下，我以了解约束的原因，以及约束可能产生的并发症和处理方式。</p>
				</label>
    			<label>
					<p style="text-indent:2em;">我（
				</label>
    			<label>
					<input type="checkbox"  class="checkStyle" id="checkbox_13">
				</label>
				<label class="doctorType" for="checkbox_13">同意
					&nbsp;&nbsp;&nbsp;&nbsp;
				</label>
    			<label>
					<input type="checkbox"  class="checkStyle" id="checkbox_14">
				</label>
				<label class="doctorType" for="checkbox_14">不同意
				</label>
    			<label>
					）接受必要的保护性约束措施，因此发生的风险，我们愿意承担。</p>
				</label>
				<label>
					<div>
						<p style="text-indent:2em;float: right;">与病人关系：<input type="text" class="intextinputlong" maxlength="10"></p>
					</div>
					<div>
						<p style="text-indent:2em;float: left;">患者/委托人签名：<input type="text" class="intextinputlong" maxlength="10"></p>
					</div>
				</label>
			<br/>
			</li>
			<br/>
			<li class="firstli2">
				<div style="text-indent: 2em">
					<span>谈话护士签名：<input type="text" class="intextinputlong" maxlength="10"></span>
					<span style="float: right;">
						日期：
						<input class="Wdate spcWdate" type="text" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
					</span>
				</div>
				<div style="float: right;">
				</div>
			</li>
			<li style="float: right;">
			</li>
		</ul>
	</div>
</div>
<script type="text/javascript">
		$('.docuTitleBaisc').html('保护性约束知情同意书');
		$('#basicTitleMsg').css("display","block");		
</script>
</div>