package activetech.hospital.pojo.dto;

import java.util.List;

import activetech.base.pojo.domain.Dstuser;
import activetech.base.pojo.dto.PageQuery;
import activetech.hospital.pojo.domain.HspSco;

public class HspScoCustomDto {
	
	private HspScoCustom hspScoCustom;
	
	//分页
	private PageQuery pageQuery;
	
	//查询条件
	private String sort;
	
	private String order;
	
	
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

	public HspScoCustom getHspScoCustom() {
		return hspScoCustom;
	}

	public void setHspScoCustom(HspScoCustom hspScoCustom) {
		this.hspScoCustom = hspScoCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	

}
