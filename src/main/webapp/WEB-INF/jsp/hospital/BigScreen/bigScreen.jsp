<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>大屏幕-${hospitalPlatformName}（急诊科）</title>
  <link href="${baseurl}lib/bootstrap3.3.7/css/bootstrap.css" rel="stylesheet" type="text/css" />
  <link rel="shortcut icon" type="image/x-icon" href="${baseurl}images/hzszyyhems/favicon.gif">
  <!-- <script src="http://apps.bdimg.com/libs/html5shiv/3.7/html5shiv.min.js"></script>
    <script src="http://apps.bdimg.com/libs/respond.js/1.4.2/respond.min.js"></script> -->
  <script type="text/javascript" src="${baseurl}js/public.js"></script>
  <script src="${baseurl}js/bigScreen/html5shiv.min.js"></script>
  <script src="${baseurl}js/bigScreen/respond.min.js"></script>
  <script src="${baseurl}js/websocket/reconnecting-websocket.min.js"></script>
  <link href="${baseurl}css/common/bigScreen/animate.css" rel="stylesheet" type="text/css" />
  <link href="${baseurl}css/common/bigScreen/bigScreen.css???d" rel="stylesheet" type="text/css" />
  <script>
    var todayNum = "${highChartsDemoCustom.rscount}";
  </script>
</head>

<body>
  <input type="hidden" id="emg_start_date" />
  <input type="hidden" id="emg_end_date" />
  <!-- <div class="title-box"> -->
  <center class="title">
    <span id="currentTime" class="title_time"></span>
    <!-- <img src="${baseurl}images/common/bigScreen/title_hzszyy.png" class="title_img"> -->
    <div class="title_div">
      <img src="${baseurl}images/common/bigScreen/left.png">
      <span>浙江医院${wristbandName}院区--今日就诊</span>
      <img src="${baseurl}images/common/bigScreen/right.png">
    </div>
    <div class="fullScreenBtn">
      <img class="fullScreen" src="${baseurl}images/common/bigScreen/fullScreen.png" alt="" title="全屏">
      <img class="exitFullScreen" src="${baseurl}images/common/bigScreen/exitFullScreen.png" alt="" title="退出">
    </div>
  </center>
  <!-- </div> -->
  <div class="container-fluid">
    <div class="row">
      <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
        <div class="half-div right-gap">
          <div class="echart-content half-echart-content">
            <div id="container_emptyPie1"></div>
            <div class="num_div num_div1">今日绿色通道人数&nbsp;&nbsp;<i id="lstdCount"></i></div>
          </div>
        </div>
        <div class="half-div">
          <div class="echart-content half-echart-content">
            <div id="container_emptyPie2"></div>
            <div class="num_div num_div2">今日会诊人数&nbsp;&nbsp;<i id="hzCount"></i></div>
          </div>
        </div>
        <div class="half-div top-gap right-gap">
          <div class="echart-content half-echart-content">
            <div id="container_emptyPie3"></div>
            <div class="num_div num_div3">今日住院人数&nbsp;&nbsp;<i id="dayInHospital"></i></div>
          </div>
        </div>
        <div class="half-div top-gap">
          <div class="echart-content half-echart-content">
            <div id="container_emptyPie4"></div>
            <div class="num_div num_div3">今日死亡人数&nbsp;&nbsp;<i id="deathCount"></i></div>
          </div>
        </div>
        <div class="echart-content small-echart-content top-gap full-div">
          <div class="corner-top-left"></div>
          <div class="corner-top-right"></div>
          <div class="corner-bottom-left"></div>
          <div class="corner-bottom-right"></div>
          <img class="table-title" src="${baseurl}images/common/bigScreen/monthEmg.png">
          <div class="tableDiv" id="sent-order">
            <ul>
              <li class="firstli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/emgNumber.png" /><span class="smalltitle">月急诊人数</span>
                <i class="num" id="yjzrs"></i>
              </li>
              <li class="secondli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/hospitalNumber.png" /><span class="smalltitle">月留抢人数</span>
                <i class="num" id="ylqcount"></i>
              </li>
              <li class="thirdli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/strandedTime.png" /><span class="smalltitle">月抢救室滞留时间(时)</span>
                <i class="num" id="qjzwscount"></i>
              </li>
              <li class="fourli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/averageTime.png" /><span class="smalltitle">月会诊平均时间(分)</span>
                <i class="num" id="yhzavgtime"></i>
              </li>
              <li class="fiveli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/emgNumber.png" /><span class="smalltitle">月胸痛人数</span>
                <i class="num" id="xtCount"></i>
              </li>
              <li class="sixli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/hospitalNumber.png" /><span class="smalltitle">月卒中人数</span>
                <i class="num" id="czCont"></i>
              </li>
              <li class="sixli">
                <img class="iconImg" src="${baseurl}images/common/bigScreen/hospitalNumber.png" /><span class="smalltitle">月创伤人数</span>
                <i class="num" id="csCount"></i>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
        <div class="three-part">
          <div class="echart-content part-content-hth">
            <p>今日就诊</p>
            <p class="big_num" id="rscount"></p>
          </div>
        </div>
        <div class="three-part mar-gap">
          <div class="echart-content part-content-hth">
            <p>今日留抢</p>
            <p class="big_num" id="jrlqcount"></p>
          </div>
        </div>
        <div class="three-part">
          <div class="echart-content part-content-hth">
            <p>今日发热</p>
            <p class="big_num" id="dayHeat"></p>
          </div>
        </div>
        <div class="echart-content middle-echart-content full-div">
          <h4 class="chart-title-text">今日各级患者比例</h4>
          <div class="corner-top-left"></div>
          <div class="corner-top-right"></div>
          <div class="corner-bottom-left"></div>
          <div class="corner-bottom-right"></div>
          <div id="container_pie">
          </div>
        </div>
        <div class="echart-content small-echart-content top-gap full-div">
          <h4 class="chart-title-text">24小时就诊分布</h4>
          <div class="corner-top-left"></div>
          <div class="corner-top-right"></div>
          <div class="corner-bottom-left"></div>
          <div class="corner-bottom-right"></div>
          <div id="container_line">
          </div>
        </div>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-4 col-xs-4">
        <div class="echart-content big-echart-content">
          <h4 class="chart-title-text">今日就诊科室</h4>
          <div class="corner-top-left"></div>
          <div class="corner-top-right"></div>
          <div class="corner-bottom-left"></div>
          <div class="corner-bottom-right"></div>
          <div id="container_bar">
          </div>
        </div>
        <div class="echart-content small-echart-content top-gap">
          <h4 class="chart-title-text">今日就诊年龄性别统计</h4>
          <div class="corner-top-left"></div>
          <div class="corner-top-right"></div>
          <div class="corner-bottom-left"></div>
          <div class="corner-bottom-right"></div>
          <div id="container_bar_two">
          </div>
        </div>
      </div>
    </div>
  </div>
  <script src="${baseurl}lib/bootstrap3.3.7/jquery.min.js" type="text/javascript"></script>
  <script src="${baseurl}lib/bootstrap3.3.7/js/bootstrap.min.js" type="text/javascript"></script>
  <!-- <script src="https://code.highcharts.com.cn/highcharts/highcharts.js"></script>
  <script src="https://code.highcharts.com.cn/highcharts/highcharts-more.js"></script>
  <script src=" https://code.highcharts.com.cn/highcharts/modules/solid-gauge.js"></script> -->
  <script src="${baseurl}lib/highcharts8.0.0/highcharts.js"></script>
  <script src="${baseurl}lib/highcharts8.0.0/highcharts-more.js"></script>
  <script src="${baseurl}lib/highcharts8.0.0/solid-gauge.js"></script>
  <script>

    var chart = null, websocket = null;
    var locate = window.location;
    var webUrl = "ws://" + locate.hostname + ":" + locate.port + "${baseurl}webSocketBigScreen.do";

    function buildSocket() {
      var options = {
        timeoutInterval: 30000,
      }
      websocket = new ReconnectingWebSocket(webUrl, [], options);
      //连接发生错误的回调方法
      websocket.onerror = function (event) {
        console.log("WebSocket连接错误");
        if (!"${sessionScope.activeUser}") {
          window.location.href = "${baseurl}login.do";
        }
      };

      //连接成功建立的回调方法
      websocket.onopen = function () {
        console.log("WebSocket连接成功");
      };

      //接收到消息的回调方法
      websocket.onmessage = function (event) {
        var info = $.parseJSON(event.data);
        if (info.type == '1') {
          var allData = info.sysdata;
          getBigScreenMsg(allData.yjztjMap);
          loadPie(allData.gjhzblList);
          loadLine(allData.jzfbt24List);
          loadBarChart(allData.jrjzksList);
          loadAgeTotal(allData.jznlxbList);
        }
      };

      //连接关闭的回调方法
      websocket.onclose = function (event) {
        // console.log(event);
        console.log("WebSocket连接关闭");
      };

      //关闭WebSocket连接
      function closeWebSocket() {
        websocket.close();
      }

      //监听窗口关闭事件，当窗口关闭时，主动去关闭websocket连接，防止连接还没断开就关闭窗口，server端会抛异常。
      window.onbeforeunload = function () {
        closeWebSocket();
      };
    }

    $(function () {
      // setTime();
      // 加载大屏页面
      jumpBigScreen();
    });

    function setTime() {
      var today = publicFun.timeFormat(new Date(), "yyyy/MM/dd");
      var preMonthDay = publicFun.getPreMonth(today, '/');
      var today1 = today.substr(0, 7);
      $("#emg_start_date").val(preMonthDay);
      $("#emg_end_date").val(today);
    }

    function getBigScreenMsg(data) {
      var _list = data.highChartsDemoCustom;
      var _fillList = ['rscount', 'jrlqcount', 'dayHeat', 'lstdCount', 'hzCount', 'dayInHospital', 'deathCount', 'yjzrs', 'ylqcount', 'qjzwscount', 'yhzavgtime', 'xtCount', 'czCont', 'csCount']
      _fillList.forEach(function (val, idx) {
        $('#' + val).html(_list[val])
      })
      var _param1 = { id: 'container_emptyPie1', mainColor: '#00ab9b', bgColor: '#004d5f', percent: _list.lstdRtio, text: '占留抢总数', val: _list.lstdCount };
      var _param2 = { id: 'container_emptyPie2', mainColor: '#00d4f2', bgColor: '#005877', percent: _list.hzRito, text: '占留抢总数', val: _list.hzCount };
      var _param3 = { id: 'container_emptyPie3', mainColor: '#e1c515', bgColor: '#3f5351', percent: _list.dayInHospitalRito, text: '占留抢总数', val: _list.dayInHospital };
      var _param4 = { id: 'container_emptyPie4', mainColor: '#0AEbf5', bgColor: '#33848a', percent: _list.deathCountRito, text: '占留抢总数', val: _list.deathCount };
      loadCommonPie(_param1);
      loadCommonPie(_param2);
      loadCommonPie(_param3);
      loadCommonPie(_param4);
      var _currentTime = publicFun.timeFormat(new Date(), 'yyyy年MM月dd日 hh:mm')
      $('#currentTime').html(_currentTime);
    }

    function jumpBigScreen() {
      buildSocket();
      var r = ($(window).width()) / 1920;
      var h = ($(window).height()) / 1080;
      $(document.body).css({
        "-webkit-transform": "scale(" + r + "," + h + ")",
        "-moz-transform": "scale(" + r + "," + h + ")",
        "-o-transform": "scale(" + r + "," + h + ")",
        "transform": "scale(" + r + "," + h + ")"
      });
      //scale(x,y)	定义 2D 缩放转换。
      $(window).resize(function () {
        var r = ($(window).width()) / 1920;
        var h = ($(window).height()) / 1080;
        $(document.body).css({
          "-webkit-transform": "scale(" + r + "," + h + ")",
          "-moz-transform": "scale(" + r + "," + h + ")",
          "-o-transform": "scale(" + r + "," + h + ")",
          "transform": "scale(" + r + "," + h + ")"
        });
      });

      // 全屏事件
      $('.fullScreen').click(function () {
        launchFullscreen();
        $(this).hide().next().show();
      })
      $('.exitFullScreen').click(function () {
        exitFullscreen();
        $(this).hide().prev().show();
      })
    }

    function loadCommonPie(paramObj) {
      var _wth = $('.half-echart-content').width(),
        _ht = $('.half-echart-content').height() - 30;
      $('#' + paramObj.id).height(_ht);
      Highcharts.chart(paramObj.id, {
        chart: {
          type: 'solidgauge',
          backgroundColor: ''
        },
        credits: {
          enabled: false
        },
        title: {
          align: "center",
          y: (_ht - 25) / 2,
          floating: true,
          text: '<b style="color: ' + paramObj.mainColor + '; font-weight: bold; font-size: 25px; text-align: center;">' + paramObj.percent + '%</b><br/><b style="color:#fff;">' + paramObj.text + '</b>'
        },
        tooltip: {
          enabled: false,
          borderWidth: 0,
          backgroundColor: 'none',
          shadow: false,
          style: {
            fontSize: '16px'
          },
          headerFormat: '<p style="font-size:2em; color: ' + paramObj.mainColor + '; font-weight: bold; text-align: center;">' + paramObj.percent + '%</p><br/>',
          pointFormat: '<p style="color: #fff;">{series.name}</p>',
          positioner: function (labelWidth, labelHeight) {
            return {
              x: _wth / 2 - labelWidth / 2,
              y: (labelWidth + 20) / 2
            };
          }
        },
        pane: {
          startAngle: 0,
          endAngle: 360,
          background: [{
            outerRadius: '112%',
            innerRadius: '88%',
            backgroundColor: paramObj.bgColor,
            borderWidth: 0
          }]
        },
        yAxis: {
          min: 0,
          max: 100,
          lineWidth: 0,
          tickPositions: []
        },
        plotOptions: {
          solidgauge: {
            borderWidth: '20px',
            dataLabels: {
              enabled: false
            },
            linecap: 'round',
            stickyTracking: false
          }
        },
        series: [{
          name: paramObj.text,
          borderColor: paramObj.mainColor,
          data: [{
            radius: '100%',
            innerRadius: '100%',
            y: (paramObj.percent - 0)
          }]
        }]
      })
    }

    // 急诊各级患者比例
    function loadPie(data) {
      $('#container_pie .highcharts-container').css({ "top": "-40px" });
      var brandsData = [],
        drilldownSeries = [];
      var ageGroup = data.ageGroup;
      for (var i = 0; i < data.length; i++) {
        brandsData.push({
          name: data[i].name,
          y: data[i].count,
          drilldown: data[i].ageGroup ? data[i].name : null
        });
      }
      for (var i = 0; i < data.length; i++) {
        var d = [];
        if (data[i].ageGroup) {
          $.each(data[i].ageGroup, function (j, value) {
            d.push([data[i].ageGroup[j].name, data[i].ageGroup[j].count])
          });
          drilldownSeries.push({
            name: data[i].name,
            id: data[i].name,
            data: d
          });
        }
      }
      $('#container_pie').height($('.small-echart-content').height());
      $('#container_pie').highcharts({
        chart: {
          type: 'pie',
          backgroundColor: ''
        },
        colors: [
          'red', //第一个颜色，
          '#f90', //第二个颜色
          'yellow', //第三个颜色
          'green', //第四个颜色
          'green'
        ],
        legend: {
          align: 'right',
          floating: true,
          itemStyle: {
            'fontSize': '12px',
            'color': '#fff'
          }
        },
        title: {
          text: ''
        },
        credits: {
          enabled: false
        },
        plotOptions: {
          pie: {
            allowPointSelect: true,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              format: '{point.name}: {point.percentage:.2f}%  {point.y}人',
              style: {
                color: '#eee',
                fontSize: '13px',
                textOutline: "none"
              }
            },
            showInLegend: true
          }
        },
        tooltip: {
          headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
          pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b> {point.percentage:.2f}%   {point.y}人</b> <br/>'
        },
        series: [{
          type: 'pie',
          name: '急诊分级',
          colorByPoint: true,
          data: brandsData
        }],
        drilldown: {
          series: drilldownSeries
        }
      });
    }

    // 获取今日就诊科室
    function loadBarChart(chartData) {
      $('#container_bar').css({
        "padding": "38px 0 0 0"
      });
      $('#container_bar').height($('.big-echart-content').height() - 48);
      var categoriesArr = [], seriesArr = [];
      var _xTitle;
      if (chartData.length > 0) {
        _xTitle = chartData[0].querydate
      }
      var seriesData = {
        data: [],
        name: _xTitle
      };
      for (var i = 0; i < chartData.length; i++) {
        categoriesArr.push(chartData[i].emgFkName);
        seriesData.data.push(chartData[i].hzcount - 0)
      }
      seriesArr.push(seriesData);
      // 默认的导出菜单选项，是一个数据
      $('#container_bar').highcharts({
        chart: {
          type: 'bar',
          backgroundColor: '',
          plotBackgroundColor: null
        },
        title: {
          text: ''
        },
        colors: ['rgb(249,211,76)'],
        xAxis: {
          categories: categoriesArr,
          labels: {
            rotation: -45,
            style: {
              fontSize: '13px',
              fontFamily: 'Verdana, sans-serif',
              color: '#fff'
            }
          }
        },
        yAxis: {
          min: 0,
          allowDecimals: false,
          labels: {
            style: {
              fontSize: '16px',
              fontFamily: 'Verdana, sans-serif',
              color: '#fff'
            }
          },
          title: {
            text: '人数',
            style: {
              fontSize: '14px',
              fontFamily: 'Verdana, sans-serif',
              color: '#fff'
            }
          },
          gridLineColor: null,
          gridLineWidth: 1
        },
        legend: {
          enabled: false,
          align: 'right',
          floating: true,
          layout: "horizontal",
          y: 10,
          itemStyle: {
            'fontSize': '12px'
          }
        },
        exporting: {
          enabled: false
        },
        tooltip: {
          fheaderFormat: '<span style="font-size:10px">{point.key}</span><table>',
          pointFormat: '<tr><span><td>{series.name}: </td></span>' +
            '<td style="padding:0"><b>{point.y} 人</b></td></tr>',
          footerFormat: '</table>',
        },
        plotOptions: {
          bar: {
            allowPointSelect: false,
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
          // series: {
          //     cursor: 'pointer',
          //     point: {
          //         events: {
          //             click: function (e) {
          //                 console.log(e,"e111")
          //             　　　　if (e.point.color == 'red') {
          //             　　　　　　e.point.color = '#49d9fe';//如果是点击之前已经点击了的则把颜色变回来
          //             　　　　} else {
          //             　　　　　　for (var i = 0; i < e.point.series.data.length; i++) {
          //             　　　　　　　　var temp = e.point.series.data[i];
          //             　　　　　　　　if (temp.color == 'red') {
          //             　　　　　　　　　　e.point.series.data[i].color = '#49d9fe';//去掉已点击的颜色
          //             　　　　　　　　　　e.point.series.data[i].update(e.point.series.data[i]);
          //             　　　　　　　　　　break;
          //             　　　　　　}
          //             　　　　}
          //             　　　　e.point.color = 'red';//设置点击后的柱状图 的柱形颜色
          //             　　}
          //             　　e.point.update(e.point);
          //             }
          //         }
          //     }
          // }
          // series:{
          //     states: {
          //         hover: {
          //             enabled: false
          //         }
          //     },
          //     point: {
          //         events: {
          //             mouseOver: function () {
          //                 this.graphic.attr("fill", "#e3a43b");
          //             },
          //             mouseOut: function () {
          //                 this.graphic.attr("fill", "#49d9fe");
          //             }
          //         }
          //     },
          // }
        },
        credits: {
          enabled: false
        },
        series: seriesArr
      });
    }

    //24小时就诊分布
    function loadLine(chartDate) {
      $('#container_line').css({
        "padding": "38px 0 0 0"
      });
      $('#container_line').height($('.small-echart-content').height() - 42);
      var seriesArr = [], categoriesArr = [];
      var seriesDataOne = [], seriesDataTwo = [];
      for (var i = 0; i < chartDate.length; i++) {
        categoriesArr.push(chartDate[i].queryType);
        seriesDataOne.push(chartDate[i].zjcounts);
        seriesDataTwo.push(chartDate[i].lqcounts);
      }
      seriesArr.push({
        name: '诊间就诊',
        data: seriesDataOne
      });
      seriesArr.push({
        name: '留抢',
        data: seriesDataTwo
      });
      chart = Highcharts.chart('container_line', {
        chart: { //图标配置
          zoomType: 'x',
          type: 'line',
          backgroundColor: '',
          plotBackgroundColor: null
        },
        title: { //大标题
          text: ''
        },
        colors: [
          '#77b8f6', // 第一个颜色，
          '#fff' // 第二个颜色
        ],
        xAxis: {
          type: 'datetime',
          dateTimeLabelFormats: {
            day: '%m-%d',
            week: '%m-%d',
            month: '%Y-%m',
            year: '%Y'
          },
          labels: {
            rotation: -45,
            style: {
              fontSize: '12px',
              fontFamily: 'Verdana, sans-serif',
              color: '#fff'
            }
          },
          categories: categoriesArr
        },
        yAxis: {
          min: 0,
          allowDecimals: false,
          labels: {
            style: {
              fontSize: '16px',
              fontFamily: 'Verdana, sans-serif',
              color: '#fff'
            }
          },
          title: {
            text: '人数',
            style: {
              fontSize: '14px',
              fontFamily: 'Verdana, sans-serif',
              color: '#fff'
            }
          },
          gridLineColor: null,
          gridLineWidth: 1
        },
        credits: { //版权信息
          enabled: false
        },
        exporting: { //导出按钮
          enabled: false
        },
        legend: {
          itemStyle: {
            'fontSize': '12px',
            'color': '#fff'
          }
        },
        tooltip: {
          fheaderFormat: '<span style="font-size:10px">{point.key}</span><table>',
          pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.0f} 人</b></td></tr>',
          footerFormat: '</table>',
          shared: true,
          useHTML: true
        },
        plotOptions: { //数据列配置
          line: {
            allowPointSelect: false,
            cursor: 'pointer',
            dataLabels: {
              enabled: true,
              // color: (Highcharts.theme && Highcharts.theme.dataLabelsColor) || 'white',
              color: 'white',
              style: {
                textShadow: '0 0 3px black'
              }
            }
          },
          showInLegend: true
        },
        series: seriesArr
      });
    }

    // 今日就诊年龄性别统计
    function loadAgeTotal(allData) {
      $('#container_bar_two').css({
        "padding": "38px 0 0 0"
      });
      $('#container_bar_two').height($('.small-echart-content').height() - 42);
      var _manData = [], _womanData = [], categories = [];
      for (var i = 0; i < allData.length; i++) {
        _manData.push(-allData[i].zgcount);
        _womanData.push(allData[i].hzcount);
        categories.push(allData[i].inter)
      }
      var chart = Highcharts.chart('container_bar_two', {
        chart: {
          type: 'bar',
          backgroundColor: '',
          plotBackgroundColor: null
        },
        title: {
          text: ''
        },
        colors: [
          '#77b8f6', // 第一个颜色，
          '#fff' // 第二个颜色
        ],
        xAxis: [{
          categories: categories,
          reversed: false,
          labels: {
            step: 1,
            style: {
              color: '#fff'
            }
          }
        }, {
          // 显示在右侧的镜像 xAxis （通过 linkedTo 与第一个 xAxis 关联）
          opposite: true,
          reversed: false,
          categories: categories,
          linkedTo: 0,
          labels: {
            step: 1,
            style: {
              color: '#fff'
            }
          }
        }],
        yAxis: {
          title: {
            text: null
          },
          labels: {
            formatter: function () {
              return (Math.abs(this.value))
            },
            style: {
              color: '#fff'
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
              allowOverlap: true, // 允许数据标签重叠
              style: {
                color: '#000',
                fontSize: '13px',
                textOutline: "none"
              }
            }
          }
        },
        legend: {
          itemStyle: {
            'fontSize': '12px',
            'color': '#fff'
          }
        },
        tooltip: {
          formatter: function () {
            return '<b>' + this.series.name + ', 年龄 ' + this.point.category + '</b>, 人数' + Highcharts.numberFormat(Math.abs(this.point.y), 0);
          }
        },
        credits: {
          enabled: false
        },
        series: [{
          name: '男',
          data: _manData
        }, {
          name: '女',
          data: _womanData
        }]
      });
    }

    function launchFullscreen() {
      var element = document.documentElement;
      if (element.requestFullscreen) {
        element.requestFullscreen();
      } else if (element.mozRequestFullScreen) {
        element.mozRequestFullScreen();
      } else if (element.webkitRequestFullscreen) {
        element.webkitRequestFullscreen();
      } else if (element.msRequestFullscreen) {
        element.msRequestFullscreen();
      } else {
        console.log("当前浏览器不支持全屏");
      }
    }

    // 判断浏览器种类
    function exitFullscreen() {
      if (document.exitFullscreen) {
        document.exitFullscreen();
      } else if (document.mozCancelFullScreen) {
        document.mozCancelFullScreen();
      } else if (document.webkitCancelFullScreen) {
        document.webkitCancelFullScreen();
      } else if (document.msExitFullscreen) {
        document.msExitFullscreen();
      }
    }

  </script>
</body>

</html>