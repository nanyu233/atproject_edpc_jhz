package activetech.edpc.extend.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.dao.mapper.HspXtzlInfCustomMapper;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.hospital.pojo.dto.HspScoCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.zyyhospital.pojo.domain.HspFrbrInf;
import activetech.zyyhospital.pojo.domain.THemsSjz;
import activetech.zyyhospital.pojo.dto.HspCheckCaseInfCustom;
import activetech.zyyhospital.service.ZyyHspemginfService;


public class HuzZyyHspemginfServiceImpl extends DecoratorZyyHspemginfService{
	
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	
	@Autowired
	private HspXtzlInfCustomMapper hspXtzlInfCustomMapper;
	
	public HuzZyyHspemginfServiceImpl(ZyyHspemginfService zyyHspemginfService) {
		this.zyyHspemginfService = zyyHspemginfService;
	}

	@Override
	public HspsqlinfCustom insertHspemginf_hzzyy(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		return zyyHspemginfService.insertHspemginf_hzzyy(hspemginfQueryDto, activeUser);
	}

	@Override
	public HspsqlinfCustom insertHspemginf_qjs_hzzyy(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.insertHspemginf_qjs_hzzyy(hspemginfQueryDto, activeUser);
	}


	@Override
	public void deleteHspemginf_hzzyy(String emgSeq, ActiveUser activeuser) throws Exception {
		// TODO Auto-generated method stub
		zyyHspemginfService.deleteHspemginf_hzzyy(emgSeq, activeuser);
	}

	@Override
	public HspemginfQueryDto findHspemginfByemgSeq_zyy(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfByemgSeq_zyy(emgSeq);
	}

	@Override
	public int findHspemginfCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfCount(hspemginfQueryDto);
	}

	@Override
	public List<HspemginfCustom> findHspemginfList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfList(hspemginfQueryDto);
	}

	@Override
	public HspemginfCustom findHspemginfByemgSeq(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfByemgSeq(emgSeq);
	}

	@Override
	public int findHspemginfQjsCountzyy(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfQjsCountzyy(hspemginfQueryDto);
	}

	/*
	@Override
	public HspsqlinfCustom submitEditAndOutCome(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		
		HspsqlinfCustom hspsqlinfCustom = zyyHspemginfService.submitEditAndOutCome(hspemginfQueryDto, activeUser);
		
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
		HspFastInfCustom hspFastInfCustom = hspemginfQueryDto.getHspFastInfCustom();
		
		if("1".equals(hspFastInfCustom.getCzFlag())){
			StringBuilder czCod = new StringBuilder();
			czCod.append(hspFastInfCustom.getMtCod()!=null?"1":"0");
			czCod.append(",");
			czCod.append(hspFastInfCustom.getSzthCod()!=null?"1":"0");
			czCod.append(",");
			czCod.append(hspFastInfCustom.getWlCod()!=null?"1":"0");
			hspemginfQueryDto.getHspemginfCustom().setCzlcflg(czCod.toString());
			
			HspFlowChartInf hspFlowChartInf = new HspFlowChartInf();
			hspFlowChartInf.setEmgSeq(hspemginfCustom.getEmgSeq());
			hspFlowChartInf.setFlowType("cz");
			hspFlowChartInf.setStatus("1");
			
			hspFlowChartInf.setNodeId("yjfz");
		    hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    
		    hspFlowChartInf.setNodeId("line27");
		    hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    
		    hspFlowChartInf.setNodeId("qdszys1");
		    hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    
		    String emgFkCod = hspemginfCustom.getEmgFkCod();
		    if("2001125".equals(emgFkCod)){
		    	// 分科 选择神经内科
		    	
		    	hspFlowChartInf.setNodeId("line29");
			    hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
			    hspFlowChartInf.setNodeId("czzxys");
		    	hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    	hspFlowChartInf.setNodeId("line31");
		    	
		    }else {
		    	
		    	hspFlowChartInf.setNodeId("line28");
			    hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    	hspFlowChartInf.setNodeId("jzkys");
		    	hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    	hspFlowChartInf.setNodeId("line30");
			    
		    }
		    hspFlowChartInfMapperCustom.mergeFlowChartInf(hspFlowChartInf);
		    
		}
		
		//8.湖州第一人民医院胸痛部分需求|胸痛病情评估插入hspxtzlinf
		//胸痛病情评估
		if("1".equals(hspemginfCustom.getXtFlg())){
			//胸痛病情评估
			HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
			hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
			hspXtzlInfCustom.setEmgNo(hspemginfCustom.getEmgSeq());
			hspXtzlInfCustom.setModUser(activeUser.getUsrno());
			//病情评估
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getXtSubCod(),"BQPG");
			String proVal = "";
			//到场方式
			if("5".equals(hspemginfCustom.getArvChlCod()) ||"6".equals(hspemginfCustom.getArvChlCod())){
				proVal = hspemginfCustom.getArvChlCod();
			}else{
				proVal = "1";
			}
			
			mergeHspXtzlInfCustom(hspXtzlInfCustom,proVal,"DDFS");
			
			
			//患者姓名
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getCstNam(),"HZXM");
			//患者性别
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getCstSexCod(),"XINGB");
			//患者年龄
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getCstAge(),"NIANL");
			//患者电话
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getPheNbr(),"LXDH");
			//身份证号
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getIdNbr(),"ZJHM");
			//门诊号
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getEmgSeq(),"MENZH");
			//分诊时间
			mergeHspXtzlInfCustom(hspXtzlInfCustom,DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(),"yyyy-MM-dd HH:mm:ss") ,"FZSJ");
			//预检时间|到达我院时间
			if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgDat())){
				mergeHspXtzlInfCustom(hspXtzlInfCustom,DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy-MM-dd HH:mm:ss"),"020003");
				mergeHspXtzlInfCustom(hspXtzlInfCustom,DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy-MM-dd HH:mm:ss"),"FZSJ");
			}else{
				mergeHspXtzlInfCustom(hspXtzlInfCustom,null,"020003");
				mergeHspXtzlInfCustom(hspXtzlInfCustom,null,"FZSJ");
			}
			//意识
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getSenRctCod(),"YISHI");
			//心率
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getHrtRte()+"","XINL");
			//脉搏
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getHrtRte()+"","MAIB");
			//呼吸
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getBreNbr()+"","020009");
			//血压上压
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getSbpUpNbr()+"","020010");
			//血压下压
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getSbpDownNbr()+"","020011");
		}
		
		return hspsqlinfCustom;
	}
	*/
	
	
	private void mergeHspXtzlInfCustom(HspXtzlInfCustom hspXtzlInfCustom,String proVal,String proCode){
		hspXtzlInfCustom.setProVal(proVal);
		hspXtzlInfCustom.setProCode(proCode);
		hspXtzlInfCustomMapper.mergeHspXtzlInf(hspXtzlInfCustom);
	}
	
	/*
	@Override
	public HspsqlinfCustom submitQjsPrecheck(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		
		HspsqlinfCustom hspsqlinfCustom = zyyHspemginfService.submitQjsPrecheck(hspemginfQueryDto, activeUser);
		
		// 8.湖州第一人民医院胸痛部分需求|胸痛病情评估插入hspxtzlinf,如果是胸痛患者，需要插入。
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
		
		if("1".equals(hspemginfQueryDto.getHspemginfCustom().getXtFlg())){
			
			//	胸痛病情评估
			HspXtzlInfCustom hspXtzlInfCustom = new HspXtzlInfCustom();
			hspXtzlInfCustom.setCrtUser(activeUser.getUsrno());
			hspXtzlInfCustom.setEmgNo(hspemginfCustom.getEmgSeq());
			hspXtzlInfCustom.setModUser(activeUser.getUsrno());
			//  病情评估
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getXtCod(),ProCode.BQPG);
		    //  病情评估明细
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getXtSubCod(),ProCode.BQPGMX);
			
			
			String proVal = "";
			// 到场方式
			if("5".equals(hspemginfCustom.getArvChlCod())||"6".equals(hspemginfCustom.getArvChlCod())){
				proVal = hspemginfCustom.getArvChlCod();
			}else{
				proVal = "1";
			}
			mergeHspXtzlInfCustom(hspXtzlInfCustom,proVal,"DDFS");
			//患者姓名
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getCstNam(),ProCode.HZXM);
			//患者性别
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getCstSexCod(),ProCode.XINGB);
			//患者年龄
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getCstAge(),ProCode.NIANL);
			//患者电话
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getPheNbr(),ProCode.LXDH);
			//身份证号
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getIdNbr(),ProCode.ZJHM);
			//门诊号
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getEmgSeq(),"MENZH");
			//分诊时间
			mergeHspXtzlInfCustom(hspXtzlInfCustom,DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(),"yyyy-MM-dd HH:mm:ss") ,"010003");
			//预检时间|到达我院时间
			if(StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getEmgDat())){
				mergeHspXtzlInfCustom(hspXtzlInfCustom,DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy-MM-dd HH:mm:ss"),"020003");
				mergeHspXtzlInfCustom(hspXtzlInfCustom,DateUtil.formatDateByFormat(hspemginfCustom.getEmgDat(), "yyyy-MM-dd HH:mm:ss"),"FZSJ");
			}else{
				mergeHspXtzlInfCustom(hspXtzlInfCustom,null,"020003");
				mergeHspXtzlInfCustom(hspXtzlInfCustom,null,"FZSJ");
			}
			//意识
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getSenRctCod(),"YISHI");
			//心率
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getHrtRte()+"","XINL");
			//脉搏
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getHrtRte()+"","MAIB");
			//呼吸
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getBreNbr()+"","020009");
			//血压上压
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getSbpUpNbr()+"","020010");
			//血压下压
			mergeHspXtzlInfCustom(hspXtzlInfCustom,hspemginfCustom.getSbpDownNbr()+"","020011");
		}
		
		return hspsqlinfCustom;
	}
	*/

	@Override
	public String updateHspemginf_hzzyy(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.updateHspemginf_hzzyy(hspemginfQueryDto, activeUser);
	}

	@Override
	public List<HspemginfCustom> findHspemginfQjsList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfQjsList(hspemginfQueryDto);
	}

	@Override
	public void submitCheckRecord(HspemginfCustom hspemginfCustom, String userFlg) throws Exception {
		// TODO Auto-generated method stub
		zyyHspemginfService.submitCheckRecord(hspemginfCustom, userFlg);
	}

	@Override
	public void submitCheckCase(HspCheckCaseInfCustom hspCheckCaseInfCustom, ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		zyyHspemginfService.submitCheckCase(hspCheckCaseInfCustom, activeUser);
	}

	@Override
	public List<HspemginfCustom> findAMRecordList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findAMRecordList(hspemginfQueryDto);
	}

	@Override
	public int findAMRecordListCount(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findAMRecordListCount(hspemginfQueryDto);
	}

	@Override
	public HspCheckCaseInfCustom getCheckCase(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.getCheckCase(emgSeq);
	}

	@Override
	public List<HspScoCustom> findHspScoListBySzm(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspScoListBySzm(hspemginfQueryDto);
	}

	@Override
	public List<HspemginfCustom> findEmgInfByCad(Map<String, Object> map) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findEmgInfByCad(map);
	}

	@Override
	public List<HspemginfCustom> findEmgInfByMpi(String vstCad) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findEmgInfByMpi(vstCad);
	}

	@Override
	public List<THemsSjz> getSjzDataByEmgSeq(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.getSjzDataByEmgSeq(emgSeq);
	}

	@Override
	public void updateEmgInfMylrByEmgSeq(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		zyyHspemginfService.updateEmgInfMylrByEmgSeq(hspemginfQueryDto);
	}

	@Override
	public HspemginfCustom getGrnChlCount(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.getGrnChlCount(hspemginfQueryDto);
	}

	@Override
	public HspemginfCustom getLqAndNotLqCount(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.getLqAndNotLqCount(hspemginfQueryDto);
	}

	@Override
	public List<HspemginfCustom> findEmgInfForRange_result(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findEmgInfForRange_result(hspemginfQueryDto);
	}

	@Override
	public int findEmgInfForRangeCount(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findEmgInfForRangeCount(hspemginfQueryDto);
	}

	@Override
	public HspemginfCustom findHspemginfByGhid(String ghid) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfByGhid(ghid);
	}

	@Override
	public int leftWrapCount(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.leftWrapCount(hspemginfQueryDto);
	}

	@Override
	public List<HspemginfCustom> leftWrapList(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.leftWrapList(hspemginfQueryDto);
	}

	@Override
	public HspemginfCustom findEmgInfByEmgSeq(String emgSeq) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findEmgInfByEmgSeq(emgSeq);
	}

	@Override
	public HspsqlinfCustom insertHspemginf_qjs_ecyj(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.insertHspemginf_qjs_ecyj(hspemginfQueryDto, activeUser);
	}

	@Override
	public HspemginfCustom findHspemginfCustom(String emgSeq, String printType, Date startdate, Date enddate)
			throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findHspemginfCustom(emgSeq, printType, startdate, enddate);
	}

	@Override
	public List<HspemginfCustom> findAbnDriverList(String name) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findAbnDriverList(name);
	}

	@Override
	public List<HspemginfCustom> toBeImprovedList(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.toBeImprovedList(hspemginfQueryDto);
	}

	@Override
	public void addZyyemgSubmit_zfk(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		zyyHspemginfService.addZyyemgSubmit_zfk(hspemginfQueryDto, activeUser);
	}

	@Override
	public HspemginfCustom getEmgInfByMpiAndJzxh(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.getEmgInfByMpiAndJzxh(hspemginfQueryDto);
	}

	@Override
	public void addFrRegisterSubmit(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) {
		// TODO Auto-generated method stub
		zyyHspemginfService.addFrRegisterSubmit(hspemginfQueryDto, activeUser);
	}

	@Override
	public HspFrbrInf findFrRegisterByEmgSeq(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.findFrRegisterByEmgSeq(emgSeq);
	}

	@Override
	public void updateChechRecord(String emgSeq, ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		zyyHspemginfService.updateChechRecord(emgSeq, activeUser);
	}

	@Override
	public String emgCheck(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
		// TODO Auto-generated method stub
		return zyyHspemginfService.emgCheck(hspemginfQueryDto, activeUser);
	}

	@Override
	public void updateLabelPrinting(String emgSeq) throws Exception {
		// TODO Auto-generated method stub
		zyyHspemginfService.updateLabelPrinting(emgSeq);
		
	}

	@Override
	public List<HspemginfCustom> getEmgInfByXm(HspemginfQueryDto hspemginfQueryDto) {
		// TODO Auto-generated method stub
		return zyyHspemginfService.getEmgInfByXm(hspemginfQueryDto);
	}

	@Override
	public int checkXtCzlcAjax(String emgSeq, String type) {
		return zyyHspemginfService.checkXtCzlcAjax(emgSeq, type);
	}

	

}
