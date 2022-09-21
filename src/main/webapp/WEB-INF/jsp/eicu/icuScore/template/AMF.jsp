<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
		<div class="basicDiv">
			<label class="firstlab paddR30">床号：<span id="bedNo"></span></label>
	        <label class="paddR30">姓名：<span id="custName"></span></label>
	        <label class="paddR30">性别：<span id="custSex"></span></label>
	        <label class="paddR30">年龄：<span id="custAge"></span></label>
	        <label class="lastlab">住院号：<span id="liveNo"></span></label>
		</div>
		<div id="maininfo">
		    <table id="lineTab" style="margin-botton:0px;cellpadding:0px;cellspacing:0px;">
	          <tr>
		          <td rowspan="2"  colspan="2" style="width:16%;text-align:center;"><label>日期</label></td>
		          <td rowspan="2" style="width:8%;text-align:center;"><label>人工气道</label></td>
		          <td rowspan="2" style="width:8%;text-align:center;"><label>距离门齿</label></td>
		          <td rowspan="2" style="width:8%;text-align:center;"><label>气囊压</label></td>
		          <td style="width:8%;text-align:center;"><label>加温</label></td>
		          <td colspan="2" style="width:16%;text-align:center;"><label>声门下吸引</label></td>
		          <td rowspan="2"  style="width:8%;text-align:center;"><label>痰液颜色</label></td>
		          <td style="width:8%;text-align:center;"><label>痰液量</label></td>
		          <td style="width:8%;text-align:center;"><label>粘稠度</label></td>
		          <td style="width:10%;text-align:center;"><label>咳嗽反应</label></td>
	          </tr>
	          <tr>
		          <td style="width:8%;text-align:center;"><label>挡位</label></td>
		          <td style="width:8%;text-align:center;"><label>压力</label></td>
		          <td style="width:8%;text-align:center;"><label>通畅</label></td>
		          <td style="width:8%;text-align:center;"><label>多 中 少</label></td>
		          <td style="width:8%;text-align:center;"><label>Ⅰ Ⅱ Ⅲ</label></td>
		          <td style="width:10%;text-align:center;"><label>强 中 弱 无</label></td>
	          </tr>
	          <tr>
		          <td rowspan="4"><label></label></td><td><label>08:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>12:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>16:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>20:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td rowspan="4"><label></label></td><td><label>08:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>12:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>16:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>20:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td rowspan="4"><label></label></td><td><label>08:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>12:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>16:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>20:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td rowspan="4"><label></label></td><td><label>08:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>12:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>16:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>20:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td rowspan="4"><label></label></td><td><label>08:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>12:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>16:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>20:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td rowspan="4"><label></label></td><td><label>08:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>12:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>16:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td><label>20:00</label></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> </td>
		          <td style="text-align:center;"><input type="checkbox"> <input type="checkbox"> <input type="checkbox"> <input type="checkbox"></td>
	          </tr>
	          <tr>
	          <td><label>备注</label></td>
	          <td colspan="11"></td>
	          </tr>
	          </table>
	          <table style=" margin-top:-20px;">
	          <tr>
		          <td ><label>氧气指数</label></td>
		          <td colspan="2"><label>1 DAY</label></td>
		          <td colspan="2"><label>2 DAY</label></td>
		          <td colspan="2"><label>3 DAY</label></td>
		          <td colspan="2"><label>4 DAY</label></td>
		          <td colspan="2"><label>5 DAY</label></td>
		          <td colspan="2"><label>6 DAY</label></td>
		          <td colspan="2"><label>7 DAY</label></td>
	          </tr>
	          <tr>
		          <td><label>>300</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
	          <tr>
		          <td><label>300-200</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
	          <tr>
		          <td><label>200-100</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
	          <tr>
		          <td><label><100</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
	          <tr>
		          <td><label>PIP/PEE</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
	          <tr>
		          <td><label>VT</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
	          <tr>
		          <td><label>RR</label></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
		          <td></td><td></td><td></td>
	          </tr>
		    </table>
		</div>    
   </div>		