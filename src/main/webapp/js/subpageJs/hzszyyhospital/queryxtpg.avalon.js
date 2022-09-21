$(function () {
  getMsgList();
})

function getMsgList() {
  vm.initPanel();
  var getMsgUrl = _baseUrl + 'zyyxtpg/findXtpgList.do';
  publicFun.httpServer({ url: getMsgUrl }, { _t: Date.parse(new Date()) }, function (data) {
    var msgList = data.resultInfo.sysdata;
    if (data.resultInfo.type == '1') {
      $.each(msgList, function (key, val) {
        if (vm.systemList.hasOwnProperty(key)) {
          $.each(val, function (idx, valu) {
            valu['checked'] = false
          })
          vm.systemList[key] = val;
        }
      });
    }
    var getMsgUrl = _baseUrl + "zyyxtpg/getTheFirstScore.do",
      getMsgData = {
        emgSeq: _emgSeq,
        date: new Date().toTimeString()
      };
    getPatientMsg(getMsgUrl, getMsgData);
  });
}

/**
 * 获取护理评估下新增的四个评分的值 并进行赋值
 * 
 * @param {any} url 
 * @param {any} data 
 */
function getPatientMsg(url, data) {
  publicFun.httpServer({ url: url }, data, function (res) {
    var _res = res;
    var checkBoxList = getCheckBoxList(); // 获取带有checkbox的字符串列表
    var checkBoxListSpc = ["adlJsScoNew", "adlXizScoNew", "adlXsScoNew", "adlCyScoNew", "adlKzdbScoNew", "adlKzxbScoNew", "adlScsScoNew", "adlCyzyScoNew", "adlXingzScoNew", "adlSxltScoNew"],
      brandScoList = ['bradenGjCod', 'bradenCsCod', 'bradenHdnlCod', 'bradenYdnlCod', 'bradenYyCod', 'bradenMchjqlCod'],
      aboutzcddList = ['zcddexpfYnbmdd', 'zcddexpfYsza', 'zcddexpfSlza', 'zcddexpfHdza', 'zcddexpfNl', 'zcddexpfTnxr', 'zcddexpfTyxy', 'zcddexpfZyywjr', 'zcddexpfJrpb', 'zcddexpfMy'],
      aboutAdlList = ['adlJsSco', 'adlXizSco', 'adlXsSco', 'adlCySco', 'adlKzdbSco', 'adlKzxbSco', 'adlScsSco', 'adlCyzySco', 'adlXingzSco', 'adlSxltSco'];
    for (var _key in _res['hspBradenInfCustom']) {
      assignment(vm.aboutbraden, _res.hspBradenInfCustom);
    }
    for (var _key in _res['hspAdlInfCustom']) {
      if (vm.aboutAdl.hasOwnProperty(_key)) {
        var _value = _res['hspAdlInfCustom'][_key] || '';
        vm.aboutAdl[_key] = _value;
        if ($.inArray(_key, checkBoxListSpc) > -1 && _value != '') {
          var length = _key.toString().length;
          var key = _key.toString().substring(0, length - 3);
          $.each(vm.systemList[key + "List"], function (idx, val) {
            if (val['infoid'] == _value) {
              val['checked'] = true
            }
          })
        }
        if (_key == 'adlHlylcd' && _value != '') {
          $.each(vm.systemList[_key + "List"], function (idx, val) {
            if (val['infocode'] == _value) {
              val['checked'] = true
            }
          })
        }
      }
      if (vm.aboutAdl.hasOwnProperty('adlSco')) {
        vm.aboutAdl['adlSco'] = _res['hspAdlInfCustom']['adlSco'];
      }
    }
    for (var _key in _res['hspZcddexpfInfCustom']) {
      assignment(vm.aboutzcdd, _res.hspZcddexpfInfCustom);
      var _valuethis = _res['hspZcddexpfInfCustom'][_key] || '';
      if ($.inArray(_key, aboutzcddList) > -1 && (_valuethis == '' || _valuethis == null)) {
        try {
          vm.aboutzcdd[_key + 'num'] = 0;
        } catch (e) {}
      } else {
        try {
          vm.aboutzcdd[_key + 'num'] = (_valuethis);
        } catch (e) {}
      }
      if (vm.aboutzcdd.hasOwnProperty('zcddexpfSco')) {
        vm.aboutzcdd['zcddexpfSco'] = _res['hspZcddexpfInfCustom']['zcddexpfSco'];
      }
    }
    for (var _key in _res['hspDdfxpgbInfCustom']) { 
      if(_key == 'hlcsCod'){
        if(_res['hspDdfxpgbInfCustom'][_key] != null && _res['hspDdfxpgbInfCustom'][_key] != ''){
          vm.xtpghideMsg[_key] = _res['hspDdfxpgbInfCustom'].hlcsCod;
          vm.aboutmorse[_key] = _res['hspDdfxpgbInfCustom'].hlcsCod.split(',');
          $.each(vm.aboutmorse[_key], function (id, value) {
            $.each(vm.systemList[_key+'List'], function (idx, val) {
              if (val['infocode'] == value) {
                val['checked'] = true
              }
            })
          })
        }
      }else if (vm.aboutmorse.hasOwnProperty(_key)) {
        var _value = _res['hspDdfxpgbInfCustom'][_key] || '';
        vm.aboutmorse[_key] = _value;
        if ($.inArray(_key, checkBoxList) > -1 && _value != '') {
          $.each(vm.systemList[_key + 'List'], function (idx, val) {
            if (val['remark'] == _value) {
              val['checked'] = true
            }
          })
        }
      }
    }
    var _nrsObj = _res['hspNrsInfCustom'];
    for (var _key in _nrsObj) {
      vm.systemtMsg['nrsSco'] = _nrsObj['nrsSco'];
      vm.systemtMsg['ttpfTypeCod'] = _nrsObj['ttpfTypeCod'];
      vm.systemtMsg['ttpfNr'] = _nrsObj['ttpfNr'];
    }
    if (_ageUnit != '岁' || (_ageUnit == '岁' && _cstAgeNew != '' && _cstAgeNew < 14)) {
      getMsgListC(_res['hspFallriskInf']);
    } else {
      getMsgList2(_res['hspFallriskInf']);
    }
    vm.getParentInfo()
  })
}

function assignment(toObj, res) {
  var checkBoxList = getCheckBoxList(); // 获取带有checkbox的字符串列表
  for (var _key in res) {
    if (toObj.hasOwnProperty(_key)) {
      var _value = res[_key] || '';
      toObj[_key] = _value;
      if ($.inArray(_key, checkBoxList) > -1 && _value != '') {
        $.each(vm.systemList[_key + 'List'], function (idx, val) {
          if (val['infocode'] == _value) {
            val['checked'] = true
          }
        })
      }
    }
  }
}

function getCheckBoxList() {
  return ["jsgyywddCod","dyygjbpdCod","xzfzCod","jmzlsyddgfxyCod","btCod","rznlCod","bradenGjCod", "bradenCsCod", "bradenHdnlCod", "bradenYdnlCod", "bradenYyCod", "bradenMchjqlCod", "adlJsSco", "adlXizSco", "adlXsSco", "adlCySco", "adlKzdbSco", "adlKzxbSco", "adlScsSco", "adlCyzySco", "adlXingzSco", "adlSxltSco", "nrsTtsj"];
}

/**
 *@ 不勾选引流管之后 设置其子项为空
 */
vm.systemtMsg.$watch('dgpgYlgFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal === '0' || newVal == '') {
    vm.systemtMsg.ylgDgmcCod = '';
    vm.systemtMsg.ylgDgsd = '';
    vm.systemtMsg.ylgTcFlg = '';
    vm.systemtMsg.ylgYlyys = '';
    vm.systemtMsg.ylgGrjxFlg = '';
    vm.systemtMsg.ylgBgFlg = '';
    var obj = document.getElementById('ducttable');
    if (obj.rows.length != 1) {
      for (var i = obj.rows.length - 1; i >= 1; i--) {
        obj.deleteRow(i);
      }
    }
  }
});

vm.systemtMsg.$watch('dgpgQtFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal === '0' || newVal == '') {
    vm.systemtMsg.ylgDgmcCodA = '';
    vm.systemtMsg.ylgDgsdA = '';
    vm.systemtMsg.ylgTcFlgA = '';
    vm.systemtMsg.ylgYlyysA = '';
    vm.systemtMsg.qtGrjxFlg = '';
    vm.systemtMsg.qtBgFlg = '';
    var obj = document.getElementById('ducttableA');
    if (obj.rows.length != 1) {
      for (var i = obj.rows.length - 1; i >= 1; i--) {
        obj.deleteRow(i);
      }
    }
  }
});

function postSystemMsg(type) {
  if (tableValue('addA', 'addB', 'addC', 'addD','0') && tableValue('addE', 'addF', 'addG', 'addH','1')) {
    if (vm.systemtMsg.xtpgHs.replace(/ /img, '') == '') {
      publicFun.alert("护士必填！");
      return false;
    }
    if (vm.systemtMsg.crtDat == '') {
      publicFun.alert("创建日期必填！");
      return false;
    }
    /*else if(vm.systemtMsg.xtpgSjhs.replace(/ /img, '') == ''){
        publicFun.alert("上级护士必填！");
        return false;
    }*/
    var stringAll = connectField();
    if (stringAll != '') {
      $('#bigDataDiv').show();
      var finalField = stringAll.substring(0, stringAll.length - 1);//截取开始到长度减-1的字符串，去掉逗号
      finalField += ';';
      $('#bigDataDiv').val(finalField);
    } else if (stringAll == '') {
      publicFun.alert("请先填写系统评估单！");
      return false;
    }
    if (vm.systemtMsg.ttpfTypeCod == '4') {
      vm.systemtMsg.ttpfNr = JSON.stringify(vm.systemtMsg.flaccList)
    }
    if (vm.systemtMsg.ttpfTypeCod == '5') {
      vm.systemtMsg.ttpfNr = JSON.stringify(vm.systemtMsg.copptList)
    }
    _confirm('确定提交吗？', null, function () {
      if (type == 'a') {
        jquerySubByFId('userform', insert_callback, null, "json");
      }
    })
  }
}

function insert_callback(data) {
  if (data.resultInfo && data.resultInfo.messageCode == '109') {
    message_alert(data, function () {
      window.location.href = _baseUrl + "/first.do";
    });
  } else {
    message_alert(data);
    if (data.resultInfo.type == '1') {
      var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
      setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 0);
    }
  }
}