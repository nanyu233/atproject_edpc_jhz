package activetech.zyyhospital.pojo.dto;

import activetech.zyyhospital.pojo.domain.HspDeathRecordWithBLOBs;

public class HspDeathRecordCustom extends HspDeathRecordWithBLOBs {

	private String comeTimeStr; //到院时间字符
	private String deathTimeStr; //死亡时间字符
	private String createTimeStr; //创建时间字符
	private String updateTimeStr; //修改时间字符
	private String courseDateStr;
	private String treatmentPlan;  //诊疗计划
	
	public String getComeTimeStr() {
		return comeTimeStr;
	}
	public void setComeTimeStr(String comeTimeStr) {
		this.comeTimeStr = comeTimeStr;
	}
	public String getDeathTimeStr() {
		return deathTimeStr;
	}
	public void setDeathTimeStr(String deathTimeStr) {
		this.deathTimeStr = deathTimeStr;
	}
	public String getCreateTimeStr() {
		return createTimeStr;
	}
	public void setCreateTimeStr(String createTimeStr) {
		this.createTimeStr = createTimeStr;
	}
	public String getUpdateTimeStr() {
		return updateTimeStr;
	}
	public void setUpdateTimeStr(String updateTimeStr) {
		this.updateTimeStr = updateTimeStr;
	}
	public String getCourseDateStr() {
		return courseDateStr;
	}
	public void setCourseDateStr(String courseDateStr) {
		this.courseDateStr = courseDateStr;
	}
	public String getTreatmentPlan() {
		return treatmentPlan;
	}
	public void setTreatmentPlan(String treatmentPlan) {
		this.treatmentPlan = treatmentPlan;
	}
	
}
