<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>特殊符号</title>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <style type="text/css">
    .div {
      width: 750px;
      height: 450px;
      position: relative;
      padding-left: 28px;
    }

    .div .title {
      width: 100px;
      height: 25px;
      position: absolute;
      top: -12px;
      left: 100px;
      background-color: #ffffff;
      line-height: 25px;
      text-align: center;
    }

    .div a {
      color: blue;
    }

    .div a:hover {
      color: red;
    }
  </style>

</head>

<body ms-controller="tsfh" style="width:500px;padding-top: 10px;padding-left: 6px">
  <div class="div">
    <div class="title"></div>
    <a href="#" ms-repeat="getMsg.tsfhList" href="javascript:;" ms-click="chooseAche($index)" style="display:block;margin-right:30px;float:left;font-size:20px;text-decoration:underline;padding-top:6px;">{{el}}</a>
  </div>
  <div class="center grp_btn" style="width:765px;padding-top: 20px;">
    <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
  </div>
</body>
<script type="text/javascript">
  var vm = avalon.define({
    $id: "tsfh",
    getMsg: {
      tsfhList: ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X', 'XI', 'XII',
        '<', '>', '≥', '≤', '+', '-', '×', '÷', '√', '℃', '℉', '%', '‰', '', 'π', 'α', 'β', 'γ', 'δ', 'ε', 'ζ', 'η',
        'mm', 'mg', 'kg', 'm²', 'cm²', 'ml', 'L', '×109/L', '×1012/L', 'μmol/L', 'mmol/L', 'mg/dl', 'kPa', 'mmHg',
        'ml/min', 'L/min', 'g/L', 'cm', 'mmH2O', 'T1', 'T2', 'T3', 'T4', 'T1a', 'T1b', 'T2a', 'T2b', 'T3a', 'T3b', 'Tx',
        'N0', 'N1', 'Nx', 'M0', 'M1', 'Mx', 'IA', 'IB', 'IC', 'IIA', 'IIB', 'IIC', 'IIIA', 'IIIB', 'IIIC', 'IVA', 'IVB',
        '/F/d', 'cGy', 'SpO2', 'FiO2', 'TV', 'ml/h', 'RI', 'IU', 'mg.kg-1', '.min-1', 'I:E', 'ivdrip', 'im', 'ih', 'cmH2O',
        'H', '131I', 'mCi', 'PaO2', 'PaCO2', 'HCO3-', '～', 'T', 'P', 'R', 'BP', 'iv', 'PH', 'mm/h', 'U/L', '个/mm3', 'ug/L',
        '×10＾9/L', '×10＾12/L', 'C1', 'C2', 'C3', 'C4', 'CH5O', '→', '6/12', 'μ', 'WBC', 'HBC', 'Hb', 'Lac', 'GIU', 'CoHb',
        'CnTi', 'MYO', 'CK', 'CKMB', 'BE'
      ], //特殊符号
    },
    chooseAche: function (idx) {
      var fieldVal = vm.getMsg['tsfhList'][idx];
      var xtpghz = parent.$("#xtpghznr").val();
      if (fieldVal != '') {
        var totalVal = xtpghz + fieldVal;
        parent.$("#xtpghznr").val(totalVal);
        parent.closemodalwindow();
      }
    }
  })
</script>

</html>