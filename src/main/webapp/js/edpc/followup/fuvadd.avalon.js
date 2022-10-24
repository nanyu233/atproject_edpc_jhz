
var vm = avalon.define({
	$id: 'fuvadd',
	hspFuvPatCustom:{//患者信息表
		patId: '',//患者编号
		patNam: '',//患者姓名
		cstSexCod: '',//性别
		cstSexCodStr:'',
		bthDat: '',//出生日期
		lnkNbr: '',//联系电话
		patNatCod: '',//民族
		patNatCodStr: '',//民族
		marStaCod: '',//婚姻状况
		marStaCodStr: '',//婚姻状况
		patJob: '',//职业
		idNbr: '',//证件号
		patAdr: '',//地址
		patTel: '',//电话
		patLng: '',//语言
		patNat: '',//民族
		patAdr: '',//出生地
		patRel: '',//宗教
	},
	hspFuvGrpInf:{//随访组信息表
		fgiSeq: '',//序列号
		fuvGrpCod: '',//组编号
		fuvGrpNam: '',//组名
		fuvGrpFstCod: '',//祖母首字母码
		curSta: '',//状态
		memo: ''//备注
	},
	hspFuvInfCustom:{// 随访记录信息表
		fuvSeq: _fuvSeq,//序列号
		patId: '',//患者编号
		outTim: '',//出院日期
		diaRst: '',//诊断
		fuvWayCod: '',//随访方式
		fuvTyp: '',//随访类型
		fuvTim: '',//随访时间
		fuvGrp: '',//随访组
		fuvDoc: '',//本次随访医生
		dgrStf: '',//满意度
		patSymCod: [],//症状
		patWgt: null,//体重
		smkCon: null,//日吸烟量
		alcCon: null,//日饮酒量
		fodCon: '',//主食情况
		sltConCod: '',//摄盐情况
		sptConWek: '',//运动情况
		sptConTim: '',//运动时间
		mtlSetCod: '',//心理调整
		comActCod: '',//遵医行为
		assExmCod: [],//辅助检查
		exmRst: '',//辅助检查结果说明
		medCon: '',//药物
		cooMbtCod: [],//合并疾病
		scdVstCod: '',//按时复诊
		takMedCod: '',//服药情况
		medRftFlg: '',//药物不良反应
		havBldFlg: '',//是否出血
		addExp: '',//附加说明
		fuvAgnFlg: '',//是否再次随访
		nxtFuvTim: '',//下次随访时间
		nxtFuvGrp: '',//下次随访组
		nxtFuvDoc: '',//下次随访医生
		nxtFuvDocNme:'',
		patCoo: '',//患者配合度
		hspFuvMedInfList:[]
	},
	aidEptGrp:{//专家组表
		grpSeq:'',//专家组序号
		grpNo:'',//专家组编号
		grpTyp:'',//专家组类型;|
		grpNam:'',//专家组名称; |
		eptTyp:'',//专家类型;
		eptNo:'',//专家编号;
		eptCom:'',//归属站点;
		wxpFlg:'',//小程序联系人
		crtTim:'',//创建时间
		crtTsr:'',//创建用户
		modTim:'',//修改时间
		modUsr:'',//修改用户
		_parentId:'',//父id
		usrname:'',//专家名称
		phone:'',//电话
		movephone:'',//移动电话
	},
	hideMsg:{
		assExmCod:'',
		patSymCod:'',
		cooMbtCod:'',
		showSaveButton:_showSaveButton
	},
	hspFuvDocInf:{//随访医生信息表
		fdiSeq: '',//序列号
		docCod: '',//医生编号
		docNam: '',//医生名
		docFstCod: '',//医生名首字母码
		fuvGrpCod: '',//所属随访组编码
		curSta: '',//状态
		memo: ''//备注
	},
	hspFuvMedInfList:[		
		{//用药情况信息表
			fmiSeq: '',//序列号
			medNam: '',//药物名称
			medSpe: '',//规格
			medQty: '',//用量
			medMtd: '',//用法
			fuvSeq: ''//随访记录id|关联hsp_fuv_inf(FUV_SEQ)
		}
	],
	hspFuvMedInf:{//用药情况信息表
		fmiSeq: '',//序列号
		medNam: '',//药物名称
		medSpe: '',//规格
		medQty: '',//用量
		medMtd: '',//用法
		fuvSeq: ''//随访记录id|关联hsp_fuv_inf(FUV_SEQ)
	},
	getMsg:{
		cstSexCodArr:[],//性别列表
		fuvWayCodArr:[],//随访方式列表
		comActCodArr:[],//遵医行为列表
		cooMbtCodArr:[],//合并疾病列表
		scdVstCodArr:[],//按时复诊列表
		maritalStatusArr:[],//婚姻状况列表
		xtMzCodArr:[],//民族列表
		patSymCodArr:[],//症状
		mtlSetCodArr:[],//心理调整
		sltConCodArr:[],//摄盐情况		
		patSymCodArr:[],//摄盐情况数组
		assExmCodSel:[],//辅助检查列表
		cooMbtCodSel:[],//合并疾病数组
		assExmCodSel:[],//辅助检查数组
		
		fuvTypArr:[],//随访类型
		fuvGrpArr:[],//随访组
		fuvDocArr:[],//随访医生
		nxtFuvGrpArr:[],//下次随访组
		nxtFuvDocArr:[],//下次随访医生
		
		SFCXArr: [{info: '是', infocode: '1'}, {info: '否', infocode: '0'}],// 是否出血
		YWBLFYArr: [{info: '有', infocode: '1'}, {info: '无', infocode: '0'}],//药物不良反应
		SFXCSFArr: [{info: '需要再次随访', infocode: '1'}, {info: '终止随访', infocode: '0'}],//是否需要下次随访
		FYQKArr: [{info: '遵医嘱服药', infocode: '1'}, {info: '停药', infocode: '2'}, {info: '调整', infocode: '3'}, {info: '其他', infocode: '4'}],//服药情况
		MYDArr: [{info: '2分', infocode: '2'}, {info: '4分', infocode: '4'}, {info: '6分', infocode: '6'}, {info: '8分', infocode: '8'}, {info: '10分', infocode: '10'}],//满意度
		HZPHDArr: [{info: '2分', infocode: '2'}, {info: '4分', infocode: '4'}, {info: '6分', infocode: '6'}, {info: '8分', infocode: '8'}, {info: '10分', infocode: '10'}],//患者配合度
	},
	fuvInfAlertMsg: {
		fuvTim: '随访时间必填',
		fuvGrp: '随访组必填',
		fuvDoc: '随访医生必填',
		fuvAgnFlg: '下次是否需要随访必填',
		//nxtFuvTim: '下次随访时间必填',
	    //frDat: '下次随访组必填',
	    //frDat: '下次随访医生必填'
	},
	fuvMedAlertMsg: {
		medNam: '药物名称必填',
		medSpe: '药物规格必填',
		medQty: '药物用量必填',
		medMtd: '药物用法必填',
	},	
	//只能输入整数
	limitInput: function (obj,max){
		obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
		obj.value = obj.value.replace(/^(\-)*(\d+)\.*$/, '$1$2');//只能保留一位小数
		if(obj.value != "") {
			if(obj.value>max){
				alert('数值不能超过'+max);
				obj.value = '';
				return;
			}else{
				obj.value = parseFloat(obj.value);
			}
		}
	},
	//单选
	onRadioClick: function (prop, val) {
        vm.hspFuvInfCustom[prop] = val;
	},
	//渲染多选选项
	isChecked: function (prop, code){
		var flag = false;
		for(var i=0; i<vm.getMsg[prop + 'Sel'].length; i++){
			var el = vm.getMsg[prop + 'Sel'][i];
			if(el == code){
				flag = true;
				break;
			}
		}
		return flag;
	},
	//监听多选点击事件
	onCheckClick: function (prop, code){
		var list = vm.hspFuvInfCustom[prop];
		if (list.indexOf(code) > -1) {
			list.splice(list.indexOf(code), 1);
		} else {
			list.push(code)
		}
		vm.hspFuvInfCustom[prop] = list;
		vm.hideMsg[prop] = list.join(',');
	},
	/**
	 * @@onlyNum 限制只能输入数字
	 * @param  {string}     objName                 url
	 */
	onlyNum: function (objName, attr, step, max) {
		vm[objName][attr] = publicFun.onlyNumber(vm[objName][attr], step, max)
		if (attr == 'cstAge') {
			vm.fallAssessByAge()
		}
	},
	//数值
	NumberInput: function (obj){
		obj.value = obj.value.replace(/[^\d.]/g, ""); //清除“数字”和“.”以外的字符
		obj.value = obj.value.replace(/\.{2,}/g, "."); //只保留第一个. 清除多余的
		obj.value = obj.value.replace(".", "$#$").replace(/\./g, "").replace("$#$", ".");
		obj.value = obj.value.replace(/^(\-)*(\d+)\.(\d\d).*$/,'$1$2.$3'); //只能输入两个小数
		if(obj.value.indexOf(".") < 0 && obj.value != "") {
			obj.value = parseFloat(obj.value);
		}
	},
	checkNull: function (checkTypeList, postMsg) {
	    var postMsgDetail,
	      _returnCheck = true;
	    $.each(checkTypeList, function (key, val) {
	      postMsgDetail = postMsg[key].replace(/(^\s*)|(\s*$)/g, '');
	      if (postMsgDetail === '') {	        
	    	  publicFun.alert(checkTypeList[key]);
	    	  _returnCheck = false;
	    	  return _returnCheck
	      }
	    });
	    return _returnCheck
	},
	addNewLine:function(prop){
		var list = vm[prop+'List'];		
		//非空校验
		var fuvMed = list[list.length-1].$model;		
		if (vm.checkNull(vm.fuvMedAlertMsg.$model,fuvMed) === false) {
            return
        }
		var fuvMedCopy = {};
		vm.copyObj(vm[prop].$model,fuvMedCopy);
		vm[prop+'List'].push(fuvMedCopy);
	},
	deleteLine:function(prop){
		var list = vm[prop+'List'];
		if(list.length>1){//删除最后一个
			vm[prop+'List'].splice(list.length-1, 1);
		}else{//清空当前
			var fuvMedCopy = {};
			vm.copyObj(vm[prop].$model,fuvMedCopy);
			vm[prop+'List'] = [];
			vm[prop+'List'].push(fuvMedCopy);
		}			
	},
	copyObj: function (fromObj, toObj) {	    
	    for (var key in fromObj) {
	    	toObj[key] = fromObj[key]
	    }
	},
	setCurrentCk: function (className) {
		var number = $('cs').length;
		var score = 2*number;
		vm.hspFuvInfCustom.patCod = score
		vm.hspFuvInfCustom.drgStf = score
	}
});

	vm.hspFuvInfCustom.$watch('fuvGrp', function(newVal, oldVal) {
		vm.hspFuvInfCustom.fuvDoc='';
	});
	vm.hspFuvInfCustom.$watch('nxtFuvGrp', function(newVal, oldVal) {
		vm.hspFuvInfCustom.nxtFuvDoc='';
	});

	vm.hspFuvInfCustom.$watch('nxtFuvDoc', function(newVal, oldVal) {
		vm.hspFuvInfCustom.nxtFuvDocNme='';
		if(newVal){			
			$.each(vm.getMsg.nxtFuvDocArr, function(index, val) {
	            if (val['docCod'] == newVal) {
	            	vm.hspFuvInfCustom.nxtFuvDocNme = val['docNam']
	            }
	        });
		}
	});

	function setFuvMsg(res){
		//患者基本信息
		for (var key in res.hspFuvPatCustom) {
	    	if(res.hspFuvPatCustom[key]){ 
				if(vm.hspFuvPatCustom.hasOwnProperty(key)){
					vm.hspFuvPatCustom[key] = res.hspFuvPatCustom[key];
					if(key=='bthDat')
						vm.hspFuvPatCustom[key] = publicFun.timeFormat(new Date(res.hspFuvPatCustom[key]), 'yyyy/MM/dd ')
				}
			}
	    }
		//患者基本信息
		for (var key in res.mapList) {
	    	if(res.mapList[key]){ 
				if(vm.getMsg.hasOwnProperty(key)){
					vm.getMsg[key] = res.mapList[key];
				}
			}
	    }
		//随访登记基本信息
		for (var key in res.hspFuvInfCustom) {
	    	if(res.hspFuvInfCustom[key]){ 
				if(vm.hspFuvInfCustom.hasOwnProperty(key)){					
					if(vm.hideMsg.hasOwnProperty(key)){
						vm.hspFuvInfCustom[key] = res.hspFuvInfCustom[key].split(",");
						vm.hideMsg[key] =  res.hspFuvInfCustom[key];
					}else{						
						vm.hspFuvInfCustom[key] = res.hspFuvInfCustom[key];
						if(key=='fuvTim'||key=='outTim'||key=='nxtFuvTim'){
							vm.hspFuvInfCustom[key] = publicFun.timeFormat(new Date(res.hspFuvInfCustom[key]), 'yyyy/MM/dd ')
						}
						if(key=='hspFuvMedInfList'){
							vm[key] = res.hspFuvInfCustom[key];
						}
						
					}
				}
			}
	    }		
	}	