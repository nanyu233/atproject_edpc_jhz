<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <base href="${baseurl}">
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>新增UHF应答器</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}lib/layui/css/layui.css" media="all">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">

  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>

<body class="addHspUhfTrp">
  <form class="form" ms-controller="addHspUhfTrpForm" id="hspUhfTrpForm" action="rfid/addHspUhfTrpSubmit.do" method="post">
    <table>
      <colgroup>
        <col width="20%" />
        <col />
      </colgroup>
      <tbody>

        <tr>
          <th><i class="red">*</i> 标签编号：</th>
          <td>
            <input type="text" ms-duplex="hspUhfTrpCustom.trpId" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th> 标签名称：</th>
          <td>
            <input type="text" ms-duplex="hspUhfTrpCustom.trpNam" maxlength="64" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 标签类型：</th>
          <td>
            <select ms-duplex="hspUhfTrpCustom.trpTyp" lay-verify="required">
              <option value="1">胸痛</option>
              <option value="2">卒中</option>
              <option value="3">创伤</option>
            </select>
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 标签分类：</th>
          <td>
            <select ms-duplex="hspUhfTrpCustom.trpCls" lay-verify="required">
              <option value="1">抗人体硅胶无源手环</option>
              <option value="2">纸质抗菌腕带</option>
            </select>
          </td>
        </tr>
        <tr>
          <th> 类型图片：</th>
          <td>
            <input type="text" ms-duplex="hspUhfTrpCustom.typPic" maxlength="32" />
          </td>
        </tr>
        <tr>
          <th><i class="red">*</i> 设备状态：</th>
          <td>
            <select ms-duplex="hspUhfTrpCustom.trpSta" lay-verify="required">
              <option value="1">使用</option>
              <option value="0">未使用</option>
            </select>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="insertHspUhfTrp()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">

    $.validator.methods.isTrpSeq = function (value, element, param) {
      return (/[0-9]\d*/.test(value) && 0 <= 1 * value && value.length==2);
    };

    $.validator.methods.isURL = function (value, element, param) {
      //url格式, 例如 http://127.0.0.1/a.png
      if(""==value){
        return true;
      }else{
        return (/^((https|http|ftp|rtsp|mms)?:\/\/)[^\s]+/.test(value));
      }
    };


  </script>
  <script type="text/javascript" src="${baseurl}lib/avalon1.4.8/avalon.js"></script>
  <script type="text/javascript" src="${baseurl}lib/layui/layui.js"></script>
  <script type="text/javascript" src="${baseurl}js/subpageJs/rfid/addHspUhfTrp.avalon.js"></script>
</body>

</html>