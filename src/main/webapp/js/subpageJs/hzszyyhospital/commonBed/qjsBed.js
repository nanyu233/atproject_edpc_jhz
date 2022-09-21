var cmdprint = '时间轴';
// 留抢患者管理和留抢病历中公用js 抽离
var initBtnUrl = baseurl + 'btnload.do?moduleid=${moduleid}', // url定义，请求按钮的地址
  sickbedUrl = baseurl + 'zyyqjs/bedInfo.do', // url定义，请求床位信息的地址
  patientListUrl = baseurl + 'zyyqjs/queryqjszyy_result.do', // url定义，请求病人列表的地址
  deleteRecordUrl = baseurl + 'hzszyyemg/delzyyemgSubmit.do'; // url定义，删除指定记录的地址
var checkedObj = {}, showCheckedobj = {};
var allSickbedList; // 定义额外的变量方便使用
var variableList = ['labelPrintFlg','emgSeq', 'zgcount', 'cstNam', 'sqlStaCod', 'cstAge', 'cstSexCod', 'cstAgeCod', 'emgDat', 'bedid', 'bedNum', 'emgFkCod', 'pheNbr', 'preDgnCod', 'preUsrNam', 'bedPlcNam', 'mpi', 'observationCode', 'mzksDes', 'glcs', 'jzxh', 'cstDspCodNew', 'jbzdDes', 'grnChl', 'checkNurStatus']; // 定义需要的参数名字
/**
 * [setLayout 初始化布局]
 */
function setLayout() {
  var windowWidth = $(window).width(),
    windowHeight = $(window).height(),
    _mainHeight = windowHeight - 45;
  $('#tabsContainer').width(windowWidth - 250);
  $('#tabsContainer').height(_mainHeight);
  $('#tabs').height(windowHeight - 65);
  if (applySrc && applySrc == '1') {
    $('#patientList').height(.65 * _mainHeight);
    $('#consultation').height(.35 * _mainHeight - 8);
  } else {
    $('#patientList').height(_mainHeight);
  }
  if (_islgbed == '1') {
    $('#sickbedContainer').height(_mainHeight);
    var halfSickHeight = (_mainHeight) / 2 - 13;
    $('#topList').height(halfSickHeight);
    $('#bottomList').height(halfSickHeight);
  }
}

$(document).keydown(function (event) {
  if (event.keyCode == 13) {
    getPatientList();
  }
})

/**
 * [isOwnEmpty 判断是否是一个空的对象]
 * @param  {[type]}  obj [description]
 */
function isOwnEmpty(obj) {
  if (!obj.cstNam) {
    return true;
  } else {
    return false;
  }
};

/**
 * [initTime 初始化时间]
 */
function initTime() {
  var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
  $('#emg_enddate').val(_today);
  var myDate = new Date();
  var yyear = myDate.getFullYear();
  var mmonth = myDate.getMonth();
  var dday = myDate.getDate();
  var fivDat = new Date(yyear, mmonth, dday).getTime() - 5 * 60 * 60 * 1000;
  var yesterday = publicFun.timeFormat(new Date(fivDat), "yyyy/MM/dd");
  $('#emg_startdate').val(yesterday);
}

/**
 * [isNull 判断一个值是不是null]
 */
function isNull(val) {
  var returnIsNull = false;
  if (!val && typeof val != 'undefined' && val != 0) {
    returnIsNull = true
  }
  return returnIsNull
}
/**
 * [detailNull 处理掉array里面所有的null]
 * @param  {Array} arr [需要处理的数组]
 */
function detailNull(arr) {
  $.each(arr, function (index, val) {
    for (var key in val) {
      if (isNull(val[key])) {
        val[key] = ''
      }
    }
  });
}


/**
 * [chooseBed 选择病床]
 */
function chooseBed(indx, current) {
  $('.bed-box').removeClass('active');
  $(current).addClass("active");
  $.each(variableList, function (index, val) {
    if (allSickbedList[indx].hasOwnProperty(val)) {
      checkedObj[val] = allSickbedList[indx][val]
    } else {
      checkedObj[val] = ''
    }
  });
}

/**
 * [getMousePos 获取鼠标当前位置]
 */
function getMousePos(event) {
  var e = event || window.event;
  var scrollX = document.documentElement.scrollLeft || document.body.scrollLeft;
  var scrollY = document.documentElement.scrollTop || document.body.scrollTop;
  var x = e.pageX || e.clientX + scrollX;
  var y = e.pageY || e.clientY + scrollY;
  return { 'x': x, 'y': y };
}

/**
 * [initTips 初始化tips]
 * @param  {[type]} showCheckedobj [description]
 */
function initTips(checkedObj) {
  var codList = ['bedPlcNam', 'mpi', 'cstNam', 'cstSexCod', 'pheNbr', 'preDgnCod', 'emgFkCod', 'preUsrNam', 'observationCode', 'glcs', 'jbzdDes', 'grnChl','jzxh'];
  codList.map(function (ele, index) {
    $('#' + ele).text(checkedObj[ele] || '');
  })
  if (checkedObj['cstAge']) {
    $('#cstAge').text(checkedObj['cstAge'] + checkedObj['cstAgeCod']);
  } else {
    $('#cstAge').text('');
  }
  if (checkedObj['emgDat']) {
    var emgDat = publicFun.timeFormat(checkedObj['emgDat'], 'yyyy-MM-dd hh:mm');
    $('#emgDat').text(emgDat);
  } else {
    $('#emgDat').text('');
  }
}

/**
 * [showTips 显示tips]
 * @param  {[type]} indx [description]
 * @param  {[type]} e    [description]
 */
function showTips(indx, e) {
  showCheckedobj = {};
  $.each(variableList, function (index, val) {
    if (allSickbedList[indx].hasOwnProperty(val)) {
      showCheckedobj[val] = allSickbedList[indx][val]
    } else {
      showCheckedobj[val] = ''
    }
  });
  initTips(showCheckedobj);
  var mousePosition = getMousePos(e);
  var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
  var _maxTopGap = _bdHeight - $('#tips').height() - 10, topGap = mousePosition['y'] + 5;
  if (mousePosition['y'] > _maxTopGap) {
    mousePosition['y'] = _maxTopGap
  }
  $('#tips').css({
    left: mousePosition['x'],
    top: mousePosition['y']
  }).show();
  $('.triangleCss').css({'top': topGap + 'px'})
}

/**
 * [hideTips 隐藏tips]
 */
function hideTips() {
  $('#tips').hide()
}

/**
 * [getSickbedMsg 获取所有床位信息]
 */
function getSickbedMsg() {
  $('#listContainer').hide();
  checkedObj = {}; // 此处checkedObj需置空
  showCheckedobj = {};
  $('#sickbedContainer').show();
  var innerSickbedHtmlList = [], innerSickbedHtmlListLx = [],
    innerSickbedHtmlListLq = [];
  publicFun.httpServer({ url: sickbedUrl }, {}, function (data) {
    if (data['resultInfo']['type'] === 1) {
      var sysdata = data['resultInfo']['sysdata'],
        sickbedList = sysdata['hspBedInfCustomList'];
      // 处理掉array里面所有的null
      detailNull(sickbedList);
      allSickbedList = sickbedList;
      for (var i = 0; i < sickbedList.length; i++) {
        var _val = sickbedList[i];
        _val.emgDate = '';
        if (_val.emgDat) {
          _val.emgDate = publicFun.timeFormat(new Date(_val.emgDat), 'yyyy-MM-dd hh:mm')
        }
        _val.classStyle = '';
        _val.imgSrc = '../images/common/bigScreen/profile.png';
        if (_val.cstSexCod === '男') {
          _val.imgSrc = '../images/common/bigScreen/profile.png'
        } else if (_val.cstSexCod === '女') {
          _val.imgSrc = '../images/hzszyyhems/nurse/girl.png'
          _val.classStyle = 'imgWth'
        }
        _val.cstName = '';
        _val.ageVal = '';
        var indexBed = _val.bedPlcNam.lastIndexOf("\-");
        _val.bedName = _val.bedPlcNam.substring(indexBed + 1, _val.bedPlcNam.length);
        if (_val.cstNam) {
          if (_val.cstAge) {
            _val.ageVal = _val.cstAge + _val.cstAgeCod;
          }
        }
        var _inTime = '';
        if (_islgbed === '1') {
          if (_val.cstDspCodNew === '6') {
            if (_val.rqDate) {
              _inTime = _val.rqDate
            }
          }
          if (_val.cstDspCodNew === '11') {
            if (_val.rgDate) {
              _inTime = _val.rgDate
            }
          }
        } else {
          if (_val.rqDate) {
            _inTime = _val.rqDate
          }
        }
        _val.levelNumCod = '';
        var levelNumList = ['I级', 'II级', 'III级', 'IVa级', 'IVb级'];
        if (_val.emgDepCod !== '' && _val.emgDepCod != null) {
          _val.levelNumCod = levelNumList[_val.emgDepCod];
        }
        _val.grnChlText = _val.grnChl == '1' ? '绿色通道' : ''
        // 这一块逻辑想复杂了 => 直接可以秒数相减然后 格式化 
        var currentTime = publicFun.timeFormat(new Date(), 'yyyy-MM-dd hh:mm');
        _val.time = '';
        var hour = '', min = '';
        if (_inTime != '') {
          var total = (new Date(currentTime).getTime() - new Date(_inTime).getTime()) / 1000; // 所有秒数
          var timeWrap = parseInt(total / (24 * 60 * 60)); // 多少整天
          var afterDay = total - timeWrap * 24 * 60 * 60; // 取得算出天数后剩余的秒数
          if ((total < 86400) && (total > 0)) { // 1天之内的
            hour = (total / (60 * 60));
            hour = parseInt(hour);
            min = new Date().getMinutes() - (_inTime).substring(14, 16);
            if (min < 0) {
              min = 60 + min;
            }
          } else if (total >= 86400) { // 超过一天的
            hour = 24 * timeWrap + parseInt(afterDay / (60 * 60));
            min = new Date().getMinutes() - (_inTime).substring(14, 16);
            if (min < 0) {
              min = 60 + min;
            }
          }
          if (hour !== '' && min !== '') {
            _val.time = hour + '小时' + min + '分';
          } else if (hour !== '' && min === '') {
            _val.time = hour + '小时';
          } else if (hour === '' && min !== '') {
            _val.time = min + '分';
          }
        }
      }
      if (_islgbed === '1') {
        // html插入
        var _twoTypeList = '<div id="topList" class="topListWrap sickbed-container clr"></div><div class="betweenGap"></div><div id="bottomList" class="bottomListWrap sickbed-container clr"></div>';
        $('#sickbedContainer').html(_twoTypeList)
        $('#sickbedContainer').removeClass('sickbed-container');
        $('#tabsContainer').css({ 'overflow': 'hidden' });
        $('#topList').html('');
        $('#bottomList').html('');
        $.each(sickbedList, function (index, val) {
          if (val.bedPlace == '291') { // 留抢
            if (val.cstNam) {
              innerSickbedHtmlListLx.push(initHtmlStr(index, val))
            } else {
              innerSickbedHtmlListLx.push(initNullBed(index, val))
            }
          } else if (val.bedPlace == '290') { // 留观
            if (val.cstNam) {
              innerSickbedHtmlListLq.push(initHtmlStr(index, val))
            } else {
              innerSickbedHtmlListLq.push(initNullBed(index, val))
            }
          } else if (val.bedPlace == '2900') {
            if (val.emgSeq) {
              innerSickbedHtmlListLq.push(initHtmlStr(index, val))
            }
          } else if (val.bedPlace == '2911') {
            if (val.emgSeq) {
              innerSickbedHtmlListLx.push(initHtmlStr(index, val))
            }
          }
        });
        $('#topList').html(innerSickbedHtmlListLx.join(''));
        $('#bottomList').html(innerSickbedHtmlListLq.join(''));
        setLayout();
      } else {
        // html插入
        $('#sickbedContainer').html('');
        $('#sickbedContainer').addClass('sickbed-container');
        $('#tabsContainer').css({ 'overflow': 'auto' });
        $.each(sickbedList, function (index, val) {
          if (val.bedPlace == '291') { // 留抢
            if (val.cstNam) {
              innerSickbedHtmlList.push(initHtmlStr(index, val))
            } else {
              innerSickbedHtmlList.push(initNullBed(index, val))
            }
          } else if (val.bedPlace == '2911') { // 临时
            if (val.emgSeq) {
              innerSickbedHtmlList.push(initHtmlStr(index, val))
            }
          }
        });
        $('#sickbedContainer').html(innerSickbedHtmlList.join(''));
        setLayout();
      }
    }
  })
}

function initHtmlStr(index, val) {
  var str = '';
  if (isSmallBed) {
    str = smallBedStr(index, val);
  } else {
    str = '<span class=\"sickbed-box bed-box\" onclick=\"chooseBed(' + index + ', this)\" ondblclick=\"bedItemClick(' + index + ')\">' +
      '<div class=\"sickbed level' + val.emgDepCod + '\">' +
      '<div class=\"basicMsg\">' +
      '<ul class=\"topMsgUl\">' +
      '<li class=\"topLi\"><img src=\"' + val.imgSrc + '\" class="' + val.classStyle + '">' +
      '<span class=\"marginSpace\">' + val.bedName + '</span><span class=\"marginSmall\">' + val.levelNumCod + '</span>'+ '<span>' + val.time + '</span>' +
      '</li>' +
      '<li class=\"marginUp\"><label class=\"thinColor\">患者: </label><a href=\"javascript:;\" onmouseenter=\"showTips(' + index + ',event)\" onmouseleave=\"hideTips()\" onclick=\"bedItemClick(' + index + ')\">' + val.cstNam + '</a><span class=\"marginGap\">' + val.cstSexCod + '</span><span class=\"marginGap\">' + val.ageVal + '</span><span class=\"marginGap\"><a title="' + val.mpi + '" class=\"inlineA\">' + val.mpi + '</a></span></li>' +
      '<li><label class=\"thinColor\">时间: </label>' + val.emgDate + '</li>' +
      '<li><label class=\"thinColor\">主诉: </label><a title="' + val.preDgnCod + '" class=\"inlineA\">' + val.preDgnCod + '</a></li>' +
      '<li><label class=\"thinColor\">诊断: </label><a title="' + val.jbzdDes + '" class=\"inlineA\">' + val.jbzdDes + '</a></li>' +
      '<li class=\"marginDown\"><label class=\"thinColor\">科室: </label>' + val.emgFkCod + '</li>' +
      '</ul>' +
      '<ul class=\"GradeUl level' + val.emgDepCod + '\">' +
      // '<li><a title="' + val.glcs + '" class=\"bottomMsgInfo\">' + val.glcs + '</a></li>' +
      '<li><a class=\"bottomMsgInfo\">' + val.grnChlText + '</a></li>' +
      '</ul>' +
      '</div></div></span>';
  }
  return str
}

function initNullBed(index, val) {
  var _str = '';
  if (isSmallBed) {
    _str = smallBedStr(index, val);
  } else {
    _str = '<span class=\"sickbed-box bed-box\" onclick=\"chooseBed(' + index + ', this)\">' +
      '<div class=\"sickbed level' + val.emgDepCod + '\">' +
      '<div class=\"basicMsg\">' +
      '<ul class=\"topMsgUl\">' +
      '<li class=\"topLi\"><img src=\"' + val.imgSrc + '\">' +
      '<span class=\"marginSpace\">' + val.bedName + '</span>' +
      '</li>' +
      '<li class="noContentLi"><img src=\"../images/hzszyyhems/nurse/bed.png\"></li>' +
      '</div></div></span>';
  }
  return _str;
}

// 计算滞留时间
function computeTime (row) {
 var allTime = '', rtnTime = '', emgTime = new Date(publicFun.timeFormat(new Date(row.emgDat), 'yyyy/MM/dd hh:mm')).getTime();
  if (row.isBed == '1') { // 在床为1，不在床为0 小时制 0.5h 在床上则当前时间-预检时间；不在床则转归时间-预检时间
    allTime = new Date(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm')).getTime() - emgTime;
    rtnTime = allTime / (3600 * 1000)
  } else {
    if (row.isBed == '0') {
      if (row.sqlDate && (row.firstsqlseq != row.sqlSeq)) {
        allTime = new Date(publicFun.timeFormat(new Date(row.sqlDate), 'yyyy/MM/dd hh:mm')).getTime() - emgTime;
        rtnTime = allTime / (3600 * 1000)
      }
    }
  }
  if (rtnTime !== '' && (rtnTime - 0) > 0) {
    rtnTime = (rtnTime - 0).toFixed(2) + 'h'
  } else {
    rtnTime = '';
  }
  return rtnTime;
}

function smallBedStr (index, val) {
  var str = '';
  str = '<span class=\"small-box bed-box\" onclick=\"chooseBed(' + index + ', this)\" ondblclick=\"bedItemClick(' + index + ')\">' +
    '<div class=\"sickbed level' + val.emgDepCod + '\">' +
    '<div class=\"sickbed-name\">' + val.bedPlcNam + '</div>' +
    '<div class=\"patient-name\">' +
    '<a href=\"javascript:;\" onmouseenter=\"showTips(' + index + ',event)\" onmouseleave=\"hideTips()\" onclick=\"bedItemClick(' + index + ')\">' + val.cstNam + '</a>' +
    '</div>' + '</div>' + 
  '</span>';
  return str;
}
function getCols() {
  var col_list = [
    [{
      field: 'emgJjd',
      title: '',
      width: getWidth(0.02),
      formatter: function (value, row, index) {
        return ' '
      },
      styler: function (value, row, index) {
        if (value === 'I级') {
          return 'background:url(../images/hems/nurse/oneC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'II级') {
          return 'background:url(../images/hems/nurse/twoC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'III级') {
          return 'background:url(../images/hems/nurse/threeC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'IVa级' || value == 'IVb级') {
          return 'background:url(../images/hems/nurse/fourC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        }
      }
    }, {
      field: 'emgDat',
      title: '收治日期',
      sortable: true,
      width: getWidth(0.07),
      formatter: function (value, row, index) {
        return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm')
      }
    }, 
    {
      field: 'mpi',
      title: '病历号',
      width: getWidth(0.07),
      sortable: true
    },
    {
      field: 'cstNam',
      title: '病人姓名',
      width: getWidth(0.07),
      sortable: true
    }, {
      field: 'cstSexCod',
      title: '性别',
      width: getWidth(0.03),
      sortable: true
    }, {
      field: 'cstAge',
      title: '年龄',
      width: getWidth(0.03),
      sortable: true,
      formatter: function (value, row, index) {
        if (!isNull(value) && value != '') {
          return value + '' + row.cstAgeCod
        } else {
          return ''
        }
      }
    }, {
      field: 'emgDepCod',
      title: '分级',
      width: getWidth(0.04),
      sortable: true,
      formatter: function (value, row, index) {
        if (value == "I级") {
          return "<div class=\"levelAbg\">I级</div>";
        } else if (value == "II级") {
          return "<div class=\"levelBbg\">II级</div>";
        } else if (value == "III级") {
          return "<div class=\"levelCbg\">III级</div>";
        } else if (value == "IVa级") {
          return "<div class=\"levelDbg\">IVa级</div>";
        } else if (value == "IVb级") {
          return "<div class=\"levelDbg\">IVb级</div>";
        }
      }
    }, {
      field: 'emgBed',
      title: '床号',
      width: getWidth(0.05),
      sortable: true
    },
    {
      field: 'emgFkCod',
      title: '分科',
      width: getWidth(0.07),
      sortable: true
    },
    {
      field: 'jzxh',
      title: '就诊次数',
      width: getWidth(0.05),
      sortable: true
    }, 
    {
      field: 'cstDspCodNameNew',
      title: '转归',
      width: getWidth(0.07),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else if (row.cstDspCodNew == '2') {
          return row.cstDepCodNew
        } else if (row.cstDspCodNew == '13') {
          return row.sqlDes
        } else {
          return value
        }
      }
    }, {
      field: 'sqlDat',
      title: '转归时间',
      width: getWidth(0.07),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else {
          return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm');
        }
      }
    }, {
      field: 'preDgnCod',
      title: '主诉症状',
      width: getWidth(0.1),
      sortable: true
    }, {
      field: 'jbzdDes',
      title: '诊断',
      width: getWidth(0.1),
      sortable: true
    }, {
      field: 'isBed',
      title: '滞留时间',
      width: getWidth(0.04),
      sortable: true,
      formatter: function (value, row, index) {
        return computeTime(row);
      }
    }, {
      field: 'preUsrNam',
      title: '分诊护士',
      width: getWidth(0.07),
      sortable: true
    }
    ]
  ];
  var col_LgList = [
    [{
      field: 'emgJjd',
      title: '',
      width: getWidth(0.02),
      formatter: function (value, row, index) {
        return ' '
      },
      styler: function (value, row, index) {
        if (value === 'I级') {
          return 'background:url(../images/hems/nurse/oneC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'II级') {
          return 'background:url(../images/hems/nurse/twoC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'III级') {
          return 'background:url(../images/hems/nurse/threeC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'IVa级' || value == 'IVb级') {
          return 'background:url(../images/hems/nurse/fourC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        }
      }
    }, {
      field: 'emgDat',
      title: '收治日期',
      sortable: true,
      width: getWidth(0.06),
      formatter: function (value, row, index) {
        return publicFun.timeFormat(new Date(value), 'MM/dd hh:mm')
      }
    }, {
      field: 'mpi',
      title: '病历号',
      width: getWidth(0.08),
      sortable: true
    }, 
    {
      field: 'cstNam',
      title: '病人姓名',
      width: getWidth(0.07),
      sortable: true
    }, {
      field: 'cstSexCod',
      title: '性别',
      width: getWidth(0.03),
      sortable: true
    }, {
      field: 'cstAge',
      title: '年龄',
      width: getWidth(0.03),
      sortable: true,
      formatter: function (value, row, index) {
        if (!isNull(value) && value != '') {
          return value + '' + row.cstAgeCod
        } else {
          return ''
        }
      }
    }, {
      field: 'emgDepCod',
      title: '分级',
      width: getWidth(0.03),
      sortable: true,
      formatter: function (value, row, index) {
        if (value == "I级") {
          return "<div class=\"levelAbg\">I级</div>";
        } else if (value == "II级") {
          return "<div class=\"levelBbg\">II级</div>";
        } else if (value == "III级") {
          return "<div class=\"levelCbg\">III级</div>";
        } else if (value == "IVa级") {
          return "<div class=\"levelDbg\">IVa级</div>";
        } else if (value == "IVb级") {
          return "<div class=\"levelDbg\">IVb级</div>";
        }
      }
    },
    {
      field: 'emgFkCod',
      title: '分科',
      width: getWidth(0.06),
      sortable: true
    }, 
    {
      field: 'jzxh',
      title: '就诊次数',
      width: getWidth(0.05),
      sortable: true
    }, 
    {
      field: 'rqDate',
      title: '入抢时间',
      sortable: true,
      width: getWidth(0.07),
      formatter: function (value, row, index) {
        if (value) {
          return value.substring(5);
        }
      }
    }, {
      field: 'emgBed',
      title: '抢-床',
      width: getWidth(0.04),
      sortable: true
    }, {
      field: 'rgDate',
      title: '入观时间',
      sortable: true,
      width: getWidth(0.07),
      formatter: function (value, row, index) {
        if (value) {
          return value.substring(5);
        }
      }
    }, {
      field: 'bedLgs',
      title: '留-床',
      width: getWidth(0.04),
      sortable: true
    },
    {
      field: 'cstDspCodNameNew',
      title: '转归',
      width: getWidth(0.07),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else if (row.cstDspCodNew == '2') {
          return row.cstDepCodNew
        } else if (row.cstDspCodNew == '13') {
          return row.sqlDes
        } else {
          return value
        }
      }
    }, {
      field: 'sqlDat',
      title: '转归时间',
      width: getWidth(0.06),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else {
          return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm');
        }
      }
    }, {
      field: 'preDgnCod',
      title: '主诉症状',
      width: getWidth(0.18),
      sortable: true
    }, {
      field: 'preUsrNam',
      title: '分诊护士',
      width: getWidth(0.07),
      sortable: true
    }
    ]
  ];
  var col_list_check = [
    [{
      field: 'emgJjd',
      title: '',
      width: getWidth(0.02),
      formatter: function (value, row, index) {
        return ' '
      },
      styler: function (value, row, index) {
        if (value === 'I级') {
          return 'background:url(../images/hems/nurse/oneC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'II级') {
          return 'background:url(../images/hems/nurse/twoC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'III级') {
          return 'background:url(../images/hems/nurse/threeC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'IVa级' || value == 'IVb级') {
          return 'background:url(../images/hems/nurse/fourC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        }
      }
    }, {
      field: 'emgDat',
      title: '收治日期',
      sortable: true,
      width: getWidth(0.07),
      formatter: function (value, row, index) {
        return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm')
      }
    }, 
    {
      field: 'mpi',
      title: '病历号',
      width: getWidth(0.07),
      sortable: true
    },
    {
      field: 'cstNam',
      title: '病人姓名',
      width: getWidth(0.05),
      sortable: true
    }, {
      field: 'cstSexCod',
      title: '性别',
      width: getWidth(0.03),
      sortable: true
    }, {
      field: 'cstAge',
      title: '年龄',
      width: getWidth(0.03),
      sortable: true,
      formatter: function (value, row, index) {
        if (!isNull(value) && value != '') {
          return value + '' + row.cstAgeCod
        } else {
          return ''
        }
      }
    }, {
      field: 'emgDepCod',
      title: '分级',
      width: getWidth(0.04),
      sortable: true,
      formatter: function (value, row, index) {
        if (value == "I级") {
          return "<div class=\"levelAbg\">I级</div>";
        } else if (value == "II级") {
          return "<div class=\"levelBbg\">II级</div>";
        } else if (value == "III级") {
          return "<div class=\"levelCbg\">III级</div>";
        } else if (value == "IVa级") {
          return "<div class=\"levelDbg\">IVa级</div>";
        } else if (value == "IVb级") {
          return "<div class=\"levelDbg\">IVb级</div>";
        }
      }
    }, {
      field: 'emgBed',
      title: '床号',
      width: getWidth(0.03),
      sortable: true
    },
    {
      field: 'emgFkCod',
      title: '分科',
      width: getWidth(0.06),
      sortable: true
    },
    {
      field: 'jzxh',
      title: '就诊次数',
      width: getWidth(0.04),
      sortable: true
    }, 
    {
      field: 'cstDspCodNameNew',
      title: '转归',
      width: getWidth(0.05),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else if (row.cstDspCodNew == '2') {
          return row.cstDepCodNew
        } else if (row.cstDspCodNew == '13') {
          return row.sqlDes
        } else {
          return value
        }
      }
    }, {
      field: 'sqlDat',
      title: '转归时间',
      width: getWidth(0.06),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else {
          return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm');
        }
      }
    }, {
      field: 'preDgnCod',
      title: '主诉症状',
      width: getWidth(0.13),
      sortable: true
    }, {
        field: 'jbzdDes',
        title: '诊断',
        width: getWidth(0.1),
        sortable: true
    }, {
      field: 'isBed',
      title: '滞留时间',
      width: getWidth(0.04),
      sortable: true,
      formatter: function (value, row, index) {
        return computeTime(row);
      }
    }, 
    {
      field: 'labelPrintFlg',
      title: '打印腕带',
      width: getWidth(0.04),
      formatter: function (value, row, index) {
        if (value == '1') {
          return '已打印'
        } else {
          return '未打印'
        }
      }
    }, {
      field: 'checkNurStatus',
      title: '病历查对',
      width: getWidth(0.04),
      formatter: function (value, row, index) {
        if (value == '2') {
          return '<span style="color: rgb(42, 0, 255)">已查对</span>'
        } else {
          return '<span style="color: red">未查对</span>'
        }
      }
    }, {
      field: 'preUsrNam',
      title: '分诊护士',
      width: getWidth(0.07),
      sortable: true
    }
    ]
  ];
  var col_LgList_check = [
    [{
      field: 'emgJjd',
      title: '',
      width: getWidth(0.02),
      formatter: function (value, row, index) {
        return ' '
      },
      styler: function (value, row, index) {
        if (value === 'I级') {
          return 'background:url(../images/hems/nurse/oneC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'II级') {
          return 'background:url(../images/hems/nurse/twoC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'III级') {
          return 'background:url(../images/hems/nurse/threeC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        } else if (value === 'IVa级' || value == 'IVb级') {
          return 'background:url(../images/hems/nurse/fourC.png);background-repeat:no-repeat;background-position:6px;background-size:12px 12px;color:transparent;'
        }
      }
    }, {
      field: 'emgDat',
      title: '收治日期',
      sortable: true,
      width: getWidth(0.05),
      formatter: function (value, row, index) {
        return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm')
      }
    }, {
      field: 'mpi',
      title: '病历号',
      width: getWidth(0.06),
      sortable: true
    }, 
    {
      field: 'cstNam',
      title: '病人姓名',
      width: getWidth(0.05),
      sortable: true
    }, {
      field: 'cstSexCod',
      title: '性别',
      width: getWidth(0.03),
      sortable: true
    }, {
      field: 'cstAge',
      title: '年龄',
      width: getWidth(0.03),
      sortable: true,
      formatter: function (value, row, index) {
        if (!isNull(value) && value != '') {
          return value + '' + row.cstAgeCod
        } else {
          return ''
        }
      }
    }, {
      field: 'emgDepCod',
      title: '分级',
      width: getWidth(0.03),
      sortable: true,
      formatter: function (value, row, index) {
        if (value == "I级") {
          return "<div class=\"levelAbg\">I级</div>";
        } else if (value == "II级") {
          return "<div class=\"levelBbg\">II级</div>";
        } else if (value == "III级") {
          return "<div class=\"levelCbg\">III级</div>";
        } else if (value == "IVa级") {
          return "<div class=\"levelDbg\">IVa级</div>";
        } else if (value == "IVb级") {
          return "<div class=\"levelDbg\">IVb级</div>";
        }
      }
    },
    {
      field: 'emgFkCod',
      title: '分科',
      width: getWidth(0.06),
      sortable: true
    }, 
    {
      field: 'jzxh',
      title: '就诊次数',
      width: getWidth(0.05),
      sortable: true
    }, 
    {
      field: 'rqDate',
      title: '入抢时间',
      sortable: true,
      width: getWidth(0.07),
      formatter: function (value, row, index) {
        if (value) {
          return value.substring(5);
        }
      }
    }, {
      field: 'emgBed',
      title: '抢-床',
      width: getWidth(0.04),
      sortable: true
    }, {
      field: 'rgDate',
      title: '入观时间',
      sortable: true,
      width: getWidth(0.07),
      formatter: function (value, row, index) {
        if (value) {
          return value.substring(5);
        }
      }
    }, {
      field: 'bedLgs',
      title: '留-床',
      width: getWidth(0.04),
      sortable: true
    },
    {
      field: 'cstDspCodNameNew',
      title: '转归',
      width: getWidth(0.07),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else if (row.cstDspCodNew == '2') {
          return row.cstDepCodNew
        } else if (row.cstDspCodNew == '13') {
          return row.sqlDes
        } else {
          return value
        }
      }
    }, {
      field: 'sqlDat',
      title: '转归时间',
      width: getWidth(0.05),
      sortable: true,
      formatter: function (value, row, index) {
        if (row.firstsqlseq ==row.sqlSeq) {
          return ''
        } else {
          return publicFun.timeFormat(new Date(value), 'MM-dd hh:mm');
        }
      }
    }, {
      field: 'preDgnCod',
      title: '主诉症状',
      width: getWidth(0.18),
      sortable: true
    }, {
      field: 'checkNurStatus',
      title: '病历查对',
      width: getWidth(0.05),
      formatter: function (value, row, index) {
        if (value == '2') {
          return '<span style="color: rgb(42, 0, 255)">已查对</span>'
        } else {
          return '<span style="color: red">未查对</span>'
        }
      }
    }, {
      field: 'preUsrNam',
      title: '分诊护士',
      width: getWidth(0.07),
      sortable: true
    }
    ]
  ];
  if (pageName == 'qsjCase') {
    if (_islgbed == '1') {
      return col_LgList
    } else {
      return col_list
    }
  } else {
    if (_islgbed == '1') {
      return col_LgList_check
    } else {
      return col_list_check
    }
  }
}

function getWidth(proportion) {
  var width = $('#tabsContainer').width();
  if (_islgbed === '1') {
    width = width - 100;
  }
  return Math.round(proportion * width);
}


/**
  * [checkMsg 检查信息]
  */
function checkMsg() {
  if (isOwnEmpty(checkedObj)) {
    $.messager.alert('警告', '请先选择一条记录', 'warning');
    return
  }
  var openTabNam = '';
  if (checkedObj.bedNum != null) {
    openTabNam = checkedObj.bedNum + '-';
  }
  var openTabName = openTabNam + checkedObj.cstNam + '-检验信息',
    openTabUrl = baseurl + 'zyyqjs/toqjscaseexaminenew.do?emgSeq=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
  parent.opentabwindow(openTabName, openTabUrl);
}
/**
 * [checkMsg 检查报告]
 */
function checkTestRcord() {
  if (isOwnEmpty(checkedObj)) {
    $.messager.alert('警告', '请先选择一条记录', 'warning');
    return
  }
  var openTabNam = '';
  if (checkedObj.bedNum != null) {
    openTabNam = checkedObj.bedNum + '-';
  }
  var openTabName = openTabNam + checkedObj.cstNam + '-检查报告',
    openTabUrl = baseurl + 'zyyqjs/qjsjcbg.do?emgSeq=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
  parent.opentabwindow(openTabName, openTabUrl);
}
/**
 * [checkMsg 医嘱信息]
 */
function checkYzxx() {
  if (isOwnEmpty(checkedObj)) {
    $.messager.alert('警告', '请先选择一条记录', 'warning');
    return
  }
  var openTabNam = '';
  if (checkedObj.bedNum != null) {
    openTabNam = checkedObj.bedNum + '-';
  }
  var openTabName = openTabNam + checkedObj.cstNam + '-医嘱信息',
    openTabUrl = baseurl + 'zyyqjs/qjsyzxx.do?emgSeq=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
  parent.opentabwindow(openTabName, openTabUrl);
}

/**
 * [patientDetail 患者详情]
 */
function patientDetail() {
  if (isOwnEmpty(checkedObj)) {
    $.messager.alert('警告', '请先选择一条记录', 'warning');
    return
  }
  var openTabNam = '';
  if (checkedObj.bedNum != null) {
    openTabNam = checkedObj.bedNum + '-';
  }
//  var openTabName = openTabNam + checkedObj.cstNam + '-患者详情',
//    openTabUrl = baseurl + 'hzszyyemg/queryhzxq.do?emgSeq=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
//  parent.opentabwindow(openTabName, openTabUrl);
  var openModalWindowUrl = baseurl+'hzszyyemg/timershaft.do?emgSeq=' + checkedObj.emgSeq;
  createmodalwindow(checkedObj.cstNam + "-" + '时间轴', 800, 340, openModalWindowUrl);
}

/**
 * [consultationList 会诊情况]
 */
function consultationList() {
  if (isOwnEmpty(checkedObj)) {
    $.messager.alert('警告', '请先选择一条记录', 'warning');
    return
  }
  var openTabNam = '';
  if (checkedObj.bedNum != null) {
    openTabNam = checkedObj.bedNum + '-';
  }
  var openModalWindowName = openTabNam + checkedObj.cstNam + '-会诊情况',
    openModalWindowUrl = baseurl + 'consultation/queryMainConsultation.do?emgSeqCr=' + checkedObj.emgSeq + '&th=' + new Date().getTime();
  createmodalwindow(openModalWindowName, 950, 500, openModalWindowUrl);
}

/**
 * [右键点击显示菜单]
 */
var rightMenu = document.getElementById("rightMenu");
document.oncontextmenu = function (e) {
  if ($('#listContainer').is(':visible')) {
    return true;
  }
  var mousepPosition = getMousePos(e);
  var x = mousepPosition['x'],
    y = mousepPosition['y'];
  var Height = document.documentElement.clientHeight || document.body.clientHeight;
  var Width = document.documentElement.clientWidth || document.body.clientWidth;
  var maxWidth = Width - 240 - 10 - 125;
  var maxHeight = Height - $('#rightMenu').height() - 10;
  if (x >= maxWidth) {
    x = maxWidth
  }
  if (y >= maxHeight) {
    y = maxHeight
  }
  if (y <= 40) {
    y = 40
  }
  rightMenu.style.display = "block";
  rightMenu.style.left = x + "px";
  rightMenu.style.top = y + "px";
  if (x <= maxWidth && y >= 40 && y <= maxHeight) {
    return false; //一般点击右键会出现浏览器默认的右键菜单，写了这句代码就可以阻止该默认事件。
  } else {
    return true;
  }
}
document.onclick = function (e) {
  var e = e || window.event;
  rightMenu.style.display = "none"
}
rightMenu.onclick = function (e) {
  var e = e || window.event;
  var mousepPosition = getMousePos(e);
  var x = mousepPosition['x'],
    y = mousepPosition['y'];
  var Height = document.documentElement.clientHeight || document.body.clientHeight;
  var Width = document.documentElement.clientWidth || document.body.clientWidth;
  var maxWidth = Width - 240 - 10 - 125;
  var maxHeight = Height - $('#rightMenu').height() - 10;
  if (x <= maxWidth && y >= 40 && y <= maxHeight) {
    e.cancelBubble = true
  } else {
    e.cancelBubble = false
  }
}

window.onload = function () {
  window.onresize = setLayout;
  setLayout();
}

function getDataCount() {
  var _codList = ['qjsbedcount', 'lgsbedcount', 'zlcount', 'qtsjcount', 'lstdcount', 'cscount', 'xtcount', 'czcount', 'hxkncount', 'xfztcount'];
  publicFun.httpServer({ url: baseurl + 'zyyqjs/getqjsDataCount.do' }, {
    'startdate': $('#emg_startdate').val(),
    'enddate': $('#emg_enddate').val()
  }, function (res) {
    _codList.map(function (ele) {
      $('#' + ele).html(res.resultInfo.sysdata.qjsCountCustom[ele])
    })
  })
}

function setType() {
  var _codVal = $('#queryText').val(),
    _selVal = $('#typeVal').val();
  $('.queryEmg').val('');
  $('#emgText' + _selVal).val(_codVal);
}


function queryItem(idx, field, bedVal) {
  var obj = {
    bedPlace: '',
    mqdate: '',
    grnChl: '',
    qtsjFlg: '',
    cspgFlg: '',
    xtFlg: '',
    czFlg: '',
    hxknFlg: '',
    xfztFlg: ''
  };
  if (bedVal) {
    obj.bedPlace = bedVal;
  } else {
    obj[field] = '1';
  }
  $('.line-span').css({ 'font-weight': 'normal' }).eq(idx).css({ 'font-weight': 'bold' });
  getPatientList(obj);
}

function keyCodeUp (eve) {
  if ($('#typeVal').val() == '4') { // 诊断
      getCurrentItem();
  }
}

var totalCbyxList = []; // 所有的诊断数据
function getKnowledgeList () {
  publicFun.httpServer({ url: baseurl + 'firstimp/queryZsk_result.do' }, {page: 1,rows: 10000}, function (res) {
    totalCbyxList = res.rows;
  })
}
// 诊断信息模糊查询
function getCurrentItem () {
  var _strItem = '', currentItemVal = $('#queryText').val();
  totalCbyxList.map(function (item, idx) {
    if (currentItemVal) {
      var currentData = item.cbyx.indexOf(currentItemVal);
      var currentLetter = item.pysm.indexOf(currentItemVal.toUpperCase());
      if (currentData === 0 || currentLetter === 0) {
        _strItem += "<li onclick=\"chooseItem('" + item.cbyx + "','" + idx + "')\">" + item.cbyx + "</li>";
      }
    }
  })
  if (_strItem) {
    _strItem = "<ul>" + _strItem + "</ul>";
    $('#queryNameList').html(_strItem);
    $('#queryNameList').show();
  }
}
// 单选某一条诊断信息
function chooseItem (item) {
  $('#queryText').val(item);
  $('#emgText4').val(item);
  $('#queryNameList').html('');
  $('#queryNameList').hide();
  $("#queryText").blur();
}
$("body").click(function () {
  $('.smallList').css('display', 'none');
});