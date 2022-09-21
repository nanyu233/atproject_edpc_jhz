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
    <title>疾病诊断</title>
</head>

<body class="queryhspjbzd">
    <script type="text/javascript">
        $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
            	queryhspcbyx();
            }
        });
        function reload() {
            $('#hspcbyxlist').datagrid('reload');
        }

        //加载datagrid
        $(function() {
            var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
            $("#hspcbyxlist").height(height);
            
            var toolbar_v;
            publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
            
            //datagrid列定义
            var columns_v = [
                [{
                    field: 'id',
                    title: 'id ',
                    width: getWidth(0.2),
                    hidden: 'true',
                },  {
                    field: 'cbyx',
                    title: '主诉症状',
                    width: getWidth(0.15),
                }, {
                    field: 'pysm',
                    title: '拼音首码',
                    width: getWidth(0.15),
                },{
                    field: 'yjdjname',
                    title: '分级',
                    width: getWidth(0.15),
                },{
                    field: 'brqxname',
                    title: '去向',
                    width: getWidth(0.15),
                },{
                    field: 'fzksname',
                    title: '就诊科室',
                    width: getWidth(0.15),
                },{
                    field: 'memo',
                    title: '备注',
                    width: getWidth(0.15),
                }
                ]
            ];
            function callBack(toolbar_v) {
	            $('#hspcbyxlist').datagrid({
	                nowrap: true,
	                striped: true,
	                singleSelect: true,
	                url: '${baseurl}firstimp/queryCbyxgl_result.do',
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
        function queryhspcbyx() {
            var formdata = $("#hspjbzdqueryForm").serializeJson();
            $('#hspcbyxlist').datagrid('load', formdata);
        }

        //新增
        function cmdaddcbyx() {
            createmodalwindow("主诉症状管理", 430, 300, '${baseurl}firstimp/toadd.do', 'no');
        }

        //删除 统一用form
        function cmdremove() {
            var node = $('#hspcbyxlist').datagrid('getSelected');
            if (GridUtils.checkChecked(node)) {
            	deletehspcbyx(node.id);
            }
        }
        //删除的回调函数
        function hspjbzddel_callback(data) {
            message_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
                $('#hspcbyxlist').datagrid('clearSelections');
                queryhspcbyx();
            }
        }

        //删除 统一用form
        function deletehspcbyx(id) {
            _confirm('确定删除该数据吗？', null, function() {
                $("#delete_id").val(id);
                jquerySubByFId('hspjbzddeleteform', hspjbzddel_callback, null, "json");
            });
        }

        //修改角色信息
        function cmdeditcbyx() {
            //打开修改窗口
            var node = $('#hspcbyxlist').datagrid('getSelected');
            if (GridUtils.checkChecked(node)) {
                var url = '${baseurl}firstimp/toupdate.do?HspCbyxglInfCustom.id=' + node.id;
                createmodalwindow("修改主诉症状", 430, 300, url, 'no');
            }
        }
    </script>
    <!-- html的静态布局 -->
    <form id="hspjbzdqueryForm">
        <!-- 查询条件 -->
        <div class="form clr">
            <p class="form-text">主诉症状：</p>
            <input class="input-base total-right" type="text" id="pysm" name="HspCbyxglInfCustom.pysm">
            <p class="form-text">就诊科室：</p>
            <select name="hspCbyxglInfCustom.fzks" class="departments">
              <option value="">请选择</option>
              <c:forEach items="${jzkscompctlList}" var="value">
                <option value="${value.comno}">${value.comcname}</option>
              </c:forEach>
            </select>
            <a href="javascript:;" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryhspcbyx()">查询</a>
        </div>
        <!-- 查询列表 -->
        <div class="list queryTabs">
            <table id="hspcbyxlist"></table>
        </div>
    </form>
    <form id="hspjbzddeleteform" action="${baseurl}firstimp/deletehspcbyx.do" method="post">
        <input type="hidden" id="delete_id" name="id" />
    </form>
</body>

</html>
