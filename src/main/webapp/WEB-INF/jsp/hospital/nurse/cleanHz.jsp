<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?090">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?090">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <title>候诊患者-清除</title>
</head>

<body class="adddevice">
  <form class="form">
    <table>
      <colgroup>
        <col width="23%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th>已选中超时患者：</th>
          <td id="patientOver"></td>
        </tr>
        <tr>
          <th>移除原因：</th>
          <td>
            <textarea class="div-textarea divarea" maxlength="100" id="note"></textarea>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="postFormMsg()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <script type="text/javascript">
    function setCheckName() {
      var _str = '';
      var checkList = parent._checkList;
      for (var i = 0; i < checkList.length; i++) {
        _str += checkList[i].cstNam + '；';
      }
      _str = _str.substring(0, _str.length - 1);
      $('#patientOver').html(_str);
    }
    function getCleanList() {
      var cleanList = [], checkList = parent._checkList;
      for (var i = 0; i < checkList.length; i++) {
        cleanList.push({ 'emgSeq': checkList[i].emgSeq,  'cleanhzMemo': $('#note').val()});
      };
      return cleanList;
    }

    function postFormMsg() {
      var _postMsg = {
        hspemginfCustomList: getCleanList()
      };
      publicFun.httpServer({ url: '${baseurl}his/cleanListHz.do', requestDataType: 'json'}, _postMsg, function (res) {
        if (res.resultInfo.type == 1) {
          parent.jzjlquery();
          parent.$('#tabList').datagrid('clearChecked');
          parent.closemodalwindow();
        }
      })
    }
    $(function () {
      setCheckName();
    })
  </script>
</body>

</html>