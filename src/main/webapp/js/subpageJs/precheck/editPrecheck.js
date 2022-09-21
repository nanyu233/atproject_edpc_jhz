var jlzgxgAlertMsg = {
  ksfz: {
    vstCad: "就诊卡号必填",
    emgDat: "预检时间必填",
    cstNam: "姓名必填",
    patientTyp: '患者类别必填',
    frDat: '发热日期必填',
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "分科必填"
  },
  child: {
    vstCad: "就诊卡号必填",
    cstNam: "姓名必填",
    patientTyp: '患者类别必填',
    // arvChlCod: "到院方式必填",
    // cmpPsnCod: "陪送人员必填",
    emgDat: "预检时间必填",
    frDat: '发热日期必填',
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "分科必填",
    // nrsSco: "疼痛情况(NRS)必填",
    // algHon: "是否过敏必填"
  },
  adult: {
    vstCad: "就诊卡号必填",
    emgDat: "预检时间必填",
    cstNam: "姓名必填",
    patientTyp: '患者类别必填',
    arvChlCod: "到院方式必填",
    // cmpPsnCod: "陪送人员必填",
    frDat: '发热日期必填',
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "分科必填",
    nrsSco: "疼痛情况(NRS)必填",
    algHon: "是否过敏必填"
  },
  mass: {
    patientTyp: '患者类别必填',
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "分科必填"
  }
};

var jsbrFun = {
  getMsgList: function () {
    publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findEmgList_zyy.do', isAsync: false }, { emgSeq: _emgSeq, _t: Date.parse(new Date()), editbedflg: '1' }, function (res) {
      var msgList = res.resultInfo.sysdata;
      jsbrjz = msgList;
      if (res.resultInfo.type == '1') {
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
            if (key === 'cardTypeList') {
              $.each(val, function (_idx, _val) {
                _val.checked = false;
              })
            }
            vm.getMsg[key] = val;
          }
        });
      }
      jsbrFun.getPatientMsg();
    });
  },
  getPatientMsg: function () {
    publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findHspemginfByemgSeq_jzt.do' }, {
      emgSeq: _emgSeq,
      date: new Date().toTimeString()
    }, function (res) {
      var _res = res.hspemginfCustom;
      jsbrFun.processingData(_res);
      if (res.hspsqlinfCustom) {
        var _zgCodList = ['sqlStaCod', 'sqlStaStr', 'sqlDepName', 'sqlDepCod', 'sqlDes', 'bedNam'];
        for (var i = 0; i < _zgCodList.length; i++) {
          vm.patientMsg[_zgCodList[i]] = res.hspsqlinfCustom[_zgCodList[i]] || '';
        }
        vm.patientMsg.sqlDat = res.hspsqlinfCustom.queryDate || '';
      }
      if (res.hspNrsInfCustom) {
        var _nrsList = ['nrsTtbw', 'nrsTtbwQt', 'nrsTtxz', 'nrsTtxzQt', 'nrsTtsj', 'nrsTtkz', 'nrsSco', 'nrsMemo'];
        for (var i = 0; i < _nrsList.length; i++) {
          vm.patientMsg[_nrsList[i]] = res.hspNrsInfCustom[_nrsList[i]];
        }
      } else {
        vm.patientMsg.nrsSco = null;
      }
      if (res.hspFastInfCustom) {
        var fastList = ['mtCod', 'szthCod', 'wlCod', 'czFlag'];
        for (var i = 0; i < fastList.length; i++) {
          vm.patientMsg[fastList[i]] = res.hspFastInfCustom[fastList[i]] || '';
        }
      }
      if (res.hspHlpgbCustom) {
        if (res.hspHlpgbCustom.pgbFlag === 1 || res.hspHlpgbCustom.pgbFlag === '1') {
          vm.patientMsg.pgbFlag = 1;
          vm.patientMsg.pgbMsg = '已完成';
          sub.hlpgbpatientMsg.pgbFlag = 1;
        } else if (res.hspHlpgbCustom.pgbFlag === 0 || res.hspHlpgbCustom.pgbFlag === '0') {
          vm.patientMsg.pgbFlag = 0;
          vm.patientMsg.pgbMsg = '未完成';
          sub.hlpgbpatientMsg.pgbFlag = 1;
        } else {
          sub.hlpgbpatientMsg.pgbFlag = 0;
        }
      }
      if (res.hspPewsckInfCustom) {
        for (var _key in res.hspPewsckInfCustom) {
          if (vm.aboutPEWS.hasOwnProperty(_key)) {
            vm.aboutPEWS[_key] = res.hspPewsckInfCustom[_key] || ''
          }
        }
      }
      if (res.hspFallAssInfCustom) {
        vm.patientMsg.falAssCod = res.hspFallAssInfCustom.fallAssCod;
      }
    });
  },
  processingData: function (res) {
    /**
     * @特殊处理出生日期
     */
    res.bthDat = res.bthDatStr;
    var _dateKey = ['emgDat', 'docDat', 'checkDocDat', 'checkNurseDat'];
    for (var i = 0; i < _dateKey.length; i++) {
      if (res[_dateKey[i]]) {
        res[_dateKey[i]] = publicFun.timeFormat(res[_dateKey[i]], "yyyy/MM/dd hh:mm:ss")
      }
    }
    var _onlyDateKey = ['mnsLstDat', 'frDat'];
    for (var i = 0; i < _onlyDateKey.length; i++) {
      if (res[_onlyDateKey[i]]) {
        res[_onlyDateKey[i]] = publicFun.timeFormat(res[_onlyDateKey[i]], "yyyy/MM/dd")
      }
    }
    for (var key in res) {
      var _multiCheckKeyList = ['ksfz', 'cmpPsnCod', 'algTypCod', 'pastHisCod', 'refusedSurvey', 'frCod'];
      if ($.inArray(key, _multiCheckKeyList) > -1) {
        vm.hideMsg[key] = res[key] || '';
        vm.patientMsg[key] = res[key] ? res[key].split(",") : [];
        if (key === 'pastHisCod') {
          vm.arrToStr(key);
        }
      } else {
        if (vm.patientMsg.hasOwnProperty(key)) {
          // if (key === 'pregnantYdcxCod' || key === 'pregnantGsplCod' || key === 'bedid') {
          //   if (res[key] === null) {
          //     res[key] = ''
          //   }
          // }
          // 换了表 emg的这个字段不赋值了
          if (key !== 'falAssCod') {
            if (res[key] === null) {
              res[key] = ''
            }
            vm.patientMsg[key] = res[key];
          }
          $("#bigDataHlpgDiv").val(vm.patientMsg.symSitDes);
          if (key === 'specialOther') {
            if (res[key] != '' && res[key] != '#' && res[key] != null) {
              var _specialCod = res[key].split(','), _specialList = vm.getMsg[key + 'List'], _specialStr = '';
              for (var i = 0; i < _specialList.length; i++) {
                if ($.inArray(_specialList[i].infocode, _specialCod) > -1) {
                  _specialStr += _specialList[i].info + ',';
                }
              }
              if (_specialStr) {
                _specialStr = _specialStr.substr(0, _specialStr.length - 1);
                $('#specialContent').html(_specialStr)
              }
            }
          }
          if (key === 'emgFkCod') {
            vm.getEmgFkDocList(res[key]);
          }
        }
        if (key === 'patientTyp' || key === 'cardType') {
          for (var i = 0; i < vm.getMsg[key + 'List'].length; i++) {
            if (res[key] == vm.getMsg[key + 'List'][i]['infocode']) {
              vm.getMsg[key + 'List'][i].checked = true
            }
          }
        }
        if (vm.aboutMews.hasOwnProperty(key)) {
          if (res[key] === null) {
            res[key] = ''
          }
          vm.aboutMews[key] = res[key]
        }
        if (vm.aboutGCS.hasOwnProperty(key)) {
          vm.aboutGCS[key] = res[key]
        }
        if (vm.aboutCRAMS.hasOwnProperty(key)) {
          vm.aboutCRAMS[key] = res[key]
        }
      }
    }
    if (res.qtsjSeq) {
      $('.spChl-btn').addClass('active');
      publicFun.httpServer({ url: _baseUrl + 'qtsjgl/queryqtsjgl_result.do' }, {
        'startdate': '',
        'enddate': '',
        'hspQtsjglCustom.qtsjSeq': res.qtsjSeq,
        'page': 1,
        'rows': 10
      }, function (res) {
        var checkItem = res.rows[0];
        $('#massTitle').html('群体事件：');
        $('#massText').html(checkItem.qtsjNam);
      })
    }
    setTimeout(function () {
      if (res.senRctCod == "0" && res.senStuCod != "0") {
        vm.patientMsg.senStuCod = res.senStuCod
      }
      if (res.senStuCod == "0" && res.senRctCod != "0") {
        vm.aboutMews.senRctCod = res.senRctCod
      }
      vm.patientMsg.chkLvlCod = res.chkLvlCod;
      vm.patientMsg.modLvlCod = res.modLvlCod;
      vm.patientMsg.emgAreCod = res.emgAreCod;
      vm.patientMsg.isGetAjaxFlg = true;
    }, 0);
  },
  newCheckNull: function (checkMsgArr, allPostMsg) {
    var _returnCheck;
    _returnCheck = true;
    if (vm.patientMsg.qtsjFlg === '1' || vm.patientMsg.qtsjFlg === 1) {
      $.each(jlzgxgAlertMsg.mass, function (key, val) {
        if (allPostMsg[key] === "" || allPostMsg[key] == null) {
          publicFun.alert(jlzgxgAlertMsg.mass[key]);
          _returnCheck = false;
          return _returnCheck
        }
      });
    } else {
      $.each(checkMsgArr, function (key, val) {
        if (allPostMsg[key] === "" || allPostMsg[key] == null) {
          if (key === 'nrsSco' || key === 'mnsSitCod' || key == 'arvChlCod' || key == 'algHon') {
            if (vm.patientMsg.patientTyp === '2') {
              _returnCheck = true;
              return true
            }
          }
          if (key === 'frDat') {
            if (vm.aboutMews.tmpNbr < 38.5 || vm.aboutMews.tmpNbr == null) {
              _returnCheck = true;
              return true
            }
          }
          publicFun.alert(checkMsgArr[key]);
          _returnCheck = false;
          return _returnCheck
        }
      });
    }
    return _returnCheck
  }
};

$(function () {
  jsbrFun.getMsgList();
  vm.getAbnSco();
  isShowKnowledge();
  getKnowledgeList();
})