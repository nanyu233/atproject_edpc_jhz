package activetech.eicu.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.eicu.pojo.domain.IcuGradeSubitem;
import activetech.eicu.pojo.dto.IcuCustInfoQueryDto;
import activetech.eicu.pojo.dto.IcuGradeRiskCustom;
import activetech.eicu.pojo.dto.IcuGradeSubitemCustom;
import activetech.eicu.pojo.dto.IcuGradeTotalCustom;
import activetech.eicu.pojo.dto.IcuScoreQueryDto;


public interface IcuScoreCustomMapper {
	/**
	 *  获取对应评分的列表数据
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeTotalCustom> queryGradeList(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 增加或修改评分总表
	 * @param gradeTotal
	 * @throws Exception
	 */
	void addOrEditGradeTotal(IcuGradeTotalCustom gradeTotal) throws Exception;
	/**
	 *护理记录单查询评分
	 * @param icuCustInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeTotalCustom> queryGradeForCare(IcuCustInfoQueryDto icuCustInfoQueryDto) throws Exception;
	/**
	 * 查询评分总信息
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	IcuGradeTotalCustom findTotalInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取对应评分的子项数据(icu_grade_item_def)
	 * @param icuScoreQueryDto
	 * @return
	 */
	List<IcuGradeSubitem> querySubItemListByItemDef(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取最近6次或根据时间获取评分数据(时间不存在则获取最近6次数据)(头数据)
	 * @param icuScoreQueryDto
	 * @throws Exception
	 */
	List<IcuGradeTotalCustom> queryGradeHead(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取最近6次或根据时间获取评分数据(时间不存在则获取最近6次数据)
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeSubitemCustom> queryGradeItemList(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取评分评估最新的评分情况
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeTotalCustom> queryTotalScoByMenu(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取
	 * @param gradeType
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeRiskCustom> queryGradeRisk(@Param(value="gradeType")String gradeType) throws Exception;
	
	/**
	 *  获取对应评分的列表数据
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeTotalCustom> queryGradeListByLiveNo(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
}
