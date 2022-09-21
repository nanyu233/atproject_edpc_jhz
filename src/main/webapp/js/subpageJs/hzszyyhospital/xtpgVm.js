var adlhlList = [{ infocode: "0", infoid: "A", info: ["（1）重症患者，意识、生命体征发生变化，或可能有变化，需要密切监测者（检测时间间隔少于或等于一小时）", "（2）多项治疗或检测、护理活动频繁，每小时均需护理服务者", "（3）开刀、特殊治疗、检测前、后需密切观察，预防变化者", "（4）精神状态严重障碍"], checked: false },
{ infocode: "1", infoid: "B", info: ["（1）意识、生命征象，须1-2小时注意其变化", "（2）多项治疗或检测、护理活动，每1-2小时需要护理服务者", "（3）精神状态不稳定者"], checked: false },
{ infocode: "2", infoid: "C", info: ["（1）意识状态、生命征象，观察间隔大于2小时者", "（2）治疗或检查、护理活动，2小时以上需要护理服务者"], checked: false }
];
var adlJsList = [{ checked: false, infocode: '10', info: '自理', infoid: '1' }, { checked: false, infocode: '5', info: '稍依赖', infoid: '2' }, { checked: false, infocode: '0', info: '较大依赖', infoid: '3' }, { checked: false, infocode: '0', info: '完全依赖', infoid: '4' }],
  adlXizList = [{ checked: false, infocode: '5', info: '自理', infoid: '1' }, { checked: false, infocode: '0', info: '稍依赖', infoid: '2' }, { checked: false, infocode: '0', info: '较大依赖', infoid: '3' }, { checked: false, infocode: '0', info: '完全依赖', infoid: '4' }],
  adlCyzyList = [{ checked: false, infocode: '15', info: '自理', infoid: '1' }, { checked: false, infocode: '10', info: '稍依赖', infoid: '2' }, { checked: false, infocode: '5', info: '较大依赖', infoid: '3' }, { checked: false, infocode: '0', info: '完全依赖', infoid: '4' }],
  sightList = [{ checked: false, infocode: '0', info: '圆' }, { checked: false, infocode: '1', info: '不规则' }, { checked: false, infocode: '2', info: '白内障' }, { checked: false, infocode: '3', info: '眼球缺失' }],
  breathList = [{ checked: false, infocode: '0', info: '休息时' }, { checked: false, infocode: '1', info: '活动时' }],
  mxxgList = [{ checked: false, infocode: '0', info: '<5s' }, { checked: false, infocode: '1', info: '>5s' }],
  fzList = [{ checked: false, infocode: '2', info: '无' },{ checked: false, infocode: '0', info: '全部' }, { checked: false, infocode: '1', info: '局部' }],
  ytList = [{ checked: false, infocode: '0', info: '软' }, { checked: false, infocode: '1', info: '硬' }],
  wzjmList = [{ checked: false, infocode: '1', info: '是' }, { checked: false, infocode: '0', info: '否' }],
  grList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }],
  sfList = [{ checked: false, infocode: '1', info: '是' }, { checked: false, infocode: '0', info: '否' }];

var dangerPart1fzList = [{ checked: false, infocode: '0', info: '完全瘫痪或完全行动障碍的患者，给与低跌倒风险的安全干预措施。', infoid: '1' },
{ checked: false, infocode: '14', info: '住院前6个月内2次及以上的跌倒经历的患者，在住院治疗期间按跌倒高风险患者给与安全干预措施。', infoid: '2' },
{ checked: false, infocode: '14', info: '此次住院期间患者有跌倒经历的，按跌倒高风险患者给与安全干预措施。', infoid: '3' },
{ checked: false, infocode: '14', info: '医院制度规定的特定患者为高跌倒风险患者（ICU、ICU1、EICU、抢救室、手术室的患者），即按跌倒高风险患者给予安全干预措施。', infoid: '4' }],
  ageList = [{ checked: false, infocode: '1', info: '60-69岁' }, { checked: false, infocode: '2', info: '70-79岁' }, { checked: false, infocode: '3', info: '>=80岁' }],
  fallHistoryList = [{ checked: false, infocode: '5', info: '最近6个月曾有不明原因跌倒经历' }],
  urineList = [{ checked: false, infocode: '2', info: '失禁', infoid: '1' }, { checked: false, infocode: '2', info: '频繁或紧迫的排泄', infoid: '2' }, { checked: false, infocode: '4', info: '失禁且频繁/紧迫的排泄', infoid: '3' }],
  useDrugsList = [{ checked: false, infocode: '3', info: '患者使用一种高跌倒风险的药物' }, { checked: false, infocode: '5', info: '患者使用2种或2种以上的高跌倒风险的药物' }, { checked: false, infocode: '7', info: '患者在过去的24小时内曾有手术镇静史' }],
  nursingList = [{ checked: false, infocode: '1', info: '患者携带1种护理装置' }, { checked: false, infocode: '2', info: '患者携带2种护理装置' }, { checked: false, infocode: '3', info: '患者携带3种或以上的护理装置' }],
  abilityList = [{ checked: false, infocode: '1', info: '患者移动、转运或行走时需要辅助或监督', infoid: '1' }, { checked: false, infocode: '2', info: '患者步态不稳定', infoid: '2' }, { checked: false, infocode: '2', info: '患者因视觉或听觉障碍而影响移动', infoid: '3' }],
  cognitiveList = [{ checked: false, infocode: '1', info: '患者定向力障碍' }, { checked: false, infocode: '2', info: '烦躁' }, { checked: false, infocode: '4', info: '认知限制或障碍' }, { checked: false, infocode: '0', info: '无' }];
otherList = [{ checked: false, infocode: '0', info: '以上条目均不符合' }];

var ageList = [{ checked: false, infocode: '4', info: '>1岁~<=3岁' }, { checked: false, infocode: '3', info: '>3岁~<=7岁' }, { checked: false, infocode: '2', info: '>7岁~<=13岁' }, { checked: false, infocode: '1', info: '>13岁' }],
  sexList = [{ checked: false, infocode: '2', info: '男' }, { checked: false, infocode: '1', info: '女' }],
  diagnosisList = [{ checked: false, infocode: '4', info: '神经系统疾病；骨骼、关节系统疾病；眼科疾病' },
  { checked: false, infocode: '3', info: '氧合功能改变（呼吸系统疾病、心血管系统疾病、脱水、贫血、厌食、昏厥、头晕等）；点机制紊乱' },
  { checked: false, infocode: '2', info: '心理/行为疾病' },
  { checked: false, infocode: '1', info: '其他疾病；疾病导致不能活动或移动' },],
  recognizeList = [{ checked: false, infocode: '3', info: '没有意识到不能自我行动' }, { checked: false, infocode: '2', info: '忘记有行动的限制' }, { checked: false, infocode: '1', info: '能自我分辨方位；昏迷，无反应' }],
  enviromentList = [{ checked: false, infocode: '4', info: '住院期间有跌倒坠床史；患儿活动或移动时需使用辅助攻击（拐杖、助行器、转运床、轮椅等）；婴幼儿放置在无护栏的成人床' },
  { checked: false, infocode: '3', info: '近1个月有跌倒坠床史；婴幼儿放置在有护栏的成人床' },
  { checked: false, infocode: '2', info: '近3个月有跌倒坠床史；婴幼儿放置在有护栏的婴儿床' },
  { checked: false, infocode: '1', info: '>3个月有跌倒坠床史/无跌倒坠床史；患儿安置在合适的床上' }],
  anaesthesiaList = [{ checked: false, infocode: '3', info: '12小时内' }, { checked: false, infocode: '2', info: '24小时内' }, { checked: false, infocode: '1', info: '超过24小时/没有' }],
  druguseList = [{ checked: false, infocode: '3', info: '联合用药：镇静剂、安眠药、巴比妥类药、吩噻嗪类药、抗抑郁药、利尿剂、降压药、强心药、麻醉药、化疗药、散瞳剂' },
  { checked: false, infocode: '2', info: '以上其中一种药物' }, { checked: false, infocode: '1', info: '其他药物/没有' }],
  ycList = [{checked: false, infocode: '1', info: '无明显异常'},{checked: false, infocode: '2', info: '异常'}];

var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
var slideBarWrapper;
sourceType = 'page'; // 滑动条公用字段
var _actList = ['faceMs', 'relax', 'muscle', 'voice', 'clam'],
  _nrsActList = ['oTFace', 'oTBody', 'oTMuscle', 'oTBreath', 'oTVoice'];
var vm = avalon.define({
  $id: 'queryxtpg',
  //获取后台配置列表
  getMsg: {
    numList: [{ info: '0', isAct: false, valText: '0' }, { info: '1', isAct: false, valText: '1' }, { info: '2', isAct: false, valText: '2' }, { info: '3', isAct: false, valText: '3' },
    { info: '4', isAct: false, valText: '4' }, { info: '5', isAct: false, valText: '5' }, { info: '6', isAct: false, valText: '6' }, { info: '7', isAct: false, valText: '7' },
    { info: '8', isAct: false, valText: '8' }, { info: '9', isAct: false, valText: '9' }, { info: '10', isAct: false, valText: '10' }],
    lanList: [{ info: '0 无痛', isAct: false, valText: '0' }, { info: '2 微痛', isAct: false, valText: '2' }, { info: '4 中度疼痛', isAct: false, valText: '4' }, { info: '6 中重疼痛', isAct: false, valText: '6' },
    { info: '8 重度疼痛', isAct: false, valText: '8' }, { info: '10 想象中最剧烈疼痛', isAct: false, valText: '10' }],
    faceMsList: [{ info: '放松', infocode: '0' }, { info: '扭曲', infocode: '1' }, { info: '咬牙', infocode: '2' }],
    relaxList: [{ info: '安静', infocode: '0' }, { info: '休息不好', infocode: '1' }, { info: '经常休息不好', infocode: '2' }],
    muscleList: [{ info: '放松', infocode: '0' }, { info: '屈曲', infocode: '1' }, { info: '僵硬', infocode: '2' }],
    voiceList: [{ info: '无异常', infocode: '0' }, { info: '偶尔发声', infocode: '1' }, { info: '频繁', infocode: '2' }],
    clamList: [{ info: '放松', infocode: '0' }, { info: '通过谈话', infocode: '1' }, { info: '很难安抚', infocode: '2' }],
    oTFaceList: [{ info: '未观察到', infocode: '0' }, { info: '肌肉收缩', infocode: '1' }, { info: '紧紧闭合', infocode: '2' }],
    oTBodyList: [{ info: '不动', infocode: '0' }, { info: '缓慢', infocode: '1' }, { info: '拉拽', infocode: '2' }],
    oTMuscleList: [{ info: '不抵抗', infocode: '0' }, { info: '被动运动', infocode: '1' }, { info: '剧烈运动', infocode: '2' }],
    oTBreathList: [{ info: '无警报', infocode: '0' }, { info: '自动停止', infocode: '1' }, { info: '不同步', infocode: '2' }],
    oTVoiceList: [{ info: '不发声', infocode: '0' }, { info: '呻吟', infocode: '1' }, { info: '发声', infocode: '2' }]
  },
  systemList: {
    xtpgAqcsCodList: [],
    xtpgSxList: [],
    xtpgStList: [],
    xtpgMxList: [],
    xtpgBmList: [],
    ////////////////////////////////////////////Braden评分
    bradenGjCodList: [], //感觉
    bradenCsCodList: [], //潮湿
    bradenHdnlCodList: [], //活动能力
    bradenYdnlCodList: [], //移动能力
    bradenYyCodList: [], //营养
    bradenMchjqlCodList: [], //摩擦和剪切力
    ////////////////////////////////////////////ADL评分
    adlHlylcdList: adlhlList, //护理依赖程度|A.B.C
    adlJsScoList: adlJsList, //进食
    adlXizScoList: adlXizList, //洗澡
    adlXsScoList: adlXizList, //修饰（洗脸、梳头、刷牙、刮脸）
    adlCyScoList: adlJsList, //穿衣（包括系带）
    adlKzdbScoList: adlJsList, //控制大便
    adlKzxbScoList: adlJsList, //控制小便
    adlScsScoList: adlJsList, //上厕所
    adlCyzyScoList: adlCyzyList, //床椅转移
    adlXingzScoList: adlCyzyList, //行走（平底45M）
    adlSxltScoList: adlJsList, //上下楼梯（用手杖也算独立）
    ///////////////////////////////////////////nrs评分
    nrsTtbwList: [], //疼痛部位
    nrsTtxzList: [], //疼痛性质
    nrsTtsjList: [], //疼痛时间
    nrsTtkzList: [], //疼痛控制
    ///////////////////////////////////////////神经系统
    sjxtpgYsCodList: [], //意识
    sjxtpgYssubCodList: [], //意识子项
    sjxtpgYyCodList: [], //语言
    leftTbDgfyList: [], //瞳孔左对光反应
    rightTbDgfyList: [], //瞳孔右对光反应
    leftsJzSzCodList: [], //肌力左上肢
    rightsJzSzCodList: [], //肌力右上肢
    leftxJzSzCodList: [], //肌力左下肢
    rightxJzSzCodList: [], //肌力右下肢
    leftsSjJzlList: [], //肌张力左上肢
    rightsSjJzlList: [], //肌张力右上肢
    leftxSjJzlList: [], //肌张力左下肢
    rightxSjJzlList: [], //肌张力右下肢
    tkLefttkZtCodList: sightList, //瞳孔左状态
    tkRighttkZtCodList: sightList, //瞳孔右状态

    xtpgSjFlgList: ycList,
    ///////////////////////////////////////////呼吸系统
    hxxtpgKsCodList: [], //咳嗽
    hxxtpgTxxzCodList: [], //痰液性状
    hxxtpgTlCodList: [], //痰量
    hxxtpgGyfsCodList: [], //给氧方式
    hxxtpgHxjcList: breathList, //呼吸急促(0,休息时；1,活动时)
    leftHxxtpgHxyCodList: [], //呼吸音左
    rightHxxtpgHxyCodList: [], //呼吸音右

    xtpgHxFlgList: ycList,
    ///////////////////////////////////////////心血管系统评估 
    xxgxtpgXlZtCodList: [], //心律
    zzXxgxtpgBdmbdCodList: [], //左足背动脉搏动
    yzXxgxtpgBdmbdCodList: [], //右足背动脉搏动
    zrXxgxtpgBdmbdCodList: [], //左桡动脉搏动
    yrXxgxtpgBdmbdCodList: [], //右桡动脉搏动
    xxgxtpgMxxgcyList: mxxgList, //毛细血管充盈(0：<5s 1：>5s)

    xtpgXxgFlgList: ycList,
    ///////////////////////////////////////////消化系统评估 
    xhxtpgYsCodList: [], //饮食
    xhxtpgSyCodList: [], //食欲
    xhxtpgFbpzList: fzList, //腹部膨隆(0：全部 1：局部)
    xhxtpgFbcgList: ytList, //腹部触感(0：软 1：硬)
    xhxtpgFzCodList: [], //腹胀
    xhxtpgFbytCodList: [], //腹部压痛
    xhxtpgCmyCodList: [], //肠鸣音
    xhxtpgPbCodList: [], //排便

    xtpgXhFlgList: ycList,
    ///////////////////////////////////////////泌尿生殖系统评估   
    mnszxtpgPnCodList: [], //排尿
    mnszxtpgNyxzCodList: [], //尿液性质
    mnszxtpgTxCodList: [], //透析
    mnszxtpgDjmwCodList: [], //动静脉瘘
    mnszxtpgRsztCodList: [], //妊娠状态
    mnszxtpgYjCodList: [], //月经
    mnszxtpgBdCodList: [], //白带

    xtpgMnFlgList: ycList,
    ///////////////////////////////////////////骨骼、肌、皮肤系统 
    ggjpfxtPfysCodList: [], //皮肤颜色
    ggjpfxtPfwdCodList: [], //皮肤温度
    ggjpfxtSzfwCodList: [], //水肿范围
    ggjpfxtSzxzCodList: [], //水肿性质
    ggjpfxtSzcdCodList: [], //水肿程度
    ggjpfxtBttCodList: [], //扁桃体
    ggjpfxtKqnmCodList: [], //口腔粘膜
    ggjpfxtZknmCodList: [], //造口粘膜
    ggjpfxtSkbwCodList: [], //伤口部位
    ggjpfxtSkCodList: [], //伤口
    ggjpfxtGdCodList: [], //固定
    ggjpfxtHdfsCodList: [], //活动方式
    ggjpfxtKqyCodList: [], //口腔炎

    xtpgGgFlgList: ycList,
    ///////////////////////////////心理社会评估表
    xlshpgJsztCodList: [], //精神状态

    xtpgXlFlgList: ycList,
    ///////////////////////////////////////////导管评估
    wzjmTcFlgList: wzjmList, //外周静脉通畅(0：否 1：是 2:固定妥，局部无红肿，无渗出)
    wzjmGrjxFlgList: grList, //外周静脉感染迹象
    wzjmSfbgFlgList: sfList, //外周静脉是否拔管
    cvcDgpgCctjCodList: [], //CVC穿刺途径
    cvcDgxhCodList: [], //CVC导管型号
    cvcGrjxFlgList: grList, //CVC感染迹象(0：无 1：有)
    cvcHyFlgList: grList, //CVC换药(0：无 1：有)
    piccDgxhList: [], //PICC导管型号
    sygDgpgCctjCodList: [], //输液港穿刺途径
    sygCctjTcFlgList: sfList, //输液港通畅(0：否 1：是)
    sygGrjxFlgList: grList, //输液港感染迹象(0：无 1：有)
    sygDxzccFlgList: grList, //输液港蝶形针穿刺(0：无 1：有)
    sygBdxzFlgList: grList, //输液港是否拔蝶形针(0：无 1：有)
    ylgDgmcCodList: [], //引流管导管名称
    ylgTcFlgList: sfList, //引流管通畅(0：否 1：是)
    ylgGrjxFlgList: grList, //引流管感染迹象(0：无 1：有)
    ylgTcFlgAList: sfList, //引流管通畅(0：否 1：是)
    qtGrjxFlgList: grList, //其他管感染迹象(0：无 1：有)
    ylgBgFlgList: sfList, //引流管拔管(0：否 1：是)
    qtBgFlgList: sfList, //引流管拔管(0：否 1：是)
    sjxtpgYssubCodbList: [],
    /////////////////////////////////////////Morse评分
    jsgyywddCodList: [], 
    dyygjbpdCodList: [], 
    xzfzCodList: [], 
    jmzlsyddgfxyCodList: [], 
    btCodList: [], 
    rznlCodList: [],
    hlcsCodList:[{ checked: false, infocode: '0', info: '提供足够的灯光，清除病房、床旁及通道障碍' }, 
    { checked: false, infocode: '1', info: '保持病区地面清洁干燥，告知卫生间防滑措施' },
    { checked: false, infocode: '2', info: '将日常物品放于患者易取处' },
    { checked: false, infocode: '3', info: '教会患者使用床头灯及呼叫器，放于可及处，高危患者' },
    { checked: false, infocode: '4', info: '指导患者渐进坐起、渐进下床的方法' },
    { checked: false, infocode: '5', info: '专人陪护，患者活动时有人陪伴' },
    { checked: false, infocode: '6', info: '穿舒适的鞋及衣裤' },
    { checked: false, infocode: '7', info: '将两侧床挡全部抬起，加强对患者夜间巡视' }]
  },
  systemtMsg: {
    emgSeq: _emgSeq, //预检号
    cstNam: '', // 姓名
    vstCad: '', // 卡号
    cstSexCod: '', // 性别
    cstAge: '', // 年龄
    cstAgeCod: '', // 年龄
    crtDat: today,
    xtpgHs: _crtNameNew, //护士
    xtpgSjhs: '', //上级护士
    bedFlg: 0,
    ageFlg: 0,
    xtpgJlhz: '',
    xtpgHsNam: '', //护士
    xtpgSjhsNam: '', //上级护士
    ////////////////////////////////hspXtpgInfCustom
    xtpgSeq: '', //系统评估号 
    emgSeq: '', //预检号
    xtpgSx: '', //舌象
    xtpgSt: '', //舌苔
    xtpgMx: '', //脉象
    xtpgBm: '', //病脉
    xtpgAqcsCod: [], //安全措施
    //xtpgJlhz: '',
    ///////////////////////////////hspNrsInfCustom
    nrsTtbw: [], //疼痛部位
    nrsTtbwQt: '', //疼痛部位其他
    nrsTtxz: [], //疼痛性质
    nrsTtxzQt: '', //疼痛性质其他
    nrsTtsj: '', //疼痛时间
    nrsTtkz: [], //疼痛控制
    // nrsSco: null, //疼痛评分
    nrsMemo: '', //备注
    // 新版本 6大nrs 评分
    ttpfTypeCod: '', // 疼痛评分类型
    ttpfNr: '', // 疼痛评分内容
    nrsSco: null, // 疼痛评分最终得分
    faceNrsSco: null,
    faceMs: [],
    relax: [],
    muscle: [],
    voice: [],
    clam: [],
    oTFace: [],
    oTBody: [],
    oTMuscle: [],
    oTBreath: [],
    oTVoice: [],
    flaccList: [{ type: 'faceMs', checkVal: [] }, { type: 'relax', checkVal: [] }, { type: 'muscle', checkVal: [] }, { type: 'voice', checkVal: [] }, { type: 'clam', checkVal: [] }],
    copptList: [{ type: 'oTFace', checkVal: [] }, { type: 'oTBody', checkVal: [] }, { type: 'oTMuscle', checkVal: [] }, { type: 'oTBreath', checkVal: [] }, { type: 'oTVoice', checkVal: [] }],

    // nrsSco: null, //疼痛评分
    // nrsMemo: '', //备注
    nrsFlag: '0', //是否编辑
    nrsMsg: '编辑',
    nrsAssessFlag: '0', //是否编辑
    nrsAssessMsg: '编辑',
    nrsFlg: '',
    nrsscoFlg: '',
    ///////////////////////////////hspSjxtpgInfCustom
    nurAssessFlag: '0', //是否编辑
    nurAssessMsg: '编辑',
    sjxtpgYsCod: [], //意识
    sjxtpgYssubCod: '', //意识子项
    sjxtpgYssubCodb: '', //意识子项
    sjxtpgYyCod: [], //语言
    tkLefttkZj: '', //瞳孔左直径
    tkLefttkZtCod: '', //瞳孔左状态
    leftTbDgfy: '', //瞳孔左对光反应
    tkRighttkZj: '', //瞳孔右直径
    tkRighttkZtCod: '', //瞳孔右状态
    rightTbDgfy: '', //瞳孔右对光反应
    leftsJzSzCod: [], //肌力左上肢
    rightsJzSzCod: [], //肌力右上肢
    leftxJzSzCod: [], //肌力左下肢
    rightxJzSzCod: [], //肌力右下肢
    leftsSjJzl: '', //肌张力左上肢
    rightsSjJzl: '', //肌张力右上肢
    leftxSjJzl: '', //肌张力左下肢
    rightxSjJzl: '', //肌张力右下肢
    sjxtpgMemo: '', //备注
    sjxtFlg: '',
    showselect0: false,
    showselect1: false,
    
    xtpgSjFlg: '',
    ///////////////////////////////hspHxxtpgInfCustom
    hxxtpgKsCod: '', //咳嗽
    hxxtpgKsQt: '', //咳嗽其他
    hxxtpgTxxzCod: '', //痰液性状
    hxxtpgTxxzQt: '', //痰液性状其他
    hxxtpgTlCod: '', //痰量
    hxxtpgGyfsCod: '', //给氧方式
    hxxtpgGyll: '', //给氧流量(L/分)
    hxxtpgYnd: '', //氧浓度(﹪)
    hxxtpgYbhd: '', //氧饱和度(﹪)
    hxxtpgHxjc: '', //呼吸急促(0,休息时；1,活动时)
    leftHxxtpgHxyCod: [], //呼吸音左
    rightHxxtpgHxyCod: [], //呼吸音右
    qgqkFlg: '', //气管切开(0：无 1：有)
    qgqkQqtgxh: '', //气切套管型号
    qgqkQgcgFlg: '', //气管插管畅(0：无 1：有)
    qgqkXdgdsj: '', //系带固定松紧(横指)
    qgqkQnyl: '', //气囊压力(cmH2O)
    qgqkQgqkchyFlg: '', //气管切开处换药(0：无 1：有)
    qgqkQgqkbz: '', //气管切开备注
    qgcgFlg: '', //气管插管(0：无 1：有)
    qgcgQgdgxh: '', //气管导管型号
    qgcgQgcg: '', //气管插管畅(0：无 1：有)
    qgcgGdt: '', //固定妥(0：无 1：有)
    qgcgJmc: '', //距门齿(cm)
    hxgnxlFlg: '', //呼吸功能训练(0：无 1：有)
    hxxtpgMemo: '', //备注
    hxxtFlg: '',
    BreathAssessFlag: '0', //是否编辑
    BreathAssessMsg: '编辑',

    xtpgHxFlg: '',
    ///////////////////////////////hspXxgxtpgInfCustom
    xxgxtpgXdjhFlg: '', //心电监护(0：无 1：有)
    xxgxtpgXlCs: '', //心率
    xxgxtpgXlZtCod: '', //心律
    xxgxtpgXmFlg: '', //胸闷(0：无 1：有)
    xxgxtpgXtFlg: '', //胸痛(0：无 1：有)
    xxgxtpgXjFlg: '', //心悸(0：无 1：有)
    zzXxgxtpgBdmbdCod: '', //左足背动脉搏动
    yzXxgxtpgBdmbdCod: '', //右足背动脉搏动
    zrXxgxtpgBdmbdCod: '', //左桡动脉搏动
    yrXxgxtpgBdmbdCod: '', //右桡动脉搏动
    xxgxtpgMxxgcy: '', //毛细血管充盈(0：<5s 1：>5s)
    xxgxtpgMemo: '', //备注
    xxgxtFlg: '',
    XinxgAssessFlag: '0', //是否编辑
    XinxgAssessMsg: '编辑',

    xtpgXxgFlg: '',
    ///////////////////////////////hspXhxtpgInfCustom
    xhxtpgYsCod: '', //饮食
    xhxtpgSyCod: '', //食欲
    xhxtpgExFlg: '', //恶心(0：无 1：有)
    xhxtpgOtFlg: '', //呕吐(0：无 1：有)
    xhxtpgOtYs: '', //呕吐颜色
    xhxtpgOtL: '', //呕吐量
    xhxtpgFbpz: '', //腹部膨隆(0：全部 1：局部)
    xhxtpgFbcg: '', //腹部触感(0：软 1：硬)
    xhxtpgFzCod: '', //腹胀
    xhxtpgFbytCod: [], //腹部压痛
    xhxtpgFbfttFlg: '', //腹部反跳痛(0：无 1：有)
    xhxtpgCmyCod: '', //肠鸣音
    xhxtpgPbCod: '', //排便
    xhxtpgFqcxFlg: '', //腹腔冲洗(0：无 1：有)
    xhxtpgFw: '', //腹围
    xhxtpgTpnds: '', //TPN滴速
    xhxtpgPpnds: '', //PPN滴速
    xhxtpgMemo: '', //备注
    xhxtFlg: '',
    DigestAssessFlag: '0', //是否编辑
    DigestAssessMsg: '编辑',

    xtpgXhFlg:'',
    ///////////////////////////////hspMnszxtpgInfCustom
    mnszxtpgPnCod: [], //排尿
    mnszxtpgNyxzCod: '', //尿液性质
    mnszxtpgPgcxFlg: '', //膀胱冲洗
    mnszxtpgTxCod: '', //透析
    mnszxtpgDjmwCod: [], //动静脉瘘
    mnszxtpgRsztCod: [], //妊娠状态
    mnszxtpgYjCod: [], //月经
    mnszxtpgBdCod: [], //白带
    mnszxtpgBdQt: '', //白带其他
    mnszxtpgMeno: '', //备注
    mnszxtFlg: '',
    mxszAssessFlag: '0', //是否编辑
    mxszAssessMsg: '编辑',

    xtpgMnFlg:'',
    ///////////////////////////////hspGgjpfxtInfCustom
    ggjpfxtPfysCod: [], //皮肤颜色
    ggjpfxtPfwdCod: '', //皮肤温度
    ggjpfxtPfwdQt:'',//皮肤温度其他
    ggjpfxtSzfwCod: [], //水肿范围
    ggjpfxtSzfwQt: '', //水肿范围其他
    ggjpfxtSzxzCod: '', //水肿性质
    ggjpfxtSzcdCod: '', //水肿程度
    ggjpfxtBttCod: '', //扁桃体
    ggjpfxtKqnmCod: '', //口腔粘膜
    ggjpfxtZknmCod: '', //造口粘膜
    ggjpfxtBhFlg: '', //疤痕(0：无 1：有)
    ggjpfxtSkbwCod: [], //伤口部位
    ggjpfxtSkbwQt: '', //伤口部位其他
    ggjpfxtSkCod: '', //伤口
    ggjpfxtYc: '', //压疮
    ggjpfxtJzFlg: '', //假肢(0：无 1：有)
    ggjpfxtGdCod: '', //固定
    ggjpfxtGdQt: '', //固定其他
    ggjpfxtHdfsCod: '', //活动方式
    ggjpfxtHdfsQt: '', //活动方式其他
    ggjpfxtKqyCod: '', //口腔炎
    ggjpfxtMemo: '', //备注
    GgjpfxtFlg: '',
    skinAssessFlag: '0', //是否编辑
    skinAssessMsg: '编辑',

    xtpgGgFlg:'',
    ///////////////////////////////hspXlshpgInfCustom
    xlshpgJsztCod: [], //精神状态
    xlshpgJsztQt: '', //精神状态其他
    xlshpgMemo: '', //备注
    xlshpgFlg: '',
    psychosocialAssessFlag: '0', //是否编辑
    psychosocialAssessMsg: '编辑',

    xtpgXlFlg:'',
    ///////////////////////////////hspDgpgInfCustom
    dgpgJmdgFlg: '', //静脉导管(0：无 1：有)
    wzjmTcFlg: '', //外周静脉通畅(0：否 1：是 2:固定妥，局部无红肿，无渗出)
    wzjmJwbyy: '', //外周静脉接微泵用药
    wzjmSd: '', //外周静脉速度
    wzjmGrjxFlg: '', //外周静脉感染迹象
    wzjmSfbgFlg: '', //外周静脉是否拔管
    wzjmMemo: '', //外周静脉备注
    cvcDgpgCctjCod: '', //CVC穿刺途径
    cvcDgxhCod: '', //CVC导管型号
    cvcZgsd: '', //CVC置管深度
    cvcJwbyy: '', //CVC接微泵用药
    cvcJwbyySd: '', //CVC速度
    cvcGrjxFlg: '', //CVC感染迹象(0：无 1：有)
    cvcHyFlg: '', //CVC换药(0：无 1：有)
    cvcMemo: '', //CVC备注
    piccDgxh: '', //PICC导管型号
    piccDgxhNz: '', //PICC内置
    piccDgxhWz: '', //PICC外置
    sygDgpgCctjCod: '', //输液港穿刺途径
    sygCctjTcFlg: '', //输液港通畅(0：否 1：是)
    sygJwbyy: '', //输液港接泵微用药
    sygSd: '', //输液港速度
    sygGrjxFlg: '', //输液港感染迹象(0：无 1：有)
    sygDxzccFlg: '', //输液港蝶形针穿刺(0：无 1：有)
    sygBdxzFlg: '', //输液港是否拔蝶形针(0：无 1：有)
    sygQt: '', //输液港其他
    dgpgYlgFlg: '', //引流管(0：无 1：有)
    ylgDgmcCod: '', //引流管导管名称
    ylgDgsd: '', //引流管导管深度
    ylgTcFlg: '', //引流管通畅(0：否 1：是)
    ylgYlyys: '', //引流管引流液颜色
    ylgGrjxFlg: '', //引流管感染迹象(0：无 1：有)
    ylgBgFlg: '', //引流管拔管(0：否 1：是)
    dgpgMemo: '', //备注
    dgpgFlg: '',
    ductFlag: '0', //是否编辑
    ductMsg: '编辑',
    hideylgDgmcCod: '',
    wzjmGdt: '',

    xtpgDgFlg:'',
    dgpgQtFlg:'',
    qtGrjxFlg:'',
    qtBgFlg:'',
    ylgDgmcCodA: '', //引流管导管名称
    ylgDgsdA: '', //引流管导管深度
    ylgTcFlgA: '', //引流管通畅(0：否 1：是)
    ylgYlyysA: '', //引流管引流液颜色
  },
  aboutbraden: {
    bradenGjCod: '', //感觉
    bradenCsCod: '', //潮湿
    bradenHdnlCod: '', //活动能力
    bradenYdnlCod: '', //移动能力
    bradenYyCod: '', //营养
    bradenMchjqlCod: '', //摩擦和剪切力
    bradenSco: null, //总分
    memo: '', //备注
    bradenFlag: '0', //是否编辑
    bradenMsg: '编辑',
    bradenFlg: ''
  },
  aboutzcdd: {
    zcddexpfYnbmdd: '', //最近1年不明原因跌倒
    zcddexpfYsza: '', //意识障碍 
    zcddexpfSlza: '', //视力障碍（单盲、双盲、弱视、白内障、青光眼、眼底病、复视）
    zcddexpfHdza: '', //活动障碍、肢体偏瘫
    zcddexpfNl: '', //年龄（>65岁）
    zcddexpfTnxr: '', //体能虚弱（生活能力部分自理，白天过半时间要卧床或坐椅）
    zcddexpfTyxy: '', //头晕、眩晕、体位性低血压
    zcddexpfZyywjr: '', //服用影响意识和活动的药物（散瞳剂、镇静安眠药、降糖药、降压利尿剂、阵挛抗癫剂、麻醉止痛剂）
    zcddexpfJrpb: '', //住院中无家人和其他人员陪伴
    zcddexpfMy: '', //无
    zcddexpfSco: null, //总分
    zcddexpfMemo: '', //备注
    zcddFlag: '0', //是否编辑
    zcddMsg: '编辑',
    zcddFlg: '',
    zcddexpfYnbmddnum: 0, //最近1年不明原因跌倒
    zcddexpfYszanum: 0, //意识障碍 
    zcddexpfSlzanum: 0, //视力障碍（单盲、双盲、弱视、白内障、青光眼、眼底病、复视）
    zcddexpfHdzanum: 0, //活动障碍、肢体偏瘫
    zcddexpfNlnum: 0, //年龄（>65岁）
    zcddexpfTnxrnum: 0, //体能虚弱（生活能力部分自理，白天过半时间要卧床或坐椅）
    zcddexpfTyxynum: 0, //头晕、眩晕、体位性低血压
    zcddexpfZyywjrnum: 0, //服用影响意识和活动的药物（散瞳剂、镇静安眠药、降糖药、降压利尿剂、阵挛抗癫剂、麻醉止痛剂）
    zcddexpfJrpbnum: 0, //住院中无家人和其他人员陪伴
    zcddexpfMynum: 0 //无
  },
  aboutAdl: {
    adlHlylcd: '', //护理依赖程度|A.B.C
    adlJsSco: '', //进食
    adlJsScoNew: '',
    adlXizSco: '', //洗澡
    adlXizScoNew: '',
    adlXsSco: '', //修饰（洗脸、梳头、刷牙、刮脸）
    adlXsScoNew: '',
    adlCySco: '', //穿衣（包括系带）
    adlCyScoNew: '',
    adlKzdbSco: '', //控制大便
    adlKzdbScoNew: '',
    adlKzxbSco: '', //控制小便
    adlKzxbScoNew: '',
    adlScsSco: '', //上厕所分
    adlScsScoNew: '',
    adlCyzySco: '', //床椅转移
    adlCyzyScoNew: '',
    adlXingzSco: '', //行走（平底45M）
    adlXingzScoNew: '',
    adlSxltSco: '', //上下楼梯（用手杖也算独立）
    adlSxltScoNew: '',
    adlSco: null, //总分
    adlMemo: '', //备注
    adlFlag: '0', //是否编辑
    adlMsg: '编辑',
    aldFlg: ''
  },
  xtpghideMsg: {
    xtpgAqcsCod: '', //安全措施
    nrsTtbw: '', //疼痛部位
    nrsTtxz: '', //疼痛性质
    nrsTtkz: '', //疼痛控制
    xhxtpgFbytCod: '', //腹部压痛
    mnszxtpgPnCod: '', //排尿
    mnszxtpgDjmwCod: '', //动静脉瘘
    mnszxtpgRsztCod: '', //妊娠状态
    mnszxtpgYjCod: '', //月经
    mnszxtpgBdCod: '', //白带
    ggjpfxtPfysCod: '', //皮肤颜色
    ggjpfxtSzfwCod: '', //水肿范围
    sjxtpgYsCod: '', //意识
    sjxtpgYyCod: '', //语言
    ggjpfxtSkbwCod: '', //伤口部位
    xlshpgJsztCod: '', //精神状态
    leftsJzSzCod: '', //肌力左上肢
    rightsJzSzCod: '', //肌力右上肢
    leftxJzSzCod: '', //肌力左下肢
    rightxJzSzCod: '', //肌力右下肢
    leftHxxtpgHxyCod: '', //呼吸音左
    rightHxxtpgHxyCod: '', //呼吸音右

    hlcsCod:''
  },
  // 新版成人跌倒
  fallSystemList: {
    ////////////////////////////////////////////跌倒危险评分
    riskClassCodList: dangerPart1fzList, // 第一部分
    riskAgeoCodList: ageList, //年龄
    riskHisCodList: fallHistoryList, //跌倒史
    riskExcreteCodList: urineList, //排泄大便和小便
    riskDrugCodList: useDrugsList, //高跌倒风险
    riskMacCodList: nursingList,//患者护理装置
    riskActionCodList: abilityList,//活动能力
    riskOcognizeCodList: cognitiveList, // 认知
    riskOtherCodList: otherList
  },
  aboutFallDanger: {
    riskClassCod: [],//跌倒危险第一部分
    riskAgeoCod: '',//年龄
    riskHisCod: '', //跌倒史分值
    riskExcreteCod: '', //排泄大便和小便分值
    riskDrugCod: '', //高跌倒风险分值
    riskMacCod: '', //患者护理装置分值
    riskActionCod: [], //活动能力
    riskOcognizeCod: [], //认知
    riskOtherCod: '',
    riskSco: null, //总分
    duoxSco: null,//计算总分备用
    danxSco: null,//计算总分备用
    // memo: '', //备注
    riskAgeoCodnum: 0, //年龄
    riskHisCodnum: 0, //跌倒史分值
    riskExcreteCodnum: 0, //排泄大便和小便分值
    riskDrugCodnum: 0, //高跌倒风险分值
    riskMacCodnum: 0, //患者护理装置分值

    fallRiskFlg: '',
  },
  fallhideMsg: {
    riskClassCod: '',//跌倒危险第一部分
    riskActionCod: '',
    riskOcognizeCod: '',
    hiddenMsg: '',
  },
  // 儿童跌倒
  systemListC: {
    riskAgeyCodList: ageList,
    riskSexCodList: sexList,
    riskDiagnoseCodList: diagnosisList,
    riskYcognizeCodList: recognizeList,
    riskHjysCodList: enviromentList,
    riskZjmzhCodList: anaesthesiaList,
    riskDruguseCodList: druguseList,
  },
  aboutFallDangerC: {
    riskAgeyCod: '',
    riskSexCod: '',
    riskDiagnoseCod: '',
    riskYcognizeCod: '',
    riskHjysCod: '',
    riskZjmzhCod: '',
    riskDruguseCod: '',
    riskSco: null, //总分
    ageFlg: '',
    fallRiskFlg: '',
  },
  aboutmorse: {
    jsgyywddCod: '', 
    dyygjbpdCod: '', 
    xzfzCod: '', 
    jmzlsyddgfxyCod: '', 
    btCod: '',
    rznlCod: '', 
    hlcsCod:[],
    zf: null, //总分
    morseFlg:'',
    morseFlag: '0', //是否编辑
    morseMsg: '编辑',
    MorseQk:'',
  },
  ObjradioclickC: function (name, idx, objName) {
    var list = [];
    list = vm.systemListC[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      vm[objName][name] = list[idx]['infocode'];
      vm[objName][name + 'num'] = (list[idx]['infocode']);
    } else {
      vm[objName][name] = '';
      vm[objName][name + 'num'] = 0;
    }
    if (objName == 'aboutFallDangerC') {
      var _obj = vm.aboutFallDangerC, totalFallVal;
      totalFallVal = (_obj.riskAgeyCod - 0) + (_obj.riskSexCod - 0) + (_obj.riskDiagnoseCod - 0) + (_obj.riskYcognizeCod - 0) + (_obj.riskHjysCod - 0) + (_obj.riskZjmzhCod - 0) + (_obj.riskDruguseCod - 0);
      if (totalFallVal > 0) {
        vm.aboutFallDangerC.riskSco = totalFallVal
      } else {
        vm.aboutFallDangerC.riskSco = null
      }
    }
  },

  //全部清除
  clearAll: function () {
    var clearList = ['riskAgeoCod', 'riskHisCod', 'riskExcreteCod', 'riskDrugCod', 'riskMacCod'],
      duoList = ['riskClassCod', 'riskActionCod', 'riskOcognizeCod'];

    $.each(clearList, function (key, val) {
      if (vm.aboutFallDanger.hasOwnProperty(val)) {
        vm.aboutFallDanger[val] = '';
        vm.aboutFallDanger[val + 'num'] = 0
      }
      if (vm.fallSystemList.hasOwnProperty(val + 'List')) {
        $.each(vm.fallSystemList[val + 'List'], function (idx, valu) {
          valu['checked'] = false
        })
      }
    })

    $.each(duoList, function (key, val) {
      if (vm.fallhideMsg.hasOwnProperty(val)) {
        vm.fallhideMsg[val] = '';
        vm.aboutFallDanger[val] = [];
      }
      if (vm.fallSystemList.hasOwnProperty(val + 'List')) {
        $.each(vm.fallSystemList[val + 'List'], function (idx, valu) {
          valu['checked'] = false
        })
      }
    })
    vm.aboutFallDanger['duoxSco'] = 0;
    vm.aboutFallDanger['riskOtherCod'] = '0';
    vm.fallSystemList.riskOtherCodList[0]['checked'] = true;
    vm.aboutFallDanger['danxSco'] = 0;
    vm.aboutFallDanger['riskSco'] = 0;
  },
  ObjradioclickF: function (name, idx, objName) {
    var list = [];
    if (vm.aboutFallDanger.riskOtherCod == '0') {
      vm.fallSystemList.riskOtherCodList[0]['checked'] = false;
      vm.aboutFallDanger.riskOtherCod = '';
    }
    list = vm.fallSystemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      if (name == 'riskExcreteCod') {
        vm[objName][name] = list[idx]['infoid'];
      } else {
        vm[objName][name] = list[idx]['infocode'];
      }
      vm[objName][name + 'num'] = (list[idx]['infocode']);
    } else {
      vm[objName][name] = '';
      vm[objName][name + 'num'] = 0;
    }
    if (objName == 'aboutFallDanger') {
      var riskAgeoCod, riskHisCod, riskExcreteCod, riskDrugCod, riskMacCod;
      riskAgeoCod = parseInt(vm[objName].riskAgeoCodnum);
      riskHisCod = parseInt(vm[objName].riskHisCodnum);
      riskExcreteCod = parseInt(vm[objName].riskExcreteCodnum);
      riskDrugCod = parseInt(vm[objName].riskDrugCodnum);
      riskMacCod = parseInt(vm[objName].riskMacCodnum);
      vm[objName].danxSco = (riskAgeoCod) + (riskHisCod) + (riskExcreteCod) + (riskDrugCod) + (riskMacCod);
      if (vm[objName].danxSco <= 0 && vm[objName].duoxSco == null) {
        vm[objName].riskSco = null;
      } else if (vm[objName].danxSco <= 0 && vm[objName].duoxSco != null) {
        // 以下是两个多选值为0，不选中的时候
        if (vm[objName].duoxSco == 0) {
          if (parseInt(vm[objName].riskClassCod1num) != 1 && parseInt(vm[objName].rzfz4num) != 1) {
            vm[objName].riskSco = null;
          } else {
            vm[objName].riskSco = vm[objName].duoxSco - 0;
          }
        } else if (vm[objName].duoxSco > 0) {
          vm[objName].riskSco = vm[objName].duoxSco - 0;
        }
      } else if (vm[objName].danxSco > 0 && vm[objName].duoxSco == null) {
        vm[objName].riskSco = vm[objName].duoxSco - 0 + (vm[objName].danxSco - 0);
      } else if (vm[objName].danxSco > 0 && vm[objName].duoxSco != null) {
        vm[objName].riskSco = vm[objName].duoxSco - 0 + (vm[objName].danxSco - 0);
      }
      //   $('#danxVal').val(vm['aboutFallDanger'].danxSco);
    }
  },

  /**
  * @ 其他模块多选
  */
  otherCheckClick: function (objName, idx, name) {
    if (vm.aboutFallDanger.riskOtherCod == '0') {
      vm.fallSystemList.riskOtherCodList[0]['checked'] = false;
      vm.aboutFallDanger.riskOtherCod = '';
    }
    var list = vm.fallSystemList[objName + 'List'];
    var scoNum = parseInt(list[idx]['infocode']);
    if (objName != 'riskActionCod' && objName != 'riskClassCod') {
      _useNum = 'infocode';
    } else {
      _useNum = 'infoid';
    }
    var currentData = $.inArray((list[idx][_useNum]), vm[name][objName]);
    if (list[idx]['checked'] == false) {
      list[idx]['checked'] = true;
      if (currentData == -1) {
        vm[name][objName].push(list[idx][_useNum]);
        if (name == 'aboutFallDanger') {
          if (vm[name].riskSco == null || vm[name].duoxSco == null) {
            vm[name].riskSco = vm[name].riskSco || 0;
            vm[name].duoxSco = 0
          }
          vm[name].riskSco = vm[name].riskSco - 0 + scoNum;
          vm[name].duoxSco = vm[name].duoxSco - 0 + scoNum;
          if (vm[name].riskSco == 0) {
            if (objName == 'riskOcognizeCod' || objName == 'riskClassCod' || objName == 'riskActionCod') {
              if (vm[name][objName].length < 1) {
                vm[name].riskSco = null;
                if (vm[name].duoxSco == 0) {
                  vm[name].duoxSco = null
                }
              }
            } else {
              vm[name].riskSco = null;
              if (vm[name].duoxSco == 0) {
                vm[name].duoxSco = null
              }
            }
          }
        }
      }
    } else {
      list[idx]['checked'] = false;
      if (currentData != -1) {
        vm[name][objName].splice(currentData, 1);
        if (name == 'aboutFallDanger') {
          if (vm[name].riskSco == null || vm[name].duoxSco == null) {
            vm[name].riskSco = 0;
            vm[name].duoxSco = 0
          }
          vm[name].riskSco = vm[name].riskSco - 0 - scoNum;
          vm[name].duoxSco = vm[name].duoxSco - 0 - scoNum;
          if (vm[name].riskSco == 0) {
            if (objName == 'riskOcognizeCod' || objName == 'riskClassCod' || objName == 'riskActionCod') {
              if (vm[name][objName].length < 1) {
                vm[name].riskSco = null;
                if (vm[name].duoxSco == 0) {
                  vm[name].duoxSco = null
                }
              }
            } else {
              vm[name].riskSco = null;
              if (vm[name].duoxSco == 0) {
                vm[name].duoxSco = null
              }
            }
          }
        }
      }
    }
    if (vm[name][objName]) {
      vm.fallhideMsg[objName] = vm[name][objName].join(',');
    }
  },

  /**
   * @ systemtMsg 下单选 
   */
  radioclick: function (name, idx) {
    var list = [];
    list = vm.systemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      vm.systemtMsg[name] = list[idx]['infocode'];
    } else {
      vm.systemtMsg[name] = '';
    }
  },

  /**
   * @select 
   */
  Spcradioclick: function (name, idx, infocode) {
    var list = vm.systemList[name + 'List'];
    var currentData = $.inArray((list[idx]['infocode']), vm.systemtMsg[name]);
    if (list[idx]['checked'] == false) {
      list[idx]['checked'] = true;
      if (currentData == -1) {
        vm.systemtMsg[name].push(list[idx]['infocode']);
      }
      if (infocode != "1" && infocode != "2") {
        try {
          vm.systemtMsg['showselect' + idx] = false;
        } catch (e) {
          // statements
          // console.log(e);
        }
        // vm.systemtMsg['showselect' + idx] = false;
      } else if (infocode == "1") {
        try {
          vm.systemtMsg['showselect' + idx] = true;
        } catch (e) {
          // statements
          // console.log(e);
        }
        // vm.systemtMsg['showselect' + idx] = true;
        vm.systemtMsg.sjxtpgYssubCod = '';
      } else if (infocode == "2") {
        try {
          vm.systemtMsg['showselect' + idx] = true;
        } catch (e) {
          // statements
          // console.log(e);
        }
        // vm.systemtMsg['showselect' + idx] = true;
        vm.systemtMsg.sjxtpgYssubCodb = '';
      }
    } else {
      list[idx]['checked'] = false;
      if (currentData != -1) {
        vm.systemtMsg[name].splice(currentData, 1)
      }
      try {
        vm.systemtMsg['showselect' + idx] = false;
      } catch (e) {
        // statements
        // console.log(e);
      }
      // vm.systemtMsg['showselect' + idx] = false;
    }
    if (vm.systemtMsg[name]) {
      vm.xtpghideMsg[name] = vm.systemtMsg[name].join();
    }
  },
  /**
   * @ 其他对象单选
   */
  Objradioclick: function (name, idx, objName) {
    var list = [];
    list = vm.systemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if(objName == 'aboutmorse'){
      if (list[idx]['checked'] == true) {
        vm[objName][name] = list[idx]['remark'];
      } else {
        vm[objName][name] = '';
      }

      var _obj = vm.aboutmorse, totalVal;
      totalVal = (_obj.jsgyywddCod - 0) + (_obj.dyygjbpdCod - 0) + (_obj.xzfzCod - 0) + (_obj.jmzlsyddgfxyCod - 0) + (_obj.btCod - 0) + (_obj.rznlCod - 0);
      if (totalVal >= 0) {
        vm.aboutmorse.zf = totalVal
      } else {
        vm.aboutmorse.zf = null
      }
    }else{
      if (list[idx]['checked'] == true) {
        vm[objName][name] = list[idx]['infocode'];
        try {
          vm[objName][name + 'num'] = (list[idx]['infocode']);
          // statements
        } catch (e) {
          // statements
          // console.log(e);
        }
      } else {
        vm[objName][name] = '';
        try {
          vm[objName][name + 'num'] = 0;
          // statements
        } catch (e) {
          // statements
          // console.log(e);
        }
      }
    }

    if (objName == 'aboutbraden') {
      var _obj = vm.aboutbraden, totalVal;
      totalVal = (_obj.bradenGjCod - 0) + (_obj.bradenCsCod - 0) + (_obj.bradenHdnlCod - 0) + (_obj.bradenYdnlCod - 0) + (_obj.bradenYyCod - 0) + (_obj.bradenMchjqlCod - 0);
      if (totalVal > 0) {
        vm.aboutbraden.bradenSco = totalVal
      } else {
        vm.aboutbraden.bradenSco = null
      }
    }
  },
  adlradioclick: function (name, idx) {
    var list = [];
    list = vm.systemList[name + 'List'];
    var currentChecked = list[idx]['checked'];
    $.each(list, function (index, value) {
      value['checked'] = false;
    });
    list[idx]['checked'] = !currentChecked;
    if (list[idx]['checked'] == true) {
      vm.aboutAdl[name] = list[idx]['infocode'];
      try {
        vm.aboutAdl[name + 'New'] = list[idx]['infoid'];
      } catch (e) {}
    } else {
      vm.aboutAdl[name] = '';
      try {
        vm.aboutAdl[name + 'New'] = '';
      } catch (e) {}
    }
    var _obj = vm.aboutAdl, totalVal;
    totalVal = (_obj.adlJsSco - 0) + (_obj.adlXizSco - 0) + (_obj.adlXsSco - 0) + (_obj.adlCySco - 0) + (_obj.adlKzdbSco - 0) + (_obj.adlKzxbSco - 0) + (_obj.adlScsSco - 0) + (_obj.adlCyzySco - 0) + (_obj.adlXingzSco - 0) + (_obj.adlSxltSco - 0);
    if (totalVal > 0) {
      vm.aboutAdl.adlSco = totalVal
    } else {
      if (_obj.adlJsScoNew == '' && _obj.adlXizScoNew == '' && _obj.adlXsScoNew == '' && _obj.adlCyScoNew == '' && _obj.adlKzdbScoNew == '' && _obj.adlKzxbScoNew == '' && _obj.adlScsScoNew == '' && _obj.adlCyzyScoNew == '' && _obj.adlXingzScoNew == '' && _obj.adlSxltScoNew == '') {
        vm.aboutAdl.adlSco = null
      } else {
        vm.aboutAdl.adlSco = 0
      }
    }
  },
  /**
   * @ 多选
   */
  checkClick: function (objName, idx , selfName) {
    if(selfName == 'aboutmorse'){
      vm.xtpghideMsg[objName] = publicFun.checkClicks(vm.systemList[objName + 'List'], vm.aboutmorse[objName], idx, vm.xtpghideMsg[objName])
    }else{
      vm.xtpghideMsg[objName] = publicFun.checkClicks(vm.systemList[objName + 'List'], vm.systemtMsg[objName], idx, vm.xtpghideMsg[objName])
    }
  },
  onlyNum: function (attr, step, max) { //限定只能输入数字
    vm.systemtMsg[attr] = publicFun.onlyNumber(vm.systemtMsg[attr], step, max)
  },
  /**
   * @ 双击编辑或者关闭
   */
  toggleBox: function (flag, msg, objName) {
    if (vm[objName][flag] === '0') {
      vm.aboutbraden.bradenFlag = '0';
      vm.aboutbraden.bradenMsg = '编辑';
      vm.aboutAdl.adlFlag = '0';
      vm.aboutAdl.adlMsg = '编辑';
      vm.aboutzcdd.zcddFlag = '0';
      vm.aboutzcdd.zcddMsg = '编辑';
      var flagList = ['nrsFlag', 'nrsAssessFlag', 'nurAssessFlag', 'BreathAssessFlag', 'XinxgAssessFlag', 'DigestAssessFlag', 'mxszAssessFlag', 'skinAssessFlag', 'psychosocialAssessFlag', 'ductFlag'],
        MsgList = ['nrsMsg', 'nrsAssessMsg', 'nurAssessMsg', 'BreathAssessMsg', 'XinxgAssessMsg', 'DigestAssessMsg', 'mxszAssessMsg', 'skinAssessMsg', 'psychosocialAssessMsg', 'ductMsg'];
      $.each(flagList, function (idx, val) {
        vm.systemtMsg[val] = '0';
      })
      $.each(MsgList, function (idx, val) {
        vm.systemtMsg[val] = '编辑';
      })
      vm[objName][flag] = '1';
      vm[objName][msg] = '关闭';
      if (objName == 'aboutbraden') {
        window.scrollTo(0, 148);
      }
      if (objName == 'aboutAdl') {
        window.scrollTo(0, 180);
      }
      if (objName == 'aboutzcdd') {
        window.scrollTo(0, 248);
      }
      if (objName == 'systemtMsg' && flag == 'nrsAssessFlag') {
        window.scrollTo(0, 295);
      }
      if (objName == 'systemtMsg' && flag == 'nurAssessFlag') {
        window.scrollTo(0, 332);
      }
      if (objName == 'systemtMsg' && flag == 'BreathAssessFlag') {
        window.scrollTo(0, 369);
      }
      if (objName == 'systemtMsg' && flag == 'XinxgAssessFlag') {
        window.scrollTo(0, 406);
      }
      if (objName == 'systemtMsg' && flag == 'DigestAssessFlag') {
        window.scrollTo(0, 443);
      }
      if (objName == 'systemtMsg' && flag == 'mxszAssessFlag') {
        window.scrollTo(0, 480);
      }
      if (objName == 'systemtMsg' && flag == 'skinAssessFlag') {
        window.scrollTo(0, 517);
      }
      if (objName == 'systemtMsg' && flag == 'psychosocialAssessFlag') {
        window.scrollTo(0, 554);
      }
      if (objName == 'systemtMsg' && flag == 'ductFlag') {
        window.scrollTo(0, 584);
      }
    } else {
      vm[objName][flag] = '0';
      vm[objName][msg] = '编辑';
    }
  },
  toggleHspFzjcCustom: function (name, score, objName) {
    try {
      vm[objName][name] = vm[objName][name] == score ? '' : score;
    } catch (e) {
      // statements
      // console.log(e);
    }
    try {
      vm[objName][name + 'num'] = vm[objName][name + 'num'] == score ? 0 : score;
    } catch (e) {
      // statements
      // console.log(e);
    }
    if (objName == 'aboutzcdd') {
      var zcddexpfYnbmdd, zcddexpfYsza, zcddexpfSlza, zcddexpfHdza, zcddexpfNl, zcddexpfTnxr, zcddexpfTyxy, zcddexpfZyywjr, zcddexpfJrpb, zcddexpfMy;
      zcddexpfYnbmdd = parseInt(vm.aboutzcdd.zcddexpfYnbmddnum);
      zcddexpfYsza = parseInt(vm.aboutzcdd.zcddexpfYszanum);
      zcddexpfSlza = parseInt(vm.aboutzcdd.zcddexpfSlzanum);
      zcddexpfHdza = parseInt(vm.aboutzcdd.zcddexpfHdzanum);
      zcddexpfNl = parseInt(vm.aboutzcdd.zcddexpfNlnum);
      zcddexpfTnxr = parseInt(vm.aboutzcdd.zcddexpfTnxrnum);
      zcddexpfTyxy = parseInt(vm.aboutzcdd.zcddexpfTyxynum);
      zcddexpfZyywjr = parseInt(vm.aboutzcdd.zcddexpfZyywjrnum);
      zcddexpfJrpb = parseInt(vm.aboutzcdd.zcddexpfJrpbnum);
      zcddexpfMy = parseInt(vm.aboutzcdd.zcddexpfMynum);
      if (zcddexpfYnbmdd <= 0 && zcddexpfYsza <= 0 && zcddexpfSlza <= 0 && zcddexpfHdza <= 0 && zcddexpfNl <= 0 && zcddexpfTnxr <= 0 && zcddexpfTyxy <= 0 && zcddexpfZyywjr <= 0 && zcddexpfJrpb <= 0 && zcddexpfMy <= 0) {
        vm.aboutzcdd.zcddexpfSco = null;
      } else if (zcddexpfYnbmdd <= 0 && zcddexpfYsza <= 0 && zcddexpfSlza <= 0 && zcddexpfHdza <= 0 && zcddexpfNl <= 0 && zcddexpfTnxr <= 0 && zcddexpfTyxy <= 0 && zcddexpfZyywjr <= 0 && zcddexpfJrpb <= 0 && zcddexpfMy == 1) {
        vm.aboutzcdd.zcddexpfSco = 0;
      } else {
        vm.aboutzcdd.zcddexpfSco = (zcddexpfYnbmdd) + (zcddexpfYsza) + (zcddexpfSlza) + (zcddexpfHdza) + (zcddexpfNl) + (zcddexpfTnxr) + (zcddexpfTyxy) + (zcddexpfZyywjr) + (zcddexpfJrpb);
      }
    }
  },
  showhide: function (infocode) {
    $("#ggjpfxtSzcdCod" + infocode).next().hover(function () {
      $('#showDivSkin' + infocode).show();
    }, function () {
      $('#showDivSkin' + infocode).hide();
    });
  },
  textCheck: function (idx, listName) {
    var _textList = vm.getMsg[listName + 'List'];
    var currentCheck = vm.getMsg[listName + 'List'][idx].isAct;
    _textList.forEach(function (val, index) {
      vm.getMsg[listName + 'List'][index].isAct = false;
    })
    vm.systemtMsg.nrsSco = vm.getMsg[listName + 'List'][idx].valText;
    document.getElementById('type' + listName).checked = true;
    vm.systemtMsg.ttpfTypeCod = $("input[name='typeWay']:checked").val();
    if (listName === 'num') {
      vm.getMsg.lanList.map(function (_val, _index) {
        vm.getMsg.lanList[_index].isAct = false;
      })
    }
    if (listName === 'lan') {
      vm.getMsg.numList.map(function (_val, _index) {
        vm.getMsg.numList[_index].isAct = false;
      })
    }
    document.getElementById('showArea').value = 0;
    $('#showArea').focus();
    if (currentCheck) {
      vm.getMsg[listName + 'List'][idx].isAct = false
      vm.systemtMsg.nrsSco = null;
    } else {
      vm.getMsg[listName + 'List'][idx].isAct = true;
    }
  },
  setRadio: function (currentVal, type) {
    if (currentVal === '' || currentVal == null) {
      for (var i = 0; i < 4; i++) {
        document.getElementsByName('typeWay')[i].checked = false;
      }
    } else {
      if (currentVal !== '4' && currentVal !== '5') {
        vm.setOtherNrsNull(_nrsActList);
        vm.setOtherNrsNull(_actList);
      }
      if (currentVal === '4') {
        vm.setOtherNrsNull(_nrsActList);
      }
      if (currentVal === '5') {
        vm.setOtherNrsNull(_actList);
      }
    }
    vm.systemtMsg.ttpfTypeCod = $("input[name='typeWay']:checked").val();
    var otherList = ['numList', 'lanList'];
    otherList.forEach(function (val, index) {
      vm.getMsg[val].map(function (_val, _index) {
        vm.getMsg[val][_index].isAct = false;
      })
    })
    document.getElementById('showArea').value = 0;
    $('#showArea').focus();
    if (type != 'face') {
      vm.systemtMsg.faceNrsSco = null;
      vm.systemtMsg.nrsSco = null;
    }
  },
  initPanel: function () {
    slideBarWrapper = new SlideBar({
      actionBlock: 'action-block',
      actionBar: 'action-bar',
      slideBar: 'scroll-bar',
      barLength: 500,
      interval: 1,
      maxNumber: 10,
      showArea: 'showArea'
    });
  },
  chooseAche: function (idx) {
    vm.setRadio('3', 'face');
    if (idx == vm.systemtMsg.nrsSco) {
      vm.systemtMsg.faceNrsSco = null;
    } else {
      document.getElementById('typeFace').checked = true;
      vm.systemtMsg.ttpfTypeCod = $("input[name='typeWay']:checked").val();;
      vm.systemtMsg.faceNrsSco = parseInt(idx);
    }
    vm.systemtMsg.nrsSco = vm.systemtMsg.faceNrsSco;
  },
  setOtherNrsNull: function (list) {
    for (var i = 0; i < list.length; i++) {
      vm.systemtMsg[list[i]] = []
    }
  },
  radioClick: function (name, idx, typeList) {
    if (vm.systemtMsg[name].length > 0) {
      var systemtMsg = vm.getMsg[name + 'List'][idx]['infocode'];
      vm.systemtMsg[name] = [systemtMsg];
    } else {
      vm.systemtMsg[name] = [];
    }
    var _fieldList = [], typeCod = '';
    if (typeList === 'flaccList') {
      _fieldList = _actList;
      typeCod = '4';
    } else {
      _fieldList = _nrsActList;
      typeCod = '5';
    }
    if ($.inArray(name, _fieldList) > -1) {
      var _countZero = 0, ckVal = 0;
      for (var i = 0; i < _fieldList.length; i++) {
        if (vm.systemtMsg[_fieldList[i]].length === 0) {
          _countZero++;
        } else {
          ckVal += (vm.systemtMsg[_fieldList[i]] - 0)
        }
      }
      var _duplexValList = vm.systemtMsg[typeList];
      _duplexValList.forEach(function (item, idx) {
        if (item.type === name) {
          item.checkVal = vm.systemtMsg[name]
        }
      })
      if (_countZero === 5) {
        vm.systemtMsg.nrsSco = null
      } else {
        vm.setRadio(typeCod);
        vm.systemtMsg.nrsSco = ckVal
      }
    }
  },
  getParentInfo: function () {
    var _parentRadio = vm.systemtMsg.ttpfTypeCod,
      _parentNrs = vm.systemtMsg.nrsSco,
      _ttpfNr = vm.systemtMsg.ttpfNr;
    var _valList = [];
    if (vm.systemtMsg.ttpfNr !== '' && vm.systemtMsg.ttpfNr != null) {
      _valList = JSON.parse(vm.systemtMsg.ttpfNr);
    }
    if (_parentNrs !== '') {
      if (_parentRadio === '' || _parentRadio == null) {
        if (_parentNrs !== '' && _parentNrs != null) { // 针对生成数据[老数据]
          vm.systemtMsg.ttpfTypeCod = '1' // 数字评分法
          vm.getMsg.numList[_parentNrs].isAct = true;
          document.getElementsByName('typeWay')[vm.systemtMsg.ttpfTypeCod].checked = true;
        }
      } else {
        document.getElementsByName('typeWay')[vm.systemtMsg.ttpfTypeCod].checked = true;
      }
      if (_parentRadio === '0') {
        document.getElementById('showArea').value = _parentNrs;
        $('#showArea').focus();
      } else if (_parentRadio === '1') {
        vm.getMsg.numList[_parentNrs].isAct = true;
      } else if (_parentRadio === '2') {
        vm.systemtMsg.faceNrsSco = _parentNrs;
      } else if (_parentRadio === '3') {
        vm.getMsg.lanList.map(function (_val, _index) {
          if (_val.valText === _parentNrs) {
            vm.getMsg.lanList[_index].isAct = true;
          }
        })
      } else if (_parentRadio === '4') {
        if (_valList.length > 0) {
          vm.systemtMsg.flaccList = _valList;
        }
        _valList.forEach(function (item, val) {
          if ($.inArray(item.type, _actList) > -1) {
            vm.systemtMsg[item.type] = item.checkVal
          }
        })
      } else if (_parentRadio === '5') {
        if (_valList.length > 0) {
          vm.systemtMsg.copptList = _valList;
        }
        _valList.forEach(function (item, val) {
          if ($.inArray(item.type, _nrsActList) > -1) {
            vm.systemtMsg[item.type] = item.checkVal
          }
        })
      }
    } else {
      if (_parentRadio !== '' && _parentRadio != null) {
        document.getElementsByName('typeWay')[_parentRadio].checked = true;
      }
    }
  }    
});

$(function () {
  if (_cstAgeNew) {
    var ageVal = _cstAgeNew + _ageUnit;
    $('#ageInput').val(ageVal)
  } else {
    $('#ageInput').val(_cstAgeNew)
  }

  if (_ageUnit != '岁' || (_ageUnit == '岁' && _cstAgeNew != '' && _cstAgeNew < 14)) {
    vm.aboutFallDangerC.ageFlg = '1'
  } else {
    vm.aboutFallDangerC.ageFlg = '0'
  }

  $(".hovershow").hover(function () {
    $('#showDiv').show();
    $('.showMsgLi').css("background", "#f0f3f6");
  }, function () {
    $('#showDiv').hide();
    $('.showMsgLi').css("background", "#f9f9f9");
  });

})

/**
 * @监听 -气管切开- 是否勾选 及内容项选择。
 */

vm.systemtMsg.$watch('qgqkQqtgxh', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && vm.systemtMsg.qgqkFlg != 1) {
    vm.systemtMsg.qgqkFlg = 1
  }
});

vm.systemtMsg.$watch('qgqkXdgdsj', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && vm.systemtMsg.qgqkFlg != 1) {
    vm.systemtMsg.qgqkFlg = 1
  }
});

vm.systemtMsg.$watch('qgqkQnyl', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && vm.systemtMsg.qgqkFlg != 1) {
    vm.systemtMsg.qgqkFlg = 1
  }
});

vm.systemtMsg.$watch('qgqkQgcgFlg', function (newVal, oldVal) {
  if (newVal == 1 && vm.systemtMsg.qgqkFlg != 1) {
    vm.systemtMsg.qgqkFlg = 1
  }
});

vm.systemtMsg.$watch('qgqkQgqkchyFlg', function (newVal, oldVal) {
  if (newVal == 1 && vm.systemtMsg.qgqkFlg != 1) {
    vm.systemtMsg.qgqkFlg = 1
  }
});

vm.systemtMsg.$watch('qgqkFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal == '') {
    vm.systemtMsg.qgqkQqtgxh = '';
    vm.systemtMsg.qgqkXdgdsj = '';
    vm.systemtMsg.qgqkQnyl = '';
    vm.systemtMsg.qgqkQgcgFlg = '';
    vm.systemtMsg.qgqkQgqkchyFlg = ''
  }
});

/**
 * @监听 -呕吐- 是否勾选 及内容项选择。
 */
vm.systemtMsg.$watch('xhxtpgOtFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal == '') {
    vm.systemtMsg.xhxtpgOtYs = '';
    vm.systemtMsg.xhxtpgOtL = ''
  }
});

vm.systemtMsg.$watch('xhxtpgOtYs', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && vm.systemtMsg.xhxtpgOtFlg != 1) {
    vm.systemtMsg.xhxtpgOtFlg = 1
  }
});
vm.systemtMsg.$watch('xhxtpgOtL', function (newVal, oldVal) {
  if (newVal != '' && newVal != null && vm.systemtMsg.xhxtpgOtFlg != 1) {
    vm.systemtMsg.xhxtpgOtFlg = 1
  }
});

/**
 * @监听 -气管插管- 是否勾选 及内容项选择。
 */
vm.systemtMsg.$watch('qgcgQgdgxh', function (newVal, oldVal) {
  if (newVal.replace(/ /img, '') != '' && vm.systemtMsg.qgcgFlg != 1) {
    vm.systemtMsg.qgcgFlg = 1
  }
});

vm.systemtMsg.$watch('qgcgJmc', function (newVal, oldVal) {
  if (newVal != '' && newVal != null && vm.systemtMsg.qgcgFlg != 1) {
    vm.systemtMsg.qgcgFlg = 1
  }
});

vm.systemtMsg.$watch('qgcgQgcg', function (newVal, oldVal) {
  if (newVal == 1 && vm.systemtMsg.qgcgFlg != 1) {
    vm.systemtMsg.qgcgFlg = 1
  }
});

vm.systemtMsg.$watch('qgcgGdt', function (newVal, oldVal) {
  if (newVal == 1 && vm.systemtMsg.qgcgFlg != 1) {
    vm.systemtMsg.qgcgFlg = 1
  }
});

vm.systemtMsg.$watch('qgcgFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal == '') {
    vm.systemtMsg.qgcgQgdgxh = '';
    vm.systemtMsg.qgcgJmc = '';
    vm.systemtMsg.qgcgQgcg = '';
    vm.systemtMsg.qgcgGdt = ''
  }
});

/**
 *@ 勾选无异常后 设置其子项为空
 */
vm.systemtMsg.$watch('xtpgSjFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = ['sjxtpgYssubCod', 'sjxtpgYssubCodb', 'tkLefttkZj', 'tkLefttkZtCod', 'leftTbDgfy', 'tkRighttkZj', 'tkRighttkZtCod', 'rightTbDgfy',
     'leftsSjJzl', 'rightsSjJzl', 'leftxSjJzl', 'rightxSjJzl', 'sjxtpgMemo'];
    var _checkList = ['sjxtpgYsCod','sjxtpgYyCod','leftsJzSzCod','rightsJzSzCod','leftxJzSzCod','rightxJzSzCod'],
        _radioList = ['leftsSjJzl','rightsSjJzl','leftxSjJzl','rightxSjJzl','tkLefttkZtCod','leftTbDgfy','tkRighttkZtCod','rightTbDgfy'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_radioList, function (index, value) {
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
    $.each(_checkList, function (index, value) {
      vm.systemtMsg[value] = [];
      vm.xtpghideMsg[value] = '';
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
    vm.systemtMsg.showselect0 = false;
    vm.systemtMsg.showselect1 = false;
  }
});

/**
 *@ 勾选无异常后 设置其子项为空
 */
vm.systemtMsg.$watch('xtpgHxFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = [ 'hxxtpgKsQt', 'hxxtpgTxxzQt', 'hxxtpgGyll', 'hxxtpgYnd','hxxtpgYbhd', 'qgqkQqtgxh','qgqkXdgdsj','qgqkQnyl','qgqkQgqkbz',
        'qgcgQgdgxh','qgcgJmc','hxxtpgMemo', 'qgqkFlg', 'qgqkQgcgFlg','qgqkQgqkchyFlg','qgcgFlg','qgcgQgcg','qgcgGdt','hxgnxlFlg'];
    var _checkList = ['leftHxxtpgHxyCod','rightHxxtpgHxyCod'],
        _radioList = ['hxxtpgKsCod','hxxtpgTxxzCod','hxxtpgTlCod', 'hxxtpgGyfsCod', 'hxxtpgHxjc'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_radioList, function (index, value) {
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false;
        vm.systemtMsg[value] = ''
      })
    })
    $.each(_checkList, function (index, value) {
      vm.systemtMsg[value] = [];
      vm.xtpghideMsg[value] = '';
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
  }
});
vm.systemtMsg.$watch('xtpgXxgFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = [ 'xxgxtpgXdjhFlg', 'xxgxtpgXlCs', 'xxgxtpgXmFlg', 'xxgxtpgXtFlg','xxgxtpgXjFlg', 'xxgxtpgMemo'];
    var _radioList = ['xxgxtpgXlZtCod','zzXxgxtpgBdmbdCod','yzXxgxtpgBdmbdCod','zrXxgxtpgBdmbdCod','yrXxgxtpgBdmbdCod','xxgxtpgMxxgcy'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_radioList, function (index, value) {
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false;
        vm.systemtMsg[value] = ''
      })
    })
  }
});
vm.systemtMsg.$watch('xtpgXhFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = [ 'xhxtpgOtYs', 'xhxtpgOtL', 'xhxtpgFw', 'xhxtpgTpnds','xhxtpgPpnds', 'xhxtpgMemo','xhxtpgExFlg', 'xhxtpgOtFlg','xhxtpgFbfttFlg','xhxtpgFqcxFlg'];
    var _checkList = ['xhxtpgFbytCod'],
        _radioList = ['xhxtpgYsCod','xhxtpgSyCod', 'xhxtpgFbpz','xhxtpgFbcg','xhxtpgFzCod','xhxtpgCmyCod','xhxtpgPbCod'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_radioList, function (index, value) {
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false;
        vm.systemtMsg[value] = ''
      })
    })
    $.each(_checkList, function (index, value) {
      vm.systemtMsg[value] = [];
      vm.xtpghideMsg[value] = '';
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
  }
});
vm.systemtMsg.$watch('xtpgMnFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = [ 'mnszxtpgPgcxFlg', 'mnszxtpgBdQt', 'mnszxtpgMeno'];
    var _checkList = ['mnszxtpgPnCod','mnszxtpgDjmwCod','mnszxtpgRsztCod','mnszxtpgYjCod','mnszxtpgBdCod'],
        _radioList = ['mnszxtpgNyxzCod','mnszxtpgTxCod'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_radioList, function (index, value) {
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false;
        vm.systemtMsg[value] = ''
      })
    })
    $.each(_checkList, function (index, value) {
      vm.systemtMsg[value] = [];
      vm.xtpghideMsg[value] = '';
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
  }
});
vm.systemtMsg.$watch('xtpgGgFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = [ 'ggjpfxtSzfwQt', 'ggjpfxtBhFlg', 'ggjpfxtSkbwQt','ggjpfxtYc','ggjpfxtJzFlg','ggjpfxtGdQt','ggjpfxtHdfsQt','ggjpfxtMemo','ggjpfxtPfwdQt'];
    var _checkList = ['ggjpfxtPfysCod','ggjpfxtSzfwCod','ggjpfxtSkbwCod'],
        _radioList = ['ggjpfxtPfwdCod','ggjpfxtSzxzCod','ggjpfxtSzcdCod','ggjpfxtBttCod','ggjpfxtKqnmCod',
        'ggjpfxtZknmCod','ggjpfxtSkCod','ggjpfxtGdCod','ggjpfxtHdfsCod','ggjpfxtKqyCod'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_radioList, function (index, value) {
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false;
        vm.systemtMsg[value] = ''
      })
    })
    $.each(_checkList, function (index, value) {
      vm.systemtMsg[value] = [];
      vm.xtpghideMsg[value] = '';
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
  }
});
vm.systemtMsg.$watch('xtpgXlFlg', function (newVal, oldVal) {
  if (newVal != '2') {
    var _list = [ 'xlshpgJsztQt', 'xlshpgMemo'];
    var _checkList = ['xlshpgJsztCod'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    $.each(_checkList, function (index, value) {
      vm.systemtMsg[value] = [];
      vm.xtpghideMsg[value] = '';
      $.each(vm.systemList[value+'List'],function(idx,val){
        val.checked = false
      })
    })
  }
});
vm.systemtMsg.$watch('xtpgDgFlg', function (newVal, oldVal) {
  if (newVal != '1') {
    vm.systemtMsg.dgpgJmdgFlg = '0';
    vm.systemtMsg.dgpgYlgFlg = '0';
    vm.systemtMsg.dgpgQtFlg = '0';
  }
});
/**
 *@ 不勾选静脉导管之后 设置其子项为空
 */
vm.systemtMsg.$watch('dgpgJmdgFlg', function (newVal, oldVal) {
  if (newVal === 0 || newVal === '0' || newVal == '' || newVal === null) {
    var _list = ['wzjmTcFlg', 'wzjmGdt', 'wzjmJwbyy', 'wzjmSd', 'wzjmGrjxFlg', 'wzjmSfbgFlg', 'wzjmMemo', 'cvcDgpgCctjCod', 'cvcDgxhCod', 'cvcZgsd', 'cvcJwbyy', 'cvcJwbyySd', 'cvcGrjxFlg', 'cvcHyFlg', 'cvcMemo', 'piccDgxh', 'piccDgxhNz', 'piccDgxhWz', 'sygDgpgCctjCod', 'sygCctjTcFlg', 'sygJwbyy', 'sygSd', 'sygGrjxFlg', 'sygDxzccFlg', 'sygBdxzFlg', 'sygQt'];
    $.each(_list, function (index, value) {
      vm.systemtMsg[value] = ''
    })
    var items = $("#ulDivSel").find("input[type='checkbox']");
    items.each(function () {
      $(this).attr('checked', false);
    })
  }
});

function tableValue(idname, idname2, idname3, idname4,tbtype) {
  if(tbtype == '0'){
    var tblength = document.getElementById('ducttable').rows.length;
    var _inputName = 'hideylgDgmcCod'
  }else{
    var tblength = document.getElementById('ducttableA').rows.length;
    var _inputName = 'hideylgDgmcCodA'
  }
  var inAndOut = '';
  for (var i = 0; i < tblength; i++) {
    var adda = $("#" + idname + i + "").val(),
      addb = $("#" + idname2 + i + "").val(),
      addc = $("#" + idname3 + i + "").val(),
      addcsel = $("#" + idname3 + i + "  option:selected").text(),
      addd = $("#" + idname4 + i + "").val();
    if (addd == '') {
      addd = "未知";
    }
    if (addcsel == '请选择') {
      addcsel = '';
    }
    if (adda == '') {
      if (addb != '') {
        publicFun.alert("导管评估中导管名称为空！");
        return false;
      } else {
        inAndOut = inAndOut;
        $("#"+_inputName).val(inAndOut);
      }
    } else {
      inAndOut = inAndOut + adda + "," + addb + "," + addc + "," + addcsel + "," + addd + "," + tbtype +"#";
      $("#"+_inputName).val(inAndOut);
    }
    //  console.log(inAndOut);
  }
  return true;

}


/**
 * @ 拼接一个大字段（所有结果拼接）
 */

function connectField() {
  /**
   * @ 评分模块
   */
  var AllMoudel = '',
    scoreModule = '';
  // var _list = ['xtpgSx', 'xtpgSt', 'xtpgMx', 'xtpgBm'];
  // var _selMsg = '';
  // $.each(_list, function (index, value) {
  //   if (vm.systemtMsg[value] !== '') {
  //     vm.systemList[value + 'List'].map(function (ele, idx) {
  //       if (ele.infocode == vm.systemtMsg[value]) {
  //         scoreModule += ele.info + '、';
  //       }
  //     })
  //   }
  // })
  if (vm.aboutbraden.bradenSco > 0) {
    if (vm.aboutAdl.adlSco != null || vm.aboutzcdd.zcddexpfSco != null || vm.systemtMsg.nrsSco != null) {
      scoreModule += 'Braden评分：' + vm.aboutbraden.bradenSco + '分、';
    } else {
      scoreModule += 'Braden评分：' + vm.aboutbraden.bradenSco + '分；';
    }
  }

  if (vm.aboutAdl.adlSco != null) {
    if (vm.aboutzcdd.zcddexpfSco != null || vm.systemtMsg.nrsSco != null) {
      scoreModule += 'ADL评分：' + vm.aboutAdl.adlSco + '分、';
    } else {
      scoreModule += 'ADL评分：' + vm.aboutAdl.adlSco + '分；';
    }
  }

  // if (vm.aboutFallDanger.riskSco != null) {
  //   if (vm.systemtMsg.nrsSco != null) {
  //     scoreModule += '坠床跌倒评分：' + vm.aboutFallDanger.riskSco + '分、';
  //   } else {
  //     scoreModule += '坠床跌倒评分：' + vm.aboutFallDanger.riskSco + '分；';
  //   }
  // }

  // if (vm.aboutzcdd.zcddexpfSco != null) {
  //   if (vm.systemtMsg.nrsSco != null) {
  //     scoreModule += '坠床跌倒评分：' + vm.aboutzcdd.zcddexpfSco + '分、';
  //   } else {
  //     scoreModule += '坠床跌倒评分：' + vm.aboutzcdd.zcddexpfSco + '分；';
  //   }
  // }

  // if (vm.aboutFallDangerC.riskSco != null) {
  //   if (vm.systemtMsg.nrsSco != null) {
  //     scoreModule += '坠床跌倒评分：' + vm.aboutFallDangerC.riskSco + '分、';
  //   } else {
  //     scoreModule += '坠床跌倒评分：' + vm.aboutFallDangerC.riskSco + '分；';
  //   }
  // }

  if (vm.systemtMsg.nrsSco != null) {
    scoreModule += '疼痛评分：' + vm.systemtMsg.nrsSco + '分；';
  }

  if (vm.aboutmorse.zf != null && vm.aboutmorse.zf != '') {
    scoreModule += 'Morse评分：' + vm.aboutmorse.zf + '分；';
  }

  /**
   * @ 疼痛评估
   */
  var nrsModule = '',
    innerTextA = [],
    innerTextB = [],
    innerTextC = [],
    nrsbwList = vm.systemList.nrsTtbwList,
    nrsbwqt = vm.systemtMsg.nrsTtbwQt,
    nsrbw = vm.systemtMsg.nrsTtbw,
    nrsxzList = vm.systemList.nrsTtxzList,
    nrsxzqt = vm.systemtMsg.nrsTtxzQt,
    nrsxz = vm.systemtMsg.nrsTtxz,
    nrssjList = vm.systemList.nrsTtsjList,
    nrskzList = vm.systemList.nrsTtkzList,
    nrssj = vm.systemtMsg.nrsTtsj,
    nrskz = vm.systemtMsg.nrsTtkz,
    nrsbz = vm.systemtMsg.nrsMemo;

  $.each(nrsbwList, function (idx, val) {
    if ($.inArray(val['infocode'], nsrbw) > -1) {
      innerTextA.push(val['info']);
    }
  });
  $.each(nrsxzList, function (idx, val) {
    if ($.inArray(val['infocode'], nrsxz) > -1) {
      innerTextB.push(val['info']);
    }
  });

  if (innerTextA != '' && nrsbwqt.replace(/ /img, '') != '') {
    nrsModule += '疼痛部位：' + innerTextA.join("，") + '，' + nrsbwqt + '，';
  } else if (innerTextA == '' && nrsbwqt.replace(/ /img, '') != '') {
    nrsModule += '疼痛部位：' + nrsbwqt + '，';
  } else if (innerTextA != '' && nrsbwqt.replace(/ /img, '') == '') {
    nrsModule += '疼痛部位：' + innerTextA.join("，") + '，';
  }

  if (innerTextB != '' && nrsxzqt.replace(/ /img, '') != '') {
    nrsModule += '疼痛性质：' + innerTextB.join("，") + '，' + nrsxzqt + '，';
  } else if (innerTextB == '' && nrsxzqt.replace(/ /img, '') != '') {
    nrsModule += '疼痛性质：' + nrsxzqt + '，';
  } else if (innerTextB != '' && nrsxzqt.replace(/ /img, '') == '') {
    nrsModule += '疼痛性质：' + innerTextB.join("，") + '，';
  }

  $.each(nrssjList, function (idx, val) {
    if (val['infocode'] == nrssj) {
      nrsModule += '疼痛时间' + nrssjList[idx].info + '，';
    }
  })
  $.each(nrskzList, function (idx, val) {
    if ($.inArray(val['infocode'], nrskz) > -1) {
      innerTextC.push(val['info']);
    }
  });

  if (innerTextC != '') {
    nrsModule += '疼痛控制：' + innerTextC.join("，") + '，';
  }
  if (nrsbz.replace(/ /img, '') != '') {
    nrsModule += nrsbz + '，';
  }

  /**
   * @ 神经系统评估
   */
  var neuralModule = '',
    selValA = '，',
    selValB = '，',
    innerTextD = [],
    sjxtysList = vm.systemList.sjxtpgYsCodList,
    sjxtpgYs = vm.systemtMsg.sjxtpgYsCod,
    yssubList = vm.systemList.sjxtpgYssubCodList,
    yssubbList = vm.systemList.sjxtpgYssubCodbList,
    yssub = vm.systemtMsg.sjxtpgYssubCod,
    yssubb = vm.systemtMsg.sjxtpgYssubCodb,
    sjxtyyList = vm.systemList.sjxtpgYyCodList,
    sjxtyy = vm.systemtMsg.sjxtpgYyCod,
    ztkzj = vm.systemtMsg.tkLefttkZj,
    ytkzj = vm.systemtMsg.tkRighttkZj,
    tkLefttkZtList = vm.systemList.tkLefttkZtCodList,
    tkLefttkZt = vm.systemtMsg.tkLefttkZtCod,
    leftDgfyList = vm.systemList.leftTbDgfyList,
    leftDgfy = vm.systemtMsg.leftTbDgfy,
    tkRighttkZtList = vm.systemList.tkRighttkZtCodList,
    tkRighttkZt = vm.systemtMsg.tkRighttkZtCod,
    rightDgfyList = vm.systemList.rightTbDgfyList,
    rightDgfy = vm.systemtMsg.rightTbDgfy,
    leftsJzSzList = vm.systemList.leftsJzSzCodList,
    leftsJzSz = vm.systemtMsg.leftsJzSzCod;
  if (yssub != '') {
    selValA = yssubList[yssub - 1].info + '，';
  }
  if (yssubb != '') {
    selValB = yssubbList[yssubb - 1].info + '，';
  }
  $.each(sjxtysList, function (idx, val) {
    if (idx != '0' && idx != '1') {
      if ($.inArray(val['infocode'], sjxtpgYs) > -1) {
        innerTextD.push(val['info']);
      }
    } else {
      if (idx == '0') {
        if ($.inArray(val['infocode'], sjxtpgYs) > -1) {
          neuralModule += '清醒' + selValA;
        }
      }
      if (idx == '1') {
        if ($.inArray(val['infocode'], sjxtpgYs) > -1) {
          neuralModule += '神昏' + selValB;
        }
      }
    }
  });

  $.each(sjxtyyList, function (idx, val) {
    if ($.inArray(val['infocode'], sjxtyy) > -1) {
      innerTextD.push(val['info']);
    }
  });
  if (innerTextD != '') {
    neuralModule += innerTextD.join("，") + '，';
  }

  if (ztkzj != '') {
    neuralModule += '左瞳孔直径' + ztkzj + 'mm，';
  }
  $.each(tkLefttkZtList, function (idx, val) {
    if (val['infocode'] == tkLefttkZt) {
      neuralModule += tkLefttkZtList[idx].info + '，';
    }
  })
  $.each(leftDgfyList, function (idx, val) {
    if (val['infocode'] == leftDgfy) {
      neuralModule += leftDgfyList[idx].info + '，';
    }
  })
  if (ytkzj != '') {
    neuralModule += '右瞳孔直径' + ytkzj + 'mm，';
  }
  $.each(tkRighttkZtList, function (idx, val) {
    if (val['infocode'] == tkRighttkZt) {
      neuralModule += tkRighttkZtList[idx].info + '，';
    }
  })
  $.each(rightDgfyList, function (idx, val) {
    if (val['infocode'] == rightDgfy) {
      neuralModule += rightDgfyList[idx].info + '，';
    }
  })

  var newinnerTextA = [];
  $.each(leftsJzSzList, function (idx, val) {
    if ($.inArray(val['infocode'], leftsJzSz) > -1) {
      newinnerTextA.push(val['info']);
    }
  });
  if (newinnerTextA != '') {
    neuralModule += '左上肢肌力：' + newinnerTextA.join("，") + '，';
  }

  var rightsJzSzList = vm.systemList.rightsJzSzCodList,
    rightsJzSz = vm.systemtMsg.rightsJzSzCod,
    newinnerTextB = [];
  $.each(rightsJzSzList, function (idx, val) {
    if ($.inArray(val['infocode'], rightsJzSz) > -1) {
      newinnerTextB.push(val['info']);
    }
  });
  if (newinnerTextB != '') {
    neuralModule += '右上肢肌力：' + newinnerTextB.join("，") + '，';
  }

  var leftxJzSzList = vm.systemList.leftxJzSzCodList,
    leftxJzSz = vm.systemtMsg.leftxJzSzCod,
    newinnerTextC = [];
  $.each(leftxJzSzList, function (idx, val) {
    if ($.inArray(val['infocode'], leftxJzSz) > -1) {
      newinnerTextC.push(val['info']);
    }
  });
  if (newinnerTextC != '') {
    neuralModule += '左下肢肌力：' + newinnerTextC.join("，") + '，';
  }

  var rightxJzSzList = vm.systemList.rightxJzSzCodList,
    rightxJzSz = vm.systemtMsg.rightxJzSzCod,
    newinnerTextD = [];
  $.each(rightxJzSzList, function (idx, val) {
    if ($.inArray(val['infocode'], rightxJzSz) > -1) {
      newinnerTextD.push(val['info']);
    }
  });
  if (newinnerTextD != '') {
    neuralModule += '右下肢肌力：' + newinnerTextD.join("，") + '，';
  }

  var leftsSjJzlList = vm.systemList.leftsSjJzlList,
    leftsSjJzl = vm.systemtMsg.leftsSjJzl;
  $.each(leftsSjJzlList, function (idx, val) {
    if (val['infocode'] == leftsSjJzl) {
      neuralModule += '左上肢肌张力' + leftsSjJzlList[idx].info + '，';
    }
  })

  var rightsSjJzlList = vm.systemList.rightsSjJzlList,
    rightsSjJzl = vm.systemtMsg.rightsSjJzl;
  $.each(rightsSjJzlList, function (idx, val) {
    if (val['infocode'] == rightsSjJzl) {
      neuralModule += '右上肢肌张力' + rightsSjJzlList[idx].info + '，';
    }
  })

  var leftxSjJzlList = vm.systemList.leftxSjJzlList,
    leftxSjJzl = vm.systemtMsg.leftxSjJzl;
  $.each(leftxSjJzlList, function (idx, val) {
    if (val['infocode'] == leftxSjJzl) {
      neuralModule += '左下肢肌张力' + leftxSjJzlList[idx].info + '，';
    }
  })

  var rightxSjJzlList = vm.systemList.rightxSjJzlList,
    rightxSjJzl = vm.systemtMsg.rightxSjJzl;
  $.each(rightxSjJzlList, function (idx, val) {
    if (val['infocode'] == rightxSjJzl) {
      neuralModule += '右下肢肌张力' + rightxSjJzlList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.sjxtpgMemo.replace(/ /img, '') != '') {
    neuralModule += vm.systemtMsg.sjxtpgMemo + '，';
  }

  if(vm.systemtMsg.xtpgSjFlg == '1'){
    neuralModule += '神经系统无明显异常，'
  }

  /**
   * @ 呼吸系统评估
   */
  var breathModule = '';
  var hxxtpgKsCodList = vm.systemList.hxxtpgKsCodList,
    hxxtpgKsCod = vm.systemtMsg.hxxtpgKsCod;
  $.each(hxxtpgKsCodList, function (idx, val) {
    if (val['infocode'] == hxxtpgKsCod) {
      breathModule += hxxtpgKsCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.hxxtpgKsQt.replace(/ /img, '') != '') {
    breathModule += vm.systemtMsg.hxxtpgKsQt + '，';
  }

  var hxxtpgTxxzCodList = vm.systemList.hxxtpgTxxzCodList,
    hxxtpgTxxzCod = vm.systemtMsg.hxxtpgTxxzCod;
  $.each(hxxtpgTxxzCodList, function (idx, val) {
    if (val['infocode'] == hxxtpgTxxzCod) {
      breathModule += hxxtpgTxxzCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.hxxtpgTxxzQt.replace(/ /img, '') != '') {
    breathModule += vm.systemtMsg.hxxtpgTxxzQt + '，';
  }

  var hxxtpgTlCodList = vm.systemList.hxxtpgTlCodList,
    hxxtpgTlCod = vm.systemtMsg.hxxtpgTlCod;
  $.each(hxxtpgTlCodList, function (idx, val) {
    if (val['infocode'] == hxxtpgTlCod) {
      breathModule += hxxtpgTlCodList[idx].info + '，';
    }
  })
  var hxxtgyfsList = vm.systemList.hxxtpgGyfsCodList,
    // hxxtgyfs = vm.systemtMsg.hxxtpgGyfsCod,
    innerTextE = [],
    hxxtgyfs;
  try {
    hxxtgyfs = vm.systemtMsg.hxxtpgGyfsCod.split(",");
  } catch (e) {
    hxxtgyfs = [];
  }
  $.each(hxxtgyfsList, function (idx, val) {
    if ($.inArray(val['infocode'], hxxtgyfs) > -1) {
      innerTextE.push(val['info']);
    }
  });
  if (innerTextE != '') {
    breathModule += innerTextE.join("，") + '，';
  }
  var gyList = [{ title: '给氧流量', codVal: 'hxxtpgGyll', unit: 'L/分，' }, { title: '氧浓度', codVal: 'hxxtpgYnd', unit: '%，' }, { title: '氧饱和度', codVal: 'hxxtpgYbhd', unit: '%，' }];
  $.each(gyList, function (index, value) {
    if (vm.systemtMsg[value.codVal] !== '') {
      breathModule += value.title + vm.systemtMsg[value.codVal] + value.unit
    }
  })

  var hxxtpgHxjcList = vm.systemList.hxxtpgHxjcList,
    hxxtpgHxjc = vm.systemtMsg.hxxtpgHxjc;
  $.each(hxxtpgHxjcList, function (idx, val) {
    if (val['infocode'] == hxxtpgHxjc) {
      if (hxxtpgHxjc == '0') {
        breathModule += hxxtpgHxjcList[idx].info + '呼吸急促，';
      }
      if (hxxtpgHxjc == '1') {
        breathModule += hxxtpgHxjcList[idx].info + '呼吸急促，';
      }
    }
  })

  var leftHxxtpgHxyCodList = vm.systemList.leftHxxtpgHxyCodList,
    leftHxxtpgHxyCod = vm.systemtMsg.leftHxxtpgHxyCod,
    innerWztext = [];
  $.each(leftHxxtpgHxyCodList, function (idx, val) {
    if ($.inArray(val['infocode'], leftHxxtpgHxyCod) > -1) {
      innerWztext.push(val['info']);
    }
  })
  if (innerWztext != '') {
    breathModule += '左呼吸音：' + innerWztext.join("，") + '，';
  }

  var rightHxxtpgHxyCodList = vm.systemList.rightHxxtpgHxyCodList,
    rightHxxtpgHxyCod = vm.systemtMsg.rightHxxtpgHxyCod,
    innerWztextB = [];;
  $.each(rightHxxtpgHxyCodList, function (idx, val) {
    if ($.inArray(val['infocode'], rightHxxtpgHxyCod) > -1) {
      innerWztextB.push(val['info']);
    }
  })
  if (innerWztextB != '') {
    breathModule += '右呼吸音：' + innerWztextB.join("，") + '，';
  }

  if (vm.systemtMsg.qgqkFlg == 1) {
    breathModule += '气管切开，';
  }
  if (vm.systemtMsg.qgqkQqtgxh.replace(/ /img, '') != '') {
    breathModule += '气切套管型号' + vm.systemtMsg.qgqkQqtgxh + '号，';
  }
  if (vm.systemtMsg.qgqkQgcgFlg == 1) {
    breathModule += '气管插管畅，';
  }
  if (vm.systemtMsg.qgqkXdgdsj != '') {
    breathModule += '系带固定松紧' + vm.systemtMsg.qgqkXdgdsj + '横指，';
  }
  if (vm.systemtMsg.qgqkQnyl != '') {
    breathModule += '气囊压力' + vm.systemtMsg.qgqkQnyl + 'cmH2O，';
  }
  if (vm.systemtMsg.qgqkQgqkchyFlg == 1) {
    breathModule += '气管切开处换药，';
  }
  if (vm.systemtMsg.qgqkQgqkbz.replace(/ /img, '') != '') {
    breathModule += vm.systemtMsg.qgqkQgqkbz + '，';
  }
  if (vm.systemtMsg.qgcgFlg == 1) {
    breathModule += '气管插管，';
  }
  if (vm.systemtMsg.qgcgQgdgxh.replace(/ /img, '') != '') {
    breathModule += '气切套管型号' + vm.systemtMsg.qgcgQgdgxh + '号，';
  }
  if (vm.systemtMsg.qgcgQgcg == 1) {
    breathModule += '气管插管畅，';
  }
  if (vm.systemtMsg.qgcgGdt == 1) {
    breathModule += '固定妥，';
  }
  if (vm.systemtMsg.qgcgJmc != '') {
    breathModule += '距门齿' + vm.systemtMsg.qgcgJmc + 'cm，';
  }
  if (vm.systemtMsg.hxgnxlFlg == 1) {
    breathModule += '呼吸功能训练，';
  }
  if (vm.systemtMsg.hxxtpgMemo.replace(/ /img, '') != '') {
    breathModule += vm.systemtMsg.hxxtpgMemo + '，';
  }
  if(vm.systemtMsg.xtpgHxFlg == '1'){
    breathModule += '呼吸系统无明显异常，'
  }

  /**
   * @ 心血管系统评估
   */
  var xinxgModule = '';
  if (vm.systemtMsg.xxgxtpgXdjhFlg == 1) {
    xinxgModule += '心电监护，';
  }
  if (vm.systemtMsg.xxgxtpgXlCs != '') {
    xinxgModule += '心率' + vm.systemtMsg.xxgxtpgXlCs + '次/分，';
  }

  var xxgxtpgXlZtCodList = vm.systemList.xxgxtpgXlZtCodList,
    xxgxtpgXlZtCod = vm.systemtMsg.xxgxtpgXlZtCod;
  $.each(xxgxtpgXlZtCodList, function (idx, val) {
    if (val['infocode'] == xxgxtpgXlZtCod) {
      xinxgModule += '心律' + xxgxtpgXlZtCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.xxgxtpgXmFlg == 1) {
    xinxgModule += '胸闷，';
  }
  if (vm.systemtMsg.xxgxtpgXtFlg == 1) {
    xinxgModule += '胸痛，';
  }
  if (vm.systemtMsg.xxgxtpgXjFlg == 1) {
    xinxgModule += '心悸，';
  }

  var zzXxgxtpgBdmbdCodList = vm.systemList.zzXxgxtpgBdmbdCodList,
    zzXxgxtpgBdmbdCod = vm.systemtMsg.zzXxgxtpgBdmbdCod;
  $.each(zzXxgxtpgBdmbdCodList, function (idx, val) {
    if (val['infocode'] == zzXxgxtpgBdmbdCod) {
      xinxgModule += '左足背动脉搏动' + zzXxgxtpgBdmbdCodList[idx].info + '，';
    }
  })

  var yzXxgxtpgBdmbdCodList = vm.systemList.yzXxgxtpgBdmbdCodList,
    yzXxgxtpgBdmbdCod = vm.systemtMsg.yzXxgxtpgBdmbdCod;
  $.each(yzXxgxtpgBdmbdCodList, function (idx, val) {
    if (val['infocode'] == yzXxgxtpgBdmbdCod) {
      xinxgModule += '右足背动脉搏动' + yzXxgxtpgBdmbdCodList[idx].info + '，';
    }
  })

  var zrXxgxtpgBdmbdCodList = vm.systemList.zrXxgxtpgBdmbdCodList,
    zrXxgxtpgBdmbdCod = vm.systemtMsg.zrXxgxtpgBdmbdCod;
  $.each(zrXxgxtpgBdmbdCodList, function (idx, val) {
    if (val['infocode'] == zrXxgxtpgBdmbdCod) {
      xinxgModule += '左桡动脉搏动' + zrXxgxtpgBdmbdCodList[idx].info + '，';
    }
  })

  var yrXxgxtpgBdmbdCodList = vm.systemList.yrXxgxtpgBdmbdCodList,
    yrXxgxtpgBdmbdCod = vm.systemtMsg.yrXxgxtpgBdmbdCod;
  $.each(yrXxgxtpgBdmbdCodList, function (idx, val) {
    if (val['infocode'] == yrXxgxtpgBdmbdCod) {
      xinxgModule += '右桡动脉搏动' + yrXxgxtpgBdmbdCodList[idx].info + '，';
    }
  })

  var xxgxtpgMxxgcyList = vm.systemList.xxgxtpgMxxgcyList,
    xxgxtpgMxxgcy = vm.systemtMsg.xxgxtpgMxxgcy;
  $.each(xxgxtpgMxxgcyList, function (idx, val) {
    if (val['infocode'] == xxgxtpgMxxgcy) {
      xinxgModule += '毛细血管充盈' + xxgxtpgMxxgcyList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.xxgxtpgMemo.replace(/ /img, '') != '') {
    xinxgModule += vm.systemtMsg.xxgxtpgMemo + '，';
  }
  if(vm.systemtMsg.xtpgXxgFlg == '1'){
    xinxgModule += '心血管系统无明显异常，'
  }


  /**
   * @ 消化系统评估
   */
  var digestModule = '';

  var xhxtpgYsCodList = vm.systemList.xhxtpgYsCodList,
    xhxtpgYsCod = vm.systemtMsg.xhxtpgYsCod;
  $.each(xhxtpgYsCodList, function (idx, val) {
    if (val['infocode'] == xhxtpgYsCod) {
      digestModule += xhxtpgYsCodList[idx].info + '，';
    }
  })

  var xhxtpgSyCodList = vm.systemList.xhxtpgSyCodList,
    xhxtpgSyCod = vm.systemtMsg.xhxtpgSyCod;
  $.each(xhxtpgSyCodList, function (idx, val) {
    if (val['infocode'] == xhxtpgSyCod) {
      digestModule += '食欲' + xhxtpgSyCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.xhxtpgExFlg == 1) {
    digestModule += '恶心，';
  }
  if (vm.systemtMsg.xhxtpgOtFlg == 1) {
    digestModule += '呕吐，';
  }
  if (vm.systemtMsg.xhxtpgOtYs.replace(/ /img, '') != '') {
    digestModule += '颜色' + vm.systemtMsg.xhxtpgOtYs + '，';
  }
  if (vm.systemtMsg.xhxtpgOtL.replace(/ /img, '') != '') {
    digestModule += '量' + vm.systemtMsg.xhxtpgOtL + 'ml，';
  }

  var xhxtpgFbpzList = vm.systemList.xhxtpgFbpzList,
    xhxtpgFbpz = vm.systemtMsg.xhxtpgFbpz;
  $.each(xhxtpgFbpzList, function (idx, val) {
    if (val['infocode'] == xhxtpgFbpz) {
      digestModule += '腹部膨隆' + xhxtpgFbpzList[idx].info + '，';
    }
  })

  var xhxtpgFbcgList = vm.systemList.xhxtpgFbcgList,
    xhxtpgFbcg = vm.systemtMsg.xhxtpgFbcg;
  $.each(xhxtpgFbcgList, function (idx, val) {
    if (val['infocode'] == xhxtpgFbcg) {
      digestModule += '腹部触感' + xhxtpgFbcgList[idx].info + '，';
    }
  })

  var xhxtpgFzCodList = vm.systemList.xhxtpgFzCodList,
    xhxtpgFzCod = vm.systemtMsg.xhxtpgFzCod;
  $.each(xhxtpgFzCodList, function (idx, val) {
    if (val['infocode'] == xhxtpgFzCod) {
      digestModule += '腹胀' + xhxtpgFzCodList[idx].info + '，';
    }
  })

  var xhxtpgFbytCodList = vm.systemList.xhxtpgFbytCodList,
    xhxtpgFbytCod = vm.systemtMsg.xhxtpgFbytCod,
    innerTextF = [];
  $.each(xhxtpgFbytCodList, function (idx, val) {
    if ($.inArray(val['infocode'], xhxtpgFbytCod) > -1) {
      innerTextF.push(val['info']);
    }
  });
  if (innerTextF != '') {
    digestModule += '腹部压痛：' + innerTextF.join("，") + '，';
  }
  if (vm.systemtMsg.xhxtpgFbfttFlg == 1) {
    digestModule += '腹部反跳痛，';
  }

  var xhxtpgCmyCodList = vm.systemList.xhxtpgCmyCodList,
    xhxtpgCmyCod = vm.systemtMsg.xhxtpgCmyCod;
  $.each(xhxtpgCmyCodList, function (idx, val) {
    if (val['infocode'] == xhxtpgCmyCod) {
      digestModule += '肠鸣音' + xhxtpgCmyCodList[idx].info + '，';
    }
  })

  var xhxtpgPbCodList = vm.systemList.xhxtpgPbCodList,
    xhxtpgPbCod = vm.systemtMsg.xhxtpgPbCod;
  $.each(xhxtpgPbCodList, function (idx, val) {
    if (val['infocode'] == xhxtpgPbCod) {
      digestModule += '排便' + xhxtpgPbCodList[idx].info + '，';
    }
  })

  if (vm.systemtMsg.xhxtpgFqcxFlg == 1) {
    digestModule += '腹腔冲洗，';
  }

  var digList = [{ title: '腹围', codVal: 'xhxtpgFw', unit: 'CM，' }, { title: 'TPN滴速', codVal: 'xhxtpgTpnds', unit: 'ml/H，' }, { title: 'PPN滴速', codVal: 'xhxtpgPpnds', unit: 'ml/H，' }];
  $.each(digList, function (index, value) {
    if (vm.systemtMsg[value.codVal] !== '') {
      digestModule += value.title + vm.systemtMsg[value.codVal] + value.unit
    }
  })
  if (vm.systemtMsg.xhxtpgMemo.replace(/ /img, '') != '') {
    digestModule += vm.systemtMsg.xhxtpgMemo + '，';
  }
  if(vm.systemtMsg.xtpgXhFlg == '1'){
    digestModule += '消化系统无明显异常，'
  }

  /**
   * @ 泌尿生殖系统评估
   */
  var mxszModlue = '';
  var mnszxtpgPnCodList = vm.systemList.mnszxtpgPnCodList,
    mnszxtpgPnCod = vm.systemtMsg.mnszxtpgPnCod,
    innerTextG = [];
  $.each(mnszxtpgPnCodList, function (idx, val) {
    if ($.inArray(val['infocode'], mnszxtpgPnCod) > -1) {
      innerTextG.push(val['info']);
    }
  });
  if (innerTextG != '') {
    mxszModlue += innerTextG.join("，") + '，';
  }

  var mnszxtpgNyxzCodList = vm.systemList.mnszxtpgNyxzCodList,
    mnszxtpgNyxzCod = vm.systemtMsg.mnszxtpgNyxzCod;
  $.each(mnszxtpgNyxzCodList, function (idx, val) {
    if (val['infocode'] == mnszxtpgNyxzCod) {
      mxszModlue += '尿液' + mnszxtpgNyxzCodList[idx].info + '，';
    }
  })

  if (vm.systemtMsg.mnszxtpgPgcxFlg == 1) {
    mxszModlue += '膀胱冲洗，';
  }

  var mnszxtpgTxCodList = vm.systemList.mnszxtpgTxCodList,
    mnszxtpgTxCod = vm.systemtMsg.mnszxtpgTxCod;
  $.each(mnszxtpgTxCodList, function (idx, val) {
    if (val['infocode'] == mnszxtpgTxCod) {
      mxszModlue += mnszxtpgTxCodList[idx].info + '，';
    }
  })

  var mnszxtpgDjmwCodList = vm.systemList.mnszxtpgDjmwCodList,
    mnszxtpgDjmwCod = vm.systemtMsg.mnszxtpgDjmwCod,
    innerTextH = [];
  $.each(mnszxtpgDjmwCodList, function (idx, val) {
    if ($.inArray(val['infocode'], mnszxtpgDjmwCod) > -1) {
      innerTextH.push(val['info']);
    }
  });
  if (innerTextH != '') {
    mxszModlue += '动静脉瘘：' + innerTextH.join("，") + '，';
  }

  var mnszxtpgRsztCodList = vm.systemList.mnszxtpgRsztCodList,
    mnszxtpgRsztCod = vm.systemtMsg.mnszxtpgRsztCod,
    innerTextI = [];
  $.each(mnszxtpgRsztCodList, function (idx, val) {
    if ($.inArray(val['infocode'], mnszxtpgRsztCod) > -1) {
      innerTextI.push(val['info']);
    }
  });
  if (innerTextI != '') {
    mxszModlue += '妊娠状态：' + innerTextI.join("，") + '，';
  }

  var mnszxtpgYjCodList = vm.systemList.mnszxtpgYjCodList,
    mnszxtpgYjCod = vm.systemtMsg.mnszxtpgYjCod,
    innerTextJ = [];
  $.each(mnszxtpgYjCodList, function (idx, val) {
    if ($.inArray(val['infocode'], mnszxtpgYjCod) > -1) {
      innerTextJ.push(val['info']);
    }
  });
  if (innerTextJ != '') {
    mxszModlue += innerTextJ.join("，") + '，';
  }

  var mnszxtpgBdCodList = vm.systemList.mnszxtpgBdCodList,
    mnszxtpgBdCod = vm.systemtMsg.mnszxtpgBdCod,
    innerTextK = [];
  $.each(mnszxtpgBdCodList, function (idx, val) {
    if ($.inArray(val['infocode'], mnszxtpgBdCod) > -1) {
      innerTextK.push(val['info']);
    }
  });
  if (innerTextK != '') {
    mxszModlue += '白带' + innerTextK.join("，") + '，';
  }
  if (vm.systemtMsg.mnszxtpgBdQt.replace(/ /img, '') != '') {
    mxszModlue += vm.systemtMsg.mnszxtpgBdQt + '，';
  }
  if (vm.systemtMsg.mnszxtpgMeno.replace(/ /img, '') != '') {
    mxszModlue += vm.systemtMsg.mnszxtpgMeno + '，';
  }
  if(vm.systemtMsg.xtpgMnFlg == '1'){
    mxszModlue += '泌尿生殖系统无明显异常，'
  }



  /**
   * @ 骨骼、肌、皮肤系统
   */
  var skinModule = '';
  var ggjpfxtPfysCodList = vm.systemList.ggjpfxtPfysCodList,
    ggjpfxtPfysCod = vm.systemtMsg.ggjpfxtPfysCod,
    innerTextL = [];
  $.each(ggjpfxtPfysCodList, function (idx, val) {
    if ($.inArray(val['infocode'], ggjpfxtPfysCod) > -1) {
      innerTextL.push(val['info']);
    }
  });
  if (innerTextL != '') {
    skinModule += '皮肤颜色：' + innerTextL.join("，") + '，';
  }

  var ggjpfxtPfwdCodList = vm.systemList.ggjpfxtPfwdCodList,
    ggjpfxtPfwdCod = vm.systemtMsg.ggjpfxtPfwdCod;
  $.each(ggjpfxtPfwdCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtPfwdCod) {
      skinModule += '皮肤温度' + ggjpfxtPfwdCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.ggjpfxtPfwdQt.replace(/ /img, '') != '') {
    skinModule += '皮肤温度其他：'+vm.systemtMsg.ggjpfxtPfwdQt + '，';
  }

  var ggjpfxtSzfwCodList = vm.systemList.ggjpfxtSzfwCodList,
    ggjpfxtSzfwCod = vm.systemtMsg.ggjpfxtSzfwCod,
    innerTextM = [];
  $.each(ggjpfxtSzfwCodList, function (idx, val) {
    if ($.inArray(val['infocode'], ggjpfxtSzfwCod) > -1) {
      innerTextM.push(val['info']);
    }
  });
  if (innerTextM != '') {
    skinModule += '水肿范围：' + innerTextM.join("，") + '，';
  }
  if (vm.systemtMsg.ggjpfxtSzfwQt.replace(/ /img, '') != '') {
    skinModule += vm.systemtMsg.ggjpfxtSzfwQt + '，';
  }

  var ggjpfxtSzxzCodList = vm.systemList.ggjpfxtSzxzCodList,
    ggjpfxtSzxzCod = vm.systemtMsg.ggjpfxtSzxzCod;
  $.each(ggjpfxtSzxzCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtSzxzCod) {
      skinModule += ggjpfxtSzxzCodList[idx].info + '，';
    }
  })

  var ggjpfxtSzcdCodList = vm.systemList.ggjpfxtSzcdCodList,
    ggjpfxtSzcdCod = vm.systemtMsg.ggjpfxtSzcdCod;
  $.each(ggjpfxtSzcdCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtSzcdCod) {
      skinModule += ggjpfxtSzcdCodList[idx].info + '，';
    }
  })

  var ggjpfxtBttCodList = vm.systemList.ggjpfxtBttCodList,
    ggjpfxtBttCod = vm.systemtMsg.ggjpfxtBttCod;
  $.each(ggjpfxtBttCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtBttCod) {
      skinModule += ggjpfxtBttCodList[idx].info + '，';
    }
  })

  var ggjpfxtKqnmCodList = vm.systemList.ggjpfxtKqnmCodList,
    ggjpfxtKqnmCod = vm.systemtMsg.ggjpfxtKqnmCod;
  $.each(ggjpfxtKqnmCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtKqnmCod) {
      skinModule += '口腔粘膜' + ggjpfxtKqnmCodList[idx].info + '，';
    }
  })

  var ggjpfxtZknmCodList = vm.systemList.ggjpfxtZknmCodList,
    ggjpfxtZknmCod = vm.systemtMsg.ggjpfxtZknmCod;
  $.each(ggjpfxtZknmCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtZknmCod) {
      skinModule += '造口粘膜' + ggjpfxtZknmCodList[idx].info + '，';
    }
  })

  if (vm.systemtMsg.ggjpfxtBhFlg == 1) {
    skinModule += '疤痕，';
  }

  var ggjpfxtSkbwCodList = vm.systemList.ggjpfxtSkbwCodList,
    ggjpfxtSkbwCod = vm.systemtMsg.ggjpfxtSkbwCod,
    innerTextN = [];
  $.each(ggjpfxtSkbwCodList, function (idx, val) {
    if ($.inArray(val['infocode'], ggjpfxtSkbwCod) > -1) {
      innerTextN.push(val['info']);
    }
  });
  if (innerTextN != '') {
    skinModule += '伤口部位：' + innerTextN.join("，") + '，';
  }
  if (vm.systemtMsg.ggjpfxtSkbwQt.replace(/ /img, '') != '') {
    skinModule += vm.systemtMsg.ggjpfxtSkbwQt + '，';
  }

  var ggjpfxtSkCodList = vm.systemList.ggjpfxtSkCodList,
    ggjpfxtSkCod = vm.systemtMsg.ggjpfxtSkCod;
  $.each(ggjpfxtSkCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtSkCod) {
      skinModule += ggjpfxtSkCodList[idx].info + '，';
    }
  })

  if (vm.systemtMsg.ggjpfxtYc.replace(/ /img, '') != '') {
    skinModule += '压疮' + vm.systemtMsg.ggjpfxtYc + '，';
  }

  if (vm.systemtMsg.ggjpfxtJzFlg == 1) {
    skinModule += '假肢，';
  }

  var ggjpfxtGdCodList = vm.systemList.ggjpfxtGdCodList,
    ggjpfxtGdCod = vm.systemtMsg.ggjpfxtGdCod;
  $.each(ggjpfxtGdCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtGdCod) {
      skinModule += '固定' + ggjpfxtGdCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.ggjpfxtGdQt.replace(/ /img, '') != '') {
    skinModule += vm.systemtMsg.ggjpfxtGdQt + '，';
  }

  var ggjpfxtHdfsCodList = vm.systemList.ggjpfxtHdfsCodList,
    ggjpfxtHdfsCod = vm.systemtMsg.ggjpfxtHdfsCod;
  $.each(ggjpfxtHdfsCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtHdfsCod) {
      skinModule += ggjpfxtHdfsCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.ggjpfxtHdfsQt.replace(/ /img, '') != '') {
    skinModule += vm.systemtMsg.ggjpfxtHdfsQt + '，';
  }

  var ggjpfxtKqyCodList = vm.systemList.ggjpfxtKqyCodList,
    ggjpfxtKqyCod = vm.systemtMsg.ggjpfxtKqyCod;
  $.each(ggjpfxtKqyCodList, function (idx, val) {
    if (val['infocode'] == ggjpfxtKqyCod) {
      skinModule += '口腔炎' + ggjpfxtKqyCodList[idx].info + '，';
    }
  })
  if (vm.systemtMsg.ggjpfxtMemo.replace(/ /img, '') != '') {
    skinModule += vm.systemtMsg.ggjpfxtMemo + '，';
  }
  if(vm.systemtMsg.xtpgGgFlg == '1'){
    skinModule += '骨骼、肌、皮肤系统无明显异常，'
  }



  /**
   * @ 心理社会评估
   */
  var xinliModule = '';
  var xlshpgJsztCodList = vm.systemList.xlshpgJsztCodList,
    xlshpgJsztCod = vm.systemtMsg.xlshpgJsztCod,
    innerTextO = [];
  $.each(xlshpgJsztCodList, function (idx, val) {
    if ($.inArray(val['infocode'], xlshpgJsztCod) > -1) {
      innerTextO.push(val['info']);
    }
  });
  if (innerTextO != '') {
    xinliModule += '精神状态：' + innerTextO.join("，") + '，';
  }
  if (vm.systemtMsg.xlshpgJsztQt.replace(/ /img, '') != '') {
    xinliModule += vm.systemtMsg.xlshpgJsztQt + '，';
  }
  if(vm.systemtMsg.xtpgXlFlg == '1'){
    xinliModule += '心理社会评估无明显异常，'
  }


  /**
   * @ 导管评估
   */
  var ductModule = '';
  var wzjmTcFlgList = vm.systemList.wzjmTcFlgList,
    wzjmTcFlg = vm.systemtMsg.wzjmTcFlg,
    wzflg = false;
  $.each(wzjmTcFlgList, function (idx, val) {
    if (val['infocode'] == wzjmTcFlg) {
      if (idx == '0') {
        ductModule += '外周静脉';
        wzflg = true;
      } else {
        wzflg = false;
      }
    }
  })
  if (vm.systemtMsg.wzjmGdt == 1) {
    ductModule += '固定妥，局部无红肿，无渗出，';
  } else if (vm.systemtMsg.wzjmGdt != 1 && wzflg == true) {
    ductModule += '，';
  }

  if (vm.systemtMsg.wzjmJwbyy.replace(/ /img, '') != '') {
    ductModule += '接微泵用药' + vm.systemtMsg.wzjmJwbyy + '，';
  }
  if (vm.systemtMsg.wzjmSd.replace(/ /img, '') != '') {
    ductModule += '速度' + vm.systemtMsg.wzjmSd + '，';
  }

  var wzjmGrjxFlgList = vm.systemList.wzjmGrjxFlgList,
    wzjmGrjxFlg = vm.systemtMsg.wzjmGrjxFlg;
  $.each(wzjmGrjxFlgList, function (idx, val) {
    if (val['infocode'] == wzjmGrjxFlg) {
      if (idx == '1') {
        ductModule += '感染迹象，';
      }
    }
  })

  var wzjmSfbgFlgList = vm.systemList.wzjmSfbgFlgList,
    wzjmSfbgFlg = vm.systemtMsg.wzjmSfbgFlg;
  $.each(wzjmSfbgFlgList, function (idx, val) {
    if (val['infocode'] == wzjmSfbgFlg) {
      if (idx == '0') {
        ductModule += '拔管，';
      }
    }
  })
  if (vm.systemtMsg.wzjmMemo.replace(/ /img, '') != '') {
    ductModule += vm.systemtMsg.wzjmMemo + '，';
  }

  var cvcDgpgCctjCodList = vm.systemList.cvcDgpgCctjCodList;
  if (vm.systemtMsg.cvcDgpgCctjCod != '') {
    ductModule += 'CVC穿刺途径' + cvcDgpgCctjCodList[vm.systemtMsg.cvcDgpgCctjCod - 1].info + '，';
  }

  var cvcDgxhCodList = vm.systemList.cvcDgxhCodList;
  if (vm.systemtMsg.cvcDgxhCod != '') {
    ductModule += '导管型号' + cvcDgxhCodList[vm.systemtMsg.cvcDgxhCod - 1].info + '，';
  }

  if (vm.systemtMsg.cvcZgsd != '') {
    ductModule += '置管深度' + vm.systemtMsg.cvcZgsd + 'cm，';
  }
  if (vm.systemtMsg.cvcJwbyy.replace(/ /img, '') != '') {
    ductModule += '接微泵用药' + vm.systemtMsg.cvcJwbyy + '，';
  }
  if (vm.systemtMsg.cvcJwbyySd.replace(/ /img, '') != '') {
    ductModule += '速度' + vm.systemtMsg.cvcJwbyySd + '，';
  }

  var cvcGrjxFlgList = vm.systemList.cvcGrjxFlgList,
    cvcGrjxFlg = vm.systemtMsg.cvcGrjxFlg;
  $.each(cvcGrjxFlgList, function (idx, val) {
    if (val['infocode'] == cvcGrjxFlg) {
      if (idx == '1') {
        ductModule += '感染迹象，';
      }
    }
  })

  var cvcHyFlgList = vm.systemList.cvcHyFlgList,
    cvcHyFlg = vm.systemtMsg.cvcHyFlg;
  $.each(cvcHyFlgList, function (idx, val) {
    if (val['infocode'] == cvcHyFlg) {
      if (idx == '1') {
        ductModule += '换药，';
      }
    }
  })

  if (vm.systemtMsg.cvcMemo.replace(/ /img, '') != '') {
    ductModule += vm.systemtMsg.cvcMemo + '，';
  }

  var piccDgxhList = vm.systemList.piccDgxhList;
  if (vm.systemtMsg.piccDgxh != '') {
    ductModule += 'PICC导管型号' + piccDgxhList[vm.systemtMsg.piccDgxh - 1].info + '，';
  }

  if (vm.systemtMsg.piccDgxhNz.replace(/ /img, '') != '') {
    ductModule += '内置' + vm.systemtMsg.piccDgxhNz + 'cm，';
  }

  if (vm.systemtMsg.piccDgxhWz.replace(/ /img, '') != '') {
    ductModule += '外置' + vm.systemtMsg.piccDgxhWz + 'cm，';
  }

  var sygDgpgCctjCodList = vm.systemList.sygDgpgCctjCodList;
  if (vm.systemtMsg.sygDgpgCctjCod != '') {
    ductModule += '输液港穿刺途径' + sygDgpgCctjCodList[vm.systemtMsg.sygDgpgCctjCod - 1].info + '，';
  }

  var sygCctjTcFlgList = vm.systemList.sygCctjTcFlgList,
    sygCctjTcFlg = vm.systemtMsg.sygCctjTcFlg;
  $.each(sygCctjTcFlgList, function (idx, val) {
    if (val['infocode'] == sygCctjTcFlg) {
      if (idx == '0') {
        ductModule += '通畅，';
      }
    }
  })

  if (vm.systemtMsg.sygJwbyy.replace(/ /img, '') != '') {
    ductModule += '接微泵用药' + vm.systemtMsg.sygJwbyy + '，';
  }
  if (vm.systemtMsg.sygSd.replace(/ /img, '') != '') {
    ductModule += '速度' + vm.systemtMsg.sygSd + '，';
  }

  var sygGrjxFlgList = vm.systemList.sygGrjxFlgList,
    sygGrjxFlg = vm.systemtMsg.sygGrjxFlg;
  $.each(sygGrjxFlgList, function (idx, val) {
    if (val['infocode'] == sygGrjxFlg) {
      if (idx == '1') {
        ductModule += '感染迹象，';
      }
    }
  })

  var sygDxzccFlgList = vm.systemList.sygDxzccFlgList,
    sygDxzccFlg = vm.systemtMsg.sygDxzccFlg;
  $.each(sygDxzccFlgList, function (idx, val) {
    if (val['infocode'] == sygDxzccFlg) {
      if (idx == '1') {
        ductModule += '蝶形针穿刺，';
      }
    }
  })

  var sygBdxzFlgList = vm.systemList.sygBdxzFlgList,
    sygBdxzFlg = vm.systemtMsg.sygBdxzFlg;
  $.each(sygBdxzFlgList, function (idx, val) {
    if (val['infocode'] == sygBdxzFlg) {
      if (idx == '1') {
        ductModule += '拔蝶形针，';
      }
    }
  })
  if (vm.systemtMsg.sygQt.replace(/ /img, '') != '') {
    ductModule += vm.systemtMsg.sygQt + '，';
  }

  var tblength = document.getElementById('ducttable').rows.length,
    dgmc = '',
    dgmcVal = '',
    dgsd = '',
    dgsdVal = '',
    tcflg = '',
    tcflgVal = '',
    ylgys = '',
    ylgysVal = '';
  for (var i = 0; i < tblength; i++) {
    dgmcVal = $('#addA' + i).val();
    if (dgmcVal != '') {
      dgmc = '导管名称' + dgmcVal + '，'
    } else {
      dgmc = '';
    }

    dgsdVal = $('#addB' + i).val();
    if (dgsdVal != '') {
      dgsd = '导管深度' + dgsdVal + 'cm，';
    } else {
      dgsd = '';
    }

    tcflgVal = $('#addC' + i + ' option:selected').text();
    if (tcflgVal == '是') {
      tcflg = '通畅，';
    } else {
      tcflg = '';
    }

    ylgysVal = $('#addD' + i).val();
    if (ylgysVal != '') {
      ylgys = '引流液颜色' + ylgysVal + '，';
    } else {
      ylgys = '';
    }

    ductModule += dgmc + dgsd + tcflg + ylgys;
  }

  var ylgGrjxFlgList = vm.systemList.ylgGrjxFlgList,
    grjxVal = '';
  if (vm.systemtMsg.ylgGrjxFlg != '') {
    grjxVal = ylgGrjxFlgList[vm.systemtMsg.ylgGrjxFlg].info;
  }
  if (grjxVal == '有') {
    ductModule += '感染迹象，'
  }

  var ylgBgFlgList = vm.systemList.ylgBgFlgList,
    bgVal = '';
  if (vm.systemtMsg.ylgBgFlg != '') {
    bgVal = ylgBgFlgList[vm.systemtMsg.ylgBgFlg].info;
  }
  //  console.log('bgVal',bgVal)
  if (bgVal == '否') {
    ductModule += '拔管，'
  }

  var tblengthQt = document.getElementById('ducttableA').rows.length,
    dgmc = '',
    dgmcVal = '',
    dgsd = '',
    dgsdVal = '',
    tcflg = '',
    tcflgVal = '',
    ylgys = '',
    ylgysVal = '';
  for (var i = 0; i < tblengthQt; i++) {
    dgmcVal = $('#addE' + i).val();
    if (dgmcVal != '') {
      dgmc = '导管名称' + dgmcVal + '，'
    } else {
      dgmc = '';
    }

    dgsdVal = $('#addF' + i).val();
    if (dgsdVal != '') {
      dgsd = '导管深度' + dgsdVal + 'cm，';
    } else {
      dgsd = '';
    }

    tcflgVal = $('#addG' + i + ' option:selected').text();
    if (tcflgVal == '是') {
      tcflg = '通畅，';
    } else {
      tcflg = '';
    }

    ylgysVal = $('#addH' + i).val();
    if (ylgysVal != '') {
      ylgys = '引流液颜色' + ylgysVal + '，';
    } else {
      ylgys = '';
    }

    ductModule += dgmc + dgsd + tcflg + ylgys;
  }

  var qtGrjxFlgList = vm.systemList.qtGrjxFlgList,
    grjxVal = '';
  if (vm.systemtMsg.qtGrjxFlg != '') {
    grjxVal = qtGrjxFlgList[vm.systemtMsg.qtGrjxFlg].info;
  }
  if (grjxVal == '有') {
    ductModule += '感染迹象，'
  }

  var qtBgFlgList = vm.systemList.qtBgFlgList,
    bgVal = '';
  if (vm.systemtMsg.qtBgFlg != '') {
    bgVal = qtBgFlgList[vm.systemtMsg.qtBgFlg].info;
  }
  //  console.log('bgVal',bgVal)
  if (bgVal == '否') {
    ductModule += '拔管，'
  }

  var xtpgAqcsCodList = vm.systemList.xtpgAqcsCodList,
    xtpgAqcsCod = vm.systemtMsg.xtpgAqcsCod,
    innerTextW = [];
  $.each(xtpgAqcsCodList, function (idx, val) {
    if ($.inArray(val['infocode'], xtpgAqcsCod) > -1) {
      innerTextW.push(val['info']);
    }
  });
  if (innerTextW != '') {
    ductModule += innerTextW.join("、") + '，';
  }
  if(vm.systemtMsg.xtpgDgFlg == '0'){
    ductModule += '无导管，'
  }

  AllMoudel = scoreModule + nrsModule + neuralModule + breathModule + xinxgModule + digestModule + mxszModlue + skinModule + xinliModule + ductModule;
  return AllMoudel;
}

function connectFieldbig() {
  var allField = connectField();
  if (allField != '') {
    $('#bigDataDiv').show();
    var finalField = allField.substring(0, allField.length - 1);//截取开始到长度减-1的字符串，去掉逗号
    finalField += ';';
    vm.systemtMsg.xtpgJlhz = finalField;
  } else if (allField == '') {
    publicFun.alert("请先填写系统评估单！");
    vm.systemtMsg.xtpgJlhz = '';
  }
}