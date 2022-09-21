package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.pojo.dto.HspOperateInfQueryDto;


public interface HspOperateInfCustomMapper {
	
	/**
	 * 查询手术操作列表总数
	 * @param hspOperateInfQueryDto
	 * @return
	 */
	int findOperateListCount(HspOperateInfQueryDto hspOperateInfQueryDto);
	
	/**
	 * 通过emg_seq查询该患者的手术操作列表数据
	 * @param hspOperateInfQueryDto
	 * @return
	 */
	List<HspOperateInfCustom> findOperateListByEmgSeq(HspOperateInfQueryDto hspOperateInfQueryDto);
	
	/**
	 * 手术操作列表打印
	 * @param hspLqbljlQueryDto
	 * @return
	 */
	List<HspOperateInfCustom> findOperateListPrint(HspLqbljlQueryDto hspLqbljlQueryDto);
	
	/**
	 * 修改打印状态
	 * @param hspDiseaseCourseQueryDto
	 * @return
	 */
	int updOperateAfterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);
}