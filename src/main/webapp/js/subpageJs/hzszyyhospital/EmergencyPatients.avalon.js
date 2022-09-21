var ishasList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }],
  yxyxList = [{ checked: false, infocode: '0', info: '阴性' }, { checked: false, infocode: '1', info: '阳性' }],
  sfList = [{ checked: false, infocode: '1', info: '是' }, { checked: false, infocode: '0', info: '否' }],
  dxbList = [{ checked: false, infocode: '1', info: '正常' }, { checked: false, infocode: '0', info: '失禁' }];

var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
var EmergencyFun = {
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
          if (jzbrvm.receitpList.hasOwnProperty(key)) {
            $.each(val, function (idx, valu) {
              valu['checked'] = false
            })
            jzbrvm.receitpList[key] = val;
          }
        });
      }
      var getMsgUrl = _baseUrl + "hzszyyjjd/findjzbr.do",
        getMsgData = {
          "hspJzbrjjInfCustom.jzbrjjSeq": _jzbrjjSeq,
          date: new Date().toTimeString()
        };
      EmergencyFun.getPatientMsg(getMsgUrl, getMsgData);
    });
  },
  /**
   * @ 修改拿数据
   */
  getPatientMsg: function (url, data) {
    EmergencyFun.httpGetMsg(url, data).done(function (res) {
      var _res = res;
      for (var _key in _res['hspJzbrjjInfCustom']) {
        EmergencyFun.systemassignment(jzbrvm.receitpMsg, _res.hspJzbrjjInfCustom);
      }
    });
  },
  getCheckBoxList: function () {
    return ["jzbrjjSzCod", "jzbrjjDgfyCod", "jzbrjjSpjbgFlg", "jzbrjjJgbgFlg", "jzbrjjYzgmsyJgFlg", "jzbrjjSyFlg", "jzbrjjSyCod", "jzbrjjKfyFlg", "jzbrjjZjyFlg", "jzbrjjQgcgFlg", "jzbrjjYlgFlg", "jzbrjjYlgTcFlg", "jzbrjjPfCod", "jzbrjjGwxsFlg", "jzbrjjSgbgFlg", "jzbrjjKqnmCod", "jzbrjjDxbFlg"];
  },
  systemassignment: function (toObj, res) {
    var checkBoxList = EmergencyFun.getCheckBoxList(), // 获取带有checkbox的字符串列表
      checkboxBList = ["jzbrjjSpjbgFlg", "jzbrjjJgbgFlg", "jzbrjjYzgmsyJgFlg", "jzbrjjSyFlg", "jzbrjjKfyFlg", "jzbrjjZjyFlg", "jzbrjjQgcgFlg", "jzbrjjYlgFlg", "jzbrjjYlgTcFlg", "jzbrjjGwxsFlg", "jzbrjjSgbgFlg", "jzbrjjDxbFlg"];
    for (var key in res) {
      if (toObj.hasOwnProperty(key)) {
        var _value = res[key] || '';
        if (_value != '' && _value != null) {
          if (key == 'jzbrjjYzjcCod' || key == 'jzbrjjYzhyCod' || key == 'jzbrjjYzgczCod') {
            jzbrvm.receitphideMsg[key] = _value;
            jzbrvm.receitpMsg[key] = res[key].split(",") || [];
            var _json = String(res[key]).split(","),
              _list = jzbrvm.receitpList;
            $.each(_list[key + "List"], function (idx, val) {
              _list[key + "List"][idx].checked = EmergencyFun.inArray(_list[key + "List"][idx]["infocode"], _json) >= 0 ? true : false
            });
          } else if ($.inArray(key, checkBoxList) > -1) {
            $.each(jzbrvm.receitpList[key + 'List'], function (idx, val) {
              if (val['infocode'] == _value) {
                val['checked'] = true
              }
            })
            toObj[key] = _value;
            // if ($.inArray(key, checkboxBList) > -1) {
            //     toObj[key] = _value;
            // }
          } else {
            if (key == 'jzbrjjDat' || key == 'jzbrjjJbsj') {
              _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss');
            }
            // if(key=='cretNam') {
            //     window.parent.$('#_cretNam').html(_value);
            // }
            toObj[key] = _value;
          }
        }
      }
    }
  }
};

var jzbrvm = avalon.define({
  $id: 'EmergencyPatients',
  //获取后台配置列表
  receitpList: {
    jzbrjjSzCodList: [],//神志（数据字典）List
    jzbrjjDgfyCodList: [],//对光反射（数据字典）List
    jzbrjjYzjcCodList: [],//已做检查（数据字典）List
    jzbrjjSpjbgFlgList: ishasList,//有无摄片及报告List
    jzbrjjYzhyCodList: [],//已做化验（数据字典）List
    jzbrjjJgbgFlgList: ishasList,//有无结果报告List
    jzbrjjYzgmsyJgFlgList: yxyxList,//已做过敏试验（药名）结果（0：阴性: 1：阳性）List
    jzbrjjYzgczCodList: [],///已做过处置（数据字典）List
    jzbrjjSyFlgList: ishasList,//有无输液（0：无 1：有）List
    jzbrjjSyCodList: [],//输液内容（数据字典）List
    jzbrjjKfyFlgList: ishasList,//有无带入药品口服药（0：无 1：有）List
    jzbrjjZjyFlgList: ishasList,//有无带入药品针剂药（0：无 1：有）List
    jzbrjjQgcgFlgList: ishasList,//有无气管插管（0：无 1：有）List
    jzbrjjYlgFlgList: ishasList,//有无引流管（0：无 1：有）List
    jzbrjjYlgTcFlgList: sfList,//引流管是否畅通（0：否 1：是）List
    jzbrjjPfCodList: [],//皮肤（数据字典）List
    jzbrjjGwxsFlgList: ishasList,//皮肤有无高危因素（0：无 1：有）List
    jzbrjjSgbgFlgList: sfList,//皮肤是否报告（0：否 1：是）List
    jzbrjjKqnmCodList: [],//口腔黏膜(数据字典) List
    jzbrjjDxbFlgList: dxbList//大小便状态（0：正常 1：失禁）List
  },
  receitpMsg: {
    jzbrjjSzCod: '',//神志（数据字典）
    jzbrjjTkz: '',//瞳孔：左
    jzbrjjTky: '',//瞳孔：右
    jzbrjjDgfyCod: '',//对光反射（数据字典）
    jzbrjjTw: '',//生命体征体温
    jzbrjjMb: '',//生命体征脉搏
    jzbrjjHx: '',//生命体征呼吸
    jzbrjjBpUp: '',//生命体征血压 上
    jzbrjjBpDown: '',//生命体征血压 下
    jzbrjjSao2: '',//生命体征血氧浓度
    jzbrjjYzjcCod: [],//已做检查（数据字典）
    jzbrjjSpjbgFlg: '',//有无摄片及报告（0：无 1：有）,
    jzbrjjSpjbgZ: '',//摄片及报告张数
    jzbrjjYzhyCod: [],//已做化验（数据字典）
    jzbrjjYzhyQt: '',//已做化验其他
    jzbrjjJgbgFlg: '',//有无结果报告（0：无 1：有）
    jzbrjjJgbgZ: '',//结果报告张数
    jzbrjjYzgmsy: '',//已做过敏试验（药名）
    jzbrjjYzgmsyJgFlg: '',//已做过敏试验（药名）结果（0：阴性: 1：阳性）
    jzbrjjYzgczCod: [],//已做过处置（数据字典）
    jzbrjjYzgczQt: '',//已做过处置其他
    jzbrjjSyFlg: '',//有无输液（0：无 1：有）
    jzbrjjSyCod: '',//输液内容（数据字典）
    jzbrjjSyQt: '',//输液其他
    jzbrjjKfyFlg: '',//有无带入药品口服药（0：无 1：有）
    jzbrjjKfyYm: '',//带入药品口服药药名
    jzbrjjZjyFlg: '',//有无带入药品针剂药（0：无 1：有）
    jzbrjjZjyYm: '',//带入药品针剂药药名
    jzbrjjQgcgFlg: '',//有无气管插管（0：无 1：有）
    jzbrjjQgcgXh: '',//气管插管型号
    jzbrjjQgcgSd: '',//气管插管插入深度
    jzbrjjYlgFlg: '',//有无引流管（0：无 1：有）
    jzbrjjYlgLx: '',//引流管类型
    jzbrjjYlgTcFlg: '',//引流管是否畅通（0：否 1：是）
    jzbrjjPfCod: '',//皮肤（数据字典）
    jzbrjjGwxsFlg: '',//皮肤有无高危因素（0：无 1：有）
    jzbrjjSgbgFlg: '',//皮肤是否报告（0：否 1：是）
    jzbrjjYcFlg: '',//皮肤有无压疮（0：无 1：有）
    jzbrjjYcFw: '',//皮肤压疮部位／范围 
    jzbrjjKqnmCod: '',//口腔黏膜(数据字典)
    jzbrjjDxbFlg: '',//大小便状态（0：正常 1：失禁）
    jzbrjjYyyswjc: '',//已预约尚未检查的项目
    jzbrjjWwcjc: '',//未完成检查项目
    jzbrjjTbzy: '',//特别注意事项
    jzbrjjJbhsNbr: _userno,//交班护士用户号
    jzbrjjJbhsNam: _username,//交班护士用户名
    jzbrjjJbbfNbr: '',//接班病房科室号
    jzbrjjJbbf: '',//接班病房科室名
    jzbrjjJchsNbr: '',//接班护士用户号
    jzbrjjJchsNam: '',//接班护士用户名
    jzbrjjJbsj: '',//交班时间
    ageFlg: 0,
    jzbrjjDat: today, //时间
    cretNam: ''//创建人
  },
  receitphideMsg: {
    jzbrjjYzjcCod: '',//已做检查（数据字典）
    jzbrjjYzhyCod: '',//已做化验（数据字典）
    jzbrjjYzgczCod: ''//已做过处置（数据字典）
  },

  /**
   * @ 单选 
   */
  receitpradioclick: function (name, idx) {
    jzbrvm.receitpMsg[name] = publicFun.radioClicks(jzbrvm.receitpList[name + 'List'], jzbrvm.receitpMsg[name], idx)
  },
  /**
   * @ 多选
   */
  receitpcheckClick: function (objName, idx) {
    jzbrvm.receitphideMsg[objName] = publicFun.checkClicks(jzbrvm.receitpList[objName + 'List'], jzbrvm.receitpMsg[objName], idx, jzbrvm.receitphideMsg[objName])
  },
  onlyNum: function (attr, step, max) { //限定只能输入数字
    jzbrvm.receitpMsg[attr] = publicFun.onlyNumber(jzbrvm.receitpMsg[attr], step, max)
  },
  togglereceitpCustom: function (name) {
    jzbrvm.receitpMsg[name] = jzbrvm.receitpMsg[name] == 1 ? "" : 1;
  }
});

$(function () {
  EmergencyFun.getMsgList();

  if (_cstAgeNew) {
    jzbrvm.receitpMsg.ageFlg = 1
  } else {
    jzbrvm.receitpMsg.ageFlg = 0
  }
})


/**
 * @ 保存
 */
function saveCom() {
  if (jzbrvm.receitpMsg.jzbrjjDat == '') {
    window.parent.publicFun.alert("请输入记录时间");
    return false;
  }
  window.parent._confirm('确定提交吗？', null, function () {
    jquerySubByFId('emergencyForm', insertuser_callback, null, "json");
  })
}

function insertuser_callback(data) {
  window.parent.$('#tabDiv').datagrid('reload');
  window.parent.message_alert(data);
  setTimeout(function () {
    window.location.reload();
  }, 800)
  // setTimeout(function() {
  //     parent.opentabwindow(sub.hlpgbpatientMsg.cstNam + '-护理评估表', _baseUrl + "${baseurl}hlpgb/queryhlpgb.do?emgSeq=" + _emgSeq + "&th=" + new Date().getTime());
  // }, 1000)
}
/**
 * @监听 -摄片及报告。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjSpjbgFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjSpjbgZ = '';
  }
});
/**
 * @监听 - 结果报告。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjJgbgFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjJgbgZ = '';
  }
});
/**
 * @监听 - 输液。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjSyFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjSyCod = '';
    var items = $("#infuseSpan").find("input[type='checkbox']");
    items.each(function () {
      $(this).attr('checked', false);
    })
  }
});
/**
 * @监听 - 口服药 。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjKfyFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjKfyYm = '';
  }
});
/**
 * @监听 - 口服药-详情 。if != "" , -flag = 1
 */
jzbrvm.receitpMsg.$watch('jzbrjjKfyYm', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && jzbrvm.receitpMsg.jzbrjjKfyFlg != '1') {
    var list = jzbrvm.receitpList['jzbrjjKfyFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    jzbrvm.receitpMsg.jzbrjjKfyFlg = '1';
  }
});
/**
 * @监听 - 针剂药 。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjZjyFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjZjyYm = '';
  }
});
/**
 * @监听 - 针剂药-详情 。if != "" , -flag = 1
 */
jzbrvm.receitpMsg.$watch('jzbrjjZjyYm', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && jzbrvm.receitpMsg.jzbrjjZjyFlg != '1') {
    var list = jzbrvm.receitpList['jzbrjjZjyFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    jzbrvm.receitpMsg.jzbrjjZjyFlg = '1'
  }
});
/**
 * @监听 - 气管插管 。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjQgcgFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjQgcgXh = '';
    jzbrvm.receitpMsg.jzbrjjQgcgSd = '';
  }
});
/**
 * @监听 - 气管插管-详情 。if != "" , -flag = 1
 */
jzbrvm.receitpMsg.$watch('jzbrjjQgcgXh', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && jzbrvm.receitpMsg.jzbrjjQgcgFlg != '1') {
    var list = jzbrvm.receitpList['jzbrjjQgcgFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    jzbrvm.receitpMsg.jzbrjjQgcgFlg = '1'
  }
});
jzbrvm.receitpMsg.$watch('jzbrjjQgcgSd', function (newVal, oldVal) {
  if (newVal != '' && jzbrvm.receitpMsg.jzbrjjQgcgFlg != '1') {
    var list = jzbrvm.receitpList['jzbrjjQgcgFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    jzbrvm.receitpMsg.jzbrjjQgcgFlg = '1'
  }
});
/**
 * @监听 - 引流管 。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjYlgFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal == '') {
    jzbrvm.receitpMsg.jzbrjjYlgLx = '';
    jzbrvm.receitpMsg.jzbrjjYlgTcFlg = '';
    var _items = $("#tcSpan").find("input[type='checkbox']");
    _items.each(function () {
      $(this).attr('checked', false);
    })
  }
});
/**
 * @监听 - 引流管-详情 。if != "" , -flag = 1
 */
jzbrvm.receitpMsg.$watch('jzbrjjYlgLx', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && jzbrvm.receitpMsg.jzbrjjYlgFlg != '1') {
    var list = jzbrvm.receitpList['jzbrjjYlgFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    jzbrvm.receitpMsg.jzbrjjYlgFlg = '1'
  }
});
jzbrvm.receitpMsg.$watch('jzbrjjYlgTcFlg', function (newVal, oldVal) {
  if (newVal != '' && jzbrvm.receitpMsg.jzbrjjYlgFlg != '1') {
    var list = jzbrvm.receitpList['jzbrjjYlgFlgList'];
    list['0']['checked'] = false;
    list['1']['checked'] = true;
    jzbrvm.receitpMsg.jzbrjjYlgFlg = '1'
  }
});
/**
 * @监听 - 压疮 。if != 1 , -结果值为""
 */
jzbrvm.receitpMsg.$watch('jzbrjjYcFlg', function (newVal, oldVal) {
  if (newVal == 0 || newVal === '') {
    jzbrvm.receitpMsg.jzbrjjYcFw = '';
  }
});
