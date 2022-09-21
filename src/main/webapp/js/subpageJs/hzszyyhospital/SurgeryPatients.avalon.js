var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
var _isHasList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }];
var surgeryFun = {
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
    publicFun.httpServer({ url: getMsgUrl}, { emgSeq: _emgSeq }, function (res) {
      var msgList = res.resultInfo.sysdata;
      if (res.resultInfo.type == '1') {
        $.each(msgList, function (key, val) {
          if (surgeryvm.receitpList.hasOwnProperty(key)) {
            $.each(val, function (idx, valu) {
              valu['checked'] = false
            })
            surgeryvm.receitpList[key] = val;
            if (key == 'smtzSqYsList') {
              surgeryvm.receitpList['smtzOprYsList'] = val;
            }
          }
        });
      }
      var getMsgUrl = _baseUrl + "hzszyyjjd/findsshz.do",
        getMsgData = {
          "hspSshzjjInfCustom.sshzjjSeq": _sshzjjSeq,
          date: new Date().toTimeString()
        };
      surgeryFun.getPatientMsg(getMsgUrl, getMsgData);
    });
  },
  /**
   * @ 修改拿数据
   */
  getPatientMsg: function (url, data) {
    surgeryFun.httpGetMsg(url, data).done(function (res) {
      var _res = res;
      for (var _key in _res['hspSshzjjInfCustom']) {
        surgeryFun.systemassignment(surgeryvm.receitpMsg, _res.hspSshzjjInfCustom);
      }
    });
  },
  getCheckBoxList: function () {
    return ["isltCod", "gmsSqCod", "bxSqCod", "bpSqCod", "oprtyySqCod", "pfwzxSqCod", "jsSqCod", "ssbwbjSqCod"];
  },
  systemassignment: function (toObj, res) {
    var checkBoxList = surgeryFun.getCheckBoxList();// 获取带有checkbox的字符串列表
    for (var key in res) {
      if (toObj.hasOwnProperty(key)) {
        var _value = res[key] || '';
        if (_value != '' && _value != null) {
          if (key == 'gdSqCod' || key == 'xdwpSqCod') {
            surgeryvm.receitphideMsg[key] = _value;
            surgeryvm.receitpMsg[key] = res[key].split(",") || [];
            var _json = String(res[key]).split(","),
              _list = surgeryvm.receitpList;
            $.each(_list[key + "List"], function (idx, val) {
              _list[key + "List"][idx].checked = surgeryFun.inArray(_list[key + "List"][idx]["infocode"], _json) >= 0 ? true : false
            });
          } else if ($.inArray(key, checkBoxList) > -1) {
            $.each(surgeryvm.receitpList[key + 'List'], function (idx, val) {
              if (val['infocode'] == _value) {
                val['checked'] = true
              }
            })
            toObj[key] = _value;
          } else {
            if (key == 'sqbqDat' || key == 'oprtRoomDat' || key == 'sshzjjDat') {
              _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss');
            }
            if (key == 'oprtDat') {
              _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd');
            }
            toObj[key] = _value;
          }
        }
      }
    }
  }
};
var surgeryvm = avalon.define({
  $id: 'SurgeryPatients',
  //获取后台配置列表
  receitpList: {
    isltCodList: [{ checked: false, infocode: '0', info: '接触隔离' }, { checked: false, infocode: '1', info: '其他隔离' }],//隔离（0:接触隔离 1：其他隔离）
    gmsSqCodList: [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '不详' }, { checked: false, infocode: '2', info: '有' }],//过敏史术前(0：无 1：不详 2：有)
    bxSqCodList: _isHasList,//有无备血术前（0：无 1：有）
    bpSqCodList: [{ checked: false, infocode: '0', info: '确认' }, { checked: false, infocode: '1', info: '需要' }],//备皮需要术前（0：确认 1：需要）
    oprtyySqCodList: _isHasList,//有无手术用药带入术前（0：无 1：有
    pfwzxSqCodList: [{ checked: false, infocode: '0', info: '不完整' }, { checked: false, infocode: '1', info: '完整' }],//皮肤完整性术前（0：不完整 1：完整）
    gdSqCodList: [],//管道术前
    jsSqCodList: [{ checked: false, infocode: '0', info: '不需要' }, { checked: false, infocode: '1', info: '确认' }],//禁食术前（0：不需要 1：确认）
    ssbwbjSqCodList: [{ checked: false, infocode: '0', info: '不需要' }, { checked: false, infocode: '1', info: '正确' }],//手术部位标记（0：不需要 1：正确）
    xdwpSqCodList: [],//携带物品术前
    smtzSqYsList: [],//意识
    smtzOprYsList: []//意识
  },
  receitpMsg: {
    isltCod: '',//隔离（0:接触隔离 1：其他隔离）
    oprtNam: '',//手术名称
    oprtDat: '',//手术日期（年月日）
    hzsfSqCod: '',//患者身份确认术前（0：否 1：是）
    gmsSqCod: '',//过敏史术前(0：无 1：不详 2：有)
    bxSqCod: '',//有无备血术前（0：无 1：有）
    bpSqCod: '',//备皮需要术前（0：确认 1：需要）
    oprtyySqCod: '',//有无手术用药带入术前（0：无 1：有）
    pfwzxSqCod: '',//皮肤完整性术前（0：不完整 1：完整）
    gdSqCod: [],//管道术前
    jsSqCod: '',//禁食术前
    pkpgSqCod: '',//是否排空膀胱术前
    blSqCod: '',//有无病历术前
    zqtysSqCod: '',//有无知情同意书
    ssbwbjSqCod: '',//手术部位标记
    xdwpSqCod: [],//携带物品术前
    smtzSqTw: '',//体温术前
    smtzSqHr: '',//心率术前（次/分）
    smtzSqHx: '',//呼吸术前（次/分）
    smtzSqBpup: '',//上压（mmHg）
    smtzSqBpdown: '',//下压（mmHg）
    smtzSqSpo2: '',//SPO2(%)
    smtzSqYs: '',//意识
    smtzOprTw: '',//体温术后
    smtzOprHr: '',//心率术后（次/分）
    smtzOprHx: '',//呼吸术后（次/分）
    smtzOprBpup: '',//上压（mmHg）
    smtzOprBpdown: '',//下压（mmHg）
    smtzOprSo2: '',//SPO2(%)
    smtzOprYs: '',//意识
    cratDat: '',//创建时间
    cratNbr: '',//创建人用户号
    updtDat: '',//修改时间
    updtNbr: '',//修改人用户号
    sshzjjDat: today,//记录时间
    cretNam: '',//创建人姓名
    sqbqDat: '',//术前病区时间
    oprtRoomDat: '',//手术室时间
    nurse1Nbr: '',//交护士
    nurse1Nam: '',//交护士
    nurse2Nbr: '',//接护士
    nurse2Nam: '',//接护士
    ageFlg: '' //是否显示年纪
  },
  receitphideMsg: {
    gdSqCod: '',//管道术前
    xdwpSqCod: ''//携带物品术前
  },

  /**
   * @ 单选 
   */
  receitpradioclick: function (name, idx) {
    surgeryvm.receitpMsg[name] = publicFun.radioClicks(surgeryvm.receitpList[name + 'List'], surgeryvm.receitpMsg[name], idx)
  },
  /**
   * @ 多选
   */
  receitpcheckClick: function (objName, idx) {
    surgeryvm.receitphideMsg[objName] = publicFun.checkClicks(surgeryvm.receitpList[objName + 'List'], surgeryvm.receitpMsg[objName], idx, surgeryvm.receitphideMsg[objName])
  },
  onlyNum: function (attr, step, max) { //限定只能输入数字
    surgeryvm.receitpMsg[attr] = publicFun.onlyNumber(surgeryvm.receitpMsg[attr], step, max)
  },
  togglereceitpCustom: function (name) {
    surgeryvm.receitpMsg[name] = surgeryvm.receitpMsg[name] == 1 ? "" : 1;
  }
});

$(function () {
  surgeryFun.getMsgList();
  if (_cstAgeNew) {
    surgeryvm.receitpMsg.ageFlg = 1
  } else {
    surgeryvm.receitpMsg.ageFlg = 0
  }
});

/**
 * @ 保存
 */
function saveCom() {
  if (surgeryvm.receitpMsg.sshzjjDat == '') {
    window.parent.publicFun.alert("请输入记录时间");
    return false;
  }
  window.parent._confirm('确定提交吗？', null, function () {
    jquerySubByFId('surgeryForm', insertuser_callback, null, "json");
  })
}

function insertuser_callback(data) {
  window.parent.$('#tabDiv').datagrid('reload');
  window.parent.message_alert(data);
  setTimeout(function () {
    window.location.reload();
  }, 800)
}

