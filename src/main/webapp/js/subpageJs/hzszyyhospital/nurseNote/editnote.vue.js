/**
 * 病情护理记录 修改 [从avalon => vue]
 * @date    2019/03/11
 * @author  yhl
 */
var today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss')
var sub = new Vue({
  el: '#editNote',
  mixins: [mixinNote],
  data: {
    notePatientMsg: {
      /// ///////////////////////////////////  hsphljldlnfCustom
      tmpNbrFlg: '1', // 体温标识
      breNbrFlg: '1', // 呼吸标识
      sbpNbrFlg: '1', // 血压标识
      xyFlg: '1', // 血氧标识,
      xtFlg: '1', // 血糖标识
      emgSeq: _emgSeq, // 预检号
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
      sjhsUsrno: '', // 上级护士num
      hsUsrno: '', // 护士num
      crtDat: '', // 创建时间
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
    this.Loading()
    this.getMsgList()
    this.getPatientList()
    setTimeout(function () {
      sub.LoadEnd()
    }, 1000)
  },
  methods: {
    // 获取新增的数据并赋值
    getPatientList: function () {
      var getPatientListUrl = _baseUrl + 'zjszyyhljld/findhljldBybehiSeq.do?bqhiSeq=' +  $('#bqhiSeq').val();
      publicFun.httpServer({ url: getPatientListUrl }, {}, function (data) {
        var res = data.resultInfo.sysdata.hsphljldinf
        var listData = data.resultInfo.sysdata
        for (var key in res) {
          if (sub.notePatientMsg.hasOwnProperty(key)) {
            if (res[key] === null) {
              res[key] = ''
            }
            if (key === 'jchl' || key === 'tkLeftCod' || key === 'tkRightCod') {
              if (res[key] !== '') {
                res[key] = res[key].split(',')
              } else {
                res[key] = []
              }
            }
            if (key === 'bqgc') {
              if (res['bqgcHex'] !== '' && res['bqgcHex'] !== null) {
                if (res[key].indexOf('？') > -1) {
                  res[key] = sub.hexToString(res['bqgcHex'])
                }
              }
            }
            sub.notePatientMsg[key] = res[key]
            if (key === 'crtDat') {
              sub.notePatientMsg[key] = publicFun.timeFormat(new Date(res['crtDat']), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'rssj') {
              sub.notePatientMsg[key] = publicFun.timeFormat(new Date(res['rssj']), 'yyyy/MM/dd hh:mm:ss')
            }
            if (key === 'xt') {
              if (res[key] != '' && res[key] != null) {
                sub.notePatientMsg[key] = parseFloat(res['xt']).toFixed(1)
              }
            }
            if (key === 'sjhsUsrname') {
              $('#username').val(res[key])
            }
          }
          if (sub.aboutSco.hasOwnProperty(key)) {
            sub.aboutSco[key] = res[key]
          }
        }
        var rlRes = JSON.parse(JSON.stringify(listData.rllist))
        var clRes = JSON.parse(JSON.stringify(listData.cllist))
        sub.setInAndOutVal(rlRes, clRes)
      })
    },
    setInAndOutVal: function (rlRes, clRes) {
      var rlLen = rlRes.length
      var clLen = clRes.length
      for (var i = 1; i < rlLen; i++) {
        sub.getMsg.amountList.push({
          typeA: 'rlType' + i,
          typeB: 'rl' + i,
          typeC: 'rlNature' + i,
          typeD: 'rlOther' + i
        })
      }
      for (var j = 1; j < clLen; j++) {
        sub.getMsg.amountListB.push({
          typeA: 'clType' + j,
          typeB: 'cl' + j,
          typeC: 'clNature' + j,
          typeD: 'clOther' + j
        })
      }
      var _nullKeyList = ['code', 'crll', 'xz', 'other'];
      rlRes.forEach(function (item, index) {
        var _index = index == 0 ? '' : index;
        for (var i = 0; i < _nullKeyList.length; i++) {
          if (item[_nullKeyList[i]] == 'null') {
            item[_nullKeyList[i]] = ''
          }
        }
        sub.hide['rlType' + _index] = item.code
        sub.hide['rl' + _index] = item.crll
        sub.hide['rlNature' + _index] = item.xz
        sub.hide['rlOther' + _index] = item.other
      })
      clRes.forEach(function (item, index) {
        var _index = index == 0 ? '' : index
        for (var i = 0; i < _nullKeyList.length; i++) {
          if (item[_nullKeyList[i]] == 'null') {
            item[_nullKeyList[i]] = ''
          }
        }
        sub.hide['clType' + _index] = item.code
        sub.hide['cl' + _index] = item.crll
        sub.hide['clNature' + _index] = item.xz
        sub.hide['clOther' + _index] = item.other
      })
    },
    Loading: function () {
      $('<div class="datagrid-mask"></div>')
        .css({ display: 'block', width: '100%', height: $(window).height() })
        .appendTo('body')
      $('<div class="datagrid-mask-msg"></div>')
        .html('正在处理，请稍候...')
        .appendTo('body')
        .css({
          display: 'block',
          left: ($(document.body).outerWidth(true) - 190) / 2,
          top: ($(window).height() - 45) / 2
        })
    },
    LoadEnd: function () {
      $('.datagrid-mask').remove()
      $('.datagrid-mask-msg').remove()
    },
    // //utf8和16进制相互转换
    hexToString: function (s1) {
      var tmp2 = ''

      var res = ''
      for (i = 0; i < s1.length;) {
        tmp2 += '%' + s1.substring(i, (i += 2))
      }
      res = decodeURI(tmp2)
      // var _list = [{ sym: '，', cod: '%2C' }, { sym: '+', cod: '%2B' }, { sym: '？', cod: '%3F' }, { sym: '。', cod: '%2E' }, { sym: '-', cod: '%2D' }, { sym: '；', cod: '%3B' }];
      for (var int = 0; int < res.length / 3; int++) {
        if (res.indexOf('%2C') > -1) {
          res = res.replace('%2C', '，')
        } else if (res.indexOf('%2B') > -1) {
          res = res.replace('%2B', '+')
        } else if (res.indexOf('%3F') > -1) {
          res = res.replace('%3F', '？')
        } else if (res.indexOf('%2E') > -1) {
          res = res.replace('%2E', '。')
        } else if (res.indexOf('%2D') > -1) {
          res = res.replace('%2D', '-')
        } else if (res.indexOf('%3B') > -1) {
          res = res.replace('%3B', '；')
        } else {
          break
        }
      }
      return res
    }
  }
})
