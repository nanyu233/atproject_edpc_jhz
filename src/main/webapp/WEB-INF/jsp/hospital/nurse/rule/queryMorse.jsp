<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>Morse跌倒风险评估表</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/winScore.css?aaa=5555">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _baseUrl= "${baseurl}",
        _typeSource = '${typeSource}';
    var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'),
        _typeSource = '${typeSource}',
        _xtpgSeq = parent.$('#ddfxpgbSeq').val();
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/MorseVm.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="winScore">
  <form id="MorseGdeform" action="${baseurl}hlpgb/submitMorseScore.do" method="post">
    <div class="scoreQuery" ms-controller="MorseGde">
      <p class="headtitle">Morse跌倒风险评估表</p>
      <input class="hidden" type="text" name="hspDdfxpgbInfCustom.emgSeq" id="morseEmg">
      <input class="hidden" type="text" name="hspDdfxpgbInfCustom.ddfxpgbSeq" id="ddfxpgbSeq">
      <div class="DangerContent panelContent">
        <ul class="tableUl paneltab">
          <li class="twoLi">
            <span class="titleSpan titleCol">近3月有无跌倒</span>
            <label ms-repeat="systemList.jsgyywddCodList" ms-attr-for="jsgyywddCod{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="jsgyywddCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('jsgyywddCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.jsgyywddCod" name="hspDdfxpgbInfCustom.jsgyywddCod">
          </li>
          <li class="twoLi">
            <span class="titleSpan">多于一个疾病诊断</span>
            <label ms-repeat="systemList.dyygjbpdCodList" ms-attr-for="dyygjbpdCod{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="dyygjbpdCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('dyygjbpdCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.dyygjbpdCod" name="hspDdfxpgbInfCustom.dyygjbpdCod">
          </li>
          <li>
            <span class="titleSpan titleCol">行走辅助</span>
            <label ms-repeat="systemList.xzfzCodList" ms-attr-for="xzfzCod{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="xzfzCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('xzfzCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.xzfzCod" name="hspDdfxpgbInfCustom.xzfzCod">
          </li>
          <li class="twoLi">
            <div class="showDivFour" id="showDivFour">
              <p class="showMsgFour">
                {{ywhideMsg.hiddenMsg}}
              </p>
              <img src="../images/hzszyyhems/systemAssess/triangle.png">
            </div>
            <span class="titleSpan">静脉治疗/使用<span class="showKy">跌倒高风险药</span></span>
            <label ms-repeat="systemList.jmzlsyddgfxyCodList" ms-attr-for="jmzlsyddgfxyCod{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="jmzlsyddgfxyCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('jmzlsyddgfxyCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.jmzlsyddgfxyCod" name="hspDdfxpgbInfCustom.jmzlsyddgfxyCod">
          </li>
          <li>
            <span class="titleSpan titleCol">步态</span>
            <label ms-repeat="systemList.btCodList" ms-attr-for="btCod{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="btCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('btCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.btCod" name="hspDdfxpgbInfCustom.btCod">
          </li>
          <li class="twoLi">
            <span class="titleSpan">认知能力</span>
            <label ms-repeat="systemList.rznlCodList" ms-attr-for="rznlCod{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.remark}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="rznlCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="Objradioclick('rznlCod',$index,'aboutmorse')">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutmorse.rznlCod" name="hspDdfxpgbInfCustom.rznlCod">
          </li>
          
        </ul>
        <div class="scoreDiv">
          <span class="boldFont">标准护理措施：</span><br />
          <span  ms-repeat="systemList.hlcsCodList">
            <label ms-attr-for="hlcsCod{{el.infocode}}" class="lab-title">
              <input ms-attr-id="hlcsCod{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('hlcsCod',$index)">{{el.info}}
            </label><br/>
          </span>
          <input type="hidden" ms-duplex-string="hideMsg.hlcsCod" name="hspDdfxpgbInfCustom.hlcsCod"/>
        </div>
        <div class="scoreDiv">
          <span>
            <span class="boldFont">评估结果：<i>{{aboutmorse.zf}}</i>  </span><br />
            <span class="boldFont">{{hideMsg.MorseQk}}</span><br />
            <input type="hidden" name="hspDdfxpgbInfCustom.zf" ms-duplex-string="aboutmorse.zf">
            <span>评定标准：总分＜25分为低风险患者；25-44分为中风险患者；≥45分为高风险患者</span><br>
            <span>评分说明：</span><br />
            <span>1、近3月有无跌倒：本次入院或最近3个月是否有跌倒坠床病史，有25分，无0分。</span><br />
            <span>2、多于一个疾病诊断：患者病案中有两项或更多医学诊断（非同一系统）则评分为15分，只有一项评分为0分。</span><br />
            <span>3、行走辅助：患者行走不需要任何物品辅助，步态自然，或患者卧床休息不能起床活动，则评分为 0 分；患者行走使用拐杖/手杖/助步器则评分为 15 分；患者扶住墙或其他物品行走评分为30分。</span><br />
            <span>4、静脉治疗/使用跌倒高风险药：患者正在进行静脉内治疗或者使用跌倒高风险药治疗（麻醉药、抗组胺药、抗高血压药、镇静催眠药、抗帕金森药、抗癫痫药、抗痉挛药、缓泻药、利尿药、降糖药、骨骼肌松弛药、抗抑郁抗焦虑药、抗精神病药、眼药水）则评分为 25 分，没有静脉治疗、未使用跌倒高风险药则评分为 0 分。备注：跌倒高风险药详见浙江医院《易跌倒药品目录》。</span><br />
            <span>5、步态：正常步态或卧床休息，则评分为 0 分；患者年龄超过 65 岁或存在体位性低血压或步态乏力（小步态或患者不抬腿或拖着脚走），则评分为 10 分；有肢体偏瘫、肢体缺失、或有肢体术后功能尚未完全恢复、帕金森疾病起步困难或特殊步态，包括全盲，或者患者勉强站立，站立后低头，眼睛看地板，下肢颤抖，难以移步，则评分为 20 分。</span><br />
            <span>6、认知能力：患者神志清醒，遵医行为好，明白自己容易跌倒，知道跌倒的危害，有自我保护意识，则评分为0分；患者存在跌倒危险，但过于自信，高估自己的行走能力，认为自己走路完全没问题，或反复跌倒而未引起重视，以及认知障碍，记忆力、判断力下降，没有自我保护意识，则评分为15分。</span>
          </span>
        </div>
      </div>
      <div class="overflow_btn">
        <a id="submitBtn" class="easyui-linkbutton addbtn" iconCls="icon-ok" ms-click="fillMorse()">确定</a>
        <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
      </div>
  </form>
  </div>
  <script>
      $('.showKy').hover(function () {
        vm.ywhideMsg.hiddenMsg = "麻醉药、抗组胺药、抗高血压药、镇静催眠药、抗帕金森药、抗癫痫药、抗痉挛药、缓泻药、利尿药、降糖药、骨骼肌松弛药、抗抑郁抗焦虑药、抗精神病药、眼药水"
        $('#showDivFour').show();
      }, function () {
        $('#showDivFour').hide();
      });
    //保存回调
    function hlpginsert_callback(data) {
      if(_typeSource == 'hljld'){
        parent.sub.aboutSco.ddfxpgbSeq = data.resultInfo.message;
      }else{
        parent.$('#ddfxpgbSeq').val(data.resultInfo.message);
      }
      // $.messager.alert('提示信息', '保存成功', 'success');
      parent.sub.aboutSco.morseSco = vm.aboutmorse.zf;
      parent.closemodalwindow()
    }

    //保存
    function fillMorse() {
      if(_typeSource == 'precheck'){
        parent.$("#emg_zf").val(vm.aboutmorse.zf);
        parent.$("#emg_jsgyywddCod").val(vm.aboutmorse.jsgyywddCod);
        parent.$("#emg_dyygjbpdCod").val(vm.aboutmorse.dyygjbpdCod);
        parent.$("#emg_xzfzCod").val(vm.aboutmorse.xzfzCod);
        
        parent.$("#emg_jmzlsyddgfxyCod").val(vm.aboutmorse.jmzlsyddgfxyCod);
        parent.$("#emg_btCod").val(vm.aboutmorse.btCod);
        parent.$("#emg_rznlCod").val(vm.aboutmorse.rznlCod);
        parent.$("#emg_hlcsCod").val(vm.hideMsg.hlcsCod);
        parent.$("#emg_MorseQk").val(vm.hideMsg.MorseQk);
        parent.closemodalwindow();
      }else if(_typeSource == 'jzcs'){
        $('#MorseGdeform').attr('action', '${baseurl}hlpgb/submitMorseScoreCS.do')
        jquerySubByFId('MorseGdeform', hlpginsert_callback, null, "json");
      }else if(_typeSource == 'hljld'){
        // if(parent._count == 0 && parent._count != ''){
        //   $('#ddfxpgbSeq').val('')
        // }
        $('#MorseGdeform').attr('action', '${baseurl}zjszyyhljld/subMorseScore.do')
        jquerySubByFId('MorseGdeform', hlpginsert_callback, null, "json");
      }else{
        jquerySubByFId('MorseGdeform', hlpginsert_callback, null, "json");
      }
    }
    function getMsgListP(){
      var getMsgUrl = _baseUrl + 'scorequery/findScopeQueryList.do';
      publicFun.httpServer({ url: getMsgUrl}, { _t: Date.parse(new Date()) }, function (data) {
        var msgList = data.resultInfo.sysdata;
        if (data.resultInfo.type == '1') {
          $.each(msgList, function (key, val) {
            if (vm.systemList.hasOwnProperty(key)) {
              $.each(val, function (idx, valu) {
                valu['checked'] = false
              })
              vm.systemList[key] = val;
            }
          });
        }
        var _data = [];
        _data.zf = parent.$("#emg_zf").val();
        _data.jsgyywddCod = parent.$("#emg_jsgyywddCod").val();
        _data.dyygjbpdCod = parent.$("#emg_dyygjbpdCod").val();
        _data.xzfzCod = parent.$("#emg_xzfzCod").val();
        _data.jmzlsyddgfxyCod = parent.$("#emg_jmzlsyddgfxyCod").val();
        _data.btCod = parent.$("#emg_btCod").val();
        _data.rznlCod = parent.$("#emg_rznlCod").val();
        _data.hlcsCod = parent.$("#emg_hlcsCod").val();
        _data.MorseQk = parent.$("#emg_MorseQk").val();

        assignment(vm.aboutmorse, _data)
      });
    }

    $(function () {
      if(_typeSource == 'hlpgb' || _typeSource == 'jzcs'|| _typeSource == 'hljld'){
        $('#morseEmg').val(parent.$('#hplgEmg').val());
        $('#ddfxpgbSeq').val(parent.$('#ddfxpgbSeq').val());
        getMsgList();
      }else{
        getMsgListP();
      }
    })
  </script>
</body>

</html>