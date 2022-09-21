var parentBasicPage = parent.$('#tabDiv').length !== 0 ? true : false; //父元素是否为basicPage，目前有basicPage和hzAtSheet两种情况
var scoreTitle = parent.parent.getScoreTitle(_gradeType);
/**
 *  与父元素相关公共回调
 */
function parentRelativeCallback(res) {
	if (parentBasicPage) {
		insertuser_callback(res)
	} else {
		parent.modalReturnFun(vm.modsSco, res.resultInfo.sysdata.gradeSeq);
	}
}
/**
 * 通用保存分数后回调
 */
function insertuser_callback(data) {
	window.parent.$('#tabDiv').datagrid('reload');
	window.parent.ajax_alert(data);
}
/**
 * 隐藏id方法
 */
function hideBaseOnPagetype(hideIdArr) {
	if (arguments.length === 1 && typeof arguments[0] === "string") {
		$("#" + arguments[0]).hide();
	} else {
		hideIdArr.forEach(function (hideId) {
			$("#" + hideId).hide();
		})
	}
}
/**
 * 赋值默认数据
 */
function getParentModInfo() {
	var thisDateStr;
	if (parent.$editInput) {
		//如果是患者评估页面跳转
		var timeClass = parent.$editInput.attr("data-timeclass");
		var $timeInput = parent.$("." + timeClass).eq(0);
		thisDateStr = parent.$("#paramDateStr").val().substring(0, 4) + "/" + $timeInput.parent().find(".dateStr").text() + " " + $timeInput.val();
		console.log("此时的父元素选中元素");
		console.log(timeClass);
		console.log("当前时间是：", thisDateStr);
	} else {
		thisDateStr = publicFun.timeFormat(new Date().getTime(), "yyyy/MM/dd hh:mm");
	}
	$("#modTimeStr").val(thisDateStr);
	$("#modUser").val(_userid);
	eicuUtil.queryDoct($("#modUser"));
}
/**
 *评分单公共js 
 */
$(function () {
	//从custInfo取标题信息
	$(".headtitle").text(scoreTitle);
	eicuUtil.bindUserInput();
	// 签名栏样式
	$("#modInfo label").css({
		"display": "inline-block",
		"height": "24px",
		// "line-height": "24px",
		"vertical-align": "middle"
	})
	$("#modInfo label>span").css({
		"display": "inline-block",
		"height": "24px",
		"line-height": "24px",
		"vertical-align": "middle"
	})
	$("#modInfo label>input").css({
		"display": "inline-block",
		"height": "24px",
		"line-height": "24px",
		"vertical-align": "middle",
		"box-sizing": "border-box"
	})
	//如果父元素不是hzAtSheet，则隐藏页面保存按钮
})