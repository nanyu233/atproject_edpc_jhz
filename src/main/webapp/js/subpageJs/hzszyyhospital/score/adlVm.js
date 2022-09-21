var adlhlList = [{ infocode: "0", infoid: "A", info: ["（1）重症患者，意识、生命体征发生变化，或可能有变化，需要密切监测者（检测时间间隔少于或等于一小时）", "（2）多项治疗或检测、护理活动频繁，每小时均需护理服务者", "（3）开刀、特殊治疗、检测前、后需密切观察，预防变化者", "（4）精神状态严重障碍"], checked: false },
{ infocode: "1", infoid: "B", info: ["（1）意识、生命征象，须1-2小时注意其变化", "（2）多项治疗或检测、护理活动，每1-2小时需要护理服务者", "（3）精神状态不稳定者"], checked: false },
{ infocode: "2", infoid: "C", info: ["（1）意识状态、生命征象，观察间隔大于2小时者", "（2）治疗或检查、护理活动，2小时以上需要护理服务者"], checked: false }
];
var adlJsList = [{ checked: false, infocode: '10', info: '自理', infoid: '1' }, { checked: false, infocode: '5', info: '稍依赖', infoid: '2' }, { checked: false, infocode: '0', info: '较大依赖', infoid: '3' }, { checked: false, infocode: '0', info: '完全依赖', infoid: '4' }],
  adlXizList = [{ checked: false, infocode: '5', info: '自理', infoid: '1' }, { checked: false, infocode: '0', info: '稍依赖', infoid: '2' }, { checked: false, infocode: '0', info: '较大依赖', infoid: '3' }, { checked: false, infocode: '0', info: '完全依赖', infoid: '4' }],
  adlCyzyList = [{ checked: false, infocode: '15', info: '自理', infoid: '1' }, { checked: false, infocode: '10', info: '稍依赖', infoid: '2' }, { checked: false, infocode: '5', info: '较大依赖', infoid: '3' }, { checked: false, infocode: '0', info: '完全依赖', infoid: '4' }];
var _nowTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
  var vm = avalon.define({
  $id: 'adlScore',
  systemList: {
    ////////////////////////////////////////////ADL评分
    adlHlylcdList: adlhlList, //护理依赖程度|A.B.C
    adlJsScoList: adlJsList, //进食
    adlXizScoList: adlXizList, //洗澡
    adlXsScoList: adlXizList, //修饰（洗脸、梳头、刷牙、刮脸）
    adlCyScoList: adlJsList, //穿衣（包括系带）
    adlKzdbScoList: adlJsList, //控制大便
    adlKzxbScoList: adlJsList, //控制小便
    adlScsScoList: adlJsList, //上厕所
    adlCyzyScoList: adlCyzyList, //床椅转移
    adlXingzScoList: adlCyzyList, //行走（平底45M）
    adlSxltScoList: adlJsList //上下楼梯（用手杖也算独立）
  },
  aboutAdl: {
    adlHlylcd: '', //护理依赖程度|A.B.C
    adlJsSco: '', //进食
    adlJsScoNew: '',
    adlXizSco: '', //洗澡
    adlXizScoNew: '',
    adlXsSco: '', //修饰（洗脸、梳头、刷牙、刮脸）
    adlXsScoNew: '',
    adlCySco: '', //穿衣（包括系带）
    adlCyScoNew: '',
    adlKzdbSco: '', //控制大便
    adlKzdbScoNew: '',
    adlKzxbSco: '', //控制小便
    adlKzxbScoNew: '',
    adlScsSco: '', //上厕所分
    adlScsScoNew: '',
    adlCyzySco: '', //床椅转移
    adlCyzyScoNew: '',
    adlXingzSco: '', //行走（平底45M）
    adlXingzScoNew: '',
    adlSxltSco: '', //上下楼梯（用手杖也算独立）
    adlSxltScoNew: '',
    adlSco: null, //总分
    adlMemo: '', //备注
    adlFlag: '0', //是否编辑
    adlMsg: '编辑',
    aldFlg: ''
  },
  sysMsg:{
    createDate:_nowTime
  },
  adlradioclick: function (name, idx) {
    var list = [];
    list = vm.systemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      vm.aboutAdl[name] = list[idx]['infocode'];
      try {
        vm.aboutAdl[name + 'New'] = list[idx]['infoid'];
      } catch (e) {}
    } else {
      vm.aboutAdl[name] = '';
      try {
        vm.aboutAdl[name + 'New'] = '';
      } catch (e) {}
    }
    var _obj = vm.aboutAdl, totalVal;
    totalVal = (_obj.adlJsSco - 0) + (_obj.adlXizSco - 0) + (_obj.adlXsSco - 0) + (_obj.adlCySco - 0) + (_obj.adlKzdbSco - 0) + (_obj.adlKzxbSco - 0) + (_obj.adlScsSco - 0) + (_obj.adlCyzySco - 0) + (_obj.adlXingzSco - 0) + (_obj.adlSxltSco - 0);
    if (totalVal > 0) {
      vm.aboutAdl.adlSco = totalVal
    } else {
      if (_obj.adlJsScoNew == '' && _obj.adlXizScoNew == '' && _obj.adlXsScoNew == '' && _obj.adlCyScoNew == '' && _obj.adlKzdbScoNew == '' && _obj.adlKzxbScoNew == '' && _obj.adlScsScoNew == '' && _obj.adlCyzyScoNew == '' && _obj.adlXingzScoNew == '' && _obj.adlSxltScoNew == '') {
        vm.aboutAdl.adlSco = null
      } else {
        vm.aboutAdl.adlSco = 0
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
      $.each(msgList, function (key, val) {
        if (vm.systemList.hasOwnProperty(key)) {
          $.each(val, function (idx, valu) {
            valu['checked'] = false
          })
          vm.systemList[key] = val;
        }
      });
    }
    var getMsgUrl = _baseUrl + "scorequery/findAdlScoreByXtpgSeq.do",
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
      var aboutAdlList = getCheckBoxList();
      var checkBoxListSpc = ["adlJsScoNew", "adlXizScoNew", "adlXsScoNew", "adlCyScoNew", "adlKzdbScoNew", "adlKzxbScoNew", "adlScsScoNew", "adlCyzyScoNew", "adlXingzScoNew", "adlSxltScoNew"];
      for (var _key in _res) {
        if (vm.aboutAdl.hasOwnProperty(_key)) {
          var _value = _res[_key] || '';
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
          vm.aboutAdl['adlSco'] = _res['adlSco'];
        }
      }
      if(res != null){
        vm.sysMsg.createDate = publicFun.timeFormat(res.cratDat, 'yyyy/MM/dd hh:mm');
      }
    }
  })
}

function getCheckBoxList() {
  return ['adlJsSco', 'adlXizSco', 'adlXsSco', 'adlCySco', 'adlKzdbSco', 'adlKzxbSco', 'adlScsSco', 'adlCyzySco', 'adlXingzSco', 'adlSxltSco'];
}