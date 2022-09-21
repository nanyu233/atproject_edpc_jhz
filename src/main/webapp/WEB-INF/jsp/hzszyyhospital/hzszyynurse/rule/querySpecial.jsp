<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>特殊病人评估</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="queryrisk" ms-controller="queryRisk">
  <div class="risk_container">
    <p class="box_title">特殊病人评估</p>
    <div class="divCustom">
      <label ms-repeat="msgList.specialOtherList" ms-attr-for="specialOther{{el.infocode}}" class="halfLineLabel">
        <input type="checkbox" ms-attr-id="specialOther{{el.infocode}}" ms-duplex="msg.specialOther"
          ms-attr-value="el.infocode"> <span>{{el.info}}</span>
      </label>
    </div>
    <div class="grp_btn">
      <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitBtn" ms-click="filled()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  var riskMsg = {
    e_specialOther: parent.$("#emg_specialOther").val()
  };
  var vm = avalon.define({
    $id: "queryRisk",
    msg: {
      specialOther: []
    },
    msgList: {
      specialOtherList: []
    },
    filled: function () {
      var _rtnList = vm.msg.specialOther, _valString = '';
      if (_rtnList.length === 0) {
        _rtnList = ['#']
      } else {
        var _list = vm.msgList.specialOtherList;
        for (var i = 0; i < _list.length; i++) {
          if ($.inArray(_list[i].infocode, _rtnList) > -1) {
            _valString += _list[i].info + ',';
          }
        }
        if (_valString) {
          _valString = _valString.substr(0, _valString.length - 1)
        }
      }
      parent.$('#emg_specialOther').val(_rtnList);
      parent.$('#specialContent').html(_valString)
      parent.closemodalwindow();
    }
  });
  function avalonGetMsg() {
    var _res = parent.jsbrjz;
    $.each(_res, function (key, val) {
      if (key == 'specialOtherList') {
        $.each(val, function (idx, valu) {
          valu['checked'] = false
        })
        vm.msgList[key] = _res[key]
      }
    });
    handleGetMsg()
  }
  function handleGetMsg() {
    if (riskMsg.e_specialOther != '' && riskMsg.e_specialOther != '#') {
      vm.msg.specialOther = riskMsg.e_specialOther.split(',');
    } else {
      // 对已经选否不做判断
      if (riskMsg.e_specialOther == '#') {
        return;
      }
      var ageStr = parent.$('#emg_cstAge').val(), ageUnit = parent.$('#emg_cstAgeCod').val();
      var _codList = vm.msgList.specialOtherList.$model, childCod = '', babyCod = '', youngCod = '', oldCod = '';
      _codList.forEach(function (_val, _idx) {
        if (_val.info === '婴儿') {
          babyCod = _val.infocode
        }
        if (_val.info === '儿童') {
          childCod = _val.infocode
        }
        if (_val.info === '青少年') {
          youngCod = _val.infocode
        }
        if (_val.info === '年老体弱患者') {
          oldCod = _val.infocode
        }
      })
      if (ageStr !== '' && ageStr != null) {
        ageStr = ageStr - 0;
        if ((ageStr < 1 && ageUnit === '0') || (ageStr < 12 && ageUnit === '1') || (ageStr < 365 && ageUnit === '2')) {
          vm.msg.specialOther = [babyCod, childCod];
        }
        if ((ageStr >= 60 && ageUnit === '0')) {
          vm.msg.specialOther = [oldCod]
        }
        if (( ageStr >= 1 && ageStr < 14 && ageUnit === '0') || ( ageStr >= 12 && ageStr < 168 && ageUnit === '1') || ( ageStr >= 365 && ageStr < 5110 && ageUnit === '2')) {
          vm.msg.specialOther = [childCod]
        }
        if ((ageStr >= 13 && ageStr < 14 && ageUnit === '0')) {
          vm.msg.specialOther = [childCod, youngCod]
        }
        if ((ageStr >= 14 && ageStr < 18 && ageUnit === '0')) {
          vm.msg.specialOther = [youngCod]
        }
      }
    }
  }
  $(function () {
    avalonGetMsg()
  });
</script>

</html>