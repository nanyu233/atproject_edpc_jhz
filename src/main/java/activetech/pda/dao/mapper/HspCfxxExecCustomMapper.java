package activetech.pda.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.pda.pojo.dto.HspCfxxExecCustom;
import activetech.pda.pojo.dto.HspCfxxExecQueryDto;

/**
 * 处方信息执行单自定义Mapper
 * @author machaofan
 *
 */
public interface HspCfxxExecCustomMapper {
	
	/**
	 * 获取患者固定时间内所有给药方式去重
	 * @param vstCad
	 * @return
	 */
	List<HspCfxxExecCustom> getDaWayByDate(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 执行单列表（不分组查询）
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	List<HspCfxxExecCustom> getCfxxExec(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
    
	/**
	 * 执行单列表总条数
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	int getCfxxExecListCount(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 执行单列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	List<HspCfxxExecCustom> getCfxxExecList(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 医嘱拆分
	 * @param disposalSeq
	 * @throws Exception
	 */
	void updateAdviceSplit(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 医嘱拆分打印
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	List<HspCfxxExecCustom> adviceSplitPrint(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 打印执行单
	 * @param execSeq
	 */
	void printExec(@Param("disposalSeq") String disposalSeq, @Param("isPrint") String isPrint) throws Exception;
	
	/**
	 * @Description 删除已作废医嘱对应的执行单
	 * @author machaofan
	 * @date 2020年7月31日上午10:40:48
	 * @param daSub
	 * @throws Exception
	 * @return void
	 */
	void deleteCfxxExecByDaSub(@Param("daSub") String daSub) throws Exception;
	
	/**
	 * 医嘱执行列表总条数
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	int getAdviceExecListCount(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 医嘱执行列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	List<HspCfxxExecCustom> getAdviceExecList(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 医嘱执行
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	void updateAdviceExec(HspCfxxExecCustom hspCfxxExecCustom) throws Exception;
	
}