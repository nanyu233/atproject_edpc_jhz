package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspCxfxpgbCustomDto {

	// 分页
	private PageQuery pageQuery;
	String sort;
	String order;
	
	private HspCxfxpgbCustom hspCxfxpgbCustom;


	private String jsonList;

	public String getJsonList() {
		return jsonList;
	}

	public void setJsonList(String jsonList) {
		this.jsonList = jsonList;
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

	public HspCxfxpgbCustom getHspCxfxpgbCustom() {
		return hspCxfxpgbCustom;
	}

	public void setHspCxfxpgbCustom(HspCxfxpgbCustom hspCxfxpgbCustom) {
		this.hspCxfxpgbCustom = hspCxfxpgbCustom;
	}

}
