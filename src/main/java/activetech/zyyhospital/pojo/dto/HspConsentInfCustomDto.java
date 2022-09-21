package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspConsentInfCustomDto {
	private HspConsentInfCustom hspConsentInfCustom;
	//分页
	private PageQuery pageQuery;

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public HspConsentInfCustom getHspConsentInfCustom() {
		return hspConsentInfCustom;
	}

	public void setHspConsentInfCustom(HspConsentInfCustom hspConsentInfCustom) {
		this.hspConsentInfCustom = hspConsentInfCustom;
	}
}
