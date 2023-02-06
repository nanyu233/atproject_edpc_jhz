// 字段变化一一对比

var comparePreFieldInfo = {}, // 已保存的数据
  compareSufFieldInfo = {}; // 后修改的数据
function generateFieldInfo() {
  var compareInfo = [
    {
      explainInfo: '基本信息修改',
      changeContent: [
        { info: '预检时间', field: 'emgDat' },
        { info: '就诊卡', field: 'vstCad' },
        { info: '身份证号', field: 'idNbr' },
        { info: '姓名', field: 'cstNam' },
        { info: '性别', field: 'cstSexCod' },
        { info: '入院年龄', field: 'cstAge' }, // cstAgeCod
        { info: '联系方式', field: 'pheNbr' },
        { info: '联系地址', field: 'cstAdr' },
        { info: '孕周(周)', field: 'yz' },
        { info: '末次月经', field: 'mcyj' }
      ]
    },
    {
      explainInfo: '分诊信息、体征及处理修改',
      changeContent: [
        { info: '患者类型', field: 'patientTyp' },
        { info: '绿色通道', field: 'grnChl' },
        { info: '绿通原因', field: 'grnChlRsn' },
        { info: '三无人员', field: 'swChl' },
        { info: '三大中心', field: 'xtFlg' },
        // { info: '卒中', field: 'czFlag'},
        // { info: '创伤', field: 'cspgFlg'},
        { info: '特殊病症', field: 'wzbz' },
        { info: '快速分诊', field: 'ksfz' },
        { info: '到院方式', field: 'arvChlCod' },
        { info: '陪送人员', field: 'cmpPsnCod' },
        { info: '主诉症状', field: 'preDgnCod' },
        { info: '自觉症状', field: 'zjzzCod' },
        { info: '危急征象', field: 'jwgfxCod' },
        { info: '体温', field: 'tmpNbr' },
        { info: '呼吸', field: 'breNbr' },
        { info: '脉搏', field: 'hrtRte' },
        { info: '血压', field: 'sbpUpNbr' }, // sbpDownNbr
        { info: '血氧', field: 'oxyNbr' },
        { info: '疼痛评分', field: 'nrsSco' },
        { info: '意识', field: 'senStuCod' },
        { info: 'AVPU', field: 'senRctCod' },
        { info: '跌倒评估', field: 'fallAssCod' }, // fallAssCod  fallAssEssText
        { info: '血糖', field: 'xtNbr' },
        { info: '防跌措施', field: 'fdcsCod' },
        { info: '阴道出血', field: 'pregnantYdcxCod' },
        { info: '宫缩频率', field: 'pregnantGsplCod' },
        { info: '月经史', field: 'mnsSitCod' },
        { info: 'CRT', field: 'crt' },
        { info: 'PEWS', field: 'pewsSco' },
        { info: 'MEWS', field: 'mewsTotSco' },
        { info: 'GCS', field: 'gcsTotSco' },
        { info: 'RTS', field: 'rtsTotSco' },
        { info: '120送入', field: 'sendInCod' },
        { info: '120送入-驾驶员', field: 'abnDriver' },
        { info: '120送入-医生', field: 'abnDoctor' },
        { info: '120送入-护士', field: 'abnNurse' },
        { info: '120送入-是否规范', field: 'gfFlg' },
        { info: '不规范-原因', field: 'gfbz' },
        { info: '120送入-转入医院', field: 'abnScoNme' }
      ]
    }, {
      explainInfo: '就诊信息修改',
      changeContent: [
        { info: '去向', field: 'cstDspCod' },
        // { info: '核酸', field: 'ywhs' },
        { info: '床位', field: 'bedid' },
        { info: '就诊科室', field: 'emgFkName' },
        { info: '首诊医生', field: 'sqlDctNbr' },
        { info: '自动分级', field: 'chkLvlCod' },
        { info: '修订分级', field: 'modLvlCod' },
        { info: '修订理由', field: 'modLvlDes' },
        { info: '备注', field: 'yjbzCod' }
        // { info: '转归情况', field: 'zgStr'}
      ]
    }
  ];
  return compareInfo
}

function generateFieldObj() {
  var fieldInfo = generateFieldInfo();
  var fieldObj = {};
  fieldInfo.forEach(function (val) {
    val.changeContent.forEach(function (sub) {
      fieldObj[sub.field] = ''
    })
  })
  return fieldObj
}

function dealCompareMsg(obj) {
  var judgeMsg = '';
  for (var key in obj) {
    if (vm.aboutMews.hasOwnProperty(key)) {
      judgeMsg = vm.aboutMews[key]
    } else {
      judgeMsg = vm.patientMsg[key];
    }
    obj[key] = judgeMsg;
    if (['grnChl', 'swChl', 'gfFlg'].indexOf(key) != -1) {
      obj[key] = judgeMsg == '1' ? '是' : '否'
      if (key === 'gfFlg' && judgeMsg != '1' && judgeMsg !== 0 && judgeMsg !== '0') {
        obj[key] = ''
      }
    } else if (key === 'xtFlg') {
      var _threeCenter = '';
      if (vm.patientMsg.xtFlg == '1') {
        _threeCenter += '胸痛；'
      } 
      if (vm.patientMsg.czFlag == '1') {
        _threeCenter += '卒中；'
      } 
      if (vm.patientMsg.cspgFlg == '1') {
        _threeCenter += '创伤；'
      }
      obj[key] = _threeCenter
    } else if (['chkLvlCod', 'modLvlCod'].indexOf(key) != -1 && judgeMsg !== '') {
      var checkLevelList = ['Ⅰ级', 'Ⅱ级', 'Ⅲ级', 'Ⅳ级'];
      obj[key] = checkLevelList[judgeMsg]
    } else if (key === 'wzbz') {
      obj[key] = '';
      var msgList = vm.getMsg[key + "List"];
      for (var i = 0; i < msgList.length; i++) {
        if ($.inArray(msgList[i].infocode, judgeMsg) > -1) {
          obj[key] += msgList[i].info + '、';
        }
      }
    } else if (key === 'cstAge') {
      var cstAge = vm.patientMsg.cstAge,
        cstAgeCod = vm.patientMsg.cstAgeCod;
      var ageNameList = vm.getMsg.cstAgeCodList, ageName = '';
      for (var i = 0; i < ageNameList.length; i++) {
        if (ageNameList[i].infocode == cstAgeCod) {
          ageName = ageNameList[i].info
        }
      }
      if (cstAge !== '' && cstAge != null) {
        obj[key] = cstAge + ageName
      }
    } else if (key === 'fallAssCod') {
      if (judgeMsg == '#') { // 非高危
        obj[key] = '非高危'
      } else if (judgeMsg !== '' && judgeMsg != null) {
        obj[key] = '高危'
      }
    } else if (['ksfz', 'cmpPsnCod', 'zjzzCod', 'jwgfxCod', 'fdcsCod', 'yjbzCod'].indexOf(key) != -1) {
      obj[key] = $('#' + key + 'Param').val()
    } else if (key === 'patientTyp') {
      // 1:成人 2:儿童 3:产科 4：妇科
      obj[key] = judgeMsg == '1' ? '成人' : judgeMsg == '2' ? '儿童' : judgeMsg == '3' ? '产科' : '妇科'
    } else if (key === 'pewsSco') {
      obj[key] = vm.aboutPEWS.pewsSco
    } else if (key === 'sbpUpNbr') { // sbpDownNbr
      obj[key] = judgeMsg + '/' + vm.aboutMews.sbpDownNbr
    } else if (['cstSexCod', 'arvChlCod', 'cstDspCod', 'mnsSitCod', 'senRctCod', 'senStuCod', 'sendInCod', 'pregnantYdcxCod', 'pregnantGsplCod', 'ywhs'].indexOf(key) != -1) {
      var msgList = vm.getMsg[key + 'List'];
      if (key === 'cstDspCod') {
        msgList = _islgbed != 1 ? vm.getMsg.cstDspCodList : vm.getMsg.cstDspCodLgList;
      }
      for (var i = 0; i < msgList.length; i++) {
        if (msgList[i].infocode == judgeMsg) {
          obj[key] = msgList[i].info
        }
      }
    } else if (key === 'bedid') {
      obj[key] = $('#bedId option:selected').text();
    } else if (key === 'zgStr') {
      if (vm.patientMsg.sqlSeq != vm.patientMsg.firstsqlseq) {
        obj[key] = $('.zgInfoJoin').text().replace(/\s+/g, " ").replace(/\n/g, " ");
      } else {
        obj[key] = '无'
      }
    }
  }
  return obj
}