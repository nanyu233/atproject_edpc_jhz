/**
 * @@getVisitingMsg 获取病人基本信息
 * 社保卡、健康卡读取都是走一个口子
 */
function getVisitingMsg(type) {
  vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
  var zyh = vm.patientMsg.vstCad;
  if(type == 'A'){
    if (!zyh) {
      var _url = "http://127.0.0.1:8838/ReadQR";
      GetCard(_url)
    }else{
      GetJZCard(zyh)
    }
  }else if(type == 'C'){
    var _url = "http://localhost:8839/ReadId";
    GetIDCard(_url)
  }else{
    var _url = "http://127.0.0.1:8838/ReadCard";
    GetCard(_url)
  }
  
}

function commonGetHZXX(_cardNo,_cardType,_trackData){
  publicFun.httpServer({ url: _baseUrl + 'his/getPatientInf.do' }, { cardNo: _cardNo,cardType:_cardType,trackData:_trackData }, function (res) {
    var data = res.resultInfo.sysdata.vHemsEmpi;
    if(data == null || data == ''){
      publicFun.alert("未找到患者信息，请先到窗口建档");
    }else{
      vm.patientMsg.mpi = data.mpi;
      vm.patientMsg.cstNam = data.xm;
      if(data.xb == '男'){
        vm.patientMsg.cstSexCod = '0'
      }else if(data.xb == '女'){
        vm.patientMsg.cstSexCod = '1'
      }
      vm.patientMsg.idNbr = data.sfzh;
      vm.patientMsg.pheNbr = data.lxdh;
      vm.patientMsg.bthDat = publicFun.timeFormat(data.csny, "yyyy/MM/dd")
    }
    
  })
}
function GetJZCard(zyh){
  var trackData = zyh;
  var arr = new Array();
  var arr = trackData.split('=');
  vm.patientMsg.vstCad = arr[0];
  vm.patientMsg.cdxx = trackData;
  vm.patientMsg.khlx = '1';
  commonGetHZXX(arr[0],'1',trackData)
}

//无输入 扫码  --- 8839/ReadQR 
//有输入 就诊  --- 直接取  =号
//医保卡  8838/ReadCard

//最后一步 getPatientInf.do   cardNo 卡号 cardType 卡类型 trackData 磁道
function GetCard(_url){
  $.ajax({
    url: _url,
    type: "get",
    dataType: "jsonp",
    jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
    jsonpCallback:"jsonp9578",
    contentType:'application/json; charset=utf-8',
    success: function (res) {
      if(res[0].ret == '-1'){
        publicFun.alert("读卡错误");
        return
      }
      var arr = new Array();
      var retmsg = res[0].retmsg;
      arr = retmsg.split('|');
      var cardNo = arr[2],
          trackData = arr[2]+'|'+arr[3];
      var cardType = 11;
      var ls_tcbm = arr[0].substring(0, 6);
      if (ls_tcbm == "339900") {//浙江省本级
        cardType = 12;
      }
      var _NameData = arr[4];
      if(arr[4]){
          vm.patientMsg.cstNam = decodeURI(_NameData);
      }
      vm.patientMsg.cdxx = trackData;
      vm.patientMsg.vstCad = cardNo;
      vm.patientMsg.khlx = cardType;
      commonGetHZXX(cardNo,cardType,trackData)

    },
    error: function (error) {
      publicFun.alert("读卡错误");
    }
  })
}

function GetIDCard(_url){
  $.ajax({
    url: _url,
    type: "get",
    dataType: "jsonp",
    jsonp: "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
    jsonpCallback:"jsonp9578",
    contentType:'application/json; charset=utf-8',
    success: function (res) {
	 if(res[0].ret == '-1'){
        publicFun.alert("读卡错误");
        return
      }
      var cardNo = res[0].idcode;
      var cardType = 4;
      vm.patientMsg.cdxx = cardNo+'|'+res[0].birthday;
      vm.patientMsg.cstNam = decodeURI(res[0].name);
      vm.patientMsg.vstCad = cardNo;
      vm.patientMsg.khlx = cardType;
      commonGetHZXX(cardNo,cardType,vm.patientMsg.cdxx)
    },
    error: function (error) {
      publicFun.alert("读卡错误");
    }
  })
}


//卡类型  省医保 12  市医保 11  就诊卡 1