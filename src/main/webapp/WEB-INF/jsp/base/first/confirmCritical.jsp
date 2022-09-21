<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/criticalBox/criticalBox.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <title>危急值结果确认</title>
</head>

<body>
  <div ms-controller="criticalBody" class="criticalDiv">
    <form class="form">
      <table>
        <colgroup>
          <col width="18%" />
          <col width="18%" />
          <col width="18%" />
          <col />
        </colgroup>
        <tbody>
          <tr>
            <th>发送人：</th>
            <td>
              {{confirmMsg.crtUser}}
            </td>
            <th>发送时间：</th>
            <td>
              {{confirmMsg.crtTime}}
            </td>
          </tr>
          <tr>
            <th>发送内容：</th>
            <td colspan="3">
              <div class="divRead">
                {{confirmMsg.erInfo}}
              </div>
            </td>
          </tr>
          <tr>
            <th> <i class="red">*</i> 接收护士：</th>
            <td colspan="3">
              <input type="text" class="hidden" />
              <span class="spanRelative floatLeft">
                <input class="smallInputWth" type="text" id="userSign" maxlength="10" onkeydown="getUerList(event)" autocomplete="off" ms-duplex-string="inputValContent" />
                <div class="userList" id="userList"></div>
              </span>
              <span class="normalLine">请即时确认!</span>
            </td>
          </tr>
          <tr>
            <td colspan="4" class="last_td">
              <div class="center grp_btn">
                <a class="easyui-linkbutton" iconCls="icon-ok" onclick="sureMsg()">确认</a>
                <!-- <a class="easyui-linkbutton" iconCls="icon-cancel" onclick="dealLater()">暂不处理</a> -->
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </form>
    <!-- <div class="leftTab">
      <table>
        <thead>
          <tr>
            <th>项目</th>
            <th>结果</th>
            <th>参考值</th>
            <th>单位</th>
          </tr>  
        </thead>
        <tbody>
          <tr ms-repeat="tabMsg">
            <td>{{el.item}}</td>
            <td>{{el.result}}</td>
            <td>{{el.referenceValue}}</td>
            <td>{{el.unit}}</td>
          </tr>
        </tbody>
      </table>
    </div>
    <div class="rightContent">
      <p class="highTitle">{{patientInfo.bedNum}}-{{patientInfo.name}}</p>
      <p class="highTitle">危急值结果请确认?</p>
      <span class="marginGap">
        <span>护士工号：</span>
        <span class="spanRelative">
          <input class="smallInputWth" type="text" id="userSign" maxlength="10" onkeydown="getUerList(event)" autocomplete="off" ms-duplex-string="inputValContent" />
          <div class="userList" id="userList"></div>
        </span>
      </span>
      <p class="center">
        <a class="easyui-linkbutton" iconCls="icon-ok" onclick="sureMsg()">确认</a>
      </p>
    </div> -->
  </div>
  <script>
    var vm = avalon.define({
      $id: 'criticalBody',
      // tabMsg: [{
      //   item: 'GLU',
      //   result: '1',
      //   referenceValue: '',
      //   unit: 'mmol/L'
      // }, {
      //   item: 'Na',
      //   result: '110',
      //   referenceValue: '',
      //   unit: 'mmol/L'
      // }],
      // patientInfo: {
      //   bedNum: '抢3床',
      //   name: '张进'
      // },
      inputValContent: '',
      confirmMsg: {
        erSeq: '',
        crtUser: '',
        crtTime: '',
        erInfo: ''
      }
    })

    function getUerList (e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('userSign', 'userList');
      }
    }
    
    function dealLater () {
      publicFun.removeItem('dangerBoxList');
      parent.closemodalwindow();
    }

    var _getDangerList = parent._dangerList;
    function sureMsg () {
      if (publicFun.strTrim($('#userSign').val()) === '') {
        publicFun.alert('护士工号必填');
        return
      }
      postSureFlg();
    }

    function postSureFlg () {
      publicFun.httpServer({url: '${baseurl}icuer/editErInfoSubmit.do'}, {'icuErInfoCustom.erSeq': vm.confirmMsg.erSeq, 'icuErInfoCustom.modUser': vm.inputValContent}, function (res) {
        if (res.resultInfo.type == '1') {
          parent.isCloseBox = true;
          _getDangerList = parent.getLocalDangerList();
          if (_getDangerList.length > 0) {
            setTimeout(function () {
              parent.timingBox();
            }, 1000);
          }
          $('.smallInputWth').val('');
          vm.inputValContent = '';
          if (parent.window.top.$("#tabs").tabs('getSelected')[0].children[0].contentWindow.queryIcuEr) {
            parent.window.top.$("#tabs").tabs('getSelected')[0].children[0].contentWindow.queryIcuEr()
          }
          parent.closemodalwindow();
        }
      })
    }

    function changeContent () {
      var _fillList = ['erSeq', 'crtUser', 'crtTime', 'erInfo'];
      _fillList.forEach(function (item, idx) {
        vm.confirmMsg[item] = _getDangerList[0][item];
      })
      vm.confirmMsg.crtTime = publicFun.timeFormat(vm.confirmMsg.crtTime, 'yyyy/MM/dd hh:mm');
      $('.smallInputWth').val('');
      vm.inputValContent = '';
    }
    var _getDangerList;
    $(function () {
      _getDangerList = parent._dangerList;
      changeContent();
    })
  </script>
</body>
</html>