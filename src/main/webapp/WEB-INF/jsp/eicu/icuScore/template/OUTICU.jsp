<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div>
	<div class="basicDiv">
		<label class="firstlab paddR20">床号：<span id="bedNo"></span></label>
	     <label class="paddR20">姓名：<span id="custName"></span></label>
	     <label class="paddR20">性别：<span id="custSex"></span></label>
	     <label class="paddR20">年龄：<span id="custAge"></span></label>
	     <label class="paddR20">住院号：<span id="liveNo"></span></label>
	     <label class="lastlab">日期：
	     <input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 100px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd'})">
	     </label>
	</div>
	<div class="basicDiv">
		<label class="firstlab">诊断：<span id="diagInfo"></span></label>
	</div>

	<div id="maininfo">
		<table id="lineTab">
			<thead>
				<tr>
					<td rowspan="2" style="width: 20%">核对项目</td>
					<td style="width: 40%">转出科室:</td>
					<td style="width: 40%">转入科室:</td>
				</tr>
				<tr>
					<td>时间:<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"></td>
					<td>时间:<input class="Wdate spcWdate" readonly="readonly" type="text" style="width: 130px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"></td>
				</tr>
			</thead>
			<tr>
				<td>病人身份</td>
				<td><label><input type="checkbox"/>确认</label></td>
				<td><label><input type="checkbox"/>确认</label></td>
			</tr>
			<tr>
				<td>意识</td>
				<td>
					<label><input type="checkbox" name="ys1" onclick="chkOne(this)"/>清醒</label>
					<label><input type="checkbox" name="ys1" onclick="chkOne(this)"/>模糊</label>
					<label><input type="checkbox" name="ys1" onclick="chkOne(this)"/>躁动</label>
					<label><input type="checkbox" name="ys1" onclick="chkOne(this)"/>昏睡</label>
					<label><input type="checkbox" name="ys1" onclick="chkOne(this)"/>昏迷</label><br/>
					<label><input type="checkbox" name="ys1" onclick="chkOne(this)"/>药物镇静</label>
				</td>
				<td>
					<label><input type="checkbox" name="ys2" onclick="chkOne(this)"/>清醒</label>
					<label><input type="checkbox" name="ys2" onclick="chkOne(this)"/>模糊</label>
					<label><input type="checkbox" name="ys2" onclick="chkOne(this)"/>躁动</label>
					<label><input type="checkbox" name="ys2" onclick="chkOne(this)"/>昏睡</label>
					<label><input type="checkbox" name="ys2" onclick="chkOne(this)"/>昏迷</label><br/>
					<label><input type="checkbox" name="ys2" onclick="chkOne(this)"/>药物镇静</label>
				</td>
			</tr>
			<tr>
				<td>血压</td>
				<td>
				<input type="text" class="putline" style="width: 40px;"/>/
				<input type="text" class="putline" style="width: 40px;"/>mmHg
				</td>
				<td>
				<input type="text" class="putline" style="width: 40px;"/>/
				<input type="text" class="putline" style="width: 40px;"/>mmHg
				</td>
			</tr>
			<tr>
				<td>
					<label><input type="checkbox" name="mbxl" onclick="chkOne(this)"/>脉搏</label>
					<label><input type="checkbox" name="mbxl" onclick="chkOne(this)"/>心率</label>
				</td>
				<td>
				<input type="text" class="putline" style="width: 40px;"/>次/分
				</td>
				<td>
				<input type="text" class="putline" style="width: 40px;"/>次/分
				</td>
			</tr>
			<tr>
				<td>呼吸</td>
				<td>
				<input type="text" class="putline" style="width: 40px;"/>次/分
				</td>
				<td>
				<input type="text" class="putline" style="width: 40px;"/>次/分
				</td>
			</tr>
			<tr>
				<td>疼痛评分(NRS)</td>
				<td>
					<label><input type="checkbox" name="NRS1" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="NRS1" onclick="chkOne(this)"/>有</label>
					<input type="text" class="putline" style="width: 40px;"/>分
				</td>
				<td>
					<label><input type="checkbox" name="NRS2" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="NRS2" onclick="chkOne(this)"/>有</label>
					<input type="text" class="putline" style="width: 40px;"/>分
				</td>
			</tr>
			<tr>
				<td>体温</td>
				<td>
					<input type="text" class="putline" style="width: 40px;"/>℃
				</td>
				<td>
					<input type="text" class="putline" style="width: 40px;"/>℃
				</td>
			</tr>
			<tr>
				<td>过敏史</td>
				<td>
					<label><input type="checkbox" name="gms" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="gms" onclick="chkOne(this)"/>不详</label>
					<label><input type="checkbox" name="gms" onclick="chkOne(this)"/>有</label>
					<input type="text" class="putline" style="width: 70px;"/>
				</td>
				<td>
					<label><input type="checkbox"/>确认</label>
				</td>
			</tr>
			<tr>
				<td>隔离</td>
				<td>
					<label><input type="checkbox" name="gl" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="gl" onclick="chkOne(this)"/>接触隔离</label>
					<label><input type="checkbox" name="gl" onclick="chkOne(this)"/>其他隔离</label>
				</td>
				<td>
					<label><input type="checkbox"/>确认</label>
				</td>
			</tr>
			<tr>
				<td>管道</td>
				<td>
					<label><input type="checkbox"/>无</label><br/>
					<label><input type="checkbox"/>吸氧管</label><br/>
					<label><input type="checkbox"/>气管插管</label>
					<label><input type="checkbox"/>气管切开套管</label><br/>
					<label>静脉置管</label><br/>
					<label style="padding-left: 2em"><input type="checkbox"/>CVC<input type="text" class="putline" style="width: 40px;"/>根</label><br/>
					<label style="padding-left: 2em"><input type="checkbox"/>PVC<input type="text" class="putline" style="width: 40px;"/>根</label><br/>
					<label><input type="checkbox"/>引流管<input type="text" class="putline" style="width: 40px;"/>根</label><br/>
					<label><input type="checkbox"/>造痿管</label><br/>
					<label><input type="checkbox"/>胃管</label><br/>
					<label><input type="checkbox"/>导尿管</label><br/>
					<label><input type="checkbox"/>其他导管<input type="text" class="putline" style="width: 40px;"/>根
						名称<input type="text" class="putline" style="width: 80px;"/>
					</label>
						
				</td>
				<td>
					<label><input type="checkbox" name="pipChk" onclick="chkOne(this)"/>确认</label>
					<label>
						<input type="checkbox" name="pipChk" onclick="chkOne(this)"/>异常
						<input type="text" class="putline" style="width: 120px;"/>
					</label>
				</td>
			</tr>
			
			<tr>
				<td>皮肤完整性</td>
				<td>
					<label><input type="checkbox" name="skin" onclick="chkOne(this)"/>完整</label>
					<label>
						<input type="checkbox" name="skin" onclick="chkOne(this)"/>不完整
						<input type="text" class="putline" style="width: 120px;"/>
					</label>
				</td>
				<td>
					<label><input type="checkbox" name="skinChk" onclick="chkOne(this)"/>确认</label>
					<label>
						<input type="checkbox" name="skinChk" onclick="chkOne(this)"/>异常
						<input type="text" class="putline" style="width: 120px;"/>
					</label>
				</td>
			</tr>
			
			<tr>
				<td>备血</td>
				<td>
					<label><input type="checkbox" name="skin" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="skin" onclick="chkOne(this)"/>有</label>
				</td>
				<td>
					<label><input type="checkbox"/>确认</label>
				</td>
			</tr>
			<tr>
				<td>药品/血制品</td>
				<td>
					<span>药品：</span>
					<label><input type="checkbox" name="yp" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="yp" onclick="chkOne(this)"/>有</label>
					<br/>
					<span>血制品：</span>
					<label><input type="checkbox" name="xzp" onclick="chkOne(this)"/>无</label>
					<label><input type="checkbox" name="xzp" onclick="chkOne(this)"/>有</label>
				</td>
				<td>
					<label><input type="checkbox"/>确认</label>
				</td>
			</tr>
			<tr>
				<td>病历</td>
				<td>
					<label><input type="checkbox"/>确认</label>
				</td>
				<td>
					<label><input type="checkbox"/>确认</label>
				</td>
			</tr>
			<tr>
				<td>备注</td>
				<td>
					<textarea class="pretextarea"></textarea>
					<span class="prespan" style="width: 70mm"></span>
				</td>
				<td>
					<textarea class="pretextarea"></textarea>
					<span class="prespan" style="width: 70mm"></span>
				</td>
			</tr>
			<tr>
				<td>护士签名</td>
				<td>
					<div style="display: inline-block;">
						<input placeholder="回车查询" class="userInput" type="text" id="charge-nurse"/>
						<div class="signImgBox" style="display:none">
							<img src="javascript:;" title="" class="signPic">
						</div>
					</div>
				</td>
				<td>
					<div style="display: inline-block;">
						<input placeholder="回车查询" class="userInput" type="text"/>
						<div class="signImgBox" style="display:none">
							<img src="javascript:;" title="" class="signPic">
						</div>
					</div>
				</td>
			</tr>
		</table>
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
