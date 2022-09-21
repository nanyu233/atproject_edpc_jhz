<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增物资维护</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="adddevice">
  <form class="form" id="deviceform" action="${baseurl}ksjh/editksjhsubmit.do" method="post">
    <table>
      <colgroup>
        <col width="15%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th><i class="red">*</i>操作类型：</th>
          <td>
            <label>
              <input type="radio" id="oprtTyp1" name="dstKsjhCustom.oprtTyp" value="0" <c:if test="${dstKsjhCustom.oprtTyp eq '0'}">
              checked="checked"</c:if>/>借出
            </label>
            <label>
              <input type="radio" id="oprtTyp2" name="dstKsjhCustom.oprtTyp" value="1" <c:if test="${dstKsjhCustom.oprtTyp eq '1'}">
              checked="checked"</c:if>/>借入
            </label>
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>物品名称：</th>
          <td>
            <input type="hidden" id="id" name="dstKsjhCustom.id" maxlength="32" value="${dstKsjhCustom.id }" />
            <input type="text" id="objt" name="dstKsjhCustom.objt" maxlength="32" value="${dstKsjhCustom.objt }" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>借出时间：</th>
          <td>
            <input class="input-sdate Wdate" id="lendDatStr" type="text" name="dstKsjhCustom.lendDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              value="${dstKsjhCustom.lendDatStr }" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>借出科室：</th>
          <td>
            <input type="text" id="lendDpm" name="dstKsjhCustom.lendDpm" maxlength="32" value="${dstKsjhCustom.lendDpm }" />
          </td>
        </tr>
        <tr>
          <th>借出人员：</th>
          <td>
            <input type="text" id="lnedUsr" name="dstKsjhCustom.lnedUsr" maxlength="32" value="${dstKsjhCustom.lnedUsr }" />
          </td>
        </tr>
        <tr>
          <th>所借科室：</th>
          <td>
            <input type="text" id="borrowDpm" name="dstKsjhCustom.borrowDpm" maxlength="32" value="${dstKsjhCustom.borrowDpm }" />
          </td>
        </tr>
        <tr>
          <th>所借人员：</th>
          <td>
            <input type="text" id="borrowUsr" name="dstKsjhCustom.borrowUsr" maxlength="32" value="${dstKsjhCustom.borrowUsr }" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>所借人员手机：</th>
          <td>
            <input type="text" id="borrowUsrTel" name="dstKsjhCustom.borrowUsrTel" maxlength="32" value="${dstKsjhCustom.borrowUsrTel }" />
          </td>
        </tr>
        <tr>
          <th>押金：</th>
          <td>
            <input type="text" id="deposit" name="dstKsjhCustom.deposit" maxlength="32" onblur="checkDeposit()" value="${dstKsjhCustom.deposit }" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i>归还状态：</th>
          <td>
            <label>
              <input type="radio" id="returnStatus1" name="dstKsjhCustom.returnStatus" value="0" <c:if test="${dstKsjhCustom.returnStatus eq '0'}">
              checked="checked"</c:if>/>未归还
            </label>
            <label>
              <input type="radio" id="returnStatus2" name="dstKsjhCustom.returnStatus" value="1" <c:if test="${dstKsjhCustom.returnStatus eq '1'}">
              checked="checked"</c:if>/>已归还
            </label>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editKsjh()">确定</a>
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
    function editKsjh() {
      if (validateForm()) {
        jquerySubByFId('deviceform', editKsjh_callback, null, "json");
      }
    }

    //新增的回调函数
    function editKsjh_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.querydevice();
      }
    }
    function validateForm() {
      return $("#deviceform").validate({
        rules: {
          "dstKsjhCustom.oprtTyp": "required",
          "dstKsjhCustom.objt": "required",
          "dstKsjhCustom.lendDpm": "required",
          "dstKsjhCustom.lendDat": "required",
          "dstKsjhCustom.borrowUsrTel": "required",
          "dstKsjhCustom.deposit": {
            isIpaddr: true
          },
        },
        messages: {
          "dstKsjhCustom.oprtTyp": "操作类型必填",
          "dstKsjhCustom.objt": "物品名称必填",
          "dstKsjhCustom.lendDpm": "借出科室必填",
          "dstKsjhCustom.lendDat": "借出时间必填",
          "dstKsjhCustom.borrowUsrTel": "所借人手机必填",
          "dstKsjhCustom.deposit": {
            isIpaddr: "请输入整数押金"
          }
        }
      }).form();
    }
    $.validator.methods.isIpaddr = function (value, element, param) {
      var deposit = $.trim($("#deposit").val());
      if (deposit == null || deposit == "") {
        return true;
      } else
        return (/^\d+$/.test(value));
    };
  </script>
</body>

</html>