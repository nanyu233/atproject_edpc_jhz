<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/hems/global.css"
    />
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/eicu/eicu_common.css"
    />
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%> <%@ include
    file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
    <script
      language="javascript"
      src="${baseurl}Lodop6.216/LodopFuncs.js"
    ></script>
    <script
      src="${baseurl}lib/avalon1.4.8/avalon.js"
      type="text/javascript"
    ></script>
    <script
      src="${baseurl}lib/highcharts5.0.7/code/highcharts.js"
      type="text/javascript"
    ></script>
    <script
      src="${baseurl}lib/highcharts5.0.7/code/highcharts-more.js"
      type="text/javascript"
    ></script>
    <script
      src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js"
      type="text/javascript"
    ></script>
    <script
      src="${baseurl}lib/highcharts5.0.7/code/modules/exporting.js"
      type="text/javascript"
    ></script>
    <title>出入量分析</title>
  </head>

  <body>
    <div class="container" ms-controller="vsIoChartVm">
      <div class="form">
        <p class="form-text">日期：</p>
        <input
          id="paramStartDate"
          class="input-date Wdate"
          type="text"
          name="startDate"
          autocomplete="off"
          ms-duplex="duplexQueryInfo.startDate"
          ms-click="dateTimePicker('start', $event)"
        />
        -
        <input
          class="input-date Wdate"
          type="text"
          name="endDate"
          autocomplete="off"
          ms-duplex="duplexQueryInfo.endDate"
          ms-click="dateTimePicker('end', $event)"
        />
        <p class="form-text">分析间隔：</p>
        <label
          class="icu-check-box"
          ms-repeat="intervalInfo"
          ms-click="intervalClick(el.infocode)"
        >
          <input
            type="radio"
            name="interval-value"
            class="interval-value"
            ms-attr-value="{{ el.infocode }}"
            ms-attr-checked="{{ el.infocode === duplexQueryInfo.interval }}"
          />
          <!-- ms-duplex-string="duplexQueryInfo.interval" -->
          <span class="icu-check-label-name">{{ el.info }}</span>
        </label>
        <a
          href="#"
          class="easyui-linkbutton"
          iconCls="icon-search"
          onclick="icuinfoquery()"
          >查询</a
        >
      </div>

      <div id="chart-box">
        <div id="chart-div"></div>
      </div>
    </div>
    <script type="text/javascript">
      var _liveNo = '${liveNo}';
    </script>
    <script type="text/javascript">
      var paramInterval;
      var queryInfo = {
        startDate: '',
        endDate: '',
        interval: ''
      };
      var initFlag = false;
      var vsIoChartVm = avalon.define({
        $id: 'vsIoChartVm',
        duplexQueryInfo: {
          startDate: '',
          endDate: '',
          interval: ''
        },
        intervalInfo: [
          {
            info: '1小时',
            infocode: '1',
            minDuration: 2,
            maxDuration: 4
          },
          {
            info: '4小时',
            infocode: '4',
            minDuration: 7,
            maxDuration: 15
          },
          {
            info: '8小时',
            infocode: '8',
            minDuration: 15,
            maxDuration: 30
          },
          /* {
            info: '班次',
            infocode: 'shift',
            minDuration: 15,
            maxDuration: 30 // a month
          }, */
          {
            info: '24小时',
            infocode: 'day',
            minDuration: 30,
            maxDuration: 120 // three months
          }
        ],
        maxEndDate: '',
        dateTimePicker: function (flag, e) {
          var target = e.target;
          var wpOpt = {
            el: target,
            dateFmt: 'yyyy/MM/dd',
            maxDate: '%y/%M/%d'
          };
          if (flag === 'start') {
            wpOpt.onpicked = maxDateFormat;
            // maxDateFormat();
          } else if (flag === 'end') {
            wpOpt.minDate = "#F{$dp.$D('paramStartDate')}";
            wpOpt.maxDate = vsIoChartVm.maxEndDate;
          }
          WdatePicker(wpOpt);
        },
        intervalClick: function (code) {
          if (code !== vsIoChartVm.duplexQueryInfo.interval) {
            vsIoChartVm.duplexQueryInfo.interval = code;
            maxDateFormat('interval');
          }
        }
      });
      /**
       * format max end date
       */
      function maxDateFormat(formatFlag) {
        var duplexQueryInfo = vsIoChartVm.duplexQueryInfo;
        var curInterval = duplexQueryInfo.interval;
        var maxDuration;
        var minDuration;
        var dateStampDiffer;
        var curDateStamp = new Date().getTime();
        var curStartDate = duplexQueryInfo.startDate;
        var curStartDateStamp = new Date(duplexQueryInfo.startDate).getTime();
        var curEndDate = duplexQueryInfo.endDate;
        var curEndDateStamp = new Date(duplexQueryInfo.endDate).getTime();
        var maxEndDateStamp;
        var maxEndDateStr;
        // find cur max duration
        $.each(vsIoChartVm.intervalInfo, function (idx, el) {
          if (el.infocode === curInterval) {
            minDuration = el.minDuration - 1;
            maxDuration = el.maxDuration - 1; // minus first day
            return false;
          }
        });
        minDuration *= DAY_MILLI_SEC; // day -> millisecond differ
        maxDuration *= DAY_MILLI_SEC; // day -> millisecond differ
        maxEndDateStamp = curStartDateStamp + maxDuration;
        if (maxEndDateStamp > curDateStamp) {
          // max stamp exceed today, set max to today
          maxEndDateStamp = curDateStamp;
        }
        maxEndDateStr = publicFun.timeFormat(maxEndDateStamp, 'yyyy/MM/dd');
        dateStampDiffer = curEndDateStamp - curStartDateStamp;
        if (formatFlag === 'interval') {
          // interval click
          if (dateStampDiffer < minDuration) {
            vsIoChartVm.duplexQueryInfo.startDate = publicFun.timeFormat(
              curEndDateStamp - minDuration,
              'yyyy/MM/dd'
            );
          } else if (dateStampDiffer > maxDuration) {
            vsIoChartVm.duplexQueryInfo.startDate = publicFun.timeFormat(
              curEndDateStamp - maxDuration,
              'yyyy/MM/dd'
            );
          }
        } else {
          // startDate click
          if (dateStampDiffer > maxDuration) {
            vsIoChartVm.duplexQueryInfo.endDate = maxEndDateStr;
          } else if (curEndDateStamp < curStartDateStamp) {
            vsIoChartVm.duplexQueryInfo.endDate = publicFun.timeFormat(
              curEndDateStamp + minDuration,
              'yyyy/MM/dd'
            );
          }
        }
        vsIoChartVm.maxEndDate = maxEndDateStr;
      }
      function reload() {}
      /**
       * getChartData
       */
      function getChartData() {
        var timeSuffixStr = ' 00:00';
        var reqUrl = _baseUrl + 'icucust/queryIoChartInfo.do';
        var reqParams = {
          liveNo: _liveNo,
          startDate: queryInfo.startDate + timeSuffixStr,
          endDate: queryInfo.endDate + timeSuffixStr,
          interval: queryInfo.interval
        };
        publicFun.httpRequest(
          reqUrl,
          reqParams,
          {
            requestType: 'json'
          },
          function (res) {
            if (!res.resultInfo.success) {
              alert_error('请求出错，请联系管理员');
              return;
            }
            // reset duplex queryInfo
            $.each(queryInfo, function (k, v) {
              vsIoChartVm.duplexQueryInfo[k] = v;
            });
            var sysdata = res.resultInfo.sysdata;
            var dataList = sysdata.ioList;
            initChart(dataList);
          }
        );
      }
      /**
       * initChart
       */
      function initChart(ioDataList) {
        var xCategories = [];
        var iDataList = []; // in
        var oDataList = []; // out
        var bDataList = []; // balance
        var iNumb;
        var oNumb;
        var temp;
        ioDataList.forEach(function (ioInfo) {
          xCategories.push(ioInfo.crtDateStr);
          iNumb = parseInt(ioInfo.typecrl);
          oNumb = parseInt(ioInfo.sumcrl);
          // cal balance
          temp = iNumb + oNumb;
          iDataList.push(iNumb);
          oDataList.push(oNumb);
          bDataList.push(temp);
        });
        // return;
        var chart = Highcharts.chart('chart-div', {
          credits: {
            enabled: false
          },
          title: {
            text: '出入量分析'
          },
          xAxis: {
            categories: xCategories
          },
          yAxis: {
            labels: {
              style: {
                color: '#666'
              }
            },
            tickAmount: 7,
            title: {
              align: 'low',
              offset: 0,
              rotation: 0,
              text: 'ml',
              x: -40,
              y: 30,
              style: {
                color: '#999'
              }
            }
          },
          tooltip: {
            shared: true
          },
          legend: {
            align: 'left',
            x: 0,
            y: 0,
            verticalAlign: 'top',
            floating: true,
            backgroundColor:
              (Highcharts.theme && Highcharts.theme.legendBackgroundColor) ||
              '#FFFFFF'
          },
          plotOptions: {
            series: {
              stacking: 'normal'
            }
          },
          series: [
            {
              type: 'column',
              name: '入量',
              marker: {
                symbol: 'triangle'
              },
              data: iDataList
            },
            {
              type: 'column',
              name: '出量',
              marker: {
                symbol: 'triangle-down'
              },
              data: oDataList
            },
            {
              type: 'spline',
              name: '平衡',
              data: bDataList,
              color: 'orange'
            }
          ]
        });
        return chart;
      }
      /**
       *modal return function
       */
      function modalReturnFun(modalType) {
        getChartData();
      }
      /**
       * 查询方法
       */
      function icuinfoquery() {
        $.each(queryInfo, function (k) {
          queryInfo[k] = vsIoChartVm.duplexQueryInfo[k];
        });
        getChartData();
      }
      /**
       * init query info
       */
      function initQueryInfo() {
        /* var curDateStamp = new Date().getTime();
        var curDateStr = publicFun.timeFormat(curDateStamp, 'yyyy/MM/dd');
        var lastDateStamp = curDateStamp - DAY_MILLI_SEC;
        var lastDateStr = publicFun.timeFormat(lastDateStamp, 'yyyy/MM/dd'); */
        var emgDatstamp = eicuUtil.dateToGMT('${hspemginfCustom.emgDat}').getTime();
        var emgDatStr = publicFun.timeFormat(emgDatstamp, 'yyyy/MM/dd');
        var emgEndDatstamp = emgDatstamp + DAY_MILLI_SEC;
        var emgEndDatStr = publicFun.timeFormat(emgEndDatstamp, 'yyyy/MM/dd');
        var defaultInterval = '1';
        queryInfo.startDate = emgDatStr;
        queryInfo.endDate = emgEndDatStr;
        queryInfo.interval = defaultInterval;
        getChartData();
      }
      /**
       * set layout
       */
      function setLayout() {
        var winW = $(window).width();
        var winH = $(window).height();
        var boxH = winH - 30 - 10;
        var vitlChartH = winH;
        $('#chart-box').width(winW).outerHeight(winH);
        $('#chart-div').width(winW).outerHeight(boxH);
      }
      $(function () {
        setLayout();
        initQueryInfo();
      });
    </script>
  </body>
</html>
