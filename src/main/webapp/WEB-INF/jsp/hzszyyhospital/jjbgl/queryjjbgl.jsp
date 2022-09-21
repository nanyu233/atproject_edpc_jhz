<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>交接班管理</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>
<body>
    <script type="text/javascript">
   
      var jjbtype="${jjbtype}"; 
      var _baseurl = "${baseurl}";
      //enter按键默认触发查询
      $(document).keydown(function(event) {
        switch (event.keyCode) {
          case 13:
            queryuser();
        }
      });
      function getWidth(proportion) {
        var width = $("body").width();
        return Math.round(proportion * width);
	    }
      function setTime() {
        var _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd');
        $('#today').val(_today);
        var myDate = new Date();
        var yyear = myDate.getFullYear();
        var mmonth = myDate.getMonth();
        var dday = myDate.getDate();
        var fivDat = new Date(yyear, mmonth, dday).getTime() - 24 * 60 * 60 * 1000;
        var lastweek = publicFun.timeFormat(new Date(fivDat), "yyyy/MM/dd");

        $("#emg_startdate").val(lastweek);
        $("#emg_enddate").val(_today);
      };

	    //加载datagrid
	    $(function() {
        setTime();
        var height = 0.5 * ($("#tabs", parent.document).height() - 34 - 18);
	     	$("#jjbgllist").height(height);
	     	 var heightrole = 0.47 * ($("#tabs", parent.document).height() - 34 - 18);
	     	$("#rolelist").height(heightrole);
        var toolbar_v;
        publicFun.ajaxVal('${moduleid}', toolbar_v, callBack);
        var columns_v = [
          [{
              field: 'qtsjSeq',
              title: '编号 ',
              hidden: true,
          },{
              field: 'jiaoDat',
              title: '交班时间 ',
              width: getWidth(0.09),
              formatter: function (value, row, index) {
                return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
              }
          }, {
              field: 'jiaoBc',
              title: '班次',
              width: getWidth(0.03),
              sortable: true,
              formatter: function (value, row, index) {
	            if (value === 'RB') {
	              return "日班";
	            }  else if (value === 'QYB') {
	              return "前夜班";
	            }  else if (value === 'HYB') {
	              return "后夜班";
	            }
              }
          },{
              field: 'jiaoPtcontent',
              title: '交班日志',
              width: getWidth(0.24)
          }, {
              field: 'jiaoWzcontent',
              title: '危重交班日志',
              width: getWidth(0.24),
          }, {
              field: 'pthzs',
              title: '普通数',
              width: getWidth(0.03),

          }, {
              field: 'wzhzs',
              title: '危重数',
              width: getWidth(0.03),

          }, {
              field: 'jiaoUsrnam',
              title: '交班人员',
              width: getWidth(0.04),

          }, {
              field: 'jieDat',
              title: '接班时间',
              width: getWidth(0.09),
              formatter: function (value, row, index) {
                return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
              }
          }, {
              field: 'jieUsrnam',
              title: '接班人员',
              width: getWidth(0.04),

          }, {
              field: 'jieContent',
              title: '接班日志',
              width: getWidth(0.1),
          }, {
              field: 'cz',
              title: '操作',
              width: getWidth(0.03),
			  formatter:function(value ,row,index){
              var str = "<span class='url-link'><a href=javascript:delJjbgl('" + row.jjbglSeq +"')>删除</a></span>"
              return str
            }
          }]
        ];
        var columns_role=[
          [{
              field: 'qtsjSeq',
              title: '编号 ',
              hidden: true,
          },{
              field: 'emgSeq',
              title: '编号 ',
              hidden: true,
          },{
            field: 'emgType',
            title: '类型',
            width: getWidth(0.03),
            sortable: true,
            formatter: function (value, row, index) {
	            if (value === 'W') {
	              return "<div class=\"levelAbg\">危重</div>";
	            }  else if (value === 'P') {
	              return "<div class=\"levelDbg\">普通</div>";
	            }
            }
          }, {
            field: 'emgDat',
            title: '收治时间',
            width: getWidth(0.09),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
            }
          }, {
            field: 'mpi',
            title: '病历号',
            width: getWidth(0.05)
          }, {
            field: 'cstNam',
            title: '患者姓名',
            width: getWidth(0.05)
          }, {
            field: 'cstSexCod',
            title: '性别',
            width: getWidth(0.02)
          }, {
            field: 'cstAge',
            title: '年龄',
            sortable: true,
            width: getWidth(0.05),
            formatter: function (value, row, index) {
              if (value != null && value != "") {
                return value + "" + row.cstAgeCod
              } else {
                return value;
              }
            }
          }, {
            field: 'preDgnCod',
            title: '主诉症状',
            width: getWidth(0.14)
          }, {
            field: 'emgDepCod',
            title: '急诊分级',
            width: getWidth(0.04),
            formatter: function (value, row, index) {
              if (value == "I级") {
                return "<div class=\"levelAbg\">I级</div>";
              } else if (value == "II级") {
                return "<div class=\"levelBbg\">II级</div>";
              } else if (value == "III级") {
                return "<div class=\"levelCbg\">III级</div>";
              } else if (value == "IVa级") {
                return "<div class=\"levelDbg\">IVa级</div>";
              } else if (value == "IVb级") {
                return "<div class=\"levelDbg\">IVb级</div>";
              }
            }
          }, {
            field: 'cstDspCod',
            title: '首诊状态',
            width: getWidth(0.05)
          }, {
            field: 'emgFkCod',
            title: '分科',
            width: getWidth(0.05)
          },{
            field: 'jbzdDes',
            title: '诊断',
            width: getWidth(0.16)
          },{
            field: 'arvChlCod',
            title: '送入方式',
            width: getWidth(0.04)
  
          }, {
            field: 'grnChl',
            title: '绿通',
            width: getWidth(0.02)
          }, {
            field: 'emgBed',
            title: '床号',
            width: getWidth(0.03)
          },{
            field: 'cstDspCodNameNew',
            title: '转归',
            width: getWidth(0.05),
            sortable: true,
            formatter: function (value, row, index) {
              if (row.firstsqlseq ==row.sqlSeq) {
                return ''
              } else if (row.cstDspCodNew == '2') {
                return row.cstDepCodNew
              } else if (row.cstDspCodNew == '13') {
                return row.sqlDes
              } else {
                return value
              }
            }
          }, {
            field: 'sqlDat',
            title: '转归时间',
            width: getWidth(0.08),
            formatter: function (value, row, index) {
              return value ? value.replace(/\//g, '-') : '';
            }
          }]
        ];
        var enddate = $("#emg_enddate").val(),
            startdate = $("#emg_startdate").val(),
            today = $('#today').val(),
            jiaoBc = $('#jiaoBc').val();
        function callBack(toolbar_v) {
          $('#jjbgllist').datagrid({
            nowrap: true,
            striped: true,
            singleSelect: true,
            url: _baseurl+'jjbgl/queryjjbgl_result.do',
            idField: 'jjbglSeq',
            loadMsg: '',
            queryParams: {
              "startdate": startdate,
              "enddate": enddate,
              'today': today,
              'hspJjbglInfCustom.jjbtype':jjbtype,
              'jiaoBc':jiaoBc
            },
            columns: columns_v,
            pagination: true,
            rownumbers: true,
            pageList: [20, 30, 50],
            toolbar: toolbar_v,
            onClickRow:function(rowIndex,rowData){
              $('#rolelist').datagrid({
                title:"交班患者",
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: _baseurl+'jjbgl/queryglhz_result.do',
                idField: 'id',
                loadMsg: '',
                columns: columns_role,
                pagination: true,
                rownumbers: true,
                pageList: [20, 30, 50],
                queryParams: {          
                  "hspJjbhzmxCustom.jjbglSeq": rowData.jjbglSeq
                } 
              });
            }
          });
        }
        $('#rolelist').datagrid({
          title:"交班患者",
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: _baseurl+'jjbgl/queryglhz_result.do',
          idField: 'id',
          loadMsg: '',
          columns: columns_role,
          pagination: true,
          rownumbers: true,
          pageList: [20, 30, 50],
          queryParams: {          
            "hspJjbhzmxCustom.jjbglSeq": '#'
          } 
        });
      })

	  function queryrole(jjbglSeq){
        $('#rolelist').datagrid('reload', {'hspJjbhzmxCustom.jjbglSeq':jjbglSeq});
      }

      function cmdjiaoban(){
        var rowData = $('#jjbgllist').datagrid('getSelected');
        if (rowData) {
          parent.opentabwindow(rowData.jiaoUsrnam + '-交班', "${baseurl}jjbgl/jiaoban.do?jjbtype="+jjbtype+"&jjbglSeq="+rowData.jjbglSeq, '0');
        }else{
          parent.opentabwindow('交班', "${baseurl}jjbgl/jiaoban.do?jjbtype="+jjbtype, '0');
        }
      }

      function cmdjieban(){
        var rowData = $('#jjbgllist').datagrid('getSelected');
        if (GridUtils.checkChecked(rowData)) {
          parent.opentabwindow(rowData.jiaoUsrnam + '-接班', "${baseurl}jjbgl/jieban.do?jjbglSeq="+rowData.jjbglSeq, '0');
        }
      }

      function delJjbgl(jjbglSeq){
    	  var row = $('#jjbgllist').datagrid('getSelected');
          $("#delete_id").val(row.jjbglSeq);  
        _confirm('确定删除交接班日志及其关联患者吗？', null, function() {
           jquerySubByFId('userdeleteform', userdel_callback, null, "json");
        })
      }

      function queryjjbgl(){
        $("#jjbgllist").datagrid("clearSelections");
        queryrole('#');
        $('#jjbtype').val(jjbtype);
        var formdata = $("#userqueryForm").serializeJson();
        var jiaoBc = $('#jiaoBc').val();
        $('#jjbgllist').datagrid('load',formdata);
      }

      function userdel_callback(data){
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          queryjjbgl();
        }
      }


    </script>
    <form id="userqueryForm" name="userqueryForm" action="${baseurl}jjbgl/queryjjbgl_result.do" method="post">
      <div class="form clr">
        <p class="form-text">时间区间：</p>
        <input class="input-date Wdate" id="emg_startdate" type="text" name="startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
        <p class="form-text">-</p>
        <input class="input-date Wdate" id="emg_enddate" type="text" name="enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
        <li>
           	<p class="form-text">班次：</p>
		    <select id="jiaoBc" name="jiaoBc" onchange="queryjjbgl()">
		      <option value="">全部</option>
		      <option value="RB">日班</option>
		      <option value="QYB">前夜班</option>
		      <option value="HYB">后夜班</option>
		    </select>
    	 </li>
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryjjbgl()">查询</a>
        <input type="hidden" id="today" name="today" />
        <input type="hidden" id="jjbtype" name="hspJjbglInfCustom.jjbtype">
      </div>
  </form>
  <!-- 查询列表 -->
  <div class="usertab queryTabs m-l2">
      <table id="jjbgllist"></table>
  </div>
  <div class="roletab queryTabs m-t2 m-l2">
      <table id="rolelist"></table>
  </div>
  <form id="userdeleteform" action="${baseurl}jjbgl/jjbglhzdeleteCommit.do" method="post">
      <input type="hidden" id="delete_id" name="seq"/>
  </form>
</body>
</html>