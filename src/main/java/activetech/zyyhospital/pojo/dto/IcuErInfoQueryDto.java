package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class IcuErInfoQueryDto {

	private IcuErInfoCustom icuErInfoCustom;
	private PageQuery pageQuery;
	
	private Date startdate;//开始时间
    private Date enddate;//结束时间
	
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
	public IcuErInfoCustom getIcuErInfoCustom() {
		return icuErInfoCustom;
	}
	public void setIcuErInfoCustom(IcuErInfoCustom icuErInfoCustom) {
		this.icuErInfoCustom = icuErInfoCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
}
