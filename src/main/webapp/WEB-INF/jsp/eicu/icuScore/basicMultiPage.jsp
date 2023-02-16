<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <title>护理评级</title>
    <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
    <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/eicu/eicu_common.css"
    />
    <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%> <%@ include
    file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
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
      body {
        overflow: hidden;
      }

      #container {
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
        width: 80px;
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
        <table ms-css-width="tableWidth">
          <caption class="page-title">
            BI日常生活活动能力评分
          </caption>
          <colgroup>
            <col class="basic-col title-first" />
            <col class="basic-col title-second" />
            <col class="basic-col title-third" />
            <col class="basic-col title-score" />
            <col ms-repeat="timeList" />
          </colgroup>
          <thead>
            <tr>
              <th
                class="sco-item-header"
                rowspan="2"
                ms-attr-colspan="{{ tableType === 'specific' ? '2' : '3' }}"
                >评分项目</th
              >
              <th ms-if="tableType === 'specific'" rowspan="2">评分区间</th>
              <th class="sco-header" rowspan="2">分值</th>
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
                ms-if="(iteminfo.itemRoot!=='NURS_CLS_A' && iteminfo.itemRoot!=='NURS_CLS_B' && iteminfo.itemRoot!=='NURS_CLS_C' ) && iteminfo.rootSelfIdx===0"
                ms-attr-rowspan="{{ iteminfo.rootSpanNumb }}"
                ms-attr-colspan="{{ iteminfo.secNodeName ? '1' : '3' }}"
              >
                {{ iteminfo.rootName }}
              </th>
              <th
                ms-if="(iteminfo.itemRoot!=='NURS_CLS_A' && iteminfo.itemRoot!=='NURS_CLS_B' && iteminfo.itemRoot!=='NURS_CLS_C' ) && iteminfo.secNodeName && ((iteminfo.thirdNodeName && iteminfo.secSelfIdx===0) || !iteminfo.thirdNodeName)"
                ms-attr-colspan="{{ iteminfo.thirdNodeName ? '1' : '2' }}"
                ms-attr-rowspan="{{
                  iteminfo.thirdNodeName ? iteminfo.secSpanNumb : '1'
                }}"
              >
                <div
                  style="word-break: break-all;"
                  ms-attr-title="{{ iteminfo.secNodeName }}"
                >
                  {{ iteminfo.secNodeName }}
                </div>
              </th>
              <th ms-if="(iteminfo.itemRoot!=='NURS_CLS_A' && iteminfo.itemRoot!=='NURS_CLS_B' && iteminfo.itemRoot!=='NURS_CLS_C' ) && iteminfo.thirdNodeName">
                <span>
                  {{ iteminfo.thirdNodeName }}
                </span>
              </th>
              <th ms-if="(iteminfo.itemRoot!=='NURS_CLS_A' && iteminfo.itemRoot!=='NURS_CLS_B' && iteminfo.itemRoot!=='NURS_CLS_C' )">{{ iteminfo.scoreMemo }}</th>
              <td
                ms-if="(iteminfo.itemRoot!=='NURS_CLS_A' && iteminfo.itemRoot!=='NURS_CLS_B' && iteminfo.itemRoot!=='NURS_CLS_C' )"
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
                >{{ totalScoInfo.itemName }}</th
              >
              <th ms-if="totalScoInfo.scoreMemo !== '#'">{{
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


          

          <!-- 护理记录 -->
          <table ms-css-width="tableWidth">
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
          <thead>
            <tr>
              <th
                class="sco-item-header"
                rowspan="2"
                ms-attr-colspan="{{ tableType === 'specific' ? '3' : '4' }}"
                >评分项目</th
              >
              <th ms-if="tableType === 'specific'" rowspan="2">评分区间</th>
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
                ms-if="(iteminfo.itemRoot==='NURS_CLS_A' || iteminfo.itemRoot==='NURS_CLS_B' || iteminfo.itemRoot==='NURS_CLS_C' ) && iteminfo.rootSelfIdx===0"
                ms-attr-rowspan="{{ iteminfo.rootSpanNumb }}"
                ms-attr-colspan="{{ iteminfo.secNodeName ? '2' : '3' }}"
              >
                {{ iteminfo.rootName }}
              </th>
              <th
                ms-if="(iteminfo.itemRoot==='NURS_CLS_A' || iteminfo.itemRoot==='NURS_CLS_B' || iteminfo.itemRoot==='NURS_CLS_C' ) && iteminfo.secNodeName && ((iteminfo.thirdNodeName && iteminfo.secSelfIdx===0) || !iteminfo.thirdNodeName)"
                ms-attr-colspan="{{ iteminfo.thirdNodeName ? '1' : '2' }}"
                ms-attr-rowspan="{{
                  iteminfo.thirdNodeName ? iteminfo.secSpanNumb : '1'
                }}"
              >
                <div
                  style="word-break: break-all;"
                  ms-attr-title="{{ iteminfo.secNodeName }}"
                >
                  {{ iteminfo.secNodeName }}
                </div>
              </th>
              <th ms-if="(iteminfo.itemRoot==='NURS_CLS_A' || iteminfo.itemRoot==='NURS_CLS_B' || iteminfo.itemRoot==='NURS_CLS_C' ) && iteminfo.thirdNodeName ">
                <span>
                  {{ iteminfo.thirdNodeName }}
                </span>
              </th>
              <!-- <th ms-if="(iteminfo.itemRoot==='NURS_CLS_A' || iteminfo.itemRoot==='NURS_CLS_B' || iteminfo.itemRoot==='NURS_CLS_C' )">{{ iteminfo.scoreMemo }}</th> -->
              <td
                ms-if="(iteminfo.itemRoot==='NURS_CLS_A' || iteminfo.itemRoot==='NURS_CLS_B' || iteminfo.itemRoot==='NURS_CLS_C' )"
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

          <tbody ms-if="signInfo.scoTimeList">
            <tr>
              <!-- 签名详情 -->
              <th colspan="4">{{ signInfo.itemName }}</th>
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
              ms-css-height="containerH - 100"
              ms-css-width="containerW-380-70"
            ></div>
          </div>
          <div
            id="chart-grid-box"
            class="chart-content-part"
            ms-css-height="containerH - 100"
            style="width:300px"
          >
            <div class="grid-title">
              <span class="grid-title">
                评分记录
              </span>
              <table class="icu-table">
                <colgroup>
                  <col style="width:110px" />
                  <col style="width:70px" />
                  <col style="width:40px;text-align:right" />
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

            <div class="grid-content" ms-css-height="containerH - 150">
              <table class="icu-table">
                <colgroup>
                  <col style="width:110px" />
                  <col style="width:70px" />
                  <col style="width:40px;text-align:right" />
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
                        ms-if="el.userImgSrc"
                        class="signPic"
                        ms-attr-src="{{ el.userImgSrc }}"
                        ms-attr-title="{{ el.gradeUserStr }}"
                        onerror="signPicError()"
                      />
                      <span style="display: none;">{{ el.gradeUserStr }}</span>
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
      if(eicuUtil.isOuterSys) {
        eicuUtil = parent.eicuUtil;
      }
      var ptBasicInfo = eicuUtil.ptBasicInfo;
      var _liveNo = '${liveNo}';
      var _gradeSeq = '${gradeSeq}';
      var _gradeType = '${gradeType}';
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
        containerH: $(window.document).outerHeight(), // 容器高度
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
            _gradeSeq = vm.timeList[idx]['gradeSeq']
          } else {
            $clickedEl = $('.chart-tr' + idx);
            $clickedEl.data('gradeseq', vm.totalList[idx]['gradeSeq']);
            _gradeSeq = vm.timeList[idx]['gradeSeq']            
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
          vm.totalList = []
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
            vm.totalScoInfo = totalScoInfo;
            vm.signInfo = signInfo;
            vm.totalList = defTotalList;
          }
        );
      }
      /**
       * getTableInfo
       */
      function getTableInfo() {
        publicFun.httpRequest(
          _baseUrl + 'icuscore/queryScoreInfo.do',
          {
            gradeType: _gradeType,
            liveNo: _liveNo
          },
          {
            requestType: 'json'
          },
          function(res) {
            if (!res.resultInfo.success) {
              alert_error('请求出错，请联系管理员');
              return;
            }
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
            vm.signInfo.scoTimeList = []
            vm.totalScoInfo.scoTimeList = []
            //循环时间顺序数据列表
            if (!timeInfoList || timeInfoList.length === 0) {
              // 最新数据为空，清空原数据
              vm.totalList.forEach(function(itemInfo) {
                itemInfo.scoTimeList = []
              });
              vm.totalScoInfo.scoTimeList = []
              vm.signInfo.scoTimeList = []
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
            if (!dataList.length) {
              // fake min and max
              yAxisLmtInfo = '0|0'
            } else {
              yAxisLmtInfo = dataList[0].yAxisVal;
            }
            seriesData = dataList.map(function(ele, idx) {
              var dataInfo = {
                y: parseInt(ele.gradeSco) || 0
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
            vm.totalList = []
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
          getTableInfo();
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
        console.error('么的图片啊');
        $(_this)
          .hide()
          .next()
          .show();
      }
      $(function() {
        $.each(menuInfoObj, function(k, v) {
          if (v.menuType === _gradeType) {
            curMenuInfo = v;
            vm.pageName = curMenuInfo.menuName;
            return false;
          }
        });
        getAllInfo();
      });
    </script>
  </body></html
>
