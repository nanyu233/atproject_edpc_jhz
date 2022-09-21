<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>留抢信息登记</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
</head>

<body class="querylqxxdj">
  <form class="form lqform" id="lqxxform" action="${baseurl}zyyqjs/zyylqxxdj_submit.do" method="post">
    <input class="hidden" type="text" name="hspJbzdInfCustom.emgSeq" value="${hspemginfCustom.emgSeq}">
    <table>
      <tbody>
        <tr>
          <!-- <th>就诊号</th>
          <td><span class="span_text">${hspemginfCustom.vstCad}</span></td> -->
          <th>病历号</th>
          <td><span class="span_text">${hspemginfCustom.mpi}</span></td>
          <th>姓名</th>
          <td><span class="span_text">${hspemginfCustom.cstNam}</span></td>
        </tr>
        <tr>
          <th>性别</th>
          <td><span class="span_text">${hspemginfCustom.cstSexCod}</span></td>
          <th>年龄</th>
          <td><span class="span_text" id="age">${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}</span></td>
        </tr>
        <tr>
          <th>联系方式</th>
          <td><span class="span_text">${hspemginfCustom.pheNbr}</span></td>
          <th>联系地址</th>
          <td id="age" colspan="3"><span class="span_text">${hspemginfCustom.cstAdr}</span></td>
        </tr>
        <tr>
          <th>分诊科室</th>
          <td colspan="3">
            <span class="span_text">${hspemginfCustom.emgFkCod}</span>
          </td>
        </tr>
        <!-- 
        <tr>
            <th>主诊症状</th>
            <td>
                <span class="span_text">${hspemginfCustom.symSitDes}</span>
            </td>
            <th>留抢去向</th>
            <td>
                <span class="span_text" id="lqqx_text">${hspemginfCustom.emgAreCod }</span>
            </td>
        </tr> -->
        <tr>
          <th>主诉症状</th>
          <td colspan="3">
            ${hspemginfCustom.jbbc}
          </td>
        </tr>
        <tr>
          <th> <i class="red">*</i> 转归时间</th>
          <td>
            <input id="sql_sqlDatTim" value="${hspemginfCustom.sqlDat}" class="input-sdate Wdate" name="hspsqlinfCustom.sqlDat"
              type="text" placeholder="点击选择时间" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" />
          </td>
          <th> <i class="red">*</i> 转归</th>
          <td>
            <select name="hspsqlinfCustom.sqlStaCod" value="${hspemginfCustom.sqlStaCod}" id="sqlStaCod" onchange="depChange()">
            </select>
          </td>
        </tr>
        <tr id="zgdep" class="diffDep">
          <th> <i class="red showIcon">*</i> 科室</th>
          <td>
            <input id="emg_emgFkName" value="${hspemginfCustom.cstDepCodNew}" readonly="readonly" onfocus="selectDep()"
              type="text" name="hspsqlinfCustom.sqlDepName">
            <input class="hidden" id="emg_sqlDepCod" type="text" name="hspsqlinfCustom.sqlDepCod" value="${hspemginfCustom.sqlDepCod}">
            <input class="hidden" type="text" name="hspsqlinfCustom.sqlSeq" value="${hspemginfCustom.sqlSeq}">
            <input class="hidden" type="text" name="hspsqlinfCustom.sqlNurNbr" value="${sessionScope.activeUser.usrno}" />
            <input class="hidden" type="text" name="hspsqlinfCustom.sqlNurNam" value="${sessionScope.activeUser.usrname}" />
          </td>
          <th></th>
          <td></td>
        </tr>
        <tr id="zydep" class="diffDep">
          <th> <i class="red">*</i> 所转医院</th>
          <td>
            <input type="text" id="emg_sqlDes" name="hspsqlinfCustom.sqlDes" value="${hspemginfCustom.sqlDes}">
          </td>
          <th></th>
          <td></td>
        </tr>
        <input class="hidden" type="text" name="hspemginfCustom.emgSeq" value="${hspemginfCustom.emgSeq}">
        <tr id="bedDep" class="diffDep">
          <th> 床位</th>
          <td>
            <select id="bedId" name="hspemginfCustom.bedid" value="${hspemginfCustom.bedid}">
            </select>
          </td>
          <th></th>
          <td></td>
        </tr>
        <!-- 
        <tr>
          <th>其他医院送入（如有）</th>
          <td class="relative" colspan="3">
            <input id="abnScoNme" type="text" name="hspemginfCustom.abnScoNme" value="${hspemginfCustom.abnScoNme}">
            <input class="hidden" type="text" name="hspemginfCustom.preUsrNbr" maxlength="32" readonly="readonly" value="${sessionScope.activeUser.usrno}" />
          </td>
        </tr>
         -->
        <tr>
          <th><a class="my-linkbutton btna" data-options="toggle:true,plain:true" onclick="addPreDgnCod()">[查看]</a>
            <strong>诊断</strong>
          </th>
          <td colspan="3">
            <div class="input readonly" id="show_text">${hspemginfCustom.jbzdDes}</div>
          </td>
        </tr>
        <tr>
          <td colspan="4" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="sure()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>
  <script type="text/javascript" src="${baseurl}lib/easyui1.3/jquery-1.8.0.min.js"></script>
  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <script type="text/javascript" src="${baseurl}lib/jquery.form.min.js"></script>
  <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script>
  <script type="text/javascript">
    var _baseUrl;
    _baseUrl = "${baseurl}",
    bedPlaceCodList = [], sqlStaCodList = [];
  </script>
  <script type="text/javascript">
    var _isGetVal = false;
    function loadDoc() {
      getAjaxList();
    }
    
    function getAjaxList () {
      publicFun.httpServer({url: '${baseurl}zyyqjs/findBedAndSqlStaCod.do'}, { 'emgSeq': '${hspemginfCustom.emgSeq}'}, function (res) {
        bedPlaceCodList = res.resultInfo.sysdata.bedplacecodList;
        sqlStaCodList = res.resultInfo.sysdata.sqlStaCodList;
        var _sqlSeq = '${hspemginfCustom.sqlSeq}', _firstSeq = '${hspemginfCustom.firstsqlseq}';
        var _lgBed = '${islgbed}', _depCod = '${hspemginfCustom.sqlStaCod}';
        var selStr = '<option value=""></option>';
        if (_sqlSeq === _firstSeq) {
          if (_lgBed === '1') {
            if (_depCod == '6' || _depCod == '11' || _depCod == '5') {
              for (var i = 0 ; i < sqlStaCodList.length; i++) {
                if (sqlStaCodList[i].infocode != _depCod) {
                  selStr += '<option value='+ sqlStaCodList[i].infocode +'>' + sqlStaCodList[i].info + '</option>'
                }
              }
            }
            if (_depCod != '6' && _depCod != '11' && _depCod != '5') {
              for (var i = 0; i < sqlStaCodList.length; i++) {
                selStr += '<option value=' + sqlStaCodList[i].infocode + '>' + sqlStaCodList[i].info + '</option>'
              }
            }
          } else if (_lgBed === '0') {
            if (_depCod == '6' || _depCod == '5') {
              for (var i = 0; i < sqlStaCodList.length; i++) {
                if (sqlStaCodList[i].infocode != _depCod) {
                  selStr += '<option value=' + sqlStaCodList[i].infocode + '>' + sqlStaCodList[i].info + '</option>'
                }
              }
            } else {
              for (var i = 0; i < sqlStaCodList.length; i++) {
                selStr += '<option value=' + sqlStaCodList[i].infocode + '>' + sqlStaCodList[i].info + '</option>'
              }
            }
          }
        } else {
          for (var i = 0; i < sqlStaCodList.length; i++) {
            selStr += '<option value=' + sqlStaCodList[i].infocode + '>' + sqlStaCodList[i].info + '</option>'
          }
        }
        $('#sqlStaCod').html(selStr);
        if (_sqlSeq === _firstSeq) {
          $('#sqlStaCod').val('');
        } else {
          $('#sqlStaCod').val(_depCod);
        }
        depChange();
        _isGetVal = true;
      })
    }

    function depChange () {
      var zgCode = $("#sqlStaCod").val();
      //如果去向为住院，则科室不清空
      if (zgCode == '2' || zgCode == '9') {
        if (zgCode == '9') {
          $('.showIcon').hide();
        } else {
          $('.showIcon').show();
        }
        if (_isGetVal) {
          $("#emg_sqlDepCod").val("");
          $("#emg_emgFkName").val("");
        }
        $(".diffDep").css({ "display": "none" });
        $('#zgdep').css({ "display": "table-row" });
      } else {
        $('#zgdep').css({ "display": "none" });
        $("#emg_sqlDepCod").val("");
        $("#emg_emgFkName").val("");
        if (zgCode == "13") {
          $('#bedId').val('');
          $(".diffDep").css({ "display": "none" });
          $("#zydep").css({ "display": "table-row" });
        } else if (zgCode == '6' || zgCode == '11') {
          $("#emg_sqlDes").val("");
          if (zgCode == '11' && '${islgbed}' != '1') { // 若未开启，转归选择留观，则不显示床位
            $(".diffDep").css({ "display": "none" });
            $('#bedDep').css({ "display": "none" });
          } else {
            $(".diffDep").css({ "display": "none" });
            $("#bedDep").css({ "display": "table-row" });
          }
        } else {
          $("#emg_sqlDes").val("");
          $('#bedId').val('');
          $(".diffDep").css({ "display": "none" });
        }
      }
      var _optionStr = '<option value=""></option>';
      if (zgCode == '11') { // 11 290 留观室
        for (var i = 0; i < bedPlaceCodList.length; i++) {
          if (bedPlaceCodList[i].bedPlace == '290') {
            _optionStr += '<option value=' + bedPlaceCodList[i].bedid + '>' + bedPlaceCodList[i].bedPlcNam + '</option>'
          }
        }
      } else if (zgCode == '6') {
        for (var i = 0; i < bedPlaceCodList.length; i++) {
          if (bedPlaceCodList[i].bedPlace == '291') {
            _optionStr += '<option value=' + bedPlaceCodList[i].bedid + '>' + bedPlaceCodList[i].bedPlcNam + '</option>'
          }
        }
      }
      $('#bedId').html(_optionStr);
      $('#bedId').val('${hspemginfCustom.bedid}');
    }
    //表单验证  
    function validateForm() {
      sessionStorage.setItem("isValidateFormForLqxxdj", "true");
      return $("#lqxxform").validate({
        ignore: [],
        rules: {
          'hspsqlinfCustom.sqlDat': 'required',
          'hspsqlinfCustom.sqlStaCod': 'required',
          "hspsqlinfCustom.sqlDepName": {
            isOtherMsg: true
          },
          // "hspemginfCustom.bedid": {
          //   isOtherMsg: true
          // },
          "hspsqlinfCustom.sqlDes": {
            isOtherMsg: true
          }
        },
        messages: {
          'hspsqlinfCustom.sqlDat': '转归时间必填',
          'hspsqlinfCustom.sqlStaCod': '转归必填',
          "hspsqlinfCustom.sqlDepName": {
            isOtherMsg: "科室必填"
          },
          // "hspemginfCustom.bedid": {
          //   isOtherMsg: '床位必填'
          // },
          "hspsqlinfCustom.sqlDes": {
            isOtherMsg: "转入医院必填"
          }
        }
      }).form();
    }
    $.validator.methods.isOtherMsg = function (value, element, param) {
      var goHos = $('#sqlStaCod option:selected').val(); //选中的值
      var emgFkName = $("#emg_emgFkName").val(), hosName = $("#emg_sqlDes").val(), bedNum = $('#bedId').val();
      if (goHos == "2" && emgFkName == "") {
        return false;
      } else if (goHos == "13" && hosName == "") {
        return false;
      } 
      // else if (goHos == "6" && (bedNum === '' || bedNum == null)) { // 转留抢
      //   return false;
      // } else if (goHos == "11" && (bedNum === '' || bedNum == null) && '${islgbed}' == '1') { // 转留观
      //   return false;
      // } 
      else {
        return true;
      };
    };

    function sure() {
      var _sqlStaStr = '';
      for (var i = 0 ; i < sqlStaCodList.length; i++) {
        if (sqlStaCodList[i].infocode == '${hspemginfCustom.sqlStaCod}') {
          _sqlStaStr = sqlStaCodList[i].info;
        }
      }
      if (validateForm()) {
        // 时间相同转归去向不一样时
        if ($('#sql_sqlDatTim').val() == '${hspemginfCustom.sqlDat}') {
          if ($('#sqlStaCod').val() != '${hspemginfCustom.sqlStaCod}') {
            _confirm('您确定在<font color="red">' + $('#sql_sqlDatTim').val() + '</font>时间点，将<font color="red">' + _sqlStaStr + '</font>改为<font color="red">' + $('#sqlStaCod option:selected').text()  + '</font>吗', null, function () {
              jquerySubByFId('lqxxform', insertrole_callback, null, "json");
            });
          } else {
            jquerySubByFId('lqxxform', insertrole_callback, null, "json");
          }
        } else {
          // 转归界面，诊间就诊转留抢时病人时提醒“请确认是否要上调分诊等级” [只有原来进来的时候去向是空的，然后选择了留抢]
          if (('${hspemginfCustom.sqlStaCod}' == '5') && $('#sqlStaCod').val() == '6') {
            _confirm('请确认分诊等级是否需要上调，需要则到修改页面进行修正等级。', null, function () {
              jquerySubByFId('lqxxform', insertrole_callback, null, "json");
            });
          } else {
            jquerySubByFId('lqxxform', insertrole_callback, null, "json");
          }
        }
      }
    }
    //确定的回调函数
    function insertrole_callback(data) {
      message_alert(data);
      if (data.resultInfo.type == 1) {
        setTimeout(function () {
          if (parent.chooseBed) {
            if (parent.$('#listContainer').is(':visible')) {
              parent.getPatientList();
            } else {
              parent.getSickbedMsg();
            }
            parent.closemodalwindow();
          } else if(parent.typeForm == 'hlpgb'){
            var _msg = data.resultInfo.sysdata.hspsqlinfCustom;
            parent.sub.hlpgbpatientMsg.sqlDat = $('#sql_sqlDatTim').val();
            parent.sub.hlpgbpatientMsg.sqlStaStr = $('#sqlStaCod option:selected').text();
            parent.sub.hlpgbpatientMsg.sqlStaCod = $('#sqlStaCod').val();
            parent.sub.hlpgbpatientMsg.sqlDepName = $('#emg_emgFkName').val();
            parent.sub.hlpgbpatientMsg.sqlDes = $('#emg_sqlDes').val();
            parent.sub.hlpgbpatientMsg.bedNam = $('#bedId option:selected').text();
            parent.sub.hlpgbpatientMsg.sqlSeq = _msg.sqlSeq;
            parent.sub.hlpgbpatientMsg.jbzdDes = $('#show_text').text();
            parent.closemodalwindow();
          } else if (parent.typeForm == 'jzList') {
            parent.queryTab();
            parent.closemodalwindow();
          } else {
            var _msg = data.resultInfo.sysdata.hspsqlinfCustom;
            parent.vm.patientMsg.sqlDat = $('#sql_sqlDatTim').val();
            parent.vm.patientMsg.sqlStaStr = $('#sqlStaCod option:selected').text();
            parent.vm.patientMsg.sqlStaCod = $('#sqlStaCod').val();
            parent.vm.patientMsg.sqlDepName = $('#emg_emgFkName').val();
            parent.vm.patientMsg.sqlDes = $('#emg_sqlDes').val();
            parent.vm.patientMsg.bedNam = $('#bedId option:selected').text();
            parent.vm.patientMsg.sqlSeq = _msg.sqlSeq;
            parent.vm.patientMsg.jbzdDes = $('#show_text').text();
            if (parent.getLeftPatientList) {
              parent.getLeftPatientList();
            }
            parent.closemodalwindow();
          }
        }, 2000)
      }
    }
    //新增会诊诊断
    function addPreDgnCod() {
      createmodalwindow("初步诊断", 800, 460, '${baseurl}zyyqjs/querylrNew.do?emgSeq=${hspemginfCustom.emgSeq}&&jbzdType=1&&trnumber=', 'no');
    }
    //选择科室
    function selectDep() {
      if ($("#sqlStaCod").val() != '2' &&  $("#sqlStaCod").val() != '9') {
        return false;
      }
      createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do');
    }
    $(function () {
      loadDoc();
      /*额外增加*/
      sessionStorage.setItem("isValidateFormForLqxxdj", "false");
      if ("${hspemginfCustom.cstAge}" == "") {
        $("#age").text("");
      }
    });
  </script>
</body>

</html>