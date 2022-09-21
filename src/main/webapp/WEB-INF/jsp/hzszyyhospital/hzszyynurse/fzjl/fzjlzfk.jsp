<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>再分科</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="querylqxxdj">
    <form class="form lqform" id="zfkform" action="${baseurl}hzszyyemg/addZyyemgSubmit_zfk.do" method="post">
        <input class="hidden" type="text" name="hspemginfCustom.emgSeq" value="${emgSeq}">
        <input class="hidden" type="text" name="hspemginfCustom.newEmgSeq" value="${newEmgSeq}">
        <table>
            <tbody>
                <tr>
                    <th>就诊号</th>
                    <td><span class="span_text">${mpi}</span></td>
                    <th>姓名</th>
                    <td><span class="span_text">${cstNam}</span></td>
                </tr>
                <tr>
                    <th>性别</th>
                    <td><span class="span_text" id="sexCod"></span></td>
                    <th>年龄</th>
                    <td><span class="span_text" id="age"></span></td>
                </tr>
                <tr>
                    <th>联系方式</th>
                    <td><span class="span_text">${pheNbr}</span></td>
                    <th>挂号科室</th>
                    <td>
                        <span class="span_text">${emgFkName}</span>
                    </td>
                </tr>
                <tr>
                    <th>新挂号科室</th>
                    <td colspan="3">
                        <select class="departments" name="hspemginfCustom.emgFkCod">
                          <option value="">请选择</option>
                          <c:forEach items="${jzkscompctlList}" var="value">
                            <option value="${value.comno}">${value.comcname}</option>
                          </c:forEach>
                        </select>
                    </td>
                </tr>
                
                <tr>
                    <td colspan="4" class="last_td">
                        <div class="center grp_btn">
                            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="submitIt()">确定</a>
                            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
                        </div>
                    </td>
                </tr>
            </tbody>
        </table>
    </form>
    <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
    <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
    <script type="text/javascript">
        var _baseUrl;
        _baseUrl = "${baseurl}";
    </script>
    <script type="text/javascript">
        //表单验证  
        function validateForm() {
            sessionStorage.setItem("isValidateFormForZfk", "true");
            return $("#zfkform").validate({
                ignore: [],
                rules: {
                    'hspemginfCustom.emgFkCod': 'required',
                },
                messages: {
                    'hspemginfCustom.emgFkCod': '新挂号科室必填',
                }
            }).form();
        }
        function submitIt(){
            if (validateForm()) {
                jquerySubByFId('zfkform', insertgh_callback, null, "json");
            }
        }

        //挂号回调函数
        function insertgh_callback(data) {
          message_alert(data);
          if (data.resultInfo.type == '1') {
            setTimeout("parent.closemodalwindow()", 1000);
            parent.reload();
          }
        }

        $(function(){
          if('${cstSexCod}' == 0){
            $('#sexCod').html('男')
          }else if('${cstSexCod}' == 1){
            $('#sexCod').html('女')
          }

          if('${cstAge}' != ''){
            if('${cstAgeCod}' == 0){
              $('#age').html('${cstAge}'+'岁')
            }else if('${cstAgeCod}' == 1){
              $('#age').html('${cstAge}'+'月')
            }else if('${cstAgeCod}' == 0){
              $('#age').html('${cstAge}'+'天')
            }
          }
          sessionStorage.setItem("isValidateFormForZfk", "false");
        })
    </script>
</body>

</html>