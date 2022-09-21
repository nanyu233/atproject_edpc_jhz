package activetech.external.pojo.dto;

import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.dto.HspemginfCustom;

public class HspJyjgQueryDto {

	private HspJyjgCustom hspJyjgCustom;
	private HspemginfCustom hspemginfCustom;
	//分页
	private PageQuery pageQuery;
	String sort;
	String order;
		
	public HspJyjgCustom getHspJyjgCustom() {
		return hspJyjgCustom;
	}
	public void setHspJyjgCustom(HspJyjgCustom hspJyjgCustom) {
		this.hspJyjgCustom = hspJyjgCustom;
	}
	public HspemginfCustom getHspemginfCustom() {
		return hspemginfCustom;
	}
	public void setHspemginfCustom(HspemginfCustom hspemginfCustom) {
		this.hspemginfCustom = hspemginfCustom;
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
	
	
}
