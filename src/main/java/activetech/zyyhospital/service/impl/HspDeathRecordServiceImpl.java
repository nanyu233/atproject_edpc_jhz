package activetech.zyyhospital.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.service.SystemConfigService;
import activetech.hospital.dao.mapper.HspEmgInfMapper;
import activetech.hospital.pojo.domain.HspEmgInf;
import activetech.util.StringUtils;
import activetech.util.UUIDBuild;
import activetech.zyyhospital.dao.mapper.HspDeathRecordCustomMapper;
import activetech.zyyhospital.dao.mapper.HspDeathRecordMapper;
import activetech.zyyhospital.dao.mapper.HspDiseaseCourseCustomMapper;
import activetech.zyyhospital.pojo.domain.HspDeathRecord;
import activetech.zyyhospital.pojo.domain.HspDeathRecordExample;
import activetech.zyyhospital.pojo.domain.HspDeathRecordWithBLOBs;
import activetech.zyyhospital.pojo.dto.HspDeathRecordCustom;
import activetech.zyyhospital.pojo.dto.HspDeathRecordQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.service.HspDeathRecordService;

public class HspDeathRecordServiceImpl implements HspDeathRecordService {
	
	@Autowired
	private HspDeathRecordMapper hspDeathRecordMapper;
	@Autowired
	private HspDeathRecordCustomMapper hspDeathRecordCustomMapper;
	@Autowired
	private HspEmgInfMapper hspEmgInfMapper;
	@Autowired
	private SystemConfigService systemConfigService;
	@Autowired
	private HspDiseaseCourseCustomMapper hspDiseaseCourseCustomMapper;
	
	@Override
	public HspDeathRecordCustom findDeathRecord(
			HspDeathRecordQueryDto hspDeathRecordQueryDto) {
		HspDeathRecordCustom custom = hspDeathRecordCustomMapper.findDeathRecord(hspDeathRecordQueryDto);
		if(null == custom){
			String treatmentPlan = hspDiseaseCourseCustomMapper
					.findTreatmentPlanByEmgSeqDc(hspDeathRecordQueryDto.getHspDeathRecordCustom().getEmgSeqDr());
			custom = new HspDeathRecordCustom();
			custom.setTreatmentPlan(treatmentPlan);
		}
		return custom;
	}

	@Override
	public void saveOrUpdateFirst(HspDeathRecordQueryDto hspDeathRecordQueryDto,
			HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception {
		HspDeathRecordCustom custom = hspDeathRecordQueryDto.getHspDeathRecordCustom();
		//判断非空
		HspDeathRecordExample hspDeathRecordExample = new HspDeathRecordExample();
		HspDeathRecordExample.Criteria criteria =  hspDeathRecordExample.createCriteria();
		criteria.andEmgSeqDrEqualTo(custom.getEmgSeqDr());
		List<HspDeathRecord> HspDeathRecord = hspDeathRecordMapper.selectByExample(hspDeathRecordExample);
		
		custom.setUpdateDoc(activeUser.getUsrno());
		custom.setUpdateTime(new Date());
		//修改留观号
		HspEmgInf hspEmgInf = hspEmgInfMapper.selectByPrimaryKey(custom.getEmgSeqDr());
		if(null != hspEmgInf){
			if(StringUtils.isNotNullAndEmptyByTrim(hspDeathRecordQueryDto.getObservationCode())){
				hspEmgInf.setObservationCode(hspDeathRecordQueryDto.getObservationCode());
			}else{
				String observationCode = systemConfigService.findSequences("HSPEMGINF_OBSERVATIONCODE","6","L");
				hspEmgInf.setObservationCode(observationCode);
			}
		}
		if(HspDeathRecord !=null && HspDeathRecord.size()>0){
			if(!StringUtils.isNotNullAndEmptyByTrim(custom.getDeathRecordSeq())){
				custom.setDeathRecordSeq(HspDeathRecord.get(0).getDeathRecordSeq());
			}
			custom.setCreateTime(HspDeathRecord.get(0).getCreateTime());
			hspDeathRecordMapper.updateByPrimaryKeyWithBLOBs(custom);
		}else{
			HspDeathRecordExample example = new HspDeathRecordExample();
			HspDeathRecordExample.Criteria criteria2 = example.createCriteria();
			criteria2.andEmgSeqDrEqualTo(custom.getEmgSeqDr());
			List<HspDeathRecord> list = hspDeathRecordMapper.selectByExample(example);
			if(StringUtils.isNotNullAndZero(list)) {
				return;
			}
			custom.setDeathRecordSeq(UUIDBuild.getUUID());
			custom.setCreateTime(new Date());
			hspDeathRecordMapper.insert(custom);
		}
		//更新hsp_emg_inf 里的 留观号
		hspEmgInfMapper.updateByPrimaryKey(hspEmgInf);
	}

	@Override
	public void deleteDeathRecord(String deathRecordSeq) {
		hspDeathRecordMapper.deleteByPrimaryKey(deathRecordSeq);
	}

}
