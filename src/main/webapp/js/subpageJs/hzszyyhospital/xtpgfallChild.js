function localassignmentC () {
  var infoList = ['riskAgeyCod', 'riskSexCod', 'riskDiagnoseCod', 'riskYcognizeCod', 'riskHjysCod', 'riskZjmzhCod', 'riskDruguseCod'];
  var objA = vm.aboutFallDangerC;
  for (var i in infoList) {
    var key = infoList[i];
    if (objA[key] != '') {
      $.each(vm.systemListC[key + 'List'], function (idx, val) {
        if (val['infocode'] == objA[key]) {
          val['checked'] = true
        }
      })
    }
  }
}

function getMsgListC (data) {
  var msgList = data;
  if (msgList != '' && msgList != null) {
    $.each(msgList, function (key, val) {
      if (vm.aboutFallDangerC.hasOwnProperty(key) && val != null) {
        vm.aboutFallDangerC[key] = val;
      } else if (key == 'riskCognizeCod' && val != null) {
        vm.aboutFallDangerC['riskYcognizeCod'] = val;
      } else if (key == 'riskAgeCod' && val != null) {
        vm.aboutFallDangerC['riskAgeyCod'] = val;
      }
    })
  }
  localassignmentC();
}