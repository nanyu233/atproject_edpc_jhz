package activetech.edpc.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.domain.HspFuvDocInf;
import activetech.edpc.pojo.domain.HspFuvGrpInf;
import activetech.edpc.pojo.domain.HspFuvPln;
import activetech.edpc.pojo.domain.HspPatInf;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.dto.HspFuvInfCustom;
import activetech.edpc.pojo.dto.HspFuvInfQueryDto;
import activetech.edpc.pojo.dto.HspFuvPatCustom;
import activetech.edpc.pojo.dto.HspFuvPatQueryDto;
import activetech.edpc.pojo.dto.HspFuvPlnCustom;
import activetech.edpc.pojo.dto.HspFuvPlnQueryDto;
import activetech.edpc.pojo.dto.HspPatInfCustom;
import activetech.edpc.pojo.dto.HspPatInfQueryDto;

public interface FollowUpService {	

	/**
	 * 随访患者信息列表
	 * @param hspPatInfQueryDto
	 * @return
	 */
	List<HspPatInfCustom> queryfuvResult(HspPatInfQueryDto hspPatInfQueryDto);
	public int queryCountfuvResult(HspPatInfQueryDto hspPatInfQueryDto);   
      
	/**
	 * 删除随访计划
	 * @param hspFuvPln
	 * @return 
	 * @throws Exception
	 */
	ResultInfo deletefuvpln(String plnSeq) throws Exception;

	//======================================================================
	/**
	 * 随访计划新增
	 * @param hspFuvInfCustom
	 * @return
	 */
	void submitFuvPln(HspFuvPlnQueryDto hspFuvPlnQueryDto, ActiveUser activeUser) throws Exception;
	/**
	 * 随访患者信息列表
	 * @param hspPatInfQueryDto
	 * @return
	 */
	List<HspFuvPatCustom> queryfuvResult(HspFuvPatQueryDto hspFuvPatQueryDto);
	public int queryCountfuvResult(HspFuvPatQueryDto hspFuvPatQueryDto);

	HspFuvPatCustom selectOneByCondition(HspFuvPatQueryDto hspFuvPatQueryDto);

	public int queryCountfuvplnResult(HspFuvPlnQueryDto hspFuvPlnQueryDto);
	List<HspFuvPlnCustom> queryfuvplnResult(HspFuvPlnQueryDto hspFuvPlnQueryDto);

	HspFuvPlnCustom selectPlnOneByCondition(HspFuvPlnQueryDto hspFuvPlnQueryDto);

	public int queryCountfuvInfResult(HspFuvInfQueryDto hspFuvInfQueryDto);
	 /**
     * 随访记录列表
     * @param hspPatInfQueryDto
     * @return
     */
	List<HspFuvInfCustom> queryfuvInfResult(HspFuvInfQueryDto hspFuvInfQueryDto);

	public HspFuvInfCustom selectInfOneByCondition(HspFuvInfQueryDto hspFuvInfQueryDto);
	/**
	 * 随访记录保存
	 * @param hspFuvInfQueryDto
	 * @return
	 */
	public void submitFuv(HspFuvInfQueryDto hspFuvInfQueryDto) throws Exception;
	
	List<HspFuvDocInf> queryFuvDoc(HspFuvInfQueryDto hspFuvInfQueryDto);
	
	List<HspFuvGrpInf> queryFuvGrp(HspFuvInfQueryDto hspFuvInfQueryDto);
	
	void submitFuvPat(HspFuvPatQueryDto hspFuvPatQueryDto, ActiveUser activeUser) throws Exception;
	Integer checkUnFinishPln(HspFuvPlnQueryDto hspFuvPlnQueryDto);
	
}
