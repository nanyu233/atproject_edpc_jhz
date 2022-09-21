<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<div>
		<div class="basicDiv">
			<label class="firstlab wd30">患者姓名：<span id="bedNo"></span></label>
	        <label class="wd35">床号：<span id="custName"></span></label>
	        <label class="lastlab wd30">住院号：<span id="liveNo"></span></label>
		</div>
		<div class="basicDiv">
			<label class="firstlab">诊断：<span id="diagInfo"></span></label>
		</div>
		
		<ul class="maintext">
			<li>
				<p>通过风险评估您有随时发生压力性损伤的可能，或皮肤已发生破损。</p>
				<p>原因分析如下：</p>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox" id="chkBar" onclick="clearText(this)">Braden评分
						<input type="text" id="chkBarTxt" style="width:20px" class="putline" onkeyup="ckParent(this,'chkBar')"
						maxlength="2">分
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input type="checkbox">生命体征不稳定，限制翻身
					</label>
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox" onclick="canClick(this, 'sz')" id="parSz">水肿(<label><input type="checkbox" name="sz" onclick="ckParent(this, 'parSz')"/>中</label>
						<label><input type="checkbox" name="sz" onclick="ckParent(this, 'parSz')"/>重</label>)
					</label>
				</div>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">持续大、小便失禁
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input id="parYs" type="checkbox" onclick="canClick(this, 'ys')"/>意识(<label><input type="checkbox" name="ys" onclick="ckParent(this,'parYs')"/>淡漠</label>
						<label><input type="checkbox" name="ys" onclick="ckParent(this,'parYs')"/>昏迷</label>
						<label><input type="checkbox" name="ys" onclick="ckParent(this,'parYs')"/>躁动</label>)
					</label> 
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">骨盆骨折
					</label>
				</div>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">强迫体位
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input type="checkbox"/>营养不良(蛋白质≤30g/L)
					</label> 
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">BMI≤15或≥30
					</label>
				</div>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">截瘫/偏瘫
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input type="checkbox"/>家属拒绝翻身
					</label> 
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">大手术后
					</label>
				</div>
			</li>
			<li class="lineli">
				<label class="checklabel">
					<input type="checkbox" id="othfx"/>其它
				</label>
				<input type="text" id="othfxTxt" class="wd70 putline" onkeyup="ckParent(this, 'othfx')"/>
			</li>
			<li class="lineli">
				<label>皮肤现状：</label>
				<textarea id="areavalue" class="pretextarea"></textarea>
				<span id="spanvalue" class="prespan">
			</li>
			<li class="lineli">
				<p>请您配合我们采取以下措施：</p>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">使用气垫床
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input type="checkbox"/>避免选择尿不湿
					</label> 
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">更换体位时不拖拉
					</label>
				</div>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">协助翻身
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input type="checkbox"/>脚跟保护
					</label> 
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">温水清洁皮肤、保持干燥
					</label>
				</div>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">床边交接班
					</label>
				</div>
				<div class="wd35">
					<label class="checklabel">
						<input type="checkbox"/>营养支持
					</label> 
				</div>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">床单位平整、干燥
					</label>
				</div>
			</li>
			<li>
				<div class="wd30">
					<label class="checklabel">
						<input type="checkbox">使用皮肤保护膜
					</label>
				</div>
				<div class="wd35">
				<label class="checklabel">
					<input type="checkbox"/>避免破损处皮肤长时间受压
				</label> 
				</div>				
			</li>
			<li>
				<label class="checklabel">
				<input type="checkbox" id="parZyhl" onclick="canClick(this, 'zyhl')"/>中医护理措施(<label><input type="checkbox" name="zyhl" onclick="ckParent(this,'parZyhl')"/>六一散</label>
				 <label><input type="checkbox" name="zyhl" onclick="ckParent(this,'parZyhl')"/>紫草油</label>
				 <label><input type="checkbox" name="zyhl" onclick="ckParent(this,'parZyhl')"/>康复新</label>)
				 </label>
			</li>
			<li class="lineli">
				<label class="checklabel">
				<input id="othcs" type="checkbox"/>其它
				</label>
				<input type="text" id="othcsTxt" class="wd70 putline" onkeyup="ckParent(this, 'othcs')"/>
			</li>
			<li class="lineli">
				<p>因每个病员体质不同，所以皮肤愈合所需的时间及过程也不尽相同，特此告知。</p>
			</li>
			<li class="inputli">
				<span class="wd50">
					<label>病人及家属签字</label>
					<span><input type="text" class="intextinputlong"/></span>
				</span>
				<span>
					<label>日期 </label>
					<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
				</span>
			</li>
			<li class="inputli">
				<div style="display: inline-block; width: 49%">
					<span>责任护士</span>
					<input placeholder="回车查询" class="userInput" type="text" id="charge-nurse" />
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				</div>
				<div style="display: inline-block;">
					<span>护士长</span>
					<input placeholder="回车查询" class="userInput" type="text" id="head-nurse" />
					<div class="signImgBox" style="display:none">
						<img src="javascript:;" title="" class="signPic">
					</div>
				</div>
			</li>
		</ul>
	</div>
<script type="text/javascript">
	function canClick(e, name) {
		if (!$(e).is(':checked')) {
			$("input[name=" + name + "][type=checkbox]").each(
				function () {
					$(this).attr("checked", false);
				}
			);
		}
	}
	
	function clearText(e){
		if (!$(e).is(':checked')) {
			var id = $(e).context.id;
			$('#'+id+'Txt').val('');
		}
	}
	
	function ckParent(e, parName) {
		var type = $(e).attr("type");
		var flag = false;
		if ("checkbox" === type) {
			var name = $(e).attr("name");
			$("input[name=" + name + "][type=checkbox]").each(
				function () {
					console.log($(this).is(':checked'))
					if ($(this).is(':checked')) {
						flag = true
					}
				}
			);
		} else if ("text" === type) {
			if ($(e).val()) {
				flag = true
			}
		}
		$("#" + parName).attr("checked", flag);
	}
</script>