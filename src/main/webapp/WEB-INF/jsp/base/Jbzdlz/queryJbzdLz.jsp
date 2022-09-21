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
    <title>新疾病库</title>
</head>

<body class="queryhspjbzd">
    <script type="text/javascript">
        $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
            	queryhspJbzdlz();
            }
        });
        function reload() {
            $('#hspJbzdlzlist').datagrid('reload');
        }

        //加载datagrid
        $(function() {
            var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
            $("#hspJbzdlzlist").height(height);
            var toolbar_v;
            publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
            
            //datagrid列定义
            var columns_v = [
                [{
                    field: 'id',
                    title: 'id ',
                    width: getWidth(0.1),
                   
                },  {
                    field: 'jbbc',
                    title: '疾病名称',
                    width: getWidth(0.2),
                }, {
                    field: 'icd10',
                    title: 'ICD10',
                    width: getWidth(0.2),
                },{
                    field: 'pysm',
                    title: '拼音首码',
                    width: getWidth(0.2),
                },{
                    field: 'jibingtype',
                    title: '疾病类型',
                    width: getWidth(0.2),
                     formatter: function (value, row, index) {
                    if (value == 0) {
                        return "中医主症";
                    } else if(value == 1){
                        return "中医主病";
                    }else {return "西医诊断"}
                }
                }]
            ];
            function callBack(toolbar_v) {
	            $('#hspJbzdlzlist').datagrid({
	                nowrap: true,
	                striped: true,
	                singleSelect: true,
	                url: '${baseurl}jbgl/queryJbzdlz_result.do',
	                idField: 'id',
	                loadMsg: '',
	                columns: columns_v,
	                pagination: true,
	                rownumbers: true,
	                pageList: [20, 30, 50],
	                toolbar: toolbar_v
	            });
            }
        });

        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
        }

        //查询方法
        function queryhspJbzdlz() {
            var formdata = $("#hspJbzdlzqueryForm").serializeJson();
            $('#hspJbzdlzlist').datagrid('load', formdata);
        }

        //新增
        function cmdaddJbzdLz() {
            createmodalwindow("新疾病库管理", 430, 260, '${baseurl}jbgl/toadd.do', 'no');
        }

        //删除 统一用form
        function cmdremove() {
            var node = $('#hspJbzdlzlist').datagrid('getSelected');
            if (GridUtils.checkChecked(node)) {
            	deletehspJbzdlz(node.id);
            }
        }
        //删除的回调函数
        function hspjbzddel_callback(data) {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
                $('#hspJbzdlzlist').datagrid('clearSelections');
                queryhspJbzdlz();
            }
        }

        //删除 统一用form
        function deletehspJbzdlz(id) {
            _confirm('确定删除该数据吗？', null, function() {
                $("#delete_id").val(id);
                jquerySubByFId('hspjbzddeleteform', hspjbzddel_callback, null, "json");
            });
        }

       
        //修改角色信息
        function cmdupdateJbzdLz() {
            //打开修改窗口
            var node = $('#hspJbzdlzlist').datagrid('getSelected');
            if (GridUtils.checkChecked(node)) {
                var url = '${baseurl}jbgl/toupdate.do?HspJbzdLzCustom.id=' + node.id;
                createmodalwindow("修改疾病管理", 430, 270, url, 'no');
            }
        }
    </script>
    <!-- html的静态布局 -->
    <form id="hspJbzdlzqueryForm">
        <!-- 查询条件 -->
        <div class="form clr">
            <p class="form-text">新疾病库管理：</p>
            <input class="input-base total-right" type="text" id="pysm" name="HspJbzdLzCustom.pysm">
            <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryhspJbzdlz()">查询</a>
        </div>
        <!-- 查询列表 -->
        <div class="list queryTabs">
            <table id="hspJbzdlzlist"></table>
        </div>
    </form>
    <form id="hspjbzddeleteform" action="${baseurl}jbgl/deleteJbzdLz.do" method="post">
        <input type="hidden" id="delete_id" name="id" />
    </form>
</body>

</html>
