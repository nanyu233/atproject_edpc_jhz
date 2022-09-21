package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspDiseaseCourseCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;

public interface HspDiseaseCourseCustomMapper {

	HspDiseaseCourseCustom findHspDiseaseCourse(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

	List<HspDiseaseCourseCustom> findHspDiseaseCourseList(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

	int findHspDiseaseCourseTotal(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

	List<HspDiseaseCourseCustom> findHspDiseaseCourseListNotEquals(
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

	String findTreatmentPlanByEmgSeqDc(String emgSeqDr);

	void updDiseaseCourseAfterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

}
