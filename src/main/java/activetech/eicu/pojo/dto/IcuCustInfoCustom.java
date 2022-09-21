package activetech.eicu.pojo.dto;

import java.util.Date;

import activetech.eicu.pojo.domain.IcuCustInfo;

public class IcuCustInfoCustom extends IcuCustInfo{
	/**
	 * 床位序号
	 */
	private String bedSeq;
	/**
	 * 床位状态
	 */
	private String bedStat;
	/**
	 * 床号
	 */
	private String bedNo;
	/**
	 * 护士编号
	 */
	private String nursNo;
	/**
	 * 隔离表示
	 */
	private String glFlag;
	/**
	 * 住院号
	 */
	private String liveNo;
	/**
	 * 医生编号
	 */
	private String doctNo;
	/**
	 * 科室
	 */
	private String deptNo;
	/**
	 * 诊断
	 */
	private String diagInfo;
	/**
	 * 入科时间
	 */
	private Date inicuTime;
	/**
	 * 手术时间
	 */
	private Date opTime;
	/**
	 * 出科时间
	 */
	private Date outicuTime;
	/**
	 * 术后天数
	 */
	private String opDays;
	/**
	 * 护士名称
	 */
	private String nursName;
	/**
	 * 医生名称
	 */
	private String doctName;
	/**
	 * 入院时间字符串
	 */
	private String inhosTimeStr;
	/**
	 * 入科时间字符串
	 */
	private String inicuTimeStr;
	/**
	 * 手术时间字符串
	 */
	private String opTimeStr;
	/**
	 * 出科时间字符串
	 */
	private String outicuTimeStr;
	/**
	 * icu住院时间
	 */
	private String liveIcuTime;
	/**
	 * 待做事项数量
	 */
	private String erCount;
	/**
	 * 抢救模式|0=否 1=是
	 */
	private String rescMode;
	/**
	 * 管路 标识符
	 */
	private String pipeFlag;
	
	public String getPipeFlag() {
		return pipeFlag;
	}
	public void setPipeFlag(String pipeFlag) {
		this.pipeFlag = pipeFlag;
	}
	public String getRescMode() {
		return rescMode;
	}
	public void setRescMode(String rescMode) {
		this.rescMode = rescMode;
	}
	public String getErCount() {
		return erCount;
	}
	public void setErCount(String erCount) {
		this.erCount = erCount;
	}
	public String getLiveIcuTime() {
		return liveIcuTime;
	}
	public void setLiveIcuTime(String liveIcuTime) {
		this.liveIcuTime = liveIcuTime;
	}
	public String getBedSeq() {
		return bedSeq;
	}
	public void setBedSeq(String bedSeq) {
		this.bedSeq = bedSeq;
	}
	public String getBedStat() {
		return bedStat;
	}
	public void setBedStat(String bedStat) {
		this.bedStat = bedStat;
	}
	public String getBedNo() {
		return bedNo;
	}
	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}
	public String getNursNo() {
		return nursNo;
	}
	public void setNursNo(String nursNo) {
		this.nursNo = nursNo;
	}
	public String getGlFlag() {
		return glFlag;
	}
	public void setGlFlag(String glFlag) {
		this.glFlag = glFlag;
	}
	public String getLiveNo() {
		return liveNo;
	}
	public void setLiveNo(String liveNo) {
		this.liveNo = liveNo;
	}
	public String getDoctNo() {
		return doctNo;
	}
	public void setDoctNo(String doctNo) {
		this.doctNo = doctNo;
	}
	
	public Date getOpTime() {
		return opTime;
	}
	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}
	
	public String getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}
	public String getDiagInfo() {
		return diagInfo;
	}
	public void setDiagInfo(String diagInfo) {
		this.diagInfo = diagInfo;
	}
	public String getOpDays() {
		return opDays;
	}
	public void setOpDays(String opDays) {
		this.opDays = opDays;
	}
	public String getNursName() {
		return nursName;
	}
	public void setNursName(String nursName) {
		this.nursName = nursName;
	}
	public String getDoctName() {
		return doctName;
	}
	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}
	
	public String getOpTimeStr() {
		return opTimeStr;
	}
	public void setOpTimeStr(String opTimeStr) {
		this.opTimeStr = opTimeStr;
	}
	public String getInhosTimeStr() {
		return inhosTimeStr;
	}
	public void setInhosTimeStr(String inhosTimeStr) {
		this.inhosTimeStr = inhosTimeStr;
	}
	public Date getInicuTime() {
		return inicuTime;
	}
	public void setInicuTime(Date inicuTime) {
		this.inicuTime = inicuTime;
	}
	public Date getOuticuTime() {
		return outicuTime;
	}
	public void setOuticuTime(Date outicuTime) {
		this.outicuTime = outicuTime;
	}
	public String getInicuTimeStr() {
		return inicuTimeStr;
	}
	public void setInicuTimeStr(String inicuTimeStr) {
		this.inicuTimeStr = inicuTimeStr;
	}
	public String getOuticuTimeStr() {
		return outicuTimeStr;
	}
	public void setOuticuTimeStr(String outicuTimeStr) {
		this.outicuTimeStr = outicuTimeStr;
	}
}
