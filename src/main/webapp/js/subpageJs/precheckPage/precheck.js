var jsbrFun = {
  /**
   * @获取所有需要提交的数据
   */
  getAllPostMsg: function () {
    var allPostMsg = {};
    commonFun.copyObj(vm.patientMsg, allPostMsg);
    commonFun.copyObj(vm.aboutMews, allPostMsg);
    commonFun.copyObj(vm.aboutGCS, allPostMsg);
    commonFun.copyObj(vm.aboutCRAMS, allPostMsg);
    commonFun.copyObj(vm.hideMsg, allPostMsg);
    return allPostMsg
  },
  /**
   * @获取年龄 && sex
   * @return  孩子'0'||成年正常男性'1'(默认||不选性别也是默认此值)||成年正常女性'2'
   */
  // getAgeSex: function() {
  //     var cstAge = vm.patientMsg.cstAge,
  //         cstAgeCod = vm.patientMsg.cstAgeCod,
  //         cstSexCod = vm.patientMsg.cstSexCod;
  //     var isChild = jsbrFun.isChild(cstAge, cstAgeCod);
  //     if (cstSexCod === '1') {
  //         if (isChild === false) {
  //             return '2'
  //         }
  //         if (isChild === true) {
  //             return '0'
  //         }
  //     } else {
  //         return '1'
  //     }
  // },
  checkNull: function (checkTypeList, postMsg) {
    var postMsgDetail,
      _returnCheck = true;
    $.each(checkTypeList, function (key, val) {
      if (key == 'nrsSco') {
        if (postMsg[key] == null) {
          postMsgDetail = '';
        } else {
          postMsgDetail = postMsg[key]
        }
      } else {
        postMsgDetail = postMsg[key].replace(/(^\s*)|(\s*$)/g, '');
      }
      if (postMsgDetail === '') {
        if (key === 'nrsSco' || key === 'mnsSitCod' || key == 'arvChlCod' || key == 'algHon') {
          if (vm.patientMsg.patientTyp === '2') {
            _returnCheck = true;
            return true
          }
        }
        if (key === 'algTypCod') {
          if (vm.patientMsg.algHon != '2') {
            _returnCheck = true;
            return true
          }
        }
        publicFun.alert(checkTypeList[key]);
        _returnCheck = false;
        return _returnCheck
      }
    });
    return _returnCheck
  }
};
var jsbrAlertMsg = {
  ksfz: {
    emgDat: '预检时间必填',
    // mpi: "病历号必填",
    // vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    // modLvlCod: '修订分级必填'
  },
  child: {
    emgDat: '预检时间必填',
    // mpi: "病历号必填",
    // vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    // modLvlCod: '修订分级必填'
  },
  adultMan: {
    emgDat: '预检时间必填',
    // mpi: "病历号必填",
    // vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    arvChlCod: '到院方式必填',
    algTypCod: '请选择相应的过敏内容',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    // modLvlCod: '修订分级必填'
  },
  adultWoman: {
    emgDat: '预检时间必填',
    // mpi: "病历号必填",
    // vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    arvChlCod: '到院方式必填',
    algTypCod: '请选择相应的过敏内容',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    // modLvlCod: '修订分级必填'
  }
};

/**
 * @endMinDate  控制预检时间能调配的最小时间，当前控制了最多往前改60分钟。即：60*60*1000 = 3600000
 * @return  {string}    endMinDate    最小时间
 * @author  ql
 */
function endMinDate() {
  return publicFun.timeFormat(new Date() - 3600000, 'yyyy/MM/dd hh:mm:ss');
}
/**
 * @endMaxDate  控制预检时间能调配的最小时间，当前时间
 * @return  {string}    endMaxDate    当前时间
 * @author  ql
 */
function endMaxDate() {
  return publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
}

function getYjwsNum() {
  var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
  var _preDay = new Date().getTime() - 24 * 60 * 60 * 1000;
  var _enddate = publicFun.timeFormat(new Date(_preDay), 'yyyy/MM/dd');
  publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/toBeImproved_result.do' }, { 'startdate': _enddate,'enddate': _today,'querytype':'improved'}, function (res) {
    $('#_yjwsNum').html("("+res.total+")")
  });
}

$(function () {
  enterWay();
  getAjaxInfoList();
  // isShowKnowledge();
  getKnowledgeList();
  getYjwsNum()
});