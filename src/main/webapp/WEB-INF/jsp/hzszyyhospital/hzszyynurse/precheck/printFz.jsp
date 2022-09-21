<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <title>修改页面-打印护理评估表</title>
</head>

<body>
  <div style="height:100%;display: none;" id="doc1">
    <div style="width:100%; font-size:12pt;padding-top:1mm;padding-bottom:1mm;" align="" height="10%">
      <label style="padding-left:7mm;font-family:黑体">
        ${onlyPrintTriageName}
      </label>
    </div>
    <ul style="margin:0px; width:150%;padding-left:0mm;font-size:8pt;font-family:黑体;" align="left">
      <li class="liSmallHth">
        <label class="smallLeft">姓名:</label>
        <label class="line" id="p_cstNam"></label>
      </li>
      <li class="liSmallHth">
        <label class="smallLeft">病历号:</label>
        <label class="line" id="p_mpi"></label>
        <label class="smallLeft">年龄:</label>
        <label class="line" id="p_cstAge"></label>
      </li>
      <li class="liSmallHth">
        <label class="smallLeft">性别:</label>
        <label class="line" id="p_sex"></label>
        <label class="smallLeft">T:</label>
        <label class="line" id="p_tmpNbr">___</label><span id="s_tmpNbr">℃</span>
        <label class="smallLeft">P:</label>
        <label class="line" id="p_hrtRte">___</label> <span id="s_hrtRte"></span>
        <label class="bigLeft">R:</label>
        <label class="line" id="p_breNbr">___</label> <span id="s_breNbr"></span>
      </li>
      <li class="liSmallHth">
        <label class="smallLeft">SPO2:</label>
        <label class="line" id="p_oxyNbr">___</label><span id="s_oxyNbr">%</span>
        <label class="smallLeft">BP:</label>
        <label class="line" id="p_sbpNbr">____/____</label><span id="s_sbpNbr">mmHg</span>
      </li>
      <li class="liSmallHth">
        <label class="smallLeft">跌倒评估:</label>
        <label class="line" id="p_falAssCod">___</label>
        <label class="smallLeft">疼痛:</label>
        <label class="line" id="p_nrsSco">___</label>
        <label class="smallLeft">血糖:</label>
        <label class="line" id="p_xtCod">___</label>
      </li>
      
      <li class="liSmallHth">
        <label class="smallLeft">分诊科室:</label>
        <label class="line" id="p_emgFkName" style="font-weight: bold;">___</label>
        <label class="smallLeft">分诊级别:</label>
        <label class="line" id="p_modLvlCod">___</label>
      </li>
      <li class="liSmallHth">
        <label class="smallLeft">分诊时间:</label>
        <label class="line" id="p_emgDat">___</label>
      </li>
      
    </ul>
  </div>
  <script>
    var LODOP;
    function printFz() {
      $('.line').css({ 'text-decoration': 'underline' });
      $('.liSmallHth').css({ 'height': '5mm' });
      $('.liHth').css({ 'height': '8mm' });
      $('.smallLeft').css({ 'padding-left': '1mm' });
      $('.bigLeft').css({ 'padding-left': '2mm' });
      //修订分级赋值
      var emg_modLvlCod_valList = ['Ⅰ', 'Ⅱ', 'Ⅲ', 'Ⅳa', 'Ⅳb'];
      var printChkLvlCod;
      if ($('#loopModLvlCod').val() == '' || $('#loopModLvlCod').val()  == null) {
        printChkLvlCod = $('#chkLvlCod').val();
      } else {
        printChkLvlCod = $('#loopModLvlCod').val();
      }
      var emg_modLvlCod_val = emg_modLvlCod_valList[printChkLvlCod];
      $("#p_modLvlCod").html(emg_modLvlCod_val);
      var _codList = ['cstNam', 'emgDat', 'nrsSco', 'emgFkName','mpi'];
      _codList.forEach(function (item, index) {
        if (item === 'emgFkName') {
          if ($(".e_" + item).val() != null) {
            $("#p_" + item).html($(".e_" + item).val());
          }
        } else {
          if ($("#emg_" + item).val() != null) {
            $("#p_" + item).html($("#emg_" + item).val());
          }
        }
      })
      if($("#emg_falAssCod").val() === '#'){
        $("#p_falAssCod").html('非高危');
      }else if($("#emg_falAssCod").val() != ''){
        $("#p_falAssCod").html('高危');
      }
      var otherCodList = [{unit: '', cod: 'tmpNbr'}, { unit: '', cod: 'hrtRte' }, { unit: '', cod: 'breNbr' }, { unit: '', cod: 'oxyNbr' }];
      var bloodFill = '';
      // 生命体征拒测
      if ($('.exception').html()) {
        var _refusedList = vm.getMsg.refusedSurveyList, refusedMsgList = vm.hideMsg.refusedSurvey.split(','), msgRefuse = [];
        for (var i = 0; i < _refusedList.length; i++) {
          if ($.inArray(_refusedList[i].infocode, refusedMsgList) > -1) {
            msgRefuse.push(_refusedList[i].info + ' ')
          }
        }
        for (var i = 0; i < msgRefuse.length; i++) {
          if (msgRefuse[i].indexOf('血压') > -1) {
            bloodFill += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('体温') > -1) {
            otherCodList[0].unit += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('心率') > -1) {
            otherCodList[1].unit += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('呼吸') > -1) {
            otherCodList[2].unit += msgRefuse[i].substring(2);
          }
          if (msgRefuse[i].indexOf('血氧') > -1) {
            otherCodList[3].unit += msgRefuse[i].substring(2);
          }
        }
      }
      if (!bloodFill) {
        bloodFill = '____/____'
      }
      otherCodList.forEach(function (item, index) {
        if (!item.unit) {
          item.unit = '____'
        }
        if ($("#emg_" + item.cod).val() != null && $("#emg_" + item.cod).val() !== '') {
          $("#p_" + item.cod).html($("#emg_" + item.cod).val());
          $('#s_' + item.cod).css('display', 'inline-block');
        } else {
          if (item.unit == '____') {
            $("#p_" + item.cod).css({ 'text-decoration': 'none' });
          }
          $("#p_" + item.cod).html(item.unit);
          $('#s_' + item.cod).css('display', 'none');
        }
      })
      if ($("#emg_sbpUpNbr").val() === '' && $("#emg_sbpDownNbr").val() === '') {
        $('#p_sbpNbr').html(bloodFill);
        if (bloodFill == '____/____') {
          $("#p_sbpNbr").css({ 'text-decoration': 'none' });
        }
        $('#s_sbpNbr').css('display', 'none');
      } else {
        $("#p_sbpNbr").html($("#emg_sbpUpNbr").val() + " / " + $("#emg_sbpDownNbr").val());
        $('#s_sbpNbr').css('display', 'inline-block');
      }
      //性别
      var _sex = $("#emg_cstSexCod").find("option:selected").text() === '请选择' ? '' : $("#emg_cstSexCod").find("option:selected").text();
      $("#p_sex").html(_sex);
      var emg_cstAgeCodList = ['岁', '月', '天'];
      emg_cstAgeCodVal = emg_cstAgeCodList[$('#emg_cstAgeCod').val()];
      var AgeStr = '';
      if ($("#emg_cstAge").val() != '') {
        AgeStr = $("#emg_cstAge").val() + emg_cstAgeCodVal;
      }
      $("#p_cstAge").html(AgeStr);
      if ($('#emg_glsType').val() == '2' || $('#emg_glsType').val() == '3') {
        $('#p_xtCod').html($("#emg_glsType").find("option:selected").text())
      } else if($('#emg_glsNum').val() != '') {
        $('#p_xtCod').html($('#emg_glsNum').val() + 'mmol/L')
      }
      
      /* var _glsText = '';
      if($("#emg_glsCod").val() != ''){
        _glsText = '('+$("#emg_glsCod").find("option:selected").text()+')'
      }
      if ($('#emg_glsType').val() == '2' || $('#emg_glsType').val() == '3') {
        $('#p_xtCod').html($("#emg_glsType").find("option:selected").text()+_glsText)
      } else if($('#emg_glsNum').val() != ''){
        $('#p_xtCod').html($('#emg_glsNum').val() + 'mmol/L'+ _glsText)
      } else{
        $('#p_xtCod').html($("#emg_glsCod").find("option:selected").text())
      }*/

      // 判断是否是快速分诊
      var printHTML = '';
        printHTML = document.getElementById("doc1").innerHTML;
      try {
        //打印预览
        LODOP = getLodop();
        LODOP.PRINT_INITA(0, 0, "64mm", "48mm", "急诊分诊单");		// (增强型)打印初始化	PRINT_INIT(Top, Left, Width, Height, strPrintName)
        LODOP.SET_PRINT_PAGESIZE(0, "64mm", "48mm", "");	// 设定纸张大小
        LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);	// 设置打印模式	|"NOCLEAR_AFTER_PRINT"：设置打印或预览后内容不清空是否为真。
        LODOP.ADD_PRINT_HTM(5, 0, "64mm", "48mm", printHTML);	// 增强超文本打印项(普通模式)
        LODOP.SET_PRINT_STYLE("FontSize", 8);	// 设置打印项的输出风格	|"FontSize"： 设定纯文本打印项的字体大小。
        LODOP.SET_PRINTER_INDEXA("急诊分诊单");	//(增强型)指定打印设备
        LODOP.PRINT();
        // LODOP.PREVIEW();
      } catch (e) {
        publicFun.alert('打印机未准备好')
      }
    }
  </script>
</body>

</html>