<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>病人基本信息</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/hzxq.css?5555">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript">
    var _baseUrl = '${baseurl}';
    $(function () {
      getAllList();
      setIframeDivHeight();
      getPatientMsgDetail();
    });
    
    function setIframeDivHeight() {
      var iframeHeight = window.parent.iframeHeight;
      $('.patient-main-msg').height(iframeHeight - 2);
      $('.min-tab-container').height(iframeHeight - 56);
    }

    function getPatientMsgDetail() {
      var childPatientMsg = window.parent.patientMsg;
      setBasicMsg(childPatientMsg);
    }

    function setBasicMsg(res) {
      $.each(res, function (key, val) {
        if (vm.patientMsg.hasOwnProperty(key) && val != '' && val != null) {
          vm.patientMsg[key] = val
          if (key === 'patientTyp') {
            if (val == '2') {
              $('.tab-panel').hide();
              $('.pews-panel').show();
              minSubTab(3)
            } else {
              $('.pews-panel').hide();
              $('.tab-panel').show();
              minSubTab(0)
            }
          }
        }
      });
    }
    
    var jsbrjz;
    function getAllList () {
      publicFun.httpServer({ url: _baseUrl + 'hzszyyemg/findEmgList_zyy.do', isAsync: false }, {_t: Date.parse(new Date())}, function (res) {
        jsbrjz = res.resultInfo.sysdata;
      })
    }
    
    var vm = avalon.define({
      $id: "basicInformation",
      patientMsg: {
        patientTyp: '', // 患者类别
        grnChl: 0, // 绿色通道
        grnChlRsn: '', // 绿色通道
        bthDat: '', // 出生日期
        pheNbr: '', // 联系方式
        cstAdr: '', //地址
        preDgnCod: '', // 主述症状
        jbzdDes: '', // 诊断
        algHon: '', // 是否过敏
        algTypCod: '', // 过敏史
        algTypDes: '', // 过敏史其他
        pastHisCod: '', // 既往史
        pastHis: '', // 既往史其他
        abnSco: '', // 其他医院送入
        senRctCod: '', // 清醒程度
        eyeRctCod: '', // 睁眼反应
        lanRctCod: '', // 语言反应
        actRctCod: '', // 肢体反应
        refusedSurvey: '', // 异常项
        sqlStaCod: '', // 转归
        sqlDat: '', // 转归时间
        cstDspCodNameNew: '', //转归科室
        cstDepCodNew: '', // 住院科室
        sqlDes: '', // 转院
        mewsTotSco: '无', //mews评分
        breNbr: '', // 呼吸
        tmpNbr: '', // 体温
        sbpUpNbr: '', // 血压上压
        sbpDownNbr: '', // 血压下压
        hrtRte: '', // 心率
        senRctCod: '', // 清醒程度
        senRctCodStr: '', // 清醒程度
        senStuCod: '', // 意识状态
        nrsSco: '无', // nrs评分
        gcsTotSco: '无', // gcs评分:
        eyeRctCod: '', // 睁眼反应 
        eyeRctCodStr: '', // 睁眼反应 
        lanRctCod: '', // 语言反应 
        lanRctCodStr: '', // 语言反应
        actRctCod: '', // 肢体反应 
        actRctCodStr: '', // 肢体反应 
        cramsTotSco: '无', // crams评分 
        cirLvlCod: '', // 循环反应 
        cirLvlCodStr: '', // 循环反应 
        breLvlCod: '', // 呼吸反应 
        breLvlCodStr: '', // 呼吸反应 
        bdyLvlCod: '', // 胸腹部反应 
        bdyLvlCodStr: '', // 胸腹部反应 
        sptLvlCod: '', // 运动反应 
        sptLvlCodStr: '', // 运动反应 
        lanLvlCod: '', // 语言反应 
        lanLvlCodStr: '', // 语言反应
        cspgCod: '',//创伤评估
        cspgFlg: '',//创伤checkbox是否选中
        xtCod: '', //胸痛
        xtSubCod: '',
        xtFlg: '',//胸痛checkbox是否选中
        czFlg: '', // 卒中
        wlCod: '',
        szthCod: '',
        mtCod: '',
        hxknFlg: '',//呼吸困难checkbox是否选中
        hxknSubCod: '',
        hxknCod: '', //呼吸困难
        xfztFlg: '',
        nrsTtbw: '',
        nrsTtbwQt: '',
        nrsTtxz: '',
        nrsTtxzQt: '',
        nrsTtsj: '',
        nrsTtkz: '',
        nrsMemo: '',
        falAssCod: '',
        pregnantGsplCod: '',
        pregnantYdcxCod: '',
        pewsSco: '无',
        actionCod: '',
        xxgSkinCod: '',
        xxgCrtCod: '',
        xxgXlCod: '',
        hxPlCod: '',
        hxXhCod: '',
        hxFio2Cod: ''
      },
      getMsgList: {
        actionCodList: [{ info: '活泼/适境', infocode: '0' }, { info: '思睡或哭吵易安慰', infocode: '1' }, { info: '烦躁或哭闹难以安慰', infocode: '2' }, { info: '嗜睡/意识模糊或对疼痛反应降低', infocode: '3' }],
        xxgSkinCodList: [{ info: '肤色红', infocode: '0' }, { info: '苍白 / 灰暗', infocode: '1' }, { info: '苍灰 / 发紫', infocode: '2' }, { info: '苍灰 / 发紫、花斑', infocode: '3' }],
        xxgCrtCodList: [{ info: '1 - 2秒', infocode: '0' }, { info: '3秒', infocode: '1' }, { info: '4秒', infocode: '2' }, { info: '> 5秒', infocode: '3' }],
        xxgXlCodList: [{ info: '正常', infocode: '0' }, { info: '正常', infocode: '1' }, { info: '增快 > 20次 / 分', infocode: '2' }, { info: '增快 > 30次 / 分或心动过缓', infocode: '3' }],
        hxPlCodList: [{ info: '正常', infocode: '0' }, { info: '增快 > 10次 / 分', infocode: '1' }, { info: '增快 > 20次 / 分', infocode: '2' }, { info: '增快 > 5次 / 分', infocode: '3' }],
        hxXhCodList: [{ info: '无', infocode: '0' }, { info: '动用辅助呼吸肌', infocode: '1' }, { info: '有吸凹', infocode: '2' }, { info: ' 伴有吸凹、呻吟', infocode: '3' }],
        hxFio2CodList: [{ info: '无', infocode: '0' }, { info: '氧疗≥30 % 或3L / min', infocode: '1' }, { info: '氧疗≥40 % 或6L / min', infocode: '2' }, { info: '氧疗≥50 % 或8L / min', infocode: '3' }]
      },
      cspgBox: function () {
        createmodalwindow("创伤标志", 450, 400, _baseUrl + 'emg/querycspg.do')
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
      NRSbox: function () {
        createmodalwindow('NRS评分', 1000, 260, _baseUrl + 'hzszyyemg/querynrs.do')
      },
      riskBox: function () {
        createmodalwindow('跌倒评估', 800, 450, _baseUrl + 'hzszyyemg/queryRisk.do')
      },
      isInRange: function (val, min, max) {
        if (isNaN(parseInt(val))) {
          return false
        }
        if (min && !max) {
          return val >= min
        }
        if (!min && max) {
          return val <= max
        }
        if (min && max) {
          return (val >= min) && (val <= max)
        }
      }
    });

    function minSubTab(eq) {
      $('.patient-mark-msg .min-tab-btn').removeClass('active').eq(eq).addClass('active');
      $('.patient-mark-msg .min-tab-container').hide().eq(eq).show();
    }
  </script>
</head>

<body class="basicInformation" ms-controller="basicInformation">
  <div class="patient-main-msg">
    <table>
      <tr ms-if="patientMsg.grnChl">
        <th>绿色通道：</th>
        <td>{{patientMsg.grnChlRsn}}</td>
      </tr>
      <tr>
        <th>出生日期：</th>
        <td>
          <i ms-if="patientMsg.bthDat">
            {{patientMsg.bthDat | date("yyyy/MM/dd")}}
          </i>
        </td>
      </tr>
      <tr>
        <th>联系方式：</th>
        <td>{{patientMsg.pheNbr}}</td>
      </tr>
      <tr>
        <th>地&emsp;址：</th>
        <td>{{patientMsg.cstAdr}}</td>
      </tr>
    </table>
    <hr class="dotted">
    <table>
      <tr>
        <th>主诉症状：</th>
        <td>{{patientMsg.preDgnCod}}</td>
      </tr>
      <tr>
        <th>诊&emsp;断：</th>
        <td>{{patientMsg.jbzdDes}}</td>
      </tr>
      <tr>
        <th>清醒程度：</th>
        <td>{{patientMsg.senRctCodStr}}</td>
      </tr>
      <tr>
        <th>意识状态：</th>
        <td>{{patientMsg.senStuCod}}</td>
      </tr>
      <tr ms-if="patientMsg.patientTyp == 3">
        <th>阴道出血：</th>
        <td>{{patientMsg.pregnantYdcxCod}}</td>
      </tr>
      <tr ms-if="patientMsg.patientTyp == 3">
        <th>宫缩频率：</th>
        <td>{{patientMsg.pregnantGsplCod}}</td>
      </tr>
      <tr>
        <th>病种评估：</th>
        <td>
          <div class="trauma-container">
            <input class="hidden" id="cspgFlg" type="text" ms-duplex-string="patientMsg.cspgFlg">
            <input class="hidden" type="text" id="emg_cspgCod" ms-duplex-string="patientMsg.cspgCod">
            <a class="score-description score-small" href="javascript:;" ms-click="cspgBox()" ms-class="active: patientMsg.cspgCod">创伤</a>
          </div>
          <div class="chest-pain-container">
            <input class="hidden" id="xtFlg" type="text" ms-duplex-string="patientMsg.xtFlg">
            <input class="hidden" id="emg_xtCod" type="text" ms-duplex-string="patientMsg.xtCod">
            <input class="hidden" id="emg_xtSubCod" type="text" ms-duplex-string="patientMsg.xtSubCod">
            <a class="score-description score-small" href="javascript:;" ms-click="xtzbpgBox()" ms-class="active: patientMsg.xtCod">胸痛</a>
          </div>
          <div class="chest-distress-container">
            <input class="hidden" type="text" id="emg_mtCod" ms-duplex-string="patientMsg.mtCod">
            <input class="hidden" type="text" id="emg_szthCod" ms-duplex-string="patientMsg.szthCod">
            <input class="hidden" type="text" id="emg_wlCod" ms-duplex-string="patientMsg.wlCod">
            <input class="hidden" id="czFlg" type="text" ms-duplex-string="patientMsg.czFlg">
            <a class="score-description score-small" href="javascript:;" ms-click="czFaceBox()" ms-class="active: patientMsg.czFlg==1">卒中</a>
          </div>
          <div class="breathe-hard-container">
            <input class="hidden" id="hxknFlg" type="text" ms-duplex-string="patientMsg.hxknFlg">
            <input class="hidden" id="emg_hxknCod" type="text" ms-duplex-string="patientMsg.hxknCod">
            <input class="hidden" id="emg_hxknSubCod" type="text" ms-duplex-string="patientMsg.hxknSubCod">
            <a class="score-description score-des" href="javascript:;" ms-click="hxknzbBox()" ms-class="active: patientMsg.hxknCod">呼吸困难</a>
          </div>
          <div class="chest-distress-container">
            <label for="xfztFlg">
              <input class="hidden" type="text" ms-duplex-string="patientMsg.xfztFlg">
              <a class="score-description score-des" href="javascript:;" ms-class="active: patientMsg.xfztFlg==1">心肺骤停</a>
            </label>
          </div>
        </td>
      </tr>
      <tr>
        <th>疼痛评分：</th>
        <td>
          {{patientMsg.nrsSco}}<i ms-visible="patientMsg.nrsSco !== '无'">分</i>
          <input class="hidden" id="emg_nrsSco" type="text" ms-duplex-string="patientMsg.nrsSco">
          <a class="score-description" href="javascript:;" ms-click="NRSbox()">NRS</a>
          <input type="text" class="hidden" id="emg_nrsTtbw" ms-duplex-string="patientMsg.nrsTtbw">
          <input type="text" class="hidden" id="emg_nrsTtbwQt" ms-duplex-string="patientMsg.nrsTtbwQt">
          <input type="text" class="hidden" id="emg_nrsTtxz" ms-duplex-string="patientMsg.nrsTtxz">
          <input type="text" class="hidden" id="emg_nrsTtxzQt" ms-duplex-string="patientMsg.nrsTtxzQt">
          <input type="text" class="hidden" id="emg_nrsTtsj" ms-duplex-string="patientMsg.nrsTtsj">
          <input type="text" class="hidden" id="emg_nrsTtkz" ms-duplex-string="patientMsg.nrsTtkz">
          <input type="text" class="hidden" id="emg_nrsMemo" ms-duplex-string="patientMsg.nrsMemo">
        </td>
      </tr>
      <tr>
        <th>跌倒评估：</th>
        <td>
          <span ms-visible="patientMsg.falAssCod !== '#' && patientMsg.falAssCod !== '' && patientMsg.falAssCod != null">高危</span>
          <span ms-visible="patientMsg.falAssCod === '#'">非高危</span>
          <a class="score-description necessarySco" href="javascript:;" ms-click="riskBox()">高危跌倒</a>
          <input type="text" id="emg_falAssCod" ms-duplex-string="patientMsg.falAssCod" class="hidden">
        </td>
      </tr>
      <tr>
        <th>过敏史：</th>
        <td>
          <i ms-if="patientMsg.algHon == 0">无</i>
          <i ms-if="patientMsg.algHon == 1">不详</i>
          <i ms-if="patientMsg.algHon == 2">{{patientMsg.algTypCod}} {{patientMsg.algTypDes}}</i>
        </td>
      </tr>
      <tr>
        <th>既往史：</th>
        <td>{{patientMsg.pastHisCod}} {{patientMsg.pastHis}}</td>
      </tr>
      <tr>
        <th>其他医院送入：</th>
        <td>{{patientMsg.abnSco}}</td>
      </tr>
    </table>
    <hr class="dotted">
    <table>
      <tr>
        <th>转归时间： </th>
        <td>{{patientMsg.sqlDat}}</td>
      </tr>
      <tr>
        <th>转归去向：</th>
        <td>{{patientMsg.cstDspCodNameNew}} <i ms-if="patientMsg.sqlStaCod == 2">{{patientMsg.cstDepCodNew}}</i> <i ms-if="patientMsg.sqlStaCod == 13">{{patientMsg.sqlDes}}</i></td>
      </tr>
    </table>
  </div>
  <div class="patient-mark-msg">
    <ul class="min-tab clr">
      <li class="min-tab-btn floatLeft active tab-panel" onclick="minSubTab(0)">MEWS评分</li>
      <li class="min-tab-btn floatLeft tab-panel" onclick="minSubTab(1)">GCS评分</li>
      <li class="min-tab-btn floatLeft tab-panel" onclick="minSubTab(2)">CRAMS评分</li>
      <li class="min-tab-btn floatLeft pews-panel" onclick="minSubTab(3)">PEWS评分</li>
    </ul>
    <div class="min-container">
      <div class="min-tab-container mews active tab-panel">
        <div class="mark-msg clr">
          <p class="mark floatLeft">{{patientMsg.mewsTotSco}}</p>
          <table class="mark-msg-detail floatLeft">
            <tbody>
              <tr>
                <th>呼吸：</th>
                <td>
                  <i ms-if="patientMsg.breNbr">{{patientMsg.breNbr}}次/分</i>
                </td>
                <th>体温：</th>
                <td>
                  <i ms-if="patientMsg.tmpNbr">{{patientMsg.tmpNbr}}℃ </i>
                </td>
              </tr>
              <tr>
                <th>血压：</th>
                <td>
                  <i ms-if="patientMsg.sbpUpNbr||patientMsg.sbpDownNbr">
                    {{patientMsg.sbpUpNbr}}/{{patientMsg.sbpDownNbr}}
                  </i>
                </td>
                <th>心率：</th>
                <td>
                  <i ms-if="patientMsg.hrtRte">{{patientMsg.hrtRte}}次/分</i>
                </td>
              </tr>
              <tr>
                <th>清醒程度：</th>
                <td colspan="3">{{patientMsg.senRctCodStr}}</td>
              </tr>
            </tbody>
          </table>
        </div>
        <table class="mark-rule mews">
          <tr class="mark-score">
            <th>分值</th>
            <td>3</td>
            <td>2</td>
            <td>1</td>
            <td>0</td>
            <td>1</td>
            <td>2</td>
            <td>3</td>
          </tr>
          <tr>
            <th>呼吸</th>
            <td ms-class="active:isInRange(patientMsg.breNbr,30,'')">≥30</td>
            <td ms-class="active:isInRange(patientMsg.breNbr,21,29)">21-29</td>
            <td ms-class="active:isInRange(patientMsg.breNbr,15,20)">15-20</td>
            <td ms-class="active:isInRange(patientMsg.breNbr,9,14)">9-14</td>
            <td></td>
            <td ms-class="active:isInRange(patientMsg.breNbr,'',8)">&lt;9</td>
            <td></td>
          </tr>
          <tr>
            <th>体温</th>
            <td></td>
            <td ms-class="active:isInRange(patientMsg.tmpNbr,38.5,'')">≥38.5</td>
            <td></td>
            <td ms-class="active:isInRange(patientMsg.tmpNbr,35,38.4)">35-38.4</td>
            <td></td>
            <td ms-class="active:isInRange(patientMsg.tmpNbr,'',34.9)">&lt;35</td>
            <td></td>
          </tr>
          <tr>
            <th>收缩压</th>
            <td></td>
            <td ms-class="active:isInRange(patientMsg.sbpUpNbr,200,'')">≥200</td>
            <td></td>
            <td ms-class="active:isInRange(patientMsg.sbpUpNbr,101,199)">101-199</td>
            <td ms-class="active:isInRange(patientMsg.sbpUpNbr,81,100)">81-100</td>
            <td ms-class="active:isInRange(patientMsg.sbpUpNbr,71,80)">71-80</td>
            <td ms-class="active:isInRange(patientMsg.sbpUpNbr,'',70)">≤70</td>
          </tr>
          <tr>
            <th>心率</th>
            <td ms-class="active:isInRange(patientMsg.hrtRte,130,'')">≥130</td>
            <td ms-class="active:isInRange(patientMsg.hrtRte,111,129)">111-129</td>
            <td ms-class="active:isInRange(patientMsg.hrtRte,101,110)">101-110</td>
            <td ms-class="active:isInRange(patientMsg.hrtRte,51,100)">51-100</td>
            <td ms-class="active:isInRange(patientMsg.hrtRte,41,50)">41-50</td>
            <td ms-class="active:isInRange(patientMsg.hrtRte,'',40)">≤40</td>
            <td></td>
          </tr>
          <tr>
            <th>清醒程度</th>
            <td></td>
            <td></td>
            <td></td>
            <td ms-class="active:patientMsg.senRctCod=='0'">清楚(A)</td>
            <td ms-class="active:patientMsg.senRctCod=='1'">对声音有反应(V)</td>
            <td ms-class="active:patientMsg.senRctCod=='2'">对疼痛有反应(P)</td>
            <td ms-class="active:patientMsg.senRctCod=='3'">无反应(U)</td>
          </tr>
        </table>
      </div>
      <div class="min-tab-container gcs tab-panel">
        <div class="mark-msg clr">
          <p class="mark floatLeft">{{patientMsg.gcsTotSco}}</p>
          <table class="mark-msg-detail floatLeft">
            <tbody>
              <tr>
                <th>睁眼反应：</th>
                <td>{{patientMsg.eyeRctCodStr}}</td>
              </tr>
              <tr>
                <th>语言反应：</th>
                <td>{{patientMsg.lanRctCodStr}}</td>
              </tr>
              <tr>
                <th>肢体反应：</th>
                <td>{{patientMsg.actRctCodStr}}</td>
              </tr>
            </tbody>
          </table>
        </div>
        <table class="mark-rule">
          <tr class="mark-score">
            <th>分值</th>
            <td>1</td>
            <td>2</td>
            <td>3</td>
            <td>4</td>
            <td>5</td>
            <td>6</td>
          </tr>
          <tr>
            <th>睁眼反应</th>
            <td ms-class="active:patientMsg.eyeRctCod=='1'">不能睁眼</td>
            <td ms-class="active:patientMsg.eyeRctCod=='2'">痛时睁眼</td>
            <td ms-class="active:patientMsg.eyeRctCod=='3'">呼唤睁眼</td>
            <td ms-class="active:patientMsg.eyeRctCod=='4'">自动睁眼</td>
            <td></td>
            <td></td>
          </tr>
          <tr>
            <th>语言反应</th>
            <td ms-class="active:patientMsg.lanRctCod=='1'">不能发音</td>
            <td ms-class="active:patientMsg.lanRctCod=='2'">有音无语</td>
            <td ms-class="active:patientMsg.lanRctCod=='3'">吐词不清</td>
            <td ms-class="active:patientMsg.lanRctCod=='4'">回答错误</td>
            <td ms-class="active:patientMsg.lanRctCod=='5'">回答正确</td>
            <td></td>
          </tr>
          <tr>
            <th>肢体反应</th>
            <td ms-class="active:patientMsg.actRctCod=='1'">无动作</td>
            <td ms-class="active:patientMsg.actRctCod=='2'">刺痛时过伸</td>
            <td ms-class="active:patientMsg.actRctCod=='3'">刺痛时屈曲</td>
            <td ms-class="active:patientMsg.actRctCod=='4'">刺痛时回缩</td>
            <td ms-class="active:patientMsg.actRctCod=='5'">刺痛能定位</td>
            <td ms-class="active:patientMsg.actRctCod=='6'">按吩咐动作</td>
          </tr>
        </table>
      </div>
      <div class="min-tab-container crams tab-panel">
        <div class="mark-msg clr">
          <p class="mark floatLeft">{{patientMsg.cramsTotSco}}</p>
          <table class="mark-msg-detail floatLeft">
            <tbody>
              <tr>
                <th>循环：</th>
                <td colspan="3">{{patientMsg.cirLvlCodStr}}</td>
              </tr>
              <tr>
                <th>呼吸：</th>
                <td colspan="3">{{patientMsg.breLvlCodStr}}</td>
              </tr>
              <tr>
                <th>胸腹部：</th>
                <td colspan="3">{{patientMsg.bdyLvlCodStr}}</td>
              </tr>
              <tr>
                <th>运动：</th>
                <td>{{patientMsg.sptLvlCodStr}}</td>
                <th>语言：</th>
                <td>{{patientMsg.lanLvlCodStr}}</td>
              </tr>
            </tbody>
          </table>
        </div>
        <table class="mark-rule">
          <tr class="mark-score">
            <th>分值</th>
            <td>0</td>
            <td>1</td>
            <td>2</td>
          </tr>
          <tr>
            <th>循环（L）</th>
            <td ms-class="active:patientMsg.cirLvlCod=='0'">毛细血管充盈消失和收缩压&lt;85mmHg</td>
            <td ms-class="active:patientMsg.cirLvlCod=='1'">毛细血管充盈延迟和收缩压85~100mmHg</td>
            <td ms-class="active:patientMsg.cirLvlCod=='2'">毛细血管充盈正常和收缩压&gt;100mmHg</td>
          </tr>
          <tr>
            <th>呼吸（R）</th>
            <td ms-class="active:patientMsg.breLvlCod=='0'">无</td>
            <td ms-class="active:patientMsg.breLvlCod=='1'">异常(费力,浅或&gt;35次/min)</td>
            <td ms-class="active:patientMsg.breLvlCod=='2'">正常</td>
          </tr>
          <tr>
            <th>胸腹部（A）</th>
            <td ms-class="active:patientMsg.bdyLvlCod=='0'">腹肌抵抗，连枷胸或腹胸有贯通伤</td>
            <td ms-class="active:patientMsg.bdyLvlCod=='1'">腹或胸有压痛</td>
            <td ms-class="active:patientMsg.bdyLvlCod=='2'">腹或胸无压痛</td>
          </tr>
          <tr>
            <th>运动（M）</th>
            <td ms-class="active:patientMsg.sptLvlCod=='0'">固定体位或无反应</td>
            <td ms-class="active:patientMsg.sptLvlCod=='1'">仅对疼痛有反应</td>
            <td ms-class="active:patientMsg.sptLvlCod=='2'">正常或服从命令</td>
          </tr>
          <tr>
            <th>语言（S）</th>
            <td ms-class="active:patientMsg.lanLvlCod=='0'">无或不可理解</td>
            <td ms-class="active:patientMsg.lanLvlCod=='1'">胡言乱语或不恰当语言</td>
            <td ms-class="active:patientMsg.lanLvlCod=='2'">正常自动讲话</td>
          </tr>
        </table>
      </div>
      <div class="min-tab-container pews-panel">
        <div class="mark-msg clr">
          <p class="mark floatLeft">{{patientMsg.pewsSco}}</p>
        </div>
        <table class="mark-rule">
          <tr class="mark-score">
            <th colspan="2"></th>
            <td>0</td>
            <td>1</td>
            <td>2</td>
            <td>3</td>
          </tr>
          <tr>
            <th colspan="2">行为</th>
            <td ms-class="active:patientMsg.actionCod == el.infocode" ms-repeat="getMsgList.actionCodList" >{{el.info}}</td>
          </tr>
          <tr>
            <th rowspan="3">心血管系统</th>
            <th>肤色</th>
            <td ms-class="active:patientMsg.xxgSkinCod == el.infocode" ms-repeat="getMsgList.xxgSkinCodList">{{el.info}}</td>
          </tr>
          <tr>
            <th>CRT</th>
            <td ms-class="active:patientMsg.xxgCrtCod == el.infocode" ms-repeat="getMsgList.xxgCrtCodList">{{el.info}}</td>
          </tr>
          <tr>
            <th>心率</th>
            <td ms-class="active:patientMsg.xxgXlCod == el.infocode" ms-repeat="getMsgList.xxgXlCodList">{{el.info}}</td>
          </tr>
          <tr>
            <th rowspan="3">呼吸系统</th>
            <th>频率</th>
            <td ms-class="active:patientMsg.hxPlCod == el.infocode" ms-repeat="getMsgList.hxPlCodList">{{el.info}}</td>
          </tr>
          <tr>
            <th>吸凹</th>
            <td ms-class="active:patientMsg.hxXhCod == el.infocode" ms-repeat="getMsgList.hxXhCodList">{{el.info}}</td>
          </tr>
          <tr>
            <th>FiO2</th>
            <td ms-class="active:patientMsg.hxFio2Cod == el.infocode" ms-repeat="getMsgList.hxFio2CodList">{{el.info}}</td>
          </tr>
        </table>
      </div>
    </div>
  </div>
</body>

</html>