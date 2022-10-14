package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspGraceInf;
import activetech.edpc.pojo.domain.HspXtzlInf;
import activetech.edpc.pojo.dto.HspDbzlBasQueryDto;
import activetech.edpc.pojo.dto.HspXtzlInfCustom;
import activetech.edpc.pojo.dto.QueryDto;
import activetech.edpc.pojo.dto.XtHspEmgInfQueryDto;

import java.util.List;

public interface XtService {
	
	public ResultInfo getCpcPatientInfoList(QueryDto queryDto);
	
	public ResultInfo getCpcPatientRouteInfoByEmgSeq(String emgSeq);
	
	 
	
	/**
	 * 走统一的接口获取节点上的信息
	 * @param emgSeq
	 * @param nodeId
	 * @return
	 */
	public ResultInfo getNodeInfoByEmgSeq(String emgSeq,String nodeId);
	
	public ResultInfo getCpcTimeline(String emgSeq);
	
	/**
	 * 根据busStep,emgNo获取数据
	 * @param busStep
	 * @param emgNo
	 * @return
	 */
	public ResultInfo findXtPatientWithCod(XtHspEmgInfQueryDto xtHspEmgInfQueryDto);
	
//	public DataGridResultInfo getXtPatientList(XtHspEmgInfQueryDto xtHspEmgInfQueryDto,
//			int page,//当前页码
//			int rows//每页显示个数
//			);

	/**
	 * 查询hspDbzlBas的胸痛患者列表
	 * @param hspDbzlBasQueryDto
	 * @param page
	 * @param rows
	 * @return
	 */
	public DataGridResultInfo getXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto, int page, int rows);
	
	public ResultInfo xtPatietSubmitBatch(List<HspXtzlInfCustom> xtzlInfs,String emgSeq,ActiveUser activeUser);
	
	public ResultInfo getXtTimeLine(XtHspEmgInfQueryDto xtHspEmgInfQueryDto);
	
	public ResultInfo getHspFlowChartDef(String flowType);

	public ResultInfo queryXtPatientDetail(String emgSeq);

	ResultInfo getHspGraceInf(HspGraceInf hspGraceInf);
	
	/**
	 * 新增犯罪血管，返回保存的关联字段
	 * @param hspXtAdd
	 * @return
	 */
	public ResultInfo addFzxg(HspXtzlInfCustom hspXtzlInfCustom,ActiveUser activeUser);
	
	/**
	 * 删除犯罪血管
	 * @param hspXtzlInf
	 * @return
	 */
	public ResultInfo delFzxg(HspXtzlInf hspXtzlInf);
	
	/**
	 * 更新犯罪血管信息
	 * @return
	 */
	public ResultInfo updateHspCrivelInf(HspCrivelInf hspCrivelInf,ActiveUser activeUser);

	public ResultInfo queryHspXtAddDetail(String emgSeq);
	
	/**
	 * 获取手动上传的心电图信息
	 * @param emgSeq
	 * @return
	 */
	public ResultInfo getManualEcgInf(String emgSeq);
	
	public ResultInfo getHspEmgInfByEmgSeq(String emgSeq,String wayTyp);
	
	public ResultInfo getHspXtzlInfByEmgSeq(String emgSeq);
	
	public ResultInfo getAidPatientByEmgSeq(String emgSeq, String wayTyp);

	ResultInfo getHspXtzlInfByEmgSeqToEdit(String emgSeq,String wayTyp);

}