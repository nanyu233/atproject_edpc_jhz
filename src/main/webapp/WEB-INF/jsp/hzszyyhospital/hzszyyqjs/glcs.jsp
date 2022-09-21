<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>隔离措施</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="adddevice textForm">
  <form class="form" id="glform" action="${baseurl}gl/submitGlcs.do" method="post">
    <table>
      <colgroup>
        <col width="23%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <input type="hidden" id="hspGlcsCustom.emgSeq" name="hspGlcsCustom.emgSeq" value="${emgSeq}" />
          <th>姓名：</th>
          <td>&nbsp;${emgNam}</td>
        </tr>
        <tr>
          <th>接触隔离：</th>
          <td>
            <label for="jcgl" class="fullLab">
              <input type="checkbox" id="jcgl" name="hspGlcsCustom.jcgl" value="1" <c:if test="${hspGlcsCustom.jcgl == 1}">checked</c:if>/>
              是
            </label>
          </td>
        </tr>
        <tr>
          <th>空气隔离：</th>
          <td>
            <label for="kqgl" class="fullLab">
              <input type="checkbox" id="kqgl" name="hspGlcsCustom.kqgl" value="1" <c:if test="${hspGlcsCustom.kqgl == 1}">checked</c:if>/>
              是
            </label>
          </td>
        </tr>
        <tr>
          <th>飞沫隔离：</th>
          <td>
            <label for="fmgl" class="fullLab">
              <input type="checkbox" id="fmgl" name="hspGlcsCustom.fmgl" value="1" <c:if test="${hspGlcsCustom.fmgl == 1}">checked</c:if>/>
              是
            </label>
          </td>
        </tr>
        <tr>
          <th>保护性隔离：</th>
          <td>
            <label for="bhxgl" class="fullLab">
              <input type="checkbox" id="bhxgl" name="hspGlcsCustom.bhxgl" value="1" <c:if test="${hspGlcsCustom.bhxgl == 1}">checked</c:if>/>
              是
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="glcs()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>

  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    function glcs() {
      jquerySubByFId('glform', glcs_callback, null, "json");
    }
    //新增的回调函数
    function glcs_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        if (parent.$('#listContainer').is(':visible')) {
          parent.getPatientList();
        } else {
          parent.getSickbedMsg();
        }
        //parent.queryabn();
      }
    }
  </script>
</body>

</html>