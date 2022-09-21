package activetech.zyyhospital.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseCustom;
import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;

public interface HspDiseaseCourseService {

	HspDiseaseCourseCustom findHspDiseaseCourse(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception;

	List<HspDiseaseCourseCustom> findHspDiseaseCourseList(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception;

	String saveOrUpdate(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto, ActiveUser activeUser) throws Exception;

	void deleteDiseaseCourse(String diseaseCourseSeq) throws Exception;

	void saveOrUpdateFirst(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto,
			HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser) throws Exception;

	int findHspDiseaseCourseTotal(
			HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);

	List<Object> findAllHspDiseaseCourseList(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception;

	void afterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto) throws Exception;


}
