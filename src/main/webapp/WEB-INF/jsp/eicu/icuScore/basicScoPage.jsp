<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>GCS评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css"/>
<%--  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%> --%>
  <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts.js" type="text/javascript"></script>
  <script src="${baseurl}lib/highcharts5.0.7/code/highcharts-zh_CN.js" type="text/javascript"></script>
  <style>
    body {
      overflow: auto;
    }

    #container {
      height: 100vh;
      overflow-x: auto;
      overflow-y: auto;
    }

    .page-title {
      padding: 5px;
      font-size: 14px;
      font-weight: bold;
      text-align: center;
    }

    #sco-container {
      margin-top: 6px;
      margin-bottom: 10px;
      padding: 0 10px;
    }

    #sco-container table {
      table-layout: fixed;
      /* margin: 0 auto; */
    }

    #sco-container table colgroup col {
      width: 90px;
    }

    #sco-container table colgroup col.title-first {
      width: 80px;
    }

    #sco-container table colgroup col.title-second {
      width: 80px;
    }

    #sco-container table colgroup col.title-third {
      width: 100px;
    }

    #sco-container table tr th {
      text-align: left;
    }

    #sco-container table tr th,
    #sco-container table tr td {
      padding: 5px;
      border: 1px solid #666;
    }

    #sco-container table tr td.total-sco-td {
      font-weight: bold;
      font-size: 14px;
    }

    #sco-container table tr td.edit-col {
      text-align: center;
    }

    #sco-container table tr .edit-col.hover-in {
      background-color: rgb(234, 242, 255);
    }

    #sco-container table tr .edit-col.active {
      background-color: #fdff65;
    }

    table tr td .signPic {
      width: 12mm;
      height: 6mm;
    }

    table tr td .signPic ~ span {
      display: none;
      width: 100%;
    }

    /*图表样式*/
    #chart-container {
      padding: 0 10px;
      box-sizing: border-box;
    }

    #chart-container .page-title {
      margin: 0 auto;
    }

    .chart-content-part {
      margin: 5px 10px;
      padding: 10px;
      border: 1px solid #ddd;

      border-radius: 10px;
    }

    #chart-box {
      background: #f9f9f9;
      box-shadow: 0 0 5px 5px #ddd;
    }

    #chart-grid-box {
      padding: 10px 0;
      overflow-y: auto;
    }
    #chart-grid-box .grid-title {
      font-size: 14px;
      font-weight: bold;
      text-align: center;
    }
    #chart-grid-box .grid-content {
      overflow-y: auto;
    }
    #chart-grid-box .icu-table {
      margin-left: 15px;
    }
    #chart-grid-box .icu-table tbody>tr:first-child td {
      border-top: none;
    }
    /*特殊*/
    .text-right {
      text-align: right;
    }
  </style>
</head>

<body ms-controller="scoreQuery">
<div
    id="container"
    ms-css-visibility="{{ showBody ? 'visible' : 'hidden' }}"
>
  <div
      ms-visible="pDisplayMode==='basic'"
      id="sco-container"
      ms-css-width="tableWidth"
  >
    <table ms-css-width="tableWidth" class="table-container sticky-table">
      <caption class="page-title">
        {{ pageName }}
      </caption>
      <colgroup>
        <col class="basic-col title-first" />
        <col class="basic-col title-second" />
        <col class="basic-col title-third" />
        <col class="basic-col title-score" />
        <col ms-repeat="timeList" />
      </colgroup>
      <thead class="sticky-table__row">
      <tr>
        <th
            class="sco-item-header sticky-table__col"
            rowspan="2"
            ms-attr-colspan="{{ tableType === 'specific' ? '2' : '3' }}"
        >评分项目</th
        >
        <th ms-if="tableType === 'specific'" rowspan="2" class="sticky-table__col">评分区间</th>
        <th class="sco-header sticky-table__col" rowspan="2">分值</th>
        <th ms-if="timeList.length" ms-attr-colspan="timeList.length"
        >评分时间</th
        >
      </tr>
      <tr id="time-list-title">
        <th
            ms-repeat="timeList"
            ms-class-1="{{ 'edit-col time' + $index }}"
            ms-class-2="{{ hoverIdx === $index ? 'hover-in' : '' }}"
            ms-class-3="{{ selectIdx === $index ? 'active' : '' }}"
            ms-mouseenter="timeHoverIn($index)"
            ms-mouseleave="timeHoverOut($index)"
            ms-dblclick="timeColDblClick($index)"
            ms-click="timeColClick($index)"
        >
          {{ el.gradeTimeStr }}
        </th>
      </tr>
      </thead>
      <tbody>
      <tr ms-repeat-iteminfo="totalList">
        <th
            ms-if="iteminfo.rootSelfIdx===0"
            ms-attr-rowspan="{{ iteminfo.rootSpanNumb }}"
            ms-attr-colspan="{{ iteminfo.secNodeName ? '1' : '3' }}"
            class="sticky-table__col"
        >
          {{ iteminfo.rootName }}
        </th>
        <th
            ms-if="iteminfo.secNodeName && ((iteminfo.thirdNodeName && iteminfo.secSelfIdx===0) || !iteminfo.thirdNodeName)"
            ms-attr-colspan="{{ iteminfo.thirdNodeName ? '1' : '2' }}"
            ms-attr-rowspan="{{
                  iteminfo.thirdNodeName ? iteminfo.secSpanNumb : '1'
                }}"
            class="sticky-table__col"
        >
          <div
              style="word-break: break-all;"
              ms-attr-title="{{ iteminfo.secNodeName }}"
          >
            {{ iteminfo.secNodeName }}
          </div>
        </th>
        <th ms-if="iteminfo.thirdNodeName" class="sticky-table__col">
                <span>
                  {{ iteminfo.thirdNodeName }}
                </span>
        </th>
        <th class="sticky-table__col">{{ iteminfo.scoreMemo }}</th>
        <td
            ms-repeat-scoel="iteminfo.scoTimeList"
            ms-class-1="{{ 'edit-col time' + $index }}"
            ms-class-2="{{ hoverIdx === $index ? 'hover-in' : '' }}"
            ms-class-3="{{ selectIdx === $index ? 'active' : '' }}"
            ms-class-4="{{ scoel ? 'td-checked' : '' }}"
            ms-mouseenter="timeHoverIn($index)"
            ms-mouseleave="timeHoverOut($index)"
            ms-dblclick="timeColDblClick($index)"
            ms-click="timeColClick($index)"
        >
          {{
          scoel
          ? iteminfo.lmtFlag !== '#'
          ? scoel.itemValue
          : '√'
          : ''
          }}
        </td>
      </tr>
      </tbody>
      <tbody ms-if="totalScoInfo.scoTimeList">
      <tr>
        <!-- 总分 -->
        <th
            ms-attr-colspan="totalScoInfo.scoreMemo === '#' ? '4' : '3'"
            class="sticky-table__col"
        >{{ totalScoInfo.itemName }}</th
        >
        <th ms-if="totalScoInfo.scoreMemo !== '#'" class="sticky-table__col">{{
          totalScoInfo.scoreMemo
          }}</th>
        <td
            ms-repeat-scoel="totalScoInfo.scoTimeList"
            class="total-sco-td"
            ms-class-1="{{ 'edit-col time' + $index }}"
            ms-class-2="{{ hoverIdx === $index ? 'hover-in' : '' }}"
            ms-class-3="{{ selectIdx === $index ? 'active' : '' }}"
            ms-class-4="{{ scoel.riskColor }}"
            ms-mouseenter="timeHoverIn($index)"
            ms-mouseleave="timeHoverOut($index)"
            ms-dblclick="timeColDblClick($index)"
            ms-click="timeColClick($index)"
        >
          {{ scoel.itemValue }}
        </td>
      </tr>
      </tbody>
      <tbody ms-if="signInfo.scoTimeList">
      <tr>
        <!-- 签名详情 -->
        <th colspan="4" class="sticky-table__col">{{ signInfo.itemName }}</th>
        <td
            ms-repeat-scoel="signInfo.scoTimeList"
            ms-class-1="{{ 'edit-col time' + $index }}"
            ms-class-2="{{ hoverIdx === $index ? 'hover-in' : '' }}"
            ms-class-3="{{ selectIdx === $index ? 'active' : '' }}"
            ms-mouseenter="timeHoverIn($index)"
            ms-mouseleave="timeHoverOut($index)"
            ms-dblclick="timeColDblClick($index)"
            ms-click="timeColClick($index)"
        >
          <img
              class="signPic"
              ms-attr-src="{{
                    '${baseurl}images/eicu/signPic/' + scoel.imgSrc
                  }}"
              ms-attr-title="scoel.nursName"
              onerror="signPicError()"
          />
          <span>{{ scoel.nursName }}</span>
        </td>
      </tr>
      </tbody>
    </table>
  </div>
  <div ms-visible="pDisplayMode === 'chart'" id="chart-container">
    <div class="chart-box-title page-title">{{ pageName }}</div>
    <div
        class="chart-box-content"
        style="display:flex;align-items: center;"
    >
      <div
          id="chart-box"
          class="chart-content-part"
          ms-css-width="containerW-380"
      >
        <div
            id="chart-div"
            ms-css-height="containerH - 70"
            ms-css-width="containerW-380-70"
        ></div>
      </div>
      <div
          id="chart-grid-box"
          class="chart-content-part"
          ms-css-height="containerH - 70"
          style="width:330px"
      >
        <div class="grid-title">
              <span class="grid-title">
                评分记录
              </span>
          <table class="icu-table">
            <colgroup>
              <col style="width:115px" />
              <col style="width:65px" />
              <col style="width:75px; text-align:right" />
              <col style="width:40px;text-align:right" />
            </colgroup>
            <thead>
            <tr>
              <th>时间</th>
              <th>评分人</th>
              <th>评分</th>
              <th>次数</th>
            </tr>
            </thead>
          </table>
        </div>

        <div class="grid-content" ms-css-height="containerH - 120">
          <table class="icu-table">
            <colgroup>
              <col style="width:115px" />
              <col style="width:65px" />
              <col style="width:75px;text-align:right" />
              <col style="width:40px;text-align:right" />
            </colgroup>
            <tbody>
            <tr
                ms-repeat="totalList"
                ms-class-1="{{ selectIdx === $index ? 'active' : '' }}"
                ms-class-2="{{ 'chart-tr' + $index }}"
                ms-dblclick="timeColDblClick($index)"
                ms-click="timeColClick($index)"
            >
              <td>{{ el.gradeTimeStr }}</td>
              <td>
                <img
                    class="signPic"
                    ms-attr-src="{{ el.userImgSrc }}"
                    ms-attr-title="{{ el.gradeUserStr }}"
                    onerror="signPicError()"
                />
                <span style="display:none">{{ el.gradeUserStr }}</span>
              </td>
              <td class="text-right" ms-class-1="{{ el.riskClassName }}">{{
                el.gradeSco
                }}</td>
              <td class="text-right">{{ $index + 1 }}</td>
            </tr>
            </tbody>
          </table>
        </div>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
  //全局变量
  // if(eicuUtil.isOuterSys) {
    eicuUtil = parent.eicuUtil;
  // }
  var ptBasicInfo = eicuUtil.ptBasicInfo;
  var _liveNo = '${liveNo}';
  var _gradeSeq = '${gradeSeq}';
  var _gradeType = '${gradeType}';
  var _gradeItemDef = [];
  var _gradeList = [];
  var curMenuInfo;
</script>
<script type="text/javascript">
  var $clickedEl = null; //选中列

  var menuInfoObj = eicuUtil.getMenuInfo();
  var curMenuInfo; // find in ready func
  var defFieldMap = {}; // 请求获取原始field-map
  var vmFieldMap = {}; // field-def映射
  var dblClickLock = false; //双击标志
  var chartInstance;

  var vm = avalon.define({
    $id: 'scoreQuery',
    pDisplayMode: parent.vm.displayMode,
    showBody: false,
    tableType: 'basic', // basic || specific 打勾模式和具体评分
    containerW: $(window.document).width(),
    containerH: $(window.document).height(), // 容器高度
    tableWidth: 'auto', // 表格宽度
    pageName: '', //页面信息
    timeLength: 0,
    timeList: [], //时间列表
    totalList: [], //以父元素为基点的列表
    totalScoInfo: {}, //总分信息
    signInfo: {}, //签名信息
    hoverIdx: '', //悬停序号
    selectIdx: '', //选中序号
    timeHoverIn: function(idx) {
      vm.hoverIdx = idx;
    },
    timeHoverOut: function(idx) {
      vm.hoverIdx = '';
    },
    timeColClick: function(idx) {
      var thisClass = 'time' + idx;
      setTimeout(function() {
        //不是双击，进行单击操作
        if (!dblClickLock) {
          if (idx === vm.selectIdx) {
            resetClickedCol();
          } else {
            vm.selectIdx = idx;
            if (vm.pDisplayMode === 'basic') {
              $clickedEl = $('.' + thisClass);
              $clickedEl.data('gradeseq', vm.timeList[idx]['gradeSeq']);
            } else {
              $clickedEl = $('.chart-tr' + idx);
              $clickedEl.data('gradeseq', vm.totalList[idx]['gradeSeq']);
            }
          }
        }
      }, 20);
    },
    timeColDblClick: function(idx) {
      dblClickLock = true;
      // if (idx !== vm.selectIdx) {
      vm.selectIdx = idx;
      if (vm.pDisplayMode === 'basic') {
        $clickedEl = $('.time' + idx);
        $clickedEl.data('gradeseq', vm.timeList[idx]['gradeSeq']);
      } else {
        $clickedEl = $('.chart-tr' + idx);
        $clickedEl.data('gradeseq', vm.totalList[idx]['gradeSeq']);
      }
      // }
      parent.custOpenModal('edit'); //调用父元素修改方法
      setTimeout(function() {
        dblClickLock = false;
      }, 100);
    }
  });
  /**
   * displayMode wathcer
   */
  parent.vm.$watch('displayMode', function(newV, oldV) {
    if (newV !== 'oldV') {
      vm.showBody = false;
      vm.pDisplayMode = newV;
      vm.totalList.clear();
      getAllInfo();
    }
  });
  /**
   * 取字典数据
   */
  function getDictInfo() {
    vm.showBody = false;
    var reqUrl = '${baseurl}icuscore/getGradeItemDef.do';
    var reqParams = {
      gradeType: _gradeType
    };
    publicFun.httpRequest(
        reqUrl,
        reqParams,
        {
          asyncFlag: false
        },
        function(res) {
          if (!res.resultInfo.success) {
            alert_error('请求出错，请联系管理员');
          }
          var sysdata = res.resultInfo.sysdata;
          var defList = sysdata.itemDef;
          var itemFlag; // temp str
          var totalScoInfo = {}; // 总分信息
          var signInfo = {}; // 签名信息
          var temp;
          var defTotalList = []; // 项目总列表
          defFieldMap = {}; // 重置父级映射
          defList.forEach(function(defInfo, defIdx) {
            defInfo = $.extend(true, {}, defInfo);
            itemFlag = defInfo.itemFlag;
            defFieldMap[defInfo.itemField] = defInfo;
            if (defInfo.itemName === 'NULL') {
              defInfo.itemName = '';
            }
            if (itemFlag === 'T') {
              // 复制总分，并生成签名信息
              totalScoInfo = $.extend({}, defInfo);
              signInfo = $.extend({}, totalScoInfo);
              signInfo.itemField = 'NURS_SIGN';
              signInfo.itemName = '签名';
              signInfo.scoreValue = '#';
              signInfo.itemSort++; // 自定义 sort number
              signInfo.scoTimeList = [];
              totalScoInfo.scoTimeList = [];
              if (totalScoInfo.scoreMemo && totalScoInfo.scoreMemo !== '#') {
                totalScoInfo.scoreMemo = totalScoInfo.scoreMemo.split('|')[0];
              }
            } else if (itemFlag === '1') {
              // 初级父元素
              defInfo.rootRowNumb = 0; // 行数
            } else if (itemFlag === '2') {
              // 二级父元素
              defInfo.secRowNumb = 0;
            } else if (itemFlag === '9') {
              // he
              // 尾端分值元素
              temp = defFieldMap[defInfo.itemRoot];
              defInfo.secNodeName = defInfo.itemName;
              defInfo.secSelfIdx = 0;
              if (temp.itemFlag === '2') {
                // 父级为二级元素
                // 二级类序号
                defInfo.secSelfIdx = temp.secRowNumb++;
                defInfo.secField = temp.itemField;
                if (temp.itemName) {
                  if (defInfo.secNodeName) {
                    // 如果末节点与二级节点同时有不同的名称，构造三级节点
                    defInfo.thirdNodeName = defInfo.itemName;
                    defInfo.thirdField = '';
                  }
                  defInfo.secNodeName = temp.itemName;
                }
                temp = defFieldMap[temp.itemRoot];
              }
              // 根类行序号
              defInfo.rootSelfIdx = temp.rootRowNumb++;
              defInfo.rootField = temp.itemField;
              defInfo.rootName = temp.itemName;
              defInfo.rootSpanNumb = 1; // 根合并行数默认1
              defInfo.secSpanNumb = 1; // 二级合并行数默认1
              defInfo.thirdSpanNumb = 1; // 三级合并行数默认1
              defInfo.scoTimeList = [];
              defTotalList.push(defInfo);
            }
          });
          window._gradeItemDef = sysdata.itemDef;
          Object.freeze && Object.freeze(window._gradeItemDef);
          vm.totalScoInfo = totalScoInfo;
          vm.signInfo = signInfo;
          vm.totalList = defTotalList;
        }
    );
  }
  /**
   * getTableInfo
   *
   * @param {boolean|undefined} isPrint
   */
  function getTableInfo(isPrint) {
    var requestData = {
      gradeType: _gradeType,
      liveNo: _liveNo,
    };

    if (isPrint === true)  requestData.flag = 'print';

    return publicFun.httpRequest(
        _baseUrl + 'icuscore/queryScoreInfo.do',
        requestData,
        {
          requestType: 'json'
        },
        function(res) {
          if (!res.resultInfo.success) {
            alert_error('请求出错，请联系管理员');
            return;
          }
          _gradeList = res.resultInfo.sysdata.gradeList;
          if (isPrint) return;
          resetClickedCol();
          var timeInfoList = res.resultInfo.sysdata.gradeList;
          var timeLength = timeInfoList.length;
          var timeList = []; //时间list
          var nursSignArr = []; //签名分割内容
          var fieldScoListMap = {}; // field-scoTimeList

          // 清空所有数据并生成map
          vmFieldMap = {};
          vm.totalList.forEach(function(itemInfo) {
            var temp = timeInfoList.map(function() {
              return '';
            });
            if (itemInfo.rootSelfIdx === 0) {
              // 首元素增加合并行数
              itemInfo.rootSpanNumb =
                  defFieldMap[itemInfo.rootField].rootRowNumb;
            }
            if (itemInfo.secField && itemInfo.secSelfIdx === 0) {
              // 非伪造次级首元素增加合并行数
              itemInfo.secSpanNumb =
                  defFieldMap[itemInfo.secField].secRowNumb;
            }
            if (vm.tableType === 'specific') {
              // MODS-like
              if (!vmFieldMap[itemInfo.itemField]) {
                vmFieldMap[itemInfo.itemField] = [];
              }
              vmFieldMap[itemInfo.itemField].push(itemInfo);
            } else {
              vmFieldMap[itemInfo.itemField] = itemInfo;
            }
            itemInfo.scoTimeList = temp;
          });
          vm.signInfo.scoTimeList.clear();
          vm.totalScoInfo.scoTimeList.clear();
          //循环时间顺序数据列表
          if (!timeInfoList || timeInfoList.length === 0) {
            // 最新数据为空，清空原数据
            vm.totalList.forEach(function(itemInfo) {
              itemInfo.scoTimeList.clear();
            });
            vm.totalScoInfo.scoTimeList.clear();
            vm.signInfo.scoTimeList.clear();
          } else {
            timeInfoList.forEach(function(thisTimeInfo, thisTimeIdx) {
              //按照时间和类别分类字典内容数据
              var itemList = thisTimeInfo.itemList;
              var gradeSeq = thisTimeInfo.gradeSeq;
              var temp = {};
              var itemField;
              // 复制除了itemList以外的时间信息
              $.each(thisTimeInfo, function(k, v) {
                if (thisTimeInfo.hasOwnProperty(k) && k !== 'itemList') {
                  temp[k] = v;
                }
              });
              // 插入时间
              timeList.push(temp);
              // 处理时间对应的评分项
              itemList.forEach(function(thisTimeThisItemInfo) {
                itemField = thisTimeThisItemInfo.itemField;
                if (vm.totalScoInfo.itemField === itemField) {
                  // 总分增加风险评级
                  thisTimeThisItemInfo = $.extend(thisTimeThisItemInfo, {
                    riskColor: thisTimeInfo.riskColor,
                    riskType: thisTimeInfo.riskType,
                    riskDesc: thisTimeInfo.riskDesc
                  });
                  // 处理当前总分
                  vm.totalScoInfo.scoTimeList.splice(
                      thisTimeIdx,
                      1,
                      thisTimeThisItemInfo
                  );
                } else {
                  if (vm.tableType === 'specific') {
                    // MODS-like
                    // thisTimeThisItemInfo.lmtFlag = '1';
                    vmFieldMap[itemField]
                        .filter(function(ele, idx, arr) {
                          if (ele.lmtFlag === '1') {
                            return (
                                thisTimeThisItemInfo.itemValue >= ele.lmtValue
                            );
                          } else if (ele.lmtFlag === '2') {
                            return (
                                thisTimeThisItemInfo.itemValue <= ele.lmtValue
                            );
                          }
                        })[0]
                        .scoTimeList.splice(
                        thisTimeIdx,
                        1,
                        thisTimeThisItemInfo
                    );
                  } else {
                    vmFieldMap[itemField].scoTimeList.splice(
                        thisTimeIdx,
                        1,
                        thisTimeThisItemInfo
                    );
                  }
                }
              });
              //处理时间签名
              nursSignArr = thisTimeInfo.gradeUser.split('|');
              vm.signInfo.scoTimeList.splice(thisTimeIdx, 1, {
                nursName: nursSignArr[0],
                imgSrc: nursSignArr[1]
              });
            });
          }
          vm.timeLength = timeLength;
          vm.timeList = timeList;
          // 数量乘以单个宽度80px，计算表格总宽度
          vm.tableWidth = 300 + 50 + vm.timeList.length * 80;
          vm.showBody = true;
        }
    );
  }
  /**
   * getChartInfo
   */
  function getChartInfo() {
    var reqUrl = _baseUrl + 'icuscore/queryTotalScoByMenu.do';
    var menu = eicuUtil.findMenuInfoByParam(_gradeType);
    var reqParams = {
      liveNo: _liveNo,
      gradeType: _gradeType,
      menuRoot:menu.menuRoot,
      flag: 'single'
    };
    publicFun.httpRequest(
        reqUrl,
        reqParams,
        {
          requestType: 'json'
        },
        function(res) {
          if (!res.resultInfo.success) {
            alert_error('请求出错，请联系管理员');
            return;
          }
          var sysdata = res.resultInfo.sysdata;
          var gradeMap = sysdata.gradeMap;
          var dataList = gradeMap[_gradeType] || [];
          var chartOptions;
          var seriesData;
          var yAxisLmtInfo;
          var userInfoList;
          console.log(dataList)
          if (!dataList.length) {
            // fake min and max
            yAxisLmtInfo = '0|0'
          } else {
            yAxisLmtInfo = dataList[0].yAxisVal;
          }

          /**
           * @param {string} gradeSco "Ex+Vx+Mx" | "12+T"
           * @return {number | string} "num[+T]" 数字或者数字加T
           */
          function gradeScoHandler(gradeSco){
            const scoReg = /^E(\d)\+V(\d|T)\+M(\d)$/
            if(scoReg.test(gradeSco)){
              const matchResult = gradeSco.match(scoReg);
              let matchResult2 = parseInt(matchResult[2])
              isNaN(matchResult2) && (matchResult2 = 0)
              return matchResult && parseInt(matchResult[1]) + parseInt(matchResult[3]) + matchResult2;
            }else{
              return parseFloat(gradeSco)
            }
          }
          seriesData = dataList.map(function(ele, idx) {
            var dataInfo = {
              y: gradeScoHandler(ele.gradeSco) || 0
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
            console.log(dataInfo);
            return dataInfo;
          });
          chartOptions = {
            chart: {
              // spacingLeft: 50,
              spacingTop: 50,
              backgroundColor: '#f9f9f9'
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
              tickPositioner: function() {
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
                data: seriesData,
                events: {
                  click: function(e) {
                    var thisPoint = e.point;
                    var dataIdx = thisPoint.index;
                    var thisClass = 'time' + dataIdx;
                    var thisData = dataList[dataIdx];
                    // vm.selectIdx = dataIdx;
                    $clickedEl = $(
                        '<span class="fake">' +
                        thisData.gradeTimeStr +
                        '</span>'
                    );
                    $clickedEl.data('gradeseq', thisData.gradeSeq);
                    parent.custOpenModal('edit'); //调用父元素修改方法
                  }
                },
                cursor: 'pointer',
                marker: {
                  radius: 7
                },
                tooltip: {
                  headerFormat: '',
                  hideDelay: 100,
                  pointFormatter: function() {
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
          // }
          if (dataList.length && yAxisLmtInfo) {
            yAxisLmtInfo = yAxisLmtInfo.split('|');
            chartOptions.yAxis.max = parseInt(yAxisLmtInfo[0]);
            chartOptions.yAxis.min = parseInt(yAxisLmtInfo[1]);
          }
          // }
          chartInstance = Highcharts.chart('chart-div', chartOptions);
          vm.totalList.clear();
          vm.totalList = dataList;
          vm.showBody = true;
        }
    );
  }
  /**
   *请求数据数据
   */
  function getAllInfo() {
    if (vm.pDisplayMode === 'basic') {
      getDictInfo();
      getTableInfo().done(function () {
        stickyTable('.table-container')
      });
    } else if (vm.pDisplayMode === 'chart') {
      getChartInfo();
    }
  }
  /**
   * 清空选中列方法
   */
  function resetClickedCol() {
    vm.selectIdx = '';
    $clickedEl = null; //重置选中列
  }
  /**
   * 图片加载错误
   */
  function signPicError() {
    var _this = event.target;
    // console.error('么的图片啊');
    $(_this)
        .hide()
        .next()
        .show();
  }

  /**
   * 测试展示数据用的
   */
  function get_print_frame(show){
    var $root = $(document.documentElement);
    var print_frame_id = 'print_frame';
    var has_print_frame = $root.find('#'+print_frame_id).get(0) != null;

    function create_print_frame(id){
      return $('<iframe>')
          .attr('id', id)
          .css({
            margin: 0,
            padding: 0,
            width: "100%",
            height: "100%",
            border: 'none',
            position: 'absolute',
            top: 0,
            left: 0,
            backgroundColor: 'white',
            opacity: 1,
            display: show ? 'block' : 'none'
          })
    }

    if (!has_print_frame){
      var $print_frame = create_print_frame(print_frame_id);
      $root.append($print_frame);

      return $($print_frame.get(0).contentWindow.document.body)
    } else {
      return $($root.find('#'+ print_frame_id).get(0).contentWindow.document.gradeItem_itemField_def_map_target);
    }
  }

  function isArray(v){
    return Object.prototype.toString.call(v) === '[object Array]';
  }

  function isObject(v){
    return Object.prototype.toString.call(v) === '[object Object]';
  }

  function isFunction(v){
    return Object.prototype.toString.call(v) === '[object Function]';
  }

  function hasOwnProperty(obj, key){
    return Object.prototype.hasOwnProperty.call(obj, key);
  }

  function hasValue(value){
    return value != null && value != "" && value != "#";
  }

  function convert_defArr_to_defMap(gradeItemDef) {
    var itemField_def_map = {};

    // convert def_arr to def_map
    $.each(gradeItemDef, function(i, def){
      itemField_def_map[def.itemField] = $.extend(true, {}, def, {
        scoreValue: hasValue(def.scoreValue) ? def.scoreValue : hasValue(def.scoreMemo) ? def.scoreMemo.split("|")[0] : ""
      });
    });

    return itemField_def_map;
  }


  /**
   * @param {string} gradeType FALL...
   * @param {Array.<Object>} gradeItemDef
   */
  function computedThead(defArr, transform,columns){
    var defaultTransform = function (arr){
      return arr;
    }

    transform = isFunction(transform) ? transform : defaultTransform;

    defArr = transform(defArr);

    var theadArr = [];
    theadArr.length = columns.length;

    $.each(columns, function (r, rows){

      var cellArr = []

      $.each(rows, function (c, col_option) {
        if (col_option == null) return;
        if (isFunction(col_option)) col_option = col_option();

        if (hasOwnProperty(col_option, "title") && isFunction(col_option.title)) {
          var result_def_arr = [];

          if (hasOwnProperty(col_option, "filter") && isFunction(col_option.filter)) {
            result_def_arr = defArr.filter(col_option.filter)
          } else {
            result_def_arr = defArr;
          }

          if (hasOwnProperty(col_option, "sort") && isFunction(col_option.sort)) {
            result_def_arr = result_def_arr.sort(col_option.sort)
          }

          $.each(result_def_arr, function (i, def){
            var computed_col_option = {};

            $.each(col_option, function(key, value) {
              if (key == "filter" || key == "sort") return;

              if (isFunction(value)) {
                computed_col_option[key] = value(def);
              } else {
                computed_col_option[key] = value;
              }
            })

            cellArr.push($.extend(true, {
              itemField: def.itemField,
              itemName: def.itemName,
              itemSort: def.itemSort,
              scoreValue: def.scoreValue,
            }, computed_col_option))
          })
        } else if (hasOwnProperty(col_option, "title")) {

          cellArr.push(col_option)
        }
      })

      theadArr[r] = cellArr;
    });

    theadArr = theadArr.filter(function(row){
      if (isArray(row)) {
        var newRow = row.filter(function(cell){
          return cell != null && isObject(cell) && Object.keys(cell).length > 0
        })

        return newRow.length > 0;
      }
    });

    var fields = [];

    $.each(theadArr, function (r, row) {
      $.each(row, function(c, cell){
        if (cell.field) fields.push(cell);
      })
    });

    for(var i=0; i<fields.length; i++){
      for(var j=i+1; j<fields.length; j++){
        var itemField_i = fields[i].itemField
        var itemField_j = fields[j].itemField
        if(itemField_i && itemField_j && itemField_i==itemField_j){         //第一个等同于第二个，splice方法删除第二个
          fields.splice(j,1);
          j--;
        }
      }
    }

    fields = fields.sort(function(p_def, n_def){
      return p_def.itemSort - n_def.itemSort
    })

    var $thead = $("<thead>");

    $.each(theadArr, function(r, row) {
      var $tr = $("<tr>");

      $tr.append(row.map(function(cell){
        var $th = $("<th>").data(cell).text(cell.title).attr("colspan", cell.colspan).attr("rowspan", cell.rowspan)

        if (cell.field) $th.addClass('cell').addClass(cell.field)
        return $th;
      }))

      $thead.append($tr)
    })

    return {
      $thead: $thead,
      fields: fields
    };
  }

  function computedTbody(gradeList, transform, fields) {
    var defaultTransform = function (arr){
      return arr;
    }

    transform = isFunction(transform) ? transform : defaultTransform;

    gradeList = transform(gradeList);

    var $tbody = $("<tbody>");

    $.each(gradeList, function (r, row){
      var $tr = $("<tr>");

      $.each(fields, function (c, cell){
        var $td = $("<td>");
        var field = cell.field;
        var value = row[field] || "";

        $td.data($.extend(true, {}, cell, { value: value })).text(value).addClass('cell').addClass(field)

        $tr.append($td);
      })

      $tbody.append($tr);
    });
    return {
      $tbody
    }
  }

  function transform_defArr (defArr) {
    var newDefArr = [];
    var rootTitle = [];
    var subTitle = [];

    function computed_score(def){
      return ({
        scoreMemo: hasValue(def.scoreMemo) ? def.scoreMemo.split("|")[0] : ""
      })
    }

    $.each(defArr, function (i, def){
      if (def.itemRoot === _gradeType) {
        rootTitle.push($.extend(true, {}, def, computed_score(def), {rootTitle: true, colspan: 1, rowspan: 1}))
      }
    });

    // computed subTitleArr
    $.each(rootTitle, function(i, rootDef){
      var subArr = [];

      $.each(defArr, function(i, def) {
        if (rootDef.itemField === def.itemRoot) {
          subArr.push($.extend(true, {}, def, computed_score(def), { subTitle: true, colspan: 1, rowspan: 1, field: def.itemField }))
        }
      })

      rootTitle[i] = $.extend(true, {}, rootDef, {
        colspan: (subArr.length || 1),
        rowspan: subArr.length === 0 && _gradeType !== "FALL" && _gradeType !== "LOVETT" && _gradeType !== "NRS" ? 2 : 1,
        field: subArr.length === 0 ? rootDef.itemField : false
      })

      subTitle = subTitle.concat(subArr)
    });

    newDefArr = newDefArr.concat(rootTitle, subTitle);

    newDefArr = newDefArr.sort(function (a_def, b_def) {
      return a_def.itemSort - b_def.itemSort
    })

    return newDefArr;
  }

  function transform_gradeList(gradeList) {
    var newGradeList = [];

    $.each(gradeList, function (g, grade){
      var temp = {
        gradeUser: grade.gradeUser.split("|")[0] || "",
        gradeTimeStr: grade.gradeTimeStr.replace(/\s/, "\r\n")
      };

      $.each(grade.itemList, function (i, item){
        if (item.itemField.indexOf("SCO") >= 0) {
          temp[item.itemField] = item.itemValue
        } else {
          temp[item.itemField] = "√"
        }
      })

      newGradeList.push(temp);
    })

    return newGradeList;
  }

  function mm(num){
    return num + 'mm';
  }

  function printCom(){
    getTableInfo(true).done(function(){
      console.log("basicScopage:", _gradeType);
      console.log("_gradeItemDef: ", _gradeItemDef);

      var columns = [
        [
          { title: "时间", colspan: 1, rowspan: 3, itemSort: 0, field: "gradeTimeStr" },
          {
            title: (def) => def.itemName,
            filter: (def) => def.rootTitle === true,
            sort: (p_def, n_def) => p_def.itemSort - n_def.itemSort,
            field: (def) => def.field,
            colspan: (def) => def.colspan,
            rowspan: (def) => def.rowspan
          },
          { title: "签名", colspan: 1, rowspan: 3, itemSort: 99999, field: true, field: "gradeUser" }
        ],
        [
          {
            title: (def) => def.itemName,
            filter: (def) => def.subTitle === true,
            sort: (p_def, n_def) => p_def.itemSort - n_def.itemSort,
            field: (def) => def.field,
            colspan: (def) => def.colspan,
            rowspan: (def) => def.rowspan
          }
        ],
        [
          {
            title: (def) => def.scoreMemo,
            filter: (def) => !!def.field,
            sort: (p_def, n_def) => p_def.itemSort - n_def.itemSort,
            colspan: (def) => def.colspan,
            rowspan: (def) => def.rowspan
          }
        ],
      ];

      var fallColumn = [
        [
          { title: "时间", colspan: 1, rowspan: 2, itemSort: 0, field: "gradeTimeStr" },
          {
            title: (def) => def.itemName,
            filter: (def) => def.rootTitle === true,
            sort: (p_def, n_def) => p_def.itemSort - n_def.itemSort,
            colspan: (def) => def.colspan,
            rowspan: (def) => def.rowspan
          },
          { title: "签名", colspan: 1, rowspan: 2, itemSort: 99999, field: "gradeUser" }
        ],
        [
          {
            title: (def) => def.scoreMemo,
            filter: (def) => def.subTitle === true || def.itemName == "总分",
            sort: (p_def, n_def) => p_def.itemSort - n_def.itemSort,
            field: (def) => def.field,
            colspan: (def) => def.colspan,
            rowspan: (def) => def.rowspan
          }
        ]
      ];

      var thead = computedThead(_gradeItemDef, transform_defArr, columns);
      if (_gradeType == "FALL" || _gradeType == "LOVETT" || _gradeType == "NRS") {
        thead = computedThead(_gradeItemDef, transform_defArr, fallColumn);
      }

      var tbody = computedTbody(_gradeList, transform_gradeList, thead.fields);

      var $style = $('<style type="text/css">').text(
          'th, td {margin:0; padding: 0; box-sizing: border-box; border: 1px solid black; word-break: normal; text-align: center; font-size: 12px;}' +
          '.cell { min-width: 15px; height: 30px; }' +
          '.cell.gradeTimeStr { width: 75px; }' +
          '.cell.gradeUser { width: 75px; }' +
          '.cell.' + _gradeType + '_SCO' + '{ width: 30px }'
      )

      var $table = $('<table>')
          .css({
            margin: 0,
            padding: 0,
            border: 0,
            width: "100%",
            borderCollapse: 'collapse'
          })
          .append($style)

      $table.append(thead.$thead);
      $table.append(tbody.$tbody);

      var width = 210;
      var height = 297;
      var margin_top = 5; // bottom
      var margin_left = 3.5; // right

      var valid_width = width - margin_left *  2;
      var valid_height = height - margin_top *  2;

      var header_height = 25;
      var footer_height = 4;

      var header_top = margin_top;
      var header_bottom = header_top + header_height;

      var footer_top = height - margin_top;

      var content_height_max = valid_height - header_bottom;
      var content_width_max = valid_width;
      var content_top_min = header_bottom;
      var content_top_max = content_height_max + header_bottom; // 随着content_height_max变化

      //#region
      var LODOP = getLodop();
      LODOP.PRINT_INITA("0", "0", mm(width), mm(height), _gradeType);
      LODOP.SET_PRINT_PAGESIZE(1, mm(width), mm(height), "A4");
      LODOP.SET_SHOW_MODE("MESSAGE_PARSING_HTM", "正在加载文档 请稍等...");
      LODOP.SET_SHOW_MODE("LANGUAGE", 0); // 中文
      LODOP.SET_PRINT_MODE('PRINT_DUPLEX', 1); // 不双面
      LODOP.SET_PRINT_STYLE("HOrient", 3);
      LODOP.SET_PRINT_STYLE("VOrient", 3);

      LODOP.ADD_PRINT_HTM(
          mm(margin_top),
          mm(margin_left),
          mm(valid_width),
          mm(header_height),
          eicuUtil.getPrintTitleContent()

      );
      LODOP.SET_PRINT_STYLEA(0, "ItemType", 1);
      LODOP.ADD_PRINT_HTM(
          mm(footer_top),
          mm(margin_left),
          mm(valid_width),
          mm(footer_height),
          '<div style="margin: 0;padding: 0;text-align: center;width: 100%; font-size: 9pt;"><span tdata="pageNO">第##页</span>/<span tdata="pageCount">共##页</span></div>'
      );
      LODOP.SET_PRINT_STYLEA(0, 'ItemType', 1);
      //#endregion

      LODOP.ADD_PRINT_TABLE(
          mm(content_top_min), mm(margin_left),mm(content_width_max),mm(content_height_max),
          $table.get(0).outerHTML
      );
      LODOP.PREVIEW();

      $(get_print_frame(false)).append($table);
    })
  }

  $.each(menuInfoObj, function(k, v) {
    if (v.menuType === _gradeType) {
      curMenuInfo = v;
      vm.pageName = curMenuInfo.menuName;
      return false;
    }
  });

  /**
   * @param {string} tableSelector
   * @param {number} [zIndex]
   */
  function stickyTable(tableSelector, zIndex) {
    var isIE = !!document.documentMode;
    if (isIE) {
      console.warn("skip sticky table")
      return;
    }
    if (zIndex == null) zIndex = 1

    var styleText =
      "/* 为了使每一列的border也跟随移动 table的border-collapse必须为 separate;*/\n" +
      "/* table的border-collapse为separate 时需要手动将border坍塌；*/\n" +
      "table.sticky-table {\n" +
      "\tborder-spacing: 0;\n" +
      "\tborder-collapse: separate !important;\n" +
      "\tborder-left: 1px solid #666 !important;\n" +
      "}\n" +
      "table.sticky-table tr th,\n" +
      "table.sticky-table tr td {\n" +
      "\tborder: none !important;\n" +
      "\tborder-bottom: 1px solid #666 !important;\n" +
      "\tborder-right: 1px solid #666 !important;\n" +
      "}\n" +
      "table.sticky-table thead tr:first-child th,\n" +
      "table.sticky-table thead tr:first-child td {\n" +
      "\tborder-top: 1px solid #666 !important;\n" +
      "}\n" +
      // "table.sticky-table tr th:first-child,\n" +
      // "table.sticky-table tr td:first-child {\n" +
      // "\tborder-collapse: collapse;\n" +
      // "\tborder-left: 1px solid #666 !important;\n" +
      // "}\n" +

      "/* 指定列固定 */\n" +
      "table.sticky-table tr > th.sticky-table__col,\n" +
      "table.sticky-table tr > td.sticky-table__col {\n" +
      "\tposition: sticky;\n" +
        /*left: 0;*/
      "\tz-index: "+ zIndex +";\n" +
        /*background-color: red;*/
      "}\n" +

      "/* 指定行固定 */\n" +
      "table.sticky-table tr.sticky-table__row,\n" +
      "table.sticky-table thead.sticky-table__row {\n" +
      "\tposition: sticky;\n" +
      "\ttop: 0;\n" +
      "\tz-index: "+ (++zIndex) +";\n" +
        /*background-color: red;*/
      "}\n" +

      "table.sticky-table .sticky-table__row .sticky-table__col {\n" +
      "\tz-index: "+ (++zIndex) +";\n" +
      "}";

    var styleNode = document.createElement('style');
    styleNode.type = "text/css";
    styleNode.id = "sticky-table";
    var styleTextNode = document.createTextNode(styleText);
    styleNode.appendChild(styleTextNode);
    document.getElementsByTagName('head')[0].appendChild(styleNode);

    var $table = $(tableSelector)
    $table.removeClass('sticky-table').addClass('sticky-table')
    $("tr > th.sticky-table__col, tr > td.sticky-table__col", $table).each(function () {
      var $self = $(this)
      var left = $self.offset().left
      $self.css("left", left)
      var backgroundColor = $self.css("background-color") === "rgba(0, 0, 0, 0)" ? "white" : $self.css("background-color")
      $self.css("background-color", backgroundColor) // 明确背景颜色 否则滚动会透明
      console.log($self.css("background-color"))
    })
    $("tr.sticky-table__row, thead.sticky-table__row", $table).each(function () {
      var $self = $(this)
      var backgroundColor = $self.css("background-color") === "rgba(0, 0, 0, 0)" ? "white" : $self.css("background-color")
      $self.css("background-color", backgroundColor) // 明确背景颜色 否则滚动会透明
    })
  }

  getAllInfo();
</script>
</body>
</html>
