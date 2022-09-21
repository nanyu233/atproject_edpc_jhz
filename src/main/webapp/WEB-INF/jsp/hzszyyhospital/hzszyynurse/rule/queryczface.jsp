<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>卒中</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/popbox.css?5">
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="queryczface">
  <div class="czface_container" id="queryCzFace" v-cloak>
    <div class="act_div first_act">
      <p class="act_p">面瘫/口角歪斜</p>
      <div class="msg_div">
        <label v-for="(el, index) in getMsg.mtCodList" :for="'aboutczFaceA' + el.infocode" class="act_label">
          <span class="content_span">{{el.info}}</span>
          <input :id="'aboutczFaceA' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.mtCod"
            @change="radioClick('mtCod', index)" />
        </label>
      </div>
    </div>
    </span>
    <div class="act_div">
      <p class="act_p">肢体无力</p>
      <div class="msg_div">
        <label v-for="(el, index) in getMsg.szthCodList" :for="'aboutczFaceB' + el.infocode" class="act_label">
          <span class="content_span">{{el.info}}</span>
          <input :id="'aboutczFaceB' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.szthCod"
            @change="radioClick('szthCod', index)" />
        </label>
      </div>
    </div>
    <div class="act_div">
      <p class="act_p">言语不清</p>
      <div class="msg_div">
        <label v-for="(el, index) in getMsg.wlCodList" :for="'aboutczFaceC' + el.infocode" class="act_label">
          <span class="content_span">{{el.info}}</span>
          <input :id="'aboutczFaceC' + el.infocode" type="checkbox" :value="el.infocode" v-model="hideMsg.wlCod"
            @change="radioClick('wlCod', index)" />
        </label>
      </div>
    </div>
    <div class="grp_btn">
      <a id="submitBtn" class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillMsg()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
</body>
<script type="text/javascript">
  var parentMsg = {
    e_mtCod: parent.$("#emg_mtCod").val(),
    e_szthCod: parent.$("#emg_szthCod").val(),
    e_wlCod: parent.$("#emg_wlCod").val()
  };
  var msgList = ['mtCod', 'szthCod', 'wlCod'];
  msgList.map(function (ele) {
    if (parentMsg['e_' + ele]) {
      parentMsg['e_' + ele] = parentMsg['e_' + ele].split(',');
    } else {
      parentMsg['e_' + ele] = [];
    }
  })
  var _commonList = [{ checked: false, infocode: '0', info: '无' }, { checked: false, infocode: '1', info: '有' }];
  var vm = new Vue({
    el: "#queryCzFace",
    data: function () {
      return {
        getMsg: {
          mtCodList: JSON.parse(JSON.stringify(_commonList)), //面瘫
          szthCodList: JSON.parse(JSON.stringify(_commonList)), //上肢瘫痪
          wlCodList: JSON.parse(JSON.stringify(_commonList)) //握力
        },
        aboutczFace: {
          mtCod: parent.$("#emg_mtCod").val() || null, //面瘫
          szthCod: parent.$("#emg_szthCod").val() || null, //上肢瘫痪
          wlCod: parent.$("#emg_wlCod").val() || null //握力
        },
        hideMsg: {
          mtCod: parentMsg.e_mtCod || [], //面瘫
          szthCod: parentMsg.e_szthCod || [], //上肢瘫痪
          wlCod: parentMsg.e_wlCod || [] //握力
        }
      }
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
      radioClick: function (name, idx) {
        var code = vm.getMsg[name + 'List'][idx]['infocode'];
        if (vm.hideMsg[name].length > 0) {
          vm.hideMsg[name] = [code];
        } else {
          vm.hideMsg[name] = [];
        }
        vm.aboutczFace[name] = vm.hideMsg[name].join(',');
      },
      fillMsg: function () {
        if (vm.aboutczFace.mtCod || vm.aboutczFace.szthCod || vm.aboutczFace.wlCod) {
          parent.$('#czFlag').val('1')
        } else {
          // parent.$('#czFlag').val('0')
        }
        parent.$("#emg_mtCod").val(vm.aboutczFace.mtCod);
        parent.$("#emg_szthCod").val(vm.aboutczFace.szthCod);
        parent.$("#emg_wlCod").val(vm.aboutczFace.wlCod);
        parent.closemodalwindow();
      }
    }
  });
</script>

</html>