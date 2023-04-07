<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>胸痛</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="queryxtzbpg">
  <div class="queryxtzbpg_container" id="queryPain" v-cloak>
    <p class="box_title">胸痛评估内容</p>
    <div class="msg_div">
      <p class="subtitle_p">危急征像/高风险指标</p>
      <ul class="msg_ul">
        <li class="content_li" v-for="(el, index) in getMsg.xtxmzbList" :class="{active:el.checked}" @click="onlyRadioCheck(index, 'xtxmzbList', 'xt')">{{el.info}}</li>
      </ul>
      <p class="subtitle_p">初步评估内容</p>
      <ul class="zbnh">
        <li v-for="(el, index) in getMsg.zbnhList" :class="{active:el.checked}" @click="checkClick(index, 'xt')" class="zbnh_li">{{el.info}}</li>
      </ul>
    </div>
    <div class="grp_btn">
      <a id="submitBtn" class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillMsg()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/rule/ruleMixin.vue.js"></script>
<script type="text/javascript">
  var e_xtCod, e_xtSubCod;
  e_xtCod = publicFun.getDict("XT_BQPG_COD");
  e_xtSubCod = publicFun.getDict("XT_BQPGMX_COD");

  console.log(e_xtCod);
  console.log(e_xtSubCod);
  // e_xtSubCod = parent.$("#emg_xtSubCod").val();
  // e_xtSubCod = e_xtSubCod.split(",");

  var vm = new Vue({
    el: "#queryPain",
    mixins: [ruleMixin],
    data: {
      getMsg: {
        xtxmzbList: e_xtCod||[], //胸痛
        zbnhList: e_xtSubCod||[]
      },
      msgInfo: {
        xtCod: e_xtCod || '',
        xtSubCod: e_xtSubCod || []
      },
    },
    mounted: function () {
      this.$nextTick(function () {
        if (parent.setIframeDivHeight) {
          $('#submitBtn').hide()
        } else {
          $('#submitBtn').show()
        }
      })
    },
    methods: {
      getParentList: function () {
        // this.vueGetList('xtxmzbList', e_xtCod);
        this.getSecondMsg()
      },
      getSecondMsg: function () {
        var _list = publicFun.getDict('XT_BQPG_COD');
        _list.forEach(function (item, idx) {
          item.checked = false
          for (var i = 0; i < e_xtSubCod.length; i++) {
            if (item.infocode == e_xtSubCod[i]) {
              item.checked = true;
            }
          }
        })
        // vm.getMsg.zbnhList = JSON.parse(JSON.stringify(_list));
      },
      onlyRadioCheck: function (idx, listName, obj) {
        var list = vm.getMsg[listName];
        var currentChecked = list[idx]['checked'];
        list.forEach(function (element) {
          element['checked'] = false
        })
        list[idx]['checked'] = !currentChecked;
        if (list[idx]['checked'] == true) {
          vm.getSecondMsg();
          vm.msgInfo[obj + 'Cod'] = vm.getMsg[listName][idx]['infocode'];
        } else {
          vm.msgInfo[obj + 'Cod'] = '';
        }
      },
      fillMsg: function () {
        if (vm.msgInfo.xtCod || vm.msgInfo.xtSubCod) {
          parent.$('#xtFlg').val('1');
        } else {
          // parent.$('#xtFlg').val('0');
        }
        parent.$("#emg_xtCod").val(vm.msgInfo.xtCod);
        parent.$("#emg_xtSubCod").val(vm.msgInfo.xtSubCod);
        parent.closemodalwindow();
      }
    }
  });
</script>

</html>