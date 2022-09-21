<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>医嘱信息</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css?980">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/querycfjl.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/printShow/docPrint.css?55">
  <script type="text/javascript">
    var _baseUrl = '${baseurl}',
      _username = '${sessionScope.activeUser.usrname}',
      _userno = '${sessionScope.activeUser.usrno}',
      _today = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
  </script>
</head>

<body class="tabsBody queryyzxx">
  <script type="text/javascript">
    var _url = '${baseurl}zyylqblqrb/querycfxx_result.do';
    /***
     ** 布局（datagrid 表格拉伸）
     ***/
    function setLayout() {
      var windowsWidth = parent.$('#mainIfream').width(),
        windowsHeight = parent.$('#mainIfream').height();
      $('#tabList').height(windowsHeight - 165);
    }

    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryTab();
      }
    });

    /***
     ** 初始化并生成datagrid
     ***/
    function getDatagrid() {
      var today = $("#emg_end_date").val();
      var startDate = $("#emg_start_date").val();
      $('#tabList').datagrid({
        nowrap: false,
        striped: true,
        singleSelect: false,
        rownumbers: true,
        url: _url,
        queryParams: {
          "hspDocadviceInfCustom.vstCad": '${vstCad}',
          "hspDocadviceInfCustom.emgSeq": '${emgSeq}',
          "hspDocadviceInfCustom.startdate": startDate,
          "hspDocadviceInfCustom.enddate": today
        },
        idField: 'docadviceSeq',
        loadFilter: function (data) {
          if (data.resultInfo && data.resultInfo.messageCode == '109') {
            message_alert(data, function () {
              window.location.href = "${baseurl}/first.do";
            });
          }
          return data;
        },
        loadMsg: '',
        columns: [
          [{
            checkbox: true,
            rowspan: 2,
            field: 'ck'
          }, {
            field: 'docadviceSeq',
            title: 'id',
            rowspan: 2,
            hidden: true
          }, {
            field: 'docadviceDatisString',
            title: '下达时间',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.08),
            formatter: function (value, row, index) {
              return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm") : ""
            }
          }
          , { title: '医嘱', colspan: 4 },
          {
            field: 'docadviceNam',
            title: '医师签名',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.07)
          }, {
            field: 'docadviceChecknam',
            title: '核对护士签名',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.07),
            editor: { type: 'checkNameEdit' }
          }, {
            field: 'docadviceNuimdatString',
            title: '执行时间',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.11),
            editor: { type: 'nursedateEdit', field: 'docadviceNuimdat' }
          }, {
            field: 'docadviceNuimnam',
            title: '护士签名',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.07),
            editor: { type: 'usernameEdit' }
          }, {
            field: 'docadviceNuimnam2',
            title: '护士签名2',
            rowspan: 2,
            align: 'center',
            width: getWidth(0.07),
            editor: { type: 'usernameEdit' }
          }
          ],
          [
            {
              field: 'docadviceContent',
              title: '内容',
              align: 'center',
              rowspan: 1,
              width: getWidth(0.22)
            },
            {
              field: 'docadviceYyjl',
              title: '剂量',
              align: 'center',
              rowspan: 1,
              width: getWidth(0.05)
            },
            {
              field: 'docadviceWay',
              title: '用法',
              align: 'center',
              rowspan: 1,
              width: getWidth(0.05),
            },
            {
              field: 'sl',
              title: '数量',
              align: 'center',
              rowspan: 1,
              width: getWidth(0.04),
            }
          ]
        ],
        onLoadSuccess: function (res) {
          $("#tabList").parent().find("div .datagrid-header-check").children("input[type=\"checkbox\"]").eq(0).attr("style", "display:none;");
        },
      });
      var _thisWidth = $('body').width();
      $('.panel-header,.datagrid-wrap.panel-body,.easyui-panel.panel-body,.datagrid-header').css('width', '' + _thisWidth - 10 + '');
    }

    function getWidth(proportion) {
      var width = $("body").width();
      return Math.round(proportion * width);
    }

    //查询方法
    function queryTab() {
      var start = $('#emg_start_date').val();
      var end = $('#emg_end_date').val();
      if (start == null || start == '') {
        publicFun.alert("开始时间不能为空！");
        return false;
      }
      if (end == null || end == '') {
        publicFun.alert("结束时间不能为空！");
        return false;
      }
      if (start > end) {
        publicFun.alert("结束时间需大于开始时间！");
        return false;
      }
      getDatagrid()
    }

    function setTime() {
      var _startdate = publicFun.timeFormat('${emgDat}', "yyyy/MM/dd");
      var _enddate = publicFun.timeFormat('${cyrqDat}', "yyyy/MM/dd");
      if (_enddate == null || _enddate == '') {
        _enddate = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      }
      $("#emg_start_date").val(_startdate);
      $("#emg_end_date").val(_enddate);
    };
    $(function () {
      setLayout();
      setTime();
      $(window).resize(function () {
        getDatagrid();
      });
      getDatagrid();
    });

  </script>
  <form id="jcbgForm">
    <div class="form clr" style="margin:1px">
      <p class="form-text" style="font-size:14px">日期：</p>
      <input class="input-date Wdate" id="emg_start_date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <p class="form-text">-</p>
      <input class="input-date Wdate" id="emg_end_date" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
      <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryTab()">查询</a>
    </div>
  </form>
  <div class="print-body">
    <p class="title">${hospitalPlatformNameGap}</p>
    <p class="subTitle">医嘱信息</p>
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
        <span class="basic-span">
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
        </span>
      </li>
    </ul>
  </div>
  <div class="list_table list_div floatLeft printTableShow" id="check_table">
    <table id="tabList"></table>
  </div>
</body>

</html>