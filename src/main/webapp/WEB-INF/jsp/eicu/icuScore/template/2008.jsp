<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<div>
		<ul class="maintext">
			<li>
				<p class="indenttwo">尊敬的<span id="custName">患者（或家属）：根据您（您的家人）住院期间的疾病程度、 用药情况及身体状况等，我们依据《住院患者跌倒风险因子评估表》进行了评估，患者属于跌倒高风险人群，要求家属陪护，特给予告知。</p>
				<p class="indenttwo">我们也将采取相关的措施，并希望得到您的配合。让我们共同努力，尽量防止跌倒事件发生。希望患者注意：</p>
				<p class="indenttwo">1、合适的裤子，并穿防滑鞋。</p>
				<p class="indenttwo">2、湿性拖地后避免不必要的走动。</p>
				<p class="indenttwo">3、睡觉时请将床栏拉起，离床活动时应有人陪护。</p>
				<p class="indenttwo">4、请您将信号灯、眼镜、杂志等放在随手易取之处，学会床边呼叫器的使用。</p>
				<p class="indenttwo">5、如您头晕、或服用镇静安眠药物，下床前先坐下床缘，再由照顾者扶下床。</p>
				<p class="indenttwo">6、如您在行走时出现头晕、双眼发黑、下肢无力、步态不稳和不能移动时，立即原地坐（蹲）下或靠墙，呼叫他人帮助</p>
				<p class="indenttwo">7、改变体位应遵循“三部曲”：即平躺 30 秒，坐起 30 秒，站立 30 秒，再行走。避免突然改变体位，尤其是夜间。</p>
				<p class="indenttwo">8、请您尽量将私人常用物品放置在固定位置，保持走道通畅。</p>
				<p class="indenttwo">9、其他：</p>
				<p class="indenttwo">
					<textarea id="areavalue" class="pretextarea qtmargin"></textarea>
					<span id="spanvalue" class="prespan qtmargin">
				</p>
			</li>
			<li class="inputli trunright">
				<label>病人或家属：</label>
				<span><input type="text" class="intextinputlong"/></span>
			</li>
			<li class="inputli trunright">
				<label class="lthreefont">护士：</label>
				<span><input type="text" class="intextinputlong"/></span>
			</li>
			<li class="inputli trunright">
				<label class="lthreefont">时间：</label>
				<input class="Wdate spcWdate" type="text" readonly="readonly" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
			</li>
		</ul>
	</div>

