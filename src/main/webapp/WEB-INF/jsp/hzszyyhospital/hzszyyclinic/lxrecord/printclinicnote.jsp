<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
  <div class="printnote" style="display:none;">
    <div id="printnoteA" class="print-body" style="display:block;float:left;width:148mm;font-family:'微软雅黑';">
      <!-- <p style="margin:0;padding:1mm 0 0 0;text-align:center;font-size:.42cm;line-height:1.5;">${hospitalPlatformNameGap}</p><p style="margin:2mm 0;padding:0;text-align:center;font-weight:700;font-size:.58cm;">急诊门诊病历</p> -->
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfoA6.jsp"></jsp:include>
    </div>
    <div id="printnoteB" class="print-body" style="display:block;float:left;width:148mm;font-family:'微软雅黑';">
      <ul class="print-ul">
        <li class="printfullli">
          <label class="lab-span">主诉：</label>
          <span id="_lqblDes">{{recordMsg.lqblDes}}</span>
        </li>
        <li class="printfullli">
          <label class="lab-span">现病史：</label>
          <pre id="_xbsDes">{{recordMsg.nowHis}}</pre>
        </li>
        <!-- <li class="leftli">
                <label class="labtitle">既往史</label>
            </li> -->
        <!-- <li class="printfullli">
                <label>过敏史：</label>
                <span id="_gmsDes"></span>
            </li> -->
        <li class="printfullli">
          <label>既往史：</label>
          <span id="_medHis">{{recordMsg.medHis}}</span>
        </li>
        <!-- <li class="printfullli">
            <label>用药史：</label>
            <span id="_drugHis"></span>
        </li>
        <li class="printfullli">
            <label>手术史：</label>
            <span id="_oprtHis"></span>
        </li>
        <li class="printfullli">
            <label>外伤史：</label>
            <span id="_tramHis"></span>
        </li>
        <li class="printfullli">
            <label>疫区、禽类、传染病接触史：</label>
            <span id="_crbHis"></span>
        </li> -->
        <li class="printfullli">
          <label>个人史：</label>
          <span id="_obstHis">{{recordMsg.obstHis}}</span>
        </li>
        <li class="printfullli">
          <label>家族史：</label>
          <span id="_famlHis">{{recordMsg.famlHis}}</span>
        </li>
        <!-- <li class="printfullli" ms-visible="baseMsg.cstSexCod == '女'">
            <label>月经史：</label>
            <label ms-repeat="recordList.mnsSitCodList">
                <input type="radio" ms-duplex-string="recordMsg.mnsSitCod" ms-class="mnsSitCod_p{{el.infocode}}" class="mnsSitCod_p" /> {{el.info}}
            </label>
            <span ms-visible="recordMsg.mnsSitCod == 1">第 {{recordMsg.caseHis}} 周</span>
        </li> -->
        <li class="printfullli">
          <label>体格检查：</label>
          <span class="Spanmarginleft xy-span-print">
            <label>血压：</label>
            <span id="_tgjcXyFlg"></span>
            <span class="xy-span"><span id="_tgjcXyUp">{{recordMsg.tgjcXyUp}}</span>/<span id="_tgjcXyDown">{{recordMsg.tgjcXyDown}}</span>mmHg</span>
          </span>
          <span class="Spanmarginleft tw-span-print">
            <label>体温：</label>
            <span id="_tgjcTwFlg"></span>
            <span class="tw-span"><span id="_tgjcTw">{{recordMsg.tgjcTw}}</span>℃</span>
          </span>
          <span class="Spanmarginleft cb-span-print">
            <label>床边指氧饱和度：</label>
            <span id="_tgjcCbzyFlg"></span>
            <span id="_tgjcCbzy" class="cb-span">{{recordMsg.tgjcCbzy}}%</span>
          </span>
          <span class="Spanmarginleft hx-span-print" >
            <label>呼吸：</label>
            <span id="_tgjcHxFlg"></span>
            <span id="_tgjcHx" class="hx-span">{{recordMsg.tgjcHx}}次/分</span>
          </span>
          <span class="Spanmarginleft xt-span-print">
            <label>血糖：</label>
            <span id="_tgjcXtType"></span>
            <span id="_tgjcXtFlg"></span>
            <span class="xt-span"><span id="_tgjcXt">{{recordMsg.tgjcXt}}</span>mmol/L</span>
          </span>
          <span class="Spanmarginleft xl-span-print">
            <label>心率：</label>
            <span id="_tgjcMbFlg"></span>
            <span id="_tgjcMb" class="xl-span">{{recordMsg.tgjcMb}}次/分</span>
          </span>
          <span class="Spanmarginleft mb-span-print">
            <label>脉搏：</label>
            <span id="_tgjcPulseFlg"></span>
            <span id="_tgjcPulse" class="mb-span">{{recordMsg.tgjcPulse}}次/分</span>
          </span>

          <pre id="_ctnrDes">{{recordMsg.ctnrDes}}</pre>
        </li>
        <li class="printfullli">
          <label>评估评分：</label>
          <span ms-visible="recordMsg.nrsSco !== '' && recordMsg.nrsSco != null">疼痛评分：{{recordMsg.nrsSco}}<span>分</span></span>
          <span ms-visible="recordMsg.fallAssCod !== '' && recordMsg.fallAssCod != null">跌倒评估：
            <span ms-visible="recordMsg.fallAssCod !== '#' && recordMsg.fallAssCod !== '' && recordMsg.fallAssCod != null">高危</span>
            <span ms-visible="recordMsg.fallAssCod === '#'">非高危</span>
          </span>
        </li>
        <li class="printfullli">
          <label>辅助检查：</label>
          <pre id="_fzjcDes">{{recordMsg.fzjcDes}}</pre>
        </li>
        <li class="printfullli">
          <label>专项评估（营养、功能、心理、跌倒）：</label>
          <label ms-repeat="recordList.specialAssessList" ms-attr-for="specialAssess{{el.infocode}}">
            <input ms-attr-id="_specialAssess{{el.infocode}}" class="_specialAssessPrint" type="checkbox" ms-duplex="recordMsg.specialAssess" ms-attr-value="el.infocode"> {{el.info}}
          </label>
          <span ms-visible="recordMsg.specialAssess.indexOf('1') != -1" >{{recordMsg.specialSuggest}}</span>
        </li>
        <li class="printfullli">
          <label>注意事项：</label>
          <pre id="_zysx">{{recordMsg.zysx}}</pre>
        </li>
        <li class="printfullli">
          <label>健康教育：</label>
          <pre id="_healthEducation">{{recordMsg.healthEducation}}</pre>
        </li>
        <li class="printfullli">
          <label>初步诊断：</label>
          <span id="_mzCbzd"></span>
        </li>
        <li class="printfullli">
          <label>治疗意见：</label>
          <!-- <div class="width: 80%; float: left">
              <div class="width:80%; float: left; border-right: 1px solid #000;box-sizing:border-box;">
                  <p ms-repeat="recordMsg.adviceList" ms-class="docMsg{{$index}}"></p>
              </div>
              <div style="width:20%; float: left;" class="checkMsg">
              </div>
          </div> -->
        </li>
        <li class="printfullli adviceLiPrint">
          <div ms-repeat="recordMsg.adviceList" ms-class="docMsg{{$index}}"></div>
        </li>
        <li class="printhalfli checkLiPrint">
          <div ms-repeat="recordMsg.adviceList" ms-class="docMsg{{$index}}"></div>
        </li>
        <li class="printhalfli checkLiPrint">
          <div class="checkMsg"></div>
        </li>
        <li class="printfullli" ms-visible="recordMsg.zlyj != ''">
          <span>{{recordMsg.zlyj}}</span>
        </li>
        <li class="floatRightliB">
          <label>医师签名：</label>
          <span id="_cratNam">{{recordMsg.cratNam}}</span>
          <span id="dzqmPrint"></span>
        </li>
        <li class="floatRightliC">
          <label>日期：</label>
          <span id="_oprtDat"></span>
        </li>
      </ul>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    //打印
    function printnote() {
      setPrint();
      $('.docuTitleBaisc').html('急诊门诊病历');
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "105mm", "148mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(2, "105mm", "148mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.SET_SHOW_MODE("LANDSCAPE_DEFROTATED",1);
      LODOP.ADD_PRINT_HTM("93mm", "70mm", "95%", "100%", "<font style='font-size:8px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      LODOP.ADD_PRINT_HTM(70, 0, "100%", "76%", document.getElementById("printnoteB").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      LODOP.PREVIEW();
      //LODOP.PRINT();
    }

    function setPrint() {
      var _dzqmImg = $('#dzqm').html();
      $('#dzqmPrint').html(_dzqmImg);
      $('.print-ul').css({ "float": "left", "width": "96%", "font-size": "0.28cm", "margin": "0 2%", "padding": "0" });
      $('.print-ul li.printfullli').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0.5mm", "list-style": "none", "line-height": "1.25" });
      $('.print-ul li.printhalfli').css({ "float": "left", "width": "49%", "margin-left": "1%", "padding-bottom": "0.5mm", "list-style": "none", "line-height": "1.25" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "1.2mm" });
      $('.print-ul li.leftli').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "text-align": "left", "margin-bottom": "1mm", "line-height": "1.25" });
      $('.print-ul li.bordered').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "text-align": "left", "border-bottom": "1px solid #000", "margin-bottom": "1mm", "line-height": "1.25" });
      $('.print-ul li.leftli label.labtitle').css({ "font-weight": "bold", "text-align": "left" });
      $('.print-ul li.floatRightliB').css({"float":"left","width":"33%","margin-left":"32%","padding-bottom":"2mm","list-style":"none","text-align":"left"});
      $('.print-ul li.floatRightli').css({ "float": "left", "width": "35%", "margin-left": "65%", "padding-bottom": "0.5mm", "list-style": "none", "text-align": "left" });
      $('.print-ul li.floatRightliC').css({"float":"left","width":"35%","padding-bottom":"2mm","list-style":"none","text-align":"left"});
      $('.print-ul label.marginleft').css({ "display": "inline-block", "margin-left": "1.2mm","vertical-align": "middle"});
      $('.print-ul span.Spanmarginleft').css({ "margin-right": "1mm" });
      $('.print-ul label.margingap').css({ "display": "inline-block", "margin-left": "1mm" });
      $('.print-ul pre').css({ "white-space": "pre-wrap", "word-wrap": "break-word", "margin-bottom": "0px", "margin-top": "0px", "display": "inline" });
      $('#dzqmPrint img').css({ 'vertical-align': 'middle', 'height': '0.32cm','width':'auto' });
      // var signPrintList = ['medHis', 'drugHis', 'oprtHis', 'tramHis', 'crbHis'];
      var signPrintList = ['tgjcXtFlg', 'tgjcXtType', 'tgjcXyFlg', 'tgjcTwFlg', 'tgjcHxFlg', 'tgjcCbzyFlg', 'tgjcPulseFlg', 'tgjcMbFlg'];
      var spcList = recordvm.recordList.specialAssessList;
      $('._specialAssessPrint').attr('checked',false)
      $.each(recordvm.recordMsg.specialAssess,function(index,key){
        $('#_specialAssess'+key).attr('checked',true)
      })
      $.each(signPrintList, function (index, key) {
        var _value = recordvm.recordMsg[key];
        if (key == 'tgjcXtType') {
          var _xtTypeCod = recordvm.recordMsg.tgjcXtType, tgjcXtTypeList = publicFun.getDict('XT_COD');
          var _tgjcXtType = '';
          if (_xtTypeCod !== '' && _xtTypeCod != null) {
            for (var i = 0; i < tgjcXtTypeList.length; i++) {
              if (tgjcXtTypeList[i].infocode == _xtTypeCod) {
                _tgjcXtType = tgjcXtTypeList[i].info
              }
            }
          }
          $('#_' + key).html(_tgjcXtType)
        } else {
          var _typeList = [];
          if (key == 'tgjcXtFlg') {
            _typeList = [{cod: '1', name: ''}, {cod: '2', name: 'LO'}, {cod: '3', name: 'HI'}, {cod: '4', name: '拒测'}];
          }
          if (key == 'tgjcXyFlg' || key == 'tgjcCbzyFlg' || key === 'tgjcPulseFlg' || key === 'tgjcMbFlg') {
            _typeList = [{cod: '1', name: ''}, {cod: '2', name: '测不出'}, {cod: '3', name: '拒测'}];
          }
          if (key == 'tgjcTwFlg') {
            _typeList = [{cod: '1', name: '耳温'}, {cod: '2', name: '不升'}, {cod: '3', name: '拒测'}];
          }
          if (key == 'tgjcHxFlg') {
            _typeList = [{cod: '1', name: ''}, {cod: '2', name: '机械通气'}, {cod: '3', name: '拒测'}];
          }
          for (var i = 0; i < _typeList.length; i++) {
            if (_typeList[i].cod == _value) {
              $('#_' + key).html(_typeList[i].name)
            }
          }
        }
      })
      var _dateTime = (recordvm.recordMsg.oprtDat).replace(/\//g,'-');
      $('#_oprtDat').html(_dateTime);
      $('#_mzCbzd').html($('#show_text1').html());
      var _printVm = recordvm.recordMsg;
      if ((publicFun.checkItemNull(_printVm.tgjcXyUp) == false || publicFun.checkItemNull(_printVm.tgjcXyDown) == false)) {
        $('.xy-span-print').css({'display': 'inline-block'})
      } else {
        $('.xy-span-print').css({'display': 'none'})
      }
      // if (publicFun.checkItemNull(_printVm.tgjcXyUp) == false || publicFun.checkItemNull(_printVm.tgjcXyDown) == false) {
      //   $('.xy-span').css({'display': 'inline-block'})
      // } else {
      //   $('.xy-span').css({'display': 'none'})
      // }
      if ((publicFun.checkItemNull(_printVm.tgjcTw) == false)) {
        $('.tw-span-print').css({'display': 'inline-block'})
      } else {
        $('.tw-span-print').css({'display': 'none'})
      }
      // if (publicFun.checkItemNull(_printVm.tgjcTw) == false) {
      //   $('.tw-span').css({'display': 'inline-block'})
      // } else {
      //   $('.tw-span').css({'display': 'none'})
      // }
      if (publicFun.checkItemNull(_printVm.tgjcCbzy) == false) {
        $('.cb-span-print').css({'display': 'inline-block'})
      } else {
        $('.cb-span-print').css({'display': 'none'})
      }
      // if (publicFun.checkItemNull(_printVm.tgjcCbzy) == false) {
      //   $('.cb-span').css({'display': 'inline-block'})
      // } else {
      //   $('.cb-span').css({'display': 'none'})
      // }
      if ((publicFun.checkItemNull(_printVm.tgjcHx) == false)) {
        $('.hx-span-print').css({'display': 'inline-block'})
      } else {
        $('.hx-span-print').css({'display': 'none'})
      }
      // if ((publicFun.checkItemNull(_printVm.tgjcHx) == false)) {
      //   $('.hx-span').css({'display': 'inline-block'})
      // } else {
      //   $('.hx-span').css({'display': 'none'})
      // }
      if (publicFun.checkItemNull(_printVm.tgjcXt) == false) {
        $('.xt-span-print').css({'display': 'inline-block'})
      } else {
        $('.xt-span-print').css({'display': 'none'})
      }
      // if (publicFun.checkItemNull(_printVm.tgjcXt) == false) {
      //   $('.xt-span').css({'display': 'inline-block'})
      // } else {
      //   $('.xt-span').css({'display': 'none'})
      // }
      if (publicFun.checkItemNull(_printVm.tgjcMb) == false) {
        $('.xl-span-print').css({'display': 'inline-block'})
      } else {
        $('.xl-span-print').css({'display': 'none'})
      }
      // if (publicFun.checkItemNull(_printVm.tgjcMb) == false) {
      //   $('.xl-span').css({'display': 'inline-block'})
      // } else {
      //   $('.xl-span').css({'display': 'none'})
      // }
      if (publicFun.checkItemNull(_printVm.tgjcPulse) == false) {
        $('.mb-span-print').css({'display': 'inline-block'})
      } else {
        $('.mb-span-print').css({'display': 'none'})
      }
      // if (publicFun.checkItemNull(_printVm.tgjcPulse) == false) {
      //   $('.mb-span').css({'display': 'inline-block'})
      // } else {
      //   $('.mb-span').css({'display': 'none'})
      // }

      if ($('.checkMsg').html() == '') {
        $('.checkLiPrint').css({'display': 'none'})
        $('.adviceLiPrint').css({'display': 'inline-block'})
      } else {
        $('.checkLiPrint').css({'display': 'inline-block'})
        $('.adviceLiPrint').css({'display': 'none'})
      }
    }
  </script>
</body>

</html>