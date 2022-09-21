<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>GCS评分</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/popbox.css?5">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/scoreQuery.css?aaa=5555">
  <script>
    var _baseUrl = "${baseurl}",
        _typeSource = '${typeSource}';
    var _emgSeq = parent._emgSeq;
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
</head>

<body class="scoreQuery querygcs" ms-controller="gcsGde">
  <p class="headtitle">GCS评分</p>
  <form id="gcsForm" action="${baseurl}hlpgb/submitGcsSco.do" method="post">
    <input class="hidden" type="text" ms-duplex-string="aboutGCS.emgSeq" name="hspGcsInfCustom.emgSeq">
    <input class="hidden" type="text" ms-duplex-string="aboutGCS.gcsSeq" name="hspGcsInfCustom.gcsSeq">
    <div class="gcs_container">
      <p class="inspect_p">检测项目</p>
      <span class="inspect_span">评分</span>
      <div class="act_div">
        <p class="act_p">睁眼反应</p>
        <div class="msg_div">
          <label class="act_label" ms-repeat="getMsgList.eyeRctCodList" ms-attr-for="aboutGCSA{{el.infocode}}" ms-class="act_labelAct: $index %2 == 0">
            <span class="score_span">{{el.infocode}}</span>
            <span class="content_span">{{el.info}}</span>
            <input ms-attr-id="aboutGCSA{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClick('eyeRctCod',$index)" />
          </label>
          <input type="text" class="hidden" name="hspGcsInfCustom.eyeRctCod" ms-duplex-string="aboutGCS.eyeRctCod">
        </div>
      </div>
      </span>
      <div class="act_div act_div2">
        <p class="act_p">语言反应</p>
        <div class="msg_div">
          <label class="act_label" ms-repeat="getMsgList.lanRctCodList" ms-attr-for="aboutGCSB{{el.infocode}}" ms-class="act_labelAct: $index %2 == 0">
            <span class="score_span">{{el.infocode}}</span>
            <span class="content_span">{{el.info}}</span>
            <input ms-attr-id="aboutGCSB{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClick('lanRctCod',$index)" />
          </label>
          <input type="text" class="hidden" name="hspGcsInfCustom.lanRctCod" ms-duplex-string="aboutGCS.lanRctCod">
        </div>
      </div>
      <div class="act_div act_div3">
        <p class="act_p">肢体运动</p>
        <div class="msg_div">
          <label class="act_label" ms-repeat="getMsgList.actRctCodList" ms-attr-for="aboutGCSC{{el.infocode}}" ms-class="act_labelAct: $index %2 == 1">
            <span class="score_span">{{el.infocode}}</span>
            <span class="content_span">{{el.info}}</span>
            <input ms-attr-id="aboutGCSC{{el.infocode}}" type="checkbox" ms-attr-checked="el.checked" ms-click="radioClick('actRctCod',$index)" />
          </label>
          <input type="text" class="hidden" name="hspGcsInfCustom.actRctCod" ms-duplex-string="aboutGCS.actRctCod">
        </div>
      </div>
      <div class="scoreDiv">
        <span class="boldFont">总分：<i>{{totalGCS.totSco}}</i></span>
        <input type="text" class="hidden" name="hspGcsInfCustom.totSco" ms-duplex-string="totalGCS.totSco">
      </div>
      <div class="grp_btn">
          <a class="easyui-linkbutton addbtn" iconCls="icon-ok" onclick="fillGcs()">确定</a>
          <a class="easyui-linkbutton closebtn" iconCls="icon-cancel" onclick="parent.closemodalwindow()">关闭</a>
      </div>
    </div>
  </form>
  <script type="text/javascript">
    var vm = avalon.define({
      $id: "gcsGde",
      getMsgList: {
        eyeRctCodList: [], //眨眼反应
        lanRctCodList: [], //语言反应
        actRctCodList: [] //肢体运动
      },
      totalGCS: {
        totSco: '' //GCS评分
      },
      aboutGCS: {
        eyeRctCod: '', //眨眼反应
        lanRctCod: '', //语言反应
        actRctCod: '', //肢体运动

        gcsSeq:_emgSeq,
        emgSeq:''
      },
      radioClick: function (name, idx) {
        vm.aboutGCS[name] = publicFun.radioClicks(vm.getMsgList[name + 'List'], vm.aboutGCS[name], idx)
      }
    });

    //监听GCS计算
    vm.aboutGCS.$watch("$all", function () {
      var eyeRctCod, lanRctCod, actRctCod;
      eyeRctCod = parseInt(vm.aboutGCS.eyeRctCod);
      lanRctCod = parseInt(vm.aboutGCS.lanRctCod);
      actRctCod = parseInt(vm.aboutGCS.actRctCod);
      if (eyeRctCod >= 0 && lanRctCod >= 0 && actRctCod >= 0) {
        vm.totalGCS.totSco = eyeRctCod + lanRctCod + actRctCod;
      } else {
        vm.totalGCS.totSco = ' ';
      }
    });

    function fillGcs(){
      if(parent.sub && parent.sub.name == 'csList') {
        var _gcsVal = publicFun.strTrim(vm.totalGCS.totSco);
        if (_gcsVal == '' || _gcsVal == null) {
          publicFun.alert("请输入GCS评分");
          return false
        }
        console.log(parent._emgSeq)
        $.ajax({
          type: "post",
          url: '${baseurl}scorequery/addGcsScore.do?',
          data: {
            'hspGcsInfCustom.emgSeq':_emgSeq,
            'hspGcsInfCustom.eyeRctCod': vm.aboutGCS.eyeRctCod,
            'hspGcsInfCustom.lanRctCod': vm.aboutGCS.lanRctCod,
            'hspGcsInfCustom.actRctCod': vm.aboutGCS.actRctCod,
            'hspGcsInfCustom.totSco': vm.totalGCS.totSco,
            'hspGcsInfCustom.gcsSeq': _emgSeq,
            date: new Date().toTimeString()
          },
          success: function(data) {
            console.log(data)
            parent.sub.getGcsSco()
            parent.closemodalwindow()
          }
        })
      }
      else {
        var _gcsVal = publicFun.strTrim(vm.totalGCS.totSco);
        if (_gcsVal == '' || _gcsVal == null) {
          publicFun.alert("请输入GCS评分");
          return false
        }
        if(_typeSource == 'jzcs'){
          $('#gcsForm').attr('action', '${baseurl}hlpgb/submitGcsScoCS.do')
          if(vm.aboutGCS.emgSeq == parent._emgSeq){
            vm.aboutGCS.emgSeq = '';
          }
        }
        if(_typeSource == 'hljld'){
          // if(parent._count == 0 && parent._count != ''){
          //   vm.aboutGCS.gcsSeq = ''
          // }
          $('#gcsForm').attr('action', '${baseurl}zjszyyhljld/subGcsSco.do')
          if(vm.aboutGCS.emgSeq == parent._emgSeq){
            vm.aboutGCS.emgSeq = '';
          }
        }

        jquerySubByFId('gcsForm', insertuser_callback, null, "json");
      }

    }

    // ajax 拿数据
    function ajaxGetMsgList() {
      publicFun.httpServer({url: _baseUrl + 'scorequery/findScopeQueryList.do', isAsync: false}, { _t: Date.parse(new Date())}, function (res) {
        var msgList = res.resultInfo.sysdata;
        if (res.resultInfo.type == '1') {
          $.each(msgList, function (key, val) {
            if (vm.getMsgList.hasOwnProperty(key)) {
              if (key == 'eyeRctCodList' || key == 'lanRctCodList' || key == 'actRctCodList') {
                $.each(val, function (idx, valu) {
                  valu['checked'] = false
                })
              }
              vm.getMsgList[key] = val;
            }
            if (vm.aboutGCS.hasOwnProperty(key)) {
              vm.aboutGCS[key] = val;
            }
          });
          if(parent.sub.aboutSco.gcsSeq !=null && parent.sub.aboutSco.gcsSeq != ''){
            var getMsgUrl = _baseUrl + "scorequery/findGcsScoreByXtpgSeq.do",
              getMsgData = {
                "emgSeq": parent.sub.aboutSco.gcsSeq,
                date: new Date().toTimeString()
              };
            getPatientMsg(getMsgUrl, getMsgData);
          }
          
        }
      });
    }
    //  ajax 拿修改数据
    function getPatientMsg(url, data) {
      var checkBoxList = ['eyeRctCod', 'lanRctCod', 'actRctCod'];
      publicFun.httpServer({ url: url}, data, function (res) {
        var _res = res;
        for (var _key in _res) {
          if (vm.aboutGCS.hasOwnProperty(_key)) {
            vm.aboutGCS[_key] = _res[_key];
          }
          if ($.inArray(_key, checkBoxList) > -1 && _res[_key] != '') {
            $.each(vm.getMsgList[_key + 'List'], function (idx, val) {
              if (val['infocode'] == _res[_key]) {
                val['checked'] = true
              }
            })
          }
        }
      })
    }

    //保存
    function saveCom() {
      var _gcsVal = publicFun.strTrim(vm.totalGCS.totSco);
      if (_gcsVal == '' || _gcsVal == null) {
        publicFun.alert("请输入GCS评分");
        return false
      }
      jquerySubByFId('gcsForm', insertuser_callback, null, "json");
    }

    //保存回调
    function insertuser_callback(data) {
      if(_typeSource == 'hljld'){
        parent.sub.aboutSco.gcsSeq = data.resultInfo.message;
      }else{
        parent.$('#gcsSeq').val(data.resultInfo.message);
      }
      parent.sub.aboutSco.gcsSco = vm.totalGCS.totSco;
      parent.closemodalwindow()
    }

    $(function () {
      ajaxGetMsgList();
      if(parent.sub && parent.sub.name == 'csList') {
        gcsSco()
      }
    })

    function gcsSco() {
      $.ajax({
        url: '${baseurl}scorequery/findGcsScoreByXtpgSeq.do',
        dataType: 'json',
        contentType: 'application/json;charset=UTF-8',
        data: {
          emgSeq: _emgSeq
        },
        success: function (res) {
          vm.totalGCS.totSco = res.totSco;
          console.log(vm.getMsgList,vm.aboutGCS)
          var List = ['eyeRctCod', 'lanRctCod', 'actRctCod']
          for (var ite of List) {
            vm.aboutGCS[ite] = res[ite]
            for(var item of vm.getMsgList[ite + 'List']) {
              if(item.infocode == res.eyeRctCod) {
                item['checked'] = true
              }
            }
          }
        }
      })
    }
  </script>
</body>