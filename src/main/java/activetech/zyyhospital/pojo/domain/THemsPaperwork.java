package activetech.zyyhospital.pojo.domain;

import java.util.Date;

public class THemsPaperwork {
	/**
	 * 预检号
	 */
	private String emgSeq;
	
	/**
	 *  时间
	 */
	private Date paperworkDate;
	
	/**
	 *  文书名称
	 */
	private String paperworkName;
	/**
	 *  名称
	 */
	private String doctorName;
	
	/**
	 * 对应关联模块
	 */
	private String relevanceModule;
	
	/**
	 * 数据主键
	 */
	private String primaryKey;
	
	/**
	 * 医生COD
	 */
	private String doctorNbr;
	
	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public Date getPaperworkDate() {
		return paperworkDate;
	}
	public void setPaperworkDate(Date paperworkDate) {
		this.paperworkDate = paperworkDate;
	}
	public String getPaperworkName() {
		return paperworkName;
	}
	public void setPaperworkName(String paperworkName) {
		this.paperworkName = paperworkName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getRelevanceModule() {
		return relevanceModule;
	}
	public void setRelevanceModule(String relevanceModule) {
		this.relevanceModule = relevanceModule;
	}
	public String getPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}
	public String getDoctorNbr() {
		return doctorNbr;
	}
	public void setDoctorNbr(String doctorNbr) {
		this.doctorNbr = doctorNbr;
	}
}
