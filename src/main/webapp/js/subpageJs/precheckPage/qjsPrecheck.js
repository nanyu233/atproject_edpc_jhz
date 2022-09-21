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
  //     var isChild = commonFun.isChild(cstAge, cstAgeCod);
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
        if (key === 'nrsSco' || key === 'mnsSitCod' || key === 'arvChlCod') {
          if (key === 'mnsSitCod') {
            if (vm.patientMsg.cstSexCod != '1' || vm.patientMsg.patientTyp == '2') {
              _returnCheck = true;
              return true
            }
          }
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
        if (key === 'frDat') {
          if (vm.aboutMews.tmpNbr < 38.5 || vm.aboutMews.tmpNbr == null) {
            _returnCheck = true;
            return true
          }
        }
        publicFun.alert(checkTypeList[key]);
        _returnCheck = false;
        return false
      }
    });
    return _returnCheck
  }
};
var jsbrAlertMsg = {
  child: {
    emgDat: '预检时间必填',
    vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    cmpPsnCod: '陪送人员必填',
    frDat: '发热日期必填',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    modLvlCod: '修订分级必填'
  },
  adultMan: {
    emgDat: '预检时间必填',
    vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    arvChlCod: '到院方式必填',
    cmpPsnCod: '陪送人员必填',
    algHon: '是否过敏必填',
    algTypCod: '请选择相应的过敏内容',
    frDat: '发热日期必填',
    nrsSco: '疼痛情况必填',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    modLvlCod: '修订分级必填'
  },
  adultWoman: {
    emgDat: '预检时间必填',
    vstCad: '就诊卡号必填',
    cstNam: '姓名必填',
    arvChlCod: '到院方式必填',
    cmpPsnCod: '陪送人员必填',
    algHon: '是否过敏必填',
    algTypCod: '请选择相应的过敏内容',
    mnsSitCod: '女性月经史必填',
    frDat: '发热日期必填',
    nrsSco: '疼痛情况必填',
    preDgnCod: '主诉症状必填',
    cstDspCod: '病人去向必填',
    emgFkCod: '就诊科室必填',
    modLvlCod: '修订分级必填'
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

//二次预检取值
function getEcyj(){
  var getMsgUrl = _baseUrl + 'hzszyyemg/findecyjAjax.do';
  publicFun.httpServer({url: getMsgUrl}, { emgSeq: _oldEmgSeq }, function(data) {
      var res = data.resultInfo.sysdata.hspemginfCustom;
      var ecyjList = ['vstCad','cstNam','cstAge','pheNbr','cstAdr','idNbr','algHon'],
          _valList = ['cstAgeCod','cstSexCod'],
          checkList = ['cmpPsnCod','algTypCod','pastHisCod'];
      $.each(ecyjList,function(index,val){
          if(res[val] != null){
              vm.patientMsg[val] = res[val]
          }
      })
      $.each(_valList,function(index,val){
          if(res[val] != null){
              $.each(vm.getMsg[val+'List'],function(_idx,_val){
                if(res[val] == _val.info){
                  vm.patientMsg[val] = _val.infocode
                }
              })
          }
      })
      for (var key in res) {
        if (key === 'arvChlCod') {
          for (var i = 0; i < vm.getMsg[key + 'List'].length; i++) {
            if (res[key] == vm.getMsg[key + 'List'][i]['infocode']) {
              vm.getMsg[key + 'List'][i].checked = true
            }
          }
        }
      }
      $.each(checkList,function(index, val){
          if (res[val] != null) {
            vm.hideMsg[val] = res[val] || '';
            vm.patientMsg[val] = res[val] ? res[val].split(",") : [];
            for (var i = 0; i < vm.getMsg[val + 'List'].length; i++) {
              if ($.inArray(vm.getMsg[val + 'List'][i]['infocode'], vm.patientMsg[val]) > -1) {
                vm.getMsg[val + 'List'][i].checked = true
              }
            }
          }
      })
      vm.patientMsg.bthDat = publicFun.timeFormat(res.bthDat, "yyyy/MM/dd");
      vm.patientMsg.emgDat = publicFun.timeFormat(new Date, "yyyy/MM/dd hh:mm:ss");
  }, function(err) {}, 10000);
}

$(function () {
  if(_ecyjFlag == '1'){
    getEcyj();
  }
  enterWay();
  getAjaxInfoList();
  // isShowKnowledge();
  getKnowledgeList();
});
