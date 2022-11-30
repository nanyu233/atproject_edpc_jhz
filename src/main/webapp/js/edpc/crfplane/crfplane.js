/**
 * 三大中心，审批上报相关方法
 */
/**
 * 提交审核
 * @param regSeq 唯一序号
 * @param rcdSta 审核状态
 */
function reviewApply(regSeq, rcdSta) {
    _confirm('确认提交审核？', null, function() {
        var requestData = {
            'regSeq': regSeq,
            'rcdSta': "2"
        };
        publicFun.httpRequest(
            BaseUrl + 'crfplane/reviewSubmit.do',
            requestData,
            {
                'ajaxType': 'post',
                'requestType': 'json'
            },
            function (res) {
                if (res.resultInfo.success){
                    if(search) {
                        search();
                    }
                }
            }
        )
    });
}

/**
 * 上报
 * @param regSeq 唯一序号
 * @param smtSta 审核状态
 * @param patTyp 数据类型(胸痛/卒中/创伤)
 */
function smtPort(regSeq, smtSta, patTyp) {
    var tipMsg = "确认上报？";
    if(smtSta === '5') {
        tipMsg = "确认重新上报？";
    }
    _confirm(tipMsg, null, function() {
        //虚化
        $("<div class=\"datagrid-mask\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body");
        $("<div class=\"datagrid-mask-msg\"></div>").html("正在上报，请稍候。。。").appendTo("body").css({display:"block","line-height": "11px",left:($(document.body).outerWidth(true) - 190) / 2});
        var requestData = {
            'regSeq': regSeq,
            'patTyp': patTyp,
            'smtSta': "2"
        };
        publicFun.httpRequest(
            BaseUrl+'crfplane/reportSubmit.do',
            requestData,
            {
                'ajaxType': 'post',
                'requestType': 'json'
            },
            function (res) {
                //虚化结束
                $("body").children("div.datagrid-mask-msg").remove();
                $("body").children("div.datagrid-mask").remove();
                if(search) {
                    search();
                }
                message_alert(res)
            }
        )
    });
}

/**
 * 审核退回
 * @param regSeq 唯一序号
 * @param smtSta 上报状态
 */
function chkRowBak(regSeq, smtSta) {
    var tipMsg = "确认退回到审核中？";
    if(smtSta === '5') {
        tipMsg = "信息已上报完成，确认退回到审核中？";
    }
    _confirm(tipMsg, null, function() {
        var requestData = {
            'regSeq': regSeq,
            'rcdSta': "2"
        };
        publicFun.httpRequest(
            BaseUrl + 'crfplane/reviewSubmit.do',
            requestData,
            {
                'ajaxType': 'post',
                'requestType': 'json'
            },
            function (res) {
                message_alert(res)
                if(search) {
                    search();
                }
            }
        )
    });
}

/**
 * 单独审核、批量审核页面跳转
 * chkFlag 不存在则为单挑审批 此时regSeq不能为null
 * chkFlag 存在则为批量审批 此时regSeq可以为null
 * js引用页面需要定义数组对象 chkRegSeqArr
 * 审核页面获取引用页面的chkRegSeqArr对象来确认审核哪些记录
 * @param regSeq 唯一
 * @param chkFlag 是否是批量审核
 */
function skipChkPage(regSeq, chkFlag) {
    if(!chkFlag) {
        if(!regSeq) {
            alert_error("唯一序号不存在，无法审批。");
            return false;
        }
        chkRegSeqArr = [regSeq];
    }
    if(chkRegSeqArr.length > 0) {
        createmodalwindow("审核确认", 430, 300, BaseUrl+'crfplane/toChkConfirm.do?', 'no');
    } else if(chkFlag) {
        alert_warn("不存在需要审核记录！")
    }
}