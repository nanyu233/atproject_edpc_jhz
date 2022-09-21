package activetech.aid.service.impl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.aid.dao.mapper.AidPatientMapper;
import activetech.aid.dao.mapper.AidPatientMapperCustom;
import activetech.aid.dao.mapper.AidPatientXtMapper;
import activetech.aid.dao.mapper.AidPatientXtMapperCustom;
import activetech.aid.pojo.domain.AidPatient;
import activetech.aid.pojo.domain.AidPatientXt;
import activetech.aid.pojo.dto.AidPatientQueryDto;
import activetech.aid.service.AidService;
import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.util.StringUtils;

public class AidServiceImpl implements AidService {

	@Autowired
	private AidPatientMapperCustom aidPatientMapperCustom;

	@Autowired
	private AidPatientMapper aidPatientMapper;

	@Autowired
	private AidPatientXtMapperCustom aidPatientXtMapperCustom;

	@Autowired
	private AidPatientXtMapper aidPatientXtMapper;

	@Autowired
	private SystemConfigService systemConfigService;
	
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;

	@Override
	public ResultInfo mergeAidpatient(AidPatientQueryDto aidPatientQueryDto, ActiveUser activeUser) {

		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		/*
		 * AidPatient aidPatient = aidPatientQueryDto.getAidPatient();
		 * aidPatientMapperCustom.mergeAidPatient(aidPatient); AidPatientXt aidPatientXt
		 * = aidPatientQueryDto.getAidPatientXt();
		 * aidPatientXtMapperCustom.mergeAidPatientXt(aidPatientXt); HspEmgInf hspEmgInf
		 * = aidPatientQueryDto.getHspEmgInf();
		 * hspEmgInfCustomMapper.mergeHspEmgInf(hspEmgInf);
		 * aidPatientXtMapper.insert(aidPatientXt);
		 * aidPatientMapperCustom.insertAidPatient(aidPatient); patid =
		 * aidPatient.getPatid(); aidPatientXt.setXtSeq(patid);
		 * aidPatientXtMapper.insert(aidPatientXt); resultInfo =
		 * ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		 */
		// 1。获取patid 判断是第一次保存还是后续修改
		AidPatient aidPatient = aidPatientQueryDto.getAidPatient();
		AidPatientXt aidPatientXt = aidPatientQueryDto.getAidPatientXt();

		// 获取aidPatientQueryDto中的抗血小板药物下拉列表value参数
		String kxxbyw = aidPatientQueryDto.getKxxbyw();
		// aspl(阿司匹林 固定为300mg)
		BigDecimal aspl = new BigDecimal(300);
		// "1"理解为第一种用药(阿司匹林300mg+替格瑞洛180mg)
		if ("1".equals(kxxbyw)) {
			aidPatientXt.setAspl(aspl);
			aidPatientXt.setTgrl(new BigDecimal(180));// 替格瑞洛固定为180mg
			aidPatientXt.setLpgl(null);// 氯吡格雷为空
		} else if ("2".equals(kxxbyw)) {// "2"理解为第二种用药(阿司匹林300mg+氯吡格雷300mg)
			aidPatientXt.setAspl(aspl);
			aidPatientXt.setTgrl(null);// 替格瑞洛为空
			aidPatientXt.setLpgl(new BigDecimal(300));// 氯吡格雷固定为300mg
		}

		String patid = aidPatient.getPatid();
		aidPatientXt.setDjry(activeUser.getUsrno());// 登记人(不用修改)
		aidPatientXt.setDjrymc(activeUser.getUsrname());// 登记人员名称
		aidPatientXt.setDjsj(new Date());// 登记时间
		// 非空校验
		if (StringUtils.isNotNullAndEmptyByTrim(patid)) {
			// patid不为空
			aidPatientMapper.updateByPrimaryKey(aidPatient);
			aidPatientXt.setXtSeq(patid);
			aidPatientXtMapper.updateByPrimaryKey(aidPatientXt);
		} else {
			patid = systemConfigService.findSequences("AID_PATIENT_PATID", "8", null);// 取序列patid
			aidPatient.setPatid(patid);
			aidPatient.setCrttime(new Date());
			aidPatient.setCrtuserid(activeUser.getUsrno());
			aidPatient.setIsbind("1");
			aidPatientMapper.insert(aidPatient);
			aidPatientXt.setXtSeq(patid);
			aidPatientXtMapper.insert(aidPatientXt);
			
			// 维护绑定关系
			HspEmgInf record = new HspEmgInf();
			record.setEmgSeq(aidPatientQueryDto.getHspEmgInf().getEmgSeq());
			record.setPatid(patid);
			hspEmgInfMapper.updateByPrimaryKeySelective(record);
		}

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("patid", patid);
		resultInfo.setSysdata(map);
		return resultInfo;
	}

	@Override
	public ResultInfo getPatInfoByEmgSeq(String patid) {
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);

		if (StringUtils.isNotNullAndEmptyByTrim(patid)) {
			Map<String, Object> sysdata = new HashMap<>();
			AidPatient aidPatient = aidPatientMapper.selectByPrimaryKey(patid);
			AidPatientXt aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(patid);

			String kxxbyw = null;
			if (aidPatientXt != null && aidPatientXt.getAspl() != null) {// 阿司匹林
				if (aidPatientXt.getTgrl() != null && aidPatientXt.getLpgl() == null) {// 阿司匹林300mg+替格瑞洛180mg(用药名称),氯吡格雷不用
					kxxbyw = "1";
				} else if (aidPatientXt.getTgrl() == null && aidPatientXt.getLpgl() != null) {// 阿司匹林300mg+氯吡格雷300mg,替格瑞洛不用
					kxxbyw = "2";
				}
			}
			sysdata.put("aidPatient", aidPatient);
			sysdata.put("aidPatientXt", aidPatientXt);
			sysdata.put("kxxbyw", kxxbyw);
			resultInfo.setSysdata(sysdata);
		} else {

		}

		return resultInfo;
	}

	@Override
	public ResultInfo getPatInfo(String emgSeq, String wayTyp) {
		
		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		
		String patid = null;
		
		if("0".equals(wayTyp)) {
			HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(emgSeq);
			patid = hspEmgInf.getPatid();
		}else if("1".equals(wayTyp)||"2".equals(wayTyp)) {
			patid = emgSeq;
		}
		if (StringUtils.isNotNullAndEmptyByTrim(patid)) {
			Map<String, Object> sysdata = new HashMap<>();
			AidPatient aidPatient = aidPatientMapper.selectByPrimaryKey(patid);
			AidPatientXt aidPatientXt = aidPatientXtMapper.selectByPrimaryKey(patid);

			String kxxbyw = null;
			if (aidPatientXt != null && aidPatientXt.getAspl() != null) {// 阿司匹林
				if (aidPatientXt.getTgrl() != null && aidPatientXt.getLpgl() == null) {// 阿司匹林300mg+替格瑞洛180mg(用药名称),氯吡格雷不用
					kxxbyw = "1";
				} else if (aidPatientXt.getTgrl() == null && aidPatientXt.getLpgl() != null) {// 阿司匹林300mg+氯吡格雷300mg,替格瑞洛不用
					kxxbyw = "2";
				}
			}
			sysdata.put("aidPatient", aidPatient);
			sysdata.put("aidPatientXt", aidPatientXt);
			sysdata.put("kxxbyw", kxxbyw);
			resultInfo.setSysdata(sysdata);
		} else {

		}

		return resultInfo;
	}
}
