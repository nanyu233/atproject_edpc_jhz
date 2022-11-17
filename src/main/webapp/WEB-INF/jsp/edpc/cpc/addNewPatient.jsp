<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>胸痛新增院内/绕行发病患者</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
</head>

<body>
  <form class="form" id="hspcbyxform" action="${baseurl}cpc/addNewPatient.do" method="post">
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 姓名：</th>
          <td>
            <input class="input-base total-right" type="text" id="cstNam" name="hspDbzlBasCustom.cstNam" maxlength="50" />
          </td>
        </tr>
        <tr>
          <th> 性别：</th>
          <td>
            <input class="input-base total-right" type="text" id="cstSexCod" name="hspDbzlBasCustom.cstSexCod" maxlength="32" />
          </td>
        </tr>

        <tr>
          <th> 年龄：</th>
          <td>
            <input class="input-base total-right" type="text" id="cstAge" name="hspDbzlBasCustom.cstAge" maxlength="200" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 预检号：</th>
          <td>
            <input class="input-base total-right" type="text" id="emgSeq" name="hspDbzlBasCustom.emgSeq" maxlength="200" />
          </td>
        </tr>
        <tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="addHspCbyx()">确定</a>
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
    function addHspCbyx() {
      if (validateForm()) {
        jquerySubByFId('hspcbyxform', inserthspjbzd_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#hspcbyxform").validate({
        rules: {
          "hspDbzlBasCustom.cstNam": "required",
          "hspDbzlBasCustom.emgSeq":"required",
        },
        messages: {
          "hspDbzlBasCustom.cstNam": "请输入患者姓名",
          "hspDbzlBasCustom.emgSeq": "请输入患者预检号",
        }
      }).form();
    }
    //新增的回调函数
    function inserthspjbzd_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryhspcbyx();
      }
    }
  </script>
</body>

</html>