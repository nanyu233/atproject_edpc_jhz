<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>床位调配</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="adddevice">
  <form class="form" id="bedform" action="${baseurl}bedinf/deploybed.do" method="post">
    <table>
      <colgroup>
        <col width="23%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <input type="hidden" id="HspBedInfCustom.emgSeq" name="HspBedInfCustom.emgSeq" maxlength="32" value="${emgSeq}"
            readonly="true" />
          <th> 姓名：</th>
          <td>
            &nbsp;${emgNam}
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 可调配床位：</th>
          <td>
            <select id="bedid" name="hspBedInfCustom.bedid" class="li-input-s">
              <c:forEach items="${bedplacecodList}" var="value">
                <c:if test="${hspemginfCustom.sqlStaCod == '6'}">
                  <c:if test="${value.bedPlace == '291'}">
                    <option value="${value.bedid}" <c:if test="${value.bedid}">
                      selected="selected"
                  </c:if>>${value.bedPlcNam}</option>
                </c:if>
                </c:if>
                <c:if test="${hspemginfCustom.sqlStaCod == '11'}">
                  <c:if test="${value.bedPlace == '290'}">
                    <option value="${value.bedid}" <c:if test="${value.bedid}">
                      selected="selected"
                  </c:if>>${value.bedPlcNam}</option>
                </c:if>
                </c:if>
              </c:forEach>
            </select>
            <input type="text" name="hspBedInfCustom.bedLgs" id="bedLgs" class="hidden">
            <input type="text" name="hspBedInfCustom.emgBed" id="emgBed" class="hidden">
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editBed()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript">
    $(function () {
      if ('${islgbed}' !== '1' && '${hspemginfCustom.sqlStaCod}' == '11') { // 若未开启，转归选择留观，则不显示床位
        $('#bedid').hide();
      } else {
        $('#bedid').show();
      }
    })

    function editBed() {
      var _goAway = '${hspemginfCustom.sqlStaCod}';
      if (_goAway == '11') { // 留观
        $('#bedLgs').val($('#bedid').val());
        $('#emgBed').val('');
      } else if (_goAway == '6') { // 留抢
        $('#emgBed').val($('#bedid').val());
        $('#bedLgs').val('');
      } else {
        $('#emgBed').val('');
        $('#bedLgs').val('');
      }
      jquerySubByFId('bedform', editbed_callback, null, "json");
    }

    //新增的回调函数
    function editbed_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        if (parent.getPatientList) {
          setTimeout("parent.closemodalwindow()", 1000);
          if (parent.$('#listContainer').is(':visible')) {
            parent.getPatientList();
          } else {
            parent.getSickbedMsg();
          }
        } else {
          setTimeout("parent.closemodalwindow()", 1000);
          parent.querybed();
        }
      }
    }
  </script>
</body>

</html>