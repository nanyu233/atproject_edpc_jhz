<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
</head>

<body>
  <div class="printfirst" style="display:none;">
    <div id="printnote" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicYsd.jsp"></jsp:include>
      <ul class="print-ul">
        <li class="bordered">
          <span class="basic-span">
            <label class="title-label">姓名：</label>
            <span>${hspemginfCustom.cstNam}</span>
          </span>&emsp;
          <span class="basic-span">
            <label class="title-label">性别：</label>
            <span>${hspemginfCustom.cstSexCod}</span>
          </span>&emsp;
          <span class="basic-span">
            <label class="title-label">年龄：</label>
            <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
          </span>&emsp;
          <span class="basic-span">
            <label class="title-label">科别：</label>
            <span id="_emgFkCod">急诊科门诊</span>
          </span>&emsp;
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
        </li>
        <li class="print-half-li">
          <label class="lab-span">入观时间：</label>
          <span id="_comeTimeStr">${hspDeathRecordCustom.comeTimeStr}</span>
        </li>
        <li class="print-half-li">
          <label class="lab-span">死亡时间：</label>
          <span id="_deathTime">${hspDeathRecordCustom.deathTimeStr}</span>
        </li>
        <li class="print-full-li">
          <label>入观情况：</label>
          <pre class="print-area-pre" id="_comeSituation">${hspDeathRecordCustom.comeSituation}</pre>
        </li>
        <li class="print-full-li">
          <label>入观诊断：</label>
          <pre class="print-area-pre" id="_diagnosisHos">${hspemginfCustom.jbzdDes}</pre>
        </li>
        <li class="print-full-li">
          <label>诊疗经过：</label>
          <pre class="print-area-pre" id="_treatmentProcess">${hspDeathRecordCustom.treatmentProcess}</pre>
        </li>
        <li class="print-full-li">
          <label>死亡原因：</label>
          <pre class="print-area-pre" id="_causeDeath">${hspDeathRecordCustom.causeDeath}</pre>
        </li>
        <li class="print-full-li">
          <label>死亡诊断：</label>
          <pre class="print-area-pre" id="_diagnosisDeath">${hspemginfCustom.deathDiagnosis}</pre>
        </li>
        <!-- <li class="print-full-title">
          <label>入观情况：</label>
        </li>
        <li class="print-full-li">
          <pre class="print-area-pre" id="_comeSituation">${hspDeathRecordCustom.comeSituation}</pre>
        </li>
        <li class="print-full-title">
          <label>入院诊断：</label>
        </li>
        <li class="print-full-li">
          <pre class="print-area-pre" id="_diagnosisHos">${hspemginfCustom.jbzdDes}</pre>
        </li>
        <li class="print-full-title">
          <label>诊疗经过：</label>
        </li>
        <li class="print-full-li">
          <pre class="print-area-pre" id="_treatmentProcess">${hspDeathRecordCustom.treatmentProcess}</pre>
        </li>
        <li class="print-full-title">
          <label>死亡原因：</label>
        </li>
        <li class="print-full-li">
          <pre class="print-area-pre" id="_causeDeath">${hspDeathRecordCustom.causeDeath}</pre>
        </li>
        <li class="print-full-title">
          <label>死亡诊断：</label>
        </li>
        <li class="print-full-li">
          <pre class="print-area-pre" id="_diagnosisDeath">${hspemginfCustom.deathDiagnosis}</pre>
        </li> -->
        <li class="floatRightli">
          <label>医师签名：</label>
          <span id="_doctNam">${hspDeathRecordCustom.createNam}</span>
          <span id="dzqmPrint"></span>
        </li>
        <li class="floatRightli">
          <label class="lab-span">日期：</label>
          <span id="_coursedate"></span>
        </li>
      </ul>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    function setUnderLineCod() {
      var _list = ['_emgFkCod', '_mpi', '_comeSituation', '_treatmentProcess', '_causeDeath', '_diagnosisDeath', '_doctNam'];
      _list.forEach(function (item) {
        if ($('#' + item).html() == '') {
          $('#' + item).html("_____");
        }
      })
    }

    function printall() {
      if($('#_age').html() == '岁'){
          $('#_age').html(""); 
      }
      var newTime = '${hspDeathRecordCustom.courseDateStr}';
      if (newTime == '' || newTime == null) {
        newTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      }
      $('#_coursedate').html(newTime);
      var _dzqmImg = $('#dzqm').html();
      $('#dzqmPrint').html(_dzqmImg);
      $('#id_title2').html('死亡记录');
      $('.print-ul').css({ "float": "left", "width": "96%", "font-size": "0.38cm", "margin": "0 2%", "padding": "0" });
      $('.print-ul li.print-full-li').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "2mm", "list-style": "none", "line-height": "1.5" });
      $('.print-ul li.print-full-title').css({ "float": "left", "width": "99%", "margin-left": "1%", "list-style": "none" });
      $('.print-ul li.print-half-li').css({ "float": "left", "width": "49%", "margin-left": "1%", "padding-bottom": "2mm", "list-style": "none", "line-height": "1.5" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
      // $('.print-ul li.floatRightliB').css({"float":"left","width":"27%","margin-left":"38%","padding-bottom":"2mm","list-style":"none","text-align":"left"});
      $('.print-ul li.floatRightli').css({ "float": "left", "width": "45%", "margin-left": "55%", "padding-bottom": "0.5mm", "list-style": "none", "text-align": "left" });
      // $('.print-ul li.floatRightliC').css({"float":"left","width":"35%","padding-bottom":"2mm","list-style":"none","text-align":"left"});
      // $('.print-ul label.marginleft').css({"display":"inline-block","margin-left":"3mm"});
      $('.print-ul li.bordered').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "border-bottom": "1px solid #000", "margin-bottom": "1mm", "line-height": "1.5" });
      $('.print-area-pre').css({ "color": "#000", "white-space": "pre-wrap", "word-wrap": "break-word", "font-size": ".38cm", "margin": "2mm 0 0 0" })
      $('.print-full-title label').css({'font-weight': 'bold'});
      $('#dzqmPrint img').css({ 'vertical-align': 'middle', 'height': '0.46cm', 'width': 'auto' });
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.ADD_PRINT_HTM(1050, 344, '90%', '100%', '<font style=\"font-size:12px\" format=\"0\"><span tdata=\"pageNO\">第##页</span>/<span tdata=\"pageCount\">共##页</span></font>');

      LODOP.ADD_PRINT_HTM(3, 0, "100%", "100%", document.getElementById("printnote").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
      LODOP.PREVIEW();
      //LODOP.PRINT();
    }
  </script>
</body>

</html>