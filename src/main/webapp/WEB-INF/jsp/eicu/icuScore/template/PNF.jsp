<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
	    <div id="maininfo">
		    <table id="lineTab">
		       <tr>
		         <td colspan="9">
			        <label class="firstlab paddR30">姓名：<span id="custName"></span></label>
			        <label class="paddR30">住院号：<span id="liveNo"></span></label>
					<label class="paddR30">床号：<span id="bedNo"></span></label>
			        <label class="paddR30">性别：<span id="custSex"></span></label>
			        <label class="lastlab">年龄：<span id="custAge"></span></label></br>
				    <label class="firstlab">入院诊断：<span id="diagInfo"></span></label>
	              </td>
	          </tr>
	          
              <tr>
		          <td colspan="9">
			          <label><input type="checkbox">IBM(理想体重，男)=50kg+2.3*(身高cm-152)/2.54=<input type="text" class="putline" style="width: 70px;"/>(kg)</label></br>
			          <label><input type="checkbox">IBM(理想体重，女)=45.5kg+2.3*(身高cm-152)/2.54=<input type="text" class="putline" style="width: 70px;"/>(kg)</label></br>
			          <label><input type="checkbox">ABM(调节体重)= IBM+0.4*(实际体重-IBM)=<input type="text" class="putline" style="width: 70px;"/>(kg)(实际体重与理想体重相差25%以上时选用)</label>
		          </td>
	          </tr>
	          
	          <tr>
		          <td colspan="9">
			          <label>实际体重;<input type="text" class="putline" style="width: 70px;"/>kg</label>
			          <label>IBM:<input type="text" class="putline" style="width: 70px;"/>kg/m2</label>
			          <label>营养风险筛选：NRS2002 =<input type="text" class="putline" style="width: 70px;"/>分</label>
		          </td>
	          </tr>
	          
	          <tr>
		          <td colspan="9">
		             <span class="span">适应症</span><label><input type="checkbox">急性胃肠损伤(AGI分级) Ⅱ-Ⅲ级</label></br>
			         <div style="display: inline-block;visibility: hidden;">适应症</div><label><input type="checkbox">由于手术或解剖问题胃肠道禁止使用的重症病人</label></br>
			         <div style="display: inline-block;visibility: hidden;">适应症</div><label><input type="checkbox">存在尚未控制的腹部情况，如腹腔感染、肠梗阻、肠瘘等</label></br>
		          </td>
	          </tr>
	           
	           <tr>
		          <td colspan="9">
		             <span class="span">目标热卡</span>
			         <label>(<input type="checkbox">急性期20-25kcal/kg/d</label>
			         <label><input type="checkbox">稳定期30-35kcal/ kg/d)</label>
			         <label>= <input type="text" class="putline" style="width: 70px;"/>kcal</label>
		          </td>
	           </tr>
	           
	           <tr>
		           <td colspan="9">
		             <span class="span">蛋白质(1.2-2.2-2.5g/ kg/d)=</span>
			         <label><input type="text" class="putline" style="width: 70px;"/>g</label>
		           </td>
	          </tr>
	          
	           <tr>
		           <td colspan="9">
		             <span class="span">肠外营养途径;</span>
			         <label> <input type="checkbox">中心静脉</label>
			         <label> <input type="checkbox">外周静脉</label>
			         <label> <input type="checkbox">PICC</label>
			         <label> <input type="checkbox">使用输液泵</label>
			         <label> <input type="checkbox">管尖摄片、位置<input type="text" class="putline" style="width:70px"></label>
		          </td>
	          </tr>
	          
              <tr>
		          <td colspan="2">日期</td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
		          <td><input class="Wdate spcWdate" type="text" id="gradeTimeStr"
                  		onclick="WdatePicker({dateFmt:'HH:mm'})" autocomplete="off" style="width: 70px"></td>
	          </tr>
	          <tr>
		          <td rowspan="2">每日肠外<br/>营养总量<br/>(kcal)</td>
		          <td>目标</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>实际</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	         
	          <tr>
		          <td rowspan="10">配方组成</td>
		          <td>葡萄糖（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	      
	          <tr>
		          <td>氨基酸（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>脂肪乳（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>维生素（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>微量元素（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>10%KCl（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	           <tr>
		          <td>10%NaCl（ml）</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	           <tr>
		          <td>RI</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	           <tr>
		          <td>其他</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	          <tr>
		          <td>复方制剂</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	           <tr>
		          <td colspan="2">不良反应</td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
		          <td><input type="text" class="putline" style="width:70px"></td>
	          </tr>
	           <tr>
		          <td colspan="2">护士签名</td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
		          <td>
			        <input placeholder="回车查询" class="userInput putline" type="text" style="width:70px;"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
		          </td>
	          </tr>
	          <tr>
		          <td colspan="9">
		          	<div class="trunright">
						<label class="firstlab">医师签名：</label>
				        <input placeholder="回车查询" class="userInput putline" type="text" id="doct"/>
						<div class="signImgBox" style="display:none">
							<img src="javascript:;" title="" class="signPic">
						</div>
		          	</div>
		          </td>
		      </tr>
		    </table>
	    </div>
	</div>
