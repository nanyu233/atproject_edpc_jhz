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
		if(sessionStorage.getItem('icutoken')) {
			if(eicuUtil.isOuterSys && !window.top.lastSkipInfo) {
				window.top.lastSkipInfo = {};
			}
			window.top.lastSkipInfo.pageType = val;
		}
	},
	setLastPageData: function (val) {
		if (!val || val === null) {
			console.error('不可设置空的跳转数据');
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
			if(sessionStorage.getItem('icutoken')) {
				window.top.lastSkipInfo.pageData = val.pageData;
			}
		}
	},
	//跳转信息
	shiftLastSkipInfo: function () {
		return window.top.lastSkipInfo.shiftInfo;
	},
	//获取医院信息
	hosInfo: sessionStorage.getItem('icutoken') ? window.top.getHosInfo() : {},
	//获取标签页信息，[title]可获得 张三-xxxx
	tabInfo: sessionStorage.getItem('icutoken') ? window.top.$('#tabs').tabs('getSelected') : [], // ！==document为外链
	/**
	 * 患者基本信息 PrintCust
	 *
	 * @typedef {Object} PrintCust
	 * @property {(string|null)} custNo
	 * @property {(string|null)} custName
	 * @property {(string|null)} custType
	 * @property {(string|null)} custId
	 * @property {(string|null)} bthDay
	 * @property {(string|null)} custSex
	 * @property {(string|null)} custAge
	 * @property {(string|null)} custPhe
	 * @property {(string|null)} custAddr
	 * @property {(string|null)} height
	 * @property {(string|null)} weight
	 * @property {(string|null)} allergy
	 * @property {(string|null)} crtTime
	 * @property {(string|null)} crtUser
	 * @property {(string|null)} modTime
	 * @property {(string|null)} modUser
	 * @property {(string|null)} bedSeq
	 * @property {(string|null)} bedStat
	 * @property {(string|null)} bedNo
	 * @property {(string|null)} nursNo
	 * @property {(string|null)} glFlag
	 * @property {(string|null)} liveNo
	 * @property {(string|null)} doctNo
	 * @property {(string|null)} deptNo
	 * @property {(string|null)} diagInfo
	 * @property {(string|null)} inicuTime
	 * @property {(string|null)} opTime
	 * @property {(string|null)} outicuTime
	 * @property {(string|null)} opDays
	 * @property {(string|null)} nursName
	 * @property {(string|null)} doctName
	 * @property {(string|null)} inhosTimeStr
	 * @property {(string|null)} inicuTimeStr
	 * @property {(string|null)} opTimeStr
	 * @property {(string|null)} outicuTimeStr
	 * @property {(string|null)} liveIcuTime
	 * @property {(string|null)} erCount
	 * @property {(string|null)} rescMode
	 * @property {(string|null)} pipeFlag
	 * @property {(string|null)} respFlag
	 * @property {(string|null)} nursCls
	 * @property {(string|null)} negPosit
	 * @property {(string|null)} unEntry
	 * @property {(string|null)} fallFlag
	 * @property {(string|null)} deptName
	 * @property {(string|null)} bradenSco
	 * @property {(string|null)} sepsisflag
	 * @property {(string|null)} diagCode
	 * @property {(string|null)} diagTimeStr
	 * @property {(string|null)} inIcuDate
	 * @property {(string|null)} erMap
	 *
	 */

	/** @type {PrintCust} */
	ptBasicInfo: {},
	isOuterSys: sessionStorage.getItem('icutoken') ?  true : false,
	getMenuInfo: function () {
		var icuMenoObj = publicFun.getStorage('icuMenu') || {};
		// console.log('common func getMenuInfo, get icuMenoObj', icuMenoObj);
		var menuInfoObj = icuMenoObj.menuInfoObj;
		if (!menuInfoObj) {
			// 暂无菜单时的字典
			menuInfoObj = {
				'107002': {
					idRoot: '107000',
					menuUrl: 'icudoctadvi/toMicPumpInfo.do',
					menuName: '微泵信息'
				},
				'112000': {
					idRoot: '100000',
					menuUrl: 'icuer/toErInfo.do',
					menuName: '事件提醒'
				},
				'101000': {
					idRoot: '100000',
					menuUrl: 'icucust/toOverview.do',
					menuName: '患者信息'
				},
				'108003': {
					idRoot: '108000',
					menuUrl: 'icucare/toBgCareSheet.do',
					menuName: '血气分析'
				}
			};
		}
		return menuInfoObj;
	},
	findMenuInfoByParam: function (param) {
		var menuInfoObj = eicuUtil.getMenuInfo();
		var curMenuInfo;
		var paramKey;
		var numberTest = /^[0-9]+$/;
		var alphaTest = /^[a-zA-Z0-9]+$/;
		if (numberTest.test(param)) {
			// param is menuId as keyname
			curMenuInfo = menuInfoObj[param];
		} else {
			// need traverse
			if (param.indexOf('/') !== -1) {
				// param is menuUrl
				paramKey = 'menuUrl';
			} else if (alphaTest.test(param)) {
				// param is menuType
				paramKey = 'menuType';
			} else {
				// param is menuName
				paramKey = 'menuName';
			}
			$.each(menuInfoObj, function (k, v) {
				if (v[paramKey] === param) {
					curMenuInfo = v;
					return false; // break
				}
			});
		}

		return curMenuInfo;
	},
	getMenuUrlParams: function (menuId) {
		var curMenuInfo = eicuUtil.findMenuInfoByParam(menuId);
		var curUrlParamStr = curMenuInfo.menuUrl.split('?')[1] || '';
		var curUrlParamList = curUrlParamStr.split('&') || [];
		var curUrlParamInfo = {};
		var temp;
		$.each(curUrlParamList, function (idx, str) {
			temp = str.split('=') || [];
			if (temp[0]) {
				curUrlParamInfo[temp[0]] = temp[1];
			}
		});
		return curUrlParamInfo;
	},
	//获取标签页标题
	getTabTitle: function () {
		var title = this.tabInfo.length ? this.tabInfo.title : document.title;
		return title.split('-')[1] || title;
	},
	//获取带医院名页面标题
	getTitleWithHos: function () {
		this.hosInfo.hosName = this.hosInfo.hosName ? this.hosInfo.hosName : this.hosInfo.optvalue;
		// return this.hosInfo.hosName + this.getTabTitle();
		return  this.getTabTitle();

	},

	/**
	 * 阻止打印
	 * @param {string} message
	 * @param {boolean} [alert] default true
	 */
	preventPrint: function(message, alert){
		message = message || "打印已被阻止！";
		alert = alert === false ? false : true;

		if (alert) publicFun.alert(message);
		throw Error(message);
	},

	//获取打印页面最上方带患者信息的html
	getPrintTitleContent: function (caseFrom, queryTimeStr, careFlag) {
		// 为了不改下面的 这里保存下引用 html赋值完成之后再把之前的引用改回去
		var ptBasicInfoClone = this.ptBasicInfo;
		var printCust = this.queryPtBasicInfoFromOuterNew(this.ptBasicInfo.liveNo, queryTimeStr, careFlag);

		if (printCust == null) this.preventPrint("患者表头信息查询错误 或者 查询日期无记录返回值为null");
		this.ptBasicInfo = printCust;

		var titleHtml =
			'<div style="margin:0;padding:0;padding-bottom:1mm;box-sizing:border-box;font-size:13pt;font-weight:bold;';
		if('special' === caseFrom) {
			titleHtml += 'text-align:center;width: 270mm">';
		} else {
			titleHtml += 'text-align:center">';
		}
		titleHtml += this.getTitleWithHos();
		titleHtml += '</div>';
		titleHtml +=
			'<span style="margin-left: 20%;padding-right:5pt">姓名: <span style="border-bottom:1px solid black">' +
			this.ptBasicInfo.cstNam +
			'</span></span>';
		titleHtml +=
			'<span style="padding-right:5pt">性别: <span style="border-bottom:1px solid black">' +
			this.ptBasicInfo.cstSexCod +
			'</span></span>';
		titleHtml +=
			'<span style="padding-right:5pt">年龄: <span style="border-bottom:1px solid black">' +
			this.ptBasicInfo.cstAgeName +
			'</span></span>';
		titleHtml +=
			'<span style="padding-right:5pt">入科日期: <span style="border-bottom:1px solid black">' +
			this.ptBasicInfo.crtTim +
			'</span></span>';
		// var inIcuDate = queryTimeStr ? eicuUtil.getInIcuTime(publicFun.timeFormat(this.ptBasicInfo.inicuTimeStr, 'yyyy/MM/dd'), publicFun.timeFormat(queryTimeStr, 'yyyy/MM/dd')) : this.ptBasicInfo.liveIcuTime;
		// if (queryTimeStr && this.ptBasicInfo.outicuTimeStr !== '' && publicFun.getTimeStamp(this.ptBasicInfo.outicuTimeStr)<publicFun.getTimeStamp(queryTimeStr)) {
		//     inIcuDate = this.ptBasicInfo.liveIcuTime;
		// }
		//
		// if (caseFrom === 'special') inIcuDate = this.ptBasicInfo.inIcuDate;
		// titleHtml +=
		// 	'<div style="margin-top: 1mm;width:100%;overflow-x:hidden;overflow-y:hidden;">诊断: <span style="border-bottom:1px solid black">' +
		// 	this.ptBasicInfo.diagInfo +
		// 	'</span></div>';
		titleHtml += '</div>';
		// if (caseFrom === 'special') {
		this.ptBasicInfo = ptBasicInfoClone;
		// }
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
		};
	},
	/**
	 *获取班次信息
	 */
	getShiftInfoDict: function () {
		var shiftInfo;
		var reqUrl = _baseUrl + 'icucust/getShiftTime.do';
		publicFun.httpRequest(
			reqUrl,
			'',
			{
				asyncFlag: false
			},
			function (res) {
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
							curShiftLength += DAY_HOUR;
						}
						if (compareMinute < aShiftTime) {
							//如果下午班或晚班时间早于早班时间，换算为48小时制表示次日时间
							compareMinute += DAY_MINUTE;
							thisShiftInfo.nextDayFlag = '1';
						}
						shiftInfo[shiftIdx - 1].curShiftLength = curShiftLength;
					}
					thisShiftInfo.compareMinute = compareMinute;
					thisShiftInfo.hourNum = hourNum;
				});
				shiftInfo[2].curShiftLength =
					DAY_HOUR - shiftInfo[0].curShiftLength - shiftInfo[1].curShiftLength;
			}
		);
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
			if (
				shiftInfo[1].nextDayFlag === '1' &&
				curCompareMinute < shiftInfo[1].compareMinute
			) {
				//小于下午班时间，则为早班
				curShiftIdx = 0;
			} else if (
				shiftInfo[2].nextDayFlag === '1' &&
				curCompareMinute < shiftInfo[2].compareMinute
			) {
				//小于晚班时间，则为下午班
				curShiftIdx = 1;
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
		};
	},
	/**
	 * 根据班次计算开始结束时间
	 */
	getTimeByShift: function (queryDateStr, shiftFlag) {
		// 计算开始/结束时间
		var startDateStr = '';
		var endDateStr = '';
		var startDateStamp;
		var endDateStamp;
		var nextShiftInfo;
		var queryStamp = publicFun.getTimeStamp(queryDateStr);
		var nextDateStamp = queryStamp + DAY_MILLI_SEC;
		var nextDateStr = publicFun.timeFormat(nextDateStamp, 'yyyy/MM/dd')
		if (!shiftFlag) {
			// 全天
			startDateStr = queryDateStr + ' ' + shiftInfo[0].optvalue;
			endDateStr = nextDateStr + ' ' + shiftInfo[0].optvalue;
		} else {
			// 部分班次
			if (curShiftInfo.keyStr !== shiftFlag) {
				curShiftInfo = shiftInfo.filter(function (ele) {
					return ele.keyStr === shiftFlag
				})[0];
			}
			if (curShiftInfo.nextDayFlag === '1') {
				startDateStr = nextDateStr + ' ' + curShiftInfo.optvalue;
			} else {
				startDateStr = queryDateStr + ' ' + curShiftInfo.optvalue;
			}
			nextShiftInfo = shiftInfo[(curShiftInfo.shiftIdx + 1) % 3];
			if (curShiftInfo.nextDayFlag === '1' || nextShiftInfo.nextDayFlag === '1') {
				endDateStr = nextDateStr + ' ' + nextShiftInfo.optvalue;
			} else {
				endDateStr = queryDateStr + ' ' + nextShiftInfo.optvalue;
			}
		}
		return {
			startDateStr: startDateStr,
			endDateStr: endDateStr
		}
	},
	/**
	 * 增加前后天快捷组件
	 * 所有fast-date-input的输入框后面增加对应快捷按钮
	 * *需在时间完成赋值后调用
	 */
	bindFastDateBtn: function () {
		var $inputElList = $('.fast-date-input');
		var $inputEl;
		var btnTextStr1 = '<span class="icu-btn inline-btn btn-outline-primary">';
		var btnTextStr2 = '</span>';
		var fastBtnList = [{
			text: '后一天',
			code: 'next-day',
			timeDiffer: DAY_MILLI_SEC
		}, {
			text: '前一天',
			code: 'prev-day',
			timeDiffer: DAY_MILLI_SEC * (-1)
		}];
		var todayTimeStr = publicFun.timeFormat(new Date().getTime(), 'yyyy/MM/dd')
		$inputElList.each(function (inputIdx) {
			var disabledClassList = ['disabled', 'display-btn', 'active'];
			var $el = $(this);
			var $btn;
			fastBtnList.forEach(function (btnInfo) {
				$btn = $(btnTextStr1 + btnInfo.text + btnTextStr2);
				if ($el.val() === todayTimeStr && btnInfo.code === 'next-day') {
					// $btn.addClass(disabledClassList);
					$btn.addClass('disabled');
					$btn.addClass('active');
					$btn.addClass('display-btn');
				}
				$btn.data('inputidx', inputIdx);
				$btn.addClass(btnInfo.code);
				$btn.click(function () {
					var todayStamp = new Date().getTime();
					var todayTimeStr = publicFun.timeFormat(todayStamp, 'yyyy/MM/dd');
					var todayTimeNum = parseInt(todayTimeStr.replace(/\//g, ''));
					var dateStr = $el.val();
					if (todayTimeStr === dateStr && $btn.hasClass('next-day')) {
						return;
					}
					var timestamp = publicFun.getTimeStamp(dateStr);
					var targetStamp = timestamp + btnInfo.timeDiffer;
					var targetTimeNum;
					var targetTimeStr;
					var $nextDayBtn = $el.next().next();
					targetTimeStr = publicFun.timeFormat(targetStamp, 'yyyy/MM/dd');
					if (!targetTimeStr) {
						targetTimeStr = todayTimeStr;
					} else {
						targetTimeNum = parseInt(targetTimeStr.replace(/\//g, ''));
						if (targetTimeNum > todayTimeNum) {
							targetTimeStr = todayTimeStr;
						}
					}
					if (targetTimeStr === todayTimeStr) {
						// 取消后一天
						// $nextDayBtn.addClass(disabledClassList);
						$nextDayBtn.addClass('disabled');
						$nextDayBtn.addClass('active');
						$nextDayBtn.addClass('display-btn');
					} else {
						// $nextDayBtn.removeClass(disabledClassList);
						$nextDayBtn.removeClass('disabled');
						$nextDayBtn.removeClass('active');
						$nextDayBtn.removeClass('display-btn');
					}
					$el.val(targetTimeStr);
				})
				$el.after($btn);
			})
		})
	},
	/**
	 * 本地字典search组件
	 */
	searchBoxReset: function ($thisInput, context) {
		var searchBoxStyle = {
			position: 'absolute',
			'z-index': 99,
			width: '110px',
			'max-height': '125px',
			'box-sizing': 'border-box',
			'background-color': '#fff',
			border: '1px solid #666',
			'border-radius': '6px',
			'font-size': '12px',
			'font-weight': 'normal',
			'box-shadow': '0 5px 10px #ccc',
			'overflow-x': 'hidden',
			'overflow-y': 'auto',
			left: 0
		};

		var $inputParent = $thisInput.parent();
		var inputHeight = $thisInput.outerHeight();
		$inputParent.css({
			position: 'relative',
			height: inputHeight
		});
		if (context === 'up') {
			searchBoxStyle.top = '-' + $inputParent.get(0).offsetHeight + 'px';
		}
		else if (context === 'down') {
			searchBoxStyle.top = $inputParent.get(0).offsetHeight + 'px';
			var thisDOMRectInfo = $thisInput.get(0).getBoundingClientRect(); //当前元素位置信息
			var parentDOMRectInfo = $inputParent.get(0).getBoundingClientRect(); //当前父元素位置信息
			var left = thisDOMRectInfo.left - parentDOMRectInfo.left;
			searchBoxStyle.left = left;
		}
		else {
			var boundaryRectInfo;
			if ($thisInput.hasClass('userInput')) {
				boundaryRectInfo = $('.signBorderBox', context)
					.get(0)
					.getBoundingClientRect(); //边界元素位置信息
				// console.log("边界元素是：");
				// console.log($(".searchInputBorderBox", context).get(0));
			} else {
				boundaryRectInfo = $('.searchInputBorderBox', context)
					.get(0)
					.getBoundingClientRect(); //边界元素位置信息
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
			var maxDiffer = $inputParent.find('.searchBox').height() + 10;
			if (maxDiffer > 110) {
				//最多110距离
				maxDiffer = 110;
			}
			if (borderDiffer > 0 && borderDiffer < maxDiffer) {
				//距离底边不足searchBox高度
				// searchBoxStyle.bottom = parentDOMRectInfo.bottom - thisDOMRectInfo.bottom + $thisInput.height() + "px";
				searchBoxStyle.top = '-' + $inputParent.get(0).offsetHeight + 'px';
			} else {
				// searchBoxStyle.top = thisDOMRectInfo.top - parentDOMRectInfo.top + $thisInput.height() + "px";
				searchBoxStyle.top = $inputParent.get(0).offsetHeight + 'px';
			}
		}
		$inputParent
			.find('.searchBox')
			//查询框样式设置
			.css(searchBoxStyle)
			//查询框事件绑定
			.on('click', 'p', function () {
				event.stopPropagation(); //阻止事件冒泡
				if ($thisInput.hasClass('userInput')) {
					//如果是医生查询
					var thisText = $('.username', this).text();
					var thisId = $('.userid', this).text();
					var signImg = $('.userid', this).attr('data-signimg');
					var pInfo = {
						text: thisText,
						id: thisId,
						signImg: signImg
					};
					eicuUtil.signElClick($thisInput, pInfo);
				} else if ($thisInput.hasClass('searchInput')) {
					//选择其中一项方法
					var thisText = $('.content', this).text();
					if (thisText !== '无查询结果') {
						$thisInput.val(thisText);
					}
					$thisInput.focus();
					$inputParent.find('.searchBox').remove();
				}
			})
			//选择项样式设置
			.find('p')
			.css({
				padding: '3px 5px',
				'box-sizing': 'border-box',
				cursor: 'pointer'
			})
			.hover(
				function () {
					$(this).css('background-color', 'rgb(234, 242, 255)');
				},
				function () {
					$(this).css('background-color', '#fff');
				}
			)
			.find('span')
			.css({
				//添加如果溢出则隐藏功能
				width: '100%',
				overflow: 'hidden',
				'white-space': 'nowrap',
				'text-overflow': 'ellipsis'
			});
	},
	//相关绑定事件
	/**
	 * 绑定快速选择项目
	 * 需上下文存在fastMap快速选择字典
	 * 绑定对于fastInputBox，fastInput之后
	 */
	renderFastInput: function () {
		var $boxList = $('.fastInputBox');
		$boxList.each(function () {
			var $thisBox = $(this);
			var $input = $thisBox.find('.fastInput');
			var codeKey = $input.attr('data-dictkey') || $thisInput.attr('name');
			var fastInfoList = fastMap[codeKey];
			var str = '<div class="fast-select-group">';
			str += '<b style="color: blue">常用：</b>'
			fastInfoList.forEach(function (ele) {
				str += '<span class="fast-select-item">';
				str += ele;
				str += '</span>';
			});
			str += '</div>';
			$thisBox.css('position', 'relative').append(str);
		});
		$('.fast-select-group').on('click', '.fast-select-item', function () {
			var value = $(this).text();
			$(this).parents('.fastInputBox').find('.fastInput').val(value);
		})
	},
	/**
	 * 绑定快速选择项目
	 * 需上下文存在fastMap-userInputList快速选择字典
	 * 绑定对于fastInputBox，fastInput之后
	 */
	renderFastUserInput: function (context) {
		var $boxList = $('.fastUserInputBox');
		$boxList.each(function () {
			var $thisBox = $(this);
			var $input = $thisBox.find('.fastInput');
			var left = $input.prev().width();
			var top = $input.offsetHeight;
			if(context === 'up') {//悬浮框显示在input上面
				top = '-' + $thisBox.get(0).offsetHeight + 'px';
			}else if(context === 'down') {
				top = $thisBox.get(0).offsetHeight + 'px';
			}
			if(context)
				// 写死签名字典
				var fastInfoList = [
					{
						infocode: DEFAULT_USER_ID,
						info: DEFAULT_USER_NAME
					}
				];
			var str = '<div class="fast-select-group" style="left:' + left + 'px;';
			if($thisBox.get(0).offsetHeight){
				str += ' top:' + top + ';';
			}
			str += '"><b style="color: blue">当前用户：</b>'
			fastInfoList.forEach(function (ele) {
				str += '<span class="fast-select-item" title="' + ele.info + '">';
				str += ele.info + '-' + ele.infocode;
				str += '</span>';
			});
			str += '</div>';
			$thisBox.find(".fast-select-group").remove();
			$thisBox.css('position', 'relative').append(str);
		});
		$('.fast-select-group').off('click').on('click', '.fast-select-item', function () {
			var value = $(this).text();
			var id = value.split('-')[1];
			var $inputEl = $(this).parents('.fastUserInputBox').find('.fastInput');
			$inputEl.parent().find('.signImgBox').hide();
			$inputEl.show();
			eicuUtil.queryDoct($inputEl.data('userid', id).val(id));
		})
	},
	bindSearchInput: function (localMap, context, filterColumns) {
		//需要遵循以下结构：外层元素添加searchInputBorderBox，绑定元素添加searchInput
		//<div class="searchInputBorderBox"> div可替换为td或者tr，总之是用以判断如何显示的最外层元素
		//	<label> <span>标签内容</span> <input class="searchInput">  </label>
		//</div>
		var $borderBox, $searchInputList;
		var context = context || $(window.document);
		if (context === 'up' || context === 'down') {
			//如果指定方向或者未指定作用域
			$borderBox = $('.searchInputBorderBox');
			$searchInputList = $('.searchInput');
		} else {
			$borderBox = $('.searchInputBorderBox', context);
			$searchInputList = $('.searchInput', context);
		}
		$borderBox
			.off('click')
			.on('click', function () {
				var $searchBox = $('.searchBox');
				$searchBox.remove();
			})
			.off('keyup')
			.on('keyup', function () {
				if (event.keyCode === 9) {
					//tab键清空选择框
					$('.searchBox').remove();
				}
			});
		$searchInputList
			.attr('placeholder', '回车查询')
			.off('keyup')
			.on('keyup', function () {
				//绑定本地拼音查询事件
				$(this).parent().find('.searchBox').remove();
				if (event.keyCode == 13) {
					eicuUtil.queryDict($(this), localMap, context, filterColumns);
				}
			})
			.each(function () {
				var $thisInput = $(this);
				$thisInput.css({
					height: '24px',
					'line-height': '24px',
					'vertical-align': 'middle',
					'box-sizing': 'border-box'
				});
				var $inputParent = $thisInput.parent();
				if ($inputParent.css('display') === 'inline') {
					$inputParent.css({
						display: 'inline-block'
					});
				}
				$inputParent.css({
					position: 'relative'
				});
			});
	},
	queryDict: function ($thisInput, localMap, context, filterColumns) {
		var inputContent = $thisInput.val();
		var codeKey = $thisInput.attr('data-dictkey') || $thisInput.attr('name');
		var hisList = localMap[codeKey]; //相关结果数组
		// console.log('当前hisList');
		// console.log(hisList);
		// console.log(codeKey);
		// console.log(localMap);
		if ($thisInput.next().hasClass('searchBox')) {
			$thisInput.next().remove();
		}
		// $thisInput.prop("disabled", true);
		var searchBoxStr = '<div class="searchBox">';
		var hasContent = false;
		// console.log("拿到是localMap:");
		// console.log(localMap);
		// console.log("codeKey是：", codeKey);
		// console.log("hisList是：");
		// console.log(hisList);
		var filterArr = publicFun.filterByColumn(inputContent, hisList, filterColumns);
		if (!filterArr.length) {
			if (!hisList || hisList.length === 0) {
				searchBoxStr += '<p>无查询结果</p>';
				hasContent = true;
			} else {
				for (var hisIdx = 0; hisIdx < hisList.length; hisIdx++) {
					var thisVal;
					if (typeof hisList[hisIdx] === 'object') {
						thisVal = hisList[hisIdx]['vsRslt'];
					} else {
						thisVal = hisList[hisIdx];
					}
					if (thisVal.indexOf(inputContent) !== -1 || inputContent === '') {
						searchBoxStr += '<p title="' + thisVal + '">';
						searchBoxStr += '<span class="content">' + thisVal + '</span>';
						searchBoxStr += '</p>';
						hasContent = true;
					}
				}
				if (!hasContent) {
					searchBoxStr += '<p>无查询结果</p>';
					hasContent = true;
				}
			}
		} else {
			for (var idx = 0; idx < filterArr.length; idx++) {
				var thisVal;
				thisVal = filterArr[idx]['vsRslt'];
				searchBoxStr += '<p title="' + thisVal + '">';
				searchBoxStr += '<span class="content">' + thisVal + '</span>';
				searchBoxStr += '</p>';
				hasContent = true;
			}
		}
		searchBoxStr += '</div>';
		$thisInput.after(searchBoxStr);

		$thisInput.parent().css({
			position: 'relative'
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
			$borderBox = $('.signBorderBox');
			$searchInputList = $('.userInput');
		} else {
			$borderBox = $('.signBorderBox', context);
			$searchInputList = $('.userInput', context);
		}
		$borderBox
			.off('click')
			.on('click', function () {
				var $searchBox = $('.searchBox');
				$searchBox.remove();
			})
			.off('keyup')
			.on('keyup', function () {
				if (event.keyCode === 9) {
					//tab键清空选择框
					$('.searchBox').remove();
				}
			});
		//绑定查询事件
		$searchInputList
			.attr('placeholder', '回车查询')
			.off('keyup')
			.on('keyup', function () {
				if (event.keyCode !== 9) {
					// 							如果不是tab键，则清空
					$(this).data('userid', '');
					$(this).parent().find('.searchBox').remove();
				}
				if (event.keyCode == 13) {
					// console.log('触发查询');
					//出发查询时先保存查询内容,清空圆有id并失焦，防止二次触发失焦事件
					var queryContent = $(this).val();
					$(this).data('userid', '').blur().val(queryContent);
					eicuUtil.queryDoct($(this), context);
				}
			})
			.off('blur')
			.on('blur', function () {
				//签名绑定失焦后如果没有具体的userid，则删除内容
				if (!$(this).data('userid')) {
					$(this).val('');
				} else {
					//如果有userid，重新赋值并查询图片
					eicuUtil.queryDoct($(this), context);
				}
			})
			.off('mouseenter')
			.on('mouseenter', function () {
				// hoverin
				$(this).parent().find('.fast-select-group').css({
					opacity: 1,
					zIndex: 20
				})
			})
			.off('click')
			.on('click', function () {
				$('body').find('.searchBox').remove();
			})
			.each(function () {
				var $thisInput = $(this);
				// 增加悬浮快速选中方法
				$(this).addClass('fastInput');
				var $inputParent = $thisInput.parent();
				$inputParent
					.addClass('fastUserInputBox')
					.off('mouseleave')
					.on('mouseleave', function () {
						// hoverout 隐藏快速选择
						// console.log('从父元素出去');
						$(this).parent().find('.fast-select-group').css({
							opacity: 0,
							zIndex: -1
						})
					});
				$thisInput.css({
					height: '24px',
					'line-height': '24px',
					'vertical-align': 'middle',
					'box-sizing': 'border-box'
				});
				if ($inputParent.css('display') === 'inline') {
					$inputParent.css({
						display: 'inline-block'
					});
				}
				if ($inputParent.find('.signImgBox').length === 0) {
					$inputParent.append(
						'<div class="signImgBox"><img src="javascript:;" title="" class="signPic"></div>'
					);
					$inputParent
						.find('.signImgBox')
						.css({
							display: 'none',
							height: '24px',
							'line-height': '24px',
							'overflow-y': 'hidden',
							'vertical-align': 'middle'
						})
						.children()
						.css({
							'vertical-align': 'middle',
							height: '24px',
							'line-height': '1'
						})
				}
			});
		// 调用快速渲染
		eicuUtil.renderFastUserInput(context);
	},
	//查询方法
	/**
	 * params：
	 *  当前元素, 查询结果放在框的上方还是下方('up'--上，'down'--下）
	 * */
	queryDoct: function ($thisInput, context) {
		var context = context || $(window.document);
		//回车查询会优先清空userid，则查询时有userid则一定为失焦事件
		var inputContent = $thisInput.data('userid')
			? $thisInput.data('userid')
			: $thisInput.val();
		if ($thisInput.next().hasClass('searchBox')) {
			$thisInput.next().remove();
		}
		if (inputContent) {
			// $thisInput.prop("disabled", true);
			var queryUrl = _baseUrl + 'user/queryUser_pinyinLike.do';
			var requestParam = 'dstuserCustom.queryLike=' + inputContent;
			publicFun.httpRequest(queryUrl, requestParam, function (res) {
				var doctBoxStr = '<div class="searchBox">';
				if (!res.resultInfo.sysdata) {
					alert_warn(res.resultInfo.message);
					return;
				}
				var userList = res.resultInfo.sysdata.userlist || [];
				if (userList.length === 0) {
					doctBoxStr += '<p>无查询结果</p>';
				} else if (userList.length === 1) {
					//如果只有一条数据直接赋值
					var thisText = userList[0].usrname;
					var thisId = userList[0].userid;
					var signImg = userList[0].signimg;
					var pInfo = {
						text: thisText,
						id: thisId,
						signImg: signImg
					};
					eicuUtil.signElClick($thisInput, pInfo);
					return;
				} else {
					userList.forEach(function (ele) {
						doctBoxStr += '<p>';
						//添加图片data
						doctBoxStr +=
							'<span class="userid" data-signimg="' +
							(ele.signimg || '') +
							'">' +
							ele.userid +
							'</span>';
						doctBoxStr += '-';
						doctBoxStr += '<span class="username">' + ele.usrname + '</span>';
						doctBoxStr += '</p>';
					});
				}
				doctBoxStr += '</div>';
				$thisInput.after(doctBoxStr);
				// $thisInput.prop("disabled", false).focus();
				//查询框相关样式赋值
				eicuUtil.searchBoxReset($thisInput, context);
			});
		}
	},
	//医生查询点击事件
	signElClick: function ($thisInput, pInfo) {
		//选择查询医生
		var vsType = $thisInput.attr('data-vstype');
		var thisInputNameAttr = $thisInput.attr('name');
		var thisText = pInfo.text;
		var thisId = pInfo.id;
		var signImg = pInfo.signImg;
		if (thisText !== '无查询结果') {
			//先添加图片，图片中绑定error事件，如果查询失败或点编辑，删除此元素并将input的type恢复
			//元素模板
			// <div class="signImgBox">
			// 	<img src="" title="" class="signPic">
			// 	<a href="#" onClick="delImg">编辑</a>
			// </div>
			var $inputParent = $thisInput.parent();
			var $thisImgBox = $inputParent.find('.signImgBox');
			// 图片相关属性
			$thisImgBox.css('display', 'inline-block');
			var $thisImg = $thisImgBox.find('.signPic');
			$thisImg
				.attr('src', _baseUrl + 'images/eicu/signPic/' + signImg)
				.attr('title', thisText)
				.attr('data-userid', thisId)
				.off('error')
				.on('error', function () {
					//绑定错误事件
					$thisInput.show();
					$thisImgBox.hide();
				})
				.off('click')
				.on('click', function () {
					//绑定删除按钮事件
					// console.log('删除事件');
					if (!$thisInput.prop('disabled')) {
						$thisImgBox.hide();
						$thisInput.show().focus();
					}
				})
				.show();
			//input赋值
			$thisInput.val(thisText).data('userid', thisId).trigger('change', thisId);
			var event2 = document.createEvent("HTMLEvents");
			event2.initEvent("input", false, true);
			$thisInput[0].dispatchEvent(event2);
			//隐藏此input
			// $thisInput.prop("disabled", false).hide();
			$thisInput.hide();
		}
		$inputParent.find('.searchBox').remove();
	},
	/**
	 * 获取当前custInfo菜单
	 */
	initMenu: function (moduleid) {
		var reqUrl = _baseUrl + 'icuscore/findIcuCustMenu.do';
		var reqParams = {
			moduleid: moduleid
		};
		var extraParams = {
			asyncFlag: false
		}
		publicFun.httpRequest(
			reqUrl,
			reqParams,
			extraParams,
			function (res) {
				// if (!publicFun.ajaxSuccess(res)) {
				//   return;
				// }
				if (!res.resultInfo.success) {
					// publicFun.alert("请求失败，请联系管理员！");
					// return;
				}
				var menuList = res.resultInfo.sysdata.menuList || [];
				// console.log('menuList', menuList);
				var menuTotalStr = '';
				var menuInfoObj = {};
				if(menuList.length !== 0){
					var _basicId = menuList[0].menuId;
					//最外层select_ul
					menuTotalStr += '<ul class="select_ul" style="width:140px">';
					//提高导航栏iframe层级
					menuTotalStr +=
						'<iframe frameborder="0" scrolling="no" style="background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;"></iframe>';
					//最上方左箭头
					menuTotalStr +=
						'<li class="select_li" style="text-align:left;background-color:rgba(104,146,192,0.8)"><a href="#" style ="width:30px;text-align:center" onclick="$(\'#exBtn\').click()">&lt;&lt;</a></li>';
					//
					menuList.forEach(function (menuEl, menuIdx, arr) {
						if (menuEl.menuUrl !== '#') {
							//跳转链接与菜单本id挂钩
							if (!menuInfoObj[menuEl.menuId]) {
								menuInfoObj[menuEl.menuId] = {};
							}
							$.each(menuEl, function (k, v) {
								menuInfoObj[menuEl.menuId][k] = v;
							});
						}
						if (menuEl.idRoot === _basicId) {
							//如果是底层菜单按顺序添加
							var thisMenuId = menuEl.menuId;
							var thisMenuName = menuEl.menuName;
							var childrenArr = arr.filter(function (filterEl) {
								return filterEl.idRoot === thisMenuId;
							});
							if (childrenArr && childrenArr[0]) {
								//如果是二级菜单
								//最外层li
								menuTotalStr += '<li class="select_li expandLi">';
								//一级菜单中显示内容以及右箭头
								menuTotalStr +=
									'<a href = "#" class="specli" style = "position:relative">' +
									thisMenuName +
									'<i class="iconGt">\>\></i></a>';
								//二级菜单ul
								menuTotalStr += '<ul class="inside_ul">';
								//提高二级菜单层级
								menuTotalStr +=
									'<iframe frameborder = "0" scrolling = "no" style = "background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;" ></iframe>';
								childrenArr.forEach(function (sndMenuEl, sndMenuIdxx) {
									menuTotalStr +=
										'<li><a class="pagebtn" pagetype="' +
										thisMenuId + '" ';
									if('TWD' === sndMenuEl.menuType){
										menuTotalStr += ' id="openIe"';
									}
									menuTotalStr +=
										' pageval="' +
										sndMenuEl.menuId +
										'" href="javascript:;">' +
										sndMenuEl.menuName +
										'</a></li>';
								});
								//二级菜单结束
								menuTotalStr += '</ul>';
								//最外层li结束
								menuTotalStr += '</li>';
							} else {
								//如果只有一级菜单
								menuTotalStr +=
									'<li class="select_li"><a href="#" class="pagebtnparent navlia" pagetype="' +
									_basicId +
									'" pageval="' +
									thisMenuId +
									'">' +
									thisMenuName +
									'</a></li>';
							}
						}
					});
					menuTotalStr += '</ul>';
					$('.navDiv').empty().append(menuTotalStr);
					publicFun.setStorage('icuMenu', {
						menuTotalStr: menuTotalStr,
						menuInfoObj: menuInfoObj
					});
				}
			}
		);
	},

	setOuterInfo: function () {
		var search = window.frames['myFrame'] ? window.frames['myFrame'].contentWindow.location.search : window.location.search;
		var totalParam = search.replace('?', '');
		var paramArr = totalParam.split('&');
		var totalObj = {};
		paramArr.forEach(function (ele){
			var arr = ele.split('=');
			totalObj[arr[0]] = arr[1];
		})
		console.log('totalObj', totalObj);
		return totalObj;
	},
	/**
	 * 从外链获取病人数据，参数从url中带入，用liveNo请求数据
	 */
	queryPtBasicInfoFromOuter: function (liveNo){
		if(!liveNo) return;
		var reqUrl = _baseUrl + 'icucust/findCustInfo.do';
		var reqParams = {
			liveNo: liveNo,
		}
		var extraParam = {
			asyncFlag: false,
			requestType: 'json',
		}
		// publicFun.httpRequest(reqUrl, reqParams, extraParam, function(res) {
		// 	if(res.resultInfo.success) {
		// 		var sysdata = res.resultInfo.sysdata;
		// 		eicuUtil.ptBasicInfo = sysdata.icuCustInfoCustom || {};
		// 		eicuUtil.hosInfo = sysdata.hosInfo || {};
		// 	}
		// })

	},

	/**
	 * 查询打印表头信息 新
	 *
	 * @param {string} liveNo
	 * @param {string} paramDate
	 */
	queryPtBasicInfoFromOuterNew: function (liveNo, paramDate, careFlag){
		if(!liveNo) this.preventPrint("查询患者表头参数缺失");

		var self = this;
		var reqUrl = _baseUrl + 'cz/getCzInfo.do';
		var reqParams = {
			regSeq: liveNo,
			paramDate: paramDate,
			udefFlag: careFlag
		}
		var extraParam = {
			asyncFlag: false,
			requestType: 'json',
		}

		var result = null;

		publicFun.httpRequest(reqUrl, reqParams, extraParam, function (res){
			var printCust = res.resultInfo.sysdata.hspDbzlBas;
			printCust.cstSexCod = publicFun.codingEscape(publicFun.getDict('CST_SEX_COD'), printCust.cstSexCod)
			printCust.cstAge = printCust.cstAge || '-'
			printCust.cstAgeName = printCust.cstAge + publicFun.codingEscape(publicFun.getDict('CST_AGE_COD'), printCust.cstAgeCod)
			printCust.crtTim = publicFun.timeFormat(new Date(printCust.crtTim), 'yyyy/MM/dd hh:mm:ss')
			result = printCust;
		});

		return result;
	},
	// geticuDic, for the status of outer system visiting the url
	getIcuCommonDict: function() {
		var reqUrl = _baseUrl + 'icucust/queryIcuBasicDef.do';
		publicFun.httpRequest(reqUrl, function(res) {
			if (res.resultInfo.success) {
				var dictData = res.resultInfo.sysdata;
				publicFun.setStorage('icuDic', dictData);
			}
		});
	},

	// 获取天数
	getInIcuTime: function(start, end) {
		// console.log("------->天")
		// console.log(start, end)
		// console.log(((publicFun.getTimeStamp(end) - publicFun.getTimeStamp(start)) / 3600 / 24 / 1000))
		// console.log((Math.ceil((publicFun.getTimeStamp(end) - publicFun.getTimeStamp(start)) / 3600 / 24 / 1000) + 1 + '天'))
		if(!end) {
			end = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
		}
		return Math.ceil((publicFun.getTimeStamp(end) - publicFun.getTimeStamp(start)) / 3600 / 24 / 1000) + 1 + '天'
	},

	/**
	 * 在输入框中 敲击回车使光标移动到下一个输入框
	 * @param {string} [inputSelector] 默认 'input'
	 * @param {string} [parentSelector] 默认 'body'
	 */
	inputOnEnterFocusNext: function(inputSelector, parentSelector){
		if (inputSelector == null || inputSelector == '') inputSelector = 'input[type="text"]';
		if (parentSelector == null || parentSelector == '') parentSelector = 'body';

		$(inputSelector).on('keypress', function(e) {
			if (e.which === 13) {
				var self = $(this), box = self.parents(parentSelector || 'body'), focusable, next;

				focusable = box.find(inputSelector).filter(':visible');
				next = focusable.eq(focusable.index(this)+1);

				if (next.length) {
					next.focus();
				}

				return false;
			}
		})
	},
	setptBasicInfo: function (liveNo) {
		eicuUtil.ptBasicInfo = {
			liveNo: liveNo
		}
	}

};


// if (sessionStorage.getItem('icutoken') && window.top.getCurPtBasicInfo) { // 是否在顶层框架中
// 	eicuUtil.ptBasicInfo = window.top.getCurPtBasicInfo();
// } else {
// 	try {
// 		// 如果当前标签顶层页面有getBasicInfo方法
// 		eicuUtil.ptBasicInfo = $(eicuUtil.tabInfo[0])
// 			.find('iframe')
// 			.get(0)
// 			.contentWindow.getBasicInfo();
// 	} catch (e) {
// 		// url中有liveNo代表是外链调用
// 		if (!sessionStorage.getItem('icutoken')) {
// 			eicuUtil.queryPtBasicInfoFromOuter(eicuUtil.setOuterInfo().liveNo);
// 		}else {
// 			// 如果不是则动态请求患者信息
// 			eicuUtil.ptBasicInfo = {};
// 		}
// 	}
// }
//
// if(sessionStorage.getItem('icutoken') === null) {
// 	eicuUtil.getIcuCommonDict();
// }
