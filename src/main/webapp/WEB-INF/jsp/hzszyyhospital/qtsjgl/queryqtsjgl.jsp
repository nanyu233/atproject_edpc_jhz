<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>群体事件</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/querylist.css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
</head>
<body>
    <script type="text/javascript">
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
        var fivDat = new Date(yyear, mmonth, dday).getTime() - 24*7 * 60 * 60 * 1000;
        var lastweek = publicFun.timeFormat(new Date(fivDat), "yyyy/MM/dd");

        $("#emg_startdate").val(lastweek);
        $("#emg_enddate").val(_today);
      };

	    //加载datagrid
	    $(function() {
        setTime();
        var height = 0.5 * ($("#tabs", parent.document).height() - 34 - 18);
	     	$("#qtslist").height(height);
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
              field: 'qtsjDat',
              title: '发生时间 ',
              width: getWidth(0.12),
              formatter: function (value, row, index) {
                return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
              }
          }, {
              field: 'qtsjNam',
              title: '事件名称',
              width: getWidth(0.1)
          }, {
              field: 'qtsjType',
              title: '类型',
              width: getWidth(0.1),
          }, {
              field: 'adrr',
              title: '地点',
              width: getWidth(0.15),

          }, {
              field: 'jyjg',
              title: '简要经过',
              width: getWidth(0.25),

          }, {
              field: 'djdat',
              title: '记录时间',
              width: getWidth(0.12),
              formatter: function (value, row, index) {
                return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
              }

          }, {
              field: 'djrnam',
              title: '记录员',
              width: getWidth(0.1),

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
            field: 'emgDat',
            title: '收治日期',
            width: getWidth(0.12),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(value, 'yyyy-MM-dd hh:mm:ss') : '';
            }
          }, {
            field: 'mpi',
            title: '病历号',
            width: getWidth(0.08)
          }, {
            field: 'cstNam',
            title: '病人姓名',
            width: getWidth(0.05)
          }, {
            field: 'cstSexCod',
            title: '性别',
            width: getWidth(0.04)
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
            width: getWidth(0.22)
          }, {
            field: 'emgDepCod',
            title: '急诊分级',
            width: getWidth(0.05),
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
          }, {
            field: 'cstDspCodNameNew',
            title: '转归',
            width: getWidth(0.08),
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
          },{
            field: 'arvChlCod',
            title: '送入方式',
            width: getWidth(0.05)
  
          }, {
            field: 'grnChl',
            title: '绿色通道',
            width: getWidth(0.05)
          }, {
            field: 'action',
            title: '操作',
            width: getWidth(0.07),
            formatter:function(value ,row,index){
              var str = "<a href=javascript:unBind('" + row.emgSeq + "','"+ row.qtsjSeq +"')>解绑</a> | <a href=javascript:toEditPrecheck('" + row.cstNam + "','" + row.emgSeq + "')>修改</a>"
              return str
            }
          }]
        ];
        var enddate = $("#emg_enddate").val(),
            startdate = $("#emg_startdate").val(),
            today = $('#today').val();
        function callBack(toolbar_v) {
          $('#qtslist').datagrid({
            nowrap: true,
            striped: true,
            singleSelect: true,
            url: _baseurl+'qtsjgl/queryqtsjgl_result.do',
            idField: 'qtsjSeq',
            loadMsg: '',
            queryParams: {
              "startdate": startdate,
              "enddate": enddate,
              'today': today
            },
            columns: columns_v,
            pagination: true,
            rownumbers: true,
            pageList: [20, 30, 50],
            toolbar: toolbar_v,
            onClickRow:function(rowIndex,rowData){
              $('#rolelist').datagrid({
                title:rowData.qtsjNam+"-关联患者",
                nowrap: true,
                striped: true,
                singleSelect: true,
                url: _baseurl+'qtsjgl/queryglhz_result.do',
                idField: 'id',
                loadMsg: '',
                columns: columns_role,
                pagination: true,
                rownumbers: true,
                pageList: [20, 30, 50],
                queryParams: {          
                  "hspQtsjglCustom.qtsjSeq": rowData.qtsjSeq
                } 
              });
            }
          });
        }

        $('#rolelist').datagrid({
          title:"关联患者",
          nowrap: true,
          striped: true,
          singleSelect: true,
          url: _baseurl+'qtsjgl/queryglhz_result.do',
          idField: 'emgSeq',
          loadMsg: '',
          columns: columns_role,
          pagination: true,
          rownumbers: true,
		      pageList: [20, 30, 50],
          queryParams: {          
            "hspQtsjglCustom.qtsjSeq": '#'
          } 
        });
      })

      function queryrole(qtsjSeq){
        $('#rolelist').datagrid('reload', {'hspQtsjglCustom.qtsjSeq':qtsjSeq});
      }

      function unBind(id,qtsjid){
        _confirm('确定解绑吗？', null, function() {
          var getMsgUrl = '${baseurl}qtsjgl/qtsjhzjbCommit.do';
          publicFun.httpServer({url: getMsgUrl},{'hspQtsjglCustom.emgSeq':id,'hspQtsjglCustom.qtsjSeq':qtsjid}, function(data) {
            message_alert(data);
            var qtsjSeq = data.resultInfo.sysdata.qtsjSeq;
            setTimeout("$('.messager-body').window('close')", 1000);
            queryrole(qtsjSeq);
          })
        })
      }

      function toEditPrecheck (cstNam, emgId) {
        parent.opentabwindow(cstNam + "-" + '修改', "${baseurl}hzszyyemg/xgjz.do?emgSeq=" + emgId + "&th=" + new Date().getTime());
      }

      function cmdbdhz(){
        var row = $('#qtslist').datagrid('getSelected');
        if (GridUtils.checkChecked(row)) {
          createmodalwindow(row.qtsjNam + "-" + '绑定', 870, getCurrentBoxHeight(), "${baseurl}qtsjgl/tobdhz.do?hspQtsjglCustom.qtsjSeq=" + row.qtsjSeq + "&th=" + new Date().getTime());
        }
      }

      function queryqtsj(){
        var formdata = $("#userqueryForm").serializeJson();
        $('#qtslist').datagrid('load', formdata);
      }

      function cmdaddqtsj() {
        createmodalwindow("新增群体事件", 870, getCurrentBoxHeight(), '${baseurl}qtsjgl/toadd.do');
      }
      
      function getCurrentBoxHeight () {
        var _bdHeight = document.documentElement.clientHeight || document.body.clientHeight;
        var _tabHeight = _bdHeight - 30;
        if (_bdHeight > 650) {
          _tabHeight = 650;
        }
        return _tabHeight;
      }

      function cmdeditqtsj(){
        var row = $('#qtslist').datagrid('getSelected');
        if (GridUtils.checkChecked(row)) {
          createmodalwindow("修改群体事件", 870, getCurrentBoxHeight(), '${baseurl}qtsjgl/toupdate.do?hspQtsjglCustom.qtsjSeq='+ row.qtsjSeq);
        }
      }

      function userdel_callback(data){
        message_alert(data);
        var type = data.resultInfo.type;
        if (type == 1) {
          queryqtsj();
          queryrole('#')
        }
      }

      function cmddelqtsj(){
        var row = $('#qtslist').datagrid('getSelected');
        if (GridUtils.checkChecked(row)) {
          _confirm('确定删除该数据吗？', null, function() {
              $("#delete_id").val(row.qtsjSeq);
	            jquerySubByFId('userdeleteform', userdel_callback, null, "json");
          })
        }
      }

    </script>
    <form id="userqueryForm" name="userqueryForm" action="${baseurl}user/exportUserSubmit.do" method="post">
      <div class="form clr">
        <p class="form-text">时间区间：</p>
        <input class="input-date Wdate" id="emg_startdate" type="text" name="startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
        <p class="form-text">-</p>
        <input class="input-date Wdate" id="emg_enddate" type="text" name="enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
        <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryqtsj()">查询</a>
        <input type="hidden" id="today" name="today" />
      </div>
  </form>
  <!-- 查询列表 -->
  <div class="usertab queryTabs">
      <table id="qtslist"></table>
  </div>
  <div class="roletab queryTabs m-t2">
      <table id="rolelist"></table>
  </div>
  <form id="userdeleteform" action="${baseurl}qtsjgl/deleteqtsj.do" method="post">
      <input type="hidden" id="delete_id" name="hspQtsjglCustom.qtsjSeq" />
  </form>
</body>