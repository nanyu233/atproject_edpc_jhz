package activetech.edpc.pojo.dto;


/**
 * 
 * 报表查询条件
 * @author ROG
 *
 */
public class ReportCondition {
	
	private String startDate;
	
	private String endDate;
	
	private String reportTypeFlag;
	
	private String startProCode;
	
	private String endProCode;

	public String getStartProCode() {
		return startProCode;
	}

	public void setStartProCode(String startProCode) {
		this.startProCode = startProCode;
	}

	public String getEndProCode() {
		return endProCode;
	}

	public void setEndProCode(String endProCode) {
		this.endProCode = endProCode;
	}

	public String getReportTypeFlag() {
		return reportTypeFlag;
	}

	public void setReportTypeFlag(String reportTypeFlag) {
		this.reportTypeFlag = reportTypeFlag;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
