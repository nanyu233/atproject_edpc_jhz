package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspFavoritesInfCustomDto {
	private HspFavoritesInfCustom hspFavoritesInfCustom;
	//分页
	private PageQuery pageQuery;

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public HspFavoritesInfCustom getHspFavoritesInfCustom() {
		return hspFavoritesInfCustom;
	}

	public void setHspFavoritesInfCustom(HspFavoritesInfCustom hspFavoritesInfCustom) {
		this.hspFavoritesInfCustom = hspFavoritesInfCustom;
	}
	
}
