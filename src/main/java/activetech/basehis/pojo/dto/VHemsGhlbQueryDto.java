package activetech.basehis.pojo.dto;

import activetech.base.pojo.dto.PageQuery;

public class VHemsGhlbQueryDto {
	private VHemsGhlbCustom vHemsGhlbCustom;
	
	private PageQuery pageQuery;

	public VHemsGhlbCustom getvHemsGhlbCustom() {
		return vHemsGhlbCustom;
	}

	public void setvHemsGhlbCustom(VHemsGhlbCustom vHemsGhlbCustom) {
		this.vHemsGhlbCustom = vHemsGhlbCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	
}
