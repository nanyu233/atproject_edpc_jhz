<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/allocateuser.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <title>用户调配</title>
</head>

<body>
  <form class="form" id="userform" action="${baseurl}user/submitallocateuser.do" method="post">
    <input type="hidden" id="user_userid" name="dstuserCustom.userid" value="${dstuserCustom.userid}" />
    <table>
      <colgroup>
        <col width="20%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <th>用户号:</th>
          <td>
            <input type="text" id="user_usrno" name="dstuserCustom.usrno" value="${dstuserCustom.usrno}" readonly="readonly" />
          </td>
          <th>用户名称:</th>
          <td>
            <input type="text" id="user_usrname" name="dstuserCustom.usrname" value="${dstuserCustom.usrname}"
              maxlength="32" readonly="readonly" />
          </td>
        </tr>
        <tr>
          <th>所属科室:</th>
          <td colspan="3">
            <input type="text" class="li-input-l2" id="sysname" name="sysname" value="${sysname}" readonly="readonly" />
            <input type="hidden" id="user_sysid" name="dstuserCustom.sysid" value="${dstcompctl.comno}" readonly="readonly" />
          </td>
        </tr>
        <tr>
          <th>调配后所属科室:</th>
          <td colspan="3">
            <div class="div-check">
              <select type="text" id="u_sysname" class="easyui-combotree f-left">
              </select>
            </div>
            <input type="hidden" id="user_comcnameB" name="dstuserCustom.comcnameB" value="${dstcompctl.comcnameB}"
              readonly="readonly" />
            <input type="hidden" id="user_comnoB" name="dstuserCustom.comnoB" value="${dstcompctl.comnoB}" readonly="readonly" />
            <span id="check-icon" class="check-icon"></span>
            <span id="checkss" class="checkss"></span>
          </td>
        </tr>
        <tr>
          <th>备注:</th>
          <td colspan="3">
            <textarea class="div-textarea li-input-l2" id="user_remark" name="dstuserCustom.remark" maxlength="128"></textarea>
          </td>
        </tr>
        <tr>
          <td colspan="4" class="last_td">
            <div class="center grp_btn">
              <a href="#" class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="allocateUser()">确定</a>
              <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/activetech.ztree.js"></script>
  <script type="text/javascript">
    var zt;
    var rootnode;
    $(function () {
      init();
      //combotree模糊查询  

      $.extend($.fn.combotree.defaults.keyHandler, {
        up: function () {
          //console.log('up');  
        },
        down: function () {
          //console.log('down');  
        },
        enter: function () {
          //  console.log('enter');  
        },
        query: function (q) {
          var qq = $.trim(q);
          // 	console.log(qq);
          var t = $(this).combotree('tree');
          var nodes = t.tree('getChildren');;
          for (var i = 0; i < nodes.length; i++) {
            var node = nodes[i];
            if (node.text.indexOf(qq) >= 0) {
              $(node.target).show();
            } else {
              $(node.target).hide();
            }
          }
        }
      });
    });
    function init() {
      $('#u_sysname').css({ "width": "200px" })
      $('#u_sysname').combotree({
        url: '${baseurl}compctl/loadCompctlUserTreeElement.do?id=0',
        panelHeight: 150,
        editable: true,
        onClick: onclickfn,
        onBeforeExpand: onBeforeExpandfn,
        onLoadSuccess: onLoadSuccessfn
      });
    }

    function onLoadSuccessfn(node, data) {//数据加载完成绑定事件
      //collapseAll();//折叠所有按钮
      if (!rootnode) {
        rootnode = $('#u_sysname').tree("getRoot");
        if (rootnode) {
          var node = rootnode;
          var text = node.text;
          if (node.attributes && node.attributes.url) {
            var url = "${baseurl}" + node.attributes.url + "?sysid=" + node.id;
            reloadPanel(url, text);
          }
        }
      }
      $('#u_sysname').combotree("tree").tree("expandAll")

    }

    function onBeforeExpandfn(node) {//展开数据前绑定事件
      $('#u_sysname').combotree("tree").tree("options").url = "${baseurl}compctl/loadCompctlUserTreeElement.do?sysid=" + node.id;

    }
    //树点击事件
    function onclickfn(node) {//单机一个节点绑定事件
      //	console.log(node);
      var text = node.text;
      if (node.attributes && node.attributes.url) {
        var url = "${baseurl}" + node.attributes.url + "?sysid=" + node.id;
        reloadPanel(url, text);
      } else {
        zt.onclickfn(node);//默认点击是展开或关闭一个节点
      }

    }

    //用户调配
    function allocateUser() {
      var u = $("#u_sysname").combotree('tree');
      var u_sysname = u.tree('getSelected');
      var u_input = $(".combo-text").val();
      if (u_input == "") {
        $("#check-icon").show().addClass("add-error");
        $("#checkss").show().html("调配后所属科室不能为空！");
      } else {
        //	console.log(u_input);
        if (u_sysname == null) {
          if (u_input == "") {
            $("#check-icon").show().addClass("add-error");
            $("#checkss").show().html("调配后所属科室不能为空！");
          } else {
            $("#check-icon").show().addClass("add-error");
            $("#checkss").show().html("调配后所属科室无效！");
          }
        } else if (u_sysname.text == $("#sysname").val()) {
          $("#check-icon").show().addClass("add-error");
          $("#checkss").show().html("调配前后所属科室不能相同！");
        } else {
          $("#user_comcnameB").val(u_sysname.text);
          $("#user_comnoB").val(u_sysname.id);
          jquerySubByFId('userform', allocateuser_callback, null, "json");
        }
      }

    }
    //修改的回调函数
    function allocateuser_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == '1') {
        setTimeout("parent.closemodalwindow()", 1000);
        parent.queryuser();
      }
    }

    //重新加载Panel
    function reloadPanel(url, text) {
      $('#Panle').panel('open').panel('refresh', url);
    }
  </script>
</body>

</html>