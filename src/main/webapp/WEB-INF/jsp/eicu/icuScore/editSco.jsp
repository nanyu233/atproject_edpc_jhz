<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%> <%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
  <title>通用评分页面</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link
      rel="stylesheet"
      type="text/css"
      href="${baseurl}styles/eicu/eicu_common.css"
  />
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script
      src="${baseurl}lib/avalon1.4.8/avalon.js"
      type="text/javascript"
      charset="UTF-8"
  ></script>
  <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
  <style>
    #sco-container {
      padding: 10px 10px 0;
      box-sizing: border-box;
      /* overflow: hidden; */
      overflow-y: auto;
      overflow-x: hidden;
    }

    #sco-container table {
      margin: 0 auto 10px;
    }

    table {
      table-layout: fixed;
    }

    table thead tr {
      background-color: #f5f5f5;
    }

    table tr.odd-tr td:not(.root-name),
    table tr.odd-tr th:not(.root-name) {
      background-color: #eef;
    }

    table tr th {
      text-align: center;
    }

    table tr th,
    table tr td {
      padding: 5px;
      border: 1px solid #aaa;
      /* box-sizing: border-box; */
    }

    table td.odd-td {
      background-color: #eef;
    }

    table tr td.hover-td:hover {
      background-color: rgb(234, 242, 255);
    }

    table tr th .item-name-td,
    table tr td .item-name-td {
      display: flex;
      align-items: center;
      flex-wrap: wrap;
      justify-content: flex-start;
      text-align: left;
      overflow: hidden;
      word-break: break-all;
    }

    table tr td .score-label {
      margin-left: 5px;
      display: flex;
      align-items: center;
      box-sizing: border-box;
      cursor: default;
    }

    table tr td .score-label.checked {
      font-weight: bold;
    }

    table tr td .score-label:first-child {
      margin-left: 0;
    }

    table tr td .score-label .score-label-name {
      margin-left: 5px;
      text-align: left;
    }

    table tr td .score-label > input[type='checkbox'] {
      width: 13px;
      box-sizing: border-box;
    }

    /*h/i-input-table*/
    .input-td input {
      height: 24px;
      line-height: 24px;
      box-sizing: border-box;
    }

    /* v-table */
    .v-table .vt-detl-name,
    .v-table .vt-detl-name .item-name-td {
      width: 350px;
    }

    .v-table tr .score-td {
      text-align: center;
      width: 120px;
    }

    /* c-table */
    .mc-card {
      margin-left: 15px;
      margin-bottom: 10px;
    }

    .mc-card .icu-card-title .icu-btn-group {
      flex: 1;
      justify-content: flex-end;
    }

    .mc-card .icu-card-body {
      padding-bottom: 0;
    }

    .mc-card .mc-item-group {
      flex-wrap: wrap;
    }

    .mc-card .mc-item-group .mc-item {
      margin-right: 10px;
      margin-bottom: 10px;
      padding: 0 10px;
      height: auto;
    }

    .mc-card .mc-item-group .mc-item .icu-check-label-name {
      display: flex;
      align-items: center;
      width: 150px;
      height: 38px;
      overflow: hidden;
    }

    /* 签名栏样式 */
    #mod-info-box {
      display: flex;
      align-items: center;
      height: 40px;
      padding: 0 10px;
      border-top: 1px solid #ccc;
      box-sizing: border-box;
    }

    #user-info {
      flex: 1;
      display: flex;
      align-items: center;
    }

    #user-info > label {
      margin-right: 10px;
      align-items: center;
    }

    .userInput {
      width: 90px;
    }

    #mod-info-box .signPic {
      max-width: 12mm;
      max-height: 6mm;
    }

    #mod-info-box .signPic ~ span {
      display: none;
      max-width: 100%;
    }

    /* 总分显示 */
    #total-sco-info {
      display: flex;
      align-items: center;
      font-size: 16px;
      font-weight: bold;
      color: #333;
    }

    #total-sco-info > span:last-child {
      margin-left: 5px;
      justify-content: center;
      min-width: 20px;
    }
  </style>
</head>

<body class="editScore" ms-controller="scoEdit">
<div
    id="sco-container"
    ms-css-visibility="{{ bodyShowFlag ? 'visible' : 'hidden' }}"
>
  <table ms-if="tableMode === 'h' || tableMode === 'i'" class="h-table">
    <!-- 横向渲染 -->
    <colgroup>
      <col />
      <col />
      <col ms-repeat="headScoreList" />
      <col />
    </colgroup>
    <thead>
    <tr>
      <th rowspan="2" colspan="2">评分项目</th>
      <th
          ms-attr-colspan="{{
                tableMode === 'i'
                  ? headScoreList.length + 1
                  : headScoreList.length
              }}"
      >分值
      </th>
    </tr>
    <tr>
      <th ms-repeat="headScoreList">{{ el.scoreMemo }}</th>
      <th ms-if="tableMode === 'i'">数值</th>
    </tr>
    </thead>
    <tbody>
    <tr ms-repeat-rootinfo="totalList">
      <td
          ms-if="tableMode === 'h' && rootinfo.rootSelfIdx === 0"
          class="root-name"
          ms-css-width="{{
                rootinfo.hideSecNode ? itemNameColW : itemNameColW * 0.4
              }}"
          ms-attr-colspan="{{ rootinfo.hideSecNode ? '2' : '1' }}"
          ms-attr-rowspan="{{ rootinfo.rootRowSpanNumb }}"
      >
        <div
            class="item-name-td"
            ms-css-width="{{
                  rootinfo.hideSecNode ? itemNameTdW : itemNameColW * 0.4 - 12
                }}"
        >
          {{ rootinfo.rootName }}
        </div>
      </td>
      <td
          ms-if="tableMode === 'i' && rootinfo.rootSelfIdx === 0"
          class="root-name"
          ms-css-width="{{
                rootinfo.hideSecNode ? iTableNameTdW : iTableNameColW * 0.4 - 12
              }}"
          ms-attr-colspan="{{ rootinfo.hideSecNode ? '2' : '1' }}"
          ms-attr-rowspan="{{ rootinfo.rootRowSpanNumb }}"
      >
        <div
            class="item-name-td"
            ms-css-width="{{
                  rootinfo.hideSecNode
                    ? iTableNameTdW
                    : iTableNameColW * 0.4 - 12
                }}"
        >
          {{ rootinfo.rootName }}
        </div>
      </td>
      <td
          ms-if="!rootinfo.hideSecNode"
          class="root-name"
          ms-css-width="{{
                tableMode === 'i'
                  ? iTableNameColW * 0.6 - 12
                  : itemNameColW * 0.6 - 12
              }}"
      >
        <div
            class="item-name-td"
            ms-css-width="tableMode === 'i' ? (iTableNameColW*0.6 - 12) : (itemNameColW*0.6 - 12)"
        >
          {{ rootinfo.itemName }}
        </div>
      </td>
      <td
          ms-repeat-iteminfo="rootinfo.detlList"
          ms-class="{{
                groupScoMap[iteminfo.itemGroup].itemField ===
                  iteminfo.itemField &&
                groupScoMap[iteminfo.itemGroup].scoreValue ===
                  iteminfo.scoreValue
                  ? 'td-checked'
                  : ''
              }}"
          ms-css-width="hDetlTdW"
      >
        <label
            class="score-label"
            ms-if="iteminfo.itemField!=='FAKE'"
            ms-css-width="hDetlTdW"
        >
          <input
              type="checkbox"
              ms-class="{{ rootinfo.itemField }}"
              ms-attr-name="{{ iteminfo.itemField }}"
              ms-attr-value="{{ iteminfo.scoreValue }}"
              ms-attr-checked="{{
                    groupScoMap[iteminfo.itemGroup].itemField ===
                      iteminfo.itemField &&
                      groupScoMap[iteminfo.itemGroup].scoreValue ===
                        iteminfo.scoreValue
                  }}"
              ms-attr-disabled="{{
                    iteminfo.lmtFlag === '#' ? false : true
                  }}"
              ms-click="scoCheck(iteminfo, $event)"
          />
          <div class="score-label-name" ms-css-width="hLabelWidth">
            {{ iteminfo.itemName }}
          </div>
        </label>
      </td>
      <td
          ms-if="tableMode === 'i'"
          class="input-td"
          ms-css-width="itemNameTdW-10"
      >
        <label class="score-label" ms-css-width="itemNameTdW-10">
          <input
              ms-if="rootinfo.lmtFlag !=='#'"
              type=" text"
              class="i-table-input"
              ms-class-1="{{ rootinfo.itemField }}"
              ms-css-width="{{ itemNameTdW - 10 - 60 }}"
              ms-attr-disabled="groupScoMap[rootinfo.itemGroup].scoreValue !== '' && groupScoMap[rootinfo.itemGroup].itemRoot !== rootinfo.itemField"
              ms-keyup="hTableInput(rootinfo, $event)"
              ms-blur="setInputSco($event, rootinfo)"
          />
          <span class=" unit" style="margin-left: 3px">{{
                  rootinfo.itemUnit
                }}
                </span>
        </label>
      </td>
    </tr>
    </tbody>
  </table>
  <table ms-if="tableMode === 'v'" class="v-table">
    <!-- 纵向渲染 -->
    <thead>
    <tr>
      <th ms-css-width="{{ vtShowSecondChild ? itemNameTdW : '300' }}"
      >评分项目</th
      >
      <th ms-if="vtShowSecondChild" class="vt-detl-name">详细描述</th>
      <th>分值</th>
    </tr>
    </thead>
    <tbody ms-repeat-rootinfo="totalList">
    <tr ms-repeat-iteminfo="rootinfo.scoreList || rootinfo.detlList">
      <th
          ms-if="$index === 0"
          class="root-name"
          ms-attr-rowspan="rootinfo.firstRowSpanNum"
          ms-attr-colspan="{{ rootinfo.mergeSecondChild ? '2' : '1' }}"
      >
        <div class="item-name-td">
          {{ rootinfo.itemName }}
        </div>
      </th>
      <td
          ms-if="vtShowSecondChild && !rootinfo.mergeSecondChild"
          class="vt-detl-name"
      >
        <div class="item-name-td">
          {{ iteminfo.itemName }}
        </div>
      </td>
      <td
          ms-if="!iteminfo.scoreList"
          class="score-td score-list-td hover-td"
          ms-class-1="{{
                groupScoMap[iteminfo.itemGroup].itemField ===
                  iteminfo.itemField &&
                groupScoMap[iteminfo.itemGroup].scoreValue ===
                  iteminfo.scoreValue
                  ? 'td-checked'
                  : ''
              }}"
      >
              <span class="score-label">
                <label class="score-label">
                  <input
                      type="checkbox"
                      ms-class="{{ rootinfo.itemField }}"
                      ms-attr-name="{{ iteminfo.itemField }}"
                      ms-attr-value="{{ iteminfo.scoreValue }}"
                      ms-attr-checked="{{
                      groupScoMap[iteminfo.itemGroup].itemField ===
                        iteminfo.itemField &&
                        groupScoMap[iteminfo.itemGroup].scoreValue ===
                          iteminfo.scoreValue
                    }}"
                      ms-attr-disabled="singleLock && singleLock !== iteminfo.scoreValue"
                      ms-click="scoCheck(iteminfo, $event)"
                  />
                  <div class="score-label-name">
                    {{ iteminfo.scoreMemo }}
                  </div>
                </label>
              </span>
      </td>
      <td
          ms-if="iteminfo.scoreList"
          class="score-td score-list-td hover-td"
      >
        <!-- 单行多check -->
        <span class="score-label">
                <label
                    ms-repeat-scoel="iteminfo.scoreList"
                    class="score-label"
                    ms-class-1="{{
                    groupScoMap[scoel.itemGroup].itemField ===
                      scoel.itemField &&
                    groupScoMap[scoel.itemGroup].scoreValue === scoel.scoreValue
                      ? 'td-checked'
                      : ''
                  }}"
                >
                  <input
                      type="checkbox"
                      ms-class="{{ rootinfo.itemField }}"
                      ms-attr-name="{{ scoel.itemField }}"
                      ms-attr-value="{{ scoel.scoreValue }}"
                      ms-attr-checked="{{
                      groupScoMap[scoel.itemGroup].itemField ===
                        scoel.itemField &&
                        groupScoMap[scoel.itemGroup].scoreValue ===
                          scoel.scoreValue
                    }}"
                      ms-attr-disabled="singleLock && singleLock !== scoel.scoreValue"
                      ms-click="scoCheck(scoel, $event)"
                  />
                  <div class="score-label-name">{{ scoel.scoreMemo }}</div>
                </label>
              </span>
      </td>
    </tr>
    </tbody>
  </table>
  <div ms-if="tableMode === 'c'" id="mc-card-box" class="c-card">
    <!-- 层级卡片 -->
    <div ms-repeat-rootinfo="totalList" class="icu-card mc-card">
      <div class="icu-card-title">
        <span>{{ rootinfo.itemName }}</span>
        <span class="icu-btn-group">
              <span
                  class="icu-btn inline-btn btn-outline-primary"
                  ms-click="cTableCheckAll(rootinfo, $event)"
              >
                全选
              </span>
              <span
                  class="icu-btn inline-btn btn-outline-primary"
                  ms-click="cTableConverseCheck(rootinfo, $event)"
              >
                反选
              </span>
              <span class="icu-btn inline-btn display-btn bg-primary">
                {{ rootinfo.checkedNumb + ' / ' + rootinfo.detlList.length }}
              </span>
            </span>
      </div>
      <div class=" icu-card-body">
        <div class="icu-btn-group mc-item-group">
          <label
              ms-repeat-iteminfo="rootinfo.detlList"
              class=" icu-check-box mc-item"
              ms-class-1="{{
                  groupScoMap[iteminfo.itemGroup].itemField ===
                    iteminfo.itemField &&
                  groupScoMap[iteminfo.itemGroup].scoreValue ===
                    iteminfo.scoreValue
                    ? 'active'
                    : ''
                }}"
          >
            <input
                type="checkbox"
                ms-attr-name="{{ iteminfo.itemField }}"
                ms-attr-value="{{ iteminfo.scoreValue }}"
                ms-attr-checked="{{
                    groupScoMap[iteminfo.itemGroup].itemField ===
                      iteminfo.itemField &&
                      groupScoMap[iteminfo.itemGroup].scoreValue ===
                        iteminfo.scoreValue
                  }}"
                ms-click="scoCheck(iteminfo, $event, rootinfo)"
            />
            <span
                class="icu-check-label-name"
                ms-attr-title="{{ iteminfo.itemName }}"
            >{{ iteminfo.itemName }}
                </span
                >
          </label>
        </div>
      </div>
    </div>
  </div>
</div>
<div
    id="mod-info-box"
    class="signBorderBox"
    ms-css-visibility="{{ bodyShowFlag ? 'visible' : 'hidden' }}"
>
  <div id="user-info">
    <label>
      <span>评分时间：</span>
      <input
          class="Wdate"
          type="text"
          id="gradeTimeStr"
          onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})"
          autocomplete="off"
      />
    </label>
    <label>
      <span>评分人：</span>
      <input
          class="userInput"
          type="text"
          id="gradeUser"
          autocomplete="off"
          ms-duplex-string="user.userNum"
      />
    </label>
  </div>
  <div id="total-sco-info">
    <span>总分</span>
    <span
        class="icu-btn inline-btn display-btn"
        ms-class-1="{{ totalScoRankInfo.riskColor }}"
    >{{ totalSco }}</span
    >
  </div>
</div>
<div
    id="saveBar"
    ms-css-visibility="{{ bodyShowFlag ? 'visible' : 'hidden' }}"
>
  <input type="button" class="commonbtn" value="保存" onclick="saveCom()" />
  <input
      type="button"
      class="commonbtn"
      value="保存并关闭"
      onclick="saveCom('close')"
  />
  <input
      type="button"
      class="commonbtn"
      value="关闭"
      onclick="parent.closemodalwindow()"
  />
  <input
      ms-if="gradeSeq"
      type="button"
      class="commonbtn"
      id="selfDelBtn"
      value="删除"
      onclick="delThisGrade()"
  />
</div>
<script type="text/javascript">
  var _baseUrl = '${baseurl}';
  var DEFAULT_USER_ID = '${activeUser.usrno}';
  var DEFAULT_USER_NAME = '${activeUser.usrname}';
  var NURS_HOME_ID = '200001';
  var DOC_HOME_ID = '300001';
  var DOC_ROOT_MOD_ID = '300000';
  var NURS_ROOT_MOD_ID = '200000';
  var DAY_HOUR = 24;
  var TIME_TRANS_NUM = 60;
  var DAY_MINUTE = DAY_HOUR * TIME_TRANS_NUM;
  var DAY_MILLI_SEC = DAY_MINUTE * TIME_TRANS_NUM * 1000;

  //全局变量
  // var ptBasicInfo = eicuUtil.ptBasicInfo;
  var _liveNo = '${liveNo}';
  var _gradeSeq = '${gradeSeq}';
  var _linkSeq = "";
  var _gradeType = '${gradeType}';
  var _pGradeTimeStr = '';
  var _userid = '${activeUser.usrno}';
  var exChgGradeInfo = parent.icuOpenModal && icuOpenModal.getExChgInfo();
  if (exChgGradeInfo) {
    _gradeType = exChgGradeInfo.gradeType;
    _gradeSeq = exChgGradeInfo.gradeSeq;
    _pGradeTimeStr = exChgGradeInfo.gradeTimeStr;
  }
</script>
<script type="text/javascript">
  var windowPadding = 10;
  var itemNameColW = 121;
  var tdPadding = 12;
  var itemNameTdW = itemNameColW - tdPadding;
  var iTableNameColW = 151;
  var iTableNameTdW = iTableNameColW - tdPadding;
  var H_SCORE_W = $(window).width() - windowPadding * 2 - itemNameColW - 12; //横向表格评分项目总宽度
  if (exChgGradeInfo.scoTableMode === 'i') {
    // MODS-like minus extra td width(colgroup)
    H_SCORE_W += 10;
    H_SCORE_W -= iTableNameColW;
  }
  var colPaddingWidth = 5; //列内边距
  var checkboxWidth; //checkbox宽度

  var fieldMap = {}; //分类映射
  var defLmtMap = {}; // 定义区间
  // risk map
  var totalRiskMap = publicFun.getIcuDicItem('riskMap') || {};
  var curRiskInfo = totalRiskMap[_gradeType];
  var vm = avalon.define({
    $id: 'scoEdit',
    bodyShowFlag: false,
    gradeSeq: _gradeSeq,
    user: {
      userId: _userid,
      userNum: DEFAULT_USER_NAME
    },
    tableMode: exChgGradeInfo.scoTableMode, //h-GCS-like，i-MODS-like, v-RASS-like, c-TISS-like
    // allCheckFlag: '0', //全选标志
    itemNameColW: itemNameColW,
    itemNameTdW: itemNameTdW,
    iTableNameColW: iTableNameColW,
    iTableNameTdW: iTableNameTdW,
    hDetlColW: 100, //动态计算横向表格列宽度
    hDetlTdW: 89,
    hLabelWidth: '90%', //label宽度
    singleLock: '',
    scoreName: '', //页面信息
    headScoreList: [], //评分列表
    vtShowSecondChild: false, // v-table show secondChild
    totalList: [], //以父元素为基点的列表
    totalSco: '',
    totalScoRankInfo: {},
    groupScoMap: {}, //每个组的分值映射
    scoCheck: function(scoInfo, e, rootInfo) {
      if (e) {
        e.stopPropagation();
      }
      if (scoInfo.lmtFlag !== '#') {
        // 输入类型评分页
        return false;
      }
      var scoreValue = scoInfo.scoreValue;
      var itemGroup = scoInfo.itemGroup;
      var totalSco = '';
      //如果通过选中父元素传递，则选中当时状态仍为false
      var checkFlag = e.target.checked;
      vm.singleLock = '';
      if (itemGroup === '*') {
        //单选时取消其余所有选项
        if (checkFlag) {
          vm.singleLock = scoreValue;
          for (var k in vm.groupScoMap) {
            if (vm.groupScoMap.hasOwnProperty(k)) {
              if (k !== itemGroup) {
                vm.groupScoMap[k].scoreValue = '';
              } else {
                vm.groupScoMap[k].itemField = scoInfo.itemField;
                vm.groupScoMap[k].scoreValue = scoreValue;
              }
            }
          }
          totalSco = scoreValue;
        } else {
          vm.groupScoMap[itemGroup].itemField = '';
          vm.groupScoMap[itemGroup].scoreValue = '';
          totalSco = '';
        }
      } else {
        if (checkFlag) {
          if (vm.tableMode === 'c') {
            rootInfo.checkedNumb++;
          }
          vm.groupScoMap[itemGroup].itemField = scoInfo.itemField;
          vm.groupScoMap[itemGroup].scoreValue = scoreValue;
        } else {
          if (vm.tableMode === 'c') {
            rootInfo.checkedNumb--;
          }
          vm.groupScoMap[itemGroup].itemField = '';
          vm.groupScoMap[itemGroup].scoreValue = '';
        }
        totalSco = calScore();
      }
      vm.totalSco = totalSco;
    },
    cTableCheckAll: function(rootInfo, e) {
      if (e) {
        e.stopPropagation();
      }
      var totalSco;
      var itemGroup;
      $.each(rootInfo.detlList, function(detlIdx, detlInfo) {
        itemGroup = detlInfo.itemGroup;
        vm.groupScoMap[itemGroup].itemField = detlInfo.itemField;
        vm.groupScoMap[itemGroup].scoreValue = detlInfo.scoreValue;
      });
      rootInfo.checkedNumb = rootInfo.detlList.length;
      vm.totalSco = calScore();
    },
    cTableConverseCheck: function(rootInfo, e) {
      if (e) {
        e.stopPropagation();
      }
      var totalSco;
      var itemGroup;
      $.each(rootInfo.detlList, function(detlIdx, detlInfo) {
        itemGroup = detlInfo.itemGroup;
        if (vm.groupScoMap[itemGroup].itemField) {
          rootInfo.checkedNumb--;
          vm.groupScoMap[itemGroup].itemField = '';
          vm.groupScoMap[itemGroup].scoreValue = '';
        } else {
          rootInfo.checkedNumb++;
          vm.groupScoMap[itemGroup].itemField = detlInfo.itemField;
          vm.groupScoMap[itemGroup].scoreValue = detlInfo.scoreValue;
        }
      });
      vm.totalSco = calScore();
    },
    hTableInput: function(rootInfo, e) {
      if (e) {
        e.stopPropagation();
      }
      var itemGroup = rootInfo.itemGroup;
      var targetVal = e.target.value;
      if (!targetVal) {
        // 监听空值，取消disabled
        vm.groupScoMap[itemGroup].scoreValue = '';
      } else {
        vm.groupScoMap[itemGroup].itemRoot = rootInfo.itemField;
        vm.groupScoMap[itemGroup].scoreValue = 'fake';
      }
    },
    setInputSco: function(e, rootInfo) {
      // MODS-like 计算输入分值
      var itemGroup = rootInfo.itemGroup;
      var target = e.target;
      var targetVal = vm.onlyNum(target);
      var curInputLmtInfo;
      var curSco;
      var totalSco;
      if (targetVal === '') {
        curSco = '';
        vm.groupScoMap[itemGroup].inputValue = '';
        vm.groupScoMap[itemGroup].scoreValue = '';
        vm.groupScoMap[itemGroup].itemField = '';
      } else {
        curInputLmtInfo = vm.calCurInputVal(targetVal, rootInfo);
        vm.groupScoMap[itemGroup].inputValue = targetVal;
        vm.groupScoMap[itemGroup].itemRoot = rootInfo.itemField;
        vm.groupScoMap[itemGroup].itemField = curInputLmtInfo.itemField;
        vm.groupScoMap[itemGroup].scoreValue = curInputLmtInfo.scoreValue;
      }
      totalSco = calScore();
      vm.totalSco = totalSco;
    },
    calCurInputVal: function(value, parentNode) {
      var lmtInfoList = parentNode.detlList;
      var reLmtInfo;
      $.each(lmtInfoList, function(idx, lmtInfo) {
        if (lmtInfo.lmtFlag === '1' && value >= lmtInfo.lmtValue) {
          reLmtInfo = lmtInfo;
          return false;
        } else if (lmtInfo.lmtFlag === '2' && value <= lmtInfo.lmtValue) {
          reLmtInfo = lmtInfo;
          return false;
        } else if (lmtInfo.lmtFlag === '0') {
          reLmtInfo = lmtInfo;
          return false;
        }
      });
      return reLmtInfo;
    },
    onlyNum: function(target) {
      var curVal = target.value;
      var curNum = parseFloat(curVal);
      if (isNaN(curNum)) {
        curNum = '';
        target.value = '';
      }
      target.value = curNum;
      return curNum;
    },
    /**
     * @param {string} gradeSco "Ex+Vx+Mx" | "12+T"
     * @return {number | string} "num[+T]" 数字或者数字加T
     */
    gradeScoHandler: function (gradeSco){
      const scoReg = /^E(\d)\+V(\d|T)\+M(\d)$/
      if(scoReg.test(gradeSco)){
        const matchResult = gradeSco.match(scoReg);
        let matchResult2 = parseInt(matchResult[2])
        isNaN(matchResult2) && (matchResult2 = 0)
        return matchResult && parseInt(matchResult[1]) + parseInt(matchResult[3]) + matchResult2;
      }else{
        return parseInt(gradeSco)
      }
    }
  });
  vm.$watch('totalSco', function(newV) {
    newV = vm.gradeScoHandler(newV);
    vm.totalScoRankInfo = calRisk(newV);
  });
  /**
   * 计算总分
   */
  function calScore() {
    var totalScore = 0;
    var tempNum = 0;
    var tempStr = '';
    var singleCheckItem = vm.groupScoMap['*'];
    var thisScoreVal;
    var checkFlag = false; //至少选择一项标记
    if (_gradeType === 'GCS') {
      totalScore = '';
    }
    if (singleCheckItem && singleCheckItem.scoreValue !== '') {
      //勾选单选
      totalScore = singleCheckItem.scoreValue;
    } else {
      //未勾选单选或无单选
      for (var k in vm.groupScoMap) {
        if (vm.groupScoMap.hasOwnProperty(k) && k !== '*' && k !== 'FAKE') {
          thisScoreVal = vm.groupScoMap[k].scoreValue;
          tempNum = parseInt(thisScoreVal);
          if (thisScoreVal === '') {
            //如果当前为空值，则置0，否则为特殊值保留NaN
            tempNum = 0;
          } else {
            //至少选择了一项
            checkFlag = true;
          }

          if (_gradeType === 'GCS') {
            if(thisScoreVal.includes('T')){
              thisScoreVal = 'T'
            }
            const tempMap = {
              A: 'E{scoreValue}+',
              B: 'V{scoreValue}+',
              C: 'M{scoreValue}'
            }
            totalScore += tempMap[k].replace(/{scoreValue}/, thisScoreVal)
          } else if (isNaN(tempNum)) {
            //如果是NaN则中间有字母类
            tempStr = thisScoreVal;
          } else {
            totalScore += tempNum;
          }
        }
      }
    }
    // console.log(_gradeType)
    // if (_gradeType === 'GCS') {
    //   //如果是GCS，有T类型
    //   console.log(totalScore)
    //   if (tempStr) {
    //     totalScore += '+T';
    //   }
    // }
    if (!checkFlag) {
      //如果未选中至少一项有值项，清空数值
      totalScore = '';
    }
    return totalScore;
  }
  /**
   * 计算危险度
   */
  function calRisk(totalSco) {
    var totalScoNum;
    var reRiskInfo = {};
    if (curRiskInfo && totalSco !== '') {
      totalScoNum = parseInt(totalSco);
      $.each(curRiskInfo.riskDetail, function(idx, riskInfo) {
        if (
            totalScoNum >= riskInfo.lowValue &&
            totalScoNum <= riskInfo.uppValue
        ) {
          // 降序排列，比较上限
          reRiskInfo = riskInfo;
          return false;
        }
      });
    }
    return reRiskInfo;
  }
  /**
   * 取字典数据
   */
  function getDictInfo() {
    vm.bodyShowFlag = false;
    var reqUrl = '${baseurl}icuscore/getGradeItemDef.do';
    var reqParam = {
      gradeType: _gradeType
    };
    var tableMode = vm.tableMode;
    return publicFun.httpRequest(reqUrl, reqParam, function(res) {
      if (!res.resultInfo.success) {
        alert_error('请求出错，请联系管理员');
      }
      var sysdata = res.resultInfo.sysdata;
      var headScoreList = sysdata.scoreList;
      defLmtMap = sysdata.lmtMap || {}; // 评分区间映射
      var defList = sysdata.itemDef;

      var levelNumb = 0; // 层级数量
      var totalList = []; //总列表
      var scoreList = []; //评分表
      var scoreObj;
      var itemFlag; //节点类型
      var groupScoMap = {}; // v - table-sco-map
      var hTableChildListMap = {}; // h-table 查重，用以剔除父级变量
      var temp;
      var regStr = /\s或\s/g;
      var hTrNumb; // cal h table tr numb
      $.each(defList, function(defIdx, defInfo) {
        // gen fiedlMap
        fieldMap[defInfo.itemField] = defInfo;
        itemFlag = defInfo.itemFlag;
        // reset 'NULL'
        if (defInfo.itemName === 'NULL' || !defInfo.itemName) {
          defInfo.itemName = '';
        }
        if (defInfo.itemUnit === '#') {
          defInfo.itemUnit = '';
        }

        if (itemFlag === '0') {
          // root
          vm.scoreName = defInfo.itemName;
          if (tableMode === 'h' || tableMode === 'i') {
            levelNumb =
                parseInt(defInfo.itemRoot.replace(/[a-zA-Z]/g, '')) - 1;
          }
        } else if (itemFlag === '1') {
          if (tableMode === 'h' || tableMode === 'i') {
            //如果是横向渲染，插入子节点映射
            defInfo.rootRowNumb = 0;
            defInfo.lmtFlag = '#';
            if (levelNumb === 1) {
              defInfo.rootSelfIdx = 0;
              defInfo.rootName = defInfo.itemName;
              defInfo.detlList = headScoreList.map(function() {
                return {
                  itemField: 'FAKE',
                  itemGroup: 'FAKE',
                  scoreValue: 'FAKE'
                };
              });
              defInfo.hideSecNode = true;
              totalList.push(defInfo);
            }
          }
              // if (tableMode === 'i') {
              //     // mods || sofa
              //     defInfo.rootRowNumb = 0;
          // }else
          else if (tableMode === 'v') {
            //如果是纵向渲染，插入子节点列表
            defInfo.detlList = [];
            totalList.push(defInfo);
          } else if (tableMode === 'c') {
            defInfo.checkedNumb = 0;
            defInfo.detlList = [];
            totalList.push(defInfo);
          }
        } else if (itemFlag === '2') {
          // 次级节点
          temp = fieldMap[defInfo.itemRoot]; // item(itemFlag===1)
          if (tableMode === 'h' || tableMode === 'i') {
            defInfo.secRowNumb = 0;
            defInfo.lmtFlag = '#';
            if (levelNumb === 2) {
              if (!defInfo.itemName) {
                defInfo.hideSecNode = true;
              }
              defInfo.rootSelfIdx = temp.rootRowNumb++;
              defInfo.rootName = temp.itemName;
              defInfo.detlList = headScoreList.map(function() {
                return {
                  itemField: 'FAKE',
                  itemGroup: 'FAKE',
                  scoreValue: 'FAKE'
                };
              });
              totalList.push(defInfo);
            }
          } else if (tableMode === 'v') {
            // 有次级说明，当前为次级说明项
            defInfo.scoreList = [];
            temp.detlList.push(defInfo);
          }
        } else if (itemFlag === '9') {
          groupScoMap[defInfo.itemGroup] = {
            itemField: '',
            scoreValue: ''
          };
          // 末端节点
          temp = fieldMap[defInfo.itemRoot]; // item(itemFlag===2||itemFlag===1)
          if (tableMode === 'h' || tableMode === 'i') {
            //GCS-like
            if (defInfo.lmtFlag !== '#') {
              // 评分类itemGroup一致，增加lmtFlag和inputValue
              groupScoMap[defInfo.itemGroup].itemRoot = '';
              groupScoMap[defInfo.itemGroup].inputValue = '';
              temp.lmtFlag = defInfo.lmtFlag;
              temp.itemGroup = defInfo.itemGroup;
            }
            temp.detlList[defInfo.scoreCol - 1] = defInfo;
          } else if (tableMode === 'v') {
            // 处理末级项
            if (!temp.scoreList) {
              // NRS-like, 无次级项，在主项添加评分项
              temp.scoreList = [];
            }
            if (defInfo.itemName === 'NULL' || !defInfo.itemName) {
              defInfo.itemName = '';
            } else {
              vm.vtShowSecondChild = true;
            }
            temp.scoreList.push(defInfo);
          } else if (tableMode === 'c') {
            // TISS-like
            temp.detlList.push(defInfo);
          }
        }
      });
      // 模拟SOFA类空白td，防止报错
      groupScoMap['FAKE'] = {};
      // console.log(groupScoMap);
      // console.log(totalList);
      if (tableMode === 'h' || tableMode === 'i') {
        vm.headScoreList = headScoreList;
        // 遍历赋值
        totalList.forEach(function(totalInfo, totalIdx) {
          if (totalInfo.rootSelfIdx === 0) {
            // 首行元素更新合并数
            if (totalInfo.itemFlag === '1') {
              totalInfo.rootRowSpanNumb = 1;
            } else if (totalInfo.itemFlag === '2') {
              totalInfo.rootRowSpanNumb =
                  fieldMap[totalInfo.itemRoot].rootRowNumb;
            }
          }
        });
      } else if (tableMode === 'v') {
        // cal odd tr
        // hTrNumb = 0;
        totalList.forEach(function(totalInfo) {
          temp = totalInfo.scoreList || totalInfo.detlList;
          totalInfo.firstRowSpanNum = temp.length;
          temp.forEach(function(itemInfo, itemIdx) {
            if (vm.vtShowSecondChild && !itemInfo.itemName) {
              // ICSDSC-like add colspan
              totalInfo.mergeSecondChild = true;
            } else {
              totalInfo.mergeSecondChild = false;
            }
          });
        });
      }
      // console.log(totalList);
      vm.groupScoMap = groupScoMap;
      vm.totalList = totalList;
      vm.hDetlColW = H_SCORE_W / headScoreList.length;
      vm.hDetlTdW = vm.hDetlColW - tdPadding;
      checkboxWidth = $('input[type="checkbox"]')
          .eq(0)
          .outerWidth();
      vm.hLabelWidth = vm.hDetlTdW - checkboxWidth;
    });
  }
  /**
   *取全局数据
   */
  function getAllInfo() {
    // if (vm.tableMode === 'mc') {
    //     // 多选类型取消
    //     getParentModInfo();;
    //     return;
    // }
    publicFun.httpRequest(
        _baseUrl + 'icuscore/findGradeInfoByParam.do',
        {
          liveNo: _liveNo,
          gradeSeq: _gradeSeq,
          gradeType: _gradeType
        },
        function(res) {
          if (!res.resultInfo.success) {
            alert_error('请求失败，请联系管理员');
            return;
          }
          var itemList = res.resultInfo.sysdata.itemlist;
          var totalInfo = res.resultInfo.sysdata.totalInfo;
          var sofaByFirst = res.resultInfo.sysdata.sofaByFirst || [];
          if(totalInfo){
            _linkSeq = totalInfo.linkSeq || '';
          }
          var thisItemField = '';
          var thisItemRoot = '';
          var checkedItem;
          var checkedItemGroup;
          var thisVal;
          var loopFlag = true;


          itemList.forEach(function(itemInfo) {
            thisVal = itemInfo.itemValue || '';
            if (itemInfo.itemFlag === 'T') {
              //如果是总分项
              vm.totalSco = thisVal;
            } else {
              thisItemField = itemInfo.itemField;
              thisItemRoot = itemInfo.itemRoot;
              checkedItem = fieldMap[thisItemField];
              checkedItemGroup = checkedItem.itemGroup;
              if (checkedItemGroup === '*') {
                //如果是单选项，增加单选锁
                vm.singleLock = thisVal;
              }
              vm.groupScoMap[checkedItemGroup].itemField = thisItemField;
              if (checkedItem.lmtFlag !== '#') {
                vm.groupScoMap[checkedItemGroup].itemRoot = thisItemRoot;
                vm.groupScoMap[checkedItemGroup].inputValue = thisVal;
                $('.i-table-input.' + thisItemRoot).val(thisVal);
                if (thisVal) {
                  vm.groupScoMap[
                      checkedItemGroup
                      ].scoreValue = vm.calCurInputVal(
                      thisVal,
                      fieldMap[thisItemRoot]
                  ).scoreValue;
                }
              } else {
                if (vm.tableMode === 'c') {
                  // 累计项目数量
                  $.each(vm.totalList, function(idx, totalInfo) {
                    if (totalInfo.itemField === itemInfo.itemRoot) {
                      totalInfo.checkedNumb++;
                      return false;
                    }
                  });
                }
                vm.groupScoMap[checkedItemGroup].scoreValue = thisVal;
              }
            }
          });
          //sofa 首次取值
          if(itemList.length===0 && sofaByFirst.length !==0){
            sofaByFirst.forEach(function(itemInfo) {
              console.log("进入")
              $("."+itemInfo.itemField+"").val(itemInfo.itemValue);

              thisVal = itemInfo.itemValue || '';

              thisItemField = itemInfo.itemField;
              thisItemRoot = itemInfo.itemRoot;
              checkedItem = fieldMap[thisItemField];
              checkedItemGroup = checkedItem.itemGroup;

              vm.groupScoMap[checkedItemGroup].itemField = thisItemField;
              if (checkedItem.lmtFlag !== '#') {
                $('.i-table-input.' + thisItemRoot).val(thisVal);
                if (thisVal) {
                  vm.groupScoMap[checkedItemGroup].itemRoot = checkedItem.itemField;
                  vm.groupScoMap[
                      checkedItemGroup
                      ].scoreValue = vm.calCurInputVal(
                      thisVal,
                      checkedItem
                  ).scoreValue;
                  vm.groupScoMap[
                      checkedItemGroup
                      ].itemField = vm.calCurInputVal(
                      thisVal,
                      checkedItem
                  ).itemField;
                  vm.groupScoMap[
                      checkedItemGroup
                      ].inputValue = thisVal;
                  totalSco = calScore();
                  vm.totalSco = totalSco;
                }
              }
            })

          }

          if (totalInfo) {
            $('#gradeTimeStr').val(
                publicFun.timeFormat(totalInfo.gradeTime, 'yyyy/MM/dd hh:mm')
            );
            $('#gradeUser').val(totalInfo.gradeUser);
            eicuUtil.queryDoct($('#gradeUser'));
          } else {
            getParentModInfo();
          }
          vm.bodyShowFlag = true;
        }
    );
  }
  /**
   * 保存
   */
  function saveCom(closeFlag) {
    if (vm.totalSco === '') {
      alert_warn('评分不能为空');
      return false;
    }
    var gradeUser = vm.user.userId || '';
    var gradeTimeStr = $('#gradeTimeStr').val();
    if (!gradeTimeStr) {
      alert_warn('评分时间不能为空');
    } else if (!gradeUser) {
      alert_warn('评分人不能为空');
    } else {
      // _confirm('您确认提交吗？', null, function () {
      // var $checkList = $('input:checked');
      var itemList = [];
      // if (vm.tableMode === 'i') {
      //     $.each(vm.groupScoMap, function (k, v) {
      //         if (vm.groupScoMap.hasOwnProperty(k)) {
      //             if (v.itemField && v.inputValue) {
      //                 itemList.push({
      //                     itemField: v.itemField,
      //                     itemValue: v.inputValue
      //                 })
      //             }
      //         }
      //     })
      // } else {
      $.each(vm.groupScoMap, function(k, v) {
        if (vm.groupScoMap.hasOwnProperty(k)) {
          if (v.itemField && v.scoreValue) {
            itemList.push({
              itemField: v.itemField,
              itemValue: v.inputValue || v.scoreValue
            });
          }
        }
      });
      // }
      itemList.push({
        itemField: _gradeType + '_SCO',
        itemValue: vm.totalSco
      });
      // console.log(itemList);
      // return;
      publicFun.httpRequest(
          _baseUrl + 'icuscore/editGradeSco.do',
          {
            icuGradeTotalCustom: {
              liveNo: _liveNo,
              gradeSeq: _gradeSeq,
              gradeType: _gradeType,
              gradeTimeStr: $('#gradeTimeStr').val(),
              gradeUser: vm.user.userId || '',
              gradeSco: vm.totalSco,
              gradeDetl: vm.scoreName + ': ' + vm.totalSco + '分',
              linkSeq: _linkSeq
            },
            itemList: itemList
          },
          {
            requestType: 'json'
          },
          function(res) {
            if (!res.resultInfo.success) {
              alert_warn(res.resultInfo.message);
              return;
            }
            if (!_gradeSeq) {
              _gradeSeq = res.resultInfo.sysdata.gradeSeq;
              vm.gradeSeq = _gradeSeq;
            }
            if (parent.modalReturnFun) {
              // outer page
              parent.alert_success('操作成功');
              parent.modalReturnFun(
                  vm.totalSco,
                  res.resultInfo.sysdata.gradeSeq,
                  closeFlag,
                  $('#gradeUser').data('userid')
              );
            } else {
              // old page
              parent.$('#tabDiv').datagrid('reload');
              alert_success('操作成功');
              if (closeFlag) {
                setTimeout(function() {
                  window.top.$('#tabs').tabs('close', eicuUtil.tabInfo.title);
                }, 1000);
              }
            }
          }
      );
    }
  }
  /**
   *删除当前评分
   */
  function delThisGrade() {
    parent.delGrade(_gradeType, _gradeSeq);
  }
  /**
   * 清空选中列方法
   */
  function resetClickedCol() {
    vm.selectIdx = '';
    $clickedCol = null; //重置选中列
  }
  /**
   * 赋值父元素签名数据
   */
  function getParentModInfo() {
    var thisDateStr;
    if (_pGradeTimeStr) {
      thisDateStr = _pGradeTimeStr;
    } else {
      thisDateStr = publicFun.timeFormat(
          new Date().getTime(),
          'yyyy/MM/dd hh:mm'
      );
    }
    $('#gradeTimeStr').val(thisDateStr);
    // $('#gradeUser').val(_userid);
    vm.user.userId = _userid
    eicuUtil.queryDoct($('#gradeUser'));
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
  /**
   * 布局设置
   */
  function setLayout() {
    var WIN_W = $(window).width();
    var WIN_H = $(window).height();
    var modInfo_H = $('#mod-info-box').outerHeight();
    var saveBar_H = $('#saveBar').outerHeight();
    $('#sco-container').outerHeight(WIN_H - saveBar_H - modInfo_H);
  }
  $(function() {
    setLayout();
    getDictInfo().done(function() {
      getAllInfo();
    });
    eicuUtil.bindUserInput();
  });
</script>
</body></html
>
