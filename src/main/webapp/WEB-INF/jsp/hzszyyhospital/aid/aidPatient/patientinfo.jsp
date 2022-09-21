<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title>群体事件绑定管理---登记页面</title>
		<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
		<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
		<link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
		<link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
		<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/precheck/massEvent.css?124">
		<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
		<script src="${baseurl}lib/moment.min.js" type="text/javascript" charset="UTF-8"></script>
		<script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
		<script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
		<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
		<style type="text/css">
			.dyBox{
				width:70px;
				margin-bottom:2px;
			}
			.dyBox:nth-of-type(1){
				width:200px;
			}
			.dyBox:nth-of-type(2){
				width:160px;
			}
			.ywBox{
				width:96px;
			}
		</style>
	</head>

	<body class="massEventBox patientInfo">
		<div>
			<input class="hidden" name="" value="">
			<form ms-controller="massEventBdy" class="form massForm">
				<table>
					<tbody>
						<tr>
							<th style="color:#0d9206;font-weight:800;"><i class="red">*</i> 到院方式：</th>
							<td colspan="3">
								<div class="onRadio floatLeft dyBox" ms-repeat="ddfsArr"
								            ms-class="{{aidPatientXt.ddfs==el.infocode ? 'activeBox':''}}"
											ms-click="onRadioClick1(el.infocode,'ddfs')"
								>{{el.info}}</div>
							</td>
						</tr>
						<tr>
							<th style="color:#0d9206;font-weight:800;"  ms-if="aidPatientXt.ddfs==1"><i class="red">*</i> 呼救120时间：</th>
							<td ms-if="aidPatientXt.ddfs==1">
								<input class="Wdate spcWdate" type="text" name="aidPatientCustom.almtime" ms-duplex-string="aidPatient.almtime"
								 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientCustom.almtime}">
							</td>
							<th style="color:#0d9206;font-weight:800;"><i class="red">*</i> 首次医疗接触时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.scyljc" ms-duplex-string="aidPatientXt.scyljc"
								 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientXtCustom.scyljc}" onblur="ddyydmsjCha()">
							</td>
							<th style="color:#0d9206;font-weight:800;" ms-if="aidPatientXt.ddfs==2"><i class="red">*</i> 网络医院：</th>
							<td ms-if="aidPatientXt.ddfs==2">
								<select ms-duplex-string="aidPatientXt.wlyy" style="width:160px">
									<option ms-repeat="WLYYArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</td>
						</tr>
						<tr>
							<th style="color:#0d9206;font-weight:800;"><i class="red">*</i> 发病时间：</th>
							<td colspan="3">
								<div style="float:left;margin-right:10px" ms-if="aidPatient.illTimFlg!=1">
									<input class="Wdate spcWdate" type="text" name="aidPatientCustom.illTim" ms-duplex="aidPatient.illTim" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"
									 autocomplete="off" value="${aidPatientCustom.illTim}">
									<input ms-keyup="_onlyNum('fbsjdstr')" type="text" id="fbsjdstr" onblur="fbsjCha();" ms-duplex="aidPatientXt.fbsjdstr"
									 autocomplete="off" style="width:50px;">
									分钟前发病
								</div>
								<div style="float:left;margin-right:10px" ms-if="aidPatient.illTimFlg==1">
									<input class="Wdate spcWdate" type="text" name="aidPatientCustom.illTim" ms-duplex="aidPatient.illTim" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})"
									 autocomplete="off" value="${aidPatientCustom.illTim}">
								</div>
								<div class="onRadio floatLeft" style="width:180px;"
								            ms-class="{{aidPatient.illTimFlg==1 ? 'activeBox':''}}"
											ms-click="onToggleClick()"
								>发病时间无法精确到分钟</div>
							</td>
						</tr>
						<tr ms-if="aidPatient.illTimFlg==1">
							<th>发病时间段：</th>
							<td colspan="3">
								<select ms-duplex-string="aidPatient.illperd" name="aidPatientCustom.illperd" style="width:160px">
									<option ms-repeat="FBSJDArr" ms-attr-value="el.infocode">{{el.info}}</option>
								</select>
							</td>
						</tr>
						<tr>
							<th>发病地址：</th>
							<td colspan="3">
								<select name="aidPatientCustom.scePrvCod" ms-duplex="aidPatient.scePrvCod" style="width:160px">
								    <option value="">请选择</option>
									<option ms-repeat="provinceList" ms-attr-value="el.addrCode">{{el.addrName}}</option>
								</select>
								<select name="aidPatientCustom.sceCtyCod" ms-duplex="aidPatient.sceCtyCod" style="width:160px">
								    <option value="">请选择</option>
									<option ms-repeat="cityList" ms-attr-value="el.addrCode">{{el.addrName}}</option>
								</select>
								<select name="aidPatientCustom.sceAr0Cod" ms-duplex="aidPatient.sceAr0Cod" style="width:160px">
								    <option value="">请选择</option>
									<option ms-repeat="cntyList" ms-attr-value="el.addrCode">{{el.addrName}}</option>
								</select>
								<!-- <input type="text" maxlength="10" name="aidPatientCustom.scePrvCod" ms-duplex-string="aidPatient.scePrvCod" id="province"
								 autocomplete="off" value="${aidPatientCustom.scePrvCod}">
								<span class="floatLeft">省</span>
								<input type="text" maxlength="10" name="aidPatientCustom.sceCtyCod" ms-duplex-string="aidPatient.sceCtyCod" id="county"
								 autocomplete="off" value="${aidPatientCustom.sceCtyCod}">
								<span class="floatLeft">县/市</span>
								<input type="text" maxlength="10" name="aidPatientCustom.sceAr0Cod" ms-duplex-string="aidPatient.sceAr0Cod" id="district"
								 autocomplete="off" value="${aidPatientCustom.sceAr0Cod}">
								<span class="floatLeft">区/乡/街道</span> -->
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==3">
							<th>到达医院大门时间：</th>
							<td colspan="3">
							    <input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.ddyydmsj" ms-duplex-string="aidPatientXt.ddyydmsj"
									 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientXtCustom.ddyydmsj}"  disabled="disabled">
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==2">
							<th>网络医院入院时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.wlyyry" ms-duplex-string="aidPatientXt.wlyyry"
								 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientXtCustom.wlyyry}" />
							</td>
							<th>转诊出门时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.zzcm" ms-duplex-string="aidPatientXt.zzcm" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"
								 autocomplete="off" value="${aidPatientXtCustom.zzcm}" />
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs!=3">
							<th>院前首份心电图时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.sfxdt" ms-duplex-string="aidPatientXt.sfxdt" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"
								 autocomplete="off" value="${aidPatientXtCustom.sdxdt}" />
							</td>
							<th>确诊时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.sfxdtqz" ms-duplex-string="aidPatientXt.sfxdtqz"
								 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientXtCustom.sdxdtqz}" />
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs!=3">
							<th>远程传输心电图：</th>
							<td colspan="3">
								<div class="floatLeft" style="width:100%;margin-bottom:2px;">
									<div class="onRadio floatLeft" ms-repeat="RADIOArr"
									            ms-class="{{aidPatientXt.ycxdtcs==el.infocode ? 'activeBox':''}}"
												ms-click="onRadioClick1(el.infocode,'ycxdtcs')"
									>{{el.info}}</div>
								</div>
								<div class="floatLeft" ms-if="aidPatientXt.ycxdtcs=='1'" style="width:100%;">
									<span class="floatLeft">传输时间：</span>
									<input id="scsj" class="Wdate spcWdate" type="text" name="aidPatientXtCustom.cssj" ms-duplex-string="aidPatientXt.cssj"
									 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientXtCustom.cssj}" />
									<span class="floatLeft">方式：</span>
									<div class="onRadio floatLeft box" ms-repeat="csfswxArr"
									            ms-class="{{aidPatientXt.csfs==el.infocode ? 'activeBox':''}}"
												ms-click="onRadioClick1(el.infocode,'csfs')"
									>{{el.info}}</div>
								</div>
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs!=3">
							<th>诊断：</th>
							<td colspan="3">
								<div class="onRadio floatLeft zdbox" ms-repeat="zdArr"
								            ms-class="{{aidPatientXt.zd==el.infocode ? 'activeBox':''}}"
											ms-click="onRadioClick1(el.infocode,'zd')"
								>{{el.info}}</div>
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs!=3">
							<th>双联抗血小板药物给药：</th>
							<td colspan="3">
								<p class="floatLeft" >
									<div class="onRadio floatLeft" ms-repeat="RADIOArr"
									            ms-class="{{aidPatientXt.kxxbgy==el.infocode ? 'activeBox':''}}"
												ms-click="onRadioClick1(el.infocode,'kxxbgy')"
									>{{el.info}}</div>
								</P>
								<div ms-if="aidPatientXt.kxxbgy=='1'">
									<br/>
									<span class="floatLeft">给药时间：</span>
									<input id="gysj" class="Wdate spcWdate" type="text" name="aidPatientXtCustom.gysj" ms-duplex-string="aidPatientXt.gysj"
									 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})" autocomplete="off" value="${aidPatientXtCustom.gysj}" />
									<div style="float:left;margin-left:3px">
										<span class="floatLeft">药物名称：</span>
										<select name="" ms-duplex="aidPatientXt.kxxbyw" autocomplete="off">
											<option ms-repeat="kxxbywArr" ms-attr-value="el.infocode">{{el.info}}</option>
										</select>
									</div>
								</div>
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==2">
							<th>院前溶栓筛查：</th>
							<td>
								<div class="onRadio floatLeft" ms-repeat="yqrsscArr"
									            ms-class="{{aidPatientXt.yqrssc==el.infocode ? 'activeBox':''}}"
												ms-click="onRadioClick1(el.infocode,'yqrssc')"
									>{{el.info}}</div>
							</td>
							<th>是否实施院前溶栓：</th>
							<td>
								<div class="onRadio floatLeft" ms-repeat="RADIOArr"
									            ms-class="{{aidPatientXt.yqrs==el.infocode ? 'activeBox':''}}"
												ms-click="onRadioClick1(el.infocode,'yqrs')"
									>{{el.info}}</div>
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1">
							<th>溶栓场所：</th>
							<td colspan="3">
								<div class="onRadio floatLeft box" ms-repeat="rscsArr"
								            ms-class="{{aidPatientXt.rscs==el.infocode ? 'activeBox':''}}"
											ms-click="onRadioClick1(el.infocode,'rscs')"
								>{{el.info}}</div>
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1">
							<th>院前溶栓知情同意书开始时间：</th>
							<td>
								  <input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.zqtyks" ms-duplex-string="aidPatientXt.zqtyks"
								   onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',position:{left:0,top:10}})" autocomplete="off" value="${aidPatientXtCustom.zqtyks}" />
							</td>
							<th>签署知情同意书时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.qszqty" ms-duplex-string="aidPatientXt.qszqty"
								 onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',position:{left:0,top:10}})" autocomplete="off" value="${aidPatientXtCustom.qszqty}" />
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1">
							<th>院前溶栓开始时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.rsks" ms-duplex-string="aidPatientXt.rsks" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',position:{left:0,top:110}})"
								 autocomplete="off" value="${aidPatientXtCustom.rsks}" />
							</td>
							<th>院前溶栓结束时间：</th>
							<td>
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.rsjs" ms-duplex-string="aidPatientXt.rsjs" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',position:{left:0,top:110}})"
								 autocomplete="off" value="${aidPatientXtCustom.rsjs}" />
							</td>
						</tr>
						<tr ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1">
							<th>院前溶栓药物：</th>
							<td>
								<div class="onRadio floatLeft ywBox" ms-repeat="rsywArr"
								            ms-class="{{aidPatientXt.rsyw==el.infocode ? 'activeBox':''}}"
											ms-click="onRadioClick1(el.infocode,'rsyw')"
								>{{el.info}}</div>
							</td>
							<th>院前溶栓药物剂量：</th>
							<td>
								<div class="onRadio floatLeft box" ms-repeat="rsywjlArr"
								            ms-class="{{aidPatientXt.rsywjl==el.infocode ? 'activeBox':''}}"
											ms-click="onRadioClick1(el.infocode,'rsywjl')"
								>{{el.info}}</div>
							</td>
						</tr>
						<tr>
							<th ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1">溶栓再通：</th>
							<td ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1">
								<div class="onRadio floatLeft" ms-repeat="RADIOArr"
									            ms-class="{{aidPatientXt.rszt==el.infocode ? 'activeBox':''}}"
												ms-click="onRadioClick1(el.infocode,'rszt')"
									>{{el.info}}</div>
							</td>
							<th ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1 && aidPatientXt.rszt == 1">溶栓后造影时间：</th>
							<td ms-if="aidPatientXt.ddfs==2 && aidPatientXt.yqrs == 1 && aidPatientXt.rszt == 1">
								<input class="Wdate spcWdate" type="text" name="aidPatientXtCustom.rshzy" ms-duplex-string="aidPatientXt.rshzy" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',position:{left:0,top:120}})"
								 autocomplete="off" value="${aidPatientXtCustom.rshzy}" />
						    </td>
						</tr>
						<tr>
							<th>运转至CPC：</th>
							<td colspan="3">
								<div class="onRadio floatLeft box"
								            ms-class="{{aidPatientXt.zycs==1 ? 'activeBox':''}}"
											ms-click="onRadioClick1('1','zycs')"
								>导管室</div>
								<div class="onRadio floatLeft box"
								            ms-class="{{aidPatientXt.zycs==2 ? 'activeBox':''}}"
											ms-click="onRadioClick1('2','zycs')"
								>急诊</div>
							</td>
						</tr>
						<tr>
							<td colspan="4" class="last_td">
								<div class="right-grp">
									<a class="easyui-linkbutton" iconCls="icon-ok" onclick="postMassEvent()">确定</a>
									<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</form>
		</div>
	</body>

	<script>
		var _emgSeq = "${emgSeq}";
		var _patid = "${patid}";
		var _arvChlCod = parent.vm.patientMsg.arvChlCod;
		var addrInfoList = publicFun.getItem('addrInfoList');
		var vm = avalon.define({
			$id: 'massEventBdy',
			hspEmgInf:{
			    emgSeq: _emgSeq
			},
			aidPatient: {
				almtime:'',//呼救120时间
				illTim:'',//发病时间
				scePrvCod:'',//省级
				sceCtyCod:'',//区级市
				sceAr0Cod:'',//县/城区
				illperd:'',//发病时间段
				illTimFlg:null,//发病时间无法精确到分钟
				patid:''
			},
			aidPatientXt: {
				scyljc:'',
				wlyyry: null,
				zzcm: null,
				sfxdt: null,
				sfxdtqz: null,
				ycxdtcs: null,
				cssj: null,
				csfs: null,
				kxxbgy: null,
				gysj: null,
				kxxbyw:'',//抗血小板药物
				ddyydmsj:'',//到达医院大门时间
				// aspl: null,
				// tgrl: null,
				// lpgl: null,
				yqrssc: null,
				yqrs: null,
				rscs: null,
				zqtyks: null,
				qszqty: null,
				rsks: null,
				rsjs: null,
				rshzy: null,
				rsyw: null,
				rsywjl: null,
				rszt: null,
				zd: null,
				zycs:null,
				fbsjdstr:'',
				ddfs:null,
				wlyy:''
			},
			patientMsg: {
				arvChlCod: _arvChlCod
			},
			provinceList: addrInfoList.province || [], //省
			cityList:[],//市
			cntyList:[],//区
	        RADIOArr: [{info: '否', infocode: '0'}, {info: '是', infocode: '1'}],// 是否单选表
			csfswxArr: publicFun.getDict('XT_CSFS_COD'),
			yqrsscArr:[{info: '适合', infocode: '1'}, {info: '不适合', infocode: '2'},{info: '未筛查', infocode: '3'}],//院前溶栓筛查
			rscsArr:[{info: '其他医院', infocode: '1'}, {info: '救护车', infocode: '2'}],//溶栓场所
			rsywArr: publicFun.getDict('XT_RSYW_COD'),
			rsywjlArr: publicFun.getDict('XT_RSYWJL_COD'),
			zdArr:[{info: 'STEMI', infocode: '1'}, {info: 'NSTEMI', infocode: '2'},{info: 'UA', infocode: '3'}, {info: '主动脉夹层', infocode: '4'},{info: '肺动肺栓塞', infocode: '5'}, {info: '其他', infocode: '8'}],
			kxxbywArr: publicFun.getDict('XT_KXXBYWTC_COD'),
			arvChlCodList: publicFun.getDict('ARV_CHL_COD'),
			WLYYArr: publicFun.getDict('XT_WLYY_COD'),
			FBSJDArr: publicFun.getDict('AID_FBSJD_COD'),
			ddfsArr: publicFun.getDict('XT_DDFS_COD').filter(function(currentValue, index,arr){
				return currentValue.infocode == '1' || currentValue.infocode == '2' || currentValue.infocode == '3';
			}),
			onToggleClick: function (){
				if(vm.aidPatient['illTimFlg'] == 0 || vm.aidPatient['illTimFlg'] == null){
					vm.aidPatient['illTimFlg'] = 1;
					if(vm.aidPatient['illTim']){
						var time = vm.aidPatient['illTim'];
						newTime = moment(new Date(time)).format('YYYY/MM/DD');
						vm.aidPatient['illTim'] = newTime;
					}
				}else if(vm.aidPatient['illTimFlg'] == 1){
					vm.aidPatient['illTimFlg'] = 0;
					if(vm.aidPatient['illTim']){
						vm.aidPatient['illTim'] = vm.aidPatient['illTim'] + ' 00:00'
					}
				}
			},
		});
		/* 监听省下拉选择框 */
		vm.aidPatient.$watch('scePrvCod', function (newVal, oldVal, name) {
			 vm.cityList = [];
		    if (newVal != '') {
		        vm.cityList = addrInfoList.cityMap[newVal];
		    }
			vm.aidPatient.sceCtyCod = '';
		});
		/* 监听市下拉选择框 */
		vm.aidPatient.$watch('sceCtyCod', function (newVal, oldVal, name) {
			vm.cntyList = [];
		    if (newVal != '') {
		        vm.cntyList = addrInfoList.cntyMap[newVal];
		    }
			vm.aidPatient.sceAr0Cod = '';
		});
		function _onlyNum (objName) {
		  vm.aidPatientXt[objName] = publicFun.onlyNumber(vm.aidPatientXt[objName])
		}
		function onRadioClick1(val,prop) {
		    vm.aidPatientXt[prop] = val;
			if(prop=='ddfs' && _arvChlCod!=''){
				if((_arvChlCod==5||_arvChlCod==6) && (val==3||val==2)){
					parent.publicFun.alert("到院方式不一致");
				}else if((_arvChlCod!=5&&_arvChlCod!=6&&_arvChlCod!=9) && (val==1||val==2)){
					parent.publicFun.alert("到院方式不一致");
				}else if(_arvChlCod==9 && (val==1||val==3)){
					parent.publicFun.alert("到院方式不一致");
				}
			}
		}
		function dateToGMT(strDate) {
			if (!strDate) {
				return '';
			}
			var dateStr = strDate.split(" ");
			var strGMT = dateStr[0] + " " + dateStr[1] + " " + dateStr[2] + " " + dateStr[5] + " " + dateStr[3] + " GMT+0800";
			var date = new Date(Date.parse(strGMT));
			return date;
		}
        //几分钟前发病
		function fbsjCha() {
			var nowtime = new Date().getTime();
			var temp = vm.aidPatientXt.fbsjdstr * 1;
			var fbsjtime = nowtime - temp * 60 * 1000;
			vm.aidPatient.illTim = moment(new Date(fbsjtime)).format('YYYY/MM/DD HH:mm');
		}
		//到达医院大门时间
        function ddyydmsjCha(){
			vm.aidPatientXt.ddyydmsj = timediff(vm.aidPatientXt.scyljc)
		}
		// 发病时间的处理
		function fbsjTime(){
			if(vm.aidPatient['illTim'] && vm.aidPatient['illTimFlg']==1){
				vm.aidPatient['illTim'] = vm.aidPatient['illTim'] + ' 00:00'
			}
		}
		//保存
		function postMassEvent() {
			fbsjTime();
			$.ajax({
				url: '${baseurl}aid/mergeAidpatient.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					hspEmgInf:vm.hspEmgInf,
					aidPatient:vm.aidPatient,
					aidPatientXt:vm.aidPatientXt,
					kxxbyw:vm.aidPatientXt.kxxbyw,
				}),
				success:function (res) {
					parent.publicFun.alert("保存成功");
					parent.closemodalwindow();
					parent.patid = res.resultInfo.sysdata.patid
					parent.vm.patientMsg.patid=res.resultInfo.sysdata.patid;
				}
			});
			//    		}
		}
        //时间的转化
		function timediff(time){
			var timer = new Date(time).getTime();
			timer = timer - 60000
			return moment(timer).format("YYYY/MM/DD HH:mm")
		}
		$(function(){
			$.ajax({
				url: '${baseurl}aid/getPatInfoByEmgSeq.do',
				type: 'post',
				dataType: 'json',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify({
					emgSeq:_emgSeq,
					patid:_patid
				}),
				success:function (res) {
					var aidPatientXt = res.resultInfo.sysdata.aidPatientXt;
					var aidPatient = res.resultInfo.sysdata.aidPatient;
					var kxxbyw = res.resultInfo.sysdata.kxxbyw;
					vm.aidPatientXt.kxxbyw = kxxbyw;
					for(var a in vm.aidPatient){
						if(aidPatient && aidPatient.hasOwnProperty(a)){
							if(a==='scePrvCod'||a==='sceCtyCod'||a==='sceAr0Cod'){
							}else{
							   vm.aidPatient[a]=aidPatient[a];
							}
							if(a==='scePrvCod'){
								vm.aidPatient['scePrvCod']=aidPatient['scePrvCod']
							}
							if(a==='sceCtyCod'){
								vm.aidPatient['sceCtyCod']=aidPatient['sceCtyCod']
							}
							if(a==='sceAr0Cod'){
							    vm.aidPatient['sceAr0Cod']=aidPatient['sceAr0Cod']
							}
						}else{
							if(a=='scePrvCod'){
								vm.aidPatient[a]='330000';
							}
							if(a=='sceCtyCod'){
								vm.aidPatient[a]='330100';
							}
						}
					}
					for(var b in vm.aidPatientXt){
						if(aidPatientXt && aidPatientXt.hasOwnProperty(b)){
							vm.aidPatientXt[b]=aidPatientXt[b];
							if(b=='ddfs'&& aidPatientXt['ddfs']==null){
								if(_arvChlCod==5||_arvChlCod==6){
									vm.aidPatientXt[b]='1';
								}else if(_arvChlCod==9){
									vm.aidPatientXt[b]='2'
								}else if(_arvChlCod!=5&&_arvChlCod!=6&&_arvChlCod!=9){
									vm.aidPatientXt[b]='3'
								}else if(_arvChlCod == ''){
									vm.aidPatientXt[b]='3';
								}
							}
						}else{
							if(b=='zycs'){
								vm.aidPatientXt[b]='2';
							}
							if(b=='ddfs'){
								if(_arvChlCod==5||_arvChlCod==6){
									vm.aidPatientXt[b]='1';
								}else if(_arvChlCod==9){
									vm.aidPatientXt[b]='2'
								}else if(_arvChlCod!=5&&_arvChlCod!=6&&_arvChlCod!=9){
									vm.aidPatientXt[b]='3'
								}else if(_arvChlCod==''){
									vm.aidPatientXt[b]='3'
								}
							}
						    if(b=='scyljc'){
								vm.aidPatientXt[b] = moment().locale('zh-cn').format('YYYY/MM/DD HH:mm');
							}
						    if(b=='ddyydmsj'){
								vm.aidPatientXt[b] = timediff(vm.aidPatientXt.scyljc)
							}
						}
					}
					if(vm.aidPatient['illTim'] && vm.aidPatient['illTimFlg']==1){
						var timer = vm.aidPatient['illTim'];
						var newTimer = moment(new Date(timer)).format('YYYY/MM/DD');
						vm.aidPatient['illTim'] = newTimer;
					}
				}
			});
		})
		/* var massVm = avalon.define({
	  	    $id: 'massEventBdy',
	  	    massMsg: {
	  	    	almtime: publicFun.timeFormat(dateToGMT('${aidPatientCustom.almtime}'), 'yyyy/MM/dd hh:mm:ss'),
	  	        aastime:publicFun.timeFormat(dateToGMT('${aidPatientCustom.aastime}'), 'yyyy/MM/dd hh:mm:ss'),
	  	        illTim: publicFun.timeFormat(dateToGMT('${aidPatientCustom.illTim}'), 'yyyy/MM/dd hh:mm:ss'), // 发病时间
	  	        sceAr1Cod: "${aidPatientCustom.sceAr1Cod}",//发病地址(县/市)
	  	        sceAr2Cod: "${aidPatientCustom.sceAr2Cod}",//发病地址(区/乡/街道)
	  	        illperd:"${aidPatientCustom.illperd}",//发病时间段
	  	        fbsjdstr: '',//发病时间段(字符串形式)
	  	    },
	  	   
	  	  })
	  
	  	function dateToGMT(strDate){
	  	  if (!strDate) {
	  		  return '';
	  	  }
	  	  var dateStr = strDate.split(" ");  
	  	  var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
	  	  var date = new Date(Date.parse(strGMT));
	  	  return date;
	  	}
	  	  
	  */
	</script>

</html>
