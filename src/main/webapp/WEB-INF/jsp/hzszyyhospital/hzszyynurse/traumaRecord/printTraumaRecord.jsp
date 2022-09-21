<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>急诊创伤记录表---打印</title>
</head>

<body>
  <div id="printRecord" class="hidden">
    <div id="printTotalDiv">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
      <div class="printWrap">
        <ul class="print-basic">
          <li>
            <label class="title-labelA">姓名：</label>
            <span class="print-span-noUnder">{{basicInfo.cstNam}}</span>
            <label class="title-labelA">性别：</label>
            <span class="print-span-noUnder">{{basicInfo.cstSexCod}}</span>
            <label class="title-labelA">年龄：</label>
            <span class="print-span-noUnder">{{basicInfo.cstAgeTotal}}</span>
            <label class="title-labelA">床号：</label>
            <span id="bedNum" class="print-span-noUnder"></span>
            <label class="title-labelA">病历号：</label>
            <span class="print-span-noUnder">{{basicInfo.mpi}}</span>
          </li>
          <li>
            <label class="title-labelA">就诊时间：</label>
            <span class="print-span-noUnder">{{basicInfo.emgDat}}</span>
            <label class="left-mar">首诊科室：</label>
            <span class="print-span-noUnder">{{basicInfo.emgFkName}}</span>
            <label class="left-mar">首诊医生：</label>
            <span class="print-span-noUnder">{{basicInfo.sqlDctNbr}}</span>
            <label class="left-mar">单位/地址：</label>
            <span class="print-span-noUnder">{{basicInfo.cstAdr}}</span>
          </li>
          <li>生命体征：</li>
          <li>
            <label>创伤部位 T <span class="print-span">{{basicInfo.csbwT}}</span> ℃</label>
            <label class="left-mar">P <span class="print-span">{{basicInfo.csbwP}}</span> 次/分</label>
            <label class="left-mar">R <span class="print-span">{{basicInfo.csbwR}}</span> 次/分</label>
            <label class="left-mar">BP <span class="print-span">{{basicInfo.sbpUpNbr}}</span> / <span class="print-span">{{basicInfo.sbpDownNbr}}</span>
              mmHg</label>
            <label class="left-mar">诊断 <span class="print-span" id="jbzdDes_p"></span> </label>
          </li>
        </ul>
        <div class="print-image">
          <div class="left-wrap">
            <img src="${baseurl}images/hzszyyhems/nurse/body-img.png" />
          </div>
          <div class="right-part">
            <p>急救传呼情况</p>
            <table class="innerTab">
              <thead>
                <tr>
                  <th>值班医生</th>
                  <th>呼叫时间</th>
                  <th>到达时间</th>
                  <th>呼叫者姓名</th>
                </tr>
              </thead>
              <tbody>
                <tr ms-repeat-item="basicInfo.phoneCallList">
                  <td>{{item.ksNam}}</td>
                  <td>{{item.hjDat}}</td>
                  <td>{{item.ddDat}}</td>
                  <td>{{item.callerNam}}</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
        <div style="width: 100%; float: left;">
          <div style="margin-bottom: 1mm;">
            <label>过敏史</label>
            <label ms-repeat="msgList.algHonList">
              <input type="radio" ms-duplex-string="basicInfo.algHon" ms-class="algHon_p{{el.infocode}}" class="algHon_p" />
              {{el.info}}
            </label>
            <label ms-repeat="msgList.algTypCodList">
              <input type="checkbox" ms-class="algTypCod_p{{el.infocode}}" class="algTypCod_p" />
              {{el.info}}
            </label>
            <span class="print-span">{{basicInfo.algTypDes}}</span>
          </div>
          <table class="innerTab">
            <thead>
              <tr>
                <th>药物名称</th>
                <th>注射时间</th>
                <th>结果时间</th>
                <th>皮试结果</th>
                <th>签名</th>
              </tr>
            </thead>
            <tbody>
              <tr ms-repeat-item="basicInfo.skinTestList">
                <td>{{item.ywNam}}</td>
                <td>{{item.zsDat}}</td>
                <td>{{item.jgDat}}</td>
                <td>{{item.jg}}</td>
                <td>{{item.sigNam}}</td>
              </tr>
            </tbody>
          </table>
        </div>
        <ul class="last-print-ul">
          <li class="full-li">创伤有关情况</li>
          <li>
            <label>创伤者身份</label>
            <label class="check-label" ms-repeat="msgList.cszsfCodList">
              <input type="checkbox" ms-class="cszsfCod_p{{el.infocode}}" class="cszsfCod_p"> {{el.info}}
            </label>
            <span class="print-span">{{basicInfo.cszsfOther}}</span>
          </li>
          <li>
            <label>创伤原因</label>
            <label class="check-label" ms-repeat="msgList.csyyCodList">
              <input type="checkbox" ms-class="csyyCod_p{{el.infocode}}" class="csyyCod_p"> {{el.info}}
            </label>
            <span class="print-span">{{basicInfo.csyyOther}}</span>
          </li>
          <li>
            <label>发生地点</label>
            <label class="check-label" ms-repeat="msgList.fsddCodList">
              <input type="checkbox" ms-class="fsddCod_p{{el.infocode}}" class="fsddCod_p"> {{el.info}}
            </label>
            <span class="print-span">{{basicInfo.fsddOther}}</span>
          </li>
          <li>
            <label>护送方式</label>
            <label class="check-label" ms-repeat="msgList.hsfsCodList">
              <input type="checkbox" ms-class="hsfsCod_p{{el.infocode}}" class="hsfsCod_p"> {{el.info}}
            </label>
          </li>
          <li>
            <label>护送人</label>
            <label class="check-label" ms-repeat="msgList.hsrCodList">
              <input type="checkbox" ms-class="hsrCod_p{{el.infocode}}" class="hsrCod_p"> {{el.info}}
            </label>
          </li>
          <li>
            <label>紧急联系</label>
            <label>联系人姓名</label> 
            <span class="print-span">{{basicInfo.lxrNam}}</span>
            <label class="left-mar">电话</label>
            <span class="print-span">{{basicInfo.lxrTel}}</span>
            <label class="left-mar">
              欠款
              <label ms-repeat="msgList.qkCodList">
                <input type="checkbox" ms-class="qkCod_p{{el.infocode}}" class="qkCod_p"> {{el.info}}
              </label>
            </label>
          </li>
          <li class="only-right">
            <span>记录者签名</span>
            {{basicInfo.recorderNam}}
          </li>
        </ul>
      </div>
    </div>
  </div>
  <script>
    //预览信息条--做演示用
    var LODOP; //声明为全局变量
    function print() {
      setTableCss();
      fillPrintText();
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
      $('.docuTitleBaisc').html('急诊创伤记录表');
      $('#printTotalDiv').css({ 'height': '100%', 'display': 'block', 'width': '200mm', 'margin': '0 auto', 'font-size': '0.38cm'});
      $('.printWrap').css({ 'float': 'left', 'width': '200mm', 'font-size': '0.38cm' });
      $('.print-basic').css({ 'float': 'left', 'width': '200mm', 'padding': '0', 'margin': '0' });
      $('.print-basic li').css({ 'float': 'left', 'width': '100%', 'list-style': 'none', 'padding': '1mm 0', 'margin': '0 0 0 1mm' })
      $('.last-print-ul').css({ 'float': 'left', 'width': '200mm', 'padding': '0', 'margin': '0' });
      $('.last-print-ul li').css({ 'float': 'left', 'width': '200mm', 'padding': '1mm 0', 'margin': '0 0 0 1mm' });
      $('.last-print-ul li.only-right').css({ 'float': 'right', 'width': '50mm', 'padding': '0', 'margin': '0' });
      $('.printWrap table').css({ 'float': 'left', 'width': '100%', 'border-spacing': '0', 'border-collapse': 'collapse', 'font-size': '0.33cm', 'font-weight': 'normal' });
      $('.print-image').css({ 'width': '200mm', 'float': 'left' })
      $('.left-wrap').css({ 'width': '58%', 'float': 'left' })
      $('.left-wrap img').css({ 'width': '100%', 'float': 'left' })
      $('.right-part').css({ 'width': '42%', 'float': 'left' })
      $('.printWrap table.innerTab tr').css({ 'height': '6mm', 'padding': '0' });
      $('.printWrap table.innerTab td').css({ 'border': '1px solid #000', 'padding-left': '2mm', 'font-size': '0.35cm' });
      $('.printWrap table.innerTab th').css({ 'border': '1px solid #000', 'text-align': 'center', 'font-size': '0.35cm' });
      $('.print-span').css({'min-width': '8mm', 'border-bottom': '1px solid #000', 'display': 'inline-block', 'vertical-align': 'bottom'});
      $('.print-span-noUnder').css({'min-width': '8mm', 'display': 'inline-block', 'vertical-align': 'bottom'});
      $('.print-basic li .title-labelA').css({ "display": "inline-block", "width": "5.5em", "text-align": "right" });
      $('.left-mar').css({'margin-left': '2mm'});
    }

    function fillPrintText() {
      $('#bedNum').html(parent.parent.$('#bedNum').html());
      $('#jbzdDes_p').html($('#show_text').html());
      var _ckList = ['algTypCod', 'cszsfCod', 'csyyCod', 'fsddCod', 'hsfsCod', 'hsrCod', 'qkCod'];
      for (var i = 0; i < _ckList.length; i++) {
        var _codVal = vm.hideMsg[_ckList[i]];
        $('.' + _ckList[i] + '_p').attr('checked', false);
        if (_ckList[i] === 'algTypCod') {
          var _arrValList = vm.basicInfo.algTypCod;
          for (var j = 0; j < _arrValList.length; j++) {
            $('.' + _ckList[i] + '_p' + _arrValList[j]).attr('checked', true);
          }
        } else {
          if (_codVal) {
            $('.' + _ckList[i] + '_p' + _codVal).attr('checked', true);
          }
        }
      }
      $('.algHon_p').attr('checked', false);
      if (vm.basicInfo.algHon !== '' && vm.basicInfo.algHon != null) {
        $('.algHon_p' + vm.basicInfo.algHon).attr('checked', true);
      }
    }
  </script>
</body>

</html>