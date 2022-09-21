//加载数据字典信息，value值为id
function getDictinfolist(typecode){

}

//统一封装方法，作用：提示信息
function message_alert(data,callbackFn){
	//从返回的json数据中获取结果信息
	var data_v = data.resultInfo;
	//提交结果类型
	var type=data_v.type;
	//结果提示信息
	var message=data_v.message;
	//alert(message);
	if(type==0){
		//如果type等于0表示失败，调用 jquery easyui的信息提示组件
		$.messager.alert('提示信息',message,'error');
	}else if(type==1){
		$.messager.alert('提示信息',message,'success');
	}else if(type==2){
		$.messager.alert('提示信息',message,'warning',callbackFn);
	}else if(type==3){
		$.messager.alert('提示信息',message,'info');
	}
}


//jqueryeasyui messager封装
var alert_success = function(message){
	alert_base(message,"success");
};

var alert_error = function(message){
	alert_base(message,"error");
};

var alert_info = function(message){
	alert_base(message,"info");
};

var alert_warn = function(message){
	alert_base(message,"warning");
};

var alert_none = function(message){
	alert_base(message);
};

var alert_base = function(message,iconType,details){
	$.messager.alert('系统提示信息',message,iconType);
};

/**
 * 系统提交统一提示窗口，采用jquery easyui的模式window实现
 */
var TYPE_RESULT_FAIL = 0;
var TYPE_RESULT_SUCCESS = 1;
var TYPE_RESULT_WARN = 2;
var TYPE_RESULT_INFO = 3;
//将失败明细信息展示
var _alert = function(resultInfo) {
	var type = resultInfo.type;
	
	switch (type) {
		case TYPE_RESULT_FAIL:
			submit_alert_error(resultInfo);
			break;
		case TYPE_RESULT_SUCCESS:
			submit_alert_success(resultInfo);
			break;
		case TYPE_RESULT_WARN:
			submit_alert_warn(resultInfo);
			break;
		case TYPE_RESULT_INFO:
			submit_alert_info(resultInfo);
			break;
		default:submit_alert_info(resultInfo);
	}
	;
	//取消加载框，某些情况自动取消不了这里需要再次调用
	$("#load").remove();
};

var submit_alert_success = function(resultInfo){
	submit_alert_base(resultInfo,"success");
};

var submit_alert_error = function(resultInfo){
	submit_alert_base(resultInfo,"error");
};

var submit_alert_info = function(resultInfo){
	submit_alert_base(resultInfo,"info");
};

var submit_alert_warn = function(resultInfo){
	submit_alert_base(resultInfo,"warning");
};



var submit_alert_base = function(resultInfo,iconType){
	
	//提示代码
	var messageCode = resultInfo.messageCode;
	//提示信息
	var message = resultInfo.message;
	//提示信息明细
	var details= resultInfo.details;
	
	
	submit_alert_show(iconType,messageCode,message,details,350,250);
};

//明细提示窗口
function messagewindow(title,width,height,html){
	this.title=title;
	this.width=width; 
	this.height=height;
	this.html=html;
	var id = new Date().getMilliseconds();
	this.windowid="message_win_"+id;
}
messagewindow.prototype.createWindow = function(){
	var active = document.createElement("div");
	active.id="active";
	document.body.appendChild(active);
	var win = $("<div id="+this.windowid+" class=\"easyui-window\" modal='true' closed='true'  iconCls=\"icon-save\" >"+this.html+"</div>");
	win.window({
		title: this.title,
		width: this.width,
		modal: true,
		shadow: false,
		minimizable:false,
		collapsible:false,
		closed: true,
		height: this.height
	});
	this.open();
};
messagewindow.prototype.open = function(){
	$('#'+this.windowid).window('open');
};
messagewindow.prototype.close = function(){
	$('#'+this.windowid).window('close');
};

//模式窗口单一实例
var messagewindow_singleobj;
//系统提交提示窗口显示
function submit_alert_show(iconType,messageCode,message,messagelist,width,height){
	
	var html='<div style="width: 93%; height: auto;padding:10px" title="" >';
	//icon
	html +='<div class="messager-icon messager-'+iconType+'"></div>';
	//系统代码
	html +='<div>提示代码：'+messageCode+'</div>';
	html +='<div>提示信息：'+message+'</div>';
	html +='<div style="clear:both;"></div>';
	//详细信息
	var deltail='';
	
	if(messagelist){
		for(var index=0;index<messagelist.length;index++){
			deltail+='<div style="width: 100%;">';
			if(messagelist[index].index){
				deltail+='序号：'+messagelist[index].index+' ';
			}
			deltail+=messagelist[index].message+'</div>';
		}
	}
	html +=deltail;
	//按钮
	html +='<div style="width: 100%;"><div class="dialog-button" style="text-align:center;"><a href="javascript:closemessagewindow()" class="l-btn"><span class="l-btn-left"><span class="l-btn-text">确定</span></span></a></div></div>';
	//结束
	html +='</div>';
	messagewindow_singleobj = new messagewindow("系统提示",width,height,html);
	messagewindow_singleobj.createWindow();

}
//关闭模式窗口
function closemessagewindow(){
	if(messagewindow_singleobj){
		messagewindow_singleobj.close();
	}
}


var _confirm = function(question,method_cancel,method_ok){
	$.messager.confirm('系统提示', question, function(r) {
		if (r) {
			if(method_ok){
				method_ok();
			}
		}else{
			if(method_cancel){
				method_cancel();
			}
		}
	});
	
};

//获取返回结果信息对象
function getCallbackData(data){
	return data.resultInfo;
}

//form表单数据转成json
(function($){  
    $.fn.serializeJson=function(){  
        var serializeObj={};  
        var array=this.serializeArray();  
        var str=this.serialize();  
        $(array).each(function(){  
            if(serializeObj[this.name]){  
                if($.isArray(serializeObj[this.name])){  
                    serializeObj[this.name].push(this.value);  
                }else{  
                    serializeObj[this.name]=[serializeObj[this.name],this.value];  
                }  
            }else{  
                serializeObj[this.name]=this.value;   
            }  
        });  
        return serializeObj;  
    };  
})(jQuery); 

//********模式窗口类***********

function modalwindow(title,width,height,url,scrolling,hideOtherBtn){
	this.title=title;
	this.width=width;
	this.height=height;
	this.url=url;
	var id = new Date().getMilliseconds();
	this.windowid="win_"+id;
	this.iframeid="iframe_"+id;
	this.scrolling=scrolling||"yes";
	if (hideOtherBtn === false) {
		this.hideOtherBtn = false;
	} else {
		this.hideOtherBtn = true
	}
	this.windowClass = "win_confirmCritical"; // 特殊定义某个弹框的class;
}
modalwindow.prototype.createWindow = function(){
	var active = document.createElement("div");
	active.id="active";
	document.body.appendChild(active);
	var win = $("<div id="+this.windowid+" class="+ this.windowClass +"><iframe style=\"background-color:transparent; position: absolute; z-index: -1; width: 100%; height: 100%; top: 0; left:0;\" frameborder=\"0\"></iframe></div>");
	var ifr = $("<iframe scrolling='"+this.scrolling+"' style='overflow-x:hidden;' id='"+this.iframeid+"' src='"+this.url+"' frameborder='0' width='100%' height='100%'></iframe>");
	win.window({
		title: this.title,
		width: this.width,
		modal: true,
		shadow: false,
		minimizable:false,
		collapsible:false,
		closed: true,
		maximizable: this.hideOtherBtn,
		closable: this.hideOtherBtn,
		height: this.height
	});
	win.append(ifr);
	this.open();

};
modalwindow.prototype.open = function(){
	$('#'+this.windowid).window('open');
};
modalwindow.prototype.close = function(){
	$('#'+this.windowid).window('close');
};

//模式窗口单一实例
var modalwindow_singleobj;
//创建模式窗口
function createmodalwindow (title,width,height,url,scrolling, hideOtherBtn){
	url = encodeURI(url);
	modalwindow_singleobj = new modalwindow(title,width,height,url,scrolling, hideOtherBtn);
	modalwindow_singleobj.createWindow();
	sessionStorage.setItem("isValidateForm", "false");
}
//关闭模式窗口
function closemodalwindow(){
	if(modalwindow_singleobj){
		modalwindow_singleobj.close();
	}
	sessionStorage.setItem("isValidateForm", "false");
}
////////////////////////////////////////////////
modalwindow.prototype.createWindow_max = function(){
	var active = document.createElement("div");
	active.id="active";
	document.body.appendChild(active);
	var win = $("<div id="+this.windowid+"></div>");
	var ifr = $("<iframe scrolling='"+this.scrolling+"' style='overflow-x:hidden;' id='"+this.iframeid+"' src='"+this.url+"' frameborder='0' width='100%' height='100%'></iframe>");
	win.window({
		title: this.title,
		width: this.width,
		modal: true,
		shadow: false,
		minimizable:false,
		maximizable:true,
		maximized:true,
		collapsible:false,
		closed: true,
		height: this.height
	});
	win.append(ifr);
	this.open();

};
//创建模式窗口
function createmodalwindow_max(title,width,height,url,scrolling){
	modalwindow_singleobj = new modalwindow(title,width,height,url,scrolling);
	modalwindow_singleobj.createWindow_max();
	sessionStorage.setItem("isValidateForm", "false");
}
//************以上为模式窗口类*************

//************以下工具类*************
//Grid 工具类
var GridUtils = {
	checkChecked : function(rows){//检查grid是否有勾选的行, 有返回 true,没有返回true
		if(rows != null){
			if(Array.isArray(rows)){
				if(rows.length == 1){
					return true;
				}else{
					$.messager.alert('警告',"请选中正确记录.",'warning');
					return false;
				}
			}
			return true;
		}
		$.messager.alert('警告',"未选中记录.",'warning');
		return false;
	}
};

//字符串工具类
var StrUtils = {
		isNotNullAndEmptyByTrim : function(str){//检查grid是否有勾选的行, 有返回 true,没有返回true
			if(str != null && str != "" && str !="undefined" && (str.replace(/(^\s*)|(\s*$)/g, "")) != ""){
				return true;
			}
			return false;
		}
};

//提示工具类
var MsgUtils = {
		messager_alert : function(title, msg, icon,callbackFn){//检查grid是否有勾选的行, 有返回 true,没有返回true
			$.messager.alert(title,msg,icon,callbackFn);//icon有error,success,warning,info
		}
};
