var vm = avalon.define({
  $id: 'medicalRecord',
  //获取后台配置列表
  msgList: {
    ylffTypeList: publicFun.getDict('MEDICAL_PAYMENT'), // 医疗付费方式
    cstAgeCodList: publicFun.getDict('CST_AGE_COD'),
    cstSexCodList: publicFun.getDict('CST_SEX_COD'),
    zyList: publicFun.getDict('ZY'), // 职业列表
    maritalStatusList: publicFun.getDict('MARITAL_STATUS'), //婚姻状态
    jzkscompctlList: [],
    arvChlCodList: publicFun.getDict('ARV_CHL_COD'), // 入院途径
    zytjList: publicFun.getDict('TRANSIT_WAY'),
    abnDriverList: publicFun.getDict('DRIVER_COD'),
    cstDspList: publicFun.getDict('CST_DSP_COD'),
    ywgmList: [{ infocode: '0', info: '无' }, { infocode: '1', info: '有' }],
    bloodTypeList: [{ infocode: '1', info: 'A' }, { infocode: '2', info: 'B' }, { infocode: '3', info: 'AB' }, { infocode: '4', info: 'O' }, { infocode: '5', info: '不详' }, { infocode: '6', info: '未查' }],
    rhList: [{ infocode: '1', info: '阴性' }, { infocode: '2', info: '阳性' }, { infocode: '3', info: '不详' }, { infocode: '4', info: '未查' }],
    leaveDiagnoseList: [{ jbzdStatus: '', jbzdComm: '', icd: '' }, { jbzdStatus: '', jbzdComm: '', icd: '' }],
    operateList: [{ operNam: '', operDat: '', operYs: '', operSeq: '' }, { operNam: '', operDat: '', operYs: '', operSeq: '' }],
    bzList: publicFun.getDict('BZ_COD'), // 病种列表 
    czjsList: publicFun.getDict('CZJS_COD') //操作技术列表
  },
  patientMsg: {
    emgSeq: _emgSeq, //预检号
    basySeq: '',
    cstNam: '', // 姓名
    vstCad: '', // 卡号
    emgDat: '', // 预检时间
    cstSexCod: [], // 性别
    cstAge: '', // 年龄
    bthDat: '', // 出生日期
    cstAgeCod: '0', // 年龄
    chkLvlCod: '', // 预检分级
    //////////////////////////////////////
    yljg: '浙江医院', // 医疗机构
    zzjgCod: '12330000470051734A', // 组织机构代码
    ylffType: [], // 医疗付费方式
    isShowPayOtherWay: false,
    ylffOther: '',
    lqNum: '', //留抢次数
    nationality: '',// 国籍
    nation: '', // 民族
    emgJob: '', //职业
    gzdw: '', // 工作单位
    maritalStatus: '', //婚姻
    idNbr: '', // 身份证号
    cstAdr: '', // 现住址
    pheNbr: '', // 电话
    gxrNam: '', // 关系人名
    gx: '', // 关系
    gxrAddres: '', // 关系人现住址
    gxrTel: '', // 关系人电话
    docDat: '', // 接诊时间
    emgFkName: '', // 首诊科室
    emgFkCod: '', // cod
    arvCHlStr: '', // 入院途径
    lqDat: '', // 留抢时间
    lqkb: '', // 留抢科别
    lqsc: '', // 留抢时长
    lqscType: '1', // 1 天 0 时
    sqlDat: '', // 离抢时间
    sqlType: '', // 离抢方式
    jsyljgNam: '', // 接收医疗机构名称
    zytj: [], // 转运途径
    zytjOther: '', // other
    isShowTransWay: '',
    ywgm: [], // 药物过敏
    isShowGmFlag: '', // 是否显示药物过敏其他
    ywgmOther: '', // 药物过敏其他输入框
    bloodType: [], // 血型
    rh: [],
    zgysCod: '', // 主管医师
    zgysNam: '', // 主管医师
    jgysCod: '', // 经管医师
    jgysNam: '', // 经管医师
    zrhsCod: '', // 责任护士
    zrhsNam: '', // 责任护士
    jbzdDes: '', // 首诊诊断
    diagnose: '',
    creDat: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'),//时间
    creNam: _name, // 创建人name
    creCod: _number, // 创建人number
    bzCod: [], // 病种步骤
    czjsCod: [], //操作步骤
    sqlDepName: '', // 住院科室
    sqlDepCod: '',
    sqlSeq: '',
    sqlDes: '', // 所转医院
    mpi: '',
    basyCzjsList: '',
    arvChlCod: [], // 入院途径
    abnScoNme: '', // 其他医院送入
    abnDriver: '', // 120驾驶员姓名|dstdictinfo(DRIVER_COD
    abnDoctor: '', // 120医生姓名
    lqfy:''
  },
  hideMsg: {
    ylffType: '', // 医疗付费方式
    cstSexCod: '',
    zytj: '',
    ywgm: '',
    bloodType: '',
    rh: '',
    bzCod: '',
    czjsCod: '',
    arvChlCod: ''
  },
  isShowAbnDriverList: false,
  arrToStr: function (objName, idx) {
    if (vm.patientMsg[objName].$model.length > 0) {
    	vm.hideMsg[objName] = vm.patientMsg[objName].$model.join(',')
    } else {
    	vm.hideMsg[objName] = ''
    }
    if (objName === 'czjsCod') {
      var code = vm.msgList.czjsList[idx].infocode;
      if (vm.patientMsg[objName].$model.indexOf(code) == -1) {
        $('#operateId' + idx).val('')
        $('#operateIdNum' + idx).val('')
      }
    }
  },
  changeToStr: function (obj, idx) {
    var _list = vm.patientMsg[obj].$model;
    var _signalCheckList = ['ylffType', 'cstSexCod', 'zytj', 'ywgm', 'bloodType', 'rh', 'arvChlCod'];
    if ($.inArray(obj, _signalCheckList) > -1) {
      if (_list.length > 0) {
        vm.patientMsg[obj] = [vm.msgList[obj + 'List'][idx].infocode];
        vm.hideMsg[obj] = vm.msgList[obj + 'List'][idx].infocode
      } else {
        vm.patientMsg[obj] = [];
        vm.hideMsg[obj] = ''
      }
      if (obj === 'ywgm') {
        if (vm.hideMsg[obj] === '1') {
          vm.patientMsg.isShowGmFlag = true
        } else {
          vm.patientMsg.isShowGmFlag = false;
          vm.patientMsg.ywgmOther = '';
        }
      }
      if (obj === 'zytj') {
        if (vm.hideMsg[obj] === '5') {
          vm.patientMsg.isShowTransWay = true
        } else {
          vm.patientMsg.isShowTransWay = false;
          vm.patientMsg.zytjOther = '';
        }
      }
      if (obj === 'ylffType') {
        if (vm.hideMsg[obj] === '9') {
          vm.patientMsg.isShowPayOtherWay = true
        } else {
          vm.patientMsg.isShowPayOtherWay = false;
          vm.patientMsg.ylffOther = '';
        }
      }
    } else {
      if (_list.length > 0) {
        vm.hideMsg[obj] = _list.join(',');
      } else {
        vm.hideMsg[obj] = ''
      }
    }
  },
  onlyNum: function (attr, step, max) { //限定只能输入数字
    vm.patientMsg[attr] = publicFun.onlyNumber(vm.patientMsg[attr], step, max)
  },
  editOperate: function (id) {
    enterOperateMsg(id);
  },
   /**
   * @单击清空送入来源
  */
  cleanAbnSco: function () {
    vm.isShowAbnDriverList = false;
  },
  chooseAbnDriver: function (driver) {
    vm.patientMsg.abnDriver = driver;
    vm.isShowAbnDriverList = false;
  },
  delOperate: function (id) {
	  if(isOpenBox){
		  _confirm('您确认删除吗？', null, function () {
		      publicFun.httpServer({ url: _baseUrl + 'zyylqbl/deloperateBySeq.do' }, { 'operSeq': id }, function (data) {
		        message_alert(data);
		        if (data.resultInfo.type == '1') {
		          findOperateList();
		        }
		      })
		    });
	  }
  },
  addTrBg: function (idx) {
    $('.tableScroll .tableBody tr').css({ 'background': '#fff' });
    $('.tableScroll .tableBody tr').eq(idx).css({ 'background': '#f0f0f1' });
  },
  setCodVal: function () {
    vm.patientMsg.emgFkCod = vm.patientMsg.lqkb;
  },
  reversionChange: function () {
    var _sqlType  = vm.patientMsg.sqlType;
    if (_sqlType != '2') {
      vm.patientMsg.sqlDepName = '';
      vm.patientMsg.sqlDepCod = '';
    } 
    if (_sqlType != '13') {
      vm.patientMsg.sqlDes = '';
    } 
    if (_sqlType != '2' && _sqlType != '13') {
      vm.patientMsg.sqlDepName = '';
      vm.patientMsg.sqlDepCod = '';
      vm.patientMsg.sqlDes = '';
    }
  },
  // 不回车输入姓名和修改姓名时 对工号处理
  queryName: function (idx) {
    publicFun.fillDoCNameCod($('#operateId' + idx).val(), 'operateId' + idx + 'Num')
  }
});

function postPatientMsg (printFlg) {
  publicFun.cleanSignMsg('username');
  publicFun.cleanSignMsg('userSign')
  publicFun.cleanSignMsg('userNur');
  var _lsLth = vm.msgList.czjsList;
  for (var i = 0; i < _lsLth.length; i++) {
    if (publicFun.strTrim($('#operateId' + i).val()) === '') {
      $('#operateId' + i + 'Num').val('');
    }
  }
  var operList = vm.msgList.czjsList, ckOperList = vm.patientMsg.czjsCod, strName = [];
  for (var i = 0; i < operList.length; i++) {
    if (ckOperList.indexOf(operList[i].infocode) != -1) {
      strName.push({
        'docNam': $('#operateId' + i).val(),
        'docNo': $('#operateId' + i + 'Num').val(),
        'infocode': operList[i].infocode
      })
      $('.operateIdPrint' + i).html($('#operateId' + i).val())
    }
  }
  vm.patientMsg.basyCzjsList = JSON.stringify(strName);
  if (printFlg === 'print') {
    if (isOpenBox) {
      commonSaveMsg(printFlg);
    } else {
      print();
    }
  } else {
    commonSaveMsg();
  }
}

function commonSaveMsg (printFlg) {
  // if (!vm.hideMsg.cstSexCod) {
  //   publicFun.alert('性别必填')
  //   return false;
  // }
  if (printFlg === 'print') {
    jquerySubByFId('recordFrom', addCallBack, printFlg, "json");
  } else {
    _confirm('您确认提交吗？', null, function () {
      jquerySubByFId('recordFrom', addCallBack, printFlg, "json");
    })
  }
}
function addCallBack(data, printFlg) {
  if (printFlg === 'print') {
    print()
  } else {
    message_alert(data);
    setTimeout(function () {
      window.location.reload();
    }, 800)
  }
}

function getMsgList() {
  getAjaxInfo();
  findOperateList();
  getDiagnoseList();
}
var isOpenBox = false;
function addPreDgnCod(type, num) {
  var _title = '';
  if (type === '1') {
    _title = '首诊诊断'
  } else {
    _title = '离抢诊断'
  }
  createmodalwindow(_title, 800, 460, _baseUrl + 'zyyqjs/querylrNew.do?emgSeq=' + _emgSeq + '&&jbzdType=' + type + '&&trnumber=' + num , 'no');
}

function enterOperateMsg(operateSeq) {
  var _url = _baseUrl + 'zyylqbl/operatelr.do?emgSeq=' + _emgSeq;
  if (operateSeq) {
    _url = _baseUrl + 'zyylqbl/operatelr.do?emgSeq=' + _emgSeq + '&operSeq=' + operateSeq
  }
  if (isOpenBox) {
    createmodalwindow("手术操作", 600, 340, _url, 'no');
  }
}

function findOperateList() {
  publicFun.httpServer({url: _baseUrl + 'zyylqbl/findOperateListByEmgSeq.do', isNoLoad: true }, {"hspOperateInfCustom.emgSeq": _emgSeq, page: 1, rows: 2000 }, function (res) {
    var _list = res.rows;
    for (var i = 0; i < _list.length; i++) {
      if (_list[i].operDat) {
        _list[i].operDat = publicFun.timeFormat(_list[i].operDat, 'yyyy/MM/dd hh:mm:ss')
      }
    }
    var _lth = 2 - _list.length;
    for (var i = 0; i < _lth; i++) {
      _list.push({ operNam: '', operDat: '', operYs: '', operSeq: '' })
    }
    if (_list.length > 0) {
      vm.msgList.operateList = JSON.parse(JSON.stringify(_list))
    }
  })
}

function getDiagnoseList() {
  publicFun.httpServer({ url: _baseUrl + 'zyyjbzd/zyyGetJbzdInfList.do', isNoLoad: true}, { 'emgSeq': _emgSeq, 'jbzdType': '4' }, function (res) {
    var _list = res.hspJbzdInfCustomList;
    for (var i = 0; i < _list.length; i++) {
      if (_list[i].jbzdStatus === '0') {
        _list[i].jbzdStatus = '主要诊断'
      }
      if (_list[i].jbzdStatus === '1') {
        _list[i].jbzdStatus = '其他诊断'
      }
    }
    var _lth = 2 - _list.length;
    for (var i = 0; i < _lth; i++) {
      _list.push({ jbzdStatus: '', jbzdComm: '', icd: '' })
    }
    if (_list.length > 0) {
      vm.msgList.leaveDiagnoseList = JSON.parse(JSON.stringify(_list))
    }
  })
}

function getAjaxInfo() {
  publicFun.httpServer({url: _baseUrl + 'zyylqbl/medicalRecord_result.do' }, { 'hspemginfCustom.emgSeq': _emgSeq }, function (data) {
    var res = data.msg.hspBasyQueryDto, _msgList = data.msg;
    for (var key in _msgList) {
      if (vm.msgList.hasOwnProperty(key)) {
        vm.msgList[key] = JSON.parse(JSON.stringify(_msgList[key]))
      }
    }
    var _emgKey = ['cstNam', 'vstCad', 'cstSexCod', 'bthDat', 'cstAge', 'cstAgeCod', 'nationality', 'nation', 'emgJob', 'gzdw', 'maritalStatus', 'idNbr',
      'cstAdr', 'pheNbr', 'emgDat', 'chkLvlCod', 'docDat', 'emgFkName', 'emgFkCod', 'jbzdDes', 'preUsrNbr', 'preUsrNam', 'mpi'];
    var _emgRes = res.hspemginfCustom, _basyRes = res.hspBasyCustom;
    if (_emgRes) {
      for (var key in _emgRes) {
        if (!publicFun.checkItemNull(_emgRes[key])) {
          if ($.inArray(key, _emgKey) != -1) {
            if (key === 'bthDat') {
              _emgRes[key] = publicFun.timeFormat(_emgRes[key], 'yyyy/MM/dd');
            }
            if (key === 'emgDat' || key === 'docDat') {
              _emgRes[key] = publicFun.timeFormat(_emgRes[key], 'yyyy/MM/dd hh:mm:ss');
            }
            if (key === 'cstSexCod') {
              vm.hideMsg[key] = _emgRes[key];
              vm.patientMsg[key] = _emgRes[key].split(',');
            } else {
              if (vm.patientMsg.hasOwnProperty(key)) {
                vm.patientMsg[key] = _emgRes[key]
              }
            }
          }
        }
      }
    }
    if (_basyRes) {
      for (var key in _basyRes) {
        if (!publicFun.checkItemNull(_basyRes[key])) {
          if ($.inArray(key, _emgKey) < 0) {
            if (vm.hideMsg.hasOwnProperty(key)) {
              vm.hideMsg[key] = _basyRes[key];
              vm.patientMsg[key] = _basyRes[key].split(',');
              if (key === 'ywgm') {
                if (vm.hideMsg[key] === '1') {
                  vm.patientMsg.isShowGmFlag = true
                }
              }
              if (key === 'zytj') {
                if (vm.hideMsg[key] === '5') {
                  vm.patientMsg.isShowTransWay = true
                }
              }
              if (key === 'ylffType') {
                if (vm.hideMsg[key] === '9') {
                  vm.patientMsg.isShowPayOtherWay = true
                }
              }
            } else {
              if (vm.patientMsg.hasOwnProperty(key)) {
            	var _value = _basyRes[key] || '';
                if (key === 'bzCod' || key === 'czjsCod' || key === 'arvChlCod') {
                  if (_value != null && _value !== '') {
                    vm.hideMsg[key] = _value;
                    vm.patientMsg[key] = _value.split(",");
                  }
                }
                if (key === 'lqDat' || key === 'sqlDat') {
                  _basyRes[key] = publicFun.timeFormat(_basyRes[key], 'yyyy/MM/dd hh:mm:ss');
                }
                if (key === 'lqscType') {
                  if (_basyRes[key] === '0') {
                    $('.unit').html('时')
                  }
                }
                if (key === 'basyCzjsList') {
                  var operList = vm.msgList.czjsList, operValList = JSON.parse(_basyRes['basyCzjsList']);
                  for (var i = 0; i < operList.length; i++) {
                    for (var j = 0; j < operValList.length; j++) {
                      if (operList[i].infocode == operValList[j].infocode) {
                        $('#operateId' + i).val(operValList[j].docNam);
                        $('#operateId' + i + 'Num').val(operValList[j].docNo)
                        $('.operateIdPrint' + i).html(operValList[j].docNam)
                      }
                    }
                  }
                }
                vm.patientMsg[key] = _basyRes[key]
              }
            }
          }
        }
        // 如果 basySeq等于空的时候 留抢时间和留抢科别取预检时间和首诊科室，不等于空则取basyInfCustom中的数据
        // 如果basySeq不等于空离抢时间和离抢方式取basyinfCustom得数据，等于空的情况下，如果转归次数大于1，并且最新转归状态不是留抢，则显示最新状态离抢时间和离抢方式
        if (!_basyRes.basySeq) {
          vm.patientMsg.lqDat = _emgRes.emgDat;
          vm.patientMsg.lqkb = _emgRes.emgFkCod;
          vm.patientMsg.zrhsNam = _basyRes.finallyNam;
          vm.patientMsg.zrhsCod = _basyRes.finallyNur;
          // vm.patientMsg.zgysNam = _name;
          // vm.patientMsg.zgysCod = _number;
          vm.patientMsg.jgysNam = _name;
          vm.patientMsg.jgysCod = _number;
          vm.patientMsg.nationality = '中国';
          if (_emgRes.arvChlCod !== '' && _emgRes.arvChlCod != null) {
            vm.patientMsg.arvChlCod = _emgRes.arvChlCod.split(',')
            vm.hideMsg.arvChlCod = _emgRes.arvChlCod
          }
          vm.patientMsg.abnDoctor = _emgRes.abnDoctor
          vm.patientMsg.abnDriver = _emgRes.abnDriver
          vm.patientMsg.abnScoNme = _emgRes.abnScoNme
          if (_emgRes.zgcount > 1) {
            if (_emgRes.cstDspCodNew !== '6') { // (等于6是留抢）=> 不是留抢
              vm.patientMsg.sqlDat = publicFun.timeFormat(_emgRes.sqlDatNew, 'yyyy/MM/dd hh:mm:ss');
              vm.patientMsg.sqlType = _emgRes.cstDspCodNew;
            }
          }
        }
      }
      findDzqmImg();
    }
    if (!publicFun.checkItemNull(vm.patientMsg.lqDat) && !publicFun.checkItemNull(vm.patientMsg.sqlDat) && publicFun.checkItemNull(vm.patientMsg.lqsc)) {
      var _timeWrap = getTime();
      vm.patientMsg.lqsc = _timeWrap;
    }
    //用户权限判断
    checkRole();
  })
}

$(function () {
  getMsgList();
})
