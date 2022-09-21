<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>新增主诉症状</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
</head>

<body>
  <form class="form" id="hspcbyxform" action="${baseurl}firstimp/addcbyx.do" method="post">
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> 主诉症状：</th>
          <td>
            <input class="input-base total-right" type="text" id="cbyx" name="hspCbyxglInfCustom.cbyx" maxlength="50" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 拼音首码：</th>
          <td>
            <input class="input-base total-right" type="text" id="pysm" name="hspCbyxglInfCustom.pysm" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 分级：</th>
          <td>
            <div class="display-table-cell">
              <select name="hspCbyxglInfCustom.yjdj" class="departments">
                <option value="">请选择</option>
                <c:forEach items="${chkLvlCodList}" var="value">
                  <option value="${value.infocode}">${value.info}</option>
                </c:forEach>
              </select>
            </div>
          </td>
        </tr>
        <tr>
          <th> 去向：</th>
          <td>
            <div class="display-table-cell">
              <select name="hspCbyxglInfCustom.brqx" class="departments">
                <option value="">请选择</option>
                <c:forEach items="${cstDspCodList}" var="value">
                  <option value="${value.infocode}">${value.info}</option>
                </c:forEach>
              </select>
            </div>
          </td>
        </tr>
        <tr>
          <th> 就诊科室：</th>
          <td>
            <div class="display-table-cell">
              <select name="hspCbyxglInfCustom.fzks" class="departments">
                <option value="">请选择</option>
                <c:forEach items="${jzkscompctlList}" var="value">
                  <option value="${value.comno}">${value.comcname}</option>
                </c:forEach>
              </select>
            </div>
          </td>
        </tr>
        <tr>
          <th> 备注：</th>
          <td>
            <input class="input-base total-right" type="text" id="memo" name="hspCbyxglInfCustom.memo" maxlength="200" />
          </td>
        </tr>
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
    //主诉症状保存
    function addHspCbyx() {
      if (validateForm()) {
        jquerySubByFId('hspcbyxform', inserthspjbzd_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#hspcbyxform").validate({
        rules: {
          "hspCbyxglInfCustom.cbyx": "required",
          "hspCbyxglInfCustom.pysm": { isPysm: true },
        },
        messages: {
          "hspCbyxglInfCustom.cbyx": "请输入主诉症状",
          "hspCbyxglInfCustom.pysm": { isPysm: "请输入大写拼音首码" }
        }
      }).form();
    }
    $.validator.methods.isPysm = function (value, element, param) {
      return (/^[A-Z]+$/.test(value));
    };
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