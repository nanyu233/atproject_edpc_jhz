<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- 引用jquery easy ui的js库及css -->
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?v=${versionDay}" />
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?v=${versionDay}" />
    <title>apk管理</title>
</head>

<body class="queryrole">
<script type="text/javascript">

    function reload() {
        $('#dataGrid').datagrid('reload');
    }

    // 新增版本
    function cmdadd() {
        createmodalwindow("新增版本", 400, 250, '${baseurl}app/toAddAppApkPage.do');
    }

    function cmdshowDownloadUrl() {

    }

    function copyToClipboard(s){
        if(window.clipboardData){
            window.clipboardData.setData('text',s);
        }else{
            (function(s){
                document.oncopy=function(e){
                    e.clipboardData.setData('text',s);
                    e.preventDefault();
                    document.oncopy=null;
                }
            })(s);
            document.execCommand('Copy');
        }
    }

    function cmddel() {
        var node = $('#dataGrid').datagrid("getSelected");
        if (GridUtils.checkChecked(node)) {
            var apkNewFlg = node.apkNewFlg;
            if(apkNewFlg=="1"){
                $.messager.alert('提示信息',"最新版本不允许删除",'error');
                return;
            }
            _confirm('确定删除该数据吗？', null, function () {
                $("#delete_apkSeq").val(node.apkSeq);
                jquerySubByFId('deleteform', devdel_callback, null, "json");
            });
        }
    }


    function cmdedit() {
        var node = $('#dataGrid').datagrid("getSelected");
        if (GridUtils.checkChecked(node)) {
            var apkNewFlg = node.apkNewFlg;
            if(apkNewFlg=="1"){
                $.messager.alert('提示信息',"该版本为最新版本，不需要重复设置",'error');
                return;
            }
            _confirm('确定设置该版本为最新版本吗？', null, function () {
                $("#update_apkSeq").val(node.apkSeq);
                jquerySubByFId('updateform', devdel_callback, null, "json");
            });
        }
    }

    // 生成列表
    function getDataGird() {
        var toolbar_v;
        publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);

        function callBack(toolbar_v) {
            $('#dataGrid').datagrid({
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: '${baseurl}app/queryaidapk_result.do',
                idField: 'apkSeq',
                queryParams:{

                },
                loadMsg: '',
                columns: columns_v,
                pagination: true,
                rownumbers: true,
                pageList: [15, 30, 50],
                toolbar: toolbar_v
            });
        }
        var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
        $("#dataGrid").height(height);
        //datagrid列定义
        var columns_v = [
            [{
                checkbox:true
            },{
                field: 'apkSeq',
                title: '序号 ',
                hidden:true,
                width: 0
            },{
                field: 'apkId',
                title: 'appId ',
                hidden:true,
                width: getWidth(0.05)
            }, {
                field: 'apkVer',
                title: '版本号 ',
                width: getWidth(0.05)
            }, {
                field: 'apkDes',
                title: '版本描述',
                width: getWidth(0.2)
            }, {
                field: 'apkNewFlg',
                title: '是否最新',
                align: 'center',
                width: getWidth(0.05),
                formatter: function (value, row, index) {
                    if(value=='1'){
                        return '<input type="checkbox" disabled="disabled" checked="checked">'
                    }else{
                        return '<input type="checkbox" disabled="disabled">'
                    }
                }
            }, {
                field: 'crtTim',
                title: '上传时间',
                width: getWidth(0.1),
                formatter: function (value, row, index) {
                    return publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss');
                }
            }, {
                field: 'crtUsrName',
                title: '上传用户',
                width: getWidth(0.1)
            }
            ]
        ];
    }
    //加载datagrid
    $(function () {
        getDataGird();
    });

    function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
    }

    //查询方法
    function queryDataGrid() {
        var formdata = $("#devicequeryForm").serializeJson();
        $('#dataGrid').datagrid('load', formdata);
    }

    // 删除的回调函数
    function devdel_callback(data) {
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
            queryDataGrid();
        }
    }
</script>
<!-- html的静态布局 -->
<form id="devicequeryForm">
    <!-- 查询条件 -->
    <div class="form clr">
        <p class="form-text">版本号：</p>
        <input type="text" name="aidApk.apkVer" />
        <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryDataGrid()">查询</a>
    </div>
    <!-- 查询列表 -->
    <div class="list queryTabs">
        <table id="dataGrid"></table>
    </div>
</form>
<form id="deleteform" action="${baseurl}app/delAppApk.do" method="post">
    <input type="hidden" id="delete_apkSeq" name="apkSeq" />
</form>

<form id="updateform" action="${baseurl}app/updateAppApk.do" method="post">
    <input type="hidden" id="update_apkSeq" name="apkSeq" />
</form>
</body>

</html>