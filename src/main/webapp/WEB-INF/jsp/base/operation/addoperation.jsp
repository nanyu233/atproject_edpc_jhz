<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>新增操作</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
</head>

<body>
  <form class="form" id="operationform" action="${baseurl}operation/addoperationsubmit.do" method="post">
    <input type="hidden" id="operation_moduleid" name="moduleid" value="${moduleid }" />
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 操作名称:</th>
          <td>
            <input type="text" id="operation_operatename" name="dstoperationCustom.operatename" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 操作方法:</th>
          <td>
            <input type="text" id="operation_url" name="dstoperationCustom.url" maxlength="180" />
          </td>
        </tr>
        <tr>
          <th>图标:</th>
          <td>
            <input type="text" id="operation_icon" name="dstoperationCustom.icon" maxlength="128" />
          </td>
        </tr>
        <tr>
          <th>类型:</th>
          <td>
            <select id="operation_opertype" name="dstoperationCustom.opertype" class="li-input-s">
              <c:forEach items="${opertypeList}" var="value">
                <c:choose>
                  <c:when test="${value.info =='URL'}">
                    <option value="${value.infocode}" selected="selected">${value.info}</option>
                  </c:when>
                  <c:otherwise>
                    <option value="${value.infocode}">${value.info}</option>
                  </c:otherwise>
                </c:choose>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr>
          <th>所属上级模块:</th>
          <td>
            <input type="text" id="operation_modulename" name="modulename" value="${modulename}" readonly="readonly" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 显示顺序:</th>
          <td>
            <input type="text" id="operation_showorder" name="dstoperationCustom.showorder" value="${dstoperations}"
              maxlength="8" />
          </td>
        </tr>
        <tr>
          <td colspan="2" class="center last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertOperation()">确定</a>
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
    function validateForm() {
      return $("#operationform").validate({
        rules: {
          "dstoperationCustom.operatename": "required",
          "dstoperationCustom.url": "required",
          "dstoperationCustom.showorder": {
            required: true,
            digits: true
          }
        },
        messages: {
          "dstoperationCustom.operatename": "请输入操作名称",
          "dstoperationCustom.url": "请输入操作方法",
          "dstoperationCustom.showorder": {
            required: "请输入显示顺序",
            digits: "格式不正确"
          }
        }
      }).form();
    }
    //新增操作
    function insertOperation() {
      if (validateForm()) {
        jquerySubByFId('operationform', insertoperation_callback, null, "json");
      }
    }
    //新增的回调函数
    function insertoperation_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryoperation();
      }
    }
  </script>
</body>

</html>