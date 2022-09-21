/**
 * 护理记录单公共方法
 */
var explorer = navigator.userAgent;
//判断是否IE9以上的IE，项目内无IE8以下
var isIE = explorer.indexOf("Trident") !== -1;
//公用变量以及vm
var windowHeight,
    windowWidth;
var hosInfo = window.top.getHosInfo();
var tabInfo = window.top.$("#tabs").tabs('getSelected'); //获取首页选中页;
var _careSheetTitle = tabInfo.title; //陈海千-xxxx护理单切割后获取名称
var ptBasicInfo = eicuUtil.ptBasicInfo; //获取患者个人信息
var _custNo = ptBasicInfo.custNo;
var _liveNo = ptBasicInfo.liveNo;
var _custName = ptBasicInfo.custName;
var optTimeStrArr = ["${optTime[0]}", "${optTime[1]}", "${optTime[2]}"];
var optTimeArr = [];
optTimeStrArr.forEach(function (ele) {
    optTimeArr.push(parseInt(ele.substring(0, 2)));
});
var timeBaseList = [];
var finalStrList = [];
var pageStrList = [];
var totalTableStr = "";
var $clickedRow = null;
var mmToPx; //打印单位换算
var vm = avalon.define({
    $id: "careSheetControl",
    allList: {
        // yearTimeObj: {},
        thisList: [],
        sliceIdxArr: []
    },
    pageIdx: ""
});
vm.$watch("pageIdx", function (newV, oldV) {
    if (newV !== oldV) {
        var $tbody = $("#totalTable tbody");
        $tbody.empty();
        if (newV === "") {
            // $("#careSheetContainer").css("overflow", "auto");
            // vm.allList.thisList = finalTimeBaseList;
            $tbody.append(totalTableStr);
        } else {
            // $("#careSheetContainer").css("overflow", "hidden");
            var index = parseInt(newV);
            $tbody.append(pageStrList[index]);
        }
        $clickedRow = null;
        bindRowClick();
    }
});

/**
 * 图片加载错误事件
 */
function signPicError() {
    var _this = event.target;
    console.error("么的图片啊");
    $(_this)
        .hide()
        .next()
        .show();
}

/**
 * 预设时间
 */
function setTime() {
    var today;
    var yesterday;
    var date;
    date = new Date();
    today = publicFun.creatDate(date);
    var hour = date.getHours();
    if (hour < optTimeArr[0]) {
        date = new Date(date.getTime() - 24 * 60 * 60 * 1000);
        yesterday = publicFun.creatDate(date);
        $("#startDate").val(yesterday);
    } else {
        $("#startDate").val(today);
    }
    $("#endDate").val(today);
}

/**
 * 加入内联样式
 */
function tableStyleUnit() {
    $("#careSheetContainer").css({
        "margin-bottom": "10px",
        "box-sizing": "border-box",
        "max-width": "99.5%",
        "overflow-y": "auto",
        "overflow-x": "hidden",
        // "border-bottom": "1px solid #ccc",
        "box-shadow": "5px 5px 5px #eee"
    });
    $("#totalTable").css({
        "margin": "0 auto",
        "border-collapse": "collapse",
        "table-layout": "fixed",
        "width": "98%"
    });
    $("#bgTable").css({
        "max-width": "100%",
        "border-collapse": "collapse"
    });
    $("table.careSheet td div.bgSign").css({
        "max-width": "9mm",
        "margin": "0 auto",
        "text-align": "center",
        "white-space": "normal",
        "word-break": "break-all",
        "word-wrap": "break-word"
    });
    $("#bgTable td").css({
        "box-sizing": "border-box",
        "border": "1px solid black",
        "text-align": "center",
        "height": "30px",
        "font-size": "7.5pt"
    });
    $("table.careSheet td").not(".textLeft").css({
        "box-sizing": "border-box",
        "border": "1px solid black",
        "text-align": "center",
        "height": "30px",
        "font-size": "7.5pt"
    });
    $("table.careSheet thead tr td.unit").css({
        "font-size": "6pt",
        "color": "#666"
    });
    $("table.careSheet thead tr.unit td").css({
        // "font-size": "10px",
        "font-size": "6.5pt",
        "color": "#666"
    });
    $(".careSheetDate").css({
        "width": "12.5mm"
    });
    $("table.careSheet .w-16").css({
        "width": "4mm"
    });
    $("table.careSheet .w-20").css({
        "width": "5mm"
    });
    $("table.careSheet .w-28").css({
        "width": "7mm"
    });
    $("table.careSheet .w-32").css({
        "width": "8mm"
    });
    $("table.careSheet .w-40").css({
        "width": "10mm"
    });
    $("table.careSheet .w-44").css({
        "width": "11mm"
    });
    $("table.careSheet .w-48").css({
        "width": "12mm"
    });
    $("table.careSheet .w-50").css({
        "width": "12.5mm"
    });
    $("table.careSheet .w-52").css({
        "width": "13mm"
    });
    $("table.careSheet .w-56").css({
        "width": "14mm"
    });
    $("table.careSheet .w-60").css({
        "width": "15mm"
    });
    $("table.careSheet .w-64").css({
        "width": "17mm"
    });
    $("table.careSheet .w-80").css({
        "width": "20mm"
    });
    $("table.careSheet .w-100").css({
        "width": "25mm"
    });
    $("table.careSheet .w-120").css({
        "width": "30mm"
    });
    $("table.careSheet .w-130").css({
        "width": "32.5mm"
    });
    $("table.careSheet .w-140").css({
        "width": "35mm"
    });
    $("table.careSheet .w-150").css({
        "width": "37.5mm"
    });
    $("table.careSheet .w-160").css({
        "width": "40mm"
    });
    $("table.careSheet .w-180").css({
        "width": "45mm"
    });
    $("table.careSheet .w-200").css({
        "width": "50mm"
    });
    // //图片宽度赋值,所在签名td是w-60
    // $(".signPic").css({
    //     "max-width": "15mm",
    //     "max-height": "29px"
    // });
    // $(".bgSignPic").css({
    //     //与w-20相同
    //     "width": "10mm",
    //     "max-height": "29px"
    // });
    bindRowClick();
}

/**
 * 分页
 */
function slicePage() {
    mmToPx = $("#fakeHeight").height(); //计算1mm是多少px
    $("body").append("<div id='titleHtml'></div>");
    $("#titleHtml").append(eicuUtil.getPrintTitleContent());
    // console.log("拿到capStr高度：", $("#titleHtml").height());
    var capHeight = $("#titleHtml").height(); //标题高50px,10px安全距离
    $("#titleHtml").remove(); //移除伪造capStr元素
    var sliceIdxArr = [];
    var tbodyHeight = 0;
    var headAndTailHeight = $("#totalTable thead").height() + 80; //页尾30px高显示页码
    // console.log("********************************");
    // console.log("表头高：", headAndTailHeight);
    // console.log("********************************");
    var $bodyTrList = $("#totalTable tbody tr");
    var pageStrList = [];
    var thisPageStrList = [];
    // var limitHeight = windowHeight - 30;

    var limitHeight = 180 * mmToPx; //上限是190mm
    //    console.log("**********************限制高度：", limitHeight, "**********************");
    // console.log("limitHeight是：", limitHeight);
    $bodyTrList.each(function (idx) {
        thisPageStrList = [];
        var thisHeight = $(this).height();
        tbodyHeight += thisHeight;
        //        console.log("当前高度：", thisHeight);
        //        console.log("此时的高度是：", tbodyHeight);
        //如果算上这一行高度大于当前页面高度，则开始拆分
        //如果是第一页加上打印标题和表头||不是第一页加上表头超高
        if ((pageStrList.length === 0 && ((tbodyHeight + headAndTailHeight + capHeight) > limitHeight)) || (pageStrList.length !== 0 && ((headAndTailHeight + tbodyHeight) > limitHeight))) {
            // var thisPageStrList;
            //            console.log("可能变成：", pageStrList.length === 0 ? (tbodyHeight + headAndTailHeight + capHeight) : (headAndTailHeight + tbodyHeight));
            //            console.log("此tr以上的全部切割");
            //            console.log($bodyTrList.eq(idx));
            //            console.log(pageStrList.length + 1, "分割");
            //            console.log("-------------------------------------------");
            var $thisPageStrList;
            //尝试保存分割数组
            if (sliceIdxArr.length === 0) {
                $thisPageStrList = $bodyTrList.slice(0, idx);
                $thisPageStrList.each(function () {
                    thisPageStrList.push($(this).prop("outerHTML"));
                })
            } else {
                //第一个数据插入时间
                var lastIdx = sliceIdxArr[sliceIdxArr.length - 1];
                $thisPageStrList = $bodyTrList.slice(lastIdx, idx);
                var $firstEle = $thisPageStrList.eq(0);
                var dateStr = timeBaseList[lastIdx].dateStr;
                if (!$firstEle.children().eq(0).text()) {
                    $firstEle.children().eq(0).empty().append(dateStr.substring(0, 4) + "<br>" + dateStr.substring(5));
                    $thisPageStrList.each(function () {
                        thisPageStrList.push($(this).prop("outerHTML"));
                    })
                    $firstEle.children().eq(0).empty();
                } else {
                    $thisPageStrList.each(function () {
                        thisPageStrList.push($(this).prop("outerHTML"));
                    })
                }
                // $firstEle.children().eq(1).text(timeBaseList[lastIdx].timeStr || "");
            }
            pageStrList.push(thisPageStrList.join(""));
            sliceIdxArr.push(idx);
            tbodyHeight = thisHeight;
            return true;
        }
    });
    // 塞入最后的占位符
    if (sliceIdxArr.length !== 0) {
        thisPageStrList = [];
        var lastIdx = sliceIdxArr[sliceIdxArr.length - 1];
        var $thisPageStrList = $bodyTrList.slice(lastIdx);
        var $firstEle = $thisPageStrList.eq(0);
        // console.log("最后剩下的元素：");
        // console.log($firstEle);
        var hasInitDateStr = true;
        // 剩余不止一项（careSheet和ioCareSheet最后一项一定为总计）时置入时间
        if (!((_careSheetType === "careSheet" || _careSheetType === "ioCareSheet") && thisPageStrList.length === 1)) {
            var dateStr = timeBaseList[lastIdx].dateStr;
            if (!$firstEle.children().eq(0).text()) {
                hasInitDateStr = false;
                $firstEle.children().eq(0).empty().append(dateStr.substring(0, 4) + "<br>" + dateStr.substring(5));
                $firstEle.children().eq(1).text(timeBaseList[lastIdx].timeStr || "");
            }
        }
        $thisPageStrList.each(function () {
            thisPageStrList.push($(this).prop("outerHTML"));
        })
        if (!hasInitDateStr) {
            $firstEle.children().eq(0).empty();
        }
        pageStrList.push(thisPageStrList.join(""));
        sliceIdxArr.push("lastCount");
    }
    return {
        "sliceIdxArr": sliceIdxArr,
        "pageStrList": pageStrList
    }
}

/**
 * 打印
 */
function print() {
    var capText = _careSheetTitle;
    //表格内容
    var $copyNode = $("#careSheetContainer").clone();
    var colLength = $copyNode.find("col").length;
    //增加表头
    var titleHtml = eicuUtil.getPrintTitleContent();
    var capStr = "<tr><td colspan=\"" + colLength + "\" style=\"height:40px;box-sizing:border-box;font-size:13pt;font-weight:bold;text-align:center;overflow: hidden\">";
    capStr += titleHtml;
    capStr += "</td></tr>";
    // console.log("表头是：");
    // console.log(capStr);
    // return;
    //增加页脚
    var breakElStr = "<tr style=\"page-break-after:always;height:30px;overflow:hidden\"><td colspan=\"" + colLength + "\"><div style=\"height:30px;line-height:30px;font-size:8pt;font-weight:bold;text-align:center\"><span>第" + (parseInt(vm.pageIdx || 0) + 1) + "页</span> / <span>共" + (pageStrList.length || 1) + "页</span></div></td></tr>";
    var tableStr = "";
    if ((vm.pageIdx === "" && pageStrList.length !== 0)) {
        //打印全部并且有分页信息时
        tableStr += "<table>"
        tableStr += "<colgroup>" + $copyNode.find("table colgroup").html() + "</colgroup>";
        var tHeadStr = $copyNode.find("table thead").html();
        breakElStr = "<tr style=\"page-break-after:always;height:30px;overflow:hidden\"><td colspan=\"" + colLength + "\" style=\"height:30px;line-height:30px;font-size:8pt;font-weight:bold;text-align:center\"><span format=\"#\" tdata=\"pageNO\">第#页</span> / <span format=\"#\" tdata=\"pageCount\">共#页</span></td></tr>";
        pageStrList.forEach(function (pageStr) {
            tableStr += "<table style=\"margin: 0 auto;border-collapse:collapse;table-layout:fixed;width:98%\">"
            tableStr += "<colgroup>" + $copyNode.find("table colgroup").html() + "</colgroup>";
            tableStr += tHeadStr + pageStr;
            tableStr += breakElStr;
            tableStr += "</table>";
        });
        // $copyNode.find("table").empty().append(tableStr);
        // $copyNode.find("tr").eq(0).before(capStr);
        $copyNode.empty().append(tableStr);
        $copyNode.find("table").eq(0).before(capStr);
    } else {
        $copyNode.find("tbody").append(breakElStr);
        // $copyNode.find("table").after(breakElStr);
    }
    if (vm.pageIdx === "0" || (vm.pageIdx === "" && pageStrList.length === 0)) {
        // console.log("进来添加了");
        // console.log(vm.pageIdx);
        // 打印第一页或者打印全部且只有一页，添加表头
        // $copyNode.find("table").prepend("<caption style=\"text-decoration:underline\">测试下划线标题<br></caption>")
        $copyNode.find("tr").eq(0).before(capStr);
    }
    // $("body").append($copyNode);
    // return;
    // if (_careSheetType === "bgCareSheet") {
    //     //如果是血糖血气护理单，表格居中，选中列颜色取消
    //     $copyNode.find("table").css("margin", "0 auto");
    //     $copyNode.find("table .dynaTd").css("background-color", "#fff");
    // }
    // $copyNode.find("table").css("margin-left", "1mm");
    tableStr = $copyNode.html();
    // console.log("插入打印节点");
    // console.log(tableStr);
    // return;
    LODOP = getLodop();
    LODOP.PRINT_INITA(0, 0, "210mm", "290mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
    // if (_careSheetType === "bgCareSheet") {
    //     LODOP.SET_PRINT_PAGESIZE(3, 0, 0, "A4");
    // } else {
    LODOP.SET_PRINT_PAGESIZE(2, 0, 0, "A4");
    // }
    // LODOP.SET_PRINT_STYLE("Underline", 1);
    // LODOP.SET_PRINT_STYLE("ItemType",1);
    // LODOP.SET_PRINT_MODE("DOUBLE_SIDED_PRINT", true); //双面打印
    LODOP.SET_PRINT_MODE("PRINT_DUPLEX", 3); //3短边双面，2长边双面
    LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true); //打印或预览后内容不清空
    // LODOP.ADD_PRINT_TABLE(3, 0, "100%", "100%", tableStr);
    LODOP.ADD_PRINT_HTM("5mm", "3.5mm", "100%", "100%", tableStr);
    LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED", 1);
    // LODOP.NewPageA();
    //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
    LODOP.PREVIEW();
    //LODOP.PRINT();

    return true;

}
/**
 * 保存后刷新
 */
function modalReturnFun(modalType) {
    initData();
}
/**
 * 弹出相应整体维护窗口
 */
function openZtwh() {
    //BG在该页面构造$clickedRow
    var vsDateStr;
    if (!$clickedRow || $clickedRow.hasClass("fakeRow")) {
        $clickedRow = $("<div class=\"fakeRow\"></div>");
        vsDateStr = publicFun.timeFormat(new Date().getTime(), "yyyy/MM/dd hh") + ":00";
    } else {
        vsDateStr = $clickedRow.data("vsDateStr");
    }
    // console.log("准备打开窗口");
    // console.log($clickedRow);
    if ($clickedRow.find(".totalInfoTd").length !== 0) {
        alert_warn("总计项不可修改");
        return;
    }
    var modalTitle = $("#ztwhBtn").text();
    icuOpenModal.openZtwh(_careSheetType, {
        vsDateStr: vsDateStr,
        modalTitle: modalTitle
    });
}
/**
 * 跳转微泵信息
 */
function openMpInfoPage() {
    var pagetype = "107000"; //一级菜单ID
    var pageval = "107002"; //事件管理ID
    eicuUtil.openIcuCustTab(pagetype, pageval);
}
/**
 * 弹出医嘱/出入量修改页面
 */
function openExecIoEdit() {
    var modalTitle = "修改医嘱/出入量"
    var modalWidth = 900,
        modalHeight = 650;
    var daNo, inSeq, outSeq;
    // console.log($clickedRow);
    if ($clickedRow && $clickedRow.find(".totalInfoTd").length !== 0) {
        alert_warn("总计项不可修改");
        return;
    }
    if ($clickedRow && $clickedRow.attr("data-wbflag") === '1') {
        alert_warn("通过微泵执行的医嘱请点击【跳转微泵信息】维护");
        return;
    }
    if (!$clickedRow) {
        // alert_warn("请选中一条数据");
        // return;
        //如果没有选中行则为新增
        // daNo = "", inSeq = "", outSeq = "";
    } else {
        modalWidth = 900, modalHeight = 650;
        daNo = $clickedRow.data("daNo"), inSeq = $clickedRow.data("inSeq"), outSeq = $clickedRow.data("outSeq");
    }
    // if (!daNo && !inSeq && !outSeq) {
    //     alert_warn("没有可修改的医嘱/出入量信息");
    //     return;
    // }
    if (!daNo) {
        //如果没有daNo，则页面变为出入量类型
        modalTitle = "出入量新增";
        modalWidth = 600;
        modalHeight = 410;
        if (inSeq || outSeq) {
            modalTitle = "出入量修改";
            // modalHeight = 380;
        }
    }
    var modalUrl = _baseUrl + "icudoctadvi/toExecEdit.do";
    createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, "no");
}
/**
 *跳转体征查询页
 */
function toVitlInfoPage() {
    var pagetype = "111000";
    var pageval = "111001";
    eicuUtil.openIcuCustTab(pagetype, pageval)
}

/**
 *跳转体液平衡页
 */
function toIoDaInfoPage() {
    var pagetype = "111000";
    var pageval = "111002";
    eicuUtil.openIcuCustTab(pagetype, pageval)
}

/**
 * 绑定点击事件
 */
function bindRowClick() {
    //生命体征呼吸机&&血气血糖绑定双击事件
    if (_careSheetType === "vsCareSheet" || _careSheetType === "bgCareSheet") {
        $("#totalTable tbody tr").on("dblclick", function () {
            var $this = $(this);
            $this.addClass("active")
                .css("background-color", "#fdff65")
                .unbind('mouseenter', 'mouseleave')
                .hover(function () {
                    $(this).css("background-color", "#fdff65");
                }, function () {
                    $(this).css("background-color", "#fdff65");
                });
            $clickedRow = $this;
            var vsDate = $clickedRow.find(".dateStr").attr("data-datestr");
            var vsTime = $clickedRow.find(".timeStr").text();
            $clickedRow.data("vsDateStr", vsDate + " " + vsTime);
            openZtwh();
        })
    }

    //绑定行点击事件
    $("#totalTable tbody tr").on("click", function () {
        var $this = $(this);
        // console.log("点击了");
        // console.log($this);
        if ($this.hasClass("active")) {
            $this
                .removeClass("active")
                .css("background-color", "#fff")
                .unbind('mouseenter', 'mouseleave')
                .hover(function () {
                    $(this).css("background-color", "rgb(234, 242, 255)");
                }, function () {
                    $(this).css("background-color", "#fff");
                });
            $clickedRow = null;
        } else {
            if ($clickedRow) {
                $clickedRow
                    .removeClass("active")
                    .css("background-color", "#fff")
                    .unbind('mouseenter', 'mouseleave')
                    .hover(function () {
                        $(this).css("background-color", "rgb(234, 242, 255)");
                    }, function () {
                        $(this).css("background-color", "#fff");
                    })
            }
            $this.addClass("active")
                .css("background-color", "#fdff65")
                .unbind('mouseenter', 'mouseleave')
                .hover(function () {
                    $(this).css("background-color", "#fdff65");
                }, function () {
                    $(this).css("background-color", "#fdff65");
                });
            $clickedRow = $this;
            //绑定时间
            var vsDate = $clickedRow.find(".dateStr").attr("data-datestr");
            var vsTime = $clickedRow.find(".timeStr").text();
            if (!vsTime) {
                //如果没有对应时间，管路评估时间
                $clickedRow.data("vsDateStr", "");
            } else {
                $clickedRow.data("vsDateStr", vsDate + " " + vsTime);
            }
            // ioCareSheet相关变量
            var daNo;
            var wbFlag;
            var inSeq;
            var outSeq;
            // dayCareSheet管路相关变量
            var pipeTimeStr;
            var pipeDateTimeStr;
            var pipeDateStamp;
            // 绑定类型
            var dataVsType;
            switch (_careSheetType) {
                case "vsCareSheet":
                    dataVsType = ["VS", "RM"];
                    break;
                case "ioCareSheet":
                    dataVsType = ["NC"];
                    //医嘱出入量相关
                    daNo = $clickedRow.attr("data-dano");
                    wbFlag = $clickedRow.attr("data-wbflag")
                    inSeq = $clickedRow.attr("data-inseq");
                    outSeq = $clickedRow.attr("data-outseq");
                    if (daNo) {
                        $clickedRow.data("daNo", daNo);
                    }
                    if (wbFlag) {
                        $clickedRow.data("wbFlag", wbFlag);
                    }
                    if (inSeq) {
                        $clickedRow.data("inSeq", inSeq);
                    }
                    if (outSeq) {
                        $clickedRow.data("outSeq", outSeq);
                    }
                    // //保留拼出来的ncInfo和linkSeq
                    // $clickedRow.data("linkSeq", $clickedRow.attr("data-linkseq"));
                    // $clickedRow.data("ncInfo", $clickedRow.find(".ncInfo").text());
                    break;
                case "dayCareSheet":
                    dataVsType = ["DC"];
                    //如果是日常护理，新增绑定管路时间等信息
                    pipeTimeStr = $clickedRow.find(".dateStr").attr("data-pipetimestr");
                    pipeDateTimeStr = vsDate.replace(/\//ig, "-") + "T" + (pipeTimeStr || "00:00:00");
                    pipeDateStamp = new Date(pipeDateTimeStr).getTime();
                    $clickedRow.data("pipeTimeStr", pipeTimeStr);
                    $clickedRow.data("pipeDateStamp", pipeDateStamp);
                    break;
                case "bgCareSheet":
                    dataVsType = ["BG"];

                    break;
            }
            $clickedRow.data("vsType", dataVsType);
            // console.log("绑定的时间是：", $clickedRow.data("vsDateStr"));
        }
    })
}

$(function () {
    windowHeight = $(window).height();
    $('#careSheetContainer').height(windowHeight - 45);
    initData(); //调用各自页面的初始化数据函数
    // console.log("fakeDiv高度是：", $("#fakeHeight").height());
});