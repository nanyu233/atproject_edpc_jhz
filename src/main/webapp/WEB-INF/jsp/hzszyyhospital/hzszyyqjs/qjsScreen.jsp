<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html>
<html>

<head>
  <title>抢救室管理-留抢大屏</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/qjsScreen.css?499" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}js/bigScreen/html5shiv.min.js"></script>
  <script src="${baseurl}js/bigScreen/respond.min.js"></script>
</head>

<body>
  <div class="at-container-fluid">
    <div class="at-tabs-container" id="tabsContainer">
      <div class="sickbed-container clr" id="sickbedContainer">
      </div>
      <div class="fullScreenBtn">
        <img class="fullScreen" src="${baseurl}images/common/bigScreen/fullScreen.png" alt="" title="全屏">
        <img class="exitFullScreen" src="${baseurl}images/common/bigScreen/exitFullScreen.png" alt="" title="退出">
      </div>
    </div>
  </div>
  <script type="text/javascript">
    var sickbedUrl = '${baseurl}zyyqjs/bedInfo.do'; // url定义，请求床位信息的地址

    /**
     * 
     *
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
     * [getSickbedMsg 获取所有床位信息]
     */
    function getSickbedMsg() {
      $('#sickbedContainer').show();
      var innerSickbedHtmlList = [];
      publicFun.httpServer({ url: sickbedUrl }, {'isBedType':'0'}, function (data) {
        if (data['resultInfo']['type'] === 1) {
          var sysdata = data['resultInfo']['sysdata'],
            sickbedList = sysdata['hspBedInfCustomList'];
          detailNull(sickbedList);
          // var _dealList = sickbedList.slice(0, 16);
          var _dealList = sickbedList;
          // html插入
          $('#sickbedContainer').html('');
          for (var i = 0; i < _dealList.length; i++) {
            var _val = _dealList[i];
            _val.emgDate = '';
            if (_val.emgDat) {
              _val.emgDate = publicFun.timeFormat(new Date(_val.emgDat), 'yyyy/MM/dd hh:mm')
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
            if (_val.rqDate) {
              _inTime = _val.rqDate
            }
            _val.levelNumCod = '';
            var levelNumList = ['I级', 'II级', 'III级', 'IVa级', 'IVb级'];
            if (_val.emgDepCod !== '' && _val.emgDepCod != null) {
              _val.levelNumCod = levelNumList[_val.emgDepCod];
            }
            _val.grnChlText = _val.grnChl == '1' ? '绿色通道' : ''
            var currentTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
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
          $.each(_dealList, function (index, val) {
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
          var _JQinnerSickbedHtmlList = innerSickbedHtmlList.slice(0,16);
          $('#sickbedContainer').html(_JQinnerSickbedHtmlList.join(''));
          if (sickbedList.length === 12) {
            setDomCss()
          }
        }
      })
    }
    function initHtmlStr(index, val) {
      var str = '';
      str = '<span class=\"sickbed-box bed-box\">' +
        '<div class=\"sickbed level' + val.emgDepCod + '\">' +
        '<div class=\"basicMsg\">' +
        '<ul class=\"topMsgUl\">' +
        '<li class=\"topLi\"><img src=\"' + val.imgSrc + '\" class="' + val.classStyle + '">' +
        '<span class=\"marginSpace\">' + val.bedName + '</span><span class=\"marginSmall\">' + val.levelNumCod + '</span>'+ '<span>' + val.time + '</span>' +
        '</li>' +
        '<li class=\"marginUp\"><label class=\"thinColor\">患者: </label><a href=\"javascript:;\"">' + val.cstNam + '</a><span class=\"marginGap\">' + val.cstSexCod + '</span><span class=\"marginGap\">' + val.ageVal + '</span><span class=\"marginGap\"><a title="' + val.mpi + '" class=\"inlineA\">' + val.mpi + '</a></span></li>' +
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
      return str
    }
    
    function initNullBed(index, val) {
      var _str = '';
      _str = '<span class=\"sickbed-box bed-box\">' +
        '<div class=\"sickbed level' + val.emgDepCod + '\">' +
        '<div class=\"basicMsg\">' +
        '<ul class=\"topMsgUl\">' +
        '<li class=\"topLi\"><img src=\"' + val.imgSrc + '\">' +
        '<span class=\"marginSpace\">' + val.bedName + '</span>' +
        '</li>' +
        '<li class="noContentLi"><img src=\"../images/hzszyyhems/nurse/bed.png\"></li>' +
        '</div></div></span>';
      return _str;
    }
    function correctScreen() {
      var r = ($(window).width()) / 1440;
      var h = ($(window).height()) / 824;
      $(document.body).css({
        "-webkit-transform": "scale(" + r + "," + h + ")",
        "-moz-transform": "scale(" + r + "," + h + ")",
        "-o-transform": "scale(" + r + "," + h + ")",
        "transform": "scale(" + r + "," + h + ")"
      });

      //scale(x,y)	定义 2D 缩放转换。
      $(window).resize(function () {
        var r = ($(window).width()) / 1440;
        var h = ($(window).height()) / 824;
        $(document.body).css({
          "-webkit-transform": "scale(" + r + "," + h + ")",
          "-moz-transform": "scale(" + r + "," + h + ")",
          "-o-transform": "scale(" + r + "," + h + ")",
          "transform": "scale(" + r + "," + h + ")"
        });
      });
    }
    function launchFullscreen() {
      var element = document.documentElement;
      if (element.requestFullscreen) {
        element.requestFullscreen();
      } else if (element.mozRequestFullScreen) {
        element.mozRequestFullScreen();
      } else if (element.webkitRequestFullscreen) {
        element.webkitRequestFullscreen();
      } else if (element.msRequestFullscreen) {
        element.msRequestFullscreen();
      } else {
        console.log("当前浏览器不支持全屏");
      }
    }

    // 判断浏览器种类
    function exitFullscreen() {
      if (document.exitFullscreen) {
        document.exitFullscreen();
      } else if (document.mozCancelFullScreen) {
        document.mozCancelFullScreen();
      } else if (document.webkitCancelFullScreen) {
        document.webkitCancelFullScreen();
      } else if (document.msExitFullscreen) {
        document.msExitFullscreen();
      }
    }
    
    // 铺满12张
    function setDomCss () {
      $('.sickbed-container .sickbed').css({'height': '260px'});
      $('.basicMsg').css({ 'height': '260px' });
      $('.basicMsg .topMsgUl li.marginUp').css({'margin-top': '15px'});
      $('.basicMsg .topMsgUl li').css({'margin': '4px 0', 'height': '26px', 'font-size': '17px', 'line-height': '30px'});
      $('.basicMsg .topMsgUl li.topLi').css({ 'margin': '0', 'height': '39px', 'font-size': '18px', 'line-height': '39px' });
      $('.basicMsg .topMsgUl').css({'height': '220px'});
      $('.basicMsg .topMsgUl li.noContentLi img').css({'width': '180px', 'margin-top': '20px'});
      $('.basicMsg .GradeUl').css({'height': '40px', 'line-height': '40px'});
    }

    $(function () {
      getSickbedMsg();
      correctScreen();
      setInterval(function () {
        getSickbedMsg();
      }, 3000);
      // 全屏事件
      $('.fullScreen').click(function () {
        launchFullscreen();
        $(this).hide().next().show();
      })
      $('.exitFullScreen').click(function () {
        exitFullscreen();
        $(this).hide().prev().show();
      })
    });
  </script>
</body>

</html>