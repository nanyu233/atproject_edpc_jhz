<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/roleauth.css">
    <title>用户授权</title>
</head>

<body>
    <script type="text/javascript">
	    var userid = "${userid}";
	    var clickid = ""; //选中的div的id
	    function cmdclick(id) {
	        if (clickid != null && clickid != "") {
	            $("#" + clickid).css("background", "#FFF");
	        }
	        $("#" + id).css("background", "#fbed89");
	        clickid = id;
	    }
	    //单个移动 id1为移动起点，id2为移动终点，idstr1为起点的id前缀，idstr2为终点的id前缀
	    function move(id1, id2, idstr1, idstr2) {
	        var oldclick = clickid;
	        if (clickid == null || clickid == "") {
	            return;
	        }
	        if (id1 == "id_role" && clickid.indexOf("u_") >= 0) { //为左移右
	            return;
	        }
	        if (id1 == "id_userrole" && clickid.indexOf("r_") >= 0) { //为右移左
	            return;
	        }
	        var clickvalue = document.getElementById(clickid).innerText;
	        var cid = clickid.replace(idstr1, idstr2);
	        var id2HTML = document.getElementById(id2).innerHTML;
	        if (!existDiv(cid)) {
	            id2HTML += "<div id='" + cid + "' class='hov' onclick='cmdclick(this.id)' ondblclick='dbmove(event)'>" + clickvalue + "</div>";
	        }
	        document.getElementById(id2).innerHTML = id2HTML;
	        deleteDiv(oldclick);
	    }
	    //单个移动 id1为移动起点，id2为移动终点，idstr1为起点的id前缀，idstr2为终点的id前缀
	    function dbmove(e) {
	        var e = event || window.event;
	        var t =  e.srcElement ? e.srcElement : e.target;
	        var id1 = t.parentNode.id;
	        var id2, idstr1, idstr2;
	        clickid = t.id;
	        if (clickid != null && clickid != "") {
	            $("#" + clickid).css("background", "#FFF");
	        }
	        $("#" + clickid).css("background", "#fbed89");

	        var oldclick = clickid;
	        if (clickid == null || clickid == "") {
	            return;
	        }
	        if (id1 == "id_role") {
	            id2 = "id_userrole";
	            idstr1 = "r_";
	            idstr2 = "u_";
	        } else if (id1 == "id_userrole") {
	            id2 = "id_role";
	            idstr1 = "u_";
	            idstr2 = "r_";
	        }
	        if (id1 == "id_role" && clickid.indexOf("u_") >= 0) { //为左移右
	            return;
	        }
	        if (id1 == "id_userrole" && clickid.indexOf("r_") >= 0) { //为右移左
	            return;
	        }
	        var clickvalue = document.getElementById(clickid).innerText;
	        var cid = clickid.replace(idstr1, idstr2);
	        var id2HTML = document.getElementById(id2).innerHTML;
	        if (!existDiv(cid)) {
	            id2HTML += "<div id='" + cid + "' class='hov' onclick='cmdclick(this.id)' ondblclick='dbmove(event)'>" + clickvalue + "</div>";
	        }
	        document.getElementById(id2).innerHTML = id2HTML;
	        deleteDiv(oldclick);
	    }

	    //全部移动 id1为移动起点，id2为移动终点，idstr1为起点的id前缀，idstr2为终点的id前缀
	    function moveAll(id1, id2, idstr1, idstr2) {
	        var s = document.getElementById(id1);
	        del_ff(s, "#" + id1); //清理空格
	        var chils = s.childNodes; //得到s的全部子节点
	        var id2HTML = document.getElementById(id2).innerHTML;
	        for (var i = 0; i < chils.length; i++) {
	            if (chils[i].id == null || chils[i].id == "" || chils[i].id == undefined) {
	                continue;
	            }
	            var cid = chils[i].id.replace(idstr1, idstr2);
	            if (!existDiv(cid)) {
	                id2HTML += "<div id='" + cid + "' class='hov' onclick='cmdclick(this.id)'>" + chils[i].innerText + "</div>";
	            }
	        }
	        document.getElementById(id2).innerHTML = id2HTML;
	        delNodeAll(id1);
	    }

	    //是否存在DIV
	    function existDiv(id) {
	        var s = document.getElementById(id);
	        if (s) {
	            return true;
	        } else {
	            return false;
	        }
	    }
	    //删除DIV 
	    function deleteDiv(id) {
	        var my = document.getElementById(id);
	        if (my != null)
	            my.parentNode.removeChild(my);
	    }

	    //删除所有子节点
	    function delNodeAll(id) {
	        var div = document.getElementById(id);
	        var a = div.hasChildNodes();
	        while (div.hasChildNodes()) //当div下还存在子节点时 循环继续
	        {
	            div.removeChild(div.firstChild);
	        }
	    }
	    //清理空格
	    function del_ff(elem, idstr) {
	        var elem_child = elem.childNodes;
	        for (var i = 0; i < elem_child.length; i++) {
	            if (elem_child[i].nodeName == idstr && !/\s/.test(elem_child.nodeValue)) {
	                elem.removeChild(elem_child)
	            }
	        }
	    }

	    //提交
	    function cmdCommit() {
	        var chils = document.getElementById("id_userrole").childNodes; //得到s的全部子节点
	        var rolestrs = [];
	        for (var i = 0; i < chils.length; i++) {
	            if (chils[i].id == null || chils[i].id == "" || chils[i].id == undefined) {
	                continue;
	            }
	            rolestrs.push(chils[i].id.replace("u_", ""));
	        }
	        $("#user_rolestrs").val(rolestrs.join(","));
	        _confirm("确定提交吗？", null, function() {
	            jquerySubByFId('roleauthform', roleauth_callback, null, "json");
	        });
	    }
	    //回调函数
	    function roleauth_callback(data) {
	        message_alert(data);
	        if (data.resultInfo.type == '1') {
	            setTimeout("parent.closemodalwindow()", 1000);
	            parent.queryuser();
	        }
	    }
    </script>
    <form id="roleauthform" action="${baseurl}user/roleauthsubmit.do" method="post">
        <input type="hidden" id="user_userid" name="userid" value="${userid}" />
        <input type="hidden" id="user_rolestrs" name="rolestrs" />
        <li class="li-auth">
            <div id="id_role" class="auth">
                <c:forEach items="${roleList}" var="value">
                    <div id="r_${value.roleid}" class="hov" onclick="cmdclick(this.id)" ondblclick="dbmove(event)">${value.rolename}</div>
                </c:forEach>
            </div>
            <div class="auth-center">
                <input type="button" class="role-button" value="&nbsp;&gt;&nbsp;" onclick="move('id_role','id_userrole','r_','u_')" />
                <input type="button" class="role-button" value="&nbsp;&lt;&nbsp;" onclick="move('id_userrole','id_role','u_','r_')">
                <input type="button" class="role-button" value="&gt;&gt;" onclick="moveAll('id_role','id_userrole','r_','u_')" />
                <input type="button" class="role-button" value="&lt;&lt;" onclick="moveAll('id_userrole','id_role','u_','r_')" />
            </div>
            <div id="id_userrole" class="auth">
                <c:forEach items="${userroleList}" var="value">
                    <div id="u_${value.roleid}" class="hov" onclick="cmdclick(this.id)" ondblclick="dbmove(event)">${value.rolename}</div>
                </c:forEach>
            </div>
        </li>
        <center class="li-bottom">
            <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="cmdCommit()">确定</a>
            <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
        </center>
    </form>
</body>

</html>