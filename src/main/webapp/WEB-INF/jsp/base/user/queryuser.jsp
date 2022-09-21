<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户管理</title>
</head>

<body>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
    <script type="text/javascript">
	    //enter按键默认触发查询
	    $(document).keydown(function(event) {
            switch (event.keyCode) {
            case 13:
                queryuser();
            }
        });
	    //加载datagrid
	    $(function() {
	        var height = 0.675 * ($("#tabs", parent.document).height() - 34 - 18);
	     	$("#userlist").height(height);
	     	 var heightrole = 0.29 * ($("#tabs", parent.document).height() - 34 - 18);
	     	$("#rolelist").height(heightrole);
	     	$("#kong").height(0.01*($("#tabs", parent.document).height() - 34 - 18))
	     	
	     	var toolbar_v;
            publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
	     	
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

	            }]
	        ];


	        var columns_role = [
		         	            [{
		         	                field: 'id',
		         	                title: '用户名称',
		         	                width: getWidth(0.2),
		         	               hidden: true,
		         	               
		         	            }, {
		         	                field: 'roleid',
		         	                title: '角色id',
		         	                width: getWidth(0.1),
		         	            },{
		         	                field: 'usrno',
		         	                title: '用户账号 ',
		         	                width: getWidth(0.1),
		         	            },  {
		         	                field: 'rolename',
		         	                title: '角色名称',
		         	                width: getWidth(0.2),
		         	            }]
		         	        ];
	        function callBack(toolbar_v) {
		        $('#userlist').datagrid({
		            nowrap: true,
		            striped: true,
		            singleSelect: true,
		            url: '${baseurl}user/queryuser_result.do?dstuserCustom.sysid=${sysid}',
		            idField: 'userid',
		            loadMsg: '',
		            columns: columns_v,
		            pagination: true,
		            rownumbers: true,
		            pageList: [20, 30, 50],
		            toolbar: toolbar_v,
		            onClickRow:function(rowIndex,rowData){
		            	 $('#rolelist').datagrid({
		            		title:"角色列表",
		     	            nowrap: true,
		     	            striped: true,
		     	            singleSelect: true,
		     	            url: '${baseurl}user/queryuserrole_result.do',
		     	            idField: 'id',
		     	            loadMsg: '',
		     	            columns: columns_role,
		     	            rownumbers: true,
		     	           	queryParams: {          
		     	        	  "dstuserroleCustom.usrno": rowData.usrno
				           } 
		     	        });
		           },
		        });
	        }
	        
       	 $('#rolelist').datagrid({
     			title:"角色列表",
	            nowrap: true,
	            striped: true,
	            singleSelect: true,
	            url: '${baseurl}user/queryuserrole_result.do',
	            idField: 'id',
	            loadMsg: '',
	            columns: columns_role,
	            rownumbers: true,
	           	queryParams: {          
	        	  "dstuserroleCustom.usrno": '1'
	           } 
	        });
	        
	    });

	    function getWidth(proportion) {
	        var width = $("#userdeleteform").parent("#Panle").width();
	        return Math.round(proportion * width);
	    }
	    //查询方法
	    function queryuser() {
	        var formdata = $("#userqueryForm").serializeJson();
	        $('#userlist').datagrid('load', formdata);
	    }

	    //删除 统一用form
	    function cmddeluser() {
	    	var node = $("#userlist").datagrid("getSelected");
	        _confirm('确定删除该数据吗？', null, function() {
	            $("#delete_userid").val(node.userid);
	            jquerySubByFId('userdeleteform', userdel_callback, null, "json");
	        });
	    }
	    //删除的回调函数
	    function userdel_callback(data) {
	        message_alert(data);
	        var type = data.resultInfo.type;
	        if (type == 1) {
	            queryuser();
	        }
	    }
	    function cmdexprotuser() {
		    _confirm('确定导出吗？', null, function() {
	            jquerySubByFId('userqueryForm', userExprot_callback, null, "json");
	        });
	    }
	    
	    //修改角色信息
	    function cmdedituser(userid) {
	    	 var node = $("#userlist").datagrid("getSelected");
		     if (GridUtils.checkChecked(node)) {
		    	// console.log(node);
	        //打开修改窗口
	       	 	createmodalwindow("修改用户信息", 870, 310, '${baseurl}user/edituser.do?userid=' + node.userid);
		     }
	    }
	    
	    function cmdadduser() {
	    	createmodalwindow("新增用户", 870, 310, '${baseurl}user/adduser.do?sysid=' + "${sysid}");
	    }
	    //用户授权
	    function cmdRoleAuth() {
	        var node = $("#userlist").datagrid("getSelected");
	        if (GridUtils.checkChecked(node)) {
	            //打开修改窗口
	            createmodalwindow("角色授权管理", 610, 400, '${baseurl}user/roleauth.do?userid=' + node.usrno);
	        }
	    }
	  //用户调配
	    function cmdallocateuser() {
	        var node = $("#userlist").datagrid("getSelected");
	        if (GridUtils.checkChecked(node)) {
	            //打开修改窗口
	            createmodalwindow("用户调配", 710, 310, '${baseurl}user/allocateuser.do?userid=' + node.userid);
	        }
	    }
	  //用户密码修改
	    function cmdeditPassword() {
	        var node = $("#userlist").datagrid("getSelected");
	        if (GridUtils.checkChecked(node)) {
	            //打开修改窗口
	            createmodalwindow("修改密码", 450,200, '${baseurl}user/editPassword.do?userid=' + node.userid);
	        }
	    }

	    //用户导出回调
	    function userExprot_callback(data) {
	        //在这里提示信息中有文件下载链接
	        message_alert(data);
	    }
    </script>
    <!-- html的静态布局 -->
    <form id="userqueryForm" name="userqueryForm" action="${baseurl}user/exportUserSubmit.do" method="post">
        <input type="hidden" id="user_sysid" name="sysid" value="${sysid}" />
        <!-- 查询条件 -->
	       <!--  <div class="form-body m-b5">
	            <div class="m-t10">
	                <ul class="querylist-ul">
	                    <li>
	                        <INPUT type="text" class="input-base total-right" id="user_usrno" name="dstuserCustom.usrno" /><span class="f-left">用户账号：</span></li>
	                    <li>
	                        <INPUT type="text" class="input-base total-right" id="user_usrname" name="dstuserCustom.usrname" /><span class="f-left">用户名称：</span></li>
	                    <li class="m-l5">
	                        <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryuser()">查询</a>
	                    </li>
	                </ul>
	                <div class="c"></div>
	            </div>
	        </div> -->
        <div class="form clr">
            <p class="form-text">用户账号：</p>
            <input id="user_usrno" type="text" name="dstuserCustom.usrno">
            <p class="form-text">用户名称：</p>
            <input id="user_usrname" type="text" name="dstuserCustom.usrname">
            <p class="form-text">角色列表：</p>
            <select  name="dstuserCustom.selrole">
            		<option value=""></option>
                <c:forEach items="${roleList}" var="value">
                    <option value="${value.roleid}">${value.rolename}</option>
                </c:forEach>
            </select>
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryuser()">查询</a>
        </div>
    </form>
    <!-- 查询列表 -->
    <div class="usertab queryTabs">
        <table id="userlist"></table>
    </div>
      <div >
        <table id="kong"></table>
    </div>
       <div class="roletab queryTabs">
        <table id="rolelist"></table>
    </div>
    <form id="userdeleteform" action="${baseurl}user/deleteuser.do" method="post">
        <input type="hidden" id="delete_userid" name="userid" />
    </form>
</body>

</html>
