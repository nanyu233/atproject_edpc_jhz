<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>急诊科会诊院内统计</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
</head>

<body class="nbyabn">
  <script type="text/javascript">
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          reload()
      }
    });

    function setLayOut() {
      var height = 0.75 * ($("#tabs", parent.document).height() - 60);
      $("#tabList").height(height + 75);
      var heightChart = height - 67;
      $("#container").height(heightChart);
    }

    function btnExport() {
      publicFun.httpServer({ url: '${baseurl}zyyreport/hspcstSubmit.do' }, generateParam(), function (res) {
        $.messager.alert('提示信息', res.resultInfo.message, 'success');
      })
    }

    function setTime() {
      $('#year_date').val(publicFun.timeFormat(new Date(), 'yyyy'));
      $('#day_date').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd'));
      $('#mon_date').val(publicFun.timeFormat(new Date(), 'yyyy/MM'));
    }

    //datagrid列定义
    function colcus() {
      var columns_v = [
        [{
          field: 'querydate',
          title: '查询时间',
          width: getWidth(0.22)
        }, {
          field: 'invitationDep',
          title: '会诊科室',
          width: getWidth(0.30)
        }, {
          field: 'avgtime',
          title: '会诊平均时间',
          width: getWidth(0.26)
        }, {
          field: 'zgcount',
          title: '会诊次数',
          width: getWidth(0.18)
        }]
      ];
      return columns_v;
    }

    function getData(objParam) {
      publicFun.httpServer({ url: '${baseurl}zyyreport/queryjzkhzyntj_result.do' }, objParam, function (data) {
        var msg = data.msg;
        var firstCount, firstAvgTime, secondCount, secondAvgTime;
        var startDate = objParam.startdate, queryType = objParam.querytype;
        if (queryType == 'halfyear') {
          firstCount = msg.countList[0].zgcount;
          firstAvgTime = msg.countList[0].avgtime;
          secondCount = msg.countList[1].zgcount;
          secondAvgTime = msg.countList[1].avgtime;
        } else {
          firstCount = msg.countList[0].zgcount;
          firstAvgTime = msg.countList[0].avgtime;
        }
        $('#tabList').datagrid({
          title: '急诊科会诊院内统计图',
          nowrap: true,
          striped: true,
          singleSelect: true,
          toolbar: [{
            id: '',
            text: '导出',
            iconCls: 'icon-redo',
            handler: function () {
              _confirm('确定导出吗？', null, function () {
                btnExport()
              });
            }
          },{
            id: '',
            text: '会诊明细列表',
            iconCls: 'icon-add',
            handler: function () {
            	hzDetail()
            }
          }],
          data: msg.consultationlist,
          onLoadSuccess: function (data) {
            loadChart(data.rows, 'column');
            if (queryType == 'halfyear') {
              $('#tabList').datagrid('insertRow', {
                index: data.rows.length / 2,
                row: {
                  querydate: startDate + '上半年',
                  invitationDep: '<b>合计:</b>',
                  avgtime: firstAvgTime,
                  zgcount: firstCount
                }
              });
              $('#tabList').datagrid('appendRow', {
                querydate: startDate + '下半年',
                invitationDep: '<b>合计:</b>',
                avgtime: secondAvgTime,
                zgcount: secondCount
              });
            } else {
              $('#tabList').datagrid('appendRow', {
                querydate: startDate,
                invitationDep: '<b>合计:</b>',
                avgtime: firstAvgTime,
                zgcount: firstCount
              });
            }
          },
          idField: 'invitationDep',
          queryParams: objParam,
          loadMsg: '',
          columns: colcus()
        });
        $("#msg").html("");
        $('#halfMsg').html("");
        if (queryType == 'year' || queryType == 'month' || queryType == 'day') {
          var textS1Msg = '', textS2Msg = '';
          for (var i = 0; i < msg.countList.length; i++) {
            textS1Msg += "<p>急诊科会诊次数:<i class=\"point\">" + msg.countList[i].zgcount + "</i>次</p>";
          }
          for (var i = 0; i < msg.countList.length; i++) {
            textS2Msg += "<p>会诊平均时间:<i class=\"point\">" + msg.countList[i].avgtime + "</i>分</p>";
          }
          $("#msg").html(textS2Msg + textS1Msg);
        } else {
          var textHalf = "<p class=\"titlebold\"><i class=\"point\">" + startDate + "</i>年上半年:</p>";
          var textS1, textS2;
          textS1 = "<span class= \"listspan\">急诊科会诊次数:<i class=\"point\">" + msg.countList[0].zgcount + "</i>次</span>";
          textS2 = "<span class= \"listspan\">会诊平均时间:<i class=\"point\">" + msg.countList[0].avgtime + "</i>分</span>";
          var textHalf2 = "<p class=\"titlep titlebold\"><i class=\"point\">" + startDate + "</i>年下半年:</p>";
          var textX1, textX2;
          textX1 = "<span class= \"listspan\">急诊科会诊次数:<i class=\"point\">" + msg.countList[1].zgcount + "</i>次</span>";
          textX2 = "<span class= \"listspan\">会诊平均时间:<i class=\"point\">" + msg.countList[1].avgtime + "</i>分</span>";
          $('#halfMsg').html("<div class= \"halftitle\">" + textHalf + textS2 + textS1 + "</div>" + "<div class= \"halftitle\">" + textHalf2 + textX2 + textX1 + "</div>");
        }
      })
    }

    function Person(name, data, stack) {
      this.name = name;
      this.data = data;
      this.stack = stack;
    }

    function loadChart(chartData, chartsType) {
      var seriesOne, seriesData = null
      var categoriesArr = [], nameArr = [], seriesArr = [];
      for (var i = 0; i < chartData.length; i++) {
        categoriesArr.push(chartData[i].invitationDep);
        if ($.inArray(chartData[i].querydate, nameArr) < 0) {
          if (seriesData != null) {
            seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
            seriesArr.push(seriesOne);
          }
          nameArr.push(chartData[i].querydate);
          seriesData = [];
        }
        seriesData.push(chartData[i].avgtime);
      }
      if (chartData.length == 0) {
        var start = generateParam().startdate;
        nameArr.push(start);
      }
      seriesOne = new Person(nameArr[nameArr.length - 1], seriesData, "male");
      seriesArr.push(seriesOne);
      $('#container').highcharts({
        chart: {
          type: chartsType,
          backgroundColor: '#e4efff'
        },
        title: {
          text: ''
        },
        xAxis: {
          categories: categoriesArr
        },
        yAxis: {
          min: 0,
          allowDecimals: false,
          title: {
            text: '会诊平均时间（分）'
          }
        },
        legend: {
          itemStyle: {
            'fontSize': '12px'
          }
        },
        tooltip: {
          fheaderFormat: '<span style="font-size:10px">{point.key}</span><table>',
          pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.0f} 分</b></td></tr>',
          footerFormat: '</table>',
          shared: true,
          useHTML: true
        },
        plotOptions: {
          column: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
              style: {
                textShadow: '0 0 3px black'
              }
            },
            showInLegend: true
          }
        },
        credits: {
          enabled: false
        },
        series: seriesArr
      });
    }

    function generateParam() {
      var startTime;
      var dateType = $('#querytype').val();
      if (dateType === 'day') {
        startTime = $('#day_date').val();
      } else if (dateType === 'halfyear' || dateType === 'year') {
        startTime = $('#year_date').val();
      } else {
        startTime = $('#mon_date').val();
      }
      var rtnObj = {};
      if (dateType === 'halfyear') {
        rtnObj = { 'querytype': dateType, 'startdate': startTime, 'enddate': startTime - 0 + 1, 'halfdate': startTime }
      } else {
        rtnObj = { 'querytype': dateType, 'startdate': startTime, 'enddate': startTime }
      }
      return rtnObj
    }
    //查询方法
    function queryResult() {
      var queryParam = generateParam();
      if (!queryParam.startdate) {
        publicFun.alert('开始时间不能为空');
        return false;
      }
      getData(queryParam);
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

    function setDateTypeShow() {
      var queryType = $('#querytype').val();
      if (queryType === 'day') {
        $('.queryCondition').hide();
        $('#queryDay').show();
      } else if (queryType === 'halfyear' || queryType === 'year') {
        $('.queryCondition').hide();
        $('#queryYear').show();
      } else {
        $('.queryCondition').hide();
        $('#queryMonth').show();
      }
      setTime();
    }
    function reload() {
      queryResult();
    }

	//会诊明细列表
	function hzDetail(){
	 var allMsgParam = generateParam();
        var startdate, enddate,queryType;
        startdate = allMsgParam.startdate;
        enddate = allMsgParam.enddate;
        queryType = allMsgParam.querytype;
        if (!startdate) {
          publicFun.alert('开始时间不能为空');
          return false;
        }
		parent.opentabwindow("会诊明细列表",'${baseurl}zyyreport/hzmxlb.do?startdate=' + startdate + '&enddate=' + enddate + '&querytype='+queryType+'&pageName=hzmxlb'+'&moduleid=1927234a4a4b669f65c2242e2d0a08', '2');
	}

    $(function () {
      setDateTypeShow();
      setLayOut();
      queryResult();
    })
  </script>
  <form>
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <p class="floatLeft">&nbsp;查询方式：</p>
            <select id="querytype" name="querytype" onchange="setDateTypeShow()">
              <option value="year" selected="selected">按年</option>
              <option value="halfyear">按半年</option>
              <option value="month">按月</option>
              <option value="day">按天</option>
            </select>
          </li>
          <li id="queryYear" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="year_date" onfocus="WdatePicker({dateFmt:'yyyy'})">
          </li>
          <li id="queryMonth" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="mon_date" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
          </li>
          <li id="queryDay" class="queryCondition">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-date Wdate" id="day_date" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
          </li>
          <li class="m-l5">
            <a href="#" id="search" onclick="reload()" class="easyui-linkbutton" iconCls="icon-search" id="btn">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="chart_grp">
    <div class="textDiv border-radius box-shadow" id="textDiv" style="_width:65.5%;">
      <div class="msg" id="msg"></div>
      <div class="halfmsg" id="halfMsg"></div>
    </div>
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">急诊科会诊平均时间统计图</p>
      <div id="container" class="chart_div"></div>
    </div>
    <div class="list_table list_div tab_lv nonumlist_table" id="list_table">
      <table id="tabList"></table>
    </div>
  </div>
</body>

</html>