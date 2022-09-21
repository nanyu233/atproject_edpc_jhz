<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div id="INICU">
	<div class="basicDiv" style="font-size: 14px">
		<label class="firstlab paddR30">科室：<span id="deptNo"></span></label>
		<label class="paddR30">床号：<span id="bedNo"></span></label>
		<label class="paddR30">住院号：<span id="liveNo"></span></label>
		<label class="paddR30">姓名：<span id="custName"></span></label>
		<label class="paddR30">性别：<span id="custSex"></span></label>
		<label class="lastlab">年龄：<span id="custAge"></span></label>
	</div>

	<div id="maininfo">
		<table id="lineTab">
			<tr class="showTr">
				<td colspan="2">
					<span>职业：</span>
					<select onchange="chgVal(this, 'zy')">
						<option value=""></option>
						<option value="1">农民</option>
						<option value="2">工人</option>
						<option value="3">个体</option>
						<option value="4">公安机关</option>
						<option value="5">待业</option>
					</select>
					<span>民族：</span>
					<select onchange="chgVal(this, 'mz')">
						<option value=""></option>
						<option value="1">汉族</option>
						<option value="2">其它民族</option>
					</select>
					<span>文化程度：</span>
					<select onchange="chgVal(this, 'wh')">
						<option value=""></option>
						<option value="1">文盲</option>
						<option value="2">小学</option>
						<option value="3">初中</option>
						<option value="4">高中</option>
						<option value="5">大学</option>
						<option value="6">研究生</option>
						<option value="7">博士生</option>
					</select>
					<span>婚姻状况：</span>
					<select onchange="chgVal(this, 'hy')">
						<option value=""></option>
						<option value="1">已婚</option>
						<option value="2">未婚</option>
						<option value="3">离异</option>
						<option value="4">丧偶</option>
					</select>
					<span>宗教信仰：</span>
					<select onchange="chgVal(this, 'zj')">
						<option value=""></option>
						<option value="1">无</option>
						<option value="2">佛教</option>
						<option value="3">基督教</option>
						<option value="4">伊斯兰教</option>
					</select>
				</td>
			</tr>
			<tr class="prtTr">
				<td colspan="2">
					职业：<span id="zyVal" style="display: inline-block; width: 8%;"></span>
					民族：<span id="mzVal" style="display: inline-block; width: 8%;"></span>
					文化程度：<span id="whVal" style="display: inline-block; width: 8%;"></span>
					婚姻状况：<span id="hyVal" style="display: inline-block; width: 8%;"></span>
					宗教信仰：<span id="zjVal" style="display: inline-block; width: 8%;"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>入院时间：</span>
					<input id="inhosTimeStr" class="Wdate" type="text" autocomplete="off"
						onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm',maxDate:'%y/%M/%d %H:%m'})"
						onchange="chgVal(this, 'rytime')" />
					<span>入院方式：</span>
					<label><input type="checkbox" name="inway" value="1" onclick="chkOne(this)">步行</label>
					<label><input type="checkbox" name="inway" value="2" onclick="chkOne(this)">扶行</label>
					<label><input type="checkbox" name="inway" value="3" onclick="chkOne(this)">轮椅</label>
					<label><input type="checkbox" name="inway" value="4" onclick="chkOne(this)">平车</label>
					<label><input type="checkbox" name="inway" value="5" onclick="chkOne(this)">担架</label>
					<label><input type="checkbox" name="inway" value="6" onclick="chkOne(this)">背入</label>
					<label><input type="checkbox" name="inway" value="7" onclick="chkOne(this)">抱入</label>
				</td>
			</tr>
			<tr class="prtTr">
				<td colspan="2">
					入院时间：<span id="rytimeVal" style="display: inline-block; width: 20%;"></span>
					入院方式：<span id="inwayVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>过敏史：</span>
					<label><input type="checkbox" name="allergy" value="1" onclick="chkOne(this)">无</label>
					<label><input type="checkbox" name="allergy" value="2" onclick="chkOne(this)">有</label>
					<div id="gm" style="display: none;">
						过敏药物或食物：
						<input type="text" onkeyup="chgVal(this, 'gmTxt')" />
					</div>
					<label><input type="checkbox" name="allergy" value="3" onclick="chkOne(this)">不详</label>
					<span>发病气节：</span>
					<select onchange="chgVal(this, 'jq')">
						<option value=""></option>
						<option value="1">立春</option>
						<option value="2">雨水</option>
						<option value="3">惊蛰</option>
						<option value="4">春分</option>
						<option value="5">清明</option>
						<option value="6">谷雨</option>
						<option value="7">立夏</option>
						<option value="8">小满</option>
						<option value="9">芒种</option>
						<option value="10">夏至</option>
						<option value="11">小暑</option>
						<option value="12">大暑</option>
						<option value="13">立秋</option>
						<option value="14">处暑</option>
						<option value="15">白露</option>
						<option value="16">秋分</option>
						<option value="17">寒露</option>
						<option value="18">霜降</option>
						<option value="19">立冬</option>
						<option value="20">小雪</option>
						<option value="21">大雪</option>
						<option value="22">冬至</option>
						<option value="23">小寒</option>
						<option value="24">大寒</option>
					</select>
				</td>
			</tr>
			<tr class="prtTr">
				<td colspan="2">
					过敏史：
					<span id="allergyVal" style="display:inline-block;width: 4%"></span>
					<div id="gmPrt" style="display: none;">
						<span>过敏药物或食物： </span>
						<span id="gmTxtVal" style="display:inline-block;width: 20%"></span>
					</div>
					发病气节：
					<span id="jqVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>非预期再入科：</span>
					<label><input type="checkbox" name="reIn" value="1" onclick="chkOne(this)">24小时内非预期再入科</label>
					<label><input type="checkbox" name="reIn" value="2" onclick="chkOne(this)">48小时内非预期再入科</label>
					<label><input type="checkbox" name="reIn" value="3" onclick="chkOne(this)">72小时内非预期再入科</label>
					<label><input type="checkbox" name="reIn" value="4" onclick="chkOne(this)">非预期入科</label>
				</td>
			</tr>
			<tr class="prtTr">
				<td colspan="2">
					非预期再入科：
					<span id="reInVal"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">
					<span>入院诊断：</span>
					<input type="text" class="putline" style="width: 75%" id="diagInfo">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<span>主诉：</span>
					<input type="text" class="putline" style="width: 75%">
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>T：</span><input id="BT" type="text" style="width: 4%" onkeyup="chgVal(this, 'BT')">℃
					<span>P：</span><input id="PR" type="text" style="width: 4%" onkeyup="chgVal(this, 'PR')">次/分
					<span>R：</span><input id="RR" type="text" style="width: 4%" onkeyup="chgVal(this, 'RR')">次/分
					<span>BP：</span><input id="SBP" type="text" style="width: 4%" onkeyup="chgVal(this, 'SBP')">
					<span>/</span><input id="DBP" type="text" style="width: 4%" onkeyup="chgVal(this, 'DBP')">mmHg
					<select onchange="chgVal(this, 'cl')">
						<option value=""></option>
						<option value="1">未测</option>
						<option value="2">免测</option>
						<option value="3">测不出</option>
					</select>
					<span>身高：</span>
					<input type="text" style="width: 5%" onkeyup="chgVal(this, 'sg')" name="sg" />cm
					<span>体重：</span>
					<input type="text" style="width: 4%" onkeyup="chgVal(this, 'tz')" name="tz"/>Kg
					<select onchange="chgVal(this, 'wc')">
						<option value=""></option>
						<option value="1">卧床</option>
					</select>
				</td>
			</tr>

			<tr class="prtTr">
				<td colspan="2">
					<span>T：</span><span id="BTVal" style="display:inline-block;width: 4%"></span>℃
					<span>P：</span><span id="PRVal" style="display:inline-block;width: 4%"></span>次/分
					<span>R：</span><span id="RRVal" style="display:inline-block;width: 4%"></span>次/分
					<span>BP：</span><span id="SBPVal" style="display:inline-block;width: 4%"></span>
					<span>/</span><span id="DBPVal" style="display:inline-block;width: 4%"></span>mmHg
					<span id="clVal" style="display:inline-block;width: 6%"></span>
					<span>身高：</span><span id="sgVal" style="display:inline-block;width: 4%"></span>cm
					<span>体重：</span><span id="tzVal" style="display:inline-block;width: 4%"></span>Kg
					<span id="wcVal" style="display:inline-block;width: 4%"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">
					<span>一、四诊</span>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					（一）望诊
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>1、神志：</span>
					<label><input type="checkbox" name="mind" value="1" onclick="chkOne(this)" />有神</label>
					<label><input type="checkbox" name="mind" value="2" onclick="chkOne(this)" />倦怠</label>
					<label><input type="checkbox" name="mind" value="3" onclick="chkOne(this)" />时清时昧</label>
					<label><input type="checkbox" name="mind" value="4" onclick="chkOne(this)" />烦躁</label>
					<label><input type="checkbox" name="mind" value="5" onclick="chkOne(this)" />嗜睡</label>
					<label><input type="checkbox" name="mind" value="6" onclick="chkOne(this)" />谵妄</label>
					<label><input type="checkbox" name="mind" value="7" onclick="chkOne(this)" />昏迷</label>
					<label><input type="checkbox" name="mind" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'mind')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>2、形态：</span>
					<label><input type="checkbox" name="xintai" value="1" onclick="chkOne(this)" />自如</label>
					<label><input type="checkbox" name="xintai" value="2" onclick="chkOne(this)" />肢体瘫痪</label>
					<label><input type="checkbox" name="xintai" value="3" onclick="chkOne(this)" />障碍</label>
					<label><input type="checkbox" name="xintai" value="4" onclick="chkOne(this)" />医疗疾病限制</label>
				</td>
			</tr>
			<tr class="prtTr">
				<td>
					1、神志：<span id="mindVal"></span>
				</td>
				<td>
					2、形态：<span id="xintaiVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>3、面色：</span>
					<label><input type="checkbox" name="face" value="1" onclick="chkOne(this)" />如常</label>
					<label><input type="checkbox" name="face" value="2" onclick="chkOne(this)" />红润</label>
					<label><input type="checkbox" name="face" value="3" onclick="chkOne(this)" />两颧潮红</label>
					<label><input type="checkbox" name="face" value="4" onclick="chkOne(this)" />苍白</label>
					<label><input type="checkbox" name="face" value="5" onclick="chkOne(this)" />萎黄</label>
					<label><input type="checkbox" name="face" value="6" onclick="chkOne(this)" />晦暗</label>
					<label><input type="checkbox" name="face" value="7" onclick="chkOne(this)" />无光泽</label>
					<label><input type="checkbox" name="face" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'face')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>4、皮肤：</span>
					<label><input type="checkbox" name="skin" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="skin" value="2" onclick="chkOne(this)" />黄染</label>
					<label><input type="checkbox" name="skin" value="3" onclick="chkOne(this)" />苍白</label>
					<label><input type="checkbox" name="skin" value="4" onclick="chkOne(this)" />红斑</label>
					<label><input type="checkbox" name="skin" value="5" onclick="chkOne(this)" />发绀</label>
					<label><input type="checkbox" name="skin" value="6" onclick="chkOne(this)" />压疮</label>
					<label><input type="checkbox" name="skin" value="7" onclick="chkOne(this)" />潮红</label>
					<label><input type="checkbox" name="skin" value="8" onclick="chkOne(this)" />溃烂</label>
					<label><input type="checkbox" name="skin" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'skin')" />
				</td>
			</tr>
			<tr class="prtTr">
				<td>
					3、面色：<span id="faceVal"></span>
				</td>
				<td>
					4、皮肤：<span id="skinVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>5、舌象：（一）舌质：</span>
					<label><input type="checkbox" name="sheZhi" value="1" onclick="chkOne(this)" />淡红</label>
					<label><input type="checkbox" name="sheZhi" value="2" onclick="chkOne(this)" />淡白</label>
					<label><input type="checkbox" name="sheZhi" value="3" onclick="chkOne(this)" />红</label>
					<label><input type="checkbox" name="sheZhi" value="4" onclick="chkOne(this)" />绛</label>
					<label><input type="checkbox" name="sheZhi" value="5" onclick="chkOne(this)" />紫暗</label>
					<label><input type="checkbox" name="sheZhi" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'sheZhi')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<div style="display: inline-block;visibility:hidden;">5、舌象：</div><span>（二）舌苔：</span>
					<label><input type="checkbox" name="sheXiang" value="1" onclick="chkOne(this)" />薄白</label>
					<label><input type="checkbox" name="sheXiang" value="2" onclick="chkOne(this)" />淡黄</label>
					<label><input type="checkbox" name="sheXiang" value="3" onclick="chkOne(this)" />黄厚</label>
					<label><input type="checkbox" name="sheXiang" value="4" onclick="chkOne(this)" />滑</label>
					<label><input type="checkbox" name="sheXiang" value="5" onclick="chkOne(this)" />燥</label>
					<label><input type="checkbox" name="sheXiang" value="6" onclick="chkOne(this)" />燥裂</label>
					<label><input type="checkbox" name="sheXiang" value="7" onclick="chkOne(this)" />腐</label>
					<label><input type="checkbox" name="sheXiang" value="8" onclick="chkOne(this)" />腻</label>
					<label><input type="checkbox" name="sheXiang" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'sheXiang')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					5、舌象：（一）舌质：<span id="sheZhiVal"></span>
				</td>
				<td>
					（二）舌苔：<span id="sheXiangVal"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">
					（二）闻诊
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>1、语言：</span>
					<label><input type="checkbox" name="yuyan" value="1" onclick="chkOne(this)" />清楚</label>
					<label><input type="checkbox" name="yuyan" value="2" onclick="chkOne(this)" />声音低微</label>
					<label><input type="checkbox" name="yuyan" value="3" onclick="chkOne(this)" />失语</label>
					<label><input type="checkbox" name="yuyan" value="4" onclick="chkOne(this)" />呻吟</label>
					<label><input type="checkbox" name="yuyan" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'yuyan')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>2、呼吸：</span>
					<label><input type="checkbox" name="huXi" value="1" onclick="chkOne(this)" />如常</label>
					<label><input type="checkbox" name="huXi" value="2" onclick="chkOne(this)" />气促</label>
					<label><input type="checkbox" name="huXi" value="3" onclick="chkOne(this)" />呼吸缓慢</label>
					<label><input type="checkbox" name="huXi" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'huXi')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					1、语言：<span id="yuyanVal"></span>
				</td>
				<td>
					2、呼吸：<span id="huXiVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>3、咳嗽：</span>
					<label><input type="checkbox" name="bex" value="1" onclick="chkOne(this)" />无</label>
					<label><input type="checkbox" name="bex" value="2" onclick="chkOne(this)" />有</label>
					<label><input type="checkbox" name="bex" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'bex')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>4、嗅气味：</span>
					<label><input type="checkbox" name="smell" value="1" onclick="chkOne(this)" />无异味</label>
					<label><input type="checkbox" name="smell" value="2" onclick="chkOne(this)" />酸臭</label>
					<label><input type="checkbox" name="smell" value="3" onclick="chkOne(this)" />腐臭</label>
					<label><input type="checkbox" name="smell" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'smell')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					3、咳嗽：<span id="bexVal"></span>
				</td>
				<td>
					4、嗅气味：<span id="smellVal"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">（三）问诊 </td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>1、嗜好：</span>
					<label><input type="checkbox" name="hobby" value="1" onclick="chkOne(this)" />无特殊</label>
					<label><input type="checkbox" name="hobby" value="2" onclick="chkOne(this)" />吸烟</label>
					<label><input type="checkbox" name="hobby" value="3" onclick="chkOne(this)" />饮酒</label>
					<label><input type="checkbox" name="hobby" value="4" onclick="chkOne(this)" />酸</label>
					<label><input type="checkbox" name="hobby" value="5" onclick="chkOne(this)" />甜</label>
					<label><input type="checkbox" name="hobby" value="6" onclick="chkOne(this)" />辣</label>
					<label><input type="checkbox" name="hobby" value="7" onclick="chkOne(this)" />肥甘</label>
					<label><input type="checkbox" name="hobby" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'hobby')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>2、饮食：</span>
					<label><input type="checkbox" name="diet" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="diet" value="2" onclick="chkOne(this)" />纳呆</label>
					<label><input type="checkbox" name="diet" value="3" onclick="chkOne(this)" />多食易饥</label>
					<label><input type="checkbox" name="diet" value="4" onclick="chkOne(this)" />饥不择食</label>
					<label><input type="checkbox" name="diet" value="5" onclick="chkOne(this)" />鼻饲</label>
					<label><input type="checkbox" name="diet" value="6" onclick="chkOne(this)" />恶心呕吐</label>
					<label><input type="checkbox" name="diet" value="7" onclick="chkOne(this)" />禁食</label>
					<label><input type="checkbox" name="diet" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'diet')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					1、嗜好：<span id="hobbyVal"></span>
				</td>
				<td>
					2、饮食：<span id="dietVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>3、口渴：</span>
					<label><input type="checkbox" name="thirsty" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="thirsty" value="2" onclick="chkOne(this)" />口不渴</label>
					<label><input type="checkbox" name="thirsty" value="3" onclick="chkOne(this)" />渴欲饮</label>
					<label><input type="checkbox" name="thirsty" value="4" onclick="chkOne(this)" />渴不欲饮</label>
					<label><input type="checkbox" name="thirsty" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'thirsty')" />
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>4、睡眠：</span>
					<label><input type="checkbox" name="sleep" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="sleep" value="2" onclick="chkOne(this)" />难寝</label>
					<label><input type="checkbox" name="sleep" value="3" onclick="chkOne(this)" />已醒</label>
					<label><input type="checkbox" name="sleep" value="4" onclick="chkOne(this)" />彻夜未眠</label>
					<label><input type="checkbox" name="sleep" value="5" onclick="chkOne(this)" />多梦</label>
					<label><input type="checkbox" name="sleep" value="6" onclick="chkOne(this)" />早醒</label>
					<label><input type="checkbox" name="sleep" value="7" onclick="chkOne(this)" />辅助用药</label>
					<label><input type="checkbox" name="sleep" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'sleep')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					3、口渴：<span id="thirstyVal"></span>
				</td>
				<td>
					4、睡眠：<span id="sleepVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>5、大便：</span>
					<label><input type="checkbox" name="feces" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="feces" value="2" onclick="chkOne(this)" />便秘</label>
					<label><input type="checkbox" name="feces" value="3" onclick="chkOne(this)" />干结</label>
					<label><input type="checkbox" name="feces" value="4" onclick="chkOne(this)" />便溏</label>
					<label><input type="checkbox" name="feces" value="5" onclick="chkOne(this)" />完谷不化</label>
					<label><input type="checkbox" name="feces" value="6" onclick="chkOne(this)" />便血</label>
					<label><input type="checkbox" name="feces" value="7" onclick="chkOne(this)" />里急后重</label>
					<label><input type="checkbox" name="feces" value="8" onclick="chkOne(this)" />失禁</label>
					<label><input type="checkbox" name="feces" value="9" onclick="chkOne(this)" />造萎</label>
					<label><input type="checkbox" name="feces" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'feces')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>6、小便：</span>
					<label><input type="checkbox" name="pee" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="pee" value="2" onclick="chkOne(this)" />频数</label>
					<label><input type="checkbox" name="pee" value="3" onclick="chkOne(this)" />癃闭</label>
					<label><input type="checkbox" name="pee" value="4" onclick="chkOne(this)" />尿少</label>
					<label><input type="checkbox" name="pee" value="5" onclick="chkOne(this)" />失禁</label>
					<label><input type="checkbox" name="pee" value="6" onclick="chkOne(this)" />留置尿管</label>
					<label><input type="checkbox" name="pee" value="7" onclick="chkOne(this)" />造痿</label>
					<label><input type="checkbox" name="pee" value="8" onclick="chkOne(this)" />血尿</label>
					<label><input type="checkbox" name="pee" value="9" onclick="chkOne(this)" />浑浊</label>
					<label><input type="checkbox" name="pee" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'pee')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					5、大便：<span id="fecesVal"></span>
				</td>
				<td>
					6、小便：<span id="peeVal"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">（四）切诊</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>1、脉象：</span>
					<label><input type="checkbox" name="pulse" value="1" onclick="chkOne(this)" />和缓有利</label>
					<label><input type="checkbox" name="pulse" value="2" onclick="chkOne(this)" />缓</label>
					<label><input type="checkbox" name="pulse" value="3" onclick="chkOne(this)" />数</label>
					<label><input type="checkbox" name="pulse" value="4" onclick="chkOne(this)" />弦</label>
					<label><input type="checkbox" name="pulse" value="5" onclick="chkOne(this)" />滑</label>
					<label><input type="checkbox" name="pulse" value="6" onclick="chkOne(this)" />涩</label>
					<label><input type="checkbox" name="pulse" value="7" onclick="chkOne(this)" />细</label>
					<label><input type="checkbox" name="pulse" value="8" onclick="chkOne(this)" />弱</label>
					<label><input type="checkbox" name="pulse" value="9" onclick="chkOne(this)" />结</label>
					<label><input type="checkbox" name="pulse" value="10" onclick="chkOne(this)" />代</label>
					<label><input type="checkbox" name="pulse" value="11" onclick="chkOne(this)" />浮</label>
					<label><input type="checkbox" name="pulse" value="12" onclick="chkOne(this)" />沉</label>
					<label><input type="checkbox" name="pulse" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'pulse')" />
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>2、脘腹：</span>
					<label><input type="checkbox" name="rouGui" value="1" onclick="chkOne(this)" />正常</label>
					<label><input type="checkbox" name="rouGui" value="2" onclick="chkOne(this)" />胀满</label>
					<label><input type="checkbox" name="rouGui" value="3" onclick="chkOne(this)" />腹痛喜按</label>
					<label><input type="checkbox" name="rouGui" value="4" onclick="chkOne(this)" />腹痛拒按</label>
					<label><input type="checkbox" name="rouGui" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'rouGui')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					1、脉象：<span id="pulseVal"></span>
				</td>
				<td>
					2、脘腹：<span id="rouGuiVal"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">二、辨证</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>1、病因：</span>
					<label><input type="checkbox" name="causeOf" value="1" onclick="chkOne(this)" />外感六淫</label>
					<label><input type="checkbox" name="causeOf" value="2" onclick="chkOne(this)" />内伤七情</label>
					<label><input type="checkbox" name="causeOf" value="3" onclick="chkOne(this)" />饮食</label>
					<label><input type="checkbox" name="causeOf" value="4" onclick="chkOne(this)" />劳倦</label>
					<label><input type="checkbox" name="causeOf" value="5" onclick="chkOne(this)" />外伤</label>
					<label><input type="checkbox" name="causeOf" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'causeOf')" />
				</td>
			</tr>
			<tr id="wglyInfo" style="display: none" class="showTr">
				<td colspan="2">
					<span>外感六淫：</span>
					<label><input type="checkbox" name="wgly" value="1" onclick="chkOne(this)" />风</label>
					<label><input type="checkbox" name="wgly" value="2" onclick="chkOne(this)" />寒</label>
					<label><input type="checkbox" name="wgly" value="3" onclick="chkOne(this)" />暑</label>
					<label><input type="checkbox" name="wgly" value="4" onclick="chkOne(this)" />湿</label>
					<label><input type="checkbox" name="wgly" value="5" onclick="chkOne(this)" />燥</label>
					<label><input type="checkbox" name="wgly" value="6" onclick="chkOne(this)" />火</label>
				</td>
			</tr>
			<tr id="yinshiInfo" style="display: none" class="showTr">
				<td colspan="2">
					<span>饮食：</span>
					<label><input type="checkbox" name="yinshi" value="1" onclick="chkOne(this)" />不节</label>
					<label><input type="checkbox" name="yinshi" value="2" onclick="chkOne(this)" />不洁</label>
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					1、病因：<span id="causeOfVal"></span>
				</td>
				<td id="causeOfTd">

				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>2、病位：</span>
					<label><input type="checkbox" name="disLoc" value="1" onclick="chkOne(this)" />心</label>
					<label><input type="checkbox" name="disLoc" value="2" onclick="chkOne(this)" />肝</label>
					<label><input type="checkbox" name="disLoc" value="3" onclick="chkOne(this)" />脾</label>
					<label><input type="checkbox" name="disLoc" value="4" onclick="chkOne(this)" />肺</label>
					<label><input type="checkbox" name="disLoc" value="5" onclick="chkOne(this)" />肾</label>
					<label><input type="checkbox" name="disLoc" value="6" onclick="chkOne(this)" />小肠</label>
					<label><input type="checkbox" name="disLoc" value="7" onclick="chkOne(this)" />胆</label>
					<label><input type="checkbox" name="disLoc" value="8" onclick="chkOne(this)" />胃</label>
					<label><input type="checkbox" name="disLoc" value="9" onclick="chkOne(this)" />大肠</label>
					<label><input type="checkbox" name="disLoc" value="10" onclick="chkOne(this)" />膀胱</label>
					<label><input type="checkbox" name="disLoc" value="11" onclick="chkOne(this)" />经络</label>
					<label><input type="checkbox" name="disLoc" value="12" onclick="chkOne(this)" />皮毛</label>
					<label><input type="checkbox" name="disLoc" value="13" onclick="chkOne(this)" />筋骨</label>
					<label><input type="checkbox" name="disLoc" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'disLoc')" />
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>3、病性：</span>
					<label><input type="checkbox" name="disSex" value="1" onclick="chkOne(this)" />风</label>
					<label><input type="checkbox" name="disSex" value="2" onclick="chkOne(this)" />寒</label>
					<label><input type="checkbox" name="disSex" value="3" onclick="chkOne(this)" />暑</label>
					<label><input type="checkbox" name="disSex" value="4" onclick="chkOne(this)" />湿</label>
					<label><input type="checkbox" name="disSex" value="5" onclick="chkOne(this)" />燥</label>
					<label><input type="checkbox" name="disSex" value="6" onclick="chkOne(this)" />火</label>
					<label><input type="checkbox" name="disSex" value="7" onclick="chkOne(this)" />气滞</label>
					<label><input type="checkbox" name="disSex" value="8" onclick="chkOne(this)" />血瘀 </label>
					<label><input type="checkbox" name="disSex" value="9" onclick="chkOne(this)" />痰饮</label>
					<label><input type="checkbox" name="disSex" value="10" onclick="chkOne(this)" />阴虚</label>
					<label><input type="checkbox" name="disSex" value="11" onclick="chkOne(this)" />血虚</label>
					<label><input type="checkbox" name="disSex" value="12" onclick="chkOne(this)" />气虚</label>
					<label><input type="checkbox" name="disSex" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'disSex')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					2、病位：<span id="disLocVal"></span>
				</td>
				<td>
					3、病性：<span id="disSexVal"></span>
				</td>
			</tr>

			<tr>
				<td colspan="2">三、心理社会方面</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>1、情志：</span>
					<label><input type="checkbox" name="modern" value="1" onclick="chkOne(this)" />平和</label>
					<label><input type="checkbox" name="modern" value="2" onclick="chkOne(this)" />开朗</label>
					<label><input type="checkbox" name="modern" value="3" onclick="chkOne(this)" />易怒</label>
					<label><input type="checkbox" name="modern" value="4" onclick="chkOne(this)" />忧郁</label>
					<label><input type="checkbox" name="modern" value="5" onclick="chkOne(this)" />焦虑</label>
					<label><input type="checkbox" name="modern" value="6" onclick="chkOne(this)" />恐惧</label>
					<label><input type="checkbox" name="modern" value="7" onclick="chkOne(this)" />内向</label>
					<label><input type="checkbox" name="modern" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'modern')" />
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>2、社交：</span>
					<label><input type="checkbox" name="social" value="1" onclick="chkOne(this)" />健谈</label>
					<label><input type="checkbox" name="social" value="2" onclick="chkOne(this)" />孤僻</label>
					<label><input type="checkbox" name="social" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'social')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					1、情志：<span id="modernVal"></span>
				</td>
				<td>
					2、社交：<span id="socialVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>3、家庭关系：</span>
					<label><input type="checkbox" name="family" value="1" onclick="chkOne(this)" />和睦</label>
					<label><input type="checkbox" name="family" value="2" onclick="chkOne(this)" />一般</label>
					<label><input type="checkbox" name="family" value="3" onclick="chkOne(this)" />差</label>
					<label><input type="checkbox" name="family" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'family')" />
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>4、经济情况：</span>
					<label><input type="checkbox" name="economic" value="1" onclick="chkOne(this)" />公费</label>
					<label><input type="checkbox" name="economic" value="2" onclick="chkOne(this)" />医保</label>
					<label><input type="checkbox" name="economic" value="3" onclick="chkOne(this)" />自费</label>
					<label><input type="checkbox" name="economic" value="oth" onclick="chkOne(this)" />其它</label>
					<input type="text" style="display: none" onkeyup="chgVal(this, 'economic')" />
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					3、家庭关系：<span id="familyVal"></span>
				</td>
				<td>
					4、经济情况：<span id="economicVal"></span>
				</td>
			</tr>

			<tr class="showTr">
				<td colspan="2">
					<span>5、自理能力：</span>
					<label><input type="checkbox" name="takeSelf" value="1" onclick="chkOne(this)" />自理</label>
					<label><input type="checkbox" name="takeSelf" value="2" onclick="chkOne(this)" />需协助</label>
					<label><input type="checkbox" name="takeSelf" value="3" onclick="chkOne(this)" />不能自理</label>
				</td>
			</tr>
			<tr class="showTr">
				<td colspan="2">
					<span>6、对疾病：</span>
					<label><input type="checkbox" name="illness" value="1" onclick="chkOne(this)" />了解</label>
					<label><input type="checkbox" name="illness" value="2" onclick="chkOne(this)" />部分了解</label>
					<label><input type="checkbox" name="illness" value="3" onclick="chkOne(this)" />不了解</label>
				</td>
			</tr>

			<tr class="prtTr">
				<td>
					5、自理能力：<span id="takeSelfVal"></span>
				</td>
				<td>
					6、对疾病：<span id="illnessVal"></span>
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div style="display: inline-block; width: 49%;">
						<span>主管护士：</span>
						<input placeholder="回车查询" class="userInput" type="text" id="charge-nurse" />
						<div class="signImgBox" style="display:none">
							<img src="javascript:;" title="" class="signPic">
						</div>
					</div>
					<div style="display: inline-block;">
						<span>护士长：</span>
						<input placeholder="回车查询" class="userInput" type="text" id="head-nurse" />
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
	function chkOne(e) {
		var type = $(e).attr("type");
		var name = $(e).attr("name");
		var value = $(e).attr("value");
		$('input[type=checkbox][name="' + name + '"]').not(e).attr("checked", false);

		if (name == 'allergy') {
			if (value === '2' && $("input[name='" + name + "']:checked").length == '1') {
				$('#gm').css("display", "inline-block");
				$('#gmPrt').css("display", "inline");
			} else {
				$('#gm').css("display", "none");
				$('#gm').children('input').each(function () {
					$(this).val('')
				});
				$('#gmPrt').css("display", "none");
				$('#gmPrt').children('input').each(function () {
					$(this).val('')
				});
			}
		} else if (name == 'causeOf') {
			var chkVal = $(e).parent().text();
			if (value === '1' && $("input[name='" + name + "']:checked").length == '1') {
				$('input[type=checkbox][name="yinshi"]').each(function () {
					$(this).attr("checked", false)
				});
				$('#wglyInfo').show();
				$('#yinshiInfo').hide()
				$('#causeOfTd').html(chkVal + "：" + '<span id="wglyVal"></span>')
			} else if (value === '3' && $("input[name='" + name + "']:checked").length == '1') {
				$('input[type=checkbox][name="wgly"]').each(function () {
					$(this).attr("checked", false)
				});
				$('#wglyInfo').hide();
				$('#yinshiInfo').show()
				$('#causeOfTd').html(chkVal + "：" + '<span id="yinshiVal"></span>')
			} else {
				$('input[type=checkbox][name="wgly"]').each(function () {
					$(this).attr("checked", false)
				});
				$('input[type=checkbox][name="yinshi"]').each(function () {
					$(this).attr("checked", false)
				});
				$('#wglyInfo').hide();
				$('#yinshiInfo').hide()
				$('#causeOfTd').html('')
			}
		}

		if (value === "oth") {
			if ($(e).is(':checked')) {
				$(e).parent().next("input").show()
			} else {
				$(e).parent().next("input").val('').hide()
			}
		} else {
			$('input[type=checkbox][name="' + name + '"][value="oth"]').parent().next("input").val('').hide()
		}
		chgVal(e, name);
	}

	function chgVal(e, name) {
		var type = $(e).context.type;
		var text = '';
		switch (type) {
			case 'text':
				text = $(e).val();
				if (text === '') {
					$('input[type=checkbox][name="' + name + '"]').each(function () {
						if ($(this).is(':checked'))
							text = text + $(this).parent().text()
					});
				}
				break;
			case 'select-one':
				text = $(e).find("option:selected").text();
				break;
			case 'checkbox':
				$('input[type=checkbox][name="' + name + '"]').each(function () {
					if ($(this).is(':checked'))
						text = text + $(this).parent().text()
				});
				break;

		}
		$('#' + name + 'Val').html(text)

	}
</script>