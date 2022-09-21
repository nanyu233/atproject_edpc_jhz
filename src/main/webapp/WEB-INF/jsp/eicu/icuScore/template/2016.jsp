<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div id="GOOUT">
		<div class="basicDiv">
			<label class="firstlab wd30">床号：<span id="bedNo"></span></label>
	        <label class="wd35">姓名：<span id="custName"></span></label>
	        <label class="lastlab wd30">住院号：<span id="liveNo"></span></label>
		</div>
		
		<ul class="maintext">
			<li>
				<p>尊敬的家属：</p>
				<p>因病情需要外出行<input type="text" class="intextinputlong"/>检查。外出检查期间可能出现如下风险：</p>
				<p class="indenttwo">1、静脉管路、气管插管、导尿管、胃管等各种管路脱落，造成出血、栓塞等风险。</p>
				<p class="indenttwo">2、途中病情变化。</p>
				<p class="indenttwo">3、心跳呼吸骤停。</p>
				<p class="indenttwo">4、其他不可预计的风险。</p>
				<p>
				上述情况告知患者或患者家属，表示理解，同意外出检查，患者（或家属）签名：<input type="text" class="intextinputlong"/>
				</p>
			</li>
			<li class="inputli trunright">
				<label>谈话医生：</label>
				<span><input type="text" class="intextinputlong"/></span>
			</li>
			<li class="inputli trunright">
				<label>谈话时间：</label>
				<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
			</li>
		</ul>
	</div>

