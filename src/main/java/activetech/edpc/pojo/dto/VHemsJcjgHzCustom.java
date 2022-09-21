package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.VHemsJcjgHz;

public class VHemsJcjgHzCustom extends VHemsJcjgHz{
	private String emgSeq;		//预检号
	private String xtFlg;		//胸痛标志
	private String czFlg;		//卒中标志
	private String cspgFlg;		//创伤标志
	private String jzxh;		//
	
	public String getJzxh() {
		return jzxh;
	}
	public void setJzxh(String jzxh) {
		this.jzxh = jzxh;
	}
	public String getEmgSeq() {
		return emgSeq;
	}
	public void setEmgSeq(String emgSeq) {
		this.emgSeq = emgSeq;
	}
	public String getXtFlg() {
		return xtFlg;
	}
	public void setXtFlg(String xtFlg) {
		this.xtFlg = xtFlg;
	}
	public String getCzFlg() {
		return czFlg;
	}
	public void setCzFlg(String czFlg) {
		this.czFlg = czFlg;
	}
	public String getCspgFlg() {
		return cspgFlg;
	}
	public void setCspgFlg(String cspgFlg) {
		this.cspgFlg = cspgFlg;
	}
	@Override
	public String toString() {
		return "VHemsJcjgHzCustom [emgSeq=" + emgSeq + ", xtFlg=" + xtFlg + ", czFlg=" + czFlg + ", cspgFlg=" + cspgFlg
				+ ", jzxh=" + jzxh + ", getApplicationNo()=" + getApplicationNo() + ", getZyh()=" + getZyh()
				+ ", getXm()=" + getXm() + ", getYlmc()=" + getYlmc() + ", getSee()=" + getSee() + ", getJcjg()="
				+ getJcjg() + ", getJcysxm()=" + getJcysxm() + ", getShrq()=" + getShrq() + ", getMpi()=" + getMpi()
				+ ", getPatientDept()=" + getPatientDept() + ", getSeekMedicalTimes()=" + getSeekMedicalTimes()
				+ ", getServiceOrganization()=" + getServiceOrganization() + ", getOrderCode()=" + getOrderCode()
				+ ", getExecutionNo()=" + getExecutionNo() + ", getExecutionDept()=" + getExecutionDept()
				+ ", getReportNo()=" + getReportNo() + ", getTreatmentCode()=" + getTreatmentCode()
				+ ", getReportDoc()=" + getReportDoc() + ", getReportStatus()=" + getReportStatus()
				+ ", getExamineDoc()=" + getExamineDoc() + ", getExamineDocName()=" + getExamineDocName()
				+ ", getReportSheetName()=" + getReportSheetName() + ", getErrorFlag()=" + getErrorFlag()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
