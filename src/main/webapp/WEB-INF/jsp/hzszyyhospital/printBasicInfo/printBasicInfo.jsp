<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
		<div class="logoDivZJ">
			<img style="width:15mm" src="../images/hems/print/printLogo.jpg">
		</div>
		<div class="titleDivJZ">
			<div class="hosnameBasic" style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">${nurseDocumentName}</div>
			<div id="docuTitle" class="docuTitleBaisc">急诊科脑卒中溶栓流程核查表</div>
			<div id='WSID' style="display: none;">
				<input type="text" class="docuTitleBaisc2" style="width: 450px;" value='[文档标题]'/>
			</div>
		</div>
		<div style="clear: both"></div>
		<div id="basicTitleMsg" style="display: none; margin-top: 3mm;text-align: center;" class="print-title-div">
			<span>
				<label>姓名:</label>
				<span class="cstNam basic-span-input">${hspemginfCustom.cstNam} &nbsp;</span>
			</span>
			<span>
				<label>性别:</label>
				<span class="cstSexCod basic-span-input">${hspemginfCustom.cstSexCod} &nbsp;</span>
			</span>
			<span>
				<label>年龄:</label>
				<span class="cstAgeCod basic-span-input">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod} &nbsp;</span>
			</span>
			<span>
				<label>科别:</label>
				<span class="emgFkCod basic-span-input">急诊抢救室</span>
			</span>	
			<span>
				<label>床号:</label>
				<span class="emgBed basic-span-input">${hspemginfCustom.emgBed} &nbsp;</span>
			</span>				
			<span>
				<label>病历号:</label> 
				<span class="mpi basic-span-input">${hspemginfCustom.mpi} &nbsp;</span>
			</span>	
		</div>  
		<div style="clear: both"></div>
	<script>
		$(function (){
			$('.logoDivZJ').css({'display':'block','float':'left','width':'15%','margin-left':'10%'});
			$('.logoDivZJ img').css({'vertical-align':'middle','text-align':'center','width':'15mm','float':'right','margin-top':'2mm'});
			$('.titleDivJZ').css({'float':'left','margin':'0','width':'50%','text-align':'center','margin-top':'1mm'});
			$('.titleDivJZ .hosnameBasic').css({'padding':'1mm 0 0 0','font-size':'.55cm','line-height':'1.3'});
			$('.titleDivJZ .docuTitleBaisc').css({'padding':'1mm 0 1mm 0','font-size':'.55cm','line-height':'1.3','font-weight':'bolder'});
			$('.titleDivJZ #WSID .docuTitleBaisc2').css({'padding':'1mm 0 1mm 0','font-size':'.5cm','line-height':'1.3','font-weight':'bolder'});
			$('.basic-span-input').css({'border-bottom': '1px solid #ddd', 'padding': '0 2px 2px 2px', 'margin-right': '5px', 'display': 'inline-block', 'min-width': '6mm'})
		})
	</script>
</body>
</html>