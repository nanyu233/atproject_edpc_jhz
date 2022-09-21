var editAlertMsg = {
  ksfz: {
    emgDat: "预检时间必填",
    mpi: "病历号必填",
    // vstCad: "就诊卡号必填",
    cstNam: "姓名必填",
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "就诊科室必填",
    // modLvlCod: '修订分级必填'
  },
  child: {
    emgDat: "预检时间必填",
    mpi: "病历号必填",
    // vstCad: "就诊卡号必填",
    cstNam: "姓名必填",
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "就诊科室必填",
    // modLvlCod: '修订分级必填'
  },
  adult: {
    emgDat: "预检时间必填",
    mpi: "病历号必填",
    // vstCad: "就诊卡号必填",
    cstNam: "姓名必填",
    arvChlCod: "到院方式必填",
    algTypCod: '请选择相应的过敏内容',
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "就诊科室必填",
    // modLvlCod: '修订分级必填'
  },
  mass: {
    emgDat: "预检时间必填",
    mpi: "病历号必填",
    // vstCad: "就诊卡号必填",
    cstNam: "姓名必填",
    preDgnCod: "主诉症状必填",
    cstDspCod: "病人去向必填",
    emgFkCod: "就诊科室必填",
    // modLvlCod: '修订分级必填'
  }
};

var jsbrFun = {
  getMsgList: function () {
    publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findEmgList_zyy.do', isAsync: false }, { emgSeq: _emgSeq, _t: Date.parse(new Date()), editbedflg: '1' }, function (res) {
      initDictList(res);
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
        // var _nrsList = ['nrsTtbw', 'nrsTtbwQt', 'nrsTtxz', 'nrsTtxzQt', 'nrsTtsj', 'nrsTtkz', 'nrsSco', 'nrsMemo'];
        var _nrsList = ['nrsSco', 'ttpfNr', 'ttpfTypeCod'];
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
      if(res.hspDdfxpgbInfCustom){
        var _morseCodList = ['zf', 'jsgyywddCod', 'dyygjbpdCod', 'xzfzCod', 'jmzlsyddgfxyCod', 'btCod', 'rznlCod', 'hlcsCod', 'MorseQk','ddfxpgbSeq'];
        for (var i = 0; i < _morseCodList.length; i++) {
          vm.aboutMorse[_morseCodList[i]] = res.hspDdfxpgbInfCustom[_morseCodList[i]] || '';
        }
        vm.patientMsg.zf = res.hspDdfxpgbInfCustom.zf
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
      var _multiCheckKeyList = ['ksfz', 'cmpPsnCod', 'algTypCod', 'pastHisCod', 'frCod'];
      if ($.inArray(key, _multiCheckKeyList) > -1) {
        vm.hideMsg[key] = res[key] || '';
        vm.patientMsg[key] = res[key] ? res[key].split(",") : [];
        if (key != 'algTypCod') {
          if (key === 'pastHisCod') {
            if ($.inArray('450', vm.patientMsg[key]) > -1) {
              vm.isShowPastHis = true
            }
          }
          for (var i = 0; i < vm.getMsg[key + 'List'].length; i++) {
            if ($.inArray(vm.getMsg[key + 'List'][i]['infocode'], vm.patientMsg[key]) > -1) {
              vm.getMsg[key + 'List'][i].checked = true
            }
          }
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
            if (key === 'cstAgeCod') {
              if (res[key] == null || res[key] == '') {
                res[key] = '0'
              }
            }
            if (res[key] === null) {
              res[key] = ''
            }
            vm.patientMsg[key] = res[key];
          }
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
            for (var i = 0; i < vm.getMsg.jzkscompctlList.length; i++) {
              if (res[key] == vm.getMsg.jzkscompctlList[i].comno) {
                vm.getMsg.jzkscompctlList[i].checked = true
              }
            }
          }
          if (key === 'patientTyp') {
            if (res[key] == '3') {
              vm.patientMsg.pregnant = '1';
            }
          }
        }
        var _checked_key_list = ['arvChlCod', 'mnsSitCod', 'senRctCod', 'senStuCod','cstDspCod', 'modLvlCod', 'refusedSurvey'];
        if ($.inArray(key, _checked_key_list) > -1) {
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
    if (res.xtlcflg == '1') {
      $('.xtlcflg').addClass('active')
    }
    if (res.czlcflg == '1') {
      $('.czlcflg').addClass('active')
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
    if (res.preDgnCod) { // 主述看看有没有分级level
      publicFun.httpServer({ url: _baseUrl + 'firstimp/queryZsk_result.do' }, {page: 1,rows: 10000}, function (data) {
        vm.getMsg.totalCbyxList = data.rows;
        for (var k = 0; k < data.rows.length; k++) {
          if (data.rows[k].cbyx == res.preDgnCod) {
            $('#checkLevel').val(data.rows[k].yjdj);
          }
        }
      })
    }
    // 只要有出生日期并且年龄为空 [不判断auto了] res.preUsrNam === 'AUTO'
    if (publicFun.checkItemNull(res.cstAge) == true) {
      if (publicFun.checkItemNull(res.bthDat) == false) {
        vm.patientMsg.cstAge = publicFun.calculateAge(res.bthDat).Age;
        vm.patientMsg.cstAgeCod = publicFun.calculateAge(res.bthDat).type;
      }
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
      $.each(editAlertMsg.mass, function (key, val) {
        if (allPostMsg[key] === "" || allPostMsg[key] == null) {
          publicFun.alert(editAlertMsg.mass[key]);
          _returnCheck = false;
          return _returnCheck
        }
      });
    } else {
      $.each(checkMsgArr, function (key, val) {
        if (allPostMsg[key] === "" || allPostMsg[key] == null) {
          if (key === 'nrsSco' || key === 'mnsSitCod' || key == 'arvChlCod' || key == 'algHon') {
            if (key === 'mnsSitCod') {
              if (vm.patientMsg.cstSexCod != '1' || vm.patientMsg.patientTyp == '2') {
                _returnCheck = true;
                return true
              }
            }
            if (vm.patientMsg.patientTyp === '2') {
              _returnCheck = true;
              return true
            }
          }
          if (key === 'algTypCod') {
            if (vm.patientMsg.algHon != '2') {
              _returnCheck = true;
              return true
            }
          }
          if (key === 'mpi') {
            if ((vm.patientMsg.jzxh == '' || vm.patientMsg.jzxh == null)) {
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
  vm.getAbnDriver();
  // isShowKnowledge();
  // getKnowledgeList();
})