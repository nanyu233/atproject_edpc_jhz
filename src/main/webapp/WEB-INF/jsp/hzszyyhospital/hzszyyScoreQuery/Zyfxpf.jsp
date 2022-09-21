<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>转运风险评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/winScore.css?aaa=5555">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _baseUrl= "${baseurl}",
        _emgSeq = '${emgSeq}',
        _xtpgSeq = '${zyfxpfSeq}';
    var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/score/zyfxpf.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="winScore">
  <form id="zyfxpfForm" action="${baseurl}scorequery/addZyfxpfScore.do" method="post">
    <div class="scoreQuery" ms-controller="zyfxpf">
      <p class="headtitle">安全转运风险评估单</p>
      <div class="basicDiv">
        <label class="bascilab">创建日期：<input class="Wdate" id="time1" name="hspZyfxpfInfCustom.crttime"
            ms-duplex-string="hideMsg.crttime" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"
            readonly unselectable='on'></label>
        <label class="bascilab">科室：<input class="basicInput longbasicInput" type="text" id="c_emgFkCod" readonly
            unselectable='on'></label>
        <label class="bascilab">床号：<input class="basicInput shortbasicInput" type="text" id="c_emgBed" readonly
            unselectable='on'></label>
        <label class="bascilab">姓名：<input class="basicInput" type="text" id="c_cstNam" readonly unselectable='on'></label>
        <label class="bascilab">性别：<input class="basicInput shortbasicInput" type="text" id="c_sex" readonly
            unselectable='on'></label>
        <label class="bascilab cstAgelab">年龄：<input class="basicInput shortbasicInput" type="text" id="c_age"
            readonly unselectable='on'></label>
        <!-- <label class="bascilab">留观号：<input class="basicInput" type="text" id="_clgh" readonly unselectable='on'></label> -->
      </div>
      <input class="hidden" type="text" name="hspZyfxpfInfCustom.emgSeq" id="zyfxpfEmg">
      <input class="hidden" type="text" name="hspZyfxpfInfCustom.zyfxpfSeq" id="zyfxpfSeq" value="${zyfxpfSeq}">
      <div class="DangerContent panelContent">
        <ul class="tableUl paneltab">
          <li>
            <span class="titleSpan titleCol">生命体征</span>
            <label ms-repeat="systemList.smtzList" ms-attr-for="smtz{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="smtz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('smtz',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.smtz" name="hspZyfxpfInfCustom.smtz">
          </li>
          <li>
            <span class="titleSpan">神志</span>
            <label ms-repeat="systemList.szList" ms-attr-for="sz{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="sz{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('sz',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.sz" name="hspZyfxpfInfCustom.sz">
          </li>
          <li>
            <span class="titleSpan titleCol">瞳孔</span>
            <label ms-repeat="systemList.tkList" ms-attr-for="tk{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="tk{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('tk',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.tk" name="hspZyfxpfInfCustom.tk">
          </li>
          <li>
            <span class="titleSpan">静脉通道</span>
            <label ms-repeat="systemList.jmtdList" ms-attr-for="jmtd{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="jmtd{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('jmtd',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.jmtd" name="hspZyfxpfInfCustom.jmtd">
          </li>
          <li>
            <span class="titleSpan titleCol">各类导管</span>
            <label ms-repeat="systemList.gldgList" ms-attr-for="gldg{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="gldg{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('gldg',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.gldg" name="hspZyfxpfInfCustom.gldg">
          </li>
          <li>
            <span class="titleSpan">呼吸支持</span>
            <label ms-repeat="systemList.hxzcList" ms-attr-for="hxzc{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="hxzc{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('hxzc',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.hxzc" name="hspZyfxpfInfCustom.hxzc">
          </li>
          <li>
            <span class="titleSpan titleCol">出血部位固定</span>
            <label ms-repeat="systemList.cxbwgdList" ms-attr-for="cxbwgd{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="cxbwgd{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('cxbwgd',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.cxbwgd" name="hspZyfxpfInfCustom.cxbwgd">
          </li>
          <li>
            <span class="titleSpan">卧位</span>
            <label ms-repeat="systemList.wwList" ms-attr-for="ww{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="ww{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('ww',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.ww" name="hspZyfxpfInfCustom.ww">
          </li>
          <li>
            <span class="titleSpan titleCol">头部脊柱肢体保护</span>
            <label ms-repeat="systemList.tbjzztbhList" ms-attr-for="tbjzztbh{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="tbjzztbh{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('tbjzztbh',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.tbjzztbh" name="hspZyfxpfInfCustom.tbjzztbh">
          </li>
          <li>
            <span class="titleSpan">移动病人方式</span>
            <label ms-repeat="systemList.ydbrfsList" ms-attr-for="ydbrfs{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="ydbrfs{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('ydbrfs',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.ydbrfs" name="hspZyfxpfInfCustom.ydbrfs">
          </li>
          <li>
            <span class="titleSpan titleCol">病人安全</span>
            <label ms-repeat="systemList.braqList" ms-attr-for="braq{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="braq{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('braq',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.braq" name="hspZyfxpfInfCustom.braq">
          </li>
          <li>
            <span class="titleSpan">呼吸机</span>
            <label ms-repeat="systemList.hxjList" ms-attr-for="hxj{{el.infocode}}" class="labtab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="hxj{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('hxj',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.hxj" name="hspZyfxpfInfCustom.hxj">
          </li>
          <li>
            <span class="titleSpan titleCol">监护仪</span>
            <label ms-repeat="systemList.jhyList" ms-attr-for="jhy{{el.infocode}}" class="labtab evenLab">
              <span class="thirdSpan">{{el.infocode}}</span>
              <span class="fourthSpan">{{el.info}}</span>
              <span class="thirdSpan">
                <input ms-attr-id="jhy{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClickCompute('jhy',$index)">
              </span>
            </label>
            <input class="hidden" type="text" ms-duplex-string="aboutZyfxpf.jhy" name="hspZyfxpfInfCustom.jhy">
          </li>
        </ul>
        <div class="scoreDiv">
          <span>
            <label class="f-left">评估携带仪器及药物：</label><br />
            <label ms-repeat="systemList.xdyqjywList" ms-attr-for="xdyqjyw{{el.infocode}}" class="checkLabels">
              <input ms-attr-id="xdyqjyw{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="checkClick('xdyqjyw',$index)">
              {{el.info}}
            </label>
            <input type="text" style="width:100%" ms-duplex-string="aboutZyfxpf.xdyqjywqt" name="hspZyfxpfInfCustom.xdyqjywqt"
              ms-visible="hideMsg.xdyqjyw.indexOf('9') != -1" /><br />
            <span class="boldFont">评估结果：<i>{{aboutZyfxpf.zyfxpfSco}} </i></span>&emsp;&emsp;
            <span class="boldFont">{{hideMsg.zyfxpfQk}}</span><br />
            <input type="hidden" name="hspZyfxpfInfCustom.zyfxpfSco" ms-duplex-string="aboutZyfxpf.zyfxpfSco">
            <input class="hidden" type="text" name="hspZyfxpfInfCustom.xdyqjyw" ms-duplex-string="hideMsg.xdyqjyw">
            <span>＜30分：提示转运风险高，在医生护士严密监护下转运，需要医生对病人再次评估并提出处理意见，应对家属告知风险，携带急救物品做好急救准备后方可转运。</span><br>
            <span>30-40分：提示转运风险较高；在转运途中可能发生病情变化或意外，应对家属告知风险，做好应急准备，预先联系电梯和相关科室，与医生一同转运。</span><br />
            <span>41-50分：提示有风险的可能性；需高度重视并做好相应预防措施医生护士共同转送。</span><br />
            <span>＞50分：提示转运风险较小，做好相应预防措施后安全转运</span>
          </span>
        </div>
      </div>
      <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/printZyfx/printZyfx.jsp"></jsp:include>
  </form>
  </div>
  <script>
    //拿到父页面基本信息值并对该页面进行赋值
    function getparentBasicVal() {
      var _parentCodList = ['emgFkCod', 'emgBed', 'cstNam', 'sex', 'age', 'lgh'];
      for (var i = 0; i < _parentCodList.length; i++) {
        $('#c_' + _parentCodList[i]).val(parent.$('#_p' + _parentCodList[i]).html())
      }
    }

    //保存
    function saveCom() {
      if (checkAb() == '') {
        jquerySubByFId('zyfxpfForm', insert_callback, null, "json");
      } else {
        publicFun.alert("转运风险评分未填完整！");
      }
    }

    function checkAb() {
      var lose = '';
      var arr = ['smtz', 'sz', 'tk', 'jmtd', 'gldg', 'hxzc', 'cxbwgd', 'ww', 'tbjzztbh', 'ydbrfs', 'braq', 'hxj', 'jhy'];
      $.each(arr, function (idx, val) {
        if (vm.aboutZyfxpf[val] == '') {
          lose = val;
          return false
        }
      })
      return lose;
    }

    //保存回调
    function insert_callback(data) {
      window.parent.$('#tabDiv').datagrid('reload');
      window.parent.message_alert(data);
      setTimeout(function () {
        window.location.reload();
      }, 800)
    }

    $(function () {
      $('#zyfxpfEmg').val(_emgSeq);
      getparentBasicVal();
      getMsgList();
    })
  </script>
</body>

</html>