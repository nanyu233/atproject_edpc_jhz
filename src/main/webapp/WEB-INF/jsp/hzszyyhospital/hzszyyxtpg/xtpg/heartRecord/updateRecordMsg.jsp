<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>心肺复苏记录单</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/heartRecord.css?v=${versionDay}">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${emgSeq}',
      _xtpg = '',
      _hzDes = '',
      _symSitDes = '';
  </script>
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body>
  <div class="recordBody" id="recordMsgDiv" v-cloak>
    <form id="noteForm" action="${baseurl}zjszyyhljld/edithljldsubmit.do" method="post">
      <input type="hidden" id="heartSeq" value="${heartSeq}">
      <input class="hidden" type="text" id="emgSeq" value="${emgSeq}">
      <input class="hidden" type="text" id="hs_usrno" value="${hsUsrno}">
      <p class="formTitle">心肺复苏记录单</p>
      <div class="content-wrapper">
        <!-- <div class="subtitle">
          <span class="floatLeft">
            记录时间：<input class="Wdate" type="text" v-model="recordInfo.recordTime" id="recordTime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"
              onchange="sub.recordInfo.recordTime = $('#recordTime').val()" autocomplete="off">
          </span>
          <span class="floatRight">
            <span class="floatLeft">
              <span>护士签名：</span>
              <span class="relative">
                <input type="text" id="userSign" maxlength="10" autocomplete="off">
                <div class="userList Listpos" id="userList"></div>
              </span>
            </span>
          </span>
        </div>
        <div class="cutoff"></div> -->
        <ul class="content-ul">
          <li class="basic-li">
            <label class="normal-lab-title">
              抢救时间：
            </label>
            <input class="Wdate floatLeft" type="text" v-model="recordInfo.rescueTime" id="rescueTime" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss', isShowClear:false, readOnly:true})"
              onchange="sub.recordInfo.rescueTime = $('#rescueTime').val()" autocomplete="off">
            <span class="left-span">
              意识：
            </span>
            <select v-model="recordInfo.senStuCod" class="text-sel" @change="cleanOtherText('senStuCod', 'senStuOther', '4')">
              <option value=""></option>
              <option v-for="item in getMsg.senStuCodList" :value="item.infocode">{{item.info}}</option>
            </select>
            <input type="text" class="text-input" maxlength="20" v-model="recordInfo.senStuOther" v-show="recordInfo.senStuCod == 4" autocomplete="off">
            <span class="left-span">
              心律：
            </span>
            <select v-model="recordInfo.hrtRhythm" class="text-sel">
              <option value=""></option>
              <option v-for="item in getMsg.hrtRhythmList" :value="item.infocode">{{item.info}}</option>
            </select>
            <input type="text" id="hrtRhythmOther" v-model="recordInfo.hrtRhythmOther" class="text-input" v-show="recordInfo.hrtRhythm == 5"
            autocomplete="off">

            <span class="left-span">
              心率：
            </span>
            <input type="text" maxlength="4" id="hrtRte" v-model="recordInfo.hrtRte" placeholder="次/分" class="text-input"
              @keyup="onlyNum('recordInfo','hrtRte')" @change="onlyNum('recordInfo','hrtRte')" @input="onlyNum('recordInfo','hrtRte')"
              autocomplete="off">
            
          </li>
          <li class="basic-li">
              <span class="normal-lab-title">呼吸：</span>
              <select id="breathSel" class="text-sel" v-model="recordInfo.breNbrFlg" onchange="cleanVal('breathSel', 'breNbr')">
                <option value="1"></option>
                <option value="2">机械通气</option>
                <option value="3">拒测</option>
              </select>
              <input type="text" maxlength="4" id="breNbr" v-model="recordInfo.breNbr" :disabled="recordInfo.breNbrFlg == '3'"
                placeholder="次/分" class="text-input" @keyup="onlyNum('recordInfo','breNbr')" @input="onlyNum('recordInfo','breNbr')"
                @change="onlyNum('recordInfo','breNbr')" autocomplete="off">
            <label class="left-span">
              血压：
            </label>
            <select class="text-sel" id="SdpSel" onchange="cleanVal('SdpSel', 'sbpUpNbr','sbpDownNbr')" v-model="recordInfo.sbpNbrFlg">
              <option value="1"></option>
              <option value="2">测不出</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" maxlength="4" id="sbpUpNbr" :disabled="recordInfo.sbpNbrFlg == '2'||recordInfo.sbpNbrFlg == '3'"
              v-model="recordInfo.sbpUpNbr" placeholder="收缩压" class="text-input" @keyup="onlyNum('recordInfo','sbpUpNbr')"
              autocomplete="off">
            <span>-</span>
            <input type="text" maxlength="4" id="sbpDownNbr" :disabled="recordInfo.sbpNbrFlg == '2'||recordInfo.sbpNbrFlg == '3'"
              v-model="recordInfo.sbpDownNbr" placeholder="舒张压" class="text-input" @keyup="onlyNum('recordInfo','sbpDownNbr')"
              @input="onlyNum('recordInfo','sbpDownNbr')" @change="onlyNum('recordInfo','sbpDownNbr')" autocomplete="off">
          </li>
          <li class="basic-li">
            <label class="normal-lab-title">
              瞳孔左：
            </label>
            <label v-for="item in getMsg.tkList" class="check-label" :for="'pupilLeft' + item.infocode">
              <input :id="'pupilLeft' + item.infocode" type="checkbox" :value="item.infocode" v-model="recordInfo.pupilLeft"
                @change="arrToStr('pupilLeft', item.infocode)">
              {{item.info}}
            </label>
            <input type="text" v-model="recordInfo.pupilSizeLeft" placeholder="mm" class="text-input-small floatLeft"
              @keyup="onlyNum('recordInfo','pupilSizeLeft', 2, 30)" autocomplete="off">
            <span class="floatLeft">&emsp;其他：</span>
            <input type="text" v-model="recordInfo.pupilLeftOther" class="text-input-small floatLeft" autocomplete="off">
            <span class="left-span floatLeft">瞳孔右：</span>
            <label v-for="item in getMsg.tkList" class="check-label" :for="'pupilRight' + item.infocode">
              <input :id="'pupilRight' + item.infocode" type="checkbox" :value="item.infocode" v-model="recordInfo.pupilRight"
                @change="arrToStr('pupilRight', item.infocode)">
              {{item.info}}
            </label>
            <input type="text" v-model="recordInfo.pupilSizeRight" placeholder="mm" class="text-input-small floatLeft"
              @keyup="onlyNum('recordInfo','pupilSizeRight', 2, 30)" autocomplete="off">
            <span class="floatLeft">&emsp;其他：</span>
            <input type="text" v-model="recordInfo.pupilRightOther" class="text-input-small floatLeft" autocomplete="off">
          </li>
          <li class="basic-li">
            <label class="normal-lab-title">
              氧饱和度：
            </label>
            <select class="text-sel" id="xySel" onchange="cleanVal('xySel', 'xy')" v-model="recordInfo.xyFlg">
              <option value="1"></option>
              <option value="2">测不出</option>
              <option value="3">拒测</option>
            </select>
            <input type="text" maxlength="4" v-model="recordInfo.xy" :disabled="recordInfo.xyFlg == '2'||recordInfo.xyFlg == '3'"
              placeholder="%" class="text-input" @keyup="onlyNum('recordInfo','xy')" @input="onlyNum('recordInfo','xy')"
              @change="onlyNum('recordInfo','xy')">
            <span class="left-span">通气：</span>
            <select v-model="recordInfo.ventilation" class="text-sel">
              <option value=""></option>
              <option v-for="item in getMsg.ventilationList" :value="item.infocode">{{item.info}}</option>
            </select>
            <span class="left-span">氧流量/氧浓度：</span>
            <select class="text-sel" v-model="recordInfo.oxygenType">
              <option value="1">氧流量</option>
              <option value="2">氧浓度</option>
            </select>
            <input type="text" id="itchyFlow" v-model="recordInfo.itchyFlow" class="text-input" @keyup="onlyNum('recordInfo','itchyFlow',2)"
              @input="onlyNum('recordInfo','itchyFlow',2)" @change="onlyNum('recordInfo','itchyFlow',2)">
            <span v-show="recordInfo.oxygenType == 1">L/min</span>
            <span v-show="recordInfo.oxygenType == 2">%</span>
          </li>
        </ul>
        <ul class="content-ul mt-5">
          <li class="basic-li">
            <label class="lab-title long-lab-title">
              静脉推注/泵推：
            </label>
            <span>药物名称：</span>
            <select v-model="recordInfo.intravenousBolusNam" class="text-sel" @change="cleanOtherText('intravenousBolusNam', 'intravenousBolusOther', '7')">
              <option value=""></option>
              <option v-for="item in getMsg.intravenousBolusNamList" :value="item.infocode">{{item.info}}</option>
            </select>
            <input type="text" class="text-input" maxlength="20" v-model="recordInfo.intravenousBolusOther" v-show="recordInfo.intravenousBolusNam == 7" autocomplete="off">
            <span class="left-span">剂量：</span>
            <input type="text" maxlength="10" id="intravenousBolusDose" v-model="recordInfo.intravenousBolusDose" class="text-input"
              @keyup="onlyNum('recordInfo','intravenousBolusDose',2)" @input="onlyNum('recordInfo','intravenousBolusDose',2)"
              @change="onlyNum('recordInfo','intravenousBolusDose',2)" autocomplete="off"> mg
          </li>
          <li class="basic-li">
            <label class="lab-title long-lab-title">
              静脉滴注：
            </label>
            <span>药物名称：</span>
            <select v-model="recordInfo.intravenousDripName" class="text-sel"  @change="cleanOtherText('intravenousDripName', 'intravenousDripOther', '2')">
              <option value=""></option>
              <option v-for="item in getMsg.intravenousDripNameList" :value="item.infocode">{{item.info}}</option>
            </select>
            <input type="text" class="text-input" maxlength="20" v-model="recordInfo.intravenousDripOther" v-show="recordInfo.intravenousDripName == 2" autocomplete="off">
            <span class="left-span">剂量：</span>
            <input type="text" maxlength="10" id="intravenousDripDose" v-model="recordInfo.intravenousDripDose" class="text-input"
              @keyup="onlyNum('recordInfo','intravenousDripDose',2)" @input="onlyNum('recordInfo','intravenousDripDose',2)"
              @change="onlyNum('recordInfo','intravenousDripDose',2)" autocomplete="off"> ml
          </li>
          <li class="basic-li">
            <div class="tempBtn">
              <label>导入：</label>
              <div class="importlab"></div>
              <img class="closeImg" src="${baseurl}images/hzszyyhems/note/1.png" alt="删除" onclick="closeTemp()" />
            </div>
          </li>
          <li class="basic-li">
            <label class="lab-title">
              抢救记录：<a class="my-linkbutton" onclick="showTem()" href="javascript:;">[导入]</a>
            </label>
            <span class="span-wrapper">
              <textarea class="area-wrap" v-model="recordInfo.rescueRecord" id="xtpghznr" onchange="sub.recordInfo.rescueRecord = $('#xtpghznr').val()" maxlength="2000">{{recordInfo.rescueRecord}}</textarea>
            </span>
          </li>
          <li class="basic-li">
            <span class="floatRight right-gap">
              <span class="floatLeft">
                <span>护士签名：</span>
                <span class="relative">
                  <input type="text" id="userSign" maxlength="10" autocomplete="off">
                  <div class="userList Listpos" id="userList"></div>
                </span>
              </span>
            </span>
          </li>
        </ul>
        <div class="center">
          <a class="easyui-linkbutton" iconcls="icon-ok" onclick="submitMsg()">保存</a>
        </div>
      </div>
    </form>
  </div>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/nurseNote/importMsg.js"></script>
  <script>
    var today = publicFun.timeFormat(new Date(), 'yyyy-MM-dd hh:mm:ss');
    _pageName = 'updateRecordMsg';
    var sub = new Vue({
      el: '#recordMsgDiv',
      data: function () {
        return {
          recordInfo: {
            emgSeq: _emgSeq, //预检号   
            recordTime: today, //创建时间    
            heartSeq: '${heartSeq}',	//
            rescueTime: today, // 抢救时间
            hrtRte: '',	//心率
            sbpNbrFlg: '1',//血压标识
            sbpUpNbr: '',	//上压
            sbpDownNbr: '',	// 下压
            breNbr: '',	//呼吸
            breNbrFlg: '1',//呼吸标识
            senStuCod: '',	//意识
            senStuOther: '',
            crtUsrNam: '',	//护士用户名
            xy: '',	//血氧
            xyFlg: '1',//血氧标识,
            pupilLeft: [], // 瞳孔
            pupilSizeLeft: '',
            pupilLeftOther: '',
            pupilRight: [],
            pupilRightOther: '',
            pupilSizeRight: '',
            hrtRhythm: '',
            ventilation: '', // 通气
            itchyFlow: '', // 氧流量/氧浓度
            oxygenType: '1', // （1：氧流量，2：氧浓度）
            intravenousBolusNam: '', // 药物名称
            intravenousBolusOther: '',
            intravenousBolusDose: '',  // 药物量
            intravenousDripName: '', // 药物名称
            intravenousDripOther: '',
            intravenousDripDose: '', // 药物量
            rescueRecord: '',
            hrtRhythmOther: '',//心律其他
          },
          getMsg: {
            hrtRhythmList: publicFun.getDict('HRT_RHYTHM'),
            ventilationList: publicFun.getDict('VENTILATION'),
            intravenousBolusNamList: publicFun.getDict('INTRAVENOUS_BOLUS'),
            intravenousDripNameList: publicFun.getDict('INTRAVENOUS_DRIP'),
            senStuCodList: publicFun.getDict('SEN_RCT'), // 意识状态
            tkList: [{ infocode: '0', info: '灵敏' }, { infocode: '1', info: '迟钝' }, { infocode: '2', info: '消失' }, { infocode: '3', info: '白内障' }, { infocode: '4', info: '眼球缺失' }],
          },
          hide: {
            pupilLeft: '',
            pupilRight: ''
          }
        }
      },
      methods: {
        // @@onlyNum 限制只能输入数字
        onlyNum: function (objName, attr, step, max) {
          if (sub[objName][attr] === null && sub[objName][attr] === undefined) {
            return
          }
          sub[objName][attr] = sub[objName][attr] + '';  // 将Number类型转化成String
          var _rtnVal = publicFun.onlyNumber(sub[objName][attr], step, max);
          sub[objName][attr] = _rtnVal;
          this.$set(sub[objName], attr, _rtnVal)
          sub.$forceUpdate();
        },
        checkValNull: function (item) {
          if (sub.hide[item] === '' || sub.hide[item] === null || sub.hide[item] === undefined) {
            return true
          } else {
            return false
          }
        },
        getAjaxMsg: function () {
          if ('${heartSeq}') {
            publicFun.httpServer({ url: _baseUrl + 'heartRecord/getRecordByPrimaryKey.do' }, {
              'heartSeq': '${heartSeq}'
            }, function (res) {
              if (res.type == 0) {
                alert_error(res.message)
              } else if (res.type == 1) {
                // alert_base(res.message)
              } else if (res.type == 2) {
                alert_warn(res.message)
              } else if (res.type == 3) {
                alert_info(res.message)
              }
              if (res.type == 1) {
                var data = res.sysdata.hspHeartRecord;
                for (var key in data) {
                  if (sub.hide.hasOwnProperty(key)) {
                    if (data[key] !== '' && data[key] != null) {
                      sub.recordInfo[key] = data[key].split(',')
                    }
                  } else {
                    if (sub.recordInfo.hasOwnProperty(key)) {
                      if (data[key] !== '' && data[key] != null) {
                        sub.recordInfo[key] = data[key]
                      }
                    }
                  }
                }
                $('#userSign').val(data.recordNam);
              }
            })
          } else {
            $('#userSign').val('${sessionScope.activeUser.usrname}');
          }
        },
        getImportFieldMsg: function () {
          publicFun.httpServer({ url: _baseUrl + 'heartRecord/importAssessment.do' }, {'emgSeq': _emgSeq}, function (data) {
            var res = data.resultInfo;
            if (res.type == 0) {
              alert_error(res.message)
            } else if (res.type == 1) {
              // alert_base(res.message)
            } else if (res.type == 2) {
              alert_warn(res.message)
            } else if (res.type == 3) {
              alert_info(res.message)
            }
            if (res.type == 1) {
              var dataInfo = res.sysdata;
              _xtpg = dataInfo.xtpgDes;
              _hzDes = dataInfo.traumaDes;
              _symSitDes = dataInfo.symSitDes;
            }
          })
        },
        arrToStr: function (attr, cod) {
          var _list = sub.recordInfo[attr].length;
          if (_list > 0) {
            sub.recordInfo[attr] = [cod]
          } else {
            sub.recordInfo[attr] = []
          }
          sub.hide[attr] = sub.recordInfo[attr].join('')
          sub.$forceUpdate();
        },
        cleanOtherText: function (selectObj, textObj, showTextCod) {
          if (sub.recordInfo[selectObj] != showTextCod) {
            sub.recordInfo[textObj] = '';
          }
        }
      },
      mounted: function () {
        this.getAjaxMsg(); // 获取数字字典数据
        this.getImportFieldMsg(); // 获取导入相关字段
        this.getMsg.senStuCodList.push({info: '其他',infocode: '4'})
      },
      watch: {
        'recordInfo.hrtRhythm': function (newVal) {
          if(newVal != '5'){
            sub.recordInfo.hrtRhythmOther = ''
          }
        }
      }
    })

    document.onkeydown = function (evt) {
      publicFun.keyDownRecall(evt, function () {
        var flg = true;
        if ($("#userSign").is(":focus")) {
          searchUser();
          flg = false;
        }
        return flg;
      })
    };

    $("body").click(function () {
      sub.isShowBloodList = false
      $("#userList").hide();
      $("#userNameList").hide();
    });

    function searchUser() {
      if (event.keyCode == 13) {
        publicFun.SearchList("userSign", "userList")
      }
    }

    function submitMsg() {
      // if (publicFun.checkItemNull($("#recordTime").val()) == true) {
      //   alert_warn('记录时间不可为空！')
      // } else 
      if (publicFun.checkItemNull($("#userSign").val()) == true) {
        alert_warn('护士签名不可为空！')
      } else if (publicFun.checkItemNull($("#rescueTime").val()) == true) {
        alert_warn('抢救时间不可为空！')
      } else {
        var _msg = sub.recordInfo;
        publicFun.httpServer({ url: _baseUrl + 'heartRecord/updateRecord.do', requestDataType: 'json' }, {
          heartSeq: _msg.heartSeq,
          emgSeq: _msg.emgSeq,
          rescueTime: _msg.rescueTime,
          senStuCod: _msg.senStuCod,
          pupilLeft: _msg.pupilLeft.join(''),
          pupilRight: _msg.pupilRight.join(''),
          pupilSizeLeft: _msg.pupilSizeLeft,
          pupilSizeRight: _msg.pupilSizeRight,
          hrtRte: _msg.hrtRte,
          hrtRhythm: _msg.hrtRhythm,
          hrtRhythmOther: _msg.hrtRhythmOther,
          sbpNbrFlg: _msg.sbpNbrFlg,
          sbpUpNbr: _msg.sbpUpNbr,
          sbpDownNbr: _msg.sbpDownNbr,
          breNbrFlg: _msg.breNbrFlg,
          breNbr: _msg.breNbr,
          xyFlg: _msg.xyFlg,
          xy: _msg.xy,
          intravenousBolusNam: _msg.intravenousBolusNam,
          intravenousBolusDose: _msg.intravenousBolusDose,
          intravenousDripName: _msg.intravenousDripName,
          intravenousDripDose: _msg.intravenousDripDose,
          // rescueRecord: _msg.rescueRecord,
          rescueRecord: $('#xtpghznr').val(),
          ventilation: _msg.ventilation,
          itchyFlow: _msg.itchyFlow,
          recordNam: $('#userSign').val(),
          recordTime: $('#recordTime').val(),
          senStuOther: _msg.senStuOther,
          oxygenType: _msg.oxygenType,
          intravenousBolusOther: _msg.intravenousBolusOther,
          intravenousDripOther: _msg.intravenousDripOther,
          pupilLeftOther: _msg.pupilLeftOther,
          pupilRightOther: _msg.pupilRightOther
        }, function (data) {
          message_alert(data);
          if (data.resultInfo.type == '1') {
            // parent.getTabList();
            // parent.closemodalwindow();
            var menuName = parent.$('#tabs').tabs('getSelected').panel('options').title;
            setTimeout('parent.$("#tabs").tabs("close","' + menuName + '")', 1000);
          }
        })
      }
    }

    function cleanVal(selVal, inputField, inputFieldB) {
      var _fieldList = ['tmpNbr', 'xy', 'xt', 'sbpUpNbr'];
      for (var i = 0; i < _fieldList.length; i++) {
        if (_fieldList[i] == inputField) {
          if ($('#' + selVal).val() != 1) {
            sub.recordInfo[inputField] = ''
            if (inputFieldB) {
              sub.recordInfo[inputFieldB] = ''
            }
          }
        }
      }
      if (inputField == 'breNbr') {
        if ($('#' + selVal).val() == 3) {
          sub.recordInfo[inputField] = ''
        }
      }
    }

    $(function () {
      showTem(); // 默认显示导入项
    })
  </script>
</body>

</html>