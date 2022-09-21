<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>创伤评估内容</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="querycspg">
  <div class="querycspg_container" id="queryCspg" v-cloak>
    <p class="box_title">创伤评估内容</p>
    <ul class="cspg_ul">
      <li>
        <label v-for="(el, index) in getMsg.cspgList" :for="el.infocode" class="act_label">
          <input :id="el.infocode" type="checkbox" :checked="el.checked" @click="radioClick('cspgList',index, el.infocode)" />
          <span class="content_span">{{el.info}}</span>
          <ul v-if="el.detail">
            <li v-for="item in el.detail" class="item_li">
              <i>●</i> {{item}}
            </li>
          </ul>
        </label>
      </li>
    </ul>
    <div class="grp_btn">
      <a id="submitBtn" class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillCspg()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  var e_cspgCod = parent.$("#emg_cspgCod").val();
  var vm = new Vue({
    el: "#queryCspg",
    data: {
      getMsg: {
        cspgList: [{
          infocode: "0",
          info: "高空坠落(>3m)",
          checked: false
        }, {
          infocode: "1",
          info: "车祸伤",
          checked: false,
          detail: ["乘客甩出车外", "同乘人员严重受伤或死亡", "有昏迷史"]
        }, {
          infocode: "2",
          info: "刀刺伤",
          checked: false,
          detail: ["头颈部/胸痛/眼部/腹股沟等大血管区域"]
        }, {
          infocode: "3",
          info: "多发伤",
          checked: false
        }, {
          infocode: "4",
          info: "躯干穿透伤",
          checked: false
        }]
      },
      aboutCspg: {
        cspg: e_cspgCod || '' //创伤评估
      }
    },
    mounted: function () {
      this.$nextTick(function () {
        this.handleGetMsg();
        if (parent.setIframeDivHeight) {
          $('#submitBtn').hide()
        } else {
          $('#submitBtn').show()
        }
      })
    },
    methods: {
      radioClick: function (name, idx, infocode) {
        var list = [];
        list = vm.getMsg[name];
        var currentChecked = list[idx]['checked'];
        $.each(list, function (index, value) {
          value['checked'] = false;
        });
        list[idx]['checked'] = !currentChecked;
        if (list[idx]['checked'] == true) {
          vm.aboutCspg.cspg = infocode;
        } else {
          vm.aboutCspg.cspg = '';
        }
      },
      handleGetMsg: function () {
        var getMsgList = vm.getMsg.cspgList;
        $.each(getMsgList, function (index, value) {
          if (value['infocode'] == e_cspgCod) {
            value['checked'] = true;
          }
        });
      },
      fillCspg: function () {
        if (vm.aboutCspg.cspg) {
          parent.$('#cspgFlg').val('1');
        } else {
          // parent.$('#cspgFlg').val('0');
        }
        parent.$("#emg_cspgCod").val(vm.aboutCspg.cspg);
        parent.closemodalwindow();
      }
    }
  });
</script>

</html>