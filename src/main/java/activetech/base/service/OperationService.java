package activetech.base.service;
import java.util.List;
import activetech.base.pojo.dto.DstoperationCustom;
import activetech.base.pojo.dto.DstoperationQueryDto;

/**
 * <p>Title:OperateService</p>
 * <p>Description:操作管理列表service 基础service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年1月10日 下午4:37:18
 *
 */
public interface OperationService {
	/**
	 * 查询操作列表数据总数
	 * @param moduleid
	 * @return 
	 * @throws Exception
	 */
	public int findOperationCount(String moduleid) throws Exception;

	/**
	 * 查询操作管理列表
	 * @param dstoperationQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<DstoperationCustom> findOperationList(DstoperationQueryDto dstoperationQueryDto) throws Exception;
	
	/**
	 * 新增操作管理
	 * @param moduleid
	 * @param dstoperationCustom
	 * @throws Exception
	 */
	public void insertOperation(String moduleid,DstoperationCustom dstoperationCustom)throws Exception;
	/**
	 * 修改操作
	 * @param operateid
	 * @param dstoperateCustom
	 * @throws Exception
	 */
	public void updateOperation(String operateid,DstoperationCustom dstoperationCustom)throws Exception;
	/**
	 * 删除操作
	 * @param operationid
	 * @throws Exception
	 */
	public void deleteOperation(String operateid)throws Exception;
	
	/**
	 * 根据operateid查询操作信息
	 * @param operateid
	 * @return
	 * @throws Exception
	 */
	public DstoperationCustom findOperationByOperateid(String operateid) throws Exception;
}
