package activetech.zyyhospital.pojo.domain;

import java.util.Date;

/**
 * 时间轴
 */
public class THemsSjz {
	// 预检号
	private String emgSeq;
	// 患者姓名
	private Date sjzDate;
	// 时间轴标题
	private String sjzTitle;
	// 时间轴详细信息
	private String sjzInfo;
	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public Date getSjzDate() {
		return sjzDate;
	}
	public void setSjzDate(Date sjzDate) {
		this.sjzDate = sjzDate;
	}
	public String getSjzTitle() {
		return sjzTitle;
	}
	public void setSjzTitle(String sjzTitle) {
		this.sjzTitle = sjzTitle;
	}
	public String getSjzInfo() {
		return sjzInfo;
	}
	public void setSjzInfo(String sjzInfo) {
		this.sjzInfo = sjzInfo;
	}
	
}