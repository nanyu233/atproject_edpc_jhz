package activetech.edpc.extend.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSONObject;

import activetech.base.pojo.dto.ActiveUser;
import activetech.edpc.dao.mapper.HspZlInfCustomMapper;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.domain.HspFlowChartInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.websocket.action.WebSocketXT;
import activetech.zyyhospital.pojo.domain.HspHljldInf;
import activetech.zyyhospital.pojo.domain.HspHljldclrInf;
import activetech.zyyhospital.pojo.domain.Pdatransfusionrecord;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
import activetech.zyyhospital.pojo.dto.HspHljldInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspHljldcrltjInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.service.HspHljldInfService;

public class HuzHspHljldInfServiceImpl extends DecoratorHspHljldInfService{
	
	@Autowired
	private HspZlInfCustomMapper hspZlInfCustomMapper;
	
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	
	public HuzHspHljldInfServiceImpl(HspHljldInfService hspHljldInfService) {
		this.hspHljldInfService = hspHljldInfService;
	}

	@Override
	public List<HspHljldInfCustom> getHljldListByemgseq(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.getHljldListByemgseq(hspHljldInfQueryDto);
	}

	@Override
	public int findHljldCount(HspHljldInfQueryDto hspHljldInfQueryDto) {
		// TODO Auto-generated method stub
		return hspHljldInfService.findHljldCount(hspHljldInfQueryDto);
	}

	@Override
	public void addhljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		hspHljldInfService.addhljldsubmit(hspHljldInfQueryDto);
		
		HspHljldInfCustom hspHljldInfCustom = hspHljldInfQueryDto.getHsphljldinfCustom();
		
		//卒中溶栓时间插入
		if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getJchl())){
			if(hspHljldInfCustom.getJchl().indexOf("121")>-1){
				
				String rszjkssj = DateUtil.formatDateByFormat(hspHljldInfCustom.getCrtDat(),"yyyy-MM-dd HH:mm:ss");
				HspZlInf hspZlInf = new HspZlInf();
				hspZlInf.setEmgNo(hspHljldInfCustom.getEmgSeq());
				hspZlInf.setCrtUser(hspHljldInfCustom.getCrtNur());
				hspZlInf.setCrtTime(new Date());
				hspZlInf.setProCode("RSZLKSSJ");
			 	hspZlInf.setProVal(rszjkssj);
			    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
			    
			    HspFlowChartInf record = new HspFlowChartInf();
			    record.setEmgSeq(hspHljldInfCustom.getEmgSeq());
			    record.setNodeId("line10");
			    record.setFlowType("cz");
			    record.setStatus("1");
			    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
			    record.setEmgSeq(hspHljldInfCustom.getEmgSeq());
			    record.setNodeId("jmrs");
			    record.setFlowType("cz");
			    record.setStatus("1");
			    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
				// 3
				Map<String,Object> map = new HashMap<>();
			    map.put("targetPage", "cz");
			    map.put("emgSeq", hspHljldInfCustom.getEmgSeq());	    
			    map.put("message", "溶栓开始时间");
			    map.put("messageCode","rsZlKsSj");
			    map.put("time", rszjkssj);
			 	WebSocketXT.sendMessageToAllAwaiting(map);
			}
		}
	}

	@Override
	public HspHljldInf findHspHljldInfbyHqhiseq(String bqhiseq) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.findHspHljldInfbyHqhiseq(bqhiseq);
	}

	@Override
	public List<HspHljldclrInf> findHspHljldclrInfbyHqhiseq(String bqhiseq, String type) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.findHspHljldclrInfbyHqhiseq(bqhiseq, type);
	}

	@Override
	public void edithljldsubmit(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeuser) throws Exception {
		// TODO Auto-generated method stub
		hspHljldInfService.edithljldsubmit(hspHljldInfQueryDto, activeuser);
		
		HspHljldInfCustom hspHljldInfCustom = hspHljldInfQueryDto.getHsphljldinfCustom();
		//卒中溶栓时间插入
		if(StringUtils.isNotNullAndEmptyByTrim(hspHljldInfCustom.getJchl())){
			if(hspHljldInfCustom.getJchl().indexOf("121")>-1){
				
				String rszlkssj = DateUtil.formatDateByFormat(hspHljldInfCustom.getCrtDat(),"yyyy-MM-dd HH:mm:ss");
				HspZlInf hspZlInf = new HspZlInf();
				hspZlInf.setEmgNo(hspHljldInfCustom.getEmgSeq());
				hspZlInf.setCrtUser(activeuser.getUsrno());
				hspZlInf.setCrtTime(new Date());
				hspZlInf.setProCode("RSZLKSSJ");
			 	hspZlInf.setProVal(rszlkssj);
			    hspZlInfCustomMapper.mergeHspCzzlInf(hspZlInf);
			    
			    HspFlowChartInf record = new HspFlowChartInf();
			    record.setEmgSeq(hspHljldInfCustom.getEmgSeq());
			    record.setNodeId("line10");
			    record.setFlowType("cz");
			    record.setStatus("1");
			    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
			    record.setEmgSeq(hspHljldInfCustom.getEmgSeq());
			    record.setNodeId("jmrs");
			    record.setFlowType("cz");
			    record.setStatus("1");
			    hspFlowChartInfMapperCustom.mergeFlowChartInf(record);
				// 3
				Map<String,Object> map = new HashMap<>();
			    map.put("targetPage", "cz");
			    map.put("emgSeq", hspHljldInfCustom.getEmgSeq());	    
			    map.put("message", "溶栓开始时间");
			    map.put("messageCode","rsZlKsSj");
			    map.put("time", rszlkssj);
			 	WebSocketXT.sendMessageToAllAwaiting(map);
			}
		}
	}

	@Override
	public void delhljldSubmit(String bqhiSeq) throws Exception {
		// TODO Auto-generated method stub
		hspHljldInfService.delhljldSubmit(bqhiSeq);
	}

	@Override
	public HspemginfCustom findemghljldByemgSeq(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.findemghljldByemgSeq(emgSeq);
	}

	@Override
	public List<HspHljldInfCustom> findemghljldByemgSeqanddate(Date startDat, Date endDate, String emgSeq)
			throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.findemghljldByemgSeqanddate(startDat, endDate, emgSeq);
	}

	@Override
	public int addsumcrlsubmit(HspHljldcrltjInfCustom hspHljldcrltjInfCustom, ActiveUser activeuser) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.addsumcrlsubmit(hspHljldcrltjInfCustom, activeuser);
	}

	@Override
	public int findHljldCountandcrl(HspHljldInfQueryDto hspHljldInfQueryDto) {
		// TODO Auto-generated method stub
		return hspHljldInfService.findHljldCountandcrl(hspHljldInfQueryDto);
	}

	@Override
	public List<HspHljldInfCustom> getHljldListByemgseqandflg(HspHljldInfQueryDto hspHljldInfQueryDto)
			throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.getHljldListByemgseqandflg(hspHljldInfQueryDto);
	}

	@Override
	public List<HspHljldInfCustom> getHljldListByemgseqall(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		return hspHljldInfService.getHljldListByemgseqall(hspHljldInfQueryDto);
	}

	@Override
	public List<HspHljldInfCustom> findemghljldByemgSeqanddateNl(Date startDat, Date endDate, String emgSeq)
			throws Exception {
		return hspHljldInfService.findemghljldByemgSeqanddateNl(startDat, endDate, emgSeq);
	}

	@Override
	public List<JSONObject> getJhyxx() {
		return hspHljldInfService.getJhyxx();
	}

	@Override
	public String submitBradenScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.submitBradenScore(hspHljldInfQueryDto, activeUser);
	}

	@Override
	public String submitAdlScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.submitAdlScore(hspHljldInfQueryDto, activeUser);
	}

	@Override
	public String submitZyfxpfScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.submitZyfxpfScore(hspHljldInfQueryDto, activeUser);
	}

	@Override
	public String submitGcsSco(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.submitGcsSco(hspHljldInfQueryDto, activeUser);
	}

	@Override
	public String submitNrsScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.submitNrsScore(hspHljldInfQueryDto, activeUser);
	}

	@Override
	public String addMorseScore(HspHljldInfQueryDto hspHljldInfQueryDto, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.addMorseScore(hspHljldInfQueryDto, activeUser);
	}

	@Override
	public List<HspCfxxInfoCustom> cfxxInfoResult(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) {
		return hspHljldInfService.cfxxInfoResult(hspCfxxInfoQueryDto);
	}

	@Override
	public List<Pdatransfusionrecord> findPdatransfusionrecordList(HspHljldInfQueryDto hspHljldInfQueryDto) {
		return hspHljldInfService.findPdatransfusionrecordList(hspHljldInfQueryDto);
	}

	@Override
	public HspHlpgbCustom getScore(String emgSeq, ActiveUser activeUser) throws Exception {
		return hspHljldInfService.getScore(emgSeq, activeUser);
	}

	@Override
	public int findIcuHljldCount(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.findIcuHljldCount(hspHljldInfQueryDto);
	}

	@Override
	public List<HspHljldInfCustom> getIcuHljldListByemgseq(HspHljldInfQueryDto hspHljldInfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return hspHljldInfService.getIcuHljldListByemgseq(hspHljldInfQueryDto);
	}

	
	
	
}
