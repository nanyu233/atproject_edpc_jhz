var vm = avalon.define({
  $id: 'VteRisk',
  systemList: {
    fxyzCodList: []
  },
  riskVal:{
    totalSco:0,
    fxyzCod:''
  },
  Objradioclick:function(name,idx){
    var list = [];
    list = vm.systemList[name + 'List'];
    if (list[idx]['checked'] == true) {
      list[idx]['checked'] = false;
      vm.riskVal[name]='';
      $.each(list, function (index, value) {
        if(value['checked'] == true){
          vm.riskVal[name]+=value['infocode']+",";
        }
      });
      vm.riskVal.totalSco = parseInt(vm.riskVal.totalSco)-parseInt(list[idx]['remark']);
    }else{
      list[idx]['checked'] = true;
      vm.riskVal[name]+=list[idx]['infocode']+",";
      vm.riskVal.totalSco = parseInt(list[idx]['remark'])+parseInt(vm.riskVal.totalSco);
    }
  }
})