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
		<table>
	       <tr>
		       <td colspan="3">
		            <label>一、一般项目(请在口内打勾)</label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">1.静脉输液</span>
			         <label> <input type="checkbox">无</label>
			         <label> <input type="checkbox">有</label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">  输液通路</span>
			         <label> <input type="checkbox">外周静脉</label>
			         <label> <input type="checkbox">深静脉</label>
			         <label> <input type="checkbox">PICC</label>
			         <label> <input type="checkbox">其它</label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">  有无异常</span>
			         <label> <input type="checkbox">无</label>
			         <label> <input type="checkbox">有</label>
			         <label>（</label>
			         <label> <input type="checkbox">渗漏</label>
			         <label> <input type="checkbox">阻塞</label>
			         <label> <input type="checkbox">脱出</label>
			         <label> <input type="checkbox">其它</label>
			         <label>）</label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">2.特殊用药</span>
			         <label> <input type="checkbox">无</label>
			         <label> <input type="checkbox">有</label>
			         <label> <input type="checkbox">（请注明）</label>
			         <label> <input type="text"></label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">3.引流管道</span>
			         <label> <input type="checkbox">无</label>
			         <label> <input type="checkbox">有</label>
			         <label> <input type="checkbox">（请注明）</label>
			         <label> <input type="text"></label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">  有无异常</span>
			         <label> <input type="checkbox">无</label>
			         <label> <input type="checkbox">有</label>
			         <label>（</label>
			         <label> <input type="checkbox">渗漏</label>
			         <label> <input type="checkbox">阻塞</label>
			         <label> <input type="checkbox">脱出</label>
			         <label> <input type="checkbox">其它</label>
			         <label>）</label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">4.高危跌倒</span>
			         <label> <input type="checkbox">是</label>
			         <label> <input type="checkbox">否</label> 
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">5.高危压疮</span>
			         <label> <input type="checkbox">是</label>
			         <label> <input type="checkbox">否</label> 
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		             <span class="span">5.皮肤情况</span>
			         <label> <input type="checkbox">完整</label>
			         <label> <input type="checkbox">压疮</label> 
			         <label> <input type="checkbox">烫伤</label>
			         <label> <input type="checkbox">切口</label> 
			         <label> <input type="checkbox">其它</label>
		       </td>
	       </tr>
	       <tr>
		       <td colspan="3">
		         <label>二.随带物品及身体评估</label>
		       </td>
	       </tr>
	          <tr><td>项目</td><td style="text-align:center;">出科</td><td style="text-align:center;">入科</td></tr>
	          <tr><td>病历</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          <tr><td>x光线/CT/MRI</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          <tr><td>带入液体</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          <tr><td>意识</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          <tr><td>血压</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          <tr><td>脉搏(次/分)</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          <tr><td>呼吸(次/分)</td><td> <input type="text"></td><td><input type="text"></td></tr>
	          </table>

		
   </div>		