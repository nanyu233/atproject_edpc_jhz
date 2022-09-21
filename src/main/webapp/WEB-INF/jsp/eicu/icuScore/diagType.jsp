<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>APACHE-Ⅱ评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <%@ include file="/WEB-INF/jsp/eicu/eicuCommonJs.jsp"%>
  <style>
    table {
      margin: 10px auto;
    }

    table th,
    table td {
      border: 1px solid black;
      text-align: center;
    }

    table tbody td div {
      border-bottom: 1px solid #ccc;
      cursor: pointer;
    }

    table tbody td div:last-child {
      border-bottom: none;
    }

    table tbody td div:hover {
      background-color: rgb(234, 242, 255);
    }

    table tbody td div.active {
      background-color: #fdff65
    }

    .sympInfo {
      padding-left: 20px;
      display: inline-block;
      width: 300px;
      text-align: left;
      box-sizing: border-box;
      border-right: 1px solid #ccc;
    }

    th .sympInfo {
      text-align: center;
    }

    .sympNumb {
      display: inline-block;
      width: 80px;
    }
  </style>
</head>

<body class="scoreQuery" ms-controller="diagType">
  <div id="diagType">
    <table>
      <colgroup>
        <col width="100px">
        <col width="390px">
      </colgroup>
      <thead>
        <tr>
          <th>分组</th>
          <th>
            <span class="sympInfo">疾病</span>
            <span class="sympNumb">权重</span>
          </th>
        </tr>
      </thead>
      <tbody ms-repeat="isOperated === '0' ? nonOpData : opData">
        <tr>
          <td>{{el.groupType|html}}</td>
          <td>
            <div ms-repeat-elem="el.sympList" ms-class="{{elem.code === diagTypeSymbol ? 'active' : ''}}"
              ms-click="diagTypeClick($event, elem.code, elem.numb)">
              <span class="sympInfo">{{elem.info}}</span>
              <span class="sympNumb">{{elem.numb}}</span>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </div>
  <script type="text/javascript">
    //全局变量
    var _liveNo = eicuUtil.ptBasicInfo.liveNo;
  </script>
  <script type="text/javascript">
    var vm = avalon.define({
      $id: "diagType",
      diagTypeClick: function (event, code, numb) {
        parent.vm.diagTypeInfo.diagTypeSymbol = code;
        parent.vm.diagTypeInfo.diagTypeNumb = numb;
        // console.log("向父元素传递code：", code);
        // console.log(parent.vm.diagTypeInfo.diagTypeSymbol);
        parent.closemodalwindow();
      },
      isOperated: parent.vm.diagTypeInfo.diagTypeFlag === 'yes' ? "1" : "0",
      diagTypeSymbol: parent.vm.diagTypeInfo.diagTypeSymbol,
      nonOpData: [{
          groupType: "呼吸功能<br>不全或衰竭",
          sympList: [{
              info: "哮喘或变态反应",
              numb: -2.108,
              code: "0"
            },
            {
              info: "COPD",
              numb: -0.367,
              code: "1"
            },
            {
              info: "非心源性水肿",
              numb: -0.251,
              code: "2"
            },
            {
              info: "呼吸停止后",
              numb: -0.168,
              code: "3"
            },
            {
              info: "误吸",
              numb: -0.142,
              code: "4"
            },
            {
              info: "中毒",
              numb: -0.142,
              code: "5"
            },
            {
              info: "肺栓塞",
              numb: -0.128,
              code: "6"
            },
            {
              info: "感染",
              numb: 0,
              code: "7"
            },
            {
              info: "肿瘤",
              numb: 0.891,
              code: "8"
            },
          ]
        },
        {
          groupType: "心血管功能<br>不全或衰竭",
          sympList: [{
              info: "高血压",
              numb: -1.798,
              code: "9"
            },
            {
              info: "心律失常",
              numb: -1.368,
              code: "10"
            },
            {
              info: "充血性心衰",
              numb: -0.424,
              code: "11"
            },
            {
              info: "失血性或低血容量性休克",
              numb: 0.493,
              code: "12"
            },
            {
              info: "冠心病",
              numb: -0.191,
              code: "13"
            },
            {
              info: "脓毒症(Sepsis)",
              numb: 0.113,
              code: "14"
            },
            {
              info: "心脏骤停后",
              numb: 0.393,
              code: "15"
            },
            {
              info: "心源性休克",
              numb: -0.259,
              code: "16"
            },
            {
              info: "主动脉夹层动脉瘤",
              numb: 0.731,
              code: "17"
            }
          ]
        },
        {
          groupType: "创伤",
          sympList: [{
              info: "多发伤",
              numb: -1.228,
              code: "18"
            },
            {
              info: "脑外伤",
              numb: -0.517,
              code: "19"
            }
          ]
        },
        {
          groupType: "神经系统疾病",
          sympList: [{
              info: "癫痫发作(seizure disorder)",
              numb: -0.584,
              code: "20"
            },
            {
              info: "脑出血/硬膜下/蛛网膜出血(ICH/SDH/SAH)",
              numb: 0.723,
              code: "21"
            }
          ]
        },
        {
          groupType: "其他",
          sympList: [{
              info: "药物过量",
              numb: -3.353,
              code: "22"
            },
            {
              info: "糖尿病酮症",
              numb: -1.507,
              code: "23"
            },
            {
              info: "消化道出血",
              numb: 0.334,
              code: "24"
            }
          ]
        },
        {
          groupType: "重要脏器受损",
          sympList: [{
              info: "代谢性或肾性",
              numb: -0.885,
              code: "25"
            },
            {
              info: "呼吸系统",
              numb: -0.890,
              code: "26"
            },
            {
              info: "神经系统",
              numb: -0.759,
              code: "27"
            },
            {
              info: "心血管系统",
              numb: 0.470,
              code: "28"
            },
            {
              info: "胃肠道",
              numb: 0.501,
              code: "29"
            }
          ]
        }
      ],
      opData: [{
          groupType: "手术",
          sympList: [{
              info: "多发伤",
              numb: -1.684,
              code: "0"
            },
            {
              info: "慢性心血管疾病",
              numb: -1.376,
              code: "1"
            },
            {
              info: "外周血管疾病",
              numb: -1.315,
              code: "2"
            },
            {
              info: "心瓣膜手术",
              numb: -1.261,
              code: "3"
            },
            {
              info: "肿瘤开颅手术",
              numb: -1.245,
              code: "4"
            },
            {
              info: "胃肿瘤手术",
              numb: -1.204,
              code: "5"
            },
            {
              info: "胃移植",
              numb: -1.042,
              code: "6"
            },
            {
              info: "脑外伤",
              numb: -0.955,
              code: "7"
            },
            {
              info: "胸部肿瘤手术",
              numb: -0.802,
              code: "8"
            },
            {
              info: "脑出血/硬膜下/蛛网膜下出血开颅手术(ICH/SDH/SAH)",
              numb: -0.788,
              code: "9"
            },
            {
              info: "椎板切除术或其他脊髓手术",
              numb: -0.699,
              code: "10"
            },
            {
              info: "失血性休克",
              numb: -0.682,
              code: "11"
            },
            {
              info: "消化道出血",
              numb: -0.617,
              code: "12"
            },
            {
              info: "消化道肿瘤手术",
              numb: -0.248,
              code: "13"
            },
            {
              info: "术后呼吸功能不全",
              numb: -0.140,
              code: "14"
            },
            {
              info: "消化道穿孔或梗阻",
              numb: 0.060,
              code: "15"
            },
          ]
        },
        {
          groupType: "术后并发症",
          sympList: [{
              info: "脓毒症(sepsis)",
              numb: 0.113,
              code: "16"
            },
            {
              info: "心脏骤停后",
              numb: 0.393,
              code: "17"
            },
            {
              info: "呼吸骤停后",
              numb: -0.168,
              code: "18"
            },
          ]
        },
        {
          groupType: "NOS",
          sympList: [{
              info: "神经系统",
              numb: -1.150,
              code: "19"
            },
            {
              info: "心血管系统",
              numb: -0.797,
              code: "20"
            },
            {
              info: "呼吸系统",
              numb: -0.610,
              code: "21"
            },
            {
              info: "胃肠道",
              numb: -0.613,
              code: "22"
            },
            {
              info: "代谢性或肾性",
              numb: -0.196,
              code: "23"
            }
          ]
        }
      ]
    });



    $(function () {
      var loopFlag = true;
      // var diagTypeSymbol = parent.vm.diagTypeInfo.diagTypeSymbol;
      // if (diagTypeSymbol) {
      //   //如果父元素已有选择的类型
      //   if (vm.isOperated === "0") {
      //     //如果是非手术类型
      //     $.each(vm.nonOpData, function () {
      //       var thisInfo = this;
      //       $.each(thisInfo.sympList, function () {
      //         var thisSympInfo = this;
      //         if (thisSympInfo.code === diagTypeSymbol) {
      //           this.checked = true;
      //           loopFlag = false;
      //           return loopFlag;
      //         }
      //       })
      //       return loopFlag;
      //     })
      //   } else {
      //     $.each(vm.opData, function () {
      //       var thisInfo = this;
      //       $.each(thisInfo.sympList, function () {
      //         var thisSympInfo = this;
      //         if (thisSympInfo.code === diagTypeSymbol) {
      //           this.checked = true;
      //           loopFlag = false;
      //           return loopFlag;
      //         }
      //       })
      //       return loopFlag;
      //     })
      //   }
      // }
    })
  </script>
</body>