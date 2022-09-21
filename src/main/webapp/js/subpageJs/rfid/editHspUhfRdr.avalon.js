var getHspUhfRdrByRdrSeqUrl = 'rfid/getHspUhfRdrByRdrSeq.do';
var editHspUhfRdrSubmitUrl = "rfid/editHspUhfRdrSubmit.do";
var rdrDepArray = [{'comno': '2010101', 'comcname': '心内科'}, {'comno': '1010111', 'comcname': '神经内科'}];

var dev = avalon.define({
    $id: 'editHspUhfRdrForm',
    hspUhfRdrCustom: {
        rdrSeq: _rdrSeq,
        rdrId: '',
        rdrNam: '',
        rdrTyp: '',
        mtrTyp: '',
        mtrCod: '',
        rdrLoc: '',
        rdrSta: '',
        rdrPar: '',
        rdrDep: '',
        buyDat: '',
        fixDat: '',
        fixMan: '',
        mntCom: '',
        mntMan: '',
        mntTel: '',
        tcpFlg: '',
        wifFlg: '',
        rdrIp: '',
        rdrPort: ''
    },
    devdictlist: {
        siteList: rdrDepArray
    }
});


function validateForm() {
    return $("#hspUhfRdrForm").validate({
        rules: {
            "hspUhfRdrCustom.rdrSeq": "required",
            "hspUhfRdrCustom.rdrSeq": {
                isRdrSeq: true
            },
            "hspUhfRdrCustom.rdrId": "required",
            "hspUhfRdrCustom.rdrTyp": "required",
            "hspUhfRdrCustom.rdrSta": "required",
            "hspUhfRdrCustom.rdrIp": {
                isIpaddr: true
            },
            "hspUhfRdrCustom.rdrPort": {
                isIpPort: true
            }
        },
        messages: {
            "hspUhfRdrCustom.rdrSeq": "请输入设备序号",
            "hspUhfRdrCustom.rdrSeq": {
                isRdrSeq: "请输入两位数的设备序号"
            },
            "hspUhfRdrCustom.rdrId": "请输入设备编号",
            "hspUhfRdrCustom.rdrTyp": "请输入设备类型",
            "hspUhfRdrCustom.rdrSta": "请输入设备状态",
            "hspUhfRdrCustom.rdrIp": {
                isIpaddr: "请输入正确的IP地址"
            },
            "hspUhfRdrCustom.rdrPort": {
                isIpPort: "请输入正确的ip端口"
            },
        }
    }).form();
}


/**
 * @ 获取站点列表
 */
function getHspUhfRdrByRdrSeq() {
    publicFun.httpServ(
        'post',
        getHspUhfRdrByRdrSeqUrl,
        {rdrSeq: dev.hspUhfRdrCustom.rdrSeq},
        function (data) {
            var hspUhfRdr = data.resultInfo.sysdata.hspUhfRdr;
            hspUhfRdr.buyDat = publicFun.timeFormat(hspUhfRdr.buyDat, 'yyyy/MM/dd');
            hspUhfRdr.fixDat = publicFun.timeFormat(hspUhfRdr.fixDat, 'yyyy/MM/dd');
            Object.assign(dev.hspUhfRdrCustom, hspUhfRdr);
        }, function (err) {
        }, 10000);
}


//修改UHF读写器
function editHspUhfRdr() {
    if (validateForm()) {

        var hspUhfRdrCustom = {};
        for(var a in dev.hspUhfRdrCustom){
            hspUhfRdrCustom[a] = dev.hspUhfRdrCustom[a];
        }
        var finalParams = {'hspUhfRdrCustom':hspUhfRdrCustom};
        finalParams = JSON.stringify(finalParams);

        $.ajax({
            url: editHspUhfRdrSubmitUrl,
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
function editHspUhfRdr_callback(data) {
    message_alert(data);
    if (data.resultInfo.type == '1') {
        setTimeout(function(){
            parent.closemodalwindow()
        }, 1000);
        parent.queryHspUhfRdr();
    }
}

$(function () {
    getHspUhfRdrByRdrSeq();
});