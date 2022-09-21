package activetech.zyyhospital.service;


import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.DstuserQueryDto;
import activetech.hospital.pojo.dto.HspBrbzCustom;
import activetech.hospital.pojo.dto.HspBrbzQueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfQueryDto;
import activetech.zyyhospital.pojo.dto.HspBasyInfCustom;
import activetech.zyyhospital.pojo.dto.HspBasyInfQueryDto;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsCustom;
import activetech.zyyhospital.pojo.dto.HspConsultationRecordsQueryDto;
import activetech.zyyhospital.pojo.dto.HspFrbrInfCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbCustom;
import activetech.zyyhospital.pojo.dto.HspHlpgbQueryDto;
import activetech.zyyhospital.pojo.dto.HspOperateInfCustom;
import activetech.zyyhospital.pojo.dto.StatisticsCustom;

public interface ZyyHspreportService {

	
	/**
	 * 抢救措施人数统计
	 * @param hspBrbzQueryDto
	 * @return
	 * @throws Exception 
	 */
	public List<HspBrbzCustom> getcountFromHlpgb(HspBrbzQueryDto hspBrbzQueryDto) throws Exception;
	/**
	 * 120处置统计
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> find120tj(HspemginfQueryDto hspemginfQueryDto);


	/**
	 * 非计划重返抢救室率
	 * @param hspemginfQueryDto
	 * @param dstuserQueryDto 
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> getReturnQjsList(
			HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 急诊科各科室会诊平均时间 
	 * @param 
	 * @return
	 * @throws Exception
	 */
	public Map<String, List<HspConsultationRecordsCustom>> findHspConsultationRecordsAvgList(HspConsultationRecordsQueryDto hspConsultationRecordsQueryDto)throws Exception;




	/**
	 * 获取最新的医患比/护患比
	 */
	public HspemginfCustom findDocNurseRatio(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 获取最新的非计划重返抢救室率
	 */
	public HspemginfCustom findFjhcfqjsl(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 获取最新的非计划重返抢救室率   患者列表
	 */
	public List<HspemginfCustom> findFjhcfqjslList(HspemginfQueryDto hspemginfQueryDto);
	

	/**
	 * 门药时间报表
	 * @param hspemginfQueryDto
	 * @return
	 */
	public Map<String,List<HspemginfCustom>> findaverageDrugList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	/**
	 * 分诊人员统计
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public Map<String,List<HspemginfCustom>> triagePersonList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 * 获取病种及操作技术统计列表
	 */
	public List<HspBasyInfCustom> getcountFromHspBasyInf(HspBasyInfQueryDto hspBasyInfQueryDto) throws Exception;
	
	/**
	 * 手术操作统计
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public Map<String, List<HspOperateInfCustom>> operationList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	/**
	 * 手术操作患者明细总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int queryEmgCountBySscz(HspOperateInfCustom hspOperateInfCustom);
	/**
	 * 手术操作患者明细列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspOperateInfCustom> queryEmgListBySscz(HspOperateInfCustom hspOperateInfCustom);
	
	/**
	 * 获取护士站病种统计列表
	 */
	public List<HspHlpgbCustom> getcountFromHspHlpgb(HspHlpgbQueryDto hspHlpgbQueryDto) throws Exception;
	
	/**
	 *医院呼吸道发热病人门诊登记表
	 */
	public List<HspFrbrInfCustom> queryfrdjList(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 *医院呼吸道发热病人门诊登人数
	 */
	public int queryfrdjListCount(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	/**
	 *病种明细统计数量
	 */
	public int findBztjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *病种明细统计列表
	 */
	public List<HspemginfCustom> getfindBztjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *操作技术明细统计数量
	 */
	public int findCzjstjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *操作技术明细统计列表
	 */
	public List<HspemginfCustom> getfindCzjstjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *护士站病种明细统计数量
	 */
	public int findHszbztjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *护士站病种明细统计列表
	 */
	public List<HspemginfCustom> getfindHszbztjmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *抢救措施明细统计列表
	 */
	public int findQjcshzmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *抢救措施患者明细
	 */
	public List<HspemginfCustom> getfindQjcshzmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *120到院统计列表
	 */
	public List<HspemginfCustom> getDytjList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *120到院患者明细统计数量
	 */
	public int findDytjmxCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 *120到院患者明细统计列表
	 */
	public List<HspemginfCustom> getfindDytjmxList(HspemginfQueryDto hspemginfQueryDto);
	
}
