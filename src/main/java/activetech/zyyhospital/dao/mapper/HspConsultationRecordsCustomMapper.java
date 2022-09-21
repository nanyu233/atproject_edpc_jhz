package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;

public interface HspConsultationRecordsCustomMapper  {

	List<HspConsultationRecordsCustom> findHspConsultationRecordsList(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	HspConsultationRecordsCustom findHspConsultationRecords(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	List<HspConsultationRecordsCustom> findHspConsultationRecordsAvgListByYear(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	List<HspConsultationRecordsCustom> findHspConsultationRecordsAvgListByMonth(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	List<HspConsultationRecordsCustom> findHspConsultationRecordsAvgListByDay(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	List<HspConsultationRecordsCustom> findHspConsultationRecordsAvgListByHalfyear(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	List<HspConsultationRecordsCustom> findHspConsultationRecordsAvgTotalListHalfyear(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	List<HspConsultationRecordsCustom> findHspConsultationRecordsAvgTotalList(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);

	int findHspConsultationRecordsTotal(
			HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto);
	
	List<HspConsultationRecordsCustom> findHspConsultationRecordsByInvitationDepLike(
			@Param(value = "emgSeq")String emgSeq);

	HspConsultationRecordsCustom findCzHzInfEmgSeqJR(@Param(value = "emgSeq")String emgSeq);

}
