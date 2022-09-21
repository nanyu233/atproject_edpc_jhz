<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <title>导管名称列表</title>
</head>

<body>
    <form id="compctlform">
        <!-- html的静态布局 -->
        <!-- 查询条件 -->
        <div class="form clr" style="height: 25px">
            <p class="form-text">查询条件：</p>
            <input id="info" type="text" name="dstdictinfoCustom.info">
            <!--  
            <p class="form-text">科室名：</p>
            <input id="comcname" type="text" name="dstcompctlCustom.comcname">-->
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="selectCompctl()">查询</a>
        </div>
        <!-- 查询列表 -->
        <div style=" overflow: auto;">
            <table id="compctllist" style="width: 436px;height:313px; overflow: auto;margin: 0 auto"></table>
        </div>
    </form>
    <script type="text/javascript">
    $(document).keyup(function(event) {
        if (event.keyCode == 13) {
            $("#btn").trigger("click");
        }
    });
    
        //datagrid列定义
        var columns_v = [
            [{
                field: 'infocode',
                title: '导管号',
                width: 150,
                hidden: 'true'
            }, {
                field: 'info',
                title: '导管名称',
                width: 270
            }, {
                field: 'opt1',
                title: '操作',
                width: 100,
                formatter: function(value, row, index) {
                    return "<span class='url-link'><a href=javascript:selData('" + row.infocode + "','" + row.info + "')>选择</a></span>";
                }
            }]
        ];
        //加载datagrid
        $(function() {
            $('#compctllist').datagrid({
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: '${baseurl}zyyxtpg/queryduct_result.do',
                idField: '1',
                loadMsg: '',
                columns: columns_v,
                pagination: true,
                rownumbers: true,
                pageList: [10, 20, 40],
                onClickRow: function(rowIndex, rowData) { 
                    var rth = parent.$("#ducttable").find("tr").length-1;
                    parent.$("#addA"+rth+"").val(rowData.info);              
                    if (sessionStorage.getItem("isValidateFormForHzdj") === "true") {
                        setTimeout(function() {
                            parent.validateForm();
                        }, 100)
                    }
                    parent.closemodalwindow();
                }
            });
        });

        function selData(infocode, info) {
            var rth = parent.$("#ducttable").find("tr").length-1;
            parent.$("#addA"+rth+"").val(info); 
            if (sessionStorage.getItem("isValidateFormForHzdj") === "true") {
                setTimeout(function() {
                    parent.validateForm();
                }, 100)
            }
            parent.closemodalwindow();
        }

        //根据拼音编码查询数据
        function selectCompctl() {
            var formdata = $("#compctlform").serializeJson();
            $('#compctllist').datagrid('load', formdata);
        }
        $("#infocode").focus();
    </script>
</body>

</html>
