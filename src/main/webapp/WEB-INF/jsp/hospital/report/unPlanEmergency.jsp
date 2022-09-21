<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>非计划重返抢救室率</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
</head>

<body class="median">
  <script type="text/javascript">
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryResult()
      }
    });

    function reload() {
      queryResult();
    }

    function setLayPut() {
      var height = ($("#tabs", parent.document).height()) * 0.75;
      $("#container").height(height - 67);
      $("#tabList").height(height);
    }

    $(function () {
      setTime('year', 'yyyy');
      setLayPut();
      queryResult();
      $(window).resize(function () {
        $('#tabList').datagrid('reload');
      });
    });

    function loadChart(chartDate, chartsType) {
      var series = [];
      var serArr = {
        data: [{
          'name': '重返率',
          'y': chartDate.cfl - 0,
          'num': chartDate.cfcounts - 0
        }, {
          'name': '正常出室率',
          'y': chartDate.zccsl - 0,
          'num': chartDate.zccscounts - 0
        }], name: '人数'
      };
      series.push(serArr);
      $('#container').highcharts({
        chart: {
          type: chartsType,
          zoomType: 'x',
          backgroundColor: '#e4efff'
        },
        legend: {
          align: 'right',
          floating: true,
          layout: "horizontal", //默认horizontal
          /*y: 12,*/
          itemStyle: {
            'fontSize': '12px'
          }
        },
        title: { //大标题
          text: ''
        },
        credits: { //版权信息
          enabled: false
        },
        tooltip: { //数据提示框
          pointFormat: '{series.name}:{point.num}人 <b>({point.percentage:.2f}%)</b>'
        },
        plotOptions: { //数据列配置
          pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              format: '<b>{point.name}</b>: {point.percentage:.2f} %',
              style: {
                color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
              }
            },
            showInLegend: true
          }
        },
        series: series,
      });
    }

    function loadTable(start, end) {
      var _param = getParams();
      if (_param == false) {
        return false;
      }
      publicFun.httpServer({ url: '${baseurl}zyyreport/queryFjhcfqjsl_result.do' }, _param, function (data) {
        var _totalMsg = data.resultInfo.sysdata;
        var _totalData = {
          rows: _totalMsg.emgList
        };
        $('#tabList').datagrid({
          title: "重返抢救室患者列表",
          nowrap: true,
          striped: true,
          singleSelect: true,
          idField: '1',
          data: _totalData,
          loadMsg: '',
          columns: [
            [{
              field: 'emgDat',
              title: '收治日期 ',
              width: getWidth(0.32),
              formatter: function (value, row, index) {
                return value ? publicFun.timeFormat(new Date(value), "yyyy/MM/dd hh:mm") : ""
              }
            }, {
              field: 'mpi',
              title: '病历号',
              width: getWidth(0.21)
            }, {
              field: 'cstNam',
              title: '病人姓名',
              width: getWidth(0.21)
            }, {
              field: 'cstSexCod',
              title: '性别',
              width: getWidth(0.15)
            }]
          ],
          pagination: false,
          rownumbers: true,
          toolbar: [{
            id: 'hzjl',
            text: '患者详情',
            iconCls: 'icon-hzjl',
            handler: function () {
              var row = $('#tabList').datagrid('getSelected');
              if (GridUtils.checkChecked(row)) {
                parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
              }
            }
          }, {
            id: 'btnadd',
            text: '导出',
            iconCls: 'icon-redo',
            handler: function () {
              _confirm('确定导出吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}zyyreport/exportFjhcfqjslSubmit.do' }, _param, function (res) {
                  message_alert(res);
                })
              });
            }
          }]
        });
        loadChart(_totalMsg.hspemginfCustom, 'pie');
      })
    }

    function setDateTypeShow() {
      var queryType = $("#chooseType").val();
      $(".Wdate").hide();
      $("#startDate_" + queryType).show();
      var format = $("#startDate_" + queryType).attr("format");
      setTime(queryType, format)
    }

    //根据插叙类型设置初始时间
    function setTime(type, format) {
      var today = publicFun.timeFormat(new Date(), format);
      $('#startDate_' + type).val(today);
    };

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

    //获取传给后端的参数
    function getParams() {
      var queryType = $("#chooseType").val();
      var startDate = $("#startDate_" + queryType).val();
      if (!startDate) {
        publicFun.alert('查询时间不能为空');
        return false;
      }
      var queryParams = {
        "startdate": startDate,
        "querytype": queryType
      };
      return queryParams;
    }

    //查询方法
    function queryResult() {
      loadTable();
    }
  </script>
  <form>
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <span class="form-text">&nbsp;查询方式：</span>
          <select id="chooseType" onchange="setDateTypeShow()">
            <option value="year" selected="selected">年</option>
            <option value="month">月</option>
            <option value="day">天</option>
            <!-- <option value="range">范围</option> -->
          </select>
          <span class="form-text">&nbsp;查询日期：</span>
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startDate_day"
            onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <input type="text" style="display: none;" format="yyyy/MM" class="input-date Wdate" id="startDate_month"
            onfocus="WdatePicker({dateFmt:'yyyy/MM',minDate:'2017/08/01'})">
          <input type="text" format="yyyy" class="input-date Wdate" id="startDate_year" onfocus="WdatePicker({dateFmt:'yyyy',minDate:'2017/08/01'})">
          <input type="text" style="display: none;" class="input-date Wdate" format="yyyy/MM/dd" id="startDate_range"
            onfocus="WdatePicker({dateFmt:'yyyy/MM/dd',minDate:'2017/08/01'})">
          <a href="javascript:;" id="search" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="chart_grp chartbox">
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">非计划重返抢救室率</p>
      <div id="container" class="chart_div"></div>
    </div>
    <!-- 查询列表 -->
    <div class="list_table" id="list_table">
      <table id="tabList"></table>
    </div>
  </div>
</body>

</html>