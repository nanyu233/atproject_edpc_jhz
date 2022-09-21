<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <title>观察项管理</title>

</head>

<body class="querygcxgl">
    <script type="text/javascript">
        //enter按键默认触发查询
        $(document).keydown(function (event) {
            switch (event.keyCode) {
                case 13:
                    querygcxgl();
            }
        });

        function reload() {
            $('#gcxglvslmtlist').datagrid('reload');
        }

        //加载datagrid
        var baseurl = "${baseurl}";
        var extraParms = "${moduleid}";
        //var bedSeq = "${bedSeq}";
        var liveNo = "${liveNo}";
        var icuCheckedData = ""; //保存当前选中行数据
        $(function () {
            var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
            $("#gcxglvslmtlist").height(height);
            //datagrid列定义
            var columns_v = [
                [{
                    field: 'liveNo',
                    title: '住院号',
                    hidden: true,
                    width: getWidth(0.1)
                }, {
                    field: 'vsCode',
                    title: '生命体征编号',
                    hidden: true,
                    width: getWidth(0.1)
                }, {
                    field: 'vsInfo',
                    title: '预警阀值名称',
                    width: getWidth(0.1)
                }, {
                    field: 'lowLmt',
                    title: '预警下限 ',
                    width: getWidth(0.1)
                }, {
                    field: 'uppLmt',
                    title: '预警上限',
                    width: getWidth(0.1)
                }, {
                    field: 'defUpp',
                    title: '预警阀值区间 ',
                    align: "center",
                    width: getWidth(0.1),
                    formatter: function(value, row, index){
                    	return row.defLow + " ~ " + row.defUpp;
                    }
                }]
            ];

            $('#gcxglvslmtlist').datagrid({
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: '${baseurl}icuvslmt/findVsLmtListGrid.do?liveNo=${liveNo}',
                loadMsg: '',
                columns: columns_v,
                pagination: true,
                rownumbers: true,
                pageList: [15, 30, 50],
                toolbar: '#tb',
                rowStyler: function (index, row) {
                    if (row.ismore != null) {
                        return 'color:red';
                    }
                },
                onClickRow: function (idx, rowData) {
                    if (icuCheckedData && icuCheckedData.vsCode === rowData.vsCode) {
                        $('#gcxglvslmtlist').datagrid("unselectRow", idx);
                        icuCheckedData = "";
                    } else {
                        $('#gcxglvslmtlist').datagrid("selectRow", idx);
                        icuCheckedData = rowData;
                    }
                }
            });
        });

        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
        }

        //查询方法
        function querygcxgl() {
            var formdata = $("#vslmtqueryform").serializeJson();
            $('#gcxglvslmtlist').datagrid('load', formdata);
        }

        //增加
        function cmdgcxgladd() {
            createmodalwindow("预警阀值新增", 500, 255, '${baseurl}icuvslmt/addVsLmt.do?liveNo=${liveNo}');
        }
        //修改
        function cmdgcxgledit() {
            var row = $('#gcxglvslmtlist').datagrid("getSelected");
            if (GridUtils.checkChecked(row)) {
                createmodalwindow("预警阀值修改", 500, 255, '${baseurl}icuvslmt/editVsLmt.do?liveNo=' + row.liveNo +
                    "&vsCode=" + row.vsCode);
            }
        }
        //删除
        function cmdgcxgldele() {
            var row = $('#gcxglvslmtlist').datagrid("getSelected");
            if (GridUtils.checkChecked(row)) {
                _confirm('您确认删除吗？', null, function () {
                    //传参设置   可多个 id多个参数
                    $("#delete_vsCode").val(row.vsCode);
                    jquerySubByFId('vslmtdeleteform', vslmtdel_callback, null, "json");
                });
            }
        }

        //删除的回调函数
        function vslmtdel_callback(data) {
            ajax_alert(data);
            var type = data.resultInfo.type;
            if (type == 1) {
                querygcxgl();
            }
        }
    </script>
    <form id="vslmtqueryform">
        <div id="tb">
            <a class="easyui-linkbutton" id="edit" plain="true" iconCls="icon-add" href="javascript:void(0);"
                onclick="cmdgcxgladd()">新增</a>
            <a class="easyui-linkbutton" id="edit" plain="true" iconCls="icon-edit" href="javascript:void(0);"
                onclick="cmdgcxgledit()">修改</a>
            <a class="easyui-linkbutton" id="edit" plain="true" iconCls="icon-cut" href="javascript:void(0);"
                onclick="cmdgcxgldele()">删除</a>
        </div>

        <!-- 查询列表 -->
        <div class="list queryTabs">
            <table id="gcxglvslmtlist"></table>
        </div>
    </form>
    <form id="vslmtdeleteform" action="${baseurl}icuvslmt/deleteVsLmtSubmit.do" method="post">
        <input id="vslmt_liveNo" type="hidden" name="liveNo" value="${liveNo}" />
        <input type="hidden" id="delete_vsCode" name="vsCode" />
    </form>
</body>

</html>