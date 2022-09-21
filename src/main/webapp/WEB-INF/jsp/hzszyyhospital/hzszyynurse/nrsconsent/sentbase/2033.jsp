<div id="s2031">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
	<p class="functype" id="id_title2"></p>
	<div>
		<ul class="maintext bigfontmain">
			<li class="firstli">
				<label class="mainreport">
					<p>尊敬的患者(或家属)：</p>
					<p style="text-indent:2em;">根据您的病情，我们依据国际上通用的压力损伤风险评估量表《Braden评分表》进行评估，您属于压力性损伤高危风险人群，即容易并发压力性损伤，特给予告知。在您的诊治过程中，医护人员会严格遵守操作规程，以最大限度降低上述风险，也希望得到您的配合，具体如下:</p>
					<p style="text-indent:2em;">1、请您配合定时翻身，因为减压是预防压力性损伤最有效的方法。</p>
					<p style="text-indent:2em;">2、请使用翻身垫、软枕、防护敷料或其他辅助物支托，避免骨突部位受压。</p>
					<p style="text-indent:2em;">3、如您的病情允许，请将床头抬高<30°，避免摩擦力和剪切力对皮肤产生的损伤。</p>
					<p style="text-indent:2em;">4、请注意营养的摄入，以增强机体抵抗力。</p>
					<p style="text-indent:2em;">5、您卧床时，请避免衣物和床单位的褶皱让皮肤受压，保持衣物和床单位的清洁平整。</p>
					<p style="text-indent:2em;">6、如您的皮肤干燥，请使用润肤液保持皮肤的滋润度。</p>
					<p style="text-indent:2em;">7、如您有大/小便失禁，要避免大便/小便对皮肤的刺激，保持皮肤清洁，及时更换潮湿的护理垫，使用相关的皮肤防护用品。</p>
					<p style="text-indent:2em;">8、如您的身上有管道(如输液管道、导尿管、引流管、吸氧管、胃管等)，避免管道对皮肤产生的压迫。</p>
					<p style="text-indent:2em;">9、根据您的情况，必要时使用特殊床垫(如气垫床、翻身床)来减压;必要时选择合适的敷料(如皮肤保护膜、皮肤保护粉、水胶体敷料、泡沫敷料、银离子敷料)等防治压力性损伤。</p>
					<p style="float: right;">日期:<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></p>
					<p style="text-indent:2em;">责任护士签名：<input type="text" class="intextinputlong"/></p><br/>
					<p style="text-indent:2em;">护士已经告知我压力性损伤高危风险的防范举措，我经慎重考虑，已充分理解本知情同意书的各项内容，将积极配合并愿意承担由于疾病本身或现有医疗技术所限而致的压力性损伤。</p><br/>
					<p style="float: right;">日期:<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></p>
					<p style="text-indent:2em;">患者/家属签名:<input type="text" class="intextinputlong"/></p><br/>
				</label>
			</li>
		</ul>
	</div>
</div>
<script type="text/javascript">
	$('.docuTitleBaisc').html('压力性损伤高危风险知情同意书');
	$('#basicTitleMsg').css("display","block");		
</script>
</div>