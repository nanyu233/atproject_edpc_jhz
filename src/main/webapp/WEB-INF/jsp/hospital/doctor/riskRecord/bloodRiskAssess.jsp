<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>静脉血栓风险因素评估表</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${emgSeq}';
  </script>
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="diseaseHtml">
  <div class="print-body" id="bloodRiskWrap">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">静脉血栓风险因素评估表</p>
    <ul class="print-ul">
      <li class="bordered">
        <span class="basic-span">
          <label class="title-label">姓名：</label>
          <span>${hspemginfCustom.cstNam}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">性别：</label>
          <span>${hspemginfCustom.cstSexCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">年龄：</label>
          <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">科别：</label>
          <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">病历号：</label>
          <span id="_mpi">${hspemginfCustom.mpi}</span>
        </span>
        <!-- <span class="basic-span">
          <label class="title-label">留观号：</label>
          <span id="_lgh">${hspemginfCustom.observationCode}</span>
        </span> -->
      </li>
    </ul>
    <table class="tabWrapper">
      <colgroup>
        <col width="25%" />
        <col width="25%" />
        <col width="25%" />
        <col width="25%" />
      </colgroup>
      <tbody>
        <tr class="titleTr">
          <td colspan="2" class="centerTd">A每个危险因素1分</td>
          <td colspan="2" class="centerTd">C每个危险因素3分</td>
        </tr>
        <tr v-for="(item, index) in msgList.aPartListA">
          <td>
            <label v-if="item.typeA">
              <span :id="'aa' + item.typeB + index" class="hookShow">&nbsp;</span> {{item.typeA}}
            </label>
          </td>
          <td>
            <label v-if="item.typeC">
              <span :id="'bb' + item.typeD + index" class="hookShow">&nbsp;</span> {{item.typeC}}
            </label>
          </td>
          <td colspan="2">
            <label v-if="item.typeE">
              <span :id="'cc' + item.typeF + index" class="hookShow">&nbsp;</span> {{item.typeE}}
            </label>
          </td>
        </tr>
        <tr class="titleTr">
          <td colspan="2" class="centerTd">B每个危险因素2分</td>
          <td colspan="2" class="centerTd">D每个危险因素5分</td>
        </tr>
        <tr v-for="(item, index) in msgList.aPartListB">
          <td>
            <label v-if="item.typeA">
              <span :id="'dd' + item.typeB + index" class="hookShow">&nbsp;</span> {{item.typeA}}
            </label>
          </td>
          <td>
            <label v-if="item.typeC">
              <span :id="'ee' + item.typeD + index" class="hookShow">&nbsp;</span> {{item.typeC}}
            </label>
          </td>
          <td colspan="2">
            <label v-if="item.typeE">
              <span :id="'ff' + item.typeF + index" class="hookShow">&nbsp;</span> {{item.typeE}}
            </label>
          </td>
        </tr>
        <tr>
          <td class="centerTd">危险因素总分：</td>
          <td colspan="3" id="_totalSco">0</td>
        </tr>
        <tr class="titleTr">
          <td colspan="4" class="centerTd">预防方案(Caprini评分)</td>
        </tr>
        <tr v-for="(item, index) in msgList.scoreList" class="tipTitle">
          <td>{{item.total}}</td>
          <td>{{item.risk}}</td>
          <td>{{item.level}}</td>
          <td>{{item.sgt}}</td>
        </tr>
      </tbody>
    </table>
    <ul class="print-ul">
      <li class="longFloatRightLi">
        <label>医生签名：</label>
        <span class="assessDocNam">{{msgInfo.assessDocNam}}</span>
        <label class="lab-span">日期：</label>
        <span class="assessDate" id="_assessDate"></span>
      </li>
    </ul>
  </div>
  <script>
    var _msgList = {
      mgwxysACod: [],
      mgwxysBCod: [],
      mgwxysCCod: [],
      mgwxysDCod: []
    };
    var vm = new Vue({
      el: '#bloodRiskWrap',
      data: {
        msgList: {
          mgwxysACodList: [],
          mgwxysBCodList: [],
          mgwxysCCodList: [],
          mgwxysDCodList: [],
          aPartListA: [],
          aPartListB: [],
          scoreList: [{ total: '危险因素总分', risk: 'DVT发生风险', level: '风险等级', sgt: '推荐预防方案' }, { total: '0-1分', risk: '<10%', level: '低危', sgt: '尽早活动' },
          { total: '2分', risk: '10-20%', level: '中危', sgt: '药物预防或物理预防' }, { total: '3-4分', risk: '20-40%', level: '高危', sgt: '药物预防和/或物理预防' },
          { total: '≥5分', risk: '40-80%', level: '极高危', sgt: '药物预防和物理预防' }]
        },
        msgInfo: {
          mgwxysACod: '', // 每个危险因素1分（A）
          mgwxysBCod: '', // 每个危险因素2分（B）
          mgwxysCCod: '', // 每个危险因素3分（C）
          mgwxysDCod: '', // 每个危险因素5分（D）
          totalSco: '', // 危险因素总分
          assessDoc: '', // 评估医生
          assessDocNam: '${activeUser.usrname}', // 评估医生名字
          assessDate: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'), // 日期
          isMounted: false,
          isLevel: ''
        },
        hideInfo: {
          mgwxysACod: [], // 每个危险因素1分（A）
          mgwxysBCod: [], // 每个危险因素2分（B）
          mgwxysCCod: [], // 每个危险因素3分（C）
          mgwxysDCod: [] // 每个危险因素5分（D）
        }
      },
      created: function () {
        this.getDataList();
      },
      methods: {
        getDataList: function () {
          publicFun.httpServer({ url: '${baseurl}zyylqblqrb/findRiskAssSheetList.do' }, {}, function (data) {
            var _res = data.resultInfo.sysdata;
            var _aLth = _res.mgwxysACodList.length, _bLth = _res.mgwxysBCodList.length, _cLth = _res.mgwxysCCodList.length, _dLth = _res.mgwxysDCodList.length;
            for (var key in _res) {
              if (vm.msgList.hasOwnProperty(key)) {
                vm.msgList[key] = _res[key]
              }
            }
            var _lth = _aLth > _cLth ? _aLth : _cLth;
            var _rth = _bLth > _dLth ? _bLth : _dLth;
            for (var i = 0; i <= (_lth); i++) {
              if (i % 2 === 1) {
                vm.msgList.mgwxysCCodList.splice(i, 0, {
                  info: '',
                  infocode: ''
                })
              } else {
                if ((_cLth * 2) < i) {
                  vm.msgList.mgwxysCCodList.splice(i, 0, {
                    info: '',
                    infocode: ''
                  })
                }
              }
            }
            var _totalLth = _lth;
            var _gapLth = _cLth - (_aLth / 2);
            if (_gapLth > 0) {
              for (var i = 0; i < (_gapLth * 2); i++) {
                vm.msgList.mgwxysACodList.push({
                  info: '',
                  infocode: ''
                })
              }
              _totalLth = _cLth * 2;
            } else {
              vm.msgList.mgwxysACodList.push({
                info: '',
                infocode: ''
              })
            }
            for (var i = 0; i < _totalLth; i++) {
              var contentA = '', contentB = '', contentC = '', contentD = '';
              if (i % 1 === 0) {
                contentA = vm.msgList.mgwxysACodList[i].info;
                contentB = vm.msgList.mgwxysACodList[i].infocode;
                contentC = vm.msgList.mgwxysACodList[i + 1].info;
                contentD = vm.msgList.mgwxysACodList[i + 1].infocode;
              }
              vm.msgList.aPartListA.push({
                typeA: contentA,
                typeB: contentB,
                typeC: contentC,
                typeD: contentD,
                typeE: vm.msgList.mgwxysCCodList[i].info,
                typeF: vm.msgList.mgwxysCCodList[i].infocode,
              })
              i++;
            }
            for (var i = 0; i <= (_rth); i++) {
              if (i % 2 === 1) {
                vm.msgList.mgwxysDCodList.splice(i, 0, {
                  info: '',
                  infocode: ''
                })
              } else {
                if ((_dLth * 2) < i) {
                  vm.msgList.mgwxysDCodList.splice(i, 0, {
                    info: '',
                    infocode: ''
                  })
                }
              }
            }
            var _totalRth = _rth;
            var _gapRth = _dLth - (_bLth / 2);
            if (_gapRth > 0) {
              for (var i = 0; i < (_gapRth * 2); i++) {
                vm.msgList.mgwxysBCodList.push({
                  info: '',
                  infocode: ''
                })
              }
              _totalRth = _dLth * 2;
            } else {
              vm.msgList.mgwxysBCodList.push({
                info: '',
                infocode: ''
              })
            }
            for (var i = 0; i < _totalRth; i++) {
              var contentA = '', contentB = '', contentC = '', contentD = '';
              if (i % 1 === 0) {
                contentA = vm.msgList.mgwxysBCodList[i].info;
                contentB = vm.msgList.mgwxysBCodList[i].infocode;
                contentC = vm.msgList.mgwxysBCodList[i + 1].info;
                contentD = vm.msgList.mgwxysBCodList[i + 1].infocode;
              }
              vm.msgList.aPartListB.push({
                typeA: contentA,
                typeB: contentB,
                typeC: contentC,
                typeD: contentD,
                typeE: vm.msgList.mgwxysDCodList[i].info,
                typeF: vm.msgList.mgwxysDCodList[i].infocode,
              })
              i++;
            }
            vm.msgInfo.isMounted = true;
            vm.getSaveVal();
          })
        },
        getSaveVal: function () {
          publicFun.httpServer({ url: '${baseurl}zyylqblqrb/findJmxsAssSheet.do?emgSeq=${hspemginfCustom.emgSeq}' }, {}, function (data) {
            var _rtnVal = data.hspJmxsfxyspgbCustom;
            for (var key in _rtnVal) {
              if (vm.msgInfo.hasOwnProperty(key)) {
                if (key === 'assessDocNam') {
                  if (_rtnVal[key]) {
                    vm.msgInfo[key] = _rtnVal[key]
                  }
                } else {
                  if (key === 'totalSco' || key === 'assessDate') {
                    $('#_' + key).html(_rtnVal[key])
                  }
                  vm.msgInfo[key] = _rtnVal[key]
                }
              }
              if (vm.hideInfo.hasOwnProperty(key)) {
                if (_rtnVal[key]) {
                  vm.hideInfo[key] = _rtnVal[key].split(',')
                  _msgList[key] = _rtnVal[key].split(',')
                }
              }
            }
            fillHtml();
          })
        }
      }
    })

    // 页面填充
    function fillHtml() {
      $('#mainTitle').css({ 'padding': '0mm', 'margin': '0 0 0 60mm', 'height': '15mm' });
      $('#currentTitle').css({ 'text-align': 'center', 'margin': '0', 'font-size': '0.52cm', 'line-height': '1', 'font-weight': 'bold', 'margin-bottom': '2mm' });
      vm.msgList.aPartListA.map(function (value, index) {
        if (_msgList.mgwxysACod.length > 0) {
          _msgList.mgwxysACod.map(function (item, idx) {
            $('#aa' + item + index).html('√');
            $('#bb' + item + index).html('√');
          })
        }
        if (_msgList.mgwxysCCod.length > 0) {
          _msgList.mgwxysCCod.map(function (item, idx) {
            $('#cc' + item + index).html('√');
          })
        }
      })

      vm.msgList.aPartListB.map(function (value, index) {
        if (_msgList.mgwxysBCod.length > 0) {
          _msgList.mgwxysBCod.map(function (item, idx) {
            $('#dd' + item + index).html('√');
            $('#ee' + item + index).html('√');
          })
        }
        if (_msgList.mgwxysDCod.length > 0) {
          _msgList.mgwxysDCod.map(function (item, idx) {
            $('#ff' + item + index).html('√');
          })
        }
      })
    }
    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#_age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#_age').val('')
      }
    }
    $(function () {
      initAge();
    })
  </script>
</body>

</html>