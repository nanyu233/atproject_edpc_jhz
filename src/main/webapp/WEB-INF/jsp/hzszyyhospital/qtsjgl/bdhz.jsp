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
<style type="text/css">
  div.grp_btn {
    position: absolute;
    right: 10px;
    bottom: 5px;
  }
</style>

<body>
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
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
      $("#emg_startdate").val(_today);
      $("#emg_enddate").val(_today);
    };

    //加载datagrid
    $(function () {
      setTime();
      var heightrole = $(window).height() - 75;
      $("#rolelist").height(heightrole);
      var toolbar_v;
      var _baseurl = "${baseurl}";
      var columns_role = [
        [{
          field: 'checkbox',
          checkbox: true,
          width: getWidth(0.05)
        }, {
          field: 'qtsjNam',
          title: '群体事件',
          width: getWidth(0.1),
          formatter: function (value, row, index) {
            if (value != "" && value != null) {
              return '<span style="color:blue">' + value + '</span>';
            } else {
              return ""
            }
          }
        }, {
          field: 'qtsjSeq',
          title: '编号 ',
          hidden: true,
        }, {
          field: 'emgDat',
          title: '收治日期',
          width: getWidth(0.15),
          formatter: function (value, row, index) {
            return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
          }
        }, {
          field: 'mpi',
          title: '病历号',
          width: getWidth(0.08)
        }, {
          field: 'cstNam',
          title: '病人姓名',
          width: getWidth(0.07)
        }, {
          field: 'cstSexCod',
          title: '性别',
          width: getWidth(0.04)
        }, {
          field: 'cstAge',
          title: '年龄',
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
          width: getWidth(0.16)
        }, {
          field: 'emgDepCod',
          title: '急诊分级',
          width: getWidth(0.07)
        }, {
          field: 'cstDspCod',
          title: '首诊状态',
          width: getWidth(0.07)
        }, {
          field: 'emgFkCod',
          title: '分科',
          width: getWidth(0.11)
        }]
      ];
      var enddate = $("#emg_enddate").val(),
        startdate = $("#emg_startdate").val(),
        today = $('#today').val();


      $('#rolelist').datagrid({
        nowrap: true,
        striped: true,
        url: _baseurl + 'qtsjgl/queryemg_result.do',
        idField: 'emgSeq',
        loadMsg: '',
        queryParams: {
          "startdate": startdate,
          "enddate": enddate,
          'today': today
        },
        columns: columns_role,
        pagination: true,
        rownumbers: true,
        pageList: [20, 30, 50]
      });
    })

    function addRole() {
      var _checkList = $('#rolelist').datagrid('getChecked');
      var _checkLine = '';
      $.each(_checkList, function (idx, val) {
        _checkLine = _checkLine + val.emgSeq + ','
      })
      var _baseUrl = "${baseurl}";
      var getMsgUrl = _baseUrl + 'qtsjgl/qtsjhzbdCommit.do'
      publicFun.httpServer({ url: getMsgUrl }, { 'hspQtsjglCustom.qtsjseqContents': _checkLine, 'hspQtsjglCustom.qtsjSeq': '${qtsjSeq}' }, function (data) {
        $.messager.alert('提示信息', data.resultInfo.message, 'success');
        setTimeout("parent.closemodalwindow()", 1000);
        var qtsjSeq = data.resultInfo.sysdata.qtsjSeq;
        parent.queryrole(qtsjSeq);
      })
    }

    function queryqtsj() {
      var formdata = $("#bdhzqueryForm").serializeJson();
      $('#rolelist').datagrid('load', formdata)
    }
  </script>

  <form id="bdhzqueryForm" name="bdhzqueryForm" action="${baseurl}user/exportUserSubmit.do" method="post">
    <div class="form clr">
      <p class="form-text">时间区间：</p>
      <input class="input-date Wdate" id="emg_startdate" type="text" name="startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_enddate" type="text" name="enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">患者姓名：</p>
      <input class="input-date" type="text" name="cstNam">
      <p class="form-text">是否绑定：</p>
      <select name="qtsjFlg">
        <option value="">全部</option>
        <option value="0">未绑定</option>
        <option value="1">已绑定</option>
      </select>
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryqtsj()">查询</a>
      <input type="hidden" id="today" name="today" />
    </div>
  </form>
  <!-- 查询列表 -->
  <div class="usertab queryTabs" style="padding-left:6px">
    <table id="rolelist"></table>
    <div class="grp_btn ">
      <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="addRole()">确定</a>
      <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>

</html>