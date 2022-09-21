/**
 * 病情护理记录 新增 [从avalon => vue]
 * @date    2019/03/08
 * @author  yhl
 */
// var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
var sub = new Vue({
  el: '#nurseNoteMsg',
  mixins: [mixinNote],
  // 获取后台配置列表
  data: {
    notePatientMsg: {
      /// ///////////////////////////////////  hsphljldlnfCustom
      emgSeq: _emgSeq, // 预检号
      bqhiSeq: '', // 编号 YYYYMMDD+8位序列号
      tmpNbr: '', // 温度
      hrtRte: '', // 心率
      sbpUpNbr: '', // 收缩上压
      sbpDownNbr: '', // 收缩下压
      breNbr: '', // 呼吸
      xt: '', // 血糖
      senRctCod: '', // 意识
      jchl: [], // 基础护理（编码 关联 字典表）
      jchlStr: '', // 基础护理
      jchlQt: '', // 基础护理其他录入
      bqgc: '', // 病情观察、护理措施和效果
      hsUsrname: '', // 护士用户名
      sjhsUsrname: '', // 上级护士用户名
      xy: '', // 血氧
      xtFlg: '1',
      crtDat: '', // 创建时间
      tmpNbrFlg: '1', // 体温标识
      breNbrFlg: '1', // 呼吸标识
      sbpNbrFlg: '1', // 血压标识
      xyFlg: '1', // 血氧标识,
      rssj: '',
      xtCod: '',
      pulse: '', // 脉搏
      tkLeftCod: [],
      tkLeft: '',
      tkLeftOther: '',
      tkRightCod: [],
      tkRight: '',
      tkRightOther: '',
      cvp:'',
      pulseFlg:'',
      hrtRteFlg:''
    },
    aboutSco: {
      bradenSeq: '',
      fallriskSeq: '',
      adlSeq: '',
      zcddexpfSco: '',
      bradenSco: null,
      fallriskSco: null,
      adlSco: null,
      nrsSco: null,
      nrsSeq: '',
      ttpfNr: null, // 疼痛内容
      ttpfTypeCod: null, // 疼痛类型
      zyfxpfSeq: '',
      zyfxpfSco: null, // 转运风险评分
      gcsSco: null,
      gcsSeq: '',
      morseSco: null,
      ddfxpgbSeq: ''
    }
  },
  created: function () {
    this.getMsgList() // 获取数字字典数据
  }
})
