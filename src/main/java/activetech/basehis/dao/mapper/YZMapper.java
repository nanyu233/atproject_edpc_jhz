package activetech.basehis.dao.mapper;

import java.util.List;

import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;


public interface YZMapper {
	/**
	 * 获取医嘱列表数据(HIS)
	 * @param hspCfxxInfoCustom
	 * @return
	 */
	public  List<HspCfxxInfoCustom> findCfxxDataByHisList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto);
		
	/**
	 * 获取医嘱列表数据(本地处方表)
	 * @param hspCfxxInfoQueryDto
	 * @return
	 */
	public  List<HspCfxxInfoCustom> findCfxxDataByLocalList(HspCfxxInfoQueryDto hspCfxxInfoQueryDto);
}
