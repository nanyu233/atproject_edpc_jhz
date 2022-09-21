<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>病案首页---打印</title>
</head>

<body>
  <div id="printRecord" class="hidden">
    <div id="printTotalDiv">
      <div id="printNote" class="print-body">
        <div class="logoDivZJ">
        <img src="../images/hems/print/printLogo.jpg">
      </div>
      <div class="titleDivJZ">
        <div class="hosnameBasic" style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">${nurseDocumentName}</div>
        <div id="docuTitle" class="docuTitleBaisc">急诊科脑卒中溶栓流程核查表</div>
        <img id="qrCodeWrap" style="width: 50mm; height: 10mm; float: right; margin: -13mm -30mm 0 0;"></img>
      </div>
      <div class="printWrap">
        <table>
          <colgroup>
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
            <col />
          </colgroup>
          <tbody>
            <tr>
              <th>医疗机构：</th>
              <td colspan="9">
                <span class="line-span-p">{{patientMsg.yljg}}</span>
                (组织机构代码：<span class="line-span-p">{{patientMsg.zzjgCod}}</span>）
              </td>
            </tr>
            <tr rowspan="2">
              <th class="specialTh_p" colspan="10">
                医疗付费方式：
                <label ms-repeat="msgList.ylffTypeList" class="ck-with" ms-class-1="min-ck-with: el.infocode == 1"
                  ms-class-2="specialLeftWith: el.infocode == 3 || el.infocode == 9" ms-class-3="leftWithGap: el.infocode == 5">
                  <input type="checkbox" ms-class="ylffType_p{{el.infocode}}" class="ylffType_p" ms-duplex="patientMsg.ylffType"
                    ms-attr-value="el.infocode">
                  {{el.info}}
                  <span ms-if="el.infocode == 2 || el.infocode == 4 || el.infocode == 8"><br /></span>
                  <span ms-if="patientMsg.isShowPayOtherWay && el.infocode == 9" class="line-span-p">{{patientMsg.ylffOther}}</span>
                </label>
              </th>
            </tr>
            <tr class="underLineTr">
              <td colspan="10">
                <span>
                  &nbsp;&nbsp; 第 &nbsp;&nbsp; {{patientMsg.lqNum}} &nbsp;&nbsp;次留抢
                </span>
                <span class="right-span">
                  病历号：{{patientMsg.mpi}}
                </span>
              </td>
            </tr>
            <tr>
              <th>姓名：</th>
              <td class="underLineTd">
                <span class="line-span-print">{{patientMsg.cstNam}}</span>
              </td>
              <th>性别：</th>
              <td>
                <label ms-repeat="msgList.cstSexCodList">
                  <input class="cstSexCod_p" ms-class="cstSexCod_p{{el.infocode}}" type="checkbox" ms-duplex="patientMsg.cstSexCod"
                    ms-attr-value="el.infocode">{{el.info}}
                </label>
              </td>
              <th>出生日期：</th>
              <td class="underLineTd">
                <span class="line-span-print bthDat_p">{{patientMsg.bthDat}}</span>
              </td>
              <th>年龄：</th>
              <td class="underLineTd">
                <span class="line-span-print">
                  {{patientMsg.cstAge}}
                  <span id="cstAgeCod_p"></span>
                </span>
              </td>
              <th>国籍：</th>
              <td class="underLineTd">
                <span class="line-span-print">{{patientMsg.nationality}}</span>
              </td>
            </tr>
            <tr class="underLineTr">
              <th>民族：</th>
              <td>
                <span class="line-span-print">{{patientMsg.nation}}</span>
              </td>
              <th>职业：</th>
              <td>
                <span id="emgJob_p" class="line-span-print"></span>
              </td>
              <th>工作单位：</th>
              <td colspan="3">
                <span class="line-span-print">{{patientMsg.gzdw}}</span>
              </td>
              <th>婚姻：</th>
              <td>
                <span id="maritalStatus_p" class="line-span-print"></span>
              </td>
            </tr>
            <tr class="underLineTr">
              <th>身份证号：</th>
              <td colspan="3">
                <span class="line-span-print">{{patientMsg.idNbr}}</span>
              </td>
              <th>现住址：</th>
              <td colspan="3">
                <span class="line-span-print">{{patientMsg.cstAdr}}</span>
              </td>
              <th>电话：</th>
              <td>
                <span class="line-span-print">{{patientMsg.pheNbr}}</span>
              </td>
            </tr>
            <tr class="underLineTr">
              <th>关系人名：</th>
              <td>
                <span class="line-span-print">{{patientMsg.gxrNam}}</span>
              </td>
              <th>关系：</th>
              <td>
                <span class="line-span-print">{{patientMsg.gx}}</span>
              </td>
              <th>现住地：</th>
              <td colspan="3">
                <span class="line-span-print">{{patientMsg.gxrAddres}}</span>
              </td>
              <th>电话：</th>
              <td>
                <span class="line-span-print">{{patientMsg.gxrTel}}</span>
              </td>
            </tr>
            <tr class="underLineTr">
              <th>预检时间：</th>
              <td>
                <span class="emgDat_p line-span-print">{{patientMsg.emgDat}}</span>
              </td>
              <th>预检分级：</th>
              <td>
                <span class="line-span-print">{{patientMsg.chkLvlCod}}</span>
              </td>
              <th>接诊时间：</th>
              <td colspan="3">
                <span class="docDat_p line-span-print">{{patientMsg.docDat}}</span>
              </td>
              <th>首诊科室：</th>
              <td colspan="2">
                <span class="line-span-print">{{patientMsg.emgFkName}}</span>
              </td>
            </tr>
            <tr>
              <th>入院途径：</th>
              <td colspan="9">
                <label ms-repeat="msgList.arvChlCodList">
                  <input type="checkbox" ms-class-1="arvChlCod_p{{el.infocode}}" class="arvChlCod_p" ms-duplex="patientMsg.arvChlCod">
                  {{el.info}}
                </label>
                <br/>
                <span ms-if="hideMsg.arvChlCod == '5'">
                  驾驶员姓名：
                  <span class="line-span-p">{{patientMsg.abnDriver}}</span>
                  &nbsp;&nbsp;医生签名：
                  <span class="line-span-p">{{patientMsg.abnDoctor}}</span>
                </span>
                <span ms-if="hideMsg.arvChlCod == '9'" class="line-span-p">{{patientMsg.abnScoNme}}</span>
                <!-- <span class="line-span-print">{{patientMsg.arvCHlStr}}</span> -->
              </td>
            </tr>
            <tr class="underLineTr">
              <th>留抢时间：</th>
              <td>
                <span class="lqDat_p line-span-print">{{patientMsg.lqDat}}</span>
              </td>
              <th>留抢科别：</th>
              <td>
                <span id="lqkb_p" class="line-span-print"></span>
              </td>
              <th>实际留抢：</th>
              <td>
                <span class="line-span-print">
                  {{patientMsg.lqsc}}
                  <span class="unit">天</span>
                </span>
              </td>
            </tr>
            <tr class="underLineTr">
              <th>离抢时间：</th>
              <td>
                <span class="sqlDat_p line-span-print">{{patientMsg.sqlDat}}</span>
              </td>
              <th>离抢方式：</th>
              <td>
                <span id="sqlType_p" class="line-span-print"></span>
              </td>
              <th ms-visible="patientMsg.sqlType == 2">科室：</th>
              <td ms-visible="patientMsg.sqlType == 2">
                <span class="line-span-print">{{patientMsg.sqlDepName}}</span>
              </td>
              <th ms-visible="patientMsg.sqlType == 13">所转医院：</th>
              <td ms-visible="patientMsg.sqlType == 13">
                <span class="line-span-print">{{patientMsg.sqlDes}}</span>
              </td>
              <th colspan="2">接收医疗机构名称：</th>
              <td colspan="2">
                <span class="line-span-print">{{patientMsg.jsyljgNam}}</span>
              </td>
            </tr>
            <tr>
              <th>转运途径：</th>
              <td colspan="9">
                <label ms-repeat="msgList.zytjList">
                  <input type="checkbox" ms-class="zytj_p{{el.infocode}}" class="zytj_p" ms-duplex="patientMsg.zytj"
                    ms-attr-value="el.infocode"> {{el.info}}
                </label>
                <span ms-if="patientMsg.isShowTransWay" class="line-span-p">{{patientMsg.zytjOther}}</span>
              </td>
            </tr>
            <!-- <tr>
              <th>
                离抢诊断：
              </th>
            </tr> -->
            <tr>
              <td colspan="10">
                <table class="innerTab">
                  <thead>
                    <tr>
                      <td class="center">诊断类型</td>
                      <td class="center">离抢诊断</td>
                      <td class="center">疾病编码</td>
                    </tr>
                  </thead>
                  <tbody>
                    <tr ms-repeat="msgList.leaveDiagnoseList">
                      <td>{{el.jbzdStatus}}</td>
                      <td>{{el.jbzdComm}}</td>
                      <td>{{el.icd}}</td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>
            <tr>
              <th colspan="10">
                <span style="width: 100%; text-align: center; display: inline-block;">
                  手术/操作情况
                </span>
              </th>
            </tr>
            <tr>
              <td colspan="10">
                <table class="innerTab">
                  <colgroup>
                    <col style="width: 33%" />
                    <col style="width: 33%" />
                    <col style="width: 34%" />
                  </colgroup>
                  <thead>
                    <tr>
                      <td class="center">手术/操作名称</td>
                      <td class="center">手术/操作日期</td>
                      <td class="center">手术/操作医生</td>
                    </tr>
                  </thead>
                  <tbody>
                    <tr ms-repeat="msgList.operateList">
                      <td>{{el.operNam}}</td>
                      <td ms-attr-class="operDat_p{{$index}}">{{el.operDat}}</td>
                      <td>{{el.operYs}}</td>
                    </tr>
                  </tbody>
                </table>
              </td>
            </tr>
            <tr>
              <th>病种：</th>
              <td colspan="9">
                <label ms-repeat="msgList.bzList" class="ck-with-other" ms-class-1="inlineBlockPrint: el.infocode == 1 || el.infocode == 5 || el.infocode == 9">
                  <input type="checkbox" ms-class-1="bzCod_p{{el.infocode}}" class="bzCod_p" ms-duplex="patientMsg.bzCod"
                    ms-attr-value="el.infocode">
                  {{el.info}}
                  <span ms-if="el.infocode == 4 || el.infocode == 8"><br /></span>
                </label>
              </td>
            </tr>
            <tr>
              <th>操作步骤：</th>
              <td colspan="9">
                <label ms-repeat="msgList.czjsList" class="ck-with-other" ms-class-1="inlineBlockPrint: el.infocode == 1|| el.infocode == 3 || el.infocode == 5 || el.infocode == 7 || el.infocode == 9 ">
                  <input type="checkbox" ms-class-1="czjsCod_p{{el.infocode}}" class="czjsCod_p" ms-duplex="patientMsg.czjsCod"
                    ms-attr-value="el.infocode"> {{el.info}}
                  <span ms-if="patientMsg.czjsCod.indexOf(el.infocode) != -1" class="line-span-p">
                    <span ms-attr-class="operateIdPrint{{$index}}"></span>
                  </span>
                  <span ms-if="el.infocode == 2 || el.infocode == 4 || el.infocode == 6 || el.infocode == 8"><br /></span>
                </label>
              </td>
            </tr>
            <tr>
              <th>药物过敏：</th>
              <td colspan="9">
                <label ms-repeat="msgList.ywgmList">
                  <input type="checkbox" ms-class="ywgm_p{{el.infocode}}" class="ywgm_p" ms-duplex="patientMsg.ywgm"
                    ms-attr-value="el.infocode"> {{el.info}}
                  &nbsp;&nbsp;&nbsp;
                </label>
                <span ms-if="patientMsg.isShowGmFlag" class="line-span-p">{{patientMsg.ywgmOther}}</span>
              </td>
            </tr>
            <tr>
              <th>血型：</th>
              <td colspan="9">
                <label ms-repeat="msgList.bloodTypeList">
                  <input type="checkbox" ms-class="bloodType_p{{el.infocode}}" class="bloodType_p" ms-duplex="patientMsg.bloodType"
                    ms-attr-value="el.infocode"> {{el.info}}
                  &nbsp;&nbsp;&nbsp;
                </label>
              </td>
            </tr>
            <tr>
              <th>Rh：</th>
              <td colspan="9">
                <label ms-repeat="msgList.rhList">
                  <input type="checkbox" ms-class="rh_p{{el.infocode}}" class="rh_p" ms-duplex="patientMsg.rh"
                    ms-attr-value="el.infocode"> {{el.info}}
                  &nbsp;&nbsp;&nbsp;
                </label>
              </td>
            </tr>
            <tr>
              <th>主管医师：</th>
              <td class="underLineTd">
                {{patientMsg.zgysNam}}
              </td>
              <!-- <th>电子签名：</th> -->
              <td colspan="3">
                <span id="dzqmPrint"></span>
              </td>
              <th>经管医师：</th>
              <td class="underLineTd">
                {{patientMsg.jgysNam}}
              </td>
              <th>责任护士：</th>
              <td class="underLineTd">
                {{patientMsg.zrhsNam}}
              </td>
            </tr>
            <tr>
              <th colspan="2">留抢费用（元）：总费用：</th>
              <td class="underLineTd">
                {{patientMsg.lqfy}}
              </td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
  <script>
    //预览信息条--做演示用
    var LODOP; //声明为全局变量
    function print() {
      fillPrintText();
      setTableCss();
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printRecord").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
      LODOP.PREVIEW();
      //LODOP.PRINT();
    }
    function setTableCss() {
      $('#docuTitle').html('急诊留抢/留观病案首页');
      $('#printTotalDiv').css({ 'height': '100%', 'display': 'block', 'width': '200mm', 'margin': '0 auto' });
      $('.printWrap').css({ 'float': 'left', 'width': '200mm' });
      $('.printWrap table').css({ 'float': 'left', 'width': '100%', 'border-spacing': '0', 'border-collapse': 'collapse', 'font-size': '0.35cm', 'font-weight': 'normal' });
      $('.printWrap table th').css({ 'width': '18mm', 'text-align': 'right', 'padding': '2mm 0', 'font-weight': 'bold' });
      $('.printWrap table th.specialTh_p').css({ 'text-align': 'left', 'text-indent': '1mm' });
      $('.printWrap table th.specialTh_p label').css({ 'font-weight': 'normal' });
      $('.printWrap table th.specialTh_p span').css({ 'font-weight': 'normal' });
      $('.printWrap table td').css({ 'min-width': '12mm', 'max-width': '20mm', 'font-size': '0.33cm' });
      $('.printWrap table.innerTab tr').css({ 'height': '6mm', 'padding': '0' });
      $('.printWrap table .min-ck-with').css({ 'width': '60mm', 'display': 'inline-block' });
      $('.printWrap table .leftWithGap').css({ 'margin-left': '23mm', 'display': 'inline-block', 'width': '30mm' });
      $('.printWrap table .specialLeftWith').css({ 'margin-left': '23mm', 'width': '60mm', 'display': 'inline-block' });
      $('.printWrap table .ck-with').css({ 'margin-right': '4mm' });
      $('.printWrap table .ck-with-other').css({ 'margin-right': '8mm', 'min-width': '10mm'});
      $('.inlineBlockPrint').css({'display': 'inline-block', 'float': 'left'})
      $('.printWrap table.innerTab td').css({ 'border': '1px solid #000', 'padding-left': '2mm' });
      $('.printWrap table.innerTab th').css({ 'border': '1px solid #000', 'text-align': 'center' });
      $('.printWrap table.innerTab td.center').css({ 'text-align': 'center' });
      $('#dzqmPrint img').css({ 'vertical-align': 'middle', 'height': '0.46cm', 'width': 'auto' });
      $('.line-span-p').css({ 'min-width': '8mm', 'border-bottom': '1px solid #000', 'display': 'inline-block', 'min-height': '4mm', 'vertical-align': 'bottom' });
      $('.underLineTr td').css({ 'border-bottom': '1px solid #000', 'font-size': '0.35cm' });
      $('.underLineTd').css({ 'border-bottom': '1px solid #000', 'font-size': '0.35cm' });
      $('.right-span').css({ 'display': 'inline-block', 'width': '40mm', 'float': 'right' });
      // 标题
      $('.logoDivZJ').css({'display':'block','float':'left','width':'15%','margin-left':'10%'});
      $('.logoDivZJ img').css({'vertical-align':'middle','text-align':'center','width':'15mm','float':'right'});
      $('.titleDivJZ').css({'float':'left','margin':'0','width':'50%','text-align':'center','margin-top':'1mm'});
      $('.titleDivJZ .hosnameBasic').css({'padding':'1mm 0 0 0','font-size':'.42cm','line-height':'1.3','font-weight':'bolder'});
      $('.titleDivJZ .docuTitleBaisc').css({'padding':'1mm 0 1mm 0','font-size':'.5cm','line-height':'1.3','font-weight':'bolder'});
    }

    function fillPrintText() {
      if (vm.patientMsg.mpi !== '' && vm.patientMsg.mpi != null) {
        $('#qrCodeWrap').JsBarcode(vm.patientMsg.mpi, {
          format:"CODE128",
          displayValue: false,
          fontSize: 18
          // height: 35
        }); 
      }
      var _dzqmImg = $('#dzqm').html();
      $('#dzqmPrint').html(_dzqmImg);
      var _ckList = ['ylffType', 'cstSexCod', 'zytj', 'ywgm', 'bloodType', 'rh', 'arvChlCod'];
      for (var i = 0; i < _ckList.length; i++) {
        var _codVal = vm.hideMsg[_ckList[i]];
        $('.' + _ckList[i] + '_p').attr('checked', false);
        if (_codVal) {
          $('.' + _ckList[i] + '_p' + _codVal).attr('checked', true);
        }
      }
      var _doubleCkList = ['bzCod', 'czjsCod'];
      for (var i = 0; i < _doubleCkList.length; i++) {
        var _codValList = vm.patientMsg[_doubleCkList[i]];
        $('.' + _doubleCkList[i] + '_p').attr('checked', false);
        for (var j = 0; j < _codValList.length; j++) {
          $('.' + _doubleCkList[i] + '_p' + _codValList[j]).attr('checked', true);
        }
      }
      var _selList = ['cstAgeCod', 'emgJob', 'maritalStatus', 'lqkb', 'sqlType'];
      for (var i = 0; i < _selList.length; i++) {
        var _selVal = $('#' + _selList[i]).find('option:selected').text();
        var _fillVal = _selVal !== '请选择' ? _selVal : '';
        $('#' + _selList[i] + '_p').html(_fillVal)
      }
      var _strList = ['sqlDat', 'emgDat', 'docDat', 'lqDat'];
      for (var i = 0; i < _strList.length; i++) {
        var _timeStr = $('.' + _strList[i] + '_p').html();
        if (_timeStr.length > 16) {
          $('.' + _strList[i] + '_p').html(_timeStr.substr(0, _timeStr.length - 3).replace(/\//g, '-'))
        }
      }
      var _operList = vm.msgList.operateList;
      for (var i = 0; i < _operList.length; i++) {
        var currentTime = _operList[i].operDat;
        $('.operDat_p' + i).html(currentTime.replace(/\//g, '-'))
      }
      $('.bthDat_p').html(vm.patientMsg.bthDat.replace(/\//g, '-'));
    }
  </script>
</body>

</html>