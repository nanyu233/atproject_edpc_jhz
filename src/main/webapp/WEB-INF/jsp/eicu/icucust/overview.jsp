<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css"/>
    <link rel="stylesheet" type="text/css" href="${baseurl}css/eicu/eicu_common.css"/>

    <script src="${baseurl}lib/Highcharts-8.1.0/code/highcharts.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/highcharts-more.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/modules/xrange.js" type="text/javascript"></script>
    <script src="${baseurl}lib/Highcharts-8.1.0/code/modules/exporting.js" type="text/javascript"></script>

    <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>

    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
    <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
    <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript"></script>
    <title>患者总览</title>
    <style>
      html{
        overflow-y: scroll;
      }
      .icu-card.empty {
        background-color: #eee;
      }
      #card-container {
        display: flex;
        flex-wrap: wrap;
        align-items: center;
        margin-left: 2px;
        padding-top: 10px;
        overflow-y:scroll;
      }

      .card-container > .icu-card {
        width: 30%;
        height: 400px;
        margin-right: 20px;
        margin-bottom: 20px;
        overflow: hidden;
      }

      .icu-card > .icu-card-title > .icu-btn-group,
      .icu-card > .card-item-title > .icu-btn-group {
        flex: 1;
        justify-content: flex-end;
      }
      .card-container > .icu-card > .icu-card-body {
        padding: 0 10px;
        overflow-y: auto;
      }
      /*inside card type comoon*/
      .icu-card .card-item {
        display: inline-flex;
        flex-direction: column;
        margin-right: 10px;
        margin-bottom: 10px;
        width: 45%;
        border: 1px solid #ccc;
      }

      .icu-card .card-item > .card-item-title {
        display: flex;
        align-items: center;
        padding: 5px 5px;
        /* background-color: #eee; */
        border-bottom: 1px solid #ddd;
        font-size: 14px;
      }

      .icu-card .card-item > .card-item-title .title-name {
        font-weight: bold;
        width: 125px;
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
      }
      .icu-card .card-item > .card-item-title > .trend-part {
        width: 35px;
        display: flex;
        align-items: center;
        justify-content: center;
      }
      .icu-card .card-item > .card-item-title > .trend-part > i {
        padding: 0 3px;
      }
      .trend-up {
        transform: rotate(45deg);
      }
      .trend-down {
        transform: rotate(-45deg);
      }
      .icu-card .card-item > .icu-card-body {
        display: flex;
        align-items: center;
        padding: 0 0 0 5px;
      }

      .icu-card .card-item > .icu-card-body .card-time {
        width: 70px;
        color: #666;
        flex-shrink: 0;
        flex-grow: 0;
      }

      .icu-card .card-item > .icu-card-body .card-result {
        padding-left: 7px;
        display: flex;
        align-items: center;
        flex: 1;
        overflow: hidden;
        border-left: 1px solid #ddd;
      }

      .icu-card .card-item > .icu-card-body .card-result .card-result-numb,
      .icu-card .card-item > .icu-card-body .card-result .card-result-numb ~ i {
        white-space: nowrap;
        text-overflow: ellipsis;
        overflow: hidden;
        margin-right: 5px;
        font-size: 14px;
        font-weight: bold;
      }

      /* .icu-card .card-item > .icu-card-body .card-result .card-result-numb ~ i {
        font-size: 18px;
      } */
      /*inside  list type common*/
      .icu-card.list-type-card > .icu-card-title {
        margin-bottom: 0;
      }
      .list-item {
        padding: 5px 5px 0 0;
        border-bottom: 1px solid #ddd;
      }
      .list-item:last-child {
        border-bottom: none;
      }
      .list-item .list-item-title {
        display: flex;
        align-items: flex-end;
      }

      .list-item .list-item-title .other-info {
        padding-top: 5px;
        display: flex;
        align-items: center;
      }

      .list-item .list-item-title .other-info > span {
        margin-right: 5px;
      }

      .list-item .list-item-body {
        margin: 5px 0 0 0;
      }

      /*common*/
      .inline-group {
        display: inline-flex;
        align-items: center;
        border: 1px solid #ccc;
        border-radius: 7px;
        margin-right: 5px;
        margin-bottom: 5px;
      }
      .inline-group.fixed-group {
        width: 100%;
      }
      .inline-group > .group-item {
        padding: 2px 3px;
        min-height: 24px;
        box-sizing: border-box;
      }

      .inline-group > .group-item.group-name {
        font-size: 14px;
      }

      .inline-group .group-fixed-badge {
        display: inline-flex;
        border-left: 1px solid #ccc;
        background-color: #eee;
        font-size: 14px;
        align-items: center;
        height: 25px;
        border-radius: 0 7px 7px 0;
      }

    </style>
  </head>

  <body>
    <div id="container"></div>
    <div id="card-container" class="card-container" ms-controller="overviewVm">
      <div
        class="icu-card"
        ms-class-1="{{ vitlChartHidden ? 'empty' : '' }}"
        ms-css-height="{{ cardH }}"
        ms-css-width="{{ cardW }}"
      >
        <div class="icu-card-title">
          <span class="title-name">生命体征</span>
          <span class="icu-btn-group">
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toVitlChart()"
            >
              生命体征分析
            </span>
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toVitlInfoPage()"
            >
              生命体征管理
            </span>
          </span>
        </div>
        <div id="chart-box" class="icu-card-body">
          <div
            id="vitl-chart"
            ms-css-height="{{ cardH - 50 }}"
            ms-css-width="{{ cardW - 10 }}"
          ></div>
        </div>
      </div>
      <div
        class="icu-card"
        ms-class-1="{{ totalScoChartHidden ? 'empty':''  }}"
        ms-css-height="{{ cardH }}"
        ms-css-width="{{ cardW }}"
      >
        <div class="icu-card-title">
          <span class="title-name">评分总览</span>
          <span class="icu-btn-group">
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toBgInfoPage()"
            >
              评分总览
            </span>
          </span>
        </div>
        <div id="totalSco-box" class="icu-card-body" >
          <div id="totalSco-chart"
            ms-css-height="{{ cardH - 50 }}"
            ms-css-width="{{ cardW - 10 }}"
          ></div>
        </div>
      </div>
      <div
        class="icu-card"
        ms-class-1="{{ ioChartHidden ? 'empty' : '' }}"
        ms-css-height="{{ cardH }}"
        ms-css-width="{{ cardW }}"
      >
        <div class="icu-card-title">
          <span class="title-name">出入量</span>
          <span class="icu-btn-group">
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toIoChart()"
            >
              出入量分析
            </span>
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toIoDaInfoPage()"
            >
              出入量管理
            </span>
          </span>
        </div>
        <div id="io-box" class="icu-card-body">
          <div
            id="io-chart"
            ms-css-height="{{ cardH - 50 }}"
            ms-css-width="{{ cardW - 10 }}"
          ></div>
        </div>
      </div>
      <div
        class="icu-card list-type-card"
        ms-class-1="{{ daExecList.length ? '' : 'empty' }}"
        ms-css-height="{{ cardH }}"
        ms-css-width="{{ cardW }}"
      >
        <div class="icu-card-title">
          <span class="title-name">医嘱执行</span>
          <span class="icu-btn-group">
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toDaInfoPage()"
            >
              医嘱信息
            </span>
          </span>
        </div>
        <div class="icu-card-body" ms-css-height="{{ cardH - 43 }}">
          <div ms-repeat-daexecinfo="daExecList" class="list-item">
            <div class="list-item-title">
              <div
                class="title-name title-name icu-btn display-btn"
                ms-class-1="{{daexecinfo.execStat === '1'? 'bg-outline-secondary': 'bg-outline-primary'}}"
              >
                {{ daexecinfo.docadviceDatbeString }}
              </div>
              <div class="other-info">
                <span
                  class="icu-btn inline-btn display-btn"
                  ms-class-1="{{daexecinfo.docadviceNuimdatString == null||daexecinfo.docadviceNuimnam == null ? 'bg-secondary' : 'bg-primary'}}"
                >
                  {{ daexecinfo.docadviceNuimdatString == null||daexecinfo.docadviceNuimnam == null ? '未执行' : '已执行' }}
                </span>
                <span class="icu-btn inline-btn display-btn bg-secondary">
                  {{ daexecinfo.gyfsmc }}
                </span>
                <span class="icu-btn inline-btn display-btn bg-secondary">
                  {{ daexecinfo.pl }}
                </span>
              </div>
            </div>
            <div class="list-item-body">
              <ul>
                <li class="inline-group">
                  <span class="group-item group-name">
                    {{ daexecinfo.docadviceContent }}
                  </span>
                  <span class="group-item group-fixed-badge unit" style="white-space: nowrap;" ms-if="daexecinfo.docadviceYyjl">
                    {{ daexecinfo.docadviceYyjl }}
                  </span>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div
        class="icu-card card-type-card"
        ms-class-1="{{ inspList.length ? '' : 'empty' }}"
        ms-css-height="{{ cardH }}"
        ms-css-width="{{ cardW }}"
      >
        <div class="icu-card-title">
          <span class="title-name">已关注的检验指标</span>
          <span class="icu-btn-group">
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toExamPage()"
            >
              检验信息
            </span>
          </span>
        </div>
        <div class="icu-card-body" ms-css-height="{{ cardH - 43 }}">
          <div ms-repeat="inspList" class="icu-card card-item">
            <div class="card-item-title">
              <span
                class="title-name text-primary"
                ms-attr-title="{{ el.reportItemName }}"
              >
                {{ el.reportItemName }}
              </span>
              <span class="trend-part" ms-if="el.trendList.length">
                <i
                  ms-repeat-ele="el.trendList"
                  ms-class="{{ ele.trendClass }}"
                  >{{ ele.trendStr }}</i
                >
              </span>
              <!-- <span class="icu-btn-group">
                <span
                  class="hover-icon-box danger-box"
                  ms-click="cancelInspFav($index)"
                  title="取消关注"
                >
                  <i class="my-icon nav-icon iconfont icon-Collection"></i>
                </span>
              </span> -->
            </div>
            <div class="icu-card-body">
              <span class="card-time">{{ el.resultDateTime }}</span>
              <span class="card-result">
                <span
                  class="card-result-numb"
                  ms-class-1="{{ el.rsltClass }}"
                  ms-attr-title="{{ el.result }}"
                  >{{ el.result }}
                </span>
                <i ms-class-1="{{ el.rsltClass }}">{{ el.arrowStr }}</i>
                <span class="unit">{{ el.units }}</span>
              </span>
            </div>
          </div>
        </div>
      </div>
      <div
        class="icu-card list-type-card"
        ms-class-1="{{ examList.length ? '' : 'empty' }}"
        ms-css-height="{{ cardH }}"
        ms-css-width="{{ cardW }}"
      >
        <div class="icu-card-title">
          <span class="title-name">检查报告</span>
          <span class="icu-btn-group">
            <span
              class="icu-btn inline-btn btn-outline-primary"
              onclick="toInspPage()"
            >
              检查报告
            </span>
          </span>
        </div>
        <div class="icu-card-body" ms-css-height="{{ cardH - 43 }}">
          <div ms-repeat="examList" class="list-item">
            <div class="list-item-title icu-btn-group">
              <span class="icu-btn display-btn bg-outline-secondary">
                {{ el.shrq }}
              </span>
              <span
                ms-if="el.ylmc"
                class="icu-btn display-btn bg-outline-primary"
                ms-attr-title="{{ el.ylmc }}"
                style="overflow: hidden;"
              >
                {{ el.ylmc }}
              </span>
            </div>
            <div class="list-item-body">
              <ul>
                <li class="inline-group fixed-group">
                  <span class="group-item group-name">
                    <!-- {{ el.jcjg  + (el.see ? '：' + el.see : '')}}-->
                    {{ el.jcjg }}
                  </span>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>

    <script type="text/javascript">
      // 公共变量
      var ptBasicInfo = eicuUtil.ptBasicInfo;
      var _liveNo = '${liveNo}';
      var _cstNam = '${cstNam}';
      var shiftArr = ['A', 'P', 'N'];
      var queryInfo = {
        startDate: '',
        endDate: '',
        interval: '',
        intervalIo: ''
      };
      //var shiftInfoDict = eicuUtil.getShiftInfoDict();
      //var curShiftInfo = eicuUtil.getCurShiftInfo(shiftInfoDict);
    </script>
    <script>
      /**
       * vm定义
       */
      var overviewVm = avalon.define({
        $id: 'overviewVm',
        cardH: 0,
        cardW: 0,
        vitlChartHidden: false, // nodata && hidden flag
        ioChartHidden: false, // nodata && hidden flag
        totalScoChartHidden: false, // nodata && hidden flag
        daExecList: [],
        inspList: [],
        bgList: [],
        examList: [],
        cancelInspFav: function (idx) {
          var inspInfo = overviewVm.inspList[idx];
          var reqUrl = _baseUrl + 'icuinsp/editFavInfo.do';
          var reqParams = {
            icuInspFav: {
              liveNo: _liveNo,
              favId: inspInfo.favId || '',
              inspItem: inspInfo.inspItem,
              itemCode: inspInfo.itemCode
            }
          };
          var confirmText = '将从关注指标中删除【' + inspInfo.itemName + '】';
          _confirm(confirmText, null, function () {
            publicFun.httpRequest(
              reqUrl,
              reqParams,
              {
                requestType: 'json'
              },
              function (res) {
                if (!res.resultInfo.success) {
                  alert_warn('请求出错，请联系管理员');
                  return;
                }
                ajax_alert(res);
                // 视图中删除当前项目
                overviewVm.inspList.splice(idx, 1);
              }
            );
          });
        }
      });
      /**
       * 刷新
       */
      function reload() {
        getAllInfo();
      }
      /**
       * 请求所有数据
       */
      function getAllInfo() {
        var reqUrl = _baseUrl + 'icucust/getOverviewInfo.do';
        var reqParams = {
          liveNo: _liveNo,
          startDate: queryInfo.startDate,
          endDate: queryInfo.endDate,
          interval: queryInfo.interval
          //shiftFlag: shiftArr[curShiftInfo.curShiftIdx]
        };
        var otherParams = {
          requestType: 'json'
        };
        publicFun.httpRequest(reqUrl, reqParams, otherParams, function (res) {
          if (!res.resultInfo.success) {
            alert_error('请求出错，请联系管理员');
            return;
          }
          var sysdata = res.resultInfo.sysdata;
          var ioDataList = sysdata.ioList;
          var daExecList = sysdata.daExecList;
          var inspList = sysdata.inspList;
          var bgList = sysdata.bgList;
          var examList = sysdata.examList;
          var tempNumb;
          var temp;
          // deal with daExecList
          daExecList.forEach(function (daExecInfo, daExecIdx) {
            daExecInfo.docadviceDatbeString = daExecInfo.docadviceDatbeString.substring(5);
          });
          // deal with insp
          inspList.forEach(function (ele) {
            ele.resultDateTime = publicFun.timeFormat(ele.resultDateTime,'yyyy/MM/dd hh:mm').substring(5);
            var tempList = ele.overRslt ? ele.overRslt.split('|') : [];
            var trendStr = '';
            var classStr = '';
            // trend-arrow
            ele.trendList = [];
            $.each(tempList, function (idx, trendCode) {
              if (trendCode === 'i') {
                // increse
                trendStr = '↑';
                classStr = 'text-danger trend-up';
              } else if (trendCode === 'd') {
                // decrese
                trendStr = '↓';
                classStr = 'text-success trend-down';
              } else if (trendCode === 'u') {
                trendStr = '-';
                classStr = '';
              }
              ele.trendList.push({
                trendStr: trendStr,
                trendClass: classStr
              });
            });
            // rslt-arrow
            if (ele.result) {
            	ele.arrowStr = '';
                ele.rsltClass = '';
            	if(ele.upperLimit){
            		if(parseFloat(ele.result)>parseFloat(ele.upperLimit)){
            			ele.arrowStr = '↑';
                  		ele.rsltClass = 'text-danger';
            		}else if(parseFloat(ele.result)<parseFloat(ele.lowerLimit)){
            			ele.arrowStr = '↓';
                  		ele.rsltClass = 'text-success';
            		}
            	}
            }
          });
          // deal wtih bgList
          bgList.forEach(function (bgInfo) {
            bgInfo.vsDateStr = publicFun.timeFormat(
              bgInfo.vsDate,
              'MM/dd hh:mm'
            );
            if (bgInfo.vsRslt) {
              tempNumb = parseFloat(bgInfo.vsRslt);
              if (tempNumb < bgInfo.lowLmt) {
                bgInfo.arrowStr = '↓';
                bgInfo.rsltClass = 'text-success';
              } else if (tempNumb > bgInfo.uppLmt) {
                bgInfo.arrowStr = '↑';
                bgInfo.rsltClass = 'text-danger';
              } else {
                bgInfo.arrowStr = '';
                bgInfo.rsltClass = '';
              }
            }
          });
          // deal with exam
          examList.forEach(function (el) {
            el.shrq = publicFun.timeFormat(el.shrq,'yyyy/MM/dd hh:mm').substring(5);
          });
          // data assign & render page
          overviewVm.daExecList = daExecList;
          overviewVm.inspList = inspList;
          overviewVm.bgList = bgList;
          overviewVm.examList = examList;
          vitlChartInit(sysdata.vitlMap);
          ioChartInit(ioDataList);
          initTotalScoChart(sysdata.totalScoMap);
        });
      }
      /**
       * 获取vitlChart字典
       */
      function getVitlChartTypeList() {
        var typeList = [
          {
            gridLineWidth: true,
            typeIdx: 0,
            yAxisName: 'HR/BP/RR',
            yTitleOffset: -80,
            yTitleX: -125,
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
            yAxisName: 'T',
            yTitleOffset: -10,
            yTitleX: 40,
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
            yTitleOffset: 0,
            yTitleX: 35,
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
       * 初始化生命体征图
       */
      function vitlChartInit(dataInfo) {
        var totalDateList = dataInfo.dateList;
        if (!totalDateList.length) {
          overviewVm.vitlChartHidden = true;
          return;
        }
        var dateVsMap = dataInfo.dateMap;
        var vsDefMap = dataInfo.defMap;
        var maxDate = dataInfo.maxDate;
        var minDate = dataInfo.minDate;
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
              },
              useHTML: true
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
                  sDataTemp.x = datestamp;
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
                    sDataTemp.y = tempNumb;
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

        var chart = Highcharts.chart('vitl-chart', {
          credits: {
            enabled: false
          },
          exporting:{
            enabled:false
          },
          chart: {
            spacingTop: 50
          },
          title: {
            text: ''
          },
          xAxis: {
            /* type: 'datetime',
            dateTimeLabelFormats: {
              day: '00',
              hour: '%H',
              minute: '%H:%m'
            },
            labels: {
              rotation: 0
            },
            min: minDate,
            max: maxDate,
            tickInterval: 2 * 60 * 60 * 1000, // 2hours in milliseconds
            endOnTick: true */
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
            x: -20,
            y: -50,
            itemDistance: 10,
            labelFormatter: function () {
              var tempStr = this.options.tooltip.valueSuffix || '';
              if (tempStr) {
                tempStr = tempStr.trim();
              }
              return this.name;// + tempStr;
            },
            verticalAlign: 'top',
            floating: true,
            backgroundColor:
              (Highcharts.theme && Highcharts.theme.legendBackgroundColor) ||
              '#FFFFFF'
          },
          series: seriesDef
        });
        overviewVm.vitlChartHidden = false;
        //console.log('initVitlChart -> seriesDef', seriesDef);
        return chart;
      }
      /**
       * 生成出入量统计图
       */
      function ioChartInit(ioDataList) {
        if (!ioDataList.length) {
          overviewVm.ioChartHidden = true;
          return;
        }
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
        var chart = Highcharts.chart('io-chart', {
          credits: {
            enabled: false
          },
          exporting:{
            enabled:false
          },
          chart: {
            spacingTop: 50
          },
          title: {
            text: ''
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
              text: 'ml/4小时',
              x: -60,
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
            y: -50,
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
        overviewVm.ioChartHidden = false;
        return chart;
      }

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
              }/*  ,
              {
                gradeType: 'ABC',
                seriesType: 'spline',
                dashStyle: 'shortDash',
                mainColor: Highcharts.getOptions().colors[0],
                seriesSymbol: 'triangle-down'
              } */
            ]
          },
          {
            gridLineWidth: true,
            typeIdx: 1,
            yAxisName: 'AIS/ISS',
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

      function initTotalScoChart(dataInfo) {
        var totalDateList = dataInfo.dateList;
        if (!totalDateList.length) {
          overviewVm.totalScoChartHidden = true;
          return;
        }
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
        //console.log('initScoChart -> seriesDef', seriesDef);
        //console.log('initScoChart -> codeSeriesMap', codeSeriesMap);
        var chart = Highcharts.chart('totalSco-chart', {
          credits: {
            enabled: false
          },
          exporting:{
            enabled:false
          },
          chart: {
            spacingTop: 50,
          },
          global: {
            // return time zone difference, in minutes, from current locale to UTC.
            timeZoneOffset: new Date().getTimezoneOffset()
          },
          title: {
            text: ''
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
            x: -20,
            y: -50,
            itemDistance: 10,
            labelFormatter: function () {
              var tempStr = this.options.tooltip.valueSuffix || '';
              if (tempStr) {
                tempStr = tempStr.trim();
              }
              return this.name;//+tempStr;
            },
            verticalAlign: 'top',
            floating: true,
            backgroundColor:
              (Highcharts.theme && Highcharts.theme.legendBackgroundColor) ||
              '#FFFFFF'
          },
          series: seriesDef
        });
        //console.log('initChart -> chart', chart);
        overviewVm.totalScoChartHidden = false;
        return chart;
      }

      /**
       *跳转生命体征分析图表
       */
      function toVitlChart() {
        var openTabName = _cstNam+'-生命体征分析',
            openTabUrl = '${baseurl}icucust/toVitlChart.do?liveNo=' + _liveNo+'&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       *跳转体征查询页
       */
      function toVitlInfoPage() {
        	var openTabName = _cstNam+'-生命体征-病情护理单',
            	openTabUrl = '${baseurl}icucust/icuquerynote.do?emgSeq=' + _liveNo+'&enterSource=0&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       *跳转出入量分析
       */
      function toIoChart() {
        var openTabName = _cstNam+'-出入量分析',
            openTabUrl = '${baseurl}icucust/toIoChart.do?liveNo=' + _liveNo+'&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /*
       *跳转出入量管理
       */
      function toIoDaInfoPage() {
        	var openTabName = _cstNam+'-出入量-病情护理单',
            	openTabUrl = '${baseurl}icucust/icuquerynote.do?emgSeq=' + _liveNo+'&enterSource=1&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       * 跳转医嘱信息
       */
      function toDaInfoPage() {
        var openTabName = _cstNam+'-医嘱信息',
            openTabUrl = '${baseurl}icucust/toquerycfxx.do?emgSeq=' + _liveNo+'&th=' + new Date().getTime();
        parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       * 跳转检验信息
       */
      function toExamPage() {
        var openTabName = _cstNam+'-检验信息',
            openTabUrl = '${baseurl}icucust/qjscaseexamine.do?emgSeq=' + _liveNo+'&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       * 跳转评分总览
       */
      function toBgInfoPage() {
        var openTabName = _cstNam+'-评分总览',
            openTabUrl = '${baseurl}icucust/toTotalScoChart.do?liveNo=' + _liveNo+'&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       * 跳转检查信息
       */
      function toInspPage() {
        var openTabName = _cstNam+'-检查报告',
            openTabUrl = '${baseurl}zyyqjs/queryjcbg.do?emgSeq=' + _liveNo+'&th=' + new Date().getTime();
        	parent.opentabwindow(openTabName, openTabUrl);
      }
      /**
       * 跳转预警阈值方法
       */
      function toObservationMngPage() {
        var modalTitle = event.target.innerText;
        var modalWidth = '500';
        var modalHeight = '390';
        var modalUrl = _baseUrl + 'icuvslmt/editVsLmt.do';
        createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, 'no');
        // window.top.addTab(_custName + " - " + "预警阈值管理", "${baseurl}icuvslmt/queryVsLmt.do?liveNo=" + _liveNo);
      }
      /**
       *预警阈值跳转
       */
      function modalReturnFun(modalType) {
        getAllInfo();
      }
      /**
       * 样式设定
       */
      function setLayout() {
        var cardMR = 30; // icu-card margin-left
        var cardMB = 20;
        var containerML = 2; // container margin-left
        var containerPT = 10;
        var borderW = 1;
        var winW = $(window).width();
        var winH = $(window).height();
        var cardH = (winH - containerPT) / 2 - cardMB - borderW * 2;
        var cardW = (winW - containerML) / 3 - cardMR - borderW * 2;
        overviewVm.cardH = cardH;
        overviewVm.cardW = cardW;
        $("#card-container").css("width",winW);
        $("#card-container").css("height",winH);
      }

      $(function () {
        var options = {

          chart: {
            type: 'xrange'
          },
          title: {
            text: '创伤诊疗过程'
          },
          xAxis: {
            type: 'datetime',
            tickInterval: 30 * 1000,
            dateTimeLabelFormats: {
              minute: '%H:%M',
            },

          },
          yAxis: {
            title: {
              text: ''
            },
            categories: ['ABCDE', 'AMPLE', 'CRASHPLAN','辅助检查'],
            reversed: true
          },
          tooltip: {
            dateTimeLabelFormats: {
              second: '%Y/%m/%d %H:%M'
            }
          },
          credits:{
            enabled:false
          },
          exporting:{
            enabled:false
          },
          series: [{
            name: '诊疗过程',
            // pointPadding: 0,
            // groupPadding: 0,
            borderColor: 'gray',
            pointWidth: 20,
            // pointInterval: 3600 * 1000,
            data: [{
              x: 1590558605000,
              x2: 1590559215000,
              y: 0,
              // partialFill: 0.25
            },
              {
              x: 1590559215000,
              x2: 1590559525000,
              y: 1
            },
              {
              x: 1590559525000,
              x2: 1590560445000,
              y: 2
            },
              {
                x: 1590560445000 ,
                x2: 1590561045000 ,
                y: 3
              }
            ],
            dataLabels: {
              enabled: true
            }

          }]
        };
        Highcharts.setOptions({
          global: {
            useUTC: false
          }
        });
        var chart = Highcharts.chart('container',options);

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
        getAllInfo();
      });

      /**
       * 初始化查询条件
       */
      function initQueryInfo() {
       /*  var curDatestamp = //new Date().getTime();
        var curDateStr = publicFun.timeFormat(curDatestamp, 'yyyy/MM/dd hh:mm:ss');
        var lastDatestamp = curDatestamp - DAY_MILLI_SEC;
        var lastDateStr = publicFun.timeFormat(lastDatestamp, 'yyyy/MM/dd hh:mm:ss'); */
        var emgDatstamp = eicuUtil.dateToGMT('${hspemginfCustom.emgDat}').getTime();
        var emgDatStr = publicFun.timeFormat(emgDatstamp, 'yyyy/MM/dd hh:mm:ss');
        var emgEndDatstamp = emgDatstamp + DAY_MILLI_SEC;
        var emgEndDatStr = publicFun.timeFormat(emgEndDatstamp, 'yyyy/MM/dd hh:mm:ss');
        queryInfo.startDate = emgDatStr;
        queryInfo.endDate = emgEndDatStr;
        queryInfo.interval = 'minute';//生命体征查询区间
        queryInfo.intervalIo = '';//出入量区间，输入数字或day，如'1','8',默认为4小时，
      }

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
              	 var sDefTempb = setSDefTemp(typeIdx,insideType);
              	 sDefTempb.type='spline';
              	 sDefTempb.color = Highcharts.getOptions().colors[0];
              	 sDefTempb.marker = {
	                symbol: 'triangle-down'
	              };
              	 sDefTempb.name = 'AIS评分';
              	 codeSeriesMap['AIS'] = sDefTempb;
              	 codeSeriesMap['AIS'].events = {
	            	click: function(e) {
	            	   var thisPoint = e.point;
	                   var thisData = dateScoMap[tempGradeType][thisPoint.index];
	                   var enterSourceArray = thisData.gradeSeq.split('-');
	           		   var enterSource = enterSourceArray?enterSourceArray[0]:'';
	                   openSco(enterSource,thisData.gradeSeq,thisData.gradeType,codeSeriesMap[tempGradeType].name,thisData.fldCod);
	                }
                }
              }
            }
			if (temp) {
              var sDataTemp = {};
              sDataTemp.x = parseInt(temp.gradeTime);
              if(tempGradeType=='ISS'){
              	var tempNuma = temp.gradeSco.split('|');
              	sDataTemp = [temp.gradeTime, parseFloat(tempNuma[0])];
              	codeSeriesMap['ISS'].data.push(sDataTemp);
              	sDataTemp = [temp.gradeTime, parseFloat(tempNuma[1])];
              	codeSeriesMap['AIS'].data.push(sDataTemp);
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
              valueSuffix: ' ' + '分'
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
	        reload();
	    }

	    function openSco(enterSource,gradeSeq,gradeType,modalTitle,fldCod){
            //var menuInfo = eicuUtil.getMenuInfo();
            var exChgInfo = {
            	enterSource: enterSource,//入口标志值，创伤中心-ABCDE为'CSABC'、创伤中心-体格检查为'CSCPN'、护理评估单为H、普通评分可不填
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
