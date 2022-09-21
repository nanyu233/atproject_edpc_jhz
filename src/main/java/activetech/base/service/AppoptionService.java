package activetech.base.service;
import java.util.List;
import activetech.base.pojo.domain.Dstappoption;
import activetech.base.pojo.dto.DstappoptionQueryDto;

/**
 * 
 * <p>Title:AppoptionService</p>
 * <p>Description:基础信息配置Service 基础service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月18日 上午10:49:00
 *
 */
public interface AppoptionService {
	/**
	 * 基础信息查询总数
	 * @param dstappoptionQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findAppoptionCount(DstappoptionQueryDto dstappoptionQueryDto) throws Exception;
	/**
	 * 查询基础信息列表
	 * @return
	 */
	public List<Dstappoption> findAppoptionList();
	/**
	 * 根据主键更新基础信息表
	 * @param dstappoptionQueryDto
	 * @throws Exception
	 */
	public void updateAppoption(DstappoptionQueryDto dstappoptionQueryDto)throws Exception;
}
