<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title>胸痛患者登记——打印页</title>
		<script type="text/javascript" src="${baseurl}Lodop6.216/LodopFuncs.js"></script>
	</head>

	<body>
		<div>
			<div id="printDoc" style="display:none;width:210mm;list-style:none;height:297mm;font-family: '微软雅黑';margin:0 auto;">
				<div class="pageOne">
					<div class="pageHead">时间管理记录表</div>
					<div class="pageBottom">
						<span>
							<span>姓名:</span><span class="normal">{{msg.hspEmgInf["cstNam"]}}</span>
						</span>
						<span>
							<span>门/住ID:</span><span class="normal">{{msg.hspEmgInf["mpi"]}}</span>
						</span>
						<span>
							<span>家属电话:</span><span class="short">{{msg.patientInfo["000004"]}}</span>
						</span>
						<span>
							医保类型:<input type="checkbox" id="020002_0">城镇居民
							<input type="checkbox" id="020002_1">城镇职工
							<input type="checkbox" id="020002_3">新农合
							<input type="checkbox" id="020002_3">自费
						</span>
					</div>
					<table border="1">
						<tr>
							<td rowspan="13" class="titlePrint">院前系统<span>（120</span>及网络医院<span>）</span></td>
						</tr>
						<tr>
							<td colspan="2">
								<span>姓名:</span>
								<span class="normal">{{msg.aidPatient["XINGM"]}}</span>
							</td>
							<td colspan="2">
								<span>性别:</span>
								<input type="checkbox" id="XINGB_0">男
								<input type="checkbox" id="XINGB_1">女
							</td>
							<td colspan="2">
								<span>年龄:</span>
								<span class="short">{{msg.aidPatient["NIANN"]}}</span>
								<span>岁</span>
							</td>
							<td colspan="6">
								<span>发病地址:</span>
								<span class="normal">{{addr[0]}}</span>
								<span class="normal">{{addr[1]}}</span>
								<span class="normal">{{addr[2]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="4" style="width:31.3%;">
								<span>发病时间:</span>
								<span class="timemiddle">{{msg.aidPatient["illTim"]}}</span>
							</td>
							<td colspan="4" style="width:31.3%;">
								<span>呼救120时间:</span>
								<span class="timemiddle">{{msg.aidPatient["almtime"]}}</span>
							</td>
							<td colspan="4" style="width:37.3%;">
								<span>首次医疗接触时间:</span>
								<span class="timemiddle">{{msg.aidPatientXt["scyljc"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<span>网络医院入门时间:</span>
								<span class="timemiddle">{{msg.aidPatientXt["wlyyry"]}}</span>
							</td>
							<td colspan="6">
								<span>转诊出门时间:</span>
								<span class="timemiddle">{{msg.aidPatientXt["zzcm"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<span>院前首份心电图时间:</span>
								<span class="timemiddle">{{msg.aidPatientXt["sfxdt"]}}</span>
							</td>
							<td colspan="6">
								<span>院前首份心电图确诊时间:</span>
								<span class="timemiddle">{{msg.aidPatientXt["sfxdtqz"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								远程传输心电图:<input type="checkbox" id="ycxdtcs_1">是<input type="checkbox" id="ycxdtcs_2">否
							</td>
							<td colspan="4">
								传输时间:<span class="timemiddle">{{msg.aidPatientXt["cssj"]}}</span>
							</td>
							<td colspan="4">
								传输方式:<input type="checkbox" id="csfs_2">微信
								<input type="checkbox" id="csfs_9">短信
								<input type="checkbox" id="csfs_1">实时监控
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span>
									双联血小板给药:<input type="checkbox" id="kxxbgy_1">是<input type="checkbox" id="kxxbgy_0">否
								</span>
								<span>
									<span>给药时间:</span><span class="timemiddle">{{msg.aidPatientXt["gysj"]}}</span>
								</span>
								<span>
									阿司匹林<span class="short">{{msg.aidPatientXt["aspl02"]}}</span>mg;
									替格瑞洛<span class="short">{{msg.aidPatientXt["tgrl"]}}</span>mg/
									氯吡格雷<span class="short">{{msg.aidPatientXt["lpgl"]}}</span>mg;
								</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								院前溶栓筛查:<input type="checkbox" id="yqrssc_1">适合
								<input type="checkbox" id="yqrssc_2">不适合
								<input type="checkbox" id="yqrssc_3">未筛查
							</td>
							<td colspan="4">
								是否实施院前溶栓:<input type="checkbox" id="yqrs_1">有
								<input type="checkbox" id="yqrs_0">无
							</td>
							<td colspan="4">
								溶栓场所:<input type="checkbox" id="rscs_1">其他医院
								<input type="checkbox" id="rscs_2">救护车
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<span>院前溶栓知情同意开始时间:</span><span class="timemiddle">{{msg.aidPatientXt["zqtyks"]}}</span>
							</td>
							<td colspan="6">
								<span>签属知情同意时间:</span><span class="timemiddle">{{msg.aidPatientXt["qszqty"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<span>院前溶栓开始时间:</span><span class="timemiddle">{{msg.aidPatientXt["rsks"]}}</span>
							</td>
							<td colspan="6">
								<span>院前溶栓结束时间:</span><span class="timemiddle">{{msg.aidPatientXt["rsjs"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span>溶栓后造影时间:</span><span class="timemiddle">{{msg.aidPatientXt["rshzy"]}}</span><span>(心内科或导管室人员填写)</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								院前溶栓药物:<input type="checkbox" id="rsyw_1">一代
								<input type="checkbox" id="rsyw_2">二代
								<input type="checkbox" id="rsyw_3">三代
							</td>
							<td colspan="4">
								院前溶栓药物剂量:<input type="checkbox" id="rsywjl_2">半量
								<input type="checkbox" id="rsywjl_1">全量
							</td>
							<td colspan="4">
								溶栓再通:<input type="checkbox" id="rszt_1">是
								<input type="checkbox" id="rszt_0">否
							</td>
						</tr>
						<tr>
							<td colspan="5">
								诊断:<input type="checkbox" id="zd_1">STEMI
								<input type="checkbox" id="zd_2">NSTEMI
								<input type="checkbox" id="zd_3">UA
								<input type="checkbox" id="zd_4">主动脉夹层
								<input type="checkbox" id="zd_5">肺动脉栓塞
								<input type="checkbox" id="zd_7">其他
							</td>
							<td colspan="4">
								转运至CPC:<input type="checkbox" id="zycs_1">导管室
								<input type="checkbox" id="zycs_2">急诊
							</td>
							<td colspan="3">
								<span>填写人员签名:</span><span class="normal"></span>
							</td>
						</tr>
					</table>
					<table border="1">
						<tr>
							<td rowspan="13" class="titlePrint">急诊预检</td>
						</tr>
						<tr>
							<td>
								<span>患者姓名:</span>
								<span class="normal name">{{msg.hspEmgInf["cstNam"]}}</span>
							</td>
							<td>
								<span>性别:</span>
								<input type="checkbox" id="cstSexCod_0">男
								<input type="checkbox" id="cstSexCod_1">女
							</td>
							<td>
								<span>年龄:</span>
								<span class="short">{{msg.hspEmgInf["cstAge"]}}</span>
								<span>岁</span>
							</td>
							<td colspan="3">
								<span>发病地址:</span>
								<span class="normal">{{addr[0]}}</span>
								<span class="normal">{{addr[1]}}</span>
								<span class="normal">{{addr[2]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<span>发病时间:</span>
								<span class="timemiddle">{{msg.ynfb["illTim"]}}</span>
							</td>
							<td colspan="2">
								<span>到达医院大门时间:</span>
								<span class="timemiddle">{{msg.hspEmgInf["ddyydmsj"]}}</span>
							</td>
							<td colspan="2">
								<span>院内接诊时间(分诊时间):</span>
								<span class="timemiddle specialtimemiddle">{{msg.hspEmgInf["emgDat"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<div>
									到达方式:<input type="checkbox" id="arvChlCod_1">120救护车
									<input type="checkbox" id="arvChlCod_2">外院转运(包含网络医院)
									<input type="checkbox" id="arvChlCod_3">自行来院
								</div>
								<div>
									<input type="checkbox" id="ynfb_1">院内发病
									<span>
										(发病科室:<span class="normal">{{msg.ynfb["illDep"]}}</span>;
										床位医师接触时间:<span class="timemiddle">{{msg.ynfb["fstTim"]}}</span>;
										患者离开科室时间:<span class="timemiddle">{{msg.ynfb["lveTim"]}}</span>)
									</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="6">
								生命体征:意识<input type="checkbox" id="senRctCod_0">清醒
								<input type="checkbox" id="senRctCod_1">对语言有反应
								<input type="checkbox" id="senRctCod_2">对刺痛有反应
								<input type="checkbox" id="senRctCod_3">对任何刺激无反应
							</td>
						</tr>
						<tr>
							<td colspan="6">
								呼吸<span class="short">{{msg.hspEmgInf["breNbr"]}}</span>次/分
								脉搏<span class="short">{{msg.hspEmgInf["hrtRte"]}}</span>次/分
								心率<span class="short"></span>次/分
								血压<span class="short">{{msg.hspEmgInf["sbpupNbr"]}}</span>/<span class="short">{{msg.hspEmgInf["sbpdownNbr"]}}</span>mmHg
								末梢血氧饱和度<span class="short">{{msg.hspEmgInf["oxyNbr"]}}</span>%
							</td>
						</tr>
						<tr>
							<td colspan="4">
								<input type="checkbox" id="cstDspCod_5">至胸痛诊室(急诊内科)
								<input type="checkbox" id="cstDspCod_6">至急救科抢救室
								<input type="checkbox">至导管室
							</td>
							<td colspan="2">
								<span>分诊护士签名:</span><span class="normal"></span>
							</td>
						</tr>
					</table>
					<table border="1">
						<tr>
							<td rowspan="8" class="titlePrint">胸痛诊室<span>(</span>急诊内科<span>)/</span>发病科室</td>
							<td colspan="12"><span>院内首份心电图时间:</span><span class="timemiddle">{{msg.patientInfo["ynsfxdtsj"]}}</span></td>
							<td rowspan="13" style="width:54mm;">
								<div>由实际判定或实施人员勾选</div>
								<div>
									Killip分级:<input type="checkbox" id="KILLIP_1" />Ⅰ
									<input type="checkbox" id="KILLIP_2" />Ⅱ
									<input type="checkbox" id="KILLIP_3" />Ⅲ
									<input type="checkbox" id="KILLIP_4" />Ⅳ
								</div>
								<div>
									NYHA分级:<input type="checkbox" id="NYHA_1" />Ⅰ
									<input type="checkbox" id="NYHA_2" />Ⅱ
									<input type="checkbox" id="NYHA_3" />Ⅲ
									<input type="checkbox" id="NYHA_4" />Ⅳ
								</div>
								<div>具备任意一条,即为极高危:</div>
								<div>
									<input type="checkbox" id="gracejgwtj01_1" />急性心力衰竭
								</div>
								<div>
									<input type="checkbox" id="gracejgwtj01_2" />致命性心律失常或心脏骤停
								</div>
								<div>
									<input type="checkbox" id="gracejgwtj01_3" />血液动力学不稳定或心原性休克
								</div>
								<div>
									<input type="checkbox" id="gracejgwtj01_4" />心肌梗死合并机械并发症
								</div>
								<div>
									<input type="checkbox" id="gracejgwtj01_5" />反复的ST-T 动态改变，尤其是伴随间歇性 ST 段抬高
								</div>
								<div>
									<input type="checkbox" id="gracejgwtj01_6" />药物治疗无效的反复发作或持续性胸痛
								</div>
								<div>再灌注措施:</div>
								<div>
									<input type="checkbox" id="ZGZCS_1" /><span>急诊PCI</span>
									<input type="checkbox" id="ZGZCS_2" /><span>溶栓</span>
									<input type="checkbox" id="ZGZCS_3" /><span>择期PCI</span>
									<input type="checkbox" id="ZGZCS_4" /><span>CABG</span>
									<input type="checkbox" id="YNRSHX_1" /><span>补救PCI</span>
									<input type="checkbox" id="YNRSHX_2" /><span>溶栓后介入</span>
								</div>
								<div>NSTE-ACS 血运重建措施:</div>
								<div>
									<input type="checkbox" id="CLCL_0"><span>保守治疗</span>
									<input type="checkbox" id="QRXCL_1"><span>2h紧急介入治疗</span>
									<input type="checkbox" id="QRXCL_2"><span>2h内介入治疗</span>
									<input type="checkbox" id="QRXCL_3"><span>72h内介入治疗</span>
									<input type="checkbox" id="QRXCL_4"><span>择期介入治疗</span>
									<input type="checkbox" id="QRXCL_5"><span>CABG</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="12"><span>院内首份心电图确诊时间</span><span class="timemiddle">{{msg.patientInfo["ynsfxdtqzsj"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<div>
									病情评估及合并情况:
								</div>
								<div style="padding: 0mm 0px 1mm 0;">
									<input type="checkbox" id="BQPG_01" />持续性症状
									<input type="checkbox" id="BQPG_02" />间断性症状
									<input type="checkbox" id="BQPG_03" />胸痛症状已缓解
									<input type="checkbox" id="BQPGMX_2" />腹痛
									<input type="checkbox" id="BQPGMX_3" />齿痛
									<input type="checkbox" id="BQPGMX_4" />肩背痛
									<input type="checkbox" id="BQPGMX_1" />呼吸困难
									<input type="checkbox" />休克
									<input type="checkbox" />突发意识丧失
									<input type="checkbox" id="BQPGMX_6" />合并心衰
									<input type="checkbox" id="BQPGMX_7" />合并恶性心率失常
									<input type="checkbox" id="BQPGMX_5" />合并出血
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span>肌钙蛋白抽血完成时间:</span><span class="timemiddle">{{msg.patientInfo["CXSJ"]}}</span>
								<span>获得报告时间</span><span class="timemiddle">{{msg.patientInfo["POCTSJ"]}}</span>
								<span class="short">{{msg.hspEmgInf["ctni"]}}</span>pg/ml
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span>实验室检查:Cr<span class="short">{{msg.hspEmgInf["cr"]}}</span>μ mol/L;</span>
								<span>D-dimer:<span class="short">{{msg.hspEmgInf["d2jt"]}}</span>ug/L(mg/L);</span>
								<span>BNP/NT-proBNP<span class="short">{{msg.hspEmgInf["bnp"]}}</span></span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<div>
									<span>辅助检查:<span>通知心超检查时间:</span><span class="timemiddle"></span></span>
									<span><span>心超检查完成时间:</span><span class="timemiddle"></span></span>
								</div>
								<div>
									<span><span>通知CT检查时间:</span><span class="timemiddle"></span></span>
									<span><span>增强CT检查开始时间:</span><span class="timemiddle"></span></span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<div>
									诊断:<input type="checkbox">诊断中
									<input type="checkbox" id="JZZD_1">STEMI
									<input type="checkbox" id="JZZD_2">NSTEMI
									<input type="checkbox" id="JZZD_3">UA
									<input type="checkbox" id="JZZD_4">主动脉夹层
									<input type="checkbox" id="JZZD_5">肺栓塞
									<input type="checkbox" id="JZZD_6">非ACS胸痛
									<input type="checkbox" id="JZZD_7">其它非心源性胸痛
									<input type="checkbox" id="JZZD_8">放弃诊治,病因不明
									<input type="checkbox">诊断明确,患者放弃后续治疗

								</div>
								<div>
									<span>诊断时间:</span>
									<span class="timemiddle">{{msg.patientInfo["JZZDSJ"]}}</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span>
									是否呼叫心内科会诊:<input type="checkbox" id="SFHJXNKHZ_0">否<input type="checkbox" id="SFHJXNKHZ_1">是
								</span>
								<span><span>呼叫时间:</span><span class="timemiddle">{{msg.patientInfo["invitationDate"]}}</span></span>
							</td>
						</tr>
						<tr>
							<td class="titlePrint"></td>
							<td colspan="8">
								低危患者去向:<input type="checkbox" id="020002_0">心内科病房,
								<input type="checkbox" id="020002_1">急诊科病房,
								<input type="checkbox" id="020002_3">其他
								<!-- <span class="short"></span> -->
							</td>
							<td colspan="4">
								<span>填写人员签名:</span><span class="normal"></span>
							</td>
						</tr>
						<tr>
							<td rowspan="12" class="titlePrint">心内科会诊</td>
							<td colspan="7">
								<span>二线会诊时间(包含远程会诊):</span><span class="timemiddle">{{msg.patientInfo["consulationDate"]}}</span>
							</td>
							<td colspan="5"><span>会诊医师签名:</span><span class="normal"></span></td>
						</tr>
						<tr>
							<td colspan="12">
								<div>
									诊断:<input type="checkbox">诊断中
									<input type="checkbox" id="CBZD_1">STEMI
									<input type="checkbox" id="CBZD_2">NSTEMI
									<input type="checkbox" id="CBZD_3">UA
									<input type="checkbox" id="CBZD_4">主动脉夹层
									<input type="checkbox" id="CBZD_5">肺栓塞
									<input type="checkbox" id="CBZD_6">非ACS胸痛
									<input type="checkbox" id="CBZD_7">其它非心源性胸痛
									<input type="checkbox" id="CBZD_8">放弃诊治,病因不明
									<input type="checkbox">诊断明确,患者放弃后续治疗
								</div>
								<div>
									<span>诊断时间:</span><span class="timemiddle">{{msg.patientInfo["CBZDSJ"]}}</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span><span>决定介入手术时间:</span><span class="timemiddle">{{msg.patientInfo["JDJRSSSJ"]}}</span></span>
								<span><span>启动导管室时间:</span><span class="timemiddle">{{msg.patientInfo["QDDGSSJ"]}}</span></span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span><span>开始知情同意时间:</span><span class="timemiddle">{{msg.patientInfo["KSZQTYSJ"]}}</span></span>
								<span><span>签署知情同意书时间:</span><span class="timemiddle">{{msg.patientInfo["QSZQTYSJ"]}}</span></span>
							</td>
						</tr>
					</table>
				</div>
				<div class="PageTwo">
					<table border="1">
						<tr>
							<td rowspan="2" class="titlePrint"></td>
							<td colspan="2">
								<span>
									院内溶栓筛查:<input type="checkbox" id="YNRSSC_1">合适<input type="checkbox" id="YNRSSC_2">不合适
								</span>
								<span>
									实施院内溶栓:<input type="checkbox" id="YNRSZL_0">有<input type="checkbox" id="YNRSZL_1">无
								</span>
							</td>
							<td rowspan="6" style="width:54mm;vertical-align:top;padding:1mm 0 0 1mm;" class="special">
								<div><span>实际介入时间(转运PCI):</span></div>
								<div>
									<span class="timelong">{{msg.patientInfo["SJJRZLSJ"]}}</span>
								</div>
								<div><span>双联抗血小板药物给药时间:</span></div>
								<div>
									<span class="timelong">{{msg.patientInfo["KXXBYWGYSJ"]}}</span>
								</div>
								<div>阿司匹林<span class="short">{{msg.patientInfo["aspl"]}}</span>mg,</div>
								<div>替格瑞洛<span class="short">{{msg.patientInfo["tgrl"]}}</span>mg/氯吡格雷<span class="short">{{msg.patientInfo["lpgl"]}}</span>mg</div>
								<div>
									24h他汀治疗:<input type="checkbox" id="TTZL_1">是
									<input type="checkbox" id="TTZL_0">否
								</div>
								<div>
									β受体阻滞剂使用:<input type="checkbox" id="BSTZZJ_1">是
									<input type="checkbox" id="BSTZZJ_0">否
								</div>
								<div>填写人签名:<span class="long"></span></div>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div>
									<span><span>溶栓开始时间:</span><span class="timemiddle">{{msg.patientInfo["YNKSRSSJ"]}}</span></span>
									<span><span>溶栓结束时间:</span><span class="timemiddle">{{msg.patientInfo["YNRSJSSJ"]}}</span></span>
									<span><span>溶栓后造影时间:</span><span class="timemiddle">{{msg.patientInfo["YNRSHZYSJ"]}}</span></span>
								</div>
								<div>
									<span>
										溶栓药物:<input type="checkbox" id="YNYW_1">一代
										<input type="checkbox" id="YNYW_2">二代
										<input type="checkbox" id="YNYW_3">三代
									</span>
									<span>
										溶栓药物剂量:<input type="checkbox" id="YNJL_1">半量
										<input type="checkbox" id="YNJL_2">全量
									</span>
									<span>
										溶栓再通:<input type="checkbox" id="YNRSZT_1">是
										<input type="checkbox" id="YNRSZT_0">否
									</span>
								</div>
							</td>
						</tr>
						<tr>
							<td class="titlePrint" rowspan="4">急诊留观<span>/</span>心内病房<span>/CCU</span></td>
							<td>
								<span>复测心电图时间:</span>
								<span class="timemiddle">{{msg.patientInfo["YNXDTSJ02"]}}</span>
							</td>
							<td>
								<span>肌钙蛋白复测结果:</span>
								<span class="short">{{msg.patientInfo["JGDBFCJG"]}}</span>ng/ml;
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div>
									<span>复测肌钙蛋白抽血完成时间:</span>
									<span class="timemiddle">{{msg.patientInfo["FCJGDBSJ"]}}</span>
								</div>
								<div>
									<span>复测肌钙蛋白报告时间:</span>
									<span class="timemiddle">{{msg.patientInfo["FCJGDBBGSJ"]}}</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div>
									Grace危险分层:<input type="checkbox" id="gracewxfc_1">极高危
									<input type="checkbox" id="gracewxfc_2">高危
									<input type="checkbox" id="gracewxfc_3">中危
									<input type="checkbox" id="gracewxfc_4">低危
								</div>
								<div>
									具备以下任意一条,即为极高危:<input type="checkbox" id="gracejgwtj02_1">急性心力衰竭
									<input type="checkbox" id="gracejgwtj02_2">致命性心律失常或心脏骤停
									<input type="checkbox" id="gracejgwtj02_3">血液动力学不稳定或心原性休克
									<input type="checkbox" id="gracejgwtj02_4">心肌梗死合并机械并发症
									<input type="checkbox" id="gracejgwtj02_5">反复的ST-T
									动态改变，尤其是伴随间歇性 ST 段抬高
									<input type="checkbox" id="gracejgwtj02_6">药物治疗无效的反复发作或持续性胸痛
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="2">
								<div>
									诊断:<input type="checkbox">诊断中
									<input type="checkbox" id="LGZD_1">STEMI
									<input type="checkbox" id="LGZD_2">NSTEMI
									<input type="checkbox" id="LGZD_3">UA
									<input type="checkbox" id="LGZD_4">主动脉夹层
									<input type="checkbox" id="LGZD_5">肺栓塞
									<input type="checkbox" id="LGZD_6">非ACS胸痛
									<input type="checkbox" id="LGZD_7">其它非心源性胸痛
									<input type="checkbox" id="LGZD_8">放弃诊治,病因不明
									<input type="checkbox">诊断明确,患者放弃后续治疗
								</div>
								<div>
									<span>诊断时间:</span><span class="timemiddle">{{msg.patientInfo["LGZDSJ"]}}</span>
								</div>
							</td>
						</tr>
					</table>
					<table border="1">
						<tr>
							<td class="titlePrint" rowspan="12">导管室</td>
						</tr>
						<tr>
							<td colspan="5">
								急诊PCI启动方式<input type="checkbox" id="JZPCI_1">绕行急诊
								<input type="checkbox" id="JZPCI_2">绕行CCU
								<input type="checkbox" id="JZPCI_3">病房启动
							</td>
							<td colspan="3">
								介入医生:<span class="long">{{msg.patientInfo["JRYS"]}}</span>
							</td>
							<td colspan="4">
								<span>导管室激活时间:</span>
								<span class="timemiddle">{{msg.patientInfo["DGSJHSJ"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="8">
								PCI血管路径:<input type="checkbox" id="RULU_1">桡动脉(左)
								<input type="checkbox" id="RULU_2">桡动脉(右)
								<input type="checkbox" id="RULU_3">股动脉
								<input type="checkbox" id="RULU_4">其他
							</td>
							<td colspan="4">
								<span>开始穿刺时间:</span>
								<span class="timemiddle">{{msg.patientInfo["KSCCSJ"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								<span>造影开始时间:</span>
								<span class="timemiddle">{{msg.patientInfo["ZYKSSJ"]}}</span>
							</td>
							<td colspan="4">
								<span>导丝通过时间:</span>
								<span class="timemiddle">{{msg.patientInfo["DSTGSJ"]}}</span>
							</td>
							<td colspan="4">
								<span>手术完成时间:</span>
								<span class="timemiddle">{{msg.patientInfo["PCISSWCSJ"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								阻塞性病变:<input type="checkbox" id="020002_0">是
								<input type="checkbox" id="020002_1">否
							</td>
						</tr>
						<tr>
							<td colspan="6">
								<img style="width:50%;vertical-align:top;" src="${baseurl}images/edpc/position.png" />
								<span style="display: inline-block;width:49%;">
									<span> 1:右冠近段 </span><span> 2:右冠中段</span><span> 3:右冠远段</span><span>
										4:后降支(右优势型)</span><span> 5:左主干</span><span>
										6:前降支近段</span><span> 7:前降支中段</span><span> 8:前降支远段</span><span> 9:第一对角支</span><span>
										10:第二对角支</span><span>
										11:旋支近段</span><span> 12:第一钝缘支</span><span> 13:旋支远段</span><span> 14:左室后支</span><span>
										15:后降支(左优势型或均衡型)</span>
								</span>
							</td>
							<td colspan="6">
								<div style="border-bottom: 1px solid black;">
									<span> 扩展项:</span>
									<span>16:中间支</span><span> 17:第三对角支</span><span>18:第二钝缘支</span><span> 19:第三钝缘支</span><span> 20:锐缘支</span><span> 21:左圆椎支</span><span>22:右圆椎支</span><span>23:室间隔支</span><span> 24:左后外侧支</span><span> 25:右后外侧支</span><span>26:房室沟动脉</span><span> 27:后降支室间支</span>
								</div>
								<div>罪犯血管编码:<span class="normal"></span></div>
								<div>
									狭窄程度:
									<input type="checkbox" id="xzcd_1">&lt;50%
									<input type="checkbox" id="xzcd_2">50-69%
									<input type="checkbox" id="xzcd_3">70-89%
									<input type="checkbox" id="xzcd_4">90-99%
									<input type="checkbox" id="xzcd_5">100%
								</div>
								<div>
									<span>
										术前TIMI<span class="short">{{msg.hspCrivelInf["zystimixl"]}}</span>级、
									</span>
									<span>
										术后TIMI<span class="short">{{msg.hspCrivelInf["shtimixl"]}}</span>级
									</span>
								</div>
								<div>
									<span>
										非罪犯血管狭窄>50%:<input type="checkbox" id="020002_0">是
										<input type="checkbox" id="020002_0">否
									</span>
									<span>
										编码:<span class="normal"></span>
									</span>
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="3">
								支架内血栓:
								<input type="checkbox" id="zjnxs_1">是
								<input type="checkbox" id="zjnxs_0">否
							</td>
							<td colspan="3">
								分叉病变:<input type="checkbox" id="sffcbb_1">是
								<input type="checkbox" id="sffcbb_0">否
							</td>
							<td colspan="3">
								CTO:<input type="checkbox" id="sfcto_1">是
								<input type="checkbox" id="sfcto_0">否
							</td>
							<td colspan="3">
								植入支架个数:<span class="normal">{{msg.hspCrivelInf["ZJGS"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<span>
									首次抗凝:<input type="checkbox" id="KNYW_1">普通肝素
									<input type="checkbox" id="KNYW_3">比伐芦定
									<input type="checkbox" id="KNYW_2">低分子肝素
									<input type="checkbox" id="KNYW_4">磺达肝葵钠;
								</span>
								<span>
									剂量:<span class="normal">{{msg.patientInfo["KNYWJL"]}}</span>;
								</span>
								<span>
									<span>给药时间:</span>
									<span class="timemiddle">{{msg.patientInfo["KNYWSJ"]}}</span>
								</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								腔内影像:<input type="checkbox" id="QNYX_1">IVUS
								<input type="checkbox" id="QNYX_2">OCT
								<input type="checkbox" id="QNYX_3">其他
								<input type="checkbox" id="QNYX_4">无
							</td>
							<td colspan="3">
								功能检测:<input type="checkbox" id="GNJC_1">FFR
								<input type="checkbox" id="GNJC_4">其他
								<input type="checkbox" id="GNJC_5">无
							</td>
							<td colspan="3">
								IABP植入:<input type="checkbox" id="IABP_1">是
								<input type="checkbox" id="IABP_0">否
							</td>
							<td colspan="2">
								血栓抽吸:<input type="checkbox" id="020002_0">是
								<input type="checkbox" id="020002_1">否
							</td>
						</tr>
						<tr>
							<td colspan="4">
								临时起搏器植入:<input type="checkbox" id="LSQBQ_1">是
								<input type="checkbox" id="LSQBQ_0">否
							</td>
							<td colspan="4">
								ECMO:<input type="checkbox" id="ECMO_1">是
								<input type="checkbox" id="ECMO_0">否
							</td>
							<td colspan="4">
								左心室辅助装置:<input type="checkbox" id="ZXSFZZZ_1">是
								<input type="checkbox" id="ZXSFZZZ_0">否
							</td>
						</tr>
						<tr>
							<td colspan="12">
								术中并发症:<input type="checkbox" id="SZBFZ_0">无
								<input type="checkbox" id="SZBFZ_1">恶性心律失常
								<input type="checkbox" id="SZBFZ_2">低血压
								<input type="checkbox" id="SZBFZ_6">慢血流/无复流
								<input type="checkbox" id="SZBFZ_7">血管夹层
								<input type="checkbox" id="SZBFZ_8">非干预血管急性闭塞
								<input type="checkbox" id="SZBFZ_9">血管穿孔
								<input type="checkbox" id="SZBFZ_10">死亡
								<input type="checkbox" id="SZBFZ_11">其他
							</td>
						</tr>
						<tr>
							<td colspan="4">
								<span>D2B时间:</span>
								<span class="timemiddle">{{msg.patientInfo["000009"]}}</span>
							</td>
							<td colspan="5">
								是否延误:<input type="checkbox" id="SFYW_1">是
								<input type="checkbox" id="SFYW_0">否(具体原因请询问术者)
							</td>
							<td colspan="3">
								<span>填写人签名:</span><span class="normal"></span>
							</td>
						</tr>
					</table>
					<table border="1">
						<tr>
							<td rowspan="9" class="titlePrint">出院转归</td>
						</tr>
						<tr>
							<td colspan="8">
								转归:<input type="checkbox" id="HZZG_1">好转出院
								<input type="checkbox" id="HZZG_2">转至其它医院
								<input type="checkbox" id="HZZG_3">转至其它科室
								<input type="checkbox" id="HZZG_4">死亡
							</td>
							<td colspan="4">
								死亡原因:<input type="checkbox" id="SWYY-1">心源性
								<input type="checkbox" id="SWYY_2">非心源性
							</td>
						</tr>
						<tr>
							<td colspan="8">
								诊断:<input type="checkbox" id="CYZD_1">STEMI
								<input type="checkbox" id="CYZD_2">NSTEMI
								<input type="checkbox" id="CYZD_3">UA
								<input type="checkbox" id="CYZD_4">主动脉夹层
								<input type="checkbox" id="CYZD_5">肺栓塞
								<input type="checkbox" id="CYZD_6">非ACS胸痛
								<input type="checkbox" id="CYZD_7">其它非心源性胸痛
							</td>
							<td colspan="4">
								<span>确诊时间:</span>
								<span class="timemiddle">{{msg.patientInfo["QZSJ"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="4">
								72小时肌钙蛋白最高值<span class="short">{{msg.patientInfo["JGDB72ZGZ"]}}</span>
							</td>
							<td colspan="4">
								<input type="checkbox" id="NNTLX_1">BNP
								<input type="checkbox" id="NNTLX_2">NT-proBNP
								最高值<span class="short">{{msg.patientInfo["NNTZGZ"]}}</span>
							</td>
							<td colspan="4">
								超声心电图 LVEF<span class="short">{{msg.patientInfo["LVEF"]}}</span>%(最低值)
							</td>
						</tr>
						<tr>
							<td colspan="12">
								合并症:<input type="checkbox" id="ZYQJBFZ_0">无
								<input type="checkbox">心衰
								<input type="checkbox" id="ZYQJBFZ_1">休克
								<input type="checkbox" id="ZYQJBFZ_2">机械性并发症
								<input type="checkbox" id="ZYQJBFZ_3">感染
								<input type="checkbox" id="ZYQJBFZ_4">再发心梗
								<input type="checkbox" id="ZYQJBFZ_5">血栓
								<input type="checkbox" id="ZYQJBFZ_6">卒中
								<input type="checkbox" id="ZYQJBFZ_7">TIA
								<input type="checkbox" id="ZYQJBFZ_8">出血
								<input type="checkbox" id="ZYQJBFZ_10">呼吸衰竭
								<input type="checkbox" id="ZYQJBFZ_11">肾衰竭
								<input type="checkbox" id="ZYQJBFZ_12">死亡
							</td>
						</tr>
						<tr>
							<td colspan="12">
								心血管疾病危险因素:<input type="checkbox" id="XXGJBWXYS_1">高血压
								<input type="checkbox" id="XXGJBWXYS_2">高脂血症
								<input type="checkbox" id="XXGJBWXYS_3">血糖升高
								<input type="checkbox" id="XXGJBWXYS_4">吸烟
								<input type="checkbox" id="XXGJBWXYS_5">肥胖
								<input type="checkbox" id="XXGJBWXYS_6">有家族史
								<input type="checkbox" id="XXGJBWXYS_7">有既往心脏病史
								<input type="checkbox" id="XXGJBWXYS_8">既往血运重建史
							</td>
						</tr>
						<tr>
							<td colspan="4">
								院内新发心力衰竭:<input type="checkbox" id="YNXFXLSJ_1">是
								<input type="checkbox" id="YNXFXLSJ_0">否
							</td>
							<td colspan="4">
								<span>出院时间:</span>
								<span class="timemiddle">{{msg.patientInfo["CYSJ"]}}</span>
							</td>
							<td colspan="2">
								住院天数:<span class="short">{{msg.patientInfo["ZYTS"]}}</span>
							</td>
							<td colspan="2">
								总费用:<span class="normal">{{msg.patientInfo["FEIY"]}}</span>
							</td>
						</tr>
						<tr>
							<td colspan="12">
								<div>
									治疗结果:<input type="checkbox" id="ZLJG_1">治愈
									<input type="checkbox" id="ZLJG_2">好转
									<input type="checkbox" id="ZLJG_3">脑死亡离院
									<input type="checkbox" id="ZLJG_4">其它原因离院
								</div>
								<div>
									离院宣教:<input type="checkbox" id="LYXJ_1">戒烟
									<input type="checkbox" id="LYXJ_2">规律坚持服药
									<input type="checkbox" id="LYXJ_3">遵医嘱随访治疗
									<input type="checkbox" id="LYXJ_4">生活起居调护
									<input type="checkbox" id="LYXJ_5">危险因素控制
									<input type="checkbox" id="LYXJ_6">未作
								</div>
							</td>
						</tr>
						<tr>
							<td colspan="9">
								出院带药:<input type="checkbox" id="CYDY_1">DAPT
								<input type="checkbox" id="CYDY_2">ACEI/ARB
								<input type="checkbox" id="CYDY_4">β-受体阻滞剂
								<input type="checkbox" id="CYDY_3">他汀
							</td>
							<td colspan="3">
								<span>填写人签名:</span><span class="normal"></span>

							</td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</body>
	<script>
		function printMsg() {
			$('table').css({
				'border-collapse': 'collapse',
				'width': '100%',
				'border-color': '#000',
				'margin': '0 auto 3mm',
				'table-layout': 'fixed'
			});
			$('table tr td').css({
				'font-size': '12px',
				// 'padding': '0.5mm 0'
			})
			$('table tr div').css({
				'margin': '1.5px 0'
			})
			$('input').css({
				'vertical-align': 'middle',
				'margin': '0 3px'
			});
			$('#printDoc .pageHead').css({
				'text-align': 'center',
				'font-size': '7mm',
				'margin': '5mm 0 2mm'
			});
			$('#printDoc .pageBottom').css({
				'text-align': 'center',
				'font-size': '12px',
				'margin':'0 auto 1mm'
			});
			$('.titlePrint').css({
				'text-align': 'center',
				'width': '10mm',
				'margin': '0',
				'vertical-align': 'middle',
				'font-weight': 'bold',
				'font-size': '4mm',
				'padding': '3mm'
			});
			$('.titlePrint span').css({
				'writing-mode': 'tb-rl'
			});
			$('.long').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '25mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.normal').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '20mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.name').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '14mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.short').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '12mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.timelong').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '42mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.timemiddle').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '33mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.specialtimemiddle').css({
				'display': 'inline-block',
				'border-bottom': '1px solid black',
				'width': '26mm',
				'height': '4mm',
				'text-align': 'center'
			});
			$('.special div').css({
				'margin':'1px 0'
			});
			$('.outer .container .row').css({
				'padding': '.3mm 0'
			});
			$('.PageOne').css({
				'height': '292mm',
				'width': '200mm',
				'margin': '2mm auto 0'
			});
			$('.PageTwo').css({
				'width': '200mm',
				'margin': '0 auto'
			});
			setValForRadios();
			setValForCheckboxes();

			LODOP = getLodop();
			LODOP.PRINT_INITA(0, 0, "210mm", "297mm", "打印控件功能演示_Lodop功能_超文本内容缩放打印");
			//LODOP.SET_PRINT_PAGESIZE(0, "210mm", "297mm", "");
			LODOP.SET_PRINT_MODE("NOCLEAR_AFTER_PRINT", true);
			LODOP.ADD_PRINT_HTM('2mm', 0, "100%", "100%", document.getElementById("printDoc").innerHTML);
			LODOP.SET_PRINT_MODE("PRINT_DUPLEX", 2);
			LODOP.SET_PRINT_MODE("PRINT_DEFAULTSOURCE", 1); //1 - 纸盒 4 - 手动 7 - 自动 0 - 不控制
			// LODOP.SET_PRINT_MODE("DOUBLE_SIDED_PRINT", true);
			LODOP.PREVIEW();
		}
		/**
		 * 根据各字段对应的avalon的值，实现单选赋值
		 */
		function setValForRadios() {
			var radioArray = ['CBZD', 'YNRSSC', 'YNRSZL', 'YNYW', 'YNJL', 'YNRSZT', 'RULU', 'QNYX', 'GNJC', 'IABP', 'LSQBQ',
				'ECMO', 'ZXSFZZZ', 'CYZD', 'ZLJG', 'YNXFXLSJ', 'JZZD', 'LGZD', 'xzcd', 'zjnxs', 'sffcbb', 'sfcto', 'gracewxfc',
				'KILLIP', 'ZGZCS', 'YNRSHX', 'TTZL', 'BSTZZJ', 'cstSexCod', 'senRctCod', 'cstDspCod', 'SFHJXNKHZ', 'SFYW', 'KNYW',
				'NNTLX', 'HZZG', 'SWYY', 'NYHA', 'CLCL', 'QRXCL'
			];
			var radioArray2 = ['ycxdtcs', 'csfs', 'kxxbgy', 'yqrssc', 'yqrs', 'rscs', 'rsyw', 'rsywjl', 'rszt', 'zd', 'zycs',
				'XINGB'
			];
			for (var i = 0; i < radioArray.length; i++) {
				$('#' + radioArray[i] + '_0').attr('checked', false);
				$('#' + radioArray[i] + '_1').attr('checked', false);
				$('#' + radioArray[i] + '_2').attr('checked', false);
				$('#' + radioArray[i] + '_3').attr('checked', false);
				$('#' + radioArray[i] + '_4').attr('checked', false);
				$('#' + radioArray[i] + '_5').attr('checked', false);
				$('#' + radioArray[i] + '_6').attr('checked', false);
				$('#' + radioArray[i] + '_7').attr('checked', false);
				$('#' + radioArray[i] + '_8').attr('checked', false);

				if (vm.msg.patientInfo[radioArray[i]] == 1 || vm.msg.hspCrivelInf[radioArray[i]] == 1 || vm.msg.hspGraceInf[
						radioArray[i]] == 1 || vm.msg.hspEmgInf[radioArray[i]] == 1) {
					$('#' + radioArray[i] + '_1').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 0 || vm.msg.hspCrivelInf[radioArray[i]] == 0 || vm.msg.hspEmgInf[
						radioArray[i]] == 0 || vm.msg.hspEmgInf[radioArray[i]] == 0) {
					$('#' + radioArray[i] + '_0').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 2 || vm.msg.hspCrivelInf[radioArray[i]] == 2 || vm.msg.hspGraceInf[
						radioArray[i]] == 2 || vm.msg.hspEmgInf[radioArray[i]] == 2) {
					$('#' + radioArray[i] + '_2').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 3 || vm.msg.hspCrivelInf[radioArray[i]] == 3 || vm.msg.hspGraceInf[
						radioArray[i]] == 3 || vm.msg.hspEmgInf[radioArray[i]] == 3) {
					$('#' + radioArray[i] + '_3').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 4 || vm.msg.hspCrivelInf[radioArray[i]] == 4 || vm.msg.hspGraceInf[
						radioArray[i]] == 4) {
					$('#' + radioArray[i] + '_4').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 5 || vm.msg.hspCrivelInf[radioArray[i]] == 5 || vm.msg.hspEmgInf[
						radioArray[i]] == 5) {
					$('#' + radioArray[i] + '_5').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 6 || vm.msg.hspEmgInf[radioArray[i]] == 6) {
					$('#' + radioArray[i] + '_6').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 7) {
					$('#' + radioArray[i] + '_7').attr('checked', true);
				}
				if (vm.msg.patientInfo[radioArray[i]] == 8) {
					$('#' + radioArray[i] + '_8').attr('checked', true);
				}

				//病情评估
				$('#BQPG_01').attr('checked', false);
				$('#BQPG_02').attr('checked', false);
				$('#BQPG_03').attr('checked', false);
				if (vm.msg.patientInfo['BQPG'] == '01') {
					$('#BQPG_01').attr('checked', true);
				}
				if (vm.msg.patientInfo['BQPG'] == '02') {
					$('#BQPG_02').attr('checked', true);
				}
				if (vm.msg.patientInfo['BQPG'] == '03') {
					$('#BQPG_03').attr('checked', true);
				}
			}

			//到达方式
			$('#arvChlCod_1').attr('checked', false);
			$('#arvChlCod_2').attr('checked', false);
			$('#arvChlCod_3').attr('checked', false);
			if (vm.msg.hspEmgInf['arvChlCod'] == '5' || vm.msg.hspEmgInf['arvChlCod'] == '6') {
				$('#arvChlCod_1').attr('checked', true);
			}
			if (vm.msg.hspEmgInf['arvChlCod'] == '9') {
				$('#arvChlCod_2').attr('checked', true);
			}
			if (vm.msg.hspEmgInf['arvChlCod'] == '0' || vm.msg.hspEmgInf['arvChlCod'] == '1' || vm.msg.hspEmgInf['arvChlCod'] ==
				'2' || vm.msg.hspEmgInf['arvChlCod'] == '3' || vm.msg.hspEmgInf['arvChlCod'] == '4') {
				$('#arvChlCod_3').attr('checked', true);
			}

			//急诊PCI
			$('#JZPCI_1').attr('checked', false);
			$('#JZPCI_2').attr('checked', false);
			$('#JZPCI_3').attr('checked', false);
			if (vm.msg['JZPCI'] == 1) {
				$('#JZPCI_1').attr('checked', true);
			}
			if (vm.msg['JZPCI'] == 2) {
				$('#JZPCI_2').attr('checked', true);
			}
			if (vm.msg['JZPCI'] == 3) {
				$('#JZPCI_3').attr('checked', true);
			}

			//院内发病
			$('#ynfb').attr('checked', false);
			if (vm.msg.ynfb['ynfb'] == '1') {
				$('#ynfb_1').attr('checked', true);
			}

			//院前
			for (var i = 0; i < radioArray2.length; i++) {
				$('#' + radioArray2[i] + '_0').attr('checked', false);
				$('#' + radioArray2[i] + '_1').attr('checked', false);
				$('#' + radioArray2[i] + '_2').attr('checked', false);
				$('#' + radioArray2[i] + '_3').attr('checked', false);
				$('#' + radioArray2[i] + '_4').attr('checked', false);
				$('#' + radioArray2[i] + '_5').attr('checked', false);
				$('#' + radioArray2[i] + '_7').attr('checked', false);
				$('#' + radioArray2[i] + '_9').attr('checked', false);
				if (vm.msg.aidPatientXt[radioArray2[i]] == 0 || vm.msg.aidPatient[radioArray2[i]] == 0) {
					$('#' + radioArray2[i] + '_0').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 1 || vm.msg.aidPatient[radioArray2[i]] == 1) {
					$('#' + radioArray2[i] + '_1').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 2) {
					$('#' + radioArray2[i] + '_2').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 3) {
					$('#' + radioArray2[i] + '_3').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 4) {
					$('#' + radioArray2[i] + '_4').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 5) {
					$('#' + radioArray2[i] + '_5').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 7) {
					$('#' + radioArray2[i] + '_7').attr('checked', true);
				}
				if (vm.msg.aidPatientXt[radioArray2[i]] == 9) {
					$('#' + radioArray2[i] + '_9').attr('checked', true);
				}
			}

		}
		/**
		 *根据各字段对应的avalon的值，实现多选赋值
		 */
		function setValForCheckboxes() {
			//病情评估明细
			var checkboxArray = ["BQPGMX", "SZBFZ", "ZYQJBFZ", "XXGJBWXYS", "CYDY", 'LYXJ'];
			var checkboxArray02 = ['gracejgwtj01', 'gracejgwtj02'];
			for (var i = 0; i < checkboxArray.length; i++) {
				var val = vm.msg.patientInfo[checkboxArray[i]]; //获取string类型的值
				var _valArray = val ? val.split(',') : []; //转成数组
				if (_valArray && _valArray.length) {
					for (var j = 0; j < _valArray.length; j++) {
						$('#' + checkboxArray[i] + '_' + _valArray[j]).attr('checked', true);
					}
				}
			}
			for (var i = 0; i < checkboxArray02.length; i++) {
				var value = vm.msg.hspGraceInf[checkboxArray02[i]];
				var _valueArray = value ? value.split(',') : [];
				if (_valueArray && _valueArray.length) {
					for (var j = 0; j < _valueArray.length; j++) {
						$('#' + checkboxArray02[i] + '_' + _valueArray[j]).attr('checked', true);
					}
				}
			}
		}
	</script>

</html>
