var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
var _hlbzCodList = publicFun.getDict('HLBZ_COD'),
    _szCodList = publicFun.getDict('SEN_STU_COD'),
    _clbzCodList = publicFun.getDict('CLBZ_COD'),
    _gmsTypeList = publicFun.getDict('ALG_TYP_COD'),
    _arvChlCodList = publicFun.getDict('ARV_CHL_COD'),
    _cmpPsnCodList = publicFun.getDict('CMP_PSN_COD'),
    _glsCodList = publicFun.getDict('XT_COD');
$.each(_arvChlCodList,function(index,val){
  val.checked = false
})
var twoCheckList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }],
  qdList = [{ checked: false, infocode: '0', info: '通畅' }, { checked: false, infocode: '1', info: '阻塞' }, { checked: false, infocode: '2', info: '部分阻塞' }],
  hxList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '费力' }, { checked: false, infocode: '2', info: '困难' }, { checked: false, infocode: '3', info: '气促' }, { checked: false, infocode: '4', info: '表浅' }, { checked: false, infocode: '5', info: '无呼吸' }],
  xhList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '弱' }, { checked: false, infocode: '2', info: '有脉搏' }, { checked: false, infocode: '3', info: '桡A搏动' }, { checked: false, infocode: '4', info: '颈A搏动' }, { checked: false, infocode: '5', info: '无心搏' }],
  cxList = [{ checked: false, infocode: '1', info: '无' }, { checked: false, infocode: '0', info: '有' }, { checked: false, infocode: '2', info: '呕血' }, { checked: false, infocode: '3', info: '咯血' }, { checked: false, infocode: '4', info: '便血' }],
  nsList = [{ checked: false, infocode: '0', info: '有反应' }, { checked: false, infocode: '1', info: '无反应' }],
  nsDaList = [{ checked: false, infocode: '0', info: '对答切题' }, { checked: false, infocode: '1', info: '对答不切题' }],
  nsTtList = [{ checked: false, infocode: '0', info: '对疼痛刺激有反应' }, { checked: false, infocode: '1', info: '对疼痛刺激无反应' }],
  nsThList = [{ checked: false, infocode: '0', info: '截瘫' }, { checked: false, infocode: '1', info: '偏瘫' }],
  NSEList = [{ checked: false, infocode: '0', info: '左' }, { checked: false, infocode: '1', info: '右' }],
  tkCodList = [{ checked: false, infocode: '0', info: '灵敏' }, { checked: false, infocode: '1', info: '迟钝' }, { checked: false, infocode: '2', info: '消失' }, { checked: false, infocode: '3', info: '白内障' }, { checked: false, infocode: '4', info: '眼球缺失' }],
  pfList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '湿冷' }, { checked: false, infocode: '2', info: '苍白' }, { checked: false, infocode: '3', info: '潮红' }, { checked: false, infocode: '4', info: '出汗' }, { checked: false, infocode: '5', info: '紫绀' }, { checked: false, infocode: '6', info: '黄染' }, { checked: false, infocode: '7', info: '皮疹' }, { checked: false, infocode: '8', info: '瘀斑' }, { checked: false, infocode: '9', info: '压力性损伤' },{ checked: false, infocode: '11', info: '破损' }],
  fbddList = [{ checked: false, infocode: '0', info: '居住地' }, { checked: false, infocode: '1', info: '单位' }, { checked: false, infocode: '2', info: '途中' }, { checked: false, infocode: '3', info: '其他' }],
  szList = [{ checked: false, infocode: '0', info: '清楚' }, { checked: false, infocode: '1', info: '嗜睡' }, { checked: false, infocode: '2', info: '昏睡' }, { checked: false, infocode: '3', info: '深昏迷' },{ checked: false, infocode: '4', info: '浅昏迷' },{ checked: false, infocode: '5', info: '醉酒' },{ checked: false, infocode: '6', info: '痴呆' },{ checked: false, infocode: '7', info: '镇静' },{ checked: false, infocode: '8', info: '谵妄' },{ checked: false, infocode: '9', info: '麻醉' }],
  wcdList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '恶心' }, { checked: false, infocode: '2', info: '呕吐' }, { checked: false, infocode: '3', info: '嗳气' },{ checked: false, infocode: '4', info: '反酸' },{ checked: false, infocode: '5', info: '腹泻' }],
  ttList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '急性' }, { checked: false, infocode: '2', info: '慢性' }, { checked: false, infocode: '3', info: '阵发性' },{ checked: false, infocode: '4', info: '放射性' }],
  szydList = [{ checked: false, infocode: '0', info: '自如' }, { checked: false, infocode: '1', info: '障碍' }, { checked: false, infocode: '2', info: '偏瘫' }, { checked: false, infocode: '3', info: '截瘫' }],
  hisList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '不详' }, { checked: false, infocode: '2', info: '有' }];

var sub = avalon.define({
  $id: 'queryhlpgb',
  //获取后台配置列表
  hlpgbmsgList: {
    qdCodList: qdList, // 气道
    hxCodList: hxList, //呼吸
    xhCodList: xhList, //循环
    cxCodList: cxList, //出血
    nsCodList: nsList, //NS反应
    nsDaqtList: nsDaList, //NS对答切题
    nsTtcjList: nsTtList, //NS疼痛刺激反应
    nsThztList: nsThList, //NS瘫痪状态
    nsptzyList: NSEList, //NS偏瘫左右
    tkLeftCodList: tkCodList, //瞳孔左状态
    tkRightCodList: tkCodList, //瞳孔右状态
    pfCodList: pfList, //皮肤状态
    qkCodList: twoCheckList, //欠款
    hlAddrList: fbddList, //发病地点
    // senStuCodList: [], //神志
    fbCodList: [{ infocode: '1', info: '无明显异常' }, { infocode: '2', info: '腹痛' }, { infocode: '3', info: '腹胀' }, { infocode: '4', info: '肌紧张' },
      { infocode: '5', info: '压痛' }, { infocode: '6', info: '反跳痛' }, { infocode: '7', info: '有肠鸣音' }, { infocode: '8', info: '肠鸣音消失' }],
    clbzCodList: _clbzCodList, // 处理步骤
    // sqlStaCodList: [],//转归状态
    szCodList:_szCodList,
    wcdCodList:wcdList,
    ttCodList:ttList,
    szydCodList:szydList,
    jbsCodList:hisList,
    sssCodList:hisList,
    gmsCodList:hisList,
    gmsTypeList:_gmsTypeList,
    hlbzCodList:_hlbzCodList,
    arvChlCodList:_arvChlCodList,
    cmpPsnCodList:_cmpPsnCodList,
    glsCodList:_glsCodList,
    abnDriverList:[],//驾驶员列表
  },
  hlpgbpatientMsg: {
    //////////////////////////////////////  hspemginfCustom
    emgSeq: _emgSeq, //预检号
    cstNam: '', // 姓名
    vstCad: '', // 卡号
    cstSexCod: '', // 性别
    cstAge: '', // 年龄
    cstAgeCod: '岁', // 年龄
    arvChlCod: '', // 到院方式
    cmpPsnCod: [], // 陪送人员
    oprDat: today, //日期
    cstAdr: '', //单位/地址
    emgDat: '', //就诊时间
    emgFkCod: '', //首诊科室
    jbzdDes: '', //入院诊断
    preDgnCod:'',//主诉症状
    cstDspCod: '', //去向
    ////////////////////////////////////// hspHlpgbCustom
    qdCod: '', //气道状态
    qdOther: '', //气道其它
    hxCod: '', //呼吸状态
    hxOther: '', //呼吸其它
    xhCod: '', //循环状态
    cxCod: [], //出血状态
    cxQtbw: '', //出血其他部位
    nsCod: '', //NS反应
    nsDaqt: '', //NS对答切题
    nsTtcj: '', //NS疼痛刺激反应
    nsThzt: '', //瘫痪状态
    nsptzy: '', //NS偏瘫左右
    nsThztDes: '', //瘫痪描述
    tkLeft: '', //瞳孔左
    tkLeftCod: '', //瞳孔左状态
    tkRight: '', //瞳孔右
    tkRightCod: '', //瞳孔右状态
    fbFc: '', //腹部腹穿 0：无，1：有
    fbFcDes: '', //腹穿情况
    fbOther: '', //腹部其它
    pfCod: [], //皮肤状态
    pfFw: '', //皮肤范围 0：无，1：有
    pfFwDes: '', //范围描述
    fbCod: [], // 腹部值
    clbzCod: [], // 处理步骤
    qtQmsRs: '', //青霉素结果
    qtQmsDat: '', //青霉素时间
    qtTatRs: '', //TAT结果
    qtTatDat: '', //TAT时间
    qtObj1Nam: '', //项目1
    qtObj1Rs: '', //备用1结果
    qtObj1Dat: '', //备用1时间
    qtObj2Nam: '', //项目2
    qtObj2Rs: '', //备用2结果
    qtObj2Dat: '', //备用2时间
    hlAddr: '', //发病地点
    jjlxNam: '', //紧急联系人姓名
    jjlxTel: '', //紧急联系人电话
    jjlxNam2: '', //紧急联系人2姓名
    jjlxTel2: '', //紧急联系人2电话
    qkCod: '', //有无欠款
    // qxBf: '', //病房
    // qxZyh: '', //住院号
    preAssNam: _cstNam, //评估者签名
    // qtNam: _cstNam, //皮试签名
    //caseHis: '', //过敏史
    sqlStaStr:'',
    sqlStaCod: '',//转归去向
    sqlDat: '',//转归日期
    pbgNbr: '', //末梢血糖
    sqlDepCod: '',//转归科室
    sqlDepName: '', // 转归科室
    sqlDes: '', //转归说明（转院）
    sqlSeq: '',//转归id
    firstsqlseq:'',
    bedNam:'',
    
    sbpdownNbr: '', //血压下压
    sbpupNbr: '', //血压上压
    tmpNbr: '', //体温
    hrtRte: '', //心率
    breNbr: '', //呼吸
    sbpNbr: '', //血压
    oxyNbr: '', //SpO2
    senStuCod: '', //神志
    pgbFlag: '',//是否完成
    zsFlag: '',//是否显示大字段
    preAssStr: '',//评估者签名name
    // qtNamStr: '',//签名name
    memo: '', // 备注
    tkLeftOther: '',// 左瞳孔其他
    tkRightOther: '',// 右瞳孔其他
    dataBarFlg: false,//判断大字段是否生成
    symSitDes: '' ,//主述症状
    // pgbMsg:'',

    
    szCod:[],
    wcdCod:[],
    ttCod:[],
    szydCod:[],
    jbsCod:'',
    sssCod:'',
    gmsCod:'',

    szOther:'',
    wcdOther:'',
    ttBw:'',
    szydOther:'',
    jbsDes:'',
    sssDes:'',
    gmsDes:'',
    gmsType:[],
    hlAddrOther:'',
    hlbzOther:'',
    hlbzCod:[],
    clbzOther:'',
    xyDes:'',

    workAddress:'',//单位地址
    informDocDat: '',
    sqlDctNbr:'',
    preHospitalTreatment:'',
    assessmentDat:'',
    docDat:'',
    
    tmpNbr:'',
    breNbr:'',
    sbpUpNbr:'',
    sbpDownNbr:'',
    oxyNbr:'',
    hrtRte:'',
    pbgNbr:'',
    glsCod:'',
    pbgNbrFlg:'',

    tmpNbrFlg:'',
    breNbrFlg:'',
    sbpNbrFlg:'',
    xyFlg:'',
    pulse:'',
    abnScoNme:'',
    abnDriver:'',
    abnDoctor:'',
    psryqt:'',
    seeDocDat:'',
    hrtRteFlg:'',
    pulseFlg:'',
    ylxssDes: '' // 压力性损伤输入框
  },
  hlpgbhideMsg: {
    cxCod: '',//出血Str
    pfCod: '', //皮肤状态Str
    clbzCod: '',
    fbCod: '',

    szCod:'',
    wcdCod:'',
    ttCod:'',
    szydCod:'',
    gmsType:'',
    hlbzCod:'',
    cmpPsnCod:''
  },
  aboutSco: {
    bradenSeq: '',
    fallriskSeq: '',
    adlSeq: '',
    // falldSeq: '',
    zcddexpfSco: '',
    bradenSco: null,
    fallriskSco: null,
    adlSco: null,
    nrsSco: null,
    nrsSeq: '',
    ttpfNr: null, // 疼痛内容
    ttpfTypeCod: null, // 疼痛类型
    zyfxpfSeq: '',
    zyfxpfSco: null, // 转运风险评分
    gcsSco:null,
    gcsSeq:'',
    morseSco:null,
    ddfxpgbSeq:''
  },
  basicInfo:{
    cstNam:'',
    cstSexCod:'',
    cstAgeAll:'',
    cstAge:'',
    mpi:'',
    oprDat:'',
    emgDat:'',
    emgFkCod:'急诊科',
    pheNbr:'',
  },
  printMsg:{
    tmpNbrFlgStr:'',
    breNbrFlgStr:'',
    pbgNbrFlgStr:'',
    sbpNbrFlgStr:'',
    xyFlgStr:'',
    glsCodStr:'',
    pulseFlgStr:'',
    hrtRteFlgStr:''
  },
  isShowAbnScoList: false,
  isShowAbnDriverList: false,
  isShowGmsType:false,
  isShowStressText: false, // 是否显示压力性损伤输入框
  hlpgbradioclick: function (name, idx) {
    sub.hlpgbpatientMsg[name] = publicFun.radioClicks(sub.hlpgbmsgList[name + 'List'], sub.hlpgbpatientMsg[name], idx)
  },
  arrToStr: function (objName) {
    if (sub.hlpgbpatientMsg[objName].$model.length > 0) {
      sub.hlpgbhideMsg[objName] = sub.hlpgbpatientMsg[objName].$model.join(',');
    } else {
      sub.hlpgbhideMsg[objName] = ''
    }
    if (objName == 'pfCod') {
      if ($.inArray('9', sub.hlpgbpatientMsg[objName].$model) > -1) { // 压力性创伤
        sub.isShowStressText = true;
      } else {
        sub.isShowStressText = false;
        sub.hlpgbpatientMsg.ylxssDes = ''
      }
    }
  },
  hlpgbonlyNum: function (attr, step, max) { //限定只能输入数字
    sub.hlpgbpatientMsg[attr] = publicFun.onlyNumber(sub.hlpgbpatientMsg[attr], step, max)
  },
  toggleHspFzjcCustom: function (name) {
    sub.hlpgbpatientMsg[name] = sub.hlpgbpatientMsg[name] == 1 ? "" : 1;
  },
  openBrdSco: function () {
    createmodalwindow('Braden评分', 800, 410, _baseUrl + 'hlpgb/toBradenSco.do')
  },
  // openFallSco: function () {
  //   var cstAges = parseInt(sub.hlpgbpatientMsg.cstAge);
  //   var cstAgecodes = sub.hlpgbpatientMsg.cstAgeCod === '' ? '岁' : sub.hlpgbpatientMsg.cstAgeCod;
  //   var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
  //   var _tabHeight = _bdHeight - 30;
  //   if (_bdHeight > 710) {
  //     _tabHeight = 710;
  //   }
  //   if (sub.aboutSco.falldSeq == '' || sub.aboutSco.falldSeq == null) {
  //     if ((cstAgecodes != '岁' && cstAgecodes != '') || (cstAgecodes == '岁' && cstAges < 14)) {
  //       createmodalwindow('儿童坠床跌倒评分', 800, _tabHeight, _baseUrl + 'hlpgb/queryfallOutChild.do')
  //     } else {
  //       createmodalwindow('坠床跌倒评分', 800, _tabHeight, _baseUrl + 'hlpgb/queryfallOutBedSco.do')
  //     }
  //   } else {
  //     createmodalwindow('坠床跌倒评分', 800, 430, _baseUrl + 'hlpgb/toFallOutBedSco.do')
  //   }
  // },
  openAdlSco: function () {
    var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
    var _tabHeight = _bdHeight - 30;
    if (_bdHeight > 600) {
      _tabHeight = 600;
    }
    createmodalwindow('ADL评分', 700, _tabHeight, _baseUrl + 'hlpgb/toAdlSco.do')
  },
  openZyfxSco: function () {
    var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
    var _tabHeight = _bdHeight - 30;
    if (_bdHeight > 610) {
      _tabHeight = 610;
    }
    createmodalwindow('安全转运风险评估单', 800, _tabHeight, _baseUrl + 'hlpgb/toZyfxpfSco.do')
  },
  openNRSSco: function () {
    createmodalwindow('疼痛评分', 700, 540, _baseUrl + 'scorequery/toNrsGde.do?typeSource=hlpgb')
  },
  openGCSSco:function(){
    createmodalwindow('GCS评分', 500, 490, _baseUrl + 'hlpgb/toGcsSco.do?emgSeq='+_emgSeq)
  },
  openMorse:function(){
    createmodalwindow('Morse评分', 800, 500, _baseUrl + 'hzszyyemg/queryMorse.do?typeSource=hlpgb')
  },
  /**
   * @单击清空送入来源
   */
  cleanAbnSco: function () {
    sub.isShowAbnScoList = false;
    sub.isShowAbnDriverList = false;
  },
  /**
   * @获取送入来源列表
   */
  getAbnDriver: function (name) {
    var getAbnDriverUrl = _baseUrl + 'hzszyyemg/findAbnDriverList.do';
    publicFun.httpServer({ url: getAbnDriverUrl }, { abnDriver: name }, function (res) {
      sub.hlpgbmsgList.abnDriverList = res.rows;
    })
  },
  /**
   * @选择某个送入来源
   */
  chooseAbnDriver: function (abnDriver) {
    sub.hlpgbpatientMsg.abnDriver = abnDriver;
    $('#driverName').val(abnDriver);
    sub.isShowAbnDriverList = false;
  },
  cleanSqlText: function () {
    sub.isShowDocList = false;
  },
});

$(function () {
  $("input[name='hspemginfCustom.emgSeq']").val(comdata.emgSeq);
  $("input[name='hspHlpgbCustom.emgSeq']").val(comdata.emgSeq);
  getMsgList();
  sub.getAbnDriver();
})

sub.hlpgbpatientMsg.$watch('arvChlCod', function (newVal, oldVal) {
  if (newVal != '5') {
    sub.hlpgbpatientMsg.abnDriver = '';
    sub.hlpgbpatientMsg.abnDoctor = '';
  }
  if(newVal != '9'){
    sub.hlpgbpatientMsg.abnScoNme = '';
  }
});
sub.hlpgbhideMsg.$watch('cmpPsnCod', function (newVal, oldVal) {
  if (newVal.indexOf('8') == -1) {
    sub.hlpgbpatientMsg.psryqt = ''
  }
});

sub.hlpgbpatientMsg.$watch('sbpNbrFlg', function (newVal, oldVal) {
  if (newVal == '2' || newVal == '3') {
    sub.hlpgbpatientMsg.sbpUpNbr = '';
    sub.hlpgbpatientMsg.sbpDownNbr = '';
  }
});

sub.hlpgbpatientMsg.$watch('tmpNbrFlg', function (newVal, oldVal) {
  if (newVal == '2' || newVal == '3') {
    sub.hlpgbpatientMsg.tmpNbr = '';
  }
});

sub.hlpgbpatientMsg.$watch('breNbrFlg', function (newVal, oldVal) {
  if (newVal == '3') {
    sub.hlpgbpatientMsg.breNbr = '';
  }
});

sub.hlpgbpatientMsg.$watch('xyFlg', function (newVal, oldVal) {
  if (newVal == '2' || newVal == '3') {
    sub.hlpgbpatientMsg.oxyNbr = '';
  }
});

sub.hlpgbpatientMsg.$watch('hrtRteFlg', function (newVal, oldVal) {
  if (newVal == '2' || newVal == '3') {
    sub.hlpgbpatientMsg.hrtRte = '';
  }
});

sub.hlpgbpatientMsg.$watch('pulseFlg', function (newVal, oldVal) {
  if (newVal == '2' || newVal == '3') {
    sub.hlpgbpatientMsg.pulse = '';
  }
});

sub.hlpgbpatientMsg.$watch('pbgNbrFlg', function (newVal, oldVal) {
  if (newVal == '2' || newVal == '3' || newVal == '4') {
    sub.hlpgbpatientMsg.pbgNbr = '';
  }
});

sub.hlpgbpatientMsg.$watch('gmsCod', function (newVal, oldVal) {
  if (newVal != '2') {
    sub.hlpgbpatientMsg.gmsDes = '';
    sub.hlpgbpatientMsg.gmsType = [];
  }
});
/**
 * 监听发病地点
 */
sub.hlpgbpatientMsg.$watch('hlAddr', function (newVal, oldVal) {
  if (newVal != '3') {
    sub.hlpgbpatientMsg.hlAddrOther = ''
  }
});

/**
 * @过敏项目监听
 */
sub.hlpgbpatientMsg.gmsType.$watch('$all', function (name, newVal, oldVal) {
  var numTest = /^\+?[0-9]*$/;
  var gmsType,
    gmsTypeList = sub.hlpgbmsgList.gmsTypeList,
    innerText = [];
  if (numTest.test(newVal)) {
    gmsType = sub.hlpgbpatientMsg.gmsType.$model;
    sub.hlpgbhideMsg.gmsType = gmsType.join();
    $.each(gmsTypeList, function (idx, val) {
      if ($.inArray(val['infocode'], gmsType) > -1) {
        innerText.push(val['info']);
      }
    });
    if ($.inArray('6', gmsType) > -1) {
      sub.isShowGmsType = true;
    } else {
      sub.isShowGmsType = false;
      sub.hlpgbpatientMsg.gmsDes = '';
    }
  }
  if (newVal != '') {
    sub.hlpgbpatientMsg.gmsCod = '2';
  }
});

sub.hlpgbpatientMsg.$watch('sssCod', function (newVal, oldVal) {
  if (newVal != '2') {
    sub.hlpgbpatientMsg.sssDes = ''
  }
});
sub.hlpgbpatientMsg.$watch('sssDes', function (newVal, oldVal) {
  if (newVal != '') {
    sub.hlpgbpatientMsg.sssCod = '2';
    $.each(sub.hlpgbmsgList.sssCodList, function (idx, val) {
      if(val['infocode'] == 2){
        val['checked'] = true
      }else{
        val['checked'] = false
      }
    });
  }
});

sub.hlpgbpatientMsg.$watch('jbsCod', function (newVal, oldVal) {
  if (newVal != '2') {
    sub.hlpgbpatientMsg.jbsDes = ''
  }
});
sub.hlpgbpatientMsg.$watch('jbsDes', function (newVal, oldVal) {
  if (newVal != '') {
    sub.hlpgbpatientMsg.jbsCod = '2';
    $.each(sub.hlpgbmsgList.jbsCodList, function (idx, val) {
      if(val['infocode'] == 2){
        val['checked'] = true
      }else{
        val['checked'] = false
      }
    });
  }
});
// 转归登记
function outComeInfo() {
  var openModalWindowName = sub.basicInfo.cstNam + '-转归登记',
    openModalWindowUrl =  _baseUrl + 'zyyqjs/querylqxxdjzyy.do?emgSeq=' + _emgSeq;
  createmodalwindow(openModalWindowName, 950, 500, openModalWindowUrl);
}
// 转归记录
function zginfo() {
  createmodalwindow(sub.basicInfo.cstNam + "-转归记录", 870, 500,  _baseUrl + 'hzszyyemg/queryzginfo.do', 'no');
}


function addSmtz(){
  createmodalwindow(sub.basicInfo.cstNam + "-生命体征", 800, 500, _baseUrl + 'hlpgb/to_vitalSigns.do')
}

/**
 * @ 获取数据并赋值
 */
function getMsgList() {
  var getMsgUrl = _baseUrl + 'hlpgb/queryhlpgb_result.do';
  $('#_bedNum').html(parent.parent.$('#bedNum').html());
  publicFun.httpServer({ url: getMsgUrl }, { emgSeq: _emgSeq }, function (res) {
    for (var key in res) {
      if (sub.hlpgbmsgList.hasOwnProperty(key)) {
        sub.hlpgbmsgList[key] = res[key]
      }
    }
    // if (res['hspHlpgbCustom']['pgbFlag'] != 1) {
    //     return false
    // }
    var checkBoxList = getCheckBoxList(); // 获取带有checkbox的字符串列表
    $.each(sub.hlpgbmsgList['gmsTypeList'], function (idx, val) {
      if (val['infocode'] == _value) {
        val['checked'] = true
      }
    })
    for (var _key in res['hspemginfCustom']) {
      if (_key === 'emgSeq') {
        // 针对某个2传错的值null
      } else {
        if (sub.hlpgbpatientMsg.hasOwnProperty(_key)) {
          if (_key != 'tmpNbr' && _key != 'breNbr' && _key != 'hrtRte'&& _key != 'senStuCod'&& _key != 'preDgnCod' && _key != 'oxyNbr' && _key != 'qxZyh'&& _key != 'cmpPsnCod') {
            var _value = res['hspemginfCustom'][_key] || '';
            sub.hlpgbpatientMsg[_key] = _value;
            // zgChange(res.hspemginfCustom.sqlStaCod);
          } else {
            // zgChange();
          }
          // if(_key == 'senStuCod'){
          //   var _value = res['hspemginfCustom'][_key] || '';
          //   $.each(sub.hlpgbmsgList.szCodList,function(idx,val){
          //     if(val.info == _value){
          //       sub.hlpgbhideMsg['szCod'] = val.infocode;
          //       sub.hlpgbpatientMsg['szCod'] = val.infocode.split(",");
          //     }
          //   })
          // }
        }
      }
      if(sub.basicInfo.hasOwnProperty(_key)) {
        var _value = res['hspemginfCustom'][_key] || '';
        sub.basicInfo[_key] = _value;
        if(_key == 'cstAge' && _value != null){
          sub.basicInfo['cstAgeAll'] = _value + res['hspemginfCustom']['cstAgeCod'];
        }
        if(_key == 'emgDat' && _value != null){
          sub.basicInfo[_key] = publicFun.timeFormat(_value, 'yyyy/MM/dd hh:mm:ss');
          sub.basicInfo['oprDat'] = publicFun.timeFormat(_value, 'yyyy/MM/dd')
        }
        sub.basicInfo['emgFkCod'] = '急诊科'
      }
    }
    for (var _key in res['hspHlpgbCustom']) {
      if (_key === 'emgSeq') {
        // 针对某个2传错的值null
      } else {
        if (sub.hlpgbpatientMsg.hasOwnProperty(_key)) {
          var _value = res['hspHlpgbCustom'][_key] || '';
          if (_key === 'cmpPsnCod' ||_key === 'clbzCod' || _key === 'fbCod' || _key == 'pfCod' || _key == 'cxCod'|| _key == 'szCod'|| _key == 'wcdCod'|| _key == 'ttCod'|| _key == 'szydCod'|| _key == 'gmsType'|| _key == 'hlbzCod') {
            if (_value != null && _value !== '') {
              sub.hlpgbhideMsg[_key] = _value;
              sub.hlpgbpatientMsg[_key] = _value.split(",");
              if (_key == 'pfCod') {
                if ($.inArray('9', sub.hlpgbpatientMsg[_key]) > -1) { // 压力性创伤
                  sub.isShowStressText = true;
                } else {
                  sub.isShowStressText = false;
                }
              }
            }
          } else {
            if (_key !== 'preAssNam') {
              sub.hlpgbpatientMsg[_key] = _value;
            } else {
              if (_value) {
                sub.hlpgbpatientMsg[_key] = _value;
              }
            }
            if (res['hspHlpgbCustom']['oprDat'] != null) {
              sub.hlpgbpatientMsg.oprDat = publicFun.timeFormat(new Date(res['hspHlpgbCustom']['oprDat']), 'yyyy/MM/dd');
            } else {
              sub.hlpgbpatientMsg.oprDat = today;
            }
            // if (res['hspHlpgbCustom']['falldSeq'] != null){
            //     sub.aboutSco.zcddexpfSco = res['hspHlpgbCustom']['zcddexpfSco'];
            // }
            if (_key === 'qtQmsDat' || _key === 'qtTatDat' || _key === 'qtObj1Dat' || _key === 'qtObj2Dat' || _key === 'informDocDat' || _key === 'docDat' || _key === 'assessmentDat' || _key === 'seeDocDat') {
              if (res['hspHlpgbCustom'][_key] != null) {
                sub.hlpgbpatientMsg[_key] = publicFun.timeFormat(new Date(res['hspHlpgbCustom'][_key]), 'yyyy/MM/dd hh:mm:ss');
              }
            }
            if (res['hspHlpgbCustom']['nsThzt'] === 1 || res['hspHlpgbCustom']['nsThzt'] === '1') {
              var codeVal = sub.hlpgbpatientMsg.nsThztDes;
              sub.hlpgbpatientMsg.nsptzy = sub.hlpgbpatientMsg.nsThztDes;
              $.each(sub.hlpgbmsgList.nsptzyList, function (idx, val) {
                if (val['infocode'] == codeVal) {
                  val['checked'] = true
                }
              });
            }
            if ($.inArray(_key, checkBoxList) > -1 && _value != '') {
              $.each(sub.hlpgbmsgList[_key + 'List'], function (idx, val) {
                if (val['infocode'] == _value) {
                  val['checked'] = true
                }
              })
            }
            var selvals = res['hspHlpgbCustom']['pbgNbrFlg'];
            $("#xtSel option[value='" + selvals + "']").attr("selected", true);
            if (selvals == '2' || selvals == '3') {
              $("#xuet").attr("disabled", true);
              $("#xuet").attr('placeholder', "");
            } else {
              $("#xuet").attr("disabled", false);
              $("#xuet").attr('placeholder', "mmol/L");
            }
          }
        }
        if (sub.aboutSco.hasOwnProperty(_key)) {
          sub.aboutSco[_key] = res['hspHlpgbCustom'][_key] || ''
        }
      }
    }

    if (res.hspsqlinfCustom) {
      var _zgCodList = ['sqlStaCod', 'sqlStaStr', 'sqlDepName', 'sqlDepCod', 'sqlDes', 'bedNam','sqlSeq'];
      for (var i = 0; i < _zgCodList.length; i++) {
        sub.hlpgbpatientMsg[_zgCodList[i]] = res.hspsqlinfCustom[_zgCodList[i]] || '';
      }
      sub.hlpgbpatientMsg.sqlDat = res.hspsqlinfCustom.queryDate || '';
    }
    sub.hlpgbpatientMsg.zsFlag = res.zsFlag;
    if(sub.hlpgbpatientMsg.tmpNbrFlg == ''||sub.hlpgbpatientMsg.tmpNbrFlg == null){
      sub.hlpgbpatientMsg.tmpNbrFlg = '1';
    }
  }, function (err) {
    publicFun.alert('请求时间太短未响应完')
  });
}
//监听处理步骤
sub.hlpgbhideMsg.$watch('clbzCod', function (newVal, oldVal) {
  if (newVal.indexOf('16') == -1) {
    sub.hlpgbpatientMsg.clbzOther = ''
  }
  var arr = newVal.split(',');
  if (arr.indexOf('1') == -1) {
    sub.hlpgbpatientMsg.xyDes = ''
  }
});
/**
 * @监听 -皮肤范围- 详情。if != '' , -皮肤范围-的值为1
 * @监听 -腹穿- 详情。if != '' , -腹穿-的值为1
 * @监听 -截瘫-部位平面的值为''。if != '1' , -截瘫-的值为0
 */
sub.hlpgbpatientMsg.$watch('pfFwDes', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && sub.hlpgbpatientMsg.pfFw != '1') {
    sub.hlpgbpatientMsg.pfFw = '1'
  }
});
sub.hlpgbpatientMsg.$watch('fbFcDes', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && sub.hlpgbpatientMsg.fbFc != '1') {
    sub.hlpgbpatientMsg.fbFc = '1'
  }
});
/**
 * @监听 -皮肤范围- 是否勾选。if != '1' , -皮肤范围-详情的值为''
 * @监听 -腹穿- 是否勾选。if != '' , -腹穿-详情的值为''
 */
sub.hlpgbpatientMsg.$watch('pfFw', function (newVal, oldVal) {
  if (newVal === '0' || newVal === 0 || newVal == '') {
    sub.hlpgbpatientMsg.pfFwDes = ''
  }
});
sub.hlpgbpatientMsg.$watch('fbFc', function (newVal, oldVal) {
  if (newVal === '0' || newVal === 0 || newVal == '') {
    sub.hlpgbpatientMsg.fbFcDes = ''
  }
});
/**
 * @监听 -NS瘫痪情况- 是否截瘫还是偏瘫。
 */
sub.hlpgbpatientMsg.$watch('nsThzt', function (newVal, oldVal) {
  if (newVal === '0' || newVal === 0 || newVal == '') {
    var list = sub.hlpgbmsgList.nsptzyList;
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    sub.hlpgbpatientMsg.nsptzy = '';
    sub.hlpgbpatientMsg.nsThztDes = '';
  } else if (newVal === '1' || newVal === 1) {
    sub.hlpgbpatientMsg.nsThztDes = sub.hlpgbpatientMsg.nsptzy;
  }
});
sub.hlpgbpatientMsg.$watch('nsptzy', function (newVal, oldVal) {
  if (newVal != '') {
    sub.hlpgbpatientMsg.nsThztDes = sub.hlpgbpatientMsg.nsptzy;
  }
});
sub.hlpgbhideMsg.$watch('hlbzCod', function (newVal, oldVal) {
  if (newVal.indexOf('9') == -1) {
    sub.hlpgbpatientMsg.hlbzOther = ''
  }
});
// sub.hlpgbpatientMsg.$watch("sqlStaCod", function(newVal, oldVal) {
//     if (newVal === '') {
//         sub.hlpgbpatientMsg.sqlDat = '';
//         sub.hlpgbpatientMsg.sqlDepCod = '';
//         sub.hlpgbpatientMsg.sqlDepName = '';
//     }
//     if (newVal != 2) {
//         sub.hlpgbpatientMsg.sqlDepName = '';
//         sub.hlpgbpatientMsg.sqlDepCod = '';
//     }
// });
// function postPatientMsg() {
//     if((sub.hlpgbpatientMsg.qtObj1Rs!=''||sub.hlpgbpatientMsg.qtObj1Dat!='')&&sub.hlpgbpatientMsg.qtObj1Nam ==''){
//         publicFun.alert("请输入皮试项目");
//         return false;
//     }
//     if((sub.hlpgbpatientMsg.qtObj2Rs!=''||sub.hlpgbpatientMsg.qtObj2Dat!='')&&sub.hlpgbpatientMsg.qtObj2Nam ==''){
//         publicFun.alert("请输入皮试项目");
//         return false;
//     }
//     // if(sub.hlpgbpatientMsg.sqlStaCod=='2' && sub.hlpgbpatientMsg.sqlDepName==''){
//     //     publicFun.alert("请选择科室");
//     //     return false;
//     // }
//     // if(sub.hlpgbpatientMsg.sqlStaCod=='13' && sub.hlpgbpatientMsg.sqlDes==''){
//     //     publicFun.alert("请输入医院");
//     //     return false;
//     // }
//     _confirm('确定提交吗？', null, function() {
//         jquerySubByFId('userform', insertuser_callback, null, "json");
//     })
// }

function insertuser_callback(data) {
  message_alert(data);
  setTimeout(function () {
    window.location.reload();
  }, 800)
  // setTimeout(function() {
  //     parent.opentabwindow(sub.hlpgbpatientMsg.cstNam + '-护理评估表', _baseUrl + "${baseurl}hlpgb/queryhlpgb.do?emgSeq=" + _emgSeq + "&th=" + new Date().getTime());
  // }, 1000)
}

function getCheckBoxList() {
  return ["qdCod", "hxCod", "xhCod", "nsCod", "nsDaqt", "nsTtcj", "nsThzt", "tkLeftCod", "tkRightCod", "qkCod", "hlAddr",'jbsCod','sssCod','gmsCod','arvChlCod'];
}

/**
 * @ 拼接一个大字段（拼接末梢血糖+初步评估）
 */
function connectContent() {
  var StringContent = '';
  // var seltext = $('#xtSel option:selected').text();
  // if (seltext != '') {
  //   StringContent += '末梢血糖' + seltext + ',';
  // }
  // if (sub.hlpgbpatientMsg.pbgNbr != '') {
  //   StringContent += '末梢血糖' + sub.hlpgbpatientMsg.pbgNbr + 'mmol/L，';
  // }
  if(sub.basicInfo.cstNam != ''){
    StringContent += '姓名：' + sub.basicInfo.cstNam + '，';
  }
  if(sub.basicInfo.cstSexCod != ''){
    StringContent += '性别：' + sub.basicInfo.cstSexCod + '，';
  }
  if(sub.basicInfo.cstAgeAll != ''){
    StringContent += '年龄：' + sub.basicInfo.cstAgeAll + '，';
  }
  if(parent.parent.$('#bedNum').html() != ''){
    StringContent += '床号：' + parent.parent.$('#bedNum').html() + '，';
  }
  if(sub.hlpgbpatientMsg.workAddress != ''){
    StringContent += '单位/地址：' + sub.hlpgbpatientMsg.workAddress + '，';
  }
  if(sub.basicInfo.pheNbr != ''){
    StringContent += '电话：' + sub.basicInfo.pheNbr + '，';
  }
  if(sub.basicInfo.mpi != ''){
    StringContent += '病历号：' + sub.basicInfo.mpi + '，';
  }
  if(sub.hlpgbpatientMsg.seeDocDat != ''){
    StringContent += '就诊时间：' + sub.hlpgbpatientMsg.seeDocDat + '，';
  }
  
  if(sub.hlpgbpatientMsg.qkCod == '0'){
    StringContent += '欠款：无，';
  }else if(sub.hlpgbpatientMsg.qkCod == '1'){
    StringContent += '欠款：有，';
  }
  if(sub.hlpgbpatientMsg.informDocDat != ''){
    StringContent += '通知医生时间：' + sub.hlpgbpatientMsg.informDocDat + '，';
  }
  if(sub.hlpgbpatientMsg.docDat != ''){
    StringContent += '到诊时间：' + sub.hlpgbpatientMsg.docDat + '，';
  }
  if(sub.basicInfo.emgFkCod != ''){
    StringContent += '首诊科室：' + sub.basicInfo.emgFkCod + '，';
  }
  if(sub.hlpgbpatientMsg.sqlDctNbr != ''){
    StringContent += '首诊医生：' + sub.hlpgbpatientMsg.sqlDctNbr + '，';
  }

  var hlAddrList = sub.hlpgbmsgList.hlAddrList,
      hlAddr = sub.hlpgbpatientMsg.hlAddr;
  $.each(hlAddrList, function (idx, val) {
    if (val['infocode'] == hlAddr) {
      StringContent += '发病地点：' + hlAddrList[idx].info + '，';
    }
  })
  if (sub.hlpgbpatientMsg.hlAddrOther.replace(/ /img, '') != '') {
      StringContent += sub.hlpgbpatientMsg.hlAddrOther + '，';
  }


  var arvChlCodList = sub.hlpgbmsgList.arvChlCodList,
    arvChlCod = sub.hlpgbpatientMsg.arvChlCod;
  $.each(arvChlCodList, function (idx, val) {
    if (val['infocode'] == arvChlCod) {
      StringContent += '到院方式：' + arvChlCodList[idx].info + '，';
    }
  })
  if(sub.hlpgbpatientMsg.abnDriver != ''){
    StringContent += '驾驶员姓名：' + sub.hlpgbpatientMsg.abnDriver + '，';
  }
  if(sub.hlpgbpatientMsg.abnDoctor != ''){
    StringContent += '医生签名：' + sub.hlpgbpatientMsg.abnDoctor + '，';
  }
  if(sub.hlpgbpatientMsg.abnScoNme != ''){
    StringContent +=  sub.hlpgbpatientMsg.abnScoNme + '，';
  }

  var cmpPsnCodList = sub.hlpgbmsgList.cmpPsnCodList,
      cmpPsnCod = sub.hlpgbpatientMsg.cmpPsnCod,
    innerTextCmp = [];
  $.each(cmpPsnCodList, function (idx, val) {
    if ($.inArray(val['infocode'], cmpPsnCod) > -1) {
      innerTextCmp.push(val['info']);
    }
  })
  if (innerTextCmp != '') {
    StringContent += '陪送人员：' + innerTextCmp.join("，") + '，';
  }
  if(sub.hlpgbpatientMsg.psryqt != ''){
    StringContent += sub.hlpgbpatientMsg.psryqt + '，';
  }
  
  if(sub.hlpgbpatientMsg.preHospitalTreatment != ''){
    StringContent += '院前处置：' + sub.hlpgbpatientMsg.preHospitalTreatment + '，';
  }
  
  if(sub.hlpgbpatientMsg.preDgnCod != '' && sub.hlpgbpatientMsg.preDgnCod != null){
    StringContent += '主诉症状：' + sub.hlpgbpatientMsg.preDgnCod + '，';
  }

  var _jdzdDes = $('#show_text').html()
  if(_jdzdDes != ''){
    StringContent += '诊断：' + _jdzdDes + '，';
  }

  if(sub.hlpgbpatientMsg.tmpNbrFlg == '1' && sub.hlpgbpatientMsg.tmpNbr == ''){
    StringContent += '体温：耳温，';
  }else if(sub.hlpgbpatientMsg.tmpNbrFlg == '2'){
    StringContent += '体温：不升，';
  }else if(sub.hlpgbpatientMsg.tmpNbrFlg == '3'){
    StringContent += '体温：拒测，';
  }
  if(sub.hlpgbpatientMsg.tmpNbr != '' && sub.hlpgbpatientMsg.tmpNbrFlg == '1'){
    StringContent += '体温：耳温-' + sub.hlpgbpatientMsg.tmpNbr + '℃，';
  }else if(sub.hlpgbpatientMsg.tmpNbr != ''){
    StringContent += '体温：' + sub.hlpgbpatientMsg.tmpNbr + '℃，';
  }

  if(sub.hlpgbpatientMsg.pulseFlg == '2'){
    StringContent += '脉搏：测不出，';
  }else if(sub.hlpgbpatientMsg.pulseFlg == '3'){
    StringContent += '脉搏：拒测，';
  }
  if(sub.hlpgbpatientMsg.pulse != ''){
    StringContent += '脉搏：' + sub.hlpgbpatientMsg.pulse + '次/分，';
  }

  if(sub.hlpgbpatientMsg.breNbrFlg == '3'){
    StringContent += '呼吸：拒测，';
  }
  if(sub.hlpgbpatientMsg.breNbr != '' && sub.hlpgbpatientMsg.breNbrFlg == '2'){
    StringContent += '呼吸：机械通气-' + sub.hlpgbpatientMsg.breNbr + '次/分，';
  }else if(sub.hlpgbpatientMsg.breNbr != ''){
    StringContent += '呼吸：' + sub.hlpgbpatientMsg.breNbr + '次/分，';
  }
  
  if(sub.hlpgbpatientMsg.sbpNbrFlg == '2'){
    StringContent += '血压：测不出，';
  }else if(sub.hlpgbpatientMsg.sbpNbrFlg == '3'){
    StringContent += '血压：拒测，';
  }
  if(sub.hlpgbpatientMsg.sbpUpNbr != ''){
    StringContent += '血压：' + sub.hlpgbpatientMsg.sbpUpNbr+'/'+ sub.hlpgbpatientMsg.sbpDownNbr + 'mmHg，';
  }
  if(sub.hlpgbpatientMsg.xyFlg == '2'){
    StringContent += '血氧：测不出，';
  }else if(sub.hlpgbpatientMsg.xyFlg == '3'){
    StringContent += '血氧：拒测，';
  }
  if(sub.hlpgbpatientMsg.oxyNbr != ''){
    StringContent += '血氧：' + sub.hlpgbpatientMsg.oxyNbr + '%，';
  }

  if(sub.hlpgbpatientMsg.hrtRteFlg == '2'){
    StringContent += '心率：测不出，';
  }else if(sub.hlpgbpatientMsg.hrtRteFlg == '3'){
    StringContent += '心率：拒测，';
  }
  if(sub.hlpgbpatientMsg.hrtRte != ''){
    StringContent += '心率：' + sub.hlpgbpatientMsg.hrtRte + '次/分，';
  }

  var glsCodList = sub.hlpgbmsgList.glsCodList,
      glsCod = sub.hlpgbpatientMsg.glsCod;
  $.each(glsCodList, function (idx, val) {
    if (val['infocode'] == glsCod) {
      StringContent += '血糖：' + glsCodList[idx].info + '，';
    }
  })
  var _xtTp = ''
  if(glsCod == ''){
    _xtTp = '血糖：'
  }
  if(sub.hlpgbpatientMsg.pbgNbrFlg == '2'){
    StringContent += _xtTp+'LO，';
  }else if(sub.hlpgbpatientMsg.pbgNbrFlg == '3'){
    StringContent += _xtTp+'HI，';
  }else if(sub.hlpgbpatientMsg.pbgNbrFlg == '4'){
    StringContent += _xtTp+'拒测，';
  }
  if(sub.hlpgbpatientMsg.pbgNbr != ''){
    StringContent += _xtTp + sub.hlpgbpatientMsg.pbgNbr + 'mmol/L，';
  }

  var hlbzCodList = sub.hlpgbmsgList.hlbzCodList,
    hlbzCod = sub.hlpgbpatientMsg.hlbzCod,
    innerTextHlbz = [];
  $.each(hlbzCodList, function (idx, val) {
    if ($.inArray(val['infocode'], hlbzCod) > -1) {
      innerTextHlbz.push(val['info']);
    }
  })
  if (innerTextHlbz != '') {
    StringContent += '病种：' + innerTextHlbz.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.hlbzOther != '') {
    StringContent += sub.hlpgbpatientMsg.hlbzOther +'，'
  }

  var qdCodList = sub.hlpgbmsgList.qdCodList,
    qdCod = sub.hlpgbpatientMsg.qdCod,
    qdFlag = false;
  $.each(qdCodList, function (idx, val) {
    if (val['infocode'] == qdCod) {
      qdFlag = true;
      StringContent += '气道' + qdCodList[idx].info + '，';
    }
  })

  if (sub.hlpgbpatientMsg.qdOther.replace(/ /img, '') != '') {
    if (qdFlag == true) {
      StringContent += sub.hlpgbpatientMsg.qdOther + '，';
    } else {
      StringContent += '气道' + sub.hlpgbpatientMsg.qdOther + '，';
    }

  }

  var hxCodList = sub.hlpgbmsgList.hxCodList,
    hxCod = sub.hlpgbpatientMsg.hxCod,
    hxFlag = false;
  $.each(hxCodList, function (idx, val) {
    if (val['infocode'] == hxCod) {
      hxFlag = true;
      StringContent += '呼吸' + hxCodList[idx].info + '，';
    }
  })
  if (sub.hlpgbpatientMsg.hxOther.replace(/ /img, '') != '') {
    if (hxFlag == true) {
      StringContent += sub.hlpgbpatientMsg.hxOther + '，';
    } else {
      StringContent += '呼吸' + sub.hlpgbpatientMsg.hxOther + '，';
    }

  }

  var xhCodList = sub.hlpgbmsgList.xhCodList,
    xhCod = sub.hlpgbpatientMsg.xhCod;
  $.each(xhCodList, function (idx, val) {
    if (val['infocode'] == xhCod) {
      StringContent += '循环' + xhCodList[idx].info + '，';
    }
  })

  var cxCodList = sub.hlpgbmsgList.cxCodList,
    cxCod = sub.hlpgbpatientMsg.cxCod,
    innerTextCx = [];
  $.each(cxCodList, function (idx, val) {
    if ($.inArray(val['infocode'], cxCod) > -1) {
      innerTextCx.push(val['info']);
    }
  })
  if (innerTextCx != '') {
    StringContent += '出血：' + innerTextCx.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.cxQtbw.replace(/ /img, '') != '') {
    if (innerTextCx != '') {
      StringContent += sub.hlpgbpatientMsg.cxQtbw + '，';
    } else {
      StringContent += '出血' + sub.hlpgbpatientMsg.cxQtbw + '，';
    }
  }

  var nsCodList = sub.hlpgbmsgList.nsCodList,
    nsCod = sub.hlpgbpatientMsg.nsCod,
    nsFlagA = false,
    nsFlagB = false,
    nsFlagC = false;
  $.each(nsCodList, function (idx, val) {
    if (val['infocode'] == nsCod) {
      nsFlagA = true;
      StringContent += '神经系统：' + nsCodList[idx].info + '，';
    }
  })

  var nsDaqtList = sub.hlpgbmsgList.nsDaqtList,
    nsDaqt = sub.hlpgbpatientMsg.nsDaqt;
  $.each(nsDaqtList, function (idx, val) {
    if (val['infocode'] == nsDaqt) {
      nsFlagB = true;
      if (nsFlagA == true) {
        StringContent += nsDaqtList[idx].info + '，';
      } else {
        StringContent += '神经系统：' + nsDaqtList[idx].info + '，';
      }

    }
  })

  var nsTtcjList = sub.hlpgbmsgList.nsTtcjList,
    nsTtcj = sub.hlpgbpatientMsg.nsTtcj;
  $.each(nsTtcjList, function (idx, val) {
    if (val['infocode'] == nsTtcj) {
      nsFlagC = true;
      if (nsFlagA == true || nsFlagB == true) {
        StringContent += nsTtcjList[idx].info + '，';
      } else {
        StringContent += '神经系统：' + nsTtcjList[idx].info + '，';
      }

    }
  })

  var nsThztList = sub.hlpgbmsgList.nsThztList,
    nsThzt = sub.hlpgbpatientMsg.nsThzt;
  $.each(nsThztList, function (idx, val) {
    if (val['infocode'] == nsThzt) {
      if (nsFlagA == true || nsFlagB == true || nsFlagC == true) {
        StringContent += nsThztList[idx].info + '，';
      } else {
        StringContent += '神经系统：' + nsThztList[idx].info + '，';
      }
      if (idx == 0 && sub.hlpgbpatientMsg.nsThztDes.replace(/ /img, '') != '') {
        StringContent += '部位平面：' + sub.hlpgbpatientMsg.nsThztDes + '，';
      }
      if (idx == 1 && sub.hlpgbpatientMsg.nsptzy == '0') {
        StringContent += '左' + '，';
      } else if (idx == 1 && sub.hlpgbpatientMsg.nsptzy == '1') {
        StringContent += '右' + '，';
      }

    }
  })

  if (sub.hlpgbpatientMsg.tkLeft != '') {
    StringContent += '瞳孔左' + sub.hlpgbpatientMsg.tkLeft + 'mm，';
  }

  if (sub.hlpgbpatientMsg.tkLeftOther.replace(/ /img, '') != '') {
    if (sub.hlpgbpatientMsg.tkLeft != '') {
      StringContent += '其他：' + sub.hlpgbpatientMsg.tkLeftOther + '，';
    } else {
      StringContent += '瞳孔左其他：' + sub.hlpgbpatientMsg.tkLeftOther + '，';
    }
  }

  var tkLeftCodList = sub.hlpgbmsgList.tkLeftCodList,
    tkLeftCod = sub.hlpgbpatientMsg.tkLeftCod;
  $.each(tkLeftCodList, function (idx, val) {
    if (val['infocode'] == tkLeftCod) {
      if (sub.hlpgbpatientMsg.tkLeft != '') {
        StringContent += '光反射' + tkLeftCodList[idx].info + '，';
      }
      else {
        StringContent += '瞳孔左光反射' + tkLeftCodList[idx].info + '，';
      }

    }
  })

  if (sub.hlpgbpatientMsg.tkRight != '') {
    StringContent += '瞳孔右' + sub.hlpgbpatientMsg.tkRight + 'mm，';
  }

  if (sub.hlpgbpatientMsg.tkRightOther.replace(/ /img, '') != '') {
    if (sub.hlpgbpatientMsg.tkRight != '') {
      StringContent += '其他：' + sub.hlpgbpatientMsg.tkRightOther + '，';
    } else {
      StringContent += '瞳孔右其他：' + sub.hlpgbpatientMsg.tkRightOther + '，';
    }
  }

  var tkRightCodList = sub.hlpgbmsgList.tkRightCodList,
    tkRightCod = sub.hlpgbpatientMsg.tkRightCod;
  $.each(tkRightCodList, function (idx, val) {
    if (val['infocode'] == tkRightCod) {
      if (sub.hlpgbpatientMsg.tkRight != '') {
        StringContent += '光反射' + tkRightCodList[idx].info + '，';
      }
      else {
        StringContent += '瞳孔右光反射' + tkRightCodList[idx].info + '，';
      }

    }
  })

  var szCodList = sub.hlpgbmsgList.szCodList,
  szCod = sub.hlpgbpatientMsg.szCod,
  innerTextSZ = [];
  $.each(szCodList, function (idx, val) {
    if ($.inArray(val['infocode'], szCod) > -1) {
      innerTextSZ.push(val['info']);
    }
  });
  if (innerTextSZ != '') {
    StringContent += '神志：' + innerTextSZ.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.szOther.replace(/ /img, '') != '') {
    StringContent += '其他：' + sub.hlpgbpatientMsg.szOther + '，';
  }
  
  var pfCodList = sub.hlpgbmsgList.pfCodList,
    pfCod = sub.hlpgbpatientMsg.pfCod,
    innerTextM = [];
  $.each(pfCodList, function (idx, val) {
    if ($.inArray(val['infocode'], pfCod) > -1) {
      if (val['infocode'] == '9') {
        if (sub.hlpgbpatientMsg.ylxssDes.replace(/ /img, '') != '') {
          innerTextM.push(val['info'] + ':' + sub.hlpgbpatientMsg.ylxssDes);
        } else {
          innerTextM.push(val['info']);
        }
      } else {
        innerTextM.push(val['info']);
      }
    }
  });
  if (innerTextM != '') {
    StringContent += '皮肤：' + innerTextM.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.pfFw == 1) {
    if (innerTextM != '') {
      StringContent += '范围'
    } else {
      StringContent += '皮肤范围'
    }
    if (sub.hlpgbpatientMsg.pfFwDes.replace(/ /img, '') == '') {
      StringContent += '，';
    }
  }
  if (sub.hlpgbpatientMsg.pfFwDes.replace(/ /img, '') != '') {
    StringContent += sub.hlpgbpatientMsg.pfFwDes + '，';
  }
  var wcdCodList = sub.hlpgbmsgList.wcdCodList,
  wcdCod = sub.hlpgbpatientMsg.wcdCod,
  innerTextWC = [];
  $.each(wcdCodList, function (idx, val) {
    if ($.inArray(val['infocode'], wcdCod) > -1) {
      innerTextWC.push(val['info']);
    }
  });


  if (innerTextWC != '') {
    StringContent += '胃肠道：' + innerTextWC.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.wcdOther.replace(/ /img, '') != '') {
    StringContent += '其他：' + sub.hlpgbpatientMsg.wcdOther + '，';
  }

  
  var fbCodList = sub.hlpgbmsgList.fbCodList,
    fbCod = sub.hlpgbpatientMsg.fbCod,
    fbflg = false;
  if (fbCod.length > 0) {
    StringContent += "腹部：";
    fbflg = true;
  }
  for (var i = 0; i < fbCodList.length; i++) {
    if ($.inArray(fbCodList[i].infocode, fbCod) > -1) {
      StringContent += fbCodList[i].info + '，';
    }
  }
  if (sub.hlpgbpatientMsg.fbFc == 1) {
    if (sub.hlpgbpatientMsg.fbFcDes.replace(/ /img, '') != '') {
      StringContent += '腹穿' + sub.hlpgbpatientMsg.fbFcDes + '，';
    } else {
      StringContent += '腹穿，';
    }
  }
  if (sub.hlpgbpatientMsg.fbOther.replace(/ /img, '') != '') {
    if (fbflg == true) {
      StringContent += sub.hlpgbpatientMsg.fbOther + '，';
    } else {
      StringContent += "腹部" + sub.hlpgbpatientMsg.fbOther + '，';
    }
  }

  var szydCodList = sub.hlpgbmsgList.szydCodList,
  szydCod = sub.hlpgbpatientMsg.szydCod,
  innerTextSZYD = [];
  $.each(szydCodList, function (idx, val) {
    if ($.inArray(val['infocode'], szydCod) > -1) {
      innerTextSZYD.push(val['info']);
    }
  });
  if (innerTextSZYD != '') {
    StringContent += '四肢活动：' + innerTextSZYD.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.szydOther.replace(/ /img, '') != '') {
    StringContent +=  '其他：' + sub.hlpgbpatientMsg.szydOther + '，';
  }

  var ttCodList = sub.hlpgbmsgList.ttCodList,
  ttCod = sub.hlpgbpatientMsg.ttCod,
  innerTextTT = [];
  $.each(ttCodList, function (idx, val) {
    if ($.inArray(val['infocode'], ttCod) > -1) {
      innerTextTT.push(val['info']);
    }
  });
  if (innerTextTT != '') {
    StringContent += '疼痛：' + innerTextTT.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.ttBw.replace(/ /img, '') != '') {
    StringContent += '部位：'+ sub.hlpgbpatientMsg.ttBw + '，';
  }

  var jbsCodList = sub.hlpgbmsgList.jbsCodList,
  jbsCod = sub.hlpgbpatientMsg.jbsCod,
  innerTextJB = [];
  $.each(jbsCodList, function (idx, val) {
    if ($.inArray(val['infocode'], jbsCod) > -1) {
      innerTextJB.push(val['info']);
    }
  });
  if (innerTextJB != '') {
    StringContent += '疾病史：' + innerTextJB.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.jbsDes.replace(/ /img, '') != '') {
    StringContent +=  '内容：' + sub.hlpgbpatientMsg.jbsDes + '，';
  }

  var sssCodList = sub.hlpgbmsgList.sssCodList,
  sssCod = sub.hlpgbpatientMsg.sssCod,
  innerTextSS = [];
  $.each(sssCodList, function (idx, val) {
    if ($.inArray(val['infocode'], sssCod) > -1) {
      innerTextSS.push(val['info']);
    }
  });
  if (innerTextSS != '') {
    StringContent += '手术史：' + innerTextSS.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.sssDes.replace(/ /img, '') != '') {
    StringContent +=  '内容：' + sub.hlpgbpatientMsg.sssDes + '，';
  }

  var gmsCodList = sub.hlpgbmsgList.gmsCodList,
  gmsCod = sub.hlpgbpatientMsg.gmsCod,
  innerTextGM = [];
  $.each(gmsCodList, function (idx, val) {
    if ($.inArray(val['infocode'], gmsCod) > -1) {
      innerTextGM.push(val['info']);
    }
  });
  if (innerTextGM != '') {
    StringContent += '过敏史：' + innerTextGM.join("，") + '，';
  }

  var gmsTypeList = sub.hlpgbmsgList.gmsTypeList,
  gmsType = sub.hlpgbpatientMsg.gmsType,
  innerTextTP = [];
  $.each(gmsTypeList, function (idx, val) {
    if ($.inArray(val['infocode'], gmsType) > -1) {
      innerTextTP.push(val['info']);
    }
  });
  if (innerTextTP != '') {
    StringContent += '类型：' + innerTextTP.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.gmsDes != null && sub.hlpgbpatientMsg.gmsDes.replace(/ /img, '') != '') {
    StringContent +=  '其他：' + sub.hlpgbpatientMsg.gmsDes + '，';
  }

  if (sub.aboutSco.bradenSco != '' && sub.aboutSco.bradenSco !== null) {
    StringContent += 'Braden评分:' + sub.aboutSco.bradenSco + '分，';
  }
  if (sub.aboutSco.fallriskSco != '' && sub.aboutSco.fallriskSco !== null) {
    StringContent += '坠床跌倒评分:' + sub.aboutSco.fallriskSco + '分，';
  }
  if (sub.aboutSco.zcddexpfSco != '' && sub.aboutSco.zcddexpfSco !== null) {
    StringContent += '坠床跌倒评分:' + sub.aboutSco.zcddexpfSco + '分，';
  }
  if (sub.aboutSco.adlSco != '' && sub.aboutSco.adlSco !== null) {
    StringContent += 'ADL评分:' + sub.aboutSco.adlSco + '分，';
  }
  if (sub.aboutSco.nrsSco != '' && sub.aboutSco.nrsSco !== null) {
    StringContent += '疼痛评分:' + sub.aboutSco.nrsSco + '分，';
  }
  if (sub.aboutSco.zyfxpfSco != '' && sub.aboutSco.zyfxpfSco !== null) {
    StringContent += '转运风险评分:' + sub.aboutSco.zyfxpfSco + '分，';
  }
  if (sub.aboutSco.gcsSco != '' && sub.aboutSco.gcsSco !== null) {
    StringContent += 'GCS评分:' + sub.aboutSco.gcsSco + '分，';
  }
  if (sub.aboutSco.morseSco != '' && sub.aboutSco.morseSco !== null) {
    StringContent += 'Morse评分:' + sub.aboutSco.morseSco + '分，';
  }

  var clbzCodList = sub.hlpgbmsgList.clbzCodList,
      clbzCod = sub.hlpgbpatientMsg.clbzCod;
  if (clbzCod.length > 0) {
    StringContent += "处理步骤：";
  }
  for (var i = 0; i < clbzCodList.length; i++) {
    if ($.inArray(clbzCodList[i].infocode, clbzCod) > -1) {
      if (sub.hlpgbpatientMsg.xyDes != '' && clbzCodList[i].infocode == '1') {
        StringContent += clbzCodList[i].info + sub.hlpgbpatientMsg.xyDes + '升/分' + '，';
      }else{
        StringContent += clbzCodList[i].info + '，';
      }
    }
  }
  if (sub.hlpgbpatientMsg.clbzOther != '') {
    StringContent += sub.hlpgbpatientMsg.clbzOther +'，'
  }
  if (sub.hlpgbpatientMsg.memo.replace(/ /img, '') != '') {
    StringContent += '备注：' + sub.hlpgbpatientMsg.memo + '，';
  }
  if(sub.hlpgbpatientMsg.jjlxNam != ''){
    StringContent += '紧急联系人1：' + sub.hlpgbpatientMsg.jjlxNam + '，';
  }
  if(sub.hlpgbpatientMsg.jjlxTel != ''){
    StringContent += '电话：' + sub.hlpgbpatientMsg.jjlxTel + '，';
  }
  if(sub.hlpgbpatientMsg.jjlxNam2 != ''){
    StringContent += '紧急联系人2：' + sub.hlpgbpatientMsg.jjlxNam2 + '，';
  }
  if(sub.hlpgbpatientMsg.jjlxTel2 != ''){
    StringContent += '电话：' + sub.hlpgbpatientMsg.jjlxTel2 + '，';
  }
  if (StringContent == '') {
    StringContent = '';
  }
  sub.hlpgbpatientMsg.dataBarFlg = true;
  //$("#bigDataHlpgDiv").val(StringContent)
  return StringContent;
}

function connectField() {
  var ConnectString = connectContent();
  if (ConnectString != '') {
    $("#bigDataHlpgDiv").show();
    var finalField = ConnectString.substring(0, ConnectString.length - 1);//截取开始到长度减-1的字符串，去掉逗号
    finalField += ';';
    $('#bigDataHlpgDiv').val(finalField);
  } else if (ConnectString == '') {
    ConnectString = '';
    publicFun.alert("请先填写护理评估单！");
    $('#bigDataHlpgDiv').val(ConnectString);
  }
}

//新增会诊诊断
function addPreDgnCod() {
  createmodalwindow("初步诊断", 800, 460, _baseUrl +'zyyqjs/querylrNew.do?emgSeq='+_emgSeq+'&&jbzdType=1&&trnumber=', 'no');
}
function openKnowledge() {
  createmodalwindow('知识库', 600, 560, _baseUrl + 'firstimp/toZsk.do')
}
function openJbsDes(){
  createmodalwindow('知识库', 250, 300, _baseUrl + 'hlpgb/toJbsQueryPage.do')
}

var _pageFlag = 'hlpgb'