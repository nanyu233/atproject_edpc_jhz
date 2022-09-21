package activetech.zyyhospital.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import activetech.base.pojo.dto.ActiveUser;
import activetech.base.process.result.ExceptionResultInfo;
import activetech.hospital.pojo.dto.HspScoCustom;
import activetech.hospital.pojo.dto.HspemginfCustom;
import activetech.hospital.pojo.dto.HspemginfQueryDto;
import activetech.hospital.pojo.dto.HspsqlinfCustom;
import activetech.zyyhospital.pojo.domain.HspFrbrInf;
import activetech.zyyhospital.pojo.domain.THemsSjz;
import activetech.zyyhospital.pojo.dto.HspCheckCaseInfCustom;

/**
 * 
 * <p>
 * Title:HspemginfService
 * </p>
 * <p>
 * Description:急症记录接口service
 * </p>
 * <p>
 * activetech
 * </p>
 * 
 * @author liulj
 * @date 2017年2月21日 上午10:12:01
 * 
 */
public interface ZyyHspemginfService {
	// //////////杭州市中医院核心操作Start////////////////////////////////////////////////////////
	/**
	 * 预检分诊登记-分诊登记入库
	 * 
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public HspsqlinfCustom insertHspemginf_hzzyy(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception;

	/**
	 * 预检分诊登记-抢救室版本入库
	 * 
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public HspsqlinfCustom insertHspemginf_qjs_hzzyy(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception;

	/**
	 * 杭州市中医院 修改/转归信息提交
	 * 
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public String updateHspemginf_hzzyy(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception;

	/**
	 * 杭州市中医院 删除患者
	 * 
	 * @param emgSeq
	 * @param activeuser
	 * @throws Exception
	 */
	public void deleteHspemginf_hzzyy(String emgSeq, ActiveUser activeuser)
			throws Exception;

	// //////////杭州市中医院核心操作End////////////////////////////////////////////////////////

	/**
	 * 查询患者详细信息（修改/转归）
	 * 
	 * @param emgSeq
	 * @return
	 */
	public HspemginfQueryDto findHspemginfByemgSeq_zyy(String emgSeq)
			throws Exception;

	public List<HspemginfCustom> findHspemginfQjsList(
			HspemginfQueryDto hspemginfQueryDto)throws Exception;

	/**
	 * 急诊记录查询总数
	 * 
	 * @param hstemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public int findHspemginfCount(HspemginfQueryDto hspemginfQueryDto)
			throws Exception;

	/**
	 * 急症记录查询列表
	 * 
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public List<HspemginfCustom> findHspemginfList(
			HspemginfQueryDto hspemginfQueryDto) throws Exception;

	/**
	 * 根据emgseq查询hspEmgInf(获取护理评估单主述症状symSitDes)
	 * @param emgSeq
	 * @return
	 * @throws Exception
	 */
	public HspemginfCustom findHspemginfByemgSeq(String emgSeq)
			throws Exception;
	
	public int findHspemginfQjsCountzyy(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	
	//----------------------------归档病历-----------------------------------
	public void submitCheckRecord(HspemginfCustom hspemginfCustom, String userFlg)throws Exception;
	
	public void submitCheckCase(HspCheckCaseInfCustom hspCheckCaseInfCustom,ActiveUser activeUser)throws Exception;
	
	public List<HspemginfCustom> findAMRecordList(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	public int findAMRecordListCount(HspemginfQueryDto hspemginfQueryDto) throws Exception;
	
	public HspCheckCaseInfCustom getCheckCase(String emgSeq)throws Exception;
	
	/**
	 * 查询送入医院
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspScoCustom> findHspScoListBySzm(HspemginfQueryDto hspemginfQueryDto);
	

	
	/**
	 * 查询今日是否分诊
	 * @param map
	 * @return
	 */
	public List<HspemginfCustom> findEmgInfByCad(Map<String, Object> map) throws Exception;
	/**
	 * 获取急诊留抢病历数据
	 * 有填写留抢病历
	 * */
	public List<HspemginfCustom> findEmgInfByMpi(String vstCad) throws Exception;
	/**
	 * 获取时间轴列表
	 * @param emgSeq
	 * @return
	 */
	public List<THemsSjz> getSjzDataByEmgSeq(String emgSeq) throws Exception;
	/**
	 * @author machaofan
	 * @Date 2019-10-17
	 * 门药录入
	 * @param hspemginfQueryDto
	 */
	public void updateEmgInfMylrByEmgSeq(HspemginfQueryDto hspemginfQueryDto) ;
	
	/**
	 * 急诊管理绿色通道人数
	 */
	public HspemginfCustom getGrnChlCount(HspemginfQueryDto hspemginfQueryDto);
	/**
	 * 急诊管理留抢非留抢人数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public HspemginfCustom getLqAndNotLqCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 查询该就诊卡指定时间范围内的预检信息
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> findEmgInfForRange_result(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 查询该就诊卡指定时间范围内的预检信息总记录数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int findEmgInfForRangeCount(HspemginfQueryDto hspemginfQueryDto);

	public HspemginfCustom findHspemginfByGhid(String ghid);
	
	/**
	 * 护理记录左侧患者列表总数
	 * @param hspemginfQueryDto
	 * @return
	 */
	public int leftWrapCount(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 护理记录左侧患者列表数据
	 * @param hspemginfQueryDto
	 * @return
	 */
	public List<HspemginfCustom> leftWrapList(HspemginfQueryDto hspemginfQueryDto);
	
	/**
	 * 通过emgSeq获取预检
	 * @param emgSeq
	 * @return
	 */
	public HspemginfCustom findEmgInfByEmgSeq(String emgSeq);
	
	/**
	 * 预检分诊登记-二次预检
	 * 
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @return
	 * @throws Exception
	 */
	public HspsqlinfCustom insertHspemginf_qjs_ecyj(
			HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser)
			throws Exception;

	public HspemginfCustom findHspemginfCustom(String emgSeq, String printType, Date startdate, Date enddate) throws Exception;

	/**
	 * 查驾驶人员
	 * @param name
	 * @return
	 */
	public List<HspemginfCustom> findAbnDriverList(String name);
	
	/**
	 * 查询已预检待完善数据（新入病人）
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	List<HspemginfCustom> toBeImprovedList(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	/**
	 * 患者再分科入库
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public void addZyyemgSubmit_zfk(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception;
	
	/**
	 * 通过MPI和jzxh查询唯一预检号
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	HspemginfCustom getEmgInfByMpiAndJzxh(HspemginfQueryDto hspemginfQueryDto) throws Exception;

	/**
	 * 患者发热登记入库
	 * @param hspemginfQueryDto
	 * @return
	 * @throws Exception
	 */
	public void addFrRegisterSubmit(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser);

	public HspFrbrInf findFrRegisterByEmgSeq(String emgSeq) throws Exception;
	
	/**
	 * 核对病历
	 * @param emgSeq
	 * @param activeUser
	 */
	void updateChechRecord(String emgSeq, ActiveUser activeUser) throws Exception;
	
	/**
	 * 预检校验，判断当前患者（就诊卡号+姓名）24小时内是否有当前选择科室的预检数据
	 * @param hspemginfQueryDto
	 * @param activeUser
	 * @throws ExceptionResultInfo
	 */
	String emgCheck(HspemginfQueryDto hspemginfQueryDto, ActiveUser activeUser) throws Exception;
	
	/**
	 * 标签打印
	 * @param emgSeq
	 * @param activeUser
	 */
	void updateLabelPrinting(String emgSeq) throws Exception;

	public List<HspemginfCustom> getEmgInfByXm(HspemginfQueryDto hspemginfQueryDto);

	/**
	 * 检查胸痛/卒中流程flg
	 * @param emgSeq
	 * @param xtlcflg
	 * @return
	 */
	public int checkXtCzlcAjax(String emgSeq, String type);

	
}
