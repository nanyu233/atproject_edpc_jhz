<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>新增疾病管理</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
</head>

<body>
  <form class="form" id="hspJbzdLzform" action="${baseurl}jbgl/addJbzdLz.do" method="post">
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i> id：</th>
          <td><input class="input-base total-right" type="text" id="id" name="hspJbzdLzCustom.id" maxlength="32" /></td>
        </tr>
        <tr>
          <th><i class="red">*</i> 疾病名称：</th>
          <td><input class="input-base total-right" type="text" id="jbbc" name="hspJbzdLzCustom.jbbc" maxlength="32" /></td>
        </tr>

        <tr>
          <th><i class="red">*</i> Icd10：</th>
          <td><input class="input-base total-right" type="text" id="Icd10" name="hspJbzdLzCustom.icd10" maxlength="32" /></td>
        </tr>
        <tr>
          <th><i class="red">*</i> 拼音首码：</th>
          <td><input class="input-base total-right" type="text" id="pysm" name="hspJbzdLzCustom.pysm" maxlength="32" /></td>
        </tr>
        <tr>
          <th>疾病类型：</th>
          <td><select id="jibingtype" name="hspJbzdLzCustom.jibingtype">
              <option value="0">中医主症</option>
              <option value="1">中医主病</option>
              <option value="2">西医诊断</option>
            </select></td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="addHspJbzdLz()">确定</a> 
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
    function addHspJbzdLz() {
      if (validateForm()) {
        jquerySubByFId('hspJbzdLzform', inserthspjbzd_callback, null, "json");
      }
    }

    function validateForm() {
      return $("#hspJbzdLzform").validate({
        rules: {
          "hspJbzdLzCustom.id": "required",
          "hspJbzdLzCustom.jbbc": "required",
          "hspJbzdLzCustom.icd10": "required",
          "hspJbzdLzCustom.pysm": "required",
          "hspJbzdLzCustom.pysm": {
            isPysm: true
          },
          "hspJbzdLzCustom.jibingtype": "required",
        },
        messages: {
          "hspJbzdLzCustom.id": "请输入id",
          "hspJbzdLzCustom.jbbc": "请输入疾病名称",
          "hspJbzdLzCustom.icd10": "请输入icd10",
          "hspJbzdLzCustom.pysm": {
            isPysm: "请输入大写拼音首码"
          },
          "hspJbzdLzCustom.jibingtype": "请选择疾病类型"
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
        parent.queryhspJbzdlz();
      }
    }
  </script>
</body>

</html>