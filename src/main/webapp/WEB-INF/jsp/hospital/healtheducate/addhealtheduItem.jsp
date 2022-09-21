<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增健康教育项目</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?11">
</head>

<body class="addcompctl floatLeft">
  <form class="form" id="itemform" action="${baseurl}healthedu/addhealtheduItem_submit.do" method="post">
    <table>
      <colgroup>
        <col width="100" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th colspan="2" class="center">新增健康教育项目</th>
        </tr>
        <tr>
          <th><i class="red">*</i> 项目名称:</th>
          <td>
            <input type="hidden" id="itemno" name="hspHealtheduItemCustom.itemno" value="${itemno }" />
            <input type="text" id="itemNam" name="hspHealtheduItemCustom.itemNam" />
          </td>
        </tr>
        <tr>
          <th>拼音首码:</th>
          <td>
            <input type="text" id="spellcode" name="hspHealtheduItemCustom.spellcode" />
          </td>
        </tr>
        <tr>
          <th>所属上级:</th>
          <td>
            <input type="text" value="${parentname}" readonly="true" />
            <input type="hidden" id="parentno" name="hspHealtheduItemCustom.parentno" value="${parentno}" />
          </td>
        </tr>
        <tr class="hidden">
          <th>状态:</th>
          <td>
            <input type="text" name="hspHealtheduItemCustom.isenable" id="isenable" value="1">
            <!-- <select id="isenable" name="hspHealtheduItemCustom.isenable" class="li-input-s">
              <c:forEach items="${stateList}" var="value">
                <option value="${value.infocode}">${value.info}</option>
              </c:forEach>
            </select> -->
          </td>
        </tr>
        <tr>
          <th>顺序:</th>
          <td>
            <input type="text" id="showorder" name="hspHealtheduItemCustom.showorder" />
          </td>
        </tr>
        <tr>
          <th>内容:</th>
          <td>
            <textarea id="vchar1" name="hspHealtheduItemCustom.vchar1" style="width:745px;height:328px"></textarea>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="grp_btn_right">
              <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertItem()">确定</a>
              <!-- <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a> -->
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    var tg = parent.zt;
    // $(document).ready(function () {
    //   //机构状态默认赋值有效
    //   $("#isenable option").each(function () {
    //     if (this.text == "有效") {
    //       $(this).attr("selected", true);
    //     }
    //   });
    // });

    function validateForm() {
      return $("#itemform").validate({
        rules: {
          "hspHealtheduItemCustom.itemNam": "required",
        },
        messages: {
          "hspHealtheduItemCustom.itemNam": "请输入项目名称",
        }
      }).form();
    }
    //用户机构
    function insertItem() {
      if (validateForm()) {
        jquerySubByFId("itemform", insertItem_callback, null, "json");
      }
    }
    //新增的回调函数
    function insertItem_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == "1") {
        //新增数据
        // var isenable=$("#isenable").val();
        // if(isenable==1)
        // 	isenable="有效";
        // else
        // 	isenable="无效";
        // tg.append([{
        //   itemNam: $("#itemNam").val(),
        //   itemno: $("#itemno").val(),
        //   isenable: '有效',
        //   spellcode: $("#spellcode").val(),
        //   vchar1: $("#vchar1").val(),
        // }], tg.getSelected());
        parent.init();
        setTimeout("parent.closemodalwindow()", 1000);
      }
    }
  </script>
</body>

</html>