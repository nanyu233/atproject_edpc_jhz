<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>留抢病历记录</title>
  <link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/base/cssReseat.css?090" />
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/default/easyui.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/easyui1.3/themes/icon.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/qjscasenote.css?090">
</head>

<body class="easyui-layout">
  <div id="headerLayout" data-options="region:'north',border:false,minHeight:47" style="overflow-y: hidden;padding:6px 50px 6px 20px;border-bottom:solid #e4efff 10px;">
    <header class="basic-msg">
      <span class="name">${hspemginfCustom.cstNam}</span>
      <c:choose>
        <c:when test="${hspemginfCustom.emgDepCod == '0'}">
          <span class="level level0">I级</span>
        </c:when>
        <c:when test="${hspemginfCustom.emgDepCod == '1'}">
          <span class="level level1">II级</span>
        </c:when>
        <c:when test="${hspemginfCustom.emgDepCod == '2'}">
          <span class="level level2">III级</span>
        </c:when>
        <c:when test="${hspemginfCustom.emgDepCod == '3'}">
          <span class="level level3">IVa级</span>
        </c:when>
        <c:otherwise>
          <span class="level level3">IVb级</span>
        </c:otherwise>
      </c:choose>
      <span class="sex">${hspemginfCustom.cstSexCod} /</span>
      <span class="age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod} /</span>
      <span class="bed">${hspemginfCustom.emgBed}</span>
      <span class="cardNum">卡号：${hspemginfCustom.vstCad}</span>
      <span class="first-diagnosed">首诊：${hspemginfCustom.cstDsp} / ${hspemginfCustom.emgFkCod} /
        ${hspemginfCustom.emgAre}</span>
      <span class="diagnose">诊断：${hspemginfCustom.ryzdXy}<span id="hasTwoDiagnose" style="padding-right: 0;"> / </span>${hspemginfCustom.jbzdDes}</span>
    </header>
  </div>
  <div data-options="region:'west',border:false" style="width:200px;border-right:solid #e4efff 10px;">
    <div class="nav-tree" id="navTree"></div>
  </div>
  <div data-options="region:'center',border:false">
    <div class="main" id="main" style="overflow-y: hidden;">
      <span id="_psex" class="hidden">${hspemginfCustom.cstSexCod}</span>
      <span id="_page" class="hidden">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
      <span id="_pemgFkCod" class="hidden">${hspemginfCustom.emgFkCod}</span>
      <span id="_pdiagnose" class="hidden">${hspemginfCustom.ryzdXy}</span>
      <span id="_pdiagnoseDes" class="hidden">${hspemginfCustom.jbzdDes}</span>
      <iframe frameborder="0" marginwidth="0" marginheight="0" width="100%" height="100%" id="mainIfream" scrolling="auto" src=""></iframe>
    </div>
  </div>
  <input type="hidden" id="emgSeq" value="${hspemginfCustom.emgSeq}" />
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/locale/easyui-lang-zh_CN.js"></script>
  <script type="text/javascript">
    var data = [{
      text: '留观首页',
      attributes: {
        url: 'zyylqblqrb/queryobservenote.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '留抢病历',
      attributes: {
        url: 'zyylqblqrb/querylqbl.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '病程记录',
      attributes: {
        url: 'zyylqblqrb/queryDiseaseCourse.do?emgSeqDc=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '手术操作记录',
      attributes: {
        url: 'zyylqblqrb/queryOtherDisease.do?forwardUrl=Operation&hspDiseaseCourseCustom.emgSeqDc=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '会诊记录',
      attributes: {
        url: 'zyylqblqrb/queryConsultation.do?emgSeqCr=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '死亡记录',
      attributes: {
        url: 'zyylqblqrb/queryDeathRecord.do?emgSeqDr=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '抢救室小结',
      attributes: {
        url: 'zyylqblqrb/querycgxj.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '知情同意',
      attributes: {
        url: 'zyylqblqrb/queryConsentInf.do?refseqno=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '评分表',
      attributes: {
        url: 'zyylqblqrb/queryDiseaseCourse.do?emgSeqDc=${hspemginfCustom.emgSeq}&type=score'
      }
    }, {
      text: '医嘱信息',
      attributes: {
        url: 'zyylqblqrb/toquerycfxx.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '检验信息',
      attributes: {
        //url: 'zyylqblqrb/toqjscaseexamine.do?emgSeq=${hspemginfCustom.emgSeq}'
        url: 'zyylqblqrb/toqjscaseexaminenew.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    }, {
      text: '检查报告',
      attributes: {
        url: 'zyylqblqrb/qjsjcbg.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    },
    {
      text: '体温单',
      attributes: {
        url: 'zyylqblqrb/lqbltpct.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    },
    {
      text: '护理记录单',
      attributes: {
        url: 'zyylqblqrb/lqblquerynote.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    },
    {
      text: '入院护理评估单',
      attributes: {
        url: 'zyylqblqrb/queryhlpgNote.do?emgSeq=${hspemginfCustom.emgSeq}'
      }
    }];
    /**
     * [hasTwoDiagnose 判断是否有2个诊断]
     */
    function hasTwoDiagnose() {
      if ('${hspemginfCustom.jbzdDes}' != '' && '${hspemginfCustom.ryzdXy}' != '') {
        $('#hasTwoDiagnose').show();
      } else {
        $('#hasTwoDiagnose').hide();
      }
    }
    /**
     * [setLayout 初始化页面布局]
     */
    function setLayout() {
      $('#headerLayout').height($('.basic-msg').height())
    }
    /**
     * [initNavTree 初始化左侧的菜单树]
     * @param  {[type]} data [description]
     */
    function initNavTree(data) {
      var _innerHtml = [];
      _innerHtml.push('<dl>');
      for (var i = 0; i < data.length; i++) {
        _innerHtml.push('<dd onclick=\"toIfream(\'' + data[i].attributes.url + '\',' + i + ')\">' + data[i]['text'] + '</dd>');
      }
      _innerHtml.push('</dl>')
      $('#navTree').html(_innerHtml.join(''))
    }
    /**
     * [toIfream 左侧菜单点击事件]
     * @param  {[type]} url  [description]
     * @param  {[type]} indx [description]
     * @return {[type]}      [description]
     */
    function toIfream(url, indx) {
      $('#mainIfream').attr('src', '${baseurl}' + url);
      $('#navTree dd').removeClass('active').eq(indx).addClass('active')
    }
    /**
     * [stopDefault 阻止默认事件]
     */
    function stopDefault(e) {
      if (e && e.preventDefault) {
        e.preventDefault();
      } else {
        window.event.returnValue = false;
        window.event.keyCode = 0;
        alert(e.keyCode);
      }
      return false;
    }
    $(function () {
      hasTwoDiagnose(); // 判断是否有2个诊断
      setLayout();
      initNavTree(data);
      toIfream('zyylqblqrb/queryobservenote.do?emgSeq=${hspemginfCustom.emgSeq}', 0);
      $(document).bind("resize", function () {
        setLayout();
      });
      $(document).keydown(function (event) {
        switch (event.keyCode) {
          case 18:
            stopDefault(event)
          case 116:
            stopDefault(event)
          case 122:
            stopDefault(event)
        }
      });
      var ageVal = '${hspemginfCustom.cstAge}';
      if (ageVal == '') {
        $('.age').html('');
      }
    })
  </script>
</body>

</html>