<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>坠床跌倒评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _baseUrl;
    _baseUrl = "${baseurl}";
    var _xtpgSeq = parent.$('#falldSeq').val();
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/fallOutBedOld.js" type="text/javascript" charset="UTF-8"></script>
</head>
<body class="nursingSco">
  <div class="scoreQuery" ms-controller="falloutBed">
    <p class="headtitle">坠床跌倒评分</p>
    <form id="falloutForm" action="${baseurl}hlpgb/submitFallDScore.do" method="post">
      <input class="hidden" type="text" name="hspZcddexpfInfCustom.emgSeq" id="fallEmg">
      <input class="hidden" type="text" name="hspZcddexpfInfCustom.xtpgSeq" id="xtEmg">
      <div class="panelGde">
        <div class="FalloutbedContent panelContent">
          <ul>
            <li>
              <label for="zcddexpfYnbmdd" class="colorlab">
                <input id="zcddexpfYnbmdd" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfYnbmdd==1" ms-click="toggleHspFzjcCustom('zcddexpfYnbmdd',1,'aboutzcdd')">
                最近1年不明原因跌倒（1分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfYnbmdd" ms-duplex-string="aboutzcdd.zcddexpfYnbmdd">
            </li>
            <li>
              <label for="zcddexpfYsza" class="colorlab">
                <input id="zcddexpfYsza" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfYsza==1" ms-click="toggleHspFzjcCustom('zcddexpfYsza',1,'aboutzcdd')">
                意识障碍（1分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfYsza" ms-duplex-string="aboutzcdd.zcddexpfYsza">
            </li>
            <li>
              <label for="zcddexpfSlza" class="colorlab">
                <input id="zcddexpfSlza" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfSlza==1" ms-click="toggleHspFzjcCustom('zcddexpfSlza',1,'aboutzcdd')">
                视力障碍（单盲、双盲、弱视、白内障、青光眼、眼底病、复视）（1分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfSlza" ms-duplex-string="aboutzcdd.zcddexpfSlza">
            </li>
            <li>
              <label for="zcddexpfHdza" class="colorlab">
                <input id="zcddexpfHdza" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfHdza==3" ms-click="toggleHspFzjcCustom('zcddexpfHdza',3,'aboutzcdd')">
                活动障碍、肢体偏瘫（3分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfHdza" ms-duplex-string="aboutzcdd.zcddexpfHdza">
            </li>
            <li>
              <label for="zcddexpfNl" class="colorlab">
                <input id="zcddexpfNl" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfNl==1" ms-click="toggleHspFzjcCustom('zcddexpfNl',1,'aboutzcdd')">
                年龄（》65岁）（1分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfNl" ms-duplex-string="aboutzcdd.zcddexpfNl">
            </li>
            <li>
              <label for="zcddexpfTnxr" class="colorlab">
                <input id="zcddexpfTnxr" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfTnxr==3" ms-click="toggleHspFzjcCustom('zcddexpfTnxr',3,'aboutzcdd')">
                体能虚弱（生活能力部分自理，白天过半时间要卧床或坐椅）（3分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfTnxr" ms-duplex-string="aboutzcdd.zcddexpfTnxr">
            </li>
            <li>
              <label for="zcddexpfTyxy" class="colorlab">
                <input id="zcddexpfTyxy" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfTyxy==2" ms-click="toggleHspFzjcCustom('zcddexpfTyxy',2,'aboutzcdd')">
                头晕、眩晕、体位性低血压（2分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfTyxy" ms-duplex-string="aboutzcdd.zcddexpfTyxy">
            </li>
            <li>
              <label for="zcddexpfZyywjr" class="colorlab">
                <input id="zcddexpfZyywjr" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfZyywjr==1" ms-click="toggleHspFzjcCustom('zcddexpfZyywjr',1,'aboutzcdd')">
                服用影响意识和活动的药物（散瞳剂、镇静安眠药、降糖药、降压利尿剂、阵挛抗癫剂、麻醉止痛剂）（1分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfZyywjr" ms-duplex-string="aboutzcdd.zcddexpfZyywjr">
            </li>
            <li>
              <label for="zcddexpfJrpb" class="colorlab">
                <input id="zcddexpfJrpb" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfJrpb==1" ms-click="toggleHspFzjcCustom('zcddexpfJrpb',1,'aboutzcdd')">
                住院中无家人和其他人员陪伴（1分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfJrpb" ms-duplex-string="aboutzcdd.zcddexpfJrpb">
            </li>
            <li>
              <label for="zcddexpfMy" class="colorlab">
                <input id="zcddexpfMy" type="checkbox" ms-attr-checked="aboutzcdd.zcddexpfMy==1" ms-click="toggleHspFzjcCustom('zcddexpfMy',1,'aboutzcdd')">
                无（0分）
              </label>
              <input class="hidden" type="text" name="hspZcddexpfInfCustom.zcddexpfMy" ms-duplex-string="aboutzcdd.zcddexpfMy">
            </li>
            <li class="lastli">
              分值：<i>{{aboutzcdd.zcddexpfSco}}</i>
              <input type="hidden" name="hspZcddexpfInfCustom.zcddexpfSco" ms-duplex-string="aboutzcdd.zcddexpfSco">
              <div class="common_btnGrp">
                <a class="easyui-linkbutton addbtn" iconCls="icon-ok" id="submitbtn" onclick="saveAndImport()">保存并导入</a>
                <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
              </div>
            </li>
          </ul>
        </div>
      </div>
    </form>
  </div>
</body>
<script type="text/javascript">
  function saveAndImport() {
    if (vm.aboutzcdd.zcddexpfSco == '' || vm.aboutzcdd.zcddexpfSco == null) {
      publicFun.alert("请输入坠床跌倒评分");
      return false
    }
    jquerySubByFId('falloutForm', insert_callback, null, "json");
  }

  //保存回调
  function insert_callback(data) {
    parent.$('#falldSeq').val(data.resultInfo.message);
    // $.messager.alert('提示信息', '保存成功', 'success');
    parent.sub.aboutSco.zcddexpfSco = vm.aboutzcdd.zcddexpfSco
    parent.closemodalwindow()
  }

  $(function () {
    $('#xtEmg').val(_xtpgSeq);
    $('#fallEmg').val(parent.$('#hplgEmg').val());
    getMsgList();
  })
</script>
</html>