/**
 * @@jsbrjz 给子页面用的某些数据
 */

var jsbrjz;
var commonFun = {
  /**
   * @rems评分计算
   */
  countRems:{
    breNbr: function (_breNbr) {
      var breNbr;
      if (_breNbr > 49 || _breNbr<6) {
        breNbr = 4
      } else if (35 <= _breNbr && _breNbr <= 49) {
        breNbr = 3
      } else if ((25 <= _breNbr && _breNbr <= 34)||(10 <= _breNbr && _breNbr <= 11)) {
        breNbr = 1
      } else if (12 <= _breNbr && _breNbr <= 24) {
        breNbr = 0
      }else if (6 <= _breNbr && _breNbr <= 9) {
        breNbr = 2
      }
      return breNbr
    },
    hrtRte: function (_hrtRte) {
      var hrtRte;
      if (_hrtRte > 179||_hrtRte < 40) {
        hrtRte = 4
      } else if ((40 <= _hrtRte && _hrtRte <= 54) || (140 <= _hrtRte && _hrtRte <= 179)) {
        hrtRte = 3
      } else if ((55 <= _hrtRte && _hrtRte <= 69) || (110 <= _hrtRte && _hrtRte <= 139)) {
        hrtRte = 2
      } else if (70 <= _hrtRte && _hrtRte <= 109) {
        hrtRte = 0
      }
      return hrtRte
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
    oxyNbr:function(_oxyNbr){
      var oxyNbr;
      if(_oxyNbr > 89){
        oxyNbr = 0
      }else if(86 <= _oxyNbr && _oxyNbr <= 89){
        oxyNbr = 1
      }else if(74 <= _oxyNbr && _oxyNbr <= 85){
        oxyNbr = 3
      }else if(_oxyNbr < 75){
        oxyNbr = 4
      }
      return oxyNbr
    }
  },
  /**
 * @mews评分计算
 */
  countMews: {
    /**
     * @mews计算-呼吸
     */
    breNbr: function (_breNbr) {
      var breNbr;
      if (_breNbr >= 30) {
        breNbr = 3
      } else if ((21 <= _breNbr && _breNbr <= 29) || (_breNbr < 9)) {
        breNbr = 2
      } else if (15 <= _breNbr && _breNbr <= 20) {
        breNbr = 1
      } else if (9 <= _breNbr && _breNbr <= 14) {
        breNbr = 0
      }
      return breNbr
    },
    /**
     * @mews计算-体温
     */
    tmpNbr: function (_tmpNbr) {
      var tmpNbr;
      if (_tmpNbr >= 38.5 || _tmpNbr < 35) {
        tmpNbr = 2
      } else if (35 <= _tmpNbr && _tmpNbr <= 38.4) {
        tmpNbr = 0
      }
      return tmpNbr
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
    hrtRte: function (_hrtRte) {
      var hrtRte;
      if (_hrtRte >= 130) {
        hrtRte = 3
      } else if ((111 <= _hrtRte && _hrtRte <= 129) || (_hrtRte <= 40)) {
        hrtRte = 2
      } else if ((101 <= _hrtRte && _hrtRte <= 110) || (41 <= _hrtRte && _hrtRte <= 50)) {
        hrtRte = 1
      } else if (51 <= _hrtRte && _hrtRte <= 100) {
        hrtRte = 0
      }
      return hrtRte
    },
  },
  /**
   * @获取mews计算相关参数
   */
  getCountMewsParms: function () {
    return {
      senRctCod: vm.aboutMews.senRctCod,
      breNbr: vm.aboutMews.breNbr,
      hrtRte: vm.aboutMews.hrtRte,
      tmpNbr: vm.aboutMews.tmpNbr,
      sbpUpNbr: vm.aboutMews.sbpUpNbr
    }
  },
   /**
   * @获取rems计算相关参数
   */
  getCountRemsParms: function () {
    return {
      hrtRte: vm.aboutRems.hrtRte,
      breNbr: vm.aboutRems.breNbr,
      gcsTotSco: vm.aboutRems.gcsTotSco,
      cstAge: vm.aboutRems.cstAge,
      oxyNbr: vm.aboutRems.oxyNbr,
      sbpUpNbr: vm.aboutRems.sbpUpNbr
    }
  },
  /**
   * @急诊分级相关参数
   */
  getCountChkLvlCodParms: function () {
    return {
      cstAge: vm.patientMsg.cstAge, // 年龄
      cstAgeCod: vm.patientMsg.cstAgeCod, // 年龄类型
      tmpNbr: vm.aboutMews.tmpNbr, //体温
      sbpUpNbr: vm.aboutMews.sbpUpNbr, //收缩压
      sbpDownNbr: vm.aboutMews.sbpDownNbr, // 舒张压
      breNbr: vm.aboutMews.breNbr, //呼吸频率
      hrtRte: vm.aboutMews.hrtRte, //心率
      oxyNbr: vm.patientMsg.oxyNbr, //血氧饱和度
      cspgFlg: vm.patientMsg.cspgFlg, //创伤标志
      hxknFlg: vm.patientMsg.hxknFlg, //呼吸困难标志
      xtFlg: vm.patientMsg.xtFlg, //胸痛标志
      czFlag: vm.patientMsg.czFlag, //卒中标志
      xfztFlg: vm.patientMsg.xfztFlg, //心肺骤停
      nrsSco: vm.patientMsg.nrsSco, //疼痛评分
      mewsTotSco: vm.patientMsg.mewsTotSco, // mews评分
      pregnantYdcxCod: vm.patientMsg.pregnantYdcxCod, // 阴道出血
      pregnantGsplCod: vm.patientMsg.pregnantGsplCod, // 宫缩频率
      gcsTotSco: vm.aboutRems.gcsTotSco, // GCS评分
      glsNum: vm.patientMsg.glsNum // 血糖值[三墩院区]
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
    var aboutMews = commonFun.getCountMewsParms();
    if (commonFun.checkEmptyForCount(aboutMews) === true) {
      return commonFun.countMews.breNbr(aboutMews.breNbr) + commonFun.countMews.tmpNbr(aboutMews.tmpNbr) + commonFun.countMews.sbpNbr(aboutMews.sbpUpNbr) + commonFun.countMews.hrtRte(aboutMews.hrtRte) + parseInt(aboutMews.senRctCod);
    } else {
      return ''
    }
  },

    /**
   * @rems计算
   * @return '',0,1,2,3,4,5,6,7,8,9,10,11,12
   */
  countRemsCount: function () {
    var aboutRems = commonFun.getCountRemsParms();
    if (commonFun.checkEmptyForCount(aboutRems) === true) {
      return commonFun.countRems.hrtRte(aboutRems.hrtRte) + commonFun.countRems.sbpUpNbr(aboutRems.sbpUpNbr) + commonFun.countRems.breNbr(aboutRems.breNbr) + commonFun.countRems.GCS(aboutRems.gcsTotSco) + commonFun.countRems.cstAge(aboutRems.cstAge) + commonFun.countRems.oxyNbr(aboutRems.oxyNbr);
    } else {
      return ''
    }
  },
  /**
 * @mews计算[成人和孕产妇] => 基础分级计算
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
    } else if (typePat === '3') {
      // 孕产妇
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
 * @成人非孕产妇分级标准return '',0,1,2,3 [成人新标准---2018]
 */
  countNewAdultLevel: function () {
     var aboutCountChkLvlCod = commonFun.getCountChkLvlCodParms(),
      chkLvlCod = '3';
    // 生命体征项目 触发一二级标红 
    if (aboutCountChkLvlCod['tmpNbr'] != '' && (aboutCountChkLvlCod['tmpNbr'] > 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] <= 79) || (aboutCountChkLvlCod['sbpUpNbr'] > 200)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] <= 49 || aboutCountChkLvlCod['hrtRte'] >= 149)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if ((aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] <= 89)) {
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    /**
     * @胸闷、胸痛、呼吸困难、卒中、心肺骤停的指标，返回一级
     */
    if (aboutCountChkLvlCod['hxknFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xtFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['czFlag'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xfztFlg'] === '1') {
      return '0'
    }
    /**
     * @体温>41
     * @血压(收缩压)<70
     * @心率<40 或者 >180
     */
    if (aboutCountChkLvlCod['tmpNbr'] != '' && (aboutCountChkLvlCod['tmpNbr'] > 41)) {
      return '0'
    }
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] < 70)) {
      return '0'
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] < 40 || aboutCountChkLvlCod['hrtRte'] > 180)) {
      return '0'
    }
    /**
     * @血氧饱和度<80
     * @return '一级'
     */
    if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] < 80) {
      return '0'
    }
    /**
     * @ GCS < 9
     * @return '一级'
     */
    if (aboutCountChkLvlCod['gcsTotSco'] < 9 && aboutCountChkLvlCod['gcsTotSco'] !== '' && aboutCountChkLvlCod['gcsTotSco'] != null) {
      return '0'
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '' || chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @无mews评分项目 || mews评分不全 || mews评分计算结果为二级/三级/四级
       * @血压收缩压 70-79 或者 大于200
       * @心率40-49 或者149-180
       * @血氧饱和度80-89
       * @疼痛评分7-10分
       * @直接默认二级
       */
      if ((70 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 79) || (aboutCountChkLvlCod['sbpUpNbr'] > 200)) {
        return '1';
      }
      if ((40 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 49) || (149 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 180)) {
        return '1';
      }
      if (80 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 89) {
        return '1';
      }
      if (7 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 10) {
        return '1';
      }
      /**
       * @心率：100~150次/min或50~55次/min
       * @收缩压180~200 mmHg或80~90 mmHg
       * @SpO2：90%~94%
       * @疼痛评分4-6分
       * @return '三级'
       */
      if ((100 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 150) || (50 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 55)) {
        chkLvlCod = 2;
      }
      if ((180 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 200) || (80 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 90)) {
        chkLvlCod = 2;
      }
      if (90 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 94) {
        chkLvlCod = 2;
      }
      if (4 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 6) {
        chkLvlCod = 2;
      }
      if (chkLvlCodByMews !== '') {
        chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
      }
      return chkLvlCod.toString();
    } else if (chkLvlCodByMews === 0) {
      return '0'
    }
  },
  /**
  * @成人非孕产妇分级标准return '',0,1,2,3 [成人新标准---浙江医院三墩院区]
 */
  onlyZjHosToSanDun: function () {
    var aboutCountChkLvlCod = commonFun.getCountChkLvlCodParms(),
      chkLvlCod = '3';
    // 生命体征项目 触发一二级标红 
    if (aboutCountChkLvlCod['tmpNbr'] != '' && (aboutCountChkLvlCod['tmpNbr'] > 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] <= 79) || (aboutCountChkLvlCod['sbpUpNbr'] > 200)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] <= 49 || aboutCountChkLvlCod['hrtRte'] >= 149)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if ((aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] <= 89)) {
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    if ((aboutCountChkLvlCod['glsNum'] != '' && aboutCountChkLvlCod['glsNum'] < 3.33)) {
      vm.patientInfFlg.glsNumFlag = 1;
    } else {
      vm.patientInfFlg.glsNumFlag = 0;
    }
    /**
     * @胸闷、胸痛、呼吸困难、卒中、心肺骤停的指标，返回一级
     */
    if (aboutCountChkLvlCod['hxknFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xtFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['czFlag'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xfztFlg'] === '1') {
      return '0'
    }
    /**
     * @体温>41
     * @血压(收缩压)<70
     * @心率<40 或者 >180
     * @血糖 < 3.33 mmol/L
     */
    if (aboutCountChkLvlCod['tmpNbr'] != '' && (aboutCountChkLvlCod['tmpNbr'] > 41)) {
      return '0'
    }
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] < 70)) {
      return '0'
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] < 40 || aboutCountChkLvlCod['hrtRte'] > 180)) {
      return '0'
    }
    if (aboutCountChkLvlCod['glsNum'] != '' && (aboutCountChkLvlCod['glsNum'] < 3.33)) {
      return '0'
    }
    /**
     * @血氧饱和度<80
     * @return '一级'
     */
    if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] < 80) {
      return '0'
    }
    /**
     * @ GCS < 9
     * @return '一级'
     */
    if (aboutCountChkLvlCod['gcsTotSco'] < 9 && aboutCountChkLvlCod['gcsTotSco'] !== '' && aboutCountChkLvlCod['gcsTotSco'] != null) {
      return '0'
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '' || chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @无mews评分项目 || mews评分不全 || mews评分计算结果为二级/三级/四级
       * @血压收缩压 70-79 或者 大于200
       * @心率40-49 或者149-180
       * @血氧饱和度80-89
       * @疼痛评分8-10分
       * @直接默认二级
       */
      if ((70 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 79) || (aboutCountChkLvlCod['sbpUpNbr'] > 200)) {
        chkLvlCod = 1;
      }
      if ((40 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 49) || (149 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 180)) {
        chkLvlCod = 1;
      }
      if (80 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 89) {
        chkLvlCod = 1;
      }
      if (8 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 10) {
        chkLvlCod = 1;
      }
      /** 
       * mews评分计算结果为三级/四级
       * @心率：100~150次/min或50~55次/min
       * @收缩压180~200 mmHg或80~90 mmHg
       * @SpO2：90%~94%
       * @return '三级'
       */
      if ((100 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 150) || (50 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 55)) {
        chkLvlCod = 2;
      }
      if ((180 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 200) || (80 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 90)) {
        chkLvlCod = 2;
      }
      if (90 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 94) {
        chkLvlCod = 2;
      }

      /**
       * @if 有直接二级的项目
       * @age > 75 || 创伤标志 => 升1级
       */
      /**
       * @else 无直接二级的项目
       * @age > 75 || 创伤标志 => 变成三级
       */
      if (chkLvlCodByMews === '') {
        if (chkLvlCod === 1) {
          if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
            chkLvlCod--;
          }
          if (aboutCountChkLvlCod['cspgFlg'] === '1') {
            chkLvlCod--;
          }
          return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
        } else {
          if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
            chkLvlCod--;
          }
          if (aboutCountChkLvlCod['cspgFlg'] === '1') {
            chkLvlCod--;
          }
          return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
        }
      } else {
        chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
        if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
          chkLvlCod--;
        }
        if (aboutCountChkLvlCod['cspgFlg'] === '1') {
          chkLvlCod--;
        }
        return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
      }
    } else if (chkLvlCodByMews === 0) {
      return '0'
    }
  },
  countAdultChkLvlCod: function () {
    var aboutCountChkLvlCod = commonFun.getCountChkLvlCodParms(),
      chkLvlCod = '3';
    /**
     * @判定是否加waring颜色 一二级
     */
    if (aboutCountChkLvlCod['tmpNbr'] != '' && (aboutCountChkLvlCod['tmpNbr'] < 32 || aboutCountChkLvlCod['tmpNbr'] > 41)) {
      vm.patientInfFlg.tmpNbrFlag = 1;
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] <= 80 || aboutCountChkLvlCod['sbpUpNbr'] >= 200 || aboutCountChkLvlCod['sbpDownNbr'] >= 110)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['breNbr'] != '' && (aboutCountChkLvlCod['breNbr'] <= 8 || aboutCountChkLvlCod['breNbr'] >= 36)) {
      vm.patientInfFlg.breNbrFlag = 1;
    } else {
      vm.patientInfFlg.breNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] <= 50 || aboutCountChkLvlCod['hrtRte'] >= 141)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if (aboutCountChkLvlCod['cspgFlg'] === '1') {
      if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] <= 90) {
        vm.patientInfFlg.oxyNbrFlag = 1;
      } else {
        vm.patientInfFlg.oxyNbrFlag = 0;
      }
    } else {
      if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] <= 89) {
        vm.patientInfFlg.oxyNbrFlag = 1;
      } else {
        vm.patientInfFlg.oxyNbrFlag = 0;
      }
    }


    /**
     * @胸闷、胸痛、呼吸困难、卒中、心肺骤停的指标，返回一级
     */
    if (aboutCountChkLvlCod['hxknFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xtFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['czFlag'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xfztFlg'] === '1') {
      return '0'
    }
    /**
     * @体温>41 或者 体温<32
     * @血压<70 或者 >=220mmHg
     * @呼吸<=8 或者>= 36
     * @心率<=40 或者 >=180
     */
    if (aboutCountChkLvlCod['tmpNbr'] != '' && (aboutCountChkLvlCod['tmpNbr'] < 32 || aboutCountChkLvlCod['tmpNbr'] > 41)) {
      return '0'
    }
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] < 70 || aboutCountChkLvlCod['sbpUpNbr'] >= 220)) {
      return '0'
    }
    if (aboutCountChkLvlCod['breNbr'] != '' && (aboutCountChkLvlCod['breNbr'] <= 8 || aboutCountChkLvlCod['breNbr'] >= 36)) {
      return '0'
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] <= 40 || aboutCountChkLvlCod['hrtRte'] >= 180)) {
      return '0'
    }
    /**
     * @血氧饱和度<85
     * @血氧饱和度<=90 && 创伤患者
     * @return '一级'
     */
    if (aboutCountChkLvlCod['cspgFlg'] === '1') {
      if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] <= 90) {
        return '0'
      }
    } else {
      if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] < 85) {
        return '0'
      }
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '') {
      /**
       * @无mews评分项目 || mews评分不全
       * @血压收缩压 70-80 或者 200-219 || 舒张压大于等于110
       * @心率41-50 或者141-179
       * @血氧饱和度85-89
       * @疼痛评分8-10分
       * @直接默认二级
       */
      if ((70 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 80) || (200 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 219)) {
        chkLvlCod = 1;
      }
      if (aboutCountChkLvlCod['sbpDownNbr'] >= 110) {
        chkLvlCod = 1;
      }
      if ((41 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 50) || (141 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 179)) {
        chkLvlCod = 1;
      }
      if (85 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 89) {
        chkLvlCod = 1;
      }
      if (8 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 10) {
        chkLvlCod = 1;
      }
      /**
       * @if 有直接二级的项目
       * @age > 75 || 创伤标志 => 升1级
       */
      /**
       * @else 无直接二级的项目
       * @age > 75 || 创伤标志 => 变成三级
       */
      if (chkLvlCod === 1) {
        if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
          chkLvlCod--;
        }
        if (aboutCountChkLvlCod['cspgFlg'] === '1') {
          chkLvlCod--;
        }
        return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
      } else {
        if ((aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && (aboutCountChkLvlCod['cspgFlg'] === '1')) {
          chkLvlCod = 1;
        } else if ((aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && !(aboutCountChkLvlCod['cspgFlg'] === '1')) {
          chkLvlCod = 2;
        } else if (!(aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && (aboutCountChkLvlCod['cspgFlg'] === '1')) {
          chkLvlCod = 2;
        } else {
          chkLvlCod = 3;
        }
        return chkLvlCod.toString();
      }
    } else if (chkLvlCodByMews === 0) {
      return '0'
    } else if (chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @mews评分计算结果为二级/三级/四级
       * @血压收缩压 70-80 或者 200-219 || 舒张压大于等于110
       * @心率41-50 或者141-179
       * @血氧饱和度85-89
       * @疼痛评分8-10分
       * @直接默认二级
       */
      if ((70 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 80) || (200 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 219)) {
        chkLvlCod = 1;
      }
      if (aboutCountChkLvlCod['sbpDownNbr'] >= 110) {
        chkLvlCod = 1;
      }
      if ((41 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 50) || (141 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 179)) {
        chkLvlCod = 1;
      }
      if (85 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 89) {
        chkLvlCod = 1;
      }
      if (8 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 10) {
        chkLvlCod = 1;
      }
      // chkLvlCod = Math.min(chkLvlCod, chkLvlCodByMews);
      chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
      if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
        chkLvlCod--;
      }
      if (aboutCountChkLvlCod['cspgFlg'] === '1') {
        chkLvlCod--;
      }
      return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
    }
  },
  /**
   * @孕产妇分级标准return '',0,1,2,3
   */
  countPregnantChkLvlCod: function () {
    var aboutCountChkLvlCod = commonFun.getCountChkLvlCodParms(),
      chkLvlCod = '3';
    /**
     * @判定是否加waring颜色
     */
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] <= 80 || aboutCountChkLvlCod['sbpUpNbr'] >= 160)) {
      vm.patientInfFlg.sbpUpNbrFlag = 1;
    } else {
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['breNbr'] != '' && (aboutCountChkLvlCod['breNbr'] <= 8 || aboutCountChkLvlCod['breNbr'] >= 30)) {
      vm.patientInfFlg.breNbrFlag = 1;
    } else {
      vm.patientInfFlg.breNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] <= 50 || aboutCountChkLvlCod['hrtRte'] >= 111)) {
      vm.patientInfFlg.hrtRteFlag = 1;
    } else {
      vm.patientInfFlg.hrtRteFlag = 0;
    }
    if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] <= 92) {
      vm.patientInfFlg.oxyNbrFlag = 1;
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
    }
    /**
     * @胸闷、胸痛、呼吸困难、卒中、心肺骤停的指标，返回一级
     */
    if (aboutCountChkLvlCod['hxknFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xtFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['czFlag'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xfztFlg'] === '1') {
      return '0'
    }
    /**
     * @血压收缩压<70 或者 >=220mmHg
     * @呼吸<=8 或者>= 30
     * @心率<=50 或者 >=130
     * @宫缩频率≤2min 1 次 1
     * @阴道流血大于月经量 1
     * @血氧饱和度<90
     * @疼痛评分 7-10 分
     * @return '一级'
     */
    if (aboutCountChkLvlCod['sbpUpNbr'] != '' && (aboutCountChkLvlCod['sbpUpNbr'] < 70 || aboutCountChkLvlCod['sbpUpNbr'] >= 220)) {
      return '0'
    }
    if (aboutCountChkLvlCod['breNbr'] != '' && (aboutCountChkLvlCod['breNbr'] <= 8 || aboutCountChkLvlCod['breNbr'] >= 30)) {
      return '0'
    }
    if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] <= 50 || aboutCountChkLvlCod['hrtRte'] >= 130)) {
      return '0'
    }
    if (aboutCountChkLvlCod['pregnantGsplCod'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['pregnantYdcxCod'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['oxyNbr'] != '' && aboutCountChkLvlCod['oxyNbr'] < 90) {
      return '0'
    }
    if (aboutCountChkLvlCod['nrsSco'] !== '' && aboutCountChkLvlCod['nrsSco'] <= 10 && aboutCountChkLvlCod['nrsSco'] >= 7) {
      return '0'
    }
    /**
     * @chkLvlCodByMews 对应的值有'',0,1,2,3
     */
    var chkLvlCodByMews = commonFun.countChkLvlCodByMews();
    if (chkLvlCodByMews === '') {
      /**
       * @无mews评分项目 || mews评分不全
       * @血压收缩压 70-80 或者 160-219
       * @心率111-129
       * @血氧饱和度90-92
       * @疼痛评分4-6分
       * @宫缩频率 3-5min 1 次 2
       * @阴道流血等于月经量 2
       * @直接默认二级
       */
      if ((70 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 80) || (160 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 219)) {
        chkLvlCod = 1;
      }
      if (111 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 129) {
        chkLvlCod = 1;
      }
      if (90 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 92) {
        chkLvlCod = 1;
      }
      if (4 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 6) {
        chkLvlCod = 1;
      }
      if (aboutCountChkLvlCod['pregnantGsplCod'] === '2') {
        chkLvlCod = 1;
      }
      if (aboutCountChkLvlCod['pregnantYdcxCod'] === '2') {
        chkLvlCod = 1;
      }
      /**
       * @if 有直接二级的项目
       * @age > 75 || 创伤标志 ||  => 升1级
       */
      /**
       * @else 无直接二级的项目
       * @age > 75 || 创伤标志 => 变成三级
       */
      if (chkLvlCod === 1) {
        if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
          chkLvlCod--;
        }
        if (aboutCountChkLvlCod['cspgFlg'] === '1') {
          chkLvlCod--;
        }
        return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
      } else {
        if ((aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && (aboutCountChkLvlCod['cspgFlg'] === '1')) {
          chkLvlCod = 1;
        } else if ((aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && !(aboutCountChkLvlCod['cspgFlg'] === '1')) {
          chkLvlCod = 2;
        } else if (!(aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && (aboutCountChkLvlCod['cspgFlg'] === '1')) {
          chkLvlCod = 2;
        } else {
          chkLvlCod = 3;
        }
        if (chkLvlCod !== 3) {
          return chkLvlCod.toString();
        }
      }
    } else if (chkLvlCodByMews === 0) {
      return '0'
    } else if (chkLvlCodByMews === 1 || chkLvlCodByMews === 2 || chkLvlCodByMews === 3) {
      /**
       * @mews评分计算结果为二级/三级/四级
       * @血压收缩压 70-80 或者 160-219
       * @心率111-129
       * @血氧饱和度90-92
       * @疼痛评分4-6分
       * @宫缩频率 3-5min 1 次 2
       * @阴道流血等于月经量 2
       * @直接默认二级
       */
      if ((70 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 80) || (160 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 219)) {
        chkLvlCod = 1;
      }
      if (111 <= aboutCountChkLvlCod['hrtRte'] && aboutCountChkLvlCod['hrtRte'] <= 129) {
        chkLvlCod = 1;
      }
      if (90 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 92) {
        chkLvlCod = 1;
      }
      if (4 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 6) {
        chkLvlCod = 1;
      }
      if (aboutCountChkLvlCod['pregnantGsplCod'] === '2') {
        chkLvlCod = 1;
      }
      if (aboutCountChkLvlCod['pregnantYdcxCod'] === '2') {
        chkLvlCod = 1;
      }
      // chkLvlCod = Math.min(chkLvlCod, chkLvlCodByMews);
      chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByMews) : (chkLvlCodByMews || '');
      if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
        chkLvlCod--;
      }
      if (aboutCountChkLvlCod['cspgFlg'] === '1') {
        chkLvlCod--;
      }
      if (chkLvlCod !== 3) {
        return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
      }
    }
    /**
     * @阴道流血小于月经量 3
     * @宫缩频率 5-10min 1 次 3
     * @疼痛评分 1-3 分
     * @血氧饱和度 93-94
     * @血压收缩压140-159 || 舒展压 90-110
     * @return '三级'
     */
    if (aboutCountChkLvlCod['pregnantGsplCod'] === '3') {
      chkLvlCod = 2
    }
    if (aboutCountChkLvlCod['pregnantYdcxCod'] === '3') {
      chkLvlCod = 2
    }
    if (1 <= aboutCountChkLvlCod['nrsSco'] && aboutCountChkLvlCod['nrsSco'] <= 3) {
      chkLvlCod = 2
    }
    if (93 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 94) {
      chkLvlCod = 2;
    }
    if ((140 <= aboutCountChkLvlCod['sbpUpNbr'] && aboutCountChkLvlCod['sbpUpNbr'] <= 159) || (90 <= aboutCountChkLvlCod['sbpDownNbr'] && aboutCountChkLvlCod['sbpDownNbr'] <= 110)) {
      chkLvlCod = 2;
    }
    return chkLvlCod.toString();
  },
  /**
   * @儿童分级标准return '',0,1,2,3
  */
  countChildChkLvlCod: function () {
    var aboutCountChkLvlCod = commonFun.getCountChkLvlCodParms(),
      chkLvlCod = '3';
    /**
     * @胸闷、胸痛、呼吸困难、卒中、心肺骤停的指标，返回一级
     */
    if (aboutCountChkLvlCod['hxknFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xtFlg'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['czFlag'] === '1') {
      return '0'
    }
    if (aboutCountChkLvlCod['xfztFlg'] === '1') {
      return '0'
    }
    /**
     * @脉搏<40 次/min(0<y≤6 岁);<30(>6 岁); >140(3<y≤6 岁) ;>120(6<y≤10 岁)
     * @脉搏>230 次/min (0<y≤3 月);>210(3<y≤6 月);>180(6<y≤12 月); >165(1<y≤3 岁);
     * @呼吸<10 次/min(0<y≤3 岁); <8 (>3 岁); >80(y≤6 月);>60(6<y≤12 月);
     * @呼吸>40 次/min (1<y≤3 岁);>32(3<y≤6 岁);>26(6<y≤10 岁)
     * @SpO2<90% 体温≥38°C(新生儿 天数小于等于28天)
     */
    if (aboutCountChkLvlCod['cstAge'] != '') {
      // 0-6岁 包括6岁
      if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && 0 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && 0 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 72) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && 0 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 2160)) {
        // (0, 3月] 脉搏大于230 或者 脉搏小于40
        if ((aboutCountChkLvlCod['cstAgeCod'] === '1' && 0 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 3) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && 0 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 90)) {
          if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 230 || aboutCountChkLvlCod['hrtRte'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
        } else if ((aboutCountChkLvlCod['cstAgeCod'] === '1' && 3 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && 90 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 180)) {
          // (3, 6月] 脉搏大于210 或者 脉搏小于40
          if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 210 || aboutCountChkLvlCod['hrtRte'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
        } else if ((aboutCountChkLvlCod['cstAgeCod'] === '1' && 6 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] < 12) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && 180 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] < 365)) {
          // (6, 12月) 脉搏大于180 或者 脉搏小于40
          if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 180 || aboutCountChkLvlCod['hrtRte'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
        } else if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] == 1) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] == 12) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] == 365)) {
          // 1岁 = 12月时 脉搏大于180 或者小于 40
          if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 180 || aboutCountChkLvlCod['hrtRte'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
        } else {
          // (1, 6岁] 脉搏小于40
          if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] < 40)) {
            vm.patientInfFlg.hrtRteFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.hrtRteFlag = 0;
          }
          if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && 3 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && 36 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 72)) {
            // (3, 6岁] 脉搏小于40 或者大于 140
            if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 140 || aboutCountChkLvlCod['hrtRte'] < 40)) {
              vm.patientInfFlg.hrtRteFlag = 1;
              chkLvlCod = 0
            } else {
              vm.patientInfFlg.hrtRteFlag = 0;
            }
          } else {
            // (1, 3岁] 脉搏小于40 或者大于 165
            if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 165 || aboutCountChkLvlCod['hrtRte'] < 40)) {
              vm.patientInfFlg.hrtRteFlag = 1;
              chkLvlCod = 0
            } else {
              vm.patientInfFlg.hrtRteFlag = 0;
            }
          }
        }
      } else if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] > 6) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 72)) {
        // 大于6岁 小于30
        if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] < 30)) {
          vm.patientInfFlg.hrtRteFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.hrtRteFlag = 0;
        }
        if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] <= 10) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] <= 120)) {
          // 6 -10] 岁 大于 120 或者 小于 30
          if (aboutCountChkLvlCod['hrtRte'] != '' && (aboutCountChkLvlCod['hrtRte'] > 120 || aboutCountChkLvlCod['hrtRte'] < 30)) {
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

    if (aboutCountChkLvlCod['cstAge'] != '') {
      // 小于等于6个月 呼吸大于80 或者 小于 10
      if ((aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] <= 180)) {
        if ((aboutCountChkLvlCod['breNbr'] > 80 || aboutCountChkLvlCod['breNbr'] < 10) && aboutCountChkLvlCod['breNbr'] != '') {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((aboutCountChkLvlCod['cstAgeCod'] === '1' && 6 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] < 12) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && 180 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] < 365)) {
        // （6-12个月） 不包含6月 12月 呼吸大于60 或者 小于 10
        if ((aboutCountChkLvlCod['breNbr'] > 60 || aboutCountChkLvlCod['breNbr'] < 10) && aboutCountChkLvlCod['breNbr'] != '') {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] == 1) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] == 12) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] == 365)) {
        // 1年 12个月 呼吸大于60 或者 小于 10
        if ((aboutCountChkLvlCod['breNbr'] > 60 || aboutCountChkLvlCod['breNbr'] < 10) && aboutCountChkLvlCod['breNbr'] != '') {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && 1 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 3) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && 12 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 36)) {
        // （1-3岁】 呼吸大于 40 或许 呼吸小于 10
        if ((aboutCountChkLvlCod['breNbr'] > 40 || aboutCountChkLvlCod['breNbr'] < 10) && aboutCountChkLvlCod['breNbr'] != '') {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] > 3) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 36)) {
        // (3岁,  ) 呼吸小于8
        if (aboutCountChkLvlCod['breNbr'] != '' && (aboutCountChkLvlCod['breNbr'] < 8)) {
          vm.patientInfFlg.breNbrFlag = 1;
          chkLvlCod = 0
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
        // (3岁, 6岁] 呼吸小于8 或者 大于 32
        if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && 3 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && 36 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 72)) {
          if ((aboutCountChkLvlCod['breNbr'] > 32 || aboutCountChkLvlCod['breNbr'] < 8) && aboutCountChkLvlCod['breNbr'] != '') {
            vm.patientInfFlg.breNbrFlag = 1;
            chkLvlCod = 0
          } else {
            vm.patientInfFlg.breNbrFlag = 0;
          }
        } else if ((aboutCountChkLvlCod['cstAgeCod'] === '0' && 6 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 10) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && 72 < aboutCountChkLvlCod['cstAge'] && aboutCountChkLvlCod['cstAge'] <= 120)) {
          // (6岁, 10岁] 呼吸小于8 或者 大于 26
          if ((aboutCountChkLvlCod['breNbr'] > 26 || aboutCountChkLvlCod['breNbr'] < 8) && aboutCountChkLvlCod['breNbr'] != '') {
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

    if (aboutCountChkLvlCod['cstAge'] != '' && (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] <= 28)) {
      if (aboutCountChkLvlCod['tmpNbr'] != '' && aboutCountChkLvlCod['tmpNbr'] >= 38) {
        vm.patientInfFlg.tmpNbrFlag = 1;
        chkLvlCod = 0
      } else {
        vm.patientInfFlg.tmpNbrFlag = 0;
      }
    } else {
      vm.patientInfFlg.tmpNbrFlag = 0;
    }
    if (aboutCountChkLvlCod['oxyNbr'] !== '' && aboutCountChkLvlCod['oxyNbr'] < 90) {
      vm.patientInfFlg.oxyNbrFlag = 1
      chkLvlCod = 0
    } else {
      vm.patientInfFlg.oxyNbrFlag = 0;
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
       * @收缩压>130mmHg 或<75mmHg (y>5 岁) SpO290-92%
       * @呼吸10-20或70-80次/min(0<y≤6月); 10-17或55-60次/min(6<y≤12月)
       * @呼吸 10-15 或 35-40 次/min(1<y≤3 岁); 8-12 或 28-32 次/min(3<y≤6 岁)
       * @直接默认二级
       */
      if (aboutCountChkLvlCod['cstAge'] != '' && ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] > 5) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 60) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] > 1825))) {
        if ((aboutCountChkLvlCod['sbpUpNbr'] > 130) || (aboutCountChkLvlCod['sbpUpNbr'] < 75 && aboutCountChkLvlCod['sbpUpNbr'] !== '')) {
          chkLvlCod = 1;
          vm.patientInfFlg.sbpUpNbrFlag = 1;
        } else {
          vm.patientInfFlg.sbpUpNbrFlag = 0;
        }
      } else {
        vm.patientInfFlg.sbpUpNbrFlag = 0;
      }
      if (90 <= aboutCountChkLvlCod['oxyNbr'] && aboutCountChkLvlCod['oxyNbr'] <= 92) {
        chkLvlCod = 1;
        vm.patientInfFlg.oxyNbrFlag = 1;
      } else {
        vm.patientInfFlg.oxyNbrFlag = 0;
      }
      if (aboutCountChkLvlCod['cstAge'] != '' && ((aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 0 && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] > 0 && aboutCountChkLvlCod['cstAge'] <= 180))) {
        if (aboutCountChkLvlCod['breNbr'] != '' && ((10 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 20) || (70 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 80))) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
      if (aboutCountChkLvlCod['cstAge'] != '' && ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] == 1) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 6 && aboutCountChkLvlCod['cstAge'] <= 12) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] > 180 && aboutCountChkLvlCod['cstAge'] <= 360))) {
        if (aboutCountChkLvlCod['breNbr'] != '' && ((10 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 17) || (55 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 60))) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
      if (aboutCountChkLvlCod['cstAge'] != '' && ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] > 1 && aboutCountChkLvlCod['cstAge'] <= 3) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 12 && aboutCountChkLvlCod['cstAge'] <= 36) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] > 365 && aboutCountChkLvlCod['cstAge'] <= 1095))) {
        if (aboutCountChkLvlCod['breNbr'] != '' && ((10 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 15) || (35 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 40))) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
      if (aboutCountChkLvlCod['cstAge'] != '' && ((aboutCountChkLvlCod['cstAgeCod'] === '0' && aboutCountChkLvlCod['cstAge'] > 3 && aboutCountChkLvlCod['cstAge'] <= 6) || (aboutCountChkLvlCod['cstAgeCod'] === '1' && aboutCountChkLvlCod['cstAge'] > 36 && aboutCountChkLvlCod['cstAge'] <= 72) || (aboutCountChkLvlCod['cstAgeCod'] === '2' && aboutCountChkLvlCod['cstAge'] > 1095 && aboutCountChkLvlCod['cstAge'] <= 2190))) {
        if (aboutCountChkLvlCod['breNbr'] != '' && ((8 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 12) || (28 <= aboutCountChkLvlCod['breNbr'] && aboutCountChkLvlCod['breNbr'] <= 32))) {
          chkLvlCod = 1;
          vm.patientInfFlg.breNbrFlag = 1;
        } else {
          vm.patientInfFlg.breNbrFlag = 0;
        }
      } else {
        vm.patientInfFlg.breNbrFlag = 0;
      }
      if (chkLvlCodByPews === '') {
        /**
         * @if 有直接二级的项目
         * @age > 75 || 创伤标志 => 升1级
         */
        /**
         * @else 无直接二级的项目
         * @age > 75 || 创伤标志 => 变成三级
         */
        if (chkLvlCod === 1) {
          if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
            chkLvlCod--;
          }
          if (aboutCountChkLvlCod['cspgFlg'] === '1') {
            chkLvlCod--;
          }
          return chkLvlCod < 0 ? '0' : chkLvlCod.toString();
        } else {
          if ((aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && (aboutCountChkLvlCod['cspgFlg'] === '1')) {
            chkLvlCod = 1;
          } else if ((aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && !(aboutCountChkLvlCod['cspgFlg'] === '1')) {
            chkLvlCod = 2;
          } else if (!(aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') && (aboutCountChkLvlCod['cspgFlg'] === '1')) {
            chkLvlCod = 2;
          } else {
            chkLvlCod = 3;
          }
          return chkLvlCod.toString();
        }
      } else {
        chkLvlCod = chkLvlCod ? Math.min(chkLvlCod, chkLvlCodByPews) : (chkLvlCodByPews || '');
        if (aboutCountChkLvlCod['cstAge'] > 75 && aboutCountChkLvlCod['cstAgeCod'] === '0') {
          chkLvlCod--;
        }
        if (aboutCountChkLvlCod['cspgFlg'] === '1') {
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
      // case '':
      // case '0':
      // case '1':
      //   return chkLvlCod;
      //   break;
      // case '2':
      // case '3':
      // case '4':
      //   return '2';
      //   break;
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
 * @return  患者类别
 */
  getPatientType: function () {
    // 0 child 1 adultman 2 adlutwoman 3 ksfz
    var cstSexCod = vm.patientMsg.cstSexCod,
      ksfz = vm.hideMsg.ksfz;
    if (ksfz) {
      return '3'
    } else {
      var isChild = false;
      if (vm.patientMsg.patientTyp === '2') {
        isChild = true;
      }
      // var isChild = commonFun.isChild(cstAge, cstAgeCod);
      if (isChild === true) {
        return '0'
      } else if (isChild === false) {
        if (cstSexCod === '1') { //性别女
          return '2'
        }
        if (cstSexCod === '0') { //性别男
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
    if (typeForm === 'edit') {
      if (!vm.patientMsg.isGetAjaxFlg) {
        return;
      }
    }
    var typePat = vm.patientMsg.patientTyp;
    if (typePat === '1') {
      // vm.patientMsg.chkLvlCod = commonFun.countAdultChkLvlCod(); // [16年成人]
      // vm.patientMsg.chkLvlCod = commonFun.countNewAdultLevel(); // [18年成人]
      // if (_HSPLP == 'SD') {
      //   vm.patientMsg.chkLvlCod = commonFun.onlyZjHosToSanDun(); // 针对三墩院区
      // } else {
      //   vm.patientMsg.chkLvlCod = commonFun.countAdultChkLvlCod(); // [16年成人] 灵隐
      // }
      vm.patientMsg.chkLvlCod = commonFun.onlyZjHosToSanDun(); // 针对浙江医院两院区
    } else if (typePat === '2') {
      vm.patientMsg.chkLvlCod = commonFun.countChildChkLvlCod();
      vm.patientInfFlg.sbpUpNbrFlag = 0;
    } else if (typePat === '3') {
      vm.patientMsg.chkLvlCod = commonFun.countPregnantChkLvlCod();
    } else {
      vm.patientMsg.chkLvlCod = '3';
      vm.patientInfFlg.sbpUpNbrFlag = 0;
      vm.patientInfFlg.breNbrFlag = 0;
      vm.patientInfFlg.oxyNbrFlag = 0;
      vm.patientInfFlg.tmpNbrFlag = 0;
      vm.patientInfFlg.hrtRteFlag = 0;
      vm.patientInfFlg.glsNumFlag = 0
    }
    // 注释掉快速分诊默认4b
    if (vm.patientMsg.chkLvlCod == '3' && vm.hideMsg.ksfz != '') {
      vm.patientMsg.chkLvlCod = '3';
    } else if (vm.patientMsg.chkLvlCod == '4' && vm.hideMsg.ksfz == '') {
      vm.patientMsg.chkLvlCod = '3';
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
var _glsCodList = publicFun.getDict('XT_COD');
var vm = avalon.define({
  $id: 'jsbrqjs',
  getMsg: {
    cstSexCodList: [], // 性别
    cstAgeCodList: [], // 年龄类型
    ksfzList: [], // 快速分诊
    arvChlCodList: [], // 到院方式
    cmpPsnCodList: [], // 陪送人员
    senRctCodList: [], // 清醒程度
    senStuCodList: [], // 意识状态
    jzkscompctlList: [], // 分科
    // doctornameList: [], // 医生
    // savMngCodList: [], // 抢救和处置情况
    refusedSurveyList: [], // 异常项
    falAssCodList: [], // 跌倒评估
    mnsSitCodList: [], // 女性月经史
    algHonList: [{ infocode: '0', info: '无' }, { infocode: '1', info: '不详' }, { infocode: '2', info: '有' }], // 过敏史
    algTypCodList: [], // 过敏项目
    pastHisCodList: [], // 既往史
    otherHospitalNameList: [], // 救护车列表
    abnDriverList:[],//驾驶员列表
    chkLvlCodList: [], // 预检分级
    modLvlCodList: [], // 修订分级列表copy
    emgAreCodList: [], // 急诊分区
    bedplacecodList: [], // 床位
    emgBedList: [],
    lgBedList: [],
    emgBedTempList: [], // 临时
    lgBedTempList: [],
    patientTypList: [{ infocode: '1', info: '成人', checked: false }, { infocode: '2', info: '儿童', checked: false }, { infocode: '3', info: '孕产妇', checked: false }], // 患者类别
    pregnantYdcxCodList: [], // 阴道出血
    pregnantGsplCodList: [], // 宫缩频率
    cstDspCodList: [],
    grnChlRsnList: [],
    totalCbyxList: [],
    specialOtherList: [],
    fzDocList: [],
    frCodList: [],
    glsCodList:_glsCodList
  },
  patientMsg: {
    vstCad: '', // 就诊卡
    cardType: '', // 卡类别 1 社保 2 自费 3 农保
    emgDat: '', // 预检时间
    idNbr: '',   //身份证号
    grnChl: '0', // 绿色通道
    grnChlRsn: '', // 绿色通道原因
    swChl: '0', // 三无人员
    cstNam: '', // 姓名
    cstSexCod: '', // 性别
    bthDat: '', // 出生日期
    cstAge: '', // 年龄
    cstAgeCod: '0', // 年龄类型
    pheNbr: '', // 联系方式
    cstAdr: '', // 联系地址
    chkLvlCod: '', // 预检分级
    modLvlCod: '', // 修订分级
    modLvlDes: '', // 修订分级说明
    emgDepCod: '', // 最终分级
    emgAreCod: '', // 急诊分区
    mewsTotSco: '', // mews评分
    remsTotSco:'',//REMS评分
    remsDeath:'',//病死危险率
    // nrsTtbw: '', //疼痛部位
    // nrsTtbwQt: '', //疼痛部位其他
    // nrsTtxz: '', //疼痛性质
    // nrsTtxzQt: '', //疼痛性质其他 
    // nrsTtsj: '', //疼痛时间
    // nrsTtkz: '', //疼痛控制
    nrsMemo: '', //备注
    nrsSco: null, // NRS评分
    ttpfNr: null, // 疼痛内容
    ttpfTypeCod: null, // 疼痛类型
    gcsTotSco: '', // gcs评分
    cramsTotSco: '', // crams评分
    ksfz: [], // 快速分诊
    arvChlCod: '', // 到院方式
    cmpPsnCod: [], // 陪送人员
    oxyNbr: '', // 血氧饱和度
    senStuCod: '', // 意识状态
    cspgFlg: '0',
    cspgCod: '',
    hxknFlg: '0',
    hxknCod: '',
    hxknSubCod: '',
    xtFlg: '0',
    xtCod: '',
    xtSubCod: '',
    //xmFlg: '0',
    //xmCod: '',
    //xmSubCod: '',
    mtCod: '', //面瘫
    szthCod: '', //上肢瘫痪
    wlCod: '', //握力
    czFlag: '0', //卒中标志
    preDgnCod: '', // 主诉症状
    cstDspCod: '', // 病人去向
    emgFkCod: '', // 分科
    emgFkName: '', // 分科
    sqlDctNbr: '', // 分诊医生
    //savMngCod: [], // 抢救和处置情况
    refusedSurvey: '', // 异常项
    falAssCod: '', // 跌倒评估
    // opengwflag: '', // 有无打开过跌倒评估
    mnsSitCod: '', // 女性月经史
    algHon: '', // 过敏史
    algTypCod: [], // 过敏项目
    algTypDes: '', // 过敏史其他
    pastHisCod: [], // 既往史
    pastHis: '', // 即往史其他
    abnScoNme: '', // 其他医院送入name
    abnDriver: '',//120驾驶员
    abnDoctor: '',//120医生
    allergic: '', //过敏史借用字段
    emgBed: '', //床位
    bedid: '',
    bedLgs: '',
    caseHis: '', //第几周
    // isFetation: '',// 特殊人群评估
    patientTyp: '1',// 患者类型 默认成人
    pregnantYdcxCod: '', // 阴道出血
    pregnantGsplCod: '', // 宫缩频率
    qtsjFlg: '0',	// 群体事件标志      |0：否；1：是
    qtsjSeq: '',
    xfztFlg: '0', // 心肺骤停
    specialOther: '', // 特殊病人评估
    preUsrNbr: '', // 首诊护士
    preUsrNam: '', // 首诊护士名字
    sqlSeq: '',
    observationCode: '',
    emgJob: '',
    maritalStatus: '',
    nowHis: '',
    ryzdXy: '',
    cyzdZy: '',
    cyzdXy: '',
    deathDiagnosis: '',
    docDat: '',
    jzxh: '',
    jzys: '',
    ysxm: '',
    ksdm: '',
    checkNurse: '',
    checkDocDat: '',
    checkNurseDat: '',
    checkDocStatus: '',
    checkNurStatus: '',
    checkDoctor: '',
    rfidcode: '',
    cleanhzMemo: '',
    jbzdDes: '',
    mpi: '',
    ghxh: '',
    patid:'',
    firstsqlseq: '',
    bedNam: '', // 转归床位
    sqlDat: '', // 转归时间
    sqlDes: '', //转归说明（转院）
    sqlDepName: '', // 转归科室
    sqlStaCod: '', // 转归去向
    sqlStaStr: '', // 转归去向 Name
    symSitDes: '', // 修改页面护理评估表的大字段
    isGetAjaxFlg: false, // 修改页面 是否拿到数据
    nationality: '',
    gzdw: '',
    nation:'',
    frCod: [], // 发热
    frDat: '',
    nationality: '', // 国籍
    infectedareaNam: '', // 疫区名称
    pregnant: '0', // 孕产妇
    glsType: '', // 血糖
    glsNum: '', 
    zf:'',
    cdxx: '',
    khlx: '',
    rczId:'',
    jzxhOld:'',
    adtA01:'',
    psryqt:'',
    ghid: '', // 后台需要的字段
    patid: '', // 后台需要的字段
    jzxh:'',//就诊次数   
    glsCod:'',
    registerTimeStr: '', // 挂号时间
    xtlcflg: '0', // 进入胸痛流程标志 0=未进入流程 1=进入流程
    czlcflg: '0' // 进入卒中流程标志 0=未进入流程 1=进入流程
  },
  patientInfFlg: {
    pgbFlag: 0,
    tmpNbrFlag: 0,
    oxyNbrFlag: 0,
    breNbrFlag: 0,
    sbpUpNbrFlag: 0,
    hrtRteFlag: 0,
    glsNumFlag: 0
  },
  aboutMews: {
    senRctCod: '',
    breNbr: '',
    hrtRte: '',
    tmpNbr: '',
    sbpUpNbr: '',
    sbpDownNbr: '',
  },
  aboutRems:{
    hrtRte:'',
    sbpUpNbr:'',
    breNbr:'',
    gcsTotSco:'',
    cstAge:'',
    oxyNbr:''
  },
  aboutGCS: {
    eyeRctCod: '',
    lanRctCod: '',
    actRctCod: '',
  },
  aboutCRAMS: {
    sptLvlCod: '',
    lanLvlCod: '',
    cirLvlCod: '',
    breLvlCod: '',
    bdyLvlCod: ''
  },
  aboutPEWS: {
    actionCod: '', // 行为
    xxgSkinCod: '', // 肤色
    xxgCrtCod: '', // CRT
    xxgXlCod: '', // 心率
    hxPlCod: '', // 频率
    hxXhCod: '', // 吸凹
    hxFio2Cod: '',
    pewsSco: ''
  },
  aboutMorse:{
    jsgyywddCod: '', 
    dyygjbpdCod: '', 
    xzfzCod: '', 
    jmzlsyddgfxyCod: '', 
    btCod: '',
    rznlCod: '', 
    hlcsCod:'',
    MorseQk:'',
    zf: null, //总分
    ddfxpgbSeq:''
  },
  hideMsg: {
    ksfz: '', // 快速分诊
    cmpPsnCod: '', // 陪送人员
    //savMngCod: '', // 抢救和处置情况
    // refusedSurvey: '', // 异常项
    algTypCod: '', // 过敏项
    pastHisCod: '', // 既往史
    frCod: ''
  },
  isShowAbnScoList: false,
  isShowAbnDriverList: false,
  isShowAlgTypDes: false,
  isShowPastHis: false,
  isShowDocList: false,
  cleanName: function () {
    vm.patientMsg.cstNam = '';
  },
  updateTime: function () {
    vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
  },
  noMassRequire: function () {
    if (vm.hideMsg.ksfz == '' && vm.patientMsg.patientTyp !== '2' && vm.patientMsg.qtsjFlg !== '1') {
      return true
    } else {
      return false
    }
  },
  toSingleStr: function (objName, index) {
    var _ckList = vm.patientMsg[objName].$model;
    if (_ckList.length > 0) {
      vm.patientMsg[objName] = vm.patientMsg[objName + 'List'][index].infocode;
      vm.hideMsg[objName] = vm.patientMsg[objName].join(',');
    } else {
      vm.patientMsg[objName] = [];
      vm.hideMsg[objName] = '';
    }
  },
  /**
   * @@onlyNum 限制只能输入数字
   * @param  {string}     objName                 url
   */
  onlyNum: function (objName, attr, step, max) {
    vm[objName][attr] = publicFun.onlyNumber(vm[objName][attr], step, max)
    if (attr == 'cstAge') {
      vm.fallAssessByAge()
    }
  },
  isVisibleCstDspCod: function (val) {
    if (_HSPLP == 'SD') { // 三墩
      return val === '5' || val === '6';
    } else if (_HSPLP == 'LY') {
      return val === '5' || val === '6' || val === '11' || val === '15';
    }
  },
  isShowBed: function () {
    var _cstDspCod = vm.patientMsg.cstDspCod;
    if ((_islgbed === '0' && _cstDspCod === '11') || (_cstDspCod !== '11' && _cstDspCod !== '6') || (_cstDspCod == '' || _cstDspCod == null)) {
      return false
    } else {
      return true
    }
  },
  /**
   * @@judgeFlag 绿色通道 / 三无人员 / 心肺骤停 / 孕产妇 / 创伤 / 胸痛 / 呼吸困难 / 卒中
   */
  judgeFlag: function (objName) {
    if (vm.patientMsg[objName] === '0') {
      if (objName === 'grnChl') { 
        vm.patientMsg.grnChlRsn = '';
      }
      if (objName === 'pregnant') {
        vm.patientMsg.patientTyp = '3';
      }
      vm.patientMsg[objName] = '1'
    } else {
      var _msg = vm.patientMsg;
      if (objName === 'cspgFlg') {
        if (!publicFun.checkItemNull(_msg.cspgCod)) {
          _confirm('创伤情况已评估，确认清空评估选项吗？', null, function () {
            _msg.cspgCod = '';
            vm.patientMsg[objName] = '0';
            return;
          })
        } else {
          vm.patientMsg[objName] = '0';
        }
      } else if (objName === 'xtFlg') {
        if (!publicFun.checkItemNull(_msg.xtCod)) {
          _confirm('胸痛情况已评估，确认清空评估选项吗？', null, function () {
            _msg.xtCod = '';
            _msg.xtSubCod = '';
            vm.patientMsg[objName] = '0';
            return;
          })
        } else {
          vm.patientMsg[objName] = '0';
        }
      } else if (objName === 'czFlag') {
        if (!publicFun.checkItemNull(_msg.mtCod) || !publicFun.checkItemNull(_msg.szthCod) || !publicFun.checkItemNull(_msg.wlCod)) {
          _confirm('卒中情况已评估，确认清空评估选项吗？', null, function () {
            _msg.mtCod = '';
            _msg.szthCod = '';
            _msg.wlCod = '';
            vm.patientMsg[objName] = '0';
            return;
          })
        } else {
          vm.patientMsg[objName] = '0';
        }
      } else {
        vm.patientMsg[objName] = '0';
        if (objName === 'pregnant') {
          vm.calcPatType()
        }
      }
    }
  },
  bindGroupEvent: function (type) {
    var _qtsjSeq = vm.patientMsg.qtsjSeq;
    if (type !== 'check') {
      if (typeForm === 'edit') {
        createmodalwindow('群体事件绑定', 700, 500, _baseUrl + 'qtsjgl/tobdqtsj.do?hspQtsjglCustom.qtsjSeq=' + _qtsjSeq)
      } else {
        createmodalwindow('群体事件绑定', 820, 510, _baseUrl + 'qtsjgl/toBdqtsjNew.do?hspQtsjglCustom.qtsjSeq=' + _qtsjSeq)
      }
    } else {
      vm.patientMsg.qtsjFlg = '0'
      $('#qtsjSeq').val('');
      $('.spChl-btn').removeClass('active');
      $('#massText').html('');
      $('#massTitle').html('');
    }
  },
  openFrdj:function(){
    createmodalwindow('发热登记', 800, 650, _baseUrl + 'hzszyyemg/toFrRegister.do')
  },
  openYjws:function(){
    createmodalwindow('预检待完善', 980, 450, _baseUrl + 'hzszyyemg/toBeImproved.do')
  },
  openGhbd:function(){
    createmodalwindow('挂号绑定', 1000, 400, _baseUrl + 'his/toRczGhxx.do?emgSeq='+_emgSeq +'&mpi='+ vm.patientMsg.mpi+'&jzxhOld='+ vm.patientMsg.jzxhOld+'&cstNam='+ vm.patientMsg.cstNam);
  },
  outPatientInfo: function () {
    var patid =   vm.patientMsg.patid;
    createmodalwindow('院前信息', 850, 450, _baseUrl + 'aid/topatient.do?emgSeq='+_emgSeq +'&patid='+patid)
  },
  pewsBox: function () {
    createmodalwindow('PEWS评分', 800, 500, _baseUrl + 'hzszyyemg/queryPewsck.do')
  },
  getOpenGhlb: function () {
    createmodalwindow('已挂号未预检', 700, 515, _baseUrl + 'hzszyyemg/registeredlist.do')
  },
  MEWSbox: function () {
    createmodalwindow('MEWS评分', 600, 450, _baseUrl + 'emg/querymews.do')
  },
  REMSbox:function(){
    createmodalwindow('REMS评分', 600, 580, _baseUrl + 'emg/queryrems.do')
  },
  NRSbox: function () {
    createmodalwindow('疼痛评分', 700, 490, _baseUrl + 'scorequery/toNrsGde.do?typeSource=preCheck')
  },
  GCSbox: function () {
    createmodalwindow('GCS评分', 500, 490, _baseUrl + 'emg/querygcs.do')
  },
  CRAMSbox: function () {
    createmodalwindow('CRAMS评分', 500, 500, _baseUrl + 'emg/querycrams.do')
  },
  openKnowledge: function () {
    createmodalwindow('知识库', 600, 560, _baseUrl + 'firstimp/toZsk.do')
  },
  Morsebox: function () {
    createmodalwindow('Morse评分', 800, 500, _baseUrl + 'hzszyyemg/queryMorse.do?typeSource=precheck')
  },
  /**
   * @@synchroSenStuCod 意识状态为清醒状态，同步其他数据
   */
  synchroSenStuCod: function (val) {
    if (val === 0 || val === '0') {
      if (typeForm === 'edit') {
        if (vm.patientMsg.gcsTotSco == '' || vm.patientMsg.gcsTotSco == null) {
          vm.setTotalGcs();
        } else {
          vm.setAttiude()
        }
      } else {
        vm.setTotalGcs();
      }
    }
  },
  setTotalGcs: function () {
    vm.setAttiude()
    vm.patientMsg.gcsTotSco = '15';
    vm.aboutGCS.eyeRctCod = '4';
    vm.aboutGCS.lanRctCod = '5';
    vm.aboutGCS.actRctCod = '6';
  },
  setAttiude: function () {
    vm.aboutMews.senRctCod = '0';
    vm.patientMsg.senStuCod = '0';
    vm.getMsg.senRctCodList.forEach(function (item, idx) {
      item.checked = false
      if (item.infocode == '0') {
        item.checked = true
      }
    })
    vm.getMsg.senStuCodList.forEach(function (item, idx) {
      item.checked = false
      if (item.infocode == '0') {
        item.checked = true
      }
    })
  },
  _radioCheck: function (obj, index) {
    if (obj === 'emgFkCod') {
      var list = vm.getMsg.jzkscompctlList;
      var currentChecked = list[index]['checked'];
      $.each(list, function (index, value) {
        value['checked'] = false;
      });
      list[index]['checked'] = !currentChecked;
      if (list[index]['checked'] == true) {
        vm.patientMsg[obj] = list[index]['comno'];
        vm.patientMsg.emgFkName = list[index].comcname;
      } else {
        vm.patientMsg[obj] = '';
        vm.patientMsg.emgFkName = '';
      }
      vm.changeEmgFkCod()
    } else {
      if (obj === 'senRctCod') { // 清醒程度
        vm.aboutMews[obj] = publicFun.radioClicks(vm.getMsg[obj + 'List'], vm.aboutMews[obj], index);
        // 清醒程度选择无反应或者意识选择深昏迷，GCS评分自动选项为不能睁眼、不能发音、无动作，总分3分显示
        if (vm.aboutMews[obj] == '3') { // 清醒程度选择无反应
          vm.patientMsg.gcsTotSco = '3';
          vm.aboutGCS.eyeRctCod = '1';
          vm.aboutGCS.lanRctCod = '1';
          vm.aboutGCS.actRctCod = '1';
        }
      } else {
        vm.patientMsg[obj] = publicFun.radioClicks(vm.getMsg[obj + 'List'], vm.patientMsg[obj], index);
        if (obj === 'senStuCod') {// 意识选择深昏迷
          if (vm.patientMsg[obj] == '4') {
            vm.patientMsg.gcsTotSco = '3';
            vm.aboutGCS.eyeRctCod = '1';
            vm.aboutGCS.lanRctCod = '1';
            vm.aboutGCS.actRctCod = '1';
          }
        }
        if (obj === 'arvChlCod') {
          if (vm.patientMsg[obj] !== '9') {
            vm.patientMsg.abnScoNme = '';
          } else if(vm.patientMsg[obj] !== '5'){
            vm.patientMsg.abnDriver = '';
            vm.patientMsg.abnDoctor = '';
          }
        }
        if (obj === 'modLvlCod') {
          if (vm.patientMsg[obj] == '') {
            vm.patientMsg[obj] = vm.patientMsg.chkLvlCod;
            for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
              vm.getMsg['modLvlCodList'][i].checked = false;
              if (vm.patientMsg.chkLvlCod == vm.getMsg['modLvlCodList'][i]['infocode']) {
                vm.getMsg['modLvlCodList'][i].checked = true;
              }
            }
          }
        }
      }
    }
  },
  _checkClicks: function (obj, index) {
    vm.hideMsg[obj] = publicFun.checkClicks(vm.getMsg[obj + 'List'], vm.patientMsg[obj], index, vm.hideMsg[obj])
    if (obj === 'pastHisCod') {
      if ($.inArray('450', vm.patientMsg[obj]) > -1) {
        vm.isShowPastHis = true
      } else {
        vm.isShowPastHis = false;
        vm.patientMsg.pastHis = '';
      }
    }
    if (_HSPLP === 'SD') { // 三墩院区
      if (obj === 'ksfz') {
        // 犬伤不默认科室了 by 2020/07/02
        // if ($.inArray('232', vm.patientMsg[obj]) > -1) { // 选择快速分诊：犬伤；主诉症状默认放：犬伤  病人去向：诊间就诊 就诊科室：犬伤门诊
        //   vm.patientMsg.emgFkCod = 'SD0010';
        //   vm.patientMsg.emgFkName = '犬伤门诊';
        //   // if (vm.patientMsg.preDgnCod.indexOf('犬伤') < 0) {
        //   //   vm.patientMsg.preDgnCod += '犬伤'
        //   // }
        // } else 
        if (($.inArray('234', vm.patientMsg[obj]) > -1) || ($.inArray('235', vm.patientMsg[obj]) > -1)) { // 选择快速分诊: 核酸检测/入所体检，病人去向 诊间就诊  就诊科室  急诊内科
          vm.patientMsg.emgFkCod = 'SD0001';
          vm.patientMsg.emgFkName = '急诊内科';
        } else if (($.inArray('236', vm.patientMsg[obj]) > -1) || ($.inArray('240', vm.patientMsg[obj]) > -1)) { // 选择快速分诊: 外伤，虫咬伤，默认诊间就诊，急诊外科
          vm.patientMsg.emgFkCod = 'SD0002';
          vm.patientMsg.emgFkName = '急诊外科';
        } else if (($.inArray('238', vm.patientMsg[obj]) > -1)) { // 选择快速分诊: 鱼刺，默认耳鼻喉科
          vm.patientMsg.emgFkCod = 'SD0009';
          vm.patientMsg.emgFkName = '急诊耳鼻喉';
        }else {
          vm.patientMsg.emgFkCod = '';
          vm.patientMsg.emgFkName = '';
          // if (typeForm != 'edit') { // 登记页面 清空 修改不清空
          //   vm.patientMsg.emgFkCod = '';
          //   vm.patientMsg.emgFkName = '';
          // }
        }
        var ksfzValList = vm.patientMsg.ksfz.$model;
        if (ksfzValList.length > 0) {
          vm.patientMsg.cstDspCod = '5';
        } else {
          vm.patientMsg.cstDspCod = '';
        }
      }
    }
  },
  cspgBox: function () {
    createmodalwindow('创伤标志', 450, 400, _baseUrl + 'emg/querycspg.do')
  },
  hxknzbBox: function () {
    createmodalwindow('呼吸困难', 580, 376, _baseUrl + 'emg/queryhxknzb.do')
  },
  xtzbpgBox: function () {
    createmodalwindow('胸痛', 700, 376, _baseUrl + 'emg/queryxtzbpg.do')
  },
  czFaceBox: function () {
    createmodalwindow('卒中', 500, 275, _baseUrl + 'hzszyyemg/queryczface.do')
  },
  specialBox: function () {
    createmodalwindow('特殊病人评估', 580, 320, _baseUrl + 'hzszyyemg/querySpecial.do')
  },
  riskBox: function () {
    createmodalwindow('跌倒评估', 800, 450, _baseUrl + 'hzszyyemg/queryRisk.do')
  },
  calcPatType: function () {
    if (typeForm === 'edit') {
      if (!vm.patientMsg.isGetAjaxFlg) {
        return;
      }
    }
    /**
    * @若年龄大于14岁，则患者类别默认为成人、孕产妇 如果小于14岁默认为儿童
    */
    var cstAge = vm.patientMsg.cstAge,
      cstAgeCod = vm.patientMsg.cstAgeCod;
    if (cstAge !== '' && ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2')) {
      vm.patientMsg.patientTyp = '2';
    } else if (cstAge >= 14 && cstAgeCod === '0') {
      if (vm.patientMsg.pregnant == '1') {
        vm.patientMsg.patientTyp = '3'
      } else {
        vm.patientMsg.patientTyp = '1'
      }
    } else if (cstAge === '') {
      if (vm.patientMsg.pregnant == '1') {
        vm.patientMsg.patientTyp = '3';
      } else {
        vm.patientMsg.patientTyp = '1' // 年龄为空 默认患者类型成人
      }
    }
    vm.fallAssessByAge()
  },
  /**
   * @修改分科
   */
  changeEmgFkCod: function () {
    var emgFkCod = vm.patientMsg.emgFkCod;
    if (emgFkCod != '') {
      $.each(vm.getMsg.jzkscompctlList, function (idx, val) {
        if (val['comno'] == emgFkCod) {
          vm.patientMsg.emgFkName = val['comcname'];
        }
      });
      vm.getEmgFkDocList(emgFkCod);
    } else {
      vm.patientMsg.emgFkName = '';
    }
    // vm.patientMsg.sqlDctNbr = '';
  },
  getEmgFkDocList: function (emgFkCod) {
    // 去除首诊医生的请求
    // publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findHspDctNbrList.do' }, { 'dstuserCustom.emgsysid': emgFkCod, 'dstuserCustom.outCall': '1', _t: Date.parse(new Date()) }, function (res) {
    //   var _fkList = res.msg.findHspDctNbrLsit;
    //   if (_fkList.length == 0) {
    //     // publicFun.alert('对应科室下面没有相应的医生！');
    //   }
    //   vm.getMsg.fzDocList = _fkList;
    // });
  },
  /**
   * @单击清空送入来源
   */
  cleanAbnSco: function () {
    vm.isShowAbnScoList = false;
    vm.isShowAbnDriverList = false;
  },
  /**
   * @获取送入来源列表
   */
  getAbnSco: function (name) {
    var getAbnScoUrl = _baseUrl + 'hzszyyemg/findHspScoListBySzm.do';
    publicFun.httpServer({ url: getAbnScoUrl }, { acronym: name }, function (res) {
      vm.getMsg.otherHospitalNameList = res.rows;
    })
  },
  /**
   * @选择某个送入来源
   */
  // chooseAbnSco: function (id, scoName) {
  //   vm.patientMsg.abnScoName = scoName;
  //   $('#showName').val(scoName);
  //   vm.isShowAbnScoList = false;
  // },
  /**
   * @获取送入来源列表
   */
  getAbnDriver: function (name) {
    var getAbnDriverUrl = _baseUrl + 'hzszyyemg/findAbnDriverList.do';
    publicFun.httpServer({ url: getAbnDriverUrl }, { abnDriver: name }, function (res) {
      vm.getMsg.abnDriverList = res.rows;
    })
  },
  /**
   * @选择某个送入来源
   */
  chooseAbnDriver: function (abnDriver) {
    vm.patientMsg.abnDriver = abnDriver;
    $('#driverName').val(abnDriver);
    vm.isShowAbnDriverList = false;
  },
  cleanSqlText: function () {
    // vm.patientMsg.sqlDctNbr = '';
    vm.isShowDocList = false;
  },
  chooseSqlDoc: function (name) {
    vm.patientMsg.sqlDctNbr = name;
    vm.isShowDocList = false;
  },
  changeToStr: function (objName) {
    var _list = vm.patientMsg[objName].$model;
    if (_list.length > 0) {
      vm.hideMsg[objName] = _list.join(',');
    } else {
      vm.hideMsg[objName] = ''
    }
  },
  cbyxSearchList: [],
  /**
   * 获取模糊查询
   */
  getCbyxList: function () {
    vm.cbyxSearchList = [];
    var cbyxDictList = vm.getMsg.totalCbyxList;
    cbyxDictList.map(function (item) {
      if (vm.patientMsg.preDgnCod) {
        var currentData = item.cbyx.indexOf(vm.patientMsg.preDgnCod);
        var currentLetter = item.pysm.indexOf(vm.patientMsg.preDgnCod.toUpperCase());
        if (currentData === 0 || currentLetter === 0) {
          vm.cbyxSearchList.push(item)
        }
      }
    })
    if (vm.cbyxSearchList.length > 0) {
      $(".cbyxSearchList").show();
    } else {
      $(".cbyxSearchList").hide();
    }
  },
  chooseCbyx: function (idx) {
    var _currentCbyx = vm.cbyxSearchList[idx];
    vm.patientMsg.preDgnCod = _currentCbyx.cbyx;
    initCbyxVal(_currentCbyx);
    //重置待选列表
    vm.cbyxSearchList = [];
    $(".cbyxSearchList").hide();
    $("#cbyxParams").blur();
  },
  fallAssessByAge: function () {
    var _cstAge = vm.patientMsg.cstAge,
        _cstAgeCod = vm.patientMsg.cstAgeCod;
    if (_cstAge != '') {
      // 年龄小于2岁或者大于75岁的患者，跌倒评估自动选择步态不稳，默认高危。
      if (((_cstAge < 2 || _cstAge > 75) && _cstAgeCod === '0') || (_cstAge < 24 && _cstAgeCod == '1') || (_cstAge < 730 && _cstAgeCod == '2')) {
        vm.patientMsg.falAssCod = '471';
      }
    }
  },
  setCurrentCk: function (className) {
    var _objName = '';
    if (className === 'xtlcflg') { // 胸痛
      _objName = 'xtFlg'
    } else {
      _objName = 'czFlag'
    }
    // 点击进入胸痛或卒中流程、基本信息下面的卒中和胸痛项目默认选中
    if (!$('.' + className).hasClass('active')) {
      $('.' + className).addClass('active')
      vm.patientMsg[className] = '1';
      vm.patientMsg[_objName] = '1';
    } else {
      // 修改页面 ---- 如果进入胸痛流程了，则提示“该患者已进入胸痛流程，无法取消”。
      // 点击保存后如果进入卒中流程了，则提示“该患者已进入卒中流程，无法取消”
      if (typeForm === 'edit') {
        var _alert_msg = '';
        if (className === 'xtlcflg') { // 胸痛
          _alert_msg = '该患者已进入胸痛流程，无法取消';
          url_str = 'hzszyyemg/checkXtlcAjax.do';
        } else { // 卒中
          _alert_msg = '该患者已进入卒中流程，无法取消';
          url_str = 'hzszyyemg/checkCzlcAjax.do';
        }
        publicFun.httpServer({url: _baseUrl + 'hzszyyemg/checkXtCzlcAjax.do', isAsync: false}, {
          emgSeq: _emgSeq,
          type: className
        }, function (res) {
          if (res.resultInfo.type == 1) {
            var _rtnFlg = res.resultInfo.sysdata.total;
            // 只要不是0 就是已经进入流程的， 则需要提示的
            if (_rtnFlg !== '0' && _rtnFlg !== 0) {
              publicFun.alert(_alert_msg)
              return;
            } else {
              $('.' + className).removeClass('active')
              vm.patientMsg[className] = '0';
            }
          }
        })
      } else {
        $('.' + className).removeClass('active')
        vm.patientMsg[className] = '0';
      }
    }
  }
});
/**
 * @监听性别
 */
vm.patientMsg.$watch('cstSexCod', function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  var cstSexCod = newVal,
    cstAge = vm.patientMsg.cstAge,
    cstAgeCod = vm.patientMsg.cstAgeCod;
  /**
   * @男性去除月经状态
   */
  if (cstSexCod === '0') {
    vm.patientMsg.mnsSitCod = '';
  }
  /**
   * @小于14岁的女孩，设置月经状态为空
   */
  if ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2') {
    vm.patientMsg.mnsSitCod = '';
  }
  /**
   * @大于60岁的女性，已绝经
   */
  if (cstSexCod === '1' && (cstAge >= 60 && cstAgeCod === '0')) {
    vm.patientMsg.mnsSitCod = '2';
  }
});

/**
 * @监听年龄
 * @计算分级
 */
vm.patientMsg.$watch('cstAge', function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if ((newVal >= 14 && vm.patientMsg.cstAgeCod === '0')||newVal == '') {
      vm.aboutRems.cstAge = newVal;
      vm.patientMsg.remsTotSco = commonFun.countRemsCount();
    }
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  var cstSexCod = vm.patientMsg.cstSexCod,
    cstAge = vm.patientMsg.cstAge,
    cstAgeCod = vm.patientMsg.cstAgeCod;
  /**
  * @若年龄大于14岁，则患者类别默认为成人 如果小于14岁默认为儿童
  */
  vm.calcPatType();
  /**
   * @计算分级
   */
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  /**
   * @小于14岁的女孩，设置月经状态为空
   */
  if ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2') {
    vm.patientMsg.mnsSitCod = '';
  }

  /**
   * @大于60岁的女性，已绝经
   */
  if (cstSexCod === '1' && (cstAge >= 60 && cstAgeCod === '0')) {
    vm.patientMsg.mnsSitCod = '2';
  }
  if (newVal >= 14 && cstAgeCod === '0'||newVal == '') {
    vm.aboutRems.cstAge = newVal;
    vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  }
});

/**
 * @监听年龄类型
 * @计算分级
 */
vm.patientMsg.$watch('cstAgeCod', function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if (vm.patientMsg.cstAge >= 14 && newVal === '0') {
      vm.aboutRems.cstAge = vm.patientMsg.cstAge;
      vm.patientMsg.remsTotSco = commonFun.countRemsCount();
    }
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  var cstSexCod = vm.patientMsg.cstSexCod,
    cstAge = vm.patientMsg.cstAge,
    cstAgeCod = newVal;
  /**
   * @若年龄大于14岁，则患者类别默认为成人 如果小于14岁默认为儿童
   */
  vm.calcPatType();
  /**
   * @计算分级
   */
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  /**
   * @小于14岁的女孩，设置月经状态为空
   */
  if ((cstAge < 14 && cstAgeCod === '0') || cstAgeCod === '1' || cstAgeCod === '2') {
    vm.patientMsg.mnsSitCod = '';
  }
  /**
   * @大于60岁的女性，已绝经
   */
  if (cstSexCod === '1' && (cstAge >= 60 && newVal === '0')) {
    vm.patientMsg.mnsSitCod = '2';
  }
});

/**
 * @快速分诊监听
 * array ==> string ['3','6','7'] ==> '3','6','7'
 */
vm.patientMsg.ksfz.$watch('$all', function (name, newVal, oldVal) {
  var numTest = /^\+?[0-9]*$/,
    innerText = [],
    ksfzList = vm.getMsg.ksfzList;
  var ksfz;
  if (numTest.test(newVal)) {
    ksfz = vm.patientMsg.ksfz.$model;
    vm.hideMsg.ksfz = ksfz.join();
    $.each(ksfzList, function (idx, val) {
      if ($.inArray(val['infocode'], ksfz) > -1) {
        innerText.push(val['info']);
      }
    });
    // 修改不能拼接主述 因为文本框可能原来就有值，选了之后不能回到之前的状态取
    if (typeForm === 'precheck') {
      vm.patientMsg.preDgnCod = innerText.join();
    }
    $('#ksfzMsg').val(innerText.join());
  }
});

/**
 * @监听女性月经史 清空怀孕周数
 */
vm.patientMsg.$watch('mnsSitCod', function (newVal, oldVal) {
  if (newVal != '1') {
    vm.patientMsg.caseHis = '';
  }
});
/**
 * @监听体温
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('tmpNbr', function (newVal, oldVal) {
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听血压
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('sbpUpNbr', function (newVal, oldVal) {
  vm.aboutRems.sbpUpNbr = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
vm.aboutMews.$watch('sbpDownNbr', function (newVal, oldVal) {
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听呼吸
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('breNbr', function (newVal, oldVal) {
  vm.aboutRems.breNbr = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

/**
 * @监听心率
 * @计算mews评分&&分级
 */
vm.aboutMews.$watch('hrtRte', function (newVal, oldVal) {
  vm.aboutRems.hrtRte = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听血氧饱和度
 * @计算分级
 */
vm.patientMsg.$watch('oxyNbr', function (newVal, oldVal) {
  vm.aboutRems.oxyNbr = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听清醒程度
 * 因为senRctCod牵涉到mews评分，所以也需触发一次监听来计算分级，这样可以避免联动监听。导致栈溢出
 */
vm.aboutMews.$watch('senRctCod', function (newVal, oldVal) {
  vm.patientMsg.mewsTotSco = commonFun.countMewsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
  if (typeForm === 'edit') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.synchroSenStuCod(newVal);
});

vm.patientMsg.$watch('senStuCod', function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  vm.synchroSenStuCod(newVal);
});
/**
 * @监听疼痛等级
 * @计算分级
 */
vm.patientMsg.$watch('nrsSco', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听创伤标志
 * @计算分级
 */
vm.patientMsg.$watch('cspgFlg', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听呼吸困难
 * @计算分级
 */
vm.patientMsg.$watch('hxknFlg', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听胸痛
 * @计算分级
 */
vm.patientMsg.$watch('xtFlg', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

/**
 * @监听心肺骤停
 * @计算分级
 */
vm.patientMsg.$watch('xfztFlg', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

/**
 * @监听卒中
 * @计算分级
 */
vm.patientMsg.$watch('czFlag', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

/**
 * @监听血糖
 * @计算分级
 */
vm.patientMsg.$watch('glsNum', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听患者类型
 * @计算分级
 */
vm.patientMsg.$watch('patientTyp', function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  if (newVal === '2') {
    if (typeForm != 'edit') {
      vm.patientMsg.cstDspCod = '5';
      var _list = vm.getMsg.jzkscompctlList, _ekCod = '';
      for (var i = 0; i < _list.length; i++) {
        if (_list[i].comcname === '急诊儿科') {
          _ekCod = _list[i].comno
        }
      }
      vm.patientMsg.emgFkName = '急诊儿科';
      vm.patientMsg.emgFkCod = _ekCod;
    }
  } else {
    if (newVal === '3') {
      vm.patientMsg.pregnant = '1';
    }
    if (typeForm != 'edit') {
      vm.patientMsg.cstDspCod = '';
      vm.patientMsg.emgFkName = '';
      vm.patientMsg.emgFkCod = '';
    }
  }
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听快速分诊
 * @计算分级
 */
vm.hideMsg.$watch('ksfz', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

/**
 * @监听宫缩频率
 * @计算分级
 */
vm.patientMsg.$watch('pregnantGsplCod', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听阴道出血
 * @计算分级
 */
vm.patientMsg.$watch('pregnantYdcxCod', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});
/**
 * @监听pews
 * @计算分级
 */
vm.aboutPEWS.$watch('pewsSco', function (newVal, oldVal) {
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
});

/**
 * @过敏状态监听
 */
vm.patientMsg.$watch('algHon', function (newVal, oldVal) {
  if (newVal === '0' || newVal === '1') {
    vm.patientMsg.algTypCod = [];
  }
});

/**
 * @过敏项目监听
 */
vm.patientMsg.algTypCod.$watch('$all', function (name, newVal, oldVal) {
  var numTest = /^\+?[0-9]*$/;
  var algTypCod,
    algTypCodList = vm.getMsg.algTypCodList,
    innerText = [];
  if (numTest.test(newVal)) {
    algTypCod = vm.patientMsg.algTypCod.$model;
    vm.hideMsg.algTypCod = algTypCod.join();
    $.each(algTypCodList, function (idx, val) {
      if ($.inArray(val['infocode'], algTypCod) > -1) {
        innerText.push(val['info']);
      }
    });
    if ($.inArray('6', algTypCod) > -1) {
      vm.isShowAlgTypDes = true;
    } else {
      vm.isShowAlgTypDes = false;
      vm.patientMsg.algTypDes = '';
    }
    vm.patientMsg.allergic = innerText.join();
  }
  if (newVal != '') {
    vm.patientMsg.algHon = '2';
  }
});

/**
 * @监听出生日期
 * @年龄
 */
vm.patientMsg.$watch('bthDat', function (newVal, oldVal) {
  if (newVal != '') {
    vm.patientMsg.cstAge = publicFun.calculateAge(newVal).Age;
    vm.patientMsg.cstAgeCod = publicFun.calculateAge(newVal).type;
  } else {
    vm.patientMsg.cstAge = "";
    vm.patientMsg.cstAgeCod = "0";
    vm.aboutRems.cstAge = '';
    vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  }
});

vm.patientMsg.$watch('emgFkCod', function (newVal, oldVal) {
  var _emgFk = newVal;
  if (_emgFk !== '') {
    vm.getEmgFkDocList(_emgFk);
  }
  var _emgFkCodList = vm.getMsg.jzkscompctlList;
  _emgFkCodList.forEach(function (val, idx) {
    val.checked = false
  })
  if (newVal != '') {
    _emgFkCodList.forEach(function (val, idx) {
      val.checked = false
      if (val.comno == newVal) {
        val.checked = true
      }
    })
  }
  vm.getMsg.jzkscompctlList = _emgFkCodList.slice()

})
/**
 * @监听GCS评分
 */
vm.patientMsg.$watch('gcsTotSco', function (newVal, oldVal) {
  vm.aboutRems.gcsTotSco = newVal;
  vm.patientMsg.remsTotSco = commonFun.countRemsCount();
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
})
/**
 * @监听REMS评分
 */
vm.patientMsg.$watch('remsTotSco', function (newVal, oldVal) {
  if(newVal <= 11){
    vm.patientMsg.remsDeath = '10%'
  }else if(11< newVal && newVal < 16){
    vm.patientMsg.remsDeath = '10%-50%'
  }else if(newVal ==16 || newVal == 17){
    vm.patientMsg.remsDeath = '50%'
  }else if(17< newVal && newVal < 24){
    vm.patientMsg.remsDeath = '50%-100%'
  }else if(newVal >= 24){
    vm.patientMsg.remsDeath = '100%'
  }
})
/**
 * @计算急诊分级
 * parm     chkLvlCod   '','0','1','2','3'
 * 预检页面 => 预检分级有值，修订分级清空
 * 修改页面 => 自动分级若有值，则修订分级如果为空的情况下，默认选中自动分级的值
*/
vm.patientMsg.$watch('chkLvlCod', function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  // 新版 修订分级没值才赋 自动分级
  // for (var i = 0; i < vm.getMsg['modLvlCodList'].length; i++) {
  //   vm.getMsg['modLvlCodList'][i].checked = false;
  //   if (newVal == vm.getMsg['modLvlCodList'][i]['infocode']) {
  //     vm.getMsg['modLvlCodList'][i].checked = true;
  //   }
  // }
  // vm.patientMsg.modLvlCod = newVal;
  // vm.patientMsg.modLvlDes = '';
  // vm.patientMsg.emgAreCod = commonFun.countEmgAreCod(newVal);
  // vm.patientMsg.emgDepCod = newVal;
});

// 修订分级
vm.patientMsg.$watch("modLvlCod", function (newVal, oldVal) {
  if (typeForm === 'edit') {
    if (!vm.patientMsg.isGetAjaxFlg) {
      return;
    }
  }
  // 修订分级等于自动分级 或者修订分级的值为空的 => 清空修订理由
  if ((newVal == vm.patientMsg.chkLvlCod) || newVal == ''){
    vm.patientMsg.modLvlDes = '';
  }
  vm.patientMsg.emgDepCod = newVal
  vm.patientMsg.emgAreCod = commonFun.countEmgAreCod(newVal);
  // if (newVal === '' || newVal === null || newVal === undefined) {
  //   var _chkLvlCod = vm.patientMsg.chkLvlCod;
  //   vm.patientMsg.emgAreCod = commonFun.countEmgAreCod(_chkLvlCod);
  //   vm.patientMsg.emgDepCod = _chkLvlCod;
  // }
  // if (newVal === '0' || newVal === '1') {
  //   vm.patientMsg.grnChl = '1'
  // } else {
  //   vm.patientMsg.grnChl = '0'
  // }
});

vm.patientMsg.$watch('pregnant', function (newVal, oldVal) {
  if (newVal != '1') {
    vm.patientMsg.pregnantYdcxCod = '';
    vm.patientMsg.pregnantGsplCod = '';
  }
})
// 解决ie下select option 显隐藏不起作用
vm.patientMsg.$watch('cstDspCod', function (newVal, oldVal) {
  siteBedListItem();
  var _cstDspCodList = vm.getMsg.cstDspCodList;
  _cstDspCodList.forEach(function (val, idx) {
    val.checked = false;
  })
  if (newVal != '') {
    _cstDspCodList.forEach(function (val, idx) {
      val.checked = false
      if (val.infocode == newVal) {
        val.checked = true
      }
    })
  }
  vm.getMsg.cstDspCodList = _cstDspCodList.slice();
})

// 解决ie下select option 显隐藏不起作用
vm.patientMsg.$watch('qtsjFlg', function (newVal, oldVal) {
  siteBedListItem();
})
//监听陪送人员
vm.hideMsg.$watch('cmpPsnCod', function (newVal, oldVal) {
  if (newVal.indexOf('8') == -1) {
    vm.patientMsg.psryqt == ''
  }
})

function siteBedListItem () {
  var _strBed = '<option value="">请选择</option>';
  if (vm.patientMsg.cstDspCod === '11') { // 11 290 留观室
    var _list = [];
    if (vm.patientMsg.qtsjFlg === '1') {
      _list = vm.getMsg.lgBedList.concat(vm.getMsg.lgBedTempList)
    } else {
      _list = vm.getMsg.lgBedList;
    }
    for (var i = 0; i < _list.length; i++) {
      _strBed += '<option class=\"bedOption lgInfo\" value=' + _list[i].bedid + '>' + _list[i].bedPlcNam + '</option>'
    }
  } else if (vm.patientMsg.cstDspCod === '6') {
    var _list = [];
    if (vm.patientMsg.qtsjFlg === '1') {
      _list = vm.getMsg.emgBedList.concat(vm.getMsg.emgBedTempList)
    } else {
      _list = vm.getMsg.emgBedList;
    }
    for (var i = 0; i < _list.length; i++) {
      _strBed += '<option class=\"bedOption lgInfo\" value=' + _list[i].bedid + '>' + _list[i].bedPlcNam + '</option>'
    }
  }
  $('#bedId').html(_strBed);
  $('#bedId').val('');
  vm.patientMsg.bedid = '';
}
vm.patientMsg.$watch('preDgnCod', function (newVal, oldVal) {
  if (newVal === '') {
    $('#checkLevel').val('');
    $('#measure').html('');
    vm.patientMsg.chkLvlCod = commonFun.countFinalCod()
  } else {
    var _listLevel = vm.getMsg.totalCbyxList, noDictFlg = false;
    for (var i = 0; i < _listLevel.length; i++) {
      if (_listLevel[i].cbyx == publicFun.strTrim(newVal)) {
         noDictFlg = true
        initCbyxVal(_listLevel[i]);
      }
      if (new RegExp(/_listLevel[i].cbyx/).test(publicFun.strTrim(newVal)) == true) {
        noDictFlg = true
        initCbyxVal(_listLevel[i]);
      }
    }
    if (!noDictFlg) {
      $('#checkLevel').val('');
      $('#measure').html('');
      vm.patientMsg.chkLvlCod = commonFun.countFinalCod()
    }
  }
  // // 如果主诉中有头晕二字，则跌倒评估默认勾选“主诉头晕”，并且默认高危
  // var _dizzyStr = '头晕', _dizzyData;
  // _dizzyData = vm.patientMsg.preDgnCod.indexOf(_dizzyStr);
  // if (_dizzyData === 0) {
  //   var _alreadyFalCod = vm.patientMsg.falAssCod;
  //   if (vm.patientMsg.falAssCod != '#' && vm.patientMsg.falAssCod != '') {
  //     if (vm.patientMsg.falAssCod.indexOf('475') == -1) {
  //       vm.patientMsg.falAssCod = _alreadyFalCod + ',475';
  //     }
  //   } else {
  //     vm.patientMsg.falAssCod = '475';
  //   }
  // }
})

vm.patientMsg.$watch('glsType', function (newVal, oldVal) {
  if (newVal == 2 || newVal == 3) {
    vm.patientMsg.glsNum = '';
  }
});

function enterWay () {
  /**
   * @回车优化
   * @author  ql
   */
  $("[name*='hspemginfCustom']").keypress(function (e) {
    if (e.which == 13) { // 判断所按是否回车键
      var inputs = $("form[name^='hspemginfCustom']").find(':text'); // 获取表单中的所有输入框
      var idx = inputs.index(this); // 获取当前焦点输入框所处的位置
      if (idx == inputs.length - 1) { // 判断是否是最后一个输入框
        return false;
      } else {
        inputs[idx + 1].focus(); // 设置焦点
        inputs[idx + 1].select(); // 选中文字
      }
      return false; // 取消默认的提交行为
    }
  });
  /**
   * @病历号 => 默认获取焦点
   * @author  ql
   */
  setTimeout(function () {
    $('#emg_vstCad').focus();
  });
}

function getKnowledgeList () {
  publicFun.httpServer({ url: _baseUrl + 'firstimp/queryZsk_result.do' }, {page: 1,rows: 10000}, function (res) {
    vm.getMsg.totalCbyxList = res.rows;
  })
}

function initCbyxVal (ele) {
  $('#checkLevel').val(ele.yjdj);
  if (ele.zbcs) {
    $('#measure').html('准备措施：' + ele.zbcs);
  }
  if (ele.fzks) {
    $('#emg_emgFkName').val(ele.fzksname);
    $('#emg_emgFkCod').val(ele.fzks);
  }
  if (ele.brqx) {
    vm.patientMsg.cstDspCod = ele.brqx;
  }
  vm.patientMsg.chkLvlCod = commonFun.countFinalCod();
}
// function isShowKnowledge () {
//   if (_isOpenKnowledge === '1') {
//     $('#knowledgeDiv').show();
//     $('.patient-msg-container .first-impression').css({ 'width': '400px' });
//     $('.cbyxSearchList').css({ 'width': '405px' })
//   } else {
//     $('#knowledgeDiv').hide();
//     $('.patient-msg-container .first-impression').css({ 'width': '800px' });
//     $('.cbyxSearchList').css({ 'width': '805px' })
//   }
// }
/**
 * @getAjaxInfoList  获取列表
 */
function getAjaxInfoList() {
  publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findEmgList_zyy.do', isAsync: false }, { _t: Date.parse(new Date()) }, function (res) {
    initDictList(res);
  });
  vm.patientMsg.nationality = '中国';
  vm.patientMsg.emgDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
  vm.getAbnSco();
  vm.getAbnDriver();
}

function initDictList (res) {
  var msgList = res.resultInfo.sysdata;
  jsbrjz = msgList;
  if (res.resultInfo.type == '1') {
    msgList.modLvlCodList = [{ infocode: '0', info: 'I级' }, { infocode: '1', info: 'II级' }, { infocode: '2', info: 'III级' }, { infocode: '3', info: 'IVa级' }, { infocode: '4', info: 'IVb级' }];
    // msgList.emgAreCodList = [{infocode: '0', info: '红区'}, {infocode: '1', info: '黄区'}, {infocode: '2', info: '绿区'}];
    $.each(msgList, function (key, val) {
      if (vm.getMsg.hasOwnProperty(key)) {
        if (key === 'bedplacecodList') {
          $.each(val, function (_idx, _val) {
            if (_val.bedPlace == '290') {
              vm.getMsg.lgBedList.push(_val);
            } else if (_val.bedPlace == '291') {
              vm.getMsg.emgBedList.push(_val);
            } else if (_val.bedPlace == '2900') { // 临时床位
              vm.getMsg.lgBedTempList.push(_val);
            } else if (_val.bedPlace == '2911') {
              vm.getMsg.emgBedTempList.push(_val);
            }
          })
        }
        var _checkedList = ['cstSexCodList', 'ksfzList', 'arvChlCodList', 'cstDspCodList', 'jzkscompctlList','senStuCodList', 'senRctCodList', 'chkLvlCodList', 'modLvlCodList', 'frCodList', 'mnsSitCodList', 'emgAreCodList', 'algTypCodList', 'cmpPsnCodList', 'pastHisCodList', 'refusedSurveyList'];
        if ($.inArray(key, _checkedList) > -1) {
          $.each(val, function (_idx, _val) {
            _val.checked = false
          })
        }
        vm.getMsg[key] = val;
      }
    });
  }
}

// 生命体征采集 迈瑞VS900
function setEmgSeq () {
  var url = "http://localhost:8848/ReadTPRB";
  jQuery.support.cors = true;
  $.ajax({
    url: url,
    type: "get",
    dataType: "jsonp",
    jsonp: "callback",
    jsonpCallback:"jsonp9578",
    contentType:'application/json; charset=utf-8',
    success: function (dataObj) {
      if (dataObj[0].ret == '0') {
        vm.aboutMews.sbpUpNbr = dataObj[0].NIBP_S;// 血压上压
        vm.aboutMews.sbpDownNbr = dataObj[0].NIBP_D;// 血压下压
        vm.aboutMews.hrtRte = dataObj[0].PR;// 心率
        vm.patientMsg.oxyNbr = dataObj[0].SPO2;
      } else if (dataObj[0].ret == '-1') {
        publicFun.alert('监护仪URL错误,请检查！');
      } else if (dataObj[0].ret == '-2') {
        publicFun.alert('缺少配置文件ReadMindray.ini！')
        // _confirm('缺少配置文件ReadMindray.ini！', null, function () {
        // 	setReadOMLData();
        // });
      } else if (dataObj[0].ret == '-3') {
        publicFun.alert('缺少配置文件中指定的迈瑞数据文件！')
        // _confirm('缺少配置文件中指定的迈瑞数据文件！', null, function () {
        // 	setReadOMLData();
        // });
      } else {
        publicFun.alert('监护仪数据读取失败，请联系管理员!');
      }
    },
    error: function (error) {
      publicFun.alert('监护仪数据读取失败，请重新登录或检查网络');
    }
  });
}