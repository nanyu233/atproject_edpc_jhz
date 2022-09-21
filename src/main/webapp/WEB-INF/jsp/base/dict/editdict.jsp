<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <title>修改数据字典</title>
</head>

<body>
  <form class="form" id="dictform" action="${baseurl}dict/editdictsubmit.do" method="post">
    <input type="hidden" name="dstdictinfoCustom.id" value="${dstdictinfoCustom.id }" />
    <input type="hidden" name="dstdictinfoCustom.infocode" value="${dstdictinfoCustom.infocode }" />
    <input type="hidden" name="dstdictinfoCustom.typecode" value="${dstdictinfoCustom.typecode }" />

    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th>类别:</th>
          <td>
            <input type="text" id="dict_typename" name="typename" value="${typename}" readonly="readonly" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>名称/值:</th>
          <td>
            <input type="text" id="dict_info" name="dstdictinfoCustom.info" value="${dstdictinfoCustom.info }"
              maxlength="32" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>显示顺序:</th>
          <td>
            <input type="text" id="dict_dictsort" name="dstdictinfoCustom.dictsort" value="${dstdictinfoCustom.dictsort }"
              maxlength="8" />
          </td>
        </tr>
        <tr>
          <th>状态:</th>
          <td>
            <select id="dict_isenable" name="dstdictinfoCustom.isenable">
              <option value="1" <c:if test="${dstdictinfoCustom.isenable eq '1' }">
                selected="selected"
                </c:if>>有效</option>
              <option value="0" <c:if test="${dstdictinfoCustom.isenable eq '0' }">
                selected="selected"
                </c:if>>无效</option>
            </select>
          </td>
        </tr>
        <tr>
          <th>备注:</th>
          <td>
            <textarea class="div-textarea" id="dict_remark" name="dstdictinfoCustom.remark" maxlength="128">${dstdictinfoCustom.remark }</textarea>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editdict()">确定</a>
              <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    validateForm();

    function validateForm() {
      return $("#dictform").validate({
        rules: {
          "dstdictinfoCustom.info": "required",
          "dstdictinfoCustom.dictsort": "required"
        },
        messages: {
          "dstdictinfoCustom.info": "请输入名称\值",
          "dstdictinfoCustom.dictsort": "请输入显示顺序"
        }
      }).form();
    }

    //修改
    function editdict() {
      if (validateForm()) {
        jquerySubByFId('dictform', editdict_callback, null, "json");
      }
    }
    //修改的回调函数
    function editdict_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        //延迟1秒执行关闭方法
        setTimeout("parent.closemodalwindow()", 1000);
        parent.querydict();
      }
    }
  </script>

</body>

</html>