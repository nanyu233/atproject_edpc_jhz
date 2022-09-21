<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>病程记录</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery.easyui.min.js"></script>
  <script>
    var _type = '${type}';
  </script>
</head>

<body>
  <div class="selectdiv">
    类型：
    <select id="selecttype" onchange="selectType()">
      <option value="firstdisease">首次病程记录</option>
      <option value="daily">日常病程记录</option>
      <option value="critical">危急值病程</option>
      <option value="brain">脑梗溶栓病程记录</option>
      <option value="zzyscf">主治医师查房记录</option>
      <option value="fzryscf">副主任医师查房记录</option>
      <option value="zryscf">主任医师查房记录</option>
      <option value="jbjl">交班记录</option>
      <option value="jiebjl">接班记录</option>
      <option value="qjjl">抢救记录</option>
      <option value="kbjttjl">可编辑抬头记录</option>
    </select>
    <input type="hidden" value="${emgSeqDc}" id="emgSeq" />
  </div>
  <div class="cutoff2" id="blueline"></div>
  <div>
    <div class="mainDiv">
    </div>
  </div>
  <script type="text/javascript">
    var courseType;
    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      var currentHeight = $(window).height() - 40;
      var content = '<iframe id ="myFrame" height="' + currentHeight + '" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;"></iframe>';
      return content;
    }

    // 判断是评分进入还是病程进入，对选项进行设置
    function resignMenu() {
      var _selMenu = [{ name: 'cxpg', text: '出血风险评估单' }, { name: 'vtepg', text: 'VTE风险评估单' }, { name: 'bloodRisk', text: '静脉血栓风险因素评估表' }];
      var _url = "${baseurl}zyylqblqrb/riskAssSheet.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
      if (_type === 'score') {
        $('#selecttype').html('');
        _selMenu.forEach(function (item, index) {
          var option = document.createElement("option");
          $(option).val(item.name);
          $(option).text(item.text);
          $('#selecttype').append(option);
        })
        var contentDiv = createFrame(_url);
        $('.mainDiv').append(contentDiv);
        courseType = '9';
      } else {
        _url = "${baseurl}zyylqblqrb/queryFirstDisease.do?hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.courseType=1" + '&timeAll=' + new Date().getTime();
        var contentDiv = createFrame(_url);
        $('.mainDiv').append(contentDiv);
        courseType = '1';
      }
    }
    $(function () {
      resignMenu();
    })

    function showAhide() {
      $('.mainDiv').html('');
      $('#cutline,#blueline').css('visibility', 'hidden');
    }

    function showPageHide() {
      $('.mainDiv').html('');
      $('#cutline,#blueline').css('visibility', 'visible');
    }
    function selectType() {
      var type = $('#selecttype').val();
      switch (type) {
        case 'firstdisease':
          showPageHide()
          var _url = "${baseurl}zyylqblqrb/queryFirstDisease.do?hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}&hspDiseaseCourseCustom.courseType=1";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '1';
          break;
        case 'daily':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/queryOtherDisease.do?forwardUrl=Daily&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '2';
          break;
        case 'critical':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/queryOtherDisease.do?forwardUrl=Critical&hspDiseaseCourseCustom.emgSeqDc=${emgSeqDc}";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '4';
          break;
        case 'zzyscf':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=2";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '5';
          break;
        case 'fzryscf':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=1";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '5';
          break;
        case 'zryscf':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toquerycfjl.do?emgSeq=${emgSeqDc}&flag=0";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '5';
          break;
        case 'jbjl':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toqueryjjbjl.do?emgSeq=${emgSeqDc}&flag=0";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '6';
          break;
        case 'jiebjl':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toqueryjjbjl.do?emgSeq=${emgSeqDc}&flag=1";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '6';
          break;
        case 'qjjl':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toqueryqjjl.do?emgSeq=${emgSeqDc}";
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '7';
          break;
        case 'brain':
          showPageHide();
          var _url = "${baseurl}zyylqblqrb/brainDisease.do?forwardUrl=Brain&hspCerebralCourseCustom.courseType=8&emgSeq=" + $('#emgSeq').val();
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '8';
          break;
        case 'kbjttjl':
          showAhide();
          var _url = "${baseurl}zyylqblqrb/toqueryzdy.do?emgSeq=${emgSeqDc}&flag=9" + '&timeAll=' + new Date().getTime();
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '12';
          break;
        case 'cxpg':
          showPageHide();
          var _url = "${baseurl}zyylqblqrb/riskAssSheet.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '9';
          break;
        case 'vtepg':
          showPageHide();
          var _url = "${baseurl}zyylqblqrb/VteAssSheet.do?emgSeq=${emgSeqDc}" + '&timeAll=' + new Date().getTime();
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '10';
          break;
        case 'bloodRisk':
          showPageHide();
          var _url = "${baseurl}zyylqblqrb/jmxsAssSheet.do?emgSeq=" + $('#emgSeq').val() + '&timeAll=' + new Date().getTime();
          var contentDiv = createFrame(_url);
          $('.mainDiv').append(contentDiv);
          courseType = '11';
          break;
      }
    }
  </script>
</body>

</html>