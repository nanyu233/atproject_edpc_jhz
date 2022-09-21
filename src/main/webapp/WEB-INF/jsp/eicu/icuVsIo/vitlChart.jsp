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
    <title>体征分析</title>
  </head>

  <body ms-controller="vsIoChartVm">
    <!-- 查询条件 -->
    <div class="container">
      <div class="form clr">
        <p class="form-text">日期：</p>
        <input
          class="input-date Wdate"
          type="text"
          name="startDate"
          autocomplete="off"
          ms-duplex="duplexQueryInfo.startDate"
          ms-click="dateTimePicker()"
        />
        -
        <input
          class="input-date Wdate"
          type="text"
          name="endDate"
          autocomplete="off"
          ms-duplex="duplexQueryInfo.endDate"
          ms-click="dateTimePicker()"
        />
        <p class="form-text">分析间隔：</p>
        <label class="icu-check-box" ms-repeat="intervalInfo">
          <input
            type="radio"
            name="interval-value"
            class="interval-value"
            ms-attr-value="{{ el.infocode }}"
            ms-duplex-string="duplexQueryInfo.interval"
          />
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
      var queryInfo = {
        startDate: '',
        endDate: '',
        interval: ''
      };

      var vsIoChartVm = avalon.define({
        $id: 'vsIoChartVm',
        duplexQueryInfo: {
          startDate: '',
          endDate: '',
          interval: ''
        },
        intervalInfo: [
          {
            info: '分钟',
            infocode: 'minute'
          },
          {
            info: '小时',
            infocode: 'hour'
          }
        ],
        dateTimePicker: function () {
          WdatePicker({
            dateFmt: 'yyyy/MM/dd',
            maxDate: '%y/%M/%d'
          });
        }
      });
      function reload() {}
      /**
       * 获取vitlChart字典
       */
      function getVitlChartTypeList() {
        var typeList = [
          {
            gridLineWidth: true,
            typeIdx: 0,
            yAxisName: 'HR/BP/MAP',
            yTitleOffset: -30,
            yTitleX: -60,
            min: 0,
            max: 240,
            typeCodeList: [
              {
                vsCode: 'HR',
                seriesType: 'spline',
                dashStyle: '',
                mainColor: '#dc3545',
                seriesSymbol: 'square'
              },
              {
                vsCode: 'SBP',
                seriesType: 'spline',
                dashStyle: 'shortDash',
                mainColor: Highcharts.getOptions().colors[0],
                seriesSymbol: 'triangle-down'
              },
              {
                vsCode: 'RR',
                seriesType: 'spline',
                dashStyle: '',
                mainColor: Highcharts.getOptions().colors[3],
                seriesSymbol: 'diamond'
              },
              {
                vsCode: 'DBP',
                seriesType: 'spline',
                dashStyle: 'shortDash',
                mainColor: Highcharts.getOptions().colors[0],
                seriesSymbol: 'triangle'
              },
              {
                vsCode: 'BPRANGE',
                seriesType: 'arearange',
                hideLegend: true,
                mainColor: '#dcf2fcb3',
                zIndex: 0
              }
            ]
          },
          {
            gridLineWidth: true,
            typeIdx: 1,
            yAxisName: 'TEMP',
            yTitleOffset: -10,
            yTitleX: 45,
            min: 30,
            max: 42,
            typeCodeList: [
              {
                vsCode: 'BT',
                seriesType: 'spline',
                dashStyle: '',
                mainColor: Highcharts.getOptions().colors[7],
                seriesSymbol: 'diamond'
              }
            ],
            opposite: true
          },
          {
            typeIdx: 2,
            yAxisName: 'SPO2',
            yTitleOffset: 10,
            yTitleX: 30,
            min: 40,
            max: 100,
            typeCodeList: [
              {
                vsCode: 'SPO2',
                seriesType: 'spline',
                dashStyle: '',
                mainColor: Highcharts.getOptions().colors[5],
                seriesSymbol: 'diamond'
              }
            ],
            opposite: true
          }
        ];
        return typeList;
      }
      /**
       * getVitlData
       */
      function getVitlData() {
        var timeSuffix = ' 00:00';
        var reqUrl = _baseUrl + 'icucust/queryVitlChartInfo.do';
        var reqParams = {
          liveNo: _liveNo,
          startDate: queryInfo.startDate + timeSuffix,
          endDate: queryInfo.endDate + timeSuffix,
          interval: queryInfo.interval // minute || weeks
        };
        publicFun.httpRequest(
          reqUrl,
          reqParams,
          { requestType: 'json' },
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
            initChart(sysdata);
          }
        );
      }
      /**
       * 初始化chart
       */
      function initChart(dataInfo) {
        var totalDateList = dataInfo.dateList;
        var dateVsMap = dataInfo.dateMap;
        var vsDefMap = dataInfo.defMap;
        var vitlChartTypeList = getVitlChartTypeList();
        var yAxisDef = [];
        var seriesDef = [];
        var codeSeriesMap = {}; // series info map
        var yDefTemp; // yAxis data temp
        var sDefTemp; // series def temp
        var tempVsCode; // vsCode temp str
        var sDataTemp; // series data temp
        var tempStr;
        var tempNumb;
        var temp;
        //BPRANGE created
        vitlChartTypeList.forEach(function (typeInfo, typeIdx) {
          yDefTemp = {};
          yDefTemp.tickAmount = 7; // fixed tick amount
          if (!yAxisDef[typeIdx]) {
            if (!typeInfo.gridLineWidth) {
              yDefTemp.gridLineWidth = 0;
            }
            if (typeInfo.opposite) {
              yDefTemp.opposite = true;
            }
            if (typeInfo.min !== undefined) {
              yDefTemp.min = typeInfo.min;
              yDefTemp.max = typeInfo.max;
            }
            yDefTemp.tickAmount = 7;
            yDefTemp.labels = {
              style: {
                color: '#666'
              }
            };
            yDefTemp.title = {
              align: 'low',
              offset: typeInfo.yTitleOffset || 0,
              rotation: 0,
              text: typeInfo.yAxisName,
              x: typeInfo.yTitleX,
              y: 30,
              style: {
                color: '#999'
              }
            };
            // MANUALLY ADD BPRANGE DEF INFO
            vsDefMap.BPRANGE = {
              vsType: 'VS',
              vsCode: 'BPRANGE',
              vsName: '血压面积',
              vsUnit: 'mmHg'
            };
            // deal with series data
            typeInfo.typeCodeList.forEach(function (insideType) {
              tempVsCode = insideType.vsCode;
              totalDateList.forEach(function (datestamp) {
                temp = dateVsMap[datestamp + ''];
                if (!codeSeriesMap[tempVsCode]) {
                  // set series initial data
                  sDefTemp = {};
                  sDefTemp.yAxis = typeIdx;
                  sDefTemp.type = insideType.seriesType;
                  sDefTemp.name = vsDefMap[tempVsCode].vsName;
                  // showInLegend
                  if (insideType.hideLegend) {
                    sDefTemp.showInLegend = false;
                  }
                  // zIndex
                  if (insideType.zIndex === 0) {
                    sDefTemp.zIndex = 0;
                  } else {
                    // default 1
                    sDefTemp.zIndex = 1;
                  }
                  // dashStyle
                  sDefTemp.dashStyle = insideType.dashStyle || '';
                  if (insideType.mainColor) {
                    sDefTemp.color = insideType.mainColor;
                  }
                  // unit suffix
                  if (vsDefMap[tempVsCode].vsUnit) {
                    sDefTemp.tooltip = {
                      valueSuffix: ' ' + vsDefMap[tempVsCode].vsUnit
                    };
                  }
                  // symbol
                  if (insideType.seriesSymbol) {
                    sDefTemp.marker = {
                      symbol: insideType.seriesSymbol
                    };
                  } else {
                    sDefTemp.marker = {
                      enabled: false
                    };
                  }
                  sDefTemp.data = [];
                  seriesDef.push(sDefTemp);
                  codeSeriesMap[tempVsCode] = sDefTemp;
                }
				if (temp[tempVsCode]) {
                  sDataTemp = {};
                  sDataTemp.x = parseInt(datestamp);
                  if (tempVsCode !== 'BPRANGE') {
                    tempNumb = parseFloat(temp[tempVsCode].vsRslt);
                    if (tempVsCode === 'SBP' && temp.DBP) {
                      // sbp,dbp has value, create bpRange
                      if(tempNumb&&parseFloat(temp.DBP.vsRslt)){
	                      temp.BPRANGE = {
	                        low: parseFloat(temp.DBP.vsRslt),
	                        high:  tempNumb // cur tempNumb is sbp numb
	                      };
                      }
                    }
                    // sDataTemp.y = tempNumb;
                    sDataTemp = [datestamp, tempNumb];
                  } else {
                    // bpRange data, add low and high
                    $.each(temp[tempVsCode], function (k, v) {
                      sDataTemp[k] = v;
                    });
                  }
                  codeSeriesMap[tempVsCode].data.push(sDataTemp);
                }
              });
            });
            yAxisDef[typeIdx] = yDefTemp;
          }
        });
        // console.log('initChart -> seriesDef', seriesDef);
        var chart = Highcharts.chart('chart-div', {
          credits: {
            enabled: false
          },
          chart: {
            // spacingTop: 50,
          },
          global: {
            // return time zone difference, in minutes, from current locale to UTC.
            timeZoneOffset: new Date().getTimezoneOffset()
          },
          title: {
            text: '生命体征分析'
          },
          xAxis: {
            type: 'datetime',
            dateTimeLabelFormats: {
              minute: '%H:%M'
            }
          },
          yAxis: yAxisDef,
          plotOptions: {
            series: {
              connectNulls: true
            }
          },
          tooltip: {
            shared: true,
            formatter: function () {
              var str;
              str =
                '<b>' + publicFun.timeFormat(this.x, 'MM/dd hh:mm') + '</b>';
              $.each(this.points, function (idx, point) {
                if (point.series.name !== '血压面积') {
                  str += '<br/>';
                  str += '<span style="color:' + point.color + '">●</span>';
                  str += point.series.name;
                  str += ': ';
                  str += '<b>' + point.y + '<b/>';
                  str += point.series.tooltipOptions.valueSuffix;
                }
              });
              return str;
            }
          },
          legend: {
            align: 'left',
            x: 0,
            y: 0,
            itemDistance: 10,
            labelFormatter: function () {
              var tempStr = this.options.tooltip.valueSuffix || '';
              if (tempStr) {
                tempStr = tempStr.trim();
              }
              return this.name + tempStr;
            },
            verticalAlign: 'top',
            floating: true,
            backgroundColor:
              (Highcharts.theme && Highcharts.theme.legendBackgroundColor) ||
              '#FFFFFF'
          },
          series: seriesDef
        });
        console.log('initChart -> chart', chart);
        return chart;
      }
      /**
       *弹窗返回
       */
      function modalReturnFun(modalType) {
        getVitlData();
      }
      //查询方法
      function icuinfoquery() {
        $.each(queryInfo, function (k, v) {
          queryInfo[k] = vsIoChartVm.duplexQueryInfo[k];
        });
        getVitlData();
      }
      /**
       * 初始化查询条件
       */
      function initQueryInfo() {
        /* var curDatestamp = new Date().getTime();
        var curDateStr = publicFun.timeFormat(curDatestamp, 'yyyy/MM/dd');
        var lastDatestamp = curDatestamp - DAY_MILLI_SEC;
        var lastDateStr = publicFun.timeFormat(lastDatestamp, 'yyyy/MM/dd'); */
        var emgDatstamp = eicuUtil.dateToGMT('${hspemginfCustom.emgDat}').getTime();
        var emgDatStr = publicFun.timeFormat(emgDatstamp, 'yyyy/MM/dd');
        var emgEndDatstamp = emgDatstamp + DAY_MILLI_SEC;
        var emgEndDatStr = publicFun.timeFormat(emgEndDatstamp, 'yyyy/MM/dd');
        queryInfo.startDate = emgDatStr;
        queryInfo.endDate = emgEndDatStr;
        queryInfo.interval = 'minute';
      }
      /**
       * 样式设定
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
        var numberMonth = [];
        for (var i = 1; i <= 12; i++) {
          numberMonth.push('' + i);
        }
        // highchart setoptions
        Highcharts.setOptions({
          global: {
            // return time zone difference, in minutes(*60*100to milliseconds), from current locale to UTC.
            timezoneOffset: new Date().getTimezoneOffset()
          },
          lang: {
            shortMonths: numberMonth
          }
        });
        setLayout();
        initQueryInfo();
        getVitlData();
      });
    </script>
  </body>
</html>
