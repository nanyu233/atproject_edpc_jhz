/*     var hosInfo = window.top.getHosInfo();
	 var tabInfo = window.top.$("#tabs").tabs('getSelected'); //获取首页选中页;
	 $("#title").text(hosInfo.hosName + tabInfo.title.split("-")[1]);*/
console.log('js进来了----', parent.$("#evlcss")[0].outerHTML);




function print() {
	refreshData();
	LODOP = getLodop();
	LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
	LODOP.SET_PRINT_PAGESIZE(0, 0, 0, "A4");
	//  LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
	LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
	var strStyleCSS = parent.$("#evlcss")[0].outerHTML;
	var strBodyStyle = "<style>" + document.getElementById("style1").innerHTML + "</style>";
	LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", strStyleCSS + strBodyStyle + document.getElementById("print").innerHTML); //copyprith
	//LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", ;//copyprith
	//  LODOP.ADD_PRINT_TABLE("2%","1%","96%","98%",document.getElementById("ryAtSheet").innerHTML);
	// LODOP.ADD_PRINT_RECT(10,55,360,220,0,1);
	// LODOP.SET_PRINT_STYLEA(0,"Stretch",2);
	LODOP.SET_PRINT_MODE("FULL_WIDTH_FOR_OVERFLOW", true);
	LODOP.SET_PRINT_MODE("FULL_HEIGHT_FOR_OVERFLOW", true);
	LODOP.NewPageA();
	LODOP.SET_PRINT_STYLE("FontSize", 10);
	//LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
	LODOP.PREVIEW();

	return true;

}


function refreshData() { //让innerHTML获取的内容包含input和select(option)的最新值
	var allInputObject = document.body.getElementsByTagName("input");
	for (i = 0; i < allInputObject.length; i++) {
		if (allInputObject[i].type == "checkbox") {
			if (allInputObject[i].checked)
				allInputObject[i].setAttribute("checked", "checked");
			else
				allInputObject[i].removeAttribute("checked");
		} else if (allInputObject[i].type == "radio") {
			if (allInputObject[i].checked)
				allInputObject[i].setAttribute("checked", "checked");
			else
				allInputObject[i].removeAttribute("checked");
		} else allInputObject[i].setAttribute("value", allInputObject[i].value);
	};
	for (i = 0; i < document.getElementsByTagName("select").length; i++) {
		var sl = document.getElementsByTagName("select")[i];
		for (j = 0; j < sl.options.length; j++) {
			if (sl.options[j].selected)
				sl.options[j].setAttribute("selected", "selected");
			else sl.options[j] = new Option(sl.options[j].text, sl.options[j].value);
		};
	};
};




$(function () {
	$("#doctor").val($("#User").val());
	$("#nurse").val("1293");
	//doctor();
	queryDoct($("#doctor").val($("#User").val()));
	queryDoct($("#nurse").val("1293"));

});






//绑定医生签名
$(".userInput").on("keyup", function () {
		//绑定医生拼音查询事件
		console.log($(this));
		if (event.keyCode !== 9) {
			$(this).data("userid", "");
			$(this).parent().find(".searchBox").remove();
		}
		if (event.keyCode == 13) {
			queryDoct($(this));
		}
	})
	.on("blur", function () {
		//签名绑定失焦后如果没有具体的userid，则删除内容

		if (!$(this).data("userid")) {

			if ($("#gradeType").val() == "BP") {
				console.log("BP", $(this)[0].value);
				if ($(this)[0].id == "doctor") {
					$("#copydoctor").next().hide();
					$("#copydoctor").prop("disabled", false).show();
					$("#copydoctor").val($("#doctor").val());
					//console.log(copydoctor);
					queryDoct($("#copydoctor").val(""));
				} else {
					$("#doctor").next().hide();
					$("#doctor").prop("disabled", false).show();
					$("#doctor").val($("#copydoctor").val());
					//console.log(333331111);
					queryDoct($("#doctor").val(""));
				}
			} else {
				$(this).val("");
			}

		} else {

			queryDoct($(this));
		}
		//queryDoct($(this));

		//	moveshow();
	});

/**
 *查询医生
 */
function queryDoct($thisInput) {
	var topBox = false; //默认在下方
	var inputContent = $thisInput.val();
	console.log("topBox", $thisInput.parents("tr").index(), $(".tys table tr").length - 1);
	topBox = true;
	/*if ($thisInput.parents("tr").index() === $(".tys table tr").length - 1) {
		
		topBox = true;
	}*/
	if ($thisInput.next().hasClass("searchBox")) {
		console.log("进来了searchBox");
		$thisInput.next().remove();
	}
	console.log("查询进来了", inputContent);
	if (inputContent) {
		var queryUrl = _baseUrl + "user/queryUser_pinyinLike.do";
		var requestParam = "dstuserCustom.queryLike=" + inputContent;
		$thisInput.prop("disabled", true);
		var customBoxStyle = {};
		if (topBox) {
			customBoxStyle.bottom = "30px";
		} else {
			customBoxStyle.top = "30px";
		}
		// eicuUtil.inputSearch($thisInput, queryUrl, requestParam, topBox)
		publicFun.httpRequest(queryUrl, requestParam, function (res) {
			var doctBoxStr = "<div class=\"searchBox\">";
			if (topBox) {
				//如果要显示到上方，设置内联高度
				doctBoxStr = "<div class=\"searchBox\" style=\"bottom:30px\">";
			} else {
				doctBoxStr = "<div class=\"searchBox\" style=\"top:30px\">";
			}
			if (!res.resultInfo.sysdata) {
				alert_warn(res.resultInfo.message);
				return;
			}
			var userList = res.resultInfo.sysdata.userlist || [];
			if (userList.length === 0) {
				console.log("无查询结果")

				doctBoxStr += "<p>无查询结果</p>";
			} else if (userList.length === 1) {
				//如果只有一条数据直接赋值
				var thisText = userList[0].usrname;
				var thisId = userList[0].userid;
				var signImg = userList[0].signimg;
				var pInfo = {
					text: thisText,
					id: thisId,
					signImg: signImg
				}
				console.log("点击选择进来了2");
				signElClick($thisInput, pInfo);
				return;
			} else {
				userList.forEach(function (ele) {
					doctBoxStr += "<p>";
					doctBoxStr += "<span class=\"userid\" data-signimg=\"" + (ele.signimg || "") + "\">" + ele.userid + "</span>";
					doctBoxStr += "-";
					doctBoxStr += "<span class=\"username\">" + ele.usrname + "</span>";
					doctBoxStr += "</p>";
				})
			}
			doctBoxStr += "</div>";
			$thisInput.parent().css("position", "relative");
			$thisInput.after(doctBoxStr);
			$thisInput.prop("disabled", false).focus();
			//查询框相关样式赋值
			console.log("gradeType", "----", $("#left-1").val())
			$thisInput.next().css({
				"position": "absolute",
				"left": $("#left-1").val() + "px",
				"z-index": 99,
				"width": "150px",
				"max-height": "100px",
				"box-sizing": "border-box",
				"background-color": "#fff",
				"border": "1px solid #999",
				"box-shadow": "0 5px 10px #ccc",
				"overflow-x": "hidden"
			}).find("p").css({
				"padding": "3px 5px",
				"box-sizing": "border-box",
				"cursor": "pointer",
			}).hover(function () {
				$(this).css("background-color", "rgb(234, 242, 255)");
			}, function () {
				$(this).css("background-color", "#fff");
			})
			//绑定选中事件
			$thisInput.parent().find(".searchBox").on("click", "p", function () {
				var thisText = $(".username", this).text();
				var thisId = $(".userid", this).text();
				var signImg = $(".userid", this).attr("data-signimg");
				var pInfo = {
					text: thisText,
					id: thisId,
					signImg: signImg
				}
				//console.log(9999999999999999999999999);
				console.log("点击选择进来了1", $thisInput[0].id);

				signElClick($thisInput, pInfo);
				if ($("#gradeType").val() == "BP") {
					if ($thisInput[0].id == "doctor") {
						signElClick($("#copydoctor"), pInfo);
					} else {
						signElClick($("#doctor"), pInfo);
					}
				}
			})
		})
	}

}

/**
 *医生查询点击事件
 */
function signElClick($thisInput, pInfo) {
	console.log(369456126, $thisInput, pInfo, pInfo.id);
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
		//var $thisImgBox = $thisInput.parent().find(".signImgBox");
		var $thisImgBox = $thisInput.parent().find(".signImgBox");
		// 图片相关属性
		$thisImgBox.css("display", "inline-block");
		var $thisImg = $thisImgBox.find(".signPic");
		$thisImg
			.attr("src", _baseUrl + "images/eicu/signPic/" + signImg)
			.attr("title", thisText)
			.attr("data-userid", thisId)
			.on("error", function () {
				//绑定错误事件
				console.error("么的图片");
				console.log(_baseUrl + "images/eicu/signPic/" + signImg);
				$thisInput.show();
				$thisImgBox.hide();
			})
			.on("click", function () {
				//绑定删除按钮事件
				console.log("编辑此条");
				if (!$thisInput.prop("disabled")) {
					$thisImgBox.hide();
					$thisInput.show().focus();
				}
			});
		//input赋值
		$thisInput.val(thisText).data("userid", thisId);
		//隐藏此input
		$thisInput.prop("disabled", false).hide();
	}

	$thisInput.parent().find(".searchBox").remove();
}




/*	function  doctor(){
	 var doctor=$("#User").val();
	 var nurse="1293";
	 var ary = new Array(doctor,nurse);
	 console.log("docter的ID",$("#User").val());
	 console.log($("#doctor"));
	 console.log(ary);
	 for(i=0;i<ary.length;i++){
		 var inputContent= ary[i];
		 console.log(inputContent,333333333)
		 	if (inputContent) {
				var queryUrl = _baseUrl + "user/queryUser_pinyinLike.do";
				var requestParam = "dstuserCustom.queryLike=" + inputContent;
				console.log(inputContent,4444444)
				if( inputContent !="1293"){
					$("#doctor").prop("disabled", true);
				}else{
					$("#nurse").prop("disabled", true);
				}
				//$thisInput.prop("disabled", true);
				console.log('来了来了',requestParam);
				console.log('来了来了来了',queryUrl,requestParam);
				// eicuUtil.inputSearch($thisInput, queryUrl, requestParam, topBox)
				publicFun.httpRequest(queryUrl, requestParam, {asyncFlag: false},function (res) {
					console.log('进来了');
					var doctBoxStr = "<div class=\"searchBox\">";

					if (!res.resultInfo.sysdata) {
						alert_warn(res.resultInfo.message);
						return;
					}
					var userList = res.resultInfo.sysdata.userlist || [];
					
					console.log(inputContent,88852852);
					if (userList.length === 0) {
						if(inputContent !="1293"){
							$("#doctor").prop("disabled", false);
						}else{
							$("#nurse").prop("disabled", false);
						}
						return;
					} else if (userList.length === 1) {
						//如果只有一条数据直接赋值
						var thisText = userList[0].usrname;
						var thisId = userList[0].userid;
						var signImg = userList[0].signimg;
						var pInfo = {
							text: thisText,
							id: thisId,
							signImg: signImg
						}
					
						if(inputContent !="1293"){
							signElClick($("#doctor"), pInfo);
						}else{
							signElClick($("#nurse"), pInfo);
						}
					console.log(inputContent,9999999);
						return;
					} 
				})
			}
	 }

	}	*/