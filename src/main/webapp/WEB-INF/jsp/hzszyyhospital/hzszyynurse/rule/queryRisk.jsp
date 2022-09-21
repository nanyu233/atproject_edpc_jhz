<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>高危跌倒评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="queryrisk" ms-controller="queryRisk">
  <div class="risk_container">
    <p class="box_title">门急诊患者跌倒/坠床危险因子评估表</p>
    <p class="inspect_p">评估项目</p><span class="inspect_span">结果</span>
    <div class="divCustom borderDiv">
      <label ms-repeat="msgList.falAssCodList" ms-attr-for="falAssCod{{el.infocode}}" class="lineLabel">
        <span>{{el.info}}</span> <input type="checkbox" ms-attr-id="falAssCod{{el.infocode}}" ms-duplex="msg.falAssCod"
          ms-attr-value="el.infocode">
      </label>
    </div>
    <div class="divCustom topGap">
      备注：符合者在口内打勾，勾选一个及以上项目表示为高危坠床/跌倒患者
    </div>
    <div class="grp_btn">
      <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitBtn" ms-click="filled()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  var riskMsg = {
    e_falAssCod: parent.$("#emg_falAssCod").val()
  };
  var vm = avalon.define({
    $id: "queryRisk",
    msg: {
      falAssCod: []
    },
    msgList: {
      falAssCodList: []
    },
    filled: function () {
      var _rtnList = vm.msg.falAssCod;
      if (_rtnList.length === 0) {
        _rtnList = ['#']
      }
      parent.$('#emg_falAssCod').val(_rtnList);
      parent.closemodalwindow();
    }
  });
  function avalonGetMsg() {
    var _res = parent.jsbrjz;
    $.each(_res, function (key, val) {
      if (key == 'falAssCodList') {
        $.each(val, function (idx, valu) {
          valu['checked'] = false
        })
        vm['msgList'][key] = _res[key]
      }
    });
    handleGetMsg()
  }
  function handleGetMsg() {
    var list = ['falAssCod'];
    $.each(list, function (idx, val) {
      if (riskMsg['e_' + val] != '' && riskMsg['e_' + val] != '#') {
        vm.msg[val] = riskMsg['e_' + val].split(',');
      }
    })
  }
  $(function () {
    avalonGetMsg()
    if (parent.setIframeDivHeight) {
      $('#submitBtn').hide()
    } else {
      $('#submitBtn').show()
    }
  });
</script>

</html>