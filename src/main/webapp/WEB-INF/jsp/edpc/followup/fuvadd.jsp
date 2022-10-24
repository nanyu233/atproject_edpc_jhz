<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>胸痛中心随访</title>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" charset="utf-8">
        var _fuvSeq = '';
        if('${fuvSeq}'!='null')
        	_fuvSeq = '${fuvSeq}';
		var _patId  = "${patId}";
		var _plnSeq  = "${plnSeq}";
		var _showSaveButton = "${showSaveButton}";
    </script>
    <script type="text/javascript" src="lib/moment.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
    <script src="js/edpc/followup/fuvadd.avalon.js?6" type="text/javascript" charset="UTF-8"></script>
</head>
<style>
.info {
	border: 1px solid #ddd;
	margin-bottom: 10px;
}

.info h4 {
	margin: 10px 0;
	padding: 0 0 10px 10px;
	border-bottom: 1px solid #ddd;
}

.info .innerTitle {
	margin: 10px 0;
	padding: 10px 0 10px 10px;
	border-bottom: 1px solid #ddd;
	border-top: 1px solid #ddd;
}

.one {
	background-color: #FBD4B4;
}

.wrapper div {
	display: inline-block;
	/* border: 1px solid black; */
	margin: 10px 0 10px 10px;
}

.info input[type="text"] {
	border: none;
	border-bottom: 1px solid black;
	background-color: transparent;
	text-align: center;
	font-size: 15px;
}

.longInput {
	width: 132px !important;
}

.shortInput {
	width: 50px !important;
}

.Wdate {
	width: 178px;
}

.shortTimeInput {
	width: 75px !important;
}

.btns {
	border: 1px solid #ddd;
	text-align: center;
}

.btns a {
	display: inline-block;
	width: 80px;
	text-align: center;
	height: 25px;
	line-height: 25px;
	margin: 10px;
	border-radius: 5px;
	border: 1px solid #adcde2;
	background-color: #1E90FF;
	cursor: pointer;
}

.btns b {
	display: inline-block;
	width: 80px;
	text-align: center;
	height: 25px;
	line-height: 25px;
	margin: 10px;
	border-radius: 5px;
	border: 1px solid #adcde2;
	background-color: #A9A9A9;
	cursor: pointer;
}

.hidden {
	display: none;
}

.trsq .recpTable td.indentTd {
	text-indent: 4px;
}

.trsq .wrapperDiv {
	width: 195mm;
	margin: 0 auto;
}

.managetable {
	border: 1px solid #000;
	margin-top: 10px;
}

.receTp .recpTable {
	width: 80%;
	margin-left: 5%;
	margin-right: 5%;
	margin-top: 15px;
	float: center;
}

.receTp .recpTable td {
	border: 1px solid #000;
	height: 26px;
	padding: 1px 0;
	line-height: 26px;
}

#ws2042 .receTp .recpTable td {
	padding-left: 3px;
}

.receTp .recpTable td.tleTd {
	text-align: center;
}

.receTp .recpTable td.indentTd {
	text-indent: 4px;
}

.receTp .recpTable .marginVal {
	float: left;
	width: 100%;
	margin-top: 3px;
	margin-bottom: 3px;
	height: 26px;
	line-height: 26px;
}

.cleanfloat::after{display: block; clear: both; content:""; visibility: hidden; height: 0;}/*清浮动*/
 ul li{list-style:none; float:left; font-size:30px; margin-left:5px; color:#ccc; cursor:pointer;}/*五角星样式*/
.hs,.cs{color:#FF0000;}/*五角星点击后样式*/

</style>
<body>
  <form ms-controller="fuvadd" id="fuvform" action="${baseurl}followup/fuvsubmit.do" method="post">
   	<input type="hidden" name="hspFuvInfCustom.fuvSeq" ms-duplex-string="hspFuvInfCustom.fuvSeq">
   	<input type="hidden" value="${plnSeq}" name="hspFuvInfCustom.plnSeq">
   	<input type="hidden" value="${patId}" name="hspFuvInfCustom.patId">
   	<input type="hidden" value="3" name="hspFuvInfCustom.plnSta">
	<div class="tys receTp">
		<div class="wrapperDiv">
			<input type="hidden" ms-duplex-string="sysdata.seqno">
			<table class="managetable recpTable">
				<tr>
					<td class="indentTd" colspan="8">
						<label>冠脉支架术后随访</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>满意度：</label>
					</td>
					<td class="indentTd" colspan="7">
<!-- 						<ul class="cleanfloat"> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					   </ul> -->
						<label ms-repeat="getMsg.MYDArr" ms-attr-for="dgrStf{{el.infocode}}">
				            	<input ms-attr-id="dgrStf{{el.infocode}}" type="radio" name="hspFuvInfCustom.dgrStf" ms-attr-value="el.infocode"
				              	ms-duplex-string="hspFuvInfCustom.dgrStf" ms-click="onRadioClick('dgrStf',el.infocode)" style="margin-left:8px;"/> {{el.info}}
			          	</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>对象：</label>
					</td>
					<td class="indentTd" colspan="1">
						{{hspFuvPatCustom.patNam}}
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>性别：</label>
					</td>
					<td class="indentTd" colspan="1">
			          		{{hspFuvPatCustom.cstSexCodStr}}
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>出生日期：</label>
					</td>
					<td class="indentTd" colspan="1">
						{{hspFuvPatCustom.bthDat}}
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label>联系电话：</label>
					</td>
					<td class="indentTd" colspan="1">
						{{hspFuvPatCustom.lnkNbr}}
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>民族：</label>
					</td>
					<td class="indentTd" colspan="1">
						<div class="input">{{hspFuvPatCustom.patNatCodStr}}</div>
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>婚姻状况：</label>
					</td>
					<td class="indentTd" colspan="1">
						<div class="input">{{hspFuvPatCustom.marStaCodStr}}</div>
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>职业：</label>
					</td>
					<td class="indentTd" colspan="1">
						{{hspFuvPatCustom.patJob}}
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label>身份证号：</label>
					</td>
					<td class="indentTd" colspan="1">
						{{hspFuvPatCustom.idNbr}}
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>地址：</label>
					</td>
					<td class="indentTd" colspan="1">
						{{hspFuvPatCustom.patAdr}}
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>随访方式：</label>
					</td>
					<td class="indentTd" colspan="1">
                        <label ms-repeat="getMsg.fuvWayCodArr" ms-attr-for="fuvWayCod{{el.infocode}}">
							<input ms-attr-id="fuvWayCod{{el.infocode}}" type="checkbox" name="hspFuvInfCustom.fuvWayCod" ms-attr-value="el.infocode"
							ms-duplex-string="hspFuvInfCustom.fuvWayCod" ms-click="onRadioClick('fuvWayCod',el.infocode)"/> {{el.info}}
						</label>
                    </td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>随访类别：</label>
					</td>
					<td class="indentTd" colspan="1">
						<select class="departments" id="fuvTyp" name="hspFuvInfCustom.fuvTyp" ms-duplex-string="hspFuvInfCustom.fuvTyp">
                      		 <option value="">请选择</option>
                     	 	 <option ms-repeat="getMsg.fuvTypArr" ms-attr-value="el.infocode">{{el.info}}</option>
                  		</select>
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label>随访时间：</label>
					</td>
					<td class="indentTd" colspan="1">
						<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" 
						name="hspFuvInfCustom.fuvTim" id="fuv_fuvTim" ms-duplex-string="hspFuvInfCustom.fuvTim" value="${hspFuvInfCustom.fuvTim}"/>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>电话：</label>
					</td>
					<td class="indentTd" colspan="1">
						<input type="text" class="intextinput datedate" name="hspFuvPatCustom.patTel" id="fuv_patTel"
						ms-duplex-string="hspFuvPatCustom.patTel" maxlength="30" value="${hspFuvPatCustom.patTel}" readonly="readonly"/>
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>随访组：</label>
					</td>
					<td class="indentTd" colspan="1">
						<select class="departments" id="fuvGrp" name="aidEptGrp.grpNam" ms-duplex-string="aidEptGrp.grpNam">
                      		 <option value="">请选择</option>
                     	 	 <option ms-repeat="getMsg.fuvGrpArr" ms-attr-value="el._parentId" >{{el.grpNam}}</option>
                  		</select>
					</td>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>本次随访医生：</label>
					</td>
					<td class="indentTd" colspan="1">
						<select class="departments" id="fuvDoc" name="aidEptGrp.usrname" ms-duplex-string="aidEptGrp.usrname">
                      		 <option value="">请选择</option>
                     	 	 <option ms-repeat="getMsg.fuvDocArr" ms-attr-value="el._parentId" ms-visible="(aidEptGrp._parentId==''||aidEptGrp.grpSeq==el._parentId)">{{el.usrname}}</option>
                  		</select>
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label>出院日期：</label>
					</td>
					<td class="indentTd" colspan="1">
						<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" 
						name="hspFuvInfCustom.outTim" id="fuv_outTim" ms-duplex-string="hspFuvInfCustom.outTim" value="${outTim}"/>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>诊断：</label>
					</td>
					<td class="indentTd" colspan="7">
						<input type="text" style="width:400px;" 
						name="hspFuvInfCustom.diaRst" id="fuv_diaRst" ms-duplex-string="hspFuvInfCustom.diaRst" maxlength="100" value="${diaRst}"/>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
						<label>随访内容</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
						<label>基本情况</label>
					</td>
				</tr>
				<tr>
					<td rowspan="2" style="text-align:right">
						<label>症状：</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
                        <label ms-repeat="getMsg.patSymCodSel" ms-attr-for="patSymCod{{el.infocode}}">
                            <input ms-attr-id="patSymCod{{el.infocode}}" type="checkbox" ms-duplex="hspFuvInfCustom.patSymCod" ms-attr-value="el.infocode"
                            ms-click="onCheckClick('patSymCod',el.infocode)" style="margin-left:6px;"> {{el.info}}<br/>
                        </label> 
                        <input class="hidden" ms-duplex-string="hideMsg.patSymCod" name="hspFuvInfCustom.patSymCod">
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>体重：</label>
					</td>
					<td class="indentTd" colspan="7">
						<input type="text" style="width:80px;" name="hspFuvInfCustom.patWgt" id="fuv_patWgt" 
						ms-duplex-string="hspFuvInfCustom.patWgt" ms-keyup="onlyNum('hspFuvInfCustom','patWgt')" 
						ms-change="onlyNum('hspFuvInfCustom','patWgt')" ms-input="onlyNum('hspFuvInfCustom','patWgt')" 
						value="${hspFuvInfCustom.patWgt}"/>kg
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
						<label>生活指导方式</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>日吸烟量（支）：</label>
					</td>
					<td class="indentTd" colspan="2">
						<input type="text" class="intextinput datedate" name="hspFuvInfCustom.smkCon" id="fuv_smkCon" 
						ms-duplex-string="hspFuvInfCustom.smkCon" ms-keyup="onlyNum('hspFuvInfCustom','patWgt')" 
						ms-change="onlyNum('hspFuvInfCustom','patWgt')" ms-input="onlyNum('hspFuvInfCustom','patWgt')" 
						value="${hspFuvInfCustom.smkCon}" />
					</td>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>日饮酒量（两）：</label>
					</td>
					<td class="indentTd" colspan="2">
						<input type="text" class="intextinput datedate" name="hspFuvInfCustom.alcCon" id="fuv_alcCon"
						ms-duplex-string="hspFuvInfCustom.alcCon"  ms-keyup="onlyNum('hspFuvInfCustom','alcCon')"  
						ms-change="onlyNum('hspFuvInfCustom','alcCon')" ms-input="onlyNum('hspFuvInfCustom','alcCon')" 
						value="${hspFuvInfCustom.alcCon}"/>
					</td>
				<tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>主食情况（克/日）：</label>
					</td>
					<td class="indentTd" colspan="2">
						<input type="text" class="intextinput datedate" name="hspFuvInfCustom.fodCon" id="fuv_fodCon" 
						ms-duplex-string="hspFuvInfCustom.fodCon" />
					</td>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>摄盐情况：</label>
					</td>
					<td class="indentTd" colspan="2">                                                                                                  
						<label ms-repeat="getMsg.sltConCodArr" ms-attr-for="sltConCod{{el.infocode}}">
							<input ms-attr-id="sltConCod{{el.infocode}}" type="checkbox" name="hspFuvInfCustom.sltConCod" ms-attr-value="el.infocode"
							ms-duplex-string="hspFuvInfCustom.sltConCod" ms-click="onRadioClick('sltConCod',el.infocode)"/> {{el.info}}
						</label>
					</td>
				<tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>运动情况：</label>
					</td>
					<td class="indentTd" colspan="2">
						<input type="text" style="width:30px;margin-left:30px;" 
						name="hspFuvInfCustom.sptConWek" id="fuv_sptConWek"
						ms-duplex-string="hspFuvInfCustom.sptConWek"  ms-keyup="onlyNum('hspFuvInfCustom','sptConWek')"  
						ms-change="onlyNum('hspFuvInfCustom','sptConWek')" ms-input="onlyNum('hspFuvInfCustom','sptConWek')"/>
						<label>次/周</label> 
						<input type="text" style="width:30px;margin-left:80px;" 
						name="hspFuvInfCustom.sptConTim" id="fuv_sptConTim"
						ms-duplex-string="hspFuvInfCustom.sptConTim"  ms-keyup="onlyNum('hspFuvInfCustom','sptConTim')"  
						ms-change="onlyNum('hspFuvInfCustom','sptConTim')" ms-input="onlyNum('hspFuvInfCustom','sptConTim')"/>
						<label>分钟/次</label>
					</td>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>心理调整：</label>
					</td>
					<td class="indentTd" colspan="2" >
                        <label ms-repeat="getMsg.mtlSetCodArr" ms-attr-for="mtlSetCod{{el.infocode}}">
							<input ms-attr-id="mtlSetCod{{el.infocode}}" type="checkbox" name="hspFuvInfCustom.mtlSetCod" ms-attr-value="el.infocode"
							ms-duplex-string="hspFuvInfCustom.mtlSetCod" ms-click="onRadioClick('mtlSetCod',el.infocode)"/> {{el.info}}
						</label>
					</td>
				<tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>遵医行为：</label>
					</td>
					<td class="indentTd" colspan="6">
                        <label ms-repeat="getMsg.comActCodArr" ms-attr-for="comActCod{{el.infocode}}">
							<input ms-attr-id="comActCod{{el.infocode}}" type="checkbox" name="hspFuvInfCustom.comActCod" ms-attr-value="el.infocode"
							ms-duplex-string="hspFuvInfCustom.comActCod" ms-click="onRadioClick('comActCod',el.infocode)"/> {{el.info}}
						</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
						<label>辅助检查</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>辅助检查：</label>
					</td>
					<td class="indentTd" colspan="6">
                        <label ms-repeat="getMsg.assExmCodSel" ms-attr-for="assExmCod{{el.infocode}}">
                            <input ms-attr-id="assExmCod{{el.infocode}}" type="checkbox" ms-duplex="hspFuvInfCustom.assExmCod" ms-attr-value="el.infocode"
                            ms-click="onCheckClick('assExmCod',el.infocode)"> {{el.info}}
                        </label> 
                        <input class="hidden" ms-duplex-string="hideMsg.assExmCod" name="hspFuvInfCustom.assExmCod">
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>辅助检查结果说明：</label>
					</td>
					<td class="indentTd" colspan="6">
						<input type="text" style="width:400px;" name="hspFuvInfCustom.exmRst" id="fuv_exmRst" 
						ms-duplex-string="hspFuvInfCustom.exmRst" maxlength="100" value="${hspFuvInfCustom.exmRst}"/>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
						<label>用药情况</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:center">
						<label>药物名称：</label>
					</td>
					<td class="indentTd" colspan="2" style="text-align:center">
						<label>规格</label>
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label>用量</label>
					</td>
					<td class="indentTd" colspan="2" style="text-align:center">
						<label>用法</label>
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label>操作</label>
					</td>
				</tr>
				<tr ms-repeat="hspFuvMedInfList">
					<td class="indentTd" colspan="2" style="text-align:center">
						<input type="text" ms-attr-name="hspFuvInfCustom.hspFuvMedInfList[{{$index}}].medNam" ms-attr-id="fuv_medNam{{$index}}" ms-duplex-string="el.medNam" />
					</td>
					<td class="indentTd" colspan="2" style="text-align:center">
						<input type="text" ms-attr-name="hspFuvInfCustom.hspFuvMedInfList[{{$index}}].medSpe" ms-attr-id="fuv_medSpe{{$index}}" ms-duplex-string="el.medSpe" />
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<input type="text" ms-attr-name="hspFuvInfCustom.hspFuvMedInfList[{{$index}}].medQty" ms-attr-id="fuv_medQty{{$index}}" style="width:80px;" ms-duplex-string="el.medQty"/>
					</td>
					<td class="indentTd" colspan="2" style="text-align:center">
						<input type="text" ms-attr-name="hspFuvInfCustom.hspFuvMedInfList[{{$index}}].medMtd" ms-attr-id="fuv_medMtd{{$index}}" ms-duplex-string="el.medMtd"/>
					</td>
					<td class="indentTd" colspan="1" style="text-align:center">
						<label ms-if="$index==0">
			              <img src="${baseurl}images/hzszyyhems/note/3.png" alt="新增" ms-click="addNewLine('hspFuvMedInf')" />
			              <img src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" ms-click="deleteLine('hspFuvMedInf')" />
						  <input type="hidden" style="width:80px;" name="medCon" id="fuv_medCon" ms-duplex-string="hspFuvInfCustom.medCon"/>
			            </label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>合并疾病：</label>
					</td>
					<td class="indentTd" colspan="6">
                        <label ms-repeat="getMsg.cooMbtCodSel" ms-attr-for="cooMbtCod{{el.infocode}}">
                            <input ms-attr-id="cooMbtCod{{el.infocode}}" type="checkbox" ms-duplex="hspFuvInfCustom.cooMbtCod" ms-attr-value="el.infocode"
                            ms-click="onCheckClick('cooMbtCod',el.infocode)"> {{el.info}}
                        </label> 
                        <input class="hidden" ms-duplex-string="hideMsg.cooMbtCod" name="hspFuvInfCustom.cooMbtCod"> 
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>按时复诊：</label>
					</td>
					<td class="indentTd" colspan="6">
                        <label ms-repeat="getMsg.scdVstCodArr" ms-attr-for="scdVstCod{{el.infocode}}">
				            <input ms-attr-id="scdVstCod{{el.infocode}}" type="checkbox" name="hspFuvInfCustom.scdVstCod" ms-attr-value="el.infocode"
				              ms-duplex-string="hspFuvInfCustom.scdVstCod" ms-click="onRadioClick('scdVstCod',el.infocode)"/> {{el.info}}
			          	</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>服药情况：</label>
					</td>
					<td class="indentTd" colspan="6">
                        <label ms-repeat="getMsg.FYQKArr" ms-attr-for="takMedCod{{el.infocode}}">
				            <input ms-attr-id="takMedCod{{el.infocode}}" type="radio" name="hspFuvInfCustom.takMedCod" ms-attr-value="el.infocode"
				              ms-duplex-string="hspFuvInfCustom.takMedCod" ms-click="onRadioClick('takMedCod',el.infocode)"/> {{el.info}}
			          	</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>药物不良反应：</label>
					</td>
					<td class="indentTd" colspan="6">
                        <label ms-repeat="getMsg.YWBLFYArr" ms-attr-for="medRftFlg{{el.infocode}}">
				            <input ms-attr-id="medRftFlg{{el.infocode}}" type="radio" name="hspFuvInfCustom.medRftFlg" ms-attr-value="el.infocode"
				              ms-duplex-string="hspFuvInfCustom.medRftFlg" ms-click="onRadioClick('medRftFlg',el.infocode)"/> {{el.info}}
			          	</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="2" style="text-align:right">
						<label>是否出血：</label>
					</td>
					<td class="indentTd" colspan="6">                    
                        <label ms-repeat="getMsg.SFCXArr" ms-attr-for="havBldFlg{{el.infocode}}">
				            <input ms-attr-id="havBldFlg{{el.infocode}}" type="radio" name="hspFuvInfCustom.havBldFlg" ms-attr-value="el.infocode"
				              ms-duplex-string="hspFuvInfCustom.havBldFlg" ms-click="onRadioClick('havBldFlg',el.infocode)"/> {{el.info}}
			          	</label> 
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8">
						<label>随访说明及下次随访计划</label>
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>附加说明：</label>
					</td>
					<td class="indentTd" colspan="7">
						<input type="text" style="width:460px;" name="hspFuvInfCustom.addExp" id="fuv_addExp" 
						ms-duplex-string="hspFuvInfCustom.addExp" maxlength="100" value="${hspFuvInfCustom.addExp}">
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>下次随访：</label>
					</td>
					<td class="indentTd" colspan="7">
                        <label ms-repeat="getMsg.SFXCSFArr" ms-attr-for="fuvAgnFlg{{el.infocode}}">
				            <input ms-attr-id="fuvAgnFlg{{el.infocode}}" type="radio" name="hspFuvInfCustom.fuvAgnFlg" ms-attr-value="el.infocode"
				              ms-duplex-string="hspFuvInfCustom.fuvAgnFlg" ms-click="onRadioClick('fuvAgnFlg',el.infocode)"/> {{el.info}}
			          	</label>
						
						
						<label style="margin-left:30px;" >下次</label>
						<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})"
						name="hspFuvInfCustom.nxtFuvTim" id="fuv_nxtFuvTim" ms-duplex-string="hspFuvInfCustom.nxtFuvTim" value="${hspFuvInfCustom.nxtFuvTim}"/> 
						
						
						<label style="margin-left:30px;">组</label>
						<select class="departments" id="nxtFuvGrp" name="hspFuvInfCustom.nxtFuvGrp" ms-duplex-string="hspFuvInfCustom.nxtFuvGrp">
                      		 <option value="">请选择</option>
                     	 	 <option ms-repeat="getMsg.nxtFuvGrpArr" ms-attr-value="el.fuvGrpCod">{{el.fuvGrpNam}}</option>
                  		</select>
						
						<label style="margin-left:30px;">随访医生</label>
						<select class="departments" id="nxtFuvDoc" name="hspFuvInfCustom.nxtFuvDoc" ms-duplex-string="hspFuvInfCustom.nxtFuvDoc">
                      		 <option value="">请选择</option>
                     	 	 <option ms-repeat="getMsg.nxtFuvDocArr" ms-attr-value="el.docCod" ms-visible="(hspFuvInfCustom.nxtFuvGrp==''||el.fuvGrpCod==hspFuvInfCustom.nxtFuvGrp)">{{el.docNam}}</option>
                  		</select>
                  		<input type="text" class="hidden" name="hspFuvInfCustom.nxtFuvDocNme"  ms-duplex-string="hspFuvInfCustom.nxtFuvDocNme"/> 
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="1" style="text-align:right">
						<label>患者配合度：</label>
					</td>
					<td class="indentTd" colspan="7">
<!-- 						<ul class="cleanfloat"> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					       <li>&#9733;</li> -->
<!-- 					   </ul> -->
						<label ms-repeat="getMsg.HZPHDArr" ms-attr-for="patCoo{{el.infocode}}">
				            	<input ms-attr-id="patCoo{{el.infocode}}" type="radio" name="hspFuvInfCustom.patCoo" ms-attr-value="el.infocode"
				              	ms-duplex-string="hspFuvInfCustom.patCoo" ms-click="onRadioClick('patCoo',el.infocode)" style="margin-left:8px;"/> {{el.info}}
			          	</label>
<!-- 					   <input class="hidden" name="patCod" ms-duplex-string="hspFuvInfCustom.patCod"> -->
					</td>
				</tr>
				<tr>
					<td class="indentTd" colspan="8" style="text-align:center">
						<div class="btns" ms-visible="hideMsg.showSaveButton!='0'">
							<a style="color:white" onclick="saveMsg()">保存</a>
							<b id="cancel" onclick="parent.closemodalwindow()">取消</b>
						</div>
					</td>
				</tr>
			</table>
		</div>
	</div>
	</form>
</body>
<script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/nurseNote/mixin.vue.js"></script>
<script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
<script type="text/javascript">

	//保存
	function saveMsg() {
		if(vm.hspFuvInfCustom.fuvAgnFlg==0){
			delete vm.fuvInfAlertMsg['nxtFuvTim'];
		}else{
			vm.fuvInfAlertMsg['nxtFuvTim'] = '下次随访时间必填';			
		}
		if (vm.checkNull(vm.fuvInfAlertMsg.$model, vm.hspFuvInfCustom) === false) {
            return
         }
		jquerySubByFId('fuvform', insertfuv_callback, null, "json");
	}
	
	// 字典
	function getDicts() {
        var maps = [
            {prop: 'fuvWayCodArr', key: 'XT_FUV_WAY_COD'},//随访方式
			{prop: 'mtlSetCodArr', key: 'XT_MTL_SET_COD'},//心理调整
			{prop: 'comActCodArr', key: 'XT_COM_ACT_COD'},//遵医行为
            {prop: 'assExmCodSel', key: 'XT_ASS_EXM_COD'},//辅助检查
            {prop: 'cooMbtCodSel', key: 'XT_COO_MBT_COD'},//合并疾病
            {prop: 'scdVstCodArr', key: 'XT_SCD_VST_COD'},//按时复诊
            {prop: 'maritalStatusArr', key: 'MARITAL_COD'},//婚姻状况
            {prop: 'xtMzCodArr', key: 'XT_MZ_COD'},//民族
            {prop: 'cstSexCodArr', key: 'CST_SEX_COD'},//性别 
            {prop: 'patSymCodSel', key: 'XT_PAT_SYM_COD'},//症状
            {prop: 'sltConCodArr', key: 'XT_SLT_CON_COD'},//摄盐情况
            {prop: 'fuvTypArr', key: 'FUV_TYP'},//随访类型
        ];
        maps.forEach(function (el) {
            vm.getMsg[el.prop] = publicFun.getDict(el.key) || [];
        })
    }	

	$(function() {
		$("ul li").hover(function() {
			$(this).addClass('hs');
			$(this).prevAll().addClass('hs');
		}, function() {
			$(this).removeClass('hs');
			$(this).prevAll().removeClass('hs');
		})
		
		$("ul li").click(function() {
			$(this).addClass('cs');
			$(this).prevAll().addClass('cs');
			$(this).nextAll().removeClass('cs');
		})
		var number = $('cs').length;
		var score = 2*number;
		vm.hspFuvInfCustom.patCod = score;
	})

	window.onload = function() {
		var number = document.getElementsByClassName('cs');
	}
	
	//新增的回调函数
	function insertfuv_callback(data) {
        message_alert(data);
        if (data.resultInfo.type == '1') {
            setTimeout("location.reload()", 1000);
        }
    }	
	
	function getFuvInfBaseInfo(){
		publicFun.httpServ('post', '${baseurl}followup/getFuv.do', 
						   {'hspFuvPatCustom.patId' : _patId,'hspFuvInfCustom.fuvSeq' : _fuvSeq,'hspFuvInfCustom.plnSeq' : _plnSeq},
						   function(res) {
			console.log(res,'33333')
			setFuvMsg(res.resultInfo.sysdata);},
						   function(err){},10000);
	}
	
	$(function () {
       getDicts();
       getFuvInfBaseInfo();
   })
   
</script>
   