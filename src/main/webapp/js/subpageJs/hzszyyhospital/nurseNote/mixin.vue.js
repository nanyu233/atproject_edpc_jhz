var _xtCodList = publicFun.getDict('XT_COD'), 
    _tkList = [{infocode: '0', info: '灵敏' }, {infocode: '1', info: '迟钝' }, {infocode: '2', info: '消失' }, {infocode: '3', info: '白内障' }, { infocode: '4', info: '眼球缺失' }];
var mixinNote = {
  data: {
    //获取后台配置列表

    getMsg: {
      xtCodList:_xtCodList,
      senRctCodList: [], // 意识状态
      jchlbaseList: [],
      rlbaseList: [],
      tkLeftCodList: JSON.parse(JSON.stringify(_tkList)),
      tkRightCodList: JSON.parse(JSON.stringify(_tkList)),
      clbaseList: [],
      amountList: [{ typeA: 'rlType', typeB: 'rl', typeC: 'rlNature', typeD: 'rlOther' }],
      amountListB: [{ typeA: 'clType', typeB: 'cl', typeC: 'clNature', typeD: 'clOther' }]
    },
    hide: {
      rlType: '', // 入量类型
      rlNature: '', // 入量性质
      rl: '', // 入量内容
      rlOther: '', // 入量其他
      rlContent: '', // 入量大字段
      cl: '',
      clType: '', // 出量类型
      clNature: '', // 出量性质
      clOther: '', // 出量其他
      clContent: '', // 出量大字段
      tkLeftCod: '',
      tkRightCod: ''
    },
    isShowBloodList:false
  },
  methods: {
    openBrdSco: function () {
        createmodalwindow('Braden评分', 800, 410, _baseUrl + 'hlpgb/toBradenSco.do?typeSource=hljld')
    },
    openAdlSco: function () {
        var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
        var _tabHeight = _bdHeight - 30;
        if (_bdHeight > 600) {
          _tabHeight = 600;
        }
        createmodalwindow('ADL评分', 700, _tabHeight, _baseUrl + 'hlpgb/toAdlSco.do?typeSource=hljld')
    },
    openZyfxSco: function () {
        var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
        var _tabHeight = _bdHeight - 30;
        if (_bdHeight > 610) {
          _tabHeight = 610;
        }
        createmodalwindow('安全转运风险评估单', 800, _tabHeight, _baseUrl + 'hlpgb/toZyfxpfSco.do?typeSource=hljld')
    },
    openNRSSco: function () {
        createmodalwindow('疼痛评分', 700, 540, _baseUrl + 'scorequery/toNrsGde.do?typeSource=hljld')
    },
    openGCSSco:function(){
        createmodalwindow('GCS评分', 500, 490, _baseUrl + 'hlpgb/toGcsSco.do?typeSource=hljld&emgSeq='+_emgSeq)
    },
    openMorse:function(){
        createmodalwindow('Morse评分', 800, 500, _baseUrl + 'hzszyyemg/queryMorse.do?typeSource=hljld')
    },
    // @@onlyNum 限制只能输入数字
    onlyNum: function (objName, attr, step, max) {
      if (sub[objName][attr] === null && sub[objName][attr] === undefined) {
        return
      }
      sub[objName][attr] = sub[objName][attr] + '';  // 将Number类型转化成String
      var _rtnVal = publicFun.onlyNumber(sub[objName][attr], step, max);
      sub[objName][attr] = _rtnVal;
      this.$set(sub[objName], attr, _rtnVal)
      sub.$forceUpdate();
      if (attr == 'sbpUpNbr' || attr == 'sbpDownNbr') {
        sub[objName][attr] = sub[objName][attr].replace(/[^0-9]/g, '')
        if (sub[objName][attr].substring(sub[objName][attr].length - 1, sub[objName][attr].length) == '.') {
          sub[objName][attr] = sub[objName][attr].substring(0, sub[objName][attr].length - 1)
        }
      }
    },
    // 添加一行
    addNewLine: function (list) {
      var _lth = sub.getMsg[list].length - 1;
      var typeName = '', typeMl = '', typeNature = '', typeClOther = '', alertMsg = '';
      if (list === 'amountList') {
        typeName = 'rlType';
        typeMl = 'rl';
        typeNature = 'rlNature';
        typeClOther = 'rlOther';
        alertMsg = '当前入量类型不可为空！'
      } else {
        typeName = 'clType';
        typeMl = 'cl';
        typeNature = 'clNature';
        typeClOther = 'clOther';
        alertMsg = '当前出量类型不可为空！'
      }
      if (_lth === 0) {
        if (!sub.hide[typeName]) {
          publicFun.alert(alertMsg);
          return
        }
      } else {
        if (!sub.hide[typeName + _lth]) {
          publicFun.alert(alertMsg);
          return
        }
      }
      var totalLen = sub.getMsg[list].length
      sub.getMsg[list].push({
        typeA: typeName + totalLen,
        typeB: typeMl + totalLen,
        typeC: typeNature + totalLen,
        typeD: typeClOther + totalLen
      })
    },
    deleteLine: function (list) {
      var _codList = [];
      if (list === 'amountList') {
        _codList = ['rlType', 'rl', 'rlNature', 'rlOther'];
      } else {
        _codList = ['clType', 'cl', 'clNature', 'clOther']
      }
      var beforeLen = sub.getMsg[list].length - 1
      if (beforeLen === 0) {
        return
      }
      sub.getMsg[list].splice(beforeLen, 1)
      _codList.map(function (ele) {
        sub.hide[ele + beforeLen] = ''
      })
    },
    checkValNull: function (item) {
      if (sub.hide[item] === '' || sub.hide[item] === null || sub.hide[item] === 'null' || sub.hide[item] === undefined) {
        return true
      } else {
        return false
      }
    },
    // 保存时提交验证出入量
    makeSureAmountVal: function (list) {
      var typeName = '', typeMl = '', typeContent = '', typeNature = '', typeClOther = '', alertMsg = '';
      if (list === 'amountList') {
        typeName = 'rlType';
        typeMl = 'rl';
        typeContent = 'rlContent';
        typeNature = 'rlNature';
        typeClOther = 'rlOther';
        alertMsg = '入量类型存在空白！'
      } else {
        typeName = 'clType';
        typeMl = 'cl';
        typeContent = 'clContent';
        typeNature = 'clNature';
        typeClOther = 'clOther';
        alertMsg = '出量类型存在空白！'
      }
      var content = '';
      for (var i = 0; i < sub.getMsg[list].length; i++) {
        var idx = i == 0 ? '' : i;
        if ((sub.checkValNull(typeName + idx) === true) && (sub.checkValNull(typeMl + idx) === true) && (sub.checkValNull(typeNature + idx) === true)) {
          content = content
        } else if ((sub.checkValNull(typeName + idx) === true) && (sub.checkValNull(typeMl + idx) === false || sub.checkValNull(typeNature + idx) === false)) {
          publicFun.alert(alertMsg);
          return false;
        } else {
          var _typeMlValue = '', _typeNatureValue = sub.hide[typeNature + idx], _typeClOtherValue = sub.hide[typeClOther + idx];
          if (sub.checkValNull(typeMl + idx) === true) {
            _typeMlValue = ''
          } else {
            _typeMlValue = sub.hide[typeMl + idx]
          }
          if (sub.checkValNull(typeNature + idx) === true) {
            _typeNatureValue = ''
          } else {
            _typeNatureValue = sub.hide[typeNature + idx]
          }
          if (sub.checkValNull(typeClOther + idx) === true) {
            _typeClOtherValue = ''
          } else {
            _typeClOtherValue = sub.hide[typeClOther + idx]
          }
          content = content + sub.hide[typeName + idx] + ',' + $('#' + typeMl + 'Select' + i + "  option:selected").text() + ',' + _typeClOtherValue + ','+ _typeMlValue + ',' + _typeNatureValue + ','+ '#';
        }
      }
      sub.hide[typeContent] = content;
      document.getElementById(typeContent).value = content;
      return true;
    },
    // @ 获取数据并赋值
    getMsgList: function () {
      var getMsgUrl = _baseUrl + 'zjszyyhljld/ajaxlist.do';
      publicFun.httpServer({ url: getMsgUrl}, {emgSeq: _emgSeq}, function (data) {
        var res = data.resultInfo.sysdata;
        for (var key in res) {
          if (sub.getMsg.hasOwnProperty(key)) {
            sub.getMsg[key] = res[key];
          }
        }
        if (_count === 0 || _count === '0') {
          // 尴尬啊 这边居然是变量 不在对象中
          // var _scoreList = ['nrsSco', 'gcsSco', 'nrsSeq', 'gcsSeq', 'adlSco', 'adlSeq', 'bradenSeq', 'bradenSco', 'zyfxpfSeq', 'zyfxpfSco','morseSco']
          // for (var i = 0; i < _scoreList.length; i++) {
          //   sub.aboutSco[_scoreList[i]] = _nrsSco;
          // }
          sub.importRecord('0')
          sub.aboutSco.nrsSco = _nrsSco;
          sub.aboutSco.gcsSco = _gcsSco;
          sub.aboutSco.nrsSeq = _nrsSeq;
          sub.aboutSco.gcsSeq = _gcsSeq;
          sub.aboutSco.adlSco = _adlSco;
          sub.aboutSco.adlSeq = _adlSeq;
          sub.aboutSco.bradenSeq = _bradenSeq;
          sub.aboutSco.bradenSco = _bradenSco;
          sub.aboutSco.zyfxpfSeq = _zyfxpfSeq;
          sub.aboutSco.zyfxpfSco = _zyfxpfSco;
          sub.aboutSco.ddfxpgbSeq = _morseSeq;
          sub.aboutSco.morseSco = _morseSco;
          sub.notePatientMsg.crtDat = res.hspemginfCustom.sqlDat;
        } else {
          // 非首笔放当前
          if (!sub.notePatientMsg.crtDat) {
            sub.notePatientMsg.crtDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
          }
        }
      });
    },
    showBlood: function (e,ea,typeB){
      e.stopPropagation();
      if(ea == '251'){
        sub.isShowBloodList = true
      }
      var _num = typeB.slice(2);
      if(_num != ''){
        var _top = parseInt(_num)*26 + 416
      }else{
        var _top = 416
      }
      $('.nursenote .sxList').css('top',_top)
    },
    chooseTranBlood:function(val,typeName){
      sub.hide[typeName] = val
    },
    cleanVal: function (cod, inputField, inputFieldB) {
      var _fieldList = ['tmpNbr', 'xy', 'xt', 'sbpUpNbr', 'pulse', 'hrtRte'];
      for (var i = 0; i < _fieldList.length; i++) {
        if (_fieldList[i] == inputField) {
          if (sub.notePatientMsg[cod] != 1) {
            sub.notePatientMsg[inputField] = '';
            if (inputFieldB) {
              sub.notePatientMsg[inputFieldB] = ''
            }
          }
        }
      }
      if (inputField == 'breNbr') {
        if (sub.notePatientMsg[cod] == 3) {
          sub.notePatientMsg[inputField] = ''
        }
      }
    },
    importAllSign: function () {
      createmodalwindow( _cstNam + "-生命体征", 800, 500, _baseUrl + 'hlpgb/to_vitalSigns.do?typeSource=nurseNote')
    },
    getImportFieldMsg: function () {
      publicFun.httpServer({ url: _baseUrl + 'heartRecord/importAssessment.do' }, {'emgSeq': _emgSeq}, function (data) {
        var res = data.resultInfo;
        if (res.type == 0) {
          alert_error(res.message)
        } else if (res.type == 1) {
          // alert_base(res.message)
        } else if (res.type == 2) {
          alert_warn(res.message)
        } else if (res.type == 3) {
          alert_info(res.message)
        }
        if (res.type == 1) {
          var dataInfo = res.sysdata;
          _xtpg = dataInfo.xtpgDes;
          _hzDes = dataInfo.traumaDes;
          _symSitDes = dataInfo.symSitDes;
        }
      })
    },
    cleanOtherText: function (selectVal, idx, obj) {
      var _index = idx == 0 ? '' : idx
      if (selectVal != '999') {
        sub.hide[obj + _index] = ''
      }
    },
    singleClick: function (attr, cod) {
      var _list = sub.notePatientMsg[attr].length;
      if (_list > 0) {
        sub.notePatientMsg[attr] = [cod]
      } else {
        sub.notePatientMsg[attr] = []
      }
      sub.hide[attr] = sub.notePatientMsg[attr].join('')
      sub.$forceUpdate();

    },
    // pgdType 0=入院护理评估 1=创伤入院护理评估
    importRecord: function (_pgdType) {
      publicFun.httpServer({url: _baseUrl + 'zjszyyhljld/impRyhlpgb.do'}, { "pgdType": _pgdType, "emgSeq": _emgSeq }, function (data) {
        var _obj = _pgdType === '1' ? 'hspJzcspgInfCustom' : 'hspHlpgbCustom';
        if (data.resultInfo.type == 1) {
          var _objMsg = data.resultInfo.sysdata[_obj];
          if (_objMsg) {
            var _list = ['tmpNbr', 'hrtRte', 'hrtRteFlg', 'breNbr', 'sbpUpNbr', 'sbpDownNbr', 'xy', 'senRctCod', 'xt', 'xtCod', 'xtFlg', 'szCod', 'tmpNbrFlg', 'breNbrFlg', 'sbpNbrFlg', 'xyFlg', 'pulse', 'pulseFlg', 'glsCod', 'tkLeftCod', 'tkLeft', 'tkLeftOther', 'tkRightCod', 'tkRight', 'tkRightOther'];
            for (var i = 0; i < _list.length; i++) {
              if (_list[i] == 'szCod') {
                sub.notePatientMsg['senRctCod'] = _objMsg[_list[i]]
              } else if (_list[i] == 'glsCod') {
                sub.notePatientMsg['xtCod'] = _objMsg[_list[i]]
              } else if (_list[i] === 'tkLeftCod' || _list[i] === 'tkRightCod') {
                if (_objMsg[_list[i]] !== '' && _objMsg[_list[i]] != null) {
                  sub.notePatientMsg[_list[i]] = _objMsg[_list[i]].split('')
                } else {
                  sub.notePatientMsg[_list[i]] = []
                }
              } else {
                if (_objMsg.tmpNbrFlg === '' || _objMsg.tmpNbrFlg == null) {
                  _objMsg.tmpNbrFlg = '1'
                }
                sub.notePatientMsg[_list[i]] = _objMsg[_list[i]]
              }
            }
          } else {
            publicFun.alert('当前无数据')
          }
        }
      })
    },
    // 导入入院护理评估评分功能
    importRecordScore: function () {
      publicFun.httpServer({url: _baseUrl + 'zjszyyhljld/getScore.do'}, { "emgSeq": _emgSeq }, function (data) {
        if (data.resultInfo.type == 1) {
          var res = data.resultInfo.sysdata['hspHlpgbCustom'];
          for (var key in res) {
            if (sub.aboutSco.hasOwnProperty(key)) {
              sub.aboutSco[key] = res[key] || ''
            }
          }
        } else {
          publicFun.alert('数据请求失败')
        }
      })
    }
  },
  watch: {
    'notePatientMsg.jchl': function (newVal) {
      sub.notePatientMsg.jchlStr = sub.notePatientMsg.jchl.join(',');
    },
    'notePatientMsg.jchlStr': function (newVal) {
      if(newVal.indexOf('121') == -1){
        sub.notePatientMsg.rssj = ''
      }
    }
  }
}