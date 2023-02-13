package activetech.eicu.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.eicu.pojo.domain.IcuGradeRisk;
import activetech.eicu.pojo.domain.IcuGradeTotal;
import activetech.eicu.pojo.dto.IcuGradeRiskCustom;
import activetech.eicu.pojo.dto.IcuGradeTotalCustom;
import activetech.eicu.pojo.dto.IcuMenuDefCustom;
import activetech.eicu.pojo.dto.IcuScoreQueryDto;

public interface IcuScoreService {

	/**
	 *获取对应评分的列表数据
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuGradeTotalCustom> queryGradeList(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取子项信息
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	Map<String,Object> findGradeInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 增加或修改评分
	 * @param icuScoreQueryDto
	 * @param activeUser
	 * @throws Exception
	 */
	String editGradSco(IcuScoreQueryDto icuScoreQueryDto, ActiveUser activeUser) throws Exception;
	/**
	 * 删除评分
	 * @param icuScoreQueryDto
	 * @throws Exception
	 */
	void delGradeScore(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取最近6次或根据时间获取评分数据(时间不存在则获取最近6次数据)
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> queryScoreInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取评分项目定义表
	 * @param gradeType
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> getGradeItemDef(String gradeType) throws Exception;
	/**
	 * 获取评分评估最新情况
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> queryTotalScoByMenu(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
	/**
	 * 获取评分总项信息
	 * @param gradeTot
	 * @return
	 * @throws Exception
	 */
	IcuGradeTotal queryGradeTotBySeq(IcuGradeTotal gradeTot) throws Exception;
	/**
	 * 获取评分风险度列表
	 * @param icuScoreQueryDto
	 * @return
	 * @throws Exception
	 */
	Map<String, List<IcuGradeRiskCustom>> queryGradeRisk(String gradeType) throws Exception;
	List<IcuMenuDefCustom> findIcuCustMenu(String moduleId) throws Exception;
	IcuGradeTotalCustom editGradeScoWithOth(IcuScoreQueryDto icuScoreQueryDto, ActiveUser activeUser) throws Exception;
	List<IcuGradeTotalCustom> getIcuGradeTotalByLiveNo(IcuScoreQueryDto icuScoreQueryDto) throws Exception;
}
