var vm = avalon.define({
  $id: 'PatientBleed',
  systemList: {
    highrisk1CodList: [], 
    highrisk2CodList: [], 
  },
  riskVal:{
    highrisk1:'',
    highrisk2:''
  },
  Objradioclick:function(name,idx){
    var list = [];
    list = vm.systemList[name + 'CodList'];
    if (list[idx]['checked'] == true) {
      list[idx]['checked'] = false;
      vm.riskVal[name]='';
      $.each(list, function (index, value) {
        if(value['checked'] == true){
          vm.riskVal[name]+=value['infocode']+",";
        }
      });
    }else{
      list[idx]['checked'] = true;
      vm.riskVal[name]+=list[idx]['infocode']+",";
    }
  }
})