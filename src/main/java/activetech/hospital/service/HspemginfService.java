package activetech.hospital.service;

import java.util.List;

import activetech.hospital.pojo.domain.HspSqlInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;


/**
 * 
 * <p>Title:HspemginfService</p>
 * <p>Description:急诊记录接口service</p>
 * <p>activetech</p>
 * @author liulj
 * @date 2017年2月21日 上午10:12:01
 *
 */


public interface HspemginfService {   
	/**
	 * 根据预检号查询打印内容
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom getEmginfForPrint(String emgSeq);
	/**
	 * 留抢查询
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom findHspemginfCustomLqxxdj(String emgSeq);

	
	//获取病人详情信息
	public HspemginfCustom findhzxqByEmgSeq(String emgSeq) throws Exception;

	public HspemginfQueryDto findHspemginfByemgSeq_jzt(String emgSeq);
	

	public List<HspemginfCustom> findEmgDeathList(
			HspemginfQueryDto hspemginfQueryDto);

	
	/**
	 * 查询住院患者列表
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findZyhzList(
			HspemginfQueryDto hspemginfQueryDto)throws Exception;
	
	
	public List<HspSqlInf> findHspSqlInfList(String emgSeq);
	/**
	 * 查询现有留观患者数量
	 * @return
	 * @throws Exception
	 */
	public int findHspemginfXylghzmxCount()throws Exception;
	
	/**
	 * 查询现有留观患者明细
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findXylghzmxList(HspemginfQueryDto hspemginfQueryDto)throws Exception;
	
	/**
	 * 查询发热患者数量
	 * @return
	 * @throws Exception
	 */
	public int findemginfByfrCount(HspemginfQueryDto hspemginfQueryDto)throws Exception;
	
	/**
	 * 查询发热患者明细
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findemginfByfrList(HspemginfQueryDto hspemginfQueryDto)throws Exception;

}
