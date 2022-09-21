<div id="nzz2029">
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
  <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
  <div class="tys receTp" ms-controller="nczRecord">
    <jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
    <div class="wrapperDiv">
      <input type="hidden" ms-duplex-string="sysdata.seqno">
      <table class="managetable recpTable">
        <colgroup>
          <col width="33%">
          <col width="33%">
          <col width="34%">
        </colgroup>
        <tr>
          <td  style="text-align:center">患者姓名<input type="text" class="intextinput datedate" value="${hspemginfCustom.cstNam}" /></td>
          <td  style="text-align:center">性别<input type="text" class="intextinput datedate"  value="${hspemginfCustom.cstSexCod}" /></td>
          <td  style="text-align:center">年龄<input type="text" class="intextinput" value="${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}"></td>
        </tr>
        <tr height="27">
          <td  style="text-align:center">品名</td>
          <td  style="text-align:center">交出</td>
          <td  style="text-align:center">报告未出</td>
        </tr>
        <tr height="27">
          <td  style="text-align:center">门诊病历</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
          <td  style="text-align:center"></td>
        </tr>
        <tr>
          <td  style="text-align:center">化验报告单</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
        <tr>
          <td  style="text-align:center">X片</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
        <tr>
          <td  style="text-align:center">CT片</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
        <tr>
          <td  style="text-align:center">MRI</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
        <tr>
          <td  style="text-align:center">心电图</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
        <tr>
          <td  style="text-align:center">B超报告单</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
        <tr>
          <td  style="text-align:center">脑电图报告单</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox"><input type="text" class="intextinput" >张
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">
          	</label>
          </td>
        </tr>
      </table><br/>
      
      
      
      <table class="managetable recpTable">
        <colgroup>
          <col width="33%">
          <col width="33%">
          <col width="34%">
        </colgroup>
        <tr height="27">
          <td  style="text-align:center">自备药</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">交出
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">不适用
          	</label>
          </td>
        </tr>
        <tr height="27">
          <td  style="text-align:center">留置针</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">拔除
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">保留
          	</label>
          </td>
        </tr>
        <tr height="27">
          <td  style="text-align:center">电极片</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">去除
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">保留
          	</label>
          </td>
        </tr>
        <tr height="27">
          <td  style="text-align:center">离科时间登记</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">已登记
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">未登记
          	</label>
          </td>
        </tr>
        <tr height="27">
          <td  style="text-align:center">腕带</td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">去除
          	</label>
          </td>
          <td  style="text-align:center">
          	<label class="checklabel">
            	<input type="checkbox">未去除
          	</label>
          </td>
        </tr>
      </table>
      <br/><br/><br/>
      <div>
      	<p style="float: right;">接收者:<input type="text" class="intextinputlong"/></p>
		<p style="float: right;">交出者:<input type="text" class="intextinputlong"/></p>
		<p style="float: left;">交接日期:<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 150px;" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm'})"></p>
    </div>
  </div>
</div>
<script type="text/javascript">
  var vm = avalon.define({
    $id: 'nczRecord',
  })

$('.docuTitleBaisc').html('急诊室抢救、观察病人离科交接记录单');
$('#basicTitleMsg').css("display","block");		
  
</script>