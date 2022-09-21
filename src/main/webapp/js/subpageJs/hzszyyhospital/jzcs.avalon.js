var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
var _hlbzCodList = publicFun.getDict('HLBZ_COD'),
    _clbzCodList = publicFun.getDict('CSCLBZ_COD'),
    _arvChlCodList = publicFun.getDict('ARV_CHL_COD'),
    _cmpPsnCodList = publicFun.getDict('CMP_PSN_COD'),
    _glsCodList = publicFun.getDict('XT_COD');
$.each(_arvChlCodList,function(index,val){
  val.checked = false
})
var twoCheckList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }],
  fbddList = [{ checked: false, infocode: '0', info: '居住地' }, { checked: false, infocode: '1', info: '单位' }, { checked: false, infocode: '2', info: '途中' }, { checked: false, infocode: '3', info: '其他' }],
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
  pfList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '湿冷' }, { checked: false, infocode: '2', info: '苍白' }, { checked: false, infocode: '3', info: '潮红' }, { checked: false, infocode: '4', info: '出汗' }, { checked: false, infocode: '5', info: '紫绀' }, { checked: false, infocode: '6', info: '黄染' }, { checked: false, infocode: '7', info: '皮疹' }, { checked: false, infocode: '8', info: '瘀斑' }, { checked: false, infocode: '9', info: '压力性损伤' },{ checked: false, infocode: '11', info: '破损' },{ checked: false, infocode: '10', info: '范围' }],
  tbList = [{ checked: false, infocode: '0', info: '撕裂伤' }, { checked: false, infocode: '1', info: '挫伤' }, { checked: false, infocode: '2', info: '擦伤' },{ checked: false, infocode: '3', info: '贯穿伤' }, { checked: false, infocode: '4', info: '无' }],
  jbList = [{ checked: false, infocode: '0', info: '撕裂伤' }, { checked: false, infocode: '1', info: '擦伤' }, { checked: false, infocode: '2', info: '挫僵' },{ checked: false, infocode: '3', info: '正常范围' }, { checked: false, infocode: '4', info: '气管移位' }, { checked: false, infocode: '5', info: '颈静脉怒张' }, { checked: false, infocode: '6', info: '贯穿伤' }],
  xbList = [{ checked: false, infocode: '0', info: '撕裂伤' }, { checked: false, infocode: '1', info: '挫伤' }, { checked: false, infocode: '2', info: '反复呼吸' },{ checked: false, infocode: '3', info: '擦伤' }, { checked: false, infocode: '4', info: '贯穿伤' }, 
        { checked: false, infocode: '5', info: '呼吸音正常' }, { checked: false, infocode: '6', info: '降低' }, { checked: false, infocode: '7', info: '皮下气肿' }, { checked: false, infocode: '8', info: '无' }, { checked: false, infocode: '9', info: '有' },
        { checked: false, infocode: '10', info: '压痛' }, { checked: false, infocode: '11', info: '挤压' }, { checked: false, infocode: '12', info: '胸穿' }, { checked: false, infocode: '13', info: '左' }, { checked: false, infocode: '14', info: '右' }],
  jzList = [{ checked: false, infocode: '0', info: '畸形' }, { checked: false, infocode: '1', info: '无明显外伤' }, { checked: false, infocode: '2', info: '挫伤' },{ checked: false, infocode: '3', info: '截瘫' }],
  gpList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '不稳定' }, { checked: false, infocode: '2', info: '挤压痛' }],
  ggList = [{ checked: false, infocode: '0', info: '正常' }, { checked: false, infocode: '1', info: '骨折' }, { checked: false, infocode: '2', info: '左' },{ checked: false, infocode: '3', info: '右' }];
  
  var sub = avalon.define({
    $id: 'queryjzcs',
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
      fbCodList: [{ infocode: '1', info: '无明显异常' }, { infocode: '2', info: '腹痛' }, { infocode: '3', info: '腹胀' }, { infocode: '4', info: '肌紧张' },
        { infocode: '5', info: '压痛' }, { infocode: '6', info: '反跳痛' }, { infocode: '7', info: '有肠鸣音' }, { infocode: '8', info: '肠鸣音消失' }],

      tbCodList: tbList,
      jbCodList: jbList,
      xbCodList: xbList,
      jzCodList: jzList,
      gpCodList: gpList,
      ggCodList: ggList,
      clbzCodList: _clbzCodList,
      xqylgCodList: [{ checked: false,infocode: '0', info: '左' }, { checked: false,infocode: '1', info: '右' }],
      hlbzCodList:_hlbzCodList,
      arvChlCodList:_arvChlCodList,
      cmpPsnCodList:_cmpPsnCodList,
      glsCodList:_glsCodList,
      abnDriverList:[],//驾驶员列表
      qkCodList: twoCheckList, //欠款
      hlAddrList: fbddList, //发病地点
    },
    hlpgbpatientMsg: {
      bigDataHlpgDiv:'',
      emgSeq: _emgSeq, //预检号
      cbpgNam:_cstNam,
      clbzNam:_cstNam,
      qdCod:'',
      qdOther:'',
      hxCod:'',
      hxOther:'',
      xhCod:'',
      cxCod:[],
      cxQtbw:'',
      nsCod:'',
      nsDaqt:'',
      nsTtcj:'',
      nsThzt:'',
      nsThztDes:'',
      nsptzy:'',
      tkLeftCod:'',
      tkLeft:'',
      tkLeftOther:'',
      tkRightCod:'',
      tkRight:'',
      tkRightOther:'',

      fbFc: '', //腹部腹穿 0：无，1：有
      fbFcDes: '', //腹穿情况
      fbOther: '', //腹部其它
      pfCod: [], //皮肤状态
      pfFw: '', //皮肤范围 
      fbCod: [], // 腹部值
      
      tbCod:[],
      tbOther:'',
      jbCod:[],
      xbCod:[],
      xbJyDes:'',
      xbLeftDes:'',
      xbRightDes:'',
      xbXcDes:'',
      jzCod:[],
      gpCod:[],
      ggCod:[],
      clbzCod:[],
      jmsyPv:'',//静脉输液PV
      jmsyCv:'',//静脉输液CV
      xqylgCod:'',//胸腔引流管状态
      jybzBw:'',//加压包扎部位
      jbgdBw:'',//夹板固定部位
      qyBw:'',//牵引部位
      xxDat:'',//血型时间
      pxDat:'',//配血时间
      sxDat:'',//输血时间
      clbzOther:'',
      xyDes:'',
      hzDes:'',

      jbzdDes:'',
      preDgnCod:'',
      hlbzOther:'',
      hlbzCod:[],
      
      workAddress:'',//单位地址
      informDocDat: '',
      sqlDctNbr:'',
      preHospitalTreatment:'',
      assessmentDat: '',
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
      
      arvChlCod: '', // 到院方式
      cmpPsnCod: [],
      abnScoNme:'',
      abnDriver:'',
      abnDoctor:'',
      psryqt:'', // 陪送人员

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
      seeDocDat:'',
      qkCod:'',
      hlAddr:'',
      hlAddrOther:'',
      jjlxNam:'',
      jjlxTel:'',
      jjlxNam2:'',
      jjlxTel2:'',
      hrtRteFlg:'',
      pulseFlg:'',
      ylxssDes: '' // 压力性损伤输入框
    },
    hlpgbhideMsg:{
      tbCod:'',
      jbCod:'',
      xbCod:'',
      fbCod:'',
      jzCod:'',
      gpCod:'',
      ggCod:'',
      clbzCod:'',
      pfCod:'',
      cxCod:'',
      hlbzCod:'',
      cmpPsnCod:''
    },
    aboutSco: {
      bradenSeq: '',
      adlSeq: '',
      bradenSco: null,
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
      emgFkCod:'',
      pheNbr:''
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
        sub.hlpgbhideMsg[objName] = sub.hlpgbpatientMsg[objName].$model.join(',')
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
      createmodalwindow('Braden评分', 800, 410, _baseUrl + 'hlpgb/toBradenSco.do?typeSource=jzcs')
    },
    openAdlSco: function () {
      var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
      var _tabHeight = _bdHeight - 30;
      if (_bdHeight > 600) {
        _tabHeight = 600;
      }
      createmodalwindow('ADL评分', 700, _tabHeight, _baseUrl + 'hlpgb/toAdlSco.do?typeSource=jzcs')
    },
    openZyfxSco: function () {
      var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
      var _tabHeight = _bdHeight - 30;
      if (_bdHeight > 610) {
        _tabHeight = 610;
      }
      createmodalwindow('安全转运风险评估单', 800, _tabHeight, _baseUrl + 'hlpgb/toZyfxpfSco.do?typeSource=jzcs')
    },
    openNRSSco: function () {
      createmodalwindow('疼痛评分', 700, 540, _baseUrl + 'scorequery/toNrsGde.do?typeSource=jzcs')
    },
    openGCSSco:function(){
      createmodalwindow('GCS评分', 500, 490, _baseUrl + 'hlpgb/toGcsSco.do?emgSeq='+_emgSeq+"&typeSource=jzcs")
    },
    openMorse:function(){
      createmodalwindow('Morse评分', 800, 500, _baseUrl + 'hzszyyemg/queryMorse.do?typeSource=jzcs')
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
  })

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

function getSmtzCod(){
  return ["arvChlCod","docDat","sqlDctNbr","tmpNbr","pulse","breNbr","sbpUpNbr","sbpDownNbr","oxyNbr","pbgNbr","glsCod"
          ,"pbgNbrFlg",'abnScoNme','abnDriver','abnDoctor','psryqt']
}

  function getCheckBoxList() {
    return ["arvChlCod", "qkCod", "hlAddr","qdCod", "hxCod", "xhCod", "nsCod", "nsDaqt", "nsTtcj", "nsThzt", "tkLeftCod", "tkRightCod", "xqylgCod"];
  }

  function getGdeSeqList(){
    return ["nrsSeq", "gcsSeq"];
  }

  function getGdeScoList(){
    return ["nrsSco",  "gcsSco"];
  }

  function getAboutSco(){
    return ["nrsSeq", "gcsSeq", "ddfxpgbSeq","nrsSco",  "gcsSco", "morseSco","bradenSeq","adlSeq","bradenSco","adlSco","ttpfNr","ttpfTypeCod","zyfxpfSeq","zyfxpfSco"];
  } 

  function getMsgList(){
    var getMsgUrl = _baseUrl + 'hlpgb/queryjzcsrypgb_result.do';
    $('#_bedNum').html(parent.parent.$('#bedNum').html());
    publicFun.httpServer({ url: getMsgUrl }, { emgSeq: _emgSeq }, function (res) {
      $.each(sub.hlpgbmsgList['clbzCodList'], function (idx, val) {
        val['checked'] = false
      })
      var checkBoxList = getCheckBoxList(),
          seqList = getGdeSeqList(),
          scoList = getGdeScoList(),
          allScoList = getAboutSco(),
          smtzCodList = getSmtzCod();
      for (var _key in res['hspJzcspgInfCustom']) {
        if (!res.hspJzcspgInfCustom.emgSeq) { // 没有填写过 默认第一次赋值都是在这边 切记！！！
          var _timeKeyList = ['informDocDat', 'docDat', 'assessmentDat', 'seeDocDat'];
          for (var i = 0; i < _timeKeyList.length; i++) {
            sub.hlpgbpatientMsg[_timeKeyList[i]] = publicFun.timeFormat(res.hspemginfCustom.emgDat, 'yyyy/MM/dd hh:mm:ss')
          }
          if(_key === 'cmpPsnCod' && res.hspemginfCustom[_key] != null){
            sub.hlpgbhideMsg[_key] = res.hspemginfCustom[_key];
            sub.hlpgbpatientMsg[_key] = res.hspemginfCustom[_key].split(",");
          }
          if (_key === 'arvChlCod') {
            sub.hlpgbhideMsg[_key] = res.hspemginfCustom[_key];
            $.each(sub.hlpgbmsgList[_key + 'List'], function (idx, val) {
              if (val['infocode'] == res.hspemginfCustom[_key]) {
                val['checked'] = true
              }
            })
          }
          if($.inArray(_key,smtzCodList) > -1 && res.hspemginfCustom[_key] != null){
            sub.hlpgbpatientMsg[_key] = res.hspemginfCustom[_key];
          }
          $.each(scoList, function (idx, val) {
            sub.aboutSco[val] = res['hspemginfCustom'][val]
          })
          $.each(seqList, function (_idx, _val) {
            sub.aboutSco[_val] = _emgSeq
          })
          // sub.hlpgbpatientMsg.preDgnCod = res['hspemginfCustom']['preDgnCod']; // 主诉症状不要默认
        }
        if(_key == 'emgSeq') {
          if (res['hspJzcspgInfCustom'][_key] !== '' && res['hspJzcspgInfCustom'][_key] != null) {
            $.each(allScoList, function (_idx, _val) {
              sub.aboutSco[_val] = res['hspJzcspgInfCustom'][_val] || '';
            })
            sub.hlpgbpatientMsg.preDgnCod = res['hspJzcspgInfCustom']['preDgnCod']
          }
        } else if (sub.hlpgbpatientMsg.hasOwnProperty(_key)) {
          var _value = res['hspJzcspgInfCustom'][_key] || '';
          if (_key === 'cmpPsnCod' ||_key === 'clbzCod' || _key === 'fbCod' || _key === 'cxCod' || _key == 'pfCod' ||  _key == 'tbCod'|| _key == 'jbCod'|| _key == 'xbCod'|| _key == 'ggCod'|| _key == 'jzCod'|| _key == 'gpCod'|| _key == 'hlbzCod') {
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
            if (_value != null && _value != '') {
              if(_key == 'xxDat' || _key == 'pxDat' || _key == 'sxDat' || _key === 'informDocDat' || _key === 'docDat' || _key === 'assessmentDat' || _key === 'seeDocDat'){
                sub.hlpgbpatientMsg[_key] = publicFun.timeFormat(_value, 'yyyy/MM/dd hh:mm:ss')
              }else{
                sub.hlpgbpatientMsg[_key] = _value
              }
            }
            if (res['hspJzcspgInfCustom']['nsThzt'] === 1 || res['hspJzcspgInfCustom']['nsThzt'] === '1') {
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
          }
        }
      } 
      sub.hlpgbpatientMsg.jbzdDes = res['hspemginfCustom']['jbzdDes'];
      for (var _key in res['hspemginfCustom']) {
        if(sub.basicInfo.hasOwnProperty(_key)){
          var _value = res['hspemginfCustom'][_key] || '';
          sub.basicInfo[_key] = _value;
          if(_key == 'cstAge' && _value != null){
            sub.basicInfo['cstAgeAll'] = _value + res['hspemginfCustom']['cstAgeCod'];
          }
          if(_key == 'emgDat' && _value != null){
            sub.basicInfo[_key] = publicFun.timeFormat(_value, 'yyyy/MM/dd hh:mm:ss');
            sub.basicInfo['oprDat'] = publicFun.timeFormat(_value, 'yyyy/MM/dd')
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

      sub.basicInfo['emgFkCod'] = '急诊科'
      sub.hlpgbpatientMsg.emgSeq = _emgSeq;
    })
    
    if(sub.hlpgbpatientMsg.tmpNbrFlg == ''||sub.hlpgbpatientMsg.tmpNbrFlg == null){
      sub.hlpgbpatientMsg.tmpNbrFlg = '1';
    }
  }

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
    if (newVal == '0' || newVal == '1') {
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

//监听病种
sub.hlpgbhideMsg.$watch('hlbzCod', function (newVal, oldVal) {
  if (newVal.indexOf('9') == -1) {
    sub.hlpgbpatientMsg.hlbzOther = ''
  }
});
  /**
 * @监听 -皮肤范围- 详情。if != '' , -皮肤范围-的值为1
 * @监听 -腹穿- 详情。if != '' , -腹穿-的值为1
 * @监听 -截瘫-部位平面的值为''。if != '1' , -截瘫-的值为0
 */

sub.hlpgbpatientMsg.$watch('fbFcDes', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && sub.hlpgbpatientMsg.fbFc != '1') {
    sub.hlpgbpatientMsg.fbFc = '1'
  }
});
/**
 * @监听 -皮肤范围- 是否勾选。if != '1' , -皮肤范围-详情的值为''
 * @监听 -腹穿- 是否勾选。if != '' , -腹穿-详情的值为''
 */
sub.hlpgbhideMsg.$watch('pfCod', function (newVal, oldVal) {
  if (newVal.indexOf('10') == -1) {
    sub.hlpgbpatientMsg.pfFw = ''
  }
})
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

/**
 * 监听胸部
 */
sub.hlpgbhideMsg.$watch('xbCod', function (newVal, oldVal) {
  if (newVal.indexOf('11') == -1) {
    sub.hlpgbpatientMsg.xbJyDes = ''
  }
  if (newVal.indexOf('12') == -1) {
    sub.hlpgbpatientMsg.xbXcDes = ''
  }
  if (newVal.indexOf('13') == -1) {
    sub.hlpgbpatientMsg.xbLeftDes = ''
  }
  if (newVal.indexOf('14') == -1) {
    sub.hlpgbpatientMsg.xbRightDes = ''
  }
});
//监听处理步骤
sub.hlpgbhideMsg.$watch('clbzCod', function (newVal, oldVal) {
  if (newVal.indexOf('10') == -1) {
    sub.hlpgbpatientMsg.clbzOther = ''
  }
  var arr = newVal.split(',');
  if (arr.indexOf('0') == -1) {
    sub.hlpgbpatientMsg.xyDes = ''
  }
});

function jzcsinsertuser_callback(data) {
  message_alert(data);
  setTimeout(function () {
    window.location.reload();
  }, 800)
}

function addPreDgnCod() {
  createmodalwindow("初步诊断", 800, 460, _baseUrl +'zyyqjs/querylrNew.do?emgSeq='+_emgSeq+'&&jbzdType=1&&trnumber=', 'no');
}
function openKnowledge() {
  createmodalwindow('知识库', 600, 560, _baseUrl + 'firstimp/toZsk.do')
}

function connectContent() {
  var StringContent = '';
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
  if(sub.hlpgbpatientMsg.workAddress != ''){
    StringContent += '单位/地址：' + sub.hlpgbpatientMsg.workAddress + '，';
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
  var tbCodList = sub.hlpgbmsgList.tbCodList,
  tbCod = sub.hlpgbpatientMsg.tbCod,
  innerTextTb = [];
  $.each(tbCodList, function (idx, val) {
    if ($.inArray(val['infocode'], tbCod) > -1) {
      innerTextTb.push(val['info']);
    }
  })
  if (innerTextTb != '') {
    StringContent += '头部：' + innerTextTb.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.tbOther.replace(/ /img, '') != '') {
    if (innerTextTb != '') {
      StringContent += sub.hlpgbpatientMsg.tbOther + '，';
    } else {
      StringContent += '头部：' + sub.hlpgbpatientMsg.tbOther + '，';
    }
  }

  var jbCodList = sub.hlpgbmsgList.jbCodList,
  jbCod = sub.hlpgbpatientMsg.jbCod,
  innerTextJb = [];
  $.each(jbCodList, function (idx, val) {
    if ($.inArray(val['infocode'], jbCod) > -1) {
      innerTextJb.push(val['info']);
    }
  })
  if (innerTextJb != '') {
    StringContent += '颈部：' + innerTextJb.join("，") + '，';
  }

  var pfCodList = sub.hlpgbmsgList.pfCodList,
  pfCod = sub.hlpgbpatientMsg.pfCod,
  innerTextPf = [];
  $.each(pfCodList, function (idx, val) {
    if ($.inArray(val['infocode'], pfCod) > -1) {
      if (val['infocode'] == '9') {
        if (sub.hlpgbpatientMsg.ylxssDes.replace(/ /img, '') != '') {
          innerTextPf.push(val['info'] + ':' + sub.hlpgbpatientMsg.ylxssDes);
        } else {
          innerTextPf.push(val['info']);
        }
      } else {
        innerTextPf.push(val['info']);
      }
    }
  })
  if (innerTextPf != '') {
    StringContent += '皮肤：' + innerTextPf.join("，") + '，';
  }
  if (sub.hlpgbpatientMsg.pfFw.replace(/ /img, '') != '') {
    if (innerTextTb != '') {
      StringContent += '范围：' + sub.hlpgbpatientMsg.pfFw + '，';
    } else {
      StringContent += '皮肤：' + sub.hlpgbpatientMsg.pfFw + '，';
    }
  }

  var xbCodList = sub.hlpgbmsgList.xbCodList,
      xbCod = sub.hlpgbpatientMsg.xbCod;
  if (xbCod.length > 0) {
    StringContent += "胸部：";
  }
  for (var i = 0; i < xbCodList.length; i++) {
    if ($.inArray(xbCodList[i].infocode, xbCod) > -1) {
      if (sub.hlpgbpatientMsg.xbJyDes != '' && xbCodList[i].infocode == '11') {
        StringContent += xbCodList[i].info + sub.hlpgbpatientMsg.xbJyDes  + '，';
      }else if(sub.hlpgbpatientMsg.xbXcDes != '' && xbCodList[i].infocode == '12'){
        StringContent += xbCodList[i].info + sub.hlpgbpatientMsg.xbXcDes  + '，';
      }else if(sub.hlpgbpatientMsg.xbLeftDes != '' && xbCodList[i].infocode == '13'){
        StringContent += xbCodList[i].info + sub.hlpgbpatientMsg.xbLeftDes  + '，';
      }else if(sub.hlpgbpatientMsg.xbRightDes != '' && xbCodList[i].infocode == '14'){
        StringContent += xbCodList[i].info + sub.hlpgbpatientMsg.xbRightDes  + '，';
      }else{
        StringContent += xbCodList[i].info + '，';
      }
    }
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
  var jzCodList = sub.hlpgbmsgList.jzCodList,
  jzCod = sub.hlpgbpatientMsg.jzCod,
  innerTextJz = [];
  $.each(jzCodList, function (idx, val) {
    if ($.inArray(val['infocode'], jzCod) > -1) {
      innerTextJz.push(val['info']);
    }
  })
  if (innerTextJz != '') {
    StringContent += '脊柱：' + innerTextJz.join("，") + '，';
  }
  var gpCodList = sub.hlpgbmsgList.gpCodList,
  gpCod = sub.hlpgbpatientMsg.gpCod,
  innerTextGp = [];
  $.each(gpCodList, function (idx, val) {
    if ($.inArray(val['infocode'], gpCod) > -1) {
      innerTextGp.push(val['info']);
    }
  })
  if (innerTextGp != '') {
    StringContent += '骨盆：' + innerTextGp.join("，") + '，';
  }
  var ggCodList = sub.hlpgbmsgList.ggCodList,
  ggCod = sub.hlpgbpatientMsg.ggCod,
  innerTextGg = [];
  $.each(ggCodList, function (idx, val) {
    if ($.inArray(val['infocode'], ggCod) > -1) {
      innerTextGg.push(val['info']);
    }
  })
  if (innerTextGg != '') {
    StringContent += '股骨：' + innerTextGg.join("，") + '，';
  }

  if (sub.aboutSco.bradenSco != '' && sub.aboutSco.bradenSco !== null) {
    StringContent += 'Braden评分:' + sub.aboutSco.bradenSco + '分，';
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
      if (sub.hlpgbpatientMsg.xyDes != '' && clbzCodList[i].infocode == '0') {
        StringContent += clbzCodList[i].info + sub.hlpgbpatientMsg.xyDes + '升/分' + '，';
      }else{
        StringContent += clbzCodList[i].info + '，';
      }
    }
  }
  if (sub.hlpgbpatientMsg.clbzOther != '') {
    StringContent += sub.hlpgbpatientMsg.clbzOther +'，'
  }
  if(sub.hlpgbpatientMsg.jmsyPv != ''||sub.hlpgbpatientMsg.jmsyCv != ''){
    if(sub.hlpgbpatientMsg.jmsyPv != ''){
      StringContent += '静脉输液：PV：'+ sub.hlpgbpatientMsg.jmsyPv +'，CV：'+sub.hlpgbpatientMsg.jmsyCv +'，'
    }else{
      StringContent += '静脉输液：CV'+ sub.hlpgbpatientMsg.jmsyCv +'，'
    }
  }

  var xqylgCodList = sub.hlpgbmsgList.xqylgCodList,
  xqylgCod = sub.hlpgbpatientMsg.xqylgCod,
  innerTextXqyl = [];
  $.each(xqylgCodList, function (idx, val) {
    if ($.inArray(val['infocode'], xqylgCod) > -1) {
      innerTextXqyl.push(val['info']);
    }
  })
  if (innerTextXqyl != '') {
    StringContent += '胸腔引流管：' + innerTextXqyl.join("，") + '，';
  }
  if(sub.hlpgbpatientMsg.jybzBw != ''){
    StringContent += '加压包扎部位：' + sub.hlpgbpatientMsg.jybzBw +'，'
  }
  if(sub.hlpgbpatientMsg.jbgdBw != ''){
    StringContent += '夹板固定部位：' + sub.hlpgbpatientMsg.jbgdBw +'，'
  }
  if(sub.hlpgbpatientMsg.qyBw != ''){
    StringContent += '牵引部位：' + sub.hlpgbpatientMsg.qyBw +'，'
  }
  if(sub.hlpgbpatientMsg.xxDat != ''){
    StringContent += '血型时间：' + sub.hlpgbpatientMsg.xxDat +'，'
  }
  if(sub.hlpgbpatientMsg.pxDat != ''){
    StringContent += '配血时间：' + sub.hlpgbpatientMsg.pxDat +'，'
  }
  if(sub.hlpgbpatientMsg.sxDat != ''){
    StringContent += '输血时间：' + sub.hlpgbpatientMsg.sxDat +'，'
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

var _pageFlag = 'jzcs';

  $(function () {
    getMsgList();
    sub.getAbnDriver();
  })