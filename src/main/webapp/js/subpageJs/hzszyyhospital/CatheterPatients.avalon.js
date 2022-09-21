var dataBarFlg = false,
  today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
var ductFun = {
  inArray: function (val, arr) {
    var returnMsg = -1;
    for (i = 0; i < arr.length; i++) {
      if (val == arr[i]) {
        returnMsg = i
      }
    }
    return returnMsg
  },
  httpGetMsg: function (url, data) {
    return $.ajax({
      url: url,
      type: "get",
      data: data
    })
  },
  /**
   * @ 获取List
   */
  getMsgList: function () {
    var getMsgUrl = _baseUrl + 'hzszyyjjd/findEmgList_jjd.do';
    publicFun.httpServer({ url: getMsgUrl }, { emgSeq: _emgSeq }, function (res) {
      var msgList = res.resultInfo.sysdata;
      if (res.resultInfo.type == '1') {
        $.each(msgList, function (key, val) {
          if (ductvm.receitpList.hasOwnProperty(key)) {
            $.each(val, function (idx, valu) {
              valu['checked'] = false
            })
            ductvm.receitpList[key] = val;
          }
        });
      }
      var getMsgUrl = _baseUrl + "hzszyyjjd/finddgbr.do",
        getMsgData = {
          "hspDgbrjjInfCustom.dgbrjjSeq": _dgbrjjSeq,
          date: new Date().toTimeString()
        };
      ductFun.getPatientMsg(getMsgUrl, getMsgData);
    });
  },
  /**
   * @ 修改拿数据
   */
  getPatientMsg: function (url, data) {
    ductFun.httpGetMsg(url, data).done(function (res) {
      var _res = res;
      for (var _key in _res['hspDgbrjjInfCustom']) {
        ductFun.systemassignment(ductvm.receitpMsg, _res.hspDgbrjjInfCustom);
      }
    });
  },
  getCheckBoxList: function () {
    return ["bfSqyyFlg", "bfZbdmbdCod", "bfRdgsfsCod"];
  },
  systemassignment: function (toObj, res) {
    var checkBoxList = ductFun.getCheckBoxList();// 获取带有checkbox的字符串列表
    for (var key in res) {
      if (toObj.hasOwnProperty(key)) {
        var _value = res[key] || '';
        if (_value != '' && _value != null) {
          if (key == 'bfSqzbCod' || key == 'bfDrdgswpCod') {
            ductvm.receitphideMsg[key] = _value;
            ductvm.receitpMsg[key] = res[key].split(",") || [];
            var _json = String(res[key]).split(","),
              _list = ductvm.receitpList;
            $.each(_list[key + "List"], function (idx, val) {
              _list[key + "List"][idx].checked = ductFun.inArray(_list[key + "List"][idx]["infocode"], _json) >= 0 ? true : false
            });
          } else if ($.inArray(key, checkBoxList) > -1) {
            $.each(ductvm.receitpList[key + 'List'], function (idx, val) {
              if (val['infocode'] == _value) {
                val['checked'] = true
              }
            })
            toObj[key] = _value
          } else {
            if (key == 'bfJjbDat' || key == 'dgbrjjDat') {
              _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss')
            }
            toObj[key] = _value
          }
        }
      }
    }
  }
};

var ductvm = avalon.define({
  $id: 'CatherPatients',
  //获取后台配置列表
  receitpList: {
    bfSqzbCodList: [],//术前准备
    bfSqyyFlgList: [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }],//有无术前用药（0：无 1：有）
    bfZbdmbdCodList: [],//足背动脉搏动
    bfDrdgswpCodList: [],//带入导管室物品
    bfRdgsfsCodList: []//入导管室方式
  },
  receitpMsg: {
    bfSqzd: '',//术前诊断
    bfSqzbCod: [],//术前准备
    bfSqyyFlg: '',//有无术前用药（0：无 1：有）
    bfSqyyKf: '',//术前用药口服 
    bfSqyyJm: '',//术前用药静脉 
    bfSqyyDrdgsyy: '',//术前用药带入导管室药物（名称及剂量）
    bfZbdmbdCod: '',//足背动脉搏动
    bfDrdgswpCod: [],//带入导管室物品
    bfDrdgswpQt: '',//带入导管室物品其他
    bfRdgsfsCod: '',//入导管室方式
    bfRdgsqkTw: '',//入导管室情况体温
    bfRdgsqkMb: '',//入导管室情况脉搏
    bfRdgsqkHx: '',//入导管室情况呼吸
    bfRdgsqkUpbp: '',//入导管室情况血压上压
    bfRdgsqkDownbp: '',//入导管室情况血压下压
    bfTsjb: '',//特殊交班
    bfBfhsqmNbr: '',//病房病房护士用户号
    bfBfhsqmNam: '',//病房病房护士签名
    bfDghsqmNbr: '',//病房导管室护士用户号
    bfDghsqmNam: '',//病房导管室护士签名
    bfJjbDat: '',//病房交接班时间
    ageFlg: '',//是否显示年龄
    dgbrjjDat: today //记录时间
  },
  receitphideMsg: {
    bfSqzbCod: '',//术前准备
    bfDrdgswpCod: ''//带入导管室物品
  },

  /**
   * @ 单选 
   */
  receitpradioclick: function (name, idx) {
    ductvm.receitpMsg[name] = publicFun.radioClicks(ductvm.receitpList[name + 'List'], ductvm.receitpMsg[name], idx)
  },
  /**
   * @ 多选
   */
  receitpcheckClick: function (objName, idx) {
    ductvm.receitphideMsg[objName] = publicFun.checkClicks(ductvm.receitpList[objName + 'List'], ductvm.receitpMsg[objName], idx, ductvm.receitphideMsg[objName])
  },
  onlyNum: function (attr, step, max) { //限定只能输入数字
    ductvm.receitpMsg[attr] = publicFun.onlyNumber(ductvm.receitpMsg[attr], step, max)
  },
  togglereceitpCustom: function (name) {
    ductvm.receitpMsg[name] = ductvm.receitpMsg[name] == 1 ? "" : 1;
  }
});

$(function () {
  ductFun.getMsgList();

  if (_cstAgeNew) {
    ductvm.receitpMsg.ageFlg = 1
  } else {
    ductvm.receitpMsg.ageFlg = 0
  }
})
/**
 * @ 保存
 */
function saveCom() {
  if (ductvm.receitpMsg.dgbrjjDat == '') {
    window.parent.publicFun.alert("请输入记录时间");
    return false;
  }
  window.parent._confirm('确定提交吗？', null, function () {
    jquerySubByFId('ductForm', insertuser_callback, null, "json");
  })
}

function insertuser_callback(data) {
  window.parent.$('#tabDiv').datagrid('reload');
  window.parent.message_alert(data);
  setTimeout(function () {
    window.location.reload();
  }, 800)
}

/**
 * @监听 - 术前用药 。if != 1 , -结果值为""
 */
ductvm.receitpMsg.$watch('bfSqyyFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    ductvm.receitpMsg.bfSqyyKf = '';
    ductvm.receitpMsg.bfSqyyJm = '';
    ductvm.receitpMsg.bfSqyyDrdgsyy = ''
  }
});

/**
 * @监听 - 术前用药-详情 。if !="" , -flag = 1
 */
ductvm.receitpMsg.$watch('bfSqyyKf', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && ductvm.receitpMsg.bfSqyyFlg != '1') {
    var list = ductvm.receitpList['bfSqyyFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    ductvm.receitpMsg.bfSqyyFlg = '1'
  }
});
ductvm.receitpMsg.$watch('bfSqyyJm', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && ductvm.receitpMsg.bfSqyyFlg != '1') {
    var list = ductvm.receitpList['bfSqyyFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    ductvm.receitpMsg.bfSqyyFlg = '1'
  }
});
ductvm.receitpMsg.$watch('bfSqyyDrdgsyy', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && ductvm.receitpMsg.bfSqyyFlg != '1') {
    var list = ductvm.receitpList['bfSqyyFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    ductvm.receitpMsg.bfSqyyFlg = '1'
  }
});
