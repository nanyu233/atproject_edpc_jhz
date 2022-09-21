var vm = avalon.define({
  $id: 'TashGde',
  systemList: {
    ////////////////////////////////////////////评分
    tiBreCodList: [{dictsort: 1, id: "TI_WCX_COD02", info: "无", infocode: "0", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false},
      {dictsort: 2, id: "TI_WCX_COD01", info: "有", infocode: "3", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false}],
    tiCscCodList: [{dictsort: 1, id: "TASH_XL_COD02", info: ">120", infocode: "2", isenable: "1", remark: 'cs', typecode: "TASH_XL_COD",checked:false},
      {dictsort: 2, id: "TASH_XL_COD00", info: "<=120", infocode: "0", isenable: "1", remark: 'cs', typecode: "TASH_XL_COD",checked:false},],
    tiParCodList: [{dictsort: 1, id: "TASH_XHDB_COD08", info: "<7", infocode: "8", isenable: "1", remark: 'cs', typecode: "TASH_XHDB_COD",checked:false},
      {dictsort: 2, id: "TASH_XHDB_COD06", info: "7-9", infocode: "6", isenable: "1", remark: 'cs', typecode: "TASH_XHDB_COD",checked:false},
      {dictsort: 3, id: "TASH_XHDB_COD04", info: "9-10", infocode: "4", isenable: "1", remark: 'cs', typecode: "TASH_XHDB_COD",checked:false},
      {dictsort: 4, id: "TASH_XHDB_COD03", info: "10-11", infocode: "3", isenable: "1", remark: 'cs', typecode: "TASH_XHDB_COD",checked:false},
      {dictsort: 5, id: "TASH_XHDB_COD02", info: "11-12", infocode: "2", isenable: "1", remark: 'cs', typecode: "TASH_XHDB_COD",checked:false},
      {dictsort: 6, id: "TASH_XHDB_COD00", info: ">=12", infocode: "0", isenable: "1", remark: 'cs', typecode: "TASH_XHDB_COD",checked:false}],
    tiPulCodList: [{dictsort: 1, id: "TASH_SSY_COD01", info: "<100", infocode: "4", isenable: "1", remark: 'CS', typecode: "TASH_SSY_COD",checked:false},
      {dictsort: 2, id: "TASH_SSY_COD01", info: "100-200", infocode: "1", isenable: "1", remark: 'CS', typecode: "TASH_SSY_COD",checked:false},
      {dictsort: 3, id: "TASH_SSY_COD01", info: ">=120", infocode: "0", isenable: "1", remark: 'CS', typecode: "TASH_SSY_COD",checked:false},],
    tiTrmCodList: [{dictsort: 1, id: "TASH_JSY_COD04", info: "<-10", infocode: "4", isenable: "1", remark: 'CS', typecode: "TASH_JSY_COD",checked:false},
      {dictsort: 2, id: "TASH_JSY_COD03", info: "-10到-6", infocode: "3", isenable: "1", remark: 'CS', typecode: "TASH_JSY_COD",checked:false},
      {dictsort: 3, id: "TASH_JSY_COD01", info: "-6到-2", infocode: "1", isenable: "1", remark: 'CS', typecode: "TASH_JSY_COD",checked:false},
      {dictsort: 4, id: "TASH_JSY_COD00", info: "-2和+2之间", infocode: "0", isenable: "1", remark: 'CS', typecode: "TASH_JSY_COD",checked:false}],
    tiWcxCodList: [{dictsort: 1, id: "TI_WCX_COD02", info: "无", infocode: "0", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false},
      {dictsort: 2, id: "TI_WCX_COD01", info: "有", infocode: "6", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false}],
    tiWaxCodList: [{dictsort: 1, id: "TI_WCX_COD02", info: "无", infocode: "0", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false},
      {dictsort: 2, id: "TI_WCX_COD01", info: "有", infocode: "3", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false}],
    tiSexCodList: [
      {dictsort: 2, id: "TI_WCX_COD01", info: "女性", infocode: "0", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false},
      {dictsort: 1, id: "TI_WCX_COD02", info: "男性", infocode: "1", isenable: "1", remark: null, typecode: "TI_WCX_COD",checked:false}]
  },
  hspTashInfCustom: {
    emgSeq: emgSeq,
    tiSeq: emgSeq
  },
  aboutTi: {
    tashPr: '',
    tiBreCod: '', //腹腔游离液
    tiCscCod: '',
    tiParCod: '',
    tiPulCod: '',
    tiSbuCod: '',
    tiTrmCod: '',
    tiWcxCod: '',
    tiWaxCod: '',
    tiSexCod: '',
    tiTrmOther: 0,
    tiBreCodnum: 0, //腹腔游离液
    tiCscCodnum: 0,
    tiParCodnum: 0,
    tiPulCodnum: 0,
    tiSbuCodnum: 0,
    tiTrmCodnum: 0,
    tiWcxCodnum: 0,
    tiWaxCodnum: 0,
    tiSexCodnum: 0,
    tiSco:  0
  },
  Objradioclick:  function (name, idx) {
    vm.aboutTi[name + 'num'] = publicFun.radioClicks(vm.systemList[name + 'List'], vm.aboutTi[name], idx)
    let list = vm.systemList[name + 'List'];
    vm.aboutTi[name] = list[idx]['infocode']
    vm.aboutTi.tiSco = +vm.aboutTi.tiBreCodnum + +vm.aboutTi.tiCscCodnum + +vm.aboutTi.tiParCodnum + +vm.aboutTi.tiPulCodnum + +vm.aboutTi.tiWaxCodnum + +vm.aboutTi.tiTrmCodnum + +vm.aboutTi.tiWcxCodnum + +vm.aboutTi.tiSexCodnum
  }
})
vm.aboutTi.$watch('tiSco', function (newVal, oldVal, name) {
    if (newVal) {
      vm.aboutTi.tashPr = (1 / (1 + Math.exp(4.9-0.3 * newVal))).toFixed(4)
    }
});

$(function () {
  editList()
})

function editList() {
  const  map = {
    isFqyly: 'tiBreCodList',
    isGggz: 'tiWaxCodList',
    isGpgz: 'tiWcxCodList',
    isSex: 'tiSexCodList',
    jsyCod: 'tiTrmCodList',
    ssyCod: 'tiPulCodList',
    xhdbCod: 'tiParCodList',
    xlCod: 'tiCscCodList'
  }
  const map1 = ['tiBreCod', 'tiWaxCod', 'tiWcxCod', 'tiSexCod', 'tiTrmCod', 'tiPulCod','tiParCod','tiCscCod']
  for (let key in map) {
    for (let key1 in parent.sub.props) {
      if (key1 == key) {
        for (let item of vm.systemList[map[key1]]) {
          if (item.infocode === parent.sub.props[key1]) {
            item.checked = true
            vm.aboutTi[map[key1].slice(0,8)] = item.infocode
            vm.aboutTi[map[key1].slice(0,8) + 'num'] = item.infocode
            vm.aboutTi.tiSco = +vm.aboutTi.tiBreCodnum + +vm.aboutTi.tiCscCodnum + +vm.aboutTi.tiParCodnum + +vm.aboutTi.tiPulCodnum + +vm.aboutTi.tiWaxCodnum + +vm.aboutTi.tiTrmCodnum + +vm.aboutTi.tiWcxCodnum + +vm.aboutTi.tiSexCodnum
          }
        }
      }
    }
  }

}

