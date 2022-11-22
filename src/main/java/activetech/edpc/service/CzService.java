package activetech.edpc.service;

import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.base.process.result.SubmitResultInfo;
import activetech.edpc.pojo.domain.HspBase64Pic;
import activetech.edpc.pojo.domain.HspCzzlInf;
import activetech.edpc.pojo.dto.*;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import org.springframework.web.bind.annotation.RequestBody;

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

//	public DataGridResultInfo getCzPatientList(HspCzzlInfQueryDto hspCzzlInfQueryDto,int page,int rows);

	/**
	 * 查询hspDbzlBas的卒中患者列表
	 * @param hspDbzlBasQueryDto
	 * @param page
	 * @param rows
	 * @return
	 */
	public DataGridResultInfo getCzPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto, int page, int rows,ActiveUser activeUser);
	
	public ResultInfo getCzhcbInfoByEmgSeq(String emgSeq);
	
	public ResultInfo getCzPatientDetail(String emgSeq);

	public ResultInfo czPatietBasicInfSubmit(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser);
	
	public ResultInfo czPatientSubmit(List<HspCzzlInfCustom> czzlInfList,String emgSeq,ActiveUser activeUser);
	
	public Map<Integer,String> getYljgczzlqkdcb(HspemginfQueryDto hspemginfQueryDto);

	ResultInfo getCzPatientBasicInfo(String regSeq);

	ResultInfo getAidPatientByEmgSeq(String emgSeq);

	ResultInfo getCzJyjcInfo(String emgSeq);
	
	ResultInfo getCzFirstPageInfo();

    int getCzPatientInfoListCount(QueryDto queryDto);

	List<HspDbzlBasCustom> getCzPatientInfoListByPage(QueryDto queryDto);

    public ResultInfo judgeNewPatient(String emgSeq);

	public ResultInfo addNewPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto,ActiveUser activeUser);
}