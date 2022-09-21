package activetech.zyyhospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class HspNrsconsentInfQueryDto {
	private HspNrsconsentInfCustom hspNrsconsentInfCustom;
	//分页
	private PageQuery pageQuery;
	
	private Date startdate;
	private Date enddate;
	
	public HspNrsconsentInfCustom getHspNrsconsentInfCustom() {
		return hspNrsconsentInfCustom;
	}
	public void setHspNrsconsentInfCustom(HspNrsconsentInfCustom hspNrsconsentInfCustom) {
		this.hspNrsconsentInfCustom = hspNrsconsentInfCustom;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
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
