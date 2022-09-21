var dangerPart1fzList = [{ checked: false, infocode: '0', info: '完全瘫痪或完全行动障碍的患者，给与低跌倒风险的安全干预措施。', infoid: '1' },
{ checked: false, infocode: '14', info: '住院前6个月内2次及以上的跌倒经历的患者，在住院治疗期间按跌倒高风险患者给与安全干预措施。', infoid: '2' },
{ checked: false, infocode: '14', info: '此次住院期间患者有跌倒经历的，按跌倒高风险患者给与安全干预措施。', infoid: '3' },
{ checked: false, infocode: '14', info: '医院制度规定的特定患者为高跌倒风险患者（ICU、ICU1、EICU、抢救室、手术室的患者），即按跌倒高风险患者给予安全干预措施。', infoid: '4' }],
  ageList = [{ checked: false, infocode: '1', info: '60-69岁' }, { checked: false, infocode: '2', info: '70-79岁' }, { checked: false, infocode: '3', info: '>=80岁' }],
  fallHistoryList = [{ checked: false, infocode: '5', info: '最近6个月曾有不明原因跌倒经历' }],
  urineList = [{ checked: false, infocode: '2', info: '失禁', infoid: '1' }, { checked: false, infocode: '2', info: '频繁或紧迫的排泄', infoid: '2' }, { checked: false, infocode: '4', info: '失禁且频繁/紧迫的排泄', infoid: '3' }],
  useDrugsList = [{ checked: false, infocode: '3', info: '患者使用一种高跌倒风险的药物' }, { checked: false, infocode: '5', info: '患者使用2种或2种以上的高跌倒风险的药物' }, { checked: false, infocode: '7', info: '患者在过去的24小时内曾有手术镇静史' }],
  nursingList = [{ checked: false, infocode: '1', info: '患者携带1种护理装置' }, { checked: false, infocode: '2', info: '患者携带2种护理装置' }, { checked: false, infocode: '3', info: '患者携带3种或以上的护理装置' }],
  abilityList = [{ checked: false, infocode: '1', info: '患者移动、转运或行走时需要辅助或监督', infoid: '1' }, { checked: false, infocode: '2', info: '患者步态不稳定', infoid: '2' }, { checked: false, infocode: '2', info: '患者因视觉或听觉障碍而影响移动', infoid: '3' }],
  cognitiveList = [{ checked: false, infocode: '1', info: '患者定向力障碍' }, { checked: false, infocode: '2', info: '烦躁' }, { checked: false, infocode: '4', info: '认知限制或障碍' }, { checked: false, infocode: '0', info: '无' }];
otherList = [{ checked: false, infocode: '0', info: '以上条目均不符合' }];
var _nowTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
var vm = avalon.define({
  $id: 'fallDanger',
  systemList: {
    ////////////////////////////////////////////跌倒危险评分
    riskClassCodList: dangerPart1fzList, // 第一部分
    riskAgeoCodList: ageList, //年龄
    riskHisCodList: fallHistoryList, //跌倒史
    riskExcreteCodList: urineList, //排泄大便和小便
    riskDrugCodList: useDrugsList, //高跌倒风险
    riskMacCodList: nursingList,//患者护理装置
    riskActionCodList: abilityList,//活动能力
    riskOcognizeCodList: cognitiveList, // 认知
    riskOtherCodList: otherList
  },
  aboutFallDanger: {
    riskClassCod: [],//跌倒危险第一部分
    riskAgeoCod: '',//年龄
    riskHisCod: '', //跌倒史分值
    riskExcreteCod: '', //排泄大便和小便分值
    riskDrugCod: '', //高跌倒风险分值
    riskMacCod: '', //患者护理装置分值
    riskActionCod: [], //活动能力
    riskOcognizeCod: [], //认知
    riskOtherCod: '',
    riskSco: null, //总分
    duoxSco: null,//计算总分备用
    danxSco: null,//计算总分备用
    // memo: '', //备注
    riskAgeoCodnum: 0, //年龄
    riskHisCodnum: 0, //跌倒史分值
    riskExcreteCodnum: 0, //排泄大便和小便分值
    riskDrugCodnum: 0, //高跌倒风险分值
    riskMacCodnum: 0 //患者护理装置分值
  },
  fallhideMsg: {
    riskClassCod: '',//跌倒危险第一部分
    riskActionCod: '',
    riskOcognizeCod: '',
    hiddenMsg: '',
  },
  sysMsg:{
    createDate:_nowTime
  },

  //全部清除
  clearAll: function () {
    var clearList = ['riskAgeoCod', 'riskHisCod', 'riskExcreteCod', 'riskDrugCod', 'riskMacCod'],
      duoList = ['riskClassCod', 'riskActionCod', 'riskOcognizeCod'];

    $.each(clearList, function (key, val) {
      if (vm.aboutFallDanger.hasOwnProperty(val)) {
        vm.aboutFallDanger[val] = '';
        vm.aboutFallDanger[val + 'num'] = 0
      }
      if (vm.systemList.hasOwnProperty(val + 'List')) {
        $.each(vm.systemList[val + 'List'], function (idx, valu) {
          valu['checked'] = false
        })
      }
    })

    $.each(duoList, function (key, val) {
      if (vm.fallhideMsg.hasOwnProperty(val)) {
        vm.fallhideMsg[val] = '';
        vm.aboutFallDanger[val] = [];
      }
      if (vm.systemList.hasOwnProperty(val + 'List')) {
        $.each(vm.systemList[val + 'List'], function (idx, valu) {
          valu['checked'] = false
        })
      }
    })
    vm.aboutFallDanger['duoxSco'] = 0;
    vm.aboutFallDanger['riskOtherCod'] = '0';
    vm.systemList.riskOtherCodList[0]['checked'] = true;
    vm.aboutFallDanger['danxSco'] = 0;
    vm.aboutFallDanger['riskSco'] = 0;
  },
  Objradioclick: function (name, idx, objName) {
    var list = [];
    if (vm.aboutFallDanger.riskOtherCod == '0') {
      vm.systemList.riskOtherCodList[0]['checked'] = false;
      vm.aboutFallDanger.riskOtherCod = '';
    }
    list = vm.systemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      if (name == 'riskExcreteCod') {
        vm[objName][name] = list[idx]['infoid'];
      } else {
        vm[objName][name] = list[idx]['infocode'];
      }
      vm[objName][name + 'num'] = (list[idx]['infocode']);
    } else {
      vm[objName][name] = '';
      vm[objName][name + 'num'] = 0;
    }
    if (objName == 'aboutFallDanger') {
      var riskAgeoCod, riskHisCod, riskExcreteCod, riskDrugCod, riskMacCod;
      riskAgeoCod = parseInt(vm[objName].riskAgeoCodnum);
      riskHisCod = parseInt(vm[objName].riskHisCodnum);
      riskExcreteCod = parseInt(vm[objName].riskExcreteCodnum);
      riskDrugCod = parseInt(vm[objName].riskDrugCodnum);
      riskMacCod = parseInt(vm[objName].riskMacCodnum);
      vm[objName].danxSco = (riskAgeoCod) + (riskHisCod) + (riskExcreteCod) + (riskDrugCod) + (riskMacCod);
      if (vm[objName].danxSco <= 0 && vm[objName].duoxSco == null) {
        vm[objName].riskSco = null;
      } else if (vm[objName].danxSco <= 0 && vm[objName].duoxSco != null) {
        // 以下是两个多选值为0，不选中的时候
        if (vm[objName].duoxSco == 0) {
          if (parseInt(vm[objName].riskClassCod1num) != 1 && parseInt(vm[objName].rzfz4num) != 1) {
            vm[objName].riskSco = null;
          } else {
            vm[objName].riskSco = vm[objName].duoxSco - 0;
          }
        } else if (vm[objName].duoxSco > 0) {
          vm[objName].riskSco = vm[objName].duoxSco - 0;
        }
      } else if (vm[objName].danxSco > 0 && vm[objName].duoxSco == null) {
        vm[objName].riskSco = vm[objName].duoxSco - 0 + (vm[objName].danxSco - 0);
      } else if (vm[objName].danxSco > 0 && vm[objName].duoxSco != null) {
        vm[objName].riskSco = vm[objName].duoxSco - 0 + (vm[objName].danxSco - 0);
      }
      //   $('#danxVal').val(vm['aboutFallDanger'].danxSco);
    }
  },

  /**
   * @ 其他模块多选
   */
  otherCheckClick: function (objName, idx, name) {
    if (vm.aboutFallDanger.riskOtherCod == '0') {
      vm.systemList.riskOtherCodList[0]['checked'] = false;
      vm.aboutFallDanger.riskOtherCod = '';
    }
    var list = vm.systemList[objName + 'List'];
    var scoNum = parseInt(list[idx]['infocode']);
    if (objName != 'riskActionCod' && objName != 'riskClassCod') {
      _useNum = 'infocode';
    } else {
      _useNum = 'infoid';
    }
    var currentData = $.inArray((list[idx][_useNum]), vm[name][objName]);
    if (list[idx]['checked'] == false) {
      list[idx]['checked'] = true;
      if (currentData == -1) {
        vm[name][objName].push(list[idx][_useNum]);
        if (name == 'aboutFallDanger') {
          if (vm[name].riskSco == null || vm[name].duoxSco == null) {
            vm[name].riskSco = vm[name].riskSco || 0;
            vm[name].duoxSco = 0
          }
          vm[name].riskSco = vm[name].riskSco - 0 + scoNum;
          vm[name].duoxSco = vm[name].duoxSco - 0 + scoNum;
          if (vm[name].riskSco == 0) {
            if (objName == 'riskOcognizeCod' || objName == 'riskClassCod' || objName == 'riskActionCod') {
              if (vm[name][objName].length < 1) {
                vm[name].riskSco = null;
                if (vm[name].duoxSco == 0) {
                  vm[name].duoxSco = null
                }
              }
            } else {
              vm[name].riskSco = null;
              if (vm[name].duoxSco == 0) {
                vm[name].duoxSco = null
              }
            }
          }
        }
      }
    } else {
      list[idx]['checked'] = false;
      if (currentData != -1) {
        vm[name][objName].splice(currentData, 1);
        if (name == 'aboutFallDanger') {
          if (vm[name].riskSco == null || vm[name].duoxSco == null) {
            vm[name].riskSco = 0;
            vm[name].duoxSco = 0
          }
          vm[name].riskSco = vm[name].riskSco - 0 - scoNum;
          vm[name].duoxSco = vm[name].duoxSco - 0 - scoNum;
          if (vm[name].riskSco == 0) {
            if (objName == 'riskOcognizeCod' || objName == 'riskClassCod' || objName == 'riskActionCod') {
              if (vm[name][objName].length < 1) {
                vm[name].riskSco = null;
                if (vm[name].duoxSco == 0) {
                  vm[name].duoxSco = null
                }
              }
            } else {
              vm[name].riskSco = null;
              if (vm[name].duoxSco == 0) {
                vm[name].duoxSco = null
              }
            }
          }
        }
      }
    }
    if (vm[name][objName]) {
      vm.fallhideMsg[objName] = vm[name][objName].join(',');
    }
  },
})
/**
 *@ 监听坠倒危险评分 ------- level
 */
vm.aboutFallDanger.$watch('riskSco', function (newVal, oldVal) {
  if (newVal >= 0 && newVal <= 5) {
    $('.scoreLevel').html('(低危跌倒风险)')
  } else if (newVal >= 6 && newVal <= 13) {
    $('.scoreLevel').html('(中危跌倒风险)')
  } else if (newVal > 13) {
    $('.scoreLevel').html('(高危跌倒风险)')
  } else {
    $('.scoreLevel').html('')
  }
});

// ajax 拿数据
function getMsgList() {
  var getMsgUrl = _baseUrl + 'scorequery/findFallriskById.do';
  publicFun.httpServer({ url: getMsgUrl }, { fallriskSeq: _xtpgSeq }, function (data) {
    var msgList = data;
    if (msgList != '' && msgList != null) {
      $.each(msgList, function (key, val) {
        if (vm.fallhideMsg.hasOwnProperty(key) && val != null) {
          vm.fallhideMsg[key] = val;
          var ee = val.split(',');
          vm.aboutFallDanger[key] = ee;
        } else if (vm.aboutFallDanger.hasOwnProperty(key) && val != null) {
          vm.aboutFallDanger[key] = val;
          vm.aboutFallDanger[key + 'num'] = val;
        } else if (key == 'riskCognizeCod' && val != null) {
          vm.fallhideMsg['riskOcognizeCod'] = val;
          var ee = val.split(',');
          vm.aboutFallDanger['riskOcognizeCod'] = ee;
        } else if (key == 'riskAgeCod' && val != null) {
          vm.aboutFallDanger['riskAgeoCod'] = val;
          vm.aboutFallDanger['riskAgeoCodnum'] = val;
        }
        if (key == 'riskExcreteCod' && val == '1') {
          vm.aboutFallDanger[key + 'num'] = '2';
        }
      });
      vm.sysMsg.createDate = publicFun.timeFormat(msgList.cretDat, 'yyyy/MM/dd hh:mm');
      localassignment();
    }
  });
}

function localassignment() {
  var infoList = ['riskAgeoCod', 'riskDrugCod', 'riskMacCod', 'riskOcognizeCod', 'riskHisCod', 'riskOtherCod'];
  var infoidList = ['riskClassCod', 'riskActionCod', 'riskExcreteCod'];
  var objA = vm.aboutFallDanger;

  for (var i in infoList) {
    var key = infoList[i];
    if (objA[key] != '') {
      if (key == 'riskOcognizeCod') {
        infoMsg(objA[key], 'infocode', key)
      } else {
        $.each(vm.systemList[key + 'List'], function (idx, val) {
          if (val['infocode'] == objA[key]) {
            val['checked'] = true
          }
        })
      }
    }
  }

  for (var i in infoidList) {
    var key = infoidList[i];
    if (objA[key] != '') {
      if (key == 'riskClassCod' || key == 'riskActionCod') {
        infoMsg(objA[key], 'infoid', key)
      } else {
        $.each(vm.systemList[key + 'List'], function (idx, val) {
          if (val['infoid'] == objA[key]) {
            val['checked'] = true
          }
        })
      }
    }
  }
}

function infoMsg(_Obj, _bsf, key) {
  var l = _Obj.length;
  for (var n = 0; n < l; n++) {
    $.each(vm.systemList[key + 'List'], function (idx, val) {
      if (val[_bsf] == _Obj[n]) {
        val['checked'] = true
      }
    })
  }
}
