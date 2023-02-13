function diffIsPreChecked(row) {
  if (row.emgDepCod !== "" && row.emgDepCod != null && row.ghid !== null && row.ghid !== "") {
    return "background: #c8c996;"
  } else {
    return "background: #fff;"
  }
}
// 左边列表
function generateCols() {
  var columns_v = [
    [
      // {
      //   field: "emgDepCod",
      //   title: "",
      //   width: 26,
      //   formatter: function (value, row, index) {
      //     if (value == "I级") {
      //       return '<div class="levelAbg">I</div>'
      //     } else if (value == "II级") {
      //       return '<div class="levelBbg">II</div>'
      //     } else if (value == "III级") {
      //       return '<div class="levelCbg">III</div>'
      //     } else if (value == "IV级") {
      //       return '<div class="levelDbg">IV</div>'
      //     }
      //   },
      //   styler: function (value, row, index) {
      //     if (row.ghid && row.emgDepCod) {
      //       if (row.emgDepCod == "I级") {
      //         return "background: red;"
      //       } else if (row.emgDepCod == "II级") {
      //         return "background: #ff9900;"
      //       } else if (row.emgDepCod == "III级") {
      //         return "background: #f3d800;"
      //       } else if (row.emgDepCod == "IV级") {
      //         return "background: #44b548;"
      //       } else {
      //         return "background: #fff;"
      //       }
      //     } else {
      //       return "background: #fff;"
      //     }
      //   },
      // },
      {
        field: "cstNam",
        title: "姓名",
        width: 70,
        // styler: function (value, row, index) {
        //   if (row.ghid && row.emgDepCod) {
        //     if (row.emgDepCod == "I级") {
        //       return "background: red;"
        //     } else if (row.emgDepCod == "II级") {
        //       return "background: #ff9900;"
        //     } else if (row.emgDepCod == "III级") {
        //       return "background: #f3d800;"
        //     } else if (row.emgDepCod == "IV级") {
        //       return "background: #44b548;"
        //     } else {
        //       return "background: #fff;"
        //     }
        //   } else {
        //     return "background: #fff;"
        //   }
        // }
      },
      // {
      //   field: "emgFkName",
      //   title: "就诊科室",
      //   width: 68,
      //   styler: function (value, row, index) {
      //     return diffIsPreChecked(row)
      //   },
      // },
      {
        field: "vstCad", //mpi
        title: "就诊号", //病历号
        width: 70,
        // styler: function (value, row, index) {
        //   return diffIsPreChecked(row)
        // },
      },
      {
        field: "regTim",
        title: "预检日期",
        width: 130,
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, "yyyy/MM/dd hh:mm") : ""
        },
        // styler: function (value, row, index) {
        //   return diffIsPreChecked(row)
        // },
      }
    ],
  ]
  return columns_v
}
function getLeftData() {
  cancelPop();
  var _hth = window.innerHeight || document.documentElement.clientHeight || document.body.clientHeight;
  var height = _hth - 78 - 30
  $("#registeredList").height(height)
  var _checkFlg = $('input[name="querytype"]:checked').val()
  _checkFlg = _checkFlg == "1" ? "1" : "0";
  if (_checkFlg == '1') {
    getUnPreCheckMsg() // 已挂号未预检
  } else {
    if ($('#preExaminePatientInput').attr('checked')) {
      getPreHospitalPatientMsg() // 待预检院前患者
    } else {
      getAlreadySavedMsg() // 分诊列表
    }
  }
}

function getAlreadySavedMsg () {
  // $(".left-tab").append('<div id="load" class="loadingWrapBox" style="width:99%;position:absolute;top:40%;text-align:center;"><img src="' + _baseUrl + 'images/common/loading.gif" /></div>');
  var _notLinked = $('#ghInput').attr('checked') ? '0' : '1'; // notLinked（0-勾选，1-不勾选）
  var _tempStorage = $('#tempStorageInput').attr('checked') ? '1' : ''; // tempStorage（1-勾选，''-不勾选）
  $("#registeredList").datagrid({
    nowrap: false,
    striped: true,
    singleSelect: true,
    queryParams: {
      "cstNam": $("#nameXm").val(),  //因为要同时查病历号和名字，所以传参名改一下
      'startDate': $("#startDat").val(),
      'endDate': $("#endDat").val(),
    },
    url: _baseUrl + "jzbr/getPatientListForDbzlBas.do",
    idField: "emgSeq",
    loadFilter: function (data) {
      if (data.resultInfo && data.resultInfo.messageCode == "109") {
        message_alert(data, function () {
          window.location.href = _baseUrl + "first.do"
        })
      }
      // $('#load').remove();
      //  $(".datagrid-body").animate({
      //    scrollTop: 0
      //  }, 500);
      return data
    },
    loadMsg: "正在加载中",
    columns: generateCols(),
    pagination: true,
    rownumbers: true,
    pageList: [50, 80, 100],
    toolbar: [],
    onDblClickRow: function (rowIndex,rowData) {
      regSeq = rowData.regSeq
      judgeIsEverEdit();
    },
    rowStyler: function (index, row) {
      // 此处可以添加条件
      if (row.status == "0") {
        return "color:red;"
      }
    }
  })
}

function getUnPreCheckMsg () {
  $("#registeredList").datagrid({
    nowrap: false,
    striped: true,
    singleSelect: true,
    queryParams: {
      "hspemginfCustom.senStuCodName": $("#nameXm").val(),  //因为要同时查病历号和名字，所以传参名改一下
      'hspemginfCustom.startdate': $("#startDat").val(),
      'hspemginfCustom.enddate': $("#endDat").val(),
      'querytype':'day'
    },
    url: _baseUrl + "his/queryYghwyj_result.do",
    idField: "emgSeq",
    loadFilter: function (data) {
      if (data.resultInfo && data.resultInfo.messageCode == "109") {
        message_alert(data, function () {
          window.location.href = _baseUrl + "first.do"
        })
      }
      return data
    },
    loadMsg: "正在加载中",
    columns: [
      [
        {
          field: "cstNam",
          title: "姓名",
          width: 76
        },
        {
          field: "emgFkName",
          title: "挂号科室",
          width: 68 
        },
        {
          field: "vstCad", //mpi
          title: "就诊号", //病历号
          width: 66 
        },
        {
          field: "ghsjStr",
          title: "挂号时间",
          width: 90,
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, "yyyy/MM/dd hh:mm").substring(5) : ""
          }
        }
      ]
    ],
    pagination: true,
    rownumbers: true,
    pageList: [50, 80, 100],
    toolbar: [],
    onDblClickRow: function () {
      judgeIsEverEdit();
    },
    rowStyler: function (index, row) {
      // 此处可以添加条件
      if (row.status == "0") {
        return "color:red;"
      }
    }
  })
}

function judgeIsEverEdit () {
  var _confirmFlg = false
  for (var key in patientBf) {
    var compareKey = JSON.parse(JSON.stringify(vm.patientMsg[key]))
    if (typeof compareKey == "object" && compareKey != null) {
      compareKey = compareKey.join(",")
      // patientBf[key] = patientBf[key].join(',')
    }
    if (typeof patientBf[key] == "object" && patientBf[key] != null) {
      patientBf[key] = patientBf[key].join(",")
    }
    if (compareKey != patientBf[key]) {
      _confirmFlg = true
    }
  }
  for (var key in aboutMewsBf) {
    var compareMKey = JSON.parse(JSON.stringify(vm.aboutMews[key]))
    if (compareMKey != aboutMewsBf[key]) {
      _confirmFlg = true
    }
  }
  if (_confirmFlg) {
    _confirm("请确认该信息是否已保存？", null, function () {
      cmdPreCheck()
    })
  } else {
    cmdPreCheck()
  }
}

function cleanAndSetMsg() {
  // 先清空页面上的数据再进行赋值
  for (var k in vm.patientMsg) {
    if (typeof vm.patientMsg[k] == "object") {
      vm.patientMsg[k] = []
    } else {
      vm.patientMsg[k] = ""
    }
  }
  for (var k in vm.hideMsg) {
    vm.hideMsg[k] = ""
  }
  for (var k in vm.aboutMews) {
    vm.aboutMews[k] = ""
  }
  for (var k in vm.aboutPEWS) {
    vm.aboutPEWS[k] = ""
  }
  _emgSeq = '';
  $('#emg_emgSeq').val('');
  for (var i = 0; i < vm.getMsg.modLvlCodList.length; i++) {
    vm.getMsg.modLvlCodList[i].checked = false
  }
  for (var i = 0; i < vm.getMsg.wzbzList.length; i++) {
    vm.getMsg.wzbzList[i].checked = false
  }
  $('.tab-lab input[type="checkbox"]').attr("checked", false)
  var _idList = ["zjzzQt", "ksfzParam", "cmpPsnCodParam", "zjzzCodParam", 'yjbzCodParam', 'fdcsCodParam','remarkQt']
  for (var i = 0; i < _idList.length; i++) {
    $("#" + _idList[i]).val("")
  }
  vm.patientMsg.zjzzQt = ""
  var _zeroList = ["grnChl", "swChl", "cstAgeCod", "czFlag", "qtsjFlg", "glsCod", "ttpfTypeCod", "xtlcflg", "czlcflg"]
  for (var i = 0; i < _zeroList.length; i++) {
    vm.patientMsg[_zeroList[i]] = "0"
  }
  vm.saveCstDspCod = '';
  vm.patientMsg.cstDspCod = "";
  vm.patientMsg.isGetAjaxFlg = false;
  vm.isCanSave = true;
  $('.scroll-list-div').hide();
  $('.param-input').css({ 'box-shadow': 'none' })
  var flgList = ['isShowAbnScoList', 'isShowDocList', 'isShowAbnDriverList', 'isShowAbnDoctorList', 'grnChlRsnShowFlg'];
  for (var i = 0; i < flgList.length; i++) {
    vm[flgList[i]] = false;
  }
  $(".userList").hide();
}
function cmdPreCheck() {
  var rows = $("#registeredList").datagrid("getSelected")
  var _checkFlg = $('input[name="querytype"]:checked').val()
  _checkFlg = _checkFlg == "1" ? "1" : "0";
  $('.scroll-list-div').hide();
  $('.param-input').css({ 'box-shadow': 'none' })
  if (GridUtils.checkChecked(rows)) {
    cleanAndSetMsg()
    if (_checkFlg == '1') { // 已挂号未预检
      var _fieldList = ['vstCad', 'cstNam', 'idNbr', 'cstAdr', 'cstSexCod', 'ghid', 'pheNbr'];
      _fieldList.forEach(function (item) {
        vm.patientMsg[item] = rows[item]
      })
      vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
      vm.patientMsg.bthDat = publicFun.timeFormat(new Date(rows.bthDat), 'yyyy/MM/dd')
      // $.each(vm.getMsg.jzkscompctlList, function (idx, val) {
      //   if (val['comcname'] == rows.emgFkName) {
      //     vm.patientMsg.emgFkCod = val['comno'];
      //   }
      // });
      vm.patientMsg.patientTyp = '1';
      vm.isEditPage = '0';
      typeForm = 'precheck';
      vm.calcPatType();
      patientBf = JSON.parse(JSON.stringify(vm.patientMsg))
      aboutMewsBf = JSON.parse(JSON.stringify(vm.aboutMews))
    } else { // 已预检
      _emgSeq = rows.emgSeq
      $("#emg_emgSeq").val(rows.emgSeq)
      vm.isEditPage = "1"
      typeForm = "edit"
      // 解决左侧列表点击进入的床位列表显示bug
      vm.getMsg.lgBedList = [];
      vm.getMsg.emgBedList = [];
      vm.getMsg.lgBedTempList = [];
      vm.getMsg.emgBedTempList = [];
      editFun.getMsgList()
    }
  }
}

function reloadLeftTab() {
  $("#registeredList").datagrid("reload")
}

// 待预检院前患者
function getPreHospitalPatientMsg () {
  $("#registeredList").datagrid({
    nowrap: false,
    striped: true,
    singleSelect: true,
    queryParams: {
      'startdate': $("#startDat").val(),
      'enddate': $("#endDat").val(),
      'type': '2'
    },
    url: _baseUrl + "yqjjMk/queryBrxx_result.do",
    idField: "emgSeq",
    loadFilter: function (data) {
      if (data.resultInfo && data.resultInfo.messageCode == "109") {
        message_alert(data, function () {
          window.location.href = _baseUrl + "first.do"
        })
      }
      return data
    },
    loadMsg: "正在加载中",
    columns: [
      [
        {
          field: "patientName",
          title: "姓名",
          width: 76
        },
        {
          field: "patientSocialSecurityCard",
          title: "就诊号",
          width: 68 
        },
        {
          field: "tentativeDiagnosis",
          title: "院前诊断",
          width: 66 
        },
        {
          field: "onsetTimeStr",
          title: "预计发病时间",
          width: 90,
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, "yyyy/MM/dd hh:mm").substring(5) : ""
          }
        }
      ]
    ],
    pagination: true,
    rownumbers: true,
    pageList: [50, 80, 100],
    toolbar: [],
    onDblClickRow: function () {
      setPreHospitalPatientMsg();
    }
  })
}

function dealNullItem (item) {
  for (var key in item) {
    item[key] == null ? '' : item[key]
  }
  return item
}

// 设置院前患者数据
// 双击“院前患者”列表，左侧调用新增“预检页面”
function setPreHospitalPatientMsg () {
  var row = $("#registeredList").datagrid("getSelected")
  if (GridUtils.checkChecked(row)) {
    fillPreHosMsg(row.taskNo)
  }
}

function setPreCheckDisable () {
  if ($('#preExaminePatientInput').attr('checked')) {
    $('.preCheck').attr('checked', false)
  }
}

function setAfterCheckDisable () {
  if ($('#ghInput').attr('checked') || $('#tempStorageInput').attr('checked')) {
    $('#preExaminePatientInput').attr('checked', false)
  }
}

function fillPreHosMsg (taskNo) {
  publicFun.httpServer({url: _baseUrl + 'yqjjMk/findBrxxBytaskNo.do'}, {'taskNo': taskNo }, function (data) {
    if (data.resultInfo.type === 1) {
      var item = data.resultInfo.sysdata.yqjjBrxxCustom;
      var _item = dealNullItem(item)
      cleanAndSetMsg()
      var curPat = vm.patientMsg, mewsMsg = vm.aboutMews;
      curPat.vstCad = _item.patientSocialSecurityCard;
      curPat.idNbr = _item.patientIdCard;
      curPat.cstNam = _item.patientName;
      curPat.cstSexCod = _item.sex;
      if (_item.age) {
        var _lth = _item.age.length - 1;
        if (_item.age.charCodeAt(_lth) > 256) {
          var codUnit = _item.age.substring(_item.age.length - 1);
          curPat.cstAgeCod = codUnit === '岁' ? '0' : codUnit === '月' ? '1' : codUnit === '天' ? '2' : '';
          curPat.cstAge = _item.age.substring(0, _item.age.length - 1);
        } else {
          curPat.cstAge = _item.age;
        }
      }
      if (_item.accompanyPerson !== null) {
        curPat.cmpPsnCod = _item.accompanyPerson.split(','); // 陪送人员
        fillInputText('cmpPsnCod', curPat.cmpPsnCod)
      }
      mewsMsg.tmpNbr = _item.carTemp;
      mewsMsg.hrtRte = _item.carPulse;
      mewsMsg.breNbr = _item.carResp;
      mewsMsg.sbpUpNbr = _item.carSbp;
      mewsMsg.sbpDownNbr = _item.carDbp;
      curPat.oxyNbr = _item.auxExamSpo2;
      curPat.preDgnCod = _item.sympTom;
      curPat.sendInCod = '0'; // 120送入 实际应该是根据中心代码区别是院内120还是院外120.当前默认放“院内120”
      curPat.abnDriver = _item.abnDriver;
      curPat.abnDoctor = _item.abnDoctor;
      curPat.abnScoNme = _item.hospitalName; // 转入医院
      curPat.senStuCod = _item.consciousness; // 意识
      curPat.patid = taskNo;
      vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
      vm.patientMsg.bthDat = publicFun.timeFormat(new Date(_item.birth), 'yyyy/MM/dd')
      vm.patientMsg.patientTyp = '1';
      vm.isEditPage = '0';
      typeForm = 'precheck';
      // vm.calcPatType();
      patientBf = JSON.parse(JSON.stringify(vm.patientMsg))
      aboutMewsBf = JSON.parse(JSON.stringify(vm.aboutMews))
    }
  })
}