package activetech.edpc.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;

import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.aid.dao.mapper.AidPatientXtMapper;
import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.base.dao.mapper.DstarchivesMapper;
import activetech.base.dao.mapper.DstdictinfoCustomMapper;
import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import activetech.base.process.context.CpcConfig;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.dao.mapper.HspCrivelInfMapper;
import activetech.edpc.dao.mapper.HspXtzlInfMapper;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.domain.HspXtzlInfExample;
import activetech.edpc.service.CpcCrfplaneService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsCustomMapper;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;


public class CpcCrfplaneServiceImpl implements CpcCrfplaneService {
	@Autowired
	private HspXtzlInfMapper hspXtzlInfMapper;
	@Autowired
	private HspemginfCustomMapper hspemginfCustomMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private AidPatientMapper aidPatientMapper;
	@Autowired
	private AidPatientXtMapper aidPatientXtMapper;
	@Autowired
	private HspMewsInfMapper hspMewsInfMapper;
	@Autowired
	private DstdictinfoCustomMapper dstdictinfoCustomMapper;
	@Autowired
	private DstarchivesMapper dstarchivesMapper;
	@Autowired
	private HspConsultationRecordsCustomMapper hspConsultationRecordsCustomMapper;
	@Autowired
	private HspCrivelInfMapper hspCrivelInfMapper;
	
	@Override
	public ResultInfo cpcCrfplane(String emgNo, String patFlg) {
		// TODO Auto-generated method stub
		//胸痛信息map
		Map<String,String> xtzlMap = new HashMap<String, String>();
		HspXtzlInfExample hspXtzlInfExample = new HspXtzlInfExample();
		HspXtzlInfExample.Criteria criteria = hspXtzlInfExample.createCriteria();
		criteria.andEmgNoEqualTo(emgNo);
		List<HspXtzlInf> list = hspXtzlInfMapper.selectByExample(hspXtzlInfExample);
		for (HspXtzlInf hspXtzlInf : list) {
			xtzlMap.put(hspXtzlInf.getProCode(), hspXtzlInf.getProVal());
		}
		if("".equals(patFlg)){
			
		}else if("".equals(patFlg)){
			
		}else if("".equals(patFlg)){
			
		}
		return null;
	}
	/**
	 * 经过急诊
	 * @param emgNo
	 * @param xtzlMap
	 * @return
	 */
	public String registerInfoCrfplane(String emgNo,Map<String,String> xtzlMap){
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgNo);
		HspMewsInf hspMewsInf = hspMewsInfMapper.selectByPrimaryKey(emgNo);
		AidPatient aidPatient = null;
		AidPatientXt aidPatientXt = null;
		if(StringUtils.isNotNullAndEmptyByTrim(hspEmgInf.getPatid())){
			aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
			aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(hspEmgInf.getPatid());
		}
		
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		//人口基本信息
		Map<String,Object> registerInfoMap = new HashMap<String, Object>();
		//急救信息
		Map<String,Object> firstAIDInfoMap = new HashMap<String, Object>();
		//胸痛诊疗
		Map<String,Object> treatmentInfoMap = new HashMap<String, Object>();
		//出院转归
		Map<String,Object> outComeInfoMap = new HashMap<String,Object>();
		
		registerInfoMap.put("REGISTER_ID",null);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("NAME", hspEmgInf.getCstNam());;
		registerInfoMap.put("GENDER", "0".equals(hspEmgInf.getCstSexCod())? "1":"2");
		registerInfoMap.put("AGE", "0".equals(hspEmgInf.getCstAgeCod())? hspEmgInf.getCstAge() : "0");
		registerInfoMap.put("BIRTHDAY", DateUtil.getDateStrT(hspEmgInf.getBthDat()));
//		registerInfoMap.put("NATION", hspEmgInf.getNation());
		registerInfoMap.put("CONTACT_PHONE", hspEmgInf.getPheNbr());
		//默认身份证
		registerInfoMap.put("CREDENTIALS_TYPE", "1");
		registerInfoMap.put("IDCARD", hspEmgInf.getIdNbr());
		registerInfoMap.put("STATUS", 1);
		registerInfoMap.put("FILLIN_PERSON", CpcConfig.FILLIN_PERSON);
		registerInfoMap.put("SUBMIT_AUDIT_PERSON", CpcConfig.SUBMIT_AUDIT_PERSON);
		registerInfoMap.put("AUDITOR", CpcConfig.AUDITOR);
		registerInfoMap.put("ARCHIVING_PERSON", CpcConfig.ARCHIVING_PERSON);
		list.add(registerInfoMap);
		
		firstAIDInfoMap.put("OUTPATIENT_ID", hspEmgInf.getMpi());
		firstAIDInfoMap.put("SERIOUS_ILLNESS_INSURANCE", xtzlMap.get("DBYB"));
		//清醒程度急诊编码不一致，+1处理
		firstAIDInfoMap.put("CONSCIOUSNESS_TYPE", Integer.valueOf(hspMewsInf.getSenRctCod())+1+"");
		firstAIDInfoMap.put("RESPIRATION_RATE", hspMewsInf.getBreNbr());
		firstAIDInfoMap.put("PULSE_RATE", hspMewsInf.getHrtRte());
//		firstAIDInfoMap.put("HEART_RATE", hspMewsInf.getHrtRte());//预检时暂只有脉搏
		firstAIDInfoMap.put("BLOOD_PRESSURE", hspMewsInf.getSbpupNbr()+"/"+hspMewsInf.getSbpdownNbr());
		firstAIDInfoMap.put("TEMPERATURE", hspMewsInf.getTmpNbr());
		firstAIDInfoMap.put("DISTRESS_CASE", xtzlMap.get("BQPG"));
		firstAIDInfoMap.put("DISTRESS_CASE_DETAIL", xtzlMap.get("BQPGMX"));
		firstAIDInfoMap.put("PATIENT_REMARK", xtzlMap.get("YQHZQKBZ"));
		
		
		
		
		if(aidPatient != null && aidPatientXt != null){
			firstAIDInfoMap.put("ATTACK_TIME",  DateUtil.getDateStrT(aidPatient.getIllTim()));
			firstAIDInfoMap.put("IS_NULL_ATTACK_DETAIL_TIME",  aidPatient.getIllTimFlg());
			if(isnot(aidPatient.getIllTimFlg())){
				firstAIDInfoMap.put("ATTACK_ZONE", aidPatient.getIllperd());
			}
			firstAIDInfoMap.put("PROVINCE",aidPatient.getScePrvCod());
			firstAIDInfoMap.put("CITY",aidPatient.getSceCtyCod());
			firstAIDInfoMap.put("AREA",aidPatient.getSceAr0Cod());
//			firstAIDInfoMap.put("ATTACK_ADDRESS","");
			firstAIDInfoMap.put("MEDICAL_INSURANCE_TYPE",aidPatient.getSceAr0Cod());
			firstAIDInfoMap.put("CW_COMING_WAY_CODE", aidPatientXt.getDdfs());
			
			String ddfs = aidPatientXt.getDdfs();
			//1:呼叫（120 或其他）出车2:转院（包含任何机构）3:自行来院4:院内发病
			if(isnot(ddfs)){
				firstAIDInfoMap.put("CW_120_AMBULANCE_DEPARTMENT", xtzlMap.get("CCDW"));
				firstAIDInfoMap.put("CW_120_HELP_TIME", DateUtil.getDateStrT(aidPatient.getAlmtime()));
				//到达大门时间
				firstAIDInfoMap.put("CW_120_ARRIVED_HOSPITAL_TIME", DateUtil.getDateStrT(aidPatient.getAahtime()));
				//直接转送上级医院
				firstAIDInfoMap.put("CW_120_IS_TRANS_HOSPITAL", xtzlMap.get("ZJZSSJYY") == null? "0" : xtzlMap.get("ZJZSSJYY"));
				//直达导管室
				firstAIDInfoMap.put("CW_120_IS_DIRECT_CONDUIT_ROOM", isnot(xtzlMap.get("ZJZSSJYY"))? xtzlMap.get("ZDDGS"):"0");
				firstAIDInfoMap.put("CW_120_FIRST_MC_TIME", DateUtil.getDateStrT(aidPatientXt.getScyljc()));
				firstAIDInfoMap.put("CW_120_FIRST_DOCTOR_TIME", DateUtil.getDateStrT(hspEmgInf.getEmgDat()));
				firstAIDInfoMap.put("CW_120_FIRST_DOCTOR_NAME", hspEmgInf.getPreUsrNbr());
				
				
			}else if("2".equals(ddfs)){
				//获取网络医院名称
				String info = aidPatientXt.getWlyy() == null?
						null:dstdictinfoCustomMapper.findDictinfoByTypecodeInfocode("XT_WLYY_COD", aidPatientXt.getWlyy()).getInfo();
				firstAIDInfoMap.put("CW_ZY_TRANS_TYPE", info);
				firstAIDInfoMap.put("CW_ZY_FIRST_MC_TIME", DateUtil.getDateStrT(aidPatientXt.getScyljc()));
				firstAIDInfoMap.put("CW_ZY_OUTHOSPITAL_VISIT_TIME", DateUtil.getDateStrT(aidPatientXt.getWlyyry()));
				//直接转送上级医院
				firstAIDInfoMap.put("CW_ZY_IS_TRANS_HOSPITAL", xtzlMap.get("ZJZSSJYY") == null? "0" : xtzlMap.get("ZJZSSJYY"));
				//直达导管室
				firstAIDInfoMap.put("CW_ZY_IS_DIRECT_CONDUIT_ROOM", isnot(xtzlMap.get("ZJZSSJYY"))? xtzlMap.get("ZDDGS"):"0");
				firstAIDInfoMap.put("CW_ZY_TRANSFER_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDZYSJ"))));
				firstAIDInfoMap.put("CW_ZY_LEAVE_OUTHOSPITAL_TIME", DateUtil.getDateStrT(aidPatientXt.getZzcm()));
				firstAIDInfoMap.put("CW_ZY_ARRIVED_HOSPITAL_TIME", DateUtil.getDateStrT(aidPatient.getAahtime()));
				firstAIDInfoMap.put("CW_ZY_ADMISSION_TIME", DateUtil.getDateStrT(hspEmgInf.getEmgDat()));
				firstAIDInfoMap.put("CW_ZY_FIRST_DOCTOR_NAME", hspEmgInf.getPreUsrNbr());
			}else if("3".equals(ddfs)){
				firstAIDInfoMap.put("CW_ZXLY_ARRIVED_HOSPITAL_TIME", DateUtil.getDateStrT(aidPatient.getAahtime()));
				firstAIDInfoMap.put("CW_ZXLY_FIRST_MC_TIME", DateUtil.getDateStrT(hspEmgInf.getEmgDat()));
				firstAIDInfoMap.put("CW_ZXLY_FIRST_DOCTOR_NAME", hspEmgInf.getPreUsrNbr());
			}
			
			if("2".equals(ddfs)
					||isnot(ddfs)){
				firstAIDInfoMap.put("SCREENING", aidPatientXt.getYqrssc());
				if("2".equals(aidPatientXt.getYqrssc()))
					firstAIDInfoMap.put("THROM_CONTRAINDICATION", xtzlMap.get("YQCZJJZ"));
				if(isnot(aidPatientXt.getYqrssc())){
					//溶栓有无
					firstAIDInfoMap.put("IS_THROMBOLYSIS", xtzlMap.get("YQRSZL"));
					//溶栓 有
					if(isnot(xtzlMap.get("YQRSZL"))){
						firstAIDInfoMap.put("IS_DIRECT", xtzlMap.get("YQZDRSCS"));
						firstAIDInfoMap.put("THROM_TREATMENT_PLACE", xtzlMap.get("YQRSCS"));
						firstAIDInfoMap.put("START_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQKSZQTYSJ"))));
						firstAIDInfoMap.put("SIGN_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQQSZQTYSSJ"))));
						firstAIDInfoMap.put("THROM_START_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQKSRSSJ"))));
						firstAIDInfoMap.put("THROM_END_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQRSJSSJ"))));
						firstAIDInfoMap.put("THROM_DRUG_TYPE", xtzlMap.get("YQYW"));
						firstAIDInfoMap.put("THROM_DRUG_CODE", xtzlMap.get("YQJL"));
						firstAIDInfoMap.put("IS_REPATENCY", xtzlMap.get("YQRSZT"));
						if(isnot(xtzlMap.get("YQRSZT"))){
							firstAIDInfoMap.put("START_RADIOGRAPHY_TIME", 
									DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQRSHZYSJ"))));
						}else if("0".equals(xtzlMap.get("YQRSZT"))){
							firstAIDInfoMap.put("IS_REPCI", xtzlMap.get("YQBJPCI"));
							if(isnot(xtzlMap.get("YQBJPCI"))){
								firstAIDInfoMap.put("OPERATION_TIME", 
										DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQSJSSSJ"))));
								firstAIDInfoMap.put("HOSPITAL_POSITION", xtzlMap.get("YQSSDD"));
							}
						}
					}
				}
				
				
			}
		}
		
		//胸痛诊疗信息
		//心电图列表
		DstarchivesExample dstarchivesExample = new DstarchivesExample();
		DstarchivesExample.Criteria dstarchivesCriteria = dstarchivesExample.createCriteria();
		dstarchivesCriteria.andRefIdEqualTo(emgNo);
		dstarchivesCriteria.andFileTypeEqualTo("ecg");
		dstarchivesExample.setOrderByClause("crt_date desc");
		List<Dstarchives> ecgList = dstarchivesMapper.selectByExample(dstarchivesExample);
		String HAS_ECG_IMAGE = ecgList.size()>0? "1":"0";
		
		treatmentInfoMap.put("HAS_ECG_IMAGE", HAS_ECG_IMAGE);
		if("0".equals(HAS_ECG_IMAGE)){
			treatmentInfoMap.put("NO_ECG_IMAGE_REASON", xtzlMap.get("WHDYY"));
		}else{
			Map<String,String> ecgMap = new HashMap<String, String>();
			for (Dstarchives dstarchives : ecgList) {
				ecgMap.put("ECG_TIME", DateUtil.getDateStrT(dstarchives.getCrtDate()));
				ecgMap.put("ECG_TIME", DateUtil.getDateStrT(dstarchives.getCrtDate()));
			}
		}
		//心电图
		treatmentInfoMap.put("REMOTE_ECG_TRANSMISSION", xtzlMap.get("YCXDTCS"));
		if(isnot(xtzlMap.get("YCXDTCS"))){
			treatmentInfoMap.put("TRAN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YCXDTCS"))));
			treatmentInfoMap.put("IS_REMOTE_ECGTRAN", xtzlMap.get("YCXDTCS"));
		}
		//肌钙蛋白
		treatmentInfoMap.put("IS_CTNT", xtzlMap.get("ISJGDB"));
		List<Map<String,String>> ctntList = new ArrayList<Map<String,String>>();
		if(isnot(xtzlMap.get("ISJGDB"))){
			Map<String,String> ctntMap = new HashMap<String, String>();
			ctntMap.put("TYPE", "");
			ctntList.add(ctntMap);
		}
		treatmentInfoMap.put("CTNTS", ctntList);
		//血清肌酐
		treatmentInfoMap.put("IS_CR", xtzlMap.get("ISXQJG"));
		if(isnot(xtzlMap.get("ISXQJG")))
			treatmentInfoMap.put("CR_VALUE", xtzlMap.get("XQJGSZ"));
		//d-二聚体
		treatmentInfoMap.put("IS_Ddimer", xtzlMap.get("ISDEJT"));
		if(isnot(xtzlMap.get("ISDEJT"))){
			treatmentInfoMap.put("Ddimer_VALUE", xtzlMap.get("DEJTSZ"));
			treatmentInfoMap.put("Ddimer_UNIT", xtzlMap.get("DEJTDW"));
		}
		//BNP
		treatmentInfoMap.put("IS_BNP", xtzlMap.get("ISBNP"));
		if(isnot(xtzlMap.get("ISBNP")))
			treatmentInfoMap.put("BNP_VALUE", xtzlMap.get("BNPSZ"));
		//NT-proBNP
		treatmentInfoMap.put("IS_NTproBNP", xtzlMap.get("ISNTPROBNP"));
		if(isnot(xtzlMap.get("ISNTPROBNP")))
			treatmentInfoMap.put("NTproBNP_VALUE", xtzlMap.get("NTPROBNPSZ"));
		//Myo
		treatmentInfoMap.put("IS_MYO", xtzlMap.get("ISMYO"));
		if(isnot(xtzlMap.get("ISMYO"))){
			treatmentInfoMap.put("MYO_VALUE", xtzlMap.get("MYOSZ"));
			treatmentInfoMap.put("MYO_UNIT", xtzlMap.get("MYODW"));
		}
		treatmentInfoMap.put("IS_CKMB", xtzlMap.get("ISCKMB"));
		if(isnot(xtzlMap.get("ISCKMB"))){
			treatmentInfoMap.put("CKMB_VALUE", xtzlMap.get("CKMBSZ"));
			treatmentInfoMap.put("CKMB_UNIT", xtzlMap.get("CKMBDW"));
		}
		
		//心内科会诊
		List<HspConsultationRecordsCustom> consultationList = 
				hspConsultationRecordsCustomMapper.findHspConsultationRecordsByInvitationDepLike(emgNo);
		if(consultationList.size()>0){
			treatmentInfoMap.put("IS_NOTICE_IMCD", "1");
			treatmentInfoMap.put("IMCD_TYPE", xtzlMap.get("HZLX"));
			treatmentInfoMap.put("NOTICE_IMCD_TIME", DateUtil.getDateStrT(consultationList.get(0).getInvitationDate()));
			treatmentInfoMap.put("CONSULTATION_TIME", DateUtil.getDateStrT(consultationList.get(0).getConsultationDate()));
		}else{
			treatmentInfoMap.put("IS_NOTICE_IMCD", "0");
		}
		//初步诊断/心内>急诊  若无心内诊断，取急诊诊断
		String cbzd = null;
		if(xtzlMap.get("CBZD") == null){
			cbzd = xtzlMap.get("JZZD");
		}else{
			cbzd = xtzlMap.get("CBZD");
		}
		treatmentInfoMap.put("CP_DIAGNOSIS_CODE", cbzd);
		//STEMI
		if("1".equals(cbzd)){
			treatmentInfoMap.put("STEMI_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("STEMI_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			treatmentInfoMap.put("STEMI_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			treatmentInfoMap.put("STEMI_KILLIP_LEVEL", xtzlMap.get("KILLIP"));
			//过急诊流程非绕行急诊
			treatmentInfoMap.put("STEMI_IS_BYPASS_EMERGENCY", "0");
			treatmentInfoMap.put("STEMI_IS_BYPASS_CCU", xtzlMap.get("RXCCU"));
			//抗血小板药物
			treatmentInfoMap.put("STEMI_IS_DRUG", xtzlMap.get("KXXBZL"));
			if(isnot(xtzlMap.get("KXXBZL"))){
				treatmentInfoMap.put("STEMI_ASPIRIN_DOSE", xtzlMap.get("ASPLJL"));
				treatmentInfoMap.put("STEMI_ASPIRIN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ASPLSJ"))));
				treatmentInfoMap.put("STEMI_CLOPIDOGREL_DOSE", xtzlMap.get("LBGLJL"));
				treatmentInfoMap.put("STEMI_CLOPIDOGREL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LBGLSJ"))));
				treatmentInfoMap.put("STEMI_TICAGRELOR_DOSE", xtzlMap.get("TGRLJL"));
				treatmentInfoMap.put("STEMI_TICAGRELOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TGRLSJ"))));
			}
			//抗凝
			treatmentInfoMap.put("STEMI_IS_ANTICOAGULATION", xtzlMap.get("ISKN"));
			if(isnot(xtzlMap.get("ISKN"))){
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_DRUG", xtzlMap.get("KANGN"));
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_DOSE", xtzlMap.get("KNYWJL"));
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_TIME", xtzlMap.get("KNYWSJ"));
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_UNIT", xtzlMap.get("KNYWDW"));
			}
			
			treatmentInfoMap.put("STEMI_INTENSIFY_STATINS_TREAT", xtzlMap.get("TTZL"));
			treatmentInfoMap.put("STEMI_RECEPTOR_RETARDANT_USING", xtzlMap.get("BSTZZJ"));
			//再灌注
			treatmentInfoMap.put("STEMI_IS_REPERFUSION", xtzlMap.get("YWZGZCS"));
			if("0".equals(xtzlMap.get("YWZGZCS")))
				treatmentInfoMap.put("STEMI_IS_REPERFUSION", (""+xtzlMap.get("WZGZCSYY")).replaceAll(",", "|"));
			else if(isnot(xtzlMap.get("YWZGZCS"))){
				zgzcs(treatmentInfoMap, xtzlMap);
			}
		}
		else if("2".equals(cbzd)){
			treatmentInfoMap.put("NSTEMI_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("NSTEMI_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("NSTEMI_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			treatmentInfoMap.put("NSTEMI_KILLIP_LEVEL", xtzlMap.get("KILLIP")); 
			//过急诊流程非绕行急诊
			treatmentInfoMap.put("NSTEMI_IS_BYPASS_EMERGENCY", "0");
			treatmentInfoMap.put("NSTEMI_IS_BYPASS_CCU", xtzlMap.get("RXCCU")); 
			//抗血小板药物
			treatmentInfoMap.put("NSTEMI_IS_DRUG", xtzlMap.get("KXXBZL"));
			if(isnot(xtzlMap.get("KXXBZL"))){
				treatmentInfoMap.put("NSTEMI_ASPIRIN_DOSE", xtzlMap.get("ASPLJL"));
				treatmentInfoMap.put("NSTEMI_ASPIRIN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ASPLSJ"))));
				treatmentInfoMap.put("NSTEMI_CLOPIDOGREL_DOSE", xtzlMap.get("LBGLJL"));
				treatmentInfoMap.put("NSTEMI_CLOPIDOGREL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LBGLSJ"))));
				treatmentInfoMap.put("NSTEMI_TICAGRELOR_DOSE", xtzlMap.get("TGRLJL"));
				treatmentInfoMap.put("NSTEMI_TICAGRELOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TGRLSJ"))));
			}
			//抗凝
			treatmentInfoMap.put("NSTEMI_IS_ANTICOAGULATION", xtzlMap.get("ISKN"));
			if(isnot(xtzlMap.get("ISKN"))){
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_DRUG", xtzlMap.get("KANGN"));
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_DOSE", xtzlMap.get("KNYWJL"));
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_TIME", xtzlMap.get("KNYWSJ"));
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_UNIT", xtzlMap.get("KNYWDW"));
			}
			
			treatmentInfoMap.put("NSTEMI_INTENSIFY_STATINS_TREAT", xtzlMap.get("TTZL"));
			treatmentInfoMap.put("NSTEMI_IS_BETA_BLOCKER", xtzlMap.get("BSTZZJ"));
			//grace
			treatmentInfoMap.put("NSTEMI_GRACE_ESTIMATE", (""+xtzlMap.get("WXYS")).replaceAll(",", "|"));
			treatmentInfoMap.put("NSTEMI_RISK_LAMINATION", xtzlMap.get("GRACEWXFC"));
			//未完成   缺少分值
			if("1".equals(xtzlMap.get("GRACEWXFC"))){
				treatmentInfoMap.put("NSTEMI_GRACE_HR_CONDITION", (""+xtzlMap.get("GRACEJGWTJ")).replaceAll(",", "|"));
			}
			//再次危险分层
			treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG", xtzlMap.get("ZCWXFC"));
			if(xtzlMap.get("ZCWXFC") != null && !"0".equals(xtzlMap.get("ZCWXFC")))
				treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
			treatmentInfoMap.put("NSTEMI_STRATEGY", xtzlMap.get("CLCL"));
			treatmentInfoMap.put("NSTEMI_INVASIVE_STRATEGY", xtzlMap.get("QRXCL"));
			//侵入性策略
			if("1".equals(xtzlMap.get("QRXCL"))){
				treatmentInfoMap.put("NSTEMI_STRATEGY_DOCTOR_NAME", xtzlMap.get("JDXPCIYS"));
				treatmentInfoMap.put("NSTEMI_DECISION_OPERATION_TIME", xtzlMap.get("JDJRSSSJ"));
				treatmentInfoMap.put("NSTEMI_START_CONDUIT_TIME", xtzlMap.get("QDDGSSJ"));
				treatmentInfoMap.put("NSTEMI_START_AGREE_TIME", xtzlMap.get("KSZQTYSJ"));
				treatmentInfoMap.put("NSTEMI_SIGN_AGREE_TIME", xtzlMap.get("QSZQTYSJ"));
			}
			else if("2".equals(xtzlMap.get("QRXCL"))){
				treatmentInfoMap.put("NSTEMI_ACTUAL_INTERVENT_TIME", xtzlMap.get("SJJRZLSJ"));
			}
			
			
			
			
			
		}
		//UA
		else if("3".equals(cbzd)){
			treatmentInfoMap.put("UA_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("UA_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("UA_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			treatmentInfoMap.put("UA_KILLIP_LEVEL", xtzlMap.get("KILLIP")); 
			//过急诊流程非绕行急诊
			treatmentInfoMap.put("UA_IS_BYPASS_EMERGENCY", "0");
			treatmentInfoMap.put("UA_IS_BYPASS_CCU", xtzlMap.get("RXCCU")); 
			//抗血小板药物
			treatmentInfoMap.put("UA_IS_DRUG", xtzlMap.get("KXXBZL"));
			if(isnot(xtzlMap.get("KXXBZL"))){
				treatmentInfoMap.put("UA_ASPIRIN_DOSE", xtzlMap.get("ASPLJL"));
				treatmentInfoMap.put("UA_ASPIRIN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ASPLSJ"))));
				treatmentInfoMap.put("UA_CLOPIDOGREL_DOSE", xtzlMap.get("LBGLJL"));
				treatmentInfoMap.put("UA_CLOPIDOGREL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LBGLSJ"))));
				treatmentInfoMap.put("UA_TICAGRELOR_DOSE", xtzlMap.get("TGRLJL"));
				treatmentInfoMap.put("UA_TICAGRELOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TGRLSJ"))));
			}
			//抗凝
			treatmentInfoMap.put("UA_IS_ANTICOAGULATION", xtzlMap.get("ISKN"));
			if(isnot(xtzlMap.get("ISKN"))){
				treatmentInfoMap.put("UA_ANTICOAGULATION_DRUG", xtzlMap.get("KANGN"));
				treatmentInfoMap.put("UA_ANTICOAGULATION_DOSE", xtzlMap.get("KNYWJL"));
				treatmentInfoMap.put("UA_ANTICOAGULATION_TIME", xtzlMap.get("KNYWSJ"));
				treatmentInfoMap.put("UA_ANTICOAGULATION_UNIT", xtzlMap.get("KNYWDW"));
			}
			
			treatmentInfoMap.put("UA_INTENSIFY_STATINS_TREAT", xtzlMap.get("TTZL"));
			treatmentInfoMap.put("UA_RECEPTOR_RETARDANT_USING", xtzlMap.get("BSTZZJ"));
			//grace
			treatmentInfoMap.put("UA_GRACE_ESTIMATE", (""+xtzlMap.get("WXYS")).replaceAll(",", "|"));
			treatmentInfoMap.put("UA_RISK_LAMINATION", xtzlMap.get("GRACEWXFC"));
			//未完成   缺少分值
			if("1".equals(xtzlMap.get("GRACEWXFC"))){
				treatmentInfoMap.put("UA_GRACE_HR_CONDITION", (""+xtzlMap.get("GRACEJGWTJ")).replaceAll(",", "|"));
				//grace分值  未完成
				treatmentInfoMap.put("UA_GRACE_VALUE", (""+xtzlMap.get("GRACEJGWTJ")).replaceAll(",", "|"));
			}
			//再次危险分层
			treatmentInfoMap.put("UA_RISK_LAMINATION_AG", xtzlMap.get("ZCWXFC"));
			if(xtzlMap.get("ZCWXFC") != null && !"0".equals(xtzlMap.get("ZCWXFC")))
				treatmentInfoMap.put("UA_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
			treatmentInfoMap.put("UA_STRATEGY", xtzlMap.get("CLCL"));
			treatmentInfoMap.put("UA_INVASIVE_STRATEGY", xtzlMap.get("QRXCL"));
			//侵入性策略
			if("1".equals(xtzlMap.get("QRXCL"))){
				treatmentInfoMap.put("UA_STRATEGY_DOCTOR_NAME", xtzlMap.get("JDXPCIYS"));
				treatmentInfoMap.put("UA_DECISION_OPERATION_TIME", xtzlMap.get("JDJRSSSJ"));
				treatmentInfoMap.put("UA_START_CONDUIT_TIME", xtzlMap.get("QDDGSSJ"));
				treatmentInfoMap.put("UA_START_AGREE_TIME", xtzlMap.get("KSZQTYSJ"));
				treatmentInfoMap.put("UA_SIGN_AGREE_TIME", xtzlMap.get("QSZQTYSJ"));
			}
			else if("2".equals(xtzlMap.get("QRXCL"))){
				treatmentInfoMap.put("UA_ACTUAL_INTERVENT_TIME", xtzlMap.get("SJJRZLSJ"));
			}
		}
		//主动脉夹层
		else if("4".equals(cbzd)){
			treatmentInfoMap.put("AD_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("AD_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("AD_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			//影像学检查
			String yxxjc = ""+xtzlMap.get("YXXJC");
			treatmentInfoMap.put("AD_IMG_EXAMINATION", yxxjc.replaceAll(",", "|")); 
			if(yxxjc.indexOf("1")>0){
				treatmentInfoMap.put("AD_CT_NOTICE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZCTSSJ"))));
				treatmentInfoMap.put("AD_CT_FINISH_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSWCZBSJ"))));
				treatmentInfoMap.put("AD_CT_SCAN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSMKSSJ"))));
				treatmentInfoMap.put("AD_CT_REPORT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTBGSJ"))));
			}
			else if(yxxjc.indexOf("2")>0){
				treatmentInfoMap.put("AD_NOTICE_CDU_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZCCSSJ"))));
				treatmentInfoMap.put("AD_CDU_CHECK_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CCJCSJ"))));
				treatmentInfoMap.put("AD_CHECK_RESULT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CCCJGSJ"))));
			}
			//通知心外科会诊时间
			treatmentInfoMap.put("AD_IMCD_NOTICE_TIME", xtzlMap.get("TZXWKHZSJ")); 
			treatmentInfoMap.put("AD_ECC_CONSULTATION_TIME", xtzlMap.get("XWKHZSJ")); 
			//夹层类型
			treatmentInfoMap.put("AD_INTERLAYER_TYPE", xtzlMap.get("JCLX"));
			treatmentInfoMap.put("AD_TREATMENT_STRATEGY_CODE", xtzlMap.get("ZLCL"));
		}
		//肺栓塞
		else if("5".equals(cbzd)){
			treatmentInfoMap.put("PE_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("PE_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("PE_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			//影像学检查
			String yxxjc = ""+xtzlMap.get("YXXJC");
			//上报系统共用编码，编码“未做”值不同
			treatmentInfoMap.put("PE_IMG_EXAMINATION", yxxjc.replaceAll(",", "|").replace("4", "2")); 
			if(yxxjc.indexOf("1")>0){
				treatmentInfoMap.put("PE_CT_NOTICE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZCTSSJ"))));
				treatmentInfoMap.put("PE_CT_FINISH_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSWCZBSJ"))));
				treatmentInfoMap.put("PE_CT_SCAN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSMKSSJ"))));
				treatmentInfoMap.put("PE_CT_REPORT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTBGSJ"))));
			}
			//治疗信息-危险分层-开始抗凝治疗时间
			treatmentInfoMap.put("PE_RISK_LAMINATION", xtzlMap.get("WXFC"));
			treatmentInfoMap.put("PE_ANTI_TREATMENT_TIME", xtzlMap.get("KSKNZLSJ"));
			//院内溶栓治疗
			treatmentInfoMap.put("PE_SCREENING", xtzlMap.get("YNRSSC"));
			if("2".equals(xtzlMap.get("YNRSSC"))){
				treatmentInfoMap.put("PE_THROM_CONTRAINDICATION", xtzlMap.get("YNCZJJZ"));
			}else if("1".equals(xtzlMap.get("YNRSSC"))){
				treatmentInfoMap.put("PE_IS_THROMBOLYSIS", xtzlMap.get("YNRSZL"));
			}
		}
		//非 ACS 心源性胸痛
		else if("6".equals(cbzd)){
			treatmentInfoMap.put("NACS_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("NACS_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("NACS_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			treatmentInfoMap.put("NACS_TYPE", (""+xtzlMap.get("FACSXYXXTLX")).replaceAll(",", "|")); 
			treatmentInfoMap.put("NACS_TREATMENT_TYPE", xtzlMap.get("CLCS")); 
			treatmentInfoMap.put("NACS_PATIENT_REMARK", xtzlMap.get("YNHZQKBZ")); 
		}
		//其它非心源性胸痛
		else if("7".equals(cbzd)){
			treatmentInfoMap.put("OTHER_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("OTHER_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("OTHER_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			treatmentInfoMap.put("OTHER_TYPE", (""+xtzlMap.get("QTFXYXXTLX")).replaceAll(",", "|")); 
			treatmentInfoMap.put("OTHER_TREATMENT_TYPE", xtzlMap.get("CLCS"));
			treatmentInfoMap.put("OTHER_PATIENT_REMARK", xtzlMap.get("YNHZQKBZ")); 
		}
		//待查
		else if("8".equals(cbzd)){
			treatmentInfoMap.put("AWAIT_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			treatmentInfoMap.put("AWAIT_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); 
			treatmentInfoMap.put("AWAIT_DOCTOR_NAME", xtzlMap.get("YISHENG")); 
			treatmentInfoMap.put("AWAIT_TREATMENT_TYPE", xtzlMap.get("CLCS"));
			treatmentInfoMap.put("AWAIT_PATIENT_REMARK", xtzlMap.get("YNHZQKBZ")); 
		}
		
		//导管室
		if("1".equals(treatmentInfoMap.get("STEMI_MEASURES"))
				||"1".equals(treatmentInfoMap.get("NSTEMI_INVASIVE_STRATEGY"))
				||"1".equals(treatmentInfoMap.get("UA_INVASIVE_STRATEGY"))){
			treatmentInfoMap.put("ACTIVATE_CONDUIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("DGSJHSJ"))));
			treatmentInfoMap.put("PATIENT_ARRIVED_CONDUIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("HZJDGSSJ"))));
			treatmentInfoMap.put("START_PUNCTURE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSCCSJ"))));
			treatmentInfoMap.put("START_RADIOGRAPHY_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZYKSSJ"))));
			treatmentInfoMap.put("ANTICOAGULATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SZKNGYSJ"))));
			treatmentInfoMap.put("ANTICOAGULATION_DRUG", xtzlMap.get("SZKNYW"));
			treatmentInfoMap.put("ANTICOAGULATION_DOSE", xtzlMap.get("SZKNYWJL"));
			treatmentInfoMap.put("ANTICOAGULATION_UNIT", xtzlMap.get("SZKNYWDW"));
			treatmentInfoMap.put("END_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("PCISSWCSJ"))));
			treatmentInfoMap.put("DTWOB_TIME", xtzlMap.get("D2WSJ"));
			treatmentInfoMap.put("IS_DELAY", xtzlMap.get("SFYW"));
			treatmentInfoMap.put("DELAY_REASON", (""+xtzlMap.get("YWYY")).replaceAll(",", "|"));
			//入路
			treatmentInfoMap.put("ROUTE", xtzlMap.get("RULU"));
			List<Map<String,Object>> crivelList = new ArrayList<Map<String,Object>>();
			//部位（罪犯血管）
			String POSITION = "";
			for(int i=1;i<28;i++){
				Map<String,Object> crivelMap = new HashMap<String, Object>();
				String gmzy = "GMZY"+i;
				if(StringUtils.isNotNullAndEmptyByTrim(xtzlMap.get(gmzy))){
					HspCrivelInf hspCrivelInf = hspCrivelInfMapper.selectByPrimaryKey(xtzlMap.get(gmzy));
					//罪犯血管内容
					crivelMap.put("POSITION", i);
					crivelMap.put("NARROW_LEVEL", hspCrivelInf.getXzcd());
					crivelMap.put("PREOPERATIVE_TIMI_LEVEL", hspCrivelInf.getZystimixl());
					crivelMap.put("BRACKET_THROMBUS", hspCrivelInf.getZjnxs());
					crivelMap.put("BRANCHING_SICK", hspCrivelInf.getSffcbb());
					crivelMap.put("CTO", hspCrivelInf.getSfcto());
					crivelMap.put("CA_SICK", hspCrivelInf.getGhbb());
					crivelMap.put("CRIMINAL_SICK", hspCrivelInf.getZfbb());
					crivelMap.put("PCI", hspCrivelInf.getPci());
					if(isnot(hspCrivelInf.getPci())){
						crivelMap.put("INTRAOPERATIVE_HANDLE", hspCrivelInf.getSzcl());
						crivelMap.put("BALLOON_EXPANSION_TIME", DateUtil.getDateStrT(hspCrivelInf.getDstgsj()));
						crivelMap.put("TIMI", hspCrivelInf.getShtimixl());
						crivelMap.put("BRACKET_NUM", hspCrivelInf.getZrzjgs());
						crivelMap.put("BRAKET_TYPE", hspCrivelInf.getZjzl());
					}
					crivelList.add(crivelMap);
					
					if(POSITION.length()>0){
						POSITION = POSITION + "|" + i;
					}else{
						POSITION = POSITION + i;
					}
				}
			}
			treatmentInfoMap.put("POSITION", POSITION);
			treatmentInfoMap.put("CORONARY_ANGIOGRAPHIE_LIST", crivelList);
			
			//器械
			treatmentInfoMap.put("INTRACAVITY_IMAGE", xtzlMap.get("QNYX"));
			treatmentInfoMap.put("FUNCTION_TEST", xtzlMap.get("GNJC"));
			if("1".equals(xtzlMap.get("GNJC"))
					||"4".equals(xtzlMap.get("GNJC"))
					||"5".equals(xtzlMap.get("GNJC")))
				treatmentInfoMap.put("FUNCTION_TEST_VALUE", xtzlMap.get("GNJCSZ"));
			
			treatmentInfoMap.put("IABP", xtzlMap.get("IABP"));
			treatmentInfoMap.put("PACEMAKER", xtzlMap.get("LSQBQ"));
			treatmentInfoMap.put("ECMO", xtzlMap.get("ECMO"));
			treatmentInfoMap.put("AUXILIARY_DEVICE", xtzlMap.get("ZXSFZZZ"));
			
			//术中并发症
			treatmentInfoMap.put("COMPLICATION", (""+xtzlMap.get("SZBFZ")).replaceAll(",", "|"));
			
			//患者转归
			//出院诊断
			String cyzd = xtzlMap.get("CYZD");
			outComeInfoMap.put("CP_DIAGNOSIS_CODE", cyzd);
			outComeInfoMap.put("DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("QZSJ"))));
			if("1".equals(cyzd)
					||"2".equals(cyzd)
					||"3".equals(cyzd)){
				outComeInfoMap.put("IS_HEART_FAILURE", xtzlMap.get("YNXFXLSJ"));
				outComeInfoMap.put("IS_ARNI", xtzlMap.get("SFARNI"));
				outComeInfoMap.put("ARNI_DOSE", xtzlMap.get("ARNIDCJL"));
				outComeInfoMap.put("ARNI_FREQUENCY", xtzlMap.get("ARNI"));
				outComeInfoMap.put("ARNI_FREQUENCY_RANGE", xtzlMap.get("ARNIQJ"));
				outComeInfoMap.put("COMPLICATION", (""+xtzlMap.get("ZYQJBFZ")).replaceAll(",", "|"));
				//危险因素1 高血压|2 高脂血症|3 糖尿病|4 吸烟|5 肥胖|6 早发CVD家族史|7 既往心脏病史|8 既往血运重建史
				String XXGJBWXYS = "" + xtzlMap.get("XXGJBWXYS");
				outComeInfoMap.put("FERITIN", XXGJBWXYS.indexOf("1")>0? "1":"0");
				outComeInfoMap.put("HYPERLIPEMIA", XXGJBWXYS.indexOf("2")>0? "1":"0");
				outComeInfoMap.put("DIABETES", XXGJBWXYS.indexOf("3")>0? "1":"0");
				outComeInfoMap.put("SMOKING", XXGJBWXYS.indexOf("4")>0? "1":"0");
				outComeInfoMap.put("SMOKING_STATUS", XXGJBWXYS.indexOf("4")>0? xtzlMap.get("XYZT"):"0");
				outComeInfoMap.put("OBESITY", XXGJBWXYS.indexOf("5")>0? "1":"0");
				outComeInfoMap.put("FAMILY_DISEASE", XXGJBWXYS.indexOf("6")>0? "1":"0");
				//合并疾病1 冠心病|2 心房颤动|3 慢性心力衰竭|4 心脏瓣膜病|5 脑血管疾病|6 外周动脉疾病|7 主动脉瘤|8 COPD|9 慢性肾病|10 贫血|11 消化性溃疡|12 甲状腺功能异常|13 恶性肿瘤
				String HEBZ = xtzlMap.get("HEBZ");
				String[] hebzArr = HEBZ.split(",");
				for (String hbz : hebzArr) {
					if("1".equals(hbz)){
						outComeInfoMap.put("CHD", "1");
						outComeInfoMap.put("PREVIOUS_REVASCULARIZATION", xtzlMap.get("XYCJS"));
					}else{
						outComeInfoMap.put("CHD", "0");
					}
					if("2".equals(hbz)){
						outComeInfoMap.put("AF", "1");
						outComeInfoMap.put("AF_TYPE", xtzlMap.get("XFCDFX"));
					}else{
						outComeInfoMap.put("AF", "0");
					}
					if("3".equals(hbz)){
						outComeInfoMap.put("SLOW_HEART_FAILURE", "1");
						outComeInfoMap.put("NYHA_LEVEL", xtzlMap.get("ZGNYHA"));
					}else{
						outComeInfoMap.put("SLOW_HEART_FAILURE", "0");
					}
					outComeInfoMap.put("AVHD", "4".equals(hbz)? "1":"0");
					if("5".equals(hbz)){
						outComeInfoMap.put("BRIAN_VASCELLUM", "1");
						outComeInfoMap.put("BRIAN_VASCELLUM_DESC", xtzlMap.get("NXGJBMS"));
					}else{
						outComeInfoMap.put("BRIAN_VASCELLUM", "0");
					}
					outComeInfoMap.put("PERIPHERAL_ARTERY_DISEASE", "6".equals(hbz)? "1":"0");
					outComeInfoMap.put("AORTIC_ANEURYSM", "7".equals(hbz)? "1":"0");
					outComeInfoMap.put("COPD", "8".equals(hbz)? "1":"0");
					outComeInfoMap.put("CHRONIC_KIDNEY_DISEASE", "9".equals(hbz)? "1":"0");
					outComeInfoMap.put("ANEMIA", "10".equals(hbz)? "1":"0");
					outComeInfoMap.put("PEPTIC_ULCER", "11".equals(hbz)? "1":"0");
					outComeInfoMap.put("THYROID_DISEASE", "12".equals(hbz)? "1":"0");
					outComeInfoMap.put("THERIOMA", "13".equals(hbz)? "1":"0");
					//检查结果
					//72h内肌钙蛋白
					outComeInfoMap.put("TROPONIN_72H", xtzlMap.get("JGDB72"));
					if(isnot(xtzlMap.get("JGDB72"))){
						outComeInfoMap.put("TROPONIN_72H_TYPE", xtzlMap.get("JGDB72LX"));
						outComeInfoMap.put("CTNI_MAX_VALUE", xtzlMap.get("JGDB72ZGZ"));
						outComeInfoMap.put("CTNI_MAX_VALUE_UNIT", xtzlMap.get("JGDB72DW"));
					}
					//脑钠肽BNP
					outComeInfoMap.put("BNP", xtzlMap.get("NNT"));
					if(isnot(xtzlMap.get("NNT"))){
						outComeInfoMap.put("BNP_TYPE", xtzlMap.get("NNTLX"));
						outComeInfoMap.put("BNP_VALUE", xtzlMap.get("NNTZGZ"));
					}
					//总胆固醇(TC) 
					outComeInfoMap.put("TC", xtzlMap.get("ZDGC"));
					if(isnot(xtzlMap.get("ZDGC")))
						outComeInfoMap.put("TC_VALUE", xtzlMap.get("ZDGCSZ"));
					//甘油三酯(TG)
					outComeInfoMap.put("TG", xtzlMap.get("GYSZ"));
					if(isnot(xtzlMap.get("GYSZ")))
						outComeInfoMap.put("TG_VALUE", xtzlMap.get("GYSZSZ"));
					//高密度脂蛋白(HDL-C)
					outComeInfoMap.put("HDL_C", xtzlMap.get("GMDZDB"));
					if(isnot(xtzlMap.get("ZDGC")))
						outComeInfoMap.put("HDL_C_VALUE", xtzlMap.get("GMDZDBSZ"));
					//低密度脂蛋白(LDL-C)
					outComeInfoMap.put("LDL_C", xtzlMap.get("DMDZDB"));
					if(isnot(xtzlMap.get("ZDGC")))
						outComeInfoMap.put("LDL_C_VALUE", xtzlMap.get("DMDZDBSZ"));
					//超声心动图
					outComeInfoMap.put("UCG", xtzlMap.get("CSXDT"));
					if(isnot(xtzlMap.get("CSXDT"))){
						outComeInfoMap.put("LVEF", xtzlMap.get("LVEF"));
						outComeInfoMap.put("VNTRICULAR_ANEURYSM", xtzlMap.get("SHIBL"));
						outComeInfoMap.put("PART_VNTRICULAR", xtzlMap.get("JBSBHDYC"));
					}
				}
			}
			if("6".equals(cyzd))
				outComeInfoMap.put("NACS_TYPE", xtzlMap.get("ZGQTFXYXXTLX"));
			if("9".equals(cyzd))
				outComeInfoMap.put("OTHER_NACS_TYPE", xtzlMap.get("ZGQTFXYXXTLX"));
			
			//出院信息
			outComeInfoMap.put("HOD", xtzlMap.get("ZYTS"));
			outComeInfoMap.put("TOTAL_COST", xtzlMap.get("FEIY"));
			outComeInfoMap.put("OUTCOME_CODE", xtzlMap.get("HZZG"));
			if("1".contentEquals(xtzlMap.get("HZZG"))){
				outComeInfoMap.put("LEAVE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CYSJ"))));
				outComeInfoMap.put("TREATMENT_RESULT_CODE", xtzlMap.get("ZLJG"));
			}
			if("2".contentEquals(xtzlMap.get("HZZG"))){
				outComeInfoMap.put("OUTDRUGDETAILS", xtzlMap.get("LKBYDMSJ"));//未完成
				outComeInfoMap.put("HAND_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LKBYDMSJ"))));
				outComeInfoMap.put("HOSPITAL_NAME", xtzlMap.get("YYMC02"));
				outComeInfoMap.put("IS_NET_HOSPITAL", xtzlMap.get("SFSWLYY"));
				outComeInfoMap.put("IS_TRANS_PCI", xtzlMap.get("ZYPCI02"));
				if(isnot(xtzlMap.get("ZYPCI02"))){
					outComeInfoMap.put("IS_DIRECT_CATHETER", xtzlMap.get("ZDDGS02"));
					outComeInfoMap.put("DECISION_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SJJRSSKSSJ"))));
				}
				outComeInfoMap.put("REMOTE_ECG_TRANSMISSION", xtzlMap.get("YCXDTCS02"));
				outComeInfoMap.put("TRANS_ECG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CSXDTZXZDWSJ"))));
				outComeInfoMap.put("TRANS_WAY", xtzlMap.get("ZGCSFS"));
				//文档和实际差异，实际无溶栓部分内容
			}
			if("3".contentEquals(xtzlMap.get("HZZG"))){
				outComeInfoMap.put("TRANSFER_DATE", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZKSJ"))));
				outComeInfoMap.put("ADMISSION_DEPT", xtzlMap.get("JZKS"));
				outComeInfoMap.put("TRANSFER_REASON", xtzlMap.get("ZKYYMS"));
			}
			if("4".contentEquals(xtzlMap.get("HZZG"))){
				outComeInfoMap.put("DEATH_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SWSJ"))));
				outComeInfoMap.put("DEATH_CAUSE_CODE", xtzlMap.get("JZKS"));
				outComeInfoMap.put("TRANSFER_REASON", xtzlMap.get("SWYY"));
				outComeInfoMap.put("DEATH_CAUSE_DESC", xtzlMap.get("SWMS"));
			}else{
				outComeInfoMap.put("MISSION_EDUCATION", (""+xtzlMap.get("ZGHZQKBZ")).replaceAll(",", "|"));
			}
			//患者情况备注
			outComeInfoMap.put("REMARK", xtzlMap.get("LYXJ"));
			outComeInfoMap.put("COVID19", xtzlMap.get("COVID19"));
			
			//住院期间用药未完成
			
			//出院带药未完成
			outComeInfoMap.put("TYPE", xtzlMap.get("COVID19"));
			
			
			
		}
		
		
		
		
		
		return null;
	}
	
	//STEMI 再灌注措施
	public void zgzcs(Map<String,Object> treatmentInfoMap,
						Map<String,String> xtzlMap){
		//再灌注措施
		treatmentInfoMap.put("STEMI_MEASURES", xtzlMap.get("ZGZCS"));
		//STEMI-有再灌注-溶栓
		if("2".equals(xtzlMap.get("ZGZCS"))){
			//再灌注溶栓措施
			treatmentInfoMap.put("STEMI_MEASURES_THROMBOLYSIS", xtzlMap.get("ZGZRSCS"));
			treatmentInfoMap.put("STEMI_SCREENING", xtzlMap.get("YNRSSC"));
			if("2".equals(xtzlMap.get("YNRSSC"))){
				treatmentInfoMap.put("STEMI_THROM_CONTRAINDICATION", xtzlMap.get("YNCZJJZ"));
			}else if("1".equals(xtzlMap.get("YNRSSC"))){
				treatmentInfoMap.put("STEMI_IS_THROMBOLYSIS", xtzlMap.get("YNRSZL"));
				if(isnot(xtzlMap.get("YNRSZL"))){
					treatmentInfoMap.put("STEMI_IS_DIRECT", xtzlMap.get("YNZDRSCS"));
					treatmentInfoMap.put("STEMI_DIAGNOSIS_UNIT_CODE_DT", xtzlMap.get("YNRSCS"));
					treatmentInfoMap.put("STEMI_THROM_START_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSZQTYSJ"))));
					treatmentInfoMap.put("STEMI_THROM_SIGN_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNQSZQTYSSJ"))));
					treatmentInfoMap.put("STEMI_THROM_START_TIME_DT", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNKSRSSJ"))));
					treatmentInfoMap.put("STEMI_THROM_END_TIME_DT", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNRSJSSJ"))));
					treatmentInfoMap.put("STEMI_THROM_DRUG_TYPE_DT", xtzlMap.get("YNYW"));
					treatmentInfoMap.put("STEMI_THROM_DRUG_CODE_DT", xtzlMap.get("YNJL"));
					treatmentInfoMap.put("STEMI_IS_REPATENCY_DT", xtzlMap.get("YNRSZT"));
				}
			}
			
		}
		if("1".equals(xtzlMap.get("ZGZCS"))){
			treatmentInfoMap.put("STEMI_MEASURES_DOCTOR_NAME", xtzlMap.get("JDXPCIYS"));
			
			treatmentInfoMap.put("STEMI_START_CONDUIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("QDDGSSJ"))));
			treatmentInfoMap.put("STEMI_START_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSZQTYSJ"))));
			treatmentInfoMap.put("STEMI_SIGN_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("QSZQTYSJ"))));
		}
		if("1".equals(xtzlMap.get("ZGZCS"))
				||"3".equals(xtzlMap.get("ZGZCS"))
				||("2".equals(xtzlMap.get("ZGZCS"))&&"2".equals(xtzlMap.get("ZGZRSCS")))){
			//决定介入手术时间
			treatmentInfoMap.put("STEMI_DECISION_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDJRSSSJ"))));
		}
		if("3".equals(xtzlMap.get("ZGZCS"))
				||("2".equals(xtzlMap.get("ZGZCS"))&&"2".equals(xtzlMap.get("ZGZRSCS")))){
			//造影开始时间
			treatmentInfoMap.put("STEMI_START_RADIOGRAPHY_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZYKSSJ"))));
		}
		//CABG
		if("4".equals(xtzlMap.get("ZGZCS"))){
			treatmentInfoMap.put("STEMI_DECISION_CABG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDCABGSJ"))));
			treatmentInfoMap.put("STEMI_START_CABG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSCABGSJ"))));
		}
		
	}
	
	public String ynfb(){

		return null;
	}
	/**
	 * 判断是否为1
	 * @param v
	 * @return
	 */
	public boolean isnot(String v){
		return "1".equals(v);
	}
	
	
	public static void main(String[] args) throws  Exception {
		//ecg文件编码
//		File file = new File("E:/work/浙江医院/3.jpg");
//		String encodeImg = ImageUtils.encodeImgageToBase64(file);
//		File data = new File("E:/work/浙江医院/data.txt");
//		if(!data.exists())
//				data.createNewFile();
//		FileOutputStream fos = new FileOutputStream(data);
//		fos.write(encodeImg.getBytes());
//		fos.close();
		Map<String,String> xtzlMap = new HashMap<String, String>();
		Map<String, List<Map<String,String>>> crfplaneMap = new HashMap<String, List<Map<String,String>>>();
		Map<String,Object> registerInfoMap = new HashMap<String, Object>();
		registerInfoMap.put("REGISTER_ID",null);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);
		System.out.println(JSON.toJSONString(registerInfoMap));
		List<InputStream> isList = new ArrayList<InputStream>();
	}

}
