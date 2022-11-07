package activetech.edpc.service.impl;

import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.aid.dao.mapper.AidPatientXtMapper;
import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.base.dao.mapper.DstarchivesMapper;
import activetech.base.dao.mapper.DstdictinfoCustomMapper;
import activetech.base.dao.mapper.HspAddrPostMapper;
import activetech.base.pojo.domain.Dstarchives;
import activetech.base.pojo.domain.DstarchivesExample;
import activetech.base.process.context.Config;
import activetech.base.process.context.CpcConfig;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.util.MinIoUtil;
import activetech.edpc.dao.mapper.*;
import activetech.edpc.pojo.domain.*;
import activetech.edpc.pojo.dto.HspDbzlBasCustom;
import activetech.edpc.service.CpcCrfplaneService;
import activetech.external.dao.mapper.HspEcgInfMapper;
import activetech.external.pojo.domain.HspEcgInf;
import activetech.external.pojo.domain.HspEcgInfExample;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.dao.mapper.HspMewsInfMapper;
import activetech.hospital.dao.mapper.HspemginfCustomMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.util.DateUtil;
import activetech.util.StringUtils;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsCustomMapper;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import sun.misc.BASE64Encoder;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.*;


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
	@Autowired
	private HspAddrPostMapper hspAddrPostMapper;
	@Autowired
	private HspXtAddMapper hspXtAddMapper;
	@Autowired
	private HspEcgInfMapper hspEcgInfMapper;
	@Autowired
	private HspCrivelInfMapperCustom hspCrivelInfMapperCustom;


	@Autowired
	private HspDbzlBasMapperCustom hspDbzlBasMapperCustom;

	@Override
	public ResultInfo cpcCrfplane(String emgNo, String patFlg) {
		// TODO Auto-generated method stub
		//胸痛信息map
		Map<String, String> xtzlMap = new HashMap<String, String>();
		HspXtzlInfExample hspXtzlInfExample = new HspXtzlInfExample();
		HspXtzlInfExample.Criteria criteria = hspXtzlInfExample.createCriteria();
		criteria.andEmgNoEqualTo(emgNo);
		List<HspXtzlInf> list = hspXtzlInfMapper.selectByExample(hspXtzlInfExample);
		for (HspXtzlInf hspXtzlInf : list) {
			xtzlMap.put(hspXtzlInf.getProCode(), hspXtzlInf.getProVal());
		}
		if ("".equals(patFlg)) {

		} else if ("".equals(patFlg)) {

		} else if ("".equals(patFlg)) {

		}
		return null;
	}

	public ResultInfo registerInfoCrfplane(String emgNo) throws Exception {
		//胸痛信息map
		//emgNo="SD20220920295256";

		Map<String, String> xtzlMap = new HashMap<String, String>();
		HspXtzlInfExample hspXtzlInfExample = new HspXtzlInfExample();
		HspXtzlInfExample.Criteria criteria = hspXtzlInfExample.createCriteria();
		criteria.andEmgNoEqualTo(emgNo);
		List<HspXtzlInf> list2 = hspXtzlInfMapper.selectByExample(hspXtzlInfExample);
		for (HspXtzlInf hspXtzlInf : list2) {
			xtzlMap.put(hspXtzlInf.getProCode(), hspXtzlInf.getProVal());
		}
//----------------------------------------------------------------------------------------------
	/*	HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgNo);
		HspMewsInf hspMewsInf = hspMewsInfMapper.selectByPrimaryKey(emgNo);
		AidPatient aidPatient = null;
		AidPatientXt aidPatientXt = null;
		if (StringUtils.isNotNullAndEmptyByTrim(hspEmgInf.getPatid())) {
			aidPatient = aidPatientMapper.selectByPrimaryKey(hspEmgInf.getPatid());
			aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(hspEmgInf.getPatid());
		}*/


		HspDbzlBas hspDbzlBas =hspDbzlBasMapperCustom.selectByPrimaryByEmgSeq(emgNo);

		JSONObject root = new JSONObject();


		//人口基本信息
		JSONObject registerInfoMap = new JSONObject();

        //registerInfoMap  start ----------------------------------------------------------
		registerInfoMap.put("REGISTER_ID", hspDbzlBas.getSmtSeq() == null ?"": hspDbzlBas.getSmtSeq()); ////注册编号  fei  上报填写后返回  id 用于后续 修改提交等操作
		registerInfoMap.put("HOSPITAL_ID", CpcConfig.HOSPITAL_ID);//医院 ID  bi
		registerInfoMap.put("NAME", hspDbzlBas.getCstNam());//姓名 bi
		registerInfoMap.put("GENDER", "0".equals(hspDbzlBas.getCstSexCod()) ? "1" : "2"); //性别 bi
		registerInfoMap.put("AGE", "0".equals(hspDbzlBas.getCstAgeCod()) ? hspDbzlBas.getCstAge() : "0");//年龄 bi
		registerInfoMap.put("BIRTHDAY", DateUtil.getDateStrT(hspDbzlBas.getBthDat())); //出生日期 fei
		registerInfoMap.put("NATION", hspDbzlBas.getNation());//  民族 fei
		registerInfoMap.put("CONTACT_PHONE", hspDbzlBas.getPheNbr());  //联系电话  fei
		//默认身份证
		registerInfoMap.put("CREDENTIALS_TYPE", "1");  //证件类型   前段默认 身份证 1  怒能修改  bi
		if(!"0".equals(registerInfoMap.get("CREDENTIALS_TYPE"))  &&  registerInfoMap.get("CREDENTIALS_TYPE") != null){
			registerInfoMap.put("IDCARD", hspDbzlBas.getIdNbr());// 证件号  bi  hspEmgInf.getIdNbr()
		}

		//--add start
		registerInfoMap.put("JOB", hspDbzlBas.getEmgJob());  //职业 fei
		registerInfoMap.put("CULTUREDEGREE", hspDbzlBas.getCstEdu());// 文化程度 fei
		registerInfoMap.put("MARITALSTATUS", hspDbzlBas.getMaritalStatus());// 婚姻状况 fei
		registerInfoMap.put("HEIGHT", hspDbzlBas.getPatHgt());//身高 fei
		registerInfoMap.put("WEIGHT", hspDbzlBas.getPatWgt());//体重 fei
		//-- add end
		registerInfoMap.put("STATUS", 1);  //  测试写死 ，实际 前段根据点击按钮  获取什么状态
		registerInfoMap.put("FILLIN_PERSON", CpcConfig.FILLIN_PERSON);//填报人
		registerInfoMap.put("SUBMIT_AUDIT_PERSON", CpcConfig.SUBMIT_AUDIT_PERSON);//提交审核人
		registerInfoMap.put("AUDITOR", CpcConfig.AUDITOR);//审核人
		registerInfoMap.put("ARCHIVING_PERSON", CpcConfig.ARCHIVING_PERSON);//存档人
		root.put("RegisterInfo", registerInfoMap);


//registerInfoMap end ------------------------------------------------------------------------------
		//急救信息
		JSONObject firstAIDInfoMap = new JSONObject();
//firstAIDInfoMap  start-------------------------------------------------------------------------------------------------
		firstAIDInfoMap.put("INPATIENT_ID", "");//住院ID fei
		firstAIDInfoMap.put("OUTPATIENT_ID", hspDbzlBas.getMpi());
		firstAIDInfoMap.put("ATTACK_TIME", "");//发病时间 bi  DateUtil.getDateStrT(aidPatient.getIllTim())
		firstAIDInfoMap.put("IS_NULL_ATTACK_DETAIL_TIME", "");//发病时间无法精确到分钟
		firstAIDInfoMap.put("ATTACK_ZONE", "");//发病区间 bi
		firstAIDInfoMap.put("PROVINCE", "");//发病地址（省） fei  上传 需中文 否则 报错
		firstAIDInfoMap.put("CITY", "");//发病地址（市） fei       上传 需中文 否则 报错
		firstAIDInfoMap.put("AREA", "");//发病地址（区/县）fei      上传 需中文 否则 报错
		firstAIDInfoMap.put("ATTACK_ADDRESS", "");//发病详细地址fei
		firstAIDInfoMap.put("MEDICAL_INSURANCE_TYPE", "");//医保类型 fei
		firstAIDInfoMap.put("MEDICAL_INSURANCE_NO", "");//医保编号 fei
		firstAIDInfoMap.put("SERIOUS_ILLNESS_INSURANCE", xtzlMap.get("DBYB"));//大病医保 fei

		//清醒程度急诊编码不一致，+1处理
		firstAIDInfoMap.put("CONSCIOUSNESS_TYPE", xtzlMap.get("YISHI"));//意识
		firstAIDInfoMap.put("RESPIRATION_RATE", xtzlMap.get("HUXI"));//呼吸
		firstAIDInfoMap.put("PULSE_RATE", xtzlMap.get("MAIB"));//脉搏
		firstAIDInfoMap.put("HEART_RATE", xtzlMap.get("XINL"));//预检时暂只有脉搏  心率
		firstAIDInfoMap.put("BLOOD_PRESSURE", xtzlMap.get("XUEY"));//血压
		firstAIDInfoMap.put("TEMPERATURE", xtzlMap.get("TIWEN"));  // 体温

		if(xtzlMap.get("BQPG") !=null) {
			firstAIDInfoMap.put("DISTRESS_CASE", Integer.parseInt(xtzlMap.get("BQPG")));//病情评估填写不正确,取值范围[1,2,3];
		}

		firstAIDInfoMap.put("DISTRESS_CASE_DETAIL","");//初始化用
		if(xtzlMap.get("BQPGMX") != null){
			firstAIDInfoMap.put("DISTRESS_CASE_DETAIL",xtzlMap.get("BQPGMX").replace(",", "|")); //xtzlMap.get("BQPGMX").replace(",", "|")
		}

		firstAIDInfoMap.put("CW_COMING_WAY_CODE", "");
		//呼叫(120/999或其他)出车 --下面有
		firstAIDInfoMap.put("CW_120_AMBULANCE_DEPARTMENT", "");
		firstAIDInfoMap.put("CW_120_HELP_TIME", "");
		firstAIDInfoMap.put("CW_120_ARRIVED_HOSPITAL_TIME", "");
		firstAIDInfoMap.put("CW_120_IS_TRANS_HOSPITAL", "");
		firstAIDInfoMap.put("CW_120_FIRST_MC_TIME", "");
		firstAIDInfoMap.put("CW_120_FIRST_DOCTOR_TIME", "");
		firstAIDInfoMap.put("CW_120_FIRST_DOCTOR_NAME", "");
		//转院（包含任何机构）
		firstAIDInfoMap.put("CW_ZY_TRANS_TYPE", "");
		firstAIDInfoMap.put("CW_ZY_TRANS_HOSPITAL_NAME", "");
		firstAIDInfoMap.put("CW_ZY_FIRST_MC_TIME", "");
		firstAIDInfoMap.put("CW_ZY_OUTHOSPITAL_VISIT_TIME", "");
		firstAIDInfoMap.put("CW_ZY_TRANSFER_TIME", "");
		firstAIDInfoMap.put("CW_ZY_LEAVE_OUTHOSPITAL_TIME", "");
		firstAIDInfoMap.put("CW_ZY_ADMISSION_TIME", "");
		firstAIDInfoMap.put("CW_ZY_FIRST_DOCTOR_NAME", "");
		//自行来院
		firstAIDInfoMap.put("CW_ZXLY_ARRIVED_HOSPITAL_TIME", "");
		firstAIDInfoMap.put("CW_ZXLY_FIRST_MC_TIME", "");
		firstAIDInfoMap.put("CW_ZXLY_FIRST_DOCTOR_TIME", "");
		firstAIDInfoMap.put("CW_ZXLY_FIRST_DOCTOR_NAME", "");
		//院内病发 --下面有
		firstAIDInfoMap.put("CW_YNFB_ATTACK_DEPARTMENT", "");
		firstAIDInfoMap.put("CW_YNFB_FIRST_MC_TIME", "");
		firstAIDInfoMap.put("CW_YNFB_CONSULTATION_TIME", "");
		firstAIDInfoMap.put("CW_YNFB_LEAVE_DEPARTMENT_TIME", "");
		firstAIDInfoMap.put("CW_YNFB_FIRST_DOCTOR_NAME", "");

		//院前溶栓治疗
		firstAIDInfoMap.put("SCREENING", "");
		firstAIDInfoMap.put("THROM_CONTRAINDICATION", "");
		firstAIDInfoMap.put("IS_THROMBOLYSIS", "");
		firstAIDInfoMap.put("IS_DIRECT", "");
		firstAIDInfoMap.put("THROM_TREATMENT_PLACE", "");
		firstAIDInfoMap.put("START_AGREE_TIME", "");
		firstAIDInfoMap.put("SIGN_AGREE_TIME", "");
		firstAIDInfoMap.put("THROM_START_TIME", "");
		firstAIDInfoMap.put("THROM_END_TIME", "");
		firstAIDInfoMap.put("THROM_DRUG_TYPE", "");
		firstAIDInfoMap.put("THROM_DRUG_CODE", "");
		firstAIDInfoMap.put("IS_REPATENCY", "");
		firstAIDInfoMap.put("START_RADIOGRAPHY_TIME", "");
		firstAIDInfoMap.put("IS_REPCI", "");
		firstAIDInfoMap.put("OPERATION_TIME", "");
		firstAIDInfoMap.put("HOSPITAL_POSITION", "");
		//患者情况备注
		firstAIDInfoMap.put("PATIENT_REMARK", xtzlMap.get("YQHZQKBZ"));


		/*if (aidPatient != null && aidPatientXt != null) {*/
		if(xtzlMap.get("FBSJ") != null){
			firstAIDInfoMap.put("ATTACK_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("FBSJ"))));//发病时间
		}

			firstAIDInfoMap.put("IS_NULL_ATTACK_DETAIL_TIME",xtzlMap.get("FBSJWFJQDFZ"));
			if (isnot(xtzlMap.get("FBSJWFJQDFZ"))) {
				firstAIDInfoMap.put("ATTACK_ZONE", xtzlMap.get("FBQJ"));
			}

			String PROVINCE_name = xtzlMap.get("FBDZ01") == null?
					"":hspAddrPostMapper.selectByPrimaryKey(xtzlMap.get("FBDZ01")).getAddrName();
			String CITY_name = xtzlMap.get("FBDZ02") == null?
					"":hspAddrPostMapper.selectByPrimaryKey(xtzlMap.get("FBDZ02")).getAddrName();
			String AREA_name = xtzlMap.get("FBDZ03") == null?
					"":hspAddrPostMapper.selectByPrimaryKey(xtzlMap.get("FBDZ03")).getAddrName();
			//编码表还没调整 调整完之后打开
			System.out.println("AREA_name"+ "-------------"+PROVINCE_name);
			firstAIDInfoMap.put("PROVINCE", PROVINCE_name);//省
			firstAIDInfoMap.put("CITY", CITY_name);//市
			firstAIDInfoMap.put("AREA", AREA_name);//区\县

		    firstAIDInfoMap.put("ATTACK_ADDRESS",xtzlMap.get("XXDZ") );//纤细地址

			firstAIDInfoMap.put("MEDICAL_INSURANCE_TYPE", xtzlMap.get("YBLX"));//医保类型填写不正确,取值范围[1,2,3,4,5];
			firstAIDInfoMap.put("MEDICAL_INSURANCE_NO", xtzlMap.get("YBBH"));//医保编号
			firstAIDInfoMap.put("CW_COMING_WAY_CODE", xtzlMap.get("DYFS"));//来院方式

			String ddfs = xtzlMap.get("DYFS");
			//1:呼叫（120 或其他）出车2:转院（包含任何机构）3:自行来院4:院内发病
			if (isnot(ddfs)) {
				firstAIDInfoMap.put("CW_120_AMBULANCE_DEPARTMENT", xtzlMap.get("CCDW"));// bi   页面没出存该字段 单位空也没上传报错
				if(xtzlMap.get("HJSJ") != null){
					firstAIDInfoMap.put("CW_120_HELP_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("HJSJ")))); //bi
				}
				if(xtzlMap.get("DDYYDMSJ01") != null) {
					//到达大门时间 DDYYDMSJ01
					firstAIDInfoMap.put("CW_120_ARRIVED_HOSPITAL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("DDYYDMSJ01")))); //bi  //aidPatient.getAahtime()
				}
				//直接转送上级医院
				firstAIDInfoMap.put("CW_120_IS_TRANS_HOSPITAL", xtzlMap.get("ZJZSSJYY") == null ? "0" : xtzlMap.get("ZJZSSJYY"));//bi
				//直达导管室
				if ("1".equals(xtzlMap.get("ZJZSSJYY"))) {
					firstAIDInfoMap.put("CW_120_IS_DIRECT_CONDUIT_ROOM", isnot(xtzlMap.get("ZJZSSJYY")) ? xtzlMap.get("ZDDGS") : "0");
				}
				if(xtzlMap.get("SCYLJCSJ") != null){
					firstAIDInfoMap.put("CW_120_FIRST_MC_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SCYLJCSJ"))));//bi  //
				}
				if(xtzlMap.get("YNSZYSJZSJ")!= null) {
					firstAIDInfoMap.put("CW_120_FIRST_DOCTOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNSZYSJZSJ"))));//bi
				}
				firstAIDInfoMap.put("CW_120_FIRST_DOCTOR_NAME", xtzlMap.get("YHRY"));//医护人员 YHRY

			} else if ("2".equals(ddfs)) {
				//获取网络医院名称
				firstAIDInfoMap.put("CW_ZY_TRANS_TYPE", xtzlMap.get("ZYLX"));
				firstAIDInfoMap.put("CW_ZY_TRANS_HOSPITAL_NAME", xtzlMap.get("YYMC"));//医院名称 fei
				if(xtzlMap.get("SCYLJCSJ") != null){
					firstAIDInfoMap.put("CW_ZY_FIRST_MC_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SCYLJCSJ"))));//bi
				}
				if(xtzlMap.get("ZCYYRMSJ") != null) {
					firstAIDInfoMap.put("CW_ZY_OUTHOSPITAL_VISIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCYYRMSJ"))));//bi
				}
				//直接转送上级医院  //接口没有该字段 ，但该字段必填
				firstAIDInfoMap.put("CW_ZY_IS_TRANS_HOSPITAL", xtzlMap.get("ZJZSSJYY") == null ? "0" : xtzlMap.get("ZJZSSJYY"));//bi
				//直达导管室
				if ("1".equals(xtzlMap.get("ZJZSSJYY"))) {
					firstAIDInfoMap.put("CW_ZY_IS_DIRECT_CONDUIT_ROOM", isnot(xtzlMap.get("ZJZSSJYY")) ? xtzlMap.get("ZDDGS") : "0");
				}
				if(xtzlMap.get("JDZYSJ") != null) {
					firstAIDInfoMap.put("CW_ZY_TRANSFER_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDZYSJ"))));//bi
				}
				if(xtzlMap.get("ZCYJCMSJ") != null) { //ZCYJCMSJ
					firstAIDInfoMap.put("CW_ZY_LEAVE_OUTHOSPITAL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCYJCMSJ"))));//bi
				}
				if(xtzlMap.get("DDYYDMSJ02") != null) { //DDYYDMSJ02
					firstAIDInfoMap.put("CW_ZY_ARRIVED_HOSPITAL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("DDYYDMSJ02"))));//bi  DateUtil.parseDateCom(xtzlMap.get("DDYYDMSJ"))
				}
				if(xtzlMap.get("YNJZSJ") != null) { //YNJZSJ
					firstAIDInfoMap.put("CW_ZY_ADMISSION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNJZSJ")))); //bi
				}
				firstAIDInfoMap.put("CW_ZY_FIRST_DOCTOR_NAME", xtzlMap.get("YHRY"));//xtzlMap.get("YNJZSJ")
			} else if ("3".equals(ddfs)) {
				if( xtzlMap.get("DDYYDMSJ03") != null) { //DDYYDMSJ03
					firstAIDInfoMap.put("CW_ZXLY_ARRIVED_HOSPITAL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("DDYYDMSJ03"))));// bi
				}
				if(xtzlMap.get("SCYLJCSJ") != null) {
					firstAIDInfoMap.put("CW_ZXLY_FIRST_MC_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SCYLJCSJ"))));//bi
				}
				if(xtzlMap.get("YNSZYSJZSJ") != null) {
					firstAIDInfoMap.put("CW_ZXLY_FIRST_DOCTOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNSZYSJZSJ")))); //首诊医师接诊时间  bi
				}
				firstAIDInfoMap.put("CW_ZXLY_FIRST_DOCTOR_NAME", xtzlMap.get("YHRY"));//
			} else if ("4".equals(ddfs)) {

				firstAIDInfoMap.put("CW_YNFB_ATTACK_DEPARTMENT", xtzlMap.get("FBKS"));//发病地点  bi FBKS
				if(xtzlMap.get("SCYLJCSJ") != null) {
					firstAIDInfoMap.put("CW_YNFB_FIRST_MC_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SCYLJCSJ"))));//本次发病后首次医疗接触时间 bi
				}
				firstAIDInfoMap.put("CW_YNFB_CONSULTATION_TIME", null);// 接口有参数，文档没这参数 bi
				if(DateUtil.parseDateCom(xtzlMap.get("LKKSSJ")) != null) { //LKKSSJ
					firstAIDInfoMap.put("CW_YNFB_LEAVE_DEPARTMENT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LKKSSJ"))));//离开发病现场时间
				}
				firstAIDInfoMap.put("CW_YNFB_FIRST_DOCTOR_NAME", xtzlMap.get("YHRY"));//本次发病后首次医疗接触人员 bi

			}


			if ("2".equals(ddfs) || isnot(ddfs)) {
				firstAIDInfoMap.put("SCREENING", xtzlMap.get("YQRSSC"));//溶栓筛查
				if ("2".equals(xtzlMap.get("YQRSSC"))) {
					firstAIDInfoMap.put("THROM_CONTRAINDICATION", xtzlMap.get("YQCZJJZ"));//存在禁忌症
				}
				if (isnot(xtzlMap.get("YQRSSC"))) {
					//溶栓有无
					firstAIDInfoMap.put("IS_THROMBOLYSIS", xtzlMap.get("YQRSZL"));//溶栓治疗
					//溶栓 有
					if (isnot(xtzlMap.get("YQRSZL"))) {
						firstAIDInfoMap.put("IS_DIRECT", xtzlMap.get("YQZDRSCS"));

						/*Map<String, String> YQRSCS_map = new HashMap<String, String>();
						YQRSCS_map.put("0","1");
						YQRSCS_map.put("1","2");*/

						firstAIDInfoMap.put("THROM_TREATMENT_PLACE", xtzlMap.get("YQRSCS"));//xtzlMap.get("YQRSCS")

						if(xtzlMap.get("YQKSZQTYSJ")!= null) { //YQKSZQTYSJ
							firstAIDInfoMap.put("START_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQKSZQTYSJ"))));//ZQTYKS
						}

						if(xtzlMap.get("YQQSZQTYSSJ") != null) {
							firstAIDInfoMap.put("SIGN_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQQSZQTYSSJ"))));//QSZQTY
						}
						if(xtzlMap.get("YQKSRSSJ") != null) {
							firstAIDInfoMap.put("THROM_START_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQKSRSSJ"))));//RSKS
						}
						if(xtzlMap.get("YQRSJSSJ") != null) {
							firstAIDInfoMap.put("THROM_END_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQRSJSSJ"))));//RSJS
						}

						firstAIDInfoMap.put("THROM_DRUG_TYPE", xtzlMap.get("YQRSYW"));

				/*		Map<String, String> YQJL_map = new HashMap<String, String>();
						YQJL_map.put("0","1");
						YQJL_map.put("1","2");*/

						firstAIDInfoMap.put("THROM_DRUG_CODE", xtzlMap.get("YQRSYWJL"));

						firstAIDInfoMap.put("IS_REPATENCY", xtzlMap.get("YQRSZT"));
						if (isnot(xtzlMap.get("YQRSZT"))) {
							if(xtzlMap.get("YQRSHZYSJ") != null){
								firstAIDInfoMap.put("START_RADIOGRAPHY_TIME",
										DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQRSHZYSJ"))));
							}

						} else if ("0".equals(xtzlMap.get("YQRSZT"))) {
							firstAIDInfoMap.put("IS_REPCI", xtzlMap.get("YQBJPCI"));
							if (isnot(xtzlMap.get("YQBJPCI"))) {
								if(xtzlMap.get("YQSJSSSJ") != null) {
									firstAIDInfoMap.put("OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YQSJSSSJ"))));
								}
								firstAIDInfoMap.put("HOSPITAL_POSITION", xtzlMap.get("YQSSDD"));
							}
						}
					}
				}


			}
		/*}*/

		root.put("FirstAIDInfo", firstAIDInfoMap);

		//胸痛诊疗
		JSONObject treatmentInfoMap = new JSONObject();
		treatmentInfoMap.put("HAS_ECG_IMAGE", "");
		treatmentInfoMap.put("NO_ECG_IMAGE_REASON", "");

		//treatmentInfoMap.put("ECGS", "");

		treatmentInfoMap.put("REMOTE_ECG_TRANSMISSION", "");
		treatmentInfoMap.put("TRAN_TIME", "");
		treatmentInfoMap.put("IS_REMOTE_ECGTRAN", "");
		treatmentInfoMap.put("IS_CTNT", "");

		treatmentInfoMap.put("CTNTS", "");

		treatmentInfoMap.put("IS_CR", "");
		treatmentInfoMap.put("CR_VALUE", "");
		treatmentInfoMap.put("IS_Ddimer", "");
		treatmentInfoMap.put("Ddimer_VALUE", "");
		treatmentInfoMap.put("Ddimer_UNIT", "");
		treatmentInfoMap.put("IS_BNP", "");
		treatmentInfoMap.put("BNP_VALUE", "");
		treatmentInfoMap.put("IS_NTproBNP", "");
		treatmentInfoMap.put("NTproBNP_VALUE", "");
		treatmentInfoMap.put("IS_MYO", "");
		treatmentInfoMap.put("MYO_VALUE", "");
		treatmentInfoMap.put("MYO_UNIT", "");
		treatmentInfoMap.put("IS_CKMB", "");
		treatmentInfoMap.put("CKMB_VALUE", "");
		treatmentInfoMap.put("CKMB_UNIT", "");
		treatmentInfoMap.put("IS_NOTICE_IMCD", "");
		treatmentInfoMap.put("IMCD_TYPE", "");
		treatmentInfoMap.put("NOTICE_IMCD_TIME", "");
		treatmentInfoMap.put("CONSULTATION_TIME", "");
		treatmentInfoMap.put("CP_DIAGNOSIS_CODE", "");
		treatmentInfoMap.put("STEMI_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("STEMI_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("STEMI_DOCTOR_NAME", "");
		treatmentInfoMap.put("STEMI_KILLIP_LEVEL", "");
		treatmentInfoMap.put("STEMI_IS_BYPASS_EMERGENCY", "");
		treatmentInfoMap.put("STEMI_IS_BYPASS_CCU", "");
		treatmentInfoMap.put("STEMI_IS_DRUG", "");
		treatmentInfoMap.put("STEMI_ASPIRIN_DOSE", "");
		treatmentInfoMap.put("STEMI_ASPIRIN_TIME", "");
		treatmentInfoMap.put("STEMI_CLOPIDOGREL_DOSE", "");
		treatmentInfoMap.put("STEMI_CLOPIDOGREL_TIME", "");
		treatmentInfoMap.put("STEMI_TICAGRELOR_DOSE", "");
		treatmentInfoMap.put("STEMI_TICAGRELOR_TIME", "");
		treatmentInfoMap.put("STEMI_IS_ANTICOAGULATION", "");
		treatmentInfoMap.put("STEMI_ANTICOAGULATION_DRUG", "");
		treatmentInfoMap.put("STEMI_ANTICOAGULATION_DOSE", "");
		treatmentInfoMap.put("STEMI_ANTICOAGULATION_UNIT", "");
		treatmentInfoMap.put("STEMI_ANTICOAGULATION_TIME", "");
		treatmentInfoMap.put("STEMI_INTENSIFY_STATINS_TREAT", "");
		treatmentInfoMap.put("STEMI_RECEPTOR_RETARDANT_USING", "");
		treatmentInfoMap.put("STEMI_IS_REPERFUSION", "");
		treatmentInfoMap.put("STEMI_NO_REPERFUSION_REASON", "");
		treatmentInfoMap.put("STEMI_MEASURES", "");
		treatmentInfoMap.put("STEMI_MEASURES_THROMBOLYSIS", "");
		treatmentInfoMap.put("STEMI_MEASURES_DOCTOR_NAME", "");
		treatmentInfoMap.put("STEMI_DECISION_OPERATION_TIME", "");
		treatmentInfoMap.put("STEMI_START_CONDUIT_TIME", "");
		treatmentInfoMap.put("STEMI_START_AGREE_TIME", "");
		treatmentInfoMap.put("STEMI_SIGN_AGREE_TIME", "");
		treatmentInfoMap.put("STEMI_START_RADIOGRAPHY_TIME", "");
		treatmentInfoMap.put("STEMI_DECISION_CABG_TIME", "");
		treatmentInfoMap.put("STEMI_START_CABG_TIME", "");
		treatmentInfoMap.put("STEMI_TPCI_TYPE", "");
		treatmentInfoMap.put("STEMI_SCREENING", "");
		treatmentInfoMap.put("STEMI_THROM_CONTRAINDICATION", "");
		treatmentInfoMap.put("STEMI_IS_THROMBOLYSIS", "");
		treatmentInfoMap.put("STEMI_IS_DIRECT", "");
		treatmentInfoMap.put("STEMI_DIAGNOSIS_UNIT_CODE_DT", "");
		treatmentInfoMap.put("STEMI_THROM_START_AGREE_TIME", "");
		treatmentInfoMap.put("STEMI_THROM_SIGN_AGREE_TIME", "");
		treatmentInfoMap.put("STEMI_THROM_START_TIME_DT", "");
		treatmentInfoMap.put("STEMI_THROM_END_TIME_DT", "");
		treatmentInfoMap.put("STEMI_THROM_DRUG_TYPE_DT", "");
		treatmentInfoMap.put("STEMI_THROM_DRUG_CODE_DT", "");
		treatmentInfoMap.put("STEMI_IS_REPATENCY_DT", "");
		treatmentInfoMap.put("NSTEMI_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("NSTEMI_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("NSTEMI_DOCTOR_NAME", "");
		treatmentInfoMap.put("NSTEMI_KILLIP_LEVEL", "");
		treatmentInfoMap.put("NSTEMI_IS_BYPASS_EMERGENCY", "");
		treatmentInfoMap.put("NSTEMI_IS_BYPASS_CCU", "");
		treatmentInfoMap.put("NSTEMI_IS_DRUG", "");
		treatmentInfoMap.put("NSTEMI_ASPIRIN_DOSE", "");
		treatmentInfoMap.put("NSTEMI_ASPIRIN_TIME", "");
		treatmentInfoMap.put("NSTEMI_CLOPIDOGREL_DOSE", "");
		treatmentInfoMap.put("NSTEMI_CLOPIDOGREL_TIME", "");
		treatmentInfoMap.put("NSTEMI_TICAGRELOR_DOSE", "");
		treatmentInfoMap.put("NSTEMI_TICAGRELOR_TIME", "");
		treatmentInfoMap.put("NSTEMI_IS_ANTICOAGULATION", "");
		treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_DRUG", "");
		treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_DOSE", "");
		treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_UNIT", "");
		treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_TIME", "");
		treatmentInfoMap.put("NSTEMI_INTENSIFY_STATINS_TREAT", "");
		treatmentInfoMap.put("NSTEMI_IS_BETA_BLOCKER", "");
		treatmentInfoMap.put("NSTEMI_GRACE_ESTIMATE", "");
		treatmentInfoMap.put("NSTEMI_GRACE_HR_CONDITION", "");
		treatmentInfoMap.put("NSTEMI_GRACE_VALUE", "");
		treatmentInfoMap.put("NSTEMI_RISK_LAMINATION", "");
		treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG", "");
		treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG_TIME", "");
		treatmentInfoMap.put("NSTEMI_STRATEGY", "");
		treatmentInfoMap.put("NSTEMI_INVASIVE_STRATEGY", "");
		treatmentInfoMap.put("NSTEMI_STRATEGY_DOCTOR_NAME", "");
		treatmentInfoMap.put("NSTEMI_DECISION_OPERATION_TIME", "");
		treatmentInfoMap.put("NSTEMI_START_CONDUIT_TIME", "");
		treatmentInfoMap.put("NSTEMI_START_AGREE_TIME", "");
		treatmentInfoMap.put("NSTEMI_SIGN_AGREE_TIME", "");
		treatmentInfoMap.put("NSTEMI_ACTUAL_INTERVENT_TIME", "");
		treatmentInfoMap.put("UA_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("UA_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("UA_DOCTOR_NAME", "");
		treatmentInfoMap.put("UA_KILLIP_LEVEL", "");
		treatmentInfoMap.put("UA_IS_BYPASS_EMERGENCY", "");
		treatmentInfoMap.put("UA_IS_BYPASS_CCU", "");
		treatmentInfoMap.put("UA_IS_DRUG", "");
		treatmentInfoMap.put("UA_ASPIRIN_DOSE", "");
		treatmentInfoMap.put("UA_ASPIRIN_TIME", "");
		treatmentInfoMap.put("UA_CLOPIDOGREL_DOSE", "");
		treatmentInfoMap.put("UA_CLOPIDOGREL_TIME", "");
		treatmentInfoMap.put("UA_TICAGRELOR_DOSE", "");
		treatmentInfoMap.put("UA_TICAGRELOR_TIME", "");
		treatmentInfoMap.put("UA_IS_ANTICOAGULATION", "");
		treatmentInfoMap.put("UA_ANTICOAGULATION_DRUG", "");
		treatmentInfoMap.put("UA_ANTICOAGULATION_DOSE", "");
		treatmentInfoMap.put("UA_ANTICOAGULATION_UNIT", "");
		treatmentInfoMap.put("UA_ANTICOAGULATION_TIME", "");
		treatmentInfoMap.put("UA_INTENSIFY_STATINS_TREAT", "");
		treatmentInfoMap.put("UA_RECEPTOR_RETARDANT_USING", "");
		treatmentInfoMap.put("UA_GRACE_ESTIMATE", "");
		treatmentInfoMap.put("UA_GRACE_HR_CONDITION", "");
		treatmentInfoMap.put("UA_GRACE_VALUE", "");
		treatmentInfoMap.put("UA_RISK_LAMINATION", "");
		treatmentInfoMap.put("UA_RISK_LAMINATION_AG", "");
		treatmentInfoMap.put("UA_RISK_LAMINATION_AG_TIME", "");
		treatmentInfoMap.put("UA_STRATEGY", "");
		treatmentInfoMap.put("UA_INVASIVE_STRATEGY", "");
		treatmentInfoMap.put("UA_STRATEGY_DOCTOR_NAME", "");
		treatmentInfoMap.put("UA_DECISION_OPERATION_TIME", "");
		treatmentInfoMap.put("UA_START_CONDUIT_TIME", "");
		treatmentInfoMap.put("UA_START_AGREE_TIME", "");
		treatmentInfoMap.put("UA_SIGN_AGREE_TIME", "");
		treatmentInfoMap.put("UA_ACTUAL_INTERVENTION_TIME", "");
		treatmentInfoMap.put("AD_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("AD_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("AD_DOCTOR_NAME", "");
		treatmentInfoMap.put("AD_IMG_EXAMINATION", "");
		treatmentInfoMap.put("AD_CT_NOTICE_TIME", "");
		treatmentInfoMap.put("AD_CT_FINISH_TIME", "");
		treatmentInfoMap.put("AD_CT_SCAN_TIME", "");
		treatmentInfoMap.put("AD_CT_REPORT_TIME", "");
		treatmentInfoMap.put("AD_NOTICE_CDU_TIME", "");
		treatmentInfoMap.put("AD_CDU_CHECK_TIME", "");
		treatmentInfoMap.put("AD_CHECK_RESULT_TIME", "");
		treatmentInfoMap.put("AD_IMCD_NOTICE_TIME", "");
		treatmentInfoMap.put("AD_ECC_CONSULTATION_TIME", "");
		treatmentInfoMap.put("AD_INTERLAYER_TYPE", "");
		treatmentInfoMap.put("AD_TREATMENT_STRATEGY_CODE", "");
		treatmentInfoMap.put("PE_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("PE_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("PE_DOCTOR_NAME", "");
		treatmentInfoMap.put("PE_IMG_EXAMINATION", "");
		treatmentInfoMap.put("PE_CT_NOTICE_TIME", "");
		treatmentInfoMap.put("PE_CT_FINISH_TIME", "");
		treatmentInfoMap.put("PE_CT_SCAN_TIME", "");
		treatmentInfoMap.put("PE_CT_REPORT_TIME", "");
		treatmentInfoMap.put("PE_RISK_LAMINATION", "");
		treatmentInfoMap.put("PE_ANTI_TREATMENT_TIME", "");
		treatmentInfoMap.put("PE_SCREENING", "");
		treatmentInfoMap.put("PE_THROM_CONTRAINDICATION", "");
		treatmentInfoMap.put("PE_IS_THROMBOLYSIS", "");
		treatmentInfoMap.put("NACS_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("NACS_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("NACS_DOCTOR_NAME", "");
		treatmentInfoMap.put("NACS_TYPE", "");
		treatmentInfoMap.put("NACS_TREATMENT_TYPE", "");
		treatmentInfoMap.put("NACS_PATIENT_REMARK", "");
		treatmentInfoMap.put("OTHER_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("OTHER_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("OTHER_DOCTOR_NAME", "");
		treatmentInfoMap.put("OTHER_TYPE", "");
		treatmentInfoMap.put("OTHER_TREATMENT_TYPE", "");
		treatmentInfoMap.put("OTHER_PATIENT_REMARK", "");
		treatmentInfoMap.put("AWAIT_GIVE_UP_TREATMENT", "");
		treatmentInfoMap.put("AWAIT_DIAGNOSIS_TIME", "");
		treatmentInfoMap.put("AWAIT_DOCTOR_NAME", "");
		treatmentInfoMap.put("AWAIT_TREATMENT_TYPE", "");
		treatmentInfoMap.put("AWAIT_PATIENT_REMARK", "");


//-----------------------------------------------------------
		//胸痛诊疗信息
		//心电图列表
		DstarchivesExample dstarchivesExample = new DstarchivesExample();
		DstarchivesExample.Criteria dstarchivesCriteria = dstarchivesExample.createCriteria();
		dstarchivesCriteria.andRefIdEqualTo(emgNo);
		dstarchivesCriteria.andFileTypeEqualTo("ecg");
		dstarchivesExample.setOrderByClause("crt_date desc");
		List<Dstarchives> ecgList = dstarchivesMapper.selectByExample(dstarchivesExample);

		String HAS_ECG_IMAGE = xtzlMap.get("XINDT");//ecgList.size() > 0 ? "1" : "0";  //有无心电图，根据患者 有无心电图附件 判定

		treatmentInfoMap.put("HAS_ECG_IMAGE", HAS_ECG_IMAGE);
		if ("0".equals(HAS_ECG_IMAGE)) {
			treatmentInfoMap.put("NO_ECG_IMAGE_REASON", xtzlMap.get("WHDYY"));
		} else {
			JSONArray ecgMap = new JSONArray();
			for (Dstarchives dstarchives : ecgList) {
				InputStream fileInputStream= MinIoUtil.getObject(dstarchives.getFileType(),dstarchives.getFileName());
				//  System.out.print("fileInputStream"+"--------------------"+fileInputStream);
				if (fileInputStream == null) {
					// throw new JieShouException("获取文件失败", 500);
				}
				BASE64Encoder encoder = new BASE64Encoder();
				String base64 = "data:image/jpeg;base64,"+encoder.encode(IOUtils.toByteArray(fileInputStream));
				//     System.out.print("aa"+"--------------------"+base64);

				JSONObject subecgMap = new JSONObject();
				if(dstarchives.getCrtDate() != null){
					subecgMap.put("ECG_TIME", DateUtil.getDateStrT(dstarchives.getCrtDate()));
				}

				if(dstarchives.getCrtDate() != null ){
					subecgMap.put("ECG_DIAGNOSE_TIME", DateUtil.getDateStrT(dstarchives.getCrtDate()));
				}


				subecgMap.put("ECGImageFiles",base64 );//dstarchives.getFileName()
				ecgMap.add(subecgMap);
			}
			treatmentInfoMap.put("ECGS", ecgMap);
		}

		//心电图

		treatmentInfoMap.put("REMOTE_ECG_TRANSMISSION", xtzlMap.get("YCXDTCS"));//远程心电图传输  xtzlMap.get("YCXDTCS")
		// System.out.println("YCXDTCS"+"-------"+aidPatientXt.getYcxdtcs());
		if (isnot(xtzlMap.get("YCXDTCS"))) { //JSXDTSJ
			treatmentInfoMap.put("TRAN_TIME",  DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JSXDTSJ"))));//接收 120/网络医院心电图时 间
			treatmentInfoMap.put("IS_REMOTE_ECGTRAN", xtzlMap.get("CSFS"));//传输方式
		}

		//肌钙蛋白
		treatmentInfoMap.put("IS_CTNT", xtzlMap.get("ISJGDB"));//肌钙蛋白 -是 否
		List<Map<String, String>> ctntList = new ArrayList<Map<String, String>>();
		if (isnot(xtzlMap.get("ISJGDB"))) {
			Map<String, String> ctntMap = new HashMap<String, String>();
			ctntMap.put("TYPE", xtzlMap.get("SCJGDB"));
			ctntMap.put("VALUE", xtzlMap.get("JGDBSZ"));
			ctntMap.put("UNIT", "");//SCJGDB
			if(xtzlMap.get("JGDBXZ").equals("0")){
				ctntMap.put("STATUS", "1");
			} else {
				ctntMap.put("STATUS", "2");
			}
			ctntMap.put("BLOOD_TIME", xtzlMap.get("CXSJ"));//CXSJ
			ctntMap.put("REPORT_TIME", xtzlMap.get("POCTSJ"));
			ctntList.add(ctntMap);
		}
		treatmentInfoMap.put("CTNTS", ctntList);
		//血清肌酐
		treatmentInfoMap.put("IS_CR", xtzlMap.get("ISXQJG"));
		if (isnot(xtzlMap.get("ISXQJG"))) {
			treatmentInfoMap.put("CR_VALUE", xtzlMap.get("XQJGSZ"));
		}

		//d-二聚体
		treatmentInfoMap.put("IS_Ddimer", xtzlMap.get("ISDEJT"));
		if (isnot(xtzlMap.get("ISDEJT"))) {
			treatmentInfoMap.put("Ddimer_VALUE", xtzlMap.get("DEJTSZ"));

			treatmentInfoMap.put("Ddimer_UNIT", xtzlMap.get("DEJTDW"));
		}
		//BNP
		treatmentInfoMap.put("IS_BNP", xtzlMap.get("ISBNP"));
		if (isnot(xtzlMap.get("ISBNP"))) {
			treatmentInfoMap.put("BNP_VALUE", xtzlMap.get("BNPSZ"));
		}

		//NT-proBNP
		treatmentInfoMap.put("IS_NTproBNP", xtzlMap.get("ISNTPROBNP"));
		if (isnot(xtzlMap.get("ISNTPROBNP"))) {
			treatmentInfoMap.put("NTproBNP_VALUE", xtzlMap.get("NTPROBNPSZ"));
		}

		//Myo
		treatmentInfoMap.put("IS_MYO", xtzlMap.get("ISMYO"));
		if (isnot(xtzlMap.get("ISMYO"))) {
			treatmentInfoMap.put("MYO_VALUE", xtzlMap.get("MYOSZ"));
			treatmentInfoMap.put("MYO_UNIT", xtzlMap.get("MYODW"));
		}
		//CKMB
		treatmentInfoMap.put("IS_CKMB", xtzlMap.get("ISCKMB"));
		if (isnot(xtzlMap.get("ISCKMB"))) {
			treatmentInfoMap.put("CKMB_VALUE", xtzlMap.get("CKMBSZ"));
			treatmentInfoMap.put("CKMB_UNIT", xtzlMap.get("CKMBDW"));
		}

		//心内科会诊

		treatmentInfoMap.put("IS_NOTICE_IMCD", xtzlMap.get("XNKHZ"));//心内科会诊
	   /* Map<String, String> HZLX_map = new HashMap<String, String>();
		HZLX_map.put("0","1");
		HZLX_map.put("1","2");*/
		treatmentInfoMap.put("IMCD_TYPE", xtzlMap.get("HZLX"));//会诊类型
		if(xtzlMap.get("TZHZSJ") != null){//通知会诊时间
			treatmentInfoMap.put("NOTICE_IMCD_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZHZSJ"))));
		}
		if(xtzlMap.get("HZSJ") != null){//会诊时间
			treatmentInfoMap.put("CONSULTATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("HZSJ"))));
		}


		//初步诊断/心内>急诊  若无心内诊断，取急诊诊断
		System.out.print("xtzlMap.get(\"CBZD\")"+"--------------------"+xtzlMap.get("CBZD")+"--"+xtzlMap.get("JZZD")+"KK"+xtzlMap.get("CBZD"));
		String cbzd = null;
		if (xtzlMap.get("CBZD") == null) {
			cbzd = xtzlMap.get("JZZD");
		} else {
			cbzd = xtzlMap.get("CBZD");
		}
		treatmentInfoMap.put("CP_DIAGNOSIS_CODE", cbzd);
		//STEMI
		if ("1".equals(cbzd)) {
			treatmentInfoMap.put("STEMI_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));//患者自愿放弃后续治疗
			if(xtzlMap.get("CBZDSJ") != null){
				treatmentInfoMap.put("STEMI_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			}

			treatmentInfoMap.put("STEMI_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			treatmentInfoMap.put("STEMI_KILLIP_LEVEL", xtzlMap.get("KILLIP"));
			//过急诊流程非绕行急诊
			//treatmentInfoMap.put("STEMI_IS_BYPASS_EMERGENCY", "0");
			treatmentInfoMap.put("STEMI_IS_BYPASS_EMERGENCY", xtzlMap.get("RXJZ"));
			treatmentInfoMap.put("STEMI_IS_BYPASS_CCU", xtzlMap.get("RXCCU"));
			//抗血小板药物
			treatmentInfoMap.put("STEMI_IS_DRUG", xtzlMap.get("KXXBZL"));
			if (isnot(xtzlMap.get("KXXBZL"))) {
				treatmentInfoMap.put("STEMI_ASPIRIN_DOSE", xtzlMap.get("ASPLJL"));
				if(xtzlMap.get("CBZDSJ") != null) {
					treatmentInfoMap.put("STEMI_ASPIRIN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ASPLSJ"))));
				}
				treatmentInfoMap.put("STEMI_CLOPIDOGREL_DOSE", xtzlMap.get("LBGLJL"));
				if(xtzlMap.get("LBGLSJ") != null) {
					treatmentInfoMap.put("STEMI_CLOPIDOGREL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LBGLSJ"))));
				}
				treatmentInfoMap.put("STEMI_TICAGRELOR_DOSE", xtzlMap.get("TGRLJL"));
				if(xtzlMap.get("TGRLSJ") != null) {
					treatmentInfoMap.put("STEMI_TICAGRELOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TGRLSJ"))));
				}
			}
			//抗凝
			treatmentInfoMap.put("STEMI_IS_ANTICOAGULATION", xtzlMap.get("KANGN"));
			if (isnot(xtzlMap.get("KANGN"))) {
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_DRUG", xtzlMap.get("KNYW"));
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_DOSE", xtzlMap.get("KNYWJL"));
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_TIME", xtzlMap.get("KNYWSJ"));
				treatmentInfoMap.put("STEMI_ANTICOAGULATION_UNIT", xtzlMap.get("KNYWDW"));
			}
			//他汀治疗
			treatmentInfoMap.put("STEMI_INTENSIFY_STATINS_TREAT", xtzlMap.get("TTZL"));
			//β受体阻滞剂
			treatmentInfoMap.put("STEMI_RECEPTOR_RETARDANT_USING", xtzlMap.get("BSTZZJ"));
			//再灌注
			treatmentInfoMap.put("STEMI_IS_REPERFUSION", xtzlMap.get("YWZGZCS"));
			if ("0".equals(xtzlMap.get("YWZGZCS"))) {
				if(xtzlMap.get("WZGZCSYY") != null){
					treatmentInfoMap.put("STEMI_NO_REPERFUSION_REASON", ("" + xtzlMap.get("WZGZCSYY")).replaceAll(",", "|"));
				}

			} else if (isnot(xtzlMap.get("YWZGZCS"))) {
				zgzcs(treatmentInfoMap, xtzlMap);
			}
		}
		//NSTEMI
		else if ("2".equals(cbzd)) {
			//诊断-NSTEMI
			treatmentInfoMap.put("NSTEMI_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));//患者自愿放弃后续治疗
			if(xtzlMap.get("CBZDSJ") != null){
				treatmentInfoMap.put("NSTEMI_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); //初步诊断时间
			}

			treatmentInfoMap.put("NSTEMI_DOCTOR_NAME", xtzlMap.get("YISHENG")); //医生
			treatmentInfoMap.put("NSTEMI_KILLIP_LEVEL", xtzlMap.get("KILLIP")); //心功能分级
			//过急诊流程非绕行急诊
			//treatmentInfoMap.put("NSTEMI_IS_BYPASS_EMERGENCY", "0");//绕行急诊
			treatmentInfoMap.put("NSTEMI_IS_BYPASS_EMERGENCY", xtzlMap.get("RXJZ"));//绕行急诊
			treatmentInfoMap.put("NSTEMI_IS_BYPASS_CCU", xtzlMap.get("RXCCU")); //绕行 CCU

			//诊断-NSTEMI-药物 -抗血小板治疗
			treatmentInfoMap.put("NSTEMI_IS_DRUG", xtzlMap.get("KXXBZL"));//抗血小板治疗
			if (isnot(xtzlMap.get("KXXBZL"))) {
				treatmentInfoMap.put("NSTEMI_ASPIRIN_DOSE", xtzlMap.get("ASPLJL"));
				treatmentInfoMap.put("NSTEMI_ASPIRIN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ASPLSJ"))));
				treatmentInfoMap.put("NSTEMI_CLOPIDOGREL_DOSE", xtzlMap.get("LBGLJL"));
				treatmentInfoMap.put("NSTEMI_CLOPIDOGREL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LBGLSJ"))));
				treatmentInfoMap.put("NSTEMI_TICAGRELOR_DOSE", xtzlMap.get("TGRLJL"));
				treatmentInfoMap.put("NSTEMI_TICAGRELOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TGRLSJ"))));
			}

			//抗凝
			treatmentInfoMap.put("NSTEMI_IS_ANTICOAGULATION", xtzlMap.get("KANGN"));
			if (isnot(xtzlMap.get("KANGN"))) {
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_DRUG", xtzlMap.get("KNYW"));
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_DOSE", xtzlMap.get("KNYWJL"));
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_TIME", xtzlMap.get("KNYWSJ"));
				treatmentInfoMap.put("NSTEMI_ANTICOAGULATION_UNIT", xtzlMap.get("KNYWDW"));
			}
			//他汀治疗
			treatmentInfoMap.put("NSTEMI_INTENSIFY_STATINS_TREAT", xtzlMap.get("TTZL"));
			//β受体阻滞剂
			treatmentInfoMap.put("NSTEMI_IS_BETA_BLOCKER", xtzlMap.get("BSTZZJ"));

			//grace
			treatmentInfoMap.put("NSTEMI_GRACE_ESTIMATE","");
			if(xtzlMap.get("WXYS") != null){
				treatmentInfoMap.put("NSTEMI_GRACE_ESTIMATE", ("" + xtzlMap.get("WXYS")).replaceAll(",", "|"));//Grace 评估
			}

			//未完成   缺少分值
			if("1".equals(xtzlMap.get("GRACEWXFC"))){
				if(xtzlMap.get("GRACEJGWTJ") != null){
					treatmentInfoMap.put("NSTEMI_GRACE_HR_CONDITION", ("" + xtzlMap.get("GRACEJGWTJ")).replaceAll(",", "|"));//Grace 极高危条件
				}
			}
			//Grace分值  当Grace 极高危条件 存在时，不做评分
			//if("".equals(xtzlMap.get("GRACEJGWTJ")) || "".equals(xtzlMap.get("GRACEJGWTJ"))){
			treatmentInfoMap.put("NSTEMI_GRACE_VALUE", xtzlMap.get("GRACEFZ"));// 没分值
			// }

			treatmentInfoMap.put("NSTEMI_RISK_LAMINATION", xtzlMap.get("GRACEWXFC"));//NSTE-ACS 危险分层

			//再次危险分层
			treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG", xtzlMap.get("ZCWXFC"));
			if (xtzlMap.get("ZCWXFC") != null && !"0".equals(xtzlMap.get("ZCWXFC"))) {
				if(xtzlMap.get("ZCWXFCSJ") != null) {
					treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
				}
				if (!"1".equals(xtzlMap.get("ZCWXFC"))) {
					treatmentInfoMap.put("NSTEMI_STRATEGY", xtzlMap.get("CLCL"));
					if (!isnot(xtzlMap.get("CLCL"))) {
						treatmentInfoMap.put("NSTEMI_INVASIVE_STRATEGY", xtzlMap.get("QRXCL"));//策略  1:保守治疗(仅药物治疗)   2:侵入性策略
						//侵入性策略  1:紧急介入治疗 2:24H 内介入治疗 3:72H 内介入治疗 4:择期介入治疗 5:CABG
						if ("1".equals(xtzlMap.get("QRXCL"))) {
							treatmentInfoMap.put("NSTEMI_STRATEGY_DOCTOR_NAME", xtzlMap.get("JDXPCIYS"));
							treatmentInfoMap.put("NSTEMI_DECISION_OPERATION_TIME", xtzlMap.get("JDJRSSSJ"));
							treatmentInfoMap.put("NSTEMI_START_CONDUIT_TIME", xtzlMap.get("QDDGSSJ"));
							treatmentInfoMap.put("NSTEMI_START_AGREE_TIME", xtzlMap.get("KSZQTYSJ"));
							treatmentInfoMap.put("NSTEMI_SIGN_AGREE_TIME", xtzlMap.get("QSZQTYSJ"));
							//导管室 start

							//导管室 end
						} else if ("2".equals(xtzlMap.get("QRXCL"))) {
							if(xtzlMap.get("SJJRZLSJ") != null) {
								treatmentInfoMap.put("NSTEMI_ACTUAL_INTERVENT_TIME", xtzlMap.get("SJJRZLSJ"));
							}
						}
					}

				} else if ("1".equals(xtzlMap.get("ZCWXFC"))) {
					if(xtzlMap.get("ZCWXFCSJ") != null) {
						treatmentInfoMap.put("NSTEMI_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
					}

					//再灌注
					treatmentInfoMap.put("STEMI_IS_REPERFUSION", xtzlMap.get("YWZGZCS"));
					if ("0".equals(xtzlMap.get("YWZGZCS"))) {
						if(xtzlMap.get("WZGZCSYY") != null){
							treatmentInfoMap.put("STEMI_NO_REPERFUSION_REASON", ("" + xtzlMap.get("WZGZCSYY")).replaceAll(",", "|"));
						}

					} else if (isnot(xtzlMap.get("YWZGZCS"))) {
						//STEMI 再灌注措施  数据
						zgzcs(treatmentInfoMap, xtzlMap);
					}

				}
			}


		}
		//UA
		else if ("3".equals(cbzd)) {
			treatmentInfoMap.put("UA_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			if(xtzlMap.get("CBZDSJ") != null) {
				treatmentInfoMap.put("UA_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			}
			treatmentInfoMap.put("UA_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			treatmentInfoMap.put("UA_KILLIP_LEVEL", xtzlMap.get("KILLIP"));
			//过急诊流程非绕行急诊
			treatmentInfoMap.put("UA_IS_BYPASS_EMERGENCY", "0");
			treatmentInfoMap.put("UA_IS_BYPASS_CCU", xtzlMap.get("RXCCU"));
			//抗血小板药物
			treatmentInfoMap.put("UA_IS_DRUG", xtzlMap.get("KXXBZL"));
			if (isnot(xtzlMap.get("KXXBZL"))) {
				treatmentInfoMap.put("UA_ASPIRIN_DOSE", xtzlMap.get("ASPLJL"));
				if(xtzlMap.get("ASPLSJ") != null) {
					treatmentInfoMap.put("UA_ASPIRIN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ASPLSJ"))));
				}
				treatmentInfoMap.put("UA_CLOPIDOGREL_DOSE", xtzlMap.get("LBGLJL"));
				if(xtzlMap.get("LBGLSJ") != null) {
					treatmentInfoMap.put("UA_CLOPIDOGREL_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LBGLSJ"))));
				}
				treatmentInfoMap.put("UA_TICAGRELOR_DOSE", xtzlMap.get("TGRLJL"));
				if(xtzlMap.get("TGRLSJ") != null) {
					treatmentInfoMap.put("UA_TICAGRELOR_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TGRLSJ"))));
				}
			}
			//抗凝
			treatmentInfoMap.put("UA_IS_ANTICOAGULATION", xtzlMap.get("KANGN"));
			if (isnot(xtzlMap.get("KANGN"))) {
				treatmentInfoMap.put("UA_ANTICOAGULATION_DRUG", xtzlMap.get("KNYW"));
				treatmentInfoMap.put("UA_ANTICOAGULATION_DOSE", xtzlMap.get("KNYWJL"));
				treatmentInfoMap.put("UA_ANTICOAGULATION_TIME", xtzlMap.get("KNYWSJ"));
				treatmentInfoMap.put("UA_ANTICOAGULATION_UNIT", xtzlMap.get("KNYWDW"));
			}

			treatmentInfoMap.put("UA_INTENSIFY_STATINS_TREAT", xtzlMap.get("TTZL"));
			treatmentInfoMap.put("UA_RECEPTOR_RETARDANT_USING", xtzlMap.get("BSTZZJ"));

			//grace
			treatmentInfoMap.put("UA_GRACE_ESTIMATE","");
			if(xtzlMap.get("WXYS") != null){
				treatmentInfoMap.put("UA_GRACE_ESTIMATE", ("" + xtzlMap.get("WXYS")).replaceAll(",", "|"));//Grace 评估
			}
			//未完成   缺少分值
			if("1".equals(xtzlMap.get("GRACEWXFC"))){
				if(xtzlMap.get("GRACEJGWTJ") != null){
					treatmentInfoMap.put("UA_GRACE_HR_CONDITION", ("" + xtzlMap.get("GRACEJGWTJ")).replaceAll(",", "|"));//Grace 极高危条件
				}

			}
			//Grace分值  当Grace 极高危条件 存在时，不做评分
			treatmentInfoMap.put("UA_GRACE_VALUE", xtzlMap.get("GRACEFZ"));// 没分值

			treatmentInfoMap.put("UA_RISK_LAMINATION", xtzlMap.get("GRACEWXFC"));
			//再次危险分层
			treatmentInfoMap.put("UA_RISK_LAMINATION_AG", xtzlMap.get("ZCWXFC"));
			if (xtzlMap.get("ZCWXFC") != null && !"0".equals(xtzlMap.get("ZCWXFC"))) {
				//treatmentInfoMap.put("UA_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
				// 再次危险分层时间
				if(xtzlMap.get("ZCWXFCSJ") != null) {
					treatmentInfoMap.put("UA_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
				}
				if (!"1".equals(xtzlMap.get("ZCWXFC"))) {
					treatmentInfoMap.put("UA_STRATEGY", xtzlMap.get("CLCL"));
					if (!isnot(xtzlMap.get("CLCL"))) {
						treatmentInfoMap.put("UA_INVASIVE_STRATEGY", xtzlMap.get("QRXCL"));//策略  1:保守治疗(仅药物治疗)   2:侵入性策略
						//侵入性策略  1:紧急介入治疗 2:24H 内介入治疗 3:72H 内介入治疗 4:择期介入治疗 5:CABG
						if ("1".equals(xtzlMap.get("QRXCL"))) {
							treatmentInfoMap.put("UA_STRATEGY_DOCTOR_NAME", xtzlMap.get("JDXPCIYS"));
							if(xtzlMap.get("JDJRSSSJ") != null) {
								treatmentInfoMap.put("UA_DECISION_OPERATION_TIME", xtzlMap.get("JDJRSSSJ"));
							}
							treatmentInfoMap.put("UA_START_CONDUIT_TIME", xtzlMap.get("QDDGSSJ"));
							treatmentInfoMap.put("UA_START_AGREE_TIME", xtzlMap.get("KSZQTYSJ"));
							treatmentInfoMap.put("UA_SIGN_AGREE_TIME", xtzlMap.get("QSZQTYSJ"));
							//导管室 start

							//导管室 end
						} else if ("2".equals(xtzlMap.get("QRXCL"))) {
							if(xtzlMap.get("SJJRZLSJ") != null) {//UA_ACTUAL_INTERVENT_TIME
								treatmentInfoMap.put("UA_ACTUAL_INTERVENTION_TIME", xtzlMap.get("SJJRZLSJ"));
							}
						}
					}

				} else if ("1".equals(xtzlMap.get("ZCWXFC"))) {
					// 再次危险分层时间
					if(xtzlMap.get("ZCWXFCSJ") != null) {
						treatmentInfoMap.put("UA_RISK_LAMINATION_AG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZCWXFCSJ"))));
					}
					//再灌注
					treatmentInfoMap.put("STEMI_IS_REPERFUSION", xtzlMap.get("YWZGZCS"));
					if ("0".equals(xtzlMap.get("YWZGZCS"))) {
						if(xtzlMap.get("WZGZCSYY") != null){
							treatmentInfoMap.put("STEMI_NO_REPERFUSION_REASON", ("" + xtzlMap.get("WZGZCSYY")).replaceAll(",", "|"));
						}

					} else if (isnot(xtzlMap.get("YWZGZCS"))) {
						//STEMI 再灌注措施  数据
						zgzcs(treatmentInfoMap, xtzlMap);
					}
				}
			}
		}
		//主动脉夹层
		else if ("4".equals(cbzd)) {
			treatmentInfoMap.put("AD_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			if(xtzlMap.get("CBZDSJ") != null) {
				treatmentInfoMap.put("AD_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			}
			treatmentInfoMap.put("AD_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			if(xtzlMap.get("YXXJC") != null){
				//影像学检查
				String yxxjc = "" + xtzlMap.get("YXXJC");
				treatmentInfoMap.put("AD_IMG_EXAMINATION", yxxjc.replaceAll(",", "|"));
				System.out.println("yxxjc"+"------"+yxxjc.indexOf("1")+"------"+yxxjc+"hhhhhhhhh"+yxxjc.indexOf(1));
				System.out.println("yxxjc"+"------"+yxxjc.indexOf("1")+"------"+yxxjc+"hhhhhhhhh"+yxxjc.indexOf(1));
				System.out.println("yxxjc"+"------"+yxxjc.indexOf("1")+"------"+yxxjc+"hhhhhhhhh"+yxxjc.indexOf(1));
				if (yxxjc.indexOf("1") > -1) {
					if(xtzlMap.get("TZCTSSJ") != null) {
						treatmentInfoMap.put("AD_CT_NOTICE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZCTSSJ"))));
					}
					if(xtzlMap.get("CTSWCZBSJ") != null) {
						treatmentInfoMap.put("AD_CT_FINISH_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSWCZBSJ"))));
					}
					if(xtzlMap.get("CTSMKSSJ") != null) {
						treatmentInfoMap.put("AD_CT_SCAN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSMKSSJ"))));
					}
					if(xtzlMap.get("CTBGSJ") != null) {
						treatmentInfoMap.put("AD_CT_REPORT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTBGSJ"))));
					}
				}
				//	else
				if (yxxjc.indexOf("2") > -1) {
					if(xtzlMap.get("TZCCSSJ") != null) {
						treatmentInfoMap.put("AD_NOTICE_CDU_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZCCSSJ"))));
					}
					if(xtzlMap.get("CCJCSJ") != null) {
						treatmentInfoMap.put("AD_CDU_CHECK_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CCJCSJ"))));
					}
					if(xtzlMap.get("CCCJGSJ") != null) {
						treatmentInfoMap.put("AD_CHECK_RESULT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CCCJGSJ"))));
					}
				}
			}
			//通知心外科会诊时间
			treatmentInfoMap.put("AD_IMCD_NOTICE_TIME", xtzlMap.get("TZXWKHZSJ"));
			treatmentInfoMap.put("AD_ECC_CONSULTATION_TIME", xtzlMap.get("XWKHZSJ"));
			//夹层类型
			treatmentInfoMap.put("AD_INTERLAYER_TYPE", xtzlMap.get("JCLX"));
			treatmentInfoMap.put("AD_TREATMENT_STRATEGY_CODE", xtzlMap.get("ZLCL"));
		}
		//肺栓塞
		else if ("5".equals(cbzd)) {
			treatmentInfoMap.put("PE_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			if(xtzlMap.get("CBZDSJ") != null) {
				treatmentInfoMap.put("PE_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			}
			treatmentInfoMap.put("PE_DOCTOR_NAME", xtzlMap.get("YISHENG"));

			if(xtzlMap.get("YXXJC") != null){
				//影像学检查
				Map<String, String> YXXJC_map = new HashMap<String, String>();
				YXXJC_map.put("1","1");
				YXXJC_map.put("4","2");
				String yxxjc = "" + YXXJC_map.get(xtzlMap.get("YXXJC"));
				//上报系统共用编码，编码“未做”值不同

				treatmentInfoMap.put("PE_IMG_EXAMINATION", yxxjc.replaceAll(",", "|").replace("4", "2"));


				if (yxxjc.indexOf("1") > -1) {
					if(xtzlMap.get("TZCTSSJ") != null) {
						treatmentInfoMap.put("PE_CT_NOTICE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("TZCTSSJ"))));
					}
					if(xtzlMap.get("CTSWCZBSJ") != null) {
						treatmentInfoMap.put("PE_CT_FINISH_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSWCZBSJ"))));
					}
					if(xtzlMap.get("CTSMKSSJ") != null) {
						treatmentInfoMap.put("PE_CT_SCAN_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTSMKSSJ"))));
					}
					if(xtzlMap.get("CTBGSJ") != null) {
						treatmentInfoMap.put("PE_CT_REPORT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CTBGSJ"))));
					}
				}
			}

			//治疗信息-危险分层-开始抗凝治疗时间
			treatmentInfoMap.put("PE_RISK_LAMINATION", xtzlMap.get("WXFC"));//
			if(xtzlMap.get("KSKNZLSJ") != null) {
				treatmentInfoMap.put("PE_ANTI_TREATMENT_TIME", xtzlMap.get("KSKNZLSJ"));
			}
			//院内溶栓治疗
			treatmentInfoMap.put("PE_SCREENING", xtzlMap.get("YNRSSC"));
			if ("2".equals(xtzlMap.get("YNRSSC"))) {
				treatmentInfoMap.put("PE_THROM_CONTRAINDICATION", xtzlMap.get("YNCZJJZ"));
			} else if ("1".equals(xtzlMap.get("YNRSSC"))) {
				treatmentInfoMap.put("PE_IS_THROMBOLYSIS", xtzlMap.get("YNRSZL"));
			}
		}
		//非 ACS 心源性胸痛
		else if ("6".equals(cbzd)) {
			treatmentInfoMap.put("NACS_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			if(xtzlMap.get("FACSXYXXTLX") != null){
				treatmentInfoMap.put("NACS_TYPE", ("" + xtzlMap.get("FACSXYXXTLX")).replaceAll(",", "|")); //胸痛诊疗
			}

			if(xtzlMap.get("CBZDSJ") != null) {
				treatmentInfoMap.put("NACS_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			}
			treatmentInfoMap.put("NACS_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			treatmentInfoMap.put("NACS_TREATMENT_TYPE", xtzlMap.get("CLCS"));
			treatmentInfoMap.put("NACS_PATIENT_REMARK", xtzlMap.get("YNHZQKBZ"));
		}
		//其它非心源性胸痛
		else if ("7".equals(cbzd)) {
			treatmentInfoMap.put("OTHER_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			if(xtzlMap.get("CBZDSJ") != null) {
				treatmentInfoMap.put("OTHER_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ")))); //胸痛诊疗
			}
			treatmentInfoMap.put("OTHER_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			if(xtzlMap.get("QTFXYXXTLX") != null){
				treatmentInfoMap.put("OTHER_TYPE", ("" + xtzlMap.get("QTFXYXXTLX")).replaceAll(",", "|"));
			}

			treatmentInfoMap.put("OTHER_TREATMENT_TYPE", xtzlMap.get("CLCS"));
			treatmentInfoMap.put("OTHER_PATIENT_REMARK", xtzlMap.get("YNHZQKBZ"));
		}
		//待查
		else if ("8".equals(cbzd)) {
			treatmentInfoMap.put("AWAIT_GIVE_UP_TREATMENT", xtzlMap.get("HZZYFQHXZL"));
			if(xtzlMap.get("CBZDSJ") != null){
				treatmentInfoMap.put("AWAIT_DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CBZDSJ"))));
			}

			treatmentInfoMap.put("AWAIT_DOCTOR_NAME", xtzlMap.get("YISHENG"));
			treatmentInfoMap.put("AWAIT_TREATMENT_TYPE", xtzlMap.get("CLCS"));
			treatmentInfoMap.put("AWAIT_PATIENT_REMARK", xtzlMap.get("YNHZQKBZ"));
		}

		root.put("TreatmentInfo", treatmentInfoMap);

		//导管室
		JSONObject TreatmentPciInfo = new JSONObject();

		TreatmentPciInfo.put("IsShow", "");
		TreatmentPciInfo.put("IsShowAll", "");
		TreatmentPciInfo.put("IsShowPart", "");
		TreatmentPciInfo.put("ACTIVATE_CONDUIT_TIME", "");
		TreatmentPciInfo.put("PATIENT_ARRIVED_CONDUIT_TIME", "");
		TreatmentPciInfo.put("INTERVENTION_PERSON", "");
		TreatmentPciInfo.put("START_PUNCTURE_TIME", "");
		TreatmentPciInfo.put("START_RADIOGRAPHY_TIME", "");
		TreatmentPciInfo.put("ANTICOAGULATION_TIME", "");
		TreatmentPciInfo.put("ANTICOAGULATION_DRUG", "");
		TreatmentPciInfo.put("ANTICOAGULATION_DOSE", "");
		TreatmentPciInfo.put("ANTICOAGULATION_UNIT", "");
		TreatmentPciInfo.put("END_OPERATION_TIME", "");
		TreatmentPciInfo.put("DTWOB_TIME", "");
		TreatmentPciInfo.put("IS_DELAY", "");
		TreatmentPciInfo.put("DELAY_REASON", null);
		TreatmentPciInfo.put("ROUTE", "");
		TreatmentPciInfo.put("POSITION", "");
		//器械
		JSONArray crivelList = new JSONArray();
		TreatmentPciInfo.put("CORONARY_ANGIOGRAPHIE_LIST", crivelList);

		TreatmentPciInfo.put("INTRACAVITY_IMAGE", "");
		TreatmentPciInfo.put("FUNCTION_TEST", "");
		TreatmentPciInfo.put("FUNCTION_TEST_VALUE", "");
		TreatmentPciInfo.put("IABP", "");
		TreatmentPciInfo.put("PACEMAKER", "");
		TreatmentPciInfo.put("ECMO", "");
		TreatmentPciInfo.put("AUXILIARY_DEVICE", "");
		TreatmentPciInfo.put("COMPLICATION", "");

		System.out.println("STEMI_MEASURES"+ "-------------"+ treatmentInfoMap.get("STEMI_MEASURES"));
		//导管室
		if (("1".equals(treatmentInfoMap.get("STEMI_MEASURES")) || "2".equals(treatmentInfoMap.get("STEMI_MEASURES")))
				|| "1".equals(treatmentInfoMap.get("NSTEMI_INVASIVE_STRATEGY"))
				|| "1".equals(treatmentInfoMap.get("UA_INVASIVE_STRATEGY"))) {
			TreatmentPciInfo.put("IsShow", false);
			TreatmentPciInfo.put("IsShowAll", false);
			TreatmentPciInfo.put("IsShowPart", false);
			if(xtzlMap.get("DGSJHSJ") != null) {
				TreatmentPciInfo.put("ACTIVATE_CONDUIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("DGSJHSJ"))));
			}
			if(xtzlMap.get("HZJDGSSJ") != null) {
				TreatmentPciInfo.put("PATIENT_ARRIVED_CONDUIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("HZJDGSSJ"))));
			}
			TreatmentPciInfo.put("INTERVENTION_PERSON", xtzlMap.get("JRYS"));
			if(xtzlMap.get("KSCCSJ") != null) {
				TreatmentPciInfo.put("START_PUNCTURE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSCCSJ"))));
			}
			if(xtzlMap.get("ZYKSSJ") != null) {
				TreatmentPciInfo.put("START_RADIOGRAPHY_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZYKSSJ"))));
			}
			if(xtzlMap.get("SZKNGYSJ") != null){ //时间 转换如果为 null  报错
				TreatmentPciInfo.put("ANTICOAGULATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SZKNGYSJ"))));
			}
			TreatmentPciInfo.put("ANTICOAGULATION_DRUG", xtzlMap.get("SZKNYW"));
			TreatmentPciInfo.put("ANTICOAGULATION_DOSE", xtzlMap.get("SZKNYWJL"));
			TreatmentPciInfo.put("ANTICOAGULATION_UNIT", xtzlMap.get("SZKNYWDW"));
			if(xtzlMap.get("PCISSWCSJ") != null){
				TreatmentPciInfo.put("END_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("PCISSWCSJ"))));
			}

			TreatmentPciInfo.put("DTWOB_TIME", xtzlMap.get("D2WSJ"));
			TreatmentPciInfo.put("IS_DELAY", "");//xtzlMap.get("SFYW")  文档没值 ，接口上传0 1 都是否 故传空
			if(xtzlMap.get("YWYY") != null) {
			TreatmentPciInfo.put("DELAY_REASON", ("" + xtzlMap.get("YWYY")).replaceAll(",", "|"));
			}
			//入路
			/*Map<String, String> RULU_map = new HashMap<String, String>();
			RULU_map.put("1","2");
			RULU_map.put("2","1");
			RULU_map.put("3","3");
			RULU_map.put("4","4");*/
			TreatmentPciInfo.put("ROUTE", xtzlMap.get("RULU"));//
			//List<Map<String,Object>> crivelList = new ArrayList<Map<String,Object>>();
			//部位（罪犯血管）
			String POSITION = "";
			// HspCrivelInf hspCrivelInf = hspCrivelInfMapperCustom.selectByPrimaryKey(emgNo);


			List<HspCrivelInf> hspCrivelInfList = hspCrivelInfMapperCustom.selectByPrimaryKeyList(emgNo);
			for (int i = 1; i < 28; i++) {
				String gmzy = "GMZY" + String.format("%02d",i);
				if (StringUtils.isNotNullAndEmptyByTrim(xtzlMap.get(gmzy))) {
					for (HspCrivelInf hspCrivelInf : hspCrivelInfList) {

						String velSeq =hspCrivelInf.getVelSeq();
						String xtzlSeq =xtzlMap.get(gmzy);
						System.out.print("result"+"--------------------"+velSeq);
						System.out.print("result"+"--------------------"+xtzlSeq);
						System.out.print("result"+"--------------------"+ xtzlSeq.equals(velSeq)+"/n");
						if(xtzlSeq.equals(velSeq)){
							JSONObject crivelMap = new JSONObject();
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
							if (isnot(hspCrivelInf.getPci())) {
								if(hspCrivelInf.getSzcl() != null){
									crivelMap.put("INTRAOPERATIVE_HANDLE", hspCrivelInf.getSzcl().replaceAll(",","|"));
								}

								if(hspCrivelInf.getDstgsj() != null){
									crivelMap.put("BALLOON_EXPANSION_TIME", DateUtil.getDateStrT(hspCrivelInf.getDstgsj()));
								}

								Map<String, String> TIMI_map = new HashMap<String, String>();
								TIMI_map.put("0","1");
								TIMI_map.put("1","2");
								TIMI_map.put("2","3");
								TIMI_map.put("3","4");
								crivelMap.put("TIMI", TIMI_map.get(hspCrivelInf.getShtimixl()));
								crivelMap.put("BRACKET_NUM", hspCrivelInf.getZrzjgs());
								crivelMap.put("BRAKET_TYPE", hspCrivelInf.getZjzl());
							}
							crivelList.add(crivelMap);

							if (POSITION.length() > 0) {
								POSITION = POSITION + "|" + i;
							} else {
								POSITION = POSITION + i;
							}

						}

					}



				}
				TreatmentPciInfo.put("POSITION", POSITION);
				TreatmentPciInfo.put("CORONARY_ANGIOGRAPHIE_LIST", crivelList);
			}




			//器械
			if(xtzlMap.get("QNYX")!=null){
				TreatmentPciInfo.put("INTRACAVITY_IMAGE", xtzlMap.get("QNYX"));
			}
			// System.out.println("QNYX>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + xtzlMap.get("QNYX"));
			TreatmentPciInfo.put("FUNCTION_TEST", xtzlMap.get("GNJC"));
			if ("1".equals(xtzlMap.get("GNJC"))
					|| "4".equals(xtzlMap.get("GNJC"))
					|| "5".equals(xtzlMap.get("GNJC"))) {
				TreatmentPciInfo.put("FUNCTION_TEST_VALUE", xtzlMap.get("GNJCSZ"));
			}

			if(xtzlMap.get("IABP")!=null){
				if(xtzlMap.get("IABP")=="1"){
					TreatmentPciInfo.put("IABP", 1);
				}else{
					TreatmentPciInfo.put("IABP", 0);
				}
			}

			if(xtzlMap.get("LSQBQ")!=null){
				if(xtzlMap.get("LSQBQ").equals("1")){
					TreatmentPciInfo.put("PACEMAKER", 1);
				}else{
					TreatmentPciInfo.put("PACEMAKER", 0);
				}
			}
//            TreatmentPciInfo.put("PACEMAKER", xtzlMap.get("LSQBQ"));

			if(xtzlMap.get("ECMO")!=null){
				if(xtzlMap.get("ECMO").equals("1")){
					TreatmentPciInfo.put("ECMO", 1);
				}else{
					TreatmentPciInfo.put("ECMO", 0);
				}
			}

			if(xtzlMap.get("ZXSFZZZ")!=null){
				if(xtzlMap.get("ZXSFZZZ").equals("1")){
					TreatmentPciInfo.put("AUXILIARY_DEVICE", 1);
				}else{
					TreatmentPciInfo.put("AUXILIARY_DEVICE", 0);
				}
			}
//            TreatmentPciInfo.put("AUXILIARY_DEVICE", xtzlMap.get("ZXSFZZZ"));

			//术中并发症
			if(xtzlMap.get("SZBFZ") != null){
				TreatmentPciInfo.put("COMPLICATION", ("" + xtzlMap.get("SZBFZ")).replaceAll(",", "|"));
			}


		}

		if(crivelList.size()==0){
			// 初始化
			JSONObject crivelMap = new JSONObject();
			crivelMap.put("POSITION", "");
			crivelMap.put("NARROW_LEVEL", "");
			crivelMap.put("PREOPERATIVE_TIMI_LEVEL", "");
			crivelMap.put("BRACKET_THROMBUS", "");
			crivelMap.put("BRANCHING_SICK", "");
			crivelMap.put("CTO", "");
			crivelMap.put("CA_SICK", "");
			crivelMap.put("CRIMINAL_SICK", "");
			crivelMap.put("PCI", "");
			crivelMap.put("INTRAOPERATIVE_HANDLE", "");
			crivelMap.put("BALLOON_EXPANSION_TIME", "");
			crivelMap.put("TIMI", "");
			crivelMap.put("BRACKET_NUM", "");
			crivelMap.put("BRAKET_TYPE", "");
			crivelList.add(crivelMap);
		}

		root.put("TreatmentPciInfo", TreatmentPciInfo);

		JSONObject OutComeInfo = new JSONObject();
		//患者转归
		OutComeInfo.put("CP_DIAGNOSIS_CODE", "");
		OutComeInfo.put("DIAGNOSIS_TIME", "");
		OutComeInfo.put("IS_HEART_FAILURE", "");
		OutComeInfo.put("COMPLICATION", "");
		OutComeInfo.put("NACS_TYPE", "");
		OutComeInfo.put("OTHER_NACS_TYPE", "");
		OutComeInfo.put("FERITIN", "");
		OutComeInfo.put("HYPERLIPEMIA", "");
		OutComeInfo.put("DIABETES", "");
		OutComeInfo.put("SMOKING", "");
		OutComeInfo.put("SMOKING_STATUS", "");
		OutComeInfo.put("OBESITY", "");
		OutComeInfo.put("FAMILY_DISEASE", "");
		OutComeInfo.put("CHD", "");
		OutComeInfo.put("PREVIOUS_REVASCULARIZATION", "");
		OutComeInfo.put("AF", "");
		OutComeInfo.put("AF_TYPE", "");
		OutComeInfo.put("SLOW_HEART_FAILURE", "");
		OutComeInfo.put("NYHA_LEVEL", "");
		OutComeInfo.put("AVHD", "");
		OutComeInfo.put("BRIAN_VASCELLUM", "");
		OutComeInfo.put("BRIAN_VASCELLUM_DESC", "");
		OutComeInfo.put("PERIPHERAL_ARTERY_DISEASE", "");
		OutComeInfo.put("AORTIC_ANEURYSM", "");
		OutComeInfo.put("COPD", "");
		OutComeInfo.put("CHRONIC_KIDNEY_DISEASE", "");
		OutComeInfo.put("ANEMIA", "");
		OutComeInfo.put("PEPTIC_ULCER", "");
		OutComeInfo.put("THYROID_DISEASE", "");
		OutComeInfo.put("THERIOMA", "");
		OutComeInfo.put("TROPONIN_72H", "");
		OutComeInfo.put("TROPONIN_72H_TYPE", "");
		OutComeInfo.put("CTNI_MAX_VALUE", "");
		OutComeInfo.put("BNP", "");
		OutComeInfo.put("BNP_TYPE", "");
		OutComeInfo.put("BNP_VALUE", "");
		OutComeInfo.put("TC", "");
		OutComeInfo.put("TC_VALUE", "");
		OutComeInfo.put("TG", "");
		OutComeInfo.put("TG_VALUE", "");
		OutComeInfo.put("HDL_C", "");
		OutComeInfo.put("HDL_C_VALUE", "");
		OutComeInfo.put("LDL_C", "");
		OutComeInfo.put("LDL_C_VALUE", "");
		OutComeInfo.put("UCG", "");
		OutComeInfo.put("LVEF", "");
		OutComeInfo.put("VNTRICULAR_ANEURYSM", "");
		OutComeInfo.put("PART_VNTRICULAR", "");
		OutComeInfo.put("HOD", "");
		OutComeInfo.put("TOTAL_COST", "");
		OutComeInfo.put("OUTCOME_CODE", "");
		OutComeInfo.put("LEAVE_TIME", "");
		OutComeInfo.put("TREATMENT_RESULT_CODE", "");
		OutComeInfo.put("OUTDRUGDETAILS", "");
		OutComeInfo.put("HAND_TIME", "");
		OutComeInfo.put("HOSPITAL_NAME", "");
		OutComeInfo.put("IS_NET_HOSPITAL", "");
		OutComeInfo.put("IS_TRANS_PCI", "");
		OutComeInfo.put("IS_DIRECT_CATHETER", "");
		OutComeInfo.put("DECISION_OPERATION_TIME", "");
		OutComeInfo.put("REMOTE_ECG_TRANSMISSION", "");
		OutComeInfo.put("TRANS_ECG_TIME", "");
		OutComeInfo.put("TRANS_WAY", "");
		OutComeInfo.put("AFTER_THROMBOLYSIS_RADIOGRAPHY", "");
		OutComeInfo.put("START_RADIOGRAPHY_TIME", "");
		OutComeInfo.put("TRANSFER_DATE", "");
		OutComeInfo.put("ADMISSION_DEPT", "");
		OutComeInfo.put("TRANSFER_REASON", "");
		OutComeInfo.put("DEATH_TIME", "");
		OutComeInfo.put("DEATH_CAUSE_CODE", "");
		OutComeInfo.put("DEATH_CAUSE_DESC", "");
		OutComeInfo.put("REMARK", "");
		OutComeInfo.put("MISSION_EDUCATION", "2");
		//出院诊断
		String cyzd = xtzlMap.get("CYZD");
		OutComeInfo.put("CP_DIAGNOSIS_CODE", cyzd);//出院诊断
		if(xtzlMap.get("QZSJ") != null){
			OutComeInfo.put("DIAGNOSIS_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("QZSJ"))));//确诊时间*
		}
		OutComeInfo.put("COVID19", xtzlMap.get("COVID19"));
		if ("1".equals(cyzd)
				|| "2".equals(cyzd)
				|| "3".equals(cyzd)) {
			OutComeInfo.put("IS_HEART_FAILURE", xtzlMap.get("YNXFXLSJ"));//院内新发心力衰竭
			OutComeInfo.put("HEART_FAILURE_NYHA_LEVEL", xtzlMap.get("KILLIP"));//心功能分级
			OutComeInfo.put("IS_ARNI", xtzlMap.get("SFARNI"));//ARNI*
			OutComeInfo.put("ARNI_DOSE", xtzlMap.get("ARNIDCJL"));//ARNI 次剂量
			OutComeInfo.put("ARNI_FREQUENCY", xtzlMap.get("ARNI"));//ARNI 服用频次
			OutComeInfo.put("ARNI_FREQUENCY_RANGE", xtzlMap.get("ARNIQJ"));//ARNI 用药频次区间
			if(xtzlMap.get("ZYQJBFZ") != null){
				OutComeInfo.put("COMPLICATION", (""+xtzlMap.get("ZYQJBFZ")).replaceAll(",", "|"));//住院期间并发症
			}

			//危险因素1 高血压|2 高脂血症|3 糖尿病|4 吸烟|5 肥胖|6 早发CVD家族史|7 既往心脏病史|8 既往血运重建史
			String XXGJBWXYS = "" + xtzlMap.get("XXGJBWXYS");
			OutComeInfo.put("FERITIN", XXGJBWXYS.indexOf("1") > 0 ? "1" : "0");//高血压
			OutComeInfo.put("HYPERLIPEMIA", XXGJBWXYS.indexOf("2") > 0 ? "1" : "0");//高脂血症
			OutComeInfo.put("DIABETES", XXGJBWXYS.indexOf("3") > 0 ? "1" : "0");//糖尿病
			OutComeInfo.put("SMOKING", XXGJBWXYS.indexOf("4") > 0 ? "1" : "0");//吸烟
			OutComeInfo.put("SMOKING_STATUS", XXGJBWXYS.indexOf("4") > 0 ? "1" : "2");//吸烟状态
			OutComeInfo.put("OBESITY", XXGJBWXYS.indexOf("5") > 0 ? "1" : "0");//肥胖
			OutComeInfo.put("FAMILY_DISEASE", XXGJBWXYS.indexOf("6") > 0 ? "1" : "0");//早发 CVD 家族史(男<55 岁， 女<60 岁)
			//合并疾病1 冠心病|2 心房颤动|3 慢性心力衰竭|4 心脏瓣膜病|5 脑血管疾病|6 外周动脉疾病|7 主动脉瘤|8 COPD|9 慢性肾病|10 贫血|11 消化性溃疡|12 甲状腺功能异常|13 恶性肿瘤
			OutComeInfo.put("CHD", "0");
			OutComeInfo.put("AF", "0");
			OutComeInfo.put("SLOW_HEART_FAILURE", "0");
			OutComeInfo.put("AVHD", "0"); //心脏瓣膜病
			OutComeInfo.put("BRIAN_VASCELLUM", "0");
			OutComeInfo.put("PERIPHERAL_ARTERY_DISEASE",  "0");//外周动脉疾病
			OutComeInfo.put("AORTIC_ANEURYSM",  "0");//主动脉瘤
			OutComeInfo.put("COPD", "0");//COPD
			OutComeInfo.put("CHRONIC_KIDNEY_DISEASE",  "0");//慢性肾病
			OutComeInfo.put("ANEMIA", "0");//贫血
			OutComeInfo.put("PEPTIC_ULCER",  "0");//消化性溃疡
			OutComeInfo.put("THYROID_DISEASE", "0");//甲状腺功能异常
			OutComeInfo.put("THERIOMA", "0");//恶性肿瘤

			String HEBZ = xtzlMap.get("HEBZ");
			if(HEBZ != null){
				String[] hebzArr = HEBZ.split(",") ;

				for (String hbz : hebzArr) {
					if ("1".equals(hbz)) {
						OutComeInfo.put("CHD", "1");//冠心病
						OutComeInfo.put("PREVIOUS_REVASCULARIZATION", xtzlMap.get("XYCJS"));//血运重建史
					} /*else {
                        OutComeInfo.put("CHD", "0");
                    }*/

					if ("2".equals(hbz)) {
						OutComeInfo.put("AF", "1");//心房颤动
						OutComeInfo.put("AF_TYPE", xtzlMap.get("XFCDFX"));//心房颤动(分型)
					} /*else {
                        OutComeInfo.put("AF", "0");
                    }*/
					if ("3".equals(hbz)) {
						OutComeInfo.put("SLOW_HEART_FAILURE", "1");//慢性心力衰竭
						OutComeInfo.put("NYHA_LEVEL", xtzlMap.get("ZGNYHA"));//NYHA 分级
					} /*else {
                        OutComeInfo.put("SLOW_HEART_FAILURE", "0");
                    }*/
					//OutComeInfo.put("AVHD", "4".equals(hbz) ? "1" : "0"); //心脏瓣膜病
					if ("4".equals(hbz)) {
						OutComeInfo.put("AVHD", "1");
					}
					if ("5".equals(hbz)) {
						OutComeInfo.put("BRIAN_VASCELLUM", "1");//脑血管疾病
						OutComeInfo.put("BRIAN_VASCELLUM_DESC", xtzlMap.get("NXGJBMS"));//脑血管疾病(描述)
					} /*else {
                        OutComeInfo.put("BRIAN_VASCELLUM", "0");
                    }*/
					//  OutComeInfo.put("PERIPHERAL_ARTERY_DISEASE", "6".equals(hbz) ? "1" : "0");//外周动脉疾病
					if ("6".equals(hbz)) {
						OutComeInfo.put("PERIPHERAL_ARTERY_DISEASE", "1");
					}
					//  OutComeInfo.put("AORTIC_ANEURYSM", "7".equals(hbz) ? "1" : "0");//主动脉瘤
					if ("7".equals(hbz)) {
						OutComeInfo.put("AORTIC_ANEURYSM", "1");
					}
					//   OutComeInfo.put("COPD", "8".equals(hbz) ? "1" : "0");//COPD
					if ("8".equals(hbz)) {
						OutComeInfo.put("COPD", "1");
					}
					//   OutComeInfo.put("CHRONIC_KIDNEY_DISEASE", "9".equals(hbz) ? "1" : "0");//慢性肾病
					if ("9".equals(hbz)) {
						OutComeInfo.put("CHRONIC_KIDNEY_DISEASE", "1");
					}
					//   OutComeInfo.put("ANEMIA", "10".equals(hbz) ? "1" : "0");//贫血
					if ("10".equals(hbz)) {
						OutComeInfo.put("ANEMIA", "1");
					}
					//  OutComeInfo.put("PEPTIC_ULCER", "11".equals(hbz) ? "1" : "0");//消化性溃疡
					if ("11".equals(hbz)) {
						OutComeInfo.put("PEPTIC_ULCER", "1");
					}
					//  OutComeInfo.put("THYROID_DISEASE", "12".equals(hbz) ? "1" : "0");//甲状腺功能异常
					if ("12".equals(hbz)) {
						OutComeInfo.put("THYROID_DISEASE", "1");
					}
					//  OutComeInfo.put("THERIOMA", "13".equals(hbz) ? "1" : "0");//恶性肿瘤
					if ("13".equals(hbz)) {
						OutComeInfo.put("THERIOMA", "1");
					}
				}

			}
			//检查结果
			//72h内肌钙蛋白
			OutComeInfo.put("TROPONIN_72H", xtzlMap.get("JGDB72"));//72h 内肌钙蛋白
			if (isnot(xtzlMap.get("JGDB72"))) {
				OutComeInfo.put("TROPONIN_72H_TYPE", xtzlMap.get("JGDB72LX"));//72h 内肌钙蛋白最高值
				OutComeInfo.put("CTNI_MAX_VALUE", xtzlMap.get("JGDB72ZGZ"));//72h 内肌钙蛋白最高值(数值)
				OutComeInfo.put("CTNI_MAX_VALUE_UNIT", xtzlMap.get("JGDB72DW"));//72h 内肌钙蛋白最高值(单位)
			}
			//脑钠肽BNP
			OutComeInfo.put("BNP", xtzlMap.get("NNT"));//脑钠肽
			if (isnot(xtzlMap.get("NNT"))) {
				OutComeInfo.put("BNP_TYPE", xtzlMap.get("NNTLX"));//脑钠肽类型
				OutComeInfo.put("BNP_VALUE", xtzlMap.get("NNTZGZ"));//脑钠肽(最高值)
			}
			//总胆固醇(TC)
			OutComeInfo.put("TC", xtzlMap.get("ZDGC"));//总胆固醇(TC)
			if (isnot(xtzlMap.get("ZDGC"))) {
				OutComeInfo.put("TC_VALUE", xtzlMap.get("ZDGCSZ"));//总胆固醇(TC)(数值)
			}
			//甘油三酯(TG)
			OutComeInfo.put("TG", xtzlMap.get("GYSZ"));//甘油三酯(TG)
			if (isnot(xtzlMap.get("GYSZ"))) {
				OutComeInfo.put("TG_VALUE", xtzlMap.get("GYSZSZ"));//甘油三酯(TG)(数值)
			}
			//高密度脂蛋白(HDL-C)
			OutComeInfo.put("HDL_C", xtzlMap.get("GMDZDB"));
			if (isnot(xtzlMap.get("ZDGC"))) {
				OutComeInfo.put("HDL_C_VALUE", xtzlMap.get("GMDZDBSZ"));
			}
			//低密度脂蛋白(LDL-C)
			OutComeInfo.put("LDL_C", xtzlMap.get("DMDZDB"));
			if (isnot(xtzlMap.get("ZDGC"))) {
				OutComeInfo.put("LDL_C_VALUE", xtzlMap.get("DMDZDBSZ"));
			}
			//超声心动图
			OutComeInfo.put("UCG", xtzlMap.get("CSXDT"));
			if (isnot(xtzlMap.get("CSXDT"))) {
				OutComeInfo.put("LVEF", xtzlMap.get("LVEF"));
				OutComeInfo.put("VNTRICULAR_ANEURYSM", xtzlMap.get("SHIBL"));
				OutComeInfo.put("PART_VNTRICULAR", xtzlMap.get("JBSBHDYC"));
			}

		}
		if ("6".equals(cyzd)) {
			if(xtzlMap.get("ZGFACSXYXXTLX") != null){
				OutComeInfo.put("NACS_TYPE", xtzlMap.get("ZGFACSXYXXTLX").replaceAll(",", "|"));//非ACS心源性胸痛类型*
			}

		}

		if ("9".equals(cyzd)) {
			if(xtzlMap.get("ZGQTFXYXXTLX") != null) {
				OutComeInfo.put("OTHER_NACS_TYPE", xtzlMap.get("ZGQTFXYXXTLX").replaceAll(",", "|")); //其它非心源性胸痛类型*
			}
		}


		//出院信息
		OutComeInfo.put("HOD", xtzlMap.get("ZYTS"));
		OutComeInfo.put("TOTAL_COST", xtzlMap.get("FEIY"));
		OutComeInfo.put("OUTCOME_CODE", xtzlMap.get("HZZG"));//没数据报错
		if ("1".equals(xtzlMap.get("HZZG"))) {
			if(xtzlMap.get("CYSJ") != null) {
				OutComeInfo.put("LEAVE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CYSJ"))));
			}
			OutComeInfo.put("TREATMENT_RESULT_CODE", xtzlMap.get("ZLJG"));
		}
		if ("2".equals(xtzlMap.get("HZZG"))) {//equals
			if(xtzlMap.get("LKBYDMSJ") != null) {
				OutComeInfo.put("HAND_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("LKBYDMSJ"))));//离开本院大门时间
			}
			OutComeInfo.put("HOSPITAL_NAME", xtzlMap.get("YYMC02"));//医院名称
			OutComeInfo.put("IS_NET_HOSPITAL", xtzlMap.get("SFSWLYY"));//是否是网络医院
			OutComeInfo.put("IS_TRANS_PCI", xtzlMap.get("ZYPCI02"));//转运PCI
			if (isnot(xtzlMap.get("ZYPCI02"))) {
				OutComeInfo.put("IS_DIRECT_CATHETER", xtzlMap.get("ZDDGS02"));
				if(xtzlMap.get("SJJRSSKSSJ") != null) {
					OutComeInfo.put("DECISION_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SJJRSSKSSJ"))));//导丝通过时间
				}
				OutComeInfo.put("BALLOON_EXPANSION_TIME", "");//导丝通过时间  fei
			}
			OutComeInfo.put("REMOTE_ECG_TRANSMISSION", xtzlMap.get("YCXDTCS02"));//远程心电图传输
			if (isnot(xtzlMap.get("YCXDTCS02"))) {
				if(xtzlMap.get("CSXDTZXZDWSJ") != null) {
					OutComeInfo.put("TRANS_ECG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("CSXDTZXZDWSJ"))));//传输心电图至协作单位
				}
				OutComeInfo.put("TRANS_WAY", xtzlMap.get("ZGCSFS"));

			}

			//文档和实际差异，实际无溶栓部分内容
		}
		if ("3".equals(xtzlMap.get("HZZG"))) {
			if(xtzlMap.get("ZKSJ") != null) {
				OutComeInfo.put("TRANSFER_DATE", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZKSJ"))));//转科时间
			}
			OutComeInfo.put("ADMISSION_DEPT", xtzlMap.get("JZKS"));//接诊科室转科时间
			OutComeInfo.put("TRANSFER_REASON", xtzlMap.get("ZKYYMS"));//转科原因描述
		}
		if ("4".equals(xtzlMap.get("HZZG"))) {
			if(xtzlMap.get("SWSJ") != null){
				OutComeInfo.put("DEATH_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("SWSJ"))));//死亡时间
			}

			OutComeInfo.put("DEATH_CAUSE_CODE", xtzlMap.get("SWYY"));// 死亡原因
			//OutComeInfo.put("TRANSFER_REASON", xtzlMap.get("SWYY"));//转科原因描述
			OutComeInfo.put("DEATH_CAUSE_DESC", xtzlMap.get("SWMS"));//死亡描述
		} else {
			if(xtzlMap.get("LYXJ") != null){
				OutComeInfo.put("MISSION_EDUCATION", (""+xtzlMap.get("LYXJ")).replaceAll(",", "|")); // 先写死 //
			}

		}
		//患者情况备注
		OutComeInfo.put("REMARK", xtzlMap.get("ZGHZQKBZ"));


		//住院期间用药
		// if ("4".equals(cyzd) || "5".equals(cyzd)) {
		OutComeInfo.put("IS_JTYW", xtzlMap.get("SFJTYW"));//降糖药物
		if(xtzlMap.get("JTYW") != null){
			OutComeInfo.put("JTYWNAME", ("" + xtzlMap.get("JTYW")).replaceAll(",", "|"));//降糖药物(名称)
		}
		OutComeInfo.put("IS_KNYW", xtzlMap.get("SFKFKYYW"));//口服抗凝药物
		OutComeInfo.put("KNYWNAME", xtzlMap.get("KFKYYW"));//口服抗凝药物(名称)
		OutComeInfo.put("IS_PCSK9", xtzlMap.get("SFPCSK9"));//PCSK9
		OutComeInfo.put("PCSK9_NAME", xtzlMap.get("PCSK9"));//PCSK9 药物名称
		OutComeInfo.put("PCSK9_DOSE", xtzlMap.get("PCSK9DCJL"));//PCSK9 次剂量

		// }
		JSONArray OutDrugDetailList = new JSONArray();

		OutComeInfo.put("OUT_DRUG_IS_DAPT", "");//抗血小板治疗
		OutComeInfo.put("OUT_DRUG_IS_ACEIORARB", "");//ACEI/ARB
		OutComeInfo.put("OUT_DRUG_IS_STATINS", "");//调脂药物
		OutComeInfo.put("OUT_DRUG_IS_RETARDANT", "");//β受体阻滞剂
		//出院带药
		if ("1".equals(cyzd) || "2".equals(cyzd) || "3".equals(cyzd)) {
			//OutComeInfo.put("TYPE", xtzlMap.get("COVID19"));
			OutComeInfo.put("OUT_DRUG_IS_DAPT", xtzlMap.get("CYDYSFKXXBYW"));//抗血小板治疗
			OutComeInfo.put("OUT_DRUG_IS_ACEIORARB", xtzlMap.get("CYDYSFACEI"));//ACEI/ARB
			OutComeInfo.put("OUT_DRUG_IS_STATINS", xtzlMap.get("CYDYSFTZYW"));//调脂药物
			OutComeInfo.put("OUT_DRUG_IS_RETARDANT", xtzlMap.get("CYDYSFSTZZJ"));//β受体阻滞剂
			//抗血小板治疗
			if (isnot(xtzlMap.get("CYDYSFKXXBYW"))) {
				JSONObject OutDrugDetailMap1 = new JSONObject();
				OutDrugDetailMap1.put("ID", null);
				OutDrugDetailMap1.put("TYPE", "1");//类型
				OutDrugDetailMap1.put("NAME", xtzlMap.get("CYDYKXXBYW"));//药物名称
				OutDrugDetailMap1.put("DOSE", xtzlMap.get("CYDYKXXBYWDCJL"));//剂量
				OutDrugDetailMap1.put("RETE_COUNT", xtzlMap.get("CYDYKXXBYWYYPC"));//频次
				OutDrugDetailMap1.put("RETE_TIME", xtzlMap.get("CYDYKXXBYWYYZQ"));//时间
				OutDrugDetailMap1.put("OTHER_DRUG_NAME", "");//其它药物名称
				OutDrugDetailList.add(OutDrugDetailMap1);
			}
			//ACEI/ARB
			if (isnot(xtzlMap.get("CYDYSFACEI"))) {
				JSONObject OutDrugDetailMap2 = new JSONObject();
				OutDrugDetailMap2.put("ID", null);
				OutDrugDetailMap2.put("TYPE", "2");
				OutDrugDetailMap2.put("NAME", Integer.parseInt(xtzlMap.get("CYDYACEI")));
				OutDrugDetailMap2.put("DOSE", xtzlMap.get("CYDYACEIDCJL"));
				OutDrugDetailMap2.put("RETE_COUNT", xtzlMap.get("CYDYACEIYYPC"));
				OutDrugDetailMap2.put("RETE_TIME", xtzlMap.get("CYDYACEIYYZQ"));
				OutDrugDetailMap2.put("OTHER_DRUG_NAME", "");
				OutDrugDetailList.add(OutDrugDetailMap2);
			}
			//调脂药物
			if (isnot(xtzlMap.get("CYDYSFTZYW"))) {
				JSONObject OutDrugDetailMap3 = new JSONObject();
				OutDrugDetailMap3.put("ID", null);
				OutDrugDetailMap3.put("TYPE", "3");
				OutDrugDetailMap3.put("NAME", Integer.parseInt(xtzlMap.get("CYDYTZYW")));
				OutDrugDetailMap3.put("DOSE", xtzlMap.get("CYDYTZYWDCJL"));
				OutDrugDetailMap3.put("RETE_COUNT", xtzlMap.get("CYDYTZYWYYPC"));
				OutDrugDetailMap3.put("RETE_TIME", xtzlMap.get("CYDYTZYWYYZQ"));
				OutDrugDetailMap3.put("OTHER_DRUG_NAME", "");
				OutDrugDetailList.add(OutDrugDetailMap3);
			}
			//β受体阻滞剂
			if (isnot(xtzlMap.get("CYDYSFSTZZJ"))) {
				JSONObject OutDrugDetailMap4 = new JSONObject();
				OutDrugDetailMap4.put("ID", null);
				OutDrugDetailMap4.put("TYPE", "4");
				OutDrugDetailMap4.put("NAME", xtzlMap.get("CYDYSFSTZZJ"));
				OutDrugDetailMap4.put("DOSE", xtzlMap.get("CYDYSFSTZJL"));
				OutDrugDetailMap4.put("RETE_COUNT", xtzlMap.get("CYDYSFSTZPC"));
				OutDrugDetailMap4.put("RETE_TIME", xtzlMap.get("CYDYSFSTZZQ"));
				OutDrugDetailMap4.put("OTHER_DRUG_NAME", "");
				OutDrugDetailList.add(OutDrugDetailMap4);
			}

		}

		//未完成  出院药物方案 fei
		OutComeInfo.put("OUTDRUGDETAILS", OutDrugDetailList);


		// System.out.println("data1"+ "-------------"+ JSON.toJSONString(registerInfoMap));
		// System.out.println("data2"+ "-------------"+ JSON.toJSONString(firstAIDInfoMap));
		// System.out.println("data3"+ "-------------"+ JSON.toJSONString(treatmentInfoMap));
		// System.out.println("data4"+ "-------------"+ JSON.toJSONString(TreatmentPciInfo));
		// System.out.println("data5"+ "-------------"+ JSON.toJSONString(OutComeInfo));

		root.put("OutComeInfo", OutComeInfo);
		String requestBodyString = root.toJSONString();
		System.out.println("root.toJSONString() = " + requestBodyString);

		//请求地址
		//String url = "http://[ip]:[port]/Services/V1.0/ChestPainCenter";
		String url = "https://webapi.chinacpc.org/Services/v1.1/ChestPainCenter";
		String appId = "10003";
		String secretKey = "be5000243f219f471215e01457d9a958";
		String requestId = UUID.randomUUID().toString();
		SimpleDateFormat ft = new SimpleDateFormat("yyyyMMddHHmmss");
		String time = ft.format(new Date());
		StringBuilder sbSignPlain = new StringBuilder(3);
		sbSignPlain.append(time);
		sbSignPlain.append(requestId);
		String sign = HMACSHA256(sbSignPlain.toString().toUpperCase(), secretKey);
		System.out.println("time" + "-------------" + time);
		System.out.println("appId" + "-------------" + appId);
		System.out.println("requestId" + "-------------" + requestId);
		System.out.println("sign" + "-------------" + sign);


		//设置请求头
		HttpPost post = new HttpPost(url);
		post.setHeader("Content-type", "application/json");
		post.setHeader("time", time);
		post.setHeader("appId", appId);
		post.setHeader("requestId", requestId);
		post.setHeader("sign", sign);
		//设置请求体
		post.setEntity(new ByteArrayEntity(requestBodyString.getBytes()));
		CloseableHttpClient httpClient = HttpClients.createDefault();
		CloseableHttpResponse httpResponse = httpClient.execute(post);
		ResultInfo resultInfo = null;
		try {
			HttpEntity entityResponse = httpResponse.getEntity();
			if (entityResponse != null) {
				String result = EntityUtils.toString(entityResponse);
				System.out.println("result" + "--------------------" +result);
				//插入数据库 这块没写
				/*JSONObject result_1 = JSONObject.parseObject(result);
				Object  ResultCode = result_1.get("ResultCode");
				Object  Message = result_1.get("Message");
				Object  Error = result_1.get("Error");
				if(result_1.get("Data") != null){
					Object  Data = result_1.get("Data");
					String Data_1 = JSON.toJSONString(Data);
					JSONObject Data_2 = JSONObject.parseObject(Data_1);
					Object  id=  Data_2.get("REGISTER_ID");
					System.out.println("Data" + "--------------------" +id);
					Map<String, Object> sysdata = new HashMap<>();
					sysdata.put("REGISTER_ID",id);
					System.out.println("sysdata" + "--------------------" +id);
					resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 920, new Object[] {result_1.get("Data")});
				}*/

			}

		} finally {
			httpResponse.close();
		}

		return resultInfo;
	}

	//STEMI 再灌注措施
	public void zgzcs(Map<String, Object> treatmentInfoMap,
					  Map<String, String> xtzlMap) {

		System.out.println("STEMI_MEASURES"+ "-------------"+ xtzlMap.get("ZGZCS"));
		//再灌注措施
		treatmentInfoMap.put("STEMI_MEASURES", xtzlMap.get("ZGZCS"));
		//STEMI-有再灌注-直接 PCI
		if ("1".equals(xtzlMap.get("ZGZCS"))) {
			treatmentInfoMap.put("STEMI_MEASURES_DOCTOR_NAME", xtzlMap.get("JDXPCIYS"));
			if(xtzlMap.get("JDJRSSSJ") != null){
				treatmentInfoMap.put("STEMI_DECISION_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDJRSSSJ"))));//决定介入手术时间
			}
			if(xtzlMap.get("QDDGSSJ") != null) {
				treatmentInfoMap.put("STEMI_START_CONDUIT_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("QDDGSSJ"))));
			}
			if(xtzlMap.get("KSZQTYSJ") != null) {
				treatmentInfoMap.put("STEMI_START_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSZQTYSJ"))));
			}
			if(xtzlMap.get("QSZQTYSJ") != null) {
				treatmentInfoMap.put("STEMI_SIGN_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("QSZQTYSJ"))));
			}
			//导管室  start

			//导管室  end
		}

		//STEMI-有再灌注-溶栓
		if ("2".equals(xtzlMap.get("ZGZCS"))) {
			//再灌注溶栓措施
			//treatmentInfoMap.put("STEMI_MEASURES_THROMBOLYSIS", xtzlMap.get("ZGZRSCS"));
			treatmentInfoMap.put("STEMI_SCREENING", xtzlMap.get("YNRSSC"));//溶栓筛查
			if ("1".equals(xtzlMap.get("YNRSSC"))) {
				treatmentInfoMap.put("STEMI_IS_THROMBOLYSIS", xtzlMap.get("YNRSZL"));//溶栓治疗
				if (isnot(xtzlMap.get("YNRSZL"))) {
					treatmentInfoMap.put("STEMI_IS_DIRECT", xtzlMap.get("YNZDRSCS"));//直达溶栓场所
					treatmentInfoMap.put("STEMI_DIAGNOSIS_UNIT_CODE_DT", xtzlMap.get("YNRSCS"));//溶栓场所
					if(xtzlMap.get("KSZQTYSJ") != null) {
						treatmentInfoMap.put("STEMI_THROM_START_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSZQTYSJ"))));//开始知情同意
					}
					if(xtzlMap.get("YNQSZQTYSSJ") != null) {
						treatmentInfoMap.put("STEMI_THROM_SIGN_AGREE_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNQSZQTYSSJ"))));//签署知情同意书
					}
					if(xtzlMap.get("YNKSRSSJ") != null) {
						treatmentInfoMap.put("STEMI_THROM_START_TIME_DT", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNKSRSSJ"))));//开始溶栓时间
					}
					if(xtzlMap.get("YNRSJSSJ") != null) {
						treatmentInfoMap.put("STEMI_THROM_END_TIME_DT", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("YNRSJSSJ"))));//溶栓结束时间
					}
					treatmentInfoMap.put("STEMI_THROM_DRUG_TYPE_DT", xtzlMap.get("YNYW"));//药物
					treatmentInfoMap.put("STEMI_THROM_DRUG_CODE_DT", xtzlMap.get("YNJL"));//剂量
					treatmentInfoMap.put("STEMI_IS_REPATENCY_DT", xtzlMap.get("YNRSZT"));//溶栓再通
				}
			} else if ("2".equals(xtzlMap.get("YNRSSC"))) {
				treatmentInfoMap.put("STEMI_THROM_CONTRAINDICATION", xtzlMap.get("YNCZJJZ"));//存在禁忌症
			}
			//STEMI-有再灌注-溶栓 --- 补救pci
			if ("1".equals(xtzlMap.get("YNRSSC")) || "2".equals(xtzlMap.get("YNRSSC"))) {
				treatmentInfoMap.put("STEMI_MEASURES_THROMBOLYSIS", xtzlMap.get("ZGZRSCS"));
				if (isnot(xtzlMap.get("YNRSSC"))) {  //  1.救pci  有 决定介入手术时间   2.溶栓后介入 没有 决定介入手术时间
					//决定介入手术时间
					if(xtzlMap.get("JDJRSSSJ") != null) {
						treatmentInfoMap.put("STEMI_DECISION_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDJRSSSJ"))));
					}
				}
				//导管室  start

				//导管室  end
			} else if ("".equals(xtzlMap.get("YNRSSC")) || "null".equals(xtzlMap.get("YNRSSC"))) {
				treatmentInfoMap.put("STEMI_MEASURES_THROMBOLYSIS", xtzlMap.get("ZGZRSCS"));
			}

		}

		//择期介入
		if ("3".equals(xtzlMap.get("ZGZCS"))) {
			if(xtzlMap.get("JDJRSSSJ") != null ) {
				//决定介入手术时间
				treatmentInfoMap.put("STEMI_DECISION_OPERATION_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDJRSSSJ"))));
			}
			if(xtzlMap.get("ZYKSSJ") != null ) {
				//造影开始时间
				treatmentInfoMap.put("STEMI_START_RADIOGRAPHY_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("ZYKSSJ"))));
			}
		}
		//CABG
		if ("4".equals(xtzlMap.get("ZGZCS"))) {
			if(xtzlMap.get("JDCABGSJ") != null ){
				treatmentInfoMap.put("STEMI_DECISION_CABG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("JDCABGSJ"))));
			}
			if(xtzlMap.get("KSCABGSJ") != null ) {
				treatmentInfoMap.put("STEMI_START_CABG_TIME", DateUtil.getDateStrT(DateUtil.parseDateCom(xtzlMap.get("KSCABGSJ"))));
			}
		}
		//转运PCI
		if ("5".equals(xtzlMap.get("ZGZCS"))) {
			treatmentInfoMap.put("STEMI_TPCI_TYPE", xtzlMap.get("ZYPCI"));//radio-转运PCI  0:否 （接收患者） 1:是 （转出患者）
			if (isnot(xtzlMap.get("ZYPCI"))) {
				//导管室  start

				//导管室  end
			}

		}
	}

	public String ynfb() {

		return null;
	}

	/**
	 * 判断是否为1
	 *
	 * @param v
	 * @return
	 */
	public boolean isnot(String v) {
		return "1".equals(v);
	}


	public static void main(String[] args) throws Exception {
		//ecg文件编码
//		File file = new File("E:/work/浙江医院/3.jpg");
//		String encodeImg = ImageUtils.encodeImgageToBase64(file);
//		File data = new File("E:/work/浙江医院/data.txt");
//		if(!data.exists())
//				data.createNewFile();
//		FileOutputStream fos = new FileOutputStream(data);
//		fos.write(encodeImg.getBytes());
//		fos.close();
		Map<String, String> xtzlMap = new HashMap<String, String>();
		Map<String, List<Map<String, String>>> crfplaneMap = new HashMap<String, List<Map<String, String>>>();
		Map<String, Object> registerInfoMap = new HashMap<String, Object>();
		registerInfoMap.put("REGISTER_ID", null);
		registerInfoMap.put("HOSPITAL_ID1", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID2", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID3", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID4", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID5", CpcConfig.HOSPITAL_ID);
		registerInfoMap.put("HOSPITAL_ID6", CpcConfig.HOSPITAL_ID);
		System.out.println(JSON.toJSONString(registerInfoMap));
		List<InputStream> isList = new ArrayList<InputStream>();

	}

	public static String HMACSHA256(String data, String key) throws Exception {
		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
		sha256_HMAC.init(secret_key);
		byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte item : array) {
			sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString();
	}
}
