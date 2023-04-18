package activetech.basehis.pojo.dto;

import activetech.basehis.pojo.domain.VHemsJcjg;

import java.util.Date;


public class VHemsJcjgCustom extends VHemsJcjg{

	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    
    //浙江医院新增字段
    private String mpi;

    private String patientDept;

    private String seekMedicalTimes;

    private String serviceOrganization;

    private String orderCode;

    private String executionNo;

    private String executionDept;

    private String reportNo;

    private String treatmentCode;

    private String reportDoc;

    private String reportStatus;

    private String examineDoc;

    private String examineDocName;

    private String reportSheetName;

    private String errorFlag;

	private String applicationNo;


	public String getApplicationNo() {
		return applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getMpi() {
		return mpi;
	}
	public void setMpi(String mpi) {
		this.mpi = mpi;
	}
	public String getPatientDept() {
		return patientDept;
	}
	public void setPatientDept(String patientDept) {
		this.patientDept = patientDept;
	}
	public String getSeekMedicalTimes() {
		return seekMedicalTimes;
	}
	public void setSeekMedicalTimes(String seekMedicalTimes) {
		this.seekMedicalTimes = seekMedicalTimes;
	}
	public String getServiceOrganization() {
		return serviceOrganization;
	}
	public void setServiceOrganization(String serviceOrganization) {
		this.serviceOrganization = serviceOrganization;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getExecutionNo() {
		return executionNo;
	}
	public void setExecutionNo(String executionNo) {
		this.executionNo = executionNo;
	}
	public String getExecutionDept() {
		return executionDept;
	}
	public void setExecutionDept(String executionDept) {
		this.executionDept = executionDept;
	}
	public String getReportNo() {
		return reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}
	public String getTreatmentCode() {
		return treatmentCode;
	}
	public void setTreatmentCode(String treatmentCode) {
		this.treatmentCode = treatmentCode;
	}
	public String getReportDoc() {
		return reportDoc;
	}
	public void setReportDoc(String reportDoc) {
		this.reportDoc = reportDoc;
	}
	public String getReportStatus() {
		return reportStatus;
	}
	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
	}
	public String getExamineDoc() {
		return examineDoc;
	}
	public void setExamineDoc(String examineDoc) {
		this.examineDoc = examineDoc;
	}
	public String getExamineDocName() {
		return examineDocName;
	}
	public void setExamineDocName(String examineDocName) {
		this.examineDocName = examineDocName;
	}
	public String getReportSheetName() {
		return reportSheetName;
	}
	public void setReportSheetName(String reportSheetName) {
		this.reportSheetName = reportSheetName;
	}
	public String getErrorFlag() {
		return errorFlag;
	}
	public void setErrorFlag(String errorFlag) {
		this.errorFlag = errorFlag;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
    
    
}
