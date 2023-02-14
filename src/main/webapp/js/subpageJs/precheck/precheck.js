var jsbrFun = {
  /**
   * @获取所有需要提交的数据
   */
  getAllPostMsg: function () {
    var allPostMsg = {}
    commonFun.copyObj(vm.patientMsg, allPostMsg)
    commonFun.copyObj(vm.aboutMews, allPostMsg)
    // commonFun.copyObj(vm.aboutGCS, allPostMsg)
    commonFun.copyObj(vm.aboutCRAMS, allPostMsg)
    commonFun.copyObj(vm.hideMsg, allPostMsg)
    return allPostMsg
  },
  checkNull: function (checkTypeList, postMsg) {
    var postMsgDetail = "";
    var allAlertMsg = jsbrAlertMsg.allAlertMsg;
    for (var key in allAlertMsg) {
      if (checkTypeList.indexOf(key) != -1) {
        postMsgDetail = postMsg[key] == null ? "" : postMsg[key].replace(/(^\s*)|(\s*$)/g, '');
        if (key === 'zjzzCod') {
          if ($('#zjzzCodParam').val() === '' || $('#zjzzCodParam').val() == null) {
            publicFun.alert(allAlertMsg[key]);
            vm.isCanSave = true; // 重置保存
            return false
          }
        } else {
          if (postMsgDetail === '') {
            publicFun.alert(allAlertMsg[key]);
            vm.isCanSave = true; // 重置保存
            return false
          }
        }
      }
    }
  },
}
var normalRequireList = ["regTim", "cstNam", "preDgnCod", "tiw", "huxipl", "mb", "sbpUpNbr", "sbpDownNbr", "xueyang", "nrsSco", "senStuCod", "senRctCod", "fallAssEssText", "cstDspCod", "emgFkCod"];
var jsbrAlertMsg = {
  allAlertMsg: {
    regTim: "预检时间必填",
    cstNam: "姓名必填",
    // preDgnCod: "主诉症状必填",
    // tiw: "体温必填",
    // huxipl: "呼吸必填",
    // mb: "脉搏必填",
    // sbpUpNbr: "血压必填",
    // sbpDownNbr: "血压必填",
    // xueyang: "血氧必填",
    // nrsSco: "疼痛评分必填",
    // senStuCod: "意识必填",
    // senRctCod: "AVPU必填",
    // fallAssEssText: "跌倒评估必填",
    pregnantYdcxCod: "阴道出血必填",
    pregnantGsplCod: "宫缩频率必填",
    // cstDspCod: "病人去向必填",
    // emgFkCod: "就诊科室必填",
  },
  ksfz: ["regTim", "cstNam", "preDgnCod", "cstDspCod", "emgFkCod"],
  normalFz: normalRequireList,
  normalFz3: normalRequireList.concat(['pregnantYdcxCod', 'pregnantGsplCod']),
  normalFz4: normalRequireList.concat(['pregnantYdcxCod']),
  mass: ['regTim', 'cstNam', 'preDgnCod', 'cstDspCod', 'emgFkCod']
}

var patientBf = {},
  aboutMewsBf = {}
/**
 * @endMinDate  控制预检时间能调配的最小时间，当前控制了最多往前改60分钟。即：60*60*1000 = 3600000
 * @return  {string}    endMinDate    最小时间
 * @author  ql
 */
function endMinDate() {
  return publicFun.timeFormat(new Date() - 3600000, "yyyy/MM/dd hh:mm:ss")
}
/**
 * @endMaxDate  控制预检时间能调配的最小时间，当前时间
 * @return  {string}    endMaxDate    当前时间
 * @author  ql
 */
function endMaxDate() {
  return publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss")
}

// 左侧列表 开始时间是前一天 结束时间默认当天
function setCurrentTime() {
  //var preDate = new Date(new Date().getTime() - 24*60*60*1000); //前一天
  $("#startDat").val(publicFun.timeFormat(new Date(), "yyyy/MM/dd"))
  $("#endDat").val(publicFun.timeFormat(new Date(), "yyyy/MM/dd"))
}

var editFun = {
  getMsgList: function () {
    comparePreFieldInfo = generateFieldObj(); // 所有要对比的字段对象
    compareSufFieldInfo = generateFieldObj() // 初始化对比对象
    publicFun.httpServer({ url: _baseUrl + "hzszyyemg/findEmgList_zyy.do", isAsync: false },  { _t: Date.parse(new Date()) }, function (res) {
      initDictList(res)
      editFun.getPatientMsg()
    })
  },
  getPatientMsg: function () {
    publicFun.httpServer(
      { url: _baseUrl + "jzbr/queryHspDbzlBasinf.do"},
      {
        "hspDbzlBasCustom.regSeq":regSeq
      },
      function (res) {
        var data = res.resultInfo.sysdata
        vm.patientMsg.regSeq = data.hspDbzlBasCustom.regSeq
        editFun.dealAlreadyMsg(data)
        // getChildPfMsg();
        setRightPanelWth()
      }
    )
  },
  processingData: function (res) {
    /**
     * @特殊处理出生日期
     */
    // var _dateKey = ["regTim", "docDat", "checkDocDat", "checkNurseDat"]
    var _dateKey = ["regTim", "bthDat"]
    for (var i = 0; i < _dateKey.length; i++) {
      if (res[_dateKey[i]]) {
        res[_dateKey[i]] = publicFun.timeFormat(res[_dateKey[i]], "yyyy/MM/dd hh:mm:ss")
      }
    }
    var _onlyDateKey = ["mnsLstDat", "mcyj"]
    for (var i = 0; i < _onlyDateKey.length; i++) {
      if (res[_onlyDateKey[i]]) {
        res[_onlyDateKey[i]] = publicFun.timeFormat(res[_onlyDateKey[i]], "yyyy/MM/dd")
      }
    }
    for (var key in res) {
      var _multiCheckKeyList = ["ksfz", "cmpPsnCod", "zjzzCod", "wzbz", "yjbzCod", "fdcsCod", "jwgfxCod", "zjzzFlg", "zjzzCod"]
      if ($.inArray(key, _multiCheckKeyList) > -1) {
        vm.hideMsg[key] = res[key] || ""
        vm.patientMsg[key] = res[key] ? res[key].split(",") : []
        if (key === "wzbz") {
          for (var i = 0; i < vm.getMsg[key + "List"].length; i++) {
            if ($.inArray(vm.getMsg[key + "List"][i]["infocode"], vm.patientMsg[key]) > -1) {
              vm.getMsg[key + "List"][i].checked = true
            }
          }
        } else {
          // button double check
          fillInputText(key, vm.patientMsg[key])
        }
      } else {
        if (vm.patientMsg.hasOwnProperty(key)) {
          if (key === "cstAgeCod") {
            if (res[key] == null || res[key] == "") {
              res[key] = "0"
            }
          }
          if (res[key] === null) {
            res[key] = ""
          }
          vm.patientMsg[key] = res[key];
          if (key === "zjzzQt") {
            $("#zjzzQt").val(res[key])
            vm.setOtherText('zjzzCod', 'zjzzQt')
          } else if (key === "yjbzQt") {
            $("#remarkQt").val(res[key])
            vm.setOtherText('yjbzCod', 'remarkQt')
          } else if (key === "psryqt") {
            $("#psryqtQt").val(res[key])
            vm.setOtherText('cmpPsnCod', 'psryqtQt')
          }
        }
        var _checked_key_list = ["mnsSitCod", "modLvlCod"]
        if ($.inArray(key, _checked_key_list) > -1) {
          for (var i = 0; i < vm.getMsg[key + "List"].length; i++) {
            if (res[key] == vm.getMsg[key + "List"][i]["infocode"]) {
              vm.getMsg[key + "List"][i].checked = true
            }
          }
        }
        if (vm.aboutMews.hasOwnProperty(key)) {
          if (res[key] === null) {
            res[key] = ""
          }
          vm.aboutMews[key] = res[key]
        }
        // if (vm.aboutCRAMS.hasOwnProperty(key)) {
        //   vm.aboutCRAMS[key] = res[key]
        // }
      }
    }
    vm.saveCstDspCod = res.cstDspCod;
    if (vm.patientMsg.patientTyp === '' || vm.patientMsg.patientTyp === null) {
      vm.patientMsg.patientTyp = '1'
    }
    $("#emg_emgSeq").val(res.emgSeq)
    if (res.qtsjSeq) {
      $(".spChl-btn").addClass("active")
      publicFun.httpServer(
        { url: _baseUrl + "qtsjgl/queryqtsjgl_result.do" },
        {
          startdate: "",
          enddate: "",
          "hspQtsjglCustom.qtsjSeq": res.qtsjSeq,
          page: 1,
          rows: 10,
        },
        function (res) {
          var checkItem = res.rows[0]
          $("#massTitle").html("群体事件：")
          $("#massText").html(checkItem.qtsjNam)
        }
      )
    }
    if (res.gkCod != null && res.gkCod !== "") {
      // var _gkName = '';
      // var _codList = [{name: '未查', cod: '0'}, {name: '指', cod: '1'}, {name: 'cm', cod: '2'}];
      // for (var i = 0; i < _codList.length; i++) {
      //   if (res.gkCod == _codList[i].cod) {
      //     _gkName = _codList[i].name;
      //   }
      // }
      vm.patientMsg.gkMsg = res.gk + res.gkCod // 宫口数据
    } else {
      vm.patientMsg.gkMsg = res.gk // 宫口数据
    }
    // 末次月经为空 自动读取孕周等数据
    // if (res.mcyj === '' || res.mcyj == null) {
    //   readVisitHis();
    // }
    if (res.preDgnCod) {
      // 主述看看有没有分级level
      publicFun.httpServer({ url: _baseUrl + "firstimp/queryZsk_result.do" }, { page: 1, rows: 10000 }, function (data) {
        vm.getMsg.totalCbyxList = data.rows
        for (var k = 0; k < data.rows.length; k++) {
          if (data.rows[k].cbyx == res.preDgnCod) {
            $("#checkLevel").val(data.rows[k].yjdj)
          }
        }
      })
    }
    vm.patientMsg.rtsTotSco = commonFun.countRtsCount();
    setTimeout(function () {
      if (res.senRctCod == "0" && res.senStuCod != "0") {
        vm.patientMsg.senStuCod = res.senStuCod
      }
      if (res.senStuCod == "0" && res.senRctCod != "0") {
        vm.aboutMews.senRctCod = res.senRctCod
      }
      vm.patientMsg.chkLvlCod = res.chkLvlCod
      vm.patientMsg.modLvlCod = res.modLvlCod
      vm.patientMsg.emgAreCod = res.emgAreCod
    }, 0)
  },
  dealAlreadyMsg: function (res) {
    var _res = res.hspDbzlBasCustom;
    editFun.processingData(_res)
    for(var key in vm.patientMsg){
    	if(_res.hasOwnProperty(key)){
    		vm.patientMsg[key] = _res[key]
    	}
    }
    if (res.hspsqlinfCustom) {
      var _zgCodList = ["sqlStaCod", "sqlStaStr", "sqlDepName", "sqlDepCod", "sqlDes", "bedNam"]
      for (var i = 0; i < _zgCodList.length; i++) {
        vm.patientMsg[_zgCodList[i]] = res.hspsqlinfCustom[_zgCodList[i]] || ""
      }
      vm.patientMsg.sqlDat = res.hspsqlinfCustom.queryDate || ""
    }
    if (res.hspNrsInfCustom) {
      var _nrsList = ["nrsSco", "ttpfNr", "ttpfTypeCod"]
      for (var i = 0; i < _nrsList.length; i++) {
        vm.patientMsg[_nrsList[i]] = res.hspNrsInfCustom[_nrsList[i]]
      }
    } else {
      vm.patientMsg.nrsSco = null
    }
    if (res.hspPewsckInfCustom) {
      for (var _key in res.hspPewsckInfCustom) {
        if (vm.aboutPEWS.hasOwnProperty(_key)) {
          if (res.hspPewsckInfCustom[_key] !== "" && res.hspPewsckInfCustom[_key] != null) {
            vm.aboutPEWS[_key] = res.hspPewsckInfCustom[_key]
          }
        }
      }
    }
    if (res.hspFallAssInfCustom) {
      vm.patientMsg.fallAssCod = res.hspFallAssInfCustom.fallAssCod
    }
    if (res.hspFastInfCustom) {
      var fastList = ["mtCod", "szthCod", "wlCod", "czFlag"]
      for (var i = 0; i < fastList.length; i++) {
        vm.patientMsg[fastList[i]] = res.hspFastInfCustom[fastList[i]] || ""
      }
    }
    setTimeout(function () {
      vm.patientMsg.isGetAjaxFlg = true
      patientBf = JSON.parse(JSON.stringify(vm.patientMsg))
      aboutMewsBf = JSON.parse(JSON.stringify(vm.aboutMews))
      comparePreFieldInfo = JSON.parse(JSON.stringify(dealCompareMsg(comparePreFieldInfo)))
    }, 0)
  },
}

// 判断是否是修改页面
function judgeIsEdit() {
  if (typeForm == "edit") {
    // 修改页面
    editFun.getMsgList()
  } else {
    // 登记页面
    vm.patientMsg.regTim = publicFun.timeFormat(new Date(), "yyyy/MM/dd hh:mm:ss")
    $("#emg_emgSeq").val(_emgSeq)
    enterWay()
    getAjaxInfoList()
    isShowKnowledge();
    getKnowledgeList()
    patientBf = JSON.parse(JSON.stringify(vm.patientMsg))
    aboutMewsBf = JSON.parse(JSON.stringify(vm.aboutMews))
  }
  setCurrentTime()
  getLeftData()
  //  var basicMsgTimer = setInterval(function(){
  //    getLeftData();
  //  }, 10000);
  // 所有的文本框都设置不填充
  $("input:not([autocomplete]),textarea:not([autocomplete]),select:not([autocomplete])").attr("autocomplete", "off")
  setRightPanelWth()
}

function setRightPanelWth() {
  var _wth = document.documentElement.clientWidth || document.body.clientWidth;
  var _right_panel_wth = '';
  if (_wth >= 1590) {
    $(".left-tab").css({ width: 360 + "px" })
    $(".sepcial-two-part").removeClass("twoFive-part")
    $(".max-two-part").removeClass("twoFive-part")
    if (vm.isEditPage == "1") {
      _right_panel_wth = _wth - 400
    } else {
      _right_panel_wth = _wth - 370
    }
    $(".content-form").css({ minWidth: 1092 + "px", overflowX: "auto" })
  } else {
    $(".left-tab").css({ width: 310 + "px" })
    if (vm.patientMsg.mnsSitCod == "1") {
      $(".sepcial-two-part").addClass("twoFive-part")
    }
    $(".max-two-part").addClass("twoFive-part")
    if (vm.isEditPage == "1") {
      _right_panel_wth = _wth - 350
    } else {
      _right_panel_wth = _wth - 320
    }
    if (_wth < 1050) {
      return
    }
    $(".content-form").css({ minWidth: 900 + "px", overflowX: "auto" })
  }
  $(".content-form").css({ width: _right_panel_wth + "px" })
}

$(function () {
  judgeIsEdit()
  $(window).resize(function () {
    setRightPanelWth()
  })
})
