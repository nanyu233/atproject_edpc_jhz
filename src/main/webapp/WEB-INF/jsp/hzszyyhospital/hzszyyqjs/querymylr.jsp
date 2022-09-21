<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>门药/门球时间录入</title>
  <%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
  <link rel="stylesheet" type="text/css" href="${baseurl}css/common/tableStyle.css">
  <link rel="stylesheet" type="text/css" href="${baseurl}css/hems/global.css">
  <script type="text/javascript" charset="utf-8">
    var _mysjDat = '${hspemginfCustom.mysjStr}',
      _mqsjDat = '${hspemginfCustom.mqsjStr}',
      _emgDat = '${hspemginfCustom.emgDatStr}';
  </script>
</head>

<body class="adddevice">
  <form class="form" id="mylrform">
    <table>
      <colgroup>
        <col width="23%" />
        <col />
      </colgroup>
      <tbody>
        <tr>
          <input type="hidden" id="HspBedInfCustom.emgSeq" name="hspemginfCustom.emgSeq" value="${hspemginfCustom.emgSeq}" />
          <th>预检时间：</th>
          <td>
            <span id="emg_date">&nbsp;${hspemginfCustom.emgDatStr}</span>
          </td>
        </tr>
        <tr>
          <th>门药时间：</th>
          <td>
            <input class="Wdate" id="mysj_date" type="text" name="hspemginfCustom.mysj" value="${ hspemginfCustom.mysjStr}"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" onchange="mysjChange()">
          </td>
        </tr>
        <tr>
          <th>门药时长：</th>
          <td>
            <input id="mysc_len" type="text" name="myscLen" readonly="readonly" style="width: 15mm"><span>分</span>
          </td>
        </tr>
        <tr>
          <th>门球时间：</th>
          <td>
            <input class="Wdate" id="mqsj_date" type="text" name="hspemginfCustom.mqsj" value="${ hspemginfCustom.mqsjStr}"
              onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" onchange="mqsjChange()">
          </td>
        </tr>
        <tr>
          <th>门球时长：</th>
          <td>
            <input id="mqsc_len" type="text" name="mqscLen" readonly="readonly" style="width: 15mm"><span>分</span>
          </td>
        </tr>
        <tr>
          <td colspan="2" class="last_td">
            <div class="center grp_btn">
              <a class="easyui-linkbutton" iconCls="icon-ok" id="submitbtn" onclick="editBed()">确定</a>
              <a class="easyui-linkbutton" iconCls="icon-cancel" id="closebtn" onclick="parent.closemodalwindow()">关闭</a>
            </div>
          </td>
        </tr>
      </tbody>
    </table>
  </form>

  <%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
  <!-- <script type="text/javascript" src="${baseurl}lib/validate/jquery.validate.js"></script> -->
  <script type="text/javascript">
    function editBed() {
      publicFun.httpServer({ url: '${baseurl}zyyqjs/querymylr_submit.do' }, { 'hspemginfCustom.mysj': $('#mysj_date').val(), 'hspemginfCustom.mqsj': $('#mqsj_date').val(), 'hspemginfCustom.emgSeq': '${hspemginfCustom.emgSeq}' }, function (data) {
        message_alert(data);
        if (data.resultInfo.type == '1') {
          setTimeout("parent.closemodalwindow()", 1000);
          parent.getSickbedMsg();
        }
      })
    }

    //门药门球时长计算
    $('#mysj_date').val(_mysjDat);
    $('#mqsj_date').val(_mqsjDat);
    $('#emg_date').val(_emgDat);

    function getMyTime() {
      var emgtime = new Date($('#emg_date').val()),
        mysjtime = new Date($('#mysj_date').val()),
        emgtimes = emgtime.getTime(),
        mysjtimes = mysjtime.getTime(),
        total = (mysjtimes - emgtimes) / 1000;
      var timewrap = parseInt(total / (60));

      return timewrap;
    }

    function getMqTime() {
      var emgtime = new Date($('#emg_date').val()),
        mqsjtime = new Date($('#mqsj_date').val()),
        emgtimes = emgtime.getTime(),
        mqsjtimes = mqsjtime.getTime(),
        total = (mqsjtimes - emgtimes) / 1000;
      var timewrap = parseInt(total / (60));
      return timewrap;
    }

    function getMyTimeWrap() {
      var _timewrap = getMyTime();
      if ($('#mysj_date').val() == '') {
        $('#mysc_len').val('');
      } else {
        $('#mysc_len').val(_timewrap);
      }
    }

    function getMqTimeWrap() {
      var _timewrap = getMqTime();
      if ($('#mqsj_date').val() == '') {
        $('#mqsc_len').val('');
      } else {
        $('#mqsc_len').val(_timewrap);
      }
    }

    function mysjChange() {
      var timewrap = getMyTime();
      if (timewrap < 0) {
        publicFun.alert('门药时间需大于预检时间');
        $('#mysj_date').val('');
      }
      if ($('#mysj_date').val() == '') {
        $('#mysc_len').val('');
      } else {
        $('#mysc_len').val(timewrap);
      }
    }

    function mqsjChange() {
      var timewrap = getMqTime();
      if (timewrap < 0) {
        publicFun.alert('门球时间需大于预检时间');
        $('#mqsj_date').val('');
      }
      if ($('#mqsj_date').val() == '') {
        $('#mqsc_len').val('');
      } else {
        $('#mqsc_len').val(timewrap);
      }
    }

    $(function () {
      if ($('#mysj_date').val() != '') {
        getMyTimeWrap();
      }
      if ($('#mqsj_date').val() != '') {
        getMqTimeWrap();
      }
    })
  </script>
</body>

</html>