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
				<p class="indenttwo">由于ICU病房的特殊性，我们特向您告知以下情况：</p>
				<p class="indenttwo">1、为了患者安全，减少交叉感染。ICU病房谢绝家属陪护，每日14:00-14:30为探视时间。请您进入病房前，戴好口罩、帽子、鞋套，穿好隔离衣，手消毒，每次限2人进入监护区，请有序安排探视。谢绝发烧、咳嗽、咽痛等症状的家属及婴幼儿探视。</p>
				<p class="indenttwo">2、探视期间不要随意触摸病人的伤口、各种管道及仪器，未经允许不要给患者喂食任何食物，不要在病室内吸烟，不要大声喧哗，不要擅自翻阅病历及各项记录单，病室内不能摆放鲜花，以免花粉刺激造成对患者的伤害。</p>
				<p class="indenttwo">3、虑者饮食由医生根据病情决定，自带饮食要经医护人员同意方可食用。</p>
				<p class="indenttwo">4、请您为患者准备生活用品：脸盆2只，毛巾2条，一次性中单2包，婴儿湿巾纸1包，面巾纸1包，水杯1只或一次性杯子若干，女患者准备梳子，男患者准备剃须刀，冬季或皮肤干燥患者请准备润肤油。</p>
				<p class="indenttwo">5、病人对什么药物或食物过敏，请告诉我们：______________________________________</p>
				<p class="indenttwo">6、楼层入口处的自助机和诊间屏可以根据住院号查询费用情况，请您关注费用，及时交费。</p>			
				<p class="indenttwo">7、请您确认患者随身携带的贵重物品并交由您代为保管。</p>
				<p class="indenttwo">物品名称：________________________________________________________________________</p>	
				<p class="indenttwo">8、如果患者在生活上有什么特殊要求，或是您对我们的医疗护理服务有何意见建议，</p>
				<p class="indenttwo">9、请您留下联系方式，并保证通讯通畅，期间如有特殊情况，医生会及时与您联系， 患者病情好转将会安排转出ICU。</p>
				<p>对上述告知内容，本人已充分理解，家属代表签名如下：</p>
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
					<input placeholder="回车查询" class="userInput" type="text" id="charge-nurse" />
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				</div>
			</li>
		</ul>
	</div>
