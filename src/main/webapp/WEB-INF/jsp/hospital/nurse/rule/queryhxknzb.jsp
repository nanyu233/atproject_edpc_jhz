<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>呼吸困难</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
  <script type="text/javascript" src="${baseurl}lib/vue2.6.7/vue.js"></script>
</head>

<body class="queryhxknzb">
  <div class="queryhxknzb_container" id="queryBreath" v-cloak>
    <p class="box_title">呼吸困难评估内容</p>
    <div class="msg_div">
      <p class="subtitle_p">危急征像/高风险指标</p>
      <ul class="msg_ul">
        <li class="content_li" :class="{active: el.checked}" v-for="(el, index) in getMsg.hxknzbList" @click="_radioClick(index, el.infocode, 'hxknzbList', 'hxkn')">{{el.info}}</li>
      </ul>
      <p class="subtitle_p" v-if="getMsg.zbnhList.length > 0">指标内涵</p>
      <ul class="zbnh">
        <li v-for="(el, index) in getMsg.zbnhList" :class="{active:el.checked}" @click="checkClick(index, 'hxkn')"
          class="zbnh_li" ref="subList">{{el.info}}</li>
      </ul>
    </div>
    <div class="grp_btn">
      <a id="submitBtn" class="easyui-linkbutton addbtn" iconCls="icon-ok" @click="fillMsg()">确定</a>
      <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
    </div>
  </div>
  <script type="text/javascript" src="${baseurl}js/subpageJs/hzszyyhospital/rule/ruleMixin.vue.js"></script>
  <script type="text/javascript">
    var e_hxknCod, e_hxknSubCod;
    e_hxknCod = parent.$("#emg_hxknCod").val();
    e_hxknSubCod = parent.$("#emg_hxknSubCod").val();
    e_hxknSubCod = e_hxknSubCod.split(",");

    var vm = new Vue({
      el: "#queryBreath",
      mixins: [ruleMixin],
      data: {
        getMsg: {
          hxknzbList: [], //呼吸困难
          zbnhList: []
        },
        msgInfo: {
          hxknCod: e_hxknCod || '',
          hxknSubCod: [] //呼吸困难
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
        getParentList: function () {
          this.vueGetList('hxknzbList', e_hxknCod);
          if (e_hxknCod != '') {
            this.getSonMsg(e_hxknCod);
          }
        },
        getSonMsg: function (infocode, checkSuper) {
          $.ajax({
            data: { "dstdictinfoCustom.typecode": "HXKNZB_SUB", "dstdictinfoCustom.remark": infocode },
            async: false,
            url: "querydictSub.do",
            type: "get",
            success: function (res) {
              var _res = res;
              $.each(_res, function (idx, value) {
                value['checked'] = false;
              });
              vm.getMsg.zbnhList = _res;
              var getMsgList = vm.getMsg['zbnhList'];
              $.each(getMsgList, function (index, value) {
                for (var i = 0; i < e_hxknSubCod.length; i++) {
                  if (value['infocode'] == e_hxknSubCod[i]) {
                    value['checked'] = true;
                    vm.msgInfo.hxknSubCod.push(value['infocode'])
                  }
                }
              });
              if (checkSuper) {
                vm.getMsg.zbnhList.forEach(function (item) {
                  item['checked'] = false
                })
                vm.msgInfo.hxknSubCod = [];
              }
            }
          });
        },
        fillMsg: function () {
          if (vm.msgInfo.hxknCod) {
            parent.$('#hxknFlg').val('1')
          } else {
            parent.$('#hxknFlg').val('0') 
          }
          parent.$("#emg_hxknCod").val(vm.msgInfo.hxknCod);
          parent.$("#emg_hxknSubCod").val(vm.msgInfo.hxknSubCod);
          parent.closemodalwindow();
        }
      }
    });
  </script>
</body>


</html>