<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
		<ul class="maintext">
			<li>
				<p>患者因病情需要，需留置胃管，在留置胃管过程中及其后可能存在以下风险：</p>
				<p class="indenttwo">1、误入气道，引起窒息甚至死亡；</p>
				<p class="indenttwo">2、消化道损伤，出血甚至穿孔；</p>
				<p class="indenttwo">3、反射性心跳呼吸骤停甚至死亡；</p>
				<p class="indenttwo">4、需长期留置；</p>
				<p class="indenttwo">5、返流，误吸，肺部感染；</p>
				<p class="indenttwo">6、其它未能预见的意外及并发症。</p>
				<p>
					以上情况严重时可危及生命，医务人员将严格按照操作规范进行操作，并做好相应的防范和抢救措施，力争将风险降低到最低限度，出现意外及时处理，但风险客观存在不可能完全避免。以上事项已详细告知家属， 家属对可能不良后果表示充分理解，签字如下：
				</p>
			</li>
			<li class="inputli">
				<span>
					<label>患方代表签字：</label>
					<input type="text" class="intextinputlong"/>
				</span>
				<span>
					<label>签名日期：</label>
					<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</span>
			</li>
			<li class="inputli">
				<span class="lonefont">
					<label>与患者关系：</label>
					<input type="text" class="intextinputlong"/>
				</span>
			</li>
			<li class="inputli">
				<span>
					<span>谈话医生签字：</span>
					<input type="text" class="intextinputlong"/>
				</span>
				<span>
					<label>签名日期：</label>
					<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</span>
			</li>
		</ul>
	</div>
