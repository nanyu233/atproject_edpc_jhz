package activetech.zyyhospital.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import activetech.pda.pojo.dto.HspCfxxInfoCustom;
import activetech.pda.pojo.dto.HspCfxxInfoQueryDto;
import activetech.zyyhospital.pojo.domain.THemsPaperwork;
import activetech.zyyhospital.pojo.dto.HspLqblInfCustom;

public interface HspLqblInfCustomMapper {
    HspLqblInfCustom findLqblByEmgSeq(String emgSeq);

	HspLqblInfCustom findLqblForDisease(String emgSeqDc);
	
	HspLqblInfCustom findMzblByEmgSeq(String emgSeq) throws Exception;
	
	HspLqblInfCustom findRecentblByVstCad(HspLqblInfCustom hspLqblInfCustom);
	
	List<HspLqblInfCustom> getLslqblList(String vstCad);
	
	/**
	 * 获取患者医嘱信息
	 * @param hspCfxxInfoQueryDto
	 * @return
	 */
	List<HspCfxxInfoCustom> getAdviceByMpi(HspCfxxInfoQueryDto hspCfxxInfoQueryDto);
	
	HspLqblInfCustom findAllLqblForDisease(String lqblSeq);
	
	/**
	 * 执行存储过程-病程录
	 * @param emgSeq
	 * @throws Exception
	 */
	void proc_paperworkdata(@Param("emgSeq")String emgSeq) throws Exception;
	
	/**
	 * 获取病程录列表
	 * @param emgSeq
	 * @return
	 */
	List<THemsPaperwork> getBclbByEmgSeq(THemsPaperwork tHemsPaperwork);
	
	/**
	 * @Description 通过主键获取数据
	 * @author machaofan
	 * @date 2020年7月23日上午9:27:08
	 * @param lqblSeq
	 * @return
	 * @return HspLqblInfCustom
	 */
	HspLqblInfCustom selectByPrimaryKey(@Param("lqblSeq") String lqblSeq);
}