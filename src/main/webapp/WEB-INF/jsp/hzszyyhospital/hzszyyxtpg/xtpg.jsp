<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?10" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hljl.css?039">
  <title>系统评估</title>
  <script type="text/javascript" charset="utf-8">
    var _emgSeq = '${emgSeq}';
    var comdata = { cstNam: '${cstNam}', emgSeq: '${emgSeq}', baseUrl: '${baseurl}', username: '${sessionScope.activeUser.usrname}' };
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="xtpg" ms-controller="xtpg">
  <script type="text/javascript">
    var pagenum = 0;
    var pagetype = '';

    document.onkeydown = function (evt) {
      var isie = (document.all) ? true : false;
      var key;
      var srcobj;
      if (isie) {
        key = event.keyCode;
        srcobj = event.srcElement;
      } else {
        key = evt.which;
        srcobj = evt.target;
      }
      if (key == 13) {
        if ($(".queryhlpgb #userSign").is(":focus")) {
          searchUser();
          return
        }
        if ($('.queryhlpgb #username').is(':focus')) {
          searchUserName();
          return
        }
      }
    };

    /**
    * [setLayout 初始化布局]
    */
    function setLayout() {
      var windowWidth = $(window).width(),
        windowHeight = $(window).height();
      $("#receitpDiv .dataGridDiv").height(windowHeight - 316);
      $("#receitpDiv").height(windowHeight - 26);
    }

    window.onload = function () {
      window.onresize = setLayout;
      setLayout();
    }
    
    function IEVersion() {
        var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串  
        var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1; //判断是否IE<11浏览器  
        var isEdge = userAgent.indexOf("Edge") > -1; // Edge 
        var isIE11 = userAgent.indexOf('Trident') > -1 && userAgent.indexOf("rv:11.0") > -1;
        if (isIE) {
            var reIE = new RegExp("MSIE (\\d+\\.\\d+);");
            reIE.test(userAgent);
            var fIEVersion = parseFloat(RegExp["$1"]);
            return 9;
        } else if (isEdge) {
            return 'edge';//edge
        } else if (isIE11) {
            return 11; //IE11  
        } else {
            if (userAgent.indexOf('Trident') > -1) {
                return 11;
            } else {
                return -1;
            }
        }
    }

    // 判断是否有护理记录单数据 有则默认护理记录单菜单 没有就默认护理评估单 => 从留抢进去
    function judgeIsHasRecordMsg () {
      publicFun.httpServer({url: '${baseurl}zjszyyhljld/queryhljld_result.do', isAsync: false}, {'hsphljldinfCustom.emgSeq': _emgSeq, 'page': 1, rows: '20'}, function (res) {
        if (res.resultInfo && res.resultInfo.messageCode == '109') {
          message_alert(res, function () {
            window.location.href = "${baseurl}first.do";
          });
        }
        if (res.rows.length > 0) {
          $("[pageIdx='4']").addClass('active');
          $("[pageIdx='4']").parent().parent().parent().addClass('inClick');
          choosePage($("[pageIdx='4']"));
        } else {
          // window.sessionStorage.removeItem('pageIdx');
          $("[pagetype='rypgd'][pageval='1']").addClass('active');
          $("[pagetype='rypgd'][pageval='1']").parent().parent().parent().addClass('inClick');
          choosePage($("[pagetype='rypgd'][pageval='1']"));
        }
      }, function () {
        // window.sessionStorage.removeItem('pageIdx');
        $("[pagetype='rypgd'][pageval='1']").addClass('active');
        $("[pagetype='rypgd'][pageval='1']").parent().parent().parent().addClass('inClick');
        choosePage($("[pagetype='rypgd'][pageval='1']"));
      })
    }

    //初始化
    function initPage() {
      if (parent.isCheckFormList) { // 判断是否在从列表点进来
        var pageIdx = window.sessionStorage.getItem('pageIdx');
        if (pageIdx) {
          $("[pageIdx='" + pageIdx + "']").addClass('active');
          $("[pageIdx='" + pageIdx + "']").parent().parent().parent().addClass('inClick');
          choosePage($("[pageIdx='" + pageIdx + "']"));
        } else {
          $("[pagetype='rypgd'][pageval='1']").addClass('active');
          $("[pagetype='rypgd'][pageval='1']").parent().parent().parent().addClass('inClick');
          choosePage($("[pagetype='rypgd'][pageval='1']"));
        }
      } else {
        judgeIsHasRecordMsg();
      }
      clickPageBtn();
      $('.select_ul .select_li').hover(function () {
        $(this).addClass("inHover");
        $(this).children('ul.inside_ul').show();
      }, function () {
        $(this).removeClass("inHover");
        $(this).children('ul.inside_ul').hide()
      });
      var _istype = IEVersion();
      if(_istype == '-1'){
      	$('#t1').hide();
      	$('#t2').show();
      }else{
      	$('#t1').show();
      	$('#t2').hide();
      }
    }

    //菜单栏选择事件
    function clickPageBtn() {
      $(".pagebtn,.pagebtnparent").unbind("click").bind("click", function () {
        window.onresize = setLayout;
        setLayout();
        $(".pagebtn,.pagebtnparent").removeClass('active');
        $(this).addClass('active');
        $('.select_ul .select_li').removeClass('inClick');
        $(this).parent().parent().parent().addClass('inClick');
        choosePage($(this));
      });
    }

    //生命体征跳转
    function chooseSmtzPage(clickOne){
      var pagenum = clickOne.attr("pageval");
      switch (pagenum) {
        case '1':
          createFrame('${baseurl}zyytrend/toVitalSignsPage.do');
          break;
        case '2':
          createFrame('${baseurl}zyytrend/toScorePage.do');
          break;
        default:
          break;
      }
    }

    /**
    * 跳转评分查询
    **/
    function chooseScorePage(clickOne) {
      var pagenum = clickOne.attr("pageval");
      switch (pagenum) {
        case '1':
          var params = {
            writetime: 'cratDat', filedScore: 'bradenSco', filedid: 'xtpgSeq', datagridUrl: '${baseurl}scorequery/queryBraden_result.do',
            ownParam: '&xtpgSeq=', formname: 'Bradendeleteform', titlename: 'Braden评分'
          };
          params.queryParams = {
            "hspBradenInfCustom.emgSeq": comdata.emgSeq
          };
          comdata.params = params;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          comdata._url = "${baseurl}scorequery/toBradenGde.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '2':
          var params = {
            writetime: 'cratDat', filedScore: 'adlSco', filedid: 'xtpgSeq', datagridUrl: '${baseurl}scorequery/queryAdl_result.do',
            ownParam: '&xtpgSeq=', formname: 'adldeleteForm', titlename: 'ADL评分'
          };
          params.queryParams = {
            "hspAdlInfCustom.emgSeq": comdata.emgSeq
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toAdlGde.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '3':
          var params = {
            writetime: 'cratDat', filedScore: 'zcddexpfSco', filedid: 'xtpgSeq', datagridUrl: '${baseurl}scorequery/queryFalloutbed_result.do',
            ownParam: '&xtpgSeq=', formname: 'falloutdeleteForm', titlename: '坠床跌倒评分'
          };
          params.queryParams = {
            "hspZcddexpfInfCustom.emgSeq": comdata.emgSeq
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toFalloutbedGde.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '6':
          var params = {
            writetime: 'cretDat', filedScore: 'riskSco', filedid: 'fallriskSeq', datagridUrl: '${baseurl}scorequery/queryFallRisk_result.do',
            ownParam: '&fallriskSeq=', formname: 'fallchilddeleteForm', titlename: '成人坠床跌倒评分'
          };
          params.queryParams = {
            "hspFallriskInfCustom.emgSeq": comdata.emgSeq,
            "hspFallriskInfCustom.fallRiskFlg": '2'
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/queryAdultFallRisk.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '7':
          var params = {
            writetime: 'cretDat', filedScore: 'riskSco', filedid: 'fallriskSeq', datagridUrl: '${baseurl}scorequery/queryFallRisk_result.do',
            ownParam: '&fallriskSeq=', formname: 'fallchilddeleteForm', titlename: '儿童坠床跌倒评分'
          };
          params.queryParams = {
            "hspFallriskInfCustom.emgSeq": comdata.emgSeq,
            "hspFallriskInfCustom.fallRiskFlg": '1'
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/queryChildFallRisk.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '4':
          var params = {
            writetime: 'nrsDat', filedScore: 'nrsSco', filedid: 'xtpgSeq', datagridUrl: '${baseurl}scorequery/queryNrs_result.do',
            ownParam: '&xtpgSeq=', formname: 'nrsdeleteForm', titlename: '疼痛评分'
          };
          params.queryParams = {
            "hspNrsInfCustom.emgSeq": comdata.emgSeq
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toNrsGde.do?emgSeq=" + comdata.emgSeq + '&typeSource=grade';
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '5':
          var params = {
            writetime: 'cratDat', filedScore: 'totSco', filedid: 'emgSeq', datagridUrl: '${baseurl}scorequery/queryGcs_result.do',
            ownParam: '&emgSeq=', formname: 'gcsDeleteForm', titlename: 'GCS评分'
          };
          params.queryParams = {
            "HspGcsInfCustom.gcsSeq": comdata.emgSeq
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toGcs.do?gcsSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case '8':
          var params = {
            writetime: 'crttime', filedScore: 'zyfxpfSco', filedid: 'zyfxpfSeq', datagridUrl: '${baseurl}scorequery/queryZyfxpf_result.do',
            ownParam: '&zyfxpfSeq=', formname: 'zyfxpfDeleteForm', titlename: '转运风险评分'
          };
          params.queryParams = {
            "hspZyfxpfInfCustom.emgSeq": comdata.emgSeq,
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toZyfxpf.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          var contentDiv = createFrame(mainUrl);
          $('#receitpDiv').html(contentDiv);
          break;
        case '9':
          var params = {
            writetime: 'cretDat', filedScore: 'zf', filedid: 'ddfxpgbSeq', datagridUrl: '${baseurl}scorequery/queryMorse_result.do',
            ownParam: '&ddfxpgbSeq=', formname: 'morseDeleteForm', titlename: 'Morse评分'
          };
          params.queryParams = {
            "hspDdfxpgbInfCustom.emgSeq": comdata.emgSeq,
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toMorseGde.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          var contentDiv = createFrame(mainUrl);
          $('#receitpDiv').html(contentDiv);
          break;
        case '10':
          var params = {
            writetime: 'cratDat', filedScore: 'zjpfZf', filedid: 'zjpfSeq', datagridUrl: '${baseurl}scorequery/queryZjpf_result.do',
            ownParam: '&zjpfSeq=', formname: 'zjpfDeleteForm', titlename: '镇静评分'
          };
          params.queryParams = {
            "hspZjpfInfCustom.emgSeq": comdata.emgSeq,
          };
          comdata.params = params;
          comdata._url = "${baseurl}scorequery/toZjpf.do?emgSeq=" + comdata.emgSeq;
          var mainUrl = "${baseurl}scorequery/tobasicPage.do?emgSeq=" + comdata.emgSeq;
          var contentDiv = createFrame(mainUrl);
          $('#receitpDiv').html(contentDiv);
          break;
        default:
          break;
      }
    }

    function chooseTshlPage(clickOne){
      //zyytshljld/toXwList.do
      var pagenum = clickOne.attr("pageval");
      switch (pagenum) {
        case '1':
          var mainUrl = "${baseurl}zyytshljld/toXwList.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
      }
    }

    //主菜单
    function choosePage(clickOne) {
      var pageType = clickOne.attr("pagetype"), pageIdx = clickOne.attr("pageIdx");
      window.sessionStorage.setItem("pageIdx", pageIdx);
      switch (pageType) {
        case 'rypgd':
          var pagenum = clickOne.attr("pageval");
          if(pagenum == '1'){
            createFrame('${baseurl}hzszyyjjd/toxtpgRypgd.do?emgSeq=' + comdata.emgSeq);
          }else{
            createFrame('${baseurl}hlpgb/queryjzcsrypgb.do');
          }
          break;
        case 'traumaRecord':
          createFrame('${baseurl}hlpgb/queryjzcsjlb.do?emgSeq=' + comdata.emgSeq);
          break;
        case 'xtpg':
          createFrame('${baseurl}hzszyyjjd/toxtpgXtpg.do');
          break;
        case 'bqhljld':
          createFrame('${baseurl}hzszyyjjd/toxtpgBqhljld.do');
          break;
        case 'heartRecord':
          createFrame('${baseurl}heartRecord/to_heartRecord.do');
          break;
        case 'glxx':
          var mainUrl = "${baseurl}icuPipe/toIcuPipeInfo.do?emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case 'twd':
          var mainUrl = "${baseurl}zyytpct/toRightTwdPage.do?sessionId=${sessionId}&flag=1&emgSeq=" + comdata.emgSeq;
          createFrame(mainUrl);
          break;
        case 'smtz':
          chooseSmtzPage(clickOne);
          break;
        case 'score':
          chooseScorePage(clickOne);
          break;
        case 'ws':
          var _tempNo = clickOne.attr("tempno"),
            _tempName = $.trim(clickOne.text());
          comdata.params = { tempno: _tempNo, tempname: _tempName };
          var mainUrl = "${baseurl}zyynrsconsent/documentRight.do";
          createFrame(mainUrl);
          break;
        case 'tsh':
          var _tempNo = clickOne.attr("tempno"),
            _tempName = $.trim(clickOne.text());
          comdata.params = { tempno: _tempNo, tempname: _tempName };
          var mainUrl = "${baseurl}zyynrsconsent/baseRightPage.do?emgSeq=" + comdata.emgSeq + "&tempno=" + _tempNo;
          createFrame(mainUrl);
          break;
        case 'hzjl':
          
          createFrame('${baseurl}qjs/queryhzdjhz2.do?emgSeqCr=' + comdata.emgSeq);
          break;
        case 'tshljld':
          chooseTshlPage(clickOne);
          break;
        default:
          break;
      }
    }

    //创建生成的 iframe 嵌入页面
    function createFrame(url) {
      // loading();
      var contentDiv = '<iframe id ="rightFrame" frameborder="0" scrolling="auto" src="' + url + '"  style="width: 100%;" onload="this.height= $(window).height() - 26"></iframe>';
      // removeLoading();
      $('#receitpDiv').html(contentDiv);
    }
    var vm = avalon.define({
      $id: 'xtpg',
      patientInformation: {
        pgbFlag: '',
        algHon: '2'
      }
    })

    function reload() {
      document.getElementById("rightFrame").contentWindow.reload();
    }

    function checkit(){
      var _url = encodeURI('http://${ippost}${baseurl}zyytpct/toRightTwdPage.do?emgSeq={"sessionId":"${sessionId}","emgSeq":"${emgSeq}"}');
      $('#openIe').attr('href','alert:'+_url);
    }

    function showError(){
      alert('show')
    }

    //加载datagrid
    $(function () {
      initPage();
    });

  </script>
  <!-- 切记所有页面下拉菜单都要写 pageIdx [按顺序] -->
  <div class="navDiv">
    <ul class="select_ul">
      <li class="select_li"><a href="#" class="specli">护理评估 <i class="iconBg"></i></a>
        <ul class="inside_ul">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="rypgd" pageval="1" href="javascript:;" pageIdx="1">入院护理评估单</a></li>
          <li><a class="pagebtn" pagetype="rypgd" pageval="2" href="javascript:;" pageIdx="2">急诊创伤入院评估表</a></li>
          <li><a class="pagebtn" pagetype="traumaRecord" pageval="2" pageIdx="3">急诊创伤记录表</a></li>
        </ul>
      </li>
      <li><a href="#" class="pagebtnparent navlia" pagetype="bqhljld" pageval="1" pageIdx="4">病情护理记录单</a></li>
      <li><a href="#" class="pagebtnparent navlia" pagetype="heartRecord" pageval="1" pageIdx="5">心肺复苏记录单</a></li>
      <li><div id="t1"><a href="#" class="pagebtnparent navlia" pagetype="twd" pageval="1" pageIdx="6">体温单</a></div></li>
      <li>
        <div id="t2">
          <a href='#' id="openIe" onclick="checkit()" class="pagebtnparent navlia" pagetype="twd2" pageval="1" pageIdx="7">体温单(跳转IE)</a>
        </div>
      </li>
      <li><a href="#" class="pagebtnparent navlia" pagetype="xtpg" pageval="1" pageIdx="8">系统评估</a></li>
      <li class="select_li"><a href="#" class="specli">评分查询 <i class="iconBg"></i></a>
        <ul class="inside_ul">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="score" pageval="1" href="javascript:;" pageIdx="9">Braden评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="2" href="javascript:;" pageIdx="10">ADL评分</a></li>
          <!-- <li><a class="pagebtn" pagetype="score" pageval="3" href="javascript:;">坠床跌倒评分</a></li> -->
          <li><a class="pagebtn" pagetype="score" pageval="6" href="javascript:;" pageIdx="11">成人坠床跌倒评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="7" href="javascript:;" pageIdx="12">儿童坠床跌倒评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="4" href="javascript:;" pageIdx="13">疼痛评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="5" href="javascript:;" pageIdx="14">GCS评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="8" href="javascript:;" pageIdx="15">转运风险评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="9" href="javascript:;" pageIdx="16">Morse跌倒评分</a></li>
          <li><a class="pagebtn" pagetype="score" pageval="10" href="javascript:;" pageIdx="17">镇静评分</a></li>
        </ul>
      </li>
      <!-- <li class="select_li"><a href="#" class="specli">特殊护理记录单 <i class="iconBg"></i></a>
        <ul class="inside_ul">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="tshljld" pageval="1" href="javascript:;" pageIdx="33">洗胃护理记录单</a></li>
          <li><a class="pagebtn" pagetype="tshljld" pageval="2" href="javascript:;" pageIdx="34">机械通气护理记录单</a></li>
        </ul>
      </li> -->
      <!-- <li class="select_li"><a href="#" class="specli">趋势图 <i class="iconBg"></i></a>
        <ul class="inside_ul">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="smtz" pageval="1" href="javascript:;">生命体征趋势图</a></li>
          <li><a class="pagebtn" pagetype="smtz" pageval="2" href="javascript:;">评分趋势图</a></li>
        </ul>
      </li> -->
      <!-- <li><a href="#" class="pagebtnparent navlia" pagetype="glxx" pageval="1">管路信息</a></li> -->
      <li class="select_li"><a href="#" class="specli">护理文书 <i class="iconBg"></i></a>
        <ul class="inside_ul inside_ulB">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2029" pageIdx="18">急诊科脑卒中溶栓流程核查表</a></li>
          <li><a class="pagebtn" href="javascript:;" pagetype="ws" tempno="2030" pageIdx="19">胸痛时间管理记录表</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="32" href="javascript:;" tempno="2032" pageIdx="20">住院须知</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="33" href="javascript:;" tempno="2033" pageIdx="21">压力性损伤高危风险知情同意书</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2035" pageIdx="22">经外周穿刺中心静脉（PICC）置管术知情同意书</a></li>
         <!--  <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2008">预防病员坠床/跌倒告知书</a></li> -->
          <!-- <li><a class="pagebtn" href="javascript:;">危重患者转运记录单</a></li> -->
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2034" pageIdx="23">自定义知情同意书</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2036" pageIdx="24">浙江医院急诊创伤诊疗流程核查表</a></li>	
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2037" pageIdx="25">保护性约束知情同意书</a></li>	
          <li class="longli"><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2038" pageIdx="26">急诊胸痛留观患者提前终止观察及治疗离院知情同意书</a></li>	
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2039" pageIdx="27">预防病原坠床/跌倒告知书</a></li>	
        </ul>
      </li>
      <li class="select_li"><a href="#" class="specli">交接单 <i class="iconBg"></i></a>
        <ul class="inside_ul inside_ulB">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <!-- <li><a class="pagebtn" pagetype="tsh" pageval="1" href="javascript:;" tempno="2024">导管病人交接记录单</a></li>
          <li><a class="pagebtn" pagetype="tsh" pageval="2" href="javascript:;" tempno="2023">急诊病人交接记录单</a></li>
          <li><a class="pagebtn" pagetype="tsh" pageval="3" href="javascript:;" tempno="2025">手术患者交接记录单</a></li>
          <li><a class="pagebtn" pagetype="tsh" pageval="5" href="javascript:;" tempno="2026">血液透析病人院内交接记录单</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="1" href="javascript:;" tempno="2001">院内病人交接记录单</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="27" href="javascript:;" tempno="2027">危重患者外出转运单</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2029">急诊科脑卒中溶栓流程核查表</a></li> -->
          
          <li><a class="pagebtn" pagetype="tsh" pageval="6" href="javascript:;" tempno="2042" pageIdx="32">介入患者护理交接单</a></li>
          <li><a class="pagebtn" pagetype="tsh" pageval="4" href="javascript:;" tempno="2028" pageIdx="30">危重患者转运记录单</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2040" pageIdx="28">急诊室抢救、观察病人离科交接记录单</a></li>	
          <li><a class="pagebtn" pagetype="ws" pageval="29" href="javascript:;" tempno="2041" pageIdx="29">手术患者交接单</a></li>
        </ul>
      </li>
      <!-- <li class="select_li"><a href="#" class="specli">介入知情同意 <i class="iconBg"></i></a>
        <ul class="inside_ul inside_ulB">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="ws" pageval="2" href="javascript:;" tempno="2002">颈动脉狭窄球囊成形+支架植入术</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="3" href="javascript:;" tempno="2003">脑血管造影术+颈内动脉海绵窦瘘封堵术</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="4" href="javascript:;" tempno="2004">脑血管造影术+支架辅助动脉瘤栓塞术</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="5" href="javascript:;" tempno="2005">脑血管造影术:自发性蛛网膜下腔出血-颅内动脉瘤</a></li>
          <li class="longli"><a class="pagebtn" pagetype="ws" pageval="6" href="javascript:;" tempno="2006">脑血管造影术:左侧基底节区脑出血-高血压-脑动脉瘤栓塞术后</a></li>
        </ul>
      </li>
      <li class="select_li"><a href="#" class="specli">其他 <i class="iconBg"></i></a>
        <ul class="inside_ul">
          <iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
          <li><a class="pagebtn" pagetype="ws" pageval="7" href="javascript:;" tempno="2007">保护性约束知情同意书</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="8" href="javascript:;" tempno="2008">跌倒告知书</a></li>
          <li class="longli"><a class="pagebtn" pagetype="ws" pageval="9" href="javascript:;" tempno="2009">急性缺血性卒中rt-PA+静脉溶栓治疗知情同意书</a></li>
            //  <li><a class="pagebtn" pagetype="ws" pageval="10" href="javascript:;" tempno="2010">急性胸痛患者时间管理表</a></li>
            // <li><a class="pagebtn" pagetype="ws" pageval="11" href="javascript:;" tempno="2011">急性胸痛患者诊疗时间记录表(老的)</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="18" href="javascript:;" tempno="2018">急性胸痛患者诊疗时间记录表</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="12" href="javascript:;" tempno="2012">留置胃管</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="13" href="javascript:;" tempno="2013">气管插管</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="14" href="javascript:;" tempno="2014">气管插管和机械通气</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="15" href="javascript:;" tempno="2015">深静脉留置</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="16" href="javascript:;" tempno="2016">外出检查知情同意书</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="17" href="javascript:;" tempno="2017">洗胃谈话记录</a></li>
          <li><a class="pagebtn" pagetype="ws" pageval="19" href="javascript:;" tempno="2019">急性胸痛患者时间管理表</a></li>
        </ul>
      </li> -->
      <li><a href="#" class="pagebtnparent navlia" pagetype="hzjl" pageval="1" pageIdx="31">会诊记录</a></li>
    </ul>
  </div>
  <form>
    <div class="receitpDiv xtpgxqDiv queryTabs" id="receitpDiv">
      <div class="receitpContent">
      </div>
    </div>
  </form>
</body>

</html>