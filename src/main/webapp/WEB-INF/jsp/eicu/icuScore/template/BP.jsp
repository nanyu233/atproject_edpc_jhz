<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div>
	<div class="basicDiv">
		<label class="firstlab paddR30">床号：<span id="bedNo"></span></label>
        <label class="paddR30">姓名：<span id="custName"></span></label>
        <label class="paddR30">性别：<span id="custSex"></span></label>
        <label class="paddR30">年龄：<span id="custAge"></span></label>
        <label class="lastlab">住院号：<span id="liveNo"></span></label>
	</div>
	<div class="basicDiv">
		<label class="firstlab">诊断：<span id="diagInfo"></span></label>
	</div>
	
	<div id="maininfo">
		<table id="lineTab">
			<tr>
				<td>病情摘要</td>
				<td>
					生命体征：T<input type="text" class="putline" style="width: 40px;"/>℃
					P<input type="text" class="putline" style="width: 40px;"/>次/分
					R<input type="text" class="putline" style="width: 40px;"/>次/分
					BP<input type="text" class="putline" style="width: 40px;"/>/<input type="text" class="putline" style="width: 40px;"/>mmHg
					SPO2<input type="text" class="putline" style="width: 40px;"/>%
					<br/>
					意识状态：
					<label><input type="checkbox" name="yszt" onclick="chkOne(this)"/>清楚</label>
					<label><input type="checkbox" name="yszt" onclick="chkOne(this)"/>模糊</label>
					<label><input type="checkbox" name="yszt" onclick="chkOne(this)"/>躁动</label>
					<label><input type="checkbox" name="yszt" onclick="chkOne(this)"/>嗜睡</label>
					<label><input type="checkbox" name="yszt" onclick="chkOne(this)"/>昏迷</label>
					瞳孔：
					左<input type="text" class="putline" style="width: 40px;"/>
					右<input type="text" class="putline" style="width: 40px;"/>
					过敏史<input type="text" class="putline wd20"/>
					<br/>
					出血状态：
					<label><input type="checkbox" name="cxzt" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="cxzt" onclick="chkOne(this)"/>有</label>
					部位<input type="text" class="putline wd20"/>
					范围<input type="text" class="putline wd30" />
				</td>
			</tr>
			<tr>
				<td>各种管道</td>
				<td>
					深静脉透析导管：
					<label><input type="checkbox" name="txdg" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="txdg" onclick="chkOne(this)"/>有</label>:
					<label><input type="checkbox" name="txdg-y" onclick="chkOne(this)"/>长期</label>
					<label><input type="checkbox" name="txdg-y" onclick="chkOne(this)"/>临时</label>
					部位<input type="text" class="putline wd20"/>
					置入<input type="text" class="putline" style="width: 40px;"/>cm
					<br/>
					静脉输液：
					<label><input type="checkbox" name="jmsy" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="jmsy" onclick="chkOne(this)"/>有</label>:
					<input type="text" class="putline" style="width: 40px;"/>路&nbsp;&nbsp;
					<label><input type="checkbox" name="wzsjm" onclick="chkOne(this)"/>外周静脉</label>/
					<label><input type="checkbox" name="wzsjm" onclick="chkOne(this)"/>深静脉置管</label>:
					部位<input type="text" class="putline wd20"/>
					置入<input type="text" class="putline" style="width: 40px;"/>cm
					<br/>
					氧气管道：
					<label><input type="checkbox" name="yqdg" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="yqdg" onclick="chkOne(this)"/>有</label>:
					<label><input type="checkbox" name="yqdg-y" onclick="chkOne(this)"/>鼻导管</label>
					<label><input type="checkbox" name="yqdg-y" onclick="chkOne(this)"/>面罩</label>
					<br/>
					导尿管：
					<label><input type="checkbox" name="dng" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="dng" onclick="chkOne(this)"/>有</label>
					<br/>
					其他尿管：
					<label><input type="checkbox" name="dng" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="dng" onclick="chkOne(this)"/>有</label>:
					<input type="text" class="putline" style="width: 40px;"/>条
					名称：<input type="text" class="putline wd50"/>
				</td>
			</tr>
			<tr>
				<td>皮肤</td>
				<td>
					<label><input type="checkbox" name="pf" onclick="chkOne(this)"/>完整</label>
					<label><input type="checkbox" name="pf" onclick="chkOne(this)"/>破损</label>：
					性质、部位及面积<input type="text" class="putline wd50"/>
					<br/>
					其他：<input type="text" class="putline wd50"/>
				</td>
			</tr>
			<tr>
				<td>特殊交班</td>
				<td>
					透析带药：
					<label><input type="checkbox" name="txdy" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="txdy" onclick="chkOne(this)"/>有</label>：
					<input type="text" class="putline wd50"/>
					<br/>
					微泵：
					<label><input type="checkbox" name="wb" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="wb" onclick="chkOne(this)"/>有</label>：
					药物及速度<input type="text" class="putline wd50"/>
					<br/>
					其它：
					<label><input type="checkbox" name="wb" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="wb" onclick="chkOne(this)"/>有</label>：
					内容<input type="text" class="putline wd50"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					转送过程中发生的问题（请于转送完成后填写）：<br/>
					<label><input type="checkbox" name="zswt" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="zswt" onclick="chkOne(this)"/>有</label>：
					<label><input type="checkbox"/>呼吸停止</label>
					<label><input type="checkbox"/>心跳停止</label>
					<label><input type="checkbox"/>管道脱落</label>
					<label><input type="checkbox"/>其他</label>
					<input type="text" class="putline wd50"/>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					转出科室/护士签名：<input id="deptNo" type="text" class="putline" style="width: 70px;"/>/<input type="text" class="putline" style="width: 45px;"/>
					 转入科室/护士签名：<input type="text" class="putline" style="width: 70px;"/>/<input type="text" class="putline" style="width: 45px;"/>
					 交接日期/时间：<input class="Wdate spcWdate" type="text" autocomplete="off" style="width: 120px;"
						onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})" />
				</td>
			</tr>
		</table>
	</div>
	<div>
		<p>
			备注：在”口“内打勾以示执行或所在部位，瞳孔描述：单位为mm，a灵敏 b迟钝 c消失, 此表归入病历档案保存。
		</p>
	</div>
</div>

<script type="text/javascript">
	function chkOne(e){
		var type = $(e).attr("type");
		var name = $(e).attr("name");
		var value = $(e).attr("value");
		$('input[type=checkbox][name="' + name + '"]').not(e).attr("checked", false);
	}
</script>

