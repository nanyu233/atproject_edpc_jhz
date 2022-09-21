<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <script>
        var _userid = '${userid}';
    </script>
    <title>用户签名</title>
</head>

<body>
    <form id="userqueryForm">
       <div class="form clr">
            <p class="form-text">查询条件：</p>
            <input id="user_usrno" type="text" name="dstuserCustom.queryLike" placeholder="工号/用户名/拼音简写">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryuser()">查询</a>
            <a href="#" class="easyui-linkbutton" onclick="cleanUser()">清空签名</a>
        </div>
        <div class="usertab">
            <table id="userlist"></table>
        </div>
    </form>
    <script type="text/javascript">
        $(document).keyup(function(event) {
            if (event.keyCode == 13) {
                $("#btn").trigger("click");
            }
        });
        // 清空签名
        function cleanUser () {
            if(_userid == 'usrname'){
                parent.usrname.target.val('');
            }else if(_userid == 'checkName'){
                parent.checkName.target.val('');
            }
            parent.closemodalwindow(); 
        }
        //datagrid列定义
        var columns_v = [
                [{
                    field: 'usrno',
                    title: '用户账号 ',
                    width: getWidth(0.1),
                }, {
                    field: 'usrname',
                    title: '用户名称',
                    width: getWidth(0.2)
                }, {
                    field: 'userstate',
                    title: '状态',
                    width: getWidth(0.1),
                }, {
                    field: 'movephone',
                    title: '移动电话',
                    width: getWidth(0.15),

                }, {
                    field: 'groupname',
                    title: '用户分组',
                    width: getWidth(0.1),

                }, {
                    field: 'dwmc',
                    title: '所属单位',
                    width: getWidth(0.15),

                }, {
                field: 'opt1',
                title: '操作',
                width: 100,
                formatter: function(value, row, index) {
                    return "<span class='url-link'><a href=javascript:selData('" + row.comno + "','" + row.comcname + "')>选择</a></span>";
                }
            }]
        ];
        //加载datagrid
        $(function() {
            $('#userlist').datagrid({
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: '${baseurl}user/queryuser_result.do',
                idField: '1',
                loadMsg: '',
                columns: columns_v,
                pagination: true,
                rownumbers: true,
                pageList: [10, 20, 40],
                onClickRow: function(rowIndex, rowData) {
                    if(_userid == 'usrname'){
                        parent.usrname.target.val(rowData.usrname);
                    }else if(_userid == 'checkName'){
                        parent.checkName.target.val(rowData.usrname);
                    }
                    parent.closemodalwindow(); 
                }

            });
        });

        function getWidth(proportion) {
            var width = $("body").width();
            return Math.round(proportion * width);
        }
        
        function selData(comno, comcname) {
            //转归页面
            parent.$("#emg_sqlDepCod").val(comno);
            //接收病人页面
            parent.$("#emg_emgFkCod").val(comno);
            parent.$("#emg_emgFkName").val(comcname);
            parent.closemodalwindow();

        }

      //查询方法
        function queryuser() {
            var formdata = $("#userqueryForm").serializeJson();
            $('#userlist').datagrid('load', formdata);
        }
        
        $("#comno").focus();
    </script>
</body>

</html>

