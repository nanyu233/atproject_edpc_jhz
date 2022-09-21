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
					<td rowspan="4" style="width:5%;margin:2px 20px 2px 20px;word-wrap: break-word;font-size:14px; text-align:center;" >出院病人评估单</td>
					<td >
						<label>出院日期：<input class="textlabel" type="text" ></label>
						<label>出院诊断：<input class="textlabel" type="text" ></label>
						<label>手术名称：<input class="textlabel" type="text" ></label>
					</td>
				</tr>
				<tr >
					<td>
						<span class="span">伤口情况</span>
						<label> <input type="checkbox">Ⅰ期愈合</label>
						<label> <input type="checkbox">Ⅱ期愈合</label>
						<label> <input type="checkbox">Ⅲ期愈合</label>
						<label> <input type="checkbox">折线</label>
						<label> <input type="checkbox">未折线</label>
					</td>
				</tr>
				<tr >
					<td>
						<span class="span">病愈情况</span>
						<label>
						    <select>
							   <option></option>
							</select>
						</label>
						<span class="span">出院方式</span>
						<label> <input type="checkbox">步行</label>
						<label> <input type="checkbox">轮椅</label>
						<label> <input type="checkbox">平车</label>
						<span class="span">转归</span>
						<label>
						    <select>
							   <option></option>
							</select>
						</label>
					</td>                
				</tr>
				<tr >
					<td>
						<span class="span">活动能力</span>
						<label> <input type="checkbox">自理</label>
						<label> <input type="checkbox">部分自理</label>
						<label> <input type="checkbox">不能自理</label>
					</td>
				</tr>
				<tr>
					<td style="width:5%;margin:5px 20px 5px 20px;word-wrap: break-word;font-size:14px; text-align:center;">出院病人健康指导</td>
					<td>
					<span class="span" style="padding-left:5px;">(一)<label style="padding-left:25px;"> <input type="checkbox">一般指导</label></span><br/>
						<label style="padding-left:25px;"> <input type="checkbox">1.修养环境应清洁舒坦,保持室内空气新鲜。</label><br/>
						<label style="padding-left:25px;"> <input type="checkbox">2.宝石良好的心境，有利健康。</label><br/>
						<label style="padding-left:25px;"> <input type="checkbox">3.根据自身情况适当锻炼增强体质。</label><br/>
						<label style="padding-left:25px;"> <input type="checkbox">4.注意营养饮食，有利机体康复。</label><br/>	
						<label style="padding-left:25px;"> <input type="checkbox">5.伤口折线后若发现伤口红肿、硬结、疼痛或发热等及时到医院就诊。</label><br/>	
						<label style="padding-left:25px;"> <input type="checkbox">6.按医生预约时间随诊。</label><br/>	
						<label style="padding-left:25px;"> <input type="checkbox">7.出院带药指导。</label><br/>
						<span class="span" style="padding-left:5px;">(二)<label style="padding-left:25px;"> <input type="checkbox">专家指导</label></span><br/>
						<label style="padding-left:25px;">病人或家属签名：<input class="textlabel" type="text"></label>
						<label>护士签名：<input class="textlabel" type="text"></label>
						<label>护士长签名：<input class="textlabel" type="text"></label><br/> 	      
						<label style="float:right;padding-top:25px;">日期：<input class="textlabel" type="text"></label> 
					</td>
				</tr>
		    </table>
		</div>    
   </div>		