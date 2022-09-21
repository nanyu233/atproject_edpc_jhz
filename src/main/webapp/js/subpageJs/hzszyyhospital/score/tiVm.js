var vm = avalon.define({
    $id: 'TiGde',
    systemList: {
        ////////////////////////////////////////////评分
        tiBreCodList: [{dictsort: 1,id: "TI_BRE_COD01", info: "正常", infocode: "0", isenable: "1", remark: null, typecode: "TI_BRE_COD",checked: false},
                       {dictsort: 2, id: "TI_BRE_COD02", info: "胸痛", infocode: "1", isenable: "1", remark: null, typecode: "TI_BRE_COD",checked: false},
                       {dictsort: 3, id: "TI_BRE_COD03", info: "呼吸困难/咯血", infocode: "3", isenable: "1", remark: null, typecode: "TI_BRE_COD",checked: false},
                       {dictsort: 4, id: "TI_BRE_COD04", info: "误吸", infocode: "4", isenable: "1", remark: null, typecode: "TI_BRE_COD",checked: false},
                       {dictsort: 5,id: "TI_BRE_COD05", info: "窒息/全身发绀", infocode: "6", isenable: "1", remark: null, typecode: "TI_BRE_COD",checked: false}
        ], //呼吸
        tiCscCodList: [{dictsort: 1, id: "TI_CSC_COD01", info: "清醒", infocode: "0", isenable: "1", remark: null, typecode: "TI_CSC_COD",checked: false},
                       {dictsort: 2, id: "TI_CSC_COD02", info: "嗜睡", infocode: "1", isenable: "1", remark: null, typecode: "TI_CSC_COD",checked: false},
                       {dictsort: 3, id: "TI_CSC_COD03", info: "昏睡", infocode: "3", isenable: "1", remark: null, typecode: "TI_CSC_COD",checked: false},
                       {dictsort: 4, id: "TI_CSC_COD04", info: "半昏迷（运动或感觉缺失）", infocode: "4", isenable: "1", remark: null, typecode: "TI_CSC_COD",checked: false},
                       {dictsort: 5, id: "TI_CSC_COD05", info: "昏迷", infocode: "6", isenable: "1", remark: null, typecode: "TI_CSC_COD",checked: false}],
        tiPartCodList: [{dictsort: 1, id: "TI_PART_COD01", info: "无", infocode: "0", isenable: "1", remark: null, typecode: "TI_PART_COD",checked: false},
                        {dictsort: 2, id: "TI_PART_COD02", info: "四肢/皮肤", infocode: "1", isenable: "1", remark: null, typecode: "TI_PART_COD",checked: false},
                        {dictsort: 3, id: "TI_PART_COD03", info: "背部", infocode: "3", isenable: "1", remark: null, typecode: "TI_PART_COD",checked: false},
                        {dictsort: 4, id: "TI_PART_COD04", info: "胸/腹部", infocode: "4", isenable: "1", remark: null, typecode: "TI_PART_COD",checked: false},
                        {dictsort: 5, id: "TI_PART_COD05", info: "头/颈部", infocode: "6", isenable: "1", remark: null, typecode: "TI_PART_COD",checked: false}],
        tiPulCodList: [{dictsort: 1, id: "TI_PUL_COD01", info: "无下述情况", infocode: "0", isenable: "1", remark: null, typecode: "TI_PUL_COD",checked: false},
                       {dictsort: null, id: "TI_PUL_COD00", info: "", infocode: "", isenable: "", remark: null, typecode: "TI_PUL_COD0",checked: false},
                       {dictsort: 2, id: "TI_PUL_COD02", info: "80≤收缩压<100（mmHg）/100<脉搏≤140（bpm）", infocode: "3", isenable: "1", remark: "收缩压+脉搏", typecode: "TI_PUL_COD",checked: false},
                       {dictsort: 3, id: "TI_PUL_COD03", info: "收缩压<80（mmHg）/脉搏>140（bpm）", infocode: "4", isenable: "1", remark: "收缩压+脉搏", typecode: "TI_PUL_COD",checked: false},
                       {dictsort: 4, id: "TI_PUL_COD04", info: "无脉搏", infocode: "6", isenable: "1", remark: "收缩压+脉搏", typecode: "TI_PUL_COD",checked: false}],
        tiTrmCodList: [{dictsort: 5, id: "TI_TRM_COD05", info: "无", infocode: "0", isenable: "1", remark: null, typecode: "TI_TRM_COD",checked: false},
                       {dictsort: 1, id: "TI_TRM_COD01", info: "裂伤/挫伤", infocode: "1", isenable: "1", remark: null, typecode: "TI_TRM_COD",checked: false},
                       {dictsort: 2, id: "TI_TRM_COD02", info: "刺伤", infocode: "3", isenable: "1", remark: null, typecode: "TI_TRM_COD",checked: false},
                       {dictsort: 3, id: "TI_TRM_COD03", info: "钝性伤", infocode: "4", isenable: "1", remark: null, typecode: "TI_TRM_COD",checked: false},
                       {dictsort: 4, id: "TI_TRM_COD04", info: "弹道伤", infocode: "6", isenable: "1", remark: null, typecode: "TI_TRM_COD",checked: false}],
        tiWcxCodList: [{dictsort: 2, id: "TI_WCX_COD02", info: "无", infocode: "0", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked: false},
                       {dictsort: 1, id: "TI_WCX_COD01", info: "有", infocode: "1", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked: false}]
    },
    hspTiCustom: {
        emgSeq: emgSeq,
        tiSeq: emgSeq
    },
    aboutTi: {
        tiBreCod: '', //呼吸
        tiCscCod: '',
        tiPartCod: '',
        tiPulCod: '',
        tiSbuCod: '',
        tiTrmCod: '',
        tiWcxCod: '',
        tiTrmOther: '',
        tiBreCodnum: 0, //呼吸
        tiCscCodnum: 0,
        tiPartCodnum: 0,
        tiPulCodnum: 0,
        tiSbuCodnum: 0,
        tiTrmCodnum: 0,
        tiWcxCodnum: 0,
        tiSco: null
    },
    Objradioclick:  function (name, idx) {
        vm.aboutTi[name + 'num'] = publicFun.radioClicks(vm.systemList[name + 'List'], vm.aboutTi[name], idx)
        let list = vm.systemList[name + 'List'];
        vm.aboutTi[name] = list[idx]['infocode']
        vm.aboutTi.tiSco = +vm.aboutTi.tiBreCodnum + +vm.aboutTi.tiCscCodnum + +vm.aboutTi.tiPartCodnum + +vm.aboutTi.tiPulCodnum + +vm.aboutTi.tiTrmCodnum + +vm.aboutTi.tiWcxCodnum
    }
})
$(function () {
    editList()
})
   function editList() {
    const map = ["tiBreCod", "tiCscCod", "tiPartCod", "tiPulCod", "tiTrmCod","tiWcxCod"]
    for (let item of map) {
        let name = item + 'List'
        for (let item1 of vm.systemList[name]) {
            if(item1.infocode === parent.sub.tiProps[item]) {
                item1.checked = true
                vm.aboutTi[item] = item1.infocode
                vm.aboutTi[item + 'num'] = item1.infocode
                vm.aboutTi.tiSco = +vm.aboutTi.tiBreCodnum + +vm.aboutTi.tiCscCodnum + +vm.aboutTi.tiPartCodnum + +vm.aboutTi.tiPulCodnum + +vm.aboutTi.tiTrmCodnum + +vm.aboutTi.tiWcxCodnum
            }
        }
    }
   }

