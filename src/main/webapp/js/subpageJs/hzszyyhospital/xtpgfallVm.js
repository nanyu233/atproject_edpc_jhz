
  /**
   *@ 监听坠倒危险评分 ------- level
   */
  vm.aboutFallDanger.$watch('riskSco', function(newVal, oldVal) {
      if (newVal >= 0 && newVal <= 5) {
          $('.scoreLevel').html('(低危跌倒风险)')
      } else if (newVal >= 6 && newVal <= 13) {
          $('.scoreLevel').html('(中危跌倒风险)')
      } else if (newVal > 13) {
          $('.scoreLevel').html('(高危跌倒风险)')
      } else{
          $('.scoreLevel').html('')
      }
  });

  // ajax 拿数据
  function getMsgList2(data){
        var msgList = data;
        if(msgList != '' && msgList != null){
            $.each(msgList, function(key, val) {
                if (vm.fallhideMsg.hasOwnProperty(key) && val != null) {
                    vm.fallhideMsg[key] = val;
                    var ee = val.split(',');
                    vm.aboutFallDanger[key] = ee;
                }else if(vm.aboutFallDanger.hasOwnProperty(key) && val != null){
                    vm.aboutFallDanger[key] = val;
                    vm.aboutFallDanger[key+'num'] = val;
                }else if(key == 'riskCognizeCod' && val != null){
                    vm.fallhideMsg['riskOcognizeCod'] = val;
                    var ee = val.split(',');
                    vm.aboutFallDanger['riskOcognizeCod'] = ee;
                }else if(key == 'riskAgeCod' && val != null){
                    vm.aboutFallDanger['riskAgeoCod'] = val;
                    vm.aboutFallDanger['riskAgeoCodnum'] = val;
                }
                if(key == 'riskExcreteCod' && val == '1'){
                    vm.aboutFallDanger[key+'num'] = '2';
                }
            });
            localassignment();
        }
  }
  
  function localassignment(){
    var infoList = ['riskAgeoCod','riskDrugCod','riskMacCod','riskOcognizeCod','riskHisCod','riskOtherCod'];
    var infoidList = ['riskClassCod','riskActionCod','riskExcreteCod'];
    var objA = vm.aboutFallDanger;
    
    for(var i in infoList){
        var key = infoList[i];
        if(objA[key] != ''){
            if(key == 'riskOcognizeCod'){
                infoMsg(objA[key],'infocode',key)
            }else{
                $.each(vm.fallSystemList[key + 'List'], function(idx, val) {
                    if (val['infocode'] == objA[key]) {
                        val['checked'] = true
                    }
                })
            }
        }
    }

    for(var i in infoidList){
        var key = infoidList[i];
        if(objA[key] != ''){
            if(key == 'riskClassCod' || key == 'riskActionCod'){
                infoMsg(objA[key],'infoid',key)
            }else{
                $.each(vm.fallSystemList[key + 'List'], function(idx, val) {
                    if (val['infoid'] == objA[key]) {
                        val['checked'] = true
                    }
                })
            }
        }
    }
  }

  function infoMsg(_Obj,_bsf,key){
    var l = _Obj.length;
    for(var n = 0; n<l;n++){
        $.each(vm.fallSystemList[key + 'List'], function(idx, val) {
            if (val[_bsf] == _Obj[n]) {
                val['checked'] = true
            }
        })
    }  
  }
