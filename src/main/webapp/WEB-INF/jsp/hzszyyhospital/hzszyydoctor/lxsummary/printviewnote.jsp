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
            <span>{{msg.cstNam}}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">性别：</label>
            <span>{{msg.cstSexCod}}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">年龄：</label>
            <span id="_age">{{msg.cstAge}}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">科别：</label>
            <span id="_emgFkCod">急诊科门诊</span>
          </span>
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">{{msg.mpi}}</span>
          </span>
        </li>
      </ul>
    </div>
    <div id="printnoteB" class="print-body" style="display:block;float:left;width:210mm;font-family:'微软雅黑';">
      <ul class="print-ul">
        <li class="print-half-li">
          <label class="lab-span">入观时间：</label>
          <span id="_ryrq">{{msg.ryrqDat}}</span>
        </li>
        <li class="print-full-li">
          <label>入观时病情：</label>
          <pre id="_ryqk">{{msg.ryqkDes}}</pre>
        </li>
        <li class="print-full-li">
          <label>目前重要的病情发展：</label>
          <pre id="_zljg">{{msg.zljgDes}}</pre>
        </li>
        <li class="print-full-li">
          <label class="lab-span">当前诊断：</label>
          <span id="_cyzdxy">{{msg.cyzdXy}}</span>
        </li>
        <li class="print-full-li">
          <label>已进行的操作、用药及其他治疗：</label>
          <pre id="_cyyz">{{msg.cyyzDes}}</pre>
        </li>
        <li class="print-full-li">
          <label>患者目前情况：</label>
          <pre id="_cyqk">{{msg.cyqkDes}}</pre>
        </li>
        <li class="print-full-li">
          <label>患者去向：</label>
          <span id="_hzWay">
             <span id="sqlType_p" class="line-span-print"></span>
              <span ms-visible="msg.sqlType == 2">
                &nbsp;&nbsp;&nbsp;科室：
                <span id="_sqlDepName">{{msg.sqlDepName}}</span>
              </span>
              <span ms-visible="msg.sqlType == 13">
                &nbsp;&nbsp;&nbsp;所转医院：
                <span id="_sqlDes">{{msg.sqlDes}}</span>
              </span>
          </span>
        </li>
        <li class="float-right-li">
          <label>医师签名：</label>
          <span id="_doctNam">{{msg.cratNam}}</span>
          <span id="dzqmPrint"></span>
        </li>
        <li class="float-right-li">
          <label>日期：</label>
          <span id="oprtDatspn">{{msg.oprtDat}}</span>
        </li>
      </ul>
    </div>
  </div>
  <script type="text/javascript" charset="utf-8">
    function setUnderLineCod() {
      var _list = ['_emgFkCod', '_mpi', '_cstAdr', '_ryrq', '_cyzdxy', '_ryqk', '_zljg', '_cyqk', '_cyyz', '_sqlDepName', '_sqlDes', '_hzWay'];
      _list.forEach(function (item) {
        if ($('#' + item).html() == '') {
          $('#' + item).html("_____");
        }
      })
    }

    //打印
    function printnote() {
      $('#id_title2').html('抢救室小结');
      if ($('#_age').html() == '岁') {
        $('#_age').html("");
      }
      var _selList = ['sqlType'];
      for (var i = 0; i < _selList.length; i++) {
        var _selVal = $('#' + _selList[i]).find('option:selected').text();
        var _fillVal = _selVal !== '请选择' ? _selVal : '';
        $('#' + _selList[i] + '_p').html(_fillVal)
      }
      // setUnderLineCod();
      var _dzqmImg = $('#dzqm').html();
      $('#dzqmPrint').html(_dzqmImg);
      $('.print-ul').css({ "float": "left", "width": "98%", "font-size": "0.38cm", "margin": "0 1%", "padding": "0" });
      $('.print-ul li.print-full-li').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "2mm", "list-style": "none", "line-height": "1.5" });
      $('.print-ul li.print-half-li').css({ "float": "left", "width": "49%", "margin-left": "1%", "padding-bottom": "2mm", "list-style": "none", "line-height": "1.5" });
      $('.print-ul span.basic-span').css({ "display": "inline-block", "margin-right": "3mm" });
      // $('.print-ul li.floatRightliB').css({ "float": "left", "width": "27%", "margin-left": "38%", "padding-bottom": "2mm", "list-style": "none", "text-align": "left" });
      $('.print-ul li.float-right-li').css({ "float": "left", "width": "45%", "margin-left": "55%", "padding-bottom": "0.5mm", "list-style": "none", "text-align": "left" });
      // $('.print-ul li.floatRightliC').css({ "float": "left", "width": "35%", "padding-bottom": "2mm", "list-style": "none", "text-align": "left" });
      // $('.print-ul label.marginleft').css({ "display": "inline-block", "margin-left": "3mm" });
      // $('.print-ul label.margingap').css({ "display": "inline-block", "margin-left": "4mm" });
      $('.print-ul li.bordered').css({ "float": "left", "width": "99%", "margin-left": "1%", "padding-bottom": "0mm", "list-style": "none", "text-align": "left", "border-bottom": "1px solid #000", "margin-bottom": "1mm", "line-height": "1.5" });
      $('.print-ul pre').css({ "white-space": "pre-wrap", "word-wrap": "break-word", "margin-bottom": "0px", "margin-top": "0px", "display": "inline" });
      $('#dzqmPrint img').css({ 'vertical-align': 'middle', 'height': '0.46cm', 'width': 'auto' });
      LODOP = getLodop();
      LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
      LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
      LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
      LODOP.ADD_PRINT_HTM(1050, 344, "90%", "100%", "<font style='font-size:12px' format='0'><span tdata='pageNO'>第##页</span>/<span tdata='pageCount'>共##页</span></font>");
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      LODOP.ADD_PRINT_HTM('28mm', 0, "100%", "80%", document.getElementById("printnoteB").innerHTML);
      LODOP.NewPageA();
      LODOP.SET_PRINT_STYLE("FontSize", 10);
      LODOP.ADD_PRINT_HTM('2mm', 0, "100%", "100%", document.getElementById("printnoteA").innerHTML);
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      //LODOP.SET_PRINTER_INDEX("ZDesigner GK888t");
      LODOP.PREVIEW();
      //LODOP.PRINT();
    }
  </script>
</body>

</html>