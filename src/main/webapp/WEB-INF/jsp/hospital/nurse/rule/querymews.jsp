<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>MEWS评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="querymews">
  <div class="mews_container mews" id="queryMews" v-cloak>
    <div class="mark_msg clr">
      <p class="box_title">MEWS评分</p>
      <div class="mark_msg_detail">
        <ul>
          <li>
            <span>体温：</span>
            <span v-if="patientMsg.tmpNbr" class="item_color">{{patientMsg.tmpNbr}}℃ </span>
          </li>
          <li>
            <span class="bre_span">呼吸：</span>
            <span v-if="patientMsg.breNbr" class="item_color">{{patientMsg.breNbr}}次/分 </span>
          </li>
          <li>
            <span>血压：</span>
            <span v-if="patientMsg.sbpUpNbr||patientMsg.sbpDownNbr" class="item_color">{{patientMsg.sbpUpNbr}}/{{patientMsg.sbpDownNbr}}
            </span>
          </li>
          <li>
            <span>心率：</span>
            <span v-if="patientMsg.hrtRte" class="item_color">{{patientMsg.hrtRte}}次/分 </span>
          </li>
          <li class="lastli">
            <span>清醒程度：</span>
            <span v-if="patientMsg.senRctCodStr" class="item_color">{{patientMsg.senRctCodStr}} </span>
          </li>
        </ul>
      </div>
    </div>
    <table class="mark_rule mews">
      <tr class="mark_score">
        <th>分值</th>
        <td>3</td>
        <td>2</td>
        <td>1</td>
        <td>0</td>
        <td>1</td>
        <td>2</td>
        <td>3</td>
      </tr>
      <tr>
        <th>呼吸</th>
        <td :class="{active:isInRange(patientMsg.breNbr,30,'')}">≥30</td>
        <td :class="{active:isInRange(patientMsg.breNbr,21,29)}">21-29</td>
        <td :class="{active:isInRange(patientMsg.breNbr,15,20)}">15-20</td>
        <td :class="{active:isInRange(patientMsg.breNbr,9,14)}">9-14</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.breNbr,'',8.9)}">&lt;9</td>
        <td></td>
      </tr>
      <tr>
        <th>体温</th>
        <td></td>
        <td :class="{active:isInRange(patientMsg.tmpNbr,38.5,'')}">≥38.5</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.tmpNbr,35,38.4)}">35-38.4</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.tmpNbr,'',34.99)}">&lt;35</td>
        <td></td>
      </tr>
      <tr>
        <th>收缩压</th>
        <td></td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,200,'')}">≥200</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,101,199)}">101-199</td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,81,100)}">81-100</td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,71,80)}">71-80</td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,'',70)}">≤70</td>
      </tr>
      <tr>
        <th>心率</th>
        <td :class="{active:isInRange(patientMsg.hrtRte,130,'')}">≥130</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,111,129)}">111-129</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,101,110)}">101-110</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,51,100)}">51-100</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,41,50)}">41-50</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,'',40)}">≤40</td>
        <td></td>
      </tr>
      <tr>
        <th>清醒程度</th>
        <td></td>
        <td></td>
        <td></td>
        <td :class="{active:patientMsg.senRctCod=='0'}">清楚(A)</td>
        <td :class="{active:patientMsg.senRctCod=='1'}">对声音有反应(V)</td>
        <td :class="{active:patientMsg.senRctCod=='2'}">对疼痛有反应(P)</td>
        <td :class="{active:patientMsg.senRctCod=='3'}">无反应(U)</td>
      </tr>
    </table>
    <div style="color:#2a00ff">说明：评分&lt;5分：大多数不需住院治疗；评分5-9分：病情变化危险增大，有“潜在危重病”危险，需住专科病房甚至ICU；
      评分&gt;9分：死亡危险明显增加，需住ICU接受治疗</div>
    <div class="score_div" style="float:left"><span>分值：</span><i>{{patientMsg.mewsTotSco}}</i></div>
    <div class="grp_btn">
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  var e_senRctCod, e_senRctCodStr;
  e_senRctCod = parent.vm.aboutMews.senRctCod;
  e_senRctCodStr = '';
  var _list = parent.vm.getMsg.senRctCodList;
  _list.map(function (item) {
    if (item.infocode === e_senRctCod) {
      e_senRctCodStr = item.info
    }
  })
  var vm = new Vue({
    el: "#queryMews",
    data: {
      patientMsg: {
        mewsTotSco: parent.$("#emg_mewsTotSco").val() || '无', //mews评分
        breNbr: parent.$("#emg_breNbr").val() || '', // 呼吸
        tmpNbr: parent.$("#emg_tmpNbr").val() || '', // 体温
        sbpUpNbr: parent.$("#emg_sbpUpNbr").val() || '', // 血压上压
        sbpDownNbr: parent.$("#emg_sbpDownNbr").val() || '', // 血压下压
        hrtRte: parent.$("#emg_hrtRte").val() || '', // 心率
        senRctCod: e_senRctCod || '', // 清醒程度
        senRctCodStr: e_senRctCodStr || '', // 清醒程度
      }
    },
    methods: {
      isInRange: function (val, min, max) {
        if (isNaN(parseInt(val))) {
          return false
        }
        if (min && !max) {
          return val >= min
        }
        if (!min && max) {
          return val <= max
        }
        if (min && max) {
          return (val >= min) && (val <= max)
        }
      }
    }
  });
</script>

</html>