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
    <title>评分总览</title>
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
      function getTotalScoChartTypeList() {
        var typeList = [
          {
            gridLineWidth: true,
            typeIdx: 0,
            yAxisName: 'GCS',
            yTitleOffset: -30,
            yTitleX: -60,
            min: 0,
            max: 20,
            typeCodeList: [
              {
                gradeType: 'GCS',
                seriesType: 'spline',
                dashStyle: '',
                mainColor: '#dc3545',
                seriesSymbol: 'square'
              }/* ,
              {
                gradeType: 'SBP',
                seriesType: 'spline',
                dashStyle: 'shortDash',
                mainColor: Highcharts.getOptions().colors[0],
                seriesSymbol: 'triangle-down'
              }*/
            ]
          },
          {
            gridLineWidth: true,
            typeIdx: 1,
            yAxisName: 'ASS/ISS',
            yTitleOffset: -10,
            yTitleX: 45,
            min: 0,
            max: 160,
            typeCodeList: [
              {
                gradeType: 'ISS',
                seriesType: 'spline',
                dashStyle: '',
                mainColor: Highcharts.getOptions().colors[7],
                seriesSymbol: 'triangle'
              }
            ],
            opposite: true
          },
          {
            typeIdx: 2,
            yAxisName: 'ABC',
            yTitleOffset: 0,
            yTitleX: 35,
            min: 0,
            max: 10,
            typeCodeList: [
              {
                gradeType: 'ABC',
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
        var reqUrl = _baseUrl + 'icucust/queryTotalScoChartInfo.do';
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
        var dateScoMap = dataInfo.dateMap;
        var vitlChartTypeList = getTotalScoChartTypeList();
        var yAxisDef = [];
        var seriesDef = [];
        var codeSeriesMap = {}; // series info map
        var yDefTemp; // yAxis data temp
        var sDefTemp; // series def temp
        var tempGradeType; // gradeType temp str
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

            // deal with series data
            typeInfo.typeCodeList.forEach(function (insideType) {
              tempGradeType = insideType.gradeType;
              if(dateScoMap[tempGradeType]){
	             	codeSeriesMap = setCodeSeriesMap(dateScoMap,tempGradeType,typeIdx,insideType,codeSeriesMap);
          			seriesDef = setSeriesDef(tempGradeType,seriesDef,codeSeriesMap);   
              }              
            });
            yAxisDef[typeIdx] = yDefTemp;
          }
        });
        //console.log('initChart -> seriesDef', seriesDef);
        //console.log('initChart -> codeSeriesMap', codeSeriesMap);
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
            text: '评分总览分析'
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
                  str += '<br/>';
                  str += '<span style="color:' + point.color + '">●</span>';
                  str += point.series.name;
                  str += ': ';
                  str += '<b>' + point.y + '<b/>';
                  str += point.series.tooltipOptions.valueSuffix;                
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
      
//=============================提取图表生成公共设置属性方法==================================
      function setSeriesDef(tempGradeType,seriesDef,codeSeriesMap){       
          if(codeSeriesMap[tempGradeType])
         	 seriesDef.push(codeSeriesMap[tempGradeType]);          
          if(tempGradeType == 'ISS') 
          	 seriesDef.push(codeSeriesMap['AIS']);          	 
	      return seriesDef;
      }
      
      function setCodeSeriesMap(dateScoMap,tempGradeType,typeIdx,insideType,codeSeriesMap){     
      	dateScoMap[tempGradeType].forEach(function (datestamp) {
            var temp = datestamp;
            if (!codeSeriesMap[tempGradeType]) {
              // set series initial data
              var sDefTemp = setSDefTemp(typeIdx,insideType);
              codeSeriesMap[tempGradeType] = sDefTemp;
              if(tempGradeType=='ISS'){
              	 var sDefTempb = setSDefTemp(typeIdx,insideType);
              	 sDefTempb.type='spline';
              	 sDefTempb.color = Highcharts.getOptions().colors[0];
              	 sDefTempb.marker = {
	                symbol: 'triangle-down'
	              };
              	 sDefTempb.name = 'AIS评分';
              	 codeSeriesMap['AIS'] = sDefTempb;
              }
            }
			if (temp) {
              var sDataTemp = {};
              sDataTemp.x = parseInt(temp.gradeTime);      
              codeSeriesMap[tempGradeType].events = {
            	click: function(e) {
            	   var thisPoint = e.point;                   
                   var thisData = dateScoMap[tempGradeType][thisPoint.index];
                   var enterSourceArray = thisData.gradeSeq.split('-');
           		   var enterSource = enterSourceArray?enterSourceArray[0]:'';
                   openSco(enterSource,thisData.gradeSeq,thisData.gradeType,codeSeriesMap[tempGradeType].name,thisData.fldCod);
                }
              }                                                   
              if(tempGradeType=='ISS'){
              	var tempNuma = temp.gradeSco.split('|');        	              	
              	sDataTemp = [temp.gradeTime, parseFloat(tempNuma[0])];
              	codeSeriesMap['ISS'].data.push(sDataTemp);
              	sDataTemp = [temp.gradeTime, parseFloat(tempNuma[1])];
              	codeSeriesMap['AIS'].data.push(sDataTemp);
              	codeSeriesMap['AIS'].events = {
	            	click: function(e) {
	            	   var thisPoint = e.point;                   
	                   var thisData = dateScoMap[tempGradeType][thisPoint.index];
	                   var enterSourceArray = thisData.gradeSeq.split('-');
	           		   var enterSource = enterSourceArray?enterSourceArray[0]:'';
	                   openSco(enterSource,thisData.gradeSeq,thisData.gradeType,codeSeriesMap[tempGradeType].name,thisData.fldCod);
	                }
                }
              }else{
              	var tempNumb = parseFloat(temp.gradeSco);			  
              	// sDataTemp.y = tempNumb;              	
              	sDataTemp = [temp.gradeTime, tempNumb];
              	codeSeriesMap[tempGradeType].data.push(sDataTemp);
              }
            }
          });
          return codeSeriesMap;
      }
      
      //初始化默认设定值
      function setSDefTemp(typeIdx,insideType){
      	var sDefTemp = {};
            sDefTemp.data = [];
            sDefTemp.yAxis = typeIdx;
            sDefTemp.type = insideType.seriesType;
            sDefTemp.name = insideType.gradeType+'评分';
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
            sDefTemp.tooltip = {
              valueSuffix: ' ' //+ '分'
            };
            
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
            // click event
            sDefTemp.pointStart = 1;            
            sDefTemp.cursor = 'pointer'; 
                                   
         return sDefTemp;
      }
      
      //=======================打开评分修改页需要方法========================
      	/**
	     * 子页面传递基本信息
	     */
	    function getBasicInfo() {
	        var basicInfo = {
	            //住院号
	            liveNo: _liveNo,
	            rescMode: ''
	        };
	        return basicInfo;
	    }
	
	    function modalReturnFun(totalSco,gradeSeq,closeFlag,gradeType,enterSource,fldCod){
		    //关闭窗口
	        if (closeFlag) {
	            closemodalwindow();
	        }
	        getVitlData();	        
	    }
	    
	    function openSco(enterSource,gradeSeq,gradeType,modalTitle,fldCod){
            //var menuInfo = eicuUtil.getMenuInfo();
            var exChgInfo = {
            	enterSource: enterSource,//入口标志值，创伤中心-ABCDE为'CSABC'、创伤中心-体格检查为'CSCPN'、护理评估单为H
                gradeType: gradeType,//评分类型，详见控制台 Session Storage---> icuMenu ---> menuInfoObj
                gradeSeq: gradeSeq,//新增时可以为空，修改时不可为空
                modalTitle:modalTitle, //menuInfo['105002'].menuName//评分项标准名称，可另行手工设置，标准详见控制台 Session Storage---> icuMenu ---> menuInfoObj
                fldCod: fldCod
            };
            //调用引用方法
            icuOpenModal.openScoEdit(exChgInfo);	    
	    }
	    
      //====================================================================
      
    </script>
  </body>
</html>
