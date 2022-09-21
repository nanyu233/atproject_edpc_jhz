package activetech.edpc.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import activetech.edpc.dao.mapper.HspCzzlInfMapperCustom;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.dao.mapper.VHemsJcjgHzMapperCustom;
import activetech.edpc.dao.mapper.VHemsJyjgHzMapper;
import activetech.edpc.dao.mapper.VHemsJyjgHzMapperCustom;
import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.pojo.dto.FlowChartNodeDef;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.pojo.dto.VHemsJcjgHzCustom;
import activetech.edpc.pojo.dto.VHemsJyjgHzCustom;
import activetech.edpc.service.SysIntergratingService;
import activetech.edpc.xml.dto.MessageBody;
import activetech.edpc.xml.dto.MessageHeader;
import activetech.edpc.xml.dto.ReportInfo;
import activetech.edpc.xml.dto.Request;
import activetech.edpc.xml.dto.Response;
import activetech.edpc.xml.dto.Result;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.pojo.domain.VHemsJyjg;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.util.UUIDBuild;
import activetech.webservice.client.xmlservice.ReportService;
import activetech.webservice.client.xmlservice.ReportServiceSoap;
import activetech.websocket.action.WebSocketXT;

public class SysIntergratingServiceImpl implements SysIntergratingService {
	@Autowired
	private VHemsJyjgHzMapper vHemsJyjgHzMapper;
	@Autowired
	private VHemsJyjgHzMapperCustom vHemsJyjgHzMapperCustom;
	@Autowired
	private VHemsJcjgHzMapperCustom vHemsJcjgHzMapperCustom;
	@Autowired
	private HspXtzlInfCustomMapper hspXtzlInfCustomMapper;
	@Autowired
	private HspCzzlInfMapperCustom hspCzzlInfMapperCustom;
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	@Autowired
	private VHemsJyjgMapper vHemsJyjgMapper;

	@Override
	public List<VHemsJyjgHzCustom> getJyjgListBySampleno(VHemsJyjgHz vHemsJyjgHz) {
		// TODO Auto-generated method stub
		
		return vHemsJyjgHzMapperCustom.findVhemsJyjgByMpijzxh(vHemsJyjgHz);
	}

	@Override
	public void mergeHspXtzlInf(HspXtzlInfCustom hspXtzlInfCustom) {
		hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
		
	}

	@Override
	public void JyjgIntergrat(VHemsJyjgHzCustom vHemsJyjgHzCustom) {
//		List<VHemsJyjgHzCustom> jyjgList = getJyjgListBySampleno(vHemsJyjgHzCustom);
//		System.out.println(vHemsJyjgHzCustom.toString());
		HspemginfCustom param = new HspemginfCustom();
		param.setMpi(vHemsJyjgHzCustom.getMpi());
		param.setJzxh(Long.valueOf(vHemsJyjgHzCustom.getSeekMedicalTimes()));
		HspemginfCustom emginf = hspemginfCustomMapper.findEmgByMpiJzxh(param);
		if(emginf == null)
			return;
		Map<String, Object> mapxt = new HashMap<>();
		Map<String, Object> mapcz = new HashMap<>();
		String xtFlg = emginf.getXtlcflg();
		String czFlg = emginf.getCzlcflg();
	    String emgSeq = emginf.getEmgSeq();
	    HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
		hspXtzlInfCustom.setEmgNo(emgSeq);
		hspXtzlInfCustom.setCrtUser("system");
	    if("1".equals(xtFlg)) {
	    	if (vHemsJyjgHzCustom.getExaminaim().indexOf("肌钙蛋白")>-1 || vHemsJyjgHzCustom.getExaminaim().indexOf("心脏五联")>-1) {
				//以肌钙蛋白判定检验是否完成
				HspFlowChartInf record = new HspFlowChartInf();
				record.setEmgSeq(emgSeq);
				record.setNodeId(FlowChartNodeDef.SYSJC);
				record.setStatus("1");
				record.setFlowType("xt");
				hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
				//发通知
				Map<String,Object> mapsysjc = new HashMap<>();
				mapsysjc.put("emgSeq", emgSeq);                  //要通知的患者
				mapsysjc.put("greenNodeId", FlowChartNodeDef.SYSJC);//id
				try {
					WebSocketXT.sendMessageToAllAwaiting(mapsysjc);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				mapxt.put("emgSeq", emgSeq);
				mapxt.put("greenNodeId", "4");
				mapxt.put("CTNI报告时间", vHemsJyjgHzCustom.getResultDateTime());
				hspXtzlInfCustom.setProCode("CTNIBGSJ");
				hspXtzlInfCustom.setProVal(
						DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
				hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	    	}
	    	if (vHemsJyjgHzCustom.getExaminaim().indexOf("电肾糖") > -1 && "肌酐".equals(vHemsJyjgHzCustom.getReportItemName())) {
				mapxt.put("血清肌酐含量", vHemsJyjgHzCustom.getResult());
				hspXtzlInfCustom.setProCode("XQJGZ");
				hspXtzlInfCustom.setProVal(vHemsJyjgHzCustom.getResult());
				hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
				mapxt.put("血清肌酐单位", vHemsJyjgHzCustom.getUnits());
				hspXtzlInfCustom.setProCode("XQJGDW");
				hspXtzlInfCustom.setProVal(vHemsJyjgHzCustom.getUnits());
				hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);

			}
			if (vHemsJyjgHzCustom.getExaminaim().indexOf("急诊凝血+急诊D二聚体") > -1
					&& vHemsJyjgHzCustom.getReportItemName().indexOf("D二聚体") > -1) {
				mapxt.put("D-二聚体结果时间", vHemsJyjgHzCustom.getResultDateTime());
				hspXtzlInfCustom.setProCode("DEJTJGSJ");
				hspXtzlInfCustom.setProVal(
						DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
				hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
			}
			if (vHemsJyjgHzCustom.getExaminaim().indexOf("BNP") > -1) {
				mapxt.put("BNP结果时间", vHemsJyjgHzCustom.getResultDateTime());
				hspXtzlInfCustom.setProCode("BNPJCJGSJ");
				hspXtzlInfCustom.setProVal(
						DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
			}
	    }
		for(VHemsJyjgHzCustom jyjg : vHemsJyjgHzCustom.getSonList()){
			if ("1".equals(xtFlg)) {
				if (jyjg.getReportItemName().indexOf("肌钙蛋白I") > -1) {
					mapxt.put("CTNI含量", jyjg.getResult());
					hspXtzlInfCustom.setProCode("CTNISZ");
					hspXtzlInfCustom.setProVal("6");
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
					mapxt.put("CTNI单位", jyjg.getUnits());
					hspXtzlInfCustom.setProCode("CTNIDW");
					hspXtzlInfCustom.setProVal(vHemsJyjgHzCustom.getUnits());
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
				}
			}

			if ("1".equals(czFlg)) {
				HspCzzlInf hspCzzlInf = new HspCzzlInf();
				hspCzzlInf.setEmgNo(emgSeq);
				hspCzzlInf.setCrtUser("system");
				hspCzzlInf.setCrtTime(new Date());
				if (vHemsJyjgHzCustom.getExaminaim().indexOf("血常规") > -1) {
					
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("红细胞") > -1) {
						//通知页面血化验完成
						mapcz.put("targetPage", "cz");
						mapcz.put("emgSeq", emgSeq);
						mapcz.put("message", "血化验完成");
						mapcz.put("messageCode", "xuehy");
						mapcz.put("time", vHemsJyjgHzCustom.getResultDateTime());
						//血常规时间
						hspCzzlInf.setProCode("XCGSJ");
						hspCzzlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						
						//更新节点记录
						HspFlowChartInf record = new HspFlowChartInf();
					    record.setEmgSeq(emgSeq);
					    record.setNodeId("xuehy");
					    record.setFlowType("cz");
					    record.setStatus("1");
					    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
						
						
						mapcz.put("红细胞", vHemsJyjgHzCustom.getResult());
						hspCzzlInf.setProCode("HONGXB");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("HONGXBFLG");
//						hspCzzlInf.setProVal(doubleStrCompare(
//								vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("血红蛋白") > -1) {
						hspCzzlInf.setProCode("XHDB");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("XHDBFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("血小板计数") > -1) {
						hspCzzlInf.setProCode("XXBJS");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("XXBJSFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}

				}
				if (vHemsJyjgHzCustom.getExaminaim().indexOf("急诊凝血") > -1) {
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("凝血酶原时间") > -1) {
						hspCzzlInf.setProCode("NXGNSJ");
						hspCzzlInf.setProVal(DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("NXMYSJ");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("NXMYSJFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("部分凝血活酶时间") > -1) {//d
						hspCzzlInf.setProCode("BFNXMSJ");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("HHBFNXHMSJFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("凝血酶时间") > -1) {
						hspCzzlInf.setProCode("NXMSJ");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("NXMSJFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("INR") > -1) {
						hspCzzlInf.setProCode("GJBZBZ");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("GJBZBZFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("二聚体") > -1) {
						hspCzzlInf.setProCode("DEJT");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("DEJTFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}

				}
				if ("急诊电肾糖".equals(vHemsJyjgHzCustom.getExaminaim()) || "脑卒中生化".equals(vHemsJyjgHzCustom.getExaminaim())
						|| vHemsJyjgHzCustom.getExaminaim().indexOf("肝功能") > -1) {
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("葡萄糖") > -1) {

						hspCzzlInf.setProCode("XTSJ");
						hspCzzlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("PUTT");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("PUTTFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("血肌酐") > -1) {
						hspCzzlInf.setProCode("SGNSJ");
						hspCzzlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("XUEJG");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("XUEJGFLG");
						hspCzzlInf.setProVal(
								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("谷草转氨酶") > -1) {
						hspCzzlInf.setProCode("GGNSJ");
						hspCzzlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("GCZAM");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("GCZAMFLG");
						hspCzzlInf.setProVal(
								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("谷丙转氨酶") > -1) {
						hspCzzlInf.setProCode("GBZAM");
						hspCzzlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						hspCzzlInf.setProCode("GBZAMFLG");
						hspCzzlInf.setProVal(
								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
					}

				}

			}
		}

//			XTWebSocket.sendMessageToAllAwaiting(mapxt);
			//XTWebSocket.sendMessageToAllAwaiting(mapcz);
	}
	
	@Override
	public void JcjgIntergrat(VHemsJcjgHz vHemsJcjgHz) {
		List<VHemsJcjgHzCustom> jcjglist = vHemsJcjgHzMapperCustom.findVhemsJcjgByMpijzxh(vHemsJcjgHz);
		for (VHemsJcjgHzCustom jcjg : jcjglist) {
			String xtFlg = jcjg.getXtFlg();
			String czFlg = jcjg.getCzFlg();
			String emgSeq = jcjg.getEmgSeq();
			
			if("1".equals(xtFlg)){
				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>进入胸痛环节");
				if(jcjg.getYlmc().indexOf("心电")>-1){
					
					HspFlowChartInf record = new HspFlowChartInf();
				    record.setEmgSeq(emgSeq);
				    record.setNodeId("tlCTaBgSj");
				    record.setFlowType("cz");
				    record.setStatus("1");
				    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
				    ReportInfo r = new ReportInfo(jcjg.getMpi()
				    								,"1"
				    								,"EC"
				    								,"D"
				    								,DateUtil.formatDateByFormat(jcjg.getShrq(), "yyyyMMdd000000"));
				    MessageHeader mh = new MessageHeader("EMIS", "HIS", DateUtil.getCurrentTime(), "QBP_REPORT", UUIDBuild.getUUID());
					MessageBody messageBody = new MessageBody();
					messageBody.setReportInfo(r);
					Request Request = new Request();
					Request.setMessageBody(messageBody);
					Request.setMessageHeader(mh);
					XStream xs = new XStream(new DomDriver());
					xs.alias("Request", Request.class);
					xs.alias("ReportInfo", ReportInfo.class);
					xs.alias("MessageHeader", MessageHeader.class);
					xs.alias("MessageBody", MessageBody.class);
					
					ReportService reportService = new ReportService();
					ReportServiceSoap reportServiceSoap = reportService.getReportServiceSoap();
					//去除reportinfo同级多项导致无法解析的问题
					String retStr = reportServiceSoap.xmlService(xs.toXML(Request))
							.replace("</Result>", "</Result><ReportInfos>").replace("</MessageBody>", "</ReportInfos></MessageBody>");
					
					XStream xsr = new XStream(new DomDriver());
					
					xsr.alias("Response", Response.class);
					xsr.alias("MessageBody", MessageBody.class);
					xsr.alias("RESULT", Result.class);
					xsr.alias("ReportInfo", ReportInfo.class);
					xsr.alias("MessageHeader", MessageHeader.class);
					xsr.aliasField("RESULT", MessageBody.class, "result");
					
					xsr.aliasField("ReportInfo", MessageBody.class, "ReportInfos");
					xsr.aliasField("PatientId", ReportInfo.class, "PatientId");
					
					Response re = (Response) xsr.fromXML(retStr);
					List<ReportInfo> rilist = re.getMessageBody().getReportInfos();
					for(int i=0;i<rilist.size();i++){
						
					}
				}
				if("全主动脉CTA(仅限主动脉夹层患者)(常规CT)".equals(jcjg.getYlmc())){
					
				}
				if(jcjg.getYlmc().indexOf("心包腔")>-1 &&
						jcjg.getYlmc().indexOf("普通彩超")>-1){
					HspFlowChartInf record = new HspFlowChartInf();
				    record.setEmgSeq(emgSeq);
				    record.setNodeId("tlCTaBgSj");
				    record.setFlowType("cz");
				    record.setStatus("1");
				    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
				    
				    //2  提取webSocket句柄，发送给所有的客户端
				    Map<String,Object> map = new HashMap<>();
				    map.put("targetPage", "cz");
				    map.put("emgSeq", emgSeq);	    
				    map.put("message", "头颅CTA完成");
				    map.put("messageCode","tlCTaBgSj");
				    map.put("time", jcjg.getShrq());
				 	try {
						WebSocketXT.sendMessageToAllAwaiting(map);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(jcjg.getYlmc().indexOf("肺动脉CTA")>-1 &&
						jcjg.getYlmc().indexOf("增强(常规CT)")>-1){
				}
				if(jcjg.getYlmc().indexOf("胸部平扫")>-1){
				}
			}
//			if("1".equals(czFlg)){
//				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>进入卒中环节");
//				HspCzzlInf hspCzzlInf = new HspCzzlInf();
//				hspCzzlInf.setEmgNo(emgSeq);
//				hspCzzlInf.setCrtUser("system");
//				hspCzzlInf.setCrtTime(new Date());
//				if((jcjg.getYlmc().indexOf("颅脑")>-1 || jcjg.getYlmc().indexOf("头颅")>-1)
//						&& ((jcjg.getYlmc().indexOf("CT")>-1 && jcjg.getYlmc().indexOf("CTA")<0) 
//								|| jcjg.getYlmc().indexOf("MRI")> -1)){
//					System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>进入卒中颅脑ct");
//					//1  更新节点记录表
//					HspFlowChartInf record = new HspFlowChartInf();
//				    record.setEmgSeq(emgSeq);
//				    record.setNodeId("tlCT");
//				    record.setFlowType("cz");
//				    record.setStatus("1");
//				    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
//				    
//				    //2  提取webSocket句柄，发送给所有的客户端
//				    Map<String,Object> map = new HashMap<>();
//				    map.put("targetPage", "cz");
//				    map.put("emgSeq", emgSeq);	    
//				    map.put("message", "头颅CT完成");
//				    map.put("messageCode","tlCT");
//				    map.put("time", jcsj);
//				 	XTWebSocket.sendMessageToAllAwaiting(map);
//				 	
////				    //头颅CT检查医生
////				    hspCzzlInf.setProCode("TlCTjcys");
////				 	hspCzzlInf.setProVal(jcjg.getJcysxm());
////				    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//				    
//				    //头颅CT检查时间
//				 	HspCzzlInfExample czExample = new HspCzzlInfExample();
//				 	HspCzzlInfExample.Criteria czcriteria = czExample.createCriteria();
//				 	czcriteria.andEmgNoEqualTo(emgSeq);
//				 	czcriteria.andProCodeEqualTo("YXXJCSJ");
//				 	List<HspCzzlInf> czzls = hspCzzlInfMapper.selectByExample(czExample); 
//				 	if(czzls.size() == 0 && StringUtils.isNotNullAndEmptyByTrim(jcjg.getJcrq())){
//				 		hspCzzlInf.setProCode("YXXJCSJ");
//					    hspCzzlInf.setProVal(DateUtil.formatDateByFormat(DateUtils.addMinutes(jcjg.getJcrq(), 2),"yyyy-MM-dd HH:mm:ss"));
//					    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//				 	}
//				   
//				}
//				if((jcrw.getYlmc().indexOf("颅脑")>-1 || jcrw.getYlmc().indexOf("头颅")>-1)
//						&& jcrw.getYlmc().indexOf("CTA")>-1){
//					//1  更新节点记录表
//					HspFlowChartInf record = new HspFlowChartInf();
//				    record.setEmgSeq(emgSeq);
//				    record.setNodeId("tlCTaBgSj");
//				    record.setFlowType("cz");
//				    record.setStatus("1");
//				    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
//				    
//				    //2  提取webSocket句柄，发送给所有的客户端
//				    Map<String,Object> map = new HashMap<>();
//				    map.put("targetPage", "cz");
//				    map.put("emgSeq", emgSeq);	    
//				    map.put("message", "头颅CTA完成");
//				    map.put("messageCode","tlCTaBgSj");
//				    map.put("time", jcsj);
//				 	XTWebSocket.sendMessageToAllAwaiting(map);
//				}
//			}
		}
	}
	
	/**
	 * 比较数字字符串大小返回偏低或偏高 0正常|1偏低|2偏高
	 * @param val
	 * @param up
	 * @param down
	 * @return
	 */
	public String doubleStrCompare(String val,String up,String down){
		try {
			double dval = Double.valueOf(val);
			double dup = Double.valueOf(up);
			double ddown = Double.valueOf(down);
			if(dval > dup){
				return "2";
			}
			if(dval < ddown){
				return "1";
			}
		} catch (Exception e) {
			// TODO: handle exception
			return "0";
		}
		return "0";
	}
	
	//拼接请求报文头尾字段
	public String getReportPostStr(String reqStr){
		String headStr = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:ton=\"http://tongji.org\">"
				+"<soapenv:Header/>"
				+"<soapenv:Body>"
				+ "<ton:XMLService>"
				+ "<ton:pInput><![CDATA[";
		String footStr = "]]></ton:pInput>"
				+ "</ton:XMLService>"
				+ "</soapenv:Body>"
				+ "</soapenv:Envelope>";
		String postStr = headStr + reqStr + footStr;
		
		return postStr;
	}

	@Override
	public void JyjgIntergratSt(VHemsJyjg vHemsJyjg) {
		
		HspemginfCustom param = new HspemginfCustom();
		param.setVstCad(vHemsJyjg.getMpi());
		HspemginfCustom emginf = hspemginfCustomMapper.findRecentEmgByVstcad(param);
		if(emginf == null)
			return;
		Map<String, Object> mapxt = new HashMap<>();
		Map<String, Object> mapcz = new HashMap<>();
		String xtFlg = emginf.getXtlcflg();
		String czFlg = emginf.getCzlcflg();
	    String emgSeq = emginf.getEmgSeq();
	    HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
		hspXtzlInfCustom.setEmgNo(emgSeq);
		hspXtzlInfCustom.setCrtUser("system");
		 if("1".equals(xtFlg)) {
		    	if (vHemsJyjg.getExaminaim().indexOf("肌钙蛋白")>-1 || vHemsJyjg.getExaminaim().indexOf("心脏五联")>-1) {
					//以肌钙蛋白判定检验是否完成
					HspFlowChartInf record = new HspFlowChartInf();
					record.setEmgSeq(emgSeq);
					record.setNodeId(FlowChartNodeDef.SYSJC);
					record.setStatus("1");
					record.setFlowType("xt");
					hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
					//发通知
					Map<String,Object> mapsysjc = new HashMap<>();
					mapsysjc.put("emgSeq", emgSeq);                  //要通知的患者
					mapsysjc.put("greenNodeId", FlowChartNodeDef.SYSJC);//id
					try {
						WebSocketXT.sendMessageToAllAwaiting(mapsysjc);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					mapxt.put("emgSeq", emgSeq);
					mapxt.put("greenNodeId", "4");
					mapxt.put("CTNI报告时间", vHemsJyjg.getResultDateTime());
					hspXtzlInfCustom.setProCode("CTNIBGSJ");
					hspXtzlInfCustom.setProVal(
							DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
		    	}
		    	if (vHemsJyjg.getExaminaim().indexOf("电肾糖") > -1 && "肌酐".equals(vHemsJyjg.getReportItemName())) {
					mapxt.put("血清肌酐含量", vHemsJyjg.getResult());
					hspXtzlInfCustom.setProCode("XQJGZ");
					hspXtzlInfCustom.setProVal(vHemsJyjg.getResult());
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
					mapxt.put("血清肌酐单位", vHemsJyjg.getUnits());
					hspXtzlInfCustom.setProCode("XQJGDW");
					hspXtzlInfCustom.setProVal(vHemsJyjg.getUnits());
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);

				}
				if (vHemsJyjg.getExaminaim().indexOf("急诊凝血+急诊D二聚体") > -1
						&& vHemsJyjg.getReportItemName().indexOf("D二聚体") > -1) {
					mapxt.put("D-二聚体结果时间", vHemsJyjg.getResultDateTime());
					hspXtzlInfCustom.setProCode("DEJTJGSJ");
					hspXtzlInfCustom.setProVal(
							DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
					hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
				}
				if (vHemsJyjg.getExaminaim().indexOf("BNP") > -1) {
					mapxt.put("BNP结果时间", vHemsJyjg.getResultDateTime());
					hspXtzlInfCustom.setProCode("BNPJCJGSJ");
					hspXtzlInfCustom.setProVal(
							DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
				}
		    }
		 if ("1".equals(czFlg)) {
				HspCzzlInf hspCzzlInf = new HspCzzlInf();
				hspCzzlInf.setEmgNo(emgSeq);
				hspCzzlInf.setCrtUser("system");
				hspCzzlInf.setCrtTime(new Date());
				if (vHemsJyjg.getExaminaim().indexOf("血常规") > -1) {
					
					if (vHemsJyjg.getReportItemName().indexOf("红细胞") > -1) {
						//通知页面血化验完成
						mapcz.put("targetPage", "cz");
						mapcz.put("emgSeq", emgSeq);
						mapcz.put("message", "血化验完成");
						mapcz.put("messageCode", "xuehy");
						mapcz.put("time", vHemsJyjg.getResultDateTime());
						//血常规时间
						hspCzzlInf.setProCode("XCGSJ");
						hspCzzlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						
						//更新节点记录
						HspFlowChartInf record = new HspFlowChartInf();
					    record.setEmgSeq(emgSeq);
					    record.setNodeId("xuehy");
					    record.setFlowType("cz");
					    record.setStatus("1");
					    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
						
					    try {
							WebSocketXT.sendMessageToAllAwaiting(mapcz);
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
//						mapcz.put("红细胞", vHemsJyjg.getResult());
//						hspCzzlInf.setProCode("HONGXB");
//						hspCzzlInf.setProVal(vHemsJyjg.getResult());
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("HONGXBFLG");
//						hspCzzlInf.setProVal(doubleStrCompare(
//								vHemsJyjg.getResult(),vHemsJyjg.getUpperLimit(),vHemsJyjg.getLowerLimit()));
//						hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
						
					}

				}

			}
	}

	@Override
	public void vHemsJyjgInsert(VHemsJyjg vHemsJyjg) {
		vHemsJyjgMapper.insert(vHemsJyjg);
	}
	
}
