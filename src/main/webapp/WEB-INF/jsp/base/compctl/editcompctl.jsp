<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>机构修改</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="editcompctl">
  <form class="form" id="compctlform" action="${baseurl}compctl/editcompctlsubmit.do" method="post">
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 机构号:</th>
          <td>
            <input type="text" id="compctl_comno" name="dstcompctlCustom.comno" value="${dstcompctlCustom.comno}"
              readonly="true" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 机构名称:</th>
          <td>
            <input type="text" id="compctl_comcname" name="dstcompctlCustom.comcname" value="${dstcompctlCustom.comcname}" />
          </td>
        </tr>
        <tr>
          <th>拼音首码:</th>
          <td>
            <input type="text" id="vchar1" name="dstcompctlCustom.vchar1" value="${dstcompctlCustom.vchar1 }" />
          </td>
        </tr>
        <tr>
          <th>上级机构:</th>
          <td>
            <input type="text" value="${comcname}" readonly="true" />
            <input type="hidden" id="compctl_comman" name="dstcompctlCustom.comman" value="${dstcompctlCustom.comman}" />
          </td>
        </tr>
        <tr>
          <th>联系电话:</th>
          <td>
            <input type="text" id="compctl_phone" name="dstcompctlCustom.phone" value="${dstcompctlCustom.phone}" />
          </td>
        </tr>
        <tr>
          <th>传真:</th>
          <td>
            <input type="text" id="compctl_fax" name="dstcompctlCustom.fax" value="${dstcompctlCustom.fax}" />
          </td>
        </tr>
        <tr>
          <th>邮编:</th>
          <td>
            <input type="text" id="compctl_post" name="dstcompctlCustom.post" value="${dstcompctlCustom.post}" />
          </td>
        </tr>
        <tr>
          <th>机构状态:</th>
          <td>
            <select id="compctl_isenable" name="dstcompctlCustom.isenable">
              <c:forEach items="${compctlstatList}" var="value">
                <option value="${value.infocode}">${value.info}</option>
              </c:forEach>
            </select>
          </td>
        </tr>
        <tr>
          <th>机构地址:</th>
          <td>
            <input type="text" id="compctl_addr" class="address " name="dstcompctlCustom.addr" value="${dstcompctlCustom.addr}" />
          </td>
        </tr>
        <tr>
          <th>是否急诊科室:</th>
          <td>
            <select id="compctl_isJzks" name="dstcompctlCustom.isJzks" class="li-input-s">
              <option value="1" <c:if test="${dstcompctlCustom.isJzks eq '是' }">
                selected="selected"
                </c:if>>是</option>
              <option value="0" <c:if test="${dstcompctlCustom.isJzks eq '否' }">
                selected="selected"
                </c:if>>否</option>
            </select>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <input type="hidden" id="compctl_comno" name="comno" value="${dstcompctlCustom.comno}" />
              <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editCompctl()">确定</a>
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
    var tg = parent.tg;
    $(document).ready(function () {
      //加载机构状态
      var compctlstate = "${dstcompctlCustom.isenable}";
      $("#compctl_isenable").val(compctlstate);
    });

    function validateForm() {
      return $("#compctlform").validate({
        rules: {
          "dstcompctlCustom.comno": "required",
          "dstcompctlCustom.comcname": "required",
          "dstcompctlCustom.phone": {
            isPhone: true
          },
          "dstcompctlCustom.post": {
            isZipCode: true
          }
        },
        messages: {
          "dstcompctlCustom.comno": "请输入机构号",
          "dstcompctlCustom.comcname": "请输入机构名称",
          "dstcompctlCustom.phone": {
            isPhone: "电话格式错误"
          },
          "dstcompctlCustom.post": {
            isZipCode: "邮编格式错误"
          }
        }
      }).form();
    }
    $.validator.methods.isPhone = function (value, element, param) {
      if (value === "") {
        return true
      } else {
        return (/^1[3|4|5|7|8][0-9]\d{4,8}$/.test(value));
      }
    };
    $.validator.methods.isZipCode = function (value, element, param) {
      if (value === "") {
        return true
      } else {
        return (/^[1-9][0-9]{5}$/.test(value));
      }
    };
    //机构修改修改
    function editCompctl() {
      if (validateForm()) {
        jquerySubByFId("compctlform", editcompctl_callback, null, "json");
      }

    }
    //修改的回调函数
    function editcompctl_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == "1") {
        var isenable = $("#compctl_isenable").val();
        if (isenable == 1)
          isenable = "有效";
        else
          isenable = "无效";
        var isJzks = $("#compctl_isJzks").val();
        if (isJzks == 1)
          isJzks = "是";
        else
          isJzks = "否";
        tg.update({
          comcname: $("#compctl_comcname").val(),
          comno: $("#compctl_comno").val(),
          phone: $("#compctl_phone").val(),
          //fax: $("#compctl_fax").val(),
          post: $("#compctl_post").val(),
          isenable: isenable,
          vchar1: $("#vchar1").val(),
          isJzks: isJzks,
          addr: $("#compctl_addr").val()
        }, tg.getSelected());
        setTimeout("parent.closemodalwindow()", 1000);
      }
    }
  </script>
</body>

</html>