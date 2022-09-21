<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>
<body>
  <div class="printnote" style="display:none;">
    <div id="printnoteA" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicYsd.jsp"></jsp:include>
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
            <span id="_emgFkCod">急诊科门诊</span>
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
    </div>
    <div id="printnoteB" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <ul class="print-ul">
        <!-- <li class="printhalfli">
          <label class="lab-span">联系地址：</label>
          <span id="_cstAdr">{{recordMsg.cstAdr}}</span>
        </li>
        <li class="printhalfli">
          <label class="title-label">入观时间：</label>
          <span id="_lqblDat"></span>
        </li> -->
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
        <!-- <li class="printhalfli">
              <label>末次月经：</label>
              <span id="_mcyjDat"></span>
          </li>
          <li class="printhalfli">
              <label>妊娠状态：</label>
              <span id="_rsztCod"></span>
          </li> -->
        <!-- <li class="printfullli" id="isSHowli" style="display:none;">
              <label>月经史：</label>
              <span id="_pmnsSitCod"></span>
          </li> -->
        <li class="printfullli">
          <label>家族史：</label>
          <span id="_famlHis">{{recordMsg.famlHis}}</span>
        </li>
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
          <label>辅助检查：</label>
          <pre id="_fzjcDes">{{recordMsg.fzjcDes}}</pre>
        </li>
        <li class="printfullli">
          <label>初步诊断：</label>
          <span id="_ryzdxy">${hspemginfCustom.jbzdDes}</span>
        </li>
        <li class="printfullli">
          <label>诊疗计划：</label>
          <span id="_treatmentPlan">{{recordMsg.treatmentPlan}}</span>
        </li>
        <li class="floatRightli">
          <label>医师签名：</label>
          <span id="_cratNam">{{recordMsg.cratNam}}</span>
          <span id="dzqmPrint"></span>
        </li>
        <li class="floatRightli">
          <label>日期：</label>
          <span id="_oprtDat"></span>
        </li>
      </ul>
    </div>
    <object id="ocx" classid="clsid:66665BEC-6877-4720-B1AC-56FA0A71B700" width=0px height=0px></object>
  </div>
  <script type="text/javascript" charset="utf-8">
    //打印
    function printnote() {
      publicFun.httpServer({url: _baseUrl + 'zyylqbl/findLqbl.do', isNoLoad: true, isAsync: false}, {emgSeq: _emgSeq}, function (res) {
        setPrintValue(res)
      })
    }

    function setPrintValue(res) {
      var _dzqmImg = $('#dzqm').html();
      $('#dzqmPrint').html(_dzqmImg);

      $('.print-ul').css({ "float": "left", "width": "90%", "font-size": "0.38cm", "margin": "0 5%", "padding": "0" });
      $('.print-ul li.printfullli').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "2mm", "list-style": "none", "line-height": "1.5" });
      $('.print-ul li.printhalfli').css({ "float": "left", "width": "49%", "margin-left": "1%", "padding-bottom": "2mm", "list-style": "none", "line-height": "1.5" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
      $('.print-ul li.leftli').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "text-align": "left", "margin-bottom": "1mm", "line-height": "1.5" });
      $('.print-ul li.bordered').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "text-align": "left", "border-bottom": "1px solid #000", "margin-bottom": "1mm", "line-height": "1.5" });
      $('.print-ul li.leftli label.labtitle').css({ "font-weight": "bold", "text-align": "left" });
      $('.print-ul li.floatRightliB').css({"float":"left","width":"27%","margin-left":"38%","padding-bottom":"2mm","list-style":"none","text-align":"left"});
      $('.print-ul li.floatRightli').css({ "float": "left", "width": "45%", "margin-left": "55%", "padding-bottom": "0.5mm", "list-style": "none", "text-align": "left" });
      $('.print-ul li.floatRightliC').css({"float":"left","width":"35%","padding-bottom":"2mm","list-style":"none","text-align":"left"});
      $('.print-ul label.marginleft').css({ "display": "inline-block", "margin-left": "3mm" });
      $('.print-ul span.Spanmarginleft').css({ "margin-right": "1mm" });
      $('.print-ul label.margingap').css({ "display": "inline-block", "margin-left": "4mm" });
      $('.print-ul pre').css({ "white-space": "pre-wrap", "word-wrap": "break-word", "margin-bottom": "0px", "margin-top": "0px", "display": "inline" });
      $('#dzqmPrint img').css({ 'vertical-align': 'middle', 'height': '0.46cm','width':'auto' });

      
      $('#id_title2').html('首次病历记录');

      var isnoValList = ['gmsDes', 'medHis', 'drugHis', 'oprtHis', 'tramHis', 'crbHis'];
      var signPrintList = ['tgjcXtFlg', 'tgjcXyFlg', 'tgjcTwFlg', 'tgjcHxFlg', 'tgjcCbzyFlg', 'tgjcPulseFlg', 'tgjcMbFlg'];
      for (var key in res) {
        var _value = res[key];
        if (_value != '' && _value != null) {
          if (key === 'lqblDat' || key === 'oprtDat') {
            _value = publicFun.timeFormat(new Date(_value), 'yyyy/MM/dd hh:mm:ss');
            $('#_' + key).html(_value);
          }
        } else {
          if ($.inArray(key, isnoValList) > -1) {
            $('#_' + key).html('否');
          }
          else if (key === 'oprtDat') {
            $('#_' + key).html(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
          }
          else if (key === 'cratNam') {
            $('#_' + key).html(_name)
          }
        }
        // if (key === 'mnsSitCod') {
        //   if (_sexVal == '女' && _value != '' && _value != null) {
        //     $('.print-ul #isSHowli').css("display", "inline-block");
        //   }
        //   if (_value != '' && _value != null) {
        //     $.each(_periodList, function (idx, val) {
        //       if (val['infocode'] == _value) {
        //         if (_value == '1' && res["caseHis"] != '' && res["caseHis"] != null) {
        //           $('#_pmnsSitCod').html(val['info'] + '，第' + res["caseHis"] + '周');
        //         } else {
        //           $('#_pmnsSitCod').html(val['info']);
        //         }
        //       }
        //     })
        //   }
        // }
        if (signPrintList.indexOf(key) != -1) {
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
        if (key === 'tgjcXtType') {
          var _xtTypeCod = res.tgjcXtType, tgjcXtTypeList = publicFun.getDict('XT_COD');
          var _xtTypeName = '';
          if (_xtTypeCod !== '' && _xtTypeCod != null) {
            for (var i = 0; i < tgjcXtTypeList.length; i++) {
              if (tgjcXtTypeList[i].infocode == _xtTypeCod) {
                _xtTypeName = tgjcXtTypeList[i].info
              }
            }
          }
          $('#_' + key).html(_xtTypeName)
        }
      }

      if ($('#_age').html() == '岁') {
        $('#_age').html("");
      }

      if (($('#_tgjcMb').html() == '' && $('#_tgjcPulse').html() !== '')) {
        $('.mbSpan').show()
        $('.xlSpan').hide()
      } else if (($('#_tgjcMb').html() !== '' && $('#_tgjcPulse').html() == '')) {
        $('.mbSpan').hide()
        $('.xlSpan').show()
      }
      if ($('#_tgjcXyFlg').html() == '测不出' || $('#_tgjcXyFlg').html() == '拒测') {
        $('#xyspan').css('display', 'none')
      } else {
        $('#xyspan').css('display', 'inline-block')
      }

      var _printVm = recordvm.recordMsg;
      if ((publicFun.checkItemNull(_printVm.tgjcXyUp) == false || publicFun.checkItemNull(_printVm.tgjcXyDown) == false)) {
        $('.xy-span-print').css({'display': 'inline-block'})
      } else {
        $('.xy-span-print').css({'display': 'none'})
      }
      if ((publicFun.checkItemNull(_printVm.tgjcTw) == false)) {
        $('.tw-span-print').css({'display': 'inline-block'})
      } else {
        $('.tw-span-print').css({'display': 'none'})
      }
      if (publicFun.checkItemNull(_printVm.tgjcCbzy) == false) {
        $('.cb-span-print').css({'display': 'inline-block'})
      } else {
        $('.cb-span-print').css({'display': 'none'})
      }
      if ((publicFun.checkItemNull(_printVm.tgjcHx) == false)) {
        $('.hx-span-print').css({'display': 'inline-block'})
      } else {
        $('.hx-span-print').css({'display': 'none'})
      }
      if (publicFun.checkItemNull(_printVm.tgjcXt) == false) {
        $('.xt-span-print').css({'display': 'inline-block'})
      } else {
        $('.xt-span-print').css({'display': 'none'})
      }
      if (publicFun.checkItemNull(_printVm.tgjcMb) == false) {
        $('.xl-span-print').css({'display': 'inline-block'})
      } else {
        $('.xl-span-print').css({'display': 'none'})
      }
      if (publicFun.checkItemNull(_printVm.tgjcPulse) == false) {
        $('.mb-span-print').css({'display': 'inline-block'})
      } else {
        $('.mb-span-print').css({'display': 'none'})
      }

      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      LODOP.ADD_PRINT_HTM(104, 0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
      LODOP.PREVIEW();
      //LODOP.PRINT();
    }
  </script>
</body>

</html>