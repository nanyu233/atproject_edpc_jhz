package activetech.edpc.xml.dto;

import java.util.List;

public class MessageBody {
	private Result Result;
	private List<ReportInfo> ReportInfos;
	private ReportInfo ReportInfo;
	public ReportInfo getReportInfo() {
		return ReportInfo;
	}
	public void setReportInfo(ReportInfo reportInfo) {
		ReportInfo = reportInfo;
	}
	public Result getResult() {
		return Result;
	}
	public void setResult(Result result) {
		Result = result;
	}
	public List<ReportInfo> getReportInfos() {
		return ReportInfos;
	}
	public void setReportInfos(List<ReportInfo> reportInfos) {
		ReportInfos = reportInfos;
	}	
	
}
