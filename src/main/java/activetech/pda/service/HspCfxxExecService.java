package activetech.pda.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.pda.pojo.dto.HspCfxxExecCustom;
import activetech.pda.pojo.dto.HspCfxxExecQueryDto;

/**
 * 处方执行单信息Service
 * @author machaofan
 *
 */
public interface HspCfxxExecService {
	
	/**
	 * 获取患者固定时间内所有给药方式去重
	 * @param vstCad
	 * @return
	 */
	List<HspCfxxExecCustom> getDaWayByDate(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;

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
	 * @Description 医嘱拆分、(更新最新医嘱、执行单的数据)
	 * @author machaofan
	 * @date 2020年7月20日下午2:02:09
	 * @param hspCfxxExecQueryDto
	 * @throws Exception
	 * @return void
	 */
	void updateAdviceSplit(HspCfxxExecQueryDto hspCfxxExecQueryDto,ActiveUser activeUser) throws Exception;
	
	/**
	 * 医嘱拆分打印列表
	 * @param hspCfxxExecQueryDto
	 * @return
	 */
	List<HspCfxxExecCustom> adviceSplitPrint(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
	/**
	 * 打印执行单
	 * @param execSeqStr
	 */
	void printExec(HspCfxxExecQueryDto hspCfxxExecQueryDto) throws Exception;
	
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
	void updateAdviceExec(HspCfxxExecQueryDto hspCfxxExecQueryDto, ActiveUser activeUser) throws Exception;
}
