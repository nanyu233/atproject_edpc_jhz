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
  <title>输液管理</title>
  <script type="text/javascript" charset="utf-8">
    var _emgSeq = '${emgSeq}';
    var comdata = { cstNam: '${cstNam}', emgSeq: '${emgSeq}', baseUrl: '${baseurl}', username: '${sessionScope.activeUser.usrname}' };
  </script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="xtpg">
  <div class="navDiv">
    <ul class="select_ul">
      <li><a class="pagebtnparent navlia" pageType="docCheck" pageVal="1">医嘱核对</a></li>
      <li><a class="pagebtnparent navlia" pageType="listGenerate" pageVal="1">执行单打印</a></li>
      <li><a class="pagebtnparent navlia" pageType="adEcConfirm" pageVal="1">医嘱执行确认</a></li>
      <li><a class="pagebtnparent navlia" pageType="adviceQuery" pageVal="1">医嘱查询</a></li>
      <!-- <li><a class="pagebtnparent navlia" pageType="psManager" pageVal="1">皮试管理</a></li> -->
    </ul>
  </div>
  <form>
    <div class="receitpDiv xtpgxqDiv queryTabs" id="receitpDiv">
      <div class="receitpContent">
      </div>
    </div>
  </form>
  <script type="text/javascript">
    var pageType = '';
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

    //初始化
    function initPage() {
      // debugger
      if (parent.isCheckFormList) { // 判断是否在从列表点进来
        var pageTypeText = window.sessionStorage.getItem('pageMgr');
        if (pageTypeText) {
          $("[pageType='" + pageTypeText + "']").addClass('active');
          choosePage($("[pageType='" + pageTypeText + "']"));
        } else {
          $("[pageType='docCheck']").addClass('active');
          choosePage($("[pageType='docCheck']"));
        }
      } else {
        // publicFun.removeItem('pageMgr');
        $("[pageType='docCheck']").addClass('active');
        choosePage($("[pageType='docCheck']"));
      }
      clickPageBtn();
      $('.select_ul .select_li').hover(function () {
        $(this).addClass("inHover");
        $(this).children('ul.inside_ul').show();
      }, function () {
        $(this).removeClass("inHover");
        $(this).children('ul.inside_ul').hide()
      });
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

    //主菜单
    function choosePage(clickOne) {
      // getBasicMsg();
      var pageTypeText = clickOne.attr("pageType");
      window.sessionStorage.setItem("pageMgr", pageTypeText);
      switch (pageTypeText) {
        case 'docCheck':
          createFrame('${baseurl}cfxx/toDocAdcCheck.do?emgSeq=${emgSeq}');
          break;
        case 'listGenerate':
          createFrame('${baseurl}cfxx/toListGenerate.do?emgSeq=${emgSeq}');
          break;
        case 'adEcConfirm':
          createFrame('${baseurl}cfxx/adEcConfirm.do?emgSeq=${emgSeq}');
          break;
        case 'adviceQuery':
          createFrame('${baseurl}cfxx/adviceQuery.do?emgSeq=${emgSeq}');
          break;
        default:
          // publicFun.alert('功能正在开发中');
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
    function reload() {
      document.getElementById("rightFrame").contentWindow.reload();
    }

    var basicMsg = {}; // 向其他页面传递的基本信息
    function getBasicMsg () {
      publicFun.httpServer({ url: '${baseurl}cfxx/getEmgInfData.do' }, { emgSeq: '${emgSeq}' }, function (res) {
        if (res.type == '1') {
          basicMsg = res.sysdata.hspemginfCustom;
        }
      })
    }
    // 加载 datagrid
    $(function () {
      // getBasicMsg();
      initPage()
    });
  </script>
</body>

</html>