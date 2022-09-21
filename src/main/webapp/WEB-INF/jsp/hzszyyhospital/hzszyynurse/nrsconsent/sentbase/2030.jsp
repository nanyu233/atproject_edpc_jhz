<div id="ncz2030">
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<div ms-controller="timeRecord">
		<!-- <ul class="showym maintext">
			<li style="font-weight:700">
					<label>选择打印页数:</label>
					<label><input type="radio"id="page1" name="checkPage" value="0" checked="checked">打印全部</label>
					<label><input type="radio"id="page2" name="checkPage" value="1">第一页</label>
					<label><input type="radio"id="page3" name="checkPage" value="2">第二页</label>
			</li>
		</ul> -->
		<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicInfo.jsp"></jsp:include>
		<div>
			<ul class="maintext">
				<li>
				   	<label>日期:</label>
						<input id="currentDay" class="Wdate" type="text" readonly="readonly" style="width: 90px;" onclick="WdatePicker({dateFmt:'yyyy/MM-dd'})">
						<label>姓名:</label>
						<input type="text" class="intextinput datedate" style="width: 140px;" value="${hspemginfCustom.cstNam}" />
						<label>门/住ID:</label>
						<input type="text" class="intextinputlong" value="${hspemginfCustom.mpi}">
						<label>家属电话:</label>
						<input type="text" class="intextinput" style="width: 100px;"/>
						<label>医保类型:</label>
							<label class="checklabel" style="font-size: 12px">
								<input type="checkbox" name="yibao"> 城镇居民
							</label>
							<label class="checklabel" style="font-size: 12px">
								<input type="checkbox" name="yibao"> 城镇职工
							</label>
							<label class="checklabel" style="font-size: 12px">
								<input type="checkbox" name="yibao"> 新农合
							</label>
							<label class="checklabel" style="font-size: 12px">
								<input type="checkbox" name="yibao"> 自费
							</label>
				</li>
			</ul>
			<table class="managetable maintext2 borderTable">
				<colgroup>
					<col width="4%">
					<col width="22%">
					<col width="12%">
					<col width="12%">
					<col width="12%">
					<col width="13%">
					<col width="25%">
				</colgroup>
				<tr>
					<td rowspan="11" >
						<p style="font-weight: 700;font-size: 16px" class="titleText">院<br>前<br>系<br>统<br>︵<br>及<br>网<br>络<br>医<br>院<br>︶</p>
					</td>
					<td colspan="2">
						<label>姓名:</label>
						<input type="text" class="intextinput" style="width: 140px;" value="${hspemginfCustom.cstNam}" />
					</td>
					
					<td colspan="1"> 
						<label>性别:</label>
						<label class="checklabel">
							<input type="checkbox" name="sexCod" id="male"> 男
						</label>
						<label class="checklabel">
							<input type="checkbox" name="sexCod" id="female"> 女
						</label>
					</td>
					
					<td colspan="1">
						<label>年龄:</label>
						<input type="text" class="intextinput" id="cstAge" />
					</td>
					
					<td colspan="2">
						<label>发病地址:</label>
						<input type="text" class="intextinput"/>
						<label>省</label>
						<input type="text" class="intextinput">
						<label>市/县</label>
						<input type="text" class="intextinput">
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<label style="font-weight: 700">发病时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time1" onclick="setTimeFormat('MM-dd HH:mm', 'time1')">
					</td>
					<td colspan="2">
						<label style="font-weight: 700">呼救120时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time2" onclick="setTimeFormat('MM-dd HH:mm', 'time2')">
					</td>
					<td colspan="2">
						<label style="font-weight: 700">首次医疗接触时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time3" onclick="setTimeFormat('MM-dd HH:mm', 'time3')">
					</td>
				</tr>	
				
				<tr>
					<td colspan="3">
						<label style="font-weight: 700">网络医院入门时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time4" onclick="setTimeFormat('dd日 HH:mm', 'time4')">
					</td>
					<td colspan="3">
						<label style="font-weight: 700">转诊出门时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time5" onclick="setTimeFormat('dd日 HH:mm', 'time5')">
					</td>
				</tr>	
				
				<tr>
					<td colspan="3">
						<label style="font-weight: 700">院前首份心电图时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time6" onclick="setTimeFormat('dd日 HH:mm', 'time6')">
					</td>
					<td colspan="3">
						<label style="font-weight: 700">院前首份心电图确诊时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time7" onclick="setTimeFormat('dd日 HH:mm', 'time7')">
					</td>
				</tr>	
				
				<tr>
					<td colspan="2">
						<label style="font-weight: 700">远程传输心电图:</label>
						<label class="checklabel">
							<input type="checkbox" name="highrisk"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="highrisk"> 否
						</label>
					</td>
					<td colspan="2">
						<label>传输时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time8" onclick="setTimeFormat('dd HH:mm', 'time8')">
						
					</td>
					<td colspan="2">
						<label>传输方式:</label>
						<label class="checklabel">
							<input type="checkbox" name="transway"> 微信
						</label>
						<label class="checklabel">
							<input type="checkbox" name="transway"> 短信
						</label>
						<label class="checklabel">
							<input type="checkbox" name="transway"> 实时监控
						</label>
					</td>
				</tr>
		
				<tr>
					<td colspan="6">
						<label style="font-weight: 700">双联抗血小板药物给药:</label>
						<label class="checklabel">
							<input type="checkbox" name="doubleblood"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="doubleblood"> 否
						</label>
						
						<label>给药时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time9" onclick="setTimeFormat('HH:mm', 'time9')">;
						
						<label>阿司匹林(ASA)</label>
						<input type="text" class="intextinput"/>mg;
						<label>氯吡格雷</label>
						<input type="text" class="intextinput"/>mg/
						
						<label>替格瑞洛</label>
						<input type="text" class="intextinput"/>mg;
<!--  
						<label>立普妥</label>
						<input type="text" class="intextinput"/>mg
-->
					</td>
				
				</tr>
				
				<tr>
					<td colspan="2">
						<label style="font-weight: 700">院前溶栓筛查:</label>
						<label class="checklabel">
							<input type="checkbox" name="report"> 适合
						</label>
						<label class="checklabel">
							<input type="checkbox" name="report"> 不适合
						</label>
						<label class="checklabel">
							<input type="checkbox" name="report"> 未筛查
						</label>
					</td>
					
					<td colspan="3">
						<label style="font-weight: 700">是否实施院前溶栓:</label>
						<label class="checklabel">
							<input type="checkbox" name="isrs"> 有
						</label>
						<label class="checklabel">
							<input type="checkbox" name="isrs"> 无
						</label>
						
					</td>
					
					
					<td colspan="1">
						<label style="font-weight: 700">溶栓场所:</label>
						<label class="checklabel">
							<input type="checkbox" name="wherers"> 其他医院
						</label>
						<label class="checklabel">
							<input type="checkbox" name="wherers"> 救护车
						</label>
					</td>
				</tr>
				
				<tr>
					<td colspan="3"> 
						<label style="font-weight: 700">院前溶栓知情同意开始时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time10" onclick="setTimeFormat('MM-dd HH:mm', 'time10')">
					</td>
					<td colspan="3"> 
						<label style="font-weight: 700">签署知情同意时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time11" onclick="setTimeFormat('MM-dd HH:mm', 'time11')">
					</td>
				</tr>
				
				
				<tr>
					<td colspan="1">
						<label style="font-weight: 700">院前溶栓开始时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time12" onclick="setTimeFormat('HH:mm', 'time12')">
					</td>
					<td colspan="2">
						<label style="font-weight: 700">院前溶栓结束时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time13" onclick="setTimeFormat('HH:mm', 'time13')">
					</td>
					<td colspan="3">
						<label style="font-weight: 700">溶栓后造影时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time14" onclick="setTimeFormat('HH:mm', 'time14')">
						<label style="font-weight: 700">(心内科或导管室人员填写)</label>
					</td>
				</tr>
				
				
				<tr>
					<td colspan="2">
						<label style="font-weight: 700">院前溶栓药物:</label>
						<label class="checklabel">
							<input type="checkbox" name="rsmedicine"> 一代
						</label>
						<label class="checklabel">
							<input type="checkbox" name="rsmedicine"> 二代
						</label>
						<label class="checklabel">
							<input type="checkbox" name="rsmedicine"> 三代
						</label>
					</td>
					<td colspan="3">
						<label style="font-weight: 700">院前溶栓药物剂量:</label>
						<label class="checklabel">
							<input type="checkbox" name="rslevel"> 半量
						</label>
						<label class="checklabel">
							<input type="checkbox" name="rslevel"> 全量
						</label>
						
					</td>
					<td colspan="1">
						<label style="font-weight: 700">溶栓再通:</label>
						<label class="checklabel">
							<input type="checkbox" name="rsagain"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="rsagain"> 否
						</label>
						
					</td>
				</tr>
				
				
				<tr>
					<td colspan="3">
						<label>诊断:</label>
						<label class="checklabel" ms-repeat="list.hosDiagnoseList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
					
					<td colspan="2">
						<label>转运至:</label>
						<label class="checklabel">
							<input type="checkbox" name="zhuanyun">CPC
						</label>
						<label class="checklabel">
							<input type="checkbox" name="zhuanyun">导管室
						</label>
						<label class="checklabel">
							<input type="checkbox" name="zhuanyun">急诊
						</label>
					</td>
					<td colspan="1">
						<label style="font-weight: 700">填写人员签名:</label>
						<input type="text" class="intextinput" />
					</td>
				</tr>
		<!-- </table>		
				
		
		
		-----------------------------我是分割线 ------------------------------
		
		<br>
		<br>
		<br>
		-----------------------------急诊预检表-------------------------------------
		<table class="managetable maintext2 borderTable"> -->
		
			<tr>
				<td rowspan="5">
					<p style="font-weight: 700;font-size: 16px" class="titleText">急<br>诊<br>预<br>检</p>
				</td>
					<td colspan="1">
					<label>姓名:</label>
					<input type="text" class="intextinput" style="width: 100px;" value="${hspemginfCustom.cstNam}" />
				</td>
				
				<td colspan="2"> 
					<label>性别:</label>
					<label class="checklabel">
						<input type="checkbox" name="sensitive" id="male"> 男
					</label>
					<label class="checklabel">
						<input type="checkbox" name="sensitive" id="female"> 女
					</label>
				</td>
				
				<td colspan="1">
					<label>年龄:</label>
					<input type="text" class="intextinput" id="cstAge" />
				</td>
				
				<td colspan="2">
					<label>发病地址:</label>
					<input type="text" class="intextinput"/>
					<label>省</label>
					<input type="text" class="intextinput">
					<label>市/县</label>
					<input type="text" class="intextinput">
				</td>
				</tr>
		
				<tr>
					<td colspan="1">
						<label style="font-weight: 700">发病时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time15" onclick="setTimeFormat('MM-dd HH:mm', 'time15')">
					</td>
					<td colspan="3">
						<label style="font-weight: 700">到达医院大门时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time16" onclick="setTimeFormat('MM-dd HH:mm', 'time16')">
					</td>
					<td colspan="2">
						<label style="font-weight: 700">院内接诊时间(门急诊分诊时间):</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time17" onclick="setTimeFormat('MM-dd HH:mm', 'time17')">
					</td>
				</tr>	
				
				<tr>
					<td colspan="6">
						<label style="font-weight: 700">到达方式:</label>
						<label class="checklabel">
							<input type="checkbox" name="arriveWay"> 120救护车
						</label>
						<label class="checklabel">
							<input type="checkbox" name="arriveWay"> 外院运转(包含网络医院)
						</label>
						<label class="checklabel">
							<input type="checkbox" name="arriveWay"> 自行来院
						</label>
						<br>
						<label class="checklabel">
							<input type="checkbox" class="illHsp" onchange="isChecked('illHsp')"> 院内发病
						</label>
						
						(
							<label style="font-weight: 700">发病科室:</label>
							<input type="text" class="intextinputlong illHspInput" onkeyup="isText('illHsp')"/>;
							<label style="font-weight: 700">床位医师接触时间:</label>
							<input class="Wdate spcWdate datedate illHspInput" type="text" readonly="readonly" id="time18" onclick="setTimeFormat('MM-dd HH:mm', 'time18')" onkeyup="isText('illHsp')">;
							<label style="font-weight: 700">患者离开科室时间:</label>
							<input class="Wdate spcWdate datedate illHspInput" type="text" readonly="readonly" id="time19" onclick="setTimeFormat('MM-dd HH:mm', 'time19')" onkeyup="isText('illHsp')">
						)
						
						
					</td>
				</tr>
				
				<tr>
					<td colspan="6">
						<label>生命体征:</label>
						<label>意识</label>
						<label class="checklabel">
							<input type="checkbox" name="yishi"> 清醒
						</label>
						<label class="checklabel">
							<input type="checkbox" name="yishi"> 对语言有反应
						</label>
						<label class="checklabel">
							<input type="checkbox" name="yishi"> 对刺痛有反应
						</label>
						<label class="checklabel">
							<input type="checkbox" name="yishi"> 对任何刺激无反应
						</label>
						<br>
						<label>呼吸</label>
						<input type="text" class="intextinput"/>次/分
						<label>脉搏</label>
						<input type="text" class="intextinput"/>次/分
						<label>心率</label>
						<input type="text" class="intextinput"/>次/分
						<label>血压:</label>
						<input type="text" class="intextinput"/>/
						<input type="text" class="intextinput"/>mmHg
						<label>体温:</label>
						<input type="text" class="intextinput"/>℃
					</td>
				</tr>
				
				<tr>
					<td colspan="4">
						
						<label class="checklabel">
							<input type="checkbox" name="zhenshi">至胸痛诊室(急诊内科)
						</label>
						<label class="checklabel">
							<input type="checkbox" name="zhenshi">至急救科抢救室
						</label>
						<label class="checklabel">
							<input type="checkbox" name="zhenshi">至导管室
						</label>
					</td>
					
					<td colspan="2">
						<label style="font-weight: 700">分诊护士签名:</label>
						<input type="text" class="intextinput" />
					</td>
				</tr>
		
		
				<tr>
					<td rowspan="7" >
						<p style="font-weight: 700;font-size: 16px" class="titleText">胸<br>痛<br>诊<br>室<br>︵<br>急<br>诊<br>内<br>科<br>︶<br>发<br>病<br>科<br>室</p>
					</td>
					<td colspan="2">
						<label style="font-weight: 700">院内首份心电图时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time20" onclick="setTimeFormat('HH:mm', 'time20')">
					</td>
					<td colspan="3">
						<label style="font-weight: 700">院内首份心电图确诊时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time21" onclick="setTimeFormat('HH:mm', 'time21')">
					</td>
					
					
					
					<!-- 右侧部分 -->
					
					<td rowspan="15" colspan="1" style="line-height:2.2">
						<label style="font-weight: 700">由实际判定或实施人员勾选:</label>
						<br>
						<label style="font-weight: 700">Killip分级:</label>
						<label class="checklabel">
							<input type="checkbox" name="KillIp">Ⅰ
						</label>
						<label class="checklabel">
							<input type="checkbox" name="KillIp">Ⅱ
						</label>
						<label class="checklabel">
							<input type="checkbox" name="KillIp">Ⅲ
						</label>
						<label class="checklabel">
							<input type="checkbox" name="KillIp">Ⅳ
						</label>
						<br>
						
						<label style="font-weight: 700">NYHA 分级:</label>
						<label class="checklabel">
							<input type="checkbox" name="NYHA">Ⅰ
						</label>
						<label class="checklabel">
							<input type="checkbox" name="NYHA">Ⅱ
						</label>
						<label class="checklabel">
							<input type="checkbox" name="NYHA">Ⅲ
						</label>
						<label class="checklabel">
							<input type="checkbox" name="NYHA">Ⅳ
						</label>
						
						<label style="font-weight: 700">具备任意一条即为极高危:</label>
						<br>
						<label class="checklabel" ms-repeat="list.highriskList">
							<input type="checkbox" /> {{el}}
						</label>
						<br>
						<label style="font-weight: 700">STEMI再灌注措施:</label>
						<br>
						<label class="checklabel" ms-repeat="list.measuresList">
							<input type="checkbox" /> {{el}}
						</label>
						<br>
						<label style="font-weight: 700">NSTE-ACS血运重建措施:</label>
						<br>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">紧急PCI
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">紧急仅造影
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">转运
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">24h内介入
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">72h内介入
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">早期仅造影
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">择期介入
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">保守治疗
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">CAGB
						</label>
						<label class="checklabel">
							<input type="checkbox" name="STEMI">其他
						</label>
						<br>
						<label style="font-weight: 700">实际介入时间(运转PCI):</label>
						<br>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time22" onclick="setTimeFormat('MM-dd HH:mm', 'time22')">
						
						<br>
						<label style="font-weight: 700">双联抗血小板药物给药时间:</label>
						<br>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time23" onclick="setTimeFormat('MM-dd HH:mm', 'time23')">
						<br>
						<label>阿司匹林(ASA)</label>
						<input type="text" class="intextinput"/>mg;
						<label>氯吡格雷</label>
						<input type="text" class="intextinput"/>mg/
						
						<label>替格瑞洛</label>
						<input type="text" class="intextinput"/>mg;
						
						
						<label style="font-weight:700">24小时他汀治疗:</label>
						<label class="checklabel">
							<input type="checkbox" name="skin"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="skin"> 否
						</label>
						<br>
						<label style="font-weight:700">β受体阻滞剂使用:</label>
						<label class="checklabel">
							<input type="checkbox" name="inform"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="inform"> 否
						</label>
						
						<br>
						<label>填写人签名:</label>
						<input type="text" class="intextinput" />
						
					</td>
				</tr>	
				
				<!-- 右侧部分完-->
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">病情评估及合并情况:</label>
						<label class="checklabel" ms-repeat="list.conditionAssessList">
							<span ms-if="$index === 5"></span>
							<input type="checkbox" /> {{el}}
						</label>
						
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">肌钙蛋白抽血完成时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time24" onclick="setTimeFormat('HH:mm', 'time24')">;
						<label style="font-weight: 700">获得报告时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time25" onclick="setTimeFormat('HH:mm', 'time25')">
						<input type="text" class="intextinput"/>ng/ml;
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label>实验室检查:Cr:</label>
						<input type="text" class="intextinput"/>umol/l;&nbsp;
						<label>D-dimer:</label>
						<input type="text" class="intextinput"/>mg/L FEU;&nbsp;
						<label>BNP/NT-proBNP:</label>
						<input type="text" class="intextinput"/>pg/ml
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label>辅助检查:</label>
						<label>通知心超检查时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time26" onclick="setTimeFormat('HH:mm', 'time26')">;
						<label>心超检查完成时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time27" onclick="setTimeFormat('HH:mm', 'time27')">;
						<br>
						<label>通知CT检查时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time28" onclick="setTimeFormat('HH:mm', 'time28')">;
						<label>增强CT检查开始时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time29" onclick="setTimeFormat('HH:mm', 'time29')">;
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">诊断:</label>
						<label class="checklabel" ms-repeat="list.diagnoseList">
							<input type="checkbox" /> {{el}}
						</label>
						<br/>
						<label style="font-weight: 700">诊断时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time30" onclick="setTimeFormat('HH:mm', 'time30')">
					</td>
				</tr>
				
				<tr>
					<td colspan="3">
						<label>是否呼叫心内科会诊:</label>
						<label class="checklabel">
							<input type="checkbox" name="callXNK"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="callXNK"> 否
						</label>
						<label>呼叫时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time31" onclick="setTimeFormat('HH:mm', 'time31')">
					</td>
					
					<td colspan="2">
						<label style="font-weight: 700">填写人员签名:</label>
						<input type="text" class="intextinput" />
					</td>
				</tr>
				
<!-- 我是分割线-->
				
				<tr>
					<td rowspan="4">
						<p style="font-weight: 700;font-size: 16px" class="titleText">心<br>内<br>科<br>会<br>诊</p>
						
					</td>
					<td colspan="2">
						<label>会诊时间(包含远程会诊):</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time32" onclick="setTimeFormat('HH:mm', 'time32')">
					</td>
					<td colspan="3">
						<label style="font-weight: 700">会诊医师签名:</label>
						<input type="text" class="intextinput" />
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">诊断:</label>
						<label class="checklabel" ms-repeat="list.diagnoseList">
							<input type="checkbox" /> {{el}}
						</label>
						<br/>
						<label style="font-weight: 700">诊断时间:</label>
						<input class="Wdate spcWdate clockdateB" type="text" readonly="readonly" id="time33" onclick="setTimeFormat('HH:mm', 'time33')">
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">决定介入手术时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time34" onclick="setTimeFormat('HH:mm', 'time34')">;
					
						<label style="font-weight: 700">启动导管室时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time35" onclick="setTimeFormat('HH:mm', 'time35')">
						<br>
						<label style="font-weight: 700">开始知情同意时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time36" onclick="setTimeFormat('HH:mm', 'time36')">;
				
						<label style="font-weight: 700">签署知情同意书时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time37" onclick="setTimeFormat('HH:mm', 'time37')">
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">院内溶栓筛查:</label>
						<label class="checklabel">
							<input type="checkbox" name="checkRS"> 合适
						</label>
						<label class="checklabel">
							<input type="checkbox" name="checkRS"> 不合适
						</label>
						
						<label style="font-weight: 700">实施院内溶栓:</label>
						<label class="checklabel">
							<input type="checkbox" name="doRS"> 有
						</label>
						<label class="checklabel">
							<input type="checkbox" name="doRS"> 无
						</label>
						<br>
						
					
						<label style="font-weight: 700">院前溶栓开始时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time38" onclick="setTimeFormat('HH:mm', 'time38')">
				
						<label style="font-weight: 700">院前溶栓结束时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time39" onclick="setTimeFormat('HH:mm', 'time39')">
						<label style="font-weight: 700">溶栓后造影时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time40" onclick="setTimeFormat('HH:mm', 'time40')">
						<br>
						
						<label style="font-weight: 700">溶栓药物:</label>
						<input type="text" class="intextinputlong" />;
						<label style="font-weight: 700">溶栓药物剂量:</label>
						<input type="text" class="intextinputlong" />;
						<br>
						
						<label style="font-weight: 700">溶栓再通:</label>
						<label class="checklabel">
							<input type="checkbox" name="rsAgain"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="rsAgain"> 否
						</label>
					</td>
				</tr>
				
				
				<!-- 我还是分割线 -->
				
				
				<tr>
					<td rowspan="4" >
						<p style="font-weight: 700;font-size: 16px" class="titleText">急<br>诊<br>留<br>观<br><br>心<br>内<br>病<br>房</p>
					</td>
					<td colspan="2">
						<label>复测心电图时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time41" onclick="setTimeFormat('HH:mm', 'time41')">
			
					</td>
					
					<td colspan="3">
						<label style="font-weight: 700">肌钙蛋白复测结果:</label>
						<input type="text" class="intextinput"/>ng/ml;
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<label style="font-weight: 700">复测肌钙蛋白抽血完成时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time42" onclick="setTimeFormat('HH:mm', 'time42')">
			
					</td>
					<td colspan="3">
						<label style="font-weight: 700">复测肌钙蛋白报告时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time43" onclick="setTimeFormat('HH:mm', 'time43')">
			
					</td>
				</tr>
				
				
				<tr>
					<td colspan="5">
					
						<label>Grace危险分层:</label>
						<label class="checklabel">
							<input type="checkbox" name="checkRS"> 极高危
						</label>
						<label class="checklabel">
							<input type="checkbox" name="checkRS"> 高危
						</label>
						<label class="checklabel">
							<input type="checkbox" name="checkRS"> 中危
						</label>
						<label class="checklabel">
							<input type="checkbox" name="checkRS"> 低危
						</label>
						<br>
						<label>具备任意一条即为极高危:</label>
						<br>
						<label class="checklabel" ms-repeat="list.highriskList">
							<input type="checkbox" /> {{el}}
						</label>
						
					</td>
				</tr>
				
				<tr>
					<td colspan="5">
						<label style="font-weight: 700">诊断:</label>
						<label class="checklabel" ms-repeat="list.diagnoseList">
							<input type="checkbox" /> {{el}}
						</label>
						<br/>
						<label style="font-weight: 700">诊断时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time44" onclick="setTimeFormat('HH:mm', 'time44')">
					</td>
				</tr>
				
				<!-- 分割线 -->
				
				<tr>
					<td rowspan="11">
						<p style="font-weight: 700;font-size: 16px" class="titleText">导<br>管<br>室</p>
					</td>
					<td colspan="3">
						<label style="font-weight: 700">急诊PCI启动方式:</label>
						<label class="checklabel">
							<input type="checkbox" name="startPCI"> 绕行急诊
						</label>
						<label class="checklabel">
							<input type="checkbox" name="startPCI"> 绕行CCU
						</label>
						<label class="checklabel">
							<input type="checkbox" name="startPCI"> 病房启动
						</label>
					</td>
					
					<td colspan="2">
						<label>介入医生:</label>
						<input type="text" class="intextinput" />
					</td>
					
					<td colspan="1">
						<label>导管室激活时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time45" onclick="setTimeFormat('HH:mm', 'time45')">
					</td>
				</tr>
				
				<tr>
					<td colspan="4">
						<label>PCI血管路径:</label>
						<label class="checklabel">
							<input type="checkbox" name="PCIblood"> 桡动脉(左)
						</label>
						<label class="checklabel">
							<input type="checkbox" name="PCIblood"> 桡动脉(右)
						</label>
						<label class="checklabel">
							<input type="checkbox" name="PCIblood"> 股动脉
						</label>
						<label class="checklabel">
							<input type="checkbox" name="PCIblood"> 其他
						</label>
					</td>
					
					<td colspan="2">
						<label>开始穿刺时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time46" onclick="setTimeFormat('HH:mm', 'time46')">
					</td>
					
				</tr>
				
				<tr>
					<td colspan="1">
						<label>造影开始时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time47" onclick="setTimeFormat('HH:mm', 'time47')">
					
					</td>
					<td colspan="2">
						<label>导丝通过时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time48" onclick="setTimeFormat('HH:mm', 'time48')">
					
					</td>
					<td colspan="2">
						<label>手术完成时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time49" onclick="setTimeFormat('HH:mm', 'time49')">
					
					</td>
					
					<td colspan="1">
						<label>阻塞性病变:</label>
						<label class="checklabel">
							<input type="checkbox" name="pathology"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="pathology"> 否
						</label>
					
				</tr>
				
				<tr>
					<td rowspan="2" colspan="3">
					
					<img style="float: left;width:160px;height:109px" src="../images/hzszyyhems/nurse/dgs.png">
					
					<label>
						1:右冠近段 2:右冠中段3:右冠远段<br>
						4:后降支（右优势型）5:左主干 <br>
						6:降支近段7:降支中段 8:降支远段<br>
						9:第一对角支 10:第二对角支<br>
						11:旋支近段 12:第一钝缘支<br>
						13:旋支远段 14:左室后支<br>
						15:后降支(左优势型或均衡型)	
					</label>
					
					</td>
					<td colspan="3">
						<p>拓展项:16:中间支 17:第三对角支 18:第二钝缘支19:
									第三钝缘支 20:锐缘支 21:左圆锥支
									22:右圆锥支 23:室间隔支 24:左后外侧支
									25:右后外侧支 26:房室沟动脉 27:后降支室间隔支</p>
					</td>
				</tr>
				
				<tr>
					<td colspan="3">
						<label>罪犯血管编码:</label>
						<input type="text" class="intextinput" />
						<br/>
						<label>狭窄程度:</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> ＜50%
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 50-69%
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 70-89%
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 90-99%
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 100%
						</label>

						<label>术前TIMI</label>
						<input type="text" class="intextinput" />级、
						<label>术后TIMI</label>
						<input type="text" class="intextinput" />级;
						<br>
						<label>非罪犯血管狭窄>50%:</label>
						<label class="checklabel">
							<input type="checkbox" name="narrow50"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrow50"> 否
						</label>
						<label>编码:</label>
						<input type="text" class="intextinput" />
					</td>
				</tr>
				
				<tr>
					<td colspan="1">
						<label>支架内血栓:</label>
						<label class="checklabel">
							<input type="checkbox" name="xueshuan"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="xueshuan"> 否
						</label>
					</td>
					
					<td colspan="2">
						<label>分叉病变:</label>
						<label class="checklabel">
							<input type="checkbox" name="fencha"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="fencha"> 否
						</label>
					</td>
					
					<td colspan="2">
						<label>分叉病变:</label>
						<label class="checklabel">
							<input type="checkbox" name="CTO"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="CTO"> 否
						</label>
					</td>
					
					<td colspan="1">
						<label>植入支架个数:</label>
						<input type="text" class="intextinput" />
					</td>
				</tr>
				
				
				<tr>
					<td colspan="6">
						<label>首次抗凝:</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 普通肝素
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 比伐芦定
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 低分子肝素
						</label>
						<label class="checklabel">
							<input type="checkbox" name="narrowLevel"> 黄达肝葵钠;
						</label>
						<label>罪犯血管编码:</label>
						<input type="text" class="intextinputlong" />
						
						<label>给药时间:</label>
						<input class="Wdate clockdateB" type="text" readonly="readonly" id="time50" onclick="setTimeFormat('HH:mm', 'time50')">
					
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<label>腔内影像:</label>
						<label class="checklabel">
							<input type="checkbox" name="qnView"> IVUS
						</label>
						<label class="checklabel">
							<input type="checkbox" name="qnView"> OCT
						</label>
						<label class="checklabel">
							<input type="checkbox" name="qnView"> 其他
						</label>
						<label class="checklabel">
							<input type="checkbox" name="qnView"> 无
						</label>
					</td>
					
					<td colspan="2">
						<label>功能检测:</label>
						<label class="checklabel">
							<input type="checkbox" name="functionCheck"> FFR
						</label>
						<label class="checklabel">
							<input type="checkbox" name="functionCheck"> 其他
						</label>
						<label class="checklabel">
							<input type="checkbox" name="functionCheck"> 无
						</label>
					</td>
					
					<td colspan="1">
						<label>IABP植入:</label>
						<label class="checklabel">
							<input type="checkbox" name="IABP"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="IABP"> 否
						</label>
					
					</td>
					<td colspan="1">
						<label>血栓抽吸:</label>
						<label class="checklabel">
							<input type="checkbox" name="xscx"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="xscx"> 否
						</label>
					
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<label>临时起搏器植入:</label>
						<label class="checklabel">
							<input type="checkbox" name="ERI"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="ERI"> 否
						</label>
					</td>
					
					<td colspan="2">
						<label>ECMO:</label>
						<label class="checklabel">
							<input type="checkbox" name="ECMO"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="ECMO"> 否
						</label>
					</td>
					<td colspan="2">
						<label>左心室辅助装置:</label>
						<label class="checklabel">
							<input type="checkbox" name="leftven"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="leftven"> 否
						</label>
					</td>
				</tr>
				
				<tr>
					<td colspan="6">
						<label>术中并发症:</label>
						<label class="checklabel" ms-repeat="list.complicationsList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<label style="font-weight: 700">D2B时间:</label>
						<input type="text" class="intextinput"/>分钟
					</td>
					<td colspan="3">
						<label>是否延误:</label>
						<label class="checklabel">
							<input type="checkbox" name="isLate"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="isLate"> 否
						</label>(具体原因请询问术者)
					</td>
					<td colspan="1">
						<label style="font-weight:700">填写人签名:</label>
						<input type="text" class="intextinput" />
					</td>
					
				</tr>
				
				<!-- ------------------------------------------我是最后一条分割线才怪------------------------------------------------ -->
				
				<tr>
					<td rowspan="8">
						<p style="font-weight: 700;font-size: 16px" class="titleText">出<br>院<br>转<br>归</p>
					</td>
					<td colspan="4">
						<label>转归:</label>
						<label class="checklabel" ms-repeat="list.goHosList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
					<td colspan="2">
						<label>死亡原因:</label>
						<label class="checklabel">
							<input type="checkbox" name="reasonDeth"> 心源性
						</label>
						<label class="checklabel">
							<input type="checkbox" name="reasonDeth"> 非心源性
						</label>
					</td>
				</tr>
				
				<tr>
					<td colspan="4">
						<label>出院诊断:</label>
						<label class="checklabel" ms-repeat="list.diagnoseList2">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
					<td colspan="2">
						<label>确诊时间:</label>
						<input class="Wdate datedate" type="text" readonly="readonly" id="time51" onclick="setTimeFormat('MM-dd HH:mm', 'time51')">
					</td>
				</tr>
				
				<tr>
					<td colspan="1">
						<label>72h内肌钙蛋白最高值:</label>
						<input type="text" class="intextinputshort" />
					</td>
					<td colspan="3">
						<label class="checklabel">
							<input type="checkbox" name="choose"> BNP
						</label>
						<label class="checklabel">
							<input type="checkbox" name="choose"> NT-proBNP
						</label>
						<label>最高值:</label>
						<input type="text" class="intextinput" />
					</td>
					<td colspan="2">
						<label>超声心动图&nbsp;LVEF</label>
						<input type="text" class="intextinput"/>%(最低值)
					</td>
				</tr>
				
				<tr>
					<td colspan="6">
						<label>合并症:</label>
						<label class="checklabel" ms-repeat="list.complicationsList2">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
				</tr>
				<tr>
					<td colspan="6">
						<label>心血管疾病危险因素:</label>
						<label class="checklabel" ms-repeat="list.cardiovascularList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
				</tr>
				
				<tr>
					<td colspan="1">
						<label>院内新发心力衰竭:</label>
						<label class="checklabel">
							<input type="checkbox" name="isInHos"> 是
						</label>
						<label class="checklabel">
							<input type="checkbox" name="isInHos"> 否
						</label>
					</td>
					
					<td colspan="2">
						<label>确诊时间:</label>
						<input class="Wdate spcWdate datedate" type="text" readonly="readonly" id="time52" onclick="setTimeFormat('MM-dd HH:mm', 'time52')">
					</td>
					
					<td colspan="2">
						<label>住院天数:</label>
						<input type="text" class="intextinput"/>天
					</td>
					
					<td colspan="1">
						<label>总费用:</label>
						<input type="text" class="intextinput"/>元
					</td>
				</tr>
				
				<tr>
					<td colspan="3">
						<label>治疗结果:</label>
						<label class="checklabel" ms-repeat="list.treatList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
					<td colspan="3">
						<label>离院宣教:</label>
						<label class="checklabel" ms-repeat="list.propagandaList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
				</tr>
				
				<tr>
					<td colspan="4">
						<label>出院带药:</label>
						<label class="checklabel" ms-repeat="list.takeMedicineList">
							<input type="checkbox" /> {{el}}
						</label>
					</td>
					<td colspan="2">
						<label style="font-weight:700">填写人签名:</label>
						<input type="text" class="intextinput" />
					</td>
					
				</tr>
		</table>
		<!-- -------------------------------------------我是分割线 ------------------------------------------------------------- -->

		</div>
	</div>
</div>
<script type="text/javascript">
  var vm = avalon.define({
		$id: 'timeRecord',
		list: {
			conditionAssessList: ['持续性症状', '间断性症状', '胸痛症状已缓解', '腹痛', '齿痛', '肩背痛', '呼吸困难', '休克', '突发意识丧失', '合并心衰','合并恶性心律失常','合并出血'],
			medicalContactList: ['其他医疗机构', '120救护车', '本院急诊科', '本院心内科门诊', '本院心内科病房'],
			diagnoseList: ['诊断中', 'STEMI', 'NSTEMI', 'UA', '主动脉夹层', '肺栓塞', '非ACS心源性心痛','其他非心源性胸痛','放弃诊疗,病因不明','诊断明确,患者放弃后续诊疗'],
			diagnoseList2: [ 'STEMI', 'NSTEMI', 'UA', '主动脉夹层', '肺栓塞', '非ACS心源性心痛','其他非心源性胸痛'],
			subDiagnoseList: ['呼吸','消化', '神经', '精神', '肌肉骨骼', '皮肤'],
			measureList: ['改善循环', '护胃', '止痛', '抗感染', '随诊'],
			goAwayList: ['CPC', '导管室',  '急诊'],
			measuresList: ['急诊 PCI', '溶栓', '补救 PCI', '急诊仅造影', '择期 PCI','转运PCI', '择期仅造影', 'CABG', '无再灌注措施','其他'],
			emergencyTitleList: [{titleA: '决定介入手术时间:', titleB: '启动导管室时间:'}, { titleA: '开始知情同意:', titleB: '签署知情同意书:' }, { titleA: '导管室激活时间:', titleB: '患者到达导管室时间:' },
			{ titleA: '开始穿刺时间:', titleB: '穿刺成功时间:' }, { titleA: '造影开始时间:', titleB: '造影结束时间:' }, { titleA: '造影开始时间:', titleB: '造影结束时间:' }, { titleA: '导管通过时间:', titleB: '手术结束时间:' }],
			hosDiagnoseList: ['STEMI', 'NSTEMI', 'UA', '主动脉夹层', '肺动脉栓塞', '其他'],
			goHosList: ['好转出院', '转送其他医院', '转送其他科室', '死亡'],
			treatList: ['治愈', '好转', '脑死亡离院', '其他原因离院'],
			takeMedicineList: ['DAPT;', 'ACEI/ARB;', '他汀;', 'β-受体阻滞剂'],
			highriskList:['药物无法控制的顽固性心绞痛','危及生命的室性心律失常','血流动力学不稳或心源性休克','心肌梗死的机械并发症','严重心衰'],
			complicationsList:['无','恶性心率失常','低血压','慢血流/无复流','血管夹层','非干预血管急性闭塞','血管穿孔','死亡','其他'],
			complicationsList2:['无','心衰','休克','机械性并发症','感染','再发心梗','血栓','卒中','TIA','出血','呼吸衰竭','肾衰竭','死亡'],
			cardiovascularList:['高血压','高脂血症','血糖升高','吸烟','肥胖','有家族史','有既往心脏病史','有既往血运重建史'],
			propagandaList:['戒烟','规律坚持服药','遵医嘱随访治疗','生活起居调护','危险因素空值','未作']
		},
		msg: {
			treat: [],
			goHos: []
		},
		setRadio: function (obj, idx) {
			idx = idx.toString();
			if (vm.msg[obj].length > 1) {
				vm.msg[obj] = [idx]
			}
		}
	})
	function isChecked (ckClass) {
		var inputClass =  ckClass + 'Input';
		if (!$('.' + ckClass).attr('checked')) {
			$('.' + inputClass).val('')
		}
	}

	function isText (ckClass) {
		var inputClass = ckClass + 'Input';
		if ($('.' + inputClass).val()) {
			$('.' + ckClass).attr('checked', 'true')
		}
	}
	function exchangeToNum (it, intNumFlag) {
		if (intNumFlag) {
			it.value = it.value.replace(/[^0-9]/g, '');
		} else {
			it.value = it.value.replace(/[^0-9.]/g, '');
		}
	}
	
	function setTimeFormat (format, id) {
		if (format == 'dd日 HH:mm' || format == 'dd HH:mm') {
			$('#' + id).val(publicFun.timeFormat(new Date(), format.replace(/HH/, 'hh')).substr(2))
		} else if (format == 'HH:mm') {
			$('#' + id).val(publicFun.timeFormat(new Date(), format.replace(/HH/, 'hh')).substr(4))
		} else {
			$('#' + id).val(publicFun.timeFormat(new Date(), format.replace(/HH/, 'hh')))
		}
		WdatePicker({dateFmt: format})
	}

	$(function(){
    var _sex = '${hspemginfCustom.cstSexCod}';
    if(_sex == '男'){
      $('input[name = "sexCod"][id="male"]').attr('checked',true);
      $('input[name = "sexCod"][id="female"]').attr('checked',false)
    }else if(_sex == '女'){
      $('input[name = "sexCod"][id="female"]').attr('checked',true);
      $('input[name = "sexCod"][id="male"]').attr('checked',false)
    }
		if ('${hspemginfCustom.cstAge}') {
			$('#cstAge').val('${hspemginfCustom.cstAge}${hspemginfCustom.cstAgeCod}')
		}
		if (!$('#currentDay').val()) {
			$('#currentDay').val(publicFun.timeFormat(new Date(), 'yyyy/MM-dd'))
		}
    $('.docuTitleBaisc').html('胸痛时间管理记录表')
	})
</script>