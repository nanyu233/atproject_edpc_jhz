<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>抢救室小结</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/doctorendnote.css?v=${versionDay}">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
      _emgSeq = parent.$('#emgSeq').val(),
      _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}';
  </script>
  <script src="${baseurl}lib/avalon1.4.8/avalon.js" type="text/javascript" charset="UTF-8"></script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="viewnote doctornote" ms-controller="viewNote">
  <div class="mainbody">
    <p class="subheadtitle">抢救室小结</p>
    <form id="viewnoteForm" action="${baseurl}zyylqbl/submitcgxj.do" method="post">
      <input type="hidden" name="formToken" value="${formToken}" />
      <input id="cgxjSeq" type="text" name="hspCgxjInfCustom.cgxjSeq" ms-duplex-string="msg.cgxjSeq" class="hidden">
      <input type="text" name="hspCgxjInfCustom.emgSeq" class="hidden" ms-duplex-string="msg.emgSeq">
      <div class="divwrapper">
        <div class="basicDiv">
          <label class="bascilab m-lten">
            姓名：
            <input class="basicInput" type="text" ms-duplex-string="msg.cstNam" readonly unselectable='on'>
          </label>
          <label class="bascilab">
            性别：
            <input class="basicInput" type="text" ms-duplex-string="msg.cstSexCod" readonly unselectable='on'>
          </label>
          <label class="bascilab cstAgelab">
            年龄：
            <input class="basicInput" type="text" ms-duplex-string="msg.cstAge" readonly unselectable='on'>
          </label>
          <label class="bascilab">
            科别：
            <input class="basicInput longbasicInput" type="text" value="急诊科门诊" readonly unselectable='on'>
          </label>
          <label class="bascilab">
            病历号：
            <input class="basicInput" type="text" ms-duplex-string="msg.mpi" readonly unselectable='on'>
          </label>
        </div>
        <ul class="ulwrapper">
          <li class="halfli">
            <span class="smalltitle">入观时间</span>
            <input id="_ryrqDatInput" class="Wdate spcWdate" type="text" name="hspCgxjInfCustom.ryrqDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              ms-duplex-string="msg.ryrqDat">
          </li>
          <li>
            <span class="long-li-title">入观时病情</span>
          </li>
          <li class="varylongli">
            <textarea name="hspCgxjInfCustom.ryqkDes" maxlength="1000" ms-duplex-string="msg.ryqkDes"></textarea>
          </li>
          <li>
            <span class="long-li-title">目前重要的病情发展</span>
          </li>
          <li class="varylongli">
            <!-- ondblclick="showMsg('xtpghznr', '')" -->
            <textarea name="hspCgxjInfCustom.zljgDes" id="xtpghznr" maxlength="1000" ms-duplex-string="msg.zljgDes"></textarea>
          </li>
          <li class="varylongli">
            <table id="diagnosistab">
              <tr>
                <td>
                  <span class="long-left-span">
                    当前诊断
                    <span>
                      <a class="my-linkbutton" data-options="toggle:true,plain:true" onclick="addPreDgnCod(4, '4')">[查看]</a>
                    </span>
                  </span>
                  <div class="input readonly" id="show_text4">{{msg.cyzdXy}}</div>
                </td>
              </tr>
            </table>
          </li>
          <li>
            <span class="long-li-title">已进行的操作、用药及其他治疗</span>
            <a class="my-linkbutton importBtnLink" data-options="toggle:true,plain:true" onclick="showTem('subTemDiv')">[导入]</a>
          </li>
          <li class="varylongli">
            <div class="import-tem-div" id="subTemDiv"></div>
            <textarea name="hspCgxjInfCustom.cyyzDes" maxlength="1000" id="cyyzDes" ms-duplex-string="msg.cyyzDes"></textarea>
          </li>
          <li>
            <span class="long-li-title">患者目前情况</span>
          </li>
          <li class="varylongli">
            <textarea name="hspCgxjInfCustom.cyqkDes" maxlength="1000" ms-duplex-string="msg.cyqkDes"></textarea>
          </li>
          <li>
            <span class="smalltitle">患者去向</span>
            <select id="sqlType" class="departments" ms-duplex-string="msg.sqlType" name="hspCgxjInfCustom.sqlType"
              ms-change="reversionChange()">
              <option value="">请选择</option>
              <option ms-repeat="msgList.cstDspList" ms-attr-value="el.infocode">{{el.info}}</option>
            </select>
            <span ms-visible="msg.sqlType == 2">
              &nbsp;&nbsp;&nbsp;科室：
              <input type="text" id="emg_emgFkName" readonly="readonly" ms-duplex-string="msg.sqlDepName" name="hspCgxjInfCustom.sqlDepName"
                onfocus="selectDep()" />
              <input class="hidden" id="emg_sqlDepCod" type="text" ms-duplex-string="msg.sqlDepCod" name="hspCgxjInfCustom.sqlDepCod">
              <input type="text" class="hidden" ms-duplex-string="msg.sqlSeq" name="hspCgxjInfCustom.sqlSeq">
            </span>
            <span ms-visible="msg.sqlType == 13">
              &nbsp;&nbsp;&nbsp;所转医院：
              <input type="text" ms-duplex-string="msg.sqlDes" maxlength="20" name="hspCgxjInfCustom.sqlDes" />
            </span>
          </li>
          <li class="rightli">
            <span>医师签名</span>
            <span class="spanRelative">
              <!-- onkeydown="getSignList(event)"  -->
              <input type="text" id="username" maxlength="10" name="hspCgxjInfCustom.cratNam" ms-duplex-string="msg.cratNam"
                readonly>
              <input type="text" class="hidden" id="usernameNum" maxlength="10" name="hspCgxjInfCustom.cratNbr"
                ms-duplex-string="msg.cratNbr">
              <div class="userList" id="userNameList"></div>
            </span>
            <span id="dzqm"></span>
            <label class="labbox rxbox">日期</label>
            <input class="Wdate spcWdate" name="hspCgxjInfCustom.oprtDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              ms-duplex-string="msg.oprtDat">
          </li>
        </ul>
      </div>
    </form>
  </div>
  <div class="btnPos">
    <a id="sign" href="javascript:;" class="commonbtn leftBtn" onclick="getSign()">签名</a>
    <a id="save" href="javascript:;" class="commonbtn leftBtn" onclick="saveViewNote()">保存</a>
    <a href="javascript:;" id="print" class="commonbtn" onclick="saveViewNote('print')">打印</a>
  </div>
  <script language="javascript" src="${baseurl}js/subpageJs/hzszyyhospital/docRecord/importBtnMsg.js"></script>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/lxsummary/printviewnote.jsp"></jsp:include>
  <script type="text/javascript" charset="utf-8">
    var vm = avalon.define({
      $id: 'viewNote',
      msgList: {
        cstDspList: publicFun.getDict('CST_DSP_COD')
      },
      msg: {
        emgSeq: _emgSeq,
        cgxjSeq: '',
        cstNam: '',
        cstSexCod: '',
        mpi: '',
        cstAge: '',
        ryrqDat: '', // 入观时间
        ryqkDes: '', // 入观时病情
        zljgDes: '', // 目前重要的病情发展
        cyzdXy: '', // 当前诊断
        cyyzDes: '', // 已进行的操作、用药及其他治疗
        cyqkDes: '', // 患者目前情况
        oprtDat: '', // 日期
        cratNam: '', // 医师签名
        cratNbr: '',
        sqlType: '',
        sqlDepName: '', // 住院科室
        sqlDepCod: '',
        sqlSeq: '',
        sqlDes: '' // 所转医院
      },
      reversionChange: function () {
        var _sqlType = vm.msg.sqlType;
        if (_sqlType != '2') {
          vm.msg.sqlDepName = '';
          vm.msg.sqlDepCod = '';
        }
        if (_sqlType != '13') {
          vm.msg.sqlDes = '';
        }
        if (_sqlType != '2' && _sqlType != '13') {
          vm.msg.sqlDepName = '';
          vm.msg.sqlDepCod = '';
          vm.msg.sqlDes = '';
        }
      },
    })

    function getAjaxMsg() {
      publicFun.httpServer({ url: _baseUrl + 'zyylqbl/getCgxjByEmgSeq.do'}, { 'emgSeq': _emgSeq }, function (res) {
        if (res.resultInfo.type == '1') {
          var _emgRes = res.resultInfo.sysdata.hspemginfCustom, _cgRes = res.resultInfo.sysdata.hspCgxjInfCustom;
          var _emgKey = ['cstNam', 'cstSexCod', 'cstAge', 'cstAgeCod', 'mpi', 'cyzdXy'];
          if (_emgRes) {
            for (var key in _emgRes) {
              if (!publicFun.checkItemNull(_emgRes[key])) {
                if ($.inArray(key, _emgKey) != -1) {
                  if (vm.msg.hasOwnProperty(key)) {
                    if (key === 'cstAge') {
                      _emgRes[key] = _emgRes[key] + _emgRes.cstAgeCod
                    }
                    vm.msg[key] = _emgRes[key]
                  }
                }
              }
            }
          }
          if (_cgRes) {
            for (var key in _cgRes) {
              if (!publicFun.checkItemNull(_cgRes[key])) {
                if (vm.msg.hasOwnProperty(key)) {
                  if (key === 'oprtDat' || key === 'ryrqDat') {
                    _cgRes[key] = publicFun.timeFormat(_cgRes[key], 'yyyy/MM/dd hh:mm:ss');
                  }
                  vm.msg[key] = _cgRes[key]
                }
              }
            }
          } else {
            vm.msg.cratNam = _name;
            vm.msg.cratNbr = _number;
            // 出观小结主键没值，则取预检时间）
            vm.msg.ryrqDat = publicFun.timeFormat(new Date(_emgRes.emgDat), 'yyyy/MM/dd hh:mm:ss');
            vm.msg.oprtDat = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
          }
          // 权限判断
          checkRole(vm.msg.cratNbr);
          if (vm.msg.cgxjSeq !== '' && vm.msg.cgxjSeq != null) {
            findDzqmImg(vm.msg.cgxjSeq);
          }
        }
      })
    }

    function getSignList(e) {
      if (e.keyCode == 13) {
        publicFun.SearchList('username', 'userNameList');
      }
    }

    $("body").click(function () {
      $(".userList").hide();
    });

    // function showMsg(name, seo) {
    //   parent.createmodalwindow('电子病历知识库', 820, 610, '${baseurl}favorite/toKnowledgeBase.do?idName=' + name + '&tempSeo=' + seo + '&emgSeq=' + _emgSeq + '&isCheckSource=checkBox', 'no');
    // }

    var isOpenBox = false;
    //新增初步诊断
    function addPreDgnCod(num, type) {
      var _title = '';
      var _list = [{ cod: 2, name: '初步诊断' }, { cod: 4, name: '出观诊断' }];
      $.each(_list, function (idx, val) {
        if (val.cod == num) {
          _title = val.name
        }
      })
      var isCanEditZd = '';
      if (isOpenBox == false) {
        isCanEditZd = '';
      } else {
        isCanEditZd = 'canEditZd'
      }
      createmodalwindow(_title, 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=' + _emgSeq + '&jbzdType=' + type + '&trnumber=' + num + '&canEditZd=' + isCanEditZd, 'no');
    }

    /**
     * @ 签名
     */
    function getSign() {
      var cgxjSeq = vm.msg.cgxjSeq;
      if (cgxjSeq != null && cgxjSeq != '') {
        publicFun.httpServer(
          { url: '${baseurl}zyylqbl/getSign.do' },
          {
            "emgSeq": _emgSeq, "relevanceId": cgxjSeq, "documentTable": 'HSP_CGXJ_INF', "templateId": 'hash_053',
            "request172": '抢救室小结', "tag": '抢救室小结'
          },
          function (res) {
            if (res.resultInfo.type == 1) {
              findDzqmImg(cgxjSeq);
            }
            message_alert(res);
          })
      } else {
        publicFun.alert("请先保存数据。");
      }
    }

    function findDzqmImg(cgxjSeq) {
      publicFun.httpServer({ url: '${baseurl}zyylqbl/findDzqmImg.do' }, { "relevanceId": cgxjSeq, "documentTable": 'HSP_CGXJ_INF' },
        function (res) {
          if (res.resultInfo.type != 1) {
            message_alert(res);
            return false;
          }
          $("#dzqm").html('');
          var imgList = res.resultInfo.sysdata.hspAotographInfoCustomList;
          for (var i = 0; i < imgList.length; i++) {
            var img = $("<img />")
            $("#dzqm").append(img.attr({ "src": "data:image/jpeg;base64," + imgList[i].docImg, "width": 88 }));
          }
        }
      )
    }

    /**
     * @ 保存
     */
    function saveViewNote(printFlg) {
      if (printFlg === 'print') {
        if (isOpenBox) {
          saveMsgView(printFlg)
        } else {
          printnote();
          return false;
        }
      } else {
        saveMsgView();
      }
    }

    function saveMsgView(printFlg) {
      if ($('#_ryrqDatInput').val() == null || $('#_ryrqDatInput').val() == "") {
        publicFun.alert("入观时间不能为空");
        return false;
      }
      if (vm.msg.oprtDat == null || vm.msg.oprtDat == "") {
        publicFun.alert("日期不能为空");
        return false;
      }
      jquerySubByFId('viewnoteForm', insertuser_callback, printFlg, "json");
    }

    /**
     * @ 删除
     */
    // function delViewnote() {
    //   _confirm('确定删除该数据吗？', null, function () {
    //     var cgxjSeq = $("#cgxjSeq").val();
    //     if (cgxjSeq != null && cgxjSeq != '') {
    //       publicFun.httpServer({ url: '${baseurl}zyylqbl/deletecgxj.do' }, { "cgxjSeq": cgxjSeq }, function (data) {
    //         insertuser_callback(data);
    //       })
    //     }
    //   });
    // }

    function insertuser_callback(data, printFlg) {
      if (printFlg === 'print') {
        printnote();
      } else {
        message_alert(data);
        setTimeout(function () {
          window.location.reload();
        }, 800)
      }
    }

    $(function () {
      var height = $('#main', parent.document).height() - 45;
      $('.mainbody').height(height);
      getAjaxMsg();
      initDocImportHtml('subTemDiv', 'cyyzDes')
    })

    $(document).keydown(function (event) {
      switch (event.keyCode) {
        case 18:
          event.preventDefault();
        case 116:
          event.preventDefault();
        case 122:
          event.preventDefault();
      }
    });

    //初始化 判断登陆用户角色是否有权限对该医师进行操作
    function checkRole(_cratNbr) {
      publicFun.httpServer({ url: '${baseurl}zyylqbl/checkRoleAjax.do' }, { "cratNbr": _cratNbr }, function (data) {
        if (parent.pageFlg) { // 归档病历或者护士
          isOpenBox = false;
          $('#save').hide()
          $('#sign').hide()
        } else {
          //规则判断 tourist:游客无任何操作权限，nurse：护士有打印权限，doctor：医生（与创建人不为同一人）拥有签名和打印权限，doctorSelf医生（与创建人为同一人）拥有保存修改、签名、打印权限，admin:管理员权限拥有所有权限
          if (data.resultInfo.message == "nurse") {
            $("#save").hide();
            $('#sign').hide()
            isOpenBox = false;
          } else if (data.resultInfo.message == "doctor") {
            $("#save").hide();
            isOpenBox = false;
          } else {
            isOpenBox = true;
          }
        }
        //日志、归档病历、留抢病历 游客无权限
        if (data.resultInfo.message == "tourist") {
          $("#save").hide();
          $('#sign').hide();
          $('#print').hide();
          isOpenBox = false;
        }
        if (isOpenBox == false) {
          setPageDisable();
        }
      })
    }

    function setPageDisable() {
      $('#viewnoteForm input, #viewnoteForm textarea, #viewnoteForm select').attr('disabled', true);
      $('.importBtnLink').hide();
    }

    function selectDep() {
      createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do');
    }
  </script>
</body>

</html>