package activetech.edpc.service;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.DataGridResultInfo;
import activetech.base.process.result.ResultInfo;
import activetech.edpc.pojo.domain.HspCrivelInf;
import activetech.edpc.pojo.domain.HspGraceInf;
import activetech.edpc.pojo.domain.HspZlInf;
import activetech.edpc.pojo.dto.*;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

public interface XtService {

	public ResultInfo getCpcPatientInfoList(QueryDto queryDto);
	
	public ResultInfo getCpcPatientRouteInfoByEmgSeq(String regSeq);
	/**
	 * 走统一的接口获取节点上的信息
	 * @param emgSeq
	 * @param nodeId
	 * @return
	 */
	public ResultInfo getNodeInfoByEmgSeq(String emgSeq,String nodeId);

	/**
	 * 根据busStep,emgNo获取数据
	 * @param xtHspEmgInfQueryDto xtHspEmgInfQueryDto
	 * @return
	 */
	public ResultInfo findXtPatientWithCod(XtHspEmgInfQueryDto xtHspEmgInfQueryDto);

	/**
	 * 查询hspDbzlBas的胸痛患者列表
	 * @param hspDbzlBasQueryDto hspDbzlBasQueryDto
	 * @return
	 */
	public DataGridResultInfo getXtPatientList(HspDbzlBasQueryDto hspDbzlBasQueryDto);

	/**
	 * 查询新增院内发病患者
	 * @param emgSeq emgSeq
	 * @return
	 */
	public ResultInfo judgeNewPatient(String emgSeq);

	/**
	 * 新增院内发病患者
	 * @param hspDbzlBasQueryDto
	 * @return
	 */
	public ResultInfo addNewPatient(HspDbzlBasQueryDto hspDbzlBasQueryDto,ActiveUser activeUser);


	/**
	 * 胸痛登记页面提交
	 * @param xtzlInfs
	 * @param emgSeq
	 * @param activeUser
	 * @return
	 */
	public ResultInfo xtPatietSubmitBatch(List<HspZlInfCustom> xtzlInfs,String emgSeq, String regSeq, ActiveUser activeUser);

	/**
	 * 胸痛登记页面基本信息提交
	 * @param hspDbzlBasQueryDto
	 * @param activeUser
	 * @return
	 */
	public ResultInfo xtPatietBasicInfSubmit(HspDbzlBasQueryDto hspDbzlBasQueryDto, ActiveUser activeUser);

	/**
	 * 获取诊疗表时间轴数据
	 * @param emgSeq emgSeq
	 * @return ResultInfo
	 */
	ResultInfo getXtTimeLine(String regSeq);
	
	public ResultInfo getHspFlowChartDef(String flowType);

	ResultInfo getHspGraceInf(HspGraceInf hspGraceInf);
	
	/**
	 * 新增犯罪血管，返回保存的关联字段
	 * @param hspXtzlInfCustom hspXtzlInfCustom
	 * @param activeUser activeUser
	 * @return
	 */
	public ResultInfo addFzxg(HspZlInfCustom hspZlInfCustom,ActiveUser activeUser);
	
	/**
	 * 删除犯罪血管
	 * @param hspXtzlInf
	 * @return
	 */
	public ResultInfo delFzxg(HspZlInf hspZlInf);
	
	/**
	 * 更新犯罪血管信息
	 * @return
	 */
	public ResultInfo updateHspCrivelInf(HspCrivelInf hspCrivelInf,ActiveUser activeUser);

	/**
	 * 获取手动上传的心电图信息
	 * @param emgSeq
	 * @return
	 */
	public ResultInfo getManualEcgInf(String emgSeq);
	
	public ResultInfo getHspEmgInfByEmgSeq(String emgSeq,String wayTyp);
	
	public ResultInfo getHspXtzlInfByEmgSeq(String emgSeq);
	
	public ResultInfo getAidPatientByEmgSeq(String emgSeq, String wayTyp);

	/**
	 * 获取胸痛诊疗数据，格式化比编辑器所需数据
	 * @param regSeq regSeq
	 * @return return
	 */
	ResultInfo getHspXtzlInfByEmgSeqToEdit(String regSeq);

	/**
	 * 获取患者基础信息
	 * @param regSeq regSeq
	 * @return return
	 */
	ResultInfo queryHspDbzlBasinf(String regSeq);

	/**
	 * 根据emgSeq 获取胸痛诊疗表的信息
	 * @param emgSeq emgSeq
	 * @return return
	 */
	public ResultInfo queryHspXtzlInfByEmgSeq(String emgSeq);

	/**
	 *
	 * @param queryDto queryDto
	 * @return return
	 */
	int getCpcPatientInfoListCount(QueryDto queryDto);

	List<HspDbzlBasCustom> getCpcPatientInfoListByPage(QueryDto queryDto);

	ResultInfo getTimelineGt(List<HspZlInfCustom> list, HspTimDiffQueryDto hspTimDiffQueryDto);

	public DataGridResultInfo getTimeLineCriterion(HspTimDiffQueryDto hspTimDiffQueryDto);

	ResultInfo updateTimeLineCriterion(HspTimDiffQueryDto hspTimDiffQueryDto,ActiveUser activeUser) throws Exception;

	DataGridResultInfo queryTimeLineHis(HspTimDiffQueryDto hspTimDiffQueryDto) throws Exception;

	void addMedianMonthAndAverageMonth();

	void addMedianYearAndAverageYear();
}