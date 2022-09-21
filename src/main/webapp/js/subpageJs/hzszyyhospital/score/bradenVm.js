
var _nowTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
var vm = avalon.define({
  $id: 'BradenGde',
  systemList: {
    ////////////////////////////////////////////Braden评分
    bradenGjCodList: [], //感觉
    bradenCsCodList: [], //潮湿
    bradenHdnlCodList: [], //活动能力
    bradenYdnlCodList: [], //移动能力
    bradenYyCodList: [], //营养
    bradenMchjqlCodList: [] //摩擦和剪切力
  },
  aboutbraden: {
    bradenGjCod: '', //感觉
    bradenCsCod: '', //潮湿
    bradenHdnlCod: '', //活动能力
    bradenYdnlCod: '', //移动能力
    bradenYyCod: '', //营养
    bradenMchjqlCod: '', //摩擦和剪切力
    bradenSco: null, //总分
    memo: '' //备注
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
    if (objName == 'aboutbraden') {
      var _obj = vm.aboutbraden, totalVal;
      totalVal = (_obj.bradenGjCod - 0) + (_obj.bradenCsCod - 0) + (_obj.bradenHdnlCod - 0) + (_obj.bradenYdnlCod - 0) + (_obj.bradenYyCod - 0) + (_obj.bradenMchjqlCod - 0);
      if (totalVal > 0) {
        vm.aboutbraden.bradenSco = totalVal
      } else {
        vm.aboutbraden.bradenSco = null
      }
    }
  }
})

// ajax 拿数据
function getMsgList() {
  var getMsgUrl = _baseUrl + 'scorequery/findScopeQueryList.do';
  publicFun.httpServer({ url: getMsgUrl}, { _t: Date.parse(new Date()) }, function (data) {
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
    var getMsgUrl = _baseUrl + "scorequery/findBradenScoreByXtpgSeq.do",
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
        assignment(vm.aboutbraden, _res);
      }
    }
  })
}
// ajax 拿到的数据进行处理
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
  vm.sysMsg.createDate = publicFun.timeFormat(res.cratDat, 'yyyy/MM/dd hh:mm');
}

function getCheckBoxList() {
  return ["bradenGjCod", "bradenCsCod", "bradenHdnlCod", "bradenYdnlCod", "bradenYyCod", "bradenMchjqlCod"];
}
