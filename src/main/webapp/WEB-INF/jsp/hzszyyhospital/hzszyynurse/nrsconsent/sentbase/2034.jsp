<div id="s2008">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div>
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<div>
			<ul class="maintext bigfontmain">
				<br>
				<li>
	            	<span class="smalltitle">目前诊断（Current Diagnosis）:</span>
	            	<textarea maxlength="500" class="pretextarea noPrintBq" id="zdTextarea"></textarea>
	            	<span class="onlyPrintBq" id="zd"></span>
	            </li>
	            
	            <li>
	            	<span class="smalltitle">诊疗操作目的（Purposes）：</span>
	            	<textarea maxlength="500" class="pretextarea noPrintBq" id="zlTextarea"></textarea>
	            	<span class="onlyPrintBq" id="zl"></span>
	            </li>
	            <li>
	            	<span class="smalltitle">主要意外、风险及并发症（Major Accidents，Risk and Complications）：</span>
	            	<textarea maxlength="500" class="pretextarea noPrintBq" id="zyTextarea"></textarea>
	            	<span class="onlyPrintBq" id="zy"></span>
	            </li>
	            <li>
	            	<span class="smalltitle">防范措施（Precautions）：</span>
	            	<textarea maxlength="500" class="pretextarea noPrintBq" id="ffTextarea"></textarea>
	            	<span class="onlyPrintBq" id="ff"></span>
	            </li>
	            <li>
	            	<span class="smalltitle">可替代的方案（Alternatives）：</span>
	            	<textarea maxlength="500" class="pretextarea noPrintBq" id="tdTextarea"></textarea>
	            	<span class="onlyPrintBq" id="td"></span>
	            </li>
				<li class="firstli">
					<div style="margin-top: 10px;">
						<label id="id_50"><b>谈话医师签名：</b></label>
						<input type="text" class="intextinputlong3" style="width: 100px;"/>
						<label>签名时间：</label>
						<input class="Wdate spcWdate m_t20" type="text" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
					</div>
					<br>	
					<p>我的医师已经告知我将要进行的治疗方式必要性、步骤、成功率、治疗及治疗后可能发生的风险和并发症、不实施该医疗措施的风险，操作中或操作后可能发生疼痛，及产生疼痛后的治疗措施，我已经慎重考虑，已充分理解本知情同意书的各项内容，愿意承担由于疾病本身或现有医疗技术所限而致的医疗意外和并发症，并选择本治疗（而非替代方案中的治疗方案）。</p>
					<div style="margin-top: 10px;">
						<label><b>被授权人/代理人签名：</b></label>
						<input type="text" class="intextinput" style="width: 100px;"/>
						<label>与患者的关系：</label>
						<input type="text" class="intextinput" style="width: 100px;"/>
						<label>签名日期：</label>
						<input class="Wdate spcWdate m_t20" type="text" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
					</div>	
				</li>
			</ul>
		</div>
	</div>
	<script type="text/javascript">		
		$('.docuTitleBaisc').css("display","none");
		$('#basicTitleMsg').css("display","block");	
		$('#WSID').css("display","block");
	</script>
	</div>