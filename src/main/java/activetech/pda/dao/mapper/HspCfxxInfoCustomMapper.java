package activetech.pda.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;

/**
 * 处方信息自定义Mapper
 * @author machaofan
 *
 */
public interface HspCfxxInfoCustomMapper {
    
	/**
	 * 获取患者数据
	 * @param emgSeq 预检号
	 * @return
	 */
	HspemginfCustom getEmgInfData(@Param("emgSeq") String emgSeq) throws Exception;
	
	/**
	 * 获取处方信息（HIS视图）
	 * @param hspCfxxInfoQueryDto
	 */
	List<HspCfxxInfoCustom> getCfxxDataByHis(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
	
	/**
	 * 获取处方信息（本地处方表）
	 * @param hspCfxxInfoQueryDto
	 */
	List<HspCfxxInfoCustom> getCfxxDataByLocal(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
	
	/**
	 * @Description 不通过组号去重合并取视图数据
	 * @author machaofan
	 * @date 2020年7月21日上午9:53:43
	 * @param hspCfxxInfoQueryDto
	 * @return
	 * @throws Exception
	 * @return List<HspCfxxInfoCustom>
	 */
	List<HspCfxxInfoCustom> findCfxxListByHis(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
	
	/**
	 * @Description 不通过组号去重合并取本地处方表数据
	 * @author machaofan
	 * @date 2020年7月21日上午9:57:27
	 * @param hspCfxxInfoQueryDto
	 * @return
	 * @throws Exception
	 * @return List<HspCfxxInfoCustom>
	 */
	List<HspCfxxInfoCustom> findCfxxListByLocal(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
	
	/**
	 * @Description 医嘱拆分获取最新医嘱数据，对已核对数据部分字段进行修改
	 * @author machaofan
	 * @date 2020年7月21日上午10:29:49
	 * @param hspCfxxInfoQueryDto
	 * @throws Exception
	 * @return void
	 */
	void updateCfxxInfo(HspCfxxInfoQueryDto hspCfxxInfoQueryDto) throws Exception;
	
}