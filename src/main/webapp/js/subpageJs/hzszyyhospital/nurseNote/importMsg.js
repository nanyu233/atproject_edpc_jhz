/**
 * 病情护理记录单导入
 * @date    2019/03/8
 * @author  yhl
 */
var _pageName = '';
function impxtpg() {
  var xtpghz = document.getElementById("xtpghznr").value;
  if (xtpghz != "") {
    _confirm('当前病情观察、护理措施和效果有数据，确认覆盖并导入"系统评估"内容吗？', null, function () {
      document.getElementById("xtpghznr").value = _xtpg;
    });
  } else {
    document.getElementById("xtpghznr").value = _xtpg;
  }
}

/**
 * [点击选择显示模板]
 */
function showTem() {
  var _codList = [
    { funcNam: 'hlpgTemplate', modelNam: '入院护理评估表' },
    { funcNam: 'csryTemplate', modelNam: '创伤入院评估表' },
    { funcNam: 'inspectionTemplate', modelNam: '检验信息' },
    { funcNam: 'checkTemplate', modelNam: '检查报告' },
    { funcNam: 'czdrTemplate', modelNam: '处置' },
    { funcNam: 'drugAdviceTemplate', modelNam: '药疗医嘱' },
    { funcNam: 'transfusionRecord', modelNam: '输血记录' },
    { funcNam: 'tsfhTemplate', modelNam: '特殊符号' },
    { funcNam: 'hzyjTemplate', modelNam: '会诊意见' },
    { funcNam: 'xtpgTemplate', modelNam: '系统评估' }
  ]
  setValue(_codList);
}

function setValue(res) {
  $('.importlab').html("");
  var innerHtml = '';
  $.each(res, function (index, val) {
    innerHtml += '<a class=\"commonbtn\" href=\"javascript:;\" onclick=\"' + val.funcNam + '()\" >' + val.modelNam + '</a>';
  });
  $('.importlab').html(innerHtml);
  var flag = $('.tempBtn').css("display");
  if (flag == "none") {
    $('.tempBtn').css("display", "block");
  } else {
    $('.tempBtn').css("display", "none");
  }
  sub.getImportFieldMsg()
}
/**
 * [关闭模板按钮]
 */
function closeTemp() {
  $('.tempBtn').css("display", "none");
}

var hplgFlag = false;
/**
 * [导入系统评估]
 */
function xtpgTemplate() {
  if (_xtpg != '') {
    document.getElementById("xtpghznr").value += _xtpg;
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"系统评估"');
  }
}

/**
 * [导入入院护理评估表]
 */
function hlpgTemplate() {
  if (_symSitDes != '') {
    document.getElementById("xtpghznr").value += _symSitDes;
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"入院护理评估表"');
  }
}

/**
* [导入处置导入]
*/
function czdrTemplate() {
  var _mdelSeq = $('.inputSeq2').val();
  var openModalWindowName = '处置导入',
    openModalWindowUrl = _baseUrl + 'zyymodel/querymodel.do?modelSeq=' + _mdelSeq;
  createmodalwindow(openModalWindowName, 1000, 570, openModalWindowUrl);
}
/**
 * [导入检验信息]
 */
function inspectionTemplate() {
  var openModalWindowName = '检验信息',
    openModalWindowUrl = _baseUrl + 'zyyqjs/toexamineinfo.do?emgSeq=' + _emgSeq;
  createmodalwindow(openModalWindowName, 1000, 570, openModalWindowUrl);
}

/**
 * [导入检查信息]
 */
function checkTemplate() {
  var openModalWindowName = '检查信息',
    openModalWindowUrl = _baseUrl + 'zyyqjs/querycheckinfo.do?emgSeq=' + _emgSeq;
  createmodalwindow(openModalWindowName, 1000, 570, openModalWindowUrl);
}
/**
 * [导入检查信息]
 */
function tsfhTemplate() {
  var openModalWindowName = '特殊符号',
    openModalWindowUrl = _baseUrl + 'zyyqjs/tsfhinfo.do?th=' + new Date().getTime();
  createmodalwindow(openModalWindowName, 800, 570, openModalWindowUrl);
}

//采集体征
function getVitalSign(){
  var openModalWindowName = '采集体征',
  openModalWindowUrl = _baseUrl + 'zjszyyhljld/toVitalSigns.do?th=' + new Date().getTime();
  createmodalwindow(openModalWindowName, 500, 375, openModalWindowUrl);
}

//创伤入院
function csryTemplate(){
  if (_hzDes != '') {
    document.getElementById("xtpghznr").value += _hzDes;
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"创伤入院评估表"');
  }
}

//会诊意见
function hzyjTemplate(){
  var openModalWindowName = '会诊意见',
  openModalWindowUrl = _baseUrl + 'zjszyyhljld/toPatientConsultationPage.do?th=' + new Date().getTime();
  createmodalwindow(openModalWindowName, 1000, 570, openModalWindowUrl);
}

// 药疗医嘱
function drugAdviceTemplate () {
  var openModalWindowName = '药疗医嘱',
    openModalWindowUrl = _baseUrl + 'zjszyyhljld/to_cfxxInfo.do?emgSeq=' + _emgSeq;
  createmodalwindow(openModalWindowName, 1000, 570, openModalWindowUrl);
}
//输血记录
function transfusionRecord(){
  var openModalWindowName = '输血记录',
  openModalWindowUrl = _baseUrl + 'zjszyyhljld/toPdatransfusionrecordPage.do?emgSeq=' + _emgSeq;
  createmodalwindow(openModalWindowName, 1000, 570, openModalWindowUrl);
}

//导出到体温单
function exportTemp() {
  var crtDat = $("input[name='hsphljldinfCustom.crtDat']").val();
  var tmpNbr = $("input[name='hsphljldinfCustom.tmpNbr']").val();
  var hrtRte = $("input[name='hsphljldinfCustom.hrtRte']").val();
  var breNbr = $("input[name='hsphljldinfCustom.breNbr']").val();
  var sbpUpNbr = $("input[name='hsphljldinfCustom.sbpUpNbr']").val();
  var sbpDownNbr = $("input[name='hsphljldinfCustom.sbpDownNbr']").val();
  var tmpNbrFlg = $("#tempretureSel option:selected").text();
  var xtCod = $("#xtCod option:selected").val();
  var xtFlg = $("#xtSel option:selected").val();
  var _xtFlg = (xtFlg == 1)?'':xtFlg;
  var xt = $("input[name='hsphljldinfCustom.xt']").val();
  var pulse = $("input[name='hsphljldinfCustom.pulse']").val();
  var xy = $("input[name='hsphljldinfCustom.xy']").val();
  var mb = $("input[name='hsphljldinfCustom.pulse']").val(); 
  var nrsSco =sub.aboutSco.nrsSco;
  if (crtDat == null || crtDat == '') {
    alert_warn('时间不能为空');
    return false;
  } else if (tmpNbr == '' && hrtRte == '' && breNbr == '' && sbpUpNbr == '' && sbpDownNbr == '' && pulse == '' && xt == ''&& _xtFlg == '') {
    alert_warn('生命体征不能为空');
    return false;
  } else if ((sbpUpNbr == '' && sbpDownNbr != '') || (sbpUpNbr != '' && sbpDownNbr == '')) {
    alert_warn('血压填写错误,导入失败');
    return false;
  } else {
    var currentTime = publicFun.timeFormat(crtDat, 'yyyy/MM/dd hh:mm:ss');
    var _clockTimeStr = currentTime.substring(11, 13);
    var _clockTimeStr1 = currentTime.substring(0, 10);
    var _clockTimeNum = _clockTimeStr - 0;
    if ((_clockTimeNum > 0 && _clockTimeNum < 2) ||(_clockTimeNum > 2 && _clockTimeNum < 4) ) {
      _clockTimeNum = '02';
    } else if ((_clockTimeNum > 4 && _clockTimeNum < 6) ||(_clockTimeNum > 6 && _clockTimeNum < 8) ) {
      _clockTimeNum = '06';
    } else if ((_clockTimeNum > 8 && _clockTimeNum < 10) ||(_clockTimeNum > 10 && _clockTimeNum < 12) ) {
      _clockTimeNum = '10';
    } else if ((_clockTimeNum > 12 && _clockTimeNum < 14) ||(_clockTimeNum > 14 && _clockTimeNum < 16)) {
      _clockTimeNum = '14';
    } else if ((_clockTimeNum > 16 && _clockTimeNum < 18) ||(_clockTimeNum > 18 && _clockTimeNum < 20)) {
      _clockTimeNum = '18';
    } else if ((_clockTimeNum > 20 && _clockTimeNum < 22) ||(_clockTimeNum > 22 && _clockTimeNum < 24)) {
      _clockTimeNum = '22';
    } else {
      _clockTimeNum = _clockTimeStr;
    }
    var _clockTimeNum = _clockTimeStr1 + ' ' + _clockTimeNum + ':00:00';
    var dataParm = {
      "hspTpctInfCustom.emgSeq": _emgSeq,
      "ctrDate": crtDat,
      "ctrDateString": _clockTimeNum,
      "hspTpctInfCustom.tpctTw": tmpNbr,
      "hspTpctInfCustom.tpctXl": hrtRte,
      "hspTpctInfCustom.tpctHx": breNbr,
      "hspTpctInfCustom.tpctXyUp": sbpUpNbr,
      "hspTpctInfCustom.tpctXyDown": sbpDownNbr,
      "hspTpctInfCustom.tpctTwCod": tmpNbrFlg,
      "hspTpctInfCustom.tpctXt": xt,
      "hspTpctInfCustom.tpctXtCod": xtCod,
      "hspTpctInfCustom.tpctXtFlg": _xtFlg,
      "hspTpctInfCustom.tpctTtpf": nrsSco,
      "hspTpctInfCustom.tpctGmyw": xy,
      "hspTpctInfCustom.tpctMb": mb
    	  
    }
    if(pulse == '') {
      _confirm('脉搏为空，请确认是否导入心率', null, function () {
        publicFun.httpServer({url: _baseUrl + 'zyytpct/exporttcpt.do?'}, dataParm, function (res) {
          var hspTpctInfCustom = res.resultInfo.sysdata.hspTpctInfCustom;
          if (res.resultInfo && res.resultInfo.messageCode == '906') {
            alert_success("导入护理记录单成功,以更新覆盖！时间为:" + publicFun.timeFormat(hspTpctInfCustom.enteringDat, 'MM/dd hh:mm:ss'))
          }
        }, function () {
          alert_error('导入失败！')
        })
      });
    }else{
      publicFun.httpServer({url: _baseUrl + 'zyytpct/exporttcpt.do?'}, dataParm, function (res) {
        var hspTpctInfCustom = res.resultInfo.sysdata.hspTpctInfCustom;
        if (res.resultInfo && res.resultInfo.messageCode == '906') {
          alert_success("导入护理记录单成功,以更新覆盖！时间为:" + publicFun.timeFormat(hspTpctInfCustom.enteringDat, 'MM/dd hh:mm:ss'))
        }
      }, function () {
        alert_error('导入失败！')
      })
    }
    
  }
}