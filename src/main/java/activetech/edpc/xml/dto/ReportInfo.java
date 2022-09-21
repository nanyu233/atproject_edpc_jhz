package activetech.edpc.xml.dto;

public class ReportInfo {
	private String PatientId;
	private String VisitId;
	private String PatientSource;
	private String OrgCode;
	private String Name;
	private String ReportFlow;
	private String ReportClassBelong;
	private String ReportClass;
	private String ReportName;
	private String PublishDate;
	private String ValidDateTimeFrom;
	private String PageOrention;
	private String PageSize;
	private String PageCount;
	private String PublishSystem;
	private String PerformedBy;
	private String ApplyFlow;
	private String Memo;
	private String Flag;
	private String FileDir;
	private String FileName;
	private String FileAccessPrefix;
	private String ImageFlow;
	private String ReportUrl;
	private String ReportSize;
	private String PublishDateStart;
	
	public ReportInfo(){
		
	}
	public ReportInfo(String PatientId,
						String PatientSource,
						String ReportClass,
						String ReportClassBelong,
						String PublishDateStart){
		this.PatientId = PatientId; 
		this.PatientSource = PatientSource; 
		this.ReportClass = ReportClass; 
		this.ReportClassBelong = ReportClassBelong; 
		this.PublishDateStart = PublishDateStart; 
	}
	
	public String getPublishDateStart() {
		return PublishDateStart;
	}
	public void setPublishDateStart(String publishDateStart) {
		PublishDateStart = publishDateStart;
	}
	public String getPatientId() {
		return PatientId;
	}
	public void setPatientId(String patientId) {
		PatientId = patientId;
	}
	public String getVisitId() {
		return VisitId;
	}
	public void setVisitId(String visitId) {
		VisitId = visitId;
	}
	public String getPatientSource() {
		return PatientSource;
	}
	public void setPatientSource(String patientSource) {
		PatientSource = patientSource;
	}
	public String getOrgCode() {
		return OrgCode;
	}
	public void setOrgCode(String orgCode) {
		OrgCode = orgCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getReportFlow() {
		return ReportFlow;
	}
	public void setReportFlow(String reportFlow) {
		ReportFlow = reportFlow;
	}
	public String getReportClassBelong() {
		return ReportClassBelong;
	}
	public void setReportClassBelong(String reportClassBelong) {
		ReportClassBelong = reportClassBelong;
	}
	public String getReportClass() {
		return ReportClass;
	}
	public void setReportClass(String reportClass) {
		ReportClass = reportClass;
	}
	public String getReportName() {
		return ReportName;
	}
	public void setReportName(String reportName) {
		ReportName = reportName;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public String getValidDateTimeFrom() {
		return ValidDateTimeFrom;
	}
	public void setValidDateTimeFrom(String validDateTimeFrom) {
		ValidDateTimeFrom = validDateTimeFrom;
	}
	public String getPageOrention() {
		return PageOrention;
	}
	public void setPageOrention(String pageOrention) {
		PageOrention = pageOrention;
	}
	public String getPageSize() {
		return PageSize;
	}
	public void setPageSize(String pageSize) {
		PageSize = pageSize;
	}
	public String getPageCount() {
		return PageCount;
	}
	public void setPageCount(String pageCount) {
		PageCount = pageCount;
	}
	public String getPublishSystem() {
		return PublishSystem;
	}
	public void setPublishSystem(String publishSystem) {
		PublishSystem = publishSystem;
	}
	public String getPerformedBy() {
		return PerformedBy;
	}
	public void setPerformedBy(String performedBy) {
		PerformedBy = performedBy;
	}
	public String getApplyFlow() {
		return ApplyFlow;
	}
	public void setApplyFlow(String applyFlow) {
		ApplyFlow = applyFlow;
	}
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String memo) {
		Memo = memo;
	}
	public String getFlag() {
		return Flag;
	}
	public void setFlag(String flag) {
		Flag = flag;
	}
	public String getFileDir() {
		return FileDir;
	}
	public void setFileDir(String fileDir) {
		FileDir = fileDir;
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	public String getFileAccessPrefix() {
		return FileAccessPrefix;
	}
	public void setFileAccessPrefix(String fileAccessPrefix) {
		FileAccessPrefix = fileAccessPrefix;
	}
	public String getImageFlow() {
		return ImageFlow;
	}
	public void setImageFlow(String imageFlow) {
		ImageFlow = imageFlow;
	}
	public String getReportUrl() {
		return ReportUrl;
	}
	public void setReportUrl(String reportUrl) {
		ReportUrl = reportUrl;
	}
	public String getReportSize() {
		return ReportSize;
	}
	public void setReportSize(String reportSize) {
		ReportSize = reportSize;
	}
	
}
