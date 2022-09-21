<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>PEWS评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="queryMsgMews" ms-controller="queryPews">
  <div class="mews_container mews">
    <div class="mark_msg clr">
      <p class="box_title">PEWS评分</p>
    </div>
    <table class="mark_rule mews">
      <colgroup>
        <col width="6%">
        <col width="6%">
        <col width="16%">
        <col width="17%">
        <col width="17%">
        <col width="38%">
      </colgroup>
      <tr class="mark_score">
        <td colspan="2"></td>
        <td>0</td>
        <td>1</td>
        <td>2</td>
        <td>3</td>
      </tr>
      <tr>
        <th colspan="2" class="titleTh">行为</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.actionCodList" ms-click="_radioClick('actionCod', $index)">{{el.info}}</td>
      </tr>
      <tr>
        <th rowspan="3" class="titleTh">心血管系统</th>
        <th class="titleTh">肤色</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.xxgSkinCodList" ms-click="_radioClick('xxgSkinCod', $index)">{{el.info}}</td>
      </tr>
      <tr>
        <th class="titleTh">CRT</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.xxgCrtCodList" ms-click="_radioClick('xxgCrtCod', $index)">{{el.info}}</td>
      </tr>
      <tr>
        <th class="titleTh">心率</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.xxgXlCodList" ms-click="_radioClick('xxgXlCod', $index)">{{el.info}}</td>
      </tr>
      <tr>
        <th rowspan="3" class="titleTh">呼吸系统</th>
        <th class="titleTh">频率</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.hxPlCodList" ms-click="_radioClick('hxPlCod', $index)">{{el.info}}</td>
      </tr>
      <tr>
        <th class="titleTh">吸凹</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.hxXhCodList" ms-click="_radioClick('hxXhCod', $index)">{{el.info}}</td>
      </tr>
      <tr>
        <th class="titleTh">FiO2</th>
        <td ms-class="active:el.checked" class="curTd" ms-repeat="getMsgList.hxFio2CodList" ms-click="_radioClick('hxFio2Cod', $index)">{{el.info}}</td>
      </tr>
    </table>
    <div style="color:#2a00ff">注：1评分从最严重的参数开始;2需每隔15分钟做雾化(包括持续雾化)或术后持续呕吐额外加2分;3使用普通 鼻导管时用氧流量评分，高流量鼻导管用吸入氧浓度评分;4分值范围0-9分，分值越高越重。</div>
    <div class="score_div" style="float:left"><span>分值：</span><i>{{patientMsg.pewsSco}}</i></div>
    <div class="grp_btn">
      <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" ms-click="fillPews()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  var aboutPews = {
    actionCod: parent.$("#actionCod").val(),
    xxgSkinCod: parent.$("#xxgSkinCod").val(),
    xxgCrtCod: parent.$("#xxgCrtCod").val(),
    xxgXlCod: parent.$("#xxgXlCod").val(),
    hxPlCod: parent.$("#hxPlCod").val(),
    hxXhCod: parent.$("#hxXhCod").val(),
    hxFio2Cod: parent.$("#hxFio2Cod").val(),
    pewsSco: parent.$("#pewsSco").val()
  };
  var vm = avalon.define({
    $id: "queryPews",
    patientMsg: {
      actionCod: '' || aboutPews.actionCod, // 行为
      xxgSkinCod: '' || aboutPews.xxgSkinCod, // 肤色
      xxgCrtCod: '' || aboutPews.xxgCrtCod, // CRT
      xxgXlCod: '' || aboutPews.xxgXlCod, // 心率
      hxPlCod: '' || aboutPews.hxPlCod, // 频率
      hxXhCod: '' || aboutPews.hxXhCod, // 吸凹
      hxFio2Cod: '' || aboutPews.hxFio2Cod,
      pewsSco: '' || aboutPews.pewsSco
    },
    getMsgList: {
      actionCodList: [{ info: '活泼/适境', infocode: '0', checked: false }, { info: '思睡或哭吵易安慰', infocode: '1', checked: false }, { info: '烦躁或哭闹难以安慰', infocode: '2', checked: false }, { info: '嗜睡/意识模糊或对疼痛反应 降低', infocode: '3', checked: false }],
      xxgSkinCodList: [{ info: '肤色红', infocode: '0', checked: false }, { info: '苍白 / 灰暗', infocode: '1', checked: false }, { info: '苍灰 / 发紫', infocode: '2', checked: false }, { info: '苍灰 / 发紫、花斑', infocode: '3', checked: false }],
      xxgCrtCodList: [{ info: '1 - 2秒', infocode: '0', checked: false }, { info: '3秒', infocode: '1', checked: false }, { info: '4秒', infocode: '2', checked: false }, { info: '> 5秒', infocode: '3', checked: false }],
      xxgXlCodList: [{ info: '正常', infocode: '0', checked: false }, { info: '正常', infocode: '1', checked: false }, { info: '增快 > 20次 / 分', infocode: '2', checked: false }, { info: '增快 > 30次 / 分或心动过缓', infocode: '3', checked: false }],
      hxPlCodList: [{ info: '正常', infocode: '0', checked: false }, { info: '增快 > 10次 / 分', infocode: '1', checked: false }, { info: '增快 > 20次 / 分', infocode: '2', checked: false }, { info: '减慢 > 5次 / 分', infocode: '3', checked: false }],
      hxXhCodList: [{ info: '无', infocode: '0', checked: false }, { info: '动用辅助呼吸肌', infocode: '1', checked: false }, { info: '有吸凹', infocode: '2', checked: false }, { info: ' 伴有吸凹、呻吟', infocode: '3', checked: false }],
      hxFio2CodList: [{ info: '无', infocode: '0', checked: false }, { info: '氧疗≥30 % 或3L / min', infocode: '1', checked: false }, { info: '氧疗≥40 % 或6L / min', infocode: '2', checked: false }, { info: '氧疗≥50 % 或8L / min', infocode: '3', checked: false }]
    },
    _radioClick: function (obj, index) {
      vm.patientMsg[obj] = publicFun.radioClicks(vm.getMsgList[obj + 'List'], vm.patientMsg[obj], index)
    },
    fillPews: function () {
      parent.$("#actionCod").val(vm.patientMsg.actionCod);
      parent.$("#xxgSkinCod").val(vm.patientMsg.xxgSkinCod);
      parent.$("#xxgCrtCod").val(vm.patientMsg.xxgCrtCod);
      parent.$("#xxgXlCod").val(vm.patientMsg.xxgXlCod);
      parent.$("#hxPlCod").val(vm.patientMsg.hxPlCod);
      parent.$("#hxXhCod").val(vm.patientMsg.hxXhCod);
      parent.$("#hxFio2Cod").val(vm.patientMsg.hxFio2Cod);
      parent.$("#pewsSco").val(vm.patientMsg.pewsSco);
      parent.closemodalwindow();
    }
  });
   vm.patientMsg.$watch('$all', function (name, newVal, oldVal) {
    var countAboutPews = {
      actionCod: vm.patientMsg.actionCod,
      xxgSkinCod: vm.patientMsg.xxgSkinCod,
      xxgCrtCod: vm.patientMsg.xxgCrtCod,
      xxgXlCod: vm.patientMsg.xxgXlCod,
      hxPlCod: vm.patientMsg.hxPlCod,
      hxXhCod: vm.patientMsg.hxXhCod,
      hxFio2Cod: vm.patientMsg.hxFio2Cod
    };
    if (isNull(countAboutPews) === false) {
      vm.patientMsg.pewsSco = parseInt(countAboutPews['actionCod']) + parseInt(countAboutPews['xxgSkinCod']) + parseInt(countAboutPews['xxgCrtCod']) + parseInt(countAboutPews['xxgXlCod']) + parseInt(countAboutPews['hxPlCod']) + parseInt(countAboutPews['hxXhCod']) + parseInt(countAboutPews['hxFio2Cod']);
    } else {
      vm.patientMsg.pewsSco = '';
    }
  });
  /**
   * @遍历对象，判断是否为空
   * @return IF '' return true
   * @return ELSE return false
  */
  function isNull(obj) {
    var isNull = false;
    $.each(obj, function (idx, val) {
      if (val === '' || val === null) {
        isNull = true
      }
    });
    return isNull
  }
  $(function(){
    var repeatList = ['actionCod', 'xxgSkinCod', 'xxgCrtCod', 'xxgXlCod', 'hxPlCod', 'hxXhCod', 'hxFio2Cod'];
    for (var i = 0 ; i < repeatList.length; i++) {
      for ( var j = 0; j < vm.getMsgList[repeatList[i] + 'List'].length; j++) {
        if (vm.getMsgList[repeatList[i] + 'List'][j]['infocode'] === aboutPews[repeatList[i]]) {
          vm.getMsgList[repeatList[i] + 'List'][j]['checked'] = true;
        }
      }
    }
  })
</script>

</html>