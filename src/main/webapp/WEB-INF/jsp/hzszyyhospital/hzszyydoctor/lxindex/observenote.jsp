<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <title>留观病历首页</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hzszyyhems/hzszyydoctor/doctorendnote.css?55">
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" charset="utf-8">
    var _baseUrl = '${baseurl}',
      _emgSeq = '${emgSeq}',
      _cstAgeNew = '${hspemginfCustom.cstAge}',
      _cstAgeCodNew = '${hspemginfCustom.cstAgeCod}',
      _admtDat = '${hspObsvtfstInfCustom.admtDatStr}',
      _dscgDat = '${hspObsvtfstInfCustom.dscgDatStr}',
      _obsvtLen = '${hspObsvtfstInfCustom.obsvtLen}',
      _oprtDat = '${hspObsvtfstInfCustom.oprtDatStr}',
      _name = '${sessionScope.activeUser.usrname}',
      _number = '${sessionScope.activeUser.usrno}',
      _cratNam = '${hspObsvtfstInfCustom.cratNam}',
      _cratNbr = '${hspObsvtfstInfCustom.cratNbr}',
      _unit = '${hspObsvtfstInfCustom.obsvtType}';
  </script>
  <script language="javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
</head>

<body class="observenote doctornote">
  <div class="mainbody">
    <p class="subheadtitle">留观首页</p>
    <form id="observenoteForm" action="${baseurl}zyylqbl/submitlgsy.do" method="post">
      <input type="hidden" name="formToken" value="${formToken}" />
      <input id="obsvtfstSeq" type="text" name="hspObsvtfstInfCustom.obsvtfstSeq" class="hidden" value="${hspObsvtfstInfCustom.obsvtfstSeq}">
      <input type="text" name="hspObsvtfstInfCustom.emgSeq" class="hidden" value="${hspemginfCustom.emgSeq}">
      <div class="divwrapper">
        <!-- <div class="basicDiv">
            <label class="bascilab">姓名：<input class="basicInput" type="text" value="${hspemginfCustom.cstNam}" readonly unselectable='on'></label>
            <label class="bascilab">性别：<input class="basicInput" type="text" value="${hspemginfCustom.cstSexCod}" readonly unselectable='on'></label>
            <label class="bascilab cstAgelab">年龄：<input class="basicInput" type="text" id="ageInput" readonly unselectable='on'></label>
            <label class="bascilab">科别：<input class="basicInput longbasicInput" type="text" value="${hspemginfCustom.emgFkCod}" readonly unselectable='on'></label>
            <label class="bascilab">病历号：<input class="basicInput" type="text" value="${hspemginfCustom.mpi}" readonly unselectable='on'></label>
            <label class="bascilab">留观号：</label>
        </div> -->
        <ul class="ulwrapper">
          <li class="halfli">
            <input class="basicInput" type="hidden" value="${hspemginfCustom.observationCode}" name="hspemginfCustom.observationCode">
            <span class="smalltitle">姓名</span>
            ${hspemginfCustom.cstNam}
          </li>
          <li class="halfli">
            <span class="smalltitle">性别</span>
            ${hspemginfCustom.cstSexCod}
          </li>
          <li class="halfli">
            <span class="smalltitle">年龄</span>
            <span id="ageInput"></span>
          </li>
          <li class="halfli">
            <span class="smalltitle">留观号</span>
            ${hspemginfCustom.observationCode}
          </li>
          <li class="halfli">
            <span class="smalltitle">身份证号</span>
            <span class="idCardNo"><input type="checkbox" onchange="canShowInput(this)"> 无</span>
            <input type="text" class="idCardYes" onblur="isHideCk()" onkeyup="isHideCk()">
            <input type="text" name="hspemginfCustom.idNbr" value="${hspemginfCustom.idNbr}" id="idNum" class="hidden">
          </li>
          <li class="halfli">
            <span class="smalltitle">电话</span>
            <input type="text" name="hspemginfCustom.pheNbr" value="${hspemginfCustom.pheNbr}">
          </li>
          <li class="halfli">
            <span class="smalltitle">入观日期</span>
            <input id="_admtDatInput" class="Wdate spcWdate" type="text" name="hspObsvtfstInfCustom.admtDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              onchange="admChange()">
          </li>
          <li class="halfli">
            <span class="smalltitle">出观日期</span>
            <input id="_dscgDatInput" class="Wdate spcWdate" type="text" name="hspObsvtfstInfCustom.dscgDat" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})"
              onchange="admChange()" autocomplete="off">
          </li>
          <li class="fourtimesli">
            <table id="diagnosistab">
              <tr>
                <td>
                  <span class="smalltitle">初步诊断</span>
                </td>
              </tr>
              <tr>
                <td>
                  <span class="leftspan"><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod(2, '1')">[查看]</a></span>
                  <div class="input readonly" id="show_text2">${hspemginfCustom.jbzdDes}</div>
                </td>
              </tr>
              <tr>
                <td>
                  <span class="smalltitle">出观诊断</span>
                </td>
              </tr>
              <tr>
                <td>
                  <span class="leftspan"><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod(4, '4')">[查看]</a></span>
                  <div class="input readonly" id="show_text4">${hspemginfCustom.cyzdXy}</div>
                </td>
              </tr>
            </table>
          </li>
          <li>
            <span class="smalltitle">转归</span>
            <select class="Signinput" name="hspObsvtfstInfCustom.obsvtZg" id="selectVal">
              <option value="" selected="selected">请选择</option>
              <option value="2">住院</option>
              <option value="0">出观</option>
              <option value="4">自动离院</option>
              <option value="8">回家</option>
              <option value="9">转门诊</option>
              <option value="11">转留观室</option>
              <option value="12">非医嘱离院</option>
              <option value="3">死亡</option>
              <option value="14">来院已死亡</option>
              <option value="13">转院</option>
              <option value="1">出院</option>
            </select>
          </li>
          <li>
            <span class="smalltitle">留观时长</span>
            <input class="Signinput" id="_obsvtLenInput" type="text" name="hspObsvtfstInfCustom.obsvtLen" value="${hspObsvtfstInfCustom.obsvtLen}">
            <span class="unit">天</span>
            <input type="text" class="hidden" id="obsvtType" name="hspObsvtfstInfCustom.obsvtType" value="1">
          </li>
          <li class="rightli">
            <span class="relative">
              <span>医师签名</span>
              <input type="text" id="username" maxlength="10" name="hspObsvtfstInfCustom.cratNam" readonly unselectable='on'>
              <input type="text" class="hidden" id="usernameNum" maxlength="10" name="hspObsvtfstInfCustom.cratNbr">
            </span>
            <label class="labbox rxbox">日期</label>
            <input class="Wdate spcWdate" id="_oprtDatInput" name="hspObsvtfstInfCustom.oprtDat" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})">
          </li>
        </ul>
      </div>
    </form>
  </div>
  <div class="btnPos">
    <a id="save" href="javascript:;" class="commonbtn leftBtn" onclick="saveObservenote()">保存</a>
    <!--  <a id="delete" href="javascript:;" class="commonbtn leftBtn" onclick="deleteObservenote()">删除</a>    -->
    <a href="javascript:;" class="commonbtn" onclick="saveObservenote('print')">打印</a>
  </div>
  <jsp:include page="/WEB-INF/jsp/hzszyyhospital/hzszyydoctor/lxindex/printobservenote.jsp"></jsp:include>
  <script type="text/javascript" charset="utf-8">
    function sitBasicMsg () {
      $('#_admtDatInput').val(_admtDat);
      $('#_dscgDatInput').val(_dscgDat);

      var _oprtDatVal;
      if (_oprtDat != '') {
        _oprtDatVal = _oprtDat;
      } else {
        _oprtDatVal = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss');
      }

      if (_cratNam != '') {
        $('#username').val(_cratNam)
      } else {
        $('#username').val(_name)
      }

      if (_cratNbr != '') {
        $('#usernameNum').val(_cratNbr)
      } else {
        $('#usernameNum').val(_number)
      }

      $('#_oprtDatInput').val(_oprtDatVal);

      var newAgeVal = _cstAgeNew + _cstAgeCodNew;
      if (!_cstAgeNew) {
        $('#ageInput').text('')
      } else {
        $('#ageInput').text(newAgeVal)
      }

      if (_unit == '0') {
        $('.unit').html('时');
        $("#obsvtType").val("0");
      }
      if (_unit == '1') {
        $('.unit').html('天');
        $("#obsvtType").val("1");
      }
      var _selVal = "${hspObsvtfstInfCustom.obsvtZg}",
        _zgNurseVal = '${hspsqlinfCustom.sqlStaCod}';
      if (_zgNurseVal !== '') {
        $('#selectVal').val(_zgNurseVal);
      } else {
        $('#selectVal').val(_selVal);
      }
    }

    function getTimeWrap() {
      var _timeWrap = getTime();
      if ($('#_admtDatInput').val() == '' || $('#_dscgDatInput').val() == '') {
        $('#_obsvtLenInput').val('');
      } else {
        $('#_obsvtLenInput').val(_timeWrap);
      }
    }

    function getTime() {
      var admtime = new Date($('#_admtDatInput').val()),
        dsctime = new Date($('#_dscgDatInput').val()),
        admtimes = admtime.getTime(),
        dsctimes = dsctime.getTime(),
        total = (dsctimes - admtimes) / 1000;
      var timewrapUp = Math.ceil(total / (24 * 60 * 60)); // 向上取整
      var timewrap = parseInt(total / (24 * 60 * 60)); // 获取整的天数
      if ((total < 86400) && (total > 0)) {
        timewrap = (total / (60 * 60));
        if (timewrap > 0 && timewrap < 1) {
          timewrap = 1;
        } else {
          timewrap = Math.ceil(timewrap);
        }
        $('.unit').html('时');
        $("#obsvtType").val("0");
      } else {
        timewrap = timewrapUp;
        $('.unit').html('天');
        $("#obsvtType").val("1");
      }
      return timewrap;
    }
    function admChange() {
      var timewrap = getTime();
      if ($('#_admtDatInput').val() == null || $('#_admtDatInput').val() == "") {
        publicFun.alert("入观时间不能为空");
        return false;
      }
      if (timewrap < 0 || timewrap == -0) {
        publicFun.alert('出观时间需大于入观时间');
        $('#_dscgDatInput').val('');
        $('#_obsvtLenInput').val('');
        return false;
      }
      if ($('#_admtDatInput').val() == '' || $('#_dscgDatInput').val() == '') {
        $('#_obsvtLenInput').val('');
      } else {
        $('#_obsvtLenInput').val(timewrap);
      }
    }

    function canShowInput(current) {
      var isCheckVal = ''
      if ($(current).attr('checked')) {
        isCheckVal = '1'
        $('.idCardYes').hide()
      } else {
        isCheckVal = '0'
        $('.idCardYes').show()
      }
      current.vaule = isCheckVal
      $('#idNum').val(isCheckVal)
    }

    function isHideCk() {
      if ($('.idCardYes').val() === '') {
        $('.idCardNo').show()
        $('.idCardNo input:checkbox').attr('checked', true)
        $('.idCardNo input:checkbox').val('1')
        $('.idCardYes').hide()
      } else {
        $('.idCardNo').hide()
        $('.idCardYes').show()
      }
      $('#idNum').val($('.idCardYes').val())
    }

    var isOpenBox = false;
    function addPreDgnCod(num, type) {
      if (parent.pageFlg) {
        return;
      }
      var _title = '';
      var _list = [{ cod: 2, name: '入院诊断' }, { cod: 4, name: '出院诊断' }];
      $.each(_list, function (idx, val) {
        if (val.cod == num) {
          _title = val.name
        }
      })
      if (isOpenBox) {
        createmodalwindow(_title, 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${hspemginfCustom.emgSeq}&&jbzdType=' + type + '&&trnumber=' + num, 'no');
      }
    }

    /**
     * @ 保存
     */
    function saveObservenote (printFlg) {
      if (printFlg === 'print') {
        if (!isOpenBox) { // 如果没有保存权限的只能打印
          printnote();
          return false;
        } else {
          savePostMsg(printFlg) // 先保存后打印
        }
      } else {
        savePostMsg(printFlg)
      }
    }

    function savePostMsg (printFlg) {
      if ($('#_admtDatInput').val() == null || $('#_admtDatInput').val() == "") {
        publicFun.alert("入观时间不能为空");
        return false;
      }
      jquerySubByFId('observenoteForm', insertuser_callback, printFlg, "json");
    }


    /**
     * @ 删除
     */
    function deleteObservenote() {
      _confirm('确定删除该数据吗？', null, function () {
        var obsvtfstSeq = $("#obsvtfstSeq").val();
        if (obsvtfstSeq != null && obsvtfstSeq != '') {
          $.ajax({
            url: "${baseurl}zyylqbl/deletelgsy.do",
            type: "post",
            data: {
              "obsvtfstSeq": obsvtfstSeq
            },
            success: function (data) {
              message_alert(data);
              setTimeout(function () {
                window.location.reload();
              }, 800)
            }
          })
        }
      });
    }

    function insertuser_callback(data, printFlg) {
      window.sessionStorage.setItem('observeSave', printFlg);
      if (printFlg === 'print') {
        window.location.reload();
      } else {
        message_alert(data);
        setTimeout(function () {
          window.location.reload();
        }, 800)
      }
    }

    window.onload = function () {
      var _print = window.sessionStorage.getItem('observeSave');
      if (_print === 'print') {
        window.sessionStorage.removeItem('observeSave');
        setTimeout(function () {
          printnote();
        }, 800);
      }
    }

    function judgeWitchShow() {
      if ($('#idNum').val() == '1') {
        $('.idCardNo input:checkbox').attr('checked', true)
        $('.idCardNo').show()
        $('.idCardYes').hide()
      } else if ($('#idNum').val() === '') {
        $('.idCardNo input:checkbox').attr('checked', true)
        $('.idCardNo input:checkbox').val('1')
        $('.idCardYes').hide()
      } else {
        if ($('#idNum').val() !== '0') {
          $('.idCardYes').val($('#idNum').val())
        }
        $('.idCardNo').hide()
        $('.idCardYes').show()
      }
    }

    $(function () {
      sitBasicMsg();
      var height = $('#main', parent.document).height() - 45;
      $('.mainbody').height(height);
      if ($('#_admtDatInput').val() != '' && $('#_dscgDatInput').val() != '' && $('#_obsvtLenInput').val() == '') {
        getTimeWrap();
      }
      judgeWitchShow()
      checkRole(_cratNbr);
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
        if (parent.pageFlg) {
          $('#save').hide()
          $('#bgsave').hide()
        } else {
          //规则判断，若是1，则有操作权限，若是0，则隐藏操作按钮
          if (data.resultInfo.message == "1") {
            $("#save").show();
            $("#delete").show();
            isOpenBox = true;
          } else {
            $("#save").hide();
            $("#delete").hide();
            $("#bgsave").hide();
            isOpenBox = false;
          }
        }
      })
    }
  </script>
</body>

</html>