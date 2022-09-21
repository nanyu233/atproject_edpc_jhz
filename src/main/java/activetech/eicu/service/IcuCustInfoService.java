package activetech.eicu.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.eicu.pojo.dto.IcuCustInfoCustom;
import activetech.eicu.pojo.dto.IcuCustInfoQueryDto;
import activetech.eicu.pojo.dto.IcuMenuDefCustom;
import activetech.eicu.pojo.dto.IcuScoreQueryDto;
import activetech.eicu.pojo.dto.IcuVitlIoQueryDto;
import activetech.zyyhospital.pojo.dto.HspHljldInfCustom;
/**
 * ICU患者信息Service
 * <p>Title: IcuCustInfoService.java IcuCustInfoService</p>
 * <p>Description: </p>
 * <p>Company: activetech</p>
 * @author 
 * @date 2019年2月21日 上午9:45:16
 *
 */
public interface IcuCustInfoService {

	/**
	 * 
	 * @param icuCustInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	Map<String, Object> getOverviewInfo(IcuCustInfoQueryDto icuCustInfoQueryDto) throws Exception;

	Map<String, Object> queryVitlChartInfo(IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception;

	Map<String, Object> queryTotalScoChartInfo(IcuScoreQueryDto icuScoreQueryDto) throws Exception;

	List<HspHljldInfCustom> queryIoChartInfo(IcuVitlIoQueryDto icuVitlIoQueryDto) throws Exception;
}
