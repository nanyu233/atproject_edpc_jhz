package activetech.edpc.extend.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.dao.mapper.DstcompctlCustomMapper;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.pojo.dto.DstcompctlCustom;
import activetech.edpc.dao.mapper.HspCzzlInfMapperCustom;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.util.DateUtil;
import activetech.websocket.action.WebSocketXT;
import activetech.zyyhospital.pojo.dto.QjsCountCustom;
import activetech.zyyhospital.service.ZyyHspQjsInfService;

public class HuzZyyHspQjsInfServiceImpl extends DecoratorZyyHspQjsInfService{
	
	@Autowired
	private HspXtzlInfCustomMapper hspXtzlInfCustomMapper;
	
	@Autowired
	private HspCzzlInfMapperCustom hspCzzlInfMapperCustom;
	
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	
	@Autowired
	private DstcompctlCustomMapper dstcompctlCustomMapper;
	

	public HuzZyyHspQjsInfServiceImpl(ZyyHspQjsInfService zyyHspQjsInfService) {
		this.zyyHspQjsInfService = zyyHspQjsInfService;
	}

	@Override
	public HspsqlinfCustom updateLqxxdj(HspemginfQueryDto hspemginfQueryDto)
			throws Exception {
		
		HspsqlinfCustom hspsqlinfCustom = hspemginfQueryDto.getHspsqlinfCustom();
		
		// 胸痛诊疗住院号入库
		//HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
		//hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
		//hspXtzlInfCustom.setEmgNo(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
		//hspXtzlInfCustom.setModUser(activeUser.getUsrno());
		//hspXtzlInfCustom.setProVal(hspemginfQueryDto.getHspemginfCustom().getZyhdj());
		//hspXtzlInfCustom.setProCode("000007");
		//hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
		
		// 离抢转归类型，转归时间
		
		/**
		 * 1.根据不同的患者类型，放入不同的信息表，胸痛患者放入hsp_xtzl_inf, 卒中患者放入hsp_czzl_inf
		 * 放入的信息为转归时间  转归方向（如果转归为入院，还需要放入转归科室，医疗组）
		 * 
		 * 2.插入流程图表
		 * hsp_cpc_flowchart_data
		 * 
		 * 3.通知页面更新流程图的状态
		 * 
		 * 
		 */
		String emgSeq = hspemginfQueryDto.getHspemginfCustom().getEmgSeq();
		// 1
		HspCzzlInf hspCzzlInf = new HspCzzlInf(); 
	 	hspCzzlInf.setEmgNo(emgSeq);
	 	// hspCzzlInf.setCrtUser(activeUser.getUsrno());
	 	hspCzzlInf.setCrtTime(new Date());
	 	
	 	// 转归时间
	 	hspCzzlInf.setProCode("ZGSJ");
	 	hspCzzlInf.setProVal(DateUtil.formatDateByFormat(hspsqlinfCustom.getSqlDat(),"yyyy-MM-dd HH:mm:ss"));
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    // 转归去向
	    hspCzzlInf.setProCode("ZGQX");
	 	hspCzzlInf.setProVal(hspsqlinfCustom.getSqlStaCod());
	    hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    
	    // 如果转归方向为住院，则记录转归科室
	    if("2".equals(hspsqlinfCustom.getSqlStaCod())){
	    	hspCzzlInf.setProCode("ZGKS");
	    	DstcompctlCustom dstcompctlCustom = dstcompctlCustomMapper.selectCompctlByComno(hspsqlinfCustom.getSqlDepCod());
		 	hspCzzlInf.setProVal(dstcompctlCustom.getComcname());
		 	hspCzzlInfMapperCustom.mergeHspCzzlInf(hspCzzlInf);
	    }
	    
		
		// 2
	    HspFlowChartInf record = new HspFlowChartInf();
	    record.setEmgSeq(emgSeq);
	    record.setNodeId("zg");
	    record.setFlowType("cz");
	    record.setStatus("1");
	    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
		// 3
		Map<String,Object> map = new HashMap<>();
	    map.put("targetPage", "cz");
	    map.put("emgSeq", emgSeq);	    
	    map.put("message", "转归完成");
	    map.put("messageCode","zg");
	    // map.put("time", date);
	 	WebSocketXT.sendMessageToAllAwaiting(map);
		
		return zyyHspQjsInfService.updateLqxxdj(hspemginfQueryDto);
		
	}

	@Override
	public QjsCountCustom getqjsDataCount(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspQjsInfService.getqjsDataCount(hspemginfQueryDto);
	}

	@Override
	public void sendLgxx(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		zyyHspQjsInfService.sendLgxx(hspemginfQueryDto);
	}
	
	

}
