<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<head>
  <base href="<%=basePath%>">
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>评分总览</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link
          rel="stylesheet"
          type="text/css"
          href="${baseurl}styles/eicu/eicu_common.css"
  />
  <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
  <script
          src="${baseurl}lib/avalon1.4.8/avalon.js"
          type="text/javascript"
          charset="UTF-8"
  ></script>
  <script
          src="${baseurl}lib/highcharts5.0.7/code/highcharts.js"
          type="text/javascript"
  ></script>
  <script
          src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js"
          type="text/javascript"
  ></script>
  <style>
    html {
      overflow: hidden;
    }

    body {
      overflow: hidden;
      background-color: #f9f9f9;
    }

    #total-sco-container {
      overflow-y: auto;
    }

    .medium-basic-card.basic {
      width: 200px;
      height: 150px;
      overflow: hidden;
    }

    .medium-basic-card.chart {
      width: 360px;
      height: 270px;
      overflow: hidden;
    }

    .medium-basic-card.basic .medium-basic-card-body {
      height: 110px;
      overflow: hidden;
    }

    .medium-basic-card.chart .medium-basic-card-body {
      /* padding-top: 20px;
    padding-left: 0;
    padding-bottom: 0; */
      padding: 0;
      height: 230px;
      overflow: hidden;
    }

    .medium-basic-card-title {
      height: 40px;
      font-size: 14px;
      display: flex;
      align-items: center;
      justify-content: center;
      line-height: 1;
    }

    .medium-basic-card-body .total-sco-box {
      height: 50px;
      line-height: 50px;
      font-size: 16px;
      font-weight: bold;
      color: #333;
    }

    .medium-basic-card-body .mod-info {
      text-align: left;
      font-size: 12px;
      color: #666;
    }

    .medium-basic-card-body .mod-info .info-label {
      display: inline-block;
      width: 68px;
      text-align: right;
    }

    .mod-user > span {
      display: inline-block;
      vertical-align: middle;
      height: 24px;
      line-height: 24px;
    }

    .mod-user > span .signPic {
      width: 100%;
      height: 100%;
    }

    .nursName {
      display: none;
      max-width: 100%;
    }
  </style>
</head>

<body ms-controller="scoreOverview">
<div
        id="total-sco-container"
        ms-css-visibility="{{ showBody ? 'visible' : 'hidden' }}"
>
  <div
          ms-repeat-scoinfo="totalList"
          class="medium-basic-card"
          ms-class-1="{{ pDisplayMode }}"
          ms-click="toScoPage(scoinfo)"
          data-repeat-rendered="renderCharts"
  >
    <div
            class="medium-basic-card-title"
            ms-class-1="{{ scoinfo.riskColor }}"
    >
      <span>{{ scoinfo.scoName }}</span>
    </div>
    <div ms-if="pDisplayMode === 'basic'" class="medium-basic-card-body">
      <div class="total-sco-box">
            <span ms-if="scoinfo.liveNo" class="total-sco">
              <span class="info-label total-sco-label">最新评分：</span>
              <span>{{ scoinfo.gradeSco + (scoinfo.notNumFlag ? '' : ' 分') }}</span>
            </span>
        <span ms-if="!scoinfo.liveNo" class="total-sco">
              <span class="info-label total-sco-label">无最新评分</span>
            </span>
      </div>
      <div ms-if="scoinfo.liveNo" class="mod-info">
        <div class="mod-time">
          <span class="info-label mod-time-label">评分时间：</span>
          <span>{{ scoinfo.gradeTimeStr }}</span>
        </div>
        <div span class="mod-user">
          <span class="info-label mod-user=label">评分人：</span>
          <span>
                <img
                        class="signPic"
                        ms-attr-src="{{
                    '${baseurl}images/eicu/signPic/' + scoinfo.imgSrc
                  }}"
                        ms-attr-title="scoinfo.nursName"
                        onerror="signPicError()"
                />
                <span class="nursName">{{ scoinfo.nursName }}</span>
              </span>
        </div>
      </div>
    </div>
    <div ms-if="pDisplayMode === 'chart'" class="medium-basic-card-body">
      <div ms-attr-id="{{ scoinfo.chartId }}"></div>
    </div>
  </div>
</div>
<script type="text/javascript">
  //全局变量
  // console.log('eicuUtil from page totalScoPage')
  // console.log('eicuUtil', )
  var ptBasicInfo = {};//eicuUtil.ptBasicInfo;
  var _liveNo = '${liveNo}';//ptBasicInfo.liveNo;
  var _custNo = '';//ptBasicInfo.custNo;
  var _custName = '';//ptBasicInfo.custName;
  var _gradeType = '';//'${gradeType}' || eicuUtil.setOuterInfo().gradeType;
  var _userid = '${activeUser.usrno}';
  var scoreWin;
  var chartInfoMap;
  //debugger
  // console.log(window.top, window.self);
  // console.log(window.top[0] === window.self);
  if(eicuUtil.isOuterSys) {
    // console.log('outer');
    eicuUtil = parent.eicuUtil;
    urlInfo = eicuUtil.setOuterInfo(); // 页面为父子嵌套，liveNo只在外层父页面的url中传有
    _liveNo = urlInfo.liveNo;
    eicuUtil.queryPtBasicInfoFromOuter(_liveNo);
    _custNo = eicuUtil.ptBasicInfo.custNo;
    _custName = eicuUtil.ptBasicInfo.custName;
    _gradeType = eicuUtil.setOuterInfo().gradeType;
    // console.log('_gradeType', _gradeType);
    _userid = '${activeUser.usrno}';
  } else {
    ptBasicInfo = eicuUtil.ptBasicInfo;
    _liveNo = '${liveNo}'; //ptBasicInfo.liveNo;
    _custNo = ptBasicInfo.custNo;
    _custName = ptBasicInfo.custName;
    _gradeType = '${gradeType}';
    _userid = '${activeUser.usrno}';
  }
</script>
<script type="text/javascript">
  var menuInfoObj; //菜单信息
  var menuInfoMap; //菜单信息映射
  var vm = avalon.define({
    $id: 'scoreOverview',
    pModuleId: sessionStorage.getItem('icutoken') ? window.top._curModuleType : '',
    showBody: false,
    // parent.vm ? '' :
    pDisplayMode: 'basic',
    totalList: [], //总分内容
    renderCharts: function () {
      if (vm.pDisplayMode === 'basic') {
        return;
      }
      // render all charts
      var thisChartInfo;
      var gradeType;
      var chartId;
      vm.totalList.forEach(function (scoInfo) {
        gradeType = scoInfo.gradeType;
        chartId = scoInfo.chartId;
        thisChartInfo = chartInfoMap[gradeType];
        $('#' + chartId).css({
          width: 360,
          height: 240 // card-body minus paddingtop
        });
        if (thisChartInfo.options) {
          // render chart && save chart instance
          thisChartInfo.instance = Highcharts.chart(
                  chartId,
                  thisChartInfo.options
          );
        }
      });
    },
    toScoPage: function (scoInfo) {
      //console.log("toScoPage", scoInfo);
      // 跳转对应评分基本模式
      var thisMenuInfo = menuInfoMap[scoInfo.gradeType];
      icuTabUtil.openTab(thisMenuInfo, ptBasicInfo, {
        pageType: 'totalPage',
        pageData: {
          liveNo: '${liveNo}',
          displayMode: vm.pDisplayMode
        }
      });
    }
  });
  parent.vm.$watch('displayMode', function (newV, oldV) {
    // if (newV !== 'oldV') {
    //   vm.showBody = false;
    //   vm.pDisplayMode = 'newV';
    //   getAllInfo();
    // }
    if (newV !== 'basic') {
      vm.showBody = false;
      vm.pDisplayMode = 'chart';
      getAllInfo();
    }else  {
      vm.showBody = false;
      vm.pDisplayMode = 'basic';
      getAllInfo();
    }
  });
  /**
   *获取信息
   */
  function getAllInfo() {
    var pDisplayMode = vm.pDisplayMode;
    var reqUrl = _baseUrl + 'icuscore/queryTotalScoByMenu.do';
    // console.log('menuInfoMap, _gradeType', menuInfoMap, _gradeType);
    var reqParams = {
      liveNo: '${liveNo}',
      gradeType: _gradeType,
      menuRoot: menuInfoMap[_gradeType].menuRoot
    };
    console.log(menuInfoMap,666)
    // if (pDisplayMode === 'chart') {
    reqParams.flag = pDisplayMode;

    // }
    publicFun.ajaxLoading('刷新中')
    publicFun.httpRequest(
            reqUrl,
            reqParams,
            {
              requestType: 'json'
            },
            function (res) {
              if (!res.resultInfo.success) {
                return publicFun.alert('请求出错，请联系管理员');
              }
              publicFun.ajaxLoadEnd()
              // reset chart options map
              chartInfoMap = {};
              var sysdata = res.resultInfo.sysdata;
              var totalList;
              var totalMap;
              var curGradeList;
              var thisItemInfo;
              var scoNameArr;
              var signInfoArr;
              vm.totalList.clear();
              if (pDisplayMode === 'basic') {
                // traverse data & exclude ETOTAL&&GTOTAL
                totalList = sysdata.gradeList.filter(function (scoInfo) {
                  thisItemInfo = menuInfoMap[scoInfo.gradeType];
                  scoInfo.scoName = thisItemInfo.menuName;
                  if (scoInfo.gradeSco !== null && scoInfo.gradeSco.match(/[^1-9]/)) {
                    // 非数字类型分数
                    scoInfo.notNumFlag = true;
                  } else {
                    scoInfo.notNumFlag = false;
                  }
                  if (scoInfo.liveNo) {
                    signInfoArr = scoInfo.gradeUser.split('|');
                    scoInfo.nursName = signInfoArr[0];
                    scoInfo.imgSrc = signInfoArr[1];
                  } else {
                    scoInfo.nursName = '';
                    scoInfo.imgSrc = '';
                  }
                  return scoInfo.gradeType !== _gradeType;
                });
              } else if (pDisplayMode === 'chart') {
                // generate chart opt map
                totalMap = sysdata.gradeMap;
                totalList = sysdata.typeList.map(function (type) {
                  thisItemInfo = menuInfoMap[type];
                  curGradeList = totalMap[type] || [];
                  chartInfoMap[type] = {};
                  chartInfoMap[type].options = setChartOptions(curGradeList);
                  return {
                    chartId: type,
                    gradeType: type,
                    scoName: thisItemInfo.menuName,
                    riskColor: curGradeList[0]
                            ? curGradeList[curGradeList.length - 1].riskColor
                            : 'fake'
                  };
                });
              }
              vm.totalList = totalList;
              vm.showBody = true;
            }
    );
  }
  /**
   * set chart options
   */
  function setChartOptions(dataList) {
    var chartOptions;
    var seriesData;
    var yAxisLmtInfo;
    var userInfoList;
    if (dataList.length === 0) {
      chartOptions = null;
    } else {
      yAxisLmtInfo = dataList[0].yAxisVal;
      seriesData = dataList.map(function (ele, idx) {
        var dataInfo = {
          y: parseFloat(ele.gradeSco) || 0
        };
        if (ele.itemName) {
          dataInfo.className = ele.riskColor;
          ele.riskClassName = dataInfo.className;
        }
        /*otherInfo*/
        userInfoList = ele.gradeUser.split('|');
        ele.gradeUserStr = userInfoList[0] || '';
        ele.userImgSrc =
                _baseUrl + 'images/eicu/signPic/' + (userInfoList[1] || '');
        return dataInfo;
      });
      chartOptions = {
        chart: {
          spacingTop: 25,
          backgroundColor: '#f9f9f9' //#e4efff
        },
        credits: false,
        title: {
          text: ''
        },
        legend: {
          enabled: false
        },
        xAxis: {
          startOnTick: false,
          showEmpty: true,
          allowDecimals: false,
          tickAmount: 10,
          tickColor: '#666',
          lineColor: '#666',
          gridLineColor: '#eee',
          tickInterval: 1
        },
        yAxis: {
          showEmpty: true,
          allowDecimals: false,
          title: {
            text: '评分',
            margin: 0,
            align: 'high',
            offset: 0,
            rotation: 0,
            y: -10
          },
          tickColor: '#666',
          lineColor: '#666',
          lineWidth: 1,
          tickPositioner: function () {
            var tickPositions = this.tickPositions;
            var lastTick = tickPositions[tickPositions.length - 1];
            var max = this.options.max;
            if (max && lastTick > max) {
              tickPositions.pop(); // remove last tick
              tickPositions.push(max);
            }
          }
        },
        series: [
          {
            pointStart: 1,
            name: dataList[0].itemName,
            data: seriesData,
            tooltip: {
              headerFormat: '',
              hideDelay: 100,
              pointFormatter: function () {
                var str = '';
                str += '<span style="font-weight: bold">时间：</span>';
                str += dataList[this.index].gradeTimeStr;
                str += '<br>';
                str += '<span style="font-weight: bold">评分人：</span>';
                str += dataList[this.index].gradeUserStr;
                str += '<br>';
                str += '<span style="font-weight: bold">评分：</span>';
                str += this.y;
                str += '<br>';
                str += '<span style="font-weight: bold">次数：</span>';
                str += this.index + 1;
                return str;
              }
            }
          }
        ]
      };
      if (yAxisLmtInfo) {
        yAxisLmtInfo = yAxisLmtInfo.split('|');
        chartOptions.yAxis.max = parseInt(yAxisLmtInfo[0]);
        chartOptions.yAxis.min = parseInt(yAxisLmtInfo[1]);
      }
    }
    return chartOptions;
  }
  /**
   *获取菜单映射
   */
  function getMenuInfo() {
    var thisItemInfo;
    var icuMenu = {};
    // if(eicuUtil.isOuterSys) {
    //   eicuUtil.initMenu(100000);
    // }
    icuMenu = JSON.parse(sessionStorage.getItem('icuMenu'));
    // console.log('icuMenu', icuMenu);
    menuInfoObj = icuMenu['menuInfoObj'];
    menuInfoMap = {};
    for (var k in menuInfoObj) {
      if (menuInfoObj.hasOwnProperty(k)) {
        thisItemInfo = menuInfoObj[k];
        thisItemInfo['pageval'] = k;
        menuInfoMap[thisItemInfo.menuType] = thisItemInfo;
      }
    }

  }
  /**
   *布局页面
   */
  function setLayout() {
    var windowW = $(window).width() - 5; //获取宽度出错
    var windowH = $(window).height();
    var mainViewH = windowH - 5;
    $('#total-sco-container').outerHeight(mainViewH);

  }
  /**
   * 图片加载错误
   */
  function signPicError() {
    var _this = event.target;
    console.error('么的图片啊');
    $(_this).hide().next().show();
  }
  $(function () {
    // test
    setLayout();
    getMenuInfo();
    getAllInfo();
  });
</script>
</body></html
>
