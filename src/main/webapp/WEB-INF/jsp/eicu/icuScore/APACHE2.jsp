<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>APACHE-Ⅱ评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}styles/eicu/eicu_common.css">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}styles/apache2.css?aaa=5555">
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <style>
    html {
      overflow-y: auto;
    }

    p.headtitle {
      font-size: 18px;
      padding: 10px;
      text-align: center;
    }

    #apacForm {
      margin-bottom: 5px;
    }

    .text-center {
      text-align: center;
    }

    .container {
      margin: 0 auto;
      width: 96%;
    }

    table.container tr td {
      border: 1px solid black;
    }

    table.container .w-150 {
      width: 150px;
    }

    table.container .scoreInput {
      width: 60px;
      text-align: center;
    }

    table.container td.title {
      font-weight: bold;
    }

    input.dPartInput {
      width: 87%;
      padding-left: 0;
    }

    .dPartContainer tr.itemTr:hover td:not(.lastTd) {
      background-color: #fdff65;
    }

    #modInfo {
      overflow: hidden;
    }
    
    table tr td .score-label {
        margin-left: 3px;
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
        margin-left: 3px;
        text-align: left;
    }

    table tr td .score-label>input[type="checkbox"] {
        width: 13px;
        box-sizing: border-box;
    }
    .input-td input {
	    height: 24px;
	    line-height: 24px;
	    box-sizing: border-box;
	}
  </style>
</head>

<body class="scoreQuery" ms-controller="apacGde">
  <p class="headtitle"></p>
  <div class="panelGde">
    <form id="apacForm" action="${baseurl}icuscore/addApacScore.do" method="post">
      <table class="container">
        <colgroup>
          <col class="w-150">
          <col class="w-150">
          <col class="w-150">
          <col class="w-150">
          <col class="w-150">
          <col class="w-150">
          <col class="w-150">
        </colgroup>
        <tr>
          <td class="title"><span style="color:blue">A</span> 年龄评分</td>
          <td colspan="5">
            <span
              style="display:inline-block;width:85%;text-align:center">≥75--6&nbsp;&nbsp;&nbsp;&nbsp;65~74--5&nbsp;&nbsp;&nbsp;&nbsp;55~64--3&nbsp;&nbsp;&nbsp;&nbsp;45~54--2&nbsp;&nbsp;&nbsp;&nbsp;≤44--0</span>
            <input type="text" ms-duplex="aPart.APACHE2_A_1" ms-keyup="onlyNum(this)"
              name="APACHE2_A_1" autocomplete="off" style="width: 10%;text-align:center">
          </td>
          <td class="title">
            <span style="color:blue">A</span> 记分：<span>{{scoreObj.APACHE2_A_SCO}}</span>
            <input type="hidden" ms-duplex="scoreObj.APACHE2_A_SCO" name="APACHE2_A_SCO">
          </td>
        </tr>
        <tr>
          <!-- 有严重器官系统功能不全或免疫损害 -->
          <!-- 慢性器官功能不全或免疫功能抑制 -->
          <td class="title"><span style="color:blue">B</span> 慢性健康评分</td>
          <td colspan="5">
            <label ms-repeat="bPart.apacBarr" style="display:block;">
              <input type="radio" name="APACHE2_B_1" ms-duplex-string="bPart.APACHE2_B_1" ms-attr-value="el.symbol"
                ms-click="bPartClick($event, el.value, el.symbol)">
              {{el.value}}
              {{el.info}}
            </label>
          </td>
          <td class="title">
            <span style="color:blue">B</span> 记分：<span>{{scoreObj.APACHE2_B_SCO}}</span>
            <input type="hidden" ms-duplex="scoreObj.APACHE2_B_SCO" name="APACHE2_B_SCO">
          </td>
        </tr>
        <tr>
          <td class="title"><span style="color:blue">C</span> GCS评分</td>
          <td class="text-center title">6</td>
          <td class="text-center title">5</td>
          <td class="text-center title">4</td>
          <td class="text-center title">3</td>
          <td class="text-center title">2</td>
          <td class="text-center title">1</td>
        </tr>
        <tr ms-repeat="cPart.cPartArr">
          <td>
            {{($index+1) + "、" + el.type}}
          </td>
          <td ms-repeat-ele="el.content">
            <span ms-css-display="{{ele.info?'inline-block':'none'}}">
              <label ms-click="GCSclick($event)">
                <input type="checkbox" ms-attr-value="ele.num" ms-attr-name="{{el.typeCode}}">
                {{ele.info}}
              </label>
            </span>

          </td>
        </tr>
        <tr>
          <td class="title" colspan="3">GCS评分 = 1 + 2 + 3</td>
          <td class="title" colspan="3">C = 15 - GCS评分
          </td>
          <td class="title">
            <span style="color:blue">C</span> 记分：<span>{{scoreObj.APACHE2_C_SCO}}</span>
            <input type="hidden" ms-duplex="scoreObj.APACHE2_C_SCO" name="APACHE2_C_SCO">
          </td>
        </tr>
      </table>
      <table class="container dPartContainer">
        <colgroup>
          <col>
          <col>
          <col ms-repeat="headScoreList">
          <col class="scoreInput">
          <col>
        </colgroup>
        <thead>
        <tr>
          <td class="title" rowspan="2" colspan="2"><span style="color:blue">D</span> 急性生理评分</td>
          <td class="text-center title" ms-attr-colspan="{{headScoreList.length}}">分值</td>
          <td class="text-center title" rowspan="2">数据</td>
          <td class="title" rowspan="2">
            <span style="color:blue">D</span> 记分：<span>{{scoreObj.APACHE2_D_SCO}}</span>
            <input type="hidden" ms-duplex="scoreObj.APACHE2_D_SCO" name="APACHE2_D_SCO">
          </td>
        </tr>
        <tr>
          <td ms-repeat="headScoreList">{{el.scoreMemo}}</td>
        </tr>
        </thead>
        <tbody>
        <tr ms-repeat-rootinfo="totalList">
        	
			<td ms-if="rootinfo.rootSelfIdx === 0" class="root-name"
			    ms-css-width="{{rootinfo.hideSecNode ? itemNameColW : (itemNameColW*0.2)}}"
			    ms-attr-colspan="{{rootinfo.hideSecNode ? '2' : '1'}}"
			    ms-attr-rowspan="{{rootinfo.rootRowSpanNumb}}">
			    <div class="item-name-td"
			        ms-css-width="{{rootinfo.hideSecNode ? (itemNameTdW) : ((itemNameColW*0.2))}}">
			        {{rootinfo.showLineNumb}}<!-- {{rootinfo.rootName}} -->
			    </div>
			</td>
			<td ms-if="!rootinfo.hideSecNode" class="root-name"
			    ms-css-width="{{itemNameColW*0.6 - 12}}">
			    <div class="item-name-td"
			        ms-css-width="itemNameColW*0.6 - 12">
			        {{rootinfo.itemName}}
			    </div>
			</td>
			<td ms-repeat-iteminfo="rootinfo.detlList"
			    ms-class="{{(groupScoMap[iteminfo.itemGroup].itemField === iteminfo.itemField && groupScoMap[iteminfo.itemGroup].scoreValue === iteminfo.scoreValue) ? 'td-checked':''}}"
			    ms-css-width="hDetlTdW">
			    <label class="score-label" ms-if="iteminfo.itemField!=='FAKE'" ms-css-width="hDetlTdW">
			        <input type="checkbox" ms-class="{{rootinfo.itemField}}"
			            ms-attr-name="{{iteminfo.itemField}}" ms-attr-value="{{iteminfo.scoreValue}}"
			            ms-attr-checked="{{groupScoMap[iteminfo.itemGroup].itemField === iteminfo.itemField && groupScoMap[iteminfo.itemGroup].scoreValue === iteminfo.scoreValue}}"
			            ms-attr-disabled="{{iteminfo.lmtFlag === '#' ? false : true}}"
			            ms-click="scoCheck(iteminfo, $event)">
			        <div class="score-label-name" ms-css-width="hLabelWidth">
			            {{iteminfo.itemName}}
			        </div>
			    </label>
			</td>
			<td class="input-td" ms-css-width="itemNameTdW-30">
			    <label class="score-label" ms-css-width="itemNameTdW-30">
			        <input ms-if="rootinfo.lmtFlag !=='#'" type=" text" class="i-table-input"
			            ms-class-1="{{rootinfo.itemField}}" ms-css-width="{{itemNameTdW-10 - 70}}"
			            ms-attr-name="{{groupScoMap[rootinfo.itemGroup].itemField}}"
			            ms-attr-disabled="groupScoMap[rootinfo.itemGroup].scoreValue !== '' && groupScoMap[rootinfo.itemGroup].itemRoot !== rootinfo.itemField"
			            ms-keyup="hTableInput(rootinfo, $event)" ms-blur="setInputSco($event, rootinfo)">
		            <span class="unit" style="margin-left: 3px">{{rootinfo.itemUnit === ''? '':(rootinfo.itemUnit)}}</span>
		       </label>
		  	 </td>
			  <td ms-if="rootinfo.rootSelfIdx === 0" ms-css-width="itemNameTdW-20" ms-attr-rowspan="{{rootinfo.rootRowSpanNumb}}">
			  	{{groupScoMap[rootinfo.itemGroup].scoreValue !== 'fake'? groupScoMap[rootinfo.itemGroup].scoreValue : ''}}
			  </td>
			</tr>
        </tbody>
        
        <tr ms-if="APACHE2_SCO">
          <td class="title" colspan="2"><span style="color:blue">R</span> 预期死亡率</td>
          <td class="text-center title" colspan="2">
            <span style="cursor:pointer;color:blue" onclick="openDiagType()">
              <span>{{diagTypeInfo.diagTypeNumb ? ("已选择诊断类型权重：" + diagTypeInfo.diagTypeNumb) : "请选择诊断类型权重 "}}</span>
              <input type="hidden" ms-duplex="diagTypeInfo.diagTypeSymbol" name="APACHE2_E_1">
              <input type="hidden" ms-duplex="diagTypeInfo.diagTypeNumb" name="APACHE2_E_2">
            </span>
          </td>
          <td class="text-center title" colspan="7">
            <span>
              <span>
                Ln(R/(1-R)) = -3.517 + ( 0.146 *
                <span class="unit">
                  {{APACHE2_SCO === 'null' ? 'APACHE评分' : APACHE2_SCO}}
                  <small ms-if="APACHE2_SCO">
                    (APACHE评分)
                  </small>
                </span>
                ) +
                <span class="unit">
                  {{diagTypeInfo.diagTypeNumb || '诊断类型权重'}}
                  <small ms-if="diagTypeInfo.diagTypeNumb">
                    (诊断类型权重)
                  </small>
                </span>
                <span ms-if="diagTypeInfo.diagTypeFlag==='yes'">
                  + 0.603
                </span>
              </span>
            </span>
            <!--
            =>
            <span>预期死亡率R = e<sup>{{diagTypeInfo.aStr||'a'}}</sup>/(1+e<sup>{{diagTypeInfo.aStr||'a'}}</sup>)</span>
            -->
          </td>
          <td class="text-center title" colspan="2">
            <span style="color:blue">R</span> 预期死亡率：<span>{{APACHE2_E_EDR}}</span>
            <input type="hidden" ms-duplex="APACHE2_E_EDR" name="APACHE2_E_EDR">
          </td>
        </tr>
        <tr>
          <td class="text-center title" colspan="4">APACHEⅡ评分 = A + B + C + D</td>
          <td class="text-center title" colspan="7">
            <!-- <label class="labtab"><span>评分时间：{{lastTime}}&nbsp;&nbsp;&nbsp;&nbsp;评分用户：{{lastUser}}</span></label> -->
            <div id="modInfo" class="signBorderBox">
              <label>
                <span>评分时间：</span>
                <input class="Wdate" type="text" id="gradeTimeStr"
                  onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})" autocomplete="off">
              </label>
              <label>
                <span>评分人：</span>
                <input class="userInput" type="text" id="gradeUser" autocomplete="off">
              </label>
            </div>
          </td>
          <td class="text-center title" colspan="2">总分：{{APACHE2_SCO}}</td>
          <input type="hidden" ms-duplex="APACHE2_SCO" name="APACHE2_SCO">
        </tr>
      </table>
    </form>
  </div>
  <script type="text/javascript">
    //全局变量
    var ptBasicInfo = eicuUtil.ptBasicInfo;
    var _liveNo = ptBasicInfo.liveNo;
    var _custAge = ptBasicInfo.custAge;
    var _userid = "${activeUser.usrno}";
    var _gradeSeq = "${gradeSeq}";
    var _gradeType = "${gradeType}";
  </script>
  <script src="${baseurl}js/subpageJs/eicu/scoreCommon.js" type="text/javascript" charset="UTF-8"></script>
  <script type="text/javascript">
  	var windowPadding = 10;
  	var itemNameColW = 121;
  	var tdPadding = 6;
  	var itemNameTdW = itemNameColW - tdPadding;
  	var iTableNameColW = 151;
  	var H_SCORE_W = $(window).width() - windowPadding * 2 - itemNameColW - 12; //横向表格评分项目总宽度
        H_SCORE_W += 10;
        H_SCORE_W -= iTableNameColW;
  	
  	var fieldMap = {}; //分类映射
  	
    var vm = avalon.define({
      $id: "apacGde",
   	  headScoreList:[],
   	  groupScoMap:{},
   	  totalList: [], //以父元素为基点的列表
   	  hDetlColW: 100, //动态计算横向表格列宽度
   	  hDetlTdW: 89,
   	  hLabelWidth: '90%', //label宽度
      lastTime: '',
      lastUser: '',
      aPart: {
        APACHE2_A_1: isNaN(parseInt(_custAge)) ? "" : parseInt(_custAge),
        ageScore: ''
      },
      bPart: {
        apacBarr: [{
            info: '慢性器官功能不全或免疫功能抑制，择期手术后入ICU',
            value: '2',
            symbol: '1'
          },
          {
            info: '慢性器官功能不全或免疫功能抑制，急诊手术后入ICU',
            value: '5',
            symbol: '3'
          },
          {
            info: '慢性器官功能不全或免疫功能抑制，非手术后入ICU',
            value: '5',
            symbol: '2'
          },
          {
            info: '无上述情况',
            value: '0',
            symbol: '4'
          }
        ],
        APACHE2_B_1: "4", //apacB选项标志
        APACHE2_B_SCO: "0"
      },
      bPartClick: function (event, APACHE2_B_SCO) {
        if (APACHE2_B_SCO !== vm.bPart.APACHE2_B_SCO) {
          vm.bPart.APACHE2_B_SCO = APACHE2_B_SCO;
        }
        //预期死亡率flag变更
        if (this.value === "3") {
          //如果是急诊手术后
          vm.diagTypeInfo.diagTypeFlag = "yes";
          vm.diagTypeInfo.diagTypeNumb = "";
          vm.diagTypeInfo.aStr = '';
        } else {
          vm.diagTypeInfo.diagTypeFlag = "no";
          vm.diagTypeInfo.diagTypeNumb = "";
          vm.diagTypeInfo.aStr = '';
        }
      },
      cPart: {
        cPartArr: [{
            type: "睁眼反应",
            typeCode: "APACHE2_C_1",
            content: [{
                info: null,
                num: 6
              },
              {
                info: null,
                num: 5
              },
              {
                info: "自动睁眼",
                num: 4
              },
              {
                info: "呼唤睁眼",
                num: 3
              },
              {
                info: "刺疼睁眼",
                num: 2
              },
              {
                info: "不能睁眼",
                num: 1
              }
            ],
            name: "APACHE2_C_1"
          },
          {
            type: "语言反应",
            typeCode: "APACHE2_C_2",
            content: [{
                info: null,
                num: 6
              },
              {
                info: "回答切题",
                num: 5
              },
              {
                info: "回答不切题",
                num: 4
              },
              {
                info: "答非所问",
                num: 3
              },
              {
                info: "只能发音",
                num: 2
              },
              {
                info: "不能言语",
                num: 1
              }
            ],
            name: "APACHE2_C_2"
          },
          {
            type: "运动反应",
            typeCode: "APACHE2_C_3",
            content: [{
                info: "按吩咐动作",
                num: 6
              },
              {
                info: "刺疼能定位",
                num: 5
              },
              {
                info: "刺疼能躲避",
                num: 4
              },
              {
                info: "刺疼肢体屈曲",
                num: 3
              },
              {
                info: "刺疼肢体伸展",
                num: 2
              },
              {
                info: "不能活动",
                num: 1
              }
            ],
            name: "APACHE2_C_3"
          }
        ],
        APACHE2_C_3_SCO: '',
        APACHE2_C_2_SCO: '',
        APACHE2_C_1_SCO: ''
      },
      scoreObj: {
        APACHE2_A_SCO: '',
        APACHE2_B_SCO: '0',
        APACHE2_C_SCO: '',
        APACHE2_D_SCO: ''
      },
      APACHE2_SCO: "", //阿帕奇评分
      APACHE2_E_EDR: "", //预期死亡率
      // 诊断类型
      diagTypeInfo: {
        diagTypeFlag: "no",
        diagTypeNumb: "",
        diagTypeSymbol: "",
        aStr: ''
      },
      // 其余事件
      GCSclick: function (e) {
        if (e && e.stopPropagation) {
          //非IE
          e.stopPropagation()
        } else {
          //IE
          e.cancelBubble = true;
        }
        var $input = $(this).find('input');
        var name = $input.attr('name');
        var scoreKey = name + '_SCO';
        var value = $input.val();
        if (!$input.prop("checked")) {
          vm['cPart'][scoreKey] = '';
        } else {
          $("input[name='" + name + "']").prop('checked', false);
          $input.prop('checked', true);
          vm['cPart'][scoreKey] = $input.val();
        }
        if (vm['cPart']['APACHE2_C_3_SCO'] && vm['cPart']['APACHE2_C_2_SCO'] && vm['cPart']['APACHE2_C_1_SCO']) {
          vm.scoreObj.APACHE2_C_SCO = 15 - parseInt(vm['cPart']['APACHE2_C_3_SCO']) - parseInt(vm['cPart'][
            'APACHE2_C_2_SCO'
          ]) - parseInt(vm['cPart']['APACHE2_C_1_SCO']);
        } else {
          vm.scoreObj.APACHE2_C_SCO = '';
        }
        console.log(vm.cPart);
        calAllvalue();
      },
      hTableInput: function (rootInfo, e) {
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
       onlyNum: function (target) {
            var curVal = target.value;
            var curNum = parseFloat(curVal);
            if (isNaN(curNum)) {
                curNum = '';
                target.value = '';
            }
            target.value = curNum;
            return curNum;
        },
        calCurInputVal: function (value, parentNode) {
                var lmtInfoList = parentNode.detlList;
                var reLmtInfo;
                $.each(lmtInfoList, function (idx, lmtInfo) {
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
                })
                return reLmtInfo;
            },
       setInputSco: function (e, rootInfo) {
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
            vm.scoreObj.APACHE2_D_SCO = totalSco;
            calAllvalue()
        },
    });
    //监控年龄
    vm.aPart.$watch('APACHE2_A_1', function (newV, oldV) {
      if (newV === '') {
        vm.aPart.ageScore = '';
        vm.scoreObj.APACHE2_A_SCO = '';
      } else {
        var ageNum = parseInt(newV);
        if (ageNum <= 44) {
          vm.aPart.ageScore = '0';
        } else if (ageNum <= 54) {
          vm.aPart.ageScore = '2';
        } else if (ageNum <= 64) {
          vm.aPart.ageScore = '3';
        } else if (ageNum <= 74) {
          vm.aPart.ageScore = '5';
        } else {
          vm.aPart.ageScore = '6';
        }
        vm.scoreObj.APACHE2_A_SCO = parseInt(vm.aPart.ageScore);
      }

      calAllvalue();
    })
    vm.bPart.$watch('APACHE2_B_SCO', function (newV, oldV) {
      vm.scoreObj.APACHE2_B_SCO = parseInt(newV);
      calAllvalue();
    });
    vm.diagTypeInfo.$watch('diagTypeNumb', function (newV, oldV) {
      if (isNaN(parseFloat(newV))) {
        vm.aStr = '';
        vm.diagTypeInfo.diagTypeSymbol = ""; //如果诊断权重为空，置空诊断类型权重标记
        vm.APACHE2_E_EDR = ""; //置空预测死亡率
      } else {
        calEdRate();
      }
    })
		/**
         * 计算总分
         */
        function calScore() {
            var totalScore = 0;
            var tempNum = 0;
            var tempStr = '';
            var thisScoreVal;
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
                    if (isNaN(tempNum)) {
                        //如果是NaN则中间有字母类
                        tempStr = thisScoreVal;
                    } else {
                        totalScore += tempNum;
                    }
                }
            }
            return totalScore;
        }
    
    /**
     * 计算死亡预期率
     */
    function calEdRate() {
      var isOperated = vm.diagTypeInfo.diagTypeFlag === "yes" ? 1 : 0;
      var diagTypeNumb = vm.diagTypeInfo.diagTypeNumb;
      var R;
      if (diagTypeNumb !== "" && vm.APACHE2_SCO !== "") {
        var a = -3.517 + 0.146 * vm.APACHE2_SCO + parseFloat(diagTypeNumb) + isOperated * 0.603;
        vm.diagTypeInfo.aStr = a.toFixed(2).replace(/00$|0$/, ''); // del 0
        // console.log('apache2：', vm.APACHE2_SCO);
        // console.log('风险系数：', parseFloat(diagTypeNumb));
        // console.log('手术评分：', isOperated * 0.603);
        // console.log('计算的a为：', a);
        R = Math.exp(a) / (1 + Math.exp(a));
        // console.log('计算结果是：', R);
        if (R > 1) {
          R = 1;
        }
        R = (R * 100).toFixed(2) + "%";
      } else {
        R = "";
      }
      vm.APACHE2_E_EDR = R;
    }
    /**
     *计算总分
     */
    function calAllvalue() {
      var APACHE2_SCO = 0;
      $.each(vm.scoreObj, function (k, v) {
        if (vm.scoreObj.hasOwnProperty(k)) {
          if (v || v === 0) {
            APACHE2_SCO += parseInt(v);
          } else {
            APACHE2_SCO = "";
            //break;
            return false;
          }
        }
      })
      vm.APACHE2_SCO = APACHE2_SCO;
      calEdRate();
    }
    //保存
    function saveCom() {
      if (vm.APACHE2_SCO === '') {
        alert_warn("APACHEⅡ评分为空");
        return;
      }
      var gradeUser = $("#gradeUser").data("userid") || "";
      var gradeTimeStr = $("#gradeTimeStr").val();
      if (!gradeTimeStr) {
        alert_warn("评分时间不能为空");
      } else if (!gradeUser) {
        alert_warn("评分人不能为空");
      } else {
        // _confirm('您确认提交吗？', null, function () {
        //jquerySubByFId('apacForm', insertuser_callback, null, "json");
        var obj = $('#apacForm').serializeJson();
        var itemList = [];
        for (var key in obj) {
          var pushObj = {};
          // if (key === "APACHE2_D_91" || key === "APACHE2_D_92") {
          //   //如果是scrNumb
          //   if (obj[key] !== "") {
          //     pushObj["itemField"] = "SCR_NUMB";
          //     pushObj["itemValue"] = obj[key];
          //     itemList.push(pushObj);
          //   }
          //   continue;
          // }
          pushObj["itemField"] = key;
          pushObj["itemValue"] = obj[key];
          itemList.push(pushObj);
        }
        
        // console.log(itemList)
        // return;
        var ajaxOption = new AjaxOption();
        ajaxOption.requestData = {
          "icuGradeTotalCustom": {
            "liveNo": _liveNo,
            "gradeSeq": _gradeSeq,
            "gradeType": _gradeType,
            "gradeTimeStr": $("#gradeTimeStr").val(),
            "gradeUser": $("#gradeUser").data("userid") || "",
            "gradeSco": vm.APACHE2_SCO,
            "gradeDetl": scoreTitle + ': ' + vm.APACHE2_SCO + '分'
          },
          "itemList": itemList
        };
        ajaxOption.requestType = 'POST';
        ajaxOption.requestDataType = "json";
        ajaxOption.requestUrl = "${baseurl}icuscore/editGradeSco.do";
        ajaxOption.asyncFlg = true;
        ajaxOption.returnDataType = 'json';
        _ajaxPostRequest(ajaxOption, null, function (res) {
          insertuser_callback(res);
        });
        //})
      }
    }
    //保存回调
    function insertuser_callback(data) {
      parent.$('#panel-grid-table').datagrid('reload');
      parent.ajax_alert(data);
    }

    function getAllInfo() {
      //等待ms-repeat渲染完成
      setTimeout(function () {
        var getMsgUrl = _baseUrl + "icuscore/findGradeInfoByParam.do",
          getMsgData = {
            "gradeSeq": _gradeSeq,
            "gradeType": _gradeType,
            "liveNo": _liveNo
          };

        $.ajax({
          url: getMsgUrl,
          type: "POST",
          async: true,
          dataType: 'json',
          data: getMsgData,
          success: function (res) {
            var _res = res.resultInfo.sysdata.itemlist;
            var totalInfo = res.resultInfo.sysdata.totalInfo;

            if (!_res) {
              return;
            }
            _res.forEach(function (ele, idx, arr) {
              var field = ele.itemField;
              if (field === 'APACHE2_A_SCO' || field === 'APACHE2_B_SCO' || field === 'APACHE2_C_SCO' ||
                field === 'APACHE2_D_SCO') {
                vm.scoreObj[field] = (ele.itemValue || ele.itemValue === 0) ? ele.itemValue : '';
                if (field === 'APACHE2_B_SCO') {
                  vm.bPart.APACHE2_B_SCO = (ele.itemValue || ele.itemValue === 0) ? ele.itemValue : '';
                }
              } else if (field === 'APACHE2_B_1') {
                //赋值APACHE2_B_SCO标志
                vm.bPart.APACHE2_B_1 = ele.itemValue !== null ? ele.itemValue : "";
                if (ele.itemValue !== null && ele.itemValue === '3') {
                  vm.diagTypeInfo.diagTypeFlag = 'yes';
                }
              } else if (field === 'APACHE2_C_1' || field === 'APACHE2_C_2' || field === 'APACHE2_C_3') {
                vm["cPart"][field + "_SCO"] = ele.itemValue || "";
                $("[name*='" + field + "']").each(function () {
                  if ($(this).val() === (ele.itemValue + "")) {
                    $(this).prop("checked", true);
                    return false;
                  }
                })
              } else if (field === 'APACHE2_A_1') {
                if (ele.itemValue || ele.itemValue === 0) {
                  vm.aPart.APACHE2_A_1 = ele.itemValue;
                } else if (_custAge !== '无生日') {
                  vm.aPart.APACHE2_A_1 = parseInt(_custAge);
                }
              } else if (field === 'APACHE2_E_2') {
                vm.diagTypeInfo.diagTypeNumb = ele.itemValue !== null ? ele.itemValue : "";
              } else if (field === 'APACHE2_E_1') {
                vm.diagTypeInfo.diagTypeSymbol = ele.itemValue !== null ? ele.itemValue : "";
              } else if (field === 'APACHE2_E_EDR') {
                vm.APACHE2_E_EDR = ele.itemValue !== null ? ele.itemValue : "";
              } else {
              	var thisVal = ele.itemValue || '';
              	if("" === thisVal){
              		return;
              	}
              	 if (ele.itemFlag === 'T') {
              	    vm.APACHE2_SCO = thisVal;
	             } else {
		              var thisItemField = ele.itemField;
	                  var thisItemRoot = ele.itemRoot;
	                  var checkedItem = fieldMap[thisItemField];
	                  var checkedItemGroup = checkedItem.itemGroup;
	                  vm.groupScoMap[checkedItemGroup].itemField = thisItemField;
	                  if (checkedItem.lmtFlag !== '#') {
			              vm.groupScoMap[checkedItemGroup].itemRoot = thisItemRoot;
			              vm.groupScoMap[checkedItemGroup].inputValue = thisVal;
		                  vm.groupScoMap[checkedItemGroup].scoreValue =
		                      vm.calCurInputVal(thisVal, fieldMap[thisItemRoot]).scoreValue;
			              $('.i-table-input.' + thisItemRoot).val(thisVal); 
		              }
	              }
	              
              }
            })

            if (totalInfo) {
              // vm.lastUser = totalInfo.gradeUserStr;
              // vm.lastTime = publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm")
              $("#gradeTimeStr").val(publicFun.timeFormat(totalInfo.gradeTime, "yyyy/MM/dd hh:mm"));
              $("#gradeUser").val(totalInfo.gradeUser);
              eicuUtil.queryDoct($("#gradeUser"));
            } else {
              getParentModInfo();
            }
			vm.bodyShowFlag = true;
          }
        })

      }, 100)
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
            return publicFun.httpRequest(reqUrl, reqParam, function (res) {
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
                var showLineNumb = 0;
                var itemGroup = "";
                $.each(defList, function (defIdx, defInfo) {
                    // gen fiedlMap
                    fieldMap[defInfo.itemField] = defInfo;
                    itemFlag = defInfo.itemFlag;
                    // reset 'NULL'
                    if (defInfo.itemName === 'NULL' || !defInfo.itemName) {
                        defInfo.itemName = '';
                    }
                    if (defInfo.itemUnit === '#') {
                        defInfo.itemUnit = ''
                    }

                    if (itemFlag === '0') {
                        // root
                        vm.scoreName = defInfo.itemName;
                        levelNumb = parseInt(defInfo.itemRoot.replace(/[a-zA-Z]/g, '')) - 1;
                    } else if (itemFlag === '1') {
                        //如果是横向渲染，插入子节点映射
                        defInfo.rootRowNumb = 0;
                        defInfo.lmtFlag = '#';
                        if (levelNumb === 1) {
                            defInfo.rootSelfIdx = 0;
                            defInfo.rootName = defInfo.itemName;
                            defInfo.detlList = headScoreList.map(function () {
                                return {
                                    itemField: 'FAKE',
                                    itemGroup: 'FAKE',
                                    scoreValue: 'FAKE'
                                };
                            })
                            defInfo.hideSecNode = true;
                            totalList.push(defInfo);
                        }
                    } else if (itemFlag === '2') {
                        // 次级节点
                        temp = fieldMap[defInfo.itemRoot] // item(itemFlag===1)
                        defInfo.secRowNumb = 0;
                        defInfo.lmtFlag = '#';
                        if (levelNumb === 2) {
                            if (!defInfo.itemName) {
                                defInfo.hideSecNode = true;
                            }
                            defInfo.rootSelfIdx = temp.rootRowNumb++;
                            defInfo.rootName = temp.itemName;
                            defInfo.detlList = headScoreList.map(function () {
                                return {
                                    itemField: 'FAKE',
                                    itemGroup: 'FAKE',
                                    scoreValue: 'FAKE'
                                };
                            })
                            totalList.push(defInfo);
                         }
                    } else if (itemFlag === '9' && defInfo.scoreCol) {
                        groupScoMap[defInfo.itemGroup] = {
                            itemField: '',
                            scoreValue: ''
                        };
                        // 末端节点
                        temp = fieldMap[defInfo.itemRoot] // item(itemFlag===2||itemFlag===1)
                        //GCS-like
                        if (defInfo.lmtFlag !== '#') {
                            // 评分类itemGroup一致，增加lmtFlag和inputValue
                            groupScoMap[defInfo.itemGroup].itemRoot = '';
                            groupScoMap[defInfo.itemGroup].inputValue = '';
                            temp.lmtFlag = defInfo.lmtFlag;
                            temp.itemGroup = defInfo.itemGroup;
                        }
                        temp.detlList[defInfo.scoreCol - 1] = defInfo;
                        
                        if(defInfo.itemGroup == itemGroup){
	               			temp.showLineNumb = showLineNumb;
	               		} else {
	               			showLineNumb++;
                        	temp.rootSelfIdx = 0;
	               			temp.showLineNumb = showLineNumb;
	               			itemGroup = defInfo.itemGroup;
	               		}
                    }
                })
                groupScoMap['FAKE'] = {};
                vm.headScoreList = headScoreList;
                
                // 遍历赋值
                totalList.forEach(function(elt, i, array) {
                	if(elt.rootSelfIdx == 0){
                		var rowCount = 0;
                		totalList.forEach(function(ele, ind) {
                			if(elt.itemGroup == ele.itemGroup){
                				rowCount++;
                			}
                		})
                		elt.rootRowSpanNumb = rowCount;
                	}
                })
                
                vm.groupScoMap = groupScoMap;
                vm.totalList = totalList;
				console.log(H_SCORE_W)                
                vm.hDetlColW = H_SCORE_W / headScoreList.length;
                vm.hDetlTdW = vm.hDetlColW - tdPadding;
                checkboxWidth = $('input[type="checkbox"]').eq(0).outerWidth();
                vm.hLabelWidth = vm.hDetlTdW - checkboxWidth;
            })
        }
     /**
      * 赋值父元素签名数据
      */
     function getParentModInfo() {
         $("#gradeTimeStr").val(publicFun.timeFormat(new Date().getTime(), "yyyy/MM/dd hh:mm"));
         $("#gradeUser").val(_userid);
         eicuUtil.queryDoct($("#gradeUser"));
     }
    /**
     *打开诊断类型权重选择页面
     */
    function openDiagType() {
      var modalTitle = (vm.diagTypeInfo.diagTypeFlag === "yes" ? "手术类" : "非手术类") + "-" + "诊断类型权重";
      var modalWidth = 560,
        modalHeight = 560;
      if (vm.diagTypeInfo.diagTypeFlag !== "yes") {
        modalHeight = 600;
      }
      var modalUrl = _baseUrl + "icuscore/toDiagTypePage.do";
      createmodalwindow(modalTitle, modalWidth, modalHeight, modalUrl, "yes");
    }
    $(function () {
    	getDictInfo().done(function () {
        	getAllInfo();
       	});
      // if (_gradeSeq) {
      //getAllInfo();
      // } else {
      //   $(".labtab").hide();
      // }
    })
  </script>
</body>