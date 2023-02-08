// 预检中的公用方法
var commonFun = {
  /**
   * @rems评分计算
   */
  countRems:{
    huxipl: function (_breNbr) {
      var huxipl;
      if (_breNbr > 49 || _breNbr<6) {
        huxipl = 4
      } else if (35 <= _breNbr && _breNbr <= 49) {
        huxipl = 3
      } else if ((25 <= _breNbr && _breNbr <= 34)||(10 <= _breNbr && _breNbr <= 11)) {
        huxipl = 1
      } else if (12 <= _breNbr && _breNbr <= 24) {
        huxipl = 0
      }else if (6 <= _breNbr && _breNbr <= 9) {
        huxipl = 2
      }
      return huxipl
    },
    mb: function (_hrtRte) {
      var mb;
      if (_hrtRte > 179||_hrtRte < 40) {
        mb = 4
      } else if ((40 <= _hrtRte && _hrtRte <= 54) || (140 <= _hrtRte && _hrtRte <= 179)) {
        mb = 3
      } else if ((55 <= _hrtRte && _hrtRte <= 69) || (110 <= _hrtRte && _hrtRte <= 139)) {
        mb = 2
      } else if (70 <= _hrtRte && _hrtRte <= 109) {
        mb = 0
      }
      return mb
    },
    sbpUpNbr: function (_sbpNbr) {
      var sbpNbr;
      if (_sbpNbr > 179 || _sbpNbr < 70) {
        sbpNbr = 4
      } else if (150 <= _sbpNbr && _sbpNbr <= 179) {
        sbpNbr = 3
      } else if ((70 <= _sbpNbr && _sbpNbr <= 89)||(130 <= _sbpNbr && _sbpNbr <= 149)) {
        sbpNbr = 1
      } else if (90 <= _sbpNbr && _sbpNbr <= 129) {
        sbpNbr = 0
      } 
      return sbpNbr
    },
    GCS:function(_gcs){
      var gcs;
      if (_gcs > 13) {
        gcs = 0
      } else if (11 <= _gcs && _gcs <= 13) {
        gcs = 1
      } else if (8 <= _gcs && _gcs <= 10) {
        gcs = 2
      } else if (5 <= _gcs && _gcs <= 7) {
        gcs = 3
      }else if (_gcs < 5) {
        gcs = 4
      }
      return gcs
    },
    cstAge:function(_cstAge){
      var cstAge;
      if(_cstAge <45){
        cstAge = 0
      }else if(45 <= _cstAge && _cstAge <= 54){
        cstAge = 2
      }else if(55 <= _cstAge && _cstAge <= 64){
        cstAge = 3
      }else if(65 <= _cstAge && _cstAge <= 74){
        cstAge = 5
      }else if(_cstAge > 74){
        cstAge = 6
      }
      return cstAge
    },
    xueyang:function(_oxyNbr){
      var xueyang;
      if(_oxyNbr > 89){
        xueyang = 0
      }else if(86 <= _oxyNbr && _oxyNbr <= 89){
        xueyang = 1
      }else if(74 <= _oxyNbr && _oxyNbr <= 85){
        xueyang = 3
      }else if(_oxyNbr < 75){
        xueyang = 4
      }
      return xueyang
    }
  },
    /**
   * @rts评分计算
   */
  countRts: {
    /**
     * @rts计算-GCS
     */
    gcsTotSco: function (_gcsTotSco) {
      var gcsTotSco;
      if (_gcsTotSco >= 13 && _gcsTotSco <= 15) {
        gcsTotSco = 4;
      } else if(_gcsTotSco >= 9 && _gcsTotSco <= 12) {
        gcsTotSco = 3;
      } else if(_gcsTotSco >= 6 && _gcsTotSco <= 8) {
        gcsTotSco = 2;
      } else if(_gcsTotSco >= 4 && _gcsTotSco <= 5) {
        gcsTotSco = 1;
      } else if(_gcsTotSco == 3){
        gcsTotSco = 0;
      }
      return gcsTotSco;
    },
    /**
     * @rts计算-收缩压
     */
    sbpUpNbr: function(_sbpUpNbr) {
      var sbpUpNbr;
      if (_sbpUpNbr > 89){
        sbpUpNbr = 4;
      } else if(_sbpUpNbr >= 76 && _sbpUpNbr <= 89) {
        sbpUpNbr = 3;
      } else if(_sbpUpNbr >= 50 && _sbpUpNbr <= 75) {
        sbpUpNbr = 2;
      } else if(_sbpUpNbr >= 1 && _sbpUpNbr <= 49) {
        sbpUpNbr = 1;
      } else if(_sbpUpNbr == 0) {
        sbpUpNbr = 0;
      }
      return sbpUpNbr;
    },
    /**
     * @rts计算-呼吸
     */
    huxipl: function(_breNbr) {
      var huxipl;
      if (_breNbr >= 10 && _breNbr <= 29) {
        huxipl = 4;
      } else if(_breNbr > 29) {
        huxipl = 3;
      } else if(_breNbr >= 6 && _breNbr <= 9) {
        huxipl = 2;
      } else if(_breNbr >= 1 && _breNbr <= 5) {
        huxipl = 1;
      } else if(_breNbr == 0){
        huxipl = 0;
      }
      return huxipl;
    }    
  },
  /**
   * @获取rts计算相关参数
   */
  getCountRtsParams: function(){
    return {
      gcsTotSco: vm.patientMsg.gcsTotSco,
      sbpUpNbr: vm.aboutMews.sbpUpNbr,
      huxipl: vm.aboutMews.huxipl
    };
  },
  /**
   * @rts计算
   * @return '',0,1,2,3,4,5,6,7,8,9,10,11,12
   */
  countRtsCount: function() {
    var aboutRts = commonFun.getCountRtsParams();
    if(commonFun.checkEmptyForCount(aboutRts) === true){
      return commonFun.countRts.gcsTotSco(aboutRts.gcsTotSco) + commonFun.countRts.sbpUpNbr(aboutRts.sbpUpNbr) + commonFun.countRts.huxipl(aboutRts.huxipl);
    } else {
      return ''
    }
  },
  /**
 * @mews评分计算
 */
  countMews: {
    /**
     * @mews计算-呼吸
     */
    huxipl: function (_breNbr) {
      var huxipl;
      if (_breNbr >= 30) {
        huxipl = 3
      } else if ((21 <= _breNbr && _breNbr <= 29) || (_breNbr < 9)) {
        huxipl = 2
      } else if (15 <= _breNbr && _breNbr <= 20) {
        huxipl = 1
      } else if (9 <= _breNbr && _breNbr <= 14) {
        huxipl = 0
      }
      return huxipl
    },
    /**
     * @mews计算-体温
     */
    tiw: function (_tmpNbr) {
      var tiw;
      if (_tmpNbr >= 38.5 || _tmpNbr < 35) {
        tiw = 2
      } else if (35 <= _tmpNbr && _tmpNbr <= 38.4) {
        tiw = 0
      }
      return tiw
    },
    /**
     * @mews计算-收缩压
     */
    sbpNbr: function (_sbpNbr) {
      var sbpNbr;
      if (_sbpNbr <= 70) {
        sbpNbr = 3
      } else if (_sbpNbr >= 200 || (71 <= _sbpNbr && _sbpNbr <= 80)) {
        sbpNbr = 2
      } else if (81 <= _sbpNbr && _sbpNbr <= 100) {
        sbpNbr = 1
      } else if (101 <= _sbpNbr && _sbpNbr <= 199) {
        sbpNbr = 0
      }
      return sbpNbr
    },
    /**
     * @mews计算-心率
     */
    mb: function (_hrtRte) {
      var mb;
      if (_hrtRte >= 130) {
        mb = 3
      } else if ((111 <= _hrtRte && _hrtRte <= 129) || (_hrtRte <= 40)) {
        mb = 2
      } else if ((101 <= _hrtRte && _hrtRte <= 110) || (41 <= _hrtRte && _hrtRte <= 50)) {
        mb = 1
      } else if (51 <= _hrtRte && _hrtRte <= 100) {
        mb = 0
      }
      return mb
    },
  },
  /**
   * @获取mews计算相关参数
   */
  getMewsParams: function () {
    return {
      senRctCod: vm.aboutMews.senRctCod,
      huxipl: vm.aboutMews.huxipl,
      mb: vm.aboutMews.mb,
      tiw: vm.aboutMews.tiw,
      sbpUpNbr: vm.aboutMews.sbpUpNbr
    }
  },
   /**
   * @获取rems计算相关参数
   */
  getRemsParams: function () {
    return {
      mb: vm.aboutRems.mb,
      huxipl: vm.aboutRems.huxipl,
      gcsTotSco: vm.aboutRems.gcsTotSco,
      cstAge: vm.aboutRems.cstAge,
      xueyang: vm.aboutRems.xueyang,
      sbpUpNbr: vm.aboutRems.sbpUpNbr
    }
  },
  /**
   * @急诊分级相关参数
   */
  getCountChkLvlCodParams: function () {
    return {
      cstAge: vm.patientMsg.cstAge, // 年龄
      cstAgeCod: vm.patientMsg.cstAgeCod, // 年龄类型
      tiw: vm.aboutMews.tiw, //体温
      sbpUpNbr: vm.aboutMews.sbpUpNbr, //收缩压
      sbpDownNbr: vm.aboutMews.sbpDownNbr, // 舒张压
      huxipl: vm.aboutMews.huxipl, //呼吸频率
      mb: vm.aboutMews.mb, //心率
      xueyang: vm.patientMsg.xueyang, //血氧饱和度
      cspgFlg: vm.patientMsg.cspgFlg, //创伤标志
      cspgCod: vm.patientMsg.cspgCod, //创伤内容
      xtFlg: vm.patientMsg.xtFlg, //胸痛标志
      czFlag: vm.patientMsg.czFlag, //卒中标志
      nrsSco: vm.patientMsg.nrsSco, //疼痛评分
      mewsTotSco: vm.patientMsg.mewsTotSco, // mews评分
      pregnantYdcxCod: vm.patientMsg.pregnantYdcxCod, // 阴道出血
      pregnantGsplCod: vm.patientMsg.pregnantGsplCod, // 宫缩频率
      gcsTotSco: vm.aboutRems.gcsTotSco // GCS评分
      // refusedSurvey: vm.patientMsg.refusedSurvey // 拒测项
    }
  },
  /**
 * @检查MEWS与REMS评分相关数据
 * @检查是否有空值
 * @return {boolean}
 */
  checkEmptyForCount: function (obj) {
    var isAllCheckEmpty = true;
    $.each(obj, function (key, val) {
      if (val === '' || val === null) {
        isAllCheckEmpty = false;
      }
    });
    return isAllCheckEmpty
  },
  /**
 * @mews计算
 * @return '',0,1,2,3,4,5,6,7,8,9,10,11,12
 */
  countMewsCount: function () {
    var aboutMews = commonFun.getMewsParams();
    if (commonFun.checkEmptyForCount(aboutMews) === true) {
      return commonFun.countMews.huxipl(aboutMews.huxipl) + commonFun.countMews.tiw(aboutMews.tiw) + commonFun.countMews.sbpNbr(aboutMews.sbpUpNbr) + commonFun.countMews.mb(aboutMews.mb) + parseInt(aboutMews.senRctCod);
    } else {
      return ''
    }
  },

    /**
   * @rems计算
   * @return '',0,1,2,3,4,5,6,7,8,9,10,11,12
   */
  countRemsCount: function () {
    var aboutRems = commonFun.getRemsParams();
    if (commonFun.checkEmptyForCount(aboutRems) === true) {
      return commonFun.countRems.mb(aboutRems.mb) + commonFun.countRems.sbpUpNbr(aboutRems.sbpUpNbr) + commonFun.countRems.huxipl(aboutRems.huxipl) + commonFun.countRems.GCS(aboutRems.gcsTotSco) + commonFun.countRems.cstAge(aboutRems.cstAge) + commonFun.countRems.xueyang(aboutRems.xueyang);
    } else {
      return ''
    }
  },
  /**
 * @mews计算[成人、产科、妇科] => 基础分级计算
 * @return '',0,1,2,3
 */
  countChkLvlCodByMews: function () {
    var mewsScore = commonFun.countMewsCount();
    var typePat = vm.patientMsg.patientTyp;
    var chkLvlCodByMews;
    // 成人非孕产妇
    if (typePat === '1') {
      if (mewsScore >= 6) {
        chkLvlCodByMews = 0 // 一级
      } else if (mewsScore === 4 || mewsScore === 5) {
        chkLvlCodByMews = 1 // 二级
      } else if (mewsScore === 2 || mewsScore === 3) {
        chkLvlCodByMews = 2 // 三级
      } else if (mewsScore === 1 || mewsScore === 0) {
        chkLvlCodByMews = 3 // 四级
      } else if (mewsScore === '') {
        chkLvlCodByMews = ''
      }
    } else if (typePat === '3' || typePat === '4') {
      // 产科 妇科
      if (mewsScore >= 5) {
        chkLvlCodByMews = 0 // 一级
      } else if (mewsScore === 3 || mewsScore === 4) {
        chkLvlCodByMews = 1 // 二级
      } else if (mewsScore === 1 || mewsScore === 2) {
        chkLvlCodByMews = 2 // 三级
      } else if (mewsScore === 0) {
        chkLvlCodByMews = 3 // 四级
      } else if (mewsScore === '') {
        chkLvlCodByMews = ''
      }
    }
    return chkLvlCodByMews
  },
  /**
   * @pews计算[儿童] => 基础分级计算
   * @return '',0,1,2,3
   */
  countChkLvlCodByPews: function () {
    var pewsScore = vm.aboutPEWS.pewsSco;
    var typePat = vm.patientMsg.patientTyp;
    var chkLvlCodByPews;
    if (typePat === '2') {
      if (pewsScore >= 5) {
        chkLvlCodByPews = 0 // 一级
      } else if (pewsScore === '3' || pewsScore === '4') {
        chkLvlCodByPews = 1 // 二级
      } else if (pewsScore === '1' || pewsScore === '2') {
        chkLvlCodByPews = 2 // 三级
      } else if (pewsScore === '0') {
        chkLvlCodByPews = 3 // 四级
      } else if (pewsScore === '') {
        chkLvlCodByPews = ''
      }
    }
    return chkLvlCodByPews
  },
  /**
 * @成人非孕产妇分级标准return '',0,1,2,3
 */
  countAdultChkLvlCod: function () {
    var levelObj = commonFun.getCountChkLvlCodParams(),
      chkLvlCod = '3';
    // 生命体征项目 触发一级二级三级超出范围就标红 [date 2021/2/25]
    // 成人：体温<32℃或>41℃；心率≤50次/min 或  ≥141次/min ；呼吸≤8次/min或≥36次/min；收缩压≤80 mmH 或 ≥200mmHg ；SpO₂≤90%
    if (levelObj['tiw'] != '' && (levelObj['tiw'] < 32 || levelObj['tiw'] > 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (levelObj['sbpUpNbr'] != '' && (levelObj['sbpUpNbr'] <= 80) || (levelObj['sbpUpNbr'] >= 200)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (levelObj['mb'] != '' && (levelObj['mb'] <= 50 || levelObj['mb'] >= 141)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if ((levelObj['xueyang'] != '' && levelObj['xueyang'] <= 90)) {
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    if (levelObj['huxipl'] != '' && (levelObj['huxipl'] <= 8 || levelObj['huxipl'] >= 36)) {
      vm.patientInfFlg.breNbrFlag = 1;
    } else {
      vm.patientInfFlg.breNbrFlag = 0;
    }
    /**
     * @体温<32℃ 或  >41℃ =>  tiw
     * @心率<40次/min 或 >180次/min => mb
     * @呼吸频率≤8次/min 或 ≥36次/min => huxipl
     * @收缩压＜70mmHg 或 ＞220mmHg => sbpUpNbr
     * @血氧饱和度<80 SpO₂<80% => xueyang
     */
    if (levelObj['tiw'] != '' && (levelObj['tiw'] < 32 || levelObj['tiw'] > 41)) {
      return '0'
    }
    if (levelObj['mb'] != '' && (levelObj['mb'] < 40 || levelObj['mb'] > 180)) {
      return '0'
    }
    if (levelObj['huxipl'] != '' && (levelObj['huxipl'] <= 8 || levelObj['huxipl'] >= 36)) {
      return '0'
    }
    if (levelObj['sbpUpNbr'] != '' && (levelObj['sbpUpNbr'] < 70 || levelObj['sbpUpNbr'] > 220)) {
      return '0'
    }
    if (levelObj['xueyang'] != '' && levelObj['xueyang'] < 80) {
      return '0'
    }
    /**
     * @胸闷、卒中的指标，返回二级
     */
    if (levelObj['xtFlg'] === '1') {
      chkLvlCod = 1
    }
    if (levelObj['czFlag'] === '1') {
      chkLvlCod = 1
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '' || chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @无mews评分项目 || mews评分不全 || mews评分计算结果为二级/三级/四级
       * @心率40~50次/min 或 141~180次/min
       * @收缩压70~80mmHg 或 200~220mmHg
       * @血氧饱和度80-90
       * @疼痛评分7-10分
       * @直接默认二级
       */
      if ((40 <= levelObj['mb'] && levelObj['mb'] <= 50) || (141 <= levelObj['mb'] && levelObj['mb'] <= 180)) {
        chkLvlCod = 1;
      }
      if ((70 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 80) || (200 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 220 )) {
        chkLvlCod = 1;
      }
      if (80 <= levelObj['xueyang'] && levelObj['xueyang'] <= 90) {
        chkLvlCod = 1;
      }
      if (7 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 10) {
        chkLvlCod = 1;
      }
      /** 
       * mews评分计算结果为三级/四级
       * @ 疼痛评分4~6分（数字疼痛评分法）
       * @return '三级'
       */
      if (4 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 6) {
        chkLvlCod = 2;
      }

      /**
       * @if 有直接二级的项目
       * @age > 80 || 创伤标志 => 升1级
       */
      /**
       * @else 无直接二级的项目
       * @age > 80 || 创伤标志 => 变成三级
       */
      if (chkLvlCodByMews === '') {
        if (chkLvlCod === 1) {
          if (levelObj['cstAge'] > 80 && levelObj['cstAgeCod'] === '0') {
            chkLvlCod--;
          }
          if (levelObj['cspgFlg'] === '1' && levelObj['cspgCod']) {
            chkLvlCod--;
          }
          return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
        } else {
          if (levelObj['cstAge'] > 80 && levelObj['cstAgeCod'] === '0') {
            chkLvlCod--;
          }
          if (levelObj['cspgFlg'] === '1' && levelObj['cspgCod']) {
            chkLvlCod--;
          }
          return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
        }
      } else {
        chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
        if (levelObj['cstAge'] > 80 && levelObj['cstAgeCod'] === '0') {
          chkLvlCod--;
        }
        if (levelObj['cspgFlg'] === '1' && levelObj['cspgCod']) {
          chkLvlCod--;
        }
        return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
      }
    } else if (chkLvlCodByMews === 0) {
      return '0'
    }
  },
  /**
   * @产科分级标准return '',0,1,2,3
   */
  countPregnantChkLvlCod: function () {
    var levelObj = commonFun.getCountChkLvlCodParams(),
      chkLvlCod = '3';
    // 生命体征项目 触发一级二级三级超出范围就标红 by 2021/06/09 according to Miss Lan request
    // 产科：
    /**
     * @判定是否加waring颜色
     * @体温 ： 体温＜32 ℃或＞41 ℃
     * @脉搏 ：  心率≤50次/min 或≥100次/min；
     * @呼吸 ：  呼吸频率≤8次/min 或 ≥24次/min；
     * @收缩压 ：  收缩压≤90 mmHg 或≥140 mmHg；
     * @舒张压 ：舒张压≥90
     * @血氧 ： SpO2≤94%
     */
    if (levelObj['tiw'] != '' && (levelObj['tiw'] < 32 || levelObj['tiw'] > 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (levelObj['mb'] != '' && (levelObj['mb'] <= 50 || levelObj['mb'] >= 100)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if (levelObj['huxipl'] != '' && (levelObj['huxipl'] <= 8 || levelObj['huxipl'] >= 24)) {
      vm.patientInfFlg.breNbrFlag = 1;
    } else {
      vm.patientInfFlg.breNbrFlag = 0;
    }
    // 这边 血压变红 -- 只要上压或者下压有一项是达到标准
    if (levelObj['sbpUpNbr'] != '' && (levelObj['sbpUpNbr'] <= 90 || levelObj['sbpUpNbr'] >= 140)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      if (levelObj['sbpDownNbr'] != '' && (levelObj['sbpDownNbr'] >= 90)) {
        vm.patientInfFlg.sbpUpNbrFlag = 1;
      } else {
        vm.patientInfFlg.sbpUpNbrFlag = 0;
      }
    }
    if (levelObj['xueyang'] != '' && levelObj['xueyang'] <= 94) {
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    /**
     * @体温 <32℃ 或  >41℃ =>  tiw
     * @心率 < 50 或者 >= 120 => mb
     * @呼吸 <=8 或者 > 30  => huxipl
     * @血压收缩压 <70 或者 >= 220mmHg => sbpUpNbr
     * @血氧饱和度 <90 => xueyang
     * @疼痛评分 7-10 分
     * @return '一级'
     */
    if (levelObj['tiw'] != '' && (levelObj['tiw'] < 32 || levelObj['tiw'] > 41)) {
      return '0'
    }
    if (levelObj['mb'] != '' && (levelObj['mb'] < 50 || levelObj['mb'] >= 120)) {
      return '0'
    }
    if (levelObj['huxipl'] != '' && (levelObj['huxipl'] <= 8 || levelObj['huxipl'] > 30)) {
      return '0'
    }
    if (levelObj['sbpUpNbr'] != '' && (levelObj['sbpUpNbr'] < 70 || levelObj['sbpUpNbr'] >= 220)) {
      return '0'
    }
    if (levelObj['xueyang'] != '' && levelObj['xueyang'] < 90) {
      return '0'
    }
    if (levelObj['nrsSco'] !== '' && ( 7 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 10)) {
      return '0'
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '' || chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @无mews评分项目 || mews评分不全 || mews评分计算结果为 二级/三级/四级
       * @心率 110-119 => mb
       * @呼吸 24-30  => huxipl
       * @血压收缩压 70-90 或者 160-219
       * @血压舒张压 >= 110
       * @血氧饱和度 90-94
       * @疼痛评分 4-6分
       * @直接默认二级
       */
      if (110 <= levelObj['mb'] && levelObj['mb'] <= 119) {
        chkLvlCod = 1;
      }
      if (levelObj['huxipl'] != '' && (24 <= levelObj['huxipl'] && levelObj['huxipl'] <= 30)) {
        chkLvlCod = 1;
      }
      if ((70 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 90) || (160 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 219)) {
        chkLvlCod = 1;
      }
      if (levelObj['sbpDownNbr'] >= 110) {
        chkLvlCod = 1;
      }
      if (90 <= levelObj['xueyang'] && levelObj['xueyang'] <= 94) {
        chkLvlCod = 1;
      }
      if (4 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 6) {
        chkLvlCod = 1;
      }
      // 阴道出血选择大于月经量，或者选择等于月经量时，单项指标为二级
      if (levelObj['pregnantYdcxCod'] == '1' || levelObj['pregnantYdcxCod'] == '2') {
        chkLvlCod = 1;
      }
      // 如果宫缩频率选择小于等于5min 1次
      if (levelObj['pregnantGsplCod'] == '1') {
        chkLvlCod = 1;
      }
      if (chkLvlCodByMews !== '') {
        chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
      }
      if (chkLvlCod == 3) {
        /**
         * @心率100-109 => mb
         * @血压收缩压140-159 || 舒展压 90-109
         * @疼痛评分 1-3 分
         * @return '三级'
         */
        if (100 <= levelObj['mb'] && levelObj['mb'] <= 109) {
          chkLvlCod = 2;
        }
        if ((140 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 159) || (90 <= levelObj['sbpDownNbr'] && levelObj['sbpDownNbr'] <= 109)) {
          chkLvlCod = 2;
        }
        if (1 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 3) {
          chkLvlCod = 2
        }
      }
      return chkLvlCod.toString();
    } else if (chkLvlCodByMews === 0) {
      return '0'
    }
  },

  /**
 * @妇科分级标准return '',0,1,2,3
 */
  countWomenChkLvlCod: function () {
     var levelObj = commonFun.getCountChkLvlCodParams(),
      chkLvlCod = '3';
    // 生命体征项目 触发一级二级三级超出范围就标红 by 2021/06/09 according to Miss Lan request
    /**
     * @判定是否加waring颜色 妇科
     * @体温 ： 体温＜32 ℃或＞41 ℃
     * @脉搏 ：  心率≤50次/min 或≥110次/min；
     * @呼吸 ：  呼吸频率≤8次/min 或≥24次/min；
     * @收缩压 ：  收缩压≤90 mmHg 或≥160 mmHg；
     * @血氧 ： SpO2≤95%
     */
    if (levelObj['tiw'] != '' && (levelObj['tiw'] < 32 || levelObj['tiw'] > 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (levelObj['mb'] != '' && (levelObj['mb'] <= 50 || levelObj['mb'] >= 110)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if (levelObj['huxipl'] != '' && (levelObj['huxipl'] <= 8 || levelObj['huxipl'] >= 24)) {
      vm.patientInfFlg.breNbrFlag = 1;
    } else {
      vm.patientInfFlg.breNbrFlag = 0;
    }
    // 这边 血压变红 -- 只要上压或者下压有一项是达到标准
    if (levelObj['sbpUpNbr'] != '' && (levelObj['sbpUpNbr'] <= 90 || levelObj['sbpUpNbr'] >= 160)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (levelObj['xueyang'] != '' && levelObj['xueyang'] <= 95) {
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    /**
     * @体温 <32℃ 或  >41℃ =>  tiw
     * @心率 < 40 或者 > 180 => mb
     * @呼吸 <=8 或者 > 36  => huxipl
     * @血压收缩压 <70 或者 >= 220mmHg => sbpUpNbr
     * @血氧饱和度 <= 80 => xueyang
     * @return '一级'
     */
    if (levelObj['tiw'] != '' && (levelObj['tiw'] < 32 || levelObj['tiw'] > 41)) {
      return '0'
    }
    if (levelObj['mb'] != '' && (levelObj['mb'] < 40 || levelObj['mb'] > 180)) {
      return '0'
    }
    if (levelObj['huxipl'] != '' && (levelObj['huxipl'] <= 8 || levelObj['huxipl'] > 36)) {
      return '0'
    }
    if (levelObj['sbpUpNbr'] != '' && (levelObj['sbpUpNbr'] < 70 || levelObj['sbpUpNbr'] >= 220)) {
      return '0'
    }
    if (levelObj['xueyang'] != '' && levelObj['xueyang'] <= 80) {
      return '0'
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '' || chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @无mews评分项目 || mews评分不全 || mews评分计算结果为 二级/三级/四级
       * @心率 40~50次/min 或 141~180次/min => mb
       * @呼吸 30-36  => huxipl
       * @血压收缩压 70-80 或者 200-219
       * @血氧饱和度 81-90
       * @疼痛评分 7-10分
       * @直接默认二级
       */
      if ((40 <= levelObj['mb'] && levelObj['mb'] <= 50) || (141 <= levelObj['mb'] && levelObj['mb'] <= 180)) {
        chkLvlCod = 1;
      }
      if (levelObj['huxipl'] != '' && (30 <= levelObj['huxipl'] && levelObj['huxipl'] <= 36)) {
        chkLvlCod = 1;
      }
      if ((70 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 80) || (200 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 219)) {
        chkLvlCod = 1;
      }
      if (81 <= levelObj['xueyang'] && levelObj['xueyang'] <= 90) {
        chkLvlCod = 1;
      }
      if (7 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 10) {
        chkLvlCod = 1;
      }
      if (chkLvlCodByMews !== '') {
        chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
      }
      // 如果选择阴道出血大于月经量，则二级，危急征象指标为选中“阴道流血大于月经量” 阴道流血大于月经量 : 5。
      if (levelObj['pregnantYdcxCod'] == '1') {
        chkLvlCod = 1;
      }
      if (chkLvlCod == 3) {
        /**
         * @心率 110-140 => mb
         * @呼吸 24-29  => huxipl
         * @血压收缩压 80-90 || 160-200
         * @血氧饱和度 91-95
         * @疼痛评分 4-6 分
         * @return '三级'
         */
        if (110 <= levelObj['mb'] && levelObj['mb'] <= 140) {
          chkLvlCod = 2;
        }
        if (24 <= levelObj['huxipl'] && levelObj['huxipl'] <= 29) {
          chkLvlCod = 2;
        }
        if ((80 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 90) || (160 <= levelObj['sbpUpNbr'] && levelObj['sbpUpNbr'] <= 200)) {
          chkLvlCod = 2;
        }
        if (91 <= levelObj['xueyang'] && levelObj['xueyang'] <= 95) {
          chkLvlCod = 2;
        }
        if (4 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 6) {
          chkLvlCod = 2
        }
      }
      return chkLvlCod.toString();
    } else if (chkLvlCodByMews === 0) {
      return '0'
    }
  },
  /**
   * @儿童分级标准return '',0,1,2,3
  */
 countChildChkLvlCod: function () {
  var levelObj = commonFun.getCountChkLvlCodParams(),
    chkLvlCod = '3';
//   体温≤35或≥41；
//   心率 40~65或≥205（0~3个月）；40~63或≥180（3~6个月）；40~60或≥169（6~12个月）；40~58或≥145（1~3岁）；40~55或≥125（3~6岁）； ≤45或≥105（6~10岁）； <40(0~6岁）；<30(大于6岁）
//   呼吸：10~20或≥70（0~6个月）；10~17或≥55（6~12个月）；10~15或≥35（1~3岁）；8~12或≥28（3~6岁）；8~10或≥24（6~10岁）<10 (0~3岁）；<8 ( 大于3岁）
//   SpO2≤92%
//   收缩压＞130 mmHg（＞5岁）或＜80 mmHg（＞5岁）
  /**
   * @脉搏<40 次/min(0<y≤6 岁);<30(>6 岁); >140(3<y≤6 岁) ;>120(6<y≤10 岁)
   * @脉搏>230 次/min (0<y≤3 月);>210(3<y≤6 月);>180(6<y≤12 月); >165(1<y≤3 岁);
   * @呼吸<10 次/min(0<y≤3 岁); <8 (>3 岁); >80(y≤6 月);>60(6<y≤12 月);
   * @呼吸>40 次/min (1<y≤3 岁);>32(3<y≤6 岁);>26(6<y≤10 岁)
   * @SpO2<90% 体温≥38°C(新生儿 天数小于等于28天)
   */
  if (levelObj['cstAge'] != '') {
    // 0-6岁 包括6岁
    if ((levelObj['cstAgeCod'] === '0' && 0 < levelObj['cstAge'] && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '1' && 0 < levelObj['cstAge'] && levelObj['cstAge'] <= 72) || (levelObj['cstAgeCod'] === '2' && 0 < levelObj['cstAge'] && levelObj['cstAge'] <= 2160)) {
      // (0, 3月] 脉搏大于230 或者 脉搏小于40
      if ((levelObj['cstAgeCod'] === '1' && 0 < levelObj['cstAge'] && levelObj['cstAge'] <= 3) || (levelObj['cstAgeCod'] === '2' && 0 < levelObj['cstAge'] && levelObj['cstAge'] <= 90)) {
        if (levelObj['mb'] != '' && (levelObj['mb'] > 230 || levelObj['mb'] < 40)) {
          vm.patientInfFlg.hrtRteFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '1' && 3 < levelObj['cstAge'] && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '2' && 90 < levelObj['cstAge'] && levelObj['cstAge'] <= 180)) {
        // (3, 6月] 脉搏大于210 或者 脉搏小于40
        if (levelObj['mb'] != '' && (levelObj['mb'] > 210 || levelObj['mb'] < 40)) {
          vm.patientInfFlg.hrtRteFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '1' && 6 < levelObj['cstAge'] && levelObj['cstAge'] <= 12) || (levelObj['cstAgeCod'] === '2' && 180 < levelObj['cstAge'] && levelObj['cstAge'] <= 365) || (levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] == 1)) {
        // (6, 12月] 脉搏大于180 或者 脉搏小于40
        if (levelObj['mb'] != '' && (levelObj['mb'] > 180 || levelObj['mb'] < 40)) {
          vm.patientInfFlg.hrtRteFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else {
        // (1, 6岁] 脉搏小于40
        if (levelObj['mb'] != '' && (levelObj['mb'] < 40)) {
          vm.patientInfFlg.hrtRteFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
        if ((levelObj['cstAgeCod'] === '0' && 3 < levelObj['cstAge'] && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '1' && 36 < levelObj['cstAge'] && levelObj['cstAge'] <= 72)) {
          // (3, 6岁] 脉搏小于40 或者大于 140
          if (levelObj['mb'] != '' && (levelObj['mb'] > 140 || levelObj['mb'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
        } else {
          // (1, 3岁] 脉搏小于40 或者大于 165
          if (levelObj['mb'] != '' && (levelObj['mb'] > 165 || levelObj['mb'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
        }
      }
    } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 6) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 72)) {
      // 大于6岁 小于30
      if (levelObj['mb'] != '' && (levelObj['mb'] < 30)) {
        vm.patientInfFlg.hrtRteFlag = 1;
        chkLvlCod = 0
      } else {
        vm.patientInfFlg.hrtRteFlag = 0;
      }
      if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] <= 10) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] <= 120)) {
        // 6 -10] 岁 大于 120 或者 小于 30
        if (levelObj['mb'] != '' && (levelObj['mb'] > 120 || levelObj['mb'] < 30)) {
          vm.patientInfFlg.hrtRteFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      }
    }
  } else {
    vm.patientInfFlg.hrtRteFlag = 0;
  }

  if (levelObj['cstAge'] != '') {
    // 小于等于6个月 呼吸大于80 或者 小于 10
    if ((levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] <= 180)) {
      if ((levelObj['huxipl'] > 80 || levelObj['huxipl'] < 10) && levelObj['huxipl'] != '') {
        vm.patientInfFlg.breNbrFlag = 1;
        chkLvlCod = 0
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
    } else if ((levelObj['cstAgeCod'] === '1' && 6 < levelObj['cstAge'] && levelObj['cstAge'] <= 12) || (levelObj['cstAgeCod'] === '2' && 180 < levelObj['cstAge'] && levelObj['cstAge'] <= 365) || (levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] == 1)) {
      // （6-12个月] 不包含6月 呼吸大于60 或者 小于 10
      if ((levelObj['huxipl'] > 60 || levelObj['huxipl'] < 10) && levelObj['huxipl'] != '') {
        vm.patientInfFlg.breNbrFlag = 1;
        chkLvlCod = 0
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
    } else if ((levelObj['cstAgeCod'] === '0' && 1 < levelObj['cstAge'] && levelObj['cstAge'] <= 3) || (levelObj['cstAgeCod'] === '1' && 12 < levelObj['cstAge'] && levelObj['cstAge'] <= 36)) {
      // （1-3岁] 呼吸大于 40 或许 呼吸小于 10
      if ((levelObj['huxipl'] > 40 || levelObj['huxipl'] < 10) && levelObj['huxipl'] != '') {
        vm.patientInfFlg.breNbrFlag = 1;
        chkLvlCod = 0
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
    } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 3) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 36)) {
      // (3岁,  ) 呼吸小于8
      if (levelObj['huxipl'] != '' && (levelObj['huxipl'] < 8)) {
        vm.patientInfFlg.breNbrFlag = 1;
        chkLvlCod = 0
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
      // (3岁, 6岁] 呼吸小于8 或者 大于 32
      if ((levelObj['cstAgeCod'] === '0' && 3 < levelObj['cstAge'] && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '1' && 36 < levelObj['cstAge'] && levelObj['cstAge'] <= 72)) {
        if ((levelObj['huxipl'] > 32 || levelObj['huxipl'] < 8) && levelObj['huxipl'] != '') {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && 6 < levelObj['cstAge'] && levelObj['cstAge'] <= 10) || (levelObj['cstAgeCod'] === '1' && 72 < levelObj['cstAge'] && levelObj['cstAge'] <= 120)) {
        // (6岁, 10岁] 呼吸小于8 或者 大于 26
        if ((levelObj['huxipl'] > 26 || levelObj['huxipl'] < 8) && levelObj['huxipl'] != '') {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      }
    }
  } else {
    vm.patientInfFlg.breNbrFlag = 0;
  }

  if (levelObj['cstAge'] != '' && (commonFun.isChild(levelObj['cstAge'], levelObj['cstAgeCod']) == true)) {
    if (levelObj['tiw'] != '' && (levelObj['tiw'] <= 35 || levelObj['tiw'] >= 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
      chkLvlCod = 0
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
  } else {
    vm.patientInfFlg.tmpNbrFlag = 0;
  }
  if (levelObj['xueyang'] !== '' && levelObj['xueyang'] <= 92) {
    vm.patientInfFlg.oxyNbrFlag = 1
    chkLvlCod = 0
  } else {
    vm.patientInfFlg.oxyNbrFlag = 0;
  }

  /**
   * @胸闷、卒中的指标，返回二级
   */
   if (levelObj['xtFlg'] === '1') {
    return 1
  }
  if (levelObj['czFlag'] === '1') {
    return 1
  }

  if (chkLvlCod === 0) {
    return chkLvlCod.toString();
  }
  /**
   * @chkLvlCodByPews 对应的值有'',0,1,2,3
   */
  var chkLvlCodByPews = commonFun.countChkLvlCodByPews();
  if (chkLvlCodByPews === '' || chkLvlCodByPews === 1 || chkLvlCodByPews === 2 || chkLvlCodByPews === 3) {
    /**
     * @无pews评分项目 || pews评分不全 || 二级/三级/四级
     * @心率 40-65 205-230 次/min (0<y≤3 月); 40-63 180-210 (3<y≤6 月); 40-60  169- 180 (6<y≤12 月); 40-58 145-165(1<y≤3 岁);
     * @心率 40-55 125-140 次/min(3<y≤6 岁); 30-45 105-120 (6<y≤10 岁)
     * @呼吸10-20或70-80次/min(0<y≤6月); 10-17或55-60次/min(6<y≤12月)
     * @呼吸 10-15 或 35-40 次/min(1<y≤3 岁); 8-12 或 28-32 次/min(3<y≤6 岁); 8-10 或 24-26 次/min(6<y≤10 岁)
     * @收缩压 >130 mmHg 或 < 80 mmHg (y>5 岁) SpO2 90-92%
     * @疼痛评分 8-10分 行为学Flacc 和 面部表情法
     * @直接默认二级
     */
    // 心率
    if (levelObj['cstAge'] != '') {
      // 心率 40-65 205-230 次/min (0<y≤3 月)
      if ((levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 0 && levelObj['cstAge'] <= 3) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 0 && levelObj['cstAge'] <= 90)) {
        if ((40 <= levelObj['mb'] && levelObj['mb'] <= 65) || (205 <= levelObj['mb'] && levelObj['mb'] <= 230)) {
          chkLvlCod = 1;
          vm.patientInfFlg.hrtRteFlag = 1;
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 3 && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 90 && levelObj['cstAge'] <= 180)) {
        // 40-63 180-210 (3<y≤6 月)
        if ((40 <= levelObj['mb'] && levelObj['mb'] <= 63) || (180 <= levelObj['mb'] && levelObj['mb'] <= 210)) {
          chkLvlCod = 1;
          vm.patientInfFlg.hrtRteFlag = 1;
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] == 1) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 6 && levelObj['cstAge'] <= 12) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 180 && levelObj['cstAge'] <= 360)) {
        // 40-60  169- 180 (6<y≤12 月)
        if ((40 <= levelObj['mb'] && levelObj['mb'] <= 60) || (169 <= levelObj['mb'] && levelObj['mb'] <= 180)) {
          chkLvlCod = 1;
          vm.patientInfFlg.hrtRteFlag = 1;
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 1 && levelObj['cstAge'] <= 3) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 12 && levelObj['cstAge'] <= 36) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 365 && levelObj['cstAge'] <= 1095)) {
        // 40-58 145-165(1<y≤3 岁)
        if ((40 <= levelObj['mb'] && levelObj['mb'] <= 58) || (145 <= levelObj['mb'] && levelObj['mb'] <= 165)) {
          chkLvlCod = 1;
          vm.patientInfFlg.hrtRteFlag = 1;
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 3 && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 36 && levelObj['cstAge'] <= 72) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 1095 && levelObj['cstAge'] <= 2190)) {
        // 心率 40-55 125-140 次/min(3<y≤6 岁);
        if ((40 <= levelObj['mb'] && levelObj['mb'] <= 55) || (125 <= levelObj['mb'] && levelObj['mb'] <= 140)) {
          chkLvlCod = 1;
          vm.patientInfFlg.hrtRteFlag = 1;
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      } else if (levelObj['cstAge'] > 6 && levelObj['cstAge'] <= 10) {
        // 30-45 105-120 (6<y≤10 岁)
        if ((30 <= levelObj['mb'] && levelObj['mb'] <= 45) || (105 <= levelObj['mb'] && levelObj['mb'] <= 120)) {
          chkLvlCod = 1;
          vm.patientInfFlg.hrtRteFlag = 1;
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
      }
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    // 呼吸
    if (levelObj['cstAge'] != '') {
      // 呼吸10-20或70-80次/min(0<y≤6月)
      if ((levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 0 && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 0 && levelObj['cstAge'] <= 180)) {
        if ((10 <= levelObj['huxipl'] && levelObj['huxipl'] <= 20) || (70 <= levelObj['huxipl'] && levelObj['huxipl'] <= 80)) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] == 1) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 6 && levelObj['cstAge'] <= 12) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 180 && levelObj['cstAge'] <= 360)) {
        // 10-17或55-60次/min(6<y≤12月)
        if ((10 <= levelObj['huxipl'] && levelObj['huxipl'] <= 17) || (55 <= levelObj['huxipl'] && levelObj['huxipl'] <= 60)) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 1 && levelObj['cstAge'] <= 3) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 12 && levelObj['cstAge'] <= 36) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 365 && levelObj['cstAge'] <= 1095)) {
        // 呼吸 10-15 或 35-40 次/min(1<y≤3 岁)
        if ((10 <= levelObj['huxipl'] && levelObj['huxipl'] <= 15) || (35 <= levelObj['huxipl'] && levelObj['huxipl'] <= 40)) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 3 && levelObj['cstAge'] <= 6) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 36 && levelObj['cstAge'] <= 72) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 1095 && levelObj['cstAge'] <= 2190)) {
        // 8-12 或 28-32 次/min(3<y≤6 岁); 
        if ((8 <= levelObj['huxipl'] && levelObj['huxipl'] <= 12) || (28 <= levelObj['huxipl'] && levelObj['huxipl'] <= 32)) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 6 && levelObj['cstAge'] <= 10)) {
        // 8-10 或 24-26 次/min(6<y≤10 岁)
        if ((8 <= levelObj['huxipl'] && levelObj['huxipl'] <= 10) || (24 <= levelObj['huxipl'] && levelObj['huxipl'] <= 26)) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      }
    } else {
      vm.patientInfFlg.breNbrFlag = 0;
    }
    if (levelObj['cstAge'] != '' && ((levelObj['cstAgeCod'] === '0' && levelObj['cstAge'] > 5) || (levelObj['cstAgeCod'] === '1' && levelObj['cstAge'] > 60) || (levelObj['cstAgeCod'] === '2' && levelObj['cstAge'] > 1825))) {
      if ((levelObj['sbpUpNbr'] > 130) || (levelObj['sbpUpNbr'] < 80 && levelObj['sbpUpNbr'] !== '')) {
        chkLvlCod = 1;
        vm.patientInfFlg.sbpUpNbrFlag = 1;
      } else {
        vm.patientInfFlg.sbpUpNbrFlag = 0;
      }
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (90 <= levelObj['xueyang'] && levelObj['xueyang'] <= 92) {
      chkLvlCod = 1;
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    if (8 <= levelObj['nrsSco'] && levelObj['nrsSco'] <= 10) {
      chkLvlCod = 1;
    }
    if (chkLvlCodByPews === '') {
      /**
       * @if 有直接二级的项目
       * @ 创伤标志 => 升1级
       */
      /**
       * @else 无直接二级的项目
       * @ 创伤标志 => 变成三级
       */
      if (chkLvlCod === 1) {
        if (levelObj['cspgFlg'] === '1' && levelObj['cspgCod']) {
          chkLvlCod--;
        }
        return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
      } else {
        if (levelObj['cspgFlg'] === '1' && levelObj['cspgCod']) {
          chkLvlCod = 2;
        } else {
          chkLvlCod = 3;
        }
        return chkLvlCod.toString();
      }
    } else {
      chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByPews) : (chkLvlCodByPews || '');
      if (levelObj['cspgFlg'] === '1' && levelObj['cspgCod']) {
        chkLvlCod--;
      }
      return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
    }
  } else if (chkLvlCodByPews === 0) {
    return '0'
  }
},
  /**
 * @急诊分级 => 急诊分区
 * 一二级红，三黄，四五绿
 */
  countEmgAreCod: function (chkLvlCod) {
    switch (chkLvlCod) {
      case '':
        return '';
        break; 
      case '0':
      case '1':
        return '0';
        break;
      case '2':
        return '1';
        break;
      case '3':
      case '4':
        return '2';
        break;
    }
  },
  /**
 * @copy 数据
 */
  copyObj: function (fromObj, toObj) {
    if (fromObj === vm.patientMsg) {
      for (var key in fromObj) {
        if (vm.hideMsg.hasOwnProperty(key) === false) {
          toObj[key] = fromObj[key]
        }
      }
    } else {
      for (var key in fromObj) {
        toObj[key] = fromObj[key]
      }
    }
  },
  /**
 * @return  患者类别 1:成人 2:儿童 3:产科 4：妇科 
 */
  getPatientType: function () {
    var cstSexCod = vm.patientMsg.cstSexCod,
      ksfz = vm.hideMsg.ksfz;
    if (ksfz) {
      return '3'
    } else {
      var isChild = false;
      var isChild = commonFun.isChild(vm.patientMsg.cstAge, vm.patientMsg.cstAgeCod);
      if (isChild === true) {
        return '0'
      } else if (isChild === false) {
        if (cstSexCod === '1') { // 性别女
          return '2'
        }
        if (cstSexCod === '0') { // 性别男
          return '1'
        }
      } else {
        return '1'
      }
    }
  },
  isChild: function (cstAge, cstAgeCod) {
    if (cstAge != '' && ((cstAgeCod === '0' && cstAge < 14) || (cstAgeCod === '1' && cstAge < 168) || (cstAgeCod === '2' && cstAge < 5110))) {
      return true
    } else {
      return false
    }
  },
  /**
 * @在计算出分级的情况下 判断是不是快速分级 对四级进行进一步判定
 */
  countFinalCod: function () {
    if (vm.isEditPage == '1') {
      if (!vm.patientMsg.isGetAjaxFlg) {
        return;
      }
    }
    var typePat = vm.patientMsg.patientTyp;
    if (typePat === '1') { // 1:成人
      vm.patientMsg.chkLvlCod = commonFun.countAdultChkLvlCod();
    } else if (typePat === '2') { // 2:儿童
      vm.patientMsg.chkLvlCod = commonFun.countChildChkLvlCod();
    } else if (typePat === '3') { // 3:产科
      vm.patientMsg.chkLvlCod = commonFun.countPregnantChkLvlCod();
    } else if (typePat === '4') { // 4:妇科
      vm.patientMsg.chkLvlCod = commonFun.countWomenChkLvlCod();
    } else {
      vm.patientMsg.chkLvlCod = '3';
      vm.patientInfFlg.sbpUpNbrFlag = 0;
      vm.patientInfFlg.breNbrFlag = 0;
      vm.patientInfFlg.oxyNbrFlag = 0;
      vm.patientInfFlg.tmpNbrFlag = 0;
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if (vm.patientMsg.chkLvlCod == '4' && vm.hideMsg.ksfz == '') {
      vm.patientMsg.chkLvlCod = '3';
    }
    var _dangerList = vm.getMsg['dangerousCodList' + typePat],
        _wzbzList = vm.getMsg.wzbzList,
        remarkLevelList = [];
    var jwgfxCod = vm.patientMsg.jwgfxCod, wzbz = vm.patientMsg.wzbz;
    for (var i = 0; i < _dangerList.length; i++) {
      if ($.inArray(_dangerList[i].infocode, jwgfxCod) > -1) {
        remarkLevelList.push(_dangerList[i].remark);
      }
    }
    for (var i = 0; i < _wzbzList.length; i++) {
      if ($.inArray(_wzbzList[i].infocode, wzbz) > -1) {
        remarkLevelList.push(_wzbzList[i].remark);
      }
    }
    // 危急、高风险 有值时处理 || 病种 有值时处理
    if (jwgfxCod.length > 0 || wzbz.length > 0) {
      var _min = remarkLevelList[0]; // 假设最小的数就是    remarkLevelList[0]
      var _indexMin = 0;   // 假设最小的数的下标就是 0
      for (var i = 0; i< remarkLevelList.length; i++) {
        if (remarkLevelList[i] < _min){ // 如果其他元素大于我们假设的值，证明我们假设的值不是最小的
          _min = remarkLevelList[i]; // 重置_min的值
          _indexMin = i;    
        }            
      } 
      var _minRemarkCod = remarkLevelList[_indexMin];
      // 取最高的分级 ---- 选中的分级 和 已经存在的分级对比 
      if (vm.patientMsg.chkLvlCod !== '') {
        if (_minRemarkCod < vm.patientMsg.chkLvlCod) {
          vm.patientMsg.chkLvlCod = _minRemarkCod
        } 
      } else {
        vm.patientMsg.chkLvlCod = _minRemarkCod
      }
    }
    if (typePat === '3') { // 产科
      // 如果自觉症状有值并且不为“无”,则分级自动上浮一级 =>  
      // 新改成 => 预检时选择产科后,如果自觉症状是恶心呕吐,急危症项是'孕妇持续性呕吐',那么不需上浮分级 by 2021/03/29 yhl
      var zCodArr = vm.patientMsg.zjzzCod, compareLevel = vm.patientMsg.chkLvlCod;
      if (jwgfxCod[0] == '18' && jwgfxCod[1] === '' && zCodArr[0] == '4' && zCodArr[1] === '') {} else {
        if (zCodArr.length > 0) {
          if (compareLevel !== '' &&  compareLevel !== null) {
            compareLevel--;
          }
        }
        if (compareLevel < 0) {
          vm.patientMsg.chkLvlCod = '0'
        } else {
          vm.patientMsg.chkLvlCod = compareLevel.toString();
        }
      }
    }
    var _checkLevel = $('#checkLevel').val();
    if (_checkLevel !== '' &&  _checkLevel !== null) {
      if (_checkLevel === '0') {
        vm.patientMsg.chkLvlCod = '0'
      } else {
        if ((_checkLevel - 0) < (vm.patientMsg.chkLvlCod - 0)) {
          vm.patientMsg.chkLvlCod = _checkLevel
        }
      }
    }
    // 只要进行分级计算，修订分级自动设置为自动分级
    // vm.patientMsg.modLvlCod = vm.patientMsg.chkLvlCod;
    // for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
    //   vm.getMsg['modLvlCodList'][i].checked = false;
    //   if (vm.patientMsg.chkLvlCod == vm.getMsg['modLvlCodList'][i]['infocode']) {
    //     vm.getMsg['modLvlCodList'][i].checked = true;
    //   }
    // }
    // vm.patientMsg.modLvlDes = '';
    return (vm.patientMsg.chkLvlCod);
  }
}