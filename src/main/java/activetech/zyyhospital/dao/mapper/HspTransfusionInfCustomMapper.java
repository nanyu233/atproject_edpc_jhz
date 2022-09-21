package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspDiseaseCourseQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfCustom;
import activetech.zyyhospital.pojo.dto.HspTransfusionInfQueryDto;

public interface HspTransfusionInfCustomMapper {

	/**
	 * 查询输血记录条数
	 * @param hspTransfusionInfQueryDto
	 * @return
	 * @throws Exception
	 */
	int findTransfusionCountByEmgSeq(HspTransfusionInfQueryDto hspTransfusionInfQueryDto) throws Exception;
	
	/**
	 * 查询输血记录列表
	 * @param hspTransfusionInfQueryDto
	 * @return
	 * @throws Exception
	 */
	List<HspTransfusionInfCustom> findTransfusionListByEmgSeq(HspTransfusionInfQueryDto hspTransfusionInfQueryDto) throws Exception;
	
	/**
	 * 输血记录打印
	 * @param hspLqbljlQueryDto
	 * @return
	 * @throws Exception
	 */
	List<HspTransfusionInfCustom> findTransfusionListPrint(HspLqbljlQueryDto hspLqbljlQueryDto);
	
	/**
	 * 修改打印状态
	 * @param hspDiseaseCourseQueryDto
	 */
	void updTransfusionAfterPrint(HspDiseaseCourseQueryDto hspDiseaseCourseQueryDto);
}