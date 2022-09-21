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
		  <table id="lineTab">
              <tr>
		          <td rowspan="32">转运前准备</td>
		          <td colspan="7" style="text-align:center;">项目内容</td>
		          <td>转送前确认</td>
	          </tr>
	          <tr>
		          <td colspan="2" style="text-align:center;">决策</td>
		          <td colspan="5">
			          <label> <input type="checkbox">医嘱确认</label>
		              <label> <input type="checkbox">知情同意书</label>
	              </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="2" rowspan="2" style="text-align:center;">沟通</td>
		          <td colspan="5">
			           <label> <input type="checkbox">医患</label>
			           <label> <input type="checkbox">电梯</label>
			           <label> <input type="checkbox">外勤人</label>
		          </td>
		          <td  rowspan="2" style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label> <input type="checkbox">目的地</label>
			          <label>（</label>
			          <label> <input type="checkbox">抵达时间</label>
			          <label> <input type="checkbox">特殊感染</label>
			          <label>）</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="2" rowspan="2" style="text-align:center;">转运人员</td>
		          <td colspan="5">
			          <label> <input type="checkbox">本科医生</label>
			          <label> <input type="checkbox">他科医生</label>
			          <label> <input type="checkbox">规培医生</label>
			          <label> <input type="checkbox">呼吸师</label>
		          </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label> <input type="checkbox">1年内护士</label>
			          <label> <input type="checkbox">1~3年护士</label>
			          <label> <input type="checkbox">3年以上护士</label>
		          </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td  rowspan="6" style="text-align:center;">病情</td>
		          <td  rowspan="3" style="text-align:center;width:8%;">气道A</td>
	         	  <td colspan="5">
			          <label> 人工气道:</label>
			          <label> <input type="checkbox">有</label>
			          <label> <input type="checkbox">气管插管</label>
			          <label> <input type="checkbox">（</label>
			          <label> <input type="checkbox">经口</label>
			          <label> <input type="checkbox">经口</label>
			          <label> <input type="checkbox">）</label></br>
			          <label> <input type="checkbox">气管切开</label></br>
		          </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="5"> <label> <input type="checkbox">无</label></td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>	         
	          <tr>
		          <td colspan="5"><label> <input type="checkbox">转运前吸痰</label></td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td style="text-align:center;">呼吸B</td>
		          <td colspan="5">
			          <label>给氧方式:</label>
			          <label> <input type="checkbox">机械通气</label>
			          <label> <input type="checkbox">面罩</label>
			          <label> <input type="checkbox">鼻导管</label>
			          <label> <input type="checkbox">其它<input type="text" style="width:75px;"></label>
		          </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td style="text-align:center;">循环C</td>
		          <td colspan="5">
			          <label> <input type="checkbox">循环相对稳定</label>
			          <label> <input type="checkbox">血管活性药物</label>
			          <label> <input type="checkbox">心率失常: 类型<input type="text" style="width:75px;"></label>
		          </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td style="text-align:center;">意识D</td>
		          <td colspan="5">
			          <label> <input type="checkbox">清醒</label>
			          <label> <input type="checkbox">镇静</label>
			          <label> <input type="checkbox">嗜睡</label>
			          <label> <input type="checkbox">谵妄</label>
			          <label> <input type="checkbox">模糊</label>
			          <label> <input type="checkbox">昏迷</label>
		          </td>
		          <td style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colSpan="2" rowspan="6" style="text-align:center;">管道评估</td>
		          <td colspan="5">
			          <label> <input type="checkbox">静脉通道 <input type="text" style="width:75px;">路</label>
			          <label> <input type="checkbox">（</label>
			          <label> <input type="checkbox">深静脉</label>
			          <label> <input type="checkbox">PICC</label>
			          <label> <input type="checkbox">外周静脉</label>
			          <label> <input type="checkbox">）</label>
		          </td>
		          <td rowspan="6" style="text-align:center;"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label>通畅</label>
			          <label>（</label>
			          <label> <input type="checkbox">是</label>
			          <label> <input type="checkbox">否</label>
			          <label>）</label>
			          <label> 深度<inoput type="text">cm </label>
			          <label> <input type="checkbox">无渗出</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label><input type="checkbox">胃管；</label>
			          <label>通畅</label>
			          <label>（</label>
			          <label> <input type="checkbox">是</label>
			          <label> <input type="checkbox">否</label>
			          <label>）</label>
			          <label> 深度<inoput type="text">cm </label>
		          </td>
              </tr>
	          <tr>
		          <td colspan="5">
			          <label><input type="checkbox">导尿管；</label>
			          <label>通畅</label>
			          <label>（</label>
			          <label> <input type="checkbox">是</label>
			          <label> <input type="checkbox">否</label>
			          <label>）</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label><input type="checkbox">引流管；</label>
			          <label><input type="text" style="width:75px;">/<input type="text" style="width:75px;">/<input type="text" style="width:75px;"></label>
			          <label>通畅</label>
			          <label>（</label>
			          <label> <input type="checkbox">是</label>
			          <label> <input type="checkbox">否</label>
			          <label>）</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label>（</label>
			          <label> <input type="checkbox">深度</label>
			          <label> <input type="checkbox">外露</label>
			          <label><input type="text" style="width:75px;">/<input type="text" style="width:75px;">/<input type="text" style="width:75px;">cm</label>
			          <label>）</label>
			          <label> <input type="checkbox">其它 <input type="text" style="width:75px;"></label>
		          </td>
	          </tr>
	          <tr>
		          <td rowspan="10">转运携带设备</td>
		          <td rowspan="6" style="text-align:center;">必备</td>
		          <td colspan="5">
			           <label>监护设备：</label>
			           <label> <input type="checkbox">监护仪</label>
			           <label>功能： <input type="checkbox">完好</label>
			           <label>电量： <input type="checkbox">充足</label>
		          </td>
		          <td rowspan="6" style="text-align:center;"> <input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label>供氧设备：</label>
			          <label> <input type="checkbox">氧气筒</label>
			          <label>压力： <input type="text" style="width:75px;"></label>
			          <label>（</label>
			          <label> <input type="checkbox">MPa</label>
			          <label> <input type="checkbox">PSI</label>
			          <label>）</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
		       	  	  <label> <input type="checkbox">氧气枕<input type="text" >个</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label> <input type="checkbox">简易呼吸囊性能</label>
			          <label> <input type="checkbox">完好</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label> <input type="checkbox">便携式抢救箱</label>
			          <label> <input type="checkbox">完好</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <label> <input type="checkbox">转运床性能</label>
			          <label> <input type="checkbox">完好</label>
		          </td>
	          </tr>
	          <tr>
		          <td rowspan="4" style="text-align:center;">选备</td>
		          <td colspan="5">
			          <abel> <input type="checkbox">转运床性能</label>
			          <label>功能： <input type="checkbox">完好</label>
			          <label>电量： <input type="checkbox">充足</label>
		          </td>
		          <td rowspan="4" style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <abel> <input type="checkbox">转送呼吸机</label>
			          <label>功能： <input type="checkbox">完好</label>
			          <label>电量： <input type="checkbox">充足</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <abel> <input type="checkbox">微泵</label>
			          <label>功能： <input type="checkbox">完好</label>
			          <label>电量： <input type="checkbox">充足</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="5">
			          <abel> <input type="checkbox">除颤仪</label>
			          <label>功能： <input type="checkbox">完好</label>
			          <label>电量： <input type="checkbox">充足</label>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="2" style="text-align:center;">运转携带</td>
		          <td colspan="5">
			          <label>静脉补液</label>
			          <label> <input type="checkbox">无</label>
			          <label> <input type="checkbox">足够（含VD;IV等）</label>
			          <label> <input type="checkbox">其它 <input type="text" style="width:75px;"></label>
		          </td>
		          <td rowspan="3" style="text-align:center;"><input type="checkbox"></td>
	          </tr>
	          <tr>
	       		  <td colspan="2" style="text-align:center;">药品</td>
		          <td colspan="5">
			          <label>微泵1</label>
			          <label>药物 <input type="text" style="width:75px;"></label>
			          <label>总量 <input type="text" style="width:75px;">ml</label>
			          <label>走速<input type="text"  style="width:75px;">ml/h</label>
			          <label> <input type="checkbox">标记清楚</label>
		          </td>
	          </tr>
	          <tr>
	         	  <td colspan="2"></td>
		          <td colspan="5">
			          <label>微泵2</label>
			          <label>药物 <input type="text" style="width:75px;"></label>
			          <label>总量 <input type="text" style="width:75px;">ml</label>
			          <label>走速<input type="text" style="width:75px;">ml/h</label>
			          <label> <input type="checkbox">标记清楚</label>
		          </td>
	          </tr>
	           <tr>
		           <td colspan="2" style="text-align:center;">医疗文件</td>
		           <td colspan="5">
			           <label> <input type="checkbox">病历</label>
			           <label> <input type="checkbox">X线片</label>
			           <label> <input type="checkbox">CT</label>
			           <label> <input type="checkbox">MRI</label>
			           <label> <input type="checkbox">其它 <input type="text" style="width:75px;"></label>
		           </td>
		           <td style="text-align:center;"><input type="checkbox"></td>
	           </tr>
	           <tr>
		           <td rowspan="3"  style="text-align:center;">生命体征</td>
		           <td colspan="2"  style="text-align:center;">时间</td>
		           <td style="text-align:center;width:8%;">HR<br/>(次/分)</td>
		           <td style="text-align:center;width:8%;">NBP/ABP<br/>(mmhg)</td>
		           <td style="text-align:center;width:8%;">RR<br/>(次/分)</td>
		           <td style="text-align:center;width:8%;">SPO2<br/>(%)</td>
		           <td colspan="2" style="text-align:center;">病情及处理</td>
	           </tr>
	           <tr>
		           <td colspan="2" style="text-align:center;">开始</td>
		           <td></td>
		           <td></td>
		           <td></td>
		           <td></td>
		           <td colspan="2"></td>
	           </tr>
	           <tr>
		           <td colspan="2" style="text-align:center;">结束</td>
		           <td></td>
		           <td></td>
		           <td></td>
		           <td></td>
		           <td colspan="2"></td>
	           </tr> 
	           <tr>
	           <td colspan="2" style="text-align:center;">结束</td>
		           <td colspan="7">
			           <label>1.气道：</label>
			           <label> <input type="checkbox">同前</label>
			           <label> <input type="checkbox">吸痰</label>
			           <label> <input type="checkbox">变化<input type="text" style="width:75px;"></label>
			           <label>2.呼吸：</label>
			           <label> <input type="checkbox">同前</label>
			           <label> <input type="checkbox">变化<input type="text" style="width:75px;"></label>
		           </td>
	           </tr>
	           <tr>
	           <td colspan="2" style="text-align:center;">评估</td>
		           <td colspan="7">
			           <label>3.循环：</label>
			           <label> <input type="checkbox">基本稳定</label>
			           <label> <input type="checkbox">血管活性药物调整</label>
			           <label> <input type="checkbox">变化<input type="text" style="width:75px;"></label>
		           </td>
	           </tr>
	           <tr>
	           <td colspan="2"></td>
		           <td colspan="7">
			           <label>4.意识：</label>
			           <label> <input type="checkbox">同前</label>
			           <label> <input type="checkbox">意识障碍加深</label>
			           <label>瞳孔： 左<input type="text" style="width:75px;">mm  右<input type="text" style="width:75px;">mm</label>
			           <label>反光射：<input type="checkbox">灵敏  <input type="checkbox">迟钝</label>
		           </td>
	           </tr>
	             <tr>
	               <td colspan="2"></td>
		           <td colspan="7">
		        	   <label>5.其他：<input type="text" style="width:75px;"></label>
		           </td>
	           </tr>
	           <tr>
		           <td colspan="9">
			           <label>转运过程中发生的事件（请于转科完成后填写）<input type="text" style="width:75px;"></label>
			           <label> <input type="checkbox">无</label>
		           </td>
	           </tr>
              <tr>
	              <td colspan="9">
		               <label> <input type="checkbox">有</label>
		               <label>（</label>
		               <label> <input type="checkbox">呼吸停止</label>
		               <label> <input type="checkbox">心跳停止</label>
		               <label> <input type="checkbox">恶性心律失常</label>
		               <label> <input type="checkbox">坠床</label>
		               <label> <input type="checkbox">氧气不足</label>
		               <label> <input type="checkbox">电池不足</label>
		               <label> <input type="checkbox">动静脉导管滑脱</label>
	              </td>
              </tr>
              <tr>
	              <td colspan="9">
		               <label> <input type="checkbox">设备故障</label>
		               <label> <input type="checkbox">气切套管滑脱</label>
		               <label> <input type="checkbox">气管插管滑脱</label>
		               <label> <input type="checkbox">其他管路滑脱<input type="text" style="width:75px;"></label>
		               <label> <input type="checkbox">其它</label>
		               <label><input type="text" style="width:75px;"> ）</label>
	              </td>
              </tr>         
              <tr>
	              <td colspan="9">
		               <label>当面告知特殊感染签名 <input type="text" style="width:75px;"></label>
		               <label>转运人员签名 <input type="text" style="width:75px;">/ <input type="text" style="width:75px;"></label>
	              </td>
              </tr>
	          </table>
	          <label style="padding-top:-20px;">备注：由口内打勾以示执行或所在单位</label>
		</div>
		
   </div>		