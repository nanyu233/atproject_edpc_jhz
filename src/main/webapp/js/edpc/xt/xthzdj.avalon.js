var addrInfoList = publicFun.getItem('addrInfoList');
var vm = avalon.define({
  $id: 'xthzdj',
  msg: {
	JZPCI:'',
    patientInfo: {
    },
	hspCrivelInf:{
	},
	hspGraceInf:{
		gracejgwtj01:'',
		gracejgwtj02:'',
		gracewxfc:'',
	},
	//急诊预检
	hspEmgInf:{
		cstNam:'',
		cstSexCod:'',//0男 1女
		cstAge:'',
		ddyydmsj:'',//到达医院大门时间 = 院内接诊时间-1分钟
		emgDat:'',//院内接诊时间
		arvChlCod:'',//到达方式
		oxyNbr:'',//末梢血氧饱和度
		cr:'',//Cr
		d2jt:'',//D-timer 
		bnp:'',//BMP/NT-proBNP
		ctni:'',//肌钙蛋白
		senRctCod:'',//意识
		breNbr:'',//呼吸
		hrtRte:'',//心率
		sbpupNbr:'',//血压
		sbpdownNbr:'',
		cstDspCod:'',
		mpi:'',
	},
	//院内发病
	ynfb:{
		fstTim:'',//床位医师接触时间
		illDep:'',//发病科室
		lveTim:'',//患者离开科室时间
		ynfb:null,
		illTim:'',
	},
	//院前急救
	aidPatient: {
		XINGM:'',
		XINGB:'',//0男 1女
		NIANN:'',
		almtime:'',//呼救120时间
		illTim:'',//发病时间
		scePrvCod:'',//省级
		sceCtyCod:'',//区级市
		sceAr0Cod:'',//县/城区
		illperd:'',//发病时间段
		illTimFlg:null,//发病时间无法精确到分钟
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
		wlyy:'',
		aspl:'',
		aspl02:'',
		tgrl:'',
		lpgl:'',
		zd:'',
	}
  },
  /**
   *
   * @param prop 属性名
   * @param infocode 每次循环的infocode
   * @returns true 或者 false
   */
  setChecked: function(prop,infocode){

    var resultStr = vm.msg.patientInfo[prop] ? vm.msg.patientInfo[prop] : '';
	var resultStr02 = vm.msg.hspGraceInf[prop] ? vm.msg.hspGraceInf[prop] : '';
    if (resultStr.indexOf(infocode) > -1 || resultStr02.indexOf(infocode) > -1 ){
      return true
    }else {
      return  false;
    }
  },
    provinceList: addrInfoList.province || [], //省
	cityList:[],//市
	cntyList:[],//区
	addr:[],
  /**
   *单选事件
   * @param {patientInfo的属性名} prop
   * @param {属性值：0或1} value
   */
  xhRadioClick: function (prop, value) {
    var checked = $(this).prop("checked");
    var sibling = $(this).siblings().eq(0);
    if (checked) {
      vm.msg[prop] = value;
      sibling.prop("checked", !checked);
    }
    if (!checked && !(sibling.prop("checked"))) {
      vm.msg[prop] = '';
    }
  },
  /**
   *多选事件
   * @param {patientInfo的属性名} prop
   * @param {表示各个选项的数字} code
   */
  xhCheckboxClick: function (prop, code) {
    if (!vm.msg.patientInfo[prop]) {
      vm.msg.patientInfo[prop] = [];
    }
    var checked = $(this).prop("checked");
    if (checked) {
      vm.msg.patientInfo[prop].push(code);
    } else {
      $.each(vm.msg.patientInfo[prop], function (idx, item) {
        if (item === code) {
          vm.msg.patientInfo[prop].splice(idx, 1);
        }
      });

      //120救护车未选中，呼救时间和到场时间清空
      if (prop == 'DDFS' && code == '1') {
        vm.msg.patientInfo["000009"] = '';
        vm.msg.patientInfo["000010"] = '';
      }
      //非ACS胸痛未选中，非ACS胸痛具体清空
      if (prop == 'XTBYZD' && code == '6') {
        vm.msg.patientInfo["020028"] = '';
      }
      //DAPT未选择，阿司匹林+清空
      if (prop == 'CYDY' && code == '1') {
        vm.msg.patientInfo["030038"] = '';
      }
      //收治住院未选中，科室清空
      if (prop == 'FXYXXTHZZG' && code == '1') {
        vm.msg.patientInfo["SZZYKS"] = '';
      }
    }
  },
  
});

