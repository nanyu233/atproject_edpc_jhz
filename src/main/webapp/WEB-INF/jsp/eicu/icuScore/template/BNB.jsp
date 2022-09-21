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
		<ul class="maintext">
			<li>
				<p>尊敬的家属：</p>
				<p class="indenttwo">根据患者病情需要，为了确保其安全，防止各种意外发生，需要给患者使用保护性约束，希望得到您的理解和配合。</p>
				<p class="indenttwo">1、使用保护性约束的目的：预防意外拔管，防止坠床、自伤、撞伤及伤人等意外情况的发生。</p>
				<p class="indenttwo">2、使用过程中注意事项：应使用专制安全工具对患者进行约束；必须留有专人24小时陪护(监护室除外)，陪护人员不能随意离开，如有特殊情况需要离开时必须告知护士；对使用的安全约束用具不能随意调节松紧度，未经医护人员同意不得擅自解开约束：在使用约束带期间护士将肢体处于功能位置，加强巡视，观察约束部位的皮肤情况、末梢血供。</p>
				<p class="indenttwo">3、在约束期间可能发生的情况：患者因过度躁动自行挣脱安全用具；局部红肿、局部疼痛、约束部位皮肤损伤及皮下瘀斑、约束肢体肿胀等。一但发生上述情况，医护人员会立即采取相应措施。</p>
				<p class="indenttwo">4、若您不同意实施约束，则承担由此发生的风险和后果。</p>
				<p>签署意见：</p>
				<p class="indenttwo">对上述告知内容，本人已充分理解，(&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;)(同意/不同意)使用约束带。
				</p>
			</li>
			<li class="inputli">
				<span class="lineThr">
					<label>家属签名：</label>
					<span></span>
				</span>
				<span class="lineThr">
					<label>与患者关系：</label>
					<span></span>
				</span>
				<span class="lineThr">
					<label>联系电话：</label>
					<span></span>
				</span>
			</li>
			<li class="inputli">
				<label>签名日期：</label>
				<label style="margin-left: 7%">年</label>
				<label style="margin-left: 7%">月</label>
				<label style="margin-left: 7%">日</label>
				<label style="margin-left: 7%">时</label>
				<label style="margin-left: 7%">分</label>
			</li>
			<li class="inputli">
				<div style="display: inline-block;">
					<span>告知人签名：</span>
					<input placeholder="回车查询" class="userInput" type="text" id="charge-nurse"/>
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				</div>
			</li>
		</ul>
	</div>
