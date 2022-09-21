<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>新增模块</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
</head>

<body>
  <form class="form" id="moduleform" action="${baseurl}module/addmodulesubmit.do" method="post">
    <input type="hidden" id="module_parentid" name="dstmoduleCustom.parentid" value="${parentid }" />
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th>
            <i class="red">*</i> 模块名称：
          </th>
          <td>
            <input type="text" id="module_modulename" name="dstmoduleCustom.modulename" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th>所属上级模块：</th>
          <td>
            <input type="text" id="module_parentname" name="dstmoduleCustom.parentname" readonly="readonly" value="${parentname }" />
          </td>
        </tr>
        <tr>
          <th>URL：</th>
          <td>
            <input type="text" id="module_url" name="dstmoduleCustom.url" maxlength="100" />
          </td>
        </tr>
        <tr>
          <th>图标：</th>
          <td>
            <input type="text" id="module_icon" name="dstmoduleCustom.icon" maxlength="128" />
          </td>
        </tr>
        <tr>
          <th>
            <i class="red">*</i> 显示顺序：
          </th>
          <td>
            <input type="text" id="module_showorder" name="dstmoduleCustom.showorder" maxlength="8" value="${showorder }" />
          </td>
        </tr>
        <tr>
          <th>
            <i class="red">*</i> 是否使用：
          </th>
          <td>
            <select id="module_isused" name="dstmoduleCustom.isused">
              <option value="1">有效</option>
              <option value="0">无效</option>
            </select>
          </td>
        </tr>
        <tr>
          <th>
            <i class="red">*</i> 刷新类型：
          </th>
          <td>
            <select id="module_reloadType" name="dstmoduleCustom.reloadType">
              <option value="1">刷新页面</option>
              <option value="0">刷新局部</option>
              <option value="3">混合</option>
            </select>
          </td>
        </tr>
        <tr>
          <td class="center last_td" colspan="2">
            <div class="center grp_btn">
              <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertModule()">确定</a>
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
    function insertModule() {
      if (validateForm()) {
        jquerySubByFId('moduleform', insertmodule_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#moduleform").validate({
        rules: {
          "dstmoduleCustom.modulename": "required",
          "dstmoduleCustom.showorder": {
            required: true,
            digits: true
          },
          "dstmoduleCustom.isused": "required"
        },
        messages: {
          "dstmoduleCustom.modulename": "请输入模块名称",
          "dstmoduleCustom.showorder": {
            required: "请输入显示顺序",
            digits: "格式不正确"
          },
          "dstmoduleCustom.isused": "请选择使用状态"
        }
      }).form();
    }

    //新增的回调函数
    function insertmodule_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.querymodule();
      }
    }
  </script>
</body>

</html>