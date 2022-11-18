package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.context.Config;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.ResultUtil;
import activetech.base.service.SystemConfigService;
import activetech.basehis.dao.mapper.HspAotographInfoCustomMapper;
import activetech.basehis.pojo.dto.HspAotographInfoCustom;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsCustomMapper;
import activetech.zyyhospital.dao.mapper.HspConsultationRecordsMapper;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.domain.HspConsultationRecordsExample;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.service.HspConsultationRecordsService;

public class HspConsultationRecordsServiceImpl implements HspConsultationRecordsService {

	@Autowired
	private HspConsultationRecordsCustomMapper hspConsultationRecordsCustomMapper;
	@Autowired
	private HspConsultationRecordsMapper hspConsultationRecordsMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspAotographInfoCustomMapper hspAotographInfoCustomMapper;
	
	@Override
	public List<HspConsultationRecordsCustom> findHspConsultationRecordsList(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) {
		List<HspConsultationRecordsCustom> hspConsultationRecordsList = hspConsultationRecordsCustomMapper.findHspConsultationRecordsList(hspConsultationRecordsQueryDto);
		for (HspConsultationRecordsCustom hspConsultationRecordsCustom : hspConsultationRecordsList) {
			HspAotographInfoCustom hspAotographInfoCustom = new HspAotographInfoCustom();
			hspAotographInfoCustom.setRelevanceId(hspConsultationRecordsCustom.getConsultationRecordsSeq());
			hspAotographInfoCustom.setDocumentTable("HSP_CONSULTATION_RECORDS");
			hspAotographInfoCustom.setDocumentType("1");
			List<HspAotographInfoCustom> hspAotographInfoApplyList = hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
			hspAotographInfoCustom.setDocumentType("2");
			List<HspAotographInfoCustom> hspAotographInfoReplyList = hspAotographInfoCustomMapper.findDzqmImg(hspAotographInfoCustom);
			hspConsultationRecordsCustom.setHspAotographInfoApplyList(hspAotographInfoApplyList);
			hspConsultationRecordsCustom.setHspAotographInfoReplyList(hspAotographInfoReplyList);
		}
		return hspConsultationRecordsList;
	}

	@Override
	public HspConsultationRecordsCustom findHspConsultationRecords(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) {
		return hspConsultationRecordsCustomMapper.findHspConsultationRecords(hspConsultationRecordsQueryDto);
	}

	@Override
	public String saveOrUpdate(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto,
			ActiveUser activeUser) throws Exception {
		//保存后返回唯一键
		String onlySeq = "";
		String nullstr = this.updateHspConsultationRecordsCustomNotNullAndEmptyByTrim(hspConsultationRecordsQueryDto);
	    if(StringUtils.isNotNullAndEmptyByTrim(nullstr)){
	    	ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 911,new Object[] { nullstr}));
		}
	    String recordFlag = hspConsultationRecordsQueryDto.getRecordFlag();
	    HspConsultationRecordsCustom custom = hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom();
		String consultationRecordsSeq = custom.getConsultationRecordsSeq();
		//修改留观号
		 HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(custom.getEmgSeqCr());
		if(null != hspEmgInf ){
			if(!StringUtils.isNotNullAndEmptyByTrim(hspConsultationRecordsQueryDto.getObservationCode())){
				String observationCode = systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
				hspEmgInf.setObservationCode(observationCode);
				hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
			}
		}
	
		if(StringUtils.isNotNullAndEmptyByTrim(consultationRecordsSeq)){
			HspConsultationRecords records = hspConsultationRecordsMapper.selectByPrimaryKey(custom.getConsultationRecordsSeq());			
			if(null != records && "apply".equals(recordFlag)){
				onlySeq = this.updateApplySubmit(activeUser, custom, records);
			}
			if(null != records && "reply".equals(recordFlag)){
				onlySeq = this.updateReplySubmit(activeUser, custom, records);
			}
			if(null != records && "qd".equals(recordFlag)){
				onlySeq = this.updateQdSubmit(activeUser, custom, records);
			}
			return onlySeq;
		}
		custom.setConsultationRecordsSeq(UUIDBuild.getUUID());
		custom.setApplyUpdateDate(new Date());
		custom.setApplyUpdateDoc(activeUser.getUsrno());
		custom.setApplyCreateDate(custom.getApplyUpdateDate());
		hspConsultationRecordsMapper.insert(custom);
		return custom.getConsultationRecordsSeq();
	}

	private String updateReplySubmit(ActiveUser activeUser,
			HspConsultationRecordsCustom custom, HspConsultationRecords records) {
		custom.setInvitationDate(records.getInvitationDate());
		custom.setInvitationDep(records.getInvitationDep());
		custom.setInvitationDocCod(records.getInvitationDocCod());
		custom.setInvitationDocNme(records.getInvitationDocNme());
		custom.setIllnessState(records.getIllnessState());
		custom.setObjective(records.getObjective());
		custom.setApplyCreateDate(records.getApplyCreateDate());
		custom.setApplyDoc(records.getApplyDoc());
		custom.setApplyUpdateDate(records.getApplyCreateDate());
		custom.setApplyUpdateDoc(records.getApplyDoc());
		custom.setApplyDocName(records.getApplyDocName());
		custom.setReplyUpdateDate(new Date());
		custom.setReplyUpdateDoc(activeUser.getUsrno());
		if(StringUtils.isNotNullAndEmptyByTrim(records.getConsultationDate())){
			custom.setQdhsDate(records.getQdhsDate());
			custom.setQdhsName(records.getQdhsName());
		}else{
			custom.setQdhsName(activeUser.getUsrname());
		}
		hspConsultationRecordsMapper.updateByPrimaryKeyWithBLOBs(custom);
		return records.getConsultationRecordsSeq();
	}

	private String updateQdSubmit(ActiveUser activeUser,
			HspConsultationRecordsCustom custom, HspConsultationRecords records) {
		custom.setInvitationDate(records.getInvitationDate());
		custom.setInvitationDep(records.getInvitationDep());
		custom.setInvitationDocCod(records.getInvitationDocCod());
		custom.setInvitationDocNme(records.getInvitationDocNme());
		custom.setIllnessState(records.getIllnessState());
		custom.setObjective(records.getObjective());
		custom.setApplyCreateDate(records.getApplyCreateDate());
		custom.setApplyDoc(records.getApplyDoc());
		custom.setApplyUpdateDate(records.getApplyCreateDate());
		custom.setApplyUpdateDoc(records.getApplyDoc());
		custom.setApplyDocName(records.getApplyDocName());
		custom.setReplyUpdateDate(new Date());
		custom.setConsultationOpinion(records.getConsultationOpinion());
		custom.setReplyUpdateDoc(activeUser.getUsrno());
		custom.setReplyDoc(records.getReplyDoc());
		custom.setReplyContent(records.getReplyContent());
		custom.setReplyDep(records.getReplyDep());
		custom.setReplyDocName(records.getReplyDocName());
		if(StringUtils.isNotNullAndEmptyByTrim(records.getConsultationDate())){
			custom.setQdhsDate(records.getQdhsDate());
			custom.setQdhsName(records.getQdhsName());
		}else{
			custom.setQdhsName(activeUser.getUsrname());
		}
		hspConsultationRecordsMapper.updateByPrimaryKeyWithBLOBs(custom);
		return records.getConsultationRecordsSeq();
	}
	
	private String updateApplySubmit(ActiveUser activeUser,
			HspConsultationRecordsCustom custom, HspConsultationRecords records) {
		custom.setConsultationOpinion(records.getConsultationOpinion());
		custom.setApplyCreateDate(records.getApplyCreateDate());
		custom.setApplyUpdateDoc(activeUser.getUsrno());
		custom.setApplyUpdateDate(new Date());
		custom.setReplyDoc(records.getReplyDoc());
		custom.setReplyUpdateDoc(records.getReplyUpdateDoc());
		custom.setReplyUpdateDate(records.getReplyUpdateDate());
		custom.setReplyContent(records.getReplyContent());
		custom.setReplyDep(records.getReplyDep());
		custom.setReplyDocName(records.getReplyDocName());
		if(StringUtils.isNotNullAndEmptyByTrim(records.getConsultationDate())){
			custom.setQdhsDate(records.getQdhsDate());
			custom.setQdhsName(records.getQdhsName());
		}else{
			custom.setQdhsName(activeUser.getUsrname());
		}
		hspConsultationRecordsMapper.updateByPrimaryKeyWithBLOBs(custom);
		return records.getConsultationRecordsSeq();
	}

	@Override
	public void deleteConsultation(String consultationRecordsSeq) {
		hspConsultationRecordsMapper.deleteByPrimaryKey(consultationRecordsSeq);
	}

	//非空判断
	public String updateHspConsultationRecordsCustomNotNullAndEmptyByTrim(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto){
		HspConsultationRecordsCustom custom = hspConsultationRecordsQueryDto.getHspConsultationRecordsCustom();
		String recordFlag = hspConsultationRecordsQueryDto.getRecordFlag();
		//机构名称
		if(!StringUtils.isNotNullAndEmptyByTrim(custom.getEmgSeqCr())){
			return "预检号";
		}
		if(!StringUtils.isNotNullAndEmptyByTrim(recordFlag)){
			return "会诊记录类型";
		}
		return null;
	}

	@Override
	public int findHspConsultationRecordsTotal(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) {
		return hspConsultationRecordsCustomMapper.findHspConsultationRecordsTotal(hspConsultationRecordsQueryDto);
	}

	@Override
	public HspConsultationRecords selectByPrimaryKey(String consultationRecordsSeq) {
		return hspConsultationRecordsMapper.selectByPrimaryKey(consultationRecordsSeq);
	}
	
	@Override
	public ResultInfo getConsulationInf(String emgSeq) {

		ResultInfo resultInfo = ResultUtil.createSuccess(Config.MESSAGE, 906, null);
		if (StringUtils.isNotNullAndEmptyByTrim(emgSeq)) {

			HspConsultationRecordsExample example = new HspConsultationRecordsExample();
			HspConsultationRecordsExample.Criteria criteria = example.createCriteria();
			criteria.andEmgSeqCrEqualTo(emgSeq);

			// 约定只显示心内科的，并且按发起会诊时间倒序取第一条
			
			// criteria.andInvitationDepLike("%心血管%");
			// criteria.andInvitationDepLike("%心内科%");
			example.setOrderByClause("invitation_date");
			
			List<HspConsultationRecords> list = hspConsultationRecordsMapper.selectByExample(example);
			Map<String, Object> sysdata = new HashMap<>();
			Date invitationDate = null;
			Date consulationDate = null;
			if (list.size() > 0) {
				HspConsultationRecords real = null;
				boolean re = true;
				for(HspConsultationRecords hspConsultationRecords :list) {
					String invitationDep = hspConsultationRecords.getInvitationDep();
					if(invitationDep.indexOf("心血管")>=0
						|| invitationDep.indexOf("心内科")>=0) {
						real = hspConsultationRecords;
						re = false;
						break;
					}
				}
				if(re) {
					real = list.get(0);
				}
				invitationDate = real.getInvitationDate();
				consulationDate = real.getConsultationDate();
			} 
			sysdata.put("invitationDate", invitationDate);
			sysdata.put("consulationDate", consulationDate);
			resultInfo.setSysdata(sysdata);
		}

		return resultInfo;
	}
	
}
