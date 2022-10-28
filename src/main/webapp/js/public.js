var pathName = window.location.pathname.substring(1);
var webName = pathName == '' ? '' : pathName.substring(0, pathName.indexOf('/'));
var BaseUrl = window.location.protocol + '//' + window.location.host + '/' + webName + '/';
var _storage = window.localStorage;

var publicFun = {
	/**
	 * [setItem 存数据]
	 * @param {[String]} key [key]
	 * @param {[type]} val [数据]
	 */
	setItem : function(key, val) {
		if (!key) {
			return
		}
		if (typeof val !== 'string') {
			val = JSON.stringify(val)
		}
		_storage.setItem(key, val)
	},
	/**
	 * [removeItem 移除某个]
	 * @param  {[String]} key [key]
	 */
	removeItem : function(key) {
		if (!key) {
			return
		}
		_storage.removeItem(key)
	},
	getItem : function(key) {
		try {
			var value = _storage.getItem(key);
			if (value) {
				return JSON.parse(value)
			} else {
				return value
			}
		} catch (e) {
			return null
		}
	},
	getDict : function(key) {
		if (!publicFun.getItem('allDict')) {
			publicFun.httpServer({
				url : BaseUrl + 'dict/allDictInfo.do',
				isNoLoad : true,
				isAsync : false
			}, {}, function(res) {
				try {
					publicFun.setItem("allDict", res);
					return publicFun.getItem('allDict')[key]
				} catch (e) {
					return []
				// console.error('无法存储数据')
				}
			})
		} else {
			return publicFun.getItem('allDict')[key]
		}
	},
	alert : function(msg) {
		$.messager.alert("提示信息", msg, "warning");
	},
	successalert : function(msg) {
		$.messager.alert("提示信息", msg, "success");
	},
	handleTimeNum : function(_num) {
		var returnNum;
		returnNum = _num > 9 ? _num.toString() : "0" + _num;
		return returnNum;
	},
	creatMoney : function(money, n) {
		n = n > 0 && n <= 20 ? n : 2;
		money = parseFloat((money + "").replace(/[^\d\.-]/g, "")).toFixed(n) + "";
		var l = money.split(".")[0].split("").reverse(),
			r = money.split(".")[1];
		t = "";
		for (i = 0; i < l.length; i++) {
			t += l[i] + ((i + 1) % 3 == 0 && (i + 1) != l.length ? "," : "");
		}
		return "￥" + t.split("").reverse().join("") + "." + r;
	},
	//timeFormat
	timeFormat : function(date, fmt) {
		if (date) {
			var _date;
			_date = new Date(date);
			var o = {
				"M+" : _date.getMonth() + 1, //月份 
				"d+" : _date.getDate(), //日 
				"h+" : _date.getHours(), //小时 
				"m+" : _date.getMinutes(), //分 
				"s+" : _date.getSeconds() //秒 
			};
			if (/(y+)/.test(fmt)) {
				fmt = fmt.replace(RegExp.$1, (_date.getFullYear() + "").substr(4 - RegExp.$1.length));
			}
			for (var k in o) {
				if (new RegExp("(" + k + ")").test(fmt))
					;
				fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
			}
			return fmt;
		} else {
			return ''
		}
	},
	//上一个月
	getPreMonth : function(date, fg) {
		var _today = {
			year : new Date(date).getFullYear(),
			month : new Date(date).getMonth(),
			date : new Date(date).getDate()
		};
		var preMonthDay = publicFun.timeFormat(new Date(_today.year, _today.month - 1, _today.date), "yyyy/MM/dd");
		return preMonthDay
	},

	//动态展示easyUI的按钮中ajax的方法
	ajaxVal : function(extraParms, toolbar_v, callBack) { //extraParms:页面的moduleid值
		$.ajax({
			type : "post",
			url : BaseUrl + 'btnload.do?moduleid=' + extraParms,
			datatype : 'json',
			success : function(data) {
				toolbar_v = []; //定义工具栏
				$.each(data, function(idx, val) {
					toolbar_v.push({ //往工具栏中添加内容
						id : val.handler, //id
						text : val.text, //按钮内容
						iconCls : val.iconCls, //按钮图标
						handler : function() {
							eval("cmd" + val.handler + "();"); //点击按钮触发的方法
						}
					})
				});
				callBack(toolbar_v); //返回工具栏内容
			}
		})
	},
	//动态展示按钮中ajax的方法
	ajaxValTyp2 : function(extraParams, className, getBtn, type) { //extraParams:页面的moduleid值
		var text1,
			text2,
			dataLth;
		var ulContent = '';
		$.ajax({
			type : "post",
			url : BaseUrl + 'btnload.do?moduleid=' + extraParams,
			datatype : 'json',
			success : function(data) {
				var rtnBtn = '',
					ulAll = '';
				$.each(data, function(idx, val) {
					text1 = "<a class='" + className + "' id='" + val.handler + "' href='javascript:;'";
					text2 = " onclick='" + val.handler + "()'>" + val.text + "</a>";
					ulContent += "<li onclick='" + val.handler + "()'>" + val.text + "</li>";
					rtnBtn += text1 + text2;
				});
				dataLth = data.length;
				if (type == '') {
					getBtn(rtnBtn); //获取按钮
				} else if (type == 'ul') {
					ulAll = ulContent + "<input type='text' class='dtaLth hidden' style='display:none>" + dataLth + "</input>";
					getBtn(ulAll, rtnBtn); //获取按钮
				}
			}
		});
	},
	//关闭此窗口
	closeThisWindows : function() {
		parent.$(".tabs-selected .tabs-close").click();
	},
	setTableWidth : function(elem, percentage) {
		return Math.round($(elem).width() * percentage)
	},
	strTrim : function(str) {
		if (typeof str !== 'string') {
			return
		}
		return str.replace(/(^\s*)|(\s*$)/g, "");
	},
	checkItemNull : function(item) {
		if (item == null || publicFun.strTrim(item) === '') { // 其中第二个不用全等的在于 => null == undefined
			return true
		} else {
			return false
		}
	},
	// 防抖
	debounce: function (fn,delay) {
		var timer
		return function () {
			var that = this
			if (timer) {
				clearTimeout(timer)
			}
			timer = setTimeout(function () {
              fn.call(that)
			},delay)
		}
	},
	ajaxLoading: function(msg) {
		$("<div class=\"datagrid-mask\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body");
		$("<div class=\"datagrid-mask-msg\"></div>").html(msg).appendTo("body").css({display:"block",left:($(document.body).outerWidth(true) - 190) / 2,top:($(window).height - 200) / 2});
	},
	ajaxLoadEnd: function (){
	    $(".datagrid-mask").remove();
	    $(".datagrid-mask-msg").remove();
    },
	/**
	 * @@httpServer 封装的http服务
	 * @param  {object}     baseParam   url type timeout isAsync requestDataType returnType isNoLoad crossMsg[是否cors跨域]
	 * @param  {object}     params      参数
	 * @param  {function}   successCall 成功的回调
	 * @param  {function}   errorCall   失败的回调
	 */
	httpServer : function(baseParam, params, successCall, errorCall) {
		var _content = ''; // 指定传输的类型
		var _requestDataType = baseParam.requestDataType || '';
		if (_requestDataType === 'json') { // 传对象
			_content = 'application/json; charset=utf-8';
			params = JSON.stringify(params);
		} else {
			_content = 'application/x-www-form-urlencoded; charset=utf-8'
		}
		var _notLoad = baseParam.isNoLoad || false;
		var _isAsync = true;
		if (baseParam.isAsync === false) {
			_isAsync = false;
		}
		var _ajaxParam = {
			url : baseParam.url,
			type : baseParam.type || 'post',
			dataType : baseParam.returnType || 'json',
			data : params,
			timeout : baseParam.timeout || 30000,
			async : _isAsync, // 默认是true：异步，false：同步。
			cache : false, // 不缓存
			contentType : _content, // 指定这个协议很重要
			beforeSend : function() {
				if (!_notLoad) {
					$("body").append('<div id="load" class="loadingWrapBox" style="width:99%;position:absolute;top:40%;text-align:center;"><img src="' + BaseUrl + 'images/common/loading.gif" /></div>');
				}
			},
			success : function(res) {
				successCall(res);
			},
			error : function(err) {
				var _errorList = [ {
					info : '请求失败，请求未找到!',
					cod : 404
				}, {
					info : '（服务不可用） 目前无法使用服务器（由于超载或进行停机维护）',
					cod : 503
				},
					{
						info : '（服务器内部错误）  服务器遇到错误，无法完成请求。',
						cod : 500
					}, {
						info : '服务器不理解请求的语法。',
						cod : 400
					},, {
						info : '服务器拒绝请求。',
						cod : 403
					} ];
				_errorList.forEach(function(item, index) {
					if (item.cod == err.status) {
						publicFun.alert(item.info);
					} else {
						if (errorCall) {
							errorCall(err)
						}
					}
				})
			},
			complete : function(XMLHttpRequest, status) {
				if (status == 'success') {
					$('#load').remove();
					$('.loadingWrapBox').remove();
				}
			}
		}
		if (baseParam.returnType === 'jsonp') {
			baseParam.type = 'get'; // jsonp跨域只能 get
			_ajaxParam.jsonp = baseParam.jsonp || 'callback';
		}
		if (baseParam.crossMsg === 'cross') { // CORS 跨域
			_ajaxParam.xhrFields = {
				withCredentials : true
			};
			_ajaxParam.crossDomain = true
		}
		$.ajax(_ajaxParam);
	},
	httpServ: function(type, url, params, successCall, errorCall, timeout) {
        $.ajax({
            url: url,
            type: type || 'post',
            dataType: 'json',
            data: params,
            timeout: timeout || 5000,
            success: function(res) {
                successCall(res);
            },
            error: function(err) {
                errorCall(err);
            },
            complete: function(XMLHttpRequest, status) {
                if (status == 'timeout') {
                    $('#load').remove();　　　
                }
            }
        })
    },
	calculateAge : function(str) {
		var _notFillObj = {
			Age : '',
			type : '0' // 年
		}
		if (!str || str.length < 10) {
			return _notFillObj;
		} //为空不做操作返回
		var r = str.match(/^(\d{1,4})(-|\/)(\d{1,2})\2(\d{1,2})$/);
		if (r == null) {
			return _notFillObj;
		}
		var d = new Date(r[1], r[3] - 1, r[4]);
		var newDate = new Date();
		var year = newDate.getFullYear(); //年
		var month = newDate.getMonth() + 1; //月
		var date = newDate.getDate(); //日
		if (d.getFullYear() == r[1] && (d.getMonth() + 1) == r[3] && d.getDate() == r[4]) {
			var timeLap = parseInt((newDate - d) / (3600 * 1000 * 24)); // 获取时间差的天数
			var days = new Date(year, month, 0).getDate(); // 获取当前月份的天数
			var yearDay = new Date(year, 2, 0).getDate() === 29 ? 366 : 365; //获取当前年份的天数
			var lastYearDay = new Date((year - 1), 2, 0).getDate() === 29 ? 366 : 365; // 获取当前年份前一年的天数
			var twoYearDay = yearDay + lastYearDay;
			if (timeLap < days && timeLap >= 0) {
				return {
					Age : (timeLap),
					type : '2', //日
					typeStr : '日' //日
				}
			} else if (timeLap >= twoYearDay) {
				if (month >= r[3]) {
					return {
						Age : year - r[1],
						type : '0', //年
						typeStr : '岁'//岁
					}
				} else {
					return {
						Age : year - r[1] - 1,
						type : '0', //年
						typeStr : '岁'//岁
					}
				}
			} else if (timeLap >= days && timeLap < twoYearDay) {
				if (year == r[1]) {
					if (date >= r[4]) {
						return {
							Age : month - r[3],
							type : '1', //月
							typeStr : '月'//月
						}
					} else {
						return {
							Age : month - r[3] - 1,
							type : '1', //月
							typeStr : '月'//月
						}
					}
				} else {
					var _monthCycle = 0;
					if (timeLap >= yearDay) {
						_monthCycle = 12;
					}
					if (date < r[4]) {
						_monthCycle = _monthCycle - 1;
					}
					if (month > r[3]) {
						return {
							Age : _monthCycle + (month - r[3]),
							type : '1', //月
							typeStr : '月'//月
						}
					} else {
						if (r[3] == month && date >= r[4]) {
							return {
								Age : _monthCycle + (r[3] - month),
								type : '1', //月
								typeStr : '月'//月
							}
						} else {
							return {
								Age : _monthCycle + 12 - (r[3] - month),
								type : '1', //月
								typeStr : '月'//月
							}
						}
					}
				}
			} else if (((newDate - d) / (3600 * 1000 * 24)) < 0) {
				publicFun.alert("请输入正确的出生日期")
				return _notFillObj;
			}
		}
	},

	SearchList : function(userNameParam, userListParam, NoId) {
		var type = '';
		if (NoId == 'isClass') {
			type = '.'
		} else {
			type = '#'
		}
		var usersign = $(type + userNameParam).val();
		$.ajax({
			url : BaseUrl + "user/findUserByNameAndNo.do",
			type : "post",
			data : {
				"dstuserCustom.usrno" : usersign
			}
		}).done(function(res) {
			var userListDom = "";
			if (res.length) {
				$(type + userListParam).show();
				$.each(res, function(idx, val) {
					userListDom += "<li onclick=\"publicFun.chooseUser('" + val.usrno + "','" + val.usrname + "','" + userNameParam + "','" + userListParam + "','" + NoId + "')\">" + val.usrname + "</li>";
				});
				userListDom = "<ul>" + userListDom + "</ul>";
			} else {
				$(type + userListParam).hide();
			// publicFun.alert("查无数据");
			}
			$(type + userNameParam).val("");
			$(type + userListParam).html(userListDom);
		})
	},

	chooseUser : function(id, name, nameObj, listObj, NoId) {
		if (window.event.stopPropagation) { //非IE 
			window.event.stopPropagation(); // 取消冒泡事件
			window.event.preventDefault() // 取消默认的事件
		} else { //IE 
			window.event.cancelBubble = true;
			window.event.returnValue = false
		}
		var selType = '';
		if (NoId == 'isClass') {
			selType = '.'
		} else {
			selType = '#'
		}
		var userDoc = 'userDoc' + nameObj.substr(nameObj.length - 1, nameObj.length);
		$(selType + userDoc).val(id)
		$(selType + nameObj + "Num").val(id);
		$(selType + nameObj).val(name);
		$(selType + listObj).html("");
		$(selType + listObj).hide();
	},
	cleanSignMsg : function(id) { // 清空签名Num
		if (publicFun.strTrim($('#' + id).val()) === '') {
			$('#' + id + 'Num').val('');
		}
	},
	// 不回车输入姓名和修改姓名时 对工号处理
	fillDoCNameCod : function(docIdText, codId) {
		if (publicFun.strTrim(docIdText) === '') {
			$('#' + codId).val('')
		}
		publicFun.httpServer({
			url : BaseUrl + 'user/findUserByNameAndNo.do',
			isNoLoad : true
		}, {
			"dstuserCustom.usrno" : docIdText
		}, function(res) {
			if (res.length == 1) {
				$('#' + codId).val(res[0].usrno)
			}
		})
	},
	/**
	 * 本系统checkbox变成单选
	 **/
	radioClicks : function(list, msgData, idx) {
		var currentChecked = list[idx]['checked'];
		$.each(list, function(index, value) {
			value['checked'] = false;
		});
		list[idx]['checked'] = !currentChecked;
		if (list[idx]['checked'] == true) {
			msgData = list[idx]['infocode'];
		} else {
			msgData = '';
		}
		return msgData
	},
	/**
	 * @ input checkBox 多选
	 */
	checkClicks : function(list, obj, idx, hideObj) {
		var currentData = $.inArray((list[idx]['infocode']), obj);
		if (list[idx]['checked'] === false) {
			list[idx]['checked'] = true
			if (currentData === -1) {
				obj.push(list[idx]['infocode'])
			}
		} else {
			list[idx]['checked'] = false
			if (currentData !== -1) {
				obj.splice(currentData, 1)
			}
		}
		if (obj) {
			hideObj = obj.join()
		}
		return hideObj
	},
	/** 
	 * [{infocode:'1',isCheck:'0'},{infocode:'1',isCheck:'1'}...]
	 * 针对页面突发改动List的情况
	 **/
	checkClickJson : function(list, obj, idx, hideObj) {
		var hideObj = [];
		$.each(list, function(indx, valu) {
			hideObj.push({
				infocode : valu['infocode'],
				isCheck : '0'
			})
		})
		var currentData = $.inArray((list[idx]['infocode']), obj);
		if (list[idx]['checked'] === false) {
			list[idx]['checked'] = true
			if (currentData === -1) {
				obj.push(list[idx]['infocode'])
			}
		} else {
			list[idx]['checked'] = false
			if (currentData !== -1) {
				obj.splice(currentData, 1)
			}
		}
		$.each(hideObj, function(index, value) {
			if ($.inArray((value['infocode']), obj) > -1) {
				value['isCheck'] = '1'
			}
		})
		hideObj = JSON.stringify(hideObj)
		return hideObj
	},
	/** 
	 * 用于多选时一一遍历 返回索引值
	 * arr: 选中的infocode合成的List
	 * val: 页面List的某一项的infocode
	 **/
	inArrayDoubleCheck : function(val, arr) {
		var returnMsg = -1;
		for (i = 0; i < arr.length; i++) {
			if (val == arr[i]) {
				returnMsg = i
			}
		}
		return returnMsg
	},
	/* @@onlyNumber 限制只能输入数字
	* @param  {string}  currentVal
	* @param  {number}  step max 
	*/
	onlyNumber : function(currentVal, step, max) {
		if (max && currentVal > max) {
			var length = currentVal.length;
			currentVal = currentVal.substring(0, length - 1)
		}
		if (step) {
			currentVal = currentVal.replace(/[^\d.]/g, '').replace(/^\./g, '').replace(/\.{2,}/g, '').replace('.', '$#$').replace(/\./g, '').replace('$#$', '.')
			var testStr = currentVal,
				testStrList = testStr.split('.')
			if (testStrList.length > 1) {
				if (testStrList[1].length > step) {
					currentVal = parseFloat(testStr).toFixed(parseInt(step)).toString()
				}
			}
		} else {
			currentVal = currentVal.replace(/[\D]/g, '')
		}
		return currentVal
	},
	// 所有时间查询的判断统一归在public中，方便直接调用
	searchTime : function(start, end) {
		if (start == null || start == '') {
			publicFun.alert("开始时间不能为空！");
			return false;
		}
		if (end == null || end == '') {
			publicFun.alert("结束时间不能为空！");
			return false;
		}
		if (start > end) {
			publicFun.alert("结束时间需大于开始时间！");
			return false;
		}
		return true;
	},
	/**
	 * @@keyDownRecall 封装的回车事件
	 * @param  {object}     evt        
	 * @param  {function}   focusCall  焦点聚焦时触发的事件
	 * 页面中的回车事件统一写在这边
	 */
	keyDownRecall : function(evt, focusCall) {
		var isie = (document.all) ? true : false;
		var key;
		var srcobj;
		// if the agent is an IE browser, it's easy to do this.
		if (isie) {
			key = event.keyCode;
			srcobj = event.srcElement;
		} else {
			key = evt.which;
			srcobj = evt.target;
		}
		if (key == 13 && srcobj.type != 'button' && srcobj.type != 'submit' && srcobj.type != 'reset' && srcobj.type != 'textarea' && srcobj.type != '') {
			if (focusCall) {
				var _flg = focusCall();
				if (_flg === false) {
					return _flg;
				}
			}
			if (isie) {
				event.keyCode = 9;
			} else {
				var el = publicFun.getNextElement(evt.target);
				// console.log(el);
				if (el.className != 'hidden' && (el.type != 'checkbox' || el.type != 'radio')) {
				} else {
					while (el.className == 'hidden' || el.type == 'checkbox' || el.type == 'radio') {
						el = publicFun.getNextElement(el);
					}
				}
				if (!el) {
					return false;
				} else {
					el.focus();
				}
			}
		}
	},
	getNextElement : function(field) {
		var form = field.form;
		for (var e = 0; e < form.elements.length; e++) {
			if (field == form.elements[e]) break
		}
		return form.elements[++e % form.elements.length]
	},
	getAllNormalRange : function() {
		publicFun.httpServer({
			url : BaseUrl + 'icuVsDef/getIcuVsDefList.do',
			isNoLoad : true
		}, {}, function(res) {
			allRangeMsg = res.resultInfo.sysdata.list;
			publicFun.setItem('rangeList', allRangeMsg);
		})
	},
	judgeIsNormalRange : function(type, judgeVal) {
		// 1 体温 2 心率 3 脉率 4 收缩压 5 舒张压 6 SP02
		var _currentResult = '',
			_data = publicFun.getItem('rangeList');
		for (var k = 0; k < _data.length; k++) {
			if (_data[k].vsType === type) {
				if (isNaN((judgeVal - 0))) {
					return ''
				}
				_currentResult = judgeVal;
				if (_data[k].vsLowLmt && _data[k].vsUppLmt) {
					if (parseFloat(_currentResult) > parseFloat(_data[k].vsUppLmt)) {
						return "color:#dc3545;";
					} else if (parseFloat(_currentResult) < parseFloat(_data[k].vsLowLmt)) {
						return "color:#28a745";
					} else {
						return "";
					}
				} else {
					return ""
				}
				break;
			}
		}
	},
	codingEscape : function (codingSchedule, value) {
	    var _value;
	    if (codingSchedule.length === 0 || !value) {
	        _value = '-'
	    } else {
	        $.each(codingSchedule, function(index, val) {
	            if (val['infocode'] === value) {
	                _value = val['info']
	            }
	        });
	    }
	    return _value
	},
	getPercent : function(num, total) {
       num = parseFloat(num);
       total = parseFloat(total);
       if (isNaN(num) || isNaN(total) || total == 0) {
           return "-";
       }
       return total <= 0 ? "0%" : (Math.round(num / total * 10000) / 100.00);
    },
    httpRequest: function (url, requestData, baseParams, successCall, errorCall) {
        /**规则：
         * 可以省略requestData，省略后requestData为空
         * 省略requestData后，不可再设定baseParams
         * 可以省略baseParams，省略后按照默认表单数据POST超时5000方式传递
         * 可以省略successCall，如要设定errorCall，successCall不可省略
         */
        /**baseParams  type:obj
         *  asyncFlag-----async; true||false
         *  ajaxType------type; "POST"||"GET"
         *  requestType---contentType; "application/json...."
         *  returnType----dataType;  "json"||"XML"||"javascript"...
         *  timeout--timeout
         */
        var requestData = requestData || {},
            baseParams = baseParams || {},
            successCall = successCall,
            errorCall = errorCall;
        //如果requestData和baseParams被忽略，重定向参数
        if ((typeof arguments[1] === "function")) {
            successCall = arguments[1];
            errorCall = arguments[2];
            baseParams = {};
            requestData = {};
        }
        //如果baseParams被忽略，重定向参数
        if ((typeof arguments[2] === "function")) {
            successCall = arguments[2];
            errorCall = arguments[3];
            baseParams = {};
        }
        var requestType = baseParams.requestType;
        var async = baseParams.asyncFlag === false ? false : true;
        var contentType;
        if (requestType === "json") {
            contentType = "application/json;charset=UTF-8";
            requestData = JSON.stringify(requestData);
        } else {
            contentType = "application/x-www-form-urlencoded; charset=UTF-8";
        }
        var ajaxOption = {
            url: url,
            async: async,
            type: baseParams.ajaxType || 'post',
            contentType: contentType, //提交数据的类型
            data: requestData,
            dataType: baseParams.returnType || 'json', //接收数据类型
            timeout: baseParams.timeout || 60000,
            success: function (res) {
                if (res.resultInfo && !res.resultInfo.success && res.resultInfo.messageCode === 109) {
                    //登陆超时，重新登录
                    window.top.location.reload();
                } else if (successCall) {
                    successCall(res);
                }
            },
            error: function (err) {
                switch (err.status) {
                    case 404:
                        publicFun.alert('请求失败，请求未找到!')
                        break;
                    case 503:
                        publicFun.alert('（服务不可用） 目前无法使用服务器（由于超载或进行停机维护）')
                        break;
                    case 500:
                        publicFun.alert('（服务器内部错误）  服务器遇到错误，无法完成请求。')
                        break;
                    case 400:
                        publicFun.alert('服务器不理解请求的语法。 ')
                        break;
                    case 403:
                        publicFun.alert('服务器拒绝请求。 ')
                        break;
                }
                if (errorCall) {
                    errorCall(err)
                }
            },
            complete: function (XMLHttpRequest, status) {
                if (status == 'timeout') {
                    publicFun.alert("请求超时");
                    // $('#load').remove();
                }
            }
        };
        if (ajaxOption.dataType === 'jsonp') {
            //跨域请求，修改相关参数
            ajaxOption.type = 'GET';
            if (baseParams.jsonp) {
                ajaxOption.jsonp = baseParams.jsonp;
            } else if (baseParams.jsonpCallback) {
                ajaxOption.jsonpCallback = baseParams.jsonpCallback;
            }
            if (!ajaxOption.jsonp && !ajaxOption.jsonpCallback) {
                console.warn('跨域请求，请填写jsonp或jsonpCallback字段');
            }
        }
        var jqXHR = $.ajax(ajaxOption);
        return jqXHR;
    }
};