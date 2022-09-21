var vm = avalon.define({
  $id: 'falloutBed',
  aboutzcdd: {
    zcddexpfYnbmdd: '', //最近1年不明原因跌倒
    zcddexpfYsza: '', //意识障碍 
    zcddexpfSlza: '', //视力障碍（单盲、双盲、弱视、白内障、青光眼、眼底病、复视）
    zcddexpfHdza: '', //活动障碍、肢体偏瘫
    zcddexpfNl: '', //年龄（>65岁）
    zcddexpfTnxr: '', //体能虚弱（生活能力部分自理，白天过半时间要卧床或坐椅）
    zcddexpfTyxy: '', //头晕、眩晕、体位性低血压
    zcddexpfZyywjr: '', //服用影响意识和活动的药物（散瞳剂、镇静安眠药、降糖药、降压利尿剂、阵挛抗癫剂、麻醉止痛剂）
    zcddexpfJrpb: '', //住院中无家人和其他人员陪伴
    zcddexpfMy: '', //无
    zcddexpfSco: null, //总分
    zcddexpfMemo: '', //备注
    zcddFlag: '0', //是否编辑
    zcddMsg: '编辑',
    zcddFlg: '',
    zcddexpfYnbmddnum: 0, //最近1年不明原因跌倒
    zcddexpfYszanum: 0, //意识障碍 
    zcddexpfSlzanum: 0, //视力障碍（单盲、双盲、弱视、白内障、青光眼、眼底病、复视）
    zcddexpfHdzanum: 0, //活动障碍、肢体偏瘫
    zcddexpfNlnum: 0, //年龄（>65岁）
    zcddexpfTnxrnum: 0, //体能虚弱（生活能力部分自理，白天过半时间要卧床或坐椅）
    zcddexpfTyxynum: 0, //头晕、眩晕、体位性低血压
    zcddexpfZyywjrnum: 0, //服用影响意识和活动的药物（散瞳剂、镇静安眠药、降糖药、降压利尿剂、阵挛抗癫剂、麻醉止痛剂）
    zcddexpfJrpbnum: 0, //住院中无家人和其他人员陪伴
    zcddexpfMynum: 0, //无
  },
  toggleHspFzjcCustom: function (name, score, objName) {
    try {
      vm[objName][name] = vm[objName][name] == score ? '' : score;
    } catch (e) {
      // statements
      // console.log(e);
    }
    try {
      vm[objName][name + 'num'] = vm[objName][name + 'num'] == score ? 0 : score;
    } catch (e) {
      // statements
      // console.log(e);
    }
    if (objName == 'aboutzcdd') {
      var zcddexpfYnbmdd, zcddexpfYsza, zcddexpfSlza, zcddexpfHdza, zcddexpfNl, zcddexpfTnxr, zcddexpfTyxy, zcddexpfZyywjr, zcddexpfJrpb, zcddexpfMy;
      zcddexpfYnbmdd = parseInt(vm.aboutzcdd.zcddexpfYnbmddnum);
      zcddexpfYsza = parseInt(vm.aboutzcdd.zcddexpfYszanum);
      zcddexpfSlza = parseInt(vm.aboutzcdd.zcddexpfSlzanum);
      zcddexpfHdza = parseInt(vm.aboutzcdd.zcddexpfHdzanum);
      zcddexpfNl = parseInt(vm.aboutzcdd.zcddexpfNlnum);
      zcddexpfTnxr = parseInt(vm.aboutzcdd.zcddexpfTnxrnum);
      zcddexpfTyxy = parseInt(vm.aboutzcdd.zcddexpfTyxynum);
      zcddexpfZyywjr = parseInt(vm.aboutzcdd.zcddexpfZyywjrnum);
      zcddexpfJrpb = parseInt(vm.aboutzcdd.zcddexpfJrpbnum);
      zcddexpfMy = parseInt(vm.aboutzcdd.zcddexpfMynum);
      if (zcddexpfYnbmdd <= 0 && zcddexpfYsza <= 0 && zcddexpfSlza <= 0 && zcddexpfHdza <= 0 && zcddexpfNl <= 0 && zcddexpfTnxr <= 0 && zcddexpfTyxy <= 0 && zcddexpfZyywjr <= 0 && zcddexpfJrpb <= 0 && zcddexpfMy <= 0) {
        vm.aboutzcdd.zcddexpfSco = null;
      } else if (zcddexpfYnbmdd <= 0 && zcddexpfYsza <= 0 && zcddexpfSlza <= 0 && zcddexpfHdza <= 0 && zcddexpfNl <= 0 && zcddexpfTnxr <= 0 && zcddexpfTyxy <= 0 && zcddexpfZyywjr <= 0 && zcddexpfJrpb <= 0 && zcddexpfMy == 1) {
        vm.aboutzcdd.zcddexpfSco = 0;
      } else {
        vm.aboutzcdd.zcddexpfSco = (zcddexpfYnbmdd) + (zcddexpfYsza) + (zcddexpfSlza) + (zcddexpfHdza) + (zcddexpfNl) + (zcddexpfTnxr) + (zcddexpfTyxy) + (zcddexpfZyywjr) + (zcddexpfJrpb);
      }
    }
  },
})

// ajax 拿数据
function getMsgList() {
  var getMsgUrl = _baseUrl + 'zyyxtpg/findXtpgList.do';
  publicFun.httpServer({ url: getMsgUrl}, { _t: Date.parse(new Date()) }, function (data) {
    var msgList = data.resultInfo.sysdata;
    if (data.resultInfo.type == '1') {
    }
    var getMsgUrl = _baseUrl + "scorequery/findFalloutbedScoreByXtpgSeq.do",
      getMsgData = {
        "xtpgSeq": _xtpgSeq,
        date: new Date().toTimeString()
      };
    getPatientMsg(getMsgUrl, getMsgData);
  });
}
//  ajax 拿修改数据
function getPatientMsg(url, data) {
  $.ajax({
    url: url,
    type: "POST",
    async: true,
    dataType: 'json',
    data: data,
    success: function (res) {
      var _res = res;
      for (var _key in _res) {
        var aboutzcddList = ['zcddexpfYnbmdd', 'zcddexpfYsza', 'zcddexpfSlza', 'zcddexpfHdza', 'zcddexpfNl', 'zcddexpfTnxr', 'zcddexpfTyxy', 'zcddexpfZyywjr', 'zcddexpfJrpb', 'zcddexpfMy'];
        assignment(vm.aboutzcdd, _res);
        var _valuethis = _res[_key] || '';
        if ($.inArray(_key, aboutzcddList) > -1 && (_valuethis == '' || _valuethis == null)) {
          try {
            vm.aboutzcdd[_key + 'num'] = 0;
          } catch (e) {
            // statements
            // console.log(e);
          }
          // vm.aboutzcdd[_key + 'num'] = 0;
        } else {
          try {
            vm.aboutzcdd[_key + 'num'] = (_valuethis);
          } catch (e) {
            // statements
            // console.log(e);
          }
        }
        if (vm.aboutzcdd.hasOwnProperty('zcddexpfSco')) {
          vm.aboutzcdd['zcddexpfSco'] = _res['zcddexpfSco'];
        }
      }
    }
  })
}

function assignment(toObj, res) {
  for (var _key in res) {
    if (toObj.hasOwnProperty(_key)) {
      var _value = res[_key] || '';
      toObj[_key] = _value;
    }
  }
}