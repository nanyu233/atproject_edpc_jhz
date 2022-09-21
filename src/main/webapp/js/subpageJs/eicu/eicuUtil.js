/**
 * eicu相关公共方法，公用常量
 * 本地拼音搜索需要引入pinyin字典库pinyin_dict_notone.js以及拼音查询pinyinUtil
 * 获取打印页面表头
 */

var eicuUtil = {
	/**
	 * 基本变量
	 */
	setLastPageType: function (val) {
		window.top.lastSkipInfo.pageType = val;
	},
	setLastPageData: function (val) {
		if (!val || val === null) {
			console.error('不可设置空的跳转数据')
			return;
		}
		var valType = typeof val;
		if (valType === 'boolean' || valType === 'undefined') {
			console.error('不可设置该格式的跳转数据');
			return;
		}
		if (typeof val === 'string') {
			eicuUtil.setLastPageType(val);
		} else {
			eicuUtil.setLastPageType(val.pageType || '');
			window.top.lastSkipInfo.pageData = val.pageData;
		}
	},
	//跳转信息
	shiftLastSkipInfo: function () {
		return window.top.lastSkipInfo.shiftInfo;
	},
	//获取医院信息  window.top.getHosInfo()
	hosInfo: '${hosName}',
	//获取标签页信息，[title]可获得 张三-xxxx
	tabInfo: window.top.$("#tabs").tabs('getSelected'),
	//患者基本信息
	ptBasicInfo: {},
	getMenuInfo: function () {
		var icuMenoObj = publicFun.getSessionStorage("icuMenu") || {};
		return icuMenoObj.menuInfoObj;
	},
	//获取标签页标题
	getTabTitle: function () {
		var title = this.tabInfo.title;
		return title.split("-")[1] || title;
	},
	//获取带医院名页面标题
	getTitleWithHos: function () {
		return this.hosInfo.hosName + this.getTabTitle();
	},
	//获取打印页面最上方带患者信息的html
	getPrintTitleContent: function () {
		var titleHtml = "<div style=\"padding-bottom:1mm;box-sizing:border-box;font-size:13pt;font-weight:bold;text-align:center\">"
		titleHtml += this.getTitleWithHos();
		titleHtml += "</div>";
		titleHtml += "<div style=\"font-size:10pt;font-weight:normal;padding: 1mm 0 2mm 1mm;text-align:left\">";
		titleHtml += "<span style=\"padding-right:5pt\">床号: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.bedNo + "</span></span>";
		titleHtml += "<span style=\"padding-right:5pt\">住院号: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.liveNo + "</span></span>";
		titleHtml += "<span style=\"padding-right:5pt\">姓名: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.custName + "</span></span>";
		titleHtml += "<span style=\"padding-right:5pt\">性别: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.custSex + "</span></span>";
		titleHtml += "<span style=\"padding-right:5pt\">年龄: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.custAge + "</span></span>";
		titleHtml += "<span style=\"padding-right:5pt\">入住ICU天数: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.liveIcuTime + "</span></span>";
		titleHtml += "<div style=\"margin-top: 1mm;width:100%;overflow-x:hidden\">诊断: <span style=\"border-bottom:1px solid black\">" + this.ptBasicInfo.diagInfo + "</span></div>";
		titleHtml += "</div>";
		return titleHtml;
	},
	/**
	 *左右菜单布局
	 */
	menuPanelLayoutSet: function (winW, winH) {
		var $mainContent = $('.icu-main-content');
		var $menuPanel = $('.icu-menu-panel');
		$mainContent.outerHeight(winH - 5);
		$menuPanel.outerHeight(winH - 5);
		return {
			height: winH - 5
		}
	},
	/**
	 * 患者信息打开自身内部标签页
	 */
	openIcuCustTab: function (pagetype, pageval, ptInfo, custPageInfo) {
		var menuInfoObj = eicuUtil.getMenuInfo();
		var ptBasicInfo = ptInfo || eicuUtil.ptBasicInfo;
		var _liveNo = ptBasicInfo.liveNo;
		var _custName = ptBasicInfo.custName;
		var thisPageInfo = {
			'pageType': 'fakeType',
			'pageData': {
				liveNo: _liveNo
			}
		}
		if (custPageInfo) {
			if (custPageInfo.pageType) {
				thisPageInfo.pageType = custPageInfo.pageType
			}
			// merge custPageData with liveNo
			$.each(custPageInfo, function (k, v) {
				thisPageInfo[k] = v;
			})
		}
		eicuUtil.setLastPageData(thisPageInfo);
		if (!menuInfoObj) {
			// 暂无菜单时的字典
			menuInfoObj = {
				'107002': {
					menuName: '微泵信息'
				},
				'112000': {
					menuName: '事件提醒'
				},
				'101000': {
					menuName: '患者信息'
				},
				'108003': {
					menuName: '血气分析'
				}
			}
		}
		var openTabName = menuInfoObj[pageval].menuName;
		if (ptBasicInfo.bedSeq) {
			// 未出科
			openTabName = openTabName;
		} else {
			openTabName = _custName + '-' + openTabName;
		}
		if (pagetype === '#') {
			// url will end with #, fake string root
			pagetype = 'root';
		}
		var openTabUrl = _baseUrl + 'icucust/toCustInfo.do?pagetype=' + pagetype + '&pageval=' + pageval;
		openTabUrl = encodeURI(openTabUrl);
		window.top.addTab(openTabName, openTabUrl, '', '0');
	},
	/**
	 *获取班次信息
	 */
	getShiftInfoDict: function () {
		var shiftInfo;
		var reqUrl = _baseUrl + 'icucust/getShiftTime.do';
		publicFun.httpRequest(reqUrl, '', {
			asyncFlag: false
		}, function (res) {
			if (!res.resultInfo.success) {
				alert_error('请求出错，请联系管理员');
				return;
			}
			shiftInfo = res.resultInfo.sysdata.shiftList;
			//时间转换为分MINUTE
			var aShiftTime;
			var compareMinute;
			shiftInfo.forEach(function (thisShiftInfo, shiftIdx) {
				var curShiftLength;
				var hourNum;
				var timeArr;
				thisShiftInfo.shiftIdx = shiftIdx;
				thisShiftInfo.keyStr = thisShiftInfo.optkey.replace('SHIFT_', '');
				timeArr = thisShiftInfo.optvalue.split(':').map(function (value) {
					return parseInt(value);
				});
				//时间换算为number
				compareMinute = timeArr[0] * TIME_TRANS_NUM + timeArr[1];
				hourNum = parseInt(thisShiftInfo.optvalue.substring(0, 2));
				if (shiftIdx === 0) {
					//保存早班时间作为对比
					aShiftTime = compareMinute;
				} else {
					curShiftLength = hourNum - shiftInfo[shiftIdx - 1].hourNum;
					if (curShiftLength < 0) {
						curShiftLength += DAY_HOUR
					}
					if (compareMinute < aShiftTime) {
						//如果下午班或晚班时间早于早班时间，换算为48小时制表示次日时间
						compareMinute += DAY_MINUTE;
						thisShiftInfo.nextDayFlag = '1';
					}
					shiftInfo[shiftIdx - 1].curShiftLength = curShiftLength
				}
				thisShiftInfo.compareMinute = compareMinute;
				thisShiftInfo.hourNum = hourNum;
			})
			shiftInfo[2].curShiftLength = DAY_HOUR - shiftInfo[0].curShiftLength - shiftInfo[1].curShiftLength;
		})
		return shiftInfo;
	},
	/**
	 *处理班次信息
	 *shiftInfo为APN顺序的班次数组
	 */
	getCurShiftInfo: function (shiftInfo) {
		//计算当日信息
		var curDate = new Date();
		var curDateStamp = curDate.getTime();
		var DAY_MILSECOND = DAY_HOUR * TIME_TRANS_NUM * TIME_TRANS_NUM * 1000;
		var curHour = curDate.getHours();
		var curMinute = curDate.getMinutes();
		var curCompareMinute = curHour * TIME_TRANS_NUM + curMinute;
		//计算前日信息
		var lastDateStamp = curDateStamp - DAY_MILSECOND;
		//生成所需日期字符串
		var curDateStr = publicFun.timeFormat(curDateStamp, 'yyyy/MM/dd');
		//计算结果变量
		var curShiftIdx;
		var queryDateStr; //可用于查询到当前班次的对应的时间信息
		//进行班次时间比较
		if (curCompareMinute < shiftInfo[0].compareMinute) {
			//小于早班时间，查询时间置为前一日
			queryDateStr = publicFun.timeFormat(lastDateStamp, 'yyyy/MM/dd');
			// 换算成48小时制分钟数进行比较
			curCompareMinute += DAY_MINUTE;
			if (shiftInfo[1].nextDayFlag === '1' && curCompareMinute < shiftInfo[1].compareMinute) {
				//小于下午班时间，则为早班
				curShiftIdx = 0;
			} else if (shiftInfo[2].nextDayFlag === '1' && curCompareMinute < shiftInfo[2].compareMinute) {
				//小于晚班时间，则为下午班
				curShiftIdx = 1
			} else {
				curShiftIdx = 2;
			}
		} else {
			// 大于早班时间，查询时间必为当天
			queryDateStr = curDateStr;
			if (shiftInfo[1].nextDayFlag === '1') {
				//下午班时间为次日，当前班次一定为早班
				curShiftIdx = 0;
			} else if (curCompareMinute < shiftInfo[1].compareMinute) {
				//下午班时间为当日，且时间大于当前时间
				curShiftIdx = 0;
			} else if (shiftInfo[2].nextDayFlag === '1') {
				//晚班为次日且下午班为当日，当前班次一定为下午班
				curShiftIdx = 1;
			} else if (curCompareMinute < shiftInfo[2].compareMinute) {
				curShiftIdx = 1;
			} else {
				curShiftIdx = 2;
			}
		}
		return {
			curDateStamp: curDateStamp,
			curShiftIdx: curShiftIdx,
			queryDateStr: queryDateStr,
			nextDateStamp: curDateStamp + DAY_MILSECOND
		}
	},
	/**
	 * 本地字典search组件
	 */
	searchBoxReset: function ($thisInput, context) {
		var searchBoxStyle = {
			"position": "absolute",
			"z-index": 99,
			"width": "110px",
			"max-height": "100px",
			"box-sizing": "border-box",
			"background-color": "#fff",
			"border": "1px solid #666",
			"border-radius": "6px",
			"font-size": "12px",
			"font-weight": "normal",
			"box-shadow": "0 5px 10px #ccc",
			"overflow-x": "hidden",
			"overflow-y": "auto",
			"left": 0
		};

		var $inputParent = $thisInput.parent();
		var inputHeight = $thisInput.outerHeight();
		$inputParent.css({
			position: "relative",
			height: inputHeight
		})
		if (context === 'up') {
			searchBoxStyle.bottom = $inputParent.get(0).offsetHeight + "px";
		} else if (context === 'down') {
			searchBoxStyle.top = $inputParent.get(0).offsetHeight + "px";
		} else {
			var boundaryRectInfo;
			if ($thisInput.hasClass("userInput")) {
				boundaryRectInfo = $(".signBorderBox", context).get(0).getBoundingClientRect(); //边界元素位置信息
				// console.log("边界元素是：");
				// console.log($(".searchInputBorderBox", context).get(0));
			} else {
				boundaryRectInfo = $(".searchInputBorderBox", context).get(0).getBoundingClientRect(); //边界元素位置信息
				// console.log("边界元素是：");
				// console.log($(".searchInputBorderBox", context).get(0));
			}
			var thisDOMRectInfo = $thisInput.get(0).getBoundingClientRect(); //当前元素位置信息
			var parentDOMRectInfo = $inputParent.get(0).getBoundingClientRect(); //当前父元素位置信息
			var borderDiffer = boundaryRectInfo.bottom - thisDOMRectInfo.bottom; //距离边距差别
			// console.log("此时距离边距差为：", borderDiffer);
			// console.log("边距元素");
			// console.log(boundaryRectInfo);
			// console.log("当前元素");
			// console.log(thisDOMRectInfo);
			var left = thisDOMRectInfo.left - parentDOMRectInfo.left;
			searchBoxStyle.left = left;
			var maxDiffer = $inputParent.find(".searchBox").height() + 10;
			if (maxDiffer > 110) {
				//最多110距离
				maxDiffer = 110;
			}
			if (borderDiffer < maxDiffer) {
				//距离底边不足searchBox高度
				// searchBoxStyle.bottom = parentDOMRectInfo.bottom - thisDOMRectInfo.bottom + $thisInput.height() + "px";
				searchBoxStyle.bottom = $inputParent.get(0).offsetHeight + "px";
			} else {
				// searchBoxStyle.top = thisDOMRectInfo.top - parentDOMRectInfo.top + $thisInput.height() + "px";
				searchBoxStyle.top = $inputParent.get(0).offsetHeight + "px";
			}
		}
		$inputParent.find(".searchBox")
			//查询框样式设置
			.css(searchBoxStyle)
			//查询框事件绑定
			.on("click", "p", function () {
				event.stopPropagation(); //阻止事件冒泡
				if ($thisInput.hasClass("userInput")) {
					//如果是医生查询
					var thisText = $(".username", this).text();
					var thisId = $(".userid", this).text();
					var signImg = $(".userid", this).attr("data-signimg");
					var pInfo = {
						text: thisText,
						id: thisId,
						signImg: signImg
					};
					eicuUtil.signElClick($thisInput, pInfo);
				} else if ($thisInput.hasClass("searchInput")) {
					//选择其中一项方法
					var thisText = $(".content", this).text();
					if (thisText !== "无查询结果") {
						$thisInput.val(thisText);
					}
					$thisInput.focus();
					$inputParent.find(".searchBox").remove();
				}
			})
			//选择项样式设置
			.find("p").css({
				"padding": "3px 5px",
				"box-sizing": "border-box",
				"cursor": "pointer",
			}).hover(function () {
				$(this).css("background-color", "rgb(234, 242, 255)");
			}, function () {
				$(this).css("background-color", "#fff");
			})
			.find("span").css({
				//添加如果溢出则隐藏功能
				"width": "100%",
				"overflow": "hidden",
				"white-space": "nowrap",
				"text-overflow": "ellipsis"
			})
	},
	//相关绑定事件
	bindSearchInput: function (localMap, context) {
		//需要遵循以下结构：外层元素添加searchInputBorderBox，绑定元素添加searchInput
		//<div class="searchInputBorderBox"> div可替换为td或者tr，总之是用以判断如何显示的最外层元素
		//	<label> <span>标签内容</span> <input class="searchInput">  </label>
		//</div>
		var $borderBox, $searchInputList;
		var context = context || $(window.document);
		if (context === 'up' || context === 'down') {
			//如果指定方向或者未指定作用域
			$borderBox = $(".searchInputBorderBox");
			$searchInputList = $(".searchInput");
		} else {
			$borderBox = $(".searchInputBorderBox", context);
			$searchInputList = $(".searchInput", context);
		}
		$borderBox.off("click").on("click", function () {
			var $searchBox = $(".searchBox");
			$searchBox.remove();
		}).off("keyup").on("keyup", function () {
			if (event.keyCode === 9) {
				//tab键清空选择框
				$(".searchBox").remove();
			}
		});
		$searchInputList
			.attr("placeholder", "回车查询")
			.off("keyup")
			.on("keyup", function () {
				//绑定本地拼音查询事件
				$(this).parent().find(".searchBox").remove();
				if (event.keyCode == 13) {
					eicuUtil.queryDict($(this), localMap, context);
				}
			})
			.each(function () {
				var $thisInput = $(this);
				$thisInput.css({
					"height": "24px",
					"line-height": "24px",
					"vertical-align": "middle",
					"box-sizing": "border-box"
				})
				var $inputParent = $thisInput.parent();
				if ($inputParent.css("display") === "inline") {
					$inputParent.css({
						"display": "inline-block"
					})
				}
				$inputParent.css({
					"position": "relative"
				})
			})
	},
	queryDict: function ($thisInput, localMap, context) {
		var inputContent = $thisInput.val();
		var codeKey = $thisInput.attr("data-dictkey") || $thisInput.attr("name");
		var hisList = localMap[codeKey]; //相关结果数组
		// console.log('当前hisList');
		// console.log(hisList);
		// console.log(codeKey);
		// console.log(localMap);
		if ($thisInput.next().hasClass("searchBox")) {
			$thisInput.next().remove();
		}
		// $thisInput.prop("disabled", true);
		var searchBoxStr = "<div class=\"searchBox\">";
		var hasContent = false;
		// console.log("拿到是localMap:");
		// console.log(localMap);
		// console.log("codeKey是：", codeKey);
		// console.log("hisList是：");
		// console.log(hisList);
		if (!hisList || hisList.length === 0) {
			searchBoxStr += "<p>无查询结果</p>";
			hasContent = true;
		} else {
			for (var hisIdx = 0; hisIdx < hisList.length; hisIdx++) {
				var thisVal
				if (typeof hisList[hisIdx] === "object") {
					thisVal = hisList[hisIdx]["vsRslt"];
				} else {
					thisVal = hisList[hisIdx];
				}
				if (thisVal.indexOf(inputContent) !== -1 || inputContent === "") {
					searchBoxStr += "<p title=\"" + thisVal + "\">";
					searchBoxStr += "<span class=\"content\">" + thisVal + "</span>";
					searchBoxStr += "</p>";
					hasContent = true;
				}
			}
			if (!hasContent) {
				searchBoxStr += "<p>无查询结果</p>";
				hasContent = true;
			}
		}
		searchBoxStr += "</div>";
		$thisInput.after(searchBoxStr);

		$thisInput.parent().css({
			"position": "relative"
		});
		// $thisInput.prop("disabled", false).focus();

		//样式重置和事件绑定
		eicuUtil.searchBoxReset($thisInput, context);
	},
	/**
	 * 签名search组件
	 */
	//相关绑定事件
	bindUserInput: function (context) {
		//指定方向或者未指定作用域全局绑定一次，指定作用域每个组件均需要绑定
		//需要遵循以下结构：外层元素添加signBorderBox，绑定元素添加userInput
		//<div class="signBorderBox"> div可替换为td或者tr，总之是用以判断如何显示的最外层元素
		//	<label> <span>标签内容</span> <input class="userInput">  </label>
		//</div>
		//边境元素绑定删除searchBox事件
		var $borderBox, $searchInputList;
		var context = context || $(window.document);
		if (context === 'up' || context === 'down') {
			$borderBox = $(".signBorderBox");
			$searchInputList = $(".userInput");
		} else {
			$borderBox = $(".signBorderBox", context);
			$searchInputList = $(".userInput", context);
		}
		$borderBox.off("click").on("click", function () {
			var $searchBox = $(".searchBox");
			$searchBox.remove();
		}).off("keyup").on("keyup", function () {
			if (event.keyCode === 9) {
				//tab键清空选择框
				$(".searchBox").remove();
			}
		});
		//绑定查询事件
		$searchInputList
			.attr("placeholder", "回车查询")
			.off("keyup")
			.on("keyup", function () {
				if (event.keyCode !== 9) {
					// 							如果不是tab键，则清空
					$(this).data("userid", "");
					$(this).parent().find(".searchBox").remove();
				}
				if (event.keyCode == 13) {
					console.log('触发查询');
					//出发查询时先保存查询内容,清空圆有id并失焦，防止二次触发失焦事件
					var queryContent = $(this).val();
					$(this).data('userid', '').blur().val(queryContent);
					eicuUtil.queryDoct($(this), context);
				}
			})
			.on("blur", function () {
				//签名绑定失焦后如果没有具体的userid，则删除内容
				if (!$(this).data("userid")) {
					$(this).val("");
				} else {
					//如果有userid，重新赋值并查询图片
					eicuUtil.queryDoct($(this), context);
				}
			})
			.on("click", function () {
				$("body").find(".searchBox").remove();
			})
			.each(function () {
				var $thisInput = $(this);
				var $inputParent = $thisInput.parent();
				$thisInput.css({
					"height": "24px",
					"line-height": "24px",
					"vertical-align": "middle",
					"box-sizing": "border-box"
				})
				if ($inputParent.css("display") === "inline") {
					$inputParent.css({
						"display": "inline-block"
					})
				}
				if ($inputParent.find(".signImgBox").length === 0) {
					$inputParent.append("<div class=\"signImgBox\"><img src=\"javascript:;\" title=\"\" class=\"signPic\"></div>");
					$inputParent.find(".signImgBox").css({
						"display": "none",
						"height": "24px",
						"line-height": "24px",
						"overflow-y": "hidden",
						"vertical-align": "middle"
					}).children().css({
						"vertical-align": "middle",
						"height": "24px",
						"line-height": "1"
					})
				}
			})
	},
	//查询方法
	queryDoct: function ($thisInput, context) {
		var context = context || $(window.document);
		//回车查询会优先清空userid，则查询时有userid则一定为失焦事件
		var inputContent = $thisInput.data('userid') ? $thisInput.data('userid') : $thisInput.val();
		if ($thisInput.next().hasClass("searchBox")) {
			$thisInput.next().remove();
		}
		if (inputContent) {
			// $thisInput.prop("disabled", true);
			var queryUrl = _baseUrl + "user/findUserByNameAndNo.do";//_baseUrl + "user/queryUser_pinyinLike.do";
			var requestParam = "dstuserCustom.usrno=" + inputContent;//"dstuserCustom.queryLike=" + inputContent;
			publicFun.httpRequest(queryUrl, requestParam, function (res) {
				var doctBoxStr = "<div class=\"searchBox\">";
				if (!res) {//res.resultInfo.sysdata
					alert_warn(res.resultInfo.message);
					return;
				}
				var userList = res || [];//res..resultInfo.sysdata.userlist`
				if (userList.length === 0) {
					doctBoxStr += "<p>无查询结果</p>";
				} else if (userList.length === 1) {
					//如果只有一条数据直接赋值
					var thisText = userList[0].usrname;
					var thisId = userList[0].usrno;
					var signImg = userList[0].signimg;
					var pInfo = {
						text: thisText,
						id: thisId,
						signImg: signImg
					}
					eicuUtil.signElClick($thisInput, pInfo);
					return;
				} else {
					userList.forEach(function (ele) {
						doctBoxStr += "<p>";
						//添加图片data
						doctBoxStr += "<span class=\"userid\"" + ele.userid + "</span>";
						doctBoxStr += "-";
						doctBoxStr += "<span class=\"username\">" + ele.usrname + "</span>";
						doctBoxStr += "</p>";
					})
				}
				doctBoxStr += "</div>";
				$thisInput.after(doctBoxStr);
				// $thisInput.prop("disabled", false).focus();
				//查询框相关样式赋值
				eicuUtil.searchBoxReset($thisInput, context);
			})
		}
	},
	//医生查询点击事件
	signElClick: function ($thisInput, pInfo) {
		//选择查询医生
		var vsType = $thisInput.attr("data-vstype");
		var thisInputNameAttr = $thisInput.attr("name");
		var thisText = pInfo.text;
		var thisId = pInfo.id;
		var signImg = pInfo.signImg;
		if (thisText !== "无查询结果") {
			//先添加图片，图片中绑定error事件，如果查询失败或点编辑，删除此元素并将input的type恢复
			//元素模板
			// <div class="signImgBox">
			// 	<img src="" title="" class="signPic">
			// 	<a href="#" onClick="delImg">编辑</a>
			// </div>
			var $inputParent = $thisInput.parent();
			var $thisImgBox = $inputParent.find(".signImgBox");
			// 图片相关属性
			$thisImgBox.css("display", "inline-block");
			var $thisImg = $thisImgBox.find(".signPic");
			$thisImg
				.attr("src", _baseUrl + "images/eicu/signPic/" + signImg)
				.attr("title", thisText)
				.attr("data-userid", thisId)
				.off('error')
				.on("error", function () {
					//绑定错误事件
					$thisInput.show();
					$thisImgBox.hide();
				})
				.off('click')
				.on("click", function () {
					//绑定删除按钮事件
					console.log("删除事件");
					if (!$thisInput.prop("disabled")) {
						$thisImgBox.hide();
						$thisInput.show().focus();
					}
				});
			//input赋值
			$thisInput.val(thisText).data("userid", thisId);
			//隐藏此input
			// $thisInput.prop("disabled", false).hide();
			$thisInput.hide();
		}
		$inputParent.find(".searchBox").remove();
	},
	dateFormatCstToGmt:function(date, format) {
	    date = new Date(date);
	    date.setHours(date.getHours()-14);
	    var o = {
	        'M+' : date.getMonth() + 1, //month
	        'd+' : date.getDate(), //day
	        'H+' : date.getHours(), //hour
	        'm+' : date.getMinutes(), //minute
	        's+' : date.getSeconds(), //second
	        'q+' : Math.floor((date.getMonth() + 3) / 3), //quarter
	        'S' : date.getMilliseconds() //millisecond
	    };

	    if (/(y+)/.test(format))
	        format = format.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length));

	    for (var k in o)
	        if (new RegExp('(' + k + ')').test(format))
	            format = format.replace(RegExp.$1, RegExp.$1.length == 1 ? o[k] : ('00' + o[k]).substr(('' + o[k]).length));

	    return format;
	},
	dateToGMT: function(strDate){
        var dateStr=strDate.split(" ");  
        var strGMT = dateStr[0]+" "+dateStr[1]+" "+dateStr[2]+" "+dateStr[5]+" "+dateStr[3]+" GMT+0800";  
        var date = new Date(Date.parse(strGMT));
        return date;
    },
}

try {
	//	//如果当前标签顶层页面有getBasicInfo方法
	eicuUtil.ptBasicInfo = $(eicuUtil.tabInfo[0]).find("iframe").get(0).contentWindow.getBasicInfo();
} catch (e) {
	//如果不是则动态请求患者信息
	eicuUtil.ptBasicInfo = {}
}