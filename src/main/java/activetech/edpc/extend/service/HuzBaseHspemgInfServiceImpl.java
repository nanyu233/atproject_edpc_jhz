package activetech.edpc.extend.service;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.aid.dao.mapper.AidFlowstepCustomMapper;
import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.base.pojo.dto.ActiveUser;
import activetech.basehems.service.BaseHspemgInfService;
import activetech.edpc.dao.mapper.HspFlowChartInfMapperCustom;
import activetech.edpc.service.ExternalDataService;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.zyyhospital.pojo.domain.HspBedInf;

public class HuzBaseHspemgInfServiceImpl extends DecoratorBaseHspemgInfService{
	
	@Autowired
	private AidFlowstepCustomMapper aidFlowstepCustomMapper;
	
	@Autowired
	private AidPatientMapper aidPatientMapper;
	
	@Autowired
	private HspFlowChartInfMapperCustom hspFlowChartInfMapperCustom;
	
	@Autowired
	private ExternalDataService externalDataService;
	

	public HuzBaseHspemgInfServiceImpl(BaseHspemgInfService baseHspemgInfService) {
		this.baseHspemgInfService = baseHspemgInfService;
	}

	@Override
	public HspsqlinfCustom insertBaseHspemginf(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception {
				
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();

		// 如果是胸痛患者，hsp_xtzl_inf 插入基础数据
		/*
		if("1".equals(hspemginfCustom.getXtFlg())){
			
			List<HspXtzlInfCustom> list = new ArrayList<>();
			
			HspXtzlInfCustom hspXtzlInf1 = new HspXtzlInfCustom();
			// 000001 -- >HZXM    患者姓名
			hspXtzlInf1.setProCode(ProCode.HZXM);
			hspXtzlInf1.setProVal(hspemginfCustom.getCstNam());
			list.add(hspXtzlInf1);

			HspXtzlInfCustom hspXtzlInf2 = new HspXtzlInfCustom();
			// 000002 -- >XINGB    性别
			hspXtzlInf2.setProCode(ProCode.XINGB);
			hspXtzlInf2.setProVal(hspemginfCustom.getCstSexCod());
			list.add(hspXtzlInf2);
			
			HspXtzlInfCustom hspXtzlInf3 = new HspXtzlInfCustom();
			// 000003 -- >NIANL    年龄
			hspXtzlInf3.setProCode(ProCode.NIANL);
			hspXtzlInf3.setProVal(hspemginfCustom.getCstAge());
			list.add(hspXtzlInf3);
		    
			
			HspXtzlInfCustom hspXtzlInf4 = new HspXtzlInfCustom();
			// 000004 -- >LXDH    联系电话
			hspXtzlInf4.setProCode(ProCode.LXDH);
			hspXtzlInf4.setProVal(hspemginfCustom.getPheNbr());
			list.add(hspXtzlInf4);
			
			HspXtzlInfCustom hspXtzlInf5 = new HspXtzlInfCustom();
			// 000005 -- >ZJHM    证件号码
			hspXtzlInf5.setProCode(ProCode.ZJHM);
			hspXtzlInf5.setProVal(hspemginfCustom.getIdNbr());
			list.add(hspXtzlInf5);
			
			HspXtzlInfCustom hspXtzlInf6 = new HspXtzlInfCustom();
			//  -- >DDFS    到达方式
			hspXtzlInf6.setProCode(ProCode.DDFS);
			hspXtzlInf6.setProVal(hspemginfCustom.getArvChlCod());
			list.add(hspXtzlInf6);
		    
		    externalDataService.mergeFzInf(list, hspemginfCustom.getEmgSeq(), activeUser.getUsrno());
		    
		}
		*/
		
		//新增卒中评分表
		/*
		HspFastInfCustom hspFastInfCustom = hspemginfQueryDto.getHspFastInfCustom();
				
		hspemginfCustom.setCzlcflg(hspFastInfCustom.getCzFlag());
		
		if("1".equals(hspFastInfCustom.getCzFlag())){
			StringBuilder czCod = new StringBuilder();
			czCod.append(hspFastInfCustom.getMtCod()!=null?"1":"0");
			czCod.append(",");
			czCod.append(hspFastInfCustom.getSzthCod()!=null?"1":"0");
			czCod.append(",");
			czCod.append(hspFastInfCustom.getWlCod()!=null?"1":"0");
			hspemginfCustom.setCzlcflg(czCod.toString());
			
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
		*/
		HspsqlinfCustom hspsqlinfCustom = baseHspemgInfService.insertBaseHspemginf(hspemginfQueryDto, activeUser);
		
		//流水表插入
		//先声明插入的对象
		/*
		AidFlowstep record = new AidFlowstep();
		record.setEmgSeq(hspemginfCustom.getEmgSeq());
		record.setPatid(hspemginfCustom.getPatid()!=null?hspemginfCustom.getPatid():"#");
		record.setFlowentry("2");
		record.setModflag("0");
		record.setFlowtime(hspemginfCustom.getEmgDat());
		record.setCrtuserid(activeUser.getUsrno());
		if("1".equals(hspemginfCustom.getCspgFlg())){
			record.setSteptype("2");
			record.setStepseq("CS2002");
		}else if("1".equals(hspemginfCustom.getXtFlg())){
			record.setSteptype("1");
			record.setStepseq("XT2002");
		}else if("1".equals(hspemginfCustom.getCzlcflg())){
			record.setSteptype("0");
			record.setStepseq("CZ2002");
		}else{
			record.setSteptype("9");
			record.setStepseq("QT2002");
		}
		aidFlowstepCustomMapper.insertAtRegister(record);
		*/

		
		// 9.院前信息记录初始化
		/*
		AidPatient aidPatient = new AidPatient();
		aidPatient.setPatid(hspemginfQueryDto.getHspemginfCustom().getPatid());
		aidPatient.setOcrflag("0");
		if("1".equals(hspemginfCustom.getXtFlg())){
			aidPatient.setPattype("1");
		}else if("1".equals(hspemginfCustom.getCzlcflg())){
			aidPatient.setPattype("0");
		}else if("1".equals(hspemginfCustom.getCspgFlg())){
			aidPatient.setPattype("2");
		}else{
			aidPatient.setPattype("9");
		}
		aidPatient.setPatname(hspemginfCustom.getCstNam());
		aidPatient.setPatsex(hspemginfCustom.getCstSexCod());
		aidPatient.setPatage(hspemginfCustom.getCstAge());
		aidPatient.setAgecode(hspemginfCustom.getCstAgeCod());
		aidPatient.setMewslvl(hspemginfCustom.getEmgDepCod());
		aidPatient.setIsbind("1");
		aidPatient.setCrtuserid(activeUser.getUsrno());
		aidPatient.setCrttime(new Date());
		try {
			aidPatientMapper.insertSelective(aidPatient);
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		return hspsqlinfCustom;
	}

	@Override
	public void insertHspsqlinfCus(HspsqlinfCustom hspsqlinfCustom) throws Exception {
		// TODO Auto-generated method stub
		baseHspemgInfService.insertHspsqlinfCus(hspsqlinfCustom);
	}

	@Override
	public void updateHspsqlinf(HspsqlinfCustom hspsqlinfCustomZG) {
		// TODO Auto-generated method stub
		baseHspemgInfService.updateHspsqlinf(hspsqlinfCustomZG);
	}

	@Override
	public void insertEmgHis(HspEmgInf hspemginf_del, String emgSeq, ActiveUser activeUser, String opertype,
			String opermemo) {
		// TODO Auto-generated method stub
		baseHspemgInfService.insertEmgHis(hspemginf_del, emgSeq, activeUser, opertype, opermemo);
	}

	@Override
	public HspemginfCustom findHspemginfCustom(String emgSeq) {
		// TODO Auto-generated method stub
		return baseHspemgInfService.findHspemginfCustom(emgSeq);
	}

	@Override
	public HspEmgInf getHspemginfByEmgseq(String emgSeq) {
		// TODO Auto-generated method stub
		return baseHspemgInfService.getHspemginfByEmgseq(emgSeq);
	}

	@Override
	public void updateBaseHspemginf(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception {
		baseHspemgInfService.updateBaseHspemginf(hspemginfQueryDto, activeUser);
	}

	@Override
	public void clearAndreBindBed(String emgSeq, String Bedid) {
		baseHspemgInfService.clearAndreBindBed(emgSeq, Bedid);	
	}

	@Override
	public void clearBed(HspemginfCustom hspemginfCustom) {
		baseHspemgInfService.clearBed(hspemginfCustom);		
	}

	@Override
	public HspBedInf getHspBedInfByBedid(String bedId) {
		return baseHspemgInfService.getHspBedInfByBedid(bedId);
	}

}
