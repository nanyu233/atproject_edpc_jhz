var dataBarFlg = false;
var editxtpgFun = {
  getMsgList: function () {
      vm.initPanel();
      publicFun.httpServer({ url: _baseUrl + 'zyyxtpg/findXtpgList.do'}, { _t: Date.parse(new Date()) }, function (data) {
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
      var getMsgUrl = _baseUrl + "zyyxtpg/findxtpgByxtpgSeq_pf.do",
        getMsgData = {
          xtpgSeq: _xtpgSeq,
          emgSeq: _emgSeq,
          date: new Date().toTimeString()
        };
      editxtpgFun.getPatientMsg(getMsgUrl, getMsgData);
    })
  },
  getPatientMsg: function (url, data) {
    publicFun.httpServer({ url: url }, data, function (res) {
      var _res = res.resultInfo.sysdata;
      var checkBoxList = editxtpgFun.getCheckBoxList(); // 获取带有checkbox的字符串列表
      var checkBoxListSpc = ["adlJsScoNew", "adlXizScoNew", "adlXsScoNew", "adlCyScoNew", "adlKzdbScoNew", "adlKzxbScoNew", "adlScsScoNew", "adlCyzyScoNew", "adlXingzScoNew", "adlSxltScoNew"],
        brandScoList = ['bradenGjCod', 'bradenCsCod', 'bradenHdnlCod', 'bradenYdnlCod', 'bradenYyCod', 'bradenMchjqlCod'],
        aboutzcddList = ['zcddexpfYnbmdd', 'zcddexpfYsza', 'zcddexpfSlza', 'zcddexpfHdza', 'zcddexpfNl', 'zcddexpfTnxr', 'zcddexpfTyxy', 'zcddexpfZyywjr', 'zcddexpfJrpb', 'zcddexpfMy'],
        aboutAdlList = ['adlJsSco', 'adlXizSco', 'adlXsSco', 'adlCySco', 'adlKzdbSco', 'adlKzxbSco', 'adlScsSco', 'adlCyzySco', 'adlXingzSco', 'adlSxltSco'];
      for (var _key in _res['hspBradenInfCustom']) {
        editxtpgFun.assignment(vm.aboutbraden, _res.hspBradenInfCustom);
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

      for (var _key in _res['hspZcddexpfInfCustom']) {
        editxtpgFun.assignment(vm.aboutzcdd, _res.hspZcddexpfInfCustom);
        var currentValue = _res['hspZcddexpfInfCustom'][_key] || '';
        if ($.inArray(_key, aboutzcddList) > -1 && (currentValue == '' || currentValue == null)) {
          try {
            vm.aboutzcdd[_key + 'num'] = 0;
          } catch (e) {}
        } else {
          try {
            vm.aboutzcdd[_key + 'num'] = (currentValue);
          } catch (e) {}
        }
        if (vm.aboutzcdd.hasOwnProperty('zcddexpfSco')) {
          vm.aboutzcdd['zcddexpfSco'] = _res['hspZcddexpfInfCustom']['zcddexpfSco'];
        }
      }
      for (var _key in _res['hspNrsInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspNrsInfCustom);
        if (vm.systemtMsg.hasOwnProperty('nrsSco')) {
          vm.systemtMsg['nrsSco'] = _res['hspNrsInfCustom']['nrsSco'];
        }
      }
      for (var _key in _res['hspXtpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspXtpgInfCustom);
      }
      if (_ageUnit != '岁' || (_ageUnit == '岁' && _cstAgeNew != '' && _cstAgeNew < 14)) {
        getMsgListC(_res['hspFallriskInfCustom']);
      } else {
        getMsgList2(_res['hspFallriskInfCustom']);
      }
      vm.getParentInfo()
    });

    var getMsgUrl = _baseUrl + "zyyxtpg/findxtpgByxtpgSeq_Pgo.do",
      getMsgData = {
        xtpgSeq: _xtpgSeq,
        emgSeq: _emgSeq,
        date: new Date().toTimeString()
      };
    publicFun.httpServer({ url: getMsgUrl }, getMsgData, function (res) {
      var _res = res.resultInfo.sysdata;
      for (var _key in _res['hspSjxtpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspSjxtpgInfCustom);
      }
      for (var _key in _res['hspHxxtpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspHxxtpgInfCustom);
      }
      for (var _key in _res['hspXxgxtpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspXxgxtpgInfCustom);
      }
      for (var _key in _res['hspXhxtpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspXhxtpgInfCustom);
      }
      for (var _key in _res['hspMnszxtpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspMnszxtpgInfCustom);
      }
      for (var _key in _res['hspGgjpfxtInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspGgjpfxtInfCustom);
      }
      for (var _key in _res['hspXlshpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspXlshpgInfCustom);
      }
      for (var _key in _res['hspDgpgInfCustom']) {
        editxtpgFun.assignValue(vm.systemtMsg, _res.hspDgpgInfCustom);
      }
      if (_res['hspDgpgInfCustom']) {
        //var hspDgpgclrInfs = JSON.parse(JSON.stringify(_res.hspDgpgclrInfs));
        var hspDgpgclrInfs = _res.hspDgpgclrInfs;
        var ylgInfs = [],
            qtInfs = [];
        $.each(hspDgpgclrInfs,function(idx,val){
          if(val.dgpgclrType == '0'){
            ylgInfs.push(val)
          }else{
            qtInfs.push(val)
          }
        })
        DynamicTableAdd(ylgInfs, 'addA', 'addB', 'addC', 'addD','ducttable');
        DynamicTableAdd(qtInfs, 'addE', 'addF', 'addG', 'addH','ducttableA');
      }
      if (_res['hspSjxtpgInfCustom']) {
        if (vm.systemtMsg.sjxtpgYssubCod) {
          vm.systemtMsg.showselect0 = true;
        }
        if (vm.systemtMsg.sjxtpgYssubCodb) {
          vm.systemtMsg.showselect1 = true;
        }
      }
    });
  },
  assignment: function (toObj, res) {
    var checkBoxList = editxtpgFun.getCheckBoxList(); // 获取带有checkbox的字符串列表
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
  },
  assignValue: function (toObj, res) {
    var checkBoxList = editxtpgFun.getCheckBoxList(); // 获取带有checkbox的字符串列表
    var doubleList = ["hlcsCod","xtpgAqcsCod", "nrsTtbw", "nrsTtxz", "nrsTtkz", "xhxtpgFbytCod", "mnszxtpgPnCod", "mnszxtpgDjmwCod", "mnszxtpgRsztCod", "mnszxtpgYjCod", "mnszxtpgBdCod", "ggjpfxtPfysCod", "ggjpfxtSzfwCod", "sjxtpgYsCod", "sjxtpgYyCod", "ggjpfxtSkbwCod", "xlshpgJsztCod", "leftsJzSzCod", "rightsJzSzCod", "leftxJzSzCod", "rightxJzSzCod", "leftHxxtpgHxyCod", "rightHxxtpgHxyCod"];
    for (var key in res) {
      if (toObj.hasOwnProperty(key)) {
        if (key != 'bradenSco' && key != 'adlSco' && key != 'zcddexpfSco' && key != 'nrsSco') {
          var _value = res[key] || '';
          if ($.inArray(key, doubleList) > -1 && _value != '') {
            var _json = String(res[key]).split(",");
            vm.xtpghideMsg[key] = _value;
            toObj[key] = _json;
            $.each(vm.systemList[key + "List"], function (idx, val) {
              for (var i = 0; i < _json.length; i++) {
                if (val['infocode'] == _json[i]) {
                  val['checked'] = true;
                }
              }
            });
          } else {
            toObj[key] = _value;
            if (key === 'crtDat') {
              vm.systemtMsg[key] = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss');
            }
          }
          if ($.inArray(key, checkBoxList) > -1 && _value != '') {
            $.each(vm.systemList[key + 'List'], function (idx, val) {
              if (val['infocode'] == _value) {
                val['checked'] = true
              }
            })
          }
        }
      }
    }
  },
  getCheckBoxList: function () {
    return ["xtpgXlFlg","xtpgGgFlg","xtpgMnFlg","xtpgXhFlg","xtpgXxgFlg","xtpgHxFlg","xtpgSjFlg","jsgyywddCod","dyygjbpdCod","xzfzCod","jmzlsyddgfxyCod","btCod","rznlCod","bradenGjCod", "bradenCsCod", "bradenHdnlCod", "bradenYdnlCod", "bradenYyCod", "bradenMchjqlCod", "tkLefttkZtCod", "leftTbDgfy", "tkRighttkZtCod", "rightTbDgfy", "leftsSjJzl", "rightsSjJzl", "leftxSjJzl", "rightxSjJzl", "hxxtpgKsCod", "hxxtpgTxxzCod", "hxxtpgTlCod", "hxxtpgGyfsCod", "hxxtpgHxjc", "zzXxgxtpgBdmbdCod", "zzXxgxtpgBdmbdCod", "xxgxtpgMxxgcy", "xhxtpgYsCod", "xhxtpgSyCod", "xhxtpgFbpz", "xhxtpgFbcg", "xhxtpgCmyCod", "xhxtpgPbCod", "mnszxtpgNyxzCod", "mnszxtpgTxCod", "ggjpfxtPfwdCod", "ggjpfxtSzxzCod", "ggjpfxtSzcdCod", "ggjpfxtBttCod", "ggjpfxtKqnmCod", "ggjpfxtZknmCod", "ggjpfxtSkCod", "ggjpfxtGdCod", "ggjpfxtHdfsCod", "ggjpfxtKqyCod", "wzjmTcFlg", "wzjmGrjxFlg", "wzjmSfbgFlg", "cvcGrjxFlg", "cvcHyFlg", "sygCctjTcFlg", "sygGrjxFlg", "sygDxzccFlg", "sygBdxzFlg", "xxgxtpgXlZtCod", "yzXxgxtpgBdmbdCod", "xhxtpgFzCod", "zrXxgxtpgBdmbdCod", "yrXxgxtpgBdmbdCod", "nrsTtsj"];
  }
};

$(function () {
  editxtpgFun.getMsgList();
})

/**
 *@ 不勾选引流管之后 设置其子项为空
 */
vm.systemtMsg.$watch('dgpgYlgFlg', function (newVal, oldVal) {
  if (newVal === 0|| newVal === '0' || newVal === '' || newVal === null) {
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
    $("#addA0").val("");
    $("#addC0").val("");
  }
});

vm.systemtMsg.$watch('dgpgQtFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal === '0' || newVal === '' || newVal === null) {
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
    $("#addE0").val("");
    $("#addF0").val("");
  }
});
// function tableValue(idname, idname2, idname3, idname4) {
//   var tblength = document.getElementById('ducttable').rows.length;
//   var inAndOut = '';
//   for (var i = 0; i < tblength; i++) {
//     var adda = $("#" + idname + i + "").val(),
//       addb = $("#" + idname2 + i + "").val(),
//       addc = $("#" + idname3 + i + "").val(),
//       addcsel = $("#" + idname3 + i + "  option:selected").text(),
//       addd = $("#" + idname4 + i + "").val();
//     if (addd == '') {
//       addd = "未知";
//     }
//     if (addcsel == '请选择') {
//       addcsel = '';
//     }
//     if (adda == '') {
//       if (addb != '') {
//         publicFun.alert("导管评估中导管名称为空！");
//         return false;
//       } else {
//         inAndOut = inAndOut;
//         $("#hideylgDgmcCod").val(inAndOut);
//       }
//     } else {
//       inAndOut = inAndOut + adda + "," + addb + "," + addc + "," + addcsel + "," + addd + "#";
//       $("#hideylgDgmcCod").val(inAndOut);
//     }
//     //  console.log(inAndOut);
//   }
//   return true;

// }

function DynamicTableAdd(list, idname, idname2, idname3, idname4,tbName) {
  var k = list.length;
  for (var i = 0; i < k; i++) {
    if (list[i]['dgpgclrYlyys'] == '未知') {
      list[i]['dgpgclrYlyys'] = '';
    }
    if (list[i]['dgpgclrTc'] == '' || list[i]['dgpgclrTc'] == null) {
      list[i]['dgpgclrTc'] = '请选择';
    }
  }
  if (k != 0) {
      $("#" + idname + "0").val(list[0].ylgDgmcNam);
      //$("#"+idname+"0  option:selected").text(list[0].ylgDgmcCod);                
      $("#" + idname2 + "0").val(list[0].dgpgclrDgsd);
      $("#" + idname3 + "0").val(list[0].dgpgclrTcNam);
      $("#" + idname3 + "0  option:selected").text(list[0].dgpgclrTc);
      $("#" + idname4 + "0").val(list[0].dgpgclrYlyys);
      //ClearOptions(idname,0);
      ClearOptions(idname3, 0);
    for (var i = 1; i < k; i++) {
      addNewtr(idname, idname2, idname3, idname4,tbName);
      $("#" + idname + i + "").val(list[i].ylgDgmcNam);
      //$("#"+idname+i+"  option:selected").text(list[i].ylgDgmcCod);               
      $("#" + idname2 + i + "").val(list[i].dgpgclrDgsd);
      $("#" + idname3 + i + "").val(list[i].dgpgclrTcNam);
      $("#" + idname3 + i + "  option:selected").text(list[i].dgpgclrTc);
      $("#" + idname4 + i + "").val(list[i].dgpgclrYlyys);
      //ClearOptions(idname,i);
      ClearOptions(idname3, i);
    }
  }
}

function ClearOptions(idname, i) {
  $("#" + idname + i + " option").each(function () {
    var val = $(this).val();
    if ($("#" + idname + i + " option[value='" + val + "']").length > 1)
      $("#" + idname + i + " option[value='" + val + "']:gt(0)").remove();

  });
}

function postSystemMsg() {
  if (tableValue('addA', 'addB', 'addC', 'addD','0') && tableValue('addE', 'addF', 'addG', 'addH','1')) {
    if (vm.systemtMsg.xtpgHs.replace(/ /img, '') == '') {
      publicFun.alert("护士必填！");
      return false;
    }
    /*
    else if(vm.systemtMsg.xtpgSjhs.replace(/ /img, '') == ''){
        publicFun.alert("上级护士必填！");
        return false;
    }*/
    // if (dataBarFlg == false) {
    //     publicFun.alert("请确认已经重新生成汇总记录！");
    //     return false;
    // }
    var stringAll = connectField();
    if (stringAll != '') {
      $('#bigDataDiv').show();
      var finalField = stringAll.substring(0, stringAll.length - 1);//截取开始到长度减-1的字符串，去掉逗号
      finalField += ';';
      vm.systemtMsg.xtpgJlhz = finalField;
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
      jquerySubByFId('userform', insertuser_callback, null, "json");
    })
  }
}

function insertuser_callback(data) {
  if (data.resultInfo && data.resultInfo.messageCode == '109') {
    message_alert(data, function () {
      window.location.href = _baseUrl + "/first.do";
    });
  } else {
    message_alert(data);
    if (data.resultInfo.type == '1') {
      setTimeout(function () {
        window.location.reload();
      }, 800);
    }
  }
}
