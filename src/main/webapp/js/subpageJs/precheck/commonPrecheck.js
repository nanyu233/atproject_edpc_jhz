/**
 * @@jsbrjz 给子页面用的某些数据
 */

var jsbrjz;
var vm = avalon.define({
  $id: 'jsbrqjs',
  getMsg: {
    cstSexCodList: [], // 性别 CST_SEX_COD
    cstAgeCodList: [], // 年龄类型 CST_AGE_COD
    ksfzList: [], // 快速分诊 EMG_KSFZ
    arvChlCodList: [], // 到院方式 ARV_CHL_COD
    cmpPsnCodList: [], // 陪送人员 CMP_PSN_COD
    senRctCodList: [], // 清醒程度 SEN_RCT
    senStuCodList: [], // 意识状态 SEN_STU_COD
    jzkscompctlList: [], // 分科
    // refusedSurveyList: [], // 异常项 REFUSED_SURVEY
    mnsSitCodList: [], // 女性月经史
    otherHospitalNameList: [], // 救护车列表
    abnDriverList:[],//驾驶员列表
    chkLvlCodList: [], // 预检分级
    modLvlCodList: [], // 修订分级列表copy
    emgAreCodList: [], // 急诊分区
    bedplacecodList: [], // 床位
    emgBedList: [],
    lgBedList: [],
    emgBedTempList: [], // 临时
    lgBedTempList: [],
    patientTypList: [{ infocode: '1', info: '成人', checked: false }, { infocode: '2', info: '儿童', checked: false }, { infocode: '3', info: '产科', checked: false }, { infocode: '4', info: '妇科', checked: false }], // 患者类别
    pregnantYdcxCodList: [], // 阴道出血 PREGNANT_YDCX_COD
    pregnantGsplCodList: [], // 宫缩频率 PREGNANT_GSPL_COD
    cstDspCodList: [],
    cstDspCodLgList: [],
    grnChlRsnList: [],
    totalCbyxList: [],
    dangerousCodList: [], // DANGEROUS_COD
    // dangerousCodList3: publicFun.getDict('WJZX_CK_COD'),
    // dangerousCodList4: publicFun.getDict('WJZX_FK_COD'),
    // dangerousCodList1: publicFun.getDict('WJZX_CR_COD'),
    // dangerousCodList2: publicFun.getDict('WJZX_EK_COD'),
    dangerousCodList3: [],
    dangerousCodList4: [],
    dangerousCodList1: [],
    dangerousCodList2: [],
    gfFlgList: [{ infocode: '1', info: '是', checked: false }, { infocode: '0', info: '否', checked: false }], // 是否规范
    zjzzFlgList: [{infocode: '0', info: '无', checked: false }, { infocode: '1', info: '有', checked: false }],
    ywhsList: [{ infocode: '0', info: '无'}, { infocode: '1', info: '24小时'}, {infocode: '2', info: '48小时' }, {infocode: '3', info: '大于48小时' }], // 核酸
    zjzzCodList: [], // 自觉症状
    glsCodList: [],
    sendInCodList: [], // 120送入
    wzbzCodList: [],
    wzbzList: [], // 病种 WZBZ_COD
    yjbzCodList: [],
    fdcsCodList: [], 
    abnDoctorList: [], //驾驶员列表
  },
  patientMsg: {
    regSeq:'',
    vstCad: '', // 就诊卡
    cardType: '', // 卡类别 1 社保 2 自费 3 农保
    regTim: '', // 预检时间
    idNbr: '',   //身份证号
    grnChl: '0', // 绿色通道
    grnChlRsn: '', // 绿色通道原因
    swChl: '0', // 三无人员
    cstNam: '', // 姓名
    cstSexCod: '', // 性别
    bthDat: '', // 出生日期
    cstAge: '', // 年龄
    cstAgeCod: '0', // 年龄类型
    pheNbr: '', // 联系方式
    cstAdr: '', // 联系地址
    yz: '', // YZ 孕周
    hysl: '', // hysl	怀孕数量
    scsl: '', // 生产数量
    gkMsg: '', // 宫口整合数据
    gk: '', // 宫口
    gkCod: '', // 宫口单位
    mcyj: '', // 末次月经时间
    chkLvlCod: '', // 预检分级
    modLvlCod: '', // 修订分级
    modLvlDes: '', // 修订分级说明
    emgDepCod: '', // 最终分级
    emgAreCod: '', // 急诊分区
    mewsTotSco: '', // mews评分
    remsTotSco:'',//REMS评分
    remsDeath:'',//病死危险率
    nrsMemo: '', //备注
    nrsSco: null, // NRS评分
    ttpfNr: '', // 疼痛内容
    ttpfTypeCod: '0', // 疼痛类型
    eyeRctCod: '',
    lanRctCod: '',
    actRctCod: '',
    gcsTotSco: '', // gcs评分
    // cramsTotSco: '', // crams评分
    cspgFlg: '0', //
    cspgCod: '', // 创伤评分
    xtFlg: '0',
    xtCod: '',
    xtSubCod: '', // 胸痛
    ksfz: [], // 快速分诊
    arvChlCod: '', // 到院方式
    cmpPsnCod: [], // 陪送人员
    xueyang: '', // 血氧饱和度
    senStuCod: '', // 意识状态
    wzbz: [], // 病种
    mtCod: '', //面瘫
    szthCod: '', //上肢瘫痪
    wlCod: '', //握力
    czFlag: '0', //卒中标志
    preDgnCod: '', // 主诉症状
    cstDspCod: '', // 病人去向
    emgFkCod: '', // 分科
    emgFkName: '', // 分科
    sqlDctNbr: '', // 分诊医生
    // refusedSurvey: '', // 异常项
    fallAssCod: '', // 跌倒评估
    fallAssEssText: '', // 跌倒评估 -- name
    fdcsCod: [], // 跌倒措施
    mnsSitCod: '', // 女性月经史
    gfFlg: '', // 是否规范(0否,1是)
    gfbz: '', // 不规范备注
    abnScoNme: '', // 转入医院
    zjzzCod: [], // 自觉症状
    zjzzFlg: [], // 是否有自觉症状 0 无 1 有
    zjzzQt: '', // 自觉症状其他
    abnDriver: '',//120驾驶员
    abnDoctor: '',//120医生
    // allergic: '', //过敏史借用字段
    emgBed: '', //床位
    bedid: '',
    bedLgs: '',
    caseHis: '', //第几周
    patientTyp: '1', // 患者类型 默认成人  1:成人 2:儿童 3:产科 4：妇科
    crt: '', // 儿童独有，文本输入项 crt 秒
    pregnantYdcxCod: '', // 阴道出血
    pregnantGsplCod: '', // 宫缩频率
    qtsjFlg: '0',	// 群体事件标志      |0：否；1：是
    qtsjSeq: '',
    preUsrNbr: '', // 首诊护士
    preUsrNam: '', // 首诊护士名字
    sqlSeq: '',
    observationCode: '',
    ryzdXy: '',
    cyzdZy: '',
    cyzdXy: '',
    deathDiagnosis: '',
    // docDat: '',
    jzys: '',
    ysxm: '',
    ksdm: '',
    checkNurse: '',
    checkDocDat: '',
    checkNurseDat: '',
    checkDocStatus: '',
    checkNurStatus: '',
    checkDoctor: '',
    cleanhzMemo: '',
    jbzdDes: '',
    mpi: '',
    ghxh: '',
    firstsqlseq: '',
    bedNam: '', // 转归床位
    sqlDat: '', // 转归时间
    sqlDes: '', //转归说明（转院）
    sqlDepName: '', // 转归科室
    sqlStaCod: '', // 转归去向
    sqlStaStr: '', // 转归去向 Name
    isGetAjaxFlg: false, // 修改页面 是否拿到数据
    cdxx: '',
    khlx: '',
    rczId:'',
    jzxhOld:'',
    adtA01:'',
    psryqt:'',
    ghid: '', // 后台需要的字段
    patid: '', // 后台需要的字段
    jzxh:'',//就诊次数   
    registerTimeStr: '', // 挂号时间
    jwgfxCod: [], // 危急、高风险
    yjbzCod: [], // 备注
    remarks: '',
    yjbzQt: '', // 备注
    sendInCod: '', // 120送入属性名
    showAge: '',
    pfqkCod:'',
    pfqkqt:'',
    algHon:'',
    algTypDes:'', // 过敏史其他
    gmfybx:'',
    alert_flg: false,
    alert_auto_flg: false,
    pfManager: [],
    rtsTotSco: '', // rts 总分值
    xtlcflg: '0', // 进入胸痛流程标志 0=未进入流程 1=进入流程
    czlcflg: '0', // 进入卒中流程标志 0=未进入流程 1=进入流程
    cslcflg: '0', // 进入创伤流程标志 0=未进入流程 1=进入流程
    patid: '', // 院前绑定的id
    hzyjzt: '', // 患者预检暂存 患者预检状态 1=暂存
    ywhs: '' ,// 有无核酸
		hspAra:_HSPLP==='SD'?'1':'2' ,// 院区 三墩 ==1 灵隐==2
		patTyp:''
  },
  patientInfFlg: {
    pgbFlag: 0,
    tmpNbrFlag: 0,
    oxyNbrFlag: 0,
    breNbrFlag: 0,
    sbpUpNbrFlag: 0,
    hrtRteFlag: 0
  },
  aboutMews: {
    senRctCod: '',
    huxipl: '',
    mb: '',
    tiw: '',
    sbpUpNbr: '',
    sbpDownNbr: '',
  },
  aboutRems: {
    mb:'',
    sbpUpNbr:'',
    huxipl:'',
    gcsTotSco:'',
    cstAge:'',
    xueyang:''
  },
  // aboutCRAMS: {
  //   sptLvlCod: '',
  //   lanLvlCod: '',
  //   cirLvlCod: '',
  //   breLvlCod: '',
  //   bdyLvlCod: ''
  // },
  aboutPEWS: {
    actionCod: '', // 行为
    xxgSkinCod: '', // 肤色
    xxgCrtCod: '', // CRT
    xxgXlCod: '', // 心率
    hxPlCod: '', // 频率
    hxXhCod: '', // 吸凹
    hxFio2Cod: '',
    pewsSco: ''
  },
  hideMsg: {
    ksfz: '', // 快速分诊
    wzbz: '', // 病种
    cmpPsnCod: '', // 陪送人员
    fdcsCod: '', // 跌倒措施
    // refusedSurvey: '', // 异常项
    zjzzCod: '', // 自觉症状
    zjzzFlg: '', // 是否有自觉症状
    jwgfxCod: '', // 危急、高风险
    yjbzCod: '', // 备注
  },
  // isShowAbnScoList: false,
  isShowAbnDriverList: false,
  isShowAbnDoctorList: false,
  // isShowAlgTypDes: false,
  grnChlRsnShowFlg: false,
  isEditPage: editFlag,
  isCanSave: true, // 是否可以保存 ---- 状态
  // levelBasis: '', // 分级依据
  islgbed: _islgbed,
	jdFlag:_jdFlag,
	tghFlag:_tghFlag,
	qfghFlag:_qfghFlag,
	ltklFlag:_ltklFlag,
  saveCstDspCod: '', // 保存过的cstDspCod
  isJumpToYq: isJumpToYq,
  isJumpToSdzx: isJumpToSdzx,
  isOpenYqFlg: _isOpenYqFlg,
  isOpenJjyqFlg: _isOpenJjyqFlg,
  cleanName: function () {
    vm.patientMsg.cstNam = '';
  },
  noMassRequire: function () {
    if (!vm.hideMsg.ksfz && vm.patientMsg.yjbzCod.indexOf('2') == -1 && vm.patientMsg.yjbzCod.indexOf('3') == -1 && vm.patientMsg.qtsjFlg != '1' && vm.patientMsg.patientTyp != '2') {
      return true
    } else {
      return false
    }
  },
  toSingleStr: function (objName, index) {
    var _ckList = vm.patientMsg[objName].$model;
    if (_ckList.length > 0) {
      vm.patientMsg[objName] = vm.patientMsg[objName + 'List'][index].infocode;
      vm.hideMsg[objName] = vm.patientMsg[objName].join(',');
    } else {
      vm.patientMsg[objName] = [];
      vm.hideMsg[objName] = '';
    }
  },
  /**
   * @@onlyNum 限制只能输入数字
   * @param  {string}     objName                 url
   */
  onlyNum: function (objName, attr, step, max) {
    vm[objName][attr] = publicFun.onlyNumber(vm[objName][attr], step, max)
    if (attr === 'nrsSco') {
      vm[objName].ttpfTypeCod = '0'
      vm[objName].ttpfNr = ''
      $('#emg_ttpfTypeCod').val('0')
      $('#emg_ttpfNr').val('')
    } else if (attr == 'cstAge') {
      vm.fallAssessByAge()
    }
  },
  isShowBed: function () {
    var _cstDspCod = vm.patientMsg.cstDspCod;
    if ((_islgbed === '0' && _cstDspCod === '11') || (_cstDspCod !== '11' && _cstDspCod !== '6') || (_cstDspCod == '' || _cstDspCod == null)) {
      return false
    } else {
      return true
    }
  },
  /**
   * @@judgeFlag 绿色通道 / 三无人员 / 子宫破裂 / 胎盘早剥 / 胎窘 / 成人 / 儿童 /产科 / 妇科
   * 1:成人 2:儿童 3:产科 4：妇科
   */
  judgeFlag: function (objName, flgValue) {
    var _msg = vm.patientMsg;
		var arr = ['xtFlg','cspgFlg','czFlag']
		arr.forEach(function(item){
			if(_msg[item]=='1'){
				_msg[item]='0'
			}
		})
    if (objName === 'patientTyp') {
      if (_msg[objName] == '1') {
        _msg[objName] = flgValue
      } else {
        if (_msg[objName] == flgValue) {
          var cstAge = vm.patientMsg.cstAge,
            cstAgeCod = vm.patientMsg.cstAgeCod;
          if (cstAge !== '' && ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2')) {
            vm.patientMsg.patientTyp = '2'; // 儿童
          } else {
            vm.patientMsg.patientTyp = '1'
          }
        } else {
          _msg[objName] = flgValue
        }
      }
      if (_msg[objName] === '2') { // 儿科 去向默认“诊间就诊”、就诊科室默认“急诊儿科”
        _msg.cstDspCod = '5';
        _msg.emgFkCod = 'SD0004'
        _msg.emgFkName = '急诊儿科'
      } else if (_msg[objName] === '3' || _msg[objName] === '4') { // 产科、妇科 去向默认“诊间就诊”、就诊科室默认“急诊妇产科”
        _msg.cstDspCod = '5';
        _msg.emgFkCod = 'SD0014'
        _msg.emgFkName = '急诊妇产科'
      }
      if (_msg[objName] != '2') {
        _msg.crt = '';
        for (var k in vm.aboutPEWS) {
          vm.aboutPEWS[k] = ''
        }
      } else if (_msg[objName] == '2') {
        _msg.pregnantGsplCod = '';
        _msg.pregnantYdcxCod = '';
      }
    } else {
			
      if (_msg[objName] === '0' || _msg[objName] === '') {
        if (objName === 'grnChl') { 
          _msg.grnChlRsn = '';
        }
        _msg[objName] = '1';
				if(objName=='xtFlg'){
					vm.patientMsg.patTyp = '1'
				}else if(objName=='cspgFlg'){
					vm.patientMsg.patTyp = '3'
				}else if(objName=='czFlag'){
					vm.patientMsg.patTyp = '2'
				}
        // 预检登记页面：点击三无人员，若就诊卡、姓名为空则姓名栏目显示“无名氏+日期时间yyyyMMddHHmm”   
        if (objName === 'swChl' && vm.isEditPage != '1') {
          if (publicFun.checkItemNull(_msg.vstCad) && publicFun.checkItemNull(_msg.cstNam)) {
            _msg.cstNam = '无名氏+' + publicFun.timeFormat(new Date(), 'yyyyMMddhhmm');
          }
        }
      } else {
        if (objName === 'cspgFlg') {
					_msg.patTyp=''
					_msg.xtFlg = '0'
					_msg.czFlag='0'
					// _msg.cspgFlg = '0'
          if (!publicFun.checkItemNull(_msg.cspgCod)) {
            _confirm('创伤情况已评估，确认清空评估选项吗？', null, function () {
              _msg.cspgCod = '';
              _msg[objName] = '0';
              return;
            })
          } else {
            _msg[objName] = '0';
          }
        } else if (objName === 'xtFlg') {
					_msg.patTyp=''
					// _msg.xtFlg = '0'
					_msg.czFlag='0'
					_msg.cspgFlg = '0'
          if (!publicFun.checkItemNull(_msg.xtCod) || _msg.xtlcflg == '1') {
            var _confirmMsg = '';
            if (!publicFun.checkItemNull(_msg.xtCod) && _msg.xtlcflg == '1') {
              _confirmMsg = '胸痛情况已评估且胸痛流程已进入，确认取消胸痛选项吗？'
            } else if (publicFun.checkItemNull(_msg.xtCod) && _msg.xtlcflg == '1') {
              _confirmMsg = '胸痛流程已进入，确认取消胸痛选项吗？'
            } else if (!publicFun.checkItemNull(_msg.xtCod) && _msg.xtlcflg != '1') {
              _confirmMsg = '胸痛情况已评估，确认取消胸痛选项吗？'
            }
            _confirm(_confirmMsg, null, function () {
              _msg.xtCod = '';
              _msg.xtSubCod = '';
              _msg.xtlcflg = '';
              _msg[objName] = '0';
              return;
            })
          } else {
            _msg[objName] = '0';
          }
        } else if (objName === 'czFlag') {
					_msg.patTyp=''
					_msg.xtFlg = '0'
					_msg.czFlag='0'
					_msg.cspgFlg = '0'
          if (!publicFun.checkItemNull(_msg.mtCod) || !publicFun.checkItemNull(_msg.szthCod) || !publicFun.checkItemNull(_msg.wlCod) || _msg.czlcflg == '1') {
            var _confirmMsg = '';
            if ((!publicFun.checkItemNull(_msg.mtCod) || !publicFun.checkItemNull(_msg.szthCod) || !publicFun.checkItemNull(_msg.wlCod)) && _msg.czlcflg == '1') {
              _confirmMsg = '卒中情况已评估且卒中流程已进入，确认取消卒中选项吗？'
            } else if ((publicFun.checkItemNull(_msg.mtCod) && publicFun.checkItemNull(_msg.szthCod) && publicFun.checkItemNull(_msg.wlCod)) && _msg.czlcflg == '1') {
              _confirmMsg = '卒中流程已进入，确认取消卒中选项吗？'
            } else if ((!publicFun.checkItemNull(_msg.mtCod) || !publicFun.checkItemNull(_msg.szthCod) || !publicFun.checkItemNull(_msg.wlCod)) && _msg.czlcflg != '1') {
              _confirmMsg = '卒中情况已评估，确认取消卒中选项吗？'
            }
            _confirm(_confirmMsg, null, function () {
              _msg.mtCod = '';
              _msg.szthCod = '';
              _msg.wlCod = '';
              _msg[objName] = '0';
              _msg.czlcflg = ''
              return;
            })
          } else {
            _msg[objName] = '0';
          }
        } else {
          _msg[objName] = '0';
        }
      }
    }
  },
  bindGroupEvent: function (type) {
    var _qtsjSeq = vm.patientMsg.qtsjSeq;
    if (type !== 'check') {
      if (vm.isEditPage == '1') {
        createmodalwindow('群体事件绑定', 700, 500, _baseUrl + 'qtsjgl/tobdqtsj.do?hspQtsjglCustom.qtsjSeq=' + _qtsjSeq)
      } else {
        createmodalwindow('群体事件绑定', 820, 510, _baseUrl + 'qtsjgl/toBdqtsjNew.do?hspQtsjglCustom.qtsjSeq=' + _qtsjSeq)
      }
    } else {
      vm.patientMsg.qtsjFlg = '0'
      $('#qtsjSeq').val('');
      $('.spChl-btn').removeClass('active');
      $('#massText').html('');
      $('#massTitle').html('');
    }
  },
  cspgBox: function () {
    createmodalwindow('创伤标志', 450, 400, _baseUrl + 'emg/querycspg.do')
  },
  chestBox: function () {
    createmodalwindow('胸痛', 700, 376, _baseUrl + 'emg/queryxtzbpg.do')
  },
  czFaceBox: function () {
    createmodalwindow('卒中', 500, 275, _baseUrl + 'hzszyyemg/queryczface.do')
  },
  openFrdj:function(){
    createmodalwindow('发热登记', 800, 550, _baseUrl + 'hzszyyemg/toFrRegister.do')
  },
  openGhbd:function(){
    createmodalwindow('挂号绑定', 1100, 400, _baseUrl + 'his/toRczGhxx.do?emgSeq='+_emgSeq +'&cstNam='+ vm.patientMsg.cstNam);
  },
  openJzbd: function() {
    if (vm.isEditPage != '1') {
      return
    }
    createmodalwindow('就诊绑定', 700, 400, _baseUrl + 'his/toJzbd.do?emgSeq='+_emgSeq +'&vstCad='+ vm.patientMsg.vstCad+'&emgDat='+ vm.patientMsg.regTim+'&cstNam='+ vm.patientMsg.cstNam);
  },
  openVitalSign: function(){
    createmodalwindow(vm.patientMsg.cstNam + "-" + '生命体征补录', 750, 500, _baseUrl +'hzszyyemg/queryVitalSign.do?emgSeq=' + _emgSeq + '&th=' + new Date().getTime(), 'no');
  },
  RTSbox: function () {
    createmodalwindow('RTS评分', 600, 400, _baseUrl + 'emg/queryRts.do')
  },
  // openYjws:function() {
  //   createmodalwindow('预检待完善', 980, 450, _baseUrl + 'hzszyyemg/toBeImproved.do')
  // },
  pewsBox: function () {
    createmodalwindow('PEWS评分', 800, 500, _baseUrl + 'hzszyyemg/queryPewsck.do')
  },
  // getOpenGhlb: function () {
  //   createmodalwindow('已挂号未预检', 700, 515, _baseUrl + 'hzszyyemg/registeredlist.do')
  // },
  MEWSbox: function () {
    createmodalwindow('MEWS评分', 600, 485, _baseUrl + 'emg/querymews.do')
  },
  REMSbox:function() {
    createmodalwindow('REMS评分', 600, 580, _baseUrl + 'emg/queryrems.do')
  },
  NRSbox: function () {
    var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
    var _tabHeight = _bdHeight - 30;
    if (_bdHeight > 660) {
      _tabHeight = 660;
    }
    var info = vm.patientMsg, _ty = info.ttpfTypeCod;
    if ((info.nrsSco == null || info.nrsSco === '') && (vm.isEditPage != '1') && (_ty === '0' || _ty === 0)) { // 新增且nrs类型为第一种无分值时赋值0分
      info.nrsSco = '0'
    }
    createmodalwindow('疼痛评分', 700, _tabHeight, _baseUrl + 'scorequery/toNrsGde.do?typeSource=preCheck')
  },
  GCSbox: function () {
    createmodalwindow('GCS评分', 500, 490, _baseUrl + 'emg/querygcs.do')
  },
  // CRAMSbox: function () {
  //   createmodalwindow('CRAMS评分', 500, 500, _baseUrl + 'emg/querycrams.do')
  // },
  openKnowledge: function () {
    createmodalwindow('知识库', 600, 560, _baseUrl + 'firstimp/toZsk.do')
  },
  riskBox: function () {
    createmodalwindow('跌倒评估', 800, 500, _baseUrl + 'hzszyyemg/queryRisk.do')
  },
  openPreHosBox: function () {
    createmodalwindow('院前患者绑定', 800, 500, _baseUrl + 'hzszyyemg/toBindPreHosInfo.do')
  },
  /**
   * @@synchroSenStuCod 意识状态为清醒状态，同步其他数据
   */
  synchroSenStuCod: function (val) {
    if (val === 0 || val === '0') {
      if (vm.isEditPage == '1') {
        if (vm.patientMsg.gcsTotSco == '' || vm.patientMsg.gcsTotSco == null) {
          vm.setTotalGcs();
        } else {
          vm.setAttiude()
        }
      } else {
        vm.setTotalGcs();
      }
    }
  },
  setTotalGcs: function () {
    vm.setAttiude()
    vm.patientMsg.gcsTotSco = '15';
    vm.patientMsg.eyeRctCod = '4';
    vm.patientMsg.lanRctCod = '5';
    vm.patientMsg.actRctCod = '6';
  },
  setAttiude: function () {
    vm.aboutMews.senRctCod = '0';
    vm.patientMsg.senStuCod = '0';
  },
  cleanDriverInput: function () {
    if (vm.patientMsg.sendInCod === '' || vm.patientMsg.sendInCod == null) {
      vm.patientMsg.abnDriver = ''
      vm.patientMsg.abnDoctor = ''
    }
  },
  _radioCheck: function (obj, index) {
    vm.patientMsg[obj] = publicFun.radioClicks(vm.getMsg[obj + 'List'], vm.patientMsg[obj], index);
    if (obj === 'modLvlCod') {
      if (vm.patientMsg[obj] == '') {
        vm.patientMsg[obj] = vm.patientMsg.chkLvlCod;
        for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
          vm.getMsg['modLvlCodList'][i].checked = false;
          if (vm.patientMsg.chkLvlCod == vm.getMsg['modLvlCodList'][i]['infocode']) {
            vm.getMsg['modLvlCodList'][i].checked = true;
          }
        }
      }
    }
  },
  _checkClicks: function (obj, index) {
    vm.hideMsg[obj] = publicFun.checkClicks(vm.getMsg[obj + 'List'], vm.patientMsg[obj], index, vm.hideMsg[obj])
  },
  setSenStu: function () {
    if (vm.patientMsg.senStuCod == '4') { // 意识选择深昏迷
      vm.patientMsg.gcsTotSco = '3';
      vm.patientMsg.eyeRctCod = '1';
      vm.patientMsg.lanRctCod = '1';
      vm.patientMsg.actRctCod = '1';
    }
  },
  setSctStu: function () {
    // 清醒程度选择无反应或者意识选择深昏迷，GCS评分自动选项为不能睁眼、不能发音、无动作，总分3分显示
    if (vm.aboutMews.senRctCod == '3') { // 清醒程度选择无反应
      vm.patientMsg.gcsTotSco = '3';
      vm.patientMsg.eyeRctCod = '1';
      vm.patientMsg.lanRctCod = '1';
      vm.patientMsg.actRctCod = '1';
    }
  },
  calcPatType: function () {
    if (vm.isEditPage == '1') {
      if (!vm.patientMsg.isGetAjaxFlg) {
        return;
      }
    }
    /**
    * @若年龄大于14岁，则患者类别默认为成人、产科、妇科 如果小于14岁默认为儿童
    * 1:成人 2:儿童 3:产科 4：妇科
    */
    var cstAge = vm.patientMsg.cstAge,
      cstAgeCod = vm.patientMsg.cstAgeCod;
    if (cstAge !== '' && ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2')) {
      vm.patientMsg.patientTyp = '2'; // 儿童
      // vm.setOtherTypeNull();
    } else if (cstAge >= 14 && cstAgeCod === '0') {
      if (vm.patientMsg.patientTyp == '2') {
        vm.patientMsg.patientTyp = '1'
      }
    } else if (cstAge === '') {
      if (vm.patientMsg.patientTyp == '2') {
        vm.patientMsg.patientTyp = '1'
      }
    }
    vm.fallAssessByAge()
  },
  // setOtherTypeNull: function () {
  //   var _otherTypeList = ['yz', 'hysl', 'scsl', 'gk', 'mcyj'];
  //   _otherTypeList.forEach(function (item) {
  //     vm.patientMsg[item] = '';
  //   })
  // },
  /**
   * @修改分科
   */
  changeEmgFkCod: function () {
    var emgFkCod = vm.patientMsg.emgFkCod;
    if (emgFkCod != '') {
      $.each(vm.getMsg.jzkscompctlList, function (idx, val) {
        if (val['comno'] == emgFkCod) {
          vm.patientMsg.emgFkName = val['comcname'];
        }
      });
    } else {
      vm.patientMsg.emgFkName = '';
    }
    // vm.patientMsg.sqlDctNbr = '';
  },
  /**
   * @单击清空送入来源
   */
  cleanAbnSco: function () {
    vm.isShowAbnScoList = false;
    vm.isShowAbnDriverList = false;
    vm.isShowAbnDriverList = false;
  },
  /**
   * @获取送入来源列表
   */
  // getAbnSco: function (name) {
  //   var getAbnScoUrl = _baseUrl + 'hzszyyemg/findHspScoListBySzm.do';
  //   publicFun.httpServer({ url: getAbnScoUrl }, { acronym: name }, function (res) {
  //     vm.getMsg.otherHospitalNameList = res.rows;
  //   })
  // },
  /**
   * @获取送入来源列表
   */
  getAbnDriver: function () {
    if (publicFun.getDict('DRIVER_DOC_COD')) {
      vm.getMsg.abnDoctorList = publicFun.getDict('DRIVER_DOC_COD');
    }
    if (publicFun.getDict('DRIVER_COD')) {
      vm.getMsg.abnDriverList = publicFun.getDict('DRIVER_COD');
    }
  },
  /**
   * @选择某个送入来源
   */
  chooseAbnDriver: function (abnDriver) {
    vm.patientMsg.abnDriver = abnDriver;
    $('#driverName').val(abnDriver);
    vm.isShowAbnDriverList = false;
  },
  chooseAbnDoctor: function(abnDoctor){
    vm.patientMsg.abnDoctor = abnDoctor;
    $('#doctorName').val(abnDoctor);
    vm.isShowAbnDoctorList = false;
  },
  chooseLiText: function (name, obj) {
    vm.patientMsg[obj] = name;
    vm[obj + 'ShowFlg'] = false;
  },
  cleanUlInputText: function (obj) {
    vm[obj + 'ShowFlg'] = false;
  },
  showUlInputMsg: function (obj) {
    cancelPop();
    $('.scroll-list-div').hide();
    $('.param-input').css({ 'box-shadow': 'none' })
    vm[obj + 'ShowFlg'] = true;
    vm.setOtherText('zjzzCod', 'zjzzQt')
    vm.setOtherText('yjbzCod', 'remarkQt')
    vm.setOtherText('cmpPsnCod', 'psryqtQt')
    var flgList = ['isShowAbnScoList', 'isShowDocList', 'isShowAbnDriverList', 'isShowAbnDoctorList'];
    for (var i = 0; i < flgList.length; i++) {
      vm[flgList[i]] = false;
    }
  },
  isCleanText: function () {
    if (vm.patientMsg.gfFlg == '1') {
      vm.patientMsg.gfbz = '';
    }
  },
  // changeToStr: function (objName, code) {
  //   var _list = vm.patientMsg[objName].$model;
  //   if (_list.length > 0) {
  //     vm.hideMsg[objName] = _list.join(',');
  //   } else {
  //     vm.hideMsg[objName] = ''
  //   }
  // },
  isCleanSelTime: function () {
    if (vm.patientMsg.ywhs === '0') {
      vm.patientMsg.cstDspCod = '18' // 核酸选择无，去向关联急诊缓冲区
    } else if (vm.patientMsg.ywhs !== '') {
      if (vm.patientMsg.cstDspCod == '18') {
        vm.patientMsg.cstDspCod = ''
      }
    }
  },
  setStandardCk: function () {
    if (publicFun.strTrim(vm.patientMsg.gfbz) != '') {
      vm.patientMsg.gfFlg = '0';
    }
  },
  cbyxSearchList: [],
  getCbyxList: function () {
    vm.cbyxSearchList = [], _preDgnCod = vm.patientMsg.preDgnCod;
    var cbyxDictList = vm.getMsg.totalCbyxList;
    cbyxDictList.map(function (item) {
      if (_preDgnCod) {
        _preDgnCod = _preDgnCod.trim();
        var currentData = item.cbyx.indexOf(_preDgnCod);
        var currentLetter = item.pysm.indexOf(_preDgnCod.toUpperCase());
        if (currentData === 0 || currentLetter === 0) {
          vm.cbyxSearchList.push(item)
        }
      }
    })
    if (vm.cbyxSearchList.length > 0) {
      $(".cbyxSearchList").show();
    } else {
      $(".cbyxSearchList").hide();
    }
  },
  chooseCbyx: function (idx) {
    var _currentCbyx = vm.cbyxSearchList[idx];
    vm.patientMsg.preDgnCod = _currentCbyx.cbyx;
    initCbyxVal(_currentCbyx);
    //重置待选列表
    vm.cbyxSearchList = [];
    $(".cbyxSearchList").hide();
    $("#cbyxParams").blur();
  },
  fallAssessByAge: function () {
    var _cstAge = vm.patientMsg.cstAge,
        _cstAgeCod = vm.patientMsg.cstAgeCod;
    if (_cstAge != '') {
      // 年龄小于2岁或者大于75岁的患者，跌倒评估自动选择步态不稳，默认高危。
      if (((_cstAge < 2 || _cstAge > 75) && _cstAgeCod === '0') || (_cstAge < 24 && _cstAgeCod == '1') || (_cstAge < 730 && _cstAgeCod == '2')) {
        vm.patientMsg.fallAssCod = '471';
      } else {
        // vm.patientMsg.fallAssCod = '';
      }
    }
  },
  setCurrentCk: function (flgName) {
    if (isJumpToSdzx == '2') {
      vm.patientMsg[flgName] = vm.patientMsg[flgName] == '1' ? '' : '1';
    } else {
      window.open(publicFun.getDictOption('SDZX_URL'));
    }
  },
  // setCurrentCk: function (className) {
  //   var _objName = '';
  //   if (className === 'xtlcflg') { // 胸痛
  //     _objName = 'xtFlg'
  //   } else {
  //     _objName = 'czFlag'
  //   }
  //   // 点击进入胸痛或卒中流程、基本信息下面的卒中和胸痛项目默认选中
  //   if (vm.patientMsg[className] == '0') {
  //     vm.patientMsg[className] = '1';
  //     vm.patientMsg[_objName] = '1';
  //   } else {
  //     // 修改页面 ---- 如果进入胸痛流程了，则提示“该患者已进入胸痛流程，无法取消”。
  //     // 点击保存后如果进入卒中流程了，则提示“该患者已进入卒中流程，无法取消”
  //     if (typeForm === 'edit') {
  //       var _alert_msg = '', url_str = '';
  //       if (className === 'xtlcflg') { // 胸痛
  //         _alert_msg = '该患者已进入胸痛流程，无法取消';
  //         url_str = 'hzszyyemg/checkXtlcAjax.do';
  //       } else { // 卒中
  //         _alert_msg = '该患者已进入卒中流程，无法取消';
  //         url_str = 'hzszyyemg/checkCzlcAjax.do';
  //       }
  //       publicFun.httpServer({url: _baseUrl + url_str, isAsync: false}, {
  //         emgSeq: _emgSeq,
  //         type: className
  //       }, function (res) {
  //         if (res.resultInfo.type == 1) {
  //           var _rtnFlg = res.resultInfo.sysdata.total;
  //           // 只要不是0 就是已经进入流程的， 则需要提示的
  //           if (_rtnFlg !== '0' && _rtnFlg !== 0) {
  //             publicFun.alert(_alert_msg)
  //             return;
  //           } else {
  //             vm.patientMsg[className] = '0';
  //           }
  //         }
  //       })
  //     } else {
  //       vm.patientMsg[className] = '0';
  //     }
  //   }
  // },
  getUlChildList: function (type) {
    $(".scroll-list-div").hide();
    cancelPop();
    autoDoFun();
    if (type === 'jwgfxCod') {
      vm.getMsg.dangerousCodList = JSON.parse(JSON.stringify(vm.getMsg['dangerousCodList' + vm.patientMsg.patientTyp]));
    }
    $("." + type + "-list-div").show();
    document.getElementsByClassName('scroll-div')[0].scrollTop = 0; // 滚动到顶部
    $('#' + type + 'Param').css({'box-shadow': '0px 0px 4px #3d85d0'})
  },
  changArrToStr: function (cod, idx) {
    var textStr = '';
    var codArr = vm.patientMsg[cod], list = vm.getMsg[cod + 'List'];
    if (cod == 'jwgfxCod') {
      list = JSON.parse(JSON.stringify(vm.getMsg['dangerousCodList' + vm.patientMsg.patientTyp]));
    }
    if (codArr.length > 0) {
      if (cod == 'jwgfxCod') {
        if (list[idx].info == '无') { // 危急值 --- 无
          textStr = '无'
          vm.patientMsg[cod] = [list[idx].infocode];
          vm.hideMsg[cod] = list[idx].infocode;
          $('#' + cod + 'Param').val(textStr)
          $('#' + cod + 'Param').text(textStr)
          $('.scroll-list-div').hide();
          $('.param-input').css({ 'box-shadow': 'none' })
          vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
          return
        } else {
          var _nullCod = '20';
          if (vm.patientMsg.patientTyp == '1') {
            _nullCod = '19'
          } else if (vm.patientMsg.patientTyp == '2') {
            _nullCod = '27'
          } else if (vm.patientMsg.patientTyp == '3') {
            _nullCod = '20'
          } else if (vm.patientMsg.patientTyp == '4') {
            _nullCod = '7'
          }
          var _isHasNoIdx = $.inArray(_nullCod, codArr);
          if (_isHasNoIdx > -1) {
            codArr.splice(_isHasNoIdx, 1);
          }
        }
      } else if (cod === 'cmpPsnCod') {
        var _isHasOtherIdx = $.inArray('8', codArr);
        if (_isHasOtherIdx < 0) {
          vm.patientMsg.psryqt = ''
          $('#psryqtQt').val('')
        }
      }
      vm.hideMsg[cod] = codArr.join(',')
      for (var i = 0; i < list.length; i++) {
        if (codArr.indexOf(list[i].infocode) != -1) {
          textStr += list[i].info + '；'
        }
      }
    } else {
      vm.hideMsg[cod] = '';
      if (cod === 'cmpPsnCod') {
        vm.patientMsg.psryqt = ''
        $('#psryqtQt').val('')
      }
    }
    if (cod === 'zjzzFlg') {
      if (vm.hideMsg[cod] === '0') { // 勾选了 0 无自觉
        vm.hideMsg.zjzzCod = '';
        vm.patientMsg.zjzzCod = [];
        $('#zjzzQt').val('')
        textStr = '无'
        $('#zjzzCodParam').val(textStr)
        $('#zjzzCodParam').text(textStr)
        $('.scroll-list-div').hide();
        $('.param-input').css({ 'box-shadow': 'none' })
      }
    } else if (cod === 'zjzzCod') {
      if (codArr.length > 0) {
        vm.hideMsg.zjzzFlg = '';
        vm.patientMsg.zjzzFlg = [];
      }
    }
    $('#' + cod + 'Param').val(textStr)
    $('#' + cod + 'Param').text(textStr)
    if (cod === 'ksfz' || cod === 'zjzzFlg' || cod === 'zjzzCod' || cod === 'jwgfxCod') {
      vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
    }
    // 修改不能拼接主述 因为文本框可能原来就有值，选了之后不能回到之前的状态去
    if (cod === 'ksfz') {
      var ck_list = JSON.parse(JSON.stringify(vm.patientMsg[cod]));
      if (vm.isEditPage != '1') {
        vm.patientMsg.preDgnCod = $('#ksfzParam').val();
      }
      if (($.inArray('234', ck_list) > -1) || ($.inArray('235', ck_list) > -1)) { // 选择快速分诊: 核酸检测/入所体检，病人去向 诊间就诊  就诊科室  急诊内科
        vm.patientMsg.emgFkCod = 'SD0001';
        vm.patientMsg.emgFkName = '急诊内科';
      } else if (($.inArray('236', ck_list) > -1) || ($.inArray('240', ck_list) > -1)) { // 选择快速分诊: 外伤，虫咬伤，默认诊间就诊，急诊外科
        vm.patientMsg.emgFkCod = 'SD0002';
        vm.patientMsg.emgFkName = '急诊外科';
      } else if (($.inArray('238', ck_list) > -1)) { // 选择快速分诊: 鱼刺，默认耳鼻喉科
        vm.patientMsg.emgFkCod = 'SD0009';
        vm.patientMsg.emgFkName = '急诊耳鼻喉';
      } else if ($.inArray('239', ck_list) > -1 || $.inArray('240', ck_list) > -1 || $.inArray('241', ck_list) > -1 || $.inArray('242', ck_list) > -1 || $.inArray('243', ck_list) > -1 || 
    		  $.inArray('244', ck_list) > -1 || $.inArray('245', ck_list) > -1 || $.inArray('246', ck_list) > -1 || $.inArray('247', ck_list) > -1 ){//  发热、干咳、乏力、鼻塞、流涕、咽痛、嗅味觉减退、结膜炎、肌痛、腹泻，默认勾选发热门诊
          vm.patientMsg.emgFkCod = 'SD0011';
          vm.patientMsg.emgFKName = '急诊发热门诊';
      }
      if (ck_list.length > 0) {
        vm.patientMsg.cstDspCod = '5';
      } else {
        vm.patientMsg.cstDspCod = '';
      }
    }
    return textStr
  },
  setOtherText: function (cod, otherIdName) {
    var textStr = vm.changArrToStr(cod);
    var _otherText = $('#' + otherIdName).val();
    if (cod === 'zjzzCod') {
      if (vm.hideMsg.zjzzFlg === '0') {
        if (!publicFun.checkItemNull(_otherText)) {
          vm.hideMsg.zjzzFlg = '';
          vm.patientMsg.zjzzFlg = [];
          $('#' + cod + 'Param').val('其他：' + _otherText)
        } else {
          $('#' + cod + 'Param').val('无')
        }
        return false
      }
    }
    if (!publicFun.checkItemNull(_otherText)) {
      if (cod === 'cmpPsnCod') {
        textStr = textStr.substring(0 ,textStr.length - 1) + '：' + _otherText
      } else {
        textStr = textStr + '其他：' + _otherText
      }
    }
    $('#' + cod + 'Param').val(textStr)
  },
  // 计算孕周 -- 整个孕期共为280天，10个妊娠月（每个妊娠月为28天）40周
  calcYz: function () {
    if (vm.patientMsg.mcyj) {
      var timeLapMins = new Date().getTime() - new Date(vm.patientMsg.mcyj).getTime();
      var allDays = parseInt(timeLapMins / (1000 * 60 * 60 * 24)); // 多少天
      var yzDay = '';
      if ((allDays % 7) !== 0) {
        yzDay = parseInt (allDays / 7) + '+' +  (allDays % 7);
      } else {
        yzDay = parseInt (allDays / 7)
      }
      vm.patientMsg.yz = yzDay;
    } else {
      vm.patientMsg.yz = '' // 末次月经为 yz为空处理
    }
  },
  setAlert: function (flg, index) {
    if (vm.patientMsg.modLvlCod !== '') {
      if (index !== '' && index == vm.patientMsg.modLvlCod) {
        $('.alert-edit-level').css({'left': vm.patientMsg.modLvlCod * 80 + 'px', top: '-120px'})
        vm.patientMsg.alert_flg = flg
      }
    }
  },
  setBsAlert: function (flg) {
    $('.alert-auto-level').css({'left': '50px', 'top': '-' + $('.alert-auto-level').height() + 'px'})
    commonFun.countFinalCod()
    vm.patientMsg.alert_auto_flg = flg
  }
});
/**
 * @监听性别
 */
vm.patientMsg.$watch('cstSexCod', function (newVal, oldVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  var cstSexCod = newVal,
    cstAge = vm.patientMsg.cstAge,
    cstAgeCod = vm.patientMsg.cstAgeCod;
  /**
   * @男性去除月经状态
   */
  if (cstSexCod === '0') {
    vm.patientMsg.mnsSitCod = '';
  }
  /**
   * @小于14岁的女孩，设置月经状态为空
   */
  if ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2') {
    vm.patientMsg.mnsSitCod = '';
  }
  /**
   * @大于60岁的女性，已绝经
   */
  if (cstSexCod === '1' && (cstAge >= 60 && cstAgeCod === '0')) {
    vm.patientMsg.mnsSitCod = '2';
  }
});

/**
 * @监听年龄
 * @计算分级
 */
vm.patientMsg.$watch('cstAge', function () {
  watchCstAge();
});

/**
 * @监听年龄类型
 * @计算分级
 */
vm.patientMsg.$watch('cstAgeCod', function () {
  watchCstAge();
});

/**
 * @监听女性月经史 清空怀孕周数
 */
vm.patientMsg.$watch('mnsSitCod', function (newVal, oldVal) {
  if (newVal != '1') {
    vm.patientMsg.caseHis = '';
  }
});
/**
 * @监听宫缩频率
 * @计算分级
 */
vm.patientMsg.$watch('pregnantGsplCod', function (newVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  var _patientType = vm.patientMsg.patientTyp, cod_list = vm.patientMsg.jwgfxCod;
  if (_patientType === '3') {
    if (newVal === '1') {
      // 危急征象指标默认选中 宫缩频率≤5 min 1次 : 16 
      judgeIsAddCompareCod(cod_list, '16')
    } else {
      var _idx = $.inArray('16', cod_list);
      if (_idx > -1) {
        cod_list.splice(_idx, 1);
        vm.patientMsg.jwgfxCod = JSON.parse(JSON.stringify(cod_list))
      }
    }
  }
});
/**
 * @监听阴道出血
 * @计算分级
 */
vm.patientMsg.$watch('pregnantYdcxCod', function (newVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  var _patientType = vm.patientMsg.patientTyp, cod_list = vm.patientMsg.jwgfxCod;
  if (_patientType === '3') {
    if (newVal === '1' || newVal === '2') {
      // 危机征象指标默认选中 阴道流血大于月经量或等于月经量或活动性出血 : 15
      judgeIsAddCompareCod(cod_list, '15')
    } else {
      var _idx = $.inArray('15', cod_list);
      if (_idx > -1) {
        cod_list.splice(_idx, 1);
        vm.patientMsg.jwgfxCod = JSON.parse(JSON.stringify(cod_list))
      }
    }
  } else if (_patientType === '4') {
    if (newVal === '1') {
      // 如果选择阴道出血大于月经量，则二级，危急征象指标为选中“阴道流血大于月经量” 阴道流血大于月经量 : 5。
      judgeIsAddCompareCod(cod_list, '5')
    } else {
      var _idx = $.inArray('5', cod_list);
      if (_idx > -1) {
        cod_list.splice(_idx, 1);
        vm.patientMsg.jwgfxCod = JSON.parse(JSON.stringify(cod_list))
      }
    }
  }
});
/**
 * @监听体温
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('tiw', function (newVal, oldVal) {
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听血压
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('sbpUpNbr', function (newVal, oldVal) {
  vm.aboutRems.sbpUpNbr = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.rtsTotSco = commonFun.countRtsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

vm.aboutMews.$watch('sbpDownNbr', function (newVal, oldVal) {
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听呼吸
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('huxipl', function (newVal, oldVal) {
  vm.aboutRems.huxipl = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  vm.patientMsg.rtsTotSco = commonFun.countRtsCount();
});

/**
 * @监听心率
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('mb', function (newVal, oldVal) {
  vm.aboutRems.mb = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听血氧饱和度
 * @计算分级
 */
vm.patientMsg.$watch('xueyang', function (newVal, oldVal) {
  vm.aboutRems.xueyang = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听清醒程度
 * 因为senRctCod牵涉到mews评分，所以也需触发一次监听来计算分级，这样可以避免联动监听。导致栈溢出
 */
vm.aboutMews.$watch('senRctCod', function (newVal, oldVal) {
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.synchroSenStuCod(newVal);
});

vm.patientMsg.$watch('senStuCod', function (newVal, oldVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.synchroSenStuCod(newVal);
});
/**
 * @监听疼痛等级
 * @计算分级
 */
vm.patientMsg.$watch('nrsSco', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听创伤标志
 * @计算分级
 */
vm.patientMsg.$watch('cspgFlg', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
vm.patientMsg.$watch('cspgCod', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听胸痛
 * @计算分级
 */
vm.patientMsg.$watch('xtFlg', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听卒中
 * @计算分级
 */
vm.patientMsg.$watch('czFlag', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听患者类型
 * @计算分级
 */
vm.patientMsg.$watch('patientTyp', function (newVal, oldVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  if (newVal === '2') {
    if (vm.isEditPage != '1') {
      vm.patientMsg.cstDspCod = '5';
      var _list = vm.getMsg.jzkscompctlList, _ekCod = '';
      for (var i = 0; i < _list.length; i++) {
        if (_list[i].comcname === '急诊儿科') {
          _ekCod = _list[i].comno
        }
      }
      vm.patientMsg.emgFkName = '急诊儿科';
      vm.patientMsg.emgFkCod = _ekCod;
    }
  } else {
    // 勾选了产科,末次月经可修改，修改后，孕周自动计算
    // 5. 就诊科室取消，勾选产科、妇科分诊到对应的科室，产科、妇科取消默认 date 2020/10/26
    if (newVal === '3') {
      vm.patientMsg.emgFkName = '急诊产科';
      vm.patientMsg.emgFkCod = '20502';
    } else if (newVal === '4') {
      vm.patientMsg.emgFkName = '急诊妇科';
      vm.patientMsg.emgFkCod = '20501';
    }
    if (vm.isEditPage != '1') {
      vm.patientMsg.cstDspCod = '';
      vm.patientMsg.emgFkName = '';
      vm.patientMsg.emgFkCod = '';
    }
  }
  vm.patientMsg.pregnantYdcxCod = '';
  vm.patientMsg.pregnantGsplCod = '';
  vm.patientMsg.jwgfxCod = []; // 清空 危急、高风险
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听pews
 * @计算分级
 */
vm.aboutPEWS.$watch('pewsSco', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

// 非高危下 跌倒措施清空
vm.patientMsg.$watch('fallAssCod', function (newVal, oldVal) {
  if (newVal == '#') { // 非高危
    vm.patientMsg.fallAssEssText = '非高危'
    vm.hideMsg.fdcsCod = '';
    vm.patientMsg.fdcsCod = [];
    $('#fdcsCodParam').val('')
  } else if (newVal !== '' && newVal != null) {
    vm.patientMsg.fallAssEssText = '高危'
  }
})

/**
 * @监听出生日期
 * @年龄
 */
vm.patientMsg.$watch('bthDat', function (newVal, oldVal) {
  if (newVal != '') {
    vm.patientMsg.cstAge = publicFun.calculateAge(newVal).Age;
    vm.patientMsg.cstAgeCod = publicFun.calculateAge(newVal).type;
  } else {
    vm.patientMsg.cstAge = "";
    vm.patientMsg.cstAgeCod = "0";
    vm.aboutRems.cstAge = '';
    vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  }
});

vm.patientMsg.$watch('emgFkCod', function (newVal, oldVal) {
  var _emgFk = newVal;
  if (_emgFk !== '') {
    vm.changeEmgFkCod();
  } else {
    vm.patientMsg.emgFkCod = ''; 
    vm.patientMsg.emgFkName = '';
  }
})
/**
 * @监听GCS评分
 */
vm.patientMsg.$watch('gcsTotSco', function (newVal, oldVal) {
  vm.aboutRems.gcsTotSco = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.rtsTotSco = commonFun.countRtsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
})
/**
 * @监听REMS评分
 */
vm.patientMsg.$watch('remsTotSco', function (newVal, oldVal) {
  if (newVal <= 11){
    vm.patientMsg.remsDeath = '10%'
  } else if(11< newVal && newVal < 16){
    vm.patientMsg.remsDeath = '10%-50%'
  } else if(newVal ==16 || newVal == 17){
    vm.patientMsg.remsDeath = '50%'
  } else if(17< newVal && newVal < 24){
    vm.patientMsg.remsDeath = '50%-100%'
  } else if(newVal >= 24){
    vm.patientMsg.remsDeath = '100%'
  }
})

// 修订分级
vm.patientMsg.$watch("modLvlCod", function (newVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  // 修订分级等于自动分级 或者修订分级的值为空的 => 清空修订理由
  if ((newVal == vm.patientMsg.chkLvlCod) || newVal == ''){
    vm.patientMsg.modLvlDes = '';
  }
  vm.patientMsg.emgDepCod = newVal
  vm.patientMsg.emgAreCod = commonFun.countEmgAreCod(newVal);
});
// 解决ie下select option 显隐藏不起作用
vm.patientMsg.$watch('cstDspCod', function (newVal, oldVal) {
  siteBedListItem();
})
// 解决ie下select option 显隐藏不起作用
vm.patientMsg.$watch('qtsjFlg', function (newVal, oldVal) {
  siteBedListItem();
})

function siteBedListItem () {
  var _strBed = '<option value=""></option>';
  if (vm.patientMsg.cstDspCod === '11' || vm.patientMsg.cstDspCod === '1') { // 11 290 留观室
    var _list = [];
    if (vm.patientMsg.qtsjFlg === '1') {
      _list = vm.getMsg.lgBedList.concat(vm.getMsg.lgBedTempList)
    } else {
      _list = vm.getMsg.lgBedList;
    }
    for (var i = 0; i < _list.length; i++) {
      _strBed += '<option class=\"bedOption lgInfo\" value=' + _list[i].bedid + '>' + _list[i].bedPlcNam + '</option>'
    }
  } else if (vm.patientMsg.cstDspCod === '6') { // 留抢
    var _list = [];
    if (vm.patientMsg.qtsjFlg === '1') {
      _list = vm.getMsg.emgBedList.concat(vm.getMsg.emgBedTempList)
    } else {
      _list = vm.getMsg.emgBedList;
    }
    for (var i = 0; i < _list.length; i++) {
      _strBed += '<option class=\"bedOption lgInfo\" value=' + _list[i].bedid + '>' + _list[i].bedPlcNam + '</option>'
    }
  }
  $('#bedId').html(_strBed);
  $('#bedId').val('');
  vm.patientMsg.bedid = '';
}
vm.patientMsg.$watch('preDgnCod', function (newVal, oldVal) {
  if (newVal === '') {
    $('#checkLevel').val('');
    $('#measure').html('');
    vm.patientMsg.chkLvlCod = commonFun.countFinalCod()
  } else {
    var _listLevel = vm.getMsg.totalCbyxList, noDictFlg = false;
    for (var i = 0; i < _listLevel.length; i++) {
      if (_listLevel[i].cbyx == publicFun.strTrim(newVal)) {
         noDictFlg = true
        initCbyxVal(_listLevel[i]);
      }
      if (new RegExp(/_listLevel[i].cbyx/).test(publicFun.strTrim(newVal)) == true) {
        noDictFlg = true
        initCbyxVal(_listLevel[i]);
      }
    }
    if (!noDictFlg && newVal == '') {
      $('#checkLevel').val('');
      $('#measure').html('');
      vm.patientMsg.chkLvlCod = commonFun.countFinalCod()
    }
  }
})
// 监听 危急、高风险
vm.patientMsg.jwgfxCod.$watch('$all', function (name, newVal, oldVal) {
  if (vm.isEditPage == '1') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  var codArr = JSON.parse(JSON.stringify(vm.patientMsg.jwgfxCod))
  if (codArr.length > 0) {
    vm.hideMsg.jwgfxCod = codArr.join(',')
  }
  var list = JSON.parse(JSON.stringify(vm.getMsg['dangerousCodList' + vm.patientMsg.patientTyp]));
  var textStr = '';
  if (codArr.length > 0) {
    for (var i = 0; i < list.length; i++) {
      if (codArr.indexOf(list[i].infocode) != -1) {
        textStr += list[i].info + '；'
      }
    }
  }
  $('#jwgfxCodParam').val(textStr)
  $('#jwgfxCodParam').text(textStr)
})

function fillInputText (type, ck_list) {
  var fill_str = '';
  var list = vm.getMsg[type + 'List'];
  if (type === 'jwgfxCod') {
    vm.getMsg.dangerousCodList = JSON.parse(JSON.stringify(vm.getMsg['dangerousCodList' + vm.patientMsg.patientTyp]));
    list = JSON.parse(JSON.stringify(vm.getMsg.dangerousCodList))
  }
  for (var i = 0; i < list.length; i++) {
    if ($.inArray(list[i].infocode, ck_list) > -1) {
      fill_str += list[i].info + '；'
    }
  }
  if (type === 'zjzzCod') {
    var _otherText = $('#zjzzQt').val();
    if (_otherText !== '' && _otherText != null) {
      fill_str += "其他：" + _otherText;
    } else {
      if (fill_str === '' || fill_str == null) {
        if (vm.patientMsg.zjzzFlg === '0') {
          fill_str = '无'
        }
      }
    }
  } else if (type === 'yjbzCod') {
    var _otherText = $('#remarkQt').val();
    if (_otherText !== '' && _otherText != null) {
      fill_str += "其他：" + _otherText;
    }
  }
  $('#' + type + 'Param').val(fill_str);
}

function enterWay () {
  /**
   * @回车优化
   * @author  ql
   */
  $("[name*='hspemginfCustom']").keypress(function (e) {
    if (e.which == 13) { // 判断所按是否回车键
      var inputs = $("form[name^='hspemginfCustom']").find(':text'); // 获取表单中的所有输入框
      var idx = inputs.index(this); // 获取当前焦点输入框所处的位置
      if (idx == inputs.length - 1) { // 判断是否是最后一个输入框
        return false;
      } else {
        inputs[idx + 1].focus(); // 设置焦点
        inputs[idx + 1].select(); // 选中文字
      }
      return false; // 取消默认的提交行为
    }
  });
  /**
   * @病历号 => 默认获取焦点
   * @author  ql
   */
  setTimeout(function () {
    $('#emg_vstCad').focus();
  });
}

function getKnowledgeList () {
  publicFun.httpServer({ url: _baseUrl + 'firstimp/queryZsk_result.do' }, {page: 1,rows: 20000}, function (res) {
    vm.getMsg.totalCbyxList = res.rows;
  })
}

function initCbyxVal (ele) {
  $('#checkLevel').val(ele.yjdj);
  if (ele.zbcs) {
    $('#measure').html('准备措施：' + ele.zbcs);
  }
  if (ele.fzks) {
    $('#emg_emgFkName').val(ele.fzksname);
    $('#emg_emgFkCod').val(ele.fzks);
  }
  if (ele.brqx) {
    vm.patientMsg.cstDspCod = ele.brqx;
  }
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
}
function isShowKnowledge () {
  if (_isOpenKnowledge === '1') {
    $('#knowledgeDiv').show();
    $('#searchWrapper').addClass('search-wrap')
  } else {
    $('#knowledgeDiv').hide();
    $('#searchWrapper').removeClass('search-wrap')
    $('#searchWrapper').css('position', 'relative')
  }
}
/**
 * @getAjaxInfoList  获取列表
 */
function getAjaxInfoList() {
  publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findEmgList_zyy.do', isAsync: false }, { _t: Date.parse(new Date()) }, function (res) {
    initDictList(res);
  });
  // vm.getAbnSco();
  // vm.getAbnDriver();
}

function initDictList (res) {
  var msgList = res.resultInfo.sysdata;
  jsbrjz = msgList;
  if (res.resultInfo.type == '1') {
    msgList.modLvlCodList = [{ infocode: '0', info: 'I级' }, { infocode: '1', info: 'II级' }, { infocode: '2', info: 'III级' }, { infocode: '3', info: 'IVa级' }, { infocode: '4', info: 'IVb级' }];
    // msgList.emgAreCodList = [{infocode: '0', info: '红区'}, {infocode: '1', info: '黄区'}, {infocode: '2', info: '绿区'}];
    $.each(msgList, function (key, val) {
      if (vm.getMsg.hasOwnProperty(key)) {
        if (key === 'bedplacecodList') {
          $.each(val, function (_idx, _val) {
            if (_val.bedPlace == '290') {
              vm.getMsg.lgBedList.push(_val);
            } else if (_val.bedPlace == '291') {
              vm.getMsg.emgBedList.push(_val);
            } else if (_val.bedPlace == '2900') { // 临时床位
              vm.getMsg.lgBedTempList.push(_val);
            } else if (_val.bedPlace == '2911') {
              vm.getMsg.emgBedTempList.push(_val);
            }
          })
        }
        var _checkedList = ['cstSexCodList', 'ksfzList', 'arvChlCodList', 'cstDspCodList', 'jzkscompctlList','senStuCodList', 'senRctCodList', 'chkLvlCodList', 'modLvlCodList', 'frCodList', 'mnsSitCodList', 'emgAreCodList', 'algTypCodList', 'cmpPsnCodList', 'pastHisCodList', 'refusedSurveyList'];
        if ($.inArray(key, _checkedList) > -1) {
          $.each(val, function (_idx, _val) {
            _val.checked = false
          })
        }
        vm.getMsg[key] = val;
      }
    });
  }
}

// 取消
function hideCurrent (id) {
  cancelPop();
  $('.scroll-list-div').hide();
  $('#' + id).css({'box-shadow': 'none'})
}

function cancelPop () {
  if (window.event) {
    if (window.event.stopPropagation) { //非IE 
      window.event.stopPropagation(); // 取消冒泡事件
    } else { //IE 
      window.event.cancelBubble = true;
    }
  }
}

function judgeIsAddCompareCod (ck_list, compare_cod) {
  if (ck_list.indexOf(compare_cod) < 0) {
    var _nullCod = '20';
    if (vm.patientMsg.patientTyp == '1') {
      _nullCod = '19'
    } else if (vm.patientMsg.patientTyp == '2') {
      _nullCod = '27'
    } else if (vm.patientMsg.patientTyp == '3') {
      _nullCod = '20'
    } else if (vm.patientMsg.patientTyp == '4') {
      _nullCod = '7'
    }
    var _isNullCod = $.inArray(_nullCod, ck_list);
    if(_isNullCod > -1){
    	ck_list.splice(_isNullCod, 1)
    }
    ck_list = ck_list.push(compare_cod)
    vm.patientMsg.jwgfxCod = JSON.parse(JSON.stringify(ck_list))
  }
}

// 年龄监听 公用方法
function watchCstAge () {
  var cstSexCod = vm.patientMsg.cstSexCod,
    cstAge = vm.patientMsg.cstAge,
    cstAgeCod = vm.patientMsg.cstAgeCod;
  var ageNameList = vm.getMsg.cstAgeCodList, ageName = '';
  for (var i = 0; i < ageNameList.length; i++) {
    if (ageNameList[i].infocode == cstAgeCod) {
      ageName = ageNameList[i].info
    }
  }
  if (cstAge !== '' && cstAge != null) {
    vm.patientMsg.showAge = cstAge + ageName
  }
  if (vm.isEditPage == '1') {
    if (cstAge >= 14 && cstAgeCod === '0') {
      vm.aboutRems.cstAge = vm.patientMsg.cstAge;
      vm.patientMsg.remsTotSco = commonFun.countRemsCount();
    }
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  /**
   * @若年龄大于14岁，则患者类别默认为成人 如果小于14岁默认为儿童
   */
  vm.calcPatType();
  /**
   * @计算分级
   */
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  /**
   * @小于14岁的女孩，设置月经状态为空
   */
  if ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2') {
    vm.patientMsg.mnsSitCod = '';
  }
  /**
   * @大于60岁的女性，已绝经
   */
  if (cstSexCod === '1' && (cstAge >= 60 && cstAgeCod === '0')) {
    vm.patientMsg.mnsSitCod = '2';
  }
  if ((cstAge >= 14 && cstAgeCod === '0') || cstAge == '') {
    vm.aboutRems.cstAge = cstAge;
    vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  }
}

/**
 * @getChildPfMsg 获取RTS评分信息
 */
function getChildPfMsg () {
  publicFun.httpServer({url: _baseUrl + 'scoreManagement/queryScoreList.do' }, {
    'hspPfglInfCustom.emgSeq': _emgSeq,
    'hspPfglInfCustom.pflySeq': _emgSeq,
    'hspPfglInfCustom.pflyCode': '0'
  }, function(data){
    if (data.resultInfo.type == '1') {
      var list = data.rows;
      for (var i = 0; i < list.length; i++) {
        if(list[i].pftype == '11'){
          vm.patientMsg.pfManager = [list[i]];
          vm.patientMsg.rtsTotSco = list[i].pfjg;
          break;
        }
      }
    } else {
      message_alert(data)
    }            
  });    
}

/**
 * RTS评分的保存方法
 */
function saveRtsMsg () {
  var parentList = [];
  var _pfglSeq = '', pfDat = new Date().getTime(),  _pflySeq = '';     
  if (vm.isEditPage != '1'){ // 当新增时 评分查询 关联号放空 
    _pflySeq = ''
  } else if (vm.isEditPage == '1'){
    _pflySeq = _emgSeq
    parentList = JSON.parse(JSON.stringify(vm.patientMsg.pfManager))
    for (var i = 0; i < parentList.length; i++){
      if (parentList[i].pftype == '11'){
        _pfglSeq = parentList[i].pfglSeq;
        break;
      }
    }
  }
  var postScoMsg = {
    gcsTotSco: vm.patientMsg.gcsTotSco,
    sbpUpNbr: vm.aboutMews.sbpUpNbr,
    huxipl: vm.aboutMews.huxipl,
    rtsTotSco: vm.patientMsg.rtsTotSco
  }
  var curItem = {
    emgSeq: _emgSeq,  //预检号
    parentPk: _pflySeq,  //父PK（新增时为空）
    pfDat: pfDat,  //时间戳		评分时间
    pfglSeq: _pfglSeq,  //评分管理Seq（新增时为空）
    pfjg: vm.patientMsg.rtsTotSco,  //评分结果
    pflrly: 'PC',  //评分录入来源
    pflyCode: '0', //评分来源COD（0：来自于 预检登记）
    pflySeq: _pflySeq, //评分来源的Seq
    pfnr: JSON.stringify(postScoMsg), // 评分内容JSON
    pftype: '11',  //评分类型（11：RTS评分）
    qtjg: '', //其他结果
    saveType: '0'  //保存类型（0：来自于 预检登记）
  };
  publicFun.httpServer({url: _baseUrl + 'scoreManagement/editScoreChild.do', requestDataType: 'json', isAsync: false}, {
    hspPfglInfCustom: curItem
  }, function (res) {
    var rtn_pfglSeq = res.resultInfo.sysdata.pfglSeq;
    if (parentList.length == 0) {
      curItem.pfglSeq = rtn_pfglSeq;
      parentList.push(curItem)
    }
    parentList.forEach(function (item, index) {
      if (item.pftype == '11') {
        item.pfglSeq = rtn_pfglSeq
        item.parentPk = _emgSeq
        item.pfDat = pfDat
        item.pflySeq = _pflySeq
        item.pflyCode = '0'
        item.saveType = '0'
        item.pfjg = vm.patientMsg.rtsTotSco
        item.pfnr = JSON.stringify(postScoMsg)
        item.pflrly = 'PC'
      }
    })
    for(var k in parentList){
      vm.patientMsg.pfManager[k] = parentList[k]
    }
  })
  return parentList
}


// 生命体征采集 
function setEmgSeq () {
  var url = "http://localhost:8848/ReadTPRB";
  jQuery.support.cors = true;
  $.ajax({
    url: url,
    type: "get",
    dataType: "jsonp",
    jsonp: "callback",
    jsonpCallback:"jsonp9578",
    contentType:'application/json; charset=utf-8',
    success: function (dataObj) {
      if (dataObj[0].ret == '0') {
        vm.aboutMews.sbpUpNbr = dataObj[0].NIBP_S;// 血压上压
        vm.aboutMews.sbpDownNbr = dataObj[0].NIBP_D;// 血压下压
        vm.aboutMews.mb = dataObj[0].PR;// 心率
        vm.patientMsg.xueyang = dataObj[0].SPO2;
      } else if (dataObj[0].ret == '-1') {
        publicFun.alert('监护仪URL错误,请检查！');
      } else if (dataObj[0].ret == '-2') {
        publicFun.alert('缺少配置文件ReadMindray.ini！')
        // _confirm('缺少配置文件ReadMindray.ini！', null, function () {
        // 	setReadOMLData();
        // });
      } else if (dataObj[0].ret == '-3') {
        publicFun.alert('缺少配置文件中指定的迈瑞数据文件！')
        // _confirm('缺少配置文件中指定的迈瑞数据文件！', null, function () {
        // 	setReadOMLData();
        // });
      } else {
        publicFun.alert('监护仪数据读取失败，请联系管理员!');
      }
    },
    error: function (error) {
      publicFun.alert('监护仪数据读取失败，请重新登录或检查网络');
    }
  });
}

