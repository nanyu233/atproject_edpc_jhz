// 已在common_js.jsp中声明公共变量_baseUrl

var icuOpenModal = {
    exChgInfo: {}, // 储存跳转数据
    setExChgInfo: function (o) {
        for (var k in o) {
            if (o.hasOwnProperty(k)) {
                this.exChgInfo[k] = o[k];
            }
        }
    },
    getExChgInfo: function () {
        // 改为获取parent。modal弹窗都有parent
        var o = parent.icuOpenModal.exChgInfo;
        if (Object.keys(o).length === 0) {
            // 如果没有值
            return null;
        } else {
            parent.icuOpenModal.exChgInfo = {};
            return o;
        }
    },
    createModal: function (modalTitle, modalWidth, modalHeight, modalUrl) {
        // 插入模板标识
        this.exChgInfo.modalFlag = '1';
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 床位绑定设备
     */
    bedBindDev: function (params) {
        this.setExChgInfo(params);
        var modalTitle = '绑定设备';
        var modalWidth = 500;
        var modalHeight = 400;
        var modalUrl = _baseUrl + 'icudevinfo/toBedBindDev.do';
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 设备维护
     */
    openDevEdit: function (flag, devInfo) {
        var modalTitle;
        var modalWidth = 600;
        var modalHeight = 500;
        if (flag === 'edit') {
            modalTitle = '修改设备'
            // 修改设置修改标记
            devInfo.editFlag = '1';
            if (!devInfo) {
                alert_warn('未选中数据！');
                return;
            }
            this.setExChgInfo(devInfo);
        } else {
            modalTitle = '新增设备'
        }
        var modalUrl = _baseUrl + 'icudevinfo/editdevinfo.do';
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 泵组维护
     */
    openPumpGrpEdit: function () {
        var modalTitle = '泵组维护';
        var modalWidth = 800;
        var modalHeight = 509;
        var modalUrl = _baseUrl + 'icudevinfo/toEditPumpGrp.do';
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 整体维护
     */
    openZtwh: function (type, params) {
        var vsDateStr = params.vsDateStr || publicFun.timeFormat(new Date().getTime(), 'yyyy/MM/dd hh:mm');
        var pageType;
        var vsTypeList;
        if (typeof type === 'string') {
            // 参数为页面类型
            pageType = type;
        } else if (type instanceof Array) {
            // 参数为vsType
            vsTypeList = type;
        }
        var modalTitle = params.modalTitle || '整体维护';
        var modalWidth = 900;
        var modalHeight = 600;
        var modalUrl = _baseUrl + 'icuVitlIo/toVsZtwh.do';
        // 根据页面类型判断vsType
        if (pageType === 'vsCareSheet') {
            vsTypeList = ['VS', 'RM'];
        } else if (pageType === 'ioCareSheet') {
            vsTypeList = ['NC'];
        } else if (pageType === 'dayCareSheet') {
            vsTypeList = ['DC'];
        } else if (pageType === 'bgCareSheet') {
            vsTypeList = ['BG'];
        }
        // 根据类型判断高度
        if (vsTypeList.length === 1) {
            // 如果vsType为单一类型维护
            switch (vsTypeList[0]) {
                case 'VS':
                    modalHeight = 380;
                    break;
                case 'RM':
                    modalHeight = 340;
                    break;
                case 'NC':
                    modalHeight = 330;
                    break;
                case 'DC':
                    modalHeight = 540;
                    break;
                case 'BG':
                    modalHeight = 460;
                    break;
                case 'IP':
                case 'SP':
                    modalHeight = 300;
                    break;
            }
        } else {
            // 如果打开为多个类型
        }
        if (!params.vsDateStr) {
            params.vsDateStr = vsDateStr;
        }
        this.exChgInfo.vsType = vsTypeList;
        this.setExChgInfo(params);
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 微泵绑定医嘱
     */
    openMicPumpBindMp: function (params) {
        var devCom;
        var devInfo = params.devInfo;
        if (!params.devCom) {
            devCom = 'COM' + params.devComSeq;
            params.devCom = devCom;
        }
        this.setExChgInfo(params);
        var modalTitle = devInfo.devName ? (devInfo.devName + '-绑定医嘱') : '设备绑定医嘱';
        var modalWidth = 900;
        var modalHeight = 600;
        var modalUrl = _baseUrl + 'icudoctadvi/toMicPumpBindMp.do';
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 微泵医嘱状态改变
     */
    openMpStatusInfo: function (params) {
        var targetStatus = params.targetStatus;
        var modalTitle;
        var modalWidth = 520;
        var modalHeight = 300;
        switch (targetStatus) {
            case 'start':
                modalTitle = '开始进度';
                break;
            case 'end':
                modalTitle = '结束进度';
                break;
            default:
                modalTitle = '维护进度';
                break;
        }
        var modalUrl = _baseUrl + 'icudoctadvi/toMpExecInfo.do';
        this.setExChgInfo(params);
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 管路类型
     */
    openPipeDefEdit: function (params) {
        var modalTitle = '维护管路类型';
        var modalWidth = 800;
        var modalHeight = 525;
        var modalUrl = _baseUrl + 'icupipe/toPipeDefPage.do';
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
    /**
     * 评分增删改
     */
    openScoEdit: function (params) {
        var menuInfoObj = eicuUtil.getMenuInfo();
        var gradeType = params.gradeType;
        var modalTitle = params.modalTitle || '';
        var modalWidth = 900;
        var modalHeight = 600;
        // dynamic def
        var defUrlInfo;
        var modalUrl;
        var scoTableMode = ''; //def table mode h|v|c
        var defParamList; // params from def
        var tempArr;
        var tempStr;
        $.each(menuInfoObj, function (k, v) {
            if (v.menuType === gradeType) {
                defUrlInfo = v.menuUrl.split('?');
                modalUrl = _baseUrl + defUrlInfo[0];
                defParamList = defUrlInfo[1] ? defUrlInfo[1].split('&') : []; // ['mode=h|v|c', 'size=w|h']
                defParamList.forEach(function (ele) {
                    tempArr = ele.split('=');
                    tempStr = tempArr[0];
                    if (tempStr === 'mode') {
                        scoTableMode = tempArr[1];
                    } else if (tempStr === 'size') {
                        tempArr = tempArr[1].split('|');
                        modalWidth = tempArr[0];
                        modalHeight = tempArr[1];
                    }
                })
                if (!modalTitle) {
                    // auto modal title
                    modalTitle = v.menuName;
                    if (params.gradeSeq) {
                        modalTitle += '-修改'
                    } else {
                        modalTitle += '-新增'
                    }
                }
                return false;
            }
        })
        // 调试长款直接赋值 modalWidth & modalHeight
        params.scoTableMode = scoTableMode;
        this.setExChgInfo(params);
        this.createModal(modalTitle, modalWidth, modalHeight, modalUrl);
    },
}