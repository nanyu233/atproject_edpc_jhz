<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>手术操作病程新增/修改</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/diseasecourse.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/contstyle.css?v=${versionDay}" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script>
    var _btnType = 'updateOperation',
        _emgSeq = '${hspemginfCustom.emgSeq}';
  </script>
</head>

<body>
  <div class="operateLr">
    <form class="at-form" id="roleForm" action="${baseurl}zyylqbl/addOperatelr.do" method="post" ms-controller="operateLr">
      <div>
        <div class="all-title">
          手术、操作病程记录
        </div>
        <ul class="middleul">
          <li class="infoli">
            姓名：
            <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.cstNam}" />&emsp;
            性别：
            <input class="titleinputSpc" unselectable='on' readonly="readonly" value="${hspemginfCustom.cstSexCod}" />&emsp;
            年龄：
            <input class="titleinputSpc" unselectable='on' readonly="readonly" id="age" />&emsp;
            科别：
            <input class="titleinput_kb" unselectable='on' readonly="readonly" value="急诊科门诊" />&emsp;
            病历号：
            <input class="titleinput" unselectable='on' readonly="readonly" value="${hspemginfCustom.mpi}" />&emsp;
            <!-- 留观号：
            <input readonly="readonly" unselectable='on' class="titleinput" value="${hspemginfCustom.observationCode}"
              name="observationCode" />&emsp; -->
          </li>
        </ul>
        <div class="at-form-item clr">
          <label class="label_left">手术操作日期</label>
          <div class="right_content">
            <input class="input-sdate Wdate" type="text" name="operDat" ms-duplex-string="msg.operDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              autocomplete="off" id="operDatInput">
          </div>
        </div>
        <div class="at-form-item clr">
          <label class="label_left">手术操作名称</label>
          <div class="right_content" id="searchWrapper">
            <input type="text" name="emgSeq" value="${hspemginfCustom.emgSeq}" class="hidden">
            <input type="text" id="operSeq" name="operSeq" value="${operSeq}" class="hidden">
            <span class="spanRelative long-input">
              <input class="input-sdate full-wth" type="text" maxlength="16" autocomplete="off" name="operNam" ms-duplex-string="msg.operNam" id="operNamInput" ms-keyup="searchMove(event)"/>
              <input class="hidden" id="operNamInputNum"/>
              <div id="allBuddy" class="tableSelectList" ms-visible="operationNameList.length > 0">
                <table cellspacing="0" cellpadding="0" border="0" width="100%" id="buddyListTable">
                  <tbody>
                    <tr ms-repeat="operationNameList" class="repeatTr" ms-click="chooseLiMsg($index)">
                      <td>{{el.operationName}}</td>
                    </tr>
                  </tbody>
                </table>
              </div>
            </span>
          </div>
        </div>
        <div class="at-form-item clr">
          <label class="label_left">手术操作医生</label>
          <div class="right_content">
            <input class="input-sdate long-input" type="text" maxlength="16" name="operYs" ms-duplex-string="msg.operYs"
              autocomplete="off" id="operYsInput" />
          </div>
        </div>
        <div class="at-form-item clr">
          <label class="label_left">
            手术病程记录
            <a class="my-linkbutton btna atitle" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
          </label>
          <div class="import-div" id="subTemDiv"></div>
          <div class="right_content">
            <textarea class="div-textarea divarea" id="operBcjl" name="operBcjl" maxlength="150" ms-duplex-string="msg.operBcjl"></textarea>
          </div>
        </div>
      </div>
    </form>
  </div>
  <!-- <div class="tools-container">
    <p class="at-tools2 clr" id="atTools">
      <a class="commonbtn" href="javascript:;" onclick="saveForm()" id="save">保存</a>
      <a class="commonbtn" href="javascript:;" onclick="showlist()">显示列表</a>
    </p>
  </div> -->
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/directionKeycode.js?v=${versionDay}" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js" type="text/javascript"></script>
  <script type="text/javascript">
    function showlist() {
      var _url = '${baseurl}zyylqbl/operate.do?emgSeq=${hspemginfCustom.emgSeq}';
      window.location = _url;
    }

    function call_back(data) {
      message_alert(data);
      $('#operSeq').val(data.resultInfo.sysdata.onlySeq);
      setTimeout(function(){
        $(".messager-body").window('close');    
      },1000);
      // setTimeout(function () {
        // parent.selectType();
      // }, 800)
    }

    function saveForm() {
      var _operDat = vm.msg.operDat || $('#operDatInput').val(),
          _operNam = vm.msg.operNam || $('#operNamInput').val(),
          _operYs = vm.msg.operYs || $('#operYsInput').val();
      if (publicFun.checkItemNull(_operDat)) {
        publicFun.alert('手术操作日期必填');
        return false
      }
      if (publicFun.checkItemNull(_operNam)) {
        publicFun.alert('手术操作名称必填');
        return false
      }
      if (publicFun.checkItemNull(_operYs)) {
        publicFun.alert('手术操作医生必填');
        return false
      }
      jquerySubByFId('roleForm', call_back, null, "json");
    }

    function initAge() {
      if ('${hspemginfCustom.cstAge}') {
        $('#age').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
      } else {
        $('#age').val('')
      }
    }

    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });

    var vm = avalon.define({
      $id: 'operateLr',
      msg: {
        operNam: '',
        operDat: publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'),
        operYs: '',
        operBcjl: ''
      },
      operationNameList: [],
      chooseLiMsg: function (idx) {
        var name = vm.operationNameList[idx].operationName,
            num = vm.operationNameList[idx].operationCode;
        $('#operNamInput').val(name)
        $('#operNamInputNum').val(num)
        vm.operationNameList = []
      }
    })

    function getAjaxMsg() {
      var _emgOperSeq = '${operSeq}';
      if (_emgOperSeq) {
        publicFun.httpServer({ url: '${baseurl}zyylqbl/findOperateBySeq.do' }, { operSeq: _emgOperSeq }, function (res) {
          var _rtnMsg = res.resultInfo.sysdata.operateInf;
          parent.checkRole(_rtnMsg.creCod);
          for (var key in _rtnMsg) {
            if (vm.msg.hasOwnProperty(key)) {
              if (key === 'operDat') {
                if (_rtnMsg[key]) {
                  _rtnMsg[key] = publicFun.timeFormat(_rtnMsg[key], 'yyyy/MM/dd hh:mm:ss')
                }
              }
              vm.msg[key] = _rtnMsg[key]
            }
          }
        })
      }
    }
    

    function queryOperationName () {
      if (!$('#operNamInput').val()) {
        return;
      }
      vm.operationNameList = []
      publicFun.httpServer({ url: '${baseurl}qjs/queryOperationbyPysm.do' }, { 'hspOperationDictCustom.pinyinCode': $('#operNamInput').val()}, function (res) {
        for (var i = 0; i < res.length; i++) {
          vm.operationNameList.push(res[i])
        }
      })
    }
    $('body').click(function () {
      vm.operationNameList = []
    })
    $(function () {
      // var height = $('#main', parent.document).height() - 45;
      // $('.mainbody').height(height);
      initAge();
      getAjaxMsg();
      initDocImportHtml('subTemDiv', 'operBcjl')
    })
  </script>
</body>

</html>