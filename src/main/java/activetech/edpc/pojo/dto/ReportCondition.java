package activetech.edpc.pojo.dto;


import java.util.List;

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
	/**
	 * 报表导出用 字段集合
	 */
	private List<String> fieldCodes;
	/**
	 * 报表导出用 字段对应title集合
	 */
	private List<String> fieldNames;
	/**
	 * 报表导出用 文件名字前缀 H1标题
	 */
	private String fileName;
	/**
	 * 报表导出用 是否计算比例 默认否
	 */
	private boolean claFlg;

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

	public List<String> getFieldCodes() {
		return fieldCodes;
	}

	public void setFieldCodes(List<String> fieldCodes) {
		this.fieldCodes = fieldCodes;
	}

	public List<String> getFieldNames() {
		return fieldNames;
	}

	public void setFieldNames(List<String> fieldNames) {
		this.fieldNames = fieldNames;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public boolean isClaFlg() {
		return claFlg;
	}

	public void setClaFlg(boolean claFlg) {
		this.claFlg = claFlg;
	}
}
