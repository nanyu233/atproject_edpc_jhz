<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>输血(血制品)记录-update</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script>
    var _emgSeq = '${hspemginfCustom.emgSeq}'
  </script>
</head>

<body class="operateLr">
  <form method="post" class="at-form" ms-controller="bloodRecord" id="bloodRecordForm" action="${baseurl}transfusion/updateBloodTransRecord.do" method="post">
    <div class="all-title">输血(血制品)记录</div>
    <input class="hidden" type="text" name="hspTransfusionInfCustom.emgSeq" value="${hspemginfCustom.emgSeq}">
    <input class="hidden" type="text" id="transfusionSeq" name="hspTransfusionInfCustom.transfusionSeq" value="${transfusionSeq}">
    <ul class="middleul">
      <li class="infoli">
        姓名：
        <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.cstNam}" />&emsp;
        性别：
        <input class="titleinputSpc" unselectable='on' readonly="readonly" value="${hspemginfCustom.cstSexCod}" />&emsp;
        年龄：
        <input class="titleinputSpc" unselectable='on' readonly="readonly" id="age" />&emsp;
        科别：
        <input class="titleinput_kb" unselectable='on' readonly="readonly" value="急诊科门诊" />&emsp;
        病历号：
        <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.mpi}" />&emsp;
        <!-- 留观号：
        <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.observationCode}"/>&emsp; -->
      </li>
    </ul>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">输注时间</label>
      <div class="right_content">
        <input class="Wdate input-sdate" type="text" ms-duplex-string="info.infusionStartDat" name="hspTransfusionInfCustom.infusionStartDat"
          onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
        -
        <input class="Wdate input-sdate" type="text" ms-duplex-string="info.infusionEndDat" name="hspTransfusionInfCustom.infusionEndDat"
          onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">输血(血制品)指征</label>
      <div class="right_content">
        <input type="text" class="long-input" ms-duplex-string="info.indication" name="hspTransfusionInfCustom.indication" max-length="300"></input>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">输血(血制品)成分</label>
      <div class="right_content">
        <input type="text" class="long-input" ms-duplex-string="info.composition" name="hspTransfusionInfCustom.composition" max-length="300"></input>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">输血(血制品)量</label>
      <div class="right_content">
        <input type="text" ms-duplex-string="info.amount" name="hspTransfusionInfCustom.amount" max-length="100"></input>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">
        输血前评估及处理
        <br/>
        <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('temDiv')">[导入]</a>
      </label>
      <div class="temdiv temp-div-trans" id="temDiv"></div>
      <div class="right_content">
        <textarea class="div-textarea divarea" ms-duplex-string="info.assessment" name="hspTransfusionInfCustom.assessment" id="assessment" max-length="1000"></textarea>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">
        输注过程
        <br/>
        <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
      </label>
      <div class="temdiv temp-div-trans" id="subTemDiv"></div>
      <div class="right_content">
        <textarea class="div-textarea divarea" ms-duplex-string="info.infusionProcess" name="hspTransfusionInfCustom.infusionProcess" id="infusionProcess" max-length="2000"></textarea>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">输血后评估</label>
      <div class="right_content">
        <label>体温：</label>
        <select ms-duplex-string="info.tmpNbrFlg" name="hspTransfusionInfCustom.tmpNbrFlg" ms-change="cleanSignValue('tmpNbrFlg', 'tmpNbr')"
          class="small-select-wth">
          <option value="1">耳温</option>
          <option value="2">不升</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="small-input-wth" maxlength="4" name="hspTransfusionInfCustom.tmpNbr"
          ms-attr-disabled="info.tmpNbrFlg == 2 || info.tmpNbrFlg == 3" ms-keyup="onlyNum('tmpNbr',1,100)" ms-change="onlyNum('tmpNbr',1,100)"
          ms-input="onlyNum('tmpNbr',1,100)" ms-duplex-string="info.tmpNbr">℃
        <label class="m-l30">心率：</label>
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.hrtRte" name="hspTransfusionInfCustom.hrtRte"
          ms-keyup="onlyNum('hrtRte')" ms-change="onlyNum('hrtRte')" ms-input="onlyNum('hrtRte')">次/分
        <label class="m-l30">呼吸：</label>
        <select ms-duplex-string="info.breNbrFlg" name="hspTransfusionInfCustom.breNbrFlg" ms-change="cleanSignValue('breNbrFlg', 'breNbr')"
          class="small-select-wth">
          <option value="1"></option>
          <option value="2">机械通气</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.breNbr" name="hspTransfusionInfCustom.breNbr"
          ms-attr-disabled="info.breNbrFlg == 3" ms-keyup="onlyNum('breNbr')" ms-change="onlyNum('breNbr')"
          ms-input="onlyNum('breNbr')">次/分
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big"></label>
      <div class="right_content">
        <label>血氧：</label>
        <select ms-duplex-string="info.xyFlg" name="hspTransfusionInfCustom.xyFlg" ms-change="cleanSignValue('xyFlg', 'oxyNbr')"
          class="small-select-wth">
          <option value="1"></option>
          <option value="2">测不出</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.oxyNbr" name="hspTransfusionInfCustom.oxyNbr"
          ms-attr-disabled="info.xyFlg == 2 || info.xyFlg == 3" ms-keyup="onlyNum('oxyNbr')" ms-change="onlyNum('oxyNbr')"
          ms-input="onlyNum('oxyNbr')">%
        <label class="m-l30">脉搏：</label>
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.pulse" name="hspTransfusionInfCustom.pulse"
          placeholder="次/分" ms-keyup="onlyNum('pulse')" ms-change="onlyNum('pulse')" ms-input="onlyNum('pulse')">次/分
        <label class="m-l30">血糖：</label>
        <select ms-duplex-string="info.pbgNbrType" name="hspTransfusionInfCustom.pbgNbrType" class="small-select-wth">
          <option value=""></option>
          <option ms-repeat-item="getMsg.xtCodList" ms-attr-value="item.infocode">{{item.info}}</option>
        </select>
        <select ms-duplex-string="info.pbgNbrFlg" name="hspTransfusionInfCustom.pbgNbrFlg" ms-change="cleanSignValue('pbgNbrFlg', 'pbgNbr')">
          <option value="1"></option>
          <option value="2">LO</option>
          <option value="3">HI</option>
          <option value="4">拒测</option>
        </select>
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.pbgNbr" name="hspTransfusionInfCustom.pbgNbr"
          ms-change="cleanSignValue('pbgNbrFlg', 'pbgNbr')" ms-attr-disabled="info.pbgNbrFlg == 2 || info.pbgNbrFlg == 3 || info.pbgNbrFlg == 4"
          ms-keyup="onlyNum('pbgNbr', 2, 100)" ms-change="onlyNum('pbgNbr', 2, 100)" ms-input="onlyNum('pbgNbr', 2, 100)">mmol/L
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big"></label>
      <div class="right_content">
        <label>血压：</label>
        <select ms-duplex-string="info.sbpNbrFlg" name="hspTransfusionInfCustom.sbpNbrFlg" ms-change="cleanSignValue('sbpNbrFlg', 'sbpUpNbr','sbpDownNbr')"
          class="small-select-wth">
          <option value="1"></option>
          <option value="2">测不出</option>
          <option value="3">拒测</option>
        </select>
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.sbpUpNbr" name="hspTransfusionInfCustom.sbpUpNbr"
          placeholder="收缩压" ms-attr-disabled="info.sbpNbrFlg == 2 || info.sbpNbrFlg == 3" ms-keyup="onlyNum('sbpUpNbr')"
          ms-change="onlyNum('sbpUpNbr')" ms-input="onlyNum('sbpUpNbr')">
        -
        <input type="text" class="small-input-wth" maxlength="4" ms-duplex-string="info.sbpDownNbr" name="hspTransfusionInfCustom.sbpDownNbr"
          placeholder="舒张压" ms-attr-disabled="info.sbpNbrFlg == 2 || info.sbpNbrFlg == 3" ms-keyup="onlyNum('sbpDownNbr')"
          ms-change="onlyNum('sbpDownNbr')" ms-input="onlyNum('sbpDownNbr')">mmHg
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">输血反应</label>
      <div class="right_content">
        <label ms-repeat-item="getMsg.reactionList" ms-attr-for="reaction{{item.infocode}}" class="check-label-style">
          <input type="checkbox" ms-attr-id="reaction{{item.infocode}}" ms-attr-value="item.infocode" ms-duplex="info.reaction"
            ms-change="changeToStr('reaction', item.infocode)">
          {{item.info}}
        </label>
        <input type="text" class="hidden" ms-duplex-string="hideStr.reaction" name="hspTransfusionInfCustom.reaction">
        <input type="text" class="m-r5" ms-visible="hideStr.reaction == 1" ms-duplex-string="info.reactionContent" name="hspTransfusionInfCustom.reactionContent"
        maxlength="100">
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big">
        输血(血制品)疗效评价计划
        <br/>
        <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('lastTemDiv')">[导入]</a>
      </label>
      <div class="temdiv temp-div-trans" id="lastTemDiv"></div>
      <div class="right_content">
        <textarea ms-duplex-string="info.evaluationPlan" name="hspTransfusionInfCustom.evaluationPlan" class="div-textarea divarea" id="evaluationPlan"
        maxlength="2000"></textarea>
      </div>
    </div>
    <div class="at-form-item clr">
      <label class="label_left label_left_big"></label>
      <div class="right_content text-r">
        <label>医师签名：</label>
        <span class="spanRelative">
          <!-- onkeydown="getSignList(event)"  -->
          <input type="text" id="docName" maxlength="10" name="hspTransfusionInfCustom.docNam" readonly
            ms-duplex-string="info.docNam">
          <input type="text" class="hidden" id="docNameNum" maxlength="10" name="hspTransfusionInfCustom.docCod" ms-duplex-string="info.docCod">
          <div class="userList" id="userNameList"></div>
        </span>
        <span id="dzqmsq"></span>&nbsp;
        <label>日期：</label>
        <input class="Wdate input-sdate" type="text" ms-duplex-string="info.transfusionDat" name="hspTransfusionInfCustom.transfusionDat"
          onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
      </div>
    </div>
  </form>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js" type="text/javascript"></script>
  <script type="text/javascript">
    var currentDate = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
    var vm = avalon.define({
      $id: 'bloodRecord',
      getMsg: {
        xtCodList: publicFun.getDict('XT_COD'),
        reactionList: [{ info: '无', infocode: '0' }, { info: '有', infocode: '1' }]
      },
      info: {
        infusionStartDat: currentDate, // 输注时间--开始时间
        infusionEndDat: currentDate, // 输注时间--结束时间
        indication: '', // 输血指征
        composition: '', // 输血成分
        amount: '', // 输血量
        assessment: '', // 输血前评估及处理
        infusionProcess: '', // 输血过程
        tmpNbrFlg: '1', // 体温
        tmpNbr: '',
        hrtRte: '', // 心率
        breNbrFlg: '1', // 呼吸
        breNbr: '', // 呼吸
        sbpNbrFlg: '1', // 血压
        sbpUpNbr: '', // 血压
        sbpDownNbr: '', // 血压
        xyFlg: '1', // 血氧
        oxyNbr: '', // 血氧
        pbgNbrType: '', // 血糖
        pbgNbrFlg: '1', // 血糖
        pbgNbr: '', // 血糖
        pulse: '', // 脉搏
        reaction: [], // 反应 0：无，1：有
        reactionContent: '', // 反应内容	
        evaluationPlan: '', // 输血(血制品)疗效评价计划
        docNam: '${sessionScope.activeUser.usrname}', // 医师签名
        docCod: '${sessionScope.activeUser.usrno}',
        crtCod: '',
        transfusionDat: currentDate // 日期
      },
      hideStr: {
        reaction: ''
      },
      changeToStr: function (obj, codText) {
        var _list = vm.info[obj].$model;
        var _signalCheckList = ['reaction'];
        if ($.inArray(obj, _signalCheckList) > -1) {
          if (_list.length > 0) {
            vm.info[obj] = [codText];
            vm.hideStr[obj] = codText
          } else {
            vm.info[obj] = [];
            vm.hideStr[obj] = ''
          }
          if (obj === 'reaction') {
            if (vm.hideStr[obj] != '1') {
              vm.info.reactionContent = '';
            }
          }
        } else {
          if (_list.length > 0) {
            vm.hideMsg[obj] = _list.join(',');
          } else {
            vm.hideMsg[obj] = ''
          }
        }
      },
      onlyNum: function (attr, step, max) {
        vm.info[attr] = publicFun.onlyNumber(vm.info[attr], step, max);
      },
      cleanSignValue: function (cod, inputField, inputFieldB) {
        var _fieldList = ['tmpNbr', 'oxyNbr', 'pbgNbr', 'sbpUpNbr'];
        for (var i = 0; i < _fieldList.length; i++) {
          if (_fieldList[i] == inputField) {
            if (vm.info[cod] != 1) {
              vm.info[inputField] = ''
              if (inputFieldB) {
                vm.info[inputFieldB] = ''
              }
            }
          }
        }
        if (inputField == 'breNbr') {
          if (vm.info[cod] == 3) {
            vm.info[inputField] = ''
          }
        }
      }
    })

    function getSignList(e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('docName', 'userNameList');
      }
    }

    $("body").click(function () {
      $(".userList").hide();
    });
    
    /**
     * @ 签名
     */
    function getSign() {
      var transfusionSeq = $('#transfusionSeq').val();
        if (transfusionSeq != null && transfusionSeq != '') {
          publicFun.httpServer(
            { url: '${baseurl}zyylqbl/getSign.do' }, 
            { "emgSeq": _emgSeq,"relevanceId": transfusionSeq,"documentTable": 'HSP_TRANSFUSION_INF',"templateId":'hash_013'
            ,"request172":'输血记录'}, 
            function (res) {
              if(res.resultInfo.type == 1){
                findDzqmImg();
              }
            message_alert(res);
            setTimeout("$('.messager-body').window('close')", 1000);
          })
        }else{
          publicFun.alert("请先保存数据。");
        }
    }
    
    function findDzqmImg() {
      var transfusionSeq = $('#transfusionSeq').val();
      if (transfusionSeq != null && transfusionSeq != '') {
         publicFun.httpServer(
        { url: '${baseurl}zyylqbl/findDzqmImg.do' }, 
        { "relevanceId": transfusionSeq,"documentTable": 'HSP_TRANSFUSION_INF'}, 
        function (res) {
          if(res.resultInfo.type != 1){
            message_alert(res);
            return false;
          }
          $("#dzqmsq").html('');
          var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
          for(var i=0; i <imgList.length; i++){
            var img = $("<img />")
            $("#dzqmsq").append(img.attr({"src":"data:image/jpeg;base64,"+res.resultInfo.sysdata.hspAotographInfoCustomList[i].docImg,"width":88}));
          }
        })
      }
    }

    function saveForm() {
      publicFun.cleanSignMsg('docName');
      if (vm.info.transfusionDat == '') {
        publicFun.alert('请输入日期');
        return false;
      }
      if ($('#docName').val() == '') {
        publicFun.alert('请输入医师签名');
        return false;
      }
      jquerySubByFId('bloodRecordForm', function (res) {
        message_alert(res);
        $('#transfusionSeq').val(res.resultInfo.sysdata.onlySeq);
        setTimeout(function(){
          $(".messager-body").window('close');    
        },1000);
      }, null, 'json');
    }
    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#age').val('')
      }
    }
    function initAjax() {
      if ('${transfusionSeq}') { // 修改页面
        ///////////////wenti
        publicFun.httpServer({ url: '${baseurl}transfusion/getTransfusionInf.do' }, { 'transfusionSeq': '${transfusionSeq}' }, function (res) {
          var data = res.resultInfo.sysdata.hspTransfusionInf;
          for (var key in data) {
            if (vm.hideStr.hasOwnProperty(key)) {
              if (data[key] !== '' && data[key] !== null) {
                vm.hideStr[key] = data[key];
                vm.info[key] = data[key].split('');
              }
            } else if (vm.info.hasOwnProperty(key)) {
              if (key === 'infusionStartDat' || key === 'infusionEndDat' || key === 'transfusionDat') {
                if (data[key]) {
                  vm.info[key] = publicFun.timeFormat(new Date(data[key]), 'yyyy/MM/dd hh:mm:ss')
                } else {
                  vm.info[key] = ''
                }
              } else {
                vm.info[key] = data[key] || '';
              }
            }
          }
          parent.checkRole(vm.info.crtCod);
        })
      }
    }

    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });

    $(function () {
      initAge();
      initAjax();
      initDocImportHtml('temDiv', 'assessment')
      initDocImportHtml('subTemDiv', 'infusionProcess')
      initDocImportHtml('lastTemDiv', 'evaluationPlan')
      findDzqmImg()
      // 所有的文本框都设置不填充
      $('input:not([autocomplete]),textarea:not([autocomplete]),select:not([autocomplete])').attr('autocomplete', 'off'); 
    })
  </script>
</body>

</html>