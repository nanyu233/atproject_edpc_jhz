<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>检查报告</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
</head>

<body class="examinebody tabsBody">
  <script type="text/javascript">
    function setLayout() {
      var windowsWidth = parent.$('#mainIfream').width(),
        windowsHeigt = parent.$('#mainIfream').height();
      $('#jcbglist').height(windowsHeigt - 155);
    }
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryjcbg();
      }
    });
    //datagrid列定义
    var columns_v = [
      [{
        field: 'lsh',
        title: 'id',
        width: getWidth(0.14),
        hidden: true
      }, {
        field: 'ylmc',
        title: '检查项目 ',
        width: getWidth(0.12),
        formatter:function(value,row,index){
                if(value == ''||value == null){
                    return "病理检查报告"
                }
            }
      }, {
        field: 'jcjg',
        title: '检查结论',
        width: getWidth(0.3)
      }, {
        field: 'see',
        title: '检查描述',
        width: getWidth(0.30)
      }, {
        field: 'jcysxm',
        title: '报告医生',
        width: getWidth(0.05)
      }, {
        field: 'examineDocName',
        title: '审核医生',
        width: getWidth(0.05)
      }, {
        field: 'shrq',
        title: '报告时间',
        width: getWidth(0.08),
        formatter: function (value, row, index) {
          return value ? publicFun.timeFormat(value, 'yyyy/MM/dd hh:mm:ss') : '';
        }
      }]
    ];

    function init() {
      var today = $("#emg_enddate").val();
      var startdate = $("#emg_startdate").val();
      $('#jcbglist').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: true,
        rownumbers: true,
        url: '${baseurl}zyylqblqrb/queryjcbg_result.do',
        queryParams: {
          "vHemsJcjgCustom.zyh": '${MPI}',
          "vHemsJcjgCustom.startdate": startdate,
          "vHemsJcjgCustom.enddate": today
        },
        idField: 'lsh',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: columns_v,
        //pagination: true,
        //rownumbers: true,
        pageList: [15, 30, 50],
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 15 + '');
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryjcbg() {
      var start = $('#emg_startdate').val();
      var end = $('#emg_enddate').val();
      var rtnVal = publicFun.searchTime(start, end);
      if (rtnVal == false) {
        return false
      }
      var formdata = $("#jcbgForm").serializeJson();
      $('#jcbglist').datagrid('load', formdata);
    }

    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
      var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
      if (_enddate == null || _enddate == '') {
        _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      }
      $("#emg_startdate").val(_startdate);
      $("#emg_enddate").val(_enddate);
    };
    $(function () {
      setLayout();
      setTime();
      init();
      $(window).resize(function () {
        init();
      });
    });
  </script>
  <form id="jcbgForm">
    <input type="hidden" id="zyh" name="vHemsJcjgCustom.zyh" value="${MPI}" />
    <div class="form clr">
      <p class="form-text">日期：</p>
      <input class="input-date Wdate" id="emg_startdate" type="text" name="vHemsJcjgCustom.startdate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_enddate" type="text" name="vHemsJcjgCustom.enddate" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryjcbg()">查询</a>
    </div>
    <!-- 查询列表 -->
  </form>
  <div class="print-body">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">检查报告</p>
    <ul class="print-ul">
      <li class="bordered">
        <span class="basic-span">
          <label class="title-label">姓名：</label>
          <span>${hspemginfCustom.cstNam}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">性别：</label>
          <span>${hspemginfCustom.cstSexCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">年龄：</label>
          <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
        </span>
        <%--<span class="basic-span">
          <label class="title-label">科别：</label>
          <span id="_emgFkCod">${hspemginfCustom.emgFkCod}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">病历号：</label>
          <span id="_mpi">${hspemginfCustom.mpi}</span>
        </span>
        <span class="basic-span">
          <label class="title-label">留观号：</label>
          <span id="_lgh">${hspemginfCustom.observationCode}</span>
        </span>--%>
      </li>
    </ul>
  </div>
  <div class="list_table list_div floatLeft printTableShow" id="check_table">
    <table id="jcbglist"></table>
  </div>
</body>

</html>