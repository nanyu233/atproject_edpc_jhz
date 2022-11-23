package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspConsentTempCustomDto {
	private PageQuery pageQuery;
	private HspConsentTempCustom hspConsentTempCustom;
	private String tempCode;
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public HspConsentTempCustom getHspConsentTempCustom() {
		return hspConsentTempCustom;
	}
	public void setHspConsentTempCustom(HspConsentTempCustom hspConsentTempCustom) {
		this.hspConsentTempCustom = hspConsentTempCustom;
	}

	public String getTempCode() {
		return tempCode;
	}

	public void setTempCode(String tempCode) {
		this.tempCode = tempCode;
	}
}
