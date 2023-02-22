<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>新增apk</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}lib/layui/css/layui.css" media="all">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css?v=${versionDay}">
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}">
</head>

<body class="addrole">
<form class="layui-form" id="deviceform" action="" method="post"
      enctype="multipart/form-data">

    <div class="layui-form-item">
        <table style="width: 100%">
            <tr>
                <td>
                    <label class="layui-form-label"><i class="red">*</i> 版本号：</label>
                    <div class="layui-input-block">
                        <input type="text" name="apkVer" id="apkVer"/>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label class="layui-form-label"><i class="red">*</i> 版本描述：</label>
                    <div class="layui-input-block">
                        <input type="text" name="apkDes" id="apkDes"/>
                    </div>
                </td>
            </tr>
            <tr>
                <td>
                    <label class="layui-form-label">上传：</label>
                    <div class="layui-input-block">
                        <input type="file"  id="file" multiple="multiple" accept=".apk"/>
                    </div>
                </td>
            </tr>
        </table>
    </div>


    <div class="layui-form-item">
        <div style="margin: 0 auto">
            <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="addApp()">确定</a>
            <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </div>
    </div>
</form>
<script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
<script type="text/javascript" src="${baseurl}lib/avalon1.4.8/avalon.js"></script>
<script type="text/javascript" src="${baseurl}lib/layui/layui.js"></script>
<script type="text/javascript">
    var _baseurl = "${baseurl}";

    // 新增
    function addApp() {
        var form =  new FormData();
        form.append("file",document.getElementById('file').files[0]);
        form.append("apkVer",$("#apkVer").val());
        form.append("apkDes",$("#apkDes").val());
        $.ajax({
            url: _baseurl+'app/uploadAppApk.do',
            type: 'post',
            processData: false,
            data: form,
            contentType: false,
            dataType: 'json',
            success: function (res){
                insertdevice_callback(res);
            }
        });
    }

    // 新增的回调函数
    function insertdevice_callback(data) {
        message_alert(data);
        if (data.resultInfo.type == '1') {
            setTimeout("parent.closemodalwindow()", 1000);
            parent.reload();
        }
    }

</script>
</body>

</html>