<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>镇静评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/nrs/nrs.css?v=${versionDay}">
  <script>
    var _zjpfSeq = '${zjpfSeq}',
        _baseUrl = "${baseurl}"
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="scoreQuery thinTab" ms-controller="queryJbs">
  <p class="headtitle">镇静评分</p>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyyScoreQuery/basicTopInfo.jsp"></jsp:include>
  <form id="ZjpfForm" action="${baseurl}scorequery/addZjpfScore.do" method="post">
    <input class="hidden" type="text" ms-duplex-string="sysMsg.createDate" name="hspZjpfInfCustom.cratDat"/>
    <input class="hidden" type="text" value="${emgSeq}" name="hspZjpfInfCustom.emgSeq">
    <input class="hidden" type="text" value="${zjpfSeq}" name="hspZjpfInfCustom.zjpfSeq">
    <div class="panelBlock zjDiv">
      <label class="lab-title" ms-repeat="getMsgList.jbsList">
        <input ms-attr-id="jbs{{el.infocode}}" type="checkbox" ms-attr-value="el.infocode" ms-duplex="getMsg.zjpfnrx"
        ms-change="arrToStr('zjpfnrx')" /> {{el.info}}
      </label>
      <input class="hidden" type="text" ms-duplex-string="getHideMsg.zjpfnrx" name="hspZjpfInfCustom.zjpfnrx">
    </div>
    <input type="text" class="hidden" name="hspZjpfInfCustom.zjpfZf" ms-duplex-string="getMsg.zjpfZf">
  </form>
  <div class="scoreDiv">
    <span class="boldFont">总分：<i>{{getMsg.zjpfZf}}</i></span>
  </div>
  <script type="text/javascript">
    var _nowTime = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm');
    var vm = avalon.define({
      $id: "queryJbs",
      getMsgList: {
        jbsList: [{ info: '攻击行为：明显的好战行为、暴力行为，对工作人员构成直接的危险（4）', infocode: '4'}, 
                  { info: '非常躁动不安：抓或拔除流管或各种插管；具有攻击性（3）', infocode: '3'}, 
                  { info: '躁动不安：频繁的无目的动作，与呼吸机抵抗（2）', infocode: '2' },
                  { info: '烦躁不安：焦虑不安，但动作不是猛烈的攻击（1）', infocode: '1'}, 
                  { info: '清醒状态并且平静（0）', infocode: '0'},
                  { info: '昏昏欲睡：不能完全清醒，但声音刺激能够叫醒并维持觉醒状态（睁眼/眼睛接触≥10sec）（-1）', infocode: '-1'},
                  { info: '轻度镇静状态：声音能叫醒并有短暂的眼睛接触（<10sec）（-2）', infocode: '-2'},
                  { info: '中度镇静状态：声音刺激后有动静或睁眼反应（但无眼睛接触）（-3）', infocode: '-3'},
                  { info: '深度镇静状态：对声音刺激无反应，但身体刺激后有动静或睁眼反应（-4）', infocode: '-4'},
                  { info: '不可叫醒状态：对声音或身体刺激均无反应（-5）', infocode: '-5'},]
      },
      getMsg:{
        zjpfnrx:[],
        zjpfZf:''
      },
      getHideMsg:{
        zjpfnrx:''
      },
      sysMsg:{
        createDate:_nowTime
      },
      arrToStr: function (objName) {
        if (vm.getMsg[objName].$model.length > 0) {
          vm.getHideMsg[objName] = vm.getMsg[objName].$model.join(',');
        } else {
          vm.getHideMsg[objName] = '';
        }
        
        var ZjSco = 0;
        $.each(vm.getMsg[objName].$model,function(idx,val){
          ZjSco += parseInt(val)
        })
        vm.getMsg.zjpfZf = ZjSco
      }
    })
    function add_callBack(data){
      window.parent.$('#tabDiv').datagrid('reload');
      window.parent.message_alert(data);
      setTimeout(function () {
        window.location.reload();
      }, 800)
    }

    function saveCom(){
      if(vm.getMsg.zjpfZf == ''){
        publicFun.alert("请填写镇静评分！");
      }else{
        jquerySubByFId('ZjpfForm', add_callBack, null, "json");
      }
    }

    function getAlldata(){
      //scorequery/findGcsScoreByXtpgSeq.do
      publicFun.httpServer({url:_baseUrl+'scorequery/findZjpfScoreByXtpgSeq.do'}, {'zjpfSeq': _zjpfSeq }, function (res) {
        vm.getMsg.zjpfZf = res.zjpfZf;
        vm.getHideMsg['zjpfnrx'] = res.zjpfnrx;
        vm.getMsg['zjpfnrx'] = res.zjpfnrx.split(",");
        vm.sysMsg.createDate = publicFun.timeFormat(res.cratDat, 'yyyy/MM/dd hh:mm');
      })
    }

    $(function () {
      getParentBasicVal();
      if(_zjpfSeq != ''){
        getAlldata();
      }
    })
  </script>
</body>

</html>