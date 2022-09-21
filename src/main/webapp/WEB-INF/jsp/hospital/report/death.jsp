<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <title>死亡率统计页面</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
  <link rel="stylesheet" href="${baseurl}css/hems/global.css" type="text/css" />
</head>

<body class="death">
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script type="text/javascript">
    function setLayOut() {
      var height = 0.75 * ($("#tabs", parent.document).height());
      var height2 = (height * 3) / 10;
      var height3 = height - height2;
      $("#deathList").height(height2 - 9);
      $("#emg_deathList").height(height3 - 10);
      var heightChart = height - 67;
      $("#container").height(heightChart);
    }

    function drawChart(data) {
      var chart = Highcharts.chart('container', {
        chart: { //图标配置
          type: 'pie',
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
          pointFormat: '{series.name}:{point.y}人 <b>({point.percentage:.2f}%)</b>'
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

        series: [{ //数据列
          name: '人数',
          color: '#444'
        }]
      });
      var deathCount = data.list;
      var data_2 = [];
      for (var i = 0; i < deathCount.length; i++) {
        data_2.push({
          'name': deathCount[i].name,
          'y': deathCount[i].count
        });
      }
      chart.series[0].setData(data_2);
      chart.legend.update();
    }

    function loadTabAndChart() {
      publicFun.httpServer({ url: '${baseurl}report/getDeathRate.do' }, generateParam(), function (data) {
        $('#emg_deathList').datagrid({
          title: '已死亡患者列表',
          nowrap: true,
          striped: true,
          singleSelect: true,
          data: data.hspemginfCustomList,
          idField: 'date',
          loadMsg: '',
          columns: [
            [{
              field: 'emgDatStr',
              title: '收治日期 ',
              width: getWidth(0.32),
            }, {
              field: 'mpi',
              title: '病历号',
              width: getWidth(0.25),
            }, {
              field: 'cstNam',
              title: '病人姓名',
              width: getWidth(0.25)
            }, {
              field: 'cstSexCod',
              title: '性别',
              width: getWidth(0.18)
            }]
          ],
          toolbar: [{
            id: 'hzjl',
            text: '患者详情',
            iconCls: 'icon-hzjl',
            handler: function () {
              var row = $('#emg_deathList').datagrid('getSelected');
              if (GridUtils.checkChecked(row)) {
                parent.opentabwindow(row.cstNam + "-" + '患者详情', "${baseurl}hzszyyemg/queryhzxq.do?emgSeq=" + row.emgSeq + '&xxFlag=0' + "&th=" + new Date().getTime());
              }
            }
          }, {
			id : 'hzlb',
			text : '患者列表',
			iconCls : 'icon-add',
			handler : function() {
				var pageName = 'gjhzswlhzlb';
				parent.opentabwindow('急诊患者统计列表', "${baseurl}report/jzhztjlb.do?startdate=" + $("#startDate").val() + 
				'&enddate=' + $("#endDate").val() + "&querytype=year" + "&swFlg=0" + '&pageName=' + pageName, '2');			
			}
		},{
            id: 'deathhzdc',
            text: '导出',
            iconCls: 'icon-redo',
            handler: function () {
              _confirm('确定导出吗？', null, function () {
                publicFun.httpServer({ url: '${baseurl}report/deathhzSubmit.do' }, {
                  'hz_start': $("#startDate").val(), 'hz_end': $("#endDate").val(), 'swflag': $("#swflag").val()
                }, function (res) {
                  $.messager.alert('提示信息', res.resultInfo.message, 'success');
                })
              });
            }
          }]
        });
        drawChart(data);
      })
    }

    function generateParam() {
      return { 'startdate': $("#startDate").val(), 'enddate': $("#endDate").val(), 'swflag': $("#swflag").val() }
    }

    function loadTable() {
      var paramObj = generateParam();
      $('#deathList').datagrid({
        title: '死亡率统计',
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}report/querydeath_result.do",
        queryParams: paramObj,
        idField: 'date',
        loadMsg: '',
        columns: [
          [{
            field: 'deathRate',
            title: '死亡率 ',
            width: getWidth(0.25),
          }, {
            field: 'surRate',
            title: '存活率',
            width: getWidth(0.25),
          }, {
            field: 'deathNum',
            title: '死亡人数',
            width: getWidth(0.25)
          }, {
            field: 'allNum',
            title: '患者总数',
            width: getWidth(0.25)
          }]
        ],
        toolbar: [{ //工具栏
          id: 'btnadd',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
              publicFun.httpServer({ url: '${baseurl}report/deathSubmit.do' }, paramObj, function (res) {
                $.messager.alert('提示信息', res.resultInfo.message, 'success');
              })
            });
          }
        }]
      });
    }

    function setTime() {
      var _today = publicFun.timeFormat(new Date(), "yyyy/MM");
      $("#startDate").val(_today);
      $("#endDate").val(_today);
    };

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }
    //查询方法
    function queryResult() {
      var rtnFlag = publicFun.searchTime($("#startDate").val(), $("#endDate").val());
      if (rtnFlag === false) {
        return false;
      }
      loadTabAndChart();
      loadTable();
    }
    //enter按键默认触发查询
    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 13:
          queryResult()
      }
    });
    function reload() {
      queryResult();
    }
    function init() {
      setLayOut();
      setTime();
      queryResult();
    }
    $(function () {
      init();
      $(window).resize(function () {
        setLayOut();
      });
    });
  </script>
  <form>
    <!-- 查询条件 -->
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
          <li>
            <span>&nbsp;查询条件：</span>
            <select id="swflag" name="swflag">
              <option value="">全部</option>
              <option value="0">死亡</option>
            </select>
            <span>&nbsp;查询时间：</span>
            <input type="text" class="input-base short-right Wdate" id="startDate" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
            至
            <input type="text" class="input-base short-right Wdate" id="endDate" onfocus="WdatePicker({dateFmt:'yyyy/MM'})" />
          </li>
          <li class="m-l5">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
  </form>
  <div class="chart_grp chartbox">
    <div class="form_cat border-radius box-shadow">
      <p class="chart_title">死亡率统计</p>
      <div id="container" class="chart_div"></div>
    </div>
    <!-- 查询列表 -->
    <div class="list_table deathlist_div nonumlist_table" id="list_table">
      <table id="deathList"></table>
    </div>

    <!-- 查询列表 -->
    <div class="list_table emglist_div nonumlist_table" id="list_table">
      <table id="emg_deathList"></table>
    </div>
  </div>
</body>

</html>