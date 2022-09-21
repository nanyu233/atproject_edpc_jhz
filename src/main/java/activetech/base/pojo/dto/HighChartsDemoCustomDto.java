package activetech.base.pojo.dto;

import java.util.Date;

public class HighChartsDemoCustomDto {

	private HighChartsDemoCustom highChartsDemoCustom;
	private PageQuery pageQuery;
	
	private Date starttime;
	private Date endtime;
	private String querytype;

	public HighChartsDemoCustom getHighChartsDemoCustom() {
		return highChartsDemoCustom;
	}

	public void setHighChartsDemoCustom(HighChartsDemoCustom highChartsDemoCustom) {
		this.highChartsDemoCustom = highChartsDemoCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public Date getStarttime() {
		return starttime;
	}

	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}

	public String getQuerytype() {
		return querytype;
	}

	public void setQuerytype(String querytype) {
		this.querytype = querytype;
	}
	
}
