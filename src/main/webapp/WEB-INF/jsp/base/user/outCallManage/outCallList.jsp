<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>用户管理</title>
</head>

<body>
	<link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css?111" />
    <script type="text/javascript">
	    //enter按键默认触发查询
	    $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                queryuser();
            }
        });
	    function cmdincall() {
	    	var indexs = []; //定义一个数组准备存放删除记录的序号
            var rows = $('#userlist').datagrid('getSelections');
            for (var i = 0; i < rows.length; i++) {
                var index = $('#userlist').datagrid('getRowIndex', rows[i]);
                //将选中行的序号放入indexs数组
                indexs.push(index);
            }
            if (rows.length > 0) {
                $("#indexs").val(indexs.join(','));
                _confirm('确定提交吗？', null, function() {
                	$("#outcall").val("2");
                    jquerySubByFId('userqueryForm', unset_callback, null, "json");
	                $('#userlist').datagrid('unselectAll');

                });
            } else {
                alert_warn("请勾选所要设置的对象");
            }
        	
		}
	    
	    function cmdoutcall() {
	    	var indexs = []; //定义一个数组准备存放删除记录的序号
            //通过jquery easyui的datagrid的getSelections函数，得到当前所选中的行（对象数组）
            var rows = $('#userlist').datagrid('getSelections');
            for (var i = 0; i < rows.length; i++) {
                var index = $('#userlist').datagrid('getRowIndex', rows[i]);
                //将选中行的序号放入indexs数组
                indexs.push(index);
            }
            if (rows.length > 0) {
                $("#indexs").val(indexs.join(','));
                _confirm('确定提交吗？', null, function() {
                	$("#outcall").val("1");
                    jquerySubByFId('userqueryForm', set_callback, null, "json");
	                $('#userlist').datagrid('unselectAll');

                });
            } else {
                alert_warn("请勾选所要设置的对象");
            }
		}
	    
		function set_callback(data){
			var result = getCallbackData(data);
			_alert(result);//显示失败明细的
			queryuser();	
	    }
 
	    function unset_callback(data){
	    	var result = getCallbackData(data);
			_alert(result);//显示失败明细的
			queryuser();
	    }

	    //加载datagrid
	    $(function() {
	        var height = 0.975 * ($("#tabs", parent.document).height() - 34 - 18);
	        $("#userlist").height(height);
	        var toolbar_v;
            publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
	        //datagrid列定义
	        var columns_v = [
	            [{
	                checkbox: true
	            }, {
	                field: 'userid',
	                hidden: true, //改列隐藏
	                formatter: function(value, row, index) {
	                    return '<input type="hidden" name="dstuserCustoms[' + index + '].userid" value="' + value + '"/>';
	                }
	            },{
	                field: 'usrno',
	                title: '用户账号 ',
	                sortable: true,
	                width: getWidth(0.08),
	            }, {
	                field: 'usrname',
	                title: '用户名称',
	                sortable: true,
	                width: getWidth(0.1)
	            }, {
	                field: 'dwmc',
	                title: '所属科室',
	                sortable: true,
	                width: getWidth(0.15),

	            } ,{
	                field: 'emgdwmc',
	                title: '出诊科室',
	                sortable: true,
	                width: getWidth(0.15),

	            }, {
	            	field : 'opt1',
	            	title : '修改出诊科室',
	            	width : getWidth(0.15),
	            	formatter: function(value,row,index){	
	            		var select_v = '<select name="dstuserCustoms['+index+'].emgsysid">';
	            		select_v+='<option value="">请选择</option>';
	            		<c:forEach items="${emgcompctllist}" var="value">
	            		select_v+=' <option value="${value.comno}">${value.comcname}</option>';
	            	</c:forEach>
	            		select_v+='</select>';
	            		//构造一个下拉框
	            		return select_v;
	            	}
	            },{
	            	field: 'outCall',
	                title: '是否出诊',
	                sortable: true,
	                width: getWidth(0.1),
	                formatter: function(value, row, index) {
	                	if(value=="1")
	                		return "已出诊";
	                	else
	                		return "未出诊";
                    }
	            }, {
	                field: 'movephone',
	                title: '移动电话',
	                sortable: true,
	                width: getWidth(0.2),

	            }]
	        ];

	        function callBack(toolbar_v) {
		        $('#userlist').datagrid({
		            nowrap: true,
		            striped: true,
		            singleSelect: true,
		            url: '${baseurl}user/queryczgluser_result.do?dstuserCustom.sysid=${sysid}',
		            idField: 'userid',
		            loadMsg: '',
		            columns: columns_v,
		            singleSelect: false,
		            selectOnCheck: true,
		            checkOnselect: true,
		            pagination: true,
		            rownumbers: true,
		            pageList: [20, 30, 50],
		            toolbar: toolbar_v
		        });
	        }
	    });

	    function getWidth(proportion) {
	        var width = $("#userqueryForm").parent("#Panle").width();
	        return Math.round(proportion * width);
	    }
	    //查询方法
	    function queryuser() {
	        var formdata = $("#userqueryForm").serializeJson();
	        $('#userlist').datagrid('load', formdata);
	    }

	    //修改出诊状态
	    function updateOutCall(indexs,outCall) {
        var data={'indexs':indexs,'outCall':outCall};
        publicFun.httpServer({ url: '${baseurl}user/updateOutCall.do' }, data, function (data) {
          if (data.flag == "error")
            publicFun.alert("出诊修改失败");
          else
            $('#userlist').datagrid("reload")
        })
	    }

	   
    </script>
    <!-- html的静态布局 -->
    <form id="userqueryForm" name="userqueryForm" action="${baseurl}user/setOutCall.do" method="post">
        <input type="hidden" id="user_sysid" name="sysid" value="${sysid}" />
        <input type="hidden" name="indexs" id="indexs">
        <input type="hidden" name="outcall" id="outcall">
        
        <div class="form clr">
            <p class="form-text">用户账号：</p>
            <input id="user_usrno" type="text" name="dstuserCustom.usrno">
            <p class="form-text">用户名称：</p>
            <input id="user_usrname" type="text" name="dstuserCustom.usrname">
            <p class="form-text">是否出诊：</p>
            <select style="width:80px" name="dstuserCustom.outCall">
             	<option value="" >请选择</option>
             	<option value="1" >已出诊</option>
             	<option value="2" >未出诊</option>
            </select>
			<p class="form-text">出诊科室：</p>
             <select id="comno" name="dstuserCustom.comno" class="li-input-s">
                <option value="">请选择</option>
                <c:forEach items="${emgcompctllist}" var="value">
                    <option value="${value.comno}">${value.comcname}</option>
                </c:forEach>
            </select>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryuser()">查询</a>
        </div>
   
    <!-- 查询列表 -->
    <div class="queryTabs m-l2">
        <table id="userlist"></table>
    </div>
     </form>
</body>

</html>
