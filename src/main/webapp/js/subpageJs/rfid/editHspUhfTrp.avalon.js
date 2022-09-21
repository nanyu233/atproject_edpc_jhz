var getHspUhfTrpByRdrSeqUrl = "rfid/getHspUhfTrpByRdrSeq.do";

var editHspUhfTrpSubmitUrl = "rfid/editHspUhfTrpSubmit.do";

var dev = avalon.define({
    $id: 'editHspUhfTrpForm',
    hspUhfTrpCustom:{
        trpSeq:_trpSeq,
        trpId:'',
        trpNam:'',
        trpTyp:'',
        trpCls:'',
        typPic:'',
        trpSta:''
    }
});


function validateForm() {
    return $("#hspUhfTrpForm").validate({
        rules: {
            "hspUhfTrpCustom.trpSeq": "required",
            "hspUhfTrpCustom.trpSeq": {
                isTrpSeq: true
            },
            "hspUhfTrpCustom.trpId": "required",
            "hspUhfTrpCustom.trpTyp": "required",
            "hspUhfTrpCustom.trpCls": "required",
            "hspUhfTrpCustom.typPic": {
                isURL: true
            },
            "hspUhfTrpCustom.trpSta": "required",
            "hspUhfTrpCustom.bidFlg": "required"

        },
        messages: {
            "hspUhfTrpCustom.trpSeq": "请输入标签序号",
            "hspUhfTrpCustom.trpSeq": {
                isTrpSeq: "请输入两位数的标签序号"
            },
            "hspUhfTrpCustom.trpId": "请输入标签编号",
            "hspUhfTrpCustom.trpTyp": "请输入标签类型",
            "hspUhfTrpCustom.trpCls": "请输入标签分类",
            "hspUhfTrpCustom.typPic": {
                isURL: "请输入有效的类型图片"
            },
            "hspUhfTrpCustom.trpSta": "请输入设备状态",
            "hspUhfTrpCustom.bidFlg": "请输入是否绑定"
        }
    }).form();
}


function getHspUhfTrpByRdrSeq(){
    $.ajax({
        url: getHspUhfTrpByRdrSeqUrl,
        type: 'post',
        dataType: 'json',
        data: {trpSeq: dev.hspUhfTrpCustom.trpSeq},
        timeout: 5000,
        success: function(res) {
            var hspUhfTrp = res.resultInfo.sysdata.hspUhfTrp;
            Object.assign(dev.hspUhfTrpCustom, hspUhfTrp);
        }
    })
}

//修改UHF应答器
function editHspUhfTrp() {
    if (validateForm()) {
        var hspUhfTrpCustom = {};
        for(var a in dev.hspUhfTrpCustom){
            hspUhfTrpCustom[a] = dev.hspUhfTrpCustom[a];
        }
        var finalParams = {'hspUhfTrpCustom':hspUhfTrpCustom};
        finalParams = JSON.stringify(finalParams);

        $.ajax({
            url: editHspUhfTrpSubmitUrl,
            type: 'post',
            dataType: 'json',
            contentType: 'application/json; charset=utf',
            data: finalParams,
            timeout: 5000,
            success: function(res) {
                editHspUhfTrp_callback(res);
            }
        })
    }
}
//修改的回调函数
function editHspUhfTrp_callback(data) {
    message_alert(data);
    if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryHspUhfTrp();
    }
}
$(function () {
    getHspUhfTrpByRdrSeq();
});
