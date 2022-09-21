package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.zyyhospital.pojo.domain.IcuPipeInfo;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoCustom;
import activetech.zyyhospital.pojo.dto.IcuPipeInfoQueryDto;

public interface IcuPipeInfoCustomMapper {

	/**
	 * 查询管路管理列表记录数
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	int findPipeInfoCount(IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;
	/**
	 * 查询管路管理列表
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfoCustom> findPipeInfoList(
			IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;
	/**
	 * 获取管路操作历史信息
	 * @param pipeSeq
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfoCustom> findPipeInfoHis(String pipeSeq) throws Exception;
	/**
	 * 获取管理信息
	 * @param icuPipeInfo
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfoCustom> findPipeInfoUseList(IcuPipeInfoCustom icuPipeInfo) throws Exception;
	/**
	 * 获取pipeModl历史记录
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfo> getSearchInfoList(IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;
	/**
	 * 查询管理评估管路数据
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfoCustom> queryPipeInfoByEval(IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;
	/**
	 * 管理评估修改时间查询当前时间点可用管理
	 * @param icuPipeInfoQueryDto
	 * @return
	 * @throws Exception
	 */
	List<IcuPipeInfoCustom> getEvalPipeByTime(IcuPipeInfoQueryDto icuPipeInfoQueryDto) throws Exception;
	/**
	 * 更新管路深度
	 * @param pipeCustom
	 * @throws Exception
	 */
	void mergePipeDpth(IcuPipeInfoCustom pipeCustom) throws Exception;
	/**
	 * 更新管理型号
	 * @param pipeCustom
	 * @throws Exception
	 */
	void mergePipeModl(IcuPipeInfoCustom pipeCustom) throws Exception;
	/**
	 * 插入HIS表
	 * @param pipeCustom
	 * @throws Exception
	 */
	void editPipeInfo(IcuPipeInfoCustom pipeInfoCustom) throws Exception;
	void insertPipeInfoHis(@Param("pipeSeqNew") String pipeSeqNew,
			@Param("pipeSeq") String pipeSeq,@Param("delFlag") String delFlag);
}