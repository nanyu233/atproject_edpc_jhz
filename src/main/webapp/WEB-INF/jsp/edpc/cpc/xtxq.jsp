<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<base href="<%=basePath%>">
		<title>胸痛中心上报助手</title>
		<link rel="stylesheet" type="text/css" href="${baseUrl}css/edpc/xtxq.css">
		<link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
		<link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
		<script type="text/javascript" src="lib/vue2.6.7/vue.js"></script>
		<script type="text/javascript" src="lib/moment.min.js"></script>
		<script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
		<script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
		<script type="text/javascript" src="js/public.js"></script>
		<%@ include file="/WEB-INF/jsp/base/common_js.jsp" %>
	</head>
	<style>

	</style>

	<body ms-controller="report">
		<div class="time_axis fl">
			<h4>
				<span class="iconfont icon-time"></span>
				<span class="ranking_time">时间轴</span>
			</h4>
			<div class="timeline timeline-single-column">
				<div class="timeline-item ng-scope timeLeftBlock" ms-repeat-item="timeList">
					<div class="timeline-point timeline-point-blank"></div>
					<div class="timeline-event">
						<div class="timeline_title">{{item.proName}}</div>
						<div class="timeline_value">{{item.proVal}}</div>
						<div class="timeline_diff_warning">{{item.diffred}}</div>
						<!-- 红色 -->
						<div class="timeline_diff">{{item.diffblue}}</div>
						<!-- 蓝色 -->
					</div>
				</div>
			</div>
		</div>
		<div class="main fl">
			<div class="basic-info">
				<div class="title">基本信息</div>
				<div class="content">
					<div class="row">
						<div class="input-wrapper w23">
							<div class="lb">姓名<span class="required">*</span></div>
							<div class="input">
								<input type="text" ms-duplex-string="baseInfo.cstNam" class="input" disabled="disabled" />
							</div>
						</div>
						<div class="input-wrapper w23">
							<div class="lb">性别<span class="required">*</span></div>
							<div class="input">
								<select name="" ms-duplex="baseInfo.cstSexCod" data-duplex-changed="selectchange" disabled="disabled">
									<option value="">请选择</option>
									<option ms-repeat="cstSexCodArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</div>
						</div>
						<div class="input-wrapper w23">
							<div class="lb">证件类型<span class="required">*</span></div>
							<div class="input">
								<select name="" ms-duplex="baseInfo.cardType" autocomplete="off" disabled="disabled">
									<option value="" ms-attr-selected="!baseInfo.cardType">请选择</option>
									<option ms-repeat="cardTypeArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</div>
						</div>
						<div class="input-wrapper w23" ms-if="baseInfo.cardType==1||baseInfo.cardType==2||baseInfo.cardType==3">
							<div class="lb">证件号<span class="required">*</span></div>
							<div class="input">
								<input type="text" ms-duplex-string="baseInfo.idNbr" class="input" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="input-wrapper w23">
							<div class="lb">年龄<span class="required">*</span></div>
							<div class="input">
								<input type="text" class="input" ms-duplex-string="baseInfo.cstAge" data-duplex-event="change" ms-keyup="limitInput(this)" maxlength="3"
								 disabled="disabled" />
							</div>
						</div>
						<div class="input-wrapper w23">
							<div class="lb">出生日期</div>
							<div class="input">
								<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd'})" ms-duplex-string="baseInfo.bthDat"
								 disabled="disabled" />
							</div>
						</div>
						<div class="input-wrapper w23">
							<div class="lb">民族</div>
							<div class="input">
								<select name="" ms-duplex="baseInfo.nation" autocomplete="off">
									<option value="" ms-attr-selected="!baseInfo.cardType">请选择</option>
									<option ms-repeat="nationArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</div>
						</div>
						<div class="input-wrapper w23">
							<div class="lb">联系电话</div>
							<div class="input">
								<input type="text" class="input" ms-duplex-string="baseInfo.pheNbr" data-duplex-event="change" ms-keyup="limitInput(this)" disabled="disabled" />
							</div>
						</div>
					</div>
					<div class="row">
						<div class="input-wrapper w23">
							<div class="lb">职业<span class="required">*</span></div>
							<div class="input">
								<select name="" ms-duplex="baseInfo.emgJob">
									<option value="" ms-attr-selected="!baseInfo.cardType">请选择</option>
									<option ms-repeat="emgJobArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</div>
						</div>
						<div class="input-wrapper w23">
                  		  	<div class="lb">文化程度</div>
                    		<div class="input">
                    	    	<select name="" ms-duplex="baseInfo.cstEdu">
                    	        	<option value="" ms-attr-selected="!baseInfo.cstEdu">请选择</option>
                    	        	<option ms-repeat="WHCDArr" ms-attr-value="el.infocode">{{el.info}}</option>
                    	    	</select>
                    		</div>
						</div>
						<div class="input-wrapper w23">
							<div class="lb">婚姻状况</div>
							<div class="input">
								<select name="" ms-duplex="baseInfo.maritalStatus">
									<option value="" ms-attr-selected="!baseInfo.maritalStatus">请选择</option>
									<option ms-repeat="maritalStatusArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</div>
						</div>
						<!-- <div class="input-wrapper w23">
                    <div class="lb">身高</div>
                    <div class="input">
                        <input type="text" class="input" ms-duplex-string="baseInfo.SHENG"/>
                        <div class="unit">cm</div>
                    </div>
                </div> -->

					</div>
					<!-- <div class="row">
                <div class="input-wrapper w23">
                    <div class="lb">体重</div>
                    <div class="input">
                        <input type="number" class="input" ms-duplex-string="baseInfo.TIZHONG"/>
                        <div class="unit">kg</div>
                    </div>
                </div>
            </div> -->
				</div>
			</div>
			<div class="treat-info">
				<div class="tab-group">
					<div class="tab" ms-class="{{activeTab==0 ? 'active' : ''}}" ms-click="onTabClick('firstaidinfo',0)">急救信息</div>
					<div class="tab" ms-class="{{activeTab==1 ? 'active' : ''}}" ms-click="onTabClick('cpctreat',1)">胸痛诊疗</div>
					<div class="tab" ms-class="{{activeTab==2 ? 'active' : ''}}" ms-click="onTabClick('outcome',2)">患者转归</div>
				</div>
				<div class="tab-container emergency" ms-if="activeTab==0">
					<div class="block">
						<div class="title">基本信息</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">住院ID</div>
<%--								<div class="input"><input type="text" ms-duplex-string="info.ZHUYH" /></div>--%>
								<div class="input"><input type="text" ms-duplex-string="baseInfo.zyxh" /></div>
							</div>
							<div class="input-group">
								<div class="lb">门诊ID</div>
<%--								<div class="input"><input type="text" ms-duplex-string="info.MENZH" /></div>--%>
								<div class="input"><input type="text" ms-duplex-string="baseInfo.jzxh" /></div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">发病时间 <span class="required">*</span></div>
								<div class="input">
									<input type="text" class="input-date Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"
<%--									 ms-duplex-string="aidPatient.illTim" />--%>
									 ms-duplex-string="hspXtzlInf.FBSJ" />
								</div>
							</div>
							<div class="input-group">
								<div class="input">
<%--									<div class="btn" ms-class="{{aidPatient.illTimFlg ? 'active' : ''}}" ms-click="onToggleClick('illTimFlg')">发病时间无法精确到分钟--%>
									<div class="btn" ms-class="{{hspXtzlInf.FBSJWFJQDFZ ? 'active' : ''}}" ms-click="onToggleClick('FBSJWFJQDFZ')">发病时间无法精确到分钟
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="aidPatient.illTimFlg">--%>
							<div class="input-group" ms-if="hspXtzlInf.FBSJWFJQDFZ">
								<div class="lb">发病区间 <span class="required">*</span></div>
								<div class="input">
<%--									<select name="" ms-duplex="aidPatient.illperd">--%>
									<select name="" ms-duplex="hspXtzlInf.FBQJ">
										<option value="">请选择</option>
										<option ms-repeat="FBQJArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">发病地址</div>
								<div class="input">
<%--									<select name="" ms-duplex="aidPatient.scePrvCod">--%>
									<select name="" ms-duplex="hspXtzlInf.FBDZ01">
										<!-- onchange="ReSelected()" -->
										<option value="">请选择</option>
										<option ms-repeat="provinceList" ms-attr-value="el.addrCode">{{el.addrName}}</option>
									</select>
<%--									<select name="" ms-duplex="aidPatient.sceCtyCod">--%>
									<select name="" ms-duplex="hspXtzlInf.FBDZ02">
										<option value="">请选择</option>
										<option ms-repeat="cityList" ms-attr-value="el.addrCode">{{el.addrName}}</option>
									</select>
<%--									<select name="" ms-duplex="aidPatient.sceAr0Cod">--%>
									<select name="" ms-duplex="hspXtzlInf.FBDZ03">
										<option value="">请选择</option>
										<option ms-repeat="cntyList" ms-attr-value="el.addrCode">{{el.addrName}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">详细地址</div>
								<div class="input">
<%--									<input type="text" ms-duplex-string="aidPatient.sceAdr">--%>
									<input type="text" ms-duplex-string="hspXtzlInf.XXDZ">
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">医保类型</div>
								<div class="input">
<%--									<select name="" ms-duplex="info.YBLX">--%>
									<select name="" ms-duplex="hspXtzlInf.YBLX">
										<option value="">请选择</option>
										<option ms-repeat="YBLXArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">医保编号</div>
<%--								<div class="input"><input type="text" ms-duplex-string="info.YBBH" /></div>--%>
								<div class="input"><input type="text" ms-duplex-string="hspXtzlInf.YBBH" /></div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">大病医保</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div ms-repeat="RADIOArr" class="btn" ms-class="{{info.DBYB==el.infocode ? 'active':''}}" ms-click="onRadioClick('DBYB',el.infocode)">--%>
										<div ms-repeat="RADIOArr" class="btn" ms-class="{{hspXtzlInf.DBYB==el.infocode ? 'active':''}}" ms-click="onRadioClick3('DBYB',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="title">病情现况</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">病情评估 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-repeat="BQPGArr" ms-class="{{info.BQPG==el.infocode ? 'active':''}}" ms-click="onRadioClick('BQPG',el.infocode)">--%>
										<div class="btn" ms-repeat="BQPGArr" ms-class="{{hspXtzlInf.BQPG==el.infocode ? 'active':''}}" ms-click="onRadioClick3('BQPG',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div style="margin-left: 130px">
								<div class="checkbox-group">
									<div ms-repeat="BQPGMXArr" class="btn" ms-class="{{isChecked('BQPGMX',el.infocode) ? 'active':''}}" ms-click="onCheckClick('BQPGMX',el.infocode)">
										{{el.info}}
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="title">来院方式</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">来院方式 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div ms-repeat="ddfsArr" class="btn" ms-class="{{aidPatientXt.ddfs==el.infocode ? 'active':''}}" ms-click="onRadioClick2('ddfs',el.infocode)">--%>
										<div ms-repeat="ddfsArr" class="btn" ms-class="{{hspXtzlInf.DYFS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('DYFS',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="aidPatientXt.ddfs == 1">--%>
						<div ms-if="hspXtzlInf.DYFS == 1">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">出车单位 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div ms-repeat="ccdwArr" class="btn" ms-class="{{aidPatientXt.ccdw==el.infocode ? 'active':''}}" ms-click="onRadioClick2('ccdw',el.infocode)">--%>
											<div ms-repeat="ccdwArr" class="btn" ms-class="{{hspXtzlInf.CCDW==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CCDW',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">呼救时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="aidPatient.almtime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.HJSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">直接转送上级医院(转出患者时) <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div ms-repeat="RADIOArr" class="btn" ms-class="{{info.ZJZSSJYY==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZSSJYY',el.infocode)">--%>
											<div ms-repeat="RADIOArr" class="btn" ms-class="{{hspXtzlInf.ZJZSSJYY==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZJZSSJYY',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-visible="info.ZJZSSJYY == 1">--%>
								<div class="input-group" ms-visible="hspXtzlInf.ZJZSSJYY == 1">
									<div class="lb">直达导管室<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div ms-repeat="RADIOArr" class="btn" ms-class="{{info.ZDDGS==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZDDGS',el.infocode)">--%>
											<div ms-repeat="RADIOArr" class="btn" ms-class="{{hspXtzlInf.ZDDGS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZDDGS',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">到达医院大门时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="aidPatientXt.ddyydmsj" />--%>
										<input type="text" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="hspXtzlInf.DDYYDMSJ01" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">首次医疗接触时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="aidPatientXt.scyljc" />--%>
										<input type="text" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="hspXtzlInf.SCYLJCSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">院内首诊医师接诊时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="baseInfo.emgDat" />--%>
										<input type="text" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex-string="hspXtzlInf.YNSZYSJZSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">医护人员 </div>
<%--									<div class="input"><input type="text" ms-duplex="baseInfo.preUsrNam" /></div>--%>
									<div class="input"><input type="text" ms-duplex="hspXtzlInf.YHRY" /></div>
								</div>
							</div>
						</div>
<%--						<div ms-if="aidPatientXt.ddfs == 2">--%>
						<div ms-if="hspXtzlInf.DYFS == 2">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">转院类型 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div ms-repeat="ZYLXArr" class="btn" ms-class="{{info.ZYLX==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYLX',el.infocode)">--%>
											<div ms-repeat="ZYLXArr" class="btn" ms-class="{{hspXtzlInf.ZYLX==el.infocode ? 'active':''}}" ms-click="onRadioClickZYLX('ZYLX',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
<%--									<div class="input"><input type="text" ms-duplex-string="info.YYMC" /></div>--%>
									<div class="input">
										<div class="input-group" ms-visible="hspXtzlInf.ZYLX == 1">
											<div class="lb">医院名称</div>
											<select name="" ms-duplex="hspXtzlInf.YYMC">
												<option value="">请选择</option>
												<option ms-repeat="WLYYArr" ms-attr-value="el.infocode">{{el.info}}</option>
											</select>
										</div>
									</div>
									<div class="input-group" ms-visible="hspXtzlInf.ZYLX == 2">
										<div class="lb">医院名称</div>
										<div class="input"><input type="text" ms-duplex-string="hspXtzlInf.YYMC" /></div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">首次医疗接触时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="aidPatientXt.scyljc" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.SCYLJCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">直接转送上级医院(转出患者时) <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div ms-repeat="RADIOArr" class="btn" ms-class="{{info.ZJZSSJYY==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZJZSSJYY',el.infocode)">--%>
											<div ms-repeat="RADIOArr" class="btn" ms-class="{{hspXtzlInf.ZJZSSJYY==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZJZSSJYY',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
								<div class="input-group" ms-visible="info.ZJZSSJYY == 1">
									<div class="lb">直达导管室<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div ms-repeat="RADIOArr" class="btn" ms-class="{{info.ZDDGS==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZDDGS',el.infocode)">--%>
											<div ms-repeat="RADIOArr" class="btn" ms-class="{{hspXtzlInf.ZDDGS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZDDGS',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
<%--									<div class="lb">转出医院入门时间 <span class="required" ms-if="info.ZYLX==1 || info.ZYLX ==''">*</span></div>--%>
									<div class="lb">转出医院入门时间 <span class="required" ms-if="hspXtzlInf.ZYLX==1 || hspXtzlInf.ZYLX ==''">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="info.ZCYYRMSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.ZCYYRMSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
<%--									<div class="lb">决定转院时间 <span class="required" ms-if="info.ZYLX==1 || info.ZYLX =='' ">*</span></div>--%>
									<div class="lb">决定转院时间 <span class="required" ms-if="hspXtzlInf.ZYLX==1 || hspXtzlInf.ZYLX =='' ">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="info.JDZYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.JDZYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
<%--									<div class="lb">转出医院出门时间 <span class="required" ms-if="info.ZYLX==1 || info.ZYLX =='' ">*</span></div>--%>
									<div class="lb">转出医院出门时间 <span class="required" ms-if="hspXtzlInf.ZYLX==1 || hspXtzlInf.ZYLX =='' ">*</span></div>
									<div class="input">
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.ZCYJCMSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">到达本院大门时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="aidPatientXt.ddyydmsj" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.DDYYDMSJ02" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">院内接诊时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="info.YNJZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.YNJZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">医护人员</div>
<%--									<div class="input"><input type="text" ms-duplex="baseInfo.preUsrNam" /></div>--%>
									<div class="input"><input type="text" ms-duplex="hspXtzlInf.YHRY" /></div>
								</div>
							</div>
						</div>
<%--						<div ms-if="aidPatientXt.ddfs == 3">--%>
						<div ms-if="hspXtzlInf.DYFS == 3">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">到达医院大门时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="aidPatientXt.ddyydmsj" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.DDYYDMSJ03" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">首次医疗接触时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="aidPatientXt.scyljc" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.SCYLJCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">院内首诊医师接诊时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="baseInfo.emgDat" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.YNSZYSJZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">医护人员</div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="baseInfo.preUsrNam" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YHRY" />
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="aidPatientXt.ddfs == 4">--%>
						<div ms-if="hspXtzlInf.DYFS == 4">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">发病地点 <span class="required">*</span></div>
<%--									<div class="input"><input type="text" ms-duplex="ynfb.illDep" /></div>--%>
									<div class="input"><input type="text" ms-duplex="hspXtzlInf.FBKS" /></div>
								</div>
								<div class="input-group">
									<div class="lb">本次发病后首次医疗接触时间 <span class="required">*</span></div>
<%--									<input type="text" class="Wdate" ms-duplex-string="ynfb.fstTim" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.SCYLJCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">离开发病现场时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="ynfb.lveTim" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.LKKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">本次发病后首次医疗接触人员</div>
<%--									<div class="input"><input type="text" ms-duplex="baseInfo.preUsrNam" /></div>--%>
									<div class="input"><input type="text" ms-duplex="hspXtzlInf.YHRY" /></div>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="title">基础生命体征</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">意识 <span class="required">*</span></div>
								<div class="input">
<%--									<select name="" ms-duplex="baseInfo.senRctCod">--%>
									<select name="" ms-duplex="hspXtzlInf.YISHI">
										<option value="">请选择</option>
										<option ms-repeat="senRctCodArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">呼吸 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex-string="baseInfo.breNbr" ms-keyup="limitInput(this,40)" />--%>
									<input type="text" ms-duplex-string="hspXtzlInf.HUXI" data-duplex-event="change" ms-keyup="limitInput(this,40)" />
									<div class="unit">次/分</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">脉搏 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex-string="baseInfo.hrtRte" ms-keyup="limitInput(this,300)" />--%>
									<input type="text" ms-duplex-string="hspXtzlInf.MAIB" data-duplex-event="change" ms-keyup="limitInput(this,300)" />
									<div class="unit">次/分</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">心率 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-keyup="limitInput(this,300)" />--%>
									<input type="text" ms-duplex-string="hspXtzlInf.XINL" data-duplex-event="change" ms-keyup="limitInput(this,300)" />
									<div class="unit">次/分</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">血压 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" placeholder="--/--" ms-duplex="info.XUEYA" />--%>
									<input type="text" placeholder="--/--" ms-duplex="hspXtzlInf.XUEY" />
									<div class="unit">mmHg</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">体温</div>
								<div class="input">
<%--									<input type="text" ms-duplex="baseInfo.tmpNbr" ms-keyup="NumberInput(this)" maxlength="5" />--%>
									<input type="text" ms-duplex="hspXtzlInf.TIWEN" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="5" />
									<div class="unit">℃</div>
								</div>
							</div>
						</div>
					</div>
<%--					<div ms-if="aidPatientXt.ddfs==1 || aidPatientXt.ddfs==2" class="block">--%>
					<div ms-if="hspXtzlInf.DYFS==1 || hspXtzlInf.DYFS==2" class="block">
						<div class="title">院前溶栓治疗</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">溶栓筛查 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{aidPatientXt.yqrssc==el.infocode ? 'active':''}}" ms-click="onRadioClick2('yqrssc',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.YQRSSC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQRSSC',el.infocode)"
										 ms-repeat="YQRSSCArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="aidPatientXt.yqrssc==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.YQRSSC==1">
								<div class="lb">溶栓治疗 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{aidPatientXt.yqrs==el.infocode ? 'active':''}}" ms-click="onRadioClick2('yqrs',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.YQRSZL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQRSZL',el.infocode)"
										 ms-repeat="YQRSZLArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="aidPatientXt.yqrssc==2">--%>
							<div class="input-group" ms-if="hspXtzlInf.YQRSSC==2">
								<div class="lb">存在禁忌症 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div ms-repeat="RADIOArr" class="btn" ms-class="{{info.YQCZJJZ==el.infocode ? 'active':''}}" ms-click="onRadioClick('YQCZJJZ',el.infocode)">--%>
										<div ms-repeat="RADIOArr" class="btn" ms-class="{{hspXtzlInf.YQCZJJZ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQCZJJZ',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="aidPatientXt.yqrs == 1 && aidPatientXt.yqrssc==1">--%>
						<div ms-if="hspXtzlInf.YQRSZL == 1 && hspXtzlInf.YQRSSC==1">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">直达溶栓场所 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YQZDRSCS==el.infocode ? 'active':''}}" ms-click="onRadioClick('YQZDRSCS',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YQZDRSCS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQZDRSCS',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">溶栓场所 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{aidPatientXt.rscs==el.infocode ? 'active':''}}" ms-click="onRadioClick2('rscs',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YQRSCS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQRSCS',el.infocode)"
											 ms-repeat="YQRSCSArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">开始知情同意 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="aidPatientXt.zqtyks" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YQKSZQTYSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">签署知情同意书 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="aidPatientXt.qszqty" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YQQSZQTYSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">开始溶栓时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="aidPatientXt.rsks" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YQKSRSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">溶栓结束时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="aidPatientXt.rsjs" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YQRSJSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">药物 <span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="aidPatientXt.rsyw">--%>
										<select name="" ms-duplex="hspXtzlInf.YQRSYW">
											<option value="">请选择</option>
											<option ms-repeat="RSYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">剂量 <span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="aidPatientXt.rsywjl">--%>
										<select name="" ms-duplex="hspXtzlInf.YQRSYWJL">
											<option value="">请选择</option>
											<option ms-repeat="RSYWJLArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">溶栓再通 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{aidPatientXt.rszt==el.infocode ? 'active':''}}" ms-click="onRadioClick2('rszt',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YQRSZT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQRSZT',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="aidPatientXt.rszt==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.YQRSZT==1">
									<div class="lb">溶栓后造影时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="aidPatientXt.rshzy" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.YQRSHZYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
<%--								<div class="input-group" ms-if="aidPatientXt.rszt==0">--%>
								<div class="input-group" ms-if="hspXtzlInf.YQRSZT==0">
									<div class="lb">补救PCI <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YQBJPCI==el.infocode ? 'active':''}}" ms-click="onRadioClick('YQBJPCI',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YQBJPCI==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQBJPCI',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="aidPatientXt.rszt==0 && info.YQBJPCI==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.YQRSZT==0 && hspXtzlInf.YQBJPCI==1">
									<div class="lb">实际手术时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex-string="info.YQSJSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex-string="hspXtzlInf.YQSJSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
<%--								<div class="input-group" ms-if="aidPatientXt.rszt==0 && info.YQBJPCI==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.YQRSZT==0 && hspXtzlInf.YQBJPCI==1">
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YQSSDD==el.infocode ? 'active':''}}" ms-click="onRadioClick('YQSSDD',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YQSSDD==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YQSSDD',el.infocode)"
											 ms-repeat="YQSSDDArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="inputs">
							<div class="input-group">
								<div class="lb">患者情况备注</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.YQHZQKBZ" style="width: 790px" />--%>
									<input type="text" ms-duplex="hspXtzlInf.YQHZQKBZ" style="width: 790px" />
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="tab-container treatment" ms-if="activeTab==1">
					<div class="block">
						<div class="title">心电图</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">心电图</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.XINDT==el.infocode ? 'active':''}}" ms-click="onRadioClick('XINDT',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.XINDT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('XINDT',el.infocode)"
										 ms-repeat="XINDTArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.XINDT==0">--%>
							<div class="input-group" ms-if="hspXtzlInf.XINDT==0">
								<div class="lb">未获得原因</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.WHDYY" />--%>
									<input type="text" ms-duplex="hspXtzlInf.WHDYY" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.XINDT==1">--%>
						<div class="inputs" ms-if="hspXtzlInf.XINDT==1">
							<div class="input-group">
								<div class="lb">首份心电图时间 <span class="required">*</span></div>
								<div class="input" style="padding-right: 10px;">
									<input type="text" class="Wdate" ms-duplex="hspEcgInf.fileDate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">心电图文件 <span class="required">*</span></div>
								<div class="input" style="padding-right: 10px;">
									<input type="text" ms-duplex="hspEcgInf.filePath" placeholder='请选择心电图文件' />
									<div class="btn inlineBtn">上传</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">心电图诊断时间 <span class="required">*</span></div>
								<div class="input" style="padding-right: 0px;">
									<input type="text" class="Wdate" ms-duplex="hspEcgInf.fileDiaDate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									<!-- <span class="iconfont icon-show" ms-click="addItem('child1')" ms-if="!hasChild('child1')"></span> -->
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">远程心电图传输 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{aidPatientXt.ycxdtcs==el.infocode ? 'active':''}}" ms-click="onRadioClick2('ycxdtcs',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.YCXDTCS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YCXDTCS',el.infocode)"
										 ms-repeat="YCXDTCSArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="aidPatientXt.ycxdtcs==1">--%>
						<div class="inputs" ms-if="hspXtzlInf.YCXDTCS==1">
							<div class="input-group">
								<div class="lb">接收120/网络医院心电图时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="aidPatientXt.cssj" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.JSXDTSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">传输方式 <span class="required">*</span></div>
								<div class="input">
<%--									<select name="" ms-duplex="aidPatientXt.csfs">--%>
									<select name="" ms-duplex="hspXtzlInf.CSFS">
										<option value="">请选择</option>
										<option ms-repeat="CSFSArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="title">实验室检查</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">肌钙蛋白 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISJGDB==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISJGDB',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISJGDB==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISJGDB',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.ISJGDB==1">--%>
						<div class="inputs" ms-if="hspXtzlInf.ISJGDB==1">
							<div class="input-group">
								<div class="lb">首次肌钙蛋白 <span class="required">*</span></div>
								<div style="padding-right: 0" class="input">
									<div class="radio-btns fl">
										<div class="btn" ms-class="{{hspXtzlInf.SCJGDB==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SCJGDB',el.infocode)"
										 ms-repeat="SCJGDBArr">
											{{el.info}}
										</div>
									</div>
<%--									<input type="text" class="fl" style="width: 56px" ms-duplex="info.JGDBSZ">--%>
									<input type="text" class="fl" style="width: 56px" ms-duplex="hspXtzlInf.JGDBSZ">
									<select name="" class="fl" ms-duplex="hspXtzlInf.JGDBDW" style="width: 67px">
										<option value="" ms-attr-selected="!hspXtzlInf.JGDBDW">请选择</option>
										<option ms-repeat="JGDBDWArr" ms-attr-value="el.infocode">{{el.info}}</option>
<%--										<option value="">ng/mL</option>--%>
<%--										<option value="">ug/L</option>--%>
									</select>
<%--									<select name="" class="fl" style="width: 67px" ms-duplex="info.JGDBXZ">--%>
									<select name="" class="fl" style="width: 67px" ms-duplex="hspXtzlInf.JGDBXZ">
<%--										<option value="" ms-attr-selected="!info.JGDBXZ">请选择</option>--%>
										<option value="" ms-attr-selected="!hspXtzlInf.JGDBXZ">请选择</option>
										<option ms-repeat="JGDBXZArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">抽血完成时间 <span class="required">*</span></div>
								<div style="padding-right: 0" class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.CXSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CXSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">获得报告时间 <span class="required">*</span></div>
								<div style="padding-right: 0" class="input">
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.POCTSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
<%--									<input type="text" class="Wdate" ms-duplex="info.POCTSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<!-- <span class="iconfont icon-show" ms-click="addItem('children1')" ms-if="!hasChild('children1')"></span> -->
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">血清肌酐 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISXQJG==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISXQJG',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISXQJG==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISXQJG',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.ISXQJG==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.ISXQJG==1">
								<div class="lb">数值 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.XQJGSZ" ms-keyup="NumberInput(this)" maxlength="10" />--%>
									<input type="text" ms-duplex="hspXtzlInf.XQJGSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="10" />
									<div class="unit">umol/L</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">D-二聚体 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISDEJT==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISDEJT',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISDEJT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISDEJT',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.ISDEJT==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.ISDEJT==1">
								<div class="lb">数值 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.DEJTSZ" ms-keyup="NumberInput(this)" maxlength="10" />--%>
									<input type="text" ms-duplex="hspXtzlInf.DEJTSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="10" />
<%--									<select name="" ms-duplex="info.DEJTDW" style="width: 70px">--%>
									<select name="" ms-duplex="hspXtzlInf.DEJTDW" style="width: 70px">
										<option value="">请选择</option>
										<option ms-repeat="DEJTDWArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">BNP <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISBNP==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISBNP',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISBNP==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISBNP',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.ISBNP==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.ISBNP==1">
								<div class="lb">数值 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.BNPSZ" ms-keyup="NumberInput(this)" maxlength="10" />--%>
									<input type="text" ms-duplex="hspXtzlInf.BNPSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="10" />
									<div class="unit">pg/mL</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">NT-proBNP <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISNTPROBNP==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISNTPROBNP',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISNTPROBNP==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISNTPROBNP',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.ISNTPROBNP==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.ISNTPROBNP==1">
								<div class="lb">数值 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.NTPROBNPSZ" ms-keyup="NumberInput(this)" maxlength="10" />--%>
									<input type="text" ms-duplex="hspXtzlInf.NTPROBNPSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="10" />
									<div class="unit">pg/mL</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">Myo <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISMYO==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISMYO',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISMYO==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISMYO',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.ISMYO==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.ISMYO==1">
								<div class="lb">数值 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.MYOSZ" ms-keyup="NumberInput(this)" maxlength="10" />--%>
									<input type="text" ms-duplex="hspXtzlInf.MYOSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="10" />
<%--									<select name="" ms-duplex="info.MYODW" style="width: 70px">--%>
									<select name="" ms-duplex="hspXtzlInf.MYODW" style="width: 70px">
										<option value="">请选择</option>
										<option ms-repeat="MYODWArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">CKMB <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ISCKMB==el.infocode ? 'active':''}}" ms-click="onRadioClick('ISCKMB',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ISCKMB==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ISCKMB',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.ISCKMB==1">--%>
							<div class="input-group" ms-if="hspXtzlInf.ISCKMB==1">
								<div class="lb">数值 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.CKMBSZ" ms-keyup="NumberInput(this)" maxlength="10" />--%>
									<input type="text" ms-duplex="hspXtzlInf.CKMBSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="10" />
<%--									<select name="" ms-duplex="info.CKMBDW" style="width: 70px">--%>
									<select name="" ms-duplex="hspXtzlInf.CKMBDW" style="width: 70px">
										<option value="">请选择</option>
										<option ms-repeat="CKMBDWArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="input">
<%--									<div class="btn" ms-class="{{info.jyxm ? 'active' : ''}}" ms-click="onToggleClick('jyxm')" style="padding:0 20px;box-shadow: 0 0 5px;">检验报告</div>--%>
									<div class="btn" ms-class="{{hspXtzlInf.jyxm ? 'active' : ''}}" ms-click="onToggleClick('jyxm')" style="padding:0 20px;box-shadow: 0 0 5px;">检验报告</div>
<%--									<div class="btn" ms-class="{{info.jcxm ? 'active' : ''}}" ms-click="onToggleClick('jcxm')" style="padding:0 20px;box-shadow: 0 0 5px;">检查报告</div>--%>
									<div class="btn" ms-class="{{hspXtzlInf.jcxm ? 'active' : ''}}" ms-click="onToggleClick('jcxm')" style="padding:0 20px;box-shadow: 0 0 5px;">检查报告</div>
								</div>
							</div>
						</div>
<%--						<div class="block" style="overflow: hidden;" ms-if="info.jyxm">--%>
						<div class="block" style="overflow: hidden;" ms-if="hspXtzlInf.jyxm">
							<div class="no-data" ms-if="!jylist.length">
								检验报告：暂无数据
							</div>
							<table class="listStyle" border="1" style="border-collapse: collapse" ms-if="jylist.length">
								<thead>
									<tr>
										<th>检验项目</th>
										<th>检验时间</th>
									</tr>
								</thead>
								<tr ms-repeat="jylist" ms-click="chooseItem(el)" ms-class="active:el.sampleno==currItem.sampleno">
									<td>{{el.examinaim}}</td>
									<td>{{el.resultDateTime}}</td>
								</tr>
							</table>
							<div class="data" ms-if="jylist.length">
								<table class="detail" border="1" style="border-collapse: collapse">
									<tr class="title">
										<td class="col_l">检验项目</td>
										<td>结果</td>
										<td></td>
										<td class="col_l">参考值</td>
										<td>单位</td>
									</tr>
									<tr ms-repeat="currItem.data">
										<td class="col_l">{{el.reportItemName}}</td>
										<td>{{el.result}}</td>
										<td>{{el.errorFlag}}</td>
										<td class="col_l">{{el.lowerLimit}}-{{el.upperLimit}}</td>
										<td>{{el.units}}</td>
									</tr>
								</table>
							</div>
						</div>
<%--						<div class="block" ms-if="info.jcxm">--%>
						<div class="block" ms-if="hspXtzlInf.jcxm">
							<div class="no-data" ms-if="!jclist.length">
								检查报告：暂无数据
							</div>
							<div class="jcbox" ms-if="jclist.length">
								<div class="wrapper" ms-repeat="jclist">
									<div class="item" style="position: relative">
										<div class="titlebox">检查项目：</div>
										<div>{{el.ylmc}}</div>
										<div class="btnbox" ms-click="toggle(el)">
											<span ms-if="!el.show">展开</span>
											<span ms-if="el.show">收起</span>
										</div>
									</div>
									<div ms-if="el.show">
										<div class="item">
											<div class="titlebox">检查描述：</div>
											<div>{{el.see}}</div>
										</div>
										<div class="item">
											<div class="titlebox">检查结论：</div>
											<div>{{el.jcjg}}</div>
										</div>
										<div class="item">
											<div class="titlebox">报告时间：</div>
											<div>{{el.shrq}}</div>
										</div>
										<div class="item">
											<div class="titlebox">报告医生：</div>
											<div>{{el.jcysxm}}</div>
										</div>
										<div class="item">
											<div class="titlebox">审核医生：</div>
											<div>{{el.examineDocName}}</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="title">心内科会诊</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">心内科会诊 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.xnkhz==el.infocode ? 'active':''}}" ms-click="onRadioClick('xnkhz',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.XNKHZ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('XNKHZ',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.xnkhz==1">--%>
						<div class="inputs" ms-if="hspXtzlInf.XNKHZ==1">
							<div class="input-group">
								<div class="lb">会诊类型 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.hzlx==el.infocode ? 'active':''}}" ms-click="onRadioClick('hzlx',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.HZLX==el.infocode ? 'active':''}}" ms-click="onRadioClick3('HZLX',el.infocode)"
										 ms-repeat="hzlxArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">通知会诊时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.invitationDate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.TZHZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">会诊时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.invitationDate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.HZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
					</div>
					<div class="block">
						<div class="title">诊断</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">初步诊断<span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.CBZD==el.infocode ? 'active':''}}" ms-click="onRadioClick('CBZD',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.CBZD==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CBZD',el.infocode)"
										 ms-repeat="CBZDArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">患者自愿放弃后续治疗<span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.HZZYFQHXZL==el.infocode ? 'active':''}}" ms-click="onRadioClick('HZZYFQHXZL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.HZZYFQHXZL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('HZZYFQHXZL',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CBZD==7">--%>
						<div class="inputs" ms-if="hspXtzlInf.CBZD==7">
							<div class="input-group">
								<div class="lb">其它非心源性胸痛类型 <span class="required">*</span></div>
								<div class="input">
									<div class="checkbox-group">
										<div ms-repeat="QTFXYXXTLXArr" class="btn" ms-class="{{isChecked('QTFXYXXTLX',el.infocode) ? 'active':''}}"
										 ms-click="onCheckClick('QTFXYXXTLX',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CBZD==6">--%>
						<div class="inputs" ms-if="hspXtzlInf.CBZD==6">
							<div class="input-group">
								<div class="lb">非ACS心源性胸痛类型 <span class="required">*</span></div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CBZD==6">--%>
						<div class="inputs" ms-if="hspXtzlInf.CBZD==6">
							<div class="input-group">
								<div class="input">
									<div class="checkbox-group">
										<div ms-repeat="FACSXYXXTLXArr" class="btn" ms-class="{{isChecked('FACSXYXXTLX',el.infocode) ? 'active':''}}"
										 ms-click="onCheckClick('FACSXYXXTLX',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CBZD">--%>
						<div class="inputs" ms-if="hspXtzlInf.CBZD">
							<div class="input-group">
								<div class="lb">初步诊断时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.CBZDSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CBZDSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})">
								</div>
							</div>
							<div class="input-group">
								<div class="lb">医生 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.YISHENG">--%>
									<input type="text" ms-duplex="hspXtzlInf.YISHENG">
								</div>
							</div>
						</div>
<%--						<div ms-if="info.CBZD==1 || info.CBZD==2 || info.CBZD==3">--%>
						<div ms-if="hspXtzlInf.CBZD==1 || hspXtzlInf.CBZD==2 || hspXtzlInf.CBZD==3">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">心功能分级 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.KILLIP==el.infocode ? 'active':''}}" ms-click="onRadioClick('KILLIP',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.KILLIP==el.infocode ? 'active':''}}" ms-click="onRadioClick3('KILLIP',el.infocode)"
											 ms-repeat="KILLIPArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">绕行急诊 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.RXJZ==el.infocode ? 'active':''}}" ms-click="onRadioClick('RXJZ',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.RXJZ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('RXJZ',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">绕行CCU <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.RXCCU==el.infocode ? 'active':''}}" ms-click="onRadioClick('RXCCU',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.RXCCU==el.infocode ? 'active':''}}" ms-click="onRadioClick3('RXCCU',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="info.CBZD==4 || info.CBZD==5 ">--%>
						<div ms-if="hspXtzlInf.CBZD==4 || hspXtzlInf.CBZD==5 ">
							<div class="inputs">
								<div class="input-group">
									<div class="lb lb_check">影像学检查 <span class="required">*</span></div>
									<div class="input">
										<div class="checkbox-group">
											<div ms-if="hspXtzlInf.CBZD==4">
												<div class="btn" ms-class="{{isChecked('YXXJC',el.infocode) ? 'active':''}}" ms-click="onDoneClick('YXXJC',el.infocode)"
													 ms-repeat="YXXJCArr">
													{{el.info}}
												</div>
											</div>
											<div ms-if="hspXtzlInf.CBZD==5">
												<div class="btn" ms-class="{{isChecked('YXXJC',el.infocode) ? 'active':''}}" ms-click="onDoneClick('YXXJC',el.infocode)"
													 ms-repeat="YXXJCArrFDMSS">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs" ms-if="isChecked('YXXJC','1') && !isChecked('YXXJC','4')">
								<div class="input-group">
									<div class="lb">通知CT室时间<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.TZCTSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.TZCTSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">CT室完成准备<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.CTSWCZBSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CTSWCZBSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">CT扫描开始时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.CTSMKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CTSMKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs" ms-if="isChecked('YXXJC','1') && !isChecked('YXXJC','4')">
								<div class="input-group">
									<div class="lb">CT报告时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.CTBGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CTBGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs" ms-if="isChecked('YXXJC','2') && !isChecked('YXXJC','4')">
								<div class="input-group">
									<div class="lb">通知彩超室时间<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.TZCCSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.TZCCSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">彩超检查时间<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.CCJCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CCJCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">彩超出结果时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.CCCJGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.CCCJGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="info.CBZD==4">--%>
						<div ms-if="hspXtzlInf.CBZD==4">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">通知心外科会诊</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.TZXWKHZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.TZXWKHZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">心外科会诊时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.XWKHZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.XWKHZSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">夹层类型 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.JCLX==el.infocode ? 'active':''}}" ms-click="onRadioClick('JCLX',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.JCLX==el.infocode ? 'active':''}}" ms-click="onRadioClick3('JCLX',el.infocode)"
											 ms-repeat="JCLXArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">治疗策略 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZLCL==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZLCL',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZLCL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZLCL',el.infocode)"
											 ms-repeat="ZLCLArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CBZD==6 || info.CBZD==7 || info.CBZD==8">--%>
						<div class="inputs" ms-if="hspXtzlInf.CBZD==6 || hspXtzlInf.CBZD==7 || hspXtzlInf.CBZD==8">
							<div class="input-group">
								<div class="lb">处理措施 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.CLCS==1 ? 'active':''}}" ms-click="onRadioClick('CLCS',1)">--%>
										<div class="btn" ms-class="{{hspXtzlInf.CLCS==1 ? 'active':''}}" ms-click="onRadioClick3('CLCS',1)">
											收治入院
										</div>
<%--										<div class="btn" ms-class="{{info.CLCS==2 ? 'active':''}}" ms-click="onRadioClick('CLCS',2)">--%>
										<div class="btn" ms-class="{{hspXtzlInf.CLCS==2 ? 'active':''}}" ms-click="onRadioClick3('CLCS',2)">
											急诊留观
										</div>
<%--										<div class="btn" ms-class="{{info.CLCS==3 ? 'active':''}}" ms-click="onRadioClick('CLCS',3)">--%>
										<div class="btn" ms-class="{{hspXtzlInf.CLCS==3 ? 'active':''}}" ms-click="onRadioClick3('CLCS',3)">
											门诊治疗
										</div>
<%--										<div class="btn" ms-class="{{info.CLCS==4 ? 'active':''}}" ms-click="onRadioClick('CLCS',4)">--%>
										<div class="btn" ms-class="{{hspXtzlInf.CLCS==4 ? 'active':''}}" ms-click="onRadioClick3('CLCS',4)">
											随访
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="info.CBZD==1 || info.CBZD==2 || info.CBZD==3">--%>
					<div class="block" ms-if="hspXtzlInf.CBZD==1 || hspXtzlInf.CBZD==2 || hspXtzlInf.CBZD==3">
						<div class="title">初始药物</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">抗血小板治疗 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.KXXBZL==el.infocode ? 'active':''}}" ms-click="onRadioClick('KXXBZL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.KXXBZL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('KXXBZL',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="info.KXXBZL==1" class="inputs">--%>
						<div ms-if="hspXtzlInf.KXXBZL==1" class="inputs">
							<div class="input-group">
								<div class="lb">阿司匹林 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ASPLJL==el.infocode ? 'active':''}}" ms-click="onRadioClick('ASPLJL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ASPLJL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ASPLJL',el.infocode)"
										 ms-repeat="ASPLJLArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.ASPLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.ASPLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div ms-if="info.KXXBZL==1" class="inputs">--%>
						<div ms-if="hspXtzlInf.KXXBZL==1" class="inputs">
							<div class="input-group">
								<div class="lb">氯吡格雷 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.LBGLJL==el.infocode ? 'active':''}}" ms-click="onRadioClick('LBGLJL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.LBGLJL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('LBGLJL',el.infocode)"
										 ms-repeat="LBGLJLArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.LBGLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.LBGLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div ms-if="info.KXXBZL==1" class="inputs">--%>
						<div ms-if="hspXtzlInf.KXXBZL==1" class="inputs">
							<div class="input-group">
								<div class="lb">替格瑞洛 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.TGRLJL==el.infocode ? 'active':''}}" ms-click="onRadioClick('TGRLJL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.TGRLJL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('TGRLJL',el.infocode)"
										 ms-repeat="TGRLJLArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.TGRLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.TGRLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>

						<div class="inputs">
							<div class="input-group">
								<div class="lb">抗凝 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.KANGN==el.infocode ? 'active':''}}" ms-click="onRadioClick('KANGN',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.KANGN==el.infocode ? 'active':''}}" ms-click="onRadioClick3('KANGN',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.KANGN==1">--%>
						<div class="inputs" ms-if="hspXtzlInf.KANGN==1">
							<div class="input-group">
								<div class="lb">抗凝</div>
								<div class="input">
<%--									<select name="" ms-duplex="info.KNYW">--%>
									<select name="" ms-duplex="hspXtzlInf.KNYW">
										<option value="">请选择</option>
										<option ms-repeat="KNYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">剂量</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.KNYWJL" ms-keyup="NumberInput(this)" maxlength="6" />--%>
									<input type="text" ms-duplex="hspXtzlInf.KNYWJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="6" />
<%--									<select name="" ms-duplex="info.KNYWDW" style="width: 70px">--%>
									<select name="" ms-duplex="hspXtzlInf.KNYWDW" style="width: 70px">
										<option value="">请选择</option>
										<option ms-repeat="KNYWDWArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">时间</div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.KNYWSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.KNYWSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">他汀治疗</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.TTZL==el.infocode ? 'active':''}}" ms-click="onRadioClick('TTZL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.TTZL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('TTZL',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">β受体阻滞剂</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.BSTZZJ==el.infocode ? 'active':''}}" ms-click="onRadioClick('BSTZZJ',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.BSTZZJ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('BSTZZJ',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="info.CBZD==2 || info.CBZD==3">--%>
					<div id="GraceScore" class="block" ms-if="hspXtzlInf.CBZD==2 || hspXtzlInf.CBZD==3">
						<div class="title">Grace评估</div>
						<div class="inputs">
							<div class="input-group">
								<div class="input">
									<div class="checkbox-group">
										<div ms-repeat="WXYSArr" class="btn" ms-class="{{isChecked('WXYS',el.infocode) ? 'active':''}}" ms-click="onCheckClick('WXYS',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="input">
									<div class="lb">Grace极高危条件（满足其一即可）</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="checkbox-group">
									<div ms-repeat="GRACEJGWTJArr" class="btn" ms-class="{{isChecked('GRACEJGWTJ',el.infocode) ? 'active':''}}"
									 ms-click="onCheckClick('GRACEJGWTJ',el.infocode)">
										{{el.info}}
									</div>
								</div>
							</div>
						</div>
						<div class="inputs" ms-if="GRACEJGWTJSel.length==0">
							<div class="input-group">
								<div class="lb">Grace分值</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.gracefz" />--%>
									<input type="text" ms-duplex="hspXtzlInf.GRACEFZ" />
									<div class="count" ms-click="computeGraceItem()">计算</div>
								</div>
							</div>
						</div>
						<div class="inputs" ms-if="GRACEJGWTJSel.length==0 && info.pfxx">
							<table class="detail" border="1" style="border-collapse: collapse;width:60%;">
								<tr class="title">
									<td>年龄</td>
									<td>心率</td>
									<td>收缩压</td>
									<td>肌酐</td>
									<td>killip分级</td>
									<td>危险因素</td>
									<td>总分</td>
								</tr>
								<tr>
									<td>{{vm.modalGraceInfo.cstAge + '岁'}}</td>
									<td>{{vm.modalGraceInfo.hrtRte}}</td>
									<td>{{vm.modalGraceInfo.sbpupNbr}}</td>
									<td>{{vm.modalGraceInfo.jgdb}}</td>
									<td>{{vm.modalGraceInfo.killip2}}</td>
									<td>{{vm.modalGraceInfo.wxys2}}</td>
									<td>-</td>
								</tr>
								<tr>
									<td>{{vm.modalGraceScore.ageScore + '分'}}</td>
									<td>{{vm.modalGraceScore.hrtScore + '分'}}</td>
									<td>{{vm.modalGraceScore.sbpScore + '分'}}</td>
									<td>{{vm.modalGraceScore.creScore + '分'}}</td>
									<td>{{vm.modalGraceScore.killipScore + '分'}}</td>
									<td>{{vm.modalGraceScore.dangerScore + '分'}}</td>
									<td>{{vm.modalGraceScore.total + '分'}}</td>
								</tr>
							</table>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">Grace危险分层</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{(info.GRACEWXFC==1||GRACEJGWTJSel.length!=0) ? 'active':''}}" ms-click="onRadioClick('GRACEWXFC','1')">极高危--%>
										<div class="btn" ms-class="{{(hspXtzlInf.GRACEWXFC==1||GRACEJGWTJSel.length!=0) ? 'active':''}}" ms-click="onRadioClick3('GRACEWXFC','1')">极高危
										</div>
<%--										<div class="btn" ms-class="{{(info.GRACEWXFC==2 && GRACEJGWTJSel.length==0) ? 'active':''}}" ms-click="onRadioClick('GRACEWXFC','2')">高危--%>
										<div class="btn" ms-class="{{(hspXtzlInf.GRACEWXFC==2 && GRACEJGWTJSel.length==0) ? 'active':''}}" ms-click="onRadioClick3('GRACEWXFC','2')">高危
										</div>
<%--										<div class="btn" ms-class="{{(info.GRACEWXFC==3 && GRACEJGWTJSel.length==0) ? 'active':''}}" ms-click="onRadioClick('GRACEWXFC','3')">中危--%>
										<div class="btn" ms-class="{{(hspXtzlInf.GRACEWXFC==3 && GRACEJGWTJSel.length==0) ? 'active':''}}" ms-click="onRadioClick3('GRACEWXFC','3')">中危
										</div>
<%--										<div class="btn" ms-class="{{(info.GRACEWXFC==4 && GRACEJGWTJSel.length==0) ? 'active':''}}" ms-click="onRadioClick('GRACEWXFC','4')">低危--%>
										<div class="btn" ms-class="{{(hspXtzlInf.GRACEWXFC==4 && GRACEJGWTJSel.length==0) ? 'active':''}}" ms-click="onRadioClick3('GRACEWXFC','4')">低危
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="info.CBZD==2 || info.CBZD==3">--%>
					<div class="block" ms-if="hspXtzlInf.CBZD==2 || hspXtzlInf.CBZD==3">
						<div class="title">再次危险分层</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">再次危险分层</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ZCWXFC==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZCWXFC',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZCWXFC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZCWXFC',el.infocode)"
										 ms-repeat="ZCWXFCArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-visible="info.ZCWXFC && info.ZCWXFC!=1">--%>
							<div class="input-group" ms-visible="hspXtzlInf.ZCWXFC && hspXtzlInf.ZCWXFC!=0">
								<div class="lb">再次危险分层时间</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.ZCWXFCSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" ms-duplex="hspXtzlInf.ZCWXFCSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="(info.CBZD==2 || info.CBZD==3) && info.ZCWXFC!=2">--%>
					<div class="block" ms-if="(hspXtzlInf.CBZD==2 || hspXtzlInf.CBZD==3) && hspXtzlInf.ZCWXFC!=1">
						<div class="title">处理策略</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">策略 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.CLCL==el.infocode ? 'active':''}}" ms-click="onRadioClick('CLCL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.CLCL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CLCL',el.infocode)"
										 ms-repeat="CLCLArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-visible="info.CLCL==1">--%>
						<div class="inputs" ms-visible="hspXtzlInf.CLCL==2">
							<div class="input-group">
								<div class="lb">侵入性策略 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.QRXCL==el.infocode ? 'active':''}}" ms-click="onRadioClick('QRXCL',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.QRXCL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('QRXCL',el.infocode)"
										 ms-repeat="QRXCLArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if=" info.CLCL==1 && info.QRXCL==1">--%>
						<div class="inputs" ms-if=" hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1">
							<div class="input-group">
								<div class="lb">决定医生</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.JDXPCIYS" />--%>
									<input type="text" ms-duplex="hspXtzlInf.JDXPCIYS" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">决定介入手术时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">启动导管室时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.QDDGSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.QDDGSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CLCL==2 && info.QRXCL==1">--%>
						<div class="inputs" ms-if="hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1">
							<div class="input-group">
								<div class="lb">开始知情同意时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.KSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.KSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">签署知情同意时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.QSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.QSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-visible=" info.CLCL==1 && info.QRXCL==2">--%>
						<div class="inputs" ms-visible=" hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==2">
							<div class="input-group">
								<div class="lb">实际介入治疗时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.SJJRZLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" ms-duplex="hspXtzlInf.SJJRZLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>

					</div>
<%--					<div class="block" ms-if="((info.CBZD==2||info.CBZD==3) && info.ZCWXFC==2) || info.CBZD==1">--%>
					<div class="block" ms-if="((hspXtzlInf.CBZD==2||hspXtzlInf.CBZD==3) && hspXtzlInf.ZCWXFC==1) || hspXtzlInf.CBZD==1">
						<div class="title">再灌注措施<span class="required">*</span></div>
						<div class="inputs">
							<div class="input-group">
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.YWZGZCS==el.infocode ? 'active':''}}" ms-click="onRadioClick('YWZGZCS',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.YWZGZCS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YWZGZCS',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.YWZGZCS == 1">--%>
							<div class="input-group" ms-if="hspXtzlInf.YWZGZCS == 1">
								<div class="lb">措施 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ZGZCS==1 ? 'active':''}}" ms-click="onRadioClick('ZGZCS','1')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZGZCS==1 ? 'active':''}}" ms-click="onRadioClick3('ZGZCS','1')">
											直接PCI
										</div>
<%--										<div class="btn" ms-class="{{info.ZGZCS==2 ? 'active':''}}" ms-click="onRadioClick('ZGZCS','2')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZGZCS==2 ? 'active':''}}" ms-click="onRadioClick3('ZGZCS','2')">
											溶栓
										</div>
<%--										<div class="btn" ms-class="{{info.ZGZRSCS==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZGZRSCS',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZGZRSCS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZGZRSCS',el.infocode)"
<%--										 ms-repeat="ZGZRSCSArr" ms-visible="info.ZGZCS==2">--%>
										 ms-repeat="ZGZRSCSArr" ms-visible="hspXtzlInf.ZGZCS==2">
											{{el.info}}
										</div>
<%--										<div class="btn" ms-class="{{info.ZGZCS==3 ? 'active':''}}" ms-click="onRadioClick('ZGZCS','3')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZGZCS==3 ? 'active':''}}" ms-click="onRadioClick3('ZGZCS','3')">
											择期介入
										</div>
<%--										<div class="btn" ms-class="{{info.ZGZCS==4 ? 'active':''}}" ms-click="onRadioClick('ZGZCS','4')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZGZCS==4 ? 'active':''}}" ms-click="onRadioClick3('ZGZCS','4')">
											CABG
										</div>
<%--										<div class="btn" ms-class="{{info.ZGZCS==5 ? 'active':''}}" ms-click="onRadioClick('ZGZCS','5')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZGZCS==5 ? 'active':''}}" ms-click="onRadioClick3('ZGZCS','5')">
											转运PCI
										</div>
									</div>
								</div>
							</div>

						</div>
<%--						<div class="inputs" ms-if="info.YWZGZCS==0">--%>
						<div class="inputs" ms-if="hspXtzlInf.YWZGZCS==0">
							<div class="input-group">
								<div class="lb lb_check">无再灌注措施 <span class="required">*</span></div>
								<div class="input">
									<div class="checkbox-group">
										<div ms-repeat="WZGZCSYYArr" class="btn" ms-class="{{isChecked('WZGZCSYY',el.infocode) ? 'active':''}}"
										 ms-click="onCheckClick('WZGZCSYY',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-visible="info.ZGZCS==2 && info.ZGZRSCS==1 && info.YWZGZCS==1 ">--%>
						<div class="inputs" ms-visible="hspXtzlInf.ZGZCS==2 && hspXtzlInf.ZGZRSCS==1 && hspXtzlInf.YWZGZCS==1 ">
							<div class="input-group">
								<div class="lb">决定介入手术时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.YWZGZCS==1 && info.ZGZCS == 1">--%>
						<div class="inputs" ms-if="hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS == 1">
							<div class="input-group">
								<div class="lb">决定医生</div>
								<div class="input">
<%--									<input type="text" ms-duplex="info.JDXPCIYS" />--%>
									<input type="text" ms-duplex="hspXtzlInf.JDXPCIYS" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">决定介入手术时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">启动导管室时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.QDDGSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.QDDGSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.YWZGZCS==1 && info.ZGZCS == 1">--%>
						<div class="inputs" ms-if="hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS == 1">
							<div class="input-group">
								<div class="lb">开始知情同意时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.KSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.KSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">签署知情同意时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.QSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.QSZQTYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.YWZGZCS==1 && info.ZGZCS == 3">--%>
						<div class="inputs" ms-if="hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS == 3">
							<div class="input-group">
								<div class="lb">决定介入手术时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.JDJRSSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">造影开始时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.ZYKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.ZYKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.YWZGZCS==1 && info.ZGZCS == 4">--%>
						<div class="inputs" ms-if="hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS == 4">
							<div class="input-group">
								<div class="lb">决定CABG时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.JDCABGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.JDCABGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
							<div class="input-group">
								<div class="lb">开始CABG时间<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.KSCABGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.KSCABGSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.YWZGZCS==1 && info.ZGZCS == 5">--%>
						<div class="inputs" ms-if="hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS == 5">
							<div class="input-group">
								<div class="lb">转运PCI<span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.ZYPCI==0 ? 'active':''}}" ms-click="onRadioClick('ZYPCI','0')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZYPCI==1 ? 'active':''}}" ms-click="onRadioClick3('ZYPCI','1')">
											转出患者
										</div>
<%--										<div class="btn" ms-class="{{info.ZYPCI==1 ? 'active':''}}" ms-click="onRadioClick('ZYPCI','1')">--%>
										<div class="btn" ms-class="{{hspXtzlInf.ZYPCI==0 ? 'active':''}}" ms-click="onRadioClick3('ZYPCI','0')">
											接收患者
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="info.CBZD==5">--%>
					<div class="block" ms-if="hspXtzlInf.CBZD==5">
						<div class="title">治疗信息</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">危险分层</div>
								<div class="input">
									<div class="radio-btns">
										<div class="btn" ms-class="{{hspXtzlInf.WXFC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('WXFC',el.infocode)"
											 ms-repeat="WXFCArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
							<div class="input-group">
								<div class="lb">开始抗凝时间</div>
								<div class="input">
<%--									<input type="text" class="Wdate" ms-duplex="info.KSKNZLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
									<input type="text" class="Wdate" ms-duplex="hspXtzlInf.KSKNZLSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="(info.CBZD==1 && info.YWZGZCS==1 && info.ZGZCS==2)||((info.CBZD==2||info.CBZD==3) && info.ZCWXFC==2 && info.YWZGZCS==1 && info.ZGZCS==2)||info.CBZD==5">--%>
					<div class="block" ms-if="(hspXtzlInf.CBZD==1 && hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS==2)||((hspXtzlInf.CBZD==2||hspXtzlInf.CBZD==3) && hspXtzlInf.ZCWXFC==1 && hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS==2)||hspXtzlInf.CBZD==5">
						<div class="title">院内溶栓治疗</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">溶栓筛查 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.YNRSSC==el.infocode ? 'active':''}}" ms-click="onRadioClick('YNRSSC',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.YNRSSC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YNRSSC',el.infocode)"
										 ms-repeat="YQRSSCArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-visible="info.YNRSSC==1">--%>
							<div class="input-group" ms-visible="hspXtzlInf.YNRSSC==1">
								<div class="lb">溶栓治疗 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.YNRSZL==1 ? 'active':''}}" ms-click="onRadioClick('YNRSZL','1')">有--%>
										<div class="btn" ms-class="{{hspXtzlInf.YNRSZL==1 ? 'active':''}}" ms-click="onRadioClick3('YNRSZL','1')">有
										</div>
<%--										<div class="btn" ms-class="{{info.YNRSZL==0 ? 'active':''}}" ms-click="onRadioClick('YNRSZL','0')">无--%>
										<div class="btn" ms-class="{{hspXtzlInf.YNRSZL==0 ? 'active':''}}" ms-click="onRadioClick3('YNRSZL','0')">无
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-visible="info.YNRSSC==2">--%>
							<div class="input-group" ms-visible="hspXtzlInf.YNRSSC==2">
								<div class="lb">存在禁忌症 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.YNCZJJZ==0 ? 'active':''}}" ms-click="onRadioClick('YNCZJJZ','0')">否--%>
										<div class="btn" ms-class="{{hspXtzlInf.YNCZJJZ==0 ? 'active':''}}" ms-click="onRadioClick3('YNCZJJZ','0')">否
										</div>
<%--										<div class="btn" ms-class="{{info.YNCZJJZ==1 ? 'active':''}}" ms-click="onRadioClick('YNCZJJZ','1')">是--%>
										<div class="btn" ms-class="{{hspXtzlInf.YNCZJJZ==1 ? 'active':''}}" ms-click="onRadioClick3('YNCZJJZ','1')">是
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="info.YNRSZL==1 && info.CBZD!=5 && info.YNRSSC==1">--%>
						<div ms-if="hspXtzlInf.YNRSZL==1 && hspXtzlInf.CBZD!=5 && hspXtzlInf.YNRSSC==1">
							<div class="inputs">
								<div class="input-group">
									<div class="lb">直达溶栓场所 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YNZDRSCS==0 ? 'active':''}}" ms-click="onRadioClick('YNZDRSCS','0')">--%>
											<div class="btn" ms-class="{{hspXtzlInf.YNZDRSCS==0 ? 'active':''}}" ms-click="onRadioClick3('YNZDRSCS','0')">
												否
											</div>
<%--											<div class="btn" ms-class="{{info.YNZDRSCS==1 ? 'active':''}}" ms-click="onRadioClick('YNZDRSCS','1')">--%>
											<div class="btn" ms-class="{{hspXtzlInf.YNZDRSCS==1 ? 'active':''}}" ms-click="onRadioClick3('YNZDRSCS','1')">
												是
											</div>
										</div>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">溶栓场所 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YNRSCS==1 ? 'active':''}}" ms-click="onRadioClick('YNRSCS','1')">--%>
											<div class="btn" ms-class="{{hspXtzlInf.YNRSCS==1 ? 'active':''}}" ms-click="onRadioClick3('YNRSCS','1')">
												本院急诊科
											</div>
<%--											<div class="btn" ms-class="{{info.YNRSCS==2 ? 'active':''}}" ms-click="onRadioClick('YNRSCS','2')">--%>
											<div class="btn" ms-class="{{hspXtzlInf.YNRSCS==2 ? 'active':''}}" ms-click="onRadioClick3('YNRSCS','2')">
												本院心内科
											</div>
<%--											<div class="btn" ms-class="{{info.YNRSCS==3 ? 'active':''}}" ms-click="onRadioClick('YNRSCS','3')">--%>
											<div class="btn" ms-class="{{hspXtzlInf.YNRSCS==3 ? 'active':''}}" ms-click="onRadioClick3('YNRSCS','3')">
												其他科室
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">开始知情同意 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.KSZQTYSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YNKSZQTYSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">签署知情同意书 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.YNQSZQTYSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YNQSZQTYSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">开始溶栓时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.YNKSRSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YNKSRSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">溶栓结束时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.YNRSJSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.YNRSJSSJ" class="Wdate" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">药物 <span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.YNYW">--%>
										<select name="" ms-duplex="hspXtzlInf.YNYW">
											<option value="">请选择</option>
											<option ms-repeat="RSYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">剂量 <span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.YNJL">--%>
										<select name="" ms-duplex="hspXtzlInf.YNJL">
											<option value="">请选择</option>
											<option ms-repeat="RSYWJLArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">溶栓再通 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YNRSZT==el.infocode ? 'active':''}}" ms-click="onRadioClick('YNRSZT',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YNRSZT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YNRSZT',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
<%--					<div ms-if="(info.CBZD==1 && info.YWZGZCS==1 && (info.ZGZCS==1 || (info.ZGZCS==2 && (info.ZGZRSCS==1 || info.ZGZRSCS==2)))) || (info.CBZD==2 && info.CLCL==1 && info.QRXCL==1) || (info.CBZD==3 && info.CLCL==1 && info.QRXCL==1)">--%>
					<div ms-if="(hspXtzlInf.CBZD==1 && hspXtzlInf.YWZGZCS==1 && (hspXtzlInf.ZGZCS==1 || (hspXtzlInf.ZGZCS==2 && (hspXtzlInf.ZGZRSCS==1 || hspXtzlInf.ZGZRSCS==2))))
								|| (hspXtzlInf.CBZD==2 && hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZCWXFC==1 && (hspXtzlInf.ZGZCS==1 || (hspXtzlInf.ZGZCS==2 && (hspXtzlInf.ZGZRSCS==1 || hspXtzlInf.ZGZRSCS==2))))
								|| (hspXtzlInf.CBZD==3 && hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZCWXFC==1 &&  (hspXtzlInf.ZGZCS==1 || (hspXtzlInf.ZGZCS==2 && (hspXtzlInf.ZGZRSCS==1 || hspXtzlInf.ZGZRSCS==2))))
								|| (hspXtzlInf.CBZD==2 && hspXtzlInf.ZCWXFC!=1 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1)
								|| (hspXtzlInf.CBZD==3 && hspXtzlInf.ZCWXFC!=1 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1)
								|| ((hspXtzlInf.CBZD==1 || hspXtzlInf.CBZD==2 || hspXtzlInf.CBZD==3) && hspXtzlInf.YWZGZCS==1 && hspXtzlInf.ZGZCS==5 && hspXtzlInf.ZYPCI==0)">
						<div class="block">
							<div class="bar">导管室</div>
							<div class="title">基本信息</div>
<%--							<div class="inputs" ms-if="info.ZGZCS == 1 || (info.CBZD==2 && info.CLCL==1 && info.QRXCL==1) || (info.CBZD==3 && info.CLCL==1 && info.QRXCL==1) ">--%>
							<div class="inputs" ms-if="hspXtzlInf.ZGZCS == 1 || (hspXtzlInf.CBZD==2 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1) || (hspXtzlInf.CBZD==3 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1) ">
								<div class="input-group">
									<div class="lb">导管室激活时间<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.DGSJHSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.DGSJHSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">患者到达导管室</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.HZJDGSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.HZJDGSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">介入医师</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.JRYS" />--%>
										<input type="text" ms-duplex="hspXtzlInf.JRYS" />
									</div>
								</div>
							</div>
							<div class="inputs">
<%--								<div class="input-group" ms-if="info.ZGZCS == 1 || (info.CBZD==2 && info.CLCL==1 && info.QRXCL==1) || (info.CBZD==3 && info.CLCL==1 && info.QRXCL==1)">--%>
								<div class="input-group" ms-if="hspXtzlInf.ZGZCS == 1 || (hspXtzlInf.CBZD==2 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1) || (hspXtzlInf.CBZD==3 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1)">
									<div class="lb">开始穿刺时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.KSCCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.KSCCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">造影开始时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.ZYKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.ZYKSSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.ZGZCS == 1 ||(info.CBZD==2 && info.CLCL==1 && info.QRXCL==1) || (info.CBZD==3 && info.CLCL==1 && info.QRXCL==1)">--%>
							<div class="inputs" ms-if="hspXtzlInf.ZGZCS == 1 ||(hspXtzlInf.CBZD==2 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1) || (hspXtzlInf.CBZD==3 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1)">
								<div class="input-group">
									<div class="lb">术中抗凝给药时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.SZKNGYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.SZKNGYSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">术中抗凝药物</div>
									<div class="input">
<%--										<select name="" ms-duplex="info.SZKNYW">--%>
										<select name="" ms-duplex="hspXtzlInf.SZKNYW">
											<option value="">请选择</option>
											<option ms-repeat="KNYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">术中抗凝药物剂量</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.SZKNYWJL" ms-keyup="NumberInput(this)" />--%>
										<input type="text" ms-duplex="hspXtzlInf.SZKNYWJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" />
<%--										<input type="text" style="width: 60px" placeholder="单位" ms-duplex="info.SZKNYWDW" maxlength="6" />--%>
										<input type="text" style="width: 60px" placeholder="单位" ms-duplex="hspXtzlInf.SZKNYWDW" maxlength="6" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.ZGZCS == 1 || (info.CBZD==2 && info.CLCL==1 && info.QRXCL==1) || (info.CBZD==3 && info.CLCL==1 && info.QRXCL==1)">--%>
							<div class="inputs" ms-if="hspXtzlInf.ZGZCS == 1 || (hspXtzlInf.CBZD==2 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1) || (hspXtzlInf.CBZD==3 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1)">
								<div class="input-group">
									<div class="lb">手术结束时间<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate" ms-duplex="info.PCISSWCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />--%>
										<input type="text" class="Wdate" ms-duplex="hspXtzlInf.PCISSWCSJ" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.ZGZCS == 1 || (info.CBZD==2 && info.CLCL==1 && info.QRXCL==1) || (info.CBZD==3 && info.CLCL==1 && info.QRXCL==1)">--%>
							<div class="inputs" ms-if="hspXtzlInf.ZGZCS == 1 || (hspXtzlInf.CBZD==2 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1) || (hspXtzlInf.CBZD==3 && hspXtzlInf.CLCL==2 && hspXtzlInf.QRXCL==1)">
								<div class="input-group">
									<div class="lb">D2W时间</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.D2WSJ" />--%>
										<input type="text" data-duplex-event="change" ms-duplex="hspXtzlInf.D2WSJ" disabled="disabled"/>
										<div class="unit">min</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.ZGZCS == 1">--%>
							<div class="inputs" ms-if="hspXtzlInf.ZGZCS == 1">
								<div class="input-group">
									<div class="lb">是否延误</div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.SFYW==el.infocode ? 'active':''}}" ms-click="onRadioClick('SFYW',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.SFYW==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SFYW',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.SFYW == 1">--%>
							<div class="inputs" ms-if="hspXtzlInf.ZGZCS == 1 && hspXtzlInf.SFYW == 1">
								<div style="margin-left: 130px">
									<div class="checkbox-group">
										<div ms-repeat="YWYYArr" class="btn" ms-class="{{isChecked('YWYY',el.infocode) ? 'active':''}}" ms-click="onCheckClick('YWYY',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="title">入路</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">入路<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.RULU==el.infocode ? 'active':''}}" ms-click="onRadioClick('RULU',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.RULU==el.infocode ? 'active':''}}" ms-click="onRadioClick3('RULU',el.infocode)"
											 ms-repeat="RULUArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div id="block-group">
							<div class="block">
								<div class="title">冠脉造影</div>
								<div>
									<img width="34%" height="300px" src="${baseurl}images/edpc/position.png" alt="">
									<div class="path-group checkbox-group" style="width:64%;">
										<div v-for="(item,index) in GMZYArr" class="btn" :class="isChecked2('GMZY',item) ? 'active':''"  @click="onCheckClick2(item)">
											{{(index+1)+':'+item.info}}
										</div>
									</div>
								</div>
							</div>
							<div class="block" v-for="item in GMZYSel">
								<div class="title">{{item.info}}</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">狭窄程度<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" @click="pathDetailSel(item.infocode,'xzcd',el.infocode)"
												 v-for="el in XZCDArr" :class="info[item.infocode].hspCrivelInf.xzcd == el.infocode ? 'active':''">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">造影时TIMI血流<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.zystimixl==el.infocode ? 'active':''"
												 @click="pathDetailSel(item.infocode,'zystimixl',el.infocode)" v-for="el in ZYSTIMIXLArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">支架内血栓<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.zjnxs==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'zjnxs',el.infocode)"
												 v-for="el in RADIOArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">是否分叉病变<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.sffcbb==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'sffcbb',el.infocode)"
												 v-for="el in RADIOArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">是否CTO<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.sfcto==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'sfcto',el.infocode)"
												 v-for="el in RADIOArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">钙化病变<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.ghbb==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'ghbb',el.infocode)"
												 v-for="el in RADIOArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">罪犯病变<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.zfbb==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'zfbb',el.infocode)"
												 v-for="el in RADIOArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="inputs">
									<div class="input-group">
										<div class="lb">PCI<span class="required">*</span></div>
										<div class="input">
											<div class="radio-btns">
												<div class="btn" :class="info[item.infocode].hspCrivelInf.pci==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'pci',el.infocode)"
												 v-for="el in RADIOArr">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
								<div v-if="info[item.infocode].hspCrivelInf.pci==1">
									<div class="inputs">
										<div class="input-group">
											<div class="lb lb_check">术中处理 <span class="required">*</span></div>
											<div class="input">
												<div class="checkbox-group">
													<div v-for="el in SZCLArr" class="btn" :class="isChecked3(item.infocode,el.infocode) ? 'active':''"
													 @click="onSelectClick2(item.infocode,el.infocode)">
														{{el.info}}
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="inputs">
										<div class="input-group">
											<div class="lb">导丝通过时间</div>
											<div class="input">
												<input type="text" :id="'tim'+item.infocode" class="Wdate input" onfocus='WdatePicker({dateFmt:"yyyy-MM-dd HH:mm"})' v-model="info[item.infocode].hspCrivelInf.dstgsj" @blur="WdatePicker2(item.infocode,'dstgsj')">
											</div>
										</div>
									</div>
									<div class="inputs">
										<div class="input-group">
											<div class="lb">术后TIMI血流<span class="required">*</span></div>
											<div class="input">
												<div class="radio-btns">
													<div class="btn" :class="info[item.infocode].hspCrivelInf.shtimixl==el.infocode ? 'active':''"
													 @click="pathDetailSel(item.infocode,'shtimixl',el.infocode)" v-for="el in SHTIMIXLArr">
														{{el.info}}
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="inputs">
										<div class="input-group">
											<div class="lb">植入支架个数<span class="required">*</span></div>
											<div class="input">
												<div class="radio-btns">
													<div class="btn" :class="info[item.infocode].hspCrivelInf.zrzjgs==el.infocode ? 'active':''"
													 @click="pathDetailSel(item.infocode,'zrzjgs',el.infocode)" v-for="el in ZRZJGSArr">
														{{el.info}}
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="inputs" v-if="info[item.infocode].hspCrivelInf.zrzjgs!=1">
										<div class="input-group">
											<div class="lb">支架种类<span class="required">*</span></div>
											<div class="input">
												<div class="radio-btns">
													<div class="btn" :class="info[item.infocode].hspCrivelInf.zjzl==el.infocode ? 'active':''" @click="pathDetailSel(item.infocode,'zjzl',el.infocode)"
													 v-for="el in ZJZLArr">
														{{el.info}}
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
							
							</div>
						
						
						</div>
						<div class="block">
							<div class="title">器械</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">腔内影像<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.QNYX==el.infocode ? 'active':''}}" ms-click="onRadioClick('QNYX',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.QNYX==el.infocode ? 'active':''}}" ms-click="onRadioClick3('QNYX',el.infocode)"
											 ms-repeat="QNYXArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">功能检测<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.GNJC==el.infocode ? 'active':''}}" ms-click="onRadioClick('GNJC',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.GNJC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('GNJC',el.infocode)"
											 ms-repeat="GNJCArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.GNJC==1||info.GNJC==4||info.GNJC==5">--%>
								<div class="input-group" ms-if="hspXtzlInf.GNJC==1||hspXtzlInf.GNJC==4||hspXtzlInf.GNJC==5">
									<div class="lb">数值<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.GNJCSZ" ms-keyup="limitInput(this,1)" />--%>
										<input type="text" ms-duplex="hspXtzlInf.GNJCSZ" data-duplex-event="change" ms-keyup="limitInputFloat(this,1)" />
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">IABP<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.IABP==el.infocode ? 'active':''}}" ms-click="onRadioClick('IABP',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.IABP==el.infocode ? 'active':''}}" ms-click="onRadioClick3('IABP',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">临时起搏器<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.LSQBQ==el.infocode ? 'active':''}}" ms-click="onRadioClick('LSQBQ',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.LSQBQ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('LSQBQ',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">ECMO<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ECMO==el.infocode ? 'active':''}}" ms-click="onRadioClick('ECMO',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ECMO==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ECMO',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">左心室辅助装置 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZXSFZZZ==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZXSFZZZ',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZXSFZZZ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZXSFZZZ',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="title">术中并发症 <span class="required">*</span></div>
							<div class="inputs">
								<div class="input-group">
									<div class="input">
										<div class="checkbox-group">
											<div ms-repeat="SZBFZArr" class="btn" ms-class="{{isChecked('SZBFZ',el.infocode) ? 'active':''}}" ms-click="onSelectClick('SZBFZ',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
					<div class="block">
<%--						<div class="inputs" ms-if="info.CBZD==6 || info.CBZD==7 || info.CBZD==8">--%>
						<div class="inputs" ms-if="hspXtzlInf.CBZD==6 || hspXtzlInf.CBZD==7 || hspXtzlInf.CBZD==8">
							<div class="input-group">
								<div class="lb">患者情况备注</div>
								<div class="input">
<%--									<input type="text" style="width: 790px" ms-duplex="info.YNHZQKBZ" />--%>
									<input type="text" style="width: 790px" ms-duplex="hspXtzlInf.YNHZQKBZ" />
								</div>
							</div>
						</div>
					</div>
<%--					<div class="block" ms-if="info.HZZYFQHXZL==1">--%>
					<div class="block" ms-if="(hspXtzlInf.ZJZSSJYY==1) || (hspXtzlInf.HZZYFQHXZL==1) || (hspXtzlInf.HZZYFQHXZL==0 && (hspXtzlInf.CBZD==6 || hspXtzlInf.CBZD==7 || hspXtzlInf.CBZD==8))">
						<div class="title" style="color:red;">此选择表示胸痛诊疗结束，不再继续跟踪患者的救治情况！</div>
					</div>
				</div>
				<div class="tab-container outcome" ms-if="activeTab==2">
					<div class="block">
						<div class="inputs">
							<div class="input-group">
								<div class="lb">出院诊断 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.CYZD==el.infocode ? 'active':''}}" ms-click="onRadioClick('CYZD',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.CYZD==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CYZD',el.infocode)"
										 ms-repeat="CYZDArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CYZD==6">--%>
						<div class="inputs" ms-if="hspXtzlInf.CYZD==6">
							<div class="input-group">
								<div class="lb lb_check">非ACS心源性胸痛类型 <span class="required">*</span></div>
								<div class="input">
									<div class="checkbox-group">
										<div class="btn" ms-repeat="ZGFACSXYXXTLXArr" ms-class="{{isChecked('ZGFACSXYXXTLX',el.infocode) ? 'active':''}}"
										 ms-click="onCheckClick('ZGFACSXYXXTLX',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CYZD==9">--%>
						<div class="inputs" ms-if="hspXtzlInf.CYZD==9">
							<div class="input-group">
								<div class="lb lb_check">其它非心源性胸痛类型 <span class="required">*</span></div>
								<div class="input">
									<div class="checkbox-group">
										<div class="btn" ms-repeat="ZGQTFXYXXTLXArr" ms-class="{{isChecked('ZGQTFXYXXTLX',el.infocode) ? 'active':''}}"
										 ms-click="onCheckClick('ZGQTFXYXXTLX',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">确诊时间 <span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.QZSJ" />--%>
									<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.QZSJ" />
								</div>
							</div>
						</div>
						<div class="inputs">
							<div class="input-group">
								<div class="lb">COVID-19</div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.COVID19==el.infocode ? 'active':''}}" ms-click="onRadioClick('COVID19',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.COVID19==el.infocode ? 'active':''}}" ms-click="onRadioClick3('COVID19',el.infocode)"
										 ms-repeat="COVID19Arr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="inputs" ms-if="hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3">
							<div class="input-group">
								<div class="lb">院内新发心力衰竭 <span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.YNXFXLSJ==el.infocode ? 'active':''}}" ms-click="onRadioClick('YNXFXLSJ',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.YNXFXLSJ==el.infocode ? 'active':''}}" ms-click="onRadioClickYNXFXLSJ('YNXFXLSJ',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CYZD==1 || info.CYZD==2 || info.CYZD==3">--%>
						<div class="inputs" ms-if="hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3">
							<div class="input-group">
								<div class="lb">ARNI<span class="required">*</span></div>
								<div class="input">
									<div class="radio-btns">
<%--										<div class="btn" ms-class="{{info.SFARNI==el.infocode ? 'active':''}}" ms-click="onRadioClick('SFARNI',el.infocode)"--%>
										<div class="btn" ms-class="{{hspXtzlInf.SFARNI==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SFARNI',el.infocode)"
										 ms-repeat="RADIOArr">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.SFARNI == 1">--%>
							<div class="input-group" ms-if="hspXtzlInf.SFARNI == 1">
								<div class="lb">服用频次<span class="required">*</span></div>
								<div class="input">
<%--									<select name="" ms-duplex="info.ARNI">--%>
									<select name="" ms-duplex="hspXtzlInf.ARNI">
										<option value="">请选择</option>
										<option ms-repeat="ARNIPCArr" ms-attr-value="el.infocode">{{el.info}}</option>
									</select>
								</div>
							</div>
<%--							<div class="input-group" ms-if="info.SFARNI == 1">--%>
							<div class="input-group" ms-if="hspXtzlInf.SFARNI == 1">
								<div class="lb">单次剂量<span class="required">*</span></div>
								<div class="input">
<%--									<input type="text" ms-duplex-string="info.ARNIDCJL" ms-keyup="NumberInput(this)" maxlength="8" />--%>
									<input type="text" ms-duplex-string="hspXtzlInf.ARNIDCJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="8" />
									<div class="unit">mg</div>
								</div>
							</div>
						</div>
<%--						<div class="inputs" ms-if="info.CYZD==1 || info.CYZD==2 || info.CYZD==3">--%>
						<div class="inputs" ms-if="hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3">
							<div class="input-group">
								<div class="lb">住院期间并发症 <span class="required">*</span></div>
								<div class="input">
									<div class="checkbox-group">
										<div class="btn" ms-repeat="ZYQJBFZArr" ms-class="{{isChecked('ZYQJBFZ',el.infocode) ? 'active':''}}"
										 ms-click="onSelectClick3('ZYQJBFZ',el.infocode)">
											{{el.info}}
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="info.CYZD==1 || info.CYZD==2 || info.CYZD==3">--%>
						<div ms-if="hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3">
							<div class="inputs">
								<div class="input-group">
									<div class="lb lb_check">危险因素 <span class="required">*</span></div>
									<div class="input">
										<div class="checkbox-group">
											<div ms-repeat="XXGJBWXYSArr" class="btn" ms-class="{{isChecked('XXGJBWXYS',el.infocode) ? 'active':''}}"
											 ms-click="onCheckClick('XXGJBWXYS',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group" ms-if="(XXGJBWXYSSel.$model).indexOf('4') > -1">
									<div class="lb">吸烟状态 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.XYZT==el.infocode ? 'active':''}}" ms-click="onRadioClick('XYZT',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.XYZT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('XYZT',el.infocode)"
											 ms-repeat="XYZTArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div ms-if="info.CYZD==1 || info.CYZD==2 || info.CYZD==3">--%>
						<div ms-if="hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3">
							<div class="inputs">
								<div class="input-group">
									<div class="lb lb_check">合并疾病 <span class="required">*</span></div>
									<div class="input">
										<div id="HEBZ" class="checkbox-group">
											<div ms-if="hspXtzlInf.YNXFXLSJ==0">
												<div ms-repeat="HEBZArr" class="btn" ms-class="{{isChecked('HEBZ',el.infocode) ? 'active':''}}" ms-click="onCheckClick('HEBZ',el.infocode)">
													{{el.info}}
												</div>
											</div>
											<div ms-if="hspXtzlInf.YNXFXLSJ==1">
												<div ms-repeat="HEBZArrExceptMXXNSJ" class="btn" ms-class="{{isChecked('HEBZ',el.infocode) ? 'active':''}}" ms-click="onCheckClick('HEBZ',el.infocode)">
													{{el.info}}
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group" ms-if="(HEBZSel.$model).indexOf('1') > -1">
									<div class="lb">血运重建史 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.XYCJS==el.infocode ? 'active':''}}" ms-click="onRadioClick('XYCJS',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.XYCJS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('XYCJS',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group" ms-if="(HEBZSel.$model).indexOf('2') > -1">
									<div class="lb">分型 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.XFCDFX==el.infocode ? 'active':''}}" ms-click="onRadioClick('XFCDFX',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.XFCDFX==el.infocode ? 'active':''}}" ms-click="onRadioClick3('XFCDFX',el.infocode)"
											 ms-repeat="XFCDFXArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group" ms-if="(HEBZSel.$model).indexOf('3') > -1 || hspXtzlInf.YNXFXLSJ==1">
									<div class="lb">NYHA分级 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZGNYHA==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZGNYHA',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZGNYHA==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZGNYHA',el.infocode)"
											 ms-repeat="ZGNYHAArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group" ms-if="(HEBZSel.$model).indexOf('5') > -1">
									<div class="lb">描述 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.NXGJBMS==el.infocode ? 'active':''}}" ms-click="onRadioClick('NXGJBMS',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.NXGJBMS==el.infocode ? 'active':''}}" ms-click="onRadioClick3('NXGJBMS',el.infocode)"
											 ms-repeat="NXGJBMSArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="title">住院期间用药</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">降糖药物<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.SFJTYW==el.infocode ? 'active':''}}" ms-click="onRadioClick('SFJTYW',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.SFJTYW==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SFJTYW',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.SFJTYW == 1">--%>
							<div class="inputs" ms-if="hspXtzlInf.SFJTYW == 1">
								<div class="input-group">
									<div class="lb lb_check">药物名称 <span class="required">*</span></div>
									<div class="input">
										<div class="checkbox-group">
<%--											<div ms-repeat="JTYWArr" class="btn" ms-class="{{isChecked('JTYW',el.infocode) ? 'active':''}}" ms-click="onCheckClick('JTYW',el.infocode)">--%>
											<div ms-repeat="JTYWArr" class="btn" ms-class="{{isChecked('JTYW',el.infocode) ? 'active':''}}" ms-click="onCheckClick('JTYW',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">口服抗凝药物<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.SFKFKYYW==el.infocode ? 'active':''}}" ms-click="onRadioClick('SFKFKYYW',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.SFKFKYYW==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SFKFKYYW',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.SFKFKYYW == 1">--%>
								<div class="input-group" ms-if="hspXtzlInf.SFKFKYYW == 1">
									<div class="lb">药物名称<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.KFKYYW">--%>
										<select name="" ms-duplex="hspXtzlInf.KFKYYW">
											<option value="">请选择</option>
											<option ms-repeat="KFKYYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">PCSK9<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.SFPCSK9==el.infocode ? 'active':''}}" ms-click="onRadioClick('SFPCSK9',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.SFPCSK9==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SFPCSK9',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.SFPCSK9 == 1">--%>
								<div class="input-group" ms-if="hspXtzlInf.SFPCSK9 == 1">
									<div class="lb">药物名称<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.PCSK9">--%>
										<select name="" ms-duplex="hspXtzlInf.PCSK9">
											<option value="">请选择</option>
											<option ms-repeat="PCSK9Arr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.SFPCSK9 == 1">--%>
								<div class="input-group" ms-if="hspXtzlInf.SFPCSK9 == 1">
									<div class="lb">单次剂量<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.PCSK9DCJL" ms-keyup="NumberInput(this)" maxlength="8" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.PCSK9DCJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="8" />
										<div class="unit">mg</div>
									</div>
								</div>
							</div>
						</div>
<%--						<div class="block" ms-if="info.CYZD==1 || info.CYZD==2 || info.CYZD==3">--%>
						<div class="block" ms-if="hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3">
							<div class="title">检查结果</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">72h内肌钙蛋白 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.JGDB72==el.infocode ? 'active':''}}" ms-click="onRadioClick('JGDB72',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.JGDB72==el.infocode ? 'active':''}}" ms-click="onRadioClick3('JGDB72',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.JGDB72==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.JGDB72==1">
									<div class="lb">72h内肌钙蛋白最高值 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns fl">
<%--											<div class="btn" ms-class="{{info.JGDB72LX==el.infocode ? 'active':''}}" ms-click="onRadioClick('JGDB72LX',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.JGDB72LX==el.infocode ? 'active':''}}" ms-click="onRadioClick3('JGDB72LX',el.infocode)"
											 ms-repeat="JGDB72LXArr">
												{{el.info}}
											</div>
										</div>
<%--										<input type="text" ms-duplex="info.JGDB72ZGZ" />--%>
										<input type="text" ms-duplex="hspXtzlInf.JGDB72ZGZ" />
<%--										<select name="" ms-duplex="info.JGDB72DW">--%>
										<select name="" ms-duplex="hspXtzlInf.JGDB72DW">
											<option value="">请选择</option>
											<option ms-repeat="JGDB72DWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">脑钠肽 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.NNT==el.infocode ? 'active':''}}" ms-click="onRadioClick('NNT',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.NNT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('NNT',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.NNT==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.NNT==1">
									<div class="lb">脑钠肽类型<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.NNTLX==el.infocode ? 'active':''}}" ms-click="onRadioClick('NNTLX',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.NNTLX==el.infocode ? 'active':''}}" ms-click="onRadioClick3('NNTLX',el.infocode)"
											 ms-repeat="NNTLXArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.NNT==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.NNT==1">
									<div class="fl">最高值</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.NNTZGZ" />--%>
										<input type="text" ms-duplex="hspXtzlInf.NNTZGZ" />
										<div class="unit">pg/mL</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">总胆固醇(TC) <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZDGC==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZDGC',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZDGC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZDGC',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.ZDGC==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.ZDGC==1">
									<div class="lb">数值 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.ZDGCSZ" />--%>
										<input type="text" ms-duplex="hspXtzlInf.ZDGCSZ" />
										<div class="unit">mmol/L</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">甘油三酯(TG) <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.GYSZ==el.infocode ? 'active':''}}" ms-click="onRadioClick('GYSZ',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.GYSZ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('GYSZ',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.GYSZ==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.GYSZ==1">
									<div class="lb">数值<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.GYSZSZ" />--%>
										<input type="text" ms-duplex="hspXtzlInf.GYSZSZ" />
										<div class="unit">mmol/L</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">高密度脂蛋白(HDL-C)<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.GMDZDB==el.infocode ? 'active':''}}" ms-click="onRadioClick('GMDZDB',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.GMDZDB==el.infocode ? 'active':''}}" ms-click="onRadioClick3('GMDZDB',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.GMDZDB==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.GMDZDB==1">
									<div class="lb">数值<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.GMDZDBSZ" />--%>
										<input type="text" ms-duplex="hspXtzlInf.GMDZDBSZ" />
										<div class="unit">mmol/L</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">低密度脂蛋白(LDL-C)<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.DMDZDB==el.infocode ? 'active':''}}" ms-click="onRadioClick('DMDZDB',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.DMDZDB==el.infocode ? 'active':''}}" ms-click="onRadioClick3('DMDZDB',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.DMDZDB==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.DMDZDB==1">
									<div class="lb">数值<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.DMDZDBSZ" />--%>
										<input type="text" ms-duplex="hspXtzlInf.DMDZDBSZ" />
										<div class="unit">mmol/L</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">超声心动图<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.CSXDT==el.infocode ? 'active':''}}" ms-click="onRadioClick('CSXDT',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.CSXDT==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CSXDT',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.CSXDT==1">--%>
							<div class="inputs" ms-if="hspXtzlInf.CSXDT==1">
								<div class="input-group">
									<div class="lb">LVEF</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.LVEF" />%(治疗过程中最低值)--%>
										<input type="text" ms-duplex="hspXtzlInf.LVEF" />%(治疗过程中最低值)
									</div>
								</div>
								<div class="input-group">
									<div class="lb">室壁瘤</div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.SHIBL==el.infocode ? 'active':''}}" ms-click="onRadioClick('SHIBL',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.SHIBL==el.infocode ? 'active':''}}" ms-click="onRadioClick3('SHIBL',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">局部室壁活动异常</div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.JBSBHDYC==el.infocode ? 'active':''}}" ms-click="onRadioClick('JBSBHDYC',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.JBSBHDYC==el.infocode ? 'active':''}}" ms-click="onRadioClick3('JBSBHDYC',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="block">
							<div class="title">出院信息</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">住院天数 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.ZYTS" ms-keyup="limitInput(this)" maxlength="8" />--%>
										<input type="text" ms-duplex="hspXtzlInf.ZYTS" data-duplex-event="change" ms-keyup="limitInput(this)" maxlength="8" />
										<div class="unit">天</div>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">总费用 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.FEIY" ms-keyup="NumberInput(this)" maxlength="12" />--%>
										<input type="text" ms-duplex="hspXtzlInf.FEIY" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="12" />
										<div class="unit">元</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">患者转归 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.HZZG==el.infocode ? 'active':''}}" ms-click="onRadioClick('HZZG',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.HZZG==el.infocode ? 'active':''}}" ms-click="onRadioClick3('HZZG',el.infocode)"
											 ms-repeat="HZZGArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==1 || info.HZZG==2 || info.HZZG==3">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==1 || hspXtzlInf.HZZG==2 || hspXtzlInf.HZZG==3">
								<div class="input-group">
									<div class="lb lb_check">离院宣教 <span class="required">*</span></div>
									<div class="input">
										<div class="checkbox-group">
											<div class="btn" ms-repeat="LYXJArr" ms-class="{{isChecked('LYXJ',el.infocode) ? 'active':''}}" ms-click="onSelectClick3('LYXJ',el.infocode)">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==1">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==1">
								<div class="input-group">
									<div class="lb">出院时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.CYSJ" />--%>
										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.CYSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">治疗结果 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZLJG==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZLJG',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZLJG==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZLJG',el.infocode)"
											 ms-repeat="ZLJGArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==2">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==2">
								<div class="input-group">
									<div class="lb">离开本院大门时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.LKBYDMSJ" />--%>
										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.LKBYDMSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">医院名称</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.YYMC02" />--%>
										<input type="text" ms-duplex="hspXtzlInf.YYMC02" />
									</div>
								</div>
								<div class="input-group">
									<div class="input">
										<div class="checkbox-groupk">
<%--											<div class="btn" ms-class="{{info.SFSWLYY ? 'active' : ''}}" ms-click="onToggleClick('SFSWLYY')">是否是网络医院</div>--%>
											<div class="btn" ms-class="{{hspXtzlInf.SFSWLYY ? 'active' : ''}}" ms-click="onToggleClick('SFSWLYY')">是否是网络医院</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==2">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==2">
								<div class="input-group">
									<div class="lb">转运PCI</div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZYPCI02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZYPCI02',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZYPCI02==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZYPCI02',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.ZYPCI02==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.ZYPCI02==1">
									<div class="lb">直达导管室</div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.ZDDGS02==el.infocode ? 'active':''}}" ms-click="onRadioClick('ZDDGS02',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.ZDDGS02==el.infocode ? 'active':''}}" ms-click="onRadioClick3('ZDDGS02',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
<%--								<div class="input-group" ms-if="info.ZYPCI02==1">--%>
								<div class="input-group" ms-if="hspXtzlInf.ZYPCI02==1">
									<div class="lb">实际介入手术开始时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.SJJRSSKSSJ" />--%>
										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.SJJRSSKSSJ" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==2">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==2">
								<div class="input-group">
									<div class="lb">远程心电图传输 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.YCXDTCS02==el.infocode ? 'active':''}}" ms-click="onRadioClick('YCXDTCS02',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.YCXDTCS02==el.infocode ? 'active':''}}" ms-click="onRadioClick3('YCXDTCS02',el.infocode)"
											 ms-repeat="YCXDTCS02Arr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.YCXDTCS02==1 && info.HZZG==2">--%>
							<div class="inputs" ms-if="hspXtzlInf.YCXDTCS02==1 && hspXtzlInf.HZZG==2">
								<div class="input-group">
									<div class="lb">传输心电图至协作单位时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.CSXDTZXZDWSJ" />--%>
										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.CSXDTZXZDWSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">传输方式</div>
									<div class="input">
<%--										<select name="" ms-duplex="info.ZGCSFS">--%>
										<select name="" ms-duplex="hspXtzlInf.ZGCSFS">
											<option value="">请选择</option>
											<option ms-repeat="CSFSArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==3">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==3">
								<div class="input-group">
									<div class="lb">转科时间</div>
									<div class="input">
<%--										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.ZKSJ" />--%>
										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.ZKSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">接诊科室</div>
									<div class="input">
<%--										<input type="text" ms-duplex="info.JZKS" />--%>
										<input type="text" ms-duplex="hspXtzlInf.JZKS" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==3">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==3">
								<div class="input-group">
									<div class="lb">转科原因描述</div>
									<div class="input">
<%--										<input type="text" style="width: 790px" ms-duplex="info.ZKYYMS" />--%>
										<input type="text" style="width: 790px" ms-duplex="hspXtzlInf.ZKYYMS" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==4">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==4">
								<div class="input-group">
									<div class="lb">死亡时间 <span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="info.SWSJ" />--%>
										<input type="text" class="Wdate input" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})" ms-duplex="hspXtzlInf.SWSJ" />
									</div>
								</div>
								<div class="input-group">
									<div class="lb">死亡原因 <span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.SWYY==$index ? 'active':''}}" ms-click="onRadioClick('SWYY',$index)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.SWYY==$index ? 'active':''}}" ms-click="onRadioClick3('SWYY',$index)"
											 ms-repeat="SWYYArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.HZZG==4">--%>
							<div class="inputs" ms-if="hspXtzlInf.HZZG==4">
								<div class="input-group">
									<div class="lb">描述</div>
									<div class="input">
<%--										<input type="text" style="width: 790px" ms-duplex="info.SWMS" />--%>
										<input type="text" style="width: 790px" ms-duplex="hspXtzlInf.SWMS" />
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="!((info.CYZD==1 || info.CYZD==2 || info.CYZD==3) && info.HZZG==1)">--%>
							<div class="inputs" ms-if="!((hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3) && hspXtzlInf.HZZG==1)">
								<div class="input-group">
									<div class="lb">患者情况备注</div>
									<div class="input">
<%--										<input type="text" style="width: 790px" ms-duplex="info.ZGHZQKBZ" />--%>
										<input type="text" style="width: 790px" ms-duplex="hspXtzlInf.ZGHZQKBZ" />
									</div>
								</div>
							</div>
						</div>
<%--						<div class="block" ms-if="(info.CYZD==1 || info.CYZD==2 || info.CYZD==3) && info.HZZG==1">--%>
						<div class="block" ms-if="(hspXtzlInf.CYZD==1 || hspXtzlInf.CYZD==2 || hspXtzlInf.CYZD==3) && hspXtzlInf.HZZG==1">
							<div class="title">出院药物方案</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">抗血小板药物<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.CYDYSFKXXBYW==el.infocode ? 'active':''}}" ms-click="onRadioClick('CYDYSFKXXBYW',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.CYDYSFKXXBYW==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CYDYSFKXXBYW',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.CYDYSFKXXBYW==1">--%>
							<div class="inputs" ms-if="hspXtzlInf.CYDYSFKXXBYW==1">
								<div class="input-group">
									<div class="lb">药物名称<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYKXXBYW">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYKXXBYW">
											<option value="">请选择</option>
											<option ms-repeat="KXXBYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">服用频次<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYKXXBYWYYPC">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYKXXBYWYYPC">
											<option value="">请选择</option>
											<option ms-repeat="YYPCArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
<%--										<select name="" ms-duplex="info.CYDYKXXBYWYYZQ">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYKXXBYWYYZQ">
											<option value="">请选择</option>
											<option ms-repeat="YYZQArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">单次剂量<span class="required">*</span></div>
									<div class="input" style="padding-right: 0;">
<%--										<input type="text" ms-duplex-string="info.CYDYKXXBYWDCJL" ms-keyup="NumberInput(this)" maxlength="8" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.CYDYKXXBYWDCJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="8" />
										<div class="unit">mg</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">ACEI/ARB<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.CYDYSFACEI==el.infocode ? 'active':''}}" ms-click="onRadioClick('CYDYSFACEI',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.CYDYSFACEI==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CYDYSFACEI',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.CYDYSFACEI==1">--%>
							<div class="inputs" ms-if="hspXtzlInf.CYDYSFACEI==1">
								<div class="input-group">
									<div class="lb">药物名称<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYACEI">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYACEI">
											<option value="">请选择</option>
											<option ms-repeat="ACEIArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">服用频次<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYACEIYYPC">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYACEIYYPC">
											<option value="">请选择</option>
											<option ms-repeat="YYPCArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
<%--										<select name="" ms-duplex="info.CYDYACEIYYZQ">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYACEIYYZQ">
											<option value="">请选择</option>
											<option ms-repeat="YYZQArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">单次剂量<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.CYDYACEIDCJL" ms-keyup="NumberInput(this)" maxlength="8" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.CYDYACEIDCJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="8" />
										<div class="unit">mg</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">调脂药物<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.CYDYSFTZYW==el.infocode ? 'active':''}}" ms-click="onRadioClick('CYDYSFTZYW',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.CYDYSFTZYW==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CYDYSFTZYW',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.CYDYSFTZYW==1">--%>
							<div class="inputs" ms-if="hspXtzlInf.CYDYSFTZYW==1">
								<div class="input-group">
									<div class="lb">药物名称<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYTZYW">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYTZYW">
											<option value="">请选择</option>
											<option ms-repeat="TZYWArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">服用频次<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYTZYWYYPC">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYTZYWYYPC">
											<option value="">请选择</option>
											<option ms-repeat="YYPCArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
<%--										<select name="" ms-duplex="info.CYDYTZYWYYZQ">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYTZYWYYZQ">
											<option value="">请选择</option>
											<option ms-repeat="YYZQArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">单次剂量<span class="required">*</span></div>
									<div class="input" style="padding-right:0;">
<%--										<input type="text" ms-duplex-string="info.CYDYTZYWDCJL" ms-keyup="NumberInput(this)" maxlength="8" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.CYDYTZYWDCJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="8" />
										<div class="unit">mg</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">β受体阻滞剂<span class="required">*</span></div>
									<div class="input">
										<div class="radio-btns">
<%--											<div class="btn" ms-class="{{info.CYDYSFSTZZJ==el.infocode ? 'active':''}}" ms-click="onRadioClick('CYDYSFSTZZJ',el.infocode)"--%>
											<div class="btn" ms-class="{{hspXtzlInf.CYDYSFSTZZJ==el.infocode ? 'active':''}}" ms-click="onRadioClick3('CYDYSFSTZZJ',el.infocode)"
											 ms-repeat="RADIOArr">
												{{el.info}}
											</div>
										</div>
									</div>
								</div>
							</div>
<%--							<div class="inputs" ms-if="info.CYDYSFSTZZJ==1">--%>
							<div class="inputs" ms-if="hspXtzlInf.CYDYSFSTZZJ==1">
								<div class="input-group">
									<div class="lb">药物名称<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYSTZZJ">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYSTZZJ">
											<option value="">请选择</option>
											<option ms-repeat="STZZJArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">服用频次<span class="required">*</span></div>
									<div class="input">
<%--										<select name="" ms-duplex="info.CYDYSTZZJYYPC">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYSTZZJYYPC">
											<option value="">请选择</option>
											<option ms-repeat="YYPCArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
<%--										<select name="" ms-duplex="info.CYDYSTZZJYYZQ">--%>
										<select name="" ms-duplex="hspXtzlInf.CYDYSTZZJYYZQ">
											<option value="">请选择</option>
											<option ms-repeat="YYZQArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
								<div class="input-group">
									<div class="lb">单次剂量<span class="required">*</span></div>
									<div class="input">
<%--										<input type="text" ms-duplex-string="info.CYDYSTZZJDCJL" ms-keyup="NumberInput(this)" maxlength="8" />--%>
										<input type="text" ms-duplex-string="hspXtzlInf.CYDYSTZZJDCJL" data-duplex-event="change" ms-keyup="limitInputFloat(this)" maxlength="8" />
										<div class="unit">mg</div>
									</div>
								</div>
							</div>
							<div class="inputs">
								<div class="input-group">
									<div class="lb">患者情况备注</div>
									<div class="input">
<%--										<input type="text" style="width: 790px" ms-duplex="info.ZGHZQKBZ" />--%>
										<input type="text" style="width: 790px" ms-duplex="hspXtzlInf.ZGHZQKBZ" />
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="save-btn" onclick="commit()">保存</div>
		</div>
	</body>
	<script type="text/javascript">
		var _emgSeq = "${emgSeq}";
		var _wayTyp = "${wayTyp}";
		var _regSeq = "${regSeq}";

		var addrInfoList = publicFun.getItem('addrInfoList');
		var vm = avalon.define({
			$id: 'report',
			activeTab: 0,
			count: 0,
			baseInfo: {
				regSeq: _regSeq,  //登记注册序列号
				cstNam: '', //患者姓名
				cstSexCod: '', //性别
				cstAge: '', //年龄
				cardType: null, //证件类别
				idNbr: '', //证件号码
				bthDat: '', //出生日期
				pheNbr: '', //联系电话
				emgJob: '', //职业
				cstEdu: '', //文化程度
				maritalStatus: '', //婚姻状况
				nation: '', //民族
				// senRctCod: '', //意识
				// breNbr: '', //呼吸
				// hrtRte: '', //脉搏
				// tmpNbr: '', //体温
				// sbpUpNbr: '', //血压
				// sbpDownNbr: '',
				// preUsrNam: '', //医护人员
				// emgDat: '', //院内首诊医师接诊时间
				zyxh: '', //住院ID
				jzxh: '', //门诊ID（就诊ID）
			},

			hspXtzlInf:{
				/*firstaidinfo -- 基本信息*/
				FBSJ: '',  //发病时间
				FBSJWFJQDFZ: null,  //发病时间无法精确到分钟
				FBQJ: '',  //发病区间
				FBDZ01: '',  //发病地址（省）
				FBDZ02: '',  //发病地址（市）
				FBDZ03: '',  //发病地址（区/县）
				XXDZ: '',  //详细地址
				YBLX: '',  //医保类型
				YBBH: '',  //医保编号
				DBYB: null,  //大病医保

				/*firstaidinfo -- 病情现况*/
				BQPG: '', //病情评估
				BQPGMX: '', //病情评估明细

				/*firstaidinfo -- 来院方式*/
				DYFS: '', //来院方式
				CCDW: '', //出车单位
				HJSJ: '', //呼救时间
				ZJZSSJYY: null,  //直接转送上级医院
				ZDDGS: null,  //直达导管室
				// FZSJ: '', //分诊时间
				// JRQJSSJ: '', //进入抢救室时间
				DDYYDMSJ01: '',  //到达医院大门时间  DYFS(来院方式)为1(呼叫120出车)
				SCYLJCSJ: '',   //首次医疗接触时间
				YNSZYSJZSJ: '',   //院内首诊医师接诊时间
				YHRY: '',   //医护人员
				ZYLX: '',   //转院类型
				YYMC: '',   //医院名称
				ZCYYRMSJ: '',  //转出医院入门时间
				JDZYSJ: '',  //决定转院时间
				ZCYJCMSJ: '', //转出医院出门时间
				DDYYDMSJ02: '',  //到达医院大门时间  DYFS(来院方式)为2(转院)
				YNJZSJ: '', //院内接诊时间
				DDYYDMSJ03: '',  //到达医院大门时间  DYFS(来院方式)为3(自行来院)
				FBKS: null,  //发病科室
				// CWYSJCSJ: '',  //床位医生接触时间
				LKKSSJ: '', //离开科室时间

				/*firstaidinfo -- 基础生命体征*/
				YISHI: '',   //意识
				HUXI: '',    //呼吸
				MAIB: '',    //脉搏
				XINL: '',    //心率
				XUEY: '',    //血压
				TIWEN: '',    //体温

				/*firstaidinfo -- 院前溶栓治疗*/
				YQRSSC: null,   //溶栓筛查
				YQRSZL: null,    //溶栓治疗
				YQCZJJZ: null,  //存在禁忌症
				YQZDRSCS: 0,  //直达溶栓场所
				YQRSCS: null,  //溶栓场所
				YQKSZQTYSJ: '',  //开始知情同意时间
				YQQSZQTYSSJ: '',  //签署知情同意书时间
				YQKSRSSJ: '',  //开始溶栓时间
				YQRSJSSJ: '',  //溶栓结束时间
				YQRSYW: null,  //溶栓药物
				YQRSYWJL: null,  //溶栓药物剂量
				YQRSZT: null,  //溶栓再通
				YQRSHZYSJ: '',  //溶栓后造影时间（院前）
				YQBJPCI: 0,  //补救PCI
				YQSJSSSJ: '',  //实际手术时间
				YQSSDD: '',  //手术地点
				YQHZQKBZ: '', //患者情况备注(院前)

				/*cpctreat -- 心电图*/
				XINDT: null,     //心电图
				WHDYY: '',     //未获得原因
				// SFXDTSJ: '',   //首份心电图时间  无定义
				// XDTWJ: '',     //心电图文件  无定义
				// XDTZDSJ: '',   //心电图诊断时间  无定义
				YCXDTCS: null,   //远程心电图传输
				JSXDTSJ: null,   //接收120/网络医院心电图时间
				CSFS: '',    //传输方式

				/*cpctreat -- 实验室检查*/
				ISJGDB: null,    //肌钙蛋白
				SCJGDB: null,    //首次肌钙蛋白
				JGDBSZ: '',    //肌钙蛋白数值
				JGDBDW: '',    //肌钙蛋白单位
				JGDBXZ: '',    //肌钙蛋白性质
				CXSJ: '',      //抽血完成时间
				POCTSJ: '',    //获得报告时间
				ISXQJG: null,    //血清肌酐
				XQJGSZ: '',    //血清肌酐数值
				ISDEJT: null,    //D-二聚体
				DEJTSZ: '',    //D-二聚体数值
				DEJTDW: '',    //D-二聚体单位
				ISBNP: null,     //BNP
				BNPSZ: '',     //BNP数值
				ISNTPROBNP: null,  //NT-proBNP
				NTPROBNPSZ: '',  //NT-proBNP数值
				ISMYO: null,     //Myo
				MYOSZ: '',     //Myo数值
				MYODW: '',     //Myo单位
				ISCKMB: null,     //CKMB
				CKMBSZ: '',     //CKMB数值
				CKMBDW: '',     //CKMB单位

				jyxm: '',   //检验报告  无定义
				jcxm: '',   //检查报告  无定义

				/*cpctreat -- 心内科会诊*/
				XNKHZ: null,     //心内科会诊
				HZLX: null,      //会诊类型
				TZHZSJ: '',    //通知会诊时间
				HZSJ: '',      //会诊时间

				/*cpctreat -- 诊断*/
				CBZD: null,     //初步诊断
				HZZYFQHXZL: null,     //患者自愿放弃后续治疗
				CBZDSJ: '',     //初步诊断时间
				YISHENG: '',     //医生
				KILLIP: null,     //心功能分级
				RXJZ: null,     //绕行急诊
				RXCCU: null,     //绕行CCU
				CLCS: null,     //处理措施
				YXXJC: null,     //影像学检查
				TZCTSSJ: '',     //通知CT室时间
				CTSWCZBSJ: '',     //CT室完成准备时间
				CTSMKSSJ: '',     //CT扫描开始时间
				CTBGSJ: '',     //CT报告时间
				TZCCSSJ: '',     //通知彩超室时间
				CCJCSJ: '',     //彩超检查时间
				CCCJGSJ: '',     //彩超出结果时间
				TZXWKHZSJ: '',     //通知心外科会诊时间
				XWKHZSJ: '',     //心外科会诊时间
				JCLX: null,     //夹层类型
				ZLCL: null,     //治疗策略
				FACSXYXXTLX: '',     //非ACS心源性胸痛类型
				QTFXYXXTLX: '',     //其它非心源性胸痛类型
				YNHZQKBZ: '', //患者情况备注

				/*cpctreat -- 初始药物*/
				KXXBZL: null,   //抗血小板治疗
				ASPLJL: null,   //阿司匹林剂量
				ASPLSJ: '',   //阿司匹林时间
				LBGLJL: null,   //氯吡格雷剂量
				LBGLSJ: '',   //氯吡格雷时间
				TGRLJL: null,   //替格瑞洛剂量
				TGRLSJ: '',   //替格瑞洛时间
				KANGN: null,   //抗凝
				KNYW: '',   //抗凝药物
				KNYWJL: '',   //抗凝药物剂量
				KNYWDW: '',   //抗凝药物单位
				KNYWSJ: '',   //抗凝药物时间
				TTZL: null,   //他汀治疗
				BSTZZJ: null,   //β受体阻滞剂

				/*cpctreat -- 再灌注措施*/
				YWZGZCS: null,  //有无再灌注措施
				ZGZCS: null,    //再灌注措施
				WZGZCSYY: '',    //无灌注措施原因
				JDXPCIYS: '',  //决定行pci医生
				JDJRSSSJ: '',  //决定介入手术时间
				QDDGSSJ: '',  //启动导管室时间
				KSZQTYSJ: '',  //开始知情同意时间
				QSZQTYSJ: '',  //签署知情同意时间
				ZYKSSJ: '',   //造影开始时间
				ZGZRSCS: null,    //再灌注溶栓措施
				JDCABGSJ: '',    //决定CABG时间
				KSCABGSJ: '',    //开始CABG时间
				ZYPCI: '',    //转运PCI

				/*cpctreat -- 治疗信息*/
				WXFC: null,   //危险分层
				KSKNZLSJ: '', //开始抗凝时间

				/*cpctreat -- 院内溶栓治疗*/
				YNRSSC: null,   //溶栓筛查
				YNRSZL: null,   //溶栓治疗
				YNCZJJZ: null,  //存在禁忌症
				YNZDRSCS: null,   //直达溶栓场所
				YNRSCS: null,   //溶栓场所
				YNKSRSSJ: '',   //开始溶栓时间
				YNRSJSSJ: '',   //溶栓结束时间
				YNYW: '',   //药物(院内)
				YNJL: '',   //剂量(院内)
				YNRSZT: null,   //溶栓再通
				YNKSZQTYSJ: '',   //开始知情同意时间
				YNQSZQTYSSJ: '',   //签署知情同意书时间

				/*cpctreat -- 导管室 - 基本信息*/
				DGSJHSJ: '',  //导管室激活时间
				HZJDGSSJ: '',  //患者到达导管室时间
				KSCCSJ: '',   //开始穿刺时间
				JRYS: '',  //介入医师
				SZKNGYSJ: '',  //术中抗凝给药时间
				SZKNYW: '',  //术中抗凝药物
				SZKNYWJL: '',  //术中抗凝药物剂量
				SZKNYWDW: '',  //术中抗凝药物单位
				PCISSWCSJ: '',  //手术结束时间
				D2WSJ: '',  //D2W时间
				SFYW: null,  //是否延误
				YWYY: '',  //延误原因

				/*cpctreat -- 导管室 - 入路*/
				RULU: null,   //入路

				/*cpctreat -- 导管室 - 器械*/
				QNYX: 4,   //腔内影像
				GNJC: 3,   //功能检测
				GNJCSZ: null,   //数值
				IABP: 0,   //IABP
				LSQBQ: 0,   //临时起搏器
				ECMO: 0,   //ECMO
				ZXSFZZZ: 0,   //左心室辅助装置

				/*cpctreat -- 导管室 - 术中并发症*/
				SZBFZ: '',   //术中并发症

				/*cpctreat -- Grace评估*/
				WXYS: '',   //危险因素
				GRACEJGWTJ: '',   //Grace极高危条件
				GRACEFZ: '',    //Grace分值
				GRACEWXFC: null,   //Grace危险分层

				/*cpctreat -- 再次危险分层*/
				ZCWXFC: null,   //再次危险分层
				ZCWXFCSJ: '',   ////再次危险分层时间

				/*cpctreat -- 处理策略*/
				CLCL: null,   //处理策略
				QRXCL: null,   //侵入性策略
				SJJRZLSJ: '',   //实际介入治疗时间

				/*cpctreat -- 转归信息*/
				CYZD: null,    //出院诊断
				ZGFACSXYXXTLX: '',    //非ACS心源性胸痛类型
				ZGQTFXYXXTLX: '',    //其它非心源性胸痛类型
				QZSJ: '',    //确诊时间
				COVID19: null,    //确诊时间
					YNXFXLSJ: null,    //院内新发心力衰竭
				SFARNI: null,    //是否ARNI
				ARNI: '',      //ARNI频次
				ARNIDCJL: '',    //ARNI单次剂量
				ZYQJBFZ: '',    //住院期间并发症
				XXGJBWXYS: '',    //心血管疾病危险因素
				XYZT: null,    //吸烟状态
				HEBZ: '',    //合并疾病
				XYCJS: null,    //血运重建史
				XFCDFX: null,    //心房颤动分型
				ZGNYHA: null,    //NYHA分级
				NXGJBMS: null,    //脑血管疾病描述

				/*cpctreat -- 住院期间用药*/
				SFJTYW: null,  //是否降糖药物
				JTYW: '',   //降糖药物名称
				SFKFKYYW: null,   //是否口服抗凝药物
				KFKYYW: '',   //口服抗凝药物
				SFPCSK9: null,   //是否PCSK9
				PCSK9: '',   //PCSK9
				PCSK9DCJL: '',   //PCSK9单次剂量

				/*cpctreat -- 检查结果*/
				JGDB72: null,    //72小时内积钙蛋白
				JGDB72LX: null,    //72小时内积钙蛋白类型
				JGDB72ZGZ: '',    //72小时内积钙蛋白最高值
				JGDB72DW: '',    //72小时内积钙蛋白单位
				NNT: null,    //脑钠肽
				NNTLX: null,    //脑钠肽类型
				NNTZGZ: '',    //脑钠肽最高值
				ZDGC: null,    //总胆固醇(TC)
				ZDGCSZ: '',    //总胆固醇数值
				GYSZ: null,    //甘油三酯(TG)
				GYSZSZ: '',    //甘油三酯数值
				GMDZDB: null,    //高密度脂蛋白(HDL-C)
				GMDZDBSZ: '',    //高密度脂蛋白数值
				DMDZDB: null,    //低密度脂蛋白(LDL-C)
				DMDZDBSZ: '',    //低密度脂蛋白数值
				CSXDT: null,    //超声心动图
				LVEF: '',    //LVEF%(诊疗过程中最低值)
				SHIBL: null,    //室壁瘤
				JBSBHDYC: null,    //局部室壁活动异常

				/*cpctreat -- 出院信息*/
				ZYTS: '',    //住院天数
				FEIY: '',    //总费用
				HZZG: null,    //患者转归
				LYXJ: '',    //离院宣教
				CYSJ: '',    //出院时间
				ZLJG: null,    //治疗结果
				LKBYDMSJ: '',    //离开本院大门时间
				YYMC02: '',    //医院名称
				SFSWLYY: 0,    //是否是网络医院
				ZYPCI02: null,    //转运PCI
				ZDDGS02: null,    //直达导管室
				SJJRSSKSSJ: '',    //实际介入手术开始时间
				YCXDTCS02: null,    //远程心电图传输
				CSXDTZXZDWSJ: '',    //传输心电图至协作单位时间
				ZGCSFS: '',    //传输方式
				ZKSJ: '',    //转科时间
				JZKS: '',    //接诊科室
				ZKYYMS: '',    //转科原因描述
				SWSJ: '',    //死亡时间
				SWYY: null,    //死亡原因
				SWMS: '',    //死亡描述
				ZGHZQKBZ: '',    //患者情况备注

				/*cpctreat -- 出院药物方案*/
				CYDYSFKXXBYW: null,    //是否抗血小板药物
				CYDYKXXBYW: '',    //抗血小板药物-药物名称
				CYDYKXXBYWYYPC: '',    //抗血小板药物-服用频次
				CYDYKXXBYWYYZQ: '',    //抗血小板药物-用药周期
				CYDYKXXBYWDCJL: '',    //抗血小板药物-单次剂量
				CYDYSFACEI: null,    //是否ACEI/ARB
				CYDYACEI: '',    //ACEI/ARB-药物名称
				CYDYACEIYYPC: '',    //ACEI/ARB-服用频次
				CYDYACEIYYZQ: '',    //ACEI/ARB-用药周期
				CYDYACEIDCJL: '',    //ACEI/ARB-单次剂量
				CYDYSFTZYW: null,    //是否调脂药物
				CYDYTZYW: '',    //调脂药物-药物名称
				CYDYTZYWYYPC: '',    //调脂药物-服用频次
				CYDYTZYWYYZQ: '',    //调脂药物-用药周期
				CYDYTZYWDCJL: '',    //调脂药物-单次剂量
				CYDYSFSTZZJ: null,    //是否β受体阻滞剂
				CYDYSTZZJ: '',    //β受体阻滞剂-药物名称
				CYDYSTZZJYYPC: '',    //β受体阻滞剂-服用频次
				CYDYSTZZJYYZQ: '',    //β受体阻滞剂-用药周期
				CYDYSTZZJDCJL: '',    //β受体阻滞剂-单次剂量
			},

			info: {
				// ZHUYH: '', //住院ID
				// MENZH: '', //门诊ID
				// FBSJ: '', //时间轴发病时间
				// SFSWLYY: 0, //是否是网络医院
				// YBLX: '', //医保类型
				// YBBH: '', //医保编号
				// DBYB: null, //大病医保
				// BQPG: '', //病情评估
				// BQPGMX: '', //病情评估明细
				// ZJZSSJYY: null, //直接转送上级医院
				// ZDDGS: null, //直达导管室
				// ZDDGS02: null,
				// YCXDTCS02: null, //远程心电图传输
				//YNSZYSJZSJ: '',//院内首诊医师接诊时间
				//YHRY: '',//医护人员
				// ZYLX: '', //转院类型
				// YYMC: '', //医院名称
				// ZCYYRMSJ: '', //转出医院入门时间
				// JDZYSJ: '', //决定转院时间
				// ZCYJCMSJ: '', //转出医院出门时间
				// YNJZSJ: '', //院内接诊时间
				CWYSJCSJ: '', //床位医生接触时间
				//XINL: '',//心率
				// XUEYA: '', //血压
				// YQHZQKBZ: '', //患者情况备注
				// YNHZQKBZ: '', //患者情况备注
				// ZGHZQKBZ: '',
				// YQZDRSCS: 0, //直达溶栓场所
				// YNJL: '', //剂量
				// YNRSZT: null, //溶栓再通
				// YQBJPCI: 0, //补救PCI
				// YQSJSSSJ: '', //实际手术时间
				// YQSSDD: '', //手术地点
				// YQCZJJZ: null, //存在禁忌症
				// XINDT: null, //心电图
				// WHDYY: '', //未获得原因
				// CXSJ: '', //抽血完成时间
				// POCTSJ: '', //获得报告时间
				XDT: '', //心电图
				// ZGCSFS: '',
				// CSXDTZXZDWSJ: '', //传输心电图至协作单位时间
				// ISJGDB: null, //肌钙蛋白
				// ISXQJG: null, //血清肌酐
				// XQJGSZ: '', //血清肌酐数值
				// ISDEJT: null, //D-二聚体
				// DEJTSZ: '', //D-二聚体数值
				// DEJTDW: '', //D-二聚体单位
				// ISBNP: null, //BNP
				// BNPSZ: '', //BNP数值
				// ISNTPROBNP: null, //NT-proBNP
				// NTPROBNPSZ: '', //NT-proBNP数值
				// ISMYO: null, //Myo
				// MYOSZ: '', //Myo数值
				// MYODW: '', //Myo单位
				// ISCKMB: null, //CKMB
				// CKMBSZ: '', //CKMB数值
				// CKMBDW: '', //CKMB单位
				// xnkhz: null, //心内科会诊
				// hzlx: null, //会诊类型
				// invitationDate: '', //通知会诊时间
				// invitationDate: '', //会诊时间
				// CBZD: null, //初步诊断
				// HZZYFQHXZL: null, //患者自愿放弃后续治疗
				// CBZDSJ: '', //初步诊断时间
				JZZDSJ: '', //急诊诊断时间
				// YISHENG: '', //医生
				// KILLIP: null, //心功能分级
				// RXJZ: null, //绕行急诊
				// RXCCU: null, //绕行CCU
				// KXXBZL: null, //抗血小板治疗
				// ASPLJL: null, //阿司匹林剂量
				// ASPLSJ: '', //阿司匹林时间
				// LBGLJL: null, //氯吡格雷剂量
				// LBGLSJ: '', //氯吡格雷时间
				// TGRLJL: null, //替格瑞洛剂量
				// TGRLSJ: '', //替格瑞洛时间
				// KANGN: null, //抗凝
				// KNYW: '', //抗凝药物
				// KNYWJL: '', //抗凝药物剂量
				// KNYWDW: '', //抗凝药物单位
				// KNYWSJ: '', //抗凝药物时间
				// TTZL: null, //他汀治疗
				// BSTZZJ: null, //β受体阻滞剂
				// YWZGZCS: null, //再灌注措施
				// WZGZCSYY: '', //无灌注措施原因
				// ZGZCS: null, //措施
				// ZYPCI: null, //转运PCI
				// ZYPCI02: null,
				// ZGZRSCS: null, //溶栓措施（补充）
				// YNRSSC: null, //院内溶栓筛查（补充）
				// YNRSZL: null, //院内溶栓治疗（补充）
				// YNCZJJZ: null, //院内存在禁忌症（补充）
				// YNZDRSCS: null, //院内直达溶栓场所（补充）
				// YNRSCS: null, //院内溶栓场所（补充）
				// YNKSZQTYSJ: '', //院内开始知情同意时间（补充）
				// YNQSZQTYSSJ: '', //院内签署知情同意书（补充）
				// YNKSRSSJ: '', //院内开始溶栓时间（补充）
				// YNRSJSSJ: '', //院内溶栓结束时间（补充）
				// YNYW: '', //院内药物（补充）
				// YNJL: '', //院内剂量（补充）
				// JDXPCIYS: '', //决定行pci医生
				// JDJRSSSJ: '', //决定介入手术时间
				// KSCABGSJ: '', //开始CABG时间
				// JDCABGSJ: '', //决定CABG时间
				// QDDGSSJ: '', //启动导管室时间
				// KSZQTYSJ: '', //开始知情同意时间
				// QSZQTYSJ: '', //签署知情同意时间
				// DGSJHSJ: '', //导管室激活时间
				// HZJDGSSJ: '', //患者到达导管室时间
				// JRYS: '', //介入医师
				// KSCCSJ: '', //开始穿刺时间
				// ZYKSSJ: '', //造影开始时间
				// SZKNGYSJ: '', //术中抗凝给药时间
				// SZKNYW: '', //术中抗凝药物
				// SZKNYWJL: '', //术中抗凝药物剂量
				// SZKNYWDW: '', //术中抗凝药物单位
				// PCISSWCSJ: '', //手术结束时间
				// D2WSJ: '', //D2W时间
				// SFYW: null, //是否延误
				// RULU: null, //入路
				// QNYX: 4, //腔内影像
				// GNJC: 3, //功能检测
				// GNJCSZ: null, //功能检测数值
				// IABP: 0, //IABP
				// LSQBQ: 0, //临时起搏器
				// ECMO: 0, //ECMO
				// ZXSFZZZ: 0, //左心室辅助装置
				// SZBFZ: '', //术中并发症
				// WXYS: '', //Grace危险因素
				// GRACEJGWTJ: '', //Grace极高危条件
				// GRACEWXFC: null, //Grace危险分层
				// ZCWXFC: null, //再次危险分层
				// ZCWXFCSJ: '', //再次危险分层时间
				// CLCL: null, //处理策略
				// QRXCL: null, //侵入性策略
				// SJJRZLSJ: '', //实际介入治疗时间
				// CYZD: null, //初步诊断
				// YXXJC: null, //影像学检查
				// WXFC: null, //危险分层（补充）
				// TZCTSSJ: '', //通知CT室时间
				// CTSWCZBSJ: '', //CT室完成准备时间
				// CTSMKSSJ: '', //CT扫描开始时间
				// CTBGSJ: '', //CT报告时间
				// TZCCSSJ: '', //通知彩超室时间
				// CCJCSJ: '', //彩超检查时间
				// CCCJGSJ: '', //彩超出结果时间
				// TZXWKHZSJ: '', //通知心外科会诊时间
				// XWKHZSJ: '', //心外科会诊时间
				// ZLCL: null, //治疗策略
				// KSKNZLSJ: '', //开始抗凝时间
				// FACSXYXXTLX: '', //非ACS心源性胸痛类型
				// ZGFACSXYXXTLX: '',
				// CLCS: null, //处理措施
				// QTFXYXXTLX: '', //其它非心源性胸痛类型
				// ZGQTFXYXXTLX: '',
				// LYXJ: '', //离院宣教
				// JCLX: null, //夹层类型
				// ZYQJBFZ: '', //住院期间并发症
				// YNXFXLSJ: null, //院内新发心力衰竭
				// XXGJBWXYS: '', //患者转归危险因素
				// HEBZ: '', //合并疾病
				// XYCJS: null, //血运重建史
				// JGDB72: null, //72小时内积钙蛋白
				JGDB72SZ: '',
				// NNT: null, //脑钠肽
				// NNTZGZ: '', //脑钠肽最高值
				// ZDGC: null, //总胆固醇
				// ZDGCSZ: '', //总胆固醇数值
				// GYSZ: null, //甘油三酯
				// GYSZSZ: '', //甘油三酯数值
				// GMDZDB: null, //高密度脂蛋白
				// GMDZDBSZ: '', //高密度脂蛋白数值
				// DMDZDB: null, //低密度脂蛋白
				// DMDZDBSZ: '', //低密度脂蛋白数值
				// CSXDT: null, //超声心动图
				// LVEF: '', //LVEF
				// SHIBL: null, //室壁瘤
				// JBSBHDYC: null, //局部室壁活动异常
				// COVID19: null, //COVID-19
				// XYZT: null, //吸烟状态
				// XFCDFX: null, //心房颤动分型
				// ZGNYHA: null, //NYHA分级
				// NXGJBMS: null, //脑血管疾病描述
				// JGDB72ZGZ: '', //72h内肌钙蛋白最高值
				// JGDB72LX: null, //72h肌钙蛋白类型
				// SCJGDB: null, //首次肌钙蛋白
				// JGDB72DW: '',
				JGDB02: null,
				JGDB03: null,
				// NNTLX: null, //脑钠肽类型
				// HZZG: null, //患者转归
				// ZLJG: null, //治疗结果
				// SWYY: null, //死亡原因
				// YWYY: '', //是否延误
				// LKBYDMSJ: '', //离开本院大门时间
				// YYMC02: '', //医院名称
				// ZKYYMS: '', //转科原因描述
				// SWMS: '', //死亡描述

				// SJJRSSKSSJ: '', //实际介入手术开始时间
				// CYSJ: '', //出院时间
				// ZYTS: '', //住院天数
				// FEIY: '', //费用
				// QZSJ: '', //确诊时间
				// ZKSJ: '', //转科时间
				// JZKS: '', //接诊科室
				// SWSJ: '', //死亡时间
				GMZY: '', //冠脉造影
				// CYDYSFKXXBYW: null, //是否抗血小板药物
				// CYDYSFACEI: null, //是否ACEI/ARB
				// CYDYSFTZYW: null, //是否调脂药物
				// CYDYSFSTZZJ: null, //是否β受体阻滞剂
				// CYDYKXXBYW: '', //抗血小板药物-药物名称
				// CYDYACEI: '', //ACEI/ARB-药物名称
				// CYDYTZYW: '', //调脂药物-药物名称
				// CYDYSTZZJ: '', //β受体阻滞剂-药物名称
				// CYDYKXXBYWYYPC: '', //抗血小板药物-服用频次
				// CYDYACEIYYPC: '', //ACEI/ARB-服用频次
				// CYDYTZYWYYPC: '', //调脂药物-服用频次
				// CYDYSTZZJYYPC: '', //β受体阻滞剂-服用频次
				// CYDYKXXBYWYYZQ: '', //抗血小板药物-用药周期
				// CYDYACEIYYZQ: '', //ACEI/ARB-用药周期
				// CYDYTZYWYYZQ: '', //调脂药物-用药周期
				// CYDYSTZZJYYZQ: '', //β受体阻滞剂-用药周期
				// CYDYKXXBYWDCJL: '', //抗血小板药物-单次剂量
				// CYDYACEIDCJL: '', //ACEI/ARB-单次剂量
				// CYDYTZYWDCJL: '', //调脂药物-单次剂量
				// CYDYSTZZJDCJL: '', //β受体阻滞剂-单次剂量
				// JGDBSZ: '', //肌钙蛋白数值
				// JGDBXZ: '', //肌钙蛋白性质
				// jyxm: 0,
				// jcxm: 0,
				// gracefz: '', //grace分值
				pfxx: false, //grace评分细项
				// SFARNI: null, //是否ARNI
				ARNIQJ: '', //ARNI频次区间
				// ARNI: '', //ARNI频次
				// ARNIDCJL: '', //ARNI单次剂量
				// SFJTYW: null, //是否降糖药物
				// JTYW: '', //降糖药物
				// SFKFKYYW: null, //是否口服抗凝药物
				// KFKYYW: '', //口服抗凝药物
				// SFPCSK9: null, //是否PCSK9
				// PCSK9: '', //PCSK9
				// PCSK9DCJL: '', //PCSK9单次剂量
			},
			aidPatient: {
				// scePrvCod: '', //发病地址--省
				// sceCtyCod: '', //发病地址--市
				// sceAr0Cod: '', //发病地址--县/区
				// almtime: '', //呼救时间
				// illTim: '', //发病时间
				// illTimFlg: null, //发病时间无法精确到分钟
				// illperd: '', //发病区间
				// sceAdr: '', //详细地址
			},
			aidPatientXt: {
				// ddfs: '', //到达方式
				// ccdw: '', //出车单位
				// ddyydmsj: '', //到达医院大门时间
				// scyljc: '', //首次医疗接触时间
				// yqrssc: null, //院前溶栓筛查
				// yqrs: null, //溶栓治疗
				// rscs: null, //溶栓场所
				// zqtyks: '', //开始知情同意
				// qszqty: '', //签署知情同意
				// rsks: '', //开始溶栓时间
				// rsjs: '', //溶栓结束时间
				// rszt: null, //溶栓再通
				// rshzy: '', //溶栓后造影时间
				// rsyw: null, //院前溶栓药物
				// rsywjl: null, //院前溶栓药物剂量
				// ycxdtcs: null, //远程心电图传输
				// csfs: null, //心电图传输方式
				// cssj: '', //心电图传输时间
			},
			ynfb: {
				illTim: '',
				fstTim: '', //本次发病后首次医疗接触时间
				// illDep: null, //发病地点
				// lveTim: '', //离开发病现场时间
			},
			hspEcgInf: {
				ecgSeq: '',   //心电图序号
				refId: '',    //关联id
				fileDate: '', //首份心电图时间
				filePath: '',  //心电图路径
				fileDiaDate: '', //心电图诊断时间
			},
			modalGraceInfo: {
				cstAge: '',
				hrtRte: '',
				sbpupNbr: '',
				jgdb: '',
				killip: '',
				killip2: '',
				wxys: '',
				wxys2: '',
			},
			modalGraceScore: {
				ageScore: 0,
				hrtScore: 0,
				sbpScore: 0,
				creScore: 0,
				killipScore: 0,
				dangerScore: 0,
				total: 0,
			}, //grace评分细项展示
			timeList: [], //时间轴信息
			list: [], //心电图和肌钙蛋白的List
			cstSexCodArr: [], //性别列表
			cardTypeArr: [], //证件类别表
			nationArr: [], //民族类别表
			emgJobArr: [], //职业列表
			WHCDArr: [], //文化程度列表
			maritalStatusArr: [], //婚姻状态列表
			BQPGArr: [], //病情评估列表
			BQPGMXArr: [], //病情评估明细列表
			XXGJBWXYSArr: [], //患者转归危险因素
			BQPGMXSel: [], //病情评估多选
			XXGJBWXYSSel: [], //患者转归危险因素多选表
			HEBZArr: [], //合并疾病
			HEBZArrExceptMXXNSJ: [],  //合并疾病(少‘慢性心力衰竭’)
			HEBZSel: [], //合并症多选表
			ddfsArr: [], //到院方式列表
			ccdwArr: [], //出车单位列表
			ZYLXArr: [], //转院类型列表
			CBZDArr: [], //初步诊断列表
			YWYYArr: [], //是否延误列表
			FACSXYXXTLXArr: [], //非ACS心源性胸痛
			QTFXYXXTLXArr: [], //其它非心源性胸痛
			ZGFACSXYXXTLXArr: [], //非ACS心源性胸痛(转归)
			ZGQTFXYXXTLXArr: [], //其它非心源性胸痛(转归)
			ZYQJBFZArr: [], //住院期间并发症
			LYXJArr: [], //离院宣教
			LYXJSel: [], //离院宣教选中项
			JGDB72DWArr: [],
			CSFSArr: [], //传输方式
			provinceList: addrInfoList.province || [], //省
			cityList: [], //市
			cntyList: [], //区
			FBQJArr: [], //发病区间
			YBLXArr: [], //医保类型
			WLYYArr: [], //网络医院
			senRctCodArr: [], //意识
			SZBFZArr: [], //术中并发症列表
			RSYWArr: [], //药物
			RSYWJLArr: [], //剂量
			KNYWArr: [], //抗凝药物
			KXXBYWArr: [], //抗血小板药物
			TZYWArr: [], //调脂药物
			STZZJArr: [], //β受体阻滞剂药物
			ACEIArr: [], //ACEI/ARB药物
			YYPCArr: [], //用药频次
			YYZQArr: [], //用药周期
			YQRSSCArr: [],
			DEJTDWArr: [], //单位
			MYODWArr: [], //myo单位
			CKMBDWArr: [], //CKMB单位
			ZGZRSCSArr: [], //再灌注溶栓措施
			JGDBXZArr: [], //肌钙蛋白性质表
			JCLXArr: [], //夹层类型
			ARNIQJArr: [], //ARNI区间
			ARNIPCArr: [], //ARNI频次
			JTYWArr: [], //降糖药物
			KFKYYWArr: [], //口服抗凝药物
			PCSK9Arr: [], //PCSK9

			JGDBDWArr:[{
				info: 'ng/mL',
				infocode: '1'
			},{
				info: 'ug/L',
				infocode: '2'
			}],

			KNYWDWArr: [{
				info: 'mg',
				infocode: '0'
			}, {
				info: 'U',
				infocode: '1'
			}],
			RADIOArr: [{
				info: '否',
				infocode: '0'
			}, {
				info: '是',
				infocode: '1'
			}], // 是否单选表
			YQRSZLArr: [{
				info: '有',
				infocode: '1'
			}, {
				info: '无',
				infocode: '0'
			}], //溶栓治疗列表
			YQRSCSArr: [], //溶栓场所列表
			YQSSDDArr: [{
				info: '本院',
				infocode: '1'
			}, {
				info: '外院',
				infocode: '2'
			}], //手术地点列表
			XINDTArr: [{
				info: '无',
				infocode: '0'
			}, {
				info: '有',
				infocode: '1'
			}], //心电图列表
			YCXDTCSArr: [{
				info: '接收120/网络医院心电图',
				infocode: '1'
			}, {
				info: '未传输',
				infocode: '2'
			}], //远程心电图传输列表
			hzlxArr: [{
				info: '现场会诊',
				infocode: '1'
			}, {
				info: '远程会诊',
				infocode: '2'
			}], //会诊类型列表
			ASPLJLArr: [{
				info: '0mg',
				infocode: '1'
			}, {
				info: '100mg',
				infocode: '2'
			}, {
				info: '300mg',
				infocode: '3'
			}, {
				info: '其他剂量',
				infocode: '4'
			}], //阿司匹林剂量列表
			LBGLJLArr: [{
				info: '0mg',
				infocode: '1'
			}, {
				info: '300mg',
				infocode: '2'
			}, {
				info: '600mg',
				infocode: '3'
			}, {
				info: '其他剂量',
				infocode: '4'
			}], //氯吡格雷剂量列表
			TGRLJLArr: [{
				info: '0mg',
				infocode: '1'
			}, {
				info: '90mg',
				infocode: '2'
			}, {
				info: '180mg',
				infocode: '3'
			}, {
				info: '其他剂量',
				infocode: '4'
			}], //氯吡格雷剂量列表
			WXYSArr: [], //危险因素列表
			arr_wxys: [{
				infocode: '1',
				score: 39
			}, {
				infocode: '2',
				score: 28
			}, {
				infocode: '3',
				score: 14
			}],
			WXYSSel: [], //危险因素选中项
			GRACEJGWTJArr: [], //Grace极高危条件列表
			GRACEJGWTJSel: [], //Grace极高危条件选中项
			// GRACEWXFCArr: [], //Grace危险分层
			WXFCArr: [], //危险分层列表
			// ZCWXFCArr: [{info: '未做', infocode: '1'}, {info: '转为STEMI', infocode: '2'}, {info: '极高危', infocode: '3'},
			//     {info: '高危', infocode: '4'}, {info: '中危', infocode: '5'}, {info: '低危', infocode: '6'}],//再次危险分层列表
			ZCWXFCArr: [], //再次危险分层
			KILLIPArr: [],
			CLCLArr: [], //处理策略列表
			QRXCLArr: [], //侵入性策略列表
			// CUOSArr: [{info: '直接PCI', infocode: '1'}, {info: '溶栓', infocode: '2'}, {info: '择期介入', infocode: '3'},
			//     {info: 'CABG', infocode: '4'}, {info: '转运PCI', infocode: '5'}],//措施列表
			WZGZCSYYArr: [], //无再灌注措施原因列表
			WZGZCSYYSel: [], //无再灌注措施原因选中项
			ZLCLArr: [], //治疗策略列表
			RULUArr: [], //入路列表
			COVID19Arr: [], //COVID-19表
			XYZTArr: [], //吸烟状态表
			XFCDFXArr: [], //心房颤动分型表
			ZGNYHAArr: [], //NYHA分级表
			NXGJBMSArr: [], //脑血管疾病描述表
			JGDB72LXArr: [{
				info: 'TNT',
				infocode: '1'
			}, {
				info: 'TNI',
				infocode: '2'
			}], //72h内肌钙蛋白最高值表
			SCJGDBArr: [{
				info: 'TnT',
				infocode: '1'
			}, {
				info: 'Tnl',
				infocode: '2'
			}], //首次肌钙蛋白表
			NNTLXArr: [{
				info: 'BNP',
				infocode: '1'
			}, {
				info: 'NT-proBNP',
				infocode: '2'
			}], //脑钠肽类型表
			SWYYArr: [], //死亡原因表
			YCXDTCS02Arr: [{
				info: '传输心电图至协作单位(转出患者时)',
				infocode: '1'
			}, {
				info: '无',
				infocode: '2'
			}], //远程心电图传输表
			YXXJCArrFDMSS:[{
				info: '急诊CT',
				infocode: '1'
			},{
				info: '未作',
				infocode: '4'
			}],
			QNYXArr: [], //腔内影像列表
			GNJCArr: [], //功能检测列表
			
			YWYYSel: [], //是否延误选中项
			
			SZBFZSel: [], //术中并发症选中项
			FACSXYXXTLXSel: [], //非ACS心源性胸痛类型选中项
			QTFXYXXTLXSel: [], //其它非心源性胸痛类型选中项
			ZGFACSXYXXTLXSel: [],
			ZGQTFXYXXTLXSel: [],
			LYXJSel: [], //离院宣教类型选中项
			ZYQJBFZSel: [], //住院期间并发症类型选中项
			YXXJCSel: [], //影像学检查多选选中
			JTYWSel: [], //降糖药物选中项
			YXXJCArr: [],
			CYZDArr: [],
			HZZGArr: [],
			ZLJGArr: [],
			jylist: [],
			currItem: {},
			//检验选项
			chooseItem: function(item) {
				vm.currItem = {};
				vm.currItem = item;
			},
			jclist: [],
			//检查选项
			toggle: function(el) {
				var _list = vm.jclist;
				for (var i = 0; i < _list.length; i++) {
					if (el.applicationNo == _list[i].applicationNo) {
						el.show = !el.show;
						break;
					}
				}
				vm.jclist = _list;
			},
			//只能输入整数
			limitInput: function(obj, max) {
				obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
				obj.value = obj.value.replace(/^(\-)*(\d+)\.*$/, '$1$2'); //只能保留一位小数
				if (obj.value != "") {
					if (obj.value > max) {
						alert('数值不能超过' + max);
						obj.value = '';
						return;
					} else {
						obj.value = parseFloat(obj.value);
					}
				}
			},
			//限制大小 保留两位小数的浮点数
			limitInputFloat: function (obj, max) {
				obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
				obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的
				obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
				obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/, '$1$2.$3'); //只能输入两个小数
				var data = parseFloat(obj.value);
				if (data != "") {
					if (data > max) {
						alert('数值不能超过' + max);
						obj.value = '';
						return;
					}
				}
				console.log('value', obj.value);
			},
			//数值
			// NumberInput: function(obj) {
			// 	obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
			// 	obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的
			// 	obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
			// 	obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/, '$1$2.$3'); //只能输入两个小数
			// 	if (obj.value.indexOf(".") < 0 && obj.value != "") {
			// 		obj.value = parseFloat(obj.value);
			// 	}
			// },
			//点击tab页
			onTabClick: function(busStep, index) {
				vm.activeTab = index;
				getXtInfoByBusStep(busStep);
			},
			//渲染多选选项
			isChecked: function(prop, code) {
				var flag = false;
				for (var i = 0; i < vm[prop + 'Sel'].length; i++) {
					var el = vm[prop + 'Sel'][i];
					if (el == code) {
						flag = true;
						break;
					}
				}
				return flag;
			},
			onToggleClick: function(prop) {
				// if (prop == 'illTimFlg') {
				// 	if (vm.aidPatient['illTimFlg'] == 0 || vm.aidPatient['illTimFlg'] == null) {
				// 		vm.aidPatient['illTimFlg'] = 1;
				// 		if (vm.aidPatient['illTim']) {
				// 			var time = vm.aidPatient['illTim'];
				// 			newTime = moment(new Date(time)).format('YYYY/MM/DD');
				// 			vm.aidPatient['illTim'] = newTime;
				// 		}
				// 	} else if (vm.aidPatient['illTimFlg'] == 1) {
				// 		vm.aidPatient['illTimFlg'] = 0;
				// 		if (vm.aidPatient['illTim']) {
				// 			vm.aidPatient['illTim'] = vm.aidPatient['illTim'] + ' 00:00'
				// 		}
				// 	}
				// }
				if (prop == 'FBSJWFJQDFZ') {
					if (vm.hspXtzlInf['FBSJWFJQDFZ'] == 0 || vm.hspXtzlInf['FBSJWFJQDFZ'] == null) {
						vm.hspXtzlInf['FBSJWFJQDFZ'] = 1;
						if (vm.hspXtzlInf['FBQJ']) {
							var time = vm.hspXtzlInf['FBQJ'];
							newTime = moment(new Date(time)).format('YYYY/MM/DD');
							vm.hspXtzlInf['FBQJ'] = newTime;
						}
					} else if (vm.hspXtzlInf['FBSJWFJQDFZ'] == 1) {
						vm.hspXtzlInf['FBSJWFJQDFZ'] = 0;
						if (vm.hspXtzlInf['FBQJ']) {
							vm.hspXtzlInf['FBQJ'] = vm.hspXtzlInf['FBQJ'] + ' 00:00'
						}
					}
				} else {
					if (vm.hspXtzlInf[prop]) {
						vm.hspXtzlInf[prop] = 0;
					} else {
						vm.hspXtzlInf[prop] = 1;
					}
				}
			},

			//监听多选点击事件
			onCheckClick: function(prop, code) {
				var list = vm[prop + 'Sel'];
				console.log('list1', list);
				if (list.indexOf(code) > -1) {
					list.splice(list.indexOf(code), 1);
					console.log('listDel', list);
				} else {
					list.push(code)
					console.log('listAdd', list);
				}
				vm[prop + 'Sel'] = list;
				// vm.info[prop] = list.join(',');
				vm.hspXtzlInf[prop] = list.join(',');
				console.log('list2', list);
				console.log('prop', vm.hspXtzlInf[prop]);
			},

			// 点击无 选中状态全部为未选中状态 （当字典中00或者0代表无的时候）
			onSelectClick: function(prop, code) {
				var list = vm[prop + 'Sel'];
				if (list.indexOf(code) > -1) {
					list.splice(list.indexOf(code), 1)
				} else if (code == '00' || code == '0') {
					list = [];
					if (code == '00') {
						list.push('00');
					} else {
						list.push('0');
					}
				} else {
					if (list[0] == '00') {
						list.splice(list.indexOf('00'), 1)
					} else if (list[0] == '0') {
						list.splice(list.indexOf('0'), 1)
					}
					list.push(code)
				}
				vm[prop + 'Sel'] = list;
				// vm.info[prop] = list.join(',');
				vm.hspXtzlInf[prop] = list.join(',');
			},

			// 点击无 选中状态全部为未选中状态 （当字典中99或者9代表无的时候）
			onSelectClick3: function(prop, code) {
				var list = vm[prop + 'Sel'];
				if (list.indexOf(code) > -1) {
					list.splice(list.indexOf(code), 1)
				} else if (code == '99' || code == '9') {
					list = [];
					if (code == '99') {
						list.push('99');
					} else {
						list.push('9');
					}
				} else {
					if (list[0] == '99') {
						list.splice(list.indexOf('99'), 1)
					} else if (list[0] == '9') {
						list.splice(list.indexOf('9'), 1)
					}
					list.push(code)
				}
				vm[prop + 'Sel'] = list;
				// vm.info[prop] = list.join(',');
				vm.hspXtzlInf[prop] = list.join(',');
			},
			
			//影像学检查点击未做
			onDoneClick: function(prop, code) {
				var list = vm[prop + 'Sel'];
				if (list.indexOf(code) > -1) {
					list.splice(list.indexOf(code), 1)
				} else if (code == '4') {
					list = [];
					list.push('4');
				} else {
					if (list[0] == '4') {
						list.splice(list.indexOf('4'), 1)
					}
					list.push(code)
				}
				vm[prop + 'Sel'] = list;
				// vm.info[prop] = list.join(',');
				vm.hspXtzlInf[prop] = list.join(',');
			},
			// onRadioClick: function(prop, val) {
			// 	vm.info[prop] = val;
			// },
			onRadioClick2: function(prop, val) {
				vm.aidPatientXt[prop] = val;
			},
			onRadioClick3: function(prop, val) {
				vm.hspXtzlInf[prop] = val;
			},
			//转院类型专用radio
			onRadioClickZYLX: function(prop, val) {
				vm.hspXtzlInf[prop] = val;
				if(val == '2'){
					vm.hspXtzlInf.YYMC = '';
				}
			},
			//院内新发心力衰竭联动合并疾病专用radio
			onRadioClickYNXFXLSJ: function(prop, val) {
				vm.hspXtzlInf[prop] = val;
				if(val == '1'){
					var pos = vm.hspXtzlInf.HEBZ.indexOf('3');
					if(pos == vm.hspXtzlInf.HEBZ.length - 1){
						vm.hspXtzlInf.HEBZ = vm.hspXtzlInf.HEBZ.replace(",3","");
					}else{
						vm.hspXtzlInf.HEBZ = vm.hspXtzlInf.HEBZ.replace("3,","");
					}
					vm.HEBZSel.splice(vm.HEBZSel.indexOf('3'), 1);
				}
			},
			addItem: function(flag) {
				if (vm.list.length < 2) {
					vm.list.push(flag);
				}
			},
			addItem2: function(flag) {
				if (vm.list.length < 1) {
					vm.list.push(flag);
				}
			},
			hasChild: function(item) {
				return vm.list.indexOf(item) > -1
			},
			deleteItem: function(childName) {
				if (confirm('确定删除，不可恢复')) {
					for (var i in vm.list) {
						if (vm.list[i] === childName) {
							vm.list.splice(i, 1)
						}
					}
				} else {
					return
				}
			},
			//GRACE评分的计算
			computeGraceItem: function() {
				vm.info['pfxx'] = !vm.info['pfxx']
				var score = 0;
				if (vm.modalGraceInfo.cstAge) {
					var ageScore = 0;
					var age = vm.modalGraceInfo.cstAge;

					if (age < 30) {} else if (age <= 39) {
						ageScore = 8;
					} else if (age <= 49) {
						ageScore = 25;
					} else if (age <= 59) {
						ageScore = 41;
					} else if (age <= 69) {
						ageScore = 58;
					} else if (age <= 79) {
						ageScore = 75;
					} else if (age <= 89) {
						ageScore = 91;
					} else {
						ageScore = 100;
					}

					vm.modalGraceScore.ageScore = ageScore;
				}
				if (vm.modalGraceInfo.hrtRte) {
					var hrtScore = 0;
					var hrt = vm.modalGraceInfo.hrtRte;

					if (hrt < 50) {
						hrtScore = 0;
					} else if (hrt <= 69) {
						hrtScore = 3;
					} else if (hrt <= 89) {
						hrtScore = 9;
					} else if (hrt <= 109) {
						hrtScore = 15;
					} else if (hrt <= 149) {
						hrtScore = 24;
					} else if (hrt <= 199) {
						hrtScore = 38;
					} else {
						hrtScore = 46;
					}

					vm.modalGraceScore.hrtScore = hrtScore;
				}
				if (vm.modalGraceInfo.sbpupNbr) {
					var sbpScore = 0;
					var sbp = vm.modalGraceInfo.sbpupNbr;

					if (sbp < 80) {
						sbpScore = 58;
					} else if (sbp <= 99) {
						sbpScore = 53;
					} else if (sbp <= 119) {
						sbpScore = 43;
					} else if (sbp <= 139) {
						sbpScore = 34;
					} else if (sbp <= 159) {
						sbpScore = 24;
					} else if (sbp <= 199) {
						sbpScore = 10;
					} else {
						sbpScore = 0;
					}
					vm.modalGraceScore.sbpScore = sbpScore;
				}
				// var JGDB = vm.hspXtzlInf.XQJGSZ;
				var JGDB = vm.modalGraceInfo.jgdb;
				if (JGDB) {
					var creScore = 0;
					var cre = parseFloat((JGDB / 88.4).toFixed(2));

					if (cre >= 0 && cre <= 0.39) {
						creScore = 1;
					} else if (cre <= 0.79) {
						creScore = 4;
					} else if (cre <= 1.19) {
						creScore = 7;
					} else if (cre <= 1.59) {
						creScore = 10;
					} else if (cre <= 1.99) {
						creScore = 13;
					} else if (cre <= 3.99) {
						creScore = 21;
					} else {
						creScore = 28;
					}
					vm.modalGraceScore.creScore = creScore;
				}
				var killip = vm.modalGraceInfo.killip;
				if (killip) {
					if (killip == 1) {
						vm.modalGraceScore.killipScore = 0;
						vm.modalGraceInfo.killip2 = 'Ⅰ级';
					} else if (killip == 2) {
						vm.modalGraceScore.killipScore = 20;
						vm.modalGraceInfo.killip2 = 'Ⅱ级';
					} else if (killip == 3) {
						vm.modalGraceScore.killipScore = 39;
						vm.modalGraceInfo.killip2 = 'Ⅲ级';
					} else if (killip == 4) {
						vm.modalGraceScore.killipScore = 59;
						vm.modalGraceInfo.killip2 = 'Ⅳ级';
					}
				}
				//危险因素得分计算
				var temp = 0;
				var wxys = vm.modalGraceInfo.wxys;
				var _reasonArr = vm.arr_wxys;
				vm.modalGraceInfo.wxys2 = '';
				if (vm.modalGraceInfo.wxys) {
					for (var j = 0; j < _reasonArr.length; j++) {
						if (wxys.indexOf(_reasonArr[j].infocode) >= 0) {
							temp += _reasonArr[j].score;
						}
						if (wxys.indexOf(vm.WXYSArr[j].infocode) >= 0) {
							vm.modalGraceInfo.wxys2 += vm.WXYSArr[j].info;
							if (j >= 0 && j < _reasonArr.length - 1){
								vm.modalGraceInfo.wxys2 += ', ';
							}
						}
					}
				}
				vm.modalGraceScore.dangerScore = temp;
			},
		});
		var vn = new Vue({
		  el: '#block-group',
		  data: {
		    info: {		
		  				GMZY01: {},
		  				GMZY02: {},
		  				GMZY03: {},
		  				GMZY04: {},
		  				GMZY05: {},
		  				GMZY06: {},
		  				GMZY07: {},
		  				GMZY08: {},
		  				GMZY09: {},
		  				GMZY10: {},
		  				GMZY11: {},
		  				GMZY12: {},
		  				GMZY13: {},
		  				GMZY14: {},
		  				GMZY15: {},
		  				GMZY16: {},
		  				GMZY17: {},
		  				GMZY18: {},
		  				GMZY19: {},
		  				GMZY20: {},
		  				GMZY21: {},
		  				GMZY22: {},
		  				GMZY23: {},
		  				GMZY24: {},
		  				GMZY25: {},
		  				GMZY26: {},
		  				GMZY27: {},
		  			},
		  			GMZYArr: [{
		    	info: '右冠近段',
		    	infocode: 'GMZY01'
		    }, {
		    	info: '右冠中段',
		    	infocode: 'GMZY02'
		    }, {
		    	info: '右冠远段',
		    	infocode: 'GMZY03'
		    }, {
		    	info: '后降支(右优势型)',
		    	infocode: 'GMZY04'
		    }, {
		    	info: '左主干',
		    	infocode: 'GMZY05'
		    }, {
		    	info: '前降支近段',
		    	infocode: 'GMZY06'
		    }, {
		    	info: '前降支中段',
		    	infocode: 'GMZY07'
		    }, {
		    	info: '前降支远段',
		    	infocode: 'GMZY08'
		    }, {
		    	info: '第一对角支',
		    	infocode: 'GMZY09'
		    }, {
		    	info: '第二对角支',
		    	infocode: 'GMZY10'
		    }, {
		    	info: '旋支近段',
		    	infocode: 'GMZY11'
		    }, {
		    	info: '第一钝缘支',
		    	infocode: 'GMZY12'
		    }, {
		    	info: '旋支远段',
		    	infocode: 'GMZY13'
		    }, {
		    	info: '左室后支',
		    	infocode: 'GMZY14'
		    }, {
		    	info: '后降支(左优势型或均衡型)',
		    	infocode: 'GMZY15'
		    }, {
		    	info: '中间支',
		    	infocode: 'GMZY16'
		    }, {
		    	info: '第三对角支',
		    	infocode: 'GMZY17'
		    }, {
		    	info: '第二钝缘支',
		    	infocode: 'GMZY18'
		    }, {
		    	info: '第三钝缘支',
		    	infocode: 'GMZY19'
		    }, {
		    	info: '锐缘支',
		    	infocode: 'GMZY20'
		    }, {
		    	info: '左圆椎支',
		    	infocode: 'GMZY21'
		    }, {
		    	info: '右圆椎支',
		    	infocode: 'GMZY22'
		    }, {
		    	info: '室间隔支',
		    	infocode: 'GMZY23'
		    }, {
		    	info: '左后外侧支',
		    	infocode: 'GMZY24'
		    }, {
		    	info: '右后外侧支',
		    	infocode: 'GMZY25'
		    }, {
		    	info: '房室沟动脉',
		    	infocode: 'GMZY26'
		    }, {
		    	info: '后降支室间支',
		    	infocode: 'GMZY27'
		    }],
		  RADIOArr: [{
		  	info: '否',
		  	infocode: '0'
		  }, {
		  	info: '是',
		  	infocode: '1'
		  }], // 是否单选表
		   GMZYSel: [], //冠脉造影选中项
			XZCDArr: [], //狭窄程度
		    ZYSTIMIXLArr: [], //造影时TIMI血流
		    SZCLArr: [], //术中处理
		    SHTIMIXLArr: [], //术后TIMI血流
		    ZRZJGSArr: [], //植入支架个数
		    ZJZLArr: [], //支架种类
			GMZY01szcl: [], //术中处理选中项
			GMZY02szcl: [],
			GMZY03szcl: [],
			GMZY04szcl: [],
			GMZY05szcl: [],
			GMZY06szcl: [],
			GMZY07szcl: [],
			GMZY08szcl: [],
			GMZY09szcl: [],
			GMZY10szcl: [],
			GMZY11szcl: [],
			GMZY12szcl: [],
			GMZY13szcl: [],
			GMZY14szcl: [],
			GMZY15szcl: [],
			GMZY16szcl: [],
			GMZY17szcl: [],
			GMZY18szcl: [],
			GMZY19szcl: [],
			GMZY20szcl: [],
			GMZY21szcl: [],
			GMZY22szcl: [],
			GMZY23szcl: [],
			GMZY24szcl: [],
			GMZY25szcl: [],
			GMZY26szcl: [],
			GMZY27szcl: [],
		  },
		  methods: {
		    // 冠脉造影渲染多选项
		    isChecked2: function(prop, item) {
		    	var flag = false;
		    	for (var i = 0; i < this[prop + 'Sel'].length; i++) {
		    		var el = this[prop + 'Sel'][i];
		    		if (el.infocode == item.infocode) {
		    			flag = true;
		    			break;
		    		}
		    	}
		    	return flag;
		    },
			//术中处理渲染多选选项
			isChecked3: function(prop, code) {
				var flag = false;
				for (var i = 0; i < this[prop + 'szcl'].length; i++) {
					var el = this[prop + 'szcl'][i];
					if (el == code) {
						flag = true;
						break;
					}
				}
				return flag;
			},
			//术中处理点击事件
			onSelectClick2: function(prop, code) {
				var list = this[prop + 'szcl'];
				if (list.indexOf(code) > -1) {
					list.splice(list.indexOf(code), 1)
				} else if (code == '0') {
					list = [];
					list.push('0');
				} else {
					if (list[0] == '0') {
						list.splice(list.indexOf('0'), 1)
					}
					list.push(code)
				}
				this[prop + 'szcl'] = list;
				this.info[prop].hspCrivelInf.szcl = list.join(',');
				updateFzxg(this.info[prop]);
			},
			//冠脉造影部分的多选事件
			onCheckClick2: function(item) {
				var list = JSON.parse(JSON.stringify(this.GMZYSel));
				var hasItem = false;
				var index;
				for (var i = 0; i < list.length; i++) {
					var el = list[i];
					if (el.infocode == item.infocode) {
						hasItem = true;
						index = i;
						break;
					}
				}
				if (hasItem) {
					list.splice(index, 1);
					delFzxg(item.infocode);
					this.info[item.infocode].hspCrivelInf = JSON.parse(JSON.stringify({
						velSeq: '',
						emgSeq: '',
						xzcd: null,
						zystimixl: null,
						zjnxs: null,
						sffcbb: null,
						sfcto: null,
						ghbb: null,
						zfbb: null,
						pci: null,
						szcl: null,
						dstgsj: '',
						shtimixl: null,
						zrzjgs: null,
						zjzl: null
					}))
				} else {
					list.push(item)
					this.info[item.infocode].hspCrivelInf = JSON.parse(JSON.stringify({
						velSeq: '',
						emgSeq: '',
						xzcd: null,
						zystimixl: null,
						zjnxs: null,
						sffcbb: null,
						sfcto: null,
						ghbb: null,
						zfbb: null,
						pci: null,
						szcl: null,
						dstgsj: '',
						shtimixl: null,
						zrzjgs: null,
						zjzl: null
					}))
					addFzxg(item.infocode);
				}
				this.GMZYSel = JSON.parse(JSON.stringify(list));
				this.$forceUpdate();
				// this.GMZYSel = list;
			},
			// 冠脉造影部分单选事件
			pathDetailSel: function(prop, k, val) {
				// prop: item.infocode  k: xzcd   val: el.infocode  aaa: 上一级的 info[item.infocode].hspCrivelInf.xzcd
				var that = this
				this.info[prop].hspCrivelInf[k] = val;
				this.info[prop].hspCrivelInf = JSON.parse(JSON.stringify((that.info[prop].hspCrivelInf)))
				this.info[prop] = JSON.parse(JSON.stringify((that.info[prop])))
				this.$forceUpdate()
				updateFzxg(this.info[prop]);
			},
			WdatePicker2: function(prop, k){
				var that = this
				var timeVal = $('#tim'+prop).val()
				this.info[prop].hspCrivelInf[k] = timeVal;
				this.info[prop].hspCrivelInf = JSON.parse(JSON.stringify((that.info[prop].hspCrivelInf)))
				this.info[prop] = JSON.parse(JSON.stringify((that.info[prop])))
				this.$forceUpdate()
				updateFzxg(this.info[prop]);
			},
		  }
		})
		/* 监听省下拉选择框 */
		// vm.aidPatient.$watch('scePrvCod', function(newVal, oldVal, name) {
		vm.hspXtzlInf.$watch('FBDZ01', function(newVal, oldVal, name) {
			if (newVal == '') {
				vm.cityList = [];
			} else {
				if (newVal) {
					vm.cityList = [];
					vm.cityList = addrInfoList.cityMap[newVal];
				}
			}
			// vm.aidPatient.sceCtyCod = '';
			vm.hspXtzlInf.FBDZ02 = '';
		});
		/* 监听市下拉选择框 */
		// vm.aidPatient.$watch('sceCtyCod', function(newVal, oldVal, name) {
		vm.hspXtzlInf.$watch('FBDZ02', function(newVal, oldVal, name) {
			if (newVal == '') {
				vm.cntyList = [];
			} else {
				if (newVal) {
					vm.cntyList = [];
					vm.cntyList = addrInfoList.cntyMap[newVal];
				}
			}
			// vm.aidPatient.sceAr0Cod = '';
			vm.hspXtzlInf.FBDZ03 = '';
		});
		//保存
		var commit =  publicFun.debounce(function (){
			vm.count = 0
			parent.publicFun.ajaxLoading('保存中 请稍等。。。')
			commitBaseInfo();
			commitXtzlInfo();
			commitEcgInfo();
		},500)
		// function commit() {
		// 	return console.log(13)
		// 	var count = 0;
		// 	count += commitBaseInfo();
		// 	count += commitXtzlInfo();
		// 	count += commitEcgInfo();
		// 	if(count===3){
		// 		parent.publicFun.alert("保存成功");
		// 	}
		// }
		//提交基本信息
		function commitBaseInfo(){
			var dataSubmit = {};
			dataSubmit.hspDbzlBasCustom = vm.baseInfo;
			$.ajax({
				url: '${baseurl}cpc/xtPatietBasicInfSubmit.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify(dataSubmit),
				success: function(res) {
					if (res.resultInfo.success) {
						vm.count++
					}
				},
			});
		}

		//提交表单信息
		function commitXtzlInfo(){
			// console.log("@@@@@@@@@", vm.info);
			var list = [];
			for (var prop in vm.info) {
				if (vm.info.hasOwnProperty(prop)) {
					if (prop == 'GMZY01' || prop == 'GMZY02' || prop == 'GMZY03' || prop == 'GMZY04' || prop == 'GMZY05' || prop ==
							'GMZY06' || prop == 'GMZY07' || prop == 'GMZY08' || prop == 'GMZY09' || prop == 'GMZY10' || prop == 'GMZY11' ||
							prop == 'GMZY12' || prop == 'GMZY13' || prop == 'GMZY14' || prop == 'GMZY15' || prop == 'GMZY16' || prop ==
							'GMZY17' || prop == 'GMZY18' || prop == 'GMZY19' || prop == 'GMZY20' || prop == 'GMZY21' || prop == 'GMZY22' ||
							prop == 'GMZY23' || prop == 'GMZY24' || prop == 'GMZY25' || prop == 'GMZY26' || prop == 'GMZY27') {} else {
						list.push({
							proCode: prop,
							proVal: vm.info[prop]
						});
					}
				}
			}
			for (var prop in vm.hspXtzlInf) {
				if(vm.hspXtzlInf.hasOwnProperty(prop)) {
					if(prop == 'TIWEN' || prop == 'XQJGSZ' || prop == 'DEJTSZ' || prop == 'BNPSZ' || prop == 'NTPROBNPSZ' || prop == 'MYOSZ'
							|| prop == 'CKMBSZ' || prop == 'KNYWJL' || prop == 'SZKNYWJL' || prop == 'GNJCSZ' || prop == 'ARNIDCJL' || prop == 'PCSK9DCJL'
							|| prop == 'FEIY' || prop == 'CYDYKXXBYWDCJL' || prop == 'CYDYACEIDCJL' || prop == 'CYDYTZYWDCJL' || prop == 'CYDYSTZZJDCJL'){
						if(vm.hspXtzlInf[prop] != ''){
							vm.hspXtzlInf[prop] = parseFloat(vm.hspXtzlInf[prop])
						}
					}
					list.push({
						proCode: prop,
						proVal: vm.hspXtzlInf[prop]
					});
				}
			}
			$.ajax({
				url: '${baseurl}cpc/xtPatietSubmit.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					regSeq: _regSeq,
					emgSeq: _emgSeq,
					xtzlInfs: list,
				}),
				success: function(res) {
					parent.publicFun.ajaxLoadEnd()
					if (res.resultInfo.success) {
						vm.count++
					}
					if (vm.count === 3) {
						parent.publicFun.successalert("保存成功");
					}else {
						parent.publicFun.alert("保存失败");
					}
				},
			});
		}
		//提交心电图信息
		function commitEcgInfo(){
			var timestampFileDate = moment(vm.hspEcgInf.fileDate).valueOf();
			var timestampFileDiaDate = moment(vm.hspEcgInf.fileDiaDate).valueOf();
			$.ajax({
				url: '${baseurl}cpc/addOrUpdateEcgInf.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					fileDate: timestampFileDate,
					fileDiaDate: timestampFileDiaDate,
					ecgSeq: vm.hspEcgInf.ecgSeq,
					filePath: vm.hspEcgInf.filePath,
					refId: vm.hspEcgInf.refId,
				}),
				success: function(res) {
					if (res.resultInfo.success) {
						vm.count++
					}
				},
			});
		}
	
		
		// 字典
		function getDicts() {
			var maps = [{
				prop: 'cstSexCodArr',
				key: 'CST_SEX_COD'
			}, {
				prop: 'cardTypeArr',
				key: 'XT_CARD_COD'
			}, {
				prop: 'nationArr',
				key: 'XT_MZ_COD'
			}, {
				prop: 'emgJobArr',
				key: 'XT_ZY_COD'
			}, {
				prop: 'WHCDArr',
				key: 'XT_WHCD_COD'
			}, {
				prop: 'maritalStatusArr',
				// key: 'XT_HYZK_COD'
				key: 'MARITAL_STATUS'
			}, {
				prop: 'BQPGArr',
				key: 'XT_BQPG_COD'
			}, {
				prop: 'BQPGMXArr',
				key: 'XT_BQPGMX_COD'
			}, {
				prop: 'ddfsArr',
				key: 'XT_DDFS_COD'
			}, {
				prop: 'ccdwArr',
				key: 'XT_CCDW_COD'
			}, {
				prop: 'ZYLXArr',
				key: 'XT_ZYLX_COD'
			}, {
				prop: 'CBZDArr',
				key: 'XT_CBZD_COD'
			}, {
				prop: 'YWYYArr',
				key: 'XT_YWYY_COD'
			}, {
				prop: 'FACSXYXXTLXArr',
				key: 'XT_FACSXYXXTLX_COD'
			}, {
				prop: 'QTFXYXXTLXArr',
				key: 'XT_QTFXYXXTLX_COD'
			},{
				prop: 'ZGFACSXYXXTLXArr',
				key: 'XT_ZGFACSXYXXTLX_COD'
			}, {
				prop: 'ZGQTFXYXXTLXArr',
				key: 'XT_ZGQTFXYXXTLX_COD'
			}, {
				prop: 'XXGJBWXYSArr',
				key: 'XT_XXGJBWXYS_COD'
			}, {
				prop: 'HEBZArr',
				key: 'XT_HEBZ_COD'
			}, {
				prop: 'ZYQJBFZArr',
				key: 'XT_ZYQJBFZ_COD'
			}, {
				prop: 'LYXJArr',
				key: 'XT_LYXJ_COD'
			}, {
				prop: 'JGDB72DWArr',
				key: 'XT_JGDB72DW_COD'
			}, {
				prop: 'CSFSArr',
				key: 'XT_CSFS_COD'
			}, {
				prop: 'FBQJArr',
				key: 'AID_FBSJD_COD'
			}, {
				prop: 'YBLXArr',
				key: 'XT_YBLX_COD'
			}, {
				prop: 'WLYYArr',
				key: 'XT_WLYY_COD'
			}, {
				prop: 'senRctCodArr',
				key: 'XT_AVPU_COD'
			}, {
				prop: 'SZBFZArr',
				key: 'XT_SZBFZ_COD'
			}, {
				prop: 'RSYWArr',
				key: 'XT_RSYW_COD'
			}, {
				prop: 'RSYWJLArr',
				key: 'XT_RSYWJL_COD'
			}, {
				prop: 'KNYWArr',
				key: 'XT_KNYW_COD'
			}, {
				prop: 'WZGZCSYYArr',
				key: 'XT_WZGZCSYY_COD'
			}, {
				prop: 'KXXBYWArr',
				key: 'XT_KXXBYW_COD'
			}, {
				prop: 'TZYWArr',
				key: 'XT_TZYW_COD'
			}, {
				prop: 'STZZJArr',
				key: 'XT_STZZJ_COD'
			}, {
				prop: 'ACEIArr',
				key: 'XT_ACEI_COD'
			}, {
				prop: 'YYPCArr',
				key: 'XT_YYPC_COD'
			}, {
				prop: 'YYZQArr',
				key: 'XT_YYZQ_COD'
			}, {
				prop: 'YQRSSCArr',
				key: 'XT_RSSC_COD'
			}, {
				prop: 'YQRSCSArr',
				key: 'XT_YQRSCS_COD'
			}, {
				prop: 'DEJTDWArr',
				key: 'XT_DEJTDW_COD'
			}, {
				prop: 'MYODWArr',
				key: 'XT_MYODW_COD'
			}, {
				prop: 'CKMBDWArr',
				key: 'XT_CKMBDW_COD'
			}, {
				prop: 'ZGZRSCSArr',
				key: 'XT_ZGZRSCS_COD'
			}, {
				prop: 'ZCWXFCArr',
				key: 'XT_ZCWXFC_COD'
			}, {
				prop: 'QRXCLArr',
				key: 'XT_QRXCL_COD'
			}, {
				prop: 'KILLIPArr',
				key: 'XT_KILLIP_COD'
			}, {
				prop: 'QNYXArr',
				key: 'XT_QNYX_COD'
			}, {
				prop: 'GNJCArr',
				key: 'XT_GNJC_COD'
			}, {
				prop: 'JGDBXZArr',
				key: 'SJ_BLFS'
			}, {
				prop: 'JCLXArr',
				key: 'XT_JCLX_COD'
			}, {
				prop: 'GRACEJGWTJArr',
				key: 'XT_JGWTJ_COD'
			}, {
				prop: 'WXYSArr',
				key: 'XT_WXYS_COD'
			}, {
				// prop: 'GRACEWXFCArr',
				prop: 'WXFCArr',
				key: 'XT_WXFC_COD'
			}, {
				prop: 'ZYSTIMIXLArr',
				key: 'XT_TIMI_COD'
			}, {
				prop: 'CYZDArr',
				key: 'XT_CYZD_COD'
			}, {
				prop: 'ARNIQJArr',
				key: 'XT_ARNIQJ_COD'
			}, {
				prop: 'ARNIPCArr',
				key: 'XT_ARNI_COD'
			}, {
				prop: 'HZZGArr',
				key: 'XT_HZZG_COD'
			}, {
				prop: 'SWYYArr',
				key: 'XT_SWYY_COD'
			}, {
				prop: 'JTYWArr',
				key: 'XT_JTYW_COD'
			}, {
				prop: 'KFKYYWArr',
				key: 'XT_KFKYYW_COD'
			}, {
				prop: 'PCSK9Arr',
				key: 'XT_PCSK9_COD'
			}, {
				prop: 'ZLJGArr',
				key: 'XT_ZLJG_COD'
			}, {
				prop: 'XYZTArr',
				key: 'XT_XYZT_COD'
			}, {
				prop: 'CLCLArr',
				key: 'XT_CLCL_COD'
			}, {
				prop: 'NXGJBMSArr',
				key: 'XT_NXGJBMS_COD'
			}, {
				prop: 'SHTIMIXLArr',
				key: 'XT_TIMI_COD'
			}, {
				prop: 'ZJZLArr',
				key: 'XT_ZJLX_COD'
			}, {
				prop: 'ZRZJGSArr',
				key: 'XT_ZJGS_COD'
			}, {
				prop: 'SZCLArr',
				key: 'XT_SZCL_COD'
			}, {
				prop: 'XZCDArr',
				key: 'XT_XZCD_COD'
			}, {
				prop: 'YXXJCArr',
				key: 'XT_YXXJC_COD'
			}, {
				prop: 'XFCDFXArr',
				key: 'XT_XFCDFX_COD'
			}, {
				prop: 'COVID19Arr',
				key: 'XT_COVID19_COD'
			}, {
				prop: 'ZLCLArr',
				key: 'XT_ZLCL_COD'
			}, {
				prop: 'RULUArr',
				key: 'XT_RULU_COD'
			}, {
				prop: 'ZGNYHAArr',
				key: 'XT_NYHA_COD'
			}, ];
			maps.forEach(function(el) {
				if(el.prop == 'XZCDArr'||el.prop == 'ZYSTIMIXLArr'||el.prop == 'SZCLArr'||el.prop == 'SHTIMIXLArr'||el.prop == 'ZRZJGSArr'||el.prop == 'ZJZLArr'){
					vn[el.prop] = publicFun.getDict(el.key) || [];
				}else{
					vm[el.prop] = publicFun.getDict(el.key) || [];
					if(el.prop == 'HEBZArr'){
						vm.HEBZArrExceptMXXNSJ = vm.HEBZArr;
						var position = 0;
						for(var i = 0; i < vm.HEBZArr.length; i++){
							if(vm.HEBZArr[i].info == "慢性心力衰竭"){
								position = i;
							}
						}
						vm.HEBZArrExceptMXXNSJ.splice(position,1);
					}
				}
			})
		}
		// 计算时间差
		function timeDiffer(val) {
			var days = Math.floor(val / (24 * 3600 * 1000));
			var leave1 = val % (24 * 3600 * 1000);
			var hours = days * 24 + Math.floor(leave1 / (3600 * 1000));
			var leave2 = leave1 % (3600 * 1000);
			var minutes = Math.floor(leave2 / (60 * 1000));
			var leave3 = leave2 % (60 * 1000)
			var seconds = Math.round(leave3 / 1000)
			if (hours == 0) {
				var hour = '';
			} else {
				var hour = hours + '小时';
			}
			if (minutes == 0) {
				var minute = '';
			} else {
				var minute = minutes + '分钟';
			}
			if (seconds == 0) {
				var second = '';
			} else {
				var second = seconds + '秒';
			}
			return hour + minute + second;
		}
		// 获取时间轴数据
		function getTimeLineData() {
			$.ajax({
				url: '${baseurl}cpc/xtTimeLine.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _regSeq,
				}),
				success: function(res) {
					try {
						var _timeList = res.resultInfo.sysdata.list;
						var pointObj = {};
						(function(_timeList) {
							if (_timeList && _timeList.length) {
								for (var m in _timeList) {
									if (_timeList[m].proCode == 'CBZDSJ') {
										for (var n in _timeList) {
											if (_timeList[n].proCode == 'JZZDSJ') {
												_timeList.splice(n, 1)
												return false
											}
										}
									}
								}
							}
						})(_timeList)
						if (_timeList && _timeList.length) {
							for (var j = 0; j < _timeList.length; j++) {
								var el = _timeList[j];
								var points = ['SCYLJCSJ', 'FBSJ', 'DGSJHSJ', 'QDDGSSJ', 'POCTSJ', 'CXSJ'];
								if (points.indexOf(el.proCode) > -1) {
									pointObj[el.proCode] = new Date(el.proVal).getTime();
								}
							}
							for (var i = 0; i < _timeList.length; i++) {
								var el = _timeList[i];
								if (el.proVal) {
									if (el.proCode == 'SCYLJCSJ' && pointObj.SCYLJCSJ && pointObj.FBSJ) {
										var timediff = pointObj.SCYLJCSJ - pointObj.FBSJ;
										el.diff = timeDiffer(timediff);
										if (timediff > 7200000) {
											el.diffred = 'S2FMC：' + el.diff
										} else {
											el.diffblue = 'S2FMC：' + el.diff
										}
									} else if (el.proCode == 'DGSJHSJ' && pointObj.DGSJHSJ && pointObj.QDDGSSJ) {
										var timediff = pointObj.DGSJHSJ - pointObj.QDDGSSJ;
										el.diff = timeDiffer(timediff);
										if (timediff > 1800000) {
											el.diffred = '激活时间：' + el.diff
										} else {
											el.diffblue = '激活时间：' + el.diff
										}
									} else if (el.proCode == 'POCTSJ' && pointObj.POCTSJ && pointObj.CXSJ) {
										var timediff = pointObj.POCTSJ - pointObj.CXSJ;
										el.diff = timeDiffer(timediff);
										if (timediff > 1200000) {
											el.diffred = '肌钙蛋白报告：' + el.diff
										} else {
											el.diffblue = '肌钙蛋白报告：' + el.diff
										}
									}
								}
							}
							vm.timeList = _timeList;
						}
					} catch (e) {
						console.log("----------------------error", e)
					}

				}
			})
		}
		// 冠脉造影新增接口
		function addFzxg(item) {
			$.ajax({
				url: '${baseurl}cpc/addFzxg.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgNo: _emgSeq,
					proCode: item,
				}),
				success: function(res) {
					vn.info[item].hspCrivelInf.velSeq = res.resultInfo.sysdata.velSeq;
					vn.$forceUpdate()
				}
			})
		}
		// 冠脉造影删除接口 
		function delFzxg(item) {
			$.ajax({
				url: '${baseurl}cpc/delFzxg.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgNo: _emgSeq,
					proCode: item,
					proVal: vn.info[item].hspCrivelInf.velSeq
				}),
				success: function(res) {}
			})
		}
		// 冠脉造影修改接口
		function updateFzxg(item) {
			item.hspCrivelInf.emgSeq = _emgSeq;
			$.ajax({
				url: '${baseurl}cpc/updateHspCrivelInf.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify(item.hspCrivelInf),
				success: function(res) {
					vm.hspXtzlInf.D2WSJ = res.resultInfo.sysdata.d2wsj;
				}
			})
		}
		// 点击tab页请求接口
		function getXtInfoByBusStep(busStep) {
			$.ajax({
				url: '${baseurl}cpc/getXtPatient.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _regSeq,
					xtzlInfs: [{
						busStep: busStep
					}]
				}),
				success: function(res) {
					var _list = res.resultInfo.sysdata.list;
					var resObj = {};
					if (_list && _list.length) {
						for (var i = 0; i < _list.length; i++) {
							var el = _list[i];
							if (_list[i].proType == 'checkbox') {
								if (_list[i].hspCrivelInf != null) {
									var obj = {
										info: el.proName,
										infocode: el.proCode
									};
									vn['GMZYSel'].push(obj);
									vn.info[el.proCode] = el; // el.hspCrivelInf;
									vn[el.proCode + 'szcl'] = el.hspCrivelInf.szcl ? el.hspCrivelInf.szcl.split(',') : [];
								} else {
									vm[el.proCode + 'Sel'] = el.proVal ? el.proVal.split(',') : [];
									resObj[el.proCode] = el.proVal;
								}
							} else {
								resObj[el.proCode] = el.proVal;
							}
						}
					}
					for (var key in resObj) {
						vm.info[key] = resObj[key];
					}
					if (vm.info.CBZDSJ == '' && vm.info.JZZDSJ) {
						vm.info.CBZDSJ = vm.info.JZZDSJ;
					}
				}
			});
			if (busStep == 'cpctreat') {
				getXtInspection();
				getConsulationInf();
				getHspGrace();
				// getPatientInfo();
				getXtEcg();
			}
		}
		// 基础信息接口
		function getXtbaseInfo(busStep) {
			$.ajax({
				url: '${baseurl}cpc/getXtPatientDetail.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _emgSeq,
					wayTyp: _wayTyp,
					regSeq: _regSeq
				}),
				success: function(res) {
					// var _hspEmgInf = res.resultInfo.sysdata.hspEmgInf
					var _hspEmgInf = res.resultInfo.sysdata.hspDbzlBasCustom
					console.log(_hspEmgInf);
					for (var a in vm.baseInfo) {
						if (_hspEmgInf && _hspEmgInf.hasOwnProperty(a) && _hspEmgInf[a]) {
							vm.baseInfo[a] = _hspEmgInf[a];
						}
					}
					// if (vm.baseInfo.sbpDownNbr && vm.baseInfo.sbpUpNbr) {
					// 	vm.info.XUEYA = vm.baseInfo.sbpUpNbr + '/' + vm.baseInfo.sbpDownNbr;
					// }
					if (vm.baseInfo.emgDat) {
						var time = vm.baseInfo.emgDat;
						vm.baseInfo.emgDat = moment(parseInt(time)).format('YYYY-MM-DD HH:mm')
					}
					if (vm.baseInfo.bthDat) {
						var bthDat = vm.baseInfo.bthDat;
						vm.baseInfo.bthDat = moment(parseInt(bthDat)).format('YYYY-MM-DD')
					}
					if (vm.baseInfo.cardType == null) {
						vm.baseInfo.cardType = '1'
					}
				}
			});
		}
		// 检验检查
		function getXtInspection() {
			$.ajax({
				url: '${baseurl}cpc/getJyjcInfo.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _emgSeq,
					wayTyp: _wayTyp
				}),
				success: function(res) {
					var _jyjgList = res.resultInfo.sysdata.jyjgList;
					if (_jyjgList && _jyjgList.length) {
						for (var i = 0; i < _jyjgList.length; i++) {
							var el = _jyjgList[i];
							if (_jyjgList[i].examinaim == '急诊心脏五联（POCT）') {
								var obj = el;
								vm.info.ISJGDB = '1';
								vm.info.SCJGDB = '2';
								var data = obj.data;
								if (data && data.length) {
									for (var j = 0; j < data.length; j++) {
										var num = data[j];
										if (data[j].reportItemName == '肌钙蛋白I') {
											vm.info.JGDBSZ = num.result;
											if (num.errorFlag == null) {
												vm.info.JGDBXZ = '0';
											} else {
												vm.info.JGDBXZ = '1';
											}
											break;
										}
									}
								}
								break;
							}
						}
					}
					var _list = res.resultInfo.sysdata.jyjgList || [];
					if (_list && _list.length) {
						_list.forEach(function(el) {
							if (el.resultDateTime) {
								el.resultDateTime = moment(el.resultDateTime).format('YYYY-MM-DD HH:mm:ss')
							}
						});
						vm.jylist = _list;
						vm.currItem = _list[0];
					}
					var _jclist = res.resultInfo.sysdata.jcjgList || [];
					if (_jclist && _jclist.length) {
						_jclist.forEach(function(el) {
							if (el.shrq) {
								el.shrq = moment(el.shrq).format('YYYY-MM-DD HH:mm:ss');
							}
							el.show = false;
						});
						vm.jclist = _jclist;
						// console.log(vm.list);
						// vm.currItem = _list[0];
					}
				}
			});
		}
		// 心电图
		function getXtEcg() {
			$.ajax({
				url: '${baseurl}cpc/getECGInfo.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _emgSeq
				}),
				success: function(res) {
					var _hspEcgInf = res.resultInfo.sysdata.hspEcgInf;
					if (_hspEcgInf) {
						vm.hspXtzlInf.XINDT = 1;
						for (var a in vm.hspEcgInf) {
							if (_hspEcgInf.hasOwnProperty(a)) {
								if(a === 'fileDate' || a === 'fileDiaDate'){
									vm.hspEcgInf[a] = moment(_hspEcgInf[a]).format('YYYY-MM-DD HH:mm');
								}else{
									vm.hspEcgInf[a] = _hspEcgInf[a];
								}
							}
						}
					}
				}
			});
		}
		// grace评分
		function getHspGrace() {
			$.ajax({
				url: '${baseurl}cpc/getHspGraceInf.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _emgSeq,
					graceType: 0
				}),
				success: function(res) {
					var _hspGraceInf = res.resultInfo.sysdata.hspGraceInf;
					if (_hspGraceInf) {
						if (_hspGraceInf.wxys) {
							vm.hspXtzlInf.WXYS = _hspGraceInf.wxys;
							vm.WXYSSel = _hspGraceInf.wxys ? _hspGraceInf.wxys.split(',') : [];
						}
						if (_hspGraceInf.gracejgwtj) {
							vm.hspXtzlInf.GRACEJGWTJ = _hspGraceInf.gracejgwtj;
							vm.GRACEJGWTJSel = _hspGraceInf.gracejgwtj ? _hspGraceInf.gracejgwtj.split(',') : [];
						}
						var total = _hspGraceInf.total;
						vm.modalGraceScore.total = total;
						vm.hspXtzlInf.GRACEFZ = total;
						if (vm.GRACEJGWTJSel.length != 0) {
							vm.hspXtzlInf.GRACEWXFC = 1;
						} else {
							if (total > 140) {
								vm.hspXtzlInf.GRACEWXFC = 2;
							} else if (109 <= total && total <= 140) {
								vm.hspXtzlInf.GRACEWXFC = 3;
							} else if (109 > total) {
								vm.hspXtzlInf.GRACEWXFC = 4;
							}
						}
					}
					for (var a in vm.modalGraceInfo) {
						if (_hspGraceInf && _hspGraceInf.hasOwnProperty(a)) {
							vm.modalGraceInfo[a] = _hspGraceInf[a];
						}
					}
				}
			});
		}
		//院前信息
		<%--function getPatientInfo() {--%>
		<%--	$.ajax({--%>
		<%--		url: '${baseurl}cpc/getAidPatientByEmgSeq.do',--%>
		<%--		type: 'post',--%>
		<%--		dataType: 'json',--%>
		<%--		contentType: 'application/json;charset=UTF-8',--%>
		<%--		data: JSON.stringify({--%>
		<%--			emgSeq: _emgSeq,--%>
		<%--			wayTyp: _wayTyp--%>
		<%--		}),--%>
		<%--		success: function(res) {--%>
		<%--			var _aidPatientXt = res.resultInfo.sysdata.aidPatientXt;--%>
		<%--			var _aidPatient = res.resultInfo.sysdata.aidPatient;--%>
		<%--			var _ynfb = res.resultInfo.sysdata.ynfb;--%>
		<%--			if (_aidPatient) {--%>
		<%--				for (var a in vm.aidPatient) {--%>
		<%--					if (_aidPatient.hasOwnProperty(a)) {--%>
		<%--						vm.aidPatient[a] = _aidPatient[a];--%>
		<%--					}--%>
		<%--				}--%>
		<%--			}--%>
		<%--			if (_aidPatientXt) {--%>
		<%--				for (var a in vm.aidPatientXt) {--%>
		<%--					if (_aidPatientXt.hasOwnProperty(a)) {--%>
		<%--						vm.aidPatientXt[a] = _aidPatientXt[a];--%>
		<%--						if (a == 'ddfs' && _aidPatientXt[a] == 1) {--%>
		<%--							vm.aidPatientXt.ccdw = 1;--%>
		<%--						}--%>
		<%--					}--%>
		<%--				}--%>
		<%--			}--%>
		<%--			if (_ynfb) {--%>
		<%--				for (var a in vm.ynfb) {--%>
		<%--					if (_ynfb.hasOwnProperty(a)) {--%>
		<%--						vm.ynfb[a] = _ynfb[a];--%>
		<%--					}--%>
		<%--				}--%>
		<%--			}--%>
		<%--			if (vm.ynfb['illTim']) {--%>
		<%--				var time = moment(vm.ynfb['illTim']).format('YYYY/MM/DD HH:mm')--%>
		<%--				vm.aidPatient['illTim'] = time;--%>
		<%--			}--%>
		<%--			if (vm.ynfb['fstTim']) {--%>
		<%--				vm.ynfb['fstTim'] = moment(vm.ynfb['fstTim']).format('YYYY/MM/DD HH:mm');--%>
		<%--			}--%>
		<%--			if (vm.ynfb['lveTim']) {--%>
		<%--				vm.ynfb['lveTim'] = moment(vm.ynfb['lveTim']).format('YYYY/MM/DD HH:mm');--%>
		<%--			}--%>
		<%--			if (vm.aidPatient['illTim'] && vm.aidPatient['illTimFlg'] == 1) {--%>
		<%--				var timer = vm.aidPatient['illTim'];--%>
		<%--				var newTimer = moment(new Date(timer)).format('YYYY/MM/DD');--%>
		<%--				vm.aidPatient['illTim'] = newTimer;--%>
		<%--			}--%>
		<%--			if (_wayTyp == 2) {--%>
		<%--				vm.aidPatientXt.ddfs = 4;--%>
		<%--			}--%>
		<%--			if (_wayTyp == 1) {--%>
		<%--				vm.aidPatientXt.ddfs = 2;--%>
		<%--			}--%>
		<%--		}--%>
		<%--	});--%>
		<%--}--%>
		//心内科会诊
		function getConsulationInf() {
			$.ajax({
				url: 'consultation/getConsulationInf.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _emgSeq
				}),
				success: function(res) {
					var consulationDate = res.resultInfo.sysdata.consulationDate;
					var invitationDate = res.resultInfo.sysdata.invitationDate;
					if (invitationDate) {
						vm.info.xnkhz = 1;
						vm.info.hzlx = 0;
						vm.info.consulationDate = moment(consulationDate).format("YYYY-MM-DD HH:mm");
						vm.info.invitationDate = moment(invitationDate).format("YYYY-MM-DD HH:mm");
					}
				}
			});
		}

		//获取HspXtzlInf的信息
		function queryHspXtzlInfByEmgSeq() {
			$.ajax({
				url: 'cpc/queryHspXtzlInfByEmgSeq.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _regSeq
				}),
				success: function (res) {
					var tempJson = res.resultInfo.sysdata.hspXtzlInf;
					if (tempJson) {
						for (var a in vm.hspXtzlInf) {
							if (tempJson.hasOwnProperty(a)) {
								vm.hspXtzlInf[a] = tempJson[a];
							}
						}
					}
					console.log('hspXtzlInf', vm.hspXtzlInf);
				}
			})
		}
		
		$(function() {
			var obj = {
				velSeq: '',
				emgSeq: '',
				xzcd: null,
				zystimixl: null,
				zjnxs: null,
				sffcbb: null,
				sfcto: null,
				ghbb: null,
				zfbb: null,
				pci: null,
				szcl: null,
				dstgsj: '',
				shtimixl: null,
				zrzjgs: null,
				zjzl: null
			}
			for (var prop in vn.info) {
				if (/^GMZY.*/.test(prop) && prop != 'GMZY') {
					vn.info[prop].hspCrivelInf = obj;
				}
			}
			getDicts();
			getTimeLineData();
			getXtbaseInfo();
			// getPatientInfo();
			queryHspXtzlInfByEmgSeq();
			$.ajax({
				url: '${baseurl}cpc/getXtPatient.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq: _regSeq,
					xtzlInfs: [{
						busStep: 'baseinfo'
					}, {
						busStep: 'firstaidinfo'
					}]
				}),
				success: function(res) {
					var _list = res.resultInfo.sysdata.list;
					var resObj = {};
					if (_list && _list.length) {
						for (var i = 0; i < _list.length; i++) {
							var el = _list[i];
							if (_list[i].proType == 'checkbox') {
								vm[el.proCode + 'Sel'] = el.proVal ? el.proVal.split(',') : [];
							}
							resObj[el.proCode] = el.proVal;
						}
					}
					for (var key in resObj) {
						vm.info[key] = resObj[key];
					}
					// $.each(resObj, function (k, v) {
					//  if(k==='scePrvCod'||k==='sceCtyCod'||k==='sceAr0Cod'){
					//  }else{
					//   vm.info[k] = v;
					//  }
					// })
					// vm.info = Object.assign(vm.info,resObj);
				}
			});
		})
	</script>

</html>
