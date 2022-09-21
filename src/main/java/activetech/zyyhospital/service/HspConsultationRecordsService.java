package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ResultInfo;
import activetech.zyyhospital.pojo.domain.HspConsultationRecords;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;

public interface HspConsultationRecordsService {

	List<HspConsultationRecordsCustom> findHspConsultationRecordsList(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception;

	HspConsultationRecordsCustom findHspConsultationRecords(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto) throws Exception;

	String saveOrUpdate(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto, ActiveUser activeUser) throws Exception;

	void deleteConsultation(String consultationRecordsSeq) throws Exception;

	int findHspConsultationRecordsTotal(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);
	
	HspConsultationRecords selectByPrimaryKey(String consultationRecordsSeq);
	
	public ResultInfo getConsulationInf(String emgSeq);

}
