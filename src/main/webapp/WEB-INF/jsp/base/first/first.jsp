<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>

<head>
	<title>${hospitalPlatformName}</title>
	<base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="GENERATOR" content="MSHTML 9.00.8112.16540">
	<link rel="shortcut icon" type="image/x-icon" href="images/hzszyyhems/favicon.gif">
	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="css/hzszyyhems/first.css?v=${versionDay}">
	<link rel="stylesheet" type="text/css" href="lib/at-font/style.css?v=${versionDay}">
	<link rel="stylesheet" type="text/css" href="css/edpc/iconfont.css">
</head>

<body class="easyui-layout first" scroll="no">
	<div border="false" split="false" region="north" class="top-bg">
		<div class="first-bg">
			&nbsp;&nbsp;<img src="images/hzszyyhems/logo.png" /> <!-- <img src="images/hzszyyhems/libanglogo.png" style="width:54px;height:27px;"/> --><span class="first-l"> ${hospitalPlatformName} </span> <span
				class="first-r"> <!-- <a href="javascript:queryDangerMsg()">
          <span class="isShowMessage">消息提醒
            <img src="images/hems/first/tip_icon.png" class="msgIcon"/>
          </span>
        </a> -->
			<img class="iconfirst iconnone" src="images/hems/first/personal2.png"><span class="showUser">${activeUser.usrname}(${activeUser.usrno}),欢迎您！</span>
				<a title="回到首页" href="javascript:toFirst()" id="#" class="index-btn">【回到首页】</a> <a title="密码设置" ref="modifypwd"
				href="javascript:updatepwd()" id="modifypwd" class="repwd-btn">【密码设置】</a> <a title="退出" id="loginOut"
				href="javascript:logout()" class="restart-btn">【退出】</a>
			</span> <a title="急诊大屏" class="bigScreen" href="report/querybigscreen.do" target="_Blank"><img
				src="images/common/bigScreen/bigScreen.png"></a>
		</div>
		<div class="four-level-menu" ms-controller="menuWrap">
			<ul class="first-menu">
				<iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
				<li class="first-menu-li" ms-repeat="menuList" ms-mouseover="setNextMenuDisplay($index, 'show')"
					ms-mouseout="setNextMenuDisplay($index, 'hide')"><i ms-class="my-icon nav-icon at-fa-{{el.icon}}"></i> <a
					class="first-link" ms-click="firstLineClick(this)" ms-attr-reloadtype="el.reloadType" ms-attr-ref="el.menuid"
					ms-attr-rel="{{el.mainurl}}?moduleid={{el.menuid}}" ms-attr-icon="el.icon" ms-attr-title="el.menuname"
					ms-attr-hideUrl="el.mainurl">{{el.menuname}}</a>
					<ul class="second-menu" ms-if="el.menus && !el.mainurl">
						<iframe frameborder="0" scrolling="no" class="iframeNo"></iframe>
						<li ms-repeat-item="el.menus"><a href="javascript:;" class="second-link" ms-attr-reloadtype="item.reloadType"
							ms-attr-ref="item.menuid" ms-attr-rel="{{item.url}}?moduleid={{item.menuid}}" ms-attr-icon="item.icon"
							ms-attr-title="item.menuname" ms-click="secondLineClick(this)" ms-mouseover="isHoverMenu(this)"
							ms-attr-hideSubUrl="item.url"> {{item.menuname}} </a></li>
					</ul></li>
			</ul>
		</div>
	</div>
	<div class="leftInfoMsg"></div>
	<div class="tabsdiv" id="mainPanle" region="center">
		<div id="tabs" class="easyui-tabs" border="false" fit="true"></div>
	</div>
	<div id="mm" class="easyui-menu menudiv">
		<div id="Div1" name="1">关闭</div>
		<!--  <div id="mm-tabcloseall" name="2">
          全部关闭
      </div> -->
		<div id="mm-tabcloseother" name="3">关闭其他</div>
		<!-- <div class="menu-sep">
        </div> -->
		<div id="mm-tabcloseright" name="4">关闭右侧标签</div>
		<div id="mm-tabcloseleft" name="5">关闭左侧标签</div>
		<div id="mm-tabreload" name="6">刷新</div>
	</div>
	<input type="hidden" id="renshu" name="renshu">
	
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script type="text/javascript" src="lib/layer/layer.js" ></script>
	<script type="text/javascript" src="Lodop6.216/LodopFuncs.js"></script>
	<script type="text/javascript" src="js/websocket/reconnecting-websocket.min.js"></script>
	<script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>
	<script type="text/javascript">
	    var emergencyTotal = 0;
	    var slowTotal = 0;
	    var websocket = null;
	    var locate = window.location;
	    var webUrl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketHz.do";
	    
	    function buildSocket(sourceType) {
	      var options = {
	        timeoutInterval: 30000,
	      }
	      if (sourceType === 'overTime') {
	        socketUrl = webUrl;
	      } else {
	        socketUrl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketWJZ.do";
	      }
	      websocket = new ReconnectingWebSocket(socketUrl, [], options);
	      //连接发生错误的回调方法
	      websocket.onerror = function (event) {
	        console.log("WebSocket连接错误");
	        if (!"${sessionScope.activeUser}") {
	          window.location.href = "login.do";
	        }
	      };
	
	      //连接成功建立的回调方法
	      websocket.onopen = function () {
	        console.log("WebSocket连接成功");
	      };
	
	      //接收到消息的回调方法
	      websocket.onmessage = function (event) {
	        var info = $.parseJSON(event.data);
	        if (sourceType === 'overTime') {
	          if (info.type == '1') {
	            assignment(info.sysdata);
	          }
	        } else {
	          if (info.type == '1') {
	            if (publicFun.getItem('dangerBoxList') && publicFun.getItem('dangerBoxList').length > 0) {
	              return;
	            }
	            publicFun.setItem('dangerBoxList', info.sysdata.icuErInfoList);
	            _dangerList = publicFun.getItem('dangerBoxList');
	            if (_dangerList.length > 0) {
	              timingBox()
	            }
	          }
	        }
	      };
	
	      //连接关闭的回调方法
	      websocket.onclose = function (event) {
	        console.log("WebSocket连接关闭");
	      };
	
	      //关闭WebSocket连接
	      function closeWebSocket() {
	        websocket.close();
	      }
	
	      //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
	      window.onbeforeunload = function () {
	        closeWebSocket();
	      };
	    }
	
	    function judgeVer() {
	      var userAgent = navigator.userAgent; //取得浏览器的userAgent字符串  
	      var isIE = userAgent.indexOf("compatible") > -1 && userAgent.indexOf("MSIE") > -1; //判断是否IE<11浏览器  
	      var isIE11 = userAgent.indexOf('Trident') > -1 && userAgent.indexOf("rv:11.0") > -1;
	      var browser = {
	        versions: function () {
	          return {
	            trident: userAgent.indexOf('Trident') > -1, //IE内核
	          };
	        }()
	      }
	      if (browser.versions.trident && !isIE11) {
	        var isEdge = userAgent.indexOf("Edge") > -1; //判断是否IE的Edge浏览器
	        if (!isEdge) {
	          publicFun.alert('浏览器版本太低，请切换至IE11或者谷歌浏览器')
	        }
	      }
	    }
	    function assignment(sysdata) {
	      var flag = sysdata.flag;
	      switch (flag) {
	        case 'emergencyList':
	          if (sysdata.emergencyList) {
	            emergencyTotal = sysdata.emergencyList;
	          }
	          break;
	        case 'slowList':
	          if (sysdata.slowList) {
	            slowTotal = sysdata.slowList;
	          }
	          break;
	        case 'all':
	          if (sysdata.emergencyList) {
	            emergencyTotal = sysdata.emergencyList;
	          }
	          if (sysdata.slowList) {
	            slowTotal = sysdata.slowList;
	          }
	          break;
	        default:
	          break;
	      }
	      var blinkIntervalA;
	      clearInterval(blinkIntervalA);
	    }
	
	
	    var currentTabIndex, currentTabName;
	    var clickVal;
	    var tabOnSelect = function (title) {
	      //根据标题获取tab对象
	      var b = false;
	      var tabs = $('#tabs').tabs('tabs');
	      for (var i = 0; i < tabs.length; i++) {
	        if (tabs[i].title == title) {
	          b = true;
	        }
	      }
	      var currTab = $("#tabs").tabs("getTab", title);
	      currTab.title = title;
	      var iframe = $(currTab.panel("options").content); //获取标签的内容
	      var src = iframe.attr("src"); //获取iframe的src
	      var reloadType = iframe.attr("reloadtype");
	      var ifram = currTab.find('iframe')[0];

	      //当重新选中tab时将ifram的内容重新加载一遍，目的是获取当前页面的最新内容
	      if (src && b) {
	        // 0 是刷新局部； 1 是刷新页面； 3 是混合 [已去掉]
	        if (reloadType == "0" || title.indexOf("胸痛患者详情") != -1 || title.indexOf("卒中患者详情") != -1) {
	          if (ifram.contentWindow.reload) {
	            ifram.contentWindow.reload();
	          } else {
	            // ifram.contentWindow.location.reload(); 
	          }
	        } else {
	          $("#tabs").tabs("update", {
	            tab: currTab,
	            options: {
	              content: createFrame(src, reloadType) //ifram内容
	            }
	          });
	        }
	        clickVal = 0;
	        $('.second-link').removeClass('hover');
	        var _navName = document.getElementsByClassName('second-link'),
	          _firstNav = document.getElementsByClassName('first-link');
	        for (var i = 0; i < _navName.length; i++) {
	          if (_navName[i].title == title) {
	            var current = _navName[i].parentNode.parentNode.parentNode.children[1];
	            $('.first-link').removeClass('hover');
	            $(current).addClass('hover');
	            $(_navName[i]).addClass('hover');
	          }
	        }
	        for (var i = 0; i < _firstNav.length; i++) {
	          if (_firstNav[i].title == title) {
	            $('.first-link').removeClass('hover');
	            $(_firstNav[i]).addClass('hover');
	          }
	        }
	      }
	    };
	    //处理跳转链接中的跳转类型
	    function handleRedirect(){
	    	//若有跳转地址
	    	if(window.location.href){
	    		var pathName = window.location.pathname;
			    var afterUrl =  window.location.search.substring(1);
			    //如果链接是跳转到胸痛中心
			    if(afterUrl.split('=')[1] === 'cpcHome'){
			      addTab('胸痛中心', 'cpc/toXtHomePage.do', 'icon icon-emergency-record');
			    }
			    //如果链接是跳转到胸痛上报列表页
			    if(afterUrl.split('=')[1] === 'cpcReport'){
			      addTab('胸痛患者列表', 'cpc/toXthzListPage.do', 'icon icon-emergency-record');
			    }
			    //如果链接是跳转到胸痛随访管理
				if(afterUrl.split('=')[1] === 'queryfuv'){
					addTab('胸痛随访管理', 'followup/queryfuv.do', 'icon icon-emergency-record');
				}
	    	}
	    };
	    // 通过ajax请求菜单
	    function generateMenu() {
	      var _isHasOtherMenu = false;
	      publicFun.httpServer({ url: 'usermenu.do' }, {}, function (data) {
	        var _allDataMenuList = data.menus, _newMenus = [];
	        var _moduleid = '', firstIndexUrl = '${firstIdnexUrl}', _hisIndex = '${hisIndex}';
	        for (var i = 0; i < _allDataMenuList.length; i++) {
	          if (_allDataMenuList[i].mainurl) {
	            if (firstIndexUrl.search(_allDataMenuList[i].mainurl) != -1) {
	              _moduleid = 'moduleid=' + _allDataMenuList[i].menuid
	            }
	          } else {
	            for (var j = 0; j < _allDataMenuList[i].menus.length; j++) {
	              if (firstIndexUrl.search(_allDataMenuList[i].menus[j].url) != -1) {
	                _moduleid = 'moduleid=' + _allDataMenuList[i].menus[j].menuid
	              }
	            }
	          }
	          var _menuName = _allDataMenuList[i].menuname, 
	          // notShowMenuList = ['预检分诊','护士站','医生站','统计报表','质控报表','电子大屏','PDA','门诊输液系统'];
	          notShowMenuList = ['护士站','医生站','统计报表','质控报表','电子大屏','PDA','门诊输液系统','随访管理'];
	        	  //['胸痛质控', 'PDA', '卒中中心', '创伤中心', '胸痛中心'];
	          if ($.inArray(_menuName, notShowMenuList) < 0) {
	            _newMenus.push(_allDataMenuList[i])
	          } else {
	            _isHasOtherMenu = true;
	          }
	        }
	        if (_isHasOtherMenu) {
	          // var _otherMenuList = ['胸痛中心', '卒中中心', '创伤中心'];
	          /*
	          var _otherMenuList = ['胸痛中心'];
	          _otherMenuList.forEach(function (item) {
	            _newMenus.push({
	              menus: [{icon: 'register_hos', menuname: item, mainurl: ''}],
	              icon: "register_hos",
	              menuname: item,
	              mainurl: 'mainurl'
	            })
	          })
	          */
	        }
	        firstVm.menuList = _newMenus;
	        var index = '';
	        if (firstIndexUrl.indexOf('?') != -1) {
	          index = firstIndexUrl + '&' + _moduleid;
	        } else {
	          index = firstIndexUrl + '?' + _moduleid;
	        }
	        var _selectedReloadType = ''; // 默认首页 刷新设置
	        if (index.indexOf('reloadtype=0') != -1) {
	          _selectedReloadType = '0'
	        } else {
	          _selectedReloadType = '1'
	        }
	        index = encodeURI(index);
	        //加载欢迎页面
	        $('#tabs').tabs('add', {
	          title: '${firstTitleName}',
	          content: createFrame(index, _selectedReloadType)
	        }).tabs({
	          //当重新选中tab时将ifram的内容重新加载一遍
	          onSelect: tabOnSelect,
	          onContextMenu: function (e, title, index) {
	            if (title.indexOf('门诊病历记录') != -1) {
	              $('#Div1').hide()
	            } else {
	              $('#Div1').show()
	            }
	            // 去除首页，故而-1；
	            currentTabIndex = index - 1;
	            currentTabName = title;
	            e.preventDefault();
	            if (index > 0) {
	              $('#mm').menu('show', {
	                left: e.pageX,
	                top: e.pageY
	              }).data("tabTitle", title);
	            }
	          }
	        });
	        
	        //处理胸痛、卒中、创伤等模块跳转
	        //放在获取menu的方法中调用是为了防止tab页顺序出现先胸痛后急诊大屏（欢迎页）的情况
	        handleRedirect();
	        
	        // his 嵌入电子病历 是否默认新增一个tab
	        if (_hisIndex) {
	          var moduleid_mz = '';
	          if (_hisIndex.indexOf('queryjzmzbl') != -1) {
	           for (var i = 0; i < _allDataMenuList.length; i++) {
		          for (var j = 0; j < _allDataMenuList[i].menus.length; j++) {
		             if (_hisIndex.search(_allDataMenuList[i].menus[j].url) != -1) {
		              moduleid_mz = 'moduleid=' + _allDataMenuList[i].menus[j].menuid
		            }
		          }
	           } 
	            addTab('${hisTitle}', encodeURI(_hisIndex + '&' + moduleid_mz), '', 0);
	          } else {
	            addTab('${hisTitle}', encodeURI(_hisIndex), '', 0);
	          }
	        }
	        $("#mm").menu({
	          onClick: function (item) {
	            closeTab(this, item.name);
	          }
	        });
	      }, function (msg) {
	        publicFun.alert('菜单加载异常!');
	      })
	    }
	
	    var _dangerList = [];
		$(function() { //预加载方法
			// 一进去页面就清空危重List缓存
			if (publicFun.getItem('dangerBoxList') && publicFun.getItem('dangerBoxList').length > 0) {
				publicFun.removeItem("dangerBoxList");
			}
			var isDisplay_polling = '${isdisplay_polling}';
			if (isDisplay_polling == 1) {
				buildSocket('overTime');
			}
			//	buildDangerSocket();
			window.sessionStorage.setItem('ownIp', '${sessionScope.activeUser.ip}');
			generateMenu();
			judgeVer(); // 判断浏览器是否是ie11以下版本
			$.ajax({
				url : 'getAddrInfo.do',
				type : 'post',
				dataType : 'json',
				data : {},
				success : function(res) {
					var addrInfoList = res['resultInfo']['sysdata'];
					if (addrInfoList) {
						publicFun.setItem('addrInfoList', addrInfoList);
					}
				}
			})
		});
	
		// 危急值弹框
		function buildDangerSocket() {
	      publicFun.httpServer({ url: 'icuer/isMachineJudgment.do' }, {}, function (res) {
	        if (!res.isMachineJudgment) {
	          return;
	        }
	        buildSocket('danger');
	      })
	    }
	
	    function getLocalDangerList() {
	      _dangerList = publicFun.getItem('dangerBoxList');
	      if (_dangerList.length > 0) {
	        _dangerList.splice(0, 1);
	        publicFun.setItem('dangerBoxList', _dangerList);
	      }
	      _dangerList = publicFun.getItem('dangerBoxList');
	      return _dangerList;
	    }
	
	    var isCloseBox = true;
	    function timingBox() {
	      if (isCloseBox) {
	        window.top.createmodalwindow("危急值结果确认", 600, 300, 'hzszyyemg/confirmCritical.do', '', false);
	        isCloseBox = false;
	      }
	    }
	    //退出系统方法
	    function logout() {
	      createmodalwindow("退出系统", 300, 143, 'user/dropOut.do');
	    }
	
	    //修改密码
	    function updatepwd() {
	      createmodalwindow("修改密码", 510, 240, 'user/updatepwd.do');
	    }
	
	    //删除Tabs
	    function closeTab(menu, type) {
	      var tabs = $('#tabs').tabs('tabs');
	      var tabNameList = [];
	      switch (type) {
	        case "1": //关闭当前
	          $('#tabs').tabs('close', currentTabName);
	          // $("#tabs .tabs-selected .tabs-close").click();
	          break;
	        // case "2": //全部关闭
	        //     for (var i = 1; i < tabs.length; i++) {
	        //         tabNameList.push(tabs[i]['title'])
	        //     }
	        //     $.each(tabNameList, function(idx, val) {
	        //         $('#tabs').tabs('close', val);
	        //     });
	        //     break;
	        case "3": //除此之外全部关闭
	          // for (var i = 1; i < tabs.length; i++) {
	          //     tabNameList.push(tabs[i]['title'])
	          // }
	          // $.each(tabNameList, function(idx, val) {
	          //     if (idx != currentTabIndex) {
	          //         $('#tabs').tabs('close', val);
	          //     }
	          // });
	          for (var i = currentTabIndex + 2; i < tabs.length; i++) {
	            tabNameList.push(tabs[i]['title']);
	          }
	          $.each(tabNameList, function (idx, val) {
	            $('#tabs').tabs('close', val);
	          });
	          var tabNameList2 = [];
	          for (var j = 1; j <= currentTabIndex; j++) {
	            tabNameList2.push(tabs[j]['title']);
	          }
	          $.each(tabNameList2, function (idx, val) {
	            $('#tabs').tabs('close', val);
	          });
	          break;
	        case "4": //当前侧面右边
	          // $("#tab .tab-close:gt(indexTab)").click();
	          for (var i = currentTabIndex + 2; i < tabs.length; i++) {
	            tabNameList.push(tabs[i]['title']);
	          }
	          $.each(tabNameList, function (idx, val) {
	            $('#tabs').tabs('close', val);
	          });
	          break;
	        case "5": //当前侧面左边
	          for (var i = 1; i <= currentTabIndex; i++) {
	            tabNameList.push(tabs[i]['title']);
	          }
	          $.each(tabNameList, function (idx, val) {
	            $('#tabs').tabs('close', val);
	          });
	          break;
	        case "6": //当前侧面左边
	          var currTab = $("#tabs").tabs("getTab", currentTabName);
	          if (currTab) {
	            currTab.panel('refresh');
	          }
	          break;
	      }
	    }
	
	    function toFirst() {
	      window.location.href = 'first.do';
	    }
	
	    function queryDangerMsg() {
	      parent.opentabwindow('危急值消息查询', 'icuer/toErInfo.do?moduleid=' + 'c408dbf33d304f4e826761380d8a044f');
	    }
	
	    var firstVm = avalon.define({
	      $id: 'menuWrap',
	      menuList: [],
	      currentUser: '${sessionScope.activeUser.usrno}',
	      currentCheck: false,
	      setNextMenuDisplay: function (idx, disType) {
	        if (disType === 'show') {
	          $('.first-menu-li').find(".first-link").removeClass('hover');
	          $('.first-menu-li').eq(idx).find(".first-link").addClass('hover');
	          // $('.first-menu-li').find(".second-menu").stop(true, false).fadeOut(300);
	          // $('.first-menu-li').eq(idx).find(".second-menu").stop(true, false).fadeIn(300);
	          $('.first-menu-li').find(".second-menu").hide();
	          $('.first-menu-li').eq(idx).find(".second-menu").show();
	        } else {
	          if (!firstVm.currentCheck) {
	            $('.first-menu-li').eq(idx).find(".first-link").removeClass("hover");
	          }
	          // $('.first-menu-li').eq(idx).find(".second-menu").stop(true, false).fadeOut(300);
	          $('.first-menu-li').eq(idx).find(".second-menu").hide();
	        }
	      },
	      subMenuShow: function (idx) {
	        if (!$('.first-menu-li').eq(idx).find(".first-link").hasClass('hover')) {
	          firstVm.setNextMenuDisplay(idx, 'show')
	        } else {
	          firstVm.setNextMenuDisplay(idx, 'hide')
	        }
	      },
	      firstLineClick: function (current) {
	        if ($(current).attr('hideUrl')) {
	          var icon = 'icon ' + $(current).attr('icon');
	          // var reloadType = $(current).attr('reloadtype');
	          var reloadType = '0'; // 一级菜单默认不刷新
	          clickVal = reloadType;
	          // if ($(current).attr('hideUrl') === 'report/querybigscreen.do') {
	          // 	window.open('report/querybigscreen.do');
	          // } else {
	          // 	addTab(current.title, current.rel, icon, reloadType);
	          // }
	          
	          addTab(current.title, current.rel, icon, reloadType);
	          firstVm.currentCheck = true;
	          $(current).addClass('hover');
	          
	        }
	      },
	      secondLineClick: function (current) {
	        var icon = 'icon ' + $(current).attr('icon');
	        var reloadType = $(current).attr('reloadtype');
	        clickVal = reloadType;
	        if ($(current).attr('hideSubUrl') === 'report/querybigscreen.do') {
	          window.open('report/querybigscreen.do');
	        } else if ($(current).attr('hideSubUrl') === 'zyyqjs/qjsScreen.do') {
	          window.open('zyyqjs/qjsScreen.do');
	        } else {
	          addTab(current.title, current.rel, icon, reloadType);
	        }
	        $('.second-menu').hide();
	        firstVm.currentCheck = true;
	        $('.second-link').removeClass('hover');
	        $(current).addClass('hover');
	      },
	      isHoverMenu: function (current) {
	        $('.second-link').removeClass('hover');
	        $(current).addClass('hover');
	      }
	    })
  </script>
</body>

</html>
