var smtzList = [{ checked: false, infocode: '5', info: '稳定' }, { checked: false, infocode: '3', info: '仪器或药物维持稳定' }, { checked: false, infocode: '1', info: '高危状态' }],
  szList = [{ checked: false, infocode: '5', info: '清醒' }, { checked: false, infocode: '3', info: '昏睡或谵妄' }, { checked: false, infocode: '1', info: '昏迷' }],
  tkList = [{ checked: false, infocode: '5', info: '正常' }, { checked: false, infocode: '3', info: '不等大或光反应消失' }, { checked: false, infocode: '1', info: '散大' }],
  jmtdList = [{ checked: false, infocode: '5', info: '无' }, { checked: false, infocode: '3', info: '头皮针或浅静脉留置针1-2条' }, { checked: false, infocode: '1', info: '深静脉置管或静脉通道≥3条' }],
  gldgList = [{ checked: false, infocode: '5', info: '无' }, { checked: false, infocode: '3', info: '1-2条' }, { checked: false, infocode: '1', info: '≥3条' }],
  hxzcList = [{ checked: false, infocode: '5', info: '无' }, { checked: false, infocode: '3', info: '通气管道或面罩给氧或人工气道内给氧' }, { checked: false, infocode: '1', info: '人工气道接呼吸机辅助呼吸' }],
  cxbwgdList = [{ checked: false, infocode: '5', info: '无' }, { checked: false, infocode: '3', info: '普通止血包扎' }, { checked: false, infocode: '1', info: '加压包扎止血或止血带止血' }],
  wwList = [{ checked: false, infocode: '5', info: '自动体位' }, { checked: false, infocode: '3', info: '限制体位' }, { checked: false, infocode: '1', info: '强迫体位' }],
  tbjzztbhList = [{ checked: false, infocode: '5', info: '自动体位' }, { checked: false, infocode: '3', info: '绝对卧床限制活动' }, { checked: false, infocode: '1', info: '上颈托或脊柱板' }],
  ydbrfsList = [{ checked: false, infocode: '5', info: '指导协助下挪动' }, { checked: false, infocode: '3', info: '2人或2人以上搬动' }, { checked: false, infocode: '1', info: '3人或3人以上搬动' }],
  braqList = [{ checked: false, infocode: '5', info: '防护床栏' }, { checked: false, infocode: '3', info: '床栏及四肢约束' }, { checked: false, infocode: '1', info: '床栏及全身约束' }],
  hxjList = [{ checked: false, infocode: '5', info: '正常运转/无' }, { checked: false, infocode: '3', info: '1项指标异常报警' }, { checked: false, infocode: '1', info: '2项指标异常以上报警' }],

  xdyqjywList = [{ checked: false, infocode: '1', info: '①呼吸机' }, { checked: false, infocode: '2', info: '②监护仪' }, { checked: false, infocode: '3', info: '③氧气瓶' },
  { checked: false, infocode: '4', info: '④吸引器' }, { checked: false, infocode: '5', info: '⑤呼吸皮囊' }, { checked: false, infocode: '6', info: '⑥气管插管箱' },
  { checked: false, infocode: '7', info: '⑦急救箱' }, { checked: false, infocode: '8', info: '⑧药物' }, { checked: false, infocode: '9', info: '⑨其他' }];

var vm = avalon.define({
  $id: 'zyfxpf',
  systemList: {
    smtzList: smtzList,
    szList: szList,
    tkList: tkList,
    jmtdList: jmtdList,
    gldgList: gldgList,
    hxzcList: hxzcList,
    cxbwgdList: cxbwgdList,
    wwList: wwList,
    tbjzztbhList: tbjzztbhList,
    ydbrfsList: ydbrfsList,
    braqList: braqList,
    hxjList: hxjList,
    jhyList: hxjList,
    xdyqjywList: xdyqjywList
  },
  aboutZyfxpf: {
    zyfxpfSeq: '',
    smtz: '',
    sz: '',
    tk: '',
    jmtd: '',
    gldg: '',
    hxzc: '',
    cxbwgd: '',
    ww: '',
    tbjzztbh: '',
    ydbrfs: '',
    braq: '',
    hxj: '',
    jhy: '',
    zyfxpfSco: null,
    xdyqjyw: [],
    xdyqjywqt: ''
  },
  hideMsg: {
    xdyqjyw: '',
    zyfxpfQk: '',
    crttime: _today
  },
  radioClickCompute: function (name, idx) {
    vm.aboutZyfxpf[name] = publicFun.radioClicks(vm.systemList[name + 'List'], vm.aboutZyfxpf[name], idx)
    var _comObj = {
      smtz: 0,
      sz: 0,
      tk: 0,
      jmtd: 0,
      gldg: 0,
      hxzc: 0,
      cxbwgd: 0,
      ww: 0,
      tbjzztbh: 0,
      ydbrfs: 0,
      braq: 0,
      hxj: 0,
      jhy: 0
    }
    for (var key in _comObj) {
      _comObj[key] = vm.aboutZyfxpf[key] - 0;
    }
    vm.aboutZyfxpf.zyfxpfSco = _comObj.smtz + _comObj.sz + _comObj.tk + _comObj.jmtd + _comObj.gldg + _comObj.hxzc + _comObj.cxbwgd + _comObj.ww + _comObj.tbjzztbh + _comObj.ydbrfs + _comObj.braq + _comObj.hxj + _comObj.jhy;
  },
  checkClick: function (objName, idx) {
    vm.hideMsg[objName] = publicFun.checkClicks(vm.systemList[objName + 'List'], vm.aboutZyfxpf[objName], idx, vm.hideMsg[objName])
  }
})

vm.aboutZyfxpf.$watch('zyfxpfSco', function (newVal, oldVal) {
  if (newVal < 30) {
    vm.hideMsg.zyfxpfQk = '转运风险高'
  } else if (newVal >= 30 && newVal <= 40) {
    vm.hideMsg.zyfxpfQk = '转运风险较高'
  } else if (newVal >= 41 && newVal <= 50) {
    vm.hideMsg.zyfxpfQk = '有风险的可能性'
  } else {
    vm.hideMsg.zyfxpfQk = '转运风险较小'
  }
});

function localAssignment () {
  var infoList = ['smtz', 'sz', 'tk', 'jmtd', 'gldg', 'hxzc', 'cxbwgd', 'ww', 'tbjzztbh', 'ydbrfs', 'braq', 'hxj', 'jhy'];
  var objA = vm.aboutZyfxpf;
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
  $.each(vm.aboutZyfxpf.xdyqjyw, function (id, value) {
    $.each(vm.systemList.xdyqjywList, function (_id, _value) {
      if (value == _value.infocode) {
        _value['checked'] = true
      }
    })
  })
}

function getMsgList() {
  if (_xtpgSeq != '') {
    var getMsgUrl = _baseUrl + 'scorequery/findZyfxpfScoreByZyfxpfSeq.do';
    publicFun.httpServer({url: getMsgUrl}, { zyfxpfSeq: _xtpgSeq }, function (data) {
      var msgList = data;
      if (msgList != '' && msgList != null) {
        $.each(msgList, function (key, val) {
          if (key == 'xdyqjyw' && val != '' && val != null) {
            vm.hideMsg[key] = val;
            vm.aboutZyfxpf[key] = val.split(',');
          } else if (key == 'crttime' && val != '' && val != null) {
            vm.hideMsg[key] = publicFun.timeFormat(val, 'yyyy/MM/dd hh:mm')
          } else if (vm.aboutZyfxpf.hasOwnProperty(key) && val != null) {
            vm.aboutZyfxpf[key] = val;
          }
        })
      }
      localAssignment();
    })
  }
}