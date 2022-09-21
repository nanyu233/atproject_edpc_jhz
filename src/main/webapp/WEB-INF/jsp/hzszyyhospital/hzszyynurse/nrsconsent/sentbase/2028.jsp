<div id="ws2027">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <div class="tys receTp">
    <!-- <p class="hospitalname">${hospitalPlatformNameGap}</p>  -->
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
    <div class="basicDiv zdDiv">
      <label>科室：${hspemginfCustom.emgFkCod}</label>
      <label>床号：${hspemginfCustom.emgBed}</label>
      <label>姓名：${hspemginfCustom.cstNam}</label>
      <label>病历号：${hspemginfCustom.mpi}</label>
      <label>诊断：
        <input type="text" class="tableInput zdInput" value="${hspemginfCustom.jbzdDes}"/>
      </label>
    </div>
    <div class="cleanAll"></div>
    <div class="wrapperDiv">
      <table class="managetable recpTable">
        <colgroup>
          <col width="5%">
          <col width="10%">
          <col width="10%">
          <col width="14%">
          <col width="9%">
          <col width="9%">
          <col width="5%">
          <col width="9%">
          <col width="9%">
          <col width="20%">
        </colgroup>
        <tr>
          <td rowspan="13" class="tleTd bolderfont">
            <span class="titlespan">转<br />运<br />前<br />记<br />录</span>
          </td>
          <td class="tleTd bolderfont" colspan="8">
            <label>准备项目</label>
          </td>
          <td class="tleTd bolderfont">
            <label>转运前确定</label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>通知收治病房／辅助检查科室患者抵达时间及患者病情，准备急救设备</label>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <div class="marginVal">
              <label>气管导管：</label>
              <label class="checklabel">
                <input type="checkbox" name="skinVal">口插管
              </label>
              <input type="text" class="intextinputshort">cm；
              <label class="checklabel">
                <input type="checkbox" name="skinVal">鼻插管
              </label>
              <input type="text" class="intextinputshort">cm；
              <label class="checklabel">
                <input type="checkbox" name="skinVal">气管切开
              </label>
            </div>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <div class="marginVal">
              <label>吸氧方式：</label>
              <label class="checklabel">
                <input type="checkbox">机械通气；
              </label>
              <label class="checklabel">
                <input type="checkbox">面罩；
              </label>
              <label class="checklabel">
                <input type="checkbox">鼻塞；
              </label>
              <label class="checklabel">
                <input type="checkbox">其他：
              </label>
              <input type="text" class="smallInput tableInput">
            </div>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>氧气瓶检查存量充足，余氧量
              <input type="text" class="intextinputshort">Mpa；
            </label>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>监护仪功能正常</label>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>管路通畅：</label>
            <label class="checklabel">
              <input type="checkbox">静脉管路；
            </label>
            <label class="checklabel">
              <input type="checkbox">动脉管路；
            </label>
            <label class="checklabel">
              <input type="checkbox">导尿管；
            </label>
            <label class="checklabel">
              <input type="checkbox">引流管；
            </label>
            <br/>
            <input type="checkbox">其他：
            <input type="text" class="opmedicineinput tableInput" maxlength="200">
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <div class="divwrapper">
              <div class="middleDiv" id="medicineDiv">
                <label class="checklabel">
                  <input type="checkbox">胸腔闭式引流管夹闭；
                </label>
                <label class="checklabel">
                  <input type="checkbox">脑室引流管夹闭；
                </label>
              </div>
              <div>
                其他：
                <input type="text" class="opmedicineinput tableInput" maxlength="200">
              </div>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>微泵电量充足</label>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>静脉输液量充足</label>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>药物注射有标签且速度正常：</label>
            <br />
            <div class="divwrapper">
              <div class="middleDiv" id="medicineDiv">
                微泵 1: <span>药物 <input type="text" class="wbInput tableInput" maxlength="150"></span>
                <span class="extralab"> 总量 <input type="text" class="smallInput tableInput" maxlength="4" onkeyup="exchangetonum(this)">
                  ml</span>
                <span class="extralab"> 走速 <input type="text" class="smallInput tableInput" maxlength="6">ml/h</span>
              </div>
              <div>
                微泵 2: <span>药物 <input type="text" class="wbInput tableInput" maxlength="150"></span>
                <span class="extralab"> 总量 <input type="text" class="smallInput tableInput" maxlength="4" onkeyup="exchangetonum(this)">
                  ml</span>
                <span class="extralab"> 走速 <input type="text" class="smallInput tableInput" maxlength="6"> ml/h</span>
              </div>
            </div>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>床栏功能正常并拉上</label>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="8">
            <label>辅助检查医疗文件：</label>
            <br />
            <div class="divwrapper">
              <div class="middleDiv" id="medicineDiv">
                <label class="checklabel">
                  <input type="checkbox">病历
                </label>
                <label class="checklabel">
                  <input type="checkbox">护理记录
                </label>
                <label class="checklabel">
                  <input type="checkbox">X光片
                </label>
                <input type="text" class="intextinputshort">张
                <label class="checklabel">
                  <input type="checkbox">CT片
                </label>
                <input type="text" class="intextinputshort">张
                <label class="checklabel">
                  <input type="checkbox">MRI
                </label>
                <input type="text" class="intextinputshort">张
              </div>
              <div>
                其他：
                <input type="text" class="opmedicineinput tableInput" maxlength="200">
              </div>
            </div>
          </td>
          <td class="indentTd">
            <label class="checklabel">
              <input type="checkbox">完成
            </label>
            <label class="checklabel">
              <input type="checkbox">不适用
            </label>
          </td>
        </tr>
        <tr>
          <td rowspan="5" class="tleTd bolderfont">
            <span class="titlespan">转<br />运<br />中<br />记<br />录</span>
          </td>
          <td class="indentTd"><label>时间</label></td>
          <td class="indentTd"><label>HR 次/分</label></td>
          <td class="indentTd"><label>NBP/ABP mmHg</label></td>
          <td class="indentTd"><label>RR 次/分</label></td>
          <td class="indentTd"><label>SpO2 %</label></td>
          <td colspan="4" class="indentTd"><label>病情及处理</label></td>
        </tr>
        <tr>
          <td class="indentTd">
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly
              unselectable='on'>
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">/<input
              type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td colspan="4" class="indentTd">
            <input type="text" class="bqgcintext tableInput" maxlength="50">
          </td>
        </tr>
        <tr>
          <td class="indentTd">
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly
              unselectable='on'>
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">/<input
              type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td colspan="4" class="indentTd">
            <input type="text" class="bqgcintext tableInput" maxlength="50">
          </td>
        </tr>
        <tr>
          <td class="indentTd">
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly
              unselectable='on'>
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">/<input
              type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td colspan="4" class="indentTd">
            <input type="text" class="bqgcintext tableInput" maxlength="50">
          </td>
        </tr>
        <tr>
          <td class="indentTd">
            <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm:ss'})" readonly
              unselectable='on'>
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">/<input
              type="text" class="intextinputshort tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td class="indentTd">
            <input type="text" class="smallInput tableInput" onkeyup="exchangetonum(this)" maxlength="4">
          </td>
          <td colspan="4" class="indentTd">
            <input type="text" class="bqgcintext tableInput" maxlength="50">
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="10">
            <ul class="ulwrapper">
              <li>转运过程中发生的问题(请于转运完成填写)：</li>
              <li>
                <label class="checklabel">
                  <input type="checkbox" onclick="radioCheck(this,'radioNo','subradio')" value="no" class="radioNo"
                    name="radioNo">无
                </label>
                <label class="checklabel">
                  <input type="checkbox" onclick="radioCheck(this,'radioNo','subradio')" value="yes" class="radioNo radioNoLast">有：
                </label>
              </li>
              <li>
                <label class="checklabel">
                  <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">呼吸停止
                </label>
                <label class="checklabel">
                  <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">心跳停止
                </label>
                <label class="checklabel">
                  <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">跌倒/坠床
                </label>
                <label class="checklabel">
                  <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">气管插管滑脱
                </label>
                <label class="checklabel">
                  <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio">其他管路滑落
                </label>
              </li>
              <li>
                <label class="checklabel">
                  <input type="checkbox" onclick="subCheck(this,'radioNo')" class="subradio subradioLast" value="lastOne">其他：
                  <input type="text" class="opmedicineinput tableInput" maxlength="200">
                </label>
              </li>
            </ul>
          </td>
        </tr>
        <tr>
          <td rowspan="4" class="tleTd bolderfont">
            <span class="titlespan">入科<br />时患<br />者病<br />情</span>
          </td>
          <td class="indentTd" colspan="9">
            <label>1、生命体征：</label>
            <label>T：<input type="text" class="intextinputshort tableInput" onkeyup="exchangetonumpoint(this,'10')"> ℃</label>
            <label class="extralab">P：<input type="text" class="intextinputshort tableInput" maxlength="4" onkeyup="exchangetonum(this)">
              次/分</label>
            <label class="extralab">R：<input type="text" class="intextinputshort tableInput" maxlength="4" onkeyup="exchangetonum(this)">
              次/分</label>
            <label class="extralab">BP：<input type="text" class="intextinputshort tableInput" maxlength="4" onkeyup="exchangetonum(this)">/<input
                type="text" class="intextinputshort tableInput" maxlength="4" onkeyup="exchangetonum(this)"> mmHg</label>
            <label class="extralab">SpO2：<input type="text" class="intextinputshort tableInput" maxlength="4" onkeyup="exchangetonumpoint(this,'10')">
              %</label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="9">
            <label>2、意识状态</label>
            <span>
              <label class="checklabel">
                <input type="checkbox">清醒
              </label>
              <label class="checklabel">
                <input type="checkbox">嗜睡
              </label>
              <label class="checklabel">
                <input type="checkbox">昏睡
              </label>
              <label class="checklabel">
                <input type="checkbox">意识模糊
              </label>
              <label class="checklabel">
                <input type="checkbox">谵妄
              </label>
            </span>
            <br />
            <span style="text-indent:8mm;display:inline-block">瞳孔</span>
            <span class="marginRight">
              左<input type="text" class="smallInput tableInput" maxlength="4" onkeyup="judgeUnitShow(this)"><span class="lengthUnit">cm</span>
              右<input type="text" class="smallInput tableInput" maxlength="4" onkeyup="judgeUnitShow(this)"><span class="lengthUnit">cm</span>
            </span>
            <span>对光反应</span>
            <span>
              <label class="checklabel">
                <input type="checkbox">灵敏
              </label>
              <label class="checklabel">
                <input type="checkbox">迟钝
              </label>
              <label class="checklabel">
                <input type="checkbox">消失
              </label>
            </span>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="9">
            <label>3、皮肤情况：</label>
            <label class="checklabel">
              <input type="checkbox">完整
            </label>
            <label class="checklabel">
              <input type="checkbox">破损
            </label>
            <label class="checklabel">
              <input type="checkbox" name="skinVal" class="skinValLast" value="sublastOne">部位
              <input type="text" class="intextinputshort">
              面积<input type="text" class="intextinputshort">
            </label>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="9">
            <label>4、其他：</label>
            <input type="text" class="tableInput bqgcintext">
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="10">
            <span>日期：
              <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})" readonly
                unselectable='on'>
            </span>
            <span>时间：
              <input class="Wdate spcWdate" type="text" onclick="WdatePicker({dateFmt:'HH:mm:ss'})" readonly
                unselectable='on'>
            </span>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="10">
            <span class="spanbox relative">
              转出科室
              <input type="text" id="emg_emgFkNamea" readonly="readonly" onclick="selectDep()" unselectable='on'>
            </span>
            <span class="relative">
              护士签名
              <input type="text" class="tableInput" id="doubleuserSign" maxlength="10">
              <div class="userList Listpos" id="doubleuserList">
              </div>
            </span>
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="10">
            <span class="spanbox relative">
              转入科室：
              <input type="text" id="emg_emgFkNameb" readonly="readonly" onclick="selectAcceptDep()" unselectable='on'>
            </span>
            <span class="relative">
              护士签名：
              <input type="text" class="tableInput" id="doubleusername" maxlength="10">
              <div class="userList" id="doubleuserNameList">
              </div>
            </span>
          </td>
        </tr>
      </table>
      <div class="extraDiv">
        备注：入科时患者病情由双方共同评估，转运护士记录
      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
  function selectDep() {
    createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do?selectType=a');
  }

  function selectAcceptDep() {
    createmodalwindow("科室列表", 600, 385, '${baseurl}qjs/querydep.do?selectType=b');
  }
  
  function exchangetonum(it) {
    it.value = it.value.replace(/[^\d]/g, '');
  }
  function Toradiocheck(it, node) {
    exchangetonum(it);
    if ($(it).val() != '') {
      $("input[name=" + node + "]").attr("checked", false);
      if ($(it).parent().find('.' + node + 'Last').val() != 'lastOne') {
        $("input[name=" + node + 'Input' + "]").val('');
      }
      if ($(it).parent().find('.' + node + 'Last').val() != 'sublastOne') {
        $("input[name=" + node + 'Inputsub' + "]").val('');
      }
      $(it).parent().find('.' + node + 'Last').attr("checked", true);
    }
  }
  function radioCheck(current, items, subitems) {
    if ($(current).attr('checked')) {
      $('.' + items).attr("checked", false);
      $(current).attr('checked', true);
      if ($(current).val() == 'no') {
        $('.' + subitems).attr("checked", false);
        $("input[name=" + items + 'Input' + "]").val('');
        $("input[name=" + subitems + 'Input' + "]").val('');
      }
    } else {
      if ($(current).val() == 'yes') {
        $('.' + subitems).attr("checked", false);
        $("input[name=" + items + 'Input' + "]").val('');
        $("input[name=" + subitems + 'Input' + "]").val('');
      }
    }
  }

  function subCheck(current, items, isCheck, thisItems) {
    if ($(current).attr('checked')) {
      $('.' + items)[0].checked = false;
      $('.' + items)[1].checked = true;
      if (isCheck == 'true') {
        $('.' + thisItems).attr("checked", false);
        if ($(current).val() != 'lastOne') {
          $("input[name=" + items + 'Input' + "]").val('');
        }
      }
      $(current).attr('checked', true);
    } else {
      if ($(current).val() == 'lastOne') {
        $("input[name=" + items + 'Input' + "]").val('');
      }
    }
  }

  $(function () {
    if (!$('#time1').val()) {
      $('#time1').val(publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm:ss'));
    }
    $('#docuTitle').html('危重患者转运记录单')
  })
</script>