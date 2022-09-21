package activetech.edpc.pojo.dto;

import java.util.List;

import activetech.edpc.pojo.domain.VHemsJyjgHz;

public class VHemsJyjgHzCustom extends VHemsJyjgHz {
	private String emgSeq;		//预检号
	private String xtFlg;		//胸痛标志
	private String czFlg;		//卒中标志
	private String cspgFlg;		//创伤标志
	private String jzxh;
	private List<VHemsJyjgHzCustom> sonList;
	public String getJzxh() {
		return jzxh;
	}
	public void setJzxh(String jzxh) {
		this.jzxh = jzxh;
	}
	public List<VHemsJyjgHzCustom> getSonList() {
		return sonList;
	}
	public void setSonList(List<VHemsJyjgHzCustom> sonList) {
		this.sonList = sonList;
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
		return "VHemsJyjgHzCustom [emgSeq=" + emgSeq + ", xtFlg=" + xtFlg + ", czFlg=" + czFlg + ", cspgFlg=" + cspgFlg
				+ ", jzxh=" + jzxh + ", sonList=" + sonList + ", getMpi()=" + getMpi() + ", getName()=" + getName()
				+ ", getSampleno()=" + getSampleno() + ", getResult()=" + getResult() + ", getResultDateTime()="
				+ getResultDateTime() + ", getUpperLimit()=" + getUpperLimit() + ", getLowerLimit()=" + getLowerLimit()
				+ ", getReportItemName()=" + getReportItemName() + ", getUnits()=" + getUnits() + ", getExaminaim()="
				+ getExaminaim() + ", getReportDoc()=" + getReportDoc() + ", getReportDocName()=" + getReportDocName()
				+ ", getExamineDocName()=" + getExamineDocName() + ", getPatientDept()=" + getPatientDept()
				+ ", getInpatientArea()=" + getInpatientArea() + ", getBedNo()=" + getBedNo() + ", getNursingUnit()="
				+ getNursingUnit() + ", getAttendingDoc()=" + getAttendingDoc() + ", getAttendingDocName()="
				+ getAttendingDocName() + ", getSeekMedicalTimes()=" + getSeekMedicalTimes()
				+ ", getServiceOrganization()=" + getServiceOrganization() + ", getBeHospitalized()="
				+ getBeHospitalized() + ", getOrderCode()=" + getOrderCode() + ", getOrderType()=" + getOrderType()
				+ ", getExamineDept()=" + getExamineDept() + ", getExamineDeptCode()=" + getExamineDeptCode()
				+ ", getXh()=" + getXh() + ", getApplicationNo()=" + getApplicationNo() + ", getReportNo()="
				+ getReportNo() + ", getTreatmentCode()=" + getTreatmentCode() + ", getReceiveTime()="
				+ getReceiveTime() + ", getSampleCode()=" + getSampleCode() + ", getSampleName()=" + getSampleName()
				+ ", getReportStatus()=" + getReportStatus() + ", getReportSheetName()=" + getReportSheetName()
				+ ", getErrorFlag()=" + getErrorFlag() + ", getReportType()=" + getReportType() + ", getExamineDoc()="
				+ getExamineDoc() + ", getJyjgId()=" + getJyjgId() + ", getJylx()=" + getJylx() + ", getJylxmc()="
				+ getJylxmc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
