var ageList = [{ checked: false, infocode: '4', info: '>1岁~<=3岁' }, { checked: false, infocode: '3', info: '>3岁~<=7岁' }, { checked: false, infocode: '2', info: '>7岁~<=13岁' }, { checked: false, infocode: '1', info: '>13岁' }],
  sexList = [{ checked: false, infocode: '2', info: '男' }, { checked: false, infocode: '1', info: '女' }],
  diagnosisList = [{ checked: false, infocode: '4', info: '神经系统疾病；骨骼、关节系统疾病；眼科疾病' },
  { checked: false, infocode: '3', info: '氧合功能改变（呼吸系统疾病、心血管系统疾病、脱水、贫血、厌食、昏厥、头晕等）；点机制紊乱' },
  { checked: false, infocode: '2', info: '心理/行为疾病' },
  { checked: false, infocode: '1', info: '其他疾病；疾病导致不能活动或移动' },],
  recognizeList = [{ checked: false, infocode: '3', info: '没有意识到不能自我行动' }, { checked: false, infocode: '2', info: '忘记有行动的限制' }, { checked: false, infocode: '1', info: '能自我分辨方位；昏迷，无反应' }],
  enviromentList = [{ checked: false, infocode: '4', info: '住院期间有跌倒坠床史；患儿活动或移动时需使用辅助攻击（拐杖、助行器、转运床、轮椅等）；婴幼儿放置在无护栏的成人床' },
  { checked: false, infocode: '3', info: '近1个月有跌倒坠床史；婴幼儿放置在有护栏的成人床' },
  { checked: false, infocode: '2', info: '近3个月有跌倒坠床史；婴幼儿放置在有护栏的婴儿床' },
  { checked: false, infocode: '1', info: '>3个月有跌倒坠床史/无跌倒坠床史；患儿安置在合适的床上' }],
  anaesthesiaList = [{ checked: false, infocode: '3', info: '12小时内' }, { checked: false, infocode: '2', info: '24小时内' }, { checked: false, infocode: '1', info: '超过24小时/没有' }],
  druguseList = [{ checked: false, infocode: '3', info: '联合用药：镇静剂、安眠药、巴比妥类药、吩噻嗪类药、抗抑郁药、利尿剂、降压药、强心药、麻醉药、化疗药、散瞳剂' },
  { checked: false, infocode: '2', info: '以上其中一种药物' }, { checked: false, infocode: '1', info: '其他药物/没有' }]
var _nowTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
var vm = avalon.define({
  $id: 'fallDangerChild',
  systemList: {
    riskAgeyCodList: ageList,
    riskSexCodList: sexList,
    riskDiagnoseCodList: diagnosisList,
    riskYcognizeCodList: recognizeList,
    riskHjysCodList: enviromentList,
    riskZjmzhCodList: anaesthesiaList,
    riskDruguseCodList: druguseList,
  },
  aboutFallDanger: {
    riskAgeyCod: '',
    riskSexCod: '',
    riskDiagnoseCod: '',
    riskYcognizeCod: '',
    riskHjysCod: '',
    riskZjmzhCod: '',
    riskDruguseCod: '',
    riskSco: null //总分
  },
  sysMsg:{
    createDate:_nowTime
  },
  Objradioclick: function (name, idx, objName) {
    var list = [];
    list = vm.systemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      vm[objName][name] = list[idx]['infocode'];
    } else {
      vm[objName][name] = '';
    }
    if (objName == 'aboutFallDanger') {
      var _obj = vm.aboutFallDanger, totalFallVal;
      totalFallVal = (_obj.riskAgeyCod - 0) + (_obj.riskSexCod - 0) + (_obj.riskDiagnoseCod - 0) + (_obj.riskYcognizeCod - 0) + (_obj.riskHjysCod - 0) + (_obj.riskZjmzhCod - 0) + (_obj.riskDruguseCod - 0);
      if (totalFallVal > 0) {
        vm.aboutFallDanger.riskSco = totalFallVal
      } else {
        vm.aboutFallDanger.riskSco = null
      }
    }
  },
});

function localassignment() {
  var infoList = ['riskAgeyCod', 'riskSexCod', 'riskDiagnoseCod', 'riskYcognizeCod', 'riskHjysCod', 'riskZjmzhCod', 'riskDruguseCod'];
  var objA = vm.aboutFallDanger;
  for (var i in infoList) {
    var key = infoList[i];
    if (objA[key] != '') {
      $.each(vm.systemList[key + 'List'], function (idx, val) {
        if (val['infocode'] == objA[key]) {
          val['checked'] = true
        }
      })
    }
  }
}

function getMsgList() {
  var getMsgUrl = _baseUrl + 'scorequery/findFallriskById.do';
  publicFun.httpServer({ url: getMsgUrl }, { fallriskSeq: _xtpgSeq }, function (data) {
    var msgList = data;
    if (msgList != '' && msgList != null) {
      $.each(msgList, function (key, val) {
        if (val !== null && val !== undefined) {
          if (vm.aboutFallDanger.hasOwnProperty(key)) {
            vm.aboutFallDanger[key] = val;
          } else {
            if (key === 'riskCognizeCod') {
              vm.aboutFallDanger['riskYcognizeCod'] = val;
            }
            if (key === 'riskAgeCod') {
              vm.aboutFallDanger['riskAgeyCod'] = val;
            }
          }
        }
      })
    }
    if(data != null){
      vm.sysMsg.createDate = publicFun.timeFormat(data.cretDat, 'yyyy/MM/dd hh:mm');
    }
    localassignment();
  })
}