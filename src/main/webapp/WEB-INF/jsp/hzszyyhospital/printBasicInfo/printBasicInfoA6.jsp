<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
		<div class="logoDivZJ">
			<img src="../images/hems/print/printLogo.jpg">
		</div>
		<div class="titleDivJZ">
			<div class="hosnameBasic" style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.32cm;line-height:1.25;">${nurseDocumentName}</div>
			<div id="docuTitle" class="docuTitleBaisc"></div>
			<ul class="print-ulB">
				<li>
					<span class="basic-span">
						<label class="title-label">姓名:</label>
						<span>{{baseMsg.cstNam}}</span>
					</span>
					<span class="basic-span">
						<label class="title-label">性别:</label>
						<span>{{baseMsg.cstSexCod}}</span>
					</span>
					<span class="basic-span">
						<label class="title-label">年龄:</label>
						<span id="_age">{{baseMsg.age}}</span>
					</span>
					<span class="basic-span">
						<label class="title-label">科别:</label>
						<span id="_emgFkCod">{{baseMsg.emgFkCod}}</span>
					</span>
					<span class="basic-span">
						<label class="title-label">病历号:</label>
						<span id="_mpi">{{baseMsg.mpi}}</span>
					</span>
				</li>
			</ul>
		</div>
		<div class="qrDivZJ">
			<img src="../images/hems/print/printQRCode.jpg">
		</div>
		<br>
		<hr style="width:100%;border-width:0.5px;color:#000;float:left;margin-top:1mm">
	<script>
		$(function (){
			$('.logoDivZJ').css({'display':'block','float':'left','width':'10%'});
			$('.logoDivZJ img').css({'vertical-align':'middle','text-align':'center','width':'12.5mm','float':'right'});
			$('.qrDivZJ').css({'display':'block','float':'right','width':'10%'});
			$('.qrDivZJ img').css({'vertical-align':'middle','text-align':'center','width':'12.5mm','float':'right'});
			$('.titleDivJZ').css({'float':'left','margin':'0','width':'80%','text-align':'center','margin-top':'1mm'});
			$('.titleDivJZ .hosnameBasic').css({'padding':'1mm 0 0 0','font-size':'.25cm','line-height':'1.2','font-weight':'bolder'});
			$('.titleDivJZ .docuTitleBaisc').css({'padding':'1mm 0 1mm 0','font-size':'.33cm','line-height':'1.2','font-weight':'bolder'});
			$('.titleDivJZ #WSID .docuTitleBaisc2').css({'padding':'1mm 0 1mm 0','font-size':'.33cm','line-height':'1.2','font-weight':'bolder'});
			$('.basic-span-input').css({'border-bottom': '1px solid #ddd', 'padding': '0 2px 2px 2px', 'margin-right': '5px', 'display': 'inline-block', 'min-width': '6mm'})
			$('.print-ulB').css({ "float": "left", "width": "100%", "font-size": "0.26cm", "margin": "0", "padding": "0" });
      		$('.print-ulB li').css({ "list-style": "none" });
			$('.print-ulB .basic-span span').css({ "margin-right": "3mm"});
		})
	</script>
</body>
</html>