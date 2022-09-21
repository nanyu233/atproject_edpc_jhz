<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/jsp/base/tag.jsp" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'csList.jsp' starting page</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

    <link rel="stylesheet" type="text/css" href="lib/easyui1.3/themes/default/easyui.css">
    <script type="text/javascript" src="lib/easyui1.3/jquery-1.8.0.min.js"></script>
    <script type="text/javascript" src="lib/easyui1.3/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="lib/avalon1.4.8/avalon.js"></script>


    <style>
      .person{
        border: 1px solid black;
        border-radius: 10px;
        width: 150px;
        height: 120px;
        text-align: center;
        display: inline-block;
        margin: 10px;
      }
      .person .name{
        height: 80px;
        line-height: 80px;
        background: #0d478f;
        color: #fff;
        border-radius: 0 0 10px 10px;
      }
      .person .bedNum{
        height: 40px;
        line-height: 40px;

      }
      .person .bedNum .num{
        font-size: 22px;
        font-weight: bold;
      }

    </style>

  </head>

  <body>
  <div style="width: 80%">
    <table id="dg"></table>
  </div>
  </body>
  <script type="text/javascript">
    $(function () {
      $('#dg').datagrid({
        url:'zyyqjs/queryqjszyy_result.do',
        queryParams: {
          'hspemginfCustom.cspgFlg': '1',
        },
        pagination: true,
        rownumbers: true,
        singleSelect:true,
        pageList:[20,30],
        columns:[[
          {field:'emgBed',title:'床号',width:70,align:'center',
            styler: function(value,row,index){
                return 'background:#3d85d0;color:#ffffff;';
            }
          },
          {field:'cstNam',title:'姓名',width:100,align:'center'},
          {field:'cstSexCod',title:'性别',width:100,align:'center'},
          {field:'cstAge',title:'年龄',width:100,align:'center'},
          {field:'preDgnCod',title:'初步诊断',width:200}
        ]],

        onClickRow: function (rowIndex, rowData) {
          var openTabUrl = '${baseurl}cs/toCsHomePage.do?emgSeq=' + rowData.emgSeq;
          parent.opentabwindow(rowData.cstNam + '-创伤信息登记', openTabUrl, '0');
        }
      });
    });
    function reload() {
      console.log("reload")
    }
  </script>
</html>
