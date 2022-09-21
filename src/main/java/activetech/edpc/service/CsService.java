package activetech.edpc.service;

import java.util.List;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.domain.HspCsampInf;
import activetech.edpc.pojo.domain.HspSbarInf;
import activetech.edpc.pojo.dto.HspCsabcInfQueryDto;
import activetech.edpc.pojo.dto.HspCscpnInfQueryDto;
import activetech.edpc.pojo.dto.HspCsoaeInfQueryDto;
import activetech.edpc.pojo.dto.HspCspfDtlQueryDto;
import activetech.edpc.pojo.dto.HspCszlInfCustom;
import activetech.edpc.pojo.dto.HspCszlInfQueryDto;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.hospital.pojo.dto.HspemginfCustom;

public interface CsService {
	
	public ResultInfo getCsPatientInfoList(QueryDto queryDto);
	
	public ResultInfo getHspBodyPartsDef();

	public ResultInfo getCsABCDEdefList();
	
	public ResultInfo getCsABCDEinfList(HspCsabcInfQueryDto hspCsabcInfQueryDto);
	
	public ResultInfo mergeCsABCDEinf(HspCsabcInfQueryDto hspCsabcInfQueryDto,ActiveUser activeUser);
	
	public ResultInfo getAmpleSubmit(HspCsampInf hspCsampInf);
	
	public ResultInfo mergeAmpleSubmit(HspCsampInf hspCsampInf);
	
	public ResultInfo getHspCsoaeDefList();
	
	public ResultInfo mergeHspCsoaeInf(HspCsoaeInfQueryDto hspCsoaeInfQueryDto,ActiveUser activeUser);
	
	public ResultInfo getHspCsoaeInfList(HspCsoaeInfQueryDto hspCsoaeInfQueryDto);
	
	public ResultInfo getHspCscpnDefList();

	public ResultInfo mergeHspCscpnInf(HspCscpnInfQueryDto hspCscpnInfQueryDto,ActiveUser activeUser);
	
	public ResultInfo getHspCscpnInfList(HspCscpnInfQueryDto hspCscpnInfQueryDto);
	
	public ResultInfo mergeHspSbarInf(HspSbarInf hspSbarInf,ActiveUser activeUser);
	
	public ResultInfo getHspSbarInfByEmgSeq(HspSbarInf hspSbarInf);
	
	/**
	 * 获取《浙江医院创伤诊疗流程核查表》定义列表
	 * @return
	 */
	public ResultInfo getCsmicDefList();
	
	/**
	 * 获取创伤信息
	 * @param hspemginfCustom
	 * @param activeUser
	 * @return
	 */
	public ResultInfo getCsinf(HspemginfCustom hspemginfCustom,ActiveUser activeUser) throws Exception;
	
	/**
	 * 获取创伤患者列表
	 * @param hspCszlInfQueryDto
	 * @param page
	 * @param rows
	 * @return
	 */
	public DataGridResultInfo getCsPatientList(HspCszlInfQueryDto hspCszlInfQueryDto,int page,int rows);
	
	/**
	 * 获取创伤时间轴
	 * @param emgSeq
	 * @return
	 */
	public ResultInfo getCsTimeline(String emgSeq);
	
	/**
	 * 创伤信息保存
	 * @param hspCszlInfQueryDto
	 * @param emgSeq
	 * @param activeUser
	 * @return
	 */
	public ResultInfo submitCsInf(List<HspCszlInfCustom> cszlInfList,String emgSeq,ActiveUser activeUser);
	
	public ResultInfo getHspCsfDef(String emgSeq);
	
	public ResultInfo addHspCspfDtl(HspCspfDtlQueryDto hspCspfDtlQueryDto,ActiveUser activeUser);
	
	
}