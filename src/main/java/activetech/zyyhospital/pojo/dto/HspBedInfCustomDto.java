package activetech.zyyhospital.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class HspBedInfCustomDto {
	private HspBedInfCustom hspBedInfCustom;
	//分页
	private PageQuery pageQuery;
	
	private String islgbed;//是否开启留观标志 0：否 1 是

	
	public String getIslgbed() {
		return islgbed;
	}

	public void setIslgbed(String islgbed) {
		this.islgbed = islgbed;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public HspBedInfCustom getHspBedInfCustom() {
		return hspBedInfCustom;
	}

	public void setHspBedInfCustom(HspBedInfCustom hspBedInfCustom) {
		this.hspBedInfCustom = hspBedInfCustom;
	}

}
