package activetech.basehis.service.impl;

import activetech.base.dao.mapper.DstcompctlMapper;
import activetech.base.pojo.domain.Dstcompctl;
import activetech.base.pojo.domain.DstcompctlExample;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehis.dao.mapper.*;
import activetech.basehis.pojo.domain.VHemsEmpi;
import activetech.basehis.pojo.domain.VHemsJyjg;
import activetech.basehis.pojo.domain.VHemsRcz;
import activetech.basehis.pojo.dto.*;
import activetech.basehis.service.OracleHisService;
import activetech.external.dao.mapper.VHemsJcjgMapperCustom;
import activetech.external.dao.mapper.VHemsJyjgMapper;
import activetech.external.dao.mapper.VHemsJyjgMapperCustom;
import activetech.external.pojo.dto.VHemsJcjgCustom;
import activetech.external.pojo.dto.VHemsJyjgCustom;
import activetech.external.pojo.dto.VHemsJyjgQueryDto;
import activetech.hl7.base.HL7Util;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspJbzdInfMapper;
import activetech.hospital.dao.mapper.HspSqlInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspJbzdInfExample;
import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.domain.HspSqlInfExample;
import activetech.hospital.pojo.dto.HspJbzdInfCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.netty.client.NettyClient;
import activetech.netty.util.MethodInvokeMeta;
import activetech.pda.pojo.domain.HspCfxxInfo;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.ZyyHspemginfCustomMapper;
import ca.uhn.hl7v2.model.v26.message.ACK;
import ca.uhn.hl7v2.model.v26.message.ADT_A01;
import ca.uhn.hl7v2.model.v26.segment.DG1;
import ca.uhn.hl7v2.model.v26.segment.EVN;
import ca.uhn.hl7v2.model.v26.segment.MSH;
import ca.uhn.hl7v2.util.Terser;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;


public class OracleHisServiceImpl implements OracleHisService {
	
	private static Logger logger = Logger.getLogger(OracleHisServiceImpl.class); 

	@Autowired
	private VHemsGhlbMapper vHemsGhlbMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private VHemsRczMapper vHemsRczMapper;
	@Autowired
	private HspEmgInfMapper hspemginfMapper;
	@Autowired
	private HspJbzdInfMapper hspJbzdInfMapper;
	@Autowired
	private HspSqlInfMapper hspSqlInfMapper;
	@Autowired
	private ZyyHspemginfCustomMapper zyyHspemginfCustomMapper;
	@Autowired
	private VHemsJyjgMapperSi vHemsJyjgMapperSi;
	@Autowired
	private VHemsJyjgMapper vHemsJyjgMapper;
	@Autowired
	private VHemsJcjgMapperCustom vHemsJcjgMapperCustom;
	@Autowired
	private YZMapper yzMapper;
	@Autowired
	private VHemsEmpiMapper vHemsEmpiMapper;

	/**
	 * @param	vHemsGhlbQueryDto
	 * @return	已挂号患者列表总记录数 
	 * @throws	Exception
	 */
	@Override
	public int getRegisteredCount(VHemsGhlbQueryDto vHemsGhlbQueryDto) throws Exception {
		return vHemsGhlbMapper.getRegisteredCount(vHemsGhlbQueryDto);
	}

	/**
	 * @param	vHemsGhlbQueryDto
	 * @return	已挂号患者列表
	 * @throws	Exception
	 */
	@Override
	public List<VHemsGhlbCustom> getRegisteredList(VHemsGhlbQueryDto vHemsGhlbQueryDto) throws Exception {
		return vHemsGhlbMapper.getRegisteredList(vHemsGhlbQueryDto);
	}
	
	

	@Override
	public void updateRczGhxxBd(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		HspemginfCustom hspemginfCustom = hspemginfQueryDto.getHspemginfCustom();
		VHemsRcz vHemsRczReg = vHemsRczMapper.selectRczById(hspemginfQueryDto.getRczId());
		vHemsRczReg.setEmgSeq(hspemginfCustom.getEmgSeq());
		vHemsRczMapper.updateEmgSeq(vHemsRczReg);
		VHemsRcz vHemsRczAdt = vHemsRczMapper.selectRczByJzxh("ADT",hspemginfCustom.getMpi(),hspemginfCustom.getJzxh());
		HspEmgInf hspEmgInf = new HspEmgInf();
		hspEmgInf.setEmgSeq(hspemginfCustom.getEmgSeq());
		hspEmgInf.setAdtA01(vHemsRczReg.getAdtA01());
		hspEmgInf.setEmgDat(vHemsRczReg.getGhsj());
		if(vHemsRczAdt != null){
			ADT_A01 adt_A01Adt = HL7Util.hl7Text2Msg(vHemsRczAdt.getAdtA01(), ADT_A01.class);
			hspEmgInf.setDocDat(adt_A01Adt.getEVN().getEvn2_RecordedDateTime().getValueAsDate());
			hspEmgInf.setJzys(adt_A01Adt.getPV1().getPv17_AttendingDoctor(0).getXcn1_IDNumber().getValue());
			hspEmgInf.setYsxm(adt_A01Adt.getPV1().getPv17_AttendingDoctor(0).getXcn2_FamilyName().getFn1_Surname().getValue());
			hspEmgInf.setKsdm(adt_A01Adt.getPV1().getPv13_AssignedPatientLocation().getPl2_Room().getValue());
			hspEmgInf.setSqlDctNbr(adt_A01Adt.getPV1().getPv17_AttendingDoctor(0).getXcn2_FamilyName().getFn1_Surname().getValue());
			vHemsRczAdt.setEmgSeq(hspemginfCustom.getEmgSeq());
			vHemsRczMapper.updateEmgSeq(vHemsRczAdt);
		}
		VHemsRcz vHemsRczDg = vHemsRczMapper.selectRczByJzxh("DG",hspemginfCustom.getMpi(),hspemginfCustom.getJzxh());
		if(vHemsRczDg != null){
			ADT_A01 adt_A01Dg = HL7Util.hl7Text2Msg(vHemsRczDg.getAdtA01(), ADT_A01.class);
			List<HspJbzdInfCustom> hspJbzdInfCustomList = new ArrayList<HspJbzdInfCustom>();
			List<DG1> dg1List = adt_A01Dg.getDG1All();
			for (DG1 dg1 : dg1List) {
				if("3".equals(dg1.getDg121_DiagnosisActionCode().getValue())){
					continue;
				}
				HspJbzdInfCustom hspJbzdInfCustom = new HspJbzdInfCustom();
				hspJbzdInfCustom.setEmgSeq(hspemginfCustom.getEmgSeq());
				hspJbzdInfCustom.setIcd10(dg1.getDg13_DiagnosisCodeDG1().getCwe1_Identifier().getValue());
				hspJbzdInfCustom.setJbzdComm(dg1.getDg13_DiagnosisCodeDG1().getCwe2_Text().getValue());
				hspJbzdInfCustom.setHzzdDat(dg1.getDg15_DiagnosisDateTime().getValueAsDate());
				hspJbzdInfCustom.setHzzdNurNbr(adt_A01Dg.getEVN().getEvn5_OperatorID(0).getXcn2_FamilyName().getFn1_Surname().getValue());
				hspJbzdInfCustom.setShowOrder(dg1.getDg11_SetIDDG1().getValue());
				if("1".equals(dg1.getDg115_DiagnosisPriority().getValue())){
					hspJbzdInfCustom.setJbzdStatus("0");
				}else{
					hspJbzdInfCustom.setJbzdStatus("1");
				}
				hspJbzdInfCustomList.add(hspJbzdInfCustom);
			}
			
			if(StringUtils.isNotNullAndZero(hspJbzdInfCustomList)){
				HspJbzdInfCustom hspJbzdInfCustom=hspJbzdInfCustomList.get(hspJbzdInfCustomList.size()-1);
				//删除原有诊断数据
				delJbzd(hspJbzdInfCustom.getEmgSeq());
				//新增诊断数据，返回诊断拼接字符串
				String jbzdDes=addJbzdList(hspJbzdInfCustomList,hspJbzdInfCustom).toString();
				//更新主表jbzdDes
				hspEmgInf.setJbzdDes(jbzdDes);
				hspEmgInf.setCyzdXy(jbzdDes);
				hspEmgInf.setDeathDiagnosis(jbzdDes);
			}
			vHemsRczDg.setEmgSeq(hspemginfCustom.getEmgSeq());
			vHemsRczMapper.updateEmgSeq(vHemsRczDg);
		}else{
			//删除原有诊断数据
			delJbzd(hspemginfCustom.getEmgSeq());
		}
		VHemsRcz vHemsRczWhe = vHemsRczMapper.selectRczByJzxh("WHE",hspemginfCustom.getMpi(),hspemginfCustom.getJzxh());
		if(vHemsRczWhe != null){
			ADT_A01 adt_A01Whe = HL7Util.hl7Text2Msg(vHemsRczWhe.getAdtA01(), ADT_A01.class);
			if("5".equals(hspemginfCustom.getCstDspCod())){
				Terser terser = new Terser(adt_A01Whe);
				Date regdat=new Date();
				String dateStr = DateUtil.formatDateByFormat(regdat, "yyyyMMdd");
				String seq=systemConfigService.findSequences("HSPSQLINF_SQLSEQ","8",dateStr);
		    	HspSqlInf hspSqlInf = new HspSqlInf();
		    	hspSqlInf.setEmgSeq(hspemginfCustom.getEmgSeq());
		    	hspSqlInf.setSqlSeq(seq);
		    	hspSqlInf.setSqlDat(DateUtil.parseDate(terser.get("/ZPV-5"), "yyyyMMddHHmmss"));
		    	hspSqlInf.setRegDat(regdat);
		    	if("1".equals(terser.get("/ZPV-4"))){
		    		hspSqlInf.setSqlStaCod("4");
		    	}else{
		    		hspSqlInf.setSqlStaCod(terser.get("/ZPV-4"));
		    	}
		    	hspSqlInf.setSqlDctNbr("AUTO");
		    	hspSqlInf.setSqlDctNam("AUTO");
		    	hspSqlInf.setSqlNurNbr("AUTO");
		    	hspSqlInf.setSqlNurNam("AUTO");
		    	hspEmgInf.setSqlSeq(seq);
		    	hspSqlInfMapper.insertSelective(hspSqlInf);
			}
			vHemsRczWhe.setEmgSeq(hspemginfCustom.getEmgSeq());
			vHemsRczMapper.updateEmgSeq(vHemsRczWhe);
		}else{
			HspSqlInfExample example = new HspSqlInfExample();
			HspSqlInfExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqEqualTo(hspemginfCustom.getEmgSeq());
			criteria.andSqlNurNbrEqualTo("AUTO");
			List<HspSqlInf> hspSqlInfList = hspSqlInfMapper.selectByExample(example);
			if(StringUtils.isNotNullAndZero(hspSqlInfList)){
				for (HspSqlInf hspSqlInf : hspSqlInfList) {
					hspSqlInf.setEmgSeq(hspSqlInf.getEmgSeq()+"AUTO");
					hspSqlInfMapper.updateByPrimaryKeySelective(hspSqlInf);
				}
			}
		}
		VHemsRcz vHemsRczCal = vHemsRczMapper.selectRczByJzxh("CAL",hspemginfCustom.getMpi(),hspemginfCustom.getJzxh());
		if(vHemsRczCal != null){
			hspEmgInf.setGhbz("2");
		}else{
			hspEmgInf.setGhbz("1");
		}
		if(hspemginfCustom.getJzxhOld() != null){
			VHemsRcz vHemsRczRegOld = vHemsRczMapper.selectRczByJzxh("REG",hspemginfCustom.getMpi(),hspemginfCustom.getJzxhOld());
			vHemsRczRegOld.setEmgSeq(null);
//			sendLgxx("2", hspemginfCustom.getMpi(), hspemginfCustom.getJzxhOld());
			vHemsRczMapper.updateEmgSeq(vHemsRczRegOld);
		}
		
		hspemginfMapper.updateByPrimaryKeySelective(hspEmgInf);
//		if("6".equals(hspemginfCustom.getCstDspCod()) && hspemginfCustom.getJzxhOld() != null){
//			sendLgxx("2", hspemginfCustom.getMpi(), hspemginfCustom.getJzxhOld());
//			sendLgxx("1", hspemginfCustom.getMpi(), hspemginfCustom.getJzxh());
//		}
	}

	
	private void delJbzd(String emgSeq) throws Exception {
		if(StringUtils.isNotNullAndEmptyByTrim(emgSeq)){
			HspJbzdInfExample hspJbzdInfExample=new HspJbzdInfExample();
			HspJbzdInfExample.Criteria criteria=hspJbzdInfExample.createCriteria();
			List<String> values = new ArrayList<String>();
			values.add("1");
			values.add("4");
			values.add("5");
			values.add("13");
			criteria.andEmgSeqEqualTo(emgSeq);
			criteria.andJbzdTypeIn(values);
			hspJbzdInfMapper.deleteByExample(hspJbzdInfExample);
		}
	}
	
	private StringBuilder addJbzdList(List<HspJbzdInfCustom> list,HspJbzdInfCustom hspJbzdInfCustom) throws Exception {
		StringBuilder jbzdDes=new StringBuilder();
		//诊断排序用
		if(list!=null && list.size()>0){
			for (int i=0;i<list.size();i++) {
				HspJbzdInfCustom hspJbzdInfCustom2=list.get(i);
				jbzdDes.append(hspJbzdInfCustom2.getJbzdComm()!=null?hspJbzdInfCustom2.getJbzdComm()+"；":"");
				hspJbzdInfCustom2.setJbzdSeq(UUIDBuild.getUUID());
				hspJbzdInfCustom2.setJbzdType("1");
				hspJbzdInfMapper.insert(hspJbzdInfCustom2);
			}
			for (int i=0;i<list.size();i++) {
				HspJbzdInfCustom hspJbzdInfCustom2=list.get(i);
				hspJbzdInfCustom2.setJbzdSeq(UUIDBuild.getUUID());
				hspJbzdInfCustom2.setJbzdType("4");
				hspJbzdInfMapper.insert(hspJbzdInfCustom2);
			}
			for (int i=0;i<list.size();i++) {
				HspJbzdInfCustom hspJbzdInfCustom2=list.get(i);
				hspJbzdInfCustom2.setJbzdSeq(UUIDBuild.getUUID());
				hspJbzdInfCustom2.setJbzdType("5");
				hspJbzdInfMapper.insert(hspJbzdInfCustom2);
			}
			for (int i=0;i<list.size();i++) {
				HspJbzdInfCustom hspJbzdInfCustom2=list.get(i);
				hspJbzdInfCustom2.setJbzdSeq(UUIDBuild.getUUID());
				hspJbzdInfCustom2.setJbzdType("13");
				hspJbzdInfMapper.insert(hspJbzdInfCustom2);
			}
		}
		return jbzdDes;
	}

	@Override
	public void updateCleanRcz(String emgSeq,String mpi, Long jzxh) throws Exception {
//		sendLgxx("2", mpi, jzxh);
		vHemsRczMapper.updateCleanRcz(emgSeq,mpi,jzxh);
	}

	@Override
	public List<VHemsRczCustom> findRczGhxx(HemshisDto hemshisDto) {
		return vHemsRczMapper.findRczGhxx(hemshisDto);
	}

	@Override
	public int findRczGhxxCount(HemshisDto hemshisDto) {
		return vHemsRczMapper.findRczGhxxCount(hemshisDto);
	}

	@Override
	public void sendDjhc(HspemginfQueryDto hspemginfQueryDto) throws Exception {
		HspemginfCustom hspemginfCustom = zyyHspemginfCustomMapper.selectEmgByGhsj(hspemginfQueryDto.getHspemginfCustom().getEmgSeq());
		if(!StringUtils.isNotNullAndEmptyByTrim(hspemginfCustom.getAdtA01())){
			return;
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ADT_A01 adt_A01 = HL7Util.hl7Text2Msg(hspemginfCustom.getAdtA01(), ADT_A01.class);
		Terser terser = new Terser(adt_A01);
		terser.set("/PID-3",null);
		terser.set("/PID-3-5",null);
		terser.set("/PID-3-10",null);
		terser.set("/PID-3",null);
		terser.set("/PV1-3-2",null);
		terser.set("/PV1-3-10",null);
		terser.set("/PV1-3-10-2",null);
		terser.set("/PV1-5",null);
		terser.set("/PV1-10",null);
		terser.set("/PV1-14",null);
		terser.set("/PV1-16",null);
		terser.set("/PV1-21",null);
		terser.set("/PV1-50",null);
		terser.set("/PV1-51",null);
		MSH msh = adt_A01.getMSH();
		HL7Util.getMsh(msh, "ESB", "ADT", "A01", "ADT_A01");
		EVN evn = adt_A01.getEVN();
        evn.getEvn1_EventTypeCode().setValue("FZDJ");
        evn.getEvn2_RecordedDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        evn.getEvn5_OperatorID(0).getXcn1_IDNumber().setValue(hspemginfCustom.getPreUsrNbr());
        evn.getEvn5_OperatorID(0).getXcn2_FamilyName().getFn1_Surname().setValue(hspemginfCustom.getPreUsrNam());
		DG1 dg1 = adt_A01.getDG1();
        dg1.getDg11_SetIDDG1().setValue("1");
        dg1.getDg13_DiagnosisCodeDG1().getCwe1_Identifier().setValue("SN");
        dg1.getDg15_DiagnosisDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        dg1.getDg16_DiagnosisType().setValue(Integer.parseInt(hspemginfCustom.getEmgDepCod()) + 1+"");
        dg1.getDg17_MajorDiagnosticCategory().getCne1_Identifier().setValue(hspemginfCustom.getEmgFkCod()); //分诊科室
        dg1.getDg18_DiagnosticRelatedGroup().getCne1_Identifier().setValue(hspemginfCustom.getArvChlCod()); //加字段前端提交
        if(hspemginfCustom.getTmpNbr() != null){
        	dg1.getDg19_DRGApprovalIndicator().setValue(hspemginfCustom.getTmpNbr()+"");
        }
        if(hspemginfCustom.getHrtRte() != null){
        	dg1.getDg110_DRGGrouperReviewCode().setValue(hspemginfCustom.getHrtRte()+"");
        }
        if(hspemginfCustom.getBreNbr() != null){
        	dg1.getDg111_OutlierType().getCwe1_Identifier().setValue(hspemginfCustom.getBreNbr()+"");
        }
        String sbp = "";
        if(hspemginfCustom.getSbpUpNbr() != null){
        	sbp = hspemginfCustom.getSbpUpNbr().toString();
        }
        if(hspemginfCustom.getSbpDownNbr() != null){
        	sbp += "."+hspemginfCustom.getSbpDownNbr();
        }
        dg1.getDg112_OutlierDays().setValue(sbp);
        if(hspemginfCustom.getOxyNbr() != null){
        	dg1.getDg113_OutlierCost().getCp1_Price().getMo1_Quantity().setValue(hspemginfCustom.getOxyNbr()+"");
        }
        dg1.getDg115_DiagnosisPriority().setValue(hspemginfCustom.getGlsNum()); //预检时无血糖
        dg1.getDg116_DiagnosingClinician(0).getXcn1_IDNumber().setValue(hspemginfCustom.getNrsSco());
        dg1.getDg117_DiagnosisClassification().setValue(hspemginfCustom.getSenRctCod()); //是否是清醒程度
        if(hspemginfCustom.getCramsTotSco() != null){
        	dg1.getDg118_ConfidentialIndicator().setValue(hspemginfCustom.getCramsTotSco()+""); //
        }
        dg1.getDg119_AttestationDateTime().setValue(sdf.format(hspemginfCustom.getEmgDat()));
        dg1.getDg120_DiagnosisIdentifier().getEi1_EntityIdentifier().setValue(hspemginfCustom.getPreUsrNbr());
        dg1.getDg121_DiagnosisActionCode().setValue(hspemginfCustom.getPreUsrNam());
        NettyClient client = new NettyClient("ensemble.zjyy.com", 10019);
      	//  NettyClient client = new NettyClient("192.16.2.141", 10003);
		MethodInvokeMeta cmd = new MethodInvokeMeta();
		logger.info("传参："+adt_A01.toString());
        cmd.setArgs(new Object[] {adt_A01});
        Object reVal = client.remoteCall(cmd, 0);
        logger.info("等级回传返回参数："+reVal);
        ACK ack = HL7Util.hl7Text2Msg(reVal.toString(), ACK.class);
        if(!"AA".equals(ack.getMSA().getMsa1_AcknowledgmentCode().getValue())){
        	ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 920,new Object[] {"等级回传失败！"+ack.toString()}));
        }
	}



	@Override
	public List<VHemsJyjg> findRecentJyjg() {
		List<VHemsJyjg> list = vHemsJyjgMapperSi.findRecentJyjg();
		return list;
	}


	@Override
	public int findJyxxCount(VHemsJyjgQueryDto vHemsJyjgQueryDto)
			throws Exception {
		if (vHemsJyjgQueryDto.getvHemsJyjgCustom() != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJyjgCustom().getPatientId())) {
				return vHemsJyjgMapperSi.findJyxxCount(vHemsJyjgQueryDto);
			}
		}
		return 0;
	}
	@Override
	public List<VHemsJyjgCustom> findJyxx(
			VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
		List<VHemsJyjgCustom> list = new ArrayList<VHemsJyjgCustom>();
		if (vHemsJyjgQueryDto.getvHemsJyjgCustom() != null) {
			if (StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJyjgCustom().getPatientId())) {
				list = vHemsJyjgMapperSi.findJyxx(vHemsJyjgQueryDto);
			}
		}
		return list;
	}

	@Override
	public int findJyxxInfoCount(VHemsJyjgQueryDto vHemsJyjgQueryDto)
			throws Exception {

		return vHemsJyjgMapperSi.findJyxxInfoCount(vHemsJyjgQueryDto);
	}

	@Override
	public List<VHemsJyjgCustom> findJyxxInfo(
			VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
		return vHemsJyjgMapperSi.findJyxxInfo(vHemsJyjgQueryDto);
	}

	@Override
	public List<VHemsJcjgCustom> findJcjg(
			VHemsJyjgQueryDto vHemsJyjgQueryDto) throws Exception {
		List<VHemsJcjgCustom> list = new ArrayList<VHemsJcjgCustom>();
		if(vHemsJyjgQueryDto.getvHemsJcjgCustom() != null){
			if (StringUtils.isNotNullAndEmptyByTrim(vHemsJyjgQueryDto.getvHemsJcjgCustom().getZyh())) {
				list=vHemsJcjgMapperCustom.findVHemsJcjgList(vHemsJyjgQueryDto);
			}
		}
		return list;
	}
	/**
	 * 获取处方信息（视图+本地处方表+会诊申请单+知情同意书）
	 * @param hspCfxxInfoQueryDto
	 */
	@Override
	public List<HspCfxxInfoCustom> findCfxxLocalAndHISList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception{
		String HSPLP = systemConfigService.findAppoptionByOptkey("HSPLP").getOptvalue();
		hspCfxxInfoQueryDto.setHspLp(HSPLP);
		//本地处方表
		List<HspCfxxInfoCustom> cfxxList = yzMapper.findCfxxDataByLocalList(hspCfxxInfoQueryDto);
		//HIS视图
		List<HspCfxxInfoCustom> hisList = yzMapper.findCfxxDataByHisList(hspCfxxInfoQueryDto);
		cfxxList.addAll(hisList);
		//根据组号去重
		cfxxList = cfxxList.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(HspCfxxInfo :: getDaSub))), ArrayList::new));
		cfxxList.sort(Comparator.comparingLong(HspCfxxInfoCustom::getStartTimeLong).thenComparing(HspCfxxInfoCustom::getDaSeq));
		return cfxxList;
	}


	@Override
	public VHemsEmpi selectEmpiByHis(String cardNo,String cardType,String trackData) throws Exception {
		VHemsEmpi vHemsEmpi=new VHemsEmpi();
		Map<String,Object> map=new HashMap<String,Object>();
		if(StringUtils.isNotNullAndEmptyByTrim(cardType)){
			if("4".equals(cardType)){
				map.put("sfzh",cardNo);
			}
			else if("basy".equals(cardType)){
				map.put("mpi",cardNo);
			}
			else{
				map.put("zlkh", cardNo);
			}
			vHemsEmpi=vHemsEmpiMapper.selectEmpiByHis(map);
		}
		return  vHemsEmpi;
	}
}
