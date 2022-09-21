package activetech.edpc.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.domain.HspBase64Pic;
import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.dto.HspCzzlInfCustom;
import activetech.edpc.pojo.dto.HspCzzlInfQueryDto;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.hospital.pojo.dto.HspemginfQueryDto;

public interface CzService {
	
	public ResultInfo getCzPatientInfoList(QueryDto queryDto);
	
	public ResultInfo getCzInfoByEmgSeq(String emgSeq);
	
	/**
	 * 走统一的接口获取节点上的信息
	 * @param emgSeq
	 * @param nodeId
	 * @return
	 */
	public ResultInfo getCzNodeInfoByEmgSeq(String emgSeq,String nodeId);
	
	public List<HspCzzlInf> getCzNodeInfoByEmgSeqProCode(String emgSeq,List<String> paramList);
	
	public ResultInfo getRsInf(String emgSeq);
	
	public ResultInfo saveBase64pic(HspBase64Pic hspBase64Pic);
	
	public ResultInfo getBase64pic(HspBase64Pic hspBase64Pic);
	
	public ResultInfo getCzReportHelperData(String emgSeq);
	
	public ResultInfo getCzTimeline(String emgSeq);
	
	public DataGridResultInfo getCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto,int page,int rows);
	
	public ResultInfo getCzhcbInfoByEmgSeq(String emgSeq);
	
	public ResultInfo getCzPatientDetail(String emgSeq);
	
	public ResultInfo czPatientSubmit(List<HspCzzlInfCustom> czzlInfList,String emgSeq,ActiveUser activeUser);
	
	public Map<Integer,String> getYljgczzlqkdcb(HspemginfQueryDto hspemginfQueryDto);

	ResultInfo getAidPatientByEmgSeq(String emgSeq);

	ResultInfo getCzJyjcInfo(String emgSeq);
	
	ResultInfo getCzFirstPageInfo();

}