package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class HspTpctInfQueryDto {

	private HspTpctInfCustom hspTpctInfCustom;

	private Date startdate;
	private Date enddate;
	private Date ctrDate;
	private String ctrDateString;
	//分页
	private PageQuery pageQuery;
	String sort;
	String order;
	

	
	public Date getCtrDate() {
		return ctrDate;
	}

	public void setCtrDate(Date ctrDate) {
		this.ctrDate = ctrDate;
	}

	public String getCtrDateString() {
		return ctrDateString;
	}

	public void setCtrDateString(String ctrDateString) {
		this.ctrDateString = ctrDateString;
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

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public HspTpctInfCustom getHspTpctInfCustom() {
		return hspTpctInfCustom;
	}

	public void setHspTpctInfCustom(HspTpctInfCustom hspTpctInfCustom) {
		this.hspTpctInfCustom = hspTpctInfCustom;
	}
	
	
}
