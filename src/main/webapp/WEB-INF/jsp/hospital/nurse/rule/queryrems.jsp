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

<body class="querymews queryrews">
  <div class="mews_container mews" id="queryMews" v-cloak>
    <div class="mark_msg clr">
      <p class="box_title">REMS评分</p>
      <div class="mark_msg_detail">
        <ul>
          <li>
            <span>脉搏：</span>
            <span v-if="patientMsg.hrtRte" class="item_color">{{patientMsg.hrtRte}}次/分 </span>
          </li>
          <li>
            <span class="bre_span">收缩压：</span>
            <span v-if="patientMsg.sbpUpNbr" class="item_color">{{patientMsg.sbpUpNbr}}mmHg
            </span>
          </li>
          <li>
            <span>呼吸频率：</span>
            <span v-if="patientMsg.breNbr" class="item_color">{{patientMsg.breNbr}}次/分 </span>
          </li>
          <li>
            <span>GCS：</span>
            <span v-if="patientMsg.gcsTotSco" class="item_color">{{patientMsg.gcsTotSco}}分 </span>
          </li>
          <li>
            <span class="bre_span">年龄：</span>
            <span v-if="patientMsg.cstAge" class="item_color">{{patientMsg.cstAge}}岁 </span>
          </li>
          <li>
            <span class="bre_span">SpO2：</span>
            <span v-if="patientMsg.oxyNbr" class="item_color">{{patientMsg.oxyNbr}} </span>
          </li>
        </ul>
      </div>
    </div>
    <table class="mark_rule mews">
      <tr class="mark_score">
        <th>分值</th>
        <td>0</td>
        <td>1</td>
        <td>2</td>
        <td>3</td>
        <td>4</td>
        <td>5</td>
        <td>6</td>
      </tr>
      <tr>
        <th rowspan="2">脉搏</th>
        <td :class="{active:isInRange(patientMsg.hrtRte,70,109)}">70-109</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.hrtRte,55,69)}">55-69</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,40,54)}">40-54</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,'',39.9)}">&lt;40</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.hrtRte,110,139)}">110-139</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,140,179)}">140-179</td>
        <td :class="{active:isInRange(patientMsg.hrtRte,179.1,'')}">&gt;179</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th rowspan="2">收缩压(mmHg)</th>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,90,129)}">90-129</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,70,89)}">70-89</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td></td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,130,149)}">130-149</td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,150,179)}">150-179</td>
        <td :class="{active:isInRange(patientMsg.sbpUpNbr,179.1,'')}">&gt;179</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th rowspan="2">呼吸频率</th>
        <td :class="{active:isInRange(patientMsg.breNbr,12,24)}">12-24</td>
        <td :class="{active:isInRange(patientMsg.breNbr,10,11)}">10-11</td>
        <td :class="{active:isInRange(patientMsg.breNbr,6,9)}">6-9</td>
        <td></td>
        <td></td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <td></td>
        <td :class="{active:isInRange(patientMsg.breNbr,25,34)}">25-34</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.breNbr,35,49)}">35-49</td>
        <td :class="{active:isInRange(patientMsg.breNbr,49.1,'')}">&gt;49</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>GCS</th>
        <td :class="{active:isInRange(patientMsg.gcsTotSco,13.1,'')}">&gt;13</td>
        <td :class="{active:isInRange(patientMsg.gcsTotSco,11,13)}">11-13</td>
        <td :class="{active:isInRange(patientMsg.gcsTotSco,8,10)}">8-10</td>
        <td :class="{active:isInRange(patientMsg.gcsTotSco,5,7)}">5-7</td>
        <td :class="{active:isInRange(patientMsg.gcsTotSco,'',4.9)}">&lt;5</td>
        <td></td>
        <td></td>
      </tr>
      <tr>
        <th>年龄</th>
        <td :class="{active:isInRange(patientMsg.cstAge,'',44.9)}">&lt;45</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.cstAge,45,54)}">45-54</td>
        <td :class="{active:isInRange(patientMsg.cstAge,55,64)}">55-64</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.cstAge,65,74)}">65-74</td>
        <td :class="{active:isInRange(patientMsg.cstAge,74.1,'')}">&gt;74</td>
      </tr>
      <tr>
        <th>SpO2</th>
        <td :class="{active:isInRange(patientMsg.oxyNbr,89.1,'')}">&gt;89</td>
        <td :class="{active:isInRange(patientMsg.oxyNbr,86,89)}">86-89</td>
        <td></td>
        <td :class="{active:isInRange(patientMsg.oxyNbr,74,85)}">74-85</td>
        <td :class="{active:isInRange(patientMsg.oxyNbr,'',74.9)}">&lt;75</td>
        <td></td>
        <td></td>
      </tr>
    </table>
    <div style="color:#2a00ff">说明：评分≤11分：病死危险率10%；评分16-17分：病死危险率50%；
      评分≥24分：病死危险率100%</div>
    <div class="score_div" style="float:left"><span>分值：</span><i>{{patientMsg.remsTotSco}}</i>
    </div>
    <div class="score_div" style="float:left">
      <span>病死危险率：</span><i>{{patientMsg.remsDeath}}</i>
    </div>
    <div class="grp_btn">
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">

  var vm = new Vue({
    el: "#queryMews",
    data: {
      patientMsg: {
        remsTotSco: parent.$("#emg_remsTotSco").val() || '无', //mews评分
        remsDeath:parent.$("#emg_remsDeath").val() || '无',
        breNbr: parent.$("#emg_breNbr").val() || '', // 呼吸
        gcsTotSco: parent.$("#emg_gcsTotSco").val() || '', // GCS评分
        sbpUpNbr: parent.$("#emg_sbpUpNbr").val() || '', // 血压上压
        cstAge: parent.$("#emg_cstAge").val() || '', // 年龄
        hrtRte: parent.$("#emg_hrtRte").val() || '', // 心率
        oxyNbr:parent.$("#emg_oxyNbr").val() || ''//血氧
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