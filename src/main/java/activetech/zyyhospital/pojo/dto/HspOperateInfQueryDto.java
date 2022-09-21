package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspOperateInfQueryDto {

	private HspOperateInfCustom hspOperateInfCustom;
	
	private String sort;
	
	private String order;
	//分页
	private PageQuery pageQuery;
	
	
	public HspOperateInfCustom getHspOperateInfCustom() {
		return hspOperateInfCustom;
	}
	public void setHspOperateInfCustom(HspOperateInfCustom hspOperateInfCustom) {
		this.hspOperateInfCustom = hspOperateInfCustom;
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
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
}
