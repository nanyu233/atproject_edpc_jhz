var vm = avalon.define({
  $id: 'MorseGde',
  systemList: {
    ////////////////////////////////////////////Morse评分
    jsgyywddCodList: [], 
    dyygjbpdCodList: [], 
    xzfzCodList: [], 
    jmzlsyddgfxyCodList: [], 
    btCodList: [], 
    rznlCodList: [],
    hlcsCodList:[{ checked: false, infocode: '0', info: '提供足够的灯光，清除病房、床旁及通道障碍' }, 
    { checked: false, infocode: '1', info: '保持病区地面清洁干燥，告知卫生间防滑措施' },
    { checked: false, infocode: '2', info: '将日常物品放于患者易取处' },
    { checked: false, infocode: '3', info: '教会患者使用床头灯及呼叫器，放于可及处，高危患者' },
    { checked: false, infocode: '4', info: '指导患者渐进坐起、渐进下床的方法' },
    { checked: false, infocode: '5', info: '专人陪护，患者活动时有人陪伴' },
    { checked: false, infocode: '6', info: '穿舒适的鞋及衣裤' },
    { checked: false, infocode: '7', info: '将两侧床挡全部抬起，加强对患者夜间巡视' }]
  },
  aboutmorse: {
    jsgyywddCod: '', 
    dyygjbpdCod: '', 
    xzfzCod: '', 
    jmzlsyddgfxyCod: '', 
    btCod: '',
    rznlCod: '', 
    hlcsCod:[],
    zf: null, //总分
  },
  hideMsg:{
    MorseQk:'',
    hlcsCod:'',
    cretDat:_today
  },
  ywhideMsg:{
    hiddenMsg:''
  },
  checkClick: function (objName, idx) {
    vm.hideMsg[objName] = publicFun.checkClicks(vm.systemList[objName + 'List'], vm.aboutmorse[objName], idx, vm.hideMsg[objName])
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
      vm[objName][name] = list[idx]['remark'];
    } else {
      vm[objName][name] = '';
    }
    if (objName == 'aboutmorse') {
      var _obj = vm.aboutmorse, totalVal;
      totalVal = (_obj.jsgyywddCod - 0) + (_obj.dyygjbpdCod - 0) + (_obj.xzfzCod - 0) + (_obj.jmzlsyddgfxyCod - 0) + (_obj.btCod - 0) + (_obj.rznlCod - 0);
      if (totalVal >= 0) {
        vm.aboutmorse.zf = totalVal
      } else {
        vm.aboutmorse.zf = null
      }
    }
  }
})

vm.aboutmorse.$watch('zf', function (newVal, oldVal) {
  if (newVal < 25) {
    vm.hideMsg.MorseQk = '低风险患者'
  } else if (newVal >= 25 && newVal <= 44) {
    vm.hideMsg.MorseQk = '中风险患者'
  }else {
    vm.hideMsg.MorseQk = '高风险患者'
  }
});

function getCheckBoxList() {
  return ["jsgyywddCod", "dyygjbpdCod", "xzfzCod", "jmzlsyddgfxyCod", "btCod", "rznlCod"];
}

function assignment(toObj, res){
  var checkBoxList = getCheckBoxList(); // 获取带有checkbox的字符串列表
  for (var _key in res) {
    if(_key == 'hlcsCod'){
      if(res[_key] != null && res[_key] != ''){
        vm.hideMsg[_key] = res.hlcsCod;
        vm.aboutmorse[_key] = res.hlcsCod.split(',');
        $.each(vm.aboutmorse[_key], function (id, value) {
          $.each(vm.systemList[_key+'List'], function (idx, val) {
            if (val['infocode'] == value) {
              val['checked'] = true
            }
          })
        })
      }
    }else if (toObj.hasOwnProperty(_key)) {
      var _value = res[_key] || '';
      toObj[_key] = _value;
      if ($.inArray(_key, checkBoxList) > -1 && _value != '') {
        $.each(vm.systemList[_key + 'List'], function (idx, val) {
          if (val['remark'] == _value) {
            val['checked'] = true
          }
        })
      }
    }
  }
  
}

function getPatientMsg(getMsgUrl,getMsgData){
  publicFun.httpServer({ url: getMsgUrl}, getMsgData, function (data) {
    var _data = data;
    assignment(vm.aboutmorse, _data);
    if(_data != null){
      vm.hideMsg['cretDat'] = publicFun.timeFormat(_data.cretDat, 'yyyy/MM/dd hh:mm')
    }
  });
}

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
    var _getMsgUrl = _baseUrl + "scorequery/findMorseByDdfxpgbSeq.do",
      getMsgData = {
        "ddfxpgbSeq": _xtpgSeq,
        date: new Date().toTimeString()
      };
    getPatientMsg(_getMsgUrl, getMsgData);
  });
}