<div id="s1056">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicZqty.jsp"></jsp:include>
<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr>
					<td style="width: 25%">
						<label id="id_1">患者姓名:</label>
						<input type="text" class="input_txt cstNam" style="width: 100px;"/>
					</td>
					<td style="width: 15%">
						<label id="id_2">性别:</label>
						<input type="text" class="input_txt cstSexCod" style="width: 40px;"/>
					</td>
					<td style="width: 16%">
						<label id="id_3">年龄:</label>
						<input type="text" class="input_txt age" style="width: 40px;"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">科室:</label>
						<input type="text" class="input_txt emgFkCod" style="width: 100px;"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">病历号:</label>
						<input type="text" class="input_txt mpi" style="width: 96px;"/>
					</td>
				</tr>
				
			</table>
			<table border="1" cellspacing="" cellpadding="" id="table" class="tbody">
				<tr>
					<th width="50%" id="tr_1_1">手术名称：</th>
					<th width="500px" id="tr_2_1" >
						<ul>
							<li>
								<label class="checklabel" float: left;>
									操作场所：<input type="checkbox">心导管室
								</label>
								<label class="checklabel" float: left;>
									<input type="checkbox">其他<input id="tr_1_2" type="text" class="input_table" style="width: 80px;"/>
								</label>
							</li>
						</ul>
					</th>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								患者身份正确
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>辅助检查</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label>有无检查</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label>异常</label>    
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								病史与体格检查（书写者签名）
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>血常规</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								术前小结
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>电解质</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								知情同意书，授权书 
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>心肌酶谱</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								200元以上签字书
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>肌钙蛋白 </label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								生命体征是否稳定
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>术前四项</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								体温（≤37.5℃） 
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>凝血功能全套</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 20%;float: left;">
								血压
							</li>					
							<li style="width: 70%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="text" style="width: 50px"/>/<input id="tr_1_2" type="text" style="width: 50px"/>mmHg</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>肾功能</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								特殊病史：
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>甲状腺功能</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								脑梗塞、脑出血 
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>粪便隐血</label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								消化道出血
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>尿常规 </label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								肾功能不全
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>心电图  </label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								心功能不全
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								术前用药：
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								波利维
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>心脏超声 </label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								阿斯匹林 
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>食道超声 </label>    
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>
							<li style="width: 28%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								华法令 
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 28%;float: left;">
								<label>其他： </label>    
							</li>
							<li style="width: 70%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="text"/></label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								低分子肝素  
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								碘过敏
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>无</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>有</label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px" colspan="2">
						<ul>
							<li style="width: 60%;float: left;">
								医生签名：
								<label class="doctorType"><input id="tr_1_2" type="text" style="width: 200px"/></label>
								<span id="dzqm"></span>
							</li>	
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px" colspan="2">
						<ul>
							<li style="width: 60%;float: left;">
								日期：
								<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
							</li>					
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 100%;float: left;">
								手术开始前共同核查（Time Out）
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width:100%;float: left;">
								<label>特殊患者需要出去下列： </label>    
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 100%;float: left;">
								在手术或操作前小组成员暂停手头一切工作，共同核对以下内容：
							</li>					
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 60%;float: left;">
								假牙
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>否</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								患者身份正确
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>				
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 60%;float: left;">
								隐形眼镜
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>否</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								手术名称正确
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>				
						</ul>
					</td>
					<td>
						<ul>
							<li style="width: 60%;float: left;">
								饰品
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>否</label>
							</li>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								相关书面文档（实验室、影像学治疗、病史和体格检查等）在病史中
							</li>					
							<li style="width: 30%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>				
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								植入物和特殊器材准备就绪
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>				
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>否</label>
							</li>				
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								术前预防性抗生素已经使用
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>				
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>否</label>
							</li>				
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 60%;float: left;">
								患者碘酒过敏
							</li>					
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>是</label>
							</li>				
							<li style="width: 20%;float: left;">
								<label class="doctorType"><input id="tr_1_2" type="checkbox"/>否</label>
							</li>				
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 80%;float: left;">
								小组成员核对无误后签名： 
								<label class="doctorType"><input id="tr_1_2" type="text"/></label>
							</li>					
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
				<tr>
					<td height="27px">
						<ul>
							<li style="width: 80%;float: left;">
								日期、时间： 
								<input id="value_11" class="Wdate spcWdate" type="text" style="width: 120px;" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">	
							</li>					
						</ul>
					</td>
					<td>
						<ul>
						</ul>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	function getText(){
		var lab_t1 = document.getElementById("id_title1").innerText;
		var lab_t2 = document.getElementById("id_title2").innerText;
		var lab1 = document.getElementById("id_1").innerText;
		var lab2 = document.getElementById("id_2").innerText;
		var lab3 = document.getElementById("id_3").innerText;
		var lab4 = document.getElementById("id_4").innerText;
		var lab5 = document.getElementById("id_5").innerText;
		var lab6 = document.getElementById("id_6").innerText;
		var lab7 = document.getElementById("id_7").innerText;
		var lab8 = document.getElementById("id_8").innerText;
		var lab9 = document.getElementById("id_9").innerText;
		var lab10 = document.getElementById("id_10").innerText;
		var lab11 = document.getElementById("id_11").innerText;
		var lab12 = document.getElementById("id_12").innerText;
		var lab13 = document.getElementById("id_13").innerText;
		var lab14 = document.getElementById("id_14").innerText;
		var lab15 = document.getElementById("id_15").innerText;
		var lab16 = document.getElementById("id_16").innerText;
		var lab17 = document.getElementById("id_17").innerText;
		var lab18 = document.getElementById("id_18").innerText;
		var lab19 = document.getElementById("id_19").innerText;
		var lab20 = document.getElementById("id_20").innerText;
		var lab21 = document.getElementById("id_21").innerText;
		var lab22 = document.getElementById("id_22").innerText;
		var lab23 = document.getElementById("id_23").innerText;
		var lab24 = document.getElementById("id_24").innerText;
		var lab25 = document.getElementById("id_25").innerText;
		var lab26 = document.getElementById("id_26").innerText;
		var lab27 = document.getElementById("id_27").innerText;
		var lab28 = document.getElementById("id_28").innerText;
		var lab29 = document.getElementById("id_29").innerText;
		var lab30 = document.getElementById("id_30").innerText;
		var lab31 = document.getElementById("id_31").innerText;
		var lab32 = document.getElementById("id_32").innerText;
		var lab33 = document.getElementById("id_33").innerText;
		var lab34 = document.getElementById("id_34").innerText;
		var lab35 = document.getElementById("id_35").innerText;
		var lab36 = document.getElementById("id_36").innerText;
		var lab37 = document.getElementById("id_37").innerText;
		var lab38 = document.getElementById("id_38").innerText;
		var lab39 = document.getElementById("id_39").innerText;
		var lab40 = document.getElementById("id_40").innerText;
		var lab41 = document.getElementById("id_41").innerText;
		var lab42 = document.getElementById("id_42").innerText;
		var lab43 = document.getElementById("id_43").innerText;
		var lab44 = document.getElementById("id_44").innerText;
		var lab45 = document.getElementById("id_45").innerText;
		var lab46 = document.getElementById("id_46").innerText;
		var lab47 = document.getElementById("id_47").innerText;
		var lab48 = document.getElementById("id_48").innerText;
		var lab49 = document.getElementById("id_49").innerText;
		var lab50 = document.getElementById("id_50").innerText;
		var lab51 = document.getElementById("id_51").innerText;
		var lab52 = document.getElementById("id_52").innerText;
		var lab53 = document.getElementById("id_53").innerText;
		var lab54 = document.getElementById("id_54").innerText;
		var lab55 = document.getElementById("id_55").innerText;
		var lab56 = document.getElementById("id_56").innerText;
		var lab57 = document.getElementById("id_57").innerText;
		var lab58 = document.getElementById("id_58").innerText;
		var lab59 = document.getElementById("id_59").innerText;
		var lab60 = document.getElementById("id_60").innerText;
		var dzqm = document.getElementById("dzqm").innerHTML;
		
		
		var value1 = $('.cstNam').val();	
		if(value1==null||value1==""){
	  		value1 = "_______";
	  	}
	  	var value2 = $('.cstSexCod').val();
	  	if(value2==null||value2==""){
	  		value2 = "_____";
	  	}
	  	var value3 = $('.age').val();
	  	if(value3==null||value3==""){
	  		value3 = "____________";
	  	}
	  	var value4 = $('.emgFkCod').val();
	  	if(value4==null||value4==""){
	  		value4 = "_____";
	  	}
	  	var value5 = $('.mpi').val();
	  	if(value5==null||value5==""){
	  		value5 = "_______";
	  	}
	  	var value7 = document.getElementById("value_7").value;
	  	var value8 = document.getElementById("value_8").value;
	  	var value9 = document.getElementById("value_9").value;
	  	var value10 = document.getElementById("value_10").value;
	  	var value11 = document.getElementById("value_11").value;
	  	var value12 = document.getElementById("value_12").value;
	  	var value13 = document.getElementById("value_13").value;
	  	var value14 = document.getElementById("value_14").value;
	  	var value15 = document.getElementById("value_15").value;
	  	var value16 = document.getElementById("value_16").value;
	  	var value17 = document.getElementById("value_17").value;
	  	var value18 = document.getElementById("value_18").value;
	  	var value19 = document.getElementById("value_19").value;
	  	var value22 = document.getElementById("value_22").value;
	  	var value23 = document.getElementById("value_23").value;
	  	var value24 = document.getElementById("value_24").value;
	  	var value25 = document.getElementById("value_25").value;
	  	var value26 = document.getElementById("value_26").value;
	  	var value27 = document.getElementById("value_27").value;
	  	var value29 = document.getElementById("value_29").value;
	  	var value291 = document.getElementById("value_291").value;
	  	var value30 = document.getElementById("value_30").value;
	  	var value31 = document.getElementById("value_31").value;
	  	var value32 = document.getElementById("value_32").value;
	  	var value34 = document.getElementById("value_34").value;
	  	var value35 = document.getElementById("value_35").value;
	  	var value36 = document.getElementById("value_36").value;
	  	var value37 = document.getElementById("value_37").value;
	  	var value38 = document.getElementById("value_38").value;
	  	var value39 = document.getElementById("value_39").value;
	  	var value40 = document.getElementById("value_40").value;
	  	var value41 = document.getElementById("value_41").value;
	  	
	  	var value301 = document.getElementById("value_301").value;
	  	var value311 = document.getElementById("value_311").value;
	  	var value321 = document.getElementById("value_321").value;
	  	var value341 = document.getElementById("value_341").value;
	  	var value351 = document.getElementById("value_351").value;
	  	var value361 = document.getElementById("value_361").value;
	  	var value371 = document.getElementById("value_371").value;
	  	var value381 = document.getElementById("value_381").value;
	  	var value391 = document.getElementById("value_391").value;
	  	var value401 = document.getElementById("value_401").value;
	  	var value411 = document.getElementById("value_411").value;
	  	var value42 = document.getElementById("value_42").value;
	  	var value43 = document.getElementById("value_43").value;
	  	var value44 = document.getElementById("value_44").value;
	  	var value47 = document.getElementById("value_47").value;
	  	var value48 = document.getElementById("value_48").value;
	  	var value50 = document.getElementById("value_50").value;
	  	var value51 = document.getElementById("value_51").value;
	  	var value52 = document.getElementById("value_52").value;
	  	var value53 = document.getElementById("value_53").value;
	  	var value55 = document.getElementById("value_55").value;
	  	var value56 = document.getElementById("value_56").value;
	  	var value57 = document.getElementById("value_57").value;
	  	var value58 = document.getElementById("value_58").value;
	  	var value59 = document.getElementById("value_59").value;
	  	if(value7==null||value7==""){
	  		value7 = "__________________";
	  	}
	  	if(value27==null||value27==""){
	  		value27 = "__________________";
	  	}
	  	if(value15==null||value15==""){
	  		value15 = "__________________";
	  	}
	  	if(value42==null||value42==""){
	  		value42 = "________________";
	  	}
	  	if(value43==null||value43==""){
	  		value43 = "________________";
	  	}
	  	if(value44!=null&&value44!=""){
	  		var dates=value44.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value44 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value44 =  "____年___月___日___时___分"
	  	}
	  	if(value58==null||value58==""){
	  		value58 = "________________";
	  	}
	  	if(value59!=null&&value59!=""){
	  		var dates=value59.split(" ");
			 var date = dates[0].split("/");
			 var time=dates[1].split(":");
			 value59 = date[0]+"年"+date[1]+"月"+date[2]+"日"+time[0]+"时"+time[1]+"分";
	  	}else{
	  		value59 =  "____年___月___日___时___分"
	  	}
	  	
		var titleX = $('#titleDivJZ').html();
		var logo = '<img id="logoImg" style="width:15mm" src="../images/hems/print/printLogo.jpg">';
		var text = "<div class=\"logoDivZJ\">"+logo+"</div>";
		text += "<div class=\"titleDivJZ\">"+titleX+"</div>";
	  	text += "<table border='0' width='100%'  cellpadding='0' cellspacing='0' height='27'><tr><td width='20%' height='27' style='font-size: 0.38cm'>"+lab1+value1+"</td>";
		text += "<td width='16%' height='27' style='font-size: 0.38cm'>"+lab2+value2+"</td><td width='24%' height='27' style='font-size: 0.38cm'>"+lab3+value3+"</td>";
		text += "<td width='20%' height='27' style='font-size: 0.38cm'>"+lab4+value4+"</td><td width='20%' height='27' style='font-size: 0.38cm'>"+lab5+value5+"</td></tr></table><hr style=\"margin:-1mm 0 1mm 0;\"/>";
		text += "<div class=\"dqmDiv\" style=\"line-height: 1.5\">";
		text +=	"<div style=\"text-indent: 0em\"><strong>"+lab6+"</strong>"+"</div>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='30'><td colspan=\"3\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab7+value7+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab8+"&nbsp;&nbsp;&nbsp;&nbsp;"+value8+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab9+"&nbsp;&nbsp;&nbsp;&nbsp;"+value9+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab10+"&nbsp;&nbsp;&nbsp;&nbsp;"+value10+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab11+"&nbsp;&nbsp;&nbsp;&nbsp;"+value11+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab12+"&nbsp;&nbsp;&nbsp;&nbsp;"+value12+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab13+"&nbsp;&nbsp;&nbsp;&nbsp;"+value13+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab14+"&nbsp;&nbsp;&nbsp;&nbsp;"+value14+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab15+value15+lab60+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab16+"&nbsp;&nbsp;&nbsp;&nbsp;"+value16+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab17+"&nbsp;&nbsp;&nbsp;&nbsp;"+value17+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab18+"&nbsp;&nbsp;&nbsp;&nbsp;"+value18+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab19+"&nbsp;&nbsp;&nbsp;&nbsp;"+value19+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab20+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab21+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab22+"&nbsp;&nbsp;&nbsp;&nbsp;"+value22+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab23+"&nbsp;&nbsp;&nbsp;&nbsp;"+value23+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab24+"&nbsp;&nbsp;&nbsp;&nbsp;"+value24+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab25+"&nbsp;&nbsp;&nbsp;&nbsp;"+value25+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab26+"&nbsp;&nbsp;&nbsp;&nbsp;"+value26+"</div>";
		text +=	"</td><td colspan=\"2\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab27+value27+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab28+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab29+"&nbsp;&nbsp;&nbsp;&nbsp;"+value29+"&nbsp;&nbsp;&nbsp;&nbsp;"+value291+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab30+"&nbsp;&nbsp;&nbsp;&nbsp;"+value30+"&nbsp;&nbsp;&nbsp;&nbsp;"+value301+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab31+"&nbsp;&nbsp;&nbsp;&nbsp;"+value31+"&nbsp;&nbsp;&nbsp;&nbsp;"+value311+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab32+"&nbsp;&nbsp;&nbsp;&nbsp;"+value32+"&nbsp;&nbsp;&nbsp;&nbsp;"+value321+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab33+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab34+"&nbsp;&nbsp;&nbsp;&nbsp;"+value34+"&nbsp;&nbsp;&nbsp;&nbsp;"+value341+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab35+"&nbsp;&nbsp;&nbsp;&nbsp;"+value35+"&nbsp;&nbsp;&nbsp;&nbsp;"+value351+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab36+"&nbsp;&nbsp;&nbsp;&nbsp;"+value36+"&nbsp;&nbsp;&nbsp;&nbsp;"+value361+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab37+"&nbsp;&nbsp;&nbsp;&nbsp;"+value37+"&nbsp;&nbsp;&nbsp;&nbsp;"+value371+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab38+"&nbsp;&nbsp;&nbsp;&nbsp;"+value38+"&nbsp;&nbsp;&nbsp;&nbsp;"+value381+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab39+"&nbsp;&nbsp;&nbsp;&nbsp;"+value39+"&nbsp;&nbsp;&nbsp;&nbsp;"+value391+"</div><br/><br/>";
		text +=	"<div style=\"text-indent: 0em\">"+lab40+"&nbsp;&nbsp;&nbsp;&nbsp;"+value40+"&nbsp;&nbsp;&nbsp;&nbsp;"+value401+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab41+"&nbsp;&nbsp;&nbsp;&nbsp;"+value41+"&nbsp;&nbsp;&nbsp;&nbsp;"+value411+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab42+value42+"</div><br/><br/>";
		text +=	"</td></tr></table><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='30'><td colspan=\"5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab43+value43+"&nbsp&nbsp"+dzqm+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab44+value44+"</div>";
		text +=	"</td></tr></table><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='30'><td colspan=\"3\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab45+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab46+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab47+"&nbsp;&nbsp;&nbsp;&nbsp;"+value47+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab48+"&nbsp;&nbsp;&nbsp;&nbsp;"+value48+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab49+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab50+"&nbsp;&nbsp;&nbsp;&nbsp;"+value50+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab51+"&nbsp;&nbsp;&nbsp;&nbsp;"+value51+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab52+"&nbsp;&nbsp;&nbsp;&nbsp;"+value52+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab53+"&nbsp;&nbsp;&nbsp;&nbsp;"+value53+"</div>";
		text +=	"</td><td colspan=\"2\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab54+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab55+"&nbsp;&nbsp;&nbsp;&nbsp;"+value55+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab56+"&nbsp;&nbsp;&nbsp;&nbsp;"+value56+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab57+"&nbsp;&nbsp;&nbsp;&nbsp;"+value57+"</div><br/><br/><br/><br/><br/>";
		text +=	"</td></tr></table><br/>";
		text +=	"<table border='0' width='100%' cellpadding='0' cellspacing='0'><tr height='30'><td colspan=\"5\">";
		text +=	"<div style=\"text-indent: 0em\">"+lab58+value58+"</div>";
		text +=	"<div style=\"text-indent: 0em\">"+lab59+value59+"</div>";
		text +=	"</td></tr></table>";
		text +=	"</div>";
		$("#content").val(text);
		return true;
	}
	 //参数获取
	function getparam(){
		$('#s1056 :input').each(function () {
	        ///////////获取容器innerHTML要想包含输入的值，需要设置过value属性。其他对象重置selected、checked属性
	        switch (this.type) {
	            case 'text': this.setAttribute('value', this.value); break;
	            case 'checkbox':
	            case 'radio':
	                if(this.checked)this.setAttribute('checked', 'checked');
	                else this.removeAttribute('checked');
	                break;
	            case 'select-one':
	            case 'select-multiple':
	                $(this).find('option').each(function () {
	                    if(this.selected)this.setAttribute('selected', 'selected');
	                    else this.removeAttribute('selected');
	                });
	                break;
	            case 'textarea': this.innerHTML = this.value; break;
	        }
	    });
	    var texthtml=document.getElementById("s1056").innerHTML;
		texthtml="<div id='s1056'>"+texthtml+"</div>";
	 	document.getElementById("texthtml").value=texthtml;
	 	return true;
	}
	$(function(){
		$('#id_title2').html('心血管介入诊治术安全核查表')
	})
</script>
</div>