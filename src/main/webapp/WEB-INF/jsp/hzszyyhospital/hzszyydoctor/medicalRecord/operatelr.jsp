<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="cache-control" content="no-cache">
  <title>手术操作</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="addrole fontNormal13 operateLr">
  <form class="form" id="roleForm" action="${baseurl}zyylqbl/addOperatelr.do" method="post" ms-controller="operateLr">
    <table>
      <colgroup>
        <col width="18%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 手术操作日期：</th>
          <td>
            <input class="input-sdate Wdate" type="text" name="operDat" ms-duplex-string="msg.operDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              autocomplete="off">
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 手术操作名称：</th>
          <td>
            <input type="text" name="emgSeq" value="${emgSeq}" class="hidden">
            <input type="text" name="operSeq" value="${operSeq}" class="hidden">
            <span class="spanRelative long-input" id="searchWrapper">
              <input class="input-sdate full-wth" type="text" maxlength="16" autocomplete="off" name="operNam" ms-duplex-string="msg.operNam" id="operNamInput"  ms-keyup="searchMove(event)"/>
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
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 手术操作医生：</th>
          <td>
            <input class="input-sdate long-input" type="text" maxlength="16" name="operYs" ms-duplex-string="msg.operYs"
              autocomplete="off" />
          </td>
        </tr>
        <tr>
          <th>手术病程记录：</th>
          <td>
            <textarea class="div-textarea divarea" name="operBcjl" maxlength="150" ms-duplex-string="msg.operBcjl"></textarea>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" onclick="insertMsg()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/directionKeycode.js?v=${versionDay}" type="text/javascript" charset="UTF-8"></script>
  <script>
    function insertMsg() {
      if (validateForm()) {
        jquerySubByFId('roleForm', function (data) {
          message_alert(data);
          if (data.resultInfo.type == '1') {
            setTimeout("parent.closemodalwindow()", 1000);
            parent.findOperateList();
          }
        }, null, "json")
      }
    }

    function validateForm() {
      return $("#roleForm").validate({
        rules: {
          "operNam": "required",
          "operDat": "required",
          "operYs": "required"
        },
        messages: {
          "operNam": "请输入手术操作名称",
          "operDat": "请输入手术操作日期",
          "operYs": "请输入手术操作医生"
        }
      }).form();
    }

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
      getAjaxMsg();
    })
  </script>
</body>

</html>