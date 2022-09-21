<div id="s2008">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div>
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<div>
			<ul class="maintext bigfontmain">
				<li class="firstli">
					<label class="mainreport">
						一、患者因下列原因需做经外周穿刺执行静脉置管（请打√）：</label>
						<div style="text-indent: 2em">
						<input type="checkbox"  class="checkStyle" id="checkbox_1"><label class="doctorType" for="checkbox_1">需要输注有刺激、腐蚀性或高渗性药液者，如：静脉内营养、静脉化疗</label>
    					</div>
    					<div style="text-indent: 2em">
    					<input type="checkbox"  class="checkStyle" id="checkbox_2"><label class="doctorType" for="checkbox_2">需要开放静脉通路，但外周静脉难以维持输液的患者</label>
    					</div>
    					<div style="text-indent: 2em">
    					<input type="checkbox"  class="checkStyle" id="checkbox_3"><label class="doctorType" for="checkbox_3">输液疗程超过一周以上者</label>
    					</div>
    					<div style="text-indent: 2em">
    					<input type="checkbox"  class="checkStyle" id="checkbox_4"><label class="doctorType" for="checkbox_4">需要反复多次给药或多腔同时输入几种不相容药物者</label>
    					</div>
    					<div style="text-indent: 2em">
    					<input type="checkbox"  class="checkStyle" id="checkbox_5"><label class="doctorType" for="checkbox_5">为快速补液提供保障的患者</label>
    					</div>  					
				</li>
				<li class="firstli">
					<label class="mainreport">
					二、穿刺置管可能会发生以下并发症：</label>						
					<div style="text-indent:2em;">				
						<p>1、个体差异，血管变异，可能会出现穿刺失败</p>
						<p>2、出血、血肿形成</p>
						<p>3、静脉炎</p>
						<p>4、少数病人会发生导管异位、断裂、堵管、栓塞、感染、血栓形成、不能耐受植入的导管</p>
						<p>5、渗液、纤维包裹膜形成</p>
					</div>			
				</li>
				<li class="firstli">
					<label class="mainreport">
					三、医疗替代方案：</label>						
					<p style="text-indent:2em;">除经外周穿刺中心静脉导管（PICC）置管术，还可以选择深静脉置管术，输液港，但根据病情首选治疗方案为经外周穿刺中心静脉导管（PICC）置管术</p>			
				</li>
				<li class="firstli">
					<label class="mainreport">
					四、患方知情</label>						
					<p style="text-indent:2em;">医生已经告知我将要进行的经外周穿刺中心静脉导管（PICC）置管术的风险和并发症、其它的治疗方法并且解答了关于此次治疗的相关问题，我并未得到治疗百分之百成功的许诺无其他家属需再做谈话。签字为证。</p>			
				</li>
				</br></br>
				<li style="float: right;">
					<label>护士：</label>
					<span><input type="text" class="intextinputlong3"/></span>
				<li>
				<li>
					<label class="lthreefont">患者/家属签名：</label>
					<span><input type="text" class="intextinputlong3"/></span>
				</li>
				</br>
				<li style="float: right;">
					<label>日期：</label>
					<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
				</li>
			</ul>
		</div>
	</div>
	<script type="text/javascript">		
		$('.docuTitleBaisc').html('经外周穿刺中心静脉（PICC）置管术知情同意书');
		$('#basicTitleMsg').css("display","block");	
	</script>
	</div>