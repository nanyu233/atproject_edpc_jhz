package activetech.zyyhospital.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.hospital.pojo.domain.HspMewsInf;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;
import activetech.zyyhospital.pojo.dto.HspLqbljlQueryDto;

/**
 * 
 * <p>
 * Title:ZyyHspJzmzInfService
 * </p>
 * <p>
 * Description:急诊门诊病历接口service
 * </p>
 * 
 * @author wzl
 * @date 2019年12月12日 上午11:05
 * 
 */
public interface ZyyHspJzmzInfService {
	
	/**
	 * 急诊门诊记录查询总数
	 * 
	 * @param hstemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	int jzmzFindHspemginfCount(HspemginfQueryDto hspemginfQueryDto)
			throws Exception;
	
	/**
	 * 急诊门诊记录查询列表
	 * 
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	List<HspemginfCustom> jzmzFindHspemginfList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 * 急诊门诊记录查询列表
	 * 
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	HspMewsInf findhspMewsInfByemgSeq(String emgSeq) throws Exception;
	
	/**
	 * @Description 门诊病历查询结果
	 * @author machaofan
	 * @date 2020年8月10日下午5:13:59
	 * @param emgSeq
	 * @param lqblSeq
	 * @param mpi
	 * @param jzxh
	 * @param catNam
	 * @param activeUser
	 * @return
	 * @throws Exception
	 * @return Map<String,Object>
	 */
	Map<String,Object> findMzblByEmgSeq(String emgSeq, String lqblSeq, String mpi, String jzxh, String catNam, ActiveUser activeUser) throws Exception;
	
	/**
	 * 保存门诊病历
	 * @param hspLqbljlQueryDto
	 * @param activeUser
	 * @return emgSeq
	 * @throws Exception
	 */
	String submitMzbl(HspLqbljlQueryDto hspLqbljlQueryDto,ActiveUser activeUser) throws Exception;
	
	/**
	 * 导入今日留抢病历
	 * @param emgSeq
	 * @return
	 */
	HspLqblInfCustom findLqblByEmgSeq(String emgSeq) throws Exception;
	
	/**
	 * @Description 治疗意见刷新
	 * @author machaofan
	 * @date 2020年8月10日上午11:31:42
	 * @param mpi
	 * @param jzxh
	 * @return
	 * @throws Exception
	 * @return HspLqblInfCustom
	 */
	HspLqblInfCustom refreshTreatmentOptions(String mpi, String jzxh) throws Exception;
	
	/**
	 * @Description 删除门诊病历
	 * @author machaofan
	 * @date 2020年7月24日上午11:43:23
	 * @param lqblSeq
	 * @return
	 * @throws Exception
	 */
	void delMzbl(String lqblSeq) throws Exception;
	
	/**
	 * @Description 查看患者是否挂号绑定、是否有留抢状态
	 * @author machaofan
	 * @date 2020年7月24日下午3:21:41
	 * @param mpi
	 * @param jzxh
	 * @return
	 * @throws Exception
	 * @return Map<String,Object>
	 */
	Map<String,Object> isRetention(String mpi, String jzxh) throws Exception;

	String submitMzbl(String requestSource, HspLqbljlQueryDto hspLqbljlQueryDto, ActiveUser activeUser,HspemginfQueryDto hspemginfQueryDto, HspemginfCustom hspemginfCustomXm) throws Exception;
}
