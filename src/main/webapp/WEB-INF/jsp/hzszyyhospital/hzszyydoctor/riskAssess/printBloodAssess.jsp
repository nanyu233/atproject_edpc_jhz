<!DOCTYPE html>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html lang="en">

<head>
</head>

<body>
  <div style="display: none;">
    <div id="printNote" class="print-body">
      <div class="logoDivZJ">
        <img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">
      </div>
      <div id="titleDivJZ" class="titleDivJZ">
        <div class="title"><label id="id_title1">${nurseDocumentName}</label></div>
        <div class="title1"><label id="id_title2"></label></div>
      </div>
      <ul class="printUl marginGap">
        <li class="bordered">
          <span class="basic-span">
            <label class="title-label">姓名：</label>
            <span>${hspemginfCustom.cstNam}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">性别：</label>
            <span>${hspemginfCustom.cstSexCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">年龄：</label>
            <span id="_age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span>
          </span>
          <span class="basic-span">
            <label class="title-label">科别：</label>
            <span id="_emgFkCod">急诊科门诊</span>
          </span>
          <span class="basic-span">
            <label class="title-label">病历号：</label>
            <span id="_mpi">${hspemginfCustom.mpi}</span>
          </span>
          <!-- <span class="basic-span">
            <label class="title-label">留观号：</label>
            <span id="_lgh">${hspemginfCustom.observationCode}</span>
          </span> -->
        </li>
      </ul>
      <table class="tabWrapper">
        <colgroup>
          <col width="25%" />
          <col width="25%" />
          <col width="25%" />
          <col width="25%" />
        </colgroup>
        <tbody>
          <tr class="titleTr">
            <td colspan="2" class="centerTd">A每个危险因素1分</td>
            <td colspan="2" class="centerTd">C每个危险因素3分</td>
          </tr>
          <tr v-for="(item, index) in msgList.aPartListA">
            <td>
              <label v-if="item.typeA">
                <input type="checkbox" :id="'aa' + item.typeB + index" :value="item.typeB"> 
                {{item.typeA}}
              </label>
            </td>
            <td>
              <label v-if="item.typeC">
                <input type="checkbox" :id="'bb' + item.typeD + index"  :value="item.typeD"> {{item.typeC}}
              </label>
            </td>
            <td colspan="2">
              <label v-if="item.typeE">
                <input type="checkbox" :id="'cc' + item.typeF + index" :value="item.typeF"> {{item.typeE}}
              </label>
            </td>
          </tr>
          <tr class="titleTr">
            <td colspan="2" class="centerTd">B每个危险因素2分</td>
            <td colspan="2" class="centerTd">D每个危险因素5分</td>
          </tr>
          <tr v-for="(item, index) in msgList.aPartListB">
            <td>
              <label v-if="item.typeA">
                <input type="checkbox" :id="'dd' + item.typeB + index" :value="item.typeB"> {{item.typeA}}
              </label>
            </td>
            <td>
              <label v-if="item.typeC">
                <input type="checkbox" :id="'ee' + item.typeD + index" :value="item.typeD"> {{item.typeC}}
              </label>
            </td>
            <td colspan="2">
              <label v-if="item.typeE">
                <input type="checkbox" :id="'ff' + item.typeF + index" :value="item.typeF"> {{item.typeE}}
              </label>
            </td>
          </tr>
          <tr>
            <td class="centerTd">危险因素总分：</td>
            <td colspan="3" id="_totalSco">0</td>
          </tr>
          <tr class="titleTr">
            <td colspan="4" class="centerTd">预防方案(Caprini评分)</td>
          </tr>
          <tr v-for="(item, index) in msgList.scoreList" class="tipTitle">
            <td>{{item.total}}</td>
            <td>{{item.risk}}</td>
            <td>{{item.level}}</td>
            <td>{{item.sgt}}</td>
          </tr>
        </tbody>
      </table>
      <ul class="printUl">
        <li class="halfLi">
          <label>医生签名：</label>
          <span class="assessDocNam">{{msgInfo.assessDocNam}}</span>
        </li>
        <li class="halfLi">
          <label class="lab-span">日期：</label>
          <span class="assessDate" id="_assessDate"></span>
        </li>
      </ul>
    </div>
  </div>
</body>

</html>