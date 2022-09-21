<%@ page language="java" import="java.util.*" pageEncoding="UTF8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!-- <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"> -->
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>

<head>
  <title>急诊患者趋势图</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" href="${baseurl}css/common/highcharts.css" type="text/css" />
</head>

<body>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script type="text/javascript">
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
    $(function () {
      setTime();
      setLayOut();
      queryResult();
      $(window).resize(function () {
        setLayOut();
        queryResult();
      });
    });

    function setLayOut() {
      var height = 0.75 * ($("#tabs", parent.document).height());
      $("#tabList").height(height);
      var chartHeight = height - 67;
      $("#container").height(chartHeight);
    }

    function loadChart(start,queryType,emgDepCod) {
    var categories = ['0-6', '7-17', '18-40', '41-65','66+'];
      var chart = Highcharts.chart('container', {
		chart: {
			type: 'bar'
		},
		title: {
			text: '年龄性别统计'
		},
		subtitle: {
			useHTML: true,
		},
		xAxis: [{
			categories: categories,
			reversed: false,
			labels: {
				step: 1
			}
		}, { 
			// 显示在右侧的镜像 xAxis （通过 linkedTo 与第一个 xAxis 关联）
			opposite: true, 
			reversed: false,
			categories: categories,
			linkedTo: 0,
			labels: {
				step: 1
			}
		}],
		yAxis: {
			title: {
				text: null
			},
			labels: {
				formatter: function () { 
					return Math.abs(this.value);
				}
			},
			min: -100,
			max: 100
		},
		plotOptions: {
      series: {
        stacking: 'normal'
      },
			bar: {
        dataLabels: {
          enabled: true,
          formatter: function () {
            return Highcharts.numberFormat(Math.abs(this.point.y), 0);
          },
          // allowOverlap: true, // 允许数据标签重叠
          style: {
            color: '#eee',
            fontSize: '13px',
            textOutline: "none"
          }
        }
      }
		},
		tooltip: {
			formatter: function () {
				return '<b>' + this.series.name + ', 年龄 ' + this.point.category + '</b>, 人数' + Highcharts.numberFormat(Math.abs(this.point.y), 0);
			}
		},
		series: [{
          name: '男',
          data: ''
        },{
          name: '女',
          data: ''
        }]
	});
	
      publicFun.httpServer({ url: '${baseurl}report/toAgeAndSexTjList.do' }, { 'startdate': start, 'querytype':queryType,'hspemginfCustom.emgDepCod':emgDepCod }, function (res) {
        var list = res.rows;
        var series = [];
        if(list){
        	var manData = [];
        	var womanData = [];
        	$.each(list,function(key,value){
        		manData.push(-value.zgcount);
        		womanData.push(value.hzcount);
        	});
        	chart.series[0].setData(manData);
        	chart.series[1].setData(womanData);
        }
      })
    }

    function setTime() {
      var today = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      $("#start_date").val(today);
    };

    function loadTab(start,queryType,emgDepCod) {
      var objParam = {
        'querytype': queryType,
        'startdate': start,
        'hspemginfCustom.emgDepCod': emgDepCod,
      }
      $('#tabList').datagrid({
        title: "今日就诊年龄性别统计",
        nowrap: true,
        striped: true,
        singleSelect: true,
        url: "${baseurl}report/toAgeAndSexTjList.do",
        loadMsg: '',
        queryParams: objParam,
        columns: [
          [{
            field: 'inter',
            title: '年龄 ',
            width: getWidth(0.3)
          },{
            field: 'zgcount',
            title: '男',
            width: getWidth(0.3)
          },{
            field: 'hzcount',
            title: '女',
            width: getWidth(0.3)
          }]
        ],
        pagination: false,
        rownumbers: false,
        pageList: [15, 30, 50],
        toolbar: [{
          id: '',
          text: '导出',
          iconCls: 'icon-redo',
          handler: function () {
            _confirm('确定导出吗？', null, function () {
				publicFun.httpServer({ url: '${baseurl}report/exportAgeAndSexTj_result.do' }, objParam, function (res) {
                	$.messager.alert('提示信息', res.resultInfo.message, 'success');
              	})
            });
          }
        }],
        onLoadSuccess: function (data) {
          $('#tabList').datagrid('appendRow', {
            inter: '<b>合计（人）:</b>',
            zgcount: compute("zgcount", data),
            hzcount: compute("hzcount", data)
          });
        }
      });
    }
    function compute(colName, data) {
      var rows = data.rows;
      var total = 0;
      for (var i = 0; i < rows.length; i++) {
        total += parseFloat(rows[i][colName]);
      }
      return total;
    }

    //用户导出回调
    function userExprot_callback(data) {
      //在这里提示信息中有文件下载链接
      message_alert(data);
    }

    //查询方法
    function queryResult() {
      setDateTypeShow();
    }

    function getWidth(proportion) {
      var width = $("body").width() * 0.29 - 4;
      return Math.round(proportion * width);
    }

	//设置时间
	function setDateTypeShow() {
      var queryType = $('#querytype').val();
      if (queryType == 'month') {
        var todayMonth = publicFun.timeFormat(new Date(), "yyyy/MM");
        $("#startMonth").val(todayMonth);
        $('#queryMonth').show();
        $('#queryDay').hide();
      } else {
        var todayDay = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
        $("#startDay").val(todayDay);
        $('#queryMonth').hide();
        $('#queryDay').show();
      }
      checkDatAndInit();
    }
    
    //检验数据
    function checkDatAndInit() {
      var start;
      var queryType = $("#querytype").val();
      var emgDepCod = $('#emgDepCod').val();
      if (queryType == 'day') {
        start = $("#startDay").val();
      } else {
        start = $("#startMonth").val();
      }
      if (!start) {
        publicFun.alert('时间不能为空');
        return false;
      }
      loadChart(start,queryType,emgDepCod);
      loadTab(start,queryType,emgDepCod);
    }
  </script>
  <!-- html的静态布局 -->
  <form id="jzhzqsform" name="jzhzqsform" action="${baseurl}report/exportjhz.do" method="post">
    <div class="m-b5">
      <div class="m-t10 div_h">
        <ul class="querylist-ul form_hc">
        <li>
            <p class="floatLeft">&nbsp;查询方式：</p>
            <select id="querytype" name="querytype" onchange="setDateTypeShow()">
              <option value="month">按月</option>
              <option value="day" selected="selected">按天</option>
            </select>
        </li>
          <li id="queryDay">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-date Wdate" id="startDay" onfocus="WdatePicker({dateFmt:'yyyy/MM/dd'})">
          </li>
          <li id="queryMonth">
            <p class="floatLeft">&nbsp;查询时间：</p>
            <input type="text" class="input-base short-right Wdate" id="startMonth" onfocus="WdatePicker({dateFmt:'yyyy/MM'})">
          </li>
           <li>
           	<p class="floatLeft">分级：</p>
		    <select id="emgDepCod" name="emgDepCod" onchange="checkDatAndInit()">
		      <option value="">全部</option>
		      <option value="0">I级</option>
		      <option value="1">II级</option>
		      <option value="2">III级</option>
		      <option value="3">IVa级</option>
		      <option value="4">IVb级</option>
		    </select>
    	 </li>
          <li class="m-l5">
            <a href="#" class="easyui-linkbutton" iconCls="icon-search" id="btn" onclick="queryResult()">查询</a>
          </li>
        </ul>
        <div class="c"></div>
      </div>
    </div>
    <div class="chart_grp chartbox">
      <div class="form_cat border-radius box-shadow">
        <p class="chart_title">今日就诊年龄性别统计</p>
        <div id="container" class="chart_div"></div>
      </div>
      <!-- 查询列表 -->
      <div class="list_table" id="list_table">
        <table id="tabList"></table>
      </div>
    </div>
  </form>
</body>

</html>