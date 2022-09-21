package activetech.zyyhospital.dao.mapper;

import java.util.List;

import activetech.zyyhospital.pojo.dto.HspBchzhzReportCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.zyyhospital.pojo.dto.HspJjbglInfCustom;
import activetech.zyyhospital.pojo.dto.HspJjbglInfQueryDto;

public interface HspJjbglInfCustomMapper {
	/**
	 * 查询分页总记录数
	 * @param hspCbyxglInfQueryDto
	 * @return
	 */
	public int findHspJjbglInfCount(HspJjbglInfQueryDto hspJjbglInfQueryDto);
	/**
	 * 分页查询交接（查询条件：时间区间）
	 * @param hspCbyxglInfQueryDto
	 * @return
	 */
	public List<HspJjbglInfCustom> findHspJjbglInfList(HspJjbglInfQueryDto hspJjbglInfQueryDto);
	
	/**
	 * 根据交接班编号查询患者明细
	 * @param jjbglSeq
	 * @return
	 */
	public HspJjbglInfCustom findHspJjbglInf(String jjbglSeq);
	
	/**
	 * 交班信息更新
	 * @param hspJjbglInfCustom
	 */
	public void updatejjbgl(HspJjbglInfCustom hspJjbglInfCustom);
	
	/**
	 * 交班信息新增
	 * @param hspJjbglInfCustom
	 */
	public void insertjjbgl(HspJjbglInfCustom hspJjbglInfCustom);
	/**
	 * 查询患者明细总记录数
	 * @param hspJjbglInfQueryDto
	 * @return
	 */
	public int findHspJjbhzmxCount(HspJjbglInfQueryDto hspJjbglInfQueryDto);
	/**
	 * 查询患者明细列表
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findHspJjbhzmxList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 查询班次患者汇总报表
	 */
	public List<HspBchzhzReportCustom> findbchzhzListRange(HspJjbglInfQueryDto hspJjbglinfQueryDto);
	
	public List<HspBchzhzReportCustom> findbchzhzList(HspJjbglInfQueryDto hspJjbglinfQueryDto);
	
}
