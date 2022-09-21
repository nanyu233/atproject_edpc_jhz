package activetech.base.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.base.pojo.dto.DstoperationCustom;
import activetech.base.pojo.dto.DstoperationQueryDto;

/**
 * 
 * <p>Title:DstoperationCustomMapper</p>
 * <p>Description:基础信息配置表</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月17日 下午5:33:05
 *
 */
public interface DstoperationCustomMapper  {
	/**
	 * 根据moduleid获取操作总数
	 * @param moduleid
	 * @return
	 * @throws Exception
	 */
	public int findOperationCount(@Param("moduleid")String moduleid) throws Exception;
	/**
	 * 查询操作列表
	 * @param dstoperationQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<DstoperationCustom> findOperationList(DstoperationQueryDto dstoperationQueryDto) throws Exception;
	public List<DstoperationCustom> getButtonOperationList(@Param("opertype")String opertype);
}
