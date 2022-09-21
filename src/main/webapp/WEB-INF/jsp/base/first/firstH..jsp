<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>

<head>
	<title>${hospitalPlatformName}</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="GENERATOR" content="MSHTML 9.00.8112.16540">
	<link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">

	<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/nav.css??98">
	<link rel="stylesheet" type="text/css" href="${baseurl}lib/at-font/style.css??09">
	<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
	<script src="${baseurl}lib/layer/layer.js" type="text/javascript"></script>
	<script type="text/javascript" src="${baseurl}/js/subpageJs/hzszyyhospital/nav.js"></script>
	<script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
	<script src="${baseurl}js/websocket/reconnecting-websocket.min.js"></script>
	<script type="text/javascript">
		var emergencyTotal = 0;
		var slowTotal = 0;
		var websocket = null;
		var locate = window.location;
		var weburl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketHz.do	";

		function buildSocket() {
			var options = {
				timeoutInterval: 30000,
			}
			websocket = new ReconnectingWebSocket(weburl, [], options);
			//连接发生错误的回调方法
			websocket.onerror = function (event) {
				console.log("WebSocket连接错误");
				if (!"${sessionScope.activeUser}") {
					window.location.href = "${baseurl}login.do";
				}
			};

			//连接成功建立的回调方法
			websocket.onopen = function () {
				console.log("WebSocket连接成功");
			};

			//接收到消息的回调方法
			websocket.onmessage = function (event) {
				var info = $.parseJSON(event.data);
				console.log(info);
				if (info.type == '1') {
					assignment(info.sysdata);
				}
			};

			//连接关闭的回调方法
			websocket.onclose = function (event) {
				console.log(event);
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
			if (slowTotal + emergencyTotal > 0) {
				$('#notifyMsg').html(slowTotal + emergencyTotal).css({ display: "block" });
				blinkIntervalA = setInterval(function () {
					$("#msg_alert").stop().animate({ opacity: 0 }, 500).animate({ opacity: 1 }, 500);
				}, 1000)
			} else {
				$('#notifyMsg').html(slowTotal + emergencyTotal).css({ display: "none" });
				$("#msg_alert").stop(true, true).css('opacity', '1');
			}
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
				if (reloadType == "0" || (reloadType == "3" && clickVal == "0")) {
					// ifram.contentWindow.reload();
					if (ifram.contentWindow.reload) {
						ifram.contentWindow.reload();
					} else {
						ifram.contentWindow.location.reload();
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
				$('.subMenu a').removeClass('a-hover');
				var _navName = document.getElementsByClassName('subMenuA');
				for (var i = 0; i < _navName.length; i++) {
					if (_navName[i].innerText == title) {
						var current = _navName[i].parentNode.parentNode.parentNode.children[0];
						// _itemClick(_navName[i].parentNode.parentNode.parentNode.children[0]);
						if (!$('.nav').hasClass('nav-mini')) {
							$('.nav-item').children('ul').hide();
							$(current).next('ul').show();
							$(current).parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
						}
						$('i.nav-more').removeClass('at-fa-down').addClass('at-fa-put-away');
						$(current).find('i.nav-more').removeClass('at-fa-put-away').addClass('at-fa-down');
						$('.nav-item a.nav-a').removeClass('nav-hover');
						$(current).addClass('nav-hover');
						$(_navName[i]).addClass('a-hover');
					}
				}
			}
		};

		// 通过ajax请求菜单
		function generateMenu() {
			publicFun.httpServer({ url: '${baseurl}usermenu.do' }, {}, function (data) {
				var _allDataMenuList = data.menus;
				var _moduleid = '';
				for (var i = 0; i < _allDataMenuList.length; i++) {
					for (var j = 0; j < _allDataMenuList[i].menus.length; j++) {
						if (_allDataMenuList[i].menus[j].url == '${firstIdnexUrl}') {
							_moduleid = '?moduleid=' + _allDataMenuList[i].menus[j].menuid
						}
					}
				}
				getMenu(data);
				var titlevalue = '${firstTitleName}';
				var index = '${firstIdnexUrl}' + _moduleid;
				//加载欢迎页面
				$('#tabs').tabs('add', {
					title: titlevalue,
					content: createFrame(index, 1)
				}).tabs({
					//当重新选中tab时将ifram的内容重新加载一遍
					onSelect: tabOnSelect,
					onContextMenu: function (e, title, index) {
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
				$("#mm").menu({
					onClick: function (item) {
						closeTab(this, item.name);
					}
				});
			}, function (msg) {
				publicFun.alert('菜单加载异常!');
			})
		}

		$(function () { //预加载方法
			var isdisplay_polling = '${isdisplay_polling}';
			if (isdisplay_polling == 1) {
				buildSocket();
			}
			window.sessionStorage.setItem('ownIp', '${sessionScope.activeUser.ip}');
			generateMenu();
			judgeVer(); // 判断浏览器是否是ie11以下版本
		});

		//退出系统方法
		function logout() {
			/* _confirm('确定要退出本系统吗?', null, function() {
					location.href = '${baseurl}logout.do';
			}); */
			createmodalwindow("退出系统", 300, 143, '${baseurl}user/dropOut.do');
		}

		//修改密码
		function updatepwd() {
			createmodalwindow("修改密码", 510, 240, '${baseurl}user/updatepwd.do');
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
					//     console.log(currentTabName);
					var currTab = $("#tabs").tabs("getTab", currentTabName);
					currTab.panel('refresh');
					break;
			}
		}

		function forwardfirst() {
			window.location.href = '${baseurl}first.do';
		}

		function queryOutime() {
			parent.opentabwindow('候诊患者查询', '${baseurl}his/toOutime.do?moduleid=' + 'c408dbf33d304f4e826761380d8a044f');
		}

		var _menuClick = function () {
			var tabTitle = $(this).attr("title");
			//获取二级菜单的url,rel是获取json数据时拼接成的html的一部分
			var url = $(this).attr("rel");
			var menuid = $(this).attr("ref");
			var icon = 'icon ' + $(this).attr("icon");
			var reloadtype = $(this).attr("reloadtype");
			clickVal = reloadtype;
			addTab(tabTitle, url, icon, reloadtype);
			$('.subMenu a').removeClass('a-hover');
			//$('.nav-item a.nav-a').removeClass('nav-hover');
			$(this).addClass('a-hover');
			//$(this).parent().parent().parent().find('a.nav-a').addClass('nav-hover');
		};

		var inum = 0;
		function getMenu(menus_var) {
			// <span class="icon ' + o.icon + '" >&nbsp;</span>
			var _selectName = menus_var.menus[0].menuname || null;
			//循环处理json的菜单数据，组织成html
			var menuUl = '', menuLi = '';
			$.each(menus_var.menus, function (i, n) { //外层循环处理一级菜单
				//第一个菜单内容默认展开，功能先关闭0205
				//    if(i==0){
				//        menuUl += '<li class="nav-item nav-show"><a href="javascript:;" class="nav-a nav-hover"><i class="my-icon nav-icon at-fa-'+ n.icon +'"></i><span>'+ n.menuname +'</span><i class="my-icon nav-more at-fa-down"></i></a><ul class="subMenu">';
				//    }else{
				menuUl += '<li class="nav-item"><a href="javascript:;" class="nav-a"><i class="my-icon nav-icon at-fa-' + n.icon + '"></i><span>' + n.menuname + '</span><i class="my-icon nav-more at-fa-put-away"></i></a><ul class="subMenu">';
				//  }
				//计算外层nav个数
				inum++;
				$.each(n.menus, function (j, o) { //二层处理二级菜单
					menuLi = '<li><a href="javascript:;" reloadtype= "' + o.reloadType + '" title="' + o.menuname + '" ref="' + o.menuid + '" href="javascript:;" rel="' + o.url + "?moduleid=" + o.menuid + '" icon="' + o.icon + '" class="subMenuA"><span class="submenuNam">' + o.menuname + '</span></a></li>';
					menuUl += menuLi;
				});
				menuUl += '</ul></li>';
			});
			$('#menuNav').html(menuUl);
			var height = $(window).height();
			var maxContentHeight = height - 64 - 37 * inum;
			$('.subMenu').css({ "max-height": "" + maxContentHeight + "" });
			// nav收缩展开
			$('.nav-item>a').on('click', function () {
				if (!$('.nav').hasClass('nav-mini')) {
					if ($(this).next().css('display') == "none") {
						//展开未展开
						$('.nav-item').children('ul').slideUp(300);
						$(this).next('ul').slideDown(300);
						$(this).parent('li').addClass('nav-show').siblings('li').removeClass('nav-show');
						$('i.nav-more').removeClass('at-fa-down').addClass('at-fa-put-away');
						$(this).find('i.nav-more').removeClass('at-fa-put-away').addClass('at-fa-down');
					} else {
						//收缩已展开
						$(this).next('ul').slideUp(300);
						$('.nav-item.nav-show').removeClass('nav-show');
						$('i.nav-more').removeClass('at-fa-down').addClass('at-fa-put-away');
						$(this).find('i.nav-more').removeClass('at-fa-down').addClass('at-fa-put-away');
					}
				} else {
					$('i.nav-more').removeClass('at-fa-down').addClass('at-fa-put-away');
					$(this).find('i.nav-more').removeClass('at-fa-put-away').addClass('at-fa-down');
				}
				$('.nav-item a.nav-a').removeClass('nav-hover');
				$(this).addClass('nav-hover');
			});
			$('.subMenu li a').click(_menuClick);
		}
	</script>
</head>

<body class="easyui-layout first" scroll="no">
	<div border="false" split="false" region="north" class="top-bg">
		<div class="first-bg">
			<span class="first-l">
				<img align="absmiddle" src="images/hzszyyhems/first/logo.png" height="33">
			</span>
			<span class="first-r">
				<a href="javascript:queryOutime()">
					<span class="isShowMessage">候诊提醒
						<img src="images/hems/first/tip_icon.png" class="msgIcon" id="msg_alert" />
						<span class="bg-theme" id="notifyMsg">无</span>
					</span>
				</a>
				<img class="iconfirst iconnone" src="images/hems/first/personal2.png"><span class="showUser">${activeUser.usrname},欢迎您！</span>
				<a title="回到首页" href="javascript:forwardfirst()" id="#" class="index-btn">【回到首页】</a>
				<a title="密码设置" ref="modifypwd" href="javascript:updatepwd()" id="modifypwd" class="repwd-btn">【密码设置】</a>
				<a title="退出" id="loginOut" href="javascript:logout()" class="restart-btn">【退出】</a>
			</span>
			<a title="急诊大屏" class="bigScreen" href="${baseurl}report/querybigscreen.do" target="_Blank"><img src="images/common/bigScreen/bigScreen.png"></a>
		</div>
	</div>
	<div class="nav">
		<div class="nav-top">
			<div id="mini"><i class="my-icon nav-icon at-fa-mini"></i><span class="menuBar">功能菜单</span></div>
		</div>
		<ul id="menuNav" class="menuContent">
		</ul>
	</div>
	<div class="tabsdiv" id="mainPanle" region="center">
		<div id="tabs" class="easyui-tabs" border="false" fit="true">
		</div>
	</div>
	<div id="mm" class="easyui-menu menudiv">
		<div id="Div1" name="1">
			关闭
		</div>
		<!--  <div id="mm-tabcloseall" name="2">
            全部关闭
        </div> -->
		<div id="mm-tabcloseother" name="3">
			关闭其他
		</div>
		<!-- <div class="menu-sep">
        </div> -->
		<div id="mm-tabcloseright" name="4">
			关闭右侧标签
		</div>
		<div id="mm-tabcloseleft" name="5">
			关闭左侧标签
		</div>
		<div id="mm-tabreload" name="6">
			刷新
		</div>
	</div>
	<input type="hidden" id="renshu" name="renshu">
</body>

</html>