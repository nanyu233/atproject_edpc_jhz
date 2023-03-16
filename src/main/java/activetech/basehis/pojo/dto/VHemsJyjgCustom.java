package activetech.basehis.pojo.dto;

import activetech.basehis.pojo.domain.VHemsJyjg;

import java.util.Date;
import java.util.List;


public class VHemsJyjgCustom extends VHemsJyjg{

	private Date startdate;//查询开始时间
    private Date enddate;//结束时间
    private String rownums;
    private List<VHemsJyjgCustom> vlist;
    private List<VHemsJyjgCustom> sonList;//危急值子List
    private String mark;
    private String sign;//乘号
    
    //浙江医院新增字段
    private String mpi;
    
    private String patientDept;

    private String inpatientArea;

    private String bedNo;

    private String nursingUnit;

    private String attendingDoc;

    private String attendingDocName;

    private String seekMedicalTimes;

    private String serviceOrganization;

    private Date beHospitalized;

    private String orderCode;

    private String orderType;

    private String examineDept;

    private String examineDeptCode;

    private String xh;

    private String applicationNo;

    private String reportNo;

    private String treatmentCode;

    private Date receiveTime;//样本接收时间

    private String sampleCode;

    private String sampleName;

    private String reportStatus;

    private String reportSheetName;

    private String errorFlag;

    private String reportType;

    private String examineDoc;

    private String jyjgId;
    
    private String jylx;
    
    private String jylxmc;
    
    /**
     * 样本采样时间
     */
    private Date samplingTime;
    
    //德清医院新增字段
    private String laboratoryItemReferenceRangeDetail;//参考区间范围
    
	public String getLaboratoryItemReferenceRangeDetail() {
		return laboratoryItemReferenceRangeDetail;
	}
	public void setLaboratoryItemReferenceRangeDetail(String laboratoryItemReferenceRangeDetail) {
		this.laboratoryItemReferenceRangeDetail = laboratoryItemReferenceRangeDetail;
	}
	public Date getSamplingTime() {
		return samplingTime;
	}
	public void setSamplingTime(Date samplingTime) {
		this.samplingTime = samplingTime;
	}
	public String getMpi() {
		return mpi;
	}
	public void setMpi(String mpi) {
		this.mpi = mpi;
	}
	public List<VHemsJyjgCustom> getSonList() {
		return sonList;
	}
	public void setSonList(List<VHemsJyjgCustom> sonList) {
		this.sonList = sonList;
	}
	public String getPatientDept() {
		return patientDept;
	}
	public void setPatientDept(String patientDept) {
		this.patientDept = patientDept;
	}
	public String getInpatientArea() {
		return inpatientArea;
	}
	public void setInpatientArea(String inpatientArea) {
		this.inpatientArea = inpatientArea;
	}
	public String getBedNo() {
		return bedNo;
	}
	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}
	public String getNursingUnit() {
		return nursingUnit;
	}
	public void setNursingUnit(String nursingUnit) {
		this.nursingUnit = nursingUnit;
	}
	public String getAttendingDoc() {
		return attendingDoc;
	}
	public void setAttendingDoc(String attendingDoc) {
		this.attendingDoc = attendingDoc;
	}
	public String getAttendingDocName() {
		return attendingDocName;
	}
	public void setAttendingDocName(String attendingDocName) {
		this.attendingDocName = attendingDocName;
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
	public Date getBeHospitalized() {
		return beHospitalized;
	}
	public void setBeHospitalized(Date beHospitalized) {
		this.beHospitalized = beHospitalized;
	}
	public String getOrderCode() {
		return orderCode;
	}
	public void setOrderCode(String orderCode) {
		this.orderCode = orderCode;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getExamineDept() {
		return examineDept;
	}
	public void setExamineDept(String examineDept) {
		this.examineDept = examineDept;
	}
	public String getExamineDeptCode() {
		return examineDeptCode;
	}
	public void setExamineDeptCode(String examineDeptCode) {
		this.examineDeptCode = examineDeptCode;
	}
	public String getXh() {
		return xh;
	}
	public void setXh(String xh) {
		this.xh = xh;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
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
	public Date getReceiveTime() {
		return receiveTime;
	}
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}
	public String getSampleCode() {
		return sampleCode;
	}
	public void setSampleCode(String sampleCode) {
		this.sampleCode = sampleCode;
	}
	public String getSampleName() {
		return sampleName;
	}
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	public String getReportStatus() {
		return reportStatus;
	}
	public void setReportStatus(String reportStatus) {
		this.reportStatus = reportStatus;
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
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getExamineDoc() {
		return examineDoc;
	}
	public void setExamineDoc(String examineDoc) {
		this.examineDoc = examineDoc;
	}
	public String getJyjgId() {
		return jyjgId;
	}
	public void setJyjgId(String jyjgId) {
		this.jyjgId = jyjgId;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public List<VHemsJyjgCustom> getVlist() {
		return vlist;
	}
	public void setVlist(List<VHemsJyjgCustom> vlist) {
		this.vlist = vlist;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getRownums() {
		return rownums;
	}
	public void setRownums(String rownums) {
		this.rownums = rownums;
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
	public String getJylx() {
		return jylx;
	}
	public void setJylx(String jylx) {
		this.jylx = jylx;
	}
	public String getJylxmc() {
		return jylxmc;
	}
	public void setJylxmc(String jylxmc) {
		this.jylxmc = jylxmc;
	}
    
}
