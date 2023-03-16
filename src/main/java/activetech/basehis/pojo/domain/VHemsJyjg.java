package activetech.basehis.pojo.domain;

import java.util.Date;

public class VHemsJyjg {

	private String patientId;
	private String name;
	private String sampleno;
	private Date resultDateTime; 
	private String result;
	private String upperLimit;
	private String lowerLimit;
	private String reportItemName;
	private String units;
	private String examinaim;
	private String sjys;
	private String jyz;
	private String shr;
	
	
	public String getSjys() {
		return sjys;
	}
	public void setSjys(String sjys) {
		this.sjys = sjys;
	}
	public String getJyz() {
		return jyz;
	}
	public void setJyz(String jyz) {
		this.jyz = jyz;
	}
	public String getShr() {
		return shr;
	}
	public void setShr(String shr) {
		this.shr = shr;
	}
	public String getExaminaim() {
		return examinaim;
	}
	public void setExaminaim(String examinaim) {
		this.examinaim = examinaim;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSampleno() {
		return sampleno;
	}
	public void setSampleno(String sampleno) {
		this.sampleno = sampleno;
	}
	
	public Date getResultDateTime() {
		return resultDateTime;
	}
	public void setResultDateTime(Date resultDateTime) {
		this.resultDateTime = resultDateTime;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getUpperLimit() {
		return upperLimit;
	}
	public void setUpperLimit(String upperLimit) {
		this.upperLimit = upperLimit;
	}
	public String getLowerLimit() {
		return lowerLimit;
	}
	public void setLowerLimit(String lowerLimit) {
		this.lowerLimit = lowerLimit;
	}
	public String getReportItemName() {
		return reportItemName;
	}
	public void setReportItemName(String reportItemName) {
		this.reportItemName = reportItemName;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	
	
}
