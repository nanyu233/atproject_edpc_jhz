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
<link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
<link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/doctorendnote.css?v=${versionDay}">
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
    	_cratNbr = '${hspJmxsfxyspgbCustom.createDoc}';
      _emgSeq = '${hspemginfCustom.emgSeq}',
      _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}';
</script>
<script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
<script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>
<body class="brainDisease doctornote bloodRisk">
  <div class="mainbody" id="bloodRiskWrap">
    <p class="subheadtitle">静脉血栓风险因素评估表</p>
    <form id="bloodRiskForm" action="${baseurl}riskAss/submitJmxsAssSheet.do" method="post">
      <input type="hidden" name="formToken" value="${formToken}" />
      <input id="riskSeq" type="text" name="hspJmxsfxyspgbCustom.riskSeq" class="hidden" value="${hspJmxsfxyspgbCustom.riskSeq}">
      <div class="divwrapper">
        <div class="basicDiv">
          <label class="bascilab">姓名：<input class="basicInput" type="text" value="${hspemginfCustom.cstNam}" readonly
              unselectable='on'></label>
          <label class="bascilab">性别：<input class="basicInput" type="text" value="${hspemginfCustom.cstSexCod}" readonly
              unselectable='on'></label>
          <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" readonly unselectable='on' ref="ageInput"></label>
          <label class="bascilab">科室：<input class="basicInput longbasicInput" type="text" value="急诊科门诊"
              readonly unselectable='on'></label>
          <label class="bascilab">病历号：<input class="basicInput" type="text" value="${hspemginfCustom.mpi}" readonly
              unselectable='on'></label>
          <!-- <label class="bascilab">留观号：<input class="basicInput" type="text" value="${hspemginfCustom.observationCode}"
              name="hspemginfCustom.observationCode" readonly unselectable='on'></label> -->
        </div>
        <table class="tabWrapper" id="tabData">
          <colgroup>
            <col width="25%" />
            <col width="25%" />
            <col width="25%" />
            <col width="25%" />
          </colgroup>
          <tr class="titleTr">
            <td colspan="2">A每个危险因素1分</td>
            <td colspan="2">C每个危险因素3分</td>
          </tr>
          <input type="text" v-model="msgInfo.mgwxysACod" name="hspJmxsfxyspgbCustom.mgwxysACod" class="hidden">
          <input type="text" v-model="msgInfo.mgwxysBCod" name="hspJmxsfxyspgbCustom.mgwxysBCod" class="hidden">
          <input type="text" v-model="msgInfo.mgwxysCCod" name="hspJmxsfxyspgbCustom.mgwxysCCod" class="hidden">
          <input type="text" v-model="msgInfo.mgwxysDCod" name="hspJmxsfxyspgbCustom.mgwxysDCod" class="hidden">
          <input type="text" v-model="msgInfo.totalSco" name="hspJmxsfxyspgbCustom.totalSco" class="hidden">
          <input type="text" name="hspJmxsfxyspgbCustom.emgSeq" value="${hspemginfCustom.emgSeq}" class="hidden"/>
          <tr v-for="(item, index) in msgList.aPartListA">
            <td>
              <label :for="'a' + index" v-if="item.typeA">
                <input type="checkbox" :id="'a' + index" :value="item.typeB" v-model="hideInfo.mgwxysACod"> {{item.typeA}}
              </label>
            </td>
            <td>
              <label :for="'b' + index" v-if="item.typeC">
                <input type="checkbox" :id="'b' + index" :value="item.typeD" v-model="hideInfo.mgwxysACod"> {{item.typeC}}
              </label>
            </td>
            <td colspan="2">
              <label :for="'c' + index" v-if="item.typeE">
                <input type="checkbox" :id="'c' + index" :value="item.typeF" v-model="hideInfo.mgwxysCCod"> {{item.typeE}}
              </label>
            </td>
          </tr>
          <tr class="titleTr">
            <td colspan="2">B每个危险因素2分</td>
            <td colspan="2">D每个危险因素5分</td>
          </tr>
          <tr v-for="(item, index) in msgList.aPartListB">
            <td>
              <label :for="'d' + index" v-if="item.typeA">
                <input type="checkbox" :id="'d' + index" :value="item.typeB" v-model="hideInfo.mgwxysBCod"> {{item.typeA}}
              </label>
            </td>
            <td>
              <label :for="'e' + index" v-if="item.typeC">
                <input type="checkbox" :id="'e' + index" :value="item.typeD" v-model="hideInfo.mgwxysBCod"> {{item.typeC}}
              </label>
            </td>
            <td colspan="2">
              <label :for="'f' + index" v-if="item.typeE">
                <input type="checkbox" :id="'f' + index" :value="item.typeF" v-model="hideInfo.mgwxysDCod"> {{item.typeE}}
              </label>
            </td>
          </tr>
          <tr>
            <td class="sumTitle">危险因素总分：</td>
            <td colspan="3" class="sumTitle">{{totalGetSco}}</td>
          </tr>
          <tr class="titleTr">
            <td colspan="4">预防方案(Caprini评分)</td>
          </tr>
          <tr v-for="(item, index) in msgList.scoreList" class="tipTitle" :class="msgInfo.isLevel === index ? 'highBgTr': ''">
            <td>{{item.total}}</td>
            <td>{{item.risk}}</td>
            <td>{{item.level}}</td>
            <td>{{item.sgt}}</td>
          </tr>
        </table>
        <ul class="ulwrapper">
          <li class="rightli">
            <span>医师签名</span>
            <span class="spanRelative">
              <!-- onkeydown="getSignList(event)" -->
              <input type="text" class="baseinput assessDocNam" id="assessDocNam" maxlength="10" name="hspJmxsfxyspgbCustom.assessDocNam" readonly>
              <input type="text" class="hidden assessDoc" id="assessDocNamNum" maxlength="10" name="hspJmxsfxyspgbCustom.assessDoc">
              <div class="userList" id="userNameList"></div>
            </span>
            <label class="labbox rxbox">日期</label>
            <input class="Wdate spcWdate" name="hspJmxsfxyspgbCustom.assessDate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" v-model="msgInfo.assessDate">
          </li>
        </ul>
      </div>
    </form>
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/riskAssess/printBloodAssess.jsp"></jsp:include>
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
          scoreList: [{total: '危险因素总分', risk: 'DVT发生风险', level: '风险等级', sgt: '推荐预防方案'}, { total: '0-1分', risk: '<10%', level: '低危', sgt: '尽早活动' },
                      {total: '2分', risk: '10-20%', level: '中危', sgt: '药物预防或物理预防' }, { total: '3-4分', risk: '20-40%', level: '高危', sgt: '药物预防和/或物理预防' },
                      {total: '≥5分', risk: '40-80%', level: '极高危', sgt: '药物预防和物理预防' }]
        },
        msgInfo: {
          mgwxysACod: '', // 每个危险因素1分（A）
          mgwxysBCod: '', // 每个危险因素2分（B）
          mgwxysCCod: '', // 每个危险因素3分（C）
          mgwxysDCod: '', // 每个危险因素5分（D）
          totalSco: '', // 危险因素总分
          assessDoc: '', // 评估医生
          assessDocNam: '', // 评估医生名字
          assessDate: '', // 日期
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
      computed: {
        totalGetSco: function () {
          if (this.msgInfo.isMounted === false) {
            return ''
          }
          var _totalSco = 0;
          var _levelList = [{ cod: 'mgwxysACod', num: 1 }, { cod: 'mgwxysBCod', num: 2 }, { cod: 'mgwxysCCod', num: 3 }, { cod: 'mgwxysDCod', num: 5 }];
          _levelList.forEach(function (item, index) {
            if (vm.hideInfo[item.cod].length > 0) {
              _totalSco += vm.hideInfo[item.cod].length * (item.num);
              vm.msgInfo[item.cod] = vm.hideInfo[item.cod].join(',');
            } else {
              vm.msgInfo[item.cod] = ''
            }
          })
          if (this.hideInfo.mgwxysACod.length === 0 && this.hideInfo.mgwxysBCod.length === 0 && this.hideInfo.mgwxysCCod.length === 0 && this.hideInfo.mgwxysDCod.length === 0) {
            _totalSco = 0;
          }
          // this.msgInfo.totalSco = _totalSco === 0 ? '' : _totalSco;
          this.msgInfo.totalSco = _totalSco;
          if (this.msgInfo.totalSco === 0 || this.msgInfo.totalSco === 1) {
            this.msgInfo.isLevel = 1
          } else if (this.msgInfo.totalSco === 2) {
            this.msgInfo.isLevel = 2
          } else if (this.msgInfo.totalSco >= 3 && this.msgInfo.totalSco <= 4) {
            this.msgInfo.isLevel = 3
          } else if (this.msgInfo.totalSco >= 5) {
            this.msgInfo.isLevel = 4
          } else {
             this.msgInfo.isLevel = ''
          }
          return this.msgInfo.totalSco
        }
      },
      created: function () {
        this.getDataList();
      },
      mounted: function () {
        this.setAgeVal();
        this.setPrintCss()
      },
      methods: {
        setAgeVal: function () {
          if ('${hspemginfCustom.cstAge}') {
            this.$refs.ageInput.value = '${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}';
          }
        },
        getDataList: function () {
          if(_cratNbr == ''){
            parent.checkRole(_number,'brain')
          }else{
            parent.checkRole(_cratNbr,'brain')
          }
          publicFun.httpServer({url: '${baseurl}riskAss/findRiskAssSheetList.do'}, {}, function (data) {
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
                vm.msgList.mgwxysCCodList.splice(i, 0 , {
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
            for (var i = 0; i < _totalLth ; i++) {
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
                typeF: vm.msgList.mgwxysCCodList[i].infocode
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
          if (!'${hspJmxsfxyspgbCustom.riskSeq}') {
            $('#assessDocNam').val('${activeUser.usrname}');
            $('#assessDocNamNum').val('${activeUser.usrno}');
            vm.msgInfo.assessDate = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
          }
          publicFun.httpServer({url: '${baseurl}riskAss/findJmxsAssSheet.do?emgSeq=${hspemginfCustom.emgSeq}'}, {}, function (data) {
            var _rtnVal = data.hspJmxsfxyspgbCustom;
            for (var key in _rtnVal) {
              if (vm.msgInfo.hasOwnProperty(key)) {
                if (key === 'assessDocNam' || key === 'assessDoc') {
                  if (_rtnVal[key]) {
                    vm.msgInfo.assessDocNam = _rtnVal[key]
                    $('.' + key).val(_rtnVal[key])
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
          })
          if (parent.isOpenBox == false) {
            setTimeout(function () {
              $('form input, form textarea, form select').attr('disabled', true);
            }, 300);
            setTimeout(function () {
              $('form input, form textarea, form select').attr('disabled', true);
            }, 1000);
          }
        },
        setPrintCss: function () {
          $('.logoDivZJ').css({'display':'block','float':'left','width':'15%','margin-left':'5%'});
          $('.logoDivZJ img').css({'vertical-align':'middle','text-align':'center','width':'15mm','float':'right','margin-top':'1mm'});
          $('.titleDivJZ').css({'float':'left','margin':'0','width':'65%','text-align':'center','margin-top':'1mm'});
          $('.title,.title1').css({'font-size':'0.55cm'});
          $('.title').css({'font-weight':'bolder'});
        }
      }
    })
    function saveForm (type) {
      if (publicFun.strTrim($('#assessDocNam').val()) === '') {
        $('#assessDocNam').val('');
        $('#assessDocNamNum').val('');
      }
      if (type === 'p') {
        if (parent.isOpenBox) {
          jquerySubByFId('bloodRiskForm', call_back, type, "json");
        } else {
          printForm();
          return;
        }
      } else {
        jquerySubByFId('bloodRiskForm', call_back, "json");
      }
    }

    function call_back (data, type) {
      window.sessionStorage.setItem('bloodSave', type);
      if (type === 'p') {
        window.location.reload();
      } else {
        message_alert(data);
        setTimeout(function () {
          window.location.reload();
        }, 800)
      }
    }
    window.onload = function () {
      var _print = window.sessionStorage.getItem('bloodSave');
      if (_print === 'p') {
        window.sessionStorage.removeItem('bloodSave');
        setTimeout(function () {
          printForm();
        }, 800);
      }
    }
    
    function getSignList(e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('assessDocNam', 'userNameList');
      }
    }
    $("body").click(function () {
      $(".userList").hide();
    });
    // 页面填充
    function fillHtml() {
      $('#docuTitle').html('静脉血栓风险因素评估表');
      vm.msgList.aPartListA.map(function (value, index) {
        if (_msgList.mgwxysACod.length > 0) {
          _msgList.mgwxysACod.map(function (item, idx) {
            $('#aa' + item + index).attr('checked', true);
            $('#bb' + item + index).attr('checked', true);
          })
        }
        if (_msgList.mgwxysCCod.length > 0) {
          _msgList.mgwxysCCod.map(function (item, idx) {
            $('#cc' + item + index).attr('checked', true);
          })
        }
      })

      vm.msgList.aPartListB.map(function (value, index) {
        if (_msgList.mgwxysBCod.length > 0) {
          _msgList.mgwxysBCod.map(function (item, idx) {
            $('#dd' + item + index).attr('checked', true);
            $('#ee' + item + index).attr('checked', true);
          })
        }
        if (_msgList.mgwxysDCod.length > 0) {
          _msgList.mgwxysDCod.map(function (item, idx) {
            $('#ff' + item + index).attr('checked', true);
          })
        }
      })
    }
    function printForm() {
      fillHtml();
      try {
        $('#id_title2').html('静脉血栓风险因素评估表');
        LODOP = getLodop();
        var strStyleCSS = "<link rel='stylesheet' type='text/css' href='${baseurl}css/hzszyyhems/hzszyydoctor/printBrain.css?09'>";
        LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
        LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
        LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
        LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
        LODOP.ADD_PRINT_HTM(3, 0, "100%", "93%", strStyleCSS + $('#printNote').html());
        LODOP.SET_PRINT_STYLE("FontSize", 10);
        //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
        LODOP.PREVIEW();
        //LODOP.PRINT();
      } catch (e) {
        $.messager.alert('提示信息', '数据存在某些问题，请刷新后重试', 'warning');
      }
    }
  </script>
</body> 
</html>