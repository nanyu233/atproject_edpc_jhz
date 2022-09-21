<div id="s3010">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div class="tbody">
	<jsp:include page="/WEB-INF/jsp/hzszyyhospital/printBasicInfo/printBasicZqty.jsp"></jsp:include>
	<div class="messages m_t10">
		<div style="border: 0px">
			<table class="tbody">
				<tr class="basicMsgTr">
					<td style="width: 25%">
						<label id="id_1">患者姓名:</label>
						<input id="value_1" type="text" class="input_txt cstNam"/>
					</td>
					<td style="width: 15%">
						<label id="id_2">性别:</label>
						<input id="value_2" type="text" class="input_txt cstSexCod"/>
					</td>
					<td style="width: 16%">
						<label id="id_3">年龄:</label>
						<input id="value_3" type="text" class="input_txt age"/>
					</td>
					<td style="width: 19%">
						<label id="id_4">科室:</label>
						<input id="value_4" type="text" class="input_txt emgFkCod"/>
					</td>
					<td style="width: 25%">
						<label id="id_5">病历号:</label>
						<input id="value_5" type="text" class="input_txt mpi"/>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label id="id_9">根据《浙江省基本医疗保险医疗服务项目目录》（2005版）规范和《浙江省基本医疗保险药品目录》（2005版）规范，《目录》外的医疗服务项目需全额自费；或《目录》内但不符合医保限定支付的医疗服务项目也需全额自费：</label>
						</div>
						<div style="text-indent: 2em">
							<label>您本次就诊中可能涉及一下一种（或以上）自费医疗服务项目（常用自费医疗项目列举如下，未列举的自费医疗服务项目视同一并告知）：</label>
						</div>
					</td>
				</tr>
			</table>
			
			<table border="1" id="table" class="tbody">
				<tr>
					<th colspan="3">项目名称</th>
					<th colspan="1">计价单位</th>
					<th colspan="1">价格</th>
					<th colspan="3">项目名称</th>
					<th colspan="1">计价单位</th>
					<th colspan="1">价格</th>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>胎儿系统彩色多普勒超声检查</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>270</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>降钙素原定量检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>121</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>脏器灰阶立体成像</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>100</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>胃泌素释放肽前体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>80</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>能量图血流立体成像</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>100</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗缪勒氏管激素（AMH）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>192</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>彩色室壁动力(CK)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>10</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>I型胶原羧基端前肽(PICP)测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>β－胶原降解产物测定（β－CTX）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>小而密低密度脂蛋白(sdLDL)测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>室壁运动分析</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>组织多普勒显像(TDI)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>脑血管显像</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>60</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>干扰素测定（每类干扰素）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>类</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>30</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>甲状腺血流显像</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>85</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>各种白介素测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>种</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>30</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>血栓弹力图试验(TEG)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>170</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>单项补体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>10</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>血栓弹力图试验(急诊)加收</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>80</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>免疫球蛋白亚类定量测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>100</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>蛋白质指纹图谱</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>500</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>免疫固定电泳</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>242</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>微量元素测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>元素</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>14</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>肝素结合蛋白（HBP）测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>200</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>骨钙素N端中分子片段测定（N-MID)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗中性粒细胞胞浆抗体ANCA抗体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>24</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>铜测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>13</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗卵巢抗体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>硒测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>14</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗子宫内膜抗体测定(EMAb)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>锌测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>13</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗精子抗体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>尿结石成份分析</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>25</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>尿结石成份分析</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>人免疫缺陷病毒(HIV)抗原抗体联合检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>30</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗环瓜氨酸肽抗体(抗CCP抗体)测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>60</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>血清淀粉酶同工酶电泳</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>15</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>抗Sa抗体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>40</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>1，25双羟维生素D测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>38</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>其他各类病原体DNA测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>5</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>新型隐球菌荚膜抗原测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>15</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>人类K-RAS基因突变检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>1700</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>其他各类病原体DNA测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>人类PIK3CA基因突变检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>1900</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>人乳头瘤病毒(HPV)核酸检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>167</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>人类EML4-ALK融合基因检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>2137</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>流感病毒抗原测定及分型</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>60</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>人类B-RAF基因V600E突变检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>365</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>化学药物用药指导的基因检测（≥10基因位点）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>2012</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>基因表达水平对肿瘤药物敏感性的判断</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>400</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>血清胱抑素(Cystatin C)测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>33</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>化学药物用药指导的基因检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>每个基因位点</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>365</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>丙肝 RNA 测定（低拷贝内标定量）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>340</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>乙肝病毒阿德福韦耐药突变测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>180</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>结核感染T细胞检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>477</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>乙型肝炎耐药基因检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>400</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>红细胞不规则抗体测定(＞8种)加收</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>红细胞不规则抗体测定(8种谱红细胞)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>40</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>胃蛋白酶原Ⅰ</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>80</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>肺炎支原体抗原检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>胃蛋白酶原Ⅱ</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>80</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>Rh弱D血型鉴定试验</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>30</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>衣原体培养</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>每部位</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>60</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>荧光染色体原位杂交检查(FISH)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>1200</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>真菌D-葡聚糖检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>150</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>病理体视学检查与图像分析</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>109</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>分枝杆菌培养鉴定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>120</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>液基薄层细胞制片术</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>155</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>结核分枝杆菌培养及鉴定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>120</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>疑难病理会诊（市内）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>109</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>人类EGFR基因突变检测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>1892</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>疑难病理会诊（市外）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>182</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>血细胞染色体检查</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>39</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>普通病理会诊（市内）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>52</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>外周血细胞染色体检查</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>50</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>普通病理会诊（市外）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>105</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>培养细胞染色体检查（显带分析）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>228</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>微波真空组织处理自动</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>例</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>155</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>细菌内毒素定量检测（动态浊度方法）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>100</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>B型纳尿肽定量测定（BNP）（急诊）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>例</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>212</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>B型纳尿肽定量测定（BNP）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>120</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>胃泌素测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>25</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>计算机图文报告</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>5</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>尿结石成份分析</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>25</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>梅毒螺旋体特异抗体测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>30</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>眼血流图（单眼）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>10</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>人免疫缺陷病毒抗体测定(Anti-HIV)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>16</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>眼血流图（双眼）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>心室晚电位</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>冠脉光学相干断层扫描(OCT)检查</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>550</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>心房晚电位</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>数字影像服务费</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>20</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>自动化动脉硬化监测</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>人次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>80</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>帕金森氏病综合评分量表</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>39</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>肝脏储备功能检查</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>180</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>等速肌力测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>每关节</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>22</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>人体残伤测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>33</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>疲劳度测定</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>22</label>
					</td>
				</tr>
				<tr>
					<td height="30px" colspan="3" style="text-align: center;">
						<label>印迹杂交技术（包括Southern Northern Western等）</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>项</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>155</label>
					</td>
					<td colspan="3" style="text-align: center;">
						<label>负荷心肌灌注断层显像(SPECT)</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>次</label>
					</td>
					<td style="text-align: center;" colspan="1">
						<label>430</label>
					</td>
				</tr>
			</table>
			<table class="tbody">
				<tr>
					<td colspan="5">
						<div style="text-indent: 2em">
							<label class="labtitle">上述各项费用项目内涵及支付方式，经治医师已向我说明，我理解并同意支付治疗费用，并同意按规定自付有关费用。</label>
						</div>
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>医师签名：</label>
						<input type="text" class="input_txt inputA"/>
						<span class="spanRelative" id="dzqm"></span>
						<label>日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})"><br />	
					</td>
				</tr>
				<tr>
					<td colspan="5">
						<label>病人（家属）同意签名：</label>
						<input type="text" class="input_txt inputA"/>
						<label>日期：</label>
						<input class="Wdate spcWdate inputD" type="text" onclick="WdatePicker({dateFmt:'yyyy/MM/dd HH:mm'})">
					</td>
				</tr>
				<tr align="right">
					<td colspan="5">
						<label>浙江医院医保与物价管理办公室</label>
					</td>
				</tr>
			</table>
		</div>
	</div>
</div>
<script type="text/javascript">
	$(function(){
		$('#id_title2').html('自费医疗费用告知书')
	})
</script>
</div>