package activetech.hospital.pojo.dto;

import java.util.Date;

import activetech.base.pojo.dto.PageQuery;

public class HspJbzdInfQueryDto {

	private HspJbzdInfCustom hspJbzdInfCustom;
	private HspHzjbzdCustom hspHzjbzdCustom;
	private HspOperationDictCustom hspOperationDictCustom;
	//分页
	private PageQuery pageQuery;
		
	private Date startdate;
	private Date enddate;
	
	
	public HspOperationDictCustom getHspOperationDictCustom() {
		return hspOperationDictCustom;
	}
	public void setHspOperationDictCustom(HspOperationDictCustom hspOperationDictCustom) {
		this.hspOperationDictCustom = hspOperationDictCustom;
	}
	public HspJbzdInfCustom getHspJbzdInfCustom() {
		return hspJbzdInfCustom;
	}
	public void setHspJbzdInfCustom(HspJbzdInfCustom hspJbzdInfCustom) {
		this.hspJbzdInfCustom = hspJbzdInfCustom;
	}
	public HspHzjbzdCustom getHspHzjbzdCustom() {
		return hspHzjbzdCustom;
	}
	public void setHspHzjbzdCustom(HspHzjbzdCustom hspHzjbzdCustom) {
		this.hspHzjbzdCustom = hspHzjbzdCustom;
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
