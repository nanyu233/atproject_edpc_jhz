<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增设备配置</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="adddevice">
  <form class="form" id="deviceform" action="${baseurl}device/inserthds.do" method="post">
    <table>
      <colgroup>
        <col width="23%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 设备类型：</th>
          <td>
            <select id="devtypCod" name="hspDevSysCustom.devtypCod" class="li-input-s">
              <c:forEach items="${dictlist}" var="value">
                <option value="${value.infocode}">${value.info}</option>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 设备唯一号：</th>
          <td>
            <input type="text" id="devno" name="hspDevSysCustom.devno" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 绑定客户端IP：</th>
          <td>
            <input type="text" id="ipaddr" name="hspDevSysCustom.ipaddr" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th>备注：</th>
          <td>
            <textarea class="div-textarea divarea" id="memo" name="hspDevSysCustom.memo" maxlength="100"></textarea>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertDevice()">确定</a>
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
    //设备配置新增
    function insertDevice() {
      if (validateForm()) {
        jquerySubByFId('deviceform', insertdevice_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#deviceform").validate({
        rules: {
          //"hspDevSysCustom.devtypCod": "required",
          "hspDevSysCustom.devno": "required",
          //"hspDevSysCustom.ipaddr": "required",
          "hspDevSysCustom.ipaddr": {
            isIpaddr: true
          }
        },
        messages: {
          //"hspDevSysCustom.devtypCod": "请输入设备类型",
          "hspDevSysCustom.devno": "请输入设备唯一号",
          //"hspDevSysCustom.ipaddr": "请输入绑定客户端IP",
          "hspDevSysCustom.ipaddr": {
            isIpaddr: "请输入正确的IP地址"
          }
        }
      }).form();
    }
    $.validator.methods.isIpaddr = function (value, element, param) {
      return (/^((2[0-4]\d|25[0-5]|[01]?\d\d?)\.){3}(2[0-4]\d|25[0-5]|[01]?\d\d?)$/.test(value));
    };
    //新增的回调函数
    function insertdevice_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.querydevice();
      }
    }
  </script>
</body>

</html>