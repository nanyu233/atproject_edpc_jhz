<div id="s2007">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div>
	<!-- <p id="id_title1" class="hospitaltitle bigfont">${hospitalPlatformNameGap}</p> -->
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
	<p class="functype" id="id_title2">保护性约束知情同意书</p>
	<div>
		<ul class="maintext bigfontmain">
			<li class="infoli">
				<span>
					<label class="labeltwo">姓名</label>
					<input type="text" class=" intextinputlong" value="${hspemginfCustom.cstNam}">
				</span>
				<span>
					<label class="labeltwo">性别</label>
					<input type="text" class=" intextinputlong" value="${hspemginfCustom.cstSexCod}">
				</span>
				<span>
					<label class="labeltwo">年龄</label>
					<input type="text" class=" intextinputlong" value="${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}">
				</span>
				<span>
					<label class="labeltwo">病室</label> 
					<input type="text" class=" intextinputlong">
				</span>
			</li>
			<li class="infoli">
				<span>
					<label class="labeltwo">床号</label>
					<input type="text" class="intextinputlong" value="${hspemginfCustom.emgBed}">
				</span>
				<span>
					<label class="labelthree">住院号</label>
					<input type="text" class="shortone intextinput" value="${hspHlpgb.qxZyh}">
				</span>
				<span>
					<label class="labeltwo">诊断</label>
					<input class="longinput intextinput" type="text" value="${hspemginfCustom.jbzdDes}">
				</span>
			</li>
			<li class="firstli">
				<label class="mainreport">
					<p>家属同志：</p>
					<p style="text-indent:2em;">目前您的亲人因病情需要在体内置有各种管道，置管会给病人带来不适，医院通常给病人进行保护性约束，
					以最大程度防止病人自行拔出各种管道。保护性约束会给病人带来不适及心理上的影响，约束部分因病人的挣扎可能会出现皮肤及
					皮下组织损伤，并且保护性约束也无法完全杜绝意外拔管的发生。如不行保护性约束，病人在无法耐受时可能会自行拔出管道，
					而拔管后再次置管会增加病人的痛苦，及再次置管也会带来相应的风险，且存在拔出管道导致的不良后果和无法再次置管
					的可能。</p>
					<p style="text-indent:3em;">以上情况充分告知家属，请家属选择：</p>
					<p style="text-indent:3em;">1、采取保护性约束</p>
					<p style="text-indent:3em;">2、不采取保护性约束</p>
					<p>经慎重考虑，我本人/代表家属全权决定选择方案<input type="text" class="intextinput"/>并愿意承担由此引起的相应的
					风险及后果。</p>
				</label>
				<br/>
				<br/>
			</li>
			<li class="firstli">
				<span>
					<label>与患者关系：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span style="margin-left:8px;">
					<label>患者或被授权人的签名：</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
			</li>
		</ul>
	</div>
</div>
<script type="text/javascript">

</script>
</div>