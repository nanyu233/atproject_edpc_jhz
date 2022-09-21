<div id="nzz2029">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <div class="tys receTp" ms-controller="nczRecord">
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
    <div class="wrapperDiv">
      <input type="hidden" ms-duplex-string="sysdata.seqno">
      <%-- <ul class="maintext">
        <li>
          <label>姓名:</label>
          <input type="text" class="intextinput datedate" style="width: 140px;" value="${hspemginfCustom.cstNam}" />
          <label>病历号:</label>
          <input type="text" class="intextinputlong" value="${hspemginfCustom.mpi}">
          <label>性别:</label>
          <label class="checklabel">
            <input type="checkbox" id="male" name="sexCod">男
          </label>
          <label class="checklabel">
            <input type="checkbox" id="female" name="sexCod">女
          </label> 
          <label>年龄:</label>
          <input type="text" class="intextinput" value="${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}">
          <label>日期:</label>
          <input class="Wdate noClickWdate" type="text" id="time1" onclick="setTimeFormat('yyyy/MM/dd', 'time1')" readonly unselectable='on'>
        </li>
      </ul> --%>
      <table class="managetable recpTable">
        <tr>
          <th>确认时间</th>
          <td colspan="1" style="text-align:center">姓名<input type="text" class="intextinput datedate" style="width: 80px;" value="${hspemginfCustom.cstNam}" /></td>
          <td colspan="1" style="text-align:center">性别<label class="checklabel">
            <input type="checkbox" id="male" name="sexCod">男
          </label>
          <label class="checklabel">
            <input type="checkbox" id="female" name="sexCod">女
          </label> </td>
          <td colspan="1" style="text-align:center">年龄<input type="text" class="intextinput" value="${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}"></td>
          <td colspan="2" style="text-align:center">日期<input class="Wdate dayWdate" ms-duplex-string="sysdata.tzwqzygDat" id="" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', '')" readonly unselectable='on'></td>
          <th>备注</th>
        </tr>
        <tr>
          <td rowspan="2">
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.ryDat" id="ryDat" type="text" onclick="setTimeFormatLimit('ryDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label><i class="red">*</i>入院，确认神经缺损症状表现:</label>
            <label ms-repeat="systemList.qrsjqszzbxList" ms-attr-for="qrsjqszzbx{{el.infocode}}" class="checklabel">
              <input ms-attr-id="qrsjqszzbx{{el.infocode}}" name="qrsjqszzbxCheck" type="checkbox" ms-attr-checked="el.checked">{{el.info}}
            </label>
            <input type="hidden" ms-duplex-string="sysdata.qrsjqszzbx" id="qrsjqszzbx">
          </td>
          <td>
            <input type="text" class="intextinputlong">
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label><i class="red">*</i>确认发病时间:</label>
            <label ms-repeat="systemList.qrfbsjCodList" ms-attr-for="qrfbsjCod{{el.infocode}}" class="checklabel">
              <input ms-attr-id="qrfbsjCod{{el.infocode}}" name="qrfbsjCodCheck" type="checkbox" ms-attr-checked="el.checked" ms-click="setRadio('qrfbsjCod',$index)">{{el.info}}
            </label>
            <input type="hidden" ms-duplex-string="sysdata.qrfbsjCod" id="qrfbsjCod">
            <input type="text" class="intextinput" ms-duplex-string="sysdata.qrfbsjQt" id="qrfbsjQt">小时
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td rowspan="7">
            <input class="Wdate dayWdate" id="qdrslcDat" ms-duplex-string="sysdata.qdrslcDat" id="qdrslcDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'qdrslcDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>启动溶栓流程:</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">将溶栓流程核查表交于抢救室责任护士
            </label>
            <label class="checklabel">
              <input type="checkbox">通知外勤转运工人（电话：7065）
            </label>
            <label class="checklabel">
              <input type="checkbox">通知神经内科（电话：15381019710，短号：363039）
            </label> 
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label>医嘱及护理:</label>
          </td>
          <td>
            <input type="text" class="intextinputlong">
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">监护，吸氧
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">血常规+CRP
            </label>
            <label class="checklabel">
              <input type="checkbox">血生化+cTNI
            </label>
            <label class="checklabel">
              <input type="checkbox">凝血功能+D2
            </label>
            <label class="checklabel">
              <input type="checkbox">术前四项
            </label>
            <label class="checklabel">
              <input type="checkbox">！ 快速血糖
            </label>
            <input type="text" class="intextinput" >mmol/L
            <!-- <label class="checklabel">
              <input type="checkbox">在病人左上肢用20号红色留置针建立静脉通路，采血结束后10ml生理盐水快速冲管封管
            </label> -->
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">头颅CTA，
            </label>
            <label class="checklabel">
              <input type="checkbox">同时将头颅CTA导引单交给外勤送放射科	
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">责任护士打印病人基本信息标贴及加急标识红圆圈，
            </label>
            <label class="checklabel">
              <input type="checkbox">在病人左上肢用20号红色留置针建立静脉通路，采血结束后10ml生理盐水快速冲管封管
            </label>
            <label class="checklabel">
              <input type="checkbox">完成实验室血标本采集后送检
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        
        <tr>
          <td class="indentTd"></td>
          <td class="indentTd" colspan="5">
            <label>完成各项告知:</label>
            <label class="checklabel">
              <input type="checkbox">碘剂同意书（CTA检查前必须完成）
            </label>
            <label class="checklabel">
              <input type="checkbox">授权书
            </label>
            <label class="checklabel">
              <input type="checkbox">病危病重告知书
            </label>
            <label class="checklabel">
              <input type="checkbox">危重病人转运通知书
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.sjnkrsxzddDat" id="sjnkrsxzddDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'sjnkrsxzddDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>神经内科溶栓小组到达时间</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.wqddDat" id="wqddDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'wqddDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>外勤到达时间</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.wcffDat" id="wcffDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'wcffDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>完成付费时间</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td rowspan="3">
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.sctajcDat" id="sctajcDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'sctajcDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>送CTA检查:</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label>检查前确认:</label>
            <label class="checklabel">
              <input type="checkbox">生命体征稳定
            </label>
            <label class="checklabel">
              <input type="checkbox">检查单
            </label>
            <label class="checklabel">
              <input type="checkbox">碘剂同意单
            </label>
            <label class="checklabel">
              <input type="checkbox">发票
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label>选择性携带:</label>
            <label class="checklabel">
              <input type="checkbox">氧气
            </label>
            <label class="checklabel">
              <input type="checkbox">转运宝
            </label>
            <label class="checklabel">
              <input type="checkbox">冲管盐水
            </label>
            <label class="checklabel">
              <input type="checkbox">吸引器
            </label>
            <label class="checklabel">
              <input type="checkbox">除颤仪
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" type="text" ms-duplex-string="sysdata.fhqjsDat" id="fhqjsDat" onclick="setTimeFormatLimit('fhqjsDat', this)" readonly unselectable='on' ms-duplex-string="sysdata.fhqjsDat">
          </td>
          <td class="indentTd" colspan="5">
            <label>返回抢救室时间</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.xdtDat" id="xdtDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'xdtDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">心电图
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.sjnkrstyqzqrDat" id="sjnkrstyqzqrDat" type="text" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'sjnkrstyqzqrDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>神经内科溶栓同意签字确认</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" rowspan="2"></td>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">完成药物处方开具：爱通立，护胃，补液，改善微循环
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label>NS 50ml+爱通立针50mg,药物计算公式：体重（Kg)* 0.09ml静推（1分钟），体重（Kg)*0.81ml泵入（1小时）。（供参考）</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.rsywkssyDat" type="text" id="rsywkssyDat" onclick="setTimeFormatLimit('rsywkssyDat', this)" readonly unselectable='on' ms-duplex-string="sysdata.rsywkssyDat">
          </td>
          <td class="indentTd" colspan="5">
            <label>溶栓药物开始使用时间</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.rsywjssyDat" type="text" id="rsywjssyDat" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'rsywjssyDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>溶栓药物结束使用时间</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.fctlctDat" type="text" id="fctlctDat" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'fctlctDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>复查头颅CT</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" rowspan="3"></td>
          <td class="indentTd" colspan="5">
            <label class="checklabel">
              <input type="checkbox">开具住院单，协助办理住院
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label>协助家属付费/绿色通道计费</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td class="indentTd" colspan="5">
            <label>准备转运:</label>
            <label class="checklabel">
              <input type="checkbox">生命体征稳定
            </label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
        <tr>
          <td>
            <input class="Wdate dayWdate" ms-duplex-string="sysdata.szryDat" type="text" id="szryDat" onclick="setTimeFormat('yyyy/MM/dd HH:mm', 'szryDat')" readonly unselectable='on'>
          </td>
          <td class="indentTd" colspan="5">
            <label>收住入院</label>
          </td>
          <td>
            <input type="text" class="intextinputlong" >
          </td>
        </tr>
      </table>
      <div class="extraDiv">
        <i class="red">*</i>入院至完成颅脑CTA返回急诊总用时：<input ms-duplex-string="sysdata.ryzwclnctafhjzzys" id="ryzwclnctafhjzzys" type="text" id="ctaTime" class="intextinput" >分钟<br/>
        <i class="red">*</i>入院至溶栓药物开始使用总用时：<input type="text" ms-duplex-string="sysdata.ryzrsywkssyzys" id="ryzrsywkssyzys" id="rsTime" class="intextinput" >分钟
      </div>
      <div class="extraDiv">
        <p style="float: right;"><i class="red">*</i>填表人员：<input type="text" ms-duplex-string="sysdata.crtusrname" id="crtusrname" class="intextinputlong" ></p>
          <div class="crtList" id="crtuserList"></div>
      </div>
      <div class="indentTd">
      	<p style="float: left;"><label><i class="red">注：</i>2018.08.08因放射科要求做静脉通路的管理修改</label></p>
      </div>
    </div>
  </div>
</div>
<script type="text/javascript">
  var vm = avalon.define({
    $id: 'nczRecord',
    systemList:{
      qrsjqszzbxList:[{infocode:'1',info:'肢体',checked:false},{infocode:'2',info:'言语',checked:false},{infocode:'3',info:'意识',checked:false}],
      qrfbsjCodList:[{infocode:'1',info:'≤3小时',checked:false},{infocode:'2',info:'>3小时',checked:false}],
    },
    sysdata:{
      ryDat:'',
      fhqjsDat:'',
      rsywkssyDat:'',

      qdrslcDat:'',
      yzjhlDat:'',
      tzwqzygDat:'',
      sjnkrsxzddDat:'',
      wqddDat:'',
      wcffDat:'',
      wcsysxbbcjhsjDat:'',
      sctajcDat:'',
      xdtDat:'',
      sjnkrstyqzqrDat:'',
      rsywjssyDat:'',
      fctlctDat:'',
      szryDat:'',
      ryzwclnctafhjzzys:'',
      ryzrsywkssyzys:'',
      crtusrname:"${sessionScope.activeUser.usrname}",

      qrsjqszzbx:'',
      qrfbsjCod:'',
      qrfbsjQt:'',
    },
    hideMsg:{
      qrsjqszzbx:[]
    },
    setRadio: function (obj, idx) {
			vm.sysdata[obj] = publicFun.radioClicks(vm.systemList[obj + 'List'],vm.sysdata[obj],idx)
    }
  })

  // function checkAb() {
  //   var lose = '';
  //   var arr = ['qrsjqszzbx', 'qrfbsjCod', 'ryzwclnctafhjzzys', 'ryzrsywkssyzys', 'crtusrname'];
  //   $.each(arr, function (idx, val) {
  //     if ($('#'+val).val() == '') {
  //       lose = val;
  //       return false
  //     }
  //   })
  //   return lose;
  // }

  function saveWsCom(){
    var wsdata = {
      hspNczrslchcbInfCustom:{
        refseqno : comdata.emgSeq,
        seqno : comdata.params.seqno,
        ryDat:'',
        fhqjsDat:'',
        rsywkssyDat:'',
        qdrslcDat:'',
        yzjhlDat:'',
        tzwqzygDat:'',
        sjnkrsxzddDat:'',
        wqddDat:'',
        wcffDat:'',
        wcsysxbbcjhsjDat:'',
        sctajcDat:'',
        xdtDat:'',
        sjnkrstyqzqrDat:'',
        rsywjssyDat:'',
        fctlctDat:'',
        szryDat:'',
        ryzwclnctafhjzzys:'',
        ryzrsywkssyzys:'',
        crtusrname:'',
        qrsjqszzbx:'',
        qrfbsjCod:'',
        qrfbsjQt:''
        }
      }
      var ids = '';
      $("input[name='qrsjqszzbxCheck']:checked").each(function(i){
        ids += vm.systemList.qrsjqszzbxList[i].infocode+',';
      })
      wsdata.hspNczrslchcbInfCustom['qrsjqszzbx'] = ids.substring(0,ids.length-1);
      $('#qrsjqszzbx').val(ids)
      var idx = '';
      $("input[name='qrfbsjCodCheck']:checked").each(function(i){
        idx = vm.systemList.qrfbsjCodList[i].infocode;
        wsdata.hspNczrslchcbInfCustom['qrfbsjCod'] = idx
      })
        $('#qrfbsjCod').val(idx)
      $.each(vm.sysdata,function(key,val){
        if (wsdata.hspNczrslchcbInfCustom.hasOwnProperty(key)) {
          wsdata.hspNczrslchcbInfCustom[key] = $('#'+key).val()
        }
      })
      
      return wsdata;
    
  }

  function getTimeArea(timeA,timeB){
    var arr1 = timeB.split(" "); 
    var sdate1 = arr1[0].split('/'); 
    var arr2 = timeA.split(" "); 
    var sdate2 = arr2[0].split('/'); 
    var min1 = parseInt(timeB.slice(-2));
    var min2 = parseInt(timeA.slice(-2));
    var hour1 = parseInt(timeB.slice(11,13));
    var hour2 = parseInt(timeA.slice(11,13));
    var date1 = new Date(sdate1[0], sdate1[1]-1, sdate1[2],hour1,min1); 
    var date2 = new Date(sdate2[0], sdate2[1]-1, sdate2[2],hour2,min2); 
    var n = (date2.getTime() - date1.getTime())/60000;
    return n
  }

  function pickerChange(item,it){
    if($('#ryDat').val() != ''){
      var timeB = $('#ryDat').val();
      var timeA = item;
      if(it.id == 'fhqjsDat'){
        $('#ryzwclnctafhjzzys').val(getTimeArea(timeA,timeB))
      }else{
        $('#ryzrsywkssyzys').val(getTimeArea(timeA,timeB))
      }
    }
  }

  function pickerChangeB(item){
    if($('#fhqjsDat').val() != ''){
      var timeB = item;
      var timeA = $('#fhqjsDat').val();
      $('#ryzwclnctafhjzzys').val(getTimeArea(timeA,timeB))
    }
    if($('#rsywkssyDat').val() != ''){
      var timeB = item;
      var timeA = $('#rsywkssyDat').val();
      $('#ryzrsywkssyzys').val(getTimeArea(timeA,timeB))
    }
  }

  function singlecheck(a, thisname) {
    $(a).click(function () {
      if ($(a).attr('checked')) {
        $(thisname).removeAttr('checked');
        $(a).attr('checked', 'checked');
      }
    });
  }

  $('input[name="sexCod"]').each(function(){
    singlecheck(this,'input[name="sexCod"]');
  });

  $('input[name="qrfbsjCodCheck"]').each(function(){
    singlecheck(this,'input[name="qrfbsjCodCheck"]');
  });

	function setTimeFormat (format, id) {
    if (id != 'time1') {
      vm.sysdata[id] = publicFun.timeFormat(new Date(), format.replace(/HH/, 'hh'))
    }
		$('#' + id).val(publicFun.timeFormat(new Date(), format.replace(/HH/, 'hh')))
		WdatePicker({dateFmt: format})
	}

	function setTimeFormatLimit (id, current) {
    var _currentDay = publicFun.timeFormat(new Date(), 'yyyy/MM/dd hh:mm')
    vm.sysdata[id] = _currentDay
		$('#' + id).val(_currentDay)
    if (id === 'ryDat') {
      pickerChangeB(_currentDay);
      WdatePicker({
        dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,onpicking:function(dp){pickerChangeB(dp.cal.getNewDateStr())}
      })
    } else {
      pickerChange(_currentDay, current);
      WdatePicker({
        dateFmt:'yyyy/MM/dd HH:mm',isShowClear:false,onpicking:function(dp){pickerChange(dp.cal.getNewDateStr(),current)}
      })
    }
	}

  $(function(){
    var _sex = '${hspemginfCustom.cstSexCod}';
    if(_sex == '男'){
      $('input[name = "sexCod"][id="male"]').attr('checked',true);
      $('input[name = "sexCod"][id="female"]').attr('checked',false)
    }else if(_sex == '女'){
      $('input[name = "sexCod"][id="female"]').attr('checked',true);
      $('input[name = "sexCod"][id="male"]').attr('checked',false)
    }
  })
</script>