package activetech.edpc.service.impl;

import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.domain.VHemsJcjgHz;
import activetech.edpc.pojo.domain.VHemsJyjgHz;
import activetech.edpc.pojo.dto.FlowChartNodeDef;
import activetech.edpc.pojo.dto.HspZlInfCustom;
import activetech.edpc.pojo.dto.VHemsJyjgHzCustom;
import activetech.edpc.service.SysIntergratingService;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.pojo.domain.VHemsJyjg;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.util.DateUtil;
import activetech.websocket.action.WebSocketXT;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SysIntergratingServiceImpl implements SysIntergratingService {
	@Autowired
	private VHemsJyjgHzMapper vHemsJyjgHzMapper;
	@Autowired
	private VHemsJyjgHzMapperCustom vHemsJyjgHzMapperCustom;
	@Autowired
	private VHemsJcjgHzMapperCustom vHemsJcjgHzMapperCustom;
	@Autowired
	private HspZlInfCustomMapper hspZlInfCustomMapper;
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
	public void mergeHspXtzlInf(HspZlInfCustom hspZlInfCustom) {
		hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
		
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
	    HspZlInfCustom hspZlInfCustom = new HspZlInfCustom();
		hspZlInfCustom.setEmgNo(emgSeq);
		hspZlInfCustom.setCrtUser("system");
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
				hspZlInfCustom.setProCode("CTNIBGSJ");
				hspZlInfCustom.setProVal(
						DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
				hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
	    	}
	    	if (vHemsJyjgHzCustom.getExaminaim().indexOf("电肾糖") > -1 && "肌酐".equals(vHemsJyjgHzCustom.getReportItemName())) {
				mapxt.put("血清肌酐含量", vHemsJyjgHzCustom.getResult());
				hspZlInfCustom.setProCode("XQJGZ");
				hspZlInfCustom.setProVal(vHemsJyjgHzCustom.getResult());
				hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
				mapxt.put("血清肌酐单位", vHemsJyjgHzCustom.getUnits());
				hspZlInfCustom.setProCode("XQJGDW");
				hspZlInfCustom.setProVal(vHemsJyjgHzCustom.getUnits());
				hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);

			}
			if (vHemsJyjgHzCustom.getExaminaim().indexOf("急诊凝血+急诊D二聚体") > -1
					&& vHemsJyjgHzCustom.getReportItemName().indexOf("D二聚体") > -1) {
				mapxt.put("D-二聚体结果时间", vHemsJyjgHzCustom.getResultDateTime());
				hspZlInfCustom.setProCode("DEJTJGSJ");
				hspZlInfCustom.setProVal(
						DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
				hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
			}
			if (vHemsJyjgHzCustom.getExaminaim().indexOf("BNP") > -1) {
				mapxt.put("BNP结果时间", vHemsJyjgHzCustom.getResultDateTime());
				hspZlInfCustom.setProCode("BNPJCJGSJ");
				hspZlInfCustom.setProVal(
						DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
			}
	    }
		for(VHemsJyjgHzCustom jyjg : vHemsJyjgHzCustom.getSonList()){
			if ("1".equals(xtFlg)) {
				if (jyjg.getReportItemName().indexOf("肌钙蛋白I") > -1) {
					mapxt.put("CTNI含量", jyjg.getResult());
					hspZlInfCustom.setProCode("CTNISZ");
					hspZlInfCustom.setProVal("6");
					hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
					mapxt.put("CTNI单位", jyjg.getUnits());
					hspZlInfCustom.setProCode("CTNIDW");
					hspZlInfCustom.setProVal(vHemsJyjgHzCustom.getUnits());
					hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
				}
			}

			if ("1".equals(czFlg)) {
				HspZlInf hspZlInf = new HspZlInf();
				hspZlInf.setEmgNo(emgSeq);
				hspZlInf.setCrtUser("system");
				hspZlInf.setCrtTime(new Date());
				if (vHemsJyjgHzCustom.getExaminaim().indexOf("血常规") > -1) {
					
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("红细胞") > -1) {
						//通知页面血化验完成
						mapcz.put("targetPage", "cz");
						mapcz.put("emgSeq", emgSeq);
						mapcz.put("message", "血化验完成");
						mapcz.put("messageCode", "xuehy");
						mapcz.put("time", vHemsJyjgHzCustom.getResultDateTime());
						//血常规时间
						hspZlInf.setProCode("XCGSJ");
						hspZlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						
						//更新节点记录
						HspFlowChartInf record = new HspFlowChartInf();
					    record.setEmgSeq(emgSeq);
					    record.setNodeId("xuehy");
					    record.setFlowType("cz");
					    record.setStatus("1");
					    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
						
						
						mapcz.put("红细胞", vHemsJyjgHzCustom.getResult());
						hspZlInf.setProCode("HONGXB");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspZlInf.setProCode("HONGXBFLG");
//						hspZlInf.setProVal(doubleStrCompare(
//								vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspZlInf(hspZlInf);
						
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("血红蛋白") > -1) {
						hspZlInf.setProCode("XHDB");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspCzzlInf.setProCode("XHDBFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("血小板计数") > -1) {
						hspZlInf.setProCode("XXBJS");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspCzzlInf.setProCode("XXBJSFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}

				}
				if (vHemsJyjgHzCustom.getExaminaim().indexOf("急诊凝血") > -1) {
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("凝血酶原时间") > -1) {
						hspZlInf.setProCode("NXGNSJ");
						hspZlInf.setProVal(DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("NXMYSJ");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspCzzlInf.setProCode("NXMYSJFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("部分凝血活酶时间") > -1) {//d
						hspZlInf.setProCode("BFNXMSJ");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspZlInf.setProCode("HHBFNXHMSJFLG");
//						hspZlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("凝血酶时间") > -1) {
						hspZlInf.setProCode("NXMSJ");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspCzzlInf.setProCode("NXMSJFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("INR") > -1) {
						hspZlInf.setProCode("GJBZBZ");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspCzzlInf.setProCode("GJBZBZFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("二聚体") > -1) {
						hspZlInf.setProCode("DEJT");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspCzzlInf.setProCode("DEJTFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}

				}
				if ("急诊电肾糖".equals(vHemsJyjgHzCustom.getExaminaim()) || "脑卒中生化".equals(vHemsJyjgHzCustom.getExaminaim())
						|| vHemsJyjgHzCustom.getExaminaim().indexOf("肝功能") > -1) {
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("葡萄糖") > -1) {

						hspZlInf.setProCode("XTSJ");
						hspZlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("PUTT");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
//						hspZlInf.setProCode("PUTTFLG");
//						hspCzzlInf.setProVal(
//								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("血肌酐") > -1) {
						hspZlInf.setProCode("SGNSJ");
						hspZlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("XUEJG");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("XUEJGFLG");
						hspZlInf.setProVal(
								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("谷草转氨酶") > -1) {
						hspZlInf.setProCode("GGNSJ");
						hspZlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjgHzCustom.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("GCZAM");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("GCZAMFLG");
						hspZlInf.setProVal(
								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
					}
					if (vHemsJyjgHzCustom.getReportItemName().indexOf("谷丙转氨酶") > -1) {
						hspZlInf.setProCode("GBZAM");
						hspZlInf.setProVal(vHemsJyjgHzCustom.getResult());
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						hspZlInf.setProCode("GBZAMFLG");
						hspZlInf.setProVal(
								doubleStrCompare(vHemsJyjgHzCustom.getResult(),vHemsJyjgHzCustom.getUpperLimit(),vHemsJyjgHzCustom.getLowerLimit()));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
					}

				}

			}
		}

//			XTWebSocket.sendMessageToAllAwaiting(mapxt);
			//XTWebSocket.sendMessageToAllAwaiting(mapcz);
	}
	
	@Override
	public void JcjgIntergrat(VHemsJcjgHz vHemsJcjgHz) {
		//TODO 删除其他医院接口
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
	    HspZlInfCustom hspZlInfCustom = new HspZlInfCustom();
		hspZlInfCustom.setEmgNo(emgSeq);
		hspZlInfCustom.setCrtUser("system");
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
					hspZlInfCustom.setProCode("CTNIBGSJ");
					hspZlInfCustom.setProVal(
							DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
					hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
		    	}
		    	if (vHemsJyjg.getExaminaim().indexOf("电肾糖") > -1 && "肌酐".equals(vHemsJyjg.getReportItemName())) {
					mapxt.put("血清肌酐含量", vHemsJyjg.getResult());
					hspZlInfCustom.setProCode("XQJGZ");
					hspZlInfCustom.setProVal(vHemsJyjg.getResult());
					hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
					mapxt.put("血清肌酐单位", vHemsJyjg.getUnits());
					hspZlInfCustom.setProCode("XQJGDW");
					hspZlInfCustom.setProVal(vHemsJyjg.getUnits());
					hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);

				}
				if (vHemsJyjg.getExaminaim().indexOf("急诊凝血+急诊D二聚体") > -1
						&& vHemsJyjg.getReportItemName().indexOf("D二聚体") > -1) {
					mapxt.put("D-二聚体结果时间", vHemsJyjg.getResultDateTime());
					hspZlInfCustom.setProCode("DEJTJGSJ");
					hspZlInfCustom.setProVal(
							DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
					hspZlInfCustomMapper.mergeHspXtzlInf(hspZlInfCustom);
				}
				if (vHemsJyjg.getExaminaim().indexOf("BNP") > -1) {
					mapxt.put("BNP结果时间", vHemsJyjg.getResultDateTime());
					hspZlInfCustom.setProCode("BNPJCJGSJ");
					hspZlInfCustom.setProVal(
							DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
				}
		    }
		 if ("1".equals(czFlg)) {
				HspZlInf hspZlInf = new HspZlInf();
				hspZlInf.setEmgNo(emgSeq);
				hspZlInf.setCrtUser("system");
				hspZlInf.setCrtTime(new Date());
				if (vHemsJyjg.getExaminaim().indexOf("血常规") > -1) {
					
					if (vHemsJyjg.getReportItemName().indexOf("红细胞") > -1) {
						//通知页面血化验完成
						mapcz.put("targetPage", "cz");
						mapcz.put("emgSeq", emgSeq);
						mapcz.put("message", "血化验完成");
						mapcz.put("messageCode", "xuehy");
						mapcz.put("time", vHemsJyjg.getResultDateTime());
						//血常规时间
						hspZlInf.setProCode("XCGSJ");
						hspZlInf.setProVal(
								DateUtil.formatDateByFormat(vHemsJyjg.getResultDateTime(), "yyyy-MM-dd hh:mm:ss"));
						hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
						
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
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
//						hspCzzlInf.setProCode("HONGXBFLG");
//						hspCzzlInf.setProVal(doubleStrCompare(
//								vHemsJyjg.getResult(),vHemsJyjg.getUpperLimit(),vHemsJyjg.getLowerLimit()));
//						hspZlInfCustomMapper.mergeHspCzzlInf(hspCzzlInf);
						
					}

				}

			}
	}

	@Override
	public void vHemsJyjgInsert(VHemsJyjg vHemsJyjg) {
		vHemsJyjgMapper.insert(vHemsJyjg);
	}
	
}
