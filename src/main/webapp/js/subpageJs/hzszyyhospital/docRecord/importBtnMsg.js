
function initBtnHtml () {
  var _codList = [{ funcNam: 'zsTemplate', modelNam: '主诉' }, { funcNam: 'xbsTemplate', modelNam: '现病史' },
  { funcNam: 'fzjcTemplate', modelNam: '辅助检查' }, { funcNam: 'tgjcTemplate', modelNam: '体格检查' },
  { funcNam: 'jyxxTemplate', modelNam: '检验信息' }, { funcNam: 'jcxxTemplate', modelNam: '检查信息' },
  { funcNam: 'lqxxTemplate', modelNam: '留抢信息' }];
  if (_btnType == 'queryFirstDisease' || _btnType == 'updateDaily') { // 病程
    _codList.push({
      funcNam: 'drugAdviceTemplate', modelNam: '药疗医嘱'
    })
  }
  setValue(_codList);
}

function setValue(res) {
  $('#temdiv').css("display", "none");
  $('#temdiv').html('');
  var innerHtml = '';
  $.each(res, function (index, val) {
    innerHtml += '<input type=\"button\" class=\"commonbtn m-l10\" value=\"'+ val.modelNam +'\" onclick=\"' + val.funcNam + '()\" >';
  });
  innerHtml += '<img class=\"closeImg\" src=\"../images/hzszyyhems/note/1.png\" alt=\"删除\" onclick=\"closeTemp()\" />';
  $('#temdiv').html(innerHtml);
}

function showTem(idx) {
  if (idx){
    $('#'+idx).css("display", "block");
  } else{
    $('#temdiv').css("display", "block");
  }
}
function closeTemp(idx) {
  if (idx) {
    $('#'+idx).css("display", "none");
  } else{
    $('#temdiv').css("display", "none");
  }
}

function tgjcTemplate() {
  var tgjcvalue = $("#tgjcvalue").html();
  if (tgjcvalue != '') {
    document.getElementById("xtpghznr").value += tgjcvalue;
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"体格检查"');
  }
}

function zsTemplate() {
  var zsvalue = $("#zsvalue").html();
  if (zsvalue != '') {
    document.getElementById("xtpghznr").value += zsvalue + '；';
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"主诉"');
  }
}

function xbsTemplate() {
  var xbsvalue = $("#xbsvalue").html();
  if (xbsvalue != '') {
    document.getElementById("xtpghznr").value += xbsvalue + '；';
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"现病史"');
  }
}

function fzjcTemplate() {
  var xbs2value = $("#xbs2value").html();
  if (xbs2value != '') {
    document.getElementById("xtpghznr").value += xbs2value + '；';
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"辅助检查"');
  }
}

function jyxxTemplate(valName, obj) {
  var openModalWindowName = '检验信息', openModalWindowUrl = '';
  if(_btnType && (valName == 'zlyj')){
    openModalWindowUrl = BaseUrl + 'zyyqjs/mzToexamineinfo.do?emgSeq=' + _emgSeq + '&valName=' + valName;
  }else if (valName) {
    if (obj && obj.source == 'HIS_NO_PATIENT') {
      openModalWindowUrl = BaseUrl + 'hisMedical/toexamineinfo_HIS.do?emgSeq=' + _emgSeq + '&valName=' + valName + '&mpi=' + obj.mpi + '&requestSource=' + obj.source;
    } else {
      openModalWindowUrl = BaseUrl + 'zyyqjs/toexamineinfo.do?emgSeq=' + _emgSeq + '&valName=' + valName;
    }
  } else{
    openModalWindowUrl = BaseUrl + 'zyyqjs/toexamineinfo.do?emgSeq=' + _emgSeq;
  }
  createmodalwindow(openModalWindowName, getCurrentBoxWidth(), getCurrentBoxHeight(), openModalWindowUrl);
}
function getCurrentBoxHeight() {
  var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
  var _tabHeight = _bdHeight - 10;
  if (_bdHeight > 570) {
    _tabHeight = 570;
  }
  return _tabHeight;
}

function getCurrentBoxWidth() {
  var _bdWth = document.documentElement.clientWidth || document.body.clientWidth;
  var _tabWth = _bdWth - 10;
  if (_bdWth > 1000) {
    _tabWth = 1000;
  }
  return _tabWth;
}
function jcxxTemplate(valName, obj) {
  var openModalWindowName = '检查信息', openModalWindowUrl = '';
  if(_btnType && (valName == 'zlyj')){
    openModalWindowUrl = BaseUrl + 'zyyqjs/mzQuerycheckinfo.do?emgSeq=' + _emgSeq + '&valName=' + valName;
  } else if (valName) {
    if (obj && obj.source == 'HIS_NO_PATIENT') {
      openModalWindowUrl = BaseUrl + 'hisMedical/querycheckinfo_HIS.do?emgSeq=' + _emgSeq + '&valName=' + valName + '&mpi=' + obj.mpi + '&requestSource=' + obj.source;
    } else {
      openModalWindowUrl = BaseUrl + 'zyyqjs/querycheckinfo.do?emgSeq=' + _emgSeq + '&valName=' + valName;
    }
  } else {
    openModalWindowUrl = BaseUrl + 'zyyqjs/querycheckinfo.do?emgSeq=' + _emgSeq;
  }
  createmodalwindow(openModalWindowName, getCurrentBoxWidth(), getCurrentBoxHeight(), openModalWindowUrl);
}

function lqxxTemplate() {
  var lqxxvalue = $("#lqxxvalue").html();
  if (lqxxvalue != '') {
    document.getElementById("xtpghznr").value += lqxxvalue + '；';
  } else {
    publicFun.alert('当前无导入数据，请确认是否已完成"留抢信息"');
  }
}

// 药疗医嘱
function drugAdviceTemplate (valName) {
  var _valName = valName || '';
  var openModalWindowName = '药疗医嘱',
    openModalWindowUrl = BaseUrl + 'zjszyyhljld/to_cfxxInfo.do?emgSeq=' + _emgSeq + '&valName=' + _valName;
  createmodalwindow(openModalWindowName, getCurrentBoxWidth(), getCurrentBoxHeight(), openModalWindowUrl);
}

function initDocImportHtml (tempIdName, idName, listRepeat) {
  var _listRes = [{ funcNam: 'jyxxTemplate', modelNam: '检验信息' }, { funcNam: 'jcxxTemplate', modelNam: '检查信息' }, { funcNam: 'drugAdviceTemplate', modelNam: '药疗医嘱' }];
  if (listRepeat) {
    _listRes = listRepeat;
  }
  $('#' + tempIdName).css("display", "none");
  $('#' + tempIdName).html('');
  var innerHtml = '';
  $.each(_listRes, function (index, val) {
    innerHtml += '<input type=\"button\" class=\"commonbtn m-l10\" value=\"'+ val.modelNam +'\" onclick=\"' + val.funcNam + '(\'' + idName + '\')\" >';
  });
  innerHtml += '<img class=\"closeImg\" src=\"../images/hzszyyhems/note/1.png\" alt=\"删除\" onclick=\"closeTemp(\'' + tempIdName + '\')\" />';
  $('#' + tempIdName).html(innerHtml);
}

var _btnType;
$(function () {
  if (!_btnType) {
    initBtnHtml();
  }
})