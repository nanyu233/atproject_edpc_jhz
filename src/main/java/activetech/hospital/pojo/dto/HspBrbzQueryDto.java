package activetech.hospital.pojo.dto;

import java.util.Date;
import java.util.List;

import activetech.base.pojo.dto.PageQuery;


public class HspBrbzQueryDto {

	private HspBrbzCustom hspBrbzCustom ;
	
	private List<String> brbzIdList;
	
	private Date time ;
	
	private PageQuery pageQuery;
	
	//查询方式
	private String querytype;
	//开始时间
	private Date startdate;
	//结束时间
	private Date enddate;
	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public List<String> getBrbzIdList() {
		return brbzIdList;
	}

	public void setBrbzIdList(List<String> brbzIdList) {
		this.brbzIdList = brbzIdList;
	}

	public HspBrbzCustom getHspBrbzCustom() {
		return hspBrbzCustom;
	}

	public void setHspBrbzCustom(HspBrbzCustom hspBrbzCustom) {
		this.hspBrbzCustom = hspBrbzCustom;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}
	
	public String getQuerytype() {
		return querytype;
	}
	
	public void setQuerytype(String queryType) {
		this.querytype = queryType;
	}
	
	public Date getStartdate() {
		return startdate;
	}
	
	public void setStartdate(Date startDate) {
		this.startdate = startDate;
	}
	
	public Date getEnddate() {
		return enddate;
	}
	
	public void setEnddate(Date endDate) {
		this.enddate = endDate;
	}
}
