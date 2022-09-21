<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>疼痛评分细则</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/nrs/nrs.css?v=${versionDay}">
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/nrs/slide.js?v=${versionDay}"></script>
  <script>
    var _baseUrl = "${baseurl}",
      _xtpgSeq = '${xtpgSeq}',
      _emgBedNew = '${hspemginfCustom.emgBed}',
      _typeSource = '${typeSource}'; // precheck:预检 grade:评分查询 hlpgb:入院护理评估
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="scoreQuery thinTab" ms-controller="queryNrs">
  <p class="headtitle">疼痛评分</p>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/basicTopInfo.jsp"></jsp:include>
  <form id="nrsForm" action="${baseurl}scorequery/addNrsScore.do" method="post">
    <input class="hidden" type="text" ms-duplex-string="sysMsg.createDate" name="hspNrsInfCustom.nrsDat"/>
    <input class="hidden" type="text" value="${emgSeq}" name="hspNrsInfCustom.emgSeq" id="emgSeq">
    <input class="hidden" type="text" value="${xtpgSeq}" name="hspNrsInfCustom.xtpgSeq" id="xtEmg">
    <input class="hidden" type="text" ms-duplex-string="msgInfo.nrsSco" name="hspNrsInfCustom.nrsSco">
    <input class="hidden" type="text" ms-duplex-string="msgInfo.ttpfTypeCod" name="hspNrsInfCustom.ttpfTypeCod">
    <input class="hidden" type="text" ms-duplex-string="msgInfo.ttpfNr" name="hspNrsInfCustom.ttpfNr">
    <div class="panelBlock">
      <div class="NrsContent panelContent">
        <div class="nrsWrapper">
          <div class="partOne">
            <div class="panelA">
              <label class="lab-title">
                <input id="typeSlide" name="typeWay" type="radio" value="0" ms-change="setRadio('0')" /> VAS (视觉模拟法)
              </label>
              <div class="slide-wrapper" ms-visible="msgInfo.ttpfTypeCod === '0' || msgInfo.ttpfTypeCod === 0">
                <div id="control-group">
                  <p class="leftText">无痛</p>
                  <div class="scroll-bar" id="scroll-bar">
                    <div class="entire-bar" id="entire-bar"></div>
                    <div class="action-bar" id="action-bar"></div>
                    <div class="action-block" id="action-block"></div>
                  </div>
                  <p class="rightText">最痛</p>
                  <input type="text" id="showArea" class="hidden" />
                </div>
              </div>
            </div>
            <div class="panelB">
              <label class="lab-title">
                <input id="typenum" name="typeWay" type="radio" value="1" ms-change="setRadio('1')" /> NRS (数字评分法)
              </label>
              <ul class="num-ul" ms-visible="msgInfo.ttpfTypeCod == '1'">
                <li ms-repeat="getMsg.numList" ms-class="active: el.isAct" ms-click="textCheck($index, 'num')">
                  {{el.info}}
                </li>
              </ul>
            </div>
            <div class="panelC">
              <label class="lab-title">
                <input id="typeFace" name="typeWay" type="radio" value="2" ms-change="setRadio('2')" /> Wong-Baker
                (面部表情量法)
              </label>
              <span class="marginGap" ms-visible="msgInfo.ttpfTypeCod == '2'">
                <a ms-repeat="['00','01','02','03','04','05','06','07','08','09','10']" class="face" ms-class-1="face-{{el}}"
                  ms-class-2="active:$index==msgInfo.faceNrsSco" href="javascript:;" ms-click="chooseAche(el)"
                  ms-visible="$index % 2 == 0"></a>
              </span>
            </div>
            <div class="panelD">
              <label class="lab-title">
                <input id="typelan" name="typeWay" type="radio" value="3" ms-change="setRadio('3')" /> VRS (主诉疼痛程度分级法)
              </label>
              <ul class="lan-ul" ms-visible="msgInfo.ttpfTypeCod == '3'">
                <li ms-repeat="getMsg.lanList" ms-class="active: el.isAct" ms-click="textCheck($index, 'lan')">
                  {{el.info}}
                </li>
              </ul>
            </div>
          </div>
          <div class="partTwo scoreQuery">
            <label class="lab-title">
              <input name="typeWay" type="radio" value="4" ms-change="setRadio('4')" /> FLACC (疼痛行为量表)
            </label>
            <div class="panelGde panelContent" ms-visible="msgInfo.ttpfTypeCod == '4'">
              <table class="paneltab">
                <tr class="firsttr">
                  <th></th>
                  <td>0分</td>
                  <td>1分</td>
                  <td>2分</td>
                </tr>
                <tr class="eventr">
                  <th>脸部肌肉表情</th>
                  <td ms-repeat="getMsg.faceMsList">
                    <label ms-attr-for="faceMs{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="faceMs{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.faceMs"
                          ms-attr-value="el.infocode" ms-change="radioClick('faceMs', $index, 'flaccList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="oddtr">
                  <th>休息</th>
                  <td ms-repeat="getMsg.relaxList">
                    <label ms-attr-for="relax{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="relax{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.relax"
                          ms-attr-value="el.infocode" ms-change="radioClick('relax', $index, 'flaccList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="eventr">
                  <th>肌紧张</th>
                  <td ms-repeat="getMsg.muscleList">
                    <label ms-attr-for="muscle{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="muscle{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.muscle"
                          ms-attr-value="el.infocode" ms-change="radioClick('muscle', $index, 'flaccList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="oddtr">
                  <th>发声</th>
                  <td ms-repeat="getMsg.voiceList">
                    <label ms-attr-for="voice{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="voice{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.voice"
                          ms-attr-value="el.infocode" ms-change="radioClick('voice', $index, 'flaccList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="eventr">
                  <th>安抚</th>
                  <td ms-repeat="getMsg.clamList">
                    <label ms-attr-for="clam{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="clam{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.clam" ms-attr-value="el.infocode"
                          ms-change="radioClick('clam', $index, 'flaccList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
              </table>
            </div>
          </div>
          <div class="partThree scoreQuery">
            <label class="lab-title">
              <input name="typeWay" type="radio" value="5" ms-change="setRadio('5')" /> COPPT (重症监护疼痛观察工具)
            </label>
            <div class="panelGde panelContent" ms-visible="msgInfo.ttpfTypeCod == '5'">
              <table class="paneltab">
                <tr class="firsttr">
                  <th></th>
                  <td>0分</td>
                  <td>1分</td>
                  <td>2分</td>
                </tr>
                <tr class="eventr">
                  <th>面部表情</th>
                  <td ms-repeat="getMsg.oTFaceList">
                    <label ms-attr-for="oTFace{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="oTFace{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.oTFace"
                          ms-attr-value="el.infocode" ms-change="radioClick('oTFace', $index, 'copptList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="oddtr">
                  <th>身体动作</th>
                  <td ms-repeat="getMsg.oTBodyList">
                    <label ms-attr-for="oTBody{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="oTBody{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.oTBody"
                          ms-attr-value="el.infocode" ms-change="radioClick('oTBody', $index, 'copptList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="eventr">
                  <th>肌肉紧张</th>
                  <td ms-repeat="getMsg.oTMuscleList">
                    <label ms-attr-for="oTMuscle{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="oTMuscle{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.oTMuscle"
                          ms-attr-value="el.infocode" ms-change="radioClick('oTMuscle', $index, 'copptList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="oddtr">
                  <th>对呼吸的顺应性</th>
                  <td ms-repeat="getMsg.oTBreathList">
                    <label ms-attr-for="oTBreath{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="oTBreath{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.oTBreath"
                          ms-attr-value="el.infocode" ms-change="radioClick('oTBreath', $index, 'copptList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
                <tr class="eventr">
                  <th>发声</th>
                  <td ms-repeat="getMsg.oTVoiceList">
                    <label ms-attr-for="oTVoice{{el.infocode}}" class="labtab">
                      <span class="inputSpan">
                        <input ms-attr-id="oTVoice{{el.infocode}}" type="checkbox" ms-duplex="msgInfo.oTVoice"
                          ms-attr-value="el.infocode" ms-change="radioClick('oTVoice', $index, 'copptList')">
                        {{el.info}}
                      </span>
                    </label>
                  </td>
                </tr>
              </table>
            </div>
          </div>
        </div>
      </div>
      <div class="scoreDiv" ms-visible="msgInfo.typeSource == 'grade'">
        <span class="boldFont">总分：<i>{{msgInfo.nrsSco}}</i>
      </div>
      <div class="left-score" ms-visible="msgInfo.typeSource == 'preCheck' || msgInfo.typeSource == 'saveByParent'">
        <div class="score-div"><span>分值：</span><i>{{msgInfo.nrsSco}}</i></div>
        <div class="grp_btn">
          <a class="easyui-linkbutton addbtn" iconCls="icon-ok" ms-click="fillMsg()">确定</a>
          <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </div>
      </div>
      <div class="left-score" ms-visible="msgInfo.typeSource == 'hlpgb' || msgInfo.typeSource == 'jzcs'|| msgInfo.typeSource == 'hljld'">
        <div class="score-div"><span>分值：</span><i>{{msgInfo.nrsSco}}</i></div>
        <div class="grp_btn">
          <a class="easyui-linkbutton addbtn" iconCls="icon-ok" ms-click="saveChildBox()">保存</a>
          <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
        </div>
      </div>
  </form>
  <script type="text/javascript">
    var slideBarWrapper;
    var _actList = ['faceMs', 'relax', 'muscle', 'voice', 'clam'],
      _nrsActList = ['oTFace', 'oTBody', 'oTMuscle', 'oTBreath', 'oTVoice'];
    var _nowTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
    var vm = avalon.define({
      $id: "queryNrs",
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
      msgInfo: {
        typeSource: _typeSource,
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
        copptList: [{ type: 'oTFace', checkVal: [] }, { type: 'oTBody', checkVal: [] }, { type: 'oTMuscle', checkVal: [] }, { type: 'oTBreath', checkVal: [] }, { type: 'oTVoice', checkVal: [] }]
      },
      sysMsg:{
        createDate:_nowTime
      },
      textCheck: function (idx, listName) {
        var _textList = vm.getMsg[listName + 'List'];
        var currentCheck = vm.getMsg[listName + 'List'][idx].isAct;
        _textList.forEach(function (val, index) {
          vm.getMsg[listName + 'List'][index].isAct = false;
        })
        vm.msgInfo.nrsSco = vm.getMsg[listName + 'List'][idx].valText;
        document.getElementById('type' + listName).checked = true;
        vm.msgInfo.ttpfTypeCod = $("input[name='typeWay']:checked").val();
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
          vm.msgInfo.nrsSco = null;
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
        vm.msgInfo.ttpfTypeCod = $("input[name='typeWay']:checked").val();
        var otherList = ['numList', 'lanList'];
        otherList.forEach(function (val, index) {
          vm.getMsg[val].map(function (_val, _index) {
            vm.getMsg[val][_index].isAct = false;
          })
        })
        document.getElementById('showArea').value = 0;
        $('#showArea').focus();
        if (type != 'face') {
          vm.msgInfo.faceNrsSco = null;
          vm.msgInfo.nrsSco = null;
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
        if (idx == vm.msgInfo.nrsSco) {
          vm.msgInfo.faceNrsSco = null;
        } else {
          document.getElementById('typeFace').checked = true;
          vm.msgInfo.ttpfTypeCod = $("input[name='typeWay']:checked").val();;
          vm.msgInfo.faceNrsSco = parseInt(idx);
        }
        vm.msgInfo.nrsSco = vm.msgInfo.faceNrsSco;
      },
      setOtherNrsNull: function (list) {
        for (var i = 0; i < list.length; i++) {
          vm.msgInfo[list[i]] = []
        }
      },
      radioClick: function (name, idx, typeList) {
        if (vm.msgInfo[name].length > 0) {
          var msgInfo = vm.getMsg[name + 'List'][idx]['infocode'];
          vm.msgInfo[name] = [msgInfo];
        } else {
          vm.msgInfo[name] = [];
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
            if (vm.msgInfo[_fieldList[i]].length === 0) {
              _countZero++;
            } else {
              ckVal += (vm.msgInfo[_fieldList[i]] - 0)
            }
          }
          var _duplexValList = vm.msgInfo[typeList];
          _duplexValList.forEach(function (item, idx) {
            if (item.type === name) {
              item.checkVal = vm.msgInfo[name]
            }
          })
          if (_countZero === 5) {
            vm.msgInfo.nrsSco = null
          } else {
            vm.setRadio(typeCod);
            vm.msgInfo.nrsSco = ckVal
          }
        }
      },
      getParentInfo: function () {
        var _parentRadio = vm.msgInfo.ttpfTypeCod,
          _parentNrs = vm.msgInfo.nrsSco;
        var _valList = [];
        if (vm.msgInfo.ttpfNr !== '' && vm.msgInfo.ttpfNr != null) {
          _valList = JSON.parse(vm.msgInfo.ttpfNr);
        }
        if (_parentNrs !== '') {
          if (_parentRadio === '' || _parentRadio == null) {
            if (_parentNrs !== '' && _parentNrs != null) { // 针对生成数据[老数据]
              vm.msgInfo.ttpfTypeCod = '1' // 数字评分法
              vm.getMsg.numList[_parentNrs].isAct = true;
              document.getElementsByName('typeWay')[vm.msgInfo.ttpfTypeCod].checked = true;
            }
          } else {
            document.getElementsByName('typeWay')[vm.msgInfo.ttpfTypeCod].checked = true;
          }
          if (_parentRadio === '0') {
            document.getElementById('showArea').value = _parentNrs;
            $('#showArea').focus();
          } else if (_parentRadio === '1') {
            vm.getMsg.numList[_parentNrs].isAct = true;
          } else if (_parentRadio === '2') {
            vm.msgInfo.faceNrsSco = _parentNrs;
          } else if (_parentRadio === '3') {
            vm.getMsg.lanList.map(function (_val, _index) {
              if (_val.valText == _parentNrs) {
                vm.getMsg.lanList[_index].isAct = true;
              }
            })
          } else if (_parentRadio === '4') {
            if (_valList.length > 0) {
              vm.msgInfo.flaccList = _valList;
            }
            _valList.forEach(function (item, val) {
              if ($.inArray(item.type, _actList) > -1) {
                vm.msgInfo[item.type] = item.checkVal
              }
            })
          } else if (_parentRadio === '5') {
            if (_valList.length > 0) {
              vm.msgInfo.copptList = _valList;
            }
            _valList.forEach(function (item, val) {
              if ($.inArray(item.type, _nrsActList) > -1) {
                vm.msgInfo[item.type] = item.checkVal
              }
            })
          }
        } else {
          if (_parentRadio !== '' && _parentRadio != null) {
            document.getElementsByName('typeWay')[_parentRadio].checked = true;
          }
        }
      },
      fillMsg: function () {
        if (vm.msgInfo.ttpfTypeCod == '4') {
          vm.msgInfo.ttpfNr = JSON.stringify(vm.msgInfo.flaccList)
        }
        if (vm.msgInfo.ttpfTypeCod == '5') {
          vm.msgInfo.ttpfNr = JSON.stringify(vm.msgInfo.copptList)
        }
        // var codList = ['nrsTtbw', 'nrsTtbwQt', 'nrsTtxz', 'nrsTtxzQt', 'nrsTtsj', 'nrsTtkz', 'nrsMemo'];
        var codList = ['nrsSco', 'ttpfNr', 'ttpfTypeCod'];
        codList.map(function (ele) {
          parent.$('#emg_' + ele).val(vm.msgInfo[ele]);
        })
        parent.closemodalwindow();
      },
      saveChildBox: function () {
        if(vm.msgInfo.typeSource == 'jzcs'){
          $('#nrsForm').attr('action', '${baseurl}hlpgb/submitNrsScoreCS.do')
          if(_xtpgSeq == parent._emgSeq){
            $('#xtEmg').val('');
          }
        }
        if(vm.msgInfo.typeSource == 'hljld'){
          $('#nrsForm').attr('action', '${baseurl}zjszyyhljld/subNrsScore.do')
          // if(parent._count == 0 && parent._count != ''){
          //   $('#xtEmg').val('');
          // }
        }
        saveCom('hlpgb');
      }
    })

    function getAjaxDataVal() {
      publicFun.httpServer({ url: _baseUrl + "scorequery/findNrsScoreByXtpgSeq.do" }, {
        "xtpgSeq": _xtpgSeq,
        date: new Date().toTimeString()
      }, function (res) {
        for (var key in res) {
          if (vm.msgInfo.hasOwnProperty(key)) {
            vm.msgInfo[key] = res[key]
          }
        }
        if(res != null){
          vm.sysMsg.createDate = publicFun.timeFormat(res.nrsDat, 'yyyy/MM/dd hh:mm');
        }
        vm.getParentInfo(); // 处理数据
      })
    }

    //保存
    function saveCom (type) {
      if (vm.msgInfo.nrsSco == '' || vm.msgInfo.nrsSco == null) {
        publicFun.alert("请输入疼痛评分");
        return false
      }
      if (vm.msgInfo.ttpfTypeCod == '4') {
        vm.msgInfo.ttpfNr = JSON.stringify(vm.msgInfo.flaccList)
      }
      if (vm.msgInfo.ttpfTypeCod == '5') {
        vm.msgInfo.ttpfNr = JSON.stringify(vm.msgInfo.copptList)
      }
      jquerySubByFId('nrsForm', add_callBack, type, "json");
    }

    //保存回调
    function add_callBack(data, type) {
      if (!type) {
        window.parent.$('#tabDiv').datagrid('reload');
        if (data.resultInfo.type == '1') {
          data.resultInfo.message = '操作成功'
          window.parent.message_alert(data);
        } else {
          window.parent.publicFun.alert('操作失败')
        }
        setTimeout(function () {
          window.location.reload();
        }, 800)
      } else {
        if(_typeSource == 'hljld'){
          parent.sub.aboutSco.nrsSeq = data.resultInfo.message;
        }else{
          parent.$('#nrsSeq').val(data.resultInfo.message);
        }
        // $.messager.alert('提示信息', '保存成功', 'success');
        parent.sub.aboutSco.nrsSco = vm.msgInfo.nrsSco;
        parent.sub.aboutSco.ttpfNr = vm.msgInfo.ttpfNr;
        parent.sub.aboutSco.ttpfTypeCod = vm.msgInfo.ttpfTypeCod;
        parent.closemodalwindow()
      }
    }

    function getParentPageVal (type) {
      var msgCodList = ['nrsSco', 'ttpfNr', 'ttpfTypeCod'];
      msgCodList.map(function (ele) {
        vm.msgInfo[ele] = parent.$('#emg_' + ele).val();
      })
      var _cstAge = parent.$('#emg_cstAge').val(),
        _cstAgeCod = parent.$('#emg_cstAgeCod').val(),
        _nrsSco = parent.$('#emg_nrsSco').val(),
        _ttpfTypeCod = parent.$('#emg_ttpfTypeCod').val();
      if (type == 'preCheck') {
        // 如果是年龄>=14岁，若疼痛评分如果没有填过，则打开时默认NRS评分；
        // 如果年龄<14岁，若疼痛评分如果没有填过，则打开时默认Wong-Baker评分；[当且仅当针对预检页]
        if ((_nrsSco == null || _nrsSco === '') && (_ttpfTypeCod == null || _ttpfTypeCod === '')) {
          if (_cstAgeCod === '0' && (_cstAge >= 14 || _cstAge === '')) {
            vm.msgInfo.ttpfTypeCod = '1'
          } else {
            vm.msgInfo.ttpfTypeCod = '2'
          }
        }
      }
      // 医生端若疼痛评分如果没有填过，则打开时默认NRS评分 ---- 医生端目前传参类型是 --- saveByParent
      if (type === 'saveByParent') {
        if ((_nrsSco == null || _nrsSco === '') && (_ttpfTypeCod == null || _ttpfTypeCod === '')) {
          vm.msgInfo.ttpfTypeCod = '1'
        }
      }
      vm.getParentInfo(); // 处理数据
    }

    $(function () {
      vm.initPanel(); // 初始化滑动条
      if (_typeSource === 'grade') {
        $('.basicDiv').show()
        getParentBasicVal()
        getAjaxDataVal()
      } else {
        $('.basicDiv').hide()
        if (_typeSource === 'preCheck' || _typeSource === 'saveByParent') {
          getParentPageVal(_typeSource)
        }
        if (_typeSource === 'hlpgb' || _typeSource === 'jzcs' || _typeSource === 'hljld') {
          $('#nrsForm').attr('action', '${baseurl}hlpgb/submitNrsScore.do')
          _xtpgSeq = parent.$('#nrsSeq').val();
          $('#xtEmg').val(_xtpgSeq);
          $('#emgSeq').val(parent.$('#hplgEmg').val());
          getAjaxDataVal()
        }
      }
      if (parent.setIframeDivHeight) {
        $('.addbtn').hide()
      } else {
        $('.addbtn').show()
      }
    })
  </script>
</body>

</html>